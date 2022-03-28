package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiTouchController.class */
public class MultiTouchController<T> {
    private static int ACTION_POINTER_INDEX_SHIFT = 0;
    private static int ACTION_POINTER_UP = 0;
    private static final boolean DEBUG = false;
    private static final long EVENT_SETTLE_TIME_INTERVAL = 20;
    private static final float MAX_MULTITOUCH_DIM_JUMP_SIZE = 40.0f;
    private static final float MAX_MULTITOUCH_POS_JUMP_SIZE = 30.0f;
    public static final int MAX_TOUCH_POINTS = 10;
    private static final float MIN_MULTITOUCH_SEPARATION = 30.0f;
    private static final int MODE_DRAG = 1;
    private static final int MODE_NOTHING = 0;
    private static final int MODE_PINCH = 2;
    private static Method m_findPointerIndex;
    private static Method m_getHistoricalPressure;
    private static Method m_getHistoricalX;
    private static Method m_getHistoricalY;
    private static Method m_getPointerCount;
    private static Method m_getPressure;
    private static Method m_getX;
    private static Method m_getY;
    public static final boolean multiTouchSupported;
    private static final int[] pointerIdxs;
    private static final float[] pressureVals;
    private static final float[] xVals;
    private static final float[] yVals;
    private boolean handleSingleTouchEvents;
    private PointInfo mCurrPt;
    private float mCurrPtAng;
    private float mCurrPtDiam;
    private float mCurrPtHeight;
    private float mCurrPtWidth;
    private float mCurrPtX;
    private float mCurrPtY;
    private PositionAndScale mCurrXform;
    private int mMode;
    private PointInfo mPrevPt;
    private long mSettleEndTime;
    private long mSettleStartTime;
    MultiTouchObjectCanvas<T> objectCanvas;
    private T selectedObject;
    private float startAngleMinusPinchAngle;
    private float startPosX;
    private float startPosY;
    private float startScaleOverPinchDiam;
    private float startScaleXOverPinchWidth;
    private float startScaleYOverPinchHeight;

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiTouchController$MultiTouchObjectCanvas.class */
    public interface MultiTouchObjectCanvas<T> {
        T getDraggableObjectAtPoint(PointInfo pointInfo);

        void getPositionAndScale(T t, PositionAndScale positionAndScale);

        void selectObject(T t, PointInfo pointInfo);

        boolean setPositionAndScale(T t, PositionAndScale positionAndScale, PointInfo pointInfo);
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiTouchController$PointInfo.class */
    public static class PointInfo {
        private int action;
        private float angle;
        private boolean angleIsCalculated;
        private float diameter;
        private boolean diameterIsCalculated;
        private float diameterSq;
        private boolean diameterSqIsCalculated;
        private float dx;
        private float dy;
        private long eventTime;
        private boolean isDown;
        private boolean isMultiTouch;
        private int numPoints;
        private float pressureMid;
        private float xMid;
        private float yMid;
        private float[] xs = new float[10];
        private float[] ys = new float[10];
        private float[] pressures = new float[10];
        private int[] pointerIdxs = new int[10];

        private int julery_isqrt(int i) {
            int i2 = 0;
            int i3 = 32768;
            int i4 = 15;
            int i5 = i;
            while (true) {
                int i6 = ((i2 << 1) + i3) << i4;
                int i7 = i2;
                i5 = i5;
                if (i5 >= i6) {
                    i7 = i2 + i3;
                    i5 -= i6;
                }
                i3 >>= 1;
                if (i3 <= 0) {
                    return i7;
                }
                i4--;
                i2 = i7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
            this.eventTime = j;
            this.action = i2;
            this.numPoints = i;
            for (int i3 = 0; i3 < i; i3++) {
                this.xs[i3] = fArr[i3];
                this.ys[i3] = fArr2[i3];
                this.pressures[i3] = fArr3[i3];
                this.pointerIdxs[i3] = iArr[i3];
            }
            this.isDown = z;
            this.isMultiTouch = i >= 2;
            if (this.isMultiTouch) {
                this.xMid = (fArr[0] + fArr[1]) * 0.5f;
                this.yMid = (fArr2[0] + fArr2[1]) * 0.5f;
                this.pressureMid = (fArr3[0] + fArr3[1]) * 0.5f;
                this.dx = Math.abs(fArr[1] - fArr[0]);
                this.dy = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.xMid = fArr[0];
                this.yMid = fArr2[0];
                this.pressureMid = fArr3[0];
                this.dy = 0.0f;
                this.dx = 0.0f;
            }
            this.angleIsCalculated = false;
            this.diameterIsCalculated = false;
            this.diameterSqIsCalculated = false;
        }

        public int getAction() {
            return this.action;
        }

        public long getEventTime() {
            return this.eventTime;
        }

        public float getMultiTouchAngle() {
            if (!this.angleIsCalculated) {
                if (!this.isMultiTouch) {
                    this.angle = 0.0f;
                } else {
                    this.angle = (float) Math.atan2(this.ys[1] - this.ys[0], this.xs[1] - this.xs[0]);
                }
                this.angleIsCalculated = true;
            }
            return this.angle;
        }

        public float getMultiTouchDiameter() {
            if (!this.diameterIsCalculated) {
                if (!this.isMultiTouch) {
                    this.diameter = 0.0f;
                } else {
                    float multiTouchDiameterSq = getMultiTouchDiameterSq();
                    this.diameter = multiTouchDiameterSq == 0.0f ? 0.0f : julery_isqrt((int) (256.0f * multiTouchDiameterSq)) / 16.0f;
                    if (this.diameter < this.dx) {
                        this.diameter = this.dx;
                    }
                    if (this.diameter < this.dy) {
                        this.diameter = this.dy;
                    }
                }
                this.diameterIsCalculated = true;
            }
            return this.diameter;
        }

        public float getMultiTouchDiameterSq() {
            if (!this.diameterSqIsCalculated) {
                this.diameterSq = this.isMultiTouch ? (this.dx * this.dx) + (this.dy * this.dy) : 0.0f;
                this.diameterSqIsCalculated = true;
            }
            return this.diameterSq;
        }

        public float getMultiTouchHeight() {
            return this.isMultiTouch ? this.dy : 0.0f;
        }

        public float getMultiTouchWidth() {
            return this.isMultiTouch ? this.dx : 0.0f;
        }

        public int getNumTouchPoints() {
            return this.numPoints;
        }

        public int[] getPointerIndices() {
            return this.pointerIdxs;
        }

        public float getPressure() {
            return this.pressureMid;
        }

        public float[] getPressures() {
            return this.pressures;
        }

        public float getX() {
            return this.xMid;
        }

        public float[] getXs() {
            return this.xs;
        }

        public float getY() {
            return this.yMid;
        }

        public float[] getYs() {
            return this.ys;
        }

        public boolean isDown() {
            return this.isDown;
        }

        public boolean isMultiTouch() {
            return this.isMultiTouch;
        }

        public void set(PointInfo pointInfo) {
            this.numPoints = pointInfo.numPoints;
            for (int i = 0; i < this.numPoints; i++) {
                this.xs[i] = pointInfo.xs[i];
                this.ys[i] = pointInfo.ys[i];
                this.pressures[i] = pointInfo.pressures[i];
                this.pointerIdxs[i] = pointInfo.pointerIdxs[i];
            }
            this.xMid = pointInfo.xMid;
            this.yMid = pointInfo.yMid;
            this.pressureMid = pointInfo.pressureMid;
            this.dx = pointInfo.dx;
            this.dy = pointInfo.dy;
            this.diameter = pointInfo.diameter;
            this.diameterSq = pointInfo.diameterSq;
            this.angle = pointInfo.angle;
            this.isDown = pointInfo.isDown;
            this.action = pointInfo.action;
            this.isMultiTouch = pointInfo.isMultiTouch;
            this.diameterIsCalculated = pointInfo.diameterIsCalculated;
            this.diameterSqIsCalculated = pointInfo.diameterSqIsCalculated;
            this.angleIsCalculated = pointInfo.angleIsCalculated;
            this.eventTime = pointInfo.eventTime;
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/MultiTouchController$PositionAndScale.class */
    public static class PositionAndScale {
        private float angle;
        private float scale;
        private float scaleX;
        private float scaleY;
        private boolean updateAngle;
        private boolean updateScale;
        private boolean updateScaleXY;
        private float xOff;
        private float yOff;

        public float getAngle() {
            return !this.updateAngle ? 0.0f : this.angle;
        }

        public float getScale() {
            return !this.updateScale ? 1.0f : this.scale;
        }

        public float getScaleX() {
            return !this.updateScaleXY ? 1.0f : this.scaleX;
        }

        public float getScaleY() {
            return !this.updateScaleXY ? 1.0f : this.scaleY;
        }

        public float getXOff() {
            return this.xOff;
        }

        public float getYOff() {
            return this.yOff;
        }

        protected void set(float f, float f2, float f3, float f4, float f5, float f6) {
            this.xOff = f;
            this.yOff = f2;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.scale = f3;
            this.scaleX = f4 == 0.0f ? 1.0f : f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.scaleY = f5;
            this.angle = f6;
        }

        public void set(float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, boolean z3, float f6) {
            this.xOff = f;
            this.yOff = f2;
            this.updateScale = z;
            this.scale = f3 == 0.0f ? 1.0f : f3;
            this.updateScaleXY = z2;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.scaleX = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.scaleY = f5;
            this.updateAngle = z3;
            this.angle = f6;
        }
    }

    static {
        ACTION_POINTER_UP = 6;
        ACTION_POINTER_INDEX_SHIFT = 8;
        boolean z = false;
        try {
            m_getPointerCount = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            m_findPointerIndex = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            m_getPressure = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            m_getHistoricalX = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            m_getHistoricalY = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            m_getHistoricalPressure = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            m_getX = MotionEvent.class.getMethod("getX", Integer.TYPE);
            m_getY = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e) {
            Log.e("MultiTouchController", "static initializer failed", e);
        }
        multiTouchSupported = z;
        if (multiTouchSupported) {
            try {
                ACTION_POINTER_UP = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                ACTION_POINTER_INDEX_SHIFT = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e2) {
            }
        }
        xVals = new float[10];
        yVals = new float[10];
        pressureVals = new float[10];
        pointerIdxs = new int[10];
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas) {
        this(multiTouchObjectCanvas, true);
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas, boolean z) {
        this.selectedObject = null;
        this.mCurrXform = new PositionAndScale();
        this.mMode = 0;
        this.mCurrPt = new PointInfo();
        this.mPrevPt = new PointInfo();
        this.handleSingleTouchEvents = z;
        this.objectCanvas = multiTouchObjectCanvas;
    }

    private void anchorAtThisPositionAndScale() {
        if (this.selectedObject != null) {
            this.objectCanvas.getPositionAndScale(this.selectedObject, this.mCurrXform);
            float f = 1.0f / (!this.mCurrXform.updateScale ? 1.0f : this.mCurrXform.scale == 0.0f ? 1.0f : this.mCurrXform.scale);
            extractCurrPtInfo();
            this.startPosX = (this.mCurrPtX - this.mCurrXform.xOff) * f;
            this.startPosY = (this.mCurrPtY - this.mCurrXform.yOff) * f;
            this.startScaleOverPinchDiam = this.mCurrXform.scale / this.mCurrPtDiam;
            this.startScaleXOverPinchWidth = this.mCurrXform.scaleX / this.mCurrPtWidth;
            this.startScaleYOverPinchHeight = this.mCurrXform.scaleY / this.mCurrPtHeight;
            this.startAngleMinusPinchAngle = this.mCurrXform.angle - this.mCurrPtAng;
        }
    }

    private void decodeTouchEvent(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
        PointInfo pointInfo = this.mPrevPt;
        this.mPrevPt = this.mCurrPt;
        this.mCurrPt = pointInfo;
        this.mCurrPt.set(i, fArr, fArr2, fArr3, iArr, i2, z, j);
        multiTouchController();
    }

    private void extractCurrPtInfo() {
        this.mCurrPtX = this.mCurrPt.getX();
        this.mCurrPtY = this.mCurrPt.getY();
        this.mCurrPtDiam = Math.max(21.3f, !this.mCurrXform.updateScale ? 0.0f : this.mCurrPt.getMultiTouchDiameter());
        this.mCurrPtWidth = Math.max(30.0f, !this.mCurrXform.updateScaleXY ? 0.0f : this.mCurrPt.getMultiTouchWidth());
        this.mCurrPtHeight = Math.max(30.0f, !this.mCurrXform.updateScaleXY ? 0.0f : this.mCurrPt.getMultiTouchHeight());
        this.mCurrPtAng = !this.mCurrXform.updateAngle ? 0.0f : this.mCurrPt.getMultiTouchAngle();
    }

    private void multiTouchController() {
        switch (this.mMode) {
            case 0:
                if (this.mCurrPt.isDown()) {
                    this.selectedObject = this.objectCanvas.getDraggableObjectAtPoint(this.mCurrPt);
                    if (this.selectedObject != null) {
                        this.mMode = 1;
                        this.objectCanvas.selectObject(this.selectedObject, this.mCurrPt);
                        anchorAtThisPositionAndScale();
                        long eventTime = this.mCurrPt.getEventTime();
                        this.mSettleEndTime = eventTime;
                        this.mSettleStartTime = eventTime;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!this.mCurrPt.isDown()) {
                    this.mMode = 0;
                    MultiTouchObjectCanvas<T> multiTouchObjectCanvas = this.objectCanvas;
                    this.selectedObject = null;
                    multiTouchObjectCanvas.selectObject(null, this.mCurrPt);
                    return;
                } else if (this.mCurrPt.isMultiTouch()) {
                    this.mMode = 2;
                    anchorAtThisPositionAndScale();
                    this.mSettleStartTime = this.mCurrPt.getEventTime();
                    this.mSettleEndTime = this.mSettleStartTime + EVENT_SETTLE_TIME_INTERVAL;
                    return;
                } else if (this.mCurrPt.getEventTime() < this.mSettleEndTime) {
                    anchorAtThisPositionAndScale();
                    return;
                } else {
                    performDragOrPinch();
                    return;
                }
            case 2:
                if (!this.mCurrPt.isMultiTouch() || !this.mCurrPt.isDown()) {
                    if (!this.mCurrPt.isDown()) {
                        this.mMode = 0;
                        MultiTouchObjectCanvas<T> multiTouchObjectCanvas2 = this.objectCanvas;
                        this.selectedObject = null;
                        multiTouchObjectCanvas2.selectObject(null, this.mCurrPt);
                        return;
                    }
                    this.mMode = 1;
                    anchorAtThisPositionAndScale();
                    this.mSettleStartTime = this.mCurrPt.getEventTime();
                    this.mSettleEndTime = this.mSettleStartTime + EVENT_SETTLE_TIME_INTERVAL;
                    return;
                } else if (Math.abs(this.mCurrPt.getX() - this.mPrevPt.getX()) > 30.0f || Math.abs(this.mCurrPt.getY() - this.mPrevPt.getY()) > 30.0f || Math.abs(this.mCurrPt.getMultiTouchWidth() - this.mPrevPt.getMultiTouchWidth()) * 0.5f > MAX_MULTITOUCH_DIM_JUMP_SIZE || Math.abs(this.mCurrPt.getMultiTouchHeight() - this.mPrevPt.getMultiTouchHeight()) * 0.5f > MAX_MULTITOUCH_DIM_JUMP_SIZE) {
                    anchorAtThisPositionAndScale();
                    this.mSettleStartTime = this.mCurrPt.getEventTime();
                    this.mSettleEndTime = this.mSettleStartTime + EVENT_SETTLE_TIME_INTERVAL;
                    return;
                } else if (this.mCurrPt.eventTime < this.mSettleEndTime) {
                    anchorAtThisPositionAndScale();
                    return;
                } else {
                    performDragOrPinch();
                    return;
                }
            default:
                return;
        }
    }

    private void performDragOrPinch() {
        if (this.selectedObject != null) {
            float f = !this.mCurrXform.updateScale ? 1.0f : this.mCurrXform.scale == 0.0f ? 1.0f : this.mCurrXform.scale;
            extractCurrPtInfo();
            this.mCurrXform.set(this.mCurrPtX - (this.startPosX * f), this.mCurrPtY - (this.startPosY * f), this.startScaleOverPinchDiam * this.mCurrPtDiam, this.startScaleXOverPinchWidth * this.mCurrPtWidth, this.startScaleYOverPinchHeight * this.mCurrPtHeight, this.startAngleMinusPinchAngle + this.mCurrPtAng);
            if (!this.objectCanvas.setPositionAndScale(this.selectedObject, this.mCurrXform, this.mCurrPt)) {
            }
        }
    }

    protected boolean getHandleSingleTouchEvents() {
        return this.handleSingleTouchEvents;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            int intValue = multiTouchSupported ? ((Integer) m_getPointerCount.invoke(motionEvent, new Object[0])).intValue() : 1;
            if (this.mMode == 0 && !this.handleSingleTouchEvents && intValue == 1) {
                z = false;
            } else {
                int action = motionEvent.getAction();
                int historySize = motionEvent.getHistorySize() / intValue;
                int i = 0;
                while (i <= historySize) {
                    boolean z2 = i < historySize;
                    if (!multiTouchSupported || intValue == 1) {
                        xVals[0] = z2 ? motionEvent.getHistoricalX(i) : motionEvent.getX();
                        yVals[0] = z2 ? motionEvent.getHistoricalY(i) : motionEvent.getY();
                        pressureVals[0] = z2 ? motionEvent.getHistoricalPressure(i) : motionEvent.getPressure();
                    } else {
                        int min = Math.min(intValue, 10);
                        for (int i2 = 0; i2 < min; i2++) {
                            int intValue2 = ((Integer) m_findPointerIndex.invoke(motionEvent, Integer.valueOf(i2))).intValue();
                            pointerIdxs[i2] = intValue2;
                            xVals[i2] = ((Float) (z2 ? m_getHistoricalX.invoke(motionEvent, Integer.valueOf(intValue2), Integer.valueOf(i)) : m_getX.invoke(motionEvent, Integer.valueOf(intValue2)))).floatValue();
                            yVals[i2] = ((Float) (z2 ? m_getHistoricalY.invoke(motionEvent, Integer.valueOf(intValue2), Integer.valueOf(i)) : m_getY.invoke(motionEvent, Integer.valueOf(intValue2)))).floatValue();
                            pressureVals[i2] = ((Float) (z2 ? m_getHistoricalPressure.invoke(motionEvent, Integer.valueOf(intValue2), Integer.valueOf(i)) : m_getPressure.invoke(motionEvent, Integer.valueOf(intValue2)))).floatValue();
                        }
                    }
                    decodeTouchEvent(intValue, xVals, yVals, pressureVals, pointerIdxs, z2 ? 2 : action, z2 ? true : (action == 1 || (((1 << ACTION_POINTER_INDEX_SHIFT) - 1) & action) == ACTION_POINTER_UP || action == 3) ? false : true, z2 ? motionEvent.getHistoricalEventTime(i) : motionEvent.getEventTime());
                    i++;
                }
                z = true;
            }
        } catch (Exception e) {
            Log.e("MultiTouchController", "onTouchEvent() failed", e);
            z = false;
        }
        return z;
    }

    protected void setHandleSingleTouchEvents(boolean z) {
        this.handleSingleTouchEvents = z;
    }
}

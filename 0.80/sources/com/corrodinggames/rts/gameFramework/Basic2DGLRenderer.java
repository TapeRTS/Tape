package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.Log;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/Basic2DGLRenderer.class */
public class Basic2DGLRenderer implements GLSurfaceView.Renderer {
    private static BitmapFactory.Options sBitmapOptions = new BitmapFactory.Options();
    DelayedDrawBuffer bufferWorkingObject;
    public int currentRead;
    public int currentWrite;
    public int framesInQueue;
    GL10 gl;
    float height;
    String lastFpsString;
    long lastTime;
    Context mContext;
    public int objectsDrawn;
    float width;
    public boolean ready = false;
    int bufferToBeRendered = -1;
    int bufferLocked = -1;
    int bufferWorking = 0;
    Grid reuseGrid = new Grid(2, 2, true);
    int lastBindedTexture = -1;
    int lastSrcHeight = -1;
    int lastSrcWidth = -1;
    int frameSampleTime = 0;
    int frameSamplesCollected = 0;
    int lastFps = 0;
    private int[] mTextureNameWorkspace = new int[1];
    private int[] mCropWorkspace = new int[4];
    DelayedDrawBuffer[] buffers = new DelayedDrawBuffer[3];

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/Basic2DGLRenderer$DelayedDraw.class */
    public class DelayedDraw {
        DrawType drawType;
        BitmapOrTexture image;
        float x;
        float y;
        Rect src = new Rect();
        RectF dst = new RectF();

        public DelayedDraw() {
        }

        void draw(GL10 gl10) {
            Grid grid;
            if (Basic2DGLRenderer.this.lastBindedTexture != this.image.textureHandle.intValue()) {
                gl10.glBindTexture(3553, this.image.textureHandle.intValue());
                Basic2DGLRenderer.this.lastBindedTexture = this.image.textureHandle.intValue();
            }
            gl10.glPushMatrix();
            gl10.glLoadIdentity();
            if (this.drawType == DrawType.Rect) {
                gl10.glTranslatef(this.dst.left, (Basic2DGLRenderer.this.height - this.dst.top) - this.src.height(), 0.0f);
                grid = Basic2DGLRenderer.this.reuseGrid;
                float width = this.src.left / this.image.getWidth();
                float width2 = this.src.right / this.image.getWidth();
                float height = this.src.top / this.image.getHeight();
                float height2 = this.src.bottom / this.image.getHeight();
                if (Basic2DGLRenderer.this.lastSrcHeight == this.src.height() && Basic2DGLRenderer.this.lastSrcWidth == this.src.width()) {
                    grid.setUV(0, 0, width, height2);
                    grid.setUV(1, 0, width2, height2);
                    grid.setUV(0, 1, width, height);
                    grid.setUV(1, 1, width2, height);
                } else {
                    Basic2DGLRenderer.this.lastSrcHeight = this.src.height();
                    Basic2DGLRenderer.this.lastSrcWidth = this.src.width();
                    grid.set(0, 0, 0.0f, 0.0f, 0.0f, width, height2, null);
                    grid.set(1, 0, this.src.width(), 0.0f, 0.0f, width2, height2, null);
                    grid.set(0, 1, 0.0f, this.src.height(), 0.0f, width, height, null);
                    grid.set(1, 1, this.src.width(), this.src.height(), 0.0f, width2, height, null);
                }
            } else {
                gl10.glTranslatef(this.x, (Basic2DGLRenderer.this.height - this.y) - this.image.getHeight(), 0.0f);
                grid = this.image.mGrid;
            }
            grid.draw(gl10, true, false);
            gl10.glPopMatrix();
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/Basic2DGLRenderer$DelayedDrawBuffer.class */
    public class DelayedDrawBuffer {
        DelayedDraw[] drawList = new DelayedDraw[700];
        int used;

        DelayedDrawBuffer() {
            for (int i = 0; i < 700; i++) {
                this.drawList[i] = new DelayedDraw();
            }
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/Basic2DGLRenderer$DrawType.class */
    public enum DrawType {
        Normal,
        Rect
    }

    public Basic2DGLRenderer(Context context) {
        this.mContext = context;
        for (int i = 0; i < 3; i++) {
            this.buffers[i] = new DelayedDrawBuffer();
        }
    }

    public void endFrame() {
        int i = this.bufferWorking;
        this.bufferToBeRendered = i;
        this.bufferWorking = getOtherBuffer(this.bufferLocked, i);
        this.bufferWorkingObject = this.buffers[this.bufferWorking];
        this.bufferWorkingObject.used = 0;
    }

    public DelayedDraw getDelayedDraw() {
        DelayedDraw delayedDraw = this.bufferWorkingObject.drawList[this.bufferWorkingObject.used];
        this.bufferWorkingObject.used++;
        return delayedDraw;
    }

    public int getOtherBuffer(int i) {
        int i2;
        if (i == -1) {
            i2 = 0;
        } else if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 0;
        } else {
            throw new RuntimeException("getOtherBuffer 1 didn't return for:" + i);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r8 != 0) goto L_0x002b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 != 0) goto L_0x0037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r8 != 1) goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r8 != 1) goto L_0x005f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getOtherBuffer(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.Basic2DGLRenderer.getOtherBuffer(int, int):int");
    }

    protected int loadBitmap(Context context, Bitmap bitmap) {
        int i = -1;
        if (context != null) {
            i = -1;
            if (this.gl != null) {
                this.gl.glGenTextures(1, this.mTextureNameWorkspace, 0);
                int i2 = this.mTextureNameWorkspace[0];
                this.gl.glBindTexture(3553, i2);
                this.gl.glTexParameterf(3553, 10241, 9728.0f);
                this.gl.glTexParameterf(3553, 10240, 9728.0f);
                this.gl.glTexParameterf(3553, 10242, 33071.0f);
                this.gl.glTexParameterf(3553, 10243, 33071.0f);
                this.gl.glTexEnvf(8960, 8704, 7681.0f);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                this.mCropWorkspace[0] = 0;
                this.mCropWorkspace[1] = bitmap.getHeight();
                this.mCropWorkspace[2] = bitmap.getWidth();
                this.mCropWorkspace[3] = -bitmap.getHeight();
                ((GL11) this.gl).glTexParameteriv(3553, 35741, this.mCropWorkspace, 0);
                int glGetError = this.gl.glGetError();
                i = i2;
                if (glGetError != 0) {
                    Log.e(GameEngine.TAG, "Texture Load GLError: " + glGetError);
                    i = i2;
                }
            }
        }
        return i;
    }

    public void loadImageIfNeeded(BitmapOrTexture bitmapOrTexture) {
        loadImageIfNeeded(bitmapOrTexture, false);
    }

    public void loadImageIfNeeded(BitmapOrTexture bitmapOrTexture, boolean z) {
        if (z || (this.ready && bitmapOrTexture.textureHandle == null)) {
            Log.e(GameEngine.TAG, "Loading image: " + bitmapOrTexture.name);
            if (bitmapOrTexture.bitmap == null) {
                Log.e(GameEngine.TAG, "bitmap is null");
            }
            bitmapOrTexture.textureHandle = Integer.valueOf(loadBitmap(this.mContext, bitmapOrTexture.bitmap));
            if (bitmapOrTexture.textureHandle == null || bitmapOrTexture.textureHandle.intValue() == -1) {
                Log.e(GameEngine.TAG, "texture did not load:" + bitmapOrTexture.name);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.bufferToBeRendered == -1) {
            Log.e(GameEngine.TAG, "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lastTime = currentTimeMillis;
        this.frameSampleTime += (int) (currentTimeMillis - this.lastTime);
        this.frameSamplesCollected++;
        if (this.frameSamplesCollected == 10) {
            this.lastFps = 10000 / this.frameSampleTime;
            this.frameSampleTime = 0;
            this.frameSamplesCollected = 0;
            this.lastFpsString = String.valueOf(this.lastFps) + "fps";
            Log.e(GameEngine.TAG, "render:" + this.lastFpsString + ", this renders has " + this.buffers[this.bufferToBeRendered].used + " draws");
        }
        this.bufferLocked = this.bufferToBeRendered;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        Grid.beginDrawing(gl10, true, false);
        DelayedDrawBuffer delayedDrawBuffer = this.buffers[this.bufferLocked];
        this.lastBindedTexture = -1;
        this.lastSrcHeight = -1;
        this.lastSrcWidth = -1;
        for (int i = 0; i < delayedDrawBuffer.used; i++) {
            delayedDrawBuffer.drawList[i].draw(gl10);
        }
        Grid.endDrawing(gl10);
        this.bufferLocked = -1;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.e(GameEngine.TAG, "2d gl onSurfaceChanged:" + i + "," + i2);
        this.gl = gl10;
        this.height = i2;
        this.width = i;
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0f, i, 0.0f, i2, 0.0f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        gl10.glEnable(3553);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.e(GameEngine.TAG, "2d gl onSurfaceCreated");
        this.gl = gl10;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.3f, 0.3f, 0.5f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glDisable(2929);
        gl10.glEnable(3553);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glClear(16640);
        GameEngine instance = GameEngine.getInstance();
        if (instance != null) {
            Iterator<BitmapOrTexture> it = instance.graphics.images.iterator();
            while (it.hasNext()) {
                loadImageIfNeeded(it.next(), true);
            }
        }
        this.ready = true;
    }

    public void shutdown(GL10 gl10) {
        this.ready = false;
    }
}

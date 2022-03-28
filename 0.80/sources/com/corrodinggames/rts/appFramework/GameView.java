package com.corrodinggames.rts.appFramework;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.corrodinggames.rts.appFramework.MultiTouchController;
import com.corrodinggames.rts.gameFramework.Basic2DGLRenderer;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/GameView.class */
public class GameView extends SurfaceView implements SurfaceHolder.Callback, MultiTouchController.MultiTouchObjectCanvas<Object> {
    static GameView gameView = null;
    Context context;
    Resources contextResources;
    public InGameActivity inGameActivity;
    public Basic2DGLRenderer renderer;
    SurfaceHolder surfaceHolder;
    boolean surfaceExists = false;
    public MultiTouchController<Object> multiTouchController = new MultiTouchController<>(this);
    public MultiTouchController.PointInfo currTouchPoint = new MultiTouchController.PointInfo();

    public GameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.e(GameEngine.TAG, "GameView:GameView()");
        init(context);
    }

    public static GameView getMainView() {
        return gameView;
    }

    protected void finalize() throws Throwable {
        Log.e(GameEngine.TAG, "GameView:finalize()");
        super.finalize();
    }

    public Resources getContextResources() {
        return this.contextResources;
    }

    @Override // com.corrodinggames.rts.appFramework.MultiTouchController.MultiTouchObjectCanvas
    public Object getDraggableObjectAtPoint(MultiTouchController.PointInfo pointInfo) {
        return this;
    }

    @Override // com.corrodinggames.rts.appFramework.MultiTouchController.MultiTouchObjectCanvas
    public void getPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale) {
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.surfaceHolder;
    }

    void init(Context context) {
        if (gameView != null) {
            Log.e(GameEngine.TAG, "gameView is not null");
        }
        gameView = this;
        this.context = context;
        this.surfaceHolder = getHolder();
        this.surfaceHolder.addCallback(this);
        this.contextResources = context.getResources();
        GameEngine instanceOrCreateAndLoad = GameEngine.getInstanceOrCreateAndLoad(context);
        instanceOrCreateAndLoad.gameView = gameView;
        boolean z = instanceOrCreateAndLoad.graphics.use3d;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        GameEngine.getInstance().onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.multiTouchController.onTouchEvent(motionEvent);
    }

    @Override // com.corrodinggames.rts.appFramework.MultiTouchController.MultiTouchObjectCanvas
    public void selectObject(Object obj, MultiTouchController.PointInfo pointInfo) {
        this.currTouchPoint.set(pointInfo);
    }

    @Override // com.corrodinggames.rts.appFramework.MultiTouchController.MultiTouchObjectCanvas
    public boolean setPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale, MultiTouchController.PointInfo pointInfo) {
        this.currTouchPoint.set(pointInfo);
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        this.surfaceHolder.addCallback(this);
        GameEngine instance = GameEngine.getInstance();
        instance.safeToRun = true;
        instance.setRunning();
        this.surfaceExists = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        GameEngine instance = GameEngine.getInstance();
        instance.setStopped();
        instance.safeToRun = false;
        this.surfaceExists = false;
    }
}

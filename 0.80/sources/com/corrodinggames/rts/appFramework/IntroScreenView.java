package com.corrodinggames.rts.appFramework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/IntroScreenView.class */
public class IntroScreenView extends View implements SurfaceHolder.Callback {
    Bitmap logo;
    SurfaceHolder surfaceHolder;
    Paint loadingPaint = new Paint();
    Paint tempPaint = new Paint();

    public IntroScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.e(GameEngine.TAG, "IntroScreenView()");
        init(context);
    }

    private void init(Context context) {
        this.logo = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
        this.loadingPaint.setTextAlign(Paint.Align.CENTER);
        this.loadingPaint.setTextSize(16.0f);
        this.loadingPaint.setAntiAlias(true);
        this.loadingPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        this.loadingPaint.setColor(-1);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            throw new RuntimeException("c is null");
        }
        canvas.drawColor(Color.rgb(36, 36, 36));
        float limit = CommonUtils.limit((getWidth() - 30.0f) / this.logo.getWidth(), 0.0f, 2.0f);
        canvas.save();
        canvas.scale(limit, limit);
        canvas.drawBitmap(this.logo, ((getWidth() / limit) / 2.0f) - (this.logo.getWidth() / 2.0f), ((getHeight() / limit) / 2.0f) - (this.logo.getHeight() / 2.0f), (Paint) null);
        canvas.restore();
        canvas.drawText("Loading..", getWidth() / 2, getHeight() - 40, this.loadingPaint);
        Log.e(GameEngine.TAG, "intro:drawBitmap:");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.e(GameEngine.TAG, "intro:surfaceCreated");
        this.surfaceHolder = surfaceHolder;
        this.surfaceHolder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}

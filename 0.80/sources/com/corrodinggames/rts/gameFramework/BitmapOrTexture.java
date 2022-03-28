package com.corrodinggames.rts.gameFramework;

import android.graphics.Bitmap;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/BitmapOrTexture.class */
public class BitmapOrTexture {
    public Bitmap bitmap;
    public Grid mGrid = new Grid(2, 2, false);
    public String name;
    public Integer textureHandle;

    public int getHeight() {
        return this.bitmap.getHeight();
    }

    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public void remove() {
        if (this.bitmap != null) {
            this.bitmap.recycle();
            this.bitmap = null;
        }
    }

    public void setupGrid() {
        this.mGrid.set(0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, null);
        this.mGrid.set(1, 0, getWidth(), 0.0f, 0.0f, 1.0f, 1.0f, null);
        this.mGrid.set(0, 1, 0.0f, getHeight(), 0.0f, 0.0f, 0.0f, null);
        this.mGrid.set(1, 1, getWidth(), getHeight(), 0.0f, 1.0f, 0.0f, null);
    }
}

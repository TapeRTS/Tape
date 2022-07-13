package com.corrodinggames.rts.gameFramework.effect;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.gameFramework.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/g.class */
public final class ImageStrip {

    /* renamed from: a */
    public String name;

    /* renamed from: b */
    public int tileWidth = 25;

    /* renamed from: c */
    public int tileHeight = 25;

    /* renamed from: d */
    public int globalOffsetX = 1;

    /* renamed from: e */
    public int globalOffsetY = 1;

    /* renamed from: f */
    public int tileStrideX = 26;

    /* renamed from: g */
    public int tileStrideY = 26;

    /* renamed from: h */
    public int f4393h = Integer.MAX_VALUE;

    /* renamed from: i */
    public BitmapOrTexture image = null;

    /* renamed from: j */
    public BitmapOrTexture f4395j = null;

    /* renamed from: k */
    public boolean f4396k = false;

    /* renamed from: l */
    static final Rect f4384l = new Rect();

    /* renamed from: m */
    static final RectF f4385m = new RectF();

    /* renamed from: a */
    public void m2188a() {
        this.f4395j = this.image.clone();
        this.f4395j.mo52i();
        for (int i = 0; i < this.f4395j.getWidth(); i++) {
            for (int i2 = 0; i2 < this.f4395j.getHeight(); i2++) {
                this.f4395j.mo62a(i, i2, Color.argb(Color.m4734a(this.f4395j.mo63a(i, i2)), 0, 0, 0));
            }
        }
        this.f4395j.mo48o();
        this.f4395j.mo45r();
    }

    /* renamed from: a */
    public void m2187a(int i, float f, float f2, Paint paint) {
        Rect rect = f4384l;
        RectF rectF = f4385m;
        GameEngine gameEngine = GameEngine.getInstance();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.f4393h) {
            i3 = 0 + (i2 / this.f4393h);
            i2 %= this.f4393h;
        }
        int i4 = this.globalOffsetX + (i2 * this.tileStrideX);
        int i5 = this.globalOffsetY + (i3 * this.tileStrideY);
        f4384l.set(i4, i5, i4 + this.tileWidth, i5 + this.tileHeight);
        rectF.m4652a(f, f2, f + rect.width(), f2 + rect.height());
        if (1 != 0) {
            rectF.m4653a((-rectF.m4647b()) / 2.0f, (-rectF.m4643c()) / 2.0f);
        }
        gameEngine.graphics.mo190a(this.image, rect, rectF, paint);
    }
}
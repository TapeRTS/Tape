package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.gameFramework.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/g.class */
public final class C0747g {

    /* renamed from: a */
    public String f4813a;

    /* renamed from: b */
    public int f4814b = 25;

    /* renamed from: c */
    public int f4815c = 25;

    /* renamed from: d */
    public int f4816d = 1;

    /* renamed from: e */
    public int f4817e = 1;

    /* renamed from: f */
    public int f4818f = 26;

    /* renamed from: g */
    public int f4819g = 26;

    /* renamed from: h */
    public int f4820h = Integer.MAX_VALUE;

    /* renamed from: i */
    public BitmapOrTexture f4821i = null;

    /* renamed from: j */
    public BitmapOrTexture f4822j = null;

    /* renamed from: k */
    public boolean f4823k = false;

    /* renamed from: l */
    static final Rect f4824l = new Rect();

    /* renamed from: m */
    static final RectF f4825m = new RectF();

    /* renamed from: a */
    public void m2505a() {
        this.f4822j = this.f4821i.m1036h();
        this.f4822j.mo398j();
        for (int i = 0; i < this.f4822j.mo396m(); i++) {
            for (int i2 = 0; i2 < this.f4822j.mo397l(); i2++) {
                this.f4822j.mo411a(i, i2, Color.argb(Color.m7284a(this.f4822j.mo412a(i, i2)), 0, 0, 0));
            }
        }
        this.f4822j.mo393p();
        this.f4822j.m1033s();
    }

    /* renamed from: a */
    public void m2504a(int i, float f, float f2, Paint paint) {
        Rect rect = f4824l;
        RectF rectF = f4825m;
        GameEngine gameEngine = GameEngine.getInstance();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.f4820h) {
            i3 = 0 + (i2 / this.f4820h);
            i2 %= this.f4820h;
        }
        int i4 = this.f4816d + (i2 * this.f4818f);
        int i5 = this.f4817e + (i3 * this.f4819g);
        f4824l.m7208a(i4, i5, i4 + this.f4814b, i5 + this.f4815c);
        rectF.m7195a(f, f2, f + rect.m7206b(), f2 + rect.m7202c());
        if (1 != 0) {
            rectF.m7196a((-rectF.m7190b()) / 2.0f, (-rectF.m7186c()) / 2.0f);
        }
        gameEngine.graphics.mo909a(this.f4821i, rect, rectF, paint);
    }
}

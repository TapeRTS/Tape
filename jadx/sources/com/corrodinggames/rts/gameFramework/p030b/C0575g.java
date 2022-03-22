package com.corrodinggames.rts.gameFramework.p030b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.gameFramework.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/g.class */
public final class C0575g {

    /* renamed from: a */
    public String f3926a;

    /* renamed from: b */
    public int f3927b = 25;

    /* renamed from: c */
    public int f3928c = 25;

    /* renamed from: d */
    public int f3929d = 1;

    /* renamed from: e */
    public int f3930e = 1;

    /* renamed from: f */
    public int f3931f = 26;

    /* renamed from: g */
    public int f3932g = 26;

    /* renamed from: h */
    public int f3933h = Integer.MAX_VALUE;

    /* renamed from: i */
    public C0748e f3934i = null;

    /* renamed from: j */
    public C0748e f3935j = null;

    /* renamed from: k */
    public boolean f3936k = false;

    /* renamed from: l */
    static final Rect f3937l = new Rect();

    /* renamed from: m */
    static final RectF f3938m = new RectF();

    /* renamed from: a */
    public void m1966a() {
        this.f3935j = this.f3934i.clone();
        this.f3935j.mo51i();
        for (int i = 0; i < this.f3935j.mo349l(); i++) {
            for (int i2 = 0; i2 < this.f3935j.mo350k(); i2++) {
                this.f3935j.mo61a(i, i2, Color.m4213a(Color.m4215a(this.f3935j.mo62a(i, i2)), 0, 0, 0));
            }
        }
        this.f3935j.mo47o();
        this.f3935j.mo44r();
    }

    /* renamed from: a */
    public void m1965a(int i, float f, float f2, Paint paint) {
        Rect rect = f3937l;
        RectF rectF = f3938m;
        AbstractC0789l u = AbstractC0789l.m638u();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.f3933h) {
            i3 = 0 + (i2 / this.f3933h);
            i2 %= this.f3933h;
        }
        int i4 = this.f3929d + (i2 * this.f3931f);
        int i5 = this.f3930e + (i3 * this.f3932g);
        f3937l.m4136a(i4, i5, i4 + this.f3927b, i5 + this.f3928c);
        rectF.m4122a(f, f2, f + rect.m4134b(), f2 + rect.m4130c());
        if (1 != 0) {
            rectF.m4123a((-rectF.m4117b()) / 2.0f, (-rectF.m4113c()) / 2.0f);
        }
        u.f5514bw.mo169a(this.f3934i, rect, rectF, paint);
    }
}

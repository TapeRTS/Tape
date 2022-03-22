package com.corrodinggames.rts.gameFramework.p030b;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;

/* renamed from: com.corrodinggames.rts.gameFramework.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/b.class */
public class C0570b {

    /* renamed from: a */
    boolean f3791a = false;

    /* renamed from: b */
    C0748e f3792b = null;

    /* renamed from: c */
    Paint f3793c = new C0760q();

    /* renamed from: d */
    RectF f3794d = new RectF();

    /* renamed from: e */
    float f3795e = 0.0f;

    /* renamed from: f */
    float f3796f = 0.0f;

    /* renamed from: a */
    public boolean m2022a() {
        return AbstractC0789l.m638u().f5516by.renderClouds;
    }

    /* renamed from: b */
    public void m2020b() {
        this.f3792b = AbstractC0789l.m638u().f5514bw.mo189a(C0063R.drawable.noise, false);
        this.f3791a = true;
    }

    /* renamed from: a */
    public void m2021a(float f) {
        if (m2022a()) {
            if (!this.f3791a) {
                m2020b();
            }
            this.f3795e += 0.2f * f;
            this.f3796f += 0.07f * f;
            this.f3795e %= this.f3792b.mo349l();
            this.f3796f %= this.f3792b.mo350k();
        }
    }

    /* renamed from: b */
    public void m2019b(float f) {
        if (m2022a()) {
            if (!this.f3791a) {
                m2020b();
            }
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5514bw.mo127h();
            u.f5514bw.mo200a(3.0f, 3.0f);
            float f2 = (int) C0654f.m1434f((-u.f5547cd) / 3.0f, 0.0f);
            float f3 = (int) C0654f.m1434f((-u.f5548ce) / 3.0f, 0.0f);
            this.f3794d.m4122a(f2, f3, ((int) (u.f5551ch / 3.0f)) + 1, ((int) (u.f5552ci / 3.0f)) + 1);
            this.f3793c.m4169b(-16777216);
            this.f3793c.m4164c(40);
            u.f5514bw.mo168a(this.f3792b, this.f3794d, this.f3793c, (u.f5547cd / 3.0f) + f2 + this.f3795e, (u.f5548ce / 3.0f) + f3 + this.f3796f, 0, 0);
            u.f5514bw.mo126i();
        }
    }
}

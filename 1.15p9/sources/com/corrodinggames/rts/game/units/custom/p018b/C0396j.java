package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0405bf;
import com.corrodinggames.rts.game.units.custom.C0411bl;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.p024d.LaserDefence;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/j.class */
public class C0396j extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2437a = new C0396j();

    /* renamed from: b */
    static final PointF f2438b = new PointF();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo4560b(C0451j c0451j, float f) {
        C0453l c0453l = c0451j.f2861w;
        int mo3086bl = c0451j.mo3086bl();
        for (int i = 0; i < mo3086bl; i++) {
            C0411bl c0411bl = c0453l.f3264fL[i];
            if (c0411bl.f2581aj != null && c0451j.f1638cz > 0.0f && !c0451j.f2859u) {
                float floatValue = c0411bl.f2581aj.floatValue();
                f2438b.m6251a(c0451j.mo3241E(i));
                float mo3032m = c0451j.mo3032m();
                if (c0411bl.f2617ab < 99999.0f) {
                    mo3032m = c0411bl.f2617ab;
                }
                if (LaserDefence.m3827a(c0451j, f2438b.f227a, f2438b.f228b, c0451j.f6953em, mo3032m, floatValue)) {
                }
                if (c0451j.f1638cz < 0.0f) {
                    c0451j.f1638cz = 0.0f;
                    c0451j.f2859u = true;
                }
            }
            if (c0411bl.f2582ak != null) {
                m4561a(c0451j, c0411bl);
            }
        }
    }

    /* renamed from: a */
    public static void m4561a(C0451j c0451j, C0411bl c0411bl) {
        if (!c0451j.m4275a(c0411bl)) {
            return;
        }
        float f = c0411bl.f2621al;
        float f2 = c0411bl.f2622am;
        float f3 = c0411bl.f2623an;
        C0188f c0188f = null;
        C0449h c0449h = c0411bl.f2582ak;
        Object[] m559a = C0188f.f1082a.m559a();
        int i = C0188f.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m559a[i2];
            if (c0188f2.f1055aE != null && c0188f2.f6953em > f3 && C0448g.m4311a(c0188f2.f1055aE, c0449h) && C0758f.m2361a(c0451j.f6951ek, c0451j.f6952el, c0188f2.f6951ek, c0188f2.f6952el) < f2 * f2 && ((C0758f.m2361a(c0451j.f6951ek, c0451j.f6952el, c0188f2.f987n, c0188f2.f988o) < f * f || f < 0.0f) && ((c0188f2.f983j == null || (!c0188f2.f983j.f1608bV.m5398d(c0451j.f1608bV) && c0188f2.f983j.f1608bV != c0451j.f1608bV)) && c0188f2.f981h > 0.0f && !m4562a(c0188f2)))) {
                c0188f = c0188f2;
            }
        }
        if (c0188f != null) {
            c0451j.m4260b(c0411bl);
            C0188f m4280a = c0451j.m4280a((Unit) null, c0188f.f6951ek, c0188f.f6952el, c0411bl.f2546e, (C0405bf) null, 0);
            m4280a.f1053aC = true;
            m4280a.f990q = c0188f;
        }
    }

    /* renamed from: a */
    public static boolean m4562a(C0188f c0188f) {
        Object[] m559a = C0188f.f1082a.m559a();
        int i = C0188f.f1082a.f6888a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m559a[i2];
            if (c0188f2 != c0188f && c0188f2.f990q == c0188f) {
                return true;
            }
        }
        return false;
    }
}

package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/aa.class */
public class C0636aa extends AbstractC0726bk {

    /* renamed from: a */
    int f4067a;

    /* renamed from: b */
    PointF f4068b = new PointF();

    /* renamed from: a */
    public void m2985a() {
        this.f4067a = 1;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(0);
        c0859ar.mo1487a(this.f4067a);
    }

    /* renamed from: a */
    public void m2982a(C0876k c0876k) {
        c0876k.m1454f();
        this.f4067a = c0876k.m1454f();
    }

    /* renamed from: a */
    public void m2984a(float f) {
    }

    /* renamed from: b */
    public C0637ab m2979b() {
        C0637ab c0637ab = new C0637ab(this);
        c0637ab.f4073e = this.f4067a;
        this.f4067a++;
        return c0637ab;
    }

    /* renamed from: c */
    public C0637ab m2978c() {
        C0637ab c0637ab = new C0637ab(this);
        c0637ab.f4073e = -1;
        c0637ab.f4070b = true;
        return c0637ab;
    }

    /* renamed from: a */
    public void m2980a(C1101m c1101m, AbstractC0623y abstractC0623y, C1101m c1101m2, float f, int i) {
        int i2 = 0;
        while (!c1101m2.isEmpty()) {
            AbstractC0623y abstractC0623y2 = null;
            float f2 = -1.0f;
            PointF pointF = null;
            int i3 = -1;
            Object[] m559a = c1101m2.m559a();
            Object[] m559a2 = c1101m.m559a();
            int size = c1101m.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) m559a2[i4];
                if (abstractC0623y3.f3916ac == abstractC0623y && !abstractC0623y3.f3922ai) {
                    float f3 = -1.0f;
                    PointF pointF2 = null;
                    int i5 = -1;
                    for (int i6 = 0; i6 < c1101m2.f6888a; i6++) {
                        PointF pointF3 = (PointF) m559a[i6];
                        float m2366a = CommonUtils.m2366a(abstractC0623y3.f6951ek, abstractC0623y3.f6952el, abstractC0623y.f6951ek + pointF3.x, abstractC0623y.f6952el + pointF3.y);
                        if (f3 == -1.0f || m2366a < f3) {
                            f3 = m2366a;
                            pointF2 = pointF3;
                            i5 = i6;
                        }
                    }
                    if (f3 > f2) {
                        abstractC0623y2 = abstractC0623y3;
                        f2 = f3;
                        pointF = pointF2;
                        i3 = i5;
                    }
                }
            }
            if (abstractC0623y2 != null) {
                i2++;
                abstractC0623y2.f3922ai = true;
                abstractC0623y2.f3923aj = pointF.x;
                abstractC0623y2.f3924ak = pointF.y;
                abstractC0623y2.f3925al = f;
                abstractC0623y2.f3927an = f2;
                abstractC0623y2.f3920ag = (short) (i + 1);
                c1101m2.remove(i3);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m2981a(C1101m c1101m, AbstractC0623y abstractC0623y) {
        while (true) {
            AbstractC0623y abstractC0623y2 = null;
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it.next();
                if (abstractC0623y3.f3916ac == abstractC0623y && abstractC0623y3.f3927an > 0.0f && (abstractC0623y2 == null || abstractC0623y3.f3927an > abstractC0623y2.f3927an)) {
                    if (abstractC0623y3.f3922ai && abstractC0623y3.f3927an > 100.0f) {
                        abstractC0623y2 = abstractC0623y3;
                    }
                }
            }
            if (abstractC0623y2 != null) {
                abstractC0623y2.f3922ai = false;
                AbstractC0623y abstractC0623y4 = null;
                float f = 0.0f;
                AbstractC0623y abstractC0623y5 = abstractC0623y2;
                int m2361a = CommonUtils.m2361a((int) abstractC0623y5.f3927an);
                Iterator it2 = c1101m.iterator();
                while (it2.hasNext()) {
                    AbstractC0623y abstractC0623y6 = (AbstractC0623y) it2.next();
                    if (abstractC0623y6.f3916ac == abstractC0623y && abstractC0623y6.f3927an > 0.0f && abstractC0623y6 != abstractC0623y5) {
                        float m2291c = ((0 + CommonUtils.m2291c(abstractC0623y5.f6951ek, abstractC0623y5.f6952el, abstractC0623y.f6951ek + abstractC0623y6.f3923aj, abstractC0623y.f6952el + abstractC0623y6.f3924ak)) + CommonUtils.m2291c(abstractC0623y6.f6951ek, abstractC0623y6.f6952el, abstractC0623y.f6951ek + abstractC0623y5.f3923aj, abstractC0623y.f6952el + abstractC0623y5.f3924ak)) - (CommonUtils.m2361a((int) abstractC0623y6.f3927an) + m2361a);
                        if (m2291c < f) {
                            f = m2291c;
                            abstractC0623y4 = abstractC0623y6;
                        }
                    }
                }
                if (abstractC0623y4 != null) {
                    float f2 = abstractC0623y5.f3923aj;
                    float f3 = abstractC0623y5.f3924ak;
                    abstractC0623y5.f3923aj = abstractC0623y4.f3923aj;
                    abstractC0623y5.f3924ak = abstractC0623y4.f3924ak;
                    abstractC0623y5.f3927an = CommonUtils.m2366a(abstractC0623y5.f6951ek, abstractC0623y5.f6952el, abstractC0623y.f6951ek + abstractC0623y5.f3923aj, abstractC0623y.f6952el + abstractC0623y5.f3924ak);
                    abstractC0623y4.f3923aj = f2;
                    abstractC0623y4.f3924ak = f3;
                    abstractC0623y4.f3927an = CommonUtils.m2366a(abstractC0623y4.f6951ek, abstractC0623y4.f6952el, abstractC0623y.f6951ek + abstractC0623y4.f3923aj, abstractC0623y.f6952el + abstractC0623y4.f3924ak);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C1101m m2983a(int i, float f, float f2) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 6 / 2;
        float f3 = 2.0f + (f * 2.0f * 1.5f);
        C1101m c1101m = new C1101m();
        int i6 = i;
        if (i6 % 2 != 0) {
            i6++;
        }
        float m2249i = CommonUtils.m2249i(f2);
        float sin = CommonUtils.sin(f2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (i3 % 2 == 0) {
                i2 = i5 + (i3 / 2);
            } else {
                i2 = i5 - ((i3 + 1) / 2);
            }
            float f4 = (i2 - i5) * f3;
            float f5 = (-i4) * f3;
            c1101m.add(new PointF((f5 * m2249i) - (f4 * sin), (f4 * m2249i) + (f5 * sin)));
            i3++;
            if (i3 > 6) {
                i3 = 0;
                i4++;
            }
        }
        return c1101m;
    }
}

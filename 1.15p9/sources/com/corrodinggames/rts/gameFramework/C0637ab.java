package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ab.class */
public class C0637ab {

    /* renamed from: a */
    C1101m f4069a = new C1101m();

    /* renamed from: b */
    boolean f4070b;

    /* renamed from: c */
    float f4071c;

    /* renamed from: d */
    float f4072d;

    /* renamed from: e */
    int f4073e;

    /* renamed from: f */
    boolean f4074f;

    /* renamed from: g */
    public C1101m f4075g;

    /* renamed from: h */
    final /* synthetic */ C0636aa f4076h;

    public C0637ab(C0636aa c0636aa) {
        this.f4076h = c0636aa;
    }

    /* renamed from: a */
    public void m2973a(AbstractC0623y abstractC0623y, C0305au c0305au) {
        c0305au.f1801i = this;
        this.f4074f = c0305au.f1802j;
    }

    /* renamed from: a */
    public void m2975a(C0305au c0305au) {
        C0305au m3135ar;
        Iterator it = this.f4069a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!abstractC0623y.isDead && (m3135ar = abstractC0623y.m3135ar()) != null && m3135ar.m5681b(c0305au)) {
                abstractC0623y.m3128ay();
            }
        }
    }

    /* renamed from: a */
    public void m2977a() {
        C0305au m3135ar;
        this.f4069a.clear();
        Unit[] m523a = Unit.f1589bD.m523a();
        int size = Unit.f1589bD.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.mo3295I() && (m3135ar = abstractC0623y.m3135ar()) != null && m3135ar.f1801i == this && abstractC0623y.m3098bg()) {
                    this.f4069a.add(abstractC0623y);
                    this.f4071c = m3135ar.m5670g();
                    this.f4072d = m3135ar.m5668h();
                }
            }
        }
    }

    /* renamed from: a */
    public void m2974a(AbstractC0623y abstractC0623y) {
        abstractC0623y.f3915ab = this.f4073e;
        C0305au m3135ar = abstractC0623y.m3135ar();
        if (m3135ar != null) {
            m3135ar.f1801i = this;
        }
    }

    /* renamed from: b */
    public void m2970b() {
        C0727bl.m2612a();
        m2969c();
    }

    /* renamed from: a */
    public AbstractC0623y m2972a(C1101m c1101m, float f, float f2, boolean z) {
        float f3 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it.next();
            if (z || (abstractC0623y2.f3916ac == null && !abstractC0623y2.f3917ad)) {
                float m2314b = CommonUtils.m2314b(f, f2, abstractC0623y2.f6951ek, abstractC0623y2.f6952el);
                if (abstractC0623y2.f3918ae) {
                    m2314b -= 160.0f;
                }
                if (f3 == -1.0f || m2314b < f3) {
                    f3 = m2314b;
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: a */
    public C1101m m2976a(float f, float f2, boolean z) {
        C1101m c1101m = new C1101m(1);
        C1101m c1101m2 = new C1101m();
        c1101m2.clear();
        c1101m2.addAll(this.f4069a);
        while (true) {
            AbstractC0623y m2972a = m2972a(c1101m2, f, f2, true);
            if (m2972a != null) {
                c1101m.add(m2972a);
                c1101m2.remove(m2972a);
                c1101m2.removeAll(m2971a(c1101m2, m2972a, true, z));
            } else {
                return c1101m;
            }
        }
    }

    /* renamed from: a */
    public C1101m m2971a(C1101m c1101m, AbstractC0623y abstractC0623y, boolean z, boolean z2) {
        C1101m c1101m2 = new C1101m(1);
        c1101m2.clear();
        int i = 0;
        Object[] m559a = c1101m.m559a();
        int size = c1101m.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0623y) m559a[i2]).f3928ao = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = c1101m.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m559a[i4];
                if (!abstractC0623y2.f3928ao && abstractC0623y2 != abstractC0623y && ((z || (abstractC0623y2.f3916ac == null && !abstractC0623y2.f3917ad)) && abstractC0623y2.mo5645h() == abstractC0623y.mo5645h())) {
                    float m2366a = CommonUtils.m2366a(abstractC0623y2.f6951ek, abstractC0623y2.f6952el, abstractC0623y.f6951ek, abstractC0623y.f6952el);
                    if ((i3 != 0 || m2366a <= 3600.0f) && ((i3 != 1 || m2366a <= 14400.0f) && (((z2 && m2366a < 160000.0f) || (m2366a < 40000.0f && i < 25)) && (z2 || CommonUtils.m2294c(abstractC0623y2.getMoveSpeed() - abstractC0623y.getMoveSpeed()) < 0.4f)))) {
                        abstractC0623y2.f3928ao = true;
                        c1101m2.add(abstractC0623y2);
                        i++;
                    }
                }
            }
        }
        return c1101m2;
    }

    /* renamed from: c */
    public void m2969c() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0727bl.m2612a();
        m2977a();
        this.f4076h.f4068b.m7213a(0.0f, 0.0f);
        Iterator it = this.f4069a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            this.f4076h.f4068b.m7211b(abstractC0623y.f6951ek, abstractC0623y.f6952el);
        }
        this.f4076h.f4068b.m7213a(this.f4076h.f4068b.x / this.f4069a.size(), this.f4076h.f4068b.y / this.f4069a.size());
        float m2280d = CommonUtils.m2280d(this.f4076h.f4068b.x, this.f4076h.f4068b.y, this.f4071c, this.f4072d);
        Iterator it2 = this.f4069a.iterator();
        while (it2.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
            if (abstractC0623y2.f3920ag > 1) {
                abstractC0623y2.f3918ae = abstractC0623y2.f3917ad;
            } else {
                abstractC0623y2.f3918ae = false;
            }
            if (abstractC0623y2.f3918ae && abstractC0623y2.f3920ag > 7 && CommonUtils.m2294c(CommonUtils.m2292c(abstractC0623y2.f3925al, m2280d, 360.0f)) > 80.0f) {
                abstractC0623y2.f3918ae = false;
            }
            abstractC0623y2.m3178aB();
            abstractC0623y2.f3920ag = (short) 0;
            abstractC0623y2.f3926am = gameEngine.f6096by;
            abstractC0623y2.f3915ab = this.f4073e;
        }
        int i = 0;
        while (true) {
            C0727bl.m2612a();
            AbstractC0623y m2972a = m2972a(this.f4069a, this.f4071c, this.f4072d, false);
            if (m2972a == null) {
                return;
            }
            m2972a.f3917ad = true;
            C0637ab c0637ab = null;
            if (i > 0) {
                c0637ab = this.f4076h.m2979b();
            }
            if (c0637ab != null) {
                c0637ab.f4075g = this.f4075g;
                c0637ab.m2974a(m2972a);
            }
            int i2 = 0;
            float f = 0.0f;
            Iterator it3 = m2971a(this.f4069a, m2972a, false, this.f4074f).iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it3.next();
                if (abstractC0623y3.radius > f) {
                    f = abstractC0623y3.radius;
                }
                abstractC0623y3.m3191a(m2972a);
                if (c0637ab != null) {
                    c0637ab.m2974a(abstractC0623y3);
                }
                i2++;
            }
            if (m2972a != null) {
                m2972a.f3920ag = (short) (i2 + 1);
            }
            C1101m c1101m = new C1101m();
            Object[] m559a = this.f4069a.m559a();
            int size = this.f4069a.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) m559a[i3];
                if (abstractC0623y4.f3916ac == m2972a) {
                    c1101m.add(abstractC0623y4);
                }
            }
            C1101m m2983a = this.f4076h.m2983a(i2, f, m2280d);
            C0727bl.m2612a();
            this.f4076h.m2980a(c1101m, m2972a, m2983a, m2280d, i2);
            C0727bl.m2612a();
            this.f4076h.m2981a(c1101m, m2972a);
            i++;
        }
    }
}

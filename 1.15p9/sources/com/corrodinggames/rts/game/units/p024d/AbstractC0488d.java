package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public abstract class AbstractC0488d extends AbstractC0623y {

    /* renamed from: m */
    C0934e f3420m;

    /* renamed from: n */
    public Rect f3421n;

    /* renamed from: o */
    public Rect f3422o;

    /* renamed from: p */
    public static C0934e f3423p = null;

    /* renamed from: q */
    public static C0934e[] f3424q = new C0934e[10];

    /* renamed from: r */
    int f3425r;

    /* renamed from: s */
    int f3426s;

    /* renamed from: M */
    public boolean mo3817M() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3425r);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        if (c0876k.m1463b() >= 15) {
            m3862R(c0876k.m1454f());
        }
        super.mo2872a(c0876k);
    }

    /* renamed from: a */
    public static boolean m3861a(InterfaceC0303as interfaceC0303as, float f, float f2, AbstractC0197n abstractC0197n) {
        GameEngine m1234A = GameEngine.m1234A();
        AbstractC0623y abstractC0623y = (AbstractC0623y) Unit.m4777a(interfaceC0303as);
        m1234A.f6104bL.m5477b(f, f2);
        abstractC0623y.f6951ek = m1234A.f6104bL.f800T + abstractC0623y.mo3906cX();
        abstractC0623y.f6952el = m1234A.f6104bL.f801U + abstractC0623y.mo3906cX();
        abstractC0623y.mo3113b(abstractC0197n);
        return abstractC0623y.mo3813c((AbstractC0197n) null);
    }

    /* renamed from: R */
    public void m3862R(int i) {
        this.f3425r = i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3264d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3424q[this.f1608bV.m5267O()];
    }

    /* renamed from: dq */
    public static void m3851dq() {
        f3423p = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.unit_icon_building);
        f3424q = AbstractC0197n.m5244a(f3423p);
    }

    public AbstractC0488d(boolean z) {
        super(z);
        this.f3421n = new Rect();
        this.f3422o = new Rect();
        this.f3425r = 1;
        this.f3426s = 0;
        this.f1617ce = -90.0f;
        this.f1605bS = false;
    }

    /* renamed from: c_ */
    public void m3855c_() {
        this.f1605bS = false;
    }

    /* renamed from: K */
    public boolean mo3695K() {
        m3199a(EnumC0233ab.large);
        return false;
    }

    /* renamed from: e */
    public boolean m3850e() {
        GameEngine.m1234A().f6113bU.m1312a(this);
        if (this.f1623ck < 1.0f) {
            m3199a(EnumC0233ab.verysmall);
            return false;
        }
        this.f3426s = 0;
        return mo3695K();
    }

    /* renamed from: cc */
    public Rect m3853cc() {
        return this.f3422o;
    }

    /* renamed from: cb */
    public Rect m3854cb() {
        return this.f3421n;
    }

    /* renamed from: a */
    public static boolean m3860a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, int i3) {
        GameEngine m1234A = GameEngine.m1234A();
        C0173b c0173b = m1234A.f6104bL;
        if (!c0173b.m5468c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (c0173b.f840E && m1234A.f6093bs.f1336M != null) {
            if (!c0173b.f842G && m1234A.f6093bs.f1336M[i][i2] == 10) {
                return false;
            }
            z = m1234A.f6093bs.f1336M[i][i2] >= 5;
        }
        if (m3859a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z)) {
            if (interfaceC0303as.mo3965p()) {
                C0180g m5458e = c0173b.m5458e(i, i2);
                if (m5458e != null && m5458e.f921i) {
                    return true;
                }
                return false;
            } else if (C0741a.m2573a(m1234A.f6093bs, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3859a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z) {
        return m3858a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z, null) == null;
    }

    /* renamed from: a */
    public static String m3858a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z, AbstractC0197n abstractC0197n) {
        String m4389a;
        GameEngine m1234A = GameEngine.m1234A();
        if (!m1234A.f6104bL.m5468c(i, i2)) {
            return "{0}";
        }
        C0402bc mo3963q = interfaceC0303as.mo3963q();
        if (mo3963q != null && (m4389a = mo3963q.m4389a(abstractC0623y, i, i2)) != null) {
            return m4389a;
        }
        if (interfaceC0303as == UnitType.seaFactory || enumC0246ao == EnumC0246ao.WATER) {
            if (!m1234A.f6113bU.m1311a(m1234A.f6113bU.f6013A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        C0180g m5458e = m1234A.f6104bL.m5458e(i, i2);
        if (m5458e != null && m5458e.f921i) {
            if (interfaceC0303as.mo3965p()) {
                return null;
            }
            return "{0}";
        } else if (enumC0246ao == EnumC0246ao.AIR) {
            return null;
        } else {
            if (enumC0246ao == EnumC0246ao.HOVER) {
                if (!m1234A.f6113bU.m1311a(m1234A.f6113bU.f6015C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.OVER_CLIFF) {
                if (!m1234A.f6113bU.m1311a(m1234A.f6113bU.f6016D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.OVER_CLIFF_WATER) {
                if (!m1234A.f6113bU.m1311a(m1234A.f6113bU.f6017E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (m1234A.f6113bU.m1310a(m1234A.f6113bU.f6012z, i, i2, z)) {
                boolean z2 = false;
                if (abstractC0197n != null && !m1234A.f6104bL.m5507a(i, i2, abstractC0197n)) {
                    z2 = true;
                }
                if (!z2) {
                    return "{0}";
                }
                return null;
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static Unit m3857b(int i, int i2) {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6104bL.m5508a(i, i2);
        float f = m1234A.f6104bL.f800T + m1234A.f6104bL.f786p;
        float f2 = m1234A.f6104bL.f801U + m1234A.f6104bL.f787q;
        Iterator it = m1234A.f6121cc.m3534b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.mo4109bI() && !unit.f1606bT && unit.m4758c(f, f2, 0.0f)) {
                return unit;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3693a(int i) {
    }

    /* renamed from: g */
    public static Unit m3848g(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            throw new RuntimeException("type is null");
        }
        return interfaceC0303as.mo4029a();
    }

    /* renamed from: I */
    public boolean mo3285I() {
        return false;
    }

    /* renamed from: h */
    public EnumC0246ao m3847h() {
        return EnumC0246ao.NONE;
    }

    /* renamed from: i */
    public boolean mo3283i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3284Q() {
        return false;
    }

    /* renamed from: z */
    public float m3845z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float m3863A() {
        return 0.0f;
    }

    /* renamed from: x */
    public boolean m3846x() {
        return false;
    }

    /* renamed from: f */
    public Paint m3849f() {
        int m6127a;
        GameEngine m1234A = GameEngine.m1234A();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1623ck < 1.0f) {
            m6127a = Color.m6127a((int) (40.0f + (this.f1623ck * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f3971aW;
        } else {
            m6127a = Color.m6127a(255, 255, 255, 255);
        }
        if (this.f1626cn) {
            if (this.f1629cq) {
                m6127a = Color.m6127a(200, 20, 255, 20);
                porterDuffColorFilter = f3972aX;
            }
            if (this.f1630cr) {
                m6127a = Color.m6127a(200, 255, 20, 20);
                porterDuffColorFilter = f3973aY;
            }
            if (this.f1627co) {
                m6127a = Color.m6127a(70, 70, 70, 245);
                porterDuffColorFilter = f3974aZ;
                if (this.f1630cr) {
                    m6127a = Color.m6127a(70, 255, 20, 20);
                    porterDuffColorFilter = f3973aY;
                }
            }
            if (this.f1628cp) {
                m6127a = Color.m6127a(150, 100, 100, 100);
            }
        }
        boolean z = m1234A.f6109bQ.renderAntiAlias;
        if (!mo4065di()) {
            z = false;
            if (m1234A.f6250cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1625cm) {
            z = UnitType.f1792ag;
        }
        return m3203a(m6127a, porterDuffColorFilter, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        GameEngine m1234A = GameEngine.m1234A();
        int i = this.f3426s * this.f4223eo;
        RectF cE = mo3841cE();
        f1684dt.m6053a(i, 0, i + this.f4223eo, 0 + this.f4224ep);
        m1234A.f6107bO.mo909a(this.f3880L, f1684dt, cE, m3849f());
        return true;
    }

    /* renamed from: d */
    public void m3852d(float f) {
        super.mo461d(f);
        if (this.f3420m == null) {
            return;
        }
        GameEngine m1234A = GameEngine.m1234A();
        if (mo3817M()) {
            m1234A.f6107bO.mo890b(this.f3420m, (this.f6951ek - ((int) (this.f3420m.f6400t + 0.1f))) - m1234A.f6138cv, (this.f6952el - ((int) (this.f3420m.f6401u + 0.1f))) - m1234A.f6139cw, m3849f());
            return;
        }
        RectF cE = mo3841cE();
        f1684dt.m6053a(0, 0, 0 + this.f4223eo, 0 + this.f4224ep);
        m1234A.f6107bO.mo909a(this.f3420m, f1684dt, cE, m3849f());
    }

    /* renamed from: bI */
    public boolean m3856bI() {
        return true;
    }
}

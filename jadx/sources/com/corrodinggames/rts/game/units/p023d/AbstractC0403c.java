package com.corrodinggames.rts.game.units.p023d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.custom.C0314aj;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public abstract class AbstractC0403c extends AbstractC0515r {

    /* renamed from: m */
    C0748e f2964m;

    /* renamed from: p */
    public static C0748e f2967p = null;

    /* renamed from: q */
    public static C0748e[] f2968q = new C0748e[10];

    /* renamed from: n */
    public Rect f2965n = new Rect();

    /* renamed from: o */
    public Rect f2966o = new Rect();

    /* renamed from: r */
    int f2969r = 1;

    /* renamed from: s */
    int f2970s = 0;

    /* renamed from: cY */
    public boolean mo2629cY() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f2969r);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1071b() >= 15) {
            mo2626Q(kVar.m1062f());
        }
        super.mo399a(kVar);
    }

    /* renamed from: a */
    public static boolean m2650a(AbstractC0268al alVar, float f, float f2, AbstractC0171m mVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r rVar = (AbstractC0515r) AbstractC0210af.m3333a(alVar);
        u.f5511bt.m3670b(f, f2);
        rVar.f5842dH = u.f5511bt.f764M + rVar.mo2572cH();
        rVar.f5843dI = u.f5511bt.f765N + rVar.mo2572cH();
        rVar.mo2305a(mVar);
        return rVar.mo2198bn();
    }

    /* renamed from: Q */
    public void mo2626Q(int i) {
        this.f2969r = i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f2968q[this.f1461bB.m3518M()];
    }

    /* renamed from: cZ */
    public static void m2642cZ() {
        f2967p = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.unit_icon_building);
        f2968q = AbstractC0171m.m3501a(f2967p);
    }

    public AbstractC0403c(boolean z) {
        super(z);
        this.f1471bL = -90.0f;
        this.f1458by = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: c_ */
    public void mo2361c_() {
        this.f1458by = false;
    }

    /* renamed from: K */
    public boolean mo2550K() {
        m2288a(EnumC0519u.large);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5520bC.m957a(this);
        if (this.f1477bR < 1.0f) {
            m2288a(EnumC0519u.verysmall);
            return false;
        }
        this.f2970s = 0;
        return mo2550K();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bP */
    public Rect mo2644bP() {
        return this.f2966o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bO */
    public Rect mo2645bO() {
        return this.f2965n;
    }

    /* renamed from: a */
    public static boolean m2649a(AbstractC0515r rVar, AbstractC0268al alVar, EnumC0212ah ahVar, int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        if (!bVar.m3661c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (bVar.f752A && u.f5493bb.f1262C != null) {
            if (!bVar.f754C && u.f5493bb.f1262C[i][i2] == 10) {
                return false;
            }
            z = u.f5493bb.f1262C[i][i2] >= 5;
        }
        if (!m2648a(rVar, alVar, ahVar, i, i2, z)) {
            return false;
        }
        if (alVar.mo2740p()) {
            C0155g e = bVar.m3651e(i, i2);
            if (e == null || !e.f857i) {
                return false;
            }
            return true;
        } else if (C0569a.m2030a(u.f5493bb, i, i2, i3)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m2648a(AbstractC0515r rVar, AbstractC0268al alVar, EnumC0212ah ahVar, int i, int i2, boolean z) {
        return m2646b(rVar, alVar, ahVar, i, i2, z) == null;
    }

    /* renamed from: b */
    public static String m2646b(AbstractC0515r rVar, AbstractC0268al alVar, EnumC0212ah ahVar, int i, int i2, boolean z) {
        String a;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!u.f5511bt.m3661c(i, i2)) {
            return "{0}";
        }
        C0314aj q = alVar.mo2739q();
        if (q != null && (a = q.m3096a(rVar, i, i2)) != null) {
            return a;
        }
        if (alVar != EnumC0215ak.seaFactory && ahVar != EnumC0212ah.WATER) {
            C0155g e = u.f5511bt.m3651e(i, i2);
            if (e == null || !e.f857i) {
                if (ahVar == EnumC0212ah.AIR) {
                    return null;
                }
                if (ahVar == EnumC0212ah.HOVER) {
                    if (!u.f5520bC.m956a(u.f5520bC.f5152z, i, i2)) {
                        return null;
                    }
                    return "{0}";
                } else if (ahVar == EnumC0212ah.OVER_CLIFF) {
                    if (!u.f5520bC.m956a(u.f5520bC.f5153A, i, i2)) {
                        return null;
                    }
                    return "{0}";
                } else if (ahVar == EnumC0212ah.OVER_CLIFF_WATER) {
                    if (!u.f5520bC.m956a(u.f5520bC.f5154B, i, i2)) {
                        return null;
                    }
                    return "{0}";
                } else if (u.f5520bC.m955a(u.f5520bC.f5149w, i, i2, z)) {
                    return "{0}";
                } else {
                    return null;
                }
            } else if (alVar.mo2740p()) {
                return null;
            } else {
                return "{0}";
            }
        } else if (!u.f5520bC.m956a(u.f5520bC.f5150x, i, i2)) {
            return null;
        } else {
            return "{3}";
        }
    }

    /* renamed from: b */
    public static AbstractC0210af m2647b(int i, int i2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5511bt.m3699a(i, i2);
        float f = u.f5511bt.f764M + u.f5511bt.f737m;
        float f2 = u.f5511bt.f765N + u.f5511bt.f738n;
        Iterator it = u.f5528bK.m2455b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar.mo2643bw() && !afVar.f1459bz && afVar.m3312c(f, f2, 0.0f)) {
                return afVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
    }

    /* renamed from: g */
    public static AbstractC0210af m2641g(AbstractC0268al alVar) {
        if (alVar != null) {
            return alVar.mo2799a();
        }
        throw new RuntimeException("type is null");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public boolean mo2338I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: h */
    public EnumC0212ah mo2358h() {
        return EnumC0212ah.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: i */
    public boolean mo2357i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: P */
    public boolean mo2363P() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: x */
    public boolean mo2133x() {
        return false;
    }

    /* renamed from: f */
    public Paint mo2538f() {
        int i;
        AbstractC0789l u = AbstractC0789l.m638u();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1477bR < 1.0f) {
            i = Color.m4213a((int) (40.0f + (this.f1477bR * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f3476aK;
        } else {
            i = Color.m4213a(255, 255, 255, 255);
        }
        if (this.f1479bT) {
            if (this.f1482bW) {
                i = Color.m4213a(200, 20, 255, 20);
                porterDuffColorFilter = f3477aL;
            }
            if (this.f1483bX) {
                i = Color.m4213a(200, 255, 20, 20);
                porterDuffColorFilter = f3478aM;
            }
            if (this.f1480bU) {
                i = Color.m4213a(70, 70, 70, 245);
                porterDuffColorFilter = f3479aN;
                if (this.f1483bX) {
                    i = Color.m4213a(70, 255, 20, 20);
                    porterDuffColorFilter = f3478aM;
                }
            }
            if (this.f1481bV) {
                i = Color.m4213a(150, 100, 100, 100);
            }
        }
        boolean z = u.f5516by.renderAntiAlias;
        if (!mo2842cS()) {
            z = false;
            if (u.f5574cE < 1.0f) {
                z = true;
            }
        }
        if (this.f1478bS) {
            z = EnumC0215ak.f1641af;
        }
        return m2307a(i, porterDuffColorFilter, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = this.f2970s * this.f3752dL;
        RectF cp = mo2637cp();
        f1535cX.m4136a(i, 0, i + this.f3752dL, 0 + this.f3753dM);
        u.f5514bw.mo169a(this.f3387D, f1535cX, cp, mo2538f());
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: d */
    public void mo395d(float f) {
        super.mo395d(f);
        if (this.f2964m != null) {
            AbstractC0789l u = AbstractC0789l.m638u();
            if (mo2629cY()) {
                u.f5514bw.mo140b(this.f2964m, (this.f5842dH - ((int) (this.f2964m.f5249o + 0.1f))) - u.f5547cd, (this.f5843dI - ((int) (this.f2964m.f5250p + 0.1f))) - u.f5548ce, mo2538f());
                return;
            }
            RectF cp = mo2637cp();
            f1535cX.m4136a(0, 0, 0 + this.f3752dL, 0 + this.f3753dM);
            u.f5514bw.mo169a(this.f2964m, f1535cX, cp, mo2538f());
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bw */
    public boolean mo2643bw() {
        return true;
    }
}

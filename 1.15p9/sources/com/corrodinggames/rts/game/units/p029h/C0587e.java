package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class C0587e extends AbstractC0590f {

    /* renamed from: a */
    boolean f3828a;

    /* renamed from: b */
    boolean f3829b;

    /* renamed from: c */
    float f3830c;

    /* renamed from: d */
    static C0934e f3831d = null;

    /* renamed from: e */
    static C0934e f3832e = null;

    /* renamed from: f */
    static C0934e f3833f = null;

    /* renamed from: g */
    public static C0934e f3834g = null;

    /* renamed from: h */
    public static C0934e[] f3835h = new C0934e[10];

    /* renamed from: i */
    static C0934e[] f3836i = new C0934e[10];

    /* renamed from: j */
    public static final Action f3837j = new C05881(151);

    /* renamed from: k */
    public static final Action f3838k = new C05892(152);

    /* renamed from: l */
    static ArrayList f3839l = new ArrayList();

    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3828a);
        c0859ar.mo1488a(this.f3830c);
        super.mo829a(c0859ar);
    }

    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3828a = c0876k.m1455e();
        this.f3829b = !mo3284Q();
        if (c0876k.m1463b() >= 21) {
            this.f3830c = c0876k.m1453g();
        }
        m3421K();
        super.mo2872a(c0876k);
    }

    static {
        f3839l.add(f3837j);
        f3839l.add(f3838k);
    }

    /* renamed from: v */
    public C0934e m3395v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3835h[this.f1608bV.m5267O()];
    }

    /* renamed from: b */
    public static void m3412b() {
        GameEngine m1234A = GameEngine.m1234A();
        f3832e = m1234A.f6107bO.mo930a(C0067R.drawable.attack_submarine);
        f3833f = m4772a(f3832e, f3832e.mo396m(), f3832e.mo397l());
        f3831d = m1234A.f6107bO.mo930a(C0067R.drawable.attack_submarine_dead);
        f3834g = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_water);
        f3835h = AbstractC0197n.m5244a(f3834g);
        f3836i = AbstractC0197n.m5244a(f3832e);
    }

    /* renamed from: F */
    public boolean m3424F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && this.f6953em >= 0.0f;
    }

    /* renamed from: G */
    public float m3423G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float m3422H() {
        return 0.0f;
    }

    /* renamed from: d */
    public C0934e m3408d() {
        if (this.f1606bT) {
            return f3831d;
        }
        return f3836i[this.f1608bV.m5267O()];
    }

    /* renamed from: k */
    public C0934e m3401k() {
        return f3833f;
    }

    /* renamed from: h */
    public EnumC0246ao m3402h() {
        return EnumC0246ao.WATER;
    }

    /* renamed from: c */
    public UnitType m3397r() {
        return UnitType.attackSubmarine;
    }

    /* renamed from: f */
    public boolean m3403f() {
        if (!mo3284Q()) {
            return true;
        }
        return false;
    }

    public C0587e(boolean z) {
        super(z);
        this.f3828a = false;
        this.f3829b = true;
        this.f3830c = 0.0f;
        m2873b(f3832e);
        this.f1620ch = 15.0f;
        this.f1621ci = this.f1620ch - 2.0f;
        this.f1632ct = 260.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3832e;
    }

    /* renamed from: K */
    public void m3421K() {
        if (!this.f3829b) {
            m472S(1);
        } else {
            m472S(2);
        }
    }

    /* renamed from: s */
    public void m3396s(float f) {
        float f2;
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f3828a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (C0758f.m2289c(this.f6953em - f2) > 2.0f) {
            this.f3830c = C0758f.m2362a(this.f3830c, 0.08f, 0.003f * f);
        } else {
            this.f3830c = C0758f.m2362a(this.f3830c, 0.02f, 0.003f * f);
        }
        this.f6953em = C0758f.m2362a(this.f6953em, f2, this.f3830c * f);
        boolean z = false;
        if (this.f3829b && mo3284Q()) {
            this.f3829b = false;
            m3421K();
            z = true;
        }
        if (!this.f3829b && !mo3284Q()) {
            this.f3829b = true;
            m3421K();
            z = true;
        }
        if (z) {
            m1234A.f6110bR.m2550a(this.f6951ek, this.f6952el, 0.0f, 0, 0.0f, 0.0f, this.f1617ce);
        }
    }

    /* renamed from: a */
    public void m3419a(float f) {
        super.mo4640a(f);
        if (!m4759bS() || this.f1606bT) {
        }
    }

    /* renamed from: m */
    public float m3399m() {
        if (!mo3284Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    /* renamed from: b */
    public float m3411b(int i) {
        return 170.0f;
    }

    /* renamed from: e */
    public float m3404e(int i) {
        return 10.0f;
    }

    /* renamed from: z */
    public float m3393z() {
        if (!mo3284Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    /* renamed from: A */
    public float m3428A() {
        return 1.2f;
    }

    /* renamed from: B */
    public float m3427B() {
        return 0.06f;
    }

    /* renamed from: c */
    public float m3409c(int i) {
        return 2.5f;
    }

    /* renamed from: w */
    public float m3394w(int i) {
        return 0.08f;
    }

    /* renamed from: C */
    public float m3426C() {
        return 0.018f;
    }

    /* renamed from: D */
    public float m3425D() {
        return 0.1f;
    }

    /* renamed from: d */
    public C0934e m3407d(int i) {
        return null;
    }

    /* renamed from: l */
    public boolean m3400l() {
        return true;
    }

    /* renamed from: Q */
    public boolean mo3284Q() {
        return this.f6953em < -1.0f;
    }

    /* renamed from: ah */
    public boolean m3413ah() {
        if (!mo3284Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean m3416ae() {
        if (!mo3284Q()) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    public boolean m3415af() {
        if (!mo3284Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ag */
    public boolean m3414ag() {
        if (!mo3284Q()) {
            return true;
        }
        return true;
    }

    /* renamed from: q */
    public float m3398q(int i) {
        return 42.0f;
    }

    /* renamed from: a */
    public void m3417a(Unit unit, int i) {
        if (!mo3284Q()) {
            PointF E = mo3437E(i);
            C0188f m5369a = C0188f.m5369a(this, E.f227a, E.f228b, this.f6953em, i);
            PointF K = mo3231K(i);
            m5369a.f1010K = K.f227a;
            m5369a.f1011L = K.f228b;
            m5369a.f1042ar = Color.m6127a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m5369a.f1020U = 42.0f;
            m5369a.f985l = unit;
            m5369a.f981h = 190.0f;
            m5369a.f993t = 2.0f;
            m5369a.f1058aH = true;
            m5369a.f1063aM = true;
            m5369a.f1067aQ = true;
            GameEngine m1234A = GameEngine.m1234A();
            m1234A.f6105bM.m2997a(C0631e.f4042m, 0.8f, this.f6951ek, this.f6952el);
            m1234A.f6110bR.m2552a(this.f6951ek, this.f6952el, this.f6953em, -1118720);
            return;
        }
        PointF E2 = mo3437E(i);
        C0188f m5369a2 = C0188f.m5369a(this, E2.f227a, E2.f228b, this.f6953em, i);
        PointF K2 = mo3231K(i);
        m5369a2.f1010K = K2.f227a;
        m5369a2.f1011L = K2.f228b;
        m5369a2.f1042ar = Color.m6127a(255, 30, 30, 150);
        m5369a2.f997x = 1.0f;
        m5369a2.f1020U = 42.0f;
        m5369a2.f985l = unit;
        m5369a2.f981h = 250.0f;
        m5369a2.f993t = 1.3f;
        m5369a2.f1058aH = false;
        m5369a2.f1063aM = true;
        m5369a2.f1067aQ = true;
        GameEngine.m1234A();
    }

    /* renamed from: e */
    public boolean m3406e() {
        GameEngine.m1234A().f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3831d;
        m472S(0);
        this.f1605bS = false;
        return true;
    }

    /* renamed from: a */
    public void m3418a(Action action, boolean z) {
        if (action == f3837j) {
            this.f3828a = true;
        }
        if (action == f3838k) {
            this.f3828a = false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$1.class */
    final class C05881 extends AbstractC0229x {
        C05881(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo5051a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        /* renamed from: b */
        public String mo5049b() {
            return "Surface";
        }

        /* renamed from: a */
        public boolean m3391a(Unit unit, boolean z) {
            return !((C0587e) unit).f3828a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$2.class */
    final class C05892 extends AbstractC0229x {
        C05892(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo5051a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        /* renamed from: b */
        public String mo5049b() {
            return "Dive";
        }

        /* renamed from: a */
        public boolean m3388a(Unit unit, boolean z) {
            return ((C0587e) unit).f3828a;
        }
    }

    /* renamed from: N */
    public ArrayList m3420N() {
        return f3839l;
    }

    /* renamed from: e */
    public void m3405e(float f) {
        super.mo458e(f);
        C1117y.m495a(this, m3399m());
    }
}

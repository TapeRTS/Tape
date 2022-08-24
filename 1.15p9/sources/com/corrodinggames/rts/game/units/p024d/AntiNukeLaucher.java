package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class AntiNukeLaucher extends AbstractC0498i {

    /* renamed from: c */
    boolean f3408c;

    /* renamed from: d */
    int f3409d;

    /* renamed from: e */
    float f3410e;

    /* renamed from: h */
    PointF f3411h;

    /* renamed from: i */
    Rect f3412i;

    /* renamed from: a */
    static C0934e[] f3413a = new C0934e[10];

    /* renamed from: b */
    static C0934e f3414b = null;

    /* renamed from: f */
    static C0934e f3415f = null;

    /* renamed from: g */
    static C0934e[] f3416g = new C0934e[10];

    /* renamed from: j */
    static Action f3417j = new Action(145) { // from class: com.corrodinggames.rts.game.units.d.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5177g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5185a() {
            return VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5183b() {
            return C0820a.m1882a("gui.actions.antiNukeCount", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5181c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            if (mo5182b(unit, false) == 0) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: K */
        public UnitType mo6496i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5180e() {
            return EnumC0226u.f1474a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5178f() {
            return EnumC0225t.f1464a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5182b(Unit unit, boolean z) {
            return ((AntiNukeLaucher) unit).f3409d;
        }
    };

    /* renamed from: k */
    static Action f3418k = new AbstractC0228w(144) { // from class: com.corrodinggames.rts.game.units.d.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5177g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5185a() {
            return C0820a.m1882a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5183b() {
            return C0820a.m1882a("gui.actions.buildAntiNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5181c() {
            return 4000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3780K() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            AntiNukeLaucher antiNukeLaucher = (AntiNukeLaucher) unit;
            if (antiNukeLaucher.f3409d + antiNukeLaucher.mo3831a(m5091N(), z) >= 12.0f) {
                return false;
            }
            return super.mo4748a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6496i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5178f() {
            return EnumC0225t.f1467d;
        }
    };

    /* renamed from: l */
    static ArrayList f3419l = new ArrayList();

    static {
        f3419l.add(f3417j);
        f3419l.add(f3418k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f3408c);
        c0859ar.mo1487a(this.f3409d);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3408c = c0876k.m1455e();
        if (c0876k.m1463b() >= 30) {
            this.f3409d = c0876k.m1454f();
        }
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3416g[this.f1608bV.m5401O()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3414b = m1234A.f6107bO.mo930a(C0067R.drawable.antinuke_launcher_dead);
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.antinuke_launcher);
        f3413a = AbstractC0197n.m5378a(mo930a);
        mo930a.mo395n();
        f3415f = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_building_turrent);
        f3416g = AbstractC0197n.m5378a(f3415f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3790K() {
        GameEngine.m1234A();
        this.f3880L = f3414b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1508h);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3414b;
        }
        return f3413a[this.f1608bV.m5401O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3788a(int i) {
    }

    public AntiNukeLaucher(boolean z) {
        super(z);
        this.f3411h = new PointF();
        this.f3412i = new Rect();
        this.f3880L = f3413a[f3413a.length - 1];
        m2873b(this.f3880L);
        this.f1620ch = 24.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 2800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6187a(-1, -1, 1, 1);
        this.f3422o.m6187a(-1, -1, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (m4893bS() && !this.f1606bT && this.f3409d > 0) {
            C0188f c0188f = null;
            this.f3410e = C0758f.m2363a(this.f3410e, f);
            if (this.f3410e == 0.0f) {
                this.f3410e = 15.0f;
                Iterator it = C0188f.f1082a.iterator();
                while (it.hasNext()) {
                    C0188f c0188f2 = (C0188f) it.next();
                    if (c0188f2.f1003D && c0188f2.f6953em > 50.0f && C0758f.m2361a(this.f6951ek, this.f6952el, c0188f2.f6951ek, c0188f2.f6952el) < 2200.0f * 2200.0f && C0758f.m2361a(this.f6951ek, this.f6952el, c0188f2.f987n, c0188f2.f988o) < 1000000.0f && (c0188f2.f983j == null || (!c0188f2.f983j.f1608bV.m5338d(this.f1608bV) && c0188f2.f983j.f1608bV != this.f1608bV))) {
                        if (!m3967a(c0188f2)) {
                            c0188f = c0188f2;
                        }
                    }
                }
            }
            if (c0188f != null) {
                m3964b(c0188f);
            }
        }
    }

    /* renamed from: a */
    public boolean m3967a(C0188f c0188f) {
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

    /* renamed from: b */
    public void m3964b(C0188f c0188f) {
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f3409d <= 0) {
            return;
        }
        this.f3409d--;
        PointF mo3241E = mo3241E(0);
        C0188f m5505a = C0188f.m5505a(this, mo3241E.f227a, mo3241E.f228b);
        m5505a.m472S(10);
        m5505a.f1015P = (short) 10;
        m5505a.f1017R = (short) 0;
        m5505a.f997x = 1.0f;
        m5505a.f1053aC = true;
        m5505a.f990q = c0188f;
        m5505a.f981h = 99999.0f;
        m5505a.f993t = 0.2f;
        m5505a.f991r = 6.5f;
        m5505a.f1042ar = Color.m6261a(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        m5505a.f1020U = 600.0f;
        m5505a.f1058aH = true;
        m5505a.f1063aM = true;
        m5505a.f1067aQ = true;
        m5505a.f1002C = true;
        m5505a.f1059aI = 80.0f;
        m5505a.f1060aJ = 100.0f;
        m5505a.f1062aL = 2.0f;
        m1234A.f6110bR.m2552a(mo3241E.f227a, mo3241E.f228b, this.f6953em, -1127220);
        C0745e m2526d = m1234A.f6110bR.m2526d(mo3241E.f227a, mo3241E.f228b, 0.0f, -1);
        if (m2526d != null) {
            m2526d.f4730H = 0.5f;
            m2526d.f4729G = 2.1f;
            m2526d.f4786ar = (short) 2;
            m2526d.f4745W = 90.0f;
            m2526d.f4746X = m2526d.f4745W;
            m2526d.f4744V = 0.0f;
        }
        m1234A.f6105bM.m2996a(C0631e.f4059D, 0.15f, 1.5f, mo3241E.f227a, mo3241E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3241E(int i) {
        f3980bf.m6192a(this.f6951ek, this.f6952el - 9.0f);
        return f3980bf;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3269a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3254m() {
        return 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3267c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3114b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo462c(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo4154dr() {
        return UnitType.AntiNukeLaucher;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3255l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo3799bU() {
        return super.mo3799bU();
    }

    /* renamed from: L */
    public void m3968L() {
        this.f3409d++;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3787a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3418k.m5091N())) {
            m3968L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3797cl() {
        if (this.f3409d < 4) {
            return f3418k.m5091N();
        }
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cj */
    public boolean mo3961cj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3803N() {
        return f3419l;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo4764e(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: O */
    public void mo3498O() {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ca */
    public void mo3962ca() {
        C1117y.m490a((Unit) this, 990.0f, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public boolean mo464a(GameEngine gameEngine) {
        if (this.f1643cE) {
            return true;
        }
        return super.mo464a(gameEngine);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo3966a(Unit unit, float f, C0188f c0188f) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo4940a(unit, f, c0188f);
    }
}

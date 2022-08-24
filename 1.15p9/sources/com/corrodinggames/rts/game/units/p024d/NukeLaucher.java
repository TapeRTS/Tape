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
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class NukeLaucher extends AbstractC0498i {

    /* renamed from: c */
    int f3520c;

    /* renamed from: f */
    PointF f3521f;

    /* renamed from: g */
    Rect f3522g;

    /* renamed from: a */
    static C0934e[] f3523a = new C0934e[10];

    /* renamed from: b */
    static C0934e f3524b = null;

    /* renamed from: d */
    static C0934e f3525d = null;

    /* renamed from: e */
    static C0934e[] f3526e = new C0934e[10];

    /* renamed from: h */
    static Action f3527h = new Action(142) { // from class: com.corrodinggames.rts.game.units.d.q.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return C0820a.m1882a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return C0820a.m1882a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return ((NukeLaucher) unit).f3520c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: K */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return ((NukeLaucher) unit).f3520c > 0;
        }
    };

    /* renamed from: i */
    static Action f3528i = new AbstractC0228w(143) { // from class: com.corrodinggames.rts.game.units.d.q.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return C0820a.m1882a("gui.actions.buildNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return C0820a.m1882a("gui.actions.buildNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3780K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            NukeLaucher nukeLaucher = (NukeLaucher) unit;
            if (nukeLaucher.f3520c + nukeLaucher.mo3831a(m5131N(), z) >= 4.0f) {
                return false;
            }
            return super.mo4788a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1467d;
        }
    };

    /* renamed from: j */
    static ArrayList f3529j = new ArrayList();

    static {
        f3529j.add(f3527h);
        f3529j.add(f3528i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3520c);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        this.f3520c = c0876k.m1454f();
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3526e[this.f1608bV.m5441O()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3524b = m1234A.f6107bO.mo930a(C0067R.drawable.nuke_launcher_dead);
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.nuke_launcher);
        f3523a = AbstractC0197n.m5418a(mo930a);
        mo930a.mo395n();
        f3525d = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_building);
        f3526e = AbstractC0197n.m5418a(f3525d);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo3082bp() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3790K() {
        GameEngine m1234A = GameEngine.m1234A();
        this.f3880L = f3524b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1508h);
        float f = this.f6951ek;
        float f2 = this.f6952el;
        m1234A.f6110bR.m2531b(EnumC0748h.f4830e);
        C0745e m2552a = m1234A.f6110bR.m2552a(f, f2, this.f6953em, Color.m6301a(255, 255, 255, 255));
        if (m2552a != null) {
            m2552a.f4730H = 8.0f;
            m2552a.f4729G = 5.0f;
            m2552a.f4728F = 0.9f;
            m2552a.f4745W = 20.0f;
            m2552a.f4746X = m2552a.f4745W;
            m2552a.f4720s = true;
        }
        m1234A.f6110bR.m2531b(EnumC0748h.f4830e);
        C0745e m2528c = m1234A.f6110bR.m2528c(f, f2, 0.0f, -1127220);
        if (m2528c != null) {
            m2528c.f4730H = 0.2f;
            m2528c.f4729G = 2.0f;
            m2528c.f4786ar = (short) 2;
            m2528c.f4745W = 45.0f;
            m2528c.f4746X = m2528c.f4745W;
            m2528c.f4744V = 0.0f;
        }
        m1234A.f6110bR.m2556a(this.f6951ek, this.f6952el, this.f6953em, 40.0f, 120.0f);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3524b;
        }
        return f3523a[this.f1608bV.m5441O()];
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

    public NukeLaucher(boolean z) {
        super(z);
        this.f3521f = new PointF();
        this.f3522g = new Rect();
        this.f3880L = f3523a[f3523a.length - 1];
        m2873b(this.f3880L);
        this.f1620ch = 40.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1500.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6227a(-2, -1, 2, 1);
        this.f3422o.m6227a(-2, -1, 2, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        if (!m4933bS() || this.f1606bT) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3241E(int i) {
        f3980bf.m6232a(this.f6951ek, this.f6952el - 3.0f);
        return f3980bf;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3269a(Unit unit, int i) {
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
    public UnitType mo4192dr() {
        return UnitType.NukeLaucher;
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

    /* renamed from: a */
    public void m3802a(float f, float f2) {
        GameEngine m1234A = GameEngine.m1234A();
        if (this.f3520c <= 0) {
            return;
        }
        if (C0758f.m2361a(this.f6951ek, this.f6952el, f, f2) < 202500.0f) {
            if (this.f1608bV == m1234A.f6093bs) {
                m1234A.f6111bS.m2004b("Nuke target too close");
                return;
            }
            return;
        }
        this.f3520c--;
        PointF mo3241E = mo3241E(0);
        m3801a(this, mo3241E.f227a, mo3241E.f228b, f, f2).f982i = 5.0f;
        C0745e m2552a = m1234A.f6110bR.m2552a(mo3241E.f227a, mo3241E.f228b, this.f6953em, -1127220);
        if (m2552a != null) {
            m2552a.f4744V = 5.0f;
            m2552a.f4730H = 2.1f;
            m2552a.f4729G = 2.1f;
            m2552a.f4786ar = (short) 2;
            m2552a.f4721t = true;
            m2552a.f4722u = 70.0f;
            m2552a.f4745W = 370.0f;
            m2552a.f4746X = m2552a.f4745W;
            m2552a.f4728F = 1.0f;
        }
        C0745e m2526d = m1234A.f6110bR.m2526d(mo3241E.f227a, mo3241E.f228b, 0.0f, -1);
        if (m2526d != null) {
            m2526d.f4730H = 1.0f;
            m2526d.f4729G = 3.1f;
            m2526d.f4786ar = (short) 2;
            m2526d.f4745W = 170.0f;
            m2526d.f4746X = m2526d.f4745W;
            m2526d.f4744V = 5.0f + 20.0f;
        }
        m1234A.f6105bM.m2996a(C0631e.f4059D, 0.27f, 0.8f, mo3241E.f227a, mo3241E.f228b);
    }

    /* renamed from: a */
    public static C0188f m3801a(Unit unit, float f, float f2, float f3, float f4) {
        C0188f m5545a = C0188f.m5545a(unit, f, f2);
        m5545a.m472S(10);
        m5545a.f1015P = (short) 0;
        m5545a.f1016Q = (short) 1;
        m5545a.f1017R = (short) 1;
        m5545a.f997x = 1.0f;
        m5545a.f1053aC = true;
        m5545a.f986m = true;
        m5545a.f987n = f3;
        m5545a.f988o = f4;
        m5545a.f981h = 99999.0f;
        m5545a.f993t = 0.1f;
        m5545a.f991r = 2.7f;
        m5545a.f1042ar = Color.m6301a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        m5545a.f1020U = 300.0f;
        m5545a.f1058aH = true;
        m5545a.f1063aM = true;
        m5545a.f1067aQ = true;
        m5545a.f1002C = true;
        m5545a.f1003D = true;
        m5545a.f1059aI = 80.0f;
        m5545a.f1060aJ = 100.0f;
        m5545a.f1062aL = 1.1f;
        m5545a.f1024Y = 5400.0f;
        m5545a.f1025Z = 250.0f;
        m5545a.f1029ad = true;
        m5545a.f1030ae = false;
        m5545a.f1040ao = true;
        m5545a.f1022W = 75.0f;
        m5545a.f1023X = m5545a.f1022W;
        m5545a.f1076aY = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2531b(EnumC0748h.f4830e);
        C0745e m2544a = m1234A.f6110bR.m2544a(m5545a, -1118720);
        if (m2544a != null) {
            m2544a.f4745W = 1300.0f;
            m2544a.f4746X = m2544a.f4745W;
            m2544a.f4728F = 0.2f;
            m2544a.f4730H = 1.0f;
        }
        return m5545a;
    }

    /* renamed from: L */
    public void m3804L() {
        this.f3520c++;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3787a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3528i.m5131N())) {
            m3804L();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3797cl() {
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3495a(Action action, boolean z, PointF pointF, Unit unit) {
        if (z) {
            return;
        }
        if (action == f3527h) {
            m3802a(pointF.f227a, pointF.f228b);
        } else {
            super.mo3495a(action, z, pointF, unit);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3803N() {
        return f3529j;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo4804e(f);
        C1117y.m477b((Unit) this, 450.0f, false);
    }
}

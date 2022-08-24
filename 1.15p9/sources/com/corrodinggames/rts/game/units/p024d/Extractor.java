package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class Extractor extends AbstractC0498i {

    /* renamed from: a */
    float f3446a;

    /* renamed from: b */
    int f3447b;

    /* renamed from: c */
    float f3448c;

    /* renamed from: d */
    int f3449d;

    /* renamed from: j */
    Rect f3450j;

    /* renamed from: k */
    Rect f3451k;

    /* renamed from: w */
    static ArrayList f3452w;

    /* renamed from: x */
    static ArrayList f3453x;

    /* renamed from: e */
    static C0934e[] f3454e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f3455f = new C0934e[10];

    /* renamed from: g */
    static C0934e[] f3456g = new C0934e[10];

    /* renamed from: h */
    static C0934e f3457h = null;

    /* renamed from: i */
    static C0934e f3458i = null;

    /* renamed from: l */
    public static int f3459l = 0;

    /* renamed from: t */
    static Action f3460t = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.g.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo3857g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo3863a() {
            return C0820a.m1886a("units.extractor.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo3861b() {
            return C0820a.m1886a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo3859c() {
            return UnitType.extractor.mo5191c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3865K() {
            return 6.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3862a(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3447b != 1 || extractor.mo3958a(m5539N(), z) > 0) {
                return false;
            }
            return super.mo3862a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6909i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo3858f() {
            return EnumC0225t.f1466c;
        }
    };

    /* renamed from: u */
    static Action f3461u = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.g.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo3857g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo3863a() {
            return C0820a.m1886a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo3861b() {
            return C0820a.m1886a("gui.actions.upgradeT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo3859c() {
            return UnitType.extractor.mo5191c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3865K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3862a(Unit unit, boolean z) {
            Extractor extractor = (Extractor) unit;
            if (extractor.f3447b != 2 || extractor.mo3958a(m5539N(), z) > 0) {
                return false;
            }
            return super.mo3862a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6909i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo3858f() {
            return EnumC0225t.f1466c;
        }
    };

    /* renamed from: v */
    static ArrayList f3462v = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1488a(this.f3446a);
        c0859ar.mo1482a(this.f3447b > 1);
        c0859ar.mo1487a(this.f3447b);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f3446a = c0876k.m1453g();
        int i = 1;
        if (c0876k.m1455e()) {
            i = 2;
        }
        if (c0876k.m1463b() >= 31) {
            i = c0876k.m1454f();
        }
        if (i != 1) {
            mo3212a(i);
        }
        super.mo2877a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6912r() {
        return UnitType.extractor;
    }

    static {
        f3462v.add(f3460t);
        f3452w = new ArrayList();
        f3452w.add(f3461u);
        f3453x = new ArrayList();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public boolean mo3074c(AbstractC0197n abstractC0197n) {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6104bL.m6045a(this.f6951ek, this.f6952el);
        C0180g m5991e = m1234A.f6104bL.m5991e(m1234A.f6104bL.f800T, m1234A.f6104bL.f801U);
        if (m5991e == null || !m5991e.f921i) {
            return false;
        }
        return super.mo3074c(abstractC0197n);
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        C0934e mo930a = m1234A.f6107bO.mo930a(C0067R.drawable.extractor);
        C0934e mo930a2 = m1234A.f6107bO.mo930a(C0067R.drawable.extractor_t2);
        C0934e mo930a3 = m1234A.f6107bO.mo930a(C0067R.drawable.extractor_t3);
        f3458i = m1234A.f6107bO.mo930a(C0067R.drawable.extractor_dead);
        f3454e = AbstractC0197n.m5783a(mo930a);
        f3455f = AbstractC0197n.m5783a(mo930a2);
        f3456g = AbstractC0197n.m5783a(mo930a3);
        mo930a.mo395n();
        mo930a2.mo395n();
        mo930a3.mo395n();
        f3457h = m1234A.f6107bO.mo930a(C0067R.drawable.extractor_back);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo4023K() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2563a(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = f3458i;
        this.f3420m = null;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m3002a(C0631e.f4045p, 0.8f, this.f6951ek, this.f6952el);
        C0746f.m2519a(this.f6951ek, this.f6952el).f4809j = -6684775;
        C0746f m2512b = C0746f.m2512b(this.f6951ek, this.f6952el);
        m2512b.f4789a = 500.0f;
        m2512b.f4809j = -6684775;
        m1234A.f6110bR.m2536b(EnumC0748h.f4830e);
        C0745e m2533c = m1234A.f6110bR.m2533c(this.f6951ek, this.f6952el, this.f6953em, -1127220);
        if (m2533c != null) {
            m2533c.f4730H = 0.15f;
            m2533c.f4729G = 1.0f;
            m2533c.f4786ar = (short) 2;
            m2533c.f4745W = 35.0f;
            m2533c.f4746X = m2533c.f4745W;
            m2533c.f4744V = 0.0f;
            m2533c.f4725y = -13378253;
        }
        m3089bo();
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo3088bp() {
        return 16;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3232S() {
        super.mo3232S();
        if (this.f1606bT) {
            this.f3420m = null;
        } else {
            this.f3420m = f3457h;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: M */
    public boolean mo4022M() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3271d() {
        if (this.f1606bT) {
            return f3458i;
        }
        if (this.f1608bV == null) {
            return f3454e[f3454e.length - 1];
        }
        if (this.f3447b == 3) {
            return f3456g[this.f1608bV.m5806O()];
        }
        if (this.f3447b == 2) {
            return f3455f[this.f1608bV.m5806O()];
        }
        return f3454e[this.f1608bV.m5806O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3262k() {
        return null;
    }

    public Extractor(boolean z) {
        super(z);
        this.f3447b = 1;
        this.f3448c = 0.0f;
        this.f3449d = 0;
        this.f3450j = new Rect();
        this.f3451k = new Rect();
        this.f3880L = f3454e[9];
        m2884T(37);
        m2883U(56);
        this.f1620ch = 18.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6600a(0, -1, 0, 0);
        this.f3422o.m6599a(this.f3421n);
        mo3232S();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3279a(float f) {
        super.mo3279a(f);
        if (!m5336bS() || this.f1606bT) {
            return;
        }
        this.f3448c = C0758f.m2368a(this.f3448c, f * this.f3447b);
        if (this.f3448c == 0.0f) {
            this.f3448c = 17.0f;
            this.f3449d++;
            if (this.f3449d > 7) {
                this.f3449d = 0;
            }
            if (this.f3449d <= 3) {
                this.f3426s = this.f3449d;
            } else {
                this.f3426s = 7 - this.f3449d;
            }
        }
        this.f3446a += f;
        if (this.f3446a > AbstractC0197n.f1377ao - 0.1f) {
            this.f3446a -= AbstractC0197n.f1377ao;
            this.f1608bV.m5774b(mo4017cw() * (AbstractC0197n.f1377ao / AbstractC0197n.f1376an));
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cw */
    public float mo4017cw() {
        if (this.f3447b == 3) {
            return 18.0f;
        }
        if (this.f3447b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo3274c(float f) {
        return super.mo3274c(f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3261l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3276a(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3260m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3275b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3273c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3957a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3460t.m5539N())) {
            mo3212a(2);
            m3228W();
        }
        if (c0499j.f3491j.equals(f3461u.m5539N())) {
            mo3212a(3);
            m3228W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo4018cl() {
        if (this.f3447b == 1) {
            return f3460t.m5539N();
        }
        if (this.f3447b == 2) {
            return f3461u.m5539N();
        }
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: V */
    public int mo3229V() {
        return this.f3447b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3212a(int i) {
        AbstractC0197n.m5770b((Unit) this);
        if (this.f3447b > i) {
            this.f3447b = 1;
            this.f1632ct = 800.0f;
            if (this.f1631cs > this.f1632ct) {
                this.f1631cs = this.f1632ct;
            }
        }
        if (this.f3447b < 2 && i >= 2) {
            this.f1632ct += 200.0f;
            this.f1631cs += 200.0f;
        }
        if (this.f3447b < 3 && i >= 3) {
            this.f1632ct += 1000.0f;
            this.f1631cs += 1000.0f;
        }
        this.f3447b = i;
        AbstractC0197n.m5754c(this);
        mo3232S();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo4021N() {
        if (this.f3447b == 1) {
            return f3462v;
        }
        if (this.f3447b == 2) {
            return f3452w;
        }
        return f3453x;
    }
}

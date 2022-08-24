package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class AntiAirTurret extends Turret {

    /* renamed from: a */
    static C0934e f3365a = null;

    /* renamed from: b */
    static C0934e f3366b = null;

    /* renamed from: c */
    static C0934e f3367c = null;

    /* renamed from: d */
    static C0934e[] f3368d = new C0934e[10];

    /* renamed from: e */
    public static Action f3369e = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.a.a.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5555g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5563a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5561b() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5559c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3860K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3857a(Unit unit, boolean z) {
            Turret turret = (Turret) unit;
            if (turret.f3371j || turret.mo3963a(m5469N(), z) > 0) {
                return false;
            }
            return super.mo5052a(unit, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3855b(Unit unit) {
            if (((Turret) unit).f3371j) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: L */
        public UnitType mo6868i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5556f() {
            return EnumC0225t.f1466c;
        }
    };

    /* renamed from: f */
    static ArrayList f3370f = new ArrayList();

    static {
        f3370f.add(f3369e);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3253v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3368d[this.f1608bV.m5779O()];
    }

    /* renamed from: b */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3365a = m1234A.f6107bO.mo930a(C0067R.drawable.anti_air_top);
        f3366b = m1234A.f6107bO.mo930a(C0067R.drawable.anti_air_top_l2);
        f3367c = m1234A.f6107bO.mo930a(C0067R.drawable.unit_icon_building_air_turrent);
        f3368d = AbstractC0197n.m5756a(f3367c);
    }

    public AntiAirTurret(boolean z) {
        super(z);
        this.f1632ct = 800.0f;
        this.f1631cs = this.f1632ct;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3255m() {
        if (!this.f3371j) {
            return 250.0f;
        }
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3270b(int i) {
        if (!this.f3371j) {
            return 80.0f;
        }
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3262e(int i) {
        if (!this.f3371j) {
            return super.mo3262e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo3262e(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3242E(int i) {
        if (!this.f3371j || i == 0) {
            return super.mo3242E(i);
        }
        float f = mo3282E() ? this.f1617ce : this.f1648cJ[i].f1711a;
        PointF G = mo3238G(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3980bf.m6564a(G.f227a + (C0758f.m2244i(f2) * 10.0f), G.f228b + (C0758f.m2249h(f2) * 10.0f));
        return f3980bf;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3271a(Unit unit, int i) {
        PointF mo3242E = mo3242E(i);
        C0188f m5879a = C0188f.m5879a(this, mo3242E.f227a, mo3242E.f228b);
        PointF K = m3232K(i);
        m5879a.f1010K = K.f227a;
        m5879a.f1011L = K.f228b;
        m5879a.f993t = 0.3f;
        m5879a.f991r = 6.0f;
        if (!this.f3371j) {
            m5879a.f1042ar = Color.m6633a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m5879a.f1020U = 60.0f;
            m5879a.f981h = 220.0f;
        } else {
            m5879a.f1042ar = Color.m6633a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            m5879a.f1020U = 60.0f;
            m5879a.f981h = 250.0f;
            m5879a.f993t = 0.5f;
            m5879a.f991r = 7.0f;
        }
        m5879a.f1015P = (short) 4;
        m5879a.f997x = 1.0f;
        m5879a.f985l = unit;
        m5879a.f1058aH = false;
        m5879a.f1059aI = 0.0f;
        m5879a.f1060aJ = 0.0f;
        m5879a.f1063aM = true;
        m5879a.f1067aQ = true;
        m5879a.f1057aG = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6105bM.m2996a(C0631e.f4042m, 0.3f, 1.0f + C0758f.m2288c(-0.07f, 0.07f), mo3242E.f227a, mo3242E.f228b);
        m1234A.f6110bR.m2544a(m5879a, -1118720);
        m1234A.f6110bR.m2552a(mo3242E.f227a, mo3242E.f228b, this.f6953em, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public UnitType mo6873r() {
        if (this.f3371j) {
            return UnitType.antiAirTurretT2;
        }
        return UnitType.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3265d(int i) {
        if (!this.f3371j) {
            return f3365a;
        }
        return f3366b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3141af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ag */
    public boolean mo3140ag() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret
    /* renamed from: s */
    public void mo4138s(float f) {
        if (this.f1648cJ[0].m5131a()) {
            this.f1648cJ[0].f1711a += mo3268c(0) * f * 0.1f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3260g(int i) {
        return 9.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3268c(int i) {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3285B() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: u */
    public boolean mo3013u(int i) {
        if (!this.f3371j) {
            return super.mo3013u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.mo3013u(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: v */
    public int mo3012v(int i) {
        if (!this.f3371j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bl */
    public int mo3087bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: r */
    public boolean mo3018r(int i) {
        if (!this.f3371j && i > 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3868a(C0499j c0499j) {
        if (c0499j.f3491j.equals(f3369e.m5469N())) {
            mo3207a(2);
            m3223W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public C0208c mo3863cl() {
        if (!this.f3371j) {
            return f3369e.m5469N();
        }
        return Action.f1461i;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo4157a(ArrayList arrayList) {
        arrayList.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3207a(int i) {
        if (i == 1) {
            this.f3371j = false;
        } else if (i == 2 && !this.f3371j) {
            this.f3371j = true;
            this.f1632ct += 600.0f;
            this.f1631cs += 600.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.Turret, com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3869N() {
        return f3370f;
    }
}

package com.corrodinggames.rts.game.units.p023d.p024a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0201w;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p023d.C0414i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class C0387a extends C0389b {

    /* renamed from: a */
    static C0748e f2909a = null;

    /* renamed from: b */
    static C0748e f2910b = null;

    /* renamed from: c */
    static C0748e f2911c = null;

    /* renamed from: d */
    static C0748e[] f2912d = new C0748e[10];

    /* renamed from: e */
    public static AbstractC0197s f2913e = new AbstractC0201w(102) { // from class: com.corrodinggames.rts.game.units.d.a.a.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2413g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2380a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2379b() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2415c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0201w
        /* renamed from: t */
        public float mo2543t() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2386a(AbstractC0210af afVar, boolean z) {
            C0389b bVar = (C0389b) afVar;
            if (bVar.f2923j || bVar.mo2589a(m3387J(), z) > 0) {
                return false;
            }
            return super.mo2386a(afVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2381a(AbstractC0210af afVar) {
            if (((C0389b) afVar).f2923j) {
                return false;
            }
            return true;
        }

        /* renamed from: H */
        public EnumC0215ak mo2412i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2376f() {
            return EnumC0198t.upgrade;
        }
    };

    /* renamed from: f */
    static ArrayList f2914f = new ArrayList();

    static {
        f2914f.add(f2913e);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f2912d[this.f1461bB.m3518M()];
    }

    /* renamed from: b */
    public static void m2702b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2909a = u.f5514bw.mo194a(C0063R.drawable.anti_air_top);
        f2910b = u.f5514bw.mo194a(C0063R.drawable.anti_air_top_l2);
        f2911c = u.f5514bw.mo194a(C0063R.drawable.unit_icon_building_air_turrent);
        f2912d = AbstractC0171m.m3501a(f2911c);
    }

    public C0387a(boolean z) {
        super(z);
        this.f1485bZ = 800.0f;
        this.f1484bY = this.f1485bZ;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        if (!this.f2923j) {
            return 250.0f;
        }
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        if (!this.f2923j) {
            return 80.0f;
        }
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        if (!this.f2923j) {
            return super.mo2180e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo2180e(i);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public PointF mo2345E(int i) {
        if (!this.f2923j || i == 0) {
            return super.mo2345E(i);
        }
        float f = mo2346E() ? this.f1471bL : this.f1499cn[i].f1561a;
        PointF F = mo2343F(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3485aT.m4141a(F.f224a + (C0654f.m1421i(f2) * 10.0f), F.f225b + (C0654f.m1425h(f2) * 10.0f));
        return f3485aT;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        PointF E = mo2345E(i);
        C0163f a = C0163f.m3575a(this, E.f224a, E.f225b);
        PointF J = mo2336J(i);
        a.f952K = J.f224a;
        a.f953L = J.f225b;
        a.f935t = 0.3f;
        a.f933r = 6.0f;
        if (!this.f2923j) {
            a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a.f962U = 60.0f;
            a.f923h = 220.0f;
        } else {
            a.f985ar = Color.m4213a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            a.f962U = 60.0f;
            a.f923h = 250.0f;
            a.f935t = 0.5f;
            a.f933r = 7.0f;
        }
        a.f957P = (short) 4;
        a.f939x = 1.0f;
        a.f927l = afVar;
        a.f1001aH = false;
        a.f1002aI = 0.0f;
        a.f1003aJ = 0.0f;
        a.f1006aM = true;
        a.f1010aQ = true;
        a.f1000aG = true;
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5512bu.m2114a(C0530e.f3574l, 0.3f, 1.0f + C0654f.m1458c(-0.07f, 0.07f), E.f224a, E.f225b);
        u.f5517bz.m2001a(a, -1118720);
        u.f5517bz.m2009a(E.f224a, E.f225b, this.f5844dJ, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b
    /* renamed from: c */
    public EnumC0215ak mo1606r() {
        if (this.f2923j) {
            return EnumC0215ak.antiAirTurretT2;
        }
        return EnumC0215ak.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        if (!this.f2923j) {
            return f2909a;
        }
        return f2910b;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ae */
    public boolean mo2248ae() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b
    /* renamed from: r */
    public void mo2680r(float f) {
        if (this.f1499cn[0].m3288a()) {
            this.f1499cn[0].f1561a += mo2190c(0) * f * 0.1f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 9.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: u */
    public boolean mo2136u(int i) {
        if (!this.f2923j) {
            return super.mo2136u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.mo2136u(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: v */
    public int mo2135v(int i) {
        if (!this.f2923j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bg */
    public int mo2205bg() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: r */
    public boolean mo2140r(int i) {
        if (this.f2923j || i <= 1) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0413h, com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        if (iVar.f3031h.equals(f2913e.m3387J())) {
            mo2310a(2);
            m2328U();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bX */
    public C0181c mo2546bX() {
        if (!this.f2923j) {
            return f2913e.m3387J();
        }
        return AbstractC0197s.f1356h;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2697a(ArrayList arrayList) {
        arrayList.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2310a(int i) {
        if (i == 1) {
            this.f2923j = false;
        } else if (i == 2 && !this.f2923j) {
            this.f2923j = true;
            this.f1485bZ += 600.0f;
            this.f1484bY += 600.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.p024a.C0389b, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return f2914f;
    }
}

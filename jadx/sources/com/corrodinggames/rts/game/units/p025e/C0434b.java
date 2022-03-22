package com.corrodinggames.rts.game.units.p025e;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0384d;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0191m;
import com.corrodinggames.rts.game.units.p013a.C0200v;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0814ag;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class C0434b extends AbstractC0444j implements AbstractC0384d {

    /* renamed from: i */
    PointF[] f3125i = new PointF[6];

    /* renamed from: j */
    PointF[] f3126j = new PointF[this.f3125i.length];

    /* renamed from: k */
    static Paint f3127k;

    /* renamed from: l */
    static Paint f3128l;

    /* renamed from: m */
    static Paint f3129m;

    /* renamed from: a */
    static C0748e f3117a = null;

    /* renamed from: b */
    public static C0748e f3118b = null;

    /* renamed from: c */
    static C0748e f3119c = null;

    /* renamed from: d */
    public static C0748e[] f3120d = new C0748e[10];

    /* renamed from: e */
    public static C0748e f3121e = null;

    /* renamed from: f */
    public static C0748e f3122f = null;

    /* renamed from: g */
    static C0748e f3123g = null;

    /* renamed from: h */
    public static C0748e[] f3124h = new C0748e[10];

    /* renamed from: n */
    static AbstractC0197s f3130n = new C0191m(false);

    /* renamed from: f */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.builder;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: b */
    public PointF[] mo2404b() {
        return this.f3125i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: c */
    public PointF[] mo2403c() {
        return this.f3126j;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3124h[this.f1461bB.m3518M()];
    }

    /* renamed from: K */
    public static void m2530K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3117a = u.f5514bw.mo194a(C0063R.drawable.builder);
        f3118b = u.f5514bw.mo194a(C0063R.drawable.builder_dead);
        f3119c = m3330a(f3117a, f3117a.mo349l(), f3117a.mo350k());
        f3120d = AbstractC0171m.m3501a(f3117a);
        f3121e = u.f5514bw.mo194a(C0063R.drawable.builder_charge);
        f3122f = u.f5514bw.mo194a(C0063R.drawable.builder_decharge);
        f3123g = u.f5514bw.mo194a(C0063R.drawable.unit_icon_builder);
        f3124h = AbstractC0171m.m3501a(f3123g);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2302a(AbstractC0210af afVar) {
        if (!afVar.mo2533q() && afVar.mo2643bw()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3118b;
        }
        return f3120d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3119c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u();
        this.f3387D = f3118b;
        m406R(0);
        this.f1458by = false;
        m2288a(EnumC0519u.small);
        return true;
    }

    public C0434b(boolean z) {
        super(z);
        f3127k = new Paint();
        f3127k.m4189a(40, 0, 255, 0);
        f3127k.m4173a(true);
        f3127k.m4192a(2.0f);
        f3127k.m4185a(Paint.Cap.ROUND);
        f3128l = new Paint();
        f3128l.m4183a(f3127k);
        f3128l.m4189a(55, 255, 60, 60);
        f3129m = new Paint();
        f3129m.m4189a(60, 255, 255, 255);
        m2038S(20);
        m2037T(20);
        this.f1474bO = 10.0f;
        this.f1475bP = this.f1474bO + 2.0f;
        this.f1485bZ = 170.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3117a;
        for (int i = 0; i < this.f3125i.length; i++) {
            this.f3125i[i] = new PointF();
            this.f3126j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m2529a(float f, AbstractC0384d dVar) {
        AbstractC0515r rVar = (AbstractC0515r) dVar;
        PointF[] b = dVar.mo2404b();
        PointF[] c = dVar.mo2403c();
        AbstractC0210af V = rVar.m2327V();
        rVar.f3468aC = V != null;
        if (V != null) {
            for (int i = 0; i < b.length; i++) {
                PointF pointF = b[i];
                PointF pointF2 = c[i];
                pointF.f224a = C0654f.m1521a(pointF.f224a, pointF2.f224a, 0.1f * f);
                pointF.f225b = C0654f.m1521a(pointF.f225b, pointF2.f225b, 0.1f * f);
                pointF.f224a += (pointF2.f224a - pointF.f224a) * 0.04f * f;
                pointF.f225b += (pointF2.f225b - pointF.f225b) * 0.04f * f;
                float f2 = V.f1474bO * 0.75f;
                if (C0654f.m1459c(pointF.f224a - pointF2.f224a) < 1.0f) {
                    pointF2.f224a = C0654f.m1448d(-f2, f2);
                }
                if (C0654f.m1459c(pointF.f225b - pointF2.f225b) < 1.0f) {
                    pointF2.f225b = C0654f.m1448d(-f2, f2);
                }
            }
        } else if (b[0].f224a != 0.0f || b[0].f225b != 0.0f) {
            for (int i2 = 0; i2 < b.length; i2++) {
                PointF pointF3 = b[i2];
                PointF pointF4 = c[i2];
                pointF3.f224a = 0.0f;
                pointF3.f225b = 0.0f;
                pointF4.f224a = 0.0f;
                pointF4.f225b = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public static void m2527b(float f, AbstractC0384d dVar) {
        AbstractC0515r rVar = (AbstractC0515r) dVar;
        AbstractC0210af V = rVar.m2327V();
        if (V != null) {
            boolean W = rVar.m2326W();
            AbstractC0789l u = AbstractC0789l.m638u();
            PointF[] b = dVar.mo2404b();
            Paint paint = f3127k;
            if (W) {
                paint = f3128l;
            }
            C0814ag bi = rVar.m2203bi();
            for (PointF pointF : b) {
                float f2 = (V.f5842dH + pointF.f224a) - u.f5547cd;
                float f3 = ((V.f5843dI - V.f5844dJ) + pointF.f225b) - u.f5548ce;
                u.f5514bw.mo197a((bi.f5735a + (pointF.f224a * 0.15f)) - u.f5547cd, (((bi.f5736b - bi.f5737c) + (pointF.f225b * 0.15f)) - u.f5548ce) - rVar.f5844dJ, f2, f3, paint);
                u.f5514bw.mo125j();
                u.f5514bw.mo147b(f2, f3);
                u.f5514bw.mo200a(0.5f, 0.5f);
                if (W) {
                    u.f5514bw.mo175a(f3122f, 0.0f, 0.0f, f3129m);
                } else {
                    u.f5514bw.mo175a(f3121e, 0.0f, 0.0f, f3129m);
                }
                u.f5514bw.mo124k();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            m2529a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        super.mo403a(f, z);
        if (!this.f1459bz) {
            m2527b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: f */
    public float mo2177f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f1459bz) {
            return true;
        }
        float e = this.f1499cn[0].f1566f / mo2180e(0);
        if (e == 0.0f) {
            return true;
        }
        C0814ag bi = m2203bi();
        u.f5514bw.mo127h();
        u.f5514bw.mo147b(bi.f5735a - u.f5547cd, (bi.f5736b - bi.f5737c) - u.f5548ce);
        u.f5514bw.mo200a(e, e);
        if (m2326W()) {
            u.f5514bw.mo175a(f3122f, 0.0f, 0.0f, (Paint) null);
        } else {
            u.f5514bw.mo175a(f3121e, 0.0f, 0.0f, (Paint) null);
        }
        u.f5514bw.mo126i();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        if (m3298cu()) {
            return 0.6f;
        }
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        if (m3298cu()) {
            return 1.7f;
        }
        return 3.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
    }

    /* renamed from: a */
    public static void m2528a(ArrayList arrayList, int i) {
        arrayList.add(f3130n);
        arrayList.add(new C0200v(EnumC0215ak.extractor, 1, 1));
        arrayList.add(new C0200v(EnumC0215ak.turret, 1, 2));
        arrayList.add(new C0200v(EnumC0215ak.antiAirTurret, 1, 3));
        arrayList.add(new C0200v(EnumC0215ak.landFactory, 1, 4));
        arrayList.add(new C0200v(EnumC0215ak.airFactory, 1, 5));
        arrayList.add(new C0200v(EnumC0215ak.seaFactory, 1, 6));
        arrayList.add(new C0200v(EnumC0215ak.laserDefence, 1, 7));
        arrayList.add(new C0200v(EnumC0215ak.repairbay, 1, 8));
        arrayList.add(new C0200v(EnumC0215ak.fabricator, 1, 9));
        arrayList.add(new C0200v(EnumC0215ak.experimentalLandFactory, 1, 10));
        arrayList.add(new C0200v(EnumC0215ak.NukeLaucher, 1, 14));
        arrayList.add(new C0200v(EnumC0215ak.AntiNukeLaucher, 1, 15));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return mo1606r().mo2798a(mo2329T());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && !this.f1459bz;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: w */
    public boolean mo2398w(AbstractC0210af afVar) {
        return true;
    }
}

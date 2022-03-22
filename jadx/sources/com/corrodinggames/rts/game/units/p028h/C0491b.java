package com.corrodinggames.rts.game.units.p028h;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0384d;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0191m;
import com.corrodinggames.rts.game.units.p013a.C0200v;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class C0491b extends AbstractC0497f implements AbstractC0384d {

    /* renamed from: f */
    PointF[] f3339f = new PointF[6];

    /* renamed from: g */
    PointF[] f3340g = new PointF[this.f3339f.length];

    /* renamed from: h */
    Rect f3341h = new Rect();

    /* renamed from: a */
    static C0748e f3334a = null;

    /* renamed from: b */
    static C0748e f3335b = null;

    /* renamed from: c */
    static C0748e f3336c = null;

    /* renamed from: d */
    static C0748e f3337d = null;

    /* renamed from: e */
    static C0748e[] f3338e = new C0748e[10];

    /* renamed from: i */
    static AbstractC0197s f3342i = new C0191m(false);

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return C0434b.f3124h[this.f1461bB.m3518M()];
    }

    /* renamed from: p_ */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.builderShip;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: b */
    public PointF[] mo2404b() {
        return this.f3339f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: c */
    public PointF[] mo2403c() {
        return this.f3340g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bB */
    public float mo2395bB() {
        return 6000.0f;
    }

    /* renamed from: K */
    public static void m2406K() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f3335b = u.f5514bw.mo194a(C0063R.drawable.builder_ship);
        f3334a = u.f5514bw.mo194a(C0063R.drawable.builder_ship_dead);
        f3336c = u.f5514bw.mo194a(C0063R.drawable.builder_ship_turret);
        f3338e = AbstractC0171m.m3501a(f3335b);
        f3337d = m3330a(f3335b, f3335b.mo349l(), f3335b.mo350k());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f3334a;
        }
        return f3338e[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return f3336c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return f3337d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2344F() {
        return AbstractC0789l.m638u().f5516by.renderExtraShadows && this.f5844dJ > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2342G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2340H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l.m638u().f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = f3334a;
        m406R(0);
        this.f1458by = false;
        return true;
    }

    public C0491b(boolean z) {
        super(z);
        m2035b(f3335b);
        this.f1474bO = 13.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 500.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f3335b;
        for (int i = 0; i < this.f3339f.length; i++) {
            this.f3339f[i] = new PointF();
            this.f3340g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2352B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: w */
    public float mo2134w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.p028h.AbstractC0497f, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            C0434b.m2529a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        super.mo403a(f, z);
        if (!this.f1459bz) {
            C0434b.m2527b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        AbstractC0789l u = AbstractC0789l.m638u();
        C0851y.m420a((AbstractC0515r) this);
        if (this.f1459bz) {
            return true;
        }
        float e = this.f1499cn[0].f1566f / mo2180e(0);
        if (e == 0.0f) {
            return true;
        }
        PointF E = mo2345E(0);
        u.f5514bw.mo127h();
        u.f5514bw.mo147b(E.f224a - u.f5547cd, (E.f225b - u.f5548ce) - this.f5844dJ);
        u.f5514bw.mo200a(e, e);
        if (m2326W()) {
            u.f5514bw.mo175a(C0434b.f3122f, 0.0f, 0.0f, (Paint) null);
        } else {
            u.f5514bw.mo175a(C0434b.f3121e, 0.0f, 0.0f, (Paint) null);
        }
        u.f5514bw.mo126i();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bg */
    public int mo2205bg() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public PointF mo2343F(int i) {
        f3486aU.m4141a(this.f5842dH + (C0654f.m1421i(this.f1471bL) * 8.0f), this.f5843dI + (C0654f.m1425h(this.f1471bL) * 8.0f));
        return f3486aU;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 120 - (i * 28);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2302a(AbstractC0210af afVar) {
        if (!afVar.mo2533q() && afVar.mo2643bw()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
    }

    /* renamed from: a */
    public static void m2405a(ArrayList arrayList, int i) {
        arrayList.add(f3342i);
        arrayList.add(new C0200v(EnumC0215ak.extractor, 1, 1));
        arrayList.add(new C0200v(EnumC0215ak.turret, 1, 2));
        arrayList.add(new C0200v(EnumC0215ak.antiAirTurret, 1, 3));
        arrayList.add(new C0200v(EnumC0215ak.landFactory, 1, 4));
        arrayList.add(new C0200v(EnumC0215ak.airFactory, 1, 5));
        arrayList.add(new C0200v(EnumC0215ak.seaFactory, 1, 6));
        arrayList.add(new C0200v(EnumC0215ak.fabricator, 1, 7));
        arrayList.add(new C0200v(EnumC0215ak.laserDefence, 1, 8));
        arrayList.add(new C0200v(EnumC0215ak.repairbay, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2390M() {
        return mo1606r().mo2798a(mo2329T());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: y */
    public int mo2397y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: w */
    public boolean mo2398w(AbstractC0210af afVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: f */
    public float mo2402f(AbstractC0268al alVar) {
        int y = mo2397y();
        int a = alVar.mo2796a(this);
        if (a == 0 && alVar.mo2740p()) {
            a = 110;
        }
        return y + a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: s */
    public int mo2400s(AbstractC0210af afVar) {
        return (int) mo2402f(afVar.mo1606r());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: t */
    public int mo2399t(AbstractC0210af afVar) {
        return (int) mo2402f(afVar.mo1606r());
    }
}

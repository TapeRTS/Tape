package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p025e.AbstractC0444j;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g.class */
public class C0461g extends AbstractC0444j implements AbstractC0384d {

    /* renamed from: a */
    public boolean f3278a;

    /* renamed from: b */
    PointF[] f3279b = new PointF[6];

    /* renamed from: c */
    PointF[] f3280c = new PointF[this.f3279b.length];

    /* renamed from: d */
    static Paint f3281d;

    /* renamed from: e */
    static Paint f3282e;

    /* renamed from: f */
    static Paint f3283f;

    /* renamed from: g */
    int f3284g;

    /* renamed from: h */
    float f3285h;

    /* renamed from: i */
    float f3286i;

    /* renamed from: j */
    int f3287j;

    /* renamed from: f */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.builder;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: b */
    public PointF[] mo2404b() {
        return this.f3279b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: c */
    public PointF[] mo2403c() {
        return this.f3280c;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2355v() {
        if (this.f1461bB.f1239i == -1) {
            return null;
        }
        return f3186do[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2302a(AbstractC0210af afVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return C0434b.f3118b;
        }
        return C0434b.f3120d[this.f1461bB.m3518M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2159k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2184d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2359e() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5517bz.m1994b(this.f5842dH, this.f5843dI, this.f5844dJ);
        this.f3387D = C0434b.f3118b;
        m406R(0);
        this.f1458by = false;
        u.f5512bu.m2115a(C0530e.f3576n, 0.8f, this.f5842dH, this.f5843dI);
        mo2200bl();
        return true;
    }

    public C0461g(boolean z) {
        super(z);
        f3281d = new Paint();
        f3281d.m4189a(40, 0, 255, 0);
        f3281d.m4173a(true);
        f3281d.m4192a(2.0f);
        f3281d.m4185a(Paint.Cap.ROUND);
        f3282e = new Paint();
        f3282e.m4183a(f3281d);
        f3282e.m4189a(55, 255, 60, 60);
        f3283f = new Paint();
        f3283f.m4189a(60, 255, 255, 255);
        m2038S(20);
        m2037T(20);
        this.f1474bO = 10.0f;
        this.f5842dH = -1000.0f;
        this.f5843dI = -1000.0f;
        this.f1475bP = this.f1474bO;
        this.f1485bZ = 170000.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = C0434b.f3118b;
        for (int i = 0; i < this.f3279b.length; i++) {
            this.f3279b[i] = new PointF();
            this.f3280c[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m2448a(float f, AbstractC0384d dVar) {
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

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (!this.f1459bz) {
            m2448a(f, this);
        }
        this.f1484bY = this.f1485bZ;
        this.f3284g++;
        this.f3285h += f;
        this.f3286i += f;
        AbstractC0789l.m638u();
        if (this.f3278a) {
            AbstractC0789l.m670d("Stress test active");
            for (int i = 0; i < 6000; i++) {
                m2446w();
            }
            m3319bU();
        } else if (this.f3286i > 3.0f) {
            this.f3286i = 0.0f;
            m2446w();
        }
    }

    /* renamed from: w */
    public void m2446w() {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f3287j++;
        AbstractC0268al alVar = (AbstractC0268al) EnumC0215ak.f1639ad.get(C0654f.m1499a((AbstractC0854w) this, 0, EnumC0215ak.f1639ad.size() - 1, 1 + this.f3287j));
        boolean z = true;
        if (C0368l.f2484b == alVar) {
            z = false;
        }
        if (alVar == EnumC0215ak.spreadingFire) {
            z = false;
        }
        if (z) {
            AbstractC0210af a = alVar.mo2799a();
            a.f5842dH = C0654f.m1499a((AbstractC0854w) this, 200, ((int) u.f5511bt.m3649f()) - 200, 2 + this.f3284g + this.f3287j);
            a.f5843dI = C0654f.m1499a((AbstractC0854w) this, 200, ((int) u.f5511bt.m3646g()) - 200, 3 + this.f3284g + this.f3287j + (this.f3287j * 9));
            try {
                a.m3341P(C0654f.m1499a((AbstractC0854w) this, 0, 3, 4 + this.f3284g + this.f3287j + (this.f3287j * 9)));
                AbstractC0171m.m3473c(a);
                if (a.mo1607o_()) {
                    a.mo405a();
                }
                if (a.mo2862bC()) {
                    a.mo405a();
                }
            } catch (C0154f e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
        if (!this.f1459bz) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2180e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: f */
    public float mo2177f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        if (!super.mo396c(f)) {
            return false;
        }
        AbstractC0789l.m638u();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: x */
    public boolean mo2133x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: y */
    public int mo2397y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: b */
    public float mo2426b(AbstractC0210af afVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: c */
    public float mo2425c(AbstractC0210af afVar) {
        return 1.0E7f;
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
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        if (m3298cu()) {
            return 4.7f;
        }
        return 4.8f;
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
    /* renamed from: o_ */
    public boolean mo1607o_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public boolean mo2338I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: d */
    public boolean mo2360d(AbstractC0210af afVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: J */
    public boolean mo2365J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public float mo2362a(AbstractC0210af afVar, float f, C0163f fVar) {
        return super.mo2362a(afVar, 0.0f, fVar);
    }
}

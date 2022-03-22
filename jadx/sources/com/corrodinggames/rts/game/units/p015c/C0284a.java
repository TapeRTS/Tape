package com.corrodinggames.rts.game.units.p015c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0178a;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.p025e.AbstractC0444j;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.game.units.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class C0284a extends AbstractC0444j {

    /* renamed from: a */
    static C0748e f1747a = null;

    /* renamed from: b */
    static C0748e f1748b = null;

    /* renamed from: c */
    static C0748e f1749c = null;

    /* renamed from: d */
    static C0748e[] f1750d = new C0748e[10];

    /* renamed from: e */
    int f1751e = 0;

    /* renamed from: f */
    float f1752f = 0.0f;

    /* renamed from: g */
    Rect f1753g = new Rect();

    /* renamed from: h */
    Rect f1754h = new Rect();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.ladybug;
    }

    /* renamed from: c */
    public static void m3209c() {
        f1748b = AbstractC0789l.m638u().f5514bw.mo194a(C0063R.drawable.ladybug);
        f1750d = AbstractC0171m.m3501a(f1748b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2187d() {
        if (this.f1459bz) {
            return f1747a;
        }
        return f1750d[this.f1461bB.m3518M()];
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
        if (u.f5517bz.m1989b(this.f5842dH, this.f5843dI, this.f5844dJ, EnumC0572d.blood, false, EnumC0576h.high) != null) {
        }
        u.f5512bu.m2115a(C0530e.f3588z, 0.8f, this.f5842dH, this.f5843dI);
        C0169k.m3536a(this, 1);
        return false;
    }

    public C0284a(boolean z) {
        super(z);
        m2038S(17);
        m2037T(26);
        this.f1474bO = 5.0f;
        this.f1475bP = this.f1474bO + 3.0f;
        this.f1485bZ = 130.0f;
        this.f1484bY = this.f1485bZ;
        this.f3387D = f1748b;
        this.f3397G = EnumC0178a.outOfRange;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a_ */
    public Rect mo2479a_(boolean z) {
        int i = this.f1751e * this.f3752dL;
        this.f1753g.m4136a(i, 0, i + this.f3752dL, 0 + this.f3753dM);
        return this.f1753g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bD */
    public boolean mo2861bD() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bC */
    public boolean mo2862bC() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (this.f1498cm) {
            if (this.f1751e == 0) {
                this.f1751e = 1;
            } else {
                this.f1751e = 0;
            }
        }
        if (this.f1752f != 0.0f) {
            this.f1752f = C0654f.m1522a(this.f1752f, f);
            this.f1751e = 2;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        C0163f.m3572a((AbstractC0210af) this, afVar, 14.0f, (C0163f) null, false);
        this.f1752f = 4.0f;
        PointF E = mo2345E(i);
        AbstractC0789l.m638u().f5512bu.m2115a(C0530e.f3589A, 0.3f, E.f224a, E.f225b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2130z() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2354A() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2350C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2348D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: ad */
    public boolean mo2249ad() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2173g(int i) {
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2346E() {
        return true;
    }
}

package com.corrodinggames.rts.game.units.p023d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public abstract class AbstractC0413h extends AbstractC0403c implements AbstractC0416k {

    /* renamed from: y */
    public static final Paint f3020y = new Paint();

    /* renamed from: z */
    C0415j f3021z = mo2577da();

    /* renamed from: A */
    Rect f3022A = new Rect();

    /* renamed from: B */
    Rect f3023B = new Rect();

    static {
        f3020y.m4189a(255, 0, 255, 0);
        f3020y.m4192a(1.5f);
        f3020y.m4173a(true);
    }

    public AbstractC0413h(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f2969r);
        this.f3021z.m2601a(apVar);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        if (kVar.m1071b() >= 69) {
            mo2626Q(kVar.m1062f());
        }
        this.f3021z.m2600a(kVar);
        super.mo399a(kVar);
    }

    /* renamed from: da */
    public C0415j mo2577da() {
        return new C0415j(this);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: b */
    public void mo2588b(C0414i iVar) {
    }

    /* renamed from: a */
    public void mo2548a(C0414i iVar) {
        float f;
        if (this.f3021z.f3036b != null) {
            f = this.f1474bO * 2.0f;
        } else {
            f = this.f1474bO * 3.0f;
        }
        AbstractC0210af a = this.f3021z.m2602a(iVar, f, false, 0.0f);
        if (a != null) {
            if (a.f5843dI - a.f1474bO < this.f5843dI + mo2552db()) {
                a.f5843dI = this.f5843dI + mo2552db() + a.f1474bO;
            }
            AbstractC0171m.m3473c(a);
        }
    }

    /* renamed from: db */
    public int mo2552db() {
        return -100;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: h */
    public int mo2581h(boolean z) {
        return this.f3021z.m2611a(AbstractC0197s.f1356h, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public final int mo2589a(C0181c cVar, boolean z) {
        return this.f3021z.m2612a(cVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: dc */
    public C0414i mo2587dc() {
        return this.f3021z.m2599b();
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: dd */
    public C0835m mo2586dd() {
        return this.f3021z.f3037c;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: h */
    public int mo2582h(AbstractC0268al alVar) {
        return this.f3021z.m2604a(alVar);
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: de */
    public boolean mo2585de() {
        return this.f3021z.m2614a();
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: df */
    public void mo2584df() {
        this.f3021z.f3039e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: a */
    public void mo2590a(PointF pointF) {
        this.f3021z.f3036b = pointF;
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0416k
    /* renamed from: dg */
    public boolean mo2583dg() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bH */
    public float mo2564bH() {
        if (!m3321bG() || this.f3021z.m2614a()) {
            return super.mo2564bH();
        }
        return this.f3021z.f3039e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public AbstractC0197s mo2616e(AbstractC0268al alVar) {
        return this.f3021z.m2597b(alVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2389a(AbstractC0197s sVar, boolean z) {
        this.f3021z.m2608a(sVar, z, (PointF) null, (AbstractC0210af) null);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: b */
    public void mo2619b(AbstractC0197s sVar, boolean z) {
        this.f3021z.m2609a(sVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: b */
    public void mo2620b(AbstractC0197s sVar) {
        this.f3021z.m2610a(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        if (m3321bG() && !this.f1459bz) {
            this.f3021z.m2613a(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p023d.AbstractC0403c, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return super.mo396c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bq */
    public void mo2195bq() {
        AbstractC0171m.m3508a((AbstractC0210af) this);
        this.f3021z.m2594e();
        super.mo2195bq();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0566ay, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        AbstractC0171m.m3508a((AbstractC0210af) this);
        this.f3021z.m2594e();
        super.mo405a();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2356l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2299a(AbstractC0210af afVar, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2152m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2222b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2190c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: bM */
    public void mo2618bM() {
        if (this.f3021z.f3036b != null) {
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5514bw.mo197a((int) (this.f5842dH - u.f5547cd), (int) (this.f5843dI - u.f5548ce), (int) (this.f3021z.f3036b.f224a - u.f5547cd), (int) (this.f3021z.f3036b.f225b - u.f5548ce), f3020y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cW */
    public int mo2617cW() {
        return this.f3021z.m2593f();
    }
}

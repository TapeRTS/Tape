package com.corrodinggames.rts.game.units.buildings;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public abstract class AbstractC0498i extends AbstractC0488d implements InterfaceC0501l {

    /* renamed from: y */
    public static final Paint f3476y = new Paint();

    /* renamed from: z */
    C0500k f3477z;

    /* renamed from: A */
    Rect f3478A;

    /* renamed from: B */
    Rect f3479B;

    static {
        f3476y.m7267a(255, 0, 255, 0);
        f3476y.m7270a(1.5f);
        f3476y.m7248a(true);
    }

    public AbstractC0498i(boolean z) {
        super(z);
        this.f3477z = m4416dr();
        this.f3478A = new Rect();
        this.f3479B = new Rect();
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3425r);
        this.f3477z.m4390a(c0859ar);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        if (c0876k.m1463b() >= 69) {
            m4519R(c0876k.m1454f());
        }
        this.f3477z.m4389a(c0876k);
        super.mo2877a(c0876k);
    }

    /* renamed from: dr */
    public C0500k m4416dr() {
        return new C0500k(this);
    }

    /* renamed from: b */
    public void m4423b(C0499j c0499j) {
    }

    /* renamed from: c */
    public boolean m4417c(C0499j c0499j) {
        return true;
    }

    /* renamed from: a */
    public void m4426a(C0499j c0499j) {
        float f;
        if (this.f3477z.f3495b != null) {
            f = this.radius * 2.0f;
        } else {
            f = this.radius * 3.0f;
        }
        Unit m4391a = this.f3477z.m4391a(c0499j, f, false, 0.0f);
        if (m4391a != null) {
            if (m4391a.f6952el - m4391a.radius < this.f6952el + m4415ds()) {
                m4391a.f6952el = this.f6952el + m4415ds() + m4391a.radius;
            }
            Team.m6353c(m4391a);
        }
    }

    /* renamed from: ds */
    public int m4415ds() {
        return -100;
    }

    /* renamed from: f */
    public int m4408f(boolean z) {
        return this.f3477z.m4402a(Action.f1461i, z, true);
    }

    /* renamed from: a */
    public final int m4429a(C0208c c0208c, boolean z) {
        return this.f3477z.m4403a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j m4414dt() {
        return this.f3477z.m4387b();
    }

    /* renamed from: bD */
    public C0424b m4422bD() {
        return this.f3477z.m4383c();
    }

    /* renamed from: du */
    public C1101m m4413du() {
        return this.f3477z.f3496c;
    }

    /* renamed from: h */
    public int m4407h(InterfaceC0303as interfaceC0303as) {
        return this.f3477z.m4395a(interfaceC0303as);
    }

    /* renamed from: dv */
    public boolean m4412dv() {
        return this.f3477z.m4405a();
    }

    /* renamed from: dw */
    public void m4411dw() {
        this.f3477z.f3498e = 1.0f;
    }

    /* renamed from: a */
    public void m4430a(PointF pointF) {
        this.f3477z.f3495b = pointF;
    }

    /* renamed from: dx */
    public boolean m4410dx() {
        return false;
    }

    /* renamed from: bU */
    public float m4421bU() {
        if (isActive() && !this.f3477z.m4405a()) {
            return this.f3477z.f3498e;
        }
        return super.m5857bU();
    }

    /* renamed from: e */
    public Action m4409e(InterfaceC0303as interfaceC0303as) {
        return this.f3477z.m4385b(interfaceC0303as);
    }

    /* renamed from: a */
    public void m4428a(Action action, boolean z) {
        this.f3477z.m4399a(action, z, (PointF) null, (Unit) null);
    }

    /* renamed from: b */
    public void m4424b(Action action, boolean z) {
        this.f3477z.m4400a(action, z);
    }

    /* renamed from: b */
    public void m4425b(Action action) {
        this.f3477z.m4401a(action);
    }

    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!isActive() || this.isDead) {
            return;
        }
        this.f3477z.m4404a(f);
    }

    /* renamed from: c */
    public boolean m4418c(float f) {
        return super.m4512c(f);
    }

    /* renamed from: bv */
    public void m4419bv() {
        Team.m6389a((Unit) this);
        this.f3477z.m4388a(true);
        super.mo3083bv();
    }

    /* renamed from: a */
    public void m4431a() {
        Team.m6389a((Unit) this);
        this.f3477z.m4388a(true);
        super.mo2880a();
    }

    /* renamed from: l */
    public boolean mo3499l() {
        return false;
    }

    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float getMaxAttackRange() {
        return 0.0f;
    }

    /* renamed from: b */
    public float getShootDelay(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 0.0f;
    }

    /* renamed from: bZ */
    public void m4420bZ() {
        if (this.f3477z.f3495b != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.graphics.mo932a((int) (this.f6951ek - gameEngine.f6138cv), (int) (this.f6952el - gameEngine.f6139cw), (int) (this.f3477z.f3495b.x - gameEngine.f6138cv), (int) (this.f3477z.f3495b.y - gameEngine.f6139cw), f3476y);
        }
    }

    /* renamed from: a */
    public int m4427a(C0448g c0448g) {
        return this.f3477z.m4393a(c0448g);
    }
}

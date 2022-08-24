package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
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
        f3476y.m6112a(255, 0, 255, 0);
        f3476y.m6115a(1.5f);
        f3476y.mo6093a(true);
    }

    public AbstractC0498i(boolean z) {
        super(z);
        this.f3477z = mo3721dr();
        this.f3478A = new Rect();
        this.f3479B = new Rect();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f3425r);
        this.f3477z.m3750a(c0859ar);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        if (c0876k.m1463b() >= 69) {
            m3862R(c0876k.m1454f());
        }
        this.f3477z.m3749a(c0876k);
        super.mo2872a(c0876k);
    }

    /* renamed from: dr */
    public C0500k mo3721dr() {
        return new C0500k(this);
    }

    /* renamed from: b */
    public void mo3735b(C0499j c0499j) {
    }

    /* renamed from: c */
    public boolean mo3734c(C0499j c0499j) {
        return true;
    }

    /* renamed from: a */
    public void mo3692a(C0499j c0499j) {
        float f;
        if (this.f3477z.f3495b != null) {
            f = this.f1620ch * 2.0f;
        } else {
            f = this.f1620ch * 3.0f;
        }
        Unit m3751a = this.f3477z.m3751a(c0499j, f, false, 0.0f);
        if (m3751a != null) {
            if (m3751a.f6952el - m3751a.f1620ch < this.f6952el + mo3686ds()) {
                m3751a.f6952el = this.f6952el + mo3686ds() + m3751a.f1620ch;
            }
            AbstractC0197n.m5215c(m3751a);
        }
    }

    /* renamed from: ds */
    public int mo3686ds() {
        return -100;
    }

    /* renamed from: f */
    public int mo3728f(boolean z) {
        return this.f3477z.m3762a(Action.f1461i, z, true);
    }

    /* renamed from: a */
    public final int mo3736a(C0208c c0208c, boolean z) {
        return this.f3477z.m3763a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo3733dt() {
        return this.f3477z.m3747b();
    }

    /* renamed from: bD */
    public C0424b m3770bD() {
        return this.f3477z.m3743c();
    }

    /* renamed from: du */
    public C1101m mo3732du() {
        return this.f3477z.f3496c;
    }

    /* renamed from: h */
    public int mo3727h(InterfaceC0303as interfaceC0303as) {
        return this.f3477z.m3755a(interfaceC0303as);
    }

    /* renamed from: dv */
    public boolean mo3731dv() {
        return this.f3477z.m3765a();
    }

    /* renamed from: dw */
    public void mo3730dw() {
        this.f3477z.f3498e = 1.0f;
    }

    /* renamed from: a */
    public void mo3737a(PointF pointF) {
        this.f3477z.f3495b = pointF;
    }

    /* renamed from: dx */
    public boolean mo3729dx() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo3704bU() {
        if (m4759bS() && !this.f3477z.m3765a()) {
            return this.f3477z.f3498e;
        }
        return super.mo3704bU();
    }

    /* renamed from: e */
    public Action m3767e(InterfaceC0303as interfaceC0303as) {
        return this.f3477z.m3745b(interfaceC0303as);
    }

    /* renamed from: a */
    public void m3774a(Action action, boolean z) {
        this.f3477z.m3759a(action, z, (PointF) null, (Unit) null);
    }

    /* renamed from: b */
    public void m3771b(Action action, boolean z) {
        this.f3477z.m3760a(action, z);
    }

    /* renamed from: b */
    public void m3772b(Action action) {
        this.f3477z.m3761a(action);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo4640a(f);
        if (!m4759bS() || this.f1606bT) {
            return;
        }
        this.f3477z.m3764a(f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo462c(f);
    }

    /* renamed from: bv */
    public void m3768bv() {
        AbstractC0197n.m5251a((Unit) this);
        this.f3477z.m3748a(true);
        super.mo3076bv();
    }

    /* renamed from: a */
    public void mo2875a() {
        AbstractC0197n.m5251a((Unit) this);
        this.f3477z.m3748a(true);
        super.mo2875a();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3255l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3269a(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3254m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3268b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3267c(int i) {
        return 0.0f;
    }

    /* renamed from: bZ */
    public void m3769bZ() {
        if (this.f3477z.f3495b != null) {
            GameEngine m1234A = GameEngine.m1234A();
            m1234A.f6107bO.mo932a((int) (this.f6951ek - m1234A.f6138cv), (int) (this.f6952el - m1234A.f6139cw), (int) (this.f3477z.f3495b.f227a - m1234A.f6138cv), (int) (this.f3477z.f3495b.f228b - m1234A.f6139cw), f3476y);
        }
    }

    /* renamed from: a */
    public int m3773a(C0448g c0448g) {
        return this.f3477z.m3753a(c0448g);
    }
}

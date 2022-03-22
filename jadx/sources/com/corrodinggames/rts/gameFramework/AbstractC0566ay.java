package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p039j.C0748e;

/* renamed from: com.corrodinggames.rts.gameFramework.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ay.class */
public abstract class AbstractC0566ay extends AbstractC0567az {

    /* renamed from: dL */
    public int f3752dL;

    /* renamed from: dM */
    public int f3753dM;

    /* renamed from: dN */
    public int f3754dN;

    /* renamed from: dO */
    public int f3755dO;

    /* renamed from: dP */
    public boolean f3756dP;

    /* renamed from: b */
    public void m2035b(C0748e eVar) {
        m2038S(eVar.f5245k);
        m2037T(eVar.f5246l);
        this.f3756dP = true;
    }

    /* renamed from: a */
    public void m2036a(C0748e eVar, int i) {
        m2038S(eVar.f5245k / i);
        m2037T(eVar.f5246l);
        this.f3756dP = false;
    }

    /* renamed from: S */
    public void m2038S(int i) {
        this.f3752dL = i;
        this.f3754dN = i / 2;
    }

    /* renamed from: T */
    public void m2037T(int i) {
        this.f3753dM = i;
        this.f3755dO = i / 2;
    }

    protected AbstractC0566ay(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo405a() {
        super.mo405a();
    }
}

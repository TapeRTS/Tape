package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.gameFramework.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class AbstractC0567az extends AbstractC0854w {

    /* renamed from: dQ */
    public int f3757dQ = 0;

    protected AbstractC0567az(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1127d("xy is:");
        apVar.mo1096a(this.f5842dH);
        apVar.mo1096a(this.f5843dI);
        apVar.mo1096a(this.f5844dJ);
        apVar.mo1095a(this.f3757dQ);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f5842dH = kVar.m1061g();
        this.f5843dI = kVar.m1061g();
        this.f5844dJ = kVar.m1061g();
        this.f3757dQ = kVar.m1062f();
        super.mo399a(kVar);
    }
}

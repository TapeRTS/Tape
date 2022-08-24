package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.gameFramework.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class AbstractC0668az extends AbstractC1120w {

    /* renamed from: et */
    public int f4228et;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0668az(boolean z) {
        super(z);
        this.f4228et = 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2611a(C0859ar c0859ar) {
        c0859ar.m1545d("xy is:");
        c0859ar.mo1482a(this.f6951ek);
        c0859ar.mo1482a(this.f6952el);
        c0859ar.mo1482a(this.f6953em);
        c0859ar.mo1481a(this.f4228et);
        super.mo2611a(c0859ar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2876a(C0876k c0876k) {
        this.f6951ek = c0876k.m1447g();
        this.f6952el = c0876k.m1447g();
        this.f6953em = c0876k.m1447g();
        this.f4228et = c0876k.m1448f();
        super.mo2876a(c0876k);
    }
}

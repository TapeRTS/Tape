package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ai.class */
public class C0790ai extends AbstractC0792ak {

    /* renamed from: a */
    private boolean f5081a;

    public C0790ai(float f, float f2, boolean z) {
        super(f, f2);
        this.f5081a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public boolean mo2090a(AbstractC0792ak abstractC0792ak) {
        return super.mo2090a(abstractC0792ak) && (abstractC0792ak instanceof C0790ai) && ((C0790ai) abstractC0792ak).f5081a == this.f5081a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    public void mo2088b(AbstractC0792ak abstractC0792ak) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    protected long mo2089b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public String mo2091a() {
        if (this.f5086g == null) {
            if (this.f5081a) {
                this.f5086g = C0820a.m1880a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.f5086g = C0820a.m1880a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.f5086g;
    }
}

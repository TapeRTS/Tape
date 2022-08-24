package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ah.class */
public class C0789ah extends AbstractC0792ak {

    /* renamed from: a */
    InterfaceC0303as f5079a;

    /* renamed from: b */
    int f5080b;

    public C0789ah(float f, float f2, InterfaceC0303as interfaceC0303as) {
        super(f, f2);
        this.f5079a = interfaceC0303as;
        this.f5080b = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public boolean mo2090a(AbstractC0792ak abstractC0792ak) {
        return super.mo2090a(abstractC0792ak) && (abstractC0792ak instanceof C0789ah) && ((C0789ah) abstractC0792ak).f5079a == this.f5079a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    public void mo2088b(AbstractC0792ak abstractC0792ak) {
        this.f5082c = abstractC0792ak.f5082c;
        this.f5080b++;
        this.f5086g = null;
        this.f5087h = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public String mo2091a() {
        if (this.f5086g == null) {
            String str = "gui.log.unitCreated";
            if (this.f5079a.mo4975j()) {
                str = "gui.log.buildingConstructed";
            }
            this.f5086g = String.format(C0820a.m1880a(str, new Object[0]), this.f5079a.mo4980e(), Integer.valueOf(this.f5080b));
        }
        return this.f5086g;
    }
}

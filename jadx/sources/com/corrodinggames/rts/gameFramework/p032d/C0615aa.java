package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;

/* renamed from: com.corrodinggames.rts.gameFramework.d.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/aa.class */
class C0615aa extends AbstractC0618ad {

    /* renamed from: a */
    AbstractC0268al f4254a;

    /* renamed from: b */
    int f4255b = 1;

    public C0615aa(float f, float f2, AbstractC0268al alVar) {
        super(f, f2);
        this.f4254a = alVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: a */
    public boolean mo1576a(AbstractC0618ad adVar) {
        return super.mo1576a(adVar) && (adVar instanceof C0615aa) && ((C0615aa) adVar).f4254a == this.f4254a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: b */
    public void mo1575b(AbstractC0618ad adVar) {
        this.f4257c = adVar.f4257c;
        this.f4255b++;
        this.f4260f = null;
        this.f4261g = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: a */
    public String mo1577a() {
        if (this.f4260f == null) {
            String str = "gui.log.unitCreated";
            if (this.f4254a.mo2752j()) {
                str = "gui.log.buildingConstructed";
            }
            this.f4260f = String.format(C0652a.m1536a(str, new Object[0]), this.f4254a.mo2762e(), Integer.valueOf(this.f4255b));
        }
        return this.f4260f;
    }
}

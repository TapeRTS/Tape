package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.gameFramework.p034e.C0652a;

/* renamed from: com.corrodinggames.rts.gameFramework.d.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/ab.class */
class C0616ab extends AbstractC0618ad {

    /* renamed from: a */
    private boolean f4256a;

    public C0616ab(float f, float f2, boolean z) {
        super(f, f2);
        this.f4256a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: a */
    public boolean mo1576a(AbstractC0618ad adVar) {
        return super.mo1576a(adVar) && (adVar instanceof C0616ab) && ((C0616ab) adVar).f4256a == this.f4256a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: b */
    public void mo1575b(AbstractC0618ad adVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: b */
    protected long mo1774b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.AbstractC0618ad
    /* renamed from: a */
    public String mo1577a() {
        if (this.f4260f == null) {
            if (this.f4256a) {
                this.f4260f = C0652a.m1536a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.f4260f = C0652a.m1536a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.f4260f;
    }
}

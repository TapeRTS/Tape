package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;

/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public class C0511n extends AbstractC0514q {

    /* renamed from: a */
    public int f3385a = 14;

    /* renamed from: b */
    public float f3386b = 60.0f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1130c(0);
        apVar.mo1095a(this.f3385a);
        apVar.mo1096a(this.f3386b);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        kVar.m1065d();
        this.f3385a = kVar.m1062f();
        this.f3386b = kVar.m1061g();
        super.mo399a(kVar);
    }

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.fogRevealer;
    }

    /* renamed from: c */
    public static void m2366c() {
        AbstractC0789l.m638u();
    }

    public C0511n(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        this.f3386b -= f;
        if (this.f3386b < 0.0f) {
            m3319bU();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: s */
    public int mo2139s() {
        return this.f3385a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: t */
    public boolean mo1605t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: o_ */
    public boolean mo1607o_() {
        return true;
    }
}

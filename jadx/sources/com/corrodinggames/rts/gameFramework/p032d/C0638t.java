package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0514q;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/t.class */
public class C0638t extends AbstractC0514q {

    /* renamed from: a */
    C0354d f4525a = new C0354d();

    /* renamed from: b */
    public EnumC0215ak mo1606r() {
        return EnumC0215ak.fogRevealer;
    }

    public C0638t() {
        super(true);
        this.f1461bB = AbstractC0171m.f1236g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0514q, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
        super.mo404a(f);
        AbstractC0789l.m719a("PlaceholderUnit was updated");
        m3319bU();
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: cN */
    public C0354d mo1608cN() {
        return this.f4525a;
    }

    /* renamed from: a */
    public void m1610a(C0354d dVar) {
        this.f4525a = dVar;
    }
}

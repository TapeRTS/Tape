package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0538ad;

/* renamed from: com.corrodinggames.rts.game.units.a.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class C0195q extends AbstractC0194p {
    public C0195q() {
        super("c__cut_chat");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return "Team Chat";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Send a team chat message to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public boolean mo2409c(AbstractC0210af afVar, boolean z) {
        AbstractC0789l.m638u().f5518bA.f4279d.m1823n();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: I */
    public C0538ad mo3388I() {
        return AbstractC0789l.m638u().f5519bB.f3628u;
    }
}

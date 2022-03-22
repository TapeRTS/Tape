package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;

/* renamed from: com.corrodinggames.rts.game.units.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/i.class */
class C0498i extends AbstractC0202x {
    public C0498i() {
        super("addCredits");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return "Add credits";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Add $10000 to this team";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo2382h() {
        return true;
    }
}

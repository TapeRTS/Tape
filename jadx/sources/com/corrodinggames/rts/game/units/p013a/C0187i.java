package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;

/* renamed from: com.corrodinggames.rts.game.units.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/i.class */
public class C0187i extends AbstractC0197s {
    public C0187i() {
        super("c_9");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return 0;
    }

    /* renamed from: t */
    public EnumC0215ak mo2412i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.patrol;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return C0652a.m1536a("gui.actions.patrol.description", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return C0652a.m1536a("gui.actions.patrol", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        return mo2379b() + "\n" + mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public float mo2375j() {
        if (!C0623f.f4404bx) {
            return 0.6f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: h */
    public boolean mo2382h() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: l_ */
    public boolean mo3362l_() {
        return true;
    }
}

package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0414i;

/* renamed from: com.corrodinggames.rts.game.units.a.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/w.class */
public abstract class AbstractC0201w extends AbstractC0197s {
    public AbstractC0201w(int i) {
        super(i);
    }

    public AbstractC0201w(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        if (!(afVar instanceof AbstractC0416k)) {
            return 99;
        }
        return ((AbstractC0416k) afVar).mo2589a(m3387J(), z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public float mo3368q(AbstractC0210af afVar) {
        C0414i dc;
        if (!(afVar instanceof AbstractC0416k) || (dc = ((AbstractC0416k) afVar).mo2587dc()) == null || !m3379d(dc.f3031h)) {
            return -1.0f;
        }
        if (dc.f3034k < 0.0f) {
            return 0.0f;
        }
        return dc.f3034k;
    }

    /* renamed from: t */
    public float mo2543t() {
        return 0.01f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: q */
    public boolean mo3161q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.popupQueue;
    }
}

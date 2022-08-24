package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a.class */
public abstract class AbstractC0423a {
    /* renamed from: a */
    public abstract void mo4580a(AbstractC0244am abstractC0244am);

    /* renamed from: b */
    public abstract boolean mo4559b(AbstractC0244am abstractC0244am);

    /* renamed from: a */
    public abstract void mo4579a(AbstractC0244am abstractC0244am, double d);

    /* renamed from: b */
    public abstract boolean mo4558b(AbstractC0244am abstractC0244am, double d);

    /* renamed from: c */
    public boolean m4586c(AbstractC0244am abstractC0244am) {
        if (mo4559b(abstractC0244am)) {
            mo4580a(abstractC0244am);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m4585c(AbstractC0244am abstractC0244am, double d) {
        if (mo4558b(abstractC0244am, d)) {
            mo4579a(abstractC0244am, d);
            return true;
        }
        return false;
    }
}

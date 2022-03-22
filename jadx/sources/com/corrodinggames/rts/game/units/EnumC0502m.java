package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.game.units.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/m.class */
public enum EnumC0502m {
    all { // from class: com.corrodinggames.rts.game.units.m.1
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            return true;
        }
    },
    land { // from class: com.corrodinggames.rts.game.units.m.2
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            if (alVar == null) {
                return false;
            }
            AbstractC0210af c = AbstractC0210af.m3310c(alVar);
            return !c.mo2862bC() && !alVar.mo2752j() && c.mo2358h() != EnumC0212ah.AIR && c.mo2358h() != EnumC0212ah.WATER;
        }
    },
    air { // from class: com.corrodinggames.rts.game.units.m.3
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            if (alVar == null) {
                return false;
            }
            AbstractC0210af c = AbstractC0210af.m3310c(alVar);
            return !c.mo2862bC() && !alVar.mo2752j() && c.mo2358h() == EnumC0212ah.AIR;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.m.4
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            if (alVar == null) {
                return false;
            }
            AbstractC0210af c = AbstractC0210af.m3310c(alVar);
            return !c.mo2862bC() && !alVar.mo2752j() && c.mo2358h() == EnumC0212ah.WATER;
        }
    },
    buildings { // from class: com.corrodinggames.rts.game.units.m.5
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            return alVar != null && !AbstractC0210af.m3310c(alVar).mo2862bC() && alVar.mo2752j();
        }
    },
    bio { // from class: com.corrodinggames.rts.game.units.m.6
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            if (alVar == null) {
                return false;
            }
            return AbstractC0210af.m3310c(alVar).mo2862bC();
        }
    },
    modded { // from class: com.corrodinggames.rts.game.units.m.7
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            if (alVar == null || !(alVar instanceof C0368l)) {
                return false;
            }
            C0368l lVar = (C0368l) alVar;
            if (lVar.f2510B == null) {
                return false;
            }
            C0465h K = C0465h.m2434K();
            if (K == null || K.f3317A == null || lVar.f2510B == K.f3317A) {
                return true;
            }
            return false;
        }
    },
    actions { // from class: com.corrodinggames.rts.game.units.m.8
        @Override // com.corrodinggames.rts.game.units.EnumC0502m
        /* renamed from: a */
        public boolean mo2368a(AbstractC0268al alVar) {
            return alVar == null;
        }
    };

    /* renamed from: a */
    public abstract boolean mo2368a(AbstractC0268al alVar);

    /* renamed from: a */
    public String m2372a() {
        return name();
    }

    /* renamed from: b */
    public boolean m2369b() {
        return true;
    }

    /* renamed from: a */
    public EnumC0502m m2370a(boolean z) {
        if (!z) {
            return m2371a(1, 0);
        }
        return m2371a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0502m m2371a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0502m mVar = values()[ordinal];
        if (!mVar.m2369b()) {
            if (i2 > 30) {
                AbstractC0789l.m670d("jumpBy recursion limit hit");
                return mVar;
            }
            mVar = m2371a(i, i2 + 1);
        }
        return mVar;
    }
}

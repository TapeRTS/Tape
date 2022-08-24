package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ag.class */
public class C0642ag extends AbstractC0641af {

    /* renamed from: e */
    int f4152e;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2936a(AbstractC0641af abstractC0641af) {
        if (!(abstractC0641af instanceof C0642ag) || this.f4152e != ((C0642ag) abstractC0641af).f4152e) {
            return false;
        }
        return super.mo2936a(abstractC0641af);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2937a() {
        if (C0638ac.f4078b.m2940a(this.f4152e, this.f4149b, false)) {
            if (!this.f4150c) {
                this.f4150c = true;
                return true;
            }
            return false;
        } else if (C0638ac.f4078b.m2940a(this.f4152e, this.f4149b, true)) {
            this.f4150c = true;
            return false;
        } else if (this.f4150c) {
            this.f4150c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: b */
    public boolean mo2935b() {
        return C0638ac.f4078b.m2940a(this.f4152e, this.f4149b, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: c */
    public String mo2934c() {
        if (this.f4152e == 0) {
            return VariableScope.nullOrMissingString;
        }
        return C0638ac.f4078b.m2938c(this.f4152e, this.f4149b);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: d */
    public boolean mo2933d() {
        if (this.f4152e == 0) {
            return true;
        }
        return false;
    }
}

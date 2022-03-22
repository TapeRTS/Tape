package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ag.class */
public class C0541ag extends AbstractC0540af {

    /* renamed from: e */
    int f3682e;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: a */
    public boolean mo2066a() {
        if (C0537ac.f3609b.mo17a(this.f3682e, this.f3679b, false)) {
            if (this.f3680c) {
                return false;
            }
            this.f3680c = true;
            return true;
        } else if (C0537ac.f3609b.mo17a(this.f3682e, this.f3679b, true)) {
            this.f3680c = true;
            return false;
        } else if (!this.f3680c) {
            return false;
        } else {
            this.f3680c = false;
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: b */
    public boolean mo2065b() {
        return C0537ac.f3609b.mo17a(this.f3682e, this.f3679b, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: c */
    public String mo2064c() {
        if (this.f3682e == 0) {
            return "";
        }
        return C0537ac.f3609b.mo15c(this.f3682e, this.f3679b);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: d */
    public boolean mo2063d() {
        if (this.f3682e == 0) {
            return true;
        }
        return false;
    }
}

package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ah.class */
public class C0542ah extends AbstractC0540af {

    /* renamed from: g */
    boolean f3685g;

    /* renamed from: i */
    float f3687i;

    /* renamed from: e */
    int f3683e = -1;

    /* renamed from: f */
    int f3684f = -1;

    /* renamed from: h */
    int f3686h = -1;

    /* renamed from: j */
    boolean f3688j = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: a */
    public boolean mo2066a() {
        if (mo2065b()) {
            if (this.f3680c) {
                return false;
            }
            this.f3680c = true;
            return true;
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
        return m2067e() > 0.5f;
    }

    /* renamed from: e */
    public float m2067e() {
        return m2068a(false);
    }

    /* renamed from: a */
    public float m2068a(boolean z) {
        float f;
        if (this.f3686h != -1) {
            f = C0537ac.f3609b.mo18a(this.f3686h, this.f3683e) ? 0.0f : 1.0f;
        } else {
            float b = C0537ac.f3609b.mo16b(this.f3683e, this.f3684f);
            f = this.f3685g ? -b : b;
        }
        if (z) {
            return f;
        }
        if (!this.f3688j && Math.abs(f - this.f3687i) > 0.001f) {
            this.f3688j = true;
        }
        if (!this.f3688j) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: c */
    public String mo2064c() {
        return "controller";
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0540af
    /* renamed from: d */
    public boolean mo2063d() {
        return false;
    }
}

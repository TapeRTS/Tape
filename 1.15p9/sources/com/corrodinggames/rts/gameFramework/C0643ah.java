package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ah.class */
public class C0643ah extends AbstractC0641af {

    /* renamed from: g */
    boolean f4153g;

    /* renamed from: i */
    float f4154i;

    /* renamed from: e */
    int f4155e = -1;

    /* renamed from: f */
    int f4156f = -1;

    /* renamed from: h */
    int f4157h = -1;

    /* renamed from: j */
    boolean f4158j = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2937a() {
        if (mo2935b()) {
            if (!this.f4150c) {
                this.f4150c = true;
                return true;
            }
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
        return m2943e() > 0.5f;
    }

    /* renamed from: e */
    public float m2943e() {
        return m2944a(false);
    }

    /* renamed from: a */
    public float m2944a(boolean z) {
        float f;
        if (this.f4157h != -1) {
            f = C0638ac.f4078b.m2941a(this.f4157h, this.f4155e) ? 0.0f : 1.0f;
        } else {
            float m2939b = C0638ac.f4078b.m2939b(this.f4155e, this.f4156f);
            f = this.f4153g ? -m2939b : m2939b;
        }
        if (z) {
            return f;
        }
        if (!this.f4158j && Math.abs(f - this.f4154i) > 0.001f) {
            this.f4158j = true;
        }
        if (!this.f4158j) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: c */
    public String mo2934c() {
        return "controller";
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: d */
    public boolean mo2933d() {
        return false;
    }
}

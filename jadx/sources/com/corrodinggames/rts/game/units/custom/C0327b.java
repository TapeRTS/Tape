package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b.class */
class C0327b extends C0285a {

    /* renamed from: e */
    public C0381x f2223e;

    /* renamed from: f */
    public float f2224f;

    /* renamed from: g */
    public float f2225g;

    /* renamed from: h */
    public boolean f2226h;

    public C0327b(float f, float f2) {
        super(f, f2);
    }

    /* renamed from: a */
    public void m3059a(C0368l lVar, String str, String str2) {
        try {
            if (str.equalsIgnoreCase("x")) {
                this.f2224f = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("y")) {
                this.f2225g = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("name")) {
                this.f2223e = lVar.m2780a(str2, (C0381x) null);
            } else {
                throw new C0324at("Unknown event key:" + str + " on animation");
            }
        } catch (NumberFormatException e) {
            throw new C0324at("Failed to parse float:" + str2);
        }
    }

    public void finalize() {
        this.f2226h = true;
        if (this.f2223e == null) {
            throw new C0324at("Animation effect missing key 'name'");
        }
    }

    /* renamed from: a */
    public void m3060a(C0367k kVar) {
        if (this.f2223e != null) {
            float f = kVar.f5842dH;
            float f2 = kVar.f5843dI;
            this.f2223e.m2711a(f + this.f2224f, f2 + this.f2225g, kVar.f5844dJ, kVar.f1471bL, kVar);
        }
    }
}

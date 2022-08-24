package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b.class */
public class C0386b extends C0320a {

    /* renamed from: e */
    public C0467y f2322e;

    /* renamed from: f */
    public float f2323f;

    /* renamed from: g */
    public float f2324g;

    /* renamed from: h */
    public boolean f2325h;

    public C0386b(float f, float f2) {
        super(f, f2);
    }

    /* renamed from: a */
    public void m4685a(C0453l c0453l, String str, String str2) {
        try {
            if (str.equalsIgnoreCase("x")) {
                this.f2323f = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("y")) {
                this.f2324g = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("name")) {
                this.f2322e = c0453l.m4133a(str2, (C0467y) null);
            } else {
                throw new C0412bm("Unknown event key:" + str + " on animation");
            }
        } catch (NumberFormatException e) {
            throw new C0412bm("Failed to parse float:" + str2);
        }
    }

    public void finalize() {
        this.f2325h = true;
        if (this.f2322e == null) {
            throw new C0412bm("Animation effect missing key 'name'");
        }
    }

    /* renamed from: a */
    public void m4686a(C0451j c0451j) {
        if (this.f2322e != null) {
            float f = c0451j.f6951ek;
            float f2 = c0451j.f6952el;
            this.f2322e.m4057a(f + this.f2323f, f2 + this.f2324g, c0451j.f6953em, c0451j.f1617ce, c0451j);
        }
    }
}

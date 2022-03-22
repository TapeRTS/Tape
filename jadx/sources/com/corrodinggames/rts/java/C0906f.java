package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* renamed from: com.corrodinggames.rts.java.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
class C0906f {

    /* renamed from: a */
    int f6065a;

    /* renamed from: b */
    boolean f6066b;

    /* renamed from: c */
    boolean f6067c;

    /* renamed from: d */
    Font f6068d;

    /* renamed from: e */
    int f6069e;

    /* renamed from: f */
    String[] f6070f = new String[30];

    /* renamed from: g */
    final /* synthetic */ C0905e f6071g;

    C0906f(C0905e eVar) {
        this.f6071g = eVar;
    }

    /* renamed from: a */
    public C0906f clone() {
        C0906f fVar = new C0906f(this.f6071g);
        fVar.f6065a = this.f6065a;
        fVar.f6066b = this.f6066b;
        fVar.f6067c = this.f6067c;
        return fVar;
    }

    public String toString() {
        return "FontKey:(size:" + this.f6065a + ",  bold:" + this.f6066b + " fallback:" + this.f6067c + ")";
    }

    /* renamed from: a */
    boolean m113a(String str) {
        if (str == null || !C0905e.m159a(str)) {
            return true;
        }
        for (int i = 0; i < this.f6070f.length; i++) {
            String str2 = this.f6070f[i];
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    void m112b(String str) {
        this.f6070f[this.f6069e] = str;
        this.f6069e++;
        if (this.f6069e >= this.f6070f.length) {
            this.f6069e = 0;
        }
    }
}

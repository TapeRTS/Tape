package com.corrodinggames.rts.p008a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/m.class */
public class C0097m {

    /* renamed from: a */
    String f467a;

    /* renamed from: b */
    int f468b = 0;

    /* renamed from: c */
    int f469c = 0;

    /* renamed from: d */
    AbstractC0171m f470d = null;

    /* renamed from: e */
    AbstractC0171m f471e = null;

    /* renamed from: f */
    int f472f;

    /* renamed from: g */
    int f473g;

    C0097m(String str) {
        this.f467a = str;
    }

    /* renamed from: a */
    public void m3914a(AbstractC0171m mVar, int i) {
        if (i < this.f468b || this.f470d == null) {
            this.f468b = i;
            this.f470d = mVar;
            this.f472f = 1;
        } else if (i == this.f468b) {
            this.f472f++;
        }
        if (i > this.f469c || this.f471e == null) {
            this.f469c = i;
            this.f471e = mVar;
            this.f473g = 1;
        } else if (i == this.f469c) {
            this.f473g++;
        }
    }

    /* renamed from: a */
    public boolean m3915a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f468b == this.f469c) {
            return false;
        }
        if (this.f470d == null && this.f471e == null) {
            return false;
        }
        if (this.f473g == 1) {
            u.f5518bA.f4280e.m1642a(null, "Warning: Uneven map - Player " + (this.f471e.f1239i + 1) + " on team " + this.f471e.m3453f() + ": " + this.f467a + " is " + this.f469c + " vs " + this.f468b);
            return true;
        }
        u.f5518bA.f4280e.m1642a(null, "Warning: Uneven map - " + this.f473g + " players including player " + (this.f471e.f1239i + 1) + " on team " + (this.f471e.f1245o + 1) + ": " + this.f467a + " is " + this.f469c + " vs " + this.f468b);
        return true;
    }
}

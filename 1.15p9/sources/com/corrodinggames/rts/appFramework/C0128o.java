package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.appFramework.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/o.class */
public class C0128o {

    /* renamed from: a */
    String f531a;

    /* renamed from: b */
    int f532b = 0;

    /* renamed from: c */
    int f533c = 0;

    /* renamed from: d */
    AbstractC0197n f534d = null;

    /* renamed from: e */
    AbstractC0197n f535e = null;

    /* renamed from: f */
    int f536f;

    /* renamed from: g */
    int f537g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0128o(String str) {
        this.f531a = str;
    }

    /* renamed from: a */
    public void m6144a(AbstractC0197n abstractC0197n, int i) {
        if (i < this.f532b || this.f534d == null) {
            this.f532b = i;
            this.f534d = abstractC0197n;
            this.f536f = 1;
        } else if (i == this.f532b) {
            this.f536f++;
        }
        if (i > this.f533c || this.f535e == null) {
            this.f533c = i;
            this.f535e = abstractC0197n;
            this.f537g = 1;
        } else if (i == this.f533c) {
            this.f537g++;
        }
    }

    /* renamed from: a */
    public boolean m6145a() {
        GameEngine m1228A = GameEngine.m1228A();
        if (this.f532b == this.f533c) {
            return false;
        }
        if (this.f534d == null && this.f535e == null) {
            return false;
        }
        if (this.f537g == 1) {
            m1228A.f6111bS.f5107e.m1946a(null, "Warning: Uneven map - Player " + (this.f535e.f1305k + 1) + " on team " + this.f535e.m5577h() + ": " + this.f531a + " is " + this.f533c + " vs " + this.f532b);
            return true;
        }
        m1228A.f6111bS.f5107e.m1946a(null, "Warning: Uneven map - " + this.f537g + " players including player " + (this.f535e.f1305k + 1) + " on team " + (this.f535e.f1311q + 1) + ": " + this.f531a + " is " + this.f533c + " vs " + this.f532b);
        return true;
    }
}

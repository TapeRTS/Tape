package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/a.class */
public class C0536a {

    /* renamed from: a */
    public final C0537b f3699a = new C0537b();

    /* renamed from: b */
    public final C0537b[] f3700b = new C0537b[AbstractC0197n.f1366e];

    /* renamed from: c */
    public final C0537b f3701c = new C0537b();

    /* renamed from: d */
    public final C0537b f3702d = new C0537b();

    /* renamed from: e */
    float f3703e;

    public C0536a() {
        for (int i = 0; i < this.f3700b.length; i++) {
            this.f3700b[i] = new C0537b();
        }
    }

    /* renamed from: a */
    public void m3513a(AbstractC0244am abstractC0244am) {
        this.f3699a.m3510a(abstractC0244am);
        int i = abstractC0244am.f1676dl;
        if (i >= 0) {
            this.f3700b[i].m3510a(abstractC0244am);
        } else if (i == -1) {
            this.f3702d.m3510a(abstractC0244am);
        } else if (i == -2) {
            this.f3701c.m3510a(abstractC0244am);
        }
        if (abstractC0244am.f1620ch > this.f3703e) {
            this.f3703e = abstractC0244am.f1620ch;
        }
    }

    /* renamed from: b */
    public void m3512b(AbstractC0244am abstractC0244am) {
        this.f3699a.m3509b(abstractC0244am);
        int i = abstractC0244am.f1676dl;
        if (i >= 0) {
            this.f3700b[i].m3509b(abstractC0244am);
        } else if (i == -1) {
            this.f3702d.m3509b(abstractC0244am);
        } else if (i == -2) {
            this.f3701c.m3509b(abstractC0244am);
        }
        if (this.f3699a.f3705b == 0) {
            this.f3703e = 0.0f;
        }
    }
}

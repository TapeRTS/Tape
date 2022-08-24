package com.corrodinggames.rts.game.units;

/* renamed from: com.corrodinggames.rts.game.units.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ap.class */
public final class C0247ap {

    /* renamed from: a */
    public float f1711a;

    /* renamed from: b */
    public float f1712b;

    /* renamed from: c */
    public float f1713c;

    /* renamed from: d */
    public float f1714d;

    /* renamed from: e */
    public float f1715e;

    /* renamed from: f */
    public float f1716f;

    /* renamed from: g */
    public boolean f1717g;

    /* renamed from: h */
    public float f1718h;

    /* renamed from: i */
    public float f1719i;

    /* renamed from: j */
    public Unit f1720j;

    /* renamed from: k */
    public float f1721k;

    /* renamed from: l */
    public float f1722l;

    /* renamed from: m */
    public boolean f1723m;

    /* renamed from: a */
    public void m5748a(float f) {
        this.f1711a = f;
        this.f1712b = this.f1711a;
        this.f1713c = 0.0f;
        this.f1714d = 0.0f;
        this.f1715e = 0.0f;
        this.f1716f = 0.0f;
        this.f1717g = false;
        this.f1718h = 0.0f;
        this.f1719i = 0.0f;
        this.f1720j = null;
        this.f1721k = 0.0f;
        this.f1722l = 0.0f;
        this.f1723m = false;
    }

    /* renamed from: a */
    public final void m5747a(int i) {
        if (this.f1714d < i && this.f1714d >= 0.0f) {
            this.f1714d = i;
        }
    }

    /* renamed from: b */
    public final void m5745b(int i) {
        if (this.f1714d > (-i)) {
            this.f1714d = -i;
        }
    }

    /* renamed from: a */
    public final boolean m5749a() {
        return this.f1714d == 0.0f;
    }

    /* renamed from: b */
    public final boolean m5746b() {
        return this.f1714d < 0.0f;
    }
}

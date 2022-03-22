package com.corrodinggames.rts.game.units;

/* renamed from: com.corrodinggames.rts.game.units.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public final class C0213ai {

    /* renamed from: a */
    public float f1561a;

    /* renamed from: b */
    public float f1562b;

    /* renamed from: c */
    public float f1563c;

    /* renamed from: d */
    public float f1564d;

    /* renamed from: e */
    public float f1565e;

    /* renamed from: f */
    public float f1566f;

    /* renamed from: g */
    public boolean f1567g;

    /* renamed from: h */
    public float f1568h;

    /* renamed from: i */
    public float f1569i;

    /* renamed from: j */
    public AbstractC0210af f1570j;

    /* renamed from: k */
    public float f1571k;

    /* renamed from: l */
    public float f1572l;

    /* renamed from: m */
    public boolean f1573m;

    /* renamed from: a */
    public void m3287a(float f) {
        this.f1561a = f;
        this.f1562b = this.f1561a;
        this.f1563c = 0.0f;
        this.f1564d = 0.0f;
        this.f1565e = 0.0f;
        this.f1566f = 0.0f;
        this.f1567g = false;
        this.f1568h = 0.0f;
        this.f1569i = 0.0f;
        this.f1570j = null;
        this.f1571k = 0.0f;
        this.f1572l = 0.0f;
        this.f1573m = false;
    }

    /* renamed from: a */
    public final void m3286a(int i) {
        if (this.f1564d < i && this.f1564d >= 0.0f) {
            this.f1564d = i;
        }
    }

    /* renamed from: b */
    public final void m3284b(int i) {
        if (this.f1564d > (-i)) {
            this.f1564d = -i;
        }
    }

    /* renamed from: a */
    public final boolean m3288a() {
        return this.f1564d == 0.0f;
    }

    /* renamed from: b */
    public final boolean m3285b() {
        return this.f1564d < 0.0f;
    }
}

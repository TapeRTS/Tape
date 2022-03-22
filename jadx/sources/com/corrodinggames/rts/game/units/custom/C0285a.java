package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
class C0285a implements Comparable {

    /* renamed from: a */
    public float f1755a;

    /* renamed from: b */
    public float f1756b;

    /* renamed from: c */
    public float f1757c;

    /* renamed from: d */
    public float f1758d;

    public C0285a(float f, float f2) {
        this.f1755a = f;
        this.f1756b = f2;
    }

    /* renamed from: a */
    public int compareTo(C0285a aVar) {
        if (this.f1755a == aVar.f1755a) {
            return 0;
        }
        return this.f1755a > aVar.f1755a ? 1 : -1;
    }
}

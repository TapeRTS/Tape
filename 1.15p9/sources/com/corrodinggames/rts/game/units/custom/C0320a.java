package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
public class C0320a implements Comparable {

    /* renamed from: a */
    public float f1906a;

    /* renamed from: b */
    public float f1907b;

    /* renamed from: c */
    public float f1908c;

    /* renamed from: d */
    public float f1909d;

    public C0320a(float f, float f2) {
        this.f1906a = f;
        this.f1907b = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo4856a(C0320a c0320a) {
        if (this.f1906a == c0320a.f1906a) {
            return 0;
        }
        return this.f1906a > c0320a.f1906a ? 1 : -1;
    }
}

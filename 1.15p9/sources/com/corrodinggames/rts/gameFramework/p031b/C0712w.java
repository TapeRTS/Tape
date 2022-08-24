package com.corrodinggames.rts.gameFramework.p031b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/w.class */
public class C0712w {

    /* renamed from: a */
    private int[] f4439a;

    /* renamed from: b */
    private int f4440b;

    /* renamed from: a */
    public void m2673a(int i) {
        if (this.f4439a.length == this.f4440b) {
            int[] iArr = new int[this.f4440b + this.f4440b];
            System.arraycopy(this.f4439a, 0, iArr, 0, this.f4440b);
            this.f4439a = iArr;
        }
        int[] iArr2 = this.f4439a;
        int i2 = this.f4440b;
        this.f4440b = i2 + 1;
        iArr2[i2] = i;
    }
}

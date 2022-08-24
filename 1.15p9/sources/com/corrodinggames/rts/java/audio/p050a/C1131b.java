package com.corrodinggames.rts.java.audio.p050a;

/* renamed from: com.corrodinggames.rts.java.audio.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/b.class */
public class C1131b {

    /* renamed from: a */
    public float[] f7000a;

    /* renamed from: b */
    public int f7001b;

    /* renamed from: c */
    public boolean f7002c;

    public C1131b() {
        this(true, 16);
    }

    public C1131b(int i) {
        this(true, i);
    }

    public C1131b(boolean z, int i) {
        this.f7002c = z;
        this.f7000a = new float[i];
    }

    /* renamed from: a */
    public void m378a(float f) {
        float[] fArr = this.f7000a;
        if (this.f7001b == fArr.length) {
            fArr = m377a(Math.max(8, (int) (this.f7001b * 1.75f)));
        }
        int i = this.f7001b;
        this.f7001b = i + 1;
        fArr[i] = f;
    }

    /* renamed from: a */
    public void m376a(int i, float f) {
        if (i >= this.f7001b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7001b);
        }
        this.f7000a[i] = f;
    }

    /* renamed from: b */
    public void m374b(int i, float f) {
        if (i > this.f7001b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f7001b);
        }
        float[] fArr = this.f7000a;
        if (this.f7001b == fArr.length) {
            fArr = m377a(Math.max(8, (int) (this.f7001b * 1.75f)));
        }
        if (this.f7002c) {
            System.arraycopy(fArr, i, fArr, i + 1, this.f7001b - i);
        } else {
            fArr[this.f7001b] = fArr[i];
        }
        this.f7001b++;
        fArr[i] = f;
    }

    /* renamed from: a */
    public float m379a() {
        float[] fArr = this.f7000a;
        int i = this.f7001b - 1;
        this.f7001b = i;
        return fArr[i];
    }

    /* renamed from: b */
    public float m375b() {
        if (this.f7001b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.f7000a[0];
    }

    /* renamed from: c */
    public void m373c() {
        this.f7001b = 0;
    }

    /* renamed from: a */
    protected float[] m377a(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.f7000a, 0, fArr, 0, Math.min(this.f7001b, fArr.length));
        this.f7000a = fArr;
        return fArr;
    }

    public int hashCode() {
        if (!this.f7002c) {
            return super.hashCode();
        }
        float[] fArr = this.f7000a;
        int i = 1;
        int i2 = this.f7001b;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + Float.floatToIntBits(fArr[i3]);
        }
        return i;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.f7002c || !(obj instanceof C1131b)) {
            return false;
        }
        C1131b c1131b = (C1131b) obj;
        if (!c1131b.f7002c || (i = this.f7001b) != c1131b.f7001b) {
            return false;
        }
        float[] fArr = this.f7000a;
        float[] fArr2 = c1131b.f7000a;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] != fArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (this.f7001b == 0) {
            return "[]";
        }
        float[] fArr = this.f7000a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(fArr[0]);
        for (int i = 1; i < this.f7001b; i++) {
            sb.append(", ");
            sb.append(fArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}

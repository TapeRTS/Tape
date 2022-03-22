package com.corrodinggames.rts.java.audio.p044a;

/* renamed from: com.corrodinggames.rts.java.audio.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/b.class */
public class C0865b {

    /* renamed from: a */
    public float[] f5888a;

    /* renamed from: b */
    public int f5889b;

    /* renamed from: c */
    public boolean f5890c;

    public C0865b() {
        this(true, 16);
    }

    public C0865b(int i) {
        this(true, i);
    }

    public C0865b(boolean z, int i) {
        this.f5890c = z;
        this.f5888a = new float[i];
    }

    /* renamed from: a */
    public void m341a(float f) {
        float[] fArr = this.f5888a;
        if (this.f5889b == fArr.length) {
            fArr = m340a(Math.max(8, (int) (this.f5889b * 1.75f)));
        }
        int i = this.f5889b;
        this.f5889b = i + 1;
        fArr[i] = f;
    }

    /* renamed from: a */
    public void m339a(int i, float f) {
        if (i >= this.f5889b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f5889b);
        }
        this.f5888a[i] = f;
    }

    /* renamed from: b */
    public void m337b(int i, float f) {
        if (i > this.f5889b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f5889b);
        }
        float[] fArr = this.f5888a;
        if (this.f5889b == fArr.length) {
            fArr = m340a(Math.max(8, (int) (this.f5889b * 1.75f)));
        }
        if (this.f5890c) {
            System.arraycopy(fArr, i, fArr, i + 1, this.f5889b - i);
        } else {
            fArr[this.f5889b] = fArr[i];
        }
        this.f5889b++;
        fArr[i] = f;
    }

    /* renamed from: a */
    public float m342a() {
        float[] fArr = this.f5888a;
        int i = this.f5889b - 1;
        this.f5889b = i;
        return fArr[i];
    }

    /* renamed from: b */
    public float m338b() {
        if (this.f5889b != 0) {
            return this.f5888a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    /* renamed from: c */
    public void m336c() {
        this.f5889b = 0;
    }

    /* renamed from: a */
    protected float[] m340a(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.f5888a, 0, fArr, 0, Math.min(this.f5889b, fArr.length));
        this.f5888a = fArr;
        return fArr;
    }

    public int hashCode() {
        if (!this.f5890c) {
            return super.hashCode();
        }
        float[] fArr = this.f5888a;
        int i = 1;
        int i2 = this.f5889b;
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
        if (!(this.f5890c && (obj instanceof C0865b))) {
            return false;
        }
        C0865b bVar = (C0865b) obj;
        if (!(bVar.f5890c && (i = this.f5889b) == bVar.f5889b)) {
            return false;
        }
        float[] fArr = this.f5888a;
        float[] fArr2 = bVar.f5888a;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] != fArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (this.f5889b == 0) {
            return "[]";
        }
        float[] fArr = this.f5888a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(fArr[0]);
        for (int i = 1; i < this.f5889b; i++) {
            sb.append(", ");
            sb.append(fArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}

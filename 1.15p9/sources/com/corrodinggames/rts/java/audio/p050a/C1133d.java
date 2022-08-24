package com.corrodinggames.rts.java.audio.p050a;

/* renamed from: com.corrodinggames.rts.java.audio.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/d.class */
public class C1133d {

    /* renamed from: a */
    public int[] f7003a;

    /* renamed from: b */
    public int f7004b;

    /* renamed from: c */
    public boolean f7005c;

    public C1133d() {
        this(true, 16);
    }

    public C1133d(boolean z, int i) {
        this.f7005c = z;
        this.f7003a = new int[i];
    }

    public C1133d(C1133d c1133d) {
        this.f7005c = c1133d.f7005c;
        this.f7004b = c1133d.f7004b;
        this.f7003a = new int[this.f7004b];
        System.arraycopy(c1133d.f7003a, 0, this.f7003a, 0, this.f7004b);
    }

    /* renamed from: a */
    public void m372a(int i) {
        int[] iArr = this.f7003a;
        if (this.f7004b == iArr.length) {
            iArr = m369d(Math.max(8, (int) (this.f7004b * 1.75f)));
        }
        int i2 = this.f7004b;
        this.f7004b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public int m371b(int i) {
        if (i >= this.f7004b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7004b);
        }
        return this.f7003a[i];
    }

    /* renamed from: c */
    public int m370c(int i) {
        if (i >= this.f7004b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7004b);
        }
        int[] iArr = this.f7003a;
        int i2 = iArr[i];
        this.f7004b--;
        if (this.f7005c) {
            System.arraycopy(iArr, i + 1, iArr, i, this.f7004b - i);
        } else {
            iArr[i] = iArr[this.f7004b];
        }
        return i2;
    }

    /* renamed from: d */
    protected int[] m369d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.f7003a, 0, iArr, 0, Math.min(this.f7004b, iArr.length));
        this.f7003a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (!this.f7005c) {
            return super.hashCode();
        }
        int[] iArr = this.f7003a;
        int i = 1;
        int i2 = this.f7004b;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + iArr[i3];
        }
        return i;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.f7005c || !(obj instanceof C1133d)) {
            return false;
        }
        C1133d c1133d = (C1133d) obj;
        if (!c1133d.f7005c || (i = this.f7004b) != c1133d.f7004b) {
            return false;
        }
        int[] iArr = this.f7003a;
        int[] iArr2 = c1133d.f7003a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7003a[i2] != c1133d.f7003a[i2]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (this.f7004b == 0) {
            return "[]";
        }
        int[] iArr = this.f7003a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(iArr[0]);
        for (int i = 1; i < this.f7004b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}

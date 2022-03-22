package com.corrodinggames.rts.java.audio.p044a;

/* renamed from: com.corrodinggames.rts.java.audio.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/d.class */
public class C0867d {

    /* renamed from: a */
    public int[] f5891a;

    /* renamed from: b */
    public int f5892b;

    /* renamed from: c */
    public boolean f5893c;

    public C0867d() {
        this(true, 16);
    }

    public C0867d(boolean z, int i) {
        this.f5893c = z;
        this.f5891a = new int[i];
    }

    public C0867d(C0867d dVar) {
        this.f5893c = dVar.f5893c;
        this.f5892b = dVar.f5892b;
        this.f5891a = new int[this.f5892b];
        System.arraycopy(dVar.f5891a, 0, this.f5891a, 0, this.f5892b);
    }

    /* renamed from: a */
    public void m335a(int i) {
        int[] iArr = this.f5891a;
        if (this.f5892b == iArr.length) {
            iArr = m332d(Math.max(8, (int) (this.f5892b * 1.75f)));
        }
        int i2 = this.f5892b;
        this.f5892b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public int m334b(int i) {
        if (i < this.f5892b) {
            return this.f5891a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f5892b);
    }

    /* renamed from: c */
    public int m333c(int i) {
        if (i >= this.f5892b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f5892b);
        }
        int[] iArr = this.f5891a;
        int i2 = iArr[i];
        this.f5892b--;
        if (this.f5893c) {
            System.arraycopy(iArr, i + 1, iArr, i, this.f5892b - i);
        } else {
            iArr[i] = iArr[this.f5892b];
        }
        return i2;
    }

    /* renamed from: d */
    protected int[] m332d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.f5891a, 0, iArr, 0, Math.min(this.f5892b, iArr.length));
        this.f5891a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (!this.f5893c) {
            return super.hashCode();
        }
        int[] iArr = this.f5891a;
        int i = 1;
        int i2 = this.f5892b;
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
        if (!(this.f5893c && (obj instanceof C0867d))) {
            return false;
        }
        C0867d dVar = (C0867d) obj;
        if (!(dVar.f5893c && (i = this.f5892b) == dVar.f5892b)) {
            return false;
        }
        int[] iArr = this.f5891a;
        int[] iArr2 = dVar.f5891a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5891a[i2] != dVar.f5891a[i2]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (this.f5892b == 0) {
            return "[]";
        }
        int[] iArr = this.f5891a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(iArr[0]);
        for (int i = 1; i < this.f5892b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}

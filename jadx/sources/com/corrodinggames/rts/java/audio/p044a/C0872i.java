package com.corrodinggames.rts.java.audio.p044a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/i.class */
public class C0872i implements Iterable {

    /* renamed from: a */
    public int f5917a;

    /* renamed from: b */
    long[] f5918b;

    /* renamed from: c */
    Object[] f5919c;

    /* renamed from: d */
    int f5920d;

    /* renamed from: e */
    int f5921e;

    /* renamed from: f */
    Object f5922f;

    /* renamed from: g */
    boolean f5923g;

    /* renamed from: h */
    private float f5924h;

    /* renamed from: i */
    private int f5925i;

    /* renamed from: j */
    private int f5926j;

    /* renamed from: k */
    private int f5927k;

    /* renamed from: l */
    private int f5928l;

    /* renamed from: m */
    private int f5929m;

    /* renamed from: n */
    private C0873j f5930n;

    /* renamed from: o */
    private C0873j f5931o;

    public C0872i() {
        this(51, 0.8f);
    }

    public C0872i(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b = C0876m.m289b((int) Math.ceil(i / f));
        if (b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b);
        }
        this.f5920d = b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f5924h = f;
        this.f5927k = (int) (this.f5920d * f);
        this.f5926j = this.f5920d - 1;
        this.f5925i = 63 - Long.numberOfTrailingZeros(this.f5920d);
        this.f5928l = Math.max(3, ((int) Math.ceil(Math.log(this.f5920d))) * 2);
        this.f5929m = Math.max(Math.min(this.f5920d, 8), ((int) Math.sqrt(this.f5920d)) / 8);
        this.f5918b = new long[this.f5920d + this.f5928l];
        this.f5919c = new Object[this.f5918b.length];
    }

    /* renamed from: a */
    public Object m309a(long j, Object obj) {
        if (j == 0) {
            Object obj2 = this.f5922f;
            this.f5922f = obj;
            if (!this.f5923g) {
                this.f5923g = true;
                this.f5917a++;
            }
            return obj2;
        }
        long[] jArr = this.f5918b;
        int i = (int) (j & this.f5926j);
        long j2 = jArr[i];
        if (j2 == j) {
            Object obj3 = this.f5919c[i];
            this.f5919c[i] = obj;
            return obj3;
        }
        int f = m298f(j);
        long j3 = jArr[f];
        if (j3 == j) {
            Object obj4 = this.f5919c[f];
            this.f5919c[f] = obj;
            return obj4;
        }
        int g = m297g(j);
        long j4 = jArr[g];
        if (j4 == j) {
            Object obj5 = this.f5919c[g];
            this.f5919c[g] = obj;
            return obj5;
        }
        int i2 = this.f5920d;
        int i3 = i2 + this.f5921e;
        while (i2 < i3) {
            if (jArr[i2] == j) {
                Object obj6 = this.f5919c[i2];
                this.f5919c[i2] = obj;
                return obj6;
            }
            i2++;
        }
        if (j2 == 0) {
            jArr[i] = j;
            this.f5919c[i] = obj;
            int i4 = this.f5917a;
            this.f5917a = i4 + 1;
            if (i4 < this.f5927k) {
                return null;
            }
            m306b(this.f5920d << 1);
            return null;
        } else if (j3 == 0) {
            jArr[f] = j;
            this.f5919c[f] = obj;
            int i5 = this.f5917a;
            this.f5917a = i5 + 1;
            if (i5 < this.f5927k) {
                return null;
            }
            m306b(this.f5920d << 1);
            return null;
        } else if (j4 == 0) {
            jArr[g] = j;
            this.f5919c[g] = obj;
            int i6 = this.f5917a;
            this.f5917a = i6 + 1;
            if (i6 < this.f5927k) {
                return null;
            }
            m306b(this.f5920d << 1);
            return null;
        } else {
            m308a(j, obj, i, j2, f, j3, g, j4);
            return null;
        }
    }

    /* renamed from: b */
    private void m304b(long j, Object obj) {
        if (j == 0) {
            this.f5922f = obj;
            this.f5923g = true;
            return;
        }
        int i = (int) (j & this.f5926j);
        long j2 = this.f5918b[i];
        if (j2 == 0) {
            this.f5918b[i] = j;
            this.f5919c[i] = obj;
            int i2 = this.f5917a;
            this.f5917a = i2 + 1;
            if (i2 >= this.f5927k) {
                m306b(this.f5920d << 1);
                return;
            }
            return;
        }
        int f = m298f(j);
        long j3 = this.f5918b[f];
        if (j3 == 0) {
            this.f5918b[f] = j;
            this.f5919c[f] = obj;
            int i3 = this.f5917a;
            this.f5917a = i3 + 1;
            if (i3 >= this.f5927k) {
                m306b(this.f5920d << 1);
                return;
            }
            return;
        }
        int g = m297g(j);
        long j4 = this.f5918b[g];
        if (j4 == 0) {
            this.f5918b[g] = j;
            this.f5919c[g] = obj;
            int i4 = this.f5917a;
            this.f5917a = i4 + 1;
            if (i4 >= this.f5927k) {
                m306b(this.f5920d << 1);
                return;
            }
            return;
        }
        m308a(j, obj, i, j2, f, j3, g, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.corrodinggames.rts.java.audio.a.i] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m308a(long j, Object obj, int i, long j2, int i2, long j3, int i3, long j4) {
        Object obj2;
        ?? r21;
        ?? r0 = this.f5918b;
        Object[] objArr = this.f5919c;
        int i4 = this.f5926j;
        int i5 = 0;
        int i6 = this.f5929m;
        ?? r6 = j;
        char c = j2;
        char c2 = j3;
        char c3 = j4;
        while (true) {
            switch (C0876m.m291a(2)) {
                case 0:
                    r21 = c == 1 ? 1 : 0;
                    obj2 = objArr[i];
                    r0[i] = r6 == true ? 1 : 0;
                    objArr[i] = obj;
                    break;
                case 1:
                    r21 = c2 == 1 ? 1 : 0;
                    obj2 = objArr[i2];
                    r0[i2] = r6;
                    objArr[i2] = obj;
                    break;
                default:
                    r21 = c3 == 1 ? 1 : 0;
                    obj2 = objArr[i3];
                    r0[i3] = r6;
                    objArr[i3] = obj;
                    break;
            }
            long j5 = r21 == true ? 1L : 0L;
            long j6 = r21 == true ? 1L : 0L;
            long j7 = r21 == true ? 1L : 0L;
            long j8 = r21 == true ? 1L : 0L;
            i = (int) (j5 & i4);
            char c4 = r0[i];
            if (c4 == 0) {
                long j9 = r21 == true ? 1 : 0;
                long j10 = r21 == true ? 1 : 0;
                long j11 = r21 == true ? 1 : 0;
                long j12 = r21 == true ? 1 : 0;
                r0[i] = j9;
                objArr[i] = obj2;
                int i7 = this.f5917a;
                this.f5917a = i7 + 1;
                if (i7 >= this.f5927k) {
                    m306b(this.f5920d << 1);
                    return;
                }
                return;
            }
            i2 = m298f(r21);
            char c5 = r0[i2];
            if (c5 == 0) {
                r0[i2] = r21;
                objArr[i2] = obj2;
                int i8 = this.f5917a;
                this.f5917a = i8 + 1;
                if (i8 >= this.f5927k) {
                    m306b(this.f5920d << 1);
                    return;
                }
                return;
            }
            i3 = m297g(r21);
            char c6 = r0[i3];
            if (c6 == 0) {
                r0[i3] = r21;
                objArr[i3] = obj2;
                int i9 = this.f5917a;
                this.f5917a = i9 + 1;
                if (i9 >= this.f5927k) {
                    m306b(this.f5920d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 == i6) {
                m302c(r21, obj2);
                return;
            }
            boolean z = r21 == true ? 1 : 0;
            boolean z2 = r21 == true ? 1 : 0;
            boolean z3 = r21 == true ? 1 : 0;
            boolean z4 = r21 == true ? 1 : 0;
            r6 = z;
            obj = obj2;
            c = c4;
            c2 = c5;
            c3 = c6;
        }
    }

    /* renamed from: c */
    private void m302c(long j, Object obj) {
        if (this.f5921e == this.f5928l) {
            m306b(this.f5920d << 1);
            m309a(j, obj);
            return;
        }
        int i = this.f5920d + this.f5921e;
        this.f5918b[i] = j;
        this.f5919c[i] = obj;
        this.f5921e++;
        this.f5917a++;
    }

    /* renamed from: a */
    public Object m310a(long j) {
        if (j != 0) {
            int i = (int) (j & this.f5926j);
            if (this.f5918b[i] != j) {
                i = m298f(j);
                if (this.f5918b[i] != j) {
                    i = m297g(j);
                    if (this.f5918b[i] != j) {
                        return m300d(j, null);
                    }
                }
            }
            return this.f5919c[i];
        } else if (!this.f5923g) {
            return null;
        } else {
            return this.f5922f;
        }
    }

    /* renamed from: d */
    private Object m300d(long j, Object obj) {
        long[] jArr = this.f5918b;
        int i = this.f5920d;
        int i2 = i + this.f5921e;
        while (i < i2) {
            if (jArr[i] == j) {
                return this.f5919c[i];
            }
            i++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m305b(long j) {
        if (j != 0) {
            int i = (int) (j & this.f5926j);
            if (this.f5918b[i] == j) {
                this.f5918b[i] = 0;
                Object obj = this.f5919c[i];
                this.f5919c[i] = null;
                this.f5917a--;
                return obj;
            }
            int f = m298f(j);
            if (this.f5918b[f] == j) {
                this.f5918b[f] = 0;
                Object obj2 = this.f5919c[f];
                this.f5919c[f] = null;
                this.f5917a--;
                return obj2;
            }
            int g = m297g(j);
            if (this.f5918b[g] != j) {
                return m303c(j);
            }
            this.f5918b[g] = 0;
            Object obj3 = this.f5919c[g];
            this.f5919c[g] = null;
            this.f5917a--;
            return obj3;
        } else if (!this.f5923g) {
            return null;
        } else {
            Object obj4 = this.f5922f;
            this.f5922f = null;
            this.f5923g = false;
            this.f5917a--;
            return obj4;
        }
    }

    /* renamed from: c */
    Object m303c(long j) {
        long[] jArr = this.f5918b;
        int i = this.f5920d;
        int i2 = i + this.f5921e;
        while (i < i2) {
            if (jArr[i] == j) {
                Object obj = this.f5919c[i];
                m311a(i);
                this.f5917a--;
                return obj;
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    void m311a(int i) {
        this.f5921e--;
        int i2 = this.f5920d + this.f5921e;
        if (i < i2) {
            this.f5918b[i] = this.f5918b[i2];
            this.f5919c[i] = this.f5919c[i2];
            this.f5919c[i2] = null;
            return;
        }
        this.f5919c[i] = null;
    }

    /* renamed from: a */
    public void m312a() {
        if (this.f5917a != 0) {
            long[] jArr = this.f5918b;
            Object[] objArr = this.f5919c;
            int i = this.f5920d + this.f5921e;
            while (true) {
                i--;
                if (i > 0) {
                    jArr[i] = 0;
                    objArr[i] = null;
                } else {
                    this.f5917a = 0;
                    this.f5921e = 0;
                    this.f5922f = null;
                    this.f5923g = false;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m301d(long j) {
        if (j == 0) {
            return this.f5923g;
        }
        if (this.f5918b[(int) (j & this.f5926j)] == j) {
            return true;
        }
        if (this.f5918b[m298f(j)] == j) {
            return true;
        }
        if (this.f5918b[m297g(j)] != j) {
            return m299e(j);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m299e(long j) {
        long[] jArr = this.f5918b;
        int i = this.f5920d;
        int i2 = i + this.f5921e;
        while (i < i2) {
            if (jArr[i] == j) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m306b(int i) {
        int i2 = this.f5920d + this.f5921e;
        this.f5920d = i;
        this.f5927k = (int) (i * this.f5924h);
        this.f5926j = i - 1;
        this.f5925i = 63 - Long.numberOfTrailingZeros(i);
        this.f5928l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f5929m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        long[] jArr = this.f5918b;
        Object[] objArr = this.f5919c;
        this.f5918b = new long[i + this.f5928l];
        this.f5919c = new Object[i + this.f5928l];
        int i3 = this.f5917a;
        this.f5917a = this.f5923g ? 1 : 0;
        this.f5921e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                long j = jArr[i4];
                if (j != 0) {
                    m304b(j, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: f */
    private int m298f(long j) {
        long j2 = j * (-1262997959);
        return (int) ((j2 ^ (j2 >>> this.f5925i)) & this.f5926j);
    }

    /* renamed from: g */
    private int m297g(long j) {
        long j2 = j * (-825114047);
        return (int) ((j2 ^ (j2 >>> this.f5925i)) & this.f5926j);
    }

    public int hashCode() {
        int i = 0;
        if (this.f5923g && this.f5922f != null) {
            i = 0 + this.f5922f.hashCode();
        }
        long[] jArr = this.f5918b;
        Object[] objArr = this.f5919c;
        int i2 = this.f5920d + this.f5921e;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                i += ((int) (j ^ (j >>> 32))) * 31;
                Object obj = objArr[i3];
                if (obj != null) {
                    i += obj.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0872i)) {
            return false;
        }
        C0872i iVar = (C0872i) obj;
        if (!(iVar.f5917a == this.f5917a && iVar.f5923g == this.f5923g)) {
            return false;
        }
        if (this.f5923g) {
            if (iVar.f5922f == null) {
                if (this.f5922f != null) {
                    return false;
                }
            } else if (!iVar.f5922f.equals(this.f5922f)) {
                return false;
            }
        }
        long[] jArr = this.f5918b;
        Object[] objArr = this.f5919c;
        int i = this.f5920d + this.f5921e;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    if (!iVar.m301d(j) || iVar.m310a(j) != null) {
                        return false;
                    }
                } else if (!obj2.equals(iVar.m310a(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        if (this.f5917a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        long[] jArr = this.f5918b;
        Object[] objArr = this.f5919c;
        int length = jArr.length;
        while (true) {
            length--;
            if (length <= 0) {
                break;
            }
            long j = jArr[length];
            if (j != 0) {
                sb.append(j);
                sb.append('=');
                sb.append(objArr[length]);
                break;
            }
        }
        while (true) {
            length--;
            if (length > 0) {
                long j2 = jArr[length];
                if (j2 != 0) {
                    sb.append(", ");
                    sb.append(j2);
                    sb.append('=');
                    sb.append(objArr[length]);
                }
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return m307b();
    }

    /* renamed from: b */
    public C0873j m307b() {
        if (this.f5930n == null) {
            this.f5930n = new C0873j(this);
            this.f5931o = new C0873j(this);
        }
        if (!this.f5930n.f5939e) {
            this.f5930n.mo295b();
            this.f5930n.f5939e = true;
            this.f5931o.f5939e = false;
            return this.f5930n;
        }
        this.f5931o.mo295b();
        this.f5931o.f5939e = true;
        this.f5930n.f5939e = false;
        return this.f5931o;
    }
}

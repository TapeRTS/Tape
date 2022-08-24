package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/i.class */
public class C1138i implements Iterable {

    /* renamed from: a */
    public int f7029a;

    /* renamed from: b */
    long[] f7030b;

    /* renamed from: c */
    Object[] f7031c;

    /* renamed from: d */
    int f7032d;

    /* renamed from: e */
    int f7033e;

    /* renamed from: f */
    Object f7034f;

    /* renamed from: g */
    boolean f7035g;

    /* renamed from: h */
    private float f7036h;

    /* renamed from: i */
    private int f7037i;

    /* renamed from: j */
    private int f7038j;

    /* renamed from: k */
    private int f7039k;

    /* renamed from: l */
    private int f7040l;

    /* renamed from: m */
    private int f7041m;

    /* renamed from: n */
    private C1139j f7042n;

    /* renamed from: o */
    private C1139j f7043o;

    public C1138i() {
        this(51, 0.8f);
    }

    public C1138i(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m326b = C1142m.m326b((int) Math.ceil(i / f));
        if (m326b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m326b);
        }
        this.f7032d = m326b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7036h = f;
        this.f7039k = (int) (this.f7032d * f);
        this.f7038j = this.f7032d - 1;
        this.f7037i = 63 - Long.numberOfTrailingZeros(this.f7032d);
        this.f7040l = Math.max(3, ((int) Math.ceil(Math.log(this.f7032d))) * 2);
        this.f7041m = Math.max(Math.min(this.f7032d, 8), ((int) Math.sqrt(this.f7032d)) / 8);
        this.f7030b = new long[this.f7032d + this.f7040l];
        this.f7031c = new Object[this.f7030b.length];
    }

    /* renamed from: a */
    public Object m346a(long j, Object obj) {
        if (j == 0) {
            Object obj2 = this.f7034f;
            this.f7034f = obj;
            if (!this.f7035g) {
                this.f7035g = true;
                this.f7029a++;
            }
            return obj2;
        }
        long[] jArr = this.f7030b;
        int i = (int) (j & this.f7038j);
        long j2 = jArr[i];
        if (j2 == j) {
            Object obj3 = this.f7031c[i];
            this.f7031c[i] = obj;
            return obj3;
        }
        int m335f = m335f(j);
        long j3 = jArr[m335f];
        if (j3 == j) {
            Object obj4 = this.f7031c[m335f];
            this.f7031c[m335f] = obj;
            return obj4;
        }
        int m334g = m334g(j);
        long j4 = jArr[m334g];
        if (j4 == j) {
            Object obj5 = this.f7031c[m334g];
            this.f7031c[m334g] = obj;
            return obj5;
        }
        int i2 = this.f7032d;
        int i3 = i2 + this.f7033e;
        while (i2 < i3) {
            if (jArr[i2] != j) {
                i2++;
            } else {
                Object obj6 = this.f7031c[i2];
                this.f7031c[i2] = obj;
                return obj6;
            }
        }
        if (j2 == 0) {
            jArr[i] = j;
            this.f7031c[i] = obj;
            int i4 = this.f7029a;
            this.f7029a = i4 + 1;
            if (i4 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return null;
            }
            return null;
        } else if (j3 == 0) {
            jArr[m335f] = j;
            this.f7031c[m335f] = obj;
            int i5 = this.f7029a;
            this.f7029a = i5 + 1;
            if (i5 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return null;
            }
            return null;
        } else if (j4 == 0) {
            jArr[m334g] = j;
            this.f7031c[m334g] = obj;
            int i6 = this.f7029a;
            this.f7029a = i6 + 1;
            if (i6 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return null;
            }
            return null;
        } else {
            m345a(j, obj, i, j2, m335f, j3, m334g, j4);
            return null;
        }
    }

    /* renamed from: b */
    private void m341b(long j, Object obj) {
        if (j == 0) {
            this.f7034f = obj;
            this.f7035g = true;
            return;
        }
        int i = (int) (j & this.f7038j);
        long j2 = this.f7030b[i];
        if (j2 == 0) {
            this.f7030b[i] = j;
            this.f7031c[i] = obj;
            int i2 = this.f7029a;
            this.f7029a = i2 + 1;
            if (i2 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return;
            }
            return;
        }
        int m335f = m335f(j);
        long j3 = this.f7030b[m335f];
        if (j3 == 0) {
            this.f7030b[m335f] = j;
            this.f7031c[m335f] = obj;
            int i3 = this.f7029a;
            this.f7029a = i3 + 1;
            if (i3 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return;
            }
            return;
        }
        int m334g = m334g(j);
        long j4 = this.f7030b[m334g];
        if (j4 == 0) {
            this.f7030b[m334g] = j;
            this.f7031c[m334g] = obj;
            int i4 = this.f7029a;
            this.f7029a = i4 + 1;
            if (i4 >= this.f7039k) {
                m343b(this.f7032d << 1);
                return;
            }
            return;
        }
        m345a(j, obj, i, j2, m335f, j3, m334g, j4);
    }

    /* renamed from: a */
    private void m345a(long j, Object obj, int i, long j2, int i2, long j3, int i3, long j4) {
        long j5;
        Object obj2;
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        int i4 = this.f7038j;
        int i5 = 0;
        int i6 = this.f7041m;
        while (true) {
            switch (C1142m.m328a(2)) {
                case 0:
                    j5 = j2;
                    obj2 = objArr[i];
                    jArr[i] = j;
                    objArr[i] = obj;
                    break;
                case 1:
                    j5 = j3;
                    obj2 = objArr[i2];
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    break;
                default:
                    j5 = j4;
                    obj2 = objArr[i3];
                    jArr[i3] = j;
                    objArr[i3] = obj;
                    break;
            }
            i = (int) (j5 & i4);
            j2 = jArr[i];
            if (j2 == 0) {
                jArr[i] = j5;
                objArr[i] = obj2;
                int i7 = this.f7029a;
                this.f7029a = i7 + 1;
                if (i7 >= this.f7039k) {
                    m343b(this.f7032d << 1);
                    return;
                }
                return;
            }
            i2 = m335f(j5);
            j3 = jArr[i2];
            if (j3 == 0) {
                jArr[i2] = j5;
                objArr[i2] = obj2;
                int i8 = this.f7029a;
                this.f7029a = i8 + 1;
                if (i8 >= this.f7039k) {
                    m343b(this.f7032d << 1);
                    return;
                }
                return;
            }
            i3 = m334g(j5);
            j4 = jArr[i3];
            if (j4 == 0) {
                jArr[i3] = j5;
                objArr[i3] = obj2;
                int i9 = this.f7029a;
                this.f7029a = i9 + 1;
                if (i9 >= this.f7039k) {
                    m343b(this.f7032d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                j = j5;
                obj = obj2;
            } else {
                m339c(j5, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m339c(long j, Object obj) {
        if (this.f7033e == this.f7040l) {
            m343b(this.f7032d << 1);
            m346a(j, obj);
            return;
        }
        int i = this.f7032d + this.f7033e;
        this.f7030b[i] = j;
        this.f7031c[i] = obj;
        this.f7033e++;
        this.f7029a++;
    }

    /* renamed from: a */
    public Object m347a(long j) {
        if (j == 0) {
            if (this.f7035g) {
                return this.f7034f;
            }
            return null;
        }
        int i = (int) (j & this.f7038j);
        if (this.f7030b[i] != j) {
            i = m335f(j);
            if (this.f7030b[i] != j) {
                i = m334g(j);
                if (this.f7030b[i] != j) {
                    return m337d(j, null);
                }
            }
        }
        return this.f7031c[i];
    }

    /* renamed from: d */
    private Object m337d(long j, Object obj) {
        long[] jArr = this.f7030b;
        int i = this.f7032d;
        int i2 = i + this.f7033e;
        while (i < i2) {
            if (jArr[i] == j) {
                return this.f7031c[i];
            }
            i++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m342b(long j) {
        if (j == 0) {
            if (!this.f7035g) {
                return null;
            }
            Object obj = this.f7034f;
            this.f7034f = null;
            this.f7035g = false;
            this.f7029a--;
            return obj;
        }
        int i = (int) (j & this.f7038j);
        if (this.f7030b[i] == j) {
            this.f7030b[i] = 0;
            Object obj2 = this.f7031c[i];
            this.f7031c[i] = null;
            this.f7029a--;
            return obj2;
        }
        int m335f = m335f(j);
        if (this.f7030b[m335f] == j) {
            this.f7030b[m335f] = 0;
            Object obj3 = this.f7031c[m335f];
            this.f7031c[m335f] = null;
            this.f7029a--;
            return obj3;
        }
        int m334g = m334g(j);
        if (this.f7030b[m334g] == j) {
            this.f7030b[m334g] = 0;
            Object obj4 = this.f7031c[m334g];
            this.f7031c[m334g] = null;
            this.f7029a--;
            return obj4;
        }
        return m340c(j);
    }

    /* renamed from: c */
    Object m340c(long j) {
        long[] jArr = this.f7030b;
        int i = this.f7032d;
        int i2 = i + this.f7033e;
        while (i < i2) {
            if (jArr[i] != j) {
                i++;
            } else {
                Object obj = this.f7031c[i];
                m348a(i);
                this.f7029a--;
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m348a(int i) {
        this.f7033e--;
        int i2 = this.f7032d + this.f7033e;
        if (i < i2) {
            this.f7030b[i] = this.f7030b[i2];
            this.f7031c[i] = this.f7031c[i2];
            this.f7031c[i2] = null;
            return;
        }
        this.f7031c[i] = null;
    }

    /* renamed from: a */
    public void m349a() {
        if (this.f7029a == 0) {
            return;
        }
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        int i = this.f7032d + this.f7033e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                jArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7029a = 0;
                this.f7033e = 0;
                this.f7034f = null;
                this.f7035g = false;
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean m338d(long j) {
        if (j == 0) {
            return this.f7035g;
        }
        if (this.f7030b[(int) (j & this.f7038j)] != j) {
            if (this.f7030b[m335f(j)] != j) {
                if (this.f7030b[m334g(j)] == j) {
                    return true;
                }
                return m336e(j);
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m336e(long j) {
        long[] jArr = this.f7030b;
        int i = this.f7032d;
        int i2 = i + this.f7033e;
        while (i < i2) {
            if (jArr[i] == j) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m343b(int i) {
        int i2 = this.f7032d + this.f7033e;
        this.f7032d = i;
        this.f7039k = (int) (i * this.f7036h);
        this.f7038j = i - 1;
        this.f7037i = 63 - Long.numberOfTrailingZeros(i);
        this.f7040l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7041m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        this.f7030b = new long[i + this.f7040l];
        this.f7031c = new Object[i + this.f7040l];
        int i3 = this.f7029a;
        this.f7029a = this.f7035g ? 1 : 0;
        this.f7033e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                long j = jArr[i4];
                if (j != 0) {
                    m341b(j, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: f */
    private int m335f(long j) {
        long j2 = j * (-1262997959);
        return (int) ((j2 ^ (j2 >>> this.f7037i)) & this.f7038j);
    }

    /* renamed from: g */
    private int m334g(long j) {
        long j2 = j * (-825114047);
        return (int) ((j2 ^ (j2 >>> this.f7037i)) & this.f7038j);
    }

    public int hashCode() {
        int i = 0;
        if (this.f7035g && this.f7034f != null) {
            i = 0 + this.f7034f.hashCode();
        }
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        int i2 = this.f7032d + this.f7033e;
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
        if (!(obj instanceof C1138i)) {
            return false;
        }
        C1138i c1138i = (C1138i) obj;
        if (c1138i.f7029a != this.f7029a || c1138i.f7035g != this.f7035g) {
            return false;
        }
        if (this.f7035g) {
            if (c1138i.f7034f == null) {
                if (this.f7034f != null) {
                    return false;
                }
            } else if (!c1138i.f7034f.equals(this.f7034f)) {
                return false;
            }
        }
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        int i = this.f7032d + this.f7033e;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    if (!c1138i.m338d(j) || c1138i.m347a(j) != null) {
                        return false;
                    }
                } else if (!obj2.equals(c1138i.m347a(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        if (this.f7029a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        long[] jArr = this.f7030b;
        Object[] objArr = this.f7031c;
        int length = jArr.length;
        while (true) {
            int i = length;
            length--;
            if (i <= 0) {
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
            int i2 = length;
            length--;
            if (i2 > 0) {
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
        return m344b();
    }

    /* renamed from: b */
    public C1139j m344b() {
        if (this.f7042n == null) {
            this.f7042n = new C1139j(this);
            this.f7043o = new C1139j(this);
        }
        if (!this.f7042n.f7051e) {
            this.f7042n.mo332b();
            this.f7042n.f7051e = true;
            this.f7043o.f7051e = false;
            return this.f7042n;
        }
        this.f7043o.mo332b();
        this.f7043o.f7051e = true;
        this.f7042n.f7051e = false;
        return this.f7043o;
    }
}

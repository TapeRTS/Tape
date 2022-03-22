package com.corrodinggames.rts.java.audio.p044a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/e.class */
public class C0868e implements Iterable {

    /* renamed from: a */
    public int f5894a;

    /* renamed from: b */
    int[] f5895b;

    /* renamed from: c */
    Object[] f5896c;

    /* renamed from: d */
    int f5897d;

    /* renamed from: e */
    int f5898e;

    /* renamed from: f */
    Object f5899f;

    /* renamed from: g */
    boolean f5900g;

    /* renamed from: h */
    private float f5901h;

    /* renamed from: i */
    private int f5902i;

    /* renamed from: j */
    private int f5903j;

    /* renamed from: k */
    private int f5904k;

    /* renamed from: l */
    private int f5905l;

    /* renamed from: m */
    private int f5906m;

    /* renamed from: n */
    private C0869f f5907n;

    /* renamed from: o */
    private C0869f f5908o;

    public C0868e() {
        this(51, 0.8f);
    }

    public C0868e(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b = C0876m.m289b((int) Math.ceil(i / f));
        if (b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b);
        }
        this.f5897d = b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f5901h = f;
        this.f5904k = (int) (this.f5897d * f);
        this.f5903j = this.f5897d - 1;
        this.f5902i = 31 - Integer.numberOfTrailingZeros(this.f5897d);
        this.f5905l = Math.max(3, ((int) Math.ceil(Math.log(this.f5897d))) * 2);
        this.f5906m = Math.max(Math.min(this.f5897d, 8), ((int) Math.sqrt(this.f5897d)) / 8);
        this.f5895b = new int[this.f5897d + this.f5905l];
        this.f5896c = new Object[this.f5895b.length];
    }

    /* renamed from: a */
    public Object m329a(int i, Object obj) {
        if (i == 0) {
            Object obj2 = this.f5899f;
            this.f5899f = obj;
            if (!this.f5900g) {
                this.f5900g = true;
                this.f5894a++;
            }
            return obj2;
        }
        int[] iArr = this.f5895b;
        int i2 = i & this.f5903j;
        int i3 = iArr[i2];
        if (i3 == i) {
            Object obj3 = this.f5896c[i2];
            this.f5896c[i2] = obj;
            return obj3;
        }
        int h = m317h(i);
        int i4 = iArr[h];
        if (i4 == i) {
            Object obj4 = this.f5896c[h];
            this.f5896c[h] = obj;
            return obj4;
        }
        int i5 = m316i(i);
        int i6 = iArr[i5];
        if (i6 == i) {
            Object obj5 = this.f5896c[i5];
            this.f5896c[i5] = obj;
            return obj5;
        }
        int i7 = this.f5897d;
        int i8 = i7 + this.f5898e;
        while (i7 < i8) {
            if (iArr[i7] == i) {
                Object obj6 = this.f5896c[i7];
                this.f5896c[i7] = obj;
                return obj6;
            }
            i7++;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            this.f5896c[i2] = obj;
            int i9 = this.f5894a;
            this.f5894a = i9 + 1;
            if (i9 < this.f5904k) {
                return null;
            }
            m318g(this.f5897d << 1);
            return null;
        } else if (i4 == 0) {
            iArr[h] = i;
            this.f5896c[h] = obj;
            int i10 = this.f5894a;
            this.f5894a = i10 + 1;
            if (i10 < this.f5904k) {
                return null;
            }
            m318g(this.f5897d << 1);
            return null;
        } else if (i6 == 0) {
            iArr[i5] = i;
            this.f5896c[i5] = obj;
            int i11 = this.f5894a;
            this.f5894a = i11 + 1;
            if (i11 < this.f5904k) {
                return null;
            }
            m318g(this.f5897d << 1);
            return null;
        } else {
            m328a(i, obj, i2, i3, h, i4, i5, i6);
            return null;
        }
    }

    /* renamed from: b */
    private void m325b(int i, Object obj) {
        if (i == 0) {
            this.f5899f = obj;
            this.f5900g = true;
            return;
        }
        int i2 = i & this.f5903j;
        int i3 = this.f5895b[i2];
        if (i3 == 0) {
            this.f5895b[i2] = i;
            this.f5896c[i2] = obj;
            int i4 = this.f5894a;
            this.f5894a = i4 + 1;
            if (i4 >= this.f5904k) {
                m318g(this.f5897d << 1);
                return;
            }
            return;
        }
        int h = m317h(i);
        int i5 = this.f5895b[h];
        if (i5 == 0) {
            this.f5895b[h] = i;
            this.f5896c[h] = obj;
            int i6 = this.f5894a;
            this.f5894a = i6 + 1;
            if (i6 >= this.f5904k) {
                m318g(this.f5897d << 1);
                return;
            }
            return;
        }
        int i7 = m316i(i);
        int i8 = this.f5895b[i7];
        if (i8 == 0) {
            this.f5895b[i7] = i;
            this.f5896c[i7] = obj;
            int i9 = this.f5894a;
            this.f5894a = i9 + 1;
            if (i9 >= this.f5904k) {
                m318g(this.f5897d << 1);
                return;
            }
            return;
        }
        m328a(i, obj, i2, i3, h, i5, i7, i8);
    }

    /* renamed from: a */
    private void m328a(int i, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        Object obj2;
        int i8;
        int[] iArr = this.f5895b;
        Object[] objArr = this.f5896c;
        int i9 = this.f5903j;
        int i10 = 0;
        int i11 = this.f5906m;
        while (true) {
            switch (C0876m.m291a(2)) {
                case 0:
                    i8 = i3;
                    obj2 = objArr[i2];
                    iArr[i2] = i;
                    objArr[i2] = obj;
                    break;
                case 1:
                    i8 = i5;
                    obj2 = objArr[i4];
                    iArr[i4] = i;
                    objArr[i4] = obj;
                    break;
                default:
                    i8 = i7;
                    obj2 = objArr[i6];
                    iArr[i6] = i;
                    objArr[i6] = obj;
                    break;
            }
            i2 = i8 & i9;
            i3 = iArr[i2];
            if (i3 == 0) {
                iArr[i2] = i8;
                objArr[i2] = obj2;
                int i12 = this.f5894a;
                this.f5894a = i12 + 1;
                if (i12 >= this.f5904k) {
                    m318g(this.f5897d << 1);
                    return;
                }
                return;
            }
            i4 = m317h(i8);
            i5 = iArr[i4];
            if (i5 == 0) {
                iArr[i4] = i8;
                objArr[i4] = obj2;
                int i13 = this.f5894a;
                this.f5894a = i13 + 1;
                if (i13 >= this.f5904k) {
                    m318g(this.f5897d << 1);
                    return;
                }
                return;
            }
            i6 = m316i(i8);
            i7 = iArr[i6];
            if (i7 == 0) {
                iArr[i6] = i8;
                objArr[i6] = obj2;
                int i14 = this.f5894a;
                this.f5894a = i14 + 1;
                if (i14 >= this.f5904k) {
                    m318g(this.f5897d << 1);
                    return;
                }
                return;
            }
            i10++;
            if (i10 == i11) {
                m323c(i8, obj2);
                return;
            } else {
                i = i8;
                obj = obj2;
            }
        }
    }

    /* renamed from: c */
    private void m323c(int i, Object obj) {
        if (this.f5898e == this.f5905l) {
            m318g(this.f5897d << 1);
            m329a(i, obj);
            return;
        }
        int i2 = this.f5897d + this.f5898e;
        this.f5895b[i2] = i;
        this.f5896c[i2] = obj;
        this.f5898e++;
        this.f5894a++;
    }

    /* renamed from: a */
    public Object m330a(int i) {
        if (i != 0) {
            int i2 = i & this.f5903j;
            if (this.f5895b[i2] != i) {
                i2 = m317h(i);
                if (this.f5895b[i2] != i) {
                    i2 = m316i(i);
                    if (this.f5895b[i2] != i) {
                        return m321d(i, null);
                    }
                }
            }
            return this.f5896c[i2];
        } else if (!this.f5900g) {
            return null;
        } else {
            return this.f5899f;
        }
    }

    /* renamed from: d */
    private Object m321d(int i, Object obj) {
        int[] iArr = this.f5895b;
        int i2 = this.f5897d;
        int i3 = i2 + this.f5898e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return this.f5896c[i2];
            }
            i2++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m326b(int i) {
        if (i != 0) {
            int i2 = i & this.f5903j;
            if (this.f5895b[i2] == i) {
                this.f5895b[i2] = 0;
                Object obj = this.f5896c[i2];
                this.f5896c[i2] = null;
                this.f5894a--;
                return obj;
            }
            int h = m317h(i);
            if (this.f5895b[h] == i) {
                this.f5895b[h] = 0;
                Object obj2 = this.f5896c[h];
                this.f5896c[h] = null;
                this.f5894a--;
                return obj2;
            }
            int i3 = m316i(i);
            if (this.f5895b[i3] != i) {
                return m324c(i);
            }
            this.f5895b[i3] = 0;
            Object obj3 = this.f5896c[i3];
            this.f5896c[i3] = null;
            this.f5894a--;
            return obj3;
        } else if (!this.f5900g) {
            return null;
        } else {
            Object obj4 = this.f5899f;
            this.f5899f = null;
            this.f5900g = false;
            this.f5894a--;
            return obj4;
        }
    }

    /* renamed from: c */
    Object m324c(int i) {
        int[] iArr = this.f5895b;
        int i2 = this.f5897d;
        int i3 = i2 + this.f5898e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                Object obj = this.f5896c[i2];
                m322d(i2);
                this.f5894a--;
                return obj;
            }
            i2++;
        }
        return null;
    }

    /* renamed from: d */
    void m322d(int i) {
        this.f5898e--;
        int i2 = this.f5897d + this.f5898e;
        if (i < i2) {
            this.f5895b[i] = this.f5895b[i2];
            this.f5896c[i] = this.f5896c[i2];
            this.f5896c[i2] = null;
            return;
        }
        this.f5896c[i] = null;
    }

    /* renamed from: a */
    public void m331a() {
        if (this.f5894a != 0) {
            int[] iArr = this.f5895b;
            Object[] objArr = this.f5896c;
            int i = this.f5897d + this.f5898e;
            while (true) {
                i--;
                if (i > 0) {
                    iArr[i] = 0;
                    objArr[i] = null;
                } else {
                    this.f5894a = 0;
                    this.f5898e = 0;
                    this.f5899f = null;
                    this.f5900g = false;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public boolean m320e(int i) {
        if (i == 0) {
            return this.f5900g;
        }
        if (this.f5895b[i & this.f5903j] == i) {
            return true;
        }
        if (this.f5895b[m317h(i)] == i) {
            return true;
        }
        if (this.f5895b[m316i(i)] != i) {
            return m319f(i);
        }
        return true;
    }

    /* renamed from: f */
    private boolean m319f(int i) {
        int[] iArr = this.f5895b;
        int i2 = this.f5897d;
        int i3 = i2 + this.f5898e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
        return false;
    }

    /* renamed from: g */
    private void m318g(int i) {
        int i2 = this.f5897d + this.f5898e;
        this.f5897d = i;
        this.f5904k = (int) (i * this.f5901h);
        this.f5903j = i - 1;
        this.f5902i = 31 - Integer.numberOfTrailingZeros(i);
        this.f5905l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f5906m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        int[] iArr = this.f5895b;
        Object[] objArr = this.f5896c;
        this.f5895b = new int[i + this.f5905l];
        this.f5896c = new Object[i + this.f5905l];
        int i3 = this.f5894a;
        this.f5894a = this.f5900g ? 1 : 0;
        this.f5898e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 != 0) {
                    m325b(i5, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: h */
    private int m317h(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f5902i)) & this.f5903j;
    }

    /* renamed from: i */
    private int m316i(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f5902i)) & this.f5903j;
    }

    public int hashCode() {
        int i = 0;
        if (this.f5900g && this.f5899f != null) {
            i = 0 + this.f5899f.hashCode();
        }
        int[] iArr = this.f5895b;
        Object[] objArr = this.f5896c;
        int i2 = this.f5897d + this.f5898e;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                i += i4 * 31;
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
        if (!(obj instanceof C0868e)) {
            return false;
        }
        C0868e eVar = (C0868e) obj;
        if (!(eVar.f5894a == this.f5894a && eVar.f5900g == this.f5900g)) {
            return false;
        }
        if (this.f5900g) {
            if (eVar.f5899f == null) {
                if (this.f5899f != null) {
                    return false;
                }
            } else if (!eVar.f5899f.equals(this.f5899f)) {
                return false;
            }
        }
        int[] iArr = this.f5895b;
        Object[] objArr = this.f5896c;
        int i = this.f5897d + this.f5898e;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    if (!eVar.m320e(i3) || eVar.m330a(i3) != null) {
                        return false;
                    }
                } else if (!obj2.equals(eVar.m330a(i3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        if (this.f5894a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        int[] iArr = this.f5895b;
        Object[] objArr = this.f5896c;
        int length = iArr.length;
        if (!this.f5900g) {
            while (true) {
                length--;
                if (length > 0) {
                    int i = iArr[length];
                    if (i != 0) {
                        sb.append(i);
                        sb.append('=');
                        sb.append(objArr[length]);
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            sb.append("0=");
            sb.append(this.f5899f);
        }
        while (true) {
            length--;
            if (length > 0) {
                int i2 = iArr[length];
                if (i2 != 0) {
                    sb.append(", ");
                    sb.append(i2);
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
        return m327b();
    }

    /* renamed from: b */
    public C0869f m327b() {
        if (this.f5907n == null) {
            this.f5907n = new C0869f(this);
            this.f5908o = new C0869f(this);
        }
        if (!this.f5907n.f5916e) {
            this.f5907n.mo314b();
            this.f5907n.f5916e = true;
            this.f5908o.f5916e = false;
            return this.f5907n;
        }
        this.f5908o.mo314b();
        this.f5908o.f5916e = true;
        this.f5907n.f5916e = false;
        return this.f5908o;
    }
}

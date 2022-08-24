package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/e.class */
public class C1134e implements Iterable {

    /* renamed from: a */
    public int f7006a;

    /* renamed from: b */
    int[] f7007b;

    /* renamed from: c */
    Object[] f7008c;

    /* renamed from: d */
    int f7009d;

    /* renamed from: e */
    int f7010e;

    /* renamed from: f */
    Object f7011f;

    /* renamed from: g */
    boolean f7012g;

    /* renamed from: h */
    private float f7013h;

    /* renamed from: i */
    private int f7014i;

    /* renamed from: j */
    private int f7015j;

    /* renamed from: k */
    private int f7016k;

    /* renamed from: l */
    private int f7017l;

    /* renamed from: m */
    private int f7018m;

    /* renamed from: n */
    private C1135f f7019n;

    /* renamed from: o */
    private C1135f f7020o;

    public C1134e() {
        this(51, 0.8f);
    }

    public C1134e(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m326b = C1142m.m326b((int) Math.ceil(i / f));
        if (m326b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m326b);
        }
        this.f7009d = m326b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7013h = f;
        this.f7016k = (int) (this.f7009d * f);
        this.f7015j = this.f7009d - 1;
        this.f7014i = 31 - Integer.numberOfTrailingZeros(this.f7009d);
        this.f7017l = Math.max(3, ((int) Math.ceil(Math.log(this.f7009d))) * 2);
        this.f7018m = Math.max(Math.min(this.f7009d, 8), ((int) Math.sqrt(this.f7009d)) / 8);
        this.f7007b = new int[this.f7009d + this.f7017l];
        this.f7008c = new Object[this.f7007b.length];
    }

    /* renamed from: a */
    public Object m366a(int i, Object obj) {
        if (i == 0) {
            Object obj2 = this.f7011f;
            this.f7011f = obj;
            if (!this.f7012g) {
                this.f7012g = true;
                this.f7006a++;
            }
            return obj2;
        }
        int[] iArr = this.f7007b;
        int i2 = i & this.f7015j;
        int i3 = iArr[i2];
        if (i3 == i) {
            Object obj3 = this.f7008c[i2];
            this.f7008c[i2] = obj;
            return obj3;
        }
        int m354h = m354h(i);
        int i4 = iArr[m354h];
        if (i4 == i) {
            Object obj4 = this.f7008c[m354h];
            this.f7008c[m354h] = obj;
            return obj4;
        }
        int m353i = m353i(i);
        int i5 = iArr[m353i];
        if (i5 == i) {
            Object obj5 = this.f7008c[m353i];
            this.f7008c[m353i] = obj;
            return obj5;
        }
        int i6 = this.f7009d;
        int i7 = i6 + this.f7010e;
        while (i6 < i7) {
            if (iArr[i6] != i) {
                i6++;
            } else {
                Object obj6 = this.f7008c[i6];
                this.f7008c[i6] = obj;
                return obj6;
            }
        }
        if (i3 == 0) {
            iArr[i2] = i;
            this.f7008c[i2] = obj;
            int i8 = this.f7006a;
            this.f7006a = i8 + 1;
            if (i8 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return null;
            }
            return null;
        } else if (i4 == 0) {
            iArr[m354h] = i;
            this.f7008c[m354h] = obj;
            int i9 = this.f7006a;
            this.f7006a = i9 + 1;
            if (i9 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return null;
            }
            return null;
        } else if (i5 == 0) {
            iArr[m353i] = i;
            this.f7008c[m353i] = obj;
            int i10 = this.f7006a;
            this.f7006a = i10 + 1;
            if (i10 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return null;
            }
            return null;
        } else {
            m365a(i, obj, i2, i3, m354h, i4, m353i, i5);
            return null;
        }
    }

    /* renamed from: b */
    private void m362b(int i, Object obj) {
        if (i == 0) {
            this.f7011f = obj;
            this.f7012g = true;
            return;
        }
        int i2 = i & this.f7015j;
        int i3 = this.f7007b[i2];
        if (i3 == 0) {
            this.f7007b[i2] = i;
            this.f7008c[i2] = obj;
            int i4 = this.f7006a;
            this.f7006a = i4 + 1;
            if (i4 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return;
            }
            return;
        }
        int m354h = m354h(i);
        int i5 = this.f7007b[m354h];
        if (i5 == 0) {
            this.f7007b[m354h] = i;
            this.f7008c[m354h] = obj;
            int i6 = this.f7006a;
            this.f7006a = i6 + 1;
            if (i6 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return;
            }
            return;
        }
        int m353i = m353i(i);
        int i7 = this.f7007b[m353i];
        if (i7 == 0) {
            this.f7007b[m353i] = i;
            this.f7008c[m353i] = obj;
            int i8 = this.f7006a;
            this.f7006a = i8 + 1;
            if (i8 >= this.f7016k) {
                m355g(this.f7009d << 1);
                return;
            }
            return;
        }
        m365a(i, obj, i2, i3, m354h, i5, m353i, i7);
    }

    /* renamed from: a */
    private void m365a(int i, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        Object obj2;
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        int i9 = this.f7015j;
        int i10 = 0;
        int i11 = this.f7018m;
        while (true) {
            switch (C1142m.m328a(2)) {
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
                int i12 = this.f7006a;
                this.f7006a = i12 + 1;
                if (i12 >= this.f7016k) {
                    m355g(this.f7009d << 1);
                    return;
                }
                return;
            }
            i4 = m354h(i8);
            i5 = iArr[i4];
            if (i5 == 0) {
                iArr[i4] = i8;
                objArr[i4] = obj2;
                int i13 = this.f7006a;
                this.f7006a = i13 + 1;
                if (i13 >= this.f7016k) {
                    m355g(this.f7009d << 1);
                    return;
                }
                return;
            }
            i6 = m353i(i8);
            i7 = iArr[i6];
            if (i7 == 0) {
                iArr[i6] = i8;
                objArr[i6] = obj2;
                int i14 = this.f7006a;
                this.f7006a = i14 + 1;
                if (i14 >= this.f7016k) {
                    m355g(this.f7009d << 1);
                    return;
                }
                return;
            }
            i10++;
            if (i10 != i11) {
                i = i8;
                obj = obj2;
            } else {
                m360c(i8, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m360c(int i, Object obj) {
        if (this.f7010e == this.f7017l) {
            m355g(this.f7009d << 1);
            m366a(i, obj);
            return;
        }
        int i2 = this.f7009d + this.f7010e;
        this.f7007b[i2] = i;
        this.f7008c[i2] = obj;
        this.f7010e++;
        this.f7006a++;
    }

    /* renamed from: a */
    public Object m367a(int i) {
        if (i == 0) {
            if (this.f7012g) {
                return this.f7011f;
            }
            return null;
        }
        int i2 = i & this.f7015j;
        if (this.f7007b[i2] != i) {
            i2 = m354h(i);
            if (this.f7007b[i2] != i) {
                i2 = m353i(i);
                if (this.f7007b[i2] != i) {
                    return m358d(i, null);
                }
            }
        }
        return this.f7008c[i2];
    }

    /* renamed from: d */
    private Object m358d(int i, Object obj) {
        int[] iArr = this.f7007b;
        int i2 = this.f7009d;
        int i3 = i2 + this.f7010e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return this.f7008c[i2];
            }
            i2++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m363b(int i) {
        if (i == 0) {
            if (!this.f7012g) {
                return null;
            }
            Object obj = this.f7011f;
            this.f7011f = null;
            this.f7012g = false;
            this.f7006a--;
            return obj;
        }
        int i2 = i & this.f7015j;
        if (this.f7007b[i2] == i) {
            this.f7007b[i2] = 0;
            Object obj2 = this.f7008c[i2];
            this.f7008c[i2] = null;
            this.f7006a--;
            return obj2;
        }
        int m354h = m354h(i);
        if (this.f7007b[m354h] == i) {
            this.f7007b[m354h] = 0;
            Object obj3 = this.f7008c[m354h];
            this.f7008c[m354h] = null;
            this.f7006a--;
            return obj3;
        }
        int m353i = m353i(i);
        if (this.f7007b[m353i] == i) {
            this.f7007b[m353i] = 0;
            Object obj4 = this.f7008c[m353i];
            this.f7008c[m353i] = null;
            this.f7006a--;
            return obj4;
        }
        return m361c(i);
    }

    /* renamed from: c */
    Object m361c(int i) {
        int[] iArr = this.f7007b;
        int i2 = this.f7009d;
        int i3 = i2 + this.f7010e;
        while (i2 < i3) {
            if (iArr[i2] != i) {
                i2++;
            } else {
                Object obj = this.f7008c[i2];
                m359d(i2);
                this.f7006a--;
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m359d(int i) {
        this.f7010e--;
        int i2 = this.f7009d + this.f7010e;
        if (i < i2) {
            this.f7007b[i] = this.f7007b[i2];
            this.f7008c[i] = this.f7008c[i2];
            this.f7008c[i2] = null;
            return;
        }
        this.f7008c[i] = null;
    }

    /* renamed from: a */
    public void m368a() {
        if (this.f7006a == 0) {
            return;
        }
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        int i = this.f7009d + this.f7010e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                iArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7006a = 0;
                this.f7010e = 0;
                this.f7011f = null;
                this.f7012g = false;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m357e(int i) {
        if (i == 0) {
            return this.f7012g;
        }
        if (this.f7007b[i & this.f7015j] != i) {
            if (this.f7007b[m354h(i)] != i) {
                if (this.f7007b[m353i(i)] == i) {
                    return true;
                }
                return m356f(i);
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m356f(int i) {
        int[] iArr = this.f7007b;
        int i2 = this.f7009d;
        int i3 = i2 + this.f7010e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
        return false;
    }

    /* renamed from: g */
    private void m355g(int i) {
        int i2 = this.f7009d + this.f7010e;
        this.f7009d = i;
        this.f7016k = (int) (i * this.f7013h);
        this.f7015j = i - 1;
        this.f7014i = 31 - Integer.numberOfTrailingZeros(i);
        this.f7017l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7018m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        this.f7007b = new int[i + this.f7017l];
        this.f7008c = new Object[i + this.f7017l];
        int i3 = this.f7006a;
        this.f7006a = this.f7012g ? 1 : 0;
        this.f7010e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 != 0) {
                    m362b(i5, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: h */
    private int m354h(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7014i)) & this.f7015j;
    }

    /* renamed from: i */
    private int m353i(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7014i)) & this.f7015j;
    }

    public int hashCode() {
        int i = 0;
        if (this.f7012g && this.f7011f != null) {
            i = 0 + this.f7011f.hashCode();
        }
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        int i2 = this.f7009d + this.f7010e;
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
        if (!(obj instanceof C1134e)) {
            return false;
        }
        C1134e c1134e = (C1134e) obj;
        if (c1134e.f7006a != this.f7006a || c1134e.f7012g != this.f7012g) {
            return false;
        }
        if (this.f7012g) {
            if (c1134e.f7011f == null) {
                if (this.f7011f != null) {
                    return false;
                }
            } else if (!c1134e.f7011f.equals(this.f7011f)) {
                return false;
            }
        }
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        int i = this.f7009d + this.f7010e;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    if (!c1134e.m357e(i3) || c1134e.m367a(i3) != null) {
                        return false;
                    }
                } else if (!obj2.equals(c1134e.m367a(i3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        int i;
        if (this.f7006a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        int[] iArr = this.f7007b;
        Object[] objArr = this.f7008c;
        int length = iArr.length;
        if (this.f7012g) {
            sb.append("0=");
            sb.append(this.f7011f);
        } else {
            do {
                int i2 = length;
                length--;
                if (i2 > 0) {
                    i = iArr[length];
                }
            } while (i == 0);
            sb.append(i);
            sb.append('=');
            sb.append(objArr[length]);
        }
        while (true) {
            int i3 = length;
            length--;
            if (i3 > 0) {
                int i4 = iArr[length];
                if (i4 != 0) {
                    sb.append(", ");
                    sb.append(i4);
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
        return m364b();
    }

    /* renamed from: b */
    public C1135f m364b() {
        if (this.f7019n == null) {
            this.f7019n = new C1135f(this);
            this.f7020o = new C1135f(this);
        }
        if (!this.f7019n.f7028e) {
            this.f7019n.mo351b();
            this.f7019n.f7028e = true;
            this.f7020o.f7028e = false;
            return this.f7019n;
        }
        this.f7020o.mo351b();
        this.f7020o.f7028e = true;
        this.f7019n.f7028e = false;
        return this.f7020o;
    }
}

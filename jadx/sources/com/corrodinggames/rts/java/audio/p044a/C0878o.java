package com.corrodinggames.rts.java.audio.p044a;

/* renamed from: com.corrodinggames.rts.java.audio.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/o.class */
public class C0878o implements Iterable {

    /* renamed from: a */
    public int f5942a;

    /* renamed from: b */
    Object[] f5943b;

    /* renamed from: c */
    Object[] f5944c;

    /* renamed from: d */
    int f5945d;

    /* renamed from: e */
    int f5946e;

    /* renamed from: f */
    private float f5947f;

    /* renamed from: g */
    private int f5948g;

    /* renamed from: h */
    private int f5949h;

    /* renamed from: i */
    private int f5950i;

    /* renamed from: j */
    private int f5951j;

    /* renamed from: k */
    private int f5952k;

    /* renamed from: l */
    private C0879p f5953l;

    /* renamed from: m */
    private C0879p f5954m;

    public C0878o() {
        this(51, 0.8f);
    }

    public C0878o(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b = C0876m.m289b((int) Math.ceil(i / f));
        if (b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b);
        }
        this.f5945d = b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f5947f = f;
        this.f5950i = (int) (this.f5945d * f);
        this.f5949h = this.f5945d - 1;
        this.f5948g = 31 - Integer.numberOfTrailingZeros(this.f5945d);
        this.f5951j = Math.max(3, ((int) Math.ceil(Math.log(this.f5945d))) * 2);
        this.f5952k = Math.max(Math.min(this.f5945d, 8), ((int) Math.sqrt(this.f5945d)) / 8);
        this.f5943b = new Object[this.f5945d + this.f5951j];
        this.f5944c = new Object[this.f5943b.length];
    }

    /* renamed from: a */
    public Object m285a(Object obj, Object obj2) {
        if (obj != null) {
            return m279b(obj, obj2);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    /* renamed from: b */
    private Object m279b(Object obj, Object obj2) {
        Object[] objArr = this.f5943b;
        int hashCode = obj.hashCode();
        int i = hashCode & this.f5949h;
        Object obj3 = objArr[i];
        if (obj.equals(obj3)) {
            Object obj4 = this.f5944c[i];
            this.f5944c[i] = obj2;
            return obj4;
        }
        int c = m278c(hashCode);
        Object obj5 = objArr[c];
        if (obj.equals(obj5)) {
            Object obj6 = this.f5944c[c];
            this.f5944c[c] = obj2;
            return obj6;
        }
        int d = m275d(hashCode);
        Object obj7 = objArr[d];
        if (obj.equals(obj7)) {
            Object obj8 = this.f5944c[d];
            this.f5944c[d] = obj2;
            return obj8;
        }
        int i2 = this.f5945d;
        int i3 = i2 + this.f5946e;
        while (i2 < i3) {
            if (obj.equals(objArr[i2])) {
                Object obj9 = this.f5944c[i2];
                this.f5944c[i2] = obj2;
                return obj9;
            }
            i2++;
        }
        if (obj3 == null) {
            objArr[i] = obj;
            this.f5944c[i] = obj2;
            int i4 = this.f5942a;
            this.f5942a = i4 + 1;
            if (i4 < this.f5950i) {
                return null;
            }
            m281b(this.f5945d << 1);
            return null;
        } else if (obj5 == null) {
            objArr[c] = obj;
            this.f5944c[c] = obj2;
            int i5 = this.f5942a;
            this.f5942a = i5 + 1;
            if (i5 < this.f5950i) {
                return null;
            }
            m281b(this.f5945d << 1);
            return null;
        } else if (obj7 == null) {
            objArr[d] = obj;
            this.f5944c[d] = obj2;
            int i6 = this.f5942a;
            this.f5942a = i6 + 1;
            if (i6 < this.f5950i) {
                return null;
            }
            m281b(this.f5945d << 1);
            return null;
        } else {
            m284a(obj, obj2, i, obj3, c, obj5, d, obj7);
            return null;
        }
    }

    /* renamed from: c */
    private void m276c(Object obj, Object obj2) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f5949h;
        Object obj3 = this.f5943b[i];
        if (obj3 == null) {
            this.f5943b[i] = obj;
            this.f5944c[i] = obj2;
            int i2 = this.f5942a;
            this.f5942a = i2 + 1;
            if (i2 >= this.f5950i) {
                m281b(this.f5945d << 1);
                return;
            }
            return;
        }
        int c = m278c(hashCode);
        Object obj4 = this.f5943b[c];
        if (obj4 == null) {
            this.f5943b[c] = obj;
            this.f5944c[c] = obj2;
            int i3 = this.f5942a;
            this.f5942a = i3 + 1;
            if (i3 >= this.f5950i) {
                m281b(this.f5945d << 1);
                return;
            }
            return;
        }
        int d = m275d(hashCode);
        Object obj5 = this.f5943b[d];
        if (obj5 == null) {
            this.f5943b[d] = obj;
            this.f5944c[d] = obj2;
            int i4 = this.f5942a;
            this.f5942a = i4 + 1;
            if (i4 >= this.f5950i) {
                m281b(this.f5945d << 1);
                return;
            }
            return;
        }
        m284a(obj, obj2, i, obj3, c, obj4, d, obj5);
    }

    /* renamed from: a */
    private void m284a(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3, Object obj5) {
        Object obj6;
        Object obj7;
        Object[] objArr = this.f5943b;
        Object[] objArr2 = this.f5944c;
        int i4 = this.f5949h;
        int i5 = 0;
        int i6 = this.f5952k;
        while (true) {
            switch (C0876m.m291a(2)) {
                case 0:
                    obj7 = obj3;
                    obj6 = objArr2[i];
                    objArr[i] = obj;
                    objArr2[i] = obj2;
                    break;
                case 1:
                    obj7 = obj4;
                    obj6 = objArr2[i2];
                    objArr[i2] = obj;
                    objArr2[i2] = obj2;
                    break;
                default:
                    obj7 = obj5;
                    obj6 = objArr2[i3];
                    objArr[i3] = obj;
                    objArr2[i3] = obj2;
                    break;
            }
            int hashCode = obj7.hashCode();
            i = hashCode & i4;
            obj3 = objArr[i];
            if (obj3 == null) {
                objArr[i] = obj7;
                objArr2[i] = obj6;
                int i7 = this.f5942a;
                this.f5942a = i7 + 1;
                if (i7 >= this.f5950i) {
                    m281b(this.f5945d << 1);
                    return;
                }
                return;
            }
            i2 = m278c(hashCode);
            obj4 = objArr[i2];
            if (obj4 == null) {
                objArr[i2] = obj7;
                objArr2[i2] = obj6;
                int i8 = this.f5942a;
                this.f5942a = i8 + 1;
                if (i8 >= this.f5950i) {
                    m281b(this.f5945d << 1);
                    return;
                }
                return;
            }
            i3 = m275d(hashCode);
            obj5 = objArr[i3];
            if (obj5 == null) {
                objArr[i3] = obj7;
                objArr2[i3] = obj6;
                int i9 = this.f5942a;
                this.f5942a = i9 + 1;
                if (i9 >= this.f5950i) {
                    m281b(this.f5945d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 == i6) {
                m274d(obj7, obj6);
                return;
            } else {
                obj = obj7;
                obj2 = obj6;
            }
        }
    }

    /* renamed from: d */
    private void m274d(Object obj, Object obj2) {
        if (this.f5946e == this.f5951j) {
            m281b(this.f5945d << 1);
            m279b(obj, obj2);
            return;
        }
        int i = this.f5945d + this.f5946e;
        this.f5943b[i] = obj;
        this.f5944c[i] = obj2;
        this.f5946e++;
        this.f5942a++;
    }

    /* renamed from: a */
    public Object m286a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f5949h;
        if (!obj.equals(this.f5943b[i])) {
            i = m278c(hashCode);
            if (!obj.equals(this.f5943b[i])) {
                i = m275d(hashCode);
                if (!obj.equals(this.f5943b[i])) {
                    return m273e(obj, null);
                }
            }
        }
        return this.f5944c[i];
    }

    /* renamed from: e */
    private Object m273e(Object obj, Object obj2) {
        Object[] objArr = this.f5943b;
        int i = this.f5945d;
        int i2 = i + this.f5946e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return this.f5944c[i];
            }
            i++;
        }
        return obj2;
    }

    /* renamed from: a */
    void m287a(int i) {
        this.f5946e--;
        int i2 = this.f5945d + this.f5946e;
        if (i < i2) {
            this.f5943b[i] = this.f5943b[i2];
            this.f5944c[i] = this.f5944c[i2];
            this.f5944c[i2] = null;
            return;
        }
        this.f5944c[i] = null;
    }

    /* renamed from: b */
    public boolean m280b(Object obj) {
        int hashCode = obj.hashCode();
        if (obj.equals(this.f5943b[hashCode & this.f5949h])) {
            return true;
        }
        if (obj.equals(this.f5943b[m278c(hashCode)])) {
            return true;
        }
        if (!obj.equals(this.f5943b[m275d(hashCode)])) {
            return m277c(obj);
        }
        return true;
    }

    /* renamed from: c */
    private boolean m277c(Object obj) {
        Object[] objArr = this.f5943b;
        int i = this.f5945d;
        int i2 = i + this.f5946e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m281b(int i) {
        int i2 = this.f5945d + this.f5946e;
        this.f5945d = i;
        this.f5950i = (int) (i * this.f5947f);
        this.f5949h = i - 1;
        this.f5948g = 31 - Integer.numberOfTrailingZeros(i);
        this.f5951j = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f5952k = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        Object[] objArr = this.f5943b;
        Object[] objArr2 = this.f5944c;
        this.f5943b = new Object[i + this.f5951j];
        this.f5944c = new Object[i + this.f5951j];
        int i3 = this.f5942a;
        this.f5942a = 0;
        this.f5946e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    m276c(obj, objArr2[i4]);
                }
            }
        }
    }

    /* renamed from: c */
    private int m278c(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f5948g)) & this.f5949h;
    }

    /* renamed from: d */
    private int m275d(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f5948g)) & this.f5949h;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.f5943b;
        Object[] objArr2 = this.f5944c;
        int i2 = this.f5945d + this.f5946e;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i += obj.hashCode() * 31;
                Object obj2 = objArr2[i3];
                if (obj2 != null) {
                    i += obj2.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0878o)) {
            return false;
        }
        C0878o oVar = (C0878o) obj;
        if (oVar.f5942a != this.f5942a) {
            return false;
        }
        Object[] objArr = this.f5943b;
        Object[] objArr2 = this.f5944c;
        int i = this.f5945d + this.f5946e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                Object obj3 = objArr2[i2];
                if (obj3 == null) {
                    if (!oVar.m280b(obj2) || oVar.m286a(obj2) != null) {
                        return false;
                    }
                } else if (!obj3.equals(oVar.m286a(obj2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return m283a(", ", true);
    }

    /* renamed from: a */
    private String m283a(String str, boolean z) {
        if (this.f5942a == 0) {
            return z ? "{}" : "";
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.f5943b;
        Object[] objArr2 = this.f5944c;
        int length = objArr.length;
        while (true) {
            length--;
            if (length > 0) {
                Object obj = objArr[length];
                if (obj != null) {
                    sb.append(obj);
                    sb.append('=');
                    sb.append(objArr2[length]);
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            length--;
            if (length <= 0) {
                break;
            }
            Object obj2 = objArr[length];
            if (obj2 != null) {
                sb.append(str);
                sb.append(obj2);
                sb.append('=');
                sb.append(objArr2[length]);
            }
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C0879p iterator() {
        return m282b();
    }

    /* renamed from: b */
    public C0879p m282b() {
        if (this.f5953l == null) {
            this.f5953l = new C0879p(this);
            this.f5954m = new C0879p(this);
        }
        if (!this.f5953l.f5962f) {
            this.f5953l.mo270c();
            this.f5953l.f5962f = true;
            this.f5954m.f5962f = false;
            return this.f5953l;
        }
        this.f5954m.mo270c();
        this.f5954m.f5962f = true;
        this.f5953l.f5962f = false;
        return this.f5954m;
    }
}

package com.corrodinggames.rts.java.audio.p050a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.java.audio.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/o.class */
public class C1144o implements Iterable {

    /* renamed from: a */
    public int f7054a;

    /* renamed from: b */
    Object[] f7055b;

    /* renamed from: c */
    Object[] f7056c;

    /* renamed from: d */
    int f7057d;

    /* renamed from: e */
    int f7058e;

    /* renamed from: f */
    private float f7059f;

    /* renamed from: g */
    private int f7060g;

    /* renamed from: h */
    private int f7061h;

    /* renamed from: i */
    private int f7062i;

    /* renamed from: j */
    private int f7063j;

    /* renamed from: k */
    private int f7064k;

    /* renamed from: l */
    private C1145p f7065l;

    /* renamed from: m */
    private C1145p f7066m;

    public C1144o() {
        this(51, 0.8f);
    }

    public C1144o(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m326b = C1142m.m326b((int) Math.ceil(i / f));
        if (m326b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m326b);
        }
        this.f7057d = m326b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7059f = f;
        this.f7062i = (int) (this.f7057d * f);
        this.f7061h = this.f7057d - 1;
        this.f7060g = 31 - Integer.numberOfTrailingZeros(this.f7057d);
        this.f7063j = Math.max(3, ((int) Math.ceil(Math.log(this.f7057d))) * 2);
        this.f7064k = Math.max(Math.min(this.f7057d, 8), ((int) Math.sqrt(this.f7057d)) / 8);
        this.f7055b = new Object[this.f7057d + this.f7063j];
        this.f7056c = new Object[this.f7055b.length];
    }

    /* renamed from: a */
    public Object m322a(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        return m316b(obj, obj2);
    }

    /* renamed from: b */
    private Object m316b(Object obj, Object obj2) {
        Object[] objArr = this.f7055b;
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7061h;
        Object obj3 = objArr[i];
        if (obj.equals(obj3)) {
            Object obj4 = this.f7056c[i];
            this.f7056c[i] = obj2;
            return obj4;
        }
        int m315c = m315c(hashCode);
        Object obj5 = objArr[m315c];
        if (obj.equals(obj5)) {
            Object obj6 = this.f7056c[m315c];
            this.f7056c[m315c] = obj2;
            return obj6;
        }
        int m312d = m312d(hashCode);
        Object obj7 = objArr[m312d];
        if (obj.equals(obj7)) {
            Object obj8 = this.f7056c[m312d];
            this.f7056c[m312d] = obj2;
            return obj8;
        }
        int i2 = this.f7057d;
        int i3 = i2 + this.f7058e;
        while (i2 < i3) {
            if (!obj.equals(objArr[i2])) {
                i2++;
            } else {
                Object obj9 = this.f7056c[i2];
                this.f7056c[i2] = obj2;
                return obj9;
            }
        }
        if (obj3 == null) {
            objArr[i] = obj;
            this.f7056c[i] = obj2;
            int i4 = this.f7054a;
            this.f7054a = i4 + 1;
            if (i4 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return null;
            }
            return null;
        } else if (obj5 == null) {
            objArr[m315c] = obj;
            this.f7056c[m315c] = obj2;
            int i5 = this.f7054a;
            this.f7054a = i5 + 1;
            if (i5 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return null;
            }
            return null;
        } else if (obj7 == null) {
            objArr[m312d] = obj;
            this.f7056c[m312d] = obj2;
            int i6 = this.f7054a;
            this.f7054a = i6 + 1;
            if (i6 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return null;
            }
            return null;
        } else {
            m321a(obj, obj2, i, obj3, m315c, obj5, m312d, obj7);
            return null;
        }
    }

    /* renamed from: c */
    private void m313c(Object obj, Object obj2) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7061h;
        Object obj3 = this.f7055b[i];
        if (obj3 == null) {
            this.f7055b[i] = obj;
            this.f7056c[i] = obj2;
            int i2 = this.f7054a;
            this.f7054a = i2 + 1;
            if (i2 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return;
            }
            return;
        }
        int m315c = m315c(hashCode);
        Object obj4 = this.f7055b[m315c];
        if (obj4 == null) {
            this.f7055b[m315c] = obj;
            this.f7056c[m315c] = obj2;
            int i3 = this.f7054a;
            this.f7054a = i3 + 1;
            if (i3 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return;
            }
            return;
        }
        int m312d = m312d(hashCode);
        Object obj5 = this.f7055b[m312d];
        if (obj5 == null) {
            this.f7055b[m312d] = obj;
            this.f7056c[m312d] = obj2;
            int i4 = this.f7054a;
            this.f7054a = i4 + 1;
            if (i4 >= this.f7062i) {
                m318b(this.f7057d << 1);
                return;
            }
            return;
        }
        m321a(obj, obj2, i, obj3, m315c, obj4, m312d, obj5);
    }

    /* renamed from: a */
    private void m321a(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3, Object obj5) {
        Object obj6;
        Object obj7;
        Object[] objArr = this.f7055b;
        Object[] objArr2 = this.f7056c;
        int i4 = this.f7061h;
        int i5 = 0;
        int i6 = this.f7064k;
        while (true) {
            switch (C1142m.m328a(2)) {
                case 0:
                    obj6 = obj3;
                    obj7 = objArr2[i];
                    objArr[i] = obj;
                    objArr2[i] = obj2;
                    break;
                case 1:
                    obj6 = obj4;
                    obj7 = objArr2[i2];
                    objArr[i2] = obj;
                    objArr2[i2] = obj2;
                    break;
                default:
                    obj6 = obj5;
                    obj7 = objArr2[i3];
                    objArr[i3] = obj;
                    objArr2[i3] = obj2;
                    break;
            }
            int hashCode = obj6.hashCode();
            i = hashCode & i4;
            obj3 = objArr[i];
            if (obj3 == null) {
                objArr[i] = obj6;
                objArr2[i] = obj7;
                int i7 = this.f7054a;
                this.f7054a = i7 + 1;
                if (i7 >= this.f7062i) {
                    m318b(this.f7057d << 1);
                    return;
                }
                return;
            }
            i2 = m315c(hashCode);
            obj4 = objArr[i2];
            if (obj4 == null) {
                objArr[i2] = obj6;
                objArr2[i2] = obj7;
                int i8 = this.f7054a;
                this.f7054a = i8 + 1;
                if (i8 >= this.f7062i) {
                    m318b(this.f7057d << 1);
                    return;
                }
                return;
            }
            i3 = m312d(hashCode);
            obj5 = objArr[i3];
            if (obj5 == null) {
                objArr[i3] = obj6;
                objArr2[i3] = obj7;
                int i9 = this.f7054a;
                this.f7054a = i9 + 1;
                if (i9 >= this.f7062i) {
                    m318b(this.f7057d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                obj = obj6;
                obj2 = obj7;
            } else {
                m311d(obj6, obj7);
                return;
            }
        }
    }

    /* renamed from: d */
    private void m311d(Object obj, Object obj2) {
        if (this.f7058e == this.f7063j) {
            m318b(this.f7057d << 1);
            m316b(obj, obj2);
            return;
        }
        int i = this.f7057d + this.f7058e;
        this.f7055b[i] = obj;
        this.f7056c[i] = obj2;
        this.f7058e++;
        this.f7054a++;
    }

    /* renamed from: a */
    public Object m323a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7061h;
        if (!obj.equals(this.f7055b[i])) {
            i = m315c(hashCode);
            if (!obj.equals(this.f7055b[i])) {
                i = m312d(hashCode);
                if (!obj.equals(this.f7055b[i])) {
                    return m310e(obj, null);
                }
            }
        }
        return this.f7056c[i];
    }

    /* renamed from: e */
    private Object m310e(Object obj, Object obj2) {
        Object[] objArr = this.f7055b;
        int i = this.f7057d;
        int i2 = i + this.f7058e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return this.f7056c[i];
            }
            i++;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m324a(int i) {
        this.f7058e--;
        int i2 = this.f7057d + this.f7058e;
        if (i < i2) {
            this.f7055b[i] = this.f7055b[i2];
            this.f7056c[i] = this.f7056c[i2];
            this.f7056c[i2] = null;
            return;
        }
        this.f7056c[i] = null;
    }

    /* renamed from: b */
    public boolean m317b(Object obj) {
        int hashCode = obj.hashCode();
        if (!obj.equals(this.f7055b[hashCode & this.f7061h])) {
            if (!obj.equals(this.f7055b[m315c(hashCode)])) {
                if (obj.equals(this.f7055b[m312d(hashCode)])) {
                    return true;
                }
                return m314c(obj);
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m314c(Object obj) {
        Object[] objArr = this.f7055b;
        int i = this.f7057d;
        int i2 = i + this.f7058e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m318b(int i) {
        int i2 = this.f7057d + this.f7058e;
        this.f7057d = i;
        this.f7062i = (int) (i * this.f7059f);
        this.f7061h = i - 1;
        this.f7060g = 31 - Integer.numberOfTrailingZeros(i);
        this.f7063j = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7064k = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        Object[] objArr = this.f7055b;
        Object[] objArr2 = this.f7056c;
        this.f7055b = new Object[i + this.f7063j];
        this.f7056c = new Object[i + this.f7063j];
        int i3 = this.f7054a;
        this.f7054a = 0;
        this.f7058e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    m313c(obj, objArr2[i4]);
                }
            }
        }
    }

    /* renamed from: c */
    private int m315c(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7060g)) & this.f7061h;
    }

    /* renamed from: d */
    private int m312d(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7060g)) & this.f7061h;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.f7055b;
        Object[] objArr2 = this.f7056c;
        int i2 = this.f7057d + this.f7058e;
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
        if (!(obj instanceof C1144o)) {
            return false;
        }
        C1144o c1144o = (C1144o) obj;
        if (c1144o.f7054a != this.f7054a) {
            return false;
        }
        Object[] objArr = this.f7055b;
        Object[] objArr2 = this.f7056c;
        int i = this.f7057d + this.f7058e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                Object obj3 = objArr2[i2];
                if (obj3 == null) {
                    if (!c1144o.m317b(obj2) || c1144o.m323a(obj2) != null) {
                        return false;
                    }
                } else if (!obj3.equals(c1144o.m323a(obj2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return m320a(", ", true);
    }

    /* renamed from: a */
    private String m320a(String str, boolean z) {
        if (this.f7054a == 0) {
            return z ? "{}" : VariableScope.nullOrMissingString;
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.f7055b;
        Object[] objArr2 = this.f7056c;
        int length = objArr.length;
        while (true) {
            int i = length;
            length--;
            if (i > 0) {
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
            int i2 = length;
            length--;
            if (i2 <= 0) {
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

    @Override // java.lang.Iterable
    /* renamed from: a */
    public C1145p iterator() {
        return m319b();
    }

    /* renamed from: b */
    public C1145p m319b() {
        if (this.f7065l == null) {
            this.f7065l = new C1145p(this);
            this.f7066m = new C1145p(this);
        }
        if (!this.f7065l.f7074f) {
            this.f7065l.mo307c();
            this.f7065l.f7074f = true;
            this.f7066m.f7074f = false;
            return this.f7065l;
        }
        this.f7066m.mo307c();
        this.f7066m.f7074f = true;
        this.f7065l.f7074f = false;
        return this.f7066m;
    }
}

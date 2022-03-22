package android.util;

import com.p005a.p006a.p007a.C0042a;

/* loaded from: game-lib.jar:android/util/SparseArray.class */
public class SparseArray implements Cloneable {

    /* renamed from: a */
    private static final Object f300a = new Object();

    /* renamed from: b */
    private boolean f301b;

    /* renamed from: c */
    private int[] f302c;

    /* renamed from: d */
    private Object[] f303d;

    /* renamed from: e */
    private int f304e;

    public SparseArray() {
        this(10);
    }

    public SparseArray(int i) {
        this.f301b = false;
        if (i == 0) {
            this.f302c = C0040a.f306b;
            this.f303d = C0040a.f308d;
        } else {
            int c = C0042a.m4270c(i);
            this.f302c = new int[c];
            this.f303d = new Object[c];
        }
        this.f304e = 0;
    }

    /* renamed from: a */
    public SparseArray m4290a() {
        SparseArray sparseArray = null;
        try {
            sparseArray = (SparseArray) super.clone();
            sparseArray.f302c = (int[]) this.f302c.clone();
            sparseArray.f303d = (Object[]) this.f303d.clone();
        } catch (CloneNotSupportedException e) {
        }
        return sparseArray;
    }

    /* renamed from: a */
    public Object m4289a(int i) {
        return m4288a(i, null);
    }

    /* renamed from: a */
    public Object m4288a(int i, Object obj) {
        int a = C0040a.m4281a(this.f302c, this.f304e, i);
        if (a < 0 || this.f303d[a] == f300a) {
            return obj;
        }
        return this.f303d[a];
    }

    /* renamed from: c */
    private void m4284c() {
        int i = this.f304e;
        int i2 = 0;
        int[] iArr = this.f302c;
        Object[] objArr = this.f303d;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f300a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f301b = false;
        this.f304e = i2;
    }

    /* renamed from: b */
    public void m4285b(int i, Object obj) {
        int a = C0040a.m4281a(this.f302c, this.f304e, i);
        if (a >= 0) {
            this.f303d[a] = obj;
            return;
        }
        int i2 = a ^ (-1);
        if (i2 >= this.f304e || this.f303d[i2] != f300a) {
            if (this.f301b && this.f304e >= this.f302c.length) {
                m4284c();
                i2 = C0040a.m4281a(this.f302c, this.f304e, i) ^ (-1);
            }
            if (this.f304e >= this.f302c.length) {
                int c = C0042a.m4270c(this.f304e + 1);
                int[] iArr = new int[c];
                Object[] objArr = new Object[c];
                System.arraycopy(this.f302c, 0, iArr, 0, this.f302c.length);
                System.arraycopy(this.f303d, 0, objArr, 0, this.f303d.length);
                this.f302c = iArr;
                this.f303d = objArr;
            }
            if (this.f304e - i2 != 0) {
                System.arraycopy(this.f302c, i2, this.f302c, i2 + 1, this.f304e - i2);
                System.arraycopy(this.f303d, i2, this.f303d, i2 + 1, this.f304e - i2);
            }
            this.f302c[i2] = i;
            this.f303d[i2] = obj;
            this.f304e++;
            return;
        }
        this.f302c[i2] = i;
        this.f303d[i2] = obj;
    }

    /* renamed from: b */
    public int m4287b() {
        if (this.f301b) {
            m4284c();
        }
        return this.f304e;
    }

    /* renamed from: b */
    public int m4286b(int i) {
        if (this.f301b) {
            m4284c();
        }
        return this.f302c[i];
    }

    /* renamed from: c */
    public Object m4283c(int i) {
        if (this.f301b) {
            m4284c();
        }
        return this.f303d[i];
    }

    /* renamed from: c */
    public void m4282c(int i, Object obj) {
        if (this.f304e == 0 || i > this.f302c[this.f304e - 1]) {
            if (this.f301b && this.f304e >= this.f302c.length) {
                m4284c();
            }
            int i2 = this.f304e;
            if (i2 >= this.f302c.length) {
                int c = C0042a.m4270c(i2 + 1);
                int[] iArr = new int[c];
                Object[] objArr = new Object[c];
                System.arraycopy(this.f302c, 0, iArr, 0, this.f302c.length);
                System.arraycopy(this.f303d, 0, objArr, 0, this.f303d.length);
                this.f302c = iArr;
                this.f303d = objArr;
            }
            this.f302c[i2] = i;
            this.f303d[i2] = obj;
            this.f304e = i2 + 1;
            return;
        }
        m4285b(i, obj);
    }

    public String toString() {
        if (m4287b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f304e * 28);
        sb.append('{');
        for (int i = 0; i < this.f304e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4286b(i));
            sb.append('=');
            Object c = m4283c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

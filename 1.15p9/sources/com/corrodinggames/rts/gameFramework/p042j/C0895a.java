package com.corrodinggames.rts.gameFramework.p042j;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.j.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/a.class */
public final class C0895a extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final C0909n[] f5905a = new C0909n[0];

    /* renamed from: b */
    public int f5906b;

    /* renamed from: c */
    transient C0909n[] f5907c;

    /* renamed from: a */
    public static /* synthetic */ int m1388a(C0895a c0895a) {
        return c0895a.modCount;
    }

    /* renamed from: b */
    public static /* synthetic */ int m1383b(C0895a c0895a) {
        return c0895a.modCount;
    }

    /* renamed from: c */
    public static /* synthetic */ int m1380c(C0895a c0895a) {
        return c0895a.modCount;
    }

    /* renamed from: d */
    public static /* synthetic */ int m1379d(C0895a c0895a) {
        int i = c0895a.modCount + 1;
        c0895a.modCount = i;
        return i;
    }

    public C0895a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f5907c = i == 0 ? f5905a : new C0909n[i];
    }

    public C0895a() {
        this.f5907c = f5905a;
    }

    /* renamed from: a */
    public C0909n[] m1392a() {
        return this.f5907c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(C0909n c0909n) {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b;
        if (i == c0909nArr.length) {
            C0909n[] c0909nArr2 = new C0909n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c0909nArr, 0, c0909nArr2, 0, i);
            c0909nArr = c0909nArr2;
            this.f5907c = c0909nArr2;
        }
        c0909nArr[i] = c0909n;
        this.f5906b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public void m1382b(C0909n c0909n) {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b;
        if (i == c0909nArr.length) {
            C0909n[] c0909nArr2 = new C0909n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c0909nArr, 0, c0909nArr2, 0, i);
            c0909nArr = c0909nArr2;
            this.f5907c = c0909nArr2;
        }
        c0909nArr[i] = c0909n;
        this.f5906b = i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, C0909n c0909n) {
        C0909n[] c0909nArr = this.f5907c;
        int i2 = this.f5906b;
        if (i > i2 || i < 0) {
            m1390a(i, i2);
        }
        if (i2 < c0909nArr.length) {
            System.arraycopy(c0909nArr, i, c0909nArr, i + 1, i2 - i);
        } else {
            C0909n[] c0909nArr2 = new C0909n[m1381c(i2)];
            System.arraycopy(c0909nArr, 0, c0909nArr2, 0, i);
            System.arraycopy(c0909nArr, i, c0909nArr2, i + 1, i2 - i);
            c0909nArr = c0909nArr2;
            this.f5907c = c0909nArr2;
        }
        c0909nArr[i] = c0909n;
        this.f5906b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m1381c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        C0909n[] c0909nArr = (C0909n[]) collection.toArray();
        int length = c0909nArr.length;
        if (length == 0) {
            return false;
        }
        C0909n[] c0909nArr2 = this.f5907c;
        int i = this.f5906b;
        int i2 = i + length;
        if (i2 > c0909nArr2.length) {
            C0909n[] c0909nArr3 = new C0909n[m1381c(i2 - 1)];
            System.arraycopy(c0909nArr2, 0, c0909nArr3, 0, i);
            c0909nArr2 = c0909nArr3;
            this.f5907c = c0909nArr3;
        }
        System.arraycopy(c0909nArr, 0, c0909nArr2, i, length);
        this.f5906b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f5906b;
        if (i > i2 || i < 0) {
            m1390a(i, i2);
        }
        C0909n[] c0909nArr = (C0909n[]) collection.toArray();
        int length = c0909nArr.length;
        if (length == 0) {
            return false;
        }
        C0909n[] c0909nArr2 = this.f5907c;
        int i3 = i2 + length;
        if (i3 <= c0909nArr2.length) {
            System.arraycopy(c0909nArr2, i, c0909nArr2, i + length, i2 - i);
        } else {
            C0909n[] c0909nArr3 = new C0909n[m1381c(i3 - 1)];
            System.arraycopy(c0909nArr2, 0, c0909nArr3, 0, i);
            System.arraycopy(c0909nArr2, i, c0909nArr3, i + length, i2 - i);
            c0909nArr2 = c0909nArr3;
            this.f5907c = c0909nArr3;
        }
        System.arraycopy(c0909nArr, 0, c0909nArr2, i, length);
        this.f5906b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m1390a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f5906b != 0) {
            Arrays.fill(this.f5907c, 0, this.f5906b, (Object) null);
            this.f5906b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0895a c0895a = (C0895a) super.clone();
            c0895a.f5907c = (C0909n[]) this.f5907c.clone();
            return c0895a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public C0909n get(int i) {
        if (i >= this.f5906b) {
            m1390a(i, this.f5906b);
        }
        return this.f5907c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5906b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5906b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0909nArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (c0909nArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0909nArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (c0909nArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        C0909n[] c0909nArr = this.f5907c;
        if (obj != null) {
            for (int i = this.f5906b - 1; i >= 0; i--) {
                if (obj.equals(c0909nArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f5906b - 1; i2 >= 0; i2--) {
            if (c0909nArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public C0909n remove(int i) {
        C0909n[] c0909nArr = this.f5907c;
        int i2 = this.f5906b;
        if (i >= i2) {
            m1390a(i, i2);
        }
        C0909n c0909n = c0909nArr[i];
        int i3 = i2 - 1;
        System.arraycopy(c0909nArr, i + 1, c0909nArr, i, i3 - i);
        c0909nArr[i3] = null;
        this.f5906b = i3;
        this.modCount++;
        return c0909n;
    }

    /* renamed from: b */
    public C0909n m1386b() {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b - 1;
        C0909n c0909n = c0909nArr[i];
        c0909nArr[i] = null;
        this.f5906b = i;
        return c0909n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        C0909n[] c0909nArr = this.f5907c;
        int i = this.f5906b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0909nArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(c0909nArr, i2 + 1, c0909nArr, i2, i3 - i2);
                    c0909nArr[i3] = null;
                    this.f5906b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (c0909nArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(c0909nArr, i4 + 1, c0909nArr, i4, i5 - i4);
                c0909nArr[i5] = null;
                this.f5906b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        C0909n[] c0909nArr = this.f5907c;
        int i3 = this.f5906b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f5906b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f5906b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(c0909nArr, i2, c0909nArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(c0909nArr, i3 - i4, i3, (Object) null);
        this.f5906b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public C0909n set(int i, C0909n c0909n) {
        C0909n[] c0909nArr = this.f5907c;
        if (i >= this.f5906b) {
            m1390a(i, this.f5906b);
        }
        C0909n c0909n2 = c0909nArr[i];
        c0909nArr[i] = c0909n;
        return c0909n2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f5906b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5907c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f5906b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f5907c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0897b(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        C0909n[] c0909nArr = this.f5907c;
        int i = 1;
        int i2 = this.f5906b;
        for (int i3 = 0; i3 < i2; i3++) {
            C0909n c0909n = c0909nArr[i3];
            i = (31 * i) + (c0909n == null ? 0 : c0909n.hashCode());
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int i = this.f5906b;
        if (list.size() != i) {
            return false;
        }
        C0909n[] c0909nArr = this.f5907c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                C0909n c0909n = c0909nArr[i2];
                Object obj2 = list.get(i2);
                if (c0909n == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!c0909n.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            C0909n c0909n2 = c0909nArr[i3];
            Object next = it.next();
            if (c0909n2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!c0909n2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

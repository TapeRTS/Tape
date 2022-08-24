package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/m.class */
public final class C1101m extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public int f6888a;

    /* renamed from: b */
    transient Object[] f6889b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ int m544d(C1101m c1101m) {
        int i = c1101m.modCount + 1;
        c1101m.modCount = i;
        return i;
    }

    public C1101m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f6889b = i == 0 ? C1116x.f6930g : new Object[i];
    }

    public C1101m() {
        this.f6889b = C1116x.f6930g;
    }

    /* renamed from: a */
    public Object[] m553a() {
        return this.f6889b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.f6889b = objArr2;
        }
        objArr[i] = obj;
        this.f6888a = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        Object[] objArr = this.f6889b;
        int i2 = this.f6888a;
        if (i > i2 || i < 0) {
            m551a(i, i2);
        }
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[m548b(i2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + 1, i2 - i);
            objArr = objArr2;
            this.f6889b = objArr2;
        }
        objArr[i] = obj;
        this.f6888a = i2 + 1;
        this.modCount++;
    }

    /* renamed from: b */
    private static int m548b(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        int i2 = i + length;
        if (i2 > objArr.length) {
            Object[] objArr2 = new Object[m548b(i2 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.f6889b = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f6888a = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f6888a;
        if (i > i2 || i < 0) {
            m551a(i, i2);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.f6889b;
        int i3 = i2 + length;
        if (i3 <= objArr.length) {
            System.arraycopy(objArr, i, objArr, i + length, i2 - i);
        } else {
            Object[] objArr2 = new Object[m548b(i3 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + length, i2 - i);
            objArr = objArr2;
            this.f6889b = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f6888a = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m551a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f6888a != 0) {
            Arrays.fill(this.f6889b, 0, this.f6888a, (Object) null);
            this.f6888a = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C1101m c1101m = (C1101m) super.clone();
            c1101m.f6889b = (Object[]) this.f6889b.clone();
            return c1101m;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (i >= this.f6888a) {
            m551a(i, this.f6888a);
        }
        return this.f6889b[i];
    }

    /* renamed from: a */
    public final Object m552a(int i) {
        return this.f6889b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6888a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f6888a == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        Object[] objArr = this.f6889b;
        if (obj != null) {
            for (int i = this.f6888a - 1; i >= 0; i--) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f6888a - 1; i2 >= 0; i2--) {
            if (objArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object[] objArr = this.f6889b;
        int i2 = this.f6888a;
        if (i >= i2) {
            m551a(i, i2);
        }
        Object obj = objArr[i];
        int i3 = i2 - 1;
        System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        objArr[i3] = null;
        this.f6888a = i3;
        this.modCount++;
        return obj;
    }

    /* renamed from: b */
    public Object m549b() {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        int i2 = i - 1;
        if (i == 0) {
            m551a(i2, i);
        }
        Object obj = objArr[i2];
        int i3 = i - 1;
        objArr[i3] = null;
        this.f6888a = i3;
        this.modCount++;
        return obj;
    }

    /* renamed from: c */
    public Object m546c() {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        Object obj = objArr[i - 1];
        int i2 = i - 1;
        objArr[i2] = null;
        this.f6888a = i2;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = this.f6889b;
        int i = this.f6888a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                    objArr[i3] = null;
                    this.f6888a = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(objArr, i4 + 1, objArr, i4, i5 - i4);
                objArr[i5] = null;
                this.f6888a = i5;
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
        Object[] objArr = this.f6889b;
        int i3 = this.f6888a;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f6888a);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f6888a);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(objArr, i2, objArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(objArr, i3 - i4, i3, (Object) null);
        this.f6888a = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Object[] objArr = this.f6889b;
        if (i >= this.f6888a) {
            m551a(i, this.f6888a);
        }
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f6888a;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6889b, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f6888a;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f6889b, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C1103n(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        Object[] objArr = this.f6889b;
        int i = 1;
        int i2 = this.f6888a;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            i = (31 * i) + (obj == null ? 0 : obj.hashCode());
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
        int i = this.f6888a;
        if (list.size() != i) {
            return false;
        }
        Object[] objArr = this.f6889b;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                Object obj3 = list.get(i2);
                if (obj2 == null) {
                    if (obj3 != null) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            Object obj4 = objArr[i3];
            Object next = it.next();
            if (obj4 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj4.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

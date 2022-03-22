package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/o.class */
public final class C0838o extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: c */
    public int f5786c;

    /* renamed from: a */
    public C0835m f5784a = new C0835m();

    /* renamed from: b */
    public C0835m f5785b = new C0835m();

    /* renamed from: d */
    transient Object[] f5787d = C0850x.f5820g;

    /* renamed from: d */
    static /* synthetic */ int m473d(C0838o oVar) {
        int i = oVar.modCount + 1;
        oVar.modCount = i;
        return i;
    }

    /* renamed from: a */
    public void m478a(Object obj) {
        C0842r rVar;
        if (this.f5785b.f5778a != 0) {
            rVar = (C0842r) this.f5785b.m486b();
        } else {
            rVar = new C0842r();
        }
        rVar.f5795a = EnumC0841q.add;
        rVar.f5796b = obj;
        this.f5784a.add(rVar);
    }

    /* renamed from: b */
    public void m475b(Object obj) {
        C0842r rVar;
        if (this.f5785b.f5778a != 0) {
            rVar = (C0842r) this.f5785b.m486b();
        } else {
            rVar = new C0842r();
        }
        rVar.f5795a = EnumC0841q.remove;
        rVar.f5796b = obj;
        this.f5784a.add(rVar);
    }

    /* renamed from: a */
    public void m482a() {
        this.modCount++;
        if (this.f5784a.f5778a != 0) {
            Iterator it = this.f5784a.iterator();
            while (it.hasNext()) {
                C0842r rVar = (C0842r) it.next();
                if (rVar.f5795a == EnumC0841q.add) {
                    add(rVar.f5796b);
                } else if (rVar.f5795a == EnumC0841q.remove) {
                    remove(rVar.f5796b);
                } else {
                    throw new RuntimeException("Unknown operationType:" + rVar.f5795a);
                }
                rVar.f5796b = null;
            }
            if (this.f5784a.size() < 100) {
                this.f5785b.addAll(this.f5784a);
            }
            this.f5784a.clear();
        }
    }

    /* renamed from: b */
    public Object[] m477b() {
        return this.f5787d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        Object[] objArr = this.f5787d;
        int i = this.f5786c;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.f5787d = objArr2;
        }
        objArr[i] = obj;
        this.f5786c = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        Object[] objArr = this.f5787d;
        int i2 = this.f5786c;
        if (i > i2 || i < 0) {
            m480a(i, i2);
        }
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[m481a(i2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + 1, i2 - i);
            objArr = objArr2;
            this.f5787d = objArr2;
        }
        objArr[i] = obj;
        this.f5786c = i2 + 1;
        this.modCount++;
    }

    /* renamed from: a */
    private static int m481a(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.f5787d;
        int i = this.f5786c;
        int i2 = i + length;
        if (i2 > objArr.length) {
            Object[] objArr2 = new Object[m481a(i2 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.f5787d = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f5786c = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f5786c;
        if (i > i2 || i < 0) {
            m480a(i, i2);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.f5787d;
        int i3 = i2 + length;
        if (i3 <= objArr.length) {
            System.arraycopy(objArr, i, objArr, i + length, i2 - i);
        } else {
            Object[] objArr2 = new Object[m481a(i3 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + length, i2 - i);
            objArr = objArr2;
            this.f5787d = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f5786c = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m480a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized void clear() {
        this.f5784a.clear();
        if (this.f5786c != 0) {
            Arrays.fill(this.f5787d, 0, this.f5786c, (Object) null);
            this.f5786c = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0838o oVar = (C0838o) super.clone();
            oVar.f5787d = (Object[]) this.f5787d.clone();
            return oVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (i >= this.f5786c) {
            m480a(i, this.f5786c);
        }
        return this.f5787d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5786c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f5786c == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.f5787d;
        int i = this.f5786c;
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
        Object[] objArr = this.f5787d;
        int i = this.f5786c;
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
        Object[] objArr = this.f5787d;
        if (obj != null) {
            for (int i = this.f5786c - 1; i >= 0; i--) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f5786c - 1; i2 >= 0; i2--) {
            if (objArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object[] objArr = this.f5787d;
        int i2 = this.f5786c;
        if (i >= i2) {
            m480a(i, i2);
        }
        Object obj = objArr[i];
        int i3 = i2 - 1;
        System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        objArr[i3] = null;
        this.f5786c = i3;
        this.modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = this.f5787d;
        int i = this.f5786c;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                    objArr[i3] = null;
                    this.f5786c = i3;
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
                this.f5786c = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i != i2) {
            Object[] objArr = this.f5787d;
            int i3 = this.f5786c;
            if (i >= i3) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f5786c);
            } else if (i2 > i3) {
                throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f5786c);
            } else if (i > i2) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
            } else {
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
                int i4 = i2 - i;
                Arrays.fill(objArr, i3 - i4, i3, (Object) null);
                this.f5786c = i3 - i4;
                this.modCount++;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Object[] objArr = this.f5787d;
        if (i >= this.f5786c) {
            m480a(i, this.f5786c);
        }
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f5786c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5787d, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f5786c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f5787d, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0840p(this, null);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        Object[] objArr = this.f5787d;
        int i = 1;
        int i2 = this.f5786c;
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
        int i = this.f5786c;
        if (list.size() != i) {
            return false;
        }
        Object[] objArr = this.f5787d;
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

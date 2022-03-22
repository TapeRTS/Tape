package com.corrodinggames.rts.gameFramework.p037h;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/a.class */
public final class C0726a extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final C0736j[] f5054a = new C0736j[0];

    /* renamed from: b */
    public int f5055b;

    /* renamed from: c */
    transient C0736j[] f5056c;

    /* renamed from: d */
    static /* synthetic */ int m1003d(C0726a aVar) {
        int i = aVar.modCount + 1;
        aVar.modCount = i;
        return i;
    }

    public C0726a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f5056c = i == 0 ? f5054a : new C0736j[i];
    }

    public C0726a() {
        this.f5056c = f5054a;
    }

    /* renamed from: a */
    public C0736j[] m1016a() {
        return this.f5056c;
    }

    /* renamed from: a */
    public boolean add(C0736j jVar) {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b;
        if (i == jVarArr.length) {
            C0736j[] jVarArr2 = new C0736j[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(jVarArr, 0, jVarArr2, 0, i);
            jVarArr = jVarArr2;
            this.f5056c = jVarArr2;
        }
        jVarArr[i] = jVar;
        this.f5055b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public void m1006b(C0736j jVar) {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b;
        if (i == jVarArr.length) {
            C0736j[] jVarArr2 = new C0736j[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(jVarArr, 0, jVarArr2, 0, i);
            jVarArr = jVarArr2;
            this.f5056c = jVarArr2;
        }
        jVarArr[i] = jVar;
        this.f5055b = i + 1;
    }

    /* renamed from: a */
    public void add(int i, C0736j jVar) {
        C0736j[] jVarArr = this.f5056c;
        int i2 = this.f5055b;
        if (i > i2 || i < 0) {
            m1014a(i, i2);
        }
        if (i2 < jVarArr.length) {
            System.arraycopy(jVarArr, i, jVarArr, i + 1, i2 - i);
        } else {
            C0736j[] jVarArr2 = new C0736j[m1005c(i2)];
            System.arraycopy(jVarArr, 0, jVarArr2, 0, i);
            System.arraycopy(jVarArr, i, jVarArr2, i + 1, i2 - i);
            jVarArr = jVarArr2;
            this.f5056c = jVarArr2;
        }
        jVarArr[i] = jVar;
        this.f5055b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m1005c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        C0736j[] jVarArr = (C0736j[]) collection.toArray();
        int length = jVarArr.length;
        if (length == 0) {
            return false;
        }
        C0736j[] jVarArr2 = this.f5056c;
        int i = this.f5055b;
        int i2 = i + length;
        if (i2 > jVarArr2.length) {
            C0736j[] jVarArr3 = new C0736j[m1005c(i2 - 1)];
            System.arraycopy(jVarArr2, 0, jVarArr3, 0, i);
            jVarArr2 = jVarArr3;
            this.f5056c = jVarArr3;
        }
        System.arraycopy(jVarArr, 0, jVarArr2, i, length);
        this.f5055b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f5055b;
        if (i > i2 || i < 0) {
            m1014a(i, i2);
        }
        C0736j[] jVarArr = (C0736j[]) collection.toArray();
        int length = jVarArr.length;
        if (length == 0) {
            return false;
        }
        C0736j[] jVarArr2 = this.f5056c;
        int i3 = i2 + length;
        if (i3 <= jVarArr2.length) {
            System.arraycopy(jVarArr2, i, jVarArr2, i + length, i2 - i);
        } else {
            C0736j[] jVarArr3 = new C0736j[m1005c(i3 - 1)];
            System.arraycopy(jVarArr2, 0, jVarArr3, 0, i);
            System.arraycopy(jVarArr2, i, jVarArr3, i + length, i2 - i);
            jVarArr2 = jVarArr3;
            this.f5056c = jVarArr3;
        }
        System.arraycopy(jVarArr, 0, jVarArr2, i, length);
        this.f5055b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m1014a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f5055b != 0) {
            Arrays.fill(this.f5056c, 0, this.f5055b, (Object) null);
            this.f5055b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0726a aVar = (C0726a) super.clone();
            aVar.f5056c = (C0736j[]) this.f5056c.clone();
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C0736j get(int i) {
        if (i >= this.f5055b) {
            m1014a(i, this.f5055b);
        }
        return this.f5056c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5055b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5055b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(jVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (jVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(jVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (jVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        C0736j[] jVarArr = this.f5056c;
        if (obj != null) {
            for (int i = this.f5055b - 1; i >= 0; i--) {
                if (obj.equals(jVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f5055b - 1; i2 >= 0; i2--) {
            if (jVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public C0736j remove(int i) {
        C0736j[] jVarArr = this.f5056c;
        int i2 = this.f5055b;
        if (i >= i2) {
            m1014a(i, i2);
        }
        C0736j jVar = jVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(jVarArr, i + 1, jVarArr, i, i3 - i);
        jVarArr[i3] = null;
        this.f5055b = i3;
        this.modCount++;
        return jVar;
    }

    /* renamed from: b */
    public C0736j m1010b() {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b - 1;
        C0736j jVar = jVarArr[i];
        jVarArr[i] = null;
        this.f5055b = i;
        return jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        C0736j[] jVarArr = this.f5056c;
        int i = this.f5055b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(jVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(jVarArr, i2 + 1, jVarArr, i2, i3 - i2);
                    jVarArr[i3] = null;
                    this.f5055b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (jVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(jVarArr, i4 + 1, jVarArr, i4, i5 - i4);
                jVarArr[i5] = null;
                this.f5055b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i != i2) {
            C0736j[] jVarArr = this.f5056c;
            int i3 = this.f5055b;
            if (i >= i3) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f5055b);
            } else if (i2 > i3) {
                throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f5055b);
            } else if (i > i2) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
            } else {
                System.arraycopy(jVarArr, i2, jVarArr, i, i3 - i2);
                int i4 = i2 - i;
                Arrays.fill(jVarArr, i3 - i4, i3, (Object) null);
                this.f5055b = i3 - i4;
                this.modCount++;
            }
        }
    }

    /* renamed from: b */
    public C0736j set(int i, C0736j jVar) {
        C0736j[] jVarArr = this.f5056c;
        if (i >= this.f5055b) {
            m1014a(i, this.f5055b);
        }
        C0736j jVar2 = jVarArr[i];
        jVarArr[i] = jVar;
        return jVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f5055b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5056c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f5055b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f5056c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0728b(this, null);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        C0736j[] jVarArr = this.f5056c;
        int i = 1;
        int i2 = this.f5055b;
        for (int i3 = 0; i3 < i2; i3++) {
            C0736j jVar = jVarArr[i3];
            i = (31 * i) + (jVar == null ? 0 : jVar.hashCode());
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
        int i = this.f5055b;
        if (list.size() != i) {
            return false;
        }
        C0736j[] jVarArr = this.f5056c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                C0736j jVar = jVarArr[i2];
                Object obj2 = list.get(i2);
                if (jVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!jVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            C0736j jVar2 = jVarArr[i3];
            Object next = it.next();
            if (jVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!jVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

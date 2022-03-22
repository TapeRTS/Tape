package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/s.class */
public final class C0843s extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final AbstractC0854w[] f5797a = new AbstractC0854w[0];

    /* renamed from: b */
    int f5798b;

    /* renamed from: c */
    transient AbstractC0854w[] f5799c = f5797a;

    /* renamed from: d */
    String f5800d;

    /* renamed from: f */
    static /* synthetic */ int m458f(C0843s sVar) {
        int i = sVar.modCount + 1;
        sVar.modCount = i;
        return i;
    }

    public C0843s(String str) {
        this.f5800d = str;
    }

    /* renamed from: a */
    public AbstractC0854w[] m472a() {
        return this.f5799c;
    }

    /* renamed from: a */
    public boolean add(AbstractC0854w wVar) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i = this.f5798b;
        if (i == wVarArr.length) {
            AbstractC0854w[] wVarArr2 = new AbstractC0854w[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(wVarArr, 0, wVarArr2, 0, i);
            wVarArr = wVarArr2;
            this.f5799c = wVarArr2;
        }
        wVarArr[i] = wVar;
        this.f5798b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    public void add(int i, AbstractC0854w wVar) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i2 = this.f5798b;
        if (i > i2 || i < 0) {
            m470a(i, i2);
        }
        if (i2 < wVarArr.length) {
            System.arraycopy(wVarArr, i, wVarArr, i + 1, i2 - i);
        } else {
            AbstractC0854w[] wVarArr2 = new AbstractC0854w[m462c(i2)];
            System.arraycopy(wVarArr, 0, wVarArr2, 0, i);
            System.arraycopy(wVarArr, i, wVarArr2, i + 1, i2 - i);
            wVarArr = wVarArr2;
            this.f5799c = wVarArr2;
        }
        wVarArr[i] = wVar;
        this.f5798b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m462c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC0854w[] wVarArr = (AbstractC0854w[]) collection.toArray();
        int length = wVarArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0854w[] wVarArr2 = this.f5799c;
        int i = this.f5798b;
        int i2 = i + length;
        if (i2 > wVarArr2.length) {
            AbstractC0854w[] wVarArr3 = new AbstractC0854w[m462c(i2 - 1)];
            System.arraycopy(wVarArr2, 0, wVarArr3, 0, i);
            wVarArr2 = wVarArr3;
            this.f5799c = wVarArr3;
        }
        System.arraycopy(wVarArr, 0, wVarArr2, i, length);
        this.f5798b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f5798b;
        if (i > i2 || i < 0) {
            m470a(i, i2);
        }
        AbstractC0854w[] wVarArr = (AbstractC0854w[]) collection.toArray();
        int length = wVarArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0854w[] wVarArr2 = this.f5799c;
        int i3 = i2 + length;
        if (i3 <= wVarArr2.length) {
            System.arraycopy(wVarArr2, i, wVarArr2, i + length, i2 - i);
        } else {
            AbstractC0854w[] wVarArr3 = new AbstractC0854w[m462c(i3 - 1)];
            System.arraycopy(wVarArr2, 0, wVarArr3, 0, i);
            System.arraycopy(wVarArr2, i, wVarArr3, i + length, i2 - i);
            wVarArr2 = wVarArr3;
            this.f5799c = wVarArr3;
        }
        System.arraycopy(wVarArr, 0, wVarArr2, i, length);
        this.f5798b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m470a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f5798b != 0) {
            Arrays.fill(this.f5799c, 0, this.f5798b, (Object) null);
            this.f5798b = 0;
            this.modCount++;
        }
    }

    /* renamed from: b */
    public void m466b() {
        if (this.f5798b != 0) {
            this.f5798b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0843s sVar = (C0843s) super.clone();
            sVar.f5799c = (AbstractC0854w[]) this.f5799c.clone();
            return sVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public AbstractC0854w get(int i) {
        if (i >= this.f5798b) {
            m470a(i, this.f5798b);
        }
        return this.f5799c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5798b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f5798b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i = this.f5798b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (wVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i = this.f5798b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (wVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        AbstractC0854w[] wVarArr = this.f5799c;
        if (obj != null) {
            for (int i = this.f5798b - 1; i >= 0; i--) {
                if (obj.equals(wVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f5798b - 1; i2 >= 0; i2--) {
            if (wVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public AbstractC0854w remove(int i) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i2 = this.f5798b;
        if (i >= i2) {
            m470a(i, i2);
        }
        AbstractC0854w wVar = wVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(wVarArr, i + 1, wVarArr, i, i3 - i);
        wVarArr[i3] = null;
        this.f5798b = i3;
        this.modCount++;
        return wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i = this.f5798b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(wVarArr, i2 + 1, wVarArr, i2, i3 - i2);
                    wVarArr[i3] = null;
                    this.f5798b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (wVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(wVarArr, i4 + 1, wVarArr, i4, i5 - i4);
                wVarArr[i5] = null;
                this.f5798b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i != i2) {
            AbstractC0854w[] wVarArr = this.f5799c;
            int i3 = this.f5798b;
            if (i >= i3) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f5798b);
            } else if (i2 > i3) {
                throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f5798b);
            } else if (i > i2) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
            } else {
                System.arraycopy(wVarArr, i2, wVarArr, i, i3 - i2);
                int i4 = i2 - i;
                Arrays.fill(wVarArr, i3 - i4, i3, (Object) null);
                this.f5798b = i3 - i4;
                this.modCount++;
            }
        }
    }

    /* renamed from: b */
    public AbstractC0854w set(int i, AbstractC0854w wVar) {
        AbstractC0854w[] wVarArr = this.f5799c;
        if (i >= this.f5798b) {
            m470a(i, this.f5798b);
        }
        AbstractC0854w wVar2 = wVarArr[i];
        wVarArr[i] = wVar;
        return wVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f5798b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5799c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f5798b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f5799c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0845t(this, null);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC0854w[] wVarArr = this.f5799c;
        int i = 1;
        int i2 = this.f5798b;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0854w wVar = wVarArr[i3];
            i = (31 * i) + (wVar == null ? 0 : wVar.hashCode());
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
        int i = this.f5798b;
        if (list.size() != i) {
            return false;
        }
        AbstractC0854w[] wVarArr = this.f5799c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC0854w wVar = wVarArr[i2];
                Object obj2 = list.get(i2);
                if (wVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!wVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC0854w wVar2 = wVarArr[i3];
            Object next = it.next();
            if (wVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!wVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

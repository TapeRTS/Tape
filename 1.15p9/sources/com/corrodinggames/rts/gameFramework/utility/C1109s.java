package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
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
public final class C1109s extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final AbstractC1120w[] f6907a = new AbstractC1120w[0];

    /* renamed from: b */
    int f6908b;

    /* renamed from: c */
    transient AbstractC1120w[] f6909c = f6907a;

    /* renamed from: d */
    String f6910d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ int m519f(C1109s c1109s) {
        int i = c1109s.modCount + 1;
        c1109s.modCount = i;
        return i;
    }

    public C1109s(String str) {
        this.f6910d = str;
    }

    /* renamed from: a */
    public AbstractC1120w[] m533a() {
        return this.f6909c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean mo528a(AbstractC1120w abstractC1120w) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i = this.f6908b;
        if (i == abstractC1120wArr.length) {
            AbstractC1120w[] abstractC1120wArr2 = new AbstractC1120w[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(abstractC1120wArr, 0, abstractC1120wArr2, 0, i);
            abstractC1120wArr = abstractC1120wArr2;
            this.f6909c = abstractC1120wArr2;
        }
        abstractC1120wArr[i] = abstractC1120w;
        this.f6908b = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void mo530a(int i, AbstractC1120w abstractC1120w) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i2 = this.f6908b;
        if (i > i2 || i < 0) {
            m531a(i, i2);
        }
        if (i2 < abstractC1120wArr.length) {
            System.arraycopy(abstractC1120wArr, i, abstractC1120wArr, i + 1, i2 - i);
        } else {
            AbstractC1120w[] abstractC1120wArr2 = new AbstractC1120w[m523c(i2)];
            System.arraycopy(abstractC1120wArr, 0, abstractC1120wArr2, 0, i);
            System.arraycopy(abstractC1120wArr, i, abstractC1120wArr2, i + 1, i2 - i);
            abstractC1120wArr = abstractC1120wArr2;
            this.f6909c = abstractC1120wArr2;
        }
        abstractC1120wArr[i] = abstractC1120w;
        this.f6908b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m523c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC1120w[] abstractC1120wArr = (AbstractC1120w[]) collection.toArray();
        int length = abstractC1120wArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC1120w[] abstractC1120wArr2 = this.f6909c;
        int i = this.f6908b;
        int i2 = i + length;
        if (i2 > abstractC1120wArr2.length) {
            AbstractC1120w[] abstractC1120wArr3 = new AbstractC1120w[m523c(i2 - 1)];
            System.arraycopy(abstractC1120wArr2, 0, abstractC1120wArr3, 0, i);
            abstractC1120wArr2 = abstractC1120wArr3;
            this.f6909c = abstractC1120wArr3;
        }
        System.arraycopy(abstractC1120wArr, 0, abstractC1120wArr2, i, length);
        this.f6908b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f6908b;
        if (i > i2 || i < 0) {
            m531a(i, i2);
        }
        AbstractC1120w[] abstractC1120wArr = (AbstractC1120w[]) collection.toArray();
        int length = abstractC1120wArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC1120w[] abstractC1120wArr2 = this.f6909c;
        int i3 = i2 + length;
        if (i3 <= abstractC1120wArr2.length) {
            System.arraycopy(abstractC1120wArr2, i, abstractC1120wArr2, i + length, i2 - i);
        } else {
            AbstractC1120w[] abstractC1120wArr3 = new AbstractC1120w[m523c(i3 - 1)];
            System.arraycopy(abstractC1120wArr2, 0, abstractC1120wArr3, 0, i);
            System.arraycopy(abstractC1120wArr2, i, abstractC1120wArr3, i + length, i2 - i);
            abstractC1120wArr2 = abstractC1120wArr3;
            this.f6909c = abstractC1120wArr3;
        }
        System.arraycopy(abstractC1120wArr, 0, abstractC1120wArr2, i, length);
        this.f6908b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m531a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f6908b != 0) {
            Arrays.fill(this.f6909c, 0, this.f6908b, (Object) null);
            this.f6908b = 0;
            this.modCount++;
        }
    }

    /* renamed from: b */
    public void m527b() {
        if (this.f6908b != 0) {
            this.f6908b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C1109s c1109s = (C1109s) super.clone();
            c1109s.f6909c = (AbstractC1120w[]) this.f6909c.clone();
            return c1109s;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public AbstractC1120w mo6758get(int i) {
        if (i >= this.f6908b) {
            m531a(i, this.f6908b);
        }
        return this.f6909c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6908b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f6908b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i = this.f6908b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1120wArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC1120wArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i = this.f6908b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1120wArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC1120wArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        if (obj != null) {
            for (int i = this.f6908b - 1; i >= 0; i--) {
                if (obj.equals(abstractC1120wArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f6908b - 1; i2 >= 0; i2--) {
            if (abstractC1120wArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC1120w mo6757remove(int i) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i2 = this.f6908b;
        if (i >= i2) {
            m531a(i, i2);
        }
        AbstractC1120w abstractC1120w = abstractC1120wArr[i];
        int i3 = i2 - 1;
        System.arraycopy(abstractC1120wArr, i + 1, abstractC1120wArr, i, i3 - i);
        abstractC1120wArr[i3] = null;
        this.f6908b = i3;
        this.modCount++;
        return abstractC1120w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i = this.f6908b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1120wArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(abstractC1120wArr, i2 + 1, abstractC1120wArr, i2, i3 - i2);
                    abstractC1120wArr[i3] = null;
                    this.f6908b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (abstractC1120wArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(abstractC1120wArr, i4 + 1, abstractC1120wArr, i4, i5 - i4);
                abstractC1120wArr[i5] = null;
                this.f6908b = i5;
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
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i3 = this.f6908b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f6908b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f6908b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(abstractC1120wArr, i2, abstractC1120wArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(abstractC1120wArr, i3 - i4, i3, (Object) null);
        this.f6908b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC1120w mo525b(int i, AbstractC1120w abstractC1120w) {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        if (i >= this.f6908b) {
            m531a(i, this.f6908b);
        }
        AbstractC1120w abstractC1120w2 = abstractC1120wArr[i];
        abstractC1120wArr[i] = abstractC1120w;
        return abstractC1120w2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f6908b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6909c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f6908b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f6909c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C1111t(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        int i = 1;
        int i2 = this.f6908b;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC1120w abstractC1120w = abstractC1120wArr[i3];
            i = (31 * i) + (abstractC1120w == null ? 0 : abstractC1120w.hashCode());
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
        int i = this.f6908b;
        if (list.size() != i) {
            return false;
        }
        AbstractC1120w[] abstractC1120wArr = this.f6909c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC1120w abstractC1120w = abstractC1120wArr[i2];
                Object obj2 = list.get(i2);
                if (abstractC1120w == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!abstractC1120w.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1120w abstractC1120w2 = abstractC1120wArr[i3];
            Object next = it.next();
            if (abstractC1120w2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!abstractC1120w2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

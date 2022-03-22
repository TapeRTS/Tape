package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/u.class */
public final class C0846u extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final AbstractC0210af[] f5805a = new AbstractC0210af[0];

    /* renamed from: b */
    public int f5806b;

    /* renamed from: c */
    transient AbstractC0210af[] f5807c = f5805a;

    /* renamed from: d */
    static /* synthetic */ int m444d(C0846u uVar) {
        int i = uVar.modCount + 1;
        uVar.modCount = i;
        return i;
    }

    /* renamed from: a */
    public AbstractC0210af[] m456a() {
        return this.f5807c;
    }

    /* renamed from: a */
    public boolean add(AbstractC0210af afVar) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = this.f5806b;
        if (i == afVarArr.length) {
            AbstractC0210af[] afVarArr2 = new AbstractC0210af[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(afVarArr, 0, afVarArr2, 0, i);
            afVarArr = afVarArr2;
            this.f5807c = afVarArr2;
        }
        afVarArr[i] = afVar;
        this.f5806b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m448b(AbstractC0210af afVar) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = this.f5806b;
        if (i == afVarArr.length) {
            AbstractC0210af[] afVarArr2 = new AbstractC0210af[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(afVarArr, 0, afVarArr2, 0, i);
            afVarArr = afVarArr2;
            this.f5807c = afVarArr2;
        }
        afVarArr[i] = afVar;
        this.f5806b = i + 1;
    }

    /* renamed from: a */
    public void add(int i, AbstractC0210af afVar) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i2 = this.f5806b;
        if (i > i2 || i < 0) {
            m454a(i, i2);
        }
        if (i2 < afVarArr.length) {
            System.arraycopy(afVarArr, i, afVarArr, i + 1, i2 - i);
        } else {
            AbstractC0210af[] afVarArr2 = new AbstractC0210af[m446c(i2)];
            System.arraycopy(afVarArr, 0, afVarArr2, 0, i);
            System.arraycopy(afVarArr, i, afVarArr2, i + 1, i2 - i);
            afVarArr = afVarArr2;
            this.f5807c = afVarArr2;
        }
        afVarArr[i] = afVar;
        this.f5806b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m446c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC0210af[] afVarArr = (AbstractC0210af[]) collection.toArray();
        int length = afVarArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0210af[] afVarArr2 = this.f5807c;
        int i = this.f5806b;
        int i2 = i + length;
        if (i2 > afVarArr2.length) {
            AbstractC0210af[] afVarArr3 = new AbstractC0210af[m446c(i2 - 1)];
            System.arraycopy(afVarArr2, 0, afVarArr3, 0, i);
            afVarArr2 = afVarArr3;
            this.f5807c = afVarArr3;
        }
        System.arraycopy(afVarArr, 0, afVarArr2, i, length);
        this.f5806b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f5806b;
        if (i > i2 || i < 0) {
            m454a(i, i2);
        }
        AbstractC0210af[] afVarArr = (AbstractC0210af[]) collection.toArray();
        int length = afVarArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0210af[] afVarArr2 = this.f5807c;
        int i3 = i2 + length;
        if (i3 <= afVarArr2.length) {
            System.arraycopy(afVarArr2, i, afVarArr2, i + length, i2 - i);
        } else {
            AbstractC0210af[] afVarArr3 = new AbstractC0210af[m446c(i3 - 1)];
            System.arraycopy(afVarArr2, 0, afVarArr3, 0, i);
            System.arraycopy(afVarArr2, i, afVarArr3, i + length, i2 - i);
            afVarArr2 = afVarArr3;
            this.f5807c = afVarArr3;
        }
        System.arraycopy(afVarArr, 0, afVarArr2, i, length);
        this.f5806b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m454a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f5806b != 0) {
            Arrays.fill(this.f5807c, 0, this.f5806b, (Object) null);
            this.f5806b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0846u uVar = (C0846u) super.clone();
            uVar.f5807c = (AbstractC0210af[]) this.f5807c.clone();
            return uVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public AbstractC0210af get(int i) {
        if (i >= this.f5806b) {
            m454a(i, this.f5806b);
        }
        return this.f5807c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5806b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5806b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = this.f5806b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(afVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (afVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = this.f5806b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(afVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (afVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        AbstractC0210af[] afVarArr = this.f5807c;
        if (obj != null) {
            for (int i = this.f5806b - 1; i >= 0; i--) {
                if (obj.equals(afVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f5806b - 1; i2 >= 0; i2--) {
            if (afVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public AbstractC0210af remove(int i) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i2 = this.f5806b;
        if (i >= i2) {
            m454a(i, i2);
        }
        AbstractC0210af afVar = afVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(afVarArr, i + 1, afVarArr, i, i3 - i);
        afVarArr[i3] = null;
        this.f5806b = i3;
        this.modCount++;
        return afVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = this.f5806b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(afVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(afVarArr, i2 + 1, afVarArr, i2, i3 - i2);
                    afVarArr[i3] = null;
                    this.f5806b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (afVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(afVarArr, i4 + 1, afVarArr, i4, i5 - i4);
                afVarArr[i5] = null;
                this.f5806b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i != i2) {
            AbstractC0210af[] afVarArr = this.f5807c;
            int i3 = this.f5806b;
            if (i >= i3) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f5806b);
            } else if (i2 > i3) {
                throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f5806b);
            } else if (i > i2) {
                throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
            } else {
                System.arraycopy(afVarArr, i2, afVarArr, i, i3 - i2);
                int i4 = i2 - i;
                Arrays.fill(afVarArr, i3 - i4, i3, (Object) null);
                this.f5806b = i3 - i4;
                this.modCount++;
            }
        }
    }

    /* renamed from: b */
    public AbstractC0210af set(int i, AbstractC0210af afVar) {
        AbstractC0210af[] afVarArr = this.f5807c;
        if (i >= this.f5806b) {
            m454a(i, this.f5806b);
        }
        AbstractC0210af afVar2 = afVarArr[i];
        afVarArr[i] = afVar;
        return afVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f5806b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5807c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f5806b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f5807c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0848v(this, null);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC0210af[] afVarArr = this.f5807c;
        int i = 1;
        int i2 = this.f5806b;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0210af afVar = afVarArr[i3];
            i = (31 * i) + (afVar == null ? 0 : afVar.hashCode());
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
        int i = this.f5806b;
        if (list.size() != i) {
            return false;
        }
        AbstractC0210af[] afVarArr = this.f5807c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC0210af afVar = afVarArr[i2];
                Object obj2 = list.get(i2);
                if (afVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!afVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC0210af afVar2 = afVarArr[i3];
            Object next = it.next();
            if (afVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!afVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

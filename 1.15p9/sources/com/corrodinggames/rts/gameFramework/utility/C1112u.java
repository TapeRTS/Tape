package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.Unit;
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
public final class C1112u extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final Unit[] f6915a = new Unit[0];

    /* renamed from: b */
    public int f6916b;

    /* renamed from: c */
    transient Unit[] f6917c = f6915a;

    /* renamed from: a */
    static /* synthetic */ int m518a(C1112u c1112u) {
        return c1112u.modCount;
    }

    /* renamed from: b */
    static /* synthetic */ int m514b(C1112u c1112u) {
        return c1112u.modCount;
    }

    /* renamed from: c */
    static /* synthetic */ int m512c(C1112u c1112u) {
        return c1112u.modCount;
    }

    /* renamed from: d */
    public static /* synthetic */ int m511d(C1112u c1112u) {
        int i = c1112u.modCount + 1;
        c1112u.modCount = i;
        return i;
    }

    /* renamed from: a */
    public Unit[] m523a() {
        return this.f6917c;
    }

    /* renamed from: a */
    public boolean mo519a(Unit unit) {
        Unit[] unitArr = this.f6917c;
        int i = this.f6916b;
        if (i == unitArr.length) {
            Unit[] unitArr2 = new Unit[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(unitArr, 0, unitArr2, 0, i);
            unitArr = unitArr2;
            this.f6917c = unitArr2;
        }
        unitArr[i] = unit;
        this.f6916b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m515b(Unit unit) {
        Unit[] unitArr = this.f6917c;
        int i = this.f6916b;
        if (i == unitArr.length) {
            Unit[] unitArr2 = new Unit[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(unitArr, 0, unitArr2, 0, i);
            unitArr = unitArr2;
            this.f6917c = unitArr2;
        }
        unitArr[i] = unit;
        this.f6916b = i + 1;
    }

    /* renamed from: a */
    public void mo520a(int i, Unit unit) {
        Unit[] unitArr = this.f6917c;
        int i2 = this.f6916b;
        if (i > i2 || i < 0) {
            m521a(i, i2);
        }
        if (i2 < unitArr.length) {
            System.arraycopy(unitArr, i, unitArr, i + 1, i2 - i);
        } else {
            Unit[] unitArr2 = new Unit[m513c(i2)];
            System.arraycopy(unitArr, 0, unitArr2, 0, i);
            System.arraycopy(unitArr, i, unitArr2, i + 1, i2 - i);
            unitArr = unitArr2;
            this.f6917c = unitArr2;
        }
        unitArr[i] = unit;
        this.f6916b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m513c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    public boolean addAll(Collection collection) {
        Unit[] unitArr = (Unit[]) collection.toArray();
        int length = unitArr.length;
        if (length == 0) {
            return false;
        }
        Unit[] unitArr2 = this.f6917c;
        int i = this.f6916b;
        int i2 = i + length;
        if (i2 > unitArr2.length) {
            Unit[] unitArr3 = new Unit[m513c(i2 - 1)];
            System.arraycopy(unitArr2, 0, unitArr3, 0, i);
            unitArr2 = unitArr3;
            this.f6917c = unitArr3;
        }
        System.arraycopy(unitArr, 0, unitArr2, i, length);
        this.f6916b = i2;
        this.modCount++;
        return true;
    }

    public boolean addAll(int i, Collection collection) {
        int i2 = this.f6916b;
        if (i > i2 || i < 0) {
            m521a(i, i2);
        }
        Unit[] unitArr = (Unit[]) collection.toArray();
        int length = unitArr.length;
        if (length == 0) {
            return false;
        }
        Unit[] unitArr2 = this.f6917c;
        int i3 = i2 + length;
        if (i3 <= unitArr2.length) {
            System.arraycopy(unitArr2, i, unitArr2, i + length, i2 - i);
        } else {
            Unit[] unitArr3 = new Unit[m513c(i3 - 1)];
            System.arraycopy(unitArr2, 0, unitArr3, 0, i);
            System.arraycopy(unitArr2, i, unitArr3, i + length, i2 - i);
            unitArr2 = unitArr3;
            this.f6917c = unitArr3;
        }
        System.arraycopy(unitArr, 0, unitArr2, i, length);
        this.f6916b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m521a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    public void clear() {
        if (this.f6916b != 0) {
            Arrays.fill(this.f6917c, 0, this.f6916b, (Object) null);
            this.f6916b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C1112u c1112u = (C1112u) super.clone();
            c1112u.f6917c = (Unit[]) this.f6917c.clone();
            return c1112u;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public Unit mo6901get(int i) {
        if (i >= this.f6916b) {
            m521a(i, this.f6916b);
        }
        return this.f6917c[i];
    }

    public final int size() {
        return this.f6916b;
    }

    public final boolean isEmpty() {
        return this.f6916b == 0;
    }

    public boolean contains(Object obj) {
        Unit[] unitArr = this.f6917c;
        int i = this.f6916b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(unitArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (unitArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        Unit[] unitArr = this.f6917c;
        int i = this.f6916b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(unitArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (unitArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        Unit[] unitArr = this.f6917c;
        if (obj != null) {
            for (int i = this.f6916b - 1; i >= 0; i--) {
                if (obj.equals(unitArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f6916b - 1; i2 >= 0; i2--) {
            if (unitArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public Unit mo6900remove(int i) {
        Unit[] unitArr = this.f6917c;
        int i2 = this.f6916b;
        if (i >= i2) {
            m521a(i, i2);
        }
        Unit unit = unitArr[i];
        int i3 = i2 - 1;
        System.arraycopy(unitArr, i + 1, unitArr, i, i3 - i);
        unitArr[i3] = null;
        this.f6916b = i3;
        this.modCount++;
        return unit;
    }

    public boolean remove(Object obj) {
        Unit[] unitArr = this.f6917c;
        int i = this.f6916b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(unitArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(unitArr, i2 + 1, unitArr, i2, i3 - i2);
                    unitArr[i3] = null;
                    this.f6916b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (unitArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(unitArr, i4 + 1, unitArr, i4, i5 - i4);
                unitArr[i5] = null;
                this.f6916b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        Unit[] unitArr = this.f6917c;
        int i3 = this.f6916b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f6916b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f6916b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(unitArr, i2, unitArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(unitArr, i3 - i4, i3, (Object) null);
        this.f6916b = i3 - i4;
        this.modCount++;
    }

    /* renamed from: b */
    public Unit mo516b(int i, Unit unit) {
        Unit[] unitArr = this.f6917c;
        if (i >= this.f6916b) {
            m521a(i, this.f6916b);
        }
        Unit unit2 = unitArr[i];
        unitArr[i] = unit;
        return unit2;
    }

    public Object[] toArray() {
        int i = this.f6916b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6917c, 0, objArr, 0, i);
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        int i = this.f6916b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f6917c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public Iterator iterator() {
        return new C1114v(this);
    }

    public int hashCode() {
        Unit[] unitArr = this.f6917c;
        int i = 1;
        int i2 = this.f6916b;
        for (int i3 = 0; i3 < i2; i3++) {
            Unit unit = unitArr[i3];
            i = (31 * i) + (unit == null ? 0 : unit.hashCode());
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int i = this.f6916b;
        if (list.size() != i) {
            return false;
        }
        Unit[] unitArr = this.f6917c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                Unit unit = unitArr[i2];
                Object obj2 = list.get(i2);
                if (unit == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!unit.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            Unit unit2 = unitArr[i3];
            Object next = it.next();
            if (unit2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!unit2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}

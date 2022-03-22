package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/g.class */
public class C0827g extends AbstractCollection implements Serializable, Cloneable {

    /* renamed from: b */
    private transient Object[] f5756b = new Object[16];

    /* renamed from: c */
    private transient int f5757c;

    /* renamed from: d */
    private transient int f5758d;

    /* renamed from: a */
    static final /* synthetic */ boolean f5759a;

    static {
        f5759a = !C0827g.class.desiredAssertionStatus();
    }

    /* renamed from: c */
    private void m508c() {
        if (f5759a || this.f5757c == this.f5758d) {
            int i = this.f5757c;
            int length = this.f5756b.length;
            int i2 = length - i;
            int i3 = length << 1;
            if (i3 < 0) {
                throw new IllegalStateException("Sorry, deque too big");
            }
            Object[] objArr = new Object[i3];
            System.arraycopy(this.f5756b, i, objArr, 0, i2);
            System.arraycopy(this.f5756b, 0, objArr, i2, i);
            this.f5756b = objArr;
            this.f5757c = 0;
            this.f5758d = length;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private Object[] m512a(Object[] objArr) {
        if (this.f5757c < this.f5758d) {
            System.arraycopy(this.f5756b, this.f5757c, objArr, 0, size());
        } else if (this.f5757c > this.f5758d) {
            int length = this.f5756b.length - this.f5757c;
            System.arraycopy(this.f5756b, this.f5757c, objArr, 0, length);
            System.arraycopy(this.f5756b, 0, objArr, length, this.f5758d);
        }
        return objArr;
    }

    /* renamed from: a */
    public void m513a(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        this.f5756b[this.f5758d] = obj;
        int length = (this.f5758d + 1) & (this.f5756b.length - 1);
        this.f5758d = length;
        if (length == this.f5757c) {
            m508c();
        }
    }

    /* renamed from: a */
    public Object m517a() {
        int i = this.f5757c;
        Object obj = this.f5756b[i];
        if (obj == null) {
            return null;
        }
        this.f5756b[i] = null;
        this.f5757c = (i + 1) & (this.f5756b.length - 1);
        return obj;
    }

    /* renamed from: b */
    public boolean m509b(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f5756b.length - 1;
        int i = this.f5757c;
        while (true) {
            Object obj2 = this.f5756b[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                m516a(i);
                return true;
            }
            i = (i + 1) & length;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        m513a(obj);
        return true;
    }

    /* renamed from: d */
    private void m506d() {
        if (!f5759a && this.f5756b[this.f5758d] != null) {
            throw new AssertionError();
        } else if (!f5759a && (this.f5757c != this.f5758d ? this.f5756b[this.f5757c] == null || this.f5756b[(this.f5758d - 1) & (this.f5756b.length - 1)] == null : this.f5756b[this.f5757c] != null)) {
            throw new AssertionError();
        } else if (!f5759a && this.f5756b[(this.f5757c - 1) & (this.f5756b.length - 1)] != null) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m516a(int i) {
        m506d();
        Object[] objArr = this.f5756b;
        int length = objArr.length - 1;
        int i2 = this.f5757c;
        int i3 = this.f5758d;
        int i4 = (i - i2) & length;
        int i5 = (i3 - i) & length;
        if (i4 >= ((i3 - i2) & length)) {
            throw new ConcurrentModificationException();
        } else if (i4 < i5) {
            if (i2 <= i) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i2, objArr, i2 + 1, length - i2);
            }
            objArr[i2] = null;
            this.f5757c = (i2 + 1) & length;
            return false;
        } else if (i < i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i5);
            this.f5758d = i3 - 1;
            return true;
        } else {
            System.arraycopy(objArr, i + 1, objArr, i, length - i);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i3);
            this.f5758d = (i3 - 1) & length;
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.f5758d - this.f5757c) & (this.f5756b.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f5757c == this.f5758d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0829h(this, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f5756b.length - 1;
        int i = this.f5757c;
        while (true) {
            Object obj2 = this.f5756b[i];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                return true;
            }
            i = (i + 1) & length;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return m509b(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i = this.f5757c;
        int i2 = this.f5758d;
        if (i != i2) {
            this.f5758d = 0;
            this.f5757c = 0;
            int i3 = i;
            int length = this.f5756b.length - 1;
            do {
                this.f5756b[i3] = null;
                i3 = (i3 + 1) & length;
            } while (i3 != i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m512a(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        m512a(objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* renamed from: b */
    public C0827g clone() {
        try {
            C0827g gVar = (C0827g) super.clone();
            gVar.f5756b = (Object[]) this.f5756b.clone();
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

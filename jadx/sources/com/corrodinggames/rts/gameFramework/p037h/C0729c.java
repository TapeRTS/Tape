package com.corrodinggames.rts.gameFramework.p037h;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.h.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/c.class */
public final class C0729c extends AbstractC0732f {

    /* renamed from: a */
    public static int f5061a;

    /* renamed from: b */
    public static int f5062b;

    /* renamed from: c */
    public static int f5063c;

    /* renamed from: d */
    public static int f5064d;

    /* renamed from: e */
    public static int f5065e;

    /* renamed from: f */
    public static int f5066f;

    /* renamed from: g */
    public static int f5067g;

    /* renamed from: h */
    public static double f5068h;

    /* renamed from: i */
    public static double f5069i;

    /* renamed from: j */
    int f5070j;

    /* renamed from: k */
    int f5071k;

    /* renamed from: l */
    int f5072l;

    /* renamed from: m */
    int f5073m;

    /* renamed from: n */
    int f5074n;

    /* renamed from: o */
    C0736j[] f5075o = new C0736j[975];

    /* renamed from: p */
    C0835m f5076p = new C0835m(100);

    /* renamed from: q */
    final PriorityQueue f5077q = new PriorityQueue();

    /* renamed from: r */
    final C0835m f5078r = new C0835m(300);

    /* renamed from: s */
    int f5079s;

    /* renamed from: t */
    int f5080t;

    /* renamed from: u */
    public static int f5081u;

    /* renamed from: c */
    private void m998c() {
        if (this.f5071k == this.f5073m) {
            m996d();
            return;
        }
        int i = this.f5074n;
        C0736j[] jVarArr = this.f5075o;
        if (this.f5070j == -2) {
            for (int i2 = 0; i2 <= i; i2++) {
                int i3 = jVarArr[i2].f5168c;
                if (this.f5071k == i3) {
                    this.f5070j = i2;
                    this.f5071k = i3;
                    return;
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 <= i; i6++) {
            int i7 = jVarArr[i6].f5168c;
            if (i5 > i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        if (this.f5071k != i5) {
            f5067g++;
        }
        this.f5070j = i4;
        this.f5071k = i5;
    }

    /* renamed from: a */
    private void m1001a(int i, C0736j jVar) {
        this.f5075o[i] = jVar;
        int i2 = jVar.f5168c;
        if (this.f5070j == -1 || this.f5071k >= i2) {
            if (this.f5071k > i2) {
            }
            if (this.f5071k != i2) {
                f5067g++;
            }
            this.f5070j = i;
            this.f5071k = i2;
        }
        if (this.f5072l == -1 || this.f5073m < i2) {
            this.f5072l = i;
            this.f5073m = i2;
        }
    }

    /* renamed from: d */
    private void m996d() {
        this.f5070j = -1;
        this.f5071k = Integer.MAX_VALUE;
        this.f5072l = -1;
        this.f5073m = Integer.MIN_VALUE;
        for (int i = 0; i <= this.f5074n; i++) {
            C0736j jVar = this.f5075o[i];
            if (jVar == null) {
                AbstractC0789l.m670d("n:" + i);
                AbstractC0789l.m670d("lowestBufferLastIndex:" + this.f5074n);
                throw new RuntimeException("null with n:" + i + ", lowestBufferLastIndex:" + this.f5074n);
            }
            int i2 = jVar.f5168c;
            if (this.f5071k > i2) {
                this.f5070j = i;
                this.f5071k = i2;
            }
            if (this.f5073m < i2) {
                this.f5072l = i;
                this.f5073m = i2;
            }
        }
    }

    /* renamed from: e */
    private void m995e() {
        if (this.f5074n < 30) {
            C0736j jVar = (C0736j) this.f5077q.poll();
            if (jVar != null) {
                m999b(jVar);
            }
            C0736j jVar2 = (C0736j) this.f5077q.peek();
            if (jVar2 != null) {
                this.f5079s = jVar2.f5168c;
                return;
            }
            return;
        }
        this.f5079s = Integer.MAX_VALUE;
        C0736j jVar3 = (C0736j) this.f5077q.peek();
        if (jVar3 != null) {
            this.f5079s = jVar3.f5168c;
        }
    }

    public C0729c() {
        m994f();
    }

    /* renamed from: b */
    private void m999b(C0736j jVar) {
        this.f5074n++;
        m1001a(this.f5074n, jVar);
        if (this.f5074n > f5061a) {
            f5061a = this.f5074n;
        }
    }

    /* renamed from: c */
    private void m997c(C0736j jVar) {
        this.f5077q.offer(jVar);
        if (jVar.f5168c < this.f5079s) {
            this.f5079s = jVar.f5168c;
        }
        if (this.f5077q.size() > f5062b) {
            f5062b = this.f5077q.size();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: a */
    public void mo976a(C0736j jVar) {
        f5064d++;
        boolean z = false;
        if (this.f5074n < this.f5075o.length - 1) {
            z = true;
        }
        if (z) {
            if (jVar.f5168c <= this.f5079s) {
                m999b(jVar);
            } else {
                m997c(jVar);
            }
        } else if (jVar.f5168c < this.f5073m) {
            C0736j jVar2 = this.f5075o[this.f5072l];
            this.f5075o[this.f5072l] = jVar;
            m996d();
            m997c(jVar2);
        } else {
            m997c(jVar);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: a */
    public C0736j mo977a() {
        if (this.f5070j == -2) {
            int i = this.f5071k;
            m998c();
            this.f5080t++;
            if (f5081u < this.f5080t) {
                f5081u = this.f5080t;
            }
            f5065e++;
            if (i == this.f5071k) {
                f5066f++;
            }
        } else {
            this.f5080t = 0;
        }
        if (this.f5071k >= this.f5079s || this.f5070j == -1) {
            C0736j jVar = (C0736j) this.f5077q.poll();
            m995e();
            return jVar;
        }
        C0736j[] jVarArr = this.f5075o;
        C0736j jVar2 = jVarArr[this.f5070j];
        if (this.f5074n != this.f5070j) {
            jVarArr[this.f5070j] = jVarArr[this.f5074n];
            jVarArr[this.f5074n] = null;
        } else {
            jVarArr[this.f5074n] = null;
        }
        this.f5074n--;
        this.f5070j = -2;
        return jVar2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: b */
    public void mo975b() {
        m1000a((C0735i) null);
    }

    /* renamed from: a */
    public void m1000a(C0735i iVar) {
        for (int i = 0; i < this.f5075o.length; i++) {
            if (this.f5075o[i] != null) {
                if (iVar != null) {
                    iVar.m928a(this.f5075o[i]);
                }
                this.f5075o[i] = null;
            }
        }
        this.f5074n = -1;
        Iterator it = this.f5077q.iterator();
        while (it.hasNext()) {
            C0736j jVar = (C0736j) it.next();
            if (iVar != null) {
                iVar.m928a(jVar);
            }
        }
        this.f5077q.clear();
        m994f();
    }

    /* renamed from: f */
    private void m994f() {
        this.f5070j = -1;
        this.f5071k = Integer.MAX_VALUE;
        this.f5072l = -1;
        this.f5073m = Integer.MIN_VALUE;
        this.f5079s = Integer.MAX_VALUE;
    }
}

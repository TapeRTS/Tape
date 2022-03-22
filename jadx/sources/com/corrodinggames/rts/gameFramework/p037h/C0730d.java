package com.corrodinggames.rts.gameFramework.p037h;

/* renamed from: com.corrodinggames.rts.gameFramework.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/d.class */
public final class C0730d extends AbstractC0732f {

    /* renamed from: a */
    boolean f5082a;

    /* renamed from: b */
    int f5083b;

    /* renamed from: c */
    final C0726a f5084c = new C0726a(100);

    /* renamed from: d */
    final C0726a f5085d = new C0726a(900);

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: a */
    public void mo976a(C0736j jVar) {
        int i = jVar.f5168c;
        if (i > this.f5083b) {
            this.f5085d.m1006b(jVar);
        } else if (i == this.f5083b) {
            this.f5084c.m1006b(jVar);
        } else {
            m992c();
            this.f5083b = i;
            this.f5084c.add(jVar);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: a */
    public C0736j mo977a() {
        if (this.f5084c.f5055b > 0) {
            return this.f5084c.m1010b();
        }
        if (this.f5085d.f5055b == 0) {
            this.f5083b = Integer.MAX_VALUE;
            return null;
        }
        m991d();
        return this.f5084c.m1010b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p037h.AbstractC0732f
    /* renamed from: b */
    public void mo975b() {
        m993a((C0735i) null);
    }

    /* renamed from: a */
    public void m993a(C0735i iVar) {
        if (iVar != null) {
            C0736j[] a = this.f5084c.m1016a();
            for (int i = this.f5084c.f5055b - 1; i >= 0; i--) {
                iVar.m928a(a[i]);
            }
            C0736j[] a2 = this.f5085d.m1016a();
            for (int i2 = this.f5085d.f5055b - 1; i2 >= 0; i2--) {
                iVar.m928a(a2[i2]);
            }
        }
        this.f5084c.clear();
        this.f5085d.clear();
        this.f5083b = Integer.MAX_VALUE;
        this.f5082a = true;
    }

    /* renamed from: c */
    private void m992c() {
        C0736j[] a = this.f5084c.m1016a();
        int i = this.f5084c.f5055b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5085d.add(a[i2]);
        }
        this.f5084c.clear();
    }

    /* renamed from: d */
    private void m991d() {
        int i = Integer.MAX_VALUE;
        C0726a aVar = this.f5085d;
        C0736j[] a = aVar.m1016a();
        for (int i2 = aVar.f5055b - 1; i2 >= 0; i2--) {
            int i3 = a[i2].f5168c;
            if (i3 < i) {
                i = i3;
            }
        }
        for (int i4 = aVar.f5055b - 1; i4 >= 0; i4--) {
            C0736j jVar = a[i4];
            if (jVar.f5168c == i) {
                this.f5084c.add(jVar);
                int i5 = aVar.f5055b - 1;
                a[i4] = a[i5];
                a[i5] = null;
                aVar.f5055b = i5;
            }
        }
        this.f5083b = i;
    }
}

package com.corrodinggames.rts.gameFramework.p037h;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.h.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/i.class */
public final class C0735i {

    /* renamed from: a */
    int f5161a;

    /* renamed from: b */
    int f5162b;

    /* renamed from: c */
    public static int f5163c;

    /* renamed from: e */
    final C0730d f5165e = new C0730d();

    /* renamed from: d */
    final C0726a f5164d = new C0726a(1000 + 100);

    C0735i() {
        for (int i = 0; i < 1000; i++) {
            this.f5164d.add(new C0736j());
        }
    }

    /* renamed from: a */
    C0736j m931a() {
        if (this.f5164d.f5055b != 0) {
            return this.f5164d.m1010b();
        }
        f5163c++;
        return new C0736j();
    }

    /* renamed from: a */
    final void m928a(C0736j jVar) {
        if (jVar != null) {
            this.f5164d.m1006b(jVar);
        }
    }

    /* renamed from: b */
    void m927b() {
        if (this.f5164d.size() > 50000) {
            AbstractC0789l.m670d("PathOpenList: resetPool:memoryPool over 50000 clearing");
            this.f5164d.clear();
        }
        this.f5165e.m993a(this);
    }

    /* renamed from: a */
    public void m930a(int i, int i2) {
        m927b();
        this.f5161a = i;
        this.f5162b = i2;
    }

    /* renamed from: a */
    public final void m929a(int i, short s, short s2) {
        C0736j a = m931a();
        a.m923a(s, s2);
        a.m925a(i, this.f5161a, this.f5162b);
        this.f5165e.mo976a(a);
    }

    /* renamed from: c */
    public final C0736j m926c() {
        C0736j a = this.f5165e.mo977a();
        if (a != null) {
            m928a(a);
        }
        return a;
    }
}

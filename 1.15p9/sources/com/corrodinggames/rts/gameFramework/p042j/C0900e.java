package com.corrodinggames.rts.gameFramework.p042j;

/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
public final class C0900e extends AbstractC0905j {

    /* renamed from: a */
    boolean f5933a;

    /* renamed from: b */
    int f5934b;

    /* renamed from: c */
    final C0895a f5935c = new C0895a(100);

    /* renamed from: d */
    final C0895a f5936d = new C0895a(900);

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public void mo1328a(C0909n c0909n) {
        int i = c0909n.f6037c;
        if (i <= this.f5934b) {
            if (i == this.f5934b) {
                this.f5935c.m1382b(c0909n);
                return;
            }
            m1364c();
            this.f5934b = i;
            this.f5935c.add(c0909n);
            return;
        }
        this.f5936d.m1382b(c0909n);
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public C0909n mo1329a() {
        if (this.f5935c.f5906b > 0) {
            return this.f5935c.m1386b();
        }
        if (this.f5936d.f5906b == 0) {
            this.f5934b = Integer.MAX_VALUE;
            return null;
        }
        m1363d();
        return this.f5935c.m1386b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: b */
    public void mo1327b() {
        m1365a((C0908m) null);
    }

    /* renamed from: a */
    public void m1365a(C0908m c0908m) {
        if (c0908m != null) {
            C0909n[] m1392a = this.f5935c.m1392a();
            for (int i = this.f5935c.f5906b - 1; i >= 0; i--) {
                c0908m.m1277a(m1392a[i]);
            }
            C0909n[] m1392a2 = this.f5936d.m1392a();
            for (int i2 = this.f5936d.f5906b - 1; i2 >= 0; i2--) {
                c0908m.m1277a(m1392a2[i2]);
            }
        }
        this.f5935c.clear();
        this.f5936d.clear();
        this.f5934b = Integer.MAX_VALUE;
        this.f5933a = true;
    }

    /* renamed from: c */
    private void m1364c() {
        C0909n[] m1392a = this.f5935c.m1392a();
        int i = this.f5935c.f5906b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5936d.add(m1392a[i2]);
        }
        this.f5935c.clear();
    }

    /* renamed from: d */
    private void m1363d() {
        int i = Integer.MAX_VALUE;
        C0895a c0895a = this.f5936d;
        C0909n[] m1392a = c0895a.m1392a();
        for (int i2 = c0895a.f5906b - 1; i2 >= 0; i2--) {
            int i3 = m1392a[i2].f6037c;
            if (i3 < i) {
                i = i3;
            }
        }
        for (int i4 = c0895a.f5906b - 1; i4 >= 0; i4--) {
            C0909n c0909n = m1392a[i4];
            if (c0909n.f6037c == i) {
                this.f5935c.add(c0909n);
                int i5 = c0895a.f5906b - 1;
                m1392a[i4] = m1392a[i5];
                m1392a[i5] = null;
                c0895a.f5906b = i5;
            }
        }
        this.f5934b = i;
    }
}

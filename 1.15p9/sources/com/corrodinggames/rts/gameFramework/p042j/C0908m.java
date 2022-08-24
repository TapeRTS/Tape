package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/m.class */
public final class C0908m {

    /* renamed from: a */
    int f6030a;

    /* renamed from: b */
    int f6031b;

    /* renamed from: c */
    public static int f6032c;

    /* renamed from: e */
    final C0900e f6033e = new C0900e();

    /* renamed from: d */
    final C0895a f6034d = new C0895a(1000 + 100);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0908m() {
        for (int i = 0; i < 1000; i++) {
            this.f6034d.add(new C0909n());
        }
    }

    /* renamed from: a */
    C0909n m1280a() {
        if (this.f6034d.f5906b == 0) {
            f6032c++;
            return new C0909n();
        }
        return this.f6034d.m1386b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1277a(C0909n c0909n) {
        if (c0909n != null) {
            this.f6034d.m1382b(c0909n);
        }
    }

    /* renamed from: b */
    void m1276b() {
        if (this.f6034d.size() > 50000) {
            GameEngine.PrintLog("PathOpenList: resetPool:memoryPool over 50000 clearing");
            this.f6034d.clear();
        }
        this.f6033e.m1365a(this);
    }

    /* renamed from: a */
    public void m1279a(int i, int i2) {
        m1276b();
        this.f6030a = i;
        this.f6031b = i2;
    }

    /* renamed from: a */
    public final void m1278a(int i, short s, short s2) {
        C0909n m1280a = m1280a();
        m1280a.m1272a(s, s2);
        m1280a.m1274a(i, this.f6030a, this.f6031b);
        this.f6033e.mo1328a(m1280a);
    }

    /* renamed from: c */
    public final C0909n m1275c() {
        C0909n mo1329a = this.f6033e.mo1329a();
        if (mo1329a != null) {
            m1277a(mo1329a);
        }
        return mo1329a;
    }
}

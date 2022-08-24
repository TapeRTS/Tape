package com.corrodinggames.rts.java.p051b;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.rts.java.Main;

/* renamed from: com.corrodinggames.rts.java.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b/a.class */
public class C1153a extends AbstractC0043a {

    /* renamed from: e */
    public Main f7079e;

    /* renamed from: f */
    boolean f7080f = false;

    /* renamed from: o */
    public static synchronized C1153a m295o() {
        if (f343a != null) {
            throw new RuntimeException("CommonGuiEngine already exists");
        }
        C1153a c1153a = new C1153a();
        f343a = c1153a;
        return c1153a;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: f */
    public void mo298f() {
        this.f7079e.m414i();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: g */
    public void mo297g() {
        this.f7079e.f6977u = true;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: h */
    public int mo296h() {
        return this.f7079e.f6970j.m22e();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: d */
    public void mo299d(boolean z) {
        this.f7079e.m426a(z);
    }
}

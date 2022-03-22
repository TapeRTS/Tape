package com.corrodinggames.rts.java.p045b;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.rts.java.Main;

/* renamed from: com.corrodinggames.rts.java.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b/a.class */
public class C0887a extends AbstractC0043a {

    /* renamed from: e */
    public Main f5967e;

    /* renamed from: o */
    public static synchronized C0887a m258o() {
        if (f340a != null) {
            throw new RuntimeException("CommonGuiEngine already exists");
        }
        C0887a aVar = new C0887a();
        f340a = aVar;
        return aVar;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: f */
    public void mo261f() {
        this.f5967e.m357i();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: g */
    public void mo260g() {
        this.f5967e.f5872u = true;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: h */
    public int mo259h() {
        return this.f5967e.f5861j.m22e();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: d */
    public void mo262d(boolean z) {
        this.f5967e.m369a(z);
    }
}

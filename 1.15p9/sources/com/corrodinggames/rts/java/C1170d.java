package com.corrodinggames.rts.java;

import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0923a;
import com.corrodinggames.rts.gameFramework.p044l.C0943n;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;

/* renamed from: com.corrodinggames.rts.java.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class C1170d implements InterfaceC0096f {

    /* renamed from: a */
    public int f7139a;

    /* renamed from: b */
    public int f7140b;

    /* renamed from: d */
    C0121m f7141d;

    /* renamed from: e */
    public Object f7142e = new Object();

    /* renamed from: f */
    public Object f7143f = new Object();

    /* renamed from: g */
    C0943n f7144g = new C0943n();

    /* renamed from: c */
    ActivityC1176h f7145c = new ActivityC1176h();

    /* renamed from: j */
    public void mo6953j() {
    }

    /* renamed from: a */
    public void mo6967a() {
    }

    /* renamed from: b */
    public boolean mo6963b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo6960c() {
        return false;
    }

    /* renamed from: d */
    public C0923a mo6959d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo6958e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo6957f() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine != null && gameEngine.f6109bQ.slick2dFullScreen) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public Object mo6956g() {
        return null;
    }

    /* renamed from: o */
    public int m241o() {
        return this.f7139a;
    }

    /* renamed from: p */
    public int m240p() {
        return this.f7140b;
    }

    /* renamed from: h */
    public void mo6955h() {
    }

    /* renamed from: i */
    public ActivityC0097g mo6954i() {
        return this.f7145c;
    }

    /* renamed from: k */
    public C0121m mo6952k() {
        return this.f7141d;
    }

    /* renamed from: a */
    public void mo6966a(float f, int i) {
        synchronized (this.f7143f) {
            this.f7143f.notifyAll();
        }
    }

    /* renamed from: b */
    public void mo6962b(float f, int i) {
    }

    /* renamed from: l */
    public void mo6951l() {
    }

    /* renamed from: b */
    public InterfaceC0941l mo6961b(boolean z) {
        return this.f7144g;
    }

    /* renamed from: a */
    public void mo6965a(InterfaceC0941l interfaceC0941l, boolean z) {
    }

    /* renamed from: m */
    public void mo6950m() {
    }

    /* renamed from: n */
    public boolean mo6949n() {
        return true;
    }

    /* renamed from: a */
    public void mo6964a(boolean z) {
    }
}

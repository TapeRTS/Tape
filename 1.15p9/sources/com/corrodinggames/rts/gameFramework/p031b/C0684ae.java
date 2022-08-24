package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ae.class */
public class C0684ae extends AbstractC0690b {

    /* renamed from: l */
    C0683ad f4327l;

    /* renamed from: m */
    public float f4328m;

    /* renamed from: n */
    public float f4329n;

    /* renamed from: o */
    public int f4330o;

    /* renamed from: p */
    public int f4331p;

    /* renamed from: c */
    protected boolean mo2670c(InterfaceC0700k interfaceC0700k) {
        return false;
    }

    /* renamed from: g */
    protected int mo2669g() {
        return 3553;
    }

    /* renamed from: b */
    public void mo2672b(int i) {
        this.f4327l.mo2672b(i);
    }

    /* renamed from: h */
    public int mo2668h() {
        return this.f4327l.mo2668h();
    }

    /* renamed from: a */
    public void mo2811a(RectF rectF) {
        float f = this.f4352g;
        float f2 = this.f4353h;
        rectF.f234a = (rectF.f234a * f) + this.f4328m;
        rectF.f236c = (rectF.f236c * f) + this.f4328m;
        rectF.f235b = (rectF.f235b * f2) + this.f4329n;
        rectF.f237d = (rectF.f237d * f2) + this.f4329n;
    }

    /* renamed from: a */
    public void mo2810a(RectF rectF, RectF rectF2) {
    }

    /* renamed from: b */
    public void mo2671b(InterfaceC0700k interfaceC0700k) {
        GameEngine.PrintLog("SubTexture prepare TODO");
    }
}

package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;

/* renamed from: com.corrodinggames.rts.gameFramework.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ay.class */
public abstract class AbstractC0667ay extends AbstractC0668az {

    /* renamed from: eo */
    public int f4223eo;

    /* renamed from: ep */
    public int f4224ep;

    /* renamed from: eq */
    public float f4225eq;

    /* renamed from: er */
    public float f4226er;

    /* renamed from: es */
    public boolean f4227es;

    /* renamed from: b */
    public void m2878b(BitmapOrTexture bitmapOrTexture) {
        m2884T(bitmapOrTexture.f6396p);
        m2883U(bitmapOrTexture.f6397q);
        this.f4227es = true;
    }

    /* renamed from: a */
    public void m2879a(BitmapOrTexture bitmapOrTexture, int i) {
        m2884T(bitmapOrTexture.f6396p / i);
        m2883U(bitmapOrTexture.f6397q);
        this.f4227es = false;
    }

    /* renamed from: T */
    public void m2884T(int i) {
        this.f4223eo = i;
        this.f4225eq = i / 2;
    }

    /* renamed from: U */
    public void m2883U(int i) {
        this.f4224ep = i;
        this.f4226er = i / 2;
    }

    /* renamed from: V */
    public void m2882V(int i) {
        this.f4223eo = i;
        this.f4225eq = i / 2.0f;
    }

    /* renamed from: W */
    public void m2881W(int i) {
        this.f4224ep = i;
        this.f4226er = i / 2.0f;
    }

    public AbstractC0667ay(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2880a() {
        super.mo2880a();
    }
}

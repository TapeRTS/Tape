package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/o.class */
public class C0807o extends AbstractC0942m {

    /* renamed from: a */
    float[] f5351a;

    /* renamed from: b */
    int f5352b = 0;

    /* renamed from: c */
    Paint f5353c;

    /* renamed from: d */
    int f5354d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0807o(int i, Paint paint) {
        this.f5354d = i;
        this.f5351a = new float[i * 2];
        this.f5353c = paint;
    }

    /* renamed from: a */
    public final void m1916a(float f, float f2) {
        this.f5351a[this.f5352b] = f;
        this.f5351a[this.f5352b + 1] = f2;
        this.f5352b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m
    /* renamed from: a */
    public void mo1001a(InterfaceC1027y interfaceC1027y) {
        interfaceC1027y.mo892a(this.f5351a, 0, this.f5352b, this.f5353c);
        C0802k.m1931a(this);
    }
}

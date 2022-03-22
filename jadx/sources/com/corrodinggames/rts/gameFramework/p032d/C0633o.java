package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0752i;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;

/* renamed from: com.corrodinggames.rts.gameFramework.d.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/o.class */
public class C0633o extends AbstractC0752i {

    /* renamed from: a */
    float[] f4509a;

    /* renamed from: b */
    int f4510b = 0;

    /* renamed from: c */
    Paint f4511c;

    /* renamed from: d */
    int f4512d;

    C0633o(int i, Paint paint) {
        this.f4512d = i;
        this.f4509a = new float[i * 2];
        this.f4511c = paint;
    }

    /* renamed from: a */
    public final void m1612a(float f, float f2) {
        this.f4509a[this.f4510b] = f;
        this.f4509a[this.f4510b + 1] = f2;
        this.f4510b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0752i
    /* renamed from: a */
    public void mo875a(AbstractC0755l lVar) {
        lVar.mo149a(this.f4509a, 0, this.f4510b, this.f4511c);
        C0628k.m1627a(this);
    }
}

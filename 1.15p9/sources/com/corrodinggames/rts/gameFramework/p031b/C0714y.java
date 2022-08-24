package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;

/* renamed from: com.corrodinggames.rts.gameFramework.b.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/y.class */
public class C0714y {

    /* renamed from: a */
    C0680aa f4444a;

    /* renamed from: b */
    float[] f4445b;

    /* renamed from: c */
    int f4446c;

    /* renamed from: d */
    int f4447d;

    /* renamed from: e */
    int f4448e;

    /* renamed from: f */
    C0703n f4449f;

    /* renamed from: g */
    int f4450g;

    /* renamed from: h */
    C0692d f4451h;

    /* renamed from: i */
    final C0715z f4452i;

    /* renamed from: j */
    public C0715z f4453j;

    /* renamed from: k */
    AbstractC0690b f4454k;

    /* renamed from: l */
    C0928ae f4455l;

    /* renamed from: m */
    boolean f4456m;

    /* renamed from: n */
    int f4457n;

    /* renamed from: o */
    float f4458o;

    /* renamed from: p */
    float f4459p;

    /* renamed from: q */
    float f4460q;

    /* renamed from: r */
    float f4461r;

    /* renamed from: a */
    public void m2662a(C0928ae c0928ae) {
        this.f4448e = 0;
        this.f4446c = 0;
        this.f4454k = null;
        m2660b(c0928ae);
        m2666a();
        C0703n.m2689o();
        this.f4444a.m2828d();
    }

    /* renamed from: a */
    public void m2666a() {
        this.f4453j.f4465d.m2683a(this.f4449f.f4382d);
    }

    /* renamed from: b */
    public void m2661b() {
        this.f4456m = true;
    }

    /* renamed from: b */
    void m2660b(C0928ae c0928ae) {
        if (c0928ae != null) {
            this.f4449f.m2747a(c0928ae.f6353n);
            this.f4449f.m2703c(c0928ae);
            this.f4456m = false;
        } else {
            this.f4449f.m2747a(this.f4450g);
        }
        this.f4455l = c0928ae;
    }

    /* renamed from: a */
    void m2664a(AbstractC0690b abstractC0690b) {
        int m2814a;
        if (this.f4454k == abstractC0690b) {
            return;
        }
        if (this.f4454k != null && (m2814a = this.f4454k.m2814a()) == abstractC0690b.m2814a() && m2814a != -1) {
            return;
        }
        m2659c();
        GLES20.glActiveTexture(33984);
        C0703n.m2689o();
        abstractC0690b.mo2670c(this.f4449f);
        GLES20.glBindTexture(abstractC0690b.mo2669g(), abstractC0690b.m2814a());
        C0703n.m2689o();
        GLES20.glUniform1i(this.f4453j.f4466e.f4432a, 0);
        C0703n.m2689o();
        this.f4454k = abstractC0690b;
    }

    /* renamed from: c */
    public void m2659c() {
        if (this.f4448e > 0) {
            C0703n.m2689o();
            this.f4444a.m2831a(this.f4445b, 0, this.f4446c);
            this.f4444a.m2830b();
            C0703n.m2689o();
            this.f4444a.m2832a(4, 0, this.f4448e * 6);
            this.f4444a.m2829c();
            C0703n.m2689o();
            this.f4448e = 0;
            this.f4446c = 0;
        }
    }

    /* renamed from: d */
    public void m2658d() {
        m2659c();
        this.f4454k = null;
        this.f4444a.m2827e();
    }

    /* renamed from: a */
    public void m2665a(int i) {
        if (this.f4457n == i) {
            return;
        }
        this.f4457n = i;
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        this.f4458o = f2;
        this.f4459p = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f4460q = (i & 255) * 0.003921569f * f;
        this.f4461r = f;
    }

    /* renamed from: a */
    public void m2663a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, float[] fArr) {
        if (this.f4448e == this.f4447d) {
            m2659c();
        }
        m2664a(abstractC0690b);
        if (this.f4456m && this.f4455l != null) {
            this.f4449f.m2703c(this.f4455l);
            this.f4456m = false;
        }
        float f = rectF2.f234a;
        float f2 = rectF2.f237d;
        float f3 = rectF2.f236c;
        float f4 = rectF2.f235b;
        float f5 = rectF.f234a;
        float f6 = rectF.f235b;
        float f7 = rectF.f236c;
        float f8 = rectF.f237d;
        float f9 = this.f4458o;
        float f10 = this.f4459p;
        float f11 = this.f4460q;
        float f12 = this.f4461r;
        float f13 = fArr[0];
        float f14 = fArr[4];
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float[] fArr2 = this.f4445b;
        int i = this.f4446c;
        this.f4446c = i + 1;
        fArr2[i] = (f * f13) + (f2 * f14) + f17;
        float[] fArr3 = this.f4445b;
        int i2 = this.f4446c;
        this.f4446c = i2 + 1;
        fArr3[i2] = (f * f15) + (f2 * f16) + f18;
        float[] fArr4 = this.f4445b;
        int i3 = this.f4446c;
        this.f4446c = i3 + 1;
        fArr4[i3] = f5;
        float[] fArr5 = this.f4445b;
        int i4 = this.f4446c;
        this.f4446c = i4 + 1;
        fArr5[i4] = f8;
        float[] fArr6 = this.f4445b;
        int i5 = this.f4446c;
        this.f4446c = i5 + 1;
        fArr6[i5] = f9;
        float[] fArr7 = this.f4445b;
        int i6 = this.f4446c;
        this.f4446c = i6 + 1;
        fArr7[i6] = f10;
        float[] fArr8 = this.f4445b;
        int i7 = this.f4446c;
        this.f4446c = i7 + 1;
        fArr8[i7] = f11;
        float[] fArr9 = this.f4445b;
        int i8 = this.f4446c;
        this.f4446c = i8 + 1;
        fArr9[i8] = f12;
        float[] fArr10 = this.f4445b;
        int i9 = this.f4446c;
        this.f4446c = i9 + 1;
        fArr10[i9] = (f3 * f13) + (f2 * f14) + f17;
        float[] fArr11 = this.f4445b;
        int i10 = this.f4446c;
        this.f4446c = i10 + 1;
        fArr11[i10] = (f3 * f15) + (f2 * f16) + f18;
        float[] fArr12 = this.f4445b;
        int i11 = this.f4446c;
        this.f4446c = i11 + 1;
        fArr12[i11] = f7;
        float[] fArr13 = this.f4445b;
        int i12 = this.f4446c;
        this.f4446c = i12 + 1;
        fArr13[i12] = f8;
        float[] fArr14 = this.f4445b;
        int i13 = this.f4446c;
        this.f4446c = i13 + 1;
        fArr14[i13] = f9;
        float[] fArr15 = this.f4445b;
        int i14 = this.f4446c;
        this.f4446c = i14 + 1;
        fArr15[i14] = f10;
        float[] fArr16 = this.f4445b;
        int i15 = this.f4446c;
        this.f4446c = i15 + 1;
        fArr16[i15] = f11;
        float[] fArr17 = this.f4445b;
        int i16 = this.f4446c;
        this.f4446c = i16 + 1;
        fArr17[i16] = f12;
        float[] fArr18 = this.f4445b;
        int i17 = this.f4446c;
        this.f4446c = i17 + 1;
        fArr18[i17] = (f3 * f13) + (f4 * f14) + f17;
        float[] fArr19 = this.f4445b;
        int i18 = this.f4446c;
        this.f4446c = i18 + 1;
        fArr19[i18] = (f3 * f15) + (f4 * f16) + f18;
        float[] fArr20 = this.f4445b;
        int i19 = this.f4446c;
        this.f4446c = i19 + 1;
        fArr20[i19] = f7;
        float[] fArr21 = this.f4445b;
        int i20 = this.f4446c;
        this.f4446c = i20 + 1;
        fArr21[i20] = f6;
        float[] fArr22 = this.f4445b;
        int i21 = this.f4446c;
        this.f4446c = i21 + 1;
        fArr22[i21] = f9;
        float[] fArr23 = this.f4445b;
        int i22 = this.f4446c;
        this.f4446c = i22 + 1;
        fArr23[i22] = f10;
        float[] fArr24 = this.f4445b;
        int i23 = this.f4446c;
        this.f4446c = i23 + 1;
        fArr24[i23] = f11;
        float[] fArr25 = this.f4445b;
        int i24 = this.f4446c;
        this.f4446c = i24 + 1;
        fArr25[i24] = f12;
        float[] fArr26 = this.f4445b;
        int i25 = this.f4446c;
        this.f4446c = i25 + 1;
        fArr26[i25] = (f * f13) + (f4 * f14) + f17;
        float[] fArr27 = this.f4445b;
        int i26 = this.f4446c;
        this.f4446c = i26 + 1;
        fArr27[i26] = (f * f15) + (f4 * f16) + f18;
        float[] fArr28 = this.f4445b;
        int i27 = this.f4446c;
        this.f4446c = i27 + 1;
        fArr28[i27] = f5;
        float[] fArr29 = this.f4445b;
        int i28 = this.f4446c;
        this.f4446c = i28 + 1;
        fArr29[i28] = f6;
        float[] fArr30 = this.f4445b;
        int i29 = this.f4446c;
        this.f4446c = i29 + 1;
        fArr30[i29] = f9;
        float[] fArr31 = this.f4445b;
        int i30 = this.f4446c;
        this.f4446c = i30 + 1;
        fArr31[i30] = f10;
        float[] fArr32 = this.f4445b;
        int i31 = this.f4446c;
        this.f4446c = i31 + 1;
        fArr32[i31] = f11;
        float[] fArr33 = this.f4445b;
        int i32 = this.f4446c;
        this.f4446c = i32 + 1;
        fArr33[i32] = f12;
        this.f4448e++;
    }
}

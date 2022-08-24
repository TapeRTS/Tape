package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/e.class */
public class C0677e {

    /* renamed from: a */
    int f4283a;

    /* renamed from: b */
    int f4284b;

    /* renamed from: c */
    Canvas f4285c;

    /* renamed from: d */
    public Bitmap f4286d;

    /* renamed from: e */
    int f4287e;

    /* renamed from: f */
    int f4288f;

    /* renamed from: g */
    int f4289g = 0;

    /* renamed from: h */
    int f4290h = 0;

    /* renamed from: i */
    int f4291i = 0;

    /* renamed from: j */
    int f4292j;

    /* renamed from: k */
    int f4293k;

    /* renamed from: l */
    int f4294l;

    /* renamed from: m */
    int f4295m;

    /* renamed from: n */
    int f4296n;

    /* renamed from: a */
    public boolean m2845a() {
        return this.f4289g < this.f4287e * this.f4288f;
    }

    public C0677e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f4294l = i2;
        this.f4284b = i;
        this.f4287e = i / i3;
        this.f4288f = i / i4;
        this.f4292j = i3;
        this.f4293k = i4;
        this.f4295m = i5;
        this.f4296n = i6;
    }

    /* renamed from: b */
    public void m2842b() {
        this.f4286d = Bitmap.m6562a(this.f4284b, this.f4284b, Bitmap.Config.ALPHA_8);
        this.f4285c = new Canvas();
        this.f4285c.m6536a(this.f4286d);
        this.f4286d.m6566a(0);
    }

    /* renamed from: c */
    public void m2841c() {
        if (this.f4286d == null) {
            return;
        }
        if (this.f4283a == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.f4283a = iArr[0];
            if (this.f4283a == 0) {
                C0674b.m2853b("Failed to gen texture page");
                return;
            }
        }
        GLES20.glBindTexture(3553, this.f4283a);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.f4286d, 0);
    }

    /* renamed from: a */
    public C0675c m2844a(char c, Paint paint) {
        if (this.f4285c == null) {
            m2842b();
        }
        int i = this.f4289g / this.f4287e;
        int i2 = (this.f4289g % this.f4287e) * this.f4292j;
        int i3 = i * this.f4293k;
        float ceil = (float) Math.ceil(Math.abs(paint.m6458n().f207c));
        float[] fArr = new float[2];
        char[] cArr = {c};
        paint.m6484a(cArr, 0, 1, fArr);
        float f = (int) fArr[0];
        if (f > this.f4292j) {
            C0674b.m2853b("Warning chr is larger then cellWidth: " + c);
        }
        this.f4285c.m6527a(cArr, 0, 1, i2 + this.f4295m, (int) (((i3 + this.f4293k) - ceil) - this.f4296n), paint);
        C0675c c0675c = new C0675c();
        c0675c.f4267a = c;
        c0675c.f4268b = this.f4294l;
        m2843a(c0675c, i2, i3, this.f4292j, this.f4293k);
        c0675c.f4269c = f;
        this.f4289g++;
        return c0675c;
    }

    /* renamed from: a */
    private void m2843a(C0675c c0675c, float f, float f2, float f3, float f4) {
        c0675c.f4270d = f / this.f4284b;
        c0675c.f4271e = f2 / this.f4284b;
        c0675c.f4272f = c0675c.f4270d + (f3 / this.f4284b);
        c0675c.f4273g = c0675c.f4271e + (f4 / this.f4284b);
    }
}

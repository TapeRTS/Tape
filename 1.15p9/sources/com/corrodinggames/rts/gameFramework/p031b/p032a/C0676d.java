package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0673b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/d.class */
public class C0676d {

    /* renamed from: a */
    C0674b f4274a;

    /* renamed from: b */
    C0679g f4275b;

    /* renamed from: c */
    float[] f4276c;

    /* renamed from: e */
    int f4278e;

    /* renamed from: h */
    private float[] f4280h;

    /* renamed from: i */
    private int f4281i;

    /* renamed from: g */
    int f4282g;

    /* renamed from: d */
    int f4277d = 0;

    /* renamed from: f */
    int f4279f = 0;

    public C0676d(int i, AbstractC0673b abstractC0673b, C0674b c0674b) {
        this.f4274a = c0674b;
        this.f4276c = new float[i * 4 * 5];
        this.f4275b = new C0679g(i * 4, i * 6);
        this.f4278e = i;
        short[] sArr = new short[i * 6];
        int length = sArr.length;
        short s = 0;
        int i2 = 0;
        while (i2 < length) {
            sArr[i2 + 0] = (short) (s + 0);
            sArr[i2 + 1] = (short) (s + 1);
            sArr[i2 + 2] = (short) (s + 2);
            sArr[i2 + 3] = (short) (s + 2);
            sArr[i2 + 4] = (short) (s + 3);
            sArr[i2 + 5] = (short) (s + 0);
            i2 += 6;
            s = (short) (s + 4);
        }
        this.f4275b.m2835a(sArr, 0, length);
        this.f4281i = GLES20.glGetUniformLocation(abstractC0673b.m2870b(), "u_MVPMatrix");
    }

    /* renamed from: a */
    public void m2846a(float[] fArr) {
        this.f4279f = 0;
        this.f4277d = 0;
        this.f4280h = fArr;
        this.f4282g = -1;
    }

    /* renamed from: a */
    void m2847a(C0675c c0675c) {
        int i = c0675c.f4268b;
        if (this.f4282g == i) {
            return;
        }
        m2849a();
        GLES20.glBindTexture(3553, ((C0677e) this.f4274a.f4262s.get(i)).f4283a);
        this.f4282g = i;
    }

    /* renamed from: a */
    public void m2849a() {
        if (this.f4279f > 0) {
            GLES20.glUniformMatrix4fv(this.f4281i, 1, false, this.f4280h, 0);
            this.f4275b.m2836a(this.f4276c, 0, this.f4277d);
            this.f4275b.m2838a();
            this.f4275b.m2837a(4, 0, this.f4279f * 6);
            this.f4275b.m2834b();
            this.f4279f = 0;
            this.f4277d = 0;
        }
    }

    /* renamed from: a */
    public void m2848a(float f, float f2, float f3, float f4, C0675c c0675c) {
        if (this.f4279f == this.f4278e) {
            m2849a();
        }
        m2847a(c0675c);
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f + f5;
        float f10 = f2 + f6;
        float[] fArr = this.f4276c;
        int i = this.f4277d;
        this.f4277d = i + 1;
        fArr[i] = f7;
        float[] fArr2 = this.f4276c;
        int i2 = this.f4277d;
        this.f4277d = i2 + 1;
        fArr2[i2] = f8;
        float[] fArr3 = this.f4276c;
        int i3 = this.f4277d;
        this.f4277d = i3 + 1;
        fArr3[i3] = c0675c.f4270d;
        float[] fArr4 = this.f4276c;
        int i4 = this.f4277d;
        this.f4277d = i4 + 1;
        fArr4[i4] = c0675c.f4273g;
        float[] fArr5 = this.f4276c;
        int i5 = this.f4277d;
        this.f4277d = i5 + 1;
        fArr5[i5] = f9;
        float[] fArr6 = this.f4276c;
        int i6 = this.f4277d;
        this.f4277d = i6 + 1;
        fArr6[i6] = f8;
        float[] fArr7 = this.f4276c;
        int i7 = this.f4277d;
        this.f4277d = i7 + 1;
        fArr7[i7] = c0675c.f4272f;
        float[] fArr8 = this.f4276c;
        int i8 = this.f4277d;
        this.f4277d = i8 + 1;
        fArr8[i8] = c0675c.f4273g;
        float[] fArr9 = this.f4276c;
        int i9 = this.f4277d;
        this.f4277d = i9 + 1;
        fArr9[i9] = f9;
        float[] fArr10 = this.f4276c;
        int i10 = this.f4277d;
        this.f4277d = i10 + 1;
        fArr10[i10] = f10;
        float[] fArr11 = this.f4276c;
        int i11 = this.f4277d;
        this.f4277d = i11 + 1;
        fArr11[i11] = c0675c.f4272f;
        float[] fArr12 = this.f4276c;
        int i12 = this.f4277d;
        this.f4277d = i12 + 1;
        fArr12[i12] = c0675c.f4271e;
        float[] fArr13 = this.f4276c;
        int i13 = this.f4277d;
        this.f4277d = i13 + 1;
        fArr13[i13] = f7;
        float[] fArr14 = this.f4276c;
        int i14 = this.f4277d;
        this.f4277d = i14 + 1;
        fArr14[i14] = f10;
        float[] fArr15 = this.f4276c;
        int i15 = this.f4277d;
        this.f4277d = i15 + 1;
        fArr15[i15] = c0675c.f4270d;
        float[] fArr16 = this.f4276c;
        int i16 = this.f4277d;
        this.f4277d = i16 + 1;
        fArr16[i16] = c0675c.f4271e;
        this.f4279f++;
    }
}

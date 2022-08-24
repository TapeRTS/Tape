package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.opengl.GLES11Ext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p031b.p032a.C0674b;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0929af;
import com.corrodinggames.rts.gameFramework.p044l.C0940k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/n.class */
public class C0703n implements InterfaceC0700k {

    /* renamed from: a */
    public C0682ac f4373a;

    /* renamed from: H */
    private Map f4377H;

    /* renamed from: I */
    private float[] f4378I;

    /* renamed from: J */
    private int f4379J;

    /* renamed from: b */
    int f4380b;

    /* renamed from: c */
    int f4381c;

    /* renamed from: d */
    float[] f4382d;

    /* renamed from: K */
    private int f4383K;

    /* renamed from: L */
    private int f4384L;

    /* renamed from: M */
    private int f4385M;

    /* renamed from: N */
    private int f4386N;

    /* renamed from: O */
    private int f4387O;

    /* renamed from: P */
    private int f4388P;

    /* renamed from: Q */
    private InterfaceC0697h f4389Q;

    /* renamed from: R */
    private InterfaceC0702m f4390R;

    /* renamed from: e */
    AbstractC0706q[] f4391e;

    /* renamed from: f */
    AbstractC0706q[] f4392f;

    /* renamed from: g */
    AbstractC0706q[] f4393g;

    /* renamed from: S */
    private final C0712w f4394S;

    /* renamed from: T */
    private int f4395T;

    /* renamed from: U */
    private int[] f4396U;

    /* renamed from: V */
    private ArrayList f4397V;

    /* renamed from: W */
    private final float[] f4398W;

    /* renamed from: X */
    private final float[] f4399X;

    /* renamed from: Y */
    private final RectF f4400Y;

    /* renamed from: Z */
    private final RectF f4401Z;

    /* renamed from: aa */
    private final int[] f4402aa;

    /* renamed from: h */
    boolean f4404h;

    /* renamed from: i */
    C0714y f4405i;

    /* renamed from: j */
    C0694f f4406j;

    /* renamed from: k */
    float[] f4407k;

    /* renamed from: l */
    C0707r f4408l;

    /* renamed from: m */
    public int f4409m;

    /* renamed from: n */
    C1101m f4410n;

    /* renamed from: o */
    static RectF f4411o;

    /* renamed from: p */
    int f4412p;

    /* renamed from: q */
    boolean f4413q;

    /* renamed from: r */
    boolean f4414r;

    /* renamed from: s */
    int f4415s;

    /* renamed from: t */
    C0928ae f4416t;

    /* renamed from: u */
    public int f4417u;

    /* renamed from: v */
    static int f4418v;

    /* renamed from: w */
    static int f4419w;

    /* renamed from: x */
    InterfaceC0681ab f4420x;

    /* renamed from: A */
    C1101m f4423A;

    /* renamed from: B */
    C0705p f4424B;

    /* renamed from: C */
    public static C0940k f4425C;

    /* renamed from: D */
    FloatBuffer f4426D;

    /* renamed from: E */
    private static final String f4374E = C0703n.class.getSimpleName();

    /* renamed from: F */
    private static final float[] f4375F = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: G */
    private static final float[] f4376G = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: ab */
    private static final InterfaceC0710u f4403ab = new C0709t();

    /* renamed from: y */
    public static boolean f4421y = false;

    /* renamed from: z */
    static int f4422z = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* synthetic */ String m2687q() {
        return f4374E;
    }

    /* renamed from: a */
    private int m2741a(int i, int i2, AbstractC0706q[] abstractC0706qArr, int[] iArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        m2688p();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Cannot create GL program: " + GLES20.glGetError());
        }
        GLES20.glAttachShader(glCreateProgram, i);
        m2688p();
        GLES20.glAttachShader(glCreateProgram, i2);
        m2688p();
        GLES20.glLinkProgram(glCreateProgram);
        m2688p();
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.m6345d(f4374E, "======= ERROR =========");
            Log.m6345d(f4374E, "Could not link program: ");
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            Log.m6345d(f4374E, glGetProgramInfoLog);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Cannot link GL program: " + glGetProgramInfoLog);
        }
        m2717a(abstractC0706qArr, glCreateProgram);
        return glCreateProgram;
    }

    /* renamed from: a */
    private static void m2717a(AbstractC0706q[] abstractC0706qArr, int i) {
        for (AbstractC0706q abstractC0706q : abstractC0706qArr) {
            abstractC0706q.mo2681a(i);
        }
    }

    /* renamed from: a */
    private static String m2739a(int i, String str) {
        String[] split;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (String str2 : str.split("\n")) {
            if (!z && str2.contains("version")) {
                z = true;
            } else {
                if (z) {
                }
                if (!str2.equals(str2)) {
                    GameEngine.PrintLog("Changing: " + str2 + " to " + str2);
                }
                stringBuffer.append(str2);
                stringBuffer.append("\n");
            }
        }
        if (!z) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static int m2711b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (str == null) {
            throw new RuntimeException("Shader Compilation Failed: shaderCode==null");
        }
        GLES20.glShaderSource(glCreateShader, m2739a(i, str));
        m2689o();
        GLES20.glCompileShader(glCreateShader);
        m2689o();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String str2 = "Shader Compilation Failed: " + GLES20.glGetShaderInfoLog(glCreateShader);
            Log.m6345d(f4374E, str2);
            throw new RuntimeException(str2);
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public void m2746a(int i, int i2) {
        this.f4380b = i;
        this.f4381c = i2;
        m2689o();
        Matrix.setIdentityM(this.f4378I, this.f4379J);
        Matrix.orthoM(this.f4382d, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
        m2689o();
        if (m2686r() == null) {
            this.f4383K = i;
            this.f4384L = i2;
            Matrix.translateM(this.f4378I, this.f4379J, 0.0f, i2, 0.0f);
            Matrix.scaleM(this.f4378I, this.f4379J, 1.0f, -1.0f, 1.0f);
            m2689o();
        }
        GLES20.glViewport(0, 0, this.f4380b, this.f4381c);
        m2697g();
    }

    /* renamed from: a */
    public void m2737a(int i, AbstractC0706q[] abstractC0706qArr) {
        m2689o();
        mo2756f();
        m2689o();
        m2747a(i);
        GLES20.glUniformMatrix4fv(abstractC0706qArr[5].f4432a, 1, false, this.f4382d, 0);
        m2689o();
    }

    /* renamed from: g */
    public void m2697g() {
        if (this.f4385M != 0) {
            m2737a(this.f4385M, this.f4391e);
        }
        if (this.f4386N != 0) {
            m2737a(this.f4386N, this.f4392f);
        }
        if (this.f4387O != 0) {
            m2737a(this.f4387O, this.f4393g);
        }
    }

    /* renamed from: a */
    public void m2721a(float[] fArr) {
        GLES20.glClearColor(fArr[1], fArr[2], fArr[3], fArr[0]);
        m2689o();
        GLES20.glClear(16384);
        m2689o();
    }

    /* renamed from: h */
    public float m2696h() {
        return 1.0f;
    }

    /* renamed from: a */
    public void m2751a(float f, float f2) {
        int i = this.f4379J;
        float[] fArr = this.f4378I;
        int i2 = i + 12;
        fArr[i2] = fArr[i2] + (fArr[i + 0] * f) + (fArr[i + 4] * f2);
        int i3 = i + 13;
        fArr[i3] = fArr[i3] + (fArr[i + 1] * f) + (fArr[i + 5] * f2);
        int i4 = i + 14;
        fArr[i4] = fArr[i4] + (fArr[i + 2] * f) + (fArr[i + 6] * f2);
        int i5 = i + 15;
        fArr[i5] = fArr[i5] + (fArr[i + 3] * f) + (fArr[i + 7] * f2);
    }

    /* renamed from: a */
    public void m2750a(float f, float f2, float f3) {
        Matrix.scaleM(this.f4378I, this.f4379J, f, f2, f3);
    }

    /* renamed from: a */
    public void m2752a(float f) {
        if (f == 0.0f) {
            return;
        }
        m2720a(this.f4378I, this.f4379J, f);
    }

    /* renamed from: a */
    public final void m2720a(float[] fArr, int i, float f) {
        float m2251h = C0758f.m2251h(f);
        float m2246i = C0758f.m2246i(f);
        if (f == 90.0f) {
            m2251h = 1.0f;
            m2246i = 0.0f;
        }
        float f2 = fArr[0 + i];
        float f3 = fArr[1 + i];
        float f4 = fArr[2 + i];
        float f5 = fArr[3 + i];
        float f6 = fArr[4 + i];
        float f7 = fArr[5 + i];
        float f8 = fArr[6 + i];
        float f9 = fArr[7 + i];
        float f10 = (f2 * m2246i) + (f6 * m2251h);
        float f11 = (f3 * m2246i) + (f7 * m2251h);
        float f12 = (f4 * m2246i) + (f8 * m2251h);
        float f13 = (f5 * m2246i) + (f9 * m2251h);
        int i2 = 0 + i;
        fArr[i2 + 0] = f10;
        fArr[i2 + 1] = f11;
        fArr[i2 + 2] = f12;
        fArr[i2 + 3] = f13;
        float f14 = (f2 * (-m2251h)) + (f6 * m2246i);
        float f15 = (f3 * (-m2251h)) + (f7 * m2246i);
        float f16 = (f4 * (-m2251h)) + (f8 * m2246i);
        float f17 = (f5 * (-m2251h)) + (f9 * m2246i);
        int i3 = 4 + i;
        fArr[i3 + 0] = f14;
        fArr[i3 + 1] = f15;
        fArr[i3 + 2] = f16;
        fArr[i3 + 3] = f17;
    }

    /* renamed from: i */
    public float[] m2695i() {
        float[] fArr = this.f4378I;
        int i = this.f4379J;
        float[] fArr2 = this.f4407k;
        for (int i2 = 0; i2 < 16; i2++) {
            fArr2[i2] = fArr[i + i2];
        }
        return fArr2;
    }

    /* renamed from: b */
    public void mo2763b() {
        if (1 != 0) {
            int i = this.f4379J;
            this.f4379J += 16;
            if (this.f4378I.length <= this.f4379J + 16) {
                this.f4378I = Arrays.copyOf(this.f4378I, this.f4378I.length * 2);
            }
            for (int i2 = 0; i2 < 16; i2++) {
                this.f4378I[this.f4379J + i2] = this.f4378I[i + i2];
            }
        }
        m2694j();
    }

    /* renamed from: c */
    public void mo2761c() {
        this.f4379J -= 16;
        if (this.f4379J < 0) {
            GameEngine.m1114g("restore: error mCurrentMatrixIndex: " + this.f4379J);
            this.f4379J = 0;
        }
        m2693k();
    }

    /* renamed from: j */
    public void m2694j() {
        C1101m c1101m = this.f4410n;
        this.f4409m++;
        if (this.f4409m >= c1101m.f6888a) {
            c1101m.add(new C0707r());
        }
        C0707r c0707r = (C0707r) c1101m.get(this.f4409m);
        this.f4408l.m2682a(c0707r);
        this.f4408l = c0707r;
    }

    /* renamed from: k */
    public void m2693k() {
        C1101m c1101m = this.f4410n;
        this.f4409m--;
        if (this.f4409m < 0) {
            GameEngine.m1114g("popTransformStack: error currentTransformIndex: " + this.f4409m);
            c1101m.set(0, new C0707r());
            this.f4409m = 0;
        }
        this.f4408l = (C0707r) c1101m.get(this.f4409m);
        m2722a(false);
    }

    /* renamed from: a */
    public void m2722a(boolean z) {
        RectF rectF = this.f4408l.f4434a;
        if (f4411o == rectF && !z) {
            return;
        }
        mo2757e();
        if (rectF != null) {
            GLES20.glEnable(3089);
            GLES20.glScissor((int) rectF.f234a, (int) (this.f4384L - rectF.f237d), (int) rectF.m6429b(), (int) rectF.m6425c());
        } else {
            GLES20.glDisable(3089);
        }
        f4411o = rectF;
    }

    /* renamed from: a */
    public void mo2773a(float f, float f2, float f3, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        m2726a(interfaceC0697h);
        m2744a(5, 0, 4, f, f2, 2.0f * f3, 2.0f * f3, c0711v.m2679a(), 0.0f);
    }

    /* renamed from: a */
    public void mo2774a(float f, float f2, float f3, float f4, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        m2726a(interfaceC0697h);
        m2743a(3, 4, 2, f, f2, f3 - f, f4 - f2, c0711v);
        this.f4395T++;
    }

    /* renamed from: a */
    private void m2743a(int i, int i2, int i3, float f, float f2, float f3, float f4, C0711v c0711v) {
        m2744a(i, i2, i3, f, f2, f3, f4, c0711v.m2679a(), c0711v.m2675b());
    }

    /* renamed from: a */
    private void m2744a(int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, float f5) {
        m2745a(i2, i4, f5);
        if (this.f4390R != null) {
            this.f4390R.m2754a(this.f4385M, this.f4389Q);
        }
        m2716a(this.f4391e, i, i3, f, f2, f3, f4, (InterfaceC0701l) null);
    }

    /* renamed from: a */
    public void m2747a(int i) {
        if (this.f4412p != i) {
            GLES20.glUseProgram(i);
            m2689o();
            this.f4414r = false;
            this.f4412p = i;
        }
    }

    /* renamed from: a */
    private void m2745a(int i, int i2, float f) {
        mo2756f();
        m2747a(this.f4385M);
        if (f > 0.0f) {
            GLES20.glLineWidth(f * this.f4378I[this.f4379J]);
            m2689o();
        } else {
            GLES20.glLineWidth(1.0f);
            m2689o();
        }
        float[] m2713b = m2713b(i2);
        m2708b(true);
        GLES20.glBlendColor(m2713b[0], m2713b[1], m2713b[2], m2713b[3]);
        m2689o();
        GLES20.glUniform4fv(this.f4391e[2].f4432a, 1, m2713b, 0);
        m2707b(this.f4391e, i);
        m2689o();
    }

    /* renamed from: b */
    float[] m2713b(int i) {
        float m2696h = ((i >>> 24) & 255) * 0.003921569f * m2696h();
        float f = ((i >>> 16) & 255) * 0.003921569f * m2696h;
        float f2 = ((i >>> 8) & 255) * 0.003921569f * m2696h;
        this.f4399X[0] = f;
        this.f4399X[1] = f2;
        this.f4399X[2] = (i & 255) * 0.003921569f * m2696h;
        this.f4399X[3] = m2696h;
        return this.f4399X;
    }

    /* renamed from: b */
    private void m2708b(boolean z) {
        if (z) {
            if (!this.f4413q) {
                GLES20.glEnable(3042);
                m2689o();
                this.f4413q = true;
            }
        } else if (this.f4413q) {
            GLES20.glDisable(3042);
            m2689o();
            this.f4413q = false;
        }
    }

    /* renamed from: l */
    public void m2692l() {
        m2709b((C0928ae) null);
        this.f4414r = false;
        this.f4412p = -1;
        this.f4420x = null;
        this.f4413q = false;
        m2688p();
        mo2756f();
    }

    /* renamed from: b */
    private void m2707b(AbstractC0706q[] abstractC0706qArr, int i) {
        if (!this.f4414r || this.f4415s != i) {
            GLES20.glBindBuffer(34962, this.f4388P);
            m2689o();
            GLES20.glVertexAttribPointer(abstractC0706qArr[0].f4432a, 2, 5126, false, 8, i * 8);
            m2689o();
            GLES20.glBindBuffer(34962, 0);
            m2689o();
            this.f4414r = true;
            this.f4415s = i;
        }
    }

    /* renamed from: a */
    private void m2716a(AbstractC0706q[] abstractC0706qArr, int i, int i2, float f, float f2, float f3, float f4, InterfaceC0701l interfaceC0701l) {
        m2718a(abstractC0706qArr, f, f2, f3, f4, interfaceC0701l);
        int i3 = abstractC0706qArr[0].f4432a;
        GLES20.glEnableVertexAttribArray(i3);
        m2689o();
        GLES20.glDrawArrays(i, 0, i2);
        m2689o();
        GLES20.glDisableVertexAttribArray(i3);
        m2689o();
    }

    /* renamed from: a */
    private void m2718a(AbstractC0706q[] abstractC0706qArr, float f, float f2, float f3, float f4, InterfaceC0701l interfaceC0701l) {
        if (interfaceC0701l != null) {
            GLES20.glUniformMatrix4fv(abstractC0706qArr[1].f4432a, 1, false, interfaceC0701l.m2755a(this.f4383K, this.f4384L, f, f2, f3, f4), 0);
            m2689o();
            return;
        }
        Matrix.translateM(this.f4398W, 0, this.f4378I, this.f4379J, f, f2, 0.0f);
        Matrix.scaleM(this.f4398W, 0, f3, f4, 1.0f);
        GLES20.glUniformMatrix4fv(abstractC0706qArr[1].f4432a, 1, false, this.f4398W, 0);
        m2689o();
    }

    /* renamed from: a */
    public void mo2768a(AbstractC0690b abstractC0690b, int i, int i2, int i3, int i4, InterfaceC0685af interfaceC0685af, InterfaceC0701l interfaceC0701l) {
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        m2740a(abstractC0690b.mo2669g(), interfaceC0685af);
        C0686ag.m2823a(abstractC0690b, this.f4400Y);
        this.f4401Z.m6434a(i, i2, i + i3, i2 + i4);
        abstractC0690b.mo2811a(this.f4400Y);
        abstractC0690b.mo2810a(this.f4400Y, this.f4401Z);
        m2728a(abstractC0690b, this.f4400Y, this.f4401Z, interfaceC0701l);
    }

    /* renamed from: a */
    public void m2725a(C0928ae c0928ae) {
        if (this.f4416t == c0928ae) {
            return;
        }
        if (c0928ae == null && this.f4416t != null && this.f4416t.mo1012a()) {
            if (this.f4416t.mo1010b()) {
                mo2757e();
                m2691m();
                return;
            }
            return;
        }
        m2709b(c0928ae);
    }

    /* renamed from: b */
    public void m2709b(C0928ae c0928ae) {
        if (this.f4416t == c0928ae) {
            return;
        }
        mo2756f();
        if (c0928ae != null) {
            if (c0928ae.f6353n == 0) {
                m2700d(c0928ae);
            }
            if (c0928ae.f6353n == 0) {
                this.f4416t = null;
                return;
            }
            this.f4405i.f4453j = (C0715z) c0928ae.f6356q;
        }
        if (c0928ae == null) {
            this.f4405i.f4453j = this.f4405i.f4452i;
        }
        this.f4416t = c0928ae;
    }

    /* renamed from: c */
    public void m2703c(C0928ae c0928ae) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : c0928ae.f6355p) {
            if (c0929af.f6360c || c0929af.f6362f != null) {
                c0929af.f6360c = false;
                if (c0929af.f6364b == -1) {
                    c0929af.f6364b = GLES20.glGetUniformLocation(c0928ae.f6353n, c0929af.f6359a);
                    if (c0929af.f6364b == -1 && !c0929af.f6361d) {
                        c0929af.f6361d = true;
                        c0928ae.m1060b("Unknown parameter: " + c0929af.f6359a);
                        return;
                    }
                }
                if (c0929af.f6362f != null) {
                    AbstractC0690b m2791a = this.f4406j.m2791a(c0929af.f6362f.mo398b(), c0929af.f6362f);
                    if (c0929af.f6363g) {
                        GLES20.glUniform2f(c0929af.f6364b, m2791a.f4350e, m2791a.f4351f);
                    } else {
                        int m2814a = m2791a.m2814a();
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, m2814a);
                        GLES20.glUniform1i(c0929af.f6364b, 1);
                        GLES20.glActiveTexture(33984);
                    }
                } else if (c0929af.f6365e.length == 1) {
                    GLES20.glUniform1f(c0929af.f6364b, c0929af.f6365e[0]);
                } else if (c0929af.f6365e.length == 2) {
                    GLES20.glUniform2f(c0929af.f6364b, c0929af.f6365e[0], c0929af.f6365e[1]);
                } else if (c0929af.f6365e.length == 4) {
                    GLES20.glUniform4f(c0929af.f6364b, c0929af.f6365e[0], c0929af.f6365e[1], c0929af.f6365e[2], c0929af.f6365e[3]);
                } else {
                    c0928ae.m1060b("Unhandled parameter size: " + c0929af.f6359a + " - " + c0929af.f6365e.length);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m2700d(C0928ae c0928ae) {
        if (c0928ae.f6354o != 0) {
            return false;
        }
        if (c0928ae.f6353n != 0 && !c0928ae.f6352m) {
            return true;
        }
        m2688p();
        c0928ae.f6352m = false;
        c0928ae.m1060b("== Compiling shader ==");
        C0715z c0715z = new C0715z();
        c0928ae.f6356q = c0715z;
        try {
            c0928ae.f6353n = m2715a(c0715z.f4467f, this.f4405i.f4451h.m2799a(), c0928ae.f6345f);
        } catch (RuntimeException e) {
            c0928ae.m1058c("Failed to compile shader: " + e.getMessage());
            e.printStackTrace();
            c0928ae.f6354o = 1;
        }
        if (c0928ae.f6354o != 0 && c0928ae.f6353n == 0) {
            c0928ae.m1058c("Shader program_handle == 0");
            c0928ae.f6354o = 1;
        }
        m2688p();
        return true;
    }

    /* renamed from: a */
    public void m2729a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, InterfaceC0685af interfaceC0685af, InterfaceC0701l interfaceC0701l) {
        if (rectF2.m6429b() <= 0.0f || rectF2.m6425c() <= 0.0f) {
            return;
        }
        m2740a(abstractC0690b.mo2669g(), interfaceC0685af);
        this.f4400Y.m6432a(rectF);
        this.f4401Z.m6432a(rectF2);
        abstractC0690b.mo2811a(this.f4400Y);
        abstractC0690b.mo2810a(this.f4400Y, this.f4401Z);
        m2728a(abstractC0690b, this.f4400Y, this.f4401Z, interfaceC0701l);
    }

    /* renamed from: a */
    private void m2728a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, InterfaceC0701l interfaceC0701l) {
        if (!this.f4404h) {
            m2708b(true);
            this.f4405i.m2662a(this.f4416t);
            this.f4404h = true;
        }
        this.f4405i.m2665a(this.f4417u);
        this.f4405i.m2663a(abstractC0690b, rectF, rectF2, m2695i());
    }

    /* renamed from: f */
    public void mo2756f() {
        if (this.f4404h) {
            this.f4405i.m2658d();
            this.f4404h = false;
        }
    }

    /* renamed from: e */
    public void mo2757e() {
        if (this.f4404h) {
            this.f4405i.m2659c();
        }
    }

    /* renamed from: m */
    public void m2691m() {
        this.f4405i.m2661b();
    }

    /* renamed from: a */
    public boolean mo2770a(AbstractC0690b abstractC0690b) {
        boolean m2802i = abstractC0690b.m2802i();
        if (m2802i) {
            m2705c(abstractC0690b.f4350e, abstractC0690b.f4351f);
            synchronized (this.f4394S) {
                this.f4394S.m2673a(abstractC0690b.m2814a());
            }
        }
        return m2802i;
    }

    /* renamed from: b */
    public static void m2712b(int i, int i2) {
        f4418v++;
        f4419w += i * i2 * 4;
    }

    /* renamed from: c */
    public static void m2705c(int i, int i2) {
        f4418v--;
        f4419w -= (i * i2) * 4;
    }

    /* renamed from: d */
    public void mo2759d() {
        m2727a((AbstractC0690b) this.f4397V.remove(this.f4397V.size() - 1), m2686r());
        mo2761c();
        m2692l();
    }

    /* renamed from: c */
    public void mo2760c(AbstractC0690b abstractC0690b) {
        mo2763b();
        AbstractC0690b m2686r = m2686r();
        this.f4397V.add(abstractC0690b);
        m2727a(m2686r, abstractC0690b);
    }

    /* renamed from: r */
    private AbstractC0690b m2686r() {
        return (AbstractC0690b) this.f4397V.get(this.f4397V.size() - 1);
    }

    /* renamed from: a */
    private void m2727a(AbstractC0690b abstractC0690b, AbstractC0690b abstractC0690b2) {
        mo2756f();
        if (abstractC0690b == null && abstractC0690b2 != null) {
            if (abstractC0690b2.mo2669g() == 3553) {
                GLES20.glGenFramebuffers(1, this.f4396U, 0);
                m2689o();
                GLES20.glBindFramebuffer(36160, this.f4396U[0]);
                m2689o();
            } else {
                GLES11Ext.glGenFramebuffersOES(1, this.f4396U, 0);
                m2689o();
                GLES11Ext.glBindFramebufferOES(36160, this.f4396U[0]);
                m2689o();
            }
        } else if (abstractC0690b != null && abstractC0690b2 == null) {
            if (abstractC0690b.mo2669g() == 3553) {
                GLES20.glBindFramebuffer(36160, 0);
                m2689o();
                GLES20.glDeleteFramebuffers(1, this.f4396U, 0);
                m2689o();
            } else {
                GLES11Ext.glBindFramebufferOES(36160, 0);
                m2689o();
                GLES11Ext.glDeleteFramebuffersOES(1, this.f4396U, 0);
                m2689o();
            }
        }
        if (abstractC0690b2 == null) {
            m2746a(this.f4383K, this.f4384L);
            return;
        }
        m2746a(abstractC0690b2.mo2807b(), abstractC0690b2.mo2806c());
        if (!abstractC0690b2.m2802i()) {
            abstractC0690b2.mo2671b(this);
        }
        if (abstractC0690b2.mo2669g() == 3553) {
            GLES20.glFramebufferTexture2D(36160, 36064, abstractC0690b2.mo2669g(), abstractC0690b2.m2814a(), 0);
            m2689o();
            m2685s();
            return;
        }
        GLES11Ext.glFramebufferTexture2DOES(36160, 36064, abstractC0690b2.mo2669g(), abstractC0690b2.m2814a(), 0);
        m2689o();
        m2684t();
    }

    /* renamed from: s */
    private static void m2685s() {
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    /* renamed from: t */
    private static void m2684t() {
        int glCheckFramebufferStatusOES = GLES11Ext.glCheckFramebufferStatusOES(36160);
        if (glCheckFramebufferStatusOES != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatusOES) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatusOES));
        }
    }

    /* renamed from: d */
    public void mo2758d(AbstractC0690b abstractC0690b) {
        int mo2669g = abstractC0690b.mo2669g();
        mo2762b(abstractC0690b);
        m2689o();
        GLES20.glTexParameteri(mo2669g, 10242, 33071);
        GLES20.glTexParameteri(mo2669g, 10243, 33071);
        int mo2668h = abstractC0690b.mo2668h();
        GLES20.glTexParameterf(mo2669g, 10241, mo2668h);
        GLES20.glTexParameterf(mo2669g, 10240, mo2668h);
    }

    /* renamed from: a */
    public void m2734a(AbstractC0690b abstractC0690b, int i) {
        if (abstractC0690b.mo2668h() != i && abstractC0690b.m2814a() != -1) {
            mo2762b(abstractC0690b);
            abstractC0690b.mo2672b(i);
        }
    }

    /* renamed from: b */
    public void mo2762b(AbstractC0690b abstractC0690b) {
        if (this.f4420x == abstractC0690b) {
        }
        mo2757e();
        GLES20.glBindTexture(abstractC0690b.mo2669g(), abstractC0690b.m2814a());
        this.f4420x = abstractC0690b;
    }

    /* renamed from: a */
    public void mo2769a(AbstractC0690b abstractC0690b, int i, int i2, int i3) {
        int mo2669g = abstractC0690b.mo2669g();
        mo2762b(abstractC0690b);
        m2689o();
        GLES20.glTexImage2D(mo2669g, 0, i3, abstractC0690b.m2805d(), abstractC0690b.m2804e(), 0, i, i2, null);
    }

    /* renamed from: a */
    public void mo2766a(AbstractC0690b abstractC0690b, Bitmap bitmap, int i) {
        int mo2669g = abstractC0690b.mo2669g();
        mo2762b(abstractC0690b);
        m2689o();
        if (i == 0) {
            GLUtils.texImage2D(mo2669g, 0, bitmap, 0);
        } else {
            GLUtils.texImage2D(mo2669g, 0, i, bitmap, 0);
        }
    }

    /* renamed from: a */
    public void mo2767a(AbstractC0690b abstractC0690b, int i, int i2, Bitmap bitmap, int i3, int i4) {
        int mo2669g = abstractC0690b.mo2669g();
        mo2762b(abstractC0690b);
        m2689o();
        GLUtils.texSubImage2D(mo2669g, 0, i, i2, bitmap, i3, i4);
    }

    /* renamed from: a */
    public static void m2723a(String str, Throwable th) {
        if (f4422z > 1000) {
            return;
        }
        f4422z++;
        if (th != null) {
            Log.m6348b(f4374E, str, th);
        } else {
            Log.m6345d(f4374E, str);
        }
    }

    /* renamed from: n */
    public static void m2690n() {
        int i;
        int i2 = 255;
        int glGetError = GLES20.glGetError();
        while (true) {
            i = glGetError;
            if (i == 0 || i2 <= 0) {
                break;
            }
            i2--;
            glGetError = GLES20.glGetError();
        }
        if (i != 0) {
            m2723a("clearGlError: Failed to clear", (Throwable) null);
        }
    }

    /* renamed from: o */
    public static void m2689o() {
        int glGetError;
        if (f4421y && (glGetError = GLES20.glGetError()) != 0) {
            m2723a("GL error: " + glGetError, new Throwable());
            m2690n();
        }
    }

    /* renamed from: p */
    public static void m2688p() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            m2723a("GL error: " + glGetError, new Throwable());
            m2690n();
        }
    }

    /* renamed from: a */
    public InterfaceC0710u mo2775a() {
        return f4403ab;
    }

    /* renamed from: a */
    public void mo2772a(int i, int i2, int i3, int i4) {
        float f = this.f4378I[this.f4379J];
        this.f4408l.f4434a = new RectF();
        this.f4408l.f4434a.f234a = i;
        this.f4408l.f4434a.f236c = i3;
        this.f4408l.f4434a.f235b = i2;
        this.f4408l.f4434a.f237d = i4;
        this.f4408l.f4434a.f234a *= f;
        this.f4408l.f4434a.f236c *= f;
        this.f4408l.f4434a.f235b *= f;
        this.f4408l.f4434a.f237d *= f;
        m2722a(false);
    }

    /* renamed from: a */
    private void m2726a(InterfaceC0697h interfaceC0697h) {
        if (interfaceC0697h == null) {
            throw new NullPointerException("draw shape filter is null.");
        }
        this.f4389Q = interfaceC0697h;
        if (this.f4377H.containsKey(interfaceC0697h)) {
            int i = this.f4385M;
            this.f4385M = ((Integer) this.f4377H.get(interfaceC0697h)).intValue();
            m2717a(this.f4391e, this.f4385M);
            if (i != this.f4385M) {
                m2737a(this.f4385M, this.f4391e);
                return;
            }
            return;
        }
        this.f4385M = m2715a(this.f4391e, interfaceC0697h.mo2781a(), interfaceC0697h.mo2780b());
        m2737a(this.f4385M, this.f4391e);
        this.f4377H.put(interfaceC0697h, Integer.valueOf(this.f4385M));
    }

    /* renamed from: a */
    private void m2740a(int i, InterfaceC0685af interfaceC0685af) {
        if (interfaceC0685af == null) {
            throw new NullPointerException("Texture filter is null.");
        }
    }

    /* renamed from: a */
    public int m2715a(AbstractC0706q[] abstractC0706qArr, String str, String str2) {
        return m2741a(m2711b(35633, str), m2711b(35632, str2), abstractC0706qArr, this.f4402aa);
    }

    /* renamed from: a */
    public C0705p m2738a(int i, boolean z, boolean z2) {
        GameEngine.PrintLog("Loading new font size:" + i + " bold:" + z + " unicode:" + z2);
        try {
            C0705p c0705p = new C0705p(this);
            c0705p.f4427a = i;
            c0705p.f4428b = z;
            Paint paint = new Paint();
            paint.m6474c(true);
            paint.mo6487a(true);
            if (!z) {
                paint.mo6497a(Typeface.m6413a(Typeface.f246c, 0));
            } else {
                paint.mo6497a(Typeface.m6413a(Typeface.f246c, 1));
            }
            c0705p.f4429c = new C0674b(null);
            c0705p.f4429c.m2862a(paint, i, 3, 2);
            c0705p.f4429c.m2856a(true);
            c0705p.f4429c.m2863a(12);
            this.f4423A.add(c0705p);
            return c0705p;
        } catch (OutOfMemoryError e) {
            GameEngine.m1189a(EnumC1065u.gameFont, e);
            C0705p c0705p2 = new C0705p(this);
            c0705p2.f4427a = i;
            c0705p2.f4428b = z;
            if (this.f4424B != null) {
                c0705p2.f4429c = this.f4424B.f4429c;
            }
            this.f4423A.add(c0705p2);
            return c0705p2;
        }
    }

    /* renamed from: a */
    public void mo2765a(String str, float f, float f2, Paint paint) {
        mo2756f();
        boolean z = false;
        Typeface m6463i = paint.m6463i();
        if (m6463i != null) {
            z = m6463i.m6415a();
        }
        int m6461k = (int) paint.m6461k();
        if (m6461k > 42) {
            m6461k = 42;
        }
        if (m6461k < 10) {
            m6461k = 10;
        }
        if (m6461k % 2 != 0) {
        }
        boolean m2238n = C0758f.m2238n(str);
        if (m2238n) {
            m6461k = 24;
        }
        if (this.f4424B == null) {
            this.f4424B = m2738a(24, false, true);
        }
        C0705p c0705p = null;
        Iterator it = this.f4423A.iterator();
        while (it.hasNext()) {
            C0705p c0705p2 = (C0705p) it.next();
            if (c0705p2.f4427a == m6461k && c0705p2.f4428b == z) {
                c0705p = c0705p2;
            }
        }
        if (c0705p == null) {
            c0705p = m2738a(m6461k, z, m2238n);
        }
        if (c0705p.f4429c == null) {
            m2723a("font.glText==null", (Throwable) null);
            return;
        }
        C0674b c0674b = c0705p.f4429c;
        m2688p();
        int m6469e = paint.m6469e();
        float m6523a = Color.m6523a(m6469e) * 0.003921569f;
        float m6519b = Color.m6519b(m6469e) * 0.003921569f * m6523a;
        float m6518c = Color.m6518c(m6469e) * 0.003921569f * m6523a;
        float m6517d = Color.m6517d(m6469e) * 0.003921569f * m6523a;
        float m6461k2 = paint.m6461k();
        if (m6461k2 != c0705p.f4427a) {
        }
        c0674b.m2864a(m6519b, m6518c, m6517d, m6523a, this.f4382d);
        c0674b.m2866a(m6461k2 / c0705p.f4427a);
        m2688p();
        if (paint.m6462j() == Paint.Align.CENTER) {
            c0674b.m2860a(str, f - ((int) (c0674b.m2861a(str) * 0.5f)), this.f4381c - f2);
        } else {
            c0674b.m2859a(str, f, this.f4381c - f2, 0.0f);
        }
        m2688p();
        c0674b.m2850d();
        m2692l();
    }

    /* renamed from: a */
    public void mo2764a(float[] fArr, int i, int i2, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        if (this.f4426D == null || this.f4426D.capacity() < i2 * 4) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 4) + 10);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f4426D = allocateDirect.asFloatBuffer();
        }
        this.f4426D.clear();
        this.f4426D.put(fArr, i, i2);
        this.f4426D.flip();
        this.f4426D.position(0);
        float m2675b = c0711v.m2675b();
        int m2679a = c0711v.m2679a();
        if (m2675b == 0.0f) {
            m2675b = 1.0f;
        }
        m2726a(interfaceC0697h);
        m2745a(0, m2679a, m2675b);
        if (this.f4390R != null) {
            this.f4390R.m2754a(this.f4385M, this.f4389Q);
        }
        AbstractC0706q[] abstractC0706qArr = this.f4391e;
        int i3 = abstractC0706qArr[0].f4432a;
        GLES20.glEnableVertexAttribArray(i3);
        m2689o();
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) this.f4426D);
        m2718a(abstractC0706qArr, 0.0f, 0.0f, 1.0f, 1.0f, (InterfaceC0701l) null);
        GLES20.glDrawArrays(0, 0, i2 / 2);
        m2689o();
        GLES20.glDisableVertexAttribArray(i3);
        m2689o();
    }

    /* renamed from: a */
    public void mo2771a(Bitmap bitmap) {
        if (this.f4373a != null) {
            this.f4373a.m2825b(bitmap);
        }
    }
}

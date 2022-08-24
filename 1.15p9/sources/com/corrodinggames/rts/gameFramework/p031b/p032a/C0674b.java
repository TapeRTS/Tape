package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0673b;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.C0672a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/b.class */
public class C0674b {

    /* renamed from: a */
    AssetManager f4241a;

    /* renamed from: b */
    C0676d f4242b;

    /* renamed from: c */
    int f4243c;

    /* renamed from: d */
    int f4244d;

    /* renamed from: e */
    float f4245e;

    /* renamed from: f */
    float f4246f;

    /* renamed from: g */
    float f4247g;

    /* renamed from: h */
    float f4248h;

    /* renamed from: i */
    float f4249i;

    /* renamed from: j */
    int f4250j;

    /* renamed from: k */
    int f4251k;

    /* renamed from: l */
    int f4252l;

    /* renamed from: m */
    int f4253m;

    /* renamed from: n */
    float f4254n;

    /* renamed from: o */
    float f4255o;

    /* renamed from: p */
    float f4256p;

    /* renamed from: q */
    boolean f4257q;

    /* renamed from: x */
    private AbstractC0673b f4258x;

    /* renamed from: y */
    private int f4259y;

    /* renamed from: z */
    private int f4260z;

    /* renamed from: r */
    public Paint f4261r;

    /* renamed from: s */
    public ArrayList f4262s;

    /* renamed from: t */
    C0675c[][] f4263t;

    /* renamed from: u */
    boolean f4264u;

    /* renamed from: v */
    int f4265v;

    /* renamed from: w */
    public static boolean f4266w = true;

    /* renamed from: a */
    public C0675c m2868a(char c) {
        C0675c m2854b = m2854b(c);
        if (m2854b == null && this.f4264u) {
            m2853b("Loading glyph:" + c);
            m2851c(c);
            m2869a();
        }
        return m2854b;
    }

    /* renamed from: b */
    public C0675c m2854b(char c) {
        C0675c[] c0675cArr;
        if (c <= 65535 && (c0675cArr = this.f4263t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU]) != null) {
            return c0675cArr[c & 255];
        }
        return null;
    }

    /* renamed from: a */
    public void m2867a(char c, C0675c c0675c) {
        C0675c[] c0675cArr = this.f4263t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        if (c0675cArr == null) {
            c0675cArr = new C0675c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_MEDIA_CONTEXT_MENU];
            this.f4263t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU] = c0675cArr;
        }
        c0675cArr[c & 255] = c0675c;
    }

    /* renamed from: c */
    public void m2851c(char c) {
        if (c > 65535) {
            return;
        }
        if (this.f4262s.size() == 0) {
            m2855b();
        }
        if (!((C0677e) this.f4262s.get(this.f4262s.size() - 1)).m2845a()) {
            if (this.f4262s.size() < this.f4265v) {
                m2855b();
            } else {
                return;
            }
        }
        m2867a(c, ((C0677e) this.f4262s.get(this.f4262s.size() - 1)).m2844a(c, this.f4261r));
    }

    /* renamed from: a */
    public void m2869a() {
        if (this.f4262s.size() > 0) {
            ((C0677e) this.f4262s.get(this.f4262s.size() - 1)).m2841c();
        }
    }

    /* renamed from: b */
    public void m2855b() {
        m2869a();
        this.f4262s.add(new C0677e(512, this.f4262s.size(), this.f4250j, this.f4251k, this.f4243c, this.f4244d));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.corrodinggames.rts.gameFramework.b.a.c[], com.corrodinggames.rts.gameFramework.b.a.c[][]] */
    public C0674b(AbstractC0673b abstractC0673b, AssetManager assetManager) {
        this.f4257q = true;
        this.f4262s = new ArrayList();
        this.f4263t = new C0675c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        this.f4265v = Integer.MAX_VALUE;
        if (abstractC0673b == null) {
            abstractC0673b = new C0672a();
            abstractC0673b.mo2872a();
        }
        this.f4241a = assetManager;
        this.f4242b = new C0676d(24, abstractC0673b, this);
        this.f4243c = 0;
        this.f4244d = 0;
        this.f4245e = 0.0f;
        this.f4246f = 0.0f;
        this.f4247g = 0.0f;
        this.f4248h = 0.0f;
        this.f4249i = 0.0f;
        this.f4250j = 0;
        this.f4251k = 0;
        this.f4252l = 0;
        this.f4253m = 0;
        this.f4254n = 1.0f;
        this.f4255o = 1.0f;
        this.f4256p = 0.0f;
        this.f4258x = abstractC0673b;
        this.f4259y = GLES20.glGetUniformLocation(this.f4258x.m2870b(), "u_Color");
        this.f4260z = GLES20.glGetUniformLocation(this.f4258x.m2870b(), "u_Texture");
    }

    /* renamed from: a */
    public void m2856a(boolean z) {
        this.f4264u = z;
    }

    /* renamed from: a */
    public void m2863a(int i) {
        this.f4265v = i;
    }

    public C0674b(AssetManager assetManager) {
        this(null, assetManager);
    }

    /* renamed from: a */
    public boolean m2862a(Paint paint, int i, int i2, int i3) {
        if (this.f4261r != null) {
            throw new RuntimeException("Already loaded");
        }
        this.f4243c = i2;
        this.f4244d = i3;
        this.f4261r = paint;
        this.f4261r.mo6487a(true);
        this.f4261r.mo6482b(i);
        this.f4261r.m6481b(-1);
        Paint.FontMetrics m6458n = this.f4261r.m6458n();
        this.f4245e = (float) Math.ceil(Math.abs(m6458n.f208d) + Math.abs(m6458n.f205a));
        this.f4246f = (float) Math.ceil(Math.abs(m6458n.f206b));
        this.f4247g = (float) Math.ceil(Math.abs(m6458n.f207c));
        char[] cArr = new char[2];
        this.f4249i = 0.0f;
        this.f4248h = 0.0f;
        float[] fArr = new float[2];
        int i4 = 0;
        char c = ' ';
        while (true) {
            char c2 = c;
            if (c2 > '~') {
                break;
            }
            cArr[0] = c2;
            paint.m6484a(cArr, 0, 1, fArr);
            float f = fArr[0];
            if (f > this.f4248h) {
                this.f4248h = f;
            }
            i4++;
            c = (char) (c2 + 1);
        }
        this.f4249i = this.f4245e;
        this.f4250j = ((int) this.f4248h) + (2 * this.f4243c);
        this.f4251k = ((int) this.f4249i) + (2 * this.f4244d);
        char c3 = ' ';
        while (true) {
            char c4 = c3;
            if (c4 <= '~') {
                m2851c(c4);
                c3 = (char) (c4 + 1);
            } else {
                m2869a();
                return true;
            }
        }
    }

    /* renamed from: a */
    public void m2864a(float f, float f2, float f3, float f4, float[] fArr) {
        m2865a(f, f2, f3, f4);
        this.f4242b.m2846a(fArr);
    }

    /* renamed from: c */
    public static void m2852c() {
        int glGetError;
        if (f4266w && (glGetError = GLES20.glGetError()) != 0) {
            Log.m6348b("GLTEXT", "GL error: " + glGetError, new Throwable());
        }
    }

    /* renamed from: a */
    void m2865a(float f, float f2, float f3, float f4) {
        GLES20.glUseProgram(this.f4258x.m2870b());
        GLES20.glUniform4fv(this.f4259y, 1, new float[]{f, f2, f3, f4}, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.f4260z, 0);
        m2852c();
    }

    /* renamed from: d */
    public void m2850d() {
        this.f4242b.m2849a();
    }

    /* renamed from: a */
    public void m2857a(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f4251k * this.f4255o;
        float f8 = this.f4250j * this.f4254n;
        int length = str.length();
        float f9 = (f8 / 2.0f) - (this.f4243c * this.f4254n);
        float f10 = ((f7 / 2.0f) - (this.f4244d * this.f4255o)) - (this.f4247g * this.f4255o);
        if (this.f4257q) {
            f9 = (int) f9;
            f10 = (int) f10;
        }
        float f11 = f + f9;
        float f12 = f2 + f10;
        boolean z = false;
        if (f3 == 0.0f && f6 == 0.0f && f4 == 0.0f && f5 == 0.0f) {
            z = true;
        } else {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, f11, f12, f3);
            if (f6 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
                Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
                Matrix.rotateM(fArr, 0, f4, 1.0f, 0.0f, 0.0f);
                Matrix.rotateM(fArr, 0, f5, 0.0f, 1.0f, 0.0f);
            }
        }
        float f13 = 0.0f;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = charAt - ' ';
            if (i2 < 0 || i2 >= 96) {
            }
            float f14 = f13;
            float f15 = 0.0f;
            if (z) {
                f14 += f11;
                f15 = 0.0f + f12;
            }
            C0675c m2868a = m2868a(charAt);
            if (m2868a != null) {
                this.f4242b.m2848a(f14, f15, f8, f7, m2868a);
                float f16 = (m2868a.f4269c + this.f4256p) * this.f4254n;
                if (this.f4257q) {
                    f16 = (int) (f16 + 0.95f);
                }
                f13 += f16;
            }
        }
    }

    /* renamed from: a */
    public void m2858a(String str, float f, float f2, float f3, float f4) {
        m2857a(str, f, f2, f3, 0.0f, 0.0f, f4);
    }

    /* renamed from: a */
    public void m2859a(String str, float f, float f2, float f3) {
        m2858a(str, f, f2, 0.0f, f3);
    }

    /* renamed from: a */
    public void m2860a(String str, float f, float f2) {
        m2858a(str, f, f2, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m2866a(float f) {
        this.f4255o = f;
        this.f4254n = f;
    }

    /* renamed from: a */
    public float m2861a(String str) {
        float f = 0.0f;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            C0675c m2854b = m2854b(str.charAt(i));
            if (m2854b != null) {
                f += m2854b.f4269c * this.f4254n;
            }
        }
        return f + (length > 1 ? (length - 1) * this.f4256p * this.f4254n : 0.0f);
    }

    /* renamed from: b */
    public static void m2853b(String str) {
        Log.m6349b("GLTEXT", "debug:" + str);
    }
}

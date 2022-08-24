package com.corrodinggames.rts.gameFramework.p035d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;

/* renamed from: com.corrodinggames.rts.gameFramework.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
public final class C0743c {

    /* renamed from: h */
    public static boolean f4678h;

    /* renamed from: i */
    public int f4679i;

    /* renamed from: j */
    public int f4680j;

    /* renamed from: k */
    public static C0928ae f4681k;

    /* renamed from: l */
    public BitmapOrTexture f4682l;

    /* renamed from: m */
    public BitmapOrTexture f4683m;

    /* renamed from: s */
    public static C0747g[] f4684s;

    /* renamed from: f */
    public static C0745e[] f4685f = new C0745e[0];

    /* renamed from: g */
    public static int f4686g = 0;

    /* renamed from: n */
    public static final RectF f4687n = new RectF();

    /* renamed from: o */
    public static final Rect f4688o = new Rect();

    /* renamed from: p */
    public static final Rect f4689p = new Rect();

    /* renamed from: q */
    public static final Paint f4690q = new Paint();

    /* renamed from: r */
    public static final Paint f4691r = new Paint();

    /* renamed from: a */
    public int f4692a = 0;

    /* renamed from: b */
    public int f4693b = 80;

    /* renamed from: c */
    public int f4694c = 100;

    /* renamed from: d */
    public int f4695d = 110;

    /* renamed from: e */
    public int f4696e = 120;

    /* renamed from: t */
    EnumC0748h f4697t = null;

    /* renamed from: u */
    boolean f4698u = false;

    /* renamed from: v */
    boolean f4699v = false;

    /* renamed from: w */
    public final Paint f4700w = new Paint();

    /* renamed from: x */
    float f4701x = 0.0f;

    /* renamed from: a */
    public C0745e m2550a(EnumC0748h enumC0748h) {
        int i = 0;
        int m1151b = GameEngine.getInstance().m1151b();
        if (m1151b < 13) {
            i = -this.f4680j;
        } else if (m1151b < 28) {
            i = -this.f4679i;
        }
        int i2 = this.f4692a;
        if (enumC0748h == EnumC0748h.f4826a && i2 > this.f4693b + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4827b && i2 > this.f4694c + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4828c && i2 > this.f4695d + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4829d && i2 > this.f4696e + i) {
            return null;
        }
        C0745e m2545a = m2545a(true, (EnumC0748h) null);
        if (m2545a == null && (enumC0748h == EnumC0748h.f4830e || enumC0748h == EnumC0748h.f4829d)) {
            m2545a = m2545a(false, EnumC0748h.f4828c);
        }
        if (m2545a != null) {
            if (!m2545a.f4718p) {
                m2545a.f4718p = true;
                this.f4692a++;
            }
            return m2545a;
        }
        return null;
    }

    /* renamed from: a */
    private C0745e m2545a(boolean z, EnumC0748h enumC0748h) {
        C0745e[] c0745eArr = f4685f;
        int length = c0745eArr.length;
        if (z && enumC0748h == null) {
            for (int i = 0; i < length; i++) {
                C0745e c0745e = c0745eArr[i];
                if (!c0745e.f4718p) {
                    if (f4686g == i) {
                        f4686g++;
                    }
                    return c0745e;
                }
            }
            return null;
        }
        for (C0745e c0745e2 : c0745eArr) {
            if ((!z || !c0745e2.f4718p) && (enumC0748h == null || c0745e2.f4780r.m2503a(enumC0748h))) {
                return c0745e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2563a(float f, float f2, float f3) {
        m2561a(f, f2, f3, 0.0f, 20.0f);
    }

    /* renamed from: a */
    public void m2561a(float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 7; i++) {
            C0745e m2542b = m2542b(f + CommonUtils.rnd(-20.0f, 20.0f), f2 + CommonUtils.rnd(-20.0f, 20.0f), f3);
            if (m2542b != null) {
                m2542b.f4744V = f4 + CommonUtils.rnd(0.0f, f5);
                m2542b.f4758aj = CommonUtils.rnd(0.3f, 0.6f);
            }
        }
    }

    /* renamed from: a */
    public float m2564a(float f, float f2) {
        return CommonUtils.rnd(f, f2);
    }

    /* renamed from: b */
    public C0745e m2542b(float f, float f2, float f3) {
        m2566a();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4763aq = 1;
            m2537b.f4753ae = true;
            m2537b.f4759ak = 0.0f;
            m2537b.f4758aj = 0.5f;
            m2537b.f4755ag = 12;
            m2537b.f4762ap = 0;
            m2537b.f4745W = 35.0f;
            m2537b.f4746X = m2537b.f4745W - 10.0f;
            m2537b.f4720s = true;
            m2537b.f4728F = 0.7f;
            m2537b.f4747Y = m2564a(-180.0f, 180.0f);
            float m2564a = m2564a(0.8f, 1.0f);
            m2537b.f4730H = m2564a;
            m2537b.f4729G = m2564a;
        }
        return m2537b;
    }

    /* renamed from: c */
    public C0745e m2535c(float f, float f2, float f3) {
        m2566a();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4763aq = 13;
            m2537b.f4753ae = true;
            m2537b.f4759ak = 3.0f;
            m2537b.f4758aj = 0.5f;
            m2537b.f4755ag = 7;
            m2537b.f4762ap = 0;
            m2537b.f4745W = 35.0f;
            m2537b.f4746X = m2537b.f4745W - 10.0f;
            m2537b.f4720s = true;
            m2537b.f4728F = 1.0f;
            m2537b.f4730H = 0.5f;
            m2537b.f4729G = 0.5f;
        }
        return m2537b;
    }

    /* renamed from: a */
    public C0745e m2560a(float f, float f2, float f3, float f4, float f5, float f6) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.f6104bL.m6650a(f, f2, gameEngine.f6093bs) && !gameEngine.f6104bL.m6650a(f4, f5, gameEngine.f6093bs)) {
            return null;
        }
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, true, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4784an = false;
            m2537b.f4745W = 5.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = true;
            m2537b.f4728F = 1.0f;
            m2537b.f4735M = true;
            m2537b.f4736N = f4;
            m2537b.f4737O = f5;
            m2537b.f4738P = f6;
        }
        return m2537b;
    }

    /* renamed from: a */
    public C0745e m2562a(float f, float f2, float f3, float f4) {
        return m2559a(f, f2, f3, f4, 0);
    }

    /* renamed from: a */
    public C0745e m2559a(float f, float f2, float f3, float f4, int i) {
        return m2558a(f, f2, f3, f4, i, 0);
    }

    /* renamed from: b */
    public C0745e m2539b(float f, float f2, float f3, float f4, int i) {
        return m2558a(f, f2, f3, f4, i, 1);
    }

    /* renamed from: a */
    public C0745e m2558a(float f, float f2, float f3, float f4, int i, int i2) {
        m2566a();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4716g = C0745e.f4769j;
            m2537b.f4753ae = true;
            if (i2 == 1) {
                m2537b.f4763aq = 3;
                m2537b.f4759ak = 1.0f;
                m2537b.f4758aj = 0.4f;
                m2537b.f4755ag = 4;
            } else {
                m2537b.f4763aq = 3;
                m2537b.f4759ak = 0.0f;
                m2537b.f4758aj = 0.5f;
                m2537b.f4755ag = 3;
            }
            m2537b.f4747Y = f4;
            m2537b.f4762ap = 0;
            m2537b.f4745W = 20.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = false;
            if (i != 0) {
                m2537b.f4783C = new LightingColorFilter(i, 0);
            }
        }
        return m2537b;
    }

    /* renamed from: c */
    public C0745e m2534c(float f, float f2, float f3, float f4, int i) {
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4826a);
        if (m2537b != null) {
            m2537b.f4763aq = 4;
            m2537b.f4716g = C0745e.f4768i;
            m2537b.f4762ap = CommonUtils.m2360a(0, 2);
            m2537b.f4747Y = f4;
            m2537b.f4784an = true;
            m2537b.f4739Q = CommonUtils.m2249i(f4) * 0.15f;
            m2537b.f4740R = CommonUtils.sin(f4) * 0.15f;
            m2537b.f4745W = 30.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = true;
            m2537b.f4786ar = (short) 1;
            m2537b.f4730H = 0.8f;
            m2537b.f4729G = 2.3f;
            if (i != 0) {
                m2537b.f4783C = new LightingColorFilter(i, 0);
            }
        }
        return m2537b;
    }

    /* renamed from: a */
    public static void m2551a(C0745e c0745e, AbstractC1120w abstractC1120w) {
        if (c0745e == null) {
            return;
        }
        c0745e.f4713b = abstractC1120w;
        c0745e.f4732J -= abstractC1120w.f6951ek;
        c0745e.f4733K -= abstractC1120w.f6952el;
        c0745e.f4734L -= abstractC1120w.height;
    }

    /* renamed from: a */
    public C0745e m2549a(AbstractC1120w abstractC1120w, int i) {
        return m2548a(abstractC1120w, i, 0.5f);
    }

    /* renamed from: a */
    public C0745e m2548a(AbstractC1120w abstractC1120w, int i, float f) {
        m2544b();
        C0745e m2538b = m2538b(abstractC1120w.f6951ek, abstractC1120w.f6952el, abstractC1120w.height, i);
        if (m2538b != null) {
            m2538b.f4732J = 0.0f;
            m2538b.f4733K = 0.0f;
            m2538b.f4734L = 0.0f;
            m2538b.f4745W = 400.0f;
            m2538b.f4746X = m2538b.f4745W;
            m2538b.f4728F = 0.3f;
            m2538b.f4730H = f;
            m2538b.f4713b = abstractC1120w;
        }
        return m2538b;
    }

    /* renamed from: a */
    public C0745e emitLight(float f, float f2, float f3, int i) {
        if (this.f4697t == null && !this.f4699v) {
            m2566a();
        }
        return m2538b(f, f2, f3, i);
    }

    /* renamed from: b */
    public C0745e m2538b(float f, float f2, float f3, int i) {
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, true, EnumC0748h.f4827b);
        if (m2537b != null) {
            m2537b.f4778e = false;
            m2537b.f4716g = C0745e.f4767h;
            m2537b.f4763aq = 2;
            m2537b.f4745W = 10.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = true;
            m2537b.f4728F = 0.5f;
            m2537b.f4786ar = (short) 2;
            m2537b.f4715d = true;
            if (i != 0) {
                m2537b.f4783C = new LightingColorFilter(i, 0);
            }
        }
        return m2537b;
    }

    /* renamed from: b */
    public C0745e m2541b(float f, float f2, float f3, float f4) {
        m2566a();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
        if (m2537b != null) {
            m2537b.f4716g = C0745e.f4771l;
            m2537b.f4763aq = 0;
            m2537b.f4762ap = 13;
            m2537b.f4786ar = (short) 1;
            m2537b.f4720s = true;
            m2537b.f4728F = 0.8f;
            m2537b.f4746X = 80.0f;
            m2537b.f4745W = m2537b.f4746X;
            m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
            m2537b.f4730H = CommonUtils.rnd(0.6f, 0.8f);
            m2537b.f4729G = 1.5f;
            m2537b.f4739Q = (CommonUtils.m2249i(f4) * 0.13f * CommonUtils.rnd(1.0f, 1.5f)) + CommonUtils.rnd(-0.01f, 0.01f);
            m2537b.f4740R = (CommonUtils.sin(f4) * 0.13f * CommonUtils.rnd(1.0f, 1.5f)) + CommonUtils.rnd(-0.01f, 0.01f);
        }
        return m2537b;
    }

    /* renamed from: a */
    public C0745e m2556a(float f, float f2, float f3, int i, float f4, float f5) {
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4716g = C0745e.f4771l;
            m2537b.f4763aq = 6;
            m2537b.f4745W = 120.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = true;
            m2537b.f4730H = 0.2f;
            m2537b.f4729G = 0.9f;
            m2537b.f4786ar = (short) 1;
            m2537b.f4728F = 0.5f;
            m2537b.f4739Q = f4;
            m2537b.f4740R = f5;
            if (i != 0) {
                i = Color.argb(255, 0, 0, 200);
            }
            if (i != 0) {
                m2537b.f4783C = new LightingColorFilter(i, 0);
            }
        }
        return m2537b;
    }

    /* renamed from: a */
    public void m2555a(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        m2556a(f, f2, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f7 = f6 + i2;
            C0745e m2541b = m2541b(f + (CommonUtils.m2249i(f7) * (-5.0f)), f2 + (CommonUtils.sin(f7) * (-5.0f)), 0.0f, f7);
            if (m2541b != null) {
                m2541b.f4786ar = (short) 2;
                m2541b.f4721t = true;
                m2541b.f4722u = 7.0f;
            }
        }
    }

    /* renamed from: c */
    public C0745e m2533c(float f, float f2, float f3, int i) {
        C0745e m2531d = m2531d(f, f2, f3, i);
        if (m2531d != null) {
            m2531d.f4763aq = 11;
        }
        return m2531d;
    }

    /* renamed from: d */
    public C0745e m2531d(float f, float f2, float f3, int i) {
        m2566a();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4763aq = 6;
            m2537b.f4745W = 30.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = true;
            m2537b.f4730H = 0.2f;
            m2537b.f4729G = 1.3f;
            m2537b.f4786ar = (short) 1;
            if (i != 0) {
                m2537b.f4783C = new LightingColorFilter(i, 0);
            }
        }
        return m2537b;
    }

    /* renamed from: d */
    public C0745e m2532d(float f, float f2, float f3) {
        C0745e m2540b = m2540b(f, f2, f3, 0.3f, 0.7f);
        if (m2540b != null) {
            m2540b.f4763aq = 14;
            m2540b.f4762ap = CommonUtils.m2360a(0, 5);
            m2540b.f4781x = 0.5f;
        }
        return m2540b;
    }

    /* renamed from: e */
    public C0745e m2530e(float f, float f2, float f3) {
        C0745e m2540b = m2540b(f, f2, f3, 1.0f, 1.0f);
        if (m2540b != null) {
        }
        return m2540b;
    }

    /* renamed from: b */
    public C0745e m2540b(float f, float f2, float f3, float f4, float f5) {
        m2544b();
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4828c);
        if (m2537b != null) {
            m2537b.f4716g = C0745e.f4772m;
            m2537b.f4763aq = 12;
            m2537b.f4762ap = CommonUtils.m2360a(0, 7);
            m2537b.f4745W = CommonUtils.rnd(400.0f, 800.0f);
            m2537b.f4746X = m2537b.f4745W - 150.0f;
            m2537b.f4720s = true;
            float rnd = CommonUtils.rnd(0.6f, 1.0f);
            m2537b.f4730H = rnd;
            m2537b.f4729G = rnd;
            m2537b.f4786ar = (short) 2;
            m2537b.f4724w = true;
            m2537b.f4787as = true;
            float rnd2 = CommonUtils.rnd(-180.0f, 180.0f);
            float rnd3 = CommonUtils.rnd(0.4f, 1.2f) * f4;
            m2537b.f4739Q = CommonUtils.m2249i(rnd2) * rnd3;
            m2537b.f4740R = CommonUtils.sin(rnd2) * rnd3;
            m2537b.f4741S = CommonUtils.rnd(0.6f, 2.7f) * f5;
            m2537b.f4747Y = CommonUtils.rnd(-180.0f, 180.0f);
            m2537b.f4734L += 1.0f;
        }
        return m2537b;
    }

    /* renamed from: f */
    public C0745e m2529f(float f, float f2, float f3) {
        C0745e m2537b = m2537b(f, f2, f3, EnumC0744d.f4702a, false, EnumC0748h.f4827b);
        if (m2537b != null) {
            m2537b.f4763aq = 8;
            m2537b.f4745W = 480.0f;
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4720s = false;
            m2537b.f4786ar = (short) 1;
            m2537b.f4753ae = true;
            m2537b.f4759ak = 0.0f;
            m2537b.f4730H = 0.5f;
            m2537b.f4730H = 1.0f;
            int m2360a = CommonUtils.m2360a(0, 100);
            if (m2360a > 80) {
                m2537b.f4758aj = CommonUtils.rnd(0.1f, 0.15f);
                m2537b.f4755ag = 15;
            } else if (m2360a > 60) {
                m2537b.f4758aj = CommonUtils.rnd(0.06f, 0.16f);
                m2537b.f4756ah = true;
                m2537b.f4755ag = 6;
                m2537b.f4720s = true;
            } else {
                m2537b.f4758aj = CommonUtils.rnd(0.06f, 0.16f);
                m2537b.f4756ah = true;
                m2537b.f4755ag = 3;
                m2537b.f4720s = true;
            }
        }
        return m2537b;
    }

    /* renamed from: b */
    public void m2536b(EnumC0748h enumC0748h) {
        this.f4697t = enumC0748h;
    }

    /* renamed from: a */
    public void m2566a() {
        this.f4698u = true;
    }

    /* renamed from: b */
    public void m2544b() {
        this.f4699v = true;
    }

    /* renamed from: a */
    public C0745e m2554a(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        C0745e m2537b = m2537b(f, f2, f3, enumC0744d, z, enumC0748h);
        if (m2537b != null) {
            m2537b.f4719q = true;
        }
        return m2537b;
    }

    /* renamed from: b */
    public C0745e m2537b(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f4697t != null) {
            enumC0748h = this.f4697t;
            this.f4697t = null;
        }
        boolean z2 = this.f4699v;
        this.f4699v = false;
        if (this.f4698u) {
            this.f4698u = false;
            if (!gameEngine.f6246cO.m7189b(f, f2)) {
                return null;
            }
        }
        if (!z && gameEngine.f6104bL != null && !gameEngine.f6104bL.m6650a(f, f2, gameEngine.f6093bs)) {
            return null;
        }
        if (gameEngine.f6245cN.m7189b(f, f2)) {
            if (enumC0748h == EnumC0748h.f4826a) {
                enumC0748h = EnumC0748h.f4827b;
            } else if (enumC0748h == EnumC0748h.f4827b) {
                enumC0748h = EnumC0748h.f4828c;
            } else if (enumC0748h == EnumC0748h.f4828c) {
                enumC0748h = EnumC0748h.f4829d;
            }
        } else if (z2 || gameEngine.f6246cO.m7189b(f, f2)) {
        }
        C0745e m2550a = m2550a(enumC0748h);
        if (m2550a == null) {
            return null;
        }
        m2550a.m2521c();
        m2550a.f4780r = enumC0748h;
        m2550a.f4763aq = 0;
        m2550a.f4784an = true;
        m2550a.f4732J = f;
        m2550a.f4733K = f2;
        m2550a.f4734L = f3;
        m2550a.f4728F = 1.0f;
        if (enumC0744d == EnumC0744d.f4705d || enumC0744d == EnumC0744d.f4706e || enumC0744d == EnumC0744d.f4707f) {
            m2550a.f4762ap = 7;
            m2550a.f4745W = 12.0f;
            m2550a.f4720s = true;
            m2550a.f4740R = -0.3f;
            m2550a.f4728F = 0.7f;
            if (enumC0744d == EnumC0744d.f4707f) {
                m2550a.f4762ap = 3;
                m2550a.f4740R = -0.7f;
                m2550a.f4745W = 24.0f;
                m2550a.f4728F = 0.7f;
            }
            if (enumC0744d == EnumC0744d.f4706e) {
                m2550a.f4762ap = 4;
                m2550a.f4745W = 15.0f;
                m2550a.f4728F = 0.4f;
            }
        }
        if (enumC0744d == EnumC0744d.f4704c) {
            m2550a.f4762ap = 1;
            m2550a.f4745W = 25.0f;
            m2550a.f4720s = true;
        }
        if (enumC0744d == EnumC0744d.f4708g) {
            m2550a.f4762ap = 5;
            m2550a.f4745W = 42.0f;
            m2550a.f4720s = true;
            m2550a.f4740R = 0.1f;
            m2550a.f4728F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4709h) {
            m2550a.f4762ap = 6;
            m2550a.f4745W = 39.0f;
            m2550a.f4720s = true;
            m2550a.f4740R = 0.1f;
            m2550a.f4728F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4710i) {
            m2550a.f4762ap = 14;
            m2550a.f4745W = 39.0f;
            m2550a.f4720s = true;
            m2550a.f4740R = 0.1f;
            m2550a.f4728F = 0.7f;
        }
        m2550a.f4746X = m2550a.f4745W;
        return m2550a;
    }

    /* renamed from: a */
    public void m2552a(Context context) {
        int i;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4700w.m7267a(130, 200, 0, 0);
        this.f4700w.m7248a(true);
        this.f4700w.m7270a(2.0f);
        this.f4700w.m7262a(Paint.Cap.ROUND);
        if (GameEngine.f6201aW) {
            this.f4700w.m7270a(3.0f);
        }
        f4684s = new C0747g[20];
        C0747g c0747g = new C0747g();
        c0747g.f4814b = 25;
        c0747g.f4815c = 25;
        c0747g.f4816d = 1;
        c0747g.f4817e = 1;
        c0747g.f4818f = 26;
        c0747g.f4819g = 26;
        c0747g.f4821i = gameEngine.graphics.mo926a(R.drawable.effects, true);
        c0747g.f4813a = "effects";
        c0747g.m2505a();
        f4684s[0] = c0747g;
        C0747g c0747g2 = new C0747g();
        c0747g2.f4814b = 39;
        c0747g2.f4815c = 40;
        c0747g2.f4816d = 1;
        c0747g2.f4817e = 1;
        c0747g2.f4818f = 40;
        c0747g2.f4819g = 41;
        c0747g2.f4821i = gameEngine.graphics.mo926a(R.drawable.explode_big, true);
        c0747g2.f4813a = "explode_big";
        f4684s[1] = c0747g2;
        C0747g c0747g3 = new C0747g();
        c0747g3.f4823k = true;
        c0747g3.f4821i = gameEngine.graphics.mo926a(R.drawable.light_50, true);
        c0747g3.f4813a = "light_50";
        f4684s[2] = c0747g3;
        C0747g c0747g4 = new C0747g();
        c0747g4.f4814b = 20;
        c0747g4.f4815c = 25;
        c0747g4.f4816d = 0;
        c0747g4.f4817e = 0;
        c0747g4.f4818f = 20;
        c0747g4.f4819g = 25;
        c0747g4.f4821i = gameEngine.graphics.mo926a(R.drawable.flame, true);
        c0747g4.f4813a = "flame";
        f4684s[3] = c0747g4;
        C0747g c0747g5 = new C0747g();
        c0747g5.f4814b = 20;
        c0747g5.f4815c = 25;
        c0747g5.f4816d = 0;
        c0747g5.f4817e = 0;
        c0747g5.f4818f = c0747g5.f4814b;
        c0747g5.f4819g = c0747g5.f4815c;
        c0747g5.f4821i = gameEngine.graphics.mo926a(R.drawable.dust, true);
        c0747g5.f4813a = "dust";
        f4684s[4] = c0747g5;
        C0747g c0747g6 = new C0747g();
        c0747g6.f4814b = 50;
        c0747g6.f4815c = 40;
        c0747g6.f4816d = 0;
        c0747g6.f4817e = 0;
        c0747g6.f4818f = c0747g6.f4814b;
        c0747g6.f4819g = c0747g6.f4815c;
        c0747g6.f4821i = gameEngine.graphics.mo926a(R.drawable.smoke_black, true);
        c0747g6.f4813a = "smoke_black";
        c0747g6.m2505a();
        f4684s[5] = c0747g6;
        C0747g c0747g7 = new C0747g();
        c0747g7.f4814b = 50;
        c0747g7.f4815c = 50;
        c0747g7.f4816d = 0;
        c0747g7.f4817e = 0;
        c0747g7.f4818f = c0747g7.f4814b;
        c0747g7.f4819g = c0747g7.f4815c;
        c0747g7.f4821i = gameEngine.graphics.mo926a(R.drawable.shockwave, true);
        c0747g7.f4813a = "shockwave";
        f4684s[6] = c0747g7;
        C0747g c0747g8 = new C0747g();
        c0747g8.f4814b = 20;
        c0747g8.f4815c = 20;
        c0747g8.f4816d = 0;
        c0747g8.f4817e = 0;
        c0747g8.f4818f = c0747g8.f4814b;
        c0747g8.f4819g = c0747g8.f4815c;
        c0747g8.f4821i = gameEngine.graphics.mo926a(R.drawable.fire, true);
        c0747g8.f4813a = "fire";
        f4684s[7] = c0747g8;
        C0747g c0747g9 = new C0747g();
        c0747g9.f4814b = 20;
        c0747g9.f4815c = 30;
        c0747g9.f4818f = c0747g9.f4814b + 2;
        c0747g9.f4819g = c0747g9.f4815c;
        c0747g9.f4821i = gameEngine.graphics.mo926a(R.drawable.lava_bubble, true);
        c0747g9.f4813a = "lava_bubble";
        f4684s[8] = c0747g9;
        C0747g c0747g10 = new C0747g();
        c0747g10.f4814b = 28;
        c0747g10.f4815c = 28;
        c0747g10.f4816d = 0;
        c0747g10.f4817e = 0;
        c0747g10.f4818f = c0747g10.f4814b + 1;
        c0747g10.f4819g = c0747g10.f4815c + 1;
        c0747g10.f4821i = gameEngine.graphics.mo926a(R.drawable.effects2, true);
        c0747g10.f4813a = "effects2";
        f4684s[9] = c0747g10;
        C0747g c0747g11 = new C0747g();
        c0747g11.f4814b = 20;
        c0747g11.f4815c = 25;
        c0747g11.f4816d = 0;
        c0747g11.f4817e = 0;
        c0747g11.f4818f = 20;
        c0747g11.f4819g = 25;
        c0747g11.f4821i = gameEngine.graphics.mo926a(R.drawable.plasma_shot, true);
        c0747g11.f4813a = "plasma_shot";
        f4684s[10] = c0747g11;
        C0747g c0747g12 = new C0747g();
        c0747g12.f4814b = 104;
        c0747g12.f4815c = 104;
        c0747g12.f4816d = 0;
        c0747g12.f4817e = 0;
        c0747g12.f4818f = c0747g12.f4814b;
        c0747g12.f4819g = c0747g12.f4815c;
        c0747g12.f4821i = gameEngine.graphics.mo926a(R.drawable.shockwave_large, true);
        c0747g12.f4813a = "shockwave_large";
        f4684s[11] = c0747g12;
        C0747g c0747g13 = new C0747g();
        c0747g13.f4814b = 20;
        c0747g13.f4815c = 20;
        c0747g13.f4816d = 0;
        c0747g13.f4817e = 0;
        c0747g13.f4818f = c0747g13.f4814b;
        c0747g13.f4819g = c0747g13.f4815c;
        c0747g13.f4821i = gameEngine.graphics.mo926a(R.drawable.explode_bits, true);
        c0747g13.f4813a = "explode_bits";
        c0747g13.m2505a();
        f4684s[12] = c0747g13;
        C0747g c0747g14 = new C0747g();
        c0747g14.f4814b = 39;
        c0747g14.f4815c = 40;
        c0747g14.f4816d = 1;
        c0747g14.f4817e = 1;
        c0747g14.f4818f = 40;
        c0747g14.f4819g = 41;
        c0747g14.f4821i = gameEngine.graphics.mo926a(R.drawable.explode_big2, true);
        c0747g14.f4813a = "explode_big2";
        f4684s[13] = c0747g14;
        C0747g c0747g15 = new C0747g();
        c0747g15.f4814b = 20;
        c0747g15.f4815c = 20;
        c0747g15.f4816d = 0;
        c0747g15.f4817e = 0;
        c0747g15.f4818f = c0747g15.f4814b;
        c0747g15.f4819g = c0747g15.f4815c;
        c0747g15.f4821i = gameEngine.graphics.mo926a(R.drawable.explode_bits_bug, true);
        c0747g15.f4813a = "explode_bits_bug";
        c0747g15.m2505a();
        f4684s[14] = c0747g15;
        C0747g c0747g16 = new C0747g();
        c0747g16.f4814b = 20;
        c0747g16.f4815c = 20;
        c0747g16.f4816d = 0;
        c0747g16.f4817e = 0;
        c0747g16.f4818f = c0747g16.f4814b;
        c0747g16.f4819g = c0747g16.f4815c;
        c0747g16.f4821i = gameEngine.graphics.mo926a(R.drawable.projectiles, true);
        c0747g16.f4813a = "projectiles";
        c0747g16.m2505a();
        f4684s[15] = c0747g16;
        C0747g c0747g17 = new C0747g();
        c0747g17.f4814b = 20;
        c0747g17.f4815c = 20;
        c0747g17.f4816d = 0;
        c0747g17.f4817e = 0;
        c0747g17.f4818f = c0747g17.f4814b;
        c0747g17.f4819g = c0747g17.f4815c;
        c0747g17.f4821i = gameEngine.graphics.mo926a(R.drawable.projectiles2, true);
        c0747g17.f4813a = "projectiles2";
        c0747g17.m2505a();
        f4684s[16] = c0747g17;
        C0747g c0747g18 = new C0747g();
        c0747g18.f4814b = 30;
        c0747g18.f4815c = 30;
        c0747g18.f4816d = 0;
        c0747g18.f4817e = 0;
        c0747g18.f4818f = c0747g18.f4814b + 1;
        c0747g18.f4819g = c0747g18.f4815c + 1;
        c0747g18.f4821i = gameEngine.graphics.mo926a(R.drawable.effects3, true);
        c0747g18.f4813a = "effects3";
        f4684s[17] = c0747g18;
        C0747g c0747g19 = new C0747g();
        c0747g19.f4814b = 50;
        c0747g19.f4815c = 40;
        c0747g19.f4816d = 0;
        c0747g19.f4817e = 0;
        c0747g19.f4818f = c0747g19.f4814b;
        c0747g19.f4819g = c0747g19.f4815c;
        c0747g19.f4821i = gameEngine.graphics.mo926a(R.drawable.smoke_white, true);
        c0747g19.f4813a = "smoke_white";
        c0747g19.m2505a();
        f4684s[18] = c0747g19;
        C0747g c0747g20 = new C0747g();
        c0747g20.f4814b = 56;
        c0747g20.f4815c = 56;
        c0747g20.f4816d = 0;
        c0747g20.f4817e = 0;
        c0747g20.f4818f = c0747g20.f4814b;
        c0747g20.f4819g = c0747g20.f4815c;
        c0747g20.f4821i = gameEngine.graphics.mo926a(R.drawable.shockwave2, true);
        c0747g20.f4813a = "shockwave2";
        c0747g20.m2505a();
        f4684s[19] = c0747g20;
        if (GameEngine.m1157au()) {
            i = 500;
            this.f4679i = 90;
            this.f4680j = 210;
        } else {
            i = 350;
            this.f4679i = 90;
            this.f4680j = 170;
        }
        f4685f = new C0745e[i];
        this.f4693b = i - 60;
        this.f4694c = i - 30;
        this.f4695d = i - 20;
        this.f4696e = i - 10;
        for (int i2 = 0; i2 < f4685f.length; i2++) {
            f4685f[i2] = new C0745e(this);
        }
    }

    /* renamed from: a */
    public int m2547a(String str) {
        for (int i = 0; i < f4684s.length; i++) {
            if (f4684s[i] != null) {
                if (f4684s[i].f4813a != null && f4684s[i].f4813a.equalsIgnoreCase(str)) {
                    return i;
                }
                if ((VariableScope.nullOrMissingString + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m2565a(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0745e[] c0745eArr = f4685f;
        for (int i = 0; i < f4686g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4718p && !c0745e.f4719q) {
                c0745e.m2522b(f);
            }
        }
        if (f4678h) {
            while (f4686g > 0 && !c0745eArr[f4686g - 1].f4718p) {
                f4686g--;
            }
        }
        this.f4701x += f;
        if (this.f4701x > 10.0f) {
            this.f4701x = 0.0f;
            gameEngine.f6104bL.m6652a(gameEngine.f6136ct + CommonUtils.m2360a(0, (int) gameEngine.f6142cz), gameEngine.f6137cu + CommonUtils.m2360a(0, (int) gameEngine.f6143cA));
            int i2 = gameEngine.f6104bL.f800T;
            int i3 = gameEngine.f6104bL.f801U;
            C0180g m6603d = gameEngine.f6104bL.m6603d(i2, i3);
            if (m6603d != null && m6603d.f919g && !m6603d.f920h) {
                gameEngine.f6104bL.m6648a(i2, i3);
                m2529f(gameEngine.f6104bL.f800T + 10, (gameEngine.f6104bL.f801U - 10) + 10, 0.0f);
            }
        }
    }

    /* renamed from: a */
    public int m2553a(float f, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i2 = 0;
        C0745e[] c0745eArr = f4685f;
        if (i == 1) {
            for (int i3 = 0; i3 < f4686g; i3++) {
                C0745e c0745e = c0745eArr[i3];
                if (c0745e.f4718p) {
                    if (c0745e.f4719q) {
                        c0745e.m2522b(f);
                    }
                    if (!c0745e.f4717o && c0745e.f4787as && c0745e.m2524a(gameEngine, true)) {
                        i2++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < f4686g; i4++) {
            C0745e c0745e2 = c0745eArr[i4];
            if (c0745e2.f4718p && !c0745e2.f4717o && c0745e2.f4786ar == i && c0745e2.m2524a(gameEngine, false)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public void m2543b(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0745e[] c0745eArr = f4685f;
        for (int i = 0; i < f4686g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4718p && c0745e.f4717o) {
                c0745e.m2524a(gameEngine, false);
            }
        }
    }

    /* renamed from: a */
    public void m2546a(boolean z) {
        if (z) {
            return;
        }
        for (int i = 0; i < f4685f.length; i++) {
            C0745e c0745e = f4685f[i];
            if (c0745e.f4718p) {
                c0745e.f4718p = false;
                this.f4692a--;
            }
        }
        if (this.f4692a != 0) {
            GameEngine.m1193a("EffectEngine::removeAll: effectListActiveSize == " + this.f4692a);
        }
        f4686g = 0;
    }
}

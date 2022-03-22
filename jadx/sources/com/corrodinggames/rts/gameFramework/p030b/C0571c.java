package com.corrodinggames.rts.gameFramework.p030b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;

/* renamed from: com.corrodinggames.rts.gameFramework.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/c.class */
public final class C0571c {

    /* renamed from: h */
    public static boolean f3804h;

    /* renamed from: i */
    public int f3805i;

    /* renamed from: j */
    public int f3806j;

    /* renamed from: n */
    public static C0575g[] f3810n;

    /* renamed from: f */
    public static C0573e[] f3802f = new C0573e[0];

    /* renamed from: g */
    public static int f3803g = 0;

    /* renamed from: k */
    public static final RectF f3807k = new RectF();

    /* renamed from: l */
    public static final Rect f3808l = new Rect();

    /* renamed from: m */
    public static final Paint f3809m = new Paint();

    /* renamed from: a */
    public int f3797a = 0;

    /* renamed from: b */
    public int f3798b = 80;

    /* renamed from: c */
    public int f3799c = 100;

    /* renamed from: d */
    public int f3800d = 110;

    /* renamed from: e */
    public int f3801e = 120;

    /* renamed from: o */
    EnumC0576h f3811o = null;

    /* renamed from: p */
    boolean f3812p = false;

    /* renamed from: q */
    boolean f3813q = false;

    /* renamed from: r */
    public final Paint f3814r = new Paint();

    /* renamed from: s */
    float f3815s = 0.0f;

    /* renamed from: a */
    public C0573e m2002a(EnumC0576h hVar) {
        int i = 0;
        int b = AbstractC0789l.m638u().mo689b();
        if (b < 13) {
            i = -this.f3806j;
        } else if (b < 28) {
            i = -this.f3805i;
        }
        int i2 = this.f3797a;
        if (hVar == EnumC0576h.verylow && i2 > this.f3798b + i) {
            return null;
        }
        if (hVar == EnumC0576h.low && i2 > this.f3799c + i) {
            return null;
        }
        if (hVar == EnumC0576h.high && i2 > this.f3800d + i) {
            return null;
        }
        if (hVar == EnumC0576h.veryhigh && i2 > this.f3801e + i) {
            return null;
        }
        C0573e a = m1997a(true, (EnumC0576h) null);
        if (a == null && (hVar == EnumC0576h.critical || hVar == EnumC0576h.veryhigh)) {
            a = m1997a(false, EnumC0576h.high);
        }
        if (a == null) {
            return null;
        }
        if (!a.f3842p) {
            a.f3842p = true;
            this.f3797a++;
        }
        return a;
    }

    /* renamed from: a */
    private C0573e m1997a(boolean z, EnumC0576h hVar) {
        C0573e[] eVarArr = f3802f;
        int length = eVarArr.length;
        if (!z || hVar != null) {
            for (C0573e eVar : eVarArr) {
                if ((!z || !eVar.f3842p) && (hVar == null || eVar.f3844r.m1964a(hVar))) {
                    return eVar;
                }
            }
            return null;
        }
        for (int i = 0; i < length; i++) {
            C0573e eVar2 = eVarArr[i];
            if (!eVar2.f3842p) {
                if (f3803g == i) {
                    f3803g++;
                }
                return eVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2015a(float f, float f2, float f3) {
        m2013a(f, f2, f3, 0.0f, 20.0f);
    }

    /* renamed from: a */
    public void m2013a(float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 7; i++) {
            C0573e b = m1994b(f + C0654f.m1458c(-20.0f, 20.0f), f2 + C0654f.m1458c(-20.0f, 20.0f), f3);
            if (b != null) {
                b.f3874V = f4 + C0654f.m1458c(0.0f, f5);
                b.f3888aj = C0654f.m1458c(0.3f, 0.6f);
            }
        }
    }

    /* renamed from: a */
    public float m2016a(float f, float f2) {
        return C0654f.m1458c(f, f2);
    }

    /* renamed from: b */
    public C0573e m1994b(float f, float f2, float f3) {
        m2018a();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3894ap = 1;
            b.f3883ae = true;
            b.f3889ak = 0.0f;
            b.f3888aj = 0.5f;
            b.f3885ag = 12;
            b.f3893ao = 0;
            b.f3875W = 35.0f;
            b.f3876X = b.f3875W - 10.0f;
            b.f3845s = true;
            b.f3858F = 0.7f;
            b.f3877Y = m2016a(-180.0f, 180.0f);
            float a = m2016a(0.8f, 1.0f);
            b.f3860H = a;
            b.f3859G = a;
        }
        return b;
    }

    /* renamed from: c */
    public C0573e m1987c(float f, float f2, float f3) {
        m2018a();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3894ap = 13;
            b.f3883ae = true;
            b.f3889ak = 3.0f;
            b.f3888aj = 0.5f;
            b.f3885ag = 7;
            b.f3893ao = 0;
            b.f3875W = 35.0f;
            b.f3876X = b.f3875W - 10.0f;
            b.f3845s = true;
            b.f3858F = 1.0f;
            b.f3860H = 0.5f;
            b.f3859G = 0.5f;
        }
        return b;
    }

    /* renamed from: a */
    public C0573e m2012a(float f, float f2, float f3, float f4, float f5, float f6) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!u.f5511bt.m3701a(f, f2, u.f5493bb) && !u.f5511bt.m3701a(f4, f5, u.f5493bb)) {
            return null;
        }
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, true, EnumC0576h.high);
        if (b != null) {
            b.f3891am = false;
            b.f3875W = 5.0f;
            b.f3876X = b.f3875W;
            b.f3845s = true;
            b.f3858F = 1.0f;
            b.f3865M = true;
            b.f3866N = f4;
            b.f3867O = f5;
            b.f3868P = f6;
        }
        return b;
    }

    /* renamed from: a */
    public C0573e m2014a(float f, float f2, float f3, float f4) {
        return m2011a(f, f2, f3, f4, 0);
    }

    /* renamed from: a */
    public C0573e m2011a(float f, float f2, float f3, float f4, int i) {
        return m2010a(f, f2, f3, f4, i, 0);
    }

    /* renamed from: b */
    public C0573e m1991b(float f, float f2, float f3, float f4, int i) {
        return m2010a(f, f2, f3, f4, i, 1);
    }

    /* renamed from: a */
    public C0573e m2010a(float f, float f2, float f3, float f4, int i, int i2) {
        m2018a();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3833g = C0573e.f3836j;
            b.f3883ae = true;
            if (i2 == 1) {
                b.f3894ap = 3;
                b.f3889ak = 1.0f;
                b.f3888aj = 0.4f;
                b.f3885ag = 4;
            } else {
                b.f3894ap = 3;
                b.f3889ak = 0.0f;
                b.f3888aj = 0.5f;
                b.f3885ag = 3;
            }
            b.f3877Y = f4;
            b.f3893ao = 0;
            b.f3875W = 20.0f;
            b.f3876X = b.f3875W;
            b.f3845s = false;
            if (i != 0) {
                b.f3855C = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    /* renamed from: c */
    public C0573e m1986c(float f, float f2, float f3, float f4, int i) {
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.verylow);
        if (b != null) {
            b.f3894ap = 4;
            b.f3833g = C0573e.f3835i;
            b.f3893ao = C0654f.m1514a(0, 2);
            b.f3877Y = f4;
            b.f3891am = true;
            b.f3869Q = C0654f.m1421i(f4) * 0.15f;
            b.f3870R = C0654f.m1425h(f4) * 0.15f;
            b.f3875W = 30.0f;
            b.f3876X = b.f3875W;
            b.f3845s = true;
            b.f3895aq = (short) 1;
            b.f3860H = 0.8f;
            b.f3859G = 2.3f;
            if (i != 0) {
                b.f3855C = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    /* renamed from: a */
    public static void m2003a(C0573e eVar, AbstractC0854w wVar) {
        if (eVar != null) {
            eVar.f3828b = wVar;
            eVar.f3862J -= wVar.f5842dH;
            eVar.f3863K -= wVar.f5843dI;
            eVar.f3864L -= wVar.f5844dJ;
        }
    }

    /* renamed from: a */
    public C0573e m2001a(AbstractC0854w wVar, int i) {
        return m2000a(wVar, i, 0.5f);
    }

    /* renamed from: a */
    public C0573e m2000a(AbstractC0854w wVar, int i, float f) {
        m1996b();
        C0573e b = m1990b(wVar.f5842dH, wVar.f5843dI, wVar.f5844dJ, i);
        if (b != null) {
            b.f3862J = 0.0f;
            b.f3863K = 0.0f;
            b.f3864L = 0.0f;
            b.f3875W = 400.0f;
            b.f3876X = b.f3875W;
            b.f3858F = 0.3f;
            b.f3860H = f;
            b.f3828b = wVar;
        }
        return b;
    }

    /* renamed from: a */
    public C0573e m2009a(float f, float f2, float f3, int i) {
        if (this.f3811o == null && !this.f3813q) {
            m2018a();
        }
        return m1990b(f, f2, f3, i);
    }

    /* renamed from: b */
    public C0573e m1990b(float f, float f2, float f3, int i) {
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, true, EnumC0576h.low);
        if (b != null) {
            b.f3831e = false;
            b.f3833g = C0573e.f3834h;
            b.f3894ap = 2;
            b.f3875W = 10.0f;
            b.f3876X = b.f3875W;
            b.f3845s = true;
            b.f3858F = 0.5f;
            b.f3895aq = (short) 2;
            b.f3830d = true;
            if (i != 0) {
                b.f3855C = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    /* renamed from: b */
    public C0573e m1993b(float f, float f2, float f3, float f4) {
        m2018a();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.low);
        if (b != null) {
            b.f3833g = C0573e.f3838l;
            b.f3894ap = 0;
            b.f3893ao = 13;
            b.f3895aq = (short) 1;
            b.f3845s = true;
            b.f3858F = 0.8f;
            b.f3876X = 80.0f;
            b.f3875W = b.f3876X;
            b.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
            b.f3860H = C0654f.m1458c(0.6f, 0.8f);
            b.f3859G = 1.5f;
            b.f3869Q = (C0654f.m1421i(f4) * 0.13f * C0654f.m1458c(1.0f, 1.5f)) + C0654f.m1458c(-0.01f, 0.01f);
            b.f3870R = (C0654f.m1425h(f4) * 0.13f * C0654f.m1458c(1.0f, 1.5f)) + C0654f.m1458c(-0.01f, 0.01f);
        }
        return b;
    }

    /* renamed from: a */
    public C0573e m2008a(float f, float f2, float f3, int i, float f4, float f5) {
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3833g = C0573e.f3838l;
            b.f3894ap = 6;
            b.f3875W = 120.0f;
            b.f3876X = b.f3875W;
            b.f3845s = true;
            b.f3860H = 0.2f;
            b.f3859G = 0.9f;
            b.f3895aq = (short) 1;
            b.f3858F = 0.5f;
            b.f3869Q = f4;
            b.f3870R = f5;
            if (i != 0) {
                i = Color.m4213a(255, 0, 0, 200);
            }
            if (i != 0) {
                b.f3855C = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    /* renamed from: a */
    public void m2007a(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        m2008a(f, f2, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f7 = f6 + i2;
            C0573e b = m1993b(f + (C0654f.m1421i(f7) * (-5.0f)), f2 + (C0654f.m1425h(f7) * (-5.0f)), 0.0f, f7);
            if (b != null) {
                b.f3895aq = (short) 2;
                b.f3846t = true;
                b.f3847u = 7.0f;
            }
        }
    }

    /* renamed from: c */
    public C0573e m1985c(float f, float f2, float f3, int i) {
        C0573e d = m1983d(f, f2, f3, i);
        if (d != null) {
            d.f3894ap = 11;
        }
        return d;
    }

    /* renamed from: d */
    public C0573e m1983d(float f, float f2, float f3, int i) {
        m2018a();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3894ap = 6;
            b.f3875W = 30.0f;
            b.f3876X = b.f3875W;
            b.f3845s = true;
            b.f3860H = 0.2f;
            b.f3859G = 1.3f;
            b.f3895aq = (short) 1;
            if (i != 0) {
                b.f3855C = new LightingColorFilter(i, 0);
            }
        }
        return b;
    }

    /* renamed from: d */
    public C0573e m1984d(float f, float f2, float f3) {
        C0573e b = m1992b(f, f2, f3, 0.3f, 0.7f);
        if (b != null) {
            b.f3894ap = 14;
            b.f3893ao = C0654f.m1514a(0, 5);
            b.f3850x = 0.5f;
        }
        return b;
    }

    /* renamed from: e */
    public C0573e m1982e(float f, float f2, float f3) {
        C0573e b = m1992b(f, f2, f3, 1.0f, 1.0f);
        if (b != null) {
        }
        return b;
    }

    /* renamed from: b */
    public C0573e m1992b(float f, float f2, float f3, float f4, float f5) {
        m1996b();
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.high);
        if (b != null) {
            b.f3833g = C0573e.f3839m;
            b.f3894ap = 12;
            b.f3893ao = C0654f.m1514a(0, 7);
            b.f3875W = C0654f.m1458c(400.0f, 800.0f);
            b.f3876X = b.f3875W - 150.0f;
            b.f3845s = true;
            float c = C0654f.m1458c(0.6f, 1.0f);
            b.f3860H = c;
            b.f3859G = c;
            b.f3895aq = (short) 2;
            b.f3849w = true;
            b.f3896ar = true;
            float c2 = C0654f.m1458c(-180.0f, 180.0f);
            float c3 = C0654f.m1458c(0.4f, 1.2f) * f4;
            b.f3869Q = C0654f.m1421i(c2) * c3;
            b.f3870R = C0654f.m1425h(c2) * c3;
            b.f3871S = C0654f.m1458c(0.6f, 2.7f) * f5;
            b.f3877Y = C0654f.m1458c(-180.0f, 180.0f);
            b.f3864L += 1.0f;
        }
        return b;
    }

    /* renamed from: f */
    public C0573e m1981f(float f, float f2, float f3) {
        C0573e b = m1989b(f, f2, f3, EnumC0572d.custom, false, EnumC0576h.low);
        if (b != null) {
            b.f3894ap = 8;
            b.f3875W = 480.0f;
            b.f3876X = b.f3875W;
            b.f3845s = false;
            b.f3895aq = (short) 1;
            b.f3883ae = true;
            b.f3889ak = 0.0f;
            b.f3860H = 0.5f;
            b.f3860H = 1.0f;
            int a = C0654f.m1514a(0, 100);
            if (a > 80) {
                b.f3888aj = C0654f.m1458c(0.1f, 0.15f);
                b.f3885ag = 15;
            } else if (a > 60) {
                b.f3888aj = C0654f.m1458c(0.06f, 0.16f);
                b.f3886ah = true;
                b.f3885ag = 6;
                b.f3845s = true;
            } else {
                b.f3888aj = C0654f.m1458c(0.06f, 0.16f);
                b.f3886ah = true;
                b.f3885ag = 3;
                b.f3845s = true;
            }
        }
        return b;
    }

    /* renamed from: b */
    public void m1988b(EnumC0576h hVar) {
        this.f3811o = hVar;
    }

    /* renamed from: a */
    public void m2018a() {
        this.f3812p = true;
    }

    /* renamed from: b */
    public void m1996b() {
        this.f3813q = true;
    }

    /* renamed from: a */
    public C0573e m2006a(float f, float f2, float f3, EnumC0572d dVar, boolean z, EnumC0576h hVar) {
        C0573e b = m1989b(f, f2, f3, dVar, z, hVar);
        if (b != null) {
            b.f3843q = true;
        }
        return b;
    }

    /* renamed from: b */
    public C0573e m1989b(float f, float f2, float f3, EnumC0572d dVar, boolean z, EnumC0576h hVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f3811o != null) {
            hVar = this.f3811o;
            this.f3811o = null;
        }
        boolean z2 = this.f3813q;
        this.f3813q = false;
        if (this.f3812p) {
            this.f3812p = false;
            if (!u.f5566cw.m4116b(f, f2)) {
                return null;
            }
        }
        if (!z && u.f5511bt != null && !u.f5511bt.m3701a(f, f2, u.f5493bb)) {
            return null;
        }
        if (u.f5565cv.m4116b(f, f2)) {
            if (hVar == EnumC0576h.verylow) {
                hVar = EnumC0576h.low;
            } else if (hVar == EnumC0576h.low) {
                hVar = EnumC0576h.high;
            } else if (hVar == EnumC0576h.high) {
                hVar = EnumC0576h.veryhigh;
            }
        } else if (z2 || u.f5566cw.m4116b(f, f2)) {
        }
        C0573e a = m2002a(hVar);
        if (a == null) {
            return null;
        }
        a.m1974c();
        a.f3844r = hVar;
        a.f3894ap = 0;
        a.f3891am = true;
        a.f3862J = f;
        a.f3863K = f2;
        a.f3864L = f3;
        a.f3858F = 1.0f;
        if (dVar == EnumC0572d.hitGround || dVar == EnumC0572d.playerLand || dVar == EnumC0572d.playerJump) {
            a.f3893ao = 7;
            a.f3875W = 12.0f;
            a.f3845s = true;
            a.f3870R = -0.3f;
            a.f3858F = 0.7f;
            if (dVar == EnumC0572d.playerJump) {
                a.f3893ao = 3;
                a.f3870R = -0.7f;
                a.f3875W = 24.0f;
                a.f3858F = 0.7f;
            }
            if (dVar == EnumC0572d.playerLand) {
                a.f3893ao = 4;
                a.f3875W = 15.0f;
                a.f3858F = 0.4f;
            }
        }
        if (dVar == EnumC0572d.teleport) {
            a.f3893ao = 1;
            a.f3875W = 25.0f;
            a.f3845s = true;
        }
        if (dVar == EnumC0572d.gemCollect) {
            a.f3893ao = 5;
            a.f3875W = 42.0f;
            a.f3845s = true;
            a.f3870R = 0.1f;
            a.f3858F = 2.0f;
        }
        if (dVar == EnumC0572d.keyDoorOpen) {
            a.f3893ao = 6;
            a.f3875W = 39.0f;
            a.f3845s = true;
            a.f3870R = 0.1f;
            a.f3858F = 2.0f;
        }
        if (dVar == EnumC0572d.blood) {
            a.f3893ao = 14;
            a.f3875W = 39.0f;
            a.f3845s = true;
            a.f3870R = 0.1f;
            a.f3858F = 0.7f;
        }
        a.f3876X = a.f3875W;
        return a;
    }

    /* renamed from: a */
    public void m2004a(Context context) {
        int i;
        AbstractC0789l u = AbstractC0789l.m638u();
        this.f3814r.m4189a(130, 200, 0, 0);
        this.f3814r.m4173a(true);
        this.f3814r.m4192a(2.0f);
        this.f3814r.m4185a(Paint.Cap.ROUND);
        if (AbstractC0789l.f5472aG) {
            this.f3814r.m4192a(3.0f);
        }
        f3810n = new C0575g[20];
        C0575g gVar = new C0575g();
        gVar.f3927b = 25;
        gVar.f3928c = 25;
        gVar.f3929d = 1;
        gVar.f3930e = 1;
        gVar.f3931f = 26;
        gVar.f3932g = 26;
        gVar.f3934i = u.f5514bw.mo189a(C0063R.drawable.effects, true);
        gVar.f3926a = "effects";
        gVar.m1966a();
        f3810n[0] = gVar;
        C0575g gVar2 = new C0575g();
        gVar2.f3927b = 39;
        gVar2.f3928c = 40;
        gVar2.f3929d = 1;
        gVar2.f3930e = 1;
        gVar2.f3931f = 40;
        gVar2.f3932g = 41;
        gVar2.f3934i = u.f5514bw.mo189a(C0063R.drawable.explode_big, true);
        gVar2.f3926a = "explode_big";
        f3810n[1] = gVar2;
        C0575g gVar3 = new C0575g();
        gVar3.f3936k = true;
        gVar3.f3934i = u.f5514bw.mo189a(C0063R.drawable.light_50, true);
        gVar3.f3926a = "light_50";
        f3810n[2] = gVar3;
        C0575g gVar4 = new C0575g();
        gVar4.f3927b = 20;
        gVar4.f3928c = 25;
        gVar4.f3929d = 0;
        gVar4.f3930e = 0;
        gVar4.f3931f = 20;
        gVar4.f3932g = 25;
        gVar4.f3934i = u.f5514bw.mo189a(C0063R.drawable.flame, true);
        gVar4.f3926a = "flame";
        f3810n[3] = gVar4;
        C0575g gVar5 = new C0575g();
        gVar5.f3927b = 20;
        gVar5.f3928c = 25;
        gVar5.f3929d = 0;
        gVar5.f3930e = 0;
        gVar5.f3931f = gVar5.f3927b;
        gVar5.f3932g = gVar5.f3928c;
        gVar5.f3934i = u.f5514bw.mo189a(C0063R.drawable.dust, true);
        gVar5.f3926a = "dust";
        f3810n[4] = gVar5;
        C0575g gVar6 = new C0575g();
        gVar6.f3927b = 50;
        gVar6.f3928c = 40;
        gVar6.f3929d = 0;
        gVar6.f3930e = 0;
        gVar6.f3931f = gVar6.f3927b;
        gVar6.f3932g = gVar6.f3928c;
        gVar6.f3934i = u.f5514bw.mo189a(C0063R.drawable.smoke_black, true);
        gVar6.f3926a = "smoke_black";
        gVar6.m1966a();
        f3810n[5] = gVar6;
        C0575g gVar7 = new C0575g();
        gVar7.f3927b = 50;
        gVar7.f3928c = 50;
        gVar7.f3929d = 0;
        gVar7.f3930e = 0;
        gVar7.f3931f = gVar7.f3927b;
        gVar7.f3932g = gVar7.f3928c;
        gVar7.f3934i = u.f5514bw.mo189a(C0063R.drawable.shockwave, true);
        gVar7.f3926a = "shockwave";
        f3810n[6] = gVar7;
        C0575g gVar8 = new C0575g();
        gVar8.f3927b = 20;
        gVar8.f3928c = 20;
        gVar8.f3929d = 0;
        gVar8.f3930e = 0;
        gVar8.f3931f = gVar8.f3927b;
        gVar8.f3932g = gVar8.f3928c;
        gVar8.f3934i = u.f5514bw.mo189a(C0063R.drawable.fire, true);
        gVar8.f3926a = "fire";
        f3810n[7] = gVar8;
        C0575g gVar9 = new C0575g();
        gVar9.f3927b = 20;
        gVar9.f3928c = 30;
        gVar9.f3931f = gVar9.f3927b + 2;
        gVar9.f3932g = gVar9.f3928c;
        gVar9.f3934i = u.f5514bw.mo189a(C0063R.drawable.lava_bubble, true);
        gVar9.f3926a = "lava_bubble";
        f3810n[8] = gVar9;
        C0575g gVar10 = new C0575g();
        gVar10.f3927b = 28;
        gVar10.f3928c = 28;
        gVar10.f3929d = 0;
        gVar10.f3930e = 0;
        gVar10.f3931f = gVar10.f3927b + 1;
        gVar10.f3932g = gVar10.f3928c + 1;
        gVar10.f3934i = u.f5514bw.mo189a(C0063R.drawable.effects2, true);
        gVar10.f3926a = "effects2";
        f3810n[9] = gVar10;
        C0575g gVar11 = new C0575g();
        gVar11.f3927b = 20;
        gVar11.f3928c = 25;
        gVar11.f3929d = 0;
        gVar11.f3930e = 0;
        gVar11.f3931f = 20;
        gVar11.f3932g = 25;
        gVar11.f3934i = u.f5514bw.mo189a(C0063R.drawable.plasma_shot, true);
        gVar11.f3926a = "plasma_shot";
        f3810n[10] = gVar11;
        C0575g gVar12 = new C0575g();
        gVar12.f3927b = 104;
        gVar12.f3928c = 104;
        gVar12.f3929d = 0;
        gVar12.f3930e = 0;
        gVar12.f3931f = gVar12.f3927b;
        gVar12.f3932g = gVar12.f3928c;
        gVar12.f3934i = u.f5514bw.mo189a(C0063R.drawable.shockwave_large, true);
        gVar12.f3926a = "shockwave_large";
        f3810n[11] = gVar12;
        C0575g gVar13 = new C0575g();
        gVar13.f3927b = 20;
        gVar13.f3928c = 20;
        gVar13.f3929d = 0;
        gVar13.f3930e = 0;
        gVar13.f3931f = gVar13.f3927b;
        gVar13.f3932g = gVar13.f3928c;
        gVar13.f3934i = u.f5514bw.mo189a(C0063R.drawable.explode_bits, true);
        gVar13.f3926a = "explode_bits";
        gVar13.m1966a();
        f3810n[12] = gVar13;
        C0575g gVar14 = new C0575g();
        gVar14.f3927b = 39;
        gVar14.f3928c = 40;
        gVar14.f3929d = 1;
        gVar14.f3930e = 1;
        gVar14.f3931f = 40;
        gVar14.f3932g = 41;
        gVar14.f3934i = u.f5514bw.mo189a(C0063R.drawable.explode_big2, true);
        gVar14.f3926a = "explode_big2";
        f3810n[13] = gVar14;
        C0575g gVar15 = new C0575g();
        gVar15.f3927b = 20;
        gVar15.f3928c = 20;
        gVar15.f3929d = 0;
        gVar15.f3930e = 0;
        gVar15.f3931f = gVar15.f3927b;
        gVar15.f3932g = gVar15.f3928c;
        gVar15.f3934i = u.f5514bw.mo189a(C0063R.drawable.explode_bits_bug, true);
        gVar15.f3926a = "explode_bits_bug";
        gVar15.m1966a();
        f3810n[14] = gVar15;
        C0575g gVar16 = new C0575g();
        gVar16.f3927b = 20;
        gVar16.f3928c = 20;
        gVar16.f3929d = 0;
        gVar16.f3930e = 0;
        gVar16.f3931f = gVar16.f3927b;
        gVar16.f3932g = gVar16.f3928c;
        gVar16.f3934i = u.f5514bw.mo189a(C0063R.drawable.projectiles, true);
        gVar16.f3926a = "projectiles";
        gVar16.m1966a();
        f3810n[15] = gVar16;
        C0575g gVar17 = new C0575g();
        gVar17.f3927b = 20;
        gVar17.f3928c = 20;
        gVar17.f3929d = 0;
        gVar17.f3930e = 0;
        gVar17.f3931f = gVar17.f3927b;
        gVar17.f3932g = gVar17.f3928c;
        gVar17.f3934i = u.f5514bw.mo189a(C0063R.drawable.projectiles2, true);
        gVar17.f3926a = "projectiles2";
        gVar17.m1966a();
        f3810n[16] = gVar17;
        C0575g gVar18 = new C0575g();
        gVar18.f3927b = 30;
        gVar18.f3928c = 30;
        gVar18.f3929d = 0;
        gVar18.f3930e = 0;
        gVar18.f3931f = gVar18.f3927b + 1;
        gVar18.f3932g = gVar18.f3928c + 1;
        gVar18.f3934i = u.f5514bw.mo189a(C0063R.drawable.effects3, true);
        gVar18.f3926a = "effects3";
        f3810n[17] = gVar18;
        C0575g gVar19 = new C0575g();
        gVar19.f3927b = 50;
        gVar19.f3928c = 40;
        gVar19.f3929d = 0;
        gVar19.f3930e = 0;
        gVar19.f3931f = gVar19.f3927b;
        gVar19.f3932g = gVar19.f3928c;
        gVar19.f3934i = u.f5514bw.mo189a(C0063R.drawable.smoke_white, true);
        gVar19.f3926a = "smoke_white";
        gVar19.m1966a();
        f3810n[18] = gVar19;
        C0575g gVar20 = new C0575g();
        gVar20.f3927b = 56;
        gVar20.f3928c = 56;
        gVar20.f3929d = 0;
        gVar20.f3930e = 0;
        gVar20.f3931f = gVar20.f3927b;
        gVar20.f3932g = gVar20.f3928c;
        gVar20.f3934i = u.f5514bw.mo189a(C0063R.drawable.shockwave2, true);
        gVar20.f3926a = "shockwave2";
        gVar20.m1966a();
        f3810n[19] = gVar20;
        if (AbstractC0789l.m697al()) {
            i = 500;
            this.f3805i = 90;
            this.f3806j = 210;
        } else {
            i = 290;
            this.f3805i = 90;
            this.f3806j = 170;
        }
        f3802f = new C0573e[i];
        this.f3798b = i - 60;
        this.f3799c = i - 30;
        this.f3800d = i - 20;
        this.f3801e = i - 10;
        for (int i2 = 0; i2 < f3802f.length; i2++) {
            f3802f[i2] = new C0573e(this);
        }
    }

    /* renamed from: a */
    public int m1999a(String str) {
        for (int i = 0; i < f3810n.length; i++) {
            if (f3810n[i] != null) {
                if (f3810n[i].f3926a != null && f3810n[i].f3926a.equalsIgnoreCase(str)) {
                    return i;
                }
                if (("" + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m2017a(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0573e[] eVarArr = f3802f;
        for (int i = 0; i < f3803g; i++) {
            C0573e eVar = eVarArr[i];
            if (eVar.f3842p && !eVar.f3843q) {
                eVar.m1975b(f);
            }
        }
        if (f3804h) {
            while (f3803g > 0 && !eVarArr[f3803g - 1].f3842p) {
                f3803g--;
            }
        }
        this.f3815s += f;
        if (this.f3815s > 10.0f) {
            this.f3815s = 0.0f;
            u.f5511bt.m3703a(u.f5545cb + C0654f.m1514a(0, (int) u.f5551ch), u.f5546cc + C0654f.m1514a(0, (int) u.f5552ci));
            int i2 = u.f5511bt.f764M;
            int i3 = u.f5511bt.f765N;
            C0155g d = u.f5511bt.m3656d(i2, i3);
            if (!(d == null || !d.f855g || d.f856h)) {
                u.f5511bt.m3699a(i2, i3);
                m1981f(u.f5511bt.f764M + 10, (u.f5511bt.f765N - 10) + 10, 0.0f);
            }
        }
    }

    /* renamed from: a */
    public void m2005a(float f, int i) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0573e[] eVarArr = f3802f;
        if (i == 1) {
            for (int i2 = 0; i2 < f3803g; i2++) {
                C0573e eVar = eVarArr[i2];
                if (eVar.f3842p) {
                    if (eVar.f3843q) {
                        eVar.m1975b(f);
                    }
                    if (!eVar.f3841o && eVar.f3896ar) {
                        eVar.m1977a(u, true);
                    }
                }
            }
        }
        for (int i3 = 0; i3 < f3803g; i3++) {
            C0573e eVar2 = eVarArr[i3];
            if (eVar2.f3842p && !eVar2.f3841o && eVar2.f3895aq == i) {
                eVar2.m1977a(u, false);
            }
        }
    }

    /* renamed from: b */
    public void m1995b(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0573e[] eVarArr = f3802f;
        for (int i = 0; i < f3803g; i++) {
            C0573e eVar = eVarArr[i];
            if (eVar.f3842p && eVar.f3841o) {
                eVar.m1977a(u, false);
            }
        }
    }

    /* renamed from: a */
    public void m1998a(boolean z) {
        if (!z) {
            for (int i = 0; i < f3802f.length; i++) {
                C0573e eVar = f3802f[i];
                if (eVar.f3842p) {
                    eVar.f3842p = false;
                    this.f3797a--;
                }
            }
            if (this.f3797a != 0) {
                AbstractC0789l.m719a("EffectEngine::removeAll: effectListActiveSize == " + this.f3797a);
            }
            f3803g = 0;
        }
    }
}

package com.corrodinggames.rts.gameFramework.p030b;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0838o;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a.class */
public class C0569a {

    /* renamed from: a */
    float f3760a;

    /* renamed from: b */
    float f3761b;

    /* renamed from: c */
    public boolean f3762c;

    /* renamed from: d */
    public AbstractC0268al f3763d;

    /* renamed from: e */
    public AbstractC0171m f3764e;

    /* renamed from: g */
    public float f3766g;

    /* renamed from: h */
    public float f3767h;

    /* renamed from: i */
    public boolean f3768i;

    /* renamed from: j */
    public AbstractC0171m f3769j;

    /* renamed from: k */
    public boolean f3770k;

    /* renamed from: l */
    public int f3771l;

    /* renamed from: m */
    public int f3772m;

    /* renamed from: n */
    public boolean f3773n;

    /* renamed from: o */
    public AbstractC0515r f3774o;

    /* renamed from: r */
    public int f3777r;

    /* renamed from: s */
    public float f3778s;

    /* renamed from: u */
    public boolean f3780u;

    /* renamed from: v */
    public AbstractC0210af f3781v;

    /* renamed from: w */
    public static C0838o f3782w = new C0838o();

    /* renamed from: x */
    static Point f3783x = new Point();

    /* renamed from: y */
    static RectF f3784y = new RectF();

    /* renamed from: z */
    static RectF f3785z = new RectF();

    /* renamed from: A */
    static RectF f3786A = new RectF();

    /* renamed from: E */
    static RectF f3790E = new RectF();

    /* renamed from: C */
    static Paint f3788C = new C0760q();

    /* renamed from: D */
    static Paint f3789D = new C0760q();

    /* renamed from: f */
    public int f3765f = 1;

    /* renamed from: p */
    boolean f3775p = false;

    /* renamed from: q */
    public boolean f3776q = false;

    /* renamed from: t */
    public float f3779t = 0.04f;

    /* renamed from: B */
    Paint f3787B = new Paint();

    public C0569a() {
        f3782w.add(this);
        f3782w.m482a();
    }

    static {
        f3788C.m4189a(90, 0, 0, 255);
        f3788C.m4184a(Paint.Style.STROKE);
        f3788C.m4192a(2.0f);
        f3789D.m4189a(40, 0, 0, 255);
        f3789D.m4184a(Paint.Style.STROKE);
        f3789D.m4192a(2.0f);
    }

    /* renamed from: a */
    public static void m2033a() {
        f3782w.clear();
    }

    /* renamed from: a */
    public static void m2032a(float f) {
        Iterator it = f3782w.iterator();
        while (it.hasNext()) {
            ((C0569a) it.next()).m2024c(f);
        }
        f3782w.m482a();
    }

    /* renamed from: b */
    public static void m2025b(float f) {
        Object[] b = f3782w.m477b();
        int size = f3782w.size();
        for (int i = 0; i < size; i++) {
            ((C0569a) b[i]).m2023d(f);
        }
    }

    /* renamed from: a */
    public static boolean m2030a(AbstractC0171m mVar, int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.f5511bt.m3699a(i, i2);
        float f = u.f5511bt.f764M + u.f5511bt.f737m;
        float f2 = u.f5511bt.f765N + u.f5511bt.f738n;
        f3784y.m4122a(f, f2, f + 1.0f, f2 + 1.0f);
        return m2029a(mVar, f3784y, i3);
    }

    /* renamed from: a */
    public static boolean m2028a(AbstractC0171m mVar, AbstractC0515r rVar, int i) {
        f3784y = rVar.m3335a(AbstractC0789l.m638u().f5511bt, f3784y);
        return m2029a(mVar, f3784y, i);
    }

    /* renamed from: a */
    public static boolean m2027a(AbstractC0515r rVar, AbstractC0515r rVar2) {
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        f3784y = rVar.m3335a(bVar, f3784y);
        f3785z = rVar2.m3335a(bVar, f3785z);
        if (C0654f.m1502a(f3784y, f3785z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2029a(AbstractC0171m mVar, RectF rectF, int i) {
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        RectF rectF2 = f3786A;
        Iterator it = f3782w.iterator();
        while (it.hasNext()) {
            C0569a aVar = (C0569a) it.next();
            if (aVar.f3769j == mVar && aVar.f3773n && (i == -1 || i == aVar.f3777r)) {
                AbstractC0210af a = AbstractC0210af.m3333a(aVar.f3763d);
                a.f5842dH = aVar.f3766g;
                a.f5843dI = aVar.f3767h;
                rectF2 = a.m3335a(bVar, rectF2);
                if (C0654f.m1502a(rectF2, rectF)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C0569a m2031a(AbstractC0171m mVar, float f, float f2) {
        Iterator it = f3782w.iterator();
        while (it.hasNext()) {
            C0569a aVar = (C0569a) it.next();
            if (aVar.f3769j == mVar && aVar.f3773n) {
                float a = C0654f.m1520a(aVar.f3766g, aVar.f3767h, f, f2);
                float f3 = AbstractC0210af.m3333a(aVar.f3763d).f1474bO + 1.0f;
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                if (a < f3 * f3) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2026b() {
        if (this.f3773n) {
            if (this.f3774o == null || this.f3774o.f1459bz || !EnumC0215ak.m3277a(this.f3763d, this.f3766g, this.f3767h, 0.0f, 0.0f, this.f3764e)) {
                return false;
            }
            return true;
        } else if (this.f3781v != null && !this.f3781v.m3320bR()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public void m2024c(float f) {
        this.f3760a += 1.0f;
        this.f3761b += f;
        boolean z = false;
        this.f3778s = C0654f.m1522a(this.f3778s, this.f3779t * f);
        if (this.f3773n) {
            if (this.f3760a > 6.0f) {
                this.f3760a = 0.0f;
                boolean a = this.f3774o.m2297a(this.f3763d, this.f3766g, this.f3767h);
                if (!this.f3775p && a) {
                    this.f3775p = true;
                }
                if (!a) {
                    if (this.f3775p) {
                        z = true;
                    } else if (this.f3761b > 180.0f) {
                        z = true;
                    }
                }
                if (!m2026b()) {
                    z = true;
                }
            }
        } else if (this.f3760a > 2.0f && !m2026b()) {
            z = true;
        }
        if (z) {
            this.f3762c = true;
            f3782w.m475b(this);
        }
    }

    /* renamed from: d */
    public void m2023d(float f) {
        AbstractC0210af c;
        Rect bP;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5493bb != this.f3769j || !u.f5565cv.m4116b(this.f3766g, this.f3767h)) {
            return;
        }
        if (!this.f3776q || this.f3775p) {
            float f2 = 0.0f;
            float f3 = this.f3766g;
            float f4 = this.f3767h;
            boolean z = false;
            boolean z2 = false;
            if (this.f3773n) {
                z2 = true;
            } else {
                z = true;
            }
            boolean z3 = true;
            if (this.f3768i) {
                z3 = false;
            }
            if (z2) {
                float f5 = this.f3778s;
                if (f5 <= 0.0f) {
                    f2 = 0.0f;
                } else if (this.f3778s < 1.0f) {
                    f2 = 1.0f - C0654f.m1421i(f5 * 90.0f);
                } else {
                    f2 = 1.0f;
                }
            }
            if (z2 && this.f3778s < 1.0f && (c = AbstractC0210af.m3310c(this.f3763d)) != null && c.mo2643bw() && (bP = c.mo2644bP()) != null) {
                f3790E.m4121a(bP);
                f3790E.f232b *= u.f5511bt.f736l;
                f3790E.f234d *= u.f5511bt.f736l;
                f3790E.f231a *= u.f5511bt.f735k;
                f3790E.f233c *= u.f5511bt.f735k;
                f3790E.m4123a(-(c.mo2572cH() - u.f5511bt.f737m), -(c.mo2571cI() - u.f5511bt.f738n));
                C0654f.m1503a(f3790E, (u.f5511bt.f737m - 3) + (f2 * 5.0f));
                f3790E.m4123a(this.f3766g - u.f5547cd, (this.f3767h - u.f5548ce) - 0.0f);
                float f6 = 3.0f + (f2 * 7.0f);
                Paint paint = f3788C;
                if (this.f3778s <= 0.0f) {
                    paint = f3789D;
                }
                u.f5514bw.mo197a(f3790E.f231a - f6, f3790E.f232b, f3790E.f233c + f6, f3790E.f232b, paint);
                u.f5514bw.mo197a(f3790E.f231a - f6, f3790E.f234d, f3790E.f233c + f6, f3790E.f234d, paint);
                u.f5514bw.mo197a(f3790E.f231a, f3790E.f232b - f6, f3790E.f231a, f3790E.f234d + f6, paint);
                u.f5514bw.mo197a(f3790E.f233c, f3790E.f232b - f6, f3790E.f233c, f3790E.f234d + f6, paint);
            }
            float f7 = 0.0f;
            if (z2) {
                f7 = 0.0f - (10.0f * f2);
            }
            EnumC0215ak.m3275a(this.f3763d, f3, f4 + f7, 0.0f, 0.0f, this.f3764e, 1.0f, 500.0f, z, z2, this.f3765f, z3);
        }
    }
}

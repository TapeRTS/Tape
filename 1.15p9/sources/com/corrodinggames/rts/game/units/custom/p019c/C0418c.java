package com.corrodinggames.rts.game.units.custom.p019c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0878m;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/c.class */
public class C0418c {

    /* renamed from: d */
    C1101m f2671d = new C1101m();

    /* renamed from: f */
    public static C0421f f2672f;

    /* renamed from: a */
    static final Rect f2673a = new Rect();

    /* renamed from: b */
    static final RectF f2674b = new RectF();

    /* renamed from: c */
    static final Paint f2675c = new Paint();

    /* renamed from: e */
    static Paint f2676e = new Paint();

    static {
        f2676e.m7267a(255, 0, 0, 200);
        f2672f = new C0421f();
    }

    /* renamed from: a */
    public void m5240a(C0453l c0453l) {
        Object[] m559a = this.f2671d.m559a();
        for (int i = this.f2671d.f6888a - 1; i >= 0; i--) {
            C0420e c0420e = (C0420e) m559a[i];
            C0416a m4765a = c0453l.m4765a(c0420e.f2681a.f2670g);
            if (m4765a != null) {
                c0420e.f2681a = m4765a;
                while (c0420e.f2682b.size() > c0420e.f2681a.f2667d) {
                    c0420e.f2682b.remove(c0420e.f2682b.size() - 1);
                }
            } else {
                this.f2671d.remove(i);
            }
        }
    }

    /* renamed from: a */
    public C0420e m5241a(C0416a c0416a, boolean z) {
        int i = this.f2671d.f6888a;
        Object[] m559a = this.f2671d.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0420e c0420e = (C0420e) m559a[i2];
            if (c0420e.f2681a == c0416a) {
                return c0420e;
            }
        }
        if (z) {
            C0420e c0420e2 = new C0420e(c0416a);
            this.f2671d.add(c0420e2);
            return c0420e2;
        }
        return null;
    }

    /* renamed from: a */
    public int m5242a(C0416a c0416a) {
        C0420e m5241a = m5241a(c0416a, false);
        if (m5241a == null) {
            return 0;
        }
        return m5241a.f2682b.f6888a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m5244a(float f, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = this.f2671d.f6888a;
        if (i == 0) {
            return;
        }
        Object[] m559a = this.f2671d.m559a();
        for (int i2 = 0; i2 < i; i2++) {
            C0420e c0420e = (C0420e) m559a[i2];
            C0416a c0416a = c0420e.f2681a;
            int i3 = c0420e.f2682b.f6888a;
            Object[] m559a2 = c0420e.f2682b.m559a();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                C0419d c0419d = (C0419d) m559a2[i4];
                if (c0419d.f2679c) {
                    Unit unit2 = c0419d.f2677a;
                    if (c0416a.f2668e != null) {
                        BitmapOrTexture bitmapOrTexture = c0416a.f2668e;
                        float f2 = unit.f6951ek - GameEngine.getInstance().f6138cv;
                        float f3 = ((unit.f6952el - GameEngine.getInstance().f6139cw) - unit.height) - 10.0f;
                        float f4 = bitmapOrTexture.f6401u;
                        float m2280d = CommonUtils.m2280d(unit.f6951ek, unit.f6952el - unit.height, unit2.f6951ek, unit2.f6952el - unit2.height);
                        float m2366a = CommonUtils.m2366a(unit.f6951ek, unit.f6952el - unit.height, unit2.f6951ek, unit2.f6952el - unit2.height);
                        if (m2366a < (bitmapOrTexture.f6397q - 2) * (bitmapOrTexture.f6397q - 2)) {
                            f4 = CommonUtils.m2361a((int) m2366a);
                        }
                        gameEngine.graphics.mo878k();
                        gameEngine.graphics.mo934a(m2280d + 90.0f, f2, f3);
                        f2673a.m7208a(0, (int) (bitmapOrTexture.f6397q - f4), bitmapOrTexture.f6396p, bitmapOrTexture.f6397q);
                        f2674b.m7195a(f2 - bitmapOrTexture.f6398r, f3 - f4, f2 + bitmapOrTexture.f6398r, f3);
                        C0930ag c0930ag = C0930ag.f6366r;
                        if (c0419d.f2680d != 0.0f) {
                            c0930ag = f2675c;
                            int abs = (int) Math.abs(c0419d.f2680d * 5.0f);
                            if (abs > 250) {
                                abs = 250;
                            }
                            c0930ag.m7267a(255, 255, 255 - abs, 255 - abs);
                        }
                        gameEngine.graphics.mo909a(bitmapOrTexture, f2673a, f2674b, c0930ag);
                        gameEngine.graphics.mo877l();
                    }
                    if (c0416a.f2669f != null) {
                        gameEngine.graphics.mo932a(unit.f6951ek - gameEngine.f6138cv, (unit.f6952el - gameEngine.f6139cw) - unit.height, unit2.f6951ek - gameEngine.f6138cv, (unit2.f6952el - gameEngine.f6139cw) - unit2.height, c0416a.f2669f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5239a(C0859ar c0859ar) {
        if (this.f2671d.f6888a == 0) {
            c0859ar.m1554c(-1);
            return;
        }
        c0859ar.m1554c(0);
        short size = (short) this.f2671d.size();
        c0859ar.mo1483a(size);
        Object[] m559a = this.f2671d.m559a();
        for (int i = 0; i < size; i++) {
            C0420e c0420e = (C0420e) m559a[i];
            c0859ar.m1573a(c0420e.f2681a.f2670g);
            c0859ar.mo1483a((short) c0420e.f2682b.size());
            Iterator it = c0420e.f2682b.iterator();
            while (it.hasNext()) {
                C0419d c0419d = (C0419d) it.next();
                c0859ar.mo1486a(c0419d.f2677a);
                c0859ar.mo1482a(c0419d.f2678b);
                c0859ar.mo1482a(c0419d.f2679c);
            }
        }
    }

    /* renamed from: a */
    public void m5243a(Unit unit, C0876k c0876k) {
        if (c0876k.m1457d() == -1) {
            return;
        }
        int m1438v = c0876k.m1438v();
        this.f2671d.clear();
        for (int i = 0; i < m1438v; i++) {
            C0448g m1447m = c0876k.m1447m();
            C0416a c0416a = null;
            if (unit instanceof C0451j) {
                c0416a = ((C0451j) unit).f2861w.m4765a(m1447m);
            }
            C0420e c0420e = null;
            if (c0416a != null) {
                c0420e = new C0420e(c0416a);
                this.f2671d.add(c0420e);
            }
            int m1438v2 = c0876k.m1438v();
            for (int i2 = 0; i2 < m1438v2; i2++) {
                C0419d c0419d = new C0419d();
                c0419d.f2677a = c0876k.m1470a(EnumC0878m.f5864a);
                c0419d.f2678b = c0876k.m1455e();
                c0419d.f2679c = c0876k.m1455e();
                if (c0419d.f2677a != null && c0420e != null) {
                    c0420e.f2682b.add(c0419d);
                }
            }
        }
    }
}

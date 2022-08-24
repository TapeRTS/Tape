package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.air.AbstractC0309b;
import com.corrodinggames.rts.game.units.water.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p042j.C0904i;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/y.class */
public final class C1117y {

    /* renamed from: a */
    static final Paint f6934a = new Paint();

    /* renamed from: b */
    static final RectF f6935b = new RectF();

    /* renamed from: c */
    static ArrayList f6936c = new ArrayList();

    /* renamed from: d */
    static final Rect f6937d;

    /* renamed from: e */
    static final RectF f6938e;

    /* renamed from: f */
    static Paint f6939f;

    /* renamed from: g */
    static C1118z[] f6940g;

    /* renamed from: h */
    static boolean f6941h;

    static {
        f6934a.m7267a(205, 255, 0, 0);
        f6934a.m7260a(Paint.Style.STROKE);
        f6937d = new Rect();
        f6938e = new RectF();
        f6939f = new Paint();
        f6940g = new C1118z[30];
        f6941h = false;
    }

    /* renamed from: a */
    public static void m495a(Unit unit, float f) {
        m490a(unit, f, false, false);
    }

    /* renamed from: a */
    public static void m492a(Unit unit, float f, boolean z) {
        m490a(unit, f, z, false);
    }

    /* renamed from: a */
    public static boolean m496a(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit.f1643cE && gameEngine.f6111bS.m1969p() == 1 && !gameEngine.f6111bS.f5106d.f4905e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m490a(Unit unit, float f, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (m496a(unit) || z) {
            float f2 = unit.f6951ek - gameEngine.f6138cv;
            float f3 = unit.f6952el - gameEngine.f6139cw;
            Paint paint = Unit.f1669de;
            if (z2) {
                paint = Unit.f1670df;
            }
            gameEngine.graphics.mo931a(f2, f3, f, paint);
        }
    }

    /* renamed from: a */
    public static void m493a(Unit unit, float f, int i, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if ((unit.f1643cE && gameEngine.f6111bS.m1969p() < 10) || z) {
            float f2 = unit.f6951ek - gameEngine.f6138cv;
            float f3 = unit.f6952el - gameEngine.f6139cw;
            Paint paint = Unit.f1673di;
            paint.m7242b(i);
            paint.m7270a(i2);
            gameEngine.graphics.mo931a(f2, f3, f, paint);
        }
    }

    /* renamed from: b */
    public static void m477b(Unit unit, float f, boolean z) {
        m491a(unit, f, z, Unit.f1671dg);
    }

    /* renamed from: a */
    public static void m491a(Unit unit, float f, boolean z, Paint paint) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (m496a(unit) || z) {
            gameEngine.graphics.mo931a(unit.f6951ek - gameEngine.f6138cv, unit.f6952el - gameEngine.f6139cw, f, paint);
        }
    }

    /* renamed from: a */
    public static void m484a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, float f4, float f5, Paint paint, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i4 = 0 + (i3 * i);
        f6937d.m7208a(i4, 0, i4 + i, 0 + i2);
        float f6 = f5 * 0.5f;
        float f7 = f2 - f3;
        float f8 = i * f6;
        float f9 = i2 * f6;
        f6938e.m7195a(f - f8, f7 - f9, f + f8, f7 + f9);
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        interfaceC1027y.mo878k();
        interfaceC1027y.mo934a(f4 + 90.0f, f, f7);
        if (f5 != 1.0f) {
            interfaceC1027y.mo933a(f5, f5, f, f7);
        }
        interfaceC1027y.mo909a(bitmapOrTexture, f6937d, f6938e, paint);
        interfaceC1027y.mo877l();
    }

    /* renamed from: a */
    public static boolean m488a(Unit unit, boolean z, boolean z2) {
        if (unit.m5803cq() && z2) {
            return false;
        }
        if ((z && ((unit instanceof AbstractC0309b) || (unit instanceof AbstractC0590f))) || unit.m5867bI()) {
            return false;
        }
        if ((z && (unit.m5800ct() || unit.m5802cr())) || unit.m5903P() || unit.f1650cL != null || unit.f1651cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Paint m505a() {
        C0930ag c0930ag = new C0930ag();
        if (GameEngine.getInstance().f6109bQ.renderAntiAlias) {
            c0930ag.m7248a(true);
            c0930ag.m7231d(true);
            c0930ag.m7239b(true);
        } else {
            c0930ag.m7248a(false);
            c0930ag.m7231d(false);
            c0930ag.m7239b(false);
        }
        return c0930ag;
    }

    /* renamed from: b */
    public static C0930ag m483b() {
        C0930ag c0930ag = new C0930ag();
        c0930ag.m1053a(false);
        c0930ag.m7231d(false);
        c0930ag.m7239b(false);
        return c0930ag;
    }

    /* renamed from: a */
    public static void m487a(AbstractC0623y abstractC0623y) {
        if (!abstractC0623y.isDead) {
            int mo3512bl = abstractC0623y.mo3512bl();
            for (int i = 0; i < mo3512bl; i++) {
                m486a(abstractC0623y, i);
            }
        }
    }

    /* renamed from: a */
    public static void m485a(AbstractC0623y abstractC0623y, BitmapOrTexture bitmapOrTexture, float f, int i) {
        if (!abstractC0623y.isDead && f != 0.0f) {
            GameEngine gameEngine = GameEngine.getInstance();
            C1080ai m3250D = abstractC0623y.m3250D(i);
            gameEngine.graphics.mo878k();
            gameEngine.graphics.mo896b(m3250D.f6843a - gameEngine.f6138cv, ((m3250D.f6844b - m3250D.f6845c) - abstractC0623y.height) - gameEngine.f6139cw);
            gameEngine.graphics.mo935a(f, f);
            gameEngine.graphics.mo915a(bitmapOrTexture, 0.0f, 0.0f, (Paint) null);
            gameEngine.graphics.mo877l();
        }
    }

    /* renamed from: a */
    public static void m486a(AbstractC0623y abstractC0623y, int i) {
        BitmapOrTexture mo3507d = abstractC0623y.mo3507d(i);
        if (mo3507d == null) {
            return;
        }
        float m3030p = abstractC0623y.m3030p(i);
        Paint m3166aN = abstractC0623y.m3166aN();
        GameEngine gameEngine = GameEngine.getInstance();
        C1080ai m3246F = abstractC0623y.m3246F(i);
        float f = m3246F.f6843a - GameEngine.getInstance().f6138cv;
        float f2 = ((m3246F.f6844b - GameEngine.getInstance().f6139cw) - abstractC0623y.height) - m3246F.f6845c;
        InterfaceC1027y interfaceC1027y = gameEngine.graphics;
        interfaceC1027y.mo878k();
        if (m3030p != 1.0f) {
            interfaceC1027y.mo933a(m3030p, m3030p, f, f2);
        }
        interfaceC1027y.mo934a(abstractC0623y.f1648cJ[i].f1711a + 90.0f, f, f2);
        interfaceC1027y.mo890b(mo3507d, (f - mo3507d.f6400t) - abstractC0623y.m3055h(i), (f2 - mo3507d.f6401u) - abstractC0623y.m3051i(i), m3166aN);
        interfaceC1027y.mo877l();
    }

    /* renamed from: a */
    public static boolean m494a(Unit unit, float f, float f2) {
        return !m501a(f, f2, unit.mo5645h());
    }

    /* renamed from: a */
    public static boolean m501a(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = GameEngine.getInstance().f6113bU;
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        c0173b.m6652a(f, f2);
        return c0907l.m1313a(enumC0246ao, c0173b.f800T, c0173b.f801U);
    }

    /* renamed from: b */
    public static short m480b(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = GameEngine.getInstance().f6113bU;
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        C0904i m1314a = c0907l.m1314a(enumC0246ao);
        if (m1314a.f5957g == null) {
            return (short) -3;
        }
        c0173b.m6652a(f, f2);
        int i = c0173b.f800T;
        int i2 = c0173b.f801U;
        if (!c0173b.m6608c(i, i2)) {
            return (short) -2;
        }
        return m1314a.f5957g[(i * m1314a.f5953c) + i2];
    }

    /* renamed from: c */
    public static int m475c(float f, float f2, EnumC0246ao enumC0246ao) {
        short m480b = m480b(f, f2, enumC0246ao);
        if (m480b == -3 || m480b == -2 || m480b == -1 || m480b == 0) {
            return 0;
        }
        Integer num = (Integer) GameEngine.getInstance().f6113bU.m1314a(enumC0246ao).f5958h.get(Short.valueOf(m480b));
        if (num == null) {
            GameEngine.m1145b("Could not find groupSize for:" + ((int) m480b) + " at X:" + f + " y:" + f2);
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static boolean m503a(float f, float f2) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        if (c0173b == null) {
            GameEngine.PrintLog("isInMap called without map loaded");
            return false;
        }
        return c0173b.m6608c((int) (f * c0173b.f788r), (int) (f2 * c0173b.f789s));
    }

    /* renamed from: b */
    public static boolean m481b(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        if (c0173b == null) {
            GameEngine.PrintLog("isOverClift called without map loaded");
            return false;
        }
        return gameEngine.f6113bU.m1301b((int) (f * c0173b.f788r), (int) (f2 * c0173b.f789s));
    }

    /* renamed from: c */
    public static boolean m476c(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        if (c0173b == null) {
            GameEngine.PrintLog("isOverWater called without map loaded");
            return false;
        }
        return gameEngine.f6113bU.m1316a((int) (f * c0173b.f788r), (int) (f2 * c0173b.f789s));
    }

    /* renamed from: d */
    public static boolean m474d(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        if (c0173b == null) {
            GameEngine.PrintLog("isOverLiquid called without map loaded");
            return false;
        }
        C0180g m6609c = c0173b.m6609c(f, f2);
        if (m6609c == null) {
            return false;
        }
        if (m6609c.f917e || m6609c.f919g) {
            return true;
        }
        return gameEngine.f6113bU.m1316a((int) (f * c0173b.f788r), (int) (f2 * c0173b.f789s));
    }

    /* renamed from: a */
    public static final Paint m499a(int i, int i2, int i3, int i4, Paint.Style style) {
        return m498a(CommonUtils.m2309b(i, i2, i3, i4), style);
    }

    /* renamed from: a */
    public static final Paint m498a(int i, Paint.Style style) {
        for (int i2 = 0; i2 < f6940g.length; i2++) {
            if (f6940g[i2] == null) {
                C1118z c1118z = new C1118z(i, style);
                f6940g[i2] = c1118z;
                return c1118z.f6944c;
            }
            C1118z c1118z2 = f6940g[i2];
            if (c1118z2.f6942a == i && c1118z2.f6943b == style) {
                return c1118z2.f6944c;
            }
        }
        if (!f6941h) {
            f6941h = true;
            GameEngine.m1145b("----- getCachingPaint --- Paint fallback was needed!!");
        }
        f6939f.m7242b(i);
        f6939f.m7260a(style);
        return f6939f;
    }

    /* renamed from: a */
    public static void m504a(float f) {
        if (f6936c.size() == 0) {
            return;
        }
        Iterator it = f6936c.iterator();
        while (it.hasNext()) {
            C1071aa c1071aa = (C1071aa) it.next();
            if (c1071aa.f6814e <= 0.0f) {
                it.remove();
            } else {
                c1071aa.f6814e -= f;
                if (f == 0.0f && c1071aa.f6814e < 1.0f) {
                    c1071aa.f6814e = -1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m482b(float f) {
        if (f6936c.size() == 0) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = f6936c.iterator();
        while (it.hasNext()) {
            C1071aa c1071aa = (C1071aa) it.next();
            float f2 = c1071aa.f6811b.f234a;
            float f3 = c1071aa.f6811b.f235b;
            float f4 = c1071aa.f6811b.f236c;
            float f5 = c1071aa.f6811b.f237d;
            if (c1071aa.f6813d) {
                f2 -= GameEngine.getInstance().f6138cv;
                f3 -= GameEngine.getInstance().f6139cw;
                f4 -= GameEngine.getInstance().f6138cv;
                f5 -= GameEngine.getInstance().f6139cw;
            }
            if (c1071aa.f6812c) {
                gameEngine.graphics.mo932a(f2, f3, f4, f5, c1071aa.f6810a);
            } else {
                if (c1071aa.f6813d) {
                }
                gameEngine.graphics.mo920a(c1071aa.f6811b, c1071aa.f6810a);
            }
            if (c1071aa.f6815f != null) {
                gameEngine.graphics.mo880i();
                gameEngine.m1217R();
                float f6 = f4;
                float f7 = f5;
                if (c1071aa.f6813d) {
                    f6 *= gameEngine.f6250cW;
                    f7 *= gameEngine.f6250cW;
                }
                gameEngine.graphics.mo903a(c1071aa.f6815f, f6, f7, c1071aa.f6810a);
                gameEngine.graphics.mo879j();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m500a(int i, int i2) {
        int i3 = GameEngine.getInstance().f6096by;
        if (i + i2 < i3 || i3 < i - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m479b(int i, int i2) {
        int i3 = GameEngine.getInstance().f6096by;
        if (i >= 0 && i + i2 >= i3 && i <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m502a(float f, float f2, float f3, float f4, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == EnumC0246ao.f1705d || enumC0246ao == EnumC0246ao.f1702a) {
            return true;
        }
        short m480b = m480b(f, f2, enumC0246ao);
        short m480b2 = m480b(f3, f4, enumC0246ao);
        if (m480b == -3 || m480b2 == -3) {
            String str = "null";
            if (enumC0246ao != null) {
                str = enumC0246ao.name();
            }
            GameEngine.m1120g("pathPossible: no isolatedGroups found! (" + str + ")");
        }
        if (m480b != -1 && m480b2 != -1 && m480b != -2 && m480b2 != -2 && m480b == m480b2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m478b(Unit unit, float f, float f2) {
        return m502a(unit.f6951ek, unit.f6952el, f, f2, unit.mo5645h());
    }

    /* renamed from: a */
    public static void m497a(Team team, PointF pointF) {
        GameEngine gameEngine = GameEngine.getInstance();
        for (int i = 0; i <= 2; i++) {
            Iterator it = Unit.m5870bF().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if ((unit instanceof Unit) && !unit.isDead && unit.team == team) {
                    if (i == 0 && unit.f1600bN) {
                        pointF.m7213a(unit.f6951ek, unit.f6952el);
                        return;
                    } else if (i == 1 && unit.f1601bO) {
                        pointF.m7213a(unit.f6951ek, unit.f6952el);
                        return;
                    } else if (i == 2) {
                        pointF.m7213a(unit.f6951ek, unit.f6952el);
                        return;
                    }
                }
            }
        }
        pointF.m7213a(gameEngine.f6104bL.m6589i() / 2.0f, gameEngine.f6104bL.m6588j() / 2.0f);
    }

    /* renamed from: a */
    public static void m489a(Unit unit, AbstractC0623y abstractC0623y) {
        unit.f1650cL = null;
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
            if (abstractC0623y2.f1651cM == abstractC0623y) {
                if (abstractC0623y2.m5778dl() == null) {
                    GameEngine.PrintLog("Unload, attachment data is null");
                }
                abstractC0623y2.m3081bx();
            }
        }
    }
}

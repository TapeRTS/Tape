package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a.class */
public class C0741a {

    /* renamed from: a */
    float f4641a;

    /* renamed from: b */
    float f4642b;

    /* renamed from: c */
    public boolean f4643c;

    /* renamed from: d */
    public InterfaceC0303as f4644d;

    /* renamed from: e */
    public Team f4645e;

    /* renamed from: g */
    public float f4646g;

    /* renamed from: h */
    public float f4647h;

    /* renamed from: i */
    public boolean f4648i;

    /* renamed from: j */
    public Team f4649j;

    /* renamed from: k */
    public boolean f4650k;

    /* renamed from: l */
    public int f4651l;

    /* renamed from: m */
    public int f4652m;

    /* renamed from: n */
    public boolean f4653n;

    /* renamed from: o */
    public AbstractC0623y f4654o;

    /* renamed from: r */
    public int f4655r;

    /* renamed from: s */
    public float f4656s;

    /* renamed from: u */
    public boolean f4657u;

    /* renamed from: v */
    public Unit f4658v;

    /* renamed from: D */
    static Paint f4659D;

    /* renamed from: w */
    public static C1104o f4660w = new C1104o();

    /* renamed from: x */
    static Point f4661x = new Point();

    /* renamed from: y */
    static RectF f4662y = new RectF();

    /* renamed from: z */
    static RectF f4663z = new RectF();

    /* renamed from: A */
    static RectF f4664A = new RectF();

    /* renamed from: E */
    static RectF f4665E = new RectF();

    /* renamed from: C */
    static Paint f4666C = new C0930ag();

    /* renamed from: f */
    public int f4667f = 1;

    /* renamed from: p */
    boolean f4668p = false;

    /* renamed from: q */
    public boolean f4669q = false;

    /* renamed from: t */
    public float f4670t = 0.04f;

    /* renamed from: B */
    Paint f4671B = new Paint();

    public C0741a() {
        f4660w.add(this);
        f4660w.m549a();
    }

    static {
        f4666C.m7267a(90, 0, 0, 255);
        f4666C.m7260a(Paint.Style.STROKE);
        f4666C.m7270a(2.0f);
        f4659D = new C0930ag();
        f4659D.m7267a(40, 0, 0, 255);
        f4659D.m7260a(Paint.Style.STROKE);
        f4659D.m7270a(2.0f);
    }

    /* renamed from: a */
    public static void m2581a() {
        f4660w.clear();
    }

    /* renamed from: a */
    public static void m2580a(float f) {
        Iterator it = f4660w.iterator();
        while (it.hasNext()) {
            ((C0741a) it.next()).m2572c(f);
        }
        f4660w.m549a();
    }

    /* renamed from: b */
    public static void m2573b(float f) {
        Object[] m544b = f4660w.m544b();
        int size = f4660w.size();
        for (int i = 0; i < size; i++) {
            ((C0741a) m544b[i]).m2571d(f);
        }
    }

    /* renamed from: a */
    public static boolean m2578a(Team team, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.m6648a(i, i2);
        float f = gameEngine.f6104bL.f800T + gameEngine.f6104bL.f786p;
        float f2 = gameEngine.f6104bL.f801U + gameEngine.f6104bL.f787q;
        f4662y.m7195a(f, f2, f + 1.0f, f2 + 1.0f);
        return m2577a(team, f4662y, i3);
    }

    /* renamed from: a */
    public static boolean m2576a(Team team, AbstractC0623y abstractC0623y, int i) {
        f4662y = abstractC0623y.m5894a(GameEngine.getInstance().f6104bL, f4662y);
        return m2577a(team, f4662y, i);
    }

    /* renamed from: a */
    public static boolean m2575a(AbstractC0623y abstractC0623y, AbstractC0623y abstractC0623y2) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        f4662y = abstractC0623y.m5894a(c0173b, f4662y);
        f4663z = abstractC0623y2.m5894a(c0173b, f4663z);
        if (CommonUtils.m2348a(f4662y, f4663z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2577a(Team team, RectF rectF, int i) {
        C0173b c0173b = GameEngine.getInstance().f6104bL;
        RectF rectF2 = f4664A;
        Iterator it = f4660w.iterator();
        while (it.hasNext()) {
            C0741a c0741a = (C0741a) it.next();
            if (c0741a.f4649j == team && c0741a.f4653n && (i == -1 || i == c0741a.f4655r)) {
                Unit m5890a = Unit.m5890a(c0741a.f4644d);
                if (m5890a == null) {
                    GameEngine.PrintLog("isTileRectOverBlueprint: Failed to get shared unit for: " + c0741a.f4644d);
                } else {
                    m5890a.f6951ek = c0741a.f4646g;
                    m5890a.f6952el = c0741a.f4647h;
                    rectF2 = m5890a.m5894a(c0173b, rectF2);
                    if (CommonUtils.m2348a(rectF2, rectF)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C0741a m2579a(Team team, float f, float f2) {
        Iterator it = f4660w.iterator();
        while (it.hasNext()) {
            C0741a c0741a = (C0741a) it.next();
            if (c0741a.f4649j == team && c0741a.f4653n) {
                float m2366a = CommonUtils.m2366a(c0741a.f4646g, c0741a.f4647h, f, f2);
                float f3 = Unit.m5890a(c0741a.f4644d).radius + 1.0f;
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                if (m2366a < f3 * f3) {
                    return c0741a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2574b() {
        if (this.f4653n) {
            if (this.f4654o == null || this.f4654o.isDead || !UnitType.m5738a(this.f4644d, this.f4646g, this.f4647h, 0.0f, 0.0f, this.f4645e)) {
                return false;
            }
            return true;
        } else if (this.f4658v == null || this.f4658v.m5815ce()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public void m2572c(float f) {
        this.f4641a += 1.0f;
        this.f4642b += f;
        boolean z = false;
        this.f4656s = CommonUtils.m2368a(this.f4656s, this.f4670t * f);
        if (this.f4653n) {
            if (this.f4641a > 6.0f) {
                this.f4641a = 0.0f;
                boolean m3197a = this.f4654o.m3197a(this.f4644d, this.f4646g, this.f4647h);
                if (!this.f4668p && m3197a) {
                    this.f4668p = true;
                }
                if (!m3197a) {
                    if (this.f4668p) {
                        z = true;
                    } else if (this.f4642b > 180.0f) {
                        z = true;
                    }
                }
                if (!m2574b()) {
                    z = true;
                }
            }
        } else if (this.f4641a > 2.0f && !m2574b()) {
            z = true;
        }
        if (z) {
            this.f4643c = true;
            f4660w.m542b(this);
        }
    }

    /* renamed from: d */
    public void m2571d(float f) {
        Unit m5847c;
        Rect m5817cc;
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6093bs != this.f4649j || !gameEngine.f6245cN.m7189b(this.f4646g, this.f4647h)) {
            return;
        }
        if (this.f4669q && !this.f4668p) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.f4646g;
        float f4 = this.f4647h;
        boolean z = false;
        boolean z2 = false;
        if (this.f4653n) {
            z2 = true;
        } else {
            z = true;
        }
        boolean z3 = true;
        if (this.f4648i) {
            z3 = false;
        }
        if (z2) {
            float f5 = this.f4656s;
            if (f5 <= 0.0f) {
                f2 = 0.0f;
            } else if (this.f4656s < 1.0f) {
                f2 = 1.0f - CommonUtils.m2249i(f5 * 90.0f);
            } else {
                f2 = 1.0f;
            }
        }
        if (z2 && this.f4656s < 1.0f && (m5847c = Unit.m5847c(this.f4644d)) != null && m5847c.m5867bI() && (m5817cc = m5847c.m5817cc()) != null) {
            f4665E.m7194a(m5817cc);
            f4665E.f235b *= gameEngine.f6104bL.f785o;
            f4665E.f237d *= gameEngine.f6104bL.f785o;
            f4665E.f234a *= gameEngine.f6104bL.f784n;
            f4665E.f236c *= gameEngine.f6104bL.f784n;
            f4665E.m7196a(-(m5847c.m5823cX() - gameEngine.f6104bL.f786p), -(m5847c.m5822cY() - gameEngine.f6104bL.f787q));
            CommonUtils.m2349a(f4665E, (gameEngine.f6104bL.f786p - 3) + (f2 * 5.0f));
            f4665E.m7196a(this.f4646g - gameEngine.f6138cv, (this.f4647h - gameEngine.f6139cw) - 0.0f);
            float f6 = 3.0f + (f2 * 7.0f);
            Paint paint = f4666C;
            if (this.f4656s <= 0.0f) {
                paint = f4659D;
            }
            gameEngine.graphics.mo932a(f4665E.f234a - f6, f4665E.f235b, f4665E.f236c + f6, f4665E.f235b, paint);
            gameEngine.graphics.mo932a(f4665E.f234a - f6, f4665E.f237d, f4665E.f236c + f6, f4665E.f237d, paint);
            gameEngine.graphics.mo932a(f4665E.f234a, f4665E.f235b - f6, f4665E.f234a, f4665E.f237d + f6, paint);
            gameEngine.graphics.mo932a(f4665E.f236c, f4665E.f235b - f6, f4665E.f236c, f4665E.f237d + f6, paint);
        }
        float f7 = 0.0f;
        if (z2) {
            f7 = 0.0f - (10.0f * f2);
        }
        UnitType.m5736a(this.f4644d, f3, f4 + f7, 0.0f, 0.0f, this.f4645e, 1.0f, 500.0f, z, z2, this.f4667f, z3, null);
    }
}

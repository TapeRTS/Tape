package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0155g;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.p014b.AbstractC0274b;
import com.corrodinggames.rts.game.units.p028h.AbstractC0497f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p037h.C0731e;
import com.corrodinggames.rts.gameFramework.p037h.C0734h;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/y.class */
public final class C0851y {

    /* renamed from: a */
    static Paint f5824a = new Paint();

    /* renamed from: b */
    static RectF f5825b = new RectF();

    /* renamed from: c */
    static ArrayList f5826c = new ArrayList();

    /* renamed from: d */
    static final Rect f5827d = new Rect();

    /* renamed from: e */
    static final RectF f5828e = new RectF();

    /* renamed from: f */
    static Paint f5829f = new Paint();

    /* renamed from: g */
    static C0852z[] f5830g = new C0852z[30];

    /* renamed from: h */
    static boolean f5831h = false;

    static {
        f5824a.m4189a(205, 255, 0, 0);
        f5824a.m4184a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public static void m428a(AbstractC0210af afVar, float f) {
        m423a(afVar, f, false, false);
    }

    /* renamed from: a */
    public static void m425a(AbstractC0210af afVar, float f, boolean z) {
        m423a(afVar, f, z, false);
    }

    /* renamed from: a */
    public static boolean m429a(AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (!afVar.f1494ci || u.f5518bA.m1659p() != 1 || u.f5518bA.f4279d.f4109e) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m423a(AbstractC0210af afVar, float f, boolean z, boolean z2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (m429a(afVar) || z) {
            float f2 = afVar.f5842dH - u.f5547cd;
            float f3 = afVar.f5843dI - u.f5548ce;
            Paint paint = AbstractC0210af.f1520cI;
            if (z2) {
                paint = AbstractC0210af.f1521cJ;
            }
            u.f5514bw.mo195a(f2, f3, f, paint);
        }
    }

    /* renamed from: a */
    public static void m426a(AbstractC0210af afVar, float f, int i, int i2, boolean z) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if ((afVar.f1494ci && u.f5518bA.m1659p() < 10) || z) {
            float f2 = afVar.f5842dH - u.f5547cd;
            float f3 = afVar.f5843dI - u.f5548ce;
            Paint paint = AbstractC0210af.f1524cM;
            paint.m4169b(i);
            paint.m4192a(i2);
            u.f5514bw.mo195a(f2, f3, f, paint);
        }
    }

    /* renamed from: b */
    public static void m410b(AbstractC0210af afVar, float f, boolean z) {
        m424a(afVar, f, z, AbstractC0210af.f1522cK);
    }

    /* renamed from: a */
    public static void m424a(AbstractC0210af afVar, float f, boolean z, Paint paint) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (m429a(afVar) || z) {
            u.f5514bw.mo195a(afVar.f5842dH - u.f5547cd, afVar.f5843dI - u.f5548ce, f, paint);
        }
    }

    /* renamed from: a */
    public static void m417a(C0748e eVar, float f, float f2, float f3, float f4, float f5, Paint paint, int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i4 = 0 + (i3 * i);
        f5827d.m4136a(i4, 0, i4 + i, 0 + i2);
        float f6 = f5 * 0.5f;
        float f7 = f2 - f3;
        float f8 = i * f6;
        float f9 = i2 * f6;
        f5828e.m4122a(f - f8, f7 - f9, f + f8, f7 + f9);
        AbstractC0755l lVar = u.f5514bw;
        lVar.mo125j();
        lVar.mo199a(f4 + 90.0f, f, f7);
        if (f5 != 1.0f) {
            lVar.mo198a(f5, f5, f, f7);
        }
        lVar.mo169a(eVar, f5827d, f5828e, paint);
        lVar.mo124k();
    }

    /* renamed from: a */
    public static boolean m421a(AbstractC0210af afVar, boolean z, boolean z2) {
        if (afVar.mo2498cc() && z2) {
            return false;
        }
        if ((z && ((afVar instanceof AbstractC0274b) || (afVar instanceof AbstractC0497f))) || afVar.mo2643bw()) {
            return false;
        }
        if ((!z || (!afVar.mo2384cf() && !afVar.mo2836cd())) && !afVar.mo2364O() && afVar.f1501cp == null && afVar.f1502cq == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Paint m438a() {
        C0760q qVar = new C0760q();
        if (AbstractC0789l.m638u().f5516by.renderAntiAlias) {
            qVar.m4173a(true);
            qVar.m4158d(true);
            qVar.m4166b(true);
        } else {
            qVar.m4173a(false);
            qVar.m4158d(false);
            qVar.m4166b(false);
        }
        return qVar;
    }

    /* renamed from: b */
    public static C0760q m416b() {
        C0760q qVar = new C0760q();
        qVar.m4173a(false);
        qVar.m4158d(false);
        qVar.m4166b(false);
        return qVar;
    }

    /* renamed from: a */
    public static void m420a(AbstractC0515r rVar) {
        if (!rVar.f1459bz) {
            int bg = rVar.mo2205bg();
            for (int i = 0; i < bg; i++) {
                m419a(rVar, i);
            }
        }
    }

    /* renamed from: a */
    public static void m418a(AbstractC0515r rVar, C0748e eVar, float f, int i) {
        if (!rVar.f1459bz && f != 0.0f) {
            AbstractC0789l u = AbstractC0789l.m638u();
            C0814ag D = rVar.mo2347D(i);
            u.f5514bw.mo125j();
            u.f5514bw.mo147b(D.f5735a - u.f5547cd, ((D.f5736b - D.f5737c) - rVar.f5844dJ) - u.f5548ce);
            u.f5514bw.mo200a(f, f);
            u.f5514bw.mo175a(eVar, 0.0f, 0.0f, (Paint) null);
            u.f5514bw.mo124k();
        }
    }

    /* renamed from: a */
    public static void m419a(AbstractC0515r rVar, int i) {
        C0748e d = rVar.mo2184d(i);
        if (d != null) {
            float p = rVar.mo2143p(i);
            Paint aK = rVar.mo2269aK();
            AbstractC0789l u = AbstractC0789l.m638u();
            PointF F = rVar.mo2343F(i);
            float f = F.f224a - AbstractC0789l.m638u().f5547cd;
            float f2 = (F.f225b - AbstractC0789l.m638u().f5548ce) - rVar.f5844dJ;
            AbstractC0755l lVar = u.f5514bw;
            lVar.mo125j();
            if (p != 1.0f) {
                lVar.mo198a(p, p, f, f2);
            }
            lVar.mo199a(rVar.f1499cn[i].f1561a + 90.0f, f, f2);
            lVar.mo140b(d, (f - d.f5249o) - rVar.mo2169h(i), (f2 - d.f5250p) - rVar.mo2165i(i), aK);
            lVar.mo124k();
        }
    }

    /* renamed from: a */
    public static boolean m427a(AbstractC0210af afVar, float f, float f2) {
        return !m434a(f, f2, afVar.mo2358h());
    }

    /* renamed from: a */
    public static boolean m434a(float f, float f2, EnumC0212ah ahVar) {
        C0734h hVar = AbstractC0789l.m638u().f5520bC;
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        bVar.m3703a(f, f2);
        return hVar.m958a(ahVar, bVar.f764M, bVar.f765N);
    }

    /* renamed from: b */
    public static short m413b(float f, float f2, EnumC0212ah ahVar) {
        C0734h hVar = AbstractC0789l.m638u().f5520bC;
        C0148b bVar = AbstractC0789l.m638u().f5511bt;
        C0731e a = hVar.m959a(ahVar);
        if (a.f5093g == null) {
            return (short) -3;
        }
        bVar.m3703a(f, f2);
        int i = bVar.f764M;
        int i2 = bVar.f765N;
        if (!bVar.m3661c(i, i2)) {
            return (short) -2;
        }
        return a.f5093g[(i * a.f5089c) + i2];
    }

    /* renamed from: c */
    public static int m408c(float f, float f2, EnumC0212ah ahVar) {
        short b = m413b(f, f2, ahVar);
        if (b == -3 || b == -2 || b == -1 || b == 0) {
            return 0;
        }
        Integer num = (Integer) AbstractC0789l.m638u().f5520bC.m959a(ahVar).f5094h.get(Short.valueOf(b));
        if (num != null) {
            return num.intValue();
        }
        AbstractC0789l.m682b("Could not find groupSize for:" + ((int) b) + " at X:" + f + " y:" + f2);
        return 0;
    }

    /* renamed from: a */
    public static boolean m436a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        if (bVar == null) {
            AbstractC0789l.m670d("isOverClift called without map loaded");
            return false;
        }
        return u.f5520bC.m946b((int) (f * bVar.f739o), (int) (f2 * bVar.f740p));
    }

    /* renamed from: b */
    public static boolean m414b(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        if (bVar == null) {
            AbstractC0789l.m670d("isOverWater called without map loaded");
            return false;
        }
        return u.f5520bC.m961a((int) (f * bVar.f739o), (int) (f2 * bVar.f740p));
    }

    /* renamed from: c */
    public static boolean m409c(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        if (bVar == null) {
            AbstractC0789l.m670d("isOverLiquid called without map loaded");
            return false;
        }
        C0155g c = bVar.m3662c(f, f2);
        if (c == null) {
            return false;
        }
        if (c.f853e || c.f855g) {
            return true;
        }
        return u.f5520bC.m961a((int) (f * bVar.f739o), (int) (f2 * bVar.f740p));
    }

    /* renamed from: a */
    public static final Paint m432a(int i, int i2, int i3, int i4, Paint.Style style) {
        return m431a(C0654f.m1470b(i, i2, i3, i4), style);
    }

    /* renamed from: a */
    public static final Paint m431a(int i, Paint.Style style) {
        for (int i2 = 0; i2 < f5830g.length; i2++) {
            if (f5830g[i2] == null) {
                C0852z zVar = new C0852z(i, style);
                f5830g[i2] = zVar;
                return zVar.f5834c;
            }
            C0852z zVar2 = f5830g[i2];
            if (zVar2.f5832a == i && zVar2.f5833b == style) {
                return zVar2.f5834c;
            }
        }
        if (!f5831h) {
            f5831h = true;
            AbstractC0789l.m682b("----- getCachingPaint --- Paint fallback was needed!!");
        }
        f5829f.m4169b(i);
        f5829f.m4184a(style);
        return f5829f;
    }

    /* renamed from: a */
    public static void m437a(float f) {
        if (f5826c.size() != 0) {
            Iterator it = f5826c.iterator();
            while (it.hasNext()) {
                C0808aa aaVar = (C0808aa) it.next();
                if (aaVar.f5714e <= 0.0f) {
                    it.remove();
                } else {
                    aaVar.f5714e -= f;
                    if (f == 0.0f && aaVar.f5714e < 1.0f) {
                        aaVar.f5714e = -1.0f;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m415b(float f) {
        if (f5826c.size() != 0) {
            AbstractC0789l u = AbstractC0789l.m638u();
            Iterator it = f5826c.iterator();
            while (it.hasNext()) {
                C0808aa aaVar = (C0808aa) it.next();
                float f2 = aaVar.f5711b.f231a;
                float f3 = aaVar.f5711b.f232b;
                float f4 = aaVar.f5711b.f233c;
                float f5 = aaVar.f5711b.f234d;
                if (aaVar.f5713d) {
                    f2 -= AbstractC0789l.m638u().f5547cd;
                    f3 -= AbstractC0789l.m638u().f5548ce;
                    f4 -= AbstractC0789l.m638u().f5547cd;
                    f5 -= AbstractC0789l.m638u().f5548ce;
                }
                if (aaVar.f5712c) {
                    u.f5514bw.mo197a(f2, f3, f4, f5, aaVar.f5710a);
                } else {
                    if (aaVar.f5713d) {
                    }
                    u.f5514bw.mo179a(aaVar.f5711b, aaVar.f5710a);
                }
                if (aaVar.f5715f != null) {
                    u.f5514bw.mo127h();
                    u.m749L();
                    float f6 = f4;
                    float f7 = f5;
                    if (aaVar.f5713d) {
                        f6 *= u.f5574cE;
                        f7 *= u.f5574cE;
                    }
                    u.f5514bw.mo158a(aaVar.f5715f, f6, f7, aaVar.f5710a);
                    u.f5514bw.mo126i();
                }
            }
        }
    }

    /* renamed from: a */
    public static final boolean m433a(int i, int i2) {
        int i3 = AbstractC0789l.m638u().f5499bh;
        if (i + i2 >= i3 && i3 >= i - 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m412b(int i, int i2) {
        int i3 = AbstractC0789l.m638u().f5499bh;
        if (i >= 0 && i + i2 >= i3 && i <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m435a(float f, float f2, float f3, float f4, EnumC0212ah ahVar) {
        if (ahVar == EnumC0212ah.AIR || ahVar == EnumC0212ah.NONE) {
            return true;
        }
        short b = m413b(f, f2, ahVar);
        short b2 = m413b(f3, f4, ahVar);
        if (b == -3 || b2 == -3) {
            String str = "null";
            if (ahVar != null) {
                str = ahVar.name();
            }
            AbstractC0789l.m663f("pathPossible: no isolatedGroups found! (" + str + ")");
        }
        if (b == -1 || b2 == -1 || b == -2 || b2 == -2 || b != b2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m411b(AbstractC0210af afVar, float f, float f2) {
        return m435a(afVar.f5842dH, afVar.f5843dI, f, f2, afVar.mo2358h());
    }

    /* renamed from: a */
    public static void m430a(AbstractC0171m mVar, PointF pointF) {
        AbstractC0789l u = AbstractC0789l.m638u();
        for (int i = 0; i <= 2; i++) {
            Iterator it = AbstractC0210af.m3317bt().iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar = (AbstractC0210af) it.next();
                if ((afVar instanceof AbstractC0210af) && !afVar.f1459bz && afVar.f1461bB == mVar) {
                    if (i == 0 && afVar.f1453bt) {
                        pointF.m4141a(afVar.f5842dH, afVar.f5843dI);
                        return;
                    } else if (i == 1 && afVar.f1454bu) {
                        pointF.m4141a(afVar.f5842dH, afVar.f5843dI);
                        return;
                    } else if (i == 2) {
                        pointF.m4141a(afVar.f5842dH, afVar.f5843dI);
                        return;
                    }
                }
            }
        }
        pointF.m4141a(u.f5511bt.m3649f() / 2.0f, u.f5511bt.m3646g() / 2.0f);
    }

    /* renamed from: a */
    public static void m422a(AbstractC0210af afVar, AbstractC0515r rVar) {
        afVar.f1501cp = null;
        if (afVar instanceof AbstractC0515r) {
            AbstractC0515r rVar2 = (AbstractC0515r) afVar;
            if (rVar2.f1502cq == rVar) {
                if (rVar2.m3306cV() == null) {
                    AbstractC0789l.m670d("Unload, attachment data is null");
                }
                rVar2.m2193bs();
            }
        }
    }
}

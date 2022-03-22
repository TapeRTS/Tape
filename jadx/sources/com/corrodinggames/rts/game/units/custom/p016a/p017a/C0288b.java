package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0174p;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0376s;
import com.corrodinggames.rts.game.units.custom.C0377t;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/b.class */
public class C0288b extends AbstractC0286a {

    /* renamed from: a */
    public boolean f1763a;

    /* renamed from: b */
    public boolean f1764b;

    /* renamed from: c */
    public EnumC0271ao f1765c;

    /* renamed from: d */
    public C0377t f1766d;

    /* renamed from: e */
    public boolean f1767e;

    /* renamed from: f */
    public C0365i f1768f;

    /* renamed from: g */
    public EnumC0174p f1769g;

    /* renamed from: h */
    public float f1770h;

    /* renamed from: i */
    public boolean f1771i;

    /* renamed from: j */
    public C0365i f1772j;

    /* renamed from: k */
    public EnumC0174p f1773k;

    /* renamed from: l */
    public float f1774l;

    /* renamed from: m */
    public boolean f1775m;

    /* renamed from: n */
    public boolean f1776n;

    /* renamed from: o */
    public PointF f1777o;

    /* renamed from: p */
    public PointF f1778p;

    /* renamed from: q */
    public PointF f1779q;

    /* renamed from: r */
    public float f1780r = -1.0f;

    /* renamed from: s */
    public C0376s f1781s;

    /* renamed from: t */
    public C0376s f1782t;

    /* renamed from: u */
    public static C0270an f1783u = new C0270an();

    /* renamed from: v */
    public static final C0289c f1784v = new C0289c();

    /* renamed from: a */
    public static void m3205a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        boolean z2 = false;
        boolean booleanValue = abVar.m594a(str, str2 + "clearAllWaypoints", (Boolean) false).booleanValue();
        if (booleanValue) {
            z2 = true;
        }
        boolean booleanValue2 = abVar.m594a(str, str2 + "clearActiveWaypoint", (Boolean) false).booleanValue();
        if (booleanValue2) {
            z2 = true;
        }
        EnumC0271ao aoVar = (EnumC0271ao) abVar.m593a(str, "addWaypoint_type", (Enum) null, EnumC0271ao.class);
        boolean booleanValue3 = abVar.m594a(str, str2 + "addWaypoint_prepend", (Boolean) false).booleanValue();
        C0365i a = abVar.m609a(lVar, str, str2 + "addWaypoint_target_nearestUnit_tagged", (C0365i) null);
        EnumC0174p pVar = (EnumC0174p) abVar.m593a(str, "addWaypoint_target_nearestUnit_team", EnumC0174p.own, EnumC0174p.class);
        float floatValue = abVar.m592a(str, str2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        C0365i a2 = abVar.m609a(lVar, str, str2 + "addWaypoint_target_randomUnit_tagged", (C0365i) null);
        EnumC0174p pVar2 = (EnumC0174p) abVar.m593a(str, "addWaypoint_target_randomUnit_team", EnumC0174p.own, EnumC0174p.class);
        float floatValue2 = abVar.m592a(str, str2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        float floatValue3 = abVar.m581b(str, str2 + "addWaypoint_maxTime", Float.valueOf(-1.0f)).floatValue();
        C0376s a3 = abVar.m607a(lVar, str, str2 + "addWaypoint_triggerActionIfFailed", (C0376s) null);
        C0376s a4 = abVar.m607a(lVar, str, str2 + "addWaypoint_triggerActionIfMatched", (C0376s) null);
        PointF a5 = abVar.m598a(str, str2 + "addWaypoint_position_offsetFromSelf", (PointF) null);
        PointF a6 = abVar.m598a(str, str2 + "addWaypoint_position_relativeOffsetFromSelf", (PointF) null);
        PointF a7 = abVar.m598a(str, str2 + "addWaypoint_position_randomOffsetFromSelf", (PointF) null);
        boolean z3 = (a5 == null && a6 == null && a7 == null) ? false : true;
        boolean z4 = a != null;
        boolean z5 = a2 != null;
        boolean booleanValue4 = abVar.m594a(str, str2 + "addWaypoint_position_fromAction", (Boolean) false).booleanValue();
        if (booleanValue4) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_fromAction cannot be used together");
            } else if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_position_fromAction cannot be used together");
            }
        }
        if ((z4 || z5 || z3) && aoVar == null) {
            throw new RuntimeException("[" + str + "] addWaypoint_type is required when using addWaypoint_*");
        }
        if (aoVar != null) {
            z2 = true;
            if (!z4 && !z5 && !z3 && !booleanValue4) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf is required when using addWaypoint_*");
            }
        }
        if (z3) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
            } else if (!(aoVar == EnumC0271ao.move || aoVar == EnumC0271ao.attackMove)) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
            }
        }
        if (z4 && z5) {
            throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
        } else if (z2) {
            C0288b bVar = new C0288b();
            bVar.f1763a = booleanValue;
            bVar.f1764b = booleanValue2;
            if (aoVar != null) {
                bVar.f1765c = aoVar;
                if (bVar.f1765c == EnumC0271ao.build) {
                    bVar.f1766d = lVar.m2779a(abVar.m579b(str, str2 + "addWaypoint_unitType", (String) null), str2 + "addWaypoint_unitType", str);
                    if (bVar.f1766d == null) {
                        throw new RuntimeException("[" + str + "] addWaypoint_type: build requires addWaypoint_unitType");
                    }
                }
                bVar.f1767e = booleanValue3;
                bVar.f1768f = a;
                bVar.f1769g = pVar;
                bVar.f1770h = floatValue;
                bVar.f1772j = a2;
                bVar.f1773k = pVar2;
                bVar.f1774l = floatValue2;
                if (z5) {
                    bVar.f1771i = true;
                }
                bVar.f1775m = abVar.m594a(str, str2 + "addWaypoint_target_mapMustBeReachable", (Boolean) true).booleanValue();
                bVar.f1777o = a5;
                bVar.f1778p = a6;
                bVar.f1779q = a7;
                bVar.f1776n = booleanValue4;
                bVar.f1780r = floatValue3;
                bVar.f1781s = a3;
                bVar.f1782t = a4;
            }
            cVar.f1920W.add(bVar);
        }
    }

    /* renamed from: a */
    public C0270an m3206a(C0367k kVar, float f, float f2, AbstractC0210af afVar, int i) {
        C0270an anVar;
        if (this.f1780r == 0.0f) {
            anVar = f1783u;
            anVar.m3241e();
        } else if (this.f1767e) {
            anVar = kVar.m2240am();
            kVar.m2278aB();
            kVar.m2227az();
        } else {
            anVar = kVar.m2239an();
        }
        if (this.f1765c == EnumC0271ao.move) {
            anVar.m3257a(f, f2);
        } else if (this.f1765c == EnumC0271ao.attackMove) {
            anVar.m3250b(f, f2);
        } else if (this.f1765c == EnumC0271ao.guard && afVar != null) {
            anVar.m3245c(afVar);
        } else if (this.f1765c == EnumC0271ao.follow && afVar != null) {
            anVar.m3240e(afVar);
        } else if (this.f1765c == EnumC0271ao.loadInto && afVar != null) {
            anVar.m3236g(afVar);
        } else if (this.f1765c == EnumC0271ao.loadUp && afVar != null) {
            anVar.m3234h(afVar);
        } else if (this.f1765c == EnumC0271ao.attack && afVar != null) {
            anVar.m3255a(afVar);
        } else if (this.f1765c == EnumC0271ao.reclaim && afVar != null) {
            anVar.m3238f(afVar);
        } else if (this.f1765c == EnumC0271ao.repair && afVar != null) {
            anVar.m3249b(afVar);
        } else if (this.f1765c == EnumC0271ao.touchTarget && afVar != null) {
            anVar.m3242d(afVar);
        } else if (this.f1765c == EnumC0271ao.build) {
            anVar.m3256a(f, f2, this.f1766d.mo2717c(), 1);
        } else {
            kVar.m2230aw();
        }
        anVar.f1656l = this.f1780r;
        anVar.f1658n = true;
        if (this.f1782t != null) {
            this.f1782t.m2721a(kVar, new PointF(anVar.m3237g(), anVar.m3235h()), anVar.m3233i(), i + 1);
        }
        return anVar;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1763a) {
            kVar.m2229ax();
        } else if (this.f1764b) {
            kVar.m2230aw();
        }
        if (this.f1765c == null) {
            return true;
        }
        if (this.f1776n) {
            if (pointF != null) {
                m3206a(kVar, pointF.f224a, pointF.f225b, (AbstractC0210af) null, i);
                return true;
            } else if (this.f1781s == null) {
                return true;
            } else {
                this.f1781s.m2721a(kVar, pointF, afVar, i + 1);
                return true;
            }
        } else if (this.f1777o != null || this.f1778p != null || this.f1779q != null) {
            float f = kVar.f5842dH;
            float f2 = kVar.f5843dI;
            if (this.f1777o != null) {
                f += this.f1777o.f224a;
                f2 += this.f1777o.f225b;
            }
            if (this.f1778p != null) {
                float f3 = this.f1778p.f224a;
                float f4 = this.f1778p.f225b;
                float i2 = C0654f.m1421i(kVar.f1471bL);
                float h = C0654f.m1425h(kVar.f1471bL);
                f += (i2 * f4) - (h * f3);
                f2 += (h * f4) + (i2 * f3);
            }
            if (this.f1779q != null) {
                f += C0654f.m1499a((AbstractC0854w) kVar, -((int) this.f1779q.f224a), (int) this.f1779q.f224a, i + 1);
                f2 += C0654f.m1499a((AbstractC0854w) kVar, -((int) this.f1779q.f225b), (int) this.f1779q.f225b, i + 2);
            }
            m3206a(kVar, f, f2, (AbstractC0210af) null, i);
            return true;
        } else if (this.f1771i) {
            f1784v.f1787c = this.f1774l * this.f1774l;
            f1784v.f1786b = this.f1772j;
            f1784v.f1788d = false;
            f1784v.f1792h = null;
            f1784v.f1789e = this.f1773k;
            f1784v.f1785a = this.f1775m;
            f1784v.f1790f = true;
            f1784v.f1791g.clear();
            AbstractC0789l.m638u().f5528bK.m2462a(kVar.f5842dH, kVar.f5843dI, this.f1774l, kVar, 0.0f, f1784v);
            if (f1784v.f1791g.size() != 0) {
                C0835m mVar = f1784v.f1791g;
                int a = C0654f.m1499a((AbstractC0854w) kVar, 0, mVar.size() - 1, 0);
                kVar.f1441bi++;
                AbstractC0210af afVar2 = (AbstractC0210af) mVar.get(a);
                m3206a(kVar, afVar2.f5842dH, afVar2.f5843dI, afVar2, i);
                return true;
            } else if (this.f1781s == null) {
                return true;
            } else {
                this.f1781s.m2721a(kVar, pointF, afVar, i + 1);
                return true;
            }
        } else {
            f1784v.f1787c = this.f1770h * this.f1770h;
            f1784v.f1786b = this.f1768f;
            f1784v.f1788d = false;
            f1784v.f1792h = null;
            f1784v.f1789e = this.f1769g;
            f1784v.f1785a = this.f1775m;
            f1784v.f1790f = false;
            AbstractC0789l.m638u().f5528bK.m2462a(kVar.f5842dH, kVar.f5843dI, this.f1770h, kVar, 0.0f, f1784v);
            if (f1784v.f1792h != null) {
                AbstractC0210af afVar3 = f1784v.f1792h;
                m3206a(kVar, afVar3.f5842dH, afVar3.f5843dI, afVar3, i);
                return true;
            } else if (this.f1781s == null) {
                return true;
            } else {
                this.f1781s.m2721a(kVar, pointF, afVar, i + 1);
                return true;
            }
        }
    }
}

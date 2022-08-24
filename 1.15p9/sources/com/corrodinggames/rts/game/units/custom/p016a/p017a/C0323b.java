package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/b.class */
public class C0323b extends AbstractC0321a {

    /* renamed from: a */
    public boolean f1916a;

    /* renamed from: b */
    public boolean f1917b;

    /* renamed from: c */
    public EnumC0306av f1918c;

    /* renamed from: d */
    public C0463u f1919d;

    /* renamed from: e */
    public boolean f1920e;

    /* renamed from: f */
    public C0449h f1921f;

    /* renamed from: g */
    public EnumC0200q f1922g;

    /* renamed from: h */
    public float f1923h;

    /* renamed from: i */
    public boolean f1924i;

    /* renamed from: j */
    public C0449h f1925j;

    /* renamed from: k */
    public EnumC0200q f1926k;

    /* renamed from: l */
    public float f1927l;

    /* renamed from: m */
    public boolean f1928m;

    /* renamed from: n */
    public boolean f1929n;

    /* renamed from: o */
    public PointF f1930o;

    /* renamed from: p */
    public PointF f1931p;

    /* renamed from: q */
    public PointF f1932q;

    /* renamed from: r */
    public LogicBoolean f1933r;

    /* renamed from: s */
    public float f1934s = -1.0f;

    /* renamed from: t */
    public C0462t f1935t;

    /* renamed from: u */
    public C0462t f1936u;

    /* renamed from: v */
    public static C0305au f1937v = new C0305au();

    /* renamed from: w */
    public static final C0324c f1938w = new C0324c();

    /* renamed from: a */
    public static void m5524a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean z2 = false;
        boolean booleanValue = c1072ab.m700a(str, str2 + "clearAllWaypoints", (Boolean) false).booleanValue();
        if (booleanValue) {
            z2 = true;
        }
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "clearActiveWaypoint", (Boolean) false).booleanValue();
        if (booleanValue2) {
            z2 = true;
        }
        EnumC0306av enumC0306av = (EnumC0306av) c1072ab.m699a(str, "addWaypoint_type", (Enum) null, EnumC0306av.class);
        boolean booleanValue3 = c1072ab.m700a(str, str2 + "addWaypoint_prepend", (Boolean) false).booleanValue();
        C0449h m720a = c1072ab.m720a(c0453l, str, str2 + "addWaypoint_target_nearestUnit_tagged", (C0449h) null);
        EnumC0200q enumC0200q = (EnumC0200q) c1072ab.m699a(str, "addWaypoint_target_nearestUnit_team", EnumC0200q.f1389a, EnumC0200q.class);
        float floatValue = c1072ab.m698a(str, str2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        C0449h m720a2 = c1072ab.m720a(c0453l, str, str2 + "addWaypoint_target_randomUnit_tagged", (C0449h) null);
        EnumC0200q enumC0200q2 = (EnumC0200q) c1072ab.m699a(str, "addWaypoint_target_randomUnit_team", EnumC0200q.f1389a, EnumC0200q.class);
        float floatValue2 = c1072ab.m698a(str, str2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        float floatValue3 = c1072ab.m683b(str, str2 + "addWaypoint_maxTime", Float.valueOf(-1.0f)).floatValue();
        C0462t m717a = c1072ab.m717a(c0453l, str, str2 + "addWaypoint_triggerActionIfFailed", (C0462t) null);
        C0462t m717a2 = c1072ab.m717a(c0453l, str, str2 + "addWaypoint_triggerActionIfMatched", (C0462t) null);
        PointF m704a = c1072ab.m704a(str, str2 + "addWaypoint_position_offsetFromSelf", (PointF) null);
        PointF m704a2 = c1072ab.m704a(str, str2 + "addWaypoint_position_relativeOffsetFromSelf", (PointF) null);
        PointF m704a3 = c1072ab.m704a(str, str2 + "addWaypoint_position_randomOffsetFromSelf", (PointF) null);
        boolean z3 = (m704a == null && m704a2 == null && m704a3 == null) ? false : true;
        boolean z4 = m720a != null;
        boolean z5 = m720a2 != null;
        boolean booleanValue4 = c1072ab.m700a(str, str2 + "addWaypoint_position_fromAction", (Boolean) false).booleanValue();
        LogicBoolean m686b = c1072ab.m686b(c0453l, str, str2 + "addWaypoint_target_fromReference", null);
        if (m686b != null) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit/randomUnit and addWaypoint_target_fromReference cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_target_fromReference cannot be used together");
            }
            if (booleanValue4) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_fromAction and addWaypoint_target_fromReference cannot be used together");
            }
        }
        if (booleanValue4) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_fromAction cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_position_fromAction cannot be used together");
            }
        }
        if ((z4 || z5 || z3 || m686b != null) && enumC0306av == null) {
            throw new RuntimeException("[" + str + "] addWaypoint_type is required when using addWaypoint_*");
        }
        if (enumC0306av != null) {
            z2 = true;
            if (!z4 && !z5 && !z3 && !booleanValue4 && m686b == null) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf or addWaypoint_target_fromReference is required when using addWaypoint_*");
            }
        }
        if (z3) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
            }
            if (enumC0306av != EnumC0306av.f1810a && enumC0306av != EnumC0306av.f1817h) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
            }
        }
        if (z4 && z5) {
            throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
        }
        if (z2) {
            C0323b c0323b = new C0323b();
            c0323b.f1916a = booleanValue;
            c0323b.f1917b = booleanValue2;
            if (enumC0306av != null) {
                c0323b.f1918c = enumC0306av;
                if (c0323b.f1918c == EnumC0306av.f1812c) {
                    c0323b.f1919d = c0453l.m4752a(c1072ab.m681b(str, str2 + "addWaypoint_unitType", (String) null), str2 + "addWaypoint_unitType", str);
                    if (c0323b.f1919d == null) {
                        throw new RuntimeException("[" + str + "] addWaypoint_type: build requires addWaypoint_unitType");
                    }
                }
                c0323b.f1920e = booleanValue3;
                c0323b.f1921f = m720a;
                c0323b.f1922g = enumC0200q;
                c0323b.f1923h = floatValue;
                c0323b.f1925j = m720a2;
                c0323b.f1926k = enumC0200q2;
                c0323b.f1927l = floatValue2;
                if (z5) {
                    c0323b.f1924i = true;
                }
                c0323b.f1928m = c1072ab.m700a(str, str2 + "addWaypoint_target_mapMustBeReachable", (Boolean) true).booleanValue();
                c0323b.f1930o = m704a;
                c0323b.f1931p = m704a2;
                c0323b.f1932q = m704a3;
                c0323b.f1929n = booleanValue4;
                c0323b.f1933r = m686b;
                c0323b.f1934s = floatValue3;
                c0323b.f1935t = m717a;
                c0323b.f1936u = m717a2;
            }
            c0339d.f2132ab.add(c0323b);
        }
    }

    /* renamed from: a */
    public C0305au m5526a(C0451j c0451j, float f, float f2, Unit unit, int i) {
        C0305au ap;
        if (this.f1934s == 0.0f) {
            ap = f1937v;
            ap.m5674e();
        } else if (this.f1920e) {
            ap = c0451j.m3138ao();
            c0451j.m3176aD();
            c0451j.m3178aB();
        } else {
            ap = c0451j.m3137ap();
        }
        if (this.f1918c == EnumC0306av.f1810a) {
            ap.m5690a(f, f2);
        } else if (this.f1918c == EnumC0306av.f1817h) {
            ap.m5683b(f, f2);
        } else if (this.f1918c == EnumC0306av.f1820k && unit != null) {
            ap.m5678c(unit);
        } else if (this.f1918c == EnumC0306av.f1823n && unit != null) {
            ap.m5673e(unit);
        } else if (this.f1918c == EnumC0306av.f1814e && unit != null) {
            ap.m5669g(unit);
        } else if (this.f1918c == EnumC0306av.f1818i && unit != null) {
            ap.m5667h(unit);
        } else if (this.f1918c == EnumC0306av.f1811b && unit != null) {
            ap.m5688a(unit);
        } else if (this.f1918c == EnumC0306av.f1816g && unit != null) {
            ap.m5671f(unit);
        } else if (this.f1918c == EnumC0306av.f1813d && unit != null) {
            ap.m5682b(unit);
        } else if (this.f1918c == EnumC0306av.f1822m && unit != null) {
            ap.m5675d(unit);
        } else if (this.f1918c == EnumC0306av.f1812c) {
            ap.m5689a(f, f2, this.f1919d.mo7518c(), 1);
        } else {
            c0451j.m3128ay();
        }
        ap.f1809l = this.f1934s;
        ap.f1804n = true;
        if (this.f1936u != null) {
            this.f1936u.m4687a(c0451j, new PointF(ap.m5670g(), ap.m5668h()), ap.m5666i(), i + 1);
        }
        return ap;
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        if (this.f1916a) {
            c0451j.m3127az();
        } else if (this.f1917b) {
            c0451j.m3128ay();
        }
        if (this.f1918c != null) {
            if (this.f1933r != null) {
                Unit readUnit = this.f1933r.readUnit(c0451j);
                if (readUnit != null) {
                    m5526a(c0451j, readUnit.f6951ek, readUnit.f6952el, readUnit, i);
                    return true;
                } else if (this.f1935t != null) {
                    this.f1935t.m4687a(c0451j, pointF, unit, i + 1);
                    return true;
                } else {
                    return true;
                }
            } else if (this.f1929n) {
                if (pointF == null) {
                    if (this.f1935t != null) {
                        this.f1935t.m4687a(c0451j, pointF, unit, i + 1);
                        return true;
                    }
                    return true;
                }
                m5526a(c0451j, pointF.x, pointF.y, (Unit) null, i);
                return true;
            } else if (this.f1930o != null || this.f1931p != null || this.f1932q != null) {
                float f = c0451j.f6951ek;
                float f2 = c0451j.f6952el;
                if (this.f1930o != null) {
                    f += this.f1930o.x;
                    f2 += this.f1930o.y;
                }
                if (this.f1931p != null) {
                    float f3 = this.f1931p.x;
                    float f4 = this.f1931p.y;
                    float m2249i = CommonUtils.m2249i(c0451j.direction);
                    float sin = CommonUtils.sin(c0451j.direction);
                    f += (m2249i * f4) - (sin * f3);
                    f2 += (sin * f4) + (m2249i * f3);
                }
                if (this.f1932q != null) {
                    f += CommonUtils.m2345a((AbstractC1120w) c0451j, -((int) this.f1932q.x), (int) this.f1932q.x, i + 1);
                    f2 += CommonUtils.m2345a((AbstractC1120w) c0451j, -((int) this.f1932q.y), (int) this.f1932q.y, i + 2);
                }
                m5526a(c0451j, f, f2, (Unit) null, i);
                return true;
            } else if (this.f1924i) {
                f1938w.f1941c = this.f1927l * this.f1927l;
                f1938w.f1940b = this.f1925j;
                f1938w.f1942d = false;
                f1938w.f1946h = null;
                f1938w.f1943e = this.f1926k;
                f1938w.f1939a = this.f1928m;
                f1938w.f1944f = true;
                f1938w.f1945g.clear();
                GameEngine.getInstance().f6121cc.m3792a(c0451j.f6951ek, c0451j.f6952el, this.f1927l, c0451j, 0.0f, f1938w);
                if (f1938w.f1945g.size() == 0) {
                    if (this.f1935t != null) {
                        this.f1935t.m4687a(c0451j, pointF, unit, i + 1);
                        return true;
                    }
                    return true;
                }
                C1101m c1101m = f1938w.f1945g;
                int m2345a = CommonUtils.m2345a((AbstractC1120w) c0451j, 0, c1101m.size(), 0);
                c0451j.f1587bB++;
                if (m2345a > c1101m.size() - 1) {
                    m2345a = c1101m.size() - 1;
                }
                Unit unit2 = (Unit) c1101m.get(m2345a);
                m5526a(c0451j, unit2.f6951ek, unit2.f6952el, unit2, i);
                return true;
            } else {
                f1938w.f1941c = this.f1923h * this.f1923h;
                f1938w.f1940b = this.f1921f;
                f1938w.f1942d = false;
                f1938w.f1946h = null;
                f1938w.f1943e = this.f1922g;
                f1938w.f1939a = this.f1928m;
                f1938w.f1944f = false;
                GameEngine.getInstance().f6121cc.m3792a(c0451j.f6951ek, c0451j.f6952el, this.f1923h, c0451j, 0.0f, f1938w);
                if (f1938w.f1946h == null) {
                    if (this.f1935t != null) {
                        this.f1935t.m4687a(c0451j, pointF, unit, i + 1);
                        return true;
                    }
                    return true;
                }
                Unit unit3 = f1938w.f1946h;
                m5526a(c0451j, unit3.f6951ek, unit3.f6952el, unit3, i);
                return true;
            }
        }
        return true;
    }
}

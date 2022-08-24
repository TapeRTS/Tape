package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/m.class */
public class C0334m extends AbstractC0321a {

    /* renamed from: a */
    public C0424b f2001a;

    /* renamed from: b */
    public boolean f2002b;

    /* renamed from: c */
    public boolean f2003c;

    /* renamed from: e */
    public EnumC0200q f2005e;

    /* renamed from: f */
    public LogicBoolean f2006f;

    /* renamed from: g */
    public C0449h f2007g;

    /* renamed from: i */
    public C0424b f2009i;

    /* renamed from: j */
    public UnitReference f2010j;

    /* renamed from: l */
    public C0462t f2012l;

    /* renamed from: m */
    public C0462t f2013m;

    /* renamed from: n */
    public boolean f2014n;

    /* renamed from: o */
    public boolean f2015o;

    /* renamed from: p */
    public boolean f2016p;

    /* renamed from: q */
    public boolean f2017q;

    /* renamed from: s */
    public static final C1101m f2019s = new C1101m();

    /* renamed from: t */
    public static final C0335n f2020t = new C0335n();

    /* renamed from: d */
    public float f2004d = -1.0f;

    /* renamed from: h */
    public boolean f2008h = true;

    /* renamed from: k */
    public int f2011k = 1;

    /* renamed from: r */
    public boolean f2018r = false;

    /* renamed from: a */
    public static void m5503a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m700a(str, str2 + "takeResources_includeUnitsInTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "takeResources_includeParent", (Boolean) false).booleanValue();
        LogicBoolean m686b = c1072ab.m686b(c0453l, str, str2 + "takeResources_includeReference", null);
        float floatValue = c1072ab.m698a(str, str2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0f)).floatValue();
        C0424b m5217a = C0424b.m5217a(c0453l, c1072ab, str, str2 + "takeResources", true);
        boolean booleanValue3 = c1072ab.m700a(str, str2 + "takeResources_saveFirstUnitToCustomTarget1", (Boolean) false).booleanValue();
        boolean booleanValue4 = c1072ab.m700a(str, str2 + "takeResources_saveFirstUnitToCustomTarget2", (Boolean) false).booleanValue();
        if (!booleanValue && !booleanValue2 && floatValue < 0.0f) {
            if (m5217a != null && !m5217a.m5209b()) {
                throw new C0412bm("[" + str + "]takeResources requires an include (eg: takeResources_includeUnitsInTransport, takeResources_includeUnitsWithinRange)");
            }
            return;
        }
        C0334m c0334m = new C0334m();
        c0339d.f2132ab.add(c0334m);
        c0334m.f2002b = booleanValue;
        c0334m.f2004d = floatValue;
        c0334m.f2003c = booleanValue2;
        c0334m.f2006f = m686b;
        c0334m.f2001a = m5217a;
        c0334m.f2018r = c1072ab.m700a(str, str2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(c0334m.f2018r)).booleanValue();
        c0334m.f2005e = (EnumC0200q) c1072ab.m699a(str, "takeResources_includeUnitsWithinRange_team", EnumC0200q.f1389a, EnumC0200q.class);
        c0334m.f2007g = c1072ab.m720a(c0453l, str, str2 + "takeResources_excludeUnitsWithoutTags", (C0449h) null);
        c0334m.f2010j = UnitReference.parseUnitReferenceFromConf(c0453l, c1072ab, str, str2 + "takeResources_excludeUnitsWithoutCustomTarget1EqualTo", null);
        if (c0334m.f2018r) {
            c0334m.f2008h = false;
        }
        c0334m.f2008h = c1072ab.m700a(str, str2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(c0334m.f2008h)).booleanValue();
        c0334m.f2011k = c1072ab.m682b(str, str2 + "takeResources_maxUnits", Integer.valueOf(c0334m.f2011k)).intValue();
        c0334m.f2012l = c1072ab.m717a(c0453l, str, str2 + "takeResources_triggerActionIfAnyCollected", (C0462t) null);
        c0334m.f2013m = c1072ab.m717a(c0453l, str, str2 + "takeResources_triggerActionIfNoneCollected", (C0462t) null);
        c0334m.f2014n = booleanValue3;
        c0334m.f2015o = booleanValue4;
        c0334m.f2016p = c1072ab.m700a(str, str2 + "takeResources_discardCollected", Boolean.valueOf(c0334m.f2016p)).booleanValue();
        c0334m.f2017q = c1072ab.m700a(str, str2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(c0334m.f2017q)).booleanValue();
        c0334m.f2009i = C0424b.m5217a(c0453l, c1072ab, str, str2 + "takeResources_excludeUnitsWithTheseResources", true);
        if (c0334m.f2009i != null && c0334m.f2009i.m5209b()) {
            c0334m.f2009i = null;
        }
        if (c0334m.f2018r) {
            if (c0334m.f2001a.m5192d()) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
            }
            if (c0334m.f2008h) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
            }
            if (c0334m.f2017q) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
            }
            if (c0334m.f2016p) {
                throw new C0412bm("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
            }
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        Unit readUnit;
        f2019s.clear();
        if (this.f2002b) {
            Iterator it = c0451j.f2865A.iterator();
            while (it.hasNext()) {
                Unit unit2 = (Unit) it.next();
                if (unit2 != null && !unit2.isDead) {
                    f2019s.add(unit2);
                }
            }
        }
        if (this.f2003c) {
            if (c0451j.f1651cM != null) {
                f2019s.add(c0451j.f1651cM);
            } else if (c0451j.f1650cL != null) {
                f2019s.add(c0451j.f1651cM);
            }
        }
        if (this.f2006f != null && (readUnit = this.f2006f.readUnit(c0451j)) != null && !readUnit.isDead) {
            f2019s.add(readUnit);
        }
        if (this.f2004d > 0.0f) {
            f2020t.f2022b = this.f2004d * this.f2004d;
            f2020t.f2021a = this.f2007g;
            f2020t.f2023c = true;
            f2020t.f2024d = this.f2005e;
            f2020t.f2025e = f2019s;
            GameEngine.getInstance().f6121cc.m3792a(c0451j.f6951ek, c0451j.f6952el, this.f2004d, c0451j, 0.0f, f2020t);
        }
        if (this.f2007g != null) {
            for (int size = f2019s.size() - 1; size >= 0; size--) {
                if (!C0448g.m5061a(this.f2007g, ((Unit) f2019s.get(size)).m5787dc())) {
                    f2019s.remove(size);
                }
            }
        }
        if (this.f2008h) {
            for (int size2 = f2019s.size() - 1; size2 >= 0; size2--) {
                if (!this.f2001a.mo5235b((Unit) f2019s.get(size2))) {
                    f2019s.remove(size2);
                }
            }
        }
        if (this.f2009i != null) {
            for (int size3 = f2019s.size() - 1; size3 >= 0; size3--) {
                if (this.f2009i.mo5235b((Unit) f2019s.get(size3))) {
                    f2019s.remove(size3);
                }
            }
        }
        if (this.f2010j != null) {
            Unit unit3 = this.f2010j.get((AbstractC0623y) c0451j);
            for (int size4 = f2019s.size() - 1; size4 >= 0; size4--) {
                if (((Unit) f2019s.get(size4)).f1579bt != unit3) {
                    f2019s.remove(size4);
                }
            }
        }
        boolean z = false;
        Unit unit4 = null;
        int i2 = 0;
        for (int i3 = 0; i3 < f2019s.size(); i3++) {
            Unit unit5 = (Unit) f2019s.get(i3);
            if (unit4 == null) {
                unit4 = unit5;
            }
            if (this.f2018r) {
                if (!this.f2001a.m5223a(unit5, c0451j)) {
                    continue;
                }
            } else {
                if (!this.f2017q) {
                    this.f2001a.mo5237a(unit5);
                }
                if (!this.f2016p) {
                    this.f2001a.m5185h(c0451j);
                }
            }
            z = true;
            i2++;
            if (i2 >= this.f2011k) {
                break;
            }
        }
        if (unit4 != null) {
            if (this.f2014n) {
                c0451j.f1579bt = unit4;
            }
            if (this.f2015o) {
                c0451j.f1580bu = unit4;
            }
        }
        if (z) {
            if (this.f2012l != null) {
                this.f2012l.m4687a(c0451j, pointF, unit, i + 1);
            }
        } else if (this.f2013m != null) {
            this.f2013m.m4687a(c0451j, pointF, unit, i + 1);
        }
        f2019s.clear();
        return true;
    }
}

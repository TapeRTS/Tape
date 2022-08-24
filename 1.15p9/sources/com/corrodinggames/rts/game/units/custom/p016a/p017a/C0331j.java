package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0359aq;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/j.class */
public class C0331j extends AbstractC0321a {

    /* renamed from: a */
    boolean f1979a;

    /* renamed from: b */
    boolean f1980b;

    /* renamed from: c */
    boolean f1981c;

    /* renamed from: d */
    LogicBoolean f1982d;

    /* renamed from: f */
    boolean f1984f;

    /* renamed from: g */
    float f1985g;

    /* renamed from: h */
    float f1986h;

    /* renamed from: i */
    C0462t f1987i;

    /* renamed from: j */
    boolean f1988j;

    /* renamed from: k */
    boolean f1989k;

    /* renamed from: m */
    C1080ai f1991m;

    /* renamed from: n */
    boolean f1992n;

    /* renamed from: o */
    VariableScope.CachedWriter f1993o;

    /* renamed from: e */
    int f1983e = Integer.MIN_VALUE;

    /* renamed from: l */
    float f1990l = -1.0f;

    /* renamed from: a */
    public static void m5509a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m700a(str, str2 + "resetUnitStats", (Boolean) false).booleanValue();
        String m681b = c1072ab.m681b(str, str2 + "setUnitStats", (String) null);
        if (booleanValue || m681b != null) {
            C0331j c0331j = new C0331j();
            c0331j.f1992n = booleanValue;
            if (m681b != null) {
                c0331j.f1993o = C0359aq.m5361a(m681b, c0453l, str, str2 + "setUnitStats");
            }
            c0339d.f2132ab.add(c0331j);
        }
        boolean booleanValue2 = c1072ab.m700a(str, str2 + "deleteSelf", (Boolean) false).booleanValue();
        if (booleanValue2) {
            C0331j c0331j2 = new C0331j();
            c0331j2.f1979a = booleanValue2;
            c0339d.f2132ab.add(c0331j2);
        }
        boolean booleanValue3 = c1072ab.m700a(str, str2 + "switchToNeutralTeam", (Boolean) false).booleanValue();
        boolean booleanValue4 = c1072ab.m700a(str, str2 + "switchToAggressiveTeam", (Boolean) false).booleanValue();
        LogicBoolean m718a = c1072ab.m718a(c0453l, str, str2 + "switchToTeam", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        if (booleanValue3 || booleanValue4 || m718a != null) {
            C0331j c0331j3 = new C0331j();
            c0331j3.f1980b = booleanValue3;
            c0331j3.f1981c = booleanValue4;
            c0331j3.f1982d = m718a;
            c0339d.f2132ab.add(c0331j3);
        }
        int intValue = c1072ab.m682b(str, str2 + "setBodyRotation", (Integer) Integer.MIN_VALUE).intValue();
        if (intValue != Integer.MIN_VALUE) {
            C0331j c0331j4 = new C0331j();
            c0331j4.f1983e = intValue;
            c0339d.f2132ab.add(c0331j4);
        }
        float floatValue = c1072ab.m698a(str, str2 + "setBuilt", Float.valueOf(-1.0f)).floatValue();
        if (floatValue > 1.0f) {
            throw new C0412bm("[" + str + "] setBuilt cannot be greater than 1");
        }
        boolean booleanValue5 = c1072ab.m700a(str, str2 + "clearAllActionCooldowns", (Boolean) false).booleanValue();
        float floatValue2 = c1072ab.m676c(str, str2 + "addAllActionCooldownsTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue2 == 0.0f) {
            floatValue2 = c1072ab.m676c(str, str2 + "addAllActionCooldownsFor", Float.valueOf(0.0f)).floatValue();
        }
        float floatValue3 = c1072ab.m676c(str, str2 + "addActionCooldownTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue3 == 0.0f) {
            floatValue3 = c1072ab.m676c(str, str2 + "addActionCooldownFor", Float.valueOf(0.0f)).floatValue();
        }
        C0462t m717a = c1072ab.m717a(c0453l, str, str2 + "addActionCooldownApplyToActions", (C0462t) null);
        C1080ai m701a = c1072ab.m701a(str, str2 + "offsetSelfAbsolute", (C1080ai) null);
        if (m717a != null && floatValue3 <= 0.0f) {
            throw new C0412bm("[" + str + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
        }
        boolean booleanValue6 = c1072ab.m700a(str, str2 + "removeAllQueuedItemsWithoutRefund", (Boolean) false).booleanValue();
        boolean booleanValue7 = c1072ab.m700a(str, str2 + "refundAllQueuedItems", (Boolean) false).booleanValue();
        if (booleanValue6 && booleanValue7) {
            throw new C0412bm("[" + str + "]Cannot set removeAllQueuedActionsWithoutRefund and refundAllQueuedActions at the same time, pick one.");
        }
        if (floatValue3 > 0.0f || floatValue2 > 0.0f || booleanValue5 || floatValue >= 0.0f || m701a != null || booleanValue6 || booleanValue7) {
            C0331j c0331j5 = new C0331j();
            c0331j5.f1984f = booleanValue5;
            c0331j5.f1985g = floatValue2;
            c0331j5.f1986h = floatValue3;
            c0331j5.f1987i = m717a;
            c0331j5.f1990l = floatValue;
            c0331j5.f1991m = m701a;
            c0331j5.f1988j = booleanValue6;
            c0331j5.f1989k = booleanValue7;
            c0339d.f2132ab.add(c0331j5);
        }
    }

    /* renamed from: a */
    public boolean mo5529a(C0451j c0451j, Action action, PointF pointF, Unit unit, int i) {
        Team m6317k;
        if (this.f1992n) {
            c0451j.f2862x = c0451j.f2861w.f3241cG;
            c0451j.f1632ct = c0451j.f2862x.f2239c;
            if (c0451j.f1631cs > c0451j.f1632ct) {
                c0451j.m5762o(c0451j.f1632ct);
            }
            c0451j.f1637cy = c0451j.f2862x.f2243g;
            if (c0451j.f1634cv > c0451j.f1637cy) {
                c0451j.f1634cv = c0451j.f1637cy;
            }
        }
        if (this.f1993o != null) {
            this.f1993o.writeToUnit(c0451j);
            C0424b.m5191d(c0451j);
        }
        if (this.f1979a) {
            c0451j.m5812ch();
            if (c0451j.m4939bI()) {
                GameEngine.getInstance().f6113bU.m1312a(c0451j);
            }
        }
        if (this.f1980b) {
            c0451j.m4837e(Team.f1370i);
        }
        if (this.f1981c) {
            c0451j.m4837e(Team.f1369h);
        }
        if (this.f1982d != null && (m6317k = Team.m6317k((int) this.f1982d.readNumber(c0451j))) != null) {
            c0451j.m4837e(m6317k);
        }
        if (this.f1983e != Integer.MIN_VALUE) {
            c0451j.mo3057h(this.f1983e);
        }
        if (this.f1984f) {
            C0554e.m3721c(c0451j, Action.f1461i);
        }
        if (this.f1988j) {
            c0451j.m4817i(false);
        }
        if (this.f1989k) {
            c0451j.m4817i(true);
        }
        if (this.f1985g > 0.0f) {
            C0554e.m3727a(c0451j, Action.f1461i, (int) this.f1985g);
        }
        if (this.f1986h > 0.0f) {
            if (this.f1987i == null) {
                C0554e.m3727a(c0451j, action.m6095N(), (int) this.f1986h);
            } else {
                Iterator it = this.f1987i.m4689a().iterator();
                while (it.hasNext()) {
                    C0554e.m3727a(c0451j, ((Action) it.next()).m6095N(), (int) this.f1986h);
                }
            }
        }
        if (this.f1990l >= 0.0f) {
            c0451j.m5759r(this.f1990l);
            c0451j.f1624cl = this.f1990l;
        }
        if (this.f1991m != null) {
            c0451j.m3125b(c0451j.f6951ek + this.f1991m.f6843a, c0451j.f6952el + this.f1991m.f6844b);
            c0451j.height += this.f1991m.f6845c;
            c0451j.f1647cI = true;
            return true;
        }
        return true;
    }
}

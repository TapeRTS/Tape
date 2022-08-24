package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1032b;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1033c;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/c.class */
public class C1035c {
    /* renamed from: a */
    public static C1030a m835a(C1049f c1049f, C0172a c0172a) {
        try {
            GameEngine gameEngine = GameEngine.getInstance();
            String str = c0172a.f766b;
            if (str == null) {
                str = "NULL";
            }
            String m6657b = c0172a.m6657b("id");
            if (m6657b != null && !m6657b.equals(VariableScope.nullOrMissingString)) {
                str = m6657b;
            }
            String trim = str.trim();
            String str2 = c0172a.f768d;
            if (str2 != null) {
                EnumC1037e m833a = EnumC1037e.m833a(str2);
                if (m833a == null) {
                    C1049f.m814c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                C1030a c1030a = new C1030a();
                c1030a.f6602t = c0172a;
                c1030a.f6594g = m833a;
                c1030a.f6592b = trim;
                int i = 0;
                Iterator it = c1049f.f6687J.iterator();
                while (it.hasNext()) {
                    if (((C1030a) it.next()).f6592b.equalsIgnoreCase(c1030a.f6592b)) {
                        i++;
                    }
                }
                c1030a.f6593c = c1030a.f6592b;
                if (i != 0) {
                    c1030a.f6593c += "_" + i;
                }
                c1030a.f6591a = c0172a.f766b;
                Integer m850d = c1030a.m850d("team");
                if (m850d != null) {
                    c1030a.f6606y = Team.m6317k(m850d.intValue());
                    if (c1030a.f6606y == null) {
                        c1030a.m847g("Cannot find team:" + m850d);
                        return null;
                    }
                }
                c1030a.f6617r = c1030a.m855b("delay", c1030a.f6617r);
                c1030a.f6601p = c1030a.m855b("repeatDelay", c1030a.f6601p);
                c1030a.f6615o = c1030a.m864a("repeatCount", c1030a.f6615o);
                c1030a.f6616q = c1030a.m855b("resetActivationAfter", c1030a.f6616q);
                c1030a.f6595h = c1030a.m859a("allToActivate", false);
                c1030a.f6611d.f6639b = c1030a.f6595h;
                c1030a.f6618s = c1030a.m855b("warmup", c1030a.f6618s);
                c1030a.f6608A = c1030a.m863a("globalMessage", (C0385az) null);
                c1030a.f6604w = c1030a.m865a("textOffsetX", 0.0f);
                c1030a.f6605x = c1030a.m865a("textOffsetY", 0.0f);
                if (c1030a.f6594g == EnumC1037e.f6646g || c1030a.f6594g == EnumC1037e.f6640a) {
                    c1030a.f6607z = c1030a.m863a("text", (C0385az) null);
                }
                if (c1030a.f6594g == EnumC1037e.f6646g) {
                    c1049f.f6660i = true;
                    c1030a.f6609B = new Paint();
                    c1030a.f6609B.m7248a(true);
                    c1030a.f6609B.m7263a(Paint.Align.CENTER);
                    c1030a.f6609B.m7258a(Typeface.m7174a(Typeface.f246c, 1));
                    c1030a.f6609B.m7242b(c1030a.m852c("textColor", -1));
                    gameEngine.m1197a(c1030a.f6609B, c1030a.m864a("textSize", 20));
                    if (c1030a.f6609B.m7228f() == 0) {
                        c1030a.m847g("Text has an alpha of 0");
                    }
                    String m856b = c1030a.m856b("style");
                    if (m856b != null && !m856b.equals(VariableScope.nullOrMissingString)) {
                        if (m856b.equalsIgnoreCase("arrow")) {
                            c1030a.f6610C = true;
                        } else {
                            c1030a.m847g("Unknown style: " + m856b);
                        }
                    }
                }
                if (c1030a.f6594g == EnumC1037e.f6644e) {
                    try {
                        c1030a.f6603v = C0413bn.m5256a(c1030a.m856b("spawnUnits"), "<unitAdd>", "spawnUnits");
                        if (c1030a.m869a() == null) {
                            c1030a.m847g("No team set");
                        }
                    } catch (C0412bm e) {
                        C1049f.m814c(e.getMessage());
                        return null;
                    }
                }
                if (c1030a.f6594g == EnumC1037e.f6643d) {
                    c1030a.m866a("addTeamTags");
                    c1030a.m866a("removeTeamTags");
                }
                if (c1030a.f6594g == EnumC1037e.f6642c) {
                    c1030a.m866a("add");
                    c1030a.m866a("set");
                }
                if (c1030a.f6594g == EnumC1037e.f6648i) {
                    c1030a.m867a(C1033c.m840d(c1030a));
                }
                if (c1030a.f6594g == EnumC1037e.f6649j) {
                    c1030a.m867a(C1032b.m842d(c1030a));
                }
                c1030a.m866a("comment");
                c1030a.m866a("team");
                c1030a.m866a("globalMessage");
                c1030a.m866a("globalMessage_delayPerChar");
                c1030a.m866a("globalMessage_textColor");
                c1030a.m866a("debugMessage");
                c1030a.m866a("showOnMap");
                c1030a.m866a("text");
                c1030a.m866a("target");
                c1030a.m866a("onlyIfEmpty");
                if (c1030a.f6594g == EnumC1037e.f6641b) {
                    c1030a.m866a("unload");
                }
                if (c1030a.f6594g == EnumC1037e.f6645f) {
                    c1030a.m866a("onlyIfEmpty");
                }
                return c1030a;
            }
            C1049f.m814c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new C0179f("Error while reading: " + c0172a.m6658b(), e2);
        }
    }
}

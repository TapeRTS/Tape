package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class C0180g {

    /* renamed from: a */
    public C0183j f913a;

    /* renamed from: b */
    public int f914b;

    /* renamed from: c */
    public int f915c = -2;

    /* renamed from: d */
    public short f916d = -1;

    /* renamed from: e */
    public boolean f917e;

    /* renamed from: f */
    public boolean f918f;

    /* renamed from: g */
    public boolean f919g;

    /* renamed from: h */
    public boolean f920h;

    /* renamed from: i */
    public boolean f921i;

    /* renamed from: j */
    public byte f922j;

    /* renamed from: k */
    public boolean f923k;

    /* renamed from: l */
    public boolean f924l;

    /* renamed from: m */
    public C0180g[] f925m;

    /* renamed from: n */
    static final Rect f926n = new Rect();

    /* renamed from: a */
    public static boolean m6550a(C0180g c0180g, C0180g c0180g2) {
        if (c0180g == c0180g2) {
            return true;
        }
        return c0180g != null && c0180g2 != null && c0180g.f913a == c0180g2.f913a && c0180g.f914b == c0180g2.f914b;
    }

    /* renamed from: a */
    public C0180g clone() {
        C0180g c0180g = new C0180g();
        c0180g.f913a = this.f913a;
        c0180g.f914b = this.f914b;
        c0180g.f917e = this.f917e;
        c0180g.f918f = this.f918f;
        c0180g.f919g = this.f919g;
        c0180g.f920h = this.f920h;
        c0180g.f921i = this.f921i;
        c0180g.f922j = this.f922j;
        c0180g.f923k = this.f923k;
        c0180g.f924l = this.f924l;
        return c0180g;
    }

    /* renamed from: a */
    public static void m6548a(String str) {
        GameEngine.m1145b(str);
        GameEngine.getInstance().m1192a("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public static C0180g m6551a(C0173b c0173b, C0178e c0178e, C0183j c0183j, int i, short s, short s2, boolean z) {
        String str;
        Team m6317k;
        Properties m6533a = c0183j.m6533a(c0183j.f960l + i);
        if (m6533a != null) {
            String property = m6533a.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                GameEngine gameEngine = GameEngine.getInstance();
                c0173b.m6648a((int) s, (int) s2);
                gameEngine.f6104bL.m6651a(c0173b.f800T + c0173b.f786p, c0173b.f801U + c0173b.f787q, parseInt, gameEngine.f6093bs, false);
                return null;
            }
            String property2 = m6533a.getProperty("unit");
            String property3 = m6533a.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = m6533a.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    m6317k = Team.m6317k(-1);
                } else if (property4 == null) {
                    GameEngine.m1144b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    m6317k = Team.m6317k(Integer.valueOf(property4).intValue());
                    if (m6317k == null) {
                        GameEngine.m1144b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2) + " team:" + property4);
                        return null;
                    } else if (m6317k.m6374b()) {
                        GameEngine.m1144b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                C0451j c0451j = null;
                if (property3 != null) {
                    C0453l m4713n = C0453l.m4713n(property3);
                    if (m4713n == null) {
                        String str2 = "Could not find custom unit of:" + property3 + " at x:" + ((int) s) + ", y:" + ((int) s2);
                        m6548a(str2);
                        throw new C0179f(str2);
                    }
                    InterfaceC0303as m4738c = C0453l.m4738c(m4713n);
                    if (m4738c != null) {
                        if (m4738c instanceof C0453l) {
                            m4713n = (C0453l) m4738c;
                        } else {
                            GameEngine.m1145b("replacement not a custom unit:" + m4738c.mo5706i());
                        }
                    }
                    c0451j = C0453l.m4747a(false, m4713n);
                    if (c0451j == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        m6548a(str3);
                        throw new C0179f(str3);
                    }
                } else {
                    InterfaceC0303as m5734a = UnitType.m5734a(property2);
                    if (m5734a != null) {
                        c0451j = m5734a.mo5717a();
                    }
                    if (c0451j == null && "scoutShip".equalsIgnoreCase(property2)) {
                        c0451j = new MissileShip(false);
                    }
                    if (c0451j == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        m6548a(str4);
                        throw new C0179f(str4);
                    }
                }
                c0173b.m6648a((int) s, (int) s2);
                c0451j.f6951ek = c0173b.f800T + c0451j.m5823cX();
                c0451j.f6952el = c0173b.f801U + c0451j.m5822cY();
                if (m6317k != null) {
                    c0451j.mo3120b(m6317k);
                    if (m6533a.getProperty("type") != null) {
                        c0451j.setType(m6533a.getProperty("type"));
                    }
                    if (m6533a.getProperty("randomRotate") != null) {
                        c0451j.direction = CommonUtils.m2346a(c0451j, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    c0451j.f1600bN = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    c0451j.f1601bO = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    c0451j.f1598bL = true;
                    c0451j.mo4207n();
                    Team.m6353c(c0451j);
                    AbstractC1120w.m459dJ();
                    return null;
                }
                throw new C0179f("team has not been set for:" + property2);
            } else if (c0178e != null && c0178e.f901l.equals("units")) {
                Log.m7106d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        C0180g c0180g = new C0180g();
        c0180g.f913a = c0183j;
        c0183j.f964p = true;
        if (c0178e != null && !c0178e.f907r) {
            c0183j.f966r = true;
        }
        if (z) {
            c0183j.f965q = true;
        }
        c0180g.f914b = i;
        if (m6533a != null) {
            if (m6533a.getProperty("water") != null) {
                c0180g.f917e = true;
            }
            if (m6533a.getProperty("water-bridge") != null) {
                c0180g.f918f = true;
            }
            if (m6533a.getProperty("lava") != null || m6533a.getProperty("lava-cliff") != null) {
                c0180g.f919g = true;
                if (m6533a.getProperty("lava-cliff") != null) {
                    c0180g.f920h = true;
                }
            }
            if (m6533a.getProperty("cliff-soft") != null) {
                c0180g.f920h = true;
            }
            if (m6533a.getProperty("cliff") != null) {
                c0180g.f920h = true;
            }
            if (m6533a.getProperty("large-cliff") != null) {
                c0180g.f923k = true;
            }
            if (m6533a.getProperty("trees") != null) {
                c0180g.f923k = true;
            }
            if (m6533a.getProperty("res_pool") != null) {
                c0180g.f921i = true;
            }
            if (m6533a.getProperty("tree") != null) {
            }
            if (m6533a.getProperty("small-rock") != null) {
                c0180g.f922j = (byte) 40;
            }
            if (m6533a.getProperty("large-rock") != null) {
                c0180g.f922j = (byte) -1;
            }
            if (m6533a.getProperty("block-land") != null) {
                c0180g.f922j = (byte) -1;
            }
            if (m6533a.getProperty("block-buildings") != null) {
                c0180g.f924l = true;
            }
        }
        int i2 = 0;
        int i3 = 0;
        if (c0180g.f913a != null && (str = c0180g.f913a.f951c) != null) {
            if (c0180g.f914b == 0 && str.equals("shallowwater.png")) {
                i2 = 5;
            }
            if (c0180g.f914b == 0 && str.equals("deepwater.png")) {
                i2 = 2;
            }
            if (c0180g.f914b == 0 && str.equals("water.png")) {
                i2 = 2;
            }
            if (c0180g.f914b == 0 && str.equals("longgrass.png")) {
                i2 = 3;
            }
            if (c0180g.f914b == 0 && str.equals("mountain.png")) {
                i2 = 3;
            }
            if (c0180g.f914b == 7 && str.equals("stone.png")) {
                i2 = 4;
                i3 = 23;
            }
            if (c0180g.f914b != 0 || str.equals("lava.png")) {
            }
            if (c0180g.f914b == 0 && str.equals("snow.png")) {
                i2 = 2;
            }
        }
        if (m6533a != null && m6533a.getProperty("randomTileBy") != null) {
            try {
                i2 = Integer.parseInt(m6533a.getProperty("randomTileBy"));
                if (m6533a.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i3 = Integer.parseInt(m6533a.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileFixedOffset: Unexpected integer value:'" + m6533a.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + m6533a.getProperty("randomTileBy") + "'");
            }
        }
        if (i2 > 0) {
            C0180g[] c0180gArr = new C0180g[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                c0180gArr[i4] = c0180g.m6552a();
                c0180gArr[i4].f914b += i4 + 1 + i3;
            }
            c0180g.f925m = c0180gArr;
        }
        return c0180g;
    }

    C0180g() {
    }

    /* renamed from: a */
    public void m6549a(InterfaceC1027y interfaceC1027y, RectF rectF, float f, Paint paint) {
        C0183j c0183j = this.f913a;
        interfaceC1027y.mo909a(c0183j.f950b, c0183j.m6524b(this.f914b), rectF, paint);
    }
}

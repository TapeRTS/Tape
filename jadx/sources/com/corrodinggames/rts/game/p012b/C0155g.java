package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p028h.C0493d;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class C0155g {

    /* renamed from: a */
    public C0158j f849a;

    /* renamed from: b */
    public int f850b;

    /* renamed from: c */
    public int f851c = -2;

    /* renamed from: d */
    public short f852d = -1;

    /* renamed from: e */
    public boolean f853e;

    /* renamed from: f */
    public boolean f854f;

    /* renamed from: g */
    public boolean f855g;

    /* renamed from: h */
    public boolean f856h;

    /* renamed from: i */
    public boolean f857i;

    /* renamed from: j */
    public byte f858j;

    /* renamed from: k */
    public boolean f859k;

    /* renamed from: l */
    public boolean f860l;

    /* renamed from: m */
    public C0155g[] f861m;

    /* renamed from: n */
    static final Rect f862n = new Rect();

    /* renamed from: a */
    public C0155g clone() {
        C0155g gVar = new C0155g();
        gVar.f849a = this.f849a;
        gVar.f850b = this.f850b;
        gVar.f853e = this.f853e;
        gVar.f854f = this.f854f;
        gVar.f855g = this.f855g;
        gVar.f856h = this.f856h;
        gVar.f857i = this.f857i;
        gVar.f858j = this.f858j;
        gVar.f859k = this.f859k;
        gVar.f860l = this.f860l;
        return gVar;
    }

    /* renamed from: a */
    public static void m3607a(String str) {
        AbstractC0789l.m682b(str);
        AbstractC0789l.m638u().m718a("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public static C0155g m3609a(C0148b bVar, C0153e eVar, C0158j jVar, int i, short s, short s2, boolean z) {
        String str;
        AbstractC0171m mVar;
        Properties a = jVar.m3592a(jVar.f895k + i);
        if (a != null) {
            String property = a.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                AbstractC0789l u = AbstractC0789l.m638u();
                bVar.m3699a((int) s, (int) s2);
                u.f5511bt.m3702a(bVar.f764M + bVar.f737m, bVar.f765N + bVar.f738n, parseInt, u.f5493bb, false);
                return null;
            }
            String property2 = a.getProperty("unit");
            String property3 = a.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = a.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    mVar = AbstractC0171m.m3436n(-1);
                } else if (property4 == null) {
                    AbstractC0789l.m681b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    mVar = AbstractC0171m.m3436n(Integer.valueOf(property4).intValue());
                    if (mVar == null) {
                        AbstractC0789l.m681b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                        return null;
                    } else if (mVar.m3493b()) {
                        AbstractC0789l.m681b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                AbstractC0210af afVar = null;
                if (property3 != null) {
                    C0368l l = C0368l.m2747l(property3);
                    if (l == null) {
                        String str2 = "Could not find custom unit of:" + property3 + " at x:" + ((int) s) + ", y:" + ((int) s2);
                        m3607a(str2);
                        throw new C0154f(str2);
                    }
                    AbstractC0268al c = C0368l.m2768c(l);
                    if (c != null) {
                        if (c instanceof C0368l) {
                            l = (C0368l) c;
                        } else {
                            AbstractC0789l.m682b("replacement not a custom unit:" + c.mo2754i());
                        }
                    }
                    afVar = C0368l.m2775a(false, l);
                    if (afVar == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        m3607a(str3);
                        throw new C0154f(str3);
                    }
                } else {
                    AbstractC0268al a2 = EnumC0215ak.m3273a(property2);
                    if (a2 != null) {
                        afVar = a2.mo2799a();
                    }
                    if (afVar == null && "scoutShip".equalsIgnoreCase(property2)) {
                        afVar = new C0493d(false);
                    }
                    if (afVar == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        m3607a(str4);
                        throw new C0154f(str4);
                    }
                }
                bVar.m3699a((int) s, (int) s2);
                afVar.f5842dH = bVar.f764M + afVar.mo2572cH();
                afVar.f5843dI = bVar.f765N + afVar.mo2571cI();
                if (mVar != null) {
                    afVar.mo2305a(mVar);
                    if (a.getProperty("type") != null) {
                        afVar.mo2696a_(a.getProperty("type"));
                    }
                    if (a.getProperty("randomRotate") != null) {
                        afVar.f1471bL = C0654f.m1500a(afVar, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    afVar.f1453bt = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    afVar.f1454bu = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    afVar.f1451br = true;
                    afVar.mo2536n();
                    AbstractC0171m.m3473c(afVar);
                    AbstractC0854w.m393dq();
                    return null;
                }
                throw new C0154f("team has not been set for:" + property2);
            } else if (eVar != null && eVar.f837l.equals("units")) {
                Log.m4033d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        C0155g gVar = new C0155g();
        gVar.f849a = jVar;
        jVar.f899o = true;
        if (eVar != null && !eVar.f843r) {
            jVar.f901q = true;
        }
        if (z) {
            jVar.f900p = true;
        }
        gVar.f850b = i;
        if (a != null) {
            if (a.getProperty("water") != null) {
                gVar.f853e = true;
            }
            if (a.getProperty("water-bridge") != null) {
                gVar.f854f = true;
            }
            if (!(a.getProperty("lava") == null && a.getProperty("lava-cliff") == null)) {
                gVar.f855g = true;
                if (a.getProperty("lava-cliff") != null) {
                    gVar.f856h = true;
                }
            }
            if (a.getProperty("cliff-soft") != null) {
                gVar.f856h = true;
            }
            if (a.getProperty("cliff") != null) {
                gVar.f856h = true;
            }
            if (a.getProperty("large-cliff") != null) {
                gVar.f859k = true;
            }
            if (a.getProperty("trees") != null) {
                gVar.f859k = true;
            }
            if (a.getProperty("res_pool") != null) {
                gVar.f857i = true;
            }
            if (a.getProperty("tree") != null) {
            }
            if (a.getProperty("small-rock") != null) {
                gVar.f858j = (byte) 40;
            }
            if (a.getProperty("large-rock") != null) {
                gVar.f858j = (byte) -1;
            }
            if (a.getProperty("block-land") != null) {
                gVar.f858j = (byte) -1;
            }
            if (a.getProperty("block-buildings") != null) {
                gVar.f860l = true;
            }
        }
        int i2 = 0;
        if (!(gVar.f849a == null || (str = gVar.f849a.f886b) == null)) {
            if (gVar.f850b == 0 && str.equals("shallowwater.png")) {
                i2 = 5;
            }
            if (gVar.f850b == 0 && str.equals("deepwater.png")) {
                i2 = 2;
            }
            if (gVar.f850b == 0 && str.equals("water.png")) {
                i2 = 2;
            }
            if (gVar.f850b == 0 && str.equals("longgrass.png")) {
                i2 = 3;
            }
            if (gVar.f850b == 0 && str.equals("mountain.png")) {
                i2 = 3;
            }
            if (gVar.f850b != 0 || str.equals("lava.png")) {
            }
            if (gVar.f850b == 0 && str.equals("snow.png")) {
                i2 = 2;
            }
        }
        if (!(a == null || a.getProperty("randomTileBy") == null)) {
            try {
                i2 = Integer.parseInt(a.getProperty("randomTileBy"));
            } catch (NumberFormatException e) {
                throw new C0154f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + a.getProperty("randomTileBy") + "'");
            }
        }
        if (i2 > 0) {
            C0155g[] gVarArr = new C0155g[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                gVarArr[i3] = gVar.clone();
                gVarArr[i3].f850b += i3 + 1;
            }
            gVar.f861m = gVarArr;
        }
        return gVar;
    }

    C0155g() {
    }

    /* renamed from: a */
    public void m3608a(AbstractC0755l lVar, RectF rectF, float f, Paint paint) {
        C0158j jVar = this.f849a;
        lVar.mo169a(jVar.f885a, jVar.m3586b(this.f850b), rectF, paint);
    }
}

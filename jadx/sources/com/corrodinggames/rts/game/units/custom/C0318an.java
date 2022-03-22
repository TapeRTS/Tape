package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/an.class */
public class C0318an {

    /* renamed from: a */
    C0835m f2086a;

    /* renamed from: b */
    public static final C0319ao f2087b = new C0319ao();

    /* renamed from: a */
    public static C0318an m3083a(C0368l lVar, C0809ab abVar, String str, String str2, C0318an anVar) {
        String b = abVar.m579b(str, str2, (String) null);
        if (b == null) {
            return anVar;
        }
        return m3082a(lVar, b, str, str2, false);
    }

    /* renamed from: a */
    public static C0318an m3082a(C0368l lVar, String str, String str2, String str3, boolean z) {
        if (lVar != null) {
            return m3081b(lVar, str, str2, str3, z);
        }
        throw new RuntimeException("meta==null");
    }

    /* renamed from: b */
    public static C0318an m3081b(C0368l lVar, String str, String str2, String str3, boolean z) {
        int a;
        String[] split;
        C0318an anVar = new C0318an();
        if (str == null || "".equals(str) || "NONE".equalsIgnoreCase(str)) {
            return anVar;
        }
        if (lVar == null) {
            throw new C0324at("meta required");
        }
        Iterator it = C0654f.m1484a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!"".equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new C0324at("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = split2[0];
                    str4 = split2[1].trim();
                }
                String[] split3 = trim.split("\\*");
                String str5 = split3[0];
                int i = 1;
                if (split3.length >= 2) {
                    i = Integer.parseInt(split3[1]);
                }
                C0320ap apVar = new C0320ap(lVar.m2770b(str5, str3, str2));
                if (anVar.f2086a == null) {
                    anVar.f2086a = new C0835m();
                }
                apVar.f2094b = i;
                if (str4 != null) {
                    if (str4.endsWith(")")) {
                        for (String str6 : str4.substring(0, str4.length() - 1).split("\\,")) {
                            if (!str6.trim().equals("")) {
                                String[] split4 = str6.split("\\=");
                                if (split4.length != 2) {
                                    throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                                }
                                String trim2 = split4[0].trim();
                                String trim3 = split4[1].trim();
                                if (trim2.equalsIgnoreCase("spawnChance")) {
                                    apVar.f2095c = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                    apVar.f2096d = C0809ab.m557i(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("recursionLimit")) {
                                    apVar.f2106n = C0809ab.m557i(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetX") || trim2.equalsIgnoreCase("xOffsetAbsolute")) {
                                    apVar.f2097e = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetY") || trim2.equalsIgnoreCase("yOffsetAbsolute")) {
                                    apVar.f2098f = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("xOffsetRelative")) {
                                    apVar.f2101i = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("yOffsetRelative")) {
                                    apVar.f2102j = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                    float h = C0809ab.m559h(str2, str3, trim3);
                                    apVar.f2103k = h;
                                    apVar.f2104l = h;
                                } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                    apVar.f2103k = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                    apVar.f2104l = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                    apVar.f2099g = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                    apVar.f2105m = C0809ab.m559h(str2, str3, trim3);
                                } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                    apVar.f2100h = C0809ab.m559h(str2, str3, trim3);
                                } else {
                                    throw new C0324at("[" + str2 + "]" + str3 + " ProjectileList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                                }
                            }
                        }
                    } else {
                        throw new C0324at("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                }
                anVar.f2086a.add(apVar);
            }
        }
        if (!z || (a = anVar.m3086a()) <= 1) {
            return anVar;
        }
        throw new C0324at("[" + str2 + "]" + str3 + " Too many units: " + a + ", only single unit is allowed here");
    }

    /* renamed from: a */
    public int m3086a() {
        if (this.f2086a == null || this.f2086a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2086a.iterator();
        while (it.hasNext()) {
            i += ((C0320ap) it.next()).f2094b;
        }
        return i;
    }

    /* renamed from: a */
    public void m3085a(float f, float f2, float f3, float f4, AbstractC0210af afVar, C0835m mVar, boolean z, int i, C0163f fVar, AbstractC0210af afVar2) {
        if (!(this.f2086a == null || this.f2086a.size() == 0)) {
            int i2 = 0;
            int i3 = 0;
            if (afVar == null) {
                AbstractC0789l.m670d("projectile spawn At: Skipping, source unit required");
                return;
            }
            Iterator it = this.f2086a.iterator();
            while (it.hasNext()) {
                C0320ap apVar = (C0320ap) it.next();
                C0317am f5 = apVar.f2093a.m2713f();
                if (f5 == null) {
                    AbstractC0789l.m670d("projectile spawn At: Skipping, projectileType==null");
                } else {
                    for (int i4 = 0; i4 < apVar.f2094b; i4++) {
                        i3++;
                        if ((apVar.f2095c >= 1.0f || C0654f.m1501a(afVar, 0.0f, 1.0f, i3) <= apVar.f2095c) && i2 < apVar.f2096d && i <= apVar.f2106n) {
                            float f6 = f + apVar.f2097e;
                            float f7 = f2 + apVar.f2098f;
                            float f8 = f3 + apVar.f2099g;
                            float f9 = f4 + apVar.f2100h;
                            if (apVar.f2105m != 0.0f) {
                                f9 += C0654f.m1501a(afVar, -apVar.f2105m, apVar.f2105m, (i3 * 4) + 3);
                            }
                            if (apVar.f2103k != 0.0f) {
                                f6 += C0654f.m1501a(afVar, -apVar.f2103k, apVar.f2103k, (i3 * 2) + 1);
                            }
                            if (apVar.f2104l != 0.0f) {
                                f7 += C0654f.m1501a(afVar, -apVar.f2104l, apVar.f2104l, (i3 * 3) + 2);
                            }
                            if (!(apVar.f2101i == 0.0f && apVar.f2102j == 0.0f)) {
                                float i5 = C0654f.m1421i(f4);
                                float h = C0654f.m1425h(f4);
                                float f10 = apVar.f2101i;
                                float f11 = apVar.f2102j;
                                f6 += (i5 * f11) - (h * f10);
                                f7 += (h * f11) + (i5 * f10);
                            }
                            C0163f a = C0367k.m2877a(afVar, -1, f5, f6, f7, f8, f9);
                            a.f997aD = i;
                            if (!(fVar == null || afVar == null)) {
                                f5.m3090a(afVar, a, fVar.f927l, fVar.f929n, fVar.f930o, -1.0f);
                            }
                            m3084a(a, apVar, afVar, fVar, afVar2);
                            i2++;
                            if (mVar != null) {
                                mVar.add(a);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3084a(C0163f fVar, C0320ap apVar, AbstractC0210af afVar, C0163f fVar2, AbstractC0210af afVar2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        f2087b.f2088a = fVar;
        f2087b.f2089b = apVar;
        f2087b.f2090c = afVar;
        f2087b.f2091d = fVar2;
        f2087b.f2092e = afVar2;
        u.f5528bK.m2462a(fVar.f5842dH, fVar.f5843dI, 100.0f, null, 0.0f, f2087b);
    }
}

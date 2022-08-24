package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bg.class */
public class C0406bg {

    /* renamed from: a */
    C1101m f2516a;

    /* renamed from: b */
    public static final C0407bh f2517b = new C0407bh();

    /* renamed from: a */
    public static C0406bg m5275a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0406bg c0406bg) {
        String m681b = c1072ab.m681b(str, str2, (String) null);
        if (m681b == null) {
            return c0406bg;
        }
        return m5274a(c0453l, m681b, str, str2, false);
    }

    /* renamed from: a */
    public static C0406bg m5274a(C0453l c0453l, String str, String str2, String str3, boolean z) {
        if (c0453l == null) {
            throw new RuntimeException("meta==null");
        }
        return m5273b(c0453l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0406bg m5273b(C0453l c0453l, String str, String str2, String str3, boolean z) {
        int m5278a;
        String[] split;
        C0406bg c0406bg = new C0406bg();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0406bg;
        }
        if (c0453l == null) {
            throw new C0412bm("meta required");
        }
        Iterator it = CommonUtils.m2298b(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
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
                C0408bi c0408bi = new C0408bi(c0453l.m4741b(str5, str3, str2));
                if (c0406bg.f2516a == null) {
                    c0406bg.f2516a = new C1101m();
                }
                c0408bi.f2529b = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    for (String str6 : str4.substring(0, str4.length() - 1).split("\\,")) {
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] split4 = str6.split("\\=");
                            if (split4.length != 2) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = split4[0].trim();
                            String trim3 = split4[1].trim();
                            if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0408bi.f2530c = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0408bi.f2531d = C1072ab.m657i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("recursionLimit")) {
                                c0408bi.f2536n = C1072ab.m657i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX") || trim2.equalsIgnoreCase("xOffsetAbsolute")) {
                                c0408bi.f2532e = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY") || trim2.equalsIgnoreCase("yOffsetAbsolute")) {
                                c0408bi.f2533f = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("xOffsetRelative")) {
                                c0408bi.f2524i = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("yOffsetRelative")) {
                                c0408bi.f2525j = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m659h = C1072ab.m659h(str2, str3, trim3);
                                c0408bi.f2526k = m659h;
                                c0408bi.f2527l = m659h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0408bi.f2526k = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0408bi.f2527l = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0408bi.f2534g = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0408bi.f2528m = C1072ab.m659h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0408bi.f2535h = C1072ab.m659h(str2, str3, trim3);
                            } else {
                                throw new C0412bm("[" + str2 + "]" + str3 + " ProjectileList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                }
                c0406bg.f2516a.add(c0408bi);
            }
        }
        if (z && (m5278a = c0406bg.m5278a()) > 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " Too many units: " + m5278a + ", only single unit is allowed here");
        }
        return c0406bg;
    }

    /* renamed from: a */
    public int m5278a() {
        if (this.f2516a == null || this.f2516a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2516a.iterator();
        while (it.hasNext()) {
            i += ((C0408bi) it.next()).f2529b;
        }
        return i;
    }

    /* renamed from: a */
    public void m5277a(float f, float f2, float f3, float f4, Unit unit, C1101m c1101m, boolean z, int i, Projectile projectile, Unit unit2) {
        if (this.f2516a == null || this.f2516a.size() == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        if (unit == null) {
            GameEngine.PrintLog("projectile spawn At: Skipping, source unit required");
            return;
        }
        Iterator it = this.f2516a.iterator();
        while (it.hasNext()) {
            C0408bi c0408bi = (C0408bi) it.next();
            C0405bf m4680f = c0408bi.f2523a.m4680f();
            if (m4680f == null) {
                GameEngine.PrintLog("projectile spawn At: Skipping, projectileType==null");
            } else {
                for (int i4 = 0; i4 < c0408bi.f2529b; i4++) {
                    i3++;
                    if ((c0408bi.f2530c >= 1.0f || CommonUtils.m2347a(unit, 0.0f, 1.0f, i3) <= c0408bi.f2530c) && i2 < c0408bi.f2531d && i <= c0408bi.f2536n) {
                        float f5 = f + c0408bi.f2532e;
                        float f6 = f2 + c0408bi.f2533f;
                        float f7 = f3 + c0408bi.f2534g;
                        float f8 = f4 + c0408bi.f2535h;
                        if (c0408bi.f2528m != 0.0f) {
                            f8 += CommonUtils.m2347a(unit, -c0408bi.f2528m, c0408bi.f2528m, (i3 * 4) + 3);
                        }
                        if (c0408bi.f2526k != 0.0f) {
                            f5 += CommonUtils.m2347a(unit, -c0408bi.f2526k, c0408bi.f2526k, (i3 * 2) + 1);
                        }
                        if (c0408bi.f2527l != 0.0f) {
                            f6 += CommonUtils.m2347a(unit, -c0408bi.f2527l, c0408bi.f2527l, (i3 * 3) + 2);
                        }
                        if (c0408bi.f2524i != 0.0f || c0408bi.f2525j != 0.0f) {
                            float m2249i = CommonUtils.m2249i(f4);
                            float sin = CommonUtils.sin(f4);
                            float f9 = c0408bi.f2524i;
                            float f10 = c0408bi.f2525j;
                            f5 += (m2249i * f10) - (sin * f9);
                            f6 += (sin * f10) + (m2249i * f9);
                        }
                        Projectile m4994a = C0451j.m4994a(unit, -1, m4680f, f5, f6, f7, f8);
                        m4994a.f1054aD = i;
                        if (projectile != null && unit != null) {
                            m4680f.m5282a(unit, m4994a, projectile.target, projectile.f987n, projectile.f988o, -1.0f);
                        }
                        m5276a(m4994a, c0408bi, unit, projectile, unit2);
                        i2++;
                        if (c1101m != null) {
                            c1101m.add(m4994a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5276a(Projectile projectile, C0408bi c0408bi, Unit unit, Projectile projectile2, Unit unit2) {
        GameEngine gameEngine = GameEngine.getInstance();
        f2517b.f2518a = projectile;
        f2517b.f2519b = c0408bi;
        f2517b.f2520c = unit;
        f2517b.f2521d = projectile2;
        f2517b.f2522e = unit2;
        gameEngine.f6121cc.m3792a(projectile.f6951ek, projectile.f6952el, 100.0f, null, 0.0f, f2517b);
    }
}

package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p018b.C0333f;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/as.class */
public class C0323as {

    /* renamed from: a */
    public String f2112a;

    /* renamed from: b */
    public String f2113b;

    /* renamed from: c */
    public boolean f2114c;

    /* renamed from: d */
    public boolean f2115d;

    /* renamed from: e */
    public int f2116e;

    /* renamed from: f */
    public float f2117f;

    /* renamed from: g */
    public float f2118g;

    /* renamed from: i */
    public float f2120i;

    /* renamed from: j */
    public float f2121j;

    /* renamed from: k */
    public boolean f2122k;

    /* renamed from: s */
    public float f2130s;

    /* renamed from: u */
    public C0363g f2132u;

    /* renamed from: x */
    public C0323as f2135x;

    /* renamed from: y */
    public C0323as f2136y;

    /* renamed from: z */
    public boolean f2137z;

    /* renamed from: B */
    public LogicBoolean f2139B;

    /* renamed from: C */
    public C0321aq f2140C;

    /* renamed from: D */
    public C0381x f2141D;

    /* renamed from: E */
    public C0381x f2142E;

    /* renamed from: F */
    public Integer f2143F;

    /* renamed from: G */
    public boolean f2144G;

    /* renamed from: H */
    public boolean f2145H;

    /* renamed from: I */
    public LogicBoolean f2146I;

    /* renamed from: J */
    public LogicBoolean f2147J;

    /* renamed from: K */
    public LogicBoolean f2148K;

    /* renamed from: L */
    public LogicBoolean f2149L;

    /* renamed from: M */
    public LogicBoolean f2150M;

    /* renamed from: N */
    public C0365i f2151N;

    /* renamed from: O */
    public C0365i f2152O;

    /* renamed from: S */
    public LogicBoolean f2156S;

    /* renamed from: T */
    public Float f2157T;

    /* renamed from: W */
    public float f2160W;

    /* renamed from: X */
    public float f2161X;

    /* renamed from: Z */
    public float f2163Z;

    /* renamed from: ab */
    public Boolean f2165ab;

    /* renamed from: ac */
    public float f2166ac;

    /* renamed from: ad */
    public float f2167ad;

    /* renamed from: ae */
    public float f2168ae;

    /* renamed from: ai */
    public Float f2172ai;

    /* renamed from: aj */
    public C0365i f2173aj;

    /* renamed from: an */
    public C0323as f2177an;

    /* renamed from: at */
    public float f2183at;

    /* renamed from: au */
    public LogicBoolean f2184au;

    /* renamed from: aw */
    public float f2186aw;

    /* renamed from: ax */
    public boolean f2187ax;

    /* renamed from: ay */
    public int f2188ay;

    /* renamed from: az */
    public C0372o f2189az;

    /* renamed from: aA */
    public float f2190aA;

    /* renamed from: aB */
    public C0376s f2191aB;

    /* renamed from: aC */
    public C0748e f2192aC;

    /* renamed from: aD */
    public C0748e[] f2193aD;

    /* renamed from: aE */
    public C0748e f2194aE;

    /* renamed from: aF */
    public float f2195aF;

    /* renamed from: aG */
    public float f2196aG;

    /* renamed from: aH */
    public int f2197aH;

    /* renamed from: aI */
    public C0365i f2198aI;

    /* renamed from: h */
    public float f2119h = 1.0f;

    /* renamed from: l */
    public float f2123l = -1.0f;

    /* renamed from: m */
    public float f2124m = 0.0f;

    /* renamed from: n */
    public float f2125n = 4.0f;

    /* renamed from: o */
    public float f2126o = 0.0f;

    /* renamed from: p */
    public float f2127p = 4.0f;

    /* renamed from: q */
    public float f2128q = 7.0f;

    /* renamed from: r */
    public boolean f2129r = false;

    /* renamed from: t */
    public float f2131t = 0.0f;

    /* renamed from: v */
    public int f2133v = -1;

    /* renamed from: w */
    public int f2134w = -1;

    /* renamed from: A */
    public boolean f2138A = true;

    /* renamed from: P */
    public float f2153P = 5.0f;

    /* renamed from: Q */
    public int f2154Q = 0;

    /* renamed from: R */
    public int f2155R = -1;

    /* renamed from: U */
    public float f2158U = -1.0f;

    /* renamed from: V */
    public float f2159V = -1.0f;

    /* renamed from: Y */
    public float f2162Y = 0.0f;

    /* renamed from: aa */
    public float f2164aa = 99999.0f;

    /* renamed from: af */
    public float f2169af = -1.0f;

    /* renamed from: ag */
    public float f2170ag = -1.0f;

    /* renamed from: ah */
    public float f2171ah = -1.0f;

    /* renamed from: ak */
    public float f2174ak = -1.0f;

    /* renamed from: al */
    public float f2175al = 2000.0f;

    /* renamed from: am */
    public float f2176am = -999.0f;

    /* renamed from: ao */
    public int f2178ao = -1;

    /* renamed from: ap */
    public boolean f2179ap = true;

    /* renamed from: aq */
    public float f2180aq = 0.0f;

    /* renamed from: ar */
    public float f2181ar = 0.0f;

    /* renamed from: as */
    public float f2182as = 10.0f;

    /* renamed from: av */
    public float f2185av = -1.0f;

    /* renamed from: a */
    public int m3072a(C0367k kVar) {
        if (this.f2155R < 0 || !this.f2156S.read(kVar)) {
            return this.f2154Q;
        }
        return this.f2155R;
    }

    /* renamed from: a */
    public void m3074a(C0323as asVar) {
        this.f2117f = asVar.f2117f;
        this.f2118g = asVar.f2118g;
        this.f2120i = asVar.f2120i;
        this.f2121j = asVar.f2121j;
        this.f2122k = asVar.f2122k;
        this.f2123l = asVar.f2123l;
        this.f2124m = asVar.f2124m;
        this.f2125n = asVar.f2125n;
        this.f2131t = asVar.f2131t;
        this.f2132u = asVar.f2132u;
        this.f2197aH = asVar.f2197aH;
        this.f2198aI = asVar.f2198aI;
        this.f2129r = asVar.f2129r;
        this.f2130s = asVar.f2130s;
        this.f2126o = asVar.f2126o;
        this.f2127p = asVar.f2127p;
        this.f2128q = asVar.f2128q;
        this.f2135x = asVar.f2135x;
        this.f2137z = asVar.f2137z;
        this.f2138A = asVar.f2138A;
        this.f2139B = asVar.f2139B;
        this.f2140C = asVar.f2140C;
        this.f2141D = asVar.f2141D;
        this.f2143F = asVar.f2143F;
        this.f2142E = asVar.f2142E;
        this.f2146I = asVar.f2146I;
        this.f2147J = asVar.f2147J;
        this.f2148K = asVar.f2148K;
        this.f2149L = asVar.f2149L;
        this.f2150M = asVar.f2150M;
        this.f2151N = asVar.f2151N;
        this.f2152O = asVar.f2152O;
        this.f2153P = asVar.f2153P;
        this.f2192aC = asVar.f2192aC;
        this.f2193aD = asVar.f2193aD;
        this.f2194aE = asVar.f2194aE;
        this.f2154Q = asVar.f2154Q;
        this.f2155R = asVar.f2155R;
        this.f2156S = asVar.f2156S;
        this.f2157T = asVar.f2157T;
        this.f2158U = asVar.f2158U;
        this.f2159V = asVar.f2159V;
        this.f2160W = asVar.f2160W;
        this.f2161X = asVar.f2161X;
        this.f2162Y = asVar.f2162Y;
        this.f2163Z = asVar.f2163Z;
        this.f2177an = asVar.f2177an;
        this.f2179ap = asVar.f2179ap;
        this.f2181ar = asVar.f2181ar;
        this.f2182as = asVar.f2182as;
        this.f2183at = asVar.f2183at;
        this.f2184au = asVar.f2184au;
        this.f2185av = asVar.f2185av;
        this.f2186aw = asVar.f2186aw;
        this.f2164aa = asVar.f2164aa;
        this.f2169af = asVar.f2169af;
        this.f2171ah = asVar.f2171ah;
        this.f2168ae = asVar.f2168ae;
        this.f2187ax = asVar.f2187ax;
        this.f2188ay = asVar.f2188ay;
        this.f2173aj = asVar.f2173aj;
        this.f2174ak = asVar.f2174ak;
        this.f2175al = asVar.f2175al;
        this.f2176am = asVar.f2176am;
        this.f2189az = asVar.f2189az;
        this.f2195aF = asVar.f2195aF;
        this.f2196aG = asVar.f2196aG;
    }

    /* renamed from: a */
    public static void m3073a(C0323as asVar, C0368l lVar, C0809ab abVar, String str) {
        asVar.f2114c = true;
        if (!asVar.f2115d) {
            Float valueOf = Float.valueOf(abVar.m560h(str, "x"));
            Float valueOf2 = Float.valueOf(abVar.m560h(str, "y"));
            String b = abVar.m579b(str, "copyFrom", (String) null);
            if (b != null) {
                C0323as c = lVar.m2767c(b);
                if (c == null) {
                    throw new RuntimeException("[" + str + "] Could not find copy turret target with name:" + b);
                } else if (!c.f2114c || c.f2115d) {
                    if (!c.f2115d) {
                        m3073a(c, lVar, abVar, c.f2113b);
                    }
                    asVar.m3074a(c);
                } else {
                    throw new RuntimeException("[" + str + "] Infinite loop detected with turret copies:" + b);
                }
            } else {
                asVar.f2168ae = lVar.f2757eo;
                asVar.f2160W = lVar.f2732dP;
            }
            asVar.f2117f = valueOf.floatValue();
            asVar.f2118g = valueOf2.floatValue();
            asVar.f2119h = abVar.m592a(str, "yAxisScaling", Float.valueOf(1.0f)).floatValue();
            String b2 = abVar.m579b(str, "linkDelayWithTurret", (String) null);
            if (b2 != null) {
                asVar.f2177an = lVar.m2767c(b2);
                if (asVar.f2177an == null) {
                    throw new RuntimeException("[" + str + "] Could not find 'linkDelayWithTurret' turret target with name:" + b2);
                }
                asVar.f2123l = 9000.0f;
            }
            Float b3 = abVar.m581b(str, "delay", (Float) null);
            if (b3 != null) {
                asVar.f2123l = b3.floatValue();
            }
            if (asVar.f2123l == -1.0f) {
                asVar.f2123l = lVar.f2715dy;
            }
            Float b4 = abVar.m581b(str, "warmup", (Float) null);
            if (b4 != null) {
                asVar.f2124m = b4.floatValue();
            }
            Float a = abVar.m592a(str, "warmupCallDownRate", (Float) null);
            if (a != null) {
                asVar.f2125n = a.floatValue();
            }
            Boolean a2 = abVar.m594a(str, "warmupNoReset", (Boolean) null);
            if (a2 != null) {
                asVar.f2129r = a2.booleanValue();
            }
            Float a3 = abVar.m592a(str, "warmupShootDelayTransfer", (Float) null);
            if (a3 != null) {
                asVar.f2130s = a3.floatValue();
            }
            asVar.f2126o = abVar.m592a(str, "recoilOffset", Float.valueOf(asVar.f2126o)).floatValue();
            asVar.f2127p = abVar.m592a(str, "recoilOutTime", Float.valueOf(asVar.f2127p)).floatValue();
            asVar.f2128q = abVar.m581b(str, "recoilReturnTime", Float.valueOf(asVar.f2128q)).floatValue();
            Float a4 = abVar.m592a(str, "energyUsage", (Float) null);
            if (a4 != null) {
                asVar.f2131t = a4.floatValue();
            }
            asVar.f2197aH = abVar.m580b(str, "unloadUpToXUnitsAndGiveAttackOrder", Integer.valueOf(asVar.f2197aH)).intValue();
            asVar.f2198aI = abVar.m609a(lVar, str, "unloadUpToXUnitsAndGiveAttackOrder_onlyWithTag", asVar.f2198aI);
            C0363g a5 = C0363g.m2930a(lVar, abVar, str, "resourceUsage", true);
            if (a5 != null && a5.m2918c()) {
                asVar.f2132u = a5;
                lVar.m2792a(a5);
            }
            String b5 = abVar.m579b(str, "attachedTo", (String) null);
            if (b5 != null) {
                asVar.f2135x = lVar.m2767c(b5);
                if (asVar.f2135x == null) {
                    throw new RuntimeException("[" + str + "] Could not find attachedTo turret target:" + b5);
                } else if (asVar.f2135x == asVar) {
                    throw new RuntimeException("Turret cannot be attachedTo self");
                } else {
                    lVar.f2829fI = true;
                }
            }
            Float a6 = abVar.m592a(str, "idleDir", (Float) null);
            if (a6 != null) {
                asVar.f2120i = a6.floatValue();
            }
            Float a7 = abVar.m592a(str, "idleDirReversing", (Float) null);
            if (a7 != null) {
                asVar.f2121j = a7.floatValue();
                asVar.f2122k = true;
            } else if (!asVar.f2122k) {
                if (asVar.f2135x != null) {
                    asVar.f2121j = 0.0f;
                } else {
                    asVar.f2121j = asVar.f2120i + 180.0f;
                }
            }
            Boolean a8 = abVar.m594a(str, "canShoot", (Boolean) null);
            Boolean a9 = abVar.m594a(str, "canAttack", (Boolean) null);
            if (a8 == null || a9 == null) {
                if (a8 != null) {
                    asVar.f2138A = a8.booleanValue();
                } else if (a9 != null) {
                    asVar.f2138A = a9.booleanValue();
                }
                asVar.f2140C = C0321aq.m3075a(lVar, abVar.m579b(str, "shoot_sound", (String) null), asVar.f2140C);
                Float a10 = abVar.m592a(str, "shoot_sound_vol", (Float) null);
                if (a10 != null) {
                    asVar.f2140C.m3079a(a10.floatValue());
                }
                asVar.f2141D = lVar.m2780a(abVar.m579b(str, "shoot_flame", (String) null), asVar.f2141D);
                asVar.f2143F = abVar.m590a(str, "shoot_light", asVar.f2143F);
                asVar.f2142E = lVar.m2780a(abVar.m579b(str, "warmupStartEffect", (String) null), asVar.f2142E);
                asVar.f2137z = abVar.m594a(str, "slave", Boolean.valueOf(asVar.f2137z)).booleanValue();
                if (asVar.f2137z) {
                    if (asVar.f2135x == null) {
                        throw new RuntimeException("Turret cannot be a slave without being 'attachedTo' to another turret");
                    }
                    asVar.f2136y = asVar.f2135x;
                }
                asVar.f2139B = abVar.m608a(lVar, str, "invisible", asVar.f2139B);
                asVar.f2146I = abVar.m608a(lVar, str, "canAttackFlyingUnits", asVar.f2146I);
                asVar.f2147J = abVar.m608a(lVar, str, "canAttackLandUnits", asVar.f2147J);
                asVar.f2148K = abVar.m608a(lVar, str, "canAttackUnderwaterUnits", asVar.f2148K);
                asVar.f2149L = abVar.m608a(lVar, str, "canAttackNotTouchingWaterUnits", asVar.f2149L);
                asVar.f2150M = abVar.m608a(lVar, str, "canAttackCondition", asVar.f2150M);
                asVar.f2151N = abVar.m609a(lVar, str, "canOnlyAttackUnitsWithTags", asVar.f2151N);
                asVar.f2152O = abVar.m609a(lVar, str, "canOnlyAttackUnitsWithoutTags", asVar.f2152O);
                String b6 = abVar.m579b(str, "projectile", (String) null);
                if (b6 != null) {
                    C0317am d = lVar.m2763d(b6);
                    if (d != null) {
                        asVar.f2154Q = d.f2084bg;
                    } else if (!"0".equals(b6) || lVar.f2828fH.size() != 1 || lVar.m2763d("1") == null) {
                        throw new RuntimeException("[" + str + "] Could not find projectile with name:" + b6);
                    } else {
                        asVar.f2154Q = 0;
                    }
                }
                String b7 = abVar.m579b(str, "altProjectile", (String) null);
                if (b7 != null) {
                    C0317am d2 = lVar.m2763d(b7);
                    if (d2 == null) {
                        throw new RuntimeException("[" + str + "]altProjectile: Could not find projectile with name:" + b7);
                    }
                    asVar.f2155R = d2.f2084bg;
                }
                asVar.f2156S = abVar.m608a(lVar, str, "altProjectileCondition", asVar.f2156S);
                if (asVar.f2155R < 0 || asVar.f2156S != null) {
                    asVar.f2153P = abVar.m592a(str, "canAttackMaxAngle", Float.valueOf(asVar.f2153P)).floatValue();
                    asVar.f2157T = abVar.m592a(str, "turnSpeed", asVar.f2157T);
                    asVar.f2158U = abVar.m592a(str, "turnSpeedAcceleration", Float.valueOf(asVar.f2158U)).floatValue();
                    asVar.f2159V = abVar.m592a(str, "turnSpeedDeceleration", Float.valueOf(asVar.f2159V)).floatValue();
                    Float a11 = abVar.m592a(str, "barrelY", (Float) null);
                    Float a12 = abVar.m592a(str, "size", (Float) null);
                    if (a11 == null || a12 == null) {
                        if (a11 != null) {
                            asVar.f2160W = a11.floatValue();
                        }
                        if (a12 != null) {
                            asVar.f2160W = a12.floatValue();
                        }
                        asVar.f2161X = abVar.m592a(str, "barrelX", Float.valueOf(asVar.f2161X)).floatValue();
                        asVar.f2162Y = abVar.m592a(str, "barrelOffsetX_onOddShots", Float.valueOf(asVar.f2162Y)).floatValue();
                        asVar.f2163Z = abVar.m592a(str, "barrelHeight", Float.valueOf(asVar.f2163Z)).floatValue();
                        asVar.f2164aa = abVar.m592a(str, "limitingRange", Float.valueOf(asVar.f2164aa)).floatValue();
                        asVar.f2171ah = abVar.m592a(str, "limitingAngle", Float.valueOf(asVar.f2171ah)).floatValue();
                        asVar.f2169af = abVar.m592a(str, "limitingMinRange", Float.valueOf(asVar.f2169af)).floatValue();
                        asVar.f2168ae = abVar.m592a(str, "aimOffsetSpread", Float.valueOf(asVar.f2168ae)).floatValue();
                        if (asVar.f2171ah >= 0.0f) {
                            lVar.f2608bv = true;
                        }
                        if (asVar.f2164aa < 99999.0f) {
                            asVar.f2166ac = asVar.f2164aa;
                        } else {
                            asVar.f2166ac = lVar.f2711du;
                        }
                        asVar.f2167ad = asVar.f2166ac * asVar.f2166ac;
                        if (asVar.f2169af > 0.0f) {
                            asVar.f2170ag = asVar.f2169af * asVar.f2169af;
                        } else {
                            asVar.f2170ag = -1.0f;
                        }
                        asVar.f2165ab = abVar.m594a(str, "showRangeUIGuide", (Boolean) null);
                        asVar.f2172ai = abVar.m592a(str, "laserDefenceEnergyUse", asVar.f2172ai);
                        if (asVar.f2172ai != null) {
                            lVar.f2606bt = true;
                            lVar.m2794a(C0333f.f2256a);
                        }
                        asVar.f2173aj = C0364h.m2900a(abVar.m579b(str, "interceptProjectiles_withTags", (String) null), asVar.f2173aj);
                        if (asVar.f2173aj != null) {
                            lVar.f2607bu = true;
                            lVar.m2794a(C0333f.f2256a);
                            asVar.f2174ak = abVar.m592a(str, "interceptProjectiles_andTargetingGroundUnderDistance", Float.valueOf(asVar.f2174ak)).floatValue();
                            asVar.f2175al = abVar.m592a(str, "interceptProjectiles_andUnderDistance", Float.valueOf(asVar.f2175al)).floatValue();
                            asVar.f2176am = abVar.m592a(str, "interceptProjectiles_andOverHeight", Float.valueOf(asVar.f2176am)).floatValue();
                        }
                        asVar.f2179ap = abVar.m594a(str, "shouldResetTurret", Boolean.valueOf(asVar.f2179ap)).booleanValue();
                        asVar.f2180aq = abVar.m592a(str, "idleSpin", Float.valueOf(asVar.f2180aq)).floatValue();
                        asVar.f2181ar = abVar.m592a(str, "idleSweepAngle", Float.valueOf(asVar.f2181ar)).floatValue();
                        asVar.f2182as = abVar.m592a(str, "idleSweepDelay", Float.valueOf(asVar.f2182as)).floatValue();
                        asVar.f2183at = abVar.m592a(str, "idleSweepSpeed", Float.valueOf(asVar.f2183at)).floatValue();
                        asVar.f2184au = abVar.m608a(lVar, str, "idleSweepCondition", asVar.f2184au);
                        asVar.f2184au = LogicBoolean.convertAlwaysTrueToNull(asVar.f2184au);
                        asVar.f2185av = abVar.m592a(str, "idleSweepAddRandomDelay", Float.valueOf(asVar.f2185av)).floatValue();
                        if (asVar.f2185av < 0.0f) {
                            float f = 1.0f;
                            if (asVar.f2182as > 200.0f) {
                                f = 20.0f;
                            } else if (asVar.f2182as > 50.0f) {
                                f = 5.0f;
                            }
                            asVar.f2185av = f;
                        }
                        asVar.f2186aw = abVar.m592a(str, "idleSweepAddRandomAngle", Float.valueOf(asVar.f2186aw)).floatValue();
                        if (asVar.f2186aw < 0.0f) {
                            throw new RuntimeException("Turret [" + str + "]: idleSweepAddRandomAngle must be >= 0");
                        } else if (asVar.f2181ar < 0.0f) {
                            throw new RuntimeException("Turret [" + str + "]: idleSweepAngle must be >= 0");
                        } else {
                            asVar.f2187ax = abVar.m594a(str, "clearTurretTargetAfterFiring", Boolean.valueOf(asVar.f2187ax)).booleanValue();
                            asVar.f2189az = lVar.m2781a(abVar.m579b(str, "onShoot_playAnimation", (String) null), asVar.f2189az);
                            asVar.f2190aA = abVar.m581b(str, "onShoot_freezeBodyMovementFor", Float.valueOf(asVar.f2190aA)).floatValue();
                            asVar.f2191aB = abVar.m607a(lVar, str, "onShoot_triggerActions", asVar.f2191aB);
                            if (abVar.m594a(str, "isMainNanoTurret", (Boolean) false).booleanValue()) {
                                lVar.f2830fJ = asVar;
                            }
                            C0748e a13 = lVar.m2784a(abVar, str, "image");
                            if (a13 != null) {
                                asVar.f2192aC = a13;
                                boolean z = lVar.f2498p;
                                Boolean a14 = abVar.m594a(str, "image_applyTeamColors", (Boolean) null);
                                if (a14 != null) {
                                    z = a14.booleanValue();
                                }
                                if (z) {
                                    asVar.f2193aD = lVar.m2785a(asVar.f2192aC, lVar.f2529U);
                                } else {
                                    asVar.f2193aD = null;
                                }
                            }
                            asVar.f2195aF = abVar.m592a(str, "image_drawOffsetX", Float.valueOf(asVar.f2195aF)).floatValue();
                            asVar.f2196aG = abVar.m592a(str, "image_drawOffsetY", Float.valueOf(asVar.f2196aG)).floatValue();
                            C0748e a15 = lVar.m2784a(abVar, str, "chargeEffectImage");
                            if (a15 != null) {
                                asVar.f2194aE = a15;
                                lVar.f2824fD = true;
                            }
                            if (lVar.f2826fF[asVar.f2154Q] == null) {
                                throw new RuntimeException("Turret [" + str + "]: cannot find linked projectile:" + asVar.f2154Q);
                            } else if (asVar.f2155R < 0 || lVar.f2826fF[asVar.f2155R] != null) {
                                asVar.f2146I = LogicBoolean.convertAlwaysTrueToNull(asVar.f2146I);
                                asVar.f2147J = LogicBoolean.convertAlwaysTrueToNull(asVar.f2147J);
                                asVar.f2148K = LogicBoolean.convertAlwaysTrueToNull(asVar.f2148K);
                                asVar.f2149L = LogicBoolean.convertAlwaysTrueToNull(asVar.f2149L);
                                asVar.f2150M = LogicBoolean.convertAlwaysTrueToNull(asVar.f2150M);
                                if (!(asVar.f2171ah == -1.0f && asVar.f2146I == null && asVar.f2147J == null && asVar.f2148K == null && asVar.f2149L == null && asVar.f2150M == null)) {
                                    asVar.f2144G = true;
                                }
                                if (asVar.f2164aa < 99999.0f || asVar.f2169af > 0.0f) {
                                    asVar.f2144G = true;
                                    asVar.f2145H = true;
                                }
                                if (!(asVar.f2151N == null && asVar.f2152O == null)) {
                                    asVar.f2144G = true;
                                }
                                asVar.f2115d = true;
                            } else {
                                throw new RuntimeException("Turret [" + str + "]altProjectile: cannot find linked projectile");
                            }
                        }
                    } else {
                        throw new RuntimeException("Turret [" + str + "]: barrelY and size can not both be used at the same time as they have the same meaning");
                    }
                } else {
                    throw new RuntimeException("[" + str + "]altProjectileCondition is required with altProjectile");
                }
            } else {
                throw new RuntimeException("[" + str + "] Cannot use canShoot and canAttack at the same time, they have the same meaning");
            }
        }
    }
}

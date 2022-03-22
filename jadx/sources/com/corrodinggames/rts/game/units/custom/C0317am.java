package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.C0164g;
import com.corrodinggames.rts.game.C0165h;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/am.class */
public class C0317am extends C0164g {

    /* renamed from: bf */
    public String f2083bf;

    /* renamed from: bg */
    public int f2084bg;

    /* renamed from: bh */
    public C0368l f2085bh;

    /* renamed from: a */
    public static void m3089a(C0317am amVar, C0368l lVar, C0809ab abVar, String str) {
        Integer b = abVar.m580b(str, "directDamage", (Integer) null);
        Integer b2 = abVar.m580b(str, "areaDamage", (Integer) null);
        if (b == null && b2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        amVar.f1051s = abVar.m594a(str, "targetGround", Boolean.valueOf(amVar.f1051s)).booleanValue();
        amVar.f1052t = abVar.m594a(str, "targetGround_includeTargetHeight", Boolean.valueOf(amVar.f1052t)).booleanValue();
        Integer b3 = abVar.m580b(str, "areaRadius", (Integer) null);
        if (b3 != null) {
            amVar.f1041i = b3.intValue();
        }
        amVar.f1034b = abVar.m580b(str, "directDamage", Integer.valueOf(amVar.f1034b)).intValue();
        amVar.f1035c = abVar.m580b(str, "areaDamage", Integer.valueOf(amVar.f1035c)).intValue();
        amVar.f1036d = abVar.m594a(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(amVar.f1036d)).booleanValue();
        amVar.f1039g = abVar.m594a(str, "areaDamageNoFalloff", Boolean.valueOf(amVar.f1039g)).booleanValue();
        amVar.f1042j = abVar.m592a(str, "areaIgnoreUnitsCloserThan", Float.valueOf(amVar.f1042j)).floatValue();
        amVar.f1040h = abVar.m594a(str, "areaRadiusFromEdge", Boolean.valueOf(amVar.f1040h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(abVar.m579b(str, "friendlyFire", (String) null))) {
            amVar.f1044l = true;
        } else {
            Boolean a = abVar.m594a(str, "friendlyFire", (Boolean) null);
            if (a != null) {
                amVar.f1044l = false;
                amVar.f1043k = a.booleanValue();
            }
        }
        amVar.f1045m = abVar.m594a(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(amVar.f1045m)).booleanValue();
        amVar.f1046n = abVar.m594a(str, "areaHitUnderwaterAlways", Boolean.valueOf(amVar.f1046n)).booleanValue();
        amVar.f1047o = abVar.m592a(str, "deflectionPower", Float.valueOf(amVar.f1047o)).floatValue();
        amVar.f1048p = abVar.m594a(str, "nukeWeapon", Boolean.valueOf(amVar.f1048p)).booleanValue();
        amVar.f1049q = abVar.m594a(str, "shouldRevealFog", Boolean.valueOf(amVar.f1049q)).booleanValue();
        amVar.f1050r = abVar.m594a(str, "alwaysVisibleInFog", Boolean.valueOf(amVar.f1050r)).booleanValue();
        amVar.f1054v = abVar.m562g(str, "life").floatValue();
        amVar.f1053u = abVar.m581b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        amVar.f1055w = abVar.m592a(str, "speed", Float.valueOf(amVar.f1055w)).floatValue();
        amVar.f1056x = abVar.m589a(str, "frame", Short.valueOf(amVar.f1056x)).shortValue();
        amVar.f1057y = abVar.m589a(str, "drawType", Short.valueOf(amVar.f1057y)).shortValue();
        amVar.f1058z = abVar.m589a(str, "shadowFrame", Short.valueOf(amVar.f1058z)).shortValue();
        C0748e a2 = lVar.m2784a(abVar, str, "image");
        if (a2 != null) {
            amVar.f1060B = a2;
        }
        C0748e a3 = lVar.m2784a(abVar, str, "shadowImage");
        if (a3 != null) {
            amVar.f1061C = a3;
        }
        amVar.f1087ac = abVar.m592a(str, "beamImageOffsetRate", Float.valueOf(amVar.f1087ac)).floatValue();
        C0748e a4 = lVar.m2784a(abVar, str, "beamImage");
        if (a4 != null) {
            amVar.f1082X = a4;
            amVar.f1081W = true;
            if (a4.f5246l < 20 && !AbstractC0789l.m695an()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        C0748e a5 = lVar.m2784a(abVar, str, "beamImageStart");
        if (a5 != null) {
            amVar.f1083Y = a5;
            if (a4 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        amVar.f1084Z = abVar.m594a(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        C0748e a6 = lVar.m2784a(abVar, str, "beamImageEnd");
        if (a6 != null) {
            amVar.f1085aa = a6;
            if (a4 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        amVar.f1086ab = abVar.m594a(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        amVar.f1059A = abVar.m594a(str, "invisible", Boolean.valueOf(amVar.f1059A)).booleanValue();
        amVar.f1062D = abVar.m592a(str, "initialUnguidedSpeedHeight", Float.valueOf(amVar.f1062D)).floatValue();
        amVar.f1063E = abVar.m592a(str, "initialUnguidedSpeedX", Float.valueOf(amVar.f1063E)).floatValue();
        amVar.f1064F = abVar.m592a(str, "initialUnguidedSpeedY", Float.valueOf(amVar.f1064F)).floatValue();
        amVar.f1065G = abVar.m592a(str, "gravity", Float.valueOf(amVar.f1065G)).floatValue();
        amVar.f1066H = abVar.m594a(str, "instant", Boolean.valueOf(amVar.f1066H)).booleanValue();
        amVar.f1069K = abVar.m594a(str, "instantReuseLast", Boolean.valueOf(amVar.f1069K)).booleanValue();
        amVar.f1070L = abVar.m594a(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(amVar.f1070L)).booleanValue();
        if (amVar.f1070L) {
            if (!amVar.f1069K) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            lVar.f2758ep = true;
        }
        amVar.f1071M = abVar.m594a(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(amVar.f1071M)).booleanValue();
        amVar.f1077S = abVar.m594a(str, "moveWithParent", Boolean.valueOf(amVar.f1077S)).booleanValue();
        amVar.f1067I = abVar.m594a(str, "disableLeadTargeting", Boolean.valueOf(amVar.f1067I)).booleanValue();
        amVar.f1068J = abVar.m592a(str, "leadTargetingSpeedCalculation", Float.valueOf(amVar.f1068J)).floatValue();
        amVar.f1088ad = abVar.m594a(str, "ballistic", Boolean.valueOf(amVar.f1088ad)).booleanValue();
        String b4 = abVar.m579b(str, "trailEffect", (String) null);
        if (b4 != null) {
            if (b4.equalsIgnoreCase("true")) {
                amVar.f1089ae = true;
            } else if (b4.equalsIgnoreCase("false")) {
                amVar.f1089ae = false;
            } else {
                amVar.f1089ae = false;
                amVar.f1091ag = lVar.m2780a(b4, (C0381x) null);
            }
        }
        String b5 = abVar.m579b(str, "effectOnCreate", (String) null);
        if (b5 != null) {
            amVar.f1092ah = lVar.m2780a(b5, (C0381x) null);
        }
        amVar.f1090af = abVar.m592a(str, "trailEffectRate", Float.valueOf(amVar.f1090af)).floatValue();
        if (amVar.f1089ae) {
            amVar.f1098an = -1118720;
        }
        amVar.f1096al = abVar.m592a(str, "wobbleAmplitude", Float.valueOf(amVar.f1096al)).floatValue();
        amVar.f1097am = abVar.m581b(str, "wobbleFrequency", Float.valueOf(amVar.f1097am)).floatValue();
        if (amVar.f1097am <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        amVar.f1094aj = C0318an.m3083a(lVar, abVar, str, "spawnProjectilesOnEndOfLife", (C0318an) null);
        amVar.f1093ai = C0318an.m3083a(lVar, abVar, str, "spawnProjectilesOnExplode", (C0318an) null);
        amVar.f1095ak = C0318an.m3083a(lVar, abVar, str, "spawnProjectilesOnCreate", (C0318an) null);
        amVar.f1098an = abVar.m590a(str, "lightColor", Integer.valueOf(amVar.f1098an)).intValue();
        amVar.f1099ao = abVar.m592a(str, "lightSize", Float.valueOf(amVar.f1099ao)).floatValue();
        amVar.f1100ap = abVar.m594a(str, "lightCastOnGround", Boolean.valueOf(amVar.f1100ap)).booleanValue();
        amVar.f1101aq = abVar.m594a(str, "largeHitEffect", Boolean.valueOf(amVar.f1101aq)).booleanValue();
        amVar.f1072N = abVar.m592a(str, "turnSpeed", Float.valueOf(amVar.f1072N)).floatValue();
        amVar.f1073O = abVar.m592a(str, "turnSpeedWhenNear", Float.valueOf(amVar.f1073O)).floatValue();
        amVar.f1074P = abVar.m592a(str, "sweepSpeed", Float.valueOf(amVar.f1074P)).floatValue();
        amVar.f1075Q = abVar.m592a(str, "sweepOffset", Float.valueOf(amVar.f1075Q)).floatValue();
        amVar.f1076R = abVar.m592a(str, "sweepOffsetFromTargetRadius", Float.valueOf(amVar.f1076R)).floatValue();
        amVar.f1078T = abVar.m594a(str, "drawUnderUnits", Boolean.valueOf(amVar.f1078T)).booleanValue();
        amVar.f1079U = abVar.m594a(str, "lightingEffect", Boolean.valueOf(amVar.f1079U)).booleanValue();
        amVar.f1080V = abVar.m594a(str, "laserEffect", Boolean.valueOf(amVar.f1080V)).booleanValue();
        if (amVar.f1080V && amVar.f1082X == null) {
            amVar.f1114aD = Color.m4213a(80, 255, 0, 0);
        }
        if (amVar.f1079U && amVar.f1051s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        } else if (!amVar.f1080V || !amVar.f1051s) {
            amVar.f1102ar = abVar.m592a(str, "ballistic_delaymove_height", Float.valueOf(amVar.f1102ar)).floatValue();
            amVar.f1103as = abVar.m592a(str, "ballistic_height", Float.valueOf(amVar.f1103as)).floatValue();
            amVar.f1104at = abVar.m592a(str, "targetSpeed", Float.valueOf(amVar.f1104at)).floatValue();
            amVar.f1105au = abVar.m592a(str, "targetSpeedAcceleration", Float.valueOf(amVar.f1105au)).floatValue();
            amVar.f1106av = abVar.m594a(str, "autoTargetingOnDeadTarget", Boolean.valueOf(amVar.f1106av)).booleanValue();
            amVar.f1107aw = abVar.m592a(str, "autoTargetingOnDeadTargetRange", Float.valueOf(amVar.f1107aw)).floatValue();
            amVar.f1108ax = abVar.m592a(str, "autoTargetingOnDeadTargetLead", Float.valueOf(amVar.f1108ax)).floatValue();
            amVar.f1109ay = abVar.m594a(str, "retargetingInFlight", Boolean.valueOf(amVar.f1109ay)).booleanValue();
            amVar.f1110az = abVar.m592a(str, "retargetingInFlightSearchDelay", Float.valueOf(amVar.f1110az)).floatValue();
            amVar.f1111aA = abVar.m592a(str, "retargetingInFlightSearchRange", Float.valueOf(amVar.f1111aA)).floatValue();
            amVar.f1112aB = abVar.m592a(str, "retargetingInFlightSearchLead", Float.valueOf(amVar.f1112aB)).floatValue();
            amVar.f1113aC = abVar.m609a(lVar, str, "retargetingInFlightSearchOnlyTags", (C0365i) null);
            if (amVar.f1107aw > 1500.0f) {
                throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
            } else if (amVar.f1111aA > 1500.0f) {
                throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
            } else {
                amVar.f1114aD = abVar.m590a(str, "color", Integer.valueOf(amVar.f1114aD)).intValue();
                amVar.f1116aF = abVar.m592a(str, "teamColorRatio", Float.valueOf(amVar.f1116aF)).floatValue();
                if (amVar.f1116aF < 0.0f || amVar.f1116aF > 1.0f) {
                    throw new RuntimeException("teamColorRatio should be between 0-1 got:" + amVar.f1116aF);
                }
                amVar.f1117aG = abVar.m592a(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - amVar.f1116aF)).floatValue();
                if (amVar.f1117aG < 0.0f || amVar.f1117aG > 1.0f) {
                    throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + amVar.f1117aG);
                } else if (amVar.f1116aF != 0.0f || amVar.f1117aG == 1.0f) {
                    amVar.f1115aE = abVar.m592a(str, "drawSize", Float.valueOf(amVar.f1115aE)).floatValue();
                    amVar.f1118aH = abVar.m594a(str, "flameWeapon", Boolean.valueOf(amVar.f1118aH)).booleanValue();
                    amVar.f1119aI = abVar.m594a(str, "hitSound", Boolean.valueOf(amVar.f1119aI)).booleanValue();
                    amVar.f1121aK = abVar.m592a(str, "targetGroundHeightOffset", Float.valueOf(amVar.f1121aK)).floatValue();
                    amVar.f1120aJ = abVar.m592a(str, "targetGroundSpread", Float.valueOf(amVar.f1120aJ)).floatValue();
                    amVar.f1122aL = abVar.m592a(str, "speedSpread", Float.valueOf(amVar.f1122aL)).floatValue();
                    amVar.f1123aM = abVar.m594a(str, "explodeOnEndOfLife", Boolean.valueOf(amVar.f1123aM)).booleanValue();
                    amVar.f1124aN = abVar.m592a(str, "pushForce", Float.valueOf(amVar.f1124aN)).floatValue();
                    amVar.f1125aO = abVar.m592a(str, "pushVelocity", Float.valueOf(amVar.f1125aO)).floatValue();
                    amVar.f1126aP = abVar.m592a(str, "buildingDamageMultiplier", Float.valueOf(amVar.f1126aP)).floatValue();
                    amVar.f1127aQ = abVar.m592a(str, "shieldDamageMultiplier", Float.valueOf(amVar.f1127aQ)).floatValue();
                    amVar.f1128aR = abVar.m592a(str, "shieldDefectionMultiplier", Float.valueOf(amVar.f1128aR)).floatValue();
                    amVar.f1129aS = abVar.m592a(str, "hullDamageMultiplier", Float.valueOf(amVar.f1129aS)).floatValue();
                    amVar.f1130aT = abVar.m592a(str, "armourIgnoreAmount", Float.valueOf(amVar.f1130aT)).floatValue();
                    amVar.f1131aU = abVar.m592a(str, "areaExpandTime", Float.valueOf(amVar.f1131aU)).floatValue();
                    String b6 = abVar.m579b(str, "explodeEffect", (String) null);
                    if (b6 != null) {
                        amVar.f1132aV = lVar.m2780a(b6, (C0381x) null);
                    }
                    String b7 = abVar.m579b(str, "explodeEffectOnShield", (String) null);
                    if (b7 != null) {
                        amVar.f1133aW = lVar.m2780a(b7, (C0381x) null);
                    }
                    C0325au a7 = C0325au.m3068a(lVar, abVar, str, "spawnUnit");
                    if (a7 != null && !a7.m3063b()) {
                        amVar.f1134aX = a7;
                    }
                    amVar.f1135aY = abVar.m580b(str, "unloadUpToXUnitsFromSource", Integer.valueOf(amVar.f1135aY)).intValue();
                    amVar.f1136aZ = abVar.m594a(str, "teleportSource", Boolean.valueOf(amVar.f1136aZ)).booleanValue();
                    amVar.f1137ba = abVar.m594a(str, "convertHitToSourceTeam", Boolean.valueOf(amVar.f1137ba)).booleanValue();
                    amVar.f1138bb = C0364h.m2901a(abVar.m579b(str, "tags", (String) null));
                    C0835m j = abVar.m556j(str, "mutator");
                    C0835m mVar = new C0835m();
                    Iterator it = j.iterator();
                    while (it.hasNext()) {
                        String[] split = ((String) it.next()).split("_");
                        if (split.length > 1) {
                            String str2 = split[0];
                            String str3 = str2 + "_";
                            if (!mVar.contains(str3) && str2.length() > "mutator".length()) {
                                mVar.add(str3);
                            }
                        }
                    }
                    Iterator it2 = mVar.iterator();
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        C0165h hVar = new C0165h();
                        hVar.f1142a = C0364h.m2901a(abVar.m579b(str, str4 + "ifUnitWithTags", (String) null));
                        hVar.f1143b = C0364h.m2901a(abVar.m579b(str, str4 + "ifUnitWithoutTags", (String) null));
                        if (hVar.f1142a == null && hVar.f1143b == null) {
                            throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
                        }
                        hVar.f1144c = abVar.m592a(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                        hVar.f1145d = abVar.m592a(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                        C0363g a8 = C0363g.m2930a(lVar, abVar, str, str4 + "addResourcesDirectHit", true);
                        if (a8 != null && a8.m2918c()) {
                            hVar.f1146e = a8;
                            if (amVar.f1051s) {
                                throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                            }
                        }
                        C0363g a9 = C0363g.m2930a(lVar, abVar, str, str4 + "addResourcesAreaHit", true);
                        if (a9 != null && a9.m2918c()) {
                            hVar.f1147f = a9;
                            if (b3 == null) {
                                throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                            }
                        }
                        String b8 = abVar.m579b(str, str4 + "changedExplodeEffect", (String) null);
                        if (b8 != null) {
                            hVar.f1148g = lVar.m2780a(b8, (C0381x) null);
                            if (hVar.f1148g != null && !hVar.f1148g.m2712a()) {
                                hVar.f1148g = null;
                            }
                        }
                        boolean z = false;
                        boolean z2 = false;
                        if (!C0654f.m1418j(hVar.f1144c, 1.0f)) {
                            z = true;
                        }
                        if (!C0654f.m1418j(hVar.f1145d, 1.0f) && amVar.f1035c != 0 && amVar.f1041i > 0) {
                            z2 = true;
                        }
                        if (hVar.f1146e != null) {
                            z = true;
                        }
                        if (hVar.f1147f != null) {
                            z2 = true;
                        }
                        if (z) {
                            if (amVar.f1139bc == null) {
                                amVar.f1139bc = new C0835m();
                            }
                            amVar.f1139bc.add(hVar);
                        }
                        if (z2) {
                            if (amVar.f1140bd == null) {
                                amVar.f1140bd = new C0835m();
                            }
                            amVar.f1037e = true;
                            amVar.f1140bd.add(hVar);
                        }
                        if (hVar.f1148g != null) {
                            if (amVar.f1141be == null) {
                                amVar.f1141be = new C0835m();
                            }
                            amVar.f1141be.add(hVar);
                        }
                    }
                    if (amVar.f1035c != 0 && amVar.f1041i > 0) {
                        amVar.f1037e = true;
                    }
                    if (!(amVar.f1124aN == 0.0f && amVar.f1125aO == 0.0f) && amVar.f1041i > 0) {
                        amVar.f1037e = true;
                    }
                    amVar.f1038f = !amVar.f1037e;
                    lVar.f2828fH.add(amVar);
                } else {
                    throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
                }
            }
        } else {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
    }

    /* renamed from: a */
    public static void m3088a(C0317am amVar, C0690ap apVar) {
        apVar.mo1145a(amVar.f2085bh);
        apVar.mo1129c(amVar.f2083bf);
    }

    /* renamed from: b */
    public static C0164g m3087b(C0707k kVar) {
        AbstractC0268al p = kVar.m1052p();
        String k = kVar.m1057k();
        if (p == null) {
            return null;
        }
        if (!(p instanceof C0368l)) {
            AbstractC0789l.m682b("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + p.mo2754i() + " loading real_meta");
            return null;
        }
        C0317am d = ((C0368l) p).m2763d(k);
        if (d != null) {
            return d;
        }
        AbstractC0789l.m682b("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + k);
        return null;
    }

    /* renamed from: a */
    public void m3090a(AbstractC0210af afVar, C0163f fVar, AbstractC0210af afVar2, float f, float f2, float f3) {
        if (afVar2 == null) {
            fVar.f996aC = true;
            fVar.f929n = f;
            fVar.f930o = f2;
            if (this.f1120aJ != 0.0f) {
                fVar.f929n += C0654f.m1499a((AbstractC0854w) afVar, (int) ((-this.f1120aJ) * 100.0f), (int) (this.f1120aJ * 100.0f), 2) / 100.0f;
                afVar.f1441bi = (int) (afVar.f1441bi + fVar.f929n);
                fVar.f930o += C0654f.m1499a((AbstractC0854w) afVar, (int) ((-this.f1120aJ) * 100.0f), (int) (this.f1120aJ * 100.0f), 3) / 100.0f;
                afVar.f1441bi = (int) (afVar.f1441bi + fVar.f930o);
            }
            fVar.f931p = 0.0f;
            fVar.f931p += this.f1121aK;
        } else if (fVar.f928m) {
            fVar.f996aC = true;
            if (!this.f1067I) {
                float f4 = fVar.f935t;
                if (this.f1104at != -1.0f) {
                    f4 = this.f1104at;
                }
                if (this.f1068J >= 0.0f) {
                    f4 = this.f1068J;
                }
                PointF a = afVar2.m3340a(fVar.f5842dH, fVar.f5843dI, f4, fVar.f923h, f3);
                fVar.f929n = a.f224a;
                fVar.f930o = a.f225b;
            } else {
                fVar.f929n = afVar2.f5842dH;
                fVar.f930o = afVar2.f5843dI;
            }
            if (this.f1052t) {
                fVar.f931p = afVar2.f5844dJ;
            } else {
                fVar.f931p = 0.0f;
            }
            fVar.f931p += this.f1121aK;
            if (this.f1120aJ != 0.0f) {
                fVar.f929n += C0654f.m1499a((AbstractC0854w) afVar, (int) ((-this.f1120aJ) * 100.0f), (int) (this.f1120aJ * 100.0f), 2) / 100.0f;
                fVar.f930o += C0654f.m1499a((AbstractC0854w) afVar, (int) ((-this.f1120aJ) * 100.0f), (int) (this.f1120aJ * 100.0f), 7) / 100.0f;
            }
        } else {
            fVar.f927l = afVar2;
        }
    }
}

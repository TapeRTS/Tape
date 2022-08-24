package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0189g;
import com.corrodinggames.rts.game.C0190h;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bf */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bf.class */
public class C0405bf extends C0189g {

    /* renamed from: bh */
    public String f2513bh;

    /* renamed from: bi */
    public int f2514bi;

    /* renamed from: bj */
    public C0453l f2515bj;

    /* renamed from: a */
    public static void m5281a(C0405bf c0405bf, C0453l c0453l, C1072ab c1072ab, String str) {
        Integer m682b = c1072ab.m682b(str, "directDamage", (Integer) null);
        Integer m682b2 = c1072ab.m682b(str, "areaDamage", (Integer) null);
        if (m682b == null && m682b2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        c0405bf.f1162s = c1072ab.m700a(str, "targetGround", Boolean.valueOf(c0405bf.f1162s)).booleanValue();
        c0405bf.f1163t = c1072ab.m700a(str, "targetGround_includeTargetHeight", Boolean.valueOf(c0405bf.f1163t)).booleanValue();
        Integer m682b3 = c1072ab.m682b(str, "areaRadius", (Integer) null);
        if (m682b3 != null) {
            c0405bf.f1152i = m682b3.intValue();
        }
        c0405bf.f1099b = c1072ab.m682b(str, "directDamage", Integer.valueOf(c0405bf.f1099b)).intValue();
        c0405bf.f1100c = c1072ab.m682b(str, "areaDamage", Integer.valueOf(c0405bf.f1100c)).intValue();
        c0405bf.f1101d = c1072ab.m700a(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(c0405bf.f1101d)).booleanValue();
        c0405bf.f1104g = c1072ab.m700a(str, "areaDamageNoFalloff", Boolean.valueOf(c0405bf.f1104g)).booleanValue();
        c0405bf.f1153j = c1072ab.m698a(str, "areaIgnoreUnitsCloserThan", Float.valueOf(c0405bf.f1153j)).floatValue();
        c0405bf.f1105h = c1072ab.m700a(str, "areaRadiusFromEdge", Boolean.valueOf(c0405bf.f1105h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(c1072ab.m681b(str, "friendlyFire", (String) null))) {
            c0405bf.f1155l = true;
        } else {
            Boolean m700a = c1072ab.m700a(str, "friendlyFire", (Boolean) null);
            if (m700a != null) {
                c0405bf.f1155l = false;
                c0405bf.f1154k = m700a.booleanValue();
            }
        }
        c0405bf.f1156m = c1072ab.m700a(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(c0405bf.f1156m)).booleanValue();
        c0405bf.f1157n = c1072ab.m700a(str, "areaHitUnderwaterAlways", Boolean.valueOf(c0405bf.f1157n)).booleanValue();
        c0405bf.f1158o = c1072ab.m698a(str, "deflectionPower", Float.valueOf(c0405bf.f1158o)).floatValue();
        c0405bf.f1159p = c1072ab.m700a(str, "nukeWeapon", Boolean.valueOf(c0405bf.f1159p)).booleanValue();
        c0405bf.f1160q = c1072ab.m700a(str, "shouldRevealFog", Boolean.valueOf(c0405bf.f1160q)).booleanValue();
        c0405bf.f1161r = c1072ab.m700a(str, "alwaysVisibleInFog", Boolean.valueOf(c0405bf.f1161r)).booleanValue();
        c0405bf.f1107v = c1072ab.m660h(str, "life").floatValue();
        c0405bf.f1106u = c1072ab.m683b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        c0405bf.f1164w = c1072ab.m698a(str, "speed", Float.valueOf(c0405bf.f1164w)).floatValue();
        c0405bf.f1165x = c1072ab.m695a(str, "frame", Short.valueOf(c0405bf.f1165x)).shortValue();
        c0405bf.f1108y = c1072ab.m695a(str, "drawType", Short.valueOf(c0405bf.f1108y)).shortValue();
        c0405bf.f1166z = c1072ab.m695a(str, "shadowFrame", Short.valueOf(c0405bf.f1166z)).shortValue();
        BitmapOrTexture m4758a = c0453l.m4758a(c1072ab, str, "image");
        if (m4758a != null) {
            c0405bf.f1110B = m4758a;
        }
        BitmapOrTexture m4758a2 = c0453l.m4758a(c1072ab, str, "shadowImage");
        if (m4758a2 != null) {
            c0405bf.f1111C = m4758a2;
        }
        c0405bf.f1126ad = c1072ab.m698a(str, "beamImageOffsetRate", Float.valueOf(c0405bf.f1126ad)).floatValue();
        BitmapOrTexture m4758a3 = c0453l.m4758a(c1072ab, str, "beamImage");
        if (m4758a3 != null) {
            c0405bf.f1121Y = m4758a3;
            c0405bf.f1178X = true;
            if (m4758a3.f6397q < 20 && !GameEngine.m1155aw()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        BitmapOrTexture m4758a4 = c0453l.m4758a(c1072ab, str, "beamImageStart");
        if (m4758a4 != null) {
            c0405bf.f1122Z = m4758a4;
            if (m4758a3 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        c0405bf.f1123aa = c1072ab.m700a(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        BitmapOrTexture m4758a5 = c0453l.m4758a(c1072ab, str, "beamImageEnd");
        if (m4758a5 != null) {
            c0405bf.f1124ab = m4758a5;
            if (m4758a3 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        c0405bf.f1125ac = c1072ab.m700a(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        c0405bf.f1109A = c1072ab.m700a(str, "invisible", Boolean.valueOf(c0405bf.f1109A)).booleanValue();
        c0405bf.f1112D = c1072ab.m698a(str, "initialUnguidedSpeedHeight", Float.valueOf(c0405bf.f1112D)).floatValue();
        c0405bf.f1113E = c1072ab.m698a(str, "initialUnguidedSpeedX", Float.valueOf(c0405bf.f1113E)).floatValue();
        c0405bf.f1114F = c1072ab.m698a(str, "initialUnguidedSpeedY", Float.valueOf(c0405bf.f1114F)).floatValue();
        c0405bf.f1115G = c1072ab.m698a(str, "gravity", Float.valueOf(c0405bf.f1115G)).floatValue();
        c0405bf.f1116H = c1072ab.m698a(str, "trueGravity", Float.valueOf(c0405bf.f1116H)).floatValue();
        c0405bf.f1167I = c1072ab.m700a(str, "instant", Boolean.valueOf(c0405bf.f1167I)).booleanValue();
        c0405bf.f1170L = c1072ab.m700a(str, "instantReuseLast", Boolean.valueOf(c0405bf.f1170L)).booleanValue();
        c0405bf.f1171M = c1072ab.m700a(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(c0405bf.f1171M)).booleanValue();
        if (c0405bf.f1171M) {
            if (!c0405bf.f1170L) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            c0453l.f3114ev = true;
        }
        c0405bf.f1172N = c1072ab.m700a(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(c0405bf.f1172N)).booleanValue();
        c0405bf.f1120T = c1072ab.m700a(str, "moveWithParent", Boolean.valueOf(c0405bf.f1120T)).booleanValue();
        c0405bf.f1168J = c1072ab.m700a(str, "disableLeadTargeting", Boolean.valueOf(c0405bf.f1168J)).booleanValue();
        c0405bf.f1169K = c1072ab.m698a(str, "leadTargetingSpeedCalculation", Float.valueOf(c0405bf.f1169K)).floatValue();
        c0405bf.f1179ae = c1072ab.m700a(str, "ballistic", Boolean.valueOf(c0405bf.f1179ae)).booleanValue();
        String m681b = c1072ab.m681b(str, "trailEffect", (String) null);
        if (m681b != null) {
            if (m681b.equalsIgnoreCase("true")) {
                c0405bf.f1180af = true;
            } else if (m681b.equalsIgnoreCase("false")) {
                c0405bf.f1180af = false;
            } else {
                c0405bf.f1180af = false;
                c0405bf.f1127ah = c0453l.m4753a(m681b, (C0467y) null);
            }
        }
        String m681b2 = c1072ab.m681b(str, "effectOnCreate", (String) null);
        if (m681b2 != null) {
            c0405bf.f1128ai = c0453l.m4753a(m681b2, (C0467y) null);
        }
        c0405bf.f1181ag = c1072ab.m698a(str, "trailEffectRate", Float.valueOf(c0405bf.f1181ag)).floatValue();
        if (c0405bf.f1180af) {
            c0405bf.f1183ao = -1118720;
        }
        c0405bf.f1132am = c1072ab.m698a(str, "wobbleAmplitude", Float.valueOf(c0405bf.f1132am)).floatValue();
        c0405bf.f1182an = c1072ab.m683b(str, "wobbleFrequency", Float.valueOf(c0405bf.f1182an)).floatValue();
        if (c0405bf.f1182an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        c0405bf.f1130ak = C0406bg.m5275a(c0453l, c1072ab, str, "spawnProjectilesOnEndOfLife", (C0406bg) null);
        c0405bf.f1129aj = C0406bg.m5275a(c0453l, c1072ab, str, "spawnProjectilesOnExplode", (C0406bg) null);
        c0405bf.f1131al = C0406bg.m5275a(c0453l, c1072ab, str, "spawnProjectilesOnCreate", (C0406bg) null);
        c0405bf.f1183ao = c1072ab.m696a(str, "lightColor", Integer.valueOf(c0405bf.f1183ao)).intValue();
        c0405bf.f1184ap = c1072ab.m698a(str, "lightSize", Float.valueOf(c0405bf.f1184ap)).floatValue();
        c0405bf.f1133aq = c1072ab.m700a(str, "lightCastOnGround", Boolean.valueOf(c0405bf.f1133aq)).booleanValue();
        c0405bf.f1185ar = c1072ab.m700a(str, "largeHitEffect", Boolean.valueOf(c0405bf.f1185ar)).booleanValue();
        c0405bf.f1173O = c1072ab.m698a(str, "turnSpeed", Float.valueOf(c0405bf.f1173O)).floatValue();
        c0405bf.f1174P = c1072ab.m698a(str, "turnSpeedWhenNear", Float.valueOf(c0405bf.f1174P)).floatValue();
        c0405bf.f1117Q = c1072ab.m698a(str, "sweepSpeed", Float.valueOf(c0405bf.f1117Q)).floatValue();
        c0405bf.f1118R = c1072ab.m698a(str, "sweepOffset", Float.valueOf(c0405bf.f1118R)).floatValue();
        c0405bf.f1119S = c1072ab.m698a(str, "sweepOffsetFromTargetRadius", Float.valueOf(c0405bf.f1119S)).floatValue();
        c0405bf.f1175U = c1072ab.m700a(str, "drawUnderUnits", Boolean.valueOf(c0405bf.f1175U)).booleanValue();
        c0405bf.f1176V = c1072ab.m700a(str, "lightingEffect", Boolean.valueOf(c0405bf.f1176V)).booleanValue();
        c0405bf.f1177W = c1072ab.m700a(str, "laserEffect", Boolean.valueOf(c0405bf.f1177W)).booleanValue();
        if (c0405bf.f1177W && c0405bf.f1121Y == null) {
            c0405bf.f1196aE = Color.argb(80, 255, 0, 0);
        }
        if (c0405bf.f1176V && c0405bf.f1162s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (c0405bf.f1177W && c0405bf.f1162s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        c0405bf.f1186as = c1072ab.m698a(str, "ballistic_delaymove_height", Float.valueOf(c0405bf.f1186as)).floatValue();
        c0405bf.f1187at = c1072ab.m698a(str, "ballistic_height", Float.valueOf(c0405bf.f1187at)).floatValue();
        c0405bf.f1188au = c1072ab.m698a(str, "targetSpeed", Float.valueOf(c0405bf.f1188au)).floatValue();
        c0405bf.f1189av = c1072ab.m698a(str, "targetSpeedAcceleration", Float.valueOf(c0405bf.f1189av)).floatValue();
        c0405bf.f1190aw = c1072ab.m700a(str, "autoTargetingOnDeadTarget", Boolean.valueOf(c0405bf.f1190aw)).booleanValue();
        c0405bf.f1191ax = c1072ab.m698a(str, "autoTargetingOnDeadTargetRange", Float.valueOf(c0405bf.f1191ax)).floatValue();
        c0405bf.f1192ay = c1072ab.m698a(str, "autoTargetingOnDeadTargetLead", Float.valueOf(c0405bf.f1192ay)).floatValue();
        c0405bf.f1134az = c1072ab.m700a(str, "retargetingInFlight", Boolean.valueOf(c0405bf.f1134az)).booleanValue();
        c0405bf.f1193aA = c1072ab.m698a(str, "retargetingInFlightSearchDelay", Float.valueOf(c0405bf.f1193aA)).floatValue();
        c0405bf.f1194aB = c1072ab.m698a(str, "retargetingInFlightSearchRange", Float.valueOf(c0405bf.f1194aB)).floatValue();
        c0405bf.f1195aC = c1072ab.m698a(str, "retargetingInFlightSearchLead", Float.valueOf(c0405bf.f1195aC)).floatValue();
        c0405bf.f1135aD = c1072ab.m720a(c0453l, str, "retargetingInFlightSearchOnlyTags", (C0449h) null);
        if (c0405bf.f1191ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (c0405bf.f1194aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        c0405bf.f1196aE = c1072ab.m696a(str, "color", Integer.valueOf(c0405bf.f1196aE)).intValue();
        c0405bf.f1198aG = c1072ab.m698a(str, "teamColorRatio", Float.valueOf(c0405bf.f1198aG)).floatValue();
        if (c0405bf.f1198aG < 0.0f || c0405bf.f1198aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + c0405bf.f1198aG);
        }
        c0405bf.f1199aH = c1072ab.m698a(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - c0405bf.f1198aG)).floatValue();
        if (c0405bf.f1199aH < 0.0f || c0405bf.f1199aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + c0405bf.f1199aH);
        }
        if (c0405bf.f1198aG == 0.0f && c0405bf.f1199aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        c0405bf.f1197aF = c1072ab.m698a(str, "drawSize", Float.valueOf(c0405bf.f1197aF)).floatValue();
        c0405bf.f1136aI = c1072ab.m700a(str, "flameWeapon", Boolean.valueOf(c0405bf.f1136aI)).booleanValue();
        c0405bf.f1200aJ = c1072ab.m700a(str, "hitSound", Boolean.valueOf(c0405bf.f1200aJ)).booleanValue();
        c0405bf.f1138aL = c1072ab.m698a(str, "targetGroundHeightOffset", Float.valueOf(c0405bf.f1138aL)).floatValue();
        c0405bf.f1137aK = c1072ab.m698a(str, "targetGroundSpread", Float.valueOf(c0405bf.f1137aK)).floatValue();
        c0405bf.f1139aM = c1072ab.m698a(str, "speedSpread", Float.valueOf(c0405bf.f1139aM)).floatValue();
        c0405bf.f1141aO = c1072ab.m700a(str, "explodeOnEndOfLife", Boolean.valueOf(c0405bf.f1141aO)).booleanValue();
        c0405bf.f1140aN = c1072ab.m700a(str, "ignoreParentShootDamageMultiplier", Boolean.valueOf(c0405bf.f1140aN)).booleanValue();
        c0405bf.f1142aP = c1072ab.m698a(str, "pushForce", Float.valueOf(c0405bf.f1142aP)).floatValue();
        c0405bf.f1143aQ = c1072ab.m698a(str, "pushVelocity", Float.valueOf(c0405bf.f1143aQ)).floatValue();
        c0405bf.f1201aR = c1072ab.m698a(str, "buildingDamageMultiplier", Float.valueOf(c0405bf.f1201aR)).floatValue();
        c0405bf.f1202aS = c1072ab.m698a(str, "shieldDamageMultiplier", Float.valueOf(c0405bf.f1202aS)).floatValue();
        c0405bf.f1203aT = c1072ab.m698a(str, "shieldDefectionMultiplier", Float.valueOf(c0405bf.f1203aT)).floatValue();
        c0405bf.f1204aU = c1072ab.m698a(str, "hullDamageMultiplier", Float.valueOf(c0405bf.f1204aU)).floatValue();
        c0405bf.f1144aV = c1072ab.m698a(str, "armourIgnoreAmount", Float.valueOf(c0405bf.f1144aV)).floatValue();
        c0405bf.f1205aW = c1072ab.m698a(str, "areaExpandTime", Float.valueOf(c0405bf.f1205aW)).floatValue();
        String m681b3 = c1072ab.m681b(str, "explodeEffect", (String) null);
        if (m681b3 != null) {
            c0405bf.f1145aX = c0453l.m4753a(m681b3, (C0467y) null);
        }
        String m681b4 = c1072ab.m681b(str, "explodeEffectOnShield", (String) null);
        if (m681b4 != null) {
            c0405bf.f1146aY = c0453l.m4753a(m681b4, (C0467y) null);
        }
        C0413bn m5260a = C0413bn.m5260a(c0453l, c1072ab, str, "spawnUnit");
        if (m5260a != null && !m5260a.m5255b()) {
            c0405bf.f1147aZ = m5260a;
        }
        c0405bf.f1148ba = c1072ab.m682b(str, "unloadUpToXUnitsFromSource", Integer.valueOf(c0405bf.f1148ba)).intValue();
        c0405bf.f1149bb = c1072ab.m700a(str, "teleportSource", Boolean.valueOf(c0405bf.f1149bb)).booleanValue();
        c0405bf.f1150bc = c1072ab.m700a(str, "convertHitToSourceTeam", Boolean.valueOf(c0405bf.f1150bc)).booleanValue();
        c0405bf.f1151bd = C0448g.m5058a(c1072ab.m681b(str, "tags", (String) null));
        C1101m m654k = c1072ab.m654k(str, "mutator");
        C1101m c1101m = new C1101m();
        Iterator it = m654k.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split("_");
            if (split.length > 1) {
                String str2 = split[0];
                String str3 = str2 + "_";
                if (!c1101m.contains(str3) && str2.length() > "mutator".length()) {
                    c1101m.add(str3);
                }
            }
        }
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C0190h c0190h = new C0190h();
            c0190h.f1209a = C0448g.m5058a(c1072ab.m681b(str, str4 + "ifUnitWithTags", (String) null));
            c0190h.f1210b = C0448g.m5058a(c1072ab.m681b(str, str4 + "ifUnitWithoutTags", (String) null));
            if (c0190h.f1209a == null && c0190h.f1210b == null) {
                throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
            }
            c0190h.f1211c = c1072ab.m698a(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            c0190h.f1212d = c1072ab.m698a(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            C0424b m5217a = C0424b.m5217a(c0453l, c1072ab, str, str4 + "addResourcesDirectHit", true);
            if (m5217a != null && m5217a.m5197c()) {
                c0190h.f1213e = m5217a;
                if (c0405bf.f1162s) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            C0424b m5217a2 = C0424b.m5217a(c0453l, c1072ab, str, str4 + "addResourcesAreaHit", true);
            if (m5217a2 != null && m5217a2.m5197c()) {
                c0190h.f1214f = m5217a2;
                if (m682b3 == null) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            String m681b5 = c1072ab.m681b(str, str4 + "changedExplodeEffect", (String) null);
            if (m681b5 != null) {
                c0190h.f1215g = c0453l.m4753a(m681b5, (C0467y) null);
                if (c0190h.f1215g != null && !c0190h.f1215g.m4679a()) {
                    c0190h.f1215g = null;
                }
            }
            boolean z = false;
            boolean z2 = false;
            if (!CommonUtils.m2246j(c0190h.f1211c, 1.0f)) {
                z = true;
            }
            if (!CommonUtils.m2246j(c0190h.f1212d, 1.0f) && c0405bf.f1100c != 0 && c0405bf.f1152i > 0) {
                z2 = true;
            }
            if (c0190h.f1213e != null) {
                z = true;
            }
            if (c0190h.f1214f != null) {
                z2 = true;
            }
            if (z) {
                if (c0405bf.f1206be == null) {
                    c0405bf.f1206be = new C1101m();
                }
                c0405bf.f1206be.add(c0190h);
            }
            if (z2) {
                if (c0405bf.f1207bf == null) {
                    c0405bf.f1207bf = new C1101m();
                }
                c0405bf.f1102e = true;
                c0405bf.f1207bf.add(c0190h);
            }
            if (c0190h.f1215g != null) {
                if (c0405bf.f1208bg == null) {
                    c0405bf.f1208bg = new C1101m();
                }
                c0405bf.f1208bg.add(c0190h);
            }
        }
        if (c0405bf.f1100c != 0 && c0405bf.f1152i > 0) {
            c0405bf.f1102e = true;
        }
        if ((c0405bf.f1142aP != 0.0f || c0405bf.f1143aQ != 0.0f) && c0405bf.f1152i > 0) {
            c0405bf.f1102e = true;
        }
        c0405bf.f1103f = !c0405bf.f1102e;
        c0453l.f3266fO.add(c0405bf);
    }

    /* renamed from: a */
    public static void m5280a(C0405bf c0405bf, C0859ar c0859ar) {
        c0859ar.m1574a(c0405bf.f2515bj);
        c0859ar.m1553c(c0405bf.f2513bh);
    }

    /* renamed from: b */
    public static C0189g m5279b(C0876k c0876k) {
        InterfaceC0303as m1443q = c0876k.m1443q();
        String m1448l = c0876k.m1448l();
        if (m1443q == null) {
            return null;
        }
        if (!(m1443q instanceof C0453l)) {
            GameEngine.m1145b("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + m1443q.mo5706i() + " loading real_meta");
            return null;
        }
        C0405bf m4729f = ((C0453l) m1443q).m4729f(m1448l);
        if (m4729f == null) {
            GameEngine.m1145b("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + m1448l);
            return null;
        }
        return m4729f;
    }

    /* renamed from: a */
    public void m5282a(Unit unit, Projectile projectile, Unit unit2, float f, float f2, float f3) {
        if (unit2 == null) {
            projectile.f1053aC = true;
            projectile.f987n = f;
            projectile.f988o = f2;
            if (this.f1137aK != 0.0f) {
                projectile.f987n += CommonUtils.m2345a((AbstractC1120w) unit, (int) ((-this.f1137aK) * 100.0f), (int) (this.f1137aK * 100.0f), 2) / 100.0f;
                unit.f1587bB = (int) (unit.f1587bB + projectile.f987n);
                projectile.f988o += CommonUtils.m2345a((AbstractC1120w) unit, (int) ((-this.f1137aK) * 100.0f), (int) (this.f1137aK * 100.0f), 3) / 100.0f;
                unit.f1587bB = (int) (unit.f1587bB + projectile.f988o);
            }
            projectile.f989p = 0.0f;
            projectile.f989p += this.f1138aL;
        } else if (projectile.f986m) {
            projectile.f1053aC = true;
            if (!this.f1168J) {
                float f4 = projectile.speed;
                if (this.f1188au != -1.0f) {
                    f4 = this.f1188au;
                }
                if (this.f1169K >= 0.0f) {
                    f4 = this.f1169K;
                }
                PointF m5900a = unit2.m5900a(projectile.f6951ek, projectile.f6952el, f4, projectile.lifeTimer, f3);
                projectile.f987n = m5900a.x;
                projectile.f988o = m5900a.y;
            } else {
                projectile.f987n = unit2.f6951ek;
                projectile.f988o = unit2.f6952el;
            }
            if (this.f1163t) {
                projectile.f989p = unit2.height;
            } else {
                projectile.f989p = 0.0f;
            }
            projectile.f989p += this.f1138aL;
            if (this.f1137aK != 0.0f) {
                projectile.f987n += CommonUtils.m2345a((AbstractC1120w) unit, (int) ((-this.f1137aK) * 100.0f), (int) (this.f1137aK * 100.0f), 2) / 100.0f;
                projectile.f988o += CommonUtils.m2345a((AbstractC1120w) unit, (int) ((-this.f1137aK) * 100.0f), (int) (this.f1137aK * 100.0f), 7) / 100.0f;
            }
        } else {
            projectile.target = unit2;
        }
    }
}

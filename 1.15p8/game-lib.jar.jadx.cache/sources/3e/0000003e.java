package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0183g;
import com.corrodinggames.rts.game.C0184h;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/be.class */
public class C0388be extends C0183g {

    /* renamed from: bh */
    public String f2355bh;

    /* renamed from: bi */
    public int f2356bi;

    /* renamed from: bj */
    public CustomUnitMetadata f2357bj;

    /* renamed from: a */
    public static void m3452a(C0388be c0388be, CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str) {
        Integer staticIntegerValue = unitConfig.getStaticIntegerValue(str, "directDamage", (Integer) null);
        Integer staticIntegerValue2 = unitConfig.getStaticIntegerValue(str, "areaDamage", (Integer) null);
        if (staticIntegerValue == null && staticIntegerValue2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        c0388be.f1139s = unitConfig.getStaticBooleanValue(str, "targetGround", Boolean.valueOf(c0388be.f1139s)).booleanValue();
        c0388be.f1140t = unitConfig.getStaticBooleanValue(str, "targetGround_includeTargetHeight", Boolean.valueOf(c0388be.f1140t)).booleanValue();
        Integer staticIntegerValue3 = unitConfig.getStaticIntegerValue(str, "areaRadius", (Integer) null);
        if (staticIntegerValue3 != null) {
            c0388be.f1129i = staticIntegerValue3.intValue();
        }
        c0388be.f1115b = unitConfig.getStaticIntegerValue(str, "directDamage", Integer.valueOf(c0388be.f1115b)).intValue();
        c0388be.f1120c = unitConfig.getStaticIntegerValue(str, "areaDamage", Integer.valueOf(c0388be.f1120c)).intValue();
        c0388be.f1121d = unitConfig.getStaticBooleanValue(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(c0388be.f1121d)).booleanValue();
        c0388be.f1124g = unitConfig.getStaticBooleanValue(str, "areaDamageNoFalloff", Boolean.valueOf(c0388be.f1124g)).booleanValue();
        c0388be.f1130j = unitConfig.getStaticFloatValue(str, "areaIgnoreUnitsCloserThan", Float.valueOf(c0388be.f1130j)).floatValue();
        c0388be.f1125h = unitConfig.getStaticBooleanValue(str, "areaRadiusFromEdge", Boolean.valueOf(c0388be.f1125h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(unitConfig.getStaticStringValue(str, "friendlyFire", (String) null))) {
            c0388be.f1132l = true;
        } else {
            Boolean staticBooleanValue = unitConfig.getStaticBooleanValue(str, "friendlyFire", (Boolean) null);
            if (staticBooleanValue != null) {
                c0388be.f1132l = false;
                c0388be.f1131k = staticBooleanValue.booleanValue();
            }
        }
        c0388be.f1133m = unitConfig.getStaticBooleanValue(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(c0388be.f1133m)).booleanValue();
        c0388be.f1134n = unitConfig.getStaticBooleanValue(str, "areaHitUnderwaterAlways", Boolean.valueOf(c0388be.f1134n)).booleanValue();
        c0388be.f1135o = unitConfig.getStaticFloatValue(str, "deflectionPower", Float.valueOf(c0388be.f1135o)).floatValue();
        c0388be.f1136p = unitConfig.getStaticBooleanValue(str, "nukeWeapon", Boolean.valueOf(c0388be.f1136p)).booleanValue();
        c0388be.f1137q = unitConfig.getStaticBooleanValue(str, "shouldRevealFog", Boolean.valueOf(c0388be.f1137q)).booleanValue();
        c0388be.f1138r = unitConfig.getStaticBooleanValue(str, "alwaysVisibleInFog", Boolean.valueOf(c0388be.f1138r)).booleanValue();
        c0388be.f1127v = unitConfig.m609h(str, "life").floatValue();
        c0388be.f1126u = unitConfig.m631b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        c0388be.f1141w = unitConfig.getStaticFloatValue(str, "speed", Float.valueOf(c0388be.f1141w)).floatValue();
        c0388be.f1142x = unitConfig.m641a(str, "frame", Short.valueOf(c0388be.f1142x)).shortValue();
        c0388be.f1128y = unitConfig.m641a(str, "drawType", Short.valueOf(c0388be.f1128y)).shortValue();
        c0388be.f1143z = unitConfig.m641a(str, "shadowFrame", Short.valueOf(c0388be.f1143z)).shortValue();
        BitmapOrTexture image = customUnitMetadata.getImage(unitConfig, str, "image");
        if (image != null) {
            c0388be.f1077B = image;
        }
        BitmapOrTexture image2 = customUnitMetadata.getImage(unitConfig, str, "shadowImage");
        if (image2 != null) {
            c0388be.f1078C = image2;
        }
        c0388be.f1106ad = unitConfig.getStaticFloatValue(str, "beamImageOffsetRate", Float.valueOf(c0388be.f1106ad)).floatValue();
        BitmapOrTexture image3 = customUnitMetadata.getImage(unitConfig, str, "beamImage");
        if (image3 != null) {
            c0388be.f1088Y = image3;
            c0388be.f1155X = true;
            if (image3.height < 20 && !GameEngine.m858at()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        BitmapOrTexture image4 = customUnitMetadata.getImage(unitConfig, str, "beamImageStart");
        if (image4 != null) {
            c0388be.f1089Z = image4;
            if (image3 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        c0388be.f1103aa = unitConfig.getStaticBooleanValue(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        BitmapOrTexture image5 = customUnitMetadata.getImage(unitConfig, str, "beamImageEnd");
        if (image5 != null) {
            c0388be.f1104ab = image5;
            if (image3 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        c0388be.f1105ac = unitConfig.getStaticBooleanValue(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        c0388be.f1076A = unitConfig.getStaticBooleanValue(str, "invisible", Boolean.valueOf(c0388be.f1076A)).booleanValue();
        c0388be.f1079D = unitConfig.getStaticFloatValue(str, "initialUnguidedSpeedHeight", Float.valueOf(c0388be.f1079D)).floatValue();
        c0388be.f1080E = unitConfig.getStaticFloatValue(str, "initialUnguidedSpeedX", Float.valueOf(c0388be.f1080E)).floatValue();
        c0388be.f1081F = unitConfig.getStaticFloatValue(str, "initialUnguidedSpeedY", Float.valueOf(c0388be.f1081F)).floatValue();
        c0388be.f1082G = unitConfig.getStaticFloatValue(str, "gravity", Float.valueOf(c0388be.f1082G)).floatValue();
        c0388be.f1083H = unitConfig.getStaticFloatValue(str, "trueGravity", Float.valueOf(c0388be.f1083H)).floatValue();
        c0388be.f1144I = unitConfig.getStaticBooleanValue(str, "instant", Boolean.valueOf(c0388be.f1144I)).booleanValue();
        c0388be.f1147L = unitConfig.getStaticBooleanValue(str, "instantReuseLast", Boolean.valueOf(c0388be.f1147L)).booleanValue();
        c0388be.f1148M = unitConfig.getStaticBooleanValue(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(c0388be.f1148M)).booleanValue();
        if (c0388be.f1148M) {
            if (!c0388be.f1147L) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            customUnitMetadata.f2949ep = true;
        }
        c0388be.f1149N = unitConfig.getStaticBooleanValue(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(c0388be.f1149N)).booleanValue();
        c0388be.f1087T = unitConfig.getStaticBooleanValue(str, "moveWithParent", Boolean.valueOf(c0388be.f1087T)).booleanValue();
        c0388be.f1145J = unitConfig.getStaticBooleanValue(str, "disableLeadTargeting", Boolean.valueOf(c0388be.f1145J)).booleanValue();
        c0388be.f1146K = unitConfig.getStaticFloatValue(str, "leadTargetingSpeedCalculation", Float.valueOf(c0388be.f1146K)).floatValue();
        c0388be.f1156ae = unitConfig.getStaticBooleanValue(str, "ballistic", Boolean.valueOf(c0388be.f1156ae)).booleanValue();
        String staticStringValue = unitConfig.getStaticStringValue(str, "trailEffect", (String) null);
        if (staticStringValue != null) {
            if (staticStringValue.equalsIgnoreCase("true")) {
                c0388be.f1157af = true;
            } else if (staticStringValue.equalsIgnoreCase("false")) {
                c0388be.f1157af = false;
            } else {
                c0388be.f1157af = false;
                c0388be.f1107ah = customUnitMetadata.m3114a(staticStringValue, (C0449y) null);
            }
        }
        String staticStringValue2 = unitConfig.getStaticStringValue(str, "effectOnCreate", (String) null);
        if (staticStringValue2 != null) {
            c0388be.f1108ai = customUnitMetadata.m3114a(staticStringValue2, (C0449y) null);
        }
        c0388be.f1158ag = unitConfig.getStaticFloatValue(str, "trailEffectRate", Float.valueOf(c0388be.f1158ag)).floatValue();
        if (c0388be.f1157af) {
            c0388be.f1160ao = -1118720;
        }
        c0388be.f1112am = unitConfig.getStaticFloatValue(str, "wobbleAmplitude", Float.valueOf(c0388be.f1112am)).floatValue();
        c0388be.f1159an = unitConfig.m631b(str, "wobbleFrequency", Float.valueOf(c0388be.f1159an)).floatValue();
        if (c0388be.f1159an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        c0388be.f1110ak = C0389bf.m3446a(customUnitMetadata, unitConfig, str, "spawnProjectilesOnEndOfLife", (C0389bf) null);
        c0388be.f1109aj = C0389bf.m3446a(customUnitMetadata, unitConfig, str, "spawnProjectilesOnExplode", (C0389bf) null);
        c0388be.f1111al = C0389bf.m3446a(customUnitMetadata, unitConfig, str, "spawnProjectilesOnCreate", (C0389bf) null);
        c0388be.f1160ao = unitConfig.m642a(str, "lightColor", Integer.valueOf(c0388be.f1160ao)).intValue();
        c0388be.f1161ap = unitConfig.getStaticFloatValue(str, "lightSize", Float.valueOf(c0388be.f1161ap)).floatValue();
        c0388be.f1113aq = unitConfig.getStaticBooleanValue(str, "lightCastOnGround", Boolean.valueOf(c0388be.f1113aq)).booleanValue();
        c0388be.f1162ar = unitConfig.getStaticBooleanValue(str, "largeHitEffect", Boolean.valueOf(c0388be.f1162ar)).booleanValue();
        c0388be.f1150O = unitConfig.getStaticFloatValue(str, "turnSpeed", Float.valueOf(c0388be.f1150O)).floatValue();
        c0388be.f1151P = unitConfig.getStaticFloatValue(str, "turnSpeedWhenNear", Float.valueOf(c0388be.f1151P)).floatValue();
        c0388be.f1084Q = unitConfig.getStaticFloatValue(str, "sweepSpeed", Float.valueOf(c0388be.f1084Q)).floatValue();
        c0388be.f1085R = unitConfig.getStaticFloatValue(str, "sweepOffset", Float.valueOf(c0388be.f1085R)).floatValue();
        c0388be.f1086S = unitConfig.getStaticFloatValue(str, "sweepOffsetFromTargetRadius", Float.valueOf(c0388be.f1086S)).floatValue();
        c0388be.f1152U = unitConfig.getStaticBooleanValue(str, "drawUnderUnits", Boolean.valueOf(c0388be.f1152U)).booleanValue();
        c0388be.f1153V = unitConfig.getStaticBooleanValue(str, "lightingEffect", Boolean.valueOf(c0388be.f1153V)).booleanValue();
        c0388be.f1154W = unitConfig.getStaticBooleanValue(str, "laserEffect", Boolean.valueOf(c0388be.f1154W)).booleanValue();
        if (c0388be.f1154W && c0388be.f1088Y == null) {
            c0388be.f1173aE = Color.argb(80, 255, 0, 0);
        }
        if (c0388be.f1153V && c0388be.f1139s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (c0388be.f1154W && c0388be.f1139s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        c0388be.f1163as = unitConfig.getStaticFloatValue(str, "ballistic_delaymove_height", Float.valueOf(c0388be.f1163as)).floatValue();
        c0388be.f1164at = unitConfig.getStaticFloatValue(str, "ballistic_height", Float.valueOf(c0388be.f1164at)).floatValue();
        c0388be.f1165au = unitConfig.getStaticFloatValue(str, "targetSpeed", Float.valueOf(c0388be.f1165au)).floatValue();
        c0388be.f1166av = unitConfig.getStaticFloatValue(str, "targetSpeedAcceleration", Float.valueOf(c0388be.f1166av)).floatValue();
        c0388be.f1167aw = unitConfig.getStaticBooleanValue(str, "autoTargetingOnDeadTarget", Boolean.valueOf(c0388be.f1167aw)).booleanValue();
        c0388be.f1168ax = unitConfig.getStaticFloatValue(str, "autoTargetingOnDeadTargetRange", Float.valueOf(c0388be.f1168ax)).floatValue();
        c0388be.f1169ay = unitConfig.getStaticFloatValue(str, "autoTargetingOnDeadTargetLead", Float.valueOf(c0388be.f1169ay)).floatValue();
        c0388be.f1114az = unitConfig.getStaticBooleanValue(str, "retargetingInFlight", Boolean.valueOf(c0388be.f1114az)).booleanValue();
        c0388be.f1170aA = unitConfig.getStaticFloatValue(str, "retargetingInFlightSearchDelay", Float.valueOf(c0388be.f1170aA)).floatValue();
        c0388be.f1171aB = unitConfig.getStaticFloatValue(str, "retargetingInFlightSearchRange", Float.valueOf(c0388be.f1171aB)).floatValue();
        c0388be.f1172aC = unitConfig.getStaticFloatValue(str, "retargetingInFlightSearchLead", Float.valueOf(c0388be.f1172aC)).floatValue();
        c0388be.f1090aD = unitConfig.m666a(customUnitMetadata, str, "retargetingInFlightSearchOnlyTags", (ValueList) null);
        if (c0388be.f1168ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (c0388be.f1171aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        c0388be.f1173aE = unitConfig.m642a(str, "color", Integer.valueOf(c0388be.f1173aE)).intValue();
        c0388be.f1175aG = unitConfig.getStaticFloatValue(str, "teamColorRatio", Float.valueOf(c0388be.f1175aG)).floatValue();
        if (c0388be.f1175aG < 0.0f || c0388be.f1175aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + c0388be.f1175aG);
        }
        c0388be.f1176aH = unitConfig.getStaticFloatValue(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - c0388be.f1175aG)).floatValue();
        if (c0388be.f1176aH < 0.0f || c0388be.f1176aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + c0388be.f1176aH);
        }
        if (c0388be.f1175aG == 0.0f && c0388be.f1176aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        c0388be.f1174aF = unitConfig.getStaticFloatValue(str, "drawSize", Float.valueOf(c0388be.f1174aF)).floatValue();
        c0388be.f1091aI = unitConfig.getStaticBooleanValue(str, "flameWeapon", Boolean.valueOf(c0388be.f1091aI)).booleanValue();
        c0388be.f1177aJ = unitConfig.getStaticBooleanValue(str, "hitSound", Boolean.valueOf(c0388be.f1177aJ)).booleanValue();
        c0388be.f1093aL = unitConfig.getStaticFloatValue(str, "targetGroundHeightOffset", Float.valueOf(c0388be.f1093aL)).floatValue();
        c0388be.f1092aK = unitConfig.getStaticFloatValue(str, "targetGroundSpread", Float.valueOf(c0388be.f1092aK)).floatValue();
        c0388be.f1094aM = unitConfig.getStaticFloatValue(str, "speedSpread", Float.valueOf(c0388be.f1094aM)).floatValue();
        c0388be.f1096aO = unitConfig.getStaticBooleanValue(str, "explodeOnEndOfLife", Boolean.valueOf(c0388be.f1096aO)).booleanValue();
        c0388be.f1095aN = unitConfig.getStaticBooleanValue(str, "ignoreParentShootDamageMultiplier", Boolean.valueOf(c0388be.f1095aN)).booleanValue();
        c0388be.f1097aP = unitConfig.getStaticFloatValue(str, "pushForce", Float.valueOf(c0388be.f1097aP)).floatValue();
        c0388be.f1098aQ = unitConfig.getStaticFloatValue(str, "pushVelocity", Float.valueOf(c0388be.f1098aQ)).floatValue();
        c0388be.f1178aR = unitConfig.getStaticFloatValue(str, "buildingDamageMultiplier", Float.valueOf(c0388be.f1178aR)).floatValue();
        c0388be.f1179aS = unitConfig.getStaticFloatValue(str, "shieldDamageMultiplier", Float.valueOf(c0388be.f1179aS)).floatValue();
        c0388be.f1180aT = unitConfig.getStaticFloatValue(str, "shieldDefectionMultiplier", Float.valueOf(c0388be.f1180aT)).floatValue();
        c0388be.f1181aU = unitConfig.getStaticFloatValue(str, "hullDamageMultiplier", Float.valueOf(c0388be.f1181aU)).floatValue();
        c0388be.f1099aV = unitConfig.getStaticFloatValue(str, "armourIgnoreAmount", Float.valueOf(c0388be.f1099aV)).floatValue();
        c0388be.f1182aW = unitConfig.getStaticFloatValue(str, "areaExpandTime", Float.valueOf(c0388be.f1182aW)).floatValue();
        String staticStringValue3 = unitConfig.getStaticStringValue(str, "explodeEffect", (String) null);
        if (staticStringValue3 != null) {
            c0388be.f1100aX = customUnitMetadata.m3114a(staticStringValue3, (C0449y) null);
        }
        String staticStringValue4 = unitConfig.getStaticStringValue(str, "explodeEffectOnShield", (String) null);
        if (staticStringValue4 != null) {
            c0388be.f1101aY = customUnitMetadata.m3114a(staticStringValue4, (C0449y) null);
        }
        C0396bm m3431a = C0396bm.m3431a(customUnitMetadata, unitConfig, str, "spawnUnit");
        if (m3431a != null && !m3431a.m3426b()) {
            c0388be.f1102aZ = m3431a;
        }
        c0388be.f1116ba = unitConfig.getStaticIntegerValue(str, "unloadUpToXUnitsFromSource", Integer.valueOf(c0388be.f1116ba)).intValue();
        c0388be.f1117bb = unitConfig.getStaticBooleanValue(str, "teleportSource", Boolean.valueOf(c0388be.f1117bb)).booleanValue();
        c0388be.f1118bc = unitConfig.getStaticBooleanValue(str, "convertHitToSourceTeam", Boolean.valueOf(c0388be.f1118bc)).booleanValue();
        c0388be.f1119bd = ValueListSource.splitToValueListDefaultNull(unitConfig.getStaticStringValue(str, "tags", (String) null));
        ObjectVector propertiesStartingWith = unitConfig.getPropertiesStartingWith(str, "mutator");
        ObjectVector objectVector = new ObjectVector();
        Iterator it = propertiesStartingWith.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split("_");
            if (split.length > 1) {
                String str2 = split[0];
                String str3 = str2 + "_";
                if (!objectVector.contains(str3) && str2.length() > "mutator".length()) {
                    objectVector.add(str3);
                }
            }
        }
        Iterator it2 = objectVector.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C0184h c0184h = new C0184h();
            c0184h.f1186a = ValueListSource.splitToValueListDefaultNull(unitConfig.getStaticStringValue(str, str4 + "ifUnitWithTags", (String) null));
            c0184h.f1187b = ValueListSource.splitToValueListDefaultNull(unitConfig.getStaticStringValue(str, str4 + "ifUnitWithoutTags", (String) null));
            if (c0184h.f1186a == null && c0184h.f1187b == null) {
                throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
            }
            c0184h.f1188c = unitConfig.getStaticFloatValue(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            c0184h.f1189d = unitConfig.getStaticFloatValue(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            C0407b m3395a = C0407b.m3395a(customUnitMetadata, unitConfig, str, str4 + "addResourcesDirectHit", true);
            if (m3395a != null && m3395a.m3379c()) {
                c0184h.f1190e = m3395a;
                if (c0388be.f1139s) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            C0407b m3395a2 = C0407b.m3395a(customUnitMetadata, unitConfig, str, str4 + "addResourcesAreaHit", true);
            if (m3395a2 != null && m3395a2.m3379c()) {
                c0184h.f1191f = m3395a2;
                if (staticIntegerValue3 == null) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            String staticStringValue5 = unitConfig.getStaticStringValue(str, str4 + "changedExplodeEffect", (String) null);
            if (staticStringValue5 != null) {
                c0184h.f1192g = customUnitMetadata.m3114a(staticStringValue5, (C0449y) null);
                if (c0184h.f1192g != null && !c0184h.f1192g.m3044a()) {
                    c0184h.f1192g = null;
                }
            }
            boolean z = false;
            boolean z2 = false;
            if (!CommonUtils.m1626j(c0184h.f1188c, 1.0f)) {
                z = true;
            }
            if (!CommonUtils.m1626j(c0184h.f1189d, 1.0f) && c0388be.f1120c != 0 && c0388be.f1129i > 0) {
                z2 = true;
            }
            if (c0184h.f1190e != null) {
                z = true;
            }
            if (c0184h.f1191f != null) {
                z2 = true;
            }
            if (z) {
                if (c0388be.f1183be == null) {
                    c0388be.f1183be = new ObjectVector();
                }
                c0388be.f1183be.add(c0184h);
            }
            if (z2) {
                if (c0388be.f1184bf == null) {
                    c0388be.f1184bf = new ObjectVector();
                }
                c0388be.f1122e = true;
                c0388be.f1184bf.add(c0184h);
            }
            if (c0184h.f1192g != null) {
                if (c0388be.f1185bg == null) {
                    c0388be.f1185bg = new ObjectVector();
                }
                c0388be.f1185bg.add(c0184h);
            }
        }
        if (c0388be.f1120c != 0 && c0388be.f1129i > 0) {
            c0388be.f1122e = true;
        }
        if ((c0388be.f1097aP != 0.0f || c0388be.f1098aQ != 0.0f) && c0388be.f1129i > 0) {
            c0388be.f1122e = true;
        }
        c0388be.f1123f = !c0388be.f1122e;
        customUnitMetadata.f3089fI.add(c0388be);
    }

    /* renamed from: a */
    public static void m3451a(C0388be c0388be, OutputNetStream outputNetStream) {
        outputNetStream.mo1311a(c0388be.f2357bj);
        outputNetStream.writeString(c0388be.f2355bh);
    }

    /* renamed from: b */
    public static C0183g m3450b(InputNetStream inputNetStream) {
        UnitType readUnitType = inputNetStream.readUnitType();
        String readString = inputNetStream.readString();
        if (readUnitType == null) {
            return null;
        }
        if (!(readUnitType instanceof CustomUnitMetadata)) {
            GameEngine.log("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + readUnitType.mo3087i() + " loading real_meta");
            return null;
        }
        C0388be m3096d = ((CustomUnitMetadata) readUnitType).m3096d(readString);
        if (m3096d == null) {
            GameEngine.log("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + readString);
            return null;
        }
        return m3096d;
    }

    /* renamed from: a */
    public void m3453a(Unit unit, Projectile projectile, Unit unit2, float f, float f2, float f3) {
        if (unit2 == null) {
            projectile.f977aC = true;
            projectile.f1016n = f;
            projectile.f1017o = f2;
            if (this.f1092aK != 0.0f) {
                projectile.f1016n += CommonUtils.m1722a((GameObject) unit, (int) ((-this.f1092aK) * 100.0f), (int) (this.f1092aK * 100.0f), 2) / 100.0f;
                unit.f1530bu = (int) (unit.f1530bu + projectile.f1016n);
                projectile.f1017o += CommonUtils.m1722a((GameObject) unit, (int) ((-this.f1092aK) * 100.0f), (int) (this.f1092aK * 100.0f), 3) / 100.0f;
                unit.f1530bu = (int) (unit.f1530bu + projectile.f1017o);
            }
            projectile.f1018p = 0.0f;
            projectile.f1018p += this.f1093aL;
        } else if (projectile.f1015m) {
            projectile.f977aC = true;
            if (!this.f1145J) {
                float f4 = projectile.speed;
                if (this.f1165au != -1.0f) {
                    f4 = this.f1165au;
                }
                if (this.f1146K >= 0.0f) {
                    f4 = this.f1146K;
                }
                PointF m3784a = unit2.m3784a(projectile.x, projectile.y, f4, projectile.lifeTimer, f3);
                projectile.f1016n = m3784a.x;
                projectile.f1017o = m3784a.y;
            } else {
                projectile.f1016n = unit2.x;
                projectile.f1017o = unit2.y;
            }
            if (this.f1140t) {
                projectile.f1018p = unit2.height;
            } else {
                projectile.f1018p = 0.0f;
            }
            projectile.f1018p += this.f1093aL;
            if (this.f1092aK != 0.0f) {
                projectile.f1016n += CommonUtils.m1722a((GameObject) unit, (int) ((-this.f1092aK) * 100.0f), (int) (this.f1092aK * 100.0f), 2) / 100.0f;
                projectile.f1017o += CommonUtils.m1722a((GameObject) unit, (int) ((-this.f1092aK) * 100.0f), (int) (this.f1092aK * 100.0f), 7) / 100.0f;
            }
        } else {
            projectile.target = unit2;
        }
    }
}
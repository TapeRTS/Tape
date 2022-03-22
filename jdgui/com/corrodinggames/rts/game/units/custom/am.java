/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.g;
/*     */ import com.corrodinggames.rts.game.h;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class am
/*     */   extends g
/*     */ {
/*     */   public String bf;
/*     */   public int bg;
/*     */   public l bh;
/*     */   
/*     */   public static void a(am paramam, l paraml, ab paramab, String paramString) {
/*  38 */     String str1 = paramString;
/*     */ 
/*     */     
/*  41 */     Integer integer1 = paramab.b(str1, "directDamage", null);
/*  42 */     Integer integer2 = paramab.b(str1, "areaDamage", null);
/*     */ 
/*     */     
/*  45 */     if (integer1 == null && integer2 == null)
/*     */     {
/*  47 */       throw new RuntimeException("[" + str1 + "]: directDamage or areaDamage must be set");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     paramam.s = paramab.a(str1, "targetGround", Boolean.valueOf(paramam.s)).booleanValue();
/*     */ 
/*     */     
/*  59 */     paramam.t = paramab.a(str1, "targetGround_includeTargetHeight", Boolean.valueOf(paramam.t)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/*  63 */     Integer integer3 = paramab.b(str1, "areaRadius", null);
/*  64 */     if (integer3 != null)
/*     */     {
/*  66 */       paramam.i = integer3.intValue();
/*     */     }
/*     */ 
/*     */     
/*  70 */     paramam.b = paramab.b(str1, "directDamage", Integer.valueOf(paramam.b)).intValue();
/*     */     
/*  72 */     paramam.c = paramab.b(str1, "areaDamage", Integer.valueOf(paramam.c)).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     paramam.d = paramab.a(str1, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(paramam.d)).booleanValue();
/*     */ 
/*     */     
/* 108 */     paramam.g = paramab.a(str1, "areaDamageNoFalloff", Boolean.valueOf(paramam.g)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 112 */     paramam.j = paramab.a(str1, "areaIgnoreUnitsCloserThan", Float.valueOf(paramam.j)).floatValue();
/*     */     
/* 114 */     paramam.h = paramab.a(str1, "areaRadiusFromEdge", Boolean.valueOf(paramam.h)).booleanValue();
/*     */     
/* 116 */     if ("only-ignoreEnemy".equalsIgnoreCase(paramab.b(str1, "friendlyFire", null))) {
/*     */       
/* 118 */       paramam.l = true;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 123 */       Boolean bool = paramab.a(str1, "friendlyFire", null);
/* 124 */       if (bool != null) {
/*     */         
/* 126 */         paramam.l = false;
/* 127 */         paramam.k = bool.booleanValue();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 133 */     paramam.m = paramab.a(str1, "areaHitAirAndLandAtSameTime", Boolean.valueOf(paramam.m)).booleanValue();
/*     */ 
/*     */     
/* 136 */     paramam.n = paramab.a(str1, "areaHitUnderwaterAlways", Boolean.valueOf(paramam.n)).booleanValue();
/*     */ 
/*     */     
/* 139 */     paramam.o = paramab.a(str1, "deflectionPower", Float.valueOf(paramam.o)).floatValue();
/*     */ 
/*     */     
/* 142 */     paramam.p = paramab.a(str1, "nukeWeapon", Boolean.valueOf(paramam.p)).booleanValue();
/*     */ 
/*     */     
/* 145 */     paramam.q = paramab.a(str1, "shouldRevealFog", Boolean.valueOf(paramam.q)).booleanValue();
/*     */ 
/*     */     
/* 148 */     paramam.r = paramab.a(str1, "alwaysVisibleInFog", Boolean.valueOf(paramam.r)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     paramam.v = paramab.g(str1, "life").floatValue();
/*     */ 
/*     */     
/* 158 */     paramam.u = paramab.b(str1, "delayedStartTimer", Float.valueOf(0.0F)).floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     paramam.w = paramab.a(str1, "speed", Float.valueOf(paramam.w)).floatValue();
/* 165 */     paramam.x = paramab.a(str1, "frame", Short.valueOf(paramam.x)).shortValue();
/*     */ 
/*     */ 
/*     */     
/* 169 */     paramam.y = paramab.a(str1, "drawType", Short.valueOf(paramam.y)).shortValue();
/*     */ 
/*     */ 
/*     */     
/* 173 */     paramam.z = paramab.a(str1, "shadowFrame", Short.valueOf(paramam.z)).shortValue();
/*     */ 
/*     */     
/* 176 */     e e1 = paraml.a(paramab, str1, "image");
/*     */     
/* 178 */     if (e1 != null)
/*     */     {
/* 180 */       paramam.B = e1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     e e2 = paraml.a(paramab, str1, "shadowImage");
/*     */     
/* 188 */     if (e2 != null)
/*     */     {
/* 190 */       paramam.C = e2;
/*     */     }
/*     */ 
/*     */     
/* 194 */     paramam.ac = paramab.a(str1, "beamImageOffsetRate", Float.valueOf(paramam.ac)).floatValue();
/*     */     
/* 196 */     e e3 = paraml.a(paramab, str1, "beamImage");
/* 197 */     if (e3 != null) {
/*     */       
/* 199 */       paramam.X = e3;
/* 200 */       paramam.W = true;
/*     */       
/* 202 */       if (e3.l < 20 && !l.an())
/*     */       {
/* 204 */         throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 209 */     e e4 = paraml.a(paramab, str1, "beamImageStart");
/* 210 */     if (e4 != null) {
/*     */       
/* 212 */       paramam.Y = e4;
/* 213 */       if (e3 == null)
/*     */       {
/* 215 */         throw new RuntimeException("beamImageStart requires beamImage to be set");
/*     */       }
/*     */     } 
/* 218 */     paramam.Z = paramab.a(str1, "beamImageStartRotated", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 222 */     e e5 = paraml.a(paramab, str1, "beamImageEnd");
/* 223 */     if (e5 != null) {
/*     */       
/* 225 */       paramam.aa = e5;
/* 226 */       if (e3 == null)
/*     */       {
/* 228 */         throw new RuntimeException("beamImageEnd requires beamImage to be set");
/*     */       }
/*     */     } 
/* 231 */     paramam.ab = paramab.a(str1, "beamImageEndRotated", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 235 */     paramam.A = paramab.a(str1, "invisible", Boolean.valueOf(paramam.A)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     paramam.D = paramab.a(str1, "initialUnguidedSpeedHeight", Float.valueOf(paramam.D)).floatValue();
/* 242 */     paramam.E = paramab.a(str1, "initialUnguidedSpeedX", Float.valueOf(paramam.E)).floatValue();
/* 243 */     paramam.F = paramab.a(str1, "initialUnguidedSpeedY", Float.valueOf(paramam.F)).floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 248 */     paramam.G = paramab.a(str1, "gravity", Float.valueOf(paramam.G)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 252 */     paramam.H = paramab.a(str1, "instant", Boolean.valueOf(paramam.H)).booleanValue();
/*     */     
/* 254 */     paramam.K = paramab.a(str1, "instantReuseLast", Boolean.valueOf(paramam.K)).booleanValue();
/*     */     
/* 256 */     paramam.L = paramab.a(str1, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(paramam.L)).booleanValue();
/*     */     
/* 258 */     if (paramam.L) {
/*     */       
/* 260 */       if (!paramam.K)
/*     */       {
/* 262 */         throw new RuntimeException("[" + str1 + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
/*     */       }
/*     */       
/* 265 */       paraml.ep = true;
/*     */     } 
/*     */     
/* 268 */     paramam.M = paramab.a(str1, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(paramam.M)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 272 */     paramam.S = paramab.a(str1, "moveWithParent", Boolean.valueOf(paramam.S)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 276 */     paramam.I = paramab.a(str1, "disableLeadTargeting", Boolean.valueOf(paramam.I)).booleanValue();
/*     */     
/* 278 */     paramam.J = paramab.a(str1, "leadTargetingSpeedCalculation", Float.valueOf(paramam.J)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 282 */     paramam.ad = paramab.a(str1, "ballistic", Boolean.valueOf(paramam.ad)).booleanValue();
/*     */ 
/*     */ 
/*     */     
/* 286 */     String str2 = paramab.b(str1, "trailEffect", null);
/* 287 */     if (str2 != null)
/*     */     {
/*     */       
/* 290 */       if (str2.equalsIgnoreCase("true")) {
/*     */         
/* 292 */         paramam.ae = true;
/*     */       }
/* 294 */       else if (str2.equalsIgnoreCase("false")) {
/*     */         
/* 296 */         paramam.ae = false;
/*     */       }
/*     */       else {
/*     */         
/* 300 */         paramam.ae = false;
/* 301 */         paramam.ag = paraml.a(str2, (x)null);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 307 */     String str3 = paramab.b(str1, "effectOnCreate", null);
/* 308 */     if (str3 != null)
/*     */     {
/* 310 */       paramam.ah = paraml.a(str3, (x)null);
/*     */     }
/*     */ 
/*     */     
/* 314 */     paramam.af = paramab.a(str1, "trailEffectRate", Float.valueOf(paramam.af)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 318 */     if (paramam.ae)
/*     */     {
/* 320 */       paramam.an = -1118720;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 325 */     paramam.al = paramab.a(str1, "wobbleAmplitude", Float.valueOf(paramam.al)).floatValue();
/* 326 */     paramam.am = paramab.b(str1, "wobbleFrequency", Float.valueOf(paramam.am)).floatValue();
/*     */     
/* 328 */     if (paramam.am <= 0.0F)
/*     */     {
/* 330 */       throw new RuntimeException("wobbleFrequency must be greater than 0");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 335 */     paramam.aj = an.a(paraml, paramab, str1, "spawnProjectilesOnEndOfLife", (an)null);
/*     */     
/* 337 */     paramam.ai = an.a(paraml, paramab, str1, "spawnProjectilesOnExplode", (an)null);
/*     */     
/* 339 */     paramam.ak = an.a(paraml, paramab, str1, "spawnProjectilesOnCreate", (an)null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 345 */     paramam.an = paramab.a(str1, "lightColor", Integer.valueOf(paramam.an)).intValue();
/*     */ 
/*     */     
/* 348 */     paramam.ao = paramab.a(str1, "lightSize", Float.valueOf(paramam.ao)).floatValue();
/*     */ 
/*     */     
/* 351 */     paramam.ap = paramab.a(str1, "lightCastOnGround", Boolean.valueOf(paramam.ap)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 356 */     paramam.aq = paramab.a(str1, "largeHitEffect", Boolean.valueOf(paramam.aq)).booleanValue();
/*     */ 
/*     */     
/* 359 */     paramam.N = paramab.a(str1, "turnSpeed", Float.valueOf(paramam.N)).floatValue();
/*     */ 
/*     */     
/* 362 */     paramam.O = paramab.a(str1, "turnSpeedWhenNear", Float.valueOf(paramam.O)).floatValue();
/*     */ 
/*     */     
/* 365 */     paramam.P = paramab.a(str1, "sweepSpeed", Float.valueOf(paramam.P)).floatValue();
/* 366 */     paramam.Q = paramab.a(str1, "sweepOffset", Float.valueOf(paramam.Q)).floatValue();
/* 367 */     paramam.R = paramab.a(str1, "sweepOffsetFromTargetRadius", Float.valueOf(paramam.R)).floatValue();
/*     */ 
/*     */     
/* 370 */     paramam.T = paramab.a(str1, "drawUnderUnits", Boolean.valueOf(paramam.T)).booleanValue();
/*     */     
/* 372 */     paramam.U = paramab.a(str1, "lightingEffect", Boolean.valueOf(paramam.U)).booleanValue();
/* 373 */     paramam.V = paramab.a(str1, "laserEffect", Boolean.valueOf(paramam.V)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 378 */     if (paramam.V && paramam.X == null)
/*     */     {
/* 380 */       paramam.aD = Color.a(80, 255, 0, 0);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 385 */     if (paramam.U && paramam.s)
/*     */     {
/* 387 */       throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
/*     */     }
/*     */     
/* 390 */     if (paramam.V && paramam.s)
/*     */     {
/* 392 */       throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
/*     */     }
/*     */ 
/*     */     
/* 396 */     paramam.ar = paramab.a(str1, "ballistic_delaymove_height", Float.valueOf(paramam.ar)).floatValue();
/* 397 */     paramam.as = paramab.a(str1, "ballistic_height", Float.valueOf(paramam.as)).floatValue();
/* 398 */     paramam.at = paramab.a(str1, "targetSpeed", Float.valueOf(paramam.at)).floatValue();
/* 399 */     paramam.au = paramab.a(str1, "targetSpeedAcceleration", Float.valueOf(paramam.au)).floatValue();
/*     */     
/* 401 */     paramam.av = paramab.a(str1, "autoTargetingOnDeadTarget", Boolean.valueOf(paramam.av)).booleanValue();
/*     */     
/* 403 */     paramam.aw = paramab.a(str1, "autoTargetingOnDeadTargetRange", Float.valueOf(paramam.aw)).floatValue();
/* 404 */     paramam.ax = paramab.a(str1, "autoTargetingOnDeadTargetLead", Float.valueOf(paramam.ax)).floatValue();
/*     */ 
/*     */     
/* 407 */     paramam.ay = paramab.a(str1, "retargetingInFlight", Boolean.valueOf(paramam.ay)).booleanValue();
/* 408 */     paramam.az = paramab.a(str1, "retargetingInFlightSearchDelay", Float.valueOf(paramam.az)).floatValue();
/* 409 */     paramam.aA = paramab.a(str1, "retargetingInFlightSearchRange", Float.valueOf(paramam.aA)).floatValue();
/* 410 */     paramam.aB = paramab.a(str1, "retargetingInFlightSearchLead", Float.valueOf(paramam.aB)).floatValue();
/* 411 */     paramam.aC = paramab.a(paraml, str1, "retargetingInFlightSearchOnlyTags", null);
/*     */ 
/*     */     
/* 414 */     if (paramam.aw > 1500.0F)
/*     */     {
/* 416 */       throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
/*     */     }
/*     */     
/* 419 */     if (paramam.aA > 1500.0F)
/*     */     {
/* 421 */       throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
/*     */     }
/*     */ 
/*     */     
/* 425 */     paramam.aD = paramab.a(str1, "color", Integer.valueOf(paramam.aD)).intValue();
/*     */ 
/*     */     
/* 428 */     paramam.aF = paramab.a(str1, "teamColorRatio", Float.valueOf(paramam.aF)).floatValue();
/* 429 */     if (paramam.aF < 0.0F || paramam.aF > 1.0F)
/*     */     {
/* 431 */       throw new RuntimeException("teamColorRatio should be between 0-1 got:" + paramam.aF);
/*     */     }
/*     */     
/* 434 */     paramam.aG = paramab.a(str1, "teamColorRatio_sourceRatio", Float.valueOf(1.0F - paramam.aF)).floatValue();
/*     */     
/* 436 */     if (paramam.aG < 0.0F || paramam.aG > 1.0F)
/*     */     {
/* 438 */       throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + paramam.aG);
/*     */     }
/* 440 */     if (paramam.aF == 0.0F && paramam.aG != 1.0F)
/*     */     {
/* 442 */       throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
/*     */     }
/*     */ 
/*     */     
/* 446 */     paramam.aE = paramab.a(str1, "drawSize", Float.valueOf(paramam.aE)).floatValue();
/*     */ 
/*     */     
/* 449 */     paramam.aH = paramab.a(str1, "flameWeapon", Boolean.valueOf(paramam.aH)).booleanValue();
/* 450 */     paramam.aI = paramab.a(str1, "hitSound", Boolean.valueOf(paramam.aI)).booleanValue();
/*     */ 
/*     */     
/* 453 */     paramam.aK = paramab.a(str1, "targetGroundHeightOffset", Float.valueOf(paramam.aK)).floatValue();
/*     */     
/* 455 */     paramam.aJ = paramab.a(str1, "targetGroundSpread", Float.valueOf(paramam.aJ)).floatValue();
/* 456 */     paramam.aL = paramab.a(str1, "speedSpread", Float.valueOf(paramam.aL)).floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 461 */     paramam.aM = paramab.a(str1, "explodeOnEndOfLife", Boolean.valueOf(paramam.aM)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     paramam.aN = paramab.a(str1, "pushForce", Float.valueOf(paramam.aN)).floatValue();
/*     */     
/* 473 */     paramam.aO = paramab.a(str1, "pushVelocity", Float.valueOf(paramam.aO)).floatValue();
/*     */     
/* 475 */     paramam.aP = paramab.a(str1, "buildingDamageMultiplier", Float.valueOf(paramam.aP)).floatValue();
/*     */     
/* 477 */     paramam.aQ = paramab.a(str1, "shieldDamageMultiplier", Float.valueOf(paramam.aQ)).floatValue();
/* 478 */     paramam.aR = paramab.a(str1, "shieldDefectionMultiplier", Float.valueOf(paramam.aR)).floatValue();
/*     */     
/* 480 */     paramam.aS = paramab.a(str1, "hullDamageMultiplier", Float.valueOf(paramam.aS)).floatValue();
/*     */ 
/*     */     
/* 483 */     paramam.aT = paramab.a(str1, "armourIgnoreAmount", Float.valueOf(paramam.aT)).floatValue();
/*     */     
/* 485 */     paramam.aU = paramab.a(str1, "areaExpandTime", Float.valueOf(paramam.aU)).floatValue();
/*     */     
/* 487 */     String str4 = paramab.b(str1, "explodeEffect", null);
/* 488 */     if (str4 != null)
/*     */     {
/* 490 */       paramam.aV = paraml.a(str4, (x)null);
/*     */     }
/*     */ 
/*     */     
/* 494 */     String str5 = paramab.b(str1, "explodeEffectOnShield", null);
/* 495 */     if (str5 != null)
/*     */     {
/* 497 */       paramam.aW = paraml.a(str5, (x)null);
/*     */     }
/*     */ 
/*     */     
/* 501 */     au au = au.a(paraml, paramab, str1, "spawnUnit");
/*     */ 
/*     */     
/* 504 */     if (au != null && !au.b())
/*     */     {
/* 506 */       paramam.aX = au;
/*     */     }
/*     */     
/* 509 */     paramam.aY = paramab.b(str1, "unloadUpToXUnitsFromSource", Integer.valueOf(paramam.aY)).intValue();
/*     */     
/* 511 */     paramam.aZ = paramab.a(str1, "teleportSource", Boolean.valueOf(paramam.aZ)).booleanValue();
/*     */     
/* 513 */     paramam.ba = paramab.a(str1, "convertHitToSourceTeam", Boolean.valueOf(paramam.ba)).booleanValue();
/*     */ 
/*     */     
/* 516 */     paramam.bb = h.a(paramab.b(str1, "tags", null));
/*     */ 
/*     */     
/* 519 */     m m1 = paramab.j(paramString, "mutator");
/* 520 */     m m2 = new m();
/*     */     
/* 522 */     for (String str : m1) {
/*     */       
/* 524 */       String[] arrayOfString = str.split("_");
/* 525 */       if (arrayOfString.length > 1) {
/*     */         
/* 527 */         String str6 = arrayOfString[0];
/* 528 */         String str7 = str6 + "_";
/*     */         
/* 530 */         if (!m2.contains(str7) && str6.length() > "mutator".length())
/*     */         {
/* 532 */           m2.add(str7);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 537 */     for (String str6 : m2) {
/*     */       
/* 539 */       h h = new h();
/*     */       
/* 541 */       h.a = h.a(paramab.b(str1, str6 + "ifUnitWithTags", null));
/* 542 */       h.b = h.a(paramab.b(str1, str6 + "ifUnitWithoutTags", null));
/*     */       
/* 544 */       if (h.a == null && h.b == null)
/*     */       {
/* 546 */         throw new RuntimeException("[" + str1 + "]" + str6 + " requires: unitWithTags and/or unitWithoutTags");
/*     */       }
/*     */       
/* 549 */       h.c = paramab.a(str1, str6 + "directDamageMultiplier", Float.valueOf(1.0F)).floatValue();
/* 550 */       h.d = paramab.a(str1, str6 + "areaDamageMultiplier", Float.valueOf(1.0F)).floatValue();
/*     */       
/* 552 */       g g1 = g.a(paraml, paramab, paramString, str6 + "addResourcesDirectHit", true);
/* 553 */       if (g1 != null && g1.c()) {
/*     */         
/* 555 */         h.e = g1;
/*     */         
/* 557 */         if (paramam.s)
/*     */         {
/* 559 */           throw new RuntimeException("[" + str1 + "]" + str6 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
/*     */         }
/*     */       } 
/*     */       
/* 563 */       g g2 = g.a(paraml, paramab, paramString, str6 + "addResourcesAreaHit", true);
/* 564 */       if (g2 != null && g2.c()) {
/*     */         
/* 566 */         h.f = g2;
/*     */         
/* 568 */         if (integer3 == null)
/*     */         {
/* 570 */           throw new RuntimeException("[" + str1 + "]" + str6 + "addResourcesAreaHit requires areaRadius to be set");
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 575 */       String str7 = paramab.b(str1, str6 + "changedExplodeEffect", null);
/* 576 */       if (str7 != null) {
/*     */         
/* 578 */         h.g = paraml.a(str7, (x)null);
/*     */         
/* 580 */         if (h.g != null && !h.g.a())
/*     */         {
/* 582 */           h.g = null;
/*     */         }
/*     */       } 
/*     */       
/* 586 */       boolean bool1 = false;
/* 587 */       boolean bool2 = false;
/*     */       
/* 589 */       if (!f.j(h.c, 1.0F))
/*     */       {
/* 591 */         bool1 = true;
/*     */       }
/*     */       
/* 594 */       if (!f.j(h.d, 1.0F))
/*     */       {
/* 596 */         if (paramam.c != 0 && paramam.i > 0)
/*     */         {
/* 598 */           bool2 = true;
/*     */         }
/*     */       }
/*     */       
/* 602 */       if (h.e != null)
/*     */       {
/* 604 */         bool1 = true;
/*     */       }
/*     */       
/* 607 */       if (h.f != null)
/*     */       {
/* 609 */         bool2 = true;
/*     */       }
/*     */       
/* 612 */       if (bool1) {
/*     */         
/* 614 */         if (paramam.bc == null)
/*     */         {
/* 616 */           paramam.bc = new m();
/*     */         }
/* 618 */         paramam.bc.add(h);
/*     */       } 
/*     */       
/* 621 */       if (bool2) {
/*     */         
/* 623 */         if (paramam.bd == null)
/*     */         {
/* 625 */           paramam.bd = new m();
/*     */         }
/*     */         
/* 628 */         paramam.e = true;
/*     */ 
/*     */         
/* 631 */         paramam.bd.add(h);
/*     */       } 
/*     */       
/* 634 */       if (h.g != null) {
/*     */         
/* 636 */         if (paramam.be == null)
/*     */         {
/* 638 */           paramam.be = new m();
/*     */         }
/*     */         
/* 641 */         paramam.be.add(h);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 660 */     if (paramam.c != 0 && paramam.i > 0)
/*     */     {
/* 662 */       paramam.e = true;
/*     */     }
/*     */     
/* 665 */     if ((paramam.aN != 0.0F || paramam.aO != 0.0F) && paramam.i > 0)
/*     */     {
/* 667 */       paramam.e = true;
/*     */     }
/*     */     
/* 670 */     paramam.f = !paramam.e;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 675 */     paraml.fH.add(paramam);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(am paramam, ap paramap) {
/* 684 */     paramap.a(paramam.bh);
/* 685 */     paramap.c(paramam.bf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static g b(k paramk) {
/* 691 */     al al = paramk.p();
/* 692 */     String str = paramk.k();
/*     */     
/* 694 */     if (al == null)
/*     */     {
/* 696 */       return null;
/*     */     }
/*     */     
/* 699 */     if (!(al instanceof l)) {
/*     */       
/* 701 */       l.b("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + al.i() + " loading real_meta");
/* 702 */       return null;
/*     */     } 
/*     */     
/* 705 */     l l1 = (l)al;
/*     */     
/* 707 */     am am1 = l1.d(str);
/* 708 */     if (am1 == null) {
/*     */       
/* 710 */       l.b("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + str);
/* 711 */       return null;
/*     */     } 
/*     */     
/* 714 */     return am1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf1, f paramf, af paramaf2, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 725 */     am am1 = this;
/*     */ 
/*     */     
/* 728 */     if (paramaf2 == null) {
/*     */       
/* 730 */       paramf.aC = true;
/* 731 */       paramf.n = paramFloat1;
/* 732 */       paramf.o = paramFloat2;
/*     */ 
/*     */ 
/*     */       
/* 736 */       if (am1.aJ != 0.0F) {
/*     */         
/* 738 */         paramf.n += f.a((w)paramaf1, (int)(-am1.aJ * 100.0F), (int)(am1.aJ * 100.0F), 2) / 100.0F;
/*     */         
/* 740 */         paramaf1.bi = (int)(paramaf1.bi + paramf.n);
/* 741 */         paramf.o += f.a((w)paramaf1, (int)(-am1.aJ * 100.0F), (int)(am1.aJ * 100.0F), 3) / 100.0F;
/*     */         
/* 743 */         paramaf1.bi = (int)(paramaf1.bi + paramf.o);
/*     */       } 
/*     */       
/* 746 */       paramf.p = 0.0F;
/*     */       
/* 748 */       paramf.p += am1.aK;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 754 */     else if (paramf.m) {
/*     */       
/* 756 */       paramf.aC = true;
/*     */ 
/*     */       
/* 759 */       if (!am1.I) {
/*     */ 
/*     */         
/* 762 */         float f1 = paramf.t;
/*     */         
/* 764 */         if (am1.at != -1.0F)
/*     */         {
/* 766 */           f1 = am1.at;
/*     */         }
/* 768 */         if (am1.J >= 0.0F)
/*     */         {
/* 770 */           f1 = am1.J;
/*     */         }
/*     */         
/* 773 */         PointF pointF = paramaf2.a(paramf.dH, paramf.dI, f1, paramf.h, paramFloat3);
/*     */ 
/*     */         
/* 776 */         paramf.n = pointF.a;
/* 777 */         paramf.o = pointF.b;
/*     */       }
/*     */       else {
/*     */         
/* 781 */         paramf.n = paramaf2.dH;
/* 782 */         paramf.o = paramaf2.dI;
/*     */       } 
/*     */ 
/*     */       
/* 786 */       if (am1.t) {
/*     */         
/* 788 */         paramf.p = paramaf2.dJ;
/*     */       }
/*     */       else {
/*     */         
/* 792 */         paramf.p = 0.0F;
/*     */       } 
/*     */       
/* 795 */       paramf.p += am1.aK;
/*     */ 
/*     */       
/* 798 */       if (am1.aJ != 0.0F)
/*     */       {
/*     */         
/* 801 */         paramf.n += f.a((w)paramaf1, (int)(-am1.aJ * 100.0F), (int)(am1.aJ * 100.0F), 2) / 100.0F;
/* 802 */         paramf.o += f.a((w)paramaf1, (int)(-am1.aJ * 100.0F), (int)(am1.aJ * 100.0F), 7) / 100.0F;
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 811 */       paramf.l = paramaf2;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
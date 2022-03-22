/*      */ package com.corrodinggames.rts.game.units.custom;
/*      */ 
/*      */ import com.corrodinggames.rts.game.units.custom.b.f;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class as
/*      */ {
/*      */   public String a;
/*      */   public String b;
/*      */   public boolean c;
/*      */   public boolean d;
/*      */   public int e;
/*      */   public float f;
/*      */   public float g;
/*   31 */   public float h = 1.0F;
/*      */   
/*      */   public float i;
/*      */   
/*      */   public float j;
/*      */   public boolean k;
/*   37 */   public float l = -1.0F;
/*   38 */   public float m = 0.0F;
/*   39 */   public float n = 4.0F;
/*      */   
/*   41 */   public float o = 0.0F;
/*   42 */   public float p = 4.0F;
/*   43 */   public float q = 7.0F;
/*      */   
/*      */   public boolean r = false;
/*      */   
/*      */   public float s;
/*      */   
/*   49 */   public float t = 0.0F;
/*      */   
/*      */   public g u;
/*   52 */   public int v = -1;
/*   53 */   public int w = -1;
/*      */ 
/*      */   
/*      */   public as x;
/*      */ 
/*      */   
/*      */   public as y;
/*      */   
/*      */   public boolean z;
/*      */   
/*      */   public boolean A = true;
/*      */   
/*      */   public LogicBoolean B;
/*      */   
/*      */   public aq C;
/*      */   
/*      */   public x D;
/*      */   
/*      */   public x E;
/*      */   
/*      */   public Integer F;
/*      */   
/*      */   public boolean G;
/*      */   
/*      */   public boolean H;
/*      */   
/*      */   public LogicBoolean I;
/*      */   
/*      */   public LogicBoolean J;
/*      */   
/*      */   public LogicBoolean K;
/*      */   
/*      */   public LogicBoolean L;
/*      */   
/*      */   public LogicBoolean M;
/*      */   
/*      */   public i N;
/*      */   
/*      */   public i O;
/*      */   
/*   93 */   public float P = 5.0F;
/*      */ 
/*      */   
/*   96 */   public int Q = 0;
/*      */ 
/*      */ 
/*      */   
/*  100 */   public int R = -1;
/*      */   public LogicBoolean S;
/*      */   public Float T;
/*      */   
/*      */   public int a(k paramk) {
/*  105 */     if (this.R >= 0)
/*      */     {
/*  107 */       if (this.S.read(paramk))
/*      */       {
/*  109 */         return this.R;
/*      */       }
/*      */     }
/*      */     
/*  113 */     return this.Q;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  119 */   public float U = -1.0F;
/*      */   
/*  121 */   public float V = -1.0F;
/*      */ 
/*      */   
/*      */   public float W;
/*      */   
/*      */   public float X;
/*      */   
/*  128 */   public float Y = 0.0F;
/*      */ 
/*      */ 
/*      */   
/*      */   public float Z;
/*      */ 
/*      */ 
/*      */   
/*  136 */   public float aa = 99999.0F;
/*      */ 
/*      */   
/*      */   public Boolean ab;
/*      */ 
/*      */   
/*      */   public float ac;
/*      */ 
/*      */   
/*      */   public float ad;
/*      */   
/*      */   public float ae;
/*      */   
/*  149 */   public float af = -1.0F;
/*      */   
/*  151 */   public float ag = -1.0F;
/*      */ 
/*      */   
/*  154 */   public float ah = -1.0F;
/*      */ 
/*      */ 
/*      */   
/*      */   public Float ai;
/*      */ 
/*      */   
/*      */   public i aj;
/*      */ 
/*      */   
/*  164 */   public float ak = -1.0F;
/*  165 */   public float al = 2000.0F;
/*      */   
/*  167 */   public float am = -999.0F;
/*      */ 
/*      */ 
/*      */   
/*      */   public as an;
/*      */ 
/*      */   
/*  174 */   public int ao = -1;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean ap = true;
/*      */ 
/*      */ 
/*      */   
/*  182 */   public float aq = 0.0F;
/*      */   
/*  184 */   public float ar = 0.0F;
/*  185 */   public float as = 10.0F;
/*      */   
/*      */   public float at;
/*      */   public LogicBoolean au;
/*  189 */   public float av = -1.0F;
/*      */ 
/*      */   
/*      */   public float aw;
/*      */ 
/*      */   
/*      */   public boolean ax;
/*      */ 
/*      */   
/*      */   public int ay;
/*      */ 
/*      */   
/*      */   public o az;
/*      */ 
/*      */   
/*      */   public float aA;
/*      */ 
/*      */   
/*      */   public s aB;
/*      */ 
/*      */   
/*      */   public e aC;
/*      */ 
/*      */   
/*      */   public e[] aD;
/*      */   
/*      */   public e aE;
/*      */   
/*      */   public float aF;
/*      */   
/*      */   public float aG;
/*      */   
/*      */   public int aH;
/*      */   
/*      */   public i aI;
/*      */ 
/*      */   
/*      */   public void a(as paramas) {
/*  227 */     this.f = paramas.f;
/*  228 */     this.g = paramas.g;
/*  229 */     this.i = paramas.i;
/*  230 */     this.j = paramas.j;
/*  231 */     this.k = paramas.k;
/*      */     
/*  233 */     this.l = paramas.l;
/*  234 */     this.m = paramas.m;
/*  235 */     this.n = paramas.n;
/*  236 */     this.t = paramas.t;
/*  237 */     this.u = paramas.u;
/*      */     
/*  239 */     this.aH = paramas.aH;
/*  240 */     this.aI = paramas.aI;
/*      */ 
/*      */     
/*  243 */     this.r = paramas.r;
/*  244 */     this.s = paramas.s;
/*      */     
/*  246 */     this.o = paramas.o;
/*  247 */     this.p = paramas.p;
/*  248 */     this.q = paramas.q;
/*      */ 
/*      */     
/*  251 */     this.x = paramas.x;
/*  252 */     this.z = paramas.z;
/*      */     
/*  254 */     this.A = paramas.A;
/*      */ 
/*      */     
/*  257 */     this.B = paramas.B;
/*      */ 
/*      */     
/*  260 */     this.C = paramas.C;
/*      */     
/*  262 */     this.D = paramas.D;
/*  263 */     this.F = paramas.F;
/*      */     
/*  265 */     this.E = paramas.E;
/*      */ 
/*      */     
/*  268 */     this.I = paramas.I;
/*  269 */     this.J = paramas.J;
/*  270 */     this.K = paramas.K;
/*      */     
/*  272 */     this.L = paramas.L;
/*  273 */     this.M = paramas.M;
/*      */ 
/*      */     
/*  276 */     this.N = paramas.N;
/*  277 */     this.O = paramas.O;
/*      */     
/*  279 */     this.P = paramas.P;
/*      */     
/*  281 */     this.aC = paramas.aC;
/*  282 */     this.aD = paramas.aD;
/*      */     
/*  284 */     this.aE = paramas.aE;
/*      */ 
/*      */     
/*  287 */     this.Q = paramas.Q;
/*      */ 
/*      */ 
/*      */     
/*  291 */     this.R = paramas.R;
/*  292 */     this.S = paramas.S;
/*      */ 
/*      */ 
/*      */     
/*  296 */     this.T = paramas.T;
/*      */     
/*  298 */     this.U = paramas.U;
/*  299 */     this.V = paramas.V;
/*      */ 
/*      */ 
/*      */     
/*  303 */     this.W = paramas.W;
/*      */     
/*  305 */     this.X = paramas.X;
/*      */ 
/*      */     
/*  308 */     this.Y = paramas.Y;
/*      */     
/*  310 */     this.Z = paramas.Z;
/*      */     
/*  312 */     this.an = paramas.an;
/*      */     
/*  314 */     this.ap = paramas.ap;
/*      */ 
/*      */ 
/*      */     
/*  318 */     this.ar = paramas.ar;
/*  319 */     this.as = paramas.as;
/*  320 */     this.at = paramas.at;
/*      */     
/*  322 */     this.au = paramas.au;
/*  323 */     this.av = paramas.av;
/*  324 */     this.aw = paramas.aw;
/*      */     
/*  326 */     this.aa = paramas.aa;
/*  327 */     this.af = paramas.af;
/*      */     
/*  329 */     this.ah = paramas.ah;
/*      */     
/*  331 */     this.ae = paramas.ae;
/*      */     
/*  333 */     this.ax = paramas.ax;
/*      */     
/*  335 */     this.ay = paramas.ay;
/*      */ 
/*      */     
/*  338 */     this.aj = paramas.aj;
/*      */     
/*  340 */     this.ak = paramas.ak;
/*  341 */     this.al = paramas.al;
/*      */     
/*  343 */     this.am = paramas.am;
/*      */ 
/*      */     
/*  346 */     this.az = paramas.az;
/*      */ 
/*      */     
/*  349 */     this.aF = paramas.aF;
/*  350 */     this.aG = paramas.aG;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(as paramas, l paraml, ab paramab, String paramString) {
/*  359 */     paramas.c = true;
/*      */     
/*  361 */     if (paramas.d) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  366 */     String str1 = paramString;
/*      */     
/*  368 */     Float float_1 = Float.valueOf(paramab.h(str1, "x"));
/*  369 */     Float float_2 = Float.valueOf(paramab.h(str1, "y"));
/*      */ 
/*      */ 
/*      */     
/*  373 */     String str2 = paramab.b(str1, "copyFrom", null);
/*  374 */     if (str2 != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  379 */       as as1 = paraml.c(str2);
/*      */       
/*  381 */       if (as1 == null)
/*      */       {
/*  383 */         throw new RuntimeException("[" + paramString + "] Could not find copy turret target with name:" + str2);
/*      */       }
/*      */       
/*  386 */       if (as1.c && !as1.d)
/*      */       {
/*  388 */         throw new RuntimeException("[" + paramString + "] Infinite loop detected with turret copies:" + str2);
/*      */       }
/*      */       
/*  391 */       if (!as1.d)
/*      */       {
/*  393 */         a(as1, paraml, paramab, as1.b);
/*      */       }
/*      */ 
/*      */       
/*  397 */       paramas.a(as1);
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  403 */       paramas.ae = paraml.eo;
/*      */       
/*  405 */       paramas.W = paraml.dP;
/*      */     } 
/*      */ 
/*      */     
/*  409 */     paramas.f = float_1.floatValue();
/*  410 */     paramas.g = float_2.floatValue();
/*      */ 
/*      */     
/*  413 */     paramas.h = paramab.a(str1, "yAxisScaling", Float.valueOf(1.0F)).floatValue();
/*      */ 
/*      */     
/*  416 */     String str3 = paramab.b(str1, "linkDelayWithTurret", null);
/*  417 */     if (str3 != null) {
/*      */       
/*  419 */       paramas.an = paraml.c(str3);
/*      */       
/*  421 */       if (paramas.an == null)
/*      */       {
/*  423 */         throw new RuntimeException("[" + paramString + "] Could not find 'linkDelayWithTurret' turret target with name:" + str3);
/*      */       }
/*      */       
/*  426 */       paramas.l = 9000.0F;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  431 */     Float float_3 = paramab.b(str1, "delay", null);
/*  432 */     if (float_3 != null)
/*      */     {
/*  434 */       paramas.l = float_3.floatValue();
/*      */     }
/*      */     
/*  437 */     if (paramas.l == -1.0F)
/*      */     {
/*  439 */       paramas.l = paraml.dy;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  444 */     Float float_4 = paramab.b(str1, "warmup", null);
/*  445 */     if (float_4 != null)
/*      */     {
/*  447 */       paramas.m = float_4.floatValue();
/*      */     }
/*      */     
/*  450 */     Float float_5 = paramab.a(str1, "warmupCallDownRate", null);
/*  451 */     if (float_5 != null)
/*      */     {
/*  453 */       paramas.n = float_5.floatValue();
/*      */     }
/*      */ 
/*      */     
/*  457 */     Boolean bool1 = paramab.a(str1, "warmupNoReset", null);
/*  458 */     if (bool1 != null)
/*      */     {
/*  460 */       paramas.r = bool1.booleanValue();
/*      */     }
/*      */     
/*  463 */     Float float_6 = paramab.a(str1, "warmupShootDelayTransfer", null);
/*  464 */     if (float_6 != null)
/*      */     {
/*  466 */       paramas.s = float_6.floatValue();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  472 */     paramas.o = paramab.a(str1, "recoilOffset", Float.valueOf(paramas.o)).floatValue();
/*  473 */     paramas.p = paramab.a(str1, "recoilOutTime", Float.valueOf(paramas.p)).floatValue();
/*  474 */     paramas.q = paramab.b(str1, "recoilReturnTime", Float.valueOf(paramas.q)).floatValue();
/*      */ 
/*      */ 
/*      */     
/*  478 */     Float float_7 = paramab.a(str1, "energyUsage", null);
/*  479 */     if (float_7 != null)
/*      */     {
/*  481 */       paramas.t = float_7.floatValue();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  488 */     paramas.aH = paramab.b(str1, "unloadUpToXUnitsAndGiveAttackOrder", Integer.valueOf(paramas.aH)).intValue();
/*  489 */     paramas.aI = paramab.a(paraml, str1, "unloadUpToXUnitsAndGiveAttackOrder_onlyWithTag", paramas.aI);
/*      */ 
/*      */ 
/*      */     
/*  493 */     g g1 = g.a(paraml, paramab, str1, "resourceUsage", true);
/*  494 */     if (g1 != null && g1.c()) {
/*      */       
/*  496 */       paramas.u = g1;
/*      */       
/*  498 */       paraml.a(g1);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  503 */     String str4 = paramab.b(str1, "attachedTo", null);
/*  504 */     if (str4 != null) {
/*      */       
/*  506 */       paramas.x = paraml.c(str4);
/*      */       
/*  508 */       if (paramas.x == null)
/*      */       {
/*  510 */         throw new RuntimeException("[" + paramString + "] Could not find attachedTo turret target:" + str4);
/*      */       }
/*      */       
/*  513 */       if (paramas.x == paramas)
/*      */       {
/*  515 */         throw new RuntimeException("Turret cannot be attachedTo self");
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  520 */       paraml.fI = true;
/*      */     } 
/*      */ 
/*      */     
/*  524 */     Float float_8 = paramab.a(str1, "idleDir", null);
/*  525 */     if (float_8 != null)
/*      */     {
/*  527 */       paramas.i = float_8.floatValue();
/*      */     }
/*      */ 
/*      */     
/*  531 */     Float float_9 = paramab.a(str1, "idleDirReversing", null);
/*  532 */     if (float_9 != null) {
/*      */       
/*  534 */       paramas.j = float_9.floatValue();
/*  535 */       paramas.k = true;
/*      */ 
/*      */     
/*      */     }
/*  539 */     else if (!paramas.k) {
/*      */       
/*  541 */       if (paramas.x != null) {
/*      */         
/*  543 */         paramas.j = 0.0F;
/*      */       }
/*      */       else {
/*      */         
/*  547 */         paramas.j = paramas.i + 180.0F;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  553 */     Boolean bool2 = paramab.a(str1, "canShoot", null);
/*  554 */     Boolean bool3 = paramab.a(str1, "canAttack", null);
/*      */     
/*  556 */     if (bool2 != null && bool3 != null)
/*      */     {
/*  558 */       throw new RuntimeException("[" + paramString + "] Cannot use canShoot and canAttack at the same time, they have the same meaning");
/*      */     }
/*  560 */     if (bool2 != null) {
/*      */       
/*  562 */       paramas.A = bool2.booleanValue();
/*      */     }
/*  564 */     else if (bool3 != null) {
/*      */       
/*  566 */       paramas.A = bool3.booleanValue();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  578 */     paramas.C = aq.a(paraml, paramab.b(str1, "shoot_sound", null), paramas.C);
/*      */ 
/*      */     
/*  581 */     Float float_10 = paramab.a(str1, "shoot_sound_vol", null);
/*  582 */     if (float_10 != null)
/*      */     {
/*  584 */       paramas.C.a(float_10.floatValue());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  590 */     paramas.D = paraml.a(paramab.b(str1, "shoot_flame", null), paramas.D);
/*      */ 
/*      */     
/*  593 */     paramas.F = paramab.a(str1, "shoot_light", paramas.F);
/*      */ 
/*      */ 
/*      */     
/*  597 */     paramas.E = paraml.a(paramab.b(str1, "warmupStartEffect", null), paramas.E);
/*      */ 
/*      */ 
/*      */     
/*  601 */     paramas.z = paramab.a(str1, "slave", Boolean.valueOf(paramas.z)).booleanValue();
/*      */     
/*  603 */     if (paramas.z) {
/*      */       
/*  605 */       if (paramas.x == null)
/*      */       {
/*  607 */         throw new RuntimeException("Turret cannot be a slave without being 'attachedTo' to another turret");
/*      */       }
/*  609 */       paramas.y = paramas.x;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  622 */     paramas.B = paramab.a(paraml, str1, "invisible", paramas.B);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  646 */     paramas.I = paramab.a(paraml, str1, "canAttackFlyingUnits", paramas.I);
/*  647 */     paramas.J = paramab.a(paraml, str1, "canAttackLandUnits", paramas.J);
/*  648 */     paramas.K = paramab.a(paraml, str1, "canAttackUnderwaterUnits", paramas.K);
/*  649 */     paramas.L = paramab.a(paraml, str1, "canAttackNotTouchingWaterUnits", paramas.L);
/*      */ 
/*      */     
/*  652 */     paramas.M = paramab.a(paraml, str1, "canAttackCondition", paramas.M);
/*      */ 
/*      */     
/*  655 */     paramas.N = paramab.a(paraml, str1, "canOnlyAttackUnitsWithTags", paramas.N);
/*  656 */     paramas.O = paramab.a(paraml, str1, "canOnlyAttackUnitsWithoutTags", paramas.O);
/*      */ 
/*      */     
/*  659 */     String str5 = paramab.b(str1, "projectile", null);
/*  660 */     if (str5 != null) {
/*      */       
/*  662 */       am am = paraml.d(str5);
/*      */       
/*  664 */       if (am == null) {
/*      */ 
/*      */         
/*  667 */         if ("0".equals(str5) && paraml.fH.size() == 1 && paraml.d("1") != null)
/*      */         {
/*  669 */           paramas.Q = 0;
/*      */         }
/*      */         else
/*      */         {
/*  673 */           throw new RuntimeException("[" + paramString + "] Could not find projectile with name:" + str5);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  678 */         paramas.Q = am.bg;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  683 */     String str6 = paramab.b(str1, "altProjectile", null);
/*  684 */     if (str6 != null) {
/*      */       
/*  686 */       am am = paraml.d(str6);
/*      */       
/*  688 */       if (am == null)
/*      */       {
/*  690 */         throw new RuntimeException("[" + paramString + "]altProjectile: Could not find projectile with name:" + str6);
/*      */       }
/*      */       
/*  693 */       paramas.R = am.bg;
/*      */     } 
/*      */     
/*  696 */     paramas.S = paramab.a(paraml, str1, "altProjectileCondition", paramas.S);
/*      */     
/*  698 */     if (paramas.R >= 0)
/*      */     {
/*  700 */       if (paramas.S == null)
/*      */       {
/*  702 */         throw new RuntimeException("[" + paramString + "]altProjectileCondition is required with altProjectile");
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  709 */     paramas.P = paramab.a(str1, "canAttackMaxAngle", Float.valueOf(paramas.P)).floatValue();
/*      */ 
/*      */ 
/*      */     
/*  713 */     paramas.T = paramab.a(str1, "turnSpeed", paramas.T);
/*      */     
/*  715 */     paramas.U = paramab.a(str1, "turnSpeedAcceleration", Float.valueOf(paramas.U)).floatValue();
/*      */     
/*  717 */     paramas.V = paramab.a(str1, "turnSpeedDeceleration", Float.valueOf(paramas.V)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  722 */     Float float_11 = paramab.a(str1, "barrelY", null);
/*      */     
/*  724 */     Float float_12 = paramab.a(str1, "size", null);
/*      */     
/*  726 */     if (float_11 != null && float_12 != null)
/*      */     {
/*  728 */       throw new RuntimeException("Turret [" + str1 + "]: barrelY and size can not both be used at the same time as they have the same meaning");
/*      */     }
/*      */ 
/*      */     
/*  732 */     if (float_11 != null)
/*      */     {
/*  734 */       paramas.W = float_11.floatValue();
/*      */     }
/*      */     
/*  737 */     if (float_12 != null)
/*      */     {
/*  739 */       paramas.W = float_12.floatValue();
/*      */     }
/*      */     
/*  742 */     paramas.X = paramab.a(str1, "barrelX", Float.valueOf(paramas.X)).floatValue();
/*      */     
/*  744 */     paramas.Y = paramab.a(str1, "barrelOffsetX_onOddShots", Float.valueOf(paramas.Y)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  758 */     paramas.Z = paramab.a(str1, "barrelHeight", Float.valueOf(paramas.Z)).floatValue();
/*      */     
/*  760 */     paramas.aa = paramab.a(str1, "limitingRange", Float.valueOf(paramas.aa)).floatValue();
/*      */     
/*  762 */     paramas.ah = paramab.a(str1, "limitingAngle", Float.valueOf(paramas.ah)).floatValue();
/*      */     
/*  764 */     paramas.af = paramab.a(str1, "limitingMinRange", Float.valueOf(paramas.af)).floatValue();
/*      */ 
/*      */     
/*  767 */     paramas.ae = paramab.a(str1, "aimOffsetSpread", Float.valueOf(paramas.ae)).floatValue();
/*      */     
/*  769 */     if (paramas.ah >= 0.0F)
/*      */     {
/*  771 */       paraml.bv = true;
/*      */     }
/*      */     
/*  774 */     if (paramas.aa < 99999.0F) {
/*      */       
/*  776 */       paramas.ac = paramas.aa;
/*      */     }
/*      */     else {
/*      */       
/*  780 */       paramas.ac = paraml.du;
/*      */     } 
/*  782 */     paramas.ad = paramas.ac * paramas.ac;
/*      */     
/*  784 */     if (paramas.af > 0.0F) {
/*      */       
/*  786 */       paramas.ag = paramas.af * paramas.af;
/*      */     }
/*      */     else {
/*      */       
/*  790 */       paramas.ag = -1.0F;
/*      */     } 
/*      */ 
/*      */     
/*  794 */     paramas.ab = paramab.a(str1, "showRangeUIGuide", null);
/*      */ 
/*      */     
/*  797 */     paramas.ai = paramab.a(str1, "laserDefenceEnergyUse", paramas.ai);
/*      */     
/*  799 */     if (paramas.ai != null) {
/*      */       
/*  801 */       paraml.bt = true;
/*      */       
/*  803 */       paraml.a(f.a);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  812 */     paramas.aj = h.a(paramab.b(str1, "interceptProjectiles_withTags", null), paramas.aj);
/*      */ 
/*      */     
/*  815 */     if (paramas.aj != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  820 */       paraml.bu = true;
/*  821 */       paraml.a(f.a);
/*      */ 
/*      */       
/*  824 */       paramas.ak = paramab.a(str1, "interceptProjectiles_andTargetingGroundUnderDistance", Float.valueOf(paramas.ak)).floatValue();
/*  825 */       paramas.al = paramab.a(str1, "interceptProjectiles_andUnderDistance", Float.valueOf(paramas.al)).floatValue();
/*  826 */       paramas.am = paramab.a(str1, "interceptProjectiles_andOverHeight", Float.valueOf(paramas.am)).floatValue();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  834 */     paramas.ap = paramab.a(str1, "shouldResetTurret", Boolean.valueOf(paramas.ap)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  838 */     paramas.aq = paramab.a(str1, "idleSpin", Float.valueOf(paramas.aq)).floatValue();
/*      */     
/*  840 */     paramas.ar = paramab.a(str1, "idleSweepAngle", Float.valueOf(paramas.ar)).floatValue();
/*  841 */     paramas.as = paramab.a(str1, "idleSweepDelay", Float.valueOf(paramas.as)).floatValue();
/*  842 */     paramas.at = paramab.a(str1, "idleSweepSpeed", Float.valueOf(paramas.at)).floatValue();
/*      */ 
/*      */     
/*  845 */     paramas.au = paramab.a(paraml, str1, "idleSweepCondition", paramas.au);
/*  846 */     paramas.au = LogicBoolean.convertAlwaysTrueToNull(paramas.au);
/*      */ 
/*      */ 
/*      */     
/*  850 */     paramas.av = paramab.a(str1, "idleSweepAddRandomDelay", Float.valueOf(paramas.av)).floatValue();
/*      */     
/*  852 */     if (paramas.av < 0.0F) {
/*      */       
/*  854 */       float f = 1.0F;
/*  855 */       if (paramas.as > 200.0F) {
/*      */         
/*  857 */         f = 20.0F;
/*      */       }
/*  859 */       else if (paramas.as > 50.0F) {
/*      */         
/*  861 */         f = 5.0F;
/*      */       } 
/*      */       
/*  864 */       paramas.av = f;
/*      */     } 
/*      */     
/*  867 */     paramas.aw = paramab.a(str1, "idleSweepAddRandomAngle", Float.valueOf(paramas.aw)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  877 */     if (paramas.aw < 0.0F)
/*      */     {
/*  879 */       throw new RuntimeException("Turret [" + str1 + "]: idleSweepAddRandomAngle must be >= 0");
/*      */     }
/*  881 */     if (paramas.ar < 0.0F)
/*      */     {
/*  883 */       throw new RuntimeException("Turret [" + str1 + "]: idleSweepAngle must be >= 0");
/*      */     }
/*      */ 
/*      */     
/*  887 */     paramas.ax = paramab.a(str1, "clearTurretTargetAfterFiring", Boolean.valueOf(paramas.ax)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  891 */     paramas.az = paraml.a(paramab.b(str1, "onShoot_playAnimation", null), paramas.az);
/*      */     
/*  893 */     paramas.aA = paramab.b(str1, "onShoot_freezeBodyMovementFor", Float.valueOf(paramas.aA)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  898 */     paramas.aB = paramab.a(paraml, str1, "onShoot_triggerActions", paramas.aB);
/*      */     
/*  900 */     if (paramab.a(str1, "isMainNanoTurret", Boolean.valueOf(false)).booleanValue())
/*      */     {
/*  902 */       paraml.fJ = paramas;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  911 */     e e1 = paraml.a(paramab, str1, "image");
/*      */ 
/*      */ 
/*      */     
/*  915 */     if (e1 != null) {
/*      */       
/*  917 */       paramas.aC = e1;
/*      */ 
/*      */ 
/*      */       
/*  921 */       boolean bool = paraml.p;
/*      */       
/*  923 */       Boolean bool4 = paramab.a(str1, "image_applyTeamColors", null);
/*  924 */       if (bool4 != null)
/*      */       {
/*  926 */         bool = bool4.booleanValue();
/*      */       }
/*      */       
/*  929 */       if (bool) {
/*      */         
/*  931 */         paramas.aD = paraml.a(paramas.aC, paraml.U);
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  938 */         paramas.aD = null;
/*      */       } 
/*      */     } 
/*      */     
/*  942 */     paramas.aF = paramab.a(str1, "image_drawOffsetX", Float.valueOf(paramas.aF)).floatValue();
/*  943 */     paramas.aG = paramab.a(str1, "image_drawOffsetY", Float.valueOf(paramas.aG)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  948 */     e e2 = paraml.a(paramab, str1, "chargeEffectImage");
/*      */     
/*  950 */     if (e2 != null) {
/*      */       
/*  952 */       paramas.aE = e2;
/*      */       
/*  954 */       paraml.fD = true;
/*      */     } 
/*      */     
/*  957 */     if (paraml.fF[paramas.Q] == null)
/*      */     {
/*  959 */       throw new RuntimeException("Turret [" + str1 + "]: cannot find linked projectile:" + paramas.Q);
/*      */     }
/*      */     
/*  962 */     if (paramas.R >= 0)
/*      */     {
/*      */       
/*  965 */       if (paraml.fF[paramas.R] == null)
/*      */       {
/*  967 */         throw new RuntimeException("Turret [" + str1 + "]altProjectile: cannot find linked projectile");
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  972 */     paramas.I = LogicBoolean.convertAlwaysTrueToNull(paramas.I);
/*  973 */     paramas.J = LogicBoolean.convertAlwaysTrueToNull(paramas.J);
/*  974 */     paramas.K = LogicBoolean.convertAlwaysTrueToNull(paramas.K);
/*  975 */     paramas.L = LogicBoolean.convertAlwaysTrueToNull(paramas.L);
/*  976 */     paramas.M = LogicBoolean.convertAlwaysTrueToNull(paramas.M);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  982 */     if (paramas.ah != -1.0F || paramas.I != null || paramas.J != null || paramas.K != null || paramas.L != null || paramas.M != null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  990 */       paramas.G = true;
/*      */     }
/*      */     
/*  993 */     if (paramas.aa < 99999.0F || paramas.af > 0.0F) {
/*      */ 
/*      */       
/*  996 */       paramas.G = true;
/*  997 */       paramas.H = true;
/*      */     } 
/*      */     
/* 1000 */     if (paramas.N != null || paramas.O != null)
/*      */     {
/* 1002 */       paramas.G = true;
/*      */     }
/*      */ 
/*      */     
/* 1006 */     paramas.d = true;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
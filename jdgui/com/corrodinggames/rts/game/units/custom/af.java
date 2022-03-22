/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import java.util.ArrayList;
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
/*     */ public class af
/*     */ {
/*     */   int a;
/*     */   String b;
/*     */   boolean c;
/*     */   public float d;
/*     */   public float e;
/*     */   public float f;
/*     */   public float g;
/*     */   public float h;
/*     */   public boolean i;
/*  32 */   public float j = 1.0F;
/*     */ 
/*     */   
/*     */   public boolean k = true;
/*     */ 
/*     */   
/*     */   public boolean l = false;
/*     */   
/*     */   public boolean m;
/*     */   
/*     */   public LogicBoolean n;
/*     */   
/*  44 */   public float o = 1.0F;
/*     */ 
/*     */   
/*  47 */   public float p = 1.0F;
/*  48 */   public float q = 0.0F;
/*     */ 
/*     */ 
/*     */   
/*  52 */   public float r = 3.0F;
/*     */   
/*  54 */   public float s = 0.3F;
/*     */ 
/*     */   
/*     */   public float t;
/*     */   
/*     */   public e u;
/*     */   
/*     */   public boolean v;
/*     */   
/*     */   public float w;
/*     */   
/*     */   public e x;
/*     */   
/*     */   public e[] y;
/*     */   
/*     */   public e z;
/*     */   
/*     */   public boolean A;
/*     */   
/*     */   public boolean B = true;
/*     */   
/*     */   public boolean C = true;
/*     */   
/*     */   public boolean D;
/*     */   
/*     */   public boolean E = true;
/*     */   
/*     */   public boolean F = true;
/*     */   
/*  83 */   public float G = 7.0F;
/*  84 */   public int H = 3;
/*     */   
/*     */   public boolean I = true;
/*  87 */   public float J = 16.0F;
/*     */   
/*  89 */   public float K = 50.0F;
/*     */   
/*     */   public boolean L = false;
/*     */   
/*     */   public boolean M = false;
/*     */   
/*  95 */   public float N = 0.0F;
/*     */ 
/*     */   
/*     */   public int[] O;
/*     */ 
/*     */   
/*     */   public float P;
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf) {
/* 106 */     this.d = paramaf.d;
/* 107 */     this.e = paramaf.e;
/*     */     
/* 109 */     this.f = paramaf.f;
/*     */     
/* 111 */     this.g = paramaf.g;
/* 112 */     this.h = paramaf.h;
/*     */     
/* 114 */     this.i = paramaf.i;
/*     */     
/* 116 */     this.j = paramaf.j;
/*     */     
/* 118 */     this.k = paramaf.k;
/*     */     
/* 120 */     this.l = paramaf.l;
/*     */     
/* 122 */     this.q = paramaf.q;
/*     */     
/* 124 */     this.m = paramaf.m;
/*     */     
/* 126 */     this.o = paramaf.o;
/*     */     
/* 128 */     this.p = paramaf.p;
/*     */     
/* 130 */     this.r = paramaf.r;
/*     */     
/* 132 */     this.t = paramaf.t;
/*     */     
/* 134 */     this.u = paramaf.u;
/*     */     
/* 136 */     this.w = paramaf.w;
/* 137 */     this.v = paramaf.v;
/*     */     
/* 139 */     this.x = paramaf.x;
/*     */     
/* 141 */     this.y = paramaf.y;
/*     */     
/* 143 */     this.z = paramaf.z;
/*     */ 
/*     */     
/* 146 */     this.A = paramaf.A;
/*     */     
/* 148 */     this.B = paramaf.B;
/* 149 */     this.C = paramaf.C;
/*     */     
/* 151 */     this.s = paramaf.s;
/* 152 */     this.D = paramaf.D;
/* 153 */     this.E = paramaf.E;
/*     */     
/* 155 */     this.F = paramaf.F;
/*     */     
/* 157 */     this.G = paramaf.G;
/* 158 */     this.H = paramaf.H;
/* 159 */     this.I = paramaf.I;
/*     */ 
/*     */     
/* 162 */     this.J = paramaf.J;
/*     */     
/* 164 */     this.K = paramaf.K;
/*     */     
/* 166 */     this.L = paramaf.L;
/* 167 */     this.M = paramaf.M;
/*     */     
/* 169 */     this.N = paramaf.N;
/*     */ 
/*     */     
/* 172 */     this.P = paramaf.P;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(af paramaf, l paraml, ab paramab, String paramString, boolean paramBoolean, ArrayList<af> paramArrayList) {
/* 179 */     String str = paraml.x;
/*     */ 
/*     */     
/* 182 */     if (!paramBoolean) {
/*     */       
/* 184 */       paramaf.i = true;
/*     */       
/* 186 */       paramaf.F = false;
/*     */     } 
/*     */ 
/*     */     
/* 190 */     int i = paramab.b(paramString, "copyFrom", Integer.valueOf(0)).intValue();
/* 191 */     if (i != 0) {
/*     */       
/* 193 */       if (i - 1 >= paramArrayList.size())
/*     */       {
/* 195 */         throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + i);
/*     */       }
/* 197 */       af af1 = paramArrayList.get(i - 1);
/* 198 */       paramaf.a(af1);
/*     */     } 
/*     */ 
/*     */     
/* 202 */     paramaf.d = paramab.h(paramString, "x");
/* 203 */     paramaf.e = paramab.h(paramString, "y");
/*     */ 
/*     */     
/* 206 */     paramaf.b = paramString.replace("_", "");
/*     */     
/* 208 */     paramaf.c = paramBoolean;
/*     */     
/* 210 */     Float float_1 = paramab.a(paramString, "attach_x", null);
/* 211 */     if (float_1 != null)
/*     */     {
/* 213 */       paramaf.g = float_1.floatValue();
/*     */     }
/* 215 */     Float float_2 = paramab.a(paramString, "attach_y", null);
/* 216 */     if (float_2 != null)
/*     */     {
/* 218 */       paramaf.h = float_2.floatValue();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 223 */     paramaf.f = paramab.a(paramString, "endDirOffset", Float.valueOf(0.0F)).floatValue();
/*     */     
/* 225 */     paramaf.i = paramab.a(paramString, "lockMovement", Boolean.valueOf(paramaf.i)).booleanValue();
/*     */     
/* 227 */     paramaf.j = paramab.a(paramString, "estimatingPositionMultiplier", Float.valueOf(paramaf.j)).floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     paramaf.n = paramab.a(paraml, paramString, "hidden", paramaf.n);
/*     */ 
/*     */ 
/*     */     
/* 236 */     paramaf.m = (paramaf.n == LogicBoolean.trueBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     paramaf.o = paramab.a(paramString, "alpha", Float.valueOf(paramaf.o)).floatValue();
/*     */ 
/*     */     
/* 244 */     Float float_3 = paramab.a(paramString, "moveSpeed", null);
/* 245 */     if (float_3 != null)
/*     */     {
/* 247 */       paramaf.p = float_3.floatValue();
/*     */     }
/*     */     
/* 250 */     paramaf.q = paramab.b(paramString, "moveWarmUp", Float.valueOf(paramaf.q)).floatValue();
/*     */ 
/*     */     
/* 253 */     paramaf.r = paramab.a(paramString, "rotateSpeed", Float.valueOf(paramaf.r)).floatValue();
/*     */     
/* 255 */     Float float_4 = paramab.a(paramString, "resetAngle", null);
/* 256 */     if (float_4 != null)
/*     */     {
/* 258 */       paramaf.t = float_4.floatValue();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     boolean bool = paramab.a(paramString, "image_end_teamColors", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 272 */     e e1 = paraml.a(paramab, paramString, "image_foot");
/*     */     
/* 274 */     if (e1 != null) {
/*     */       
/* 276 */       paramaf.x = e1;
/*     */       
/* 278 */       if (bool) {
/*     */         
/* 280 */         paramaf.y = paraml.a(paramaf.x, paraml.U);
/*     */       }
/*     */       else {
/*     */         
/* 284 */         paramaf.y = null;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 290 */     e e2 = paraml.a(paramab, paramString, "image_end");
/*     */ 
/*     */     
/* 293 */     if (e2 != null) {
/*     */       
/* 295 */       paramaf.x = e2;
/*     */       
/* 297 */       if (bool) {
/*     */         
/* 299 */         paramaf.y = paraml.a(paramaf.x, paraml.U);
/*     */       }
/*     */       else {
/*     */         
/* 303 */         paramaf.y = null;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 311 */     e e3 = paraml.a(paramab, paramString, "image_foot_shadow");
/*     */     
/* 313 */     if (e3 != null)
/*     */     {
/* 315 */       paramaf.z = e3;
/*     */     }
/*     */ 
/*     */     
/* 319 */     e e4 = paraml.a(paramab, paramString, "image_end_shadow");
/*     */     
/* 321 */     if (e4 != null)
/*     */     {
/* 323 */       paramaf.z = e4;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 328 */     e e5 = paraml.a(paramab, paramString, "image_leg");
/*     */     
/* 330 */     if (e5 != null)
/*     */     {
/* 332 */       paramaf.u = e5;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 337 */     e e6 = paraml.a(paramab, paramString, "image_middle");
/*     */     
/* 339 */     if (e6 != null)
/*     */     {
/* 341 */       paramaf.u = e6;
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
/*     */ 
/*     */ 
/*     */     
/* 362 */     Float float_5 = paramab.a(paramString, "heightSpeed", null);
/* 363 */     if (float_5 != null)
/*     */     {
/* 365 */       paramaf.s = float_5.floatValue();
/*     */     }
/*     */     
/* 368 */     Boolean bool1 = paramab.a(paramString, "draw_foot_on_top", null);
/* 369 */     if (bool1 != null)
/*     */     {
/* 371 */       paramaf.D = bool1.booleanValue();
/*     */     }
/*     */     
/* 374 */     Boolean bool2 = paramab.a(paramString, "dust_effect", null);
/* 375 */     if (bool2 != null)
/*     */     {
/* 377 */       paramaf.E = bool2.booleanValue();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 383 */     Boolean bool3 = paramab.a(paramString, "drawLegWhenZoomedOut", null);
/* 384 */     if (bool3 != null) {
/*     */       
/* 386 */       paramaf.B = bool3.booleanValue();
/* 387 */       paramaf.A = true;
/*     */     } 
/*     */     
/* 390 */     Boolean bool4 = paramab.a(paramString, "drawFootWhenZoomedOut", null);
/* 391 */     if (bool4 != null) {
/*     */       
/* 393 */       paramaf.C = bool4.booleanValue();
/* 394 */       paramaf.A = true;
/*     */     } 
/*     */     
/* 397 */     if (!paramaf.A)
/*     */     {
/* 399 */       if (!paramaf.i && !paramaf.L) {
/*     */         
/* 401 */         if (paraml.cH < 30)
/*     */         {
/* 403 */           paramaf.B = false;
/*     */         }
/* 405 */         if (paraml.cH < 20)
/*     */         {
/* 407 */           paramaf.C = false;
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 413 */     Boolean bool5 = paramab.a(paramString, "explodeOnDeath", null);
/* 414 */     if (bool5 != null)
/*     */     {
/* 416 */       paramaf.F = bool5.booleanValue();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 421 */     Float float_6 = paramab.a(paramString, "holdDisMin", null);
/* 422 */     if (float_6 != null)
/*     */     {
/* 424 */       paramaf.G = float_6.floatValue();
/*     */     }
/*     */     
/* 427 */     paramaf.H = paramab.b(paramString, "holdDisMin_maxMovingLegs", Integer.valueOf(paramaf.H)).intValue();
/*     */     
/* 429 */     paramaf.I = paramab.a(paramString, "hold_moveOnlyIfFurthest", Boolean.valueOf(paramaf.I)).booleanValue();
/*     */ 
/*     */     
/* 432 */     paramaf.k = paramab.a(paramString, "holdDisMin_checkNeighbours", Boolean.valueOf(paramaf.k)).booleanValue();
/*     */     
/* 434 */     paramaf.l = paramab.a(paramString, "favourOppositeSideNeighbours", Boolean.valueOf(paramaf.l)).booleanValue();
/*     */     
/* 436 */     Float float_7 = paramab.a(paramString, "holdDisMax", null);
/* 437 */     if (float_7 != null)
/*     */     {
/* 439 */       paramaf.J = float_7.floatValue();
/*     */     }
/*     */     
/* 442 */     Float float_8 = paramab.a(paramString, "hardLimit", null);
/* 443 */     if (float_8 != null)
/*     */     {
/* 445 */       paramaf.K = float_8.floatValue();
/*     */     }
/*     */ 
/*     */     
/* 449 */     paramaf.L = paramab.a(paramString, "drawOverBody", Boolean.valueOf(paramaf.L)).booleanValue();
/*     */     
/* 451 */     if (paramaf.L)
/*     */     {
/* 453 */       paraml.an = true;
/*     */     }
/*     */     
/* 456 */     paramaf.M = paramab.a(paramString, "drawUnderAllUnits", Boolean.valueOf(paramaf.M)).booleanValue();
/*     */     
/* 458 */     if (paramaf.M)
/*     */     {
/* 460 */       paraml.ao = true;
/*     */     }
/*     */     
/* 463 */     if (paramaf.M && paramaf.L)
/*     */     {
/* 465 */       throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
/*     */     }
/*     */     
/* 468 */     paramaf.N = paramab.a(paramString, "drawDirOffset", Float.valueOf(paramaf.N)).floatValue();
/*     */ 
/*     */     
/* 471 */     paramaf.P = paramab.a(paramString, "spinRate", Float.valueOf(paramaf.P)).floatValue();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
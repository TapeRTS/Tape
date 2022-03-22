/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.p;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.an;
/*     */ import com.corrodinggames.rts.game.units.ao;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.s;
/*     */ import com.corrodinggames.rts.game.units.custom.t;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ public class b
/*     */   extends a
/*     */ {
/*     */   public boolean a;
/*     */   public boolean b;
/*     */   public ao c;
/*     */   public t d;
/*     */   public boolean e;
/*     */   public i f;
/*     */   public p g;
/*     */   public float h;
/*     */   public boolean i;
/*     */   public i j;
/*     */   public p k;
/*     */   public float l;
/*     */   public boolean m;
/*     */   public boolean n;
/*     */   public PointF o;
/*     */   public PointF p;
/*     */   public PointF q;
/*  84 */   public float r = -1.0F;
/*     */   
/*     */   public s s;
/*     */   
/*     */   public s t;
/*     */   
/*  90 */   public static an u = new an();
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  94 */     boolean bool1 = false;
/*     */ 
/*     */ 
/*     */     
/*  98 */     boolean bool2 = paramab.a(paramString1, paramString2 + "clearAllWaypoints", Boolean.valueOf(false)).booleanValue();
/*  99 */     if (bool2)
/*     */     {
/* 101 */       bool1 = true;
/*     */     }
/*     */     
/* 104 */     boolean bool3 = paramab.a(paramString1, paramString2 + "clearActiveWaypoint", Boolean.valueOf(false)).booleanValue();
/* 105 */     if (bool3)
/*     */     {
/* 107 */       bool1 = true;
/*     */     }
/*     */     
/* 110 */     ao ao1 = (ao)paramab.a(paramString1, "addWaypoint_type", null, ao.class);
/*     */     
/* 112 */     boolean bool4 = paramab.a(paramString1, paramString2 + "addWaypoint_prepend", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 114 */     i i1 = paramab.a(paraml, paramString1, paramString2 + "addWaypoint_target_nearestUnit_tagged", null);
/* 115 */     p p1 = (p)paramab.a(paramString1, "addWaypoint_target_nearestUnit_team", (Enum)p.a, p.class);
/* 116 */     float f1 = paramab.a(paramString1, paramString2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0F)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 120 */     i i2 = paramab.a(paraml, paramString1, paramString2 + "addWaypoint_target_randomUnit_tagged", null);
/* 121 */     p p2 = (p)paramab.a(paramString1, "addWaypoint_target_randomUnit_team", (Enum)p.a, p.class);
/* 122 */     float f2 = paramab.a(paramString1, paramString2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0F)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 126 */     float f3 = paramab.b(paramString1, paramString2 + "addWaypoint_maxTime", Float.valueOf(-1.0F)).floatValue();
/*     */ 
/*     */     
/* 129 */     s s1 = paramab.a(paraml, paramString1, paramString2 + "addWaypoint_triggerActionIfFailed", null);
/* 130 */     s s2 = paramab.a(paraml, paramString1, paramString2 + "addWaypoint_triggerActionIfMatched", null);
/*     */ 
/*     */     
/* 133 */     PointF pointF1 = paramab.a(paramString1, paramString2 + "addWaypoint_position_offsetFromSelf", null);
/* 134 */     PointF pointF2 = paramab.a(paramString1, paramString2 + "addWaypoint_position_relativeOffsetFromSelf", null);
/* 135 */     PointF pointF3 = paramab.a(paramString1, paramString2 + "addWaypoint_position_randomOffsetFromSelf", null);
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
/* 148 */     boolean bool5 = (pointF1 != null || pointF2 != null || pointF3 != null) ? true : false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     boolean bool6 = (i1 != null) ? true : false;
/*     */     
/* 156 */     boolean bool7 = (i2 != null) ? true : false;
/*     */ 
/*     */     
/* 159 */     boolean bool8 = paramab.a(paramString1, paramString2 + "addWaypoint_position_fromAction", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 161 */     if (bool8) {
/*     */       
/* 163 */       bool1 = true;
/*     */       
/* 165 */       if (bool6 || bool7)
/*     */       {
/* 167 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_target_* and addWaypoint_position_fromAction cannot be used together");
/*     */       }
/*     */       
/* 170 */       if (bool5)
/*     */       {
/* 172 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_position_offset* and addWaypoint_position_fromAction cannot be used together");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     if (bool6 || bool7 || bool5)
/*     */     {
/* 181 */       if (ao1 == null)
/*     */       {
/* 183 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_type is required when using addWaypoint_*");
/*     */       }
/*     */     }
/*     */     
/* 187 */     if (ao1 != null) {
/*     */       
/* 189 */       bool1 = true;
/*     */ 
/*     */       
/* 192 */       if (!bool6 && !bool7 && !bool5 && !bool8)
/*     */       {
/* 194 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf is required when using addWaypoint_*");
/*     */       }
/*     */     } 
/*     */     
/* 198 */     if (bool5) {
/*     */       
/* 200 */       bool1 = true;
/*     */       
/* 202 */       if (bool6 || bool7)
/*     */       {
/* 204 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
/*     */       }
/*     */       
/* 207 */       if (ao1 != ao.a && ao1 != ao.h)
/*     */       {
/* 209 */         throw new RuntimeException("[" + paramString1 + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 214 */     if (bool6 && bool7)
/*     */     {
/* 216 */       throw new RuntimeException("[" + paramString1 + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
/*     */     }
/*     */ 
/*     */     
/* 220 */     if (bool1) {
/*     */       
/* 222 */       b b1 = new b();
/* 223 */       b1.a = bool2;
/* 224 */       b1.b = bool3;
/*     */ 
/*     */       
/* 227 */       if (ao1 != null) {
/*     */         
/* 229 */         b1.c = ao1;
/*     */ 
/*     */         
/* 232 */         if (b1.c == ao.c) {
/*     */           
/* 234 */           b1.d = paraml.a(paramab.b(paramString1, paramString2 + "addWaypoint_unitType", null), paramString2 + "addWaypoint_unitType", paramString1);
/*     */           
/* 236 */           if (b1.d == null)
/*     */           {
/* 238 */             throw new RuntimeException("[" + paramString1 + "] addWaypoint_type: build requires addWaypoint_unitType");
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 243 */         b1.e = bool4;
/* 244 */         b1.f = i1;
/* 245 */         b1.g = p1;
/* 246 */         b1.h = f1;
/*     */         
/* 248 */         b1.j = i2;
/* 249 */         b1.k = p2;
/* 250 */         b1.l = f2;
/* 251 */         if (bool7)
/*     */         {
/* 253 */           b1.i = true;
/*     */         }
/*     */ 
/*     */         
/* 257 */         b1.m = paramab.a(paramString1, paramString2 + "addWaypoint_target_mapMustBeReachable", Boolean.valueOf(true)).booleanValue();
/*     */ 
/*     */         
/* 260 */         b1.o = pointF1;
/*     */         
/* 262 */         b1.p = pointF2;
/*     */         
/* 264 */         b1.q = pointF3;
/*     */         
/* 266 */         b1.n = bool8;
/*     */ 
/*     */         
/* 269 */         b1.r = f3;
/*     */         
/* 271 */         b1.s = s1;
/*     */         
/* 273 */         b1.t = s2;
/*     */       } 
/*     */ 
/*     */       
/* 277 */       paramc.W.add(b1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public an a(k paramk, float paramFloat1, float paramFloat2, af paramaf, int paramInt) {
/*     */     an an1;
/* 287 */     if (this.r == 0.0F) {
/*     */       
/* 289 */       an1 = u;
/* 290 */       an1.e();
/*     */ 
/*     */     
/*     */     }
/* 294 */     else if (this.e) {
/*     */       
/* 296 */       an1 = paramk.am();
/*     */ 
/*     */       
/* 299 */       paramk.aB();
/* 300 */       paramk.az();
/*     */     }
/*     */     else {
/*     */       
/* 304 */       an1 = paramk.an();
/*     */     } 
/*     */ 
/*     */     
/* 308 */     if (this.c == ao.a) {
/*     */       
/* 310 */       an1.a(paramFloat1, paramFloat2);
/*     */     }
/* 312 */     else if (this.c == ao.h) {
/*     */       
/* 314 */       an1.b(paramFloat1, paramFloat2);
/*     */     }
/* 316 */     else if (this.c == ao.k && paramaf != null) {
/*     */       
/* 318 */       an1.c(paramaf);
/*     */     }
/* 320 */     else if (this.c == ao.n && paramaf != null) {
/*     */       
/* 322 */       an1.e(paramaf);
/*     */     }
/* 324 */     else if (this.c == ao.e && paramaf != null) {
/*     */       
/* 326 */       an1.g(paramaf);
/*     */     }
/* 328 */     else if (this.c == ao.i && paramaf != null) {
/*     */       
/* 330 */       an1.h(paramaf);
/*     */     }
/* 332 */     else if (this.c == ao.b && paramaf != null) {
/*     */       
/* 334 */       an1.a(paramaf);
/*     */     }
/* 336 */     else if (this.c == ao.g && paramaf != null) {
/*     */       
/* 338 */       an1.f(paramaf);
/*     */     }
/* 340 */     else if (this.c == ao.d && paramaf != null) {
/*     */       
/* 342 */       an1.b(paramaf);
/*     */     }
/* 344 */     else if (this.c == ao.m && paramaf != null) {
/*     */       
/* 346 */       an1.d(paramaf);
/*     */     }
/* 348 */     else if (this.c == ao.c) {
/*     */       
/* 350 */       an1.a(paramFloat1, paramFloat2, this.d.c(), 1);
/*     */     }
/*     */     else {
/*     */       
/* 354 */       paramk.aw();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 359 */     an1.l = this.r;
/*     */     
/* 361 */     an1.n = true;
/*     */ 
/*     */     
/* 364 */     if (this.t != null) {
/*     */       
/* 366 */       PointF pointF = new PointF(an1.g(), an1.h());
/* 367 */       this.t.a(paramk, pointF, an1.i(), paramInt + 1);
/*     */     } 
/*     */     
/* 370 */     return an1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 377 */     if (this.a) {
/*     */       
/* 379 */       paramk.ax();
/*     */     }
/* 381 */     else if (this.b) {
/*     */       
/* 383 */       paramk.aw();
/*     */     } 
/*     */ 
/*     */     
/* 387 */     if (this.c != null)
/*     */     {
/*     */       
/* 390 */       if (this.n) {
/*     */         
/* 392 */         if (paramPointF == null)
/*     */         {
/* 394 */           if (this.s != null)
/*     */           {
/* 396 */             this.s.a(paramk, paramPointF, paramaf, paramInt + 1);
/*     */           }
/*     */         }
/*     */         else
/*     */         {
/* 401 */           a(paramk, paramPointF.a, paramPointF.b, (af)null, paramInt);
/*     */         }
/*     */       
/* 404 */       } else if (this.o != null || this.p != null || this.q != null) {
/*     */ 
/*     */ 
/*     */         
/* 408 */         float f1 = paramk.dH;
/* 409 */         float f2 = paramk.dI;
/*     */         
/* 411 */         if (this.o != null) {
/*     */           
/* 413 */           f1 += this.o.a;
/* 414 */           f2 += this.o.b;
/*     */         } 
/*     */ 
/*     */         
/* 418 */         if (this.p != null) {
/*     */           
/* 420 */           float f3 = this.p.a;
/* 421 */           float f4 = this.p.b;
/*     */           
/* 423 */           float f5 = f.i(paramk.bL);
/* 424 */           float f6 = f.h(paramk.bL);
/*     */           
/* 426 */           float f7 = f5 * f4 - f6 * f3;
/* 427 */           float f8 = f6 * f4 + f5 * f3;
/*     */           
/* 429 */           f1 += f7;
/* 430 */           f2 += f8;
/*     */         } 
/*     */         
/* 433 */         if (this.q != null) {
/*     */           
/* 435 */           int j = paramInt;
/* 436 */           f1 += f.a((w)paramk, -((int)this.q.a), (int)this.q.a, j + 1);
/* 437 */           f2 += f.a((w)paramk, -((int)this.q.b), (int)this.q.b, j + 2);
/*     */         } 
/*     */ 
/*     */         
/* 441 */         a(paramk, f1, f2, (af)null, paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 447 */       else if (this.i) {
/*     */ 
/*     */ 
/*     */         
/* 451 */         v.c = this.l * this.l;
/* 452 */         v.b = this.j;
/* 453 */         v.d = false;
/* 454 */         v.h = null;
/* 455 */         v.e = this.k;
/* 456 */         v.a = this.m;
/* 457 */         v.f = true;
/* 458 */         v.g.clear();
/*     */         
/* 460 */         l l = l.u();
/* 461 */         l.bK.a(paramk.dH, paramk.dI, this.l, (r)paramk, 0.0F, v);
/*     */ 
/*     */         
/* 464 */         if (v.g.size() == 0)
/*     */         {
/* 466 */           if (this.s != null)
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 471 */             this.s.a(paramk, paramPointF, paramaf, paramInt + 1);
/*     */           
/*     */           }
/*     */         
/*     */         }
/*     */         else
/*     */         {
/* 478 */           m m = v.g;
/*     */           
/* 480 */           int j = f.a((w)paramk, 0, m.size() - 1, 0);
/* 481 */           paramk.bi++;
/*     */ 
/*     */           
/* 484 */           af af1 = (af)m.get(j);
/*     */           
/* 486 */           a(paramk, af1.dH, af1.dI, af1, paramInt);
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 496 */         v.c = this.h * this.h;
/* 497 */         v.b = this.f;
/* 498 */         v.d = false;
/* 499 */         v.h = null;
/* 500 */         v.e = this.g;
/* 501 */         v.a = this.m;
/* 502 */         v.f = false;
/*     */         
/* 504 */         l l = l.u();
/* 505 */         l.bK.a(paramk.dH, paramk.dI, this.h, (r)paramk, 0.0F, v);
/*     */         
/* 507 */         if (v.h == null) {
/*     */           
/* 509 */           if (this.s != null)
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 514 */             this.s.a(paramk, paramPointF, paramaf, paramInt + 1);
/*     */           }
/*     */         }
/*     */         else {
/*     */           
/* 519 */           af af1 = v.h;
/* 520 */           a(paramk, af1.dH, af1.dI, af1, paramInt);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 530 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 539 */   public static final c v = new c();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
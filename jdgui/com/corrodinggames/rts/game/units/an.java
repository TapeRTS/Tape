/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.gameFramework.ab;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ public final class an
/*     */ {
/*     */   ao a;
/*     */   al b;
/*     */   c c;
/*     */   int d;
/*  25 */   float e = 1.0F;
/*  26 */   float f = 1.0F;
/*     */   
/*  28 */   long g = -1L;
/*     */   
/*     */   af h;
/*     */   
/*     */   public ab i;
/*     */   
/*     */   public boolean j;
/*  35 */   public float k = -1.0F;
/*  36 */   public float l = -1.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean n;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(an paraman) {
/*  50 */     if (f.c(this.e - paraman.e) > 3.0F || f.c(this.f - paraman.f) > 3.0F)
/*     */     {
/*  52 */       return false;
/*     */     }
/*     */     
/*  55 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean b(an paraman) {
/*  60 */     if (paraman == null)
/*     */     {
/*  62 */       return false;
/*     */     }
/*  64 */     if (this.a != paraman.a)
/*     */     {
/*  66 */       return false;
/*     */     }
/*  68 */     if (this.b != paraman.b)
/*     */     {
/*  70 */       return false;
/*     */     }
/*  72 */     if (f.c(this.e - paraman.e) > 1.0F || f.c(this.f - paraman.f) > 1.0F)
/*     */     {
/*  74 */       return false;
/*     */     }
/*  76 */     if (this.d != paraman.d)
/*     */     {
/*  78 */       return false;
/*     */     }
/*     */     
/*  81 */     if (this.h != paraman.h)
/*     */     {
/*  83 */       return false;
/*     */     }
/*     */     
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp al a() {
/*  94 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/* 101 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 109 */     paramap.a(this.a);
/* 110 */     paramap.a(this.b);
/*     */ 
/*     */     
/* 113 */     paramap.a(this.e);
/* 114 */     paramap.a(this.f);
/*     */ 
/*     */ 
/*     */     
/* 118 */     if (this.g != -1L) {
/*     */       
/* 120 */       paramap.a(this.g);
/*     */     }
/*     */     else {
/*     */       
/* 124 */       paramap.a(this.h);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     paramap.c(this.d);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     paramap.a(this.k);
/* 137 */     paramap.a(this.l);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     paramap.a(this.m);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     paramap.a(this.j);
/*     */ 
/*     */ 
/*     */     
/* 151 */     paramap.a(this.n);
/*     */ 
/*     */     
/* 154 */     c.a(paramap, this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 160 */     this.a = (ao)paramk.b(ao.class);
/* 161 */     this.b = paramk.p();
/*     */     
/* 163 */     this.e = paramk.g();
/* 164 */     this.f = paramk.g();
/*     */ 
/*     */     
/* 167 */     this.g = paramk.m();
/*     */ 
/*     */     
/* 170 */     this.h = null;
/*     */ 
/*     */     
/* 173 */     if (paramk.b() >= 40)
/*     */     {
/* 175 */       this.d = paramk.d();
/*     */     }
/*     */ 
/*     */     
/* 179 */     if (paramk.b() >= 46) {
/*     */       
/* 181 */       this.k = paramk.g();
/* 182 */       this.l = paramk.g();
/*     */     } 
/*     */     
/* 185 */     if (paramk.b() >= 58)
/*     */     {
/* 187 */       this.m = paramk.e();
/*     */     }
/*     */ 
/*     */     
/* 191 */     if (paramk.b() >= 65)
/*     */     {
/* 193 */       this.j = paramk.e();
/*     */     }
/*     */     
/* 196 */     if (paramk.b() >= 79)
/*     */     {
/* 198 */       this.n = paramk.e();
/*     */     }
/*     */     
/* 201 */     if (paramk.b() >= 82)
/*     */     {
/* 203 */       this.c = c.a(paramk);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c() {
/* 212 */     if (this.g != -1L) {
/*     */       
/* 214 */       this.h = w.a(this.g, true);
/*     */       
/* 216 */       if (this.h == null) {
/*     */         
/* 218 */         l.b("convertUnitIds failed");
/* 219 */         if (this.a != null)
/*     */         {
/* 221 */           l.b("convertUnitIds: type:" + this.a.toString());
/*     */         }
/* 223 */         if (this.b != null)
/*     */         {
/* 225 */           l.b("convertUnitIds: build:" + this.b.toString());
/*     */         }
/* 227 */         l.b("convertUnitIds: x:" + this.e + ", y:" + this.f);
/*     */       } 
/*     */       
/* 230 */       this.g = -1L;
/*     */     } 
/*     */   }
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
/*     */   public strictfp ao d() {
/* 262 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 270 */     this.a = ao.a;
/* 271 */     this.b = null;
/* 272 */     this.d = 1;
/* 273 */     this.e = 2.0F;
/* 274 */     this.f = 2.0F;
/* 275 */     this.g = -1L;
/* 276 */     this.h = null;
/* 277 */     this.i = null;
/*     */     
/* 279 */     this.k = -1.0F;
/* 280 */     this.l = -1.0F;
/*     */     
/* 282 */     this.m = false;
/*     */     
/* 284 */     this.j = false;
/*     */     
/* 286 */     this.n = false;
/*     */     
/* 288 */     this.c = null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f() {
/* 294 */     return (this.a == ao.b || this.a == ao.d || this.a == ao.g || this.a == ao.e || this.a == ao.i || this.a == ao.k || this.a == ao.m || this.a == ao.n);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g() {
/* 301 */     if (f())
/*     */     {
/* 303 */       if (this.h != null)
/*     */       {
/* 305 */         return this.h.dH;
/*     */       }
/*     */     }
/* 308 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float h() {
/* 313 */     if (f())
/*     */     {
/* 315 */       if (this.h != null)
/*     */       {
/* 317 */         return this.h.dI;
/*     */       }
/*     */     }
/* 320 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp af i() {
/* 326 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat1, float paramFloat2) {
/* 332 */     e();
/*     */     
/* 334 */     this.a = ao.a;
/*     */     
/* 336 */     this.e = paramFloat1;
/* 337 */     this.f = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(float paramFloat1, float paramFloat2) {
/* 343 */     e();
/*     */     
/* 345 */     this.a = ao.h;
/*     */     
/* 347 */     this.e = paramFloat1;
/* 348 */     this.f = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf) {
/* 356 */     e();
/* 357 */     this.a = ao.b;
/* 358 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat1, float paramFloat2, al paramal, int paramInt) {
/* 363 */     e();
/*     */     
/* 365 */     this.a = ao.c;
/* 366 */     this.e = paramFloat1;
/* 367 */     this.f = paramFloat2;
/* 368 */     this.b = paramal;
/*     */     
/* 370 */     paramInt = (byte)paramInt;
/*     */     
/* 372 */     this.d = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(af paramaf) {
/* 377 */     e();
/* 378 */     this.a = ao.d;
/* 379 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void c(af paramaf) {
/* 384 */     e();
/* 385 */     this.a = ao.k;
/* 386 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void d(af paramaf) {
/* 391 */     e();
/* 392 */     this.a = ao.m;
/* 393 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void e(af paramaf) {
/* 398 */     e();
/* 399 */     this.a = ao.n;
/* 400 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void c(float paramFloat1, float paramFloat2) {
/* 405 */     e();
/* 406 */     this.a = ao.j;
/* 407 */     this.e = paramFloat1;
/* 408 */     this.f = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void f(af paramaf) {
/* 414 */     e();
/* 415 */     this.a = ao.g;
/* 416 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void g(af paramaf) {
/* 421 */     e();
/* 422 */     this.a = ao.e;
/* 423 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void h(af paramaf) {
/* 429 */     e();
/* 430 */     this.a = ao.i;
/* 431 */     this.h = paramaf;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c(an paraman) {
/* 438 */     e();
/*     */     
/* 440 */     this.a = paraman.a;
/* 441 */     this.b = paraman.b;
/* 442 */     this.e = paraman.e;
/* 443 */     this.f = paraman.f;
/*     */     
/* 445 */     this.h = paraman.h;
/* 446 */     this.i = paraman.i;
/*     */     
/* 448 */     this.d = paraman.d;
/*     */     
/* 450 */     this.j = paraman.j;
/*     */     
/* 452 */     this.c = paraman.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp long j() {
/* 457 */     long l = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 464 */     if (this.a != null)
/*     */     {
/* 466 */       l += this.a.ordinal();
/*     */     }
/* 468 */     return l;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void k() {
/* 474 */     if (this.h != null) {
/*     */       
/* 476 */       this.g = this.h.dA;
/* 477 */       this.h = null;
/*     */     } 
/*     */     
/* 480 */     this.i = null;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
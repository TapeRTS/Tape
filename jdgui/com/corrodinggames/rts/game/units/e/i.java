/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.ad;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */   extends h
/*     */   implements ad
/*     */ {
/*  33 */   static e a = null;
/*     */   
/*  35 */   static e b = null;
/*     */   
/*  37 */   static e c = null;
/*     */   
/*  39 */   static e[] d = new e[10];
/*     */ 
/*     */   
/*  42 */   float e = 0.0F;
/*     */ 
/*     */   
/*     */   float f;
/*     */ 
/*     */   
/*     */   boolean g;
/*     */   
/*  50 */   m h = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  57 */     paramap.a(this.e);
/*  58 */     paramap.a(this.f);
/*  59 */     paramap.a(this.g);
/*     */ 
/*     */     
/*  62 */     paramap.a(this.h.size());
/*  63 */     for (af af : this.h)
/*     */     {
/*  65 */       paramap.a(af);
/*     */     }
/*     */ 
/*     */     
/*  69 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  77 */     this.e = paramk.g();
/*  78 */     this.f = paramk.g();
/*  79 */     this.g = paramk.e();
/*     */ 
/*     */     
/*  82 */     this.h.clear();
/*     */     
/*  84 */     int j = paramk.f();
/*  85 */     for (byte b = 0; b < j; b++) {
/*     */       
/*  87 */       af af = paramk.n();
/*  88 */       if (af != null)
/*     */       {
/*  90 */         this.h.add(af);
/*     */       }
/*     */     } 
/*     */     
/*  94 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/* 104 */     return ak.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/* 109 */     l l = l.u();
/*     */     
/* 111 */     a = l.bw.a(R.drawable.hovercraft);
/*     */     
/* 113 */     c = l.bw.a(R.drawable.hovercraft_shadow);
/*     */     
/* 115 */     b = l.bw.a(R.drawable.hovercraft_dead);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     d = m.a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 129 */     if (this.bz)
/*     */     {
/* 131 */       return b;
/*     */     }
/* 133 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 140 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 147 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 157 */     this.D = b;
/* 158 */     R(0);
/*     */     
/* 160 */     this.by = false;
/*     */     
/* 162 */     h(true);
/*     */ 
/*     */ 
/*     */     
/* 166 */     a(u.b);
/*     */     
/* 168 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 175 */     h(true);
/*     */     
/* 177 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void h(boolean paramBoolean) {
/* 183 */     for (af af : this.h) {
/*     */       
/* 185 */       af.cp = null;
/* 186 */       af.dH = this.dH + f.i(this.bL) * -9.0F;
/* 187 */       af.dI = this.dI + f.h(this.bL) * -9.0F;
/*     */       
/* 189 */       if (paramBoolean)
/*     */       {
/* 191 */         af.bY = -1.0F;
/*     */       }
/*     */     } 
/*     */     
/* 195 */     this.h.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp i(boolean paramBoolean) {
/* 202 */     super(paramBoolean);
/*     */     
/* 204 */     S(20);
/*     */     
/* 206 */     T(32);
/*     */     
/* 208 */     this.bO = 15.0F;
/* 209 */     this.bP = this.bO;
/*     */     
/* 211 */     this.bZ = 450.0F;
/* 212 */     this.bY = this.bZ;
/*     */     
/* 214 */     this.D = a;
/*     */     
/* 216 */     this.E = c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp int a(m paramm) {
/* 225 */     int j = 0;
/* 226 */     for (af af : paramm)
/*     */     {
/* 228 */       j += af.cg();
/*     */     }
/*     */     
/* 231 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(m paramm, int paramInt, af paramaf) {
/* 237 */     int j = a(paramm);
/*     */     
/* 239 */     if (j + paramaf.cg() <= paramInt)
/*     */     {
/* 241 */       return true;
/*     */     }
/* 243 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bK() {
/* 251 */     return a(this.h);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bL() {
/* 258 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(af paramaf1, af paramaf2, boolean paramBoolean) {
/* 264 */     float f1 = 9.0F;
/* 265 */     float f2 = -180.0F;
/* 266 */     float f3 = 70.0F;
/* 267 */     float f4 = 0.0F;
/* 268 */     float f5 = 7.0F;
/*     */     
/* 270 */     return a(paramaf1, paramaf2, paramBoolean, f1, f2, f3, f4, f5);
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
/*     */   public static strictfp boolean a(af paramaf1, af paramaf2, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 288 */     float f1 = paramaf1.dH + f.i(paramaf1.bL + paramFloat2) * paramFloat5 - f.h(paramaf1.bL + paramFloat2) * paramFloat4;
/* 289 */     float f2 = paramaf1.dI + f.h(paramaf1.bL + paramFloat2) * paramFloat5 + f.i(paramaf1.bL + paramFloat2) * paramFloat4;
/*     */ 
/*     */ 
/*     */     
/* 293 */     f1 += f.i(paramaf1.bL + 90.0F) * (paramBoolean ? -paramFloat1 : paramFloat1);
/* 294 */     f2 += f.h(paramaf1.bL + 90.0F) * (paramBoolean ? -paramFloat1 : paramFloat1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     if (!y.a(paramaf2, f1, f2))
/*     */     {
/* 302 */       f1 += 10.0F;
/*     */     }
/* 304 */     if (!y.a(paramaf2, f1, f2))
/*     */     {
/* 306 */       f1 -= 20.0F;
/*     */     }
/* 308 */     if (!y.a(paramaf2, f1, f2)) {
/*     */       
/* 310 */       f1 -= 10.0F;
/* 311 */       f2 += 10.0F;
/*     */     } 
/* 313 */     if (!y.a(paramaf2, f1, f2))
/*     */     {
/* 315 */       f2 -= 20.0F;
/*     */     }
/*     */     
/* 318 */     if (!y.a(paramaf2, f1, f2))
/*     */     {
/* 320 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 325 */     paramaf2.cp = null;
/*     */     
/* 327 */     paramaf2.dH = f1;
/* 328 */     paramaf2.dI = f2;
/*     */     
/* 330 */     paramaf2.bD += 0.1F;
/*     */     
/* 332 */     paramaf1.bL += paramFloat2;
/*     */     
/* 334 */     paramaf2.bw = paramaf1;
/* 335 */     paramaf2.bx = 45.0F;
/*     */ 
/*     */     
/* 338 */     if (paramaf2 instanceof r) {
/*     */       
/* 340 */       r r = (r)paramaf2;
/*     */       
/* 342 */       r.j(paramaf2.bL);
/*     */       
/* 344 */       r.ax();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 350 */       r.d(paramaf2.dH + f.i(paramaf2.bL + (paramBoolean ? -paramFloat1 : paramFloat1)) * paramFloat3, paramaf2.dI + 
/* 351 */           f.h(paramaf2.bL + (paramBoolean ? -paramFloat1 : paramFloat1)) * paramFloat3);
/*     */       
/* 353 */       r.T = 0;
/*     */     } 
/*     */ 
/*     */     
/* 357 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 363 */     super.a(paramFloat);
/*     */     
/* 365 */     if (this.bz || !bG()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 370 */     if (this.bQ == 0.0F)
/*     */     {
/* 372 */       if (this.dF != 3)
/*     */       {
/* 374 */         R(3);
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 380 */     if (this.g)
/*     */     {
/* 382 */       if (!cu() && !this.cm) {
/*     */         
/* 384 */         this.f = f.a(this.f, paramFloat);
/* 385 */         if (this.f == 0.0F) {
/*     */           
/* 387 */           this.f = 30.0F;
/* 388 */           if (this.h.size() == 0) {
/*     */             
/* 390 */             this.g = false;
/*     */           }
/*     */           else {
/*     */             
/* 394 */             boolean bool = (this.h.size() % 2 == 0) ? true : false;
/* 395 */             af af = (af)this.h.remove(this.h.size() - 1);
/* 396 */             boolean bool1 = a((af)this, af, bool);
/*     */             
/* 398 */             if (!bool1)
/*     */             {
/* 400 */               this.h.add(af);
/*     */             }
/*     */             
/* 403 */             if (this.h.size() == 0)
/*     */             {
/* 405 */               this.g = false;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     this.e += 4.0F * paramFloat;
/* 416 */     if (this.e > 360.0F) this.e -= 360.0F;
/*     */ 
/*     */     
/* 419 */     if (!this.g) {
/*     */       
/* 421 */       this.dJ = f.a(this.dJ, 3.0F + f.h(this.e) * 1.5F, 0.1F * paramFloat);
/*     */     }
/*     */     else {
/*     */       
/* 425 */       this.dJ = f.a(this.dJ, 0.0F, 0.1F * paramFloat);
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
/*     */   public strictfp void a(af paramaf, int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 445 */     return 30.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 451 */     return 100.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float z() {
/* 459 */     if (cu())
/*     */     {
/* 461 */       return 1.2F;
/*     */     }
/* 463 */     return 0.9F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float A() {
/* 471 */     if (cu())
/*     */     {
/* 473 */       return 1.8F;
/*     */     }
/* 475 */     return 1.4F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 482 */     return 0.1F;
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
/*     */   public strictfp float C() {
/* 495 */     return 0.03F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 501 */     return 0.05F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 508 */     return 99.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 514 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean d(af paramaf, boolean paramBoolean) {
/* 521 */     if (this.g)
/*     */     {
/* 523 */       return false;
/*     */     }
/*     */     
/* 526 */     if (!a(this.h, 4, paramaf))
/*     */     {
/* 528 */       return false;
/*     */     }
/* 530 */     if (paramaf == this)
/*     */     {
/* 532 */       return false;
/*     */     }
/*     */     
/* 535 */     if (this.bB != paramaf.bB && !paramBoolean)
/*     */     {
/* 537 */       return false;
/*     */     }
/*     */     
/* 540 */     return y.a(paramaf, true, true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e(af paramaf, boolean paramBoolean) {
/* 546 */     if (!d(paramaf, paramBoolean))
/*     */     {
/* 548 */       return false;
/*     */     }
/* 550 */     y(paramaf);
/* 551 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void y(af paramaf) {
/* 558 */     paramaf.cp = (af)this;
/* 559 */     this.h.add(paramaf);
/*     */     
/* 561 */     l l = l.u();
/* 562 */     l.bA.l(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(af paramaf) {
/* 568 */     if (paramaf.cp == this) {
/*     */       
/* 570 */       this.h.remove(paramaf);
/* 571 */       paramaf.cp = null;
/*     */     }
/*     */     else {
/*     */       
/* 575 */       l.f("Unit is not being transported");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/* 582 */     return 12000.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean m_() {
/* 588 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void L() {
/* 593 */     this.g = true;
/* 594 */     this.f = 30.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void cY() {
/* 599 */     this.g = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {
/* 607 */     if (params == i)
/*     */     {
/* 609 */       L();
/*     */     }
/*     */     
/* 612 */     if (params == j)
/*     */     {
/* 614 */       cY();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cc() {
/* 623 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int f() {
/* 629 */     return this.h.size();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c ca() {
/* 635 */     return i.J();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 640 */   public static final s i = (s)new i$1(109);
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
/* 683 */   public static final s j = (s)new i$2(110);
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
/* 717 */   static ArrayList k = new ArrayList(); static {
/* 718 */     k.add(i);
/* 719 */     k.add(j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 729 */     return k;
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
/*     */   public strictfp boolean n_() {
/* 746 */     return !cu();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean u() {
/* 752 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.h;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends f
/*     */ {
/*     */   boolean a = false;
/*     */   boolean b = true;
/*  38 */   float c = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  44 */     paramap.a(this.a);
/*     */     
/*  46 */     paramap.a(this.c);
/*     */     
/*  48 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  54 */     this.a = paramk.e();
/*  55 */     this.b = !P();
/*     */     
/*  57 */     if (paramk.b() >= 21)
/*     */     {
/*  59 */       this.c = paramk.g();
/*     */     }
/*     */     
/*  62 */     K();
/*     */     
/*  64 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  70 */   static com.corrodinggames.rts.gameFramework.j.e d = null;
/*     */   
/*  72 */   static com.corrodinggames.rts.gameFramework.j.e e = null;
/*     */   
/*  74 */   static com.corrodinggames.rts.gameFramework.j.e f = null;
/*     */   
/*  76 */   public static com.corrodinggames.rts.gameFramework.j.e g = null;
/*  77 */   public static com.corrodinggames.rts.gameFramework.j.e[] h = new com.corrodinggames.rts.gameFramework.j.e[10];
/*     */   
/*  79 */   static com.corrodinggames.rts.gameFramework.j.e[] i = new com.corrodinggames.rts.gameFramework.j.e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e v() {
/*  85 */     if (this.bB.i == -1)
/*     */     {
/*  87 */       return null;
/*     */     }
/*  89 */     return h[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  95 */     l l = l.u();
/*     */ 
/*     */     
/*  98 */     e = l.bw.a(R.drawable.attack_submarine);
/*     */ 
/*     */     
/* 101 */     f = a(e, e.l(), e.k());
/*     */     
/* 103 */     d = l.bw.a(R.drawable.attack_submarine_dead);
/*     */     
/* 105 */     g = l.bw.a(R.drawable.unit_icon_water);
/*     */     
/* 107 */     h = m.a(g);
/*     */     
/* 109 */     i = m.a(e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/* 116 */     return ((l.u()).by.renderExtraShadows && this.dJ >= 0.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/* 120 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/* 124 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d() {
/* 131 */     if (this.bz)
/*     */     {
/* 133 */       return d;
/*     */     }
/* 135 */     return i[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e k() {
/* 142 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ah h() {
/* 148 */     return ah.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/* 155 */     return ak.K;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f() {
/* 161 */     if (!P())
/*     */     {
/* 163 */       return true;
/*     */     }
/*     */     
/* 166 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e(boolean paramBoolean) {
/* 174 */     super(paramBoolean);
/*     */     
/* 176 */     b(e);
/*     */     
/* 178 */     this.bO = 15.0F;
/* 179 */     this.bP = this.bO - 2.0F;
/*     */     
/* 181 */     this.bZ = 260.0F;
/* 182 */     this.bY = this.bZ;
/*     */ 
/*     */     
/* 185 */     this.D = e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void K() {
/* 193 */     if (!this.b) {
/*     */       
/* 195 */       R(1);
/*     */     }
/*     */     else {
/*     */       
/* 199 */       R(2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*     */     float f1;
/* 206 */     super.a(paramFloat);
/*     */ 
/*     */     
/* 209 */     if (!bG() || this.bz)
/*     */       return; 
/* 211 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     if (this.a) {
/*     */ 
/*     */       
/* 220 */       f1 = 1.0F;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 225 */       f1 = -8.0F;
/*     */     } 
/*     */     
/* 228 */     if (f.c(this.dJ - f1) > 2.0F) {
/*     */       
/* 230 */       this.c = f.a(this.c, 0.08F, 0.003F * paramFloat);
/*     */     }
/*     */     else {
/*     */       
/* 234 */       this.c = f.a(this.c, 0.02F, 0.003F * paramFloat);
/*     */     } 
/*     */     
/* 237 */     this.dJ = f.a(this.dJ, f1, this.c * paramFloat);
/* 238 */     boolean bool = false;
/*     */     
/* 240 */     if (this.b && P()) {
/*     */       
/* 242 */       this.b = false;
/* 243 */       K();
/* 244 */       bool = true;
/*     */     } 
/* 246 */     if (!this.b && !P()) {
/*     */       
/* 248 */       this.b = true;
/* 249 */       K();
/* 250 */       bool = true;
/*     */     } 
/*     */     
/* 253 */     if (bool)
/*     */     {
/*     */       
/* 256 */       l.bz.a(this.dH, this.dI, 0.0F, 0, 0.0F, 0.0F, this.bL);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 266 */     if (!P())
/*     */     {
/* 268 */       return 250.0F;
/*     */     }
/*     */     
/* 271 */     return 180.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 277 */     return 170.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 283 */     return 10.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float z() {
/* 290 */     if (!P())
/*     */     {
/* 292 */       return 0.8F;
/*     */     }
/*     */     
/* 295 */     return 0.45F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float A() {
/* 301 */     return 1.2F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 307 */     return 0.06F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 313 */     return 2.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float w(int paramInt) {
/* 319 */     return 0.08F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float C() {
/* 326 */     return 0.018F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 332 */     return 0.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d(int paramInt) {
/* 341 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 348 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean P() {
/* 356 */     return (this.dJ < -1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean af() {
/* 363 */     if (!P())
/*     */     {
/* 365 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 369 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ac() {
/* 375 */     if (!P())
/*     */     {
/* 377 */       return false;
/*     */     }
/*     */     
/* 380 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 386 */     if (!P())
/*     */     {
/* 388 */       return true;
/*     */     }
/*     */     
/* 391 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ae() {
/* 397 */     if (!P())
/*     */     {
/* 399 */       return true;
/*     */     }
/*     */     
/* 402 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float q(int paramInt) {
/* 408 */     return 42.0F;
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
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 436 */     if (!P()) {
/*     */ 
/*     */       
/* 439 */       PointF pointF1 = E(paramInt);
/* 440 */       f f1 = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt);
/*     */       
/* 442 */       PointF pointF2 = J(paramInt);
/*     */       
/* 444 */       f1.K = pointF2.a;
/* 445 */       f1.L = pointF2.b;
/*     */       
/* 447 */       f1.ar = Color.a(255, 230, 230, 50);
/* 448 */       f1.U = 42.0F;
/* 449 */       f1.l = paramaf;
/* 450 */       f1.h = 190.0F;
/* 451 */       f1.t = 2.0F;
/* 452 */       f1.aH = true;
/* 453 */       f1.aM = true;
/* 454 */       f1.aQ = true;
/* 455 */       l l = l.u();
/* 456 */       l.bu.a(com.corrodinggames.rts.gameFramework.a.e.l, 0.8F, this.dH, this.dI);
/* 457 */       l.bz.a(this.dH, this.dI, this.dJ, -1118720);
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 464 */       PointF pointF1 = E(paramInt);
/* 465 */       f f1 = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt);
/*     */       
/* 467 */       PointF pointF2 = J(paramInt);
/*     */       
/* 469 */       f1.K = pointF2.a;
/* 470 */       f1.L = pointF2.b;
/*     */       
/* 472 */       f1.ar = Color.a(255, 30, 30, 150);
/* 473 */       f1.x = 1.0F;
/* 474 */       f1.U = 42.0F;
/* 475 */       f1.l = paramaf;
/* 476 */       f1.h = 250.0F;
/* 477 */       f1.t = 1.3F;
/* 478 */       f1.aH = false;
/* 479 */       f1.aM = true;
/* 480 */       f1.aQ = true;
/* 481 */       l l = l.u();
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
/*     */   public strictfp boolean e() {
/* 493 */     l l = l.u();
/* 494 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 496 */     this.D = d;
/* 497 */     R(0);
/*     */     
/* 499 */     this.by = false;
/*     */     
/* 501 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {
/* 508 */     if (params == j)
/*     */     {
/* 510 */       this.a = true;
/*     */     }
/* 512 */     if (params == k)
/*     */     {
/* 514 */       this.a = false;
/*     */     }
/*     */   }
/*     */   
/* 518 */   public static final s j = (s)new e$1(151);
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
/* 540 */   public static final s k = (s)new e$2(152);
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
/* 568 */   static ArrayList l = new ArrayList(); static {
/* 569 */     l.add(j);
/* 570 */     l.add(k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 576 */     return l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 584 */     super.e(paramFloat);
/* 585 */     float f1 = m();
/* 586 */     y.a((af)this, f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
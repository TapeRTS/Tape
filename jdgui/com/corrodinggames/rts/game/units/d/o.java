/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
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
/*     */ 
/*     */ public class o
/*     */   extends h
/*     */ {
/*  44 */   static e[] a = new e[10];
/*     */   
/*  46 */   static e b = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  61 */     paramap.a(this.c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  75 */     this.c = paramk.f();
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
/*  88 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*  92 */   static e d = null;
/*  93 */   static e[] e = new e[10];
/*     */   
/*     */   PointF f;
/*     */   Rect g;
/*     */   
/*     */   public e v() {
/*  99 */     if (this.bB.i == -1)
/*     */     {
/* 101 */       return null;
/*     */     }
/* 103 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b() {
/* 109 */     l l = l.u();
/*     */     
/* 111 */     b = l.bw.a(R.drawable.nuke_launcher_dead);
/*     */     
/* 113 */     e e1 = l.bw.a(R.drawable.nuke_launcher);
/* 114 */     a = m.a(e1);
/*     */     
/* 116 */     e1.m();
/*     */     
/* 118 */     d = l.bw.a(R.drawable.unit_icon_building);
/*     */     
/* 120 */     e = m.a(d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bk() {
/* 129 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 136 */     l l = l.u();
/*     */ 
/*     */     
/* 139 */     this.D = b;
/* 140 */     R(0);
/*     */     
/* 142 */     this.by = false;
/*     */ 
/*     */ 
/*     */     
/* 146 */     a(u.h);
/*     */ 
/*     */ 
/*     */     
/* 150 */     float f1 = this.dH;
/* 151 */     float f2 = this.dI;
/* 152 */     float f3 = 0.0F;
/*     */ 
/*     */ 
/*     */     
/* 156 */     l.bz.b(h.e);
/*     */ 
/*     */     
/* 159 */     e e1 = l.bz.a(f1, f2, this.dJ, Color.a(255, 255, 255, 255));
/* 160 */     if (e1 != null) {
/*     */       
/* 162 */       e1.H = 8.0F;
/* 163 */       e1.G = 5.0F;
/* 164 */       e1.F = 0.9F;
/* 165 */       e1.W = 20.0F;
/* 166 */       e1.X = e1.W;
/*     */       
/* 168 */       e1.s = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     l.bz.b(h.e);
/* 176 */     e1 = l.bz.c(f1, f2, f3, -1127220);
/* 177 */     if (e1 != null) {
/*     */       
/* 179 */       e1.H = 0.2F;
/* 180 */       e1.G = 2.0F;
/* 181 */       e1.aq = 2;
/* 182 */       e1.W = 45.0F;
/* 183 */       e1.X = e1.W;
/*     */       
/* 185 */       e1.V = 0.0F;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 190 */     float f4 = 40.0F;
/* 191 */     float f5 = 120.0F;
/* 192 */     l.bz.a(this.dH, this.dI, this.dJ, f4, f5);
/*     */ 
/*     */     
/* 195 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e d() {
/* 203 */     if (this.bz)
/*     */     {
/* 205 */       return b;
/*     */     }
/* 207 */     return a[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e k() {
/* 214 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {}
/*     */   public void a(float paramFloat) {
/*     */     super.a(paramFloat);
/*     */     if (!bG() || this.bz)
/*     */       return; 
/*     */   }
/*     */   public PointF E(int paramInt) {
/*     */     aT.a(this.dH, this.dI - 3.0F);
/*     */     return aT;
/*     */   }
/*     */   
/* 228 */   public o(boolean paramBoolean) { super(paramBoolean);
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
/* 252 */     this.f = new PointF();
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
/* 350 */     this.g = new Rect(); this.D = a[a.length - 1]; b(this.D); this.bO = 40.0F;
/*     */     this.bP = this.bO;
/*     */     this.bZ = 1500.0F;
/*     */     this.bY = this.bZ;
/*     */     this.n.a(-2, -1, 2, 1);
/* 355 */     this.o.a(-2, -1, 2, 2); } public boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */   
/*     */   public void a(af paramaf, int paramInt) {}
/*     */   public float c(int paramInt) {
/*     */     return 4.0F;
/*     */   }
/*     */   public boolean b(int paramInt, float paramFloat) {
/*     */     return false;
/*     */   }
/*     */   public ak c() {
/* 365 */     return ak.C;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 372 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float g(int paramInt) {
/* 379 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float bH() {
/* 387 */     return super.bH();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 398 */     l l = l.u();
/*     */     
/* 400 */     if (this.c <= 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 406 */     float f1 = f.a(this.dH, this.dI, paramFloat1, paramFloat2);
/*     */     
/* 408 */     if (f1 < 202500.0F) {
/*     */ 
/*     */       
/* 411 */       if (this.bB == l.bb)
/*     */       {
/* 413 */         l.bA.a("Nuke target too close");
/*     */       }
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 421 */     this.c--;
/*     */     
/* 423 */     boolean bool = false;
/*     */     
/* 425 */     PointF pointF = E(bool);
/*     */ 
/*     */     
/* 428 */     float f2 = 5.0F;
/*     */ 
/*     */ 
/*     */     
/* 432 */     f f = a((af)this, pointF.a, pointF.b, paramFloat1, paramFloat2);
/*     */ 
/*     */     
/* 435 */     f.i = f2;
/*     */     
/* 437 */     e e1 = l.bz.a(pointF.a, pointF.b, this.dJ, -1127220);
/* 438 */     if (e1 != null) {
/*     */       
/* 440 */       e1.V = f2;
/* 441 */       e1.H = 2.1F;
/* 442 */       e1.G = 2.1F;
/* 443 */       e1.aq = 2;
/*     */ 
/*     */       
/* 446 */       e1.t = true;
/* 447 */       e1.u = 70.0F;
/*     */       
/* 449 */       e1.W = 370.0F;
/* 450 */       e1.X = e1.W;
/*     */       
/* 452 */       e1.F = 1.0F;
/*     */     } 
/*     */     
/* 455 */     e e2 = l.bz.d(pointF.a, pointF.b, 0.0F, -1);
/* 456 */     if (e2 != null) {
/*     */       
/* 458 */       e2.H = 1.0F;
/* 459 */       e2.G = 3.1F;
/* 460 */       e2.aq = 2;
/*     */       
/* 462 */       e2.W = 170.0F;
/* 463 */       e2.X = e2.W;
/*     */       
/* 465 */       e2.V = f2 + 20.0F;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     float f3 = 0.8F;
/* 472 */     l.bu.a(e.C, 0.27F, f3, pointF.a, pointF.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static f a(af paramaf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 479 */     f f = f.a(paramaf, paramFloat1, paramFloat2);
/*     */     
/* 481 */     f.R(10);
/*     */     
/* 483 */     f.P = 0;
/* 484 */     f.Q = 1;
/*     */     
/* 486 */     f.R = 1;
/*     */     
/* 488 */     f.x = 1.0F;
/*     */ 
/*     */ 
/*     */     
/* 492 */     f.aC = true;
/* 493 */     f.m = true;
/*     */     
/* 495 */     f.n = paramFloat3;
/* 496 */     f.o = paramFloat4;
/*     */     
/* 498 */     f.h = 99999.0F;
/*     */     
/* 500 */     f.t = 0.1F;
/* 501 */     f.r = 2.7F;
/*     */ 
/*     */     
/* 504 */     f.ar = Color.a(255, 225, 225, 225);
/*     */     
/* 506 */     f.U = 300.0F;
/*     */     
/* 508 */     f.aH = true;
/* 509 */     f.aM = true;
/* 510 */     f.aQ = true;
/*     */     
/* 512 */     f.C = true;
/* 513 */     f.D = true;
/*     */     
/* 515 */     f.aI = 80.0F;
/* 516 */     f.aJ = 100.0F;
/* 517 */     f.aL = 1.1F;
/*     */ 
/*     */     
/* 520 */     f.Y = 5400.0F;
/* 521 */     f.Z = 250.0F;
/* 522 */     f.ad = true;
/* 523 */     f.ae = false;
/*     */     
/* 525 */     f.ao = true;
/* 526 */     f.W = 75.0F;
/* 527 */     f.X = f.W;
/*     */     
/* 529 */     f.aY = true;
/*     */ 
/*     */     
/* 532 */     l l = l.u();
/*     */     
/* 534 */     l.bz.b(h.e);
/*     */     
/* 536 */     e e1 = l.bz.a((w)f, -1118720);
/* 537 */     if (e1 != null) {
/*     */       
/* 539 */       e1.W = 1300.0F;
/* 540 */       e1.X = e1.W;
/* 541 */       e1.F = 0.2F;
/* 542 */       e1.H = 1.0F;
/*     */     } 
/*     */     
/* 545 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void L() {
/* 550 */     this.c++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(i parami) {
/* 558 */     if (parami.h.equals(i.J()))
/*     */     {
/* 560 */       L();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public c bX() {
/* 570 */     return s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(s params, boolean paramBoolean, PointF paramPointF, af paramaf) {
/* 577 */     if (paramBoolean) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 583 */     if (params == h) {
/*     */       
/* 585 */       a(paramPointF.a, paramPointF.b);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 590 */     super.a(params, paramBoolean, paramPointF, paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 595 */   static s h = new o$1(142);
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
/* 660 */   static s i = (s)new o$2(143);
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
/* 727 */   static ArrayList j = new ArrayList(); static {
/* 728 */     j.add(h);
/* 729 */     j.add(i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList M() {
/* 735 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e(float paramFloat) {
/* 742 */     super.e(paramFloat);
/*     */ 
/*     */     
/* 745 */     y.b((af)this, 450.0F, false);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
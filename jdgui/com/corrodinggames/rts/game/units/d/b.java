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
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends h
/*     */ {
/*  45 */   static e[] a = new e[10];
/*     */   
/*  47 */   static e b = null;
/*     */ 
/*     */ 
/*     */   
/*     */   boolean c;
/*     */ 
/*     */ 
/*     */   
/*     */   int d;
/*     */ 
/*     */ 
/*     */   
/*     */   float e;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  65 */     paramap.a(this.c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     paramap.a(this.d);
/*     */     
/*  73 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  80 */     this.c = paramk.e();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     if (paramk.b() >= 30)
/*     */     {
/*  88 */       this.d = paramk.f();
/*     */     }
/*     */     
/*  91 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*  95 */   static e f = null;
/*  96 */   static e[] g = new e[10];
/*     */   
/*     */   PointF h;
/*     */   Rect i;
/*     */   
/*     */   public strictfp e v() {
/* 102 */     if (this.bB.i == -1)
/*     */     {
/* 104 */       return null;
/*     */     }
/* 106 */     return g[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/* 112 */     l l = l.u();
/*     */     
/* 114 */     b = l.bw.a(R.drawable.antinuke_launcher_dead);
/*     */     
/* 116 */     e e1 = l.bw.a(R.drawable.antinuke_launcher);
/* 117 */     a = m.a(e1);
/*     */     
/* 119 */     e1.m();
/*     */     
/* 121 */     f = l.bw.a(R.drawable.unit_icon_building_turrent);
/*     */     
/* 123 */     g = m.a(f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/* 132 */     l l = l.u();
/*     */ 
/*     */     
/* 135 */     this.D = b;
/* 136 */     R(0);
/*     */     
/* 138 */     this.by = false;
/*     */ 
/*     */ 
/*     */     
/* 142 */     a(u.h);
/*     */     
/* 144 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 152 */     if (this.bz)
/*     */     {
/* 154 */       return b;
/*     */     }
/* 156 */     return a[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 163 */     return null;
/*     */   } public strictfp void a(int paramInt) {} public strictfp void a(float paramFloat) { super.a(paramFloat); if (!bG() || this.bz)
/*     */       return;  if (this.d > 0) { f f = null; this.e = f.a(this.e, paramFloat); if (this.e == 0.0F) { this.e = 15.0F; for (f f1 : f.a) { if (f1.D && f1.dJ > 50.0F) { float f2 = 2200.0F; float f3 = f.a(this.dH, this.dI, f1.dH, f1.dI); if (f3 < f2 * f2) { float f4 = f.a(this.dH, this.dI, f1.n, f1.o); if (f4 < 1000000.0F) { if (f1.j != null && (f1.j.bB.d(this.bB) || f1.j.bB == this.bB))
/*     */                   continue;  if (!a(f1))
/*     */                   f = f1;  }  }
/*     */              }
/*     */            }
/*     */          }
/*     */        if (f != null)
/*     */         b(f);  }
/*     */      } public strictfp boolean a(f paramf) { Object[] arrayOfObject = f.a.a(); byte b1; int i; for (b1 = 0, i = f.a.a; b1 < i; b1++) { f f1 = (f)arrayOfObject[b1]; if (f1 != paramf && f1.q == paramf)
/*     */         return true;  }
/*     */      return false; }
/* 176 */   public strictfp b(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     this.h = new PointF();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 440 */     this.i = new Rect(); this.D = a[a.length - 1]; b(this.D); this.bO = 24.0F; this.bP = this.bO; this.bZ = 2800.0F; this.bY = this.bZ; this.n.a(-1, -1, 1, 1); this.o.a(-1, -1, 1, 1); }
/*     */   public strictfp void b(f paramf) { l l = l.u(); if (this.d <= 0)
/*     */       return;  this.d--; boolean bool = false; PointF pointF = E(bool); f f1 = f.a((af)this, pointF.a, pointF.b); f1.R(10); f1.P = 10; f1.R = 0; f1.x = 1.0F; f1.aC = true; f1.q = paramf; f1.h = 99999.0F; f1.t = 0.2F; f1.r = 6.5F; f1.ar = Color.a(255, 80, 60, 180); f1.U = 600.0F; f1.aH = true; f1.aM = true; f1.aQ = true; f1.C = true; f1.aI = 80.0F; f1.aJ = 100.0F; f1.aL = 2.0F; l.bz.a(pointF.a, pointF.b, this.dJ, -1127220); e e1 = l.bz.d(pointF.a, pointF.b, 0.0F, -1); if (e1 != null) {
/*     */       e1.H = 0.5F; e1.G = 2.1F; e1.aq = 2; e1.W = 90.0F; e1.X = e1.W; e1.V = 0.0F;
/*     */     }  float f2 = 1.5F;
/* 445 */     l.bu.a(e.C, 0.15F, f2, pointF.a, pointF.b); } public strictfp boolean c(float paramFloat) { return super.c(paramFloat); } public strictfp PointF E(int paramInt) {
/*     */     aT.a(this.dH, this.dI - 9.0F);
/*     */     return aT;
/*     */   } public strictfp void a(af paramaf, int paramInt) {} public strictfp float m() {
/*     */     return 1000.0F;
/*     */   } public strictfp float c(int paramInt) {
/*     */     return 4.0F;
/*     */   } public strictfp boolean b(int paramInt, float paramFloat) {
/*     */     return false;
/*     */   } public strictfp ak c() {
/* 455 */     return ak.D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 462 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 469 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bH() {
/* 477 */     return super.bH();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void L() {
/* 485 */     this.d++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 492 */     if (parami.h.equals(k.J()))
/*     */     {
/* 494 */       L();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 502 */     if (this.d < 4)
/*     */     {
/* 504 */       return k.J();
/*     */     }
/*     */     
/* 507 */     return s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bV() {
/* 513 */     return false;
/*     */   }
/*     */   
/* 516 */   static s j = new b$1(145);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 579 */   static s k = (s)new b$2(144);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 647 */   static ArrayList l = new ArrayList(); static {
/* 648 */     l.add(j);
/* 649 */     l.add(k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 655 */     return l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 662 */     super.e(paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void N() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void bN() {
/* 677 */     float f = 990.0F;
/*     */     
/* 679 */     boolean bool1 = false;
/* 680 */     boolean bool2 = true;
/* 681 */     y.a((af)this, f, bool1, bool2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(l paraml) {
/* 687 */     if (this.ci)
/*     */     {
/* 689 */       return true;
/*     */     }
/* 691 */     return super.a(paraml);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(af paramaf, float paramFloat, f paramf) {
/* 699 */     if (paramFloat > 2600.0F)
/*     */     {
/* 701 */       paramFloat = 2600.0F;
/*     */     }
/* 703 */     return super.a(paramaf, paramFloat, paramf);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
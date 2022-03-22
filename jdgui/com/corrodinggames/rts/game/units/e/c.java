/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
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
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends h
/*     */ {
/*  28 */   static e a = null;
/*  29 */   static e b = null;
/*  30 */   static e c = null;
/*  31 */   public static e d = null;
/*     */   
/*  33 */   public static e e = null;
/*     */   
/*  35 */   static e[] f = new e[10];
/*     */ 
/*     */ 
/*     */   
/*     */   int g;
/*     */ 
/*     */ 
/*     */   
/*  43 */   float h = 0.0F;
/*     */   
/*     */   f i;
/*     */   Rect j;
/*     */   Paint k;
/*     */   
/*     */   public strictfp ak b() {
/*  50 */     return ak.O;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  55 */     l l = l.u();
/*     */     
/*  57 */     e e1 = l.bw.a(R.drawable.experimental_hovertank);
/*     */     
/*  59 */     f = m.a(e1);
/*     */     
/*  61 */     a = l.bw.a(R.drawable.experimental_hovertank_dead);
/*  62 */     b = l.bw.a(R.drawable.experimental_hovertank_turret);
/*     */     
/*  64 */     c = a(e1, e1.l() / 1, e1.k());
/*     */ 
/*     */     
/*  67 */     d = l.bw.a(R.drawable.experimental_hovertank_shield);
/*     */     
/*  69 */     e = l.bw.a(R.drawable.shield_mid);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  77 */     if (this.i != null)
/*     */     {
/*  79 */       if (this.i.dC)
/*     */       {
/*  81 */         this.i = null;
/*     */       }
/*     */     }
/*     */     
/*  85 */     paramap.a((w)this.i);
/*     */ 
/*     */     
/*  88 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  94 */     this.i = (f)paramk.a(f.class);
/*     */     
/*  96 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 106 */     if (this.bz)
/*     */     {
/* 108 */       return a;
/*     */     }
/* 110 */     return f[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 116 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/* 121 */     return ((l.u()).by.renderExtraShadows && this.dJ > -2.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/* 125 */     return 4.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/* 129 */     return 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 136 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e R() {
/* 142 */     return d;
/*     */   } public strictfp float bI() { if (this.ce > 0.0F && this.cb < this.ce) return this.cb / this.ce;  return super.bI(); } public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz || !bG()) return;  if (!this.bz) if (this.bQ != 0.0F) { R(2); } else { R(4); }   if (this.cm); this.h += 1.0F * paramFloat; if (this.h > 360.0F)
/*     */       this.h -= 360.0F;  this.dJ = f.a(this.dJ, 4.0F + f.h(this.h) * 2.0F, 0.1F * paramFloat); this.cb = f.a(this.cb, this.ce, 0.25F * paramFloat); this.cc = f.a(this.cc, 0.0F, 4.0F * paramFloat); if (this.cc > 50.0F)
/*     */       this.cc = 50.0F;  if (this.i != null) { PointF pointF = E(0); this.i.dH = pointF.a; this.i.dI = pointF.b; this.i.dJ = this.dJ; if (this.i.dC)
/*     */         this.i = null;  }  }
/*     */   public strictfp float bB() { return 80000.0F; }
/* 148 */   public strictfp boolean e() { l l = l.u();
/*     */     
/* 150 */     this.D = a;
/* 151 */     R(0);
/* 152 */     this.by = false;
/*     */ 
/*     */ 
/*     */     
/* 156 */     a(u.e);
/*     */     
/* 158 */     return true; }
/*     */   public strictfp float K(int paramInt) { return 0.0F; }
/*     */   public strictfp PointF J(int paramInt) { PointF pointF = super.J(paramInt); if (this.i != null) { pointF.a += this.i.K; pointF.b += this.i.L; }  return pointF; }
/*     */   public strictfp float q(int paramInt) { return 0.0F; }
/*     */   public strictfp void a(af paramaf, int paramInt) { l l = l.u(); PointF pointF = E(paramInt); if (this.i != null) { boolean bool = false; if (this.i.dC)
/*     */         bool = true;  if (this.i.l != paramaf)
/*     */         bool = true;  if (bool)
/* 165 */         this.i = null;  }  float f1 = b(paramInt) + e(paramInt) + 5.0F; if (this.i != null) { this.i.h = f1; } else { f f2 = f.a((af)this, pointF.a, pointF.b); f2.U = 380.0F; f2.l = paramaf; f2.h = f1; f2.B = true; f2.A = true; f2.aQ = true; f2.E = true; f2.J = 70.0F; f2.F = 230.0F; f2.ak = 0.75F; f2.dF = this.dF; this.i = f2; }  } public strictfp c(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 484 */     this.j = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 512 */     this.k = y.a(); a(f[7], 1); this.bO = 30.0F; this.bP = this.bO + 1.0F;
/*     */     this.bZ = 3500.0F;
/*     */     this.bY = this.bZ;
/*     */     this.ce = 5000.0F;
/*     */     this.cb = this.ce;
/*     */     this.D = f[7]; }
/*     */   public strictfp float m() { return 180.0F; }
/* 519 */   public strictfp float b(int paramInt) { return 8.0F; } public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 521 */       return false;
/*     */     }
/*     */     
/* 524 */     y.a((r)this);
/*     */ 
/*     */     
/* 527 */     if (!this.bz) {
/*     */       
/* 529 */       float f1 = 0.0F;
/* 530 */       if (this.i != null)
/*     */       {
/* 532 */         f1 = f.b(this.i.e(), 0.25F) * 3.0F;
/*     */       }
/*     */       
/* 535 */       y.a((r)this, l.e, f1, 0);
/*     */     } 
/*     */ 
/*     */     
/* 539 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 545 */     if (!this.bz && this.cb > 0.0F && this.cd == 0.0F) {
/*     */ 
/*     */       
/* 548 */       e e1 = R();
/*     */       
/* 550 */       if (e1 != null) {
/*     */ 
/*     */         
/* 553 */         float f1 = 0.09F;
/*     */         
/* 555 */         f1 += this.cb / this.ce * 0.4F;
/*     */         
/* 557 */         f1 += f.b(this.cc, 50.0F) / 50.0F * 0.5F;
/*     */         
/* 559 */         this.k.a((int)(f1 * 255.0F), 255, 255, 255);
/*     */         
/* 561 */         float f2 = this.dH - l.cd;
/* 562 */         float f3 = this.dI - l.ce - this.dJ;
/* 563 */         l.bw.a(e1, f2, f3, f(false) - 90.0F, this.k);
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
/* 576 */     return true; } public strictfp float e(int paramInt) { return 8.0F; } public strictfp float z() { return 0.6F; } public strictfp float aX() { return 1.0F; }
/*     */   public strictfp float A() { return 1.1F; }
/*     */   public strictfp float B() { return 0.03F; }
/*     */   public strictfp float c(int paramInt) { return 1.5F; }
/*     */   public strictfp float C() { return 0.02F; }
/*     */   public strictfp float D() { return 0.02F; }
/*     */   public strictfp Rect a_(boolean paramBoolean) { if (this.bz && !paramBoolean) return super.a_(paramBoolean);  if (paramBoolean) return super.a_(paramBoolean);  int i = 0; byte b = 0; i += this.g * this.dL; this.j.a(i, b, i + this.dL, b + this.dM); return this.j; }
/* 583 */   public strictfp boolean l() { return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 590 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 596 */     return 8.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF F(int paramInt) {
/* 604 */     float f1 = this.dH;
/* 605 */     float f2 = this.dI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 620 */     aU.a(f1, f2);
/* 621 */     return aU;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bg() {
/* 628 */     return 1;
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
/*     */   public strictfp boolean bd() {
/* 643 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean be() {
/* 649 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int cg() {
/* 657 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cL() {
/* 664 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 670 */     super.e(paramFloat);
/* 671 */     float f1 = m();
/* 672 */     y.a((af)this, f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
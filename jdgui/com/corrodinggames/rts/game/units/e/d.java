/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ import android.graphics.Color;
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
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ public class d extends j {
/*  21 */   static e a = null;
/*  22 */   static e b = null;
/*  23 */   static e c = null;
/*     */   
/*  25 */   static e[] d = new e[10];
/*     */ 
/*     */   
/*     */   int e;
/*     */ 
/*     */   
/*     */   float f;
/*     */   
/*     */   Rect g;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  37 */     return ak.F;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  42 */     l l = l.u();
/*     */     
/*  44 */     e e1 = l.bw.a(R.drawable.experimental_tank);
/*     */     
/*  46 */     d = m.a(e1);
/*     */     
/*  48 */     a = l.bw.a(R.drawable.experimental_tank_dead);
/*  49 */     b = l.bw.a(R.drawable.experimental_tank_turret);
/*     */     
/*  51 */     c = a(e1, e1.l() / 2, e1.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  59 */     if (this.bz)
/*     */     {
/*  61 */       return a;
/*     */     }
/*  63 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  69 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  74 */     return ((l.u()).by.renderExtraShadows && this.dJ > -2.0F && this.bR >= 1.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  78 */     return 4.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  82 */     return 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  90 */     if (Q(paramInt))
/*     */     {
/*  92 */       return null;
/*     */     }
/*     */     
/*  95 */     return b;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (!this.bz)
/*     */       if (this.bQ != 0.0F) { R(2); } else { R(4); }   if (this.cm) { this.f += paramFloat; if (this.f > 5.0F) { this.f = 0.0F; this.e = 1 - this.e; }  }
/*     */      }
/*     */   public strictfp float bB() { return 80000.0F; } public strictfp void a(af paramaf, int paramInt) { if (!Q(paramInt)) { PointF pointF1 = E(paramInt); f f = f.a((af)this, pointF1.a, pointF1.b); PointF pointF2 = J(paramInt); f.K = pointF2.a; f.L = pointF2.b; f.ar = Color.a(255, 247, 212, 129); f.h = 120.0F; f.t = 5.0F; f.l = paramaf; f.Y = 60.0F; f.U = 40.0F; f.Z = 45.0F; f.aa = true; f.x = 2.0F; f.aQ = true; f.P = 9; f.x = 1.0F; f.dF = this.dF; l l = l.u(); l.bz.a(pointF1.a, pointF1.b, this.dJ, 16745216); l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a); l.bz.a((w)f, -1127220); l.bu.a(e.u, 0.3F, this.dH, this.dI); }
/*     */     else { PointF pointF = E(paramInt); pointF.a(this.dH, this.dI); f f = f.a((af)this, this.dH, this.dI); f.ar = Color.a(255, 230, 230, 50); f.U = 60.0F; f.l = paramaf; f.h = 190.0F; f.t = 3.0F; f.r = 6.0F; f.aH = true; f.aI = 10.0F; f.aJ = 15.0F; f.aM = true; f.aQ = true; f.aG = true; f.dF = this.dF; l l = l.u(); l.bu.a(e.l, 0.2F, this.dH, this.dI); l.bz.a((w)f, -1118720); l.bz.a(pointF.a, pointF.b, this.dJ, -1127220); }
/* 102 */      } public strictfp boolean e() { l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     a(u.e);
/*     */     
/* 109 */     this.D = a;
/* 110 */     R(0);
/* 111 */     this.by = false;
/*     */ 
/*     */     
/* 114 */     return true; }
/*     */   public strictfp boolean a(int paramInt, af paramaf, boolean paramBoolean1, boolean paramBoolean2) { if (!paramBoolean1)
/*     */       if (paramBoolean2)
/*     */         if (!a_(paramaf))
/*     */           return false;    if (Q(paramInt)) { if (!paramaf.i())
/*     */         return false;  }
/*     */     else if (paramaf.i()) { return false; }
/* 121 */      return true; } public strictfp d(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     this.g = new Rect(); a(d[7], 2); this.bO = 37.0F; this.bP = this.bO + 1.0F; this.bZ = 6000.0F; this.bY = this.bZ; this.D = d[7]; } public strictfp float m() { return 310.0F; }
/*     */   public strictfp float b(int paramInt) { if (Q(paramInt))
/*     */       paramInt -= 4;  return (110 - paramInt * 20); }
/*     */   public strictfp float e(int paramInt) { if (Q(paramInt))
/*     */       paramInt -= 4; 
/*     */     return (paramInt * 20); }
/*     */   public strictfp float z() { return 0.4F; }
/* 424 */   public strictfp Rect a_(boolean paramBoolean) { if (this.bz && !paramBoolean)
/*     */     {
/* 426 */       return super.a_(paramBoolean);
/*     */     }
/* 428 */     if (paramBoolean)
/*     */     {
/* 430 */       return super.a_(paramBoolean);
/*     */     }
/*     */     
/* 433 */     int i = 0;
/* 434 */     byte b = 0;
/*     */     
/* 436 */     i += this.e * this.dL;
/*     */     
/* 438 */     this.g.a(i, b, i + this.dL, b + this.dM);
/*     */     
/* 440 */     return this.g; } public strictfp float aX() { return 1.0F; }
/*     */   public strictfp int bc() { return 1; }
/*     */   public strictfp float A() { return 0.8F; }
/*     */   public strictfp float B() { return 0.04F; }
/*     */   public strictfp float w(int paramInt) { if (Q(paramInt)) return 1.0F;  return 0.08F; }
/*     */   public strictfp float c(int paramInt) { if (Q(paramInt)) return 4.5F;  return 2.5F; }
/*     */   public strictfp float C() { return 0.03F; }
/*     */   public strictfp float D() { return 0.08F; }
/* 448 */   public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 450 */       return false;
/*     */     }
/*     */     
/* 453 */     y.a((r)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 464 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 471 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 478 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 484 */     return 20.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF F(int paramInt) {
/* 493 */     PointF pointF = super.F(paramInt);
/* 494 */     float f1 = pointF.a;
/* 495 */     float f2 = pointF.b;
/*     */ 
/*     */     
/* 498 */     if (!Q(paramInt)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 504 */       if (paramInt <= 1) {
/*     */         
/* 506 */         f1 += f.i(this.bL) * 5.0F;
/* 507 */         f2 += f.h(this.bL) * 5.0F;
/*     */       } 
/*     */       
/* 510 */       float f = (-45 + 90 * paramInt);
/* 511 */       f1 += f.i(this.bL + f) * 18.0F;
/* 512 */       f2 += f.h(this.bL + f) * 18.0F;
/*     */     } 
/*     */ 
/*     */     
/* 516 */     aU.a(f1, f2);
/* 517 */     return aU;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean Q(int paramInt) {
/* 523 */     if (paramInt >= 4)
/*     */     {
/* 525 */       return true;
/*     */     }
/* 527 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bg() {
/* 533 */     return 6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 541 */     super.e(paramFloat);
/* 542 */     float f = m();
/* 543 */     y.a((af)this, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int cg() {
/* 551 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cL() {
/* 558 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float G(int paramInt) {
/* 566 */     return -2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float H(int paramInt) {
/* 572 */     return 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float I(int paramInt) {
/* 578 */     return 12.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ public class f extends j {
/*  20 */   static e a = null;
/*  21 */   static e b = null;
/*  22 */   static e[] c = new e[10];
/*  23 */   static e d = null;
/*     */ 
/*     */   
/*     */   int e;
/*     */ 
/*     */   
/*     */   float f;
/*     */   
/*     */   float g;
/*     */   
/*     */   Rect h;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  37 */     return ak.w;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  42 */     l l = l.u();
/*     */     
/*  44 */     e e1 = l.bw.a(R.drawable.heavy_tank);
/*     */     
/*  46 */     c = m.a(e1);
/*     */     
/*  48 */     a = l.bw.a(R.drawable.heavy_tank_dead);
/*  49 */     b = l.bw.a(R.drawable.heavy_tank_turret);
/*     */     
/*  51 */     d = a(e1, e1.l() / 3, e1.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  58 */     if (this.bz)
/*     */     {
/*  60 */       return a;
/*     */     }
/*  62 */     return c[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  68 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  74 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  80 */     return ((l.u()).by.renderExtraShadows && !this.bz && this.bR >= 1.0F && !this.bU);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  84 */     return 2.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  88 */     return 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/*  95 */     this.D = a;
/*  96 */     R(0);
/*  97 */     this.by = false;
/*     */     
/*  99 */     a(u.c);
/*     */     
/* 101 */     return true;
/*     */   } public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz)
/*     */       return;  if (this.bK != 0.0F) { this.f += paramFloat; if (this.f > 1.4D) { this.f = 0.0F; this.e++; if (this.e > 2)
/*     */           this.e = 0;  }  if (this.dE) { this.g += paramFloat; if (this.g > 9.0F) { this.g = 0.0F; f(); }  }  }  } public strictfp void f() { l l = l.u(); float f1 = this.bL; if (this.bK < 0.0F)
/*     */       f1 += 180.0F;  for (byte b = 0; b <= 1; b++) { float f2 = ((b == 0) ? -20 : 20); float f3 = this.dH + com.corrodinggames.rts.gameFramework.f.i(f1 + 180.0F + f2) * this.bO; float f4 = this.dI + com.corrodinggames.rts.gameFramework.f.h(f1 + 180.0F + f2) * this.bO; l.bz.c(f3, f4, this.dJ, f1 + 180.0F, 0); }  }
/*     */   public strictfp float bB() { return 7000.0F; }
/*     */   public strictfp float q(int paramInt) { return 50.0F; }
/* 108 */   public strictfp f(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 338 */     this.h = new Rect(); a(c[7], 3); this.bO = 15.0F; this.bP = this.bO + 1.0F; this.bZ = 600.0F; this.bY = this.bZ; this.D = c[7]; }
/*     */   public strictfp void a(af paramaf, int paramInt) { l l = l.u(); if (!paramaf.i()) {
/*     */       PointF pointF1 = E(paramInt); com.corrodinggames.rts.game.f f1 = com.corrodinggames.rts.game.f.a((af)this, pointF1.a, pointF1.b); PointF pointF2 = J(paramInt); f1.K = pointF2.a; f1.L = pointF2.b; f1.ar = Color.a(235, 150, 230, 40); f1.U = q(paramInt); f1.l = paramaf; f1.h = 60.0F; f1.t = 4.0F; f1.x = 2.0F; f1.aQ = true; f1.z = true; l.bz.a((w)f1, -16716288); l.bz.a(pointF1.a, pointF1.b, this.dJ, -1127220); l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a); l.bu.a(e.t, 0.3F, this.dH, this.dI);
/*     */     } else {
/*     */       PointF pointF = E(paramInt); pointF.a(this.dH, this.dI); com.corrodinggames.rts.game.f f1 = com.corrodinggames.rts.game.f.a((af)this, this.dH, this.dI); f1.ar = Color.a(255, 230, 230, 50); f1.U = q(paramInt); f1.l = paramaf; f1.h = 190.0F; f1.t = 0.5F; f1.r = 5.0F; f1.aH = true; f1.aI = 10.0F; f1.aJ = 15.0F; f1.aM = true; f1.aQ = true; f1.aG = true; l.bu.a(e.l, 0.2F, this.dH, this.dI); l.bz.a((w)f1, -1118720); l.bz.a(pointF.a, pointF.b, this.dJ, -1127220);
/* 343 */     }  } public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 345 */       return false;
/*     */     }
/*     */     
/* 348 */     y.a((r)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     return true; }
/*     */   public strictfp float m() { return 160.0F; }
/*     */   public strictfp float b(int paramInt) { return 70.0F; }
/*     */   public strictfp float z() { return 0.8F; }
/*     */   public strictfp float aX() { return 1.0F; }
/*     */   public strictfp float A() { return 1.9F; }
/*     */   public strictfp float B() { return 0.2F; }
/* 366 */   public strictfp float w(int paramInt) { return 0.12F; } public strictfp float c(int paramInt) { return 3.0F; } public strictfp float C() { return 0.05F; } public strictfp float D() { return 0.1F; } public strictfp boolean l() { return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 373 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 379 */     return 21.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp Rect a_(boolean paramBoolean) {
/* 387 */     if (paramBoolean)
/*     */     {
/* 389 */       return super.a_(paramBoolean);
/*     */     }
/* 391 */     if (this.bz)
/*     */     {
/* 393 */       return super.a_(paramBoolean);
/*     */     }
/* 395 */     return a(paramBoolean, this.e);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float G(int paramInt) {
/* 401 */     return -2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float H(int paramInt) {
/* 407 */     return 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float I(int paramInt) {
/* 413 */     return 12.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 419 */     super.e(paramFloat);
/* 420 */     float f1 = m();
/* 421 */     y.a((af)this, f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
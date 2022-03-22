/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class n
/*     */   extends j
/*     */ {
/*  24 */   static e a = null;
/*     */ 
/*     */ 
/*     */   
/*  28 */   static e b = null;
/*  29 */   static e c = null;
/*  30 */   static e d = null;
/*     */   
/*  32 */   static e[] e = new e[10];
/*     */   
/*     */   int f;
/*     */   
/*     */   float g;
/*     */   
/*     */   float h;
/*     */   
/*     */   Rect i;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  44 */     return ak.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  49 */     l l = l.u();
/*     */     
/*  51 */     b = l.bw.a(R.drawable.tank2);
/*     */     
/*  53 */     a = l.bw.a(R.drawable.tank2_dead);
/*     */     
/*  55 */     c = l.bw.a(R.drawable.tank2_turret);
/*     */     
/*  57 */     d = l.bw.a(R.drawable.tank2_shadow);
/*     */     
/*  59 */     e = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  67 */     if (this.bz)
/*     */     {
/*  69 */       return a;
/*     */     }
/*  71 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  78 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  84 */     return ((l.u()).by.renderExtraShadows && !this.bz);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float G() {
/*  90 */     return 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float H() {
/*  95 */     return 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 101 */     return c;
/*     */   } public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz)
/*     */       return;  if (this.bK != 0.0F) { this.g += paramFloat; if (this.g > 1.0F) { this.g = 0.0F; this.f++; if (this.f > 2)
/*     */           this.f = 0;  }
/*     */        if (this.bK > 0.0F)
/*     */         if (this.dE) { this.h += paramFloat; if (this.h > 9.0F) { this.h = 0.0F; f(); }
/*     */            }
/*     */           }
/* 109 */      } public strictfp boolean e() { this.D = a;
/* 110 */     R(0);
/*     */     
/* 112 */     this.by = false;
/*     */ 
/*     */     
/* 115 */     a(u.b);
/*     */ 
/*     */     
/* 118 */     return true; }
/*     */   public strictfp void f() { l l = l.u(); for (byte b = 0; b <= 1; b++) {
/*     */       float f1 = ((b == 0) ? -20 : 20); float f2 = this.dH + f.i(this.bL + 180.0F + f1) * this.bO; float f3 = this.dI + f.h(this.bL + 180.0F + f1) * this.bO; l.bz.c(f2, f3, this.dJ, this.bL + 180.0F, 0);
/*     */     }  }
/*     */   public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f = f.a((af)this, pointF1.a, pointF1.b); PointF pointF2 = J(paramInt); f.K = pointF2.a; f.L = pointF2.b; f.U = 30.0F; f.l = paramaf; f.h = 60.0F; f.t = 3.0F; f.P = 1; f.x = 1.0F; l l = l.u(); l.bz.a(pointF1.a, pointF1.b, this.dJ, -1127220);
/*     */     l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a);
/*     */     float f1 = 1.0F + f.c(-0.07F, 0.07F);
/* 125 */     l.bu.a(e.p, 0.3F, f1, pointF1.a, pointF1.b); } public strictfp n(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     this.i = new Rect();
/*     */     a(b, 3);
/*     */     this.bO = 11.0F;
/*     */     this.bP = this.bO + 1.0F;
/*     */     this.bZ = 210.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; }
/* 291 */   public strictfp float m() { return 130.0F; } public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 293 */       return false;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     y.a((r)this);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 334 */     if (!this.bz);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 348 */     return true; } public strictfp float b(int paramInt) { return 75.0F; } public strictfp float z() { return 1.0F; } public strictfp float A() {
/*     */     return 4.1F;
/*     */   } public strictfp float c(int paramInt) {
/*     */     return 4.0F;
/*     */   }
/*     */   public strictfp float B() {
/*     */     return 0.25F;
/*     */   }
/*     */   public strictfp float C() {
/* 357 */     return 0.07F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 363 */     return 0.17F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 370 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 377 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 383 */     return 20.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp Rect a_(boolean paramBoolean) {
/* 391 */     if (paramBoolean)
/*     */     {
/* 393 */       return super.a_(paramBoolean);
/*     */     }
/* 395 */     if (this.bz)
/*     */     {
/* 397 */       return super.a_(paramBoolean);
/*     */     }
/* 399 */     return a(paramBoolean, this.f);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
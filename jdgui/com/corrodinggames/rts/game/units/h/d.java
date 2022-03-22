/*     */ package com.corrodinggames.rts.game.units.h;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends f
/*     */ {
/*  26 */   static e a = null;
/*     */   
/*  28 */   static e b = null;
/*     */   
/*  30 */   static e c = null;
/*     */   
/*  32 */   static e[] d = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  38 */     return ak.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  43 */     l l = l.u();
/*     */     
/*  45 */     b = l.bw.a(R.drawable.scout_ship);
/*     */     
/*  47 */     a = l.bw.a(R.drawable.scout_ship_dead);
/*     */ 
/*     */ 
/*     */     
/*  51 */     c = a(b, b.l(), b.k());
/*     */     
/*  53 */     d = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  61 */     if (this.bz)
/*     */     {
/*  63 */       return a;
/*     */     }
/*  65 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  73 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  78 */     return ((l.u()).by.renderExtraShadows && this.dJ > -2.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  82 */     return 3.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  86 */     return 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  93 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 100 */     l l = l.u();
/* 101 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 103 */     this.D = a;
/* 104 */     R(0);
/*     */     
/* 106 */     this.by = false;
/*     */     
/* 108 */     return true;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); }
/*     */   static PointF e = new PointF();
/*     */   Rect f; public strictfp PointF E(int paramInt) { float f1 = 6.0F; float f2 = this.bL; float f3 = this.dH + f.i(f2) * f1; float f4 = this.dI + f.h(f2) * f1; e.a(f3, f4); return e; } public strictfp float q(int paramInt) { return 62.0F; } public strictfp void a(af paramaf, int paramInt) { l l = l.u(); PointF pointF = E(paramInt); if (!paramaf.P()) { f f1 = f.a((af)this, pointF.a, pointF.b, this.dJ, paramInt); PointF pointF1 = J(paramInt); f1.K = pointF1.a; f1.L = pointF1.b; f1.ar = Color.a(255, 230, 230, 50); f1.U = 62.0F; f1.l = paramaf; f1.h = 190.0F; f1.t = 2.0F; f1.aH = true; f1.aM = true; f1.aQ = true; l.bu.a(e.l, 0.8F, this.dH, this.dI); l.bz.a(this.dH, this.dI, this.dJ, -1118720); l.bz.a((w)f1, -1118720); }
/*     */     else
/*     */     { f f1 = f.a((af)this, pointF.a, pointF.b, this.dJ - 1.0F, paramInt); f1.ar = Color.a(255, 0, 0, 150); f1.x = 1.0F; f1.U = 42.0F; f1.l = paramaf; f1.h = 220.0F; f1.t = 1.9F; f1.aM = true; f1.aQ = true; l.bu.a(e.l, 0.8F, this.dH, this.dI); l.bz.a(this.dH, this.dI, this.dJ, -1118720); }
/* 115 */      } public strictfp d(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     this.f = new Rect(); S(17);
/*     */     T(31);
/*     */     this.bO = 15.0F;
/*     */     this.bP = this.bO - 2.0F;
/*     */     this.bZ = 350.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; }
/* 304 */   public strictfp float m() { return 200.0F; } public strictfp boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */    public strictfp float b(int paramInt) {
/*     */     return 170.0F;
/*     */   } public strictfp float z() {
/*     */     return 1.2F;
/*     */   } public strictfp float aX() {
/*     */     return 1.0F;
/*     */   } public strictfp float A() {
/*     */     return 1.9F;
/*     */   } public strictfp float B() {
/*     */     return 0.2F;
/*     */   }
/*     */   public strictfp float c(int paramInt) {
/*     */     return 99.0F;
/*     */   }
/*     */   public strictfp float C() {
/*     */     return 0.05F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.1F;
/*     */   }
/*     */   public strictfp boolean l() {
/* 326 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ac() {
/* 332 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 339 */     super.e(paramFloat);
/* 340 */     float f1 = m();
/* 341 */     y.a((af)this, f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
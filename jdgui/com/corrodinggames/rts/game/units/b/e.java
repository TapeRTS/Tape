/*     */ package com.corrodinggames.rts.game.units.b;
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
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends b
/*     */ {
/*  23 */   static com.corrodinggames.rts.gameFramework.j.e a = null;
/*  24 */   static com.corrodinggames.rts.gameFramework.j.e b = null;
/*  25 */   static com.corrodinggames.rts.gameFramework.j.e c = null;
/*  26 */   static com.corrodinggames.rts.gameFramework.j.e d = null;
/*  27 */   static com.corrodinggames.rts.gameFramework.j.e[] e = new com.corrodinggames.rts.gameFramework.j.e[10];
/*     */   
/*  29 */   float f = 0.0F;
/*     */ 
/*     */   
/*     */   Rect g;
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  37 */     return ak.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  42 */     l l = l.u();
/*     */     
/*  44 */     b = l.bw.a(R.drawable.gunship);
/*     */     
/*  46 */     c = l.bw.a(R.drawable.gunship_shadow);
/*     */     
/*  48 */     a = l.bw.a(R.drawable.gunship_dead);
/*     */ 
/*     */ 
/*     */     
/*  52 */     e = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d() {
/*  61 */     if (this.bz)
/*     */     {
/*  63 */       return a;
/*     */     }
/*  65 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e k() {
/*  72 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d(int paramInt) {
/*  79 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/*  86 */     l l = l.u();
/*  87 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */ 
/*     */     
/*  90 */     this.D = a;
/*     */     
/*  92 */     R(0);
/*     */     
/*  94 */     this.by = false;
/*     */     
/*  96 */     return true;
/*     */   }
/*     */   public strictfp boolean I() { return true; }
/*     */   public strictfp boolean i() { return true; }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz) return;  this.f += 2.0F * paramFloat; if (this.f > 360.0F)
/*     */       this.f -= 360.0F;  this.dJ = f.a(this.dJ, 20.0F + f.h(this.f) * 1.5F, 0.1F * paramFloat); }
/*     */   public strictfp PointF E(int paramInt) { float f1 = g(paramInt); float f2 = this.bL; float f3 = this.dH + f.i(f2) * f1; float f4 = this.dI + f.h(f2) * f1; aT.a(f3, f4); return aT; }
/* 103 */   public strictfp float q(int paramInt) { return 35.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt); PointF pointF2 = J(paramInt); f.K = pointF2.a; f.L = pointF2.b; f.ar = Color.a(255, 150, 230, 40); f.U = q(paramInt); f.l = paramaf; f.h = 80.0F; f.t = 4.0F; f.x = 2.0F; l l = l.u(); l.bz.a(pointF1.a, pointF1.b, this.dJ, -1127220); l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a); l.bu.a(com.corrodinggames.rts.gameFramework.a.e.t, 0.3F, this.dH, this.dI); } public strictfp e(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     this.g = new Rect();
/*     */     S(25);
/*     */     T(35);
/*     */     this.bO = 15.0F;
/*     */     this.bP = this.bO + 0.0F;
/*     */     this.bZ = 260.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b;
/*     */     this.E = c;
/*     */     this.dJ = 0.0F;
/*     */     R(5); }
/*     */   public strictfp float m() { return 140.0F; } public strictfp float C() {
/* 327 */     return 0.2F; } public strictfp float b(int paramInt) { return 40.0F; } public strictfp float z() { if (this.dJ < 15.0F) return 0.0F;  return 1.4F; }
/*     */   public strictfp float A() { return 4.0F; }
/*     */   public strictfp float B() { return 0.4F; }
/*     */   public strictfp boolean bd() { return true; }
/*     */   public strictfp float c(int paramInt) { return 99.0F; }
/*     */   public strictfp boolean E() { return false; }
/* 333 */   public strictfp float D() { return 0.1F; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 341 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 347 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 355 */     return 15.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.e;
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
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ public class g
/*     */   extends h {
/*  21 */   float a = 0.0F;
/*     */   
/*  23 */   static e b = null;
/*     */   
/*  25 */   static e c = null;
/*     */ 
/*     */   
/*  28 */   static e d = null;
/*     */ 
/*     */   
/*  31 */   static e[] e = new e[10];
/*     */ 
/*     */   
/*     */   Rect f;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  38 */     return ak.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  43 */     l l = l.u();
/*     */     
/*  45 */     c = l.bw.a(R.drawable.hover_tank);
/*     */     
/*  47 */     b = l.bw.a(R.drawable.hover_tank_dead);
/*     */     
/*  49 */     d = l.bw.a(R.drawable.hover_tank_shadow);
/*     */ 
/*     */ 
/*     */     
/*  53 */     e = m.a(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  62 */     if (this.bz)
/*     */     {
/*  64 */       return b;
/*     */     }
/*  66 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  73 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  80 */     return null;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz || !bG())
/*     */       return;  this.a += 3.0F * paramFloat; if (this.a > 360.0F)
/*     */       this.a -= 360.0F;  this.dJ = f.a(this.dJ, 4.0F + f.h(this.a) * 1.5F, 0.1F * paramFloat); }
/*     */   public strictfp float q(int paramInt) { return 23.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt); PointF pointF2 = J(paramInt); f.K = pointF2.a; f.L = pointF2.b; f.ar = Color.a(255, 50, 230, 50); f.U = q(paramInt); f.l = paramaf; f.h = 85.0F; f.t = 2.0F; f.r = 6.0F; f.s = 0.2F; f.P = 6; f.x = 1.0F;
/*     */     l l = l.u();
/*     */     l.bz.a(pointF1.a, pointF1.b, this.dJ, -14483678);
/*     */     l.bz.a((w)f, -16716288);
/*     */     float f1 = 1.3F + f.c(-0.07F, 0.07F);
/*  90 */     l.bu.a(e.y, 0.3F, f1, pointF1.a, pointF1.b); } public strictfp boolean e() { this.D = b;
/*  91 */     R(0);
/*     */     
/*  93 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     a(u.b);
/*     */     
/* 101 */     return true; }
/*     */   
/*     */   public strictfp boolean E() {
/*     */     return false;
/*     */   }
/*     */   
/*     */   public strictfp g(boolean paramBoolean) {
/* 108 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 301 */     this.f = new Rect();
/*     */     b(c);
/*     */     this.bO = 7.0F;
/*     */     this.bP = this.bO + 2.0F;
/*     */     this.bZ = 150.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = c;
/*     */     this.E = d; } public strictfp float m() { return 140.0F; }
/*     */   public strictfp float b(int paramInt) { return 90.0F; }
/*     */   public strictfp float z() { return 1.0F; }
/* 311 */   public strictfp float f(boolean paramBoolean) { return (this.cn[0]).a + 90.0F; }
/*     */    public strictfp float A() {
/*     */     return 180.0F;
/*     */   } public strictfp void i(float paramFloat) {
/*     */     this.bL += paramFloat;
/*     */     if (this.bL > 180.0F)
/*     */       this.bL -= 360.0F; 
/*     */     if (this.bL < -180.0F)
/*     */       this.bL += 360.0F; 
/*     */   } public strictfp float C() {
/*     */     return 0.04F;
/*     */   } public strictfp float D() {
/*     */     return 0.09F;
/*     */   } public strictfp boolean c(float paramFloat) {
/* 325 */     return super.c(paramFloat);
/*     */   } public strictfp boolean bd() {
/*     */     return true;
/*     */   } public strictfp boolean be() {
/*     */     return true;
/*     */   } public strictfp float c(int paramInt) {
/*     */     return 4.0F;
/*     */   } public strictfp float w(int paramInt) {
/*     */     return 0.2F;
/*     */   } public strictfp boolean l() {
/* 335 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 342 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 348 */     return 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 355 */     return 0.5F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends f
/*     */ {
/*  25 */   static e a = null;
/*     */   
/*  27 */   static e b = null;
/*     */ 
/*     */ 
/*     */   
/*  31 */   static e[] c = new e[10];
/*     */ 
/*     */   
/*     */   Rect d;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  38 */     return ak.p;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/*  44 */     return 1500.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  50 */     l l = l.u();
/*     */     
/*  52 */     b = l.bw.a(R.drawable.gun_boat);
/*     */     
/*  54 */     a = l.bw.a(R.drawable.gun_boat_dead);
/*     */ 
/*     */ 
/*     */     
/*  58 */     c = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  66 */     if (this.bz)
/*     */     {
/*  68 */       return a;
/*     */     }
/*  70 */     return c[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  77 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  84 */     return null;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); }
/*     */   public strictfp float q(int paramInt) { return 12.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f1 = f.a((af)this, pointF1.a, pointF1.b); PointF pointF2 = J(paramInt); f1.K = pointF2.a; f1.L = pointF2.b; f1.dJ = this.dJ; f1.U = q(paramInt); f1.l = paramaf; f1.h = 30.0F; f1.t = 8.0F; f1.S = false; f1.ar = Color.a(255, 180, 180, 0); l l = l.u();
/*     */     l.bu.a(e.r, 0.2F, pointF1.a, pointF1.b);
/*     */     l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a);
/*  90 */     l.bz.a(pointF1.a, pointF1.b, this.dJ, -1118720); } public strictfp boolean e() { l l = l.u();
/*  91 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/*  93 */     this.D = a;
/*  94 */     R(0);
/*     */     
/*  96 */     this.by = false;
/*     */     
/*  98 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c(boolean paramBoolean) {
/* 105 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     this.d = new Rect(); S(15); T(27);
/*     */     this.bO = 12.0F;
/*     */     this.bP = this.bO - 2.0F;
/*     */     this.bZ = 170.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; } public strictfp float m() { return 120.0F; }
/*     */   public strictfp float b(int paramInt) { return 60.0F; }
/* 240 */   public strictfp boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */   
/*     */   public strictfp float z() {
/*     */     return 1.5F;
/*     */   }
/*     */   public strictfp float A() {
/*     */     return 2.8F;
/*     */   }
/*     */   public strictfp float B() {
/*     */     return 0.3F;
/*     */   }
/*     */   public strictfp float c(int paramInt) {
/*     */     return 99.0F;
/*     */   }
/*     */   public strictfp float C() {
/*     */     return 0.07F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.2F;
/*     */   }
/*     */   
/*     */   public strictfp boolean l() {
/* 262 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 269 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
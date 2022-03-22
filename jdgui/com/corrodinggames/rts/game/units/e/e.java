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
/*     */ import com.corrodinggames.rts.gameFramework.b.c;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends h
/*     */ {
/*  26 */   float a = 0.0F;
/*     */   
/*  28 */   static com.corrodinggames.rts.gameFramework.j.e b = null;
/*     */   
/*  30 */   static com.corrodinggames.rts.gameFramework.j.e c = null;
/*     */ 
/*     */   
/*  33 */   static com.corrodinggames.rts.gameFramework.j.e d = null;
/*     */ 
/*     */   
/*  36 */   static com.corrodinggames.rts.gameFramework.j.e[] e = new com.corrodinggames.rts.gameFramework.j.e[10];
/*     */ 
/*     */   
/*     */   Rect f;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  43 */     return ak.x;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  48 */     l l = l.u();
/*     */     
/*  50 */     c = l.bw.a(R.drawable.heavy_hover_tank);
/*     */     
/*  52 */     b = l.bw.a(R.drawable.heavy_hover_tank_dead);
/*     */     
/*  54 */     d = l.bw.a(R.drawable.heavy_hover_tank_shadow);
/*     */ 
/*     */ 
/*     */     
/*  58 */     e = m.a(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d() {
/*  67 */     if (this.bz)
/*     */     {
/*  69 */       return b;
/*     */     }
/*  71 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e k() {
/*  78 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d(int paramInt) {
/*  84 */     return null;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz || !bG())
/*     */       return;  this.a += 3.0F * paramFloat; if (this.a > 360.0F)
/*     */       this.a -= 360.0F;  this.dJ = f.a(this.dJ, 4.0F + f.h(this.a) * 1.5F, 0.1F * paramFloat); }
/*     */   public strictfp float q(int paramInt) { return 40.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt); PointF pointF2 = J(paramInt); f.K = pointF2.a; f.L = pointF2.b; f.ar = Color.a(255, 230, 0, 50); f.U = q(paramInt); f.l = paramaf; f.h = 95.0F; f.t = 1.0F; f.r = 7.0F; f.s = 0.2F; f.P = 7; f.x = 1.0F; l l = l.u(); com.corrodinggames.rts.gameFramework.b.e e1 = l.bz.a(pointF1.a, pointF1.b, this.dJ, -56798); if (e1 != null) {
/*     */       e1.F = 0.7F; e1.W = 30.0F; e1.X = e1.W; c.a(e1, (w)this);
/*  91 */     }  l.bz.a((w)f, -1179648); l.bu.a(com.corrodinggames.rts.gameFramework.a.e.y, 0.3F, pointF1.a, pointF1.b); } public strictfp boolean e() { l l = l.u();
/*     */ 
/*     */     
/*  94 */     this.D = b;
/*  95 */     R(0);
/*     */     
/*  97 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     a(u.c);
/*     */     
/* 107 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e(boolean paramBoolean) {
/* 113 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 306 */     this.f = new Rect(); S(24); T(36); this.bO = 11.0F;
/*     */     this.bP = this.bO + 2.0F;
/*     */     this.bZ = 450.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = c;
/*     */     this.E = d; } public strictfp boolean E() { return false; }
/*     */   public strictfp float m() { return 160.0F; }
/*     */   public strictfp float b(int paramInt) { return 75.0F; }
/* 314 */   public strictfp boolean bd() { return true; } public strictfp float z() { return 0.7F; }
/*     */   public strictfp float A() { return 20.0F; }
/*     */   public strictfp void i(float paramFloat) { this.bL += paramFloat; if (this.bL > 180.0F)
/*     */       this.bL -= 360.0F; 
/*     */     if (this.bL < -180.0F)
/*     */       this.bL += 360.0F;  }
/* 320 */   public strictfp boolean be() { return true; }
/*     */    public strictfp float C() {
/*     */     return 0.06F;
/*     */   } public strictfp float D() {
/*     */     return 0.09F;
/*     */   } public strictfp float c(int paramInt) {
/*     */     return 2.4F;
/*     */   } public strictfp float f(boolean paramBoolean) {
/* 328 */     return (this.cn[0]).a + 90.0F;
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
/*     */   public strictfp boolean c(float paramFloat) {
/* 342 */     return super.c(paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 352 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 359 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 365 */     return 16.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 372 */     super.e(paramFloat);
/* 373 */     float f = m();
/* 374 */     y.a((af)this, f);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.c;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ public class a extends f {
/*  23 */   static e a = null;
/*  24 */   static e b = null;
/*  25 */   static e c = null;
/*  26 */   static e d = null;
/*     */   
/*  28 */   static e[] e = new e[10];
/*     */   
/*     */   Rect f;
/*     */   
/*     */   public strictfp ak b() {
/*  33 */     return ak.u;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/*  40 */     return 9000.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  46 */     l l = l.u();
/*     */     
/*  48 */     b = l.bw.a(R.drawable.battle_ship_t2);
/*  49 */     a = l.bw.a(R.drawable.battle_ship_t2_dead);
/*  50 */     c = l.bw.a(R.drawable.battle_ship_t2_turret);
/*     */ 
/*     */     
/*  53 */     e = m.a(b);
/*     */     
/*  55 */     d = a(b, b.l(), b.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  64 */     if (this.bz)
/*     */     {
/*  66 */       return a;
/*     */     }
/*  68 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  74 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  81 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  86 */     return ((l.u()).by.renderExtraShadows && this.dJ > -2.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  90 */     return 3.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  94 */     return 3.0F;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); }
/*     */   public strictfp float q(int paramInt) { return 65.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); f f1 = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt); PointF pointF2 = J(paramInt); f1.K = pointF2.a; f1.L = pointF2.b; f1.U = q(paramInt); f1.l = paramaf; f1.h = 80.0F; f1.x = 2.0F; f1.t = 4.0F; f1.S = true; f1.ar = Color.a(255, 180, 180, 0); f1.aQ = true; l l = l.u(); l.bu.a(e.q, 0.2F, pointF1.a, pointF1.b); l.bz.a((w)f1, -1118720);
/*     */     e e1 = l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a);
/*     */     if (e1 != null)
/*     */       c.a(e1, (w)this); 
/* 101 */     l.bz.a(pointF1.a, pointF1.b, this.dJ, -1118720); } public strictfp boolean e() { l l = l.u();
/* 102 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 104 */     this.D = a;
/* 105 */     R(0);
/*     */     
/* 107 */     this.by = false;
/*     */     
/* 109 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp a(boolean paramBoolean) {
/* 116 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     this.f = new Rect(); b(b); this.bO = 20.0F; this.bP = this.bO; this.bZ = 1200.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; } public strictfp float m() { return 240.0F; }
/*     */   public strictfp float z() { return 0.8F; }
/*     */   public strictfp float aX() { return 1.0F; }
/* 272 */   public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 274 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 278 */     y.a((r)this);
/*     */     
/* 280 */     return true; } public strictfp float C(int paramInt) { if (this.bN && aX() > 0.95D) {
/*     */       if (paramInt == 0)
/*     */         return this.bL + 140.0F;  return this.bL - 140.0F;
/*     */     } 
/*     */     return this.bL; }
/*     */   public strictfp float A() { return 1.8F; }
/*     */   public strictfp float B() { return 0.08F; }
/* 287 */   public strictfp boolean l() { return true; } public strictfp float c(int paramInt) { return 2.5F; } public strictfp float w(int paramInt) { return 0.08F; } public strictfp float C() {
/*     */     return 0.03F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.1F;
/*     */   }
/*     */   public strictfp boolean ad() {
/* 294 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 300 */     return 15.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bg() {
/* 309 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF F(int paramInt) {
/*     */     float f3;
/* 316 */     PointF pointF = super.F(paramInt);
/* 317 */     float f1 = pointF.a;
/* 318 */     float f2 = pointF.b;
/*     */ 
/*     */     
/* 321 */     if (paramInt == 0) {
/*     */       
/* 323 */       f3 = 22.0F;
/*     */     }
/*     */     else {
/*     */       
/* 327 */       f3 = 4.0F;
/*     */     } 
/*     */     
/* 330 */     f1 += f.i(this.bL) * f3;
/* 331 */     f2 += f.h(this.bL) * f3;
/*     */     
/* 333 */     aU.a(f1, f2);
/* 334 */     return aU;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 341 */     return (120 - paramInt * 28);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 347 */     return (paramInt * 30);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 355 */     super.e(paramFloat);
/* 356 */     float f1 = m();
/* 357 */     y.a((af)this, f1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float G(int paramInt) {
/* 365 */     return -2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float H(int paramInt) {
/* 371 */     return 4.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float I(int paramInt) {
/* 377 */     return 12.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
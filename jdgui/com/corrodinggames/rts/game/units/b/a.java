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
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ public class a
/*     */   extends b
/*     */ {
/*  21 */   static e a = null;
/*  22 */   static e b = null;
/*  23 */   static e c = null;
/*  24 */   static e d = null;
/*  25 */   static e[] e = new e[10];
/*     */ 
/*     */   
/*     */   float f;
/*     */   
/*     */   Rect g;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  34 */     return ak.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  39 */     l l = l.u();
/*     */     
/*  41 */     b = l.bw.a(R.drawable.ship);
/*     */     
/*  43 */     c = l.bw.a(R.drawable.ship_shadow);
/*     */     
/*  45 */     a = l.bw.a(R.drawable.ship_dead);
/*     */ 
/*     */ 
/*     */     
/*  49 */     e = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  60 */     if (this.bz)
/*     */     {
/*  62 */       return a;
/*     */     }
/*  64 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  71 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  77 */     return d;
/*     */   } public strictfp boolean I() {
/*     */     return true;
/*     */   } public strictfp boolean i() {
/*     */     return true;
/*     */   }
/*  83 */   public strictfp boolean e() { l l = l.u();
/*  84 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */ 
/*     */     
/*  87 */     this.D = a;
/*     */     
/*  89 */     R(0);
/*     */     
/*  91 */     this.by = false;
/*     */     
/*  93 */     return true; }
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*     */     super.a(paramFloat);
/*     */     if (this.bz)
/*     */       return; 
/*     */     this.dJ = f.a(this.dJ, 20.0F, 0.3F * paramFloat);
/* 100 */   } public strictfp a(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     this.g = new Rect(); S(24); T(22); this.bO = 11.0F; this.bP = this.bO + 0.0F; this.bZ = 250.0F; this.bY = this.bZ;
/*     */     this.D = b;
/*     */     this.E = c;
/*     */     this.dJ = 0.0F;
/*     */     this.f = 0.18F;
/*     */     R(5); }
/*     */   public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt);
/*     */     f f = f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt);
/*     */     PointF pointF2 = J(paramInt);
/*     */     f.K = pointF2.a;
/*     */     f.L = pointF2.b;
/*     */     f.U = 30.0F;
/*     */     f.l = paramaf;
/*     */     f.h = 75.0F;
/*     */     f.t = 6.0F;
/*     */     f.x = 2.0F;
/*     */     f.y = 4.0F;
/*     */     f.ar = Color.a(250, 74, 232, 255);
/*     */     l l = l.u();
/*     */     e e1 = l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a);
/*     */     if (e1 != null)
/*     */       e1.ap = 10; 
/*     */     float f1 = 1.0F + f.c(-0.1F, 0.1F);
/*     */     l.bu.a(e.x, 0.14F, f1, pointF1.a, pointF1.b); }
/*     */   public strictfp float m() { return 170.0F; }
/*     */   public strictfp float b(int paramInt) { return 40.0F; }
/*     */   public strictfp float z() { if (this.dJ < 15.0F)
/*     */       return 0.0F; 
/* 305 */     return 2.4F; } public strictfp float C() { return 0.1F; } public strictfp float A() { return 3.7F; } public strictfp float B() {
/*     */     return 0.4F;
/*     */   }
/*     */   public strictfp float c(int paramInt) {
/*     */     return 3.7F;
/*     */   }
/* 311 */   public strictfp float D() { return 0.16F; } public strictfp boolean bh() { return false; } public strictfp float w(int paramInt) {
/*     */     return 0.4F;
/*     */   } public strictfp boolean E() {
/*     */     return false;
/*     */   } public strictfp float g(int paramInt) {
/*     */     return 10.0F;
/*     */   }
/*     */   public strictfp boolean l() {
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 326 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ae() {
/* 332 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bd() {
/* 339 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean be() {
/* 346 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float f(boolean paramBoolean) {
/* 353 */     return (this.cn[0]).a + 90.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
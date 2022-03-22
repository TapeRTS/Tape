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
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class o
/*     */   extends j
/*     */ {
/*  21 */   static e a = null;
/*     */   
/*  23 */   static e b = null;
/*  24 */   static e c = null;
/*     */   
/*  26 */   static e[] d = new e[10];
/*     */   
/*     */   Rect e;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  32 */     return ak.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  37 */     l l = l.u();
/*     */     
/*  39 */     b = l.bw.a(R.drawable.tank2);
/*     */     
/*  41 */     a = l.bw.a(R.drawable.tank2_dead);
/*     */     
/*  43 */     c = l.bw.a(R.drawable.tank2_turret);
/*     */     
/*  45 */     d = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  53 */     if (this.bz)
/*     */     {
/*  55 */       return a;
/*     */     }
/*  57 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  64 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  72 */     return c;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); } public strictfp void a(af paramaf, int paramInt) { PointF pointF = E(paramInt); f f = f.a((af)this, pointF.a, pointF.b); f.U = 35.0F; f.l = paramaf; f.h = 60.0F; f.t = 3.0F;
/*     */     l l = l.u();
/*     */     l.bz.a(pointF.a, pointF.b, this.dJ, -1127220);
/*     */     l.bz.a(pointF.a, pointF.b, this.dJ, (this.cn[paramInt]).a);
/*  78 */     l.bu.a(e.p, 0.3F, pointF.a, pointF.b); } public strictfp boolean e() { l l = l.u();
/*  79 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/*  81 */     this.D = a;
/*  82 */     R(0);
/*     */     
/*  84 */     this.by = false;
/*     */     
/*  86 */     l.bu.a(e.n, 0.8F, this.dH, this.dI);
/*     */ 
/*     */     
/*  89 */     bl();
/*     */ 
/*     */     
/*  92 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp o(boolean paramBoolean) {
/*  99 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     this.e = new Rect(); S(16); T(30);
/*     */     this.bO = 11.0F;
/*     */     this.bP = this.bO + 2.0F;
/*     */     this.bZ = 350.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; } public strictfp float m() { return 150.0F; }
/* 202 */   public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 204 */       return false;
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
/* 223 */     return true; }
/*     */   
/*     */   public strictfp float b(int paramInt) {
/*     */     return 70.0F;
/*     */   }
/*     */   public strictfp float z() {
/*     */     return 1.0F;
/*     */   }
/*     */   public strictfp float C() {
/* 232 */     return 0.07F;
/*     */   } public strictfp float A() {
/*     */     return 1.9F;
/*     */   } public strictfp float c(int paramInt) {
/*     */     return 3.0F;
/*     */   } public strictfp float D() {
/* 238 */     return 0.12F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 245 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 252 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 258 */     return 10.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
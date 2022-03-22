/*     */ package com.corrodinggames.rts.game.units.d.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.af;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class f
/*     */   extends c
/*     */ {
/*     */   strictfp f(b paramb) {
/* 291 */     super(paramb);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String c() {
/* 296 */     return b.u;
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
/*     */   public strictfp e d(int paramInt) {
/* 308 */     return b.dk();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp float a() {
/* 314 */     return 185.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(int paramInt) {
/* 320 */     return 20.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 326 */     return 44.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 332 */     return 21.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF c(int paramInt) {
/* 338 */     PointF pointF = b.b(this.b, paramInt);
/*     */     
/* 340 */     float f1 = this.b.E() ? this.b.bL : (this.b.cn[paramInt]).a;
/* 341 */     f1 += ((this.b.k == 1) ? -90 : 90);
/*     */     
/* 343 */     pointF.a += com.corrodinggames.rts.gameFramework.f.i(f1) * 4.0F;
/* 344 */     pointF.b += com.corrodinggames.rts.gameFramework.f.h(f1) * 4.0F;
/*     */     
/* 346 */     return pointF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 352 */     PointF pointF1 = c(paramInt);
/* 353 */     com.corrodinggames.rts.game.f f1 = com.corrodinggames.rts.game.f.a((af)this.b, pointF1.a, pointF1.b);
/*     */     
/* 355 */     PointF pointF2 = this.b.J(paramInt);
/*     */     
/* 357 */     f1.K = pointF2.a;
/* 358 */     f1.L = pointF2.b;
/*     */     
/* 360 */     f1.l = paramaf;
/* 361 */     f1.h = 60.0F;
/*     */     
/* 363 */     f1.t = 6.0F;
/* 364 */     f1.ar = Color.a(255, 40, 30, 110);
/* 365 */     f1.U = b(paramInt);
/*     */     
/* 367 */     f1.P = 5;
/* 368 */     f1.x = 1.0F;
/*     */     
/* 370 */     l l = l.u();
/* 371 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, -1127220);
/* 372 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, (this.b.cn[paramInt]).a);
/*     */     
/* 374 */     float f2 = 1.0F + com.corrodinggames.rts.gameFramework.f.c(-0.07F, 0.07F);
/*     */     
/* 376 */     l.bu.a(e.s, 0.3F, f2, pointF1.a, pointF1.b);
/* 377 */     this.b.k = (this.b.k == 1) ? 0 : 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/* 386 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(c paramc) {
/* 392 */     this.b.bZ += 400.0F;
/* 393 */     this.b.bY += 400.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 400 */     this.b.r(paramFloat);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\a\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
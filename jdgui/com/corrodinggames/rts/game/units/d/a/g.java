/*     */ package com.corrodinggames.rts.game.units.d.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class g
/*     */   extends c
/*     */ {
/*     */   strictfp g(b paramb) {
/* 406 */     super(paramb);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String c() {
/* 411 */     return b.v;
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
/* 423 */     return b.dl();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp float a() {
/* 429 */     return 320.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(int paramInt) {
/* 435 */     return 13.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 441 */     return 40.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF c(int paramInt) {
/* 447 */     PointF pointF = b.c(this.b, paramInt);
/*     */     
/* 449 */     float f = this.b.E() ? this.b.bL : (this.b.cn[paramInt]).a;
/* 450 */     f += ((this.b.k == 1) ? -90 : 90);
/*     */     
/* 452 */     pointF.a += f.i(f) * 4.0F;
/* 453 */     pointF.b += f.h(f) * 4.0F;
/*     */     
/* 455 */     return pointF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 461 */     PointF pointF1 = c(paramInt);
/* 462 */     f f = f.a((af)this.b, pointF1.a, pointF1.b);
/*     */     
/* 464 */     PointF pointF2 = this.b.J(paramInt);
/*     */     
/* 466 */     f.K = pointF2.a;
/* 467 */     f.L = pointF2.b;
/*     */     
/* 469 */     f.l = paramaf;
/* 470 */     f.h = 60.0F;
/*     */     
/* 472 */     f.t = 9.0F;
/* 473 */     f.ar = Color.a(255, 180, 30, 30);
/* 474 */     f.U = b(paramInt);
/*     */     
/* 476 */     f.P = 5;
/* 477 */     f.x = 1.0F;
/*     */     
/* 479 */     l l = l.u();
/* 480 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, -1127220);
/* 481 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, (this.b.cn[paramInt]).a);
/*     */     
/* 483 */     float f1 = 1.0F + f.c(-0.07F, 0.07F);
/*     */     
/* 485 */     l.bu.a(e.s, 0.15F, f1, pointF1.a, pointF1.b);
/* 486 */     this.b.k = (this.b.k == 1) ? 0 : 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 493 */     if (this.b.bY < this.b.bZ) {
/*     */       
/* 495 */       this.b.bY += 0.1F * paramFloat;
/* 496 */       if (this.b.bY > this.b.bZ)
/*     */       {
/* 498 */         this.b.bY = this.b.bZ;
/*     */       }
/*     */     } 
/*     */     
/* 502 */     this.b.r(paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/* 508 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(c paramc) {
/* 514 */     if (!(paramc instanceof f)) {
/*     */       
/* 516 */       this.b.bZ += 400.0F;
/* 517 */       this.b.bY += 400.0F;
/*     */     } 
/*     */     
/* 520 */     this.b.bZ += 2800.0F;
/* 521 */     this.b.bY += 2800.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
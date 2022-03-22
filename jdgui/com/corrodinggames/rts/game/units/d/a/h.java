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
/*     */ class h
/*     */   extends c
/*     */ {
/*     */   strictfp h(b paramb) {
/* 194 */     super(paramb);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String c() {
/* 199 */     return b.t;
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
/* 211 */     return b.dj();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp float a() {
/* 217 */     return 165.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 223 */     return 41.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(int paramInt) {
/* 229 */     return 30.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 235 */     return 21.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 241 */     PointF pointF1 = c(paramInt);
/* 242 */     f f = f.a((af)this.b, pointF1.a, pointF1.b);
/*     */     
/* 244 */     PointF pointF2 = this.b.J(paramInt);
/*     */     
/* 246 */     f.K = pointF2.a;
/* 247 */     f.L = pointF2.b;
/*     */     
/* 249 */     f.l = paramaf;
/* 250 */     f.h = 60.0F;
/*     */     
/* 252 */     f.t = 5.0F;
/* 253 */     f.ar = Color.a(255, 100, 30, 30);
/* 254 */     f.U = b(paramInt);
/*     */     
/* 256 */     f.P = 5;
/* 257 */     f.x = 1.0F;
/*     */     
/* 259 */     l l = l.u();
/* 260 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, -1127220);
/* 261 */     l.bz.a(pointF1.a, pointF1.b, this.b.dJ, (this.b.cn[paramInt]).a);
/*     */ 
/*     */     
/* 264 */     float f1 = 1.0F + f.c(-0.07F, 0.07F);
/*     */     
/* 266 */     l.bu.a(e.s, 0.3F, f1, pointF1.a, pointF1.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/* 273 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(c paramc) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 286 */     this.b.r(paramFloat);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
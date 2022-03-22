/*     */ package com.corrodinggames.rts.game.units.f;
/*     */ 
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class g
/*     */   extends e
/*     */ {
/*  91 */   public RectF a = new RectF();
/*     */   
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   public float e;
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  99 */     this.b = paramFloat1;
/* 100 */     this.c = paramFloat3;
/* 101 */     this.d = paramFloat2;
/* 102 */     this.e = paramFloat4;
/* 103 */     this.a.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a(af paramaf) {
/* 109 */     float f1 = paramaf.dH;
/* 110 */     float f2 = paramaf.dI;
/*     */     
/* 112 */     return (this.b <= f1 && f1 <= this.c && this.d <= f2 && f2 <= this.e);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
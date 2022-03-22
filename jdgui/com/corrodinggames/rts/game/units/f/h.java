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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class h
/*     */   extends e
/*     */ {
/* 121 */   public RectF a = new RectF();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c;
/*     */ 
/*     */ 
/*     */   
/*     */   public float d;
/*     */ 
/*     */ 
/*     */   
/*     */   public float e;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a(af paramaf) {
/* 145 */     float f1 = paramaf.bO;
/* 146 */     float f2 = paramaf.dH;
/* 147 */     float f3 = paramaf.dI;
/*     */     
/* 149 */     return (this.b - f1 <= f2 && f2 <= this.c + f1 && this.d - f1 <= f3 && f3 <= this.e + f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.f;
/*     */ 
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class d
/*     */   extends e
/*     */ {
/* 157 */   public RectF a = new RectF();
/*     */ 
/*     */ 
/*     */   
/*     */   public float b;
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
/*     */   public float f;
/*     */ 
/*     */   
/*     */   public float g;
/*     */ 
/*     */   
/*     */   public float h;
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a(af paramaf) {
/* 188 */     float f1 = paramaf.dH;
/* 189 */     float f2 = paramaf.dI;
/*     */     
/* 191 */     if (this.b <= f1 && f1 <= this.c && this.d <= f2 && f2 <= this.e) {
/*     */ 
/*     */       
/* 194 */       float f = f.a(this.f, this.g, f1, f2);
/* 195 */       return (f < this.h);
/*     */     } 
/* 197 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
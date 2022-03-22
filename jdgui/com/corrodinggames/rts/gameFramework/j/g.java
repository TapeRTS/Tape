/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Matrix;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   implements h
/*     */ {
/*     */   public Canvas a;
/*     */   boolean b;
/*     */   
/*     */   public void a(Rect paramRect) {
/*     */     this.a.a(paramRect);
/*     */   }
/*     */   
/*     */   public void a(RectF paramRectF) {
/*     */     this.a.a(paramRectF);
/*     */   }
/*     */   
/*     */   public void a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, Paint paramPaint) {
/*     */     this.a.a(paramBitmap, paramFloat1, paramFloat2, paramPaint);
/*     */   }
/*     */   
/*     */   public void a(Bitmap paramBitmap, Matrix paramMatrix, Paint paramPaint) {
/*     */     this.a.a(paramBitmap, paramMatrix, paramPaint);
/*     */   }
/*     */   
/*     */   public void a(Bitmap paramBitmap, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/*     */     this.a.a(paramBitmap, paramRect1, paramRect2, paramPaint);
/*     */   }
/*     */   
/*     */   public void a(Bitmap paramBitmap, Rect paramRect, RectF paramRectF, Paint paramPaint) {
/*     */     this.a.a(paramBitmap, paramRect, paramRectF, paramPaint);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/*     */     this.a.a(paramFloat1, paramFloat2, paramFloat3, paramPaint);
/*     */   }
/*     */   
/*     */   public void a(int paramInt, PorterDuff.Mode paramMode) {
/*     */     this.a.a(paramInt, paramMode);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*     */     this.a.a(paramInt);
/*     */   }
/*     */   
/*     */   public g(Canvas paramCanvas) {
/* 511 */     this.b = false; this.a = paramCanvas;
/*     */   }
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Paint paramPaint) { this.a.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramPaint); }
/*     */   public void a(float[] paramArrayOffloat, int paramInt1, int paramInt2, Paint paramPaint) { this.a.a(paramArrayOffloat, paramInt1, paramInt2, paramPaint); }
/* 515 */   public void a(Rect paramRect, Paint paramPaint) { this.a.a(paramRect, paramPaint); } public void a(RectF paramRectF, Paint paramPaint) { this.a.a(paramRectF, paramPaint); } public void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint) { this.a.a(paramString, paramFloat1, paramFloat2, paramPaint); } public boolean equals(Object paramObject) { return this.a.equals(paramObject); } public void a(boolean paramBoolean) { this.b = paramBoolean; }
/*     */   public int hashCode() { return this.a.hashCode(); } public void a() {
/*     */     this.a.b();
/*     */   } public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     this.a.a(paramFloat1, paramFloat2, paramFloat3);
/*     */   } public boolean c() {
/* 521 */     return this.b; } public void b() { this.a.a(); }
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.a.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4); }
/*     */   public void a(float paramFloat1, float paramFloat2) { this.a.b(paramFloat1, paramFloat2); }
/*     */   public void a(Bitmap paramBitmap) { this.a.a(paramBitmap); }
/*     */   public String toString() { return this.a.toString(); }
/*     */   public void b(float paramFloat1, float paramFloat2) { this.a.a(paramFloat1, paramFloat2); }
/* 527 */   public void a(i parami) { parami.a((l.u()).bw); }
/*     */ 
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
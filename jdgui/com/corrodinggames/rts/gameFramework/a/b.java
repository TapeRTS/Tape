/*     */ package com.corrodinggames.rts.gameFramework.a;
/*     */ 
/*     */ import android.util.Log;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends i
/*     */ {
/*     */   a a;
/*  79 */   int b = -1;
/*     */ 
/*     */   
/*     */   public b(a parama, String paramString, h paramh) {
/*  83 */     super(paramString, paramh);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3) {
/*  90 */     c c = (c)this.c.c.a();
/*  91 */     if (c == null) {
/*     */       return;
/*     */     }
/*     */     
/*  95 */     c.b = paramFloat1;
/*  96 */     c.c = paramFloat2;
/*  97 */     c.d = paramInt1;
/*  98 */     c.e = paramInt2;
/*  99 */     c.f = paramFloat3;
/* 100 */     c.a = this;
/*     */     
/* 102 */     this.c.a.offer(c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3) {
/* 108 */     if (this.b == 0) {
/*     */       
/* 110 */       Log.d("RustedWarfare", "Sound not loaded");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 117 */     this.a.f.play(this.b, paramFloat1, paramFloat2, paramInt1, paramInt2, paramFloat3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 124 */     return 0;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.a.h;
/*     */ import com.corrodinggames.rts.gameFramework.a.i;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.java.audio.Sound;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class p
/*     */   extends i
/*     */ {
/*     */   Sound a;
/*     */   
/*     */   public p(n paramn, String paramString, h paramh) {
/*  81 */     super(paramString, paramh);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3) {
/*  87 */     o o = (o)this.b.c.a();
/*  88 */     if (o == null) {
/*     */       return;
/*     */     }
/*     */     
/*  92 */     o.b = paramFloat1;
/*  93 */     o.c = paramFloat2;
/*  94 */     o.d = paramInt1;
/*  95 */     o.e = paramInt2;
/*  96 */     o.f = paramFloat3;
/*  97 */     o.a = this;
/*  98 */     this.b.b.offer(o);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3) {
/* 105 */     if (this.a == null) {
/*     */       
/* 107 */       l.d("Sound not loaded");
/*     */       return;
/*     */     } 
/* 110 */     synchronized (this.b.b()) {
/*     */       
/* 112 */       float f1 = 0.0F;
/* 113 */       float f2 = f.f(paramFloat1, paramFloat2);
/* 114 */       this.a.play(f2, paramFloat3, f1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 121 */     return this.a.getBytesUsed();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.h;
/*     */ 
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
/*     */ public final class i
/*     */ {
/*     */   int a;
/*     */   int b;
/*     */   public static int c;
/*     */   final a d;
/*  23 */   final d e = new d();
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp i() {
/*  28 */     char c = 'Ϩ';
/*  29 */     this.d = new a(c + 100);
/*  30 */     for (byte b = 0; b < c; b++)
/*     */     {
/*  32 */       this.d.a(new j());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   strictfp j a() {
/*  38 */     if (this.d.b == 0) {
/*     */       
/*  40 */       c++;
/*  41 */       return new j();
/*     */     } 
/*  43 */     return this.d.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   final strictfp void a(j paramj) {
/*  49 */     if (paramj != null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  58 */       this.d.b(paramj);
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp void b() {
/*  81 */     if (this.d.size() > 50000) {
/*     */       
/*  83 */       l.d("PathOpenList: resetPool:memoryPool over 50000 clearing");
/*  84 */       this.d.clear();
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
/*  95 */     this.e.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt1, int paramInt2) {
/* 101 */     b();
/* 102 */     this.a = paramInt1;
/* 103 */     this.b = paramInt2;
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp void a(int paramInt, short paramShort1, short paramShort2) {
/* 108 */     j j = a();
/* 109 */     j.a(paramShort1, paramShort2);
/* 110 */     j.a(paramInt, this.a, this.b);
/* 111 */     this.e.a(j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp j c() {
/* 117 */     j j = this.e.a();
/*     */     
/* 119 */     if (j != null)
/*     */     {
/* 121 */       a(j);
/*     */     }
/*     */     
/* 124 */     return j;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
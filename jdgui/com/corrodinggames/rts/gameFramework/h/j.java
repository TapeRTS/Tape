/*     */ package com.corrodinggames.rts.gameFramework.h;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class j
/*     */   implements Comparable
/*     */ {
/*     */   public short a;
/*     */   public short b;
/*     */   public int c;
/*     */   
/*     */   public final strictfp void a(short paramShort1, short paramShort2) {
/*  15 */     this.a = paramShort1;
/*  16 */     this.b = paramShort2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp void a(int paramInt1, int paramInt2, int paramInt3) {
/*  54 */     int i = paramInt2 - this.a;
/*  55 */     int k = paramInt3 - this.b;
/*  56 */     i = (i > 0) ? i : -i;
/*  57 */     k = (k > 0) ? k : -k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     int m = paramInt1 + (i + k) * 11 + f.c(i, k) * -7;
/*     */ 
/*     */     
/*  74 */     this.c = m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp int a(j paramj) {
/*  83 */     if (this.c == paramj.c) {
/*     */ 
/*     */ 
/*     */       
/*  87 */       if (this.a - paramj.a != 0)
/*     */       {
/*  89 */         return this.a - paramj.a;
/*     */       }
/*  91 */       return this.b - paramj.b;
/*     */     } 
/*     */     
/*  94 */     return this.c - paramj.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String toString() {
/* 100 */     return "PathOpenListNode [x=" + this.a + ", y=" + this.b + ", score=" + this.c + "]";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
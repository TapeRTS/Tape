/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ac
/*     */ {
/*     */   String a;
/*     */   String b;
/*     */   
/*     */   public ac(String paramString1, String paramString2) {
/*  76 */     this.a = paramString1;
/*  77 */     this.b = paramString2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  86 */     return "[" + this.a + "]" + this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  92 */     if (!(paramObject instanceof ac))
/*     */     {
/*  94 */       return false;
/*     */     }
/*  96 */     ac ac1 = (ac)paramObject;
/*  97 */     return (this.b.equals(ac1.b) && this.a.equals(ac1.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 102 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String b() {
/* 107 */     return this.b;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.d;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/*     */   String a;
/*     */   String b;
/*     */   long c;
/*     */   String d;
/*  77 */   public int e = -1;
/*     */ 
/*     */   
/*  80 */   public int f = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  85 */     return (int)(System.currentTimeMillis() - this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  90 */     char c = '㚰';
/*     */     
/*  92 */     l l = l.u();
/*     */ 
/*     */     
/*  95 */     if (l.a())
/*     */     {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     if (this.c + c > System.currentTimeMillis())
/*     */     {
/* 102 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 107 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
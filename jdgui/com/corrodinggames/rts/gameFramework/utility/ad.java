/*    */ package com.corrodinggames.rts.gameFramework.utility;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ad
/*    */ {
/*    */   private final Object[] a;
/*    */   private int b;
/*    */   private final boolean c = false;
/*    */   
/*    */   public ad(int paramInt) {
/* 17 */     if (paramInt <= 0)
/*    */     {
/* 19 */       throw new IllegalArgumentException("The max pool size must be > 0");
/*    */     }
/* 21 */     this.a = new Object[paramInt];
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Object a() {
/* 27 */     if (this.b > 0) {
/* 28 */       int i = this.b - 1;
/* 29 */       Object object = this.a[i];
/* 30 */       this.a[i] = null;
/* 31 */       this.b--;
/* 32 */       return object;
/*    */     } 
/* 34 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(Object paramObject) {
/* 45 */     if (this.b < this.a.length) {
/*    */       
/* 47 */       this.a[this.b] = paramObject;
/* 48 */       this.b++;
/* 49 */       return true;
/*    */     } 
/* 51 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
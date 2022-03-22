/*    */ package com.a.a.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/* 31 */   private static Object[] a = new Object[0];
/*    */   
/* 33 */   private static Object[] b = new Object[73];
/*    */ 
/*    */ 
/*    */   
/*    */   public static int a(int paramInt) {
/* 38 */     for (byte b = 4; b < 32; b++) {
/* 39 */       if (paramInt <= (1 << b) - 12)
/* 40 */         return (1 << b) - 12; 
/*    */     } 
/* 42 */     return paramInt;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int b(int paramInt) {
/* 54 */     return a(paramInt * 2) / 2;
/*    */   }
/*    */   
/*    */   public static int c(int paramInt) {
/* 58 */     return a(paramInt * 4) / 4;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\a\a\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
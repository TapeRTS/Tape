/*    */ package android.util;
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
/*    */ class a
/*    */ {
/* 20 */   static final boolean[] a = new boolean[0];
/* 21 */   static final int[] b = new int[0];
/* 22 */   static final long[] c = new long[0];
/* 23 */   static final Object[] d = new Object[0];
/*    */ 
/*    */   
/*    */   static int a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 27 */     int i = 0;
/* 28 */     int j = paramInt1 - 1;
/*    */     
/* 30 */     while (i <= j) {
/* 31 */       int k = i + j >>> 1;
/* 32 */       int m = paramArrayOfint[k];
/*    */       
/* 34 */       if (m < paramInt2) {
/* 35 */         i = k + 1; continue;
/* 36 */       }  if (m > paramInt2) {
/* 37 */         j = k - 1; continue;
/*    */       } 
/* 39 */       return k;
/*    */     } 
/*    */     
/* 42 */     return i ^ 0xFFFFFFFF;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\androi\\util\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
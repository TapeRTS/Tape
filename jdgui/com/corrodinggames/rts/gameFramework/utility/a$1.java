/*    */ package com.corrodinggames.rts.gameFramework.utility;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ final class a$1
/*    */   implements Comparator
/*    */ {
/*    */   a$1(Thread paramThread) {}
/*    */   
/*    */   public int a(Thread paramThread1, Thread paramThread2) {
/* 62 */     if (paramThread1 == paramThread2)
/* 63 */       return 0; 
/* 64 */     if (paramThread1 == this.a)
/* 65 */       return 1; 
/* 66 */     if (paramThread2 == this.a)
/* 67 */       return -1; 
/* 68 */     return paramThread2.getName().compareTo(paramThread1.getName());
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\a$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
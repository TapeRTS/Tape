/*    */ package com.corrodinggames.rts.gameFramework.utility;
/*    */ 
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ 
/*    */ 
/*    */ public class ah
/*    */ {
/*  8 */   ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
/*    */ 
/*    */   
/*    */   public void a(Runnable paramRunnable) {
/* 12 */     this.a.add(paramRunnable);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/*    */     while (true) {
/* 20 */       Runnable runnable = this.a.poll();
/* 21 */       if (runnable == null) {
/*    */         break;
/*    */       }
/*    */       
/* 25 */       runnable.run();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
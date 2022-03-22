/*    */ package com.corrodinggames.rts.java;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.l;
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
/*    */ public class q
/*    */   extends Thread
/*    */ {
/*    */   public q(n paramn) {}
/*    */   
/*    */   public void run() {
/* 44 */     l.ag();
/*    */ 
/*    */     
/*    */     try {
/*    */       while (true) {
/* 49 */         o o = this.a.b.take();
/* 50 */         o.a();
/* 51 */         this.a.c.a(o);
/*    */       }
/*    */     
/* 54 */     } catch (InterruptedException interruptedException) {
/*    */       return;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
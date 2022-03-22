/*    */ package com.corrodinggames.rts.gameFramework.a;
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
/*    */ public class d
/*    */   extends Thread
/*    */ {
/*    */   public d(a parama) {}
/*    */   
/*    */   public void run() {
/* 39 */     l.ag();
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/*    */       while (true) {
/* 45 */         c c = this.a.a.take();
/* 46 */         c.a();
/* 47 */         this.a.c.a(c);
/*    */       }
/*    */     
/* 50 */     } catch (InterruptedException interruptedException) {
/*    */       return;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\a\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
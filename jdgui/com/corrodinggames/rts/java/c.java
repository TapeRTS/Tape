/*    */ package com.corrodinggames.rts.java;
/*    */ 
/*    */ import org.lwjgl.opengl.Display;
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
/*    */ public class c
/*    */   extends Thread
/*    */ {
/*    */   public c(b paramb) {}
/*    */   
/*    */   public void run() {
/*    */     while (true) {
/*    */       try {
/* 58 */         Thread.sleep(1L);
/* 59 */       } catch (InterruptedException interruptedException) {}
/*    */ 
/*    */       
/* 62 */       Display.processMessages();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
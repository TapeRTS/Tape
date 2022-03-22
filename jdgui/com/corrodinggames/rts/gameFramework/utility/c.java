/*    */ package com.corrodinggames.rts.gameFramework.utility;
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
/*    */ class c
/*    */   extends Throwable
/*    */ {
/*    */   private c(b paramb, c paramc) {
/* 28 */     super(b.a(paramb), paramc);
/*    */   }
/*    */ 
/*    */   
/*    */   public Throwable fillInStackTrace() {
/* 33 */     setStackTrace(b.b(this.a));
/* 34 */     return this;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
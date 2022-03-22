/*    */ package com.corrodinggames.rts.gameFramework.utility;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ class b
/*    */   implements Serializable
/*    */ {
/*    */   private final String a;
/*    */   private final StackTraceElement[] b;
/*    */   
/*    */   private b(String paramString, StackTraceElement[] paramArrayOfStackTraceElement) {
/* 39 */     this.a = paramString;
/* 40 */     this.b = paramArrayOfStackTraceElement;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.corrodinggames.rts.java.c;
/*    */ 
/*    */ import com.corrodinggames.librocket.e;
/*    */ import com.corrodinggames.librocket.scripts.Root;
/*    */ import com.corrodinggames.librocket.scripts.ScriptEngine;
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
/*    */ class a$1
/*    */   implements Runnable
/*    */ {
/*    */   a$1(a parama) {}
/*    */   
/*    */   public void run() {
/* 44 */     Root root = ScriptEngine.getInstance().getRoot();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     e e = new e("Join", this.a);
/* 51 */     root.showPopupWithButtons("Invite", "'" + this.a.b + "' has invited you to join a game", true, e, null);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\a$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
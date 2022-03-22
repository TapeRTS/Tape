/*    */ package com.corrodinggames.rts.java.c;
/*    */ 
/*    */ import com.codedisaster.steamworks.SteamID;
/*    */ import com.corrodinggames.librocket.scripts.Root;
/*    */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements Runnable
/*    */ {
/*    */   b a;
/*    */   String b;
/*    */   SteamID c;
/*    */   SteamID d;
/*    */   long e;
/*    */   Thread f;
/*    */   
/*    */   public a(b paramb, SteamID paramSteamID1, SteamID paramSteamID2, long paramLong) {
/* 23 */     this.a = paramb;
/*    */     
/* 25 */     this.c = paramSteamID1;
/* 26 */     this.d = paramSteamID2;
/* 27 */     this.e = paramLong;
/*    */     
/* 29 */     this.b = paramb.c.getFriendPersonaName(paramSteamID1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 34 */     if (this.f != null)
/*    */     {
/* 36 */       throw new RuntimeException("already started");
/*    */     }
/*    */     
/* 39 */     a$1 a$1 = new a$1(this);
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
/* 56 */     ScriptEngine.getInstance().addRunnableToQueue(a$1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 63 */     l.d("Join clicked");
/*    */     
/* 65 */     Root root = ScriptEngine.getInstance().getRoot();
/* 66 */     root.closePopup();
/*    */     
/* 68 */     l l = l.u();
/*    */ 
/*    */ 
/*    */     
/* 72 */     this.a.d.joinLobby(this.d);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
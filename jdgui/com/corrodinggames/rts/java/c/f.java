/*    */ package com.corrodinggames.rts.java.c;
/*    */ 
/*    */ import com.codedisaster.steamworks.SteamID;
/*    */ import com.codedisaster.steamworks.SteamNetworking;
/*    */ import com.codedisaster.steamworks.SteamNetworkingCallback;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class f
/*    */   implements SteamNetworkingCallback
/*    */ {
/*    */   b a;
/*    */   
/*    */   public f(b paramb) {
/* 18 */     this.a = paramb;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onP2PSessionConnectFail(SteamID paramSteamID, SteamNetworking.P2PSessionError paramP2PSessionError) {
/* 28 */     l.d("onP2PSessionConnectFail:" + paramP2PSessionError);
/*    */ 
/*    */     
/* 31 */     i i = (i)this.a.l.get(paramSteamID);
/*    */     
/* 33 */     if (i != null)
/*    */     {
/* 35 */       if (!i.isClosed()) {
/*    */         
/* 37 */         l.d("onP2PSessionConnectFail: closing active socket");
/*    */ 
/*    */ 
/*    */         
/*    */         try {
/* 42 */           i.close();
/*    */         }
/* 44 */         catch (IOException iOException) {
/*    */           
/* 46 */           iOException.printStackTrace();
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onP2PSessionRequest(SteamID paramSteamID) {
/* 56 */     l.d("onP2PSessionRequest:" + paramSteamID);
/*    */     
/* 58 */     this.a.h.acceptP2PSessionWithUser(paramSteamID);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
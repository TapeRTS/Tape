/*    */ package com.codedisaster.steamworks;
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
/*    */ public class SteamNetworking$P2PSessionState
/*    */ {
/*    */   byte connectionActive;
/*    */   byte connecting;
/*    */   byte sessionError;
/*    */   byte usingRelay;
/*    */   int bytesQueuedForSend;
/*    */   int packetsQueuedForSend;
/*    */   int remoteIP;
/*    */   short remotePort;
/*    */   
/*    */   public boolean isConnectionActive() {
/* 48 */     return (this.connectionActive != 0);
/*    */   }
/*    */   
/*    */   public boolean isConnecting() {
/* 52 */     return (this.connecting != 0);
/*    */   }
/*    */   
/*    */   public SteamNetworking$P2PSessionError getLastSessionError() {
/* 56 */     return SteamNetworking$P2PSessionError.byOrdinal(this.sessionError);
/*    */   }
/*    */   
/*    */   public boolean isUsingRelay() {
/* 60 */     return (this.usingRelay != 0);
/*    */   }
/*    */   
/*    */   public int getBytesQueuedForSend() {
/* 64 */     return this.bytesQueuedForSend;
/*    */   }
/*    */   
/*    */   public int getPacketsQueuedForSend() {
/* 68 */     return this.packetsQueuedForSend;
/*    */   }
/*    */   
/*    */   public int getRemoteIP() {
/* 72 */     return this.remoteIP;
/*    */   }
/*    */   
/*    */   public short getRemotePort() {
/* 76 */     return this.remotePort;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNetworking$P2PSessionState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
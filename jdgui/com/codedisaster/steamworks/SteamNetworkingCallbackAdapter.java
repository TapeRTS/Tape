/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamNetworkingCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamNetworkingCallbackAdapter(SteamNetworkingCallback paramSteamNetworkingCallback) {
/*  7 */     super(paramSteamNetworkingCallback);
/*    */   }
/*    */   
/*    */   void onP2PSessionConnectFail(long paramLong, int paramInt) {
/* 11 */     SteamID steamID = new SteamID(paramLong);
/* 12 */     ((SteamNetworkingCallback)this.callback).onP2PSessionConnectFail(steamID, SteamNetworking$P2PSessionError.byOrdinal(paramInt));
/*    */   }
/*    */   
/*    */   void onP2PSessionRequest(long paramLong) {
/* 16 */     SteamID steamID = new SteamID(paramLong);
/* 17 */     ((SteamNetworkingCallback)this.callback).onP2PSessionRequest(steamID);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNetworkingCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
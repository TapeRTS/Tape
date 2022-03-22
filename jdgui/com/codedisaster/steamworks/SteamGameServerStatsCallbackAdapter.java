/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamGameServerStatsCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamGameServerStatsCallbackAdapter(SteamGameServerStatsCallback paramSteamGameServerStatsCallback) {
/*  7 */     super(paramSteamGameServerStatsCallback);
/*    */   }
/*    */   
/*    */   void onStatsReceived(int paramInt, long paramLong) {
/* 11 */     ((SteamGameServerStatsCallback)this.callback).onStatsReceived(SteamResult.byValue(paramInt), new SteamID(paramLong));
/*    */   }
/*    */   
/*    */   void onStatsStored(int paramInt, long paramLong) {
/* 15 */     ((SteamGameServerStatsCallback)this.callback).onStatsStored(SteamResult.byValue(paramInt), new SteamID(paramLong));
/*    */   }
/*    */   
/*    */   void onStatsUnloaded(long paramLong) {
/* 19 */     ((SteamGameServerStatsCallback)this.callback).onStatsUnloaded(new SteamID(paramLong));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerStatsCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamUserStatsCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamUserStatsCallbackAdapter(SteamUserStatsCallback paramSteamUserStatsCallback) {
/*  7 */     super(paramSteamUserStatsCallback);
/*    */   }
/*    */   
/*    */   void onUserStatsReceived(long paramLong1, long paramLong2, int paramInt) {
/* 11 */     ((SteamUserStatsCallback)this.callback).onUserStatsReceived(paramLong1, new SteamID(paramLong2), SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onUserStatsStored(long paramLong, int paramInt) {
/* 15 */     ((SteamUserStatsCallback)this.callback).onUserStatsStored(paramLong, SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onUserStatsUnloaded(long paramLong) {
/* 19 */     ((SteamUserStatsCallback)this.callback).onUserStatsUnloaded(new SteamID(paramLong));
/*    */   }
/*    */ 
/*    */   
/*    */   void onUserAchievementStored(long paramLong, boolean paramBoolean, String paramString, int paramInt1, int paramInt2) {
/* 24 */     ((SteamUserStatsCallback)this.callback).onUserAchievementStored(paramLong, paramBoolean, paramString, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   void onLeaderboardFindResult(long paramLong, boolean paramBoolean) {
/* 28 */     ((SteamUserStatsCallback)this.callback).onLeaderboardFindResult(new SteamLeaderboardHandle(paramLong), paramBoolean);
/*    */   }
/*    */   
/*    */   void onLeaderboardScoresDownloaded(long paramLong1, long paramLong2, int paramInt) {
/* 32 */     ((SteamUserStatsCallback)this.callback).onLeaderboardScoresDownloaded(new SteamLeaderboardHandle(paramLong1), new SteamLeaderboardEntriesHandle(paramLong2), paramInt);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   void onLeaderboardScoreUploaded(boolean paramBoolean1, long paramLong, int paramInt1, boolean paramBoolean2, int paramInt2, int paramInt3) {
/* 38 */     ((SteamUserStatsCallback)this.callback).onLeaderboardScoreUploaded(paramBoolean1, new SteamLeaderboardHandle(paramLong), paramInt1, paramBoolean2, paramInt2, paramInt3);
/*    */   }
/*    */ 
/*    */   
/*    */   void onGlobalStatsReceived(long paramLong, int paramInt) {
/* 43 */     ((SteamUserStatsCallback)this.callback).onGlobalStatsReceived(paramLong, SteamResult.byValue(paramInt));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUserStatsCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
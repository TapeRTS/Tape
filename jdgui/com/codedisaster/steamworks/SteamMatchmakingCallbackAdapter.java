/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ class SteamMatchmakingCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*  7 */   private static final SteamMatchmaking$ChatMemberStateChange[] stateChangeValues = SteamMatchmaking$ChatMemberStateChange.values();
/*    */   
/*    */   SteamMatchmakingCallbackAdapter(SteamMatchmakingCallback paramSteamMatchmakingCallback) {
/* 10 */     super(paramSteamMatchmakingCallback);
/*    */   }
/*    */   
/*    */   void onFavoritesListChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6) {
/* 14 */     ((SteamMatchmakingCallback)this.callback).onFavoritesListChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6);
/*    */   }
/*    */   
/*    */   void onLobbyInvite(long paramLong1, long paramLong2, long paramLong3) {
/* 18 */     ((SteamMatchmakingCallback)this.callback).onLobbyInvite(new SteamID(paramLong1), new SteamID(paramLong2), paramLong3);
/*    */   }
/*    */   
/*    */   void onLobbyEnter(long paramLong, int paramInt1, boolean paramBoolean, int paramInt2) {
/* 22 */     ((SteamMatchmakingCallback)this.callback).onLobbyEnter(new SteamID(paramLong), paramInt1, paramBoolean, 
/* 23 */         SteamMatchmaking$ChatRoomEnterResponse.byCode(paramInt2));
/*    */   }
/*    */   
/*    */   void onLobbyDataUpdate(long paramLong1, long paramLong2, boolean paramBoolean) {
/* 27 */     ((SteamMatchmakingCallback)this.callback).onLobbyDataUpdate(new SteamID(paramLong1), new SteamID(paramLong2), paramBoolean);
/*    */   }
/*    */   
/*    */   void onLobbyChatUpdate(long paramLong1, long paramLong2, long paramLong3, int paramInt) {
/* 31 */     SteamID steamID1 = new SteamID(paramLong1);
/* 32 */     SteamID steamID2 = new SteamID(paramLong2);
/* 33 */     SteamID steamID3 = new SteamID(paramLong3);
/* 34 */     for (SteamMatchmaking$ChatMemberStateChange steamMatchmaking$ChatMemberStateChange : stateChangeValues) {
/* 35 */       if (SteamMatchmaking$ChatMemberStateChange.isSet(steamMatchmaking$ChatMemberStateChange, paramInt)) {
/* 36 */         ((SteamMatchmakingCallback)this.callback).onLobbyChatUpdate(steamID1, steamID2, steamID3, steamMatchmaking$ChatMemberStateChange);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   void onLobbyChatMessage(long paramLong1, long paramLong2, int paramInt1, int paramInt2) {
/* 42 */     ((SteamMatchmakingCallback)this.callback).onLobbyChatMessage(new SteamID(paramLong1), new SteamID(paramLong2), 
/* 43 */         SteamMatchmaking$ChatEntryType.byCode(paramInt1), paramInt2);
/*    */   }
/*    */   
/*    */   void onLobbyGameCreated(long paramLong1, long paramLong2, int paramInt, short paramShort) {
/* 47 */     ((SteamMatchmakingCallback)this.callback).onLobbyGameCreated(new SteamID(paramLong1), new SteamID(paramLong2), paramInt, paramShort);
/*    */   }
/*    */   
/*    */   void onLobbyMatchList(int paramInt) {
/* 51 */     ((SteamMatchmakingCallback)this.callback).onLobbyMatchList(paramInt);
/*    */   }
/*    */   
/*    */   void onLobbyKicked(long paramLong1, long paramLong2, boolean paramBoolean) {
/* 55 */     ((SteamMatchmakingCallback)this.callback).onLobbyKicked(new SteamID(paramLong1), new SteamID(paramLong2), paramBoolean);
/*    */   }
/*    */   
/*    */   void onLobbyCreated(int paramInt, long paramLong) {
/* 59 */     ((SteamMatchmakingCallback)this.callback).onLobbyCreated(SteamResult.byValue(paramInt), new SteamID(paramLong));
/*    */   }
/*    */   
/*    */   void onFavoritesListAccountsUpdated(int paramInt) {
/* 63 */     ((SteamMatchmakingCallback)this.callback).onFavoritesListAccountsUpdated(SteamResult.byValue(paramInt));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmakingCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamFriendsCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*  6 */   private static final SteamFriends$PersonaChange[] personaChangeValues = SteamFriends$PersonaChange.values();
/*    */   
/*    */   SteamFriendsCallbackAdapter(SteamFriendsCallback paramSteamFriendsCallback) {
/*  9 */     super(paramSteamFriendsCallback);
/*    */   }
/*    */   
/*    */   void onSetPersonaNameResponse(boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
/* 13 */     ((SteamFriendsCallback)this.callback).onSetPersonaNameResponse(paramBoolean1, paramBoolean2, SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onPersonaStateChange(long paramLong, int paramInt) {
/* 17 */     SteamID steamID = new SteamID(paramLong);
/* 18 */     for (SteamFriends$PersonaChange steamFriends$PersonaChange : personaChangeValues) {
/* 19 */       if (SteamFriends$PersonaChange.isSet(steamFriends$PersonaChange, paramInt)) {
/* 20 */         ((SteamFriendsCallback)this.callback).onPersonaStateChange(steamID, steamFriends$PersonaChange);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   void onGameOverlayActivated(boolean paramBoolean) {
/* 26 */     ((SteamFriendsCallback)this.callback).onGameOverlayActivated(paramBoolean);
/*    */   }
/*    */   
/*    */   void onGameLobbyJoinRequested(long paramLong1, long paramLong2) {
/* 30 */     ((SteamFriendsCallback)this.callback).onGameLobbyJoinRequested(new SteamID(paramLong1), new SteamID(paramLong2));
/*    */   }
/*    */   
/*    */   void onAvatarImageLoaded(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
/* 34 */     ((SteamFriendsCallback)this.callback).onAvatarImageLoaded(new SteamID(paramLong), paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   void onFriendRichPresenceUpdate(long paramLong, int paramInt) {
/* 38 */     ((SteamFriendsCallback)this.callback).onFriendRichPresenceUpdate(new SteamID(paramLong), paramInt);
/*    */   }
/*    */   
/*    */   void onGameRichPresenceJoinRequested(long paramLong, String paramString) {
/* 42 */     ((SteamFriendsCallback)this.callback).onGameRichPresenceJoinRequested(new SteamID(paramLong), paramString);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriendsCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
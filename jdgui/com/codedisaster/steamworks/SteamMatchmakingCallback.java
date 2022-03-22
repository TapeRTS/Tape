package com.codedisaster.steamworks;

public interface SteamMatchmakingCallback {
  void onFavoritesListChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6);
  
  void onLobbyInvite(SteamID paramSteamID1, SteamID paramSteamID2, long paramLong);
  
  void onLobbyEnter(SteamID paramSteamID, int paramInt, boolean paramBoolean, SteamMatchmaking$ChatRoomEnterResponse paramSteamMatchmaking$ChatRoomEnterResponse);
  
  void onLobbyDataUpdate(SteamID paramSteamID1, SteamID paramSteamID2, boolean paramBoolean);
  
  void onLobbyChatUpdate(SteamID paramSteamID1, SteamID paramSteamID2, SteamID paramSteamID3, SteamMatchmaking$ChatMemberStateChange paramSteamMatchmaking$ChatMemberStateChange);
  
  void onLobbyChatMessage(SteamID paramSteamID1, SteamID paramSteamID2, SteamMatchmaking$ChatEntryType paramSteamMatchmaking$ChatEntryType, int paramInt);
  
  void onLobbyGameCreated(SteamID paramSteamID1, SteamID paramSteamID2, int paramInt, short paramShort);
  
  void onLobbyMatchList(int paramInt);
  
  void onLobbyKicked(SteamID paramSteamID1, SteamID paramSteamID2, boolean paramBoolean);
  
  void onLobbyCreated(SteamResult paramSteamResult, SteamID paramSteamID);
  
  void onFavoritesListAccountsUpdated(SteamResult paramSteamResult);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmakingCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
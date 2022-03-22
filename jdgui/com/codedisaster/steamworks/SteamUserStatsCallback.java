package com.codedisaster.steamworks;

public interface SteamUserStatsCallback {
  void onUserStatsReceived(long paramLong, SteamID paramSteamID, SteamResult paramSteamResult);
  
  void onUserStatsStored(long paramLong, SteamResult paramSteamResult);
  
  void onUserStatsUnloaded(SteamID paramSteamID);
  
  void onUserAchievementStored(long paramLong, boolean paramBoolean, String paramString, int paramInt1, int paramInt2);
  
  void onLeaderboardFindResult(SteamLeaderboardHandle paramSteamLeaderboardHandle, boolean paramBoolean);
  
  void onLeaderboardScoresDownloaded(SteamLeaderboardHandle paramSteamLeaderboardHandle, SteamLeaderboardEntriesHandle paramSteamLeaderboardEntriesHandle, int paramInt);
  
  void onLeaderboardScoreUploaded(boolean paramBoolean1, SteamLeaderboardHandle paramSteamLeaderboardHandle, int paramInt1, boolean paramBoolean2, int paramInt2, int paramInt3);
  
  void onGlobalStatsReceived(long paramLong, SteamResult paramSteamResult);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUserStatsCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
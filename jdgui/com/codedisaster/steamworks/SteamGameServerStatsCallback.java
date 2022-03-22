package com.codedisaster.steamworks;

public interface SteamGameServerStatsCallback {
  void onStatsReceived(SteamResult paramSteamResult, SteamID paramSteamID);
  
  void onStatsStored(SteamResult paramSteamResult, SteamID paramSteamID);
  
  void onStatsUnloaded(SteamID paramSteamID);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerStatsCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package com.codedisaster.steamworks;

public interface SteamNetworkingCallback {
  void onP2PSessionConnectFail(SteamID paramSteamID, SteamNetworking$P2PSessionError paramSteamNetworking$P2PSessionError);
  
  void onP2PSessionRequest(SteamID paramSteamID);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNetworkingCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
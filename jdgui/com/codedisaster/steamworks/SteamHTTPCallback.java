package com.codedisaster.steamworks;

public interface SteamHTTPCallback {
  void onHTTPRequestCompleted(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, long paramLong, boolean paramBoolean, SteamHTTP$HTTPStatusCode paramSteamHTTP$HTTPStatusCode, int paramInt);
  
  void onHTTPRequestHeadersReceived(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, long paramLong);
  
  void onHTTPRequestDataReceived(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, long paramLong, int paramInt1, int paramInt2);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamHTTPCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
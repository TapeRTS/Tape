package com.codedisaster.steamworks;

public interface SteamUserCallback {
  void onValidateAuthTicket(SteamID paramSteamID1, SteamAuth$AuthSessionResponse paramSteamAuth$AuthSessionResponse, SteamID paramSteamID2);
  
  void onMicroTxnAuthorization(int paramInt, long paramLong, boolean paramBoolean);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUserCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
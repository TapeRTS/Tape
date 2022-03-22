package com.codedisaster.steamworks;

public interface SteamGameServerCallback {
  void onValidateAuthTicketResponse(SteamID paramSteamID1, SteamAuth$AuthSessionResponse paramSteamAuth$AuthSessionResponse, SteamID paramSteamID2);
  
  void onSteamServersConnected();
  
  void onSteamServerConnectFailure(SteamResult paramSteamResult, boolean paramBoolean);
  
  void onSteamServersDisconnected(SteamResult paramSteamResult);
  
  void onClientApprove(SteamID paramSteamID1, SteamID paramSteamID2);
  
  void onClientDeny(SteamID paramSteamID, SteamGameServer$DenyReason paramSteamGameServer$DenyReason, String paramString);
  
  void onClientKick(SteamID paramSteamID, SteamGameServer$DenyReason paramSteamGameServer$DenyReason);
  
  void onClientGroupStatus(SteamID paramSteamID1, SteamID paramSteamID2, boolean paramBoolean1, boolean paramBoolean2);
  
  void onAssociateWithClanResult(SteamResult paramSteamResult);
  
  void onComputeNewPlayerCompatibilityResult(SteamResult paramSteamResult, int paramInt1, int paramInt2, int paramInt3, SteamID paramSteamID);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
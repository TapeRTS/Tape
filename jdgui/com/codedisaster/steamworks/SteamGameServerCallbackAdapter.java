/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamGameServerCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamGameServerCallbackAdapter(SteamGameServerCallback paramSteamGameServerCallback) {
/*  7 */     super(paramSteamGameServerCallback);
/*    */   }
/*    */   
/*    */   void onValidateAuthTicketResponse(long paramLong1, int paramInt, long paramLong2) {
/* 11 */     ((SteamGameServerCallback)this.callback).onValidateAuthTicketResponse(new SteamID(paramLong1), 
/* 12 */         SteamAuth$AuthSessionResponse.byOrdinal(paramInt), new SteamID(paramLong2));
/*    */   }
/*    */   
/*    */   void onSteamServersConnected() {
/* 16 */     ((SteamGameServerCallback)this.callback).onSteamServersConnected();
/*    */   }
/*    */   
/*    */   void onSteamServerConnectFailure(int paramInt, boolean paramBoolean) {
/* 20 */     ((SteamGameServerCallback)this.callback).onSteamServerConnectFailure(SteamResult.byValue(paramInt), paramBoolean);
/*    */   }
/*    */   
/*    */   void onSteamServersDisconnected(int paramInt) {
/* 24 */     ((SteamGameServerCallback)this.callback).onSteamServersDisconnected(SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onClientApprove(long paramLong1, long paramLong2) {
/* 28 */     ((SteamGameServerCallback)this.callback).onClientApprove(new SteamID(paramLong1), new SteamID(paramLong2));
/*    */   }
/*    */   
/*    */   void onClientDeny(long paramLong, int paramInt, String paramString) {
/* 32 */     ((SteamGameServerCallback)this.callback).onClientDeny(new SteamID(paramLong), SteamGameServer$DenyReason.byOrdinal(paramInt), paramString);
/*    */   }
/*    */   
/*    */   void onClientKick(long paramLong, int paramInt) {
/* 36 */     ((SteamGameServerCallback)this.callback).onClientKick(new SteamID(paramLong), SteamGameServer$DenyReason.byOrdinal(paramInt));
/*    */   }
/*    */   
/*    */   void onClientGroupStatus(long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2) {
/* 40 */     ((SteamGameServerCallback)this.callback).onClientGroupStatus(new SteamID(paramLong1), new SteamID(paramLong2), paramBoolean1, paramBoolean2);
/*    */   }
/*    */   
/*    */   void onAssociateWithClanResult(int paramInt) {
/* 44 */     ((SteamGameServerCallback)this.callback).onAssociateWithClanResult(SteamResult.byValue(paramInt));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   void onComputeNewPlayerCompatibilityResult(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong) {
/* 52 */     ((SteamGameServerCallback)this.callback).onComputeNewPlayerCompatibilityResult(SteamResult.byValue(paramInt1), paramInt2, paramInt3, paramInt4, new SteamID(paramLong));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
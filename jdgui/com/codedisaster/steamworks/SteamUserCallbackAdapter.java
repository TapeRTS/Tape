/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamUserCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamUserCallbackAdapter(SteamUserCallback paramSteamUserCallback) {
/*  7 */     super(paramSteamUserCallback);
/*    */   }
/*    */   
/*    */   void onValidateAuthTicket(long paramLong1, int paramInt, long paramLong2) {
/* 11 */     ((SteamUserCallback)this.callback).onValidateAuthTicket(new SteamID(paramLong1), 
/* 12 */         SteamAuth$AuthSessionResponse.byOrdinal(paramInt), new SteamID(paramLong2));
/*    */   }
/*    */   
/*    */   void onMicroTxnAuthorization(int paramInt, long paramLong, boolean paramBoolean) {
/* 16 */     ((SteamUserCallback)this.callback).onMicroTxnAuthorization(paramInt, paramLong, paramBoolean);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUserCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
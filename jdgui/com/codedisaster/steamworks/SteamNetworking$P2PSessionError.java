/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamNetworking$P2PSessionError
/*    */ {
/*    */   private static final SteamNetworking$P2PSessionError[] values;
/* 24 */   None,
/* 25 */   NotRunningApp,
/* 26 */   NoRightsToApp,
/* 27 */   DestinationNotLoggedIn,
/* 28 */   Timeout;
/*    */   static {
/* 30 */     values = values();
/*    */   }
/*    */   public static SteamNetworking$P2PSessionError byOrdinal(int paramInt) {
/* 33 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNetworking$P2PSessionError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
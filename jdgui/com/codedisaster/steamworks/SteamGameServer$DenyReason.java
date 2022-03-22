/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamGameServer$DenyReason
/*    */ {
/*    */   private static final SteamGameServer$DenyReason[] values;
/* 12 */   Invalid,
/* 13 */   InvalidVersion,
/* 14 */   Generic,
/* 15 */   NotLoggedOn,
/* 16 */   NoLicense,
/* 17 */   Cheater,
/* 18 */   LoggedInElseWhere,
/* 19 */   UnknownText,
/* 20 */   IncompatibleAnticheat,
/* 21 */   MemoryCorruption,
/* 22 */   IncompatibleSoftware,
/* 23 */   SteamConnectionLost,
/* 24 */   SteamConnectionError,
/* 25 */   SteamResponseTimedOut,
/* 26 */   SteamValidationStalled,
/* 27 */   SteamOwnerLeftGuestUser;
/*    */   static {
/* 29 */     values = values();
/*    */   }
/*    */   static SteamGameServer$DenyReason byOrdinal(int paramInt) {
/* 32 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServer$DenyReason.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
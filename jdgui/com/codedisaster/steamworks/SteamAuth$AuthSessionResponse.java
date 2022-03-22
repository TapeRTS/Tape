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
/*    */ public enum SteamAuth$AuthSessionResponse
/*    */ {
/*    */   private static final SteamAuth$AuthSessionResponse[] values;
/* 24 */   OK,
/* 25 */   UserNotConnectedToSteam,
/* 26 */   NoLicenseOrExpired,
/* 27 */   VACBanned,
/* 28 */   LoggedInElseWhere,
/* 29 */   VACCheckTimedOut,
/* 30 */   AuthTicketCanceled,
/* 31 */   AuthTicketInvalidAlreadyUsed,
/* 32 */   AuthTicketInvalid,
/* 33 */   PublisherIssuedBan;
/*    */   static {
/* 35 */     values = values();
/*    */   }
/*    */   static SteamAuth$AuthSessionResponse byOrdinal(int paramInt) {
/* 38 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamAuth$AuthSessionResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
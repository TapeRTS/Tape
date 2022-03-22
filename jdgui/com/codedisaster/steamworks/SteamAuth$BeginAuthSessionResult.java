/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamAuth$BeginAuthSessionResult
/*    */ {
/*    */   private static final SteamAuth$BeginAuthSessionResult[] values;
/*  9 */   OK,
/* 10 */   InvalidTicket,
/* 11 */   DuplicateRequest,
/* 12 */   InvalidVersion,
/* 13 */   GameMismatch,
/* 14 */   ExpiredTicket;
/*    */   static {
/* 16 */     values = values();
/*    */   }
/*    */   static SteamAuth$BeginAuthSessionResult byOrdinal(int paramInt) {
/* 19 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamAuth$BeginAuthSessionResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
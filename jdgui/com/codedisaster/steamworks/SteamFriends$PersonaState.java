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
/*    */ 
/*    */ 
/*    */ public enum SteamFriends$PersonaState
/*    */ {
/*    */   private static final SteamFriends$PersonaState[] values;
/* 26 */   Offline,
/* 27 */   Online,
/* 28 */   Busy,
/* 29 */   Away,
/* 30 */   Snooze,
/* 31 */   LookingToTrade,
/* 32 */   LookingToPlay;
/*    */   static {
/* 34 */     values = values();
/*    */   }
/*    */   static SteamFriends$PersonaState byOrdinal(int paramInt) {
/* 37 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriends$PersonaState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
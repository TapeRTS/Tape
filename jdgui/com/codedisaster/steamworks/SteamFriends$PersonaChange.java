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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamFriends$PersonaChange
/*    */ {
/* 76 */   Name(1),
/* 77 */   Status(2),
/* 78 */   ComeOnline(4),
/* 79 */   GoneOffline(8),
/* 80 */   GamePlayed(16),
/* 81 */   GameServer(32),
/* 82 */   Avatar(64),
/* 83 */   JoinedSource(128),
/* 84 */   LeftSource(256),
/* 85 */   RelationshipChanged(512),
/* 86 */   NameFirstSet(1024),
/* 87 */   FacebookInfo(2048),
/* 88 */   Nickname(4096),
/* 89 */   SteamLevel(8192);
/*    */   
/*    */   private final int bits;
/*    */   
/*    */   SteamFriends$PersonaChange(int paramInt1) {
/* 94 */     this.bits = paramInt1;
/*    */   }
/*    */   
/*    */   static boolean isSet(SteamFriends$PersonaChange paramSteamFriends$PersonaChange, int paramInt) {
/* 98 */     return ((paramSteamFriends$PersonaChange.bits & paramInt) == paramSteamFriends$PersonaChange.bits);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriends$PersonaChange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
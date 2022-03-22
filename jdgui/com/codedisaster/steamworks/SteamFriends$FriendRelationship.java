/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamFriends$FriendRelationship
/*    */ {
/*    */   private static final SteamFriends$FriendRelationship[] values;
/*  8 */   None,
/*  9 */   Blocked,
/* 10 */   Recipient,
/* 11 */   Friend,
/* 12 */   RequestInitiator,
/* 13 */   Ignored,
/* 14 */   IgnoredFriend,
/* 15 */   Suggested_DEPRECATED,
/* 16 */   Max;
/*    */   static {
/* 18 */     values = values();
/*    */   }
/*    */   static SteamFriends$FriendRelationship byOrdinal(int paramInt) {
/* 21 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriends$FriendRelationship.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
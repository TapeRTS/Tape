/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ import java.util.Collection;
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
/*    */ public enum SteamFriends$FriendFlags
/*    */ {
/* 43 */   None(0),
/* 44 */   Blocked(1),
/* 45 */   FriendshipRequested(2),
/* 46 */   Immediate(4),
/* 47 */   ClanMember(8),
/* 48 */   OnGameServer(16),
/*    */ 
/*    */   
/* 51 */   RequestingFriendship(128),
/* 52 */   RequestingInfo(256),
/* 53 */   Ignored(512),
/* 54 */   IgnoredFriend(1024),
/*    */   
/* 56 */   ChatMember(4096),
/* 57 */   All(65535);
/*    */   
/*    */   private final int bits;
/*    */   
/*    */   SteamFriends$FriendFlags(int paramInt1) {
/* 62 */     this.bits = paramInt1;
/*    */   }
/*    */   
/*    */   static int asBits(Collection paramCollection) {
/* 66 */     int i = 0;
/* 67 */     for (SteamFriends$FriendFlags steamFriends$FriendFlags : paramCollection) {
/* 68 */       i |= steamFriends$FriendFlags.bits;
/*    */     }
/* 70 */     return i;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriends$FriendFlags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
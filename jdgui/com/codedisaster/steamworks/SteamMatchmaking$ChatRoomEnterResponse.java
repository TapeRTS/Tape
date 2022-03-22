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
/*    */ public enum SteamMatchmaking$ChatRoomEnterResponse
/*    */ {
/*    */   private final int code;
/*    */   private static final SteamMatchmaking$ChatRoomEnterResponse[] values;
/* 37 */   Success(1),
/* 38 */   DoesntExist(2),
/* 39 */   NotAllowed(3),
/* 40 */   Full(4),
/* 41 */   Error(5),
/* 42 */   Banned(6),
/* 43 */   Limited(7),
/* 44 */   ClanDisabled(8),
/* 45 */   CommunityBan(9),
/* 46 */   MemberBlockedYou(10),
/* 47 */   YouBlockedMember(11);
/*    */   
/*    */   static {
/* 50 */     values = values();
/*    */   }
/*    */   SteamMatchmaking$ChatRoomEnterResponse(int paramInt1) {
/* 53 */     this.code = paramInt1;
/*    */   }
/*    */   
/*    */   static SteamMatchmaking$ChatRoomEnterResponse byCode(int paramInt) {
/* 57 */     for (SteamMatchmaking$ChatRoomEnterResponse steamMatchmaking$ChatRoomEnterResponse : values) {
/* 58 */       if (steamMatchmaking$ChatRoomEnterResponse.code == paramInt) {
/* 59 */         return steamMatchmaking$ChatRoomEnterResponse;
/*    */       }
/*    */     } 
/* 62 */     return Error;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmaking$ChatRoomEnterResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
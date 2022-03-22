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
/*    */ public enum SteamMatchmaking$ChatMemberStateChange
/*    */ {
/* 67 */   Entered(1),
/* 68 */   Left(2),
/* 69 */   Disconnected(4),
/* 70 */   Kicked(8),
/* 71 */   Banned(16);
/*    */   
/*    */   private final int bits;
/*    */   
/*    */   SteamMatchmaking$ChatMemberStateChange(int paramInt1) {
/* 76 */     this.bits = paramInt1;
/*    */   }
/*    */   
/*    */   static boolean isSet(SteamMatchmaking$ChatMemberStateChange paramSteamMatchmaking$ChatMemberStateChange, int paramInt) {
/* 80 */     return ((paramSteamMatchmaking$ChatMemberStateChange.bits & paramInt) == paramSteamMatchmaking$ChatMemberStateChange.bits);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmaking$ChatMemberStateChange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public enum SteamMatchmaking$LobbyComparison
/*    */ {
/* 15 */   EqualToOrLessThan(-2),
/* 16 */   LessThan(-1),
/* 17 */   Equal(0),
/* 18 */   GreaterThan(1),
/* 19 */   EqualToOrGreaterThan(2),
/* 20 */   NotEqual(3);
/*    */   
/*    */   private final int value;
/*    */   
/*    */   SteamMatchmaking$LobbyComparison(int paramInt1) {
/* 25 */     this.value = paramInt1;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmaking$LobbyComparison.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
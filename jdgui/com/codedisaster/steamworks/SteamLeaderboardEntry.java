/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SteamLeaderboardEntry
/*    */ {
/*    */   long steamIDUser;
/*    */   int globalRank;
/*    */   int score;
/*    */   int details;
/*    */   
/*    */   public SteamID getSteamIDUser() {
/* 14 */     return new SteamID(this.steamIDUser);
/*    */   }
/*    */   
/*    */   public int getGlobalRank() {
/* 18 */     return this.globalRank;
/*    */   }
/*    */   
/*    */   public int getScore() {
/* 22 */     return this.score;
/*    */   }
/*    */   
/*    */   public int getNumDetails() {
/* 26 */     return this.details;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamLeaderboardEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
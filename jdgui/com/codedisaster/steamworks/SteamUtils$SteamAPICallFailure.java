/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ public enum SteamUtils$SteamAPICallFailure
/*    */ {
/*    */   private final int code;
/*    */   private static final SteamUtils$SteamAPICallFailure[] values;
/*  8 */   None(-1),
/*  9 */   SteamGone(0),
/* 10 */   NetworkFailure(1),
/* 11 */   InvalidHandle(2),
/* 12 */   MismatchedCallback(3);
/*    */   
/*    */   static {
/* 15 */     values = values();
/*    */   }
/*    */   SteamUtils$SteamAPICallFailure(int paramInt1) {
/* 18 */     this.code = paramInt1;
/*    */   }
/*    */   
/*    */   static SteamUtils$SteamAPICallFailure byValue(int paramInt) {
/* 22 */     for (SteamUtils$SteamAPICallFailure steamUtils$SteamAPICallFailure : values) {
/* 23 */       if (steamUtils$SteamAPICallFailure.code == paramInt) {
/* 24 */         return steamUtils$SteamAPICallFailure;
/*    */       }
/*    */     } 
/* 27 */     return None;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUtils$SteamAPICallFailure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
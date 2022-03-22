/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamAPICall
/*    */   extends SteamNativeHandle {
/*    */   SteamAPICall(long paramLong) {
/*  6 */     super(paramLong);
/*    */   }
/*    */   
/*    */   public boolean isValid() {
/* 10 */     return (this.handle != 0L);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamAPICall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
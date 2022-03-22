/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ abstract class SteamInterface
/*    */ {
/*    */   protected final long pointer;
/*    */   protected long callback;
/*    */   
/*    */   SteamInterface(long paramLong) {
/*  9 */     this(paramLong, 0L);
/*    */   }
/*    */   
/*    */   SteamInterface(long paramLong1, long paramLong2) {
/* 13 */     if (paramLong1 == 0L) {
/* 14 */       throw new RuntimeException("Steam interface created with null pointer. Always check result of SteamAPI.init(), or with SteamAPI.isSteamRunning()!");
/*    */     }
/*    */     
/* 17 */     this.pointer = paramLong1;
/* 18 */     this.callback = paramLong2;
/*    */   }
/*    */   
/*    */   void setCallback(long paramLong) {
/* 22 */     this.callback = paramLong;
/*    */   }
/*    */   
/*    */   public void dispose() {
/* 26 */     deleteCallback(this.callback);
/*    */   }
/*    */   
/*    */   protected static native void deleteCallback(long paramLong);
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
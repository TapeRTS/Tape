/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamID
/*    */   extends SteamNativeHandle {
/*  5 */   private static final long InvalidSteamID = getInvalidSteamID();
/*    */   
/*    */   public SteamID() {
/*  8 */     super(InvalidSteamID);
/*    */   }
/*    */   
/*    */   public SteamID(SteamID paramSteamID) {
/* 12 */     super(paramSteamID.handle);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   SteamID(long paramLong) {
/* 24 */     super(paramLong);
/*    */   }
/*    */   
/*    */   public boolean isValid() {
/* 28 */     return isValid(this.handle);
/*    */   }
/*    */   
/*    */   public int getAccountID() {
/* 32 */     return (int)(this.handle % 4294967296L);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static SteamID createFromNativeHandle(long paramLong) {
/* 40 */     return new SteamID(paramLong);
/*    */   }
/*    */   
/*    */   private static native boolean isValid(long paramLong);
/*    */   
/*    */   private static native long getInvalidSteamID();
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
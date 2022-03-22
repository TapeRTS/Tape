/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamApps
/*    */   extends SteamInterface {
/*    */   public SteamApps() {
/*  6 */     super(SteamAPI.getSteamAppsPointer());
/*    */   }
/*    */   
/*    */   public boolean isSubscribedApp(int paramInt) {
/* 10 */     return isSubscribedApp(this.pointer, paramInt);
/*    */   }
/*    */   
/*    */   public String getCurrentGameLanguage() {
/* 14 */     return getCurrentGameLanguage(this.pointer);
/*    */   }
/*    */   
/*    */   public String getAvailableGameLanguages() {
/* 18 */     return getAvailableGameLanguages(this.pointer);
/*    */   }
/*    */   
/*    */   public SteamID getAppOwner() {
/* 22 */     return new SteamID(getAppOwner(this.pointer));
/*    */   }
/*    */   
/*    */   public int getAppBuildId() {
/* 26 */     return getAppBuildId(this.pointer);
/*    */   }
/*    */   
/*    */   private static native boolean isSubscribedApp(long paramLong, int paramInt);
/*    */   
/*    */   private static native String getCurrentGameLanguage(long paramLong);
/*    */   
/*    */   private static native String getAvailableGameLanguages(long paramLong);
/*    */   
/*    */   private static native long getAppOwner(long paramLong);
/*    */   
/*    */   private static native int getAppBuildId(long paramLong);
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamApps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
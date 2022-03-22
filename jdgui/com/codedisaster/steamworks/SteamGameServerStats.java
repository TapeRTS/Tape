/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ public class SteamGameServerStats
/*    */   extends SteamInterface {
/*    */   public SteamGameServerStats(SteamGameServerStatsCallback paramSteamGameServerStatsCallback) {
/*  6 */     super(SteamGameServerAPI.getSteamGameServerStatsPointer(), createCallback(new SteamGameServerStatsCallbackAdapter(paramSteamGameServerStatsCallback)));
/*    */   }
/*    */ 
/*    */   
/*    */   public SteamAPICall requestUserStats(SteamID paramSteamID) {
/* 11 */     return new SteamAPICall(requestUserStats(this.pointer, paramSteamID.handle));
/*    */   }
/*    */   
/*    */   public int getUserStatI(SteamID paramSteamID, String paramString, int paramInt) {
/* 15 */     int[] arrayOfInt = new int[1];
/* 16 */     if (getUserStat(this.pointer, paramSteamID.handle, paramString, arrayOfInt)) {
/* 17 */       return arrayOfInt[0];
/*    */     }
/* 19 */     return paramInt;
/*    */   }
/*    */   
/*    */   public float getUserStatF(SteamID paramSteamID, String paramString, float paramFloat) {
/* 23 */     float[] arrayOfFloat = new float[1];
/* 24 */     if (getUserStat(this.pointer, paramSteamID.handle, paramString, arrayOfFloat)) {
/* 25 */       return arrayOfFloat[0];
/*    */     }
/* 27 */     return paramFloat;
/*    */   }
/*    */   
/*    */   public boolean getUserAchievement(SteamID paramSteamID, String paramString, boolean paramBoolean) {
/* 31 */     boolean[] arrayOfBoolean = new boolean[1];
/* 32 */     if (getUserAchievement(this.pointer, paramSteamID.handle, paramString, arrayOfBoolean)) {
/* 33 */       return arrayOfBoolean[0];
/*    */     }
/* 35 */     return paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean setUserStatI(SteamID paramSteamID, String paramString, int paramInt) {
/* 39 */     return setUserStat(this.pointer, paramSteamID.handle, paramString, paramInt);
/*    */   }
/*    */   
/*    */   public boolean setUserStatF(SteamID paramSteamID, String paramString, float paramFloat) {
/* 43 */     return setUserStat(this.pointer, paramSteamID.handle, paramString, paramFloat);
/*    */   }
/*    */   
/*    */   public boolean updateUserAvgRateStat(SteamID paramSteamID, String paramString, float paramFloat, double paramDouble) {
/* 47 */     return updateUserAvgRateStat(this.pointer, paramSteamID.handle, paramString, paramFloat, paramDouble);
/*    */   }
/*    */   
/*    */   public boolean setUserAchievement(SteamID paramSteamID, String paramString) {
/* 51 */     return setUserAchievement(this.pointer, paramSteamID.handle, paramString);
/*    */   }
/*    */   
/*    */   public boolean clearUserAchievement(SteamID paramSteamID, String paramString) {
/* 55 */     return clearUserAchievement(this.pointer, paramSteamID.handle, paramString);
/*    */   }
/*    */   
/*    */   public SteamAPICall storeUserStats(SteamID paramSteamID) {
/* 59 */     return new SteamAPICall(storeUserStats(this.pointer, paramSteamID.handle));
/*    */   }
/*    */   
/*    */   private static native long createCallback(SteamGameServerStatsCallbackAdapter paramSteamGameServerStatsCallbackAdapter);
/*    */   
/*    */   private static native long requestUserStats(long paramLong1, long paramLong2);
/*    */   
/*    */   private static native boolean getUserStat(long paramLong1, long paramLong2, String paramString, int[] paramArrayOfint);
/*    */   
/*    */   private static native boolean getUserStat(long paramLong1, long paramLong2, String paramString, float[] paramArrayOffloat);
/*    */   
/*    */   private static native boolean getUserAchievement(long paramLong1, long paramLong2, String paramString, boolean[] paramArrayOfboolean);
/*    */   
/*    */   private static native boolean setUserStat(long paramLong1, long paramLong2, String paramString, int paramInt);
/*    */   
/*    */   private static native boolean setUserStat(long paramLong1, long paramLong2, String paramString, float paramFloat);
/*    */   
/*    */   private static native boolean updateUserAvgRateStat(long paramLong1, long paramLong2, String paramString, float paramFloat, double paramDouble);
/*    */   
/*    */   private static native boolean setUserAchievement(long paramLong1, long paramLong2, String paramString);
/*    */   
/*    */   private static native boolean clearUserAchievement(long paramLong1, long paramLong2, String paramString);
/*    */   
/*    */   private static native long storeUserStats(long paramLong1, long paramLong2);
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServerStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
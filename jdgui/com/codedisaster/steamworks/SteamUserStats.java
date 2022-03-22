/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamUserStats
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamUserStats(SteamUserStatsCallback paramSteamUserStatsCallback) {
/*  32 */     super(SteamAPI.getSteamUserStatsPointer(), createCallback(new SteamUserStatsCallbackAdapter(paramSteamUserStatsCallback)));
/*     */   }
/*     */   
/*     */   public boolean requestCurrentStats() {
/*  36 */     return requestCurrentStats(this.pointer);
/*     */   }
/*     */   
/*     */   public int getStatI(String paramString, int paramInt) {
/*  40 */     int[] arrayOfInt = new int[1];
/*  41 */     if (getStat(this.pointer, paramString, arrayOfInt)) {
/*  42 */       return arrayOfInt[0];
/*     */     }
/*  44 */     return paramInt;
/*     */   }
/*     */   
/*     */   public boolean setStatI(String paramString, int paramInt) {
/*  48 */     return setStat(this.pointer, paramString, paramInt);
/*     */   }
/*     */   
/*     */   public float getStatF(String paramString, float paramFloat) {
/*  52 */     float[] arrayOfFloat = new float[1];
/*  53 */     if (getStat(this.pointer, paramString, arrayOfFloat)) {
/*  54 */       return arrayOfFloat[0];
/*     */     }
/*  56 */     return paramFloat;
/*     */   }
/*     */   
/*     */   public boolean setStatF(String paramString, float paramFloat) {
/*  60 */     return setStat(this.pointer, paramString, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean isAchieved(String paramString, boolean paramBoolean) {
/*  64 */     boolean[] arrayOfBoolean = new boolean[1];
/*  65 */     if (getAchievement(this.pointer, paramString, arrayOfBoolean)) {
/*  66 */       return arrayOfBoolean[0];
/*     */     }
/*  68 */     return paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean setAchievement(String paramString) {
/*  72 */     return setAchievement(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public boolean clearAchievement(String paramString) {
/*  76 */     return clearAchievement(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public boolean storeStats() {
/*  80 */     return storeStats(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean indicateAchievementProgress(String paramString, int paramInt1, int paramInt2) {
/*  84 */     return indicateAchievementProgress(this.pointer, paramString, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int getNumAchievements() {
/*  88 */     return getNumAchievements(this.pointer);
/*     */   }
/*     */   
/*     */   public String getAchievementName(int paramInt) {
/*  92 */     return getAchievementName(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public boolean resetAllStats(boolean paramBoolean) {
/*  96 */     return resetAllStats(this.pointer, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamAPICall findOrCreateLeaderboard(String paramString, SteamUserStats$LeaderboardSortMethod paramSteamUserStats$LeaderboardSortMethod, SteamUserStats$LeaderboardDisplayType paramSteamUserStats$LeaderboardDisplayType) {
/* 103 */     return new SteamAPICall(findOrCreateLeaderboard(this.pointer, this.callback, paramString, paramSteamUserStats$LeaderboardSortMethod
/* 104 */           .ordinal(), paramSteamUserStats$LeaderboardDisplayType.ordinal()));
/*     */   }
/*     */   
/*     */   public SteamAPICall findLeaderboard(String paramString) {
/* 108 */     return new SteamAPICall(findLeaderboard(this.pointer, this.callback, paramString));
/*     */   }
/*     */   
/*     */   public String getLeaderboardName(SteamLeaderboardHandle paramSteamLeaderboardHandle) {
/* 112 */     return getLeaderboardName(this.pointer, paramSteamLeaderboardHandle.handle);
/*     */   }
/*     */   
/*     */   public int getLeaderboardEntryCount(SteamLeaderboardHandle paramSteamLeaderboardHandle) {
/* 116 */     return getLeaderboardEntryCount(this.pointer, paramSteamLeaderboardHandle.handle);
/*     */   }
/*     */   
/*     */   public SteamUserStats$LeaderboardSortMethod getLeaderboardSortMethod(SteamLeaderboardHandle paramSteamLeaderboardHandle) {
/* 120 */     return SteamUserStats$LeaderboardSortMethod.values()[getLeaderboardSortMethod(this.pointer, paramSteamLeaderboardHandle.handle)];
/*     */   }
/*     */   
/*     */   public SteamUserStats$LeaderboardDisplayType getLeaderboardDisplayType(SteamLeaderboardHandle paramSteamLeaderboardHandle) {
/* 124 */     return SteamUserStats$LeaderboardDisplayType.values()[getLeaderboardDisplayType(this.pointer, paramSteamLeaderboardHandle.handle)];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamAPICall downloadLeaderboardEntries(SteamLeaderboardHandle paramSteamLeaderboardHandle, SteamUserStats$LeaderboardDataRequest paramSteamUserStats$LeaderboardDataRequest, int paramInt1, int paramInt2) {
/* 132 */     return new SteamAPICall(downloadLeaderboardEntries(this.pointer, this.callback, paramSteamLeaderboardHandle.handle, paramSteamUserStats$LeaderboardDataRequest
/* 133 */           .ordinal(), paramInt1, paramInt2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getDownloadedLeaderboardEntry(SteamLeaderboardEntriesHandle paramSteamLeaderboardEntriesHandle, int paramInt, SteamLeaderboardEntry paramSteamLeaderboardEntry, int[] paramArrayOfint) {
/* 143 */     return (paramArrayOfint == null) ? 
/* 144 */       getDownloadedLeaderboardEntry(this.pointer, paramSteamLeaderboardEntriesHandle.handle, paramInt, paramSteamLeaderboardEntry) : 
/* 145 */       getDownloadedLeaderboardEntry(this.pointer, paramSteamLeaderboardEntriesHandle.handle, paramInt, paramSteamLeaderboardEntry, paramArrayOfint, paramArrayOfint.length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamAPICall uploadLeaderboardScore(SteamLeaderboardHandle paramSteamLeaderboardHandle, SteamUserStats$LeaderboardUploadScoreMethod paramSteamUserStats$LeaderboardUploadScoreMethod, int paramInt, int[] paramArrayOfint) {
/* 155 */     return new SteamAPICall((paramArrayOfint == null) ? 
/* 156 */         uploadLeaderboardScore(this.pointer, this.callback, paramSteamLeaderboardHandle.handle, paramSteamUserStats$LeaderboardUploadScoreMethod.ordinal(), paramInt) : 
/* 157 */         uploadLeaderboardScore(this.pointer, this.callback, paramSteamLeaderboardHandle.handle, paramSteamUserStats$LeaderboardUploadScoreMethod.ordinal(), paramInt, paramArrayOfint, paramArrayOfint.length));
/*     */   }
/*     */   
/*     */   public SteamAPICall requestGlobalStats(int paramInt) {
/* 161 */     return new SteamAPICall(requestGlobalStats(this.pointer, this.callback, paramInt));
/*     */   }
/*     */   
/*     */   public long getGlobalStat(String paramString, long paramLong) {
/* 165 */     long[] arrayOfLong = new long[1];
/* 166 */     if (getGlobalStat(this.pointer, paramString, arrayOfLong)) {
/* 167 */       return arrayOfLong[0];
/*     */     }
/* 169 */     return paramLong;
/*     */   }
/*     */   
/*     */   public double getGlobalStat(String paramString, double paramDouble) {
/* 173 */     double[] arrayOfDouble = new double[1];
/* 174 */     if (getGlobalStat(this.pointer, paramString, arrayOfDouble)) {
/* 175 */       return arrayOfDouble[0];
/*     */     }
/* 177 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public int getGlobalStatHistory(String paramString, long[] paramArrayOflong) {
/* 181 */     return getGlobalStatHistory(this.pointer, paramString, paramArrayOflong, paramArrayOflong.length);
/*     */   }
/*     */   
/*     */   public int getGlobalStatHistory(String paramString, double[] paramArrayOfdouble) {
/* 185 */     return getGlobalStatHistory(this.pointer, paramString, paramArrayOfdouble, paramArrayOfdouble.length);
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamUserStatsCallbackAdapter paramSteamUserStatsCallbackAdapter);
/*     */   
/*     */   private static native boolean requestCurrentStats(long paramLong);
/*     */   
/*     */   private static native boolean getStat(long paramLong, String paramString, int[] paramArrayOfint);
/*     */   
/*     */   private static native boolean setStat(long paramLong, String paramString, int paramInt);
/*     */   
/*     */   private static native boolean getStat(long paramLong, String paramString, float[] paramArrayOffloat);
/*     */   
/*     */   private static native boolean setStat(long paramLong, String paramString, float paramFloat);
/*     */   
/*     */   private static native boolean getAchievement(long paramLong, String paramString, boolean[] paramArrayOfboolean);
/*     */   
/*     */   private static native boolean setAchievement(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean clearAchievement(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean storeStats(long paramLong);
/*     */   
/*     */   private static native boolean indicateAchievementProgress(long paramLong, String paramString, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int getNumAchievements(long paramLong);
/*     */   
/*     */   private static native String getAchievementName(long paramLong, int paramInt);
/*     */   
/*     */   private static native boolean resetAllStats(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long findOrCreateLeaderboard(long paramLong1, long paramLong2, String paramString, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long findLeaderboard(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native String getLeaderboardName(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getLeaderboardEntryCount(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getLeaderboardSortMethod(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getLeaderboardDisplayType(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long downloadLeaderboardEntries(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native boolean getDownloadedLeaderboardEntry(long paramLong1, long paramLong2, int paramInt1, SteamLeaderboardEntry paramSteamLeaderboardEntry, int[] paramArrayOfint, int paramInt2);
/*     */   
/*     */   private static native boolean getDownloadedLeaderboardEntry(long paramLong1, long paramLong2, int paramInt, SteamLeaderboardEntry paramSteamLeaderboardEntry);
/*     */   
/*     */   private static native long uploadLeaderboardScore(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3);
/*     */   
/*     */   private static native long uploadLeaderboardScore(long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long requestGlobalStats(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean getGlobalStat(long paramLong, String paramString, long[] paramArrayOflong);
/*     */   
/*     */   private static native boolean getGlobalStat(long paramLong, String paramString, double[] paramArrayOfdouble);
/*     */   
/*     */   private static native int getGlobalStatHistory(long paramLong, String paramString, long[] paramArrayOflong, int paramInt);
/*     */   
/*     */   private static native int getGlobalStatHistory(long paramLong, String paramString, double[] paramArrayOfdouble, int paramInt);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUserStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ public enum SteamRemoteStorage$RemoteStoragePlatform
/*    */ {
/*    */   private final int mask;
/*    */   private static final SteamRemoteStorage$RemoteStoragePlatform[] values;
/*  8 */   None(0),
/*  9 */   Windows(1),
/* 10 */   OSX(2),
/* 11 */   PS3(4),
/* 12 */   Linux(8),
/* 13 */   Reserved2(16),
/*    */   
/* 15 */   All(-1);
/*    */   
/*    */   static {
/* 18 */     values = values();
/*    */   }
/*    */   SteamRemoteStorage$RemoteStoragePlatform(int paramInt1) {
/* 21 */     this.mask = paramInt1;
/*    */   }
/*    */   
/*    */   static SteamRemoteStorage$RemoteStoragePlatform[] byMask(int paramInt) {
/* 25 */     int i = Integer.bitCount(paramInt);
/* 26 */     SteamRemoteStorage$RemoteStoragePlatform[] arrayOfSteamRemoteStorage$RemoteStoragePlatform = new SteamRemoteStorage$RemoteStoragePlatform[i];
/*    */     
/* 28 */     byte b = 0;
/* 29 */     for (SteamRemoteStorage$RemoteStoragePlatform steamRemoteStorage$RemoteStoragePlatform : values) {
/* 30 */       if ((steamRemoteStorage$RemoteStoragePlatform.mask & paramInt) != 0) {
/* 31 */         arrayOfSteamRemoteStorage$RemoteStoragePlatform[b++] = steamRemoteStorage$RemoteStoragePlatform;
/*    */       }
/*    */     } 
/*    */     
/* 35 */     return arrayOfSteamRemoteStorage$RemoteStoragePlatform;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamRemoteStorage$RemoteStoragePlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
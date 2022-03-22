/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.EnumSet;
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
/*     */ public enum SteamUGC$ItemState
/*     */ {
/*     */   private final int bits;
/*     */   private static final SteamUGC$ItemState[] values;
/* 104 */   None(0),
/* 105 */   Subscribed(1),
/* 106 */   LegacyItem(2),
/* 107 */   Installed(4),
/* 108 */   NeedsUpdate(8),
/* 109 */   Downloading(16),
/* 110 */   DownloadPending(32);
/*     */   
/*     */   static {
/* 113 */     values = values();
/*     */   }
/*     */   SteamUGC$ItemState(int paramInt1) {
/* 116 */     this.bits = paramInt1;
/*     */   }
/*     */   
/*     */   static Collection fromBits(int paramInt) {
/* 120 */     EnumSet<SteamUGC$ItemState> enumSet = EnumSet.noneOf(SteamUGC$ItemState.class);
/*     */     
/* 122 */     for (SteamUGC$ItemState steamUGC$ItemState : values) {
/* 123 */       if ((paramInt & steamUGC$ItemState.bits) == steamUGC$ItemState.bits) {
/* 124 */         enumSet.add(steamUGC$ItemState);
/*     */       }
/*     */     } 
/*     */     
/* 128 */     return enumSet;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGC$ItemState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
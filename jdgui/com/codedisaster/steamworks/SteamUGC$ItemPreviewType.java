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
/*     */ public enum SteamUGC$ItemPreviewType
/*     */ {
/*     */   private final int value;
/*     */   private static final SteamUGC$ItemPreviewType[] values;
/* 147 */   Image(0),
/* 148 */   YouTubeVideo(1),
/* 149 */   Sketchfab(2),
/* 150 */   EnvironmentMap_HorizontalCross(3),
/* 151 */   EnvironmentMap_LatLong(4),
/* 152 */   ReservedMax(255),
/*     */   
/* 154 */   UnknownPreviewType_NotImplementedByAPI(-1);
/*     */   
/*     */   static {
/* 157 */     values = values();
/*     */   }
/*     */   SteamUGC$ItemPreviewType(int paramInt1) {
/* 160 */     this.value = paramInt1;
/*     */   }
/*     */   
/*     */   static SteamUGC$ItemPreviewType byValue(int paramInt) {
/* 164 */     for (SteamUGC$ItemPreviewType steamUGC$ItemPreviewType : values) {
/* 165 */       if (steamUGC$ItemPreviewType.value == paramInt) {
/* 166 */         return steamUGC$ItemPreviewType;
/*     */       }
/*     */     } 
/* 169 */     return UnknownPreviewType_NotImplementedByAPI;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGC$ItemPreviewType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
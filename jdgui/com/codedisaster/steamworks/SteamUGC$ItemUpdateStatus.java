/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamUGC$ItemUpdateStatus
/*    */ {
/*    */   private static final SteamUGC$ItemUpdateStatus[] values;
/* 76 */   Invalid,
/* 77 */   PreparingConfig,
/* 78 */   PreparingContent,
/* 79 */   UploadingContent,
/* 80 */   UploadingPreviewFile,
/* 81 */   CommittingChanges;
/*    */   static {
/* 83 */     values = values();
/*    */   }
/*    */   static SteamUGC$ItemUpdateStatus byOrdinal(int paramInt) {
/* 86 */     return values[paramInt];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGC$ItemUpdateStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
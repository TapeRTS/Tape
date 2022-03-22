/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamUGCCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamUGCCallbackAdapter(SteamUGCCallback paramSteamUGCCallback) {
/*  7 */     super(paramSteamUGCCallback);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   void onUGCQueryCompleted(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
/* 13 */     ((SteamUGCCallback)this.callback).onUGCQueryCompleted(new SteamUGCQuery(paramLong), paramInt1, paramInt2, paramBoolean, 
/* 14 */         SteamResult.byValue(paramInt3));
/*    */   }
/*    */   
/*    */   void onSubscribeItem(long paramLong, int paramInt) {
/* 18 */     ((SteamUGCCallback)this.callback).onSubscribeItem(new SteamPublishedFileID(paramLong), SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onUnsubscribeItem(long paramLong, int paramInt) {
/* 22 */     ((SteamUGCCallback)this.callback).onUnsubscribeItem(new SteamPublishedFileID(paramLong), SteamResult.byValue(paramInt));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   void onRequestUGCDetails(long paramLong1, int paramInt1, String paramString1, String paramString2, long paramLong2, long paramLong3, String paramString3, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong4, int paramInt4, int paramInt5) {
/* 30 */     SteamUGCDetails steamUGCDetails = new SteamUGCDetails();
/* 31 */     steamUGCDetails.publishedFileID = paramLong1;
/* 32 */     steamUGCDetails.result = paramInt1;
/* 33 */     steamUGCDetails.title = paramString1;
/* 34 */     steamUGCDetails.description = paramString2;
/* 35 */     steamUGCDetails.fileHandle = paramLong2;
/* 36 */     steamUGCDetails.previewFileHandle = paramLong3;
/* 37 */     steamUGCDetails.fileName = paramString3;
/* 38 */     steamUGCDetails.votesUp = paramInt2;
/* 39 */     steamUGCDetails.votesDown = paramInt3;
/* 40 */     steamUGCDetails.ownerID = paramLong4;
/* 41 */     steamUGCDetails.timeCreated = paramInt4;
/* 42 */     steamUGCDetails.timeUpdated = paramInt5;
/*    */     
/* 44 */     ((SteamUGCCallback)this.callback).onRequestUGCDetails(steamUGCDetails, SteamResult.byValue(paramInt1));
/*    */   }
/*    */   
/*    */   void onCreateItem(long paramLong, boolean paramBoolean, int paramInt) {
/* 48 */     ((SteamUGCCallback)this.callback).onCreateItem(new SteamPublishedFileID(paramLong), paramBoolean, SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onSubmitItemUpdate(boolean paramBoolean, int paramInt) {
/* 52 */     ((SteamUGCCallback)this.callback).onSubmitItemUpdate(paramBoolean, SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onDownloadItemResult(int paramInt1, long paramLong, int paramInt2) {
/* 56 */     ((SteamUGCCallback)this.callback).onDownloadItemResult(paramInt1, new SteamPublishedFileID(paramLong), SteamResult.byValue(paramInt2));
/*    */   }
/*    */   
/*    */   void onUserFavoriteItemsListChanged(long paramLong, boolean paramBoolean, int paramInt) {
/* 60 */     ((SteamUGCCallback)this.callback).onUserFavoriteItemsListChanged(new SteamPublishedFileID(paramLong), paramBoolean, 
/* 61 */         SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onSetUserItemVote(long paramLong, boolean paramBoolean, int paramInt) {
/* 65 */     ((SteamUGCCallback)this.callback).onSetUserItemVote(new SteamPublishedFileID(paramLong), paramBoolean, SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onGetUserItemVote(long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt) {
/* 69 */     ((SteamUGCCallback)this.callback).onGetUserItemVote(new SteamPublishedFileID(paramLong), paramBoolean1, paramBoolean2, paramBoolean3, 
/* 70 */         SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onStartPlaytimeTracking(int paramInt) {
/* 74 */     ((SteamUGCCallback)this.callback).onStartPlaytimeTracking(SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onStopPlaytimeTracking(int paramInt) {
/* 78 */     ((SteamUGCCallback)this.callback).onStopPlaytimeTracking(SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onStopPlaytimeTrackingForAllItems(int paramInt) {
/* 82 */     ((SteamUGCCallback)this.callback).onStopPlaytimeTrackingForAllItems(SteamResult.byValue(paramInt));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGCCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
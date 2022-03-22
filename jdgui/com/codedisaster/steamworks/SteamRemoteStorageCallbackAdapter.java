/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ class SteamRemoteStorageCallbackAdapter
/*    */   extends SteamCallbackAdapter
/*    */ {
/*    */   SteamRemoteStorageCallbackAdapter(SteamRemoteStorageCallback paramSteamRemoteStorageCallback) {
/*  7 */     super(paramSteamRemoteStorageCallback);
/*    */   }
/*    */   
/*    */   void onFileShareResult(long paramLong, String paramString, int paramInt) {
/* 11 */     ((SteamRemoteStorageCallback)this.callback).onFileShareResult(new SteamUGCHandle(paramLong), paramString, 
/* 12 */         SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onDownloadUGCResult(long paramLong, int paramInt) {
/* 16 */     ((SteamRemoteStorageCallback)this.callback).onDownloadUGCResult(new SteamUGCHandle(paramLong), SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onPublishFileResult(long paramLong, boolean paramBoolean, int paramInt) {
/* 20 */     ((SteamRemoteStorageCallback)this.callback).onPublishFileResult(new SteamPublishedFileID(paramLong), paramBoolean, 
/* 21 */         SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onUpdatePublishedFileResult(long paramLong, boolean paramBoolean, int paramInt) {
/* 25 */     ((SteamRemoteStorageCallback)this.callback).onUpdatePublishedFileResult(new SteamPublishedFileID(paramLong), paramBoolean, 
/* 26 */         SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onPublishedFileSubscribed(long paramLong, int paramInt) {
/* 30 */     ((SteamRemoteStorageCallback)this.callback).onPublishedFileSubscribed(new SteamPublishedFileID(paramLong), paramInt);
/*    */   }
/*    */   
/*    */   void onPublishedFileUnsubscribed(long paramLong, int paramInt) {
/* 34 */     ((SteamRemoteStorageCallback)this.callback).onPublishedFileUnsubscribed(new SteamPublishedFileID(paramLong), paramInt);
/*    */   }
/*    */   
/*    */   void onPublishedFileDeleted(long paramLong, int paramInt) {
/* 38 */     ((SteamRemoteStorageCallback)this.callback).onPublishedFileDeleted(new SteamPublishedFileID(paramLong), paramInt);
/*    */   }
/*    */   
/*    */   void onFileWriteAsyncComplete(int paramInt) {
/* 42 */     ((SteamRemoteStorageCallback)this.callback).onFileWriteAsyncComplete(SteamResult.byValue(paramInt));
/*    */   }
/*    */   
/*    */   void onFileReadAsyncComplete(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
/* 46 */     ((SteamRemoteStorageCallback)this.callback).onFileReadAsyncComplete(new SteamAPICall(paramLong), 
/* 47 */         SteamResult.byValue(paramInt1), paramInt2, paramInt3);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamRemoteStorageCallbackAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
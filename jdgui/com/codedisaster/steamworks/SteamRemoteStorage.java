/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.nio.ByteBuffer;
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
/*     */ public class SteamRemoteStorage
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamRemoteStorage(SteamRemoteStorageCallback paramSteamRemoteStorageCallback) {
/*  77 */     super(SteamAPI.getSteamRemoteStoragePointer(), createCallback(new SteamRemoteStorageCallbackAdapter(paramSteamRemoteStorageCallback)));
/*     */   }
/*     */   
/*     */   public boolean fileWrite(String paramString, ByteBuffer paramByteBuffer, int paramInt) {
/*  81 */     if (!paramByteBuffer.isDirect()) {
/*  82 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*  84 */     return fileWrite(this.pointer, paramString, paramByteBuffer, paramInt);
/*     */   }
/*     */   
/*     */   public boolean fileRead(String paramString, ByteBuffer paramByteBuffer, int paramInt) {
/*  88 */     if (!paramByteBuffer.isDirect()) {
/*  89 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*  91 */     return fileRead(this.pointer, paramString, paramByteBuffer, paramInt);
/*     */   }
/*     */   
/*     */   public SteamAPICall fileWriteAsync(String paramString, ByteBuffer paramByteBuffer) {
/*  95 */     if (!paramByteBuffer.isDirect()) {
/*  96 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*  98 */     return new SteamAPICall(fileWriteAsync(this.pointer, this.callback, paramString, paramByteBuffer, paramByteBuffer.remaining()));
/*     */   }
/*     */   
/*     */   public SteamAPICall fileReadAsync(String paramString, int paramInt1, int paramInt2) {
/* 102 */     return new SteamAPICall(fileReadAsync(this.pointer, this.callback, paramString, paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public boolean fileReadAsyncComplete(SteamAPICall paramSteamAPICall, ByteBuffer paramByteBuffer, int paramInt) {
/* 106 */     return fileReadAsyncComplete(this.pointer, paramSteamAPICall.handle, paramByteBuffer, paramInt);
/*     */   }
/*     */   
/*     */   public boolean fileForget(String paramString) {
/* 110 */     return fileForget(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public boolean fileDelete(String paramString) {
/* 114 */     return fileDelete(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public SteamAPICall fileShare(String paramString) {
/* 118 */     return new SteamAPICall(fileShare(this.pointer, this.callback, paramString));
/*     */   }
/*     */   
/*     */   public boolean setSyncPlatforms(String paramString, SteamRemoteStorage$RemoteStoragePlatform paramSteamRemoteStorage$RemoteStoragePlatform) {
/* 122 */     return setSyncPlatforms(this.pointer, paramString, SteamRemoteStorage$RemoteStoragePlatform.access$000(paramSteamRemoteStorage$RemoteStoragePlatform));
/*     */   }
/*     */   
/*     */   public SteamUGCFileWriteStreamHandle fileWriteStreamOpen(String paramString) {
/* 126 */     return new SteamUGCFileWriteStreamHandle(fileWriteStreamOpen(this.pointer, paramString));
/*     */   }
/*     */   
/*     */   public boolean fileWriteStreamWriteChunk(SteamUGCFileWriteStreamHandle paramSteamUGCFileWriteStreamHandle, ByteBuffer paramByteBuffer, int paramInt) {
/* 130 */     return fileWriteStreamWriteChunk(this.pointer, paramSteamUGCFileWriteStreamHandle.handle, paramByteBuffer, paramInt);
/*     */   }
/*     */   
/*     */   public boolean fileWriteStreamClose(SteamUGCFileWriteStreamHandle paramSteamUGCFileWriteStreamHandle) {
/* 134 */     return fileWriteStreamClose(this.pointer, paramSteamUGCFileWriteStreamHandle.handle);
/*     */   }
/*     */   
/*     */   public boolean fileWriteStreamCancel(SteamUGCFileWriteStreamHandle paramSteamUGCFileWriteStreamHandle) {
/* 138 */     return fileWriteStreamCancel(this.pointer, paramSteamUGCFileWriteStreamHandle.handle);
/*     */   }
/*     */   
/*     */   public boolean fileExists(String paramString) {
/* 142 */     return fileExists(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public boolean filePersisted(String paramString) {
/* 146 */     return filePersisted(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public int getFileSize(String paramString) {
/* 150 */     return getFileSize(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public long getFileTimestamp(String paramString) {
/* 154 */     return getFileTimestamp(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public SteamRemoteStorage$RemoteStoragePlatform[] getSyncPlatforms(String paramString) {
/* 158 */     int i = getSyncPlatforms(this.pointer, paramString);
/* 159 */     return SteamRemoteStorage$RemoteStoragePlatform.byMask(i);
/*     */   }
/*     */   
/*     */   public int getFileCount() {
/* 163 */     return getFileCount(this.pointer);
/*     */   }
/*     */   
/*     */   public String getFileNameAndSize(int paramInt, int[] paramArrayOfint) {
/* 167 */     return getFileNameAndSize(this.pointer, paramInt, paramArrayOfint);
/*     */   }
/*     */   
/*     */   public boolean getQuota(long[] paramArrayOflong1, long[] paramArrayOflong2) {
/* 171 */     return getQuota(this.pointer, paramArrayOflong1, paramArrayOflong2);
/*     */   }
/*     */   
/*     */   public boolean isCloudEnabledForAccount() {
/* 175 */     return isCloudEnabledForAccount(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean isCloudEnabledForApp() {
/* 179 */     return isCloudEnabledForApp(this.pointer);
/*     */   }
/*     */   
/*     */   public void setCloudEnabledForApp(boolean paramBoolean) {
/* 183 */     setCloudEnabledForApp(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   public SteamAPICall ugcDownload(SteamUGCHandle paramSteamUGCHandle, int paramInt) {
/* 187 */     return new SteamAPICall(ugcDownload(this.pointer, this.callback, paramSteamUGCHandle.handle, paramInt));
/*     */   }
/*     */   
/*     */   public boolean getUGCDownloadProgress(SteamUGCHandle paramSteamUGCHandle, int[] paramArrayOfint1, int[] paramArrayOfint2) {
/* 191 */     return getUGCDownloadProgress(this.pointer, paramSteamUGCHandle.handle, paramArrayOfint1, paramArrayOfint2);
/*     */   }
/*     */   
/*     */   public int ugcRead(SteamUGCHandle paramSteamUGCHandle, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, SteamRemoteStorage$UGCReadAction paramSteamRemoteStorage$UGCReadAction) {
/* 195 */     return ugcRead(this.pointer, paramSteamUGCHandle.handle, paramByteBuffer, paramInt1, paramInt2, paramSteamRemoteStorage$UGCReadAction.ordinal());
/*     */   }
/*     */   
/*     */   public int getCachedUGCCount() {
/* 199 */     return getCachedUGCCount(this.pointer);
/*     */   }
/*     */   
/*     */   public SteamUGCHandle getCachedUGCHandle(int paramInt) {
/* 203 */     return new SteamUGCHandle(getCachedUGCHandle(this.pointer, paramInt));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamAPICall publishWorkshopFile(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, SteamRemoteStorage$PublishedFileVisibility paramSteamRemoteStorage$PublishedFileVisibility, String[] paramArrayOfString, SteamRemoteStorage$WorkshopFileType paramSteamRemoteStorage$WorkshopFileType) {
/* 211 */     return new SteamAPICall(publishWorkshopFile(this.pointer, this.callback, paramString1, paramString2, paramInt, paramString3, paramString4, paramSteamRemoteStorage$PublishedFileVisibility
/* 212 */           .ordinal(), paramArrayOfString, (paramArrayOfString != null) ? paramArrayOfString.length : 0, paramSteamRemoteStorage$WorkshopFileType.ordinal()));
/*     */   }
/*     */   
/*     */   public SteamPublishedFileUpdateHandle createPublishedFileUpdateRequest(SteamPublishedFileID paramSteamPublishedFileID) {
/* 216 */     return new SteamPublishedFileUpdateHandle(createPublishedFileUpdateRequest(this.pointer, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public boolean updatePublishedFileFile(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, String paramString) {
/* 220 */     return updatePublishedFileFile(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean updatePublishedFilePreviewFile(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, String paramString) {
/* 224 */     return updatePublishedFilePreviewFile(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean updatePublishedFileTitle(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, String paramString) {
/* 228 */     return updatePublishedFileTitle(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean updatePublishedFileDescription(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, String paramString) {
/* 232 */     return updatePublishedFileDescription(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean updatePublishedFileVisibility(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, SteamRemoteStorage$PublishedFileVisibility paramSteamRemoteStorage$PublishedFileVisibility) {
/* 238 */     return updatePublishedFileVisibility(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramSteamRemoteStorage$PublishedFileVisibility.ordinal());
/*     */   }
/*     */   
/*     */   public boolean updatePublishedFileTags(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle, String[] paramArrayOfString) {
/* 242 */     return updatePublishedFileTags(this.pointer, paramSteamPublishedFileUpdateHandle.handle, paramArrayOfString, (paramArrayOfString != null) ? paramArrayOfString.length : 0);
/*     */   }
/*     */   
/*     */   public SteamAPICall commitPublishedFileUpdate(SteamPublishedFileUpdateHandle paramSteamPublishedFileUpdateHandle) {
/* 246 */     return new SteamAPICall(commitPublishedFileUpdate(this.pointer, this.callback, paramSteamPublishedFileUpdateHandle.handle));
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamRemoteStorageCallbackAdapter paramSteamRemoteStorageCallbackAdapter);
/*     */   
/*     */   private static native boolean fileWrite(long paramLong, String paramString, ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   private static native boolean fileRead(long paramLong, String paramString, ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   private static native long fileWriteAsync(long paramLong1, long paramLong2, String paramString, ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   private static native long fileReadAsync(long paramLong1, long paramLong2, String paramString, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native boolean fileReadAsyncComplete(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   private static native boolean fileForget(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean fileDelete(long paramLong, String paramString);
/*     */   
/*     */   private static native long fileShare(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setSyncPlatforms(long paramLong, String paramString, int paramInt);
/*     */   
/*     */   private static native long fileWriteStreamOpen(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean fileWriteStreamWriteChunk(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt);
/*     */   
/*     */   private static native boolean fileWriteStreamClose(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean fileWriteStreamCancel(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean fileExists(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean filePersisted(long paramLong, String paramString);
/*     */   
/*     */   private static native int getFileSize(long paramLong, String paramString);
/*     */   
/*     */   private static native long getFileTimestamp(long paramLong, String paramString);
/*     */   
/*     */   private static native int getSyncPlatforms(long paramLong, String paramString);
/*     */   
/*     */   private static native int getFileCount(long paramLong);
/*     */   
/*     */   private static native String getFileNameAndSize(long paramLong, int paramInt, int[] paramArrayOfint);
/*     */   
/*     */   private static native boolean getQuota(long paramLong, long[] paramArrayOflong1, long[] paramArrayOflong2);
/*     */   
/*     */   private static native boolean isCloudEnabledForAccount(long paramLong);
/*     */   
/*     */   private static native boolean isCloudEnabledForApp(long paramLong);
/*     */   
/*     */   private static native void setCloudEnabledForApp(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long ugcDownload(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native boolean getUGCDownloadProgress(long paramLong1, long paramLong2, int[] paramArrayOfint1, int[] paramArrayOfint2);
/*     */   
/*     */   private static native int ugcRead(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native int getCachedUGCCount(long paramLong);
/*     */   
/*     */   private static native long getCachedUGCHandle(long paramLong, int paramInt);
/*     */   
/*     */   private static native long publishWorkshopFile(long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, String[] paramArrayOfString, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native long createPublishedFileUpdateRequest(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean updatePublishedFileFile(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean updatePublishedFilePreviewFile(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean updatePublishedFileTitle(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean updatePublishedFileDescription(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean updatePublishedFileVisibility(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean updatePublishedFileTags(long paramLong1, long paramLong2, String[] paramArrayOfString, int paramInt);
/*     */   
/*     */   private static native long commitPublishedFileUpdate(long paramLong1, long paramLong2, long paramLong3);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamRemoteStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
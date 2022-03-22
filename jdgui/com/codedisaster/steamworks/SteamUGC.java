/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamUGC
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamUGC(SteamUGCCallback paramSteamUGCCallback) {
/* 218 */     super(SteamAPI.getSteamUGCPointer(), createCallback(new SteamUGCCallbackAdapter(paramSteamUGCCallback)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamUGCQuery createQueryUserUGCRequest(long paramLong, SteamUGC$UserUGCList paramSteamUGC$UserUGCList, SteamUGC$MatchingUGCType paramSteamUGC$MatchingUGCType, SteamUGC$UserUGCListSortOrder paramSteamUGC$UserUGCListSortOrder, int paramInt1, int paramInt2, int paramInt3) {
/* 225 */     return new SteamUGCQuery(createQueryUserUGCRequest(this.pointer, paramLong, paramSteamUGC$UserUGCList.ordinal(), 
/* 226 */           SteamUGC$MatchingUGCType.access$000(paramSteamUGC$MatchingUGCType), paramSteamUGC$UserUGCListSortOrder.ordinal(), paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamUGCQuery createQueryAllUGCRequest(SteamUGC$UGCQueryType paramSteamUGC$UGCQueryType, SteamUGC$MatchingUGCType paramSteamUGC$MatchingUGCType, int paramInt1, int paramInt2, int paramInt3) {
/* 232 */     return new SteamUGCQuery(createQueryAllUGCRequest(this.pointer, paramSteamUGC$UGCQueryType.ordinal(), SteamUGC$MatchingUGCType.access$000(paramSteamUGC$MatchingUGCType), paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ 
/*     */   
/*     */   public SteamUGCQuery createQueryUGCDetailsRequest(SteamPublishedFileID paramSteamPublishedFileID) {
/* 237 */     long[] arrayOfLong = new long[1];
/* 238 */     arrayOfLong[0] = paramSteamPublishedFileID.handle;
/* 239 */     return new SteamUGCQuery(createQueryUGCDetailsRequest(this.pointer, arrayOfLong, 1));
/*     */   }
/*     */   
/*     */   public SteamUGCQuery createQueryUGCDetailsRequest(Collection paramCollection) {
/* 243 */     int i = paramCollection.size();
/* 244 */     long[] arrayOfLong = new long[i];
/*     */     
/* 246 */     byte b = 0;
/* 247 */     for (SteamPublishedFileID steamPublishedFileID : paramCollection) {
/* 248 */       arrayOfLong[b++] = steamPublishedFileID.handle;
/*     */     }
/*     */     
/* 251 */     return new SteamUGCQuery(createQueryUGCDetailsRequest(this.pointer, arrayOfLong, i));
/*     */   }
/*     */   
/*     */   public SteamAPICall sendQueryUGCRequest(SteamUGCQuery paramSteamUGCQuery) {
/* 255 */     return new SteamAPICall(sendQueryUGCRequest(this.pointer, this.callback, paramSteamUGCQuery.handle));
/*     */   }
/*     */   
/*     */   public boolean getQueryUGCResult(SteamUGCQuery paramSteamUGCQuery, int paramInt, SteamUGCDetails paramSteamUGCDetails) {
/* 259 */     return getQueryUGCResult(this.pointer, paramSteamUGCQuery.handle, paramInt, paramSteamUGCDetails);
/*     */   }
/*     */   
/*     */   public String getQueryUGCPreviewURL(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 263 */     return getQueryUGCPreviewURL(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */   
/*     */   public String getQueryUGCMetadata(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 267 */     return getQueryUGCMetadata(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */   
/*     */   public long getQueryUGCStatistic(SteamUGCQuery paramSteamUGCQuery, int paramInt, SteamUGC$ItemStatistic paramSteamUGC$ItemStatistic) {
/* 271 */     return getQueryUGCStatistic(this.pointer, paramSteamUGCQuery.handle, paramInt, paramSteamUGC$ItemStatistic.ordinal());
/*     */   }
/*     */   
/*     */   public int getQueryUGCNumAdditionalPreviews(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 275 */     return getQueryUGCNumAdditionalPreviews(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getQueryUGCAdditionalPreview(SteamUGCQuery paramSteamUGCQuery, int paramInt1, int paramInt2, SteamUGC$ItemAdditionalPreview paramSteamUGC$ItemAdditionalPreview) {
/* 281 */     return getQueryUGCAdditionalPreview(this.pointer, paramSteamUGCQuery.handle, paramInt1, paramInt2, paramSteamUGC$ItemAdditionalPreview);
/*     */   }
/*     */   
/*     */   public int getQueryUGCNumKeyValueTags(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 285 */     return getQueryUGCNumKeyValueTags(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */   
/*     */   public boolean getQueryUGCKeyValueTag(SteamUGCQuery paramSteamUGCQuery, int paramInt1, int paramInt2, String[] paramArrayOfString) {
/* 289 */     return getQueryUGCKeyValueTag(this.pointer, paramSteamUGCQuery.handle, paramInt1, paramInt2, paramArrayOfString);
/*     */   }
/*     */   
/*     */   public boolean releaseQueryUserUGCRequest(SteamUGCQuery paramSteamUGCQuery) {
/* 293 */     return releaseQueryUserUGCRequest(this.pointer, paramSteamUGCQuery.handle);
/*     */   }
/*     */   
/*     */   public boolean addRequiredTag(SteamUGCQuery paramSteamUGCQuery, String paramString) {
/* 297 */     return addRequiredTag(this.pointer, paramSteamUGCQuery.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean addExcludedTag(SteamUGCQuery paramSteamUGCQuery, String paramString) {
/* 301 */     return addExcludedTag(this.pointer, paramSteamUGCQuery.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setReturnOnlyIDs(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 305 */     return setReturnOnlyIDs(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnKeyValueTags(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 309 */     return setReturnKeyValueTags(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnLongDescription(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 313 */     return setReturnLongDescription(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnMetadata(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 317 */     return setReturnMetadata(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnChildren(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 321 */     return setReturnChildren(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnAdditionalPreviews(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 325 */     return setReturnAdditionalPreviews(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setReturnTotalOnly(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 329 */     return setReturnTotalOnly(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setLanguage(SteamUGCQuery paramSteamUGCQuery, String paramString) {
/* 333 */     return setLanguage(this.pointer, paramSteamUGCQuery.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setAllowCachedResponse(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 337 */     return setAllowCachedResponse(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */   
/*     */   public boolean setCloudFileNameFilter(SteamUGCQuery paramSteamUGCQuery, String paramString) {
/* 341 */     return setCloudFileNameFilter(this.pointer, paramSteamUGCQuery.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setMatchAnyTag(SteamUGCQuery paramSteamUGCQuery, boolean paramBoolean) {
/* 345 */     return setMatchAnyTag(this.pointer, paramSteamUGCQuery.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean setSearchText(SteamUGCQuery paramSteamUGCQuery, String paramString) {
/* 349 */     return setSearchText(this.pointer, paramSteamUGCQuery.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setRankedByTrendDays(SteamUGCQuery paramSteamUGCQuery, int paramInt) {
/* 353 */     return setRankedByTrendDays(this.pointer, paramSteamUGCQuery.handle, paramInt);
/*     */   }
/*     */   
/*     */   public boolean addRequiredKeyValueTag(SteamUGCQuery paramSteamUGCQuery, String paramString1, String paramString2) {
/* 357 */     return addRequiredKeyValueTag(this.pointer, paramSteamUGCQuery.handle, paramString1, paramString2);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public SteamAPICall requestUGCDetails(SteamPublishedFileID paramSteamPublishedFileID, int paramInt) {
/* 362 */     return new SteamAPICall(requestUGCDetails(this.pointer, this.callback, paramSteamPublishedFileID.handle, paramInt));
/*     */   }
/*     */   
/*     */   public SteamAPICall createItem(int paramInt, SteamRemoteStorage$WorkshopFileType paramSteamRemoteStorage$WorkshopFileType) {
/* 366 */     return new SteamAPICall(createItem(this.pointer, this.callback, paramInt, paramSteamRemoteStorage$WorkshopFileType.ordinal()));
/*     */   }
/*     */   
/*     */   public SteamUGCUpdateHandle startItemUpdate(int paramInt, SteamPublishedFileID paramSteamPublishedFileID) {
/* 370 */     return new SteamUGCUpdateHandle(startItemUpdate(this.pointer, paramInt, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public boolean setItemTitle(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 374 */     return setItemTitle(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setItemDescription(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 378 */     return setItemDescription(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setItemUpdateLanguage(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 382 */     return setItemUpdateLanguage(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setItemMetadata(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 386 */     return setItemMetadata(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setItemVisibility(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, SteamRemoteStorage$PublishedFileVisibility paramSteamRemoteStorage$PublishedFileVisibility) {
/* 392 */     return setItemVisibility(this.pointer, paramSteamUGCUpdateHandle.handle, paramSteamRemoteStorage$PublishedFileVisibility.ordinal());
/*     */   }
/*     */   
/*     */   public boolean setItemTags(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String[] paramArrayOfString) {
/* 396 */     return setItemTags(this.pointer, paramSteamUGCUpdateHandle.handle, paramArrayOfString, paramArrayOfString.length);
/*     */   }
/*     */   
/*     */   public boolean setItemContent(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 400 */     return setItemContent(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setItemPreview(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 404 */     return setItemPreview(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean removeItemKeyValueTags(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 408 */     return removeItemKeyValueTags(this.pointer, paramSteamUGCUpdateHandle.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean addItemKeyValueTag(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString1, String paramString2) {
/* 412 */     return addItemKeyValueTag(this.pointer, paramSteamUGCUpdateHandle.handle, paramString1, paramString2);
/*     */   }
/*     */   
/*     */   public SteamAPICall submitItemUpdate(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, String paramString) {
/* 416 */     return new SteamAPICall(submitItemUpdate(this.pointer, this.callback, paramSteamUGCUpdateHandle.handle, paramString));
/*     */   }
/*     */   
/*     */   public SteamUGC$ItemUpdateStatus getItemUpdateProgress(SteamUGCUpdateHandle paramSteamUGCUpdateHandle, SteamUGC$ItemUpdateInfo paramSteamUGC$ItemUpdateInfo) {
/* 420 */     long[] arrayOfLong = new long[2];
/* 421 */     SteamUGC$ItemUpdateStatus steamUGC$ItemUpdateStatus = SteamUGC$ItemUpdateStatus.byOrdinal(getItemUpdateProgress(this.pointer, paramSteamUGCUpdateHandle.handle, arrayOfLong));
/* 422 */     paramSteamUGC$ItemUpdateInfo.bytesProcessed = arrayOfLong[0];
/* 423 */     paramSteamUGC$ItemUpdateInfo.bytesTotal = arrayOfLong[1];
/* 424 */     return steamUGC$ItemUpdateStatus;
/*     */   }
/*     */   
/*     */   public SteamAPICall setUserItemVote(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean) {
/* 428 */     return new SteamAPICall(setUserItemVote(this.pointer, this.callback, paramSteamPublishedFileID.handle, paramBoolean));
/*     */   }
/*     */   
/*     */   public SteamAPICall getUserItemVote(SteamPublishedFileID paramSteamPublishedFileID) {
/* 432 */     return new SteamAPICall(getUserItemVote(this.pointer, this.callback, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall addItemToFavorites(int paramInt, SteamPublishedFileID paramSteamPublishedFileID) {
/* 436 */     return new SteamAPICall(addItemToFavorites(this.pointer, this.callback, paramInt, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall removeItemFromFavorites(int paramInt, SteamPublishedFileID paramSteamPublishedFileID) {
/* 440 */     return new SteamAPICall(removeItemFromFavorites(this.pointer, this.callback, paramInt, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall subscribeItem(SteamPublishedFileID paramSteamPublishedFileID) {
/* 444 */     return new SteamAPICall(subscribeItem(this.pointer, this.callback, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall unsubscribeItem(SteamPublishedFileID paramSteamPublishedFileID) {
/* 448 */     return new SteamAPICall(unsubscribeItem(this.pointer, this.callback, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public int getNumSubscribedItems() {
/* 452 */     return getNumSubscribedItems(this.pointer);
/*     */   }
/*     */   
/*     */   public int getSubscribedItems(SteamPublishedFileID[] paramArrayOfSteamPublishedFileID) {
/* 456 */     long[] arrayOfLong = new long[paramArrayOfSteamPublishedFileID.length];
/* 457 */     int i = getSubscribedItems(this.pointer, arrayOfLong, paramArrayOfSteamPublishedFileID.length);
/*     */     
/* 459 */     for (byte b = 0; b < i; b++) {
/* 460 */       paramArrayOfSteamPublishedFileID[b] = new SteamPublishedFileID(arrayOfLong[b]);
/*     */     }
/*     */     
/* 463 */     return i;
/*     */   }
/*     */   
/*     */   public Collection getItemState(SteamPublishedFileID paramSteamPublishedFileID) {
/* 467 */     return SteamUGC$ItemState.fromBits(getItemState(this.pointer, paramSteamPublishedFileID.handle));
/*     */   }
/*     */   
/*     */   public boolean getItemInstallInfo(SteamPublishedFileID paramSteamPublishedFileID, SteamUGC$ItemInstallInfo paramSteamUGC$ItemInstallInfo) {
/* 471 */     return getItemInstallInfo(this.pointer, paramSteamPublishedFileID.handle, paramSteamUGC$ItemInstallInfo);
/*     */   }
/*     */   
/*     */   public boolean getItemDownloadInfo(SteamPublishedFileID paramSteamPublishedFileID, SteamUGC$ItemDownloadInfo paramSteamUGC$ItemDownloadInfo) {
/* 475 */     long[] arrayOfLong = new long[2];
/* 476 */     if (getItemDownloadInfo(this.pointer, paramSteamPublishedFileID.handle, arrayOfLong)) {
/* 477 */       paramSteamUGC$ItemDownloadInfo.bytesDownloaded = arrayOfLong[0];
/* 478 */       paramSteamUGC$ItemDownloadInfo.bytesTotal = arrayOfLong[1];
/* 479 */       return true;
/*     */     } 
/* 481 */     return false;
/*     */   }
/*     */   
/*     */   public boolean downloadItem(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean) {
/* 485 */     return downloadItem(this.pointer, paramSteamPublishedFileID.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean initWorkshopForGameServer(int paramInt, String paramString) {
/* 489 */     return initWorkshopForGameServer(this.pointer, paramInt, paramString);
/*     */   }
/*     */   
/*     */   public void suspendDownloads(boolean paramBoolean) {
/* 493 */     suspendDownloads(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   public SteamAPICall startPlaytimeTracking(SteamPublishedFileID[] paramArrayOfSteamPublishedFileID) {
/* 497 */     long[] arrayOfLong = new long[paramArrayOfSteamPublishedFileID.length];
/*     */     
/* 499 */     for (byte b = 0; b < arrayOfLong.length; b++) {
/* 500 */       arrayOfLong[b] = (paramArrayOfSteamPublishedFileID[b]).handle;
/*     */     }
/*     */     
/* 503 */     return new SteamAPICall(startPlaytimeTracking(this.pointer, this.callback, arrayOfLong, arrayOfLong.length));
/*     */   }
/*     */   
/*     */   public SteamAPICall stopPlaytimeTracking(SteamPublishedFileID[] paramArrayOfSteamPublishedFileID) {
/* 507 */     long[] arrayOfLong = new long[paramArrayOfSteamPublishedFileID.length];
/*     */     
/* 509 */     for (byte b = 0; b < arrayOfLong.length; b++) {
/* 510 */       arrayOfLong[b] = (paramArrayOfSteamPublishedFileID[b]).handle;
/*     */     }
/*     */     
/* 513 */     return new SteamAPICall(stopPlaytimeTracking(this.pointer, this.callback, arrayOfLong, arrayOfLong.length));
/*     */   }
/*     */   
/*     */   public SteamAPICall stopPlaytimeTrackingForAllItems() {
/* 517 */     return new SteamAPICall(stopPlaytimeTrackingForAllItems(this.pointer, this.callback));
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamUGCCallbackAdapter paramSteamUGCCallbackAdapter);
/*     */   
/*     */   private static native long createQueryUserUGCRequest(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   private static native long createQueryAllUGCRequest(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   private static native long createQueryUGCDetailsRequest(long paramLong, long[] paramArrayOflong, int paramInt);
/*     */   
/*     */   private static native long sendQueryUGCRequest(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean getQueryUGCResult(long paramLong1, long paramLong2, int paramInt, SteamUGCDetails paramSteamUGCDetails);
/*     */   
/*     */   private static native String getQueryUGCPreviewURL(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native String getQueryUGCMetadata(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native long getQueryUGCStatistic(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int getQueryUGCNumAdditionalPreviews(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean getQueryUGCAdditionalPreview(long paramLong1, long paramLong2, int paramInt1, int paramInt2, SteamUGC$ItemAdditionalPreview paramSteamUGC$ItemAdditionalPreview);
/*     */   
/*     */   private static native int getQueryUGCNumKeyValueTags(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean getQueryUGCKeyValueTag(long paramLong1, long paramLong2, int paramInt1, int paramInt2, String[] paramArrayOfString);
/*     */   
/*     */   private static native boolean releaseQueryUserUGCRequest(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean addRequiredTag(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean addExcludedTag(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setReturnOnlyIDs(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnKeyValueTags(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnLongDescription(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnMetadata(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnChildren(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnAdditionalPreviews(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setReturnTotalOnly(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setLanguage(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setAllowCachedResponse(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean setCloudFileNameFilter(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setMatchAnyTag(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean setSearchText(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setRankedByTrendDays(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean addRequiredKeyValueTag(long paramLong1, long paramLong2, String paramString1, String paramString2);
/*     */   
/*     */   private static native long requestUGCDetails(long paramLong1, long paramLong2, long paramLong3, int paramInt);
/*     */   
/*     */   private static native long createItem(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long startItemUpdate(long paramLong1, int paramInt, long paramLong2);
/*     */   
/*     */   private static native boolean setItemTitle(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setItemDescription(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setItemUpdateLanguage(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setItemMetadata(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setItemVisibility(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean setItemTags(long paramLong1, long paramLong2, String[] paramArrayOfString, int paramInt);
/*     */   
/*     */   private static native boolean setItemContent(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setItemPreview(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean removeItemKeyValueTags(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean addItemKeyValueTag(long paramLong1, long paramLong2, String paramString1, String paramString2);
/*     */   
/*     */   private static native long submitItemUpdate(long paramLong1, long paramLong2, long paramLong3, String paramString);
/*     */   
/*     */   private static native int getItemUpdateProgress(long paramLong1, long paramLong2, long[] paramArrayOflong);
/*     */   
/*     */   private static native long setUserItemVote(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
/*     */   
/*     */   private static native long getUserItemVote(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long addItemToFavorites(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*     */   
/*     */   private static native long removeItemFromFavorites(long paramLong1, long paramLong2, int paramInt, long paramLong3);
/*     */   
/*     */   private static native long subscribeItem(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long unsubscribeItem(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native int getNumSubscribedItems(long paramLong);
/*     */   
/*     */   private static native int getSubscribedItems(long paramLong, long[] paramArrayOflong, int paramInt);
/*     */   
/*     */   private static native int getItemState(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean getItemInstallInfo(long paramLong1, long paramLong2, SteamUGC$ItemInstallInfo paramSteamUGC$ItemInstallInfo);
/*     */   
/*     */   private static native boolean getItemDownloadInfo(long paramLong1, long paramLong2, long[] paramArrayOflong);
/*     */   
/*     */   private static native boolean downloadItem(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native boolean initWorkshopForGameServer(long paramLong, int paramInt, String paramString);
/*     */   
/*     */   private static native void suspendDownloads(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native long startPlaytimeTracking(long paramLong1, long paramLong2, long[] paramArrayOflong, int paramInt);
/*     */   
/*     */   private static native long stopPlaytimeTracking(long paramLong1, long paramLong2, long[] paramArrayOflong, int paramInt);
/*     */   
/*     */   private static native long stopPlaytimeTrackingForAllItems(long paramLong1, long paramLong2);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
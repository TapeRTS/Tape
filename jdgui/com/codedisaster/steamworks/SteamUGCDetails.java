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
/*     */ public class SteamUGCDetails
/*     */ {
/*     */   long publishedFileID;
/*     */   int result;
/*     */   int fileType;
/*     */   String title;
/*     */   String description;
/*     */   long ownerID;
/*     */   int timeCreated;
/*     */   int timeUpdated;
/*     */   boolean tagsTruncated;
/*     */   String tags;
/*     */   long fileHandle;
/*     */   long previewFileHandle;
/*     */   String fileName;
/*     */   int fileSize;
/*     */   int previewFileSize;
/*     */   String url;
/*     */   int votesUp;
/*     */   int votesDown;
/*     */   
/*     */   public SteamPublishedFileID getPublishedFileID() {
/*  36 */     return new SteamPublishedFileID(this.publishedFileID);
/*     */   }
/*     */   
/*     */   public SteamResult getResult() {
/*  40 */     return SteamResult.byValue(this.result);
/*     */   }
/*     */   
/*     */   public SteamRemoteStorage$WorkshopFileType getFileType() {
/*  44 */     return SteamRemoteStorage$WorkshopFileType.byOrdinal(this.fileType);
/*     */   }
/*     */   
/*     */   public String getTitle() {
/*  48 */     return this.title;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  52 */     return this.description;
/*     */   }
/*     */   
/*     */   public SteamID getOwnerID() {
/*  56 */     return new SteamID(this.ownerID);
/*     */   }
/*     */   
/*     */   public int getTimeCreated() {
/*  60 */     return this.timeCreated;
/*     */   }
/*     */   
/*     */   public int getTimeUpdated() {
/*  64 */     return this.timeUpdated;
/*     */   }
/*     */   
/*     */   public boolean areTagsTruncated() {
/*  68 */     return this.tagsTruncated;
/*     */   }
/*     */   
/*     */   public String getTags() {
/*  72 */     return this.tags;
/*     */   }
/*     */   
/*     */   public SteamUGCHandle getFileHandle() {
/*  76 */     return new SteamUGCHandle(this.fileHandle);
/*     */   }
/*     */   
/*     */   public SteamUGCHandle getPreviewFileHandle() {
/*  80 */     return new SteamUGCHandle(this.previewFileHandle);
/*     */   }
/*     */   
/*     */   public String getFileName() {
/*  84 */     return this.fileName;
/*     */   }
/*     */   
/*     */   public int getFileSize() {
/*  88 */     return this.fileSize;
/*     */   }
/*     */   
/*     */   public int getPreviewFileSize() {
/*  92 */     return this.previewFileSize;
/*     */   }
/*     */   
/*     */   public String getURL() {
/*  96 */     return this.url;
/*     */   }
/*     */   
/*     */   public int getVotesUp() {
/* 100 */     return this.votesUp;
/*     */   }
/*     */   
/*     */   public int getVotesDown() {
/* 104 */     return this.votesDown;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGCDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
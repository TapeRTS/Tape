/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamNativeHandle;
/*     */ import com.codedisaster.steamworks.SteamPublishedFileID;
/*     */ import com.codedisaster.steamworks.SteamResult;
/*     */ import com.codedisaster.steamworks.SteamUGCCallback;
/*     */ import com.codedisaster.steamworks.SteamUGCDetails;
/*     */ import com.codedisaster.steamworks.SteamUGCQuery;
/*     */ import com.corrodinggames.rts.gameFramework.f.b;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   implements SteamUGCCallback
/*     */ {
/*     */   public h(g paramg) {}
/*     */   
/*     */   public void onUGCQueryCompleted(SteamUGCQuery paramSteamUGCQuery, int paramInt1, int paramInt2, boolean paramBoolean, SteamResult paramSteamResult) {
/*  68 */     a("onUGCQueryCompleted", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onSubscribeItem(SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult) {
/*  73 */     a("onSubscribeItem", paramSteamResult);
/*     */     
/*  75 */     l l = l.u();
/*     */     
/*  77 */     l.bH.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onUnsubscribeItem(SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult) {
/*  82 */     a("onUnsubscribeItem", paramSteamResult);
/*     */     
/*  84 */     l l = l.u();
/*     */     
/*  86 */     l.bH.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRequestUGCDetails(SteamUGCDetails paramSteamUGCDetails, SteamResult paramSteamResult) {
/*  91 */     a("onRequestUGCDetails", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onCreateItem(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult) {
/*  96 */     a("onCreateItem", paramSteamResult);
/*     */ 
/*     */ 
/*     */     
/* 100 */     if (this.a.d == null) {
/*     */       
/* 102 */       this.a.a((b)null, "Error no mod pending creation!", false);
/*     */       
/*     */       return;
/*     */     } 
/* 106 */     if (this.a.d.d != 0L) {
/*     */       
/* 108 */       this.a.a(this.a.d, "This mod has already been published", true);
/*     */       
/*     */       return;
/*     */     } 
/* 112 */     this.a.d.a(SteamNativeHandle.getNativeHandle((SteamNativeHandle)paramSteamPublishedFileID));
/*     */ 
/*     */     
/* 115 */     this.a.a(this.a.d, true, "Created.");
/*     */     
/* 117 */     this.a.d = null;
/*     */ 
/*     */ 
/*     */     
/* 121 */     l l = l.u();
/* 122 */     l.bH.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onSubmitItemUpdate(boolean paramBoolean, SteamResult paramSteamResult) {
/* 128 */     a("onSubmitItemUpdate", paramSteamResult);
/*     */     
/* 130 */     String str = "";
/*     */     
/* 132 */     if (paramSteamResult == SteamResult.OK) {
/*     */       
/* 134 */       str = "Workshop item updated.";
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */       
/* 142 */       str = "Workshop returned: " + paramSteamResult;
/*     */     } 
/*     */     
/* 145 */     if (paramBoolean)
/*     */     {
/* 147 */       str = str + "WLA agreement needs to be accepted on the workshop site.";
/*     */     }
/* 149 */     l.u().h(str);
/*     */ 
/*     */     
/* 152 */     l l = l.u();
/* 153 */     l.bH.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDownloadItemResult(int paramInt, SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult) {
/* 158 */     a("onDownloadItemResult", paramSteamResult);
/*     */ 
/*     */     
/* 161 */     l l = l.u();
/* 162 */     l.bH.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUserFavoriteItemsListChanged(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult) {
/* 168 */     a("onUserFavoriteItemsListChanged", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onSetUserItemVote(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult) {
/* 173 */     a("onSetUserItemVote", paramSteamResult);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onGetUserItemVote(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, SteamResult paramSteamResult) {
/* 179 */     a("onGetUserItemVote", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onStartPlaytimeTracking(SteamResult paramSteamResult) {
/* 184 */     a("onStartPlaytimeTracking", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onStopPlaytimeTracking(SteamResult paramSteamResult) {
/* 189 */     a("onStopPlaytimeTracking", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onStopPlaytimeTrackingForAllItems(SteamResult paramSteamResult) {
/* 194 */     a("onStopPlaytimeTrackingForAllItems", paramSteamResult);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String paramString, SteamResult paramSteamResult) {
/* 199 */     l.d("Got workshop callback: " + paramString + " (" + paramSteamResult + ")");
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
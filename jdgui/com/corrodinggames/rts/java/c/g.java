/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamAPICall;
/*     */ import com.codedisaster.steamworks.SteamNativeHandle;
/*     */ import com.codedisaster.steamworks.SteamPublishedFileID;
/*     */ import com.codedisaster.steamworks.SteamRemoteStorage;
/*     */ import com.codedisaster.steamworks.SteamUGC;
/*     */ import com.codedisaster.steamworks.SteamUGCCallback;
/*     */ import com.codedisaster.steamworks.SteamUGCUpdateHandle;
/*     */ import com.corrodinggames.rts.gameFramework.f.b;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ public class g
/*     */ {
/*     */   b a;
/*     */   SteamUGCCallback b;
/*     */   SteamUGC c;
/*     */   b d;
/*     */   
/*     */   public g(b paramb) {
/*  45 */     this.a = paramb;
/*     */     
/*  47 */     this.b = new h(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(SteamUGC paramSteamUGC) {
/*  53 */     this.c = paramSteamUGC;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamUGCCallback a() {
/*  59 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(b paramb, String paramString, boolean paramBoolean) {
/* 207 */     l.d("workshop: " + paramString);
/*     */ 
/*     */     
/* 210 */     if (paramBoolean)
/*     */     {
/* 212 */       l.u().h(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(b paramb) {
/* 221 */     if (paramb.h == null) {
/*     */       
/* 223 */       a(paramb, "A title is required in the file 'mod-info.txt'", true);
/* 224 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 229 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(b paramb) {
/* 234 */     if (this.d != null) {
/*     */       
/* 236 */       a(paramb, "A mod is already pending publishing", false);
/*     */       
/*     */       return;
/*     */     } 
/* 240 */     if (paramb.d != 0L) {
/*     */       
/* 242 */       a(paramb, "This mod has already been published", false);
/*     */       
/*     */       return;
/*     */     } 
/* 246 */     if (!a(paramb)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 252 */     if (!paramb.a(0L)) {
/*     */       
/* 254 */       a(paramb, "Failed to write metadata to mod, check file permissions", true);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 259 */     this.d = paramb;
/*     */     
/* 261 */     int i = this.a.j.getAppID();
/*     */     
/* 263 */     SteamAPICall steamAPICall = this.c.createItem(i, SteamRemoteStorage.WorkshopFileType.Community);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(b paramb, boolean paramBoolean, String paramString) {
/* 284 */     if (!a(paramb)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     int i = this.a.j.getAppID();
/*     */     
/* 293 */     SteamPublishedFileID steamPublishedFileID = new SteamPublishedFileID(paramb.d);
/*     */ 
/*     */     
/* 296 */     SteamUGCUpdateHandle steamUGCUpdateHandle = this.c.startItemUpdate(i, steamPublishedFileID);
/*     */ 
/*     */     
/* 299 */     if (paramBoolean) {
/*     */       
/* 301 */       if (paramb.h != null)
/*     */       {
/* 303 */         this.c.setItemTitle(steamUGCUpdateHandle, paramb.h);
/*     */       }
/*     */       
/* 306 */       if (paramb.i != null)
/*     */       {
/* 308 */         this.c.setItemDescription(steamUGCUpdateHandle, paramb.i);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 313 */     if (paramBoolean)
/*     */     {
/* 315 */       this.c.setItemVisibility(steamUGCUpdateHandle, SteamRemoteStorage.PublishedFileVisibility.Public);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     String str1 = paramb.n();
/*     */     
/* 326 */     if (str1 != null)
/*     */     {
/* 328 */       this.c.setItemPreview(steamUGCUpdateHandle, str1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 335 */     String str2 = paramb.c("tags");
/* 336 */     if (str2 != null) {
/*     */       
/* 338 */       String[] arrayOfString = str2.split(",");
/*     */       
/* 340 */       for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
/*     */         
/* 342 */         arrayOfString[b1] = arrayOfString[b1].trim();
/* 343 */         l.d("Adding tag:" + arrayOfString[b1]);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 348 */       this.c.setItemTags(steamUGCUpdateHandle, arrayOfString);
/*     */     } 
/*     */ 
/*     */     
/* 352 */     String str3 = paramb.g();
/*     */     
/* 354 */     l.d("convertedAbsolutePath:" + str3);
/*     */ 
/*     */     
/* 357 */     this.c.setItemContent(steamUGCUpdateHandle, str3);
/*     */     
/* 359 */     paramb.A = "Uploading to workshop";
/*     */ 
/*     */ 
/*     */     
/* 363 */     this.c.submitItemUpdate(steamUGCUpdateHandle, paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     l.d("submitted item update for:" + paramb.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 380 */     int i = this.a.j.getAppID();
/*     */     
/* 382 */     this.a.c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(b paramb) {
/* 394 */     this.a.c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + paramb.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long a(SteamPublishedFileID paramSteamPublishedFileID) {
/* 401 */     return SteamNativeHandle.getNativeHandle((SteamNativeHandle)paramSteamPublishedFileID);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 406 */     l l = l.u();
/*     */     
/* 408 */     l.d("--------------");
/* 409 */     l.d("Steam: loadWorkshopMods");
/*     */     
/* 411 */     int i = this.c.getNumSubscribedItems();
/*     */     
/* 413 */     SteamPublishedFileID[] arrayOfSteamPublishedFileID = new SteamPublishedFileID[i];
/*     */     
/* 415 */     this.c.getSubscribedItems(arrayOfSteamPublishedFileID);
/*     */ 
/*     */     
/* 418 */     for (SteamPublishedFileID steamPublishedFileID : arrayOfSteamPublishedFileID) {
/*     */ 
/*     */ 
/*     */       
/* 422 */       Collection collection = this.c.getItemState(steamPublishedFileID);
/*     */ 
/*     */ 
/*     */       
/* 426 */       long l1 = a(steamPublishedFileID);
/*     */ 
/*     */       
/* 429 */       l.d("Found workshop item " + l1);
/*     */       
/* 431 */       boolean bool1 = false;
/* 432 */       boolean bool2 = false;
/* 433 */       boolean bool3 = false;
/* 434 */       boolean bool4 = false;
/*     */       
/* 436 */       for (SteamUGC.ItemState itemState : collection) {
/*     */         
/* 438 */         l.d("itemState: " + itemState);
/*     */         
/* 440 */         if (itemState == SteamUGC.ItemState.Downloading || itemState == SteamUGC.ItemState.DownloadPending)
/*     */         {
/* 442 */           bool2 = true;
/*     */         }
/* 444 */         if (itemState == SteamUGC.ItemState.Installed)
/*     */         {
/* 446 */           bool1 = true;
/*     */         }
/* 448 */         if (itemState == SteamUGC.ItemState.NeedsUpdate)
/*     */         {
/* 450 */           bool3 = true;
/*     */         }
/*     */         
/* 453 */         if (itemState == SteamUGC.ItemState.Subscribed)
/*     */         {
/* 455 */           bool4 = true;
/*     */         }
/*     */       } 
/*     */       
/* 459 */       String str1 = "sw" + l1;
/* 460 */       String str2 = str1;
/* 461 */       String str3 = null;
/*     */       
/* 463 */       String str4 = null;
/*     */       
/* 465 */       if (!bool4) {
/*     */ 
/*     */         
/* 468 */         l.d("Skipping: " + l1 + " as it is not subscribed");
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 473 */         if (bool1) {
/*     */ 
/*     */           
/* 476 */           SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
/* 477 */           this.c.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
/*     */           
/* 479 */           str3 = itemInstallInfo.getFolder();
/*     */           
/* 481 */           l.d("Installed at:" + str3);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 492 */           str4 = "Not installed";
/*     */           
/* 494 */           if (bool3)
/*     */           {
/* 496 */             str4 = "Update needed";
/*     */           }
/*     */           
/* 499 */           if (bool2)
/*     */           {
/* 501 */             str4 = "Downloading files";
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 506 */         boolean bool5 = true;
/* 507 */         boolean bool6 = true;
/* 508 */         boolean bool7 = false;
/*     */ 
/*     */ 
/*     */         
/* 512 */         b b1 = l.bH.a(str1, str3, str2, bool5, bool6, bool7);
/*     */         
/* 514 */         if (b1.z == null)
/*     */         {
/* 516 */           b1.z = str4;
/*     */         }
/*     */ 
/*     */         
/* 520 */         if ((!bool1 || bool3) && !bool2) {
/*     */           
/* 522 */           l.d("Queuing download");
/* 523 */           this.c.downloadItem(steamPublishedFileID, false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
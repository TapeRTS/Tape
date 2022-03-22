/*     */ package com.corrodinggames.librocket.scripts;
/*     */ 
/*     */ import com.Element;
/*     */ import com.ElementDocument;
/*     */ import com.corrodinggames.rts.game.units.custom.ac;
/*     */ import com.corrodinggames.rts.gameFramework.f.b;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.l.a;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Mods
/*     */   extends ScriptContext
/*     */ {
/*     */   Root root;
/*     */   
/*     */   Mods(Root paramRoot) {
/*  26 */     this.root = paramRoot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public a getSteam() {
/*  32 */     a a = a.a();
/*     */     
/*  34 */     if (!a.e()) {
/*     */       
/*  36 */       a.h();
/*  37 */       return null;
/*     */     } 
/*     */ 
/*     */     
/*  41 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void openWorkshop() {
/*  50 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     a a = getSteam();
/*  56 */     if (a == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  62 */     a.l();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void uploadModAsk(String paramString) {
/*  70 */     l l = l.u();
/*     */ 
/*     */     
/*  73 */     if (l.j()) {
/*     */       
/*  75 */       this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  83 */     b b = l.bH.a(paramString);
/*     */     
/*  85 */     if (b == null) {
/*     */       
/*  87 */       this.root.showAlert("Could not find mod:" + paramString);
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  93 */     a a = getSteam();
/*  94 */     if (a == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  99 */     String str1 = "Are you sure you want to upload to the workshop?";
/*     */     
/* 101 */     String str2 = "";
/*     */ 
/*     */ 
/*     */     
/* 105 */     String str3 = "[onenter]Upload:";
/* 106 */     str3 = str3 + "closePopup(); mods.uploadMod('" + paramString + "');";
/*     */     
/* 108 */     boolean bool = true;
/* 109 */     this.root.showPopup(str1, str2, bool, str3, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void uploadMod(String paramString) {
/* 115 */     l l = l.u();
/*     */     
/* 117 */     b b = l.bH.a(paramString);
/*     */     
/* 119 */     if (b == null) {
/*     */       
/* 121 */       this.root.showAlert("Could not find mod:" + paramString);
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 129 */     a a = getSteam();
/* 130 */     if (a == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 136 */     if (b.d == 0L) {
/*     */ 
/*     */ 
/*     */       
/* 140 */       a.b(b);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 145 */     String str = "Changes.";
/*     */     
/* 147 */     a.a(b, false, str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void viewMod(String paramString) {
/* 156 */     l l = l.u();
/*     */     
/* 158 */     b b = l.bH.a(paramString);
/*     */     
/* 160 */     if (b == null) {
/*     */       
/* 162 */       this.root.showAlert("Could not find mod:" + paramString);
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 169 */     a a = getSteam();
/* 170 */     if (a == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 176 */     a.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void loadMods() {
/* 186 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*     */     
/* 188 */     l l = l.u();
/*     */     
/* 190 */     l.d("loadMods");
/*     */ 
/*     */     
/* 193 */     Element element1 = elementDocument.getElementById("modTemplate");
/* 194 */     Element element2 = elementDocument.getElementById("modList");
/*     */     
/* 196 */     String str1 = element1.getInnerRML();
/*     */     
/* 198 */     String str2 = "";
/*     */ 
/*     */     
/* 201 */     ArrayList arrayList = l.bH.i();
/*     */ 
/*     */     
/* 204 */     byte b = 0;
/* 205 */     for (b b1 : arrayList) {
/*     */ 
/*     */ 
/*     */       
/* 209 */       String str3 = str1;
/*     */       
/* 211 */       String str4 = b1.a();
/*     */       
/* 213 */       String str5 = "";
/*     */ 
/*     */       
/* 216 */       str3 = str3.replace("_NAME_", this.root.htmlString(str4));
/*     */       
/* 218 */       str3 = str3.replace("_ID_", b1.b);
/*     */ 
/*     */       
/* 221 */       String str6 = b1.z;
/*     */       
/* 223 */       if (str6 == null) {
/*     */         
/* 225 */         str6 = "";
/*     */       }
/*     */       else {
/*     */         
/* 229 */         str5 = str5 + " modItemError";
/*     */       } 
/*     */       
/* 232 */       if (b1.d == 0L) {
/*     */         
/* 234 */         if (!b1.j && !b1.k)
/*     */         {
/* 236 */           str5 = str5 + " modItemCanBePublished";
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 241 */         if (!b1.j)
/*     */         {
/* 243 */           str5 = str5 + " modItemIsOwner";
/*     */         }
/*     */         
/* 246 */         str5 = str5 + " modItemIsPublished";
/*     */       } 
/*     */       
/* 249 */       if (b1.l)
/*     */       {
/* 251 */         str5 = str5 + " modItemHasMaps";
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 256 */       String str7 = b1.j();
/*     */       
/* 258 */       if (str7 == null)
/*     */       {
/* 260 */         str7 = "";
/*     */       }
/*     */ 
/*     */       
/* 264 */       String str8 = b1.d();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 271 */       str3 = str3.replace("_ERROR_", this.root.htmlString(str6));
/*     */       
/* 273 */       str3 = str3.replace("_MESSAGE_", this.root.htmlString(str7));
/*     */       
/* 275 */       str3 = str3.replace("_DESCRIPTION_", this.root.htmlString(str8));
/*     */ 
/*     */       
/* 278 */       str3 = str3.replace("_CLASS_", str5);
/*     */ 
/*     */       
/* 281 */       b++;
/* 282 */       str2 = str2 + str3;
/*     */     } 
/*     */ 
/*     */     
/* 286 */     element2.setInnerRML(str2);
/*     */     
/* 288 */     element2.loadCharsetIfNeeded(str2);
/*     */ 
/*     */ 
/*     */     
/* 292 */     for (b b1 : arrayList) {
/*     */       
/* 294 */       Element element = elementDocument.getElementById(b1.b);
/*     */       
/* 296 */       if (element == null) {
/*     */         
/* 298 */         l.b("Could not find:" + b1.a);
/*     */         
/*     */         continue;
/*     */       } 
/* 302 */       element.setCheckbox(!b1.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void saveMods() {
/* 313 */     _saveModsCommon(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void _saveModsCommon(boolean paramBoolean) {
/* 319 */     boolean bool = false;
/*     */ 
/*     */     
/* 322 */     ElementDocument elementDocument = this.libRocket.getActiveDocument();
/*     */     
/* 324 */     l l = l.u();
/*     */     
/* 326 */     l.d("savesMods");
/*     */     
/* 328 */     ArrayList arrayList = elementDocument.findElementsByClassName("modSelection");
/*     */     
/* 330 */     for (Element element : arrayList) {
/*     */ 
/*     */       
/* 333 */       String str = element.getId();
/*     */       
/* 335 */       if (str.equals("_ID_")) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 341 */       b b = l.bH.a(str);
/*     */       
/* 343 */       if (b == null) {
/*     */         
/* 345 */         this.root.showAlert("Could not find mod:" + element.getInnerRML());
/*     */         
/*     */         continue;
/*     */       } 
/* 349 */       boolean bool1 = !element.getCheckbox();
/*     */       
/* 351 */       if (b.c != bool1)
/*     */       {
/* 353 */         bool = true;
/*     */       }
/*     */       
/* 356 */       b.c = bool1;
/*     */     } 
/*     */     
/* 359 */     if (bool) {
/*     */       
/* 361 */       l.d("mod changes made");
/*     */     }
/*     */     else {
/*     */       
/* 365 */       l.d("no mod changes made");
/*     */     } 
/*     */ 
/*     */     
/* 369 */     l.bH.c();
/*     */     
/* 371 */     l.by.save();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 376 */     if (paramBoolean)
/*     */     {
/* 378 */       _saveModsMessages();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void _saveModsMessages() {
/* 385 */     l l = l.u();
/*     */ 
/*     */     
/* 388 */     int i = l.bH.b();
/*     */     
/* 390 */     if (l.bF.z) {
/*     */       
/* 392 */       l.d("savesMods: in network game");
/* 393 */       this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 399 */     else if (ac.c(true)) {
/*     */ 
/*     */       
/* 402 */       if (i == 0)
/*     */       {
/* 404 */         this.root.showAlert("Mod changes saved. Will be used in the next game.");
/*     */       
/*     */       }
/*     */       else
/*     */       {
/*     */         
/* 410 */         String str1 = "Reload needed";
/*     */         
/* 412 */         String str2 = "Mod selection saved. But " + i + " mod(s) aren't loaded. Load them now?";
/*     */         
/* 414 */         if (!l.B())
/*     */         {
/* 416 */           str2 = str2 + " (This will end your current game).";
/*     */         }
/*     */         
/* 419 */         String str3 = "[onenter]Reload:";
/* 420 */         str3 = str3 + "closePopup(); mods.reloadModData();";
/*     */         
/* 422 */         boolean bool = true;
/* 423 */         this.root.showPopup(str1, str2, bool, str3, null);
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 431 */       l.d("Errors found");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void disableAllAsk() {
/* 439 */     String str1 = "Disable all mods?";
/*     */ 
/*     */     
/* 442 */     String str2 = "";
/*     */     
/* 444 */     String str3 = "[onenter]Disable All:";
/* 445 */     str3 = str3 + "closePopup(); mods.disableAll();";
/*     */     
/* 447 */     boolean bool = true;
/* 448 */     this.root.showPopup(str1, str2, bool, str3, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void disableAll() {
/* 453 */     l l = l.u();
/*     */ 
/*     */     
/* 456 */     l.bH.e();
/*     */     
/* 458 */     l.bH.c();
/* 459 */     l.by.save();
/*     */     
/* 461 */     l.bH.j();
/* 462 */     loadMods();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reloadModDataAsk() {
/* 469 */     l l = l.u();
/*     */ 
/*     */     
/* 472 */     if (l.B()) {
/*     */       
/* 474 */       l.d("Menu active, reloading without asking");
/* 475 */       reloadModData();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 480 */     String str1 = "Reload all mod data?";
/*     */ 
/*     */     
/* 483 */     String str2 = "";
/*     */ 
/*     */     
/* 486 */     str2 = str2 + "Warning! this will end your current game.";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     String str3 = "[onenter]Reload:";
/* 492 */     str3 = str3 + "closePopup(); mods.reloadModData();";
/*     */     
/* 494 */     boolean bool = true;
/* 495 */     this.root.showPopup(str1, str2, bool, str3, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reloadModData() {
/* 505 */     l l = l.u();
/*     */     
/* 507 */     _saveModsCommon(false);
/*     */     
/* 509 */     l.bH.j();
/*     */     
/* 511 */     _saveModsMessages();
/*     */     
/* 513 */     loadMods();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\Mods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
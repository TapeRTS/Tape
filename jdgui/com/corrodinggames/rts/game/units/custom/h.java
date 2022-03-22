/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class h
/*     */ {
/*     */   final String a;
/*     */   
/*     */   private h(String paramString) {
/*  18 */     this.a = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  25 */     return this.a;
/*     */   }
/*     */   
/*  28 */   public static ArrayList b = new ArrayList();
/*     */   
/*  30 */   public static final h[] c = new h[0];
/*     */   
/*  32 */   public static final i d = new i(c);
/*     */ 
/*     */ 
/*     */   
/*     */   public static i a(String paramString) {
/*  37 */     return a(paramString, (i)null);
/*     */   }
/*     */   
/*     */   public static i a(String paramString, i parami) {
/*  41 */     if (paramString == null)
/*     */     {
/*  43 */       return parami;
/*     */     }
/*  45 */     if (paramString.trim().equals(""))
/*     */     {
/*  47 */       return parami;
/*     */     }
/*     */     
/*  50 */     ArrayList<h> arrayList = new ArrayList();
/*     */     
/*  52 */     for (String str : paramString.split(",")) {
/*     */       
/*  54 */       str = str.trim();
/*  55 */       if (!str.equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  60 */         h h1 = c(str);
/*     */         
/*  62 */         if (!arrayList.contains(h1))
/*     */         {
/*  64 */           arrayList.add(h1); } 
/*     */       } 
/*     */     } 
/*  67 */     if (arrayList.size() == 0)
/*     */     {
/*  69 */       return parami;
/*     */     }
/*     */     
/*  72 */     return new i(arrayList.<h>toArray(new h[0]));
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
/*     */   public static h b(String paramString) {
/* 107 */     paramString = paramString.trim();
/*     */     
/* 109 */     if (paramString.contains(","))
/*     */     {
/* 111 */       throw new at("Expected single tag, got:" + paramString);
/*     */     }
/*     */     
/* 114 */     return c(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static h c(String paramString) {
/* 123 */     paramString = paramString.trim();
/* 124 */     paramString = paramString.toLowerCase(Locale.ROOT);
/*     */ 
/*     */     
/* 127 */     for (h h2 : b) {
/*     */       
/* 129 */       if (h2.a.equals(paramString))
/*     */       {
/* 131 */         return h2;
/*     */       }
/*     */     } 
/*     */     
/* 135 */     h h1 = new h(paramString);
/*     */     
/* 137 */     b.add(h1);
/*     */     
/* 139 */     return h1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(i parami, ap paramap) {
/* 364 */     if (parami == null) {
/*     */       
/* 366 */       paramap.b(null);
/*     */     }
/* 368 */     else if (parami.a.length == 0) {
/*     */       
/* 370 */       paramap.b("");
/*     */     }
/*     */     else {
/*     */       
/* 374 */       StringBuilder stringBuilder = new StringBuilder();
/*     */       
/* 376 */       boolean bool = true;
/*     */       
/* 378 */       for (h h1 : parami.a) {
/*     */         
/* 380 */         if (!bool)
/*     */         {
/* 382 */           stringBuilder.append(",");
/*     */         }
/* 384 */         bool = false;
/*     */         
/* 386 */         stringBuilder.append(h1.a);
/*     */       } 
/*     */       
/* 389 */       paramap.b(stringBuilder.toString());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static i a(k paramk) {
/* 395 */     String str = paramk.j();
/* 396 */     if (str == null)
/*     */     {
/* 398 */       return null;
/*     */     }
/*     */     
/* 401 */     return a(str, d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(i parami1, i parami2) {
/* 409 */     if (parami2 == null)
/*     */     {
/* 411 */       return false;
/*     */     }
/*     */     
/* 414 */     h[] arrayOfH1 = parami1.a;
/* 415 */     int j = arrayOfH1.length;
/*     */     
/* 417 */     h[] arrayOfH2 = parami2.a;
/* 418 */     int k = arrayOfH2.length;
/*     */     
/* 420 */     for (byte b = 0; b < j; b++) {
/*     */       
/* 422 */       for (byte b1 = 0; b1 < k; b1++) {
/*     */         
/* 424 */         if (arrayOfH1[b] == arrayOfH2[b1])
/*     */         {
/* 426 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 430 */     return false;
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
/*     */   public static boolean a(h paramh, i parami) {
/* 455 */     if (parami == null)
/*     */     {
/* 457 */       return false;
/*     */     }
/*     */     
/* 460 */     h[] arrayOfH = parami.a;
/* 461 */     int j = arrayOfH.length;
/*     */     
/* 463 */     for (byte b = 0; b < j; b++) {
/*     */       
/* 465 */       if (arrayOfH[b] == paramh)
/*     */       {
/* 467 */         return true;
/*     */       }
/*     */     } 
/* 470 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(i parami1, i parami2) {
/* 478 */     if (parami2 == null) {
/*     */       
/* 480 */       if (parami1 == null || parami1.b() == 0)
/*     */       {
/* 482 */         return true;
/*     */       }
/* 484 */       return false;
/*     */     } 
/*     */     
/* 487 */     h[] arrayOfH1 = parami1.a;
/* 488 */     int j = arrayOfH1.length;
/*     */     
/* 490 */     h[] arrayOfH2 = parami2.a;
/* 491 */     int k = arrayOfH2.length;
/*     */ 
/*     */     
/* 494 */     for (byte b = 0; b < j; b++) {
/*     */       
/* 496 */       boolean bool = false;
/*     */       
/* 498 */       for (byte b1 = 0; b1 < k; b1++) {
/*     */         
/* 500 */         if (arrayOfH1[b] == arrayOfH2[b1]) {
/*     */           
/* 502 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 506 */       if (!bool)
/*     */       {
/* 508 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 513 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.custom.e;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*  23 */   static final Pattern a = Pattern.compile("\\$\\{([^\\}]*)\\}");
/*     */   
/*  25 */   static final Pattern b = Pattern.compile("[A-Za-z_][A-Za-z_.0-9]*");
/*     */   
/*  27 */   static b c = new b();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab) {
/* 371 */     byte b1 = 0;
/*     */ 
/*     */     
/* 374 */     c.a();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     m m = paramab.d("@global ");
/* 380 */     for (String str : m) {
/*     */       
/* 382 */       for (String str1 : paramab.j(str, "@global ")) {
/*     */         
/* 384 */         String str2 = str1.substring("@global ".length()).trim();
/*     */ 
/*     */         
/*     */         try {
/* 388 */           d.a(str2);
/*     */         }
/* 390 */         catch (at at) {
/*     */           
/* 392 */           throw new at("[" + str + "]" + str1 + ": " + at.getMessage());
/*     */         } 
/*     */         
/* 395 */         if (paramab.f(str2))
/*     */         {
/* 397 */           throw new at("[" + str + "]" + str1 + ": A section already has that name");
/*     */         }
/*     */ 
/*     */         
/* 401 */         String str3 = paramab.e(str, str1);
/*     */         
/* 403 */         if (str3.contains("${"))
/*     */         {
/* 405 */           throw new at("[" + str + "]" + str1 + " has dynamic value: '" + str3 + "', this is not yet supported");
/*     */         }
/*     */         
/* 408 */         c.a.a(str2, str3);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 413 */     ArrayList<c> arrayList = new ArrayList();
/*     */ 
/*     */ 
/*     */     
/* 417 */     LinkedHashMap linkedHashMap = paramab.c();
/* 418 */     for (String str : linkedHashMap.keySet()) {
/*     */ 
/*     */       
/* 421 */       if (str == null || str.startsWith("comment_") || str.startsWith("template_")) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 426 */       b b2 = c.b();
/*     */ 
/*     */       
/* 429 */       for (String str1 : paramab.j(str, "@define ")) {
/*     */         
/* 431 */         String str2 = str1.substring("@define ".length()).trim();
/*     */         
/*     */         try {
/* 434 */           d.a(str2);
/*     */         }
/* 436 */         catch (at at) {
/*     */           
/* 438 */           throw new at("[" + str + "]" + str1 + ": " + at.getMessage());
/*     */         } 
/*     */         
/* 441 */         if (paramab.f(str2))
/*     */         {
/* 443 */           throw new at("[" + str + "]" + str1 + ": A section already has that name");
/*     */         }
/*     */         
/* 446 */         String str3 = paramab.e(str, str1);
/*     */         
/* 448 */         if (str3.contains("${"))
/*     */         {
/* 450 */           throw new at("[" + str + "]" + str1 + " has dynamic value: '" + str3 + "', this is not yet supported");
/*     */         }
/*     */         
/* 453 */         b2.b.a(str2, str3);
/*     */       } 
/*     */ 
/*     */       
/* 457 */       Map map = (Map)linkedHashMap.get(str);
/*     */       
/* 459 */       for (String str1 : map.keySet()) {
/*     */         
/* 461 */         String str2 = (String)map.get(str1);
/* 462 */         if (str2 == null || !str2.contains("${")) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/* 467 */         byte b3 = 0;
/*     */ 
/*     */         
/* 470 */         StringBuffer stringBuffer = new StringBuffer();
/*     */ 
/*     */         
/* 473 */         Matcher matcher = a.matcher(str2);
/* 474 */         while (matcher.find()) {
/*     */           String str4;
/* 476 */           b3++;
/* 477 */           if (b3 > 100)
/*     */           {
/* 479 */             throw new at("[" + str + "]" + str1 + ": Too many loops while parsing");
/*     */           }
/*     */           
/* 482 */           String str3 = matcher.group(1);
/*     */ 
/*     */ 
/*     */           
/* 486 */           b1++;
/*     */ 
/*     */ 
/*     */           
/*     */           try {
/* 491 */             str4 = b2.a(paraml, paramab, str, str3);
/*     */           }
/* 493 */           catch (at at) {
/*     */             
/* 495 */             at.printStackTrace();
/* 496 */             throw new at("[" + str + "]" + str1 + ": " + at.getMessage());
/*     */           } 
/*     */ 
/*     */           
/* 500 */           if (!str3.equals(str4))
/*     */           {
/* 502 */             str3 = str4;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/* 507 */           matcher.appendReplacement(stringBuffer, str4);
/*     */         } 
/*     */ 
/*     */         
/* 511 */         matcher.appendTail(stringBuffer);
/* 512 */         str2 = stringBuffer.toString();
/*     */ 
/*     */ 
/*     */         
/* 516 */         arrayList.add(new c(str, str1, str2));
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 524 */     for (c c : arrayList)
/*     */     {
/* 526 */       paramab.e(c.a, c.b, c.c);
/*     */     }
/* 528 */     arrayList.clear();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\e\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
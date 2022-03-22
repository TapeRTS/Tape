/*     */ package com.corrodinggames.rts.gameFramework.e;
/*     */ 
/*     */ import android.os.Build;
/*     */ import com.corrodinggames.rts.gameFramework.SettingsEngine;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.text.FieldPosition;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.Locale;
/*     */ import java.util.MissingResourceException;
/*     */ import java.util.PropertyResourceBundle;
/*     */ import java.util.ResourceBundle;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */ {
/*     */   static ResourceBundle a;
/*     */   static boolean b;
/*  52 */   public static int c = 0;
/*     */ 
/*     */   
/*     */   public static String d;
/*     */ 
/*     */   
/*     */   public static strictfp void a() {
/*  59 */     e();
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
/*     */   static strictfp ResourceBundle b() {
/* 139 */     if (a == null)
/*     */     {
/* 141 */       e();
/*     */     }
/*     */ 
/*     */     
/* 145 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static strictfp PropertyResourceBundle a(String paramString) {
/* 151 */     j j = com.corrodinggames.rts.gameFramework.c.a.h("translations/" + paramString);
/* 152 */     if (j == null)
/*     */     {
/* 154 */       return null;
/*     */     }
/* 156 */     PropertyResourceBundle propertyResourceBundle = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 163 */       InputStreamReader inputStreamReader = new InputStreamReader((InputStream)j, "UTF-8");
/*     */       
/* 165 */       propertyResourceBundle = new PropertyResourceBundle(inputStreamReader);
/*     */       
/* 167 */       inputStreamReader.close();
/*     */     
/*     */     }
/* 170 */     catch (UnsupportedEncodingException unsupportedEncodingException) {
/*     */       
/* 172 */       unsupportedEncodingException.printStackTrace();
/*     */     }
/* 174 */     catch (IOException iOException) {
/*     */       
/* 176 */       iOException.printStackTrace();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 181 */     return propertyResourceBundle;
/*     */   }
/*     */   
/*     */   public static strictfp String a(String paramString, Locale paramLocale, boolean paramBoolean1, boolean paramBoolean2) {
/*     */     String str2, str3;
/* 186 */     if (paramLocale == Locale.ROOT)
/*     */     {
/* 188 */       return paramString;
/*     */     }
/*     */     
/* 191 */     String str1 = paramLocale.getLanguage();
/*     */ 
/*     */     
/* 194 */     if (paramBoolean1) {
/*     */       
/* 196 */       str2 = paramLocale.getCountry();
/*     */     }
/*     */     else {
/*     */       
/* 200 */       str2 = "";
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 205 */     if (paramBoolean2) {
/*     */       
/* 207 */       str3 = paramLocale.getVariant();
/*     */     }
/*     */     else {
/*     */       
/* 211 */       str3 = "";
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     if (str1.equals("") && str2.equals("") && str3.equals(""))
/*     */     {
/* 219 */       return paramString;
/*     */     }
/*     */     
/* 222 */     StringBuilder stringBuilder = new StringBuilder(paramString);
/* 223 */     stringBuilder.append('_');
/* 224 */     if (!str3.equals("")) {
/* 225 */       stringBuilder.append(str1).append('_').append(str2.toLowerCase(Locale.ROOT)).append('_').append(str3.toLowerCase(Locale.ROOT));
/* 226 */     } else if (!str2.equals("")) {
/* 227 */       stringBuilder.append(str1).append('_').append(str2.toLowerCase(Locale.ROOT));
/*     */     } else {
/* 229 */       stringBuilder.append(str1);
/*     */     } 
/* 231 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static strictfp ResourceBundle a(String paramString, Locale paramLocale) {
/* 239 */     String str1 = a(paramString, Locale.ROOT, false, false) + ".properties";
/* 240 */     PropertyResourceBundle propertyResourceBundle1 = a(str1);
/*     */     
/* 242 */     if (propertyResourceBundle1 == null)
/*     */     {
/* 244 */       throw new RuntimeException("Root locate file:" + str1 + " is missing, it is required");
/*     */     }
/*     */ 
/*     */     
/* 248 */     boolean bool = Locale.ROOT.equals(paramLocale);
/* 249 */     if (bool) {
/*     */       
/* 251 */       l.d("Locale: Using " + str1 + " as locale");
/* 252 */       return propertyResourceBundle1;
/*     */     } 
/*     */     
/* 255 */     String str2 = a(paramString, paramLocale, true, true) + ".properties";
/* 256 */     PropertyResourceBundle propertyResourceBundle2 = a(str2);
/* 257 */     if (propertyResourceBundle2 == null) {
/*     */       
/* 259 */       l.d("Locale: No locale for " + str2 + " checking locale without variant ");
/*     */ 
/*     */ 
/*     */       
/* 263 */       str2 = a(paramString, paramLocale, true, false) + ".properties";
/* 264 */       propertyResourceBundle2 = a(str2);
/* 265 */       if (propertyResourceBundle2 == null) {
/*     */         
/* 267 */         l.d("Locale: No locale for " + str2 + " checking locale without variant or country");
/*     */ 
/*     */         
/* 270 */         str2 = a(paramString, paramLocale, false, false) + ".properties";
/* 271 */         propertyResourceBundle2 = a(str2);
/* 272 */         if (propertyResourceBundle2 == null) {
/*     */           
/* 274 */           l.d("Locale: No locale for " + str2 + " using base locale");
/* 275 */           return propertyResourceBundle1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     l.d("Locale: Using " + str2 + " as locale");
/*     */     
/* 286 */     return new b(propertyResourceBundle2, propertyResourceBundle1);
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
/*     */   public static strictfp String c() {
/* 365 */     return d().getLanguage();
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp Locale d() {
/* 370 */     l l = l.u();
/* 371 */     SettingsEngine settingsEngine = null;
/* 372 */     if (l != null)
/*     */     {
/* 374 */       settingsEngine = l.by;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 379 */     boolean bool = false;
/* 380 */     if (settingsEngine != null && settingsEngine.forceEnglish)
/*     */     {
/* 382 */       bool = true;
/*     */     }
/*     */     
/* 385 */     if (bool)
/*     */     {
/* 387 */       return Locale.ROOT;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 392 */     return Locale.getDefault();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized strictfp void e() {
/* 399 */     c++;
/*     */     
/* 401 */     l l = l.u();
/* 402 */     SettingsEngine settingsEngine = null;
/* 403 */     if (l != null)
/*     */     {
/* 405 */       settingsEngine = l.by;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     boolean bool = false;
/* 416 */     if (settingsEngine != null && settingsEngine.forceEnglish)
/*     */     {
/* 418 */       bool = true;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 434 */     if (a != null && b == bool)
/*     */     {
/* 436 */       l.d("Locale.reload: skipping reload");
/*     */     }
/*     */     
/* 439 */     if (Build.VERSION.SDK_INT >= 9)
/*     */     {
/* 441 */       ResourceBundle.clearCache();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     if (bool) {
/*     */       
/* 449 */       a = a("Strings", Locale.ROOT);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 455 */     else if (d != null) {
/*     */ 
/*     */       
/* 458 */       a = a("Strings", new Locale(d));
/*     */     
/*     */     }
/* 461 */     else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals("")) {
/*     */ 
/*     */       
/* 464 */       a = a("Strings", new Locale(settingsEngine.overrideLanguageCode));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 470 */       a = a("Strings", Locale.getDefault());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 479 */     b = bool;
/*     */ 
/*     */ 
/*     */     
/* 483 */     boolean bool1 = false;
/* 484 */     if (bool1);
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
/*     */   private static final strictfp String d(String paramString) {
/*     */     String str;
/*     */     try {
/* 513 */       ResourceBundle resourceBundle = b();
/*     */       
/* 515 */       str = resourceBundle.getString(paramString);
/*     */     }
/* 517 */     catch (NullPointerException nullPointerException) {
/*     */       
/* 519 */       String str1 = "NullPointer with key:" + paramString + " locale:" + b().getLocale().toString();
/*     */       
/* 521 */       throw new RuntimeException(str1, nullPointerException);
/*     */     } 
/*     */     
/* 524 */     if (str.contains("[") || str.contains("]")) {
/*     */       
/* 526 */       str = str.replace("[[", "{{");
/* 527 */       str = str.replace("]]", "}}");
/* 528 */       str = str.replace("[", "{{");
/* 529 */       str = str.replace("]", "}}");
/*     */     } 
/*     */     
/* 532 */     if (str.contains("{") || str.contains("}")) {
/*     */ 
/*     */       
/* 535 */       str = str.replace("}}  {{", "}}{{");
/* 536 */       str = str.replace("}} {{", "}}{{");
/*     */       
/* 538 */       str = str.replace("}}{{", "\n-");
/*     */       
/* 540 */       str = str.replace("{{", "-");
/* 541 */       str = str.replace("}}", "");
/*     */     } 
/*     */     
/* 544 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final strictfp boolean e(String paramString) {
/*     */     try {
/* 552 */       b().getString(paramString);
/* 553 */       return true;
/*     */     }
/* 555 */     catch (MissingResourceException missingResourceException) {
/*     */       
/* 557 */       return false;
/*     */     } 
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
/*     */   public static final strictfp String a(String paramString1, String paramString2, Object... paramVarArgs) {
/*     */     try {
/* 573 */       return a(paramString1, paramVarArgs);
/*     */     }
/* 575 */     catch (MissingResourceException missingResourceException) {
/*     */       
/* 577 */       return paramString2;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static final strictfp String a(String paramString, Object... paramVarArgs) {
/* 583 */     String str = d(paramString);
/*     */     
/* 585 */     if (paramVarArgs.length == 0)
/*     */     {
/* 587 */       return str;
/*     */     }
/*     */     
/* 590 */     return (new MessageFormat(str)).format(paramVarArgs, new StringBuffer(), (FieldPosition)null).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 596 */   static Pattern e = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");
/*     */ 
/*     */ 
/*     */   
/*     */   public static final strictfp String b(String paramString) {
/* 601 */     if (paramString == null)
/*     */     {
/* 603 */       return null;
/*     */     }
/* 605 */     String str1 = paramString;
/*     */     
/* 607 */     String str2 = null;
/*     */ 
/*     */     
/* 610 */     Matcher matcher = e.matcher(paramString);
/* 611 */     if (matcher.matches()) {
/*     */       
/* 613 */       str1 = matcher.group(1);
/* 614 */       str2 = matcher.group(2);
/*     */     } 
/* 616 */     str1 = str1.trim();
/*     */     
/* 618 */     str1 = str1.replace(" ", "_");
/* 619 */     str1 = str1.replace(".tmx", "");
/*     */     
/* 621 */     str1 = str1.toLowerCase(Locale.ENGLISH);
/*     */ 
/*     */ 
/*     */     
/* 625 */     String str3 = "maps.name." + str1;
/* 626 */     if (e(str3)) {
/*     */       
/* 628 */       String str = a(str3, new Object[0]);
/*     */       
/* 630 */       if (str2 != null)
/*     */       {
/* 632 */         str = str + str2;
/*     */       }
/*     */       
/* 635 */       l.d("translated:" + str);
/*     */       
/* 637 */       if (str != null)
/*     */       {
/* 639 */         str = str.replace("_", " ");
/*     */       }
/*     */       
/* 642 */       return str;
/*     */     } 
/*     */ 
/*     */     
/* 646 */     return paramString;
/*     */   }
/*     */ 
/*     */   
/* 650 */   static final Pattern f = Pattern.compile("\\[i:([^\\]]*?)\\]");
/*     */ 
/*     */   
/*     */   public static strictfp String c(String paramString) {
/* 654 */     if (!paramString.contains("[i:"))
/*     */     {
/* 656 */       return paramString;
/*     */     }
/*     */     
/* 659 */     byte b = 0;
/* 660 */     StringBuffer stringBuffer = new StringBuffer();
/*     */     
/* 662 */     Matcher matcher = f.matcher(paramString);
/* 663 */     while (matcher.find()) {
/*     */       
/* 665 */       b++;
/* 666 */       if (b > 100) {
/*     */         
/* 668 */         l.b("convertInlineBlocks: Too many loops while parsing: " + paramString);
/* 669 */         return paramString;
/*     */       } 
/*     */       
/* 672 */       String str1 = matcher.group(1);
/*     */       
/* 674 */       String str2 = a(str1, null, new Object[0]);
/* 675 */       if (str2 == null) {
/*     */         
/* 677 */         l.d("convertInlineBlocks: No key:" + str1);
/* 678 */         str2 = "[No key: " + str1 + "]";
/*     */       } 
/* 680 */       matcher.appendReplacement(stringBuffer, str2);
/*     */     } 
/* 682 */     matcher.appendTail(stringBuffer);
/*     */     
/* 684 */     return stringBuffer.toString();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\e\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
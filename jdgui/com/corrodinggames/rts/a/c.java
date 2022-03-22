/*     */ package com.corrodinggames.rts.a;
/*     */ 
/*     */ import android.app.Activity;
/*     */ import android.content.Context;
/*     */ import android.os.Build;
/*     */ import android.os.Handler;
/*     */ import android.os.Looper;
/*     */ import android.support.v4.app.ActivityCompat;
/*     */ import android.support.v4.content.ContextCompat;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.File;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*     */   static Handler a;
/*     */   static volatile Context b;
/*     */   
/*     */   public static int a(String paramString) {
/*  56 */     String str = null;
/*  57 */     if (paramString != null)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  62 */       str = f.k(paramString);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  67 */     if (str != null) {
/*     */       
/*  69 */       Pattern pattern = Pattern.compile("^ *\\[([^\\]]*)\\].*");
/*  70 */       Matcher matcher = pattern.matcher(str);
/*  71 */       if (matcher.matches()) {
/*     */         
/*  73 */         String str1 = matcher.group(1);
/*     */         
/*  75 */         String[] arrayOfString = str1.split(";");
/*     */         
/*  77 */         for (String str2 : arrayOfString) {
/*     */           
/*  79 */           if (str2.startsWith("p"))
/*     */           {
/*  81 */             if (str2.length() >= 2) {
/*     */               int i;
/*  83 */               String str3 = str2.substring(1);
/*     */ 
/*     */               
/*     */               try {
/*  87 */                 i = Integer.parseInt(str3);
/*     */               }
/*  89 */               catch (NumberFormatException numberFormatException) {
/*     */                 
/*  91 */                 l.d("getNumberOfPlayersInMap: NumberFormatException:" + str3);
/*  92 */                 return -1;
/*     */               } 
/*     */               
/*  95 */               return i;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 104 */     l.d("getNumberOfPlayersInMap: fail to match:" + str);
/*     */     
/* 106 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String b(String paramString) {
/* 111 */     if (paramString == null) return null;
/*     */ 
/*     */     
/* 114 */     if (paramString.contains(File.separator)) {
/*     */ 
/*     */       
/* 117 */       String[] arrayOfString = paramString.split(Pattern.quote(File.separator));
/* 118 */       paramString = arrayOfString[arrayOfString.length - 1];
/*     */     } 
/*     */     
/* 121 */     if (paramString.contains("/")) {
/*     */       
/* 123 */       String[] arrayOfString = paramString.split("/");
/* 124 */       paramString = arrayOfString[arrayOfString.length - 1];
/*     */     } 
/*     */ 
/*     */     
/* 128 */     String str = null;
/*     */ 
/*     */     
/* 131 */     if (str == null) {
/*     */       
/* 133 */       Pattern pattern = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx");
/* 134 */       Matcher matcher = pattern.matcher(paramString);
/* 135 */       if (matcher.matches()) {
/*     */         
/* 137 */         str = matcher.group(1);
/* 138 */         if (str.length() >= 1)
/*     */         {
/* 140 */           str = str.substring(0, 1).toUpperCase() + str.substring(1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 146 */     if (str == null) {
/*     */       
/* 148 */       Pattern pattern = Pattern.compile("^l\\d*;(.+)\\.tmx");
/* 149 */       Matcher matcher = pattern.matcher(paramString);
/* 150 */       if (matcher.matches()) {
/*     */         
/* 152 */         str = matcher.group(1);
/* 153 */         if (str.length() >= 1)
/*     */         {
/* 155 */           str = str.substring(0, 1).toUpperCase() + str.substring(1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 160 */     if (str == null) {
/*     */       
/* 162 */       Pattern pattern = Pattern.compile("^ *\\[.*\\](.+)\\.tmx");
/* 163 */       Matcher matcher = pattern.matcher(paramString);
/* 164 */       if (matcher.matches()) {
/*     */         
/* 166 */         str = matcher.group(1);
/* 167 */         if (str.length() >= 1)
/*     */         {
/* 169 */           str = str.substring(0, 1).toUpperCase() + str.substring(1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 175 */     if (str == null) {
/*     */       
/* 177 */       Pattern pattern = Pattern.compile("(.*)\\.tmx");
/* 178 */       Matcher matcher = pattern.matcher(paramString);
/* 179 */       if (matcher.matches()) {
/*     */         
/* 181 */         str = matcher.group(1);
/* 182 */         if (str.length() >= 1)
/*     */         {
/* 184 */           str = str.substring(0, 1).toUpperCase() + str.substring(1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 191 */     if (str == null)
/*     */     {
/* 193 */       str = paramString;
/*     */     }
/*     */     
/* 196 */     str = str.replace('_', ' ');
/*     */ 
/*     */     
/* 199 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String c(String paramString) {
/* 206 */     String str = paramString.replace(".tmx", "");
/* 207 */     str = str + "_map.png";
/* 208 */     return str;
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
/*     */   private static void c(Activity paramActivity) {
/* 272 */     if (Build.VERSION.SDK_INT >= 19)
/*     */     {
/* 274 */       paramActivity.a().getDecorView().setSystemUiVisibility(5894);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void d(Activity paramActivity) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(Runnable paramRunnable) {
/* 314 */     if (a == null)
/*     */     {
/* 316 */       a = new Handler(Looper.b());
/*     */     }
/* 318 */     a.a(paramRunnable);
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
/*     */   public static Context a() {
/* 331 */     if (b == null)
/*     */     {
/* 333 */       throw new RuntimeException("ApplicationContext==null");
/*     */     }
/*     */     
/* 336 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(Activity paramActivity) {
/* 343 */     if (b == null)
/*     */     {
/* 345 */       b = paramActivity.g();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(Context paramContext) {
/* 351 */     if (b == null)
/*     */     {
/* 353 */       b = paramContext.g();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2) {
/* 364 */     a(paramActivity);
/*     */     
/* 366 */     if (paramBoolean2) {
/*     */       
/* 368 */       l l1 = l.u();
/*     */       
/* 370 */       if (l1 != null && l1.by.immersiveFullScreen)
/*     */       {
/* 372 */         c(paramActivity);
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 378 */       d(paramActivity);
/*     */     } 
/*     */ 
/*     */     
/* 382 */     l l = l.u();
/* 383 */     if (l != null)
/*     */     {
/* 385 */       l.S();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 390 */     if (paramBoolean1)
/*     */     {
/*     */ 
/*     */       
/* 394 */       paramActivity.a().setBackgroundDrawable(null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(Activity paramActivity, boolean paramBoolean) {
/* 542 */     if (paramBoolean)
/*     */     {
/* 544 */       paramActivity.a(0, 0);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(Activity paramActivity) {
/* 784 */     l l = l.u();
/*     */ 
/*     */     
/* 787 */     if (l.aF)
/*     */     {
/* 789 */       return true;
/*     */     }
/*     */     
/* 792 */     if (Build.VERSION.SDK_INT >= 23) {
/*     */       
/* 794 */       if (l.aq() == null);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 799 */       if (ContextCompat.a((Context)paramActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
/*     */         
/* 801 */         l.d("File Permission is granted");
/* 802 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 806 */       l.d("Permission is revoked");
/*     */       
/* 808 */       ActivityCompat.a(paramActivity, new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 814 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 821 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\a\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
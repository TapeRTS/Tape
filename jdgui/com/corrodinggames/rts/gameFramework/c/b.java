/*     */ package com.corrodinggames.rts.gameFramework.c;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.AssetManager;
/*     */ import android.os.Environment;
/*     */ import com.corrodinggames.rts.a.c;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   String a;
/*     */   String b;
/*     */   
/*     */   public String a() {
/*  31 */     String str = this.a;
/*  32 */     this.a = null;
/*  33 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/*  38 */     this.a = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a(String paramString1, String paramString2) {
/*  46 */     File file = new File(paramString1);
/*  47 */     File[] arrayOfFile = file.listFiles();
/*  48 */     if (arrayOfFile == null) {
/*     */       
/*  50 */       l.d("findFileExtension('" + paramString1 + "','" + paramString2 + "'): path is not a folder");
/*  51 */       return null;
/*     */     } 
/*     */ 
/*     */     
/*  55 */     for (File file1 : arrayOfFile) {
/*     */       
/*  57 */       String str = file1.getName();
/*  58 */       if (str.contains("."))
/*     */       {
/*  60 */         str = str.substring(0, str.lastIndexOf('.'));
/*     */       }
/*  62 */       if (str.equals(paramString2))
/*     */       {
/*  64 */         return paramString1 + "/" + file1.getName();
/*     */       }
/*     */     } 
/*     */     
/*  68 */     l.d("Could not find file with path: " + paramString1 + " file:" + paramString2);
/*  69 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(String paramString) {
/*  75 */     if (l.aF)
/*     */     {
/*  77 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  81 */     if (paramString.startsWith("/SD/"))
/*     */     {
/*  83 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(String paramString) {
/*  95 */     if (paramString.startsWith("/") || paramString.startsWith("\\"))
/*     */     {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     if (l.aF) {
/*     */       
/* 102 */       if (paramString.startsWith("mods"))
/*     */       {
/* 104 */         return true;
/*     */       }
/*     */       
/* 107 */       if (l.aJ)
/*     */       {
/* 109 */         if (paramString.startsWith("converted-sounds"))
/*     */         {
/* 111 */           return true;
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 117 */     paramString = paramString.split("\\\\")[0];
/* 118 */     if (paramString.endsWith(":"))
/*     */     {
/* 120 */       return true;
/*     */     }
/*     */     
/* 123 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String d(String paramString) {
/* 129 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 133 */     if (paramString.contains("MOD|")) {
/*     */       
/* 135 */       String[] arrayOfString = paramString.split("/");
/* 136 */       if (arrayOfString.length >= 2) {
/*     */         
/* 138 */         String str = arrayOfString[arrayOfString.length - 1];
/* 139 */         boolean bool = false;
/* 140 */         for (int i = arrayOfString.length - 2; i >= 0; i--) {
/*     */           
/* 142 */           String str1 = arrayOfString[i];
/* 143 */           if (str1.startsWith("MOD|")) {
/*     */             
/* 145 */             String str2 = str1.substring("MOD|".length());
/* 146 */             com.corrodinggames.rts.gameFramework.f.b b1 = l.bH.a(str2);
/*     */             
/* 148 */             if (b1 == null) {
/*     */               
/* 150 */               l.d("Failed to find mod with hash:" + str2);
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 155 */               str = f.b(b1.f, str);
/*     */               
/* 157 */               l.d("Path changed to mod path:" + str);
/* 158 */               bool = true;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/* 163 */           str = str1 + File.separator + str;
/*     */         } 
/* 165 */         if (bool)
/*     */         {
/*     */           
/* 168 */           paramString = str;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 176 */       if (paramString.contains("MOD|"))
/*     */       {
/* 178 */         l.d("Path still contains prefix: " + paramString);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     if (paramString.contains("NEW_PATH|")) {
/*     */ 
/*     */       
/* 188 */       String[] arrayOfString = paramString.split("/");
/* 189 */       if (arrayOfString.length >= 2) {
/*     */         
/* 191 */         String str = arrayOfString[arrayOfString.length - 1];
/* 192 */         boolean bool = false;
/* 193 */         for (int i = arrayOfString.length - 2; i >= 0; i--) {
/*     */           
/* 195 */           String str1 = arrayOfString[i];
/* 196 */           if (str1.startsWith("NEW_PATH|")) {
/*     */             
/* 198 */             String str2 = str1.substring("NEW_PATH|".length());
/*     */             
/* 200 */             if (str2.equals("maps2")) {
/*     */               
/* 202 */               str = "/SD/rustedWarfare/maps" + File.separator + str;
/* 203 */               l.d("Path changed to maps2 path:" + str);
/* 204 */               bool = true;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/* 209 */           str = str1 + File.separator + str;
/*     */         } 
/* 211 */         if (bool)
/*     */         {
/*     */           
/* 214 */           paramString = str;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String e(String paramString) {
/* 231 */     paramString = d(paramString);
/*     */ 
/*     */     
/* 234 */     if (l.aF) {
/*     */ 
/*     */ 
/*     */       
/* 238 */       if (paramString.startsWith("/SD/rusted_warfare_maps")) {
/*     */         
/* 240 */         paramString = "/SD/mods/maps" + paramString.substring("/SD/rusted_warfare_maps".length());
/* 241 */         l.d("convertAbstractPath: Changing to:" + paramString);
/*     */       } 
/*     */       
/* 244 */       if (paramString.startsWith("/SD/rustedWarfare/maps")) {
/*     */         
/* 246 */         paramString = "/SD/mods/maps" + paramString.substring("/SD/rustedWarfare/maps".length());
/* 247 */         l.d("convertAbstractPath2: Changing to:" + paramString);
/*     */       } 
/*     */       
/* 250 */       if (paramString.startsWith("/SD/") || paramString.startsWith("\\SD\\")) {
/*     */ 
/*     */ 
/*     */         
/* 254 */         String str1 = paramString.substring("/SD/".length());
/*     */         
/* 256 */         String str2 = "rustedWarfare/";
/* 257 */         if (str1.startsWith(str2))
/*     */         {
/* 259 */           str1 = str1.substring(str2.length());
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 264 */         str1 = c() + str1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 271 */         return str1;
/*     */       } 
/* 273 */       if (c(paramString))
/*     */       {
/*     */ 
/*     */         
/* 277 */         return paramString;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 289 */       return "assets/" + paramString;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 294 */     if (paramString.startsWith("/SD/"))
/*     */     {
/* 296 */       return b() + "/" + paramString
/*     */         
/* 298 */         .substring("/SD/".length());
/*     */     }
/*     */ 
/*     */     
/* 302 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 311 */     if (this.b == null)
/*     */     {
/* 313 */       this.b = Environment.getExternalStorageDirectory() + "";
/*     */     }
/* 315 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(String paramString) {
/* 320 */     String str = e(paramString);
/*     */ 
/*     */     
/* 323 */     if (ae.c(str))
/*     */     {
/* 325 */       return ae.d(str);
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
/*     */ 
/*     */     
/* 343 */     if (b(paramString)) {
/*     */ 
/*     */       
/* 346 */       if (!(l.u()).bs.a(str)) {
/*     */         
/* 348 */         l.d("isDirectory: asset file doesn't exist:" + str);
/* 349 */         return false;
/*     */       } 
/*     */ 
/*     */       
/* 353 */       String str1 = f.k(paramString);
/*     */ 
/*     */       
/* 356 */       if (str1.contains("."))
/*     */       {
/* 358 */         return false;
/*     */       }
/* 360 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 365 */     File file = new File(str);
/*     */     
/* 367 */     if (!file.exists()) {
/*     */       
/* 369 */       l.d("isDirectory: file doesn't exist:" + str);
/* 370 */       return false;
/*     */     } 
/* 372 */     return file.isDirectory();
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
/*     */   public boolean g(String paramString) {
/* 422 */     String str = e(paramString);
/*     */     
/* 424 */     if (ae.c(str))
/*     */     {
/* 426 */       return ae.b(str);
/*     */     }
/*     */     
/* 429 */     if (b(paramString))
/*     */     {
/* 431 */       return (l.u()).bs.a(str);
/*     */     }
/*     */ 
/*     */     
/* 435 */     File file = new File(str);
/* 436 */     if (file == null || !file.exists()) return false; 
/* 437 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] a(String paramString, boolean paramBoolean) {
/* 446 */     String arrayOfString[], str = e(paramString);
/*     */     
/* 448 */     if (ae.c(str))
/*     */     {
/* 450 */       return ae.e(str);
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
/*     */ 
/*     */ 
/*     */     
/* 469 */     if (b(paramString)) {
/*     */       
/* 471 */       arrayOfString = (l.u()).bs.b(str);
/*     */     }
/*     */     else {
/*     */       
/* 475 */       File file = new File(str);
/*     */       
/* 477 */       if (file == null || !file.exists()) {
/*     */         
/* 479 */         String str1 = "listDir: path doesn't exist:" + str;
/*     */         
/* 481 */         l.b(str1);
/* 482 */         a.a(str1);
/*     */         
/* 484 */         return null;
/*     */       } 
/* 486 */       arrayOfString = file.list();
/*     */       
/* 488 */       if (arrayOfString == null) {
/*     */ 
/*     */         
/* 491 */         if (file != null)
/*     */         {
/* 493 */           if (!file.isDirectory())
/*     */           {
/* 495 */             a.a("path is not a directory, .rwmod or .zip");
/*     */           }
/*     */         }
/*     */         
/* 499 */         return null;
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 554 */     if (arrayOfString == null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 560 */       l.d("listDir baseList==null:" + paramString + " (non folder?)");
/* 561 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 565 */     ArrayList<String> arrayList = new ArrayList();
/*     */     
/* 567 */     if (paramBoolean) {
/*     */       
/* 569 */       for (String str1 : arrayOfString)
/*     */       {
/* 571 */         if (str1.toLowerCase(Locale.ENGLISH).endsWith(".tmx"))
/*     */         {
/* 573 */           arrayList.add(str1);
/*     */         }
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 579 */       for (String str1 : arrayOfString)
/*     */       {
/* 581 */         arrayList.add(str1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 587 */     Collections.sort(arrayList);
/*     */ 
/*     */ 
/*     */     
/* 591 */     return arrayList.<String>toArray(new String[0]);
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
/*     */   public static File h(String paramString) {
/* 606 */     if (paramString.contains("\\"))
/*     */     {
/* 608 */       paramString = paramString.replace('\\', '/');
/*     */     }
/*     */     
/* 611 */     File file1 = new File(paramString);
/*     */     
/* 613 */     if (file1.exists())
/*     */     {
/* 615 */       return file1;
/*     */     }
/*     */ 
/*     */     
/* 619 */     File file2 = file1.getParentFile();
/*     */ 
/*     */     
/* 622 */     if (file2 == null || !file2.isDirectory()) {
/*     */       
/* 624 */       file2 = h(file2.getAbsolutePath());
/*     */       
/* 626 */       if (file2 == null || !file2.isDirectory()) {
/*     */         
/* 628 */         l.d("createFileCaseInsensitive: did not find parent for: " + paramString);
/* 629 */         return null;
/*     */       } 
/*     */     } 
/*     */     
/* 633 */     File[] arrayOfFile = file2.listFiles();
/* 634 */     if (arrayOfFile == null) {
/*     */       
/* 636 */       l.d("createFileCaseInsensitive: Failed to list files for: " + paramString + " in " + file2);
/* 637 */       return null;
/*     */     } 
/*     */     
/* 640 */     for (File file : arrayOfFile) {
/*     */ 
/*     */       
/* 643 */       if (file.getName().equalsIgnoreCase(file1.getName()))
/*     */       {
/*     */         
/* 646 */         return file;
/*     */       }
/*     */     } 
/* 649 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j i(String paramString) {
/*     */     InputStream inputStream;
/* 660 */     if (paramString.startsWith("assets/") || paramString.startsWith("assets\\"))
/*     */     {
/* 662 */       paramString = paramString.substring("assets/".length());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 668 */     String str1 = paramString;
/* 669 */     String str2 = "assets/" + paramString;
/*     */     
/* 671 */     Context context = c.a();
/*     */     
/* 673 */     AssetManager assetManager = context.d();
/*     */     
/* 675 */     if (l.aI);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 697 */       inputStream = assetManager.a(str1);
/*     */     }
/* 699 */     catch (IOException iOException) {
/*     */       
/* 701 */       l.d("Could not find asset:" + str2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 745 */       return null;
/*     */     } 
/*     */     
/* 748 */     return new j(inputStream, str2, str1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j j(String paramString) {
/*     */     j j;
/* 756 */     if (ae.c(paramString) && !paramString.endsWith(".rwmod"))
/*     */     {
/* 758 */       return ae.b(paramString, false);
/*     */     }
/*     */ 
/*     */     
/* 762 */     if (paramString.startsWith("/SD/") || paramString.startsWith("\\SD\\")) {
/*     */       String str;
/* 764 */       paramString = paramString.substring("/SD/".length());
/*     */ 
/*     */ 
/*     */       
/* 768 */       if (l.aF) {
/*     */         
/* 770 */         str = paramString;
/*     */       }
/*     */       else {
/*     */         
/* 774 */         str = b() + "/" + paramString;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 781 */         File file = h(str);
/* 782 */         if (file == null)
/*     */         {
/* 784 */           return null;
/*     */         }
/*     */         
/* 787 */         FileInputStream fileInputStream = new FileInputStream(file);
/*     */ 
/*     */ 
/*     */         
/* 791 */         j = new j(fileInputStream, file.getAbsolutePath());
/*     */       }
/* 793 */       catch (FileNotFoundException fileNotFoundException) {
/*     */         
/* 795 */         return null;
/*     */       }
/*     */     
/* 798 */     } else if (c(paramString)) {
/*     */       
/* 800 */       l.d("using " + paramString + " as absolute path");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 807 */         File file = h(paramString);
/* 808 */         if (file == null)
/*     */         {
/* 810 */           return null;
/*     */         }
/*     */         
/* 813 */         FileInputStream fileInputStream = new FileInputStream(file);
/*     */         
/* 815 */         j = new j(fileInputStream, file.getAbsolutePath());
/*     */       
/*     */       }
/* 818 */       catch (FileNotFoundException fileNotFoundException) {
/*     */         
/* 820 */         return null;
/*     */       }
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 826 */       j = i(paramString);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 855 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c() {
/* 862 */     if (l.aF)
/*     */     {
/* 864 */       return "";
/*     */     }
/*     */ 
/*     */     
/* 868 */     return b() + "/rustedWarfare/";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\c\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class af
/*     */ {
/* 304 */   String a = "";
/*     */   
/*     */   String b;
/*     */   
/*     */   ZipFile c;
/*     */   
/*     */   String[] d;
/*     */ 
/*     */   
/*     */   public af(String paramString1, String paramString2) {
/* 314 */     this.b = paramString1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 320 */     this.c = new ZipFile(paramString2);
/*     */ 
/*     */     
/*     */     try {
/* 324 */       a();
/*     */     }
/* 326 */     catch (IllegalArgumentException illegalArgumentException) {
/*     */       
/* 328 */       ae.a("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
/*     */ 
/*     */       
/* 331 */       Charset charset = Charset.forName("ISO-8859-1");
/*     */ 
/*     */ 
/*     */       
/* 335 */       Class[] arrayOfClass = new Class[2];
/* 336 */       arrayOfClass[0] = String.class;
/* 337 */       arrayOfClass[1] = Charset.class;
/*     */       
/* 339 */       Constructor<ZipFile> constructor = null;
/*     */ 
/*     */       
/*     */       try {
/* 343 */         constructor = ZipFile.class.getDeclaredConstructor(arrayOfClass);
/*     */       }
/* 345 */       catch (NoSuchMethodException noSuchMethodException) {
/*     */         
/* 347 */         noSuchMethodException.printStackTrace();
/*     */       }
/* 349 */       catch (SecurityException securityException) {
/*     */         
/* 351 */         securityException.printStackTrace();
/*     */       } 
/*     */       
/* 354 */       if (constructor == null)
/*     */       {
/* 356 */         throw new IllegalArgumentException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1", illegalArgumentException);
/*     */       }
/*     */       
/* 359 */       Object[] arrayOfObject = new Object[2];
/* 360 */       arrayOfObject[0] = paramString2;
/* 361 */       arrayOfObject[1] = charset;
/*     */ 
/*     */       
/*     */       try {
/* 365 */         this.c = constructor.newInstance(arrayOfObject);
/*     */       }
/* 367 */       catch (InstantiationException instantiationException) {
/*     */         
/* 369 */         throw new RuntimeException(instantiationException);
/*     */       }
/* 371 */       catch (IllegalAccessException illegalAccessException) {
/*     */         
/* 373 */         throw new RuntimeException(illegalAccessException);
/*     */       }
/* 375 */       catch (InvocationTargetException invocationTargetException) {
/*     */         
/* 377 */         throw new RuntimeException(invocationTargetException);
/*     */       }
/* 379 */       catch (IllegalArgumentException illegalArgumentException1) {
/*     */         
/* 381 */         throw new RuntimeException(illegalArgumentException1);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 386 */       a();
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
/*     */   public void a() {
/* 402 */     long l = bj.a();
/*     */     
/* 404 */     ArrayList<String> arrayList = new ArrayList();
/*     */ 
/*     */     
/* 407 */     Enumeration<? extends ZipEntry> enumeration = this.c.entries();
/* 408 */     while (enumeration.hasMoreElements()) {
/*     */       
/* 410 */       ZipEntry zipEntry = enumeration.nextElement();
/* 411 */       String str = zipEntry.getName();
/*     */       
/* 413 */       if (str == null)
/*     */       {
/* 415 */         throw new RuntimeException("filePath==null");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 420 */       arrayList.add(str);
/*     */     } 
/*     */ 
/*     */     
/* 424 */     this.d = arrayList.<String>toArray(new String[0]);
/*     */ 
/*     */     
/* 427 */     this.a = "";
/*     */     
/* 429 */     String[] arrayOfString = e("");
/* 430 */     if (arrayOfString.length == 1)
/*     */     {
/* 432 */       if (d(arrayOfString[0])) {
/*     */         
/* 434 */         this.a = arrayOfString[0] + "/";
/*     */         
/* 436 */         for (byte b = 0; b < this.d.length; b++) {
/*     */           
/* 438 */           if (this.d[b].startsWith(this.a))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 444 */             this.d[b] = this.d[b].substring(this.a.length());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 449 */     double d = bj.a(l);
/* 450 */     if (d > 3.0D)
/*     */     {
/* 452 */       l.d("zip: buildCache for: " + this.b + ", took:" + bj.a(d));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 461 */     l.d("Zip: " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String paramString) {
/* 466 */     for (String str : this.d) {
/*     */       
/* 468 */       if (str.equals(paramString))
/*     */       {
/*     */         
/* 471 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 476 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(String paramString) {
/* 481 */     for (String str : this.d) {
/*     */       
/* 483 */       if (str.equals(paramString))
/*     */       {
/*     */         
/* 486 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 490 */     for (String str : this.d) {
/*     */       
/* 492 */       if (str.equalsIgnoreCase(paramString))
/*     */       {
/*     */         
/* 495 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 500 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(String paramString) {
/* 507 */     if (!paramString.endsWith("/"))
/*     */     {
/* 509 */       paramString = paramString + "/";
/*     */     }
/* 511 */     if (paramString.equals("/"))
/*     */     {
/* 513 */       return true;
/*     */     }
/* 515 */     for (String str : this.d) {
/*     */ 
/*     */ 
/*     */       
/* 519 */       if (str.contains(paramString))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 524 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 530 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] e(String paramString) {
/* 538 */     if (paramString.equals("") || paramString.equals("/") || paramString.equals("\\")) {
/*     */       
/* 540 */       paramString = "";
/*     */     }
/* 542 */     else if (!paramString.endsWith("/")) {
/*     */       
/* 544 */       paramString = paramString + "/";
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 549 */     ArrayList<String> arrayList = new ArrayList();
/*     */     
/* 551 */     for (String str : this.d) {
/*     */ 
/*     */       
/* 554 */       if (paramString.equals("") || str.startsWith(paramString)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 561 */         String str1 = str.substring(paramString.length());
/* 562 */         if (str1.length() != 0)
/*     */         {
/*     */ 
/*     */           
/* 566 */           if (!str1.equals(".."))
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 571 */             if (str1.contains("/")) {
/*     */               
/* 573 */               str1 = str1.substring(0, str1.indexOf("/"));
/*     */               
/* 575 */               if (!arrayList.contains(str1))
/*     */               {
/*     */                 
/* 578 */                 arrayList.add(str1);
/*     */               
/*     */               }
/*     */             
/*     */             }
/*     */             else {
/*     */ 
/*     */               
/* 586 */               arrayList.add(str1);
/*     */             } 
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/* 592 */     return arrayList.<String>toArray(new String[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ZipEntry f(String paramString) {
/* 601 */     String str = this.a + paramString;
/*     */     
/* 603 */     ZipEntry zipEntry = null;
/*     */     
/* 605 */     IllegalArgumentException illegalArgumentException = null;
/*     */ 
/*     */     
/*     */     try {
/* 609 */       zipEntry = this.c.getEntry(str);
/*     */     }
/* 611 */     catch (IllegalArgumentException illegalArgumentException1) {
/*     */       
/* 613 */       illegalArgumentException = illegalArgumentException1;
/*     */     } 
/*     */     
/* 616 */     if (zipEntry == null && b(paramString) && !d(paramString)) {
/*     */ 
/*     */ 
/*     */       
/* 620 */       Enumeration<? extends ZipEntry> enumeration = this.c.entries();
/* 621 */       while (enumeration.hasMoreElements()) {
/*     */         ZipEntry zipEntry1;
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 627 */           zipEntry1 = enumeration.nextElement();
/*     */         }
/* 629 */         catch (IllegalArgumentException illegalArgumentException1) {
/*     */           
/* 631 */           illegalArgumentException1.printStackTrace();
/*     */           
/*     */           continue;
/*     */         } 
/* 635 */         String str1 = zipEntry1.getName();
/*     */         
/* 637 */         if (str1.equals(str))
/*     */         {
/* 639 */           return zipEntry1;
/*     */         }
/*     */       } 
/*     */       
/* 643 */       a("getEntry: Still did not find file after workaround");
/*     */     } 
/*     */ 
/*     */     
/* 647 */     if (illegalArgumentException != null)
/*     */     {
/* 649 */       throw new RuntimeException("Failed to decode data in zip: " + paramString + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
/*     */     }
/*     */ 
/*     */     
/* 653 */     return zipEntry;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String g(String paramString) {
/* 660 */     String str = paramString;
/* 661 */     if (!str.endsWith("/"))
/*     */     {
/* 663 */       str = str + "/";
/*     */     }
/*     */     
/* 666 */     for (String str1 : this.d) {
/*     */       
/* 668 */       if (str1.equals(paramString))
/*     */       {
/* 670 */         return str1;
/*     */       }
/*     */     } 
/* 673 */     for (String str1 : this.d) {
/*     */       
/* 675 */       if (str1.equals(str))
/*     */       {
/* 677 */         return str1;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 684 */     for (String str1 : this.d) {
/*     */       
/* 686 */       if (str1.equalsIgnoreCase(paramString))
/*     */       {
/*     */         
/* 689 */         return str1;
/*     */       }
/*     */     } 
/*     */     
/* 693 */     for (String str1 : this.d) {
/*     */       
/* 695 */       if (str1.equalsIgnoreCase(str))
/*     */       {
/*     */         
/* 698 */         return str1;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 704 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long h(String paramString) {
/* 711 */     ZipEntry zipEntry = f(paramString);
/* 712 */     if (zipEntry == null) {
/*     */       
/* 714 */       a("getEntrySize: File not found: " + paramString);
/* 715 */       return -1L;
/*     */     } 
/*     */     
/* 718 */     return zipEntry.getSize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j i(String paramString) {
/*     */     InputStream inputStream;
/* 727 */     ZipEntry zipEntry = f(paramString);
/* 728 */     if (zipEntry == null)
/*     */     {
/* 730 */       zipEntry = f(g(paramString));
/*     */     }
/*     */     
/* 733 */     if (zipEntry == null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 770 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 777 */       inputStream = this.c.getInputStream(zipEntry);
/*     */     }
/* 779 */     catch (IOException iOException) {
/*     */       
/* 781 */       iOException.printStackTrace();
/* 782 */       return null;
/*     */     } 
/*     */     
/* 785 */     return new j(inputStream, this.b + "/" + paramString);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
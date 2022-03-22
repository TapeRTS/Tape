/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.Enumeration;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/*  21 */   static ConcurrentHashMap a = new ConcurrentHashMap<>();
/*     */ 
/*     */ 
/*     */   
/*     */   static k b;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long a(String paramString, boolean paramBoolean) {
/*  31 */     Long long_ = (Long)a.get(paramString);
/*  32 */     if (long_ != null)
/*     */     {
/*  34 */       return long_.longValue();
/*     */     }
/*     */     
/*  37 */     long_ = Long.valueOf(a(paramString));
/*     */     
/*  39 */     if (!paramBoolean) {
/*     */       
/*  41 */       a.put(paramString, long_);
/*     */       
/*  43 */       if (b == null);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  49 */     return long_.longValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static long a(String paramString) {
/*  55 */     File file = new File(paramString);
/*  56 */     return file.lastModified();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void a() {
/*  63 */     a((l.u()).by.liveReloading);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void a(boolean paramBoolean) {
/*  70 */     if (!l.al()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     if (paramBoolean) {
/*     */       
/*  81 */       if (b != null) {
/*     */         
/*  83 */         l.d("FileChangeEngine: Already running");
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/*  88 */       l.d("FileChangeEngine: Starting");
/*     */       
/*  90 */       b = new k();
/*  91 */       b.start();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  98 */     else if (b != null) {
/*     */       
/* 100 */       b.a = false;
/* 101 */       b = null;
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
/*     */   public static void b() {
/* 139 */     byte b = 0;
/*     */ 
/*     */ 
/*     */     
/* 143 */     for (Enumeration<String> enumeration = a.keys(); enumeration.hasMoreElements(); ) {
/*     */       
/* 145 */       String str = enumeration.nextElement();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 150 */       long l = a(str);
/*     */       
/* 152 */       Long long_ = (Long)a.get(str);
/*     */       
/* 154 */       if (long_ == null) {
/*     */         
/* 156 */         l.d("FileChangeEngine: old lastModified null for " + str);
/*     */       }
/* 158 */       else if (long_.longValue() != l) {
/*     */         
/* 160 */         l.d("FileChangeEngine: Detected change to:" + str + " now " + l);
/*     */       } 
/*     */       
/* 163 */       a.put(str, Long.valueOf(l));
/*     */       
/* 165 */       b++;
/* 166 */       if (b > 50) {
/*     */         
/* 168 */         b = 0;
/*     */ 
/*     */         
/*     */         try {
/* 172 */           Thread.sleep(2L);
/*     */         }
/* 174 */         catch (InterruptedException interruptedException) {}
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
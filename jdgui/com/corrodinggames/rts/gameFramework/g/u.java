/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.BufferedReader;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class u
/*     */   implements Runnable
/*     */ {
/*     */   int a;
/*     */   List b;
/*     */   s c;
/*     */   String d;
/*     */   boolean e;
/*     */   
/*     */   public u(List paramList, s params, String paramString, boolean paramBoolean, int paramInt) {
/* 300 */     this.a = paramInt;
/* 301 */     this.b = paramList;
/* 302 */     this.c = params;
/* 303 */     this.d = paramString;
/* 304 */     this.e = paramBoolean;
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
/*     */   public void run() {
/* 316 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 322 */       l.b("LoadFromMasterServer", this.a + ": Started doSingleRequest");
/*     */       
/* 324 */       BufferedReader bufferedReader = (n.a(this.b, this.d, this.e)).a;
/*     */ 
/*     */       
/* 327 */       l.b("LoadFromMasterServer", this.a + ": Ended doSingleRequest");
/*     */ 
/*     */ 
/*     */       
/* 331 */       this.c.a(bufferedReader, this.a, this.d);
/*     */     }
/* 333 */     catch (Exception exception) {
/*     */       
/* 335 */       exception.printStackTrace();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 340 */       String str1 = f.a(exception, true);
/*     */ 
/*     */ 
/*     */       
/* 344 */       if (exception instanceof java.net.UnknownHostException)
/*     */       {
/* 346 */         str1 = "DNS lookup failed, check your internet connection";
/*     */       }
/*     */       
/* 349 */       if (str1 != null && str1.contains("Cleartext HTTP traffic"))
/*     */       {
/* 351 */         str1 = str1 + " ( Broken apk file? - " + l.h() + ")";
/*     */       }
/*     */       
/* 354 */       this.c.d = "#" + this.a + ": " + str1;
/*     */ 
/*     */ 
/*     */       
/* 358 */       String str2 = "Error getting game list from server #" + this.a;
/* 359 */       l.d(str2);
/*     */ 
/*     */       
/* 362 */       if (l.l())
/*     */       {
/* 364 */         l.a("Error getting game list from server #" + this.a, 1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 370 */     synchronized (this.c) {
/*     */       
/* 372 */       this.c.f--;
/* 373 */       if (this.c.f == 0)
/*     */       {
/* 375 */         this.c.a();
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
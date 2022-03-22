/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import a.a.b;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class am
/*     */   implements Runnable
/*     */ {
/*     */   public final boolean a = false;
/*     */   public static boolean b = true;
/*     */   private final ad r;
/*     */   volatile boolean c;
/*     */   ServerSocket d;
/*     */   int e;
/*     */   boolean f;
/*     */   long g;
/*     */   final boolean h = false;
/*     */   final boolean i = true;
/*     */   final Object j;
/*     */   ArrayList k;
/*     */   final Object l;
/*     */   int m;
/*     */   int n;
/*     */   boolean o;
/*     */   boolean p;
/*     */   boolean q;
/*     */   
/*     */   strictfp am(ad paramad) {
/*  39 */     this.c = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.g = -1L;
/*     */     
/*  48 */     this.h = false;
/*  49 */     this.i = true;
/*     */     
/*  51 */     this.j = new Object();
/*     */ 
/*     */     
/*  54 */     this.k = new ArrayList();
/*  55 */     this.l = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     this.m = 0;
/*     */     
/*  67 */     this.n = 0;
/*     */     this.r = paramad;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(InetAddress paramInetAddress, boolean paramBoolean) {
/*  76 */     if (paramInetAddress == null) {
/*     */       
/*  78 */       l.d("isIpAllowed: inetAddress==null");
/*  79 */       return true;
/*     */     } 
/*     */     
/*  82 */     if (!b)
/*     */     {
/*  84 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  89 */     long l = System.currentTimeMillis();
/*     */     
/*  91 */     if (l > this.g + 60000L) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  98 */       this.g = l;
/*     */       
/* 100 */       synchronized (this.l) {
/*     */         
/* 102 */         this.k.clear();
/*     */       } 
/*     */       
/* 105 */       this.m = 0;
/* 106 */       this.n = 0;
/*     */       
/* 108 */       this.o = false;
/* 109 */       this.p = false;
/* 110 */       this.q = false;
/*     */     } 
/*     */ 
/*     */     
/* 114 */     synchronized (this.l) {
/*     */       
/* 116 */       boolean bool = false;
/*     */       
/* 118 */       for (an an : this.k) {
/*     */         
/* 120 */         if (paramInetAddress.equals(an.a)) {
/*     */           
/* 122 */           an.b++;
/*     */           
/* 124 */           byte b = 30;
/*     */           
/* 126 */           if (this.n > 100)
/*     */           {
/* 128 */             b = 10;
/*     */           }
/*     */           
/* 131 */           if (this.n > 250)
/*     */           {
/* 133 */             b = 5;
/*     */           }
/*     */           
/* 136 */           if (an.b > b) {
/*     */             
/* 138 */             if (!an.c) {
/*     */               
/* 140 */               an.c = true;
/* 141 */               l.d("DOS: Too many attempts:" + an.b + " ip:" + paramInetAddress.toString());
/*     */             } 
/*     */             
/* 144 */             if (an.b > 300)
/*     */             {
/* 146 */               if (!an.d) {
/*     */                 
/* 148 */                 an.d = true;
/* 149 */                 l.d("DOS: Excessive attempts:" + an.b + " ip:" + paramInetAddress.toString());
/*     */               } 
/*     */             }
/* 152 */             return false;
/*     */           } 
/* 154 */           bool = true;
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       
/* 161 */       if (!bool) {
/*     */ 
/*     */         
/* 164 */         if (paramBoolean)
/*     */         {
/* 166 */           this.m++;
/*     */         }
/*     */         
/* 169 */         if (this.k.size() > 200) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 175 */           an an1 = null;
/* 176 */           for (an an2 : this.k) {
/*     */             
/* 178 */             if (an1 == null || an1.b > an2.b)
/*     */             {
/* 180 */               an1 = an2;
/*     */             }
/*     */           } 
/* 183 */           if (an1 != null)
/*     */           {
/* 185 */             this.k.remove(an1);
/*     */           }
/*     */         } 
/*     */         
/* 189 */         an an = new an(this);
/* 190 */         an.a = paramInetAddress;
/*     */         
/* 192 */         this.k.add(an);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     if (this.m > 500) {
/*     */       
/* 201 */       if (!this.p) {
/*     */         
/* 203 */         this.p = true;
/* 204 */         l.d("DOS: Too many unique attempts: " + this.m + ". udp:" + this.f);
/*     */       } 
/*     */       
/* 207 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     byte b1 = 0;
/* 214 */     byte b2 = 0;
/*     */     
/* 216 */     for (c c : this.r.aV) {
/*     */       
/* 218 */       b2++;
/* 219 */       if (c.e != null)
/*     */       {
/* 221 */         if (paramInetAddress.equals(c.e))
/*     */         {
/* 223 */           b1++;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 228 */     byte b3 = 20;
/* 229 */     if (b2 > '')
/*     */     {
/* 231 */       b3 = 10;
/*     */     }
/* 233 */     if (b2 > 'È')
/*     */     {
/* 235 */       b3 = 5;
/*     */     }
/*     */     
/* 238 */     if (b1 > b3) {
/*     */       
/* 240 */       if (!this.q) {
/*     */         
/* 242 */         this.q = true;
/* 243 */         l.d("DOS: Too open connections from same ip:" + paramInetAddress.toString() + " (count:" + b1 + ") max:" + b3);
/*     */       } 
/* 245 */       return false;
/*     */     } 
/*     */     
/* 248 */     if (b2 > 'Ĭ') {
/*     */       
/* 250 */       if (!this.o) {
/*     */         
/* 252 */         this.o = true;
/* 253 */         l.d("DOS: Too open connections locking down:" + paramInetAddress.toString() + " (count:" + b2 + ")");
/*     */       } 
/* 255 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 259 */     this.n++;
/*     */ 
/*     */ 
/*     */     
/* 263 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 274 */     this.r.c("Recreating server socket " + (this.f ? "udp" : "tcp"));
/*     */ 
/*     */     
/* 277 */     synchronized (this.j) {
/*     */       
/* 279 */       if (this.d != null) {
/*     */ 
/*     */         
/*     */         try {
/* 283 */           this.d.close();
/*     */         }
/* 285 */         catch (IOException iOException) {
/*     */           
/* 287 */           iOException.printStackTrace();
/*     */         } 
/*     */         
/* 290 */         this.d = null;
/*     */       } 
/*     */       
/* 293 */       if (!this.c)
/*     */       {
/* 295 */         throw new IOException("recreate on non-active socket");
/*     */       }
/*     */       
/* 298 */       a(this.f);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(boolean paramBoolean) {
/* 306 */     this.e = this.r.l;
/*     */ 
/*     */     
/* 309 */     this.r.c("starting socket.. " + (paramBoolean ? "udp" : "tcp") + " port: " + this.e);
/*     */     
/* 311 */     this.f = paramBoolean;
/*     */     
/* 313 */     if (!paramBoolean) {
/*     */ 
/*     */       
/* 316 */       this.d = new ServerSocket(this.e);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 333 */       b b = new b(this.r.l, 0, null, true);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 338 */       b.a(new am$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 354 */       this.d = (ServerSocket)b;
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
/*     */   public strictfp void run() {
/* 366 */     l.ag();
/*     */     
/* 368 */     Thread.currentThread().setName("NewConnectionWorker-" + (this.f ? "udp" : "tcp") + " - " + this.e);
/*     */     
/* 370 */     byte b1 = 0;
/* 371 */     byte b2 = 0;
/*     */ 
/*     */     
/* 374 */     this.r.c("reading..");
/* 375 */     while (this.c) {
/*     */       Socket socket;
/*     */ 
/*     */       
/*     */       try {
/* 380 */         socket = this.d.accept();
/*     */       }
/* 382 */       catch (IOException iOException) {
/*     */         
/* 384 */         if (!this.c) {
/*     */           
/* 386 */           l.d("ServerSocket-accept(" + (this.f ? "udp" : "tcp") + "): Got expected IOException after closed socket");
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 391 */         l l = l.u();
/*     */         
/* 393 */         b1++;
/*     */         
/* 395 */         l.d("ServerSocket-accept(" + (this.f ? "udp" : "tcp") + ") failed: " + iOException.getMessage() + " (closed:" + this.d.isClosed() + ")");
/*     */         
/* 397 */         if (b1 > 100) {
/*     */           
/* 399 */           l.d("Too many server socket fails");
/* 400 */           b();
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/*     */         try {
/* 406 */           a();
/*     */         }
/* 408 */         catch (IOException iOException1) {
/*     */           
/* 410 */           iOException1.printStackTrace();
/* 411 */           l.u().h("Warning server socket got closed and could not be recreated");
/* 412 */           b();
/*     */           
/*     */           return;
/*     */         } 
/* 416 */         if (b2 < 3) {
/*     */           
/* 418 */           int i = l.bF.w();
/*     */           
/* 420 */           if (i > 0) {
/*     */ 
/*     */ 
/*     */             
/* 424 */             String str = "Warning: server socket got closed and needed to be recreated, players were likely disconnected (but can rejoin).";
/*     */             
/* 426 */             if (l.aJ)
/*     */             {
/* 428 */               str = str + "\n This likely due to iOS removing sockets of background apps. Avoid minimising the game when hosting.";
/*     */             }
/*     */             
/* 431 */             l.u().h(str);
/* 432 */             b2++;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/*     */         continue;
/*     */       } 
/*     */ 
/*     */       
/*     */       try {
/* 442 */         socket.setTcpNoDelay(true);
/*     */         
/* 444 */         socket.setSoTimeout(15000);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 449 */         String str1 = "<unknown>";
/*     */         
/* 451 */         InetAddress inetAddress = socket.getInetAddress();
/* 452 */         if (inetAddress != null)
/*     */         {
/* 454 */           str1 = inetAddress.getHostAddress();
/*     */         }
/*     */         
/* 457 */         if (!a(inetAddress, true)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 464 */           socket.close();
/*     */ 
/*     */           
/*     */           continue;
/*     */         } 
/*     */         
/* 470 */         c c = new c(this.r, socket);
/*     */ 
/*     */         
/* 473 */         String str2 = "Accepted new connection id:" + c.c + ".. (ip:" + str1 + ")";
/* 474 */         if (this.f)
/*     */         {
/* 476 */           str2 = str2 + " (udp)";
/*     */         }
/* 478 */         this.r.c(str2);
/*     */         
/* 480 */         c.h = this.f;
/* 481 */         c.e = inetAddress;
/*     */         
/* 483 */         c.d();
/* 484 */         this.r.aV.add(c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 492 */       catch (IOException iOException) {
/*     */         
/* 494 */         l.d("Got IOException on new player connection");
/* 495 */         iOException.printStackTrace();
/*     */       } 
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
/*     */   public strictfp void b() {
/* 524 */     synchronized (this.j) {
/*     */       
/* 526 */       this.c = false;
/*     */       
/* 528 */       if (this.d != null) {
/*     */ 
/*     */         
/*     */         try {
/* 532 */           this.d.close();
/*     */         }
/* 534 */         catch (IOException iOException) {
/*     */           
/* 536 */           iOException.printStackTrace();
/*     */         } 
/* 538 */         this.d = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
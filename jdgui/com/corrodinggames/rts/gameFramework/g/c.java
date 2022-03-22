/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.a.l;
/*     */ import com.corrodinggames.rts.game.e;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Socket;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final ad R;
/*     */   volatile boolean a = false;
/*     */   volatile boolean b = false;
/*     */   public int c;
/*     */   Socket d;
/*     */   InetAddress e;
/*  57 */   ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
/*     */   
/*     */   public long g;
/*     */   
/*     */   public boolean h;
/*     */   
/*     */   public boolean i;
/*     */   
/*     */   public c j;
/*  66 */   public int k = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   ar l;
/*     */ 
/*     */   
/*     */   public String m;
/*     */ 
/*     */   
/*     */   public boolean n;
/*     */ 
/*     */   
/*     */   public boolean o;
/*     */ 
/*     */   
/*     */   public boolean p;
/*     */ 
/*     */   
/*     */   public boolean q;
/*     */ 
/*     */   
/*     */   public boolean r;
/*     */ 
/*     */   
/*     */   public boolean s;
/*     */ 
/*     */   
/*     */   public boolean t;
/*     */ 
/*     */   
/*     */   public boolean u;
/*     */ 
/*     */   
/*     */   public int v;
/*     */ 
/*     */   
/*     */   public e w;
/*     */ 
/*     */   
/* 106 */   int x = -1;
/* 107 */   long y = -1L;
/*     */ 
/*     */   
/*     */   boolean z = false;
/*     */   
/*     */   boolean A = false;
/*     */   
/* 114 */   public int B = 999999;
/*     */   
/*     */   d C;
/*     */   
/*     */   e D;
/*     */   
/*     */   Thread E;
/*     */   
/*     */   Thread F;
/*     */   
/*     */   boolean G = false;
/*     */   
/*     */   boolean H = false;
/*     */   
/*     */   public String I;
/*     */   
/*     */   public int J;
/*     */   public int K;
/*     */   public boolean L;
/*     */   public int M;
/*     */   public long N;
/*     */   public boolean O;
/*     */   volatile int P;
/*     */   volatile int Q;
/*     */   
/*     */   public strictfp c(ad paramad, Socket paramSocket) {
/* 140 */     this.R = paramad;
/* 141 */     this.d = paramSocket;
/*     */     
/* 143 */     synchronized (this.R.aZ) {
/*     */       
/* 145 */       this.c = this.R.aY;
/* 146 */       this.R.aY++;
/*     */     } 
/*     */     
/* 149 */     this.J = f.a(1, 1000000);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a() {
/* 160 */     if (this.N < System.currentTimeMillis() - 10000L) {
/*     */       
/* 162 */       this.N = System.currentTimeMillis();
/* 163 */       this.M = 0;
/*     */     } 
/*     */     
/* 166 */     if (this.M > 100) {
/*     */       
/* 168 */       if (!this.O) {
/*     */         
/* 170 */         this.O = true;
/* 171 */         c("Command limit was reached");
/*     */       } 
/* 173 */       return true;
/*     */     } 
/*     */     
/* 176 */     this.M++;
/*     */     
/* 178 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/* 184 */     if (this.y == -1L)
/*     */     {
/* 186 */       return -2;
/*     */     }
/*     */     
/* 189 */     if (this.y < System.currentTimeMillis() - 5000L)
/*     */     {
/* 191 */       return -1;
/*     */     }
/*     */     
/* 194 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp int c() {
/* 201 */     e e1 = this.w;
/* 202 */     if (e1 != null)
/*     */     {
/* 204 */       return e1.i;
/*     */     }
/* 206 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized strictfp void d() {
/* 214 */     this.D = new e(this);
/* 215 */     this.F = new Thread(this.D);
/* 216 */     this.F.setDaemon(true);
/* 217 */     this.F.start();
/*     */ 
/*     */     
/* 220 */     this.C = new d(this, null);
/* 221 */     this.E = new Thread(this.C);
/* 222 */     this.E.setDaemon(true);
/* 223 */     this.E.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private strictfp void h() {
/* 233 */     this.a = true;
/*     */     
/* 235 */     if (this.R.A)
/*     */     {
/*     */       
/* 238 */       if (!this.R.j()) {
/*     */         
/* 240 */         e e1 = this.w;
/*     */         
/* 242 */         if (e1 != null) {
/*     */           
/* 244 */           this.w = null;
/*     */           
/* 246 */           c c1 = this.R.b((m)e1);
/*     */           
/* 248 */           if (c1 == null) {
/*     */ 
/*     */ 
/*     */             
/* 252 */             e1.E();
/*     */ 
/*     */ 
/*     */             
/* 256 */             this.R.H();
/* 257 */             l.k();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     if (this.E != null)
/*     */     {
/* 269 */       this.E.interrupt();
/*     */     }
/*     */ 
/*     */     
/* 273 */     this.R.a(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     this.n = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 294 */     if (this.o)
/*     */     {
/* 296 */       this.R.i(this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized strictfp void i() {
/* 303 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 308 */     this.b = true;
/*     */     
/* 310 */     if (this.D != null)
/*     */     {
/* 312 */       this.D.a();
/*     */     }
/*     */     
/* 315 */     if (this.E != null)
/*     */     {
/* 317 */       this.E.interrupt();
/*     */     }
/*     */     
/* 320 */     this.R.a(this);
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
/*     */   public strictfp void a(String paramString) {
/* 338 */     ap ap = new ap();
/*     */     
/*     */     try {
/* 341 */       if (paramString == null)
/*     */       {
/* 343 */         paramString = "NULL";
/*     */       }
/* 345 */       ap.c(paramString);
/*     */     }
/* 347 */     catch (IOException iOException) {
/*     */       
/* 349 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 356 */     a(ap.b(111));
/*     */ 
/*     */     
/* 359 */     i();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized strictfp void b(boolean paramBoolean1, boolean paramBoolean2) {
/* 365 */     a(paramBoolean1, paramBoolean2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String e() {
/* 371 */     String str = "<null>";
/* 372 */     if (this.w != null)
/*     */     {
/* 374 */       str = this.w.q;
/*     */     }
/* 376 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String f() {
/* 382 */     String str = "<no socket>";
/*     */ 
/*     */     
/*     */     try {
/* 386 */       Socket socket = this.d;
/* 387 */       if (socket != null)
/*     */       {
/* 389 */         str = "<no bond socket>";
/* 390 */         InetAddress inetAddress = socket.getInetAddress();
/* 391 */         if (inetAddress != null)
/*     */         {
/* 393 */           str = inetAddress.getHostAddress();
/*     */         }
/*     */       }
/*     */     
/* 397 */     } catch (Exception exception) {
/*     */       
/* 399 */       exception.printStackTrace();
/* 400 */       return "<socket error>";
/*     */     } 
/*     */     
/* 403 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void a(boolean paramBoolean1, boolean paramBoolean2) {
/* 408 */     if (!this.a) {
/*     */       
/* 410 */       c("handleRemoteDisconnect");
/*     */ 
/*     */       
/* 413 */       String str1 = null;
/* 414 */       if (this.w != null)
/*     */       {
/* 416 */         str1 = this.w.q;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 422 */       String str2 = null;
/*     */       
/* 424 */       if (this.w != null) {
/*     */ 
/*     */         
/* 427 */         String str3 = "player";
/* 428 */         String str4 = "";
/*     */         
/* 430 */         if (this.w.b()) {
/*     */           
/* 432 */           str3 = "spectator";
/*     */ 
/*     */         
/*     */         }
/* 436 */         else if (this.R.bf) {
/*     */           
/* 438 */           int i = this.w.a(false, false);
/* 439 */           if (i == 0) {
/*     */             
/* 441 */             str4 = " (Had no units)";
/*     */           }
/*     */           else {
/*     */             
/* 445 */             str4 = " (Team " + this.w.f() + ")";
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 450 */         str2 = str3 + " '" + this.w.q + "' disconnected" + str4;
/*     */ 
/*     */       
/*     */       }
/* 454 */       else if (this.n) {
/*     */         
/* 456 */         if (this.q && this.o) {
/*     */           
/* 458 */           str2 = "relay server disconnected";
/*     */         }
/*     */         else {
/*     */           
/* 462 */           str2 = "a player disconnected";
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 468 */       if (!this.R.A)
/*     */       {
/* 470 */         str2 = "The server disconnected";
/*     */       }
/*     */       
/* 473 */       h();
/*     */ 
/*     */       
/* 476 */       if (str2 != null) {
/*     */ 
/*     */         
/* 479 */         boolean bool = false;
/* 480 */         if (this.w != null && this.R.A) {
/*     */           
/* 482 */           c c1 = this.R.b((m)this.w);
/* 483 */           if (c1 != null)
/*     */           {
/* 485 */             bool = true;
/*     */           }
/*     */         } 
/*     */         
/* 489 */         if (!bool) {
/*     */           
/* 491 */           if (!this.R.A)
/*     */           {
/* 493 */             this.R.e(str2);
/*     */           }
/*     */           else
/*     */           {
/* 497 */             this.R.h(str2);
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 502 */           c("Not sending: '" + str2 + "' still another active connection");
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 508 */       this.R.c.b(this, str1);
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 515 */       c("handleRemoteDisconnect: connection is already disconnecting");
/*     */     } 
/*     */     
/* 518 */     if (!paramBoolean2)
/*     */     {
/* 520 */       if (this.D != null)
/*     */       {
/* 522 */         this.D.a();
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 527 */     if (paramBoolean2)
/*     */     {
/* 529 */       this.G = true;
/*     */     }
/* 531 */     if (paramBoolean1)
/*     */     {
/* 533 */       this.H = true;
/*     */     }
/*     */     
/* 536 */     if (this.G && this.H) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/* 541 */         this.d.close();
/*     */       }
/* 543 */       catch (IOException iOException) {
/*     */         
/* 545 */         l.a("Error while closing network socket", iOException);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 550 */       this.F = null;
/* 551 */       this.E = null;
/*     */       
/* 553 */       this.D = null;
/* 554 */       this.C = null;
/*     */       
/* 556 */       if (this.f != null)
/*     */       {
/* 558 */         this.f.clear();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString, Throwable paramThrowable) {
/* 569 */     l.a(d(paramString), paramThrowable);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(String paramString) {
/* 574 */     l.b(d(paramString));
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void c(String paramString) {
/* 579 */     l.d(d(paramString));
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String d(String paramString) {
/* 584 */     paramString = "id:" + this.c + ": " + paramString;
/*     */     
/* 586 */     if (this.w != null)
/*     */     {
/* 588 */       paramString = paramString + " (Player:" + this.w.q + ")";
/*     */     }
/*     */     
/* 591 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ar paramar) {
/* 597 */     if (this.D == null && this.a) {
/*     */       return;
/*     */     }
/*     */     
/* 601 */     this.D.a(paramar);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean g() {
/* 960 */     return !this.a;
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
/*     */   public strictfp void finalize() {
/*     */     try {
/* 973 */       if (this.d == null || this.d.isClosed()) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 978 */       l.d("Connection::finalize called on unclosed socket (index:" + this.c + ")");
/*     */       
/* 980 */       if (this.d.getInetAddress() == null)
/*     */       {
/* 982 */         l.d("Skipping possible steam socket");
/*     */       }
/*     */ 
/*     */       
/*     */       try {
/* 987 */         this.d.close();
/*     */       }
/* 989 */       catch (IOException iOException) {
/*     */         
/* 991 */         iOException.printStackTrace();
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 997 */     catch (RuntimeException runtimeException) {
/*     */       
/* 999 */       runtimeException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.content.Context;
/*      */ import com.corrodinggames.rts.game.a.a;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.h;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.aj;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.BufferedOutputStream;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ba
/*      */ {
/*   34 */   String a = "replays/";
/*      */   
/*      */   public static boolean b = true;
/*      */   
/*      */   public static boolean c = true;
/*      */   
/*      */   public static boolean d = true;
/*      */   
/*      */   public static boolean e = true;
/*      */   
/*      */   public boolean f;
/*      */   
/*      */   int g;
/*      */   int h;
/*      */   boolean i;
/*      */   int j;
/*      */   boolean k;
/*      */   
/*      */   public static strictfp void a(String paramString) {
/*   53 */     l.d("Replay: " + paramString);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void b(String paramString) {
/*   58 */     l.b("Replay: " + paramString);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void a(String paramString, Exception paramException) {
/*   63 */     l.a("Replay: " + paramString, paramException);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp File a(String paramString, boolean paramBoolean) {
/*   83 */     String str = y.a(paramString, this.a);
/*      */     
/*   85 */     File file = new File(str);
/*      */     
/*   87 */     if (paramBoolean) {
/*      */       
/*   89 */       file.getParentFile().mkdirs();
/*   90 */       if (!file.canWrite());
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   96 */     return file;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean l = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int m;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int o;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String p;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean q;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private volatile boolean N;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   String r;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean s;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  164 */   public int t = 1;
/*      */   
/*      */   bd u;
/*      */   
/*      */   bd v;
/*      */   
/*      */   int w;
/*      */   
/*      */   int x;
/*      */   
/*      */   int y;
/*      */   
/*      */   int z;
/*      */   
/*      */   FileInputStream A;
/*      */   
/*      */   BufferedInputStream B;
/*      */   
/*      */   DataInputStream C;
/*      */   
/*      */   k D;
/*      */   
/*      */   FileOutputStream E;
/*      */   
/*      */   BufferedOutputStream F;
/*      */   
/*      */   DataOutputStream G;
/*      */   
/*      */   ap H;
/*      */   
/*      */   bb I;
/*      */   
/*      */   Thread J;
/*      */ 
/*      */   
/*      */   public strictfp void a(Context paramContext) {}
/*      */ 
/*      */   
/*      */   public strictfp void a() {
/*  203 */     l l = l.u();
/*  204 */     if (l.bc != 0.0F) {
/*      */       
/*  206 */       l.bc = 0.0F;
/*      */     }
/*      */     else {
/*      */       
/*  210 */       l.bc = 1.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b() {
/*  216 */     l l = l.u();
/*      */     
/*  218 */     if (l.bc == 1.0F) {
/*      */       
/*  220 */       l.bc = 2.0F;
/*      */     }
/*  222 */     else if (l.bc == 2.0F) {
/*      */       
/*  224 */       l.bc = 4.0F;
/*      */     }
/*  226 */     else if (l.bc == 4.0F) {
/*      */       
/*  228 */       l.bc = 8.0F;
/*      */     }
/*  230 */     else if (l.bc == 8.0F) {
/*      */       
/*  232 */       l.bc = 16.0F;
/*      */     }
/*  234 */     else if (l.bc == 16.0F) {
/*      */       
/*  236 */       l.bc = 32.0F;
/*      */     }
/*  238 */     else if (l.bc == 32.0F) {
/*      */       
/*  240 */       l.bc = 64.0F;
/*      */     }
/*  242 */     else if (l.bc == 64.0F) {
/*      */       
/*  244 */       l.bc = 1.0F;
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  249 */       l.bc = 1.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(int paramInt1, String paramString1, String paramString2, int paramInt2) {
/*  283 */     bb bb1 = this.I;
/*      */     
/*  285 */     if (this.N && !this.s) {
/*      */ 
/*      */       
/*  288 */       if (paramString2.startsWith("-t "));
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  293 */       bd bd1 = new bd();
/*  294 */       bd1.a = paramInt2;
/*  295 */       bd1.g = new bc();
/*  296 */       bd1.g.a = paramInt1;
/*  297 */       bd1.g.b = paramString1;
/*  298 */       bd1.g.c = paramString2;
/*      */ 
/*      */ 
/*      */       
/*  302 */       if (bb1 == null) {
/*      */         
/*  304 */         l.f("Failed to record chat message, replay might have already stopped");
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  310 */       bb1.a(bd1);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2) {
/*  316 */     bb bb1 = this.I;
/*      */ 
/*      */ 
/*      */     
/*  320 */     if (this.N && !this.s) {
/*      */       
/*  322 */       bd bd1 = new bd();
/*  323 */       bd1.a = paramInt1;
/*  324 */       bd1.f = paramArrayOfbyte;
/*      */       
/*  326 */       bd1.h = paramInt2;
/*  327 */       bd1.i = paramInt3;
/*      */       
/*  329 */       bd1.j = paramFloat1;
/*  330 */       bd1.k = paramFloat2;
/*      */ 
/*      */       
/*  333 */       if (bb1 == null) {
/*      */         
/*  335 */         l.f("Failed to save resync, replay might have already stopped");
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  340 */       bb1.a(bd1);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(e parame, int paramInt) {
/*  346 */     bb bb1 = this.I;
/*      */ 
/*      */     
/*  349 */     if (this.N)
/*      */     {
/*  351 */       if (!this.s) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  357 */         if (bb1 == null) {
/*      */           
/*  359 */           l.f("Failed to record command, replay might have already stopped");
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/*  364 */         bd bd1 = new bd();
/*  365 */         bd1.e = parame.f();
/*  366 */         bd1.a = paramInt;
/*      */         
/*  368 */         bb1.a(bd1);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  373 */         this.h++;
/*  374 */         if (this.h > 5) {
/*      */           
/*  376 */           this.h = 0;
/*  377 */           l l = l.u();
/*      */           
/*  379 */           bd bd2 = new bd();
/*  380 */           bd2.c = Long.valueOf(e());
/*  381 */           bd2.a = l.bg;
/*  382 */           bb1.a(bd2);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c() {
/*  400 */     if (this.N)
/*      */     {
/*  402 */       if (!this.s) {
/*      */         
/*  404 */         l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  411 */         bd bd1 = new bd();
/*  412 */         ap ap1 = new ap();
/*      */         
/*      */         try {
/*  415 */           ap1.c(0);
/*      */           
/*  417 */           ap1.a(l.bF.ah.size());
/*  418 */           for (aj aj : l.bF.ah)
/*      */           {
/*  420 */             ap1.a(aj.b);
/*      */           
/*      */           }
/*      */         
/*      */         }
/*  425 */         catch (IOException iOException) {
/*      */           
/*  427 */           throw new RuntimeException(iOException);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  434 */         bd1.d = ap1.d();
/*      */         
/*  436 */         bd1.a = l.bg;
/*  437 */         this.I.a(bd1);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  445 */   Object K = new Object();
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void d() {
/*  450 */     synchronized (this.K) {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */ 
/*      */         
/*  457 */         if (this.I != null) {
/*      */           
/*  459 */           this.I.a();
/*      */ 
/*      */           
/*      */           try {
/*  463 */             this.J.join();
/*      */           }
/*  465 */           catch (InterruptedException interruptedException) {
/*      */             
/*  467 */             interruptedException.printStackTrace();
/*      */           } 
/*      */           
/*  470 */           this.N = false;
/*      */           
/*  472 */           this.I = null;
/*  473 */           this.J = null;
/*      */         } 
/*      */         
/*  476 */         if (this.E != null)
/*      */         {
/*  478 */           this.G.flush();
/*  479 */           this.G.close();
/*  480 */           this.F.flush();
/*  481 */           this.F.close();
/*  482 */           this.E.flush();
/*  483 */           this.E.close();
/*      */         }
/*      */       
/*  486 */       } catch (IOException iOException) {
/*      */         
/*  488 */         iOException.printStackTrace();
/*      */       }
/*      */       finally {
/*      */         
/*  492 */         this.E = null;
/*  493 */         this.F = null;
/*  494 */         this.G = null;
/*  495 */         this.H = null;
/*      */       } 
/*      */       
/*  498 */       this.q = false;
/*      */       
/*  500 */       this.N = false;
/*  501 */       this.s = false;
/*      */       
/*  503 */       this.r = null;
/*  504 */       this.g = 0;
/*  505 */       this.h = 0;
/*      */       
/*  507 */       this.i = false;
/*  508 */       this.j = 0;
/*  509 */       this.k = false;
/*      */       
/*  511 */       this.w = 0;
/*  512 */       this.t = 1;
/*      */       
/*  514 */       this.x = 0;
/*  515 */       this.y = 0;
/*  516 */       this.z = 0;
/*      */       
/*  518 */       this.m = -1;
/*  519 */       this.n = 0;
/*  520 */       this.o = -1;
/*  521 */       this.p = null;
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/*  526 */         if (this.A != null)
/*      */         {
/*  528 */           this.C.close();
/*  529 */           this.B.close();
/*  530 */           this.A.close();
/*      */         }
/*      */       
/*  533 */       } catch (IOException iOException) {
/*      */         
/*  535 */         iOException.printStackTrace();
/*      */       }
/*      */       finally {
/*      */         
/*  539 */         this.A = null;
/*  540 */         this.B = null;
/*  541 */         this.C = null;
/*  542 */         this.D = null;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp long e() {
/*  552 */     long l = 0L;
/*      */     
/*  554 */     for (w w : w.dK) {
/*      */       
/*  556 */       if (w instanceof r) {
/*      */         
/*  558 */         r r = (r)w;
/*      */         
/*  560 */         l = (long)((float)l + r.dH * 1000.0F);
/*  561 */         l = (long)((float)l + r.dI * 1000.0F);
/*      */         
/*  563 */         l = (long)((float)l + r.bY * 1.0F);
/*      */         
/*  565 */         l += r.dA;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  570 */     return l;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean L = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean M;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void f() {
/*  589 */     if (!this.L)
/*      */     {
/*  591 */       d();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean c(String paramString) {
/*  635 */     File file = a(paramString, false);
/*      */ 
/*      */     
/*  638 */     return a(paramString, file);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp void j() {
/*  648 */     for (byte b = 0; b < m.a; b++) {
/*      */       
/*  650 */       m m = m.n(b);
/*  651 */       if (m != null)
/*      */       {
/*  653 */         if (m instanceof a)
/*      */         {
/*  655 */           ((a)m).aG = true;
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(String paramString, File paramFile) {
/*  667 */     if (this.N)
/*      */     {
/*  669 */       if (this.s) {
/*      */         
/*  671 */         l.b("startReplayingFile: A replay is already playing");
/*      */       }
/*      */       else {
/*      */         
/*  675 */         l.b("startReplayingFile: A replay is already saving");
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  680 */     d();
/*      */ 
/*      */ 
/*      */     
/*  684 */     l l = l.u();
/*      */     
/*  686 */     l.c();
/*      */ 
/*      */     
/*  689 */     l.bF.m();
/*      */     
/*  691 */     this.u = null;
/*      */     
/*  693 */     this.q = false;
/*      */     
/*  695 */     this.N = true;
/*  696 */     this.s = true;
/*  697 */     this.r = paramString;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  704 */       this.A = new FileInputStream(paramFile);
/*  705 */       this.B = new BufferedInputStream(this.A);
/*  706 */       this.C = new DataInputStream(this.B);
/*  707 */       this.D = new k(this.C);
/*      */ 
/*      */       
/*  710 */       String str1 = this.D.k();
/*      */       
/*  712 */       if (!str1.equals("rustedWarfareReplay")) {
/*      */ 
/*      */         
/*  715 */         l.d("Header is not correct:" + str1);
/*      */         
/*  717 */         String str = "Cannot load replay: File is missing header (check if this file is a replay)";
/*  718 */         l.d(str);
/*  719 */         l.a(str, 1);
/*      */         
/*  721 */         return false;
/*      */       } 
/*      */       
/*  724 */       int i = this.D.f();
/*      */       
/*  726 */       int j = this.D.f();
/*  727 */       a("Loading save from version: " + j);
/*      */ 
/*      */       
/*  730 */       this.D.a(j);
/*      */ 
/*      */       
/*  733 */       String str2 = this.D.k();
/*      */       
/*  735 */       if ((j != 90 || i != l.c(true)) && !this.l) {
/*      */ 
/*      */         
/*  738 */         String str = "Cannot load replay: This replay was recording with a different version: " + str2;
/*      */         
/*  740 */         if (l.al())
/*      */         {
/*  742 */           str = str + " (You can use the beta tab in steam to switch to old versions)";
/*      */         }
/*      */         
/*  745 */         l.a(str, 1);
/*      */         
/*  747 */         a("Replay version: " + j + " (" + i + ")");
/*  748 */         a("GameSaver.thisSaveVersion: 90 (" + l.c(true) + ")");
/*      */ 
/*      */ 
/*      */         
/*  752 */         if (!l.ay) {
/*      */           
/*  754 */           this.N = false;
/*      */ 
/*      */ 
/*      */           
/*  758 */           return false;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  764 */       this.o = j;
/*  765 */       this.p = str2;
/*      */       
/*  767 */       this.D.e();
/*      */ 
/*      */       
/*  770 */       this.D.b("gamesave");
/*      */       
/*  772 */       this.M = false;
/*      */       
/*  774 */       this.L = true;
/*  775 */       a("Loading replay initial save");
/*      */       
/*  777 */       l.bI.a(this.D, false, false, false);
/*  778 */       this.L = false;
/*      */       
/*  780 */       this.D.d("gamesave");
/*      */ 
/*      */       
/*  783 */       if (!this.M) {
/*      */         
/*  785 */         a("ReplayEngine: --- No game setup read ----");
/*      */         
/*  787 */         l.bF.aH.i = true;
/*  788 */         l.bl = l.by.teamUnitCapHostedGame;
/*  789 */         l.bk = l.bl;
/*      */       } 
/*      */ 
/*      */       
/*  793 */       if (!this.f)
/*      */       {
/*  795 */         j();
/*      */       }
/*      */       
/*  798 */       a("--- Reply settings ---");
/*      */       
/*  800 */       a("Unit cap: " + l.bl);
/*  801 */       a(l.bF.aH.b());
/*      */       
/*  803 */       a("Starting frame:" + l.bg);
/*      */       
/*  805 */       if (!this.f)
/*      */       {
/*      */         
/*  808 */         for (byte b = 0; b < m.a; b++)
/*      */         {
/*  810 */           m m = m.n(b);
/*  811 */           if (m != null && m.q != null)
/*      */           {
/*      */ 
/*      */             
/*  815 */             String str = "Player '" + m.q + "' playing as " + m.I().toLowerCase() + " (team:" + m.f() + ")";
/*      */             
/*  817 */             l.bA.e.a("", str);
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       }
/*      */     }
/*  824 */     catch (IOException iOException) {
/*      */       
/*  826 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */     
/*  829 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(boolean paramBoolean) {
/* 1125 */     if (l.aG) {
/*      */       
/* 1127 */       if (!l.aN)
/*      */       {
/*      */         return;
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1134 */     else if (!l.aM) {
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1140 */     l l = l.u();
/*      */     
/* 1142 */     if (l.bF.z)
/*      */     {
/* 1144 */       if (!paramBoolean && !this.L)
/*      */       {
/* 1146 */         if (l.by.saveMultiplayerReplays) {
/*      */           
/* 1148 */           String str = l.ac() + " [v" + l.o() + "] (" + f.a("d MMM yyyy HH.mm.ss") + ").replay";
/*      */           
/* 1150 */           d(str);
/*      */         } 
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void d(String paramString) {
/* 1162 */     a("Recording replay to: " + paramString);
/*      */ 
/*      */     
/* 1165 */     if (this.N)
/*      */     {
/* 1167 */       if (this.s) {
/*      */         
/* 1169 */         b("startSaving: A replay is already playing");
/*      */       }
/*      */       else {
/*      */         
/* 1173 */         b("startSaving: A replay is already saving");
/*      */       } 
/*      */     }
/*      */     
/* 1177 */     d();
/*      */ 
/*      */     
/* 1180 */     l l = l.u();
/*      */     
/* 1182 */     this.q = false;
/*      */     
/* 1184 */     this.N = true;
/* 1185 */     this.s = false;
/* 1186 */     this.r = paramString;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1192 */       File file = a(paramString, true);
/*      */ 
/*      */       
/* 1195 */       this.E = new FileOutputStream(file);
/* 1196 */       this.F = new BufferedOutputStream(this.E);
/* 1197 */       this.G = new DataOutputStream(this.F);
/* 1198 */       this.H = new ap(this.G);
/*      */ 
/*      */ 
/*      */       
/* 1202 */       this.H.c("rustedWarfareReplay");
/*      */       
/* 1204 */       int i = l.c(true);
/*      */       
/* 1206 */       this.H.a(i);
/*      */       
/* 1208 */       this.H.a(90);
/*      */       
/* 1210 */       this.H.c(l.o());
/*      */       
/* 1212 */       this.H.a(l.am);
/*      */ 
/*      */       
/* 1215 */       this.H.e("gamesave");
/*      */       
/* 1217 */       l.bI.a(this.H);
/* 1218 */       this.H.a("gamesave");
/*      */ 
/*      */       
/* 1221 */       this.G.flush();
/*      */ 
/*      */ 
/*      */       
/* 1225 */       this.I = new bb(this);
/*      */       
/* 1227 */       this.J = new Thread(this.I);
/* 1228 */       this.J.start();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1241 */     catch (IOException iOException) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1248 */       a("Failed to start recording replay", iOException);
/*      */       
/* 1250 */       l.u().h("Failed to start recording replay: " + iOException.getMessage());
/*      */       
/* 1252 */       d();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat) {
/* 1264 */     l l = l.u();
/*      */     
/* 1266 */     if (this.q) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1271 */     if (this.N && this.s)
/*      */     {
/*      */       while (true) {
/*      */         
/* 1275 */         if (this.u == null) {
/*      */           
/*      */           try {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1282 */             String str = this.D.v();
/* 1283 */             if ("rc".equals(str)) {
/*      */               
/* 1285 */               this.w++;
/*      */ 
/*      */               
/* 1288 */               bd bd1 = new bd();
/* 1289 */               bd1.a = this.D.f();
/* 1290 */               e e = l.bN.b();
/* 1291 */               e.a(this.D);
/* 1292 */               e.a = true;
/* 1293 */               bd1.e = e;
/* 1294 */               this.D.d("rc");
/* 1295 */               this.u = bd1;
/*      */               
/* 1297 */               this.n++;
/* 1298 */               this.m = bd1.a;
/*      */               
/* 1300 */               if (c)
/*      */               {
/* 1302 */                 a("updateGameFrame: Command: " + e.i.q + " count:" + e.d() + " id:" + this.w);
/*      */                 
/* 1304 */                 if (e.j != null) {
/*      */                   
/* 1306 */                   a("updateGameFrame: Waypoint: " + e.j.d().name());
/*      */                   
/* 1308 */                   if (e.j.a() != null)
/*      */                   {
/* 1310 */                     a("updateGameFrame: Build Type: " + e.j.a().i());
/*      */                   }
/*      */                 } 
/*      */ 
/*      */                 
/* 1315 */                 if (s.c(e.k))
/*      */                 {
/* 1317 */                   a("updateGameFrame: SpecialAction: " + e.k.a());
/*      */                 }
/*      */                 
/* 1320 */                 if (e.n != null)
/*      */                 {
/* 1322 */                   a("updateGameFrame: SetAttackMode: " + e.n);
/*      */                 }
/*      */                 
/* 1325 */                 if (e.g)
/*      */                 {
/* 1327 */                   a("updateGameFrame: stopOrUndo is set");
/*      */                 }
/*      */                 
/* 1330 */                 if (e.r) {
/*      */                   
/* 1332 */                   if (e.s != 0.0F)
/*      */                   {
/* 1334 */                     a("updateGameFrame: changeStepRate:" + e.s);
/*      */                   }
/*      */                   
/* 1337 */                   if (e.u != 0)
/*      */                   {
/* 1339 */                     a("updateGameFrame: systemAction_action:" + e.u);
/*      */                   }
/*      */                 } 
/*      */                 
/* 1343 */                 a("updateGameFrame: ------");
/*      */               
/*      */               }
/*      */             
/*      */             }
/* 1348 */             else if ("wait".equals(str)) {
/*      */               
/* 1350 */               bd bd1 = new bd();
/* 1351 */               bd1.a = this.D.f();
/* 1352 */               bd1.b = true;
/*      */               
/* 1354 */               this.u = bd1;
/*      */ 
/*      */               
/* 1357 */               this.D.d("wait");
/*      */             }
/* 1359 */             else if ("cs".equals(str)) {
/*      */ 
/*      */               
/* 1362 */               int i = this.D.f();
/* 1363 */               long l1 = this.D.i();
/*      */               
/* 1365 */               if (!this.l) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1371 */                 if (l.bg != i)
/*      */                 {
/* 1373 */                   l.b("replay:updateGameFrame", "expected:" + i + " got:" + l.bg);
/*      */                 }
/*      */                 
/* 1376 */                 if (e() != l1) {
/*      */                   
/* 1378 */                   b("checksum: checksums don't match!!");
/* 1379 */                   b("checksum: game frameNumber:" + l.bg);
/*      */                   
/* 1381 */                   b("checksum: Replay checksum:" + l1);
/* 1382 */                   b("checksum: Game checksum  :" + e());
/*      */                   
/* 1384 */                   this.j++;
/*      */                   
/* 1386 */                   if (!this.i)
/*      */                   {
/* 1388 */                     this.i = true;
/* 1389 */                     l.bA.e.a("", "Error: This replay might be out of sync");
/*      */                   }
/*      */                 
/*      */                 } else {
/*      */                   
/* 1394 */                   b("checksum: checksums are matching frameNumber:" + l.bg);
/*      */                 } 
/*      */               } 
/*      */               
/* 1398 */               this.D.d("cs");
/*      */             }
/* 1400 */             else if ("es".equals(str)) {
/*      */ 
/*      */               
/* 1403 */               int i = this.D.f();
/*      */               
/* 1405 */               if (!this.l) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1411 */                 if (l.bg != i)
/*      */                 {
/* 1413 */                   l.b("replay:updateGameFrame", "expected:" + i + " got:" + l.bg);
/*      */                 }
/*      */                 
/* 1416 */                 l.d("replay: -long checksum-");
/*      */                 
/* 1418 */                 l.bF.z();
/*      */                 
/* 1420 */                 k k1 = new k(this.D.r());
/*      */                 
/* 1422 */                 k1.d();
/*      */                 
/* 1424 */                 int j = k1.f();
/*      */                 
/* 1426 */                 for (aj aj : l.bF.ah) {
/*      */                   
/* 1428 */                   long l1 = k1.i();
/*      */                   
/* 1430 */                   if (!this.k)
/*      */                   {
/* 1432 */                     if (l1 == aj.b)
/*      */                     {
/* 1434 */                       a("extraChecksum: " + aj.a + " Checksum [" + i + "]. " + l1 + " == " + aj.b + " (ok)");
/*      */                     }
/*      */                   }
/*      */                   
/* 1438 */                   if (l1 != aj.b) {
/*      */                     
/* 1440 */                     if (this.j < 150)
/*      */                     {
/* 1442 */                       b("extraChecksum: " + aj.a + " Checksum [" + i + "]. " + l1 + " != " + aj.b + " (failed)");
/*      */                     }
/*      */                     
/* 1445 */                     this.j++;
/*      */                   } 
/*      */                 } 
/*      */               } 
/*      */ 
/*      */ 
/*      */               
/* 1452 */               this.k = true;
/*      */               
/* 1454 */               this.D.d("es");
/*      */             }
/* 1456 */             else if ("resync".equals(str)) {
/*      */               
/* 1458 */               int i = this.D.f();
/*      */               
/* 1460 */               l.d("Loading resync from replay");
/*      */               
/* 1462 */               if (l.bg != i)
/*      */               {
/* 1464 */                 l.b("replay:resync", "expected:" + i + " got:" + l.bg);
/*      */               }
/*      */               
/* 1467 */               int j = this.D.f();
/* 1468 */               int m = this.D.f();
/*      */               
/* 1470 */               float f1 = this.D.g();
/* 1471 */               float f2 = this.D.g();
/*      */ 
/*      */               
/* 1474 */               k k1 = new k(this.D.r());
/*      */ 
/*      */ 
/*      */               
/* 1478 */               l.bI.a(k1, true, true, true);
/*      */               
/* 1480 */               j();
/*      */               
/* 1482 */               l.bg = j;
/* 1483 */               l.bh = m;
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1488 */               l.bF.ag = 0L;
/*      */ 
/*      */               
/* 1491 */               if (f1 < 0.1D)
/*      */               {
/* 1493 */                 ad.a("replay setCurrentStepRate:" + f1 + " is too small", true);
/*      */               }
/*      */ 
/*      */               
/* 1497 */               l.bF.a(f1, "replay");
/* 1498 */               l.bF.H = f2;
/*      */ 
/*      */               
/* 1501 */               this.D.d("resync");
/*      */             }
/* 1503 */             else if ("chat".equals(str)) {
/*      */ 
/*      */               
/* 1506 */               bd bd1 = new bd();
/* 1507 */               bd1.a = this.D.f();
/*      */               
/* 1509 */               bd1.g = new bc();
/* 1510 */               bd1.g.a = this.D.f();
/* 1511 */               bd1.g.b = this.D.j();
/* 1512 */               bd1.g.c = this.D.j();
/*      */ 
/*      */ 
/*      */               
/* 1516 */               this.u = bd1;
/*      */ 
/*      */ 
/*      */               
/* 1520 */               this.D.d("chat");
/*      */             } else {
/* 1522 */               if ("end".equals(str)) {
/*      */                 
/* 1524 */                 l.b("replay:updateGameFrame", "end of replay block found");
/* 1525 */                 l.bA.e.a("", "Replay has ended");
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1530 */                 if (!l.be) {
/*      */                   
/* 1532 */                   this.q = true;
/*      */                   
/* 1534 */                   l.bc = 0.25F;
/*      */                 
/*      */                 }
/*      */                 else {
/*      */ 
/*      */                   
/* 1540 */                   this.q = false;
/* 1541 */                   this.N = false;
/* 1542 */                   this.s = false;
/*      */                   
/* 1544 */                   h h = l.bA.i();
/* 1545 */                   if (h != null)
/*      */                   {
/* 1547 */                     l.bb = h.bB;
/*      */                   }
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1554 */                 this.D.d("end");
/*      */                 
/* 1556 */                 l.d("number of replay commands issued:" + this.x);
/*      */ 
/*      */ 
/*      */                 
/*      */                 return;
/*      */               } 
/*      */ 
/*      */               
/* 1564 */               l.b("updateGameFrame", "Unknown command block:" + str);
/*      */             }
/*      */           
/*      */           }
/* 1568 */           catch (IOException iOException) {
/*      */             
/* 1570 */             l.b("updateGameFrame", "IOException, read of replay?");
/* 1571 */             iOException.printStackTrace();
/*      */ 
/*      */             
/* 1574 */             this.q = true;
/* 1575 */             l.bc = 0.25F;
/*      */             
/* 1577 */             l.bA.e.a("", "Replay ended (unexpected)");
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/* 1585 */         if (this.u != null) {
/*      */ 
/*      */           
/* 1588 */           if (this.l) {
/*      */             
/* 1590 */             this.u = null;
/*      */             
/*      */             continue;
/*      */           } 
/* 1594 */           if (b)
/*      */           {
/* 1596 */             if (this.u != null)
/*      */             {
/* 1598 */               if (this.v != this.u) {
/*      */                 
/* 1600 */                 this.v = this.u;
/*      */ 
/*      */ 
/*      */                 
/* 1604 */                 l.d("replay: upcoming in " + (this.u.a - l.bg) + " command:" + ((this.u.e != null) ? 1 : 0));
/*      */               } 
/*      */             }
/*      */           }
/*      */ 
/*      */ 
/*      */           
/* 1611 */           if (this.u.b && this.x == 0) {
/*      */             
/* 1613 */             l.d("updateGameFrame: replay: Skipping wait on first resync without commands to avoid delay");
/*      */             
/* 1615 */             this.u = null;
/*      */             
/*      */             continue;
/*      */           } 
/* 1619 */           if (l.bg >= this.u.a) {
/*      */ 
/*      */             
/* 1622 */             if (this.u.e != null) {
/*      */               
/* 1624 */               if (l.bg > this.u.a)
/*      */               {
/* 1626 */                 l.b("updateGameFrame: replay incorrect frameNumber, skipping command:" + l.bg + " vs " + this.u.a);
/*      */               
/*      */               }
/*      */               else
/*      */               {
/* 1631 */                 if (d) {
/*      */                   
/* 1633 */                   m m = this.u.e.p;
/*      */                   
/* 1635 */                   if (m == null) {
/*      */                     
/* 1637 */                     l.d("Precommand Team: commandingPlayer==null");
/*      */                   }
/*      */                   else {
/*      */                     
/* 1641 */                     l.d("Precommand Team id:" + this.u.e.p.i + " credits:" + this.u.e.p.m + " count:" + this.u.e.p
/*      */                         
/* 1643 */                         .s() + " max:" + this.u.e.p
/* 1644 */                         .t());
/*      */                   } 
/*      */                 } 
/*      */ 
/*      */                 
/* 1649 */                 if (this.u.e.r)
/*      */                 {
/* 1651 */                   if (this.u.e.u != 0)
/*      */                   {
/* 1653 */                     l.b("replay:issueCommand", "systemAction_action:" + this.u.e.u);
/*      */                   }
/*      */                 }
/*      */ 
/*      */                 
/* 1658 */                 this.u.e.k();
/*      */ 
/*      */                 
/* 1661 */                 if (d) {
/*      */                   
/* 1663 */                   m m = this.u.e.p;
/*      */                   
/* 1665 */                   if (m != null)
/*      */                   {
/* 1667 */                     l.d("Postcommand credits:" + this.u.e.p.m + " count:" + this.u.e.p
/* 1668 */                         .s() + " max:" + this.u.e.p
/* 1669 */                         .t());
/*      */                   }
/*      */                 } 
/*      */ 
/*      */                 
/* 1674 */                 this.x++;
/*      */               }
/*      */             
/*      */             }
/* 1678 */             else if (this.u.g != null) {
/*      */               
/* 1680 */               bc bc = this.u.g;
/*      */               
/* 1682 */               boolean bool = false;
/*      */               
/* 1684 */               if (bc.c == null) {
/*      */                 
/* 1686 */                 bool = true;
/*      */               }
/*      */               else {
/*      */                 
/* 1690 */                 if (bc.c.startsWith("-i "))
/*      */                 {
/* 1692 */                   bool = true;
/*      */                 }
/*      */                 
/* 1695 */                 if (bc.c.equals("<All players ready>"))
/*      */                 {
/* 1697 */                   bool = true;
/*      */                 }
/*      */                 
/* 1700 */                 if (bc.c.equals("--too many desync errors, suppressing output--"))
/*      */                 {
/* 1702 */                   bool = true;
/*      */                 }
/*      */                 
/* 1705 */                 if (bc.c.startsWith("desync:"))
/*      */                 {
/* 1707 */                   bool = true;
/*      */                 }
/*      */               } 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1714 */               if (!l.by.replaysShowRecordedChat)
/*      */               {
/* 1716 */                 bool = true;
/*      */               }
/*      */               
/* 1719 */               if (bool)
/*      */               {
/* 1721 */                 l.b("replay:updateGameFrame", "Skipping message: " + bc.b + ":" + bc.c);
/*      */               }
/*      */               else
/*      */               {
/* 1725 */                 l.b("replay:updateGameFrame", "message: " + bc.b + ":" + bc.c);
/*      */                 
/* 1727 */                 l.bA.e.a(bc.b, bc.c);
/*      */               }
/*      */             
/* 1730 */             } else if (this.u.b) {
/*      */ 
/*      */               
/* 1733 */               if (c);
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*      */             else {
/*      */ 
/*      */ 
/*      */               
/* 1742 */               l.b("updateGameFrame", "error: lastReadCommand null action");
/*      */             } 
/*      */             
/* 1745 */             this.u = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             continue;
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1767 */         if (this.u != null) {
/*      */           break;
/*      */         }
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void e(String paramString) {
/* 1836 */     if (paramString.contains("\\") || paramString.contains("/")) {
/*      */       
/* 1838 */       l.d("Cannot get replay with path: " + paramString);
/*      */       
/*      */       return;
/*      */     } 
/* 1842 */     File file1 = a(paramString, true);
/* 1843 */     file1.delete();
/*      */ 
/*      */ 
/*      */     
/* 1847 */     File file2 = a(paramString + ".map", true);
/* 1848 */     if (file2.exists())
/*      */     {
/* 1850 */       file2.delete();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean g() {
/* 1859 */     return this.N;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean h() {
/* 1865 */     return (this.N && this.s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean i() {
/* 1872 */     return (this.N && !this.s);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*      */ package com.corrodinggames.rts.java;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.content.ServerContext;
/*      */ import android.graphics.Point;
/*      */ import com.corrodinggames.librocket.a;
/*      */ import com.corrodinggames.librocket.b;
/*      */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*      */ import com.corrodinggames.rts.b.a;
/*      */ import com.corrodinggames.rts.game.i;
/*      */ import com.corrodinggames.rts.gameFramework.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.a.f;
/*      */ import com.corrodinggames.rts.gameFramework.a.h;
/*      */ import com.corrodinggames.rts.gameFramework.ac;
/*      */ import com.corrodinggames.rts.gameFramework.am;
/*      */ import com.corrodinggames.rts.gameFramework.aq;
/*      */ import com.corrodinggames.rts.gameFramework.av;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.g.ac;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ae;
/*      */ import com.corrodinggames.rts.gameFramework.g.c;
/*      */ import com.corrodinggames.rts.gameFramework.g.n;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.l.a;
/*      */ import com.corrodinggames.rts.gameFramework.n;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ah;
/*      */ import com.corrodinggames.rts.gameFramework.utility.l;
/*      */ import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
/*      */ import com.corrodinggames.rts.java.b.a;
/*      */ import com.corrodinggames.rts.java.c.b;
/*      */ import com.corrodinggames.rts.java.d.a;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStreamReader;
/*      */ import java.io.PrintStream;
/*      */ import java.util.Locale;
/*      */ import java.util.concurrent.Semaphore;
/*      */ import org.lwjgl.Sys;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.newdawn.slick.Game;
/*      */ import org.newdawn.slick.Input;
/*      */ import org.newdawn.slick.ScalableGame;
/*      */ import org.newdawn.slick.SlickException;
/*      */ import org.newdawn.slick.opengl.renderer.Renderer;
/*      */ import org.newdawn.slick.opengl.renderer.SGL;
/*      */ import org.newdawn.slick.opengl.renderer.VBORenderer;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Main
/*      */   extends ac
/*      */ {
/*      */   public static boolean a = false;
/*      */   public static boolean b = true;
/*   77 */   public static String c = "Rusted Warfare";
/*      */   
/*      */   public d d;
/*      */   
/*   81 */   public String e = "#28";
/*      */   
/*   83 */   ah f = new ah();
/*      */ 
/*      */   
/*      */   boolean g = true;
/*      */ 
/*      */   
/*      */   public ad h;
/*      */ 
/*      */   
/*      */   a i;
/*      */ 
/*      */   
/*      */   public t j;
/*      */ 
/*      */   
/*      */   b k;
/*      */ 
/*      */   
/*      */   String[] l;
/*      */ 
/*      */   
/*      */   static Main m;
/*      */ 
/*      */   
/*      */   int n;
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] paramArrayOfString) {
/*  112 */     m = new Main();
/*  113 */     m.a(paramArrayOfString);
/*      */     
/*  115 */     Main$1 main$1 = new Main$1();
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
/*      */   public static void a(String paramString) {
/*  150 */     l.d(paramString);
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
/*      */   public void f() {
/*  168 */     l l = new l(new InputStreamReader(System.in));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  173 */     while (this.g) {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/*  178 */         String str = l.a();
/*      */ 
/*      */         
/*  181 */         if (str == null) {
/*      */ 
/*      */           
/*      */           try {
/*  185 */             Thread.sleep(200L);
/*      */           }
/*  187 */           catch (InterruptedException interruptedException) {
/*  188 */             interruptedException.printStackTrace();
/*      */           } 
/*      */           continue;
/*      */         } 
/*  192 */         a((c)null, "ADMIN", str, true);
/*      */       }
/*  194 */       catch (IOException iOException) {
/*      */         
/*  196 */         if (this.n < 3) {
/*      */           
/*  198 */           l.d("Error while reading stdin: " + iOException.toString());
/*  199 */           this.n++;
/*  200 */           if (this.n == 3)
/*      */           {
/*  202 */             l.d("Too many stdin errors, ignoring");
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*      */         try {
/*  208 */           Thread.sleep(700L);
/*      */         }
/*  210 */         catch (InterruptedException interruptedException) {
/*  211 */           interruptedException.printStackTrace();
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
/*      */   public void g() {
/*  234 */     Semaphore semaphore = new Semaphore(0);
/*  235 */     Thread thread = new Thread(new Main$2(this, semaphore));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  244 */     thread.setDaemon(true);
/*      */     
/*  246 */     thread.start();
/*      */     
/*      */     try {
/*  249 */       semaphore.acquire();
/*      */     }
/*  251 */     catch (InterruptedException interruptedException) {
/*  252 */       interruptedException.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public synchronized void a(String[] paramArrayOfString) {
/*  258 */     this.l = paramArrayOfString;
/*      */     
/*  260 */     boolean bool1 = false;
/*  261 */     boolean bool2 = false;
/*      */     
/*  263 */     boolean bool3 = false;
/*      */     
/*  265 */     boolean bool4 = false;
/*      */     
/*  267 */     boolean bool5 = false;
/*  268 */     boolean bool6 = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  273 */     boolean bool7 = false;
/*  274 */     boolean bool8 = false;
/*      */ 
/*      */     
/*  277 */     Integer integer1 = null;
/*  278 */     Integer integer2 = null;
/*      */ 
/*      */     
/*  281 */     l.d("Reading args");
/*      */     
/*  283 */     String str1 = null;
/*      */     
/*  285 */     String str2 = null;
/*      */     byte b1;
/*  287 */     for (b1 = 0; b1 < paramArrayOfString.length; b1++) {
/*      */       
/*  289 */       String str = paramArrayOfString[b1].trim().toLowerCase(Locale.ENGLISH);
/*      */       
/*  291 */       if (str1 != null) {
/*      */ 
/*      */         
/*  294 */         if (str1.equals("+connect_lobby"))
/*      */         {
/*      */           
/*  297 */           a("connect lobby:" + str);
/*      */           
/*  299 */           l.aC = str;
/*      */           
/*  301 */           str1 = null;
/*      */ 
/*      */         
/*      */         }
/*  305 */         else if (str1.equals("-width"))
/*      */         {
/*  307 */           integer1 = Integer.valueOf(Integer.parseInt(str));
/*      */           
/*  309 */           str1 = null;
/*      */ 
/*      */         
/*      */         }
/*  313 */         else if (str1.equals("-height"))
/*      */         {
/*  315 */           integer2 = Integer.valueOf(Integer.parseInt(str));
/*      */           
/*  317 */           str1 = null;
/*      */         }
/*      */         else
/*      */         {
/*  321 */           a("Unknown two_part_arg: " + str1);
/*      */           
/*  323 */           str1 = null;
/*      */         }
/*      */       
/*      */       }
/*  327 */       else if (str.equals("-debug")) {
/*      */         
/*  329 */         b1++;
/*  330 */         if (b1 >= paramArrayOfString.length) {
/*      */           
/*  332 */           a("-debug requires parameters");
/*  333 */           System.exit(1);
/*      */         } 
/*  335 */         String str5 = paramArrayOfString[b1];
/*      */         
/*  337 */         int m = Integer.parseInt(str5.split(":")[0]);
/*  338 */         String str6 = str5.split(":")[1];
/*      */         
/*  340 */         a.a(m, str6);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  345 */       else if (str.equals("-debugscript")) {
/*      */         
/*  347 */         b1++;
/*  348 */         if (b1 >= paramArrayOfString.length) {
/*      */           
/*  350 */           a("-debugscript requires parameters");
/*  351 */           System.exit(1);
/*      */         } 
/*  353 */         String str5 = paramArrayOfString[b1];
/*      */         
/*  355 */         a.a(str5);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  360 */       else if (str.equals("-log")) {
/*      */         
/*  362 */         b1++;
/*  363 */         if (b1 >= paramArrayOfString.length) {
/*      */           
/*  365 */           a("-log requires parameters");
/*  366 */           System.exit(1);
/*      */         } 
/*  368 */         String str5 = paramArrayOfString[b1];
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         try {
/*  374 */           PrintStream printStream = new PrintStream(str5);
/*  375 */           System.setOut(printStream);
/*  376 */           System.setErr(printStream);
/*      */           
/*  378 */           l.d("File logging started");
/*      */         }
/*  380 */         catch (FileNotFoundException fileNotFoundException) {
/*      */           
/*  382 */           l.a("Cannot open log file:" + str5);
/*  383 */           fileNotFoundException.printStackTrace();
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/*  389 */       else if (str.equals("-lang")) {
/*      */         
/*  391 */         b1++;
/*  392 */         if (b1 >= paramArrayOfString.length) {
/*      */           
/*  394 */           a("-lang requires parameters");
/*  395 */           System.exit(1);
/*      */         } 
/*  397 */         String str5 = paramArrayOfString[b1];
/*      */         
/*  399 */         a.d = str5;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  405 */       else if (str.equals("-logcolor")) {
/*      */         
/*  407 */         l.ar = true;
/*      */ 
/*      */       
/*      */       }
/*  411 */       else if (str.equals("-nodisplay")) {
/*      */         
/*  413 */         bool1 = true;
/*      */ 
/*      */       
/*      */       }
/*  417 */       else if (str.equals("-nopreferipv4")) {
/*      */         
/*  419 */         bool4 = true;
/*      */ 
/*      */       
/*      */       }
/*  423 */       else if (str.equals("-noresources")) {
/*      */         
/*  425 */         l.av = true;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  430 */       else if (str.equals("-nosound")) {
/*      */         
/*  432 */         bool2 = true;
/*      */ 
/*      */       
/*      */       }
/*  436 */       else if (str.equals("-nomusic")) {
/*      */         
/*  438 */         bool3 = true;
/*      */ 
/*      */       
/*      */       }
/*  442 */       else if (str.equals("-disable_vbos")) {
/*      */         
/*  444 */         bool7 = true;
/*      */ 
/*      */       
/*      */       }
/*  448 */       else if (str.equals("-force_vbos")) {
/*      */         
/*  450 */         bool8 = true;
/*      */ 
/*      */       
/*      */       }
/*  454 */       else if (str.equals("-allowsoftwarerender")) {
/*      */         
/*  456 */         bool5 = true;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  461 */       else if (str.equals("-fullscreen")) {
/*      */         
/*  463 */         bool6 = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  473 */       else if (str.equals("-nobackground")) {
/*      */         
/*  475 */         l.as = true;
/*      */ 
/*      */       
/*      */       }
/*  479 */       else if (str.equals("-nomods")) {
/*      */         
/*  481 */         l.aB = true;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  486 */       else if (str.equals("-printunits")) {
/*      */         
/*  488 */         l.aw = true;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  493 */       else if (str.equals("-outputunitimages")) {
/*      */         
/*  495 */         l.ax = true;
/*      */ 
/*      */       
/*      */       }
/*  499 */       else if (str.equals("-oldreplays")) {
/*      */         
/*  501 */         l.ay = true;
/*      */ 
/*      */       
/*      */       }
/*  505 */       else if (str.equals("-disabletextureread")) {
/*      */         
/*  507 */         r.z = false;
/*      */ 
/*      */       
/*      */       }
/*  511 */       else if (str.equals("-sandbox")) {
/*      */         
/*  513 */         l.aA = true;
/*      */ 
/*      */       
/*      */       }
/*  517 */       else if (str.equals("-steam")) {
/*      */         
/*  519 */         l.az = true;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  524 */       else if (str.equals("-width") || str.equals("-height")) {
/*      */         
/*  526 */         str1 = str;
/*      */ 
/*      */       
/*      */       }
/*  530 */       else if (str.startsWith("+")) {
/*      */ 
/*      */         
/*  533 */         if (str.equals("+connect_lobby"))
/*      */         {
/*  535 */           str1 = str;
/*      */         }
/*      */         else
/*      */         {
/*  539 */           a("Unknown steam option: " + str);
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/*  546 */       else if (str.trim().length() != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  552 */         a("Unknown option: " + str);
/*      */         
/*  554 */         str2 = "Unknown option: " + str;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  559 */     l.d("Game arguments:");
/*  560 */     for (b1 = 0; b1 < paramArrayOfString.length; b1++) {
/*      */       
/*  562 */       String str = paramArrayOfString[b1].trim().toLowerCase(Locale.ENGLISH);
/*      */       
/*  564 */       a("arg: " + str);
/*      */     } 
/*      */     
/*  567 */     if (str2 != null)
/*      */     {
/*  569 */       if (l.az) {
/*      */         
/*  571 */         a("Unknown options but running anyway due to being in steam");
/*      */       }
/*      */       else {
/*      */         
/*  575 */         a("Exiting due to unknown option: " + str2);
/*      */         
/*  577 */         System.exit(1);
/*      */       } 
/*      */     }
/*      */     
/*  581 */     l.aF = true;
/*      */     
/*  583 */     l.ag();
/*      */ 
/*      */     
/*  586 */     String str3 = System.getProperty("os.name");
/*      */     
/*  588 */     l.d("OS name: " + str3);
/*  589 */     l.d("OS version: " + System.getProperty("os.version"));
/*  590 */     l.d("LWJGL version: " + Sys.getVersion());
/*      */     
/*  592 */     l.d("Build Number: " + this.e);
/*  593 */     l.d("Game Version: 1.14");
/*      */     
/*  595 */     l.d("Game Code: 151");
/*      */     
/*  597 */     i.b = Sys.is64Bit();
/*      */     
/*  599 */     l.d("Is 64bit: " + i.b);
/*      */     
/*  601 */     l.d("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
/*  602 */     l.d("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
/*  603 */     l.d("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
/*      */ 
/*      */     
/*  606 */     if (str3 != null && str3.toLowerCase().contains("mac os"))
/*      */     {
/*  608 */       i.c = true;
/*      */     }
/*      */ 
/*      */     
/*  612 */     if (bool4) {
/*      */       
/*  614 */       l.d("Skipping preferIPv4Stack=true");
/*      */     }
/*      */     else {
/*      */       
/*  618 */       System.setProperty("java.net.preferIPv4Stack", "true");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  624 */     if (l.az) {
/*      */       
/*  626 */       a.a = (a)new b();
/*      */       
/*  628 */       l.d("Early steam init");
/*      */       
/*  630 */       a.a().b();
/*      */       
/*  632 */       l.d("Early steam init done.");
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  638 */       l.d("steam not requested");
/*      */     } 
/*      */ 
/*      */     
/*  642 */     g();
/*      */ 
/*      */ 
/*      */     
/*  646 */     String str4 = c;
/*      */     
/*  648 */     if (bool1)
/*      */     {
/*  650 */       str4 = "";
/*      */     }
/*      */     
/*  653 */     Input.disableControllers();
/*      */     
/*  655 */     if (a)
/*      */     {
/*  657 */       Renderer.setRenderer(2);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  662 */     if (!bool8)
/*      */     {
/*  664 */       if (i.c) {
/*      */         
/*  666 */         l.d("Disabling vbo on mac (without force option)");
/*  667 */         bool7 = true;
/*      */       } 
/*      */     }
/*      */     
/*  671 */     if (bool7) {
/*      */       
/*  673 */       l.d("disable_vbos requested");
/*      */       
/*  675 */       SGL sGL = Renderer.get();
/*  676 */       if (sGL instanceof VBORenderer) {
/*      */         
/*  678 */         VBORenderer vBORenderer = (VBORenderer)sGL;
/*  679 */         vBORenderer.disableVBOs();
/*      */       }
/*      */       else {
/*      */         
/*  683 */         l.d("Failed to disable VBOs, wrong class");
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  688 */     e.p();
/*      */     
/*  690 */     this.j = new t(str4);
/*  691 */     this.j.b = this;
/*  692 */     this.j.i = bool1;
/*  693 */     this.j.j = bool2;
/*  694 */     this.j.k = bool3;
/*      */ 
/*      */ 
/*      */     
/*  698 */     DisplayMode displayMode = Display.getDisplayMode();
/*      */ 
/*      */     
/*  701 */     float f1 = displayMode.getHeight();
/*  702 */     float f2 = displayMode.getWidth();
/*      */     
/*  704 */     l.d("screenHeight:" + f1);
/*  705 */     l.d("screenWidth:" + f2);
/*      */     
/*  707 */     int j = 1000;
/*  708 */     int k = 733;
/*      */     
/*  710 */     if (f1 > 800.0F) {
/*      */       
/*  712 */       j = 1000;
/*  713 */       k = 800;
/*      */     } 
/*      */     
/*  716 */     if (f1 > 900.0F) {
/*      */       
/*  718 */       j = 1600;
/*  719 */       k = 900;
/*      */     } 
/*      */ 
/*      */     
/*  723 */     if (bool1) {
/*      */       
/*  725 */       j = 10;
/*  726 */       k = 10;
/*      */     } 
/*      */ 
/*      */     
/*  730 */     if (integer1 != null) {
/*      */       
/*  732 */       l.d("Overriding width to:" + integer1);
/*  733 */       j = integer1.intValue();
/*      */     } 
/*      */     
/*  736 */     if (integer2 != null) {
/*      */       
/*  738 */       l.d("Overriding height to:" + integer2);
/*  739 */       k = integer2.intValue();
/*      */     } 
/*      */     
/*  742 */     if (bool5) {
/*      */       
/*  744 */       l.d("allowSoftwareOpenGL is now on");
/*  745 */       System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  762 */     this.j.l = false;
/*      */     
/*  764 */     boolean bool9 = bool6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  771 */       if (this.j.l)
/*      */       {
/*  773 */         this.j.a(j * 2, k * 2);
/*  774 */         this.k = new b((Game)new ScalableGame((Game)this.j, j, k), j, k, bool9);
/*      */       }
/*      */       else
/*      */       {
/*  778 */         this.k = new b((Game)this.j, j, k, bool9);
/*      */       }
/*      */     
/*  781 */     } catch (SlickException slickException) {
/*      */       
/*  783 */       throw new RuntimeException(slickException);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  802 */     this.j.c = this.k;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  822 */     Display.setResizable(true);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  830 */     i i = new i(this);
/*  831 */     this.r = new Thread(i);
/*  832 */     this.r.setDaemon(false);
/*      */ 
/*      */     
/*  835 */     this.r.start();
/*      */   }
/*      */ 
/*      */   
/*  839 */   long o = System.nanoTime();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   a p;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(String paramString) {
/* 1035 */     this.q.a(paramString, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1044 */   n q = new h(this);
/*      */   
/*      */   Thread r;
/*      */   
/*      */   boolean s;
/*      */   
/*      */   public synchronized void h() {
/* 1051 */     b("displayModes");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1076 */     b("starting controllers");
/*      */ 
/*      */     
/* 1079 */     this.o = System.nanoTime();
/*      */ 
/*      */     
/* 1082 */     l.aF = true;
/*      */     
/* 1084 */     l.aL = true;
/*      */     
/* 1086 */     if (!l.av) {
/*      */       
/* 1088 */       l.aH = true;
/* 1089 */       l.aG = true;
/*      */       
/* 1091 */       l.aQ = e.class;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1099 */     if (this.j != null && !this.j.j) {
/*      */ 
/*      */       
/* 1102 */       byte b1 = 20;
/* 1103 */       OpenALAudio openALAudio = new OpenALAudio(b1, 9, 512);
/*      */ 
/*      */       
/* 1106 */       l.d("openALAudio hasDevice:" + openALAudio.hasDevice());
/*      */ 
/*      */       
/* 1109 */       e.c = new n(openALAudio);
/*      */       
/* 1111 */       if (this.j.k)
/*      */       {
/* 1113 */         l.d("Music disabled");
/*      */ 
/*      */         
/* 1116 */         am.a = (aq)new av();
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */         
/* 1125 */         am.a = new k(openALAudio);
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1133 */       l.b("Disabling sound with NullSoundFactory");
/* 1134 */       e.c = (h)new f();
/*      */       
/* 1136 */       am.a = (aq)new av();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1142 */     n.b = new j();
/*      */     
/* 1144 */     ac.b = new u();
/*      */ 
/*      */     
/* 1147 */     long l1 = bj.a();
/*      */ 
/*      */     
/* 1150 */     b("loading libRocket");
/*      */     
/* 1152 */     l.d("start libRocket setup");
/*      */     
/* 1154 */     this.d = new d();
/*      */     
/* 1156 */     this.i = a.o();
/* 1157 */     this.i.e = this;
/*      */     
/* 1159 */     this.p = new a();
/*      */     
/* 1161 */     this.i.a((b)this.p, this.d);
/* 1162 */     this.p.debug = false;
/*      */     
/* 1164 */     this.p.setup();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1172 */     b("libRocket - fonts");
/*      */ 
/*      */     
/* 1175 */     this.p.loadFont("font/Delicious-Roman.otf");
/* 1176 */     this.p.loadFont("font/Delicious-Italic.otf");
/* 1177 */     this.p.loadFont("font/Delicious-Bold.otf");
/* 1178 */     this.p.loadFont("font/Delicious-BoldItalic.otf");
/*      */     
/* 1180 */     this.p.loadFont("font/Roboto-Regular.ttf");
/* 1181 */     this.p.loadFont("font/Roboto-Bold.ttf");
/*      */     
/* 1183 */     l.d("NotoSansCJKsc start");
/*      */ 
/*      */     
/* 1186 */     this.p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
/*      */ 
/*      */ 
/*      */     
/* 1190 */     this.p.loadFont("font/DroidSansFallback.ttf", "fallback");
/*      */     
/* 1192 */     l.d("NotoSansCJKsc end");
/*      */ 
/*      */ 
/*      */     
/* 1196 */     this.i.c();
/*      */     
/* 1198 */     l.d("end libRocket setup");
/*      */ 
/*      */     
/* 1201 */     b("GuiEngine");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1209 */     bj.a("libRocket setup took:", l1);
/*      */ 
/*      */     
/* 1212 */     l.dg = this.e;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1217 */     ServerContext serverContext = new ServerContext();
/*      */ 
/*      */     
/* 1220 */     b("GameEngine");
/*      */ 
/*      */ 
/*      */     
/* 1224 */     int i = this.j.a.getWidth();
/* 1225 */     int j = this.j.a.getHeight();
/*      */     
/* 1227 */     l.bR = new Point(i, j);
/*      */ 
/*      */     
/* 1230 */     l l = l.a((Context)serverContext, this.q);
/*      */ 
/*      */     
/* 1233 */     b("GameEngine ready");
/*      */ 
/*      */ 
/*      */     
/* 1237 */     l.d("version: " + l.n() + " " + l.c(false) + ":" + this.e);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1244 */     this.i.b();
/*      */ 
/*      */     
/* 1247 */     a.b();
/*      */ 
/*      */     
/* 1250 */     this.h = l.bF;
/*      */ 
/*      */ 
/*      */     
/* 1254 */     l.by.showZoomButton = false;
/* 1255 */     l.by.showUnitGroups = false;
/*      */ 
/*      */ 
/*      */     
/* 1259 */     this.j.a(this.d);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1267 */     this.j.a(1000, 800);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1272 */     long l2 = System.nanoTime();
/*      */     
/* 1274 */     l.d("-----------------------------");
/* 1275 */     l.d("----- Game init finished in:" + ((l2 - this.o) / 1000000.0D) + " ms");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1280 */     l.bF.c = this;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1287 */     l.bF.w = "unset";
/*      */     
/* 1289 */     if (!l.as);
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
/*      */   Object t;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean u;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int v;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/* 1412 */     Main$3 main$3 = new Main$3(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1459 */     this.f.a(main$3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/* 1465 */     this.f.a();
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
/*      */   public void a(boolean paramBoolean) {
/* 1504 */     this.g = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1509 */     l l = l.u();
/*      */ 
/*      */     
/* 1512 */     if (!paramBoolean) {
/*      */       
/* 1514 */       l.bF.q();
/*      */     }
/*      */     else {
/*      */       
/* 1518 */       l.bF.b("shutdownServer");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*      */       try {
/* 1529 */         Thread.sleep(100L);
/*      */       }
/* 1531 */       catch (InterruptedException interruptedException) {
/*      */         
/* 1533 */         interruptedException.printStackTrace();
/*      */       } 
/*      */ 
/*      */       
/* 1537 */       System.exit(0);
/*      */ 
/*      */     
/*      */     }
/* 1541 */     catch (SecurityException securityException) {
/*      */       
/* 1543 */       securityException.printStackTrace();
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
/*      */   public synchronized boolean a(c paramc, String paramString1, String paramString2) {
/* 1563 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void b(c paramc, String paramString1, String paramString2) {
/* 1569 */     a(paramc, paramString1, paramString2, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/* 1576 */     l l = l.u();
/*      */     
/* 1578 */     if (!l.bF.bf) {
/*      */ 
/*      */       
/* 1581 */       ScriptEngine scriptEngine = ScriptEngine.getInstance();
/* 1582 */       if (scriptEngine != null)
/*      */       {
/* 1584 */         scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
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
/*      */   public synchronized void a(int paramInt, String paramString1, String paramString2, c paramc) {
/* 1607 */     if (this.p != null && this.p.c != null) {
/*      */ 
/*      */ 
/*      */       
/* 1611 */       this.p.c.addRunnableToQueue(new Main$4(this, paramInt, paramString1, paramString2, paramc));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1623 */       l.M();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   Main() {
/* 1629 */     this.s = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1721 */     this.t = new Object();
/*      */   }
/*      */ 
/*      */   
/*      */   public synchronized void a(c paramc, String paramString1, String paramString2, boolean paramBoolean) {
/*      */     if (!paramBoolean) {
/*      */       a(paramString1 + ": " + paramString2);
/*      */     }
/*      */     if (this.s) {
/*      */       return;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public String a(c paramc, String paramString) {
/*      */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public synchronized void c(c paramc, String paramString1, String paramString2) {}
/*      */   
/*      */   public synchronized void b(c paramc, String paramString) {}
/*      */   
/*      */   public void i() {
/* 1745 */     l l = l.u();
/*      */     
/* 1747 */     this.j.g();
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
/*      */   public void d() {
/* 1785 */     a.a().n();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ae paramae) {
/* 1791 */     a.a().a(paramae);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
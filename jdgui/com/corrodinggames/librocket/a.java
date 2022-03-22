/*     */ package com.corrodinggames.librocket;
/*     */ 
/*     */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*     */ import com.corrodinggames.rts.a.d;
/*     */ import com.corrodinggames.rts.a.g;
/*     */ import com.corrodinggames.rts.gameFramework.g.ae;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
/*     */ import java.awt.Desktop;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class a
/*     */ {
/*     */   protected static a a;
/*     */   public b b;
/*     */   public d c;
/*     */   
/*     */   public static a a() {
/*  37 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(b paramb, d paramd) {
/*  45 */     this.b = paramb;
/*  46 */     this.c = paramd;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  52 */     l l = l.u();
/*     */ 
/*     */     
/*  55 */     if (l != null) {
/*     */       
/*  57 */       l.a(null, this.c, true);
/*     */     }
/*     */     else {
/*     */       
/*  61 */       l.d("showMainMenu: game is null");
/*     */     } 
/*     */     
/*  64 */     this.b.setDocument("mainMenu.rml");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  79 */     this.b.setDocument("settings.rml");
/*     */   }
/*     */ 
/*     */   
/*     */   boolean d = true;
/*     */   
/*     */   public synchronized void a(boolean paramBoolean) {
/*  86 */     this.d = paramBoolean;
/*  87 */     e();
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void e() {
/*  92 */     l l = l.u();
/*  93 */     if (l == null) {
/*     */       
/*  95 */       l.b("Main::resumeGame(): game==null");
/*     */       return;
/*     */     } 
/*  98 */     l.bm = true;
/*  99 */     l.a(null, this.c, this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void b(boolean paramBoolean) {
/* 108 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 112 */     if (!paramBoolean) {
/*     */       
/* 114 */       l.d("endGame: queDisconnectAndWait");
/* 115 */       l.bF.q();
/*     */     }
/*     */     else {
/*     */       
/* 119 */       l.d("endGame: network disconnect");
/* 120 */       l.bF.b("shutdownServer");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void a(String paramString) {
/* 127 */     b(true);
/*     */ 
/*     */     
/* 130 */     l l = l.u();
/*     */     
/* 132 */     this.d = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     String str = paramString;
/* 144 */     boolean bool1 = false;
/* 145 */     byte b1 = 8;
/* 146 */     boolean bool2 = false;
/* 147 */     boolean bool3 = true;
/*     */     
/* 149 */     boolean bool4 = false;
/*     */     
/* 151 */     g.a(str, bool1, b1, bool2, bool3, bool4);
/*     */     
/* 153 */     e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(boolean paramBoolean) {
/* 158 */     this.d = paramBoolean;
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract void f();
/*     */ 
/*     */   
/*     */   public abstract void g();
/*     */ 
/*     */   
/*     */   public abstract int h();
/*     */ 
/*     */   
/*     */   public abstract void d(boolean paramBoolean);
/*     */   
/*     */   public boolean i() {
/* 174 */     if (this.b != null && !this.b.b())
/*     */     {
/* 176 */       return true;
/*     */     }
/* 178 */     return false;
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
/*     */   public void a(int paramInt, char paramChar) {
/* 195 */     int i = SlickToAndroidKeycodes.b(paramInt);
/*     */ 
/*     */     
/* 198 */     if (i()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 225 */       Integer integer = SlickToAndroidKeycodes.c(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 230 */       Object object = this.b.b("event_onkeydown");
/* 231 */       if (object != null) {
/*     */         
/* 233 */         ScriptEngine.getInstance().addScriptToQueue(object + "(" + i + ");");
/* 234 */         if (this.b.c() != null) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 240 */       if (paramChar > 'ÿ')
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 245 */         ScriptEngine.getInstance().addRunnableToQueue(new a$1(this));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 255 */       if (paramInt == 30)
/*     */       {
/* 257 */         if (h() == 1) {
/*     */           
/* 259 */           this.b.processKeyDown(93, 0);
/* 260 */           this.b.processKeyUp(93, 0);
/*     */           
/* 262 */           this.b.processKeyDown(91, 2);
/* 263 */           this.b.processKeyUp(91, 2);
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 269 */       if (paramInt == 46)
/*     */       {
/* 271 */         if (h() == 1) {
/*     */           
/* 273 */           this.b.processKeyDown(14, 1);
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 279 */       if (paramInt == 47)
/*     */       {
/* 281 */         if (h() == 1) {
/*     */           
/* 283 */           this.b.processKeyDown(33, 1);
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 290 */       if (integer != null) {
/*     */         
/* 292 */         this.b.processKeyDown(integer.intValue(), h());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 317 */       else if (paramChar != '\000') {
/*     */ 
/*     */ 
/*     */         
/* 321 */         if (Character.isISOControl(paramChar)) {
/*     */ 
/*     */ 
/*     */           
/* 325 */           if (paramChar == '\b')
/*     */           {
/* 327 */             l.d("backspace char pressed");
/*     */ 
/*     */             
/* 330 */             this.b.processKeyDown(69, 0);
/* 331 */             this.b.processKeyUp(69, 0);
/*     */           
/*     */           }
/*     */           else
/*     */           {
/*     */             
/* 337 */             l.d("keyPressed skipping isISOControl:" + paramInt + " c:" + paramChar + " c_print:" + paramChar);
/*     */ 
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */ 
/*     */           
/* 350 */           this.b.processTextInputChar(paramChar);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 358 */       if (paramInt == 28 || paramInt == 156) {
/*     */         
/* 360 */         ScriptEngine.getInstance().addScriptToQueue("onEnter();");
/*     */       }
/* 362 */       else if (paramChar == '\r') {
/*     */         
/* 364 */         l.d("keyPressed: new line entered");
/* 365 */         ScriptEngine.getInstance().addScriptToQueue("onEnter();");
/*     */       } 
/*     */       
/* 368 */       if (paramInt == 1)
/*     */       {
/* 370 */         ScriptEngine.getInstance().addScriptToQueue("onEscape();");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 386 */     l l = l.u();
/*     */     
/* 388 */     if (l != null) {
/*     */       
/* 390 */       l.b(i, true);
/*     */       
/* 392 */       if (paramInt == 1);
/*     */       return;
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
/*     */   public LinkedList j() {
/* 410 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(String paramString) {
/*     */     try {
/* 420 */       if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
/*     */         
/*     */         try
/*     */         {
/* 424 */           l.d("Opening link from desktop api");
/* 425 */           Desktop.getDesktop().browse(new URI(paramString));
/* 426 */           return true;
/*     */         }
/* 428 */         catch (IOException iOException)
/*     */         {
/* 430 */           iOException.printStackTrace();
/*     */         }
/* 432 */         catch (URISyntaxException uRISyntaxException)
/*     */         {
/* 434 */           uRISyntaxException.printStackTrace();
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 439 */         String str = System.getProperty("os.name").toLowerCase();
/* 440 */         String[] arrayOfString = null;
/*     */         
/* 442 */         if (str.contains("win"))
/*     */         {
/* 444 */           arrayOfString = new String[] { "rundll32", "url.dll,FileProtocolHandler", paramString };
/*     */         }
/* 446 */         if (str.contains("mac"))
/*     */         {
/* 448 */           arrayOfString = new String[] { "open", paramString };
/*     */         }
/* 450 */         if (str.contains("nix") || str.contains("nux"))
/*     */         {
/* 452 */           arrayOfString = new String[] { "xdg-open", paramString };
/*     */         }
/*     */         
/* 455 */         if (arrayOfString != null)
/*     */         {
/* 457 */           Runtime runtime = Runtime.getRuntime();
/*     */           
/*     */           try {
/* 460 */             runtime.exec(arrayOfString);
/* 461 */             return true;
/*     */           }
/* 463 */           catch (IOException iOException) {
/*     */             
/* 465 */             iOException.printStackTrace();
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       } 
/* 471 */     } catch (RuntimeException runtimeException) {
/*     */       
/* 473 */       runtimeException.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/* 477 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void l() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void m() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 503 */     l l = l.u();
/* 504 */     if (!l.bF.bf) {
/*     */       
/* 506 */       ScriptEngine scriptEngine = ScriptEngine.getInstance();
/* 507 */       if (scriptEngine != null)
/*     */       {
/* 509 */         scriptEngine.addScriptToQueue("mp.closeBattleroomIfOpen()");
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ae paramae) {
/* 519 */     l l = l.u();
/*     */     
/* 521 */     ScriptEngine scriptEngine = ScriptEngine.getInstance();
/* 522 */     if (scriptEngine != null) {
/*     */ 
/*     */ 
/*     */       
/* 526 */       a$2 a$2 = new a$2(this, scriptEngine, paramae);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 614 */       scriptEngine.addRunnableToQueue(a$2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
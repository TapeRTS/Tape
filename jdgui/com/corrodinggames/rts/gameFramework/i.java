/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.gameFramework.g.n;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */   implements Thread.UncaughtExceptionHandler
/*     */ {
/*     */   private Thread.UncaughtExceptionHandler a;
/*     */   
/*     */   i(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {
/*  14 */     this.a = paramUncaughtExceptionHandler;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void uncaughtException(Thread paramThread, Throwable paramThrowable) {
/*  21 */     boolean bool1 = false;
/*     */     
/*  23 */     boolean bool2 = false;
/*     */     
/*  25 */     l l = null;
/*     */ 
/*     */     
/*     */     try {
/*  29 */       l.dx = null;
/*  30 */       l.dw = null;
/*  31 */       System.gc();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*  37 */         l.d("uncaughtException start");
/*     */         
/*  39 */         l = l.u();
/*     */         
/*  41 */         if (l != null && paramThrowable instanceof OutOfMemoryError) {
/*     */           
/*  43 */           l.d("Freeing memory");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           try {
/*  52 */             b.ad = null;
/*  53 */             if (l.bt != null)
/*     */             {
/*  55 */               l.bt = null;
/*     */             }
/*     */ 
/*     */             
/*  59 */             if (l.bv != null) {
/*     */               
/*  61 */               l.bv.i();
/*  62 */               l.bv = null;
/*     */             } 
/*     */             
/*  65 */             System.gc();
/*     */             
/*  67 */             l.d("uncaughtException: Memory freed");
/*     */           }
/*  69 */           catch (Throwable throwable) {
/*  70 */             l.d("exception freeing memory");
/*  71 */             throwable.printStackTrace();
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  78 */         l.a("gameEngine:uncaughtExceptionHandler", paramThrowable);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  83 */         String str = l.a(paramThrowable);
/*     */         
/*  85 */         boolean bool = false;
/*     */         
/*  87 */         boolean bool3 = false;
/*     */         
/*  89 */         if (l != null) {
/*     */           
/*  91 */           SettingsEngine settingsEngine = l.by;
/*  92 */           if (settingsEngine != null)
/*     */           {
/*  94 */             bool = settingsEngine.sendReports;
/*     */           }
/*     */           else
/*     */           {
/*  98 */             l.d("CustomExceptionHandler: no settings");
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 103 */           l.d("CustomExceptionHandler: no game");
/*     */         } 
/*     */         
/* 106 */         if (l.dv) {
/*     */           
/* 108 */           l.d("CustomExceptionHandler: a crash was already sent");
/* 109 */           bool = false;
/* 110 */           bool3 = true;
/*     */         } 
/* 112 */         l.dv = true;
/*     */         
/* 114 */         if (bool) {
/*     */           
/*     */           try {
/*     */ 
/*     */             
/* 119 */             l.d("Starting errorReport");
/*     */             
/* 121 */             n.a("uncaughtException", str);
/*     */             
/* 123 */             l.d("waiting");
/* 124 */             Thread.sleep(800L);
/* 125 */           } catch (InterruptedException interruptedException) {
/* 126 */             interruptedException.printStackTrace();
/*     */           } 
/*     */         }
/*     */         
/* 130 */         if (!bool3)
/*     */         {
/* 132 */           if (l != null)
/*     */           {
/* 134 */             if (l.do != null)
/*     */             {
/* 136 */               l.do.a(paramThrowable);
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 144 */         bool2 = true;
/*     */ 
/*     */         
/* 147 */         l.e("fatal", str);
/*     */       
/*     */       }
/* 150 */       catch (Exception exception) {
/* 151 */         l.d("exception sending crash");
/* 152 */         exception.printStackTrace();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 189 */       if (l != null)
/*     */       {
/* 191 */         if (l.do != null)
/*     */         {
/* 193 */           if (l.do.a()) {
/*     */             
/* 195 */             l.d("gameCrashesDontExit=true");
/*     */             
/* 197 */             bool1 = true;
/*     */             
/*     */             return;
/*     */           } 
/*     */         }
/*     */       }
/*     */       
/* 204 */       if (!l.at)
/*     */       {
/* 206 */         if (this.a != null) {
/*     */           
/* 208 */           l.d("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
/* 209 */           this.a.uncaughtException(paramThread, paramThrowable);
/* 210 */           l.d("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
/*     */         }
/*     */         else {
/*     */           
/* 214 */           l.d("CustomExceptionHandler: defaultUEH==null");
/* 215 */           System.exit(2);
/*     */         } 
/*     */       }
/*     */       
/* 219 */       l.aq = paramThrowable;
/*     */       
/* 221 */       bool1 = true;
/*     */     }
/* 223 */     catch (Throwable throwable) {
/* 224 */       l.d("Exception in uncaughtException");
/* 225 */       throwable.printStackTrace();
/*     */     }
/*     */     finally {
/*     */       
/* 229 */       if (!bool1) {
/*     */         
/* 231 */         l.d("Crash was not handled, exiting");
/* 232 */         Runtime.getRuntime().halt(1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.b;
/*     */ 
/*     */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements Runnable
/*     */ {
/*     */   public ServerSocket a;
/*     */   public boolean b = true;
/*     */   public static boolean c = false;
/*  43 */   static ArrayList d = new ArrayList();
/*     */ 
/*     */   
/*     */   public static strictfp boolean a() {
/*  47 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(String paramString) {
/*  53 */     c = true;
/*     */     
/*  55 */     d.add(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  61 */     if (d.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  66 */     a$1 a$1 = new a$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     Thread thread = new Thread(a$1);
/* 114 */     thread.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(int paramInt, String paramString) {
/*     */     try {
/* 123 */       c = true;
/* 124 */       l.aE = true;
/*     */       
/* 126 */       l.d("");
/* 127 */       l.d("----- createDebugSocket ----");
/* 128 */       l.d("port: " + paramInt);
/* 129 */       l.d("password: " + paramString);
/* 130 */       l.d("------------------");
/* 131 */       l.d("");
/*     */       
/* 133 */       a a1 = new a();
/*     */       
/* 135 */       if (paramInt != -1)
/*     */       {
/* 137 */         a1.a = new ServerSocket(paramInt);
/*     */         
/* 139 */         Thread thread = new Thread(a1);
/* 140 */         thread.start();
/*     */       }
/*     */     
/*     */     }
/* 144 */     catch (IOException iOException) {
/*     */       
/* 146 */       throw new RuntimeException(iOException);
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
/*     */   public strictfp void run() {
/*     */     try {
/* 163 */       while (this.b)
/*     */       {
/* 165 */         Socket socket = this.a.accept();
/*     */ 
/*     */         
/*     */         try {
/* 169 */           socket.setTcpNoDelay(true);
/* 170 */           b b = new b(this, socket);
/* 171 */           Thread thread = new Thread(b);
/* 172 */           thread.run();
/*     */         }
/* 174 */         catch (IOException iOException) {
/*     */           
/* 176 */           l.d("Got IOException on debugSocket connection");
/* 177 */           iOException.printStackTrace();
/*     */           
/* 179 */           throw new RuntimeException(iOException);
/*     */         }
/*     */       
/*     */       }
/*     */     
/* 184 */     } catch (IOException iOException) {
/*     */       
/* 186 */       throw new RuntimeException(iOException);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp String b(String paramString) {
/* 262 */     String str2 = null;
/* 263 */     String[] arrayOfString = null;
/*     */     
/* 265 */     int i = paramString.indexOf(" ");
/* 266 */     if (i == -1)
/*     */     {
/* 268 */       i = paramString.length();
/*     */     }
/* 270 */     String str1 = paramString.substring(0, i).toLowerCase(Locale.ENGLISH);
/*     */     
/* 272 */     if (i != -1 && paramString.length() >= i + 1) {
/*     */       
/* 274 */       str2 = paramString.substring(i + 1);
/* 275 */       arrayOfString = str2.split(" ");
/*     */     } 
/*     */     
/* 278 */     if (ScriptEngine.getInstance() == null) {
/*     */       
/* 280 */       l.b("DebugSocketConnection: waiting for ScriptEngine to start....");
/*     */       
/* 282 */       for (byte b = 0; b < 100; b++) {
/*     */         
/* 284 */         if (ScriptEngine.getInstance() != null) {
/*     */           
/* 286 */           l.b("started");
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/*     */         try {
/* 292 */           Thread.sleep(100L);
/*     */         }
/* 294 */         catch (InterruptedException interruptedException) {
/*     */           
/* 296 */           interruptedException.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 303 */     if (str1.equalsIgnoreCase("ping"))
/*     */     {
/* 305 */       return "pong";
/*     */     }
/*     */ 
/*     */     
/* 309 */     if (str1.equalsIgnoreCase("script")) {
/*     */       
/* 311 */       if (str2 == null)
/*     */       {
/* 313 */         return "argString==null";
/*     */       }
/*     */       
/* 316 */       ScriptEngine scriptEngine = ScriptEngine.getInstance();
/* 317 */       ScriptEngine.Action action = scriptEngine.addScriptToQueue(str2);
/*     */       
/* 319 */       boolean bool = false;
/*     */ 
/*     */       
/* 322 */       String str = action.waitForCompletionOrCrash(bool);
/* 323 */       if (str == null)
/*     */       {
/* 325 */         return "done";
/*     */       }
/*     */ 
/*     */       
/* 329 */       return str;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 334 */     if (str1.equalsIgnoreCase("function") || str1.equalsIgnoreCase("functionNoTimeout")) {
/*     */       
/* 336 */       if (str2 == null)
/*     */       {
/* 338 */         return "argString==null";
/*     */       }
/*     */       
/* 341 */       ScriptEngine scriptEngine = ScriptEngine.getInstance();
/*     */       
/* 343 */       String str3 = str2;
/* 344 */       a$2 a$2 = new a$2(scriptEngine, str3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 353 */       ScriptEngine.Action action = scriptEngine.addRunnableToQueue(a$2);
/* 354 */       action.tryToCatchCrash = true;
/*     */       
/* 356 */       boolean bool = false;
/*     */       
/* 358 */       if (str1.equalsIgnoreCase("functionNoTimeout"))
/*     */       {
/* 360 */         bool = true;
/*     */       }
/*     */       
/* 363 */       String str4 = action.waitForCompletionOrCrash(bool);
/* 364 */       if (str4 == null) {
/*     */         
/* 366 */         String str = "ok\n";
/*     */         
/* 368 */         if (a$2.c == null) {
/*     */           
/* 370 */           str = str + "<NULL>";
/*     */         }
/*     */         else {
/*     */           
/* 374 */           str = str + "" + a$2.c;
/*     */         } 
/*     */         
/* 377 */         str = str + "\000";
/*     */         
/* 379 */         return str;
/*     */       } 
/*     */ 
/*     */       
/* 383 */       String str5 = "crash\n";
/*     */       
/* 385 */       str5 = str5 + str4;
/*     */       
/* 387 */       str5 = str5 + "\000";
/*     */       
/* 389 */       return str5;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 394 */     return "unknown command";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
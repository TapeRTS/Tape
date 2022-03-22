/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import android.os.Debug;
/*     */ import android.os.Handler;
/*     */ import android.os.Looper;
/*     */ import android.util.Log;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends Thread
/*     */ {
/*  47 */   private static final e a = new d$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   private static final f b = new d$2();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   private e c = a;
/*  60 */   private f d = b;
/*     */   
/*  62 */   private final Handler e = new Handler(Looper.b());
/*     */   
/*     */   private final int f;
/*  65 */   private String g = "";
/*     */   
/*     */   private boolean h = false;
/*     */   private boolean i = false;
/*  69 */   private volatile int j = 0;
/*     */   
/*  71 */   private final Runnable k = new d$3(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d() {
/*  81 */     this(5000);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d(int paramInt) {
/*  92 */     this.f = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d a(e parame) {
/* 103 */     if (parame == null) {
/* 104 */       this.c = a;
/*     */     } else {
/*     */       
/* 107 */       this.c = parame;
/*     */     } 
/* 109 */     return this;
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
/*     */   public void run() {
/* 183 */     setName("|ANR-WatchDog|");
/*     */ 
/*     */     
/* 186 */     int i = -1;
/* 187 */     while (!isInterrupted()) {
/* 188 */       int j = this.j;
/* 189 */       this.e.a(this.k);
/*     */       try {
/* 191 */         Thread.sleep(this.f);
/*     */       }
/* 193 */       catch (InterruptedException interruptedException) {
/* 194 */         this.d.a(interruptedException);
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 199 */       if (this.j == j) {
/* 200 */         a a; if (!this.i && Debug.isDebuggerConnected()) {
/* 201 */           if (this.j != i)
/* 202 */             Log.c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))"); 
/* 203 */           i = this.j;
/*     */           
/*     */           continue;
/*     */         } 
/*     */         
/* 208 */         if (this.g != null) {
/* 209 */           a = a.a(this.g, this.h);
/*     */         } else {
/* 211 */           a = a.a();
/* 212 */         }  this.c.a(a);
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
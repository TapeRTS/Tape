/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import android.os.Process;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class z
/*     */   extends Thread
/*     */ {
/*     */   public boolean a = true;
/*     */   long b;
/*     */   
/*     */   public synchronized strictfp void a(boolean paramBoolean) {
/*  17 */     this.a = paramBoolean;
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
/*     */   public strictfp void run() {
/*  29 */     l.ag();
/*     */     
/*  31 */     if (!l.aF)
/*     */     {
/*  33 */       Process.setThreadPriority(-4);
/*     */     }
/*     */     
/*  36 */     float f = 1.0F;
/*     */     
/*  38 */     a();
/*     */     
/*  40 */     long l = this.b;
/*     */ 
/*     */     
/*  43 */     l l1 = l.u();
/*     */     
/*  45 */     label35: while (this.a) {
/*     */       
/*  47 */       long l3, l2 = System.nanoTime();
/*     */       
/*  49 */       l = this.b;
/*  50 */       a();
/*     */       
/*  52 */       f = (float)(this.b - l) * 0.060000002F;
/*     */       
/*  54 */       int i = (int)(this.b - l);
/*  55 */       l1.a(f, i);
/*     */       
/*  57 */       if (!l1.by.batterySaving);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  62 */       if (l1.by.batterySaving) {
/*     */         
/*  64 */         l3 = 32258064L;
/*     */ 
/*     */       
/*     */       }
/*  68 */       else if (l1.by.highRefreshRate) {
/*     */         
/*  70 */         l3 = 3333333L;
/*     */       }
/*     */       else {
/*     */         
/*  74 */         l3 = 16393442L;
/*     */       } 
/*     */ 
/*     */       
/*  78 */       long l4 = Math.round((float)(l3 - System.nanoTime() - l2));
/*  79 */       if (l4 > 0L) {
/*     */ 
/*     */ 
/*     */         
/*  83 */         long l5 = System.nanoTime();
/*     */         
/*     */         while (true) {
/*  86 */           long l6 = System.nanoTime() - l5;
/*  87 */           if (l6 <= l4) { if (l6 < 0L) {
/*     */               continue label35;
/*     */             }
/*     */ 
/*     */             
/*  92 */             long l7 = (long)((l4 - l6) / 1000000.0D);
/*     */             
/*  94 */             if (l7 > 1L) {
/*     */ 
/*     */               
/*     */               try {
/*  98 */                 Thread.sleep(l7);
/*     */               }
/* 100 */               catch (Exception exception) {}
/*     */               continue;
/*     */             } 
/*     */             continue label35; }
/*     */           
/*     */           continue label35;
/*     */         } 
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
/*     */   public strictfp void a() {
/* 119 */     this.b = System.currentTimeMillis();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
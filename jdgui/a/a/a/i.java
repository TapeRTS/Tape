/*     */ package a.a.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class i
/*     */   implements Runnable
/*     */ {
/*     */   boolean a;
/*     */   String b;
/*     */   private Runnable c;
/*     */   private long d;
/*     */   private long e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   private Object j;
/*     */   
/*     */   public i(String paramString, Runnable paramRunnable) {
/* 196 */     this.j = new Object();
/*     */     this.b = paramString;
/*     */     this.c = paramRunnable;
/*     */     this.d = 0L;
/*     */     this.e = 0L;
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     this.a = true;
/*     */     Thread thread = new Thread(this, this.b);
/*     */     thread.setDaemon(true);
/*     */     thread.start();
/*     */   }
/*     */   
/*     */   public void run() {
/*     */     label56: while (!this.i) {
/*     */       synchronized (this) {
/*     */         while (!this.g && !this.i) {
/*     */           try {
/*     */             wait();
/*     */           } catch (InterruptedException interruptedException) {
/*     */             interruptedException.printStackTrace();
/*     */           } 
/*     */         } 
/*     */         if (this.i)
/*     */           break; 
/*     */       } 
/*     */       synchronized (this.j) {
/*     */         this.h = false;
/*     */         this.f = false;
/*     */         if (this.d > 0L)
/*     */           try {
/*     */             this.j.wait(this.d);
/*     */           } catch (InterruptedException interruptedException) {
/*     */             interruptedException.printStackTrace();
/*     */           }  
/*     */         if (this.f)
/*     */           continue; 
/*     */       } 
/*     */       if (!this.h)
/*     */         this.c.run(); 
/*     */       if (this.e > 0L)
/*     */         while (true) {
/*     */           synchronized (this.j) {
/*     */             this.h = false;
/*     */             try {
/*     */               this.j.wait(this.e);
/*     */             } catch (InterruptedException interruptedException) {
/*     */               interruptedException.printStackTrace();
/*     */             } 
/*     */             if (this.f)
/*     */               continue label56; 
/*     */             if (this.h)
/*     */               continue; 
/*     */           } 
/*     */           this.c.run();
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void a(long paramLong) {
/*     */     a(paramLong, 0L);
/*     */   }
/*     */   
/*     */   public synchronized void a(long paramLong1, long paramLong2) {
/*     */     this.d = paramLong1;
/*     */     this.e = paramLong2;
/*     */     if (this.g)
/*     */       throw new IllegalStateException("already scheduled"); 
/*     */     this.g = true;
/*     */     notify();
/*     */     synchronized (this.j) {
/*     */       this.j.notify();
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized boolean b() {
/*     */     return this.g;
/*     */   }
/*     */   
/*     */   public synchronized boolean c() {
/*     */     return !b();
/*     */   }
/*     */   
/*     */   public synchronized void d() {
/*     */     synchronized (this.j) {
/*     */       this.h = true;
/*     */       this.j.notify();
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void e() {
/*     */     this.g = false;
/*     */     synchronized (this.j) {
/*     */       this.f = true;
/*     */       this.j.notify();
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void f() {
/*     */     e();
/*     */     this.i = true;
/*     */     notify();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
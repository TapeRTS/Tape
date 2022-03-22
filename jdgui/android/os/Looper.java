/*     */ package android.os;
/*     */ 
/*     */ import android.util.Printer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Looper
/*     */ {
/*  56 */   static final ThreadLocal a = new ThreadLocal();
/*     */ 
/*     */ 
/*     */   
/*     */   private static Looper d;
/*     */ 
/*     */ 
/*     */   
/*     */   final MessageQueue b;
/*     */ 
/*     */   
/*     */   final Thread c;
/*     */ 
/*     */   
/*     */   private Printer e;
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(boolean paramBoolean) {
/*  75 */     if (a.get() != null) {
/*  76 */       throw new RuntimeException("Only one Looper may be created per thread");
/*     */     }
/*  78 */     a.set(new Looper(paramBoolean));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a() {
/*  88 */     a(false);
/*  89 */     synchronized (Looper.class) {
/*  90 */       if (d != null) {
/*  91 */         throw new IllegalStateException("The main Looper has already been prepared.");
/*     */       }
/*  93 */       d = d();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Looper b() {
/* 100 */     synchronized (Looper.class) {
/* 101 */       return d;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void c() {
/* 110 */     Looper looper = d();
/* 111 */     if (looper == null) {
/* 112 */       throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
/*     */     }
/* 114 */     MessageQueue messageQueue = looper.b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 125 */       Message message = messageQueue.a();
/* 126 */       if (message == null) {
/*     */         return;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 132 */       Printer printer = looper.e;
/* 133 */       if (printer != null) {
/* 134 */         printer.println(">>>>> Dispatching to " + message.j + " " + message.k + ": " + message.a);
/*     */       }
/*     */ 
/*     */       
/* 138 */       message.j.b(message);
/*     */       
/* 140 */       if (printer != null) {
/* 141 */         printer.println("<<<<< Finished to " + message.j + " " + message.k);
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
/* 160 */       message.c();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Looper d() {
/* 169 */     return a.get();
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
/*     */   private Looper(boolean paramBoolean) {
/* 195 */     this.b = new MessageQueue(paramBoolean);
/* 196 */     this.c = Thread.currentThread();
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
/*     */   public Thread e() {
/* 289 */     return this.c;
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
/*     */   public String toString() {
/* 313 */     return "Looper (" + this.c.getName() + ", tid " + this.c.getId() + ") {" + 
/* 314 */       Integer.toHexString(System.identityHashCode(this)) + "}";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\os\Looper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
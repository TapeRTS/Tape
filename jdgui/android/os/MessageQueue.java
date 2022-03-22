/*     */ package android.os;
/*     */ 
/*     */ import android.util.Log;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class MessageQueue
/*     */ {
/*     */   private final boolean c;
/*     */   private long d;
/*     */   Message a;
/*  40 */   private final ArrayList e = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   private MessageQueue$IdleHandler[] f;
/*     */ 
/*     */   
/*     */   private boolean g;
/*     */ 
/*     */   
/*     */   private boolean h;
/*     */ 
/*     */   
/*  53 */   static Object b = new Object();
/*     */ 
/*     */   
/*     */   private long b() {
/*  57 */     return 100L;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(long paramLong) {}
/*     */ 
/*     */   
/*     */   private void a(long paramLong, int paramInt) {
/*  65 */     synchronized (b) {
/*     */ 
/*     */       
/*     */       try {
/*  69 */         b.wait(paramInt);
/*     */       }
/*  71 */       catch (InterruptedException interruptedException) {
/*     */         
/*  73 */         interruptedException.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(long paramLong) {
/*  79 */     synchronized (b) {
/*     */       
/*  81 */       b.notifyAll();
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
/*     */   MessageQueue(boolean paramBoolean) {
/* 137 */     this.c = paramBoolean;
/* 138 */     this.d = b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void finalize() {
/*     */     try {
/* 144 */       c();
/*     */     } finally {
/* 146 */       super.finalize();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void c() {
/* 153 */     if (this.d != 0L) {
/* 154 */       a(this.d);
/* 155 */       this.d = 0L;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Message a() {
/* 163 */     long l = this.d;
/* 164 */     if (l == 0L) {
/* 165 */       return null;
/*     */     }
/*     */     
/* 168 */     int i = -1;
/* 169 */     int j = 0;
/*     */     while (true) {
/* 171 */       if (j) {
/* 172 */         Binder.flushPendingCommands();
/*     */       }
/*     */ 
/*     */       
/* 176 */       System.out.println("corroding: nativePollOnce:" + l + "," + j);
/* 177 */       a(l, j);
/*     */       
/* 179 */       synchronized (this) {
/*     */         
/* 181 */         long l1 = SystemClock.a();
/* 182 */         Message message1 = null;
/* 183 */         Message message2 = this.a;
/* 184 */         if (message2 != null && message2.j == null) {
/*     */           
/*     */           do {
/* 187 */             message1 = message2;
/* 188 */             message2 = message2.l;
/* 189 */           } while (message2 != null && !message2.e());
/*     */         }
/* 191 */         if (message2 != null) {
/* 192 */           if (l1 < message2.h) {
/*     */             
/* 194 */             j = (int)Math.min(message2.h - l1, 2147483647L);
/*     */           } else {
/*     */             
/* 197 */             this.h = false;
/* 198 */             if (message1 != null) {
/* 199 */               message1.l = message2.l;
/*     */             } else {
/* 201 */               this.a = message2.l;
/*     */             } 
/* 203 */             message2.l = null;
/*     */             
/* 205 */             return message2;
/*     */           } 
/*     */         } else {
/*     */           
/* 209 */           j = -1;
/*     */         } 
/*     */ 
/*     */         
/* 213 */         if (this.g) {
/* 214 */           c();
/* 215 */           return null;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 221 */         if (i < 0 && (this.a == null || l1 < this.a.h))
/*     */         {
/* 223 */           i = this.e.size();
/*     */         }
/* 225 */         if (i <= 0) {
/*     */           
/* 227 */           this.h = true;
/*     */           
/*     */           continue;
/*     */         } 
/* 231 */         if (this.f == null) {
/* 232 */           this.f = new MessageQueue$IdleHandler[Math.max(i, 4)];
/*     */         }
/* 234 */         this.f = (MessageQueue$IdleHandler[])this.e.toArray((Object[])this.f);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 239 */       for (byte b = 0; b < i; b++) {
/* 240 */         MessageQueue$IdleHandler messageQueue$IdleHandler = this.f[b];
/* 241 */         this.f[b] = null;
/*     */         
/* 243 */         boolean bool = false;
/*     */         try {
/* 245 */           bool = messageQueue$IdleHandler.a();
/* 246 */         } catch (Throwable throwable) {
/* 247 */           Log.c("MessageQueue", "IdleHandler threw exception", throwable);
/*     */         } 
/*     */         
/* 250 */         if (!bool) {
/* 251 */           synchronized (this) {
/* 252 */             this.e.remove(messageQueue$IdleHandler);
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 258 */       i = 0;
/*     */ 
/*     */ 
/*     */       
/* 262 */       j = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean a(Message paramMessage, long paramLong) {
/* 350 */     if (paramMessage.j == null) {
/* 351 */       throw new IllegalArgumentException("Message must have a target.");
/*     */     }
/* 353 */     if (paramMessage.f()) {
/* 354 */       throw new IllegalStateException(paramMessage + " This message is already in use.");
/*     */     }
/*     */     
/* 357 */     synchronized (this) {
/* 358 */       if (this.g) {
/* 359 */         IllegalStateException illegalStateException = new IllegalStateException(paramMessage.j + " sending message to a Handler on a dead thread");
/*     */         
/* 361 */         Log.a("MessageQueue", illegalStateException.getMessage(), illegalStateException);
/* 362 */         paramMessage.b();
/* 363 */         return false;
/*     */       } 
/*     */       
/* 366 */       paramMessage.g();
/* 367 */       paramMessage.h = paramLong;
/* 368 */       Message message = this.a;
/*     */       
/* 370 */       if (message == null || paramLong == 0L || paramLong < message.h) {
/*     */         
/* 372 */         paramMessage.l = message;
/* 373 */         this.a = paramMessage;
/* 374 */         boolean bool = this.h;
/*     */       } else {
/*     */         Message message1;
/*     */ 
/*     */         
/* 379 */         boolean bool = (this.h && message.j == null && paramMessage.e()) ? true : false;
/*     */         
/*     */         while (true) {
/* 382 */           message1 = message;
/* 383 */           message = message.l;
/* 384 */           if (message == null || paramLong < message.h) {
/*     */             break;
/*     */           }
/* 387 */           if (bool && message.e()) {
/* 388 */             bool = false;
/*     */           }
/*     */         } 
/* 391 */         paramMessage.l = message;
/* 392 */         message1.l = paramMessage;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 397 */       b(this.d);
/*     */     } 
/*     */     
/* 400 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\os\MessageQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class l
/*     */   extends Reader
/*     */ {
/*     */   private Reader a;
/*     */   private char[] b;
/*     */   private int c;
/*     */   private int d;
/*  64 */   private int e = -1;
/*  65 */   private int f = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public l(Reader paramReader) {
/*  73 */     this(paramReader, 8192);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public l(Reader paramReader, int paramInt) {
/*  84 */     super(paramReader);
/*  85 */     if (paramInt <= 0) {
/*  86 */       throw new IllegalArgumentException("size <= 0");
/*     */     }
/*  88 */     this.a = paramReader;
/*  89 */     this.b = new char[paramInt];
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
/*     */   public void close() {
/* 101 */     synchronized (this.lock) {
/* 102 */       if (!c()) {
/* 103 */         this.a.close();
/* 104 */         this.b = null;
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
/*     */ 
/*     */   
/*     */   private int b() {
/* 119 */     if (this.e == -1 || this.c - this.e >= this.f) {
/*     */       
/* 121 */       int j = this.a.read(this.b, 0, this.b.length);
/* 122 */       if (j > 0) {
/* 123 */         this.e = -1;
/* 124 */         this.c = 0;
/* 125 */         this.d = j;
/*     */       } 
/* 127 */       return j;
/*     */     } 
/* 129 */     if (this.e == 0 && this.f > this.b.length) {
/*     */       
/* 131 */       int j = this.b.length * 2;
/* 132 */       if (j > this.f) {
/* 133 */         j = this.f;
/*     */       }
/* 135 */       char[] arrayOfChar = new char[j];
/* 136 */       System.arraycopy(this.b, 0, arrayOfChar, 0, this.b.length);
/* 137 */       this.b = arrayOfChar;
/* 138 */     } else if (this.e > 0) {
/*     */       
/* 140 */       System.arraycopy(this.b, this.e, this.b, 0, this.b.length - this.e);
/* 141 */       this.c -= this.e;
/* 142 */       this.d -= this.e;
/* 143 */       this.e = 0;
/*     */     } 
/*     */     
/* 146 */     int i = this.a.read(this.b, this.c, this.b.length - this.c);
/* 147 */     if (i != -1) {
/* 148 */       this.d += i;
/*     */     }
/* 150 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean c() {
/* 159 */     return (this.b == null);
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
/*     */   public void mark(int paramInt) {
/* 179 */     if (paramInt < 0) {
/* 180 */       throw new IllegalArgumentException();
/*     */     }
/* 182 */     synchronized (this.lock) {
/* 183 */       d();
/* 184 */       this.f = paramInt;
/* 185 */       this.e = this.c;
/*     */     } 
/*     */   }
/*     */   private void d() {
/* 189 */     if (c()) {
/* 190 */       throw new IOException("BufferedReader is closed");
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
/*     */   public boolean markSupported() {
/* 203 */     return true;
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
/*     */   public int read() {
/* 219 */     synchronized (this.lock) {
/* 220 */       d();
/*     */       
/* 222 */       if (this.c < this.d || b() != -1) {
/* 223 */         return this.b[this.c++];
/*     */       }
/* 225 */       return -1;
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
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3) {
/* 256 */     if ((paramInt2 | paramInt3) < 0 || paramInt2 > paramInt1 || paramInt1 - paramInt2 < paramInt3) {
/* 257 */       throw new IndexOutOfBoundsException();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
/* 263 */     synchronized (this.lock) {
/* 264 */       d();
/*     */       
/* 266 */       a(paramArrayOfchar.length, paramInt1, paramInt2);
/*     */       
/* 268 */       int i = paramInt2;
/* 269 */       while (i > 0) {
/*     */ 
/*     */ 
/*     */         
/* 273 */         int k = this.d - this.c;
/* 274 */         if (k > 0) {
/* 275 */           int m = (k >= i) ? i : k;
/* 276 */           System.arraycopy(this.b, this.c, paramArrayOfchar, paramInt1, m);
/* 277 */           this.c += m;
/* 278 */           paramInt1 += m;
/* 279 */           i -= m;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 287 */         if (i == 0 || (i < paramInt2 && !this.a.ready())) {
/*     */           break;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 297 */         if ((this.e == -1 || this.c - this.e >= this.f) && i >= this.b.length) {
/* 298 */           int m = this.a.read(paramArrayOfchar, paramInt1, i);
/* 299 */           if (m > 0) {
/* 300 */             i -= m;
/* 301 */             this.e = -1;
/*     */           } 
/*     */           break;
/*     */         } 
/* 305 */         if (b() == -1) {
/*     */           break;
/*     */         }
/*     */       } 
/* 309 */       int j = paramInt2 - i;
/* 310 */       return (j > 0 || j == paramInt2) ? j : -1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 410 */     synchronized (this.lock) {
/* 411 */       d();
/*     */       
/* 413 */       if (this.c == this.d && b() == -1)
/* 414 */         return null; 
/*     */       int i;
/* 416 */       for (i = this.c; i < this.d; i++) {
/* 417 */         char c = this.b[i];
/* 418 */         if (c <= '\r') {
/*     */ 
/*     */           
/* 421 */           if (c == '\n') {
/* 422 */             String str = new String(this.b, this.c, i - this.c);
/* 423 */             this.c = i + 1;
/* 424 */             return str;
/* 425 */           }  if (c == '\r') {
/* 426 */             String str = new String(this.b, this.c, i - this.c);
/* 427 */             this.c = i + 1;
/* 428 */             if ((this.c < this.d || b() != -1) && this.b[this.c] == '\n')
/*     */             {
/* 430 */               this.c++;
/*     */             }
/* 432 */             return str;
/*     */           } 
/*     */         } 
/* 435 */       }  i = 0;
/* 436 */       StringBuilder stringBuilder = new StringBuilder(80);
/*     */       
/* 438 */       stringBuilder.append(this.b, this.c, this.d - this.c);
/*     */       while (true) {
/* 440 */         this.c = this.d;
/*     */         
/* 442 */         if (i == 10) {
/* 443 */           return stringBuilder.toString();
/*     */         }
/*     */         
/* 446 */         if (b() == -1)
/*     */         {
/* 448 */           return (stringBuilder.length() > 0 || i != 0) ? stringBuilder
/* 449 */             .toString() : null;
/*     */         }
/*     */         
/* 452 */         for (int j = this.c; j < this.d; j++) {
/* 453 */           char c = this.b[j];
/* 454 */           if (i == 0) {
/* 455 */             if (c == '\n' || c == '\r')
/* 456 */               i = c; 
/*     */           } else {
/* 458 */             if (i == 13 && c == '\n') {
/* 459 */               if (j > this.c) {
/* 460 */                 stringBuilder.append(this.b, this.c, j - this.c - 1);
/*     */               }
/* 462 */               this.c = j + 1;
/* 463 */               return stringBuilder.toString();
/*     */             } 
/* 465 */             if (j > this.c) {
/* 466 */               stringBuilder.append(this.b, this.c, j - this.c - 1);
/*     */             }
/* 468 */             this.c = j;
/* 469 */             return stringBuilder.toString();
/*     */           } 
/*     */         } 
/* 472 */         if (i == 0) {
/* 473 */           stringBuilder.append(this.b, this.c, this.d - this.c);
/*     */         } else {
/* 475 */           stringBuilder.append(this.b, this.c, this.d - this.c - 1);
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 481 */           Thread.sleep(5L);
/*     */         }
/* 483 */         catch (InterruptedException interruptedException) {}
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ready() {
/* 504 */     synchronized (this.lock) {
/* 505 */       d();
/* 506 */       return (this.d - this.c > 0 || this.a.ready());
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
/*     */   public void reset() {
/* 521 */     synchronized (this.lock) {
/* 522 */       d();
/* 523 */       if (this.e == -1) {
/* 524 */         throw new IOException("Invalid mark");
/*     */       }
/* 526 */       this.c = this.e;
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
/*     */   public long skip(long paramLong) {
/* 549 */     if (paramLong < 0L) {
/* 550 */       throw new IllegalArgumentException("byteCount < 0: " + paramLong);
/*     */     }
/* 552 */     synchronized (this.lock) {
/* 553 */       d();
/* 554 */       if (paramLong < 1L) {
/* 555 */         return 0L;
/*     */       }
/* 557 */       if ((this.d - this.c) >= paramLong) {
/* 558 */         this.c = (int)(this.c + paramLong);
/* 559 */         return paramLong;
/*     */       } 
/* 561 */       long l1 = (this.d - this.c);
/* 562 */       this.c = this.d;
/* 563 */       while (l1 < paramLong) {
/* 564 */         if (b() == -1) {
/* 565 */           return l1;
/*     */         }
/* 567 */         if ((this.d - this.c) >= paramLong - l1) {
/* 568 */           this.c = (int)(this.c + paramLong - l1);
/* 569 */           return paramLong;
/*     */         } 
/*     */         
/* 572 */         l1 += (this.d - this.c);
/* 573 */         this.c = this.d;
/*     */       } 
/* 575 */       return paramLong;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
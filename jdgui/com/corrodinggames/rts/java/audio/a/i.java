/*     */ package com.corrodinggames.rts.java.audio.a;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements Iterable
/*     */ {
/*     */   public int a;
/*     */   long[] b;
/*     */   Object[] c;
/*     */   int d;
/*     */   int e;
/*     */   Object f;
/*     */   boolean g;
/*     */   private float h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*     */   private int m;
/*     */   private j n;
/*     */   private j o;
/*     */   
/*     */   public i() {
/*  55 */     this(51, 0.8F);
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
/*     */   public i(int paramInt, float paramFloat) {
/*  68 */     if (paramInt < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + paramInt); 
/*  69 */     paramInt = m.b((int)Math.ceil((paramInt / paramFloat)));
/*  70 */     if (paramInt > 1073741824) throw new IllegalArgumentException("initialCapacity is too large: " + paramInt); 
/*  71 */     this.d = paramInt;
/*     */     
/*  73 */     if (paramFloat <= 0.0F) throw new IllegalArgumentException("loadFactor must be > 0: " + paramFloat); 
/*  74 */     this.h = paramFloat;
/*     */     
/*  76 */     this.k = (int)(this.d * paramFloat);
/*  77 */     this.j = this.d - 1;
/*  78 */     this.i = 63 - Long.numberOfTrailingZeros(this.d);
/*  79 */     this.l = Math.max(3, (int)Math.ceil(Math.log(this.d)) * 2);
/*  80 */     this.m = Math.max(Math.min(this.d, 8), (int)Math.sqrt(this.d) / 8);
/*     */     
/*  82 */     this.b = new long[this.d + this.l];
/*  83 */     this.c = new Object[this.b.length];
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
/*     */   public Object a(long paramLong, Object paramObject) {
/*  98 */     if (paramLong == 0L) {
/*  99 */       Object object = this.f;
/* 100 */       this.f = paramObject;
/* 101 */       if (!this.g) {
/* 102 */         this.g = true;
/* 103 */         this.a++;
/*     */       } 
/* 105 */       return object;
/*     */     } 
/*     */     
/* 108 */     long[] arrayOfLong = this.b;
/*     */ 
/*     */     
/* 111 */     int k = (int)(paramLong & this.j);
/* 112 */     long l1 = arrayOfLong[k];
/* 113 */     if (l1 == paramLong) {
/* 114 */       Object object = this.c[k];
/* 115 */       this.c[k] = paramObject;
/* 116 */       return object;
/*     */     } 
/*     */     
/* 119 */     int m = f(paramLong);
/* 120 */     long l2 = arrayOfLong[m];
/* 121 */     if (l2 == paramLong) {
/* 122 */       Object object = this.c[m];
/* 123 */       this.c[m] = paramObject;
/* 124 */       return object;
/*     */     } 
/*     */     
/* 127 */     int n = g(paramLong);
/* 128 */     long l3 = arrayOfLong[n];
/* 129 */     if (l3 == paramLong) {
/* 130 */       Object object = this.c[n];
/* 131 */       this.c[n] = paramObject;
/* 132 */       return object;
/*     */     } 
/*     */ 
/*     */     
/* 136 */     for (int i1 = this.d, i2 = i1 + this.e; i1 < i2; i1++) {
/* 137 */       if (arrayOfLong[i1] == paramLong) {
/* 138 */         Object object = this.c[i1];
/* 139 */         this.c[i1] = paramObject;
/* 140 */         return object;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 145 */     if (l1 == 0L) {
/* 146 */       arrayOfLong[k] = paramLong;
/* 147 */       this.c[k] = paramObject;
/* 148 */       if (this.a++ >= this.k) b(this.d << 1); 
/* 149 */       return null;
/*     */     } 
/*     */     
/* 152 */     if (l2 == 0L) {
/* 153 */       arrayOfLong[m] = paramLong;
/* 154 */       this.c[m] = paramObject;
/* 155 */       if (this.a++ >= this.k) b(this.d << 1); 
/* 156 */       return null;
/*     */     } 
/*     */     
/* 159 */     if (l3 == 0L) {
/* 160 */       arrayOfLong[n] = paramLong;
/* 161 */       this.c[n] = paramObject;
/* 162 */       if (this.a++ >= this.k) b(this.d << 1); 
/* 163 */       return null;
/*     */     } 
/*     */     
/* 166 */     a(paramLong, paramObject, k, l1, m, l2, n, l3);
/* 167 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(long paramLong, Object paramObject) {
/* 177 */     if (paramLong == 0L) {
/* 178 */       this.f = paramObject;
/* 179 */       this.g = true;
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 184 */     int k = (int)(paramLong & this.j);
/* 185 */     long l1 = this.b[k];
/* 186 */     if (l1 == 0L) {
/* 187 */       this.b[k] = paramLong;
/* 188 */       this.c[k] = paramObject;
/* 189 */       if (this.a++ >= this.k) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 193 */     int m = f(paramLong);
/* 194 */     long l2 = this.b[m];
/* 195 */     if (l2 == 0L) {
/* 196 */       this.b[m] = paramLong;
/* 197 */       this.c[m] = paramObject;
/* 198 */       if (this.a++ >= this.k) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 202 */     int n = g(paramLong);
/* 203 */     long l3 = this.b[n];
/* 204 */     if (l3 == 0L) {
/* 205 */       this.b[n] = paramLong;
/* 206 */       this.c[n] = paramObject;
/* 207 */       if (this.a++ >= this.k) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 211 */     a(paramLong, paramObject, k, l1, m, l2, n, l3);
/*     */   } private void a(long paramLong1, Object paramObject, int paramInt1, long paramLong2, int paramInt2, long paramLong3, int paramInt3, long paramLong4) {
/*     */     long l;
/*     */     Object object;
/* 215 */     long[] arrayOfLong = this.b;
/* 216 */     Object[] arrayOfObject = this.c;
/* 217 */     int k = this.j;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     byte b = 0; int m = this.m;
/*     */     
/*     */     while (true) {
/* 225 */       switch (m.a(2)) {
/*     */         case 0:
/* 227 */           l = paramLong2;
/* 228 */           object = arrayOfObject[paramInt1];
/* 229 */           arrayOfLong[paramInt1] = paramLong1;
/* 230 */           arrayOfObject[paramInt1] = paramObject;
/*     */           break;
/*     */         case 1:
/* 233 */           l = paramLong3;
/* 234 */           object = arrayOfObject[paramInt2];
/* 235 */           arrayOfLong[paramInt2] = paramLong1;
/* 236 */           arrayOfObject[paramInt2] = paramObject;
/*     */           break;
/*     */         default:
/* 239 */           l = paramLong4;
/* 240 */           object = arrayOfObject[paramInt3];
/* 241 */           arrayOfLong[paramInt3] = paramLong1;
/* 242 */           arrayOfObject[paramInt3] = paramObject;
/*     */           break;
/*     */       } 
/*     */ 
/*     */       
/* 247 */       paramInt1 = (int)(l & k);
/* 248 */       paramLong2 = arrayOfLong[paramInt1];
/* 249 */       if (paramLong2 == 0L) {
/* 250 */         arrayOfLong[paramInt1] = l;
/* 251 */         arrayOfObject[paramInt1] = object;
/* 252 */         if (this.a++ >= this.k) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 256 */       paramInt2 = f(l);
/* 257 */       paramLong3 = arrayOfLong[paramInt2];
/* 258 */       if (paramLong3 == 0L) {
/* 259 */         arrayOfLong[paramInt2] = l;
/* 260 */         arrayOfObject[paramInt2] = object;
/* 261 */         if (this.a++ >= this.k) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 265 */       paramInt3 = g(l);
/* 266 */       paramLong4 = arrayOfLong[paramInt3];
/* 267 */       if (paramLong4 == 0L) {
/* 268 */         arrayOfLong[paramInt3] = l;
/* 269 */         arrayOfObject[paramInt3] = object;
/* 270 */         if (this.a++ >= this.k) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 274 */       if (++b == m)
/*     */         break; 
/* 276 */       paramLong1 = l;
/* 277 */       paramObject = object;
/*     */     } 
/*     */     
/* 280 */     c(l, object);
/*     */   }
/*     */   
/*     */   private void c(long paramLong, Object paramObject) {
/* 284 */     if (this.e == this.l) {
/*     */       
/* 286 */       b(this.d << 1);
/* 287 */       a(paramLong, paramObject);
/*     */       
/*     */       return;
/*     */     } 
/* 291 */     int k = this.d + this.e;
/* 292 */     this.b[k] = paramLong;
/* 293 */     this.c[k] = paramObject;
/* 294 */     this.e++;
/* 295 */     this.a++;
/*     */   }
/*     */   
/*     */   public Object a(long paramLong) {
/* 299 */     if (paramLong == 0L) {
/* 300 */       if (!this.g) return null; 
/* 301 */       return this.f;
/*     */     } 
/* 303 */     int k = (int)(paramLong & this.j);
/* 304 */     if (this.b[k] != paramLong) {
/* 305 */       k = f(paramLong);
/* 306 */       if (this.b[k] != paramLong) {
/* 307 */         k = g(paramLong);
/* 308 */         if (this.b[k] != paramLong) return d(paramLong, null); 
/*     */       } 
/*     */     } 
/* 311 */     return this.c[k];
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
/*     */   private Object d(long paramLong, Object paramObject) {
/* 331 */     long[] arrayOfLong = this.b;
/* 332 */     for (int k = this.d, m = k + this.e; k < m; k++) {
/* 333 */       if (arrayOfLong[k] == paramLong) return this.c[k]; 
/* 334 */     }  return paramObject;
/*     */   }
/*     */   
/*     */   public Object b(long paramLong) {
/* 338 */     if (paramLong == 0L) {
/* 339 */       if (!this.g) return null; 
/* 340 */       Object object = this.f;
/* 341 */       this.f = null;
/* 342 */       this.g = false;
/* 343 */       this.a--;
/* 344 */       return object;
/*     */     } 
/*     */     
/* 347 */     int k = (int)(paramLong & this.j);
/* 348 */     if (this.b[k] == paramLong) {
/* 349 */       this.b[k] = 0L;
/* 350 */       Object object = this.c[k];
/* 351 */       this.c[k] = null;
/* 352 */       this.a--;
/* 353 */       return object;
/*     */     } 
/*     */     
/* 356 */     k = f(paramLong);
/* 357 */     if (this.b[k] == paramLong) {
/* 358 */       this.b[k] = 0L;
/* 359 */       Object object = this.c[k];
/* 360 */       this.c[k] = null;
/* 361 */       this.a--;
/* 362 */       return object;
/*     */     } 
/*     */     
/* 365 */     k = g(paramLong);
/* 366 */     if (this.b[k] == paramLong) {
/* 367 */       this.b[k] = 0L;
/* 368 */       Object object = this.c[k];
/* 369 */       this.c[k] = null;
/* 370 */       this.a--;
/* 371 */       return object;
/*     */     } 
/*     */     
/* 374 */     return c(paramLong);
/*     */   }
/*     */   
/*     */   Object c(long paramLong) {
/* 378 */     long[] arrayOfLong = this.b;
/* 379 */     for (int k = this.d, m = k + this.e; k < m; k++) {
/* 380 */       if (arrayOfLong[k] == paramLong) {
/* 381 */         Object object = this.c[k];
/* 382 */         a(k);
/* 383 */         this.a--;
/* 384 */         return object;
/*     */       } 
/*     */     } 
/* 387 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   void a(int paramInt) {
/* 392 */     this.e--;
/* 393 */     int k = this.d + this.e;
/* 394 */     if (paramInt < k) {
/* 395 */       this.b[paramInt] = this.b[k];
/* 396 */       this.c[paramInt] = this.c[k];
/* 397 */       this.c[k] = null;
/*     */     } else {
/* 399 */       this.c[paramInt] = null;
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
/*     */   public void a() {
/* 430 */     if (this.a == 0)
/* 431 */       return;  long[] arrayOfLong = this.b;
/* 432 */     Object[] arrayOfObject = this.c;
/* 433 */     for (int k = this.d + this.e; k-- > 0; ) {
/* 434 */       arrayOfLong[k] = 0L;
/* 435 */       arrayOfObject[k] = null;
/*     */     } 
/* 437 */     this.a = 0;
/* 438 */     this.e = 0;
/* 439 */     this.f = null;
/* 440 */     this.g = false;
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
/*     */   public boolean d(long paramLong) {
/* 465 */     if (paramLong == 0L) return this.g; 
/* 466 */     int k = (int)(paramLong & this.j);
/* 467 */     if (this.b[k] != paramLong) {
/* 468 */       k = f(paramLong);
/* 469 */       if (this.b[k] != paramLong) {
/* 470 */         k = g(paramLong);
/* 471 */         if (this.b[k] != paramLong) return e(paramLong); 
/*     */       } 
/*     */     } 
/* 474 */     return true;
/*     */   }
/*     */   
/*     */   private boolean e(long paramLong) {
/* 478 */     long[] arrayOfLong = this.b;
/* 479 */     for (int k = this.d, m = k + this.e; k < m; k++) {
/* 480 */       if (arrayOfLong[k] == paramLong) return true; 
/* 481 */     }  return false;
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
/*     */   private void b(int paramInt) {
/* 515 */     int k = this.d + this.e;
/*     */     
/* 517 */     this.d = paramInt;
/* 518 */     this.k = (int)(paramInt * this.h);
/* 519 */     this.j = paramInt - 1;
/* 520 */     this.i = 63 - Long.numberOfTrailingZeros(paramInt);
/* 521 */     this.l = Math.max(3, (int)Math.ceil(Math.log(paramInt)) * 2);
/* 522 */     this.m = Math.max(Math.min(paramInt, 8), (int)Math.sqrt(paramInt) / 8);
/*     */     
/* 524 */     long[] arrayOfLong = this.b;
/* 525 */     Object[] arrayOfObject = this.c;
/*     */     
/* 527 */     this.b = new long[paramInt + this.l];
/* 528 */     this.c = new Object[paramInt + this.l];
/*     */     
/* 530 */     int m = this.a;
/* 531 */     this.a = this.g ? 1 : 0;
/* 532 */     this.e = 0;
/* 533 */     if (m > 0)
/* 534 */       for (byte b = 0; b < k; b++) {
/* 535 */         long l = arrayOfLong[b];
/* 536 */         if (l != 0L) b(l, arrayOfObject[b]);
/*     */       
/*     */       }  
/*     */   }
/*     */   
/*     */   private int f(long paramLong) {
/* 542 */     paramLong *= -1262997959L;
/* 543 */     return (int)((paramLong ^ paramLong >>> this.i) & this.j);
/*     */   }
/*     */   
/*     */   private int g(long paramLong) {
/* 547 */     paramLong *= -825114047L;
/* 548 */     return (int)((paramLong ^ paramLong >>> this.i) & this.j);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 552 */     int k = 0;
/* 553 */     if (this.g && this.f != null) {
/* 554 */       k += this.f.hashCode();
/*     */     }
/* 556 */     long[] arrayOfLong = this.b;
/* 557 */     Object[] arrayOfObject = this.c; byte b; int m;
/* 558 */     for (b = 0, m = this.d + this.e; b < m; b++) {
/* 559 */       long l = arrayOfLong[b];
/* 560 */       if (l != 0L) {
/* 561 */         k += (int)(l ^ l >>> 32L) * 31;
/*     */         
/* 563 */         Object object = arrayOfObject[b];
/* 564 */         if (object != null) {
/* 565 */           k += object.hashCode();
/*     */         }
/*     */       } 
/*     */     } 
/* 569 */     return k;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 573 */     if (paramObject == this) return true; 
/* 574 */     if (!(paramObject instanceof i)) return false; 
/* 575 */     i i1 = (i)paramObject;
/* 576 */     if (i1.a != this.a) return false; 
/* 577 */     if (i1.g != this.g) return false; 
/* 578 */     if (this.g) {
/* 579 */       if (i1.f == null)
/* 580 */       { if (this.f != null) return false;
/*     */          }
/* 582 */       else if (!i1.f.equals(this.f)) { return false; }
/*     */     
/*     */     }
/* 585 */     long[] arrayOfLong = this.b;
/* 586 */     Object[] arrayOfObject = this.c; byte b; int k;
/* 587 */     for (b = 0, k = this.d + this.e; b < k; b++) {
/* 588 */       long l = arrayOfLong[b];
/* 589 */       if (l != 0L) {
/* 590 */         Object object = arrayOfObject[b];
/* 591 */         if (object == null) {
/* 592 */           if (!i1.d(l) || i1.a(l) != null) {
/* 593 */             return false;
/*     */           }
/*     */         }
/* 596 */         else if (!object.equals(i1.a(l))) {
/* 597 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 602 */     return true;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 606 */     if (this.a == 0) return "[]"; 
/* 607 */     StringBuilder stringBuilder = new StringBuilder(32);
/* 608 */     stringBuilder.append('[');
/* 609 */     long[] arrayOfLong = this.b;
/* 610 */     Object[] arrayOfObject = this.c;
/* 611 */     int k = arrayOfLong.length;
/* 612 */     while (k-- > 0) {
/* 613 */       long l = arrayOfLong[k];
/* 614 */       if (l == 0L)
/* 615 */         continue;  stringBuilder.append(l);
/* 616 */       stringBuilder.append('=');
/* 617 */       stringBuilder.append(arrayOfObject[k]);
/*     */     } 
/*     */     
/* 620 */     while (k-- > 0) {
/* 621 */       long l = arrayOfLong[k];
/* 622 */       if (l == 0L)
/* 623 */         continue;  stringBuilder.append(", ");
/* 624 */       stringBuilder.append(l);
/* 625 */       stringBuilder.append('=');
/* 626 */       stringBuilder.append(arrayOfObject[k]);
/*     */     } 
/* 628 */     stringBuilder.append(']');
/* 629 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public Iterator iterator() {
/* 633 */     return b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public j b() {
/* 639 */     if (this.n == null) {
/* 640 */       this.n = new j(this);
/* 641 */       this.o = new j(this);
/*     */     } 
/* 643 */     if (!this.n.e) {
/* 644 */       this.n.b();
/* 645 */       this.n.e = true;
/* 646 */       this.o.e = false;
/* 647 */       return this.n;
/*     */     } 
/* 649 */     this.o.b();
/* 650 */     this.o.e = true;
/* 651 */     this.n.e = false;
/* 652 */     return this.o;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
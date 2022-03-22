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
/*     */ public class e
/*     */   implements Iterable
/*     */ {
/*     */   public int a;
/*     */   int[] b;
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
/*     */   private f n;
/*     */   private f o;
/*     */   
/*     */   public e() {
/*  54 */     this(51, 0.8F);
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
/*     */   public e(int paramInt, float paramFloat) {
/*  67 */     if (paramInt < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + paramInt); 
/*  68 */     paramInt = m.b((int)Math.ceil((paramInt / paramFloat)));
/*  69 */     if (paramInt > 1073741824) throw new IllegalArgumentException("initialCapacity is too large: " + paramInt); 
/*  70 */     this.d = paramInt;
/*     */     
/*  72 */     if (paramFloat <= 0.0F) throw new IllegalArgumentException("loadFactor must be > 0: " + paramFloat); 
/*  73 */     this.h = paramFloat;
/*     */     
/*  75 */     this.k = (int)(this.d * paramFloat);
/*  76 */     this.j = this.d - 1;
/*  77 */     this.i = 31 - Integer.numberOfTrailingZeros(this.d);
/*  78 */     this.l = Math.max(3, (int)Math.ceil(Math.log(this.d)) * 2);
/*  79 */     this.m = Math.max(Math.min(this.d, 8), (int)Math.sqrt(this.d) / 8);
/*     */     
/*  81 */     this.b = new int[this.d + this.l];
/*  82 */     this.c = new Object[this.b.length];
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
/*     */   public Object a(int paramInt, Object paramObject) {
/*  97 */     if (paramInt == 0) {
/*  98 */       Object object = this.f;
/*  99 */       this.f = paramObject;
/* 100 */       if (!this.g) {
/* 101 */         this.g = true;
/* 102 */         this.a++;
/*     */       } 
/* 104 */       return object;
/*     */     } 
/*     */     
/* 107 */     int[] arrayOfInt = this.b;
/*     */ 
/*     */     
/* 110 */     int i = paramInt & this.j;
/* 111 */     int j = arrayOfInt[i];
/* 112 */     if (j == paramInt) {
/* 113 */       Object object = this.c[i];
/* 114 */       this.c[i] = paramObject;
/* 115 */       return object;
/*     */     } 
/*     */     
/* 118 */     int k = h(paramInt);
/* 119 */     int m = arrayOfInt[k];
/* 120 */     if (m == paramInt) {
/* 121 */       Object object = this.c[k];
/* 122 */       this.c[k] = paramObject;
/* 123 */       return object;
/*     */     } 
/*     */     
/* 126 */     int n = i(paramInt);
/* 127 */     int i1 = arrayOfInt[n];
/* 128 */     if (i1 == paramInt) {
/* 129 */       Object object = this.c[n];
/* 130 */       this.c[n] = paramObject;
/* 131 */       return object;
/*     */     } 
/*     */ 
/*     */     
/* 135 */     for (int i2 = this.d, i3 = i2 + this.e; i2 < i3; i2++) {
/* 136 */       if (arrayOfInt[i2] == paramInt) {
/* 137 */         Object object = this.c[i2];
/* 138 */         this.c[i2] = paramObject;
/* 139 */         return object;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 144 */     if (j == 0) {
/* 145 */       arrayOfInt[i] = paramInt;
/* 146 */       this.c[i] = paramObject;
/* 147 */       if (this.a++ >= this.k) g(this.d << 1); 
/* 148 */       return null;
/*     */     } 
/*     */     
/* 151 */     if (m == 0) {
/* 152 */       arrayOfInt[k] = paramInt;
/* 153 */       this.c[k] = paramObject;
/* 154 */       if (this.a++ >= this.k) g(this.d << 1); 
/* 155 */       return null;
/*     */     } 
/*     */     
/* 158 */     if (i1 == 0) {
/* 159 */       arrayOfInt[n] = paramInt;
/* 160 */       this.c[n] = paramObject;
/* 161 */       if (this.a++ >= this.k) g(this.d << 1); 
/* 162 */       return null;
/*     */     } 
/*     */     
/* 165 */     a(paramInt, paramObject, i, j, k, m, n, i1);
/* 166 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(int paramInt, Object paramObject) {
/* 176 */     if (paramInt == 0) {
/* 177 */       this.f = paramObject;
/* 178 */       this.g = true;
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 183 */     int i = paramInt & this.j;
/* 184 */     int j = this.b[i];
/* 185 */     if (j == 0) {
/* 186 */       this.b[i] = paramInt;
/* 187 */       this.c[i] = paramObject;
/* 188 */       if (this.a++ >= this.k) g(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 192 */     int k = h(paramInt);
/* 193 */     int m = this.b[k];
/* 194 */     if (m == 0) {
/* 195 */       this.b[k] = paramInt;
/* 196 */       this.c[k] = paramObject;
/* 197 */       if (this.a++ >= this.k) g(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 201 */     int n = i(paramInt);
/* 202 */     int i1 = this.b[n];
/* 203 */     if (i1 == 0) {
/* 204 */       this.b[n] = paramInt;
/* 205 */       this.c[n] = paramObject;
/* 206 */       if (this.a++ >= this.k) g(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 210 */     a(paramInt, paramObject, i, j, k, m, n, i1);
/*     */   } private void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
/*     */     int j;
/*     */     Object object;
/* 214 */     int[] arrayOfInt = this.b;
/*     */     
/* 216 */     Object[] arrayOfObject = this.c;
/* 217 */     int i = this.j;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     byte b = 0; int k = this.m;
/*     */     
/*     */     while (true) {
/* 225 */       switch (m.a(2)) {
/*     */         case 0:
/* 227 */           j = paramInt3;
/* 228 */           object = arrayOfObject[paramInt2];
/* 229 */           arrayOfInt[paramInt2] = paramInt1;
/* 230 */           arrayOfObject[paramInt2] = paramObject;
/*     */           break;
/*     */         case 1:
/* 233 */           j = paramInt5;
/* 234 */           object = arrayOfObject[paramInt4];
/* 235 */           arrayOfInt[paramInt4] = paramInt1;
/* 236 */           arrayOfObject[paramInt4] = paramObject;
/*     */           break;
/*     */         default:
/* 239 */           j = paramInt7;
/* 240 */           object = arrayOfObject[paramInt6];
/* 241 */           arrayOfInt[paramInt6] = paramInt1;
/* 242 */           arrayOfObject[paramInt6] = paramObject;
/*     */           break;
/*     */       } 
/*     */ 
/*     */       
/* 247 */       paramInt2 = j & i;
/* 248 */       paramInt3 = arrayOfInt[paramInt2];
/* 249 */       if (paramInt3 == 0) {
/* 250 */         arrayOfInt[paramInt2] = j;
/* 251 */         arrayOfObject[paramInt2] = object;
/* 252 */         if (this.a++ >= this.k) g(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 256 */       paramInt4 = h(j);
/* 257 */       paramInt5 = arrayOfInt[paramInt4];
/* 258 */       if (paramInt5 == 0) {
/* 259 */         arrayOfInt[paramInt4] = j;
/* 260 */         arrayOfObject[paramInt4] = object;
/* 261 */         if (this.a++ >= this.k) g(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 265 */       paramInt6 = i(j);
/* 266 */       paramInt7 = arrayOfInt[paramInt6];
/* 267 */       if (paramInt7 == 0) {
/* 268 */         arrayOfInt[paramInt6] = j;
/* 269 */         arrayOfObject[paramInt6] = object;
/* 270 */         if (this.a++ >= this.k) g(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 274 */       if (++b == k)
/*     */         break; 
/* 276 */       paramInt1 = j;
/* 277 */       paramObject = object;
/*     */     } 
/*     */     
/* 280 */     c(j, object);
/*     */   }
/*     */   
/*     */   private void c(int paramInt, Object paramObject) {
/* 284 */     if (this.e == this.l) {
/*     */       
/* 286 */       g(this.d << 1);
/* 287 */       a(paramInt, paramObject);
/*     */       
/*     */       return;
/*     */     } 
/* 291 */     int i = this.d + this.e;
/* 292 */     this.b[i] = paramInt;
/* 293 */     this.c[i] = paramObject;
/* 294 */     this.e++;
/* 295 */     this.a++;
/*     */   }
/*     */   
/*     */   public Object a(int paramInt) {
/* 299 */     if (paramInt == 0) {
/* 300 */       if (!this.g) return null; 
/* 301 */       return this.f;
/*     */     } 
/* 303 */     int i = paramInt & this.j;
/* 304 */     if (this.b[i] != paramInt) {
/* 305 */       i = h(paramInt);
/* 306 */       if (this.b[i] != paramInt) {
/* 307 */         i = i(paramInt);
/* 308 */         if (this.b[i] != paramInt) return d(paramInt, null); 
/*     */       } 
/*     */     } 
/* 311 */     return this.c[i];
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
/*     */   private Object d(int paramInt, Object paramObject) {
/* 331 */     int[] arrayOfInt = this.b;
/* 332 */     for (int i = this.d, j = i + this.e; i < j; i++) {
/* 333 */       if (arrayOfInt[i] == paramInt) return this.c[i]; 
/* 334 */     }  return paramObject;
/*     */   }
/*     */   
/*     */   public Object b(int paramInt) {
/* 338 */     if (paramInt == 0) {
/* 339 */       if (!this.g) return null; 
/* 340 */       Object object = this.f;
/* 341 */       this.f = null;
/* 342 */       this.g = false;
/* 343 */       this.a--;
/* 344 */       return object;
/*     */     } 
/*     */     
/* 347 */     int i = paramInt & this.j;
/* 348 */     if (this.b[i] == paramInt) {
/* 349 */       this.b[i] = 0;
/* 350 */       Object object = this.c[i];
/* 351 */       this.c[i] = null;
/* 352 */       this.a--;
/* 353 */       return object;
/*     */     } 
/*     */     
/* 356 */     i = h(paramInt);
/* 357 */     if (this.b[i] == paramInt) {
/* 358 */       this.b[i] = 0;
/* 359 */       Object object = this.c[i];
/* 360 */       this.c[i] = null;
/* 361 */       this.a--;
/* 362 */       return object;
/*     */     } 
/*     */     
/* 365 */     i = i(paramInt);
/* 366 */     if (this.b[i] == paramInt) {
/* 367 */       this.b[i] = 0;
/* 368 */       Object object = this.c[i];
/* 369 */       this.c[i] = null;
/* 370 */       this.a--;
/* 371 */       return object;
/*     */     } 
/*     */     
/* 374 */     return c(paramInt);
/*     */   }
/*     */   
/*     */   Object c(int paramInt) {
/* 378 */     int[] arrayOfInt = this.b;
/* 379 */     for (int i = this.d, j = i + this.e; i < j; i++) {
/* 380 */       if (arrayOfInt[i] == paramInt) {
/* 381 */         Object object = this.c[i];
/* 382 */         d(i);
/* 383 */         this.a--;
/* 384 */         return object;
/*     */       } 
/*     */     } 
/* 387 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   void d(int paramInt) {
/* 392 */     this.e--;
/* 393 */     int i = this.d + this.e;
/* 394 */     if (paramInt < i) {
/* 395 */       this.b[paramInt] = this.b[i];
/* 396 */       this.c[paramInt] = this.c[i];
/* 397 */       this.c[i] = null;
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
/* 431 */       return;  int[] arrayOfInt = this.b;
/* 432 */     Object[] arrayOfObject = this.c;
/* 433 */     for (int i = this.d + this.e; i-- > 0; ) {
/* 434 */       arrayOfInt[i] = 0;
/* 435 */       arrayOfObject[i] = null;
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
/*     */ 
/*     */   
/*     */   public boolean e(int paramInt) {
/* 467 */     if (paramInt == 0) return this.g; 
/* 468 */     int i = paramInt & this.j;
/* 469 */     if (this.b[i] != paramInt) {
/* 470 */       i = h(paramInt);
/* 471 */       if (this.b[i] != paramInt) {
/* 472 */         i = i(paramInt);
/* 473 */         if (this.b[i] != paramInt) return f(paramInt); 
/*     */       } 
/*     */     } 
/* 476 */     return true;
/*     */   }
/*     */   
/*     */   private boolean f(int paramInt) {
/* 480 */     int[] arrayOfInt = this.b;
/* 481 */     for (int i = this.d, j = i + this.e; i < j; i++) {
/* 482 */       if (arrayOfInt[i] == paramInt) return true; 
/* 483 */     }  return false;
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
/*     */   private void g(int paramInt) {
/* 517 */     int i = this.d + this.e;
/*     */     
/* 519 */     this.d = paramInt;
/* 520 */     this.k = (int)(paramInt * this.h);
/* 521 */     this.j = paramInt - 1;
/* 522 */     this.i = 31 - Integer.numberOfTrailingZeros(paramInt);
/* 523 */     this.l = Math.max(3, (int)Math.ceil(Math.log(paramInt)) * 2);
/* 524 */     this.m = Math.max(Math.min(paramInt, 8), (int)Math.sqrt(paramInt) / 8);
/*     */     
/* 526 */     int[] arrayOfInt = this.b;
/* 527 */     Object[] arrayOfObject = this.c;
/*     */     
/* 529 */     this.b = new int[paramInt + this.l];
/* 530 */     this.c = new Object[paramInt + this.l];
/*     */     
/* 532 */     int j = this.a;
/* 533 */     this.a = this.g ? 1 : 0;
/* 534 */     this.e = 0;
/* 535 */     if (j > 0)
/* 536 */       for (byte b = 0; b < i; b++) {
/* 537 */         int k = arrayOfInt[b];
/* 538 */         if (k != 0) b(k, arrayOfObject[b]);
/*     */       
/*     */       }  
/*     */   }
/*     */   
/*     */   private int h(int paramInt) {
/* 544 */     paramInt *= -1262997959;
/* 545 */     return (paramInt ^ paramInt >>> this.i) & this.j;
/*     */   }
/*     */   
/*     */   private int i(int paramInt) {
/* 549 */     paramInt *= -825114047;
/* 550 */     return (paramInt ^ paramInt >>> this.i) & this.j;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 554 */     int i = 0;
/* 555 */     if (this.g && this.f != null) {
/* 556 */       i += this.f.hashCode();
/*     */     }
/* 558 */     int[] arrayOfInt = this.b;
/* 559 */     Object[] arrayOfObject = this.c; byte b; int j;
/* 560 */     for (b = 0, j = this.d + this.e; b < j; b++) {
/* 561 */       int k = arrayOfInt[b];
/* 562 */       if (k != 0) {
/* 563 */         i += k * 31;
/*     */         
/* 565 */         Object object = arrayOfObject[b];
/* 566 */         if (object != null) {
/* 567 */           i += object.hashCode();
/*     */         }
/*     */       } 
/*     */     } 
/* 571 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 575 */     if (paramObject == this) return true; 
/* 576 */     if (!(paramObject instanceof e)) return false; 
/* 577 */     e e1 = (e)paramObject;
/* 578 */     if (e1.a != this.a) return false; 
/* 579 */     if (e1.g != this.g) return false; 
/* 580 */     if (this.g) {
/* 581 */       if (e1.f == null)
/* 582 */       { if (this.f != null) return false;
/*     */          }
/* 584 */       else if (!e1.f.equals(this.f)) { return false; }
/*     */     
/*     */     }
/* 587 */     int[] arrayOfInt = this.b;
/* 588 */     Object[] arrayOfObject = this.c; byte b; int i;
/* 589 */     for (b = 0, i = this.d + this.e; b < i; b++) {
/* 590 */       int j = arrayOfInt[b];
/* 591 */       if (j != 0) {
/* 592 */         Object object = arrayOfObject[b];
/* 593 */         if (object == null) {
/* 594 */           if (!e1.e(j) || e1.a(j) != null) {
/* 595 */             return false;
/*     */           }
/*     */         }
/* 598 */         else if (!object.equals(e1.a(j))) {
/* 599 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 604 */     return true;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 608 */     if (this.a == 0) return "[]"; 
/* 609 */     StringBuilder stringBuilder = new StringBuilder(32);
/* 610 */     stringBuilder.append('[');
/* 611 */     int[] arrayOfInt = this.b;
/* 612 */     Object[] arrayOfObject = this.c;
/* 613 */     int i = arrayOfInt.length;
/* 614 */     if (this.g) {
/* 615 */       stringBuilder.append("0=");
/* 616 */       stringBuilder.append(this.f);
/*     */     } else {
/* 618 */       while (i-- > 0) {
/* 619 */         int j = arrayOfInt[i];
/* 620 */         if (j == 0)
/* 621 */           continue;  stringBuilder.append(j);
/* 622 */         stringBuilder.append('=');
/* 623 */         stringBuilder.append(arrayOfObject[i]);
/*     */       } 
/*     */     } 
/*     */     
/* 627 */     while (i-- > 0) {
/* 628 */       int j = arrayOfInt[i];
/* 629 */       if (j == 0)
/* 630 */         continue;  stringBuilder.append(", ");
/* 631 */       stringBuilder.append(j);
/* 632 */       stringBuilder.append('=');
/* 633 */       stringBuilder.append(arrayOfObject[i]);
/*     */     } 
/* 635 */     stringBuilder.append(']');
/* 636 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public Iterator iterator() {
/* 640 */     return b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public f b() {
/* 646 */     if (this.n == null) {
/* 647 */       this.n = new f(this);
/* 648 */       this.o = new f(this);
/*     */     } 
/* 650 */     if (!this.n.e) {
/* 651 */       this.n.b();
/* 652 */       this.n.e = true;
/* 653 */       this.o.e = false;
/* 654 */       return this.n;
/*     */     } 
/* 656 */     this.o.b();
/* 657 */     this.o.e = true;
/* 658 */     this.n.e = false;
/* 659 */     return this.o;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
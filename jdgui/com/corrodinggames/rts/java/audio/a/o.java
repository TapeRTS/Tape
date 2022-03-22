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
/*     */ public class o
/*     */   implements Iterable
/*     */ {
/*     */   public int a;
/*     */   Object[] b;
/*     */   Object[] c;
/*     */   int d;
/*     */   int e;
/*     */   private float f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private p l;
/*     */   private p m;
/*     */   
/*     */   public o() {
/*  52 */     this(51, 0.8F);
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
/*     */   public o(int paramInt, float paramFloat) {
/*  65 */     if (paramInt < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + paramInt); 
/*  66 */     paramInt = m.b((int)Math.ceil((paramInt / paramFloat)));
/*  67 */     if (paramInt > 1073741824) throw new IllegalArgumentException("initialCapacity is too large: " + paramInt); 
/*  68 */     this.d = paramInt;
/*     */     
/*  70 */     if (paramFloat <= 0.0F) throw new IllegalArgumentException("loadFactor must be > 0: " + paramFloat); 
/*  71 */     this.f = paramFloat;
/*     */     
/*  73 */     this.i = (int)(this.d * paramFloat);
/*  74 */     this.h = this.d - 1;
/*  75 */     this.g = 31 - Integer.numberOfTrailingZeros(this.d);
/*  76 */     this.j = Math.max(3, (int)Math.ceil(Math.log(this.d)) * 2);
/*  77 */     this.k = Math.max(Math.min(this.d, 8), (int)Math.sqrt(this.d) / 8);
/*     */     
/*  79 */     this.b = new Object[this.d + this.j];
/*  80 */     this.c = new Object[this.b.length];
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
/*     */   public Object a(Object paramObject1, Object paramObject2) {
/*  94 */     if (paramObject1 == null) throw new IllegalArgumentException("key cannot be null."); 
/*  95 */     return b(paramObject1, paramObject2);
/*     */   }
/*     */   
/*     */   private Object b(Object paramObject1, Object paramObject2) {
/*  99 */     Object[] arrayOfObject = this.b;
/*     */ 
/*     */     
/* 102 */     int i = paramObject1.hashCode();
/* 103 */     int j = i & this.h;
/* 104 */     Object object1 = arrayOfObject[j];
/* 105 */     if (paramObject1.equals(object1)) {
/* 106 */       Object object = this.c[j];
/* 107 */       this.c[j] = paramObject2;
/* 108 */       return object;
/*     */     } 
/*     */     
/* 111 */     int k = c(i);
/* 112 */     Object object2 = arrayOfObject[k];
/* 113 */     if (paramObject1.equals(object2)) {
/* 114 */       Object object = this.c[k];
/* 115 */       this.c[k] = paramObject2;
/* 116 */       return object;
/*     */     } 
/*     */     
/* 119 */     int m = d(i);
/* 120 */     Object object3 = arrayOfObject[m];
/* 121 */     if (paramObject1.equals(object3)) {
/* 122 */       Object object = this.c[m];
/* 123 */       this.c[m] = paramObject2;
/* 124 */       return object;
/*     */     } 
/*     */ 
/*     */     
/* 128 */     for (int n = this.d, i1 = n + this.e; n < i1; n++) {
/* 129 */       if (paramObject1.equals(arrayOfObject[n])) {
/* 130 */         Object object = this.c[n];
/* 131 */         this.c[n] = paramObject2;
/* 132 */         return object;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 137 */     if (object1 == null) {
/* 138 */       arrayOfObject[j] = paramObject1;
/* 139 */       this.c[j] = paramObject2;
/* 140 */       if (this.a++ >= this.i) b(this.d << 1); 
/* 141 */       return null;
/*     */     } 
/*     */     
/* 144 */     if (object2 == null) {
/* 145 */       arrayOfObject[k] = paramObject1;
/* 146 */       this.c[k] = paramObject2;
/* 147 */       if (this.a++ >= this.i) b(this.d << 1); 
/* 148 */       return null;
/*     */     } 
/*     */     
/* 151 */     if (object3 == null) {
/* 152 */       arrayOfObject[m] = paramObject1;
/* 153 */       this.c[m] = paramObject2;
/* 154 */       if (this.a++ >= this.i) b(this.d << 1); 
/* 155 */       return null;
/*     */     } 
/*     */     
/* 158 */     a(paramObject1, paramObject2, j, object1, k, object2, m, object3);
/* 159 */     return null;
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
/*     */   private void c(Object paramObject1, Object paramObject2) {
/* 171 */     int i = paramObject1.hashCode();
/* 172 */     int j = i & this.h;
/* 173 */     Object object1 = this.b[j];
/* 174 */     if (object1 == null) {
/* 175 */       this.b[j] = paramObject1;
/* 176 */       this.c[j] = paramObject2;
/* 177 */       if (this.a++ >= this.i) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 181 */     int k = c(i);
/* 182 */     Object object2 = this.b[k];
/* 183 */     if (object2 == null) {
/* 184 */       this.b[k] = paramObject1;
/* 185 */       this.c[k] = paramObject2;
/* 186 */       if (this.a++ >= this.i) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 190 */     int m = d(i);
/* 191 */     Object object3 = this.b[m];
/* 192 */     if (object3 == null) {
/* 193 */       this.b[m] = paramObject1;
/* 194 */       this.c[m] = paramObject2;
/* 195 */       if (this.a++ >= this.i) b(this.d << 1);
/*     */       
/*     */       return;
/*     */     } 
/* 199 */     a(paramObject1, paramObject2, j, object1, k, object2, m, object3);
/*     */   }
/*     */   
/*     */   private void a(Object paramObject1, Object paramObject2, int paramInt1, Object paramObject3, int paramInt2, Object paramObject4, int paramInt3, Object paramObject5) {
/* 203 */     Object object1, object2, arrayOfObject1[] = this.b;
/* 204 */     Object[] arrayOfObject2 = this.c;
/* 205 */     int i = this.h;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 210 */     byte b = 0; int j = this.k;
/*     */     
/*     */     while (true) {
/* 213 */       switch (m.a(2)) {
/*     */         case 0:
/* 215 */           object1 = paramObject3;
/* 216 */           object2 = arrayOfObject2[paramInt1];
/* 217 */           arrayOfObject1[paramInt1] = paramObject1;
/* 218 */           arrayOfObject2[paramInt1] = paramObject2;
/*     */           break;
/*     */         case 1:
/* 221 */           object1 = paramObject4;
/* 222 */           object2 = arrayOfObject2[paramInt2];
/* 223 */           arrayOfObject1[paramInt2] = paramObject1;
/* 224 */           arrayOfObject2[paramInt2] = paramObject2;
/*     */           break;
/*     */         default:
/* 227 */           object1 = paramObject5;
/* 228 */           object2 = arrayOfObject2[paramInt3];
/* 229 */           arrayOfObject1[paramInt3] = paramObject1;
/* 230 */           arrayOfObject2[paramInt3] = paramObject2;
/*     */           break;
/*     */       } 
/*     */ 
/*     */       
/* 235 */       int k = object1.hashCode();
/* 236 */       paramInt1 = k & i;
/* 237 */       paramObject3 = arrayOfObject1[paramInt1];
/* 238 */       if (paramObject3 == null) {
/* 239 */         arrayOfObject1[paramInt1] = object1;
/* 240 */         arrayOfObject2[paramInt1] = object2;
/* 241 */         if (this.a++ >= this.i) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 245 */       paramInt2 = c(k);
/* 246 */       paramObject4 = arrayOfObject1[paramInt2];
/* 247 */       if (paramObject4 == null) {
/* 248 */         arrayOfObject1[paramInt2] = object1;
/* 249 */         arrayOfObject2[paramInt2] = object2;
/* 250 */         if (this.a++ >= this.i) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 254 */       paramInt3 = d(k);
/* 255 */       paramObject5 = arrayOfObject1[paramInt3];
/* 256 */       if (paramObject5 == null) {
/* 257 */         arrayOfObject1[paramInt3] = object1;
/* 258 */         arrayOfObject2[paramInt3] = object2;
/* 259 */         if (this.a++ >= this.i) b(this.d << 1);
/*     */         
/*     */         return;
/*     */       } 
/* 263 */       if (++b == j)
/*     */         break; 
/* 265 */       paramObject1 = object1;
/* 266 */       paramObject2 = object2;
/*     */     } 
/*     */     
/* 269 */     d(object1, object2);
/*     */   }
/*     */   
/*     */   private void d(Object paramObject1, Object paramObject2) {
/* 273 */     if (this.e == this.j) {
/*     */       
/* 275 */       b(this.d << 1);
/* 276 */       b(paramObject1, paramObject2);
/*     */       
/*     */       return;
/*     */     } 
/* 280 */     int i = this.d + this.e;
/* 281 */     this.b[i] = paramObject1;
/* 282 */     this.c[i] = paramObject2;
/* 283 */     this.e++;
/* 284 */     this.a++;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object a(Object paramObject) {
/* 289 */     int i = paramObject.hashCode();
/* 290 */     int j = i & this.h;
/* 291 */     if (!paramObject.equals(this.b[j])) {
/* 292 */       j = c(i);
/* 293 */       if (!paramObject.equals(this.b[j])) {
/* 294 */         j = d(i);
/* 295 */         if (!paramObject.equals(this.b[j])) return e(paramObject, null); 
/*     */       } 
/*     */     } 
/* 298 */     return this.c[j];
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
/*     */   private Object e(Object paramObject1, Object paramObject2) {
/* 316 */     Object[] arrayOfObject = this.b;
/* 317 */     for (int i = this.d, j = i + this.e; i < j; i++) {
/* 318 */       if (paramObject1.equals(arrayOfObject[i])) return this.c[i]; 
/* 319 */     }  return paramObject2;
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
/*     */   void a(int paramInt) {
/* 369 */     this.e--;
/* 370 */     int i = this.d + this.e;
/* 371 */     if (paramInt < i) {
/* 372 */       this.b[paramInt] = this.b[i];
/* 373 */       this.c[paramInt] = this.c[i];
/* 374 */       this.c[i] = null;
/*     */     } else {
/* 376 */       this.c[paramInt] = null;
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
/*     */   public boolean b(Object paramObject) {
/* 437 */     int i = paramObject.hashCode();
/* 438 */     int j = i & this.h;
/* 439 */     if (!paramObject.equals(this.b[j])) {
/* 440 */       j = c(i);
/* 441 */       if (!paramObject.equals(this.b[j])) {
/* 442 */         j = d(i);
/* 443 */         if (!paramObject.equals(this.b[j])) return c(paramObject); 
/*     */       } 
/*     */     } 
/* 446 */     return true;
/*     */   }
/*     */   
/*     */   private boolean c(Object paramObject) {
/* 450 */     Object[] arrayOfObject = this.b;
/* 451 */     for (int i = this.d, j = i + this.e; i < j; i++) {
/* 452 */       if (paramObject.equals(arrayOfObject[i])) return true; 
/* 453 */     }  return false;
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
/*     */   private void b(int paramInt) {
/* 484 */     int i = this.d + this.e;
/*     */     
/* 486 */     this.d = paramInt;
/* 487 */     this.i = (int)(paramInt * this.f);
/* 488 */     this.h = paramInt - 1;
/* 489 */     this.g = 31 - Integer.numberOfTrailingZeros(paramInt);
/* 490 */     this.j = Math.max(3, (int)Math.ceil(Math.log(paramInt)) * 2);
/* 491 */     this.k = Math.max(Math.min(paramInt, 8), (int)Math.sqrt(paramInt) / 8);
/*     */     
/* 493 */     Object[] arrayOfObject1 = this.b;
/* 494 */     Object[] arrayOfObject2 = this.c;
/*     */     
/* 496 */     this.b = new Object[paramInt + this.j];
/* 497 */     this.c = new Object[paramInt + this.j];
/*     */     
/* 499 */     int j = this.a;
/* 500 */     this.a = 0;
/* 501 */     this.e = 0;
/* 502 */     if (j > 0)
/* 503 */       for (byte b = 0; b < i; b++) {
/* 504 */         Object object = arrayOfObject1[b];
/* 505 */         if (object != null) c(object, arrayOfObject2[b]);
/*     */       
/*     */       }  
/*     */   }
/*     */   
/*     */   private int c(int paramInt) {
/* 511 */     paramInt *= -1262997959;
/* 512 */     return (paramInt ^ paramInt >>> this.g) & this.h;
/*     */   }
/*     */   
/*     */   private int d(int paramInt) {
/* 516 */     paramInt *= -825114047;
/* 517 */     return (paramInt ^ paramInt >>> this.g) & this.h;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 521 */     int i = 0;
/* 522 */     Object[] arrayOfObject1 = this.b;
/* 523 */     Object[] arrayOfObject2 = this.c; byte b; int j;
/* 524 */     for (b = 0, j = this.d + this.e; b < j; b++) {
/* 525 */       Object object = arrayOfObject1[b];
/* 526 */       if (object != null) {
/* 527 */         i += object.hashCode() * 31;
/*     */         
/* 529 */         Object object1 = arrayOfObject2[b];
/* 530 */         if (object1 != null) {
/* 531 */           i += object1.hashCode();
/*     */         }
/*     */       } 
/*     */     } 
/* 535 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 539 */     if (paramObject == this) return true; 
/* 540 */     if (!(paramObject instanceof o)) return false; 
/* 541 */     o o1 = (o)paramObject;
/* 542 */     if (o1.a != this.a) return false; 
/* 543 */     Object[] arrayOfObject1 = this.b;
/* 544 */     Object[] arrayOfObject2 = this.c; byte b; int i;
/* 545 */     for (b = 0, i = this.d + this.e; b < i; b++) {
/* 546 */       Object object = arrayOfObject1[b];
/* 547 */       if (object != null) {
/* 548 */         Object object1 = arrayOfObject2[b];
/* 549 */         if (object1 == null) {
/* 550 */           if (!o1.b(object) || o1.a(object) != null) {
/* 551 */             return false;
/*     */           }
/*     */         }
/* 554 */         else if (!object1.equals(o1.a(object))) {
/* 555 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 560 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 568 */     return a(", ", true);
/*     */   }
/*     */   
/*     */   private String a(String paramString, boolean paramBoolean) {
/* 572 */     if (this.a == 0) return paramBoolean ? "{}" : ""; 
/* 573 */     StringBuilder stringBuilder = new StringBuilder(32);
/* 574 */     if (paramBoolean) stringBuilder.append('{'); 
/* 575 */     Object[] arrayOfObject1 = this.b;
/* 576 */     Object[] arrayOfObject2 = this.c;
/* 577 */     int i = arrayOfObject1.length;
/* 578 */     while (i-- > 0) {
/* 579 */       Object object = arrayOfObject1[i];
/* 580 */       if (object == null)
/* 581 */         continue;  stringBuilder.append(object);
/* 582 */       stringBuilder.append('=');
/* 583 */       stringBuilder.append(arrayOfObject2[i]);
/*     */     } 
/*     */     
/* 586 */     while (i-- > 0) {
/* 587 */       Object object = arrayOfObject1[i];
/* 588 */       if (object == null)
/* 589 */         continue;  stringBuilder.append(paramString);
/* 590 */       stringBuilder.append(object);
/* 591 */       stringBuilder.append('=');
/* 592 */       stringBuilder.append(arrayOfObject2[i]);
/*     */     } 
/* 594 */     if (paramBoolean) stringBuilder.append('}'); 
/* 595 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public p a() {
/* 599 */     return b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public p b() {
/* 605 */     if (this.l == null) {
/* 606 */       this.l = new p(this);
/* 607 */       this.m = new p(this);
/*     */     } 
/* 609 */     if (!this.l.f) {
/* 610 */       this.l.c();
/* 611 */       this.l.f = true;
/* 612 */       this.m.f = false;
/* 613 */       return this.l;
/*     */     } 
/* 615 */     this.m.c();
/* 616 */     this.m.f = true;
/* 617 */     this.l.f = false;
/* 618 */     return this.m;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
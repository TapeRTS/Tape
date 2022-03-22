/*     */ package com.corrodinggames.rts.gameFramework.h;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.AbstractList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.RandomAccess;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */   extends AbstractList
/*     */   implements Serializable, Cloneable, RandomAccess
/*     */ {
/*  65 */   public static final j[] a = new j[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   transient j[] c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a(int paramInt) {
/*  85 */     if (paramInt < 0) {
/*  86 */       throw new IllegalArgumentException("capacity < 0: " + paramInt);
/*     */     }
/*  88 */     this.c = (paramInt == 0) ? a : new j[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a() {
/*  95 */     this.c = a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j[] a() {
/* 102 */     return this.c;
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
/*     */   public boolean a(j paramj) {
/* 136 */     j[] arrayOfJ = this.c;
/* 137 */     int i = this.b;
/* 138 */     if (i == arrayOfJ.length) {
/* 139 */       j[] arrayOfJ1 = new j[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 142 */       System.arraycopy(arrayOfJ, 0, arrayOfJ1, 0, i);
/* 143 */       this.c = arrayOfJ = arrayOfJ1;
/*     */     } 
/* 145 */     arrayOfJ[i] = paramj;
/* 146 */     this.b = i + 1;
/* 147 */     this.modCount++;
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(j paramj) {
/* 154 */     j[] arrayOfJ = this.c;
/* 155 */     int i = this.b;
/* 156 */     if (i == arrayOfJ.length) {
/* 157 */       j[] arrayOfJ1 = new j[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 160 */       System.arraycopy(arrayOfJ, 0, arrayOfJ1, 0, i);
/* 161 */       this.c = arrayOfJ = arrayOfJ1;
/*     */     } 
/* 163 */     arrayOfJ[i] = paramj;
/* 164 */     this.b = i + 1;
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
/*     */   public void a(int paramInt, j paramj) {
/* 182 */     j[] arrayOfJ = this.c;
/* 183 */     int i = this.b;
/* 184 */     if (paramInt > i || paramInt < 0) {
/* 185 */       a(paramInt, i);
/*     */     }
/*     */     
/* 188 */     if (i < arrayOfJ.length) {
/* 189 */       System.arraycopy(arrayOfJ, paramInt, arrayOfJ, paramInt + 1, i - paramInt);
/*     */     } else {
/*     */       
/* 192 */       j[] arrayOfJ1 = new j[c(i)];
/* 193 */       System.arraycopy(arrayOfJ, 0, arrayOfJ1, 0, paramInt);
/* 194 */       System.arraycopy(arrayOfJ, paramInt, arrayOfJ1, paramInt + 1, i - paramInt);
/* 195 */       this.c = arrayOfJ = arrayOfJ1;
/*     */     } 
/* 197 */     arrayOfJ[paramInt] = paramj;
/* 198 */     this.b = i + 1;
/* 199 */     this.modCount++;
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
/*     */   private static int c(int paramInt) {
/* 212 */     byte b = (paramInt < 6) ? 12 : (paramInt >> 1);
/*     */     
/* 214 */     return paramInt + b;
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
/*     */   public boolean addAll(Collection paramCollection) {
/* 226 */     j[] arrayOfJ1 = (j[])paramCollection.toArray();
/* 227 */     int i = arrayOfJ1.length;
/* 228 */     if (i == 0) {
/* 229 */       return false;
/*     */     }
/* 231 */     j[] arrayOfJ2 = this.c;
/* 232 */     int k = this.b;
/* 233 */     int m = k + i;
/* 234 */     if (m > arrayOfJ2.length) {
/* 235 */       int n = c(m - 1);
/* 236 */       j[] arrayOfJ = new j[n];
/* 237 */       System.arraycopy(arrayOfJ2, 0, arrayOfJ, 0, k);
/* 238 */       this.c = arrayOfJ2 = arrayOfJ;
/*     */     } 
/* 240 */     System.arraycopy(arrayOfJ1, 0, arrayOfJ2, k, i);
/* 241 */     this.b = m;
/* 242 */     this.modCount++;
/* 243 */     return true;
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
/*     */   public boolean addAll(int paramInt, Collection paramCollection) {
/* 262 */     int i = this.b;
/* 263 */     if (paramInt > i || paramInt < 0) {
/* 264 */       a(paramInt, i);
/*     */     }
/* 266 */     j[] arrayOfJ1 = (j[])paramCollection.toArray();
/* 267 */     int k = arrayOfJ1.length;
/* 268 */     if (k == 0) {
/* 269 */       return false;
/*     */     }
/* 271 */     j[] arrayOfJ2 = this.c;
/* 272 */     int m = i + k;
/* 273 */     if (m <= arrayOfJ2.length) {
/* 274 */       System.arraycopy(arrayOfJ2, paramInt, arrayOfJ2, paramInt + k, i - paramInt);
/*     */     } else {
/* 276 */       int n = c(m - 1);
/* 277 */       j[] arrayOfJ = new j[n];
/* 278 */       System.arraycopy(arrayOfJ2, 0, arrayOfJ, 0, paramInt);
/* 279 */       System.arraycopy(arrayOfJ2, paramInt, arrayOfJ, paramInt + k, i - paramInt);
/* 280 */       this.c = arrayOfJ2 = arrayOfJ;
/*     */     } 
/* 282 */     System.arraycopy(arrayOfJ1, 0, arrayOfJ2, paramInt, k);
/* 283 */     this.b = m;
/* 284 */     this.modCount++;
/* 285 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IndexOutOfBoundsException a(int paramInt1, int paramInt2) {
/* 293 */     throw new IndexOutOfBoundsException("Invalid index " + paramInt1 + ", size is " + paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 303 */     if (this.b != 0) {
/* 304 */       Arrays.fill((Object[])this.c, 0, this.b, (Object)null);
/* 305 */       this.b = 0;
/* 306 */       this.modCount++;
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
/*     */   public Object clone() {
/*     */     try {
/* 319 */       a a1 = (a)super.clone();
/* 320 */       a1.c = (j[])this.c.clone();
/* 321 */       return a1;
/* 322 */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/* 323 */       throw new AssertionError();
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
/*     */   public j a(int paramInt) {
/* 345 */     if (paramInt >= this.b) {
/* 346 */       a(paramInt, this.b);
/*     */     }
/* 348 */     return this.c[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int size() {
/* 357 */     return this.b;
/*     */   }
/*     */   
/*     */   public final boolean isEmpty() {
/* 361 */     return (this.b == 0);
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
/*     */   public boolean contains(Object paramObject) {
/* 373 */     j[] arrayOfJ = this.c;
/* 374 */     int i = this.b;
/* 375 */     if (paramObject != null) {
/* 376 */       for (byte b = 0; b < i; b++) {
/* 377 */         if (paramObject.equals(arrayOfJ[b])) {
/* 378 */           return true;
/*     */         }
/*     */       } 
/*     */     } else {
/* 382 */       for (byte b = 0; b < i; b++) {
/* 383 */         if (arrayOfJ[b] == null) {
/* 384 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 388 */     return false;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 392 */     j[] arrayOfJ = this.c;
/* 393 */     int i = this.b;
/* 394 */     if (paramObject != null) {
/* 395 */       for (byte b = 0; b < i; b++) {
/* 396 */         if (paramObject.equals(arrayOfJ[b])) {
/* 397 */           return b;
/*     */         }
/*     */       } 
/*     */     } else {
/* 401 */       for (byte b = 0; b < i; b++) {
/* 402 */         if (arrayOfJ[b] == null) {
/* 403 */           return b;
/*     */         }
/*     */       } 
/*     */     } 
/* 407 */     return -1;
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 411 */     j[] arrayOfJ = this.c;
/* 412 */     if (paramObject != null) {
/* 413 */       for (int i = this.b - 1; i >= 0; i--) {
/* 414 */         if (paramObject.equals(arrayOfJ[i])) {
/* 415 */           return i;
/*     */         }
/*     */       } 
/*     */     } else {
/* 419 */       for (int i = this.b - 1; i >= 0; i--) {
/* 420 */         if (arrayOfJ[i] == null) {
/* 421 */           return i;
/*     */         }
/*     */       } 
/*     */     } 
/* 425 */     return -1;
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
/*     */   public j b(int paramInt) {
/* 438 */     j[] arrayOfJ = this.c;
/* 439 */     int i = this.b;
/* 440 */     if (paramInt >= i) {
/* 441 */       a(paramInt, i);
/*     */     }
/* 443 */     j j1 = arrayOfJ[paramInt];
/* 444 */     System.arraycopy(arrayOfJ, paramInt + 1, arrayOfJ, paramInt, --i - paramInt);
/* 445 */     arrayOfJ[i] = null;
/* 446 */     this.b = i;
/* 447 */     this.modCount++;
/* 448 */     return j1;
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
/*     */   public j b() {
/* 470 */     j[] arrayOfJ = this.c;
/* 471 */     int i = this.b - 1;
/* 472 */     j j1 = arrayOfJ[i];
/* 473 */     arrayOfJ[i] = null;
/* 474 */     this.b = i;
/* 475 */     return j1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 481 */     j[] arrayOfJ = this.c;
/* 482 */     int i = this.b;
/* 483 */     if (paramObject != null) {
/* 484 */       for (byte b = 0; b < i; b++) {
/* 485 */         if (paramObject.equals(arrayOfJ[b])) {
/* 486 */           System.arraycopy(arrayOfJ, b + 1, arrayOfJ, b, --i - b);
/* 487 */           arrayOfJ[i] = null;
/* 488 */           this.b = i;
/* 489 */           this.modCount++;
/* 490 */           return true;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 494 */       for (byte b = 0; b < i; b++) {
/* 495 */         if (arrayOfJ[b] == null) {
/* 496 */           System.arraycopy(arrayOfJ, b + 1, arrayOfJ, b, --i - b);
/* 497 */           arrayOfJ[i] = null;
/* 498 */           this.b = i;
/* 499 */           this.modCount++;
/* 500 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 504 */     return false;
/*     */   }
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 508 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/* 511 */     j[] arrayOfJ = this.c;
/* 512 */     int i = this.b;
/* 513 */     if (paramInt1 >= i) {
/* 514 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " >= size " + this.b);
/*     */     }
/*     */     
/* 517 */     if (paramInt2 > i) {
/* 518 */       throw new IndexOutOfBoundsException("toIndex " + paramInt2 + " > size " + this.b);
/*     */     }
/*     */     
/* 521 */     if (paramInt1 > paramInt2) {
/* 522 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " > toIndex " + paramInt2);
/*     */     }
/*     */ 
/*     */     
/* 526 */     System.arraycopy(arrayOfJ, paramInt2, arrayOfJ, paramInt1, i - paramInt2);
/* 527 */     int k = paramInt2 - paramInt1;
/* 528 */     Arrays.fill((Object[])arrayOfJ, i - k, i, (Object)null);
/* 529 */     this.b = i - k;
/* 530 */     this.modCount++;
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
/*     */   public j b(int paramInt, j paramj) {
/* 546 */     j[] arrayOfJ = this.c;
/* 547 */     if (paramInt >= this.b) {
/* 548 */       a(paramInt, this.b);
/*     */     }
/* 550 */     j j1 = arrayOfJ[paramInt];
/* 551 */     arrayOfJ[paramInt] = paramj;
/* 552 */     return j1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 562 */     int i = this.b;
/* 563 */     Object[] arrayOfObject = new Object[i];
/* 564 */     System.arraycopy(this.c, 0, arrayOfObject, 0, i);
/* 565 */     return arrayOfObject;
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
/*     */   public Object[] toArray(Object[] paramArrayOfObject) {
/* 584 */     int i = this.b;
/* 585 */     if (paramArrayOfObject.length < i) {
/*     */       
/* 587 */       Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
/* 588 */       paramArrayOfObject = arrayOfObject;
/*     */     } 
/* 590 */     System.arraycopy(this.c, 0, paramArrayOfObject, 0, i);
/* 591 */     if (paramArrayOfObject.length > i) {
/* 592 */       paramArrayOfObject[i] = null;
/*     */     }
/* 594 */     return paramArrayOfObject;
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
/*     */   public Iterator iterator() {
/* 619 */     return new b(this, null);
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
/*     */   public int hashCode() {
/* 666 */     j[] arrayOfJ = this.c;
/* 667 */     int i = 1; byte b; int k;
/* 668 */     for (b = 0, k = this.b; b < k; b++) {
/* 669 */       j j1 = arrayOfJ[b];
/* 670 */       i = 31 * i + ((j1 == null) ? 0 : j1.hashCode());
/*     */     } 
/* 672 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 676 */     if (paramObject == this) {
/* 677 */       return true;
/*     */     }
/* 679 */     if (!(paramObject instanceof List)) {
/* 680 */       return false;
/*     */     }
/* 682 */     List<Object> list = (List)paramObject;
/* 683 */     int i = this.b;
/* 684 */     if (list.size() != i) {
/* 685 */       return false;
/*     */     }
/* 687 */     j[] arrayOfJ = this.c;
/* 688 */     if (list instanceof RandomAccess) {
/* 689 */       for (byte b = 0; b < i; b++) {
/* 690 */         j j1 = arrayOfJ[b];
/* 691 */         Object object = list.get(b);
/* 692 */         if ((j1 == null) ? (object != null) : !j1.equals(object)) {
/* 693 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 697 */       Iterator<Object> iterator = list.iterator();
/* 698 */       for (byte b = 0; b < i; b++) {
/* 699 */         j j1 = arrayOfJ[b];
/* 700 */         Object object = iterator.next();
/* 701 */         if ((j1 == null) ? (object != null) : !j1.equals(object)) {
/* 702 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 706 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
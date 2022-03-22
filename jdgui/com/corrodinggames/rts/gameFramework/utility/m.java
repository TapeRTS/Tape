/*     */ package com.corrodinggames.rts.gameFramework.utility;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class m
/*     */   extends AbstractList
/*     */   implements Serializable, Cloneable, RandomAccess
/*     */ {
/*     */   public int a;
/*     */   transient Object[] b;
/*     */   
/*     */   public m(int paramInt) {
/*  81 */     if (paramInt < 0) {
/*  82 */       throw new IllegalArgumentException("capacity < 0: " + paramInt);
/*     */     }
/*  84 */     this.b = (paramInt == 0) ? x.g : new Object[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public m() {
/*  91 */     this.b = x.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] a() {
/*  98 */     return this.b;
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
/*     */   public boolean add(Object paramObject) {
/* 132 */     Object[] arrayOfObject = this.b;
/* 133 */     int i = this.a;
/* 134 */     if (i == arrayOfObject.length) {
/* 135 */       Object[] arrayOfObject1 = new Object[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 138 */       System.arraycopy(arrayOfObject, 0, arrayOfObject1, 0, i);
/* 139 */       this.b = arrayOfObject = arrayOfObject1;
/*     */     } 
/* 141 */     arrayOfObject[i] = paramObject;
/* 142 */     this.a = i + 1;
/* 143 */     this.modCount++;
/* 144 */     return true;
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
/*     */   public void add(int paramInt, Object paramObject) {
/* 180 */     Object[] arrayOfObject = this.b;
/* 181 */     int i = this.a;
/* 182 */     if (paramInt > i || paramInt < 0) {
/* 183 */       a(paramInt, i);
/*     */     }
/*     */     
/* 186 */     if (i < arrayOfObject.length) {
/* 187 */       System.arraycopy(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt);
/*     */     } else {
/*     */       
/* 190 */       Object[] arrayOfObject1 = new Object[a(i)];
/* 191 */       System.arraycopy(arrayOfObject, 0, arrayOfObject1, 0, paramInt);
/* 192 */       System.arraycopy(arrayOfObject, paramInt, arrayOfObject1, paramInt + 1, i - paramInt);
/* 193 */       this.b = arrayOfObject = arrayOfObject1;
/*     */     } 
/* 195 */     arrayOfObject[paramInt] = paramObject;
/* 196 */     this.a = i + 1;
/* 197 */     this.modCount++;
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
/*     */   private static int a(int paramInt) {
/* 210 */     byte b = (paramInt < 6) ? 12 : (paramInt >> 1);
/*     */     
/* 212 */     return paramInt + b;
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
/* 224 */     Object[] arrayOfObject1 = paramCollection.toArray();
/* 225 */     int i = arrayOfObject1.length;
/* 226 */     if (i == 0) {
/* 227 */       return false;
/*     */     }
/* 229 */     Object[] arrayOfObject2 = this.b;
/* 230 */     int j = this.a;
/* 231 */     int k = j + i;
/* 232 */     if (k > arrayOfObject2.length) {
/* 233 */       int n = a(k - 1);
/* 234 */       Object[] arrayOfObject = new Object[n];
/* 235 */       System.arraycopy(arrayOfObject2, 0, arrayOfObject, 0, j);
/* 236 */       this.b = arrayOfObject2 = arrayOfObject;
/*     */     } 
/* 238 */     System.arraycopy(arrayOfObject1, 0, arrayOfObject2, j, i);
/* 239 */     this.a = k;
/* 240 */     this.modCount++;
/* 241 */     return true;
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
/* 260 */     int i = this.a;
/* 261 */     if (paramInt > i || paramInt < 0) {
/* 262 */       a(paramInt, i);
/*     */     }
/* 264 */     Object[] arrayOfObject1 = paramCollection.toArray();
/* 265 */     int j = arrayOfObject1.length;
/* 266 */     if (j == 0) {
/* 267 */       return false;
/*     */     }
/* 269 */     Object[] arrayOfObject2 = this.b;
/* 270 */     int k = i + j;
/* 271 */     if (k <= arrayOfObject2.length) {
/* 272 */       System.arraycopy(arrayOfObject2, paramInt, arrayOfObject2, paramInt + j, i - paramInt);
/*     */     } else {
/* 274 */       int n = a(k - 1);
/* 275 */       Object[] arrayOfObject = new Object[n];
/* 276 */       System.arraycopy(arrayOfObject2, 0, arrayOfObject, 0, paramInt);
/* 277 */       System.arraycopy(arrayOfObject2, paramInt, arrayOfObject, paramInt + j, i - paramInt);
/* 278 */       this.b = arrayOfObject2 = arrayOfObject;
/*     */     } 
/* 280 */     System.arraycopy(arrayOfObject1, 0, arrayOfObject2, paramInt, j);
/* 281 */     this.a = k;
/* 282 */     this.modCount++;
/* 283 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IndexOutOfBoundsException a(int paramInt1, int paramInt2) {
/* 291 */     throw new IndexOutOfBoundsException("Invalid index " + paramInt1 + ", size is " + paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 301 */     if (this.a != 0) {
/* 302 */       Arrays.fill(this.b, 0, this.a, (Object)null);
/* 303 */       this.a = 0;
/* 304 */       this.modCount++;
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
/* 317 */       m m1 = (m)super.clone();
/* 318 */       m1.b = (Object[])this.b.clone();
/* 319 */       return m1;
/* 320 */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/* 321 */       throw new AssertionError();
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
/*     */   public Object get(int paramInt) {
/* 343 */     if (paramInt >= this.a) {
/* 344 */       a(paramInt, this.a);
/*     */     }
/* 346 */     return this.b[paramInt];
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
/*     */   public int size() {
/* 362 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/* 366 */     return (this.a == 0);
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
/* 378 */     Object[] arrayOfObject = this.b;
/* 379 */     int i = this.a;
/* 380 */     if (paramObject != null) {
/* 381 */       for (byte b = 0; b < i; b++) {
/* 382 */         if (paramObject.equals(arrayOfObject[b])) {
/* 383 */           return true;
/*     */         }
/*     */       } 
/*     */     } else {
/* 387 */       for (byte b = 0; b < i; b++) {
/* 388 */         if (arrayOfObject[b] == null) {
/* 389 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 393 */     return false;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 397 */     Object[] arrayOfObject = this.b;
/* 398 */     int i = this.a;
/* 399 */     if (paramObject != null) {
/* 400 */       for (byte b = 0; b < i; b++) {
/* 401 */         if (paramObject.equals(arrayOfObject[b])) {
/* 402 */           return b;
/*     */         }
/*     */       } 
/*     */     } else {
/* 406 */       for (byte b = 0; b < i; b++) {
/* 407 */         if (arrayOfObject[b] == null) {
/* 408 */           return b;
/*     */         }
/*     */       } 
/*     */     } 
/* 412 */     return -1;
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 416 */     Object[] arrayOfObject = this.b;
/* 417 */     if (paramObject != null) {
/* 418 */       for (int i = this.a - 1; i >= 0; i--) {
/* 419 */         if (paramObject.equals(arrayOfObject[i])) {
/* 420 */           return i;
/*     */         }
/*     */       } 
/*     */     } else {
/* 424 */       for (int i = this.a - 1; i >= 0; i--) {
/* 425 */         if (arrayOfObject[i] == null) {
/* 426 */           return i;
/*     */         }
/*     */       } 
/*     */     } 
/* 430 */     return -1;
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
/*     */   public Object remove(int paramInt) {
/* 443 */     Object[] arrayOfObject = this.b;
/* 444 */     int i = this.a;
/* 445 */     if (paramInt >= i) {
/* 446 */       a(paramInt, i);
/*     */     }
/* 448 */     Object object = arrayOfObject[paramInt];
/* 449 */     System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, --i - paramInt);
/* 450 */     arrayOfObject[i] = null;
/* 451 */     this.a = i;
/* 452 */     this.modCount++;
/* 453 */     return object;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object b() {
/* 458 */     Object[] arrayOfObject = this.b;
/* 459 */     int i = this.a;
/* 460 */     int j = i - 1;
/* 461 */     if (i == 0) {
/* 462 */       a(j, i);
/*     */     }
/* 464 */     Object object = arrayOfObject[j];
/* 465 */     i--;
/* 466 */     arrayOfObject[i] = null;
/* 467 */     this.a = i;
/* 468 */     this.modCount++;
/* 469 */     return object;
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
/*     */   public boolean remove(Object paramObject) {
/* 485 */     Object[] arrayOfObject = this.b;
/* 486 */     int i = this.a;
/* 487 */     if (paramObject != null) {
/* 488 */       for (byte b = 0; b < i; b++) {
/* 489 */         if (paramObject.equals(arrayOfObject[b])) {
/* 490 */           System.arraycopy(arrayOfObject, b + 1, arrayOfObject, b, --i - b);
/* 491 */           arrayOfObject[i] = null;
/* 492 */           this.a = i;
/* 493 */           this.modCount++;
/* 494 */           return true;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 498 */       for (byte b = 0; b < i; b++) {
/* 499 */         if (arrayOfObject[b] == null) {
/* 500 */           System.arraycopy(arrayOfObject, b + 1, arrayOfObject, b, --i - b);
/* 501 */           arrayOfObject[i] = null;
/* 502 */           this.a = i;
/* 503 */           this.modCount++;
/* 504 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 508 */     return false;
/*     */   }
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 512 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/* 515 */     Object[] arrayOfObject = this.b;
/* 516 */     int i = this.a;
/* 517 */     if (paramInt1 >= i) {
/* 518 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " >= size " + this.a);
/*     */     }
/*     */     
/* 521 */     if (paramInt2 > i) {
/* 522 */       throw new IndexOutOfBoundsException("toIndex " + paramInt2 + " > size " + this.a);
/*     */     }
/*     */     
/* 525 */     if (paramInt1 > paramInt2) {
/* 526 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " > toIndex " + paramInt2);
/*     */     }
/*     */ 
/*     */     
/* 530 */     System.arraycopy(arrayOfObject, paramInt2, arrayOfObject, paramInt1, i - paramInt2);
/* 531 */     int j = paramInt2 - paramInt1;
/* 532 */     Arrays.fill(arrayOfObject, i - j, i, (Object)null);
/* 533 */     this.a = i - j;
/* 534 */     this.modCount++;
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
/*     */   public Object set(int paramInt, Object paramObject) {
/* 550 */     Object[] arrayOfObject = this.b;
/* 551 */     if (paramInt >= this.a) {
/* 552 */       a(paramInt, this.a);
/*     */     }
/* 554 */     Object object = arrayOfObject[paramInt];
/* 555 */     arrayOfObject[paramInt] = paramObject;
/* 556 */     return object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 566 */     int i = this.a;
/* 567 */     Object[] arrayOfObject = new Object[i];
/* 568 */     System.arraycopy(this.b, 0, arrayOfObject, 0, i);
/* 569 */     return arrayOfObject;
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
/* 588 */     int i = this.a;
/* 589 */     if (paramArrayOfObject.length < i) {
/*     */       
/* 591 */       Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
/* 592 */       paramArrayOfObject = arrayOfObject;
/*     */     } 
/* 594 */     System.arraycopy(this.b, 0, paramArrayOfObject, 0, i);
/* 595 */     if (paramArrayOfObject.length > i) {
/* 596 */       paramArrayOfObject[i] = null;
/*     */     }
/* 598 */     return paramArrayOfObject;
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
/* 623 */     return new n(this, null);
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
/* 670 */     Object[] arrayOfObject = this.b;
/* 671 */     int i = 1; byte b; int j;
/* 672 */     for (b = 0, j = this.a; b < j; b++) {
/* 673 */       Object object = arrayOfObject[b];
/* 674 */       i = 31 * i + ((object == null) ? 0 : object.hashCode());
/*     */     } 
/* 676 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 680 */     if (paramObject == this) {
/* 681 */       return true;
/*     */     }
/* 683 */     if (!(paramObject instanceof List)) {
/* 684 */       return false;
/*     */     }
/* 686 */     List<Object> list = (List)paramObject;
/* 687 */     int i = this.a;
/* 688 */     if (list.size() != i) {
/* 689 */       return false;
/*     */     }
/* 691 */     Object[] arrayOfObject = this.b;
/* 692 */     if (list instanceof RandomAccess) {
/* 693 */       for (byte b = 0; b < i; b++) {
/* 694 */         Object object = arrayOfObject[b];
/* 695 */         Object object1 = list.get(b);
/* 696 */         if ((object == null) ? (object1 != null) : !object.equals(object1)) {
/* 697 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 701 */       Iterator<Object> iterator = list.iterator();
/* 702 */       for (byte b = 0; b < i; b++) {
/* 703 */         Object object = arrayOfObject[b];
/* 704 */         Object object1 = iterator.next();
/* 705 */         if ((object == null) ? (object1 != null) : !object.equals(object1)) {
/* 706 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 710 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
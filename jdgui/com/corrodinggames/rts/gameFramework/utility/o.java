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
/*     */ public final class o
/*     */   extends AbstractList
/*     */   implements Serializable, Cloneable, RandomAccess
/*     */ {
/*  64 */   public m a = new m();
/*     */   
/*  66 */   public m b = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   transient Object[] d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Object paramObject) {
/*     */     r r;
/*  85 */     if (this.b.a != 0) {
/*     */       
/*  87 */       r = (r)this.b.b();
/*     */     }
/*     */     else {
/*     */       
/*  91 */       r = new r();
/*     */     } 
/*  93 */     r.a = q.a;
/*  94 */     r.b = paramObject;
/*  95 */     this.a.add(r);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Object paramObject) {
/*     */     r r;
/* 101 */     if (this.b.a != 0) {
/*     */       
/* 103 */       r = (r)this.b.b();
/*     */     }
/*     */     else {
/*     */       
/* 107 */       r = new r();
/*     */     } 
/* 109 */     r.a = q.b;
/* 110 */     r.b = paramObject;
/* 111 */     this.a.add(r);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 119 */     this.modCount++;
/*     */     
/* 121 */     if (this.a.a != 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 131 */       for (r r : this.a) {
/*     */         
/* 133 */         if (r.a == q.a) {
/*     */           
/* 135 */           add(r.b);
/*     */         }
/* 137 */         else if (r.a == q.b) {
/*     */           
/* 139 */           remove(r.b);
/*     */         }
/*     */         else {
/*     */           
/* 143 */           throw new RuntimeException("Unknown operationType:" + r.a);
/*     */         } 
/* 145 */         r.b = null;
/*     */       } 
/*     */ 
/*     */       
/* 149 */       if (this.a.size() < 100)
/*     */       {
/* 151 */         this.b.addAll(this.a);
/*     */       }
/*     */       
/* 154 */       this.a.clear();
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
/*     */   public o() {
/* 191 */     this.d = x.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] b() {
/* 198 */     return this.d;
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
/* 232 */     Object[] arrayOfObject = this.d;
/* 233 */     int i = this.c;
/* 234 */     if (i == arrayOfObject.length) {
/* 235 */       Object[] arrayOfObject1 = new Object[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 238 */       System.arraycopy(arrayOfObject, 0, arrayOfObject1, 0, i);
/* 239 */       this.d = arrayOfObject = arrayOfObject1;
/*     */     } 
/* 241 */     arrayOfObject[i] = paramObject;
/* 242 */     this.c = i + 1;
/* 243 */     this.modCount++;
/* 244 */     return true;
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
/*     */   public void add(int paramInt, Object paramObject) {
/* 261 */     Object[] arrayOfObject = this.d;
/* 262 */     int i = this.c;
/* 263 */     if (paramInt > i || paramInt < 0) {
/* 264 */       a(paramInt, i);
/*     */     }
/*     */     
/* 267 */     if (i < arrayOfObject.length) {
/* 268 */       System.arraycopy(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt);
/*     */     } else {
/*     */       
/* 271 */       Object[] arrayOfObject1 = new Object[a(i)];
/* 272 */       System.arraycopy(arrayOfObject, 0, arrayOfObject1, 0, paramInt);
/* 273 */       System.arraycopy(arrayOfObject, paramInt, arrayOfObject1, paramInt + 1, i - paramInt);
/* 274 */       this.d = arrayOfObject = arrayOfObject1;
/*     */     } 
/* 276 */     arrayOfObject[paramInt] = paramObject;
/* 277 */     this.c = i + 1;
/* 278 */     this.modCount++;
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
/* 291 */     byte b = (paramInt < 6) ? 12 : (paramInt >> 1);
/*     */     
/* 293 */     return paramInt + b;
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
/* 305 */     Object[] arrayOfObject1 = paramCollection.toArray();
/* 306 */     int i = arrayOfObject1.length;
/* 307 */     if (i == 0) {
/* 308 */       return false;
/*     */     }
/* 310 */     Object[] arrayOfObject2 = this.d;
/* 311 */     int j = this.c;
/* 312 */     int k = j + i;
/* 313 */     if (k > arrayOfObject2.length) {
/* 314 */       int n = a(k - 1);
/* 315 */       Object[] arrayOfObject = new Object[n];
/* 316 */       System.arraycopy(arrayOfObject2, 0, arrayOfObject, 0, j);
/* 317 */       this.d = arrayOfObject2 = arrayOfObject;
/*     */     } 
/* 319 */     System.arraycopy(arrayOfObject1, 0, arrayOfObject2, j, i);
/* 320 */     this.c = k;
/* 321 */     this.modCount++;
/* 322 */     return true;
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
/* 341 */     int i = this.c;
/* 342 */     if (paramInt > i || paramInt < 0) {
/* 343 */       a(paramInt, i);
/*     */     }
/* 345 */     Object[] arrayOfObject1 = paramCollection.toArray();
/* 346 */     int j = arrayOfObject1.length;
/* 347 */     if (j == 0) {
/* 348 */       return false;
/*     */     }
/* 350 */     Object[] arrayOfObject2 = this.d;
/* 351 */     int k = i + j;
/* 352 */     if (k <= arrayOfObject2.length) {
/* 353 */       System.arraycopy(arrayOfObject2, paramInt, arrayOfObject2, paramInt + j, i - paramInt);
/*     */     } else {
/* 355 */       int n = a(k - 1);
/* 356 */       Object[] arrayOfObject = new Object[n];
/* 357 */       System.arraycopy(arrayOfObject2, 0, arrayOfObject, 0, paramInt);
/* 358 */       System.arraycopy(arrayOfObject2, paramInt, arrayOfObject, paramInt + j, i - paramInt);
/* 359 */       this.d = arrayOfObject2 = arrayOfObject;
/*     */     } 
/* 361 */     System.arraycopy(arrayOfObject1, 0, arrayOfObject2, paramInt, j);
/* 362 */     this.c = k;
/* 363 */     this.modCount++;
/* 364 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IndexOutOfBoundsException a(int paramInt1, int paramInt2) {
/* 372 */     throw new IndexOutOfBoundsException("Invalid index " + paramInt1 + ", size is " + paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void clear() {
/* 383 */     this.a.clear();
/*     */     
/* 385 */     if (this.c != 0) {
/* 386 */       Arrays.fill(this.d, 0, this.c, (Object)null);
/* 387 */       this.c = 0;
/* 388 */       this.modCount++;
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
/* 401 */       o o1 = (o)super.clone();
/* 402 */       o1.d = (Object[])this.d.clone();
/* 403 */       return o1;
/* 404 */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/* 405 */       throw new AssertionError();
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
/* 427 */     if (paramInt >= this.c) {
/* 428 */       a(paramInt, this.c);
/*     */     }
/* 430 */     return this.d[paramInt];
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
/* 446 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/* 450 */     return (this.c == 0);
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
/* 462 */     Object[] arrayOfObject = this.d;
/* 463 */     int i = this.c;
/* 464 */     if (paramObject != null) {
/* 465 */       for (byte b = 0; b < i; b++) {
/* 466 */         if (paramObject.equals(arrayOfObject[b])) {
/* 467 */           return true;
/*     */         }
/*     */       } 
/*     */     } else {
/* 471 */       for (byte b = 0; b < i; b++) {
/* 472 */         if (arrayOfObject[b] == null) {
/* 473 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 477 */     return false;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 481 */     Object[] arrayOfObject = this.d;
/* 482 */     int i = this.c;
/* 483 */     if (paramObject != null) {
/* 484 */       for (byte b = 0; b < i; b++) {
/* 485 */         if (paramObject.equals(arrayOfObject[b])) {
/* 486 */           return b;
/*     */         }
/*     */       } 
/*     */     } else {
/* 490 */       for (byte b = 0; b < i; b++) {
/* 491 */         if (arrayOfObject[b] == null) {
/* 492 */           return b;
/*     */         }
/*     */       } 
/*     */     } 
/* 496 */     return -1;
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 500 */     Object[] arrayOfObject = this.d;
/* 501 */     if (paramObject != null) {
/* 502 */       for (int i = this.c - 1; i >= 0; i--) {
/* 503 */         if (paramObject.equals(arrayOfObject[i])) {
/* 504 */           return i;
/*     */         }
/*     */       } 
/*     */     } else {
/* 508 */       for (int i = this.c - 1; i >= 0; i--) {
/* 509 */         if (arrayOfObject[i] == null) {
/* 510 */           return i;
/*     */         }
/*     */       } 
/*     */     } 
/* 514 */     return -1;
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
/* 527 */     Object[] arrayOfObject = this.d;
/* 528 */     int i = this.c;
/* 529 */     if (paramInt >= i) {
/* 530 */       a(paramInt, i);
/*     */     }
/* 532 */     Object object = arrayOfObject[paramInt];
/* 533 */     System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, --i - paramInt);
/* 534 */     arrayOfObject[i] = null;
/* 535 */     this.c = i;
/* 536 */     this.modCount++;
/* 537 */     return object;
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
/*     */   public boolean remove(Object paramObject) {
/* 557 */     Object[] arrayOfObject = this.d;
/* 558 */     int i = this.c;
/* 559 */     if (paramObject != null) {
/* 560 */       for (byte b = 0; b < i; b++) {
/* 561 */         if (paramObject.equals(arrayOfObject[b])) {
/* 562 */           System.arraycopy(arrayOfObject, b + 1, arrayOfObject, b, --i - b);
/* 563 */           arrayOfObject[i] = null;
/* 564 */           this.c = i;
/* 565 */           this.modCount++;
/* 566 */           return true;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 570 */       for (byte b = 0; b < i; b++) {
/* 571 */         if (arrayOfObject[b] == null) {
/* 572 */           System.arraycopy(arrayOfObject, b + 1, arrayOfObject, b, --i - b);
/* 573 */           arrayOfObject[i] = null;
/* 574 */           this.c = i;
/* 575 */           this.modCount++;
/* 576 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 580 */     return false;
/*     */   }
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 584 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/* 587 */     Object[] arrayOfObject = this.d;
/* 588 */     int i = this.c;
/* 589 */     if (paramInt1 >= i) {
/* 590 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " >= size " + this.c);
/*     */     }
/*     */     
/* 593 */     if (paramInt2 > i) {
/* 594 */       throw new IndexOutOfBoundsException("toIndex " + paramInt2 + " > size " + this.c);
/*     */     }
/*     */     
/* 597 */     if (paramInt1 > paramInt2) {
/* 598 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " > toIndex " + paramInt2);
/*     */     }
/*     */ 
/*     */     
/* 602 */     System.arraycopy(arrayOfObject, paramInt2, arrayOfObject, paramInt1, i - paramInt2);
/* 603 */     int j = paramInt2 - paramInt1;
/* 604 */     Arrays.fill(arrayOfObject, i - j, i, (Object)null);
/* 605 */     this.c = i - j;
/* 606 */     this.modCount++;
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
/* 622 */     Object[] arrayOfObject = this.d;
/* 623 */     if (paramInt >= this.c) {
/* 624 */       a(paramInt, this.c);
/*     */     }
/* 626 */     Object object = arrayOfObject[paramInt];
/* 627 */     arrayOfObject[paramInt] = paramObject;
/* 628 */     return object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 638 */     int i = this.c;
/* 639 */     Object[] arrayOfObject = new Object[i];
/* 640 */     System.arraycopy(this.d, 0, arrayOfObject, 0, i);
/* 641 */     return arrayOfObject;
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
/* 660 */     int i = this.c;
/* 661 */     if (paramArrayOfObject.length < i) {
/*     */       
/* 663 */       Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
/* 664 */       paramArrayOfObject = arrayOfObject;
/*     */     } 
/* 666 */     System.arraycopy(this.d, 0, paramArrayOfObject, 0, i);
/* 667 */     if (paramArrayOfObject.length > i) {
/* 668 */       paramArrayOfObject[i] = null;
/*     */     }
/* 670 */     return paramArrayOfObject;
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
/* 695 */     return new p(this, null);
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
/* 742 */     Object[] arrayOfObject = this.d;
/* 743 */     int i = 1; byte b; int j;
/* 744 */     for (b = 0, j = this.c; b < j; b++) {
/* 745 */       Object object = arrayOfObject[b];
/* 746 */       i = 31 * i + ((object == null) ? 0 : object.hashCode());
/*     */     } 
/* 748 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 752 */     if (paramObject == this) {
/* 753 */       return true;
/*     */     }
/* 755 */     if (!(paramObject instanceof List)) {
/* 756 */       return false;
/*     */     }
/* 758 */     List<Object> list = (List)paramObject;
/* 759 */     int i = this.c;
/* 760 */     if (list.size() != i) {
/* 761 */       return false;
/*     */     }
/* 763 */     Object[] arrayOfObject = this.d;
/* 764 */     if (list instanceof RandomAccess) {
/* 765 */       for (byte b = 0; b < i; b++) {
/* 766 */         Object object = arrayOfObject[b];
/* 767 */         Object object1 = list.get(b);
/* 768 */         if ((object == null) ? (object1 != null) : !object.equals(object1)) {
/* 769 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 773 */       Iterator<Object> iterator = list.iterator();
/* 774 */       for (byte b = 0; b < i; b++) {
/* 775 */         Object object = arrayOfObject[b];
/* 776 */         Object object1 = iterator.next();
/* 777 */         if ((object == null) ? (object1 != null) : !object.equals(object1)) {
/* 778 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 782 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
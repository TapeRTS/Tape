/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.AbstractCollection;
/*     */ import java.util.ConcurrentModificationException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends AbstractCollection
/*     */   implements Serializable, Cloneable
/*     */ {
/*     */   private transient Object[] b;
/*     */   private transient int c;
/*     */   private transient int d;
/*     */   
/*     */   private void c() {
/* 125 */     if (!a && this.c != this.d) throw new AssertionError(); 
/* 126 */     int i = this.c;
/* 127 */     int j = this.b.length;
/* 128 */     int k = j - i;
/* 129 */     int m = j << 1;
/* 130 */     if (m < 0)
/* 131 */       throw new IllegalStateException("Sorry, deque too big"); 
/* 132 */     Object[] arrayOfObject = new Object[m];
/* 133 */     System.arraycopy(this.b, i, arrayOfObject, 0, k);
/* 134 */     System.arraycopy(this.b, 0, arrayOfObject, k, i);
/* 135 */     this.b = arrayOfObject;
/* 136 */     this.c = 0;
/* 137 */     this.d = j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object[] a(Object[] paramArrayOfObject) {
/* 148 */     if (this.c < this.d) {
/* 149 */       System.arraycopy(this.b, this.c, paramArrayOfObject, 0, size());
/* 150 */     } else if (this.c > this.d) {
/* 151 */       int i = this.b.length - this.c;
/* 152 */       System.arraycopy(this.b, this.c, paramArrayOfObject, 0, i);
/* 153 */       System.arraycopy(this.b, 0, paramArrayOfObject, i, this.d);
/*     */     } 
/* 155 */     return paramArrayOfObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g() {
/* 163 */     this.b = new Object[16];
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
/*     */   public void a(Object paramObject) {
/* 218 */     if (paramObject == null)
/* 219 */       throw new NullPointerException(); 
/* 220 */     this.b[this.d] = paramObject;
/* 221 */     if ((this.d = this.d + 1 & this.b.length - 1) == this.c) {
/* 222 */       c();
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
/*     */   public Object a() {
/* 270 */     int i = this.c;
/* 271 */     Object object = this.b[i];
/* 272 */     if (object == null)
/* 273 */       return null; 
/* 274 */     this.b[i] = null;
/* 275 */     this.c = i + 1 & this.b.length - 1;
/* 276 */     return object;
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
/*     */   public boolean b(Object paramObject) {
/* 330 */     if (paramObject == null)
/* 331 */       return false; 
/* 332 */     int i = this.b.length - 1;
/* 333 */     int j = this.c;
/*     */     Object object;
/* 335 */     while ((object = this.b[j]) != null) {
/* 336 */       if (paramObject.equals(object)) {
/* 337 */         a(j);
/* 338 */         return true;
/*     */       } 
/* 340 */       j = j + 1 & i;
/*     */     } 
/* 342 */     return false;
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
/*     */   public boolean add(Object paramObject) {
/* 385 */     a(paramObject);
/* 386 */     return true;
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
/*     */ 
/*     */ 
/*     */   
/*     */   private void d() {
/* 488 */     if (!a && this.b[this.d] != null) throw new AssertionError(); 
/* 489 */     if (a || ((this.c == this.d) ? (this.b[this.c] == null) : (this.b[this.c] != null && this.b[this.d - 1 & this.b.length - 1] != null))) {
/*     */ 
/*     */       
/* 492 */       if (!a && this.b[this.c - 1 & this.b.length - 1] != null) throw new AssertionError();
/*     */       
/*     */       return;
/*     */     } 
/*     */     throw new AssertionError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(int paramInt) {
/* 506 */     d();
/* 507 */     Object[] arrayOfObject = this.b;
/* 508 */     int i = arrayOfObject.length - 1;
/* 509 */     int j = this.c;
/* 510 */     int k = this.d;
/* 511 */     int m = paramInt - j & i;
/* 512 */     int n = k - paramInt & i;
/*     */ 
/*     */     
/* 515 */     if (m >= (k - j & i)) {
/* 516 */       throw new ConcurrentModificationException();
/*     */     }
/*     */     
/* 519 */     if (m < n) {
/* 520 */       if (j <= paramInt) {
/* 521 */         System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, m);
/*     */       } else {
/* 523 */         System.arraycopy(arrayOfObject, 0, arrayOfObject, 1, paramInt);
/* 524 */         arrayOfObject[0] = arrayOfObject[i];
/* 525 */         System.arraycopy(arrayOfObject, j, arrayOfObject, j + 1, i - j);
/*     */       } 
/* 527 */       arrayOfObject[j] = null;
/* 528 */       this.c = j + 1 & i;
/* 529 */       return false;
/*     */     } 
/* 531 */     if (paramInt < k) {
/* 532 */       System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, n);
/* 533 */       this.d = k - 1;
/*     */     } else {
/* 535 */       System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt);
/* 536 */       arrayOfObject[i] = arrayOfObject[0];
/* 537 */       System.arraycopy(arrayOfObject, 1, arrayOfObject, 0, k);
/* 538 */       this.d = k - 1 & i;
/*     */     } 
/* 540 */     return true;
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
/*     */   public int size() {
/* 552 */     return this.d - this.c & this.b.length - 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 561 */     return (this.c == this.d);
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
/*     */   public Iterator iterator() {
/* 573 */     return new h(this, null);
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
/*     */   public boolean contains(Object paramObject) {
/* 671 */     if (paramObject == null)
/* 672 */       return false; 
/* 673 */     int i = this.b.length - 1;
/* 674 */     int j = this.c;
/*     */     Object object;
/* 676 */     while ((object = this.b[j]) != null) {
/* 677 */       if (paramObject.equals(object))
/* 678 */         return true; 
/* 679 */       j = j + 1 & i;
/*     */     } 
/* 681 */     return false;
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
/*     */   public boolean remove(Object paramObject) {
/* 698 */     return b(paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 706 */     int i = this.c;
/* 707 */     int j = this.d;
/* 708 */     if (i != j) {
/* 709 */       this.c = this.d = 0;
/* 710 */       int k = i;
/* 711 */       int m = this.b.length - 1;
/*     */       do {
/* 713 */         this.b[k] = null;
/* 714 */         k = k + 1 & m;
/* 715 */       } while (k != j);
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
/*     */   public Object[] toArray() {
/* 733 */     return a(new Object[size()]);
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
/*     */   public Object[] toArray(Object[] paramArrayOfObject) {
/* 774 */     int i = size();
/* 775 */     if (paramArrayOfObject.length < i)
/* 776 */       paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject
/* 777 */           .getClass().getComponentType(), i); 
/* 778 */     a(paramArrayOfObject);
/* 779 */     if (paramArrayOfObject.length > i)
/* 780 */       paramArrayOfObject[i] = null; 
/* 781 */     return paramArrayOfObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g b() {
/*     */     try {
/* 793 */       g g1 = (g)super.clone();
/*     */ 
/*     */       
/* 796 */       g1.b = (Object[])this.b.clone();
/* 797 */       return g1;
/*     */     }
/* 799 */     catch (CloneNotSupportedException cloneNotSupportedException) {
/* 800 */       throw new AssertionError();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
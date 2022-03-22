/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
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
/*     */ public final class u
/*     */   extends AbstractList
/*     */   implements Serializable, Cloneable, RandomAccess
/*     */ {
/*  65 */   public static final af[] a = new af[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   transient af[] c = a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public af[] a() {
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
/*     */   public boolean a(af paramaf) {
/* 136 */     af[] arrayOfAf = this.c;
/* 137 */     int i = this.b;
/* 138 */     if (i == arrayOfAf.length) {
/* 139 */       af[] arrayOfAf1 = new af[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 142 */       System.arraycopy(arrayOfAf, 0, arrayOfAf1, 0, i);
/* 143 */       this.c = arrayOfAf = arrayOfAf1;
/*     */     } 
/* 145 */     arrayOfAf[i] = paramaf;
/* 146 */     this.b = i + 1;
/* 147 */     this.modCount++;
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void b(af paramaf) {
/* 153 */     af[] arrayOfAf = this.c;
/* 154 */     int i = this.b;
/* 155 */     if (i == arrayOfAf.length) {
/* 156 */       af[] arrayOfAf1 = new af[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 159 */       System.arraycopy(arrayOfAf, 0, arrayOfAf1, 0, i);
/* 160 */       this.c = arrayOfAf = arrayOfAf1;
/*     */     } 
/* 162 */     arrayOfAf[i] = paramaf;
/* 163 */     this.b = i + 1;
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
/*     */   public void a(int paramInt, af paramaf) {
/* 180 */     af[] arrayOfAf = this.c;
/* 181 */     int i = this.b;
/* 182 */     if (paramInt > i || paramInt < 0) {
/* 183 */       a(paramInt, i);
/*     */     }
/*     */     
/* 186 */     if (i < arrayOfAf.length) {
/* 187 */       System.arraycopy(arrayOfAf, paramInt, arrayOfAf, paramInt + 1, i - paramInt);
/*     */     } else {
/*     */       
/* 190 */       af[] arrayOfAf1 = new af[c(i)];
/* 191 */       System.arraycopy(arrayOfAf, 0, arrayOfAf1, 0, paramInt);
/* 192 */       System.arraycopy(arrayOfAf, paramInt, arrayOfAf1, paramInt + 1, i - paramInt);
/* 193 */       this.c = arrayOfAf = arrayOfAf1;
/*     */     } 
/* 195 */     arrayOfAf[paramInt] = paramaf;
/* 196 */     this.b = i + 1;
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
/*     */   private static int c(int paramInt) {
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
/* 224 */     af[] arrayOfAf1 = (af[])paramCollection.toArray();
/* 225 */     int i = arrayOfAf1.length;
/* 226 */     if (i == 0) {
/* 227 */       return false;
/*     */     }
/* 229 */     af[] arrayOfAf2 = this.c;
/* 230 */     int j = this.b;
/* 231 */     int k = j + i;
/* 232 */     if (k > arrayOfAf2.length) {
/* 233 */       int m = c(k - 1);
/* 234 */       af[] arrayOfAf = new af[m];
/* 235 */       System.arraycopy(arrayOfAf2, 0, arrayOfAf, 0, j);
/* 236 */       this.c = arrayOfAf2 = arrayOfAf;
/*     */     } 
/* 238 */     System.arraycopy(arrayOfAf1, 0, arrayOfAf2, j, i);
/* 239 */     this.b = k;
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
/* 260 */     int i = this.b;
/* 261 */     if (paramInt > i || paramInt < 0) {
/* 262 */       a(paramInt, i);
/*     */     }
/* 264 */     af[] arrayOfAf1 = (af[])paramCollection.toArray();
/* 265 */     int j = arrayOfAf1.length;
/* 266 */     if (j == 0) {
/* 267 */       return false;
/*     */     }
/* 269 */     af[] arrayOfAf2 = this.c;
/* 270 */     int k = i + j;
/* 271 */     if (k <= arrayOfAf2.length) {
/* 272 */       System.arraycopy(arrayOfAf2, paramInt, arrayOfAf2, paramInt + j, i - paramInt);
/*     */     } else {
/* 274 */       int m = c(k - 1);
/* 275 */       af[] arrayOfAf = new af[m];
/* 276 */       System.arraycopy(arrayOfAf2, 0, arrayOfAf, 0, paramInt);
/* 277 */       System.arraycopy(arrayOfAf2, paramInt, arrayOfAf, paramInt + j, i - paramInt);
/* 278 */       this.c = arrayOfAf2 = arrayOfAf;
/*     */     } 
/* 280 */     System.arraycopy(arrayOfAf1, 0, arrayOfAf2, paramInt, j);
/* 281 */     this.b = k;
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
/* 301 */     if (this.b != 0) {
/* 302 */       Arrays.fill((Object[])this.c, 0, this.b, (Object)null);
/* 303 */       this.b = 0;
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
/* 317 */       u u1 = (u)super.clone();
/* 318 */       u1.c = (af[])this.c.clone();
/* 319 */       return u1;
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
/*     */   public af a(int paramInt) {
/* 343 */     if (paramInt >= this.b) {
/* 344 */       a(paramInt, this.b);
/*     */     }
/* 346 */     return this.c[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int size() {
/* 355 */     return this.b;
/*     */   }
/*     */   
/*     */   public final boolean isEmpty() {
/* 359 */     return (this.b == 0);
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
/* 371 */     af[] arrayOfAf = this.c;
/* 372 */     int i = this.b;
/* 373 */     if (paramObject != null) {
/* 374 */       for (byte b = 0; b < i; b++) {
/* 375 */         if (paramObject.equals(arrayOfAf[b])) {
/* 376 */           return true;
/*     */         }
/*     */       } 
/*     */     } else {
/* 380 */       for (byte b = 0; b < i; b++) {
/* 381 */         if (arrayOfAf[b] == null) {
/* 382 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 386 */     return false;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 390 */     af[] arrayOfAf = this.c;
/* 391 */     int i = this.b;
/* 392 */     if (paramObject != null) {
/* 393 */       for (byte b = 0; b < i; b++) {
/* 394 */         if (paramObject.equals(arrayOfAf[b])) {
/* 395 */           return b;
/*     */         }
/*     */       } 
/*     */     } else {
/* 399 */       for (byte b = 0; b < i; b++) {
/* 400 */         if (arrayOfAf[b] == null) {
/* 401 */           return b;
/*     */         }
/*     */       } 
/*     */     } 
/* 405 */     return -1;
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 409 */     af[] arrayOfAf = this.c;
/* 410 */     if (paramObject != null) {
/* 411 */       for (int i = this.b - 1; i >= 0; i--) {
/* 412 */         if (paramObject.equals(arrayOfAf[i])) {
/* 413 */           return i;
/*     */         }
/*     */       } 
/*     */     } else {
/* 417 */       for (int i = this.b - 1; i >= 0; i--) {
/* 418 */         if (arrayOfAf[i] == null) {
/* 419 */           return i;
/*     */         }
/*     */       } 
/*     */     } 
/* 423 */     return -1;
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
/*     */   public af b(int paramInt) {
/* 436 */     af[] arrayOfAf = this.c;
/* 437 */     int i = this.b;
/* 438 */     if (paramInt >= i) {
/* 439 */       a(paramInt, i);
/*     */     }
/* 441 */     af af1 = arrayOfAf[paramInt];
/* 442 */     System.arraycopy(arrayOfAf, paramInt + 1, arrayOfAf, paramInt, --i - paramInt);
/* 443 */     arrayOfAf[i] = null;
/* 444 */     this.b = i;
/* 445 */     this.modCount++;
/* 446 */     return af1;
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
/* 466 */     af[] arrayOfAf = this.c;
/* 467 */     int i = this.b;
/* 468 */     if (paramObject != null) {
/* 469 */       for (byte b = 0; b < i; b++) {
/* 470 */         if (paramObject.equals(arrayOfAf[b])) {
/* 471 */           System.arraycopy(arrayOfAf, b + 1, arrayOfAf, b, --i - b);
/* 472 */           arrayOfAf[i] = null;
/* 473 */           this.b = i;
/* 474 */           this.modCount++;
/* 475 */           return true;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 479 */       for (byte b = 0; b < i; b++) {
/* 480 */         if (arrayOfAf[b] == null) {
/* 481 */           System.arraycopy(arrayOfAf, b + 1, arrayOfAf, b, --i - b);
/* 482 */           arrayOfAf[i] = null;
/* 483 */           this.b = i;
/* 484 */           this.modCount++;
/* 485 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 489 */     return false;
/*     */   }
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 493 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/* 496 */     af[] arrayOfAf = this.c;
/* 497 */     int i = this.b;
/* 498 */     if (paramInt1 >= i) {
/* 499 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " >= size " + this.b);
/*     */     }
/*     */     
/* 502 */     if (paramInt2 > i) {
/* 503 */       throw new IndexOutOfBoundsException("toIndex " + paramInt2 + " > size " + this.b);
/*     */     }
/*     */     
/* 506 */     if (paramInt1 > paramInt2) {
/* 507 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " > toIndex " + paramInt2);
/*     */     }
/*     */ 
/*     */     
/* 511 */     System.arraycopy(arrayOfAf, paramInt2, arrayOfAf, paramInt1, i - paramInt2);
/* 512 */     int j = paramInt2 - paramInt1;
/* 513 */     Arrays.fill((Object[])arrayOfAf, i - j, i, (Object)null);
/* 514 */     this.b = i - j;
/* 515 */     this.modCount++;
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
/*     */   public af b(int paramInt, af paramaf) {
/* 531 */     af[] arrayOfAf = this.c;
/* 532 */     if (paramInt >= this.b) {
/* 533 */       a(paramInt, this.b);
/*     */     }
/* 535 */     af af1 = arrayOfAf[paramInt];
/* 536 */     arrayOfAf[paramInt] = paramaf;
/* 537 */     return af1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 547 */     int i = this.b;
/* 548 */     Object[] arrayOfObject = new Object[i];
/* 549 */     System.arraycopy(this.c, 0, arrayOfObject, 0, i);
/* 550 */     return arrayOfObject;
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
/* 569 */     int i = this.b;
/* 570 */     if (paramArrayOfObject.length < i) {
/*     */       
/* 572 */       Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
/* 573 */       paramArrayOfObject = arrayOfObject;
/*     */     } 
/* 575 */     System.arraycopy(this.c, 0, paramArrayOfObject, 0, i);
/* 576 */     if (paramArrayOfObject.length > i) {
/* 577 */       paramArrayOfObject[i] = null;
/*     */     }
/* 579 */     return paramArrayOfObject;
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
/* 604 */     return new v(this, null);
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
/* 651 */     af[] arrayOfAf = this.c;
/* 652 */     int i = 1; byte b; int j;
/* 653 */     for (b = 0, j = this.b; b < j; b++) {
/* 654 */       af af1 = arrayOfAf[b];
/* 655 */       i = 31 * i + ((af1 == null) ? 0 : af1.hashCode());
/*     */     } 
/* 657 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 661 */     if (paramObject == this) {
/* 662 */       return true;
/*     */     }
/* 664 */     if (!(paramObject instanceof List)) {
/* 665 */       return false;
/*     */     }
/* 667 */     List<Object> list = (List)paramObject;
/* 668 */     int i = this.b;
/* 669 */     if (list.size() != i) {
/* 670 */       return false;
/*     */     }
/* 672 */     af[] arrayOfAf = this.c;
/* 673 */     if (list instanceof RandomAccess) {
/* 674 */       for (byte b = 0; b < i; b++) {
/* 675 */         af af1 = arrayOfAf[b];
/* 676 */         Object object = list.get(b);
/* 677 */         if ((af1 == null) ? (object != null) : !af1.equals(object)) {
/* 678 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 682 */       Iterator<Object> iterator = list.iterator();
/* 683 */       for (byte b = 0; b < i; b++) {
/* 684 */         af af1 = arrayOfAf[b];
/* 685 */         Object object = iterator.next();
/* 686 */         if ((af1 == null) ? (object != null) : !af1.equals(object)) {
/* 687 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 691 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utilit\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.w;
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
/*     */ public final class s
/*     */   extends AbstractList
/*     */   implements Serializable, Cloneable, RandomAccess
/*     */ {
/*  66 */   public static final w[] a = new w[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   transient w[] c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public s(String paramString) {
/* 101 */     this.c = a;
/* 102 */     this.d = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public w[] a() {
/* 109 */     return this.c;
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
/*     */   public boolean a(w paramw) {
/* 143 */     w[] arrayOfW = this.c;
/* 144 */     int i = this.b;
/* 145 */     if (i == arrayOfW.length) {
/* 146 */       w[] arrayOfW1 = new w[i + ((i < 6) ? 12 : (i >> 1))];
/*     */ 
/*     */       
/* 149 */       System.arraycopy(arrayOfW, 0, arrayOfW1, 0, i);
/* 150 */       this.c = arrayOfW = arrayOfW1;
/*     */     } 
/* 152 */     arrayOfW[i] = paramw;
/* 153 */     this.b = i + 1;
/* 154 */     this.modCount++;
/* 155 */     return true;
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
/*     */   public void a(int paramInt, w paramw) {
/* 172 */     w[] arrayOfW = this.c;
/* 173 */     int i = this.b;
/* 174 */     if (paramInt > i || paramInt < 0) {
/* 175 */       a(paramInt, i);
/*     */     }
/*     */     
/* 178 */     if (i < arrayOfW.length) {
/* 179 */       System.arraycopy(arrayOfW, paramInt, arrayOfW, paramInt + 1, i - paramInt);
/*     */     } else {
/*     */       
/* 182 */       w[] arrayOfW1 = new w[c(i)];
/* 183 */       System.arraycopy(arrayOfW, 0, arrayOfW1, 0, paramInt);
/* 184 */       System.arraycopy(arrayOfW, paramInt, arrayOfW1, paramInt + 1, i - paramInt);
/* 185 */       this.c = arrayOfW = arrayOfW1;
/*     */     } 
/* 187 */     arrayOfW[paramInt] = paramw;
/* 188 */     this.b = i + 1;
/* 189 */     this.modCount++;
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
/* 202 */     byte b = (paramInt < 6) ? 12 : (paramInt >> 1);
/*     */     
/* 204 */     return paramInt + b;
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
/* 216 */     w[] arrayOfW1 = (w[])paramCollection.toArray();
/* 217 */     int i = arrayOfW1.length;
/* 218 */     if (i == 0) {
/* 219 */       return false;
/*     */     }
/* 221 */     w[] arrayOfW2 = this.c;
/* 222 */     int j = this.b;
/* 223 */     int k = j + i;
/* 224 */     if (k > arrayOfW2.length) {
/* 225 */       int m = c(k - 1);
/* 226 */       w[] arrayOfW = new w[m];
/* 227 */       System.arraycopy(arrayOfW2, 0, arrayOfW, 0, j);
/* 228 */       this.c = arrayOfW2 = arrayOfW;
/*     */     } 
/* 230 */     System.arraycopy(arrayOfW1, 0, arrayOfW2, j, i);
/* 231 */     this.b = k;
/* 232 */     this.modCount++;
/* 233 */     return true;
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
/* 252 */     int i = this.b;
/* 253 */     if (paramInt > i || paramInt < 0) {
/* 254 */       a(paramInt, i);
/*     */     }
/* 256 */     w[] arrayOfW1 = (w[])paramCollection.toArray();
/* 257 */     int j = arrayOfW1.length;
/* 258 */     if (j == 0) {
/* 259 */       return false;
/*     */     }
/* 261 */     w[] arrayOfW2 = this.c;
/* 262 */     int k = i + j;
/* 263 */     if (k <= arrayOfW2.length) {
/* 264 */       System.arraycopy(arrayOfW2, paramInt, arrayOfW2, paramInt + j, i - paramInt);
/*     */     } else {
/* 266 */       int m = c(k - 1);
/* 267 */       w[] arrayOfW = new w[m];
/* 268 */       System.arraycopy(arrayOfW2, 0, arrayOfW, 0, paramInt);
/* 269 */       System.arraycopy(arrayOfW2, paramInt, arrayOfW, paramInt + j, i - paramInt);
/* 270 */       this.c = arrayOfW2 = arrayOfW;
/*     */     } 
/* 272 */     System.arraycopy(arrayOfW1, 0, arrayOfW2, paramInt, j);
/* 273 */     this.b = k;
/* 274 */     this.modCount++;
/* 275 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static IndexOutOfBoundsException a(int paramInt1, int paramInt2) {
/* 283 */     throw new IndexOutOfBoundsException("Invalid index " + paramInt1 + ", size is " + paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 293 */     if (this.b != 0) {
/* 294 */       Arrays.fill((Object[])this.c, 0, this.b, (Object)null);
/* 295 */       this.b = 0;
/* 296 */       this.modCount++;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 303 */     if (this.b != 0) {
/*     */       
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
/* 319 */       s s1 = (s)super.clone();
/* 320 */       s1.c = (w[])this.c.clone();
/* 321 */       return s1;
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
/*     */   public w a(int paramInt) {
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
/*     */   public int size() {
/* 357 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
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
/* 373 */     w[] arrayOfW = this.c;
/* 374 */     int i = this.b;
/* 375 */     if (paramObject != null) {
/* 376 */       for (byte b = 0; b < i; b++) {
/* 377 */         if (paramObject.equals(arrayOfW[b])) {
/* 378 */           return true;
/*     */         }
/*     */       } 
/*     */     } else {
/* 382 */       for (byte b = 0; b < i; b++) {
/* 383 */         if (arrayOfW[b] == null) {
/* 384 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 388 */     return false;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 392 */     w[] arrayOfW = this.c;
/* 393 */     int i = this.b;
/* 394 */     if (paramObject != null) {
/* 395 */       for (byte b = 0; b < i; b++) {
/* 396 */         if (paramObject.equals(arrayOfW[b])) {
/* 397 */           return b;
/*     */         }
/*     */       } 
/*     */     } else {
/* 401 */       for (byte b = 0; b < i; b++) {
/* 402 */         if (arrayOfW[b] == null) {
/* 403 */           return b;
/*     */         }
/*     */       } 
/*     */     } 
/* 407 */     return -1;
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 411 */     w[] arrayOfW = this.c;
/* 412 */     if (paramObject != null) {
/* 413 */       for (int i = this.b - 1; i >= 0; i--) {
/* 414 */         if (paramObject.equals(arrayOfW[i])) {
/* 415 */           return i;
/*     */         }
/*     */       } 
/*     */     } else {
/* 419 */       for (int i = this.b - 1; i >= 0; i--) {
/* 420 */         if (arrayOfW[i] == null) {
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
/*     */   public w b(int paramInt) {
/* 438 */     w[] arrayOfW = this.c;
/* 439 */     int i = this.b;
/* 440 */     if (paramInt >= i) {
/* 441 */       a(paramInt, i);
/*     */     }
/* 443 */     w w1 = arrayOfW[paramInt];
/* 444 */     System.arraycopy(arrayOfW, paramInt + 1, arrayOfW, paramInt, --i - paramInt);
/* 445 */     arrayOfW[i] = null;
/* 446 */     this.b = i;
/* 447 */     this.modCount++;
/* 448 */     return w1;
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
/* 468 */     w[] arrayOfW = this.c;
/* 469 */     int i = this.b;
/* 470 */     if (paramObject != null) {
/* 471 */       for (byte b = 0; b < i; b++) {
/* 472 */         if (paramObject.equals(arrayOfW[b])) {
/* 473 */           System.arraycopy(arrayOfW, b + 1, arrayOfW, b, --i - b);
/* 474 */           arrayOfW[i] = null;
/* 475 */           this.b = i;
/* 476 */           this.modCount++;
/* 477 */           return true;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 481 */       for (byte b = 0; b < i; b++) {
/* 482 */         if (arrayOfW[b] == null) {
/* 483 */           System.arraycopy(arrayOfW, b + 1, arrayOfW, b, --i - b);
/* 484 */           arrayOfW[i] = null;
/* 485 */           this.b = i;
/* 486 */           this.modCount++;
/* 487 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 491 */     return false;
/*     */   }
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 495 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/* 498 */     w[] arrayOfW = this.c;
/* 499 */     int i = this.b;
/* 500 */     if (paramInt1 >= i) {
/* 501 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " >= size " + this.b);
/*     */     }
/*     */     
/* 504 */     if (paramInt2 > i) {
/* 505 */       throw new IndexOutOfBoundsException("toIndex " + paramInt2 + " > size " + this.b);
/*     */     }
/*     */     
/* 508 */     if (paramInt1 > paramInt2) {
/* 509 */       throw new IndexOutOfBoundsException("fromIndex " + paramInt1 + " > toIndex " + paramInt2);
/*     */     }
/*     */ 
/*     */     
/* 513 */     System.arraycopy(arrayOfW, paramInt2, arrayOfW, paramInt1, i - paramInt2);
/* 514 */     int j = paramInt2 - paramInt1;
/* 515 */     Arrays.fill((Object[])arrayOfW, i - j, i, (Object)null);
/* 516 */     this.b = i - j;
/* 517 */     this.modCount++;
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
/*     */   public w b(int paramInt, w paramw) {
/* 533 */     w[] arrayOfW = this.c;
/* 534 */     if (paramInt >= this.b) {
/* 535 */       a(paramInt, this.b);
/*     */     }
/* 537 */     w w1 = arrayOfW[paramInt];
/* 538 */     arrayOfW[paramInt] = paramw;
/* 539 */     return w1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 549 */     int i = this.b;
/* 550 */     Object[] arrayOfObject = new Object[i];
/* 551 */     System.arraycopy(this.c, 0, arrayOfObject, 0, i);
/* 552 */     return arrayOfObject;
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
/* 571 */     int i = this.b;
/* 572 */     if (paramArrayOfObject.length < i) {
/*     */       
/* 574 */       Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
/* 575 */       paramArrayOfObject = arrayOfObject;
/*     */     } 
/* 577 */     System.arraycopy(this.c, 0, paramArrayOfObject, 0, i);
/* 578 */     if (paramArrayOfObject.length > i) {
/* 579 */       paramArrayOfObject[i] = null;
/*     */     }
/* 581 */     return paramArrayOfObject;
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
/* 606 */     return new t(this, null);
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
/* 653 */     w[] arrayOfW = this.c;
/* 654 */     int i = 1; byte b; int j;
/* 655 */     for (b = 0, j = this.b; b < j; b++) {
/* 656 */       w w1 = arrayOfW[b];
/* 657 */       i = 31 * i + ((w1 == null) ? 0 : w1.hashCode());
/*     */     } 
/* 659 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 663 */     if (paramObject == this) {
/* 664 */       return true;
/*     */     }
/* 666 */     if (!(paramObject instanceof List)) {
/* 667 */       return false;
/*     */     }
/* 669 */     List<Object> list = (List)paramObject;
/* 670 */     int i = this.b;
/* 671 */     if (list.size() != i) {
/* 672 */       return false;
/*     */     }
/* 674 */     w[] arrayOfW = this.c;
/* 675 */     if (list instanceof RandomAccess) {
/* 676 */       for (byte b = 0; b < i; b++) {
/* 677 */         w w1 = arrayOfW[b];
/* 678 */         Object object = list.get(b);
/* 679 */         if ((w1 == null) ? (object != null) : !w1.equals(object)) {
/* 680 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 684 */       Iterator<Object> iterator = list.iterator();
/* 685 */       for (byte b = 0; b < i; b++) {
/* 686 */         w w1 = arrayOfW[b];
/* 687 */         Object object = iterator.next();
/* 688 */         if ((w1 == null) ? (object != null) : !w1.equals(object)) {
/* 689 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 693 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
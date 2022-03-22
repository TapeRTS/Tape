/*     */ package com.corrodinggames.rts.java.audio.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */ {
/*     */   public int[] a;
/*     */   public int b;
/*     */   public boolean c;
/*     */   
/*     */   public d() {
/*  32 */     this(true, 16);
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
/*     */   public d(boolean paramBoolean, int paramInt) {
/*  44 */     this.c = paramBoolean;
/*  45 */     this.a = new int[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d(d paramd) {
/*  52 */     this.c = paramd.c;
/*  53 */     this.b = paramd.b;
/*  54 */     this.a = new int[this.b];
/*  55 */     System.arraycopy(paramd.a, 0, this.a, 0, this.b);
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
/*     */   public void a(int paramInt) {
/*  75 */     int[] arrayOfInt = this.a;
/*  76 */     if (this.b == arrayOfInt.length) arrayOfInt = d(Math.max(8, (int)(this.b * 1.75F))); 
/*  77 */     arrayOfInt[this.b++] = paramInt;
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
/*     */   public int b(int paramInt) {
/* 130 */     if (paramInt >= this.b) throw new IndexOutOfBoundsException("index can't be >= size: " + paramInt + " >= " + this.b); 
/* 131 */     return this.a[paramInt];
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
/*     */   public int c(int paramInt) {
/* 205 */     if (paramInt >= this.b) throw new IndexOutOfBoundsException("index can't be >= size: " + paramInt + " >= " + this.b); 
/* 206 */     int[] arrayOfInt = this.a;
/* 207 */     int i = arrayOfInt[paramInt];
/* 208 */     this.b--;
/* 209 */     if (this.c) {
/* 210 */       System.arraycopy(arrayOfInt, paramInt + 1, arrayOfInt, paramInt, this.b - paramInt);
/*     */     } else {
/* 212 */       arrayOfInt[paramInt] = arrayOfInt[this.b];
/* 213 */     }  return i;
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
/*     */   protected int[] d(int paramInt) {
/* 302 */     int[] arrayOfInt1 = new int[paramInt];
/* 303 */     int[] arrayOfInt2 = this.a;
/* 304 */     System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, Math.min(this.b, arrayOfInt1.length));
/* 305 */     this.a = arrayOfInt1;
/* 306 */     return arrayOfInt1;
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
/*     */   public int hashCode() {
/* 352 */     if (!this.c) return super.hashCode(); 
/* 353 */     int[] arrayOfInt = this.a;
/* 354 */     int i = 1; byte b; int j;
/* 355 */     for (b = 0, j = this.b; b < j; b++)
/* 356 */       i = i * 31 + arrayOfInt[b]; 
/* 357 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 361 */     if (paramObject == this) return true; 
/* 362 */     if (!this.c) return false; 
/* 363 */     if (!(paramObject instanceof d)) return false; 
/* 364 */     d d1 = (d)paramObject;
/* 365 */     if (!d1.c) return false; 
/* 366 */     int i = this.b;
/* 367 */     if (i != d1.b) return false; 
/* 368 */     int[] arrayOfInt1 = this.a;
/* 369 */     int[] arrayOfInt2 = d1.a;
/* 370 */     for (byte b = 0; b < i; b++) {
/* 371 */       if (this.a[b] != d1.a[b]) return false; 
/* 372 */     }  return true;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 376 */     if (this.b == 0) return "[]"; 
/* 377 */     int[] arrayOfInt = this.a;
/* 378 */     StringBuilder stringBuilder = new StringBuilder(32);
/* 379 */     stringBuilder.append('[');
/* 380 */     stringBuilder.append(arrayOfInt[0]);
/* 381 */     for (byte b = 1; b < this.b; b++) {
/* 382 */       stringBuilder.append(", ");
/* 383 */       stringBuilder.append(arrayOfInt[b]);
/*     */     } 
/* 385 */     stringBuilder.append(']');
/* 386 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
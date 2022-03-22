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
/*     */ public class b
/*     */ {
/*     */   public float[] a;
/*     */   public int b;
/*     */   public boolean c;
/*     */   
/*     */   public b() {
/*  32 */     this(true, 16);
/*     */   }
/*     */ 
/*     */   
/*     */   public b(int paramInt) {
/*  37 */     this(true, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b(boolean paramBoolean, int paramInt) {
/*  44 */     this.c = paramBoolean;
/*  45 */     this.a = new float[paramInt];
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
/*     */   public void a(float paramFloat) {
/*  75 */     float[] arrayOfFloat = this.a;
/*  76 */     if (this.b == arrayOfFloat.length) arrayOfFloat = a(Math.max(8, (int)(this.b * 1.75F))); 
/*  77 */     arrayOfFloat[this.b++] = paramFloat;
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
/*     */   public void a(int paramInt, float paramFloat) {
/* 135 */     if (paramInt >= this.b) throw new IndexOutOfBoundsException("index can't be >= size: " + paramInt + " >= " + this.b); 
/* 136 */     this.a[paramInt] = paramFloat;
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
/*     */   public void b(int paramInt, float paramFloat) {
/* 150 */     if (paramInt > this.b) throw new IndexOutOfBoundsException("index can't be > size: " + paramInt + " > " + this.b); 
/* 151 */     float[] arrayOfFloat = this.a;
/* 152 */     if (this.b == arrayOfFloat.length) arrayOfFloat = a(Math.max(8, (int)(this.b * 1.75F))); 
/* 153 */     if (this.c) {
/* 154 */       System.arraycopy(arrayOfFloat, paramInt, arrayOfFloat, paramInt + 1, this.b - paramInt);
/*     */     } else {
/* 156 */       arrayOfFloat[this.b] = arrayOfFloat[paramInt];
/* 157 */     }  this.b++;
/* 158 */     arrayOfFloat[paramInt] = paramFloat;
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
/*     */   public float a() {
/* 253 */     return this.a[--this.b];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b() {
/* 263 */     if (this.b == 0) throw new IllegalStateException("Array is empty."); 
/* 264 */     return this.a[0];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 273 */     this.b = 0;
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
/*     */   protected float[] a(int paramInt) {
/* 302 */     float[] arrayOfFloat1 = new float[paramInt];
/* 303 */     float[] arrayOfFloat2 = this.a;
/* 304 */     System.arraycopy(arrayOfFloat2, 0, arrayOfFloat1, 0, Math.min(this.b, arrayOfFloat1.length));
/* 305 */     this.a = arrayOfFloat1;
/* 306 */     return arrayOfFloat1;
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
/* 353 */     float[] arrayOfFloat = this.a;
/* 354 */     int i = 1; byte b1; int j;
/* 355 */     for (b1 = 0, j = this.b; b1 < j; b1++)
/* 356 */       i = i * 31 + Float.floatToIntBits(arrayOfFloat[b1]); 
/* 357 */     return i;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 361 */     if (paramObject == this) return true; 
/* 362 */     if (!this.c) return false; 
/* 363 */     if (!(paramObject instanceof b)) return false; 
/* 364 */     b b1 = (b)paramObject;
/* 365 */     if (!b1.c) return false; 
/* 366 */     int i = this.b;
/* 367 */     if (i != b1.b) return false; 
/* 368 */     float[] arrayOfFloat1 = this.a;
/* 369 */     float[] arrayOfFloat2 = b1.a;
/* 370 */     for (byte b2 = 0; b2 < i; b2++) {
/* 371 */       if (arrayOfFloat1[b2] != arrayOfFloat2[b2]) return false; 
/* 372 */     }  return true;
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
/*     */   public String toString() {
/* 391 */     if (this.b == 0) return "[]"; 
/* 392 */     float[] arrayOfFloat = this.a;
/* 393 */     StringBuilder stringBuilder = new StringBuilder(32);
/* 394 */     stringBuilder.append('[');
/* 395 */     stringBuilder.append(arrayOfFloat[0]);
/* 396 */     for (byte b1 = 1; b1 < this.b; b1++) {
/* 397 */       stringBuilder.append(", ");
/* 398 */       stringBuilder.append(arrayOfFloat[b1]);
/*     */     } 
/* 400 */     stringBuilder.append(']');
/* 401 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
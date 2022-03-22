/*     */ package android.util;
/*     */ 
/*     */ import com.a.a.a.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SparseArray
/*     */   implements Cloneable
/*     */ {
/*  50 */   private static final Object a = new Object();
/*     */   
/*     */   private boolean b = false;
/*     */   
/*     */   private int[] c;
/*     */   
/*     */   private Object[] d;
/*     */   
/*     */   private int e;
/*     */   
/*     */   public SparseArray() {
/*  61 */     this(10);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SparseArray(int paramInt) {
/*  72 */     if (paramInt == 0) {
/*  73 */       this.c = a.b;
/*  74 */       this.d = a.d;
/*     */     } else {
/*  76 */       paramInt = a.c(paramInt);
/*  77 */       this.c = new int[paramInt];
/*  78 */       this.d = new Object[paramInt];
/*     */     } 
/*  80 */     this.e = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SparseArray a() {
/*  86 */     SparseArray sparseArray = null;
/*     */     try {
/*  88 */       sparseArray = (SparseArray)super.clone();
/*  89 */       sparseArray.c = (int[])this.c.clone();
/*  90 */       sparseArray.d = (Object[])this.d.clone();
/*  91 */     } catch (CloneNotSupportedException cloneNotSupportedException) {}
/*     */ 
/*     */     
/*  94 */     return sparseArray;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object a(int paramInt) {
/* 102 */     return a(paramInt, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object a(int paramInt, Object paramObject) {
/* 111 */     int i = a.a(this.c, this.e, paramInt);
/*     */     
/* 113 */     if (i < 0 || this.d[i] == a) {
/* 114 */       return paramObject;
/*     */     }
/* 116 */     return this.d[i];
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
/*     */   private void c() {
/* 167 */     int i = this.e;
/* 168 */     byte b1 = 0;
/* 169 */     int[] arrayOfInt = this.c;
/* 170 */     Object[] arrayOfObject = this.d;
/*     */     
/* 172 */     for (byte b2 = 0; b2 < i; b2++) {
/* 173 */       Object object = arrayOfObject[b2];
/*     */       
/* 175 */       if (object != a) {
/* 176 */         if (b2 != b1) {
/* 177 */           arrayOfInt[b1] = arrayOfInt[b2];
/* 178 */           arrayOfObject[b1] = object;
/* 179 */           arrayOfObject[b2] = null;
/*     */         } 
/*     */         
/* 182 */         b1++;
/*     */       } 
/*     */     } 
/*     */     
/* 186 */     this.b = false;
/* 187 */     this.e = b1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int paramInt, Object paramObject) {
/* 198 */     int i = a.a(this.c, this.e, paramInt);
/*     */     
/* 200 */     if (i >= 0) {
/* 201 */       this.d[i] = paramObject;
/*     */     } else {
/* 203 */       i ^= 0xFFFFFFFF;
/*     */       
/* 205 */       if (i < this.e && this.d[i] == a) {
/* 206 */         this.c[i] = paramInt;
/* 207 */         this.d[i] = paramObject;
/*     */         
/*     */         return;
/*     */       } 
/* 211 */       if (this.b && this.e >= this.c.length) {
/* 212 */         c();
/*     */ 
/*     */         
/* 215 */         i = a.a(this.c, this.e, paramInt) ^ 0xFFFFFFFF;
/*     */       } 
/*     */       
/* 218 */       if (this.e >= this.c.length) {
/* 219 */         int j = a.c(this.e + 1);
/*     */         
/* 221 */         int[] arrayOfInt = new int[j];
/* 222 */         Object[] arrayOfObject = new Object[j];
/*     */ 
/*     */         
/* 225 */         System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
/* 226 */         System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
/*     */         
/* 228 */         this.c = arrayOfInt;
/* 229 */         this.d = arrayOfObject;
/*     */       } 
/*     */       
/* 232 */       if (this.e - i != 0) {
/*     */         
/* 234 */         System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
/* 235 */         System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
/*     */       } 
/*     */       
/* 238 */       this.c[i] = paramInt;
/* 239 */       this.d[i] = paramObject;
/* 240 */       this.e++;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/* 249 */     if (this.b) {
/* 250 */       c();
/*     */     }
/*     */     
/* 253 */     return this.e;
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
/*     */   public int b(int paramInt) {
/* 267 */     if (this.b) {
/* 268 */       c();
/*     */     }
/*     */     
/* 271 */     return this.c[paramInt];
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
/*     */   public Object c(int paramInt) {
/* 287 */     if (this.b) {
/* 288 */       c();
/*     */     }
/*     */     
/* 291 */     return this.d[paramInt];
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
/*     */   public void c(int paramInt, Object paramObject) {
/* 362 */     if (this.e != 0 && paramInt <= this.c[this.e - 1]) {
/* 363 */       b(paramInt, paramObject);
/*     */       
/*     */       return;
/*     */     } 
/* 367 */     if (this.b && this.e >= this.c.length) {
/* 368 */       c();
/*     */     }
/*     */     
/* 371 */     int i = this.e;
/* 372 */     if (i >= this.c.length) {
/* 373 */       int j = a.c(i + 1);
/*     */       
/* 375 */       int[] arrayOfInt = new int[j];
/* 376 */       Object[] arrayOfObject = new Object[j];
/*     */ 
/*     */       
/* 379 */       System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
/* 380 */       System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
/*     */       
/* 382 */       this.c = arrayOfInt;
/* 383 */       this.d = arrayOfObject;
/*     */     } 
/*     */     
/* 386 */     this.c[i] = paramInt;
/* 387 */     this.d[i] = paramObject;
/* 388 */     this.e = i + 1;
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
/*     */   public String toString() {
/* 400 */     if (b() <= 0) {
/* 401 */       return "{}";
/*     */     }
/*     */     
/* 404 */     StringBuilder stringBuilder = new StringBuilder(this.e * 28);
/* 405 */     stringBuilder.append('{');
/* 406 */     for (byte b = 0; b < this.e; b++) {
/* 407 */       if (b > 0) {
/* 408 */         stringBuilder.append(", ");
/*     */       }
/* 410 */       int i = b(b);
/* 411 */       stringBuilder.append(i);
/* 412 */       stringBuilder.append('=');
/* 413 */       Object object = c(b);
/* 414 */       if (object != this) {
/* 415 */         stringBuilder.append(object);
/*     */       } else {
/* 417 */         stringBuilder.append("(this Map)");
/*     */       } 
/*     */     } 
/* 420 */     stringBuilder.append('}');
/* 421 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\androi\\util\SparseArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package android.graphics;
/*     */ 
/*     */ import android.util.SparseArray;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Typeface
/*     */ {
/*     */   public static final Typeface a;
/*     */   public static final Typeface b;
/*     */   public static final Typeface c;
/*     */   public static final Typeface d;
/*     */   public static final Typeface e;
/*     */   static Typeface[] f;
/*  48 */   private static final SparseArray i = new SparseArray(3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int g;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   private int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String h;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a() {
/*  70 */     return ((this.j & 0x1) != 0);
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
/*     */   public static Typeface a(String paramString, int paramInt) {
/*  91 */     Typeface typeface = new Typeface(0);
/*     */     
/*  93 */     typeface.j = paramInt;
/*  94 */     typeface.h = paramString;
/*     */     
/*  96 */     return typeface;
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
/*     */   public static Typeface a(Typeface paramTypeface, int paramInt) {
/* 111 */     int i = 0;
/* 112 */     if (paramTypeface != null) {
/*     */       
/* 114 */       if (paramTypeface.j == paramInt) {
/* 115 */         return paramTypeface;
/*     */       }
/*     */       
/* 118 */       i = paramTypeface.g;
/*     */     } 
/*     */ 
/*     */     
/* 122 */     SparseArray sparseArray = (SparseArray)i.a(i);
/*     */     
/* 124 */     if (sparseArray != null) {
/* 125 */       Typeface typeface1 = (Typeface)sparseArray.a(paramInt);
/* 126 */       if (typeface1 != null) {
/* 127 */         return typeface1;
/*     */       }
/*     */     } 
/*     */     
/* 131 */     Typeface typeface = new Typeface(0);
/* 132 */     typeface.j = paramInt;
/* 133 */     typeface.h = paramTypeface.h;
/*     */     
/* 135 */     if (sparseArray == null) {
/* 136 */       sparseArray = new SparseArray(4);
/* 137 */       i.b(i, sparseArray);
/*     */     } 
/* 139 */     sparseArray.b(paramInt, typeface);
/*     */     
/* 141 */     return typeface;
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
/*     */   private Typeface(int paramInt) {
/* 191 */     this.g = paramInt;
/* 192 */     this.j = b(paramInt);
/*     */   }
/*     */   
/*     */   static {
/* 196 */     a = a((String)null, 0);
/* 197 */     b = a((String)null, 1);
/* 198 */     c = a("sans-serif", 0);
/* 199 */     d = a("serif", 0);
/* 200 */     e = a("monospace", 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     f = new Typeface[] { a, b, a((String)null, 2), a((String)null, 3) };
/*     */   }
/*     */ 
/*     */   
/*     */   protected void finalize() {
/*     */     try {
/* 212 */       a(this.g);
/*     */     } finally {
/* 214 */       super.finalize();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 220 */     if (this == paramObject) return true; 
/* 221 */     if (paramObject == null || getClass() != paramObject.getClass()) return false;
/*     */     
/* 223 */     Typeface typeface = (Typeface)paramObject;
/*     */     
/* 225 */     return (this.j == typeface.j && this.g == typeface.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 230 */     int i = this.g;
/* 231 */     i = 31 * i + this.j;
/* 232 */     return i;
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
/*     */   private static void a(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int b(int paramInt) {
/* 253 */     return 0;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\Typeface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
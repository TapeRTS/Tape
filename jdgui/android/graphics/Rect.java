/*     */ package android.graphics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Rect
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   
/*     */   public Rect() {}
/*     */   
/*     */   public Rect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  50 */     this.a = paramInt1;
/*  51 */     this.b = paramInt2;
/*  52 */     this.c = paramInt3;
/*  53 */     this.d = paramInt4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect(Rect paramRect) {
/*  64 */     this.a = paramRect.a;
/*  65 */     this.b = paramRect.b;
/*  66 */     this.c = paramRect.c;
/*  67 */     this.d = paramRect.d;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  71 */     Rect rect = (Rect)paramObject;
/*  72 */     if (rect != null) {
/*  73 */       return (this.a == rect.a && this.b == rect.b && this.c == rect.c && this.d == rect.d);
/*     */     }
/*     */     
/*  76 */     return false;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  80 */     return "Rect(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean a() {
/*  87 */     return (this.a >= this.c || this.b >= this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int b() {
/*  95 */     return this.c - this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int c() {
/* 103 */     return this.d - this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int d() {
/* 112 */     return this.a + this.c >> 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int e() {
/* 121 */     return this.b + this.d >> 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float f() {
/* 128 */     return (this.a + this.c) * 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float g() {
/* 135 */     return (this.b + this.d) * 0.5F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void h() {
/* 142 */     this.a = this.c = this.b = this.d = 0;
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
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 156 */     this.a = paramInt1;
/* 157 */     this.b = paramInt2;
/* 158 */     this.c = paramInt3;
/* 159 */     this.d = paramInt4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Rect paramRect) {
/* 169 */     this.a = paramRect.a;
/* 170 */     this.b = paramRect.b;
/* 171 */     this.c = paramRect.c;
/* 172 */     this.d = paramRect.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/* 183 */     this.a += paramInt1;
/* 184 */     this.b += paramInt2;
/* 185 */     this.c += paramInt1;
/* 186 */     this.d += paramInt2;
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
/*     */   public boolean b(int paramInt1, int paramInt2) {
/* 231 */     return (this.a < this.c && this.b < this.d && paramInt1 >= this.a && paramInt1 < this.c && paramInt2 >= this.b && paramInt2 < this.d);
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
/*     */   public boolean b(Rect paramRect) {
/* 265 */     return (this.a < this.c && this.b < this.d && this.a <= paramRect.a && this.b <= paramRect.b && this.c >= paramRect.c && this.d >= paramRect.d);
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
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 363 */     return (this.a < paramInt3 && paramInt1 < this.c && this.b < paramInt4 && paramInt2 < this.d);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\graphics\Rect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
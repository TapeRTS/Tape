/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */ {
/*     */   public e[] a;
/*     */   private static int r;
/*     */   private static int s;
/*  16 */   public int b = r++;
/*     */   
/*  18 */   public int c = s++;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer e;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] f;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Bitmap g;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h = true;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  57 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Bitmap b() {
/*  63 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public e c() {
/*  68 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j = false;
/*     */   
/*     */   public int k;
/*     */   
/*     */   public int l;
/*     */   
/*     */   public int m;
/*     */   
/*     */   public int n;
/*     */   
/*     */   public float o;
/*     */   
/*     */   public float p;
/*     */   
/*     */   public boolean q;
/*     */ 
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  90 */     this.j = paramBoolean;
/*  91 */     d();
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
/*     */   protected void d() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 113 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Bitmap paramBitmap) {
/* 119 */     this.g = paramBitmap;
/*     */     
/* 121 */     this.k = this.g.b();
/* 122 */     this.l = this.g.c();
/*     */     
/* 124 */     f();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() {
/* 131 */     this.m = this.k / 2;
/* 132 */     this.n = this.l / 2;
/*     */     
/* 134 */     this.o = this.k / 2.0F;
/* 135 */     this.p = this.l / 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(e parame) {
/* 141 */     parame.j = this.j;
/*     */     
/* 143 */     parame.k = this.k;
/* 144 */     parame.l = this.l;
/*     */     
/* 146 */     parame.m = this.m;
/* 147 */     parame.n = this.n;
/*     */     
/* 149 */     parame.o = this.o;
/* 150 */     parame.p = this.p;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e g() {
/* 157 */     e e1 = new e();
/* 158 */     e1.j = this.j;
/*     */     
/* 160 */     if (this.g != null) {
/*     */       
/* 162 */       Bitmap bitmap = this.g.a(this.g.d(), true);
/*     */       
/* 164 */       if (bitmap == null)
/*     */       {
/* 166 */         throw new OutOfMemoryError("Failed to copy bitmap: " + this.g.d());
/*     */       }
/*     */       
/* 169 */       e1.a(bitmap);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     return e1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 181 */     e e1 = new e();
/* 182 */     e1.j = this.j;
/*     */     
/* 184 */     if (this.g != null) {
/*     */       
/* 186 */       Bitmap bitmap = Bitmap.a(paramInt1, paramInt2, this.g.d());
/* 187 */       e1.a(bitmap);
/*     */       
/* 189 */       if (paramBoolean)
/*     */       {
/* 191 */         for (byte b = 0; b < bitmap.b(); b++) {
/*     */           
/* 193 */           for (byte b1 = 0; b1 < bitmap.c(); b1++)
/*     */           {
/* 195 */             bitmap.a(b, b1, this.g.a(b, b1));
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     return e1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void h() {
/* 215 */     if (this.f == null)
/*     */     {
/* 217 */       i();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void i() {
/* 223 */     if (this.g == null)
/*     */     {
/* 225 */       if (l.aF && !l.aH) {
/*     */         return;
/*     */       }
/*     */     }
/*     */     
/* 230 */     if (this.f == null)
/*     */     {
/* 232 */       this.f = new int[this.k * this.l];
/*     */     }
/* 234 */     this.g.a(this.f, 0, this.k, 0, 0, this.k, this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 239 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/* 250 */     if (this.f != null)
/*     */     {
/* 252 */       return this.f[paramInt1 + paramInt2 * this.k];
/*     */     }
/* 254 */     return this.g.a(paramInt1, paramInt2);
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
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 266 */     if (this.f != null) {
/*     */       
/* 268 */       this.f[paramInt1 + paramInt2 * this.k] = paramInt3;
/*     */       return;
/*     */     } 
/* 271 */     this.g.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 276 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/* 281 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 291 */     if (this.g != null)
/*     */     {
/*     */ 
/*     */       
/* 295 */       this.g = null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void o() {
/* 304 */     if (this.g == null)
/*     */     {
/* 306 */       if (l.aF && !l.aG) {
/*     */         return;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 312 */     if (this.f != null) {
/*     */       
/* 314 */       this.g.b(this.f, 0, this.k, 0, 0, this.k, this.l);
/* 315 */       this.f = null;
/*     */     } 
/*     */     
/* 318 */     if (this.g != null)
/*     */     {
/* 320 */       this.g.e();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void p() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void q() {
/* 333 */     this.f = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void r() {
/* 340 */     q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void s() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public int t() {
/* 350 */     return this.k * this.l * 8;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void u() {
/* 356 */     this.a = null;
/*     */ 
/*     */     
/* 359 */     this.c = s++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void v() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void w() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void x() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean y() {
/* 388 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
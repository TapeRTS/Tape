/*     */ package com.corrodinggames.rts.gameFramework.d.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class j
/*     */ {
/*  13 */   static final PointF e = new PointF();
/*  14 */   static final RectF f = new RectF();
/*     */   
/*     */   float g;
/*     */   
/*     */   float h;
/*  19 */   float i = 50.0F;
/*  20 */   float j = 50.0F;
/*     */   
/*     */   float k;
/*     */   
/*     */   float l;
/*     */   
/*     */   float m;
/*     */   
/*     */   float n;
/*     */   
/*     */   float o;
/*     */   
/*     */   float p;
/*     */   
/*     */   float q;
/*     */   
/*     */   float r;
/*     */   
/*     */   boolean s = false;
/*     */   
/*     */   boolean t = false;
/*     */   
/*     */   boolean u;
/*     */   j v;
/*  44 */   m w = new m();
/*     */   
/*  46 */   k x = k.b;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float y;
/*     */ 
/*     */ 
/*     */   
/*     */   float z;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  61 */     return getClass().getSimpleName();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public l d() {
/*  67 */     return (l.u()).bw;
/*     */   }
/*     */ 
/*     */   
/*     */   public RectF a(RectF paramRectF, float paramFloat1, float paramFloat2) {
/*  72 */     paramRectF.a = 0.0F + paramFloat1;
/*  73 */     paramRectF.b = 0.0F + paramFloat2;
/*  74 */     paramRectF.c = 0.0F + this.i + paramFloat1;
/*  75 */     paramRectF.d = 0.0F + this.j + paramFloat2;
/*  76 */     return paramRectF;
/*     */   }
/*     */ 
/*     */   
/*     */   public RectF a(RectF paramRectF) {
/*  81 */     A.a = this.g;
/*  82 */     A.b = this.h;
/*  83 */     if (this.v != null)
/*     */     {
/*  85 */       this.v.a(A);
/*     */     }
/*     */     
/*  88 */     paramRectF.a = 0.0F + A.a;
/*  89 */     paramRectF.b = 0.0F + A.b;
/*  90 */     paramRectF.c = 0.0F + this.i + A.a;
/*  91 */     paramRectF.d = 0.0F + this.j + A.b;
/*  92 */     return paramRectF;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  97 */     for (j j1 : this.w)
/*     */     {
/*  99 */       j1.b();
/*     */     }
/*     */     
/* 102 */     this.y = 0.0F;
/* 103 */     this.z = 0.0F;
/*     */     
/* 105 */     if (this.x != k.a)
/*     */     {
/*     */ 
/*     */       
/* 109 */       if (this.x == k.b) {
/*     */ 
/*     */         
/* 112 */         float f1 = 0.0F;
/* 113 */         float f2 = 0.0F;
/*     */         
/* 115 */         for (j j1 : this.w) {
/*     */           
/* 117 */           if (j1.i > f1)
/*     */           {
/* 119 */             f1 = j1.g();
/*     */           }
/* 121 */           f2 += j1.h();
/*     */         } 
/*     */         
/* 124 */         this.y = f2;
/* 125 */         this.z = f1;
/*     */         
/* 127 */         b(this.z * 0.5F, this.y * 0.5F, this.w);
/*     */       
/*     */       }
/* 130 */       else if (this.x == k.c) {
/*     */ 
/*     */         
/* 133 */         float f1 = 0.0F;
/* 134 */         float f2 = 0.0F;
/*     */         
/* 136 */         for (j j1 : this.w) {
/*     */           
/* 138 */           if (j1.j > f1)
/*     */           {
/* 140 */             f1 = j1.h();
/*     */           }
/* 142 */           f2 += j1.g();
/*     */         } 
/*     */         
/* 145 */         this.y = f1;
/* 146 */         this.z = f2;
/*     */         
/* 148 */         a(this.z * 0.5F, this.y * 0.5F, this.w);
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 153 */         throw new RuntimeException("Unknown layout style:" + this.x);
/*     */       } 
/*     */     }
/* 156 */     this.s = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(float paramFloat1, float paramFloat2, m paramm) {
/* 161 */     float f1 = paramFloat1;
/* 162 */     float f2 = paramFloat2;
/*     */     
/* 164 */     float f3 = 0.0F;
/* 165 */     for (j j1 : paramm)
/*     */     {
/* 167 */       f3 += j1.g();
/*     */     }
/* 169 */     f1 = paramFloat1 - f3 * 0.5F;
/* 170 */     for (j j1 : paramm) {
/*     */       
/* 172 */       f1 += j1.q;
/* 173 */       j1.g = f1;
/* 174 */       f1 += j1.i;
/* 175 */       f1 += j1.r;
/* 176 */       j1.d(f2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(float paramFloat1, float paramFloat2, m paramm) {
/* 183 */     float f1 = paramFloat1;
/* 184 */     float f2 = paramFloat2;
/*     */     
/* 186 */     float f3 = 0.0F;
/* 187 */     for (j j1 : paramm)
/*     */     {
/* 189 */       f3 += j1.h();
/*     */     }
/* 191 */     f2 = paramFloat2 - f3 * 0.5F;
/* 192 */     for (j j1 : paramm) {
/*     */       
/* 194 */       f2 += j1.o;
/* 195 */       j1.h = f2;
/* 196 */       f2 += j1.j;
/* 197 */       f2 += j1.p;
/* 198 */       j1.c(f1);
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
/*     */   public void a(PointF paramPointF) {
/* 213 */     if (this.v != null)
/*     */     {
/* 215 */       this.v.a(paramPointF);
/*     */     }
/* 217 */     paramPointF.a += this.g;
/* 218 */     paramPointF.b += this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(j paramj) {
/* 223 */     paramj.b(this);
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
/*     */   public void b(j paramj) {
/* 241 */     a(paramj, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(j paramj, boolean paramBoolean) {
/* 246 */     if (this.v == paramj) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 251 */     if (this.v != null)
/*     */     {
/* 253 */       this.v.w.remove(this);
/*     */     }
/*     */     
/* 256 */     this.v = paramj;
/*     */ 
/*     */     
/* 259 */     if (paramj != null)
/*     */     {
/* 261 */       if (!paramBoolean) {
/*     */         
/* 263 */         paramj.w.add(this);
/*     */       }
/*     */       else {
/*     */         
/* 267 */         paramj.w.add(0, this);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 272 */     e();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/* 278 */     this.s = true;
/* 279 */     if (this.v != null)
/*     */     {
/* 281 */       this.v.e();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float paramFloat) {
/* 289 */     if (this.w.size() > 0)
/*     */     {
/* 291 */       for (j j1 : this.w)
/*     */       {
/* 293 */         j1.b(paramFloat);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/* 299 */   static final PointF A = new PointF();
/*     */   i B;
/*     */   
/*     */   public void f() {
/* 303 */     A.a = this.g;
/* 304 */     A.b = this.h;
/* 305 */     if (this.v != null)
/*     */     {
/* 307 */       this.v.a(A);
/*     */     }
/*     */     
/* 310 */     a(A.a, A.b);
/*     */     
/* 312 */     if (this.w.size() > 0)
/*     */     {
/* 314 */       for (j j1 : this.w)
/*     */       {
/* 316 */         j1.f();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 326 */     if (this.t) {
/*     */       
/* 328 */       l l = d();
/*     */       
/* 330 */       RectF rectF = a(new RectF(), paramFloat1, paramFloat2);
/*     */       
/* 332 */       g.d.a(l, rectF);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(i parami) {
/* 343 */     this.B = parami;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(c paramc) {
/* 349 */     if (paramc.a() && c(paramc)) {
/*     */       
/* 351 */       l.d("UI click " + a());
/*     */       
/* 353 */       if (this.B != null)
/*     */       {
/* 355 */         return this.B.a(paramc);
/*     */       }
/*     */       
/* 358 */       return false;
/*     */     } 
/*     */     
/* 361 */     if (paramc.b()) {
/*     */       
/* 363 */       if (c(paramc)) {
/*     */         
/* 365 */         this.u = true;
/*     */       }
/*     */       else {
/*     */         
/* 369 */         this.u = false;
/*     */       } 
/*     */       
/* 372 */       return false;
/*     */     } 
/*     */     
/* 375 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(c paramc) {
/* 381 */     if (this.w.size() > 0)
/*     */     {
/* 383 */       for (j j1 : this.w) {
/*     */         
/* 385 */         if (j1.b(paramc))
/*     */         {
/* 387 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 392 */     if (a(paramc))
/*     */     {
/* 394 */       return true;
/*     */     }
/*     */     
/* 397 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(c paramc) {
/* 402 */     a(f);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     return f.b(paramc.a, paramc.b);
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
/*     */   public void c(float paramFloat) {
/* 437 */     this.g = paramFloat - this.i * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(float paramFloat) {
/* 442 */     this.h = paramFloat - this.j * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(float paramFloat) {
/* 447 */     this.o = paramFloat;
/* 448 */     this.p = paramFloat;
/* 449 */     this.q = paramFloat;
/* 450 */     this.r = paramFloat;
/*     */   }
/*     */ 
/*     */   
/*     */   public void f(float paramFloat) {
/* 455 */     this.k = paramFloat;
/* 456 */     this.l = paramFloat;
/* 457 */     this.m = paramFloat;
/* 458 */     this.n = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float g() {
/* 464 */     return this.q + this.i + this.r;
/*     */   }
/*     */ 
/*     */   
/*     */   public float h() {
/* 469 */     return this.o + this.j + this.p;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i() {
/* 480 */     b((j)null);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\a\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
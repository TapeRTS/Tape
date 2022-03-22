/*     */ package com.corrodinggames.rts.game.b;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */ {
/*  19 */   int a = 0;
/*     */   
/*     */   public e b;
/*     */   
/*     */   l c;
/*     */   
/*  25 */   Paint d = new Paint();
/*     */ 
/*     */   
/*     */   int e;
/*     */ 
/*     */   
/*     */   int f;
/*     */ 
/*     */   
/*     */   int g;
/*     */ 
/*     */   
/*     */   int h;
/*     */   
/*  39 */   float i = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   h k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  68 */     l l1 = l.u();
/*  69 */     this.b = l1.bw.b(20 * this.g, 20 * this.h, this.j);
/*  70 */     this.c = l1.bw.a(this.b);
/*     */     
/*  72 */     if (this.j)
/*     */     {
/*  74 */       this.b.i = true;
/*     */     }
/*     */     
/*  77 */     if (this.k != null) this.k.a();
/*     */   
/*     */   }
/*     */   
/*     */   public void b() {
/*  82 */     this.a = 0;
/*     */     
/*  84 */     this.c.b(-16777216);
/*     */     
/*  86 */     this.c.l();
/*  87 */     this.b.q();
/*     */     
/*  89 */     if (this.k != null) this.k.b();
/*     */   
/*     */   }
/*     */   
/*     */   public int a(j paramj, int paramInt) {
/*  94 */     paramj.a(paramInt, l);
/*     */     
/*  96 */     if (this.a >= 400)
/*     */     {
/*  98 */       return -1;
/*     */     }
/*     */     
/* 101 */     boolean bool = true;
/* 102 */     if (!this.j)
/*     */     {
/* 104 */       bool = !a(paramj.a, l) ? true : false;
/*     */     }
/*     */     
/* 107 */     if (bool) {
/*     */       
/* 109 */       int i = this.a;
/* 110 */       this.a++;
/*     */       
/* 112 */       a(i, paramj.a, l);
/*     */       
/* 114 */       return i;
/*     */     } 
/* 116 */     if (this.k != null) {
/*     */       
/* 118 */       int i = this.k.a(paramj, paramInt);
/*     */       
/* 120 */       if (i != -1)
/*     */       {
/* 122 */         return i + 500;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 127 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(e parame, Rect paramRect) {
/* 133 */     int i = paramRect.a;
/* 134 */     int j = paramRect.c;
/* 135 */     int k = paramRect.b;
/* 136 */     int m = paramRect.d;
/*     */     
/* 138 */     if (i < 0) i = 0; 
/* 139 */     if (j < 0) j = 0; 
/* 140 */     if (k < 0) k = 0; 
/* 141 */     if (m < 0) m = 0;
/*     */     
/* 143 */     if (i > parame.l()) i = parame.l(); 
/* 144 */     if (j > parame.l()) j = parame.l(); 
/* 145 */     if (k > parame.k()) k = parame.k(); 
/* 146 */     if (m > parame.k()) m = parame.k();
/*     */     
/* 148 */     if (!parame.j()) {
/*     */       
/* 150 */       l.d("hasImageAlpha: Cannot get pixel data for: " + parame.a());
/* 151 */       return true;
/*     */     } 
/*     */     
/* 154 */     parame.w();
/*     */     
/* 156 */     for (int n = k; n < m; n++) {
/*     */       
/* 158 */       for (int i1 = i; i1 < j; i1++) {
/*     */         
/* 160 */         int i2 = parame.a(i1, n);
/*     */         
/* 162 */         int i3 = Color.a(i2);
/* 163 */         if (i3 != 255)
/*     */         {
/*     */           
/* 166 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 171 */     parame.x();
/*     */     
/* 173 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 179 */     this.c.m();
/*     */     
/* 181 */     if (this.k != null) this.k.c();
/*     */   
/*     */   }
/*     */   
/*     */   public void a(int paramInt, e parame, Rect paramRect) {
/* 186 */     Rect rect = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     a(paramInt, rect);
/*     */ 
/*     */     
/* 194 */     boolean bool = false;
/* 195 */     if (this.i < 1.0F)
/*     */     {
/* 197 */       bool = true;
/*     */     }
/* 199 */     this.d.a(bool);
/* 200 */     this.d.d(bool);
/* 201 */     this.d.b(bool);
/*     */     
/* 203 */     a(this.c, parame, paramRect, rect, this.d);
/*     */   }
/*     */ 
/*     */   
/* 207 */   static final Rect l = new Rect();
/*     */   
/* 209 */   static final Rect m = new Rect();
/* 210 */   static final Rect n = new Rect(); Rect o; int p;
/*     */   
/*     */   public static void a(l paraml, e parame, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/*     */     byte b;
/* 214 */     for (b = 0; b <= 3; b++) {
/*     */       
/* 216 */       a(paramRect1, m, b, 0);
/* 217 */       a(paramRect2, n, b, 1);
/* 218 */       paraml.a(parame, m, n, paramPaint);
/*     */     } 
/*     */ 
/*     */     
/* 222 */     for (b = 0; b <= 3; b++) {
/*     */       
/* 224 */       a(paramRect1, m, b, 1, -1);
/* 225 */       a(paramRect2, n, b, 1, 0);
/* 226 */       paraml.a(parame, m, n, paramPaint);
/*     */     } 
/*     */ 
/*     */     
/* 230 */     paraml.a(parame, paramRect1, paramRect2, paramPaint);
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
/*     */   public static Rect a(Rect paramRect1, Rect paramRect2, int paramInt1, int paramInt2, int paramInt3) {
/* 255 */     byte b = 0;
/*     */     
/* 257 */     if (paramInt1 == 0) {
/*     */       
/* 259 */       paramRect1.a -= b;
/* 260 */       paramRect1.c += b;
/* 261 */       paramRect2.b = paramRect1.b - paramInt2 - paramInt3;
/* 262 */       paramRect2.d = paramRect1.b - paramInt3;
/*     */     }
/* 264 */     else if (paramInt1 == 1) {
/*     */       
/* 266 */       paramRect2.a = paramRect1.c + paramInt3;
/* 267 */       paramRect2.c = paramRect1.c + paramInt2 + paramInt3;
/* 268 */       paramRect1.b -= b;
/* 269 */       paramRect1.d += b;
/*     */     }
/* 271 */     else if (paramInt1 == 2) {
/*     */       
/* 273 */       paramRect1.a -= b;
/* 274 */       paramRect1.c += b;
/* 275 */       paramRect2.b = paramRect1.d + paramInt3;
/* 276 */       paramRect2.d = paramRect1.d + paramInt2 + paramInt3;
/*     */     }
/*     */     else {
/*     */       
/* 280 */       paramRect1.a -= paramInt3;
/* 281 */       paramRect2.c = paramRect1.a - paramInt2 - paramInt3;
/* 282 */       paramRect1.b -= b;
/* 283 */       paramRect1.d += b;
/*     */     } 
/*     */     
/* 286 */     return paramRect2;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Rect a(Rect paramRect1, Rect paramRect2, int paramInt1, int paramInt2) {
/* 291 */     if (paramInt1 == 0) {
/*     */       
/* 293 */       paramRect2.a = paramRect1.c - 1 + paramInt2;
/* 294 */       paramRect1.b -= paramInt2;
/*     */     }
/* 296 */     else if (paramInt1 == 1) {
/*     */       
/* 298 */       paramRect2.a = paramRect1.c - 1 + paramInt2;
/* 299 */       paramRect2.b = paramRect1.d - 1 + paramInt2;
/*     */     }
/* 301 */     else if (paramInt1 == 2) {
/*     */       
/* 303 */       paramRect1.a -= paramInt2;
/* 304 */       paramRect2.b = paramRect1.d - 1 + paramInt2;
/*     */     }
/*     */     else {
/*     */       
/* 308 */       paramRect1.a -= paramInt2;
/* 309 */       paramRect1.b -= paramInt2;
/*     */     } 
/*     */     
/* 312 */     paramRect2.c = paramRect2.a + 1;
/* 313 */     paramRect2.d = paramRect2.b + 1;
/*     */     
/* 315 */     return paramRect2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public h(float paramFloat, boolean paramBoolean) {
/* 322 */     this.o = new Rect();
/* 323 */     this.p = -1; this.i = paramFloat; this.j = paramBoolean; this.e = (int)(20.0F * paramFloat); this.f = (int)(20.0F * paramFloat);
/*     */     this.g = this.e + 2;
/*     */     this.h = this.f + 2;
/*     */     if (!paramBoolean)
/* 327 */       this.k = new h(paramFloat, true);  } public final e a(int paramInt) { if (paramInt >= 500)
/*     */     {
/* 329 */       return this.k.a(paramInt - 500);
/*     */     }
/*     */     
/* 332 */     return this.b; }
/*     */ 
/*     */ 
/*     */   
/*     */   public final Rect b(int paramInt) {
/* 337 */     if (paramInt >= 500)
/*     */     {
/* 339 */       return this.k.b(paramInt - 500);
/*     */     }
/*     */     
/* 342 */     if (this.p == paramInt)
/*     */     {
/* 344 */       return this.o;
/*     */     }
/* 346 */     this.p = paramInt;
/*     */     
/* 348 */     a(paramInt, this.o);
/* 349 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt, Rect paramRect) {
/* 354 */     int i = paramInt % 20;
/* 355 */     int j = (int)(paramInt * 0.05F);
/*     */     
/* 357 */     int k = i * this.g + 1;
/* 358 */     int m = j * this.h + 1;
/*     */     
/* 360 */     paramRect.a = k;
/* 361 */     paramRect.b = m;
/* 362 */     paramRect.c = k + this.e;
/* 363 */     paramRect.d = m + this.f;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
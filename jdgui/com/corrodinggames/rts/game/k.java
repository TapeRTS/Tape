/*     */ package com.corrodinggames.rts.game;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class k
/*     */   extends w
/*     */ {
/*     */   int a;
/*     */   int b;
/*  41 */   int c = 50;
/*  42 */   int d = 40;
/*     */   
/*     */   l e;
/*     */   
/*     */   int f;
/*     */   
/*  48 */   int g = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   static final Rect h = new Rect();
/*  61 */   static final Rect i = new Rect();
/*     */ 
/*     */   
/*  64 */   static final Paint j = (Paint)y.b();
/*     */ 
/*     */ 
/*     */   
/*  68 */   static e k = null;
/*  69 */   static e l = null;
/*  70 */   static e m = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  75 */     l l1 = l.u();
/*     */ 
/*     */     
/*  78 */     k = l1.bw.a(R.drawable.scorch_mark, true);
/*  79 */     k.i = true;
/*     */     
/*  81 */     l = l1.bw.a(R.drawable.scorch_mark_nuke, true);
/*  82 */     l.i = true;
/*     */     
/*  84 */     m = l1.bw.a(R.drawable.blood_mark, true);
/*  85 */     m.i = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp k() {
/*  96 */     l l1 = l.u();
/*     */     
/*  98 */     R(-1);
/*     */     
/* 100 */     this.f = l1.bh;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(float paramFloat1, float paramFloat2) {
/* 106 */     a(paramFloat1, paramFloat2, l.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(float paramFloat1, float paramFloat2, l paraml) {
/* 114 */     if (!b(paramFloat1, paramFloat2, paraml)) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     k k1 = new k();
/*     */     
/* 120 */     k1.dH = paramFloat1;
/* 121 */     k1.dI = paramFloat2;
/*     */     
/* 123 */     if (paraml == l.a) {
/*     */       
/* 125 */       k1.a = 0;
/*     */ 
/*     */       
/* 128 */       k1.b = f.a(k1, 0, 3, 0);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 133 */       k1.a = 2;
/*     */     } 
/*     */     
/* 136 */     if (k1.a == 2) {
/*     */       
/* 138 */       k1.c = l.l();
/* 139 */       k1.d = l.k();
/*     */     } 
/*     */ 
/*     */     
/* 143 */     k1.e = paraml;
/*     */ 
/*     */     
/* 146 */     k1.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(r paramr, int paramInt) {
/* 155 */     if (!paramr.ct()) {
/*     */       
/* 157 */       l l1 = (paramInt == 2) ? l.b : l.a;
/*     */       
/* 159 */       if (!b(paramr.dH, paramr.dI, l1)) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 164 */       k k1 = new k();
/* 165 */       k1.a = paramInt;
/*     */       
/* 167 */       if (k1.a == 2) {
/*     */         
/* 169 */         k1.c = l.l();
/* 170 */         k1.d = l.k();
/*     */       } 
/*     */       
/* 173 */       k1.dH = paramr.dH;
/* 174 */       k1.dI = paramr.dI;
/*     */ 
/*     */       
/* 177 */       k1.e = l1;
/*     */       
/* 179 */       k1.b = f.a(k1, 0, 3, 0);
/*     */       
/* 181 */       k1.d();
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
/*     */   public static strictfp boolean b(float paramFloat1, float paramFloat2, l paraml) {
/* 194 */     byte b1 = 0;
/* 195 */     byte b2 = 0;
/*     */ 
/*     */     
/* 198 */     byte b3 = 5;
/*     */     
/* 200 */     byte b4 = 25;
/*     */     
/* 202 */     if (paraml == l.b)
/*     */     {
/* 204 */       b4 = 45;
/*     */     }
/*     */     
/* 207 */     w[] arrayOfW = w.dK.a();
/* 208 */     int i = w.dK.size();
/*     */     
/* 210 */     for (byte b5 = 0; b5 < i; b5++) {
/*     */       
/* 212 */       w w1 = arrayOfW[b5];
/*     */       
/* 214 */       if (w1 instanceof k) {
/*     */         
/* 216 */         k k1 = (k)w1;
/*     */         
/* 218 */         if (f.c(k1.dH - paramFloat1) < b4 && f.c(k1.dI - paramFloat2) < b4)
/*     */         {
/* 220 */           if (k1.e == paraml) {
/*     */             
/* 222 */             b1++;
/*     */             
/* 224 */             if (f.c(k1.dH - paramFloat1) < b3 && f.c(k1.dI - paramFloat2) < b3)
/*     */             {
/* 226 */               b2++;
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 235 */     if (b1 >= 3)
/*     */     {
/* 237 */       return false;
/*     */     }
/*     */     
/* 240 */     if (b2 >= 1)
/*     */     {
/* 242 */       return false;
/*     */     }
/*     */     
/* 245 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(l paraml) {
/* 251 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f(float paramFloat) {
/* 259 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 266 */     return true;
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
/* 277 */   static final RectF n = new RectF();
/*     */   
/*     */   public strictfp RectF c() {
/* 280 */     n.a = this.dH - this.c * 0.5F;
/* 281 */     n.c = this.dH + this.c * 0.5F;
/* 282 */     n.b = this.dI - this.d * 0.5F;
/* 283 */     n.d = this.dI + this.d * 0.5F;
/* 284 */     return n;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml, int paramInt1, int paramInt2, float paramFloat) {
/* 289 */     int i = this.b * this.c;
/* 290 */     byte b = 0;
/*     */     
/* 292 */     e e1 = null;
/*     */     
/* 294 */     int j = this.c;
/* 295 */     int m = this.d;
/*     */     
/* 297 */     if (this.a == 0) {
/*     */       
/* 299 */       e1 = k;
/*     */     }
/* 301 */     else if (this.a == 1) {
/*     */       
/* 303 */       e1 = m;
/*     */     }
/* 305 */     else if (this.a == 2) {
/*     */       
/* 307 */       e1 = l;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     Rect rect1 = h;
/* 314 */     Rect rect2 = i;
/*     */     
/* 316 */     rect2.a = i;
/* 317 */     rect2.b = b;
/* 318 */     rect2.c = i + j;
/* 319 */     rect2.d = b + m;
/*     */     
/* 321 */     int n = (int)this.dH;
/* 322 */     int i1 = (int)this.dI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 342 */     n -= paramInt1;
/* 343 */     i1 -= paramInt2;
/*     */     
/* 345 */     int i2 = j >> 1;
/* 346 */     int i3 = m >> 1;
/*     */     
/* 348 */     float f1 = (n - i2);
/* 349 */     float f2 = (i1 - i3);
/* 350 */     float f3 = (n + i2);
/* 351 */     float f4 = (i1 + i3);
/*     */     
/* 353 */     rect1.a = (int)(f1 * paramFloat);
/* 354 */     rect1.b = (int)(f2 * paramFloat);
/* 355 */     rect1.c = (int)(f3 * paramFloat);
/* 356 */     rect1.d = (int)(f4 * paramFloat);
/*     */     
/* 358 */     paraml.b(e1, rect2, rect1, j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private strictfp void d() {
/* 366 */     l l1 = l.u();
/*     */     
/* 368 */     l1.bt.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d(float paramFloat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 408 */     paramap.a(this.dH);
/* 409 */     paramap.a(this.dI);
/* 410 */     paramap.a(this.a);
/*     */ 
/*     */     
/* 413 */     paramap.a(this.b);
/*     */     
/* 415 */     paramap.a(this.c);
/* 416 */     paramap.a(this.d);
/*     */ 
/*     */     
/* 419 */     paramap.a(this.e);
/* 420 */     paramap.a(this.f);
/*     */ 
/*     */     
/* 423 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(com.corrodinggames.rts.gameFramework.g.k paramk) {
/* 432 */     this.dH = paramk.g();
/* 433 */     this.dI = paramk.g();
/* 434 */     this.a = paramk.f();
/*     */ 
/*     */     
/* 437 */     this.b = paramk.f();
/*     */     
/* 439 */     this.c = paramk.f();
/* 440 */     this.d = paramk.f();
/*     */     
/* 442 */     if (paramk.b() >= 87) {
/*     */       
/* 444 */       this.e = (l)paramk.b(l.class);
/*     */       
/* 446 */       this.f = paramk.f();
/*     */     }
/*     */     else {
/*     */       
/* 450 */       this.e = (this.a == 2) ? l.b : l.a;
/*     */       
/* 452 */       if (this.a == 2) {
/*     */         
/* 454 */         this.c = l.l();
/* 455 */         this.d = l.k();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 460 */     super.a(paramk);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
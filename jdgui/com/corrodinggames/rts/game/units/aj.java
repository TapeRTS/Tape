/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Point;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.h.e;
/*     */ import com.corrodinggames.rts.gameFramework.h.h;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class aj
/*     */ {
/*  21 */   public static final Paint a = new Paint();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  30 */   static final Point b = new Point();
/*     */ 
/*     */ 
/*     */   
/*     */   private static strictfp Point a(ah paramah, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
/*  35 */     l l = l.u();
/*  36 */     h h = l.bC;
/*  37 */     e e = h.a(paramah);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     int i = f.c(paramInt3 - paramInt1);
/*  43 */     int j = f.c(paramInt4 - paramInt2);
/*  44 */     int k = paramInt1;
/*  45 */     int m = paramInt2;
/*  46 */     int n = 1 + i + j;
/*  47 */     byte b1 = (paramInt3 > paramInt1) ? 1 : -1;
/*  48 */     byte b2 = (paramInt4 > paramInt2) ? 1 : -1;
/*  49 */     int i1 = i - j;
/*  50 */     i *= 2;
/*  51 */     j *= 2;
/*     */     
/*  53 */     int i2 = 0;
/*     */     
/*  55 */     for (; n > 0; n--) {
/*     */ 
/*     */       
/*  58 */       int i3 = k;
/*  59 */       int i4 = m;
/*     */ 
/*     */ 
/*     */       
/*  63 */       if (paramInt6 != 0) {
/*     */         
/*  65 */         int i5 = h.c(e, i3, i4);
/*  66 */         if (i5 < paramInt6) {
/*     */           
/*  68 */           b.a(i3, i4);
/*  69 */           return b;
/*     */         } 
/*     */       } 
/*     */       
/*  73 */       if (paramInt5 != 0) {
/*     */         
/*  75 */         int i5 = h.b(e, i3, i4);
/*     */         
/*  77 */         if (i5 == -1) {
/*     */           
/*  79 */           b.a(i3, i4);
/*  80 */           return b;
/*     */         } 
/*     */         
/*  83 */         if (paramInt7 > 0) {
/*     */           
/*  85 */           paramInt7--;
/*     */         }
/*     */         else {
/*     */           
/*  89 */           i2 += i5;
/*     */         } 
/*     */         
/*  92 */         if (i2 >= paramInt5)
/*     */         {
/*  94 */           b.a(i3, i4);
/*  95 */           return b;
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/* 102 */       else if (h.a(e, i3, i4)) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 107 */         b.a(i3, i4);
/* 108 */         return b;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 121 */       if (i1 > 0) {
/*     */         
/* 123 */         k += b1;
/* 124 */         i1 -= j;
/*     */       }
/* 126 */       else if (i1 < 0) {
/*     */         
/* 128 */         m += b2;
/* 129 */         i1 += i;
/*     */       }
/* 131 */       else if (i1 == 0) {
/* 132 */         k += b1;
/* 133 */         m += b2;
/* 134 */         i1 -= j;
/* 135 */         i1 += i;
/* 136 */         n--;
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     return null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(ah paramah, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3) {
/* 254 */     l l = l.u();
/*     */ 
/*     */     
/* 257 */     boolean bool = true;
/* 258 */     e e = l.bC.a(paramah);
/* 259 */     l.bC.a(e, true);
/*     */ 
/*     */     
/* 262 */     return b(paramah, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp boolean b(ah paramah, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3) {
/* 267 */     l l = l.u();
/* 268 */     b b = l.bt;
/*     */ 
/*     */ 
/*     */     
/* 272 */     b.a(paramFloat1, paramFloat2);
/* 273 */     int i = b.M;
/* 274 */     int j = b.N;
/*     */     
/* 276 */     b.a(paramFloat3, paramFloat4);
/* 277 */     int k = b.M;
/* 278 */     int m = b.N;
/*     */ 
/*     */ 
/*     */     
/* 282 */     Point point = a(paramah, i, j, k, m, paramInt1, paramInt2, paramInt3);
/*     */     
/* 284 */     return (point == null);
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
/* 354 */   static final Rect c = new Rect();
/*     */   
/* 356 */   static final PointF d = new PointF();
/* 357 */   static final PointF e = new PointF();
/*     */   
/* 359 */   static final PointF f = new PointF();
/*     */ 
/*     */   
/* 362 */   static final PointF g = new PointF();
/* 363 */   static final PointF h = new PointF();
/* 364 */   static final PointF i = new PointF();
/* 365 */   static final PointF j = new PointF();
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp PointF a(ah paramah, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 370 */     l l = l.u();
/*     */     
/* 372 */     h h = l.bC;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 377 */     c.a(paramInt1, paramInt2, paramInt1 + 1, paramInt2 + 1);
/*     */     
/* 379 */     d.a(paramFloat1, paramFloat2);
/* 380 */     e.a(paramFloat3, paramFloat4);
/*     */     
/* 382 */     f.a(e);
/*     */     
/* 384 */     byte b = -1;
/*     */     
/* 386 */     g.a(c.a, c.d);
/* 387 */     h.a(c.c, c.b);
/* 388 */     i.a(c.a, c.b);
/* 389 */     j.a(c.c, c.d);
/*     */ 
/*     */     
/* 392 */     if (d.b < e.b) {
/*     */       
/* 394 */       boolean bool = (paramBoolean || !h.a(paramah, paramInt1, paramInt2 - 1)) ? true : false;
/*     */       
/* 396 */       if (bool && f.a(d, e, i, h)) b = 3;
/*     */     
/*     */     } else {
/*     */       
/* 400 */       boolean bool = (paramBoolean || !h.a(paramah, paramInt1, paramInt2 + 1)) ? true : false;
/*     */       
/* 402 */       if (bool && f.a(d, e, g, j)) b = 1;
/*     */     
/*     */     } 
/* 405 */     if (d.a < e.a) {
/*     */       
/* 407 */       boolean bool = (paramBoolean || !h.a(paramah, paramInt1 - 1, paramInt2)) ? true : false;
/*     */       
/* 409 */       if (bool && f.a(d, e, i, g)) b = 2;
/*     */     
/*     */     } else {
/*     */       
/* 413 */       boolean bool = (paramBoolean || !h.a(paramah, paramInt1 + 1, paramInt2)) ? true : false;
/*     */       
/* 415 */       if (bool && f.a(d, e, h, j)) b = 0;
/*     */     
/*     */     } 
/*     */     
/* 419 */     if (b == -1) return null;
/*     */     
/* 421 */     if (b == 0) f.a = (paramInt1 + 1) + 0.01F; 
/* 422 */     if (b == 2) f.a = paramInt1 - 0.01F;
/*     */     
/* 424 */     if (b == 1) f.b = (paramInt2 + 1) + 0.01F; 
/* 425 */     if (b == 3) f.b = paramInt2 - 0.01F;
/*     */     
/* 427 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(r paramr, af paramaf) {
/* 437 */     if (paramaf.cp != null)
/*     */     {
/* 439 */       return false;
/*     */     }
/*     */     
/* 442 */     if (!paramr.h(paramaf))
/*     */     {
/* 444 */       return false;
/*     */     }
/*     */     
/* 447 */     if (!paramaf.d(paramr))
/*     */     {
/* 449 */       return false;
/*     */     }
/*     */     
/* 452 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean b(r paramr, af paramaf) {
/* 458 */     if (!a(paramr, paramaf))
/*     */     {
/* 460 */       return false;
/*     */     }
/*     */     
/* 463 */     if (!paramr.a_(paramaf))
/*     */     {
/* 465 */       return false;
/*     */     }
/*     */     
/* 468 */     if (!paramr.f(paramaf))
/*     */     {
/* 470 */       return false;
/*     */     }
/*     */     
/* 473 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
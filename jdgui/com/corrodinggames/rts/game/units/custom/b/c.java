/*     */ package com.corrodinggames.rts.game.units.custom.b;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.units.custom.af;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends a
/*     */ {
/*  23 */   public static final a a = new c();
/*     */ 
/*     */   
/*  26 */   static final Rect b = new Rect();
/*  27 */   static final RectF c = new RectF();
/*     */ 
/*     */   
/*  30 */   static final Paint d = new Paint();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(k paramk, float paramFloat) {
/*  97 */     l l = paramk.v;
/*     */     
/*  99 */     d[] arrayOfD = paramk.ds;
/*     */     
/* 101 */     if (arrayOfD == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 106 */     if (paramFloat != 0.0F && paramk.f > 0.3D) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 111 */     i i = paramk.cV();
/* 112 */     if (i != null && i.t) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 117 */     if (paramk.cp != null && i == null) {
/*     */       
/* 119 */       for (byte b = 0; b < arrayOfD.length; b++) {
/*     */         
/* 121 */         d d = arrayOfD[b];
/* 122 */         d.m = true;
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 127 */     l l1 = l.u();
/*     */     
/* 129 */     float f1 = paramk.bL;
/*     */     
/* 131 */     if (l.dq)
/*     */     {
/* 133 */       f1 = (paramk.cn[l.dr.e]).a;
/*     */     }
/*     */ 
/*     */     
/* 137 */     float f2 = paramk.dH - paramk.dp;
/* 138 */     float f3 = paramk.dI - paramk.dq;
/* 139 */     float f4 = f1 - paramk.dr;
/*     */     
/* 141 */     boolean bool = (f2 != 0.0F || f3 != 0.0F || f4 != 0.0F) ? true : false;
/*     */     
/* 143 */     paramk.dp = paramk.dH;
/* 144 */     paramk.dq = paramk.dI;
/* 145 */     paramk.dr = f1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     PointF pointF = paramk.n(15.0F);
/* 153 */     float f5 = pointF.a;
/* 154 */     float f6 = pointF.b;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     if (f5 != 0.0F || f6 != 0.0F) {
/*     */       
/* 161 */       float f8 = f.a(0.0F, 0.0F, f5, f6);
/* 162 */       float f9 = f.d(0.0F, 0.0F, f5, f6);
/* 163 */       f8 *= 240.0F;
/* 164 */       if (f8 > 15.0F)
/*     */       {
/* 166 */         f8 = 15.0F;
/*     */       }
/* 168 */       f5 = f.i(f9) * f8;
/* 169 */       f6 = f.h(f9) * f8;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     byte b1 = 0;
/*     */     
/* 177 */     float f7 = 0.0F;
/* 178 */     byte b2 = 0;
/*     */     byte b3;
/* 180 */     for (b3 = 0; b3 < arrayOfD.length; b3++) {
/*     */       
/* 182 */       d d = arrayOfD[b3];
/* 183 */       af af = l.am[b3];
/*     */       
/* 185 */       boolean bool1 = false;
/* 186 */       boolean bool2 = false;
/*     */       
/* 188 */       if (d.m) {
/*     */         
/* 190 */         bool1 = true;
/* 191 */         d.m = false;
/* 192 */         d.o = true;
/*     */         
/* 194 */         if (d.n)
/*     */         {
/* 196 */           bool2 = true;
/*     */         }
/*     */         
/* 199 */         d.n = false;
/*     */       } 
/*     */       
/* 202 */       if (!af.i) {
/*     */         
/* 204 */         if (bool)
/*     */         {
/* 206 */           d.b -= f2;
/* 207 */           d.c -= f3;
/* 208 */           d.o = true;
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/* 214 */       else if (bool) {
/*     */         
/* 216 */         if (f4 != 0.0F) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 223 */           f.c.a(d.b, d.c);
/* 224 */           f.a(0.0F, 0.0F, f4, f.c);
/* 225 */           d.b = f.c.a;
/* 226 */           d.c = f.c.b;
/*     */           
/* 228 */           d.i += f4;
/*     */           
/* 230 */           d.o = true;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 236 */       if (!af.m) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 241 */         if (af.P != 0.0F) {
/*     */           
/* 243 */           d.r += af.P * paramFloat;
/* 244 */           d.r %= 360.0F;
/*     */         } 
/*     */ 
/*     */         
/* 248 */         if (d.o) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 255 */           float f8 = f.i(f1);
/* 256 */           float f9 = f.h(f1);
/*     */ 
/*     */           
/* 259 */           float f10 = af.d + d.p;
/* 260 */           float f11 = af.e + d.q;
/*     */           
/* 262 */           d.f = f8 * f11 - f9 * f10;
/* 263 */           d.g = f9 * f11 + f8 * f10;
/*     */ 
/*     */           
/* 266 */           if (bool1) {
/*     */             
/* 268 */             d.b = d.f;
/* 269 */             d.c = d.g;
/* 270 */             d.i = f1 + af.f;
/*     */ 
/*     */ 
/*     */             
/* 274 */             d.o = true;
/*     */             
/* 276 */             if (bool2) {
/*     */               
/* 278 */               d.b *= 0.6F;
/* 279 */               d.c *= 0.6F;
/* 280 */               d.d = -3.0F;
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 293 */           if (!af.i) {
/*     */             
/* 295 */             d.f += f5 * af.j;
/* 296 */             d.g += f6 * af.j;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 301 */           d.h = f.a(d.b, d.c, d.f, d.g);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 311 */           if (d.h > f7) {
/*     */ 
/*     */             
/* 314 */             b2 = b3;
/* 315 */             f7 = d.h;
/*     */           } 
/*     */ 
/*     */           
/* 319 */           if (d.k)
/*     */           {
/* 321 */             if (!af.i)
/*     */             {
/* 323 */               b1++;
/*     */             }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 342 */     for (b3 = 0; b3 < arrayOfD.length; b3++) {
/*     */       
/* 344 */       d d = arrayOfD[b3];
/* 345 */       af af = l.am[b3];
/*     */ 
/*     */       
/* 348 */       if (!af.m) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 355 */         if (d.h > 90000.0F) {
/*     */           
/* 357 */           d.b = af.d;
/* 358 */           d.c = af.e;
/*     */         }
/* 360 */         else if (d.h > af.K * af.K) {
/*     */ 
/*     */           
/* 363 */           float f = f.d(d.f, d.g, d.b, d.c);
/*     */           
/* 365 */           d.b = d.f + f.i(f) * af.K;
/* 366 */           d.c = d.g + f.h(f) * af.K;
/*     */           
/* 368 */           d.k = true;
/*     */         } 
/*     */ 
/*     */         
/* 372 */         if (!d.k && d.d <= 0.1F)
/*     */         {
/*     */           
/* 375 */           if (b1 < af.H)
/*     */           {
/*     */             
/* 378 */             if (b3 == b2 || !af.I) {
/*     */               
/* 380 */               boolean bool1 = false;
/* 381 */               if (af.k)
/*     */               {
/* 383 */                 for (byte b = 0; b < af.O.length; b++) {
/*     */ 
/*     */                   
/* 386 */                   if ((arrayOfD[af.O[b]]).k)
/*     */                   {
/* 388 */                     bool1 = true;
/*     */                   }
/*     */                 } 
/*     */               }
/*     */               
/* 393 */               float f = af.G;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 402 */               if (bool1)
/*     */               {
/* 404 */                 f = af.J;
/*     */               }
/*     */ 
/*     */               
/* 408 */               if (d.h > f * f) {
/*     */ 
/*     */                 
/* 411 */                 d.k = true;
/* 412 */                 b1++;
/*     */               } 
/*     */             } 
/*     */           }
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 446 */         if (af.i)
/*     */         {
/* 448 */           d.k = true;
/*     */         }
/*     */ 
/*     */         
/* 452 */         if (d.k) {
/*     */           
/* 454 */           if (d.d > 2.0F || af.i)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 461 */             float f8 = paramFloat * af.p;
/*     */             
/* 463 */             if (d.h <= f8 * f8) {
/*     */               
/* 465 */               d.b = d.f;
/* 466 */               d.c = d.g;
/*     */               
/* 468 */               d.o = true;
/*     */ 
/*     */               
/* 471 */               d.k = false;
/*     */             }
/*     */             else {
/*     */               
/* 475 */               float f = f.d(d.b, d.c, d.f, d.g);
/*     */               
/* 477 */               d.b += f.i(f) * f8;
/* 478 */               d.c += f.h(f) * f8;
/*     */               
/* 480 */               d.o = true;
/*     */             } 
/*     */ 
/*     */             
/* 484 */             if (af.i)
/*     */             {
/* 486 */               if (d.d > 0.0F) {
/*     */                 
/* 488 */                 d.d -= paramFloat * af.s;
/* 489 */                 if (d.d <= 0.0F)
/*     */                 {
/* 491 */                   d.d = 0.0F;
/*     */                 }
/*     */               } 
/*     */             }
/*     */ 
/*     */             
/* 497 */             float f9 = f.c(d.i, f1 + af.f, af.r * paramFloat);
/*     */             
/* 499 */             d.i += f9;
/*     */ 
/*     */             
/* 502 */             d.j = false;
/*     */ 
/*     */ 
/*     */           
/*     */           }
/* 507 */           else if (d.e < af.q)
/*     */           {
/* 509 */             d.e += paramFloat;
/*     */           }
/*     */           else
/*     */           {
/* 513 */             d.d += paramFloat * af.s;
/*     */           
/*     */           }
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 520 */           d.e = 0.0F;
/*     */           
/* 522 */           if (d.d > 0.0F) {
/*     */             
/* 524 */             d.d -= paramFloat * af.s;
/* 525 */             if (d.d <= 0.0F)
/*     */             {
/* 527 */               d.d = 0.0F;
/*     */               
/* 529 */               float f8 = paramk.dH + d.b;
/* 530 */               float f9 = paramk.dI + d.c;
/*     */               
/* 532 */               d.l = y.b(f8, f9);
/*     */               
/* 534 */               if (af.E && !d.j)
/*     */               {
/* 536 */                 d.j = true;
/*     */ 
/*     */ 
/*     */                 
/* 540 */                 if (d.l)
/*     */                 {
/* 542 */                   if (l1.cK && paramk.dE)
/*     */                   {
/* 544 */                     l1.bz.a(f8, f9, d.d, 0, 0.0F, 0.0F);
/*     */                   
/*     */                   }
/*     */                 
/*     */                 }
/* 549 */                 else if (l1.cJ && paramk.dE)
/*     */                 {
/* 551 */                   e e = l1.bz.c(f8, f9, d.d, d.i, 0);
/* 552 */                   if (e != null)
/*     */                   {
/* 554 */                     e.Q = 0.0F;
/* 555 */                     e.R = 0.0F;
/*     */                     
/* 557 */                     e.H = 1.6F;
/* 558 */                     e.G = 2.8F;
/*     */ 
/*     */                   
/*     */                   }
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/*     */ 
/*     */ 
/*     */               
/*     */               }
/*     */ 
/*     */             
/*     */             }
/*     */ 
/*     */           
/*     */           }
/* 576 */           else if (d.l) {
/*     */             
/* 578 */             if (d.d > -3.0F)
/*     */             {
/* 580 */               d.d -= paramFloat * 0.3F;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(k paramk, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
/* 602 */     d[] arrayOfD = paramk.ds;
/*     */     
/* 604 */     if (arrayOfD == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 609 */     l l = paramk.v;
/*     */ 
/*     */     
/* 612 */     float f1 = paramk.bL;
/*     */     
/* 614 */     if (l.dq)
/*     */     {
/* 616 */       f1 = (paramk.cn[l.dr.e]).a;
/*     */     }
/*     */ 
/*     */     
/* 620 */     l l1 = l.u();
/*     */     
/* 622 */     if (paramk.bU || paramk.bT) {
/*     */       
/* 624 */       for (byte b1 = 0; b1 < l.am.length; b1++)
/*     */       {
/* 626 */         (arrayOfD[b1]).m = true;
/*     */       }
/* 628 */       paramk.di();
/*     */     } 
/*     */ 
/*     */     
/* 632 */     float f2 = paramk.cn();
/*     */     
/* 634 */     Paint paint = null;
/*     */ 
/*     */     
/* 637 */     for (byte b = 0; b < arrayOfD.length; b++) {
/*     */       
/* 639 */       af af = l.am[b];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 663 */       if (af.L == paramBoolean1 || af.z != null)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 668 */         if (af.M == paramBoolean2)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/* 673 */           if (!af.m)
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 678 */             if (af.n == null || !af.n.read(paramk)) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 683 */               d d = arrayOfD[b];
/*     */               
/* 685 */               if (d.s > 0.0F) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 691 */                 float f3 = paramk.dJ + d.d;
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 696 */                 if (paint == null)
/*     */                 {
/* 698 */                   paint = paramk.aK();
/*     */                 }
/* 700 */                 Paint paint1 = paint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 710 */                 float f4 = 1.0F;
/*     */                 
/* 712 */                 if (f3 < -0.3F)
/*     */                 {
/* 714 */                   f4 = paramk.l(f3) * 0.003921569F;
/*     */                 }
/*     */                 
/* 717 */                 if (d.s < 1.0F)
/*     */                 {
/* 719 */                   f4 *= d.s;
/*     */                 }
/*     */                 
/* 722 */                 if (f4 < 1.0F) {
/*     */                   
/* 724 */                   int i = (int)(255.0F * f4);
/*     */                   
/* 726 */                   if (paint1.f() != i) {
/*     */                     
/* 728 */                     d.a(paint1);
/*     */                     
/* 730 */                     int j = d.f();
/* 731 */                     if (j < i)
/*     */                     {
/* 733 */                       i = j;
/*     */                     }
/*     */ 
/*     */                     
/* 737 */                     d.c(i);
/*     */                     
/* 739 */                     paint1 = d;
/*     */                   } 
/*     */                 } 
/*     */ 
/*     */                 
/* 744 */                 float f5 = paramk.dH + d.b - l1.cd;
/* 745 */                 float f6 = paramk.dI + d.c - l1.ce - d.d - paramk.dJ;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 761 */                 l l2 = l1.bw;
/*     */                 
/* 763 */                 if (f2 != 1.0F) {
/*     */                   
/* 765 */                   l2.j();
/* 766 */                   l2.a(f2, f2, f5, f6);
/*     */                 } 
/*     */                 
/* 769 */                 if (af.z != null)
/*     */                 {
/* 771 */                   if (!paramBoolean1)
/*     */                   {
/* 773 */                     if (l1.cM && d.d + paramk.dJ > 0.0F) {
/*     */ 
/*     */                       
/* 776 */                       float f = f6 + d.d + paramk.dJ;
/*     */ 
/*     */                       
/* 779 */                       l2.a(af.z, f5, f, d.i + d.r + af.N, (Paint)r.au);
/*     */                     } 
/*     */                   }
/*     */                 }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 788 */                 if (af.L == paramBoolean1) {
/*     */ 
/*     */                   
/* 791 */                   e e1 = af.x;
/*     */                   
/* 793 */                   if (af.y != null)
/*     */                   {
/* 795 */                     e1 = af.y[paramk.bB.M()];
/*     */                   }
/*     */                   
/* 798 */                   if (!af.D && (l1.cN || af.C))
/*     */                   {
/* 800 */                     if (e1 != null)
/*     */                     {
/* 802 */                       l2.a(e1, f5, f6, d.i + d.r + af.N, paint1);
/*     */                     }
/*     */                   }
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 809 */                   e e2 = af.u;
/*     */                   
/* 811 */                   if (e2 != null && (l1.cN || af.B)) {
/*     */ 
/*     */                     
/* 814 */                     float f7 = e2.p;
/*     */ 
/*     */                     
/* 817 */                     float f8 = f7;
/*     */                     
/* 819 */                     float f9 = f.i(f1);
/* 820 */                     float f10 = f.h(f1);
/*     */                     
/* 822 */                     float f11 = f9 * af.h - f10 * af.g;
/* 823 */                     float f12 = f10 * af.h + f9 * af.g;
/*     */                     
/* 825 */                     float f13 = f.d(d.b, d.c, f11, f12);
/* 826 */                     float f14 = f.a(d.b, d.c, f11, f12);
/*     */                     
/* 828 */                     if (f14 < (f7 - 2.0F) * (f7 - 2.0F))
/*     */                     {
/* 830 */                       f8 = f.a((int)f14);
/*     */                     }
/*     */ 
/*     */                     
/* 834 */                     l2.j();
/* 835 */                     l2.a(f13 + 90.0F, f5, f6);
/*     */ 
/*     */                     
/* 838 */                     b.a(0, (int)(f7 - f8), e2.k, (int)(f7 + f8));
/*     */                     
/* 840 */                     c.a(f5 - e2.m, f6 - f8, f5 + e2.m, f6 + f8);
/*     */                     
/* 842 */                     l2.a(e2, b, c, paint1);
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/* 847 */                     l2.k();
/*     */                   } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 859 */                   if (af.D && (l1.cN || af.C))
/*     */                   {
/* 861 */                     if (e1 != null)
/*     */                     {
/* 863 */                       l2.a(e1, f5, f6, d.i + d.r + af.N, paint1);
/*     */                     }
/*     */                   }
/*     */                 } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 873 */                 if (f2 != 1.0F)
/*     */                 {
/* 875 */                   l2.k();
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           }
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
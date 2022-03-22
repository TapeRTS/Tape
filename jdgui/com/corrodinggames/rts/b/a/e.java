/*     */ package com.corrodinggames.rts.b.a;
/*     */ 
/*     */ import android.graphics.Point;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.aj;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.j;
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends h
/*     */ {
/*  27 */   int a = 1;
/*     */ 
/*     */   
/*     */   int b;
/*     */   
/*  32 */   final Rect c = new Rect();
/*     */   
/*  34 */   final PointF d = new PointF();
/*  35 */   static final Point e = new Point();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  53 */     l.d("Misc Performance test");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     byte b1 = 5;
/*  60 */     int i = 0;
/*     */     
/*  62 */     l.d("=== isLineClear tests (runs:" + b1 + ")");
/*     */     
/*  64 */     Long long_1 = Long.valueOf(bj.a());
/*     */     
/*  66 */     for (byte b4 = 0; b4 < b1; b4++) {
/*     */ 
/*     */       
/*  69 */       for (byte b = 0; b < 'Ϩ'; b++) {
/*     */         
/*  71 */         int k = 1000 - b;
/*  72 */         byte b8 = 50;
/*  73 */         byte b9 = 50;
/*     */         
/*  75 */         boolean bool1 = true;
/*  76 */         char c1 = 'Ϩ';
/*  77 */         boolean bool2 = true;
/*     */         
/*  79 */         if (aj.b(ah.b, b, k, b8, b9, c1, bool2, bool1))
/*     */         {
/*  81 */           i++;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  88 */     Long long_2 = Long.valueOf(bj.a());
/*  89 */     double d1 = bj.a(long_1.longValue(), long_2.longValue());
/*  90 */     this.a += i;
/*  91 */     l.d("Took: " + d1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     b1 = 5;
/* 107 */     i = 0;
/*     */     
/* 109 */     l.d("=== maths tests == (runs:" + b1 + ")");
/*     */     
/* 111 */     long_1 = Long.valueOf(bj.a());
/*     */     
/* 113 */     byte b3 = 0;
/*     */     
/* 115 */     for (byte b6 = 0; b6 < b1; b6++) {
/*     */ 
/*     */       
/* 118 */       for (byte b = 0; b < '✐'; b++) {
/*     */         
/* 120 */         Point point = e;
/*     */         
/* 122 */         point.a += b;
/* 123 */         point.a += b;
/* 124 */         point.a += b;
/* 125 */         point.a += b;
/* 126 */         point.a += b;
/* 127 */         point.a += b;
/* 128 */         point.a += b;
/* 129 */         point.a += b;
/* 130 */         point.a += b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 158 */         this.b++;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 164 */         i += b3;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     Long long_3 = Long.valueOf(bj.a());
/*     */     
/* 194 */     double d2 = bj.a(long_1.longValue(), long_3.longValue());
/*     */     
/* 196 */     this.a += i;
/*     */     
/* 198 */     l.d("Took: " + d2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     b1 = 14;
/* 210 */     i = 5;
/* 211 */     int j = 0;
/*     */ 
/*     */     
/* 214 */     m m = new m();
/*     */     
/* 216 */     byte b5 = 0;
/*     */     
/* 218 */     for (byte b7 = 0; b7 < '丠'; b7++) {
/*     */       
/* 220 */       j j1 = new j();
/*     */       
/* 222 */       if (b7 % 10 != 0) {
/*     */         
/* 224 */         j1.a(h.c("test"));
/* 225 */         j1.a(h.c("test1"));
/*     */       } 
/*     */       
/* 228 */       if (b7 % 2 == 0) {
/*     */         
/* 230 */         j1.a(h.c("test2"));
/* 231 */         b5++;
/*     */       } 
/* 233 */       if (b7 % 3 == 0)
/*     */       {
/* 235 */         j1.a(h.c("test3"));
/*     */       }
/* 237 */       if (b7 % 4 == 0)
/*     */       {
/* 239 */         j1.a(h.c("test4"));
/*     */       }
/*     */       
/* 242 */       if (b7 % 5 == 0)
/*     */       {
/* 244 */         m.add(null);
/*     */       }
/*     */       
/* 247 */       m.add(j1.a());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 252 */     i i1 = h.a("test2");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 260 */     l.d("=== CustomTagList tests == (runs:" + i + ")");
/*     */     
/*     */     char c;
/*     */     
/* 264 */     for (c = Character.MIN_VALUE; c < b1; c++) {
/*     */ 
/*     */       
/* 267 */       Long long_4 = Long.valueOf(bj.a());
/*     */       
/* 269 */       for (byte b = 0; b < i; b++) {
/*     */ 
/*     */         
/* 272 */         byte b8 = 0;
/*     */         
/* 274 */         for (i i2 : m) {
/*     */           
/* 276 */           if (h.a(i1, i2))
/*     */           {
/* 278 */             b8++;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 283 */         i.a(b5, b8);
/*     */       } 
/*     */ 
/*     */       
/* 287 */       l.d("test2Expected:" + b5);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 303 */       Long long_5 = Long.valueOf(bj.a());
/*     */       
/* 305 */       double d = bj.a(long_4.longValue(), long_5.longValue());
/*     */       
/* 307 */       this.a += j;
/*     */       
/* 309 */       l.d("Took: " + d);
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
/* 320 */     for (b1 = 0; b1 < 2; b1++) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 325 */       i = 14;
/* 326 */       j = 100;
/* 327 */       byte b = 0;
/*     */       
/* 329 */       l.d("=== [Write]/comparison tests == (runs:" + j + ")");
/*     */       
/* 331 */       for (b5 = 0; b5 < i; b5++) {
/*     */         
/* 333 */         Random random = new Random();
/*     */         
/* 335 */         f[] arrayOfF = new f[10000];
/*     */         
/* 337 */         for (byte b8 = 0; b8 < arrayOfF.length; b8++) {
/*     */           
/* 339 */           arrayOfF[b8] = new f();
/* 340 */           (arrayOfF[b8]).d = (random.nextFloat() > 0.5D);
/*     */         } 
/*     */         
/* 343 */         Long long_4 = Long.valueOf(bj.a());
/*     */         
/* 345 */         for (byte b9 = 0; b9 < j; b9++) {
/*     */           
/* 347 */           for (byte b10 = 0; b10 < arrayOfF.length; b10++) {
/*     */             
/* 349 */             f f = arrayOfF[b10];
/* 350 */             f.d = false;
/*     */           } 
/*     */         } 
/*     */         
/* 354 */         Long long_5 = Long.valueOf(bj.a());
/* 355 */         double d = bj.a(long_4.longValue(), long_5.longValue());
/*     */         
/* 357 */         this.a += b;
/*     */         
/* 359 */         l.d("Took: " + d);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 367 */       i = 14;
/* 368 */       j = 100;
/* 369 */       b = 0;
/*     */       
/* 371 */       l.d("=== Write/[comparison] tests == (runs:" + j + ")");
/*     */       
/* 373 */       for (b5 = 0; b5 < i; b5++) {
/*     */         
/* 375 */         Random random = new Random();
/*     */         
/* 377 */         f[] arrayOfF = new f[10000];
/*     */         
/* 379 */         for (byte b8 = 0; b8 < arrayOfF.length; b8++) {
/*     */           
/* 381 */           arrayOfF[b8] = new f();
/* 382 */           (arrayOfF[b8]).d = (random.nextFloat() > 0.5D);
/*     */         } 
/*     */         
/* 385 */         Long long_4 = Long.valueOf(bj.a());
/*     */         
/* 387 */         for (byte b9 = 0; b9 < j; b9++) {
/*     */           
/* 389 */           for (byte b10 = 0; b10 < arrayOfF.length; b10++) {
/*     */             
/* 391 */             f f = arrayOfF[b10];
/* 392 */             if (f.d)
/*     */             {
/* 394 */               f.d = false;
/*     */             }
/*     */           } 
/*     */         } 
/* 398 */         Long long_5 = Long.valueOf(bj.a());
/* 399 */         double d = bj.a(long_4.longValue(), long_5.longValue());
/*     */         
/* 401 */         this.a += b;
/*     */         
/* 403 */         l.d("Took: " + d);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 429 */     b1 = 14;
/* 430 */     i = 100;
/* 431 */     j = 0;
/*     */     
/* 433 */     l.d("=== comparison tests 1 == (runs:" + i + ")");
/*     */     byte b2;
/* 435 */     for (b2 = 0; b2 < b1; b2++) {
/*     */       
/* 437 */       Random random = new Random();
/*     */       
/* 439 */       char c1 = 'ɘ';
/* 440 */       c = 'ɘ';
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 451 */       float[] arrayOfFloat = new float[c1 * c1];
/* 452 */       for (byte b8 = 0; b8 < c1; b8++) {
/* 453 */         for (byte b = 0; b < c; b++) {
/* 454 */           arrayOfFloat[b8 * c + b] = random.nextFloat();
/*     */         }
/*     */       } 
/* 457 */       Long long_4 = Long.valueOf(bj.a());
/*     */       
/* 459 */       for (byte b9 = 0; b9 < i; b9++) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 468 */         for (byte b = 0; b < c1; b++) {
/* 469 */           for (byte b10 = 0; b10 < c; b10++) {
/*     */             
/* 471 */             int k = b * c + b10;
/* 472 */             j = (int)(j + arrayOfFloat[k]);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 477 */       Long long_5 = Long.valueOf(bj.a());
/* 478 */       double d = bj.a(long_4.longValue(), long_5.longValue());
/*     */       
/* 480 */       this.a += j;
/*     */       
/* 482 */       l.d("Took: " + d);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 490 */     b1 = 14;
/* 491 */     i = 100;
/* 492 */     j = 0;
/*     */     
/* 494 */     l.d("=== comparison tests 2 == (runs:" + i + ")");
/*     */     
/* 496 */     for (b2 = 0; b2 < b1; b2++) {
/*     */       
/* 498 */       Random random = new Random();
/*     */       
/* 500 */       char c1 = 'ɘ';
/* 501 */       c = 'ɘ';
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 510 */       float[][] arrayOfFloat = new float[c1][c1];
/* 511 */       for (byte b8 = 0; b8 < c1; b8++) {
/* 512 */         for (byte b = 0; b < c; b++)
/* 513 */           arrayOfFloat[b8][b] = random.nextFloat(); 
/*     */       } 
/* 515 */       Long long_4 = Long.valueOf(bj.a());
/*     */       
/* 517 */       for (byte b9 = 0; b9 < i; b9++) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 527 */         for (byte b = 0; b < c1; b++) {
/* 528 */           for (byte b10 = 0; b10 < c; b10++)
/*     */           {
/* 530 */             j = (int)(j + arrayOfFloat[b][b10]);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 535 */       Long long_5 = Long.valueOf(bj.a());
/* 536 */       double d = bj.a(long_4.longValue(), long_5.longValue());
/*     */       
/* 538 */       this.a += j;
/*     */       
/* 540 */       l.d("Took: " + d);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
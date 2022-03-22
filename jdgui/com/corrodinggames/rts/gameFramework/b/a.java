/*     */ package com.corrodinggames.rts.gameFramework.b;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.o;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   float a;
/*     */   float b;
/*     */   public boolean c;
/*     */   public al d;
/*     */   public m e;
/*  41 */   public int f = 1;
/*     */   
/*     */   public float g;
/*     */   
/*     */   public float h;
/*     */   
/*     */   public boolean i;
/*     */   
/*     */   public m j;
/*     */   
/*     */   public boolean k;
/*     */   
/*     */   public int l;
/*     */   
/*     */   public int m;
/*     */   
/*     */   public boolean n;
/*     */   
/*     */   public r o;
/*     */   
/*     */   boolean p = false;
/*     */   
/*     */   public boolean q = false;
/*     */   
/*     */   public int r;
/*     */   public float s;
/*  67 */   public float t = 0.04F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public af v;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public static o w = new o();
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a() {
/*  91 */     w.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(float paramFloat) {
/*  97 */     for (a a1 : w)
/*     */     {
/*  99 */       a1.c(paramFloat);
/*     */     }
/* 101 */     w.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(float paramFloat) {
/* 107 */     Object[] arrayOfObject = w.b(); byte b; int i;
/* 108 */     for (b = 0, i = w.size(); b < i; b++) {
/*     */       
/* 110 */       a a1 = (a)arrayOfObject[b];
/*     */ 
/*     */ 
/*     */       
/* 114 */       a1.d(paramFloat);
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
/* 126 */   static Point x = new Point();
/* 127 */   static RectF y = new RectF();
/* 128 */   static RectF z = new RectF();
/*     */ 
/*     */   
/*     */   public static boolean a(m paramm, int paramInt1, int paramInt2, int paramInt3) {
/* 132 */     l l = l.u();
/*     */     
/* 134 */     l.bt.a(paramInt1, paramInt2);
/*     */     
/* 136 */     float f1 = (l.bt.M + l.bt.m);
/* 137 */     float f2 = (l.bt.N + l.bt.n);
/*     */     
/* 139 */     y.a(f1, f2, f1 + 1.0F, f2 + 1.0F);
/*     */     
/* 141 */     return a(paramm, y, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(m paramm, r paramr, int paramInt) {
/* 146 */     l l = l.u();
/* 147 */     b b = l.bt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 166 */     y = paramr.a(b, y);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     return a(paramm, y, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(r paramr1, r paramr2) {
/* 183 */     l l = l.u();
/* 184 */     b b = l.bt;
/*     */ 
/*     */     
/* 187 */     y = paramr1.a(b, y);
/* 188 */     z = paramr2.a(b, z);
/*     */ 
/*     */     
/* 191 */     if (f.a(y, z))
/*     */     {
/* 193 */       return true;
/*     */     }
/*     */     
/* 196 */     return false;
/*     */   }
/*     */   
/* 199 */   static RectF A = new RectF(); Paint B;
/*     */   
/*     */   public static boolean a(m paramm, RectF paramRectF, int paramInt) {
/* 202 */     l l = l.u();
/* 203 */     b b = l.bt;
/*     */     
/* 205 */     RectF rectF = A;
/*     */     
/* 207 */     for (a a1 : w) {
/*     */       
/* 209 */       if (a1.j == paramm)
/*     */       {
/* 211 */         if (a1.n)
/*     */         {
/* 213 */           if (paramInt == -1 || paramInt == a1.r) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 219 */             af af1 = af.a(a1.d);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 228 */             af1.dH = a1.g;
/* 229 */             af1.dI = a1.h;
/*     */             
/* 231 */             rectF = af1.a(b, rectF);
/*     */ 
/*     */ 
/*     */             
/* 235 */             if (f.a(rectF, paramRectF))
/*     */             {
/* 237 */               return true;
/*     */             }
/*     */           } 
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 246 */     return false;
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
/*     */   static Paint C;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static Paint D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(m paramm, float paramFloat1, float paramFloat2) {
/* 287 */     for (a a1 : w) {
/*     */       
/* 289 */       if (a1.j == paramm)
/*     */       {
/* 291 */         if (a1.n) {
/*     */ 
/*     */           
/* 294 */           float f1 = f.a(a1.g, a1.h, paramFloat1, paramFloat2);
/*     */           
/* 296 */           af af1 = af.a(a1.d);
/*     */           
/* 298 */           float f2 = af1.bO + 1.0F;
/*     */ 
/*     */           
/* 301 */           if (f2 < 20.0F)
/*     */           {
/* 303 */             f2 = 20.0F;
/*     */           }
/*     */           
/* 306 */           if (f1 < f2 * f2)
/*     */           {
/* 308 */             return a1;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 314 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 323 */     if (this.n) {
/*     */ 
/*     */       
/* 326 */       if (this.o == null || this.o.bz)
/*     */       {
/* 328 */         return false;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 337 */       if (!ak.a(this.d, this.g, this.h, 0.0F, 0.0F, this.e))
/*     */       {
/* 339 */         return false;
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 345 */       if (this.v == null)
/*     */       {
/* 347 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 351 */       if (this.v.bR())
/*     */       {
/* 353 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 358 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float paramFloat) {
/* 367 */     this.a++;
/* 368 */     this.b += paramFloat;
/*     */     
/* 370 */     boolean bool = false;
/*     */ 
/*     */     
/* 373 */     this.s = f.a(this.s, this.t * paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     if (this.n) {
/*     */       
/* 381 */       if (this.a > 6.0F)
/*     */       {
/* 383 */         this.a = 0.0F;
/*     */ 
/*     */         
/* 386 */         boolean bool1 = this.o.a(this.d, this.g, this.h);
/*     */         
/* 388 */         if (!this.p)
/*     */         {
/* 390 */           if (bool1)
/*     */           {
/* 392 */             this.p = true;
/*     */           }
/*     */         }
/*     */         
/* 396 */         if (!bool1)
/*     */         {
/* 398 */           if (this.p) {
/*     */             
/* 400 */             bool = true;
/*     */ 
/*     */           
/*     */           }
/* 404 */           else if (this.b > 180.0F) {
/*     */             
/* 406 */             bool = true;
/*     */           } 
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 416 */         if (!b())
/*     */         {
/* 418 */           bool = true;
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 428 */     else if (this.a > 2.0F) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 434 */       if (!b())
/*     */       {
/* 436 */         bool = true;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 446 */     if (bool) {
/*     */       
/* 448 */       this.c = true;
/* 449 */       w.b(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public a() {
/* 455 */     this.B = new Paint();
/*     */     w.add(this);
/*     */     w.a();
/*     */   }
/* 459 */   static RectF E = new RectF();
/*     */ 
/*     */   
/*     */   static {
/* 463 */     C = (Paint)new q();
/* 464 */     C.a(90, 0, 0, 255);
/* 465 */     C.a(Paint.Style.b);
/* 466 */     C.a(2.0F);
/*     */ 
/*     */     
/* 469 */     D = (Paint)new q();
/* 470 */     D.a(40, 0, 0, 255);
/* 471 */     D.a(Paint.Style.b);
/* 472 */     D.a(2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(float paramFloat) {
/* 480 */     l l = l.u();
/*     */ 
/*     */     
/* 483 */     if (l.bb != this.j) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 488 */     if (!l.cv.b(this.g, this.h)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 493 */     if (this.q && !this.p) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 499 */     float f1 = 0.0F;
/*     */ 
/*     */     
/* 502 */     float f2 = this.g;
/* 503 */     float f3 = this.h;
/* 504 */     float f4 = 0.0F;
/* 505 */     float f5 = 0.0F;
/*     */     
/* 507 */     float f6 = 1.0F;
/* 508 */     float f7 = 500.0F;
/*     */ 
/*     */     
/* 511 */     boolean bool1 = false;
/* 512 */     boolean bool2 = false;
/*     */ 
/*     */     
/* 515 */     if (this.n) {
/*     */       
/* 517 */       bool2 = true;
/*     */     }
/*     */     else {
/*     */       
/* 521 */       bool1 = true;
/*     */     } 
/*     */     
/* 524 */     boolean bool3 = true;
/* 525 */     if (this.i)
/*     */     {
/* 527 */       bool3 = false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 533 */     if (bool2) {
/*     */       
/* 535 */       f1 = this.s;
/* 536 */       if (f1 <= 0.0F) {
/*     */         
/* 538 */         f1 = 0.0F;
/*     */ 
/*     */       
/*     */       }
/* 542 */       else if (this.s < 1.0F) {
/*     */         
/* 544 */         f1 = 1.0F - f.i(f1 * 90.0F);
/*     */       }
/*     */       else {
/*     */         
/* 548 */         f1 = 1.0F;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 554 */     if (bool2 && this.s < 1.0F) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 559 */       af af1 = af.c(this.d);
/*     */ 
/*     */ 
/*     */       
/* 563 */       if (af1 != null && af1.bw()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 571 */         Rect rect = af1.bP();
/* 572 */         if (rect != null) {
/*     */           
/* 574 */           E.a(rect);
/*     */           
/* 576 */           E.b *= l.bt.l;
/* 577 */           E.d *= l.bt.l;
/* 578 */           E.a *= l.bt.k;
/* 579 */           E.c *= l.bt.k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 590 */           float f9 = (l.bt.m - 3) + f1 * 5.0F;
/*     */           
/* 592 */           E.a(-(af1.cH() - l.bt.m), -(af1.cI() - l.bt.n));
/*     */ 
/*     */ 
/*     */           
/* 596 */           f.a(E, f9);
/*     */           
/* 598 */           float f10 = this.g - l.cd;
/* 599 */           float f11 = this.h - l.ce - f5;
/*     */           
/* 601 */           E.a(f10, f11);
/*     */           
/* 603 */           float f12 = 3.0F + f1 * 7.0F;
/*     */           
/* 605 */           Paint paint = C;
/* 606 */           if (this.s <= 0.0F)
/*     */           {
/* 608 */             paint = D;
/*     */           }
/*     */           
/* 611 */           l.bw.a(E.a - f12, E.b, E.c + f12, E.b, paint);
/*     */ 
/*     */ 
/*     */           
/* 615 */           l.bw.a(E.a - f12, E.d, E.c + f12, E.d, paint);
/*     */ 
/*     */ 
/*     */           
/* 619 */           l.bw.a(E.a, E.b - f12, E.a, E.d + f12, paint);
/*     */ 
/*     */ 
/*     */           
/* 623 */           l.bw.a(E.c, E.b - f12, E.c, E.d + f12, paint);
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
/*     */ 
/*     */ 
/*     */     
/* 643 */     float f8 = 0.0F;
/*     */     
/* 645 */     if (bool2)
/*     */     {
/* 647 */       f8 -= 10.0F * f1;
/*     */     }
/*     */ 
/*     */     
/* 651 */     ak.a(this.d, f2, f3 + f8, f4, f5, this.e, f6, f7, bool1, bool2, this.f, bool3);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.ad;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class n
/*     */   extends h
/*     */ {
/*     */   boolean a;
/*     */   int b;
/*     */   int c;
/*     */   i d;
/*  31 */   float e = 100.0F;
/*     */   
/*  33 */   float f = 4000.0F;
/*     */ 
/*     */   
/*  36 */   float g = 100.0F;
/*     */ 
/*     */   
/*     */   float h;
/*     */ 
/*     */   
/*     */   float i;
/*     */ 
/*     */   
/*     */   float j;
/*     */   
/*     */   float k;
/*     */   
/*     */   int l;
/*     */   
/*     */   h m;
/*     */   
/*     */   r n;
/*     */   
/*  55 */   float o = 0.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   boolean p = false;
/*     */ 
/*     */ 
/*     */   
/*     */   boolean q;
/*     */ 
/*     */   
/*     */   float r;
/*     */ 
/*     */   
/*     */   float s;
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  74 */     paramap.a(this.a);
/*  75 */     paramap.a(this.b);
/*  76 */     paramap.a(this.c);
/*     */ 
/*     */     
/*  79 */     int j = this.B.size();
/*  80 */     paramap.a(j);
/*  81 */     for (r r1 : this.B)
/*     */     {
/*  83 */       paramap.a(r1);
/*     */     }
/*     */ 
/*     */     
/*  87 */     paramap.c(5);
/*     */     
/*  89 */     paramap.a(this.R.a(this.m));
/*     */ 
/*     */     
/*  92 */     paramap.a(this.q);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     paramap.a(this.n);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     paramap.a(this.o);
/* 103 */     paramap.a(this.p);
/*     */ 
/*     */     
/* 106 */     paramap.a(this.r);
/* 107 */     paramap.a(this.s);
/*     */     
/* 109 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/* 117 */     this.a = paramk.e();
/* 118 */     this.b = paramk.f();
/* 119 */     this.c = paramk.f();
/*     */ 
/*     */     
/* 122 */     l();
/*     */     
/* 124 */     int j = paramk.f();
/*     */     byte b;
/* 126 */     for (b = 0; b < j; b++) {
/*     */       
/* 128 */       r r1 = paramk.o();
/* 129 */       if (r1 != null)
/*     */       {
/* 131 */         if (!this.R.g((af)r1)) {
/*     */           
/* 133 */           l.b("TransporterGroup:readIn: Unit is not transporterUnit");
/*     */         }
/*     */         else {
/*     */           
/* 137 */           a(r1);
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 142 */     b = paramk.d();
/*     */     
/* 144 */     if (b >= 1)
/*     */     {
/* 146 */       this.m = (h)this.R.p(paramk.f());
/*     */     }
/*     */     
/* 149 */     if (b >= 2)
/*     */     {
/* 151 */       this.q = paramk.e();
/*     */     }
/*     */     
/* 154 */     if (b >= 3)
/*     */     {
/* 156 */       this.n = paramk.o();
/*     */     }
/*     */     
/* 159 */     if (b >= 4) {
/*     */       
/* 161 */       this.o = paramk.g();
/* 162 */       this.p = paramk.e();
/*     */     } 
/*     */     
/* 165 */     if (b >= 5) {
/*     */       
/* 167 */       this.r = paramk.g();
/* 168 */       this.s = paramk.g();
/*     */     } 
/*     */     
/* 171 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public n(a parama) {
/* 178 */     super(parama);
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
/*     */   public void c() {
/* 195 */     for (af af : af.bj) {
/*     */       
/* 197 */       if (!af.bz && af.bB == this.R)
/*     */       {
/*     */         
/* 200 */         if (this.l > this.B.size())
/*     */         {
/* 202 */           if (af instanceof r) {
/*     */             
/* 204 */             r r1 = (r)af;
/*     */             
/* 206 */             if (!r1.bs)
/*     */             {
/* 208 */               if (r1.ar == null)
/*     */               {
/* 210 */                 if (this.R.g((af)r1) && this.R.i((af)r1))
/*     */                 {
/* 212 */                   a(r1);
/*     */                 }
/*     */               }
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
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 238 */     return (this.m != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 246 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 250 */     this.h += paramFloat;
/*     */ 
/*     */ 
/*     */     
/* 254 */     i();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 260 */     if (this.l <= this.B.size());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 268 */     this.i = f.a(this.i, paramFloat);
/*     */     
/* 270 */     this.j = f.a(this.j, paramFloat);
/* 271 */     this.k = f.a(this.k, paramFloat);
/*     */     
/* 273 */     if (!d() && !this.q)
/*     */     {
/* 275 */       if (this.l > this.B.size())
/*     */       {
/* 277 */         if (this.i == 0.0F) {
/*     */           
/* 279 */           this.i = 300.0F;
/*     */           
/* 281 */           c();
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     if (!d() && this.B.size() != 0) {
/*     */       
/* 291 */       if (!d()) {
/*     */         
/* 293 */         this.f = f.a(this.f, paramFloat);
/*     */         
/* 295 */         if (this.f == 0.0F) {
/*     */           
/* 297 */           this.f = 4000.0F;
/*     */           
/* 299 */           if (this.d != null) {
/*     */             
/* 301 */             PointF pointF = this.d.w();
/* 302 */             this.S = pointF.a;
/* 303 */             this.T = pointF.b;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 308 */       if (this.j == 0.0F) {
/*     */         
/* 310 */         this.j = 400.0F;
/*     */         
/* 312 */         e e = l.bN.a(this.R);
/* 313 */         for (r r1 : this.B) {
/*     */           
/* 315 */           if (c((af)r1) > 28900.0F && !r1.au()) {
/*     */             
/* 317 */             e.a(r1);
/*     */ 
/*     */             
/*     */             continue;
/*     */           } 
/*     */           
/* 323 */           ad ad = (ad)r1;
/* 324 */           if (ad.f() != 0) {
/*     */             
/* 326 */             c c = r1.ca();
/* 327 */             e e1 = l.bN.a(this.R);
/* 328 */             e1.a(r1);
/* 329 */             e1.a(c);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 334 */         e.a(this.S, this.T);
/*     */       } 
/*     */ 
/*     */       
/* 338 */       if (this.m == null) {
/*     */ 
/*     */         
/* 341 */         this.g = f.a(this.g, paramFloat);
/* 342 */         if (this.g == 0.0F) {
/*     */           
/* 344 */           this.g = 100.0F;
/*     */ 
/*     */           
/* 347 */           if (f.a(0, 100) < 80)
/*     */           {
/* 349 */             a(paramFloat, true);
/*     */           }
/*     */           
/* 352 */           if (this.m == null)
/*     */           {
/* 354 */             a(paramFloat, false);
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
/* 366 */     if (this.m != null)
/*     */     {
/* 368 */       if (this.m.V)
/*     */       {
/* 370 */         this.m = null;
/*     */       }
/*     */     }
/*     */     
/* 374 */     if (!this.q) {
/*     */ 
/*     */       
/* 377 */       if (this.m != null)
/*     */       {
/* 379 */         ArrayList arrayList = this.m.C;
/*     */         
/* 381 */         if (this.n != null)
/*     */         {
/* 383 */           if (this.n.bz || this.n.cp != null || this.n.cq != null) {
/*     */             
/* 385 */             arrayList.remove(this.n);
/* 386 */             this.n = null;
/*     */           } 
/*     */         }
/*     */         
/* 390 */         if (this.n == null) {
/*     */ 
/*     */           
/* 393 */           for (r r1 : arrayList) {
/*     */             
/* 395 */             if (r1.cp == null)
/*     */             {
/* 397 */               for (r r2 : this.B) {
/*     */                 
/* 399 */                 if (r2.d((af)r1, false))
/*     */                 {
/* 401 */                   this.n = r1;
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */ 
/*     */           
/* 408 */           if (this.n == null) {
/*     */             
/* 410 */             this.q = true;
/*     */             
/* 412 */             this.j = 0.0F;
/* 413 */             this.k = 0.0F;
/*     */ 
/*     */             
/* 416 */             this.r = this.m.S;
/* 417 */             this.s = this.m.T;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 422 */         if (this.n != null)
/*     */         {
/*     */ 
/*     */           
/* 426 */           if (this.j == 0.0F) {
/*     */             
/* 428 */             this.j = 400.0F;
/*     */             
/* 430 */             e e = l.bN.a(this.R);
/* 431 */             for (r r1 : this.B)
/*     */             {
/* 433 */               e.a(r1);
/*     */             }
/* 435 */             e.a(this.n.dH, this.n.dI);
/*     */           } 
/*     */           
/* 438 */           if (this.k == 0.0F)
/*     */           {
/* 440 */             this.k = 80.0F;
/*     */             
/* 442 */             for (r r1 : arrayList) {
/*     */ 
/*     */               
/* 445 */               for (r r2 : this.B) {
/*     */                 
/* 447 */                 if (r2.d((af)r1, false)) {
/*     */                   
/* 449 */                   float f = f.a(r2.dH, r2.dI, r1.dH, r1.dI);
/* 450 */                   if (f < 14400.0F) {
/*     */                     
/* 452 */                     e e = l.bN.a(this.R);
/* 453 */                     e.a(r1);
/* 454 */                     e.e((af)r2);
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 464 */             boolean bool = false;
/* 465 */             for (r r1 : this.B) {
/*     */               
/* 467 */               if (r1.d((af)this.n, false))
/*     */               {
/* 469 */                 bool = true;
/*     */               }
/*     */             } 
/* 472 */             if (!bool)
/*     */             {
/* 474 */               this.n = null;
/*     */ 
/*     */             
/*     */             }
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 492 */     else if (this.m == null) {
/*     */ 
/*     */       
/* 495 */       e();
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 501 */       if (this.j == 0.0F) {
/*     */         
/* 503 */         this.j = 400.0F;
/*     */ 
/*     */         
/* 506 */         float f1 = this.m.S + f.c(-40.0F, 40.0F);
/* 507 */         float f2 = this.m.T + f.c(-40.0F, 40.0F);
/*     */         
/* 509 */         if (this.o > 600.0F) {
/*     */           
/* 511 */           f1 += f.c(-300.0F, 300.0F);
/* 512 */           f2 += f.c(-300.0F, 300.0F);
/*     */         } 
/* 514 */         if (this.o > 1200.0F) {
/*     */           
/* 516 */           f1 += f.c(-300.0F, 300.0F);
/* 517 */           f2 += f.c(-300.0F, 300.0F);
/*     */         } 
/*     */         
/* 520 */         if (y.a(f1, f2, ah.b)) {
/*     */           
/* 522 */           f1 += f.c(-100.0F, 100.0F);
/* 523 */           f2 += f.c(-100.0F, 100.0F);
/*     */         } 
/* 525 */         if (y.a(f1, f2, ah.b)) {
/*     */           
/* 527 */           f1 += f.c(-200.0F, 200.0F);
/* 528 */           f2 += f.c(-200.0F, 200.0F);
/*     */         } 
/* 530 */         if (y.a(f1, f2, ah.b)) {
/*     */           
/* 532 */           f1 += f.c(-200.0F, 200.0F);
/* 533 */           f2 += f.c(-200.0F, 200.0F);
/*     */         } 
/*     */ 
/*     */         
/* 537 */         if (y.a(f1, f2, ah.b)) {
/*     */           
/* 539 */           this.j = 30.0F;
/*     */         }
/*     */         else {
/*     */           
/* 543 */           this.r = f1;
/* 544 */           this.s = f2;
/*     */           
/* 546 */           e e = l.bN.a(this.R);
/* 547 */           for (r r1 : this.B) {
/*     */             
/* 549 */             ad ad = (ad)r1;
/*     */             
/* 551 */             if (ad.f() != 0) {
/*     */               
/* 553 */               float f = f.a(r1.dH, r1.dI, this.r, this.s);
/* 554 */               if (f > 1600.0F)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 561 */                 e.a(r1);
/*     */               }
/*     */               
/*     */               continue;
/*     */             } 
/*     */             
/* 567 */             e e1 = l.bN.a(this.R);
/* 568 */             e1.a(r1);
/* 569 */             e1.a(this.S, this.T);
/*     */           } 
/*     */           
/* 572 */           e.a(this.r, this.s);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 579 */       if (this.k == 0.0F) {
/*     */         
/* 581 */         this.k = 100.0F;
/*     */         
/* 583 */         for (r r1 : this.B) {
/*     */           
/* 585 */           float f = f.a(r1.dH, r1.dI, this.r, this.s);
/* 586 */           if (f < 6400.0F) {
/*     */             
/* 588 */             this.p = true;
/*     */ 
/*     */ 
/*     */             
/* 592 */             c c = r1.ca();
/*     */             
/* 594 */             e e = l.bN.a(this.R);
/* 595 */             e.a(r1);
/* 596 */             e.a(c);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 602 */       if (this.p) {
/*     */         
/* 604 */         this.m.j();
/*     */         
/* 606 */         this.o += paramFloat;
/*     */       } 
/*     */ 
/*     */       
/* 610 */       boolean bool = false;
/* 611 */       for (r r1 : this.B) {
/*     */         
/* 613 */         if (!r1.bz) {
/*     */           
/* 615 */           ad ad = (ad)r1;
/* 616 */           if (ad.f() != 0)
/*     */           {
/* 618 */             bool = true;
/*     */           }
/*     */         } 
/*     */       } 
/* 622 */       if (!bool || this.o > 1700.0F)
/*     */       {
/*     */         
/* 625 */         e();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 633 */     if (this.h > 1500.0F)
/*     */     {
/*     */ 
/*     */       
/* 637 */       if (this.B.size() == 0)
/*     */       {
/* 639 */         k();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/* 647 */     this.q = false;
/* 648 */     this.m = null;
/* 649 */     this.o = 0.0F;
/*     */     
/* 651 */     this.j = 0.0F;
/* 652 */     this.k = 0.0F;
/*     */     
/* 654 */     this.p = false;
/*     */     
/* 656 */     f();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat, boolean paramBoolean) {
/* 664 */     for (o o : this.R.aV) {
/*     */       
/* 666 */       if (o instanceof h && !(o instanceof n)) {
/*     */         
/* 668 */         if (paramBoolean)
/*     */         {
/* 670 */           if (!(o instanceof l)) {
/*     */             continue;
/*     */           }
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 677 */         h h1 = (h)o;
/*     */         
/* 679 */         if (h1.C.size() != 0)
/*     */         {
/* 681 */           if (!h1.h()) {
/*     */             
/* 683 */             this.m = h1;
/* 684 */             this.n = null;
/*     */             return;
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
/*     */   public i a(boolean paramBoolean) {
/* 697 */     i i1 = null;
/*     */     
/* 699 */     for (o o : this.R.aV) {
/*     */       
/* 701 */       if (o instanceof i) {
/*     */         
/* 703 */         i i2 = (i)o;
/* 704 */         if (!i2.s || !paramBoolean)
/*     */         {
/* 706 */           if (i2.b == j.c) {
/*     */             
/* 708 */             i1 = i2;
/* 709 */             if (f.b(3) == 0)
/*     */             {
/* 711 */               return i1;
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/* 717 */     return i1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() {
/* 724 */     boolean bool = true;
/*     */ 
/*     */     
/* 727 */     PointF pointF = null;
/*     */ 
/*     */     
/* 730 */     if (bool) {
/*     */ 
/*     */       
/* 733 */       this.d = a(true);
/*     */       
/* 735 */       if (this.d == null)
/*     */       {
/* 737 */         this.d = a(false);
/*     */       }
/*     */       
/* 740 */       if (this.d != null)
/*     */       {
/* 742 */         pointF = this.d.w();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 747 */     if (pointF == null) {
/*     */       
/* 749 */       pointF = this.R.ab();
/* 750 */       this.d = null;
/*     */     } 
/*     */     
/* 753 */     this.S = pointF.a;
/* 754 */     this.T = pointF.b;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
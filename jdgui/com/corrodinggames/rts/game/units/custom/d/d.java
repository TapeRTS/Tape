/*     */ package com.corrodinggames.rts.game.units.custom.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class d
/*     */ {
/*  16 */   public static final d a = (new d()).a();
/*     */ 
/*     */   
/*  19 */   public final m b = new m();
/*     */   
/*     */   boolean c;
/*     */ 
/*     */   
/*     */   public strictfp d a() {
/*  25 */     this.c = true;
/*  26 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean b() {
/*  32 */     if (this.b.a == 0)
/*     */     {
/*  34 */       return true;
/*     */     }
/*     */     
/*  37 */     int i = this.b.a;
/*  38 */     Object[] arrayOfObject = this.b.a();
/*  39 */     for (byte b = 0; b < i; b++) {
/*     */       
/*  41 */       c c = (c)arrayOfObject[b];
/*  42 */       if (c.b != 0.0D)
/*     */       {
/*  44 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  48 */     return true;
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
/*     */   public strictfp double a(a parama) {
/*  81 */     int i = this.b.a;
/*  82 */     Object[] arrayOfObject = this.b.a();
/*  83 */     for (byte b = 0; b < i; b++) {
/*     */       
/*  85 */       c c = (c)arrayOfObject[b];
/*  86 */       if (c.a == parama)
/*     */       {
/*  88 */         return c.b;
/*     */       }
/*     */     } 
/*  91 */     return 0.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp double b(a parama) {
/*  97 */     int i = this.b.a;
/*  98 */     Object[] arrayOfObject = this.b.a();
/*     */     
/* 100 */     int j = 0;
/*     */     
/* 102 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 104 */       c c = (c)arrayOfObject[b];
/* 105 */       if (c.a == parama)
/*     */       {
/* 107 */         j = (int)(j + c.b);
/*     */       }
/*     */       
/* 110 */       if (c.a.i == parama)
/*     */       {
/* 112 */         j = (int)(j + c.b);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 117 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(a parama, double paramDouble) {
/* 123 */     if (this.c)
/*     */     {
/* 125 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 128 */     int i = this.b.a;
/* 129 */     Object[] arrayOfObject = this.b.a();
/* 130 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 132 */       c c1 = (c)arrayOfObject[b];
/* 133 */       if (c1.a == parama) {
/*     */         
/* 135 */         c1.b = paramDouble;
/*     */         return;
/*     */       } 
/*     */     } 
/* 139 */     c c = new c(parama);
/* 140 */     c.b = paramDouble;
/* 141 */     this.b.add(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(double paramDouble) {
/* 148 */     if (this.c)
/*     */     {
/* 150 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 153 */     int i = this.b.a;
/* 154 */     Object[] arrayOfObject = this.b.a();
/* 155 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 157 */       c c = (c)arrayOfObject[b];
/* 158 */       c.b *= paramDouble;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(a parama, double paramDouble) {
/* 164 */     if (this.c)
/*     */     {
/* 166 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/* 168 */     if (paramDouble == 0.0D) {
/*     */       return;
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
/* 183 */     m m1 = this.b;
/*     */     
/* 185 */     int i = m1.a;
/* 186 */     Object[] arrayOfObject = m1.a();
/* 187 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 189 */       c c1 = (c)arrayOfObject[b];
/* 190 */       if (c1.a == parama) {
/*     */         
/* 192 */         c1.b += paramDouble;
/*     */         return;
/*     */       } 
/*     */     } 
/* 196 */     c c = new c(parama);
/* 197 */     c.b = paramDouble;
/* 198 */     m1.add(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c(a parama, double paramDouble) {
/* 206 */     if (this.c)
/*     */     {
/* 208 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/* 210 */     if (paramDouble == 0.0D) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 215 */     m m1 = this.b;
/*     */     
/* 217 */     int i = m1.a;
/* 218 */     Object[] arrayOfObject = m1.a();
/* 219 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 221 */       c c1 = (c)arrayOfObject[b];
/* 222 */       if (c1.a == parama) {
/*     */         
/* 224 */         c1.b += paramDouble;
/*     */         return;
/*     */       } 
/*     */     } 
/* 228 */     c c = new c(parama);
/* 229 */     c.b = paramDouble;
/* 230 */     m1.add(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d(a parama, double paramDouble) {
/* 237 */     if (this.c)
/*     */     {
/* 239 */       throw new RuntimeException("StoredResources are locked");
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
/* 260 */     b(parama, -paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(g paramg) {
/* 270 */     c(a.l, paramg.b);
/* 271 */     a(paramg.k);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(d paramd) {
/* 276 */     if (this.c)
/*     */     {
/* 278 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 281 */     int i = paramd.b.a;
/* 282 */     Object[] arrayOfObject = paramd.b.a();
/* 283 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 285 */       c c = (c)arrayOfObject[b];
/* 286 */       b(c.a, c.b);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(d paramd, float paramFloat) {
/* 311 */     if (this.c)
/*     */     {
/* 313 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 316 */     int i = paramd.b.a;
/* 317 */     Object[] arrayOfObject = paramd.b.a();
/* 318 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 320 */       c c = (c)arrayOfObject[b];
/* 321 */       b(c.a, c.b * paramFloat);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(d paramd) {
/* 327 */     if (this.c)
/*     */     {
/* 329 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 332 */     int i = paramd.b.a;
/* 333 */     Object[] arrayOfObject = paramd.b.a();
/* 334 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 336 */       c c = (c)arrayOfObject[b];
/* 337 */       d(c.a, c.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp d a(d paramd1, d paramd2) {
/* 344 */     d d1 = new d();
/* 345 */     d1.a(paramd1);
/* 346 */     d1.a(paramd2);
/* 347 */     return d1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp d b(d paramd1, d paramd2) {
/* 352 */     d d1 = new d();
/* 353 */     d1.a(paramd1);
/* 354 */     d1.b(paramd2);
/* 355 */     return d1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp d b(d paramd, float paramFloat) {
/* 360 */     d d1 = new d();
/* 361 */     d1.a(paramd, paramFloat);
/* 362 */     return d1;
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
/*     */   public static strictfp int a(d paramd, af paramaf) {
/* 375 */     int i = 9999;
/*     */ 
/*     */     
/* 378 */     int j = paramd.b.a;
/* 379 */     Object[] arrayOfObject = paramd.b.a();
/* 380 */     for (byte b = 0; b < j; b++) {
/*     */       
/* 382 */       c c = (c)arrayOfObject[b];
/*     */ 
/*     */ 
/*     */       
/* 386 */       if (c.b > 0.0D) {
/*     */         double d1;
/* 388 */         if (c.a.g) {
/*     */           
/* 390 */           d1 = paramaf.bB.b(c.a);
/*     */         }
/*     */         else {
/*     */           
/* 394 */           d1 = paramaf.a(c.a);
/*     */         } 
/*     */ 
/*     */         
/* 398 */         int k = (int)(d1 / c.b);
/*     */ 
/*     */         
/* 401 */         i = f.c(i, k);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 406 */     return i;
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
/*     */   public static strictfp boolean b(d paramd, af paramaf) {
/* 428 */     int i = paramd.b.a;
/* 429 */     Object[] arrayOfObject = paramd.b.a();
/* 430 */     for (byte b = 0; b < i; b++) {
/*     */       double d1;
/* 432 */       c c = (c)arrayOfObject[b];
/*     */ 
/*     */ 
/*     */       
/* 436 */       if (c.a.g) {
/*     */         
/* 438 */         d1 = paramaf.bB.b(c.a);
/*     */       }
/*     */       else {
/*     */         
/* 442 */         d1 = paramaf.a(c.a);
/*     */       } 
/*     */       
/* 445 */       if (c.b > d1)
/*     */       {
/* 447 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 451 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c(d paramd, af paramaf) {
/* 456 */     int i = paramd.b.a;
/* 457 */     Object[] arrayOfObject = paramd.b.a();
/* 458 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 460 */       c c = (c)arrayOfObject[b];
/*     */       
/* 462 */       if (c.a.g) {
/*     */         
/* 464 */         d d1 = paramaf.bB.P();
/* 465 */         d1.d(c.a, c.b);
/*     */       }
/*     */       else {
/*     */         
/* 469 */         d d1 = paramaf.cN();
/* 470 */         d1.d(c.a, c.b);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void d(d paramd, af paramaf) {
/* 477 */     int i = paramd.b.a;
/* 478 */     Object[] arrayOfObject = paramd.b.a();
/* 479 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 481 */       c c = (c)arrayOfObject[b];
/*     */       
/* 483 */       if (c.a.g) {
/*     */         
/* 485 */         d d1 = paramaf.bB.P();
/* 486 */         d1.b(c.a, c.b);
/*     */       }
/*     */       else {
/*     */         
/* 490 */         d d1 = paramaf.cN();
/* 491 */         d1.b(c.a, c.b);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void a(d paramd, af paramaf, float paramFloat) {
/* 498 */     int i = paramd.b.a;
/* 499 */     Object[] arrayOfObject = paramd.b.a();
/* 500 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 502 */       c c = (c)arrayOfObject[b];
/*     */       
/* 504 */       if (c.a.g) {
/*     */         
/* 506 */         d d1 = paramaf.bB.P();
/* 507 */         d1.b(c.a, c.b * paramFloat);
/*     */       }
/*     */       else {
/*     */         
/* 511 */         d d1 = paramaf.cN();
/* 512 */         d1.b(c.a, c.b * paramFloat);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(d paramd, af paramaf1, af paramaf2) {
/* 574 */     boolean bool = false;
/*     */     
/* 576 */     int i = paramd.b.a;
/* 577 */     Object[] arrayOfObject = paramd.b.a();
/* 578 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 580 */       c c = (c)arrayOfObject[b];
/* 581 */       a a = c.a;
/*     */       
/* 583 */       double d1 = c.b;
/*     */       
/* 585 */       if (d1 != 0.0D) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 590 */         double d2 = a.a(paramaf1);
/* 591 */         double d3 = a.a(paramaf2);
/*     */ 
/*     */         
/* 594 */         if (d1 >= 0.0D) {
/*     */           
/* 596 */           if (d2 > 0.0D)
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 601 */             double d4 = f.a(d2, d1);
/* 602 */             a.b(paramaf1, -d4);
/* 603 */             a.b(paramaf2, d4);
/*     */             
/* 605 */             bool = true;
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/* 611 */         else if (d3 > 0.0D) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 616 */           d1 = -d1;
/*     */           
/* 618 */           double d4 = f.a(d3, d1);
/*     */           
/* 620 */           a.b(paramaf2, -d4);
/* 621 */           a.b(paramaf1, d4);
/*     */ 
/*     */           
/* 624 */           bool = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 629 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a(boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3, boolean paramBoolean4) {
/*     */     String str2;
/* 637 */     int i = this.b.a;
/* 638 */     if (i == 0)
/*     */     {
/* 640 */       return "";
/*     */     }
/*     */ 
/*     */     
/* 644 */     String str1 = "";
/*     */ 
/*     */     
/* 647 */     if (paramBoolean1) {
/*     */       
/* 649 */       str2 = "\n";
/*     */     }
/*     */     else {
/*     */       
/* 653 */       str2 = " | ";
/*     */     } 
/* 655 */     byte b1 = 0;
/*     */     
/* 657 */     Object[] arrayOfObject = this.b.a();
/* 658 */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       
/* 660 */       c c = (c)arrayOfObject[b2];
/*     */ 
/*     */       
/* 663 */       if ((c.b > 0.0D || paramBoolean4) && b1 < paramInt) {
/*     */         
/* 665 */         str1 = str1 + c.a.a(c.b, false) + str2;
/*     */ 
/*     */         
/* 668 */         b1++;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 674 */     return str1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 685 */     if (this.b.a == 0) {
/*     */       
/* 687 */       paramap.c(-1);
/*     */       
/*     */       return;
/*     */     } 
/* 691 */     paramap.c(0);
/* 692 */     paramap.a((short)this.b.a);
/*     */     
/* 694 */     int i = this.b.a;
/* 695 */     Object[] arrayOfObject = this.b.a();
/* 696 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 698 */       c c = (c)arrayOfObject[b];
/*     */       
/* 700 */       paramap.c(c.a.a);
/* 701 */       paramap.a(c.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 709 */     if (this.c)
/*     */     {
/* 711 */       throw new RuntimeException("StoredResources are locked");
/*     */     }
/*     */     
/* 714 */     byte b = paramk.d();
/* 715 */     if (b == -1) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 720 */     short s = paramk.t();
/*     */     
/* 722 */     this.b.clear();
/* 723 */     for (byte b1 = 0; b1 < s; b1++) {
/*     */ 
/*     */       
/* 726 */       a a = a.b(paramk.k());
/*     */       
/* 728 */       double d1 = paramk.h();
/*     */       
/* 730 */       if (a != null && d1 != 0.0D) {
/*     */         
/* 732 */         c c = new c(a, d1);
/* 733 */         this.b.add(c);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int c() {
/* 742 */     byte b1 = 0;
/*     */     
/* 744 */     int i = this.b.a;
/* 745 */     Object[] arrayOfObject = this.b.a();
/* 746 */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       
/* 748 */       c c = (c)arrayOfObject[b2];
/* 749 */       if (c.b != 0.0D)
/*     */       {
/* 751 */         b1++;
/*     */       }
/*     */     } 
/*     */     
/* 755 */     return b1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(d paramd) {
/* 761 */     if (c() != paramd.c())
/*     */     {
/*     */       
/* 764 */       return false;
/*     */     }
/*     */     
/* 767 */     int i = this.b.a;
/* 768 */     Object[] arrayOfObject = this.b.a();
/* 769 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 771 */       c c = (c)arrayOfObject[b];
/*     */       
/* 773 */       double d1 = paramd.a(c.a);
/* 774 */       if (!f.b(c.b, d1))
/*     */       {
/* 776 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 782 */     return true;
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
/*     */   public strictfp boolean d(d paramd) {
/* 814 */     int i = this.b.a;
/* 815 */     Object[] arrayOfObject = this.b.a();
/* 816 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 818 */       c c = (c)arrayOfObject[b];
/*     */       
/* 820 */       if (c.b > 0.0D) {
/*     */         
/* 822 */         double d1 = paramd.b(c.a);
/* 823 */         if (d1 > 0.0D)
/*     */         {
/* 825 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 831 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp d a(af paramaf) {
/* 837 */     d d1 = new d();
/*     */     
/* 839 */     int i = this.b.a;
/* 840 */     Object[] arrayOfObject = this.b.a();
/* 841 */     for (byte b = 0; b < i; b++) {
/*     */       double d2;
/* 843 */       c c = (c)arrayOfObject[b];
/*     */ 
/*     */ 
/*     */       
/* 847 */       if (c.a.g) {
/*     */         
/* 849 */         d2 = paramaf.bB.b(c.a);
/*     */       }
/*     */       else {
/*     */         
/* 853 */         d2 = paramaf.a(c.a);
/*     */       } 
/*     */       
/* 856 */       if (d2 < c.b) {
/*     */         
/* 858 */         double d3 = c.b - d2;
/* 859 */         d1.b(c.a, d3);
/*     */       } 
/*     */     } 
/*     */     
/* 863 */     if (d1.b())
/*     */     {
/* 865 */       return a;
/*     */     }
/*     */     
/* 868 */     return d1;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\d\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
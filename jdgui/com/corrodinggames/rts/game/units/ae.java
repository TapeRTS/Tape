/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.gameFramework.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ae
/*     */   extends o
/*     */ {
/*  23 */   static e[] a = new e[3];
/*     */ 
/*     */   
/*  26 */   static e b = null;
/*     */ 
/*     */   
/*     */   e c;
/*     */ 
/*     */   
/*     */   int d;
/*     */   
/*     */   int e;
/*     */   
/*  36 */   int f = 0;
/*     */   
/*     */   float g;
/*     */   
/*     */   boolean h;
/*     */   
/*     */   float i;
/*  43 */   int j = 0;
/*  44 */   int k = 0;
/*     */   
/*  46 */   float l = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean m = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b() {
/*  62 */     l l = l.u();
/*     */     
/*  64 */     a[0] = l.bw.a(R.drawable.palm_tree);
/*     */     
/*  66 */     a[1] = l.bw.a(R.drawable.trees);
/*     */     
/*  68 */     a[2] = l.bw.a(R.drawable.trees_snow);
/*     */ 
/*     */     
/*  71 */     b = l.bw.a(R.drawable.palm_leaves);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  78 */     paramap.a(this.d);
/*  79 */     paramap.a(this.f);
/*  80 */     paramap.a(this.g);
/*  81 */     paramap.a(this.h);
/*  82 */     paramap.a(this.i);
/*     */     
/*  84 */     paramap.c(2);
/*     */ 
/*     */     
/*  87 */     paramap.a(this.l);
/*     */ 
/*     */     
/*  90 */     paramap.a(this.e);
/*     */     
/*  92 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  97 */     this.d = paramk.f();
/*  98 */     this.f = paramk.f();
/*  99 */     this.g = paramk.g();
/* 100 */     this.h = paramk.e();
/* 101 */     this.i = paramk.g();
/*     */     
/* 103 */     byte b = paramk.d();
/*     */     
/* 105 */     if (b >= 1) {
/*     */       
/* 107 */       this.l = paramk.g();
/*     */     }
/*     */     else {
/*     */       
/* 111 */       this.l = 1.0F;
/*     */     } 
/*     */     
/* 114 */     if (b >= 2) {
/*     */       
/* 116 */       this.e = paramk.f();
/*     */     }
/*     */     else {
/*     */       
/* 120 */       this.e = 0;
/*     */     } 
/*     */ 
/*     */     
/* 124 */     b(this.d, this.e);
/*     */     
/* 126 */     super.a(paramk);
/*     */ 
/*     */     
/* 129 */     if (this.bz)
/*     */     {
/* 131 */       this.m = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e c() {
/* 141 */     return this.c;
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
/*     */   public boolean e() {
/* 158 */     f();
/*     */ 
/*     */ 
/*     */     
/* 162 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ae(boolean paramBoolean) {
/* 169 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     b(1, -1);
/*     */ 
/*     */ 
/*     */     
/* 180 */     this.bO = 3.0F;
/* 181 */     this.bP = this.bO + 1.0F;
/*     */     
/* 183 */     this.bZ = 100.0F;
/* 184 */     this.bY = this.bZ;
/*     */     
/* 186 */     this.bL = -90.0F;
/*     */ 
/*     */     
/* 189 */     R(3);
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
/*     */   public void a_(String paramString) {
/* 202 */     int i, j = -1;
/*     */     
/* 204 */     String[] arrayOfString = paramString.split("\\.");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     if (arrayOfString.length != 0 && arrayOfString.length != 1)
/*     */     {
/*     */ 
/*     */       
/* 213 */       if (arrayOfString.length == 2) {
/*     */ 
/*     */ 
/*     */         
/* 217 */         paramString = arrayOfString[0];
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 222 */           j = Integer.parseInt(arrayOfString[1]);
/*     */         }
/* 224 */         catch (NumberFormatException numberFormatException) {
/*     */           
/* 226 */           throw new RuntimeException("Tree sub type format error:" + arrayOfString[1]);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 231 */         throw new RuntimeException("Tree sub unknown format with parts:" + arrayOfString.length);
/*     */       } 
/*     */     }
/*     */     
/*     */     try {
/* 236 */       i = Integer.parseInt(paramString);
/*     */     }
/* 238 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 240 */       throw new RuntimeException("Tree type format error:" + paramString);
/*     */     } 
/*     */ 
/*     */     
/* 244 */     b(i, j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/* 254 */     this.d = paramInt1;
/* 255 */     this.e = paramInt2;
/*     */ 
/*     */     
/* 258 */     if (this.d == 0) {
/*     */       
/* 260 */       S(27);
/* 261 */       T(41);
/*     */       
/* 263 */       this.j = 1;
/* 264 */       this.k = 1;
/*     */       
/* 266 */       this.c = a[0];
/*     */     }
/* 268 */     else if (this.d == 1 || this.d == 2) {
/*     */ 
/*     */       
/* 271 */       if (paramInt2 == -1)
/*     */       {
/* 273 */         paramInt2 = f.a(0, 4, (int)this.dA);
/*     */       }
/*     */ 
/*     */       
/* 277 */       if (paramInt2 < 0 || paramInt2 > 4)
/*     */       {
/* 279 */         throw new RuntimeException("Tree subType out of range:" + paramInt2);
/*     */       }
/*     */       
/* 282 */       S(25);
/* 283 */       T(30);
/*     */       
/* 285 */       if (this.d == 1) {
/*     */         
/* 287 */         this.c = a[1];
/*     */       }
/*     */       else {
/*     */         
/* 291 */         this.c = a[2];
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 297 */       this.j = 0;
/* 298 */       this.k = 30 * paramInt2;
/*     */ 
/*     */       
/* 301 */       if (paramInt2 == 0) {
/*     */         
/* 303 */         this.l = f.a(1.0F, 1.2F, (int)this.dA + 1);
/*     */       }
/*     */       else {
/*     */         
/* 307 */         this.l = f.a(1.0F, 2.0F, (int)this.dA + 1);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 312 */       this.m = true;
/*     */     }
/*     */     else {
/*     */       
/* 316 */       throw new RuntimeException("Tree type:" + this.d + " is not supported");
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
/*     */   public void a(float paramFloat) {
/* 333 */     if (this.d == 0)
/*     */     {
/* 335 */       if (this.h) {
/*     */         
/* 337 */         if (this.f < 4)
/*     */         {
/* 339 */           this.g += paramFloat;
/*     */           
/* 341 */           if (this.g > 5.0F)
/*     */           {
/* 343 */             this.g = 0.0F;
/* 344 */             this.f++;
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       }
/* 350 */       else if (this.i != 0.0F) {
/*     */         
/* 352 */         this.i = f.a(this.i, 0.1F * paramFloat);
/* 353 */         this.f = 2;
/*     */ 
/*     */       
/*     */       }
/* 357 */       else if (this.f > 1) {
/*     */         
/* 359 */         this.f = 1;
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
/*     */   public Rect a_(boolean paramBoolean) {
/* 384 */     int i = this.j;
/* 385 */     int j = this.k;
/*     */     
/* 387 */     i += this.f * (this.dL + 1);
/*     */     
/* 389 */     de.a(i, j, i + this.dL, j + this.dM);
/*     */     
/* 391 */     return de;
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
/*     */   public boolean c(float paramFloat) {
/* 415 */     e e1 = c();
/*     */ 
/*     */     
/* 418 */     l l = l.u();
/*     */ 
/*     */     
/* 421 */     if (l.cE < 0.15D)
/*     */     {
/* 423 */       return false;
/*     */     }
/*     */     
/* 426 */     cW.a(cp());
/*     */     
/* 428 */     cW.a(0.0F, (int)-this.dJ);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 433 */     float f1 = cW.d();
/* 434 */     float f2 = cW.e();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 439 */     cX.a(a_(false));
/*     */     
/* 441 */     l l1 = l.bw;
/*     */     
/* 443 */     l1.j();
/*     */ 
/*     */     
/* 446 */     if (this.l != 1.0F)
/*     */     {
/* 448 */       l1.a(this.l, this.l, f1, f2);
/*     */     }
/*     */     
/* 451 */     if (this.m) {
/*     */       
/* 453 */       cX.a(this.dL, 0);
/* 454 */       l.bw.a(e1, cX, cW, null);
/* 455 */       cX.a(-this.dL, 0);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 463 */     l1.a(f(false), f1, f2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 470 */     l1.a(e1, cX, cW, null);
/*     */ 
/*     */     
/* 473 */     l1.k();
/*     */     
/* 475 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ah h() {
/* 484 */     return ah.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 490 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean P() {
/* 496 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ah() {
/* 502 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ai() {
/* 508 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 515 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b_() {
/* 521 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ak d() {
/* 527 */     return ak.A;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, float paramFloat) {
/* 536 */     if (!this.h) {
/*     */ 
/*     */       
/* 539 */       if (this.i == 0.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 550 */       this.bY -= paramaf.bB() / 3000.0F * this.bZ * 0.06F * paramFloat;
/* 551 */       this.i = 1.0F;
/* 552 */       this.cR = 1000.0F;
/*     */       
/* 554 */       if (this.bY <= 0.0F) {
/*     */         
/* 556 */         float f = f.d(this.dH, this.dI, paramaf.dH, paramaf.dI) + 180.0F;
/*     */ 
/*     */         
/* 559 */         this.bL = f;
/*     */         
/* 561 */         f();
/*     */       } 
/*     */ 
/*     */       
/* 565 */       if (!this.h)
/*     */       {
/* 567 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 572 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() {
/* 578 */     if (!this.h) {
/*     */       
/* 580 */       l l = l.u();
/*     */       
/* 582 */       this.f = 2;
/* 583 */       this.g = 0.0F;
/*     */       
/* 585 */       R(0);
/*     */       
/* 587 */       this.by = false;
/*     */       
/* 589 */       this.bz = true;
/* 590 */       this.bA = l.bh;
/*     */       
/* 592 */       this.h = true;
/*     */       
/* 594 */       this.m = false;
/*     */ 
/*     */       
/* 597 */       for (byte b1 = 0; b1 < 1; b1++) {
/*     */         
/* 599 */         l.bz.a();
/* 600 */         e e1 = l.bz.b(this.dH + f.c(-12.0F, 12.0F), this.dI + f.c(-12.0F, 12.0F), this.dJ, d.a, false, h.c);
/*     */         
/* 602 */         if (e1 != null) {
/*     */           
/* 604 */           e1.ap = 9;
/*     */           
/* 606 */           e1.ao = f.a(4, 5);
/*     */ 
/*     */           
/* 609 */           e1.Y = f.c(-180.0F, 180.0F);
/*     */           
/* 611 */           e1.am = true;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 616 */           e1.L = 5.0F + f.c(0.0F, 3.0F);
/*     */           
/* 618 */           e1.Q = f.c(-0.05F, 0.05F) + f.i(this.bL) * 0.4F;
/* 619 */           e1.R = f.c(-0.05F, 0.05F) + f.h(this.bL) * 0.4F;
/*     */           
/* 621 */           e1.w = true;
/* 622 */           e1.x = 0.2F;
/*     */           
/* 624 */           e1.H = 0.4F * this.l;
/* 625 */           e1.G = 0.4F * this.l;
/*     */           
/* 627 */           e1.W = (90 + f.a(0, 40));
/* 628 */           e1.X = e1.W;
/* 629 */           e1.s = true;
/*     */           
/* 631 */           e1.aq = 2;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 639 */       float f1 = this.dH + f.i(this.bL) * (this.dM - 5);
/* 640 */       float f2 = this.dI + f.h(this.bL) * (this.dM - 5);
/* 641 */       boolean bool = true;
/* 642 */       for (byte b2 = 0; b2 < 1; b2++) {
/*     */         
/* 644 */         byte b = 17;
/*     */         
/* 646 */         l.bz.a();
/*     */         
/* 648 */         e e1 = l.bz.b(f1 + f.c(-b, b), f2 + f.c(-b, b), this.dJ, d.a, false, h.c);
/*     */         
/* 650 */         if (e1 != null) {
/*     */           
/* 652 */           e1.ap = 9;
/*     */           
/* 654 */           e1.ao = f.a(4, 5);
/*     */           
/* 656 */           if (bool) {
/*     */             
/* 658 */             bool = false;
/* 659 */             e1.ao = 3;
/*     */           } 
/*     */           
/* 662 */           e1.Y = f.c(-180.0F, 180.0F);
/*     */           
/* 664 */           e1.am = true;
/*     */ 
/*     */           
/* 667 */           if (e1.ao == 3) {
/*     */             
/* 669 */             e1.Q = f.c(-0.05F, 0.05F);
/* 670 */             e1.R = f.c(-0.05F, 0.05F);
/*     */             
/* 672 */             e1.H = 1.5F * this.l;
/* 673 */             e1.G = 2.2F * this.l;
/* 674 */             e1.W = (90 + f.a(0, 40));
/*     */             
/* 676 */             e1.aq = 2;
/*     */           }
/*     */           else {
/*     */             
/* 680 */             e1.Q = f.c(-0.05F, 0.05F);
/* 681 */             e1.R = f.c(-0.05F, 0.0F);
/*     */             
/* 683 */             e1.H = 1.3F;
/* 684 */             e1.G = 1.3F;
/* 685 */             e1.W = (60 + f.a(0, 40));
/*     */             
/* 687 */             e1.aq = 1;
/*     */           } 
/*     */           
/* 690 */           e1.X = e1.W;
/* 691 */           e1.s = true;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 699 */       if (this.d == 1 || this.d == 2) {
/*     */ 
/*     */         
/* 702 */         this.dH += f.i(this.bL) * (this.dM / 2 - 3);
/* 703 */         this.dI += f.h(this.bL) * (this.dM / 2 - 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 714 */     super.n();
/*     */     
/* 716 */     this.bL = f.a(this.dI * 5.0F + this.dH * 3.0F, false);
/*     */ 
/*     */     
/* 719 */     if (this.d == 0)
/*     */     {
/*     */       
/* 722 */       this.f = (int)(this.dI * 5.0F + this.dH * 3.0F) % 1;
/*     */     }
/*     */     
/* 725 */     if (this.d == 1);
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
/*     */   public float a_() {
/* 741 */     return -1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 749 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(af paramaf, float paramFloat, f paramf) {
/* 759 */     boolean bool = this.bz;
/*     */     
/* 761 */     float f1 = super.a(paramaf, paramFloat, paramf);
/*     */     
/* 763 */     if (!bool && this.bz && paramf != null) {
/*     */       
/* 765 */       float f2 = f.d(this.dH, this.dI, paramf.dH, paramf.dI) + 180.0F;
/*     */       
/* 767 */       this.bL = f2;
/*     */     } 
/*     */     
/* 770 */     return f1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 777 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 785 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
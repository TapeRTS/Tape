/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class e
/*     */ {
/*     */   public f a;
/*     */   float b;
/*     */   float c;
/*  23 */   float d = 1.0F;
/*     */ 
/*     */   
/*     */   boolean e = false;
/*     */ 
/*     */   
/*     */   boolean f = false;
/*     */ 
/*     */   
/*     */   boolean g;
/*     */ 
/*     */   
/*     */   boolean h;
/*     */ 
/*     */   
/*     */   boolean i;
/*     */   
/*     */   int j;
/*     */   
/*  42 */   float k = 0.0F;
/*     */   
/*  44 */   float l = 0.05F;
/*     */ 
/*     */ 
/*     */   
/*     */   k m;
/*     */ 
/*     */   
/*     */   float[] n;
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e(k paramk) {
/*  56 */     this.m = paramk;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(f paramf, int paramInt) {
/*  63 */     a(paramf, paramInt, false);
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
/*     */   public strictfp void a(f paramf, int paramInt, boolean paramBoolean) {
/*  80 */     if (paramf == null || !paramf.a()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     if (this.i || (this.f && this.e))
/*     */     {
/*  90 */       if (paramInt <= this.j)
/*     */       {
/*  92 */         if (!paramBoolean || paramf != this.a) {
/*     */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*  99 */     this.i = true;
/*     */     
/* 101 */     if (paramf != this.a || paramBoolean || this.g) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       float f1 = 0.0F;
/* 107 */       if (this.a != null && this.e)
/*     */       {
/* 109 */         f1 = this.a.i;
/*     */       }
/*     */ 
/*     */       
/* 113 */       this.a = paramf;
/* 114 */       this.j = paramInt;
/*     */ 
/*     */       
/* 117 */       c();
/*     */ 
/*     */ 
/*     */       
/* 121 */       this.f = paramBoolean;
/*     */       
/* 123 */       if (paramBoolean) {
/*     */         
/* 125 */         this.h = false;
/*     */       }
/*     */       else {
/*     */         
/* 129 */         this.h = true;
/*     */       } 
/*     */ 
/*     */       
/* 133 */       this.b = -1.0F;
/* 134 */       this.c = -1.0F;
/*     */       
/* 136 */       this.d = 1.0F;
/*     */       
/* 138 */       this.g = false;
/*     */ 
/*     */       
/* 141 */       float f2 = paramf.h;
/*     */       
/* 143 */       if (f1 > f2)
/*     */       {
/* 145 */         f2 = f1;
/*     */       }
/*     */       
/* 148 */       if (f2 > 0.0F) {
/*     */         
/* 150 */         this.k = 1.0F;
/* 151 */         this.l = f2;
/*     */       }
/*     */       else {
/*     */         
/* 155 */         this.k = 0.0F;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     this.e = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 171 */     if (this.a != null) {
/*     */       
/* 173 */       boolean bool = true;
/* 174 */       a(bool);
/*     */     } 
/*     */     
/* 177 */     this.e = false;
/*     */     
/* 179 */     this.a = null;
/* 180 */     this.j = -1;
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
/*     */   public strictfp void b() {
/* 193 */     if (this.a != null) {
/*     */       
/* 195 */       if (!this.g) {
/*     */ 
/*     */         
/* 198 */         float f1 = this.a.i;
/*     */ 
/*     */         
/* 201 */         if (f1 > 0.0F) {
/*     */           
/* 203 */           this.g = true;
/* 204 */           c();
/* 205 */           this.h = false;
/*     */           
/* 207 */           this.j = -1;
/*     */           
/* 209 */           this.k = 1.0F;
/* 210 */           this.l = f1;
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */       
/* 217 */       boolean bool = true;
/* 218 */       a(bool);
/*     */     } 
/*     */     
/* 221 */     this.e = false;
/*     */     
/* 223 */     this.a = null;
/* 224 */     this.j = -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 232 */     if (!this.e) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 238 */     this.c = this.b;
/* 239 */     if (this.b < 0.0F)
/*     */     {
/* 241 */       this.b = 0.0F;
/*     */     }
/* 243 */     this.b += this.d * paramFloat;
/*     */ 
/*     */     
/* 246 */     if (this.h && !this.i)
/*     */     {
/* 248 */       b();
/*     */     }
/*     */     
/* 251 */     this.i = false;
/*     */ 
/*     */     
/* 254 */     if (this.e) {
/*     */       
/* 256 */       if (this.k > 0.0F) {
/*     */         
/* 258 */         this.k -= this.l * paramFloat;
/*     */ 
/*     */       
/*     */       }
/* 262 */       else if (this.g) {
/*     */         
/* 264 */         b();
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 270 */       if (!this.g && this.a != null)
/*     */       {
/* 272 */         if (this.a.g) {
/*     */           
/* 274 */           if (this.b > this.a.m)
/*     */           {
/* 276 */             this.b = this.a.m;
/* 277 */             this.d = -1.0F;
/*     */           }
/* 279 */           else if (this.b < 0.0F)
/*     */           {
/* 281 */             this.b = 0.0F;
/* 282 */             this.d = 1.0F;
/*     */             
/* 284 */             if (this.f)
/*     */             {
/* 286 */               b();
/* 287 */               if (!this.g)
/*     */               {
/*     */                 return;
/*     */               
/*     */               }
/*     */             
/*     */             }
/*     */           
/*     */           }
/*     */         
/*     */         }
/* 298 */         else if (this.b > this.a.m) {
/*     */           
/* 300 */           if (this.f) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 305 */             b();
/* 306 */             if (!this.g)
/*     */             {
/*     */               return;
/*     */             
/*     */             }
/*     */           }
/*     */           else {
/*     */             
/* 314 */             this.b = 0.0F;
/* 315 */             this.d = 1.0F;
/*     */           } 
/*     */         } 
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 324 */       boolean bool = false;
/*     */       
/* 326 */       if (this.g)
/*     */       {
/* 328 */         bool = true;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 333 */       a(bool);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp void c() {
/* 483 */     m m = this.a.k;
/*     */     
/* 485 */     if (this.n == null || this.n.length < m.size())
/*     */     {
/* 487 */       this.n = new float[m.size()];
/*     */     }
/* 489 */     for (byte b = 0; b < m.size(); b++) {
/*     */       
/* 491 */       c c = (c)m.get(b);
/*     */       
/* 493 */       d d = c.a;
/*     */ 
/*     */       
/* 496 */       if (d == d.b) {
/*     */         
/* 498 */         this.n[b] = this.m.c;
/*     */       }
/* 500 */       else if (d == d.a) {
/*     */ 
/*     */         
/* 503 */         this.n[b] = -99.0F;
/*     */       }
/* 505 */       else if (d == d.c) {
/*     */         
/* 507 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 509 */           d d1 = this.m.ds[c.b];
/* 510 */           this.n[b] = d1.p;
/*     */         }
/*     */         else
/*     */         {
/* 514 */           this.n[b] = 0.0F;
/* 515 */           l.b("setBaseBlendValues: Target leg out of range for: " + this.m.da().i());
/*     */         }
/*     */       
/*     */       }
/* 519 */       else if (d == d.d) {
/*     */         
/* 521 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 523 */           d d1 = this.m.ds[c.b];
/*     */           
/* 525 */           this.n[b] = d1.q;
/*     */         }
/*     */       
/*     */       }
/* 529 */       else if (d == d.e) {
/*     */         
/* 531 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 533 */           (this.m.ds[c.b]).r = f.a((this.m.ds[c.b]).r, false);
/*     */           
/* 535 */           this.n[b] = (this.m.ds[c.b]).r;
/*     */         }
/*     */       
/* 538 */       } else if (d == d.f) {
/*     */         
/* 540 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 542 */           this.n[b] = (this.m.ds[c.b]).d;
/*     */         }
/*     */       }
/* 545 */       else if (d == d.j) {
/*     */         
/* 547 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 549 */           this.n[b] = (this.m.ds[c.b]).s;
/*     */         }
/*     */       }
/* 552 */       else if (d != d.i) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 558 */         this.n[b] = 0.0F;
/* 559 */         l.b("Unsupported blend type:" + d);
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
/*     */   strictfp void a(boolean paramBoolean) {
/* 575 */     m m = this.a.k;
/*     */ 
/*     */ 
/*     */     
/* 579 */     for (byte b = 0; b < m.size(); b++) {
/*     */       float f1;
/* 581 */       c c = (c)m.get(b);
/* 582 */       d d = c.a;
/*     */ 
/*     */       
/* 585 */       if (d == d.a)
/*     */       {
/* 587 */         if (!this.m.dE && !paramBoolean) {
/*     */           continue;
/*     */         }
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 596 */       if (paramBoolean) {
/*     */         
/* 598 */         f1 = 0.0F;
/*     */         
/* 600 */         if (d == d.b)
/*     */         {
/* 602 */           f1 = 1.0F;
/*     */         }
/* 604 */         else if (d == d.a)
/*     */         {
/* 606 */           f1 = this.m.v.P;
/*     */         }
/* 608 */         else if (d == d.j)
/*     */         {
/* 610 */           f1 = 1.0F;
/* 611 */           af[] arrayOfAf = this.m.v.am;
/* 612 */           if (arrayOfAf != null && c.b < arrayOfAf.length)
/*     */           {
/* 614 */             f1 = (arrayOfAf[c.b]).o;
/*     */           }
/*     */         }
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 621 */         f1 = c.b(this.b);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 626 */       if (this.k > 0.0F && d != d.a)
/*     */       {
/* 628 */         f1 = f1 * (1.0F - this.k) + this.n[b] * this.k;
/*     */       }
/*     */       
/* 631 */       if (d == d.a) {
/*     */         
/* 633 */         this.m.a = (int)f1;
/*     */       }
/* 635 */       else if (d == d.b) {
/*     */         
/* 637 */         this.m.c = f1;
/*     */       }
/* 639 */       else if (d == d.c) {
/*     */         
/* 641 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 643 */           d d1 = this.m.ds[c.b];
/* 644 */           d1.p = f1;
/* 645 */           d1.k = true;
/* 646 */           d1.o = true;
/*     */         }
/*     */       
/* 649 */       } else if (d == d.d) {
/*     */         
/* 651 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 653 */           d d1 = this.m.ds[c.b];
/* 654 */           d1.q = f1;
/* 655 */           d1.k = true;
/* 656 */           d1.o = true;
/*     */         }
/*     */       
/* 659 */       } else if (d == d.e) {
/*     */         
/* 661 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 663 */           (this.m.ds[c.b]).r = f1;
/*     */         }
/*     */       }
/* 666 */       else if (d == d.f) {
/*     */         
/* 668 */         if (this.m.ds != null && c.b < this.m.ds.length)
/*     */         {
/* 670 */           (this.m.ds[c.b]).d = f1;
/*     */         
/*     */         }
/*     */       }
/* 674 */       else if (d == d.j) {
/*     */         
/* 676 */         d[] arrayOfD = this.m.ds;
/*     */         
/* 678 */         if (arrayOfD != null && c.b < arrayOfD.length)
/*     */         {
/* 680 */           (arrayOfD[c.b]).s = f1;
/*     */         }
/*     */       }
/* 683 */       else if (d != d.g) {
/*     */ 
/*     */ 
/*     */         
/* 687 */         if (d == d.i)
/*     */         {
/* 689 */           c.a(this.m, this.c, this.b, paramBoolean);
/*     */         }
/*     */       } 
/*     */       continue;
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
/*     */   public strictfp boolean a(f paramf) {
/* 709 */     return (this.e && this.a == paramf);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
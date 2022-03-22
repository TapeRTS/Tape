/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.an;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ab
/*     */ {
/*  91 */   m a = new m();
/*     */ 
/*     */   
/*     */   boolean b;
/*     */   
/*     */   float c;
/*     */   
/*     */   float d;
/*     */   
/*     */   int e;
/*     */   
/*     */   boolean f;
/*     */   
/*     */   public m g;
/*     */ 
/*     */   
/*     */   public ab(aa paramaa) {}
/*     */ 
/*     */   
/*     */   public void a(r paramr, an paraman) {
/* 111 */     paraman.i = this;
/*     */ 
/*     */     
/* 114 */     this.f = paraman.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(an paraman) {
/* 121 */     for (r r : this.a) {
/*     */       
/* 123 */       if (!r.bz) {
/*     */         
/* 125 */         an an1 = r.ap();
/*     */         
/* 127 */         if (an1 != null)
/*     */         {
/* 129 */           if (an1.b(paraman))
/*     */           {
/* 131 */             r.aw();
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 141 */     this.a.clear();
/*     */     
/* 143 */     af[] arrayOfAf = af.bj.a(); byte b; int i;
/* 144 */     for (b = 0, i = af.bj.size(); b < i; b++) {
/*     */       
/* 146 */       af af = arrayOfAf[b];
/*     */       
/* 148 */       if (af instanceof r) {
/*     */         
/* 150 */         r r = (r)af;
/*     */         
/* 152 */         if (r.I()) {
/*     */ 
/*     */           
/* 155 */           an an = r.ap();
/*     */           
/* 157 */           if (an != null && an.i == this && r.bb()) {
/*     */             
/* 159 */             this.a.add(r);
/*     */ 
/*     */             
/* 162 */             this.c = an.g();
/* 163 */             this.d = an.h();
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
/*     */   public void a(r paramr) {
/* 175 */     paramr.T = this.e;
/* 176 */     an an = paramr.ap();
/* 177 */     if (an != null)
/*     */     {
/* 179 */       an.i = this;
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
/*     */   public void b() {
/* 194 */     long l = bj.a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     c();
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
/*     */   public r a(m paramm, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 222 */     float f = -1.0F;
/*     */ 
/*     */     
/* 225 */     r r = null;
/*     */     
/* 227 */     for (r r1 : paramm) {
/*     */       
/* 229 */       if (paramBoolean || (r1.U == null && !r1.V)) {
/*     */         
/* 231 */         float f1 = f.b(paramFloat1, paramFloat2, r1.dH, r1.dI);
/*     */         
/* 233 */         if (r1.W)
/*     */         {
/* 235 */           f1 -= 160.0F;
/*     */         }
/*     */ 
/*     */         
/* 239 */         if (f == -1.0F || f1 < f) {
/*     */           
/* 241 */           f = f1;
/* 242 */           r = r1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 247 */     return r;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public m a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 258 */     m m1 = new m(1);
/*     */     
/* 260 */     m m2 = new m();
/* 261 */     m2.clear();
/* 262 */     m2.addAll((Collection)this.a);
/*     */ 
/*     */     
/*     */     while (true) {
/* 266 */       r r = a(m2, paramFloat1, paramFloat2, true);
/* 267 */       if (r == null) {
/*     */         break;
/*     */       }
/*     */       
/* 271 */       m1.add(r);
/*     */       
/* 273 */       m2.remove(r);
/*     */       
/* 275 */       m m3 = a(m2, r, true, paramBoolean);
/*     */       
/* 277 */       m2.removeAll((Collection)m3);
/*     */     } 
/*     */ 
/*     */     
/* 281 */     return m1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public m a(m paramm, r paramr, boolean paramBoolean1, boolean paramBoolean2) {
/* 289 */     m m1 = new m(1);
/*     */     
/* 291 */     m1.clear();
/*     */     
/* 293 */     byte b1 = 0;
/*     */     
/* 295 */     boolean bool = false;
/* 296 */     byte b2 = 25;
/*     */ 
/*     */     
/* 299 */     Object[] arrayOfObject = paramm.a(); byte b3; int i;
/* 300 */     for (b3 = 0, i = paramm.size(); b3 < i; b3++) {
/*     */       
/* 302 */       r r1 = (r)arrayOfObject[b3];
/* 303 */       r1.ag = false;
/*     */     } 
/*     */ 
/*     */     
/* 307 */     for (b3 = 0; b3 <= 2; b3++) {
/*     */       int j;
/*     */       
/* 310 */       for (i = 0, j = paramm.size(); i < j; i++) {
/*     */         
/* 312 */         r r1 = (r)arrayOfObject[i];
/*     */ 
/*     */ 
/*     */         
/* 316 */         if (!r1.ag && r1 != paramr)
/*     */         {
/*     */           
/* 319 */           if (paramBoolean1 || (r1.U == null && !r1.V))
/*     */           {
/* 321 */             if (r1.h() == paramr.h()) {
/*     */               
/* 323 */               float f = f.a(r1.dH, r1.dI, paramr.dH, paramr.dI);
/*     */               
/* 325 */               if (b3 == 0)
/*     */               {
/* 327 */                 if (f > 3600.0F) {
/*     */                   continue;
/*     */                 }
/*     */               }
/*     */               
/* 332 */               if (b3 == 1)
/*     */               {
/* 334 */                 if (f > 14400.0F) {
/*     */                   continue;
/*     */                 }
/*     */               }
/*     */ 
/*     */               
/* 340 */               if ((paramBoolean2 && f < 160000.0F) || (f < 40000.0F && b1 < 25))
/*     */               {
/*     */ 
/*     */                 
/* 344 */                 if (paramBoolean2 || f.c(r1.z() - paramr.z()) < 0.4F) {
/*     */ 
/*     */                   
/* 347 */                   r1.ag = true;
/*     */                   
/* 349 */                   m1.add(r1);
/* 350 */                   b1++;
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           }
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         continue;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 368 */     return m1;
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
/*     */   public void c() {
/* 380 */     l l = l.u();
/*     */     
/* 382 */     float f1 = 0.0F;
/* 383 */     float f2 = 0.0F;
/* 384 */     float f3 = 0.0F;
/* 385 */     float f4 = 0.0F;
/*     */     
/* 387 */     long l1 = bj.a();
/*     */     
/* 389 */     a();
/*     */     
/* 391 */     this.h.b.a(0.0F, 0.0F);
/*     */     
/* 393 */     for (r r : this.a)
/*     */     {
/* 395 */       this.h.b.b(r.dH, r.dI);
/*     */     }
/* 397 */     this.h.b.a(this.h.b.a / this.a.size(), this.h.b.b / this.a.size());
/*     */ 
/*     */     
/* 400 */     float f5 = f.d(this.h.b.a, this.h.b.b, this.c, this.d);
/*     */     
/* 402 */     for (r r : this.a) {
/*     */       
/* 404 */       if (r.Y > 1) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 413 */         r.W = r.V;
/*     */       }
/*     */       else {
/*     */         
/* 417 */         r.W = false;
/*     */       } 
/*     */       
/* 420 */       if (r.W)
/*     */       {
/* 422 */         if (r.Y > 7) {
/*     */           
/* 424 */           float f = f.c(r.ad, f5, 360.0F);
/* 425 */           if (f.c(f) > 80.0F)
/*     */           {
/* 427 */             r.W = false;
/*     */           }
/*     */         } 
/*     */       }
/*     */       
/* 432 */       r.az();
/*     */       
/* 434 */       r.Y = 0;
/*     */       
/* 436 */       r.ae = l.bh;
/* 437 */       r.T = this.e;
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
/* 451 */     byte b = 0;
/*     */ 
/*     */     
/*     */     while (true) {
/* 455 */       r r = null;
/*     */ 
/*     */ 
/*     */       
/* 459 */       long l2 = bj.a();
/*     */       
/* 461 */       r = a(this.a, this.c, this.d, false);
/*     */       
/* 463 */       if (r == null) {
/*     */         return;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 482 */       r.V = true;
/*     */       
/* 484 */       ab ab1 = null;
/* 485 */       if (b)
/*     */       {
/* 487 */         ab1 = this.h.b();
/*     */       }
/*     */       
/* 490 */       if (ab1 != null) {
/*     */         
/* 492 */         ab1.g = this.g;
/* 493 */         ab1.a(r);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 498 */       m m1 = a(this.a, r, false, this.f);
/*     */       
/* 500 */       byte b1 = 0;
/* 501 */       float f = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 508 */       for (r r1 : m1) {
/*     */         
/* 510 */         if (r1.bO > f)
/*     */         {
/* 512 */           f = r1.bO;
/*     */         }
/*     */         
/* 515 */         r1.a(r);
/* 516 */         if (ab1 != null)
/*     */         {
/* 518 */           ab1.a(r1);
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 527 */         b1++;
/*     */       } 
/*     */       
/* 530 */       if (r != null)
/*     */       {
/* 532 */         r.Y = (short)(b1 + 1);
/*     */       }
/*     */       
/* 535 */       m m2 = new m();
/*     */       
/* 537 */       Object[] arrayOfObject = this.a.a(); byte b2; int i;
/* 538 */       for (b2 = 0, i = this.a.size(); b2 < i; b2++) {
/*     */         
/* 540 */         r r1 = (r)arrayOfObject[b2];
/* 541 */         if (r1.U == r)
/*     */         {
/* 543 */           m2.add(r1);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 553 */       m m3 = this.h.a(b1, f, f5);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 571 */       long l3 = bj.a();
/*     */       
/* 573 */       this.h.a(m2, r, m3, f5, b1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 583 */       long l4 = bj.a();
/*     */ 
/*     */       
/* 586 */       this.h.a(m2, r);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 596 */       b++;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.a.w;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.bi;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/*     */   r a;
/* 109 */   public PointF b = null;
/*     */ 
/*     */   
/*     */   public final m c;
/*     */ 
/*     */   
/*     */   final m d;
/*     */ 
/*     */   
/*     */   public float e;
/*     */ 
/*     */   
/*     */   i f;
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 126 */     paramap.a(this.e);
/*     */ 
/*     */ 
/*     */     
/* 130 */     paramap.a(this.c.size());
/* 131 */     for (bi bi : this.c)
/*     */     {
/* 133 */       bi.a(paramap);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 138 */     paramap.a((this.b != null));
/* 139 */     if (this.b != null) {
/*     */       
/* 141 */       paramap.a(this.b.a);
/* 142 */       paramap.a(this.b.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 149 */     this.e = paramk.g();
/*     */ 
/*     */ 
/*     */     
/* 153 */     int n = paramk.f();
/* 154 */     this.c.clear();
/* 155 */     for (byte b = 0; b < n; b++) {
/*     */       
/* 157 */       i i1 = new i();
/*     */       
/* 159 */       i1.a(paramk);
/*     */       
/* 161 */       if (s.c(i1.h)) {
/*     */ 
/*     */         
/* 164 */         s s = this.a.a(i1.h);
/* 165 */         if (s == null)
/*     */         {
/* 167 */           l.b("Factory", this.a.r() + " no longer has the action:" + i1.h);
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */           
/* 177 */           this.c.add(i1);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 182 */         l.b("Factory", "buildQueue has uIndex of -1, skipping");
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 188 */     if (paramk.b() >= 5) {
/*     */       
/* 190 */       boolean bool = paramk.e();
/* 191 */       if (bool) {
/*     */         
/* 193 */         if (this.b == null)
/*     */         {
/* 195 */           this.b = new PointF();
/*     */         }
/* 197 */         this.b.a = paramk.g();
/* 198 */         this.b.b = paramk.g();
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 203 */         this.b = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp af a(i parami, float paramFloat1, boolean paramBoolean, float paramFloat2) {
/* 213 */     s s = this.a.a(parami.h);
/*     */     
/* 215 */     if (s == null) {
/*     */       
/* 217 */       ad.a("specialAction=null on completeQueueItem for item.uIndex:" + parami.h + " id:" + this.a.dA, true);
/* 218 */       return null;
/*     */     } 
/*     */     
/* 221 */     al al = s.i();
/*     */     
/* 223 */     if (al == null) {
/*     */       
/* 225 */       ad.a("unitType=null on completeQueueItem for item.uIndex:" + parami.h + " id:" + this.a.dA, false);
/* 226 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 230 */     return a(al, paramFloat1, paramBoolean, paramFloat2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, float paramFloat, boolean paramBoolean) {
/* 237 */     paramaf.bQ = 30.0F;
/*     */     
/* 239 */     if (this.a instanceof e)
/*     */     {
/* 241 */       paramaf.bQ += 40.0F;
/*     */     }
/*     */     
/* 244 */     if (paramaf instanceof r) {
/*     */       
/* 246 */       r r1 = (r)paramaf;
/*     */       
/* 248 */       r1.j(90.0F);
/*     */       
/* 250 */       if (r1.z() < 0.75D)
/*     */       {
/* 252 */         paramaf.bQ += 30.0F;
/*     */       }
/*     */       
/* 255 */       if (r1.z() < 0.55D)
/*     */       {
/* 257 */         paramaf.bQ += 20.0F;
/*     */       }
/*     */       
/* 260 */       float f1 = paramBoolean ? 0.0F : 1.0F;
/*     */ 
/*     */ 
/*     */       
/* 264 */       float f2 = paramFloat;
/*     */       
/* 266 */       float f3 = this.a.dH + f.i(paramaf.bL) * f2;
/* 267 */       float f4 = this.a.dI + f.h(paramaf.bL) * f2;
/*     */       
/* 269 */       if (this.b != null) {
/*     */ 
/*     */ 
/*     */         
/* 273 */         if (f2 != 0.0F)
/*     */         {
/* 275 */           r1.d(f3, f4);
/*     */         }
/*     */         
/* 278 */         r1.d(this.b.a + f1, this.b.b);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 284 */         f3 -= f.h(paramaf.bL) * f1;
/* 285 */         f4 += f.i(paramaf.bL) * f1;
/*     */         
/* 287 */         if (f2 != 0.0F)
/*     */         {
/* 289 */           r1.d(f3, f4);
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
/*     */   public strictfp af a(al paramal, float paramFloat1, boolean paramBoolean, float paramFloat2) {
/* 301 */     af af = null;
/*     */     
/* 303 */     af = paramal.a();
/*     */     
/* 305 */     af.dH = this.a.dH;
/* 306 */     af.dI = this.a.dI + 5.0F;
/* 307 */     af.bL = 90.0F + paramFloat2;
/*     */ 
/*     */ 
/*     */     
/* 311 */     af.d(this.a.bB);
/*     */     
/* 313 */     af.cx();
/*     */     
/* 315 */     a(af, paramFloat1, paramBoolean);
/*     */     
/* 317 */     l l = l.u();
/*     */     
/* 319 */     if (af.bB == l.bb)
/*     */     {
/* 321 */       l.bA.f.a(af);
/*     */     }
/*     */     
/* 324 */     return af;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp boolean a() {
/* 332 */     return (this.c.a == 0);
/*     */   }
/*     */   
/*     */   public strictfp j(r paramr) {
/* 336 */     this.c = new m();
/*     */     
/* 338 */     this.d = new m();
/*     */     this.a = paramr;
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
/*     */   public strictfp i a(w paramw, boolean paramBoolean) {
/* 351 */     return a(paramw, paramBoolean, (PointF)null, (af)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp i a(w paramw, boolean paramBoolean, PointF paramPointF, af paramaf) {
/* 357 */     i i1 = new i();
/*     */     
/* 359 */     i1.h = paramw.J();
/*     */ 
/*     */     
/* 362 */     i1.f = paramPointF;
/* 363 */     i1.g = paramaf;
/*     */     
/* 365 */     if (i1.h == null)
/*     */     {
/* 367 */       throw new RuntimeException("item.uIndex==null??");
/*     */     }
/*     */     
/* 370 */     i1.a = 1;
/* 371 */     i1.b = paramw.t();
/*     */ 
/*     */ 
/*     */     
/* 375 */     i1.c = paramw.y();
/*     */     
/* 377 */     i1.d = paramw.g();
/*     */     
/* 379 */     i1.e = paramw.i();
/*     */ 
/*     */     
/* 382 */     i1.j = paramw.E();
/*     */     
/* 384 */     if (!paramBoolean) {
/*     */       
/* 386 */       m.b((af)this.a);
/*     */       
/* 388 */       if (i1.j) {
/*     */ 
/*     */         
/* 391 */         int k = 0;
/* 392 */         for (byte b = 0; b < this.c.size();) {
/*     */           
/* 394 */           if (((i)this.c.get(b)).j) {
/*     */             
/* 396 */             k = b + 1;
/*     */ 
/*     */             
/*     */             b++;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 404 */         if (k != 0 || this.c.size() != 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 413 */         this.c.add(k, i1);
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 418 */         this.c.add(i1);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 423 */       m.c((af)this.a);
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 430 */       this.d.add(i1);
/*     */     } 
/*     */ 
/*     */     
/* 434 */     return i1;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp i b(w paramw, boolean paramBoolean) {
/* 439 */     if (paramBoolean) {
/*     */       
/* 441 */       if (a(paramw.J(), true) > 0) {
/*     */         
/* 443 */         i i1 = a(paramw, true);
/* 444 */         i1.i = true;
/* 445 */         return i1;
/*     */       } 
/* 447 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 451 */     m m1 = this.c;
/*     */     
/* 453 */     ListIterator<i> listIterator = m1.listIterator(m1.size());
/*     */     
/* 455 */     while (listIterator.hasPrevious()) {
/*     */       
/* 457 */       i i1 = listIterator.previous();
/*     */       
/* 459 */       if (i1.h.equals(paramw.J())) {
/*     */         
/* 461 */         m.b((af)this.a);
/*     */         
/* 463 */         listIterator.remove();
/*     */         
/* 465 */         m.c((af)this.a);
/*     */ 
/*     */         
/* 468 */         return i1;
/*     */       } 
/*     */     } 
/*     */     
/* 472 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp i b() {
/* 479 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp s c() {
/* 485 */     if (this.f != null)
/*     */     {
/* 487 */       return this.a.a(this.f.h);
/*     */     }
/*     */     
/* 490 */     return null;
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
/*     */   public strictfp void a(float paramFloat) {
/* 504 */     if (!a()) {
/*     */ 
/*     */       
/* 507 */       i i1 = g().get(0);
/*     */       
/* 509 */       if (this.f != i1) {
/*     */         
/* 511 */         if (i1.k < 0.0F) {
/*     */           
/* 513 */           i1.k = 0.0F;
/* 514 */           ((k)this.a).b(i1);
/*     */         } 
/*     */         
/* 517 */         if (this.f != null)
/*     */         {
/*     */           
/* 520 */           this.e = i1.k;
/*     */         }
/* 522 */         this.f = i1;
/*     */       } 
/*     */ 
/*     */       
/* 526 */       this.e += i1.b * this.a.ch() * paramFloat;
/* 527 */       i1.k = this.e;
/*     */       
/* 529 */       if (this.e > 1.0F)
/*     */       {
/*     */         
/* 532 */         if (i1.d && ((k)this.a).dg())
/*     */         {
/* 534 */           this.e = 1.0F;
/*     */         
/*     */         }
/*     */         else
/*     */         {
/* 539 */           m.b((af)this.a);
/*     */           
/* 541 */           this.e = 0.0F;
/*     */ 
/*     */           
/* 544 */           i1.a--;
/*     */           
/* 546 */           if (i1.a <= 0) {
/*     */             
/* 548 */             List list = g();
/*     */             
/* 550 */             if (list.size() == 0) {
/*     */               
/* 552 */               l.b("-------------buildQueue empty for:" + i1.h);
/* 553 */               l.b("-------------");
/*     */             }
/*     */             else {
/*     */               
/* 557 */               list.remove(0);
/*     */             } 
/*     */           } 
/*     */           
/* 561 */           m.c((af)this.a);
/*     */ 
/*     */           
/* 564 */           ((k)this.a).a(i1);
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 573 */       this.f = null;
/* 574 */       this.e = 0.0F;
/*     */ 
/*     */       
/* 577 */       if (this.d.a > 0) {
/*     */         
/* 579 */         i i1 = (i)this.d.get(0);
/*     */         
/* 581 */         if (i1.b > 10.0F)
/*     */         {
/* 583 */           if (i1.k <= 0.0F) {
/*     */             
/* 585 */             i1.k = 1.0F;
/*     */             
/* 587 */             s s = this.a.a(i1.h);
/*     */             
/* 589 */             if (s != null)
/*     */             {
/* 591 */               if (s.L()) {
/*     */                 
/* 593 */                 l.d("fakeAntiLagIssue:" + i1.h);
/*     */                 
/* 595 */                 s.a(this.a);
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
/*     */   public strictfp void d() {
/* 612 */     Iterator<i> iterator = this.c.iterator();
/* 613 */     while (iterator.hasNext()) {
/*     */       
/* 615 */       i i1 = iterator.next();
/*     */       
/* 617 */       s s = this.a.a(i1.h);
/* 618 */       if (s == null) {
/*     */ 
/*     */ 
/*     */         
/* 622 */         i1.c.f((af)this.a);
/*     */         
/* 624 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 634 */     Iterator<i> iterator = this.c.iterator();
/* 635 */     while (iterator.hasNext()) {
/*     */       
/* 637 */       i i1 = iterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 653 */       i1.c.f((af)this.a);
/*     */ 
/*     */       
/* 656 */       iterator.remove();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int a(al paramal) {
/* 663 */     int k = 0;
/*     */     
/* 665 */     int n = this.c.a;
/* 666 */     if (n != 0) {
/*     */       
/* 668 */       Object[] arrayOfObject = this.c.a();
/* 669 */       for (byte b = 0; b < n; b++) {
/*     */         
/* 671 */         i i1 = (i)arrayOfObject[b];
/*     */         
/* 673 */         if (i1.d) {
/*     */           
/* 675 */           al al1 = i1.e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 688 */           if (al1 == paramal)
/*     */           {
/* 690 */             k += i1.a;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 696 */     return k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int a(c paramc, boolean paramBoolean) {
/* 704 */     return a(paramc, paramBoolean, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int f() {
/* 710 */     return this.c.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp int a(c paramc, boolean paramBoolean1, boolean paramBoolean2) {
/* 715 */     int k = 0;
/*     */     
/* 717 */     if (this.c.a != 0)
/*     */     {
/* 719 */       for (i i1 : this.c) {
/*     */         
/* 721 */         if (s.h == paramc || i1.h.equals(paramc)) {
/*     */           
/* 723 */           if (paramBoolean2)
/*     */           {
/* 725 */             if (!i1.d) {
/*     */               continue;
/*     */             }
/*     */           }
/*     */ 
/*     */           
/* 731 */           k += i1.a;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 736 */     if (paramBoolean1)
/*     */     {
/* 738 */       if (this.d.a != 0)
/*     */       {
/* 740 */         for (i i1 : this.d) {
/*     */           
/* 742 */           if (s.h == paramc || i1.h.equals(paramc)) {
/*     */ 
/*     */             
/* 745 */             if (paramBoolean2)
/*     */             {
/* 747 */               if (!i1.d) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 753 */             if (!i1.i) {
/*     */               
/* 755 */               k += i1.a;
/*     */               
/*     */               continue;
/*     */             } 
/* 759 */             k -= i1.a;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 767 */     return k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp s b(al paramal) {
/* 775 */     ArrayList<s> arrayList = this.a.M();
/*     */     
/*     */     byte b;
/*     */     int k;
/* 779 */     for (b = 0, k = arrayList.size(); b < k; b++) {
/*     */       
/* 781 */       s s = arrayList.get(b);
/*     */       
/* 783 */       if (s != null && s instanceof w) {
/*     */         
/* 785 */         w w = (w)s;
/* 786 */         if (w.i() == paramal)
/*     */         {
/* 788 */           return (s)w;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 793 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp i a(s params, boolean paramBoolean, PointF paramPointF, af paramaf) {
/* 800 */     if (params instanceof w) {
/*     */       
/* 802 */       w w = (w)params;
/* 803 */       if (!paramBoolean) {
/*     */         
/* 805 */         if (params.a((af)this.a, false) && params.a((af)this.a))
/*     */         {
/*     */           
/* 808 */           if (!w.g() || this.a.bB.s() < this.a.bB.t())
/*     */           {
/*     */ 
/*     */             
/* 812 */             if (w.y().a((af)this.a))
/*     */             {
/* 814 */               return a(w, false, paramPointF, paramaf);
/*     */ 
/*     */             
/*     */             }
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 829 */         i i1 = b(w, false);
/* 830 */         if (i1 != null) {
/*     */ 
/*     */           
/* 833 */           w.y().f((af)this.a);
/*     */           
/* 835 */           return i1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 840 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {
/* 849 */     if (params instanceof w) {
/*     */       
/* 851 */       w w = (w)params;
/* 852 */       if (!paramBoolean) {
/*     */         
/* 854 */         if (params.a((af)this.a, true))
/*     */         {
/* 856 */           if (!w.g() || this.a.bB.s() < this.a.bB.t())
/*     */           {
/*     */ 
/*     */             
/* 860 */             if (w.y().d((af)this.a, params.L()))
/*     */             {
/* 862 */               a(w, true);
/*     */ 
/*     */             
/*     */             }
/*     */           
/*     */           }
/*     */         
/*     */         }
/*     */       
/*     */       }
/* 872 */       else if (b(w, true) != null) {
/*     */ 
/*     */         
/* 875 */         w.y().g((af)this.a, params.L());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params) {
/* 885 */     if (this.d.size() != 0) {
/*     */       
/* 887 */       i i1 = null;
/* 888 */       for (i i2 : this.d) {
/*     */         
/* 890 */         if (i2.h.equals(params.J()))
/*     */         {
/* 892 */           i1 = i2;
/*     */         }
/*     */       } 
/*     */       
/* 896 */       if (i1 != null) {
/*     */         
/* 898 */         if (!i1.i) {
/*     */ 
/*     */ 
/*     */           
/* 902 */           i1.c.g((af)this.a, params.L());
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 908 */           i1.c.f((af)this.a, params.L());
/*     */         } 
/*     */         
/* 911 */         this.d.remove(i1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp List g() {
/* 920 */     return (List)this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp m h() {
/* 925 */     return this.c;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
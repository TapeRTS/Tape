/*      */ package com.corrodinggames.rts.game.a;
/*      */ 
/*      */ import android.graphics.PointF;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.aj;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.e;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.util.AbstractList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class g
/*      */   extends h
/*      */ {
/*      */   boolean a;
/*      */   boolean b;
/*      */   boolean c;
/*      */   boolean d;
/*      */   boolean e;
/*      */   r f;
/*      */   
/*      */   public boolean a() {
/*   32 */     return this.a;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b() {
/*   38 */     if (!this.g)
/*      */     {
/*   40 */       return true;
/*      */     }
/*   42 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(a parama, r paramr) {
/*   56 */     g g1 = new g(parama, false);
/*   57 */     g1.a = true;
/*   58 */     g1.b = true;
/*   59 */     g1.c = true;
/*   60 */     g1.d = true;
/*      */     
/*   62 */     g1.f = paramr;
/*   63 */     g1.a(paramr);
/*      */ 
/*      */     
/*   66 */     g1.z = 0;
/*      */ 
/*      */     
/*   69 */     g1.f();
/*      */ 
/*      */     
/*   72 */     return g1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   boolean g = true;
/*      */ 
/*      */   
/*      */   int h;
/*      */ 
/*      */   
/*      */   int i;
/*      */ 
/*      */   
/*      */   i j;
/*      */   
/*   88 */   float k = 1000.0F;
/*   89 */   float l = 100.0F;
/*      */   
/*   91 */   float m = 4000.0F;
/*      */   
/*   93 */   float n = 0.0F;
/*      */   
/*   95 */   float o = 1000.0F;
/*      */   
/*      */   boolean p = false;
/*      */   
/*      */   boolean q = false;
/*      */   
/*      */   boolean r = false;
/*      */   
/*  103 */   float s = 0.0F;
/*  104 */   float t = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean u;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   af v;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   float w;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   float x;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   float y;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int z;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean A;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ap paramap) {
/*  146 */     paramap.a(this.g);
/*  147 */     paramap.a(this.h);
/*  148 */     paramap.a(this.i);
/*      */ 
/*      */     
/*  151 */     int j = this.B.size();
/*  152 */     paramap.a(j);
/*  153 */     for (r r1 : this.B)
/*      */     {
/*  155 */       paramap.a(r1);
/*      */     }
/*      */ 
/*      */     
/*  159 */     paramap.c(7);
/*      */ 
/*      */     
/*  162 */     paramap.a(false);
/*      */ 
/*      */     
/*  165 */     paramap.a(this.r);
/*      */ 
/*      */ 
/*      */     
/*  169 */     paramap.a(this.n);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  175 */     paramap.a(this.C.size());
/*  176 */     for (r r1 : this.C)
/*      */     {
/*  178 */       paramap.a(r1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  183 */     paramap.a(this.A);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  189 */     paramap.a(this.a);
/*      */ 
/*      */ 
/*      */     
/*  193 */     paramap.a(this.b);
/*  194 */     paramap.a(this.c);
/*  195 */     paramap.a(this.d);
/*  196 */     paramap.a(this.e);
/*      */ 
/*      */     
/*  199 */     paramap.a(this.f);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  204 */     paramap.a(this.z);
/*      */ 
/*      */ 
/*      */     
/*  208 */     super.a(paramap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(k paramk) {
/*  216 */     this.g = paramk.e();
/*  217 */     this.h = paramk.f();
/*  218 */     this.i = paramk.f();
/*      */ 
/*      */     
/*  221 */     l();
/*      */     
/*  223 */     int j = paramk.f(); byte b;
/*  224 */     for (b = 0; b < j; b++) {
/*      */       
/*  226 */       r r1 = paramk.o();
/*  227 */       if (r1 != null)
/*      */       {
/*  229 */         a(r1);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  236 */     b = paramk.d();
/*      */     
/*  238 */     if (b >= 1)
/*      */     {
/*  240 */       paramk.e();
/*      */     }
/*      */     
/*  243 */     if (b >= 2)
/*      */     {
/*  245 */       this.r = paramk.e();
/*      */     }
/*      */     
/*  248 */     if (b >= 3)
/*      */     {
/*  250 */       this.n = paramk.g();
/*      */     }
/*      */     
/*  253 */     if (b >= 4) {
/*      */ 
/*      */       
/*  256 */       this.C.clear();
/*  257 */       int m = paramk.f();
/*  258 */       for (byte b1 = 0; b1 < m; b1++) {
/*      */         
/*  260 */         r r1 = paramk.o();
/*  261 */         if (r1 != null)
/*      */         {
/*  263 */           this.C.add(r1);
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  269 */     if (b >= 5)
/*      */     {
/*  271 */       this.A = paramk.e();
/*      */     }
/*      */     
/*  274 */     if (b >= 6) {
/*      */ 
/*      */ 
/*      */       
/*  278 */       this.a = paramk.e();
/*      */       
/*  280 */       this.b = paramk.e();
/*  281 */       this.c = paramk.e();
/*  282 */       this.d = paramk.e();
/*  283 */       this.e = paramk.e();
/*      */       
/*  285 */       this.f = paramk.o();
/*      */     } 
/*      */     
/*  288 */     if (b >= 7)
/*      */     {
/*  290 */       this.z = paramk.f();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  298 */     if (!this.A) {
/*      */       
/*  300 */       Iterator<r> iterator = this.B.iterator();
/*  301 */       while (iterator.hasNext()) {
/*      */         
/*  303 */         r r1 = iterator.next();
/*  304 */         if (r1 instanceof com.corrodinggames.rts.game.units.h.f) {
/*      */           
/*  306 */           if (r1 != null && r1.ar == this)
/*      */           {
/*  308 */             r1.ar = null;
/*      */           }
/*  310 */           if (r1 != null)
/*      */           {
/*  312 */             this.C.remove(r1);
/*      */           }
/*      */           
/*  315 */           iterator.remove();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  322 */     super.a(paramk);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public g(a parama) {
/*  329 */     super(parama);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public g(a parama, boolean paramBoolean) {
/*  338 */     this(parama);
/*  339 */     this.g = paramBoolean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  348 */     for (af af1 : af.bj) {
/*      */       
/*  350 */       if (!af1.bz && af1.bB == this.R)
/*      */       {
/*      */         
/*  353 */         if (this.z > this.B.size())
/*      */         {
/*  355 */           if (af1 instanceof r) {
/*      */             
/*  357 */             r r1 = (r)af1;
/*      */             
/*  359 */             if (!r1.br)
/*      */             {
/*  361 */               if (r1.ar == null)
/*      */               {
/*  363 */                 if (this.R.h((af)r1) && this.R.i((af)r1)) {
/*      */ 
/*      */                   
/*  366 */                   if (this.A) {
/*      */                     
/*  368 */                     if (af1.h() == ah.b)
/*      */                     {
/*      */                       continue;
/*      */                     
/*      */                     }
/*      */                   
/*      */                   }
/*  375 */                   else if (af1.h() == ah.e) {
/*      */                     continue;
/*      */                   } 
/*      */ 
/*      */ 
/*      */                   
/*  381 */                   if (this.R.a((af)r1, this.S, this.T) || (!b() && f.a(0, 100) <= 2))
/*      */                   {
/*  383 */                     a(r1);
/*      */                   }
/*      */                 } 
/*      */               }
/*      */             }
/*      */           } 
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d() {
/*  410 */     if (this.z <= this.B.size())
/*      */     {
/*  412 */       return true;
/*      */     }
/*      */     
/*  415 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/*  424 */     l l = l.u();
/*      */ 
/*      */     
/*  427 */     this.w += paramFloat;
/*      */ 
/*      */     
/*  430 */     i();
/*      */ 
/*      */ 
/*      */     
/*  434 */     if (d())
/*      */     {
/*  436 */       this.k = f.a(this.k, paramFloat);
/*      */     }
/*      */ 
/*      */     
/*  440 */     this.x = f.a(this.x, paramFloat);
/*  441 */     this.y = f.a(this.y, paramFloat);
/*  442 */     this.o = f.a(this.o, paramFloat);
/*      */     
/*  444 */     if (!this.u && !this.q)
/*      */     {
/*  446 */       if (!d())
/*      */       {
/*  448 */         if (this.x == 0.0F) {
/*      */           
/*  450 */           this.x = (200 + f.b(200));
/*      */           
/*  452 */           c();
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  458 */     if (!this.u || this.p) {
/*      */       
/*  460 */       if (!this.p) {
/*      */         
/*  462 */         this.m = f.a(this.m, paramFloat);
/*      */         
/*  464 */         if (this.m == 0.0F)
/*      */         {
/*  466 */           if (this.j != null) {
/*      */             
/*  468 */             PointF pointF = this.j.w();
/*      */             
/*  470 */             if (!a(pointF.a, pointF.b)) {
/*      */               
/*  472 */               this.m = 100.0F;
/*      */             
/*      */             }
/*      */             else {
/*      */               
/*  477 */               this.m = 4000.0F;
/*      */               
/*  479 */               this.S = pointF.a;
/*  480 */               this.T = pointF.b;
/*      */             } 
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  487 */       if (this.y == 0.0F) {
/*      */         
/*  489 */         this.y = 800.0F;
/*      */         
/*  491 */         e e = l.bN.a(this.R);
/*  492 */         for (r r1 : this.B) {
/*      */           
/*  494 */           boolean bool = true;
/*      */ 
/*      */ 
/*      */           
/*  498 */           if (c((af)r1) < 28900.0F)
/*      */           {
/*  500 */             bool = false;
/*      */           }
/*      */           
/*  503 */           if (!this.e && r1.ah())
/*      */           {
/*  505 */             if (!r1.ao())
/*      */             {
/*  507 */               bool = false;
/*      */             }
/*      */           }
/*      */           
/*  511 */           if (bool)
/*      */           {
/*  513 */             e.a(r1);
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*  518 */         if (this.e) {
/*      */           
/*  520 */           e.a(this.S, this.T);
/*      */         }
/*      */         else {
/*      */           
/*  524 */           e.b(this.S, this.T);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  530 */     if (this.g) {
/*      */       
/*  532 */       c(paramFloat);
/*      */     }
/*      */     else {
/*      */       
/*  536 */       b(paramFloat);
/*      */     } 
/*      */     
/*  539 */     if (this.z == 0 && this.B.size() == 0)
/*      */     {
/*  541 */       k();
/*      */     }
/*      */ 
/*      */     
/*  545 */     if (this.b)
/*      */     {
/*  547 */       if (this.f == null || this.f.bz)
/*      */       {
/*  549 */         k();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat) {
/*  568 */     if (this.j == null || this.j.V)
/*      */     {
/*  570 */       f();
/*      */     }
/*      */     
/*  573 */     if (this.b && this.f != null)
/*      */     {
/*  575 */       if (this.d && !this.e) {
/*      */         
/*  577 */         if ((this.f.bY / this.f.bZ) < 0.5D) {
/*      */           
/*  579 */           this.e = true;
/*      */ 
/*      */           
/*  582 */           if (this.y > 100.0F)
/*      */           {
/*  584 */             this.y = 100.0F;
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*  589 */         if (this.v == null)
/*      */         {
/*  591 */           f();
/*      */         
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/*  597 */         if ((this.f.bY / this.f.bZ) > 0.6D)
/*      */         {
/*  599 */           this.e = false;
/*      */         }
/*      */         
/*  602 */         boolean bool = false;
/*      */         
/*  604 */         if (this.j != null && !this.j.t)
/*      */         {
/*  606 */           bool = true;
/*      */         }
/*      */         
/*  609 */         if (!bool) {
/*      */ 
/*      */           
/*  612 */           boolean bool1 = true;
/*      */           
/*  614 */           i i1 = this.R.a(this.f.h(), this.f.dH, this.f.dI, bool1);
/*  615 */           if (i1 != null)
/*      */           {
/*  617 */             this.j = i1;
/*      */           }
/*      */           
/*  620 */           if (this.j != null) {
/*      */             
/*  622 */             PointF pointF = this.j.w();
/*  623 */             this.S = pointF.a;
/*  624 */             this.T = pointF.b;
/*      */             
/*  626 */             if (this.y > 100.0F)
/*      */             {
/*  628 */               this.y = 100.0F;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  642 */     if (this.j != null) {
/*      */ 
/*      */ 
/*      */       
/*  646 */       for (byte b = 0; b < 2; b++) {
/*      */ 
/*      */         
/*  649 */         if (this.o == 0.0F) {
/*      */           
/*  651 */           af af1 = this.j.g();
/*  652 */           if (af1 == null) {
/*      */             break;
/*      */           }
/*      */ 
/*      */           
/*  657 */           if (a(af1, false)) {
/*      */             
/*  659 */             this.v = af1;
/*      */             
/*  661 */             this.o = 500.0F;
/*  662 */             this.m = 2000.0F;
/*      */             
/*  664 */             if (!this.e) {
/*      */               
/*  666 */               this.S = af1.dH;
/*  667 */               this.T = af1.dI;
/*      */             } 
/*      */             
/*  670 */             if (this.y > 100.0F)
/*      */             {
/*  672 */               this.y = 100.0F;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  681 */       if (this.o == 0.0F) {
/*      */         
/*  683 */         this.e = false;
/*  684 */         this.v = null;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(float paramFloat) {
/*  703 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/*  707 */     if (!this.u) {
/*      */       
/*  709 */       if (this.k == 0.0F)
/*      */       {
/*  711 */         this.u = true;
/*  712 */         this.p = true;
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  720 */       if (this.v == null || 
/*  721 */         !this.v.bG() || this.v.bz || !this.q) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  726 */         this.v = this.R.ah();
/*      */         
/*  728 */         if (this.v != null && !a(this.v, true))
/*      */         {
/*  730 */           this.v = null;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  735 */       if (this.v != null)
/*      */       {
/*  737 */         if (this.p) {
/*      */           
/*  739 */           this.t += paramFloat;
/*      */           
/*  741 */           if (!this.q) {
/*      */             
/*  743 */             this.s = f.a(this.s, paramFloat);
/*  744 */             if (this.s == 0.0F)
/*      */             {
/*  746 */               this.s = 20.0F;
/*      */               
/*  748 */               e();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  777 */             boolean bool = false;
/*      */             
/*  779 */             for (r r1 : this.B) {
/*      */               
/*  781 */               if (c((af)r1) > 28900.0F)
/*      */               {
/*  783 */                 bool = true;
/*      */               }
/*      */             } 
/*      */             
/*  787 */             if (!bool)
/*      */             {
/*  789 */               this.p = false;
/*      */             }
/*      */             
/*  792 */             for (r r1 : this.B) {
/*      */               
/*  794 */               if (r1.bd > l.bh - 1000)
/*      */               {
/*  796 */                 this.p = false;
/*      */               }
/*      */             } 
/*      */           } 
/*      */ 
/*      */           
/*  802 */           if (this.t > 17000.0F)
/*      */           {
/*  804 */             this.p = false;
/*      */ 
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */ 
/*      */           
/*  813 */           this.n += paramFloat;
/*      */           
/*  815 */           if (this.y == 0.0F) {
/*      */             
/*  817 */             this.y = 800.0F;
/*      */             
/*  819 */             boolean bool = false;
/*      */             
/*  821 */             m m = new m();
/*      */ 
/*      */             
/*  824 */             for (r r1 : this.B) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  829 */               boolean bool1 = true;
/*  830 */               if (this.v != null) {
/*      */                 
/*  832 */                 if (!this.R.a((af)r1, this.v))
/*      */                 {
/*  834 */                   bool1 = false;
/*      */                 }
/*      */                 
/*  837 */                 if (bool1 && !aj.a(r1, this.v))
/*      */                 {
/*  839 */                   bool1 = false;
/*      */                 }
/*      */               } 
/*      */ 
/*      */               
/*  844 */               if (bool1) {
/*      */                 
/*  846 */                 bool = true;
/*      */ 
/*      */                 
/*  849 */                 m.add(r1);
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/*  855 */             if (!bool) {
/*      */               
/*  857 */               this.p = false;
/*      */             }
/*      */             else {
/*      */               
/*  861 */               e e = l.bN.a(this.R);
/*      */               
/*  863 */               e.a((AbstractList)m);
/*      */               
/*  865 */               boolean bool1 = true;
/*      */               
/*  867 */               if (this.v != null && f.a(0, 100) < 80) {
/*      */ 
/*      */                 
/*  870 */                 e.a(this.v.dH, this.v.dI, bool1);
/*      */               
/*      */               }
/*      */               else {
/*      */ 
/*      */                 
/*  876 */                 e.a(this.v, bool1);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  887 */     if (this.u) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  893 */       if (this.B.size() == 0)
/*      */       {
/*  895 */         k();
/*      */       }
/*      */       
/*  898 */       if (this.n > 1000.0F)
/*      */       {
/*  900 */         if (this.B.size() < 3)
/*      */         {
/*  902 */           k();
/*      */         }
/*      */       }
/*  905 */       if (this.n > 11000.0F)
/*      */       {
/*  907 */         k();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/*  921 */     float f1 = this.v.dH;
/*  922 */     float f2 = this.v.dI;
/*      */     
/*  924 */     float f3 = f.d(f1, f2, this.S, this.T);
/*  925 */     float f4 = f.b(f1, f2, this.S, this.T);
/*      */     
/*  927 */     if (f.a(0, 100) < 80)
/*      */     {
/*  929 */       f3 += f.a(-110, 110);
/*      */     }
/*      */     
/*  932 */     int j = (int)(f4 * 0.6D);
/*  933 */     if (j < 720)
/*      */     {
/*  935 */       j = 720;
/*      */     }
/*      */     
/*  938 */     float f5 = f.a(50, j);
/*      */     
/*  940 */     if (f.a(0, 100) < 80 && f5 < 450.0F)
/*      */     {
/*  942 */       f5 = f.a(450, j);
/*      */     }
/*      */ 
/*      */     
/*  946 */     f1 += f.i(f3) * f5;
/*  947 */     f2 += f.h(f3) * f5;
/*      */ 
/*      */     
/*  950 */     boolean bool1 = true;
/*      */ 
/*      */ 
/*      */     
/*  954 */     if (!a(f1, f2))
/*      */     {
/*  956 */       bool1 = false;
/*      */     }
/*      */ 
/*      */     
/*  960 */     boolean bool2 = false;
/*  961 */     boolean bool3 = false;
/*      */ 
/*      */     
/*  964 */     for (r r1 : this.B) {
/*      */       
/*  966 */       if (r1.h() == ah.b)
/*      */       {
/*  968 */         bool2 = true;
/*      */       }
/*  970 */       if (r1.h() == ah.e)
/*      */       {
/*  972 */         bool3 = true;
/*      */       }
/*      */     } 
/*      */     
/*  976 */     if (bool2) {
/*      */       
/*  978 */       if (this.R.ap == 0)
/*      */       {
/*  980 */         if (!b(f1, f2))
/*      */         {
/*  982 */           bool1 = false;
/*      */         }
/*      */       }
/*      */       
/*  986 */       if (!this.R.a(f1, f2, this.v.dH, this.v.dI, ah.b))
/*      */       {
/*  988 */         if (f.a(0, 100) < 98)
/*      */         {
/*  990 */           bool1 = false;
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  995 */     if (bool3) {
/*      */       
/*  997 */       if (!b(f1, f2))
/*      */       {
/*  999 */         bool1 = false;
/*      */       }
/*      */ 
/*      */       
/* 1003 */       if (!this.R.a(f1, f2, this.v.dH, this.v.dI, ah.e))
/*      */       {
/*      */ 
/*      */         
/* 1007 */         bool1 = false;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1012 */     if (bool1) {
/*      */       
/* 1014 */       this.S = f1;
/* 1015 */       this.T = f2;
/* 1016 */       this.y = 0.0F;
/*      */       
/* 1018 */       this.q = true;
/*      */ 
/*      */       
/* 1021 */       this.C.clear();
/* 1022 */       for (r r1 : this.B) {
/*      */         
/* 1024 */         if (r1.h() != ah.e)
/*      */         {
/* 1026 */           if (!this.R.a((af)r1, this.S, this.T))
/*      */           {
/* 1028 */             this.C.add(r1);
/*      */           }
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(float paramFloat1, float paramFloat2) {
/* 1047 */     if (this.A)
/*      */     {
/* 1049 */       return !y.a(paramFloat1, paramFloat2, ah.e);
/*      */     }
/*      */ 
/*      */     
/* 1053 */     return !y.a(paramFloat1, paramFloat2, ah.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(float paramFloat1, float paramFloat2) {
/* 1070 */     for (r r1 : this.B) {
/*      */       
/* 1072 */       if (!this.R.a((af)r1, paramFloat1, paramFloat2))
/*      */       {
/* 1074 */         return false;
/*      */       }
/*      */     } 
/* 1077 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(af paramaf, boolean paramBoolean) {
/* 1094 */     for (r r1 : this.B) {
/*      */       
/* 1096 */       if (paramBoolean || this.R.a((af)r1, paramaf.dH, paramaf.dI))
/*      */       {
/* 1098 */         if (aj.a(r1, paramaf))
/*      */         {
/* 1100 */           return true;
/*      */         }
/*      */       }
/*      */     } 
/* 1104 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/* 1124 */     boolean bool = true;
/*      */ 
/*      */     
/* 1127 */     PointF pointF = null;
/*      */ 
/*      */     
/* 1130 */     if (this.b && this.f != null) {
/*      */ 
/*      */       
/* 1133 */       this.S = this.f.dH;
/* 1134 */       this.T = this.f.dI;
/*      */       
/* 1136 */       this.j = this.R.c(this.f.dH, this.f.dI);
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 1143 */     if (bool)
/*      */     {
/*      */       
/* 1146 */       for (byte b = 0; b < 7; b++) {
/*      */         
/* 1148 */         boolean bool1 = (b > 3) ? true : false;
/*      */         
/* 1150 */         if (pointF == null)
/*      */         {
/*      */           
/* 1153 */           for (o o : this.R.aV) {
/*      */             
/* 1155 */             if (o instanceof i) {
/*      */               
/* 1157 */               i i1 = (i)o;
/*      */               
/* 1159 */               if (i1.b == j.c && (i1.u() > 2 || bool1))
/*      */               {
/*      */                 
/* 1162 */                 if (pointF == null || f.b(this.R.ah + 2) == 0) {
/*      */                   
/* 1164 */                   for (byte b1 = 0; b1 < 10; b1++) {
/*      */                     
/* 1166 */                     if (pointF == null) {
/*      */                       
/* 1168 */                       PointF pointF1 = i1.w();
/* 1169 */                       if (a(pointF1.a, pointF1.b))
/*      */                       {
/* 1171 */                         pointF = pointF1;
/*      */                       }
/*      */                     } 
/*      */                   } 
/*      */                   
/* 1176 */                   this.j = i1;
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           } 
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1191 */     if (pointF == null) {
/*      */       
/* 1193 */       pointF = this.R.ab();
/* 1194 */       this.j = null;
/*      */     } 
/*      */     
/* 1197 */     this.S = pointF.a;
/* 1198 */     this.T = pointF.b;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
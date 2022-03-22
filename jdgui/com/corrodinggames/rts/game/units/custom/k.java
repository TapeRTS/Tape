/*      */ package com.corrodinggames.rts.game.units.custom;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.game.f;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.ab;
/*      */ import com.corrodinggames.rts.game.units.ad;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.ai;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.an;
/*      */ import com.corrodinggames.rts.game.units.ao;
/*      */ import com.corrodinggames.rts.game.units.b;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a;
/*      */ import com.corrodinggames.rts.game.units.custom.a.c;
/*      */ import com.corrodinggames.rts.game.units.custom.a.d;
/*      */ import com.corrodinggames.rts.game.units.custom.a.f;
/*      */ import com.corrodinggames.rts.game.units.custom.b.a;
/*      */ import com.corrodinggames.rts.game.units.custom.b.c;
/*      */ import com.corrodinggames.rts.game.units.custom.b.d;
/*      */ import com.corrodinggames.rts.game.units.custom.b.h;
/*      */ import com.corrodinggames.rts.game.units.custom.b.i;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.d;
/*      */ import com.corrodinggames.rts.game.units.d.h;
/*      */ import com.corrodinggames.rts.game.units.d.i;
/*      */ import com.corrodinggames.rts.game.units.d.j;
/*      */ import com.corrodinggames.rts.game.units.d.k;
/*      */ import com.corrodinggames.rts.game.units.d.o;
/*      */ import com.corrodinggames.rts.game.units.e.b;
/*      */ import com.corrodinggames.rts.game.units.e.i;
/*      */ import com.corrodinggames.rts.game.units.p;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.game.units.u;
/*      */ import com.corrodinggames.rts.game.units.z;
/*      */ import com.corrodinggames.rts.gameFramework.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.ab;
/*      */ import com.corrodinggames.rts.gameFramework.b.d;
/*      */ import com.corrodinggames.rts.gameFramework.b.e;
/*      */ import com.corrodinggames.rts.gameFramework.b.f;
/*      */ import com.corrodinggames.rts.gameFramework.b.h;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ag;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import com.corrodinggames.rts.gameFramework.w;
/*      */ import java.util.ArrayList;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class k
/*      */   extends p
/*      */   implements ad, d, k
/*      */ {
/*      */   public int a;
/*   87 */   public final e b = new e(this);
/*      */   
/*   89 */   float c = 1.0F;
/*      */ 
/*      */   
/*      */   float d;
/*      */ 
/*      */   
/*      */   float e;
/*      */ 
/*      */   
/*      */   public float f;
/*      */   
/*      */   boolean g;
/*      */   
/*      */   public boolean h = true;
/*      */   
/*      */   public boolean i = true;
/*      */   
/*  106 */   float j = 1.0F;
/*      */ 
/*      */   
/*      */   boolean k = false;
/*      */ 
/*      */   
/*      */   boolean l;
/*      */ 
/*      */   
/*      */   float m;
/*      */ 
/*      */   
/*      */   boolean n;
/*      */ 
/*      */   
/*      */   float o;
/*      */ 
/*      */   
/*      */   boolean p;
/*      */ 
/*      */   
/*      */   float q;
/*      */   
/*      */   float r;
/*      */   
/*      */   public float s;
/*      */   
/*      */   public boolean t;
/*      */   
/*      */   float u;
/*      */   
/*      */   public l v;
/*      */   
/*      */   public l w;
/*      */   
/*  141 */   public final m x = new m();
/*      */   
/*  143 */   public m y = null;
/*      */   
/*      */   public float z;
/*  146 */   PointF[] A = null;
/*  147 */   PointF[] B = null; f[] C;
/*      */   
/*      */   public strictfp void K() {
/*  150 */     this.A = new PointF[6];
/*  151 */     this.B = new PointF[this.A.length];
/*  152 */     for (byte b = 0; b < this.A.length; b++) {
/*      */       
/*  154 */       this.A[b] = new PointF();
/*  155 */       this.B[b] = new PointF();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp PointF[] b() {
/*  162 */     if (this.A == null)
/*      */     {
/*  164 */       K();
/*      */     }
/*  166 */     return this.A;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp PointF[] c() {
/*  172 */     if (this.A == null)
/*      */     {
/*  174 */       K();
/*      */     }
/*      */     
/*  177 */     return this.B;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(ap paramap) {
/*  184 */     paramap.a(9);
/*      */     
/*  186 */     paramap.a(this.e);
/*  187 */     paramap.a(this.m);
/*  188 */     paramap.a(this.n);
/*      */ 
/*      */     
/*  191 */     paramap.a(this.x.size());
/*  192 */     for (af af : this.x)
/*      */     {
/*  194 */       paramap.a(af);
/*      */     }
/*      */ 
/*      */     
/*  198 */     paramap.a(this.p);
/*      */ 
/*      */     
/*  201 */     paramap.a(this.o);
/*      */ 
/*      */     
/*  204 */     paramap.a(this.f);
/*  205 */     paramap.a(this.q);
/*      */ 
/*      */ 
/*      */     
/*  209 */     paramap.a(this.t);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  217 */     byte b = 0;
/*  218 */     if (this.ds != null)
/*      */     {
/*  220 */       b = (byte)this.ds.length;
/*      */     }
/*  222 */     paramap.c(b);
/*      */     
/*  224 */     if (this.ds != null)
/*      */     {
/*  226 */       for (byte b1 = 0; b1 < b; b1++) {
/*      */         
/*  228 */         d d1 = this.ds[b1];
/*      */         
/*  230 */         paramap.a(d1.b);
/*  231 */         paramap.a(d1.c);
/*  232 */         paramap.a(d1.d);
/*  233 */         paramap.a(d1.i);
/*      */         
/*  235 */         paramap.a(d1.k);
/*      */ 
/*      */         
/*  238 */         paramap.a(d1.j);
/*      */ 
/*      */         
/*  241 */         paramap.a(d1.m);
/*  242 */         paramap.a(d1.n);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  250 */     this.do.a(paramap);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  256 */     paramap.a(this.w);
/*      */ 
/*      */ 
/*      */     
/*  260 */     paramap.a(this.i);
/*  261 */     paramap.a(this.h);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  267 */     boolean bool = (this.dx != this.v.G) ? true : false;
/*      */     
/*  269 */     paramap.a(bool);
/*  270 */     if (bool)
/*      */     {
/*      */       
/*  273 */       h.a(this.dx, paramap);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  280 */     super.a(paramap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(com.corrodinggames.rts.gameFramework.g.k paramk) {
/*  287 */     if (paramk.b() >= 32) {
/*      */       
/*  289 */       int n = paramk.f();
/*      */       
/*  291 */       this.e = paramk.g();
/*  292 */       this.m = paramk.g();
/*  293 */       this.n = paramk.e();
/*      */ 
/*      */       
/*  296 */       this.x.clear();
/*      */       
/*  298 */       int i1 = paramk.f(); byte b;
/*  299 */       for (b = 0; b < i1; b++) {
/*      */         
/*  301 */         af af = paramk.n();
/*  302 */         if (af != null)
/*      */         {
/*  304 */           this.x.add(af);
/*      */         }
/*      */       } 
/*      */       
/*  308 */       if (n >= 1)
/*      */       {
/*  310 */         this.p = paramk.e();
/*      */       }
/*      */       
/*  313 */       if (n >= 2)
/*      */       {
/*  315 */         this.o = paramk.g();
/*      */       }
/*      */       
/*  318 */       if (n >= 3) {
/*      */         
/*  320 */         this.f = paramk.g();
/*  321 */         this.q = paramk.g();
/*      */       } 
/*      */       
/*  324 */       if (n >= 4)
/*      */       {
/*  326 */         this.t = paramk.e();
/*      */       }
/*      */       
/*  329 */       if (n >= 5) {
/*      */         
/*  331 */         b = paramk.d();
/*      */         
/*  333 */         if (b != 0) {
/*      */           
/*  335 */           dh();
/*      */           
/*  337 */           if (this.ds == null)
/*      */           {
/*  339 */             l.d("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  346 */           for (byte b1 = 0; b1 < b; b1++) {
/*      */             d d1;
/*      */ 
/*      */             
/*  350 */             if (this.ds == null) {
/*      */               
/*  352 */               d1 = new d();
/*      */             }
/*  354 */             else if (b1 >= this.ds.length) {
/*      */               
/*  356 */               l.d("readIn: legs " + b1 + ">=" + this.ds.length);
/*  357 */               d1 = new d();
/*      */             }
/*      */             else {
/*      */               
/*  361 */               d1 = this.ds[b1];
/*      */             } 
/*      */             
/*  364 */             d1.b = paramk.g();
/*  365 */             d1.c = paramk.g();
/*  366 */             d1.d = paramk.g();
/*  367 */             d1.i = paramk.g();
/*      */             
/*  369 */             d1.k = paramk.e();
/*      */             
/*  371 */             d1.o = true;
/*      */ 
/*      */             
/*  374 */             d1.j = paramk.e();
/*      */ 
/*      */ 
/*      */             
/*  378 */             d1.m = paramk.e();
/*  379 */             d1.n = paramk.e();
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  390 */       if (n >= 6)
/*      */       {
/*  392 */         this.do.a(paramk);
/*      */       }
/*      */ 
/*      */       
/*  396 */       if (n >= 7) {
/*      */         
/*  398 */         al al = paramk.p();
/*  399 */         if (al != null)
/*      */         {
/*      */           
/*  402 */           if (al instanceof l) {
/*      */             
/*  404 */             this.w = (l)al;
/*      */           }
/*      */           else {
/*      */             
/*  408 */             l.b("Got non CustomUnitMetadata object of:" + al.i() + " loading real_meta");
/*      */             
/*  410 */             this.w = l.b;
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  416 */       if (n >= 8) {
/*      */         
/*  418 */         this.i = paramk.e();
/*  419 */         this.h = paramk.e();
/*      */       } 
/*      */ 
/*      */       
/*  423 */       if (n >= 9) {
/*      */ 
/*      */         
/*  426 */         boolean bool = paramk.e();
/*  427 */         if (bool)
/*      */         {
/*  429 */           a(h.a(paramk), true);
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  438 */     super.a(paramk);
/*      */ 
/*      */     
/*  441 */     if (this.ds != null) {
/*      */       
/*  443 */       this.dp = this.dH;
/*  444 */       this.dq = this.dI;
/*  445 */       this.dr = this.bL;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cc() {
/*  455 */     return (this.v.eB > 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int f() {
/*  461 */     return this.x.size();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean m_() {
/*  467 */     return this.n;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean d(af paramaf, boolean paramBoolean) {
/*  476 */     if (this.v.eB == 0)
/*      */     {
/*  478 */       return false;
/*      */     }
/*      */     
/*  481 */     if (this.n)
/*      */     {
/*  483 */       return false;
/*      */     }
/*      */     
/*  486 */     if (this.bR < 1.0F)
/*      */     {
/*  488 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  492 */     if (!C(paramaf))
/*      */     {
/*  494 */       return false;
/*      */     }
/*  496 */     if (paramaf == this)
/*      */     {
/*  498 */       return false;
/*      */     }
/*      */     
/*  501 */     if (this.bB != paramaf.bB && !paramBoolean)
/*      */     {
/*  503 */       if (!this.v.ci || this.bB != m.g)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  509 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  513 */     if (this.v.eE != null && !this.v.eE.a())
/*      */     {
/*  515 */       if (!h.a(this.v.eE, paramaf.cM()))
/*      */       {
/*  517 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  521 */     if (this.v.eF.size() > 0) {
/*      */       
/*  523 */       boolean bool1 = false;
/*  524 */       for (ah ah : this.v.eF) {
/*      */         
/*  526 */         if (ah == paramaf.h()) {
/*      */           
/*  528 */           bool1 = true;
/*      */           break;
/*      */         } 
/*      */       } 
/*  532 */       if (!bool1)
/*      */       {
/*  534 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  538 */     boolean bool = this.v.eG;
/*      */     
/*  540 */     return y.a(paramaf, bool, this.v.eH);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean e(af paramaf, boolean paramBoolean) {
/*  546 */     if (!d(paramaf, paramBoolean))
/*      */     {
/*  548 */       return false;
/*      */     }
/*  550 */     y(paramaf);
/*  551 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void y(af paramaf) {
/*  557 */     paramaf.cp = (af)this;
/*  558 */     this.x.add(paramaf);
/*      */     
/*  560 */     if (this.v.cj && this.bB == m.g)
/*      */     {
/*  562 */       c(paramaf.bB);
/*      */     }
/*      */     
/*  565 */     a(ab.l);
/*      */     
/*  567 */     l l1 = l.u();
/*  568 */     l1.bA.l(paramaf);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void z(af paramaf) {
/*  574 */     a(ab.m);
/*      */     
/*  576 */     if (this.v.ck)
/*      */     {
/*  578 */       if (this.x.size() == 0)
/*      */       {
/*  580 */         c(m.g);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void e(af paramaf) {
/*  589 */     if (paramaf.cp == this) {
/*      */       
/*  591 */       this.x.remove(paramaf);
/*  592 */       paramaf.cp = null;
/*      */       
/*  594 */       z(paramaf);
/*      */     }
/*      */     else {
/*      */       
/*  598 */       l.f("Unit is not being transported");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void L() {
/*  604 */     if (this.v.eB == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  609 */     this.n = true;
/*  610 */     this.m = 30.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void cY() {
/*  615 */     if (this.v.eB == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  620 */     this.n = false;
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
/*      */   public strictfp boolean i(boolean paramBoolean) {
/*  637 */     if (this.x.size() == 0)
/*      */     {
/*  639 */       return false;
/*      */     }
/*      */     
/*  642 */     boolean bool = (this.x.size() % 2 == 0) ? true : false;
/*  643 */     af af = (af)this.x.remove(this.x.size() - 1);
/*      */     
/*  645 */     return b(af, paramBoolean, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean a(af paramaf, boolean paramBoolean1, boolean paramBoolean2) {
/*  650 */     this.x.remove(paramaf);
/*      */     
/*  652 */     return b(paramaf, paramBoolean1, paramBoolean2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp boolean b(af paramaf, boolean paramBoolean1, boolean paramBoolean2) {
/*      */     boolean bool;
/*  661 */     float f1 = 180.0F;
/*  662 */     if (this.v.cW != null)
/*      */     {
/*  664 */       f1 = this.v.cW.floatValue();
/*      */     }
/*      */     
/*  667 */     float f2 = 70.0F;
/*  668 */     if (this.v.cZ != null)
/*      */     {
/*  670 */       f2 = this.v.cZ.floatValue();
/*      */     }
/*      */ 
/*      */     
/*  674 */     float f3 = 7.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  679 */     float f4 = this.v.cU;
/*  680 */     float f5 = this.v.cV;
/*      */ 
/*      */     
/*  683 */     float f6 = this.dH + f.i(this.bL + f1) * f5 - f.h(this.bL + f1) * f4;
/*  684 */     float f7 = this.dI + f.h(this.bL + f1) * f5 + f.i(this.bL + f1) * f4;
/*      */ 
/*      */ 
/*      */     
/*  688 */     f6 += f.i(this.bL + 90.0F) * (paramBoolean2 ? -f3 : f3);
/*  689 */     f7 += f.h(this.bL + 90.0F) * (paramBoolean2 ? -f3 : f3);
/*      */ 
/*      */     
/*  692 */     if (!paramBoolean1 && !bw()) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  698 */       if (!y.a(paramaf, f6, f7))
/*      */       {
/*  700 */         f6 += 10.0F;
/*      */       }
/*  702 */       if (!y.a(paramaf, f6, f7))
/*      */       {
/*  704 */         f6 -= 20.0F;
/*      */       }
/*  706 */       if (!y.a(paramaf, f6, f7)) {
/*      */         
/*  708 */         f6 -= 10.0F;
/*  709 */         f7 += 10.0F;
/*      */       } 
/*  711 */       if (!y.a(paramaf, f6, f7))
/*      */       {
/*  713 */         f7 -= 20.0F;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  718 */     if (!paramBoolean1 && !y.a(paramaf, f6, f7) && !bw()) {
/*      */       
/*  720 */       bool = false;
/*      */     }
/*      */     else {
/*      */       
/*  724 */       bool = true;
/*      */       
/*  726 */       boolean bool1 = false;
/*      */       
/*  728 */       i i1 = null;
/*  729 */       if (paramaf instanceof r) {
/*      */         
/*  731 */         r r = (r)paramaf;
/*  732 */         if (r.cq == this) {
/*      */           
/*  734 */           i1 = r.cV();
/*      */           
/*  736 */           if (i1 == null)
/*      */           {
/*  738 */             l.d("Unload, attachment data is null");
/*      */           }
/*  740 */           if (i1 != null)
/*      */           {
/*  742 */             bool1 = i1.E;
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  747 */       y.a(paramaf, (r)this);
/*      */       
/*  749 */       float f8 = this.bL + f1;
/*      */       
/*  751 */       if (!bool1) {
/*      */         
/*  753 */         paramaf.dH = f6;
/*  754 */         paramaf.dI = f7;
/*      */         
/*  756 */         paramaf.bL = f8;
/*      */ 
/*      */         
/*  759 */         paramaf.bI = 0.0F;
/*  760 */         paramaf.bH = 0.0F;
/*  761 */         paramaf.bD = 0.0F;
/*  762 */         paramaf.bE = 0.0F;
/*      */         
/*  764 */         paramaf.bD += 0.1F;
/*      */       } 
/*      */ 
/*      */       
/*  768 */       paramaf.bw = (af)this;
/*  769 */       paramaf.bx = 45.0F;
/*      */       
/*  771 */       if (bool1)
/*      */       {
/*  773 */         paramaf.bx = 85.0F;
/*      */       }
/*      */       
/*  776 */       if (paramaf instanceof r) {
/*      */         
/*  778 */         r r = (r)paramaf;
/*      */ 
/*      */         
/*  781 */         if (!bool1)
/*      */         {
/*  783 */           r.j(paramaf.bL);
/*      */         }
/*      */ 
/*      */         
/*  787 */         if (!this.v.eL.read(this)) {
/*      */ 
/*      */           
/*  790 */           r.ax();
/*      */ 
/*      */           
/*  793 */           if (f2 != 0.0F)
/*      */           {
/*  795 */             r.d(paramaf.dH + f.i(f8 + (paramBoolean2 ? -f3 : f3)) * f2, paramaf.dI + 
/*  796 */                 f.h(f8 + (paramBoolean2 ? -f3 : f3)) * f2);
/*      */           }
/*      */ 
/*      */           
/*  800 */           r.T = 0;
/*      */         }
/*      */         else {
/*      */           
/*  804 */           r.aE();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  811 */       if (!bool1) {
/*      */         
/*  813 */         if (!this.v.cY)
/*      */         {
/*  815 */           paramaf.dJ = this.dJ;
/*      */         }
/*      */         
/*  818 */         paramaf.dJ += this.v.cX;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  825 */       if (paramaf instanceof k)
/*      */       {
/*  827 */         ((k)paramaf).dl();
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  835 */     if (!bool) {
/*      */       
/*  837 */       this.x.add(paramaf);
/*      */     }
/*      */     else {
/*      */       
/*  841 */       z(paramaf);
/*      */     } 
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
/*  853 */     return bool;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int bK() {
/*  861 */     if (this.v.eB == 0 || !this.v.s)
/*      */     {
/*  863 */       return -1;
/*      */     }
/*      */ 
/*      */     
/*  867 */     return do();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int bL() {
/*  873 */     if (this.v.eB == 0 || !this.v.s)
/*      */     {
/*  875 */       return -1;
/*      */     }
/*      */     
/*  878 */     return this.v.eB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void cZ() {
/*  885 */     if (this.x.a > 0) {
/*      */       
/*  887 */       boolean bool = this.v.eK.read(this);
/*      */       
/*  889 */       j(bool);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void j(boolean paramBoolean) {
/*  896 */     for (af af : this.x) {
/*      */       
/*  898 */       af.cp = null;
/*  899 */       af.dH = this.dH + f.i(this.bL) * -9.0F;
/*  900 */       af.dI = this.dI + f.h(this.bL) * -9.0F;
/*      */       
/*  902 */       if (paramBoolean)
/*      */       {
/*  904 */         af.bY = -1.0F;
/*      */       }
/*      */     } 
/*  907 */     this.x.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void bp() {
/*  915 */     if (!this.bz)
/*      */     {
/*  917 */       a(ab.c);
/*      */     }
/*      */     
/*  920 */     Object[] arrayOfObject = this.v.h.a();
/*  921 */     for (int n = this.v.h.a - 1; n >= 0; n--) {
/*      */       
/*  923 */       a a = (a)arrayOfObject[n];
/*  924 */       a.b(this);
/*      */     } 
/*      */     
/*  927 */     super.bp();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a() {
/*  934 */     cZ();
/*      */     
/*  936 */     Object[] arrayOfObject = this.v.h.a();
/*  937 */     for (int n = this.v.h.a - 1; n >= 0; n--) {
/*      */       
/*  939 */       a a = (a)arrayOfObject[n];
/*  940 */       a.c(this);
/*      */     } 
/*      */     
/*  943 */     m.a((af)this);
/*  944 */     this.do.e();
/*      */     
/*  946 */     super.a();
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
/*      */   public strictfp l da() {
/*  958 */     return this.v;
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
/*      */   public strictfp boolean I() {
/*  971 */     if (this.v.aw)
/*      */     {
/*  973 */       return false;
/*      */     }
/*  975 */     if (this.g)
/*      */     {
/*  977 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  982 */     if (this.cq != null)
/*      */     {
/*  984 */       return false;
/*      */     }
/*      */     
/*  987 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean aN() {
/*  993 */     if (this.v.dC)
/*      */     {
/*  995 */       return false;
/*      */     }
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
/* 1007 */     i i1 = cV();
/* 1008 */     if (i1 != null)
/*      */     {
/* 1010 */       if (!i1.O)
/*      */       {
/* 1012 */         return false;
/*      */       }
/*      */     }
/*      */     
/* 1016 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean aO() {
/* 1022 */     if (this.v.aw)
/*      */     {
/* 1024 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1031 */     i i1 = cV();
/* 1032 */     if (i1 != null)
/*      */     {
/* 1034 */       if (!i1.H)
/*      */       {
/* 1036 */         return false;
/*      */       }
/*      */     }
/*      */     
/* 1040 */     return true;
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
/*      */   public strictfp ah h() {
/* 1056 */     return this.v.eW;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean i() {
/* 1062 */     if (this.v.eW == ah.d)
/*      */     {
/* 1064 */       return (this.dJ >= 4.0F);
/*      */     }
/*      */     
/* 1067 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean P() {
/* 1073 */     return (this.dJ <= -1.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cf() {
/* 1079 */     if (h() == ah.e)
/*      */     {
/* 1081 */       return true;
/*      */     }
/*      */     
/* 1084 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cd() {
/* 1091 */     if (h() == ah.d)
/*      */     {
/* 1093 */       return true;
/*      */     }
/* 1095 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e v() {
/* 1102 */     if (this.bB.i == -1 || this.v.ah == null)
/*      */     {
/* 1104 */       return null;
/*      */     }
/* 1106 */     return this.v.ah[this.bB.M()];
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e d() {
/* 1112 */     if (this.bz)
/*      */     {
/* 1114 */       if (this.v.ac != null)
/*      */       {
/* 1116 */         return this.v.ac;
/*      */       }
/*      */     }
/* 1119 */     return this.v.ag[this.bB.M()];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e k() {
/* 1126 */     return this.v.ae;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean F() {
/* 1131 */     return ((l.u()).by.renderExtraShadows && (!this.bz || this.dJ >= 1.0F) && this.dJ >= -1.0F);
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
/*      */   public strictfp e d(int paramInt) {
/* 1150 */     as as = this.v.fE[paramInt];
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
/* 1163 */     if (as.B != null && as.B.read(this))
/*      */     {
/* 1165 */       return null;
/*      */     }
/*      */     
/* 1168 */     if (as.aD != null)
/*      */     {
/* 1170 */       return as.aD[this.bB.M()];
/*      */     }
/*      */     
/* 1173 */     if (as.aC != null)
/*      */     {
/* 1175 */       return as.aC;
/*      */     }
/*      */     
/* 1178 */     if (this.v.ai != null)
/*      */     {
/* 1180 */       return this.v.ai[this.bB.M()];
/*      */     }
/* 1182 */     return this.v.ad;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float h(int paramInt) {
/* 1188 */     as as = this.v.fE[paramInt];
/* 1189 */     return as.aF;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float i(int paramInt) {
/* 1195 */     as as = this.v.fE[paramInt];
/* 1196 */     return as.aG;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean e() {
/* 1204 */     l l1 = l.u();
/*      */     
/* 1206 */     if (bw())
/*      */     {
/* 1208 */       l1.bC.a((r)this);
/*      */     }
/*      */     
/* 1211 */     if (this.bR < 1.0F) {
/*      */ 
/*      */       
/* 1214 */       if (this.v.bm != null && this.v.bm.b()) {
/*      */         
/* 1216 */         this.v.bm.a(this.dH, this.dI, this.dJ, this.bL, null);
/* 1217 */         return false;
/*      */       } 
/* 1219 */       if (this.v.bn != null && this.v.bn.b()) {
/*      */         
/* 1221 */         this.v.bn.a(this.dH, this.dI, this.dJ, this.bL, null);
/* 1222 */         return false;
/*      */       } 
/*      */       
/* 1225 */       a(u.a);
/* 1226 */       return false;
/*      */     } 
/*      */ 
/*      */     
/* 1230 */     if (!this.v.eX)
/*      */     {
/* 1232 */       R(0);
/*      */     }
/*      */ 
/*      */     
/* 1236 */     if (this.v.bn != null && this.v.bn.b())
/*      */     {
/* 1238 */       this.v.bn.a(this.dH, this.dI, this.dJ, this.bL, null);
/*      */     }
/*      */ 
/*      */     
/* 1242 */     if (this.v.bq != -1)
/*      */     {
/*      */       
/* 1245 */       a((af)null, this.dH, this.dI, this.v.bq, (am)null, 0);
/*      */     }
/*      */ 
/*      */     
/* 1249 */     if (this.v.br != null) {
/*      */       m m1;
/*      */ 
/*      */       
/* 1253 */       if (this.v.bs && this.be != null && this.be.bB != null) {
/*      */ 
/*      */         
/* 1256 */         m1 = this.be.bB;
/*      */       }
/*      */       else {
/*      */         
/* 1260 */         m1 = this.bB;
/*      */       } 
/*      */       
/* 1263 */       if (!m1.u)
/*      */       {
/* 1265 */         this.v.br.a(this.dH, this.dI, this.dJ, this.bL, m1, this.ci, (af)this);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1271 */     this.by = false;
/*      */     
/* 1273 */     if (!this.v.eX)
/*      */     {
/* 1275 */       cZ();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1281 */     if (this.v.bc) {
/*      */ 
/*      */ 
/*      */       
/* 1285 */       boolean bool = false;
/* 1286 */       if (this.v.bg)
/*      */       {
/* 1288 */         if (l1.H() && l1.bF.aH.i)
/*      */         {
/* 1290 */           bool = true;
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1302 */       if (!bool) {
/*      */ 
/*      */         
/* 1305 */         f f1 = o.a((af)this, this.dH, this.dI, this.dH, this.dI);
/* 1306 */         f1.aH = false;
/*      */         
/* 1308 */         f1.Z = this.v.bd;
/*      */         
/* 1310 */         f1.Y = this.v.be;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1315 */     if (this.v.bb != 0) {
/*      */ 
/*      */       
/* 1318 */       ab ab = new ab(false);
/* 1319 */       ab.dH = this.dH;
/* 1320 */       ab.dI = this.dI;
/* 1321 */       ab.a(m.f);
/*      */       
/* 1323 */       m.c((af)ab);
/*      */     } 
/*      */ 
/*      */     
/* 1327 */     if (this.v.bo != null)
/*      */     {
/* 1329 */       this.v.bo.a(this.dH, this.dI, 1.0F);
/*      */     }
/*      */     
/* 1332 */     if (this.v.es) {
/*      */ 
/*      */       
/* 1335 */       if (this.v.bo == null)
/*      */       {
/* 1337 */         l1.bu.a(e.z, 0.8F, this.dH, this.dI);
/*      */       }
/*      */ 
/*      */       
/* 1341 */       if (this.v.bj) {
/*      */         
/* 1343 */         if (!i() && !this.v.ey)
/*      */         {
/* 1345 */           com.corrodinggames.rts.game.k.a((r)this, 1);
/*      */         }
/*      */ 
/*      */         
/* 1349 */         if (this.v.bi != null) {
/*      */           
/* 1351 */           a(this.v.bi, true);
/*      */ 
/*      */         
/*      */         }
/* 1355 */         else if (this.v.aY) {
/*      */           
/* 1357 */           a(u.d);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1363 */       if (this.v.et)
/*      */       {
/*      */         
/* 1366 */         for (byte b = 0; b < bk(); b++)
/*      */         {
/* 1368 */           l1.bz.d(this.dH, this.dI, this.dJ);
/*      */         
/*      */         }
/*      */       
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1376 */       if (this.ds != null) {
/*      */         
/* 1378 */         di();
/*      */ 
/*      */         
/* 1381 */         for (byte b = 0; b < this.ds.length; b++) {
/*      */           
/* 1383 */           d d1 = this.ds[b];
/* 1384 */           af af = this.v.am[b];
/*      */ 
/*      */           
/* 1387 */           float f1 = this.dH + d1.b;
/* 1388 */           float f2 = this.dI + d1.c;
/*      */ 
/*      */ 
/*      */           
/* 1392 */           if (af.F && !af.m)
/*      */           {
/* 1394 */             if (af.n == null || !af.n.read(this)) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1399 */               if (!y.c(f1, f2) && !this.v.ey)
/*      */               {
/* 1401 */                 com.corrodinggames.rts.game.k.a(f1, f2);
/*      */               }
/*      */ 
/*      */               
/* 1405 */               l1.bz.b(f1, f2, 0.0F);
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1413 */       if (!i()) {
/*      */         
/* 1415 */         if (this.v.bj)
/*      */         {
/* 1417 */           if (this.v.bi != null)
/*      */           {
/* 1419 */             a(this.v.bi, true);
/*      */           }
/*      */           else
/*      */           {
/* 1423 */             a(u.b);
/*      */           }
/*      */         
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/* 1430 */         if (this.v.bj)
/*      */         {
/* 1432 */           if (this.v.bi != null) {
/*      */             
/* 1434 */             a(this.v.bi, false);
/*      */           }
/*      */           else {
/*      */             
/* 1438 */             l1.bz.b(this.dH, this.dI, this.dJ);
/*      */           } 
/*      */         }
/*      */         
/* 1442 */         for (byte b = 0; b < bk(); b++)
/*      */         {
/* 1444 */           l1.bz.e(this.dH, this.dI, this.dJ);
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1451 */     if (this.v.eX)
/*      */     {
/* 1453 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1459 */     if (this.v.ac != null) {
/*      */       
/* 1461 */       this.D = this.v.ac;
/*      */       
/* 1463 */       this.a = 0;
/* 1464 */       this.dP = true;
/*      */       
/* 1466 */       return true;
/*      */     } 
/*      */ 
/*      */     
/* 1470 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void bl() {
/* 1479 */     if (!this.v.ey)
/*      */     {
/* 1481 */       super.bl(); } 
/*      */   } public strictfp void a(float paramFloat) { if (this.i) { this.i = false; Object[] arrayOfObject1 = this.v.h.a(); for (int i1 = this.v.h.a - 1; i1 >= 0; i1--) { a a = (a)arrayOfObject1[i1]; a.a(this); }  b(ab.a); }  l l1 = this.v; super.a(paramFloat); if (this.bz && !this.l) if (this.dJ > 0.0F) { if (l1.eX && (this.bK != 0.0F || this.bH != 0.0F || this.bI != 0.0F)) { this.f += 0.017F * paramFloat; this.dJ -= this.f * paramFloat; PointF pointF = n(paramFloat); this.dH += pointF.a; this.dI += pointF.b; if (l1.eV == ah.d) { l l3 = l.u(); this.cS += paramFloat; this.cQ += paramFloat; if (l1.eY) if (this.cS > 9.0F) { this.cS = f.c(1.0F, 3.0F); e e1 = l3.bz.b(this.dH, this.dI, this.dJ, d.a, false, h.b); if (e1 != null) { e1.ap = 0; e1.ao = 0; e1.aq = 2; e1.s = true; e1.F = 0.5F; e1.X = 60.0F; e1.W = 60.0F; e1.H = 0.9F; e1.G = 1.2F; e1.ar = false; e1.Q = 0.0F; e1.R = 0.0F; }  }   if (this.cQ > 7.0F) { this.cQ = 0.0F; e e1 = l3.bz.b(this.dH, this.dI, this.dJ, d.a, false, h.a); if (e1 != null) { f.b(e1, true); e1.J = this.dH; e1.K = this.dI; e1.L = this.dJ; e1.Q += f.c(-0.1F, 0.1F) + this.bH; e1.R += f.c(-0.1F, 0.1F) + this.bI; e1.J += f.c(-4.0F, 4.0F); e1.K += f.c(-4.0F, 4.0F); }  }  }  } else { this.f += l1.dK * paramFloat; this.dJ -= this.f * paramFloat; }  } else if (!this.k) { this.k = true; if (l1.eX) { cZ(); R(0); if (l1.ac != null) { this.D = l1.ac; this.a = 0; this.dP = true; } else { bU(); }  }  if (this.f > 0.5D) { if (l1.bl != null && l1.bl.a()) l1.bl.a(this.dH, this.dI, this.dJ, this.bL, null);  if (cu()) { if (l1.bk) a(u.a);  if (ct()) (l.u()).bz.a(this.dH, this.dI, 0.0F, 0, 0.0F, 0.0F, this.bL);  } else if (l1.bk) { a(u.b); }  }  this.f = 0.0F; } else if (cu()) { if (this.dJ > -10.0F) { this.f += 8.0E-4F * paramFloat; this.dJ -= this.f * paramFloat; if (ct()) { this.r += paramFloat; if (this.r > 30.0F) { this.r = 0.0F; if (j()) { l l3 = l.u(); e e1 = l3.bz.b(this.dH, this.dI, this.dJ, this.bL); if (e1 != null) { e1.Q = 0.0F; e1.R = -0.1F; }  }  }  }  } else { this.l = true; }  } else { this.dJ = 0.0F; this.l = true; }   if (this.bz) return;  l l2 = l.u(); if (l1.aW != 0.0F) if (this.bR < 1.0F) { float f1 = this.bR + l1.aW * paramFloat; if (f1 > 1.0F) { m.b((af)this); this.bR = 1.0F; m.c((af)this); } else { this.bR = f1; }  }   if (!bG()) { if (this.bR < 1.0F) if (l1.di != null) { this.b.a(l1.di, 8); this.b.a(paramFloat); } else if (l1.dj != null) { this.b.a(l1.dj, 99); this.b.b = this.bR; this.b.d = 0.0F; this.b.a(paramFloat); }   Object[] arrayOfObject1 = l1.h.a(); for (int i1 = l1.h.a - 1; i1 >= 0; i1--) { a a = (a)arrayOfObject1[i1]; a.a(this, paramFloat); }  return; }  Object[] arrayOfObject = l1.h.a(); int n; for (n = l1.h.a - 1; n >= 0; n--) { a a = (a)arrayOfObject[n]; a.b(this, paramFloat); }  if (this.h) { this.h = false; a(ab.b); }  if (l1.aV != 0.0F) if (this.bY < this.bZ || l1.aV < 0.0F) { this.bY += l1.aV * paramFloat; if (this.bY > this.bZ) this.bY = this.bZ;  }   if (l1.cy != 0.0F) { float f1; if (!this.t) { f1 = l1.cA; } else { f1 = l1.cB; }  if (this.cf < l1.cy || f1 < 0.0F) this.cf += f1 * paramFloat;  if (this.cf >= l1.cy) { this.cf = l1.cy; this.t = false; }  if (this.cf <= 0.0F) { if (l1.aZ) { bq(); return; }  this.cf = 0.0F; }  }  if (this.ce != 0.0F) { if (l1.cx != 0.0F) { this.cb += l1.cx * paramFloat; if (this.cb > this.ce) this.cb = this.ce;  }  if (this.cb < 0.0F) this.cb = 0.0F;  if (this.cc != 0.0F) { this.cc -= this.cc * 0.02F * paramFloat; this.cc = f.a(this.cc, 0.0F, l1.cG * paramFloat); if (this.cc > 50.0F) this.cc = 50.0F;  }  }  this.do.a(paramFloat); l1 = this.v; if (l1.fe) b.a(paramFloat, this);  if (!l1.bZ.b()) { this.o += paramFloat; if (this.o > l1.cc - 0.1F) { this.o -= l1.cc; if (l1.cf.read(this)) l1.bZ.e((af)this);  }  }  if (this.cm) { this.b.a(l1.de, 3); } else if (!this.b.e || this.b.a == l1.df) { this.b.a(l1.df, 2); }  if (l1.bA) { if (l1.by && l2.cK) { if (this.bK > 0.0F || (this.bK < 0.0F && l1.bz)) this.r += paramFloat;  if (this.r > 10.0F) { this.r = 0.0F; if (this.dE && ct()) { float f1 = this.bL + 180.0F; if (this.bK < 0.0F) f1 += 180.0F;  float f2 = this.bO - 6.0F; if (f2 < 4.0F) f2 = 4.0F;  float f3 = this.dH + f.i(f1) * f2; float f4 = this.dI + f.h(f1) * f2; l2.bz.b(f3, f4, 0.0F, f1); }  }  }  if (l2.cJ) if (this.bK > 0.0F || this.bK < 0.0F) if (this.dE) { this.d += paramFloat; if (this.d > l1.bG) { this.d = 0.0F; if (this.bK > 0.0F) { if (l1.bD != null) l1.bD.a(this.dH, this.dI, this.dJ, this.bL, (w)this);  } else if (l1.bE != null) { float f1 = this.bL; if (l1.bF) f1 += 180.0F;  l1.bE.a(this.dH, this.dI, this.dJ, f1, (w)this); }  if (l1.bB && (this.bK > 0.0F || l1.bC) && !ct()) for (n = 0; n <= 1; n++) { float f1 = ((n == 0) ? -20 : 20); float f2 = this.bL + 180.0F; if (this.bK < 0.0F) { f1 += 180.0F; f2 += 180.0F; }  f2 += f.c(-7.0F, 7.0F); float f3 = this.dH + f.i(this.bL + 180.0F + f1) * (this.bO - 1.0F); float f4 = this.dI + f.h(this.bL + 180.0F + f1) * (this.bO - 1.0F); e e1 = l2.bz.c(f3, f4, this.dJ, f2, 0); if (e1 != null) { e1.Q += f.c(-0.15F, 0.15F); e1.R += f.c(-0.15F, 0.15F); }  }   }  }    }  if (l1.eB > 0) { if (l1.eN != 0.0F) if (this.x.a > 0) { Object[] arrayOfObject1 = this.x.a(); for (byte b = 0; b < this.x.a; b++) { af af = (af)arrayOfObject1[b]; if (af.bY < af.bZ || l1.eN < 0.0F) { af.bY += l1.eN * paramFloat; if (af.bY > af.bZ) af.bY = af.bZ;  }  }  }   if (this.n) if (l1.eR.read(this)) { this.m = f.a(this.m, paramFloat); if (this.m == 0.0F) { this.m = l1.eC; if (this.x.size() == 0) { this.n = false; } else { i(false); if (this.x.size() == 0) this.n = false;  }  }  }   }  if (!this.cm) { this.q += paramFloat; } else { this.q = 0.0F; }  if (l1.eV != ah.d) if (this.cq == null) dl();   if (l1.eV == ah.g || l1.eV == ah.h) if (this.cm) if (cs()) { this.j = 0.7F; } else { this.j = 1.0F; }    if (l1.eV == ah.d) { this.e += 2.0F * paramFloat; if (this.e > 360.0F) this.e -= 360.0F;  boolean bool = i(); boolean bool1 = false; if (l1.dD) { boolean bool2 = cu(); if (!this.cm && !bool2 && this.q > 3.0F) if (!l1.dE || ao()) bool1 = true;   }  if (this.cq == null) { if (bool1) { float f1; if (l1.dI < 0.0F) { f1 = f.c(this.dJ - 2.0F) * 0.05F * 0.4F + 0.2F; } else { f1 = l1.dI; }  this.dJ = f.a(this.dJ, 2.0F, f1 * paramFloat); } else { float f1 = l1.dG + f.h(this.e) * l1.dH; if (l1.dI < 0.0F) { f2 = f.c(this.dJ - 2.0F) * 0.05F * 0.4F + 0.2F; } else { f2 = l1.dI; }  float f3 = f.c(this.dJ - f1) * 0.05F * 0.3F + 0.1F; float f2 = f.b(f2, f3); this.dJ = f.a(this.dJ, f1, f2 * paramFloat); }  if (bool != i()) { this.ao = true; dl(); }  }  } else { float f1 = l1.dG - l1.dH; if (this.dJ < f1) { this.dJ += 0.2F * paramFloat; if (this.dJ >= f1) this.dJ = f1;  }  if ((l1.dG != 0.0F || l1.dH != 0.0F || this.dJ > 0.0F) && this.cq == null) { float f2 = l1.dG; if (l1.dH != 0.0F) { this.e += 2.0F * paramFloat; if (this.e > 360.0F) this.e -= 360.0F;  f2 += f.h(this.e) * l1.dH; }  if (l1.dI < 0.0F) { f3 = f.c(this.dJ - 2.0F) * 0.05F * 0.4F + 0.2F; } else { f3 = l1.dI; }  float f4 = f.c(this.dJ - f2) * 0.05F * 0.3F + 0.1F; float f3 = f.b(f3, f4); this.dJ = f.a(this.dJ, f2, f3 * paramFloat); boolean bool = false; if (this.dJ > l1.dG + l1.dH + 1.0F) { this.f += l1.dJ * paramFloat; if (this.dJ < 0.0F) this.f = f.b(this.f, 0.2F);  this.dJ -= this.f * paramFloat; if (this.f > 1.5D) { this.cS += paramFloat; if (this.cS > 0.5D) { this.cS = 0.0F; e e1 = l2.bz.b(this.dH + f.c(-this.bO, this.bO), this.dI + f.c(-this.bO, this.bO), this.dJ, d.a, false, h.c); if (e1 != null) { e1.ap = 0; e1.ao = 0; e1.aq = 2; e1.s = true; e1.t = true; e1.u = 40.0F; e1.am = true; e1.Q = 0.1F; e1.S = 0.0F; e1.v = true; e1.F = 0.4F; e1.X = 380.0F; e1.W = e1.X; e1.H = 0.8F; e1.G = 1.7F; e1.ar = false; e1.Q += f.c(-0.04F, 0.04F); e1.R += f.c(-0.04F, 0.04F); }  }  }  if (this.dJ <= l1.dG + l1.dH + 1.0F) { if (this.f > 2.0F) bool = true;  if (this.dJ < l1.dG + l1.dH) this.dJ = l1.dG + l1.dH;  this.f = 0.0F; }  } else { if (this.f > 2.0F) bool = true;  this.f = 0.0F; }  if (bool) { e e1 = l2.bz.c(this.dH, this.dI, this.dJ, 0); if (e1 != null) { e1.H = 0.8F; e1.G = 1.4F; e1.W = 60.0F; e1.X = e1.W; }  }  }  }  n = 0; if (l1.aU) { s s = this.do.c(); boolean bool = false; if (s != null) { if (s instanceof f) { f f1 = (f)s; c c = f1.a; boolean bool1 = false; bool = f1.H(); if (c.k != null) { al al = c.k.c(); if (al != null && al instanceof l) { n = 1; if (al != l1) { if (this.w != null) { m.b((af)this); a(this.w, false); this.w = null; l1 = this.v; m.c((af)this); }  m.b((af)this); this.w = l1; a((l)al, false); l1 = this.v; m.c((af)this); }  }  }  if (c.Q != null) { float f3, f2 = c.Q.floatValue(); if (c.T) { f3 = this.dH; float f4 = this.dI; i i1 = this.do.b(); if (i1 != null) { float f5 = Float.MIN_VALUE; float f6 = Float.MIN_VALUE; if (i1.g != null) { f5 = i1.g.dH; f6 = i1.g.dI; } else if (i1.f != null) { f5 = i1.f.a; f6 = i1.f.b; }  if (f5 > Float.MIN_VALUE) { float f7 = f.d(f3, f4, f5, f6); f2 += f7; }  }  }  if (c.U == null) { f3 = a(paramFloat, f2, true, c.R); } else { int i1 = c.U.e; f3 = a(paramFloat, f2, i1); ai ai = this.cn[i1]; ai.b(5); ai.b = ai.a; }  if (c.S) if (f.c(f3) > 5.0F) bool1 = true;   }  if (c.P != null && !bool1) this.b.a(c.P.b(), 10);  if (bool1) this.do.e = 0.0F;  }  if (l1.dk != null) if (s.i() != null) if (this.do.e >= l1.dk.p) this.b.a(l1.dk, 5);    }  this.g = bool; if (this.g) { this.bH = 0.0F; this.bI = 0.0F; this.bK = 0.0F; }  }  if (this.w != null) if (n == 0) { m.b((af)this); a(this.w, false); this.w = null; l1 = this.v; m.c((af)this); }   this.b.a(paramFloat); r(paramFloat); l1 = this.v; } public strictfp float ci() { int n = this.v.bZ.b; return n * this.v.cd; } public strictfp d cj() { return this.v.ca; }
/*      */   public strictfp d ck() { return this.v.cb; }
/*      */   public strictfp boolean a(int paramInt, af paramaf, boolean paramBoolean1, boolean paramBoolean2) { as as = this.v.fE[paramInt]; return a(as, paramInt, paramaf, paramBoolean1, paramBoolean2); }
/*      */   public final strictfp boolean a(as paramas, int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean) { l l1 = l.u(); float f1 = f.a(this.dH, this.dI, paramFloat1, paramFloat2); if (f1 > paramas.ad) { if (this.bB == l1.bb) l1.bA.a("Location too far");  return false; }  if (f1 < paramas.ag) { if (this.bB == l1.bb) l1.bA.a("Location too close");  return false; }  return true; }
/*      */   public final strictfp boolean a(as paramas, int paramInt, af paramaf, boolean paramBoolean1, boolean paramBoolean2) { if (!paramBoolean1) if (paramas.H || paramBoolean2) { float f1 = f.a(this.dH, this.dI, paramaf.dH, paramaf.dI); if (f1 > paramas.ad) return false;  if (f1 < paramas.ag) return false;  }   if (!paramas.G) return true;  if (paramas.ah != -1.0F) { float f1; if (paramas.v != -1) { f1 = (this.cn[paramas.v]).a + paramas.i; } else { f1 = this.bL + paramas.i; }  float f2 = f.d(this.dH, this.dI, paramaf.dH, paramaf.dI); float f3 = f.c(f1, f2, 360.0F); if (f.c(f3) > paramas.ah) return false;  }  if (paramas.M != null) if (!paramas.M.read(this)) return false;   if (paramas.N != null) if (!h.a(paramas.N, paramaf.cM())) return false;   if (paramas.O != null) if (h.a(paramas.O, paramaf.cM())) return false;   if (paramaf.i()) { if (paramas.I != null) return paramas.I.read(this);  return true; }  if (paramaf.P()) { if (paramas.K != null) return paramas.K.read(this);  return true; }  if (paramas.L != null) if (!paramas.L.read(this)) if (!paramaf.cr()) return false;    if (paramas.J != null) return paramas.J.read(this);  return true; }
/*      */   public strictfp void a(af paramaf, int paramInt) { as as = this.v.fE[paramInt]; if (!as.A) return;  if (!a(as, paramInt, paramaf, false, false)) return;  for (byte b = 0; b < this.v.fE.length; b++) { as as1 = this.v.fE[b]; if (as1 != null && b != paramInt) if (as1.an != null && as1.an == as) if ((this.cn[b]).e < 9000.0F - b(paramInt) * 0.5F - as1.m) (this.cn[b]).e = 0.0F;    }  if (as.v != -1) { as as1 = this.v.fE[as.v]; if (!as1.A) if (as1.o != 0.0F) (this.cn[as.v]).e = b(as.v) + t(as.v);   }  this.b.a(this.v.dg, 11, true); b(as); a(paramaf, -1.0F, -1.0F, paramInt, (am)null, 0); }
/* 1488 */   public strictfp void S() { super.S();
/*      */ 
/*      */     
/* 1491 */     for (byte b = 0; b < this.v.fE.length; b++)
/*      */     
/*      */     { 
/* 1494 */       ai ai = this.cn[b];
/*      */       
/* 1496 */       l.d("Dir was:" + ai.a + " for name:" + (this.v.fE[b]).a);
/*      */       
/* 1498 */       l.d("lockDelay:" + ai.d + " shootCooldown:" + ai.e);
/*      */       
/* 1500 */       l.d("updateAndShouldResetTurret:" + b(b, 0.0F));
/*      */       
/* 1502 */       float f1 = C(b);
/*      */       
/* 1504 */       l.d("idleDir:" + f1);
/*      */       
/* 1506 */       float f2 = f.c(ai.a, f1, 360.0F);
/*      */       
/* 1508 */       l.d("diffDir:" + f2); }  } public strictfp boolean a(as paramas) { if (paramas.t > 0.0F) { if (paramas.t > this.cf) return false;  if (this.t) return false;  }  if (paramas.u != null) if (!paramas.u.b((af)this, false)) return false;   return true; }
/*      */   public strictfp void b(as paramas) { if (paramas.t > 0.0F) { this.cf -= paramas.t; if (this.cf < paramas.t && this.v.cC) this.t = true;  }  if (paramas.u != null) paramas.u.c((af)this, false);  }
/*      */   public static strictfp f a(af paramaf, int paramInt, am paramam, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { f f1 = f.a(paramaf, paramFloat1, paramFloat2, paramFloat3, paramInt); a(f1, paramaf, paramInt, paramam, paramFloat1, paramFloat2, paramFloat3, paramFloat4); return f1; }
/*      */   public static strictfp void a(f paramf, af paramaf, int paramInt, am paramam, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { l l1 = l.u(); paramf.az = paramFloat4; paramf.aT = paramFloat4; if (paramaf == null) throw new RuntimeException("Source cannot be null");  paramf.g = paramam; paramf.G = paramam.aH; paramf.aR = paramam.aI; paramf.U = paramam.b; paramf.Y = paramam.c; paramf.Z = paramam.i; if (paramam.l) { paramf.aa = false; paramf.ab = true; } else { paramf.aa = !paramam.k; }  paramf.ac = paramam.n; if (paramam.m) { paramf.ad = true; paramf.ae = false; }  paramf.D = paramam.p; paramf.aY = paramam.q; paramf.aZ = paramam.r; if (paramam.o < 0.5D) { paramf.C = true; } else { paramf.H = paramam.o; }  paramf.h = paramam.v; paramf.i = paramam.u; paramf.t = paramam.w; if (paramam.aL != 0.0F) paramf.t += f.a((w)paramaf, (int)(-paramam.aL * 100.0F), (int)(paramam.aL * 100.0F), 1) / 100.0F;  if (paramam.S) if (paramInt != -1) { paramf.au = (w)paramaf; if (paramaf instanceof r) { r r = (r)paramaf; paramf.av = paramInt; ag ag1 = r.D(paramInt); paramf.aw = ag1.a; paramf.ax = ag1.b; paramf.ay = paramaf.dJ + ag1.c; } else { paramf.aw = paramaf.dH; paramf.ax = paramaf.dI; paramf.ay = paramaf.dJ; }  }   paramf.w = paramam.D; paramf.u = paramam.E; paramf.v = paramam.F; paramf.af = paramam.aM; paramf.ag = paramam.aN; paramf.ah = paramam.aO; paramf.ai = paramam.aP; paramf.ak = paramam.aQ; paramf.al = paramam.aR; paramf.am = paramam.aS; paramf.an = paramam.aT; if (paramam.aU > 0.0F) { paramf.ao = true; paramf.W = paramam.aU; paramf.X = paramf.W; }  paramf.ar = paramam.aD; if (paramam.aF != 0.0F) { float f1 = paramam.aG; int n = Color.a(paramf.ar); int i1 = (int)(Color.b(paramf.ar) * f1); int i2 = (int)(Color.c(paramf.ar) * f1); int i3 = (int)(Color.d(paramf.ar) * f1); int i4 = paramaf.bB.F(); i1 = (int)(i1 + Color.b(i4) * paramam.aF); i2 = (int)(i2 + Color.c(i4) * paramam.aF); i3 = (int)(i3 + Color.d(i4) * paramam.aF); i1 = f.b(i1, 0, 255); i2 = f.b(i2, 0, 255); i3 = f.b(i3, 0, 255); paramf.ar = Color.a(n, i1, i2, i3); }  paramf.P = paramam.x; paramf.R = paramam.y; paramf.S = !paramam.A; paramf.Q = paramam.z; if (paramam.B != null) { paramf.P = 0; paramf.R = 0; }  paramf.x = paramam.aE; paramf.m = paramam.s; paramf.A = paramam.H; paramf.M = paramam.U; paramf.B = paramam.V; paramf.aH = paramam.ad; paramf.aG = paramam.av; paramf.aM = paramam.ae; if (paramam.ah != null) paramam.ah.a(paramf.dH, paramf.dI, paramf.dJ, paramf.az, (w)paramf);  if (paramam.an != -1) { boolean bool = false; e e1 = paramf.aP; if (e1 != null && e1.b == paramf && e1.d) if (e1 != null) { if (e1.W < 150.0F) e1.W = 200.0F;  bool = true; }   if (!bool) { e e2 = l1.bz.a((w)paramf, paramam.an, paramam.ao); if (e2 != null) { if (paramam.ap) e2.c = true;  if (paramam.K) paramf.aP = e2;  }  }  }  paramf.aQ = paramam.aq; if (paramam.ar != -1.0F) paramf.aI = paramam.ar;  if (paramam.as != -1.0F) paramf.aJ = paramam.as;  paramf.aL = -1.0F; if (paramam.at != -1.0F) paramf.r = paramam.at;  paramf.s = paramam.au; if (paramam.aX != null); paramf.aE = paramam.bb; paramf.dF = paramaf.dF; if (paramf.dF < 4 && paramFloat3 >= -1.0F) paramf.dF = 4;  if (paramam.T) paramf.dF = 1;  }
/*      */   public strictfp f a(af paramaf, float paramFloat1, float paramFloat2, int paramInt1, am paramam, int paramInt2) { am am1; l l1 = l.u(); as as = this.v.fE[paramInt1]; if (as.az != null) this.b.a(as.az.b(), 6, true);  if (as.aA > 0.0F) b(as.aA);  if (as.aB != null) { PointF pointF1 = new PointF(paramFloat1, paramFloat2); as.aB.a(this, pointF1, paramaf, paramInt2 + 1); }  if (as.aH > 0) for (byte b = 0; b < as.aH; b++) { if (this.x != null && this.x.size() > 0) { af af1 = (af)this.x.remove(this.x.size() - 1); af1.cp = null; af1.dH = af1.dH; af1.dI = af1.dI; af1.bL = this.bL; if (af1 instanceof r) { r r = (r)af1; r.ax(); if (paramaf != null) { r.k(paramaf); } else { r.e(paramFloat1, paramFloat2); }  }  }  }   if (paramam == null) { am1 = this.v.fF[as.a(this)]; } else { am1 = paramam; }  PointF pointF = J(paramInt1); ag ag1 = D(paramInt1); f f1 = null; if (am1.K && paramam == null) { if (this.C == null) this.C = new f[31];  if (this.C[paramInt1] != null) if (!(this.C[paramInt1]).dC) { f1 = this.C[paramInt1]; f1.a((af)this, ag1.a, ag1.b, this.dJ + ag1.c); if (!am1.M) if (f1.ap != null) f1.ap.clear();   }   }  this.bi = (int)(this.bi + 1L + this.dA); float f2 = (this.cn[paramInt1]).a; boolean bool = false; if (f1 == null) { f1 = f.a((af)this, ag1.a, ag1.b, this.dJ + ag1.c, paramInt1); if (am1.K) this.C[paramInt1] = f1;  } else { f1.g = am1; bool = true; }  a(f1, (af)this, paramInt1, am1, ag1.a, ag1.b, this.dJ + ag1.c, f2); am1.a((af)this, f1, paramaf, paramFloat1, paramFloat2, m()); if (!bool && am1.Q == 0.0F && am1.R == 0.0F) { f1.K = pointF.a; f1.L = pointF.b; }  if (as.F != null) l1.bz.a(ag1.a, ag1.b, this.dJ + ag1.c, as.F.intValue());  if (as.D != null) as.D.a(ag1.a, ag1.b, this.dJ + ag1.c, (this.cn[paramInt1]).a, (w)this);  if (as.C != null) { float f3 = 1.0F + f.c(-0.07F, 0.07F); as.C.a(ag1.a, ag1.b, f3); }  if (this.v.dV)
/*      */       this.I = null;  if (as.ax)
/*      */       (this.cn[paramInt1]).j = null;  if (this.v.aY)
/*      */       if (!this.bz)
/*      */         bq();   if (this.v.ba)
/*      */       if (!this.bz) { a(); this.bz = true; }   return f1; }
/*      */   public strictfp float m() { return this.v.du; }
/*      */   public strictfp int y() { if (this.v.aM != -1)
/*      */       return this.v.aM;  return super.y(); }
/* 1521 */   public strictfp void a(l paraml, boolean paramBoolean) { l l1 = l.u();
/*      */     
/* 1523 */     l l2 = this.v;
/*      */     
/* 1525 */     this.v = paraml;
/* 1526 */     this.db = this.v;
/*      */     
/* 1528 */     bF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1534 */     k(true);
/*      */ 
/*      */     
/* 1537 */     if (!paramBoolean) {
/*      */       
/* 1539 */       if (paraml.fE.length > 1)
/*      */       {
/* 1541 */         boolean bool = true;
/*      */         
/* 1543 */         if (paraml.fE.length != l2.fE.length) {
/*      */           
/* 1545 */           bool = false;
/*      */         }
/*      */         else {
/*      */           
/* 1549 */           for (byte b = 0; b < paraml.fE.length; b++) {
/*      */             
/* 1551 */             as as1 = paraml.fE[b];
/* 1552 */             as as2 = l2.fE[b];
/*      */             
/* 1554 */             if (!as1.a.equalsIgnoreCase(as2.a)) {
/*      */               
/* 1556 */               bool = false;
/*      */               
/*      */               break;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/* 1563 */         if (!bool)
/*      */         {
/* 1565 */           ai[] arrayOfAi = new ai[paraml.fE.length];
/*      */           
/*      */           byte b;
/*      */           
/* 1569 */           for (b = 0; b < paraml.fE.length; b++) {
/*      */             
/* 1571 */             as as1 = paraml.fE[b];
/* 1572 */             as as2 = l2.c(as1.a);
/*      */             
/* 1574 */             if (as2 != null) {
/*      */               
/* 1576 */               arrayOfAi[as1.e] = this.cn[as2.e];
/* 1577 */               this.cn[as2.e] = null;
/*      */             } 
/*      */           } 
/*      */ 
/*      */           
/* 1582 */           for (b = 0; b < paraml.fE.length; b++) {
/*      */             
/* 1584 */             if (arrayOfAi[b] == null) {
/*      */ 
/*      */ 
/*      */               
/* 1588 */               for (byte b1 = 0; b1 < paraml.fE.length; b1++) {
/*      */                 
/* 1590 */                 if (this.cn[b1] != null) {
/*      */                   
/* 1592 */                   arrayOfAi[b] = this.cn[b1];
/* 1593 */                   this.cn[b1] = null;
/*      */                   
/*      */                   break;
/*      */                 } 
/*      */               } 
/*      */               
/* 1599 */               if (arrayOfAi[b] == null)
/*      */               {
/* 1601 */                 arrayOfAi[b] = new ai();
/*      */               }
/*      */               
/* 1604 */               arrayOfAi[b].a(this.bL);
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1610 */           this.cn = arrayOfAi;
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1620 */       for (byte b = 0; b < paraml.fE.length; b++) {
/*      */         
/* 1622 */         float f3 = this.bL + B(b);
/*      */         
/* 1624 */         this.cn[b].a(f3);
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
/*      */ 
/*      */ 
/*      */     
/* 1638 */     S(this.v.W);
/* 1639 */     T(this.v.X);
/* 1640 */     this.dP = false;
/*      */ 
/*      */     
/* 1643 */     this.bO = this.v.cH;
/* 1644 */     this.bP = this.v.cO;
/*      */     
/* 1646 */     if (this.bz) {
/*      */       
/* 1648 */       this.a = 0;
/*      */     }
/*      */     else {
/*      */       
/* 1652 */       this.a = this.v.P;
/*      */     } 
/*      */ 
/*      */     
/* 1656 */     this.g = false;
/*      */     
/* 1658 */     if (paramBoolean)
/*      */     {
/* 1660 */       this.dJ += this.v.dF;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1667 */     float f1 = this.bZ;
/*      */     
/* 1669 */     this.bZ = this.v.cs;
/*      */     
/* 1671 */     if (paramBoolean) {
/*      */       
/* 1673 */       this.bY = this.bZ;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1678 */     else if (f1 == 0.0F) {
/*      */       
/* 1680 */       this.bY = this.bZ;
/*      */     }
/*      */     else {
/*      */       
/* 1684 */       this.bY = this.bY / f1 * this.bZ;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1689 */     float f2 = this.ce;
/*      */     
/* 1691 */     this.ce = this.v.ct;
/*      */     
/* 1693 */     if (this.v.cu) {
/*      */       
/* 1695 */       if (this.cb > this.ce)
/*      */       {
/* 1697 */         this.cb = this.ce;
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1702 */     else if (paramBoolean) {
/*      */       
/* 1704 */       this.cb = this.ce;
/*      */ 
/*      */     
/*      */     }
/* 1708 */     else if (f2 == 0.0F) {
/*      */       
/* 1710 */       this.cb = this.ce;
/*      */     }
/*      */     else {
/*      */       
/* 1714 */       this.cb = this.cb / f2 * this.ce;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1721 */     if (this.v.cz) {
/*      */       
/* 1723 */       if (this.cf > this.v.cy)
/*      */       {
/* 1725 */         this.cf = this.v.cy;
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1730 */     else if (paramBoolean) {
/*      */       
/* 1732 */       this.cf = this.v.cy * this.v.cD;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1737 */     else if (l2.cy == 0.0F) {
/*      */       
/* 1739 */       this.cf = this.v.cy;
/*      */     }
/*      */     else {
/*      */       
/* 1743 */       this.cf = this.cf / l2.cy * this.v.cy;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1750 */     if (this.bB == null) {
/*      */       
/* 1752 */       this.D = this.v.V;
/*      */     }
/*      */     else {
/*      */       
/* 1756 */       Q();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1762 */     if (this.v.aw)
/*      */     {
/* 1764 */       if (paramBoolean)
/*      */       {
/* 1766 */         this.bL = -90.0F;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 1771 */     c_();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1776 */     if (!paramBoolean) {
/*      */       
/* 1778 */       boolean bool = (this.v.j() != l2.j()) ? true : false;
/*      */ 
/*      */ 
/*      */       
/* 1782 */       if (this.v.j()) {
/*      */ 
/*      */         
/* 1785 */         this.bI = 0.0F;
/* 1786 */         this.bH = 0.0F;
/*      */         
/* 1788 */         if (l2.j())
/*      */         {
/* 1790 */           if (!this.v.cI.equals(l2.cI))
/*      */           {
/* 1792 */             bool = true;
/*      */           }
/*      */         }
/*      */       } 
/*      */       
/* 1797 */       if (bool)
/*      */       {
/* 1799 */         l1.bC.a((r)this);
/*      */       }
/*      */     } 
/*      */     
/* 1803 */     this.j = 1.0F;
/*      */ 
/*      */ 
/*      */     
/* 1807 */     if (this.v.cp != -2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1816 */     if (!this.bz)
/*      */     {
/* 1818 */       dl();
/*      */     }
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
/* 1831 */     if (this.v.eu);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1837 */     dh();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1842 */     cO().a(this.v);
/*      */ 
/*      */     
/* 1845 */     if (!paramBoolean) {
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
/* 1856 */       int n = bg();
/* 1857 */       for (byte b = 0; b < n; b++) {
/*      */         
/* 1859 */         ai ai = this.cn[b];
/*      */         
/* 1861 */         as as = this.v.fE[b];
/* 1862 */         if (as != null) {
/*      */ 
/*      */           
/* 1865 */           if (ai.e > as.l)
/*      */           {
/*      */ 
/*      */ 
/*      */             
/* 1870 */             ai.e = as.l;
/*      */           }
/*      */ 
/*      */ 
/*      */           
/* 1875 */           if (ai.f > as.m)
/*      */           {
/* 1877 */             ai.f = as.m;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1887 */     if (!paramBoolean) {
/*      */       
/* 1889 */       if (!this.v.cN)
/*      */       {
/*      */         
/* 1892 */         this.do.b = null;
/*      */       }
/*      */ 
/*      */       
/* 1896 */       if (this.v.eV != l2.eV)
/*      */       {
/*      */         
/* 1899 */         aE();
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
/* 1920 */     if (this.v.ck)
/*      */     {
/* 1922 */       if (this.x.size() == 0)
/*      */       {
/* 1924 */         c(m.g);
/*      */       }
/*      */     }
/*      */     
/* 1928 */     if (this.ci)
/*      */     {
/*      */       
/* 1931 */       if (!l1.bA.i((af)this))
/*      */       {
/* 1933 */         l1.bA.l((af)this);
/*      */       }
/*      */     }
/*      */     
/* 1937 */     if (!paramBoolean) {
/*      */ 
/*      */       
/* 1940 */       Object[] arrayOfObject = this.v.h.a();
/* 1941 */       for (int n = this.v.h.a - 1; n >= 0; n--) {
/*      */         
/* 1943 */         a a = (a)arrayOfObject[n];
/* 1944 */         a.a(this, l2);
/*      */       } 
/*      */       
/* 1947 */       if (this.bR >= 1.0F) {
/*      */         
/* 1949 */         if (this.v.cS > l2.cS)
/*      */         {
/* 1951 */           c(false);
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 1956 */       else if (this.v.cT > l2.cT) {
/*      */         
/* 1958 */         c(false);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1964 */     if (this.i)
/*      */     {
/* 1966 */       if (this.v.dh != null)
/*      */       {
/* 1968 */         this.b.a(this.v.dh, 7, true); }  }  } public strictfp int s(af paramaf) { int n = paramaf.r().a((af)this); if (this.v.aN != -1) { if (this.v.aO) { int i1 = (int)(this.v.aN + this.bO); if (paramaf != null) i1 = (int)(i1 + paramaf.bO);  return i1 + n; }  return this.v.aN + n; }  return y() + n; } public strictfp int t(af paramaf) { int n = paramaf.r().a((af)this); if (this.v.aP != -1) { if (this.v.aQ) { int i1 = (int)(this.v.aP + this.bO); if (paramaf != null) i1 = (int)(i1 + paramaf.bO);  return i1 + n; }  return this.v.aP + n; }  return y() + n; } public strictfp boolean u(af paramaf) { return this.v.aQ; } public strictfp boolean v(af paramaf) { return this.v.aO; } public strictfp float ch() { return this.v.aT; } public strictfp float c(af paramaf) { return this.v.aR; }
/*      */   public strictfp float b(af paramaf) { return this.v.aS; }
/*      */   public strictfp float z() { return this.v.dz * this.j; }
/*      */   public strictfp float aU() { return this.v.dY; }
/*      */   public strictfp float aV() { return this.v.dZ; }
/*      */   public strictfp float A() { return this.v.dL; }
/*      */   public strictfp float c(int paramInt) { as as = this.v.fE[paramInt]; if (as.T != null) return as.T.floatValue();  return this.v.dQ; }
/*      */   public strictfp float x(int paramInt) { as as = this.v.fE[paramInt]; return as.P; }
/*      */   public strictfp float w(int paramInt) { as as = this.v.fE[paramInt]; return as.U; }
/*      */   public strictfp float y(int paramInt) { as as = this.v.fE[paramInt]; return as.V; }
/* 1978 */   public strictfp void c_() { if (this.v.aw) {
/*      */ 
/*      */       
/* 1981 */       this.by = false;
/*      */ 
/*      */     
/*      */     }
/* 1985 */     else if (!this.bz) {
/*      */       
/* 1987 */       this.by = true;
/*      */       
/* 1989 */       if (this.v.er)
/*      */       {
/* 1991 */         this.by = false;
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1998 */       this.by = false;
/*      */     } 
/*      */ 
/*      */     
/* 2002 */     if (this.cq != null)
/*      */     {
/* 2004 */       this.by = false; }  }
/*      */   public strictfp float B() { return this.v.ed; }
/*      */   public strictfp float cn() { return this.v.bw * this.c; }
/*      */   public strictfp float p(int paramInt) { return this.v.bx; }
/*      */   public strictfp float f(boolean paramBoolean) { if (!this.v.dn) return 0.0F;  if (paramBoolean && this.v.dp) return (this.cn[this.v.dr.e]).a + 90.0F;  if (this.v.do) return (this.cn[this.v.dr.e]).a + 90.0F;  return super.f(paramBoolean); }
/*      */   static PointF dl = new PointF();
/*      */   public strictfp PointF cG() { if (this.v.do && (this.cn[this.v.dr.e]).e != 0.0F) { as as = this.v.dr; if (as.o != 0.0F) { dl.a(F(this.v.dr.e)); dl.b(-this.dH, -this.dI); return dl; }  }  dl.a(0.0F, 0.0F); return dl; }
/*      */   static PointF dm = new PointF();
/*      */   Paint dn;
/* 2013 */   final j do; public float dp; public float dq; public float dr; public d[] ds; public strictfp PointF aL() { PointF pointF = cG(); dm.a(pointF.a + this.v.cq, pointF.b + this.v.cr); return dm; } public strictfp boolean c(float paramFloat) { if (this.ds != null && !this.bz) c.a(this, paramFloat, false, false);  if (!super.c(paramFloat)) return false;  l l1 = l.u(); y.a((r)this); if (this.ds != null && !this.bz && this.v.an) c.a(this, paramFloat, true, false);  if (ai() && this.v.fJ != null) if (!this.bz) { float f1 = (this.cn[this.v.fJ.e]).f / e(this.v.fJ.e); if (f1 != 0.0F) { boolean bool = true; boolean bool1 = W(); if (bool1 && this.v.bL) { bool = false; } else if (!bool1 && this.v.bH) { bool = false; }  if (bool) if ((this.v.fE[this.v.fJ.e]).aE == null) { ag ag1 = bi(); l1.bw.j(); l1.bw.b(ag1.a - l1.cd, ag1.b - ag1.c - l1.ce - this.dJ); l1.bw.a(f1, f1); if (bool1) { l1.bw.a(b.f, 0.0F, 0.0F, null); } else { l1.bw.a(b.e, 0.0F, 0.0F, null); }  l1.bw.k(); }   }  }   if (this.v.fD && !this.bz) { int n = bg(); for (byte b = 0; b < n; b++) { float f1 = (this.cn[b]).f / e(b); as as = this.v.fE[b]; if (as != null && f1 != 0.0F && as.aE != null) y.a((r)this, as.aE, f1, b);  }  }  if (!this.bz && this.cb > 0.0F && this.cd == 0.0F) { e e1 = R(); if (e1 != null) { float f1 = 0.0F; if (!this.v.cF) { f1 += 0.09F; f1 += this.cb / this.ce * 0.4F; f1 += f.b(this.cc, 50.0F) / 50.0F * 0.5F; } else { f1 += f.b(this.cc, 50.0F) / 50.0F * 0.5F; float f2 = this.cc; if (f2 > 5.0F) f2 = 5.0F;  f1 += f2 / 5.0F * 0.2F; }  if (f1 > 0.0F) { float f4; if (f1 > 1.0F) f1 = 1.0F;  if (this.dn == null) this.dn = y.a();  Paint paint = this.dn; paint.a((int)(f1 * 255.0F), 255, 255, 255); float f2 = this.dH - l1.cd; float f3 = this.dI - l1.ce - this.dJ; if (!this.v.ak) { float f5 = 87.0F; f4 = (this.v.cQ * 2) / f5 * 1.25F; } else { float f5 = e1.k; f4 = (this.v.cQ * 2) / f5 * 1.25F; }  l1.bw.j(); l1.bw.a(f4, f4, f2, f3); l1.bw.a(e1, f2, f3, f(false) - 90.0F, paint); l1.bw.k(); }  }  }  return true; } public strictfp e R() { return this.v.aj; } public strictfp float C() { return this.v.dA; } public strictfp float D() { return this.v.dB; } public strictfp boolean bd() { return this.v.dM; } public strictfp boolean be() { return this.v.dN; } public strictfp boolean l() { return this.v.ee; } public strictfp boolean ae() { return this.v.eg.read(this); } public strictfp boolean ad() { return this.v.ef.read(this); } public strictfp boolean ac() { return this.v.eh.read(this); } public strictfp boolean af() { if (this.v.ei == null) return true;  return this.v.ei.read(this); } public strictfp boolean h(af paramaf) { l l1 = this.v; if (l1.ej) { if (l1.ek != null) if (!h.a(l1.ek, paramaf.cM())) return false;   if (l1.el != null) if (h.a(l1.el, paramaf.cM())) return false;   if (l1.em) { boolean bool = false; for (byte b = 0; b < l1.fE.length; b++) { as as = l1.fE[b]; if (as.O != null) if (h.a(as.O, paramaf.cM())) continue;   if (as.N != null) if (!h.a(as.N, paramaf.cM())) continue;   bool = true; }  if (!bool) return false;  }  }  if (paramaf.i()) return ad();  if (paramaf.P()) return ac();  if (!af()) if (!paramaf.cr()) return false;   return ae(); } public strictfp boolean E() { return this.v.en; } public strictfp float g(int paramInt) { as as = this.v.fE[paramInt]; return as.W; } public strictfp float z(int paramInt) { as as = this.v.fE[paramInt]; return as.aa; } public strictfp float A(int paramInt) { as as = this.v.fE[paramInt]; return as.ag; } public strictfp float B(int paramInt) { as as = this.v.fE[paramInt]; return as.i; } public strictfp float C(int paramInt) { float f1; as as = this.v.fE[paramInt]; if (as.v != -1) { f1 = (this.cn[as.v]).a; } else { f1 = this.bL; }  if (this.bN && aX() > 0.95D) { f1 += as.j; } else { f1 += as.i; }  if (as.aq != 0.0F) return 999.0F;  return f1; } public strictfp boolean bh() { return this.v.dx; } public strictfp float q(int paramInt) { as as = this.v.fE[paramInt]; if (!as.A) return 0.0F;  am am = this.v.fF[as.a(this)]; float f1 = 0.0F; if (!am.s) f1 += am.b;  f1 += am.c; return f1; } public strictfp float b(int paramInt) { as as = this.v.fE[paramInt]; return as.l; } public strictfp float e(int paramInt) { as as = this.v.fE[paramInt]; return as.m; } public strictfp float f(int paramInt) { as as = this.v.fE[paramInt]; return as.n; } public strictfp boolean s(int paramInt) { as as = this.v.fE[paramInt]; return as.r; } public strictfp float t(int paramInt) { as as = this.v.fE[paramInt]; if (as.s == 0.0F || as.m == 0.0F) return 0.0F;  return -(as.s * (this.cn[paramInt]).f / as.m); } public strictfp boolean r(int paramInt) { as as = this.v.fE[paramInt]; if (as.A) return true;  return false; } public strictfp void b(af paramaf, int paramInt) { as as = this.v.fE[paramInt]; if (as.E != null) { PointF pointF = E(paramInt); as.E.a(pointF.a, pointF.b, this.dJ, (this.cn[paramInt]).a, (w)this); }  } public strictfp boolean u(int paramInt) { as as = this.v.fE[paramInt]; if (!a(as)) return false;  return super.u(paramInt); } public strictfp int q(af paramaf) { return this.v.eq; } public strictfp boolean bC() { return this.v.es; } public strictfp boolean bD() { return this.v.et; } public strictfp float bB() { return this.v.bQ; } public strictfp boolean cq() { return this.v.af; } public strictfp Rect a_(boolean paramBoolean) { if (paramBoolean && !this.v.af) return super.a_(paramBoolean);  if (this.bz) return super.a_(paramBoolean);  int n = this.a; int i1 = 0; m m1 = this.v.dt; if (this.b.a != null && this.b.a.j != null) m1 = this.b.a.j;  if (m1 != null) { float f2, f1 = m1.b; if (f1 < 0.0F) { f1 = -f1; f2 = -this.bL; if (m1.a) f2 = -(this.cn[this.v.dr.e]).a;  } else { f2 = this.bL; if (m1.a) f2 = (this.cn[this.v.dr.e]).a;  }  int i2 = (int)((f2 - m1.e - f1 * 0.5F) / f1); int i3 = (int)(360.0F / f1); i2 %= i3; if (i2 < 0) i2 += i3;  if (m1.c > 0) n += i2 * m1.c;  if (m1.d > 0) i1 += i2 * m1.d;  }  if (n >= this.v.M) { i1 += n / this.v.M; n %= this.v.M; }  return a(paramBoolean, n, i1); } public strictfp RectF cp() { RectF rectF = super.cp(); rectF.a(this.v.Y, this.v.Z); return rectF; } public strictfp int bg() { if (this.v == null) return 1;  return this.v.fE.length; } public strictfp int v(int paramInt) { return (this.v.fE[paramInt]).w; } public strictfp PointF F(int paramInt) { return a(paramInt, false); } public strictfp PointF a(int paramInt, boolean paramBoolean) { float f1, f2, f3; as as = this.v.fE[paramInt]; if (as.v == -1) { f1 = this.dH; f2 = this.dI; f3 = this.bL; } else { if (paramBoolean) throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");  PointF pointF = a(as.v, true); f1 = pointF.a; f2 = pointF.b; f3 = (this.cn[as.v]).a; }  if ((this.cn[paramInt]).e > 0.0F && as.o != 0.0F) { float f4 = 0.0F; float f5 = b(paramInt) + t(paramInt) - (this.cn[paramInt]).e; if (f5 < as.p) { f4 = f5 / as.p * as.o; } else if (f5 < as.p + as.q) { f4 = as.o - (f5 - as.p) / as.q * as.o; }  if (f4 != 0.0F) { f1 += f.i((this.cn[paramInt]).a) * f4; f2 += f.h((this.cn[paramInt]).a) * f4; }  }  if (as.f != 0.0F || as.g != 0.0F) { float f4 = f.h(f3); float f5 = f.i(f3); f1 += f5 * as.g - f4 * as.f; f2 += (f4 * as.g + f5 * as.f) * as.h; }  aU.a(f1, f2); aU.a = f1; aU.b = f2; return aU; } public strictfp ArrayList M() { if (this.w != null) return this.w.a(T());  return this.v.a(T()); } public strictfp s a(c paramc) { l l1; if (this.w != null) { l1 = this.w; } else { l1 = this.v; }  return l1.a(paramc); } public strictfp int T() { return this.v.bX; } public strictfp s e(al paramal) { return this.do.b(paramal); } public strictfp void a(s params, boolean paramBoolean, PointF paramPointF, af paramaf) { if (!paramBoolean) { a(ab.f); } else { a(ab.g); }  if (params == i.i) { if (!paramBoolean) { L(); } else { cY(); }  return; }  if (params == i.j) { if (!paramBoolean) cY();  return; }  if (!paramBoolean) { if (paramPointF != null) if (!a(params, paramPointF.a, paramPointF.b)) return;   if (params instanceof f) { f f1 = (f)params; if (f1.a.an != null) { l l1 = l.u(); if (this.bB == l1.bb && !l1.B()) f1.a.an.a();  }  if (f1.a.aj != null) f1.a.aj.a(this.dH, this.dI, this.dJ, this.bL, (w)this);  }  }  if (paramBoolean) if (params instanceof f) { f f1 = (f)params; if (!f1.a.H) return;  }   i i1 = this.do.a(params, paramBoolean, paramPointF, paramaf); } public strictfp k(boolean paramBoolean, l paraml) { super(paramBoolean);
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
/* 5173 */     this.do = new j((r)this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6917 */     this.ds = null;
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
/* 8458 */     this.dz = new m(); a(paraml, true); }
/*      */   public strictfp void a(s params, boolean paramBoolean) { a(params, paramBoolean, (PointF)null, (af)null); }
/*      */   public strictfp void b(s params, boolean paramBoolean) { this.do.a(params, paramBoolean); }
/*      */   public strictfp void b(s params) { this.do.a(params); }
/*      */   public strictfp boolean a(s params, float paramFloat1, float paramFloat2) { if (params instanceof f) { l l1 = l.u(); f f1 = (f)params; if (f1.a.aa != null && f1.a.ab == null) { as as = this.v.fE[f1.a.aa.intValue()]; boolean bool = true; if (!a(as, f1.a.aa.intValue(), paramFloat1, paramFloat2, bool)) return false;  if (f1.a.ae != null) if (y.a(paramFloat1, paramFloat2, f1.a.ae)) { if (this.bB == l1.bb) l1.bA.a("Invalid map location (Must be passable by " + f1.a.ae.name() + ")");  return false; }   }  }  return true; }
/* 8463 */   public strictfp void a(s params) { if (params instanceof f) { f f1 = (f)params; if (f1.a.aa != null && f1.a.ab == null) { as as = this.v.fE[f1.a.aa.intValue()]; if (as.af > 0.0F) y.b((af)this, as.af, true);  y.a((af)this, as.ac, true, true); }  }  super.a(params); } public strictfp boolean a(s params, PointF paramPointF, af paramaf, int paramInt) { l l1 = l.u(); if (paramInt > 10) return false;  params.a((af)this, paramaf); if (params instanceof f) { f f1 = (f)params; c c = f1.a; if (c.p != null) if (!c.p.read(this)) return true;   boolean bool = false; if (c.X != null) { this.cf += f1.a.X.floatValue(); bool = true; }  if (c.Y != null) { c.Y.f((af)this); bool = true; }  if (c.Z != null) { c.Z.a((af)this, this.bB.A(), true); bool = true; }  if (c.ax != null) { if (c.ax.read(this)) this.bg = l1.bh;  bool = true; }  if (c.aa != null) { PointF pointF = paramPointF; for (byte b = 0; b < c.ad; b++) { if (c.ab != null) { pointF = new PointF(); pointF.a(this.dH, this.dI); float f2 = f.i(this.bL); float f3 = f.h(this.bL); float f4 = c.ab.a; float f5 = c.ab.b; float f6 = f2 * f5 - f3 * f4; float f7 = f3 * f5 + f2 * f4; pointF.b(f6, f7); }  if (pointF == null) { ad.f("completeQueueItem:" + f1.J() + " for fireTurretXAtGround needs points but it is missing"); } else { a((af)null, pointF.a, pointF.b, f1.a.aa.intValue(), f1.a.ac, paramInt); }  }  bool = true; }  if (c.ai != null) { c.ai.a(this.dH, this.dI, this.dJ, this.bL, (w)this); bool = true; }  if (c.ak != null) { c.ak.a(this.dH, this.dI, 1.0F); bool = true; }  if (c.al != null && !l1.B()) { c.al.a(); bool = true; }  if (c.am != null) { if (this.bB == l1.bb && !l1.B()) c.am.a();  bool = true; }  if (c.W.a > 0) { Object[] arrayOfObject = c.W.a(); for (byte b = 0; b < c.W.a; b++) { a a = (a)arrayOfObject[b]; if (a.a(this, params, paramPointF, paramaf, paramInt)) bool = true;  }  }  if (c.ag != null) { if (c.af == null || c.af.read(this)) f1.a.ag.a(this, paramPointF, paramaf, paramInt + 1);  bool = true; }  if (f1.a.ah != null) { if (c.af == null || c.af.read(this)) f1.a.ah.a(this, paramPointF, paramaf);  bool = true; }  al al = null; if (c.C != null) al = c.C.c();  if (al != null) { if (!(al instanceof l)) { af af1 = al.a(); af1.dH = this.dH; af1.dI = this.dI; if (!af1.bw()) af1.bL = this.bL;  af1.d(this.bB); af1.cx(); float f2 = this.bZ; float f3 = af1.bZ; if (f2 == 0.0F) { af1.bY = af1.bZ; } else { af1.bY = this.bY / f2 * f3; }  if (this.ci) (l.u()).bA.k(af1);  m.c(af1); bU(); } else { i i1 = null; if (c.L) i1 = cM();  m.b((af)this); this.w = null; a((l)al, false); if (i1 != null) a(i1, true);  Q(); this.do.d(); this.bh = (l.u()).bh; m.c((af)this); }  bool = true; if (!f1.y().b()) U();  }  if (!bool && c.l) l.d("completeQueueItem:" + f1.J() + " had no effect (but should have)");  return true; }  return false; } public strictfp void b(i parami) { s s = a(parami.h); if (s != null) if (s instanceof f) { f f1 = (f)s; c c = f1.a; if (c.V != null) { dw.a = this.dH; dw.b = this.dI; PointF pointF = dw; af af = null; c.V.a(this, pointF, af, 0); }  }   } public strictfp void a(i parami) { float f2; s s = a(parami.h); if (s != null) { boolean bool = a(s, parami.f, parami.g, 0); if (bool) return;  }  float f1 = 0.0F; if (this.v.aw) if (this.v.cW != null) { f1 = this.bL + this.v.cW.floatValue(); f1 += 90.0F; }   if (this.v.cZ != null) { f2 = this.v.cZ.floatValue(); } else if (this.do.b != null) { f2 = this.bO * 3.0F; } else { f2 = this.bO * 2.0F; }  af af = this.do.a(parami, f2, this.p, f1); if (af != null) { B(af); m.c(af); a(ab.e); }  } public strictfp void A(af paramaf) { float f1 = 0.0F; if (this.v.aw) if (this.v.cW != null) { f1 = this.bL + this.v.cW.floatValue(); f1 += 90.0F; }   paramaf.bL = 90.0F + f1; float f2 = 70.0F; if (this.v.cZ != null) f2 = this.v.cZ.floatValue();  this.do.a(paramaf, f2, this.p); } public strictfp void B(af paramaf) { paramaf.dH = this.dH + this.v.cU; paramaf.dI = this.dI + this.v.cV; if (!this.v.aw) { float f1 = 180.0F; if (this.v.cW != null) f1 = this.v.cW.floatValue();  float f2 = 70.0F; if (this.v.cZ != null) f2 = this.v.cZ.floatValue();  float f3 = 7.0F; boolean bool = i.a((af)this, paramaf, this.p, f3, f1, f2, this.v.cU, this.v.cV); if (!this.v.cY) paramaf.dJ = this.dJ;  paramaf.dJ += this.v.cX; if (paramaf instanceof k) ((k)paramaf).dl();  if ((i() || !bool || this.v.eJ.read(this)) && cc()) y(paramaf);  }  this.p = !this.p; } public strictfp g db() { g g = new g(); m m1 = this.do.h(); int n = m1.size(); if (n != 0) { Object[] arrayOfObject = m1.a(); for (byte b = 0; b < n; b++) { i i1 = (i)arrayOfObject[b]; s s = a(i1.h); if (s != null) if (s instanceof f) { f f1 = (f)s; if (f1.a.X != null) g.c += f1.a.X.floatValue();  if (f1.a.Y != null) { g g1 = f1.a.Y; if (!g1.b()) g = g.a(g, g1);  }  if (f1.a.Z != null) { g g1 = f1.a.Z; if (!g1.b()) g = g.a(g, g1);  }  }   }  }  return g; } public strictfp boolean dg() { if (this.v.eB > 0) return (do() > this.v.eB);  return false; } public strictfp int h(al paramal) { return this.do.a(paramal); } public strictfp int h(boolean paramBoolean) { return this.do.a(s.h, paramBoolean, true); } public strictfp int a(c paramc, boolean paramBoolean) { return this.do.a(paramc, paramBoolean); } public strictfp i dc() { return this.do.b(); } public strictfp m dd() { return this.do.c; } public strictfp void df() { this.do.e = 1.0F; } public strictfp boolean de() { return this.do.a(); } public strictfp int cW() { return this.do.f(); } public strictfp void a(PointF paramPointF) { if (this.v.cN) this.do.b = paramPointF;  } public strictfp float a_() { if (!this.v.q) return -1.0F;  return super.a_(); } public strictfp float bH() { if (bG() && !this.do.a()) if (this.v.u) return this.do.e;   return super.bH(); } public strictfp float bI() { if (this.v.cy > 0.0F && this.cf < this.v.cy) if (this.v.r) return this.cf / this.v.cy;   if (this.ce > 0.0F && this.cb < this.ce) if (this.v.t) return this.cb / this.ce;   if (this.v.cy == 0.0F && this.ce == 0.0F) { if (this.v.eb != -1) if ((this.cn[this.v.eb]).e > 0.0F) return 1.0F - (this.cn[this.v.eb]).e / b(this.v.eb);   if (this.v.ec != -1) if ((this.cn[this.v.ec]).f != 0.0F) return (this.cn[this.v.ec]).f / e(this.v.ec);   }  return super.bI(); } public strictfp boolean f(float paramFloat) { return super.f(paramFloat); } public strictfp void bM() { if (this.do.b != null) { l l1 = l.u(); float f1 = (int)(this.dH - l1.cd); float f2 = (int)(this.dI - l1.ce); float f3 = (int)(this.do.b.a - l1.cd); float f4 = (int)(this.do.b.b - l1.ce); l1.bw.a(f1, f2, f3, f4, h.y); }  } public strictfp void bN() { boolean bool = true; if ((this.v.du > 70.0F && this.v.ee && this.v.dw == null) || (this.v.dw != null && this.v.dw.booleanValue())) { float f1 = m(); y.a((af)this, f1, bool); } else if (this.v.aw && this.v.aM > 50 && !this.v.ee) { float f1 = this.v.aM; y.a((af)this, f1, bool); }  if (this.v.n.size() != 0) for (w w : this.v.n) y.a((af)this, w.a, bool);   if (this.v.bu) { int n = bg(); for (byte b = 0; b < n; b++) { as as = this.v.fE[b]; if (as.aj != null && as.ak > 0.0F) y.a((af)this, as.ak, Color.a(90, 135, 235, 135), 1, bool);  }  }  } public strictfp void d(float paramFloat) { super.d(paramFloat); if (this.bz) return;  this.dk.a(paramFloat, (af)this); if (this.v.aa != null) { l l1 = l.u(); byte b1 = 0; byte b2 = 0; float f1 = this.dH - l1.cd; float f2 = this.dI - l1.ce - this.dJ; float f3 = cn(); if (f3 != 1.0F) { l1.bw.j(); l1.bw.a(f3, f3, f1, f2); }  if (this.v.ab) { int n = this.v.aa.k; int i1 = this.v.aa.l; int i2 = n / 2; int i3 = i1 / 2; cW.a(f1 - i2, f2 - i3, f1 + i2, f2 + i3); cX.a(b1, b2, b1 + n, b2 + i1); } else { cW.a(f1 - this.dN, f2 - this.dO, f1 + this.dN, f2 + this.dO); cX.a(b1, b2, b1 + this.dL, b2 + this.dM); }  l1.bw.a(this.v.aa, cX, cW, aK()); if (f3 != 1.0F) l1.bw.k();  }  if (this.v.ao && this.ds != null && !this.bz) c.a(this, paramFloat, false, true);  } public strictfp float aJ() { return this.v.ds; } public strictfp m g(boolean paramBoolean) { this.dz.clear();
/*      */     
/* 8465 */     if (this.v.ap.a > 0)
/*      */     {
/* 8467 */       h.a(this, this.dz, paramBoolean);
/*      */     }
/*      */ 
/*      */     
/* 8471 */     if (this.dz.a > 0)
/*      */     {
/* 8473 */       return this.dz;
/*      */     }
/* 8475 */     return null; } public strictfp Paint aK() { return super.aK(); } public strictfp boolean aR() { return this.v.eu; } public strictfp boolean bw() { return this.v.aw; } public strictfp boolean q() { if (this.cq != null && this.cq.bR < 1.0F) return true;  return this.v.az; } private strictfp boolean D(af paramaf) { if (paramaf.q()) return false;  if (paramaf == this) return false;  if (paramaf.bw()) { if (this.v.aJ) return true;  } else if (this.v.aK) { return true; }  return false; } public strictfp boolean a(af paramaf) { if (this.v.fd != null) if (!h.a(this.v.fd, paramaf.cM())) return false;   return D(paramaf); } public strictfp boolean i(af paramaf) { if (paramaf.g() != 0.0F && x(paramaf)) return true;  if (this.v.fc != null) if (!h.a(this.v.fc, paramaf.cM())) return false;   return D(paramaf); } public strictfp void j(af paramaf) { if (this.v.aX) { an an = ap(); if (an != null) { ab ab = an.i; if (ab != null) ab.a(an);  }  if (this.ci && paramaf != null) (l.u()).bA.k(paramaf);  bU(); }  } public strictfp boolean aj() { if (this.v.aX) return true;  return false; } public strictfp boolean ah() { return this.v.ff; } public strictfp boolean ce() { return this.v.fB; } public strictfp boolean ai() { return this.v.fe; } public strictfp boolean w(af paramaf) { if (!x(paramaf)) return false;  if (paramaf.c((r)this)) return false;  return true; } public strictfp boolean x(af paramaf) { if (!this.v.eZ) return false;  if (this.v.fa != null) if (!h.a(this.v.fa, paramaf.cM())) return false;   return true; } public strictfp int cB() { return this.v.fb; } public strictfp boolean bx() { return this.v.fj; } public strictfp void a(float paramFloat, boolean paramBoolean) { super.a(paramFloat, paramBoolean); if (!this.bz && ai()) if (W()) { if (!this.v.bL) b.b(paramFloat, this);  } else if (!this.v.bH) { b.b(paramFloat, this); }   } public strictfp boolean o() { return this.v.cg; } public strictfp boolean p() { return this.v.ch; } public strictfp void d(m paramm) { if (this.v.cl) { a(m.f); return; }  if (this.v.ck && this.x.size() == 0) { a(m.g); return; }  super.d(paramm); } public strictfp void cx() {} public strictfp float g() { return this.v.cm; } public strictfp int cz() { return this.v.cn; } public strictfp i cA() { return this.v.co; } public strictfp void cy() { if (this.v.aW == 0.0F) if (g() > 0.0F) { m.b((af)this); this.bR = 1.0F; m.c((af)this); }   } public strictfp c ca() { if (this.v.eB != 0) return i.i.J();  return super.ca(); } public strictfp float K(int paramInt) { return (this.v.fE[paramInt]).ae; } public strictfp PointF J(int paramInt) { PointF pointF = super.J(paramInt); if (this.v.ep) { as as = this.v.fE[paramInt]; am am = this.v.fF[as.a(this)]; if (am.L && this.C != null) { f f1 = this.C[paramInt]; if (f1 != null && !f1.dC) { pointF.a += f1.K; pointF.b += f1.L; }  }  }  return pointF; } public strictfp float aY() { return this.v.cy; } public strictfp b aZ() { return this.v.dR; } public strictfp boolean ba() { if (this.v.dU) return false;  if (this.v.dR == b.d) { an an = ap(); if (an != null && (an.d() == ao.h || an.d() == ao.j)) return true;  if (this.G == a.a) return true;  return false; }  return true; } public strictfp boolean bJ() { return this.t; } public strictfp boolean bb() { return this.v.dX; } public strictfp float aX() { return this.v.ea; } public strictfp void dh() { if (this.v.am == null && this.ds == null) return;  if (this.v.am == null || this.v.am.length == 0) { this.ds = null; return; }  if (this.ds != null && this.ds.length == this.v.am.length) return;  this.ds = new d[this.v.am.length]; byte b; for (b = 0; b < this.v.am.length; b++) { d d1 = new d(); this.ds[b] = d1; d1.a = b; d1.s = (this.v.am[b]).o; }  this.dp = this.dH; this.dq = this.dI; this.dr = this.bL; di(); for (b = 0; b < this.v.am.length; b++) (this.ds[b]).m = true;  } public strictfp void di() { c.a.b(this, 0.0F); } public strictfp void dj() { if (this.ds != null) { for (byte b = 0; b < this.ds.length; b++) { (this.ds[b]).n = true; (this.ds[b]).m = true; }  di(); }  } public strictfp int aP() { if (this.v.fJ == null) return -1;  return this.v.fJ.e; } public strictfp int s() { return this.v.cS; } public strictfp void c(boolean paramBoolean) { l l1 = this.v; l l2 = l.u(); if (this.cp != null || this.cq != null) return;  int n = l1.cS; if (this.bR < 1.0F) n = l1.cT;  if (n > 0) l2.bt.a(this.dH, this.dI, n, this.bB, paramBoolean);  } public strictfp Rect bO() { return this.v.cI; } public strictfp Rect bQ() { return this.v.cK; } public strictfp Rect bP() { return this.v.cJ; } public strictfp boolean b(int paramInt, float paramFloat) { as as = this.v.fE[paramInt]; if (as.ar != 0.0F) { boolean bool = true; if (as.au != null) if (!as.au.read(this)) bool = false;   if (bool) { float f1; ai ai = this.cn[paramInt]; if (as.aq != 0.0F) { f1 = ai.a; } else if (!as.ap) { f1 = ai.b; } else { f1 = C(paramInt); }  ai.k += paramFloat; float f2 = paramFloat * as.at; if (ai.l > 0.0F) { if (ai.l < Float.POSITIVE_INFINITY) { float f3 = a(f2, f1 + ai.l, paramInt); if (f3 == 0.0F) ai.l = Float.POSITIVE_INFINITY;  }  } else if (ai.l > Float.NEGATIVE_INFINITY) { float f3 = a(f2, f1 + ai.l, paramInt); if (f3 == 0.0F) ai.l = Float.NEGATIVE_INFINITY;  }  if (ai.k > as.as) { ai.k = -f.a((af)this, 0, (int)as.av); float f3 = as.ar; if (as.aw > 0.0F) f3 += f.b((af)this, 0.0F, as.aw, paramInt);  ai.l = (ai.l > 0.0F) ? -f3 : f3; }  return false; }  }  if (as.aq != 0.0F) { (this.cn[paramInt]).a += as.aq * paramFloat; if ((this.cn[paramInt]).a > 180.0F) (this.cn[paramInt]).a -= 360.0F;  if ((this.cn[paramInt]).a < -180.0F) (this.cn[paramInt]).a += 360.0F;  return false; }  return as.ap; } public strictfp int cg() { return this.v.eO; } static ArrayList dt = new ArrayList(); public strictfp ArrayList dk() { dt.clear(); ArrayList arrayList = M(); if (arrayList.size() != 0) for (s s : arrayList) { if (s instanceof f) { f f1 = (f)s; if (f1.c == d.c) dt.add(f1);  }  }   return dt; } public strictfp c bX() { ArrayList<s> arrayList = dk(); if (arrayList.size() > 0) return ((s)arrayList.get(0)).J();  return null; } public strictfp void a(ArrayList<c> paramArrayList) { paramArrayList.clear(); ArrayList arrayList = dk(); if (arrayList.size() < 2) return;  arrayList.remove(0); for (s s : arrayList) paramArrayList.add(s.J());  } public strictfp float cH() { return this.v.cL; } public strictfp float cI() { return this.v.cM; } public strictfp void bq() { m.a((af)this); this.do.e(); super.bq(); } public strictfp void cK() { this.dJ = 170.0F; this.f = 1.5F; dj(); super.cK(); } public strictfp boolean cL() { return this.v.bY; }
/*      */   public strictfp int bk() { return this.v.bf; }
/*      */   public strictfp void a(int paramInt, float paramFloat) { (this.cn[paramInt]).a += paramFloat; if (this.v.fI) for (byte b = 0; b < this.v.fE.length; b++) { as as = this.v.fE[b]; if (as.v == paramInt) { (this.cn[b]).a += paramFloat; this.cn[b].a(2); }  }   }
/*      */   public strictfp float cJ() { return super.cJ() + this.v.cR; }
/*      */   public strictfp float G(int paramInt) { as as = this.v.fE[paramInt]; return as.o; }
/*      */   public strictfp float H(int paramInt) { as as = this.v.fE[paramInt]; return as.p; }
/* 8481 */   public strictfp float cX() { return this.v.cP; }
/*      */ 
/*      */   
/*      */   public strictfp float I(int paramInt) {
/*      */     as as = this.v.fE[paramInt];
/*      */     return as.q;
/*      */   }
/*      */   
/*      */   public strictfp float a(af paramaf, float paramFloat, f paramf) {
/*      */     i i1 = cV();
/*      */     if (i1 != null && this.cq != null)
/*      */       if (i1.j) {
/*      */         int n = 0;
/*      */         if (paramf != null)
/*      */           n = paramf.aD; 
/*      */         if (n >= 0) {
/*      */           f f1 = f.a(paramf);
/*      */           if (i1.k)
/*      */             f1.am = 0.0F; 
/*      */           float f2 = this.cq.a(paramaf, paramFloat, f1);
/*      */           paramFloat = f2;
/*      */           if (paramFloat < 0.0F)
/*      */             paramFloat = 0.0F; 
/*      */         } 
/*      */       }  
/*      */     if (J())
/*      */       paramFloat = 0.0F; 
/*      */     if (this.v.cv > 0.0F)
/*      */       if (paramFloat > this.v.cw) {
/*      */         float f1 = this.v.cv;
/*      */         if (paramf != null)
/*      */           f1 -= paramf.an; 
/*      */         if (f1 < 0.0F)
/*      */           f1 = 0.0F; 
/*      */         paramFloat -= f1;
/*      */         if (paramFloat < this.v.cw)
/*      */           paramFloat = this.v.cw; 
/*      */       }  
/*      */     a(ab.n);
/*      */     return super.a(paramaf, paramFloat, paramf);
/*      */   }
/*      */   
/*      */   public strictfp float aQ() {
/*      */     return this.v.dv;
/*      */   }
/*      */   
/*      */   public strictfp boolean aa() {
/*      */     if (!this.v.dW)
/*      */       return false; 
/*      */     return super.aa();
/*      */   }
/*      */   
/*      */   public strictfp boolean a(z paramz) {
/*      */     if (paramz == z.a)
/*      */       return this.v.da.a(); 
/*      */     if (paramz == z.b)
/*      */       return this.v.db.a(); 
/*      */     if (paramz == z.c)
/*      */       return this.v.dc.a(); 
/*      */     return false;
/*      */   }
/*      */   
/*      */   public static m du = new m();
/*      */   public static m dv = new m();
/*      */   
/*      */   public strictfp void b(ab paramab) {
/*      */     l l1 = this.v;
/*      */     if (l1.ga.a == 0)
/*      */       return; 
/*      */     Object[] arrayOfObject = l1.ga.a();
/*      */     for (int n = l1.ga.a - 1; n >= 0; n--) {
/*      */       aa aa = (aa)arrayOfObject[n];
/*      */       if (aa.a == paramab) {
/*      */         dw.a = this.dH;
/*      */         dw.b = this.dI;
/*      */         PointF pointF = dw;
/*      */         af af = null;
/*      */         a((s)aa.b, pointF, af, 0);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp void a(ab paramab) {
/*      */     l l1 = this.v;
/*      */     if (l1.ga.a == 0)
/*      */       return; 
/*      */     Object[] arrayOfObject = l1.ga.a();
/*      */     for (int n = l1.ga.a - 1; n >= 0; n--) {
/*      */       aa aa = (aa)arrayOfObject[n];
/*      */       if (aa.a == paramab) {
/*      */         du.add(aa);
/*      */         dv.add(this);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static strictfp void a(float paramFloat, int paramInt) {
/*      */     if (du.a == 0)
/*      */       return; 
/*      */     if (du.a != dv.a)
/*      */       throw new RuntimeException("queuedUnitEvents out of sync: " + du.a + " vs " + dv.a); 
/*      */     Object[] arrayOfObject1 = du.a();
/*      */     Object[] arrayOfObject2 = dv.a();
/*      */     int n = du.a;
/*      */     int i1;
/*      */     for (i1 = n - 1; i1 >= 0; i1--) {
/*      */       aa aa = (aa)arrayOfObject1[i1];
/*      */       k k1 = (k)arrayOfObject2[i1];
/*      */       if (aa.c == k1.v) {
/*      */         dw.a = k1.dH;
/*      */         dw.b = k1.dI;
/*      */         PointF pointF = dw;
/*      */         af af = null;
/*      */         k1.a((s)aa.b, pointF, af, 0);
/*      */       } 
/*      */     } 
/*      */     if (paramInt < 1)
/*      */       if (n != du.a) {
/*      */         for (i1 = n - 1; i1 >= 0; i1--) {
/*      */           du.remove(i1);
/*      */           dv.remove(i1);
/*      */         } 
/*      */         a(paramFloat, paramInt + 1);
/*      */       }  
/*      */     du.clear();
/*      */     dv.clear();
/*      */   }
/*      */   
/*      */   static PointF dw = new PointF();
/*      */   i dx;
/*      */   
/*      */   public strictfp void r(float paramFloat) {
/*      */     if (this.v.fL != null) {
/*      */       l l1 = l.u();
/*      */       l l2 = this.v;
/*      */       if (this.u != 0.0F) {
/*      */         this.u = f.a(this.u, paramFloat);
/*      */         return;
/*      */       } 
/*      */       for (byte b = 0; b < l2.fL.length; b++) {
/*      */         r r = l2.fL[b];
/*      */         if (r.a.read(this)) {
/*      */           if (l1.aV && l1.aX && this.ci) {
/*      */             String str1 = null;
/*      */             if (r.b != null)
/*      */               str1 = "" + r.b.K(); 
/*      */             String str2 = "autoTrigger fired on: " + cl() + " details: " + r.a.getDebugDetails(this);
/*      */             l.d(str2);
/*      */             l1.bA.f.a(str2);
/*      */           } 
/*      */           dw.a = this.dH;
/*      */           dw.b = this.dI;
/*      */           PointF pointF = dw;
/*      */           af af = null;
/*      */           a((s)r.b, pointF, af, 0);
/*      */           this.u = this.v.bP;
/*      */           if (l2 != this.v)
/*      */             return; 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp i cM() {
/*      */     return this.dx;
/*      */   }
/*      */   
/*      */   public strictfp void a(i parami, boolean paramBoolean) {
/*      */     if (paramBoolean) {
/*      */       this.dx = parami;
/*      */       return;
/*      */     } 
/*      */     m.b((af)this);
/*      */     this.dx = parami;
/*      */     m.c((af)this);
/*      */   }
/*      */   
/*      */   public strictfp void k(boolean paramBoolean) {
/*      */     a(this.v.G, paramBoolean);
/*      */   }
/*      */   
/*      */   public strictfp void a(i parami) {
/*      */     i i1 = cM();
/*      */     if (i1 == null || i1.b() == 0) {
/*      */       a(parami, false);
/*      */       return;
/*      */     } 
/*      */     if (h.b(i1, parami))
/*      */       return; 
/*      */     j j1 = new j(i1);
/*      */     if (j1.a(parami)) {
/*      */       a(j1.a(), false);
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp void b(i parami) {
/*      */     i i1 = cM();
/*      */     if (i1 == null || i1.b() == 0)
/*      */       return; 
/*      */     if (!h.a(parami, i1))
/*      */       return; 
/*      */     j j1 = new j(i1);
/*      */     if (j1.b(parami)) {
/*      */       a(j1.a(), false);
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   public final strictfp void dl() {
/*      */     if (this.v.eV == ah.d) {
/*      */       if (i()) {
/*      */         R(5);
/*      */       } else if (cc() && this.bQ == 0.0F) {
/*      */         R(3);
/*      */       } else {
/*      */         R(2);
/*      */       } 
/*      */     } else if (this.bQ == 0.0F) {
/*      */       R(this.v.cp);
/*      */     } 
/*      */     this.dG = 0;
/*      */   }
/*      */   
/*      */   public strictfp boolean bV() {
/*      */     if (!this.v.fS)
/*      */       return false; 
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp boolean n_() {
/*      */     return this.v.eS.read(this);
/*      */   }
/*      */   
/*      */   public strictfp boolean u() {
/*      */     return true;
/*      */   }
/*      */   
/*      */   protected static final ag dy = new ag();
/*      */   m dz;
/*      */   
/*      */   public strictfp ag D(int paramInt) {
/*      */     dy.a(E(paramInt));
/*      */     as as = this.v.fE[paramInt];
/*      */     dy.c += as.Z;
/*      */     return dy;
/*      */   }
/*      */   
/*      */   public strictfp PointF E(int paramInt) {
/*      */     ai ai = this.cn[paramInt];
/*      */     as as = this.v.fE[paramInt];
/*      */     float f1 = as.W;
/*      */     float f2 = as.X;
/*      */     if (as.Y != 0.0F && ai.m)
/*      */       f2 += as.Y; 
/*      */     float f3 = E() ? this.bL : ai.a;
/*      */     PointF pointF = F(paramInt);
/*      */     float f4 = f.i(f3);
/*      */     float f5 = f.h(f3);
/*      */     float f6 = pointF.a;
/*      */     float f7 = pointF.b;
/*      */     f6 += f4 * f1 - f5 * f2;
/*      */     f7 += f5 * f1 + f4 * f2;
/*      */     aT.a(f6, f7);
/*      */     return aT;
/*      */   }
/*      */   
/*      */   public strictfp boolean bW() {
/*      */     return this.v.fx;
/*      */   }
/*      */   
/*      */   public strictfp float bY() {
/*      */     return this.v.fy;
/*      */   }
/*      */   
/*      */   public strictfp void a(af paramaf, float paramFloat, int paramInt) {
/*      */     if (this.v.dl != null)
/*      */       this.b.a(this.v.dl, 5); 
/*      */     if (this.v.bH) {
/*      */       this.L = f.a(this.L, paramFloat);
/*      */       if (this.L == 0.0F) {
/*      */         this.L = this.v.bI;
/*      */         if (this.v.bJ != null) {
/*      */           ai ai = this.cn[paramInt];
/*      */           PointF pointF = E(paramInt);
/*      */           this.v.bJ.a(pointF.a, pointF.b, this.dJ, ai.a, (w)this);
/*      */         } 
/*      */         if (this.v.bK != null)
/*      */           this.v.bK.a(paramaf.dH, paramaf.dI, paramaf.dJ, paramaf.bL, (w)paramaf); 
/*      */       } 
/*      */     } else {
/*      */       super.a(paramaf, paramFloat, paramInt);
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp void b(af paramaf, float paramFloat, int paramInt) {
/*      */     if (this.v.dm != null)
/*      */       this.b.a(this.v.dm, 5); 
/*      */     if (this.v.bL) {
/*      */       this.L = f.a(this.L, paramFloat);
/*      */       if (this.L == 0.0F) {
/*      */         this.L = this.v.bM;
/*      */         if (this.v.bN != null) {
/*      */           ai ai = this.cn[paramInt];
/*      */           PointF pointF = E(paramInt);
/*      */           this.v.bN.a(pointF.a, pointF.b, this.dJ, ai.a, (w)this);
/*      */         } 
/*      */         if (this.v.bO != null)
/*      */           this.v.bO.a(paramaf.dH, paramaf.dI, paramaf.dJ, paramaf.bL, (w)paramaf); 
/*      */       } 
/*      */     } else {
/*      */       super.b(paramaf, paramFloat, paramInt);
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp boolean bS() {
/*      */     return this.v.R;
/*      */   }
/*      */   
/*      */   public strictfp boolean dm() {
/*      */     if (this.v.Q != null)
/*      */       if (!this.v.Q.read(this))
/*      */         return false;  
/*      */     if (!this.v.R) {
/*      */       l l1 = l.u();
/*      */       if (l1.bb.c(this.bB))
/*      */         return false; 
/*      */     } 
/*      */     i i1 = cV();
/*      */     if (i1 != null)
/*      */       if (!i1.o)
/*      */         return false;  
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp boolean t() {
/*      */     i i1 = cV();
/*      */     if (i1 != null)
/*      */       if (i1.m)
/*      */         return true;  
/*      */     return this.v.aB;
/*      */   }
/*      */   
/*      */   public strictfp boolean cD() {
/*      */     i i1 = cV();
/*      */     if (i1 != null)
/*      */       if (i1.n)
/*      */         return true;  
/*      */     return this.v.aC;
/*      */   }
/*      */   
/*      */   public strictfp boolean d(af paramaf) {
/*      */     l l1 = this.v;
/*      */     if (l1.aH != null)
/*      */       if (!h.a(l1.aH, paramaf.cM()))
/*      */         return false;  
/*      */     if (dn())
/*      */       return false; 
/*      */     return !l1.aD;
/*      */   }
/*      */   
/*      */   public strictfp boolean cE() {
/*      */     return this.v.aI;
/*      */   }
/*      */   
/*      */   public strictfp boolean cC() {
/*      */     if (this.v.aD)
/*      */       return true; 
/*      */     return (o_() || (this.bR < 1.0F && this.v.aW <= 0.0F));
/*      */   }
/*      */   
/*      */   public strictfp i cP() {
/*      */     return this.v.H;
/*      */   }
/*      */   
/*      */   public strictfp float ak() {
/*      */     return this.v.ev;
/*      */   }
/*      */   
/*      */   public strictfp boolean al() {
/*      */     return (super.al() || this.v.eu);
/*      */   }
/*      */   
/*      */   public strictfp boolean a(l paraml) {
/*      */     if (!paraml.cv.b(this.dH, this.dI)) {
/*      */       if (!this.v.v)
/*      */         return false; 
/*      */       boolean bool = false;
/*      */       if (this.v.w != null) {
/*      */         l.a.a(this.v.w);
/*      */         l.a.a((int)this.dH, (int)this.dI);
/*      */         if (paraml.cx.b(l.a))
/*      */           bool = true; 
/*      */       } 
/*      */       if (paraml.cv.b(this.dH, this.dI - this.dJ))
/*      */         bool = true; 
/*      */       if (!bool)
/*      */         return false; 
/*      */     } 
/*      */     if (this.cp != null)
/*      */       return false; 
/*      */     if (this.cr != null)
/*      */       if (this.cr.I)
/*      */         return false;  
/*      */     if (!b(paraml.bb))
/*      */       return false; 
/*      */     if (!dm())
/*      */       return false; 
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp r a(i parami) {
/*      */     return h.a(this, parami);
/*      */   }
/*      */   
/*      */   public strictfp i a(short paramShort) {
/*      */     return h.a(this, paramShort);
/*      */   }
/*      */   
/*      */   public strictfp boolean a(r paramr, i parami) {
/*      */     if (paramr == this)
/*      */       return false; 
/*      */     if (parami == null) {
/*      */       l.b("attachRequest: No attachedSlotData");
/*      */       return false;
/*      */     } 
/*      */     r r1 = h.a(this, parami);
/*      */     if (r1 != null) {
/*      */       l.b("attachRequest: a unit is already in slot (parent:" + cl() + " slot:" + parami.b() + " existing:" + r1.cm() + ")");
/*      */       return false;
/*      */     } 
/*      */     l l1 = l.u();
/*      */     h.a(this, parami, paramr);
/*      */     paramr.cq = (r)this;
/*      */     paramr.cr = parami;
/*      */     paramr.cs = l1.bh;
/*      */     paramr.by = false;
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp boolean b(r paramr) {
/*      */     if (paramr.cq != this) {
/*      */       l.b("deattachRequest: unit is not attached");
/*      */       return false;
/*      */     } 
/*      */     i i1 = paramr.cr;
/*      */     if (i1 == null) {
/*      */       l.b("deattachRequest: unit has no attachedSlotData");
/*      */       return false;
/*      */     } 
/*      */     r r1 = h.a(this, i1);
/*      */     if (r1 == null) {
/*      */       l.b("deattachRequest: Failed, no unit in slot");
/*      */       l.f("deattachRequest");
/*      */       return false;
/*      */     } 
/*      */     if (paramr != r1) {
/*      */       String str = "null";
/*      */       if (r1 != null)
/*      */         str = r1.cl(); 
/*      */       l.b("deattachRequest: unit and slot don't match - requested:" + paramr.cl() + " current:" + str);
/*      */       return false;
/*      */     } 
/*      */     if (this.x.remove(paramr))
/*      */       z((af)paramr); 
/*      */     h.a(this, i1, null);
/*      */     paramr.cq = null;
/*      */     paramr.cr = null;
/*      */     paramr.c_();
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp boolean dn() {
/*      */     i i1 = cV();
/*      */     if (i1 != null)
/*      */       if (!i1.l)
/*      */         return true;  
/*      */     return false;
/*      */   }
/*      */   
/*      */   public strictfp boolean J() {
/*      */     if (dn())
/*      */       return true; 
/*      */     if (this.v.aE)
/*      */       return true; 
/*      */     return false;
/*      */   }
/*      */   
/*      */   public strictfp void cQ() {
/*      */     l l1 = this.v;
/*      */     if (!l1.ce.b())
/*      */       l1.ce.c((af)this, false); 
/*      */   }
/*      */   
/*      */   public strictfp void cR() {
/*      */     l l1 = this.v;
/*      */     if (!l1.ce.b())
/*      */       l1.ce.f((af)this); 
/*      */   }
/*      */   
/*      */   public strictfp void a(an paraman) {
/*      */     a(ab.j);
/*      */     i i1 = cV();
/*      */     if (i1 != null)
/*      */       if (i1.H) {
/*      */         ao ao = paraman.d();
/*      */         if (ao == ao.h || ao == ao.a)
/*      */           bs(); 
/*      */       }  
/*      */   }
/*      */   
/*      */   public strictfp boolean b_() {
/*      */     l l1 = this.v;
/*      */     if (!l1.aG) {
/*      */       l l2 = l.u();
/*      */       if (l2.bb.c(this.bB))
/*      */         return false; 
/*      */     } 
/*      */     return l1.aF;
/*      */   }
/*      */   
/*      */   public strictfp boolean cS() {
/*      */     return this.v.S;
/*      */   }
/*      */   
/*      */   public strictfp boolean cT() {
/*      */     return this.v.ez;
/*      */   }
/*      */   
/*      */   public strictfp boolean cU() {
/*      */     return this.v.eA;
/*      */   }
/*      */   
/*      */   public strictfp boolean C(af paramaf) {
/*      */     int n = do();
/*      */     int i1 = paramaf.cg();
/*      */     if (this.v.eD)
/*      */       i1 = 1; 
/*      */     if (n + i1 <= this.v.eB)
/*      */       return true; 
/*      */     return false;
/*      */   }
/*      */   
/*      */   public strictfp int do() {
/*      */     int n = 0;
/*      */     if (this.v.eD) {
/*      */       n += this.x.size();
/*      */     } else if (this.x.a > 0) {
/*      */       for (af af : this.x)
/*      */         n += af.cg(); 
/*      */     } 
/*      */     return n;
/*      */   }
/*      */   
/*      */   public strictfp void c(m paramm) {
/*      */     if (this.bB == paramm)
/*      */       return; 
/*      */     super.c(paramm);
/*      */     if (this.x != null)
/*      */       if (!this.v.eM)
/*      */         for (af af : this.x)
/*      */           af.c(paramm);   
/*      */     if (this.y != null)
/*      */       for (af af : this.y) {
/*      */         if (af != null) {
/*      */           i i1 = af.cV();
/*      */           if (i1 != null && !i1.z)
/*      */             af.c(paramm); 
/*      */         } 
/*      */       }  
/*      */     a(ab.k);
/*      */   }
/*      */   
/*      */   public strictfp g cw() {
/*      */     return this.v.bV;
/*      */   }
/*      */   
/*      */   public strictfp void bT() {
/*      */     if (this.v.bh) {
/*      */       if (this.bY <= -1.0F)
/*      */         this.bY = -1.0F; 
/*      */       return;
/*      */     } 
/*      */     super.bT();
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.graphics.PointF;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.j;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.an;
/*      */ import com.corrodinggames.rts.game.units.ao;
/*      */ import com.corrodinggames.rts.game.units.d.k;
/*      */ import com.corrodinggames.rts.game.units.g;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.d.w;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import java.io.IOException;
/*      */ import java.util.AbstractList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class e
/*      */ {
/*      */   public boolean a;
/*      */   public String b;
/*      */   public int c;
/*      */   public int d;
/*      */   public boolean e = false;
/*      */   public boolean f = false;
/*      */   public boolean g = false;
/*      */   public boolean h = false;
/*      */   public m i;
/*      */   public an j;
/*  259 */   public c k = s.h;
/*      */ 
/*      */   
/*      */   public PointF l;
/*      */ 
/*      */   
/*      */   public af m;
/*      */ 
/*      */   
/*      */   public a n;
/*      */ 
/*      */   
/*      */   private PointF z;
/*      */ 
/*      */   
/*      */   public boolean o = false;
/*      */ 
/*      */   
/*      */   public m p;
/*      */ 
/*      */   
/*      */   public short q;
/*      */ 
/*      */   
/*      */   public boolean r;
/*      */   
/*      */   public float s;
/*      */   
/*      */   public float t;
/*      */   
/*      */   public int u;
/*      */   
/*  291 */   private m A = new m();
/*  292 */   m v = new m();
/*      */ 
/*      */   
/*  295 */   m w = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean x = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e(c paramc) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a() {
/*  312 */     for (d d : this.w) {
/*      */       
/*  314 */       if (d.a.c() == null)
/*      */       {
/*  316 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  320 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b() {
/*  326 */     l l = l.u();
/*      */     
/*  328 */     this.x = true;
/*      */ 
/*      */     
/*  331 */     ab ab = l.bD.c();
/*      */     
/*  333 */     for (r r : this.v)
/*      */     {
/*  335 */       ab.a.add(r);
/*      */     }
/*      */     
/*  338 */     if (this.j != null) {
/*      */       
/*  340 */       float f1 = this.j.g();
/*  341 */       float f2 = this.j.h();
/*      */ 
/*      */       
/*  344 */       if (this.j.d() != ao.a && this.j
/*  345 */         .d() != ao.h && this.j
/*  346 */         .d() != ao.b) {
/*      */         return;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  352 */       m m1 = ab.a(f1, f2, this.j.j);
/*      */       
/*  354 */       for (r r : m1) {
/*      */         
/*  356 */         if (r.aH()) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/*  361 */         if (!r.I()) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/*  366 */         if (this.e)
/*      */         {
/*  368 */           if (r.ap() != null) {
/*      */             continue;
/*      */           }
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  379 */         float f3 = f1;
/*  380 */         float f4 = f2;
/*  381 */         int i = 0;
/*      */         
/*  383 */         if (this.j.d() == ao.b)
/*      */         {
/*  385 */           i = r.n(this.j.i());
/*      */         }
/*      */         
/*  388 */         boolean bool1 = true;
/*      */ 
/*      */         
/*  391 */         d d = new d();
/*      */ 
/*      */         
/*  394 */         d.b = r.dA;
/*  395 */         d.c = r.dH;
/*  396 */         d.d = r.dI;
/*      */         
/*  398 */         d.e = f3;
/*  399 */         d.f = f4;
/*      */         
/*  401 */         d.g = l.bg;
/*  402 */         d.h = r.h();
/*      */         
/*  404 */         boolean bool2 = false;
/*  405 */         boolean bool3 = false;
/*      */         
/*  407 */         d.a = r.a(f3, f4, i, bool1, bool2, bool3);
/*      */         
/*  409 */         d.a.p = 120.0F;
/*      */         
/*  411 */         d.a.o = d.a.p;
/*      */         
/*  413 */         d.a.q = true;
/*      */ 
/*      */         
/*  416 */         this.w.add(d);
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
/*      */   public strictfp m c() {
/*  433 */     return this.i;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp int d() {
/*  438 */     return this.A.size() + this.v.size();
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean e() {
/*  443 */     if (s.c(this.k))
/*      */     {
/*  445 */       return false;
/*      */     }
/*      */     
/*  448 */     if (d() == 0)
/*      */     {
/*  450 */       return true;
/*      */     }
/*  452 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized strictfp e f() {
/*      */     try {
/*  462 */       ap ap = new ap();
/*  463 */       a(ap);
/*      */       
/*  465 */       k k = new k(ap.d());
/*  466 */       e e1 = new e(this.y);
/*  467 */       e1.c = this.c;
/*  468 */       e1.a(k);
/*  469 */       return e1;
/*      */     }
/*  471 */     catch (IOException iOException) {
/*      */       
/*  473 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void g() {
/*  481 */     if (this.j != null) {
/*      */ 
/*      */       
/*  484 */       for (r r : this.v)
/*      */       {
/*  486 */         this.A.add(Long.valueOf(r.dA));
/*      */       }
/*  488 */       this.v.clear();
/*      */       
/*  490 */       this.j.k();
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
/*      */   public synchronized strictfp void a(ap paramap) {
/*  509 */     paramap.e("c");
/*      */     
/*  511 */     paramap.c(this.i.i);
/*      */     
/*  513 */     paramap.a((this.j != null));
/*      */     
/*  515 */     if (this.j != null)
/*      */     {
/*  517 */       this.j.a(paramap);
/*      */     }
/*      */     
/*  520 */     paramap.a(this.e);
/*  521 */     paramap.a(this.g);
/*      */     
/*  523 */     paramap.a(-1);
/*  524 */     paramap.a((Enum)this.n);
/*      */ 
/*      */     
/*  527 */     paramap.a((this.z != null));
/*  528 */     if (this.z != null) {
/*      */       
/*  530 */       paramap.a(this.z.a);
/*  531 */       paramap.a(this.z.b);
/*      */     } 
/*      */ 
/*      */     
/*  535 */     paramap.a(this.o);
/*      */ 
/*      */     
/*  538 */     paramap.a(this.v.size() + this.A.size());
/*      */ 
/*      */     
/*  541 */     for (r r : this.v)
/*      */     {
/*  543 */       paramap.a(r.dA);
/*      */     }
/*  545 */     for (Iterator<Long> iterator = this.A.iterator(); iterator.hasNext(); ) { long l = ((Long)iterator.next()).longValue();
/*      */       
/*  547 */       paramap.a(l); }
/*      */ 
/*      */ 
/*      */     
/*  551 */     paramap.a((this.p != null));
/*  552 */     if (this.p != null)
/*      */     {
/*  554 */       paramap.a(this.p);
/*      */     }
/*      */ 
/*      */     
/*  558 */     paramap.a((this.l != null));
/*  559 */     if (this.l != null) {
/*      */       
/*  561 */       paramap.a(this.l.a);
/*  562 */       paramap.a(this.l.b);
/*      */     } 
/*  564 */     paramap.a(this.m);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  569 */     paramap.c(this.k.a());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  574 */     paramap.a(this.f);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  579 */     paramap.a(this.q);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  585 */     paramap.a(this.r);
/*  586 */     if (this.r) {
/*      */       
/*  588 */       paramap.c(0);
/*      */       
/*  590 */       paramap.a(this.s);
/*      */       
/*  592 */       paramap.a(this.t);
/*      */       
/*  594 */       paramap.a(this.u);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  599 */     paramap.a(this.w.size());
/*      */     
/*  601 */     for (byte b = 0; b < this.w.size(); b++) {
/*      */       
/*  603 */       d d = (d)this.w.get(b);
/*      */       
/*  605 */       d.a(paramap);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  613 */     paramap.a(this.h);
/*      */ 
/*      */ 
/*      */     
/*  617 */     paramap.a("c");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk) {
/*  626 */     paramk.b("c");
/*      */     
/*  628 */     this.i = m.n(paramk.d());
/*      */     
/*  630 */     if (this.i == null)
/*      */     {
/*  632 */       throw new IOException("team==null");
/*      */     }
/*      */ 
/*      */     
/*  636 */     boolean bool1 = paramk.e();
/*  637 */     if (bool1) {
/*      */       
/*  639 */       this.j = new an();
/*  640 */       this.j.a(paramk);
/*      */     } 
/*  642 */     this.e = paramk.e();
/*  643 */     this.g = paramk.e();
/*      */     
/*  645 */     this.k = c.a(String.valueOf(paramk.f()));
/*      */ 
/*      */     
/*  648 */     this.n = (a)paramk.b(a.class);
/*      */     
/*  650 */     boolean bool2 = paramk.e();
/*  651 */     if (bool2) {
/*      */       
/*  653 */       this.z = new PointF();
/*  654 */       this.z.a = paramk.g();
/*  655 */       this.z.b = paramk.g();
/*      */     } 
/*      */     
/*  658 */     this.o = paramk.e();
/*      */ 
/*      */     
/*  661 */     int i = paramk.f(); int j;
/*  662 */     for (j = 0; j < i; j++)
/*      */     {
/*      */       
/*  665 */       this.A.add(Long.valueOf(paramk.m()));
/*      */     }
/*      */ 
/*      */     
/*  669 */     if (paramk.b() >= 16) {
/*      */       
/*  671 */       this.p = null;
/*  672 */       if (paramk.e())
/*      */       {
/*  674 */         this.p = paramk.q();
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  679 */     if (paramk.b() >= 29) {
/*      */       
/*  681 */       boolean bool = paramk.e();
/*      */       
/*  683 */       if (bool) {
/*      */         
/*  685 */         this.l = new PointF();
/*  686 */         this.l.a = paramk.g();
/*  687 */         this.l.b = paramk.g();
/*      */       } 
/*  689 */       this.m = paramk.n();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  694 */     if (paramk.b() >= 33)
/*      */     {
/*  696 */       this.k = c.a(paramk.k());
/*      */     }
/*      */ 
/*      */     
/*  700 */     if (paramk.b() >= 37)
/*      */     {
/*  702 */       this.f = paramk.e();
/*      */     }
/*      */     
/*  705 */     if (paramk.b() >= 52)
/*      */     {
/*      */       
/*  708 */       this.q = paramk.t();
/*      */     }
/*      */ 
/*      */     
/*  712 */     if (paramk.b() >= 53) {
/*      */ 
/*      */       
/*  715 */       this.r = paramk.e();
/*  716 */       if (this.r) {
/*      */         
/*  718 */         paramk.d();
/*      */         
/*  720 */         this.s = paramk.g();
/*      */ 
/*      */         
/*  723 */         this.t = paramk.g();
/*      */         
/*  725 */         this.u = paramk.f();
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  731 */       j = paramk.f();
/*      */       
/*  733 */       this.w.clear();
/*      */ 
/*      */       
/*  736 */       for (byte b = 0; b < j; b++) {
/*      */         
/*  738 */         d d = new d();
/*      */         
/*  740 */         d.a(paramk);
/*      */         
/*  742 */         this.w.add(d);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  748 */     if (paramk.b() >= 80)
/*      */     {
/*  750 */       this.h = paramk.e();
/*      */     }
/*      */ 
/*      */     
/*  754 */     paramk.d("c");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(AbstractList paramAbstractList) {
/*  760 */     for (r r : paramAbstractList)
/*      */     {
/*  762 */       a(r);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(r paramr) {
/*  769 */     if (paramr == null)
/*      */     {
/*  771 */       throw new RuntimeException("unit cannot be null");
/*      */     }
/*      */     
/*  774 */     if (paramr.bB != this.i);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  780 */     if (this.i.r) {
/*      */       
/*  782 */       if (paramr.bB != this.i)
/*      */       {
/*  784 */         if ((l.u()).bb != this.i) {
/*      */           
/*  786 */           l.b("CommandController", "Warning AI: " + this.i.i + " gave an order to unit with team:" + paramr.bB.i + " type:" + paramr.r().i());
/*  787 */           l.f("");
/*      */         } 
/*      */       }
/*      */       
/*  791 */       if (paramr.cE())
/*      */       {
/*  793 */         l.b("CommandController", "Warning AI: " + this.i.i + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + paramr.r().i());
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
/*  805 */     this.v.add(paramr);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void h() {
/*  812 */     this.o = true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2) {
/*  818 */     this.j = new an();
/*  819 */     this.j.a(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(float paramFloat1, float paramFloat2) {
/*  824 */     this.j = new an();
/*  825 */     this.j.b(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(af paramaf) {
/*  830 */     this.j = new an();
/*  831 */     this.j.a(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*  836 */     this.j = new an();
/*  837 */     this.j.b(paramFloat1, paramFloat2);
/*  838 */     this.j.j = paramBoolean;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(af paramaf, boolean paramBoolean) {
/*  843 */     this.j = new an();
/*  844 */     this.j.a(paramaf);
/*  845 */     this.j.j = paramBoolean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2, al paramal, int paramInt) {
/*  853 */     this.j = new an();
/*  854 */     this.j.a(paramFloat1, paramFloat2, paramal, paramInt);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(af paramaf) {
/*  859 */     this.j = new an();
/*  860 */     this.j.b(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void c(af paramaf) {
/*  865 */     this.j = new an();
/*  866 */     this.j.c(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void c(float paramFloat1, float paramFloat2) {
/*  871 */     this.j = new an();
/*  872 */     this.j.c(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void d(af paramaf) {
/*  877 */     this.j = new an();
/*  878 */     this.j.f(paramaf);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void e(af paramaf) {
/*  884 */     this.j = new an();
/*  885 */     this.j.g(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void f(af paramaf) {
/*  890 */     this.j = new an();
/*  891 */     this.j.h(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(c paramc) {
/*  896 */     this.k = paramc;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(c paramc, PointF paramPointF, af paramaf) {
/*  901 */     this.k = paramc;
/*  902 */     this.l = paramPointF;
/*  903 */     this.m = paramaf;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(a parama) {
/*  908 */     this.n = parama;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(PointF paramPointF) {
/*  913 */     this.z = paramPointF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized strictfp void i() {
/*  920 */     for (Long long_ : this.A) {
/*      */       
/*  922 */       r r = w.b(long_.longValue(), true);
/*  923 */       if (r == null) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  931 */       this.v.add(r);
/*      */     } 
/*      */     
/*  934 */     this.A.clear();
/*      */ 
/*      */ 
/*      */     
/*  938 */     Iterator<r> iterator = this.v.iterator();
/*  939 */     while (iterator.hasNext()) {
/*      */       
/*  941 */       r r = iterator.next();
/*  942 */       if (r.bz)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  947 */         iterator.remove();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void j() {
/*  957 */     if (s.c(this.k))
/*      */     {
/*  959 */       for (r r : this.v)
/*      */       {
/*  961 */         r.b(r.a(this.k), this.g);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void k() {
/*  969 */     l l = l.u();
/*      */     
/*  971 */     if (l.bJ.h())
/*      */     {
/*  973 */       if (!this.a) {
/*      */         return;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  980 */     i();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1001 */     if (this.r) {
/*      */ 
/*      */       
/* 1004 */       if (this.s != 0.0F) {
/*      */         
/* 1006 */         l.d("issueCommand: changeStepRate:" + this.s);
/*      */         
/* 1008 */         l.bF.a(this.s, "command");
/*      */         
/*      */         return;
/*      */       } 
/* 1012 */       if (this.u != 0) {
/*      */         
/* 1014 */         l.d("system action:" + this.u);
/*      */         
/* 1016 */         if (this.u == 1) {
/*      */           
/* 1018 */           l.d("new DebugDesyncDetector");
/*      */           
/* 1020 */           g g = new g(false);
/* 1021 */           g.a(m.g);
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1027 */         if (this.u == 2) {
/*      */           
/* 1029 */           l.d("new DebugDesyncDetector (stress test)");
/*      */           
/* 1031 */           g g = new g(false);
/* 1032 */           g.a(m.g);
/* 1033 */           g.a = true;
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1038 */         if (this.u == 100) {
/*      */           
/* 1040 */           l.d("team surrender");
/*      */           
/* 1042 */           if (this.i == null) {
/*      */             
/* 1044 */             l.d("team not found");
/*      */             
/*      */             return;
/*      */           } 
/* 1048 */           if (l.bF.A)
/*      */           {
/* 1050 */             l.bF.h("'" + this.i.q + "' has surrendered");
/*      */           }
/*      */           
/* 1053 */           this.i.u = true;
/*      */ 
/*      */ 
/*      */           
/* 1057 */           for (af af1 : af.bj) {
/*      */             
/* 1059 */             if (af1.bB == this.i)
/*      */             {
/* 1061 */               if (af1 instanceof r) {
/*      */                 
/* 1063 */                 r r = (r)af1;
/* 1064 */                 r.c(false);
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1073 */         if (this.u == 200) {
/*      */           
/* 1075 */           l.d("queue quick resync");
/*      */           
/* 1077 */           l.bF.K = true;
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1082 */         if (this.u == 5) {
/*      */           
/* 1084 */           l.d("system command spawn");
/*      */           
/* 1086 */           if (this.j == null || this.j.d() != ao.c || this.j.a() == null) {
/*      */             
/* 1088 */             l.d("system command spawn - failed");
/*      */             
/*      */             return;
/*      */           } 
/* 1092 */           int i = this.j.b();
/*      */           
/* 1094 */           al al = this.j.a();
/*      */           
/* 1096 */           boolean bool = false;
/* 1097 */           if (this.i != null && this.i == l.bb)
/*      */           {
/* 1099 */             if (l.bb.a(false, false) == 0)
/*      */             {
/* 1101 */               bool = true;
/*      */             }
/*      */           }
/*      */ 
/*      */           
/* 1106 */           af af1 = al.a();
/*      */           
/* 1108 */           af1.dH = this.j.g();
/* 1109 */           af1.dI = this.j.h();
/*      */           
/* 1111 */           if (this.i != null) {
/*      */             
/* 1113 */             af1.d(this.i);
/*      */           }
/*      */           else {
/*      */             
/* 1117 */             af1.d(m.g);
/*      */           } 
/*      */           
/* 1120 */           af1.cx();
/*      */           
/* 1122 */           if (i != 1 && af1 instanceof r)
/*      */           {
/* 1124 */             ((r)af1).a(i);
/*      */           }
/*      */           
/* 1127 */           af1.cy();
/*      */           
/* 1129 */           if (af1 instanceof r) {
/*      */             
/* 1131 */             r r = (r)af1;
/*      */             
/* 1133 */             r.bm();
/*      */             
/* 1135 */             if (af1.bw())
/*      */             {
/* 1137 */               l.bC.a(r);
/*      */             }
/*      */           } 
/*      */ 
/*      */           
/* 1142 */           m.c(af1);
/*      */ 
/*      */           
/* 1145 */           if (l.bb == af1.bB && af1.bB != m.g)
/*      */           {
/* 1147 */             if (!af1.o_())
/*      */             {
/* 1149 */               if (bool) {
/*      */                 
/* 1151 */                 l.b(af1.dH, af1.dI);
/* 1152 */                 l.bA.j(af1);
/*      */               } 
/*      */             }
/*      */           }
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1161 */         l.d("issueCommand: unknown system action:" + this.u);
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */ 
/*      */       
/* 1168 */       l.d("issueCommand: Null System action");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1173 */     if (this.p != null) {
/*      */       
/* 1175 */       this.p.N = System.currentTimeMillis();
/* 1176 */       this.p.O = l.bh;
/*      */     } 
/*      */ 
/*      */     
/* 1180 */     if (this.p != null) {
/*      */       
/* 1182 */       String str = null;
/* 1183 */       r r = null;
/*      */ 
/*      */       
/* 1186 */       Iterator<r> iterator = this.v.iterator();
/* 1187 */       while (iterator.hasNext()) {
/*      */         
/* 1189 */         r r1 = iterator.next();
/* 1190 */         if (r1.bB != this.p && !a(this.p, r1.bB)) {
/*      */           
/* 1192 */           if (str == null) {
/*      */             
/* 1194 */             str = "";
/*      */           }
/*      */           else {
/*      */             
/* 1198 */             str = str + ", ";
/*      */           } 
/*      */           
/* 1201 */           if (r == null)
/*      */           {
/* 1203 */             r = r1;
/*      */           }
/*      */           
/* 1206 */           str = str + r1.dA;
/*      */           
/* 1208 */           iterator.remove(); continue;
/*      */         } 
/* 1210 */         if (r1.cE()) {
/*      */           
/* 1212 */           l.d("Warning unit: " + r1.dA + " has canNotBeGivenOrdersByPlayer set");
/* 1213 */           iterator.remove();
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1218 */       if (str != null) {
/*      */         
/* 1220 */         ad.a("Player(" + this.p.i + ") " + this.p.q + " cannot control units: " + str, true);
/*      */         
/* 1222 */         if (r != null) {
/*      */           
/* 1224 */           String str1 = "";
/* 1225 */           if (((af)r).bB != null)
/*      */           {
/* 1227 */             str1 = str1 + " targetUnitTeamId: " + ((af)r).bB.i + " targetUnitTeamName: " + ((af)r).bB.q;
/*      */           }
/*      */           
/* 1230 */           l.b(str1);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1239 */     if (this.o)
/*      */     {
/* 1241 */       for (r r : this.v) {
/*      */         
/* 1243 */         r.ax();
/*      */         
/* 1245 */         r.I = null;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 1250 */     if (this.j != null) {
/*      */       
/* 1252 */       this.j.c();
/*      */ 
/*      */       
/* 1255 */       ab ab = l.bD.b();
/*      */ 
/*      */       
/* 1258 */       ab.g = this.w;
/*      */ 
/*      */ 
/*      */       
/* 1262 */       for (byte b = 0; b <= 1; b++) {
/*      */         
/* 1264 */         boolean bool = (b == 1);
/* 1265 */         for (r r : this.v) {
/*      */ 
/*      */ 
/*      */           
/* 1269 */           if (r.V == bool) {
/*      */             
/* 1271 */             if (this.f) {
/*      */               
/* 1273 */               r.ay();
/*      */               
/*      */               continue;
/*      */             } 
/* 1277 */             if (!this.e) {
/*      */               
/* 1279 */               r.ax(); continue;
/*      */             } 
/* 1281 */             if (this.h && this.j != null) {
/*      */               
/* 1283 */               an an1 = r.ar();
/*      */               
/* 1285 */               if (an1 != null && this.j.a(an1))
/*      */               {
/* 1287 */                 if (an1.d() == ao.h || an1.d() == ao.a)
/*      */                 {
/* 1289 */                   if (this.j.d() == ao.h || this.j.d() == ao.a)
/*      */                   {
/* 1291 */                     r.as();
/*      */                   }
/*      */                 }
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1304 */       for (r r : this.v) {
/*      */ 
/*      */ 
/*      */         
/* 1308 */         an an1 = r.c(this.j);
/*      */ 
/*      */         
/* 1311 */         ab.a(r, an1);
/*      */ 
/*      */ 
/*      */         
/* 1315 */         r.a(an1);
/*      */       } 
/*      */ 
/*      */       
/* 1319 */       ab.b();
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 1327 */     if (s.c(this.k)) {
/*      */       
/* 1329 */       for (r r : this.v) {
/*      */         
/* 1331 */         s s = r.a(this.k);
/*      */         
/* 1333 */         if (s == null) {
/*      */ 
/*      */           
/* 1336 */           l.d("Could not find specialAction:" + this.k.a() + " on " + r.r().i());
/*      */           
/*      */           continue;
/*      */         } 
/* 1340 */         if (!s.a((af)r)) {
/*      */           
/* 1342 */           l.d("!isAvailable specialAction:" + this.k.a() + " on " + r.r().i() + " (action being skipped)");
/*      */           
/* 1344 */           if (c.a)
/*      */           {
/* 1346 */             l.d("Command source:" + this.b);
/*      */           }
/*      */           
/*      */           continue;
/*      */         } 
/* 1351 */         r.b(s);
/*      */         
/* 1353 */         w.a(r, s);
/*      */         
/* 1355 */         r.a(s, this.g, this.l, this.m);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1363 */       j j = j.a(this.k);
/*      */ 
/*      */       
/* 1366 */       if (j != null)
/*      */       {
/* 1368 */         if (l.bb != null && this.i != null) {
/*      */           
/* 1370 */           if (this.i.d(l.bb))
/*      */           {
/* 1372 */             l.bA.a(this.l.a, this.l.b, this.i, j);
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/* 1377 */           l.d("PingMapAction failed: game.playerTeam==null or this.team==null");
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1384 */     if (this.n != null)
/*      */     {
/* 1386 */       for (r r : this.v)
/*      */       {
/* 1388 */         r.G = this.n;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 1393 */     if (this.z != null)
/*      */     {
/* 1395 */       for (r r : this.v) {
/*      */         
/* 1397 */         if (r instanceof k) {
/*      */           
/* 1399 */           k k = (k)r;
/* 1400 */           k.a(this.z);
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
/*      */   public strictfp boolean a(m paramm1, m paramm2) {
/* 1414 */     if (paramm1 == null || paramm2 == null)
/*      */     {
/* 1416 */       return false;
/*      */     }
/* 1418 */     if (!paramm2.d(paramm1))
/*      */     {
/* 1420 */       return false;
/*      */     }
/*      */     
/* 1423 */     if ((this.q & 1 << paramm2.i) != 0)
/*      */     {
/* 1425 */       return true;
/*      */     }
/* 1427 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean l() {
/* 1435 */     this.q = 0;
/* 1436 */     for (byte b = 0; b < m.a; b++) {
/*      */       
/* 1438 */       m m1 = m.n(b);
/* 1439 */       if (m1 != null)
/*      */       {
/* 1441 */         if (m1.m())
/*      */         {
/* 1443 */           this.q = (short)(this.q | 1 << b);
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
/* 1454 */     l l = l.u();
/*      */     
/* 1456 */     if (l.c(true) < 127)
/*      */     {
/* 1458 */       if (this.j != null)
/*      */       {
/* 1460 */         if (this.j.d() == ao.c) {
/*      */           
/* 1462 */           al al = this.j.a();
/* 1463 */           if (al != null) {
/*      */             
/* 1465 */             af af1 = af.a(al);
/* 1466 */             if (af1 != null && !(af1 instanceof r)) {
/*      */               
/* 1468 */               l.d("Rejecting non OrderableUnit build order: " + al.i());
/* 1469 */               return false;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/* 1476 */     if (this.j != null)
/*      */     {
/* 1478 */       if (this.j.n) {
/*      */         
/* 1480 */         l.d("Rejecting waypoint with addedByAction true");
/* 1481 */         return false;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1489 */     return true;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
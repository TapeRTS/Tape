/*      */ package com.corrodinggames.rts.game.a;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.PointF;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.a.u;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.aj;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.an;
/*      */ import com.corrodinggames.rts.game.units.ao;
/*      */ import com.corrodinggames.rts.game.units.b;
/*      */ import com.corrodinggames.rts.game.units.b.c;
/*      */ import com.corrodinggames.rts.game.units.custom.g;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.d.k;
/*      */ import com.corrodinggames.rts.game.units.f;
/*      */ import com.corrodinggames.rts.game.units.h.e;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.e;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.h.h;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Random;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class a
/*      */   extends m
/*      */ {
/*      */   public static boolean ab;
/*      */   
/*      */   public boolean R() {
/*   91 */     int i = V();
/*   92 */     return (V() == 3 || i > 300);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean S() {
/*   97 */     return (V() >= 2);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean T() {
/*  102 */     return ((0x1 & this.as) == 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean U() {
/*  110 */     return T();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int V() {
/*  119 */     return this.bn;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  126 */   final int ac = 3000; int ad; int ae; int af; int ag; int ah; int ai; int aj; int ak; int al; int am; int an; int ao; int ap; int aq;
/*      */   public int ar;
/*      */   
/*      */   public boolean W() {
/*  130 */     h h = (l.u()).bC;
/*      */     
/*  132 */     if (h.x.i > 3000)
/*      */     {
/*  134 */       return true;
/*      */     }
/*  136 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean X() {
/*  146 */     if (W())
/*      */     {
/*  148 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  153 */     if (!this.aP || !this.aQ)
/*      */     {
/*  155 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  163 */     if (!this.aR)
/*      */     {
/*  165 */       return true;
/*      */     }
/*      */     
/*  168 */     if (!this.aS)
/*      */     {
/*  170 */       return true;
/*      */     }
/*      */     
/*  173 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean Y() {
/*  178 */     if (!this.aS)
/*      */     {
/*  180 */       return false;
/*      */     }
/*      */     
/*  183 */     if (X())
/*      */     {
/*  185 */       if (this.aQ)
/*      */       {
/*  187 */         return true;
/*      */       }
/*      */     }
/*      */     
/*  191 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(float paramFloat1, float paramFloat2, o paramo, ah paramah) {
/*  198 */     if (a(paramFloat1, paramFloat2, paramo.S, paramo.T, paramah))
/*      */     {
/*  200 */       return true;
/*      */     }
/*      */     float f1;
/*  203 */     for (f1 = -180.0F; f1 < 180.0F; f1 += 90.0F) {
/*      */       
/*  205 */       float f2 = paramo.S + f.i(f1) * paramo.U * 0.4F;
/*  206 */       float f3 = paramo.T + f.h(f1) * paramo.U * 0.4F;
/*      */       
/*  208 */       if (a(paramFloat1, paramFloat2, f2, f3, paramah))
/*      */       {
/*  210 */         return true;
/*      */       }
/*      */     } 
/*      */     
/*  214 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, ah paramah) {
/*  220 */     if (paramah == ah.d || paramah == ah.a)
/*      */     {
/*  222 */       return true;
/*      */     }
/*      */     
/*  225 */     short s1 = y.b(paramFloat1, paramFloat2, paramah);
/*  226 */     short s2 = y.b(paramFloat3, paramFloat4, paramah);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  231 */     if (s1 == -3 || s2 == -3) {
/*      */       
/*  233 */       String str = "null";
/*  234 */       if (paramah != null)
/*      */       {
/*  236 */         str = paramah.name();
/*      */       }
/*  238 */       d("pathPossible: no isolatedGroups found! (" + str + ")");
/*  239 */       l.M();
/*      */     } 
/*      */     
/*  242 */     if (s1 == -1 || s2 == -1)
/*      */     {
/*  244 */       return false;
/*      */     }
/*      */     
/*  247 */     if (s1 == -2)
/*      */     {
/*  249 */       return false;
/*      */     }
/*  251 */     if (s2 == -2)
/*      */     {
/*  253 */       return false;
/*      */     }
/*      */     
/*  256 */     if (s1 == s2)
/*      */     {
/*  258 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  263 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(af paramaf, float paramFloat1, float paramFloat2) {
/*  268 */     return a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2, paramaf.h());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(af paramaf, float paramFloat1, float paramFloat2) {
/*  273 */     float f1 = 60.0F;
/*      */     
/*  275 */     ah ah = paramaf.h();
/*  276 */     if (a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2, ah)) return true;
/*      */     
/*  278 */     if (a(paramaf.dH, paramaf.dI, paramFloat1 + f1, paramFloat2, ah)) return true; 
/*  279 */     if (a(paramaf.dH, paramaf.dI, paramFloat1 - f1, paramFloat2, ah)) return true;
/*      */     
/*  281 */     if (a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2 + f1, ah)) return true; 
/*  282 */     if (a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2 - f1, ah)) return true;
/*      */     
/*  284 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(af paramaf1, af paramaf2) {
/*  294 */     return b(paramaf1, paramaf2.dH, paramaf2.dI);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ap paramap) {
/*  323 */     paramap.a(this.at);
/*  324 */     paramap.a(this.au);
/*  325 */     paramap.a(this.av);
/*  326 */     paramap.a(this.aw);
/*  327 */     paramap.a(this.ax);
/*  328 */     paramap.a(this.aC);
/*  329 */     paramap.a(this.aE);
/*  330 */     paramap.a(this.aF);
/*  331 */     paramap.a(this.aG);
/*  332 */     paramap.a(this.aJ);
/*      */ 
/*      */     
/*  335 */     paramap.a(this.aU.size());
/*      */     
/*  337 */     for (o o : this.aU) {
/*      */ 
/*      */       
/*  340 */       byte b = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  348 */       if (o instanceof i) {
/*      */         
/*  350 */         b = 1;
/*      */       }
/*  352 */       else if (o instanceof g) {
/*      */         
/*  354 */         b = 2;
/*      */       }
/*  356 */       else if (o instanceof n) {
/*      */         
/*  358 */         b = 3;
/*      */       }
/*  360 */       else if (o instanceof m) {
/*      */         
/*  362 */         b = 4;
/*      */       }
/*  364 */       else if (o instanceof l) {
/*      */         
/*  366 */         b = 5;
/*      */       }
/*      */       else {
/*      */         
/*  370 */         throw new RuntimeException("zone not instance not supported:" + o.getClass().getName());
/*      */       } 
/*      */       
/*  373 */       paramap.c(b);
/*  374 */       paramap.a(o.Q);
/*      */     } 
/*      */     
/*  377 */     for (o o : this.aU) {
/*      */       
/*  379 */       paramap.a(o.Q);
/*  380 */       o.a(paramap);
/*      */     } 
/*  382 */     paramap.c(8);
/*      */ 
/*      */ 
/*      */     
/*  386 */     paramap.a(this.ar);
/*      */ 
/*      */     
/*  389 */     paramap.a(this.aM);
/*  390 */     paramap.a(this.aP);
/*  391 */     paramap.a(this.aQ);
/*      */ 
/*      */     
/*  394 */     paramap.a(this.aR);
/*  395 */     paramap.a(this.aS);
/*      */ 
/*      */ 
/*      */     
/*  399 */     paramap.a(this.aD);
/*      */ 
/*      */ 
/*      */     
/*  403 */     paramap.a(this.aT);
/*      */ 
/*      */ 
/*      */     
/*  407 */     paramap.a(this.ad);
/*  408 */     paramap.a(this.ae);
/*  409 */     paramap.a(this.af);
/*      */ 
/*      */     
/*  412 */     paramap.a(this.aH);
/*      */ 
/*      */ 
/*      */     
/*  416 */     paramap.a(this.as);
/*      */ 
/*      */ 
/*      */     
/*  420 */     super.a(paramap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public o o(int paramInt) {
/*  428 */     if (paramInt == 1)
/*      */     {
/*  430 */       return new i(this, -1.0F, -1.0F);
/*      */     }
/*  432 */     if (paramInt == 2)
/*      */     {
/*  434 */       return new g(this);
/*      */     }
/*  436 */     if (paramInt == 3)
/*      */     {
/*  438 */       return new n(this);
/*      */     }
/*  440 */     if (paramInt == 4)
/*      */     {
/*  442 */       return new m(this);
/*      */     }
/*  444 */     if (paramInt == 5)
/*      */     {
/*  446 */       return new l(this);
/*      */     }
/*  448 */     if (paramInt == 0) {
/*      */       
/*  450 */       l.b("Found zone type 0, loading PlainZone instead");
/*  451 */       return new m(this);
/*      */     } 
/*      */ 
/*      */     
/*  455 */     throw new RuntimeException("Unknown zone type:" + paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(k paramk) {
/*  466 */     this.at = paramk.e();
/*  467 */     this.au = paramk.g();
/*  468 */     this.av = paramk.g();
/*  469 */     this.aw = paramk.g();
/*  470 */     this.ax = paramk.g();
/*  471 */     this.aC = paramk.g();
/*  472 */     this.aE = paramk.f();
/*  473 */     this.aF = paramk.g();
/*  474 */     this.aG = paramk.e();
/*  475 */     this.aJ = paramk.f();
/*      */ 
/*      */     
/*  478 */     int i = paramk.f();
/*      */ 
/*      */     
/*  481 */     this.aU.clear();
/*      */ 
/*      */     
/*  484 */     boolean bool = false;
/*      */     
/*  486 */     if (paramk.b() >= 20) {
/*      */       
/*  488 */       bool = true;
/*      */       
/*  490 */       for (byte b1 = 0; b1 < i; b1++) {
/*      */         
/*  492 */         byte b2 = paramk.d();
/*  493 */         o o = o(b2);
/*  494 */         o.Q = paramk.f();
/*      */       } 
/*      */     } 
/*      */     
/*      */     byte b;
/*  499 */     for (b = 0; b < i; b++) {
/*      */       o o;
/*      */ 
/*      */       
/*  503 */       if (!bool) {
/*      */         
/*  505 */         byte b1 = paramk.d();
/*  506 */         o = o(b1);
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  511 */         o = p(paramk.f());
/*      */       } 
/*  513 */       o.a(paramk);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  519 */     b = paramk.d();
/*      */     
/*  521 */     if (b >= 1)
/*      */     {
/*  523 */       this.ar = paramk.f();
/*      */     }
/*      */     
/*  526 */     this.aV.clear();
/*  527 */     this.aV.addAll(this.aU);
/*      */     
/*  529 */     if (b >= 2) {
/*      */       
/*  531 */       this.aM = paramk.e();
/*  532 */       this.aP = paramk.e();
/*  533 */       this.aQ = paramk.e();
/*      */     } 
/*      */     
/*  536 */     if (b >= 3) {
/*      */       
/*  538 */       this.aR = paramk.e();
/*  539 */       this.aS = paramk.e();
/*      */     } 
/*      */ 
/*      */     
/*  543 */     if (b >= 4)
/*      */     {
/*  545 */       this.aD = paramk.g();
/*      */     }
/*      */     
/*  548 */     if (b >= 5)
/*      */     {
/*  550 */       this.aT = paramk.f();
/*      */     }
/*      */     
/*  553 */     if (b >= 6) {
/*      */       
/*  555 */       this.ad = paramk.f();
/*  556 */       this.ae = paramk.f();
/*  557 */       this.af = paramk.f();
/*      */     } 
/*      */     
/*  560 */     if (b >= 7)
/*      */     {
/*  562 */       this.aH = paramk.e();
/*      */     }
/*      */     
/*  565 */     if (b >= 8)
/*      */     {
/*  567 */       this.as = paramk.f();
/*      */     }
/*      */     
/*  570 */     super.c(paramk);
/*      */ 
/*      */     
/*  573 */     Z();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public o p(int paramInt) {
/*  607 */     for (o o : this.aU) {
/*      */       
/*  609 */       if (o.Q == paramInt)
/*      */       {
/*  611 */         return o;
/*      */       }
/*      */     } 
/*  614 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(o paramo) {
/*  619 */     if (paramo == null)
/*      */     {
/*  621 */       return -1;
/*      */     }
/*  623 */     return paramo.Q;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void Z() {
/*  630 */     this.ai = 0;
/*  631 */     this.al = 0;
/*  632 */     this.am = 0;
/*  633 */     this.an = 0;
/*      */     
/*  635 */     this.aj = 0;
/*  636 */     this.ak = 0;
/*  637 */     this.ao = 0;
/*      */     
/*  639 */     this.ap = 0;
/*      */     
/*  641 */     this.ag = 0;
/*  642 */     this.ah = 0;
/*      */     
/*  644 */     this.aq = 0;
/*      */     
/*  646 */     for (o o : this.aV) {
/*      */       
/*  648 */       if (o instanceof i) {
/*      */         
/*  650 */         i i = (i)o;
/*      */         
/*  652 */         this.ag++;
/*      */         
/*  654 */         if (i.u() >= 2)
/*      */         {
/*  656 */           this.ah++;
/*      */         }
/*      */         
/*  659 */         if (i.n)
/*      */         {
/*  661 */           this.aq++;
/*      */         }
/*      */       } 
/*      */       
/*  665 */       if (o instanceof g) {
/*      */         
/*  667 */         g g = (g)o;
/*      */         
/*  669 */         if (g.a) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/*  674 */         if (g.g) {
/*      */           
/*  676 */           this.ai++;
/*      */           
/*  678 */           if (!g.u && !g.d())
/*      */           {
/*      */             
/*  681 */             if (!g.A)
/*      */             {
/*  683 */               this.aj++;
/*      */             }
/*      */             else
/*      */             {
/*  687 */               this.ak++;
/*      */             }
/*      */           
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/*  694 */           this.al++;
/*      */           
/*  696 */           if (g.d())
/*      */           {
/*  698 */             this.am++;
/*      */           }
/*      */           
/*  701 */           this.an += g.g();
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  706 */       if (o instanceof n) {
/*      */         
/*  708 */         h h = (h)o;
/*      */         
/*  710 */         this.ao++;
/*      */         
/*  712 */         if (h.g() > 0)
/*      */         {
/*  714 */           this.ap++;
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*  721 */   int as = 0;
/*      */ 
/*      */ 
/*      */   
/*      */   boolean at;
/*      */ 
/*      */ 
/*      */   
/*      */   float au;
/*      */ 
/*      */ 
/*      */   
/*      */   float av;
/*      */ 
/*      */ 
/*      */   
/*      */   float aw;
/*      */ 
/*      */   
/*      */   float ax;
/*      */ 
/*      */   
/*      */   float ay;
/*      */ 
/*      */   
/*      */   float az;
/*      */ 
/*      */   
/*  749 */   float aA = 0.0F;
/*  750 */   float aB = 0.0F;
/*      */   
/*      */   float aC;
/*      */   
/*      */   float aD;
/*      */   
/*      */   int aE;
/*      */   
/*      */   float aF;
/*      */   
/*      */   public boolean aG;
/*      */   
/*      */   public boolean aH;
/*      */   
/*      */   public boolean aI;
/*      */   
/*      */   int aJ;
/*      */   
/*      */   int aK;
/*      */   
/*      */   int aL;
/*      */   
/*      */   boolean aM = true;
/*      */   
/*      */   boolean aN = true;
/*      */   
/*      */   f aO;
/*      */   
/*      */   boolean aP;
/*      */   
/*      */   boolean aQ;
/*      */   
/*      */   boolean aR;
/*      */   boolean aS;
/*      */   int aT;
/*  785 */   ConcurrentLinkedQueue aU = new ConcurrentLinkedQueue();
/*  786 */   ArrayList aV = new ArrayList();
/*      */ 
/*      */   
/*  789 */   PointF aW = new PointF();
/*      */   
/*      */   Paint aX;
/*  792 */   ArrayList aY = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean a(al paramal) {
/*  986 */     af af = af.b(paramal);
/*  987 */     if (!af.bw() && af instanceof r)
/*      */     {
/*  989 */       if (!g(af) && !af.ah())
/*      */       {
/*  991 */         if (((r)af).l()) {
/*      */           
/*  993 */           if (paramal instanceof l) {
/*      */             
/*  995 */             l l = (l)paramal;
/*  996 */             if (l.fk || !l.fh)
/*      */             {
/*  998 */               return false;
/*      */             }
/*      */           } 
/*      */ 
/*      */           
/* 1003 */           return true;
/*      */         } 
/*      */       }
/*      */     }
/* 1007 */     return false;
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
/* 1022 */   d aZ = new a$1(this, "attackingUnitsLand");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1031 */   d ba = new a$6(this, "attackingUnitsHover");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1040 */   d bb = new a$7(this, "attackingUnitsAir");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1049 */   d bc = new a$8(this, "attackingUnitsWater");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1059 */   d bd = new a$9(this, "buildingUnits");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1085 */   d be = new a$10(this, "transportUnits");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1114 */   d bf = new a$11(this, "transportUnitsFlying");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1130 */   d bg = new a$12(this, "transportUnitsNonFlying");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1147 */   d bh = new a$13(this, "builderUnits");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1175 */   d bi = new a$2(this, "harvesterUnits");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1205 */   d bj = new a$3(this, "extractorUnits");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1230 */   d bk = new a$4(this, "buildingFactories");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1278 */   d bl = new a$5(this, "buildingFactoriesForBuilders");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public c bm;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int bn;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float bo;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   ArrayList bp;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public a(int paramInt) {
/* 1329 */     this(paramInt, true);
/*      */   }
/*      */   
/*      */   public a(int paramInt, boolean paramBoolean)
/*      */   {
/* 1334 */     super(paramInt, paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1729 */     this.bm = new c();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2305 */     this.bo = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2677 */     this.bp = new ArrayList(); aj(); } private void aj() { l l = l.u(); this.au = (100 + this.i * 9); this.aw = (202 + this.i * 19); this.ay = (50 + this.i * 2); this.aF = (4200 + this.i * 5); this.aC = (3500 + this.i * 5); this.aD = (7500 + this.i * 5); this.aX = new Paint(); this.aX.b(Color.a(0, 255, 0)); this.aX.a(Paint.Style.b); this.aX.a(true); l.a(this.aX, 14.0F); aa(); } public void aa() { for (d d1 : this.aY) d1.b();  } public void d(String paramString) { l.b("ai_debug(" + this.i + ")", paramString); } public PointF ab() { l l = l.u(); l.bt.a(f.a(0, l.bt.y), f.a(0, l.bt.z)); this.aW.a(l.bt.M, l.bt.N); return this.aW; } public PointF ac() { l l = l.u(); if (l.bt.w.size() == 0) return null;  int i = f.b(l.bt.w.size()); Point point = l.bt.w.get(i); l.bt.a(point.a, point.b); this.aW.a(l.bt.M, l.bt.N); return this.aW; } public PointF a(float paramFloat1, float paramFloat2) { l l = l.u(); float f1 = -1.0F; PointF pointF = new PointF(); for (byte b = 0; b < l.bt.w.size(); b++) { Point point = l.bt.w.get(b); l.bt.a(point.a, point.b); this.aW.a(l.bt.M, l.bt.N); PointF pointF1 = this.aW; float f2 = f.a(pointF1.a, pointF1.b, paramFloat1, paramFloat2); if (f2 < f1 || f1 == -1.0F) { f1 = f2; pointF.a(pointF1); }  }  if (f1 == -1.0F) return null;  return pointF; } i e(af paramaf) { for (o o : this.aV) { if (o instanceof i) { i i = (i)o; if (i.b(paramaf)) return i;  }  }  return null; }
/*      */   i b(float paramFloat1, float paramFloat2) { for (o o : this.aV) { if (o instanceof i) { i i = (i)o; if (i.c(paramFloat1, paramFloat2)) return i;  }  }  return null; }
/*      */   i f(af paramaf) { return c(paramaf.dH, paramaf.dI); }
/*      */   i c(float paramFloat1, float paramFloat2) { float f1 = -1.0F; i i = null; for (o o : this.aV) { if (o instanceof i) { i i1 = (i)o; float f2 = i1.d(paramFloat1, paramFloat2); if (i == null || f2 < f1) { f1 = f2; i = i1; }  }  }  return i; }
/*      */   i a(ah paramah, float paramFloat1, float paramFloat2, boolean paramBoolean) { float f1 = -1.0F; i i = null; for (o o : this.aV) { if (o instanceof i) { i i1 = (i)o; float f2 = i1.d(paramFloat1, paramFloat2); if (!a(paramFloat1, paramFloat2, i1, paramah)) continue;  if (paramBoolean && i1.t) continue;  if (i == null || f2 < f1) { f1 = f2; i = i1; }  }  }  return i; }
/*      */   public static boolean a(af paramaf, float paramFloat1, float paramFloat2, float paramFloat3) { float f1 = f.a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2); float f2 = paramFloat3; if (f1 < f2 * f2) return true;  return false; }
/*      */   private boolean a(PointF paramPointF) { if (a(this, paramPointF.a, paramPointF.b, 290.0F) != null) return false;  i i = c(paramPointF.a, paramPointF.b); if (i != null) if (i.d(paramPointF.a, paramPointF.b) < 490000.0F) return false;   PointF pointF = a(paramPointF.a, paramPointF.b); if (pointF != null) { float f2 = f.a(paramPointF.a, paramPointF.b, pointF.a, pointF.b); if (f2 < 160000.0F) return false;  }  float f1 = 60.0F; if (y.c(paramPointF.a, paramPointF.b) || y.c(paramPointF.a + f1, paramPointF.b) || y.c(paramPointF.a, paramPointF.b + f1) || y.c(paramPointF.a - f1, paramPointF.b) || y.c(paramPointF.a, paramPointF.b + f1)) return false;  return true; }
/* 2684 */   public com.corrodinggames.rts.game.units.a c(r paramr) { if (paramr.aO()) {
/*      */       
/* 2686 */       boolean bool = true;
/*      */       
/* 2688 */       if (paramr.ah())
/*      */       {
/* 2690 */         bool = false;
/*      */       }
/*      */       
/* 2693 */       if (g((af)paramr))
/*      */       {
/* 2695 */         bool = false;
/*      */       }
/*      */       
/* 2698 */       if (bool) {
/*      */         
/* 2700 */         if (this.aH)
/*      */         {
/* 2702 */           return com.corrodinggames.rts.game.units.a.f;
/*      */         }
/*      */         
/* 2705 */         return com.corrodinggames.rts.game.units.a.a;
/*      */       } 
/*      */     } 
/*      */     
/* 2709 */     return com.corrodinggames.rts.game.units.a.b; }
/*      */   private boolean b(PointF paramPointF) { for (af af : af.bj) { if (af.bB != this) if (af instanceof com.corrodinggames.rts.game.units.d.d) { if (af.bB.c(this) && a(af, paramPointF.a, paramPointF.b, 300.0F)) return false;  if (af.bB.d(this) && a(af, paramPointF.a, paramPointF.b, 320.0F)) return false;  }   }  if (b(this, paramPointF.a, paramPointF.b, 360.0F) >= 4) return false;  boolean bool = true; if (a(this, paramPointF.a, paramPointF.b, 360.0F, bool) >= 2) return false;  return true; }
/*      */   public int a(d paramd, b paramb) { int i = 0; for (e e : paramd.c) i += a(e.a, paramb);  return i; }
/*      */   public int a(al paramal, b paramb) { return a(paramal, true, paramb); }
/*      */   public int a(al paramal, boolean paramBoolean, b paramb) { boolean bool = paramal.j(); Integer integer = this.bm.a(bool, paramal, paramBoolean); if (integer != null) return integer.intValue();  int i = 0; if (bool) paramBoolean = false;  af[] arrayOfAf = af.bj.a(); byte b1; int j; for (b1 = 0, j = af.bj.size(); b1 < j; b1++) { af af = arrayOfAf[b1]; if (af.bB == this) if (paramb == b.a || !af.br) { if (af.db == paramal) i++;  if (paramBoolean) if (af instanceof k) { k k = (k)af; i += k.h(paramal); }   }   }  this.bm.a(bool, paramal, paramBoolean, Integer.valueOf(i)); return i; }
/* 2714 */   public int ad() { int i = 0; for (o o : this.aV) { if (o instanceof g) { g g = (g)o; i += g.C.size(); }  }  return i; } public boolean g(af paramaf) { if (paramaf instanceof r) { r r = (r)paramaf; if (r.cc()) { al al = r.r(); if (al instanceof l) { l l = (l)al; if (!l.fi) return false;  }  return true; }  }  return false; } private static ArrayList bq = new ArrayList();
/*      */   public boolean h(af paramaf) { if (paramaf instanceof r) { r r = (r)paramaf; if (!r.bw() && r.l()) if (!g((af)r) && !r.ah()) { al al = r.r(); if (al instanceof l) { l l = (l)al; if (!l.fh) return false;  }  return true; }   }  return false; }
/*      */   public boolean b(af paramaf1, af paramaf2) { if (this.J) { if (paramaf1 instanceof r) { r r = (r)paramaf1; if (r.ao()) if (aj.a(r, paramaf2)) return true;   }  return false; }  if (h(paramaf1)) if (paramaf1 instanceof r) { r r = (r)paramaf1; if (aj.a(r, paramaf2)) return true;  }   return false; }
/* 2717 */   public void f(float paramFloat) { if (ab && (l.u()).aV) { if (this.aI || this.aG) return;  l l = l.u(); af[] arrayOfAf = af.bj.a(); byte b; int i; for (b = 0, i = af.bj.size(); b < i; b++) { af af = arrayOfAf[b]; if (af.bB == this) { float f1 = 200.0F; if (l.cu.b((int)(af.dH - f1), (int)(af.dI - f1), (int)(af.dH + f1), (int)(af.dI + f1))) { if (af instanceof r) r r = (r)af;  String str = ""; float f2 = af.dI - l.ce - 60.0F; this.aX.b(Color.a(0, 255, 0)); if (af instanceof com.corrodinggames.rts.game.units.d.d) { f2 -= 80.0F; str = str + "Base ( Team:" + this.i + " )"; str = str + "\nuseTransportsOnThisMap: " + X(); str = str + "\nuseHoverTransportsOnThisMap: " + Y(); str = str + "\nattackingCount: " + this.aJ; str = str + "\ndefendingCount: " + this.aK; str = str + "\nnumOfUnitsNeedingTransport: " + ad(); str = str + "\ntransport: " + this.ap; if (T()) str = str + "\nTurtling: true";  this.aX.b(Color.a(255, 255, 255)); }  if (str.length() != 0) for (String str1 : str.split("\n")) { float f3 = af.dH - l.cd; float f4 = f2; float f5 = -this.aX.l() + this.aX.m(); l.bw.j(); if (l.cE > 1.0F) { l.L(); f3 *= l.cE; f4 *= l.cE; f5 /= l.cE; }  l.bw.a(str1, f3, f4, this.aX); l.bw.k(); f2 += f5; }   }  }  }  for (o o : this.aU) { if (!l.cu.b((int)(o.S - o.U), (int)(o.T - o.U), (int)(o.S + o.U), (int)(o.T + o.U))) continue;  this.aX.b(F()); l.bw.a(o.S - l.cd, o.T - l.ce, o.U + 2.0F, this.aX); int j = Color.a(0, 255, 0); String str1 = ""; String str2 = o.getClass().getSimpleName(); str1 = str1 + "\n" + str2 + " ( Team:" + this.i + " )"; float f1 = o.T - l.ce; if (o instanceof i) { f1 -= 50.0F; i i1 = (i)o; str1 = str1 + "\nState: " + i1.b.name() + "(id:" + i1.Q + ")"; str1 = str1 + "\nunsafe: " + i1.f() + " (" + i1.s + ")"; str1 = str1 + "\nunsafeBaseTimer: " + i1.v; str1 = str1 + "\nallowedUnits: " + i1.d; if (i1.z != null) str1 = str1 + "\nlastAttemptedBuilding: " + i1.z.i();  if (i1.A != null) str1 = str1 + "\nlastAttemptedBuilding-cannotAffordPrice: " + i1.A.a(false, true, 4, true);  if (i1.B != null) str1 = str1 + "\nlastAttemptedBuilding-cannotAffordBy: " + i1.B.a(false, true, 4, true);  str1 = str1 + "\nlastAttemptedBuildingCount: " + i1.C; str1 = str1 + "\nlastAttemptedBuildingFailed: " + i1.D; str1 = str1 + "\nlastUnitAttempt: " + i1.E + " (" + i1.F + " - " + i1.G + ")"; str1 = str1 + "\nbuildBuildingDelay: " + i1.e; str1 = str1 + "\ncredits: " + this.m; if (i1.b == j.a) str1 = str1 + "\nclaimedBaseTimer: " + i1.l;  if (i1.k > 100.0F) str1 = str1 + "\nabandonedTimer: " + i1.k;  if (i1.g > 0.0F) str1 = str1 + "\nrequestedBuildersDelay: " + i1.g + " (" + i1.h + ")";  str1 = str1 + "\nBuilders: " + i1.J; str1 = str1 + "\nIdle Builders: " + i1.K; }  if (o instanceof g) { g g = (g)o; if (g.b) str1 = str1 + "\nVIP Mode";  str1 = str1 + "\n" + (g.b() ? "Defensive Type" : "Attack Type"); str1 = str1 + "\nUnits: " + g.B.size() + " / " + g.z; str1 = str1 + "\nStagingForAttack: " + g.p; str1 = str1 + "\nAttackDelay: " + g.k; if (g.t != 0.0F) str1 = str1 + "\nStagingTimer: " + g.t;  str1 = str1 + "\nStagingTargetFound: " + g.q; if (g.n != 0.0F) str1 = str1 + "\nattackingFor: " + g.n;  if (g.A) str1 = str1 + "\nseaUnitGroup";  }  if (o instanceof n) { n n = (n)o; str1 = str1 + "\nUnitsWanted: " + n.l; str1 = str1 + "\nunits: " + n.B.size(); str1 = str1 + "\nreadyToMoveOut: " + n.q; if (n.m != null) str1 = str1 + "\nCurrentlyHelping: " + n.m.Q;  }  if (o instanceof l) { l l1 = (l)o; str1 = str1 + "\nneedsTransportGroup: " + l1.a; }  this.aX.b(F()); for (String str : str1.split("\n")) { if (!str.trim().equals("")) { float f2 = o.S - l.cd; float f3 = f1; float f4 = -this.aX.l() + this.aX.m(); l.bw.j(); if (l.cE > 1.0F) { l.L(); f2 *= l.cE; f3 *= l.cE; f4 /= l.cE; }  l.bw.a(str, f2, f3, this.aX); l.bw.k(); f1 += f4; this.aX.b(j); }  }  }  return; }  } public af e(m paramm) { for (af af : af.bj) { if (af.bB == paramm && (af instanceof com.corrodinggames.rts.game.units.d.d || af.bu)) return af;  }  for (af af : af.bj) { if (af.bB == paramm && af.bt) return af;  }  return null; } public void a(float paramFloat) { l l = l.u(); if (this.aG || this.aI) return;  if (l.bF.z) { if (!l.bF.A) return;  if (l.bJ.h()) return;  }  if (this.bo > 0.0F) { this.bo -= paramFloat; return; }  this.bn = y(); if (this.aN && l.bh > 3000) { this.aN = false; af[] arrayOfAf = af.bj.a(); byte b; int i; for (b = 0, i = af.bj.size(); b < i; b++) { af af = arrayOfAf[b]; if (af instanceof f) { d("firstRunDelayed: Found damagingBorder"); this.aO = (f)af; break; }  }  }  if (this.aM) { this.aM = false; this.aP = true; this.aQ = true; this.aR = true; this.aS = true; af af = e(this); if (af == null) d("firstRun: no command center found");  if (af != null) { for (byte b = 0; b < m.a; b++) { m m1 = m.n(b); if (m1 != null && m1 != this) { af af1 = e(m1); if (af1 != null) { if (!a(af.dH, af.dI, af1.dH, af1.dI, ah.b)) this.aP = false;  if (!a(af.dH, af.dI, af1.dH, af1.dI, ah.f)) this.aQ = false;  }  }  }  for (Point point : l.bt.w) { PointF pointF = l.bt.a(point); if (!a(af.dH, af.dI, pointF.a, pointF.b + l.bt.l, ah.b)) this.aR = false;  if (!a(af.dH, af.dI, pointF.a, pointF.b + l.bt.l, ah.f)) this.aS = false;  }  }  }  this.ay += paramFloat; this.az += paramFloat; if (this.ay > 25.0F) { this.ay -= 25.0F; if (this.ay > 25.0F) this.ay = 25.0F;  if (this.ay < -1.0F) this.ay = -1.0F;  boolean bool1 = false; boolean bool2 = false; for (o o : this.aU) { if (o instanceof i) { i i = (i)o; i.a += this.az; }  }  for (byte b = 0; b < 2; b++) { i i1 = null; for (o o : this.aU) { if (o instanceof i) { i i = (i)o; if (i1 == null || i1.a < i.a) i1 = i;  }  }  if (i1 == null || i1.a < 50.0F) break;  i i2 = i1; i2.b(i2.a); i2.d(i2.a); i2.a = 0.0F; }  this.az = 0.0F; }  this.au += paramFloat; this.av += paramFloat; if (this.au > 80.0F) { i(this.av); this.au -= 80.0F; if (this.au > 80.0F) this.au = 80.0F;  if (this.au < -1.0F) this.au = -1.0F;  this.av = 0.0F; }  this.aw += paramFloat; this.ax += paramFloat; if (this.aw > 250.0F) { h(this.ax); this.aw -= 250.0F; if (this.aw > 250.0F) this.aw = 250.0F;  if (this.aw < -1.0F) this.aw = -1.0F;  this.ax = 0.0F; }  } public void a(r paramr, c paramc) { l l = l.u(); e e = l.bN.a(this); e.a(paramr); e.a(paramc); } public void g(float paramFloat) { for (af af : af.bj) { if (af.bB == this) if (af instanceof r && i(af)) { r r = (r)af; if (r instanceof e) { boolean bool1 = false; af af1 = r.Z(); if (af1 != null) if (r.a_(af1)) bool1 = !af1.cr() ? true : false;   boolean bool2 = !r.P() ? true : false; if (bool1 == true && bool1 != bool2) a(r, e.j.J());  if (!bool1 && bool1 != bool2) a(r, e.k.J());  }  if (r instanceof c) { boolean bool1 = true; af af1 = r.Z(); if (af1 != null) if (r.a_(af1)) bool1 = !af1.P() ? true : false;   boolean bool2 = !r.P() ? true : false; if (bool1 == true && bool1 != bool2) a(r, c.y.J());  if (!bool1 && bool1 != bool2) a(r, c.z.J());  }  if (r.aZ() == b.d) if (r.ao() && r.Z() != null) { l l = l.u(); e e = l.bN.a(this); e.a(r); e.a(r.Z()); }   }   }  } public ArrayList ae() { bq.clear();
/* 2718 */     return bq; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(float paramFloat) {
/* 2725 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 2729 */     this.bm.b();
/*      */ 
/*      */ 
/*      */     
/* 2733 */     byte b1 = 0;
/*      */ 
/*      */     
/* 2736 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 2737 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 2739 */       af af = arrayOfAf[b2];
/*      */       
/* 2741 */       if (af.bB == this && !af.o_()) {
/*      */         
/* 2743 */         b1++;
/*      */         
/* 2745 */         if (af instanceof r) {
/*      */           
/* 2747 */           r r = (r)af;
/*      */ 
/*      */           
/* 2750 */           if (af.cp == null) {
/*      */             
/* 2752 */             i i1 = r.as;
/*      */             
/* 2754 */             r.as = f((af)r);
/*      */ 
/*      */             
/* 2757 */             if (r.as != null && i1 != r.as)
/*      */             {
/* 2759 */               if (r.bw()) {
/*      */                 
/* 2761 */                 r.at = a(af.dH, af.dI, r.as.S, r.as.T, ah.b);
/*      */                 
/* 2763 */                 if (!r.at)
/*      */                 {
/* 2765 */                   if (r.r().p())
/*      */                   {
/*      */                     
/* 2768 */                     r.at = a(af.dH, af.dI + 15.0F, r.as.S, r.as.T, ah.b);
/*      */                   
/*      */                   }
/*      */                 
/*      */                 }
/*      */               }
/*      */               else {
/*      */                 
/* 2776 */                 r.at = a(af.dH, af.dI, r.as.S, r.as.T, ah.b);
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
/* 2788 */     g(paramFloat);
/*      */     
/* 2790 */     for (af af : af.bj) {
/*      */       
/* 2792 */       if (af.bB == this)
/*      */       {
/* 2794 */         if (af instanceof r) {
/*      */           
/* 2796 */           r r = (r)af;
/*      */           
/* 2798 */           com.corrodinggames.rts.game.units.a a1 = c(r);
/*      */           
/* 2800 */           if (r.G != a1)
/*      */           {
/* 2802 */             if (i((af)r)) {
/*      */               
/* 2804 */               e e = l.bN.a(this);
/* 2805 */               e.a(r);
/* 2806 */               e.a(a1);
/*      */             } 
/*      */           }
/*      */           
/* 2810 */           if (r.ah() && r.cL())
/*      */           {
/* 2812 */             if (r.ar == null)
/*      */             {
/* 2814 */               if (i((af)r))
/*      */               {
/* 2816 */                 g.a(this, r);
/*      */               }
/*      */             }
/*      */           }
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2826 */     if (b1 == 0)
/*      */     {
/* 2828 */       if (!this.J)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2835 */         this.aI = true;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2843 */     this.aD = f.a(this.aD, paramFloat);
/*      */     
/* 2845 */     this.aC = f.a(this.aC, paramFloat);
/*      */     
/* 2847 */     if (R())
/*      */     {
/* 2849 */       this.aC = f.a(this.aC, 4.0F * paramFloat);
/*      */     }
/*      */ 
/*      */     
/* 2853 */     if (this.aC == 0.0F) {
/*      */ 
/*      */ 
/*      */       
/* 2857 */       byte b = 0;
/* 2858 */       for (o o : this.aV) {
/*      */         
/* 2860 */         if (o instanceof i) {
/*      */           
/* 2862 */           i i1 = (i)o;
/*      */           
/* 2864 */           if (i1.b == j.a)
/*      */           {
/* 2866 */             b++;
/*      */           }
/*      */         } 
/*      */       } 
/* 2870 */       b2 = 0;
/* 2871 */       if (b > 2)
/*      */       {
/* 2873 */         b2 = 1;
/*      */       }
/*      */ 
/*      */       
/* 2877 */       if (b2 != 0) {
/*      */         
/* 2879 */         this.aC = 300.0F;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 2884 */         PointF pointF = ac();
/* 2885 */         if (pointF != null) {
/*      */           
/* 2887 */           pointF.b += l.bt.l;
/*      */           
/* 2889 */           if (b(pointF.a, pointF.b) == null)
/*      */           {
/* 2891 */             if (b(pointF)) {
/*      */               
/* 2893 */               this.aC = 2000.0F;
/*      */               
/* 2895 */               i i1 = new i(this, pointF.a, pointF.b);
/* 2896 */               i1.U = 360.0F;
/* 2897 */               i1.b = j.a;
/* 2898 */               i1.c = k.b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 2905 */               this.af++;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2915 */     if (this.aD == 0.0F) {
/*      */       
/* 2917 */       this.aD = 100.0F;
/*      */ 
/*      */       
/* 2920 */       byte b = 0;
/* 2921 */       for (o o : this.aV) {
/*      */         
/* 2923 */         if (o instanceof i) {
/*      */           
/* 2925 */           i i1 = (i)o;
/* 2926 */           if (i1.c == k.c)
/*      */           {
/* 2928 */             b++;
/*      */           }
/*      */         } 
/*      */       } 
/* 2932 */       if (b < 3) {
/*      */         
/* 2934 */         af af = ag();
/*      */         
/* 2936 */         if (af != null) {
/*      */           
/* 2938 */           PointF pointF = new PointF();
/* 2939 */           pointF.a = af.dH;
/* 2940 */           pointF.b = af.dI;
/*      */           
/* 2942 */           if (pointF != null)
/*      */           {
/*      */             
/* 2945 */             if (b(pointF.a, pointF.b) == null)
/*      */             {
/* 2947 */               if (a(pointF)) {
/*      */                 
/* 2949 */                 this.aD = 5000.0F;
/*      */                 
/* 2951 */                 i i1 = new i(this, pointF.a, pointF.b);
/* 2952 */                 i1.U = 310.0F;
/* 2953 */                 i1.b = j.a;
/* 2954 */                 i1.c = k.c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 2961 */                 this.af++;
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
/* 2973 */     this.aL = 0;
/* 2974 */     this.aJ = 0;
/* 2975 */     this.aK = 0;
/*      */ 
/*      */ 
/*      */     
/* 2979 */     arrayOfAf = af.bj.a();
/* 2980 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 2982 */       af af = arrayOfAf[b2];
/*      */       
/* 2984 */       if (af.bB == this)
/*      */       {
/* 2986 */         if (af instanceof r) {
/*      */           
/* 2988 */           r r = (r)af;
/*      */           
/* 2990 */           if (!af.bw()) {
/*      */             
/* 2992 */             if (r.ar != null)
/*      */             {
/* 2994 */               if (r.ar.b()) {
/*      */                 
/* 2996 */                 this.aK++;
/*      */ 
/*      */                 
/*      */                 continue;
/*      */               } 
/*      */             }
/*      */             
/* 3003 */             if (h((af)r) && !r.br)
/*      */             {
/*      */               
/* 3006 */               if (r.h() == ah.e) {
/*      */                 
/* 3008 */                 this.aL++;
/*      */               }
/*      */               else {
/*      */                 
/* 3012 */                 this.aJ++;
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
/*      */       continue;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3029 */     this.aA = f.a(this.aA, paramFloat);
/* 3030 */     this.aB += paramFloat;
/*      */     
/* 3032 */     if (this.aA == 0.0F) {
/*      */ 
/*      */       
/* 3035 */       byte b3 = 0;
/* 3036 */       b2 = 0;
/*      */       
/* 3038 */       i = 0;
/* 3039 */       byte b4 = 0;
/*      */       
/* 3041 */       for (af af : af.bj) {
/*      */         
/* 3043 */         if (af.bB == this && af.bG()) {
/*      */           
/* 3045 */           if (af instanceof com.corrodinggames.rts.game.units.d.l || af instanceof com.corrodinggames.rts.game.units.d.a || af instanceof com.corrodinggames.rts.game.units.d.r)
/*      */           {
/*      */             
/* 3048 */             if (af instanceof com.corrodinggames.rts.game.units.d.a) {
/*      */               
/* 3050 */               b2++;
/* 3051 */               com.corrodinggames.rts.game.units.d.a a1 = (com.corrodinggames.rts.game.units.d.a)af;
/* 3052 */               if (a1.T() > 1)
/*      */               {
/* 3054 */                 b3++;
/*      */               }
/*      */             } 
/*      */           }
/*      */           
/* 3059 */           if (af.r().p()) {
/*      */             
/* 3061 */             i++;
/* 3062 */             c c1 = af.bX();
/* 3063 */             if (s.c(c1))
/*      */             {
/* 3065 */               b4++;
/*      */             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3091 */       if (j(4100) || this.aB > 2400.0F || this.aq == 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3104 */         for (af af : af.bj) {
/*      */           
/* 3106 */           if (af.bB == this && af instanceof r) {
/*      */             
/* 3108 */             r r = (r)af;
/*      */             
/* 3110 */             if (r.bW()) {
/*      */               
/* 3112 */               ArrayList arrayList = r.M();
/*      */               
/* 3114 */               ArrayList<s> arrayList1 = ae();
/*      */               
/* 3116 */               for (s s : arrayList) {
/*      */                 
/* 3118 */                 if (s.o((af)r))
/*      */                 {
/* 3120 */                   arrayList1.add(s);
/*      */                 }
/*      */               } 
/* 3123 */               if (arrayList1.size() > 0)
/*      */               {
/* 3125 */                 a(r, (s)f.a(arrayList1));
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 3133 */         boolean bool = false;
/* 3134 */         if (j(30000))
/*      */         {
/* 3136 */           bool = true;
/*      */         }
/*      */ 
/*      */         
/* 3140 */         for (af af : af.bj) {
/*      */           
/* 3142 */           if (af.bB == this && af instanceof r) {
/*      */             
/* 3144 */             r r = (r)af;
/*      */             
/* 3146 */             c c1 = r.bX();
/* 3147 */             if (s.c(c1)) {
/*      */               boolean bool1;
/*      */ 
/*      */               
/* 3151 */               float f1 = r.bY();
/*      */               
/* 3153 */               if (f1 < 0.0F) {
/*      */                 
/* 3155 */                 f1 = 6.0F;
/* 3156 */                 bool1 = false;
/*      */               }
/*      */               else {
/*      */                 
/* 3160 */                 bool1 = true;
/*      */               } 
/*      */               
/* 3163 */               if (f1 == 0.0F) {
/*      */                 continue;
/*      */               }
/*      */ 
/*      */               
/* 3168 */               boolean bool2 = false;
/*      */ 
/*      */               
/* 3171 */               int j = f.b(100);
/*      */ 
/*      */               
/* 3174 */               float f2 = 100.0F - f1;
/*      */               
/* 3176 */               if (bool)
/*      */               {
/* 3178 */                 f2 -= 4.0F;
/*      */               }
/*      */               
/* 3181 */               if (!bool1) {
/*      */                 
/* 3183 */                 if (af.r().p())
/*      */                 {
/* 3185 */                   if (b4 > 0)
/*      */                   {
/* 3187 */                     f2 = 50.0F;
/*      */                   }
/*      */                 }
/*      */                 
/* 3191 */                 if (b2 > 0 && b3 == 0) {
/*      */                   
/* 3193 */                   f2 = 99.0F;
/* 3194 */                   if (af instanceof com.corrodinggames.rts.game.units.d.a)
/*      */                   {
/* 3196 */                     f2 = 40.0F;
/*      */                   }
/*      */                 } 
/*      */               } 
/*      */               
/* 3201 */               if (f2 < 10.0F) f2 = 10.0F;
/*      */ 
/*      */               
/* 3204 */               bool2 = (j > f2) ? true : false;
/*      */ 
/*      */               
/* 3207 */               if (bool2) {
/*      */ 
/*      */                 
/* 3210 */                 boolean bool3 = r.bZ();
/*      */ 
/*      */                 
/* 3213 */                 if (bool3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 3227 */                 if (f.b(100) > 50) {
/*      */                   
/* 3229 */                   r.a(this.bp);
/*      */                   
/* 3231 */                   if (this.bp.size() != 0)
/*      */                   {
/* 3233 */                     c1 = this.bp.get((new Random())
/* 3234 */                         .nextInt(this.bp.size()));
/*      */                   }
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 3247 */                 boolean bool4 = false;
/*      */ 
/*      */                 
/* 3250 */                 s s = r.a(c1);
/* 3251 */                 if (s != null) {
/*      */                   
/* 3253 */                   if (s.n((af)r))
/*      */                   {
/* 3255 */                     bool4 = true;
/*      */                   }
/*      */                   
/* 3258 */                   if (s.e() == u.g)
/*      */                   {
/* 3260 */                     bool4 = true;
/*      */                   }
/*      */                   
/* 3263 */                   if (!s.a((af)r))
/*      */                   {
/* 3265 */                     bool4 = true;
/*      */                   }
/*      */ 
/*      */                   
/* 3269 */                   if (!s.a((af)r, false))
/*      */                   {
/* 3271 */                     bool4 = true;
/*      */                   
/*      */                   }
/*      */                 }
/*      */                 else {
/*      */                   
/* 3277 */                   bool4 = true;
/*      */                 } 
/*      */                 
/* 3280 */                 if (!bool4) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 3287 */                   a(r, c1);
/*      */ 
/*      */                   
/* 3290 */                   g g = s.y();
/* 3291 */                   boolean bool5 = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 3302 */                   a(r, g, bool5);
/*      */ 
/*      */                   
/* 3305 */                   this.aA = 900.0F;
/* 3306 */                   this.aB = 0.0F;
/*      */ 
/*      */                   
/* 3309 */                   if (!bool) {
/*      */                     break;
/*      */                   }
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 3316 */                   if (j(40000)) {
/*      */                     
/* 3318 */                     if (f.b(100) > 95) {
/*      */                       break;
/*      */                     }
/*      */ 
/*      */                     
/*      */                     continue;
/*      */                   } 
/*      */                   
/* 3326 */                   if (f.b(100) > 80) {
/*      */                     break;
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
/*      */   public boolean a(r paramr, s params) {
/* 3354 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 3358 */     if (params.a((af)paramr) && params.a((af)paramr, false)) {
/*      */       
/* 3360 */       e e = l.bN.a(this);
/* 3361 */       e.a(paramr);
/* 3362 */       e.a(params.w());
/*      */       
/* 3364 */       return true;
/*      */     } 
/*      */     
/* 3367 */     return false;
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
/*      */   public void af() {
/* 3387 */     for (o o : this.aU) {
/*      */       
/* 3389 */       if (o instanceof i)
/*      */       {
/* 3391 */         ((i)o).t();
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3398 */     for (o o : this.aU) {
/*      */       
/* 3400 */       for (o o1 : this.aU) {
/*      */         
/* 3402 */         if (o != o1)
/*      */         {
/* 3404 */           if (o.Q == o1.Q) {
/*      */             
/* 3406 */             l.a("Id overlap on:" + o.Q);
/* 3407 */             l.a("zone x:" + o.S);
/* 3408 */             l.a("zone y:" + o.T);
/* 3409 */             l.a("zone radius:" + o.U);
/* 3410 */             l.a("zone type:" + o.getClass().getName());
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3419 */     byte b1 = 0;
/* 3420 */     for (o o : this.aU) {
/*      */       
/* 3422 */       if (o instanceof i)
/*      */       {
/* 3424 */         b1++;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 3430 */     byte b2 = 0;
/*      */     
/* 3432 */     for (o o : this.aU) {
/*      */       
/* 3434 */       if (o instanceof i)
/*      */       {
/*      */         
/* 3437 */         for (o o1 : this.aU) {
/*      */           
/* 3439 */           if (o1 instanceof i && o != o1) {
/*      */ 
/*      */             
/* 3442 */             float f1 = f.a(o.S, o.T, o1.S, o1.T);
/*      */             
/* 3444 */             if (f1 < 400.0F)
/*      */             {
/* 3446 */               b2++;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3456 */     if (b2 > 0)
/*      */     {
/* 3458 */       d("baseOverlapCount:" + b2);
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
/*      */   public void a(r paramr) {
/* 3470 */     if (paramr.bB == this)
/*      */     {
/* 3472 */       this.bm.a(paramr);
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
/*      */   public void i(float paramFloat) {
/* 3485 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3495 */     this.bm.a();
/*      */ 
/*      */     
/* 3498 */     for (o o : this.aU) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3509 */       if (o instanceof h) {
/*      */         
/* 3511 */         h h = (h)o;
/*      */         
/* 3513 */         h.a(paramFloat);
/*      */       } 
/*      */     } 
/*      */     
/* 3517 */     if (this.aO != null)
/*      */     {
/*      */       
/* 3520 */       for (o o : this.aU) {
/*      */         
/* 3522 */         if (this.aO.a(o.S, o.T)) {
/*      */           
/* 3524 */           if (o instanceof i) {
/*      */             
/* 3526 */             o.k();
/*      */             
/*      */             break;
/*      */           } 
/*      */           
/* 3531 */           if (o instanceof g) {
/*      */             
/* 3533 */             PointF pointF = this.aO.a(o.S, o.T, o.U + 20.0F);
/* 3534 */             o.S = pointF.a;
/* 3535 */             o.T = pointF.b;
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
/* 3547 */     this.aF = f.a(this.aF, paramFloat);
/*      */     
/* 3549 */     byte b1 = 0;
/* 3550 */     for (o o : this.aV) {
/*      */       
/* 3552 */       if (o instanceof i)
/*      */       {
/* 3554 */         b1++;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 3559 */     if (b1 < 1) {
/*      */ 
/*      */       
/* 3562 */       for (af af : af.bj) {
/*      */         
/* 3564 */         if (af.bB == this)
/*      */         {
/* 3566 */           if (af instanceof com.corrodinggames.rts.game.units.d.d) {
/*      */ 
/*      */             
/* 3569 */             i i1 = new i(this, af.dH, af.dI);
/* 3570 */             i1.U = 420.0F;
/* 3571 */             i1.b = j.c;
/* 3572 */             i1.c = k.a;
/* 3573 */             b1++;
/*      */             
/*      */             break;
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 3580 */       if (b1 < 1)
/*      */       {
/*      */         
/* 3583 */         for (af af : af.bj) {
/*      */           
/* 3585 */           if (af.bB == this)
/*      */           {
/* 3587 */             if (this.bh.b(af.r())) {
/*      */ 
/*      */               
/* 3590 */               i i1 = new i(this, af.dH, af.dI);
/* 3591 */               i1.U = 420.0F;
/* 3592 */               i1.b = j.c;
/* 3593 */               i1.c = k.a;
/* 3594 */               b1++;
/*      */ 
/*      */               
/*      */               break;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/* 3603 */       if (b1 < 1)
/*      */       {
/* 3605 */         for (af af : af.bj) {
/*      */           
/* 3607 */           if (af.bB == this)
/*      */           {
/* 3609 */             if (af instanceof r) {
/*      */               
/* 3611 */               r r1 = (r)af;
/*      */               
/* 3613 */               boolean bool = false;
/* 3614 */               for (e e : this.bh.c) {
/*      */                 
/* 3616 */                 if (r1.b(e.a, true)) {
/*      */                   
/* 3618 */                   bool = true;
/*      */                   
/*      */                   break;
/*      */                 } 
/*      */               } 
/* 3623 */               if (bool) {
/*      */ 
/*      */                 
/* 3626 */                 i i1 = new i(this, af.dH, af.dI);
/* 3627 */                 i1.U = 420.0F;
/* 3628 */                 i1.b = j.c;
/* 3629 */                 i1.c = k.a;
/* 3630 */                 b1++;
/*      */                 
/*      */                 break;
/*      */               } 
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/* 3638 */       if (b1 < 1)
/*      */       {
/* 3640 */         for (af af : af.bj) {
/*      */           
/* 3642 */           if (af.bB == this)
/*      */           {
/* 3644 */             if (af instanceof r) {
/*      */               
/* 3646 */               r r1 = (r)af;
/*      */               
/* 3648 */               if (r1.ag()) {
/*      */ 
/*      */                 
/* 3651 */                 i i1 = new i(this, af.dH, af.dI);
/* 3652 */                 i1.U = 420.0F;
/* 3653 */                 i1.b = j.c;
/* 3654 */                 i1.c = k.a;
/* 3655 */                 b1++;
/*      */ 
/*      */                 
/*      */                 break;
/*      */               } 
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 3666 */       for (byte b = 0; b < l.bt.w.size(); b++) {
/*      */         
/* 3668 */         Point point = l.bt.w.get(b);
/*      */         
/* 3670 */         l.bt.a(point.a, point.b);
/* 3671 */         this.aW.a(l.bt.M, l.bt.N);
/* 3672 */         PointF pointF = this.aW;
/*      */         
/* 3674 */         pointF.b += l.bt.l;
/*      */         
/* 3676 */         if (b(pointF.a, pointF.b) == null)
/*      */         {
/* 3678 */           if (b(pointF))
/*      */           {
/* 3680 */             if (a(this.bj, pointF.a, pointF.b, 200) >= 1) {
/*      */               
/* 3682 */               i i1 = new i(this, pointF.a, pointF.b);
/* 3683 */               i1.U = 360.0F;
/* 3684 */               i1.b = j.a;
/* 3685 */               i1.c = k.b;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3707 */     r r = null;
/* 3708 */     i i = null;
/*      */ 
/*      */     
/* 3711 */     af[] arrayOfAf = af.bj.a(); byte b2; int j;
/* 3712 */     for (b2 = 0, j = af.bj.size(); b2 < j; b2++) {
/*      */       
/* 3714 */       af af = arrayOfAf[b2];
/*      */       
/* 3716 */       if (af.bB == this && af.cp == null)
/*      */       {
/* 3718 */         if (af instanceof r && af.ah() && i(af)) {
/*      */           
/* 3720 */           r r1 = (r)af;
/*      */ 
/*      */           
/* 3723 */           i i1 = e((af)r1);
/*      */ 
/*      */ 
/*      */           
/* 3727 */           if (i1 != null) {
/*      */ 
/*      */             
/* 3730 */             if (r1.ao())
/*      */             {
/* 3732 */               r = r1;
/* 3733 */               i = i1;
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */           
/*      */           }
/* 3740 */           else if (r1.ao()) {
/*      */             
/* 3742 */             i i2 = f((af)r1);
/*      */ 
/*      */             
/* 3745 */             if (i2 != null) {
/*      */               
/* 3747 */               PointF pointF = i2.w();
/*      */               
/* 3749 */               e e = l.bN.a(this);
/* 3750 */               e.a(r1);
/* 3751 */               e.a(pointF.a, pointF.b);
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
/*      */ 
/*      */     
/* 3767 */     for (b2 = 0, j = af.bj.size(); b2 < j; b2++) {
/*      */       
/* 3769 */       af af = arrayOfAf[b2];
/*      */       
/* 3771 */       if (af.bB == this)
/*      */       {
/* 3773 */         if (af instanceof r) {
/*      */           
/* 3775 */           r r1 = (r)af;
/*      */           
/* 3777 */           if (r1.M > 2400.0F && i((af)r1)) {
/*      */ 
/*      */             
/* 3780 */             if (r1.aC && r1.M < 24000.0F) {
/*      */               continue;
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3787 */             e e = l.bN.a(this);
/* 3788 */             e.a(r1);
/* 3789 */             e.h();
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 3797 */           if (r1.ah() && i((af)r1)) {
/*      */             
/* 3799 */             an an = r1.ap();
/* 3800 */             if (an != null)
/*      */             {
/* 3802 */               if (an.d() == ao.c)
/*      */               {
/* 3804 */                 if (r1.M > 700.0F) {
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 3809 */                   e e = l.bN.a(this);
/* 3810 */                   e.a(r1);
/* 3811 */                   e.h();
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
/*      */       continue;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 3827 */     if (!this.J) {
/*      */ 
/*      */ 
/*      */       
/* 3831 */       Z();
/*      */       
/* 3833 */       b2 = 1;
/*      */       
/* 3835 */       boolean bool = U();
/* 3836 */       boolean bool1 = true;
/*      */       
/* 3838 */       if (bool) {
/*      */         
/* 3840 */         b2++;
/* 3841 */         bool1 = false;
/*      */       } 
/*      */       
/* 3844 */       if (this.ah > 6)
/*      */       {
/* 3846 */         b2 = 2;
/*      */       }
/* 3848 */       if (this.ah > 11)
/*      */       {
/* 3850 */         b2 = 3;
/*      */       }
/*      */       
/* 3853 */       if (this.al < b2) {
/*      */         
/* 3855 */         g g = new g(this, false);
/* 3856 */         g.z = 8;
/*      */         
/* 3858 */         if (R())
/*      */         {
/* 3860 */           g.z = 10;
/*      */         }
/* 3862 */         g.f();
/*      */         
/* 3864 */         this.ae++;
/*      */       } 
/*      */       
/* 3867 */       if (this.am >= b2 || this.an > 6)
/*      */       {
/* 3869 */         if (this.aj < 1 && bool1) {
/*      */           
/* 3871 */           g g = new g(this, true);
/*      */           
/* 3873 */           if (this.ad < 2) {
/*      */             
/* 3875 */             g.z = 3;
/*      */           }
/* 3877 */           else if (this.ad < 5) {
/*      */             
/* 3879 */             g.z = 5;
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 3884 */             g.z = 7;
/* 3885 */             if (R())
/*      */             {
/*      */               
/* 3888 */               if (this.ad < 25) {
/*      */                 
/* 3890 */                 g.z = 14;
/*      */               }
/*      */               else {
/*      */                 
/* 3894 */                 g.z = 18;
/*      */               } 
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 3901 */           g.f();
/*      */           
/* 3903 */           this.ad++;
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 3909 */       if (W() && this.ak < 1 && bool1) {
/*      */         
/* 3911 */         g g = new g(this, true);
/* 3912 */         g.A = true;
/*      */         
/* 3914 */         g.z = 5;
/*      */         
/* 3916 */         if (R())
/*      */         {
/* 3918 */           g.z = 10;
/*      */         }
/* 3920 */         g.f();
/*      */       } 
/*      */ 
/*      */       
/* 3924 */       if (X())
/*      */       {
/* 3926 */         if (this.ao < 3) {
/*      */           
/* 3928 */           n n = new n(this);
/* 3929 */           n.l = 1;
/* 3930 */           n.f();
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3938 */     if (this.J) {
/*      */       
/* 3940 */       if (this.aF > 30.0F) this.aF = 30.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3945 */       if (this.aF == 0.0F) {
/*      */         
/* 3947 */         this.aE++;
/*      */         
/* 3949 */         if (this.aE == 1) {
/*      */           
/* 3951 */           this.aF = 1000.0F;
/*      */         
/*      */         }
/* 3954 */         else if (this.aE == 2) {
/*      */ 
/*      */           
/* 3957 */           this.aF = 3000.0F;
/*      */ 
/*      */           
/* 3960 */           af af = ah();
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 3965 */           if (af != null)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3971 */             if (this.J) {
/*      */               
/* 3973 */               j = 0;
/*      */             }
/*      */             else {
/*      */               
/* 3977 */               j = 2;
/* 3978 */               if (this.aJ < 4)
/*      */               {
/* 3980 */                 j = 5;
/*      */               }
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3990 */             e e = l.bN.a(this);
/*      */             byte b;
/*      */             int k;
/* 3993 */             for (b = 0, k = af.bj.size(); b < k; b++) {
/*      */               
/* 3995 */               af af1 = arrayOfAf[b];
/*      */               
/* 3997 */               if (af1.bB == this)
/*      */               {
/* 3999 */                 if (af1 instanceof r) {
/*      */                   
/* 4001 */                   r r1 = (r)af1;
/*      */                   
/* 4003 */                   if (!r1.br)
/*      */                   {
/* 4005 */                     if (b((af)r1, af))
/*      */                     {
/* 4007 */                       if (j <= 0) {
/*      */                         
/* 4009 */                         e.a(r1);
/*      */                       }
/*      */                       else {
/*      */                         
/* 4013 */                         j--;
/*      */                       } 
/*      */                     }
/*      */                   }
/*      */                 } 
/*      */               }
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 4025 */             e.b(af.dH, af.dI);
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 4033 */           this.aE = 0;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean i(af paramaf) {
/* 4117 */     if (paramaf.o_() || paramaf.t())
/*      */     {
/* 4119 */       return false;
/*      */     }
/* 4121 */     if (paramaf.cE())
/*      */     {
/* 4123 */       return false;
/*      */     }
/*      */     
/* 4126 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public af ag() {
/* 4132 */     af af = null;
/* 4133 */     byte b = 0;
/*      */     
/* 4135 */     af[] arrayOfAf = af.bj.a(); int i, j;
/* 4136 */     for (i = 0, j = af.bj.size(); i < j; i++) {
/*      */       
/* 4138 */       af af1 = arrayOfAf[i];
/*      */       
/* 4140 */       if (!af1.bz && af1.cp == null)
/*      */       {
/* 4142 */         if (this == af1.bB)
/*      */         {
/* 4144 */           if (h(af1))
/*      */           {
/* 4146 */             b++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 4152 */     i = (int)(Math.random() * b);
/*      */     
/* 4154 */     j = 0;
/* 4155 */     for (af af1 : af.bj) {
/*      */       
/* 4157 */       if (!af1.bz && af1.cp == null)
/*      */       {
/* 4159 */         if (this == af1.bB)
/*      */         {
/* 4161 */           if (h(af1)) {
/*      */             
/* 4163 */             if (j == i) {
/*      */               
/* 4165 */               af = af1;
/*      */               break;
/*      */             } 
/* 4168 */             j++;
/*      */           } 
/*      */         }
/*      */       }
/*      */     } 
/* 4173 */     return af;
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
/*      */   
/*      */   public af ah() {
/* 4194 */     af af = null;
/*      */ 
/*      */     
/* 4197 */     byte b = 0;
/*      */ 
/*      */     
/* 4200 */     af[] arrayOfAf = af.bj.a(); int i, j;
/* 4201 */     for (i = 0, j = af.bj.size(); i < j; i++) {
/*      */       
/* 4203 */       af af1 = arrayOfAf[i];
/*      */       
/* 4205 */       if (!af1.bz && af1.cp == null && !af1.o_())
/*      */       {
/* 4207 */         if (c(af1.bB) && j(af1))
/*      */         {
/* 4209 */           b++;
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4217 */     i = (int)(Math.random() * b);
/*      */     
/* 4219 */     j = 0;
/* 4220 */     for (af af1 : af.bj) {
/*      */       
/* 4222 */       if (!af1.bz && af1.cp == null && !af1.o_())
/*      */       {
/* 4224 */         if (c(af1.bB) && j(af1)) {
/*      */           
/* 4226 */           if (j == i) {
/*      */             
/* 4228 */             af = af1;
/*      */             break;
/*      */           } 
/* 4231 */           j++;
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 4237 */     return af;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static af a(m paramm, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 4244 */     float f1 = paramFloat3;
/*      */     
/* 4246 */     af[] arrayOfAf = af.bj.a(); byte b; int i;
/* 4247 */     for (b = 0, i = af.bj.size(); b < i; b++) {
/*      */       
/* 4249 */       af af = arrayOfAf[b];
/*      */       
/* 4251 */       if (af.dH + f1 > paramFloat1 && af.dH - f1 < paramFloat1 && af.dI + f1 > paramFloat2 && af.dI - f1 < paramFloat2)
/*      */       {
/*      */         
/* 4254 */         if (af.bB != paramm && a(af, paramFloat1, paramFloat2, paramFloat3) && af.bB.c(paramm))
/*      */         {
/* 4256 */           return af;
/*      */         }
/*      */       }
/*      */     } 
/* 4260 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static int a(m paramm, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean) {
/* 4265 */     byte b1 = 0;
/* 4266 */     float f1 = paramFloat3;
/*      */     
/* 4268 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 4269 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 4271 */       af af = arrayOfAf[b2];
/*      */       
/* 4273 */       if (af.dH + f1 > paramFloat1 && af.dH - f1 < paramFloat1 && af.dI + f1 > paramFloat2 && af.dI - f1 < paramFloat2)
/*      */       {
/*      */         
/* 4276 */         if (af.bB != paramm && a(af, paramFloat1, paramFloat2, paramFloat3) && af.bB.d(paramm))
/*      */         {
/* 4278 */           if (!paramBoolean || af.bw())
/*      */           {
/* 4280 */             b1++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/* 4285 */     return b1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static int b(m paramm, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 4290 */     byte b1 = 0;
/* 4291 */     float f1 = paramFloat3;
/*      */     
/* 4293 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 4294 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 4296 */       af af = arrayOfAf[b2];
/*      */       
/* 4298 */       if (af.dH + f1 > paramFloat1 && af.dH - f1 < paramFloat1 && af.dI + f1 > paramFloat2 && af.dI - f1 < paramFloat2)
/*      */       {
/*      */         
/* 4301 */         if (af.bB != paramm && a(af, paramFloat1, paramFloat2, paramFloat3) && af.bB.c(paramm))
/*      */         {
/* 4303 */           b1++;
/*      */         }
/*      */       }
/*      */     } 
/* 4307 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(d paramd, float paramFloat1, float paramFloat2, int paramInt) {
/* 4313 */     int i = 0;
/* 4314 */     for (e e : paramd.c)
/*      */     {
/* 4316 */       i += a(e.a, paramFloat1, paramFloat2, paramInt);
/*      */     }
/* 4318 */     return i;
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(al paramal, float paramFloat1, float paramFloat2, int paramInt) {
/* 4323 */     byte b1 = 0;
/*      */     
/* 4325 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 4326 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 4328 */       af af = arrayOfAf[b2];
/*      */       
/* 4330 */       if (af.bB == this)
/*      */       {
/* 4332 */         if (af.db == paramal)
/*      */         {
/* 4334 */           if (a(af, paramFloat1, paramFloat2, paramInt))
/*      */           {
/* 4336 */             b1++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/* 4341 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int ai() {
/* 4347 */     byte b1 = 0;
/*      */     
/* 4349 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 4350 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*      */       
/* 4352 */       af af = arrayOfAf[b2];
/* 4353 */       b1++;
/*      */     } 
/* 4355 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void N() {
/* 4364 */     if (this.aI)
/*      */     {
/*      */       
/* 4367 */       if (ai() != 0) {
/*      */         
/* 4369 */         l.d("waking up AI");
/* 4370 */         this.aI = false;
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(af paramaf) {
/* 4379 */     if (!(paramaf instanceof r)) {
/*      */       return;
/*      */     }
/*      */     
/* 4383 */     r r = (r)paramaf;
/*      */ 
/*      */ 
/*      */     
/* 4387 */     if (r.as != null) {
/*      */       
/* 4389 */       r.as.a(r);
/* 4390 */       r.as = null;
/*      */     } 
/*      */     
/* 4393 */     if (r.ar != null) {
/*      */       
/* 4395 */       r.ar.b(r);
/* 4396 */       r.ar = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(r paramr, g paramg, boolean paramBoolean) {
/* 4407 */     if (paramr.as != null)
/*      */     {
/* 4409 */       paramr.as.a(paramr, paramg, paramBoolean);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean j(af paramaf) {
/* 4420 */     if (!paramaf.bS())
/*      */     {
/* 4422 */       if (c(paramaf.bB))
/*      */       {
/* 4424 */         return false;
/*      */       }
/*      */     }
/*      */     
/* 4428 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(g paramg, af paramaf) {
/* 4434 */     return a(paramg, paramaf, false);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(g paramg, af paramaf, boolean paramBoolean) {
/* 4440 */     return paramg.b(paramaf, false);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
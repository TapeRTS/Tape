/*      */ package com.corrodinggames.rts.gameFramework.d;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.ColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.PorterDuff;
/*      */ import android.graphics.PorterDuffColorFilter;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.view.Menu;
/*      */ import android.view.MenuItem;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.a.d;
/*      */ import com.corrodinggames.rts.a.e;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.d;
/*      */ import com.corrodinggames.rts.game.units.a.g;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.a.t;
/*      */ import com.corrodinggames.rts.game.units.a.u;
/*      */ import com.corrodinggames.rts.game.units.a.w;
/*      */ import com.corrodinggames.rts.game.units.a.y;
/*      */ import com.corrodinggames.rts.game.units.a.z;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.c;
/*      */ import com.corrodinggames.rts.game.units.custom.d.c;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.g;
/*      */ import com.corrodinggames.rts.game.units.custom.h;
/*      */ import com.corrodinggames.rts.game.units.custom.k;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.g.c;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.game.units.t;
/*      */ import com.corrodinggames.rts.gameFramework.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.ad;
/*      */ import com.corrodinggames.rts.gameFramework.b.e;
/*      */ import com.corrodinggames.rts.gameFramework.b.h;
/*      */ import com.corrodinggames.rts.gameFramework.bi;
/*      */ import com.corrodinggames.rts.gameFramework.e;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.n;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import com.corrodinggames.rts.gameFramework.w;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class a
/*      */   extends bi
/*      */ {
/*      */   f a;
/*      */   l b;
/*      */   public boolean c = false;
/*      */   public boolean d = false;
/*      */   public boolean e;
/*      */   public float f;
/*   88 */   Paint g = new Paint();
/*   89 */   Paint h = new Paint();
/*   90 */   Paint i = new Paint();
/*   91 */   Paint j = new Paint();
/*   92 */   Paint k = new Paint();
/*      */   
/*   94 */   Paint l = new Paint();
/*   95 */   Paint m = new Paint();
/*      */ 
/*      */   
/*      */   q n;
/*      */ 
/*      */   
/*      */   q o;
/*      */   
/*  103 */   Paint p = new Paint();
/*      */   
/*      */   Paint q;
/*      */   
/*      */   Paint r;
/*      */   Paint s;
/*      */   Paint t;
/*      */   Paint u;
/*      */   Paint v;
/*  112 */   Rect w = new Rect();
/*  113 */   RectF x = new RectF();
/*      */   
/*  115 */   Rect y = new Rect();
/*      */   
/*  117 */   Rect z = new Rect();
/*  118 */   RectF A = new RectF();
/*  119 */   RectF B = new RectF();
/*  120 */   Rect C = new Rect();
/*      */   
/*  122 */   RectF D = new RectF();
/*      */   
/*  124 */   Rect E = new Rect();
/*  125 */   RectF F = new RectF();
/*      */   
/*      */   boolean G;
/*      */   
/*      */   float H;
/*      */   
/*      */   float I;
/*      */   
/*      */   float J;
/*      */   int K;
/*      */   boolean L;
/*      */   float M;
/*      */   float N;
/*      */   float O;
/*      */   float P;
/*      */   float Q;
/*      */   float R;
/*      */   int S;
/*      */   float T;
/*      */   float U;
/*  145 */   e V = null;
/*  146 */   e W = null;
/*  147 */   e X = null;
/*  148 */   e Y = null;
/*  149 */   e Z = null;
/*      */   
/*  151 */   static Paint aa = new Paint();
/*  152 */   static PorterDuffColorFilter ab = new PorterDuffColorFilter(Color.a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
/*      */   
/*      */   af ac;
/*      */   
/*      */   s ad;
/*      */   
/*      */   float ae;
/*      */   
/*      */   long af;
/*      */   
/*      */   float ag;
/*      */   
/*      */   float ah;
/*      */   
/*      */   String ai;
/*      */   String aj;
/*      */   String ak;
/*      */   String al;
/*      */   String am;
/*      */   public String an;
/*  172 */   String ao = null;
/*  173 */   float ap = 0.0F;
/*      */   
/*      */   public float aq;
/*      */   public boolean ar;
/*  177 */   ArrayList as = new ArrayList();
/*  178 */   y at = new y(false);
/*  179 */   y au = new y(true);
/*  180 */   d av = new d();
/*  181 */   ArrayList aw = new ArrayList();
/*  182 */   ArrayList ax = new ArrayList(); m ay;
/*      */   ArrayList az;
/*      */   RectF aA;
/*      */   HashMap aB;
/*      */   ArrayList aC;
/*      */   Rect aD;
/*      */   float aE;
/*      */   ArrayList aF;
/*      */   boolean aG;
/*      */   float aH;
/*      */   float aI;
/*      */   int aJ;
/*      */   
/*      */   public void a() {
/*  196 */     this.ai = com.corrodinggames.rts.gameFramework.e.a.a("gui.unselectall", new Object[0]);
/*  197 */     this.aj = com.corrodinggames.rts.gameFramework.e.a.a("gui.common.allyUnit", new Object[0]);
/*  198 */     this.ak = com.corrodinggames.rts.gameFramework.e.a.a("gui.common.enemyUnit", new Object[0]);
/*  199 */     this.al = com.corrodinggames.rts.gameFramework.e.a.a("gui.common.neutralUnit", new Object[0]);
/*  200 */     this.am = com.corrodinggames.rts.gameFramework.e.a.a("gui.infoText.ownedBy", new Object[0]);
/*  201 */     this.an = com.corrodinggames.rts.gameFramework.e.a.a("gui.infoText.unitCapReached", new Object[0]);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/*  207 */     a();
/*      */     
/*  209 */     this.V = this.b.bw.a(R.drawable.zoom_button);
/*  210 */     this.W = this.b.bw.a(R.drawable.lock_icon_menu);
/*  211 */     this.X = this.b.bw.a(R.drawable.pause);
/*  212 */     this.Y = this.b.bw.a(R.drawable.replay_pause);
/*  213 */     this.Z = this.b.bw.a(R.drawable.fast);
/*      */     
/*  215 */     aa.a(255, 30, 30, 30);
/*  216 */     aa.a((ColorFilter)ab);
/*  217 */     aa.d(true);
/*      */     
/*  219 */     this.q = new Paint();
/*  220 */     this.q.a(true);
/*  221 */     this.q.a(Paint.Align.b);
/*  222 */     this.q.a(255, 0, 255, 0);
/*  223 */     this.b.a(this.q, 34.0F);
/*      */     
/*  225 */     this.r = new Paint();
/*  226 */     this.r.a(true);
/*  227 */     this.r.a(Paint.Align.b);
/*  228 */     this.r.a(255, 255, 0, 0);
/*  229 */     this.b.a(this.r, 32.0F);
/*      */     
/*  231 */     this.s = new Paint();
/*  232 */     this.s.a(true);
/*  233 */     this.s.a(Paint.Align.a);
/*  234 */     this.s.a(255, 0, 255, 0);
/*  235 */     this.b.a(this.s, 16.0F);
/*      */     
/*  237 */     this.t = new Paint();
/*  238 */     this.t.a(true);
/*  239 */     this.t.a(Paint.Align.c);
/*  240 */     this.t.a(255, 0, 255, 0);
/*  241 */     this.b.a(this.t, 16.0F);
/*      */     
/*  243 */     this.u = new Paint();
/*  244 */     this.u.a(255, 255, 255, 255);
/*  245 */     this.u.a(Paint.Align.a);
/*  246 */     this.u.c(true);
/*  247 */     this.u.a(true);
/*      */     
/*  249 */     this.v = new Paint();
/*  250 */     this.v.a(255, 255, 255, 255);
/*  251 */     this.v.a(Paint.Align.a);
/*  252 */     this.v.c(true);
/*  253 */     this.v.a(true);
/*      */ 
/*      */     
/*  256 */     this.n = new q();
/*  257 */     this.n.b(Color.a(190, 255, 255, 255));
/*  258 */     this.n.n();
/*      */ 
/*      */     
/*  261 */     this.o = new q();
/*  262 */     this.o.b(Color.a(133, 255, 255, 255));
/*  263 */     this.o.n();
/*      */ 
/*      */     
/*  266 */     this.aC.clear();
/*  267 */     for (byte b = 0; b < 10; b++)
/*      */     {
/*  269 */       this.aC.add(new v(this, (b < 3)));
/*      */     }
/*      */     
/*  272 */     l();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private float r() {
/*  279 */     float f1 = 4.6F / this.b.cF;
/*      */     
/*  281 */     if (f1 > 4.6F) f1 = 4.6F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  288 */     return f1;
/*      */   }
/*      */ 
/*      */   
/*      */   private float s() {
/*  293 */     return t() / this.b.cF;
/*      */   }
/*      */ 
/*      */   
/*      */   private float t() {
/*  298 */     if (this.b.cm / this.b.bt.f() < this.b.co / this.b.bt.g())
/*      */     {
/*  300 */       return this.b.cm / this.b.bt.f();
/*      */     }
/*      */ 
/*      */     
/*  304 */     return this.b.co / this.b.bt.g();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void a(float paramFloat) {
/*  311 */     if (this.b.by.showZoomButton) {
/*      */       
/*  313 */       float f1 = this.b.bQ * 0.7F;
/*      */       
/*  315 */       int i = (int)(50.0F * f1);
/*  316 */       int j = (int)this.b.bW;
/*      */ 
/*      */       
/*  319 */       if (this.G) {
/*      */ 
/*      */         
/*  322 */         this.w.a(i - 4, (int)(j - 50.0F * this.b.bQ), i + 4, (int)(j + 50.0F * this.b.bQ));
/*  323 */         this.i.a();
/*  324 */         this.i.b(Color.a(255, 0, 0, 0));
/*  325 */         this.b.bw.b(this.w, this.i);
/*      */       } 
/*      */       
/*  328 */       float f2 = j;
/*      */       
/*  330 */       if (this.b.cC > 1.0F) {
/*      */         
/*  332 */         f2 -= (this.b.cC - 1.0F) * 3.0F * this.b.bQ;
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  338 */         float f7 = 20.0F;
/*      */         
/*  340 */         f2 += (this.b.cC * -f7 + f7 + 1.0F) * this.b.bQ;
/*      */       } 
/*      */       
/*  343 */       float f3 = 48.0F * f1;
/*  344 */       float f4 = 54.0F * f1;
/*  345 */       float f5 = f3 / 2.0F;
/*  346 */       float f6 = f4 / 2.0F;
/*      */       
/*  348 */       if (f2 < f6)
/*      */       {
/*  350 */         f2 = f6;
/*      */       }
/*  352 */       if (f2 > this.b.bT - f6)
/*      */       {
/*  354 */         f2 = (int)(this.b.bT - f6);
/*      */       }
/*      */       
/*  357 */       this.w.a((int)(i - f5), (int)(f2 - f6), (int)(i + f5), (int)(f2 + f6));
/*      */ 
/*      */       
/*  360 */       if (!this.G) {
/*      */         
/*  362 */         aa.a(140, 215, 215, 215);
/*      */       }
/*      */       else {
/*      */         
/*  366 */         aa.a(255, 255, 255, 255);
/*      */       } 
/*      */       
/*  369 */       this.b.bw.a(this.V, this.w.a, this.w.b, aa, 0.0F, f1);
/*      */       
/*  371 */       boolean bool = this.G;
/*      */ 
/*      */       
/*  374 */       if (!this.G)
/*      */       {
/*  376 */         if (this.a.a(this.w.a, this.w.b, this.w.b(), this.w.c(), g.b)) {
/*      */           
/*  378 */           this.G = true;
/*  379 */           this.H = this.a.t;
/*      */         } 
/*      */       }
/*      */       
/*  383 */       if (!this.a.D)
/*      */       {
/*  385 */         this.G = false;
/*      */       }
/*      */ 
/*      */       
/*  389 */       if (this.G) {
/*      */         
/*  391 */         this.I += paramFloat;
/*  392 */         this.a.d();
/*  393 */         float f7 = this.a.t - this.H;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  398 */         if (f7 > 180.0F) f7 = 180.0F; 
/*  399 */         if (f7 < -180.0F) f7 = -180.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  404 */         f7 *= this.b.cC;
/*      */ 
/*      */         
/*  407 */         if (f7 > 2.0F) {
/*      */           
/*  409 */           this.b.cC -= 5.0E-4F * f.c(f7) * paramFloat;
/*      */           
/*  411 */           this.b.cD = false;
/*      */           
/*  413 */           if (this.b.cC < s())
/*      */           {
/*  415 */             this.b.cC = s();
/*  416 */             this.b.cD = true;
/*      */           }
/*      */         
/*  419 */         } else if (f7 < -2.0F) {
/*      */           
/*  421 */           this.b.cC += 5.0E-4F * f.c(f7) * paramFloat;
/*      */           
/*  423 */           this.b.cD = false;
/*      */           
/*  425 */           if (this.b.cC > r())
/*      */           {
/*  427 */             this.b.cC = r();
/*  428 */             this.b.cD = true;
/*      */           }
/*      */         
/*      */         } 
/*      */       } else {
/*      */         
/*  434 */         if (bool)
/*      */         {
/*      */           
/*  437 */           if (this.I < 12.0F);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  463 */         this.I = 0.0F;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  468 */     if (this.b.by.mouseSupport) {
/*      */ 
/*      */       
/*  471 */       if (this.a.a(this.b.W(), this.b.X()) && !this.a.G) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  476 */         int i = this.b.Z();
/*  477 */         if (i != 0)
/*      */         {
/*  479 */           this.J += i / 120.0F * 0.18F;
/*      */         }
/*      */         
/*  482 */         if (this.J > 1.0F)
/*      */         {
/*  484 */           this.J = 1.0F;
/*      */         }
/*  486 */         if (this.J < -1.0F)
/*      */         {
/*  488 */           this.J = -1.0F;
/*      */         }
/*      */       } 
/*      */       
/*  492 */       if (this.J != 0.0F) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  497 */         float f1 = 0.0032F * paramFloat;
/*      */         
/*  499 */         if (this.J < 0.0F)
/*      */         {
/*  501 */           f1 = -f1;
/*      */         }
/*  503 */         f1 += this.J * 0.18F * paramFloat;
/*      */ 
/*      */         
/*  506 */         float f2 = this.J;
/*  507 */         this.J = f.a(this.J, f.c(f1));
/*  508 */         if (this.J == 0.0F)
/*      */         {
/*  510 */           f1 = f2;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*  515 */         f1 *= this.b.cC;
/*      */ 
/*      */         
/*  518 */         this.b.cC += f1;
/*  519 */         this.b.cG = true;
/*  520 */         this.b.cH = this.b.W();
/*  521 */         this.b.cI = this.b.X();
/*      */         
/*  523 */         if (f1 != 0.0F)
/*      */         {
/*  525 */           this.b.cD = false;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  533 */     if (this.b.by.gestureZoom && this.b.T() && this.b.V() >= 3)
/*      */     {
/*  535 */       this.U = 20.0F;
/*      */     }
/*      */ 
/*      */     
/*  539 */     if (this.U < 10.0F)
/*      */     {
/*  541 */       this.L = false;
/*      */     }
/*      */ 
/*      */     
/*  545 */     if (this.U > 0.0F) {
/*      */       
/*  547 */       this.U = f.a(this.U, paramFloat);
/*      */ 
/*      */       
/*  550 */       boolean bool = (this.b.T() && this.b.V() >= 3) ? true : false;
/*      */ 
/*      */       
/*  553 */       this.a.aN = 3.0F;
/*      */       
/*  555 */       float f1 = 0.0F;
/*  556 */       float f2 = 0.0F;
/*  557 */       float f3 = 0.0F;
/*  558 */       if (bool) {
/*      */         byte b;
/*  560 */         for (b = 0; b < this.b.V(); b++) {
/*      */           
/*  562 */           f1 += this.b.b(b);
/*  563 */           f2 += this.b.c(b);
/*      */         } 
/*  565 */         f1 /= this.b.V();
/*  566 */         f2 /= this.b.V();
/*      */         
/*  568 */         f3 = 0.0F;
/*  569 */         for (b = 0; b < this.b.V(); b++)
/*      */         {
/*  571 */           float f4 = this.b.b(b);
/*  572 */           float f5 = this.b.c(b);
/*      */ 
/*      */           
/*  575 */           f3 += f.b(f1, f2, f4, f5);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  580 */         f1 = this.P;
/*  581 */         f2 = this.Q;
/*  582 */         f3 = this.R;
/*      */       } 
/*      */       
/*  585 */       if (this.L && this.S != this.b.V())
/*      */       {
/*  587 */         this.L = false;
/*      */       }
/*      */       
/*  590 */       if (!this.L && bool) {
/*      */         
/*  592 */         this.L = true;
/*      */         
/*  594 */         this.M = f1;
/*  595 */         this.N = f2;
/*  596 */         this.O = f3;
/*  597 */         this.T = this.b.cC;
/*      */         
/*  599 */         this.P = f1;
/*  600 */         this.Q = f2;
/*  601 */         this.R = f3;
/*      */         
/*  603 */         this.S = this.b.V();
/*      */       } 
/*      */       
/*  606 */       if (bool) {
/*      */         
/*  608 */         float f4 = this.Q - f2;
/*      */ 
/*      */         
/*  611 */         f4 *= 2.0F;
/*      */ 
/*      */         
/*  614 */         f4 *= this.b.cC;
/*      */ 
/*      */         
/*  617 */         this.b.cC += f4 / 250.0F / this.b.bQ;
/*      */         
/*  619 */         this.b.cD = false;
/*      */ 
/*      */         
/*  622 */         float f5 = this.R - f3;
/*      */ 
/*      */         
/*  625 */         boolean bool1 = false;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  630 */         if (bool1) {
/*      */           
/*  632 */           this.b.cC -= f5 / 350.0F / this.b.bQ;
/*  633 */           this.b.cD = false;
/*      */         } 
/*      */ 
/*      */         
/*  637 */         this.P = f1;
/*  638 */         this.Q = f2;
/*  639 */         this.R = f3;
/*  640 */         this.S = this.b.V();
/*      */ 
/*      */         
/*  643 */         for (byte b = 0; b < this.b.V(); b++) {
/*      */           
/*  645 */           float f7 = this.b.b(b);
/*  646 */           float f8 = this.b.c(b);
/*      */           
/*  648 */           this.b.bw.a(f1, f2, f7, f8, this.a.aG);
/*      */         } 
/*      */ 
/*      */         
/*  652 */         float f6 = 6.0F;
/*  653 */         this.b.bw.a(f1, f2, f1, this.N, this.a.aH);
/*  654 */         this.b.bw.a(f1, f2, f6, this.a.aG);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  663 */     if (this.b.cC > r()) {
/*      */       
/*  665 */       this.b.cC = r();
/*  666 */       this.b.cD = true;
/*      */     } 
/*  668 */     if (this.b.cC < s()) {
/*      */       
/*  670 */       this.b.cC = s();
/*  671 */       this.b.cD = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void b(float paramFloat) {
/*  681 */     this.e = false;
/*      */     
/*  683 */     boolean bool1 = false;
/*  684 */     boolean bool2 = false;
/*      */     
/*  686 */     boolean bool3 = false;
/*      */     
/*  688 */     byte b = 7;
/*      */     
/*  690 */     if (l.am())
/*      */     {
/*  692 */       b = 14;
/*      */     }
/*      */     
/*  695 */     if (this.b.T() && this.a.W == null) {
/*      */ 
/*      */       
/*  698 */       boolean bool = this.a.c(this.b);
/*      */       
/*  700 */       byte b1 = 1;
/*      */       
/*  702 */       if (this.b.by.mouseOrders == 2)
/*      */       {
/*  704 */         b1 = 2;
/*      */       }
/*      */       
/*  707 */       int i = this.b.f(b1);
/*      */       
/*  709 */       if (bool || (this.b.by.mouseSupport && i != -1 && !this.a.E && !this.a.F)) {
/*      */         
/*  711 */         float f1 = this.b.b(0);
/*  712 */         float f2 = this.b.c(0);
/*  713 */         if (i != -1) {
/*      */           
/*  715 */           f1 = this.b.b(i);
/*  716 */           f2 = this.b.c(i);
/*      */         } 
/*  718 */         if (!this.c) {
/*      */           
/*  720 */           bool2 = true;
/*  721 */           this.B.a = (int)f1;
/*  722 */           this.B.b = (int)f2;
/*      */         } 
/*  724 */         this.B.c = (int)f1;
/*  725 */         this.B.d = (int)f2;
/*      */ 
/*      */         
/*  728 */         if (Math.abs(this.B.a - this.B.c) > b || 
/*  729 */           Math.abs(this.B.b - this.B.d) > b)
/*      */         {
/*      */           
/*  732 */           this.d = true;
/*      */         }
/*      */ 
/*      */         
/*  736 */         bool1 = true;
/*      */       }
/*  738 */       else if (this.b.V() == 2 && this.U == 0.0F) {
/*      */         
/*  740 */         this.B.a = (int)this.b.b(0);
/*  741 */         this.B.b = (int)this.b.c(0);
/*  742 */         this.B.c = (int)this.b.b(1);
/*  743 */         this.B.d = (int)this.b.c(1);
/*  744 */         this.d = false;
/*  745 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/*  749 */       if (bool1) {
/*      */         
/*  751 */         this.f += paramFloat;
/*  752 */         if (this.f < 18.0F)
/*      */         {
/*  754 */           bool3 = true;
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/*  759 */         this.f = 0.0F;
/*      */       } 
/*      */       
/*  762 */       if (bool1) {
/*      */ 
/*      */         
/*  765 */         this.c = true;
/*      */         
/*  767 */         if (Math.abs(this.B.a - this.B.c) > b || 
/*  768 */           Math.abs(this.B.b - this.B.d) > b) {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  773 */           this.C.d = (int)this.B.d;
/*  774 */           this.C.b = (int)this.B.b;
/*  775 */           this.C.a = (int)this.B.a;
/*  776 */           this.C.c = (int)this.B.c;
/*      */           
/*  778 */           f.a(this.C);
/*  779 */           this.g.b(Color.a(255, 0, 255, 0));
/*  780 */           this.g.a(Paint.Style.b);
/*  781 */           this.g.a(1.0F);
/*  782 */           this.b.bw.b(this.C, this.g);
/*      */ 
/*      */           
/*  785 */           this.e = true;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  791 */     boolean bool4 = false;
/*  792 */     boolean bool5 = false;
/*      */     
/*  794 */     if (this.c && !bool1)
/*      */     {
/*      */       
/*  797 */       if (bool3 && this.b.V() == 3) {
/*      */         
/*  799 */         bool5 = true;
/*      */       }
/*      */       else {
/*      */         
/*  803 */         bool4 = true;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  810 */     if (bool5) {
/*      */       
/*  812 */       this.d = false;
/*  813 */       this.c = false;
/*      */     } 
/*      */     
/*  816 */     if ((bool1 && !bool3) || bool4) {
/*      */ 
/*      */ 
/*      */       
/*  820 */       if (bool2)
/*      */       {
/*  822 */         for (w w : w.dK) {
/*      */           
/*  824 */           if (w instanceof c) {
/*      */             
/*  826 */             c c = (c)w;
/*  827 */             c.ck = c.ci;
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*  833 */       if (bool4) {
/*      */         
/*  835 */         this.d = false;
/*  836 */         this.c = false;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  842 */       this.D.a(this.B);
/*      */       
/*  844 */       f.a(this.D);
/*      */       
/*  846 */       if (Math.abs(this.D.a - this.D.c) > b || 
/*  847 */         Math.abs(this.D.b - this.D.d) > b) {
/*      */ 
/*      */         
/*  850 */         this.D.d /= this.b.cE;
/*  851 */         this.D.b /= this.b.cE;
/*  852 */         this.D.a /= this.b.cE;
/*  853 */         this.D.c /= this.b.cE;
/*  854 */         this.D.a(this.b.cb, this.b.cc);
/*      */         
/*  856 */         this.a.aN = 4.0F;
/*  857 */         this.a.aO = 40.0F;
/*      */         
/*  859 */         this.a.O = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  869 */         boolean bool6 = this.a.a(this.b);
/*  870 */         boolean bool7 = this.a.b(this.b);
/*      */ 
/*      */         
/*  873 */         boolean bool8 = true;
/*  874 */         boolean bool9 = true;
/*      */         
/*  876 */         boolean bool10 = false;
/*      */         
/*  878 */         if (this.b.by.smartSelection_v2)
/*      */         {
/*  880 */           for (w w : w.dK) {
/*      */             
/*  882 */             if (w instanceof r) {
/*      */               
/*  884 */               r r1 = (r)w;
/*      */               
/*  886 */               if (a((c)r1)) {
/*      */ 
/*      */                 
/*  889 */                 if (bool6 && r1.ck) {
/*      */                   continue;
/*      */                 }
/*      */ 
/*      */                 
/*  894 */                 if (!r1.bw())
/*      */                 {
/*  896 */                   bool8 = false;
/*      */                 }
/*      */                 
/*  899 */                 if (r1.aO() && r1.l())
/*      */                 {
/*  901 */                   bool9 = false;
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  911 */         if (bool7)
/*      */         {
/*  913 */           bool8 = true;
/*      */         }
/*      */         
/*  916 */         for (w w : w.dK) {
/*      */           
/*  918 */           if (w instanceof c) {
/*      */             
/*  920 */             c c = (c)w;
/*      */             
/*  922 */             boolean bool = false;
/*      */             
/*  924 */             if (a(c)) {
/*      */               
/*  926 */               bool = true;
/*      */               
/*  928 */               if (!bool8 && c.bw())
/*      */               {
/*  930 */                 bool = false;
/*      */               }
/*      */               
/*  933 */               if (!bool9 && c.ai() && !c.l())
/*      */               {
/*  935 */                 bool = false;
/*      */               }
/*      */             } 
/*      */ 
/*      */             
/*  940 */             if (bool7) {
/*      */               
/*  942 */               if (bool)
/*      */               {
/*  944 */                 bool = !c.ck ? true : false;
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*  949 */               else if (c.ck)
/*      */               {
/*  951 */                 bool = true;
/*      */               }
/*      */             
/*      */             }
/*  955 */             else if (bool6) {
/*      */               
/*  957 */               if (c.ck)
/*      */               {
/*  959 */                 bool = true;
/*      */               }
/*      */             } 
/*      */             
/*  963 */             if (bool) {
/*      */               
/*  965 */               this.a.j((af)c);
/*      */ 
/*      */               
/*  968 */               if (bool4)
/*      */               {
/*      */                 
/*  971 */                 if (c.cj + 900 < this.b.bj)
/*      */                 {
/*      */ 
/*      */ 
/*      */                   
/*  976 */                   if ((!bool6 && !bool7) || !c.ck)
/*      */                   {
/*  978 */                     bool10 = true;
/*      */                   }
/*      */                 }
/*      */               }
/*      */               
/*      */               continue;
/*      */             } 
/*  985 */             this.a.l((af)c);
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  992 */         if (bool10)
/*      */         {
/*  994 */           for (w w : w.dK) {
/*      */             
/*  996 */             if (w instanceof c) {
/*      */               
/*  998 */               c c = (c)w;
/*      */               
/* 1000 */               c.cj = this.b.bj;
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1007 */         this.a.C();
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
/*      */   private boolean a(c paramc) {
/* 1021 */     if (!paramc.bz && paramc.cp == null) {
/*      */       
/* 1023 */       float f1 = paramc.dH;
/* 1024 */       float f2 = paramc.dI - paramc.dJ;
/*      */       
/* 1026 */       if (f2 <= 0.0F)
/*      */       {
/* 1028 */         f2 += paramc.dJ;
/*      */       }
/* 1030 */       if (this.D.b(f1, f2))
/*      */       {
/* 1032 */         if (this.a.m((af)paramc) || this.b.bb.b())
/*      */         {
/* 1034 */           if (!paramc.t())
/*      */           {
/* 1036 */             return true;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/* 1041 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String paramString, int paramInt) {
/* 1046 */     this.ao = paramString;
/* 1047 */     this.ap = paramInt;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(String paramString, int paramInt) {
/* 1052 */     if (this.ap <= 0.0F || paramString.equals(this.ao)) {
/*      */       
/* 1054 */       this.ao = paramString;
/* 1055 */       this.ap = paramInt;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(float paramFloat) {
/* 1061 */     if (this.ap > 0.0F && this.ao != null) {
/*      */       
/* 1063 */       this.ap = f.a(this.ap, paramFloat);
/* 1064 */       this.b.bw.a(this.ao, this.b.bV, this.b.bW, this.a.ax, this.a.aC, 8.0F);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean a(s params) {
/* 1070 */     l l1 = l.u();
/*      */     
/* 1072 */     return (l1.am && params.k_());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/* 1078 */     this.K = 0;
/*      */   }
/*      */   
/*      */   public ad a(s params, int paramInt, ArrayList paramArrayList) {
/* 1082 */     l l1 = l.u();
/*      */     
/* 1084 */     if (!l.al())
/*      */     {
/* 1086 */       return null;
/*      */     }
/*      */     
/* 1089 */     if (params.I() != null)
/*      */     {
/* 1091 */       return params.I();
/*      */     }
/*      */     
/* 1094 */     if (params instanceof com.corrodinggames.rts.game.units.a.n)
/*      */     {
/* 1096 */       return null;
/*      */     }
/*      */     
/* 1099 */     if (params instanceof d)
/*      */     {
/* 1101 */       return null;
/*      */     }
/*      */     
/* 1104 */     if (params.f() == t.b)
/*      */     {
/* 1106 */       return l1.bB.T;
/*      */     }
/*      */     
/* 1109 */     if (params.e() == u.m)
/*      */     {
/* 1111 */       return l1.bB.Q;
/*      */     }
/*      */     
/* 1114 */     if (params.e() == u.l)
/*      */     {
/* 1116 */       return l1.bB.P;
/*      */     }
/*      */ 
/*      */     
/* 1120 */     if (params.e() == u.e)
/*      */     {
/* 1122 */       return l1.bB.R;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1132 */     if (params.f() == t.c) {
/*      */       
/* 1134 */       byte b = 0;
/* 1135 */       for (s s1 : paramArrayList) {
/*      */         
/* 1137 */         if (s1 != params && s1.f() == t.c)
/*      */         {
/*      */           
/* 1140 */           if (this.a.b(s1))
/*      */           {
/* 1142 */             b++;
/*      */           }
/*      */         }
/*      */       } 
/*      */       
/* 1147 */       if (b == 0)
/*      */       {
/* 1149 */         return l1.bB.S;
/*      */       }
/*      */     } 
/*      */     
/* 1153 */     t t = params.f();
/*      */     
/* 1155 */     if (t == t.g || t == t.h || t == t.i)
/*      */     {
/*      */ 
/*      */       
/* 1159 */       return null;
/*      */     }
/*      */     
/* 1162 */     ad ad = null;
/*      */     
/* 1164 */     ad[] arrayOfAd = l1.bB.af;
/* 1165 */     if (this.K < arrayOfAd.length) {
/*      */       
/* 1167 */       ad = arrayOfAd[this.K];
/* 1168 */       this.K++;
/*      */     } 
/*      */     
/* 1171 */     return ad;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList d() {
/* 1178 */     this.aw.clear();
/*      */ 
/*      */     
/* 1181 */     af[] arrayOfAf = this.a.bF.a(); byte b; int i;
/* 1182 */     for (b = 0, i = this.a.bF.size(); b < i; b++) {
/*      */       
/* 1184 */       af af1 = arrayOfAf[b];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1193 */       al al = af1.r();
/*      */       
/* 1195 */       if (!this.aw.contains(al))
/*      */       {
/* 1197 */         this.aw.add(al);
/*      */       }
/*      */     } 
/*      */     
/* 1201 */     return this.aw;
/*      */   }
/*      */ 
/*      */   
/*      */   public ArrayList a(af paramaf, ArrayList<af> paramArrayList) {
/* 1206 */     int i = 0;
/*      */ 
/*      */     
/* 1209 */     this.as.clear();
/*      */     
/* 1211 */     int j = this.a.p();
/*      */     
/* 1213 */     if (j == 0) {
/*      */ 
/*      */ 
/*      */       
/* 1217 */       if (this.b.by.showChatAndPingShortcuts)
/*      */       {
/* 1219 */         if (this.b.F()) {
/*      */           
/* 1221 */           this.as.add(i, this.a.l);
/* 1222 */           this.as.add(i, this.a.m);
/*      */         } 
/*      */       }
/*      */       
/* 1226 */       return this.as;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1233 */     if (f.bw && paramaf != null && !(paramaf instanceof com.corrodinggames.rts.game.units.h)) {
/*      */       
/* 1235 */       this.as.add(this.at);
/* 1236 */       this.as.add(this.au);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1241 */     if (paramaf == null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1248 */     if (paramaf != null) {
/*      */ 
/*      */ 
/*      */       
/* 1252 */       i = this.as.size();
/*      */ 
/*      */ 
/*      */       
/* 1256 */       if (paramaf.ci)
/*      */       {
/*      */         
/* 1259 */         if (this.a.m(paramaf)) {
/*      */           
/* 1261 */           ArrayList arrayList = paramaf.M();
/* 1262 */           if (arrayList != null)
/*      */           {
/* 1264 */             this.as.addAll(arrayList);
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1271 */           ArrayList arrayList = paramaf.M();
/* 1272 */           if (arrayList != null)
/*      */           {
/* 1274 */             this.as.addAll(arrayList);
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*      */       byte b1;
/*      */       
/*      */       int n;
/*      */       
/* 1284 */       for (b1 = 0, n = paramArrayList.size(); b1 < n; b1++) {
/*      */         
/* 1286 */         af af2 = paramArrayList.get(b1);
/*      */         
/* 1288 */         if (this.a.m(af2))
/*      */         {
/*      */ 
/*      */           
/* 1292 */           if (af2.r() != paramaf.r() || af2.T() != paramaf.T()) {
/*      */             
/* 1294 */             ArrayList arrayList = af2.M();
/*      */             
/* 1296 */             if (arrayList != null)
/*      */             {
/* 1298 */               for (s s1 : arrayList) {
/*      */                 
/* 1300 */                 boolean bool1 = false;
/* 1301 */                 for (s s2 : this.as) {
/*      */                   
/* 1303 */                   if (s2.J().equals(s1.J()))
/*      */                   {
/* 1305 */                     bool1 = true;
/*      */                   }
/*      */                 } 
/*      */                 
/* 1309 */                 if (!bool1)
/*      */                 {
/* 1311 */                   this.as.add(s1);
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
/* 1324 */     boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int k;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1334 */     for (byte b = 0; b < k; b++) {
/*      */       
/* 1336 */       af af2 = paramArrayList.get(b);
/*      */       
/* 1338 */       if (this.a.m(af2))
/*      */       {
/* 1340 */         if (af2 instanceof r) {
/*      */           
/* 1342 */           r r1 = (r)af2;
/*      */           
/* 1344 */           if (!r1.aO())
/*      */           {
/* 1346 */             bool = true;
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
/* 1367 */     af af1 = e();
/*      */     
/* 1369 */     if (!bool)
/*      */     {
/*      */       
/* 1372 */       if (af1 != null)
/*      */       {
/* 1374 */         if (this.a.m(af1)) {
/*      */ 
/*      */ 
/*      */           
/* 1378 */           this.as.add(i, this.a.h);
/* 1379 */           this.as.add(i, this.a.i);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1389 */     k = 0;
/*      */     
/* 1391 */     if (f.bw && (this.b.by.showSelectedUnitsList || j == 1))
/*      */     {
/* 1393 */       k = 1;
/*      */     }
/*      */     
/* 1396 */     if (l.aj() && j > 0)
/*      */     {
/* 1398 */       k = 1;
/*      */     }
/*      */     
/* 1401 */     if (k != 0 && !(paramaf instanceof com.corrodinggames.rts.game.units.h)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1408 */       if (j == 1 && af1 != null) {
/*      */         
/* 1410 */         m m1 = af1.g(true);
/*      */         
/* 1412 */         if (m1 != null && m1.size() > 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1419 */           for (byte b1 = 0; b1 < m1.a; b1++) {
/*      */             
/* 1421 */             s s1 = (s)m1.get(b1);
/* 1422 */             if (s1 instanceof g) {
/*      */               
/* 1424 */               g g = (g)s1;
/* 1425 */               for (g g1 : this.ay) {
/*      */                 
/* 1427 */                 if (g1.a(g))
/*      */                 {
/* 1429 */                   m1.set(b1, g1);
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           } 
/*      */ 
/*      */           
/* 1436 */           this.ay.clear();
/* 1437 */           for (s s1 : m1) {
/*      */             
/* 1439 */             if (s1 instanceof g)
/*      */             {
/* 1441 */               this.ay.add(s1);
/*      */             }
/*      */             
/* 1444 */             this.as.add(s1);
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
/* 1469 */       ArrayList arrayList = d();
/*      */       
/* 1471 */       this.ax.clear();
/*      */       
/* 1473 */       for (al al : arrayList) {
/*      */         
/* 1475 */         z z = al.d();
/* 1476 */         z.t();
/* 1477 */         this.ax.add(z);
/*      */       } 
/*      */       
/* 1480 */       Collections.sort(this.ax);
/*      */       
/* 1482 */       if (f.bw)
/*      */       {
/* 1484 */         Collections.reverse(this.ax);
/*      */       }
/*      */       
/* 1487 */       for (z z : this.ax) {
/*      */         
/* 1489 */         if (f.bw) {
/*      */ 
/*      */ 
/*      */           
/* 1493 */           this.as.add(0, z);
/*      */           
/*      */           continue;
/*      */         } 
/* 1497 */         this.as.add(z);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1504 */     return this.as; }
/*      */   af e() { if (this.a.bF.size() > 0) return this.a.bF.a(0);  return null; }
/*      */   af f() { af af1 = null; if (this.a.aQ > 0) { af[] arrayOfAf = this.a.bF.a(); byte b; int i; for (b = 0, i = this.a.bF.size(); b < i; b++) { af af2 = arrayOfAf[b]; if (af2.ci) if (af1 == null) { af1 = af2; } else { if (!a(af1, af2)) { af1 = null; break; }  if (af1.T() > af2.T()) af1 = af2;  }   }  }  return af1; }
/*      */   public static boolean a(af paramaf1, af paramaf2) { al al1 = paramaf1.r(); al al2 = paramaf2.r(); if (al1 == al2) return true;  if (al1 instanceof l && al2 instanceof l) { l l1 = (l)al1; l l2 = (l)al2; if (l1.fz.contains(al2)) return true;  if (l1.fC != null) if (h.a(l1.fC, l2.x())) return true;   if (l2.fC != null) if (h.a(l2.fC, l1.x())) return true;   }  return false; }
/* 1508 */   ArrayList g() { this.az.clear(); af[] arrayOfAf = this.a.bF.a(); byte b; int i; for (b = 0, i = this.a.bF.size(); b < i; b++) { af af1 = arrayOfAf[b]; if (af1 instanceof r) this.az.add((r)af1);  }  return this.az; } float h() { float f1 = this.b.bT / 14.0F / this.b.bQ; f1 = f.b(f1, 25.0F * this.b.bQ, 40.0F * this.b.bQ); return f1; } private boolean c(s params) { if (params.o()) return true;  if (params instanceof g) { g g = (g)params; return this.a.m((af)g.b); }  ArrayList arrayList = g(); c c = params.J(); for (r r1 : arrayList) { s s1 = r1.a(c); if (s1 != null) if (this.a.m((af)r1)) return true;   }  return false; } private boolean a(s params, ArrayList paramArrayList) { if (params.o()) return true;  if (params instanceof g) { g g = (g)params; if (!g.s((af)g.b)) return false;  if (this.a.m((af)g.b) || g.a((af)g.b, this.b.bb)) return true;  return false; }  c c = params.J(); for (r r1 : paramArrayList) { s s1 = r1.a(c); if (s1 != null) if (s1.s((af)r1)) if (this.a.m((af)r1) || s1.a((af)r1, this.b.bb)) return true;    }  return false; } private boolean b(s params, ArrayList paramArrayList) { if (params.o()) return true;  if (params instanceof g) { g g = (g)params; if (g.a((af)g.b, true)) return true;  }  for (r r1 : paramArrayList) { s s1 = r1.a(params.J()); if (s1 != null) if (s1.a((af)r1, true)) return true;   }  return false; } private float c(s params, ArrayList paramArrayList) { byte b = 0; float f1 = -1.0F; if (params.l_()) return -1.0F;  for (r r1 : paramArrayList) { s s1 = r1.a(params.J()); if (s1 != null) { float f2 = s1.q((af)r1); if (f2 > f1) { f1 = f2; b++; }  }  }  return f1; } private c d(s params) { float f1 = -1.0F; c c = null; if (params.l_()) return null;  for (af af1 : this.a.bF) { if (!(af1 instanceof r)) continue;  r r1 = (r)af1; s s1 = r1.a(params.J()); if (s1 != null) { c c1 = c.b((af)r1, params.J()); if (c1 != null) { if (f1 < c1.a()) { f1 = c1.a(); c = c1; }  continue; }  return null; }  }  if (c == null) return null;  return c; } a(l paraml, f paramf) { this.ay = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1625 */     this.az = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1652 */     this.aA = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3534 */     this.aB = new HashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4272 */     this.aC = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4299 */     this.aD = new Rect();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4346 */     this.aF = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4374 */     this.aG = false;
/*      */     
/* 4376 */     this.aH = 0.0F;
/* 4377 */     this.aI = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4727 */     this.aN = false;
/* 4728 */     this.aO = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5056 */     this.aP = new r();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5327 */     this.aQ = null; this.a = paramf; this.b = paraml; b(); }
/*      */   private float e(s params) { c c = d(params); if (c == null) return 0.0F;  return c.b(); }
/*      */   float b(s params) { c c = d(params); if (c == null) return 0.0F;  return c.c(); }
/*      */   int d(float paramFloat) { ArrayList arrayList3; this.ar = false; byte b1 = 1; if (f.bx) b1 = 2;  boolean bool1 = false; byte b2 = 0; boolean bool2 = false; c.a(paramFloat); ArrayList arrayList1 = g(); af af1 = f(); ArrayList arrayList2 = null; if (this.a.W != null) arrayList2 = this.a.W.r(af1);  if (arrayList2 != null) { arrayList3 = arrayList2; } else { arrayList3 = a(af1, arrayList1); }  if (af1 == null && arrayList3.size() > 0) { af1 = e(); if (af1 == null) if (l.b != null) af1 = af.c((al)l.b);   }  this.a.o = false; if (arrayList3.contains(this.a.h)) this.a.o = true;  if (af1 == null) af1 = e();  boolean bool = true; if (af1 == null) this.af = -1L;  if (af1 != null) { int i = arrayList3.size(); if (i > 0) { float f5, f6, f7, f13; ArrayList arrayList = arrayList3; float f1 = 2.0F; float f2 = h(); float f3 = 2.0F; float f4 = f2 + f3; boolean bool3 = false; if (!f.bz) { f7 = (this.b.bE.b() + 2); f6 = this.b.bS - this.b.bE.c; f5 = this.b.bE.c; } else { f7 = this.b.bE.b; f6 = this.b.bE.c; f5 = this.b.bE.c; bool3 = true; }  if (f.bw) { f2 += 15.0F * this.b.bQ; f4 += 15.0F * this.b.bQ; f1 = 5.0F; if (l.ak()) f1 = 2.0F;  f4 += 2.0F; f3 += 2.0F; f7 += 3.0F; }  if (!f.a) { boolean bool6 = true; if (this.a.c != null && this.a.aQ == 1) if (this.a.c.ci) bool6 = false;   if (bool6) { float f19 = i(); f7 += f19; f7 += 2.0F; }  }  byte b = 0; float f8 = 0.0F; float f9 = 0.0F; float f10 = 0.0F; for (s s1 : arrayList) { if (!a(s1, arrayList1)) continue;  b++; f13 = f4 * s1.j(); int k = b1; if (s1.k() > 0) k = s1.k();  float f19 = f5 / k; boolean bool6 = false; if (f9 + f19 - 0.1F >= f5) bool6 = true;  if (!bool6 && f8 > 0.0F && f13 + 0.1F < f8) bool6 = true;  if (bool6) { f10 += f8; f8 = 0.0F; f9 = 0.0F; }  if (f8 < f13) f8 = f13;  f9 += f19; }  if (f9 > 0.0F) f10 += f8;  float f11 = f7 + f10; float f12 = f7; f7++; if (this.b.by.showUnitGroups) { f13 = this.b.co - 34.0F * this.b.bQ; } else { f13 = this.b.co; }  this.af = af1.dA; f7 -= (int)af1.bc; float f14 = 0.0F; float f15 = 1.0F + f2 * 0.25F; boolean bool4 = (f11 - af1.bc > f13 + f15) ? true : false; boolean bool5 = (af1.bc > f15) ? true : false; this.ar = (bool4 || bool5); if (this.b.by.mouseSupport) if (!this.a.a(this.b.W(), this.b.X())) { int k = this.b.Z(); if (k != 0) f14 = -(k / 120.0F);  }   float f16 = 0.0F; if (bool4) { float f19 = 0.4F; this.w.a = (int)(f6 + 2.0F); this.w.c = (int)(f6 + f5 - 2.0F); this.w.b = (int)(f13 - f2 * f19); this.w.d = (int)(this.w.b + f2 * f19); if (this.a.a(this.w.a, this.w.b, this.w.b(), this.w.c(), "\\/", g.a, false, Color.a(80, 100, 150, 100), this.a.aw)) if (this.a.H()) { f16 += 3.0F * f4; this.a.O = false; }   if (f14 > 0.0F) this.aq = (float)(this.aq + 0.5D * f4);  f13 -= f4 * f19 + 2.0F; }  if (bool5) { float f19 = 0.4F; this.w.a = (int)(f6 + 2.0F); this.w.c = (int)(f6 + f5 - 2.0F); this.w.b = (int)f12; this.w.d = (int)(this.w.b + f2 * f19); if (this.a.a(this.w.a, this.w.b, this.w.b(), this.w.c(), "/\\", g.a, false, Color.a(80, 100, 150, 100), this.a.aw)) if (this.a.H()) { f16 -= 3.0F * f4; this.a.O = false; }   if (f14 < 0.0F) this.aq = (float)(this.aq - 0.5D * f4);  f12 += f4 * f19 + 2.0F; }  this.b.bw.h(); this.aA.a(0.0F, f12 - 1.0F, this.b.bS, f13 + 1.0F); this.b.bw.a(this.aA); if (l.ak()) if (this.af != af1.dA) { this.ag = 0.0F; this.ah = af1.bc; } else if (this.aq != 0.0F) { this.ag = this.aq; } else { if (!this.a.D) this.aq += this.ag * paramFloat;  this.ag = f.a(this.ag, paramFloat); }   af1.bc += this.aq + f16; this.aq = 0.0F; float f17 = 0.0F; int j = (int)(f11 - f13); if (j > 0) { if (af1.bc > j + f17) af1.bc = j + f17;  if (af1.bc < 0.0F - f17) af1.bc = 0.0F - f17;  } else { af1.bc = 0.0F; }  bool1 = true; byte b3 = -1; float f18 = 0.0F; f8 = 0.0F; f9 = 0.0F; c(); for (s s1 : arrayList) { float f21, f22; q q1; if (!a(s1, arrayList1)) continue;  b2++; boolean bool6 = b(s1, arrayList1); b3++; float f19 = f2 * s1.j(); int k = b1; if (s1.k() > 0) k = s1.k();  float f20 = f5 / k; if (!bool3) { f21 = f19; f22 = f20; } else { f21 = f20; f22 = f19; }  boolean bool7 = false; if (f9 + f22 - 0.1F > f5) bool7 = true;  if (!bool7 && f8 > 0.0F && f21 + 0.1F < f8) bool7 = true;  if (bool7) { f18 += f8 + f3; f8 = 0.0F; f9 = 0.0F; }  if (f8 < f21) f8 = f21;  if (!bool3) { this.w.a = (int)(f6 + f1); this.w.c = (int)(this.w.a + f20 - f1 * 2.0F); this.w.b = (int)(f18 + f7); this.w.d = (int)(this.w.b + f19); this.w.a((int)f9, 0); } else { this.w.a = (int)(f6 + f1 + f18); this.w.c = (int)(this.w.a + f20 - f1 * 2.0F); this.w.b = (int)f7; this.w.d = (int)(this.w.b + f19); this.w.a(0, (int)f9); }  boolean bool8 = true; this.x.a(this.w); if (!this.x.b(this.aA)) bool8 = false;  f9 += f22; t t = s1.f(); boolean bool9 = false; if (t == t.g || t == t.h || t == t.i) bool9 = true;  boolean bool10 = bool6; boolean bool11 = a(s1); boolean bool12 = s1.D(); Paint paint = this.j; boolean bool13 = bool10; if (t == t.i) bool13 = true;  if (bool13) { paint.b(Color.a(70, 100, 100, 100)); } else { paint.b(Color.a(50, 170, 100, 100)); }  if (bool11) paint.b(Color.a(100, 180, 100, 100));  boolean bool14 = false; boolean bool15 = false; if (this.ac == af1 && this.ad == s1) bool14 = true;  if (this.a.W == s1) { bool14 = true; bool15 = true; }  if (bool14) paint.b(Color.a(80, 100, 100, 200));  if (bool15) paint.b(Color.a(80, 100, 200, 100));  if (bool12) { paint.c((int)(paint.f() * 0.7F)); q1 = this.o; } else { q1 = this.n; }  float f23 = 0.0F; if (bool8) { f23 = c.b(af1, s1, false); if (s1.f() != t.h) { boolean bool21 = this.a.a(s1); float f24 = 0.0F; if (bool21) { float f26 = (float)(l.N() % 1000L) / 1000.0F; f24 = f.c(f.i(f26 * 180.0F)); }  if (f23 != 0.0F) { int i1; float f26 = f.c(f23) * 0.7F - 0.3F; f26 = f.b(f26, 0.0F, 1.0F); if (f23 > 0.0F) { i1 = Color.a(110, 210, 210, 210); } else { i1 = Color.a(110, 210, 110, 110); }  int i2 = f.a(i1, paint.e(), f26); paint = this.i; paint.b(i2); }  this.a.a(this.w, paint, (Paint)q1); float f25 = c(s1, arrayList1); if (f25 >= 0.0F) { this.l.a(80, 0, 0, 100); this.E.a(this.w); this.E.c = (int)(this.E.c - (1.0F - f25) * this.E.b()); this.b.bw.b(this.E, this.l); this.m.a(190, 148, 189, 255); this.b.bw.a(this.E.c, this.E.b, this.E.c, this.E.d, this.l); } else { float f26 = e(s1); if (f26 >= 0.0F) { this.l.a(80, 100, 0, 0); this.E.a(this.w); this.E.c = (int)(this.E.c - (1.0F - f26) * this.E.b()); this.b.bw.b(this.E, this.l); this.m.a(190, 148, 189, 255); this.b.bw.a(this.E.c, this.E.b, this.E.c, this.E.d, this.l); }  }  int n = Color.a(255, 0, 0, 0); if (f.bw) { n = Color.a(100, 0, 0, 0); if (bool12) n = Color.a(50, 155, 155, 155);  }  if (bool21) n = Color.a((int)(100.0F + 150.0F * f24), 255, 255, 255);  this.a.a(this.w, n); }  }  ad ad = a(s1, b3, arrayList); if (ad != null) if (bool8) { String str = ad.c(); this.b.bw.a(str, (this.w.a + 3), (this.w.b + 14), this.a.at); }   boolean bool16 = false; al al = s1.i(); e e1 = s1.r(); af af2 = s1.j(af1); if (af2 != null) al = af2.r();  if (e1 == null && al != null) e1 = al.z();  if (e1 != null) { Rect rect = s1.s(); if (rect == null) { rect = this.E; rect.a(0, 0, e1.l(), e1.k()); }  float f24 = this.w.c() * 0.7F / rect.c(); int n = (int)(this.w.d() - rect.b() * 0.5F * f24); int i1 = (int)(this.w.e() - rect.c() * 0.5F * f24); this.p.a(100, 255, 255, 255); RectF rectF = this.F; rectF.a(n, i1, n + rect.b() * f24, i1 + rect.c() * f24); this.b.bw.a(e1, rect, rectF, this.p); bool16 = true; } else if (al != null) { float f24 = this.w.d(); float f25 = this.w.e(); if (f23 > 0.5D) f25++;  if (f23 < -0.5D) f25--;  float f26 = this.w.c() * 0.7F; float f27 = this.w.c() * 0.95F; if (f.bw) { f26 = this.w.c() * 0.4F; f27 = this.w.c() * 0.85F; }  this.A.a(this.w); if (this.A.b(this.aA)) { this.b.bw.h(); this.b.bw.a(this.A); ak.a(al, f24, f25, 0.0F, 0.0F, af1.bB, f26, f27, false, false, s1.p()); if (af2 != null) { float f28 = af2.a_(); float f29 = af2.bH(); if (f29 != -1.0F && s1.u(af1)) { byte b4 = 120; char c = 'È'; int n = f.b(200, 0, 0, 150); int i1 = f.b(120, 0, 0, 230); Paint paint1 = y.a(n, Paint.Style.a); Paint paint2 = y.a(i1, Paint.Style.b); byte b5 = 3; int i2 = (int)(this.A.b() / 3.0F) - 3; boolean bool21 = false; int i3 = i2 * 2; this.F.a(f24 - i2, f25 + bool21, f24 - i2 + i3 * f29, f25 + bool21 + b5); this.b.bw.a(this.F, paint1); this.F.a(f24 - i2, f25 + bool21, f24 - i2 + i3, f25 + bool21 + b5); this.b.bw.a(this.F, paint2); } else if (f28 != -1.0F && s1.t(af1)) { byte b4 = 120; char c = 'È'; int n = f.b(200, 0, 150, 0); int i1 = f.b(120, 0, 230, 0); Paint paint1 = y.a(n, Paint.Style.a); Paint paint2 = y.a(i1, Paint.Style.b); byte b5 = 3; int i2 = (int)(this.A.b() / 3.0F) - 3; boolean bool21 = false; int i3 = i2 * 2; this.F.a(f24 - i2, f25 + bool21, f24 - i2 + i3 * f28, f25 + bool21 + b5); this.b.bw.a(this.F, paint1); this.F.a(f24 - i2, f25 + bool21, f24 - i2 + i3, f25 + bool21 + b5); this.b.bw.a(this.F, paint2); }  }  this.b.bw.i(); }  bool16 = true; }  e e2 = s1.i(af1); if (e2 != null) { Rect rect = s1.s(); if (rect == null) { rect = this.E; rect.a(0, 0, e2.l(), e2.k()); }  float f24 = this.w.c() * 0.7F / rect.c(); int n = (int)(this.w.d() - rect.b() * 0.5F * f24); int i1 = (int)(this.w.e() - rect.c() * 0.5F * f24); this.p.b(s1.G()); RectF rectF = this.F; rectF.a(n, i1, n + rect.b() * f24, i1 + rect.c() * f24); this.b.bw.a(e2, rect, rectF, this.p); bool16 = true; }  if (bool8) { String str = s1.d(); if (bool11) this.b.bw.a(this.W, (this.w.a + 25), this.w.g(), null);  float f24 = this.b.bw.b(str, this.a.aw); if (f24 > (this.w.b() - 2)) { float f26 = this.b.bw.b(str, this.a.av); if (f26 > (this.w.b() - 2)) { this.i.a(this.a.au); } else { this.i.a(this.a.av); }  } else { this.i.a(this.a.aw); }  if (!bool13) this.i.b(Color.a(255, 0, 100, 0));  if (t == t.b) { this.i.a(255, 255, 255, 255); } else if (t == t.c || t == t.f) { if (!bool13) { this.i.a(255, 19, 101, 94); } else { this.i.a(255, 39, 202, 189); }  } else if (t == t.d) { al al1 = s1.i(); if (al1 != null) if (al1.g() > 1) if (!bool13) { this.i.a(255, 117, 120, 15); } else { this.i.a(255, 235, 240, 30); }    } else if (bool9) { this.i.a(155, 255, 255, 255); }  int n = this.b.bw.a(str, this.i); float f25 = this.w.g() + (n / 2); if (bool9) f25 = this.w.g();  if (bool16 && !str.contains("\n")) if (bool9) { f25 = (this.w.d - n / 2 - 1); } else { f25 = (this.w.d - 6); }   if (bool9) { n.a(str, this.w.f(), f25, this.i); } else { this.b.bw.a(str, this.w.f(), f25, this.i); }  }  boolean bool17 = false; boolean bool18 = false; boolean bool19 = false; if (ad != null) if (ad.a()) { bool17 = true; bool19 = true; }   this.y.a(this.w); if (l.ak()) f.b(this.y, 2.0F);  this.a.a(this.y.a, this.y.b, this.y.b(), this.y.c()); if (!this.d) if (this.y.b((int)this.a.u, (int)this.a.v)) if (this.aA.b((int)this.a.u, (int)this.a.v)) { bool2 = true; if (l.al()) bool18 = true;  if (this.a.O || this.a.D) if (this.a.O && this.a.H()) { this.a.O = false; bool17 = true; }   }    if (l.al()) if (this.a.W == null) if (bool18) { this.ac = af1; this.ad = s1; this.ae = f18 + f7; } else if (s.a(this.ad, s1)) { this.ac = null; this.ad = null; }    boolean bool20 = false; if (bool17) if (!bool19) if (this.b.by.mouseSupport) if (this.b.e(2)) bool20 = true;     if (bool17) { if (s1.c(af1, bool20)) bool17 = false;  if (this.b.bJ.h()) bool17 = false;  if (!c(s1)) bool17 = false;  }  if (bool17) if (s1.e() == u.a || s1.e() == u.c) { this.a.W = null; boolean bool21 = false; if (bool19) { bool21 = true; } else if (!s1.q()) { bool21 = true; } else { if (s1.l(af1)) { bool21 = true; } else if (this.ac == af1 && s.a(this.ad, s1)) { bool21 = true; }  this.ac = af1; this.ad = s1; this.ae = f18 + f7; }  if (bool21) { byte b4 = 1; if (s1.g()) { if (this.a.a(this.b)) b4 = 5;  if (this.a.b(this.b)) b4 = 10;  }  boolean bool22 = false; if (!bool19) { boolean bool23 = false; if (af1 != null && s1.b(af1, false) != -1) bool23 = true;  if (bool20 && bool23) bool22 = true;  }  if (a(s1)) { this.b.bu.b(e.k, 0.8F); } else if (!bool10 && !bool22) { this.b.bu.b(e.k, 0.8F); } else { boolean bool23 = s1.g(); if (bool23 && !bool22) if (this.b.bb.t() <= this.b.bb.s()) this.a.a(this.an);   if (bool23) { if (!bool22) { this.b.bu.b(e.g, 0.5F); } else { this.b.bu.b(e.h, 0.5F); }  } else { this.b.bu.b(e.f, 0.8F); }  c.a(af1, s1, bool22, false); for (byte b5 = 0; b5 < b4; b5++) { e e3 = this.a.v(); if (!s1.F()) { this.a.a(e3, s1); } else { this.a.a(e3, s1.J(), bool22); }  if (bool22) e3.g = true;  e3.a(s1.w()); if (!bool22) this.a.a(s1, (PointF)null, (af)null, e3);  }  }  }  } else if (s1.e() == u.m || s1.e() == u.l || s1.e() == u.j) { if (bool20) { if (s1 != null && s1.equals(this.a.W)) this.a.k();  } else if (!bool10) { this.b.bu.b(e.k, 0.8F); } else { c.a(af1, s1, false, false); this.ac = null; this.ad = null; this.a.W = s1; }  } else if (s1.e() == u.d || s1.e() == u.e || s1.e() == u.f || s1.e() == u.g) { boolean bool21 = false; boolean bool22 = false; if (s1.e() == u.g) bool22 = true;  if (bool20 && bool22) bool21 = true;  if (bool21) { e e3 = this.a.v(); if (!s1.F()) { this.a.a(e3, s1); } else { this.a.a(e3, s1.J(), bool21); }  e3.g = true; e3.a(s1.w()); } else { l.d("Clicked button: actionActive: " + bool10); if (!bool10) { this.b.bu.b(e.k, 0.8F); } else { c.a(af1, s1, false, false); this.ac = null; this.ad = null; this.a.W = s1; }  }  } else if (s1.e() == u.b) { if (a(s1)) { this.b.bu.b(e.k, 0.8F); } else if (!bool10) { this.b.bu.b(e.k, 0.8F); } else { this.b.bu.b(e.f, 0.8F); }  c.a(af1, s1, false, false); this.ac = null; this.ad = null; if (this.a.W == null) this.a.ac = false;  this.a.U = af1; this.a.W = s1; this.a.Z = 0.0F; this.a.ak = -99.0F; this.a.al = -99.0F; if (!this.a.Y) { this.a.aa = this.b.cp * this.b.cE; this.a.ab = this.b.cq * this.b.cE; }  this.a.Y = true; this.b.bt.b(); } else if (s1.e() == u.k) { c.a(af1, s1, false, false); s1.d(af1); } else if (s1.e() == u.i) { if (s1.z()) { this.ac = af1; this.ad = s1; this.ae = f18 + f7; this.a.W = null; }  } else { throw new RuntimeException("unknown gui action:" + s1.e()); }   if (this.ad == s1) bool = bool6;  }  this.b.bw.i(); this.aA.f(); }  }  if (af1 != null && af1 == this.ac) { if (this.ad != null) { boolean bool3 = true; if (l.al()) bool3 = false;  boolean bool4 = false; if (this.ad.q()) bool4 = true;  if (l.al() && this.ad.h()) bool4 = true;  if (bool4) { boolean bool5 = true; if (!bool) bool5 = false;  if (this.a.a(this.ad, bool3, this.ac, !bool5, true, this.ae)) this.ac = null;  }  }  } else { this.ac = null; }  if (l.al()) if (!bool2) { this.ac = null; this.ad = null; }   return b2; }
/* 5331 */   float i() { float f1 = this.b.bT / 14.0F / this.b.bQ; f1 = f.b(f1, 25.0F * this.b.bQ, 40.0F * this.b.bQ); f1 = (float)(f1 * 0.9D); return f1; } void a(float paramFloat, int paramInt) { boolean bool = true; if (paramInt == 0) bool = true;  if (f.a) bool = false;  if (this.a.aQ > 0) { if (this.a.c != null && this.a.aQ == 1) if (this.a.c.ci) bool = false;   if (bool) { float f4 = i(); if (this.a.b((int)(this.b.bS - this.b.bE.c + 2.0F), this.b.bE.b() + 2, (int)(this.b.bE.c - 4.0F), (int)f4, this.ai, g.c, false, Color.a(140, 100, 100, 100))) if (!this.a.N) { this.a.d(); this.a.k(); this.a.w(); }   }  m m1 = null; boolean bool1 = false; this.aB.clear(); af af1 = null; af[] arrayOfAf = this.a.bF.a(); int i; for (byte b = 0; b < i; b++) { af af2 = arrayOfAf[b]; if (af2.ci) { af1 = af2; if (this.a.m(af2)) { al al = af2.r(); Integer integer = (Integer)this.aB.get(al); if (integer == null) { this.aB.put(al, Integer.valueOf(1)); } else { this.aB.put(al, Integer.valueOf(integer.intValue() + 1)); }  bool1 = true; } else { m1 = af2.bB; }  }  }  boolean bool2 = this.b.be; if (m1 != null && this.b.bb != null) if (m1.b(this.b.bb)) bool2 = true;   i = (int)h(); int j = i + 2; int k = (int)(10.0F * this.b.bQ); float f1 = (this.b.bE.b() + i + 30); float f2 = f1; float f3 = this.b.bS - this.b.bX + k; f2 += 5.0F; if (af1 != null) { f2 += j; f2 += (j * paramInt); if (this.a.o) f2 -= (2 * j) * 0.4F;  }  this.w.a((int)f3, (int)f2, (int)(f3 + this.b.bX - (k * 2)), (int)(f2 + i)); boolean bool3 = false; if (!f.by) { if (paramInt < 3) if (!bool1 && m1 != null) { Paint paint = this.a.az; if (this.b.bb.d(m1)) paint = this.a.aA;  String str = a(m1); this.a.a(str, this.w, paint, paint); bool3 = true; }   if (this.a.p() == 1) if (af1 != null) if (af1.cb() <= 3 || (m1 != null && !bool2)) { String str = a(af1, false); if (bool3) { str = "\n" + str; str = "\n" + str; str = "\n" + str; }  Paint paint = this.i; paint.a(); paint.b(Color.a(50, 100, 100, 100)); this.a.a(str, this.w, this.a.aB, this.a.aB); }    }  }  } public String a(m paramm) { String str = ""; boolean bool = false; if (this.b.bb.b()) { bool = true; } else if (this.b.bb.d(paramm)) { str = str + this.aj; } else if (this.b.bb.c(paramm)) { str = str + this.ak; } else { bool = true; }  if (bool) if (paramm == m.g) { str = str + this.al; } else { str = str + "Team - " + paramm.f(); }   str = str + "\n"; if (paramm.q != null) str = str + paramm.q;  if (!paramm.r && this.b.G()) if (paramm.x()) { str = str + "\n"; str = str + "(disconnected)"; }   return str; } public String a(af paramaf, boolean paramBoolean) { String str = ""; if (paramBoolean) str = str + paramaf.r().e() + "\n";  if (paramaf.g() > 0.0F) { g g1 = paramaf.cv(); float f1 = paramaf.bY / paramaf.bZ; g g2 = g.a(g1, f1); boolean bool = false; String str1 = g2.a(true, true, 3, bool); str = str + str1; } else { str = str + (int)Math.ceil(paramaf.bY) + "/" + (int)paramaf.bZ + "\n"; }  if (paramaf.ce != 0.0F) str = str + "(" + (int)paramaf.cb + "/" + (int)paramaf.ce + ")\n";  d d1 = paramaf.cj(); if (!d1.b()) for (c c : d1.b) { if (c.b != 0.0D && !c.a.a()) str = str + c.a.a(c.b, true) + "\n";  }   str = f.j(str); return str; } public static String a(s params, boolean paramBoolean) { String str1; if (paramBoolean) { str1 = "\n"; } else { str1 = " | "; }  String str2 = ""; if (params instanceof w) { w w = (w)params; float f1 = w.t(); if (f1 < 1.0F) { l l1 = l.u(); float f2 = -1.0F; af[] arrayOfAf = l1.bA.bF.a(); byte b; int i; for (b = 0, i = l1.bA.bF.size(); b < i; b++) { af af1 = arrayOfAf[b]; float f4 = af1.ch(); if (f2 == -1.0F || f4 < f2) f2 = f4;  }  if (f2 == -1.0F) f2 = 1.0F;  float f3 = 1.0F / w.t() * f2 * 60.0F; str2 = str2 + f.g(f3) + str1; }  }  str2 = f.a(str2, str1); return str2; } public static String a(af paramaf, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { String str1; if (paramBoolean2) { str1 = "\n"; } else { str1 = " | "; }  String str2 = ""; l l1 = null; if (paramaf instanceof k) { k k = (k)paramaf; l1 = k.v; }  if (paramBoolean1) str2 = str2 + paramaf.r().e() + str1;  if (l1 == null || !l1.aD) if (!paramBoolean3) { str2 = str2 + "HP: " + (int)Math.ceil(paramaf.bY) + "/" + (int)paramaf.bZ + str1; } else { str2 = str2 + "HP: " + (int)paramaf.bZ + str1; }   if (paramaf.ce != 0.0F) if (!paramBoolean3) { str2 = str2 + "Shield: " + (int)paramaf.cb + "/" + (int)paramaf.ce + str1; } else { str2 = str2 + "Shield: " + (int)paramaf.ce + str1; }   if (l1 != null) { float f2 = l1.cv; if (f2 >= 1.0F) str2 = str2 + "Armour: " + (int)f2 + str1;  }  float f1 = paramaf.ci(); if (f1 != 0.0F) str2 = str2 + "Income: +$" + f.a(f1, 1) + str1;  if (paramaf instanceof r) { r r1 = (r)paramaf; if (r1.aY() != 0.0F) if (!paramBoolean3) str2 = str2 + "Energy: " + f.f(paramaf.cf) + "/" + f.f(r1.aY()) + str1;   float f2 = r1.z(); if (!r1.aN()) f2 = 0.0F;  if (f2 != 0.0F) str2 = str2 + "Speed: " + f.f(f2) + str1;  if (r1.l()) { ArrayList arrayList = r1.aS(); if (arrayList.size() > 0) { str2 = str2 + "Attack: "; boolean bool1 = true; for (t t : arrayList) { if (!bool1) str2 = str2 + ", ";  bool1 = false; str2 = str2 + f.f(t.a); if (t.d > 1) str2 = str2 + "x" + t.d;  str2 = str2 + "/" + f.f(t.a()) + "s"; }  str2 = str2 + str1; }  }  float f3 = r1.m(); if (!r1.l()) f3 = 0.0F;  if (f3 != 0.0F) str2 = str2 + "Range: " + f.f(f3) + str1;  if (paramBoolean3) if (r1.bV()) str2 = str2 + "Upgradable" + str1;   }  if (!paramBoolean3) if (paramaf.cw > 0) str2 = str2 + "Kills: " + paramaf.cw + str1;   boolean bool = false; if ((l.u()).aV) { str2 = str2 + "\n"; str2 = str2 + "--Debug--" + str1; str2 = str2 + "name: " + paramaf.r().i() + str1; if (paramaf.dA != 0L) str2 = str2 + "id: " + paramaf.dA + str1;  if (paramaf.ch != 0) str2 = str2 + "flags: " + paramaf.ch + str1;  if (paramaf.cg != 0) str2 = str2 + "ammo: " + paramaf.cg + str1;  if (!paramaf.bT) { str2 = str2 + "x: " + f.f(paramaf.dH) + str1; str2 = str2 + "y: " + f.f(paramaf.dI) + str1; }  if (paramaf.bH != 0.0F || paramaf.bI != 0.0F) str2 = str2 + "x/y speed: " + f.f(paramaf.bH) + ", " + f.f(paramaf.bI) + str1;  if (!paramaf.bT) { str2 = str2 + "height: " + f.f(paramaf.dJ) + str1; str2 = str2 + "dir: " + f.f(paramaf.bL) + str1; }  if (paramaf.bR < 1.0F) str2 = str2 + "built: " + f.f(paramaf.bR) + str1;  if (paramaf instanceof k) { k k = (k)paramaf; str2 = str2 + "frame: " + k.a + str1; str2 = str2 + "drawLayer: " + k.dF + str1; if (k.cM() != null) str2 = str2 + "tags: " + k.cM() + str1;  if (k.bg != -9999) str2 = str2 + "customTimer: " + f.g(k.bg / 1000.0F) + str1;  }  bool = true; }  d d1 = paramaf.cN(); if (d1 != null && !d1.b()) { String str = d1.a(paramBoolean2, true, 10, bool, false); if (!str.equals("")) str2 = str2 + str + str1;  }  str2 = f.a(str2, str1); return str2; } void j() { for (v v : this.aC) v.h = true;  } public void p() { this.aQ = e.a(); } void k() { for (v v : this.aC) v.b();  this.ao = null; this.ap = 0.0F; } void a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, Paint paramPaint, float paramFloat) { int i = (int)(paramInt3 * 2.5D); int j = (int)(40.0F * this.b.bQ); int k = paramInt1 + paramInt3 / 2; int n = (int)((paramInt2 - j) - 35.0F * this.b.bQ); this.aD.a(k - i / 2, n, i, j); this.a.a(this.aD.a, this.aD.b, this.aD.c, this.aD.d, "", Color.a(180, 100, 100, 100), this.a.aw, false); this.w.a(this.aD.a, this.aD.b, this.aD.c, this.aD.d); this.w.c = (int)(this.w.c * paramFloat); this.b.bw.c(this.w, paramPaint); this.b.bw.a(paramString1, k, n + (this.a.aw.k() + 5.0F) * 1.0F, this.a.aw); this.b.bw.a(paramString2, k, n + (this.a.aw.k() + 5.0F) * 2.0F, this.a.aw); } void l() { this.aF.clear(); this.aF.add(new a$1(this, "Finish game")); this.aF.add(new a$2(this, "Keep playing")); } void e(float paramFloat) { boolean bool = false; if (this.b.cX || this.b.da) if (!this.b.cY) bool = true;   if (!this.b.cX) { this.aG = false; } else if (!this.aG) { this.aG = true; if (!this.b.am) if (this.b.by.numberOfWins >= 5 && !this.b.by.rateGameShown && l.ap) { this.aN = true; this.b.by.rateGameShown = true; this.b.by.save(); }   }  if (!bool) { this.aH = 0.0F; this.aJ = 0; }  if (bool) if (this.b.bg >= 120 || this.b.bA.c != null);  if (bool && !this.a.p) { this.aH += paramFloat; if (this.b.bg < 120) this.aH = 100000.0F;  boolean bool1 = (this.aH > 80.0F) ? true : false; float f1 = 95.0F; boolean bool2 = (this.aH > 100.0F) ? true : false; boolean bool3 = (this.aH > 160.0F) ? true : false; boolean bool4 = false; if (this.aJ == 0) { this.aJ = 1; bool4 = true; }  int i = this.b.a(210); this.w.a = (int)(this.b.cm / 2.0F - (i / 2)); this.w.c = (int)(this.b.cm / 2.0F + (i / 2)); int j = this.b.a(30); int k = j + this.b.a(30); int n = this.aF.size(); int i1 = this.b.a(40) + k * n; float f2 = this.b.bW - (i1 / 2); if (f2 > 50.0F) f2 /= 2.0F;  if (f2 < 0.0F) f2 = 0.0F;  this.w.b = (int)f2; this.w.d = this.w.b + i1; if (bool1) { this.b.bw.a(this.a.be, this.w, null); this.b.bw.b(this.w, this.a.aI); }  Rect rect = new Rect(this.w); int i2 = this.w.b + this.b.a(20); int i3 = this.b.a(140); int i4 = (int)(this.b.cm / 2.0F - (i3 / 2)); int i5 = i2; int i6 = Color.a(140, 100, 100, 100); int i7 = i4 + i3 / 2; int i8 = i5; Paint paint = this.q; String str1 = "Victory!"; if (this.b.da) str1 = "Defeat";  float f3 = 1.0F; if (this.aH < f1) f3 = this.aH / f1;  i8 = (int)(i8 - f.i(f3 * 90.0F) * 100.0F); paint.a(str1, 0, str1.length(), this.z); this.b.bw.a(str1, i7, i8 - (paint.l() + paint.m()) / 2.0F, paint); if (this.aH < 100.0F && !this.b.da) { this.aI += paramFloat; if (this.aI > 0.5F) { this.aI = 0.0F; this.b.bz.b(h.e); this.b.bz.b(); int i9 = Color.a(255, f.a(0, 255), f.a(0, 255), f.a(0, 255)); e e1 = this.b.bz.b(0.0F, 0.0F, 0.0F, i9); if (e1 != null) { e1.o = true; e1.J = i7 + f.c(-70.0F, 70.0F); e1.K = i8 + f.c(-15.0F, 15.0F); e1.K += this.b.bW / 2.0F; e1.L += this.b.bW / 2.0F; e1.W = f.c(140.0F, 380.0F); e1.X = e1.W; e1.s = true; e1.t = true; e1.u = 5.0F; e1.F = 2.0F; e1.R = f.c(-2.7F, 2.7F); e1.Q = f.c(-12.7F, 12.7F); e1.H = 0.4F; e1.G = 0.2F; e1.S = f.c(2.0F, 4.0F); e1.x = 2.0F; e1.w = true; }  }  }  i5 += this.z.c(); i8 = rect.d + 30; String str2 = "123|"; this.s.a(str2, 0, str2.length(), this.z); float f4 = (this.z.c() + 6); float f5 = 1.5F; for (e e1 : this.aQ) { if (!bool3) continue;  if (e1.d != 1.0F && f5 > 0.0F) { e1.d = f.a(e1.d, 1.0F, 0.01F * f5 * paramFloat); f5 -= 1.0F - e1.d; }  float f6 = e1.d; f6 = f.b(f6, 0.0F, 1.0F); String str3 = ""; if (e1.b != null) { str3 = e1.b; } else { str3 = "" + (int)(e1.c * f6); if (f6 <= 0.0F) str3 = " ";  }  String str4 = e1.a; float f7 = e1.d * 2.2F; f7 = f.b(f7, 0.0F, 1.0F); int i9 = 0; if (f7 > 0.0F) i9 = (int)(str4.length() * f7);  i9 = f.b(i9, 0, str4.length()); String str5 = ""; if (i9 > 0 && i9 < str4.length() - 1) str5 = "_";  str4 = str4.substring(0, i9) + str5 + f.d(" ", str4.length() + str5.length() - i9); this.b.bw.a(str4, i7 - 8.0F * this.s.k(), i8, this.s); this.b.bw.a(str3, i7 + 8.0F * this.s.k(), i8, this.t); i8 = (int)(i8 + f4); }  for (byte b = 0; b < this.aF.size(); b++) { if (bool2) { b b1 = this.aF.get(b); if (this.a.a(i4, i5, i3, j, b1.b(), g.a, false, i6, this.a.ax)) { this.aN = false; b1.a(); }  }  i5 += k; }  if (this.aN) f(paramFloat);  }  } static String aK = com.corrodinggames.rts.gameFramework.e.a.a("gui.rategame.text", new Object[0]); static String aL = com.corrodinggames.rts.gameFramework.e.a.a("gui.rategame.yes", new Object[0]); static String aM = com.corrodinggames.rts.gameFramework.e.a.a("gui.rategame.no", new Object[0]); boolean aN; float aO; r aP; ArrayList aQ; void f(float paramFloat) { int i = this.b.a(180); int j = (int)(this.b.cm / 2.0F - (i / 2)); int k = this.b.a(120); int n = (int)(this.b.co - k); this.w.a(j, n, i, k); this.b.bw.b(this.w, this.a.aI); int i1 = j + i / 2; int i2 = n; Paint paint = this.q; String str1 = aK; paint.a(str1, 0, str1.length(), this.z); this.b.bw.a(str1, i1, i2 - (paint.l() + paint.m()) / 2.0F, paint); int i3 = n + this.z.c(); int i4 = this.b.a(70); int i5 = this.b.a(30); int i6 = j + i / 2 - this.b.a(10) - i4; int i7 = Color.a(140, 100, 100, 100); String str2 = aL; if (this.a.a(i6, i3, i4, i5, str2, g.a, false, i7, this.a.ax)) { this.aN = false; d d1 = this.b.aj; if (d1 == null) { l.b("showRateNow: gameView==null"); return; }  e e1 = d1.k(); if (e1 == null) { l.b("showRateNow: inGameActivity==null"); return; }  e1.j(); }  i6 = j + i / 2 + this.b.a(10); str2 = aM; if (this.a.a(i6, i3, i4, i5, str2, g.a, false, i7, this.a.ax)) this.aN = false;  } void a(float paramFloat, boolean paramBoolean) { float f1 = this.b.bQ * 0.7F; if (l.ak()) if (f1 < 0.7D) f1 = 0.7F;   int i = this.X.l(); int j = (int)(i * f1); int k = 4 + j / 2; int n = 4 + j / 2; if (this.b.g(111)) { boolean bool = false; if (!this.a.p) bool = this.a.k();  if (!bool) this.a.p = !this.a.p;  }  if (this.a.p) { this.aE += 0.008F * paramFloat; if (this.aE > 1.0F) this.aE = 0.0F;  float f2 = f.h(this.aE * 180.0F); this.h.c(150 + (int)(100.0F * f2)); } else { this.aE = 0.0F; this.h.c(80); }  this.z.a(k, n, k + j, n + j); this.z.a(-(j / 2), -(j / 2)); if (paramBoolean) this.b.bw.a(this.X, this.z.a, this.z.b, this.h, 0.0F, f1);  if (l.ak()) f.a(this.z, 4.0F);  if (this.a.O && !this.a.N) if (this.z.b((int)this.a.s, (int)this.a.t)) { this.a.O = false; this.a.p = !this.a.p; }   if (this.b.bJ.h()) { this.h.c(80); if (this.b.bJ.t != 1) this.h.c(200);  i = this.Z.l; j = (int)(i * this.b.bQ * 1.6F); k = (int)(this.b.cm / 2.0F); n = 7 + (int)this.a.ay.k(); String str = f.a((this.b.bh / 1000)); this.b.bw.a(str, k, n, this.a.ay); n += j / 2 + 10; k += j / 2 + 5; this.z.a(k, n, k + j, n + j); this.z.a(-this.z.b() / 2, -this.z.c() / 2); if (paramBoolean) this.b.bw.a(this.Z, this.z.a, this.z.b, this.h, 0.0F, (j / i));  if (this.a.O && !this.a.N) if (this.z.b((int)this.a.s, (int)this.a.t)) { this.a.O = false; this.b.bJ.b(); }   if (this.b.bc != 1.0F) if (paramBoolean) this.b.bw.a("x" + this.b.bc, (this.z.d() + j / 2), this.z.e(), this.a.aw);   e e1 = this.Y; i = e1.l; j = (int)(i * this.b.bQ * 1.6F); k -= j + 5; this.z.a(k, n, k + j, n + j); this.z.a(-this.z.b() / 2, -this.z.c() / 2); if (paramBoolean) this.b.bw.a(e1, this.z.a, this.z.b, this.h, 0.0F, (j / i));  if (this.a.O && !this.a.N) if (this.z.b((int)this.a.s, (int)this.a.t)) { this.a.O = false; this.b.bJ.a(); }   }  if (this.a.p) { this.b.cB = false; int i1 = this.b.a(180); this.w.a = (int)(this.b.cm / 2.0F - (i1 / 2)); this.w.c = (int)(this.b.cm / 2.0F + (i1 / 2)); int i2 = this.b.a(30); int i3 = i2 + this.b.a(15); Menu menu = o(); int i4 = 1 + menu.size(); int i5 = this.b.a(40) + i3 * i4; this.w.b = (int)(this.b.bW - (i5 / 2)); this.w.d = (int)(this.b.bW + (i5 / 2)); if (paramBoolean) { this.b.bw.a(this.a.be, this.w, null); this.b.bw.b(this.w, this.a.aI); }  int i6 = this.w.b + this.b.a(40); int i7 = this.b.a(140); int i8 = (int)(this.b.cm / 2.0F - (i7 / 2)); int i9 = i6; int i10 = Color.a(140, 100, 100, 100); if (this.a.a(i8, i9, i7, i2, com.corrodinggames.rts.gameFramework.e.a.a("menus.ingame.resume", new Object[0]), g.a, false, i10, this.a.ax)) { this.a.O = false; this.a.aO = 40.0F; this.a.p = false; }  i9 += i3; for (byte b = 0; b < menu.size(); b++) { MenuItem menuItem = menu.getItem(b); if (this.a.a(i8, i9, i7, i2, menuItem.getTitle().toString(), g.a, false, i10, this.a.ax)) { a(menuItem.getItemId()); this.a.O = false; this.a.aO = 40.0F; }  i9 += i3; }  }  } public void m() { a(20); } public void n() { a(16); } void a(int paramInt) { d d1 = this.b.aj; if (d1 == null) { l.b("selectMenuOption: gameView==null"); return; }  e e1 = d1.k(); if (e1 == null) { l.b("selectMenuOption: inGameActivity==null"); return; }  e1.c(paramInt); }
/*      */   Menu o() { this.aP.clear(); d d1 = this.b.aj; if (d1 == null) { l.b("selectMenuOption: gameView==null"); return this.aP; }  e e1 = d1.k(); if (e1 == null) { l.b("selectMenuOption: inGameActivity==null"); return this.aP; }  e1.a(this.aP); return this.aP; }
/*      */   void g(float paramFloat) { float f1 = 30.0F * this.b.bQ; int i = (int)(this.b.co - f1); int j = i; int k = (int)(this.b.bS - this.b.bX + 10.0F); int n = (int)(this.b.bX - 20.0F) / 3; int i1 = n - 5; byte b1 = 100; byte b2 = 50; for (byte b3 = 0; b3 < this.aC.size(); b3++) { v v = this.aC.get(b3); if (v.h) { v.e(); v.h = false; }  v.d(); if (this.b.by.keyboardSupport) if (b3 < this.b.bB.ah.length) { if (this.b.bB.aj[b3].a()) { v.b(); v.c(); }  if (this.b.bB.ai[b3].a()) { this.a.k(); v.a(); }  if (this.b.bB.ah[b3].a()) { this.a.k(); this.a.w(); v.a(); }  }   if (this.b.by.showUnitGroups) if (b3 < 3) { String str; if (v.a.size() == 0) { if (this.a.bv) { str = "Empty"; } else { str = "(" + (b3 + 1) + ")"; }  } else { str = "" + v.a.size(); }  boolean bool = false; v.d = f.a(v.d, 0.01F * paramFloat); v.e = f.a(v.e, 0.01F * paramFloat); v.f = f.a(v.f, 0.01F * paramFloat); int i2 = Color.a(50, (int)(100.0F + v.f * 100.0F), (int)(100.0F + v.e * 100.0F), (int)(100.0F + v.d * 100.0F)); if (this.a.a(k, j, i1, (int)(31.0F * this.b.bQ), str, g.a, true, i2) && this.a.W == null && !this.a.N) { bool = true; v.b += paramFloat; this.a.d(); float f2 = 1.0F; this.i.a(); this.i.b(Color.a(120, 200, 0, 0)); if (v.b < 50.0F) { f2 = v.b / 50.0F; this.i.b(Color.a((int)(150.0F + f2 * 40.0F), 0, 200, 0)); a(k, j, i1, "Select Group", "(Hold for more..)", this.i, f2); } else if (v.b < 100.0F) { f2 = (v.b - 50.0F) / 50.0F; this.i.b(Color.a((int)(150.0F + f2 * 40.0F), 200, 0, 0)); a(k, j, i1, "Add to Group", "(Hold for more..)", this.i, f2); } else { a(k, j, i1, "Replace Group", "", this.i, 0.0F); }  int i3 = (int)(31.0F * this.b.bQ); this.w.a(k, (int)((j + i3) - i3 * f2), k + i1, j + i3); this.b.bw.b(this.w, this.i); }  if (!bool) { if (v.b != 0.0F && !this.a.D) if (v.b > 100.0F) { v.b(); v.c(); v.f = 1.0F; } else if (v.b > 50.0F) { v.c(); this.a.k(); this.a.w(); v.a(); v.e = 1.0F; } else if (v.a.size() != 0) { this.a.k(); this.a.w(); v.a(); v.d = 1.0F; } else { v.b(); v.c(); v.e = 1.0F; }   if (!bool) v.b = 0.0F;  }  k += n; }   }  }
/*      */   public void a(ap paramap) { int i = this.aC.size(); paramap.a(i); for (v v : this.aC) v.a(paramap);  paramap.c(0); }
/*      */   public void a(k paramk, boolean paramBoolean) { if (!paramBoolean) this.aC.clear();  int i = paramk.f(); for (byte b = 0; b < i; b++) { v v = new v(this, (b < 3)); v.a(paramk); if (!paramBoolean) this.aC.add(v);  }  paramk.d(); }
/* 5336 */   public void q() { this.aQ = e.a(); }
/*      */ 
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
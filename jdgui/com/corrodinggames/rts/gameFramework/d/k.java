/*      */ package com.corrodinggames.rts.gameFramework.d;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.Color;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.Rect;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.f;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.gameFramework.b.a;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.i;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class k
/*      */ {
/*      */   float a;
/*      */   float b;
/*   32 */   public float c = 120.0F;
/*   33 */   public float d = 120.0F;
/*      */   
/*      */   public boolean e;
/*      */   
/*      */   public boolean f;
/*      */   
/*      */   public int g;
/*      */   
/*      */   public int h;
/*      */   
/*      */   public float i;
/*      */   
/*      */   public float j;
/*      */   
/*      */   int k;
/*      */   int l;
/*      */   boolean m;
/*   50 */   final Paint n = new Paint();
/*      */   
/*   52 */   final Paint o = new Paint();
/*      */   
/*   54 */   final Paint p = new Paint();
/*      */   
/*   56 */   float q = 0.0F;
/*      */ 
/*      */   
/*   59 */   float r = 0.0F;
/*      */ 
/*      */   
/*   62 */   final Paint s = (Paint)new q();
/*      */   
/*   64 */   final Paint t = new Paint();
/*   65 */   final Paint u = new Paint();
/*   66 */   final Paint v = new Paint();
/*      */   
/*   68 */   public final Rect w = new Rect();
/*      */ 
/*      */ 
/*      */   
/*   72 */   final Paint x = (Paint)new q();
/*   73 */   final Paint y = (Paint)new q();
/*   74 */   final Paint z = (Paint)new q();
/*      */   
/*   76 */   final Paint A = (Paint)new q();
/*   77 */   final Paint B = (Paint)new q();
/*   78 */   final Paint C = (Paint)new q();
/*      */ 
/*      */   
/*   81 */   final Paint D = (Paint)new q();
/*      */ 
/*      */   
/*   84 */   final Rect E = new Rect();
/*      */ 
/*      */ 
/*      */   
/*      */   e F;
/*      */ 
/*      */   
/*      */   l G;
/*      */ 
/*      */   
/*      */   e H;
/*      */ 
/*      */   
/*      */   l I;
/*      */ 
/*      */   
/*      */   public e J;
/*      */ 
/*      */   
/*      */   l K;
/*      */ 
/*      */   
/*  106 */   float L = 0.0F;
/*      */   
/*      */   float M;
/*      */   
/*      */   float N;
/*      */   
/*      */   public boolean O = false;
/*      */   
/*      */   public boolean P = false;
/*      */   
/*  116 */   public float Q = 0.0F;
/*      */ 
/*      */ 
/*      */   
/*  120 */   int R = 30;
/*  121 */   int S = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e T;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e U;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  141 */   final Rect V = new Rect();
/*      */   
/*      */   q[] W;
/*      */   
/*      */   q X;
/*      */   
/*      */   float Y;
/*      */   
/*  149 */   public final ArrayList Z = new ArrayList();
/*  150 */   public final ArrayList aa = new ArrayList();
/*  151 */   private final ArrayList ag = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, float paramFloat, af paramaf) {
/*  157 */     boolean bool = (paramaf != null && paramaf.bw());
/*      */     
/*  159 */     for (m m1 : this.Z) {
/*      */       
/*  161 */       if (m1.a == bool && 
/*  162 */         f.c(paramInt1 - m1.b) < 40 && 
/*  163 */         f.c(paramInt2 - m1.c) < 40) {
/*      */ 
/*      */         
/*  166 */         m1.d += paramFloat;
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  174 */     m m = new m(this, paramFloat, paramInt1, paramInt2, bool);
/*      */     
/*  176 */     this.Z.add(m);
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
/*      */   public void a(Context paramContext) {
/*  257 */     this.o.a(Paint.Style.b);
/*  258 */     this.o.a(1.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  263 */     this.s.a(255, 255, 255, 255);
/*  264 */     this.s.a(Paint.Style.b);
/*  265 */     this.s.a(1.0F);
/*      */ 
/*      */     
/*  268 */     this.W = new q[11];
/*      */     
/*  270 */     for (byte b = 0; b <= 10; b++) {
/*      */       
/*  272 */       this.W[b] = new q();
/*  273 */       this.W[b].b(-16777216);
/*  274 */       this.W[b].a(Paint.Style.a);
/*  275 */       this.W[b].c(b * 25);
/*      */     } 
/*      */ 
/*      */     
/*  279 */     this.X = new q();
/*  280 */     this.X.b(-16777216);
/*  281 */     this.X.a(Paint.Style.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  289 */     this.t.a(255, 255, 0, 0);
/*  290 */     this.t.a(Paint.Style.b);
/*  291 */     this.t.a(2.0F);
/*      */     
/*  293 */     this.u.a(155, 255, 0, 0);
/*  294 */     this.u.a(Paint.Style.b);
/*  295 */     this.u.a(2.0F);
/*      */ 
/*      */     
/*  298 */     this.v.a(200, 12, 227, 219);
/*  299 */     this.v.a(Paint.Style.b);
/*  300 */     this.v.a(2.0F);
/*      */     
/*  302 */     this.x.b(-16711936);
/*  303 */     this.y.b(-256);
/*  304 */     this.z.b(-65536);
/*      */     
/*  306 */     this.A.b(a(this.x.e()));
/*  307 */     this.B.b(a(this.y.e()));
/*  308 */     this.C.b(a(this.z.e()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  315 */     this.D.a(210, 255, 255, 255);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int a(int paramInt) {
/*  323 */     return Color.a(Color.a(paramInt), 
/*  324 */         (int)(Color.b(paramInt) * 0.5F), 
/*  325 */         (int)(Color.c(paramInt) * 0.5F), 
/*  326 */         (int)(Color.d(paramInt) * 0.5F));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  335 */     l l1 = l.u();
/*      */ 
/*      */     
/*  338 */     if (!f.bz) {
/*      */       
/*  340 */       this.a = (int)(l1.bS - this.c + 0.0F);
/*  341 */       this.b = 0.0F;
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  347 */       this.a = 0.0F;
/*  348 */       this.b = (int)(l1.bT - this.d + 0.0F);
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
/*      */   public int b() {
/*  360 */     return (int)(this.b + this.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(b paramb, boolean paramBoolean) {
/*  369 */     this.af.clear();
/*      */     
/*  371 */     if (paramBoolean) {
/*      */       
/*  373 */       this.m = true;
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/*  380 */     this.g = 1;
/*  381 */     this.h = 1;
/*  382 */     this.i = 1.0F;
/*  383 */     this.j = 1.0F;
/*      */     
/*  385 */     this.f = false;
/*      */ 
/*      */ 
/*      */     
/*  389 */     this.e = false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  395 */     if (this.J != null) {
/*      */       
/*  397 */       this.J.n();
/*  398 */       this.J = null;
/*      */     } 
/*      */     
/*  401 */     if (this.F != null) {
/*      */       
/*  403 */       this.F.n();
/*  404 */       this.F = null;
/*      */     } 
/*      */     
/*  407 */     if (this.T != null) {
/*      */       
/*  409 */       this.T.n();
/*  410 */       this.T = null;
/*      */     } 
/*      */     
/*  413 */     if (this.U != null) {
/*      */       
/*  415 */       this.U.n();
/*  416 */       this.U = null;
/*      */     } 
/*      */ 
/*      */     
/*  420 */     if (this.I != null) {
/*      */       
/*  422 */       this.I.n();
/*  423 */       this.I = null;
/*      */     } 
/*      */     
/*  426 */     if (this.H != null) {
/*      */       
/*  428 */       this.H.n();
/*  429 */       this.H = null;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  434 */     this.K = null;
/*      */     
/*  436 */     this.e = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float d() {
/*  444 */     l l1 = l.u();
/*  445 */     return l1.bX;
/*      */   }
/*      */ 
/*      */   
/*      */   public void e() {
/*  450 */     l l1 = l.u();
/*      */     
/*  452 */     f();
/*      */     
/*  454 */     l.d("Creating minimap image buffers..");
/*      */     
/*  456 */     if (this.F == null) {
/*      */       
/*  458 */       this.F = l1.bw.a((int)this.c, (int)this.d, false);
/*  459 */       this.G = l1.bw.a(this.F);
/*      */     } 
/*      */     
/*  462 */     if (this.J == null) {
/*      */       
/*  464 */       this.J = l1.bw.a((int)this.c, (int)this.d, false);
/*  465 */       this.K = l1.bw.a(this.J);
/*      */     } 
/*      */     
/*  468 */     if (this.H == null) {
/*      */       
/*  470 */       this.H = l1.bw.a((int)this.c, (int)this.d, false);
/*  471 */       this.I = l1.bw.a(this.H);
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
/*      */   public void f() {
/*  487 */     this.c = d();
/*  488 */     this.d = this.c;
/*      */     
/*  490 */     a();
/*      */   }
/*      */ 
/*      */   
/*      */   public void g() {
/*  495 */     boolean bool1 = true;
/*      */     
/*  497 */     long l1 = bj.a();
/*      */     
/*  499 */     l.d("--setting up minimap--");
/*      */ 
/*      */     
/*  502 */     l l2 = l.u();
/*      */     
/*  504 */     f();
/*      */     
/*  506 */     this.g = l2.bt.r.n * l2.bt.k;
/*  507 */     this.h = l2.bt.r.o * l2.bt.l;
/*      */     
/*  509 */     this.i = 1.0F / this.g;
/*  510 */     this.j = 1.0F / this.h;
/*      */     
/*  512 */     this.f = true;
/*      */ 
/*      */ 
/*      */     
/*  516 */     e();
/*      */     
/*  518 */     this.Z.clear();
/*  519 */     this.aa.clear();
/*  520 */     this.ag.clear();
/*      */     
/*  522 */     for (Point point : l2.bt.w)
/*      */     {
/*  524 */       this.ag.add(new p(this, point.a, point.b));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  533 */     this.G.b(-16777216);
/*  534 */     this.K.b(-16777216);
/*      */     
/*  536 */     boolean bool2 = false;
/*  537 */     boolean bool3 = false;
/*  538 */     boolean bool4 = false;
/*      */ 
/*      */     
/*  541 */     if (!bool1) {
/*      */       
/*  543 */       Rect rect = new Rect(0, 0, (int)this.c, (int)this.d);
/*      */ 
/*      */       
/*  546 */       l2.bt.r.a(this.G, 0.0F, 0.0F, 0.0F, 0.0F, this.g, this.h, this.c / this.g, this.d / this.h, false, false, false);
/*      */ 
/*      */       
/*  549 */       Paint paint = new Paint();
/*  550 */       paint.a(50, 0, 0, 0);
/*  551 */       this.G.b(rect, paint);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  574 */       byte b1 = 2;
/*      */       
/*  576 */       for (byte b2 = 0; b2 < b1; b2++) {
/*      */         
/*  578 */         for (byte b = 0; b < b1; b++) {
/*      */           
/*  580 */           this.I.b(-16777216);
/*      */ 
/*      */           
/*  583 */           int j = (int)this.c / b1;
/*  584 */           int m = (int)this.d / b1;
/*      */ 
/*      */           
/*  587 */           int n = this.g / b1;
/*  588 */           int i1 = this.h / b1;
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  593 */           l2.bt.r.a(this.I, (n * b2), (i1 * b), (n * b2), (i1 * b), n, i1, this.c / n, this.d / i1, false, false, false);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  598 */           Rect rect1 = new Rect(0, 0, (int)this.c, (int)this.d);
/*  599 */           Rect rect2 = new Rect(j * b2, m * b, j * (b2 + 1), m * (b + 1));
/*      */ 
/*      */           
/*  602 */           Paint paint1 = new Paint();
/*  603 */           paint1.a(true);
/*  604 */           paint1.d(true);
/*  605 */           paint1.b(true);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  611 */           this.K.a(this.H, rect1, rect2, paint1);
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
/*  622 */       Rect rect = new Rect(0, 0, (int)this.c, (int)this.d);
/*  623 */       Paint paint = new Paint();
/*  624 */       paint.a(true);
/*  625 */       paint.d(true);
/*  626 */       paint.b(true);
/*  627 */       paint.a(200, 255, 255, 255);
/*  628 */       this.G.a(this.J, rect, rect, paint);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  638 */     this.I.b(-16777216);
/*  639 */     this.K.b(-16777216);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  658 */     this.M = 50.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  666 */     a(0.0F, 1.0F);
/*      */ 
/*      */ 
/*      */     
/*  670 */     this.e = true;
/*      */ 
/*      */ 
/*      */     
/*  674 */     double d = bj.a(l1);
/*      */     
/*  676 */     l.d("Minimap map render took:" + bj.a(d));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  683 */   Rect ab = new Rect();
/*      */ 
/*      */ 
/*      */   
/*      */   void a(float paramFloat1, float paramFloat2) {
/*  688 */     l l1 = l.u();
/*      */ 
/*      */     
/*  691 */     this.ab.a(0, (int)(paramFloat1 * this.d), (int)this.c, (int)(paramFloat2 * this.d));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  696 */     this.I.a(this.F, this.ab, this.ab, null);
/*      */     
/*  698 */     b b = l1.bt;
/*      */     
/*  700 */     if (b.A) {
/*      */ 
/*      */ 
/*      */       
/*  704 */       boolean bool = b.C;
/*      */       
/*  706 */       q q1 = this.W[5];
/*  707 */       q q2 = this.W[10];
/*      */       
/*  709 */       q q3 = this.X;
/*      */       
/*  711 */       q3.c(255);
/*      */ 
/*      */       
/*  714 */       if (bool) {
/*      */         
/*  716 */         q2 = this.W[7];
/*  717 */         float f = 1.0F - (1.0F - q1.f() / 255.0F) * (1.0F - q2.f() / 255.0F);
/*  718 */         q3.c((int)(f * 255.0F));
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
/*  729 */       float f1 = this.c / b.y;
/*  730 */       float f2 = this.d / b.z;
/*      */       
/*  732 */       byte b1 = 0;
/*  733 */       byte b2 = 0;
/*      */ 
/*      */       
/*  736 */       int j = (int)(paramFloat1 * b.z) - 1;
/*  737 */       int m = (int)(paramFloat2 * b.z) + 1;
/*      */       
/*  739 */       if (j < 0) j = 0; 
/*  740 */       if (m < 0) m = 0;
/*      */       
/*  742 */       if (j > l1.bt.z) j = b.z; 
/*  743 */       if (m > l1.bt.z) m = b.z;
/*      */ 
/*      */       
/*  746 */       byte[][] arrayOfByte = l1.bb.C;
/*      */       
/*  748 */       if (arrayOfByte != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  762 */         int n = b.y;
/*  763 */         Rect rect = this.V;
/*      */         
/*  765 */         for (int i1 = j; i1 < m; i1++) {
/*      */           
/*  767 */           for (byte b3 = 0; b3 < n; b3++) {
/*      */             
/*  769 */             byte b4 = arrayOfByte[b3][i1];
/*      */             
/*  771 */             if (b4 != 0) {
/*      */               q q4;
/*  773 */               byte b5 = b3;
/*  774 */               byte b6 = b3;
/*      */               
/*  776 */               while (b6 < n - 1) {
/*      */                 
/*  778 */                 if (arrayOfByte[b6][i1] == b4)
/*      */                 {
/*  780 */                   b6++;
/*      */                 }
/*      */               } 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  787 */               b3 = b6;
/*      */ 
/*      */               
/*  790 */               rect.a(b1 + (int)(b5 * f1), b2 + (int)(i1 * f2), b1 + (int)((b6 + 1) * f1), b2 + (int)((i1 + 1) * f2));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  808 */               if (b4 == 10) {
/*      */                 
/*  810 */                 q4 = q3;
/*      */               }
/*      */               else {
/*      */                 
/*  814 */                 q4 = q1;
/*      */               } 
/*      */ 
/*      */               
/*  818 */               this.I.b(rect, (Paint)q4);
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
/*  833 */     this.K.a(this.H, this.ab, this.ab, null);
/*      */ 
/*      */     
/*  836 */     if (l.aI);
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
/*  847 */   static ArrayList ac = new ArrayList();
/*      */ 
/*      */   
/*      */   static o a(int paramInt, Paint paramPaint) {
/*  851 */     synchronized (ac) {
/*      */       
/*  853 */       o o = null;
/*      */ 
/*      */       
/*  856 */       Iterator<o> iterator = ac.iterator();
/*  857 */       while (iterator.hasNext()) {
/*      */         
/*  859 */         o o1 = iterator.next();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  870 */         if (o1.d >= paramInt)
/*      */         {
/*  872 */           if (o == null || o1.d < o.d)
/*      */           {
/*  874 */             o = o1;
/*      */           }
/*      */         }
/*      */       } 
/*      */       
/*  879 */       if (o != null) {
/*      */         
/*  881 */         ac.remove(o);
/*      */         
/*  883 */         o.c = paramPaint;
/*  884 */         return o;
/*      */       } 
/*      */     } 
/*      */     
/*  888 */     return new o(paramInt + 15, paramPaint);
/*      */   }
/*      */ 
/*      */   
/*      */   static void a(o paramo) {
/*  893 */     paramo.c = null;
/*  894 */     paramo.b = 0;
/*      */     
/*  896 */     synchronized (ac) {
/*      */       
/*  898 */       if (ac.size() < 20) {
/*      */         
/*  900 */         ac.add(paramo);
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  905 */       Iterator<o> iterator = ac.iterator();
/*  906 */       while (iterator.hasNext()) {
/*      */         
/*  908 */         o o1 = iterator.next();
/*      */         
/*  910 */         if (o1.d < paramo.d) {
/*      */           
/*  912 */           iterator.remove();
/*  913 */           ac.add(paramo);
/*      */           return;
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
/*      */   void a(l paraml, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
/*      */     int j, m, n, i1;
/*  964 */     l l1 = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  971 */     byte b = 1;
/*      */     
/*  973 */     if (this.c < 50.0F) {
/*      */       
/*  975 */       j = m = 0;
/*  976 */       n = i1 = 1;
/*      */       
/*  978 */       b = 1;
/*      */     
/*      */     }
/*  981 */     else if (this.c < 120.0F) {
/*      */       
/*  983 */       j = m = 0;
/*  984 */       n = i1 = 2;
/*      */       
/*  986 */       b = 2;
/*      */     }
/*      */     else {
/*      */       
/*  990 */       j = m = -1;
/*  991 */       n = i1 = 2;
/*      */       
/*  993 */       b = 3;
/*      */     } 
/*      */     
/*  996 */     j += paramInt1;
/*  997 */     i1 += paramInt1;
/*      */     
/*  999 */     n += paramInt2;
/* 1000 */     m += paramInt2;
/*      */ 
/*      */ 
/*      */     
/* 1004 */     boolean bool = false;
/* 1005 */     if (l1.bb.b() || l1.bJ.h())
/*      */     {
/* 1007 */       bool = true;
/*      */     }
/*      */     
/* 1010 */     for (byte b1 = -1; b1 < m.a; b1++) {
/*      */       
/* 1012 */       m m1 = m.n(b1);
/*      */       
/* 1014 */       if (m1 != null) {
/*      */ 
/*      */         
/* 1017 */         Paint paint1 = m1.T;
/*      */         
/* 1019 */         if (l1.by.useMinimapAllyColors)
/*      */         {
/* 1021 */           if (bool) {
/*      */             
/* 1023 */             this.p.b(m.m(m1.o));
/* 1024 */             paint1 = this.p;
/*      */           }
/* 1026 */           else if (l1.bb == m1) {
/*      */             
/* 1028 */             paint1 = this.x;
/*      */           }
/* 1030 */           else if (l1.bb.d(m1)) {
/*      */             
/* 1032 */             paint1 = this.y;
/*      */           }
/* 1034 */           else if (l1.bb.c(m1)) {
/*      */             
/* 1036 */             paint1 = this.z;
/*      */           } 
/*      */         }
/*      */         
/* 1040 */         byte b2 = 0;
/*      */         
/* 1042 */         if (m1.a(true, false) > 0) {
/*      */           
/* 1044 */           af[] arrayOfAf = af.bj.a(); byte b5; int i3;
/* 1045 */           for (b5 = 0, i3 = af.bj.size(); b5 < i3; b5++) {
/*      */             
/* 1047 */             af af = arrayOfAf[b5];
/*      */             
/* 1049 */             if (af.bB == m1 && af.ct)
/*      */             {
/* 1051 */               b2++;
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 1057 */         if (b2 > 0) {
/*      */           
/* 1059 */           paint1.a(b);
/*      */           
/* 1061 */           o o = a(b2, paint1);
/*      */ 
/*      */           
/* 1064 */           af[] arrayOfAf = af.bj.a(); byte b5; int i3;
/* 1065 */           for (b5 = 0, i3 = af.bj.size(); b5 < i3; b5++) {
/*      */             
/* 1067 */             af af = arrayOfAf[b5];
/*      */             
/* 1069 */             if (af.bB == m1 && af.ct)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1086 */               o.a(af.cu, af.cv);
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1094 */           if (o.b != 0)
/*      */           {
/* 1096 */             l1.bw.a(o);
/*      */           }
/*      */         } 
/*      */         
/* 1100 */         Paint paint2 = m1.U;
/*      */         
/* 1102 */         if (l1.by.useMinimapAllyColors)
/*      */         {
/* 1104 */           if (bool) {
/*      */ 
/*      */             
/* 1107 */             this.p.b(m.m(m1.o));
/* 1108 */             paint1 = this.p;
/*      */           }
/* 1110 */           else if (l1.bb == m1) {
/*      */             
/* 1112 */             paint2 = this.A;
/*      */           }
/* 1114 */           else if (l1.bb.d(m1)) {
/*      */             
/* 1116 */             paint2 = this.B;
/*      */           }
/* 1118 */           else if (l1.bb.c(m1)) {
/*      */             
/* 1120 */             paint2 = this.C;
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/* 1125 */         byte b3 = 0;
/*      */ 
/*      */ 
/*      */         
/* 1129 */         Object[] arrayOfObject = a.w.b(); int i2;
/* 1130 */         for (byte b4 = 0; b4 < i2; b4++) {
/*      */           
/* 1132 */           a a = (a)arrayOfObject[b4];
/*      */           
/* 1134 */           if (a.e == m1 && a.k)
/*      */           {
/* 1136 */             b3++;
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1143 */         if (b3 > 0) {
/*      */           
/* 1145 */           paint2.a(b);
/*      */           
/* 1147 */           o o = a(b3, paint2);
/*      */ 
/*      */ 
/*      */           
/* 1151 */           Object[] arrayOfObject1 = a.w.b(); int i3;
/* 1152 */           for (i2 = 0, i3 = a.w.size(); i2 < i3; i2++) {
/*      */             
/* 1154 */             a a = (a)arrayOfObject1[i2];
/*      */             
/* 1156 */             if (a.e == m1 && a.k)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1164 */               o.a(a.l, a.m);
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1170 */           if (o.b != 0)
/*      */           {
/* 1172 */             l1.bw.a(o);
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
/*      */   public void a(int paramInt1, int paramInt2, n paramn) {
/* 1194 */     l l1 = new l(this);
/* 1195 */     l1.a = paramInt1;
/* 1196 */     l1.b = paramInt2;
/*      */     
/* 1198 */     l1.e = paramn;
/* 1199 */     l1.c = 0.9F;
/* 1200 */     l1.d = 0.9F;
/*      */     
/* 1202 */     this.aa.add(l1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 1209 */     l l1 = l.u();
/*      */     
/* 1211 */     this.m = false;
/* 1212 */     this.k = (int)this.a;
/* 1213 */     this.l = (int)this.b;
/*      */     
/* 1215 */     af[] arrayOfAf = af.bj.a(); int j;
/* 1216 */     for (byte b = 0; b < j; b++) {
/*      */       
/* 1218 */       af af = arrayOfAf[b];
/*      */       
/* 1220 */       if (!af.bz && af.cp == null && af.bR() && af.b_() && !af.o_()) {
/*      */ 
/*      */         
/* 1223 */         Point point = b(af.dH, af.dI);
/* 1224 */         af.cu = point.a;
/* 1225 */         af.cv = point.b;
/*      */         
/* 1227 */         af.ct = true;
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/* 1234 */         af.ct = false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1240 */     Object[] arrayOfObject = a.w.b(); int n;
/* 1241 */     for (j = 0, n = a.w.size(); j < n; j++) {
/*      */       
/* 1243 */       a a = (a)arrayOfObject[j];
/*      */       
/* 1245 */       if (!a.n && a.u) {
/*      */         
/* 1247 */         Point point = b(a.g, a.h);
/* 1248 */         a.l = point.a;
/* 1249 */         a.m = point.b;
/* 1250 */         a.k = true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1255 */     m m = l1.bb;
/* 1256 */     for (p p : this.ag) {
/*      */       
/* 1258 */       p.e = false;
/*      */       
/* 1260 */       if (l1.bt.a(m, p.a, p.b)) {
/*      */         
/* 1262 */         p.e = true;
/* 1263 */         Point point = b((p.a * l1.bt.k), (p.b * l1.bt.l));
/* 1264 */         p.c = point.a;
/* 1265 */         p.d = point.b;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/* 1274 */     if (l.aF && !l.aG) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1280 */     l l1 = l.u();
/*      */ 
/*      */     
/* 1283 */     this.L = f.a(this.L, paramFloat);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1289 */     if (this.L == 0.0F) {
/*      */       
/* 1291 */       this.L = 15.0F;
/*      */       
/* 1293 */       h();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1301 */     this.Y += paramFloat;
/*      */     
/* 1303 */     if (this.Y > 15.0F) {
/*      */       
/* 1305 */       m m = null;
/*      */       
/* 1307 */       for (m m1 : this.Z) {
/*      */         
/* 1309 */         if (m1.e != 0.0F) {
/*      */           
/* 1311 */           m1.d = 0.0F;
/*      */ 
/*      */         
/*      */         }
/* 1315 */         else if (m1.d > 15.0F) {
/*      */           
/* 1317 */           m1.d = 0.0F;
/* 1318 */           m1.e = 300.0F;
/*      */           
/* 1320 */           l l2 = new l(this);
/* 1321 */           l2.a = m1.b;
/* 1322 */           l2.b = m1.c;
/*      */           
/* 1324 */           if (m1.a) {
/*      */             
/* 1326 */             l2.e = n.a;
/*      */           }
/*      */           else {
/*      */             
/* 1330 */             l2.e = n.b;
/* 1331 */             l2.c = 0.4F;
/* 1332 */             l2.d = 0.8F;
/*      */           } 
/*      */           
/* 1335 */           this.aa.add(l2);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1341 */         m1.d = f.a(m1.d, 2.0F * this.Y);
/*      */         
/* 1343 */         m1.e = f.a(m1.e, this.Y);
/*      */ 
/*      */         
/* 1346 */         if (m1.d == 0.0F && m1.e == 0.0F)
/*      */         {
/* 1348 */           m = m1;
/*      */         }
/*      */       } 
/*      */       
/* 1352 */       if (m != null)
/*      */       {
/* 1354 */         this.Z.remove(m);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1359 */       for (l l2 : this.aa) {
/*      */         
/* 1361 */         if (l2.e != n.d)
/*      */         {
/* 1363 */           if (l1.cx.b(l2.a, l2.b)) {
/*      */             
/* 1365 */             l2.c = 0.0F;
/* 1366 */             l2.d = 0.0F;
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1372 */       this.Y = 0.0F;
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
/* 1407 */   Point ad = new Point();
/*      */ 
/*      */   
/*      */   public float b(float paramFloat) {
/* 1411 */     return paramFloat * this.i * this.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public Point b(float paramFloat1, float paramFloat2) {
/* 1416 */     if (!this.f) {
/*      */       
/* 1418 */       this.ad.a(-1, -1);
/* 1419 */       return this.ad;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1425 */     int j = (int)(paramFloat1 * this.i * this.c + this.a);
/* 1426 */     int m = (int)(paramFloat2 * this.j * this.d + this.b);
/*      */     
/* 1428 */     this.ad.a(j, m);
/* 1429 */     return this.ad;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Point c(float paramFloat1, float paramFloat2) {
/* 1437 */     if (paramFloat1 < this.a || paramFloat2 < this.b || paramFloat1 > this.a + this.c || paramFloat2 > this.b + this.d)
/*      */     {
/*      */       
/* 1440 */       return null;
/*      */     }
/*      */     
/* 1443 */     int j = (int)((paramFloat1 - this.a) / this.c * this.g);
/* 1444 */     int m = (int)((paramFloat2 - this.b) / this.d * this.h);
/*      */     
/* 1446 */     this.ad.a(j, m);
/* 1447 */     return this.ad;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float c(float paramFloat) {
/* 1453 */     if (paramFloat < this.a) return this.a; 
/* 1454 */     if (paramFloat > this.a + this.c) return this.a + this.c; 
/* 1455 */     return paramFloat;
/*      */   }
/*      */ 
/*      */   
/*      */   public float d(float paramFloat) {
/* 1460 */     if (paramFloat < this.b) return this.b; 
/* 1461 */     if (paramFloat > this.b + this.d) return this.b + this.d; 
/* 1462 */     return paramFloat;
/*      */   }
/*      */   
/* 1465 */   i ae = new k$1(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(float paramFloat) {
/* 1480 */     l l1 = l.u();
/* 1481 */     l l2 = l1.bw;
/*      */ 
/*      */     
/* 1484 */     a();
/*      */ 
/*      */ 
/*      */     
/* 1488 */     if (this.J != null)
/*      */     {
/* 1490 */       if (!f.e(this.c, d(), 5.0F)) {
/*      */         
/* 1492 */         l.b("minimap", "minimap size has changed, reseting");
/* 1493 */         c();
/*      */       } 
/*      */     }
/*      */     
/* 1497 */     if (!this.e || this.J == null)
/*      */     {
/* 1499 */       g();
/*      */     }
/*      */ 
/*      */     
/* 1503 */     if (this.k != (int)this.a || this.l != (int)this.b || this.m)
/*      */     {
/*      */       
/* 1506 */       h();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1513 */     if (l1.bt.A) {
/*      */ 
/*      */       
/* 1516 */       if (this.O && !this.P) {
/*      */         
/* 1518 */         this.M = f.a(this.M, 1.0F);
/* 1519 */         if (this.M == 0.0F) {
/*      */           
/* 1521 */           this.M = 40.0F;
/*      */           
/* 1523 */           this.O = false;
/* 1524 */           this.Q = 0.0F;
/* 1525 */           this.P = true;
/*      */         } 
/*      */       } 
/*      */       
/* 1529 */       if (this.P) {
/*      */         
/* 1531 */         this.N = f.a(this.N, 1.0F);
/*      */         
/* 1533 */         if (this.N == 0.0F) {
/*      */           
/* 1535 */           this.N = 3.0F;
/*      */           
/* 1537 */           if (this.J != null) {
/*      */             
/* 1539 */             float f = this.Q - 0.005F;
/* 1540 */             this.Q = (float)(this.Q + 0.04D);
/*      */             
/* 1542 */             if (f < 0.0F)
/*      */             {
/* 1544 */               f = 0.0F;
/*      */             }
/* 1546 */             if (this.Q >= 1.0F) {
/*      */               
/* 1548 */               this.Q = 1.0F;
/* 1549 */               this.P = false;
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 1554 */             a(f, this.Q);
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
/* 1566 */     l2.b(this.J, this.a, this.b, this.n);
/*      */ 
/*      */ 
/*      */     
/* 1570 */     this.w.a((int)this.a, (int)this.b, (int)(this.a + this.c), (int)((this.b + this.d) - 0.4D));
/*      */ 
/*      */     
/* 1573 */     boolean bool1 = false;
/* 1574 */     boolean bool2 = false;
/*      */ 
/*      */     
/* 1577 */     boolean bool3 = false;
/*      */     
/* 1579 */     Object[] arrayOfObject = f.a.a(); byte b; int j;
/* 1580 */     for (b = 0, j = f.a.a; b < j; b++) {
/*      */       
/* 1582 */       f f = (f)arrayOfObject[b];
/*      */       
/* 1584 */       if (f.D) {
/*      */         
/* 1586 */         bool3 = true;
/* 1587 */         bool2 = true;
/*      */       } 
/*      */     } 
/*      */     
/* 1591 */     for (l l3 : this.aa) {
/*      */       
/* 1593 */       if (l3.e != n.b) {
/*      */         
/* 1595 */         bool1 = true;
/*      */         
/* 1597 */         if (l3.e != n.d)
/*      */         {
/* 1599 */           bool2 = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1605 */     if (!bool1 && !bool3) {
/*      */       
/* 1607 */       this.o.a(255, 100, 100, 100);
/* 1608 */       this.o.a(1.0F);
/*      */       
/* 1610 */       if (f.bw)
/*      */       {
/* 1612 */         this.o.a(115, 0, 0, 0);
/* 1613 */         this.o.a(2.0F);
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1621 */       this.q += 5.0F * paramFloat;
/*      */       
/* 1623 */       if (this.q > 180.0F)
/*      */       {
/* 1625 */         this.q -= 180.0F;
/*      */       }
/* 1627 */       float f = f.h(this.q);
/*      */       
/* 1629 */       if (bool3) {
/*      */         
/* 1631 */         this.o.a(255, 0, (int)(0.0F + f * 230.0F), 0);
/*      */       }
/* 1633 */       else if (!bool2) {
/*      */         
/* 1635 */         this.o.a(255, 12, (int)(0.0F + f * 220.0F), (int)(0.0F + f * 220.0F));
/*      */       }
/*      */       else {
/*      */         
/* 1639 */         this.o.a(255, (int)(0.0F + f * 230.0F), 0, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1643 */       this.o.a(2.0F);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1649 */     l2.b(this.w, this.o);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1658 */     for (p p : this.ag) {
/*      */       
/* 1660 */       if (p.e) {
/*      */         
/* 1662 */         this.V.a(p.c, p.d, p.c + 2, p.d + 2);
/* 1663 */         l2.b(this.V, this.D);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1695 */     a(l2, 0, 0, 0.0F, 1.0F);
/*      */ 
/*      */ 
/*      */     
/* 1699 */     if (this.af.size() != 0) {
/*      */ 
/*      */ 
/*      */       
/* 1703 */       Iterator<q> iterator1 = this.af.iterator();
/* 1704 */       while (iterator1.hasNext()) {
/* 1705 */         q q1 = iterator1.next();
/*      */ 
/*      */ 
/*      */         
/* 1709 */         if (q1.a.bz) {
/*      */           
/* 1711 */           iterator1.remove();
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1721 */         af af = q1.a;
/*      */ 
/*      */         
/* 1724 */         Point point1 = b(af.dH, af.dI);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1730 */         if (!af.a(point1.a, point1.b))
/*      */         {
/* 1732 */           l2.a(point1.a, point1.b, 4.0F, af.bB.T);
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1739 */     for (b = 0, j = f.a.a; b < j; b++) {
/*      */       
/* 1741 */       f f = (f)arrayOfObject[b];
/*      */       
/* 1743 */       if (f.D || (f.q != null && f.q.D))
/*      */       {
/*      */         
/* 1746 */         if (f.j != null) {
/*      */           
/* 1748 */           Point point1 = b(f.dH, f.dI);
/*      */           
/* 1750 */           float f1 = 2.0F;
/* 1751 */           if (f.D)
/*      */           {
/* 1753 */             f1 = 4.0F;
/*      */           }
/*      */           
/* 1756 */           l2.a(point1.a, point1.b, f1, f.j.bB.T);
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1762 */     Point point = b(l1.cd, l1.ce);
/*      */     
/* 1764 */     this.E.a = point.a;
/* 1765 */     this.E.b = point.b;
/*      */     
/* 1767 */     point = b(l1.cd + l1.ch, l1.ce + l1.ci);
/*      */     
/* 1769 */     this.E.c = point.a;
/* 1770 */     this.E.d = point.b;
/*      */     
/* 1772 */     if (this.E.a < this.w.a) this.E.a = this.w.a; 
/* 1773 */     if (this.E.c > this.w.c) this.E.c = this.w.c;
/*      */     
/* 1775 */     if (this.E.b < this.w.b) this.E.b = this.w.b; 
/* 1776 */     if (this.E.d > this.w.d) this.E.d = this.w.d;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1783 */     l2.b(this.E, this.s);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1788 */     this.r += 6.0F * paramFloat;
/* 1789 */     if (this.r > 180.0F)
/*      */     {
/* 1791 */       this.r -= 180.0F;
/*      */     }
/*      */     
/* 1794 */     for (Iterator<l> iterator = this.aa.iterator(); iterator.hasNext(); ) {
/*      */       Paint paint;
/* 1796 */       l l3 = iterator.next();
/*      */ 
/*      */       
/* 1799 */       Point point1 = b(l3.a, l3.b);
/*      */ 
/*      */       
/* 1802 */       float f1 = l3.c;
/* 1803 */       float f2 = 0.05F;
/*      */ 
/*      */ 
/*      */       
/* 1807 */       if (l3.e == n.b) {
/*      */         
/* 1809 */         paint = this.u;
/* 1810 */         f2 = 0.03F;
/*      */         
/* 1812 */         float f = f.h(this.r);
/* 1813 */         paint.a((int)(50.0F + f * 190.0F), (int)(50.0F + f * 190.0F), 0, 0);
/*      */       
/*      */       }
/* 1816 */       else if (l3.e == n.d) {
/*      */         
/* 1818 */         paint = this.v;
/*      */       }
/*      */       else {
/*      */         
/* 1822 */         paint = this.t;
/*      */         
/* 1824 */         float f = f.h(this.r);
/* 1825 */         paint.a((int)(50.0F + f * 190.0F), (int)(50.0F + f * 190.0F), 0, 0);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1830 */       f1 = f.b(f1, f2, 1.0F);
/*      */ 
/*      */       
/* 1833 */       if (l3.e == n.b) {
/*      */         
/* 1835 */         float f3 = this.c * f1;
/* 1836 */         float f4 = this.d * f1;
/*      */         
/* 1838 */         l2.a(c(point1.a - f3), d(point1.b - f4), 
/* 1839 */             c(point1.a + f3), d(point1.b + f4), paint);
/*      */         
/* 1841 */         l2.a(c(point1.a + f3), d(point1.b - f4), 
/* 1842 */             c(point1.a - f3), d(point1.b + f4), paint);
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 1847 */         l2.a(c(point1.a - this.c * f1), d(point1.b), 
/* 1848 */             c(point1.a + this.c * f1), d(point1.b), paint);
/*      */ 
/*      */         
/* 1851 */         l2.a(c(point1.a), d(point1.b - this.d * f1), 
/* 1852 */             c(point1.a), d(point1.b + this.d * f1), paint);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1858 */       l3.c = f.a(l3.c, 0.04F * paramFloat);
/*      */       
/* 1860 */       if (l3.c == 0.0F) {
/*      */         
/* 1862 */         l3.d = f.a(l3.d, 0.005F * paramFloat);
/*      */         
/* 1864 */         if (l3.d == 0.0F)
/*      */         {
/* 1866 */           iterator.remove();
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
/* 1891 */   ArrayList af = new ArrayList();
/*      */ 
/*      */   
/*      */   public void a(af paramaf) {
/* 1895 */     if (this.af.contains(paramaf)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1902 */     q q1 = new q(this);
/* 1903 */     q1.a = paramaf;
/* 1904 */     this.af.add(q1);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*      */ package com.corrodinggames.rts.gameFramework.d;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.Color;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.Typeface;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.game.a.a;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.d;
/*      */ import com.corrodinggames.rts.game.units.a.e;
/*      */ import com.corrodinggames.rts.game.units.a.g;
/*      */ import com.corrodinggames.rts.game.units.a.i;
/*      */ import com.corrodinggames.rts.game.units.a.j;
/*      */ import com.corrodinggames.rts.game.units.a.q;
/*      */ import com.corrodinggames.rts.game.units.a.r;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.a.u;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.aj;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.an;
/*      */ import com.corrodinggames.rts.game.units.ao;
/*      */ import com.corrodinggames.rts.game.units.custom.ac;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.c;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.d.k;
/*      */ import com.corrodinggames.rts.game.units.h;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.game.units.z;
/*      */ import com.corrodinggames.rts.gameFramework.SettingsEngine;
/*      */ import com.corrodinggames.rts.gameFramework.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.ac;
/*      */ import com.corrodinggames.rts.gameFramework.b.a;
/*      */ import com.corrodinggames.rts.gameFramework.b.d;
/*      */ import com.corrodinggames.rts.gameFramework.b.e;
/*      */ import com.corrodinggames.rts.gameFramework.b.h;
/*      */ import com.corrodinggames.rts.gameFramework.bi;
/*      */ import com.corrodinggames.rts.gameFramework.d.a.a;
/*      */ import com.corrodinggames.rts.gameFramework.d.a.c;
/*      */ import com.corrodinggames.rts.gameFramework.d.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.d.a.j;
/*      */ import com.corrodinggames.rts.gameFramework.e;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f.b;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.u;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class f
/*      */   extends bi
/*      */ {
/*      */   public static boolean a = false;
/*      */   public boolean b = false;
/*      */   h c;
/*      */   public a d;
/*      */   public i e;
/*      */   public y f;
/*  118 */   e g = new e();
/*  119 */   com.corrodinggames.rts.game.units.a.f h = new com.corrodinggames.rts.game.units.a.f();
/*  120 */   i i = new i();
/*  121 */   d j = new d();
/*  122 */   public j k = new j();
/*      */ 
/*      */   
/*  125 */   r l = new r();
/*  126 */   q m = new q();
/*      */ 
/*      */   
/*  129 */   j n = (j)new a();
/*      */ 
/*      */   
/*      */   boolean o = false;
/*      */ 
/*      */   
/*      */   public boolean p = false;
/*      */ 
/*      */   
/*      */   double q;
/*      */   
/*  140 */   float r = 0.0F;
/*  141 */   public float s = 0.0F;
/*  142 */   public float t = 0.0F;
/*  143 */   float u = 40.0F;
/*  144 */   float v = 40.0F;
/*  145 */   int w = 0;
/*      */   
/*      */   boolean x;
/*      */   
/*      */   boolean y;
/*      */   
/*      */   float z;
/*      */   
/*      */   public float A;
/*      */   public float B;
/*      */   boolean C = false;
/*      */   boolean D = false;
/*      */   boolean E = false;
/*      */   boolean F = false;
/*      */   boolean G = false;
/*  160 */   float H = 0.0F;
/*  161 */   float I = 0.0F;
/*  162 */   float J = 0.0F;
/*  163 */   float K = 0.0F;
/*  164 */   float L = 0.0F;
/*  165 */   float M = 0.0F;
/*      */   
/*      */   boolean N = false;
/*      */   
/*      */   boolean O = false;
/*      */   
/*      */   boolean P = false;
/*      */   
/*      */   public af Q;
/*      */   
/*      */   public float R;
/*      */   
/*      */   public int S;
/*      */   
/*      */   public float T;
/*      */   
/*      */   public af U;
/*      */   
/*      */   public final boolean V = true;
/*      */   
/*      */   public s W;
/*      */   
/*      */   public int X;
/*      */   
/*      */   public boolean Y;
/*      */   
/*      */   public float Z;
/*      */   public float aa;
/*      */   public float ab;
/*      */   public boolean ac;
/*      */   public float ad;
/*      */   public float ae;
/*      */   public float af;
/*      */   public float ag;
/*      */   public float ah;
/*      */   public float ai;
/*      */   public boolean aj;
/*      */   public float ak;
/*      */   public float al;
/*      */   public int am;
/*  205 */   public final Paint an = new Paint();
/*      */   
/*      */   public Paint ao;
/*      */   
/*      */   public Paint ap;
/*      */   
/*      */   public Paint aq;
/*      */   
/*      */   public Paint ar;
/*      */   
/*      */   public Paint as;
/*      */   
/*      */   public Paint at;
/*      */   
/*      */   public Paint au;
/*      */   
/*      */   public Paint av;
/*      */   
/*      */   public Paint aw;
/*      */   public Paint ax;
/*      */   public Paint ay;
/*      */   public Paint az;
/*      */   public Paint aA;
/*      */   public Paint aB;
/*      */   public Paint aC;
/*      */   Paint aD;
/*      */   Paint aE;
/*      */   Paint aF;
/*      */   Paint aG;
/*      */   Paint aH;
/*      */   Paint aI;
/*      */   q aJ;
/*      */   q aK;
/*      */   q aL;
/*      */   public float aM;
/*  240 */   public float aN = 0.0F;
/*  241 */   public float aO = 0.0F;
/*      */   
/*  243 */   public float aP = 0.0F;
/*      */   
/*      */   int aQ;
/*  246 */   public float aR = 0.0F;
/*      */   
/*      */   public boolean aS;
/*      */   
/*  250 */   e aT = null;
/*  251 */   e aU = null;
/*  252 */   e aV = null;
/*      */   
/*      */   boolean aW;
/*      */   
/*      */   float aX;
/*      */   
/*      */   Paint aY;
/*      */   Paint aZ;
/*  260 */   e ba = null;
/*  261 */   e bb = null;
/*  262 */   public e bc = null;
/*  263 */   public e bd = null;
/*  264 */   public e be = null;
/*  265 */   e bf = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  270 */   final Rect bg = new Rect();
/*  271 */   final Rect bh = new Rect();
/*  272 */   final Rect bi = new Rect();
/*  273 */   final Rect bj = new Rect();
/*  274 */   final Rect bk = new Rect();
/*  275 */   final Paint bl = new Paint();
/*  276 */   final Paint bm = new Paint();
/*      */ 
/*      */   
/*  279 */   final Paint bn = (Paint)new q();
/*  280 */   final Paint bo = new Paint();
/*      */   
/*      */   String bp;
/*      */   
/*      */   String bq;
/*      */   
/*      */   String br;
/*      */   
/*      */   String bs;
/*      */   String bt;
/*  290 */   public ArrayList bu = new ArrayList();
/*      */ 
/*      */   
/*      */   private int bJ;
/*      */ 
/*      */   
/*      */   public boolean bv = false;
/*      */ 
/*      */   
/*      */   public static boolean bw = false;
/*      */   
/*      */   public static boolean bx = false;
/*      */   
/*      */   public static boolean by = false;
/*      */   
/*      */   public static boolean bz;
/*      */ 
/*      */   
/*      */   public boolean a() {
/*  309 */     if (l.am())
/*      */     {
/*  311 */       return false;
/*      */     }
/*  313 */     l l = l.u();
/*  314 */     return l.by.useCircleSelect;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   float b() {
/*  320 */     return Math.min(this.r * 2.5F, 290.0F) + 10.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   float c() {
/*  325 */     l l = l.u();
/*      */     
/*  327 */     float f1 = 0.7F;
/*      */     
/*  329 */     if (l.al())
/*      */     {
/*  331 */       f1 = 0.9F;
/*      */     }
/*      */     
/*  334 */     if (l.cE < 1.0F) {
/*      */       
/*  336 */       float f2 = l.cE;
/*  337 */       if (f2 < 0.4D)
/*      */       {
/*  339 */         f2 = 0.4F;
/*      */       }
/*      */ 
/*      */       
/*  343 */       f1 *= f2;
/*      */     } 
/*      */     
/*  346 */     return f1;
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
/*      */   public void a(String paramString, int paramInt) {
/*  365 */     this.d.b(paramString, paramInt);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String paramString) {
/*  370 */     this.d.a(paramString, 100);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(String paramString) {
/*  375 */     this.d.a(paramString, 50);
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(String paramString) {
/*  380 */     this.d.a(paramString, 5);
/*      */   }
/*      */ 
/*      */   
/*      */   public void d() {
/*  385 */     this.O = false;
/*  386 */     this.P = false;
/*  387 */     this.D = false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(float paramFloat1, float paramFloat2) {
/*  393 */     l l = l.u();
/*      */     
/*  395 */     if (bw && !this.d.ar) {
/*      */ 
/*      */       
/*  398 */       if (l.bE.c(paramFloat1, paramFloat2) != null)
/*      */       {
/*  400 */         return false;
/*      */       }
/*  402 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  406 */     return (paramFloat1 < l.bS - l.bX);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/*  413 */     if (this.d != null)
/*      */     {
/*  415 */       this.d.a();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {
/*  423 */     if (paramBoolean) {
/*      */       
/*  425 */       this.d.j();
/*      */       
/*      */       return;
/*      */     } 
/*  429 */     l l = l.u();
/*  430 */     this.d.k();
/*  431 */     k();
/*  432 */     this.p = false;
/*  433 */     this.bu.clear();
/*      */     
/*  435 */     l.bc = 1.0F;
/*  436 */     l.bf = false;
/*  437 */     l.be = false;
/*      */     
/*  439 */     l.aV = false;
/*      */     
/*  441 */     l.aX = false;
/*      */     
/*  443 */     if (l.G())
/*      */     {
/*  445 */       if (l.I())
/*      */       {
/*  447 */         l.be = l.bF.o;
/*      */       }
/*      */     }
/*      */     
/*  451 */     w.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/*  458 */     bw = false;
/*  459 */     bx = false;
/*  460 */     by = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  466 */     if (l.al()) {
/*      */ 
/*      */ 
/*      */       
/*  470 */       bw = true;
/*  471 */       bx = true;
/*      */       
/*  473 */       a = true;
/*  474 */       by = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  481 */     if (l.aI) {
/*      */       
/*  483 */       bw = true;
/*  484 */       bx = true;
/*  485 */       by = true;
/*      */     } 
/*      */     
/*  488 */     if (l.aj())
/*      */     {
/*  490 */       if (!(l.u()).by.classicInterface) {
/*      */         
/*  492 */         bw = true;
/*  493 */         bx = true;
/*  494 */         by = true;
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
/*      */   public void a(Context paramContext) {
/*  509 */     l l = l.u();
/*      */     
/*  511 */     if (l.v())
/*      */     {
/*  513 */       this.bv = true;
/*      */     }
/*      */     
/*  516 */     f();
/*      */ 
/*      */     
/*  519 */     this.bp = a.a("gui.notAvailableInDemoText", new Object[0]);
/*  520 */     this.bq = "Locked";
/*      */ 
/*      */     
/*  523 */     this.br = a.a("gui.cannotPlace.general", new Object[0]);
/*  524 */     this.bs = a.a("gui.cannotPlace.needsResourcePool", new Object[0]);
/*  525 */     this.bt = a.a("gui.cannotPlace.needsWater", new Object[0]);
/*      */     
/*  527 */     this.d = new a(l, this);
/*  528 */     e();
/*      */     
/*  530 */     this.e = new i(l, this);
/*  531 */     this.f = new y(l);
/*      */     
/*  533 */     this.aT = l.bw.a(R.drawable.button_no);
/*  534 */     this.aU = l.bw.a(R.drawable.button_yes);
/*  535 */     this.aV = l.bw.a(R.drawable.button_more);
/*      */     
/*  537 */     this.aY = new Paint();
/*  538 */     this.aY.d(true);
/*      */     
/*  540 */     this.aZ = new Paint();
/*  541 */     this.aZ.d(true);
/*  542 */     this.aZ.a(40, 255, 255, 255);
/*      */     
/*  544 */     this.ba = l.bw.a(R.drawable.button_add);
/*  545 */     this.bb = l.bw.a(R.drawable.button_subtract);
/*  546 */     this.bc = l.bw.a(R.drawable.icon_rally);
/*  547 */     this.bd = l.bw.a(R.drawable.icon_upgrade);
/*  548 */     this.be = l.bw.a(R.drawable.metal_dark, false);
/*  549 */     this.bf = l.bw.a(R.drawable.touch_indicator, false);
/*      */ 
/*      */     
/*  552 */     this.bn.a(145, 0, 175, 0);
/*  553 */     this.bn.a(6.0F);
/*  554 */     q.b(this.bn);
/*      */     
/*  556 */     this.ao = new Paint();
/*      */     
/*  558 */     this.ap = (Paint)new q();
/*  559 */     this.ap.a(255, 0, 240, 0);
/*  560 */     this.ap.a(true);
/*  561 */     this.ap.c(true);
/*  562 */     this.ap.a(Typeface.a(Typeface.c, 1));
/*  563 */     l.a(this.ap, 20.0F);
/*  564 */     this.ap.a(Paint.Align.a);
/*      */     
/*  566 */     this.as = (Paint)new q();
/*  567 */     this.as.a(255, 0, 240, 0);
/*  568 */     this.as.a(true);
/*  569 */     this.as.c(true);
/*  570 */     this.as.a(Typeface.a(Typeface.c, 1));
/*  571 */     l.a(this.as, 18.0F);
/*  572 */     this.as.a(Paint.Align.a);
/*      */ 
/*      */     
/*  575 */     this.aq = (Paint)new q();
/*  576 */     this.aq.a(this.ap);
/*  577 */     this.aq.a(255, 240, 240, 0);
/*      */     
/*  579 */     this.ar = (Paint)new q();
/*  580 */     this.ar.b(Color.a(100, 0, 0, 0));
/*  581 */     this.ar.a(Paint.Style.c);
/*      */ 
/*      */     
/*  584 */     this.at = (Paint)new q();
/*  585 */     this.at.a(100, 30, 240, 30);
/*  586 */     this.at.a(Paint.Align.a);
/*  587 */     this.at.c(true);
/*  588 */     this.at.a(true);
/*  589 */     l.a(this.at, 12.0F);
/*  590 */     q.b(this.at);
/*      */ 
/*      */     
/*  593 */     this.aw = (Paint)new q();
/*  594 */     if (this.bv) {
/*      */       
/*  596 */       this.aw.a(255, 240, 240, 240);
/*      */     }
/*      */     else {
/*      */       
/*  600 */       this.aw.a(255, 30, 240, 30);
/*      */     } 
/*  602 */     this.aw.a(Paint.Align.b);
/*  603 */     this.aw.c(true);
/*  604 */     this.aw.a(true);
/*  605 */     l.a(this.aw, 12.0F);
/*  606 */     q.b(this.aw);
/*      */     
/*  608 */     l.d("smallTextPaint size: " + this.aw.k());
/*      */ 
/*      */     
/*  611 */     this.av = (Paint)new q();
/*  612 */     this.av.a(this.aw);
/*  613 */     l.a(this.av, 10.0F);
/*  614 */     q.b(this.av);
/*      */     
/*  616 */     this.au = (Paint)new q();
/*  617 */     this.au.a(this.aw);
/*  618 */     l.a(this.au, 8.0F);
/*  619 */     q.b(this.au);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  624 */     this.ax = (Paint)new q();
/*      */     
/*  626 */     if (this.bv) {
/*      */       
/*  628 */       this.ax.a(255, 240, 240, 240);
/*      */     }
/*      */     else {
/*      */       
/*  632 */       this.ax.a(255, 30, 240, 30);
/*      */     } 
/*  634 */     this.ax.a(Paint.Align.b);
/*  635 */     this.ax.c(true);
/*  636 */     this.ax.a(true);
/*  637 */     l.a(this.ax, 20.0F);
/*      */     
/*  639 */     q.b(this.ax);
/*      */ 
/*      */     
/*  642 */     this.ay = (Paint)new q();
/*  643 */     this.ay.a(255, 30, 240, 30);
/*  644 */     this.ay.a(Paint.Align.b);
/*  645 */     this.ay.c(true);
/*  646 */     this.ay.a(true);
/*  647 */     l.a(this.ay, 20.0F);
/*  648 */     q.b(this.ay);
/*      */     
/*  650 */     this.aC = (Paint)new q();
/*  651 */     this.aC.a(150, 20, 20, 20);
/*  652 */     l.a(this.aC);
/*  653 */     q.b(this.aC);
/*      */     
/*  655 */     this.az = (Paint)new q();
/*  656 */     this.az.a(this.ax);
/*  657 */     this.az.a(255, 128, 0, 0);
/*  658 */     l.a(this.az, 14.0F);
/*  659 */     this.az.a(Paint.Align.b);
/*  660 */     q.b(this.az);
/*      */     
/*  662 */     this.aA = (Paint)new q();
/*  663 */     this.aA.a(this.az);
/*  664 */     this.aA.a(255, 220, 222, 49);
/*      */     
/*  666 */     this.aB = (Paint)new q();
/*  667 */     this.aB.a(this.ax);
/*  668 */     l.a(this.aB, 12.0F);
/*  669 */     this.aB.a(125, 230, 230, 230);
/*  670 */     this.aB.a(Paint.Align.b);
/*  671 */     q.b(this.aB);
/*      */     
/*  673 */     this.aJ = new q();
/*  674 */     this.aJ.b(-16777216);
/*  675 */     this.aJ.a(Paint.Align.b);
/*  676 */     this.aJ.a(true);
/*  677 */     this.aJ.c(true);
/*  678 */     this.aJ.a(Typeface.a(Typeface.c, 0));
/*      */ 
/*      */ 
/*      */     
/*  682 */     l.a((Paint)this.aJ, 14.0F);
/*      */ 
/*      */ 
/*      */     
/*  686 */     this.aK = new q();
/*  687 */     this.aK.a((Paint)this.aJ);
/*  688 */     this.aK.a(Typeface.a(Typeface.c, 1));
/*  689 */     l.a((Paint)this.aK, 16.0F);
/*      */ 
/*      */     
/*  692 */     this.aL = new q();
/*  693 */     this.aL.a((Paint)this.aK);
/*  694 */     this.aL.b(Color.a(232, 63, 80));
/*  695 */     l.a((Paint)this.aL, 16.0F);
/*      */ 
/*      */     
/*  698 */     this.aD = (Paint)new q();
/*  699 */     this.aD.b(-16777216);
/*  700 */     this.aD.a(Paint.Align.b);
/*      */ 
/*      */     
/*  703 */     this.aD.a(true);
/*  704 */     this.aD.c(true);
/*  705 */     this.aD.a(Typeface.a(Typeface.c, 0));
/*      */ 
/*      */     
/*  708 */     l.a(this.aD, 20.0F);
/*      */     
/*  710 */     this.aE = (Paint)new q();
/*  711 */     this.aE.b(-1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  717 */     this.aE.c(160);
/*  718 */     if (l.al())
/*      */     {
/*  720 */       this.aE.c(140);
/*      */     }
/*      */     
/*  723 */     l.a(this.aE);
/*      */     
/*  725 */     this.aF = (Paint)new q();
/*  726 */     this.aF.b(-16777216);
/*  727 */     this.aF.c(210);
/*  728 */     l.a(this.aF);
/*      */ 
/*      */     
/*  731 */     this.aI = (Paint)new q();
/*  732 */     this.aI.b(-7829368);
/*  733 */     this.aI.c(240);
/*  734 */     this.aI.a(Paint.Style.b);
/*  735 */     this.aI.a(1.0F);
/*  736 */     l.a(this.aI);
/*      */ 
/*      */     
/*  739 */     this.aG = (Paint)new q();
/*  740 */     this.aG.b(-16711936);
/*  741 */     this.aG.c(80);
/*  742 */     this.aG.a(Paint.Style.a);
/*  743 */     this.aG.a(4.0F);
/*  744 */     l.a(this.aG);
/*      */ 
/*      */     
/*  747 */     this.aH = (Paint)new q();
/*  748 */     this.aH.b(Color.a(120, 235, 167, 49));
/*      */     
/*  750 */     this.aH.a(Paint.Style.a);
/*  751 */     this.aH.a(8.0F);
/*  752 */     l.a(this.aH);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g() {
/*  759 */     this.e.b();
/*  760 */     this.f.b();
/*      */ 
/*      */     
/*  763 */     this.bE = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/*  768 */     l l = l.u();
/*      */     
/*  770 */     this.q += paramFloat;
/*  771 */     this.aN = com.corrodinggames.rts.gameFramework.f.a(this.aN, paramFloat);
/*  772 */     this.aO = com.corrodinggames.rts.gameFramework.f.a(this.aO, paramFloat);
/*  773 */     this.aR = com.corrodinggames.rts.gameFramework.f.a(this.aR, 0.08F * paramFloat);
/*      */     
/*  775 */     this.aP = com.corrodinggames.rts.gameFramework.f.a(this.aP, paramFloat);
/*      */     
/*  777 */     this.z += paramFloat;
/*      */     
/*  779 */     this.aM += 0.05F * paramFloat;
/*  780 */     if (this.aM > 1.0F) {
/*      */       
/*  782 */       this.aM--;
/*  783 */       if (this.aM > 1.0F)
/*      */       {
/*  785 */         this.aM = 0.0F;
/*      */       }
/*      */     } 
/*      */     
/*  789 */     l.de = 4.0F * this.aR;
/*      */ 
/*      */     
/*  792 */     float f1 = 1.0F * paramFloat;
/*  793 */     if (!this.D) {
/*      */       
/*  795 */       float f4 = this.L * paramFloat;
/*  796 */       float f5 = this.M * paramFloat;
/*      */       
/*  798 */       f4 = com.corrodinggames.rts.gameFramework.f.g(80.0F, f4);
/*  799 */       f5 = com.corrodinggames.rts.gameFramework.f.g(80.0F, f5);
/*      */       
/*  801 */       l.cf += f4;
/*  802 */       l.cg += f5;
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */       
/*  810 */       f1 *= 4.0F;
/*      */     } 
/*      */ 
/*      */     
/*  814 */     float f2 = com.corrodinggames.rts.gameFramework.f.b(0.0F, 0.0F, this.L, this.M);
/*  815 */     float f3 = com.corrodinggames.rts.gameFramework.f.d(0.0F, 0.0F, this.L, this.M);
/*  816 */     if (f2 > 30.0F)
/*      */     {
/*  818 */       f2 = 30.0F;
/*      */     }
/*  820 */     f2 = com.corrodinggames.rts.gameFramework.f.a(f2, f1);
/*  821 */     this.L = com.corrodinggames.rts.gameFramework.f.i(f3) * f2;
/*  822 */     this.M = com.corrodinggames.rts.gameFramework.f.h(f3) * f2;
/*      */ 
/*      */     
/*  825 */     this.aS = false;
/*      */     
/*  827 */     this.D = (l.T() && l.dt[0] && this.aN == 0.0F);
/*      */     
/*  829 */     if (this.aO != 0.0F) {
/*      */       
/*  831 */       if (!this.D)
/*      */       {
/*  833 */         this.aO = 0.0F;
/*      */       }
/*  835 */       this.D = false;
/*  836 */       this.C = false;
/*      */     } 
/*      */     
/*  839 */     boolean bool = false;
/*      */     
/*  841 */     if (this.aP > 0.0F)
/*      */     {
/*  843 */       bool = true;
/*      */     }
/*      */     
/*  846 */     if (l.T() && l.V() > 1) {
/*      */       
/*  848 */       bool = true;
/*  849 */       this.aP = 4.0F;
/*      */     } 
/*      */     
/*  852 */     if (bool) {
/*      */       
/*  854 */       this.D = false;
/*  855 */       this.C = false;
/*  856 */       this.N = false;
/*  857 */       this.r = 0.0F;
/*      */     } 
/*      */ 
/*      */     
/*  861 */     this.G = (l.W() > l.cm);
/*      */     
/*  863 */     this.O = (!this.D && this.C);
/*  864 */     this.P = (this.D && !this.C);
/*      */ 
/*      */     
/*  867 */     if (l.al())
/*      */     {
/*  869 */       if (l.by.mouseSupport) {
/*      */         
/*  871 */         this.u = l.W();
/*  872 */         this.v = l.X();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  877 */     if (!this.D && !this.O)
/*      */     {
/*  879 */       this.y = false;
/*      */     }
/*      */     
/*  882 */     if (this.D) {
/*      */       
/*  884 */       this.r += paramFloat;
/*  885 */       this.s = l.b(0);
/*  886 */       this.t = l.c(0);
/*  887 */       this.u = this.s;
/*  888 */       this.v = this.t;
/*  889 */       this.w = l.d(0);
/*      */ 
/*      */ 
/*      */       
/*  893 */       this.x = a(this.s, this.t);
/*      */ 
/*      */ 
/*      */       
/*  897 */       boolean bool1 = false;
/*      */       
/*  899 */       if (this.x && !this.C) {
/*      */ 
/*      */         
/*  902 */         if (this.z < 30.0F) {
/*      */           
/*  904 */           float f4 = com.corrodinggames.rts.gameFramework.f.a(this.A, this.B, this.s, this.t);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  909 */           float f5 = 10.0F * l.bQ;
/*      */           
/*  911 */           if (l.ak())
/*      */           {
/*  913 */             f5 = (float)(f5 * 1.5D);
/*      */           }
/*      */           
/*  916 */           if (f4 < f5 * f5)
/*      */           {
/*      */ 
/*      */ 
/*      */             
/*  921 */             bool1 = true;
/*      */           }
/*      */         } 
/*      */         
/*  925 */         this.z = 0.0F;
/*  926 */         this.A = this.s;
/*  927 */         this.B = this.t;
/*      */       } 
/*      */ 
/*      */       
/*  931 */       if (bool1)
/*      */       {
/*      */         
/*  934 */         this.y = true;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  941 */       if (!this.C) {
/*      */         
/*  943 */         this.N = false;
/*  944 */         this.H = this.s;
/*  945 */         this.I = this.t;
/*  946 */         this.J = this.s;
/*  947 */         this.K = this.t;
/*  948 */         this.E = (l.bE.c(this.s, this.t) != null);
/*      */         
/*  950 */         this.F = false;
/*  951 */         if (!this.E)
/*      */         {
/*  953 */           this.F = (this.s > l.cm);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  958 */       this.C = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  966 */     if (this.D && (this.r <= 20.0F || !a())) {
/*      */       
/*  968 */       float f4 = com.corrodinggames.rts.gameFramework.f.a(this.H, this.I, this.s, this.t);
/*      */       
/*  970 */       if (!this.E) {
/*      */ 
/*      */         
/*  973 */         float f5 = 30.0F * l.bQ;
/*      */         
/*  975 */         if (l.al() && l.by.mouseSupport)
/*      */         {
/*  977 */           if (l.e(3))
/*      */           {
/*  979 */             f5 = 0.0F;
/*      */           }
/*      */         }
/*      */         
/*  983 */         if (!this.N && f4 > f5 * f5) {
/*      */           
/*  985 */           boolean bool1 = false;
/*      */ 
/*      */           
/*  988 */           byte b = 1;
/*  989 */           if (l.by.mouseOrders == 2)
/*      */           {
/*  991 */             b = 2;
/*      */           }
/*      */           
/*  994 */           if ((!l.by.mouseSupport || this.w != b) && !c(l))
/*      */           {
/*  996 */             bool1 = true;
/*      */           }
/*      */ 
/*      */           
/* 1000 */           if (bool1)
/*      */           {
/* 1002 */             this.N = true;
/*      */           }
/*      */           
/* 1005 */           this.J = this.s;
/* 1006 */           this.K = this.t;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1013 */     if (l.al() && !l.al)
/*      */     {
/* 1015 */       if (l.aj != null && (l.aj.f() || l.aD))
/*      */       {
/*      */         
/* 1018 */         if (!this.D || this.d.c) {
/*      */           
/* 1020 */           float f4 = 24.0F * l.by.edgeScrollSpeed / l.cE;
/*      */           
/* 1022 */           float f5 = l.cf;
/* 1023 */           float f6 = l.cg;
/*      */           
/* 1025 */           float f7 = 0.0F;
/* 1026 */           float f8 = 0.0F;
/* 1027 */           if (this.u <= 1.0F)
/*      */           {
/* 1029 */             f7 -= f4 * paramFloat;
/*      */           }
/* 1031 */           if (this.u >= l.bS - 1.0F)
/*      */           {
/* 1033 */             f7 += f4 * paramFloat;
/*      */           }
/* 1035 */           if (this.v <= 1.0F)
/*      */           {
/* 1037 */             f8 -= f4 * paramFloat;
/*      */           }
/* 1039 */           if (this.v >= l.bT - 1.0F)
/*      */           {
/* 1041 */             f8 += f4 * paramFloat;
/*      */           }
/* 1043 */           l.cf += f7;
/* 1044 */           l.cg += f8;
/*      */           
/* 1046 */           l.J();
/*      */ 
/*      */           
/* 1049 */           this.d.B.a -= (l.cf - f5) * l.cE;
/* 1050 */           this.d.B.b -= (l.cg - f6) * l.cE;
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
/* 1061 */     ac ac = l.bB;
/*      */     
/* 1063 */     if (l.by.keyboardSupport) {
/*      */       
/* 1065 */       if (l.x()) {
/*      */         
/* 1067 */         float f4 = 12.0F * l.by.scrollSpeed;
/*      */         
/* 1069 */         if (ac.p.b())
/*      */         {
/* 1071 */           l.cf -= f4 * paramFloat;
/*      */         }
/* 1073 */         if (ac.q.b())
/*      */         {
/* 1075 */           l.cf += f4 * paramFloat;
/*      */         }
/* 1077 */         if (ac.n.b())
/*      */         {
/* 1079 */           l.cg -= f4 * paramFloat;
/*      */         }
/* 1081 */         if (ac.o.b())
/*      */         {
/* 1083 */           l.cg += f4 * paramFloat;
/*      */         }
/* 1085 */         if (ac.r.b())
/*      */         {
/* 1087 */           l.cC += 0.1F;
/*      */         }
/* 1089 */         if (ac.s.b())
/*      */         {
/* 1091 */           l.cC -= 0.1F;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1096 */       if (ac.y.a()) {
/*      */         
/* 1098 */         k();
/* 1099 */         w();
/*      */       } 
/*      */ 
/*      */       
/* 1103 */       if (ac.z.a())
/*      */       {
/* 1105 */         this.f.d();
/*      */       }
/*      */       
/* 1108 */       if (ac.A.a()) {
/*      */         
/* 1110 */         k();
/* 1111 */         w();
/* 1112 */         for (w w : w.dK) {
/*      */           
/* 1114 */           if (w instanceof r) {
/*      */             
/* 1116 */             r r1 = (r)w;
/*      */             
/* 1118 */             if (!r1.bz && r1.bB == l.bb && r1
/* 1119 */               .l() && 
/* 1120 */               !r1.ai() && r1
/* 1121 */               .aO())
/*      */             {
/* 1123 */               j((af)r1);
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1129 */       if (ac.B.a()) {
/*      */         
/* 1131 */         k();
/* 1132 */         w();
/* 1133 */         for (w w : w.dK) {
/*      */           
/* 1135 */           if (w instanceof r) {
/*      */             
/* 1137 */             r r1 = (r)w;
/*      */             
/* 1139 */             if (r1.bB == l.bb && r1
/* 1140 */               .r() == ak.e && !r1.bz) {
/*      */               
/* 1142 */               j((af)r1);
/* 1143 */               l.b(r1.dH, r1.dI);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1152 */       if (ac.C.a())
/*      */       {
/* 1154 */         u.a(this.bu, u.a, u.b);
/*      */       }
/* 1156 */       if (ac.D.a())
/*      */       {
/* 1158 */         u.a(this.bu, u.c, null);
/*      */       }
/* 1160 */       if (ac.E.a())
/*      */       {
/* 1162 */         u.a(this.bu, u.d, null);
/*      */       }
/* 1164 */       if (ac.F.a())
/*      */       {
/* 1166 */         u.a(this.bu, u.e, null);
/*      */       }
/* 1168 */       if (ac.G.a())
/*      */       {
/* 1170 */         u.a(this.bu, u.f, null);
/*      */       }
/*      */ 
/*      */       
/* 1174 */       if (ac.x.a())
/*      */       {
/*      */         
/* 1177 */         this.d.a(12);
/*      */       }
/*      */ 
/*      */       
/* 1181 */       if (ac.N.a())
/*      */       {
/* 1183 */         if (z() && A()) {
/*      */           
/* 1185 */           k();
/* 1186 */           this.U = null;
/* 1187 */           this.W = (s)this.g;
/*      */           
/*      */           return;
/*      */         } 
/*      */       }
/* 1192 */       if (ac.P.a())
/*      */       {
/* 1194 */         if (y()) {
/*      */           
/* 1196 */           k();
/* 1197 */           this.U = null;
/* 1198 */           this.W = (s)this.h;
/*      */           return;
/*      */         } 
/*      */       }
/* 1202 */       if (ac.Q.a())
/*      */       {
/* 1204 */         if (A()) {
/*      */           
/* 1206 */           k();
/* 1207 */           this.U = null;
/* 1208 */           this.W = (s)this.i;
/*      */           
/*      */           return;
/*      */         } 
/*      */       }
/* 1213 */       if (ac.O.a())
/*      */       {
/* 1215 */         t();
/*      */       }
/*      */       
/* 1218 */       if (ac.v.a())
/*      */       {
/* 1220 */         G();
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1226 */       if (ac.t.a())
/*      */       {
/* 1228 */         if (l.G()) {
/*      */           
/* 1230 */           l.d("showing send chat");
/* 1231 */           this.d.a(13);
/*      */         } 
/*      */       }
/*      */       
/* 1235 */       if (ac.u.a())
/*      */       {
/* 1237 */         if (l.G()) {
/*      */           
/* 1239 */           l.d("showing send team chat");
/* 1240 */           this.d.a(16);
/*      */         } 
/*      */       }
/*      */       
/* 1244 */       if (l.I() || l.bJ.h()) {
/*      */         
/* 1246 */         if (ac.L.a())
/*      */         {
/* 1248 */           if (l.bc != 0.0F) {
/*      */             
/* 1250 */             if (!l.bJ.h())
/*      */             {
/* 1252 */               ad.a(null, "Game paused");
/*      */             }
/*      */ 
/*      */             
/* 1256 */             l.bc = 0.0F;
/*      */           }
/*      */           else {
/*      */             
/* 1260 */             l.bc = 1.0F;
/*      */           } 
/*      */         }
/*      */         
/* 1264 */         boolean bool1 = ac.J.a();
/* 1265 */         boolean bool2 = ac.K.a();
/*      */         
/* 1267 */         if (bool1 || bool2) {
/*      */ 
/*      */           
/* 1270 */           if (bool1) {
/*      */             
/* 1272 */             boolean bool3 = (l.bc > 1.0F) ? true : false;
/*      */             
/* 1274 */             if (l.bc < 2.0F) {
/*      */               
/* 1276 */               l.bc = (float)(l.bc - 0.25D);
/*      */             }
/* 1278 */             else if (l.bc < 6.0F) {
/*      */               
/* 1280 */               l.bc = (float)(l.bc - 0.5D);
/*      */             }
/* 1282 */             else if (l.bc < 16.0F) {
/*      */               
/* 1284 */               l.bc -= 2.0F;
/*      */             }
/*      */             else {
/*      */               
/* 1288 */               l.bc -= 4.0F;
/*      */             } 
/*      */             
/* 1291 */             if (l.bc < 0.0F)
/*      */             {
/* 1293 */               l.bc = 0.0F;
/*      */             }
/*      */             
/* 1296 */             if (bool3 && l.bc < 1.0F)
/*      */             {
/* 1298 */               l.bc = 1.0F;
/*      */             
/*      */             }
/*      */           }
/* 1302 */           else if (bool2) {
/*      */             
/* 1304 */             boolean bool3 = (l.bc < 1.0F) ? true : false;
/*      */             
/* 1306 */             if (l.bc < 2.0F) {
/*      */               
/* 1308 */               l.bc = (float)(l.bc + 0.25D);
/*      */             }
/* 1310 */             else if (l.bc < 6.0F) {
/*      */               
/* 1312 */               l.bc = (float)(l.bc + 0.5D);
/*      */             }
/* 1314 */             else if (l.bc < 16.0F) {
/*      */               
/* 1316 */               l.bc += 2.0F;
/*      */             }
/*      */             else {
/*      */               
/* 1320 */               l.bc += 4.0F;
/*      */             } 
/*      */             
/* 1323 */             if (l.bJ.h()) {
/*      */               
/* 1325 */               if (l.bc > 64.0F)
/*      */               {
/* 1327 */                 l.bc = 64.0F;
/*      */               
/*      */               }
/*      */             
/*      */             }
/* 1332 */             else if (l.bc > 5.0F) {
/*      */               
/* 1334 */               l.bc = 5.0F;
/*      */             } 
/*      */ 
/*      */             
/* 1338 */             if (bool3 && l.bc > 1.0F)
/*      */             {
/* 1340 */               l.bc = 1.0F;
/*      */             }
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1346 */           if (!l.bJ.h())
/*      */           {
/* 1348 */             ad.a(null, "Game speed now: " + l.bc);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1354 */       l.cA = com.corrodinggames.rts.gameFramework.f.a(l.cA, paramFloat);
/*      */       
/* 1356 */       if (ac.Y.a())
/*      */       {
/* 1358 */         l.cA = 180.0F;
/*      */       }
/*      */       
/* 1361 */       if (l.be && ac.ab.a()) {
/*      */         
/* 1363 */         l.aV = !l.aV;
/* 1364 */         l.d("debugTempMode now: " + l.aV);
/* 1365 */         a("debug: " + l.aV);
/*      */       } 
/*      */       
/* 1368 */       if (l.be && l.aV && ac.ac.a()) {
/*      */         
/* 1370 */         a.ab = !a.ab;
/* 1371 */         a("AI debug view: " + a.ab);
/*      */       } 
/*      */       
/* 1374 */       if (l.be && l.aV && ac.ad.a()) {
/*      */         
/* 1376 */         com.corrodinggames.rts.gameFramework.k.f.a = !com.corrodinggames.rts.gameFramework.k.f.a;
/* 1377 */         a("Map debug: " + com.corrodinggames.rts.gameFramework.k.f.a);
/*      */       } 
/*      */ 
/*      */       
/* 1381 */       if (l.I() || l.bJ.h()) {
/*      */ 
/*      */         
/* 1384 */         if (l.be) {
/*      */ 
/*      */           
/* 1387 */           if (ac.V.a())
/*      */           {
/* 1389 */             l.aZ = !l.aZ;
/*      */           }
/*      */           
/* 1392 */           if (ac.W.a())
/*      */           {
/* 1394 */             if (l.bc == 1.0F) {
/*      */               
/* 1396 */               l.bc = 0.1F;
/*      */             }
/*      */             else {
/*      */               
/* 1400 */               l.bc = 1.0F;
/*      */             } 
/*      */           }
/*      */           
/* 1404 */           if (ac.X.a()) {
/*      */ 
/*      */ 
/*      */             
/* 1408 */             l.d("Adding test popup");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1423 */             l.bF.M();
/*      */           } 
/*      */ 
/*      */           
/* 1427 */           if (ac.Z.a())
/*      */           {
/* 1429 */             l.bf = !l.bf;
/*      */           }
/*      */           
/* 1432 */           if (ac.aa.a())
/*      */           {
/* 1434 */             for (w w : w.dK) {
/*      */               
/* 1436 */               if (w instanceof r) {
/*      */                 
/* 1438 */                 r r1 = (r)w;
/* 1439 */                 if (r1.ci)
/*      */                 {
/*      */                   
/* 1442 */                   r1.S();
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1454 */         if (ac.U.a()) {
/*      */           
/* 1456 */           l.be = !l.be;
/*      */           
/* 1458 */           if (l.be)
/*      */           {
/* 1460 */             w();
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1466 */     if (l.be)
/*      */     {
/* 1468 */       if (!l.I() && !l.bJ.h())
/*      */       {
/* 1470 */         l.be = false;
/*      */       }
/*      */     }
/*      */     
/* 1474 */     if (l.be) {
/*      */ 
/*      */       
/* 1477 */       if (this.c != null)
/*      */       {
/* 1479 */         if (this.c.dC || this.c.bz)
/*      */         {
/* 1481 */           this.c = null;
/*      */         }
/*      */       }
/*      */       
/* 1485 */       if (this.c == null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1491 */         l.d("Creating new debug editor");
/* 1492 */         this.c = new h(false);
/* 1493 */         this.c.a(l.bb);
/*      */       } 
/*      */       
/* 1496 */       if (p() == 0) {
/*      */         
/* 1498 */         w();
/* 1499 */         j((af)this.c);
/*      */       } 
/*      */ 
/*      */       
/* 1503 */       if (l.by.liveReloading && l.bg % 100 == 0 && !l.bJ.g())
/*      */       {
/* 1505 */         ac.b();
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1512 */       if (this.c != null)
/*      */       {
/* 1514 */         if (this.c.dC || this.c.bz)
/*      */         {
/* 1516 */           this.c = null;
/*      */         }
/*      */       }
/*      */       
/* 1520 */       if (this.c != null && !l.bJ.h())
/*      */       {
/* 1522 */         h();
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1528 */     if (this.N) {
/*      */       
/* 1530 */       if (this.F) {
/*      */ 
/*      */ 
/*      */         
/* 1534 */         this.d.aq = this.K - this.t;
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/* 1540 */         byte b = 1;
/* 1541 */         if (l.by.mouseOrders == 2)
/*      */         {
/* 1543 */           b = 2;
/*      */         }
/*      */         
/* 1546 */         if ((!l.by.mouseSupport || this.w != b) && !c(l)) {
/*      */ 
/*      */           
/* 1549 */           SettingsEngine settingsEngine = l.by;
/*      */ 
/*      */ 
/*      */           
/* 1553 */           double d1 = (this.J - this.s);
/* 1554 */           double d2 = (this.K - this.t);
/*      */           
/* 1556 */           float f4 = com.corrodinggames.rts.gameFramework.f.b(0.0F, 0.0F, (float)d1, (float)d2);
/*      */ 
/*      */           
/* 1559 */           d1 = d1 * settingsEngine.scrollSpeed / l.cE;
/* 1560 */           d2 = d2 * settingsEngine.scrollSpeed / l.cE;
/*      */           
/* 1562 */           if (paramFloat != 0.0F)
/*      */           {
/*      */             
/* 1565 */             if (f4 > 50.0D * paramFloat) {
/*      */               
/* 1567 */               float f5 = 0.7F;
/* 1568 */               if (l.al())
/*      */               {
/* 1570 */                 f5 = 1.7F;
/*      */               }
/*      */               
/* 1573 */               this.L = (float)(d1 * f5);
/* 1574 */               this.M = (float)(d2 * f5);
/*      */             } 
/*      */           }
/*      */           
/* 1578 */           l.cf = (float)(l.cf + d1 * 2.0D);
/* 1579 */           l.cg = (float)(l.cg + d2 * 2.0D);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1584 */       this.J = this.s;
/* 1585 */       this.K = this.t;
/*      */     } 
/*      */ 
/*      */     
/* 1589 */     if (l.by.mouseSupport && (this.bA.a != (int)l.W() || this.bA.b != (int)l.X())) {
/*      */       
/* 1591 */       this.bA.a = (int)l.W();
/* 1592 */       this.bA.b = (int)l.X();
/* 1593 */       this.n.b(this.bA);
/*      */     } 
/*      */     
/* 1596 */     if (this.O && H()) {
/*      */       
/* 1598 */       c c1 = c.a((int)this.u, (int)this.v);
/* 1599 */       this.n.b(c1);
/*      */     } 
/*      */     
/* 1602 */     this.n.b(paramFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1609 */   c bA = c.b(-1, -1);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 1615 */     if (this.c != null) {
/*      */       
/* 1617 */       l((af)this.c);
/* 1618 */       this.c.bU();
/* 1619 */       this.c = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public h i() {
/* 1626 */     return this.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(h paramh) {
/* 1631 */     this.c = paramh;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(l paraml) {
/* 1637 */     if (!paraml.by.keyboardSupport)
/*      */     {
/* 1639 */       return false;
/*      */     }
/* 1641 */     return paraml.c(59, 60);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(l paraml) {
/* 1646 */     if (!paraml.by.keyboardSupport)
/*      */     {
/* 1648 */       return false;
/*      */     }
/* 1650 */     return paraml.c(113, 114);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(l paraml) {
/* 1655 */     if (!paraml.by.keyboardSupport)
/*      */     {
/* 1657 */       return false;
/*      */     }
/* 1659 */     return paraml.c(57, 58);
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
/*      */   public void b(float paramFloat) {
/* 1678 */     l l = l.u();
/*      */     
/* 1680 */     this.T += 0.2F * paramFloat;
/* 1681 */     if (this.T > 360.0F)
/*      */     {
/* 1683 */       this.T -= 360.0F;
/*      */     }
/*      */     
/* 1686 */     this.bi.a((int)(l.bS - l.bX), 0, (int)l.bS, (int)l.bT);
/*      */ 
/*      */ 
/*      */     
/* 1690 */     if (!bw) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1706 */       if (this.bv) {
/*      */         
/* 1708 */         this.bl.a();
/* 1709 */         this.bl.b(Color.a(255, 33, 40, 52));
/* 1710 */         this.bl.a(Paint.Style.a);
/* 1711 */         l.bw.b(this.bi, this.bl);
/*      */       }
/*      */       else {
/*      */         
/* 1715 */         l.bw.a(this.be, this.bi, null);
/*      */       } 
/*      */       
/* 1718 */       this.bl.a();
/* 1719 */       this.bl.b(Color.a(255, 0, 0, 0));
/* 1720 */       this.bl.a(Paint.Style.b);
/* 1721 */       l.bw.b(this.bi, this.bl);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1728 */     this.bJ = 0;
/*      */     
/* 1730 */     r r1 = r();
/*      */     
/* 1732 */     if (l.bb != null && l.bb != m.g)
/*      */     {
/* 1734 */       a(l, l.bb, false, true);
/*      */     }
/*      */     
/* 1737 */     if (r1 != null)
/*      */     {
/* 1739 */       if (l.bb != ((af)r1).bB)
/*      */       {
/* 1741 */         if (m((af)r1))
/*      */         {
/* 1743 */           a(l, ((af)r1).bB, true, true);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1748 */     if (l.be && !l.bJ.h()) {
/*      */       
/* 1750 */       String str = "";
/* 1751 */       if (l.be)
/*      */       {
/* 1753 */         str = str + "Editor Active\n";
/*      */       }
/* 1755 */       if (l.bc != 1.0F)
/*      */       {
/* 1757 */         str = str + "Game Speed: " + l.bc + "x\n";
/*      */       }
/* 1759 */       if (l.bf)
/*      */       {
/* 1761 */         str = str + "Invincible Units\n";
/*      */       }
/*      */       
/* 1764 */       boolean bool = false;
/*      */       
/* 1766 */       for (m m : m.c()) {
/*      */         
/* 1768 */         if (m instanceof a) {
/*      */           
/* 1770 */           a a1 = (a)m;
/* 1771 */           bool = (a1.bo > 0.0F) ? true : false;
/*      */         } 
/*      */       } 
/* 1774 */       if (bool)
/*      */       {
/* 1776 */         str = str + "AIs frozen\n";
/*      */       }
/*      */       
/* 1779 */       this.bl.a();
/* 1780 */       this.bl.b(Color.a(0, 0, 0, 0));
/* 1781 */       this.bl.a(Paint.Style.a);
/*      */       
/* 1783 */       l.bw.a(str, 70.0F * l.bQ, 40.0F, this.as, this.bl, 6.0F);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1788 */     j();
/*      */     
/* 1790 */     this.n.f();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void j() {
/* 1796 */     l l = l.u();
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
/*      */   public void a(l paraml, m paramm, boolean paramBoolean1, boolean paramBoolean2) {
/* 1824 */     if (paramm.l) {
/*      */       int n;
/* 1826 */       String str = "$" + String.valueOf(paramm.m + paramm.n);
/*      */ 
/*      */       
/* 1829 */       int k = paramm.r();
/*      */       
/* 1831 */       if (k >= 0) {
/*      */         
/* 1833 */         str = str + "(+" + k + ")";
/*      */       }
/*      */       else {
/*      */         
/* 1837 */         str = str + "(" + k + ")";
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1844 */       byte b = 6;
/*      */ 
/*      */ 
/*      */       
/* 1848 */       if (!bz) {
/*      */         
/* 1850 */         n = (int)(paraml.bS - paraml.bX);
/*      */       }
/*      */       else {
/*      */         
/* 1854 */         n = (int)paraml.bS;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1859 */       Paint paint = this.ap;
/* 1860 */       if (paramBoolean1)
/*      */       {
/* 1862 */         paint = this.aq;
/*      */       }
/*      */       
/* 1865 */       float f1 = paraml.bw.b(str, paint);
/* 1866 */       float f2 = paraml.bw.a(str, paint);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1877 */       paraml.bw.a(str, n - f1 - b, (this.bJ + b), paint, this.ar, b);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1884 */       this.bJ = (int)(this.bJ + f2 + (b * 1));
/*      */     } 
/*      */ 
/*      */     
/* 1888 */     if (paramBoolean2) {
/*      */ 
/*      */ 
/*      */       
/* 1892 */       d d1 = paramm.P();
/* 1893 */       if (!d1.b())
/*      */       {
/* 1895 */         a(paraml, paramm, paramBoolean1, d1);
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
/*      */   public void a(l paraml, m paramm, boolean paramBoolean, d paramd) {
/* 1907 */     byte b = 6;
/*      */ 
/*      */     
/* 1910 */     for (c c1 : paramd.b) {
/*      */       
/* 1912 */       if (c1.b != 0.0D) {
/*      */         String str1;
/*      */         
/* 1915 */         if (c1.a.a()) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 1920 */         a a1 = c1.a;
/*      */ 
/*      */ 
/*      */         
/* 1924 */         if (a1.e) {
/*      */           
/* 1926 */           str1 = "" + (int)c1.b;
/*      */         }
/*      */         else {
/*      */           
/* 1930 */           str1 = com.corrodinggames.rts.gameFramework.f.c(c1.b);
/*      */         } 
/*      */         
/* 1933 */         String str2 = c1.a.g() + ": " + str1;
/*      */         
/* 1935 */         int k = paramm.a(c1.a);
/*      */         
/* 1937 */         if (k != 0)
/*      */         {
/*      */ 
/*      */           
/* 1941 */           if (k >= 0) {
/*      */             
/* 1943 */             str2 = str2 + "(+" + k + ")";
/*      */           }
/*      */           else {
/*      */             
/* 1947 */             str2 = str2 + "(" + k + ")";
/*      */           } 
/*      */         }
/*      */         
/* 1951 */         int n = (int)(paraml.bS - paraml.bX);
/*      */         
/* 1953 */         Paint paint = this.ap;
/*      */         
/* 1955 */         if (paramBoolean) {
/*      */           
/* 1957 */           paint = this.aq;
/*      */         }
/*      */         else {
/*      */           
/* 1961 */           Integer integer = c1.a.f();
/*      */           
/* 1963 */           if (integer != null) {
/*      */             
/* 1965 */             this.an.a(paint);
/* 1966 */             paint = this.an;
/* 1967 */             paint.b(integer.intValue());
/*      */           } 
/*      */         } 
/*      */         
/* 1971 */         float f1 = paraml.bw.b(str2, paint);
/* 1972 */         float f2 = paraml.bw.a(str2, paint);
/*      */         
/* 1974 */         paraml.bw.a(str2, n - f1 - b, (this.bJ + b), paint, this.ar, b);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1980 */         this.bJ = (int)(this.bJ + f2 + (b * 1));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(boolean paramBoolean) {
/* 1990 */     return a(paramBoolean, false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(boolean paramBoolean1, boolean paramBoolean2) {
/* 1996 */     return a(paramBoolean1, true, paramBoolean2);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/* 2001 */     l l = l.u();
/*      */     
/* 2003 */     if (l.al())
/*      */     {
/*      */ 
/*      */       
/* 2007 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2013 */     boolean bool = false;
/*      */     
/* 2015 */     this.aW = true;
/*      */     
/* 2017 */     float f1 = l.bQ * 0.6F;
/*      */     
/* 2019 */     int k = (int)(100.0F * f1);
/*      */     
/* 2021 */     int m = (int)(10.0F * f1);
/* 2022 */     int n = (int)(l.bT - (int)(9.0F * f1) - k * this.aX);
/*      */     
/* 2024 */     if (bz)
/*      */     {
/* 2026 */       n = (int)(n - l.bE.d);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2035 */     if (paramBoolean3) {
/*      */       
/* 2037 */       int i1 = (int)(20.0F * f1) + k;
/*      */       
/* 2039 */       i1 += (int)(20.0F * f1) + k;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2046 */       this.bj.a(m + i1, n, m + i1 + k, n + k);
/*      */ 
/*      */       
/* 2049 */       l.bw.a(this.aV, this.bj.a, this.bj.b, this.aY, 0.0F, f1);
/*      */     }
/* 2051 */     else if (paramBoolean1) {
/*      */       
/* 2053 */       this.bj.a(m, n, m + k, n + k);
/*      */ 
/*      */       
/* 2056 */       l.bw.a(this.aU, this.bj.a, this.bj.b, this.aY, 0.0F, f1);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 2061 */       int i1 = (int)(20.0F * f1) + k;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2069 */       this.bj.a(m + i1, n, m + i1 + k, n + k);
/*      */ 
/*      */       
/* 2072 */       l.bw.a(this.aT, this.bj.a, this.bj.b, this.aY, 0.0F, f1);
/*      */     } 
/*      */     
/* 2075 */     if (this.O && !this.N) {
/*      */       
/* 2077 */       com.corrodinggames.rts.gameFramework.f.a(this.bj, 10.0F * f1);
/*      */       
/* 2079 */       if (this.bj.b((int)this.s, (int)this.t))
/*      */       {
/* 2081 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 2085 */     return false;
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
/*      */   public boolean k() {
/* 2098 */     l l = l.u();
/*      */     
/* 2100 */     if (this.W != null) {
/*      */       
/* 2102 */       if (this.W.e() == u.b) {
/*      */ 
/*      */         
/* 2105 */         this.W = null;
/* 2106 */         this.Y = false;
/* 2107 */         this.ac = false;
/*      */         
/* 2109 */         this.U = null;
/*      */         
/* 2111 */         this.aj = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2118 */         this.X++;
/*      */       }
/*      */       else {
/*      */         
/* 2122 */         this.W = null;
/*      */       } 
/*      */       
/* 2125 */       this.am = 0;
/*      */       
/* 2127 */       return true;
/*      */     } 
/*      */     
/* 2130 */     return false;
/*      */   }
/*      */   
/*      */   public void c(float paramFloat) {
/*      */     float f1, f2;
/* 2135 */     l l = l.u();
/*      */     
/* 2137 */     Point point = l.bE.c(this.s, this.t);
/*      */ 
/*      */     
/* 2140 */     if (point != null) {
/*      */       
/* 2142 */       f1 = point.a;
/* 2143 */       f2 = point.b;
/*      */     }
/*      */     else {
/*      */       
/* 2147 */       f1 = this.s / l.cE + l.cd;
/* 2148 */       f2 = this.t / l.cE + l.ce;
/*      */     } 
/*      */     
/* 2151 */     this.Z = com.corrodinggames.rts.gameFramework.f.a(this.Z, paramFloat);
/*      */     
/* 2153 */     this.bi.a((int)(l.bS - l.bX), 0, (int)l.bS, (int)l.bT);
/*      */ 
/*      */     
/* 2156 */     if (!bw)
/*      */     {
/*      */       
/* 2159 */       if (this.O || this.D)
/*      */       {
/* 2161 */         if (this.bi.b((int)this.s, (int)this.t))
/*      */         {
/* 2163 */           this.aS = true;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 2169 */     this.d.a(paramFloat);
/* 2170 */     this.d.b(paramFloat);
/*      */     
/* 2172 */     this.R += paramFloat;
/*      */     
/* 2174 */     if (!l.t()) {
/*      */ 
/*      */       
/* 2177 */       int k = this.d.d(paramFloat);
/*      */ 
/*      */       
/* 2180 */       this.d.a(paramFloat, k);
/*      */       
/* 2182 */       this.d.g(paramFloat);
/*      */       
/* 2184 */       this.e.a(paramFloat);
/* 2185 */       this.f.a(paramFloat);
/*      */       
/* 2187 */       if (this.p)
/*      */       {
/* 2189 */         this.d.c(paramFloat);
/*      */       }
/*      */       
/* 2192 */       this.d.e(paramFloat);
/* 2193 */       this.d.a(paramFloat, true);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2198 */     a(paramFloat, f1, f2, point);
/*      */     
/* 2200 */     if (!l.t())
/*      */     {
/*      */       
/* 2203 */       if (!this.p)
/*      */       {
/* 2205 */         this.d.c(paramFloat);
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2215 */     boolean bool = false;
/*      */ 
/*      */     
/* 2218 */     if (!this.N) {
/*      */ 
/*      */ 
/*      */       
/* 2222 */       boolean bool1 = true;
/* 2223 */       boolean bool2 = true;
/* 2224 */       boolean bool3 = true;
/*      */       
/* 2226 */       if (l.al() && l.by.mouseSupport)
/*      */       {
/*      */         
/* 2229 */         if (l.by.mouseOrders == 0) {
/*      */           
/* 2231 */           bool1 = true;
/*      */         }
/*      */         else {
/*      */           
/* 2235 */           bool1 = false;
/* 2236 */           bool2 = false;
/* 2237 */           bool3 = false;
/*      */           
/* 2239 */           if (l.by.mouseOrders == 1) {
/*      */             
/* 2241 */             if (l.e(1))
/*      */             {
/* 2243 */               bool2 = true;
/*      */             }
/* 2245 */             else if (l.e(2))
/*      */             {
/* 2247 */               bool3 = true;
/*      */             
/*      */             }
/*      */ 
/*      */           
/*      */           }
/* 2253 */           else if (l.e(2)) {
/*      */             
/* 2255 */             bool2 = true;
/*      */           }
/* 2257 */           else if (l.e(1)) {
/*      */             
/* 2259 */             bool3 = true;
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 2266 */       float f3 = f1;
/* 2267 */       float f4 = f2;
/*      */ 
/*      */       
/* 2270 */       if (this.D && point != null && this.E) {
/*      */ 
/*      */ 
/*      */         
/* 2274 */         boolean bool4 = false;
/*      */         
/* 2276 */         if (!bool1 && !bool3)
/*      */         {
/* 2278 */           bool4 = true;
/*      */         }
/*      */         
/* 2281 */         if (p() == 0 || !A())
/*      */         {
/* 2283 */           bool4 = true;
/*      */         }
/*      */         
/* 2286 */         if (bool1 && this.r > 20.0F)
/*      */         {
/* 2288 */           bool4 = true;
/*      */         }
/*      */         
/* 2291 */         if (bool4) {
/*      */           
/* 2293 */           l.b(f3, f4);
/* 2294 */           bool = true;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2301 */       if ((this.x || (point != null && (bool1 || bool3))) && !bool && this.W == null)
/*      */       {
/*      */ 
/*      */         
/* 2305 */         if (this.O)
/*      */         {
/*      */ 
/*      */           
/* 2309 */           if (this.r > 30.0F) {
/*      */ 
/*      */             
/* 2312 */             if (a())
/*      */             {
/*      */ 
/*      */               
/* 2316 */               if (point == null)
/*      */               {
/*      */                 
/* 2319 */                 float f5 = b();
/*      */                 
/* 2321 */                 f5 /= l.cE;
/* 2322 */                 w();
/* 2323 */                 b(f3, f4, f5);
/* 2324 */                 C();
/*      */               }
/*      */             
/*      */             }
/*      */           }
/*      */           else {
/*      */             
/* 2331 */             l.cB = false;
/*      */ 
/*      */             
/* 2334 */             if (!bool1) {
/*      */ 
/*      */               
/* 2337 */               if (bool2)
/*      */               {
/*      */                 
/* 2340 */                 af af1 = null;
/* 2341 */                 if (point == null)
/*      */                 {
/* 2343 */                   af1 = a(f3, f4, true);
/*      */                 }
/*      */                 
/* 2346 */                 a(af1);
/*      */               }
/* 2348 */               else if (bool3)
/*      */               {
/*      */                 
/* 2351 */                 af af1 = null;
/* 2352 */                 if (point == null)
/*      */                 {
/* 2354 */                   af1 = a(f3, f4, false);
/*      */                 }
/*      */                 
/* 2357 */                 boolean bool4 = false;
/*      */                 
/* 2359 */                 if (af1 == null) {
/*      */ 
/*      */ 
/*      */                   
/* 2363 */                   bool4 = true;
/*      */ 
/*      */ 
/*      */                 
/*      */                 }
/* 2368 */                 else if (!a(af1, false, f3, f4, point)) {
/*      */ 
/*      */ 
/*      */                   
/* 2372 */                   bool4 = true;
/*      */                 } 
/*      */ 
/*      */                 
/* 2376 */                 if (bool4)
/*      */                 {
/* 2378 */                   c(f3, f4, point);
/*      */                 
/*      */                 }
/*      */               }
/*      */             
/*      */             }
/*      */             else {
/*      */               
/* 2386 */               af af1 = null;
/* 2387 */               af af2 = null;
/*      */               
/* 2389 */               if (point == null) {
/*      */                 
/* 2391 */                 af1 = a(f3, f4, true);
/* 2392 */                 af2 = a(f3, f4, false);
/*      */               } 
/*      */               
/* 2395 */               if (af1 == null && af2 == null) {
/*      */                 
/* 2397 */                 c(f3, f4, point);
/*      */               }
/* 2399 */               else if (af2 != null) {
/*      */ 
/*      */ 
/*      */                 
/* 2403 */                 if (!a(af2, true, f3, f4, point))
/*      */                 {
/*      */ 
/*      */                   
/* 2407 */                   if (!af2.t())
/*      */                   {
/*      */                     
/* 2410 */                     a(af2);
/*      */                   }
/* 2412 */                   else if (af1 != null)
/*      */                   {
/*      */                     
/* 2415 */                     a(af1);
/*      */                   }
/*      */                 
/*      */                 }
/*      */               } else {
/*      */                 
/* 2421 */                 a(af1);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2451 */     if (this.W == null)
/*      */     {
/* 2453 */       if (this.D && !this.N && !this.E && !this.aS) {
/*      */         
/* 2455 */         this.ao.a(Paint.Style.a);
/* 2456 */         this.ao.a(1.0F);
/*      */ 
/*      */         
/* 2459 */         if (this.r > 20.0F && a()) {
/*      */ 
/*      */           
/* 2462 */           float f3 = b();
/*      */           
/* 2464 */           this.ao.a(100, 0, 255, 0);
/*      */           
/* 2466 */           l.bw.a(this.s, this.t, f3, this.ao);
/*      */           
/* 2468 */           this.ao.a(Paint.Style.b);
/* 2469 */           this.ao.a(1.0F);
/* 2470 */           this.ao.a(200, 0, 255, 0);
/*      */           
/* 2472 */           l.bw.a(this.s, this.t, f3, this.ao);
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
/* 2484 */     if (l.aU)
/*      */     {
/* 2486 */       if (l.T() && l.V() > 0) {
/*      */         
/* 2488 */         Paint paint = new Paint();
/* 2489 */         paint.c(100);
/*      */         
/* 2491 */         for (byte b = 0; b < l.V(); b++) {
/*      */           
/* 2493 */           l.bw.h();
/* 2494 */           l.bw.a(0.7F, 0.7F, l.b(b), l.c(b));
/* 2495 */           l.bw.a(this.bf, l.b(b), l.c(b), paint);
/* 2496 */           l.bw.i();
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/* 2501 */     if (!this.D) {
/*      */       
/* 2503 */       this.r = 0.0F;
/* 2504 */       this.N = false;
/*      */     } 
/*      */     
/* 2507 */     this.C = this.D;
/*      */ 
/*      */     
/* 2510 */     l.U();
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
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, Point paramPoint) {
/* 2523 */     l l = l.u();
/*      */ 
/*      */     
/* 2526 */     if (this.aW) {
/*      */       
/* 2528 */       this.aX = com.corrodinggames.rts.gameFramework.f.a(this.aX, 1.0F, 0.05F * paramFloat1);
/*      */       
/* 2530 */       this.aX = (float)(this.aX + 0.08D * (1.0F - this.aX));
/*      */     }
/*      */     else {
/*      */       
/* 2534 */       this.aX = com.corrodinggames.rts.gameFramework.f.a(this.aX, 0.0F, 0.3F * paramFloat1);
/*      */     } 
/* 2536 */     this.aW = false;
/*      */     
/* 2538 */     if (this.W != null)
/*      */     {
/*      */       
/* 2541 */       if (this.W.e() == u.e) {
/*      */         
/* 2543 */         a(this.W, false, (af)null, false);
/*      */         
/* 2545 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2548 */           k();
/*      */           
/* 2550 */           this.O = false;
/*      */         }
/* 2552 */         else if (this.O && !this.N && !l())
/*      */         {
/*      */           
/* 2555 */           af af1 = a(paramFloat2, paramFloat3, false);
/* 2556 */           if (af1 != null && this.W.p(af1)) {
/*      */             
/* 2558 */             b(af1);
/*      */             
/* 2560 */             if (!a(l))
/*      */             {
/*      */               
/* 2563 */               k();
/*      */             }
/*      */           }
/*      */           else {
/*      */             
/* 2568 */             a(paramFloat2, paramFloat3, 0.0F);
/*      */           } 
/*      */           
/* 2571 */           this.O = false;
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/* 2578 */       else if (this.W.e() == u.f) {
/*      */         
/* 2580 */         a(this.W, false, (af)null, false);
/*      */         
/* 2582 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2585 */           k();
/*      */           
/* 2587 */           this.O = false;
/*      */         }
/* 2589 */         else if (this.O && !this.N && !l())
/*      */         {
/* 2591 */           af af1 = a(paramFloat2, paramFloat3, true);
/* 2592 */           if (af1 != null && this.W.p(af1)) {
/*      */             
/* 2594 */             d(af1);
/*      */             
/* 2596 */             if (!a(l))
/*      */             {
/* 2598 */               k();
/*      */             }
/*      */           }
/*      */           else {
/*      */             
/* 2603 */             a(paramFloat2, paramFloat3, 0.0F);
/*      */           } 
/*      */           
/* 2606 */           this.O = false;
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 2614 */       else if (this.W.e() == u.d) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2621 */         a(this.W, false, (af)null, false);
/*      */         
/* 2623 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2626 */           k();
/*      */           
/* 2628 */           this.O = false;
/*      */         }
/* 2630 */         else if (this.O && !this.N && !l())
/*      */         {
/* 2632 */           b(paramFloat2, paramFloat3);
/*      */           
/* 2634 */           k();
/*      */           
/* 2636 */           this.O = false;
/*      */         }
/*      */       
/*      */       }
/* 2640 */       else if (this.W.e() == u.g) {
/*      */ 
/*      */         
/* 2643 */         a(this.W, false, (af)null, false);
/*      */ 
/*      */         
/* 2646 */         af af1 = this.d.f();
/* 2647 */         if (af1 != null && af1 instanceof r) {
/*      */           
/* 2649 */           l.bw.h();
/* 2650 */           l.K();
/*      */           
/* 2652 */           ((r)af1).a(this.W);
/*      */           
/* 2654 */           l.bw.i();
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 2659 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2662 */           k();
/*      */           
/* 2664 */           this.O = false;
/*      */         }
/* 2666 */         else if (this.O && !this.N && !l())
/*      */         {
/* 2668 */           if (paramPoint == null)
/*      */           {
/*      */             
/* 2671 */             boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 2682 */             if (a(this.W, paramFloat2, paramFloat3))
/*      */             {
/* 2684 */               bool = true;
/*      */             }
/*      */ 
/*      */             
/* 2688 */             if (!bool) {
/*      */               
/* 2690 */               b(this.W, paramFloat2, paramFloat3);
/*      */               
/* 2692 */               if (!a(l))
/*      */               {
/*      */                 
/* 2695 */                 k();
/*      */               
/*      */               }
/*      */             }
/*      */             else {
/*      */               
/* 2701 */               a(paramFloat2, paramFloat3, 0.0F);
/*      */             } 
/*      */             
/* 2704 */             this.O = false;
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 2711 */       else if (this.W.e() == u.h) {
/*      */         
/* 2713 */         a(this.W, false, (af)null, false);
/*      */         
/* 2715 */         if (b(false) || m()) {
/*      */ 
/*      */           
/* 2718 */           k();
/*      */           
/* 2720 */           this.O = false;
/*      */         }
/* 2722 */         else if (this.O && !this.N && !l()) {
/*      */           
/* 2724 */           d(paramFloat2, paramFloat3, paramPoint);
/* 2725 */           if (!a(l))
/*      */           {
/*      */             
/* 2728 */             k();
/*      */             
/* 2730 */             this.O = false;
/*      */           }
/*      */         
/*      */         } 
/* 2734 */       } else if (this.W.e() == u.l) {
/*      */         
/* 2736 */         a(this.W, false, (af)null, false);
/*      */         
/* 2738 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2741 */           k();
/*      */           
/* 2743 */           this.O = false;
/*      */         }
/* 2745 */         else if (this.O && !this.N && !l())
/*      */         {
/* 2747 */           af af1 = a(paramFloat2, paramFloat3, true);
/* 2748 */           if (af1 != null && this.W.p(af1)) {
/*      */             
/* 2750 */             e(af1);
/*      */             
/* 2752 */             k();
/*      */           }
/*      */           else {
/*      */             
/* 2756 */             a(paramFloat2, paramFloat3, 0.0F);
/*      */           } 
/*      */           
/* 2759 */           this.O = false;
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/* 2765 */       else if (this.W.e() == u.m) {
/*      */         
/* 2767 */         a(this.W, false, (af)null, false);
/*      */         
/* 2769 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2772 */           k();
/*      */           
/* 2774 */           this.O = false;
/*      */         }
/* 2776 */         else if (this.O && !this.N && !l())
/*      */         {
/*      */           
/* 2779 */           a(paramFloat2, paramFloat3, paramPoint, (this.am == 0));
/* 2780 */           this.am++;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 2795 */       else if (this.W.e() == u.j) {
/*      */ 
/*      */         
/* 2798 */         a(this.W, false, (af)null, false);
/*      */ 
/*      */         
/* 2801 */         if (b(false) || m())
/*      */         {
/*      */           
/* 2804 */           k();
/*      */           
/* 2806 */           this.O = false;
/*      */         }
/* 2808 */         else if (this.O && !this.N && !l())
/*      */         {
/* 2810 */           if (paramPoint == null)
/*      */           {
/*      */             
/* 2813 */             if (this.W instanceof j) {
/*      */               
/* 2815 */               a(paramFloat2, paramFloat3, paramPoint, (j)this.W);
/*      */             }
/*      */             else {
/*      */               
/* 2819 */               l.b("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.W.getClass().getName());
/*      */             } 
/*      */ 
/*      */             
/* 2823 */             k();
/*      */             
/* 2825 */             this.O = false;
/*      */           }
/*      */         
/*      */         }
/*      */       
/* 2830 */       } else if (this.W.i() != null && this.W
/* 2831 */         .e() == u.b) {
/*      */ 
/*      */         
/* 2834 */         a(paramFloat2, paramFloat3, paramPoint);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, Point paramPoint) {
/* 2845 */     l l = l.u();
/*      */ 
/*      */     
/* 2848 */     af af1 = this.d.f();
/*      */     
/* 2850 */     boolean bool1 = false;
/* 2851 */     if (af1 != null) {
/*      */       
/* 2853 */       bool1 = (this.W.a(af1, true) && !a.a(this.W)) ? true : false;
/*      */       
/* 2855 */       if (!this.W.a(af1))
/*      */       {
/* 2857 */         bool1 = false;
/*      */       }
/*      */     } 
/*      */     
/* 2861 */     a(this.W, false, (af)null, !bool1);
/*      */     
/* 2863 */     float f1 = this.u / l.cE;
/* 2864 */     float f2 = this.v / l.cE;
/*      */     
/* 2866 */     float f3 = f1;
/* 2867 */     float f4 = f2;
/*      */ 
/*      */     
/* 2870 */     boolean bool2 = false;
/* 2871 */     boolean bool3 = false;
/* 2872 */     boolean bool4 = false;
/* 2873 */     boolean bool = false;
/*      */ 
/*      */     
/* 2876 */     if (l.am() && l.by.mouseSupport) {
/*      */       
/* 2878 */       bool2 = true;
/*      */       
/* 2880 */       bool = this.G;
/*      */     } 
/*      */ 
/*      */     
/* 2884 */     if (bool2) {
/*      */       
/* 2886 */       if (n()) {
/*      */         
/* 2888 */         if (!this.aj)
/*      */         {
/* 2890 */           this.aj = true;
/*      */           
/* 2892 */           this.ah = f3 + l.cd;
/* 2893 */           this.ai = f4 + l.ce;
/*      */         }
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 2899 */         this.aj = false;
/*      */       } 
/*      */       
/* 2902 */       if (this.aj) {
/*      */         
/* 2904 */         float f7 = f3 - this.ah - l.cd;
/* 2905 */         float f8 = f4 - this.ai - l.ce;
/*      */         
/* 2907 */         if (com.corrodinggames.rts.gameFramework.f.c(f7) > 4.0F || com.corrodinggames.rts.gameFramework.f.c(f8) > 4.0F)
/*      */         {
/* 2909 */           bool3 = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 2915 */     boolean bool5 = false;
/* 2916 */     boolean bool6 = false;
/* 2917 */     boolean bool7 = false;
/* 2918 */     boolean bool8 = false;
/*      */     
/* 2920 */     boolean bool9 = true;
/*      */     
/* 2922 */     boolean bool10 = false;
/* 2923 */     if (l.al() && l.by.mouseSupport)
/*      */     {
/*      */ 
/*      */       
/* 2927 */       bool10 = true;
/*      */     }
/*      */ 
/*      */     
/* 2931 */     if (this.Y && !bool10) {
/*      */       
/* 2933 */       if (bool1) {
/*      */         
/* 2935 */         if (!this.ac)
/*      */         {
/* 2937 */           if (a(true, false)) {
/*      */ 
/*      */             
/* 2940 */             l.bu.b(e.g, 0.5F);
/*      */             
/* 2942 */             this.O = false;
/* 2943 */             bool5 = true;
/*      */           } 
/*      */         }
/*      */         
/* 2947 */         if (a(true, true)) {
/*      */ 
/*      */           
/* 2950 */           l.bu.b(e.g, 0.5F);
/* 2951 */           this.O = false;
/* 2952 */           bool7 = true;
/*      */         } 
/*      */       } 
/*      */       
/* 2956 */       if (a(false, false)) {
/*      */ 
/*      */         
/* 2959 */         l.bu.b(e.h, 0.7F);
/* 2960 */         this.O = false;
/* 2961 */         bool6 = true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2969 */     boolean bool11 = false;
/* 2970 */     if (l.am() && l.by.mouseSupport)
/*      */     {
/* 2972 */       bool11 = true;
/*      */     }
/*      */     
/* 2975 */     if (this.O && !this.N)
/*      */     {
/* 2977 */       bool11 = true;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2984 */     if (l.ak()) {
/*      */       
/* 2986 */       bool4 = true;
/*      */ 
/*      */       
/* 2989 */       if (l.V() == 2) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2998 */         bool11 = true;
/* 2999 */         f3 = l.b(0) / l.cE;
/* 3000 */         f4 = l.c(0) / l.cE;
/*      */ 
/*      */         
/* 3003 */         float f7 = l.b(1) / l.cE;
/* 3004 */         float f8 = l.c(1) / l.cE;
/*      */ 
/*      */         
/* 3007 */         this.aj = true;
/*      */         
/* 3009 */         this.ah = f7;
/* 3010 */         this.ai = f8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 3017 */       else if (this.O && !this.N) {
/*      */         
/* 3019 */         this.aj = false;
/*      */       } 
/*      */ 
/*      */       
/* 3023 */       if (this.aj)
/*      */       {
/* 3025 */         bool3 = true;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3032 */     if (bool11) {
/*      */       
/* 3034 */       this.Y = true;
/*      */       
/* 3036 */       this.aa = f3 * l.cE;
/* 3037 */       this.ab = f4 * l.cE;
/*      */ 
/*      */       
/* 3040 */       if (!a(l.W(), l.X())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3046 */         this.Y = false;
/* 3047 */         bool9 = false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3054 */     float f5 = this.ah;
/* 3055 */     float f6 = this.ai;
/*      */     
/* 3057 */     if (bool4) {
/*      */       
/* 3059 */       f5 += l.cd + l.bY;
/* 3060 */       f6 += l.ce + l.bZ;
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
/* 3071 */     al al = this.W.i();
/* 3072 */     int k = this.W.p();
/*      */ 
/*      */     
/* 3075 */     boolean bool12 = false;
/* 3076 */     if (l.am() && l.by.mouseSupport)
/*      */     {
/* 3078 */       if (!l.cr.b((int)this.u, (int)this.v))
/*      */       {
/* 3080 */         bool12 = true;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3086 */     af af2 = af.c(al);
/* 3087 */     if (af2 == null || !(af2 instanceof r))
/*      */     {
/*      */ 
/*      */ 
/*      */       
/* 3092 */       if (l.b != null)
/*      */       {
/* 3094 */         af2 = af.c((al)l.b);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 3099 */     if (this.Y && !bool12) {
/*      */       
/* 3101 */       r r1 = (r)af2;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3106 */       l.bt.b(this.aa / l.cE + l.cd, this.ab / l.cE + l.ce);
/*      */       
/* 3108 */       r1.dH = l.bt.M;
/* 3109 */       r1.dI = l.bt.N;
/*      */       
/* 3111 */       if (al.p()) {
/*      */         
/* 3113 */         bool3 = false;
/*      */ 
/*      */         
/* 3116 */         Point point = h.a((int)r1.dH, (int)r1.dI, 3);
/*      */         
/* 3118 */         if (point != null) {
/*      */           
/* 3120 */           r1.dH = point.a;
/* 3121 */           r1.dI = point.b;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 3126 */       if (!r1.bw()) {
/*      */         
/* 3128 */         r1.bL = 0.0F;
/*      */       }
/*      */       else {
/*      */         
/* 3132 */         r1.bL = -90.0F;
/*      */       } 
/*      */       
/* 3135 */       r1.dH += r1.cH();
/* 3136 */       r1.dI += r1.cI();
/* 3137 */       r1.a(this.U.bB);
/* 3138 */       r1.a(k);
/* 3139 */       r1.bT = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3146 */       String str = r1.e(false);
/*      */ 
/*      */       
/* 3149 */       if (a.a(l.bb, r1, this.X))
/*      */       {
/*      */         
/* 3152 */         str = "{0}";
/*      */       }
/*      */       
/* 3155 */       if (p() == 1 && af1 != null && af1 instanceof r) {
/*      */         
/* 3157 */         r r2 = (r)af1;
/* 3158 */         if (!r2.aN()) {
/*      */           boolean bool13;
/* 3160 */           float f7 = com.corrodinggames.rts.gameFramework.f.a(r2.dH, r2.dI, r1.dH, r1.dI);
/* 3161 */           float f8 = r2.f(r1.r());
/*      */           
/* 3163 */           if (f8 > 800000.0F) {
/*      */             
/* 3165 */             bool13 = true;
/*      */           }
/*      */           else {
/*      */             
/* 3169 */             bool13 = (f7 <= f8 * f8) ? true : false;
/*      */           } 
/* 3171 */           if (!bool13)
/*      */           {
/*      */             
/* 3174 */             str = "{0}";
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3181 */       if (bool3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3187 */       af af3 = null;
/* 3188 */       if (p() == 1)
/*      */       {
/* 3190 */         af3 = af1;
/*      */       }
/*      */       
/* 3193 */       if (bool1)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 3198 */         if (bool3) {
/*      */ 
/*      */           
/* 3201 */           if (l.al() || (l.ak() && l.V() == 2)) {
/*      */ 
/*      */ 
/*      */             
/* 3205 */             l.bw.a(f3 * l.cE, f4 * l.cE, (f5 - l.cd) * l.cE, (f6 - l.ce) * l.cE, this.bn);
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3215 */             l.bw.a((r1.dH - l.cd) * l.cE, (r1.dI - l.ce) * l.cE, (f5 - l.cd) * l.cE, (f6 - l.ce) * l.cE, this.bn);
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 3226 */           boolean bool13 = true;
/*      */ 
/*      */           
/* 3229 */           str = null;
/*      */           
/* 3231 */           a(r1, f5, f6, r1.dH, r1.dI, bool13, (ArrayList)null, af3);
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 3236 */           a(r1, r1.dH, r1.dI, true, bool, af3);
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 3241 */       r1.a(1);
/*      */       
/* 3243 */       if (bool9)
/*      */       {
/* 3245 */         if (o()) {
/*      */           
/* 3247 */           this.O = false;
/*      */           
/* 3249 */           if (a(l)) {
/*      */             
/* 3251 */             bool7 = true;
/* 3252 */             bool8 = true;
/*      */           }
/*      */           else {
/*      */             
/* 3256 */             bool5 = true;
/*      */           } 
/*      */         } 
/*      */       }
/*      */       
/* 3261 */       if (m()) {
/*      */         
/* 3263 */         this.O = false;
/* 3264 */         bool6 = true;
/*      */       } 
/*      */ 
/*      */       
/* 3268 */       if (this.O && !this.N) {
/*      */ 
/*      */         
/* 3271 */         float f7 = f3;
/* 3272 */         float f8 = f4;
/*      */         
/* 3274 */         float f9 = this.ak;
/* 3275 */         float f10 = this.al;
/*      */ 
/*      */         
/* 3278 */         float f11 = 15.0F;
/*      */         
/* 3280 */         if (com.corrodinggames.rts.gameFramework.f.c(f9 - f7) < f11 && 
/* 3281 */           com.corrodinggames.rts.gameFramework.f.c(f10 - f8) < f11)
/*      */         {
/* 3283 */           if (this.Z != 0.0F) {
/*      */             
/* 3285 */             this.O = false;
/*      */             
/* 3287 */             l.bu.b(e.g, 0.5F);
/*      */             
/* 3289 */             if (this.ac) {
/*      */               
/* 3291 */               bool7 = true;
/*      */             }
/*      */             else {
/*      */               
/* 3295 */               bool5 = true;
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/* 3301 */         this.Z = 80.0F;
/* 3302 */         this.ak = f3;
/* 3303 */         this.al = f4;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3310 */       if ((bool5 || bool7) && bool1)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3318 */         if (str != null) {
/*      */           
/* 3320 */           l.bu.b(e.k, 0.7F);
/*      */           
/* 3322 */           if (str != "{0}")
/*      */           {
/* 3324 */             String str1 = str;
/* 3325 */             if (str1 == "{2}")
/*      */             {
/* 3327 */               str1 = this.bs;
/*      */             }
/* 3329 */             if (str1 == "{3}")
/*      */             {
/* 3331 */               str1 = this.bt;
/*      */             }
/*      */             
/* 3334 */             if (str1 == "{1}")
/*      */             {
/* 3336 */               str1 = this.br;
/*      */             }
/* 3338 */             b(str1);
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 3344 */           float f7 = r1.dH;
/* 3345 */           float f8 = r1.dI;
/*      */ 
/*      */           
/* 3348 */           ArrayList<PointF> arrayList = new ArrayList();
/*      */           
/* 3350 */           if (bool3) {
/*      */             
/* 3352 */             boolean bool14 = false;
/*      */             
/* 3354 */             a(r1, f5, f6, r1.dH, r1.dI, bool14, arrayList, (af)null);
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 3359 */             arrayList.add(new PointF(f7, f8));
/*      */           } 
/*      */ 
/*      */           
/* 3363 */           byte b = 0;
/*      */           
/* 3365 */           boolean bool13 = true;
/* 3366 */           for (PointF pointF : arrayList) {
/*      */ 
/*      */ 
/*      */             
/* 3370 */             if (this.W.x()) {
/*      */               
/* 3372 */               e e2 = v();
/* 3373 */               a(e2);
/* 3374 */               e2.a(this.W.J(), pointF, null);
/*      */               
/*      */               continue;
/*      */             } 
/* 3378 */             e e1 = v();
/*      */             
/* 3380 */             if (bool13) {
/*      */               
/* 3382 */               bool13 = false;
/* 3383 */               if (bool7)
/*      */               {
/*      */ 
/*      */                 
/* 3387 */                 if (!e1.e)
/*      */                 {
/* 3389 */                   e1.f = true;
/*      */                 }
/*      */                 
/* 3392 */                 this.ac = true;
/*      */               }
/*      */             
/*      */             } else {
/*      */               
/* 3397 */               e1.e = true;
/*      */             } 
/*      */             
/* 3400 */             r r2 = r();
/*      */ 
/*      */ 
/*      */             
/* 3404 */             if (this.W instanceof g) {
/*      */               
/* 3406 */               r r3 = ((g)this.W).b;
/*      */               
/* 3408 */               e1.a(r3);
/* 3409 */               r2 = r3;
/*      */             
/*      */             }
/*      */             else {
/*      */ 
/*      */               
/* 3415 */               a(e1);
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 3420 */             e1.a(pointF.a, pointF.b, al, k);
/*      */ 
/*      */             
/* 3423 */             if (r2 != null) {
/*      */               
/* 3425 */               a a1 = new a();
/* 3426 */               a1.d = al;
/* 3427 */               a1.g = pointF.a;
/* 3428 */               a1.h = pointF.b;
/* 3429 */               a1.n = true;
/* 3430 */               a1.o = r2;
/* 3431 */               a1.e = l.bb;
/* 3432 */               a1.f = k;
/* 3433 */               a1.j = l.bb;
/* 3434 */               a1.r = this.X;
/*      */               
/* 3436 */               a1.s = 1.0F + 0.15F * b;
/*      */               
/* 3438 */               if (r2.at() >= 29)
/*      */               {
/* 3440 */                 a1.q = true;
/*      */               }
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 3446 */             b++;
/*      */           } 
/*      */ 
/*      */           
/* 3450 */           this.aN = 5.0F;
/*      */           
/* 3452 */           if (l.am())
/*      */           {
/* 3454 */             this.aN = 1.0F;
/*      */           }
/*      */           
/* 3457 */           this.aj = false;
/*      */           
/* 3459 */           if (!bool7) {
/*      */ 
/*      */             
/* 3462 */             if (b > 0)
/*      */             {
/*      */               
/* 3465 */               boolean bool14 = true;
/* 3466 */               if (r1 != null && !p((af)r1))
/*      */               {
/* 3468 */                 bool14 = false;
/*      */               }
/*      */               
/* 3471 */               this.W = null;
/* 3472 */               this.Y = false;
/* 3473 */               this.ac = false;
/*      */               
/* 3475 */               this.U = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3482 */               if (bool14)
/*      */               {
/* 3484 */                 w();
/*      */               }
/*      */               
/* 3487 */               this.X++;
/*      */             }
/*      */           
/*      */           }
/* 3491 */           else if (!bool8) {
/*      */ 
/*      */             
/* 3494 */             float f9 = r1.dH;
/* 3495 */             float f10 = r1.dI;
/*      */             
/* 3497 */             boolean bool14 = false;
/*      */ 
/*      */             
/* 3500 */             if (com.corrodinggames.rts.gameFramework.f.c(f9 - this.ad) < (r1.bP().b() * l.bt.k) * 2.0F + (3 * l.bt.k) && 
/* 3501 */               com.corrodinggames.rts.gameFramework.f.c(f10 - this.ae) < (r1.bP().c() * l.bt.l) * 2.0F + (3 * l.bt.l)) {
/*      */ 
/*      */               
/* 3504 */               this.af = f9 - this.ad;
/* 3505 */               this.ag = f10 - this.ae;
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3510 */               if (com.corrodinggames.rts.gameFramework.f.c(this.af) > com.corrodinggames.rts.gameFramework.f.c(this.ag)) {
/*      */                 
/* 3512 */                 this.ag = 0.0F;
/*      */               }
/*      */               else {
/*      */                 
/* 3516 */                 this.af = 0.0F;
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 3522 */             if (r1.bP().c() > r1.bP().b() + 1)
/*      */             {
/*      */               
/* 3525 */               this.ag = 0.0F;
/*      */             }
/*      */ 
/*      */             
/* 3529 */             this.ad = f9;
/* 3530 */             this.ae = f10;
/*      */ 
/*      */ 
/*      */             
/* 3534 */             float f11 = 0.0F;
/* 3535 */             float f12 = 0.0F;
/* 3536 */             if (this.ag < 0.0F) f11 = -1.0F; 
/* 3537 */             if (this.af < 0.0F) f12 = -1.0F; 
/* 3538 */             if (this.ag > 0.0F) f11 = 1.0F; 
/* 3539 */             if (this.af > 0.0F) f12 = 1.0F;
/*      */ 
/*      */             
/* 3542 */             if (f12 == 0.0F && f11 == 0.0F)
/*      */             {
/* 3544 */               f12 = 1.0F;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3574 */             ArrayList arrayList1 = new ArrayList();
/*      */             
/* 3576 */             float f13 = f9 + 200.0F * f12;
/* 3577 */             float f14 = f10 + 200.0F * f11;
/*      */ 
/*      */ 
/*      */             
/* 3581 */             float f15 = -r1.cH() + 1.0F;
/* 3582 */             float f16 = -r1.cI() + 1.0F;
/*      */             
/* 3584 */             boolean bool15 = false;
/* 3585 */             a(r1, f9 + f15, f10 + f16, f13 + f15, f14 + f16, bool15, arrayList1, (af)null);
/*      */             
/* 3587 */             if (arrayList1.size() > 0) {
/*      */               
/* 3589 */               r1.dH = ((PointF)arrayList1.get(0)).a;
/* 3590 */               r1.dI = ((PointF)arrayList1.get(0)).b;
/* 3591 */               bool14 = true;
/*      */             } 
/*      */ 
/*      */             
/* 3595 */             if (!bool14) {
/*      */               
/* 3597 */               f13 = f9 + 200.0F * -f12;
/* 3598 */               f14 = f10 + 200.0F * -f11;
/*      */               
/* 3600 */               a(r1, f9 + f15, f10 + f16, f13 + f15, f14 + f16, bool15, arrayList1, (af)null);
/*      */               
/* 3602 */               if (arrayList1.size() > 0) {
/*      */                 
/* 3604 */                 r1.dH = ((PointF)arrayList1.get(0)).a;
/* 3605 */                 r1.dI = ((PointF)arrayList1.get(0)).b;
/* 3606 */                 bool14 = true;
/*      */               } 
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 3651 */             if (!bool14) {
/*      */ 
/*      */ 
/*      */               
/* 3655 */               r1.dH += (3 * l.bt.k);
/* 3656 */               r1.dI += l.bt.k;
/*      */             } 
/*      */ 
/*      */             
/* 3660 */             if (bool14) {
/*      */               
/* 3662 */               float f17 = r1.dH - f9;
/* 3663 */               float f18 = r1.dI - f10;
/* 3664 */               float f19 = l.cf;
/* 3665 */               float f20 = l.cg;
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3670 */               l.bY += f17;
/* 3671 */               l.bZ += f18;
/*      */ 
/*      */ 
/*      */               
/* 3675 */               l.cf += l.bY;
/* 3676 */               l.cg += l.bZ;
/*      */               
/* 3678 */               float f21 = l.cf;
/* 3679 */               float f22 = l.cg;
/*      */               
/* 3681 */               l.J();
/*      */               
/* 3683 */               float f23 = l.cf - f21;
/* 3684 */               float f24 = l.cg - f22;
/*      */ 
/*      */ 
/*      */               
/* 3688 */               l.bY += f23;
/* 3689 */               l.bZ += f24;
/*      */ 
/*      */               
/* 3692 */               float f25 = f19 + f17 - l.cf;
/* 3693 */               float f26 = f20 + f18 - l.cg;
/* 3694 */               if (com.corrodinggames.rts.gameFramework.f.c(f25) > 1.0F)
/*      */               {
/*      */ 
/*      */                 
/* 3698 */                 this.aa += f25 * l.cE;
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3704 */               if (com.corrodinggames.rts.gameFramework.f.c(f26) > 1.0F)
/*      */               {
/* 3706 */                 this.ab += f26 * l.cE;
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3716 */               l.cf -= l.bY;
/* 3717 */               l.cg -= l.bZ;
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
/* 3728 */       if (bool6) {
/*      */         
/* 3730 */         k();
/*      */         
/* 3732 */         if (this.ac)
/*      */         {
/* 3734 */           w();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean l() {
/* 3743 */     l l = l.u();
/*      */     
/* 3745 */     if (l.am() && l.by.mouseSupport)
/*      */     {
/* 3747 */       if (!m() && !o())
/*      */       {
/* 3749 */         return true;
/*      */       }
/*      */     }
/*      */     
/* 3753 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean m() {
/* 3758 */     l l = l.u();
/*      */     
/* 3760 */     if (l.am() && l.by.mouseSupport)
/*      */     {
/* 3762 */       if (this.O && !this.N && !this.aS) {
/*      */         
/* 3764 */         byte b1 = 1;
/* 3765 */         byte b2 = 2;
/*      */         
/* 3767 */         if (l.by.mousePlacement == 2) {
/*      */           
/* 3769 */           b1 = 2;
/* 3770 */           b2 = 1;
/*      */         } 
/*      */         
/* 3773 */         if (l.e(b1));
/*      */ 
/*      */ 
/*      */         
/* 3777 */         if (l.e(b2))
/*      */         {
/* 3779 */           return true;
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 3785 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean n() {
/* 3791 */     l l = l.u();
/*      */     
/* 3793 */     if (l.al() && l.by.mouseSupport && (this.O || this.D)) {
/*      */ 
/*      */       
/* 3796 */       byte b1 = 1;
/* 3797 */       byte b2 = 2;
/*      */       
/* 3799 */       if (l.by.mousePlacement == 2) {
/*      */         
/* 3801 */         b1 = 2;
/* 3802 */         b2 = 1;
/*      */       } 
/*      */ 
/*      */       
/* 3806 */       if (l.e(b1))
/*      */       {
/* 3808 */         return true;
/*      */       }
/* 3810 */       if (l.e(b2));
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3817 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean o() {
/* 3822 */     if (this.O && !this.N && !this.aS)
/*      */     {
/* 3824 */       return n();
/*      */     }
/*      */     
/* 3827 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(af paramaf) {
/* 3833 */     l l = l.u();
/*      */     
/* 3835 */     if (paramaf != null && this.Q == paramaf && this.R < 40.0F && !b(l)) {
/*      */       
/* 3837 */       if (!a(l))
/*      */       {
/* 3839 */         w();
/*      */       }
/*      */       
/* 3842 */       h(paramaf);
/*      */ 
/*      */     
/*      */     }
/* 3846 */     else if (paramaf != null) {
/*      */ 
/*      */       
/* 3849 */       if (!a(l) && !b(l))
/*      */       {
/* 3851 */         w();
/*      */       }
/*      */ 
/*      */       
/* 3855 */       a(paramaf, b(l));
/*      */       
/* 3857 */       this.Q = paramaf;
/* 3858 */       this.R = 0.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(af paramaf, boolean paramBoolean, float paramFloat1, float paramFloat2, Point paramPoint) {
/* 3868 */     l l = l.u();
/*      */ 
/*      */     
/* 3871 */     m m = q();
/*      */ 
/*      */     
/* 3874 */     boolean bool = m.c(paramaf.bB);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3880 */     if (bool)
/*      */     {
/* 3882 */       if (z() && q(paramaf)) {
/*      */         
/* 3884 */         c(paramaf);
/* 3885 */         return true;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3891 */     if (m.d(paramaf.bB))
/*      */     {
/*      */ 
/*      */       
/* 3895 */       if (paramaf.bY < paramaf.bZ || paramaf.bR < 1.0F)
/*      */       {
/* 3897 */         if (p() != 0) {
/*      */           
/* 3899 */           boolean bool2 = true;
/* 3900 */           boolean bool3 = false;
/*      */           
/* 3902 */           boolean bool4 = false;
/*      */           
/* 3904 */           boolean bool5 = false;
/*      */           
/* 3906 */           if (paramaf.cc()) {
/*      */             
/* 3908 */             af af1 = paramaf;
/* 3909 */             if (n(af1))
/*      */             {
/* 3911 */               bool3 = true;
/*      */             }
/*      */           } 
/*      */           
/* 3915 */           for (w w : this.bF) {
/*      */             
/* 3917 */             if (w instanceof r) {
/*      */               
/* 3919 */               r r1 = (r)w;
/* 3920 */               if (r1.ci) {
/*      */                 
/* 3922 */                 if (!m((af)r1)) {
/*      */                   
/* 3924 */                   bool2 = false;
/*      */                   
/*      */                   break;
/*      */                 } 
/* 3928 */                 if (!r1.a(paramaf)) {
/*      */                   
/* 3930 */                   bool2 = false;
/*      */                   
/*      */                   break;
/*      */                 } 
/* 3934 */                 if (r1.aO())
/*      */                 {
/* 3936 */                   bool5 = true;
/*      */                 }
/*      */                 
/* 3939 */                 an an = r1.ap();
/* 3940 */                 if (an != null && an.d() == ao.d)
/*      */                 {
/* 3942 */                   bool4 = true;
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           } 
/*      */ 
/*      */           
/* 3949 */           if (bool2)
/*      */           {
/* 3951 */             if (!bool4 || !bool3) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3958 */               if (bool5) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 3965 */                 d(paramaf);
/*      */               
/*      */               }
/*      */               else {
/*      */                 
/* 3970 */                 d(paramaf);
/*      */               } 
/*      */ 
/*      */               
/* 3974 */               return true;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3984 */     if (paramaf.g() > 0.0F)
/*      */     {
/* 3986 */       if (p() != 0) {
/*      */         
/* 3988 */         boolean bool2 = true;
/*      */         
/* 3990 */         for (w w : w.dK) {
/*      */           
/* 3992 */           if (w instanceof r) {
/*      */             
/* 3994 */             r r1 = (r)w;
/* 3995 */             if (r1.ci) {
/*      */               
/* 3997 */               if (!m((af)r1)) {
/*      */                 
/* 3999 */                 bool2 = false;
/*      */                 
/*      */                 break;
/*      */               } 
/* 4003 */               if (r1.x(paramaf)) {
/*      */                 continue;
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 4009 */               bool2 = false;
/*      */ 
/*      */               
/*      */               break;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/* 4017 */         if (bool2) {
/*      */           
/* 4019 */           b(paramaf);
/* 4020 */           return true;
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
/* 4031 */     if (paramaf.cc()) {
/*      */ 
/*      */       
/* 4034 */       af af1 = paramaf;
/*      */       
/* 4036 */       if (n(af1)) {
/*      */         
/* 4038 */         f(af1);
/* 4039 */         return true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 4044 */     if (l.al())
/*      */     {
/* 4046 */       if (A()) {
/*      */         
/* 4048 */         af af1 = paramaf;
/*      */ 
/*      */         
/* 4051 */         if (o(af1)) {
/*      */           
/* 4053 */           g(af1);
/* 4054 */           return true;
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
/*      */ 
/*      */ 
/*      */     
/* 4077 */     boolean bool1 = false;
/*      */     
/* 4079 */     if (!paramBoolean || paramaf.t())
/*      */     {
/* 4081 */       if (!m.c(paramaf.bB)) {
/*      */         
/* 4083 */         if (paramaf.bw()) {
/*      */           
/* 4085 */           if (paramaf.bO().a())
/*      */           {
/* 4087 */             bool1 = true;
/*      */           
/*      */           }
/*      */         
/*      */         }
/* 4092 */         else if (!paramaf.by) {
/*      */           
/* 4094 */           bool1 = true;
/*      */         } 
/*      */ 
/*      */         
/* 4098 */         if (!bool1 && !paramaf.i() && B())
/*      */         {
/* 4100 */           bool1 = true;
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/* 4105 */     if (bool1)
/*      */     {
/*      */       
/* 4108 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 4113 */     if (bool)
/*      */     {
/* 4115 */       if (z()) {
/*      */         
/* 4117 */         a(paramaf.dH, paramaf.dI, paramaf.dJ);
/* 4118 */         return true;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 4124 */     return false;
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
/*      */   public int p() {
/* 4143 */     return this.aQ;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void a(e parame) {
/* 4150 */     for (w w : w.dK) {
/*      */       
/* 4152 */       if (w instanceof r) {
/*      */         
/* 4154 */         r r1 = (r)w;
/* 4155 */         if (r1.ci && m((af)r1))
/*      */         {
/* 4157 */           parame.a(r1);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public m q() {
/* 4166 */     l l = l.u();
/*      */ 
/*      */     
/* 4169 */     for (af af1 : this.bF) {
/*      */       
/* 4171 */       if (af1 instanceof r) {
/*      */         
/* 4173 */         r r1 = (r)af1;
/* 4174 */         if (r1.bB == l.bb)
/*      */         {
/* 4176 */           return r1.bB;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 4182 */     for (af af1 : this.bF) {
/*      */       
/* 4184 */       if (af1 instanceof r) {
/*      */         
/* 4186 */         r r1 = (r)af1;
/* 4187 */         if (m((af)r1))
/*      */         {
/* 4189 */           return r1.bB;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 4194 */     return l.bb;
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
/*      */   public r r() {
/* 4208 */     for (af af1 : this.bF) {
/*      */       
/* 4210 */       if (af1 instanceof r) {
/*      */         
/* 4212 */         r r1 = (r)af1;
/* 4213 */         if (m((af)r1))
/*      */         {
/* 4215 */           return r1;
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
/* 4235 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void a(e parame, c paramc, boolean paramBoolean) {
/* 4244 */     r r1 = null;
/* 4245 */     int k = -99;
/*      */     
/* 4247 */     for (w w : w.dK) {
/*      */       
/* 4249 */       if (w instanceof r) {
/*      */         
/* 4251 */         r r2 = (r)w;
/* 4252 */         if (r2.ci && m((af)r2)) {
/*      */           
/* 4254 */           s s1 = r2.a(paramc);
/* 4255 */           if (s1 != null)
/*      */           {
/*      */ 
/*      */             
/* 4259 */             if (s1.a((af)r2) && (s1.a((af)r2, true) || paramBoolean)) {
/*      */ 
/*      */               
/* 4262 */               int m = 0;
/*      */ 
/*      */               
/* 4265 */               if (r2 instanceof k) {
/*      */                 
/* 4267 */                 boolean bool = true;
/*      */                 
/* 4269 */                 m = ((k)r2).a(paramc, true);
/*      */                 
/* 4271 */                 if (r1 != null)
/*      */                 {
/* 4273 */                   if (!paramBoolean) {
/*      */                     
/* 4275 */                     if (m >= k)
/*      */                     {
/*      */                       break;
/*      */                     
/*      */                     }
/*      */                   
/*      */                   }
/* 4282 */                   else if (m <= k) {
/*      */                     break;
/*      */                   } 
/*      */                 }
/*      */               } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 4293 */               r1 = r2;
/* 4294 */               k = m;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 4303 */     if (r1 != null)
/*      */     {
/* 4305 */       parame.a(r1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean a(s params, float paramFloat1, float paramFloat2) {
/* 4314 */     if (params instanceof g) {
/*      */       
/* 4316 */       g g = (g)params;
/*      */       
/* 4318 */       r r1 = g.b;
/* 4319 */       s s1 = g.t();
/*      */       
/* 4321 */       boolean bool1 = false;
/*      */       
/* 4323 */       if (s1.a((af)r1) && s1.a((af)r1, true))
/*      */       {
/* 4325 */         if (!r1.a(s1, paramFloat1, paramFloat2))
/*      */         {
/* 4327 */           bool1 = true;
/*      */         }
/*      */       }
/*      */       
/* 4331 */       return bool1;
/*      */     } 
/*      */     
/* 4334 */     boolean bool = false;
/*      */     
/* 4336 */     for (w w : w.dK) {
/*      */       
/* 4338 */       if (w instanceof r) {
/*      */         
/* 4340 */         r r1 = (r)w;
/* 4341 */         if (r1.ci && m((af)r1)) {
/*      */           
/* 4343 */           s s1 = r1.a(params.J());
/* 4344 */           if (s1 != null)
/*      */           {
/*      */ 
/*      */             
/* 4348 */             if (s1.a((af)r1) && s1.a((af)r1, true)) {
/*      */ 
/*      */ 
/*      */               
/* 4352 */               if (!r1.a(this.W, paramFloat1, paramFloat2)) {
/*      */                 
/* 4354 */                 bool = true;
/*      */                 
/*      */                 continue;
/*      */               } 
/* 4358 */               return false;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 4367 */     if (!bool)
/*      */     {
/* 4369 */       return false;
/*      */     }
/*      */     
/* 4372 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   void a(e parame, s params) {
/* 4378 */     if (params instanceof g) {
/*      */       
/* 4380 */       g g = (g)params;
/* 4381 */       parame.a(g.b);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 4386 */     c c1 = params.J();
/*      */     
/* 4388 */     for (w w : w.dK) {
/*      */       
/* 4390 */       if (w instanceof r) {
/*      */         
/* 4392 */         r r1 = (r)w;
/* 4393 */         if (r1.ci && m((af)r1)) {
/*      */           
/* 4395 */           s s1 = r1.a(c1);
/* 4396 */           if (s1 != null)
/*      */           {
/*      */ 
/*      */             
/* 4400 */             if (s1.a((af)r1))
/*      */             {
/* 4402 */               parame.a(r1);
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
/*      */   public boolean a(s params, boolean paramBoolean) {
/* 4416 */     if (params instanceof g) {
/*      */       
/* 4418 */       g g = (g)params;
/* 4419 */       return g.a((af)g.b, true);
/*      */     } 
/*      */     
/* 4422 */     c c1 = params.J();
/*      */     
/* 4424 */     for (af af1 : this.bF) {
/*      */       
/* 4426 */       if (af1 instanceof r) {
/*      */         
/* 4428 */         r r1 = (r)af1;
/* 4429 */         if (r1.ci && m((af)r1)) {
/*      */ 
/*      */           
/* 4432 */           s s1 = r1.a(c1);
/* 4433 */           if (s1 != null)
/*      */           {
/* 4435 */             if (s1.a((af)r1, paramBoolean))
/*      */             {
/* 4437 */               return true;
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 4444 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(s params) {
/* 4449 */     c c1 = params.J();
/*      */     
/* 4451 */     if (params.l_())
/*      */     {
/* 4453 */       return false;
/*      */     }
/*      */     
/* 4456 */     if (params instanceof g) {
/*      */       
/* 4458 */       g g = (g)params;
/* 4459 */       return g.b((af)g.b);
/*      */     } 
/*      */     
/* 4462 */     for (af af1 : this.bF) {
/*      */       
/* 4464 */       if (af1 instanceof r) {
/*      */         
/* 4466 */         r r1 = (r)af1;
/* 4467 */         if (r1.ci && m((af)r1)) {
/*      */           
/* 4469 */           s s1 = r1.a(c1);
/* 4470 */           if (s1 != null)
/*      */           {
/* 4472 */             if (s1.b((af)r1))
/*      */             {
/* 4474 */               return true;
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 4480 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(s params) {
/* 4486 */     if (params instanceof g) {
/*      */       
/* 4488 */       g g = (g)params;
/* 4489 */       return g.a((af)g.b);
/*      */     } 
/*      */     
/* 4492 */     c c1 = params.J();
/*      */     
/* 4494 */     for (af af1 : this.bF) {
/*      */       
/* 4496 */       if (af1 instanceof r) {
/*      */         
/* 4498 */         r r1 = (r)af1;
/* 4499 */         if (r1.ci && m((af)r1)) {
/*      */ 
/*      */           
/* 4502 */           s s1 = r1.a(c1);
/* 4503 */           if (s1 != null)
/*      */           {
/* 4505 */             if (s1.a((af)r1))
/*      */             {
/* 4507 */               return true;
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 4514 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(s params) {
/* 4519 */     boolean bool = false;
/*      */     
/* 4521 */     if (params instanceof g) {
/*      */       
/* 4523 */       g g = (g)params;
/* 4524 */       return g.h((af)g.b);
/*      */     } 
/*      */     
/* 4527 */     c c1 = params.J();
/*      */     
/* 4529 */     for (af af1 : this.bF) {
/*      */       
/* 4531 */       if (af1 instanceof r) {
/*      */         
/* 4533 */         r r1 = (r)af1;
/* 4534 */         if (r1.ci && m((af)r1)) {
/*      */ 
/*      */           
/* 4537 */           s s1 = r1.a(c1);
/* 4538 */           if (s1 != null) {
/*      */             
/* 4540 */             if (!s1.h((af)r1))
/*      */             {
/* 4542 */               return false;
/*      */             }
/*      */ 
/*      */             
/* 4546 */             bool = true;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 4554 */     if (!bool)
/*      */     {
/* 4556 */       return false;
/*      */     }
/*      */     
/* 4559 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String d(s params) {
/* 4565 */     if (params instanceof g) {
/*      */       
/* 4567 */       g g = (g)params;
/* 4568 */       return g.k((af)g.b);
/*      */     } 
/*      */     
/* 4571 */     c c1 = params.J();
/*      */     
/* 4573 */     for (af af1 : this.bF) {
/*      */       
/* 4575 */       if (af1 instanceof r) {
/*      */         
/* 4577 */         r r1 = (r)af1;
/* 4578 */         if (r1.ci && m((af)r1)) {
/*      */ 
/*      */           
/* 4581 */           s s1 = r1.a(c1);
/* 4582 */           if (s1 != null)
/*      */           {
/* 4584 */             if (s1.h((af)r1)) {
/*      */               
/* 4586 */               String str = s1.k((af)r1);
/*      */               
/* 4588 */               if (str != null)
/*      */               {
/* 4590 */                 return str;
/*      */               }
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 4598 */     return null;
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
/*      */   public boolean s() {
/* 4651 */     if (this.aQ == 0)
/*      */     {
/* 4653 */       return false;
/*      */     }
/* 4655 */     for (af af1 : this.bF) {
/*      */       
/* 4657 */       if (af1 instanceof r) {
/*      */         
/* 4659 */         r r1 = (r)af1;
/* 4660 */         if (r1.ci) {
/*      */           
/* 4662 */           if (!m((af)r1))
/*      */           {
/* 4664 */             return false;
/*      */           }
/*      */           
/* 4667 */           ArrayList arrayList = r1.M();
/*      */           
/* 4669 */           boolean bool = false;
/* 4670 */           if (arrayList != null)
/*      */           {
/* 4672 */             for (s s1 : arrayList) {
/*      */               
/* 4674 */               if (s1.e() == u.d)
/*      */               {
/* 4676 */                 bool = true;
/*      */               }
/*      */             } 
/*      */           }
/*      */           
/* 4681 */           if (!bool)
/*      */           {
/* 4683 */             return false;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4692 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 4697 */   long bB = -1L;
/* 4698 */   long bC = -1L; long bD;
/*      */   boolean bE;
/*      */   
/*      */   public boolean a(z paramz) {
/* 4702 */     for (af af1 : this.bF) {
/*      */       
/* 4704 */       if (af1 instanceof r) {
/*      */         
/* 4706 */         r r1 = (r)af1;
/* 4707 */         if (m((af)r1))
/*      */         {
/* 4709 */           if (a(paramz, (af)r1))
/*      */           {
/* 4711 */             return true;
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
/*      */ 
/*      */ 
/*      */     
/* 4735 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(z paramz, af paramaf) {
/* 4740 */     if (paramaf instanceof r) {
/*      */       
/* 4742 */       r r1 = (r)paramaf;
/*      */       
/* 4744 */       if (paramz == z.a || paramz == z.b)
/*      */       {
/* 4746 */         if (!l.a(this.bB, 1000L))
/*      */         {
/* 4748 */           return true;
/*      */         }
/*      */       }
/* 4751 */       if (paramz == z.c) {
/*      */         
/* 4753 */         if ((l.u()).bg < 10)
/*      */         {
/* 4755 */           return false;
/*      */         }
/*      */         
/* 4758 */         if (!l.a(this.bC, 1000L))
/*      */         {
/* 4760 */           return true;
/*      */         }
/*      */       } 
/*      */       
/* 4764 */       if (r1.a(paramz)) {
/*      */ 
/*      */         
/* 4767 */         if (paramz == z.a || paramz == z.b)
/*      */         {
/* 4769 */           this.bB = l.N();
/*      */         }
/* 4771 */         if (paramz == z.c)
/*      */         {
/* 4773 */           this.bC = l.N();
/*      */         }
/*      */         
/* 4776 */         return true;
/*      */       } 
/*      */     } 
/*      */     
/* 4780 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(float paramFloat1, float paramFloat2, Point paramPoint) {
/* 4785 */     l l = l.u();
/*      */     
/* 4787 */     if (!A()) {
/*      */       
/* 4789 */       if (l.by.quickRally)
/*      */       {
/* 4791 */         if (s()) {
/*      */ 
/*      */ 
/*      */           
/* 4795 */           b(paramFloat1, paramFloat2);
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 4806 */     e e1 = v();
/*      */     
/* 4808 */     e1.h = true;
/*      */ 
/*      */     
/* 4811 */     e1.a(paramFloat1, paramFloat2);
/* 4812 */     a(e1);
/*      */     
/* 4814 */     if (!a(z.b))
/*      */     {
/* 4816 */       l.bu.b(e.e, 0.2F);
/*      */     }
/*      */     
/* 4819 */     e e2 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 4820 */     if (e2 != null) {
/*      */       
/* 4822 */       e2.ao = 8;
/* 4823 */       e2.W = 30.0F;
/* 4824 */       e2.X = e2.W;
/* 4825 */       e2.s = true;
/* 4826 */       e2.F = 2.0F;
/* 4827 */       e2.H = 2.8F * c();
/* 4828 */       e2.G = 1.6F * c();
/*      */       
/* 4830 */       e2.I = true;
/*      */     } 
/*      */     
/* 4833 */     if (paramPoint != null) {
/*      */       
/* 4835 */       Point point = l.bE.b(paramPoint.a, paramPoint.b);
/* 4836 */       e e3 = l.bz.a(point.a, point.b, 0.0F, d.a, true, h.e);
/* 4837 */       if (e3 != null) {
/*      */         
/* 4839 */         e3.o = true;
/* 4840 */         e3.ao = 8;
/* 4841 */         e3.W = 35.0F;
/* 4842 */         e3.X = e2.W;
/* 4843 */         e3.s = true;
/* 4844 */         e3.F = 2.0F;
/* 4845 */         e3.H = 1.3F;
/* 4846 */         e3.G = 0.6F;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(float paramFloat1, float paramFloat2, Point paramPoint) {
/* 4854 */     l l = l.u();
/*      */     
/* 4856 */     if (this.y && l.by.doubleClickToAttackMove && 
/* 4857 */       z() && A()) {
/*      */       
/* 4859 */       d(paramFloat1, paramFloat2, paramPoint);
/*      */     }
/*      */     else {
/*      */       
/* 4863 */       b(paramFloat1, paramFloat2, paramPoint);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void d(float paramFloat1, float paramFloat2, Point paramPoint) {
/* 4870 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 4874 */     e e1 = v();
/*      */     
/* 4876 */     e1.h = true;
/*      */     
/* 4878 */     e1.b(paramFloat1, paramFloat2);
/* 4879 */     a(e1);
/*      */     
/* 4881 */     if (!a(z.b))
/*      */     {
/* 4883 */       l.bu.b(e.e, 0.2F);
/*      */     }
/*      */     
/* 4886 */     e e2 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 4887 */     if (e2 != null) {
/*      */       
/* 4889 */       e2.ap = 17;
/* 4890 */       e2.ao = 2;
/*      */ 
/*      */       
/* 4893 */       e2.W = 30.0F;
/* 4894 */       e2.X = e2.W;
/* 4895 */       e2.s = true;
/* 4896 */       e2.F = 2.0F;
/*      */ 
/*      */ 
/*      */       
/* 4900 */       e2.Z = 1.0F;
/* 4901 */       e2.H = 1.9F * c();
/* 4902 */       e2.G = 3.5F * c();
/* 4903 */       e2.I = true;
/*      */     } 
/*      */     
/* 4906 */     if (paramPoint != null) {
/*      */       
/* 4908 */       Point point = l.bE.b(paramPoint.a, paramPoint.b);
/* 4909 */       e e3 = l.bz.a(point.a, point.b, 0.0F, d.a, true, h.e);
/* 4910 */       if (e3 != null) {
/*      */         
/* 4912 */         e3.o = true;
/* 4913 */         e3.ao = 9;
/* 4914 */         e3.W = 35.0F;
/* 4915 */         e3.X = e2.W;
/* 4916 */         e3.s = true;
/* 4917 */         e3.F = 2.0F;
/* 4918 */         e3.H = 1.3F;
/* 4919 */         e3.G = 0.6F;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void t() {
/* 4926 */     l l = l.u();
/* 4927 */     e e1 = v();
/*      */     
/* 4929 */     e1.h();
/* 4930 */     a(e1);
/*      */     
/* 4932 */     l.bu.b(e.e, 0.2F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(s params, PointF paramPointF, af paramaf, e parame) {
/* 4940 */     if (params instanceof com.corrodinggames.rts.game.units.custom.a.f) {
/*      */       
/* 4942 */       com.corrodinggames.rts.game.units.custom.a.f f1 = (com.corrodinggames.rts.game.units.custom.a.f)params;
/*      */ 
/*      */       
/* 4945 */       l l = l.u();
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
/*      */   public void b(s params, float paramFloat1, float paramFloat2) {
/* 4958 */     l l = l.u();
/* 4959 */     PointF pointF = new PointF(paramFloat1, paramFloat2);
/*      */     
/* 4961 */     e e1 = v();
/*      */ 
/*      */     
/* 4964 */     if (!params.F()) {
/*      */       
/* 4966 */       a(e1, params);
/*      */     }
/*      */     else {
/*      */       
/* 4970 */       a(e1, params.J(), false);
/*      */     } 
/*      */     
/* 4973 */     e1.a(params.J(), pointF, null);
/*      */     
/* 4975 */     a(params, pointF, (af)null, e1);
/*      */     
/* 4977 */     l.bu.b(e.e, 0.2F);
/*      */     
/* 4979 */     e e2 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 4980 */     if (e2 != null) {
/*      */       
/* 4982 */       e2.ao = 9;
/* 4983 */       e2.W = 60.0F;
/* 4984 */       e2.X = e2.W;
/* 4985 */       e2.s = true;
/* 4986 */       e2.F = 2.0F;
/*      */       
/* 4988 */       e2.H = 3.8F * c();
/* 4989 */       e2.G = 2.0F * c();
/* 4990 */       e2.I = true;
/* 4991 */       e2.Z = 1.5F;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(af paramaf) {
/* 4997 */     l l = l.u();
/* 4998 */     e e1 = v();
/* 4999 */     a(e1);
/* 5000 */     e1.d(paramaf);
/* 5001 */     l.bu.b(e.e, 0.2F);
/*      */     
/* 5003 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5004 */     if (e2 != null) {
/*      */       
/* 5006 */       e2.ao = 12;
/* 5007 */       e2.W = 25.0F;
/* 5008 */       e2.X = e2.W;
/* 5009 */       e2.s = true;
/* 5010 */       e2.F = 2.0F;
/* 5011 */       e2.I = true;
/* 5012 */       e2.H = 1.2F * c();
/* 5013 */       e2.G = 1.8F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat1, float paramFloat2) {
/* 5020 */     l l = l.u();
/*      */     
/* 5022 */     e e1 = u();
/*      */     
/* 5024 */     a(e1);
/*      */     
/* 5026 */     PointF pointF = new PointF(paramFloat1, paramFloat2);
/* 5027 */     e1.a(pointF);
/* 5028 */     l.bu.b(e.e, 0.2F);
/*      */     
/* 5030 */     e e2 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 5031 */     if (e2 != null) {
/*      */       
/* 5033 */       e2.ao = 8;
/* 5034 */       e2.W = 65.0F;
/* 5035 */       e2.X = e2.W;
/* 5036 */       e2.s = true;
/* 5037 */       e2.F = 2.0F;
/* 5038 */       e2.I = true;
/* 5039 */       e2.Z = 2.0F;
/* 5040 */       e2.H = 2.0F * c();
/* 5041 */       e2.G = 1.5F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, Point paramPoint, j paramj) {
/* 5049 */     l l = l.u();
/*      */ 
/*      */     
/* 5052 */     if (!l.by.showMapPingsOnBattlefield && !l.by.showMapPingsOnMinimap) {
/*      */       
/* 5054 */       a("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 5062 */     e e1 = v();
/*      */ 
/*      */     
/* 5065 */     PointF pointF = new PointF(paramFloat1, paramFloat2);
/*      */ 
/*      */     
/* 5068 */     e1.a(paramj.J(), pointF, null);
/*      */ 
/*      */     
/* 5071 */     if (this.bD == 0L || this.bD + 15000L < System.currentTimeMillis()) {
/*      */       
/* 5073 */       this.bD = System.currentTimeMillis();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5080 */       String str = "MAP PING - [i:" + paramj.H() + "]";
/*      */       
/* 5082 */       l.bF.j(str);
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
/*      */   public void a(float paramFloat1, float paramFloat2, m paramm, j paramj) {
/* 5095 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5100 */     float f1 = 1.0F;
/*      */ 
/*      */ 
/*      */     
/* 5104 */     int k = 7 + paramj.a.ordinal();
/*      */ 
/*      */     
/* 5107 */     if (!l.by.showMapPingsOnBattlefield && !l.by.showMapPingsOnMinimap) {
/*      */       
/* 5109 */       if (!this.bE && !l.bJ.h()) {
/*      */         
/* 5111 */         this.bE = true;
/* 5112 */         this.e.a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
/*      */       } 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 5119 */     if (l.by.showMapPingsOnBattlefield) {
/*      */ 
/*      */       
/* 5122 */       e e1 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 5123 */       if (e1 != null) {
/*      */         
/* 5125 */         e1.ap = 9;
/*      */ 
/*      */         
/* 5128 */         e1.ao = 6;
/* 5129 */         e1.F = 0.7F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5142 */         e1.W = 490.0F;
/* 5143 */         e1.X = e1.W;
/* 5144 */         e1.s = true;
/*      */         
/* 5146 */         e1.T = 6.0F;
/* 5147 */         e1.U = 60.0F;
/*      */         
/* 5149 */         e1.K -= e1.T;
/*      */ 
/*      */ 
/*      */         
/* 5153 */         e1.H = 2.0F * f1;
/* 5154 */         e1.G = e1.H;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5162 */         e1.an = -0.5F;
/*      */ 
/*      */ 
/*      */         
/* 5166 */         e1.I = true;
/*      */         
/* 5168 */         if (paramm != null) {
/*      */           
/* 5170 */           e1.y = paramm.F();
/*      */ 
/*      */           
/* 5173 */           if (l.aj())
/*      */           {
/*      */             
/* 5176 */             e1.C = new LightingColorFilter(e1.y, 0);
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
/* 5194 */       if (k != -1) {
/*      */ 
/*      */         
/* 5197 */         e1 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 5198 */         if (e1 != null) {
/*      */           
/* 5200 */           e1.ap = 9;
/* 5201 */           e1.ao = k;
/* 5202 */           e1.W = 490.0F;
/* 5203 */           e1.X = e1.W;
/* 5204 */           e1.s = true;
/* 5205 */           e1.F = 1.2F;
/* 5206 */           e1.T = 6.0F;
/* 5207 */           e1.U = 60.0F;
/* 5208 */           e1.K -= e1.T;
/*      */           
/* 5210 */           e1.H = 2.0F * f1;
/* 5211 */           e1.G = e1.H;
/*      */           
/* 5213 */           e1.an = -0.7F;
/*      */ 
/*      */ 
/*      */           
/* 5217 */           e1.I = true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5241 */     if (l.by.showMapPingsOnMinimap) {
/*      */       
/* 5243 */       Point point = l.bE.b(paramFloat1, paramFloat2);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5248 */       e e1 = l.bz.a(point.a, point.b, 0.0F, d.a, true, h.e);
/* 5249 */       if (e1 != null) {
/*      */         
/* 5251 */         e1.o = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5257 */         e1.ap = 9;
/* 5258 */         e1.ao = 6;
/* 5259 */         e1.F = 0.8F;
/*      */         
/* 5261 */         e1.W = 470.0F;
/* 5262 */         e1.X = e1.W;
/* 5263 */         e1.s = true;
/*      */ 
/*      */         
/* 5266 */         e1.K -= 2.0F;
/* 5267 */         e1.T = 2.0F;
/* 5268 */         e1.U = 60.0F;
/*      */         
/* 5270 */         e1.an = -0.5F;
/*      */ 
/*      */ 
/*      */         
/* 5274 */         if (paramm != null) {
/*      */           
/* 5276 */           e1.y = paramm.F();
/*      */           
/* 5278 */           if (l.aj())
/*      */           {
/* 5280 */             e1.C = new LightingColorFilter(e1.y, 0);
/*      */           }
/*      */         } 
/*      */         
/* 5284 */         e1.H = 1.0F;
/* 5285 */         e1.G = 1.0F;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5290 */       e1 = l.bz.a(point.a, point.b, 0.0F, d.a, true, h.e);
/* 5291 */       if (e1 != null) {
/*      */         
/* 5293 */         e1.o = true;
/*      */         
/* 5295 */         e1.ap = 9;
/* 5296 */         e1.ao = k;
/* 5297 */         e1.W = 470.0F;
/* 5298 */         e1.X = e1.W;
/* 5299 */         e1.s = true;
/* 5300 */         e1.F = 0.8F;
/*      */         
/* 5302 */         e1.K -= 2.0F;
/* 5303 */         e1.T = 2.0F;
/* 5304 */         e1.U = 60.0F;
/* 5305 */         if (paramm != null);
/*      */ 
/*      */ 
/*      */         
/* 5309 */         e1.H = 1.0F;
/* 5310 */         e1.G = 1.0F;
/*      */         
/* 5312 */         e1.an = -0.7F;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e u() {
/* 5321 */     l l = l.u();
/* 5322 */     e e1 = l.bN.b(l.bb);
/*      */     
/* 5324 */     if (l.bF.z)
/*      */     {
/* 5326 */       e1.p = l.bb;
/*      */     }
/*      */     
/* 5329 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public e v() {
/* 5334 */     l l = l.u();
/*      */     
/* 5336 */     e e1 = u();
/* 5337 */     if (a(l))
/*      */     {
/* 5339 */       e1.e = true;
/*      */     }
/* 5341 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(af paramaf) {
/* 5346 */     l l = l.u();
/*      */     
/* 5348 */     e e1 = v();
/*      */     
/* 5350 */     e1.a(paramaf);
/*      */     
/* 5352 */     a(e1);
/*      */     
/* 5354 */     if (!a(z.a))
/*      */     {
/* 5356 */       l.bu.b(e.d, 0.2F);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 5361 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5362 */     if (e2 != null) {
/*      */ 
/*      */ 
/*      */       
/* 5366 */       e2.b = (w)paramaf;
/* 5367 */       e2.J = 0.0F;
/* 5368 */       e2.K = 0.0F;
/* 5369 */       e2.L = 0.0F;
/*      */       
/* 5371 */       e2.ao = 9;
/* 5372 */       e2.W = 35.0F;
/* 5373 */       e2.X = e2.W;
/* 5374 */       e2.s = true;
/* 5375 */       e2.F = 1.5F;
/* 5376 */       e2.I = true;
/* 5377 */       e2.Z = 0.8F;
/* 5378 */       e2.H = 1.9F * c();
/* 5379 */       e2.G = 3.3F * c();
/*      */     } 
/*      */ 
/*      */     
/* 5383 */     e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5384 */     if (e2 != null) {
/*      */ 
/*      */ 
/*      */       
/* 5388 */       e2.b = (w)paramaf;
/* 5389 */       e2.J = 0.0F;
/* 5390 */       e2.K = 0.0F;
/* 5391 */       e2.L = 0.0F;
/*      */       
/* 5393 */       e2.ap = 17;
/* 5394 */       e2.ao = 0;
/*      */       
/* 5396 */       e2.W = 25.0F;
/* 5397 */       e2.X = e2.W;
/* 5398 */       e2.s = true;
/* 5399 */       e2.F = 1.0F;
/* 5400 */       e2.I = true;
/* 5401 */       e2.Z = 0.8F;
/* 5402 */       e2.H = 2.2F * c();
/* 5403 */       e2.G = 1.1F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(af paramaf) {
/* 5409 */     l l = l.u();
/* 5410 */     e e1 = v();
/* 5411 */     a(e1);
/* 5412 */     e1.b(paramaf);
/* 5413 */     l.bu.b(e.d, 0.2F);
/*      */     
/* 5415 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5416 */     if (e2 != null) {
/*      */       
/* 5418 */       e2.ao = 10;
/* 5419 */       e2.W = 35.0F;
/* 5420 */       e2.X = e2.W;
/* 5421 */       e2.s = true;
/* 5422 */       e2.F = 2.0F;
/*      */ 
/*      */       
/* 5425 */       e2.I = true;
/* 5426 */       e2.H = 1.5F * c();
/* 5427 */       e2.G = 2.2F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(af paramaf) {
/* 5434 */     l l = l.u();
/* 5435 */     e e1 = v();
/* 5436 */     a(e1);
/* 5437 */     e1.c(paramaf);
/* 5438 */     l.bu.b(e.d, 0.2F);
/*      */     
/* 5440 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5441 */     if (e2 != null) {
/*      */       
/* 5443 */       e2.ap = 17;
/* 5444 */       e2.ao = 1;
/* 5445 */       e2.W = 40.0F;
/* 5446 */       e2.X = e2.W;
/* 5447 */       e2.s = true;
/* 5448 */       e2.F = 1.0F;
/* 5449 */       e2.I = true;
/* 5450 */       e2.Z = 0.0F;
/* 5451 */       e2.H = 1.2F * c();
/* 5452 */       e2.G = 1.9F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 5458 */     l l = l.u();
/*      */     
/* 5460 */     l.bu.b(e.k, 0.2F);
/*      */     
/* 5462 */     e e1 = l.bz.a(paramFloat1, paramFloat2, paramFloat3, d.a, true, h.e);
/* 5463 */     if (e1 != null) {
/*      */       
/* 5465 */       e1.ap = 9;
/* 5466 */       e1.ao = 14;
/*      */       
/* 5468 */       e1.W = 10.0F;
/* 5469 */       e1.X = e1.W;
/* 5470 */       e1.s = true;
/* 5471 */       e1.F = 2.0F;
/*      */       
/* 5473 */       e1.Z = 0.0F;
/* 5474 */       e1.H = 1.1F * c();
/* 5475 */       e1.G = 1.6F * c();
/* 5476 */       e1.I = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, Point paramPoint, boolean paramBoolean) {
/* 5483 */     l l = l.u();
/* 5484 */     e e1 = v();
/* 5485 */     a(e1);
/* 5486 */     e1.c(paramFloat1, paramFloat2);
/*      */     
/* 5488 */     if (!paramBoolean)
/*      */     {
/* 5490 */       e1.e = true;
/*      */     }
/*      */ 
/*      */     
/* 5494 */     l.bu.b(e.e, 0.2F);
/*      */     
/* 5496 */     e e2 = l.bz.a(paramFloat1, paramFloat2, 0.0F, d.a, true, h.e);
/* 5497 */     if (e2 != null) {
/*      */       
/* 5499 */       e2.ap = 17;
/* 5500 */       e2.ao = 0;
/*      */       
/* 5502 */       e2.W = 40.0F;
/* 5503 */       e2.X = e2.W;
/* 5504 */       e2.s = true;
/* 5505 */       e2.F = 2.0F;
/*      */       
/* 5507 */       e2.Z = 8.0F;
/* 5508 */       e2.H = 1.1F * c();
/* 5509 */       e2.G = 1.9F * c();
/* 5510 */       e2.I = true;
/*      */     } 
/*      */     
/* 5513 */     if (paramPoint != null) {
/*      */       
/* 5515 */       Point point = l.bE.b(paramPoint.a, paramPoint.b);
/* 5516 */       e e3 = l.bz.a(point.a, point.b, 0.0F, d.a, true, h.e);
/* 5517 */       if (e3 != null) {
/*      */         
/* 5519 */         e3.o = true;
/* 5520 */         e3.ao = 9;
/* 5521 */         e3.W = 35.0F;
/* 5522 */         e3.X = e2.W;
/* 5523 */         e3.s = true;
/* 5524 */         e3.F = 2.0F;
/* 5525 */         e3.H = 1.3F;
/* 5526 */         e3.G = 0.6F;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(af paramaf) {
/* 5534 */     l l = l.u();
/* 5535 */     e e1 = v();
/* 5536 */     a(e1);
/* 5537 */     e1.e(paramaf);
/* 5538 */     l.bu.b(e.d, 0.2F);
/*      */     
/* 5540 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5541 */     if (e2 != null) {
/*      */       
/* 5543 */       e2.ao = 11;
/* 5544 */       e2.W = 25.0F;
/* 5545 */       e2.X = e2.W;
/* 5546 */       e2.s = true;
/* 5547 */       e2.F = 2.0F;
/* 5548 */       e2.I = true;
/* 5549 */       e2.H = 1.8F * c();
/* 5550 */       e2.G = 1.6F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(af paramaf) {
/* 5558 */     l l = l.u();
/* 5559 */     e e1 = v();
/* 5560 */     a(e1);
/* 5561 */     e1.f(paramaf);
/*      */     
/* 5563 */     l.bu.b(e.d, 0.2F);
/*      */     
/* 5565 */     e e2 = l.bz.a(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, true, h.e);
/* 5566 */     if (e2 != null) {
/*      */       
/* 5568 */       e2.ao = 11;
/* 5569 */       e2.W = 25.0F;
/* 5570 */       e2.X = e2.W;
/* 5571 */       e2.s = true;
/* 5572 */       e2.F = 2.0F;
/* 5573 */       e2.I = true;
/* 5574 */       e2.H = 1.8F * c();
/* 5575 */       e2.G = 1.6F * c();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public af a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 5582 */     l l = l.u();
/*      */     
/* 5584 */     af af1 = null;
/* 5585 */     float f1 = -1.0F;
/*      */ 
/*      */     
/* 5588 */     float f2 = 10.0F / l.cE;
/* 5589 */     float f3 = 5.0F / l.cE;
/*      */ 
/*      */     
/* 5592 */     float f4 = 5.0F / l.cE;
/*      */     
/* 5594 */     m m = q();
/*      */     
/* 5596 */     for (af af2 : af.bj) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5605 */       if (paramBoolean) {
/*      */         
/* 5607 */         if (af2.t())
/*      */         {
/*      */           continue;
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 5614 */       else if (af2.cD()) {
/*      */         continue;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5620 */       if (!af2.bz && af2.cp == null) {
/*      */         
/* 5622 */         float f5 = com.corrodinggames.rts.gameFramework.f.a(paramFloat1, paramFloat2, af2.dH, af2.dI - af2.dJ);
/*      */         
/* 5624 */         float f6 = af2.cX();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5633 */         if (!af2.ci) {
/*      */           
/* 5635 */           f6 += f2;
/*      */         }
/*      */         else {
/*      */           
/* 5639 */           f6 += f3;
/*      */         } 
/*      */         
/* 5642 */         boolean bool = m.c(af2.bB);
/*      */         
/* 5644 */         if (bool)
/*      */         {
/* 5646 */           f6 += f4;
/*      */         }
/*      */         
/* 5649 */         if (f5 < f6 * f6) {
/*      */ 
/*      */           
/* 5652 */           if (bool)
/*      */           {
/* 5654 */             if (!af2.bS()) {
/*      */               continue;
/*      */             }
/*      */           }
/*      */ 
/*      */           
/* 5660 */           if (af1 == null || f5 < f1) {
/*      */             
/* 5662 */             af1 = af2;
/* 5663 */             f1 = f5;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 5670 */     if (af1 != null)
/*      */     {
/* 5672 */       if (af1.bB != l.bb)
/*      */       {
/* 5674 */         if (!af1.bR())
/*      */         {
/* 5676 */           return null;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 5681 */     return af1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 5688 */     l l = l.u();
/*      */     
/* 5690 */     for (w w : w.dK) {
/*      */ 
/*      */       
/* 5693 */       if (w instanceof af) {
/*      */         
/* 5695 */         af af1 = (af)w;
/*      */         
/* 5697 */         if (!af1.bz && af1.cp == null)
/*      */         {
/* 5699 */           if (af1.bB == l.bb) {
/*      */             
/* 5701 */             float f1 = com.corrodinggames.rts.gameFramework.f.a(paramFloat1, paramFloat2, af1.dH, af1.dI - af1.dJ);
/*      */             
/* 5703 */             if (f1 < paramFloat3 * paramFloat3)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 5709 */               j(af1);
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(af paramaf) {
/* 5720 */     this.Q = null;
/*      */     
/* 5722 */     l l = l.u();
/*      */ 
/*      */     
/* 5725 */     for (w w : w.dK) {
/*      */       
/* 5727 */       if (w instanceof af) {
/*      */         
/* 5729 */         af af1 = (af)w;
/*      */         
/* 5731 */         if (!af1.bz && af1.cp == null)
/*      */         {
/* 5733 */           if (af1.bB == paramaf.bB)
/*      */           {
/* 5735 */             if (af1.j())
/*      */             {
/*      */ 
/*      */               
/* 5739 */               if (a.a(af1, paramaf)) {
/*      */                 
/* 5741 */                 if (af1.bB != l.bb)
/*      */                 {
/* 5743 */                   if (!af1.bR()) {
/*      */                     continue;
/*      */                   }
/*      */                 }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 5753 */                 j(af1);
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
/* 5764 */   public u bF = new u();
/*      */ 
/*      */   
/*      */   public static af bG;
/*      */ 
/*      */ 
/*      */   
/*      */   public void w() {
/* 5772 */     this.Q = null;
/*      */ 
/*      */     
/* 5775 */     for (w w : w.dK) {
/*      */       
/* 5777 */       if (w instanceof af) {
/*      */         
/* 5779 */         af af1 = (af)w;
/* 5780 */         af1.ci = false;
/*      */       } 
/*      */     } 
/*      */     
/* 5784 */     this.aQ = 0;
/*      */     
/* 5786 */     this.S++;
/*      */ 
/*      */     
/* 5789 */     this.bF.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean i(af paramaf) {
/* 5795 */     if (paramaf.t())
/*      */     {
/* 5797 */       return false;
/*      */     }
/*      */     
/* 5800 */     m m = (l.u()).bb;
/* 5801 */     if (m != null) {
/*      */       
/* 5803 */       boolean bool = m.c(paramaf.bB);
/* 5804 */       if (bool)
/*      */       {
/* 5806 */         if (!paramaf.bS())
/*      */         {
/* 5808 */           return false;
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 5813 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean j(af paramaf) {
/* 5818 */     if (paramaf.ci)
/*      */     {
/* 5820 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 5824 */     if (!i(paramaf))
/*      */     {
/* 5826 */       return false;
/*      */     }
/* 5828 */     k(paramaf);
/*      */ 
/*      */     
/* 5831 */     a(z.c, paramaf);
/*      */     
/* 5833 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void k(af paramaf) {
/* 5838 */     if (!paramaf.ci) {
/*      */ 
/*      */       
/* 5841 */       if (!i(paramaf)) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 5846 */       paramaf.ci = true;
/* 5847 */       paramaf.cj = (l.u()).bj;
/*      */       
/* 5849 */       this.aQ++;
/*      */ 
/*      */ 
/*      */       
/* 5853 */       if (!(paramaf instanceof h))
/*      */       {
/* 5855 */         bG = paramaf;
/*      */       }
/*      */       
/* 5858 */       this.S++;
/*      */       
/* 5860 */       this.bF.a(paramaf);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static b x() {
/* 5866 */     af af1 = bG;
/*      */     
/* 5868 */     if (af1 == null)
/*      */     {
/* 5870 */       return null;
/*      */     }
/*      */     
/* 5873 */     al al = af1.r();
/*      */     
/* 5875 */     if (al == null || !(al instanceof l))
/*      */     {
/* 5877 */       return null;
/*      */     }
/*      */     
/* 5880 */     l l = (l)al;
/* 5881 */     return l.B;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(af paramaf, boolean paramBoolean) {
/* 5888 */     if (!paramBoolean) {
/*      */       
/* 5890 */       j(paramaf);
/*      */       
/*      */       return;
/*      */     } 
/* 5894 */     if (paramaf.ci) {
/*      */ 
/*      */ 
/*      */       
/* 5898 */       l(paramaf);
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 5905 */       j(paramaf);
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
/*      */   public void l(af paramaf) {
/* 5929 */     if (paramaf.ci) {
/*      */       
/* 5931 */       paramaf.ci = false;
/* 5932 */       this.aQ--;
/*      */       
/* 5934 */       this.bF.remove(paramaf);
/*      */       
/* 5936 */       this.S++;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean y() {
/* 5943 */     if (p() == 0)
/*      */     {
/* 5945 */       return false;
/*      */     }
/*      */     
/* 5948 */     for (af af1 : this.bF) {
/*      */       
/* 5950 */       if (af1 instanceof r) {
/*      */         
/* 5952 */         r r1 = (r)af1;
/* 5953 */         if (r1.ci && m((af)r1))
/*      */         {
/* 5955 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 5959 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean z() {
/* 5964 */     if (p() == 0)
/*      */     {
/* 5966 */       return false;
/*      */     }
/* 5968 */     for (af af1 : this.bF) {
/*      */       
/* 5970 */       if (af1 instanceof r) {
/*      */         
/* 5972 */         r r1 = (r)af1;
/* 5973 */         if (r1.ci && m((af)r1) && r1.l())
/*      */         {
/* 5975 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 5979 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean A() {
/* 5984 */     if (p() == 0)
/*      */     {
/* 5986 */       return false;
/*      */     }
/*      */     
/* 5989 */     for (af af1 : this.bF) {
/*      */       
/* 5991 */       if (af1 instanceof r) {
/*      */         
/* 5993 */         r r1 = (r)af1;
/* 5994 */         if (r1.ci && r1.aO() && m((af)r1))
/*      */         {
/* 5996 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 6000 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean B() {
/* 6005 */     if (p() == 0)
/*      */     {
/* 6007 */       return true;
/*      */     }
/* 6009 */     for (af af1 : this.bF) {
/*      */       
/* 6011 */       if (af1 instanceof r) {
/*      */         
/* 6013 */         r r1 = (r)af1;
/* 6014 */         if (r1.ci && !r1.i())
/*      */         {
/* 6016 */           return false;
/*      */         }
/*      */       } 
/*      */     } 
/* 6020 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean m(af paramaf) {
/* 6026 */     l l = l.u();
/*      */     
/* 6028 */     if (paramaf.cE())
/*      */     {
/* 6030 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 6034 */     if (paramaf.bB == l.bb)
/*      */     {
/* 6036 */       return true;
/*      */     }
/*      */     
/* 6039 */     if (paramaf.bB != null && paramaf.bB.b(l.bb))
/*      */     {
/* 6041 */       return true;
/*      */     }
/*      */     
/* 6044 */     if (l.be || l.bJ.h())
/*      */     {
/* 6046 */       return true;
/*      */     }
/*      */     
/* 6049 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean n(af paramaf) {
/* 6055 */     if (p() == 0)
/*      */     {
/* 6057 */       return false;
/*      */     }
/*      */     
/* 6060 */     for (af af1 : this.bF) {
/*      */       
/* 6062 */       if (af1 instanceof r) {
/*      */         
/* 6064 */         r r1 = (r)af1;
/* 6065 */         if (r1.ci && r1 != paramaf && m((af)r1) && paramaf.d((af)r1, false))
/*      */         {
/* 6067 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 6071 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean o(af paramaf) {
/* 6077 */     if (p() == 0)
/*      */     {
/* 6079 */       return false;
/*      */     }
/*      */     
/* 6082 */     for (af af1 : this.bF) {
/*      */       
/* 6084 */       if (af1 instanceof r) {
/*      */         
/* 6086 */         r r1 = (r)af1;
/* 6087 */         if (r1.ci && r1 != paramaf && m((af)r1) && r1.d(paramaf, false))
/*      */         {
/* 6089 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 6093 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean p(af paramaf) {
/* 6099 */     if (p() == 0)
/*      */     {
/* 6101 */       return false;
/*      */     }
/*      */     
/* 6104 */     for (af af1 : this.bF) {
/*      */       
/* 6106 */       if (af1 instanceof r) {
/*      */         
/* 6108 */         r r1 = (r)af1;
/* 6109 */         if (r1.ci && r1 != paramaf && m((af)r1) && r1.a(paramaf))
/*      */         {
/* 6111 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 6115 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean q(af paramaf) {
/* 6120 */     if (p() == 0)
/*      */     {
/* 6122 */       return false;
/*      */     }
/*      */     
/* 6125 */     for (af af1 : this.bF) {
/*      */       
/* 6127 */       if (af1 instanceof r) {
/*      */         
/* 6129 */         r r1 = (r)af1;
/* 6130 */         if (r1.ci && r1 != paramaf && m((af)r1))
/*      */         {
/* 6132 */           if (aj.a(r1, paramaf))
/*      */           {
/* 6134 */             return true;
/*      */           }
/*      */         }
/*      */       } 
/*      */     } 
/* 6139 */     return false;
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
/*      */   public void C() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean D() {
/* 6202 */     return false;
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
/*      */   public void a(ap paramap) {
/* 6215 */     this.d.a(paramap);
/* 6216 */     paramap.c(1);
/* 6217 */     paramap.a(this.X);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(k paramk, boolean paramBoolean) {
/* 6228 */     this.d.a(paramk, paramBoolean);
/* 6229 */     byte b = paramk.d();
/*      */     
/* 6231 */     if (b >= 1)
/*      */     {
/* 6233 */       this.X = paramk.f();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(r paramr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean, ArrayList<PointF> paramArrayList, af paramaf) {
/* 6240 */     l l = l.u();
/*      */     
/* 6242 */     float f1 = paramr.dH;
/* 6243 */     float f2 = paramr.dI;
/*      */     
/* 6245 */     r r1 = null;
/* 6246 */     af af1 = af.d(paramr.r());
/*      */     
/* 6248 */     if (!(af1 instanceof r)) {
/*      */       
/* 6250 */       l.d("buildingBlockoutUnit not OrderableUnit is: " + af1.getClass().getName());
/*      */     }
/*      */     else {
/*      */       
/* 6254 */       r1 = (r)af1;
/*      */     } 
/*      */     
/* 6257 */     boolean bool = false;
/*      */     
/* 6259 */     l.bt.b(paramFloat1, paramFloat2);
/* 6260 */     paramFloat1 = l.bt.M;
/* 6261 */     paramFloat2 = l.bt.N;
/*      */     
/* 6263 */     paramFloat1 += paramr.cH();
/* 6264 */     paramFloat2 += paramr.cI();
/*      */     
/* 6266 */     paramFloat3 += paramr.cH();
/* 6267 */     paramFloat4 += paramr.cI();
/*      */ 
/*      */     
/* 6270 */     float f3 = com.corrodinggames.rts.gameFramework.f.b(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 6271 */     float f4 = com.corrodinggames.rts.gameFramework.f.d(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*      */     
/* 6273 */     byte b = 0;
/*      */     float f5;
/* 6275 */     for (f5 = 0.0F; f5 <= f3; f5 += l.bt.m) {
/*      */       
/* 6277 */       float f6 = paramFloat1 + com.corrodinggames.rts.gameFramework.f.i(f4) * f5;
/* 6278 */       float f7 = paramFloat2 + com.corrodinggames.rts.gameFramework.f.h(f4) * f5;
/*      */       
/* 6280 */       f6 -= paramr.cH();
/* 6281 */       f7 -= paramr.cI();
/*      */       
/* 6283 */       l.bt.b(f6, f7);
/* 6284 */       f6 = l.bt.M;
/* 6285 */       f7 = l.bt.N;
/*      */       
/* 6287 */       f6 += paramr.cH();
/* 6288 */       f7 += paramr.cI();
/*      */       
/* 6290 */       paramr.dH = f6;
/* 6291 */       paramr.dI = f7;
/*      */       
/* 6293 */       boolean bool1 = false;
/* 6294 */       if (bool && r1 != null) {
/*      */         
/* 6296 */         if (a.a(paramr, r1)) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 6301 */         if (paramr.o((af)r1)) {
/*      */           continue;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 6307 */       if (!bool1) {
/*      */         
/* 6309 */         boolean bool2 = a(paramr, f6, f7, paramBoolean, false, paramaf);
/* 6310 */         if (paramArrayList != null)
/*      */         {
/* 6312 */           if (bool2)
/*      */           {
/* 6314 */             paramArrayList.add(new PointF(f6, f7));
/*      */           }
/*      */         }
/*      */         
/* 6318 */         if (bool2) {
/*      */           
/* 6320 */           b++;
/* 6321 */           if (b >= 29) {
/*      */             return;
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/* 6327 */         bool = true;
/* 6328 */         if (r1 != null) {
/*      */           
/* 6330 */           r1.dH = f6;
/* 6331 */           r1.dI = f7;
/*      */         } 
/*      */       }  continue;
/*      */     } 
/* 6335 */     paramr.dH = f1;
/* 6336 */     paramr.dI = f2;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(r paramr, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, af paramaf) {
/* 6342 */     l l = l.u();
/*      */     
/* 6344 */     float f1 = paramr.dH;
/* 6345 */     float f2 = paramr.dI;
/* 6346 */     paramr.dH = paramFloat1;
/* 6347 */     paramr.dI = paramFloat2;
/*      */     
/* 6349 */     boolean bool1 = paramr.bn();
/*      */     
/* 6351 */     if (a.a(l.bb, paramr, this.X))
/*      */     {
/* 6353 */       bool1 = false;
/*      */     }
/*      */     
/* 6356 */     if (paramaf != null)
/*      */     {
/* 6358 */       if (paramaf != null && paramaf instanceof r) {
/*      */         
/* 6360 */         r r1 = (r)paramaf;
/* 6361 */         if (!r1.aN()) {
/*      */           boolean bool;
/* 6363 */           float f3 = com.corrodinggames.rts.gameFramework.f.a(r1.dH, r1.dI, paramr.dH, paramr.dI);
/* 6364 */           float f4 = r1.f(paramr.r());
/*      */           
/* 6366 */           if (f4 > 800000.0F) {
/*      */             
/* 6368 */             bool = true;
/*      */           }
/*      */           else {
/*      */             
/* 6372 */             bool = (f3 <= f4 * f4) ? true : false;
/*      */           } 
/* 6374 */           if (!bool)
/*      */           {
/* 6376 */             bool1 = false;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/* 6382 */     boolean bool2 = paramr.bT;
/* 6383 */     paramr.bT = true;
/*      */     
/* 6385 */     paramr.bW = bool1;
/* 6386 */     paramr.bX = !bool1;
/*      */     
/* 6388 */     paramr.bV = paramBoolean2;
/*      */ 
/*      */     
/* 6391 */     if (paramBoolean1) {
/*      */       
/* 6393 */       l.bw.j();
/* 6394 */       l.K();
/*      */       
/* 6396 */       paramr.d(0.0F);
/* 6397 */       paramr.c(0.0F);
/* 6398 */       paramr.a(0.0F, false);
/*      */       
/* 6400 */       float f3 = paramr.m();
/* 6401 */       if (f3 > 30.0F)
/*      */       {
/* 6403 */         y.a((af)paramr, f3, true, true);
/*      */       }
/*      */       
/* 6406 */       paramr.bN();
/*      */ 
/*      */       
/* 6409 */       if (!paramBoolean2)
/*      */       {
/* 6411 */         paramr.M(-1);
/*      */       }
/*      */       
/* 6414 */       l.bw.k();
/*      */     } 
/* 6416 */     paramr.dH = f1;
/* 6417 */     paramr.dI = f2;
/*      */     
/* 6419 */     paramr.bV = false;
/*      */     
/* 6421 */     paramr.bT = bool2;
/*      */     
/* 6423 */     return bool1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void E() {
/* 6428 */     l l = l.u();
/*      */     
/* 6430 */     l.cX = true;
/*      */     
/* 6432 */     this.d.p();
/*      */   }
/*      */ 
/*      */   
/*      */   public void F() {
/* 6437 */     l l = l.u();
/*      */     
/* 6439 */     l.da = true;
/* 6440 */     this.d.q();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void G() {
/* 6446 */     k();
/* 6447 */     this.U = null;
/* 6448 */     this.W = (s)this.k;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ArrayList paramArrayList, Rect paramRect, Paint paramPaint1, Paint paramPaint2) {
/* 6459 */     String str = "";
/* 6460 */     for (String str1 : paramArrayList)
/*      */     {
/* 6462 */       str = str + str1 + "\n";
/*      */     }
/* 6464 */     a(str, paramRect, paramPaint1, paramPaint2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(String paramString, Rect paramRect, Paint paramPaint1, Paint paramPaint2) {
/* 6469 */     l l = l.u();
/* 6470 */     String[] arrayOfString = com.corrodinggames.rts.gameFramework.f.b(paramString, '\n');
/* 6471 */     byte b = 0;
/* 6472 */     for (String str : arrayOfString) {
/*      */       Paint paint;
/*      */       
/* 6475 */       if (!b) {
/*      */         
/* 6477 */         paint = paramPaint1;
/*      */       }
/*      */       else {
/*      */         
/* 6481 */         paint = paramPaint2;
/*      */       } 
/* 6483 */       int k = d.a(paint);
/*      */ 
/*      */ 
/*      */       
/* 6487 */       l.bw.a(str, paramRect.d(), (paramRect.b + k / 2 + b * k), paint);
/* 6488 */       b++;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(s params, boolean paramBoolean1, af paramaf, boolean paramBoolean2) {
/* 6494 */     return a(params, paramBoolean1, paramaf, paramBoolean2, false, -1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(s params, boolean paramBoolean1, af paramaf, boolean paramBoolean2, boolean paramBoolean3, float paramFloat) {
/* 6499 */     l l = l.u();
/*      */     
/* 6501 */     String str1 = params.c(paramaf);
/* 6502 */     String str2 = null;
/*      */     
/* 6504 */     boolean bool1 = false;
/*      */     
/* 6506 */     boolean bool2 = true;
/* 6507 */     if (l.am())
/*      */     {
/* 6509 */       bool2 = false;
/*      */     }
/*      */ 
/*      */     
/* 6513 */     if (paramaf != null)
/*      */     {
/* 6515 */       if (params.m(paramaf))
/*      */       {
/* 6517 */         bool2 = false;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 6522 */     if (str1 != null) {
/*      */       int m;
/* 6524 */       boolean bool3 = false;
/* 6525 */       boolean bool4 = false;
/*      */       
/* 6527 */       if (a.a(params)) {
/*      */         
/* 6529 */         bool3 = true;
/* 6530 */         bool4 = true;
/* 6531 */         str1 = this.bp;
/*      */       } 
/*      */       
/* 6534 */       if (c(params)) {
/*      */         
/* 6536 */         bool3 = true;
/*      */         
/* 6538 */         str2 = this.bq;
/*      */         
/* 6540 */         String str = d(params);
/* 6541 */         if (str != null)
/*      */         {
/* 6543 */           str2 = str;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 6548 */       if (!bool3 && paramBoolean2) {
/*      */ 
/*      */         
/* 6551 */         String str = d(params);
/* 6552 */         if (str != null)
/*      */         {
/* 6554 */           str2 = str;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 6559 */       if (str2 == null) {
/*      */         
/* 6561 */         float f1 = this.d.b(params);
/* 6562 */         if (f1 > 0.0F)
/*      */         {
/* 6564 */           str2 = com.corrodinggames.rts.gameFramework.f.g(f1 / 1000.0F);
/*      */         }
/*      */       } 
/*      */       
/* 6568 */       byte b1 = 20;
/* 6569 */       this.bg.a = b1;
/*      */       
/* 6571 */       int k = (int)(l.bS - l.bX - b1);
/*      */       
/* 6573 */       this.bg.c = k;
/*      */ 
/*      */       
/* 6576 */       boolean bool = l.by.showActionInfoHoverNearMouse;
/*      */       
/* 6578 */       if (paramBoolean1) {
/*      */         
/* 6580 */         m = (int)(l.bW - 40.0F);
/*      */       }
/*      */       else {
/*      */         
/* 6584 */         m = 40;
/*      */       } 
/*      */       
/* 6587 */       if (l.ak())
/*      */       {
/* 6589 */         if (paramFloat > 0.0F) {
/*      */ 
/*      */           
/* 6592 */           m = (int)paramFloat;
/* 6593 */           bool1 = true;
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 6598 */       if (l.al() && bool && paramBoolean3)
/*      */       {
/* 6600 */         m = (int)(l.X() - 40.0F);
/*      */       }
/*      */       
/* 6603 */       this.bg.b = m;
/* 6604 */       this.bg.d = this.bg.b;
/*      */       
/* 6606 */       boolean bool5 = true;
/* 6607 */       boolean bool6 = true;
/* 6608 */       boolean bool7 = false;
/*      */       
/* 6610 */       byte b2 = 7;
/*      */       
/* 6612 */       if (l.al()) {
/*      */         
/* 6614 */         if (!bool)
/*      */         {
/* 6616 */           bool5 = false;
/* 6617 */           bool6 = false;
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 6622 */         else if (!paramBoolean3)
/*      */         {
/* 6624 */           bool6 = false;
/* 6625 */           bool5 = true;
/* 6626 */           b2 = 20;
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 6634 */       else if (!paramBoolean1) {
/*      */         
/* 6636 */         bool6 = false;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 6641 */       if (!l.al() || paramBoolean1 || !bool || !paramBoolean3);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 6646 */       if (str2 != null) {
/*      */         
/* 6648 */         int i1 = str1.indexOf("\n");
/* 6649 */         if (i1 == -1) {
/*      */           
/* 6651 */           str1 = str1 + "\n" + str2;
/*      */         }
/*      */         else {
/*      */           
/* 6655 */           str1 = str1.substring(0, i1) + "\nLocked: " + str2 + "\n" + str1.substring(i1);
/*      */         } 
/*      */       } 
/*      */       
/* 6659 */       ArrayList arrayList = d.a(str1, this.bg, (Paint)this.aK, (Paint)this.aJ, bool5);
/*      */       
/* 6661 */       if (bool5) {
/*      */         
/* 6663 */         this.bg.a = (int)(this.bg.a - b2 * l.bQ);
/* 6664 */         this.bg.c = (int)(this.bg.c + b2 * l.bQ);
/*      */       } 
/*      */       
/* 6667 */       if (bool6) {
/*      */         
/* 6669 */         int i1 = (int)(k - 7.0F * l.bQ - this.bg.c);
/*      */         
/* 6671 */         this.bg.a(i1, 0);
/*      */       } 
/*      */       
/* 6674 */       this.bh.a(this.bg);
/* 6675 */       this.bh.b -= 20;
/* 6676 */       this.bh.d += 15;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 6681 */       int n = -1;
/*      */       
/* 6683 */       if (paramaf != null)
/*      */       {
/* 6685 */         n = params.b(paramaf, true);
/*      */       }
/*      */       
/* 6688 */       if (paramaf != null && bool2 && n != -1)
/*      */       {
/* 6690 */         this.bh.d = (int)(this.bh.d + 55.0F * l.bQ);
/*      */       }
/*      */ 
/*      */       
/* 6694 */       if (this.bh.d > l.bT) {
/*      */         
/* 6696 */         int i1 = (int)(l.bT - this.bh.d);
/*      */         
/* 6698 */         this.bg.a(0, i1);
/* 6699 */         this.bh.a(0, i1);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 6704 */       al al = params.i();
/* 6705 */       if (!params.A())
/*      */       {
/* 6707 */         al = null;
/*      */       }
/*      */       
/* 6710 */       if (al != null && paramaf != null)
/*      */       {
/* 6712 */         this.bh.b = (int)(this.bh.b - 40.0F * l.bQ);
/*      */       }
/*      */       
/* 6715 */       if (bool1) {
/*      */         
/* 6717 */         int i1 = -this.bg.c();
/*      */         
/* 6719 */         this.bg.a(0, i1);
/* 6720 */         this.bh.a(0, i1);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 6725 */       if (bool7) {
/*      */ 
/*      */ 
/*      */         
/* 6729 */         float f1 = l.bT - 30.0F;
/*      */         
/* 6731 */         int i1 = (int)(f1 - this.bh.d);
/*      */         
/* 6733 */         this.bh.a(0, i1);
/* 6734 */         this.bg.a(0, i1);
/*      */       } 
/*      */ 
/*      */       
/* 6738 */       if (this.bh.b < 0) {
/*      */         
/* 6740 */         int i1 = 0 - this.bh.b;
/*      */         
/* 6742 */         this.bh.a(0, i1);
/* 6743 */         this.bg.a(0, i1);
/*      */       } 
/*      */       
/* 6746 */       if (this.bh.d > l.bT - 20.0F) {
/*      */         
/* 6748 */         float f1 = l.bT - 20.0F;
/*      */         
/* 6750 */         int i1 = (int)(f1 - this.bh.d);
/*      */         
/* 6752 */         this.bh.a(0, i1);
/* 6753 */         this.bg.a(0, i1);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 6758 */       l.bw.b(this.bh, this.aI);
/* 6759 */       l.bw.b(this.bh, this.aE);
/* 6760 */       if (bool3);
/*      */       
/* 6762 */       if (al != null && paramaf != null) {
/*      */         
/* 6764 */         float f1 = 30.0F * l.bQ;
/* 6765 */         float f2 = 100.0F * l.bQ;
/* 6766 */         ak.a(al, this.bh.d(), this.bh.b + 22.0F * l.bQ, this.T, 0.0F, paramaf.bB, f1, f2, false, false, params.p());
/*      */       } 
/*      */       
/* 6769 */       q q1 = this.aK;
/* 6770 */       if (paramBoolean2)
/*      */       {
/* 6772 */         q1 = this.aL;
/*      */       }
/* 6774 */       a(arrayList, this.bg, (Paint)q1, (Paint)this.aJ);
/* 6775 */       if (paramaf != null)
/*      */       {
/*      */         
/* 6778 */         if (n != -1 && bool2) {
/*      */           Paint paint;
/* 6780 */           float f1 = l.bQ * 0.5F;
/*      */           
/* 6782 */           int i1 = (int)(60.0F * f1);
/*      */           
/* 6784 */           float f2 = c.b(paramaf, params, true);
/*      */ 
/*      */ 
/*      */           
/* 6788 */           if (!bool3 || n > 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 6798 */             this.aD.b(-16777216);
/*      */             
/* 6800 */             if (f2 != 0.0F) {
/*      */               int i4;
/*      */               
/* 6803 */               float f4 = com.corrodinggames.rts.gameFramework.f.c(f2) * 0.5F - 0.4F;
/* 6804 */               f4 = com.corrodinggames.rts.gameFramework.f.b(f4, 0.0F, 1.0F);
/*      */ 
/*      */               
/* 6807 */               if (f2 > 0.0F) {
/*      */                 
/* 6809 */                 i4 = Color.a(110, 30, 240, 30);
/*      */               }
/*      */               else {
/*      */                 
/* 6813 */                 i4 = Color.a(110, 240, 30, 30);
/*      */               } 
/* 6815 */               int i5 = com.corrodinggames.rts.gameFramework.f.a(i4, this.aD.e(), f4);
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 6822 */             float f3 = this.bh.d - 65.0F * f1 / 2.0F + (d.b(this.aD) / 2);
/*      */ 
/*      */ 
/*      */             
/* 6826 */             if (f2 > 0.5D)
/*      */             {
/* 6828 */               f3++;
/*      */             }
/* 6830 */             if (f2 < -0.5D)
/*      */             {
/* 6832 */               f3--;
/*      */             }
/*      */ 
/*      */ 
/*      */             
/* 6837 */             l.bw.a("" + n, this.bh.d(), f3, this.aD);
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 6844 */           boolean bool8 = false;
/* 6845 */           boolean bool9 = false;
/*      */           
/* 6847 */           boolean bool10 = (!bool3 && a(params, true)) ? true : false;
/* 6848 */           boolean bool11 = (n > 0 && params.d(paramaf, true)) ? true : false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 6859 */           int i2 = (int)(this.bh.d() + 60.0F * f1);
/* 6860 */           int i3 = (int)(this.bh.d - 65.0F * f1);
/*      */           
/* 6862 */           this.bj.a(i2, i3, i2 + i1, i3 + i1);
/*      */ 
/*      */ 
/*      */           
/* 6866 */           if (bool10) {
/*      */             
/* 6868 */             paint = this.aY;
/*      */           }
/*      */           else {
/*      */             
/* 6872 */             paint = this.aZ;
/*      */           } 
/*      */ 
/*      */           
/* 6876 */           if (f2 > 0.0F) {
/*      */             int i4;
/*      */             
/* 6879 */             float f3 = com.corrodinggames.rts.gameFramework.f.c(f2) * 0.7F - 0.3F;
/* 6880 */             f3 = com.corrodinggames.rts.gameFramework.f.b(f3, 0.0F, 1.0F);
/*      */ 
/*      */             
/* 6883 */             if (f2 > 0.0F) {
/*      */               
/* 6885 */               i4 = Color.a(110, 210, 210, 210);
/*      */             }
/*      */             else {
/*      */               
/* 6889 */               i4 = Color.a(110, 210, 110, 110);
/*      */             } 
/* 6891 */             int i5 = com.corrodinggames.rts.gameFramework.f.a(i4, paint.e(), f3);
/* 6892 */             paint = this.bl;
/* 6893 */             paint.b(i5);
/*      */           } 
/*      */           
/* 6896 */           if (f2 > 0.5D)
/*      */           {
/* 6898 */             this.bj.a(0, 1);
/*      */           }
/*      */           
/* 6901 */           l.bw.a(this.ba, this.bj.a, this.bj.b, paint, 0.0F, f1);
/*      */           
/* 6903 */           com.corrodinggames.rts.gameFramework.f.a(this.bj, this.bj.b() * 0.8F);
/*      */           
/* 6905 */           if (this.O && !this.N)
/*      */           {
/* 6907 */             if (this.bj.b((int)this.s, (int)this.t)) {
/*      */               
/* 6909 */               this.O = false;
/* 6910 */               bool8 = true;
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 6926 */           i2 = (int)((this.bh.d() - i1) - 60.0F * f1);
/* 6927 */           i3 = (int)(this.bh.d - 65.0F * f1);
/*      */           
/* 6929 */           this.bj.a(i2, i3, i2 + i1, i3 + i1);
/*      */ 
/*      */ 
/*      */           
/* 6933 */           if (bool11) {
/*      */             
/* 6935 */             paint = this.aY;
/*      */           }
/*      */           else {
/*      */             
/* 6939 */             paint = this.aZ;
/*      */           } 
/*      */ 
/*      */           
/* 6943 */           if (f2 < 0.0F) {
/*      */             int i4;
/*      */             
/* 6946 */             float f3 = com.corrodinggames.rts.gameFramework.f.c(f2) * 0.7F - 0.3F;
/* 6947 */             f3 = com.corrodinggames.rts.gameFramework.f.b(f3, 0.0F, 1.0F);
/*      */ 
/*      */             
/* 6950 */             if (f2 > 0.0F) {
/*      */               
/* 6952 */               i4 = Color.a(110, 210, 210, 210);
/*      */             }
/*      */             else {
/*      */               
/* 6956 */               i4 = Color.a(110, 210, 110, 110);
/*      */             } 
/* 6958 */             int i5 = com.corrodinggames.rts.gameFramework.f.a(i4, paint.e(), f3);
/* 6959 */             paint = this.bl;
/* 6960 */             paint.b(i5);
/*      */           } 
/*      */           
/* 6963 */           if (f2 < -0.5D)
/*      */           {
/* 6965 */             this.bj.a(0, 1);
/*      */           }
/*      */ 
/*      */           
/* 6969 */           l.bw.a(this.bb, this.bj.a, this.bj.b, paint, 0.0F, f1);
/*      */ 
/*      */           
/* 6972 */           com.corrodinggames.rts.gameFramework.f.a(this.bj, this.bj.b() * 0.8F);
/*      */           
/* 6974 */           if (this.O && !this.N)
/*      */           {
/* 6976 */             if (this.bj.b((int)this.s, (int)this.t)) {
/*      */               
/* 6978 */               this.O = false;
/* 6979 */               bool9 = true;
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 6987 */           i2 = 1;
/* 6988 */           if (bool8 || bool9)
/*      */           {
/* 6990 */             if (params.g()) {
/*      */               
/* 6992 */               if (a(l))
/*      */               {
/* 6994 */                 i2 = 5;
/*      */               }
/* 6996 */               if (b(l))
/*      */               {
/* 6998 */                 i2 = 10;
/*      */               }
/*      */             } 
/*      */           }
/*      */           
/* 7003 */           if (bool8) {
/*      */             
/* 7005 */             if (params.g())
/*      */             {
/* 7007 */               if (l.bb.t() <= l.bb.s())
/*      */               {
/* 7009 */                 a(this.d.an);
/*      */               }
/*      */             }
/*      */             
/* 7013 */             if (bool10) {
/*      */               
/* 7015 */               l.bu.b(e.g, 0.5F);
/*      */               
/* 7017 */               c.a(paramaf, params, false, true);
/*      */             } 
/*      */             
/* 7020 */             for (i3 = 0; i3 < i2; i3++) {
/*      */ 
/*      */ 
/*      */               
/* 7024 */               e e1 = u();
/*      */               
/* 7026 */               if (a(l))
/*      */               {
/* 7028 */                 e1.e = true;
/*      */               }
/* 7030 */               a(e1, params);
/* 7031 */               e1.a(params.w());
/*      */               
/* 7033 */               a(params, (PointF)null, (af)null, e1);
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 7039 */           if (bool9) {
/*      */             
/* 7041 */             if (bool11) {
/*      */               
/* 7043 */               c.a(paramaf, params, true, true);
/* 7044 */               l.bu.b(e.h, 0.5F);
/*      */             } 
/*      */             
/* 7047 */             for (i3 = 0; i3 < i2; i3++) {
/*      */ 
/*      */               
/* 7050 */               e e1 = u();
/*      */               
/* 7052 */               a(e1, params);
/* 7053 */               e1.g = true;
/* 7054 */               e1.a(params.w());
/*      */             } 
/*      */           } 
/*      */           
/* 7058 */           if (!bool8 && !bool9)
/*      */           {
/* 7060 */             if (this.O && !this.N)
/*      */             {
/* 7062 */               if (!this.bh.b((int)this.s, (int)this.t))
/*      */               {
/* 7064 */                 return true;
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
/* 7075 */     if (!bool2 && l.ak())
/*      */     {
/* 7077 */       if (this.O && !this.N)
/*      */       {
/* 7079 */         if (!this.bh.b((int)this.s, (int)this.t))
/*      */         {
/* 7081 */           return true;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 7087 */     return false;
/*      */   }
/*      */ 
/*      */   
/* 7091 */   Paint bH = new Paint();
/*      */ 
/*      */   
/*      */   public void a(Rect paramRect, Paint paramPaint1, Paint paramPaint2) {
/* 7095 */     l l = l.u();
/*      */     
/* 7097 */     if (bw) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 7102 */       l.bw.a(this.be, paramRect, paramPaint2, paramRect.a, paramRect.b, 0, 0);
/*      */       
/* 7104 */       if (paramPaint1 != null) {
/*      */         
/* 7106 */         int k = paramPaint1.f() + 0;
/* 7107 */         if (k > 255) k = 255;
/*      */         
/* 7109 */         paramPaint1.c(k);
/*      */       } 
/*      */     } 
/*      */     
/* 7113 */     if (paramPaint1 != null)
/*      */     {
/* 7115 */       l.bw.b(paramRect, paramPaint1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Rect paramRect, int paramInt) {
/* 7122 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 7131 */     this.bo.b(paramInt);
/*      */     
/* 7133 */     this.bo.a(Paint.Style.b);
/* 7134 */     this.bo.a(1.0F);
/* 7135 */     l.bw.b(paramRect, this.bo);
/*      */     
/* 7137 */     if (this.bv) {
/*      */       
/* 7139 */       this.bo.b(Color.a(255, 116, 136, 160));
/* 7140 */       byte b = 1;
/* 7141 */       this.bo.a(b);
/* 7142 */       this.bk.a(paramRect);
/* 7143 */       this.bk.d -= b;
/* 7144 */       this.bk.b += b;
/* 7145 */       this.bk.a += b;
/* 7146 */       this.bk.c -= b;
/* 7147 */       l.bw.b(this.bk, this.bo);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, Paint paramPaint, boolean paramBoolean) {
/* 7153 */     l l = l.u();
/* 7154 */     this.bi.a(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
/*      */     
/* 7156 */     this.bo.b(paramInt5);
/*      */     
/* 7158 */     if (!paramBoolean) {
/*      */       
/* 7160 */       this.bo.a(Paint.Style.a);
/* 7161 */       l.bw.b(this.bi, this.bo);
/*      */     }
/*      */     else {
/*      */       
/* 7165 */       a(this.bi, (Paint)null, this.bo);
/*      */     } 
/*      */ 
/*      */     
/* 7169 */     int k = Color.a(255, 0, 0, 0);
/* 7170 */     if (bw)
/*      */     {
/* 7172 */       k = Color.a(100, 0, 0, 0);
/*      */     }
/*      */     
/* 7175 */     a(this.bi, k);
/*      */ 
/*      */     
/* 7178 */     a(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramInt5, paramPaint);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, Paint paramPaint) {
/* 7183 */     l l = l.u();
/* 7184 */     this.bi.a(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 7190 */     if (l.aG) {
/*      */ 
/*      */       
/* 7193 */       l.bw.a(paramString, this.bi.d(), (this.bi.e() + l.bw.a(paramString, paramPaint) / 2), paramPaint);
/*      */     }
/*      */     else {
/*      */       
/* 7197 */       l.bw.a(paramString, this.bi.d(), this.bi.e() - (paramPaint.l() + paramPaint.m()) / 2.0F, paramPaint);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean H() {
/* 7204 */     if (this.N)
/*      */     {
/* 7206 */       return false;
/*      */     }
/* 7208 */     return true;
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
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, g paramg, boolean paramBoolean, int paramInt5) {
/* 7221 */     return a(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramg, paramBoolean, paramInt5, this.aw, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, g paramg, boolean paramBoolean, int paramInt5) {
/* 7226 */     return a(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramg, paramBoolean, paramInt5, this.aw, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, g paramg, boolean paramBoolean, int paramInt5, Paint paramPaint) {
/* 7231 */     return a(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramg, paramBoolean, paramInt5, paramPaint, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, g paramg, boolean paramBoolean1, int paramInt5, Paint paramPaint, boolean paramBoolean2) {
/* 7236 */     a(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramInt5, paramPaint, paramBoolean2);
/* 7237 */     return a(paramInt1, paramInt2, paramInt3, paramInt4, paramg, paramBoolean1);
/*      */   }
/*      */   
/* 7240 */   Rect bI = new Rect();
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 7244 */     this.bI.a((int)paramFloat1, (int)paramFloat2, (int)(paramFloat1 + paramFloat3), (int)(paramFloat2 + paramFloat4));
/*      */ 
/*      */     
/* 7247 */     if (this.bI.b((int)this.u, (int)this.v)) {
/*      */       
/* 7249 */       this.G = true;
/* 7250 */       if (this.P)
/*      */       {
/*      */         
/* 7253 */         this.F = true;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, g paramg, boolean paramBoolean) {
/* 7261 */     a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 7262 */     this.bi.a(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
/* 7263 */     if ((paramBoolean && this.D) || this.O)
/*      */     {
/* 7265 */       if (this.bi.b((int)this.s, (int)this.t))
/*      */       {
/* 7267 */         return true;
/*      */       }
/*      */     }
/* 7270 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, g paramg) {
/* 7275 */     this.bi.a(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
/*      */     
/* 7277 */     if (this.P)
/*      */     {
/* 7279 */       if (this.bi.b((int)this.s, (int)this.t))
/*      */       {
/* 7281 */         return true;
/*      */       }
/*      */     }
/*      */     
/* 7285 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float r(af paramaf) {
/* 7294 */     l l = l.u();
/*      */     
/* 7296 */     if (paramaf.cj < l.bj && paramaf.cj + 200 > l.bj) {
/*      */       
/* 7298 */       float f1 = 1.0F - (l.bj - paramaf.cj) / 200.0F;
/* 7299 */       return f1 * 6.0F;
/*      */     } 
/*      */     
/* 7302 */     return (l.u()).de;
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
/*      */   public void a(e parame) {
/* 7323 */     l l = l.u();
/*      */     
/* 7325 */     parame.q_();
/* 7326 */     parame.c(l.bV);
/* 7327 */     parame.d(l.bW);
/*      */     
/* 7329 */     this.n.a((j)parame);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
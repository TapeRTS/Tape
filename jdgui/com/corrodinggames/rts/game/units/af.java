/*      */ package com.corrodinggames.rts.game.units;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.ColorFilter;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.b.f;
/*      */ import com.corrodinggames.rts.game.f;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.b.b;
/*      */ import com.corrodinggames.rts.game.units.custom.ab;
/*      */ import com.corrodinggames.rts.game.units.custom.b.i;
/*      */ import com.corrodinggames.rts.game.units.custom.c.c;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.g;
/*      */ import com.corrodinggames.rts.game.units.custom.i;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.d.c;
/*      */ import com.corrodinggames.rts.game.units.d.n;
/*      */ import com.corrodinggames.rts.game.units.d.p;
/*      */ import com.corrodinggames.rts.game.units.e.b;
/*      */ import com.corrodinggames.rts.game.units.e.h;
/*      */ import com.corrodinggames.rts.game.units.e.j;
/*      */ import com.corrodinggames.rts.game.units.h.f;
/*      */ import com.corrodinggames.rts.gameFramework.ay;
/*      */ import com.corrodinggames.rts.gameFramework.b.a;
/*      */ import com.corrodinggames.rts.gameFramework.b.d;
/*      */ import com.corrodinggames.rts.gameFramework.b.e;
/*      */ import com.corrodinggames.rts.gameFramework.b.f;
/*      */ import com.corrodinggames.rts.gameFramework.b.h;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.o;
/*      */ import com.corrodinggames.rts.gameFramework.utility.u;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.EnumSet;
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
/*      */ public abstract class af
/*      */   extends ay
/*      */ {
/*      */   public float bc;
/*   73 */   public int bd = -9999;
/*      */   
/*   75 */   public af be = null;
/*      */ 
/*      */   
/*   78 */   public int bf = -9999;
/*   79 */   public int bg = -9999;
/*   80 */   public int bh = -9999;
/*      */ 
/*      */   
/*      */   public int bi;
/*      */ 
/*      */   
/*      */   public strictfp void a(ap paramap) {
/*   87 */     paramap.a(this.br);
/*   88 */     paramap.a(this.bv);
/*   89 */     paramap.a(this.bw);
/*   90 */     paramap.a(this.bx);
/*   91 */     paramap.a(this.by);
/*   92 */     paramap.a(this.bz);
/*   93 */     paramap.a(this.bA);
/*   94 */     paramap.a(this.bB);
/*   95 */     paramap.a(this.bD);
/*   96 */     paramap.a(this.bE);
/*   97 */     paramap.a(this.bH);
/*   98 */     paramap.a(this.bI);
/*   99 */     paramap.a(this.bK);
/*  100 */     paramap.a(this.bL);
/*  101 */     paramap.a(this.bO);
/*  102 */     paramap.a(this.bP);
/*  103 */     paramap.a(this.bQ);
/*  104 */     paramap.a(this.bR);
/*  105 */     paramap.a(this.bT);
/*  106 */     paramap.a(this.bW);
/*      */     
/*  108 */     paramap.a(this.bY);
/*  109 */     paramap.a(this.bZ);
/*  110 */     paramap.a(this.cm);
/*  111 */     paramap.a((this.cn[0]).a);
/*  112 */     paramap.a((this.cn[0]).d);
/*      */     
/*  114 */     paramap.a(this.cp);
/*      */ 
/*      */     
/*  117 */     paramap.c(21);
/*      */ 
/*      */     
/*  120 */     paramap.a(this.cw);
/*  121 */     paramap.a(this.cx);
/*      */ 
/*      */ 
/*      */     
/*  125 */     paramap.a(this.bJ);
/*  126 */     paramap.a(this.bM);
/*      */     
/*  128 */     int j = bg();
/*      */     
/*  130 */     paramap.a(j); short s;
/*  131 */     for (s = 0; s < j; s++) {
/*      */       
/*  133 */       ai ai1 = this.cn[s];
/*      */       
/*  135 */       paramap.a(ai1.a);
/*  136 */       paramap.a(ai1.c);
/*  137 */       paramap.a(ai1.d);
/*  138 */       paramap.a(ai1.e);
/*  139 */       paramap.a(ai1.f);
/*      */ 
/*      */       
/*  142 */       paramap.a(ai1.h);
/*  143 */       paramap.a(ai1.i);
/*      */ 
/*      */       
/*  146 */       af af1 = ai1.j;
/*      */       
/*  148 */       if (af1 != null)
/*      */       {
/*  150 */         if (af1.bz)
/*      */         {
/*  152 */           af1 = null;
/*      */         }
/*      */       }
/*  155 */       paramap.a(af1);
/*      */ 
/*      */ 
/*      */       
/*  159 */       paramap.a(this.co);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  164 */     paramap.a(this.bd);
/*      */ 
/*      */ 
/*      */     
/*  168 */     paramap.a(this.cb);
/*  169 */     paramap.a(this.cc);
/*  170 */     paramap.a(this.cd);
/*  171 */     paramap.a(this.ce);
/*      */ 
/*      */ 
/*      */     
/*  175 */     paramap.a(this.bU);
/*  176 */     paramap.a(this.bV);
/*      */ 
/*      */     
/*  179 */     paramap.a(this.bX);
/*      */ 
/*      */ 
/*      */     
/*  183 */     paramap.a(this.bs);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  191 */     paramap.a(this.cf);
/*      */ 
/*      */     
/*  194 */     paramap.a(this.bN);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  199 */     paramap.a((this.dh != null));
/*  200 */     if (this.dh != null) {
/*      */       
/*  202 */       paramap.a(this.dh.length);
/*  203 */       for (s = 0; s < this.dh.length; s++) {
/*      */         
/*  205 */         ag ag1 = this.dh[s];
/*      */         
/*  207 */         paramap.a(ag1.a);
/*  208 */         paramap.a(ag1.b);
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
/*  222 */     paramap.a(this.ca);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  228 */     paramap.b(this.be);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  234 */     paramap.a(this.cg);
/*      */     
/*  236 */     paramap.a(this.ch);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  242 */     paramap.a(this.bf);
/*  243 */     paramap.a(this.bg);
/*  244 */     paramap.a(this.bh);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  249 */     paramap.a(this.bi);
/*      */ 
/*      */ 
/*      */     
/*  253 */     paramap.a(this.bt);
/*  254 */     paramap.a(this.bu);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  260 */     this.dj.a(paramap);
/*  261 */     this.dk.a(paramap);
/*      */ 
/*      */ 
/*      */     
/*  265 */     paramap.b(this.cq);
/*      */     
/*  267 */     s = -1;
/*  268 */     if (this.cq != null && this.cr != null)
/*      */     {
/*  270 */       s = this.cr.a();
/*      */     }
/*      */     
/*  273 */     paramap.a(s);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  278 */     paramap.a(this.cs);
/*      */ 
/*      */ 
/*      */     
/*  282 */     super.a(paramap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk) {
/*  290 */     this.br = paramk.e();
/*  291 */     this.bv = paramk.n();
/*  292 */     this.bw = paramk.n();
/*  293 */     this.bx = paramk.g();
/*  294 */     this.by = paramk.e();
/*  295 */     this.bz = paramk.e();
/*  296 */     this.bA = paramk.i();
/*      */     
/*  298 */     a(paramk.q());
/*      */     
/*  300 */     this.bD = paramk.g();
/*  301 */     this.bE = paramk.g();
/*  302 */     this.bH = paramk.g();
/*  303 */     this.bI = paramk.g();
/*  304 */     this.bK = paramk.g();
/*  305 */     this.bL = paramk.g();
/*      */     
/*  307 */     float f1 = paramk.g();
/*      */     
/*  309 */     float f2 = paramk.g();
/*      */     
/*  311 */     this.bQ = paramk.g();
/*  312 */     this.bR = paramk.g();
/*  313 */     this.bT = paramk.e();
/*  314 */     this.bW = paramk.e();
/*  315 */     this.bY = paramk.g();
/*  316 */     this.bZ = paramk.g();
/*  317 */     this.cm = paramk.e();
/*  318 */     (this.cn[0]).a = paramk.g();
/*  319 */     (this.cn[0]).d = paramk.g();
/*      */     
/*  321 */     this.cp = paramk.n();
/*      */     
/*  323 */     byte b = paramk.d();
/*      */ 
/*      */     
/*  326 */     if (b >= 1) {
/*      */       
/*  328 */       this.cw = paramk.f();
/*  329 */       this.cx = paramk.g();
/*      */     } 
/*      */     
/*  332 */     if (b >= 2) {
/*      */       
/*  334 */       this.bJ = paramk.g();
/*  335 */       this.bM = paramk.g();
/*      */       
/*  337 */       int j = paramk.f();
/*      */       
/*  339 */       N(j);
/*      */ 
/*      */       
/*  342 */       for (byte b1 = 0; b1 < j; b1++) {
/*      */         
/*  344 */         ai ai1 = this.cn[b1];
/*      */         
/*  346 */         ai1.a = paramk.g();
/*  347 */         ai1.c = paramk.g();
/*  348 */         ai1.d = paramk.g();
/*  349 */         ai1.e = paramk.g();
/*  350 */         ai1.f = paramk.g();
/*      */         
/*  352 */         if (b >= 8) {
/*      */ 
/*      */           
/*  355 */           ai1.h = paramk.g();
/*  356 */           ai1.i = paramk.g();
/*  357 */           ai1.j = paramk.n();
/*      */         } 
/*      */         
/*  360 */         if (b >= 12)
/*      */         {
/*  362 */           this.co = paramk.e();
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  368 */     if (b >= 3)
/*      */     {
/*  370 */       this.bd = paramk.f();
/*      */     }
/*      */     
/*  373 */     if (b >= 4) {
/*      */ 
/*      */       
/*  376 */       this.cb = paramk.g();
/*  377 */       this.cc = paramk.g();
/*  378 */       this.cd = paramk.g();
/*  379 */       this.ce = paramk.g();
/*      */     } 
/*      */     
/*  382 */     if (b >= 5) {
/*      */       
/*  384 */       this.bU = paramk.e();
/*  385 */       this.bV = paramk.e();
/*      */     } 
/*      */     
/*  388 */     if (b >= 6)
/*      */     {
/*  390 */       this.bX = paramk.e();
/*      */     }
/*      */     
/*  393 */     if (b >= 7)
/*      */     {
/*  395 */       this.bs = paramk.e();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  404 */     if (b >= 9)
/*      */     {
/*  406 */       this.cf = paramk.g();
/*      */     }
/*      */ 
/*      */     
/*  410 */     if (b >= 10)
/*      */     {
/*  412 */       this.bN = paramk.e();
/*      */     }
/*      */ 
/*      */     
/*  416 */     if (b >= 11) {
/*      */       
/*  418 */       boolean bool = paramk.e();
/*      */       
/*  420 */       if (bool) {
/*      */         
/*  422 */         this.dh = new ag[paramk.f()];
/*      */         
/*  424 */         for (byte b1 = 0; b1 < this.dh.length; b1++) {
/*      */           
/*  426 */           this.dh[b1] = new ag();
/*      */           
/*  428 */           ag ag1 = this.dh[b1];
/*  429 */           ag1.a = paramk.e();
/*  430 */           ag1.b = paramk.f();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  438 */     if (b >= 13)
/*      */     {
/*      */       
/*  441 */       this.ca = paramk.g();
/*      */     }
/*      */ 
/*      */     
/*  445 */     if (b >= 14)
/*      */     {
/*  447 */       this.be = paramk.n();
/*      */     }
/*      */     
/*  450 */     if (b >= 15) {
/*      */       
/*  452 */       this.cg = paramk.f();
/*  453 */       this.ch = paramk.f();
/*      */     } 
/*      */ 
/*      */     
/*  457 */     if (b >= 16) {
/*      */       
/*  459 */       this.bf = paramk.f();
/*  460 */       this.bg = paramk.f();
/*  461 */       this.bh = paramk.f();
/*      */     } 
/*      */     
/*  464 */     if (b >= 17)
/*      */     {
/*  466 */       this.bi = paramk.f();
/*      */     }
/*      */     
/*  469 */     if (b >= 18) {
/*      */       
/*  471 */       this.bt = paramk.e();
/*  472 */       this.bu = paramk.e();
/*      */     } 
/*      */ 
/*      */     
/*  476 */     if (b >= 19) {
/*      */       
/*  478 */       this.dj.a(paramk);
/*  479 */       this.dk.a(this, paramk);
/*      */     } 
/*      */ 
/*      */     
/*  483 */     if (b >= 20) {
/*      */       
/*  485 */       r r1 = paramk.o();
/*  486 */       short s = paramk.t();
/*      */       
/*  488 */       if (s != -1) {
/*      */         
/*  490 */         boolean bool = false;
/*      */         
/*  492 */         if (r1 != null)
/*      */         {
/*  494 */           if (this instanceof r) {
/*      */ 
/*      */             
/*  497 */             i i1 = r1.a(s);
/*      */             
/*  499 */             if (i1 != null)
/*      */             {
/*  501 */               if (r1.a((r)this, i1))
/*      */               {
/*  503 */                 bool = true;
/*      */               }
/*      */             }
/*      */           } 
/*      */         }
/*      */         
/*  509 */         if (!bool)
/*      */         {
/*  511 */           this.bY = -1.0F;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  518 */     if (b >= 21)
/*      */     {
/*  520 */       this.cs = paramk.f();
/*      */     }
/*      */     
/*  523 */     if (this.bz) {
/*      */       
/*  525 */       l l = l.u();
/*  526 */       bj.remove(this);
/*  527 */       l.bK.a(this);
/*      */     } 
/*      */     
/*  530 */     super.a(paramk);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp e a(e parame) {
/*  537 */     return a(parame, parame.l(), parame.k());
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp e a(e parame, int paramInt1, int paramInt2) {
/*  542 */     e e1 = parame.a(paramInt1, paramInt2, false);
/*      */     
/*  544 */     parame.w();
/*      */     
/*  546 */     e1.i();
/*      */     
/*  548 */     int j = e1.l();
/*  549 */     int k = e1.k();
/*      */     
/*  551 */     for (byte b = 0; b < j; b++) {
/*      */       
/*  553 */       for (byte b1 = 0; b1 < k; b1++) {
/*      */         
/*  555 */         int n = parame.a(b, b1);
/*  556 */         e1.a(b, b1, Color.a(Color.a(n), 0, 0, 0));
/*      */       } 
/*      */     } 
/*  559 */     e1.o();
/*      */ 
/*      */     
/*  562 */     e1.r();
/*      */     
/*  564 */     parame.x();
/*      */     
/*  566 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  576 */   public static final u bj = new u();
/*      */ 
/*      */   
/*  579 */   private static final o a = new o();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp o bt() {
/*  586 */     a.a();
/*  587 */     return a;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void bu() {
/*  592 */     a.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  598 */   public static HashMap bk = new HashMap<>();
/*  599 */   public static HashMap bl = new HashMap<>();
/*  600 */   public static HashMap bm = new HashMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  618 */   public static final Paint bn = (Paint)new q(); static {
/*  619 */     bn.a(true);
/*  620 */     bn.a(255, 195, 195, 195);
/*      */   }
/*      */   
/*  623 */   public static final Paint bo = (Paint)new q();
/*      */   static {
/*  625 */     bo.a(true);
/*      */   }
/*  627 */   static final LightingColorFilter bp = new LightingColorFilter(Color.a(255, 255, 255), Color.a(100, 100, 100)); public boolean bq; public boolean br; public boolean bs; public boolean bt; public boolean bu; public af bv; public af bw; public float bx; public boolean by; public boolean bz; public long bA; public m bB; public boolean bC; public float bD; public float bE; public boolean bF; public boolean bG; public float bH; public float bI; public float bJ; public float bK; public float bL; public float bM; public boolean bN; public float bO; public float bP; public float bQ; public float bR; public boolean bS; public boolean bT; public boolean bU; public boolean bV; public boolean bW; public boolean bX; public float bY; public float bZ; public float ca; public float cb; public float cc; public float cd; public float ce; public float cf; public int cg; public int ch; public boolean ci; public int cj; public boolean ck; public float cl; public boolean cm; public ai[] cn; public boolean co; public af cp; public r cq; public i cr; public int cs; public boolean ct; public int cu; public int cv; public int cw; public float cx;
/*      */   static {
/*  629 */     bo.a(255, 255, 255, 255);
/*  630 */     bo.a((ColorFilter)bp);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void bv() {
/*  639 */     j.cZ();
/*  640 */     c.cZ();
/*  641 */     h.K();
/*  642 */     f.L();
/*  643 */     b.K();
/*      */ 
/*      */     
/*  646 */     l l = l.u();
/*  647 */     if (l.ai()) {
/*      */ 
/*      */       
/*  650 */       for (ak ak : EnumSet.<ak>allOf(ak.class))
/*      */       {
/*  652 */         ak.b();
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  659 */       b.K();
/*  660 */       n.b();
/*  661 */       p.da();
/*      */       
/*  663 */       ae.b();
/*      */     } 
/*      */ 
/*      */     
/*  667 */     ak.t();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean bw() {
/*  674 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean bx() {
/*  679 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp HashMap by() {
/*  685 */     HashMap<Object, Object> hashMap = new HashMap<>();
/*      */     
/*  687 */     l l = l.u();
/*  688 */     if (l.ai())
/*      */     {
/*  690 */       for (ak ak : EnumSet.<ak>allOf(ak.class)) {
/*      */         
/*  692 */         af af1 = ak.a(true);
/*  693 */         af1.a();
/*  694 */         af1.a(m.g);
/*  695 */         af1.bT = true;
/*  696 */         hashMap.put(ak, af1);
/*      */       } 
/*      */     }
/*      */     
/*  700 */     for (l l1 : l.d) {
/*      */       
/*  702 */       af af1 = l1.a(true);
/*  703 */       af1.a();
/*  704 */       af1.a(m.g);
/*  705 */       af1.bT = true;
/*  706 */       hashMap.put(l1, af1);
/*      */     } 
/*  708 */     return hashMap;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void bz() {
/*  713 */     bl = by();
/*  714 */     bm = by();
/*  715 */     bk = by();
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp af a(al paramal) {
/*  720 */     return (af)bk.get(paramal);
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
/*      */   public static strictfp af b(al paramal) {
/*  733 */     return c(paramal);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp af c(al paramal) {
/*  738 */     af af1 = (af)bl.get(paramal);
/*  739 */     if (af1 == null) {
/*      */       
/*  741 */       if (l.b == null) {
/*      */         
/*  743 */         l.d("Could not find:" + paramal.i() + " and missing place holder is null");
/*  744 */         return null;
/*      */       } 
/*      */ 
/*      */       
/*  748 */       af1 = (af)bl.get(l.b);
/*      */       
/*  750 */       if (af1 == null) {
/*      */         
/*  752 */         l.d("name: " + l.b.E);
/*      */         
/*  754 */         l.d("contains:" + bl.containsKey(l.b));
/*      */         
/*  756 */         for (al al1 : bl.keySet())
/*      */         {
/*  758 */           l.d("has:" + al1.i());
/*      */         }
/*      */         
/*  761 */         l.d("Could not find:" + paramal.i() + " and missing place holder could not be found");
/*      */       } 
/*      */     } 
/*  764 */     return af1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp af d(al paramal) {
/*  769 */     af af1 = (af)bm.get(paramal);
/*  770 */     if (af1 == null)
/*      */     {
/*      */       
/*  773 */       af1 = (af)bm.get(l.b);
/*      */     }
/*  775 */     return af1;
/*      */   }
/*      */   
/*      */   public static strictfp int bA()
/*      */   {
/*  780 */     int j = 0;
/*      */     
/*  782 */     l l = l.u();
/*  783 */     if (l.ai())
/*      */     {
/*  785 */       for (ak ak : EnumSet.<ak>allOf(ak.class)) {
/*      */ 
/*      */         
/*  788 */         af af1 = a(ak);
/*  789 */         j = j * 31 + af1.br();
/*      */       } 
/*      */     }
/*      */     
/*  793 */     return j; }
/*      */   public strictfp void a() { m.a(this); bj.remove(this); a.b(this); l l = l.u(); l.bA.l(this); super.a(); }
/*      */   public strictfp float bB() { return 3000.0F; }
/*      */   public strictfp int q(af paramaf) { return 0; }
/*      */   public strictfp boolean bC() { return false; }
/*      */   public strictfp boolean bD() { return false; }
/*      */   public strictfp float bE() { return -1.0F; }
/*      */   public strictfp void bF() { N(1); }
/*      */   public strictfp void N(int paramInt) { int k, j = bg(); if (j < paramInt) j = paramInt;  if (this.cn == null) { k = 0; this.cn = new ai[j]; } else if (this.cn.length < j) { k = this.cn.length; this.cn = Arrays.<ai>copyOf(this.cn, j); } else { return; }  for (int n = k; n < this.cn.length; n++) this.cn[n] = new ai();  }
/*      */   public static final Paint cy = new Paint();
/*      */   public static final Paint cz = (Paint)new q();
/*      */   public static final Paint cA = (Paint)new q();
/*      */   public static final Paint cB = (Paint)new q();
/*      */   public static final Paint cC = (Paint)new q();
/*      */   public static final Paint cD = (Paint)new q();
/*      */   public static final Paint cE = (Paint)new q();
/*      */   public static final Paint cF = new Paint();
/*      */   public static final Paint cG = new Paint();
/*      */   public static final Paint cH = new Paint();
/*      */   public static final Paint cI = (Paint)new q();
/*      */   public static final Paint cJ = (Paint)new q();
/*      */   public static final Paint cK = (Paint)new q();
/*      */   public static final Paint cL = (Paint)new q();
/*      */   public static final Paint cM = new Paint();
/*      */   public int cN;
/*      */   public int cO;
/*      */   public int cP;
/*      */   public float cQ;
/*      */   public float cR;
/*      */   public float cS;
/*      */   public static strictfp void a(Paint paramPaint) { a(paramPaint, false); }
/*      */   public static strictfp void a(Paint paramPaint, boolean paramBoolean) { if (!l.al()) if (paramBoolean) paramPaint.a(0.0F);   }
/*      */   static { cy.a(Paint.Style.b); cy.a(2.0F); a(cy); cz.a(180, 0, 255, 0); cz.a(Paint.Style.b); cz.a(2.0F); a(cz, true); cA.a(180, 0, 255, 0); cA.a(Paint.Style.b); cA.a(2.0F); a(cA); cB.a(130, 0, 255, 0); cB.a(Paint.Style.b); cB.a(2.0F); a(cB); cF.a(70, 0, 255, 0); cF.a(Paint.Style.b); cF.a(1.0F); a(cF); cC.a(180, 255, 0, 0); cC.a(Paint.Style.b); cC.a(2.0F); a(cC); cG.a(70, 255, 0, 0); cG.a(Paint.Style.b); cG.a(1.0F); a(cG); cE.a(180, 255, 255, 0); cE.a(Paint.Style.b); cE.a(2.0F); a(cE); cH.a(70, 255, 255, 0); cH.a(Paint.Style.b); cH.a(1.0F); a(cH); cD.a(180, 255, 255, 255); cD.a(Paint.Style.b); cD.a(2.0F); a(cD); cI.a(90, 235, 235, 235); cI.a(Paint.Style.b); cI.a(1.0F); a(cI); cJ.a(100, 235, 235, 235); cJ.a(Paint.Style.b); cJ.a(2.0F); a(cJ); cK.a(90, 235, 0, 0); cK.a(Paint.Style.b); cK.a(1.0F); a(cK); cL.a(Paint.Style.b); cM.a(Paint.Style.b); }
/*      */   static final RectF cT = new RectF();
/*      */   public strictfp float f(boolean paramBoolean) { return this.bL + 90.0F; }
/*      */   public final strictfp boolean bG() { if (this.cp != null) return false;  return (this.bR >= 1.0F); }
/*      */   public strictfp float a_() { if (this.bY < this.bZ) return this.bY / this.bZ;  return -1.0F; }
/*      */   public strictfp float bH() { if (this.bR < 1.0F) if (this.cq == null || this.cq.bR >= 1.0F) return this.bR;   return -1.0F; }
/*      */   public strictfp float bI() { return -1.0F; }
/*      */   public strictfp boolean bJ() { return false; }
/*      */   public strictfp int bK() { return -1; } public strictfp int bL() { return -1; } static Paint cU = new Paint(); public strictfp void a(float paramFloat, boolean paramBoolean) { if (this.bz || this.cp != null) return;  l l = l.u(); if (paramBoolean) return;  boolean bool = false; int j = bK(); if (bH() >= 0.0F) bool = true;  if (bI() >= 0.0F) bool = true;  if (this.ci || l.by.showHp) { if (a_() >= 0.0F) bool = true;  if (j >= 0) bool = true;  }  if (!bool) return;  float f1 = this.dH - l.cd; float f2 = this.dI - l.ce - this.dJ; float f3 = this.bO + 4.0F; byte b1 = 120; char c1 = 'È'; byte b2 = 4; float f4 = 2.0F * this.bO; if (l.cE < 1.0F) { l.bw.j(); l.L(); f1 *= l.cE; f2 *= l.cE; f3 *= l.cE; }  float f5 = 3.0F; if (this.ci || l.by.showHp) { if (a_() >= 0.0F) { boolean bool1 = false; boolean bool2 = false; i i1 = cV(); if (i1 != null) { bool1 = i1.p; bool2 = i1.q; }  if (!bool2) { int k, n; if (l.bb.c(this.bB)) { k = f.b(200, 183, 44, 44); n = f.b(120, 255, 60, 60); } else { k = f.b(200, 0, 150, 0); n = f.b(120, 0, 230, 0); }  Paint paint1 = y.a(k, Paint.Style.a); Paint paint2 = y.a(n, Paint.Style.b); byte b = b2; if (bool1) b = 1;  cT.a(f1 - this.bO, f2 + f3, f1 - this.bO + f4 * a_(), f2 + f3 + b); l.bw.a(cT, paint1); cT.a(f1 - this.bO, f2 + f3, f1 - this.bO + f4, f2 + f3 + b); l.bw.a(cT, paint2); }  }  if (j >= 0) { int k = bL(); float f6 = f4; if (k > 10) f6 += 20.0F;  float f7 = f1 - f6 / 2.0F; float f8 = (int)(f6 / k + 0.5F); float f9 = f8 - 2.0F; float f10 = 3.0F; for (byte b = 1; b <= k; b++) { float f = f7 + (b - 1) * f8; cT.a(f, f2 + f3 + f5, f + f9, f2 + f3 + f5 + 3.0F); if (j >= b) l.bw.a(cT, y.a(240, 0, 0, 255, Paint.Style.a));  l.bw.a(cT, y.a(110, 0, 0, 210, Paint.Style.b)); }  f5 += 5.0F; }  }  if (bI() >= 0.0F) { int n; byte b = b2; b2 = 2; int k = b2 + 1; boolean bool1 = bJ(); cT.a(f1 - this.bO, f2 + f3 + k + f5, f1 - this.bO + f4 * bI(), f2 + f3 + k + b2 + f5); if (bool1) { n = f.b(185, 103, 117, 119); } else { n = f.b(200, 23, 179, 207); }  l.bw.a(cT, y.a(n, Paint.Style.a)); cT.a(f1 - this.bO, f2 + f3 + k + f5, f1 - this.bO + f4, f2 + f3 + k + b2 + f5); if (bool1) { n = f.b(105, 123, 182, 193); } else { n = f.b(120, 45, 211, 241); }  l.bw.a(cT, y.a(n, Paint.Style.b)); f5 += b2; b2 = b; }  if (bH() >= 0.0F) { int k = b2 + 1; cT.a(f1 - this.bO, f2 + f3 + k + f5, f1 - this.bO + f4 * bH(), f2 + f3 + k + b2 + f5); l.bw.a(cT, y.a(200, 0, 0, 150, Paint.Style.a)); cT.a(f1 - this.bO, f2 + f3 + k + f5, f1 - this.bO + f4, f2 + f3 + k + b2 + f5); l.bw.a(cT, y.a(120, 0, 0, 230, Paint.Style.b)); f5 += b2; }  if (l.cE < 1.0F) l.bw.k();  } public strictfp void d(float paramFloat) {} static Paint cV = new Paint(); public strictfp void o(float paramFloat) { if (this.bz || this.cp != null) return;  if (this.ci) { l l = l.u(); if (this.bB == l.bb || l.bA.m(this)) { if (l.by.showUnitWaypoints) if (l.dd <= 40) { l.dd++; N(); }   bM(); }  if (y.a(this)) bN();  }  } public strictfp void bM() {} public strictfp void N() { l l = l.u(); an an1 = null; an an2 = null; if (this instanceof r) { r r1 = (r)this; int j = r1.at(); float f1 = this.dH; float f2 = this.dI; for (byte b = 0; b < j; b++) { an an = r1.k(b); if (an != null) { if (l.al()) { cU.a(2.0F); } else { cU.a(0.0F); }  char c1 = ' '; if (an.d() == ao.b) { cU.b(Color.a(c1, 180, 0, 0)); } else if (an.d() == ao.h) { cU.b(Color.a(c1, 180, 180, 0)); } else if (an.d() == ao.c) { cU.b(Color.a(c1, 0, 0, 180)); } else if (an.d() == ao.d) { cU.b(Color.a(c1, 0, 0, 180)); } else if (an.d() == ao.e || an.d() == ao.i) { cU.b(Color.a(c1, 0, 180, 180)); } else if (an.d() == ao.g) { cU.b(Color.a(c1, 180, 0, 42)); } else if (an.d() == ao.k || an.d() == ao.l) { cU.b(Color.a(c1, 97, 20, 229)); } else if (an.d() == ao.j) { cU.b(Color.a(c1, 0, 210, 210)); if (an1 == null) { an1 = an; } else { an2 = an; }  } else { cU.b(Color.a(c1, 0, 180, 0)); }  float f3 = an.g(); float f4 = an.h(); af af1 = an.i(); if (af1 != null && an.f()) if (!af1.bw()) if (!af1.b(l.bb)) { float f5 = 400.0F; float f6 = f.d(f1, f2, f3, f4); f3 = f1 + f.i(f6) * f5; f4 = f2 + f.h(f6) * f5; }    l.bw.a(f1 - l.cd, f2 - l.ce, f3 - l.cd, f4 - l.ce, cU); boolean bool = false; if (bool) { float f5 = f.b(f1, f2, f3, f4); float f6 = f.d(f1, f2, f3, f4); float f7 = l.bA.aM * f5; float f8 = f1 + f.i(f6) * f7; float f9 = f2 + f.h(f6) * f7; cT.a(f8 - 1.0F, f9 - 1.0F, f8 + 1.0F, f9 + 1.0F); cT.a(-l.cd, -l.ce); l.bw.a(cT, cU); }  f1 = f3; f2 = f4; }  }  }  if (an1 != null && an2 != null) if (an1 != an2) { cU.b(Color.a(50, 0, 210, 210)); float f1 = an2.g(); float f2 = an2.h(); an an = an1; l.bw.a(f1 - l.cd, f2 - l.ce, an.g() - l.cd, an.h() - l.ce, cU); }   } public strictfp void bN() {} public strictfp void e(float paramFloat) { boolean bool = false; if (this.cl != 0.0F) { this.cl = f.a(this.cl, paramFloat); if (this.cl % 15.0F < 7.0F) bool = true;  }  if (this.ci || bool) { Paint paint; l l = l.u(); float f1 = this.dH - l.cd; float f2 = this.dI - l.ce - this.dJ; if (l.bb == this.bB) { if (this.bP < 8.0F) { paint = cz; } else { paint = cA; }  } else if (l.bb.c(this.bB)) { paint = cC; } else if (this.bB != null && l.bJ.h()) { cy.b(m.m(this.bB.o)); paint = cy; } else { paint = cE; }  if (bool) paint = cD;  if (bw()) { if (paint == cA) paint = cB;  Rect rect = bQ(); if (rect != null) { cT.a(rect); cT.b *= l.bt.l; cT.d *= l.bt.l; cT.a *= l.bt.k; cT.c *= l.bt.k; float f3 = cJ(); cT.a(-(cH() - l.bt.m), -(cI() - l.bt.n)); f.a(cT, f3); cT.a(f1, f2); float f4 = 11.0F; l.bw.a(cT.a - f4, cT.b, cT.c + f4, cT.b, paint); l.bw.a(cT.a - f4, cT.d, cT.c + f4, cT.d, paint); l.bw.a(cT.a, cT.b - f4, cT.a, cT.d + f4, paint); l.bw.a(cT.c, cT.b - f4, cT.c, cT.d + f4, paint); }  } else { float f = this.bP + l.bA.r(this); if (l.a(f1, f2, f)) l.bw.a(f1, f2, f, paint);  }  }  } public strictfp boolean c(float paramFloat) { return true; } public static final RectF cW = new RectF(); public static final Rect cX = new Rect(); static final Rect cY = new Rect(); public strictfp Rect bO() { return cY; } public strictfp Rect bP() { return cY; } public strictfp Rect bQ() { return bO(); } public strictfp e v() { return null; } public strictfp boolean f(float paramFloat) { e e = v(); if (e == null) return false;  if (this.bz) return true;  l l = l.u(); l.bw.k(); float f1 = (int)(this.dH - l.cd); float f2 = (int)(this.dI - l.ce); f1 *= l.cE; f2 *= l.cE; Paint paint = null; if (this.ci) { paint = bo; } else { paint = bn; }  l.bw.a(e, f1, f2, paint); l.bw.j(); l.K(); return true; } public strictfp boolean a(l paraml) { if (!paraml.cv.b(this.dH, this.dI)) return false;  if (this.cp != null) return false;  if (this.cr != null) if (this.cr.I || this.cr.C) return false;   if (!b(paraml.bb)) return false;  return true; } public strictfp boolean b_() { return true; } public final strictfp boolean bR() { l l = l.u(); return b(l.bb); } public strictfp boolean b(m paramm) { l l = l.u(); b b = l.bt; if ((this.bB != paramm || this.cq != null) && b.A && paramm.C != null) { b.a(this.dH, this.dI); int j = b.M; int k = b.N; if (b.c(j, k) && paramm.C[j][k] >= 5) return false;  }  return true; } public strictfp boolean bS() { return true; } public strictfp void c_() { if (this.bz) { this.by = false; return; }  this.by = true; } public strictfp void a(float paramFloat) { if (!this.bz) { if (this.ca > 0.0F) { if (this.ca > this.bZ * 2.0F) this.ca = this.bZ * 2.0F;  this.ca = f.a(this.ca, paramFloat); }  if (this.bY < this.bZ * 0.33F && this.dJ > -1.0F) { l l = l.u(); this.cQ += paramFloat; this.cR += paramFloat; this.cS += paramFloat; if (this.cQ > 10.0F && this.cR < 300.0F && !cT()) { this.cQ = 0.0F; if (this.dE && l.cK) { e e = l.bz.b(this.dH, this.dI, this.dJ, d.a, false, h.a); if (e != null) { f.b(e, true); e.J = this.dH; e.K = this.dI; e.L = this.dJ; e.Q += f.c(-0.1F, 0.1F) + this.bH; e.R += f.c(-0.1F, 0.1F) + this.bI; e.J += f.c(-4.0F, 4.0F); e.K += f.c(-4.0F, 4.0F); }  }  }  if (this.cS > 30.0F && this.cR < 600.0F && !cU()) { this.cS = 0.0F; l.bz.a(); e e = l.bz.b(this.dH, this.dI, this.dJ, d.a, false, h.a); if (e != null) { f.a(e, true); e.J = this.dH; e.K = this.dI; e.L = this.dJ; e.Q += f.c(-0.1F, 0.1F); e.R += f.c(-0.1F, 0.1F); e.J += f.c(-4.0F, 4.0F); e.K += f.c(-4.0F, 4.0F); }  }  } else if (this.cR != 0.0F) { this.cR = 0.0F; }  if (this.bY <= 0.0F) bT();  }  } public strictfp float b(af paramaf, float paramFloat, f paramf) { float f1 = paramFloat; float f2 = 1.0F; float f3 = 1.0F; float f4 = 1.0F; if (paramf != null) { f2 = paramf.ak; f3 = paramf.al; f4 = paramf.am; }  if (this.cb < this.ce) { float f5 = this.ce - this.cb; float f6 = f1 * f2; if (f5 > f6) { this.cb += f6; f1 -= f6 * f3; } else { this.cb = this.ce; f1 -= f6 * f3; }  }  if (f1 > 0.0F) if (this.bY < this.bZ) { float f5 = f1 * f4; float f6 = this.bZ - this.bY; if (f6 > f5) { this.bY += f5; f1 = 0.0F; } else { this.bY = this.bZ; f1 -= f6; }  }   return 0.0F; } public strictfp boolean J() { return false; } public strictfp float a(af paramaf, float paramFloat, f paramf) { l l = l.u(); if (this.bR < 1.0F) paramFloat *= 1.75F;  float f1 = 1.0F; float f2 = 1.0F; float f3 = 1.0F; if (paramf != null) { f1 = paramf.ak; f2 = paramf.al; f3 = paramf.am; }  float f4 = paramFloat; float f5 = 0.0F; if (this.cd == 0.0F) if (this.cb > 0.0F) { float f6 = f4 * f1; if (this.cb < f6) { f4 -= this.cb * f2; f5 += this.cb; this.cc += this.cb; this.cb = 0.0F; } else { this.cb -= f6; this.cc += f6; f5 += f6; f4 -= f4 * f2; }  }   if (f4 > 0.0F) { float f6 = f4 * f3; if (this.bY < f6) { f4 -= this.bY; f5 += this.bY; this.bY = 0.0F; } else { this.bY -= f6; f5 += f6; f4 -= f6; }  }  this.bd = l.bh; if (paramaf != null) { this.be = paramaf; } else { this.be = null; }  bT(); return f4; } public strictfp af p(float paramFloat) { l l = l.u(); if (l.bh - paramFloat * 1000.0F < this.bd)
/*  834 */       return this.be;  return null; } protected strictfp af(boolean paramBoolean) { super(paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  921 */     this.br = false;
/*  922 */     this.bs = false;
/*      */ 
/*      */     
/*  925 */     this.bt = false;
/*  926 */     this.bu = false;
/*      */ 
/*      */     
/*  929 */     this.bv = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  934 */     this.by = true;
/*      */     
/*  936 */     this.bz = false;
/*  937 */     this.bA = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  945 */     this.bD = 0.0F;
/*  946 */     this.bE = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  957 */     this.bG = false;
/*      */ 
/*      */     
/*  960 */     this.bH = 0.0F;
/*  961 */     this.bI = 0.0F;
/*      */     
/*  963 */     this.bJ = 0.0F;
/*      */     
/*  965 */     this.bK = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  977 */     this.bR = 1.0F;
/*      */ 
/*      */     
/*  980 */     this.bS = false;
/*  981 */     this.bT = false;
/*      */     
/*  983 */     this.bU = false;
/*  984 */     this.bV = false;
/*      */     
/*  986 */     this.bW = false;
/*  987 */     this.bX = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1011 */     this.cj = -9999;
/*      */ 
/*      */     
/* 1014 */     this.cl = 0.0F;
/*      */     
/* 1016 */     this.cm = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1184 */     this.cp = null;
/*      */     
/* 1186 */     this.cq = null;
/*      */     
/* 1188 */     this.cr = null;
/*      */ 
/*      */ 
/*      */     
/* 1192 */     this.cs = -9999;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1248 */     this.cN = -1;
/* 1249 */     this.cO = -1;
/* 1250 */     this.cP = -99;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1256 */     this.cS = 70.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3948 */     this.dj = new d();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3961 */     this.dk = new c(); bF(); if (!paramBoolean) { this.bq = true; bj.a(this); a.a(this); }  this.bf = (l.u()).bh; this.db = r(); }
/*      */   public strictfp void bT() { if (!this.bz && this.bY <= 0.0F) bq();  }
/*      */   public strictfp void n() {}
/*      */   public strictfp boolean e() { l l = l.u(); l.bz.b(this.dH, this.dI, this.dJ); return false; }
/* 3965 */   public strictfp void bp() { l l = l.u(); l.bA.l(this); m.a(this); if (bj.remove(this)); this.bz = true; this.bA = l.bh; if (this.cn != null) { int j = bg(); for (byte b = 0; b < j; b++) (this.cn[b]).j = null;  }  l.bK.a(this); } public strictfp void bU() { bp(); a(); } public strictfp void bq() { bp(); if (!e()) a();  } public strictfp boolean a(RectF paramRectF) { if (this.dH + this.bO > paramRectF.a && this.dH - this.bO < paramRectF.c && this.dI + this.bO > paramRectF.b && this.dI - this.bO < paramRectF.d) return true;  return false; } public final strictfp boolean c(float paramFloat1, float paramFloat2, float paramFloat3) { float f1 = f.a(this.dH, this.dI, paramFloat1, paramFloat2); float f2 = this.bO + paramFloat3; if (f1 < f2 * f2) return true;  return false; } public strictfp boolean r(af paramaf) { float f1 = f.a(this.dH, this.dI, paramaf.dH, paramaf.dI); float f2 = this.bO + paramaf.bO; if (f1 < f2 * f2) return true;  return false; } public final strictfp void O(int paramInt) { m m1 = m.n(paramInt); if (m1 == null) throw new f("Could not find team with id: " + paramInt);  c(m1); } public strictfp void c(m paramm) { if (this.bB == paramm) return;  if (paramm == null) throw new RuntimeException("Could not set team to null");  if (this.bB != null) { m.b(this); this.bB.d(this); }  a(paramm); m.c(this); if (paramm != m.g) c(false);  } public strictfp void a(m paramm) { if (paramm == null) throw new RuntimeException("Could not set team to null");  this.bB = paramm; } public final strictfp void P(int paramInt) { this.bB = m.n(paramInt); if (this.bB == null) throw new f("Could not find team with id: " + paramInt);  a(this.bB); } static final ArrayList cZ = new ArrayList(); public strictfp ArrayList M() { return cZ; } public strictfp int T() { return 1; } public strictfp void a(s params, boolean paramBoolean) {} public strictfp void a(s params, boolean paramBoolean, PointF paramPointF, af paramaf) { a(params, paramBoolean); } public strictfp void b(s params, boolean paramBoolean) {} public strictfp void b(s params) {} public strictfp s a(c paramc) { ArrayList<s> arrayList = M(); byte b; int j; for (b = 0, j = arrayList.size(); b < j; b++) { s s = arrayList.get(b); if (s.d(paramc)) return s;  }  return null; } public strictfp boolean bV() { if (bw()) return s.c(bX());  return false; } public strictfp boolean bW() { return false; } public strictfp c cO() { return this.dk; } public strictfp c bX() { return s.h; } public strictfp float bY() { return -1.0F; } public strictfp boolean bZ() { return false; } static ArrayList da = new ArrayList(); public al db; public strictfp void a(ArrayList paramArrayList) { paramArrayList.clear(); } public strictfp c ca() { return s.h; } public strictfp s e(al paramal) { return null; } public final strictfp int cb() { byte b = 0; for (s s : M()) { if (s.a(this) || s.o()) b++;  }  return b; } public strictfp boolean c(af paramaf, boolean paramBoolean) { af af1 = paramaf.cp; r r1 = paramaf.cq; paramaf.cp = null; paramaf.cq = null; boolean bool = d(paramaf, paramBoolean); paramaf.cp = af1; paramaf.cq = r1; return bool; } public strictfp boolean d(af paramaf, boolean paramBoolean) { return false; } public strictfp boolean e(af paramaf, boolean paramBoolean) { return false; } public strictfp boolean cc() { return false; } public strictfp boolean cd() { return i(); } public strictfp boolean ce() { return false; } public strictfp boolean cf() { return false; } public strictfp boolean O() { return false; } public strictfp int cg() { return 1; } public strictfp int y() { return 85; } public strictfp float f(al paramal) { int j = paramal.a(this) + y(); return j; } public strictfp int s(af paramaf) { return y() + paramaf.r().a(this); } public strictfp int t(af paramaf) { return y() + paramaf.r().a(this); } public strictfp boolean u(af paramaf) { return false; } public strictfp boolean v(af paramaf) { return false; } public strictfp float b(af paramaf) { return 1.0F; } public strictfp float c(af paramaf) { return 0.2F; } public strictfp float ch() { return 1.0F; } public strictfp float ci() { return 0.0F; } public strictfp d cj() { float f = ci(); if (f == 0.0F) return d.a;  d d1 = new d(); d1.b(a.l, f); return d1; } public strictfp d ck() { return d.a; } public strictfp String cl() { return r().i() + "(id:" + this.dA + ")"; } public strictfp String cm() { return r().i() + "(id:" + this.dA + ", hp:" + this.bY + ", dead:" + this.bz + ", deleted:" + this.dC + " tags:" + cM() + ")"; } static final RectF dc = new RectF(); static final RectF dd = new RectF(); static final Rect de = new Rect(); public strictfp float cn() { return 1.0F; } public strictfp RectF co() { l l = l.u(); float f = cn(); dc.a(this.dH - this.dN * f - l.cd, this.dI - this.dO * f - l.ce, this.dH + this.dN * f - l.cd, this.dI + this.dO * f - l.ce); return dc; } public strictfp RectF cp() { l l = l.u(); dc.a(this.dH - this.dN - l.cd, this.dI - this.dO - l.ce, this.dH + this.dN - l.cd, this.dI + this.dO - l.ce); return dc; } public strictfp boolean cq() { return false; } public strictfp Rect a_(boolean paramBoolean) { byte b1 = 0; byte b2 = 0; de.a(b1, b2, b1 + this.dL, b2 + this.dM); return de; } public strictfp Rect a(boolean paramBoolean, int paramInt) { int j = 0; byte b = 0; j += paramInt * this.dL; de.a(j, b, j + this.dL, b + this.dM); return de; } public strictfp Rect a(boolean paramBoolean, int paramInt1, int paramInt2) { int j = paramInt1 * this.dL; int k = paramInt2 * this.dM; de.a(j, k, j + this.dL, k + this.dM); return de; } public strictfp boolean a(af paramaf, float paramFloat) { return false; } public strictfp void a_(String paramString) {} public final strictfp boolean cr() { if (!ct() || this.dJ > 2.0F) return false;  return true; } public strictfp boolean cs() { return y.a(this.dH, this.dI); } public strictfp boolean ct() { return y.b(this.dH, this.dI); } public strictfp boolean cu() { return y.c(this.dH, this.dI); } public strictfp int br() { int j = 0; j = j * 31 + (int)bB(); j = j * 31 + (int)this.bZ; return j; } public strictfp g cv() { return r().d(T()); } public strictfp g cw() { return null; } static final PointF df = new PointF(); public strictfp PointF a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) { float f1 = 0.0F; if (paramFloat3 > 0.1D) if (this.cm) { float f = 1.0F / paramFloat3; for (byte b = 0; b < 3; b++) { PointF pointF1 = m(f1); float f3 = f.b(paramFloat1, paramFloat2, pointF1.a, pointF1.b); f1 = f3 * f; }  }   if (f1 > paramFloat4) f1 = paramFloat4;  PointF pointF = m(f1); float f2 = f.a(paramFloat1, paramFloat2, pointF.a, pointF.b); if (paramFloat5 >= 0.0F && paramFloat5 * paramFloat5 < f2) { float f = f.d(paramFloat1, paramFloat2, pointF.a, pointF.b); pointF.a = paramFloat1 + f.i(f) * paramFloat5; pointF.b = paramFloat2 + f.h(f) * paramFloat5; }  df.a(pointF); return df; } static final PointF dg = new PointF(); ag[] dh; strictfp PointF m(float paramFloat) { dg.a(this.dH + this.bH * paramFloat, this.dI + this.bI * paramFloat); return dg; } public strictfp boolean o() { return false; } public strictfp boolean p() { return false; } public strictfp void d(m paramm) { if (p()) { a(m.g); return; }  a(paramm); } public strictfp void cx() {} public strictfp void cy() {} public strictfp float g() { return 0.0F; } public strictfp int cz() { return Integer.MAX_VALUE; } public strictfp i cA() { return null; } public strictfp boolean w(af paramaf) { return false; } public strictfp boolean x(af paramaf) { return w(paramaf); } public strictfp int cB() { return 500; } public strictfp boolean c(r paramr) { int j = cz(); if (j < Integer.MAX_VALUE) { int k = d(paramr); if (k >= j) return true;  }  return false; } public strictfp int d(r paramr) { byte b1 = 0; m m1 = paramr.bB; af[] arrayOfAf = bj.a(); byte b2; int j; for (b2 = 0, j = bj.size(); b2 < j; b2++) { af af1 = arrayOfAf[b2]; if (af1.bB == m1) if (af1 instanceof r) { r r1 = (r)af1; an an = r1.ap(); if (an != null && an.d() == ao.g) if (an.h == this && af1 != paramr) b1++;   }   }  return b1; } public strictfp int e(r paramr) { byte b1 = 0; m m1 = paramr.bB; af[] arrayOfAf = bj.a(); byte b2; int j; for (b2 = 0, j = bj.size(); b2 < j; b2++) { af af1 = arrayOfAf[b2]; if (af1.bB == m1) if (af1 instanceof r) { r r1 = (r)af1; an an = r1.ap(); if (an != null && an.d() == ao.d) if (an.h == this && af1 != paramr) b1++;   }   }  return b1; } public strictfp int bg() { return 1; } public strictfp boolean o_() { return false; } public strictfp boolean cC() { return (o_() || this.bR < 1.0F || this.bB == m.f); } public strictfp boolean t() { return false; } public strictfp boolean cD() { return t(); } public strictfp boolean cE() { return false; } public strictfp boolean d(af paramaf) { return true; } public strictfp void e(m paramm) { if (this.dh == null || this.dh.length != m.a) { this.dh = new ag[m.a]; for (byte b = 0; b < this.dh.length; b++) this.dh[b] = new ag();  }  ag ag1 = this.dh[paramm.i]; if (this.bz) { if (ag1.a) { boolean bool = b(paramm); if (bool) ag1.a = false;  }  } else { boolean bool = b(paramm); if (bool) { ag1.a = true; ag1.b = T(); }  }  } public strictfp void cF() { l l = l.u(); if (l.bb != null && this.bB != l.bb) if (l.bb.i >= 0 && l.bb.i < m.a) { ag ag1 = this.dh[l.bb.i]; if (ag1.c != null) if (ag1.c.c) ag1.c = null;   if (ag1.c == null) if (ag1.a) { boolean bool = b(l.bb); if (!bool) { a a = new a(); ag1.c = a; a.d = r(); a.g = this.dH; a.h = this.dI; a.n = false; a.e = this.bB; a.f = ag1.b; a.j = l.bb; a.u = b_(); a.v = this; }  }   }   } static final PointF di = new PointF(); final d dj; public c dk; public strictfp PointF cG() { di.a(0.0F, 0.0F); return di; } public strictfp float cH() { return (l.u()).bt.m; } public strictfp float cI() { return (l.u()).bt.n; }
/*      */   public strictfp float cJ() { l l = l.u(); return (l.bt.m + 2) + l.bA.r(this); }
/*      */   public strictfp Point a(b paramb, Point paramPoint) { paramPoint.a = (int)((this.dH - cH() + 1.0F) * paramb.o); paramPoint.b = (int)((this.dI - cI() + 1.0F) * paramb.p); return paramPoint; }
/*      */   public strictfp RectF a(b paramb, RectF paramRectF) { int j = (int)((this.dH - cH() + 1.0F) * paramb.o); int k = (int)((this.dI - cI() + 1.0F) * paramb.p); paramb.a(j, k); float f1 = paramb.M; float f2 = paramb.N; Rect rect = bP(); paramRectF.a(f1 + (rect.a * paramb.k), f2 + (rect.b * paramb.l), f1 + ((rect.c + 1) * paramb.k), f2 + ((rect.d + 1) * paramb.l)); return paramRectF; }
/*      */   public strictfp void cK() {}
/*      */   public strictfp boolean cL() { return false; }
/*      */   public strictfp boolean q() { return false; }
/*      */   public strictfp i cM() { return null; }
/*      */   public strictfp d cN() { return this.dj; }
/*      */   public strictfp double a(a parama) { return this.dj.a(parama); }
/* 3975 */   public strictfp i cP() { return null; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float aY() {
/* 3981 */     return 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void cQ() {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void cR() {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cS() {
/* 3998 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cT() {
/* 4004 */     return bC();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean cU() {
/* 4010 */     return bC();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp i cV() {
/* 4017 */     return this.cr;
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
/*      */   public strictfp String toString() {
/* 4031 */     return "unit(id=" + this.dA + ",type=" + r().i() + ")";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void q(float paramFloat) {
/* 4037 */     if (paramFloat >= 1.0F) {
/*      */       
/* 4039 */       boolean bool = (this.bR >= 1.0F) ? true : false;
/*      */       
/* 4041 */       if (!bool)
/*      */       {
/* 4043 */         m.b(this);
/* 4044 */         this.bR = 1.0F;
/* 4045 */         m.c(this);
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 4054 */       boolean bool = (this.bR >= 1.0F) ? true : false;
/*      */       
/* 4056 */       if (bool) {
/*      */         
/* 4058 */         m.b(this);
/* 4059 */         this.bR = paramFloat;
/* 4060 */         m.c(this);
/*      */       }
/*      */       else {
/*      */         
/* 4064 */         this.bR = paramFloat;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(ab paramab) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void h(float paramFloat) {
/* 4078 */     this.bL = paramFloat;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int cW() {
/* 4084 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp m g(boolean paramBoolean) {
/* 4095 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(int paramInt1, int paramInt2) {
/* 4101 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(boolean paramBoolean) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float cX() {
/* 4114 */     return this.bO;
/*      */   }
/*      */   
/*      */   public abstract ah h();
/*      */   
/*      */   public abstract boolean i();
/*      */   
/*      */   public abstract boolean P();
/*      */   
/*      */   public abstract boolean ah();
/*      */   
/*      */   public abstract boolean ai();
/*      */   
/*      */   public abstract boolean j();
/*      */   
/*      */   public abstract al r();
/*      */   
/*      */   public abstract boolean l();
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
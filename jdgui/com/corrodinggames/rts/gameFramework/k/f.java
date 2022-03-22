/*      */ package com.corrodinggames.rts.gameFramework.k;
/*      */ 
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Typeface;
/*      */ import com.corrodinggames.rts.game.a.a;
/*      */ import com.corrodinggames.rts.game.b.a;
/*      */ import com.corrodinggames.rts.game.b.i;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.custom.ag;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.b.c;
/*      */ import com.corrodinggames.rts.gameFramework.b.g;
/*      */ import com.corrodinggames.rts.gameFramework.bi;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.l;
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
/*      */ public class f
/*      */   extends bi
/*      */ {
/*      */   public static boolean a = false;
/*      */   int b;
/*      */   int c;
/*      */   m d;
/*      */   l e;
/*      */   
/*      */   public void a(String paramString) {
/*   59 */     l.b("MissionEngine", "Map warning: " + paramString);
/*   60 */     ad.a(null, "Map error: " + paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ap paramap) {
/*   66 */     paramap.a(this.j);
/*      */     
/*   68 */     paramap.a(this.r);
/*   69 */     paramap.a(this.u);
/*   70 */     paramap.a(this.v);
/*   71 */     paramap.a(this.w);
/*   72 */     paramap.a(this.x);
/*      */ 
/*      */     
/*   75 */     paramap.a(this.z);
/*   76 */     paramap.a(this.A);
/*   77 */     paramap.a(this.B);
/*      */     
/*   79 */     paramap.a(this.m);
/*      */ 
/*      */     
/*   82 */     paramap.a(6);
/*      */ 
/*      */     
/*   85 */     paramap.a(this.J.size());
/*      */     
/*   87 */     for (a a : this.J) {
/*      */       
/*   89 */       paramap.c(a.c);
/*   90 */       paramap.a(a.j);
/*      */ 
/*      */       
/*   93 */       paramap.a(a.k);
/*   94 */       paramap.a(a.l);
/*      */ 
/*      */       
/*   97 */       paramap.a(a.m);
/*      */ 
/*      */       
/*  100 */       paramap.a(a.n);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  106 */     paramap.a(this.y);
/*      */ 
/*      */     
/*  109 */     paramap.a(this.l);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(k paramk) {
/*  117 */     this.j = paramk.e();
/*      */     
/*  119 */     this.r = paramk.f();
/*  120 */     this.u = paramk.f();
/*  121 */     this.v = paramk.f();
/*  122 */     this.w = paramk.f();
/*  123 */     this.x = paramk.f();
/*      */ 
/*      */     
/*  126 */     this.z = paramk.g();
/*  127 */     this.A = paramk.g();
/*  128 */     this.B = paramk.g();
/*      */     
/*  130 */     this.m = paramk.e();
/*      */     
/*  132 */     int i = paramk.f();
/*      */     
/*  134 */     if (i >= 1) {
/*      */       
/*  136 */       int j = paramk.f();
/*  137 */       for (byte b = 0; b < j; b++) {
/*      */         
/*  139 */         String str = paramk.k();
/*  140 */         boolean bool1 = paramk.e();
/*      */         
/*  142 */         int n = 0;
/*  143 */         int i1 = 0;
/*  144 */         boolean bool2 = false;
/*  145 */         int i2 = 0;
/*      */         
/*  147 */         if (i >= 2) {
/*      */           
/*  149 */           n = paramk.f();
/*  150 */           i1 = paramk.f();
/*      */         } 
/*      */         
/*  153 */         if (i >= 3)
/*      */         {
/*  155 */           bool2 = paramk.e();
/*      */         }
/*      */         
/*  158 */         if (i >= 4)
/*      */         {
/*  160 */           i2 = paramk.f();
/*      */         }
/*      */         
/*  163 */         a a = e(str);
/*  164 */         if (a == null) {
/*      */           
/*  166 */           l.b("MissionEngine:readIn: Could not find saved trigger:" + str + " for de/activation");
/*      */         }
/*      */         else {
/*      */           
/*  170 */           a.j = bool1;
/*  171 */           a.k = n;
/*  172 */           a.l = i1;
/*  173 */           a.m = bool2;
/*  174 */           a.n = i2;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  179 */     if (i >= 5)
/*      */     {
/*  181 */       this.y = paramk.f();
/*      */     }
/*      */     
/*  184 */     if (i >= 6) {
/*      */       
/*  186 */       this.l = paramk.e();
/*      */     }
/*      */     else {
/*      */       
/*  190 */       this.l = true;
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
/*  218 */   l f = l.b;
/*      */ 
/*      */   
/*  221 */   public ArrayList g = new ArrayList();
/*      */   
/*      */   public ag h;
/*      */   
/*      */   boolean i;
/*      */   
/*      */   boolean j;
/*      */   
/*      */   public boolean k;
/*      */   
/*      */   public boolean l;
/*      */   
/*      */   boolean m;
/*      */   
/*      */   boolean n;
/*      */   
/*      */   boolean o;
/*      */   
/*      */   boolean p;
/*      */   
/*      */   public boolean q;
/*      */   
/*  243 */   public int r = 0;
/*  244 */   String s = null;
/*      */   
/*  246 */   String t = null;
/*      */ 
/*      */   
/*  249 */   int u = 0;
/*      */   
/*  251 */   int v = 2;
/*  252 */   int w = 1;
/*      */   
/*  254 */   int x = 0;
/*      */ 
/*      */   
/*  257 */   public int y = 0;
/*      */ 
/*      */ 
/*      */   
/*  261 */   float z = 3000.0F;
/*  262 */   float A = 0.0F;
/*  263 */   float B = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  268 */   h C = h.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  278 */   ArrayList D = new ArrayList();
/*      */ 
/*      */   
/*      */   public Paint E;
/*      */ 
/*      */   
/*      */   public Paint F;
/*      */ 
/*      */   
/*      */   public Paint G;
/*      */ 
/*      */   
/*      */   public Paint H;
/*      */ 
/*      */   
/*      */   final boolean I = true;
/*      */ 
/*      */   
/*      */   public void b(String paramString) {
/*  297 */     l.b("MissionEngine:triggerLog", paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a() {
/*  305 */     return this.n;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/*  310 */     return this.o;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {
/*  318 */     l l1 = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  323 */     this.q = false;
/*      */ 
/*      */     
/*  326 */     this.b = l1.bh - 1000;
/*      */     
/*  328 */     this.c = l1.bh - 1000;
/*      */ 
/*      */     
/*  331 */     this.E = new Paint();
/*  332 */     this.E.a(255, 255, 255, 255);
/*      */     
/*  334 */     this.E.a(true);
/*  335 */     this.E.a(Paint.Align.b);
/*  336 */     this.E.a(Typeface.a(Typeface.c, 1));
/*      */     
/*  338 */     l1.a(this.E, 24.0F);
/*      */ 
/*      */     
/*  341 */     this.G = new Paint();
/*  342 */     this.G.a(255, 255, 255, 255);
/*  343 */     this.G.a(true);
/*  344 */     this.G.a(Paint.Align.b);
/*  345 */     l1.a(this.G, 18.0F);
/*      */ 
/*      */ 
/*      */     
/*  349 */     this.H = new Paint();
/*  350 */     this.H.a(255, 255, 255, 255);
/*  351 */     this.H.a(true);
/*  352 */     this.H.a(Paint.Align.b);
/*  353 */     l1.a(this.H, 14.0F);
/*      */ 
/*      */     
/*  356 */     this.F = new Paint();
/*  357 */     this.F.a(this.H);
/*  358 */     l1.a(this.F, 18.0F);
/*      */ 
/*      */     
/*  361 */     this.j = true;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  366 */     boolean bool = false;
/*      */     
/*  368 */     a = null;
/*      */     
/*  370 */     if (l1.bt.L == null) {
/*      */       
/*  372 */       l.b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
/*      */ 
/*      */       
/*  375 */       bool = true;
/*      */     }
/*      */     else {
/*      */       
/*  379 */       a = l1.bt.L.a("map_info");
/*      */     } 
/*      */ 
/*      */     
/*  383 */     if (a == null) {
/*      */       
/*  385 */       l.b("MissionEngine", "Error: map_info is missing from this map");
/*      */       
/*  387 */       bool = true;
/*      */     } 
/*      */     
/*  390 */     if (a != null && a.b("type") == null) {
/*      */       
/*  392 */       a("type is missing from map_info");
/*  393 */       bool = true;
/*      */     } 
/*      */     
/*  396 */     if (bool) {
/*      */       
/*  398 */       l.b("MissionEngine", "Defaulting to skirmish");
/*      */       
/*  400 */       this.n = true;
/*  401 */       this.e = l.f;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  412 */     this.k = "survival".equalsIgnoreCase(a.b("type"));
/*      */     
/*  414 */     if (this.k) {
/*      */       
/*  416 */       this.l = "true".equalsIgnoreCase(a.b("survivalWavesClassic"));
/*      */       
/*  418 */       if (this.l)
/*      */       {
/*  420 */         l.d("Classic survial waves selected");
/*      */       }
/*      */ 
/*      */       
/*  424 */       f();
/*      */ 
/*      */       
/*  427 */       this.p = false;
/*      */       
/*  429 */       this.y = l1.by.aiDifficulty;
/*      */       
/*  431 */       if (!this.l) {
/*      */         
/*  433 */         this.z = 1200.0F;
/*      */         
/*  435 */         if (this.y < 0)
/*      */         {
/*  437 */           this.z = 3000.0F;
/*      */         
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/*  443 */         this.z = 3000.0F;
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
/*  457 */     String str1 = a.b("survivalWaves");
/*  458 */     if (str1 != null)
/*      */     {
/*      */       
/*  461 */       g(str1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  467 */     String str2 = a.b("startWithMusic");
/*      */     
/*  469 */     if (str2 != null)
/*      */     {
/*      */       
/*  472 */       l1.bv.a(str2);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  479 */     this.n = "skirmish".equalsIgnoreCase(a.b("type"));
/*      */     
/*  481 */     if (this.n)
/*      */     {
/*  483 */       this.e = l.f;
/*      */     }
/*      */     
/*  486 */     this.o = "true".equalsIgnoreCase(a.b("shareFogWithAllies"));
/*      */ 
/*      */ 
/*      */     
/*  490 */     String str3 = a.b("winCondition");
/*      */     
/*  492 */     if (str3 == null && !this.n)
/*      */     {
/*  494 */       throw new com.corrodinggames.rts.game.b.f("win condition not set");
/*      */     }
/*      */     
/*  497 */     if (str3 != null)
/*      */     {
/*  499 */       if (str3.equalsIgnoreCase("none")) {
/*      */         
/*  501 */         this.e = l.a;
/*      */       }
/*  503 */       else if (str3.equalsIgnoreCase("allUnitsAndBuildings")) {
/*      */         
/*  505 */         this.e = l.b;
/*      */       }
/*  507 */       else if (str3.equalsIgnoreCase("allBuildings")) {
/*      */         
/*  509 */         this.e = l.c;
/*      */       }
/*  511 */       else if (str3.equalsIgnoreCase("mainBuilings")) {
/*      */         
/*  513 */         this.e = l.d;
/*      */       }
/*  515 */       else if (str3.equalsIgnoreCase("mainBuildings")) {
/*      */         
/*  517 */         this.e = l.d;
/*      */       }
/*  519 */       else if (str3.equalsIgnoreCase("commandCenter")) {
/*      */         
/*  521 */         this.e = l.e;
/*      */       }
/*  523 */       else if (str3.equalsIgnoreCase("requiredObjectives")) {
/*      */         
/*  525 */         this.e = l.g;
/*      */       }
/*      */       else {
/*      */         
/*  529 */         throw new com.corrodinggames.rts.game.b.f("unknown win condition:" + str3);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  534 */     if (this.n)
/*      */     {
/*  536 */       this.f = this.e;
/*      */     }
/*      */ 
/*      */     
/*  540 */     this.h = a.a("introText", null);
/*      */ 
/*      */     
/*  543 */     if (this.h != null) {
/*      */       
/*  545 */       this.h.a("\\\\n", "\n");
/*      */       
/*  547 */       if (this.h.a())
/*      */       {
/*  549 */         this.h = null;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  558 */     if (!l1.ao() && !this.n) {
/*      */       
/*  560 */       this.d = m.n(3);
/*      */       
/*  562 */       if (this.d != null)
/*      */       {
/*  564 */         this.d.o = 0;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  570 */     if (l1.ao());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  576 */     for (a a : l1.bt.L.c) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  581 */       if ("team_info".equalsIgnoreCase(a.d)) {
/*      */ 
/*      */         
/*  584 */         int i = Integer.parseInt(a.a("team", "-2"));
/*      */         
/*  586 */         if (i == -2)
/*      */         {
/*  588 */           throw new RuntimeException("cannot find team for:" + a.b);
/*      */         }
/*      */         
/*  591 */         m m1 = m.n(i);
/*      */         
/*  593 */         if (m1 == null) {
/*      */           
/*  595 */           l.b("No team loaded for:" + i + " skipping");
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  600 */         str3 = a.b("credits");
/*      */         
/*  602 */         if (str3 != null) {
/*      */           
/*  604 */           int j = Integer.parseInt(str3);
/*  605 */           m1.m = j;
/*      */         } 
/*      */         
/*  608 */         String str4 = a.b("basicAI");
/*  609 */         if (str4 != null && l1.I())
/*      */         {
/*  611 */           if (m1 instanceof a) {
/*      */             
/*  613 */             l.b("Using basic AI:" + i + " by map request");
/*  614 */             a a1 = (a)m1;
/*  615 */             a1.aH = true;
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/*  620 */         String str5 = a.b("lockAiDifficulty");
/*  621 */         if (str5 != null)
/*      */         {
/*  623 */           if (m1 instanceof a) {
/*      */             
/*  625 */             l.b("Locking lockAiDifficulty:" + i + " by map request to: " + str5);
/*  626 */             a a1 = (a)m1;
/*      */             
/*  628 */             int j = Integer.parseInt(str5);
/*      */ 
/*      */             
/*  631 */             a1.s = j;
/*  632 */             a1.t = true;
/*      */             
/*  634 */             l1.bF.ah();
/*      */           } 
/*      */         }
/*      */         
/*  638 */         String str6 = a.b("disabledAI");
/*  639 */         if (str6 != null && l1.I())
/*      */         {
/*  641 */           if (m1 instanceof a) {
/*      */             
/*  643 */             l.b("Disabling AI:" + i + " by map request");
/*  644 */             a a1 = (a)m1;
/*  645 */             a1.aG = true;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*  651 */         String str7 = a.b("allyGroup");
/*      */         
/*  653 */         if (str7 != null && l1.I()) {
/*      */           
/*  655 */           int j = Integer.parseInt(str7);
/*  656 */           m1.o = j;
/*      */         } 
/*      */         
/*  659 */         String str8 = a.b("ai");
/*      */         
/*  661 */         if (str8 != null)
/*      */         {
/*  663 */           m1.J = str8.equalsIgnoreCase("survival");
/*      */         }
/*      */       } 
/*      */       
/*  667 */       if ("camera_start".equalsIgnoreCase(a.b))
/*      */       {
/*  669 */         if (!paramBoolean) {
/*      */           
/*  671 */           l1.b(a.e, a.f);
/*  672 */           this.q = true;
/*      */           
/*  674 */           Integer integer = a.c("zoomTo");
/*  675 */           if (integer != null)
/*      */           {
/*  677 */             l1.cC = integer.intValue();
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  684 */       if ("attack_point".equalsIgnoreCase(a.b))
/*      */       {
/*  686 */         this.D.add(new PointF(a.e, a.f));
/*      */       }
/*      */       
/*  689 */       if ("rotate".equalsIgnoreCase(a.d)) {
/*      */ 
/*      */         
/*  692 */         str1 = a.b("dir");
/*  693 */         float f1 = Float.parseFloat(str1);
/*      */         
/*  695 */         for (af af : af.bj) {
/*      */           
/*  697 */           if (af instanceof r && !af.bw())
/*      */           {
/*  699 */             if (a.a(af))
/*      */             {
/*  701 */               af.bL = f1;
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  708 */       if ("fall".equalsIgnoreCase(a.d))
/*      */       {
/*      */ 
/*      */         
/*  712 */         for (af af : af.bj) {
/*      */           
/*  714 */           if (af instanceof r && !af.bw())
/*      */           {
/*  716 */             if (a.a(af))
/*      */             {
/*  718 */               af.cK();
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
/*  734 */       if ("set_team".equalsIgnoreCase(a.d)) {
/*      */         
/*  736 */         str1 = a.b("team");
/*  737 */         int i = Integer.parseInt(str1);
/*      */         
/*  739 */         for (af af : af.bj) {
/*      */           
/*  741 */           if (af instanceof r)
/*      */           {
/*  743 */             if (a.a(af))
/*      */             {
/*  745 */               af.O(i);
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  753 */       if ("ai_allow_full_use".equalsIgnoreCase(a.d))
/*      */       {
/*      */         
/*  756 */         for (af af : af.bj) {
/*      */           
/*  758 */           if (af instanceof r)
/*      */           {
/*  760 */             if (a.a(af))
/*      */             {
/*  762 */               ((r)af).br = false;
/*      */             }
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  770 */       if ("disable_unit_ai".equalsIgnoreCase(a.d))
/*      */       {
/*      */         
/*  773 */         for (af af : af.bj) {
/*      */           
/*  775 */           if (af instanceof r)
/*      */           {
/*  777 */             if (a.a(af))
/*      */             {
/*  779 */               af.bs = true;
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
/*  797 */     for (af af : af.bj) {
/*      */       
/*  799 */       if (!af.o_() && !(af instanceof com.corrodinggames.rts.game.units.ae) && !af.bw() && af.cp == null && af.cq == null) {
/*      */         af af1;
/*      */         
/*  802 */         str1 = null;
/*  803 */         float f1 = 4900.0F;
/*      */ 
/*      */ 
/*      */         
/*  807 */         for (af af2 : af.bj) {
/*      */           
/*  809 */           if (af2.cc())
/*      */           {
/*  811 */             if (af != af2 && (af.bB == m.g || af2.bB.d(af.bB))) {
/*      */ 
/*      */               
/*  814 */               float f2 = com.corrodinggames.rts.gameFramework.f.a(af2.dH, af2.dI, af.dH, af.dI);
/*      */               
/*  816 */               if (f2 < f1)
/*      */               {
/*  818 */                 if (af2.d(af, true)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  824 */                   af1 = af2;
/*  825 */                   f1 = f2;
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*  833 */         if (af1 != null)
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*  838 */           af1.e(af, true);
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  847 */     this.J.clear();
/*  848 */     for (a a : l1.bt.L.c) {
/*      */ 
/*      */       
/*  851 */       if ("team_info".equalsIgnoreCase(a.d) || "point"
/*  852 */         .equalsIgnoreCase(a.d) || "camera_pan"
/*  853 */         .equalsIgnoreCase(a.d) || "camera_start"
/*  854 */         .equalsIgnoreCase(a.b) || "map_info"
/*  855 */         .equalsIgnoreCase(a.b) || "attack_point"
/*  856 */         .equalsIgnoreCase(a.b) || "rotate"
/*  857 */         .equalsIgnoreCase(a.d) || "fall"
/*  858 */         .equalsIgnoreCase(a.d) || "set_team"
/*  859 */         .equalsIgnoreCase(a.d) || "ai_allow_full_use"
/*  860 */         .equalsIgnoreCase(a.d) || "disable_unit_ai"
/*  861 */         .equalsIgnoreCase(a.d) || "info"
/*  862 */         .equalsIgnoreCase(a.d)) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  868 */       if (a.n == null) {
/*      */         
/*  870 */         c("Error: Skipping trigger:" + a.b + " - no properties found");
/*      */         
/*      */         continue;
/*      */       } 
/*  874 */       a a1 = c.a(this, a);
/*      */       
/*  876 */       if (a1 != null)
/*      */       {
/*  878 */         this.J.add(a1);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  884 */     for (a a1 : this.J) {
/*      */       
/*  886 */       str1 = a1.b("activateIds");
/*      */       
/*  888 */       if (str1 == null)
/*      */       {
/*  890 */         str1 = a1.b("alsoActivate");
/*      */       }
/*  892 */       if (str1 != null) {
/*      */ 
/*      */         
/*  895 */         String[] arrayOfString = str1.split(",");
/*  896 */         for (String str : arrayOfString) {
/*      */ 
/*      */           
/*  899 */           a a2 = d(str);
/*  900 */           if (a2 == null) {
/*      */             
/*  902 */             a1.g("linkedTo target not found: " + str1);
/*      */ 
/*      */             
/*  905 */             l.d("Possible IDs:");
/*  906 */             for (a a3 : this.J) {
/*      */               
/*  908 */               if (a3.b != null)
/*      */               {
/*  910 */                 l.d(a3.b);
/*      */               }
/*      */             } 
/*  913 */             l.d("--------");
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/*  919 */             a2.d.a(a1);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  929 */       str2 = a1.b("whenActivatedIds");
/*  930 */       if (str2 == null)
/*      */       {
/*  932 */         str2 = a1.b("activatedBy");
/*      */       }
/*  934 */       if (str2 != null) {
/*      */         
/*  936 */         String[] arrayOfString = str2.split(",");
/*  937 */         for (String str : arrayOfString) {
/*      */           
/*  939 */           a a2 = d(str);
/*  940 */           if (a2 == null) {
/*      */             
/*  942 */             a1.g("linkedFrom target not found: " + str);
/*      */           }
/*      */           else {
/*      */             
/*  946 */             a1.d.a(a2);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  952 */       str2 = a1.b("deactivatedBy");
/*      */       
/*  954 */       if (str2 != null) {
/*      */         
/*  956 */         String[] arrayOfString = str2.split(",");
/*  957 */         for (String str : arrayOfString) {
/*      */           
/*  959 */           a a2 = d(str);
/*  960 */           if (a2 == null) {
/*      */             
/*  962 */             a1.g("deactivatedBy: target not found: " + str);
/*      */           }
/*      */           else {
/*      */             
/*  966 */             a1.e.a(a2);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  975 */     l.d("Found " + this.J.size() + " map triggers");
/*  976 */     for (a a1 : this.J) {
/*      */       
/*  978 */       for (String str : a1.t.a())
/*      */       {
/*  980 */         a1.g("Key was not used: " + str);
/*      */       }
/*      */     } 
/*      */     
/*  984 */     c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  995 */     for (a a : this.J) {
/*      */ 
/*      */       
/*  998 */       if (a.g == e.a) {
/*      */         
/* 1000 */         boolean bool = false;
/* 1001 */         for (m m1 : this.g) {
/*      */           
/* 1003 */           if (m1.a == a)
/*      */           {
/* 1005 */             bool = true;
/*      */           }
/*      */         } 
/*      */         
/* 1009 */         if (!bool) {
/*      */           
/* 1011 */           m m1 = new m();
/* 1012 */           m1.a = a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1020 */           this.g.add(m1);
/*      */           
/* 1022 */           l.d("Found objective: " + m1.a());
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
/*      */   public static void c(String paramString) {
/* 1037 */     l l1 = l.u();
/* 1038 */     l.b("MissionEngine", paramString);
/*      */ 
/*      */     
/* 1041 */     ad.f(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1046 */   public ArrayList J = new ArrayList();
/*      */ 
/*      */   
/*      */   public a d(String paramString) {
/* 1050 */     paramString = paramString.trim();
/* 1051 */     for (a a : this.J) {
/*      */       
/* 1053 */       if (a.b != null && a.b.equalsIgnoreCase(paramString))
/*      */       {
/* 1055 */         return a;
/*      */       }
/*      */     } 
/* 1058 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public a e(String paramString) {
/* 1063 */     paramString = paramString.trim();
/* 1064 */     for (a a : this.J) {
/*      */       
/* 1066 */       if (a.c.equalsIgnoreCase(paramString))
/*      */       {
/* 1068 */         return a;
/*      */       }
/*      */     } 
/* 1071 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1076 */   PointF K = new PointF();
/*      */   
/*      */   public PointF f(String paramString) {
/* 1079 */     l l1 = l.u();
/*      */     
/* 1081 */     i i = l1.bt.L;
/*      */     
/* 1083 */     if (i != null)
/*      */     {
/* 1085 */       for (a a : i.c) {
/*      */         
/* 1087 */         if ("point".equalsIgnoreCase(a.d))
/*      */         {
/* 1089 */           if (a.c != null && a.c.equalsIgnoreCase(paramString)) {
/*      */             
/* 1091 */             this.K.a(a.e, a.f);
/* 1092 */             return this.K;
/*      */           } 
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/* 1098 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/* 1107 */     l l1 = l.u();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat) {
/* 1117 */     l l1 = l.u();
/*      */ 
/*      */     
/* 1120 */     if (this.i)
/*      */     {
/*      */       
/* 1123 */       for (a a : this.J) {
/*      */         
/* 1125 */         if (a.g == e.g)
/*      */         {
/* 1127 */           if (a.j) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1134 */             float f1 = a.b() - l1.cd;
/* 1135 */             float f2 = a.c() - l1.ce;
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1140 */             f1 *= l1.cE;
/* 1141 */             f2 *= l1.cE;
/*      */             
/* 1143 */             f1 += a.w;
/* 1144 */             f2 += a.x;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1154 */             if (a.B) {
/*      */               
/* 1156 */               g g = c.n[9];
/* 1157 */               g.a(2, f1, f2, a.A);
/* 1158 */               f2 -= (g.c - 2);
/*      */             } 
/*      */             
/* 1161 */             if (a.z == null || a.z.equals("")) {
/*      */               continue;
/*      */             }
/*      */ 
/*      */             
/* 1166 */             String str = a.z.b();
/* 1167 */             l1.bw.a(str, f1, f2, a.A);
/*      */           } 
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1177 */     if (this.k && !this.N) {
/*      */ 
/*      */       
/* 1180 */       boolean bool1 = true;
/* 1181 */       boolean bool2 = false;
/*      */ 
/*      */       
/* 1184 */       this.B = com.corrodinggames.rts.gameFramework.f.a(this.B, paramFloat);
/* 1185 */       if (this.B == 0.0F)
/*      */       {
/* 1187 */         if (this.A != 0.0F) {
/*      */           
/* 1189 */           this.A = com.corrodinggames.rts.gameFramework.f.a(this.A, paramFloat);
/*      */ 
/*      */ 
/*      */           
/* 1193 */           bool2 = true;
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1199 */       if (bool1)
/*      */       {
/* 1201 */         if (bool2) {
/*      */ 
/*      */           
/* 1204 */           int i = (int)(23.0F + this.E.k() / 2.0F);
/*      */           
/* 1206 */           l1.bw.a("- Wave " + this.r + " -", l1.cm / 2.0F, i, this.E);
/*      */           
/* 1208 */           if (this.s != null)
/*      */           {
/* 1210 */             l1.bw.a(this.s, l1.cm / 2.0F, i + this.E.k() + 2.0F, this.F);
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1217 */           int i = (int)(23.0F + this.G.k() / 2.0F);
/*      */           
/* 1219 */           String str1 = "Wave " + (this.r + 1) + " in " + com.corrodinggames.rts.gameFramework.f.f(String.valueOf((int)(this.z / 60.0D)), 3);
/*      */           
/* 1221 */           if (this.m)
/*      */           {
/* 1223 */             str1 = "Defeat - Wave " + this.r;
/*      */           }
/*      */           
/* 1226 */           l1.bw.a(str1, l1.cm / 2.0F, i, this.G);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1240 */           if (this.t == null) {
/*      */             i i1;
/*      */ 
/*      */             
/* 1244 */             if (!this.l) {
/*      */               
/* 1246 */               i1 = b(false);
/*      */             }
/*      */             else {
/*      */               
/* 1250 */               i1 = c(false);
/*      */             } 
/*      */             
/* 1253 */             this.t = i1.toString();
/*      */           } 
/*      */           
/* 1256 */           String str2 = this.t;
/*      */           
/* 1258 */           l1.bw.a(str2, l1.cm / 2.0F, i + this.G.k() + 2.0F, this.H);
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
/* 1275 */     if (this.k && this.N) {
/*      */       
/* 1277 */       g g = d();
/*      */       
/* 1279 */       if (g != null) {
/*      */ 
/*      */ 
/*      */         
/* 1283 */         int i = g.e - l1.bh / 1000;
/*      */ 
/*      */ 
/*      */         
/* 1287 */         int j = (int)(23.0F + this.G.k() / 2.0F);
/*      */         
/* 1289 */         String str1 = "Wave " + (this.r + 1) + " in " + com.corrodinggames.rts.gameFramework.f.f(String.valueOf(i), 3);
/*      */         
/* 1291 */         if (this.m)
/*      */         {
/* 1293 */           str1 = "Defeat - Wave " + this.r;
/*      */         }
/*      */         
/* 1296 */         l1.bw.a(str1, l1.cm / 2.0F, j, this.G);
/*      */ 
/*      */ 
/*      */         
/* 1300 */         String str2 = g.f;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1307 */         if (str2 != null)
/*      */         {
/*      */           
/* 1310 */           l1.bw.a(str2, l1.cm / 2.0F, j + this.G.k() + 2.0F, this.H);
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
/* 1322 */   int L = 0;
/* 1323 */   float M = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean N;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(String paramString) {
/* 1476 */     l.d("Loading survival waves");
/*      */     
/* 1478 */     this.N = true;
/*      */     
/* 1480 */     String[] arrayOfString = paramString.split("\n");
/*      */     
/* 1482 */     int i = 0;
/* 1483 */     byte b = 0;
/* 1484 */     boolean bool = false;
/* 1485 */     for (String str : arrayOfString) {
/*      */       
/* 1487 */       b++;
/*      */       
/* 1489 */       g g = new g(this);
/*      */       
/* 1491 */       if (g.a(str)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1499 */         g.e = i + (int)g.d;
/*      */         
/* 1501 */         i = g.e;
/*      */ 
/*      */         
/* 1504 */         l.d("Adding wave " + b + " at " + g.e);
/*      */         
/* 1506 */         this.O.add(g);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1514 */   public ArrayList O = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*      */   public g d() {
/* 1519 */     if (this.r < this.O.size())
/*      */     {
/* 1521 */       return this.O.get(this.r);
/*      */     }
/* 1523 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/* 1529 */     this.R = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1535 */     int i = com.corrodinggames.rts.gameFramework.f.a(0, this.D.size() - 1, this.r);
/*      */ 
/*      */     
/* 1538 */     PointF pointF = this.D.get(i);
/*      */     
/* 1540 */     this.P.a(pointF);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1547 */   PointF P = new PointF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean Q = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean R = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1879 */   ArrayList S = new ArrayList();
/*      */ 
/*      */   
/* 1882 */   ArrayList T = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/* 1892 */     this.S.clear();
/*      */     
/* 1894 */     a(this.S, "scout", 0.7F);
/*      */     
/* 1896 */     a(this.S, (al)ak.i, 2.1F);
/*      */     
/* 1898 */     a(this.S, "mechGun", 1.0F);
/* 1899 */     a(this.S, "lightGunship", 2.8F);
/*      */     
/* 1901 */     a(this.S, (al)ak.j, 1.9F);
/* 1902 */     a(this.S, (al)ak.l, 0.8F);
/* 1903 */     a(this.S, (al)ak.w, 1.0F);
/* 1904 */     a(this.S, (al)ak.x, 0.8F);
/* 1905 */     a(this.S, (al)ak.n, 0.7F);
/* 1906 */     a(this.S, "plasmaTank", 0.6F);
/* 1907 */     a(this.S, "missileAirship", 0.4F);
/*      */ 
/*      */     
/* 1910 */     this.T.clear();
/* 1911 */     a(this.T, (al)ak.F, 1.0F);
/* 1912 */     a(this.T, (al)ak.O, 0.5F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ArrayList paramArrayList, String paramString, float paramFloat) {
/* 1919 */     a(paramArrayList, ak.a(paramString), paramFloat);
/*      */   }
/*      */   public void a(ArrayList<k> paramArrayList, al paramal, float paramFloat) {
/*      */     ak ak;
/*      */     al al1;
/* 1924 */     if (paramal == null)
/*      */     {
/* 1926 */       ak = ak.i;
/*      */     }
/* 1928 */     al al2 = l.c((al)ak);
/* 1929 */     if (al2 != null)
/*      */     {
/* 1931 */       al1 = al2;
/*      */     }
/*      */     
/* 1934 */     k k = new k(this);
/* 1935 */     k.a = al1;
/* 1936 */     k.b = paramFloat;
/* 1937 */     paramArrayList.add(k);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(i parami, int paramInt, float paramFloat) {
/* 1945 */     if (paramInt < 0)
/*      */     {
/* 1947 */       paramInt = 0;
/*      */     }
/*      */     
/* 1950 */     int j = this.S.size();
/*      */     
/* 1952 */     if (j == 0) {
/*      */       
/* 1954 */       l.b("error maxTypeNum: " + j);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1959 */     int k = paramInt % j;
/* 1960 */     k k1 = this.S.get(k);
/* 1961 */     int n = (int)((paramInt + 3) * 0.5D * k1.b * paramFloat);
/* 1962 */     n = (int)com.corrodinggames.rts.gameFramework.f.e(n, 0.8F);
/* 1963 */     if (n < 1) n = 1; 
/* 1964 */     parami.b(k1.a, n);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public i b(boolean paramBoolean) {
/* 1973 */     i i = new i(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1992 */     boolean bool = false;
/*      */     
/* 1994 */     if (this.u > 50 && (this.u + 1) % 100 == 0) {
/*      */       
/* 1996 */       int k = this.T.size();
/* 1997 */       int n = this.u / 100;
/* 1998 */       if (k == 0) {
/*      */         
/* 2000 */         l.b("error maxTypeNum: " + k);
/*      */       }
/*      */       else {
/*      */         
/* 2004 */         int i1 = n % k;
/* 2005 */         k k1 = this.T.get(i1);
/* 2006 */         int i2 = (int)(n * k1.b);
/* 2007 */         if (i2 < 1) i2 = 1; 
/* 2008 */         i.b(k1.a, i2);
/*      */       } 
/*      */       
/* 2011 */       bool = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2016 */     int j = 0;
/*      */     
/* 2018 */     if (this.y > 0)
/*      */     {
/* 2020 */       j = this.y;
/*      */     }
/*      */     
/* 2023 */     a(i, this.u + j, 1.0F);
/*      */     
/* 2025 */     if (this.u > 15 && !bool)
/*      */     {
/* 2027 */       a(i, (int)((this.u + j) * 1.1F) - 11, 0.5F);
/*      */     }
/*      */ 
/*      */     
/* 2031 */     if (paramBoolean) {
/*      */ 
/*      */       
/* 2034 */       this.u++;
/*      */       
/* 2036 */       this.v++;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2043 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public i c(boolean paramBoolean) {
/* 2051 */     i i = new i(this);
/*      */ 
/*      */     
/* 2054 */     i.a = false;
/*      */ 
/*      */ 
/*      */     
/* 2058 */     int j = this.v;
/*      */     
/* 2060 */     ak ak = null;
/*      */     
/* 2062 */     if (this.p) {
/*      */       
/* 2064 */       ak = ak.t;
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 2070 */       if (this.u == 0) {
/*      */         
/* 2072 */         j++;
/* 2073 */         ak = ak.i;
/*      */       } 
/*      */       
/* 2076 */       if (this.u == 1)
/*      */       {
/* 2078 */         ak = ak.j;
/*      */       }
/*      */       
/* 2081 */       if (this.u == 2)
/*      */       {
/* 2083 */         ak = ak.l;
/*      */       }
/*      */ 
/*      */       
/* 2087 */       if (this.u == 3) {
/*      */         
/* 2089 */         j = this.w;
/* 2090 */         ak = ak.w;
/*      */       } 
/*      */       
/* 2093 */       if (this.u == 4) {
/*      */         
/* 2095 */         j = this.w;
/* 2096 */         ak = ak.x;
/*      */         
/* 2098 */         if (this.w % 2 == 0)
/*      */         {
/* 2100 */           ak = ak.n;
/*      */         }
/*      */       } 
/*      */       
/* 2104 */       if (this.u == 5) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2109 */         i.a = true;
/*      */         
/* 2111 */         j = 1;
/* 2112 */         ak = ak.F;
/*      */       } 
/*      */       
/* 2115 */       if (paramBoolean) {
/*      */ 
/*      */         
/* 2118 */         this.u++;
/*      */         
/* 2120 */         boolean bool = false;
/*      */ 
/*      */         
/* 2123 */         if (this.w == 1) {
/*      */           
/* 2125 */           if (this.u > 2)
/*      */           {
/* 2127 */             bool = true;
/*      */           }
/*      */         }
/* 2130 */         else if (this.w < 5) {
/*      */           
/* 2132 */           if (this.u > 4)
/*      */           {
/* 2134 */             bool = true;
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/* 2139 */           if (this.u > 5)
/*      */           {
/* 2141 */             bool = true;
/*      */           }
/*      */           
/* 2144 */           if (this.u > 4 && this.w % 2 == 0)
/*      */           {
/* 2146 */             bool = true;
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 2152 */         if (bool) {
/*      */           
/* 2154 */           this.u = 0;
/* 2155 */           this.v += 2;
/* 2156 */           this.w++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2163 */     i.a((al)ak, j);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2168 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(float paramFloat) {
/* 2177 */     l l1 = l.u();
/*      */     
/* 2179 */     int i = l1.bh;
/*      */     
/* 2181 */     this.M = com.corrodinggames.rts.gameFramework.f.a(this.M, paramFloat);
/*      */ 
/*      */     
/* 2184 */     if (l1.al && l1.bq) {
/*      */       
/* 2186 */       a a = null;
/*      */       
/* 2188 */       if (l1.bt.L != null)
/*      */       {
/* 2190 */         for (a a1 : l1.bt.L.c) {
/*      */           
/* 2192 */           if ("camera_pan".equalsIgnoreCase(a1.d))
/*      */           {
/* 2194 */             if (this.L == Integer.parseInt(a1.a("index", "-1")))
/*      */             {
/* 2196 */               a = a1;
/*      */             }
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/* 2202 */       if (a == null) {
/*      */         
/* 2204 */         this.L = 0;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 2209 */         float f1 = a.e;
/* 2210 */         float f2 = a.f;
/*      */ 
/*      */         
/* 2213 */         if (f1 < l1.cp + 2.0F)
/*      */         {
/* 2215 */           f1 = l1.cp + 2.0F;
/*      */         }
/* 2217 */         if (f2 < l1.cq + 2.0F)
/*      */         {
/* 2219 */           f2 = l1.cq + 2.0F;
/*      */         }
/* 2221 */         if (f1 > l1.bt.f() - l1.cp - 2.0F)
/*      */         {
/* 2223 */           f1 = l1.bt.f() - l1.cp - 2.0F;
/*      */         }
/* 2225 */         if (f2 > l1.bt.g() - l1.cq - 2.0F)
/*      */         {
/* 2227 */           f2 = l1.bt.g() - l1.cq - 2.0F;
/*      */         }
/*      */         
/* 2230 */         float f3 = com.corrodinggames.rts.gameFramework.f.d(l1.cf + l1.cp, l1.cg + l1.cq, f1, f2);
/*      */         
/* 2232 */         float f4 = com.corrodinggames.rts.gameFramework.f.a(l1.cf + l1.cp, l1.cg + l1.cq, f1, f2);
/*      */ 
/*      */         
/* 2235 */         if (this.M == 0.0F)
/*      */         {
/* 2237 */           if (f4 < 225.0F || l1.ca) {
/*      */             
/* 2239 */             this.L++;
/* 2240 */             this.M = 50.0F;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2251 */         float f5 = 0.45F * paramFloat;
/*      */ 
/*      */         
/* 2254 */         l1.cf += com.corrodinggames.rts.gameFramework.f.i(f3) * f5;
/* 2255 */         l1.cg += com.corrodinggames.rts.gameFramework.f.h(f3) * f5;
/*      */         
/* 2257 */         l1.a(l1.cf, l1.cg);
/* 2258 */         l1.J();
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2265 */     if (this.k)
/*      */     {
/*      */       
/* 2268 */       if (!this.N) {
/*      */ 
/*      */         
/* 2271 */         if (!this.m)
/*      */         {
/* 2273 */           this.z = com.corrodinggames.rts.gameFramework.f.a(this.z, paramFloat);
/*      */         }
/*      */         
/* 2276 */         if (this.z == 0.0F && !this.m) {
/*      */           i i1;
/* 2278 */           this.r++;
/*      */           
/* 2280 */           this.A = 180.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2286 */           int j = com.corrodinggames.rts.gameFramework.f.a(0, this.D.size() - 1, this.r);
/*      */           
/* 2288 */           PointF pointF = this.D.get(j);
/*      */ 
/*      */ 
/*      */           
/* 2292 */           if (!this.l) {
/*      */             
/* 2294 */             this.s = b(false).toString();
/* 2295 */             i1 = b(true);
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 2300 */             this.s = c(false).toString();
/* 2301 */             i1 = c(true);
/*      */           } 
/*      */ 
/*      */           
/* 2305 */           this.z = 1800.0F;
/*      */           
/* 2307 */           if (!this.l)
/*      */           {
/* 2309 */             if (this.y > 0) {
/*      */               
/* 2311 */               this.z -= (this.y * 3 * 60);
/*      */             }
/*      */             else {
/*      */               
/* 2315 */               this.z -= (this.y * 9 * 60);
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2324 */           i1.a(pointF.a, pointF.b);
/*      */ 
/*      */           
/* 2327 */           this.t = null;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 2338 */       else if (!this.m) {
/*      */ 
/*      */         
/* 2341 */         g g = d();
/*      */         
/* 2343 */         if (g != null) {
/*      */           
/* 2345 */           if (g.e * 1000 < l1.bh)
/*      */           {
/*      */ 
/*      */             
/* 2349 */             g.a();
/*      */             
/* 2351 */             this.r++;
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 2360 */         else if (!l1.cX && !l1.bJ.h()) {
/*      */ 
/*      */           
/* 2363 */           l1.bA.E();
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
/* 2379 */     if (this.j) {
/*      */       
/* 2381 */       this.j = false;
/* 2382 */       if (this.h != null)
/*      */       {
/* 2384 */         l1.a("Briefing", this.h);
/*      */       }
/*      */     } 
/*      */     
/* 2388 */     if (i > this.b + 250) {
/*      */       
/* 2390 */       this.b = i;
/*      */       
/* 2392 */       a(i);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2397 */     if (i > this.c + 1000) {
/*      */       
/* 2399 */       this.c = i;
/*      */       
/* 2401 */       if (h()) {
/*      */         
/* 2403 */         h();
/* 2404 */         h();
/*      */       } 
/*      */       
/* 2407 */       boolean bool1 = false;
/* 2408 */       boolean bool2 = false;
/*      */       
/* 2410 */       if (l1.bb != null) {
/*      */         
/* 2412 */         if (l1.bb.h())
/*      */         {
/* 2414 */           bool1 = true;
/*      */         }
/*      */         
/* 2417 */         if (l1.bb.b())
/*      */         {
/* 2419 */           bool2 = true;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 2424 */       if (!l1.cX && !l1.da && !l1.bJ.h() && !bool1 && !bool2) {
/*      */ 
/*      */         
/* 2427 */         boolean bool3 = true;
/* 2428 */         boolean bool4 = true;
/*      */         
/* 2430 */         if (this.e == l.a) {
/*      */ 
/*      */           
/* 2433 */           bool3 = false;
/*      */         }
/* 2435 */         else if (this.e == l.g) {
/*      */           
/* 2437 */           for (m m1 : this.g)
/*      */           {
/* 2439 */             if (!m1.b())
/*      */             {
/* 2441 */               bool3 = false;
/*      */             
/*      */             }
/*      */           
/*      */           }
/*      */         
/*      */         }
/* 2448 */         else if (l1.bb != null) {
/*      */ 
/*      */           
/* 2451 */           for (af af : af.bj) {
/*      */             
/* 2453 */             if (l1.bb.c(af.bB))
/*      */             {
/* 2455 */               if (a(this.e, af)) {
/*      */                 
/* 2457 */                 bool3 = false;
/*      */ 
/*      */                 
/*      */                 break;
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 2467 */         if (this.f == l.a) {
/*      */ 
/*      */           
/* 2470 */           bool4 = false;
/*      */         }
/* 2472 */         else if (this.f == l.g) {
/*      */           
/* 2474 */           bool4 = false;
/*      */ 
/*      */         
/*      */         }
/* 2478 */         else if (l1.bb != null) {
/*      */           
/* 2480 */           for (af af : af.bj) {
/*      */             
/* 2482 */             if (l1.bb.d(af.bB))
/*      */             {
/* 2484 */               if (a(this.f, af)) {
/*      */                 
/* 2486 */                 bool4 = false;
/*      */ 
/*      */                 
/*      */                 break;
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/* 2495 */         if (bool4 && !bool3)
/*      */         {
/*      */           
/* 2498 */           l1.bA.F();
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 2503 */         if (bool3) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2509 */           l1.bA.E();
/*      */           
/* 2511 */           if (l1.bh > 1500) {
/*      */             
/* 2513 */             l1.by.numberOfWins++;
/* 2514 */             l1.by.save();
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
/* 2525 */       if (this.k)
/*      */       {
/* 2527 */         if (!this.m) {
/*      */ 
/*      */           
/* 2530 */           boolean bool = true;
/*      */           
/* 2532 */           for (af af : af.bj) {
/*      */             
/* 2534 */             if (af instanceof com.corrodinggames.rts.game.units.d.d || af.bu)
/*      */             {
/* 2536 */               if (!af.bz && !af.o_())
/*      */               {
/* 2538 */                 if (af.bB == l1.bb)
/*      */                 {
/* 2540 */                   bool = false;
/*      */                 }
/*      */               }
/*      */             }
/*      */           } 
/*      */           
/* 2546 */           if (bool) {
/*      */             
/* 2548 */             this.m = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 2556 */             l1.bA.F();
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
/*      */   public boolean a(l paraml, af paramaf) {
/* 2570 */     if (!(paramaf instanceof r))
/*      */     {
/* 2572 */       return false;
/*      */     }
/*      */     
/* 2575 */     if (paramaf.bz || paramaf.cC())
/*      */     {
/* 2577 */       return false;
/*      */     }
/*      */     
/* 2580 */     if (paraml == l.a)
/*      */     {
/* 2582 */       return false;
/*      */     }
/* 2584 */     if (paraml == l.b)
/*      */     {
/* 2586 */       return true;
/*      */     }
/* 2588 */     if (paraml == l.c)
/*      */     {
/* 2590 */       return paramaf.bw();
/*      */     }
/* 2592 */     if (paraml == l.e)
/*      */     {
/* 2594 */       return (paramaf instanceof com.corrodinggames.rts.game.units.d.d || paramaf.bu);
/*      */     }
/* 2596 */     if (paraml == l.d)
/*      */     {
/* 2598 */       return (paramaf.bw() && paramaf.bx() && !(paramaf instanceof com.corrodinggames.rts.game.units.d.a.b) && !(paramaf instanceof com.corrodinggames.rts.game.units.d.f));
/*      */     }
/* 2600 */     if (paraml == l.f) {
/*      */       
/* 2602 */       if (paramaf.bx())
/*      */       {
/* 2604 */         return true;
/*      */       }
/*      */       
/* 2607 */       if (paramaf.ai())
/*      */       {
/* 2609 */         return true;
/*      */       }
/* 2611 */       return false;
/*      */     } 
/*      */     
/* 2614 */     if (paraml == l.g)
/*      */     {
/* 2616 */       return false;
/*      */     }
/*      */     
/* 2619 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h(String paramString) {
/* 2628 */     l.d("Map Script: " + paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(a parama) {
/* 2634 */     if (g())
/*      */     {
/* 2636 */       h("Activiated trigger:" + parama.a + " (id:" + parama.b + ")");
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean g() {
/* 2642 */     return (a && (l.u()).aV);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void i(String paramString) {
/* 2649 */     ad.f("Map ScriptError: " + paramString);
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
/*      */   public void a(int paramInt) {
/* 2673 */     for (a a : this.J) {
/*      */ 
/*      */ 
/*      */       
/* 2677 */       if (a.j)
/*      */       {
/* 2679 */         if (a.q != -1)
/*      */         {
/* 2681 */           if (paramInt >= a.k + a.q) {
/*      */             
/* 2683 */             a.j = false;
/* 2684 */             a.u = false;
/*      */           } 
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 2690 */       if (!a.j)
/*      */       {
/*      */         
/* 2693 */         if (!a.u)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2774 */           if (a.d())
/*      */           {
/* 2776 */             a.u = true;
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 2783 */       if (a.j || a.u)
/*      */       {
/* 2785 */         if (a.e.b()) {
/*      */           
/* 2787 */           a.j = false;
/* 2788 */           a.u = false;
/*      */           
/* 2790 */           a.m = true;
/*      */         } 
/*      */       }
/*      */       
/* 2794 */       if (a.j)
/*      */       {
/* 2796 */         if (a.p > 0)
/*      */         {
/* 2798 */           if (paramInt >= a.k + a.p)
/*      */           {
/* 2800 */             a.u = true;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/* 2805 */       if (a.u) {
/*      */         
/* 2807 */         a.u = false;
/*      */ 
/*      */ 
/*      */         
/*      */         try {
/* 2812 */           d.a(this, a);
/*      */         }
/* 2814 */         catch (com.corrodinggames.rts.game.b.f f1) {
/*      */           
/* 2816 */           f1.printStackTrace();
/* 2817 */           a.g("Error activating trigger: " + f1.getMessage());
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
/*      */   public boolean h() {
/* 2835 */     boolean bool = false;
/*      */ 
/*      */     
/* 2838 */     l l1 = l.u();
/*      */     
/* 2840 */     af[] arrayOfAf = af.bj.a(); byte b; int i;
/* 2841 */     for (b = 0, i = af.bj.size(); b < i; b++) {
/*      */       
/* 2843 */       af af = arrayOfAf[b];
/* 2844 */       if (af.bB == m.g && af instanceof r && af.bG())
/*      */       {
/* 2846 */         if (!af.o()) {
/*      */           byte b1;
/*      */           int j;
/* 2849 */           for (b1 = 0, j = af.bj.size(); b1 < j; b1++) {
/*      */             boolean bool1;
/* 2851 */             af af1 = arrayOfAf[b1];
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 2856 */             if (!l1.ao()) {
/*      */               
/* 2858 */               bool1 = (af1.bB == l1.bb) ? true : false;
/*      */             }
/*      */             else {
/*      */               
/* 2862 */               bool1 = !af1.bB.r ? true : false;
/*      */             } 
/*      */             
/* 2865 */             if (bool1 && af1.bB != af.bB && af1 instanceof r)
/*      */             {
/* 2867 */               if (!af1.i() && af1.bG())
/*      */               {
/* 2869 */                 if (com.corrodinggames.rts.gameFramework.f.a(af1.dH, af1.dI, af.dH, af.dI) < 28900.0F) {
/*      */                   
/* 2871 */                   af.c(af1.bB);
/*      */ 
/*      */                   
/* 2874 */                   af.cl = 60.0F;
/* 2875 */                   bool = true;
/*      */ 
/*      */ 
/*      */                   
/*      */                   break;
/*      */                 } 
/*      */               }
/*      */             }
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 2889 */     return bool;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
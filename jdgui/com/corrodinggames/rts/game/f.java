/*      */ package com.corrodinggames.rts.game;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.gameFramework.b.e;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ public class f extends az { public strictfp void a() { a.remove(this); super.a(); } private static final f bm = new f(true); public static strictfp f a(f paramf) { f f1 = bm; f1.aD = -1; if (paramf == null) { f1.am = 1.0F; f1.ak = 1.0F; f1.al = 1.0F; f1.an = 0.0F; }
/*      */     else { f1.am = paramf.am; f1.ak = paramf.ak; f1.al = paramf.al; f1.an = paramf.an; }
/*      */      return f1; } public strictfp void a(af paramaf, float paramFloat1, float paramFloat2, float paramFloat3) { this.j = paramaf; this.dH = paramFloat1; this.dI = paramFloat2; this.dJ = paramFloat3; this.bn = false; this.V = false; } public strictfp void b() { if (this.D) { l l = l.u(); e e1 = l.bz.d(this.dH, this.dI, this.dJ, 0); if (e1 != null) { e1.H = 0.7F; e1.G = 2.1F; e1.aq = 2; e1.W = 90.0F; e1.X = e1.W; }
/*      */        l.bu.a(e.o, 0.8F, this.dH, this.dI); }
/*      */      a(); } public strictfp void a(ap paramap) { paramap.a(this.h); paramap.a(this.j); paramap.a(this.l); paramap.a(this.t); paramap.a(99); paramap.a(this.A); paramap.a(this.B); paramap.a(this.S); paramap.a(this.T); paramap.a(this.U); paramap.a(this.Y); paramap.a(this.Z); paramap.a(this.ar); paramap.a(this.aH); paramap.a(this.aI); paramap.a(this.aJ); paramap.a(this.aK); paramap.a(this.aL); paramap.a(this.aM); paramap.a(this.aN); paramap.a(this.aQ); paramap.a(this.aR); paramap.a(this.bn); paramap.a(this.aS); paramap.a(this.M); paramap.a(this.P); paramap.a(this.r); paramap.a(this.s); paramap.a(this.as); paramap.a(this.at); paramap.a(this.az); paramap.a(this.aA); paramap.a(this.aB); paramap.a(this.aC); paramap.a(false); paramap.a(0.0F); paramap.a(0.0F); paramap.a(this.E); paramap.a(this.F); paramap.a(this.J); paramap.a(this.K); paramap.a(this.L); paramap.a(this.m); paramap.a(this.n); paramap.a(this.o); paramap.a(this.C); paramap.a(this.D); paramap.a((w)this.q); paramap.a(this.aV); paramap.a(this.aW); paramap.a(this.aX); paramap.a(this.V); paramap.a(this.W); paramap.a(this.X); paramap.a(this.aU); paramap.a(this.R); paramap.a(this.ao); paramap.a(this.ap); paramap.a(this.Q); paramap.a(this.x); paramap.a(this.aa); paramap.a(this.ad); paramap.a(this.G); paramap.a(this.H); paramap.a(this.ae); paramap.a(this.aG); paramap.a(this.z); paramap.a(this.y); paramap.a(this.aO); paramap.a(this.i); paramap.a(this.aY); paramap.a(this.af); paramap.a(this.ag); paramap.a(this.ah); paramap.a(this.ai); paramap.a(this.aj); paramap.a(0); paramap.a(0.0F); paramap.a(0.0F); paramap.a(null); paramap.a(0); paramap.a(false); h.a(this.aE, paramap); paramap.a(this.ak); paramap.a(this.al); paramap.a(this.ab); paramap.a(this.ac); paramap.a(this.an); paramap.a(false); g.a(this.g, paramap); boolean bool = (this.au != null && !this.au.dC) ? true : false; paramap.a(bool); if (bool) { paramap.a(this.au); paramap.a(this.aw); paramap.a(this.ax); paramap.a(this.ay); }
/*      */      paramap.a(this.k); paramap.a(this.aD); paramap.a(this.am); paramap.a(this.p); paramap.a(this.av); super.a(paramap); } public strictfp void a(k paramk) { this.h = paramk.g(); this.j = paramk.n(); this.l = paramk.a(m.a); this.t = paramk.g(); this.x = paramk.f(); this.A = paramk.e(); this.B = paramk.e(); this.S = paramk.e(); this.T = paramk.e(); this.U = paramk.g(); this.Y = paramk.g(); this.Z = paramk.g(); this.ar = paramk.f(); this.aH = paramk.e(); this.aI = paramk.g(); this.aJ = paramk.g(); this.aK = paramk.e(); this.aL = paramk.g(); this.aM = paramk.e(); this.aN = paramk.g(); this.aQ = paramk.e(); this.aR = paramk.e(); this.bn = paramk.e(); if (paramk.b() >= 7)
/*      */       this.aS = paramk.e();  if (paramk.b() >= 13) { this.M = paramk.e(); this.P = paramk.t(); }
/*      */      if (paramk.b() >= 16) { this.r = paramk.g(); this.s = paramk.g(); }
/*      */      if (paramk.b() >= 17) { this.as = paramk.e(); this.at = paramk.e(); this.az = paramk.g(); this.aA = paramk.g(); this.aB = paramk.e(); this.aC = paramk.e(); }
/*      */      if (paramk.b() >= 18) { paramk.e(); paramk.g(); paramk.g(); }
/*      */      if (paramk.b() >= 28) {
/*      */       this.E = paramk.e(); this.F = paramk.g(); this.J = paramk.g(); this.K = paramk.g(); this.L = paramk.g();
/*      */     }  if (paramk.b() >= 29) {
/*      */       this.m = paramk.e(); this.n = paramk.g(); this.o = paramk.g(); this.C = paramk.e(); this.D = paramk.e(); this.q = (f)paramk.a(f.class); this.aV = paramk.g(); this.aW = paramk.g(); this.aX = paramk.g(); this.V = paramk.e(); this.W = paramk.g(); this.X = paramk.g(); this.aU = paramk.e(); this.R = paramk.t(); this.ao = paramk.e(); m m1 = new m(); paramk.a(m1, af.class); if (m1.size() > 0)
/*      */         this.ap = m1;  this.Q = paramk.t();
/*      */     }  if (paramk.b() >= 35) {
/*      */       this.x = paramk.g(); this.aa = paramk.e(); this.ad = paramk.e(); this.G = paramk.e();
/*      */     }  if (paramk.b() >= 38)
/*      */       this.H = paramk.g();  if (paramk.b() >= 39)
/*      */       this.ae = paramk.e();  if (paramk.b() >= 41)
/*      */       this.aG = paramk.e();  if (paramk.b() >= 43) {
/*      */       this.z = paramk.e(); this.y = paramk.g();
/*      */     }  if (paramk.b() >= 44)
/*      */       this.aO = paramk.g();  if (paramk.b() >= 47)
/*      */       this.i = paramk.g();  if (paramk.b() >= 48)
/*      */       this.aY = paramk.e();  if (paramk.b() >= 59) {
/*      */       this.af = paramk.e(); this.ag = paramk.g(); this.ah = paramk.g(); this.ai = paramk.g();
/*      */     }  if (paramk.b() >= 60) {
/*      */       this.aj = paramk.g(); paramk.f(); paramk.g(); paramk.g();
/*      */     }  if (paramk.b() >= 62) {
/*      */       paramk.p(); paramk.f(); paramk.e();
/*      */     }  if (paramk.b() >= 63)
/*      */       this.aE = h.a(paramk);  if (paramk.b() >= 64) {
/*      */       this.ak = paramk.g(); this.al = paramk.g();
/*      */     }  if (paramk.b() >= 66) {
/*      */       this.ab = paramk.e(); this.ac = paramk.e();
/*      */     }  if (paramk.b() >= 67)
/*      */       if (paramk.b() < 78)
/*      */         au.a(paramk, true);   if (paramk.b() >= 68)
/*      */       this.an = paramk.g();  if (paramk.b() >= 77)
/*      */       paramk.e();  if (paramk.b() >= 78)
/*      */       this.g = g.a(paramk);  if (paramk.b() >= 81) {
/*      */       boolean bool = paramk.e(); if (bool) {
/*      */         this.au = paramk.a(w.class); this.aw = paramk.g(); this.ax = paramk.g(); this.ay = paramk.g();
/*      */       } 
/*      */     }  if (paramk.b() >= 83) {
/*      */       this.k = paramk.t(); this.aD = paramk.f();
/*      */     }  if (paramk.b() >= 88)
/*      */       this.am = paramk.g();  if (paramk.b() >= 89) {
/*      */       this.p = paramk.g(); this.av = paramk.f();
/*   57 */     }  super.a(paramk); } public static final m a = new m(); static e b = null; static e c = null; static e d = null; static final Rect e = new Rect(); static final RectF f = new RectF(); public g g; public float h; public float i; public af j; public short k; public af l; public boolean m; public float n; public float o; public float p; public f q; public float r; public float s;
/*      */   public float t;
/*      */   public float u;
/*      */   public float v;
/*      */   
/*      */   public strictfp f(boolean paramBoolean) {
/*   63 */     super(paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  684 */     this.g = g.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  691 */     this.k = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  706 */     this.r = -1.0F;
/*  707 */     this.s = 0.1F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  717 */     this.x = 2.0F;
/*  718 */     this.y = -1.0F;
/*      */ 
/*      */     
/*  721 */     this.z = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  737 */     this.H = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  750 */     this.P = -1;
/*      */     
/*  752 */     this.Q = -1;
/*      */     
/*  754 */     this.R = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  761 */     this.S = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  770 */     this.V = false;
/*  771 */     this.W = 0.0F;
/*  772 */     this.X = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  779 */     this.ab = false;
/*  780 */     this.ac = false;
/*      */     
/*  782 */     this.ad = false;
/*      */     
/*  784 */     this.ae = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  797 */     this.ai = 1.0F;
/*  798 */     this.aj = 1.0F;
/*      */     
/*  800 */     this.ak = 1.0F;
/*  801 */     this.al = 1.0F;
/*      */     
/*  803 */     this.am = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  813 */     this.ar = aq;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  824 */     this.av = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  869 */     this.aI = 40.0F;
/*  870 */     this.aJ = 60.0F;
/*  871 */     this.aK = false;
/*  872 */     this.aL = 2.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  889 */     this.aR = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  901 */     this.aT = 0.0F;
/*      */     if (!paramBoolean)
/*      */       a.add(this); 
/*      */   }
/*      */   public float w; public float x; public float y; public boolean z; public boolean A; public boolean B; public boolean C; public boolean D; public boolean E; public float F; public boolean G; public float H; public float I; public float J; public float K; public float L; public boolean M;
/*      */   public float N;
/*      */   public float[] O;
/*      */   public short P;
/*      */   public short Q;
/*      */   public short R;
/*      */   public boolean S;
/*      */   public boolean T;
/*      */   public float U;
/*      */   public boolean V;
/*      */   public float W;
/*      */   public float X;
/*      */   
/*      */   public strictfp void d() {
/*  919 */     this.aS = true;
/*      */   } public float Y; public float Z; public boolean aa; public boolean ab; public boolean ac; public boolean ad; public boolean ae; public boolean af; public float ag; public float ah; public float ai; public float aj; public float ak; public float al; public float am; public float an; public boolean ao; public m ap; public static strictfp void c() {
/*      */     l l = l.u();
/*      */     b = l.bw.a(R.drawable.projectiles);
/*      */     c = l.bw.a(R.drawable.projectiles2);
/*      */     d = l.bw.a(R.drawable.projectiles_large);
/*      */   } static final int aq = Color.a(255, 255, 255, 255); public int ar; public boolean as; public boolean at; public w au; public int av; public float aw; public float ax; public float ay; public float az; public float aA; public boolean aB; public boolean aC; public int aD; public i aE; public float aF; public boolean aG; public boolean aH; public float aI; public float aJ; public boolean aK; public float aL; public boolean aM; public float aN; public float aO; public e aP; public boolean aQ; public boolean aR; private boolean bn; public boolean aS; public float aT; public boolean aU; float aV; float aW; float aX; public boolean aY; public boolean aZ; public static strictfp f a(af paramaf, float paramFloat1, float paramFloat2) {
/*  926 */     f f1 = new f(false);
/*  927 */     f1.j = paramaf;
/*  928 */     f1.dH = paramFloat1;
/*  929 */     f1.dI = paramFloat2;
/*  930 */     f1.ar = Color.a(255, 100, 30, 30);
/*      */     
/*  932 */     f1.dG = paramaf.dG + 1;
/*      */     
/*  934 */     f1.dF = 4;
/*      */ 
/*      */     
/*  937 */     return f1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp f a(af paramaf, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*  942 */     f f1 = a(paramaf, paramFloat1, paramFloat2);
/*  943 */     f1.dJ = paramFloat3;
/*      */     
/*  945 */     f1.k = (short)paramInt;
/*      */     
/*  947 */     f1.I = com.corrodinggames.rts.gameFramework.f.b(paramaf, 0.0F, 1.0F, paramaf.bi);
/*  948 */     paramaf.bi++;
/*      */     
/*  950 */     return f1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(af paramaf) {
/*  957 */     if (this.ag != 0.0F || this.ah != 0.0F) {
/*      */       float f2;
/*  959 */       if (paramaf.bw()) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*  964 */       float f1 = com.corrodinggames.rts.gameFramework.f.a(this.aV, this.aW, paramaf.dH, paramaf.dI);
/*      */ 
/*      */ 
/*      */       
/*  968 */       if (f1 > 100.0F) {
/*      */         
/*  970 */         f2 = com.corrodinggames.rts.gameFramework.f.d(this.aV, this.aW, paramaf.dH, paramaf.dI);
/*      */       }
/*      */       else {
/*      */         
/*  974 */         f2 = this.az;
/*      */       } 
/*      */       
/*  977 */       float f3 = this.ah;
/*      */ 
/*      */       
/*  980 */       f3 += this.ag / paramaf.bB();
/*      */ 
/*      */       
/*  983 */       paramaf.bH += com.corrodinggames.rts.gameFramework.f.i(f2) * f3;
/*  984 */       paramaf.bI += com.corrodinggames.rts.gameFramework.f.h(f2) * f3;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf1, af paramaf2, float paramFloat, f paramf, boolean paramBoolean) {
/*  993 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1010 */     if (l.bf && paramFloat > 0.0F)
/*      */     {
/* 1012 */       paramFloat = 0.0F;
/*      */     }
/*      */ 
/*      */     
/* 1016 */     if (paramaf2 != null && !paramaf2.bz) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1035 */       if (paramf != null && paramf.g.ba)
/*      */       {
/* 1037 */         if (paramaf1 != null)
/*      */         {
/* 1039 */           paramaf2.c(paramaf1.bB);
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 1044 */       if (paramf != null) {
/*      */         
/* 1046 */         if (paramf.ai != 1.0F)
/*      */         {
/* 1048 */           if (paramaf2.bw())
/*      */           {
/* 1050 */             paramFloat *= paramf.ai;
/*      */           }
/*      */         }
/*      */         
/* 1054 */         if (paramf.aj != 1.0F)
/*      */         {
/* 1056 */           if (paramaf2.i())
/*      */           {
/* 1058 */             paramFloat *= paramf.aj;
/*      */           }
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1064 */       if (paramFloat < 0.0F) {
/*      */ 
/*      */         
/* 1067 */         float f1 = paramaf2.b(paramaf1, -paramFloat, paramf);
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/* 1073 */         boolean bool = (!paramaf2.bz && paramaf2.bY > 0.0F) ? true : false;
/*      */         
/* 1075 */         float f1 = paramaf2.a(paramaf1, paramFloat, paramf);
/*      */         
/* 1077 */         float f2 = paramFloat;
/*      */         
/* 1079 */         if (paramaf2.J())
/*      */         {
/* 1081 */           f2 = 0.0F;
/*      */         }
/*      */         
/* 1084 */         if (f2 > 0.0F)
/*      */         {
/* 1086 */           l.bG.a(paramaf1, paramaf2, f2);
/*      */         }
/*      */         
/* 1089 */         if (paramaf1 != null) {
/*      */           
/* 1091 */           paramaf1.cx += f2;
/*      */           
/* 1093 */           if (bool)
/*      */           {
/* 1095 */             if (paramaf2.bz || paramaf2.bY < 0.0F) {
/*      */               
/* 1097 */               paramaf1.cw++;
/*      */               
/* 1099 */               if (paramaf1 instanceof k)
/*      */               {
/* 1101 */                 ((k)paramaf1).a(ab.d);
/*      */               }
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1111 */       if (paramf != null)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 1116 */         if (!paramaf2.bz) {
/*      */           
/* 1118 */           float f1 = paramaf2.bE();
/*      */           
/* 1120 */           if (f1 != -1.0F) {
/*      */             
/* 1122 */             float f2 = 100.0F;
/*      */ 
/*      */             
/* 1125 */             float f3 = com.corrodinggames.rts.gameFramework.f.d(paramf.dH, paramf.dI, paramaf2.dH, paramaf2.dI);
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1130 */             f2 /= f1;
/*      */ 
/*      */             
/* 1133 */             paramaf2.bH += com.corrodinggames.rts.gameFramework.f.i(f3) * f2;
/* 1134 */             paramaf2.bI += com.corrodinggames.rts.gameFramework.f.h(f3) * f2;
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
/* 1152 */   public static final q ba = new q();
/*      */   
/* 1154 */   public static final Paint bb = new Paint();
/*      */   
/*      */   public static final Paint bc;
/* 1157 */   public static final Paint bd = new Paint();
/* 1158 */   public static final Paint be = new Paint();
/*      */   
/* 1160 */   public static final Paint bf = new Paint();
/*      */   
/* 1162 */   public static final Paint bg = new Paint();
/*      */   
/* 1164 */   public static final Paint bh = new Paint(); public static final u bi; public q bj;
/*      */   public static q bk;
/*      */   public static int bl;
/*      */   
/* 1168 */   static { bc = (Paint)new q();
/* 1169 */     bc.b(-16777216);
/* 1170 */     bc.c(108);
/*      */ 
/*      */     
/* 1173 */     bd.a(80, 255, 0, 0);
/* 1174 */     bd.a(true);
/* 1175 */     bd.a(5.0F);
/*      */     
/* 1177 */     be.a(30, 255, 0, 0);
/* 1178 */     be.a(true);
/* 1179 */     be.a(8.0F);
/*      */     
/* 1181 */     bf.a(80, 128, 166, 255);
/* 1182 */     bf.a(true);
/* 1183 */     bf.a(5.0F);
/*      */ 
/*      */ 
/*      */     
/* 1187 */     bg.a(150, 224, 239, 255);
/* 1188 */     bg.a(true);
/* 1189 */     bg.a(3.0F);
/*      */ 
/*      */     
/* 1192 */     bh.a(110, 224, 239, 255);
/* 1193 */     bh.a(true);
/* 1194 */     bh.a(8.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2742 */     bi = new u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3572 */     bk = null;
/* 3573 */     bl = 0; }
/*      */    public strictfp float e() {
/*      */     float f1 = 1.0F;
/*      */     if (this.J < this.F)
/*      */       f1 = this.J / this.F; 
/*      */     return f1;
/*      */   }
/*      */   public strictfp void a(float paramFloat1, float paramFloat2, i parami) {
/* 3581 */     l l = l.u();
/*      */ 
/*      */     
/* 3584 */     if (this.j == null) {
/*      */       
/* 3586 */       l.b("Projectile: cannot Retarget: source==null");
/*      */     }
/*      */     else {
/*      */       
/* 3590 */       float f1 = this.dH + com.corrodinggames.rts.gameFramework.f.i(this.az) * paramFloat2;
/* 3591 */       float f2 = this.dI + com.corrodinggames.rts.gameFramework.f.h(this.az) * paramFloat2;
/*      */       
/* 3593 */       float f3 = paramFloat1;
/* 3594 */       float f4 = f3 * f3;
/*      */       
/* 3596 */       float f5 = -1.0F;
/*      */ 
/*      */ 
/*      */       
/* 3600 */       r r = null;
/* 3601 */       af af1 = null;
/* 3602 */       if (this.j instanceof r) {
/*      */         
/* 3604 */         r = (r)this.j;
/* 3605 */         af1 = r.Z();
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3612 */       for (af af2 : l.bK.a(f1, f2, f3)) {
/*      */         
/* 3614 */         if (this.j.bB != af2.bB) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 3621 */           boolean bool = true;
/*      */           
/* 3623 */           if (r != null)
/*      */           {
/* 3625 */             bool = r.b(af2, true);
/*      */           }
/*      */           
/* 3628 */           if (bool && this.k >= 0)
/*      */           {
/* 3630 */             if (r != null && this.k < r.bg())
/*      */             {
/* 3632 */               if (!r.a(this.k, af2, true, false))
/*      */               {
/* 3634 */                 bool = false;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/* 3639 */           if (parami != null)
/*      */           {
/* 3641 */             if (!h.a(parami, af2.cM()))
/*      */             {
/* 3643 */               bool = false;
/*      */             }
/*      */           }
/*      */ 
/*      */           
/* 3648 */           if (bool) {
/*      */             
/* 3650 */             float f6 = com.corrodinggames.rts.gameFramework.f.a(f1, f2, af2.dH, af2.dI);
/* 3651 */             boolean bool1 = false;
/* 3652 */             if (f5 == -1.0F || f6 < f5)
/*      */             {
/* 3654 */               bool1 = true;
/*      */             }
/* 3656 */             if (af1 == af2)
/*      */             {
/* 3658 */               bool1 = true;
/*      */             }
/*      */             
/* 3661 */             if (bool1 && f6 < f4) {
/*      */               
/* 3663 */               f5 = f6;
/* 3664 */               this.l = af2;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp void a(float paramFloat) {
/*      */     float f1, f2, f3, f4;
/*      */     l l = l.u();
/*      */     if (this.aS)
/*      */       a(); 
/*      */     if (this.l == null && !this.aC) {
/*      */       a();
/*      */       return;
/*      */     } 
/*      */     if (this.i > 0.0F) {
/*      */       this.i = com.corrodinggames.rts.gameFramework.f.a(this.i, paramFloat);
/*      */       if (this.i > 0.0F)
/*      */         return; 
/*      */     } 
/*      */     g g1 = this.g;
/*      */     if (this.i == 0.0F) {
/*      */       this.i = -1.0F;
/*      */       if (g1.ak != null) {
/*      */         m m1 = null;
/*      */         boolean bool5 = false;
/*      */         af af1 = this.j;
/*      */         f f9 = this;
/*      */         af af2 = null;
/*      */         g1.ak.a(this.dH, this.dI, this.dJ, this.az, af1, m1, bool5, this.aD + 1, f9, af2);
/*      */       } 
/*      */     } 
/*      */     this.h = com.corrodinggames.rts.gameFramework.f.a(this.h, paramFloat);
/*      */     boolean bool1 = false;
/*      */     if (this.aG)
/*      */       if (this.l == null) {
/*      */         bool1 = true;
/*      */       } else if (this.l.bz) {
/*      */         bool1 = true;
/*      */       }  
/*      */     if (bool1)
/*      */       a(g1.aw, g1.ax, (i)null); 
/*      */     if (g1.ay) {
/*      */       this.aF = com.corrodinggames.rts.gameFramework.f.a(this.aF, paramFloat);
/*      */       if (this.aF == 0.0F) {
/*      */         this.aF = g1.az;
/*      */         bool1 = true;
/*      */         a(g1.aA, g1.aB, g1.aC);
/*      */       } 
/*      */     } 
/*      */     if (g1.Q != 0.0F || g1.R != 0.0F) {
/*      */       f1 = g1.Q;
/*      */       if (this.l != null)
/*      */         f1 += this.l.bO * g1.R; 
/*      */       this.K = com.corrodinggames.rts.gameFramework.f.h((360.0F * this.I + this.J * 1.0F) % 360.0F) * f1;
/*      */       this.L = com.corrodinggames.rts.gameFramework.f.h((360.0F * this.I + this.J * 1.5F) % 360.0F) * f1;
/*      */     } 
/*      */     if (this.E)
/*      */       if (this.l != null) {
/*      */         this.K = com.corrodinggames.rts.gameFramework.f.h(this.J * 1.0F % 360.0F) * this.l.bO * 0.4F;
/*      */         this.L = com.corrodinggames.rts.gameFramework.f.h(this.J * 1.5F % 360.0F) * this.l.bO * 0.4F;
/*      */         f1 = this.l.dH + this.K;
/*      */         f2 = this.l.dI + this.L;
/*      */         if (this.dE) {
/*      */           this.aN += paramFloat;
/*      */           this.aO += paramFloat;
/*      */           if (this.aN > 11.0F) {
/*      */             this.aN = com.corrodinggames.rts.gameFramework.f.c(1.0F, 4.0F);
/*      */             boolean bool5 = false;
/*      */             e e1 = l.bz.b(f1, f2, this.l.dJ, d.a, bool5, h.b);
/*      */             if (e1 != null) {
/*      */               e1.ap = 0;
/*      */               e1.ao = 0;
/*      */               e1.aq = 2;
/*      */               e1.s = true;
/*      */               e1.F = 0.5F;
/*      */               e1.X = 60.0F;
/*      */               e1.W = 60.0F;
/*      */               e1.H = 0.7F;
/*      */               e1.G = 0.3F;
/*      */               e1.ar = false;
/*      */               e1.Q = com.corrodinggames.rts.gameFramework.f.c(-0.3F, 0.3F);
/*      */               e1.R = -0.9F + com.corrodinggames.rts.gameFramework.f.c(-0.3F, 0.3F);
/*      */             } 
/*      */           } 
/*      */           if (this.aO > 75.0F) {
/*      */             this.aO = com.corrodinggames.rts.gameFramework.f.c(1.0F, 20.0F);
/*      */             l.bz.b(f1, f2, this.l.dJ);
/*      */           } 
/*      */         } 
/*      */       }  
/*      */     float f5 = 5.0F;
/*      */     boolean bool = false;
/*      */     boolean bool2 = false;
/*      */     if (!this.aC) {
/*      */       float f9 = this.l.dH + this.K;
/*      */       float f10 = this.l.dI + this.L;
/*      */       float f11 = this.l.dJ;
/*      */       f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, f9, f10);
/*      */       f2 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, f9, f10);
/*      */       f4 = f11;
/*      */       f3 = f4 - this.dJ;
/*      */       f5 = this.l.bO;
/*      */       bool = this.l instanceof com.corrodinggames.rts.game.units.d.c;
/*      */       bool2 = (this.l.cb > 10.0F + this.U) ? true : false;
/*      */     } else {
/*      */       f2 = 999.0F;
/*      */       f3 = 0.0F;
/*      */       f1 = this.az;
/*      */       f4 = 0.0F;
/*      */       if (this.q != null) {
/*      */         float f9 = this.q.dH + this.K;
/*      */         float f10 = this.q.dI + this.L;
/*      */         float f11 = this.q.dJ;
/*      */         f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, f9, f10);
/*      */         f2 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, f9, f10);
/*      */         f4 = f11;
/*      */         f3 = f4 - this.dJ;
/*      */       } else if (this.l != null) {
/*      */         float f9 = this.l.dH + this.K;
/*      */         float f10 = this.l.dI + this.L;
/*      */         float f11 = this.l.dJ;
/*      */         f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, f9, f10);
/*      */         f2 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, f9, f10);
/*      */         f4 = f11;
/*      */         f3 = f4 - this.dJ;
/*      */         f5 = this.l.bO;
/*      */         bool = this.l instanceof com.corrodinggames.rts.game.units.d.c;
/*      */         bool2 = (this.l.cb > 10.0F + this.U) ? true : false;
/*      */       } else if (this.m) {
/*      */         float f9 = this.n + this.K;
/*      */         float f10 = this.o + this.L;
/*      */         float f11 = this.p;
/*      */         f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, f9, f10);
/*      */         f2 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, f9, f10);
/*      */         f4 = f11;
/*      */         f3 = f4 - this.dJ;
/*      */       } else {
/*      */         float f9 = this.n + this.K;
/*      */         float f10 = this.o + this.L;
/*      */         float f11 = 0.0F;
/*      */         f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, f9, f10);
/*      */         f2 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, f9, f10);
/*      */         f4 = f11;
/*      */         f3 = f4 - this.dJ;
/*      */       } 
/*      */     } 
/*      */     float f6 = g1.N;
/*      */     if (f2 < 225.0F)
/*      */       f6 = g1.O; 
/*      */     if (f6 >= 0.0F) {
/*      */       float f9 = com.corrodinggames.rts.gameFramework.f.c(this.az, f1, f6 * paramFloat);
/*      */       this.az += f9;
/*      */       f1 = this.az;
/*      */     } else {
/*      */       this.az = f1;
/*      */     } 
/*      */     boolean bool3 = false;
/*      */     boolean bool4 = false;
/*      */     float f7 = f1;
/*      */     if (this.au != null && !this.au.dC) {
/*      */       float f9, f10, f11;
/*      */       if (this.av >= 0) {
/*      */         r r = (r)this.au;
/*      */         if (this.av >= r.bg())
/*      */           this.av = 0; 
/*      */         ag ag = r.D(this.av);
/*      */         f9 = ag.a;
/*      */         f10 = ag.b;
/*      */         f11 = this.j.dJ + ag.c;
/*      */       } else {
/*      */         f9 = this.au.dH;
/*      */         f10 = this.au.dI;
/*      */         f11 = this.au.dJ;
/*      */       } 
/*      */       float f12 = f9 - this.aw;
/*      */       float f13 = f10 - this.ax;
/*      */       float f14 = f11 - this.ay;
/*      */       this.dH += f12;
/*      */       this.dI += f13;
/*      */       this.dJ += f14;
/*      */       this.aw = f9;
/*      */       this.ax = f10;
/*      */       this.ay = f11;
/*      */     } 
/*      */     if (!this.A) {
/*      */       this.dH += this.u * paramFloat;
/*      */       this.dI += this.v * paramFloat;
/*      */       this.dJ += this.w * paramFloat;
/*      */       if (g1.G != 0.0F && this.dJ > 0.0F) {
/*      */         this.dJ -= g1.G * paramFloat;
/*      */         f3 = f4 - this.dJ;
/*      */       } 
/*      */       if (!this.aH || this.aI < this.dJ || this.aK) {
/*      */         float f9 = this.t * paramFloat;
/*      */         bool3 = true;
/*      */         if (f2 < f9 * f9) {
/*      */           f9 = com.corrodinggames.rts.gameFramework.f.a(f2);
/*      */           f2 = 0.0F;
/*      */         } 
/*      */         this.dH += com.corrodinggames.rts.gameFramework.f.i(f1) * f9;
/*      */         this.dI += com.corrodinggames.rts.gameFramework.f.h(f1) * f9;
/*      */       } 
/*      */       if (this.aH) {
/*      */         float f9;
/*      */         if (this.aL < 0.0F) {
/*      */           f9 = this.t * paramFloat;
/*      */           bool3 = true;
/*      */         } else {
/*      */           f9 = this.aL * paramFloat;
/*      */         } 
/*      */         if (!this.aK) {
/*      */           this.dJ = com.corrodinggames.rts.gameFramework.f.a(this.dJ, this.aJ, f9);
/*      */           if (this.dJ < this.aI)
/*      */             f7 = -90.0F; 
/*      */           if (this.dJ >= this.aJ)
/*      */             this.aK = true; 
/*      */         } else if (f2 < 400.0F) {
/*      */           this.dJ = com.corrodinggames.rts.gameFramework.f.a(this.dJ, f4, f9);
/*      */           if (com.corrodinggames.rts.gameFramework.f.c(this.dJ - f4) > 0.5F) {
/*      */             f7 = 90.0F;
/*      */             bool4 = true;
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         float f9 = f3;
/*      */         float f10 = this.t * paramFloat;
/*      */         bool3 = true;
/*      */         if (f9 != 0.0F) {
/*      */           if (f2 > 0.1D) {
/*      */             f10 = com.corrodinggames.rts.gameFramework.f.c(f9) / com.corrodinggames.rts.gameFramework.f.a(f2) * this.t * paramFloat;
/*      */             f10 = com.corrodinggames.rts.gameFramework.f.b(f10, this.t * paramFloat);
/*      */           } 
/*      */           this.dJ += com.corrodinggames.rts.gameFramework.f.b(f3, f10);
/*      */           f3 = f4 - this.dJ;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     if (bool3)
/*      */       if (this.r > 0.0F)
/*      */         this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, this.r, this.s * paramFloat);  
/*      */     if (g1.al != 0.0F) {
/*      */       float f9 = com.corrodinggames.rts.gameFramework.f.h((this.J * 360.0F / g1.am + 360.0F * this.I) % 360.0F);
/*      */       f9 = f9 * g1.al * paramFloat;
/*      */       this.dH += com.corrodinggames.rts.gameFramework.f.i(f1 + 90.0F) * f9;
/*      */       this.dI += com.corrodinggames.rts.gameFramework.f.h(f1 + 90.0F) * f9;
/*      */     } 
/*      */     if ((this.aM || g1.ag != null) && this.dE && !this.bn) {
/*      */       this.aN += paramFloat;
/*      */       if (this.aN > g1.af) {
/*      */         this.aN = 0.0F;
/*      */         boolean bool5 = false;
/*      */         if (this.D)
/*      */           bool5 = true; 
/*      */         if (g1.ag != null)
/*      */           g1.ag.a(this.dH, this.dI, this.dJ, this.aT, (w)this); 
/*      */         if (this.aM) {
/*      */           e e1 = l.bz.b(this.dH, this.dI, this.dJ, d.a, bool5, h.b);
/*      */           if (e1 != null)
/*      */             if (this.dJ >= 0.0F) {
/*      */               e1.ap = 0;
/*      */               e1.ao = 0;
/*      */               e1.aq = 2;
/*      */               e1.s = true;
/*      */               e1.F = 0.5F;
/*      */               e1.W = 70.0F;
/*      */               e1.X = e1.W;
/*      */               e1.ar = true;
/*      */               if (bool4)
/*      */                 e1.ar = false; 
/*      */               e1.R = 0.1F;
/*      */               e1.t = true;
/*      */               e1.u = 5.0F;
/*      */               e1.H = 0.5F;
/*      */               e1.G = 1.2F;
/*      */               e1.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0F, 180.0F);
/*      */               if (this.D) {
/*      */                 e1.H = 0.5F;
/*      */                 e1.G = 2.1F;
/*      */               } 
/*      */             } else {
/*      */               e1.ap = 9;
/*      */               e1.ao = 1;
/*      */               e1.aq = 1;
/*      */               e1.s = true;
/*      */               e1.F = 0.5F;
/*      */               e1.X = 60.0F;
/*      */               e1.W = 60.0F;
/*      */               e1.R = 0.1F;
/*      */             }  
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     if (!this.bn) {
/*      */       boolean bool5 = false;
/*      */       af af1 = null;
/*      */       boolean bool6 = false;
/*      */       float f9 = 6.0F;
/*      */       if (bool) {
/*      */         f9 = f5 * 0.8F;
/*      */         if (f9 < 6.0F)
/*      */           f9 = 6.0F; 
/*      */       } 
/*      */       if (bool2)
/*      */         f9 = f5 * 1.1F; 
/*      */       if (f2 < f9 * f9 && com.corrodinggames.rts.gameFramework.f.c(f3) < 3.0F) {
/*      */         bool5 = true;
/*      */         af1 = this.l;
/*      */       } 
/*      */       if (this.A) {
/*      */         bool5 = true;
/*      */         af1 = this.l;
/*      */       } 
/*      */       if (this.af)
/*      */         if (this.h == 0.0F)
/*      */           bool5 = true;  
/*      */       if (this.as) {
/*      */         float f10 = this.aA + 50.0F;
/*      */         af[] arrayOfAf = af.bj.a();
/*      */         byte b;
/*      */         int j;
/*      */         for (b = 0, j = af.bj.size(); b < j; b++) {
/*      */           af af2 = arrayOfAf[b];
/*      */           if (af2.dH + f10 > this.dH && af2.dH - f10 < this.dH && af2.dI + f10 > this.dI && af2.dI - f10 < this.dI)
/*      */             if (af2.by)
/*      */               if (false == af2.i() && af2.cp == null) {
/*      */                 float f11 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, af2.dH, af2.dI);
/*      */                 float f12 = this.aA + af2.bO;
/*      */                 if (f11 < f12 * f12) {
/*      */                   bool5 = true;
/*      */                   af1 = af2;
/*      */                 } 
/*      */               }   
/*      */         } 
/*      */       } 
/*      */       if (this.at) {
/*      */         l.bt.a(this.dH, this.dI);
/*      */         int j = l.bt.M;
/*      */         int k = l.bt.N;
/*      */         if (l.bC.a(ah.f, j, k)) {
/*      */           bool5 = true;
/*      */           bool6 = true;
/*      */         } 
/*      */       } 
/*      */       if (this.aC);
/*      */       if (this.aY)
/*      */         if ((this.aH && bool4 && this.dJ < 30.0F) || bool5)
/*      */           if (this.j != null) {
/*      */             this.aY = false;
/*      */             n n = new n(false);
/*      */             n.dH = this.dH;
/*      */             n.dI = this.dI;
/*      */             n.a(this.j.bB);
/*      */             n.a = 15;
/*      */             n.b = 360.0F;
/*      */             m.c((af)n);
/*      */           }   
/*      */       if (bool5) {
/*      */         this.bn = true;
/*      */         this.aV = this.dH;
/*      */         this.aW = this.dI;
/*      */         this.aX = this.dJ;
/*      */         if (this.A) {
/*      */           if (this.aC) {
/*      */             this.aV = this.n;
/*      */             this.aW = this.o;
/*      */             this.aX = 0.0F;
/*      */           } 
/*      */           if (this.l != null) {
/*      */             this.aV = this.l.dH + this.K;
/*      */             this.aW = this.l.dI + this.L;
/*      */             this.aX = this.l.dJ;
/*      */           } 
/*      */         } 
/*      */         if (!this.B && !this.M && !g1.W)
/*      */           this.S = false; 
/*      */         boolean bool7 = false;
/*      */         if (this.l != null)
/*      */           bool7 = (this.l.cb > 10.0F) ? true : false; 
/*      */         x x = g1.aV;
/*      */         if (bool7)
/*      */           x = g1.aW; 
/*      */         if (this.l != null) {
/*      */           x x1 = g1.a(this.l);
/*      */           if (x1 != null)
/*      */             x = x1; 
/*      */         } 
/*      */         if (x != null)
/*      */           x.a(this.aV, this.aW, this.aX, this.aT, (w)this.l); 
/*      */         if (g1.ai != null) {
/*      */           m m1 = null;
/*      */           boolean bool8 = false;
/*      */           af af2 = this.j;
/*      */           f f10 = this;
/*      */           af af3 = this.l;
/*      */           g1.ai.a(this.dH, this.dI, this.dJ, this.az, af2, m1, bool8, this.aD + 1, f10, af3);
/*      */         } 
/*      */         if (g1.aX != null && this.j != null)
/*      */           g1.aX.a(this.aV, this.aW, 0.0F, this.az, this.j.bB, false, this.j); 
/*      */         if (g1.aY > 0 && this.j != null)
/*      */           if (this.j instanceof k) {
/*      */             k k = (k)this.j;
/*      */             for (byte b = 0; b < g1.aY; b++) {
/*      */               if (k.x != null && k.x.size() > 0) {
/*      */                 af af2 = (af)k.x.remove(k.x.size() - 1);
/*      */                 y.a(af2, (r)k);
/*      */                 af2.dH = this.aV;
/*      */                 af2.dI = this.aW;
/*      */                 af2.bL = this.az;
/*      */                 af2.bI = 0.0F;
/*      */                 af2.bH = 0.0F;
/*      */                 af2.bD = 0.0F;
/*      */                 af2.bE = 0.0F;
/*      */                 if (af2 instanceof r) {
/*      */                   r r = (r)af2;
/*      */                   r.ax();
/*      */                   r.j(af2.bL);
/*      */                   if (af2 instanceof k)
/*      */                     ((k)af2).dl(); 
/*      */                 } 
/*      */                 k.z(af2);
/*      */               } 
/*      */             } 
/*      */           }  
/*      */         if (g1.aZ && this.j != null) {
/*      */           this.j.dH = this.aV;
/*      */           this.j.dI = this.aW;
/*      */           if (this.j instanceof k)
/*      */             ((k)this.j).a(ab.h); 
/*      */         } 
/*      */         if (!bool6 && af1 != null)
/*      */           if (this.E) {
/*      */             this.bn = false;
/*      */             float f10 = this.U / 60.0F * paramFloat * e();
/*      */             if (this.Z == 0.0F)
/*      */               a(af1); 
/*      */             f10 = g1.a(af1, f10, true);
/*      */             a(this.j, af1, f10, this, false);
/*      */           } else {
/*      */             if (this.Z == 0.0F)
/*      */               a(af1); 
/*      */             float f10 = this.U;
/*      */             f10 = g1.a(af1, f10, false);
/*      */             a(this.j, af1, f10, this, false);
/*      */           }  
/*      */         if (this.q != null) {
/*      */           if (g1.d) {
/*      */             this.q.h = 0.0F;
/*      */           } else {
/*      */             this.q.b();
/*      */           } 
/*      */           a();
/*      */         } 
/*      */         if (!this.E) {
/*      */           boolean bool8 = true;
/*      */           if (this.l != null && this.l.cb > 10.0F) {
/*      */             bool8 = false;
/*      */             if (g1.aW == null) {
/*      */               e e1 = l.bz.d(this.aV, this.aW, this.aX, -1127220);
/*      */               if (e1 != null) {
/*      */                 e1.W = 10.0F;
/*      */                 e1.G = 0.5F;
/*      */                 if (this.aQ) {
/*      */                   e1.W = 25.0F;
/*      */                   e1.G = 1.0F;
/*      */                 } 
/*      */                 e1.aq = 2;
/*      */                 e1.X = e1.W;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           if (this.G) {
/*      */             bool8 = false;
/*      */             com.corrodinggames.rts.gameFramework.b.f f10 = com.corrodinggames.rts.gameFramework.b.f.b(this.dH, this.dI);
/*      */             f10.a = 21.0F;
/*      */           } 
/*      */           if (bool8) {
/*      */             if (!this.aQ) {
/*      */               if (g1.aV == null)
/*      */                 l.bz.c(this.aV, this.aW, this.aX); 
/*      */             } else if (g1.aV == null) {
/*      */               if (this.Z > 10.0F) {
/*      */                 e e1 = l.bz.d(this.aV, this.aW, this.aX, 0);
/*      */                 if (e1 != null) {
/*      */                   e1.G = this.Z / 25.0F;
/*      */                   e1.F = 0.7F;
/*      */                   if (this.aX > 5.0F)
/*      */                     e1.aq = 2; 
/*      */                 } 
/*      */               } 
/*      */               l.bz.b(this.aV, this.aW, this.aX);
/*      */               if (this.aR && !this.D) {
/*      */                 float f10 = 1.0F + com.corrodinggames.rts.gameFramework.f.c(-0.06F, 0.06F);
/*      */                 l.bu.a(e.m, 0.5F, f10, this.aV, this.aW);
/*      */               } 
/*      */             } 
/*      */             if (this.D && g1.aV == null) {
/*      */               float f10 = 0.7F;
/*      */               l.bu.a(e.B, 1.6F, f10, this.aV, this.aW);
/*      */               l.bz.b(h.e);
/*      */               e e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 255, 255));
/*      */               if (e1 != null) {
/*      */                 e1.H = 14.0F;
/*      */                 e1.G = 8.0F;
/*      */                 e1.F = 0.9F;
/*      */                 e1.W = 35.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.s = true;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.c(this.aV, this.aW, this.aX, -1127220);
/*      */               if (e1 != null) {
/*      */                 e1.H = 1.5F;
/*      */                 e1.G = 3.0F;
/*      */                 e1.aq = 2;
/*      */                 e1.W = 20.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.V = 0.0F;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.c(this.aV, this.aW, this.aX, -1127220);
/*      */               if (e1 != null) {
/*      */                 e1.H = 0.2F;
/*      */                 e1.G = 5.0F;
/*      */                 e1.aq = 2;
/*      */                 e1.W = 65.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.V = 0.0F;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 255, 255));
/*      */               if (e1 != null) {
/*      */                 e1.H = 3.0F;
/*      */                 e1.G = 6.0F;
/*      */                 e1.F = 0.9F;
/*      */                 e1.W = 290.0F;
/*      */                 e1.X = e1.W;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 244, 230));
/*      */               if (e1 != null) {
/*      */                 e1.H = 2.0F;
/*      */                 e1.G = 6.0F;
/*      */                 e1.F = 0.5F;
/*      */                 e1.W = 370.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.V = 10.0F;
/*      */               } 
/*      */               byte b;
/*      */               for (b = 0; b < 1; b++) {
/*      */                 l.bz.b(h.e);
/*      */                 e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 244, 230));
/*      */                 if (e1 != null) {
/*      */                   e1.H = 0.2F;
/*      */                   e1.G = 9.0F;
/*      */                   e1.F = 0.7F;
/*      */                   e1.W = 210.0F;
/*      */                   e1.X = e1.W;
/*      */                   e1.V = (20 + b * 110);
/*      */                 } 
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 255, 255));
/*      */               if (e1 != null) {
/*      */                 e1.H = 3.0F;
/*      */                 e1.G = 4.0F;
/*      */                 e1.F = 0.2F;
/*      */                 e1.W = 870.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.s = true;
/*      */                 e1.V = 70.0F;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 206, 255, 239));
/*      */               if (e1 != null) {
/*      */                 e1.H = 4.0F;
/*      */                 e1.G = 1.0F;
/*      */                 e1.F = 0.9F;
/*      */                 e1.W = 320.0F;
/*      */                 e1.X = e1.W;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(255, 255, 242, 129));
/*      */               if (e1 != null) {
/*      */                 e1.H = 2.0F;
/*      */                 e1.G = 1.0F;
/*      */                 e1.F = 1.0F;
/*      */                 e1.W = 340.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.t = true;
/*      */                 e1.u = 20.0F;
/*      */               } 
/*      */               l.bz.b(h.e);
/*      */               e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(245, 255, 182, 110));
/*      */               if (e1 != null) {
/*      */                 e1.H = 1.5F;
/*      */                 e1.G = 1.5F;
/*      */                 e1.F = 0.3F;
/*      */                 e1.W = 1340.0F;
/*      */                 e1.X = e1.W;
/*      */                 e1.t = true;
/*      */                 e1.u = 40.0F;
/*      */                 e1.V = 140.0F;
/*      */               } 
/*      */               for (b = 0; b < 4; b++) {
/*      */                 l.bz.b(h.e);
/*      */                 e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(225, 255, 242, 129));
/*      */                 if (e1 != null) {
/*      */                   e1.H = 1.5F;
/*      */                   e1.G = 1.4F;
/*      */                   e1.F = 1.3F;
/*      */                   e1.W = 340.0F;
/*      */                   e1.X = e1.W;
/*      */                   e1.R = -0.29F;
/*      */                   e1.t = true;
/*      */                   e1.u = 50.0F;
/*      */                   e1.V = (30 + b * 40);
/*      */                 } 
/*      */               } 
/*      */               for (b = 0; b < 2; b++) {
/*      */                 l.bz.b(h.e);
/*      */                 e1 = l.bz.a(this.aV, this.aW, this.dJ, Color.a(185, 255, 242, 129));
/*      */                 if (e1 != null) {
/*      */                   e1.H = 1.3F;
/*      */                   e1.G = 1.0F;
/*      */                   e1.F = 1.0F;
/*      */                   e1.W = 340.0F;
/*      */                   e1.X = e1.W;
/*      */                   e1.R = -0.14F;
/*      */                   e1.t = true;
/*      */                   e1.u = 50.0F;
/*      */                   e1.V = (70 + b * 70);
/*      */                 } 
/*      */               } 
/*      */               for (b = 0; b < 4; b++) {
/*      */                 l.bz.b(h.e);
/*      */                 e1 = l.bz.a(this.aV, this.aW - 30.0F, this.dJ, -16711936);
/*      */                 if (e1 != null) {
/*      */                   e1.H = 1.5F;
/*      */                   e1.G = 2.6F;
/*      */                   e1.F = 1.3F;
/*      */                   e1.W = 510.0F;
/*      */                   e1.X = e1.W;
/*      */                   e1.R = -0.2F;
/*      */                   e1.t = true;
/*      */                   e1.u = 50.0F;
/*      */                   e1.C = null;
/*      */                   e1.y = Color.a(175, 235, 235, 235);
/*      */                   e1.V = (20 + b * 40);
/*      */                 } 
/*      */               } 
/*      */               for (b = 0; b < 2; b++) {
/*      */                 l.bz.b(h.e);
/*      */                 e1 = l.bz.a(this.aV, this.aW - 30.0F, this.dJ, -16711936);
/*      */                 if (e1 != null) {
/*      */                   e1.H = 1.5F;
/*      */                   e1.G = 3.8F;
/*      */                   e1.F = 0.8F;
/*      */                   e1.W = 590.0F;
/*      */                   e1.X = e1.W;
/*      */                   e1.R = -0.2F;
/*      */                   e1.t = true;
/*      */                   e1.u = 50.0F;
/*      */                   e1.C = null;
/*      */                   e1.y = Color.a(105, 115, 115, 115);
/*      */                   e1.V = (20 + b * 40);
/*      */                 } 
/*      */               } 
/*      */               for (b = 0; b < 1; b++) {
/*      */                 com.corrodinggames.rts.gameFramework.b.f f11 = com.corrodinggames.rts.gameFramework.b.f.a(this.aV + com.corrodinggames.rts.gameFramework.f.a(-10.0F, 10.0F, (int)this.dA), this.aW + com.corrodinggames.rts.gameFramework.f.a(-10.0F, 10.0F, (int)this.dA + b));
/*      */                 if (f11 != null) {
/*      */                   f11.t = (200 + b * 70);
/*      */                   f11.a = (980 + b * 800);
/*      */                 } 
/*      */               } 
/*      */               if (!y.c(this.aV, this.aW))
/*      */                 k.a(this.aV, this.aW, l.b); 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     if (this.bn)
/*      */       if (!this.V) {
/*      */         this.W = com.corrodinggames.rts.gameFramework.f.a(this.W, paramFloat);
/*      */         if (this.ao) {
/*      */           float f9 = 1.0F - this.W / this.X;
/*      */           b(f9);
/*      */         } 
/*      */         if (this.W == 0.0F) {
/*      */           this.V = true;
/*      */           b(1.0F);
/*      */           if (!this.B && !this.M && !g1.W)
/*      */             a(); 
/*      */         } 
/*      */       }  
/*      */     this.J += paramFloat;
/*      */     if (this.h == 0.0F)
/*      */       if (!this.bn || this.V) {
/*      */         if (g1.aj != null) {
/*      */           m m1 = null;
/*      */           boolean bool5 = false;
/*      */           af af1 = this.j;
/*      */           f f9 = this;
/*      */           af af2 = null;
/*      */           g1.aj.a(this.dH, this.dI, this.dJ, this.az, af1, m1, bool5, this.aD + 1, f9, af2);
/*      */         } 
/*      */         a();
/*      */       }  
/*      */     if (!this.aU) {
/*      */       this.aT = f7;
/*      */       this.aU = true;
/*      */     } 
/*      */     float f8 = com.corrodinggames.rts.gameFramework.f.c(this.aT, f7, 12.0F * paramFloat);
/*      */     this.aT += f8;
/*      */   }
/*      */   
/*      */   public strictfp void b(float paramFloat) {
/*      */     boolean bool = false;
/*      */     if (this.g.f)
/*      */       return; 
/*      */     if (this.g.e)
/*      */       bool = true; 
/*      */     if (!bool) {
/*      */       if (this.Y != 0.0F && this.Z > 0.0F)
/*      */         bool = true; 
/*      */       if ((this.ag != 0.0F || this.ah != 0.0F) && this.Z > 0.0F)
/*      */         bool = true; 
/*      */     } 
/*      */     if (!bool)
/*      */       return; 
/*      */     float f1 = this.Z * paramFloat;
/*      */     float f2 = f1;
/*      */     if (this.g.h)
/*      */       f2 += 150.0F; 
/*      */     l l = l.u();
/*      */     bi.clear();
/*      */     l.bK.b(this.aV, this.aW, f2, bi);
/*      */     af[] arrayOfAf = bi.a();
/*      */     int j = bi.size();
/*      */     for (byte b = 0; b < j; b++) {
/*      */       af af1 = arrayOfAf[b];
/*      */       b(af1, paramFloat, f1);
/*      */     } 
/*      */     bi.clear();
/*      */   }
/*      */   
/*      */   public strictfp void b(af paramaf, float paramFloat1, float paramFloat2) {
/*      */     if (paramaf.cp != null)
/*      */       return; 
/*      */     if (this.ap != null && this.ap.contains(paramaf))
/*      */       return; 
/*      */     if (this.j != null) {
/*      */       m m1 = this.j.bB;
/*      */       m m2 = paramaf.bB;
/*      */       if (m2 != m1 && m1.d(m2))
/*      */         return; 
/*      */       if (this.aa)
/*      */         if (!m1.c(m2))
/*      */           return;  
/*      */       if (this.ab)
/*      */         if (m1.c(m2))
/*      */           return;  
/*      */     } 
/*      */     if (paramaf.dJ < -5.0F && this.aX >= -2.0F && !this.ac)
/*      */       return; 
/*      */     if (this.ae) {
/*      */       boolean bool = (this.aX >= 5.0F);
/*      */       if (paramaf.i() != bool)
/*      */         return; 
/*      */     } else if (!this.ad) {
/*      */       if (paramaf.i())
/*      */         return; 
/*      */     } 
/*      */     float f1 = com.corrodinggames.rts.gameFramework.f.a(this.aV, this.aW, paramaf.dH, paramaf.dI);
/*      */     if (f1 > paramFloat2 * paramFloat2 && !this.g.h)
/*      */       return; 
/*      */     float f2 = (float)StrictMath.sqrt(f1);
/*      */     if (this.g.h) {
/*      */       f2 -= paramaf.bO;
/*      */       if (f2 < 0.0F)
/*      */         f2 = 0.0F; 
/*      */     } 
/*      */     if (f2 > paramFloat2)
/*      */       return; 
/*      */     if (f2 < this.g.j)
/*      */       return; 
/*      */     a(paramFloat1, paramaf, f2);
/*      */   }
/*      */   
/*      */   public strictfp void a(float paramFloat1, af paramaf, float paramFloat2) {
/*      */     float f1 = 1.0F - paramFloat2 / this.Z;
/*      */     f1 = (float)(f1 + 0.1D);
/*      */     if (f1 > 1.0F)
/*      */       f1 = 1.0F; 
/*      */     if (this.g.g)
/*      */       f1 = 1.0F; 
/*      */     float f2 = f1 * this.Y;
/*      */     a(paramaf);
/*      */     f2 = this.g.a(paramaf, f2, true);
/*      */     a(this.j, paramaf, f2, this, true);
/*      */     if (this.ao) {
/*      */       if (this.ap == null)
/*      */         this.ap = new m(); 
/*      */       this.ap.add(paramaf);
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp boolean a(l paraml) {
/*      */     if (paraml.cv.b(this.dH, this.dI))
/*      */       return true; 
/*      */     if (this.B || this.E || this.g.W)
/*      */       if (this.l != null)
/*      */         if (paraml.cv.b(this.l.dH, this.l.dI))
/*      */           return true;   
/*      */     return false;
/*      */   }
/*      */   
/*      */   public strictfp boolean c(float paramFloat) {
/*      */     float f3, f4, f5;
/*      */     if (!this.S)
/*      */       return false; 
/*      */     if (this.i > 0.0F)
/*      */       return false; 
/*      */     g g1 = this.g;
/*      */     l l = l.u();
/*      */     l l1 = l.bw;
/*      */     float f1 = this.dH - l.cd;
/*      */     float f2 = this.dI - l.ce;
/*      */     if (this.l != null) {
/*      */       f3 = this.l.dH;
/*      */       f4 = this.l.dI;
/*      */       f5 = this.l.dJ;
/*      */     } else {
/*      */       f3 = this.n;
/*      */       f4 = this.o;
/*      */       f5 = this.p;
/*      */     } 
/*      */     if (!this.aZ && !this.D) {
/*      */       boolean bool = false;
/*      */       if (this.A)
/*      */         if (this.l != null) {
/*      */           if (!l.bt.a(this.l.dH, this.l.dI, l.bb))
/*      */             bool = true; 
/*      */         } else if (this.m) {
/*      */           if (!l.bt.a(this.n, this.o, l.bb))
/*      */             bool = true; 
/*      */         }  
/*      */       if (!l.bt.a(this.dH, this.dI, l.bb) && !bool)
/*      */         return false; 
/*      */       this.aZ = true;
/*      */     } 
/*      */     if (this.E || g1.W) {
/*      */       if (g1.X != null) {
/*      */         Paint paint = f();
/*      */         float f6 = 0.0F;
/*      */         float f7 = 0.0F;
/*      */         if (g1.ac != 0.0F)
/*      */           f7 += g1.ac * this.J; 
/*      */         float f8 = this.dH - l.cd;
/*      */         float f9 = this.dI - l.ce - this.dJ;
/*      */         float f10 = f3 - l.cd + this.K;
/*      */         float f11 = f4 - f5 - l.ce + this.L;
/*      */         float f12 = (f10 + f8) * 0.5F;
/*      */         float f13 = (f11 + f9) * 0.5F;
/*      */         float f14 = com.corrodinggames.rts.gameFramework.f.b(f12, f13, f10, f11);
/*      */         float f15 = com.corrodinggames.rts.gameFramework.f.d(f12, f13, f10, f11);
/*      */         l1.j();
/*      */         f.a(f12 - g1.X.m, f13 - f14, f12 + g1.X.m, f13 + f14);
/*      */         l1.a(f15 + 90.0F, f12, f13);
/*      */         l1.a(g1.X, f, paint, f6, f7, 0, 0);
/*      */         l1.k();
/*      */         if (g1.Y != null)
/*      */           if (g1.Z) {
/*      */             l1.j();
/*      */             l1.a(f15 + 90.0F, f8, f9);
/*      */             l1.a(g1.Y, f8, f9, paint);
/*      */             l1.k();
/*      */           } else {
/*      */             l1.a(g1.Y, f8, f9, paint);
/*      */           }  
/*      */         if (g1.aa != null)
/*      */           if (g1.ab) {
/*      */             l1.j();
/*      */             l1.a(f15 + 90.0F, f10, f11);
/*      */             l1.a(g1.aa, f10, f11, paint);
/*      */             l1.k();
/*      */           } else {
/*      */             l1.a(g1.aa, f10, f11, paint);
/*      */           }  
/*      */       } else {
/*      */         bf.c((int)(60.0F + e() * 60.0F));
/*      */         float f6 = f3 - l.cd + this.K;
/*      */         float f7 = f4 - f5 - l.ce + this.L;
/*      */         bf.a(6.0F);
/*      */         l1.a(this.dH - l.cd, this.dI - l.ce - this.dJ, f6, f7, bf);
/*      */         bf.a(3.0F);
/*      */         l1.a(this.dH - l.cd, this.dI - l.ce - this.dJ, f6, f7, bf);
/*      */         l1.a(f6, f7, 8.0F, bf);
/*      */         l1.a(f6, f7, 5.0F, bf);
/*      */       } 
/*      */     } else if (this.B) {
/*      */       float f6 = f3 - l.cd + this.K;
/*      */       float f7 = f4 - f5 - l.ce + this.L;
/*      */       bd.b(this.ar);
/*      */       be.b(this.ar);
/*      */       be.c((int)(be.f() * 0.5F));
/*      */       l1.a(this.dH - l.cd, this.dI - l.ce - this.dJ, f6, f7, be);
/*      */       l1.a(this.dH - l.cd, this.dI - l.ce - this.dJ, f6, f7, bd);
/*      */       l1.a(f6, f7, 5.0F, bd);
/*      */     } else if (this.M) {
/*      */       this.N = com.corrodinggames.rts.gameFramework.f.a(this.N, paramFloat);
/*      */       if (this.O == null) {
/*      */         this.O = new float[20];
/*      */         this.N = 0.0F;
/*      */       } 
/*      */       if (this.N == 0.0F) {
/*      */         this.N = 4.0F;
/*      */         for (byte b1 = 0; b1 < this.O.length; b1++)
/*      */           this.O[b1] = com.corrodinggames.rts.gameFramework.f.c(-10.0F, 10.0F); 
/*      */       } 
/*      */       float f6 = this.dH - l.cd;
/*      */       float f7 = this.dI - l.ce - this.dJ;
/*      */       float f8 = f3 - l.cd;
/*      */       float f9 = f4 - f5 - l.ce;
/*      */       float f10 = com.corrodinggames.rts.gameFramework.f.c(f6, f7, f8, f9);
/*      */       int j = this.O.length;
/*      */       if (f10 < 200.0F) {
/*      */         j = com.corrodinggames.rts.gameFramework.f.b(0, j - 5);
/*      */       } else if (f10 < 100.0F) {
/*      */         j = com.corrodinggames.rts.gameFramework.f.b(0, j - 10);
/*      */       } 
/*      */       float f11 = f10 / (j - 1);
/*      */       float f12 = com.corrodinggames.rts.gameFramework.f.d(f6, f7, f8, f9);
/*      */       float f13 = f6;
/*      */       float f14 = f7;
/*      */       float f15 = com.corrodinggames.rts.gameFramework.f.i(f12);
/*      */       float f16 = com.corrodinggames.rts.gameFramework.f.h(f12);
/*      */       for (byte b = 0; b < j; b++) {
/*      */         float f17 = this.O[b];
/*      */         float f18 = f6 + f15 * b * f11;
/*      */         float f19 = f7 + f16 * b * f11;
/*      */         if (b != j - 1) {
/*      */           f18 -= f16 * f17;
/*      */           f19 += f15 * f17;
/*      */         } 
/*      */         l1.a(f13, f14, f18, f19, bg);
/*      */         f13 = f18;
/*      */         f14 = f19;
/*      */       } 
/*      */     } else if (this.P != -1) {
/*      */       e e1 = b;
/*      */       int j = 20;
/*      */       int k = 20;
/*      */       if (this.R == 1) {
/*      */         e1 = d;
/*      */         j = 60;
/*      */         k = 60;
/*      */       } else if (this.R == 2) {
/*      */         e1 = c;
/*      */         j = 20;
/*      */         k = 20;
/*      */       } 
/*      */       if (g1.C != null) {
/*      */         e e2 = g1.C;
/*      */         int n = g1.C.k;
/*      */         int i1 = g1.C.l;
/*      */         y.a(e2, f1, f2, 0.0F, this.aT, this.x, bc, n, i1, this.Q);
/*      */       } else if (this.Q != -1 && this.z) {
/*      */         e e2 = e1;
/*      */         int n = j;
/*      */         int i1 = k;
/*      */         y.a(e2, f1, f2, 0.0F, this.aT, this.x, bc, n, i1, this.Q);
/*      */       } 
/*      */       if (g1.B != null) {
/*      */         e1 = g1.B;
/*      */         j = g1.B.k;
/*      */         k = g1.B.l;
/*      */       } 
/*      */       Paint paint = f();
/*      */       y.a(e1, f1, f2, this.dJ, this.aT, this.x, paint, j, k, this.P);
/*      */     } else {
/*      */       bb.b(this.ar);
/*      */       if (this.dJ > 0.0F && this.z)
/*      */         l1.a(f1, f2, this.x, bc); 
/*      */       l1.a(f1, f2 - this.dJ, this.x, bb);
/*      */       if (this.y > 0.0F) {
/*      */         bb.c(bb.f() / 3);
/*      */         l1.a(f1, f2 - this.dJ, this.y, bb);
/*      */       } 
/*      */     } 
/*      */     return true;
/*      */   }
/*      */   
/*      */   public strictfp void a(float paramFloat, boolean paramBoolean) {}
/*      */   
/*      */   public strictfp void d(float paramFloat) {}
/*      */   
/*      */   public strictfp void e(float paramFloat) {}
/*      */   
/*      */   public strictfp boolean f(float paramFloat) {
/*      */     return false;
/*      */   }
/*      */   
/*      */   public strictfp Paint f() {
/*      */     q q1;
/*      */     if (this.ar != aq) {
/*      */       if (l.aj()) {
/*      */         q1 = a(this.ar);
/*      */       } else {
/*      */         Paint paint = bb;
/*      */         paint.b(this.ar);
/*      */       } 
/*      */     } else {
/*      */       q1 = ba;
/*      */     } 
/*      */     return (Paint)q1;
/*      */   }
/*      */   
/*      */   public strictfp q a(int paramInt) {
/*      */     if (this.bj != null)
/*      */       return this.bj; 
/*      */     if (bk != null && bl == paramInt) {
/*      */       this.bj = bk;
/*      */       return this.bj;
/*      */     } 
/*      */     q q1 = new q();
/*      */     q1.a((ColorFilter)new LightingColorFilter(paramInt, 0));
/*      */     q1.b(paramInt);
/*      */     bk = q1;
/*      */     bl = paramInt;
/*      */     this.bj = q1;
/*      */     return this.bj;
/*      */   } }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
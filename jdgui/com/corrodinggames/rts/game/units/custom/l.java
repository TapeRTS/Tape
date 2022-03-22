/*      */ package com.corrodinggames.rts.game.units.custom;
/*      */ 
/*      */ import android.graphics.Point;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.n;
/*      */ import com.corrodinggames.rts.game.units.a.c;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.a.z;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.am;
/*      */ import com.corrodinggames.rts.game.units.b;
/*      */ import com.corrodinggames.rts.game.units.custom.a.c;
/*      */ import com.corrodinggames.rts.game.units.custom.a.f;
/*      */ import com.corrodinggames.rts.game.units.custom.b.a;
/*      */ import com.corrodinggames.rts.game.units.custom.b.i;
/*      */ import com.corrodinggames.rts.game.units.custom.c.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.b;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*      */ import com.corrodinggames.rts.game.units.e.i;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.game.units.u;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.f.b;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.util.ArrayList;
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
/*      */ public final class l
/*      */   implements al
/*      */ {
/*   61 */   public static final Rect a = new Rect();
/*      */   public static l b;
/*   63 */   public static final ArrayList c = new ArrayList();
/*   64 */   public static ArrayList d = new ArrayList();
/*   65 */   public static ArrayList e = null;
/*   66 */   public static final HashMap f = new HashMap<>();
/*   67 */   public static ArrayList g = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   72 */   public final m h = new m();
/*      */   
/*   74 */   public final m i = new m();
/*      */   
/*   76 */   final m j = new m();
/*      */   
/*   78 */   public final m k = new m();
/*      */   
/*   80 */   public final m l = new m();
/*      */   
/*   82 */   public final m m = new m();
/*      */   
/*   84 */   public final m n = new m();
/*      */   
/*   86 */   final m o = new m();
/*      */ 
/*      */   
/*      */   public boolean p;
/*      */ 
/*      */   
/*      */   public boolean q;
/*      */ 
/*      */   
/*      */   public boolean r;
/*      */ 
/*      */   
/*      */   public boolean s;
/*      */ 
/*      */   
/*      */   public boolean t;
/*      */ 
/*      */   
/*      */   public boolean u;
/*      */   
/*      */   public boolean v;
/*      */   
/*      */   public Rect w;
/*      */   
/*      */   public String x;
/*      */   
/*      */   public String y;
/*      */   
/*      */   public boolean z = true;
/*      */   
/*      */   public int A;
/*      */   
/*      */   public b B;
/*      */   
/*      */   public String C;
/*      */   
/*      */   public String D;
/*      */   
/*      */   public String E;
/*      */ 
/*      */   
/*      */   public strictfp String b() {
/*  128 */     String str = this.x;
/*      */     
/*  130 */     if (this.B != null) {
/*      */       
/*  132 */       String str1 = this.B.f;
/*      */       
/*  134 */       if (str.startsWith(str1)) {
/*      */         
/*  136 */         str = str.substring(str1.length());
/*      */         
/*  138 */         if (str.startsWith("/"))
/*      */         {
/*  140 */           str = str.substring(1);
/*      */         }
/*      */         
/*  143 */         if (str.startsWith("\\"))
/*      */         {
/*  145 */           str = str.substring(1);
/*      */         }
/*      */       } 
/*      */       
/*  149 */       str = str + " (in mod " + this.B.a() + ")";
/*      */     } 
/*      */     
/*  152 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  160 */   public m F = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public i G;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public i H;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String I;
/*      */ 
/*      */ 
/*      */   
/*      */   public int J;
/*      */ 
/*      */ 
/*      */   
/*      */   public z K;
/*      */ 
/*      */ 
/*      */   
/*  187 */   public int L = 1;
/*      */   
/*  189 */   public int M = Integer.MAX_VALUE;
/*      */ 
/*      */   
/*  192 */   public int N = -1;
/*  193 */   public int O = -1;
/*      */   
/*      */   public int P;
/*      */   
/*      */   public LogicBoolean Q;
/*      */   
/*      */   public boolean R;
/*      */   
/*      */   public boolean S;
/*      */   
/*      */   public boolean T;
/*      */   
/*      */   public n U;
/*      */   
/*  207 */   public e V = null;
/*      */   
/*      */   public int W;
/*      */   
/*      */   public int X;
/*      */   
/*      */   public int Y;
/*      */   public int Z;
/*  215 */   public e aa = null;
/*      */   
/*      */   public boolean ab;
/*      */   
/*  219 */   public e ac = null;
/*      */   
/*  221 */   public e ad = null;
/*      */   
/*  223 */   public e ae = null;
/*      */   
/*      */   public boolean af;
/*      */   
/*  227 */   public e[] ag = new e[10];
/*      */   
/*      */   public e[] ah;
/*  230 */   public e[] ai = null;
/*      */   
/*  232 */   public e aj = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean ak = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e al;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  249 */   public af[] am = null;
/*      */   
/*      */   public boolean an = false;
/*      */   
/*      */   public boolean ao = false;
/*      */   
/*  255 */   public final m ap = new m();
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aq;
/*      */ 
/*      */ 
/*      */   
/*      */   public ag ar;
/*      */ 
/*      */ 
/*      */   
/*      */   public ag as;
/*      */ 
/*      */   
/*      */   public String at;
/*      */ 
/*      */   
/*      */   public boolean au;
/*      */ 
/*      */   
/*  276 */   public float av = 1.0F;
/*      */ 
/*      */   
/*      */   public boolean aw;
/*      */ 
/*      */   
/*      */   public boolean ax;
/*      */ 
/*      */   
/*      */   public boolean ay;
/*      */ 
/*      */   
/*      */   public boolean az;
/*      */ 
/*      */   
/*      */   public float aA;
/*      */ 
/*      */   
/*      */   public boolean aB;
/*      */ 
/*      */   
/*      */   public boolean aC;
/*      */   
/*      */   public boolean aD;
/*      */   
/*      */   public boolean aE;
/*      */   
/*      */   public boolean aF;
/*      */   
/*      */   public boolean aG;
/*      */   
/*      */   public i aH;
/*      */   
/*      */   public boolean aI;
/*      */   
/*      */   public boolean aJ;
/*      */   
/*      */   public boolean aK;
/*      */   
/*      */   public boolean aL;
/*      */   
/*      */   public int aM;
/*      */   
/*  319 */   public int aN = -1;
/*      */   
/*      */   public boolean aO;
/*      */   
/*  323 */   public int aP = -1;
/*      */   
/*      */   public boolean aQ;
/*      */   
/*      */   public float aR;
/*      */   
/*      */   public float aS;
/*      */   
/*      */   public float aT;
/*      */   
/*      */   public boolean aU;
/*      */   
/*      */   public float aV;
/*      */   
/*      */   public float aW;
/*      */   
/*      */   public boolean aX;
/*      */   
/*      */   public boolean aY;
/*      */   
/*      */   public boolean aZ;
/*      */   
/*      */   public boolean ba;
/*      */   
/*      */   public int bb;
/*      */   
/*      */   public boolean bc;
/*      */   
/*      */   public float bd;
/*      */   
/*      */   public float be;
/*      */   
/*      */   public int bf;
/*      */   
/*      */   public boolean bg;
/*      */   
/*      */   public boolean bh;
/*      */   
/*      */   public u bi;
/*      */   
/*      */   public boolean bj;
/*      */   public boolean bk;
/*      */   public x bl;
/*      */   public x bm;
/*      */   public x bn;
/*      */   public aq bo;
/*  369 */   public int bp = -1;
/*      */   
/*  371 */   public int bq = -1;
/*      */   
/*      */   public au br;
/*      */   
/*      */   public boolean bs;
/*      */   
/*      */   public boolean bt;
/*      */   
/*      */   public boolean bu;
/*      */   
/*      */   public boolean bv;
/*      */   
/*  383 */   public float bw = 1.0F;
/*  384 */   public float bx = 1.0F;
/*      */   
/*      */   boolean by;
/*      */   
/*      */   boolean bz;
/*      */   
/*      */   boolean bA;
/*      */   
/*      */   boolean bB;
/*      */   
/*      */   boolean bC;
/*      */   
/*      */   x bD;
/*      */   
/*      */   x bE;
/*      */   
/*      */   boolean bF;
/*      */   
/*      */   float bG;
/*      */   
/*      */   boolean bH;
/*      */   
/*      */   float bI;
/*      */   
/*      */   x bJ;
/*      */   
/*      */   x bK;
/*      */   
/*      */   boolean bL;
/*      */   
/*      */   float bM;
/*      */   x bN;
/*      */   x bO;
/*  417 */   public float bP = 60.0F;
/*      */ 
/*      */   
/*      */   public int bQ;
/*      */   
/*      */   public boolean bR;
/*      */   
/*      */   public boolean bS;
/*      */   
/*      */   public boolean bT;
/*      */   
/*      */   public g bU;
/*      */   
/*      */   public g bV;
/*      */   
/*  432 */   public float bW = 0.001F;
/*      */ 
/*      */   
/*      */   public int bX;
/*      */ 
/*      */   
/*      */   public boolean bY;
/*      */   
/*  440 */   public g bZ = g.a;
/*      */   
/*  442 */   public d ca = d.a;
/*      */   
/*  444 */   public d cb = d.a;
/*      */ 
/*      */   
/*      */   public int cc;
/*      */ 
/*      */   
/*      */   public float cd;
/*      */   
/*  452 */   public g ce = g.a;
/*      */ 
/*      */   
/*      */   public LogicBoolean cf;
/*      */ 
/*      */   
/*      */   public boolean cg;
/*      */ 
/*      */   
/*      */   public boolean ch;
/*      */   
/*      */   public boolean ci;
/*      */   
/*      */   public boolean cj;
/*      */   
/*      */   public boolean ck;
/*      */   
/*      */   public boolean cl;
/*      */   
/*      */   public float cm;
/*      */   
/*      */   public int cn;
/*      */   
/*      */   public i co;
/*      */   
/*  477 */   public int cp = -2;
/*      */   
/*      */   public float cq;
/*      */   
/*      */   public float cr;
/*      */   
/*      */   public int cs;
/*      */   
/*      */   public int ct;
/*      */   
/*      */   public boolean cu;
/*      */   
/*      */   public float cv;
/*      */   
/*      */   public float cw;
/*      */   
/*      */   public float cx;
/*      */   
/*      */   public float cy;
/*      */   
/*      */   public boolean cz;
/*      */   
/*      */   public float cA;
/*      */   
/*      */   public float cB;
/*      */   
/*      */   public boolean cC;
/*      */   
/*      */   public float cD;
/*      */   
/*      */   public ag cE;
/*      */   
/*      */   public boolean cF;
/*      */   
/*      */   public float cG;
/*      */   
/*      */   public int cH;
/*  514 */   public Rect cI = new Rect();
/*  515 */   public Rect cJ = new Rect();
/*      */   
/*  517 */   public Rect cK = new Rect();
/*      */   
/*      */   public float cL;
/*      */   
/*      */   public float cM;
/*      */   
/*      */   public boolean cN;
/*      */   
/*      */   public int cO;
/*      */   
/*      */   public float cP;
/*      */   
/*      */   public int cQ;
/*      */   
/*      */   public int cR;
/*      */   
/*      */   public int cS;
/*      */   
/*      */   public int cT;
/*      */   
/*      */   public float cU;
/*      */   
/*      */   public float cV;
/*      */   
/*      */   public Float cW;
/*      */   
/*      */   public float cX;
/*      */   
/*      */   public boolean cY;
/*      */   
/*      */   public Float cZ;
/*      */   
/*      */   public aq da;
/*      */   public aq db;
/*      */   public aq dc;
/*  552 */   m dd = new m();
/*      */   
/*  554 */   f de = new f("moving");
/*  555 */   f df = new f("idle");
/*  556 */   f dg = new f("attack");
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f dh;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f di;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f dj;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f dk;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f dl;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f dm;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dn;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean do;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dp;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dq;
/*      */ 
/*      */ 
/*      */   
/*      */   public as dr;
/*      */ 
/*      */ 
/*      */   
/*      */   public float ds;
/*      */ 
/*      */ 
/*      */   
/*      */   m dt;
/*      */ 
/*      */ 
/*      */   
/*      */   public float du;
/*      */ 
/*      */ 
/*      */   
/*      */   public float dv;
/*      */ 
/*      */ 
/*      */   
/*      */   public Boolean dw;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dx;
/*      */ 
/*      */ 
/*      */   
/*      */   public float dy;
/*      */ 
/*      */ 
/*      */   
/*      */   public float dz;
/*      */ 
/*      */ 
/*      */   
/*      */   public float dA;
/*      */ 
/*      */ 
/*      */   
/*      */   public float dB;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dC;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dD;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dE;
/*      */ 
/*      */ 
/*      */   
/*  662 */   public float dF = 0.0F;
/*      */   
/*      */   public float dG;
/*      */   
/*      */   public float dH;
/*      */   
/*  668 */   public float dI = -1.0F;
/*  669 */   public float dJ = 0.03F;
/*  670 */   public float dK = 0.06F;
/*      */   
/*      */   public float dL;
/*      */   
/*      */   public boolean dM;
/*      */   
/*      */   public boolean dN;
/*      */   
/*      */   public int dO;
/*      */   
/*      */   public float dP;
/*      */   
/*      */   public float dQ;
/*      */   
/*      */   public b dR;
/*      */   
/*      */   public float dS;
/*      */   
/*      */   public float dT;
/*      */   
/*      */   public boolean dU;
/*      */   
/*      */   public boolean dV;
/*      */   
/*      */   public boolean dW;
/*      */   public boolean dX;
/*      */   public float dY;
/*      */   public float dZ;
/*      */   public float ea;
/*  699 */   public int eb = -1;
/*  700 */   public int ec = -1;
/*      */ 
/*      */   
/*      */   public float ed;
/*      */ 
/*      */   
/*      */   public boolean ee;
/*      */ 
/*      */   
/*      */   public LogicBoolean ef;
/*      */ 
/*      */   
/*      */   public LogicBoolean eg;
/*      */ 
/*      */   
/*      */   public LogicBoolean eh;
/*      */ 
/*      */   
/*      */   public LogicBoolean ei;
/*      */ 
/*      */   
/*      */   public boolean ej;
/*      */ 
/*      */   
/*      */   public i ek;
/*      */ 
/*      */   
/*      */   public i el;
/*      */ 
/*      */   
/*      */   public boolean em;
/*      */   
/*      */   public boolean en;
/*      */   
/*      */   public float eo;
/*      */   
/*      */   public boolean ep;
/*      */   
/*      */   public int eq;
/*      */   
/*      */   public boolean er;
/*      */   
/*      */   public boolean es;
/*      */   
/*      */   public boolean et;
/*      */   
/*      */   public boolean eu;
/*      */   
/*      */   public float ev;
/*      */   
/*      */   public boolean ew;
/*      */   
/*      */   public boolean ex;
/*      */   
/*      */   public boolean ey = false;
/*      */   
/*      */   public boolean ez = false;
/*      */   
/*      */   public boolean eA = false;
/*      */   
/*  760 */   public int eB = 0;
/*      */   
/*      */   public float eC;
/*      */   
/*      */   public boolean eD;
/*      */   
/*      */   public i eE;
/*  767 */   public m eF = new m();
/*      */   
/*      */   public boolean eG;
/*      */   
/*      */   public boolean eH;
/*      */   
/*      */   public boolean eI;
/*      */   
/*      */   public LogicBoolean eJ;
/*      */   
/*      */   public LogicBoolean eK;
/*      */   
/*      */   public LogicBoolean eL;
/*      */   
/*      */   public boolean eM;
/*      */   
/*      */   public float eN;
/*  784 */   public int eO = 1;
/*      */   
/*  786 */   public static LogicBoolean eP = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");
/*      */   
/*  788 */   public static LogicBoolean eQ = LogicBoolean.create(null, "if not self.isOverLiquid()");
/*      */ 
/*      */   
/*      */   public LogicBoolean eR;
/*      */ 
/*      */   
/*      */   public LogicBoolean eS;
/*      */ 
/*      */   
/*      */   public boolean eT = true;
/*      */   
/*      */   public aj eU;
/*      */   
/*      */   public ah eV;
/*      */   
/*      */   public ah eW;
/*      */   
/*      */   public boolean eX;
/*      */   
/*      */   public boolean eY;
/*      */   
/*      */   public boolean eZ;
/*      */   
/*      */   public i fa;
/*      */   
/*      */   public int fb;
/*      */   
/*      */   public i fc;
/*      */   
/*      */   public i fd;
/*      */   
/*      */   public boolean fe;
/*      */   
/*      */   public boolean ff;
/*      */   
/*      */   public boolean fg;
/*      */   
/*      */   public boolean fh;
/*      */   
/*      */   public boolean fi;
/*      */   
/*      */   public boolean fj;
/*      */   
/*      */   public boolean fk;
/*      */   
/*      */   public int fl;
/*      */   
/*      */   public int fm;
/*      */   
/*      */   public float fn;
/*      */   
/*      */   public int fo;
/*      */   
/*      */   public float fp;
/*      */   
/*      */   public float fq;
/*      */   
/*      */   public float fr;
/*      */   
/*      */   public int fs;
/*      */   
/*      */   public int ft;
/*      */   
/*      */   public boolean fu;
/*      */   
/*      */   public i fv;
/*      */   
/*      */   public String fw;
/*      */   
/*      */   public boolean fx;
/*      */   
/*  859 */   public float fy = -1.0F;
/*      */   
/*  861 */   public m fz = new m();
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean fA;
/*      */ 
/*      */   
/*      */   public boolean fB;
/*      */ 
/*      */   
/*      */   public i fC;
/*      */ 
/*      */   
/*      */   public boolean fD;
/*      */ 
/*      */   
/*  877 */   public as[] fE = null;
/*      */   
/*      */   public am[] fF;
/*      */   
/*  881 */   ArrayList fG = new ArrayList();
/*  882 */   ArrayList fH = new ArrayList();
/*      */ 
/*      */   
/*      */   boolean fI = false;
/*      */   
/*  887 */   as fJ = null;
/*      */ 
/*      */ 
/*      */   
/*  891 */   m fK = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   r[] fL;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp o a(String paramString, o paramo) {
/*  906 */     if (paramString != null) {
/*      */       
/*  908 */       o o1 = new o(this);
/*  909 */       o1.a = paramString;
/*  910 */       o1.a();
/*  911 */       return o1;
/*      */     } 
/*      */ 
/*      */     
/*  915 */     if (paramo != null) {
/*      */       
/*  917 */       o o1 = new o(this);
/*  918 */       o1.a = paramo.a;
/*  919 */       o1.a();
/*  920 */       return o1;
/*      */     } 
/*      */ 
/*      */     
/*  924 */     return null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   strictfp f a(n paramn, f paramf, boolean paramBoolean) {
/* 1011 */     f f1 = a(paramn);
/* 1012 */     if (f1 != null) {
/*      */       
/* 1014 */       if (paramBoolean)
/*      */       {
/* 1016 */         if (paramf != null && paramf.a())
/*      */         {
/* 1018 */           throw new at("Cannot define animation " + paramn.name() + " on graphics and with onAction at same time");
/*      */         }
/*      */       }
/* 1021 */       return f1;
/*      */     } 
/* 1023 */     return paramf;
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
/*      */   strictfp f a(n paramn) {
/* 1044 */     for (f f1 : this.dd) {
/*      */       
/* 1046 */       if (f1.a(paramn))
/*      */       {
/* 1048 */         return f1;
/*      */       }
/*      */     } 
/* 1051 */     return null;
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
/* 1089 */   ArrayList fM = new ArrayList();
/*      */   
/* 1091 */   ArrayList fN = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp x a(String paramString, x paramx) {
/* 1096 */     if (paramString == null && paramx != null)
/*      */     {
/* 1098 */       return paramx;
/*      */     }
/*      */     
/* 1101 */     x x1 = new x(this, paramString, null);
/* 1102 */     x1.c();
/* 1103 */     return x1;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp x a(String paramString) {
/* 1108 */     return new x(this, paramString, null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1113 */   static final ad[] fO = new ad[0];
/* 1114 */   static final ad[] fP = new ad[0];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp ad b(String paramString) {
/* 1223 */     boolean bool = false;
/*      */     
/* 1225 */     if (paramString.toUpperCase().startsWith("CUSTOM:")) {
/*      */       
/* 1227 */       paramString = paramString.substring("CUSTOM:".length());
/* 1228 */       bool = true;
/*      */     } 
/*      */     
/* 1231 */     if (paramString.toUpperCase().startsWith("CUSTOM|")) {
/*      */       
/* 1233 */       paramString = paramString.substring("CUSTOM|".length());
/* 1234 */       bool = true;
/*      */     } 
/*      */     
/* 1237 */     if (bool) {
/*      */       
/* 1239 */       for (ad ad1 : this.fN) {
/*      */         
/* 1241 */         if (paramString.equalsIgnoreCase(ad1.name))
/*      */         {
/* 1243 */           return ad1;
/*      */         }
/*      */       } 
/*      */       
/* 1247 */       throw new at("Failed to find custom effect with the name:" + paramString);
/*      */     } 
/*      */     
/* 1250 */     if (paramString.contains(":"))
/*      */     {
/* 1252 */       throw new at("Unknown effect format:" + paramString + " expected built-in effect or CUSTOM:");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1261 */     if ("small".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1264 */       return new ad(ae.a);
/*      */     }
/* 1266 */     if ("medium".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1269 */       return new ad(ae.b);
/*      */     }
/* 1271 */     if ("large".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1274 */       return new ad(ae.c);
/*      */     }
/* 1276 */     if ("smoke".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1279 */       return new ad(ae.d);
/*      */     }
/* 1281 */     if ("shockwave".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1284 */       return new ad(ae.e);
/*      */     }
/* 1286 */     if ("largeExplosion".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1289 */       return new ad(ae.f);
/*      */     }
/* 1291 */     if ("smallExplosion".equalsIgnoreCase(paramString))
/*      */     {
/*      */       
/* 1294 */       return new ad(ae.g);
/*      */     }
/* 1296 */     if ("resourcePoolSmoke".equalsIgnoreCase(paramString))
/*      */     {
/* 1298 */       return new ad(ae.h);
/*      */     }
/* 1300 */     if ("none".equalsIgnoreCase(paramString))
/*      */     {
/* 1302 */       return new ad(ae.i);
/*      */     }
/*      */     
/* 1305 */     throw new at("Failed to find built-in effect with the name:" + paramString);
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
/* 1333 */   ArrayList fQ = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1339 */   ArrayList fR = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean fS;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean B() {
/* 1349 */     return this.bR;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean w() {
/* 1356 */     if (this.bT) {
/*      */       
/* 1358 */       com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/* 1359 */       if (l1.H() && l1.bF.aH.i)
/*      */       {
/* 1361 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 1365 */     return this.bS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int c() {
/* 1372 */     return this.bU.a();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp g u() {
/* 1378 */     return this.bU;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp g d(int paramInt) {
/* 1384 */     return this.bU;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float C() {
/* 1390 */     return this.bW;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int g() {
/* 1396 */     return this.bX;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp af a() {
/* 1402 */     return (af)a(false, this);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp af a(boolean paramBoolean) {
/* 1408 */     return (af)a(paramBoolean, this);
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
/* 1426 */   int fT = -1;
/*      */   
/*      */   String fU;
/*      */   String fV;
/*      */   
/*      */   public strictfp String e() {
/* 1432 */     if (this.fT != a.c || this.fU == null) {
/*      */       
/* 1434 */       this.fT = a.c;
/* 1435 */       String str1 = (this.ar != null) ? this.ar.b() : this.E;
/*      */       
/* 1437 */       String str2 = this.E;
/* 1438 */       if (this.at != null)
/*      */       {
/* 1440 */         str2 = this.at;
/*      */       }
/*      */       
/* 1443 */       this.fU = a.a("units." + str2 + ".name", str1, new Object[0]);
/*      */     } 
/* 1445 */     return this.fU;
/*      */   }
/*      */   HashMap fW; am[] fX;
/*      */   
/*      */   public strictfp String f() {
/* 1450 */     if (this.fT != a.c || this.fV == null) {
/*      */       
/* 1452 */       this.fT = a.c;
/*      */ 
/*      */ 
/*      */       
/* 1456 */       String str1 = (this.as != null) ? this.as.b() : this.E;
/*      */       
/* 1458 */       String str2 = this.E;
/* 1459 */       if (this.at != null)
/*      */       {
/* 1461 */         str2 = this.at;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1466 */       this.fV = a.a("units." + str2 + ".description", str1, new Object[0]);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1472 */     return this.fV;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean j() {
/* 1479 */     return this.aw;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean k() {
/* 1486 */     return this.ax;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean m() {
/* 1493 */     return this.ff;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean n() {
/* 1499 */     return this.fg;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean l() {
/* 1505 */     return this.fe;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp ah o() {
/* 1511 */     return this.eV;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean p() {
/* 1517 */     return this.ay;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp aj q() {
/* 1523 */     return this.eU;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(ArrayList<s> paramArrayList, int paramInt) {
/* 1534 */     if (this.eB != 0 && this.eI) {
/*      */ 
/*      */       
/* 1537 */       paramArrayList.add(i.i);
/* 1538 */       paramArrayList.add(i.j);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void h() {
/* 1549 */     this.fW = null;
/*      */     
/* 1551 */     this.fX = new am[3];
/* 1552 */     for (byte b1 = 1; b1 <= 3; b1++) {
/*      */       
/* 1554 */       am am1 = new am();
/* 1555 */       a(am1.a, b1);
/* 1556 */       this.fX[b1 - 1] = am1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp ArrayList a(int paramInt) {
/* 1565 */     if (this.fX == null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1572 */       com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*      */       
/* 1574 */       boolean bool = d.contains(this);
/*      */       
/* 1576 */       throw new RuntimeException("specialActionLists==null for:" + this.E + " t:" + paramInt + " networked:" + l1
/* 1577 */           .G() + " replay:" + l1.bJ.h() + " sandbox:" + l1.be + " active: " + bool);
/*      */     } 
/*      */ 
/*      */     
/* 1581 */     return (this.fX[paramInt - 1]).a;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void r() {
/* 1586 */     ArrayList<s> arrayList = a(this.bX);
/*      */     
/* 1588 */     if (arrayList.size() > 4) {
/*      */       
/* 1590 */       this.fW = new HashMap<>(); byte b1;
/*      */       int j;
/* 1592 */       for (b1 = 0, j = arrayList.size(); b1 < j; b1++) {
/*      */         
/* 1594 */         s s = arrayList.get(b1);
/*      */         
/* 1596 */         if (this.fW.get(s.J()) == null)
/*      */         {
/* 1598 */           this.fW.put(s.J(), s);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp s a(c paramc) {
/* 1607 */     if (this.fW != null)
/*      */     {
/* 1609 */       return (s)this.fW.get(paramc);
/*      */     }
/*      */     
/* 1612 */     ArrayList<s> arrayList = a(this.bX); byte b1;
/*      */     int j;
/* 1614 */     for (b1 = 0, j = arrayList.size(); b1 < j; b1++) {
/*      */       
/* 1616 */       s s = arrayList.get(b1);
/* 1617 */       if (s.d(paramc))
/*      */       {
/* 1619 */         return s;
/*      */       }
/*      */     } 
/* 1622 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String i() {
/* 1633 */     return this.E;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String v() {
/* 1639 */     return this.E;
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
/* 1669 */   z fY = new z(this);
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp z d() {
/* 1674 */     return this.fY;
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
/*      */   public strictfp t a(String paramString1, String paramString2, String paramString3) {
/* 1710 */     if (paramString1 == null)
/*      */     {
/* 1712 */       return null;
/*      */     }
/*      */     
/* 1715 */     t t = new t();
/* 1716 */     t.a = paramString2;
/* 1717 */     t.b = paramString3;
/* 1718 */     t.c = paramString1;
/* 1719 */     this.o.add(t);
/* 1720 */     return t;
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
/*      */   public strictfp v b(String paramString1, String paramString2, String paramString3) {
/* 1788 */     v v = new v();
/* 1789 */     v.a = paramString2;
/* 1790 */     v.b = paramString3;
/*      */     
/* 1792 */     v.c = "(known unit:)" + i();
/* 1793 */     v.d = this;
/* 1794 */     v.e = true;
/*      */     
/* 1796 */     v.f = paramString1;
/* 1797 */     this.o.add(v);
/* 1798 */     return v;
/*      */   }
/*      */   
/* 1801 */   m fZ = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp s c(String paramString1, String paramString2, String paramString3) {
/* 1899 */     if (paramString1 == null || paramString1.trim().equals(""))
/*      */     {
/*      */       
/* 1902 */       return null;
/*      */     }
/* 1904 */     s s = new s();
/* 1905 */     s.c = paramString2;
/* 1906 */     s.d = paramString3;
/* 1907 */     for (String str : f.b(paramString1, ',')) {
/*      */       
/* 1909 */       str = str.trim();
/* 1910 */       s.a.add(str);
/*      */     } 
/* 1912 */     this.fZ.add(s);
/*      */     
/* 1914 */     return s;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp t a(al paramal) {
/* 1922 */     if (paramal == null)
/*      */     {
/* 1924 */       return null;
/*      */     }
/*      */     
/* 1927 */     t t = new t();
/* 1928 */     t.a = "known";
/*      */     
/* 1930 */     t.d = paramal;
/* 1931 */     t.e = true;
/*      */ 
/*      */ 
/*      */     
/* 1935 */     return t;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp l b(int paramInt) {
/* 2159 */     if (paramInt >= 100) {
/*      */       
/* 2161 */       int j = paramInt - 100;
/*      */       
/* 2163 */       if (j < g.size())
/*      */       {
/* 2165 */         return g.get(j);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 2170 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp ArrayList s() {
/* 2176 */     ArrayList<Integer> arrayList = new ArrayList();
/* 2177 */     byte b1 = 100;
/* 2178 */     for (l l1 : g) {
/*      */       
/* 2180 */       arrayList.add(Integer.valueOf(b1));
/* 2181 */       b1++;
/*      */     } 
/* 2183 */     return arrayList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp i x() {
/* 2190 */     return this.G;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 2195 */   m ga = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gb;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp as c(String paramString) {
/* 2241 */     for (as as1 : this.fG) {
/*      */       
/* 2243 */       if (as1.a.equalsIgnoreCase(paramString))
/*      */       {
/* 2245 */         return as1;
/*      */       }
/*      */     } 
/* 2248 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp am d(String paramString) {
/* 2254 */     for (am am1 : this.fH) {
/*      */       
/* 2256 */       if (am1.bf.equalsIgnoreCase(paramString))
/*      */       {
/* 2258 */         return am1;
/*      */       }
/*      */     } 
/* 2261 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp c e(String paramString) {
/* 2268 */     for (c c : this.fR) {
/*      */       
/* 2270 */       if (c.b != null)
/*      */       {
/* 2272 */         if (c.b.equalsIgnoreCase(paramString))
/*      */         {
/* 2274 */           return c;
/*      */         }
/*      */       }
/*      */     } 
/* 2278 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp s f(String paramString) {
/* 2284 */     ArrayList arrayList = a(this.bX);
/*      */     
/* 2286 */     for (s s : arrayList) {
/*      */       
/* 2288 */       if (s instanceof f) {
/*      */         
/* 2290 */         f f1 = (f)s;
/*      */         
/* 2292 */         if (f1.a.b.equalsIgnoreCase(paramString))
/*      */         {
/* 2294 */           return (s)f1;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 2299 */     return null;
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
/*      */   public strictfp void a(a parama) {
/* 2336 */     if (!this.h.contains(parama))
/*      */     {
/* 2338 */       this.h.add(parama);
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
/*      */   public strictfp void a(g paramg) {
/* 2377 */     if (paramg != null)
/*      */     {
/* 2379 */       if (paramg.b != 0) {
/*      */         
/* 2381 */         if (this.gc)
/*      */         {
/* 2383 */           com.corrodinggames.rts.gameFramework.l.f("usesCreditResources:" + paramg);
/*      */         }
/*      */         
/* 2386 */         this.gb = true;
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp i g(String paramString) {
/* 2394 */     for (i i1 : this.ap) {
/*      */       
/* 2396 */       if (i1.b().equalsIgnoreCase(paramString))
/*      */       {
/* 2398 */         return i1;
/*      */       }
/*      */     } 
/*      */     
/* 2402 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp a h(String paramString) {
/* 2410 */     a a = a.a(paramString);
/* 2411 */     if (a != null)
/*      */     {
/* 2413 */       return a;
/*      */     }
/*      */     
/* 2416 */     return i(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp a i(String paramString) {
/* 2423 */     for (b b1 : this.i) {
/*      */       
/* 2425 */       if (b1.a.equalsIgnoreCase(paramString))
/*      */       {
/* 2427 */         return b1.b;
/*      */       }
/*      */     } 
/*      */     
/* 2431 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp b a(a parama) {
/* 2436 */     for (b b1 : this.i) {
/*      */       
/* 2438 */       if (b1.b == parama)
/*      */       {
/* 2440 */         return b1;
/*      */       }
/*      */     } 
/* 2443 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp a a(h paramh) {
/* 2448 */     for (a a : this.k) {
/*      */       
/* 2450 */       if (a.g == paramh)
/*      */       {
/* 2452 */         return a;
/*      */       }
/*      */     } 
/* 2455 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp a j(String paramString) {
/* 2460 */     for (a a : this.k) {
/*      */       
/* 2462 */       if (a.g.a.equals(paramString))
/*      */       {
/* 2464 */         return a;
/*      */       }
/*      */     } 
/* 2467 */     return null;
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
/*      */   public strictfp boolean y() {
/* 2486 */     return this.gb;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String t() {
/* 2495 */     if (this.B != null)
/*      */     {
/* 2497 */       return this.B.a();
/*      */     }
/* 2499 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(ap paramap) {
/* 2505 */     paramap.e("customUnits");
/*      */     
/* 2507 */     paramap.a(1);
/*      */     
/* 2509 */     paramap.a(d.size());
/* 2510 */     for (l l1 : d) {
/*      */       
/* 2512 */       paramap.c(l1.E);
/* 2513 */       paramap.a(l1.A);
/* 2514 */       paramap.a(true);
/*      */ 
/*      */       
/* 2517 */       paramap.b(l1.t());
/*      */       
/* 2519 */       long l2 = 0L;
/* 2520 */       if (l1.B != null)
/*      */       {
/* 2522 */         if (l1.B.d != 0L)
/*      */         {
/* 2524 */           l2 = l1.B.d;
/*      */         }
/*      */       }
/* 2527 */       paramap.a(l2);
/*      */       
/* 2529 */       long l3 = 0L;
/* 2530 */       paramap.a(l3);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2537 */     paramap.a("customUnits");
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
/*      */   public static strictfp void a(k paramk) {
/* 2562 */     paramk.b("customUnits");
/*      */ 
/*      */     
/*      */     try {
/* 2566 */       ArrayList<l> arrayList = new ArrayList();
/*      */ 
/*      */ 
/*      */       
/* 2570 */       int j = paramk.f();
/*      */       
/* 2572 */       int i1 = paramk.f();
/* 2573 */       for (byte b1 = 0; b1 < i1; b1++) {
/*      */         
/* 2575 */         String str1 = paramk.k();
/* 2576 */         int i2 = paramk.f();
/* 2577 */         boolean bool = paramk.e();
/*      */         
/* 2579 */         String str2 = paramk.j();
/*      */         
/* 2581 */         long l1 = paramk.i();
/* 2582 */         long l2 = paramk.i();
/*      */ 
/*      */         
/* 2585 */         l l3 = null;
/* 2586 */         int i3 = -1;
/*      */ 
/*      */         
/* 2589 */         synchronized (c) {
/*      */           
/* 2591 */           for (l l4 : c) {
/*      */             
/* 2593 */             if (str1.equals(l4.E)) {
/*      */               
/* 2595 */               if (i2 == l4.A) {
/*      */                 
/* 2597 */                 l3 = l4;
/*      */                 
/*      */                 continue;
/*      */               } 
/* 2601 */               i3 = l4.A;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 2607 */         if (l3 == null) {
/*      */ 
/*      */           
/* 2610 */           String str = "from internal units";
/* 2611 */           if (str2 != null)
/*      */           {
/* 2613 */             str = "from mod:'" + str2 + "'";
/*      */           }
/*      */           
/* 2616 */           b b2 = (com.corrodinggames.rts.gameFramework.l.u()).bH.c(str2);
/*      */           
/* 2618 */           if (b2 != null)
/*      */           {
/* 2620 */             if (!b2.k()) {
/*      */               
/* 2622 */               str = str + " (You seem to have this mod but it is not enabled)";
/*      */             }
/*      */             else {
/*      */               
/* 2626 */               str = str + " (You seem to have this mod but it might be a different version)";
/*      */             } 
/*      */           }
/*      */           
/* 2630 */           if (i3 == -1)
/*      */           {
/* 2632 */             throw new ai("The server requires the unit:" + str1 + " that was not found " + str, "");
/*      */           }
/*      */ 
/*      */           
/* 2636 */           throw new ai("Found unit:" + str1 + " but it does not match the server's copy " + str, "checksum c:" + i3 + " s:" + i2);
/*      */         } 
/*      */ 
/*      */         
/* 2640 */         arrayList.add(l3);
/*      */       } 
/*      */ 
/*      */       
/* 2644 */       e = arrayList;
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */       
/* 2651 */       paramk.d("customUnits");
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
/*      */   public strictfp void b(al paramal) {
/* 2667 */     if (!this.fz.contains(paramal) && paramal != this)
/*      */     {
/* 2669 */       this.fz.add(paramal);
/*      */     }
/*      */ 
/*      */     
/* 2673 */     if (paramal instanceof l)
/*      */     {
/* 2675 */       for (al al1 : ((l)paramal).fz) {
/*      */         
/* 2677 */         if (!this.fz.contains(al1) && paramal != this)
/*      */         {
/* 2679 */           this.fz.add(al1);
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
/*      */   public static strictfp l a(l paraml) {
/* 2691 */     for (l l1 : d) {
/*      */       
/* 2693 */       if (paraml.x.equals(l1.x))
/*      */       {
/* 2695 */         return l1;
/*      */       }
/*      */     } 
/*      */     
/* 2699 */     for (l l1 : d) {
/*      */       
/* 2701 */       if (paraml.E.equals(l1.E))
/*      */       {
/* 2703 */         return l1;
/*      */       }
/*      */     } 
/*      */     
/* 2707 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void A() {
/* 2713 */     for (af af1 : af.bt()) {
/*      */       
/* 2715 */       if (af1 instanceof k) {
/*      */         
/* 2717 */         k k = (k)af1;
/*      */ 
/*      */ 
/*      */         
/* 2721 */         l l1 = k.v;
/*      */         
/* 2723 */         if (!d.contains(l1)) {
/*      */ 
/*      */           
/* 2726 */           l l2 = a(l1);
/*      */           
/* 2728 */           if (l2 == null)
/*      */           {
/* 2730 */             l2 = b;
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2737 */           if (l2 != null)
/*      */           {
/* 2739 */             k.a(l2, false);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e[] a(e parame, n paramn) {
/* 2778 */     boolean bool = false;
/*      */     
/* 2780 */     if (this.B != null || this.et)
/*      */     {
/* 2782 */       if (!(com.corrodinggames.rts.gameFramework.l.u()).by.disableModLazyLoad)
/*      */       {
/* 2784 */         bool = true;
/*      */       }
/*      */     }
/*      */     
/* 2788 */     if ((this.cg && this.ch) || this.cl)
/*      */     {
/* 2790 */       bool = true;
/*      */     }
/*      */     
/* 2793 */     e[] arrayOfE = m.a(parame, paramn, bool);
/*      */ 
/*      */     
/* 2796 */     for (byte b1 = 0; b1 < arrayOfE.length; b1++) {
/*      */       
/* 2798 */       if (bool && this.B != null && this.et)
/*      */       {
/* 2800 */         if (b1 == 1)
/*      */         {
/* 2802 */           arrayOfE[b1].v();
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2810 */     ac.a(arrayOfE);
/*      */     
/* 2812 */     return arrayOfE;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp e a(ab paramab, String paramString1, String paramString2) {
/* 2817 */     return a(paramab, paramString1, paramString2, this.T);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp e a(ab paramab, String paramString1, String paramString2, boolean paramBoolean) {
/* 2822 */     String str = paramab.b(paramString1, paramString2, null);
/*      */     
/* 2824 */     return a(this.x, str, paramBoolean, paramString1, paramString2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp e a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4) {
/* 2829 */     return ac.a(paramString1, paramString2, paramBoolean, this, paramString3, paramString4);
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
/*      */   public static strictfp al k(String paramString) {
/* 2847 */     for (al al1 : f.keySet()) {
/*      */       
/* 2849 */       if (al1.i().equals(paramString))
/*      */       {
/*      */ 
/*      */         
/* 2853 */         return (al)f.get(al1);
/*      */       }
/*      */     } 
/*      */     
/* 2857 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp al c(al paramal) {
/* 2862 */     return (al)f.get(paramal);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp l l(String paramString) {
/* 2867 */     for (l l1 : d) {
/*      */       
/* 2869 */       if (paramString.equals(l1.E))
/*      */       {
/* 2871 */         return l1;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 2876 */     for (l l1 : d) {
/*      */       
/* 2878 */       if (l1.F.contains(paramString))
/*      */       {
/* 2880 */         return l1;
/*      */       }
/*      */     } 
/*      */     
/* 2884 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp k a(boolean paramBoolean, l paraml) {
/* 2890 */     return new k(paramBoolean, paraml);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void m(String paramString) {
/* 2899 */     if (ae.c(paramString)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 2904 */     y y = new y(paramString);
/*      */     
/* 2906 */     this.j.add(y);
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
/*      */   public strictfp void n(String paramString) {
/* 2946 */     ac.a(i(), new at(paramString), this);
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
/* 2963 */   m gd = new m();
/*      */ 
/*      */   
/*      */   public strictfp void o(String paramString) {
/* 2967 */     String str = "Warning (on " + b() + "): " + paramString;
/*      */     
/* 2969 */     com.corrodinggames.rts.gameFramework.l.b(str);
/* 2970 */     this.gd.add(paramString);
/*      */     
/* 2972 */     if (this.B == null) {
/*      */ 
/*      */       
/* 2975 */       com.corrodinggames.rts.gameFramework.l.u().a(str, 1);
/*      */       
/* 2977 */       if (com.corrodinggames.rts.gameFramework.l.aE) {
/*      */         
/* 2979 */         com.corrodinggames.rts.gameFramework.l.d("Crashing on allowed unit warning because automated testing is active");
/* 2980 */         throw new RuntimeException(str);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e z() {
/* 2991 */     return this.al;
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
/*      */   public static strictfp void D() {
/* 3006 */     com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*      */ 
/*      */     
/* 3009 */     for (l l2 : d) {
/*      */ 
/*      */       
/* 3012 */       z z1 = l2.K;
/*      */       
/* 3014 */       if (z1 == null) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/* 3019 */       if (z1 == z.a || z1 == z.b) {
/*      */ 
/*      */ 
/*      */         
/* 3023 */         for (Point point : l1.bt.w) {
/*      */ 
/*      */           
/* 3026 */           af af1 = l2.a();
/* 3027 */           af1.a(m.g);
/* 3028 */           l1.bt.a(point.a, point.b);
/*      */           
/* 3030 */           af1.dH = l1.bt.M;
/* 3031 */           af1.dI = l1.bt.N;
/* 3032 */           af1.dH += af1.cH();
/* 3033 */           af1.dI += af1.cI();
/*      */ 
/*      */           
/* 3036 */           if (z1 == z.a && af1 instanceof r) {
/*      */             
/* 3038 */             r r1 = (r)af1;
/*      */             
/* 3040 */             if (r1.p(null)) {
/*      */               
/* 3042 */               af1.bU();
/*      */ 
/*      */               
/*      */               continue;
/*      */             } 
/*      */           } 
/*      */           
/* 3049 */           m.c(af1);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*      */         continue;
/*      */       } 
/*      */ 
/*      */       
/* 3058 */       if (z1 == z.c || z1 == z.d) {
/*      */ 
/*      */ 
/*      */         
/* 3062 */         if (z1 == z.c) {
/*      */           
/* 3064 */           af af1 = l2.a();
/* 3065 */           af1.a(m.g);
/* 3066 */           l1.bt.b(l1.bt.f() / 2.0F, l1.bt.g() / 2.0F);
/* 3067 */           af1.dH = l1.bt.M;
/* 3068 */           af1.dI = l1.bt.N;
/* 3069 */           af1.dH += af1.cH();
/* 3070 */           af1.dI += af1.cI();
/*      */           
/* 3072 */           m.c(af1);
/*      */         } 
/*      */ 
/*      */         
/* 3076 */         if (z1 == z.d)
/*      */         {
/*      */           
/* 3079 */           for (m m1 : m.c()) {
/*      */             
/* 3081 */             if (m1.a(true, false) <= 0) {
/*      */               continue;
/*      */             }
/*      */ 
/*      */             
/* 3086 */             af af1 = l2.a();
/* 3087 */             af1.a(m1);
/* 3088 */             l1.bt.b(l1.bt.f() / 2.0F, l1.bt.g() / 2.0F);
/* 3089 */             af1.dH = l1.bt.M;
/* 3090 */             af1.dI = l1.bt.N;
/* 3091 */             af1.dH += af1.cH();
/* 3092 */             af1.dI += af1.cI();
/*      */             
/* 3094 */             m.c(af1);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         continue;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3106 */       if (z1 == z.e) {
/*      */ 
/*      */         
/* 3109 */         for (m m1 : m.c()) {
/*      */           
/* 3111 */           if (m1.a(true, false) <= 0) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 3116 */           PointF pointF = new PointF();
/* 3117 */           y.a(m1, pointF);
/*      */ 
/*      */           
/* 3120 */           af af1 = l2.a();
/* 3121 */           af1.a(m1);
/*      */           
/* 3123 */           l1.bt.b(pointF.a, pointF.b);
/* 3124 */           af1.dH = l1.bt.M;
/* 3125 */           af1.dI = l1.bt.N;
/* 3126 */           af1.dH += af1.cH();
/* 3127 */           af1.dI += af1.cI();
/*      */           
/* 3129 */           m.c(af1);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*      */         continue;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3139 */       com.corrodinggames.rts.gameFramework.l.b("onNewMapSpawn unhandled: " + l2.K);
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
/*      */   public strictfp int a(af paramaf) {
/* 3153 */     boolean bool = false;
/*      */     
/* 3155 */     if (this.aA > 0.0F)
/*      */     {
/* 3157 */       return (int)this.aA;
/*      */     }
/*      */     
/* 3160 */     if (this.ay && this.aw)
/*      */     {
/* 3162 */       if (paramaf.y() < 20)
/*      */       {
/* 3164 */         bool += true;
/*      */       }
/*      */     }
/* 3167 */     return bool;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
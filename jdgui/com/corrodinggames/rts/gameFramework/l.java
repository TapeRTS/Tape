/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.app.Activity;
/*      */ import android.content.Context;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.net.wifi.WifiInfo;
/*      */ import android.net.wifi.WifiManager;
/*      */ import android.os.Build;
/*      */ import android.os.Debug;
/*      */ import android.os.Handler;
/*      */ import android.os.Looper;
/*      */ import android.util.Log;
/*      */ import android.view.KeyEvent;
/*      */ import com.corrodinggames.rts.a.c;
/*      */ import com.corrodinggames.rts.a.d;
/*      */ import com.corrodinggames.rts.a.g;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.i;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.custom.ag;
/*      */ import com.corrodinggames.rts.game.units.f.c;
/*      */ import com.corrodinggames.rts.gameFramework.a.e;
/*      */ import com.corrodinggames.rts.gameFramework.b.c;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.d.f;
/*      */ import com.corrodinggames.rts.gameFramework.d.k;
/*      */ import com.corrodinggames.rts.gameFramework.f.a;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ai;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.h.h;
/*      */ import com.corrodinggames.rts.gameFramework.i.a;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.k.f;
/*      */ import com.corrodinggames.rts.gameFramework.utility.d;
/*      */ import com.corrodinggames.rts.gameFramework.utility.i;
/*      */ import java.io.File;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.PrintWriter;
/*      */ import java.io.StringWriter;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ import java.util.regex.Matcher;
/*      */ import java.util.regex.Pattern;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class l
/*      */ {
/*   91 */   protected static l ag = null;
/*      */   
/*   93 */   public Context ah = null;
/*      */ 
/*      */   
/*      */   public Context ai;
/*      */ 
/*      */   
/*      */   public d aj;
/*      */ 
/*      */   
/*      */   public d ak;
/*      */   
/*      */   public boolean al;
/*      */   
/*      */   public boolean am = false;
/*      */   
/*      */   public static boolean an = true;
/*      */   
/*      */   public static boolean ao = false;
/*      */ 
/*      */   
/*      */   public static strictfp boolean b(Context paramContext) {
/*  114 */     String str = null;
/*      */     
/*  116 */     if (aF) {
/*      */       
/*  118 */       str = "dedicatedServer";
/*      */     }
/*      */     else {
/*      */       
/*  122 */       str = paramContext.g().h();
/*      */     } 
/*      */     
/*  125 */     Log.d("RustedWarfare", "packageName:" + str);
/*      */     
/*  127 */     if (str.contains("rtsdemo"))
/*      */     {
/*  129 */       return true;
/*      */     }
/*      */     
/*  132 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean ap = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static Throwable aq;
/*      */ 
/*      */   
/*      */   public static boolean ar = false;
/*      */ 
/*      */   
/*      */   public static boolean as;
/*      */ 
/*      */   
/*      */   public static boolean at;
/*      */ 
/*      */   
/*      */   public static boolean au;
/*      */ 
/*      */   
/*      */   public static boolean av;
/*      */ 
/*      */   
/*      */   public static boolean aw;
/*      */ 
/*      */   
/*      */   public static boolean ax;
/*      */ 
/*      */   
/*      */   public static boolean ay;
/*      */ 
/*      */   
/*      */   public static boolean az = false;
/*      */ 
/*      */   
/*      */   public static boolean aA = false;
/*      */ 
/*      */   
/*      */   public static boolean aB;
/*      */ 
/*      */   
/*  178 */   public static String aC = null;
/*      */ 
/*      */   
/*      */   public static boolean aD;
/*      */ 
/*      */   
/*      */   public static boolean aE = false;
/*      */   
/*      */   public static boolean aF = false;
/*      */   
/*      */   public static boolean aG = false;
/*      */   
/*      */   public static boolean aH = false;
/*      */   
/*      */   public static boolean aI = false;
/*      */   
/*      */   public static boolean aJ = false;
/*      */   
/*  196 */   public static String aK = null;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean aL = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean aM = true;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean aN = true;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean aO = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean aP = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static Class aQ;
/*      */ 
/*      */ 
/*      */   
/*      */   public static l aR;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aS = false;
/*      */ 
/*      */   
/*      */   public boolean aT;
/*      */ 
/*      */   
/*      */   public boolean aU = false;
/*      */ 
/*      */   
/*      */   public boolean aV = false;
/*      */ 
/*      */   
/*      */   public boolean aW = false;
/*      */ 
/*      */   
/*      */   public boolean aX = false;
/*      */ 
/*      */   
/*      */   public boolean aY = false;
/*      */ 
/*      */   
/*      */   public boolean aZ;
/*      */ 
/*      */   
/*      */   public boolean ba = false;
/*      */ 
/*      */   
/*      */   public m bb;
/*      */ 
/*      */   
/*  258 */   public float bc = 1.0F;
/*  259 */   public float bd = -1.0F;
/*      */ 
/*      */   
/*      */   public boolean be;
/*      */ 
/*      */   
/*      */   public boolean bf;
/*      */ 
/*      */   
/*  268 */   public int bg = 0;
/*      */   
/*      */   public int bh;
/*      */   
/*      */   public int bi;
/*      */   
/*      */   public int bj;
/*      */   
/*      */   public int bk;
/*      */   
/*      */   public int bl;
/*      */   
/*      */   public boolean bm;
/*      */   
/*      */   public boolean bn = false;
/*      */   
/*      */   public volatile boolean bo = false;
/*      */   
/*      */   public volatile boolean bp = false;
/*      */   
/*      */   public volatile boolean bq = false;
/*      */   
/*      */   public volatile boolean br = false;
/*      */   
/*      */   public i bs;
/*      */   
/*      */   public b bt;
/*      */   
/*      */   public e bu;
/*      */   
/*      */   public am bv;
/*      */   
/*      */   public l bw;
/*      */   
/*      */   public a bx;
/*      */   
/*      */   public SettingsEngine by;
/*      */   
/*      */   public c bz;
/*      */   
/*      */   public f bA;
/*      */   
/*      */   public ac bB;
/*      */   
/*      */   public h bC;
/*      */   
/*      */   public aa bD;
/*      */   
/*      */   public k bE;
/*      */   public ad bF;
/*      */   public bg bG;
/*      */   public a bH;
/*      */   public y bI;
/*      */   public ba bJ;
/*      */   public c bK;
/*      */   public bj bL;
/*      */   public f bM;
/*      */   public c bN;
/*      */   public boolean bO = false;
/*      */   public float bP;
/*      */   public float bQ;
/*      */   public static Point bR;
/*      */   public float bS;
/*      */   public float bT;
/*  332 */   public float bU = 1.0F;
/*      */   
/*      */   public float bV;
/*      */   
/*      */   public float bW;
/*      */   
/*      */   public float bX;
/*      */   
/*      */   public float bY;
/*      */   
/*      */   public float bZ;
/*      */   
/*      */   public boolean ca;
/*      */   
/*      */   public int cb;
/*      */   
/*      */   public int cc;
/*      */   
/*      */   public float cd;
/*      */   
/*      */   public float ce;
/*      */   
/*      */   public float cf;
/*      */   
/*      */   public float cg;
/*      */   public float ch;
/*      */   public float ci;
/*      */   public float cj;
/*      */   public float ck;
/*      */   public float cl;
/*      */   public float cm;
/*      */   public float cn;
/*      */   public float co;
/*      */   public float cp;
/*      */   public float cq;
/*  367 */   public final Rect cr = new Rect();
/*  368 */   public final Rect cs = new Rect();
/*  369 */   public final RectF ct = new RectF();
/*      */   
/*  371 */   public final Rect cu = new Rect();
/*  372 */   public final RectF cv = new RectF();
/*      */ 
/*      */   
/*  375 */   public final RectF cw = new RectF();
/*      */   
/*  377 */   public final Rect cx = new Rect();
/*      */ 
/*      */   
/*      */   public boolean cy;
/*      */ 
/*      */   
/*      */   public boolean cz;
/*      */   
/*      */   public float cA;
/*      */   
/*      */   public boolean cB;
/*      */ 
/*      */   
/*      */   public strictfp boolean t() {
/*  391 */     return (this.cz || this.cA > 0.0F || this.cB);
/*      */   }
/*      */   
/*  394 */   public float cC = 1.0F;
/*      */   
/*      */   public boolean cD = false;
/*  397 */   public float cE = 1.0F;
/*      */   
/*  399 */   public float cF = 1.0F;
/*      */ 
/*      */   
/*      */   public boolean cG;
/*      */ 
/*      */   
/*      */   public float cH;
/*      */ 
/*      */   
/*      */   public float cI;
/*      */ 
/*      */   
/*      */   public boolean cJ = true;
/*      */ 
/*      */   
/*      */   public boolean cK = true;
/*      */ 
/*      */   
/*      */   public boolean cL = true;
/*      */ 
/*      */   
/*      */   public boolean cM = true;
/*      */ 
/*      */   
/*      */   public boolean cN = true;
/*      */ 
/*      */   
/*  426 */   public float cO = 0.0F;
/*  427 */   public float cP = 0.0F;
/*      */   
/*      */   public boolean cQ = false;
/*  430 */   protected z cR = null;
/*      */ 
/*      */   
/*      */   public String cS;
/*      */ 
/*      */   
/*      */   public k cT;
/*      */ 
/*      */   
/*      */   public Paint cU;
/*      */ 
/*      */   
/*      */   public Paint cV;
/*      */ 
/*      */   
/*      */   public Paint cW;
/*      */ 
/*      */   
/*      */   public boolean cX = false;
/*      */ 
/*      */   
/*      */   public boolean cY = false;
/*      */ 
/*      */   
/*  454 */   public float cZ = 0.0F;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean da = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean db = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dc = false;
/*      */ 
/*      */   
/*      */   public int dd;
/*      */ 
/*      */   
/*  472 */   public float de = 0.0F;
/*      */ 
/*      */   
/*  475 */   public static o df = new v();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp l u() {
/*  495 */     return ag;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean v() {
/*  503 */     return aO;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean w() {
/*  509 */     return aP;
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
/*      */   public strictfp void c(Context paramContext) {
/*  524 */     c.a(paramContext);
/*      */     
/*  526 */     this.ah = paramContext;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static synchronized strictfp l a(Context paramContext, n paramn) {
/*  537 */     if (ag != null) {
/*      */       
/*  539 */       if (paramn != null)
/*      */       {
/*  541 */         ag.do = paramn;
/*      */       }
/*  543 */       ag.c(paramContext);
/*  544 */       return ag;
/*      */     } 
/*      */     
/*  547 */     ag = df.a(paramContext);
/*  548 */     d("Created new gameEngine of:" + ag.getClass().getName());
/*  549 */     if (paramn != null)
/*      */     {
/*  551 */       ag.do = paramn;
/*      */     }
/*      */     
/*  554 */     ag.a(paramContext);
/*  555 */     return ag;
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
/*      */   protected strictfp void finalize() {
/*  578 */     Log.d("RustedWarfare", "GameEngine:finalize()");
/*      */     
/*  580 */     super.finalize();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean x() {
/*  587 */     return true;
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
/*      */   public strictfp void y() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String z() {
/*  639 */     if (al())
/*      */     {
/*      */       
/*  642 */       return "PC";
/*      */     }
/*  644 */     if (aJ) {
/*      */       
/*  646 */       String str = a.a();
/*  647 */       if (str != null)
/*      */       {
/*  649 */         return "IOS - " + str;
/*      */       }
/*  651 */       return "IOS";
/*      */     } 
/*  653 */     if (aF)
/*      */     {
/*  655 */       return "SERVER";
/*      */     }
/*      */     
/*  658 */     return Build.MODEL;
/*      */   }
/*      */   
/*  661 */   public static String dg = Build.VERSION.RELEASE; float dh; boolean di; ArrayList dj; final Handler dk; public String dl; private Runnable a; public String dm; public String dn; private Runnable b; public n do; String dp; Object dq; String dr; String ds; public boolean[] dt; protected ConcurrentLinkedQueue du; private boolean[] c; private boolean[] d; private int e;
/*      */   
/*      */   public strictfp String A() {
/*  664 */     return dg;
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
/*      */   public strictfp boolean B() {
/*  698 */     if (this.bq)
/*      */     {
/*  700 */       return true;
/*      */     }
/*  702 */     return false;
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
/*      */   public synchronized strictfp void C() {
/*  775 */     d("--- setRunning ---");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  780 */     if (!al() && !aJ)
/*      */     {
/*  782 */       this.bv.h();
/*      */     }
/*      */     
/*  785 */     if (!aG && !aL)
/*      */     {
/*      */       
/*  788 */       if (this.cR == null) {
/*      */         
/*  790 */         this.cR = new z();
/*      */         
/*  792 */         this.cR.a(true);
/*  793 */         this.cR.start();
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
/*      */   public synchronized strictfp void D() {
/*  805 */     d("--- setStoppedIfNotInGameThread ---");
/*      */     
/*  807 */     if (Thread.currentThread() != this.cR)
/*      */     {
/*  809 */       E();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized strictfp void E() {
/*  817 */     d("--- setStopped ---");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  822 */     if (this.cR == null) {
/*      */       
/*  824 */       Log.d("RustedWarfare", "gameThread already null");
/*      */       
/*      */       return;
/*      */     } 
/*  828 */     if (!al())
/*      */     {
/*  830 */       this.bv.f();
/*      */     }
/*      */     
/*  833 */     this.cR.a(false);
/*      */ 
/*      */     
/*  836 */     if (Thread.currentThread() != this.cR) {
/*      */       
/*  838 */       boolean bool = true;
/*      */       
/*  840 */       while (bool) {
/*      */         try {
/*  842 */           this.cR.join();
/*  843 */           bool = false;
/*      */         }
/*  845 */         catch (InterruptedException interruptedException) {}
/*      */       } 
/*      */ 
/*      */       
/*  849 */       Log.d("RustedWarfare", "thread stop");
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  855 */       f("currentThread is game thread");
/*      */     } 
/*      */ 
/*      */     
/*  859 */     this.cR = null;
/*      */     
/*  861 */     if (this.aj != null)
/*      */     {
/*  863 */       this.aj.n();
/*      */     }
/*      */ 
/*      */     
/*  867 */     if (this.bn)
/*      */     {
/*  869 */       Debug.stopMethodTracing();
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
/*      */   public strictfp boolean F() {
/*  888 */     if (this.bF == null) return false;
/*      */     
/*  890 */     if (!this.bF.z)
/*      */     {
/*  892 */       return false;
/*      */     }
/*  894 */     if (this.bF.D || this.bJ.h())
/*      */     {
/*  896 */       return false;
/*      */     }
/*  898 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean G() {
/*  904 */     if (this.bF == null) return false;
/*      */     
/*  906 */     return this.bF.z;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean H() {
/*  911 */     if (this.bF == null) return false;
/*      */     
/*  913 */     if (this.bF.D)
/*      */     {
/*  915 */       return true;
/*      */     }
/*      */     
/*  918 */     return (this.bF.z || this.bJ.h());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean I() {
/*  924 */     if (this.bF == null) return true;
/*      */     
/*  926 */     if (this.bF.D)
/*      */     {
/*  928 */       return true;
/*      */     }
/*      */     
/*  931 */     return (!this.bF.z && !this.bJ.h());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void J() {
/*  942 */     this.ca = false;
/*      */     
/*  944 */     if (this.cf < 0.0F) {
/*      */       
/*  946 */       this.cf = 0.0F;
/*  947 */       this.ca = true;
/*      */     } 
/*  949 */     if (this.cg < 0.0F) {
/*      */       
/*  951 */       this.cg = 0.0F;
/*  952 */       this.ca = true;
/*      */     } 
/*      */     
/*  955 */     if (this.bt != null) {
/*      */       
/*  957 */       if (this.cf > this.bt.f() - this.cl) {
/*      */         
/*  959 */         this.cf = this.bt.f() - this.cl;
/*  960 */         this.ca = true;
/*      */       } 
/*  962 */       if (this.cg > this.bt.g() - this.ci) {
/*      */         
/*  964 */         this.cg = this.bt.g() - this.ci;
/*  965 */         this.ca = true;
/*      */       } 
/*      */       
/*  968 */       if (this.cl > this.bt.f()) {
/*      */         
/*  970 */         this.cf = this.bt.f() / 2.0F - this.cl / 2.0F;
/*  971 */         this.ca = true;
/*      */       } 
/*      */       
/*  974 */       if (this.ci > this.bt.g()) {
/*      */         
/*  976 */         this.cg = this.bt.g() / 2.0F - this.ci / 2.0F;
/*  977 */         this.ca = true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  982 */     a(this.cf, this.cg);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2) {
/*  988 */     this.cf = paramFloat1;
/*  989 */     this.cg = paramFloat2;
/*      */     
/*  991 */     this.cb = (int)this.cf;
/*  992 */     this.cc = (int)this.cg;
/*      */ 
/*      */     
/*  995 */     this.cd = (int)(this.cf * this.cE) / this.cE;
/*  996 */     this.ce = (int)(this.cg * this.cE) / this.cE;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1020 */     char c1 = 'Z';
/*      */     
/* 1022 */     if (v())
/*      */     {
/* 1024 */       c1 = 'Ò';
/*      */     }
/*      */ 
/*      */     
/* 1028 */     this.cu.a((int)(this.cf - c1), (int)(this.cg - c1), (int)(this.cf + this.ch + c1), (int)(this.cg + this.ci + c1));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1033 */     this.cv.a(this.cu);
/*      */     
/* 1035 */     this.cx.a((int)this.cf, (int)this.cg, (int)(this.cf + this.ch), (int)(this.cg + this.ci));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1040 */     char c2 = 'Ĭ';
/*      */     
/* 1042 */     this.cw.a((int)(this.cf - c2), (int)(this.cg - c2), (int)(this.cf + this.ch + c2), (int)(this.cg + this.ci + c2));
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
/*      */   public strictfp void b(float paramFloat1, float paramFloat2) {
/* 1063 */     a(paramFloat1 - this.cl / 2.0F, paramFloat2 - this.ci / 2.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean d(Context paramContext) {
/* 1074 */     if (aF)
/*      */     {
/* 1076 */       return false;
/*      */     }
/*      */     
/* 1079 */     if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
/*      */       
/*      */       try {
/*      */         
/* 1083 */         WifiManager wifiManager = (WifiManager)paramContext.b("wifi");
/* 1084 */         WifiInfo wifiInfo = wifiManager.getConnectionInfo();
/* 1085 */         if (wifiInfo != null)
/*      */         {
/* 1087 */           if ("BlueStacks".equals(wifiInfo.getSSID()))
/*      */           {
/* 1089 */             return true;
/*      */           
/*      */           }
/*      */         }
/*      */       }
/* 1094 */       catch (Exception exception) {
/*      */         
/* 1096 */         exception.printStackTrace();
/*      */       } 
/*      */     }
/* 1099 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void K() {
/* 1106 */     if (this.cE != 1.0F)
/*      */     {
/* 1108 */       this.bw.a(this.cE, this.cE);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void L() {
/* 1115 */     if (this.cE != 1.0F)
/*      */     {
/* 1117 */       this.bw.a(1.0F / this.cE, 1.0F / this.cE);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(String paramString, Exception paramException) {
/* 1127 */     d(paramString);
/* 1128 */     paramException.printStackTrace();
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(String paramString1, String paramString2) {
/* 1133 */     if (ar)
/*      */     {
/* 1135 */       if (!paramString1.contains("\033[0m"))
/*      */       {
/* 1137 */         paramString1 = paramString2 + paramString1 + "\033[0m";
/*      */       }
/*      */     }
/* 1140 */     return paramString1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(String paramString) {
/* 1146 */     d(a("--- ERROR: " + paramString, "\033[31m"));
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void b(String paramString) {
/* 1151 */     d(a(paramString, "\033[33m"));
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
/*      */   public static strictfp void a(String paramString, Throwable paramThrowable) {
/* 1163 */     b(paramString);
/* 1164 */     d("" + paramThrowable.toString());
/* 1165 */     d("cause:" + paramThrowable.getCause());
/* 1166 */     paramThrowable.printStackTrace();
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void c(String paramString) {
/* 1171 */     if (aH) {
/*      */ 
/*      */ 
/*      */       
/* 1175 */       Log.b("RustedWarfare", paramString);
/*      */       return;
/*      */     } 
/* 1178 */     Log.b("RustedWarfare", paramString);
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
/*      */   public static strictfp void d(String paramString) {
/* 1195 */     c(paramString);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void b(String paramString1, String paramString2) {
/* 1200 */     c(paramString1 + ":" + paramString2);
/*      */   }
/*      */ 
/*      */   
/*      */   public static synchronized strictfp void e(String paramString) {
/* 1205 */     c(paramString + " (at " + System.nanoTime() + ")");
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
/*      */   public static strictfp void M() {
/* 1221 */     StackTraceElement[] arrayOfStackTraceElement = (new Throwable()).getStackTrace();
/* 1222 */     for (StackTraceElement stackTraceElement : arrayOfStackTraceElement)
/*      */     {
/* 1224 */       d(stackTraceElement.toString());
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
/*      */   public static strictfp void f(String paramString) {
/* 1241 */     b(paramString);
/* 1242 */     M();
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
/*      */   public static strictfp long N() {
/* 1266 */     return System.currentTimeMillis();
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp boolean a(long paramLong1, long paramLong2) {
/* 1271 */     long l1 = N();
/* 1272 */     if (paramLong1 + paramLong2 < l1)
/*      */     {
/* 1274 */       return true;
/*      */     }
/* 1276 */     if (l1 < paramLong1 - 1000L)
/*      */     {
/* 1278 */       return true;
/*      */     }
/* 1280 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float O() {
/* 1286 */     float f1 = this.bP;
/*      */     
/* 1288 */     if (this.by != null) {
/*      */       
/* 1290 */       f1 *= this.by.renderDensity;
/*      */       
/* 1292 */       f1 *= this.by.uiRenderScale;
/*      */       
/* 1294 */       if (this.by.renderDoubleScale)
/*      */       {
/* 1296 */         return f1 / 2.0F;
/*      */       }
/*      */     } 
/*      */     
/* 1300 */     return f1;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp int e(float paramFloat) {
/* 1305 */     return (int)(paramFloat * this.bQ + 0.5F);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int a(int paramInt) {
/* 1311 */     return (int)(paramInt * this.bQ + 0.5F);
/*      */   } public strictfp void P() { if (this.dh != this.bQ) { d("Density size changed, refreshing fonts"); synchronized (this.dj) { for (m m1 : this.dj) m1.a();  }  this.dh = this.bQ; }  } protected strictfp void Q() { for (m m1 : this.dj) this.bw.a(m1.b);  this.di = true; } public strictfp void a(Paint paramPaint) { a(paramPaint, 16.0F); } public strictfp void a(Paint paramPaint, float paramFloat) { m m1 = new m(this); m1.a = paramFloat; m1.b = paramPaint; m1.a(); synchronized (this.dj) { this.dj.add(m1); }  if (this.di) this.bw.a(m1.b);  } public strictfp void g(String paramString) { a(paramString, true); } public strictfp void a(String paramString, boolean paramBoolean) { this.dp = paramString; if (this.do != null) this.do.a(paramString, paramBoolean);  } public strictfp void R() { this.dp = null; } public strictfp void h(String paramString) { a(paramString, 1); } public strictfp void a(String paramString, int paramInt) { if (aF) { d("alert:" + paramString); } else { this.dl = paramString; this.dk.a(this.a); }  if (this.do != null) this.do.a(paramString, paramInt);  } public strictfp void a(String paramString, ag paramag) { String str = null; if (paramag != null) str = paramag.b();  c(paramString, str); } public strictfp void c(String paramString1, String paramString2) { if (this.do != null) this.do.a(paramString1, paramString2);  if (aF) { if (this.do == null) b("showMessageBox: not showing due to non-android:" + paramString2);  return; }  this.aZ = true; this.dm = paramString1; this.dn = paramString2; this.dk.a(this.b); } public strictfp void S() { synchronized (this.dq) { if (this.dr != null) { c(this.ds, this.dr); this.dr = null; this.ds = null; }  }  } public strictfp void d(String paramString1, String paramString2) { this.ds = paramString1; this.dr = paramString2; if (aG) { S(); return; }  l$3 l$3 = new l$3(this); l$3.start(); }
/*      */   public strictfp boolean T() { if (this.al) return false;  if (this.aj.m() == null) return false;  return this.aj.m().b(); }
/*      */   public strictfp void U() { if (this.aj.m() == null) return;  this.aj.m().c(); }
/*      */   public strictfp int V() { if (this.al) return 0;  return this.aj.m().a(); }
/*      */   public strictfp float W() { return b(0); }
/*      */   public strictfp float X() { return c(0); }
/*      */   public strictfp float b(int paramInt) { if (this.by.renderDoubleScale) return this.aj.m().d()[paramInt] / 2.0F;  return this.aj.m().d()[paramInt]; }
/*      */   public strictfp float c(int paramInt) { if (this.by.renderDoubleScale) return this.aj.m().f()[paramInt] / 2.0F;  return this.aj.m().f()[paramInt]; }
/* 1320 */   public strictfp l(Context paramContext) { this.di = false;
/*      */     
/* 1322 */     this.dj = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1410 */     this.dk = new Handler(Looper.b());
/*      */ 
/*      */ 
/*      */     
/* 1414 */     this.a = new l$1(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1431 */     this.b = new l$2(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1486 */     this.do = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1517 */     this.dp = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1604 */     this.dq = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1761 */     this.dt = new boolean[10];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1903 */     this.du = new ConcurrentLinkedQueue();
/*      */     
/* 1905 */     this.c = new boolean[KeyEvent.a() + 1];
/* 1906 */     this.d = new boolean[KeyEvent.a() + 1];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2869 */     this.dF = 42;
/* 2870 */     this.dG = 42;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2899 */     this.dH = new q();
/* 2900 */     this.dI = new q();
/*      */     
/* 2902 */     this.dJ = new q(); Log.d("RustedWarfare", "GameEngine:GameEngine()"); if (ag != null)
/*      */       throw new RuntimeException("gameEngine already created");  c(paramContext); ag = this; }
/*      */   public strictfp int d(int paramInt) { return this.aj.m().e()[paramInt]; }
/*      */   public strictfp boolean e(int paramInt) { if (paramInt != 1 && paramInt != 2 && paramInt != 3)
/*      */       throw new RuntimeException("Unknown mouseButton:" + paramInt);  int j = f(paramInt); if (j != -1)
/*      */       return true;  return false; }
/*      */   public strictfp int f(int paramInt) { if (paramInt == 0)
/*      */       throw new RuntimeException("finding state of 0 doesn't make sense");  int[] arrayOfInt = this.aj.m().e(); for (byte b1 = 0; b1 < arrayOfInt.length; b1++) { if (arrayOfInt[b1] == paramInt)
/*      */         return b1;  }
/*      */      return -1; }
/*      */   public strictfp boolean g(int paramInt) { if (paramInt >= this.c.length || paramInt < 0)
/*      */       return false;  if (this.c[paramInt] && this.d[paramInt]) {
/*      */       this.d[paramInt] = false; return true;
/*      */     }  return false; }
/*      */   public strictfp boolean h(int paramInt) { if (paramInt >= this.c.length || paramInt < 0)
/*      */       return false;  return this.c[paramInt]; }
/*      */   public strictfp boolean a(int paramInt, boolean paramBoolean) { boolean bool1 = true; boolean bool2 = true; int j = Y(); if ((paramInt & 0x2) != 0) {
/*      */       if ((j & 0x2) == 0)
/*      */         bool1 = false; 
/*      */     } else if ((j & 0x2) != 0) {
/*      */       bool2 = false;
/*      */     }  if ((paramInt & 0x1) != 0) {
/*      */       if ((j & 0x1) == 0)
/*      */         bool1 = false; 
/*      */     } else if ((j & 0x1) != 0) {
/*      */       bool2 = false;
/*      */     }  if ((paramInt & 0x4) != 0) {
/*      */       if ((j & 0x4) == 0)
/*      */         bool1 = false; 
/*      */     } else if ((j & 0x4) != 0) {
/*      */       bool2 = false;
/*      */     }  if (paramBoolean)
/*      */       return bool1;  return (bool1 && bool2); }
/*      */   public strictfp boolean i(int paramInt) { boolean bool = true; if (paramInt == 59 || paramInt == 60)
/*      */       return true;  if (paramInt == 113 || paramInt == 114)
/*      */       return true;  if (paramInt == 57 || paramInt == 58)
/*      */       return true;  return false; }
/*      */   public static strictfp String j(int paramInt) { String str = ""; if ((paramInt & 0x2) != 0)
/*      */       str = str + "shift+";  if ((paramInt & 0x1) != 0)
/*      */       str = str + "ctrl+";  if ((paramInt & 0x4) != 0)
/*      */       str = str + "alt+";  return str; }
/*      */   public strictfp int Y() { byte b1 = 0; if (h(59) || h(60))
/*      */       b1 += true;  if (h(113) || h(114))
/*      */       b1++;  if (h(57) || h(58))
/* 2946 */       b1 += 4;  return b1; } public strictfp void a(Runnable paramRunnable) { this.dI.a(paramRunnable); }
/*      */   public strictfp boolean c(int paramInt1, int paramInt2) { boolean bool1 = false; boolean bool2 = false; if (paramInt1 >= 0 && paramInt1 < this.c.length) bool1 = this.c[paramInt1];  if (paramInt2 >= 0 && paramInt2 < this.c.length) bool2 = this.c[paramInt2];  return (bool1 || bool2); }
/*      */   public strictfp void b(int paramInt, boolean paramBoolean) { if (paramInt >= 0 && paramInt < this.c.length) { this.c[paramInt] = paramBoolean; if (paramBoolean) this.d[paramInt] = paramBoolean;  } else { d("setKeyState: Key out of range:" + paramInt); }  }
/*      */   public strictfp void k(int paramInt) { this.du.add(new t(this, paramInt)); }
/*      */   public strictfp int Z() { return this.e; }
/*      */   protected strictfp void aa() { this.e = 0; while (true) { p p = this.du.poll(); if (p == null) break;  if (p instanceof r) { r r = (r)p; if (r.c >= this.c.length || r.c < 0) { b("updateKeyState", "keyCode (" + r.c + ") is out of range"); continue; }  this.c[r.c] = !r.d; this.d[r.c] = !r.d; continue; }  if (p instanceof t) { t t = (t)p; this.e += t.c; }  }  }
/*      */   public static strictfp String i(String paramString) { int j = paramString.lastIndexOf("/"); if (j == -1) j = paramString.length();  return paramString.substring(0, j); }
/* 2953 */   public static strictfp String j(String paramString) { int j = paramString.lastIndexOf("/"); if (j == -1) { j = 0; } else { j++; }  return paramString.substring(j); } public static strictfp Integer k(String paramString) { String str = j(paramString); d("getMapLevel for :" + paramString + " file:" + str); Pattern pattern = Pattern.compile("^l(\\d*);.*"); Matcher matcher = pattern.matcher(str); if (matcher.matches()) { d("getMapLevel:" + paramString + ":" + Integer.parseInt(matcher.group(1))); return Integer.valueOf(Integer.parseInt(matcher.group(1))); }  return null; } public static strictfp String l(String paramString) { l l1 = u(); Integer integer = k(paramString); if (integer == null) return null;  int j = paramString.lastIndexOf("/"); if (j == -1) j = paramString.length();  String str = paramString.substring(0, j); String[] arrayOfString = a.a(str, true); if (arrayOfString == null) return null;  for (String str1 : arrayOfString) { Integer integer1 = k(str1); if (integer1 != null) if (integer1.intValue() > integer.intValue()) if (!l1.am || g.a(str1, str + "/" + str1)) return str + "/" + str1;    }  return null; } public strictfp String ab() { return this.cS; } public strictfp String ac() { String str = this.cS; if (this.cS == null || "".equals(this.cS)) if (G()) str = this.bF.aI;   return g.d(g.c(str)); } public strictfp String ad() { return g.c(this.cS); } public strictfp ai ae() { if (g.f(this.cS)) return ai.b;  return ai.a; } public static strictfp String a(Throwable paramThrowable) { StringWriter stringWriter = new StringWriter(); PrintWriter printWriter = new PrintWriter(stringWriter); paramThrowable.printStackTrace(printWriter); String str = stringWriter.toString(); printWriter.close(); return str; } public static boolean dv = false; static byte[] dw; static byte[] dx = new byte[1000]; static d dy; public static strictfp String b(Throwable paramThrowable) { String str1 = paramThrowable.getMessage(); if (str1 == null) { str1 = paramThrowable.getClass().getName(); } else { str1 = str1.replace("java.lang.RuntimeException: ", ""); str1 = str1.replace("java.lang.RuntimeException: ", ""); }  Throwable throwable = paramThrowable; while (throwable != null) { Throwable throwable1 = throwable.getCause(); if (throwable1 != null && throwable1 != paramThrowable && throwable1 != throwable) { throwable = throwable1; continue; }  break; }  String str2 = null; if (throwable != null && throwable != paramThrowable) { str2 = throwable.getMessage(); if (str2 == null) str2 = throwable.getClass().getName();  String str = str1; if (!str2.equals(str)) str1 = str1 + " caused by (" + str2 + ")";  }  return str1; } public static strictfp void e(String paramString1, String paramString2) { String str1 = "/SD/rustedWarfare/crashes.txt"; String str2 = a.c(str1); File file = new File(str2); try { PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true)); String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new Date()); printWriter.write("\r\n" + paramString1 + " (at " + str + ")\n"); printWriter.write(paramString2 + "\r\n"); printWriter.close(); } catch (Throwable throwable) { d("Exception in writeCrashToFile"); throwable.printStackTrace(); }  } static boolean dz = false; public static strictfp void af() { if (!ao) return;  if (aF) return;  if (dy != null) { b("setupANRWatchDog: activeANRWatchDog!=null"); return; }  dy = new d(4000); dy.a(new l$4()); dy.start(); b("setupANRWatchDog: running"); } public static strictfp void ag() { if (dw == null) if (al()) { dw = new byte[2500000]; dw[0] = 2; dw[dw.length - 1] = 5; }   if (au) { Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler(); if (!(uncaughtExceptionHandler instanceof i)) Thread.currentThread().setUncaughtExceptionHandler(new i(uncaughtExceptionHandler));  } else { Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler(); if (!(uncaughtExceptionHandler instanceof i)) Thread.setDefaultUncaughtExceptionHandler(new i(uncaughtExceptionHandler));  }  } public strictfp boolean ah() { return true; } public strictfp boolean ai() { return true; } static int dA = 0; static boolean dB; public static strictfp void m(String paramString) { l l1 = u(); if (l1 != null) { dA++; if (dA < 1000) b("reportProblem: " + paramString);  if (dA < 10) l1.a(paramString, 1);  }  } public static strictfp boolean aj() { return !aF; } public final strictfp boolean a(float paramFloat1, float paramFloat2, float paramFloat3) { return (this.ct.a < paramFloat1 + paramFloat3 && paramFloat1 - paramFloat3 < this.ct.c && this.ct.b < paramFloat2 + paramFloat3 && paramFloat2 - paramFloat3 < this.ct.d); }
/*      */ 
/*      */   
/*      */   public static strictfp boolean ak() {
/*      */     return (!aG || aJ);
/*      */   }
/*      */   
/*      */   public static strictfp boolean al() {
/*      */     return (aG && !aJ);
/*      */   }
/*      */   
/*      */   public static strictfp boolean am() {
/*      */     return (aG && !aJ);
/*      */   }
/*      */   
/*      */   public static strictfp boolean an() {
/*      */     return (aF && !aG);
/*      */   }
/*      */   
/*      */   public strictfp boolean ao() {
/*      */     return (this.bF.z || this.bJ.h());
/*      */   }
/*      */   
/*      */   public strictfp void a(af paramaf, float paramFloat) {
/*      */     this.bE.a((int)paramaf.dH, (int)paramaf.dI, paramFloat, paramaf);
/*      */     this.bA.f.c(paramaf);
/*      */   }
/*      */   
/*      */   public static strictfp void ap() {
/*      */     System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
/*      */     long l1 = Runtime.getRuntime().maxMemory();
/*      */     System.out.println("Maximum memory (bytes): " + ((l1 == Long.MAX_VALUE) ? "no limit" : (String)Long.valueOf(l1)));
/*      */     System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
/*      */   }
/*      */   
/*      */   public strictfp Context aq() {
/*      */     return this.ah;
/*      */   }
/*      */   
/*      */   public static strictfp void f(String paramString1, String paramString2) {
/*      */     l l1 = u();
/*      */     if (l1 == null)
/*      */       return; 
/*      */     String str = paramString2;
/*      */     if (l1.bA != null && l1.bA.e != null) {
/*      */       l1.bA.e.a(paramString1, str);
/*      */     } else {
/*      */       f("addMessage: interfaceEngine/messageInterface==null");
/*      */     } 
/*      */   }
/*      */   
/*      */   static u dC = null;
/*      */   static boolean dD;
/*      */   static boolean dE;
/*      */   public byte dF;
/*      */   public byte dG;
/*      */   public final q dH;
/*      */   public final q dI;
/*      */   public final q dJ;
/*      */   
/*      */   public static strictfp void a(u paramu, Throwable paramThrowable) {
/*      */     dx = null;
/*      */     d("reportCaughtOutOfMemory:" + dC);
/*      */     if (dC != null)
/*      */       return; 
/*      */     dC = paramu;
/*      */     if (paramThrowable != null)
/*      */       paramThrowable.printStackTrace(); 
/*      */     ap();
/*      */   }
/*      */   
/*      */   public strictfp void ar() {
/*      */     if (dD && !dE) {
/*      */       dE = true;
/*      */       String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
/*      */       int j = this.bH.f();
/*      */       if (j > 1)
/*      */         str = str + "This is often caused by large mods, you currently have: " + j + " mods loaded. "; 
/*      */       c("Warning: Low memory detected", str);
/*      */     } 
/*      */     if (!dB && dC != null) {
/*      */       d("Showing out of memory message");
/*      */       dB = true;
/*      */       String str1 = "";
/*      */       String str2 = "trying to load data";
/*      */       if (dC == u.a) {
/*      */         str2 = "trying to load game textures";
/*      */       } else if (dC == u.b) {
/*      */         str2 = "trying to create a texture";
/*      */       } else if (dC == u.c) {
/*      */         str2 = "trying to colour new texture";
/*      */       } else if (dC == u.d) {
/*      */         str2 = "trying to create texture buffer for on-screen fog fading";
/*      */       } else if (dC == u.e) {
/*      */         str2 = "trying to create game fonts";
/*      */       } else if (dC == u.f) {
/*      */         str2 = "trying to load game sounds";
/*      */       } else if (dC == u.g) {
/*      */         str2 = "trying to load UI textures";
/*      */       } 
/*      */       str1 = "The game ran out of memory " + str2 + ". ";
/*      */       int j = this.bH.f();
/*      */       if (j > 1)
/*      */         str1 = str1 + "This is often caused by large mods, you currently have: " + j + " mods. "; 
/*      */       if (al())
/*      */         if (!i.b)
/*      */           str1 = str1 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";  
/*      */       c("Warning: Out Of Memory", str1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public strictfp void as() {
/*      */     try {
/*      */       byte[] arrayOfByte = new byte[5000000];
/*      */       arrayOfByte[0] = this.dF;
/*      */       this.dG = arrayOfByte[1];
/*      */       arrayOfByte = null;
/*      */     } catch (OutOfMemoryError outOfMemoryError) {
/*      */       System.gc();
/*      */       d("Low memory detected");
/*      */       outOfMemoryError.printStackTrace();
/*      */       dD = true;
/*      */     } 
/*      */   }
/*      */   
/*      */   public abstract void a(Context paramContext);
/*      */   
/*      */   public abstract boolean a();
/*      */   
/*      */   public abstract boolean a(boolean paramBoolean);
/*      */   
/*      */   public abstract void a(Activity paramActivity, d paramd, boolean paramBoolean);
/*      */   
/*      */   public abstract void b(int paramInt1, int paramInt2);
/*      */   
/*      */   public abstract int c(boolean paramBoolean);
/*      */   
/*      */   public abstract boolean j();
/*      */   
/*      */   public abstract boolean l();
/*      */   
/*      */   public abstract boolean k();
/*      */   
/*      */   public abstract String h();
/*      */   
/*      */   public abstract String i();
/*      */   
/*      */   public abstract String m();
/*      */   
/*      */   public abstract String n();
/*      */   
/*      */   public abstract String o();
/*      */   
/*      */   public abstract void a(boolean paramBoolean1, boolean paramBoolean2, s params);
/*      */   
/*      */   public abstract void a(boolean paramBoolean, s params);
/*      */   
/*      */   public abstract void c();
/*      */   
/*      */   public abstract void q();
/*      */   
/*      */   public abstract void a(float paramFloat, int paramInt);
/*      */   
/*      */   public abstract void b(float paramFloat, int paramInt);
/*      */   
/*      */   public abstract int s();
/*      */   
/*      */   public abstract int b();
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
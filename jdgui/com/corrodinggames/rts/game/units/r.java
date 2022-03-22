/*       */ package com.corrodinggames.rts.game.units;
/*       */ 
/*       */ import android.graphics.Color;
/*       */ import android.graphics.ColorFilter;
/*       */ import android.graphics.Paint;
/*       */ import android.graphics.Point;
/*       */ import android.graphics.PointF;
/*       */ import android.graphics.PorterDuff;
/*       */ import android.graphics.PorterDuffColorFilter;
/*       */ import android.graphics.Rect;
/*       */ import android.graphics.RectF;
/*       */ import com.corrodinggames.rts.game.a.h;
/*       */ import com.corrodinggames.rts.game.a.i;
/*       */ import com.corrodinggames.rts.game.b.b;
/*       */ import com.corrodinggames.rts.game.b.g;
/*       */ import com.corrodinggames.rts.game.k;
/*       */ import com.corrodinggames.rts.game.m;
/*       */ import com.corrodinggames.rts.game.units.a.s;
/*       */ import com.corrodinggames.rts.game.units.custom.ab;
/*       */ import com.corrodinggames.rts.game.units.custom.aj;
/*       */ import com.corrodinggames.rts.game.units.custom.b.i;
/*       */ import com.corrodinggames.rts.game.units.custom.g;
/*       */ import com.corrodinggames.rts.game.units.custom.i;
/*       */ import com.corrodinggames.rts.game.units.d.c;
/*       */ import com.corrodinggames.rts.game.units.d.p;
/*       */ import com.corrodinggames.rts.game.units.f.j;
/*       */ import com.corrodinggames.rts.game.units.g.b;
/*       */ import com.corrodinggames.rts.gameFramework.a.e;
/*       */ import com.corrodinggames.rts.gameFramework.ab;
/*       */ import com.corrodinggames.rts.gameFramework.b.a;
/*       */ import com.corrodinggames.rts.gameFramework.b.d;
/*       */ import com.corrodinggames.rts.gameFramework.b.e;
/*       */ import com.corrodinggames.rts.gameFramework.b.f;
/*       */ import com.corrodinggames.rts.gameFramework.b.h;
/*       */ import com.corrodinggames.rts.gameFramework.bk;
/*       */ import com.corrodinggames.rts.gameFramework.d;
/*       */ import com.corrodinggames.rts.gameFramework.f;
/*       */ import com.corrodinggames.rts.gameFramework.g.ap;
/*       */ import com.corrodinggames.rts.gameFramework.g.k;
/*       */ import com.corrodinggames.rts.gameFramework.h.g;
/*       */ import com.corrodinggames.rts.gameFramework.h.h;
/*       */ import com.corrodinggames.rts.gameFramework.h.l;
/*       */ import com.corrodinggames.rts.gameFramework.j.e;
/*       */ import com.corrodinggames.rts.gameFramework.j.l;
/*       */ import com.corrodinggames.rts.gameFramework.j.q;
/*       */ import com.corrodinggames.rts.gameFramework.l;
/*       */ import com.corrodinggames.rts.gameFramework.utility.ag;
/*       */ import com.corrodinggames.rts.gameFramework.utility.m;
/*       */ import com.corrodinggames.rts.gameFramework.utility.o;
/*       */ import com.corrodinggames.rts.gameFramework.utility.u;
/*       */ import com.corrodinggames.rts.gameFramework.utility.y;
/*       */ import com.corrodinggames.rts.gameFramework.w;
/*       */ import java.util.ArrayList;
/*       */ import java.util.LinkedList;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ public abstract class r
/*       */   extends c
/*       */ {
/*       */   protected e D;
/*       */   protected e E;
/*       */   private int a;
/*       */   private float b;
/*       */   private float c;
/*       */   private float d;
/*       */   private float e;
/*   137 */   private int f = 0;
/*       */ 
/*       */   
/*   140 */   public static final an[] F = new an[0];
/*       */   
/*   142 */   private an[] g = F;
/*       */ 
/*       */   
/*   145 */   public a G = a.b;
/*       */   
/*   147 */   int H = -9999;
/*       */ 
/*       */   
/*       */   public af I;
/*       */ 
/*       */   
/*       */   public float J;
/*       */ 
/*       */   
/*       */   public float K;
/*       */ 
/*       */   
/*       */   public float L;
/*       */ 
/*       */   
/*       */   private boolean h;
/*       */ 
/*       */   
/*       */   public float M;
/*       */ 
/*       */   
/*       */   public float N;
/*       */ 
/*       */   
/*       */   public float O;
/*       */ 
/*       */   
/*       */   public float P;
/*       */ 
/*       */   
/*       */   private boolean i;
/*       */ 
/*       */   
/*       */   private boolean j;
/*       */ 
/*       */   
/*   183 */   private float k = 3.0F;
/*   184 */   private float l = 3.0F;
/*       */ 
/*       */   
/*       */   private int m;
/*       */   
/*       */   private float n;
/*       */   
/*       */   private float o;
/*       */   
/*       */   private byte p;
/*       */   
/*       */   private int q;
/*       */   
/*       */   private float r;
/*       */   
/*       */   private boolean s;
/*       */   
/*       */   public af Q;
/*       */   
/*       */   public int R;
/*       */   
/*       */   public float S;
/*       */   
/*       */   public int T;
/*       */   
/*       */   public r U;
/*       */   
/*       */   public boolean V;
/*       */   
/*       */   public boolean W;
/*       */   
/*       */   public int X;
/*       */   
/*       */   public short Y;
/*       */   
/*       */   public float Z;
/*       */   
/*       */   public boolean aa = false;
/*       */   
/*   223 */   public float ab = 0.0F;
/*   224 */   public float ac = 0.0F;
/*   225 */   public float ad = 0.0F;
/*   226 */   public int ae = 0;
/*       */   
/*   228 */   public float af = 0.0F;
/*       */ 
/*       */   
/*       */   public boolean ag;
/*       */   
/*   233 */   public float ah = -999.0F;
/*       */   
/*       */   public boolean ai = false;
/*       */   
/*       */   public boolean aj = false;
/*   238 */   public static final y[] ak = new y[0];
/*       */ 
/*       */ 
/*       */   
/*   242 */   protected y[] al = ak;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   247 */   protected int am = 0;
/*       */   
/*       */   private boolean t;
/*   250 */   private int u = 0;
/*       */ 
/*       */ 
/*       */   
/*       */   private int v;
/*       */ 
/*       */   
/*       */   public boolean an = true;
/*       */ 
/*       */   
/*       */   public boolean ao;
/*       */ 
/*       */   
/*       */   public float ap;
/*       */ 
/*       */   
/*       */   public float aq;
/*       */ 
/*       */   
/*       */   public h ar;
/*       */ 
/*       */   
/*       */   public i as;
/*       */ 
/*       */   
/*       */   public boolean at;
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void b(float paramFloat) {
/*   280 */     if (this.ap < paramFloat)
/*       */     {
/*   282 */       this.ap = paramFloat;
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   298 */   public static final q au = new q(); static {
/*   299 */     au.a(128, 255, 255, 255);
/*   300 */     au.n();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   306 */   public static final PointF av = new PointF();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(ap paramap) {
/*   316 */     paramap.a(this.b);
/*   317 */     paramap.a(this.c);
/*   318 */     paramap.a((this.cn[0]).e);
/*       */     
/*   320 */     paramap.a(this.f);
/*       */     
/*   322 */     int k = this.f;
/*       */     
/*   324 */     paramap.a(k);
/*   325 */     for (byte b1 = 0; b1 < k; b1++)
/*       */     {
/*   327 */       this.g[b1].a(paramap);
/*       */     }
/*       */     
/*   330 */     paramap.a(this.G);
/*       */ 
/*       */     
/*   333 */     af af1 = this.I;
/*   334 */     if (af1 != null && af1.bz)
/*       */     {
/*   336 */       af1 = null;
/*       */     }
/*       */     
/*   339 */     paramap.a(af1);
/*   340 */     paramap.a(this.J);
/*   341 */     paramap.a(this.L);
/*   342 */     paramap.a(this.M);
/*   343 */     paramap.d("pathing_active:");
/*   344 */     paramap.a(this.j);
/*   345 */     paramap.a(this.k);
/*   346 */     paramap.a(this.l);
/*   347 */     paramap.a(this.r);
/*   348 */     paramap.a(this.U);
/*   349 */     paramap.a(this.V);
/*   350 */     paramap.a(this.W);
/*   351 */     paramap.a(this.aa);
/*   352 */     paramap.a(this.ab);
/*   353 */     paramap.a(this.ac);
/*   354 */     paramap.a(this.ad);
/*   355 */     paramap.a(this.ae);
/*       */     
/*   357 */     paramap.a(this.T);
/*       */     
/*   359 */     paramap.d("activePathCount:");
/*       */     
/*   361 */     paramap.a(this.am);
/*   362 */     for (byte b2 = 0; b2 < this.am; b2++)
/*       */     {
/*   364 */       this.al[b2].a(paramap);
/*       */     }
/*       */     
/*   367 */     paramap.a(this.am);
/*   368 */     paramap.a(this.u);
/*       */ 
/*       */     
/*   371 */     if (paramap.f());
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*   384 */     paramap.c(11);
/*       */ 
/*       */     
/*   387 */     paramap.a(this.n);
/*   388 */     paramap.a(this.o);
/*       */ 
/*       */     
/*   391 */     paramap.a(this.d);
/*   392 */     paramap.a(this.e);
/*       */ 
/*       */     
/*   395 */     paramap.a(this.t);
/*       */ 
/*       */     
/*   398 */     paramap.a(this.Z);
/*   399 */     paramap.a(this.m);
/*       */ 
/*       */     
/*   402 */     paramap.a(this.N);
/*       */ 
/*       */     
/*   405 */     paramap.a(this.ah);
/*   406 */     paramap.a(this.ai);
/*   407 */     paramap.a(this.aj);
/*       */ 
/*       */     
/*   410 */     paramap.a(this.Y);
/*       */ 
/*       */     
/*   413 */     paramap.a(this.S);
/*       */ 
/*       */     
/*   416 */     paramap.a(this.v);
/*       */ 
/*       */     
/*   419 */     paramap.a(this.O);
/*       */ 
/*       */     
/*   422 */     paramap.a(this.ap);
/*   423 */     paramap.a(this.aq);
/*       */ 
/*       */ 
/*       */     
/*   427 */     super.a(paramap);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void a(k paramk) {
/*   432 */     this.b = paramk.g();
/*   433 */     this.c = paramk.g();
/*   434 */     (this.cn[0]).e = paramk.g();
/*       */     
/*   436 */     this.f = paramk.f();
/*       */     
/*   438 */     if (this.f > 0)
/*       */     {
/*   440 */       m(f.c(this.f - 1, 29));
/*       */     }
/*       */     
/*   443 */     int n = 30;
/*   444 */     if (paramk.b() >= 42)
/*       */     {
/*   446 */       n = paramk.f();
/*       */     }
/*       */     
/*   449 */     for (byte b = 0; b < n; b++) {
/*       */       
/*   451 */       int i1 = b;
/*       */       
/*   453 */       m(i1);
/*       */       
/*   455 */       if (i1 >= this.g.length) {
/*       */         
/*   457 */         l.b("Too many waypoints:" + b);
/*   458 */         i1 = this.g.length - 1;
/*       */       } 
/*       */       
/*   461 */       if (this.g[i1] == null)
/*       */       {
/*   463 */         this.g[i1] = new an();
/*       */       }
/*   465 */       this.g[i1].a(paramk);
/*       */     } 
/*       */     
/*   468 */     this.G = (a)paramk.b(a.class);
/*       */     
/*   470 */     if (this.G == a.a) {
/*       */       
/*   472 */       if (!I())
/*       */       {
/*   474 */         this.G = a.b;
/*       */       }
/*       */       
/*   477 */       if (paramk.b() < 74)
/*       */       {
/*   479 */         this.G = a.b;
/*       */       }
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*   485 */     long l = paramk.m();
/*       */     
/*   487 */     this.J = paramk.g();
/*   488 */     this.L = paramk.g();
/*   489 */     this.M = paramk.g();
/*   490 */     this.j = paramk.e();
/*   491 */     this.k = paramk.g();
/*   492 */     this.l = paramk.g();
/*   493 */     this.r = paramk.g();
/*   494 */     a(paramk.o());
/*   495 */     this.V = paramk.e();
/*   496 */     this.W = paramk.e();
/*   497 */     this.aa = paramk.e();
/*   498 */     this.ab = paramk.g();
/*   499 */     this.ac = paramk.g();
/*   500 */     this.ad = paramk.g();
/*   501 */     this.ae = paramk.f();
/*       */     
/*   503 */     if (paramk.b() >= 18)
/*       */     {
/*   505 */       this.T = paramk.f();
/*       */     }
/*       */ 
/*       */     
/*   509 */     if (paramk.b() >= 21) {
/*       */       
/*   511 */       int i1 = paramk.f();
/*       */       
/*   513 */       for (byte b2 = 0; b2 < i1; b2++)
/*       */       {
/*   515 */         l(b2);
/*       */         
/*   517 */         if (this.al[b2] == null)
/*       */         {
/*   519 */           this.al[b2] = new y();
/*       */         }
/*   521 */         this.al[b2].a(paramk);
/*       */       }
/*       */     
/*       */     } else {
/*       */       
/*   526 */       byte b2 = 60;
/*   527 */       for (byte b3 = 0; b3 < 60; b3++) {
/*       */         
/*   529 */         l(b3);
/*       */         
/*   531 */         if (this.al[b3] == null)
/*       */         {
/*   533 */           this.al[b3] = new y();
/*       */         }
/*   535 */         this.al[b3].a(paramk);
/*       */       } 
/*       */     } 
/*       */     
/*   539 */     this.am = paramk.f();
/*   540 */     this.u = paramk.f();
/*       */     
/*   542 */     byte b1 = paramk.d();
/*       */     
/*   544 */     if (b1 >= 1) {
/*       */       
/*   546 */       this.n = paramk.g();
/*   547 */       this.o = paramk.g();
/*       */     } 
/*       */     
/*   550 */     if (b1 >= 2) {
/*       */       
/*   552 */       this.d = paramk.g();
/*   553 */       this.e = paramk.g();
/*       */     } 
/*       */     
/*   556 */     if (b1 >= 3)
/*       */     {
/*   558 */       this.t = paramk.e();
/*       */     }
/*       */     
/*   561 */     if (b1 >= 4) {
/*       */       
/*   563 */       this.Z = paramk.g();
/*   564 */       this.m = paramk.f();
/*       */     } 
/*       */ 
/*       */     
/*   568 */     if (b1 >= 5)
/*       */     {
/*   570 */       this.N = paramk.g();
/*       */     }
/*       */     
/*   573 */     if (b1 >= 6) {
/*       */       
/*   575 */       this.ah = paramk.g();
/*   576 */       this.ai = paramk.e();
/*   577 */       this.aj = paramk.e();
/*       */     } 
/*   579 */     if (b1 >= 7)
/*       */     {
/*       */       
/*   582 */       this.Y = paramk.t();
/*       */     }
/*       */     
/*   585 */     if (b1 >= 8)
/*       */     {
/*       */       
/*   588 */       this.S = paramk.g();
/*       */     }
/*       */     
/*   591 */     if (b1 >= 9)
/*       */     {
/*       */       
/*   594 */       this.v = paramk.f();
/*       */     }
/*       */     
/*   597 */     if (b1 >= 10)
/*       */     {
/*   599 */       this.O = paramk.g();
/*       */     }
/*       */     
/*   602 */     if (b1 >= 11) {
/*       */       
/*   604 */       this.ap = paramk.g();
/*   605 */       this.aq = paramk.g();
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*   610 */     super.a(paramk);
/*       */     
/*   612 */     if (!this.bz) {
/*       */       
/*   614 */       this.I = w.a(l, false);
/*       */       
/*   616 */       for (byte b2 = 0; b2 < this.f; b2++) {
/*       */ 
/*       */         
/*   619 */         if (this.g[b2] == null) {
/*       */           
/*   621 */           l.d("readIn: convertUnitIds is null: " + b2 + " waypointsCount:" + this.f);
/*       */         }
/*       */         else {
/*       */           
/*   625 */           this.g[b2].c();
/*       */         } 
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*   632 */     Q();
/*       */     
/*   634 */     if (this.bz)
/*       */     {
/*   636 */       this.dP = true;
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(m paramm) {
/*   649 */     super.a(paramm);
/*   650 */     Q();
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void Q() {
/*   655 */     this.D = d();
/*   656 */     this.E = k();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float h(int paramInt) {
/*   671 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float i(int paramInt) {
/*   676 */     return 0.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp e R() {
/*   682 */     return null;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*   687 */   private q w = null;
/*       */   
/*       */   private int x;
/*   690 */   private q y = null;
/*       */   
/*       */   private int z;
/*   693 */   private static final Paint A = new Paint();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   private static int B;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   707 */   private static final q C = a(false);
/*   708 */   private static final q dl = a(true);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp Paint a(int paramInt, ColorFilter paramColorFilter, boolean paramBoolean) {
/*       */     q q1;
/*       */     int k;
/*   731 */     if (paramInt == -1 && paramColorFilter == null) {
/*       */       
/*   733 */       if (paramBoolean)
/*       */       {
/*   735 */         return (Paint)dl;
/*       */       }
/*       */ 
/*       */       
/*   739 */       return (Paint)C;
/*       */     } 
/*       */ 
/*       */     
/*   743 */     if (this.bT) {
/*       */       
/*   745 */       if (paramColorFilter == null)
/*       */       {
/*   747 */         Paint paint = A;
/*       */         
/*   749 */         k = B;
/*   750 */         B = paramInt;
/*       */       
/*       */       }
/*       */       else
/*       */       {
/*       */         
/*   756 */         Paint paint = A;
/*   757 */         k = -1;
/*       */         
/*   759 */         if (paramColorFilter == aM)
/*       */         {
/*   761 */           paint = aP;
/*       */         }
/*   763 */         if (paramColorFilter == aL)
/*       */         {
/*   765 */           paint = aO;
/*       */         }
/*   767 */         if (paramColorFilter == aN)
/*       */         {
/*   769 */           paint = aQ;
/*       */ 
/*       */         
/*       */         }
/*       */       
/*       */       }
/*       */ 
/*       */     
/*       */     }
/*   778 */     else if (paramBoolean) {
/*       */       
/*   780 */       if (this.y == null)
/*       */       {
/*   782 */         this.y = a(true);
/*       */       }
/*       */       
/*   785 */       q1 = this.y;
/*   786 */       k = this.z;
/*   787 */       this.z = paramInt;
/*       */     }
/*       */     else {
/*       */       
/*   791 */       if (this.w == null)
/*       */       {
/*   793 */         this.w = a(false);
/*       */       }
/*       */       
/*   796 */       q1 = this.w;
/*   797 */       k = this.x;
/*   798 */       this.x = paramInt;
/*       */     } 
/*       */ 
/*       */     
/*   802 */     if (k != paramInt)
/*       */     {
/*   804 */       q1.b(paramInt);
/*       */     }
/*       */     
/*   807 */     if (q1.h() != paramColorFilter)
/*       */     {
/*   809 */       q1.a(paramColorFilter);
/*       */     }
/*       */     
/*   812 */     return (Paint)q1;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static strictfp q a(boolean paramBoolean) {
/*   819 */     q q1 = new q();
/*   820 */     if (paramBoolean) {
/*       */       
/*   822 */       q1.a(true);
/*   823 */       q1.d(true);
/*   824 */       q1.b(true);
/*       */     }
/*       */     else {
/*       */       
/*   828 */       q1.a(false);
/*   829 */       q1.d(false);
/*   830 */       q1.b(false);
/*       */     } 
/*       */ 
/*       */     
/*   834 */     return q1;
/*       */   } public final strictfp void j(int paramInt) { int k = bg(); for (byte b = 0; b < k; b++) this.cn[b].a(paramInt);  } public strictfp void a(String paramString) { l.d("(Unit log:" + r().i() + " id:" + this.dA + "): " + paramString); } public strictfp void S() { l.d("---- Debug for:" + r().i() + " id:" + this.dA + "---"); } public strictfp void a(float paramFloat) { super.a(paramFloat); l l = l.u(); if (this.ao) this.ao = false;  if (this.bQ != 0.0F) this.bQ = f.a(this.bQ, paramFloat);  if (!this.bz && bG()) { if (this.ap > 0.0F) this.ap = f.a(this.ap, paramFloat);  if (this.aq > 0.0F) this.aq = f.a(this.aq, paramFloat);  if (this.bb != null) b.a(this, paramFloat);  float f1 = this.dH; float f2 = this.dI; int k = bg(); byte b; for (b = 0; b < k; b++) { ai ai = this.cn[b]; if (ai.d == 0.0F) { float f = C(b); if (b(b, paramFloat) && ai.a != f) { float f3 = f.c(ai.a, f, 360.0F); if (f.c(f3) < 0.5F) { ai.d = 20.0F; ai.c = 0.0F; } else { a(paramFloat, f, b); }  }  } else { ai.d = f.a(ai.d, paramFloat); }  }  if (!bf()) k(paramFloat);  for (b = 0; b < k; b++) { ai ai = this.cn[b]; if (ai.e != 0.0F) ai.e = f.a(ai.e, paramFloat);  }  boolean bool = bd(); boolean bool1 = false; bool1 = (this.bH != 0.0F || this.bI != 0.0F) ? true : false; if ((this.bK != 0.0F || bool1) && I()) { float f3 = this.bL; float f4 = z(); if (be()) f3 = this.bM;  if (!bool) { float f = f4 * this.bK * paramFloat; f1 += f.i(f3) * f; f2 += f.h(f3) * f * aU(); if (bool1) { f1 += this.bH * paramFloat; f2 += this.bI * paramFloat * aU(); float f5 = f.a(0.0F, 0.0F, this.bH, this.bI); if (f5 > f4 * f4) { this.bH = (float)(this.bH - this.bH * 0.05D * paramFloat); this.bI = (float)(this.bI - this.bI * 0.05D * paramFloat); }  this.bH = f.a(this.bH, 0.0F, 0.5F * f4 * paramFloat); this.bI = f.a(this.bI, 0.0F, 0.5F * f4 * paramFloat); }  } else { float f5, f6, f7; if (this.bK != 0.0F) { f5 = C() * 1.41F; f6 = f.i(f3) * f4 * this.bK; f7 = f.h(f3) * f4 * this.bK; } else { f5 = D() * 1.41F; f6 = 0.0F; f7 = 0.0F; }  float f8 = f.a(this.bH, this.bI, f6, f7); if (f8 > f4 * f4) { this.bH = (float)(this.bH - this.bH * 0.05D * paramFloat); this.bI = (float)(this.bI - this.bI * 0.05D * paramFloat); }  float f9 = f5 * paramFloat; if (f8 < f9 * f9) { this.bH = f6; this.bI = f7; } else { float f = f.d(this.bH, this.bI, f6, f7); this.bH += f.i(f) * f9; this.bI += f.h(f) * f9; }  f1 += this.bH * paramFloat; f2 += this.bI * paramFloat * aU(); }  this.ao = true; }  if (this.bD != 0.0F || this.bE != 0.0F) { this.bD = f.b(this.bD, -9.0F, 9.0F); this.bE = f.b(this.bE, -9.0F, 9.0F); f1 += this.bD; f2 += this.bE; this.bE = 0.0F; this.bD = 0.0F; this.ao = true; }  if (this.ao && I() && this.cq == null) a(paramFloat, l, f1, f2);  if (this.an) { this.an = false; c(false); this.ao = true; }  }  } private strictfp void a(float paramFloat1, l paraml, float paramFloat2, float paramFloat3) { b b = paraml.bt; float f1 = b.o; float f2 = b.p; float f3 = this.dH * f1; float f4 = this.dI * f2; float f5 = paramFloat2 * f1; float f6 = paramFloat3 * f2; PointF pointF = null; boolean bool1 = false; int k = f.e(f3); int n = f.e(f4); int i1 = f.e(f5); int i2 = f.e(f6); if (k != i1 || n != i2) if (this.bQ == 0.0F) if (paraml.bC.a(h(), i1, i2)) { if (k != i1 && n != i2) { boolean bool3 = paraml.bC.a(h(), k, i2); boolean bool4 = paraml.bC.a(h(), i1, n); if (bool3 && bool4) { bool1 = true; av.a(f3, f4); pointF = av; }  if (pointF == null && bool3) pointF = aj.a(h(), f3, f4, f5, f6, k, i2, false);  if (pointF == null && bool4) pointF = aj.a(h(), f3, f4, f5, f6, i1, n, false);  }  if (pointF == null) pointF = aj.a(h(), f3, f4, f5, f6, i1, i2, false);  if (pointF == null) { bool1 = true; av.a(f3, f4); pointF = av; }  }    boolean bool2 = false; if (pointF != null) { boolean bool = false; boolean bool3 = paraml.bC.a(h(), k, n); if (bool3) if (!paraml.bC.b(h(), i1, i2)) bool = true;   if (!bool) { paramFloat2 = pointF.a * b.k; paramFloat3 = pointF.b * b.l; bool2 = true; } else { bool1 = false; }  }  if (bool2) { this.b += paramFloat1; this.a = 0; } else if (this.b != 0.0F && paramFloat1 > 0.0F) { this.a++; if (this.a >= 3) this.b = 0.0F;  }  if (!bool1) { int i3 = f.e(paramFloat2 * f1); int i4 = f.e(paramFloat3 * f2); this.dH = paramFloat2; this.dI = paramFloat3; if (k != i3 || n != i4) c(true);  }  } public strictfp void b(float paramFloat1, float paramFloat2) { b b = (l.u()).bt; float f1 = b.o; float f2 = b.p; int k = f.e(this.dH * f1); int n = f.e(this.dI * f2); int i1 = f.e(paramFloat1 * f1); int i2 = f.e(paramFloat2 * f2); this.dH = paramFloat1; this.dI = paramFloat2; if (k != i1 || n != i2) c(true);  } public static j aw = new r$1(); public byte ax; public af[] ay; public float[] az; public int aA; public static final u aB = new u(); public boolean aC; public static strictfp void g(float paramFloat) { l l = l.u(); af[] arrayOfAf = af.bj.a(); int k = af.bj.size(); l.bL.a(bk.j); byte b; for (b = 0; b < k; b++) { if (arrayOfAf[b] instanceof r) { r r1 = (r)arrayOfAf[b]; r1.bF = false; if ((r1.ao || r1.bG) && r1.I()) if (r1.aA <= l.bh) { float f; r1.bG = false; r1.ao = true; if (r1.cm) { f = r1.bO + 7.0F; if (r1.ax > 9) { r1.aA = l.bh + 200 + b % 50; } else { r1.aA = l.bh + 50 + b % 50; }  } else { f = r1.bO + 5.0F; r1.aA = l.bh + 250 + b % 50; }  r1.ax = 0; aB.clear(); l.bK.b(r1.dH, r1.dI, f, aB); af[] arrayOfAf1 = aB.a(); byte b1; int n; for (b1 = 0, n = aB.b; b1 < n; b1++) { af af1 = arrayOfAf1[b1]; r1.a(af1, paramFloat, true); }  if (r1.ax > 9) if (r1.bf > l.bh - 400) { r1.aA = l.bh + 5 + b % 5; r1.bG = true; }   }   }  }  l.bL.b(bk.j); l.bL.a(bk.k); for (b = 0; b < k; b++) { if (arrayOfAf[b] instanceof r) { r r1 = (r)arrayOfAf[b]; if (r1.ao && r1.ax > 0 && r1.I()) { r1.bF = true; r1.bG = true; if (r1.aA >= l.bh) for (byte b1 = 0; b1 < r1.ax; b1++) { if (b1 < r1.ay.length) { af af1 = r1.ay[b1]; boolean bool = false; if (!bool) r1.a(af1, paramFloat, false);  }  }   }  }  }  l.bL.b(bk.k); } private strictfp void a(af paramaf, float paramFloat, boolean paramBoolean) { af af1 = paramaf; if (af1 != this && af1.by && this.by) { if (i() != af1.i()) return;  if (P() != af1.P()) return;  if (af1.cp == null && this.cp == null) if (this.bv != af1 && af1.bv != this) { float f1 = this.dH + this.bD; float f2 = this.dI + this.bE; float f3 = af1.dH + af1.bD; float f4 = af1.dI + af1.bE; float f5 = f.a(f1, f2, f3, f4); float f6 = this.bO + af1.bO; if (paramBoolean) { float f = f5; if (f5 < f6 * f6) f = 0.0F;  if (paramaf instanceof r) for (byte b = 0; b < ((r)paramaf).ax; b++) { if (((r)paramaf).ay[b] == this) return;  }   if (this.ay == null) { this.ay = new af[10]; this.az = new float[10]; }  int k = -1; int n; for (n = 0; n < this.ax; n++) { if (f < this.az[n]) { k = n; break; }  }  if (k == -1) if (this.ax < this.ay.length) { k = this.ax; } else { return; }   if (this.ax < this.ay.length) this.ax = (byte)(this.ax + 1);  for (n = this.ax - 1; n > k; n--) this.ay[n] = this.ay[n - 1];  this.ay[k] = af1; this.az[k] = f; return; }  if (f5 < f6 * f6) if (!af1.a(this, paramFloat)) if (!a(af1, paramFloat)) { float f7 = f.d(f1, f2, f3, f4); float f8 = (float)Math.sqrt(f5); float f9 = f6 - f8 + 0.001F; if (f9 <= 0.0F) return;  int k = q(af1); int n = af1.q(this); int i1 = (k > n) ? k : n; if (i1 != 0) { float f = f9 / i1 * paramFloat; if (f > f9) f = f9;  f9 = f; }  f9 *= 0.95F; if (f9 > 1.0F) f9 *= 0.7F;  if (f9 > 3.0F) f9 = 3.0F + (f9 - 3.0F) * 0.7F;  if (f9 > 6.0F) f9 = 6.0F + (f9 - 6.0F) * 0.7F;  if (f9 > 10.0F) f9 = 10.0F + (f9 - 10.0F) * 0.7F;  float f10 = 0.0F; float f11 = bB(); float f12 = af1.bB(); if (this.bB == af1.bB) { boolean bool = false; float f = 1.7F; if (af1 instanceof r) { r r1 = (r)af1; if (this.N > 200.0F || r1.N > 200.0F) f = 5.0F;  if (this.U == r1) { f12 *= f; bool = true; }  if (r1.U == this) { f11 *= f; bool = true; }  if (!bool) if (this.V && r1.U != null) { f11 *= f; } else if (r1.V && this.U != null) { f12 *= f; } else if (this.c == 0.0F && r1.c != 0.0F) { f11 *= f; } else if (r1.c == 0.0F && this.c != 0.0F) { f12 *= f; }   }  }  if (af1 instanceof p) f10 = f11 / (f11 + f12);  float f13 = 1.0F - f10; float f14 = f.i(f7); float f15 = f.h(f7); if (af1 instanceof p) { float f = f9 * f10; af1.bD += f14 * f; af1.bE += f15 * f; }  float f16 = f9 * f13; this.bD -= f14 * f16; this.bE -= f15 * f16; l l = l.u(); this.Q = af1; this.R = l.bg; if (af1 instanceof r) { r r1 = (r)af1; r1.Q = this; r1.R = l.bg; }  if (af1 instanceof r) { r r1 = (r)af1; if (this.T != 0 && this.T == r1.T) { if (ap() == null) { an an1 = r1.ap(); if (an1 != null) if (an1.a == ao.a || an1.a == ao.h) r1.aw();   }  if (r1.ap() == null) { an an1 = r1.ap(); if (an1 != null) if (an1.a == ao.a || an1.a == ao.h) aw();   }  }  }  }    }   }  } public strictfp int T() { return 1; } public strictfp void a(int paramInt) {} protected strictfp void U() { l l = l.u(); if (this.bB == l.bb) l.bA.f.b(this);  } public strictfp float b(float paramFloat1, float paramFloat2, float paramFloat3) { if (E()) { if (bw()) return 0.0F;  float f1 = f.d(this.dH, this.dI, paramFloat2, paramFloat3); return c(paramFloat1, f1); }  if (bg() < 1) return 0.0F;  int k = aP(); if (k == -1) k = 0;  PointF pointF = F(k); float f = f.d(pointF.a, pointF.b, paramFloat2, paramFloat3); ai ai = this.cn[k]; ai.a(70); return a(paramFloat1, f, k); } public strictfp float c(float paramFloat1, float paramFloat2) { boolean bool1 = false; boolean bool2 = false; if (this.bN && aW()) { bool1 = true; bool2 = true; }  return a(paramFloat1, paramFloat2, bool1, bool2); } public strictfp void h(float paramFloat) { float f = f.c(this.bL, paramFloat, 360.0F); if (f.c(f) > 0.01D) i(f);  } public strictfp float a(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2) { this.bM = paramFloat2; if (f.c(this.bL - paramFloat2) < 0.01F) { if (paramBoolean1) if (this.bN) { j(25); this.bN = false; }   return 0.0F; }  float f = f.c(this.bL, paramFloat2, 360.0F); if (paramBoolean1) if (paramBoolean2 && f.c(f) > 100.0F) { f = f.c(this.bL, paramFloat2 + 180.0F, 360.0F); if (!this.bN) { j(25); this.bN = true; }  } else if (this.bN) { j(25); this.bN = false; }   if (f.c(f) < 0.01F) return 0.0F;  if (this.ap <= 0.0F) { float f1 = B(); if (f1 <= 0.0F) { float f2 = (f > 0.0F) ? 1.0F : -1.0F; float f3 = f2 * A() * paramFloat1; if (f.c(f3) > f.c(f)) f3 = f;  i(f3); } else { float f2 = (f > 0.0F) ? 1.0F : -1.0F; float f3 = f.c(this.bJ) / f1; if (f.c(f) < f3) { this.bJ = f.a(this.bJ, f2 * f1, f1 * paramFloat1); } else { this.bJ = f.a(this.bJ, f2 * A(), f1 * paramFloat1); }  float f4 = this.bJ * paramFloat1; if (f.c(f4) > f.c(f)) { this.bJ = 0.0F; f4 = f; }  i(f4); }  }  return f; } public strictfp void i(float paramFloat) { this.bL += paramFloat; if (this.bL > 180.0F) this.bL -= 360.0F;  if (this.bL < -180.0F) this.bL += 360.0F;  if (bh()) { int k = bg(); for (byte b = 0; b < k; b++) { ai ai = this.cn[b]; ai.a += paramFloat; if (ai.a > 180.0F) ai.a -= 360.0F;  if (ai.a < -180.0F) ai.a += 360.0F;  }  }  } public strictfp void j(float paramFloat) { int k = bg(); for (byte b = 0; b < k; b++) { ai ai = this.cn[b]; ai.a = paramFloat + B(b); }  } public strictfp void a(int paramInt, float paramFloat) { ai ai = this.cn[paramInt]; ai.a += paramFloat; } public strictfp float a(float paramFloat1, float paramFloat2, int paramInt) { ai ai = this.cn[paramInt]; float f1 = ai.a; float f2 = f.c(f1, paramFloat2, 360.0F); if (f2 == 0.0F) return f2;  float f3 = w(paramInt); if (f3 <= 0.0F) { float f = f.c(ai.a, paramFloat2, c(paramInt) * paramFloat1); a(paramInt, f); f2 -= f; } else { float f4 = y(paramInt); float f5 = (f2 > 0.0F) ? 1.0F : -1.0F; float f6 = f.c(ai.c) / f4; boolean bool = (((f2 > 0.0F) ? true : false) == ((ai.c > 0.0F) ? true : false)) ? true : false; if (f.c(f2) < f6 && bool) { ai.c = f.a(ai.c, f5 * f4, f4 * paramFloat1); } else { ai.c = f.a(ai.c, f5 * c(paramInt), f3 * paramFloat1); }  float f7 = ai.c * paramFloat1; if (f.c(f7) > f.c(f2)) { ai.c = 0.0F; f7 = f2; }  a(paramInt, f7); f2 -= f7; }  return f2; }
/*       */   public strictfp af V() { if (this.h) { an an1 = ap(); if (an1 != null) if (an1.a == ao.d || an1.a == ao.g) if (an1.h != null && !an1.h.bz) return an1.h;    }  return null; }
/*       */   public strictfp boolean W() { an an1 = ap(); if (an1 != null) if (an1.a == ao.g) return true;   return false; }
/*       */   private strictfp void a(float paramFloat, an paraman, w paramw) { if (paraman.c == null) { aw(); paraman = null; }  if (paraman != null) { boolean bool = true; if (paraman.a == ao.p); if (bool) { s s1 = a(paraman.c); S(); if (s1 == null) { a("Failed to find action:" + paraman.c.a()); } else { PointF pointF = new PointF(paraman.e, paraman.f); a(s1, false, pointF, paraman.h); }  aw(); paraman = null; }  }  }
/*       */   private strictfp void b(float paramFloat, an paraman, w paramw) { af af1 = paraman.i(); if (af1 != null) { this.I = af1; if (this.K > 5.0F) this.K = 5.0F;  }  aw(); paraman = null; }
/*   840 */   public strictfp r(boolean paramBoolean) { super(paramBoolean);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  1392 */     this.ax = 0;
/*       */ 
/*       */ 
/*       */     
/*  1396 */     this.aA = -9999;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  8385 */     this.aI = null; }
/*       */   private strictfp void c(float paramFloat, an paraman, w paramw) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); boolean bool1 = (paraman.a == ao.k || paraman.a == ao.n) ? true : false; boolean bool2 = (paraman.a == ao.k) ? true : false; af af1 = paraman.h; if (bool1) if (af1 == null || af1.bz) { aw(); paraman = null; }   if (paraman != null) { boolean bool = false; float f = this.bO; if (bool1) f += af1.bO;  if (paraman.a == ao.n) { if (this.cm) { f += 30.0F; } else { f += 50.0F; }  } else if (this.cm) { f += 80.0F; } else { f += 100.0F; }  if (f3 > f * f) { this.j = true; this.k = f1; this.l = f2; this.m = 2; if (this.r > 90.0F) this.r = 90.0F;  this.q = 18; if (this.U != null) if (!this.U.bG()) paramw.c = false;   } else { this.v = 0; }  paramw.c = false; if (!bool) if (this.I != null && !this.I.bz) { boolean bool3 = false; if (b(this.I, false)) bool3 = true;  if (bool3) { float f4 = f.a(this.dH, this.dI, this.I.dH, this.I.dI); float f5 = l(this.I); boolean bool4 = false; boolean bool5 = false; if (f4 < f5 * f5) bool5 = true;  if (bool5) if (!Y()) bool5 = false;   if (f3 < 22500.0F) this.v = 0;  if (!bool5) if (this.v == 1 || f3 > 122500.0F) { bool4 = true; this.v = 1; }   if (f3 > 302500.0F || (this.v == 1 && f3 > 202500.0F)) { bool4 = true; this.v = 1; }  if (!bool4) { bool = true; this.v = 0; if (bool5) { this.j = false; } else { if (this.r > 90.0F) this.r = 90.0F;  this.j = true; this.k = this.I.dH; this.l = this.I.dI; this.m = 0; this.i = true; }  }  }  }   if (bool2 && !bool) { af af2 = af1.p(2.0F); if (af2 != null) if (!b(af2, true)) af2 = null;   if (af2 == null && this.v != 1) { af2 = p(2.0F); if (af2 != null) if (!b(af2, true)) af2 = null;   }  if (af2 != null) { bool = true; if (this.r > 90.0F) this.r = 90.0F;  this.j = true; this.k = af2.dH; this.l = af2.dI; this.m = 0; this.i = true; }  }  if (bool2 && !bool && a(af1)) if (af1.bY < af1.bZ || af1.bR < 1.0F) if (a(af1)) { an an1 = am(); if (an1 != null) { an1.b(af1); an1.m = true; bool = true; if (this.r > 20.0F) this.r = 20.0F;  }  }    if (bool2 && !bool && ai()) if (af1 instanceof r) { r r1 = (r)af1; af af2 = r1.V(); if (af2 != null) if (a(af2)) { an an1 = am(); if (an1 != null) { an1.b(af2); an1.m = true; bool = true; if (this.r > 20.0F) this.r = 20.0F;  }  }   }   }  }
/*       */   private strictfp void d(float paramFloat, an paraman, w paramw) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); if (paraman.h == null || paraman.h.bz) { aw(); paraman = null; }  if (paraman != null) { boolean bool = false; if (paraman.h.bw()) { if (f3 < 961.0F) this.P += paramFloat;  if (this.P > 240.0F) bool = true;  float f = 21.0F; if (paraman.h.bO().a()) f = 11.0F;  if (this.b > 0.0F) f = paraman.h.bO + this.bO + 31.0F;  if (f3 < f * f) bool = true;  } else { float f = paraman.h.bO + this.bO + 5.0F; if (f3 < f * f) bool = true;  }  if (!bool) { this.j = true; this.k = f1; this.l = f2; this.m = 0; if (paraman.h.bw()) { Rect rect = paraman.h.bO(); int k = f.c(rect.c() / 2, rect.b() / 2); this.m = k + 1; }  if (this.r > 90.0F) this.r = 90.0F;  this.q = 18; if (f3 < 48400.0F) { paramw.c = false; if (this.r > 0.0F && aC() == null) this.i = true;  }  if (this.U != null) if (!this.U.bG()) paramw.c = false;   }  if (bool) { af af1 = paraman.h; a(ab.i); aw(); }  }  }
/*       */   private strictfp void e(float paramFloat, an paraman, w paramw) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); if (paraman.h == null || paraman.h.bz || !paraman.h.bG()) { aw(); paraman = null; }  if (paraman != null) if (!d(paraman.h, false)) aw();   if (paraman != null) { this.bv = paraman.h; if (f3 > 441.0F) { this.j = true; this.k = f1; this.l = f2; if (this.r > 90.0F) this.r = 90.0F;  this.q = 18; if (f3 < 72900.0F) { paramw.c = false; if (this.r > 0.0F && this.aI == null) this.i = true;  }  if (this.U != null) if (!this.U.bG()) paramw.c = false;   } else { e(paraman.h, false); aw(); }  }  }
/*       */   private strictfp void a(float paramFloat, an paraman, w paramw, boolean paramBoolean) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); l l = l.u(); if (!aN()) { boolean bool = false; i i1 = cV(); if (i1 != null) if (i1.H) { bs(); bool = true; }   if (!bool) { av(); paraman = null; }  }  float f4 = 7.0F; if (f3 < 1681.0F) this.P += paramFloat;  if (this.P > 240.0F) f4 = 16.0F;  if (this.P > 340.0F) f4 = 36.0F;  if (paraman != null) if (paraman.a == ao.j) if (at() != 1) { f4 = 20.0F; float f = 30.0F; if (!paramBoolean || this.R == l.bg || this.R == l.bg - 1) f = 70.0F;  if (f3 < f * f) { c(paraman); av(); paraman = null; }  } else { f4 = 30.0F; if (!paramBoolean || this.R == l.bg || this.R == l.bg - 1) f4 = 80.0F;  }    if (paraman != null) if (f3 < f4 * f4) { if (paraman.a == ao.j) { if (at() == 1); } else if (paraman.a == ao.h) { boolean bool = false; if (this.I != null && !this.I.bz) if (a(this.I, false)) bool = true;   if (!bool) { av(); paraman = null; }  } else { av(); paraman = null; }  } else { this.j = true; this.k = f1; this.l = f2; this.m = 0; if (paraman.a == ao.j) { this.s = true; az(); }  }   if (paraman != null) { if (paraman.a == ao.h || paraman.a == ao.j) { if (this.I != null && !this.I.bz) if (a(this.I, false)) a(paramFloat, this.I, paramw, true);   if (this.U != null) if (this.U.I != null) paramw.c = false;   }  if (paraman.a == ao.j) { if (this.I == null) { af af1 = p(3.0F); if (af1 != null) if (b(af1, true)) { if (this.r > 90.0F) this.r = 90.0F;  this.j = true; this.k = af1.dH; this.l = af1.dI; this.m = 0; this.i = true; }   }  if (ai()) if ((l.bg % 10) == this.dA % 10L) { an an1 = p.a(this, paramFloat, 150.0F, true); if (an1 != null) { an1.m = false; an1.k = 200.0F; this.j = false; aE(); }  }   }  }  }
/*       */   private strictfp void f(float paramFloat, an paraman, w paramw) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); l l = l.u(); al al = paraman.b; if (al == null) { a("activeBuildingType==null, removing waypoint"); aw(); paraman = null; }  if (paraman != null) { boolean bool3; float f = f(al); byte b = 30; boolean bool1 = false; if (f <= 30.0F) b = 9;  if (f <= 25.0F) if (this.dJ > 4.0F) bool1 = true;   if (this.U != null) { an an1 = this.U.ap(); if (an1 == null || an1.a != ao.c) paramw.c = false;  if (an1 != null) if (!paraman.b(an1)) paramw.c = false;   }  boolean bool2 = false; if (!y.a(this.H, 200)) bool2 = true;  if (f > 800000.0F) { bool3 = true; } else { bool3 = (f3 <= f * f) ? true : false; }  if (!bool3 || bool1) { if (!aN()) { aw(); paraman = null; } else { this.j = true; this.k = f1; this.l = f2; if (f > 58.0F) this.m = (int)((f - 41.0F) / l.bt.k * 1.414F);  if (this.r > 90.0F) this.r = 90.0F;  if (this.p > 3) { aw(); paraman = null; return; }  }  } else if (!bool2) { if (!x() || f.c(b(paramFloat, f1, f2)) <= 30.0F) { s s1 = a(paraman, paraman.b, paraman.d, paraman.e, paraman.f); af af1 = null; if (s1.a != null) { af1 = s1.a; } else if (s1.b != null) { af1 = s1.b; }  if (af1 != null) { s1.d.a(this, af1); if (a(af1)) { if (b(af1) > 10000.0F) { af1.q(1.0F); av(); } else { paraman.e(); paraman.a = ao.d; paraman.h = af1; aE(); }  } else { aw(); }  this.H = -9999; } else { if (paraman.b == null) l.d("active.build==null");  if (!s1.c) aw();  }  }  }  }  }
/*  8391 */   private strictfp void a(float paramFloat, af paramaf, w paramw, boolean paramBoolean) { b b = aZ(); float f1 = paramaf.dH; float f2 = paramaf.dI; float f3 = f.a(this.dH, this.dI, f1, f2); if (this.U != null) { if (f3 < 490000.0F) { if (f3 < 48400.0F) paramw.c = false;  float f = f.a(this.U.dH, this.U.dI, f1, f2); if (f < 48400.0F) paramw.c = false;  if (f < 270400.0F && aR()) paramw.c = false;  }  if (this.U.I == paramaf) paramw.c = false;  if (paramw.c) { this.Z = 0.0F; } else { this.Z += paramFloat; }  } else { this.Z = 500.0F; }  float f4 = l(paramaf); boolean bool = true; if (f3 < f4 * f4) { if (this.I != paramaf) { if (aj.a(this, paramaf)) { this.I = paramaf; this.J = 10.0F; L(-1); }  } else { this.J = 10.0F; }  float f = f4; if (!E()) { f--; if (aR()) f -= 2.0F;  if (e(0) > 5.0F) f -= 3.0F;  }  if (f3 < f * f) if (aZ() != b.d) if (paramaf == null) { bool = false; } else if (f(paramaf)) { bool = false; if (paramBoolean) this.j = false;  } else if (!g(paramaf)) { bool = false; }    }  if (bool) { this.j = true; this.k = f1; this.l = f2; this.m = 0; if (b == b.d) a(f3, f1, f2);  this.m = n(paramaf); if (this.r > 90.0F) this.r = 90.0F;  if (f3 < 810000.0F) { if (cd() || aR()) this.i = true;  if (!paramw.c && this.Z < 120.0F) { this.r = 0.1F; this.i = true; }  }  }  } private strictfp void g(float paramFloat, an paraman, w paramw) { l l = l.u(); b b = aZ(); if (b == b.d) { if (paraman != null) if (paraman.h == null || paraman.h.bz || paraman.h.bB == this.bB) if (!this.aj) { if (this.I != null && this.I.bz) this.I = null;  float f = b(true) + 200.0F; a(l, paramFloat, f); if (this.I != null) { paraman.h = this.I; az(); aE(); } else { this.aj = true; this.ai = true; }  }    if (paraman != null) if (paraman.h == null || paraman.h.bz || paraman.h.bB == this.bB) if (paraman.h == null) { aw(); paraman = null; } else if (!this.ai) { aw(); paraman = null; }    } else if (paraman.h == null || paraman.h.bz || paraman.h.bB == this.bB) { boolean bool = true; if (at() > 1) bool = false;  paraman.h = null; if (bool) { if (this.I != null && this.I.bz) this.I = null;  float f = b(true); a(l, paramFloat, f); if (this.I != null) { paraman.h = this.I; az(); aE(); }  }  if (paraman.h == null) { aw(); paraman = null; }  }  if (paraman != null) if (paraman.h != null && !paraman.h.bz) if (!paraman.h.bS()) if (this.bB.c(paraman.h.bB)) if (!aj.b(this, paraman.h)) { aw(); paraman = null; return; }      if (paraman != null) if (!aN() && !l()) { aw(); paraman = null; }   if (paraman != null) a(paramFloat, paraman.h, paramw, false);  } private strictfp void h(float paramFloat, an paraman, w paramw) { float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); if (paraman.h == null || paraman.h.bz) { aw(); paraman = null; }  if (paraman != null) if (!paraman.h.d(this, false)) aw();   if (paraman != null) { this.bv = paraman.h; boolean bool = false; if (paraman.h.bw()) { if (f3 < 961.0F) this.P += paramFloat;  if (this.P > 240.0F) bool = true;  float f = 21.0F; if (paraman.h.bO().a()) f = 11.0F;  if (this.b > 0.0F) f = paraman.h.bO + 31.0F;  if (f3 < f * f) bool = true;  } else if (f3 < 441.0F) { bool = true; }  if (!bool) { this.j = true; this.k = f1; this.l = f2; if (this.r > 90.0F) this.r = 90.0F;  this.q = 18; if (f3 < 48400.0F) { paramw.c = false; if (this.r > 0.0F && this.aI == null) this.i = true;  }  if (this.U != null) if (!this.U.bG()) paramw.c = false;   }  if (bool) { af af1 = paraman.h; af1.e(this, false); aw(); }  }  } private strictfp void i(float paramFloat, an paraman, w paramw) { l l = l.u(); boolean bool1 = false; boolean bool2 = false; if (paraman == null) return;  float f1 = paraman.g(); float f2 = paraman.h(); float f3 = f.a(this.dH, this.dI, f1, f2); if (paraman != null) if (paraman.a == ao.g && paraman.h != null && paraman.h.g() > 0.0F) bool2 = true;   if (paraman != null) if (paraman.h == null || paraman.h.bz || paraman.h.cp != null) if (bool2) { bool1 = true; } else { av(); paraman = null; }    if (paraman != null && !bool1) if (bool2 && paraman.h != null) if (!w(paraman.h)) bool1 = true;    if (paraman != null && bool1) { i i1 = null; if (paraman.h != null) i1 = paraman.h.cA();  int k = cB(); af af1 = a(this, paraman.h.dH, paraman.h.dI, k, i1); if (af1 != null) { paraman.h = af1; az(); } else { av(); paraman = null; }  }  if (paraman != null) if (paraman.a == ao.d) { if (!a(paraman.h)) { aw(); paraman = null; }  } else if (!i(paraman.h)) { aw(); paraman = null; }   if (paraman != null) if (paraman.a == ao.d) if (paraman.h != null) if (paraman.h.bY >= paraman.h.bZ && paraman.h.bR >= 1.0F) { av(); paraman = null; }     if (paraman != null) if (paraman.h == this) { aw(); paraman = null; }   if (paraman != null) if (paraman != null && paraman.h != null) if (paraman.h.g() != 0.0F) { boolean bool = false; if (paraman.a == ao.d) bool = true;  if (bool) { aw(); paraman = null; }  }    if (paraman != null) if (paraman.a == ao.g) if (paraman.h.bB != this.bB && paraman.h.g() == 0.0F) { boolean bool = true; if (l.I() && this.bB.d(paraman.h.bB)) bool = false;  if (bool) { aw(); paraman = null; }  }    if (paraman != null) { int k; boolean bool; if (paraman.a == ao.g) { k = t(paraman.h); bool = u(paraman.h); } else { k = s(paraman.h); bool = v(paraman.h); }  if (this.U != null) { float f4 = f.a(this.U.dH, this.U.dI, f1, f2); int n = k + 80; if (f4 < (n * n)) paramw.c = false;  an an1 = this.U.ap(); if (an1 == null) paramw.c = false;  if (an1 != null) if (!paraman.b(an1)) paramw.c = false;   }  float f = k; if (this.h) f += 5.0F;  byte b = 30; if (k <= 30) b = 9;  if (f3 > f * f) { if (!aN() || paraman.k == 0.0F) { aw(); } else { boolean bool3 = false; if (paraman.k >= 0.0F) { float f4 = f.a((int)f3) - f; if (paraman.k < f4) bool3 = true;  }  if (bool3) { aw(); } else { this.j = true; this.k = f1; this.l = f2; if (k > 58) { this.m = (int)((k - 41.0F) / l.bt.k * 1.414F); } else { this.m = 0; }  if (k < 30 || bool) { if (f3 < 841.0F) this.i = true;  float f4 = (k + 14); if (f3 < f4 * f4) if (this.r > 0.0F && this.aI == null) this.i = true;   }  this.q = this.m; if (this.r > 90.0F) this.r = 90.0F;  }  }  } else { int n = aP(); if (n == -1) n = 0;  float f4 = 0.0F; if (x()) f4 = b(paramFloat, f1, f2);  boolean bool3 = false; if (f.c(f4) < 30.0F || !x()) { this.h = true; ai ai = this.cn[n]; if (ai.f < e(n)) { ai.f += paramFloat; } else { ai.f = e(n); bool3 = true; }  }  if (bool3) { af af1 = paraman.h; if (paraman.a != ao.g) { a(af1, paramFloat, n); if (af1.bR < 1.0F) { float f5 = af1.r().C(); if (af1.T() == 2) f5 *= 0.5F;  if (af1.T() == 3) f5 *= 0.25F;  f5 *= b(af1); float f6 = af1.bR + f5 * paramFloat; af1.q(f6); if (f6 >= 1.0F) if (f5 < 0.3D) if (af1.bB == l.bb) l.bA.f.a(af1);    } else { af1.bY += c(af1) * paramFloat; if (af1.bY > af1.bZ) { af1.bY = af1.bZ; aw(); }  }  } else { b(af1, paramFloat, n); boolean bool4 = false; float f5 = 5.1F; boolean bool5 = false; float f6 = c(af1) * f5; boolean bool6 = (paraman.h.g() > 0.0F) ? true : false; if (bool6) { f6 = paraman.h.g(); bool5 = true; }  boolean bool7 = false; if (!bool6) if (this.M < 200.0F && !bool6) if (af1.bR < 0.5D) { bool7 = true; } else if ((af1.bY / af1.bZ) < 0.5D) { bool7 = true; }    if (!bool7) if (af1.bR < 1.0F) { af1.bR = (float)(af1.bR - 0.001D * paramFloat * f5); if (af1.bR <= 0.0F) bool4 = true;  } else { float f7 = f6 * paramFloat; if (f7 >= af1.bY) { f7 = af1.bY; af1.bY = -1.0F; } else { af1.bY -= f7; }  af1.cR = 1000.0F; if (bool5) { float f8 = f7 / af1.bZ; g g1 = af1.cv(); g g2 = af1.cw(); if (g2 != null) g1 = g2;  if (g1.a() > 0) { this.S += f8 * g1.a(); if (this.S > 1.0F) { this.bB.m += (int)this.S; this.S -= (int)this.S; }  g1.a(this, f8, false); } else { g1.a(this, f8, true); }  }  if (af1.bY <= 0.0F) bool4 = true;  }   if (bool4) if (!af1.bz) { if (!bool5) { g g1 = af1.cw(); if (g1 != null) { g1.a(this, 1.0F, true); } else { g1 = af1.cv(); g1.a(this, 0.8F, true); }  }  af1.bz = true; af1.bA = l.bh; af1.bU(); if (af1 instanceof r) if (af1.bw()) l.bC.a((r)af1);   }   }  }  }  }  } public strictfp void k(float paramFloat) { l l = l.u(); if (this.bv != null) this.bv = null;  if (this.bw != null) { this.bx = f.a(this.bx, paramFloat); this.bv = this.bw; if (this.bx == 0.0F) this.bw = null;  }  if (this.r != 0.0F) this.r = f.a(this.r, paramFloat);  if (this.bK != 0.0F) this.c = f.a(this.c, paramFloat);  an an1 = ap(); this.i = false; if (this.h) this.h = false;  boolean bool = this.j; this.j = false; this.s = false; this.q = 150; if (an1 != null) if (an1.l > 0.0F) if (an1.l < this.M) { av(); an1 = null; }    w w1 = aD; w1.a(); if (an1 != null) { this.M += paramFloat; ao ao = an1.a; if (ao == ao.a || ao == ao.h || ao == ao.j) { a(paramFloat, an1, w1, bool); } else if (ao == ao.b) { g(paramFloat, an1, w1); } else if (ao == ao.c) { f(paramFloat, an1, w1); } else if (ao == ao.d || ao == ao.g) { i(paramFloat, an1, w1); } else if (ao == ao.e) { h(paramFloat, an1, w1); } else if (ao == ao.i) { e(paramFloat, an1, w1); } else if (ao == ao.m) { d(paramFloat, an1, w1); } else if (ao == ao.k || ao == ao.l || ao == ao.n) { c(paramFloat, an1, w1); } else if (ao == ao.o || ao == ao.p) { a(paramFloat, an1, w1); } else if (ao == ao.q) { b(paramFloat, an1, w1); }  if (an1 != ap()) an1 = null;  }  if (an1 != null) if (an1.m && this.f > 1) { boolean bool1 = true; an an2 = k(1); if (an2 != null && (an2.a == ao.k || an2.a == ao.j)) bool1 = false;  if (bool1) { aw(); an1 = null; }  }   if (an1 == null) this.j = false;  if (this.j) { i i1 = cV(); if (i1 != null) if (i1.H) bs();   } else if (this.p != 0) { this.p = 0; }  b(l, paramFloat); a(l, paramFloat, an1, w1); } private strictfp void a(float paramFloat1, float paramFloat2, float paramFloat3) { if (this.ah < -900.0F) { float f = f.d(this.dH, this.dI, paramFloat2, paramFloat3); this.ah = f; }  if (paramFloat1 < 10000.0F) if (bJ()) this.ai = true;   if (this.ai) if (this.cf < aY() * 0.6D || (paramFloat1 < 40000.0F && this.cf < aY())) { this.k += f.i(this.ah + 180.0F) * 600.0F; this.l += f.h(this.ah + 180.0F) * 600.0F; } else { this.ai = false; this.ah = -999.0F; aE(); }   } private strictfp void a(float paramFloat, y paramy, w paramw, an paraman) { l l = l.u(); r r1 = this.U; float f1 = r1.dH + this.ab; float f2 = r1.dI + this.ac; boolean bool1 = false; int k = l.bh - r1.ae; float f3 = f.a(this.dH, this.dI, f1, f2); if (k > 300 || this.b > 1.0F) this.d += paramFloat;  boolean bool2 = false; if (this.d > 300.0F) bool2 = true;  if (k > 300 && f3 > 250000.0F) bool2 = true;  if (this.b > 1.0F) { if (this.c != 0.0F) bool2 = true;  if (this.d > 10.0F) bool2 = true;  }  if (bool2) this.c = 90.0F;  if (this.c == 0.0F) { aE(); paramw.d = f1; paramw.e = f2; y y1 = null; if (k < 3000) if (y1 == null && r1.u > 2 && r1.u - r1.am <= 2) y1 = r1.o(2);   if (k < 1500) if (y1 == null && r1.u > 0 && r1.am + 0 >= r1.u) { y y2 = r1.o(0); y1 = aJ; float f4 = f.d(r1.dH, r1.dI, y2.a, y2.b); float f5 = 80.0F; if (k > 300) { float f6 = 0.06666667F; f5 -= (k - 300) * 0.06666667F; }  y1.a = r1.dH + f.i(f4) * f5; y1.b = r1.dI + f.h(f4) * f5; }   if (y1 != null) { paramw.b = true; paramw.d = y1.a + this.ab; paramw.e = y1.b + this.ac; } else if (r1.u >= 2 && r1.am >= 1) { y y2; y y3; if (r1.am >= 2) { y2 = r1.o(0); y3 = r1.o(1); } else { y2 = r1.o(0); y3 = r1.o(0); }  if (y2 != null && y3 != null) { float f6, f7, f4 = f.c(r1.dH, r1.dI, y2.a, y2.b); float f5 = 1.0F - (f4 - 15.0F) * 0.05F; if (f5 > 2.0F) f5 = 2.0F;  if (f5 < 0.0F) f5 = 0.0F;  if (f5 > 1.0F) { if (r1.am >= 3) { y y4 = r1.o(2); f6 = y3.a - y2.a; f7 = y3.b - y2.b; float f8 = y4.a - y3.a; float f9 = y4.b - y3.b; f6 += f8 * (f5 - 1.0F); f7 += f9 * (f5 - 1.0F); } else { f6 = y3.a - y2.a; f7 = y3.b - y2.b; }  } else { float f8 = y3.a - y2.a; float f9 = y3.b - y2.b; f6 = f8 * f5; f7 = f9 * f5; }  f1 = y2.a + this.ab + f6; f2 = y2.b + this.ac + f7; paramw.d = f1; paramw.e = f2; }  }  float f = 45.0F; if (this.b <= 1.0F) { f = 60.0F; } else if (k < 500 && this.b <= 1.0F) { f = 110.0F; }  if (f3 < f * f) this.d = 0.0F;  boolean bool3 = false; an an1 = r1.ap(); boolean bool4 = false; if (an1 != null) if (paraman != null);  if (an1 == null || bool4) { float f4; this.e += paramFloat; boolean bool = false; if (paraman != null) if (paraman.a == ao.a || paraman.a == ao.h || paraman.a == ao.j) bool = true;   if (bool && this.e > 600.0F) { f4 = 260.0F; } else if (bool && this.e > 360.0F) { f4 = 140.0F; } else if (bool && this.e > 180.0F) { f4 = 70.0F; } else if (bool && this.e > 120.0F) { f4 = 50.0F; } else { f4 = 16.0F; }  if (f3 < f4 * f4) bool3 = true;  if (bool1) bool3 = true;  }  if (bool3) { boolean bool = false; if (an1 == null) bool = true;  if (bool4) bool = true;  if (bool) { float f4 = c(paramFloat, this.ad); if (f.c(f4) < 3.0F) if (paraman != null) if (paraman.a == ao.a || paraman.a == ao.h) { aw(); if (r1 != null) { boolean bool5 = false; an an2 = ap(); an an3 = r1.ap(); if (an2 != null && an3 != null) if (an2.b(an3)) bool5 = true;   if (!bool5) a((r)null);  }  }    }  } else if (!bool1) { paramw.a = true; }  } else { y y1 = null; byte b = 8; if (y1 == null && r1.u > 2 && b < r1.am) { byte b1 = b; y1 = r1.o(b1); }  if (y1 == null) { y1 = aJ; y1.a = r1.dH; y1.b = r1.dI; }  float f4 = f.a(this.dH, this.dI, y1.a, y1.b); float f5 = this.bO + r1.bO + 15.0F; float f6 = this.bO + r1.bO + 100.0F; if (f4 < f5 * f5) { this.d = 0.0F; this.c = 0.0F; } else if (f4 < f6 * f6) {  }  float f7 = 300.0F; boolean bool = true; if (this.aI == null && paramy != null) if (f.c(this.n - y1.a) > 300.0F || f.c(this.o - y1.b) > 300.0F) if (this.r > 30.0F) this.r = 30.0F;    if (this.r == 0.0F) if (this.aI == null) { this.r = 700.0F; boolean bool3 = false; a(y1.a, y1.b, 0, false, bool3); }   if (paramy != null) { paramw.d = paramy.a; paramw.e = paramy.b; if (!bool1) paramw.a = true;  }  }  } static final w aD = new w(); private strictfp void a(l paraml, float paramFloat, an paraman, w paramw) { boolean bool = I(); if (this.aI != null) b(paraml);  if (this.U != null) if (this.U.bz || !this.U.bG()) a((r)null);   if (this.j) { y y1 = aC(); an an1 = ap(); if (an1 == null) paramw.c = false;  if (this.V && this.X > 0) if (aD()) this.ae = paraml.bh;   if (an1 != null) if (this.U != null && paramw.c) { an an2 = this.U.ap(); if (an2 != null && !an2.b(an1)) paramw.c = false;  }   if (this.U != null && paramw.c) { a(paramFloat, y1, paramw, paraman); } else if (this.bQ != 0.0F) { paramw.d = this.k; paramw.e = this.l; paramw.a = true; } else { boolean bool1 = false; if (this.aI == null) { if (y1 == null) if (this.r == 0.0F) bool1 = true;   if (this.r == 0.0F && (cd() || aR())) { float f = m() - 1.0F; if (f.c(this.n - this.k) > f || f.c(this.o - this.l) > f) bool1 = true;  }  if (paraman != null) if (this.r == 0.0F && (paraman.a == ao.e || paraman.a == ao.i)) { float f = 12.0F; if (f.c(this.n - this.k) > f || f.c(this.o - this.l) > f) bool1 = true;  }   if (paraman != null) { float f = this.q; if (f.c(this.n - this.k) > f || f.c(this.o - this.l) > f) { if (this.r > 30.0F) this.r = 30.0F;  if (this.r == 0.0F) bool1 = true;  }  }  }  if (bool1) { this.r = 500.0F; boolean bool2 = (this.V && this.Y > 1) ? true : false; a(this.k, this.l, this.m, bool2, this.s); }  if (y1 != null) { paramw.d = y1.a; paramw.e = y1.b; paramw.a = true; } else if (this.i) { paramw.d = this.k; paramw.e = this.l; paramw.a = true; }  }  }  a(paramFloat, paramw, paraman, bool); } public strictfp boolean aH() { l l = l.u();
/*       */ 
/*       */ 
/*       */     
/*  8395 */     boolean bool1 = false;
/*  8396 */     boolean bool2 = false;
/*       */     
/*  8398 */     if (cd())
/*       */     {
/*  8400 */       bool1 = true;
/*       */     }
/*       */ 
/*       */     
/*  8404 */     l.bt.a(this.dH, this.dI);
/*  8405 */     int k = l.bt.M;
/*  8406 */     int n = l.bt.N;
/*       */     
/*  8408 */     if (l.bC.a(h(), k, n))
/*       */     {
/*  8410 */       if (!l.bC.b(h(), k, n)) {
/*       */         
/*  8412 */         bool1 = true;
/*  8413 */         bool2 = true;
/*       */       } 
/*       */     }
/*       */     
/*  8417 */     return bool1; }
/*       */   private strictfp void a(float paramFloat, w paramw, an paraman, boolean paramBoolean) { float f = 0.0F; l l = l.u(); if (this.j) if (paramw.a && paramBoolean) { float f1 = paramw.d; float f2 = paramw.e; float f3 = f.d(this.dH, this.dI, f1, (f2 - this.dI) * aV() + this.dI); float f4 = f.a(this.dH, this.dI, f1, f2); boolean bool1 = false; float f5 = aX(); if (f5 > 0.95F) { bool1 = true; } else if (f5 > 0.87D) { if (this.Y <= 1) if (this.am > 0 && this.am <= 9 && this.V && f4 < 250000.0F) bool1 = true;   } else if (f5 > 0.7D) { if (this.Y <= 1) if (this.am > 0 && this.am <= 4 && this.V && f4 < 40000.0F) bool1 = true;   } else if (f5 > 0.4D) { if (this.Y <= 1) if (this.am > 0 && this.am <= 2 && this.V && f4 < 10000.0F) bool1 = true;   }  boolean bool2 = true; float f6 = 179.0F; if (this.I != null && E() && be() && !aR()) { this.bM = f3; } else if (this.ap <= 0.0F) { f6 = a(paramFloat, f3, bool2, bool1); }  float f7 = 20.0F; if (f4 > 361.0F) f7 = 46.0F;  if (f4 > 3600.0F) f7 = 89.0F;  float f8 = A(); if (f8 < 1.4D) if (f4 > 6400.0F) { f7 *= 0.5F; } else { f7 = 17.0F; }   if (f8 < 1.1D) f7 *= 0.7F;  if (this.bK > 0.4D && f4 > 16900.0F) f7 = 180.0F;  if (aT()) if (this.u == this.am) f7 = 1.0F;   if (be()) f7 = 181.0F;  float f9 = 4.0F; boolean bool3 = (this.am == 1) ? true : false; if (!bool3 || f4 >= f9 * f9) if (f.c(f6) <= f7) { f = 1.0F; if (paramw.b) { if (f4 < 2500.0F) f -= 0.15F;  if (f4 < 900.0F) f -= 0.15F;  if (f4 < 225.0F) f -= 0.3F;  } else if (this.U != null) { if (f4 > 400.0F) f += 0.2F;  if (f4 < 49.0F) f -= 0.15F;  if (f4 < 9.0F) f -= 0.15F;  }  if (f4 < 9.0F) f = 0.0F;  }   if (bool3 && f != 0.0F) { if (f4 < 324.0F) if (D() < 0.13F && z() > 1.0F) f = 0.5F * f;   if (f4 < 169.0F) if (D() < 0.15F && z() > 0.9F) f = 0.5F * f;   }  boolean bool4 = false; if (!bool3 && f4 < 256.0F) bool4 = true;  if (bool3 && f4 < f9 * f9) bool4 = true;  if ((this.R == l.bg || this.R == l.bg - 1) && this.Q != null) if (this.Q.c(f1, f2, 2.0F)) bool4 = true;   if (f > 0.0F) { this.N += paramFloat; if (this.N > 200.0F && f4 < 3600.0F && this.am >= 2) { float f10 = this.N; aG(); this.N = f10; }  if (this.N > 600.0F && this.am >= 2) aE();  if (this.N > 80.0F && this.b > 30.0F) aE();  if (this.N > 40.0F) if (this.am >= 2) { y y1 = this.al[1]; float f10 = f.a(this.dH, this.dI, y1.a, y1.b); if (f10 < f4) { float f11 = this.N; aG(); this.N = f11; }  }   }  if (bool4) { aG(); if (bool3) { this.d = 0.0F; this.c = 0.0F; }  if (!this.t) if (this.U == null && bool3) if (paraman != null) if (paraman.a == ao.a) av();     }  }   if (this.bN) if (!be()) f = -f * aX();   if (this.ap > 0.0F) f = 0.0F;  if (!bd()) { if (this.bK < f) this.bK = f.a(this.bK, f, C() * paramFloat);  if (this.bK > f) this.bK = f.a(this.bK, f, D() * paramFloat);  } else { this.bK = f; }  this.cm = (paramw.a && paramBoolean); }
/*       */   public static x aE = new x(true);
/*       */   public static x aF = new x(false);
/*       */   public static aa aG = new aa(true);
/*       */   public static aa aH = new aa(false);
/*       */   g aI;
/*       */   @Deprecated public strictfp boolean X() { return (this.I != null); }
/*       */   public strictfp boolean Y() { if (this.I != null && !this.I.bz) { int k = bg(); for (byte b = 0; b < k; b++) { if ((this.cn[b]).j != null) if (r(b)) return true;   }  }  return false; }
/*  8426 */   public strictfp af Z() { if (this.I != null && !this.I.bz) return this.I;  an an1 = ap(); if (an1 != null) if (an1.h != null && !an1.h.bz) return an1.h;   return null; } private strictfp void a(l paraml, float paramFloat1, float paramFloat2) { aE.a(paramFloat2); paraml.bK.a(this.dH, this.dI, paramFloat2, this, paramFloat1, aE); if (aE.a != 0) if (this.I == null || !a_(this.I)) { aF.a(paramFloat2); paraml.bK.a(this.dH, this.dI, paramFloat2, this, paramFloat1, aF); }   } public strictfp boolean aa() { return (bg() > 1); } private strictfp void a(l paraml, float paramFloat) { int k = bg(); if (!aa()) { for (byte b1 = 0; b1 < k; b1++) (this.cn[b1]).j = this.I;  return; }  boolean bool = false; byte b; for (b = 0; b < k; b++) { ai ai = this.cn[b]; if (v(b) == -1) { boolean bool1 = false; boolean bool2 = false; if (a(b, this.I, false, false)) { ai.j = this.I; } else { bool = true; if (ai.j == this.I) ai.j = null;  }  }  }  if (bool) { float f = b(false); aH.a(this); paraml.bK.a(this.dH, this.dI, f, this, paramFloat, aH); }  for (b = 0; b < k; b++) { int n = v(b); if (n != -1) (this.cn[b]).j = (this.cn[n]).j;  }  } public strictfp boolean ab() { if (!l()) return false;  i i1 = cV(); if (i1 != null) if (!i1.M) return false;   return true; } private strictfp void b(l paraml, float paramFloat) { int k = bg(); boolean bool = false; if (ab()) { boolean bool1 = false; boolean bool2 = false; if (this.I != null) { i i1 = cV(); if (i1 != null && this.cq != null) if (i1.L) if (this.cq.I == this.I) bool1 = true;    if (!a(this.I, false) && !bool1) { boolean bool3 = true; if (bool3) this.I = null;  }  }  if (this.I != null && !bool1) bool2 = !a_(this.I) ? true : false;  this.J = f.a(this.J, paramFloat); this.K = f.a(this.K, paramFloat); if (this.I == null || bool2) if (this.J == 0.0F) if (ba()) { this.J = 20.0F + this.dH % 5.0F + this.dI % 5.0F; float f = b(false); a(paraml, paramFloat, f); if (this.I != null) this.K = 0.0F;  }    if (this.I != null) if (this.K == 0.0F) { this.K = 20.0F + this.dH % 5.0F + this.dI % 5.0F; a(paraml, paramFloat); }   for (byte b1 = 0; b1 < k; b1++) (this.cn[b1]).g = false;  if (this.I != null) { float f1 = f.a(this.dH, this.dI, this.I.dH, this.I.dI); float f2 = l(this.I); if (f1 < f2 * f2 || bool1) { int n = aP(); byte b2; for (b2 = 0; b2 < k; b2++) { ai ai = this.cn[b2]; af af1 = ai.j; if (af1 == null) continue;  boolean bool3 = (af1 == this.I) ? true : false; if (!bool3) if (!b(af1, true)) { ai.j = null; continue; }   boolean bool4 = false; boolean bool5 = !bool3 ? true : false; if (!a(b2, af1, false, bool5)) { ai.j = null; } else { PointF pointF1 = F(b2); PointF pointF2 = J(b2); pointF2.a += af1.dH; pointF2.b += af1.dI; float f = f.d(pointF1.a, pointF1.b, pointF2.a, pointF2.b); if (v(b2) == -1 && b2 != n) if (!E()) { ai.a(70); ai.b = ai.a; float f3 = 179.0F; if (!ai.b()) f3 = a(paramFloat, f, b2);  if (f.c(f3) < x(b2)) ai.g = true;  } else { boolean bool6 = false; an an1 = ap(); if (an1 != null) if (an1.a == ao.c || an1.a == ao.d || an1.a == ao.g) bool6 = true;   if (!bool6) if (!this.j || be()) { float f3 = c(paramFloat, f); ai.b = ai.a; if (f.c(f3) < x(b2)) ai.g = true;  }   }   }  continue; }  for (b2 = 0; b2 < k; b2++) { ai ai = this.cn[b2]; af af1 = ai.j; if (af1 != null) { if (u(b2)) if (ai.e == 0.0F) bool = true;   if (u(b2)) a(paramFloat, af1, b2);  }  }  } else if (!this.j && al()) { this.i = true; this.j = true; this.k = this.I.dH; this.l = this.I.dI; this.m = 0; }  }  }  if (this.aC) if (V() != null) bool = true;   for (byte b = 0; b < k; b++) { ai ai = this.cn[b]; if (!bool && ai.f != 0.0F) ai.f = f.a(ai.f, f(b) * paramFloat);  }  } public strictfp void b(af paramaf, int paramInt) {} public strictfp boolean a(float paramFloat, af paramaf, int paramInt) { ai ai = this.cn[paramInt]; int k = v(paramInt); if (k != -1) ai.a = (this.cn[k]).a;  boolean bool = s(paramInt); boolean bool1 = false; if (bool) { if (ai.f < e(paramInt)) { if (ai.f == 0.0F) b(paramaf, paramInt);  ai.f += paramFloat; } else { ai.f = e(paramInt); }  bool1 = true; }  if (ai.e == 0.0F && r(paramInt)) { boolean bool2 = false; boolean bool3 = false; if (!a(paramInt, paramaf, false, false)) { ai.e = -10.0F; } else { if (!bool) if (ai.f < e(paramInt)) { if (ai.f == 0.0F) b(paramaf, paramInt);  ai.f += paramFloat; } else { bool1 = true; }   if (bool1) { ai.e = b(paramInt) + t(paramInt); if (!bool) ai.f = 0.0F;  a(paramaf, paramInt); L(paramInt); ai.m = !ai.m; return true; }  }  }  return false; } public strictfp boolean a_(af paramaf) { float f1 = f.a(this.dH, this.dI, paramaf.dH, paramaf.dI); float f2 = l(paramaf); if (f1 < f2 * f2) return true;  return false; } public strictfp boolean ac() { return false; } public strictfp boolean ad() { return true; } public strictfp boolean ae() { return true; } public strictfp boolean af() { return true; } public strictfp boolean f(af paramaf) { int k = bg(); for (byte b = 0; b < k; b++) { boolean bool1 = false; boolean bool2 = false; if (r(b) && a(b, paramaf, false, false)) { int n = v(b); if (n != -1) if (!a(n, paramaf, false, false)) continue;   return true; }  continue; }  return false; } public strictfp boolean g(af paramaf) { int k = bg(); for (byte b = 0; b < k; b++) { boolean bool1 = true; boolean bool2 = false; if (r(b) && a(b, paramaf, true, false)) { int n = v(b); if (n != -1) if (!a(n, paramaf, true, false)) continue;   return true; }  continue; }  return false; } public strictfp boolean a(int paramInt, af paramaf, boolean paramBoolean1, boolean paramBoolean2) { if (!paramBoolean1) if (paramBoolean2) if (!a_(paramaf)) return false;    return true; } public strictfp boolean h(af paramaf) { if (paramaf.i()) return ad();  if (paramaf.P()) return ac();  if (!af()) if (!paramaf.cr()) return false;   return ae(); } public strictfp boolean a(af paramaf) { return false; } public strictfp boolean i(af paramaf) { if (paramaf.g() != 0.0F && x(paramaf)) return true;  return a(paramaf); } public strictfp s a(al paramal, boolean paramBoolean) { return a(paramal, -1, paramBoolean); } public strictfp boolean ag() { for (s s1 : M()) { if (s1.g()) return true;  }  return false; } public strictfp s a(al paramal, int paramInt, boolean paramBoolean) { ArrayList arrayList = M(); s s1 = null; if (arrayList.size() > 0) for (s s2 : arrayList) { al al1 = s2.v(); if (paramBoolean) { al al2 = s2.B(); if (al2 != null) al1 = al2;  }  if (al1 == paramal && (paramInt == -1 || paramInt == s2.p())) { s1 = s2; if (s2.a(this) && s2.a(this, false)) return s2;  }  }   return s1; } public strictfp boolean b(al paramal, boolean paramBoolean) { s s1 = a(paramal, paramBoolean); if (s1 != null) { if (s1.h(this)) return false;  if (!s1.a(this)) return false;  return true; }  return false; } public strictfp boolean ah() { return r().m(); } public strictfp boolean ai() { return r().l(); } public strictfp void j(af paramaf) {} public strictfp boolean aj() { return false; } public final strictfp boolean a(af paramaf, boolean paramBoolean) { if (this.bB == paramaf.bB || paramaf.bz || !this.bB.c(paramaf.bB)) return false;  if (this.G == a.d) return false;  if (this.G == a.c) return false;  if (paramaf.cp != null) return false;  if (!h(paramaf)) return false;  if (!paramaf.d(this)) return false;  if (!paramBoolean) { float f1 = f.a(this.dH, this.dI, paramaf.dH, paramaf.dI); float f3 = b(false); float f2 = f3 * f3; if (f1 < f2) return true;  return false; }  return true; } public final strictfp boolean b(af paramaf, boolean paramBoolean) { if (paramaf.ce()) return false;  return a(paramaf, paramBoolean); } public strictfp float ak() { return 0.0F; } public strictfp boolean al() { return (this.G == a.a || this.G == a.e || this.G == a.f); } public strictfp float b(boolean paramBoolean) { float f = m(); an an1 = ap(); if (an1 != null && (an1.a == ao.h || an1.a == ao.j || an1.a == ao.k)) { if (an1.a == ao.j) { f += 110.0F; } else if (an1.a == ao.k) { f += 90.0F; } else { f += 20.0F; }  if (f < 190.0F) f = 190.0F;  }  if (this.G == a.a) { f += 250.0F; } else if (this.G == a.e) { f += 150.0F; } else if (this.G == a.f) { f += 180.0F; } else { f += ak(); if (paramBoolean) f += 110.0F;  }  return f; } public strictfp an am() { m(29); an an1 = this.g[29]; for (byte b = 29; b >= 1; b--) this.g[b] = this.g[b - 1];  this.g[0] = an1; if (this.f < 29) this.f++;  if (this.g[0] == null) this.g[0] = new an();  an an2 = this.g[0]; an2.e(); this.M = 0.0F; this.P = 0.0F; this.N = 0.0F; b(an2); aE(); return an2; } public strictfp void a(an paraman) {} public strictfp void b(an paraman) { if (this.I != null) if (this.I.ce()) this.I = null;   } public strictfp an an() { m(this.f); if (this.g[this.f] == null) this.g[this.f] = new an();  an an1 = this.g[this.f]; an1.e(); if (this.f < 29) this.f++;  if (this.f > 0) b(this.g[0]);  return an1; } public strictfp an d(float paramFloat1, float paramFloat2) { an an1 = an(); an1.a(paramFloat1, paramFloat2); return an1; } public strictfp an k(af paramaf) { an an1 = an(); an1.a(paramaf); return an1; } public strictfp an e(float paramFloat1, float paramFloat2) { an an1 = an(); an1.b(paramFloat1, paramFloat2); return an1; } public strictfp an c(an paraman) { an an1 = an(); an1.c(paraman); return an1; } public strictfp boolean ao() { return (ap() == null); } public strictfp an ap() { if (this.f == 0) return null;  return this.g[0]; } public strictfp an aq() { if (this.f <= 1) return null;  return this.g[1]; } public strictfp an ar() { if (this.f == 0) return null;  return this.g[this.f - 1]; } public strictfp void as() { if (this.f == 0) return;  if (this.f == 1) { aw(); } else { this.f--; }  } public strictfp an k(int paramInt) { return this.g[paramInt]; } public strictfp int at() { return this.f; } public strictfp boolean au() { an an1 = ap(); if (an1 != null && an1.a == ao.b) return true;  return false; } public strictfp boolean a(al paramal, float paramFloat1, float paramFloat2) { for (byte b = 0; b < this.f; b++) { an an1 = this.g[b]; if (an1.a == ao.c) if (an1.b == paramal) if (f.c(an1.e - paramFloat1) < 10.0F && f.c(an1.f - paramFloat2) < 10.0F) return true;    }  return false; } public strictfp void l(int paramInt) { if (paramInt >= 120) throw new RuntimeException("PathNode index:" + paramInt + " too large");  if (this.al == ak) this.al = new y[120];  } public strictfp void m(int paramInt) { if (paramInt >= 30) throw new RuntimeException("Waypoint index:" + paramInt + " too large");  if (this.g == F) this.g = new an[30];  } public strictfp void n(int paramInt) { if (this.f <= paramInt) throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f + ", waypointIndex:" + paramInt);  if (paramInt == 0) { aw(); return; }  if (this.g.length > 0) { an an1 = this.g[paramInt]; for (int k = paramInt; k < this.f - 1; k++) this.g[k] = this.g[k + 1];  this.g[this.f - 1] = an1; }  this.f--; } public strictfp void av() { aA(); aw(); } public strictfp void aw() { this.M = 0.0F; this.P = 0.0F; this.N = 0.0F; this.ai = false; this.ah = -999.0F; this.aj = false; this.v = 0; if (this.f == 0) { aE(); this.e = 0.0F; this.d = 0.0F; this.c = 0.0F; return; }  if (this.f == 1) { this.f = 0; aE(); this.e = 0.0F; this.d = 0.0F; this.c = 0.0F; return; }  if (this.g.length > 0) { an an1 = this.g[0]; for (byte b = 0; b < this.f - 1; b++) this.g[b] = this.g[b + 1];  this.g[this.f - 1] = an1; }  this.f--; if (this.f > 0) b(this.g[0]);  aE(); } public strictfp void ax() { this.M = 0.0F; this.P = 0.0F; this.ai = false; this.ah = -999.0F; this.aj = false; this.f = 0; aE(); aB(); a((r)null); this.e = 0.0F; this.d = 0.0F; this.c = 0.0F; this.v = 0; } public strictfp void ay() { for (byte b = 0; b < this.f; b++) { an an1 = this.g[b]; if (an1 != null) if (an1.a != ao.c && an1.a != ao.d) n(b);   }  } public strictfp void a(r paramr) { if (this.U != null) this.U.X--;  this.U = paramr; if (paramr != null) this.U.X++;  } public strictfp void az() { a((r)null); this.V = false; this.aa = false; this.ab = 0.0F; this.ac = 0.0F; this.T = 0; this.c = 0.0F; } public strictfp void aA() { if (this.X == 0) return;  an an1 = aq(); af[] arrayOfAf = af.bj.a(); byte b; int k; for (b = 0, k = af.bj.size(); b < k; b++) { af af1 = arrayOfAf[b]; if (af1 instanceof r) { r r1 = (r)af1; if (r1.U == this) { float f = f.a(this.dH, this.dI, r1.dH, r1.dI); boolean bool1 = (f < 108900.0F) ? true : false; boolean bool2 = false; boolean bool3 = false; an an2 = r1.aq(); if (an1 != null && an2 != null) { if (an1.b(an2)) bool2 = true;  } else if (an1 == null && an2 == null) { bool3 = true; }  if (bool2 && bool1) { r1.aw(); } else if (!bool3) { r1.a((r)null); }  }  }  }  } public strictfp void aB() { r r1 = null; if (this.X == 0) return;  af[] arrayOfAf = af.bj.a(); byte b; int k; for (b = 0, k = af.bj.size(); b < k; b++) { af af1 = arrayOfAf[b]; if (af1 instanceof r) { r r2 = (r)af1; if (r2.U == this) { r2.a((r)null); r1 = r2; }  }  }  if (this.X != 0) this.X = 0;  if (r1 != null) { an an1 = r1.ap(); if (an1 != null) { ab ab = an1.i; if (ab != null) ab.c();  }  }  } public strictfp y aC() { if (this.am == 0) return null;  return this.al[0]; } public strictfp void a(int paramInt, float paramFloat1, float paramFloat2) { l(paramInt); if (this.al[paramInt] == null) this.al[paramInt] = new y();  (this.al[paramInt]).a = paramFloat1; (this.al[paramInt]).b = paramFloat2; } public strictfp boolean aD() { if (this.am >= 2) if (z() > 0.5D) { if (this.N > 150.0F || this.O > 150.0F) return true;  } else if (this.N > 300.0F || this.O > 300.0F) { return true; }   return false; } public strictfp void aE() { this.am = 0; this.t = false; this.u = 0; this.r = 0.0F; this.N = 0.0F; this.O = 0.0F; this.p = 0; } public strictfp void aF() { aE(); this.al = ak; this.ax = 0; this.ay = null; this.az = null; } public strictfp void aG() { this.O = this.N; this.N = 0.0F; if (this.am == 0) return;  if (this.am == 1) { this.am = 0; return; }  y y1 = this.al[0]; for (byte b = 0; b < this.am - 1; b++) this.al[b] = this.al[b + 1];  this.al[this.am - 1] = y1; this.am--; } public strictfp void a(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean1, boolean paramBoolean2) { l l = l.u();
/*  8427 */     h h1 = l.bC;
/*  8428 */     b b = l.bt;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  8442 */     this.cm = true;
/*       */     
/*  8444 */     boolean bool1 = false;
/*  8445 */     boolean bool2 = false;
/*       */     
/*  8447 */     if (cd())
/*       */     {
/*  8449 */       bool1 = true;
/*       */     }
/*       */ 
/*       */     
/*  8453 */     b.a(this.dH, this.dI);
/*  8454 */     int k = b.M;
/*  8455 */     int n = b.N;
/*       */ 
/*       */ 
/*       */     
/*  8459 */     if (h1.a(h(), k, n))
/*       */     {
/*  8461 */       if (!h1.b(h(), k, n)) {
/*       */ 
/*       */ 
/*       */         
/*  8465 */         bool1 = true;
/*  8466 */         bool2 = true;
/*       */       } 
/*       */     }
/*       */ 
/*       */ 
/*       */     
/*  8472 */     if (paramFloat1 != this.n || this.o != paramFloat2)
/*       */     {
/*  8474 */       this.p = 0;
/*       */     }
/*       */     
/*  8477 */     this.n = paramFloat1;
/*  8478 */     this.o = paramFloat2;
/*       */ 
/*       */     
/*  8481 */     if (bool1) {
/*       */ 
/*       */       
/*  8484 */       this.t = false;
/*  8485 */       this.am = 0;
/*  8486 */       float f1 = b.a(paramFloat1);
/*  8487 */       float f2 = b.b(paramFloat2);
/*       */       
/*  8489 */       if (bool2) {
/*       */         
/*  8491 */         float f3 = f.d(this.dH, this.dI, f1, f2);
/*  8492 */         float f4 = f.b(this.dH, this.dI, f1, f2);
/*  8493 */         if (f4 > 60.0F) {
/*       */           
/*  8495 */           f4 = 60.0F;
/*  8496 */           this.t = true;
/*       */           
/*  8498 */           if (this.r > 10.0F)
/*       */           {
/*  8500 */             this.r = 10.0F;
/*       */           }
/*       */         } 
/*       */         
/*  8504 */         f1 = this.dH + f.i(f3) * f4;
/*  8505 */         f2 = this.dI + f.h(f3) * f4;
/*       */       } 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  8511 */       a(this.am, f1, f2);
/*       */ 
/*       */       
/*  8514 */       this.u = ++this.am;
/*       */ 
/*       */       
/*       */       return;
/*       */     } 
/*       */     
/*  8520 */     boolean bool3 = true;
/*  8521 */     byte b1 = 80;
/*  8522 */     byte b2 = 0;
/*  8523 */     if (paramBoolean1)
/*       */     {
/*  8525 */       b2 = 3;
/*       */     }
/*       */ 
/*       */     
/*  8529 */     boolean bool = aj.a(h(), this.dH, this.dI, paramFloat1, paramFloat2, b1, b2, bool3);
/*       */ 
/*       */     
/*  8532 */     if (bool) {
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  8542 */       this.t = false;
/*  8543 */       this.am = 0;
/*       */       
/*  8545 */       float f1 = b.a(paramFloat1);
/*  8546 */       float f2 = b.b(paramFloat2);
/*       */       
/*  8548 */       float f3 = this.dH;
/*  8549 */       float f4 = this.dI;
/*       */       
/*  8551 */       float f5 = f.d(this.dH, this.dI, f1, f2);
/*  8552 */       float f6 = f.b(this.dH, this.dI, f1, f2);
/*       */       
/*  8554 */       float f7 = f.i(f5);
/*  8555 */       float f8 = f.h(f5);
/*       */       
/*  8557 */       float f9 = 20.0F;
/*  8558 */       float f10 = 0.05F;
/*       */ 
/*       */       
/*  8561 */       int i1 = (int)(f6 * 0.05F - 1.0F);
/*       */       
/*  8563 */       byte b3 = 1;
/*       */       
/*  8565 */       if (i1 < 4)
/*       */       {
/*  8567 */         b3 = 0;
/*       */       }
/*       */       
/*  8570 */       for (byte b4 = 0; b4 < i1; b4++) {
/*       */         
/*  8572 */         f3 += f7 * 20.0F;
/*  8573 */         f4 += f8 * 20.0F;
/*       */         
/*  8575 */         if (b3) {
/*       */           
/*  8577 */           b3--;
/*       */         }
/*       */         else {
/*       */           
/*  8581 */           a(this.am, f3, f4);
/*       */           
/*  8583 */           this.am++;
/*       */           
/*  8585 */           if (this.am >= 119) {
/*       */             
/*  8587 */             this.t = true;
/*       */             break;
/*       */           } 
/*       */         } 
/*       */       } 
/*  8592 */       if (!this.t)
/*       */       {
/*  8594 */         if (this.am < 119) {
/*       */           
/*  8596 */           a(this.am, f1, f2);
/*  8597 */           this.am++;
/*       */         }
/*       */         else {
/*       */           
/*  8601 */           this.t = true;
/*       */         } 
/*       */       }
/*       */       
/*  8605 */       this.u = this.am;
/*       */ 
/*       */       
/*       */       return;
/*       */     } 
/*       */     
/*  8611 */     ab ab = null;
/*  8612 */     boolean bool4 = false;
/*       */     
/*  8614 */     an an1 = ap();
/*  8615 */     if (an1 != null) {
/*       */       
/*  8617 */       ab = an1.i;
/*       */       
/*  8619 */       if (ab == null);
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  8635 */     if (ab != null)
/*       */     {
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  8647 */       if (ab.g != null) {
/*       */         
/*  8649 */         d d = null;
/*  8650 */         float f = 3600.0F;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  8657 */         for (d d1 : ab.g) {
/*       */           
/*  8659 */           bool4 = true;
/*       */           
/*  8661 */           if (d1.a == null || d1.a.c() == null) {
/*       */             continue;
/*       */           }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*  8671 */           if (f.c(d1.e - paramFloat1) > 10.0F || f.c(d1.f - paramFloat2) > 10.0F) {
/*       */             continue;
/*       */           }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*  8681 */           if (d1.g + 180 < l.bg) {
/*       */             continue;
/*       */           }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*  8690 */           if (d1.h != h()) {
/*       */             continue;
/*       */           }
/*       */ 
/*       */ 
/*       */           
/*  8696 */           float f1 = f.a(this.dH, this.dI, d1.c, d1.d);
/*       */           
/*  8698 */           if (f1 < f) {
/*       */             
/*  8700 */             f1 = f;
/*  8701 */             d = d1;
/*       */           } 
/*       */         } 
/*       */ 
/*       */         
/*  8706 */         if (d != null) {
/*       */ 
/*       */           
/*  8709 */           this.aI = d.a;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*       */           return;
/*       */         } 
/*       */       } 
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  8738 */     boolean bool5 = true;
/*       */     
/*  8740 */     this.aI = a(paramFloat1, paramFloat2, paramInt, paramBoolean1, bool5, paramBoolean2); }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp g a(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*  8747 */     l l = l.u();
/*  8748 */     h h1 = l.bC;
/*  8749 */     b b = l.bt;
/*       */     
/*  8751 */     g g1 = h1.a(paramBoolean2);
/*  8752 */     b.a(this.dH, this.dI);
/*       */     
/*  8754 */     boolean bool = false;
/*  8755 */     if (aW() || this.bN)
/*       */     {
/*  8757 */       bool = true;
/*       */     }
/*       */     
/*  8760 */     g1.a(h(), (short)b.M, (short)b.N, Float.valueOf(this.bL), bool);
/*  8761 */     b.a(paramFloat1, paramFloat2);
/*  8762 */     g1.a((short)b.M, (short)b.N, (short)paramInt);
/*  8763 */     g1.l = paramBoolean1;
/*  8764 */     g1.m = bc();
/*  8765 */     g1.n = paramBoolean3;
/*       */ 
/*       */     
/*  8768 */     boolean bool1 = this.cm;
/*  8769 */     this.cm = true;
/*       */     
/*  8771 */     h1.a(g1, paramBoolean2);
/*       */     
/*  8773 */     this.cm = bool1;
/*       */     
/*  8775 */     return g1;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   strictfp void b(l paraml) {
/*  8781 */     if (this.aI != null) {
/*       */       
/*  8783 */       b b = paraml.bt;
/*       */       
/*  8785 */       LinkedList linkedList = this.aI.c();
/*       */       
/*  8787 */       if (linkedList != null) {
/*       */         
/*  8789 */         g g1 = this.aI;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  8811 */         this.am = 0;
/*  8812 */         this.t = false;
/*       */ 
/*       */ 
/*       */         
/*  8816 */         for (l l1 : linkedList) {
/*       */           
/*  8818 */           b.a(l1.a, l1.b);
/*  8819 */           float f1 = (b.M + b.m);
/*  8820 */           float f2 = (b.N + b.n);
/*       */           
/*  8822 */           a(this.am, f1, f2);
/*       */           
/*  8824 */           this.am++;
/*       */           
/*  8826 */           if (this.am >= 120) {
/*       */             
/*  8828 */             this.t = true;
/*       */             
/*       */             break;
/*       */           } 
/*       */         } 
/*  8833 */         if (this.am == 1)
/*       */         {
/*  8835 */           this.p = (byte)(this.p + 1);
/*       */         }
/*       */         
/*  8838 */         boolean bool1 = true;
/*       */         
/*  8840 */         boolean bool2 = false;
/*       */         
/*  8842 */         if (linkedList.size() != 0) {
/*       */           
/*  8844 */           b.a(this.n, this.o);
/*  8845 */           if (!this.t && ((l)linkedList.getLast()).a == b.M && ((l)linkedList.getLast()).b == b.N)
/*       */           {
/*  8847 */             bool2 = true;
/*       */           }
/*       */         } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  8856 */         if (bool2)
/*       */         {
/*       */ 
/*       */ 
/*       */           
/*  8861 */           if (!bool1) {
/*       */             
/*  8863 */             if (this.am < 120)
/*       */             {
/*  8865 */               a(this.am, this.n, this.o);
/*  8866 */               this.am++;
/*       */             }
/*       */           
/*       */           } else {
/*       */             
/*  8871 */             if (this.am == 0)
/*       */             {
/*  8873 */               this.am++;
/*       */             }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */             
/*  8896 */             a(this.am - 1, this.n, this.o);
/*       */           } 
/*       */         }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  8948 */         this.aI = null;
/*       */ 
/*       */ 
/*       */         
/*  8952 */         if (this.am > 120) {
/*       */           
/*  8954 */           l.b("activePathCount>maxPathNodes: activePathCount:" + this.am);
/*  8955 */           this.am = 120;
/*       */         } 
/*       */         
/*  8958 */         this.u = this.am;
/*       */       } 
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp long aI() {
/*  8967 */     long l = 0L;
/*  8968 */     for (byte b = 0; b < this.am; b++) {
/*       */       
/*  8970 */       y y1 = this.al[b];
/*  8971 */       if (y1 != null) {
/*       */         
/*  8973 */         l += Float.floatToRawIntBits(y1.a);
/*  8974 */         l += Float.floatToRawIntBits(y1.b);
/*       */       } 
/*       */     } 
/*  8977 */     return l;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   strictfp y o(int paramInt) {
/*  8983 */     if (paramInt >= this.am)
/*       */     {
/*  8985 */       return null;
/*       */     }
/*  8987 */     return this.al[paramInt];
/*       */   }
/*       */   
/*  8990 */   public static final y aJ = new y();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void d(float paramFloat) {
/*  9019 */     super.d(paramFloat);
/*       */   }
/*       */   
/*  9022 */   protected static PorterDuffColorFilter aK = new PorterDuffColorFilter(Color.a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
/*       */ 
/*       */   
/*  9025 */   protected static PorterDuffColorFilter aL = new PorterDuffColorFilter(Color.a(70, 255, 70), PorterDuff.Mode.MULTIPLY);
/*  9026 */   protected static PorterDuffColorFilter aM = new PorterDuffColorFilter(Color.a(255, 40, 40), PorterDuff.Mode.MULTIPLY);
/*       */   
/*  9028 */   protected static PorterDuffColorFilter aN = new PorterDuffColorFilter(Color.a(120, 120, 255), PorterDuff.Mode.MULTIPLY);
/*       */ 
/*       */   
/*  9031 */   protected static Paint aO = (Paint)y.b();
/*  9032 */   protected static Paint aP = (Paint)y.b();
/*  9033 */   protected static Paint aQ = (Paint)y.b();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float aJ() {
/*  9088 */     return 1.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int l(float paramFloat) {
/*  9094 */     if (paramFloat < -0.3F) {
/*       */       
/*  9096 */       int k = (int)((1.0F - -paramFloat / 10.0F) * 130.0F + 45.0F);
/*  9097 */       if (k < 45)
/*       */       {
/*  9099 */         k = 45;
/*       */       }
/*  9101 */       return k;
/*       */     } 
/*       */ 
/*       */     
/*  9105 */     return 255;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp Paint aK() {
/*  9113 */     l l = l.u();
/*       */     
/*  9115 */     PorterDuffColorFilter porterDuffColorFilter = null;
/*  9116 */     int k = -1;
/*       */     
/*  9118 */     if (this.dJ < -0.3F) {
/*       */       
/*  9120 */       int n = l(this.dJ);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9130 */       k = Color.a(n, 255, 255, 255);
/*       */     }
/*       */     else {
/*       */       
/*  9134 */       k = -1;
/*       */     } 
/*       */     
/*  9137 */     if (this.bR < 1.0F && this.bR < aJ()) {
/*       */       
/*  9139 */       float f = this.bR / aJ() * 220.0F;
/*       */       
/*  9141 */       k = Color.a((int)(20.0F + f), 140, 255, 140);
/*       */       
/*  9143 */       porterDuffColorFilter = aK;
/*       */     } 
/*       */     
/*  9146 */     if (this.bT) {
/*       */ 
/*       */       
/*  9149 */       if (this.bW) {
/*       */         
/*  9151 */         k = Color.a(200, 20, 255, 20);
/*  9152 */         porterDuffColorFilter = aL;
/*       */       } 
/*       */       
/*  9155 */       if (this.bX) {
/*       */         
/*  9157 */         k = Color.a(200, 255, 20, 20);
/*  9158 */         porterDuffColorFilter = aM;
/*       */       } 
/*       */       
/*  9161 */       if (this.bU) {
/*       */         
/*  9163 */         k = Color.a(50, 70, 70, 245);
/*  9164 */         porterDuffColorFilter = aN;
/*       */         
/*  9166 */         if (this.bX) {
/*       */           
/*  9168 */           k = Color.a(50, 255, 20, 20);
/*  9169 */           porterDuffColorFilter = aM;
/*       */         } 
/*       */       } 
/*       */ 
/*       */       
/*  9174 */       if (this.bV)
/*       */       {
/*  9176 */         k = Color.a(150, 100, 100, 100);
/*       */       }
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9182 */     boolean bool = l.by.renderAntiAlias;
/*       */ 
/*       */     
/*  9185 */     if (!cS()) {
/*       */       
/*  9187 */       bool = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9193 */       if (l.cE < 1.0F)
/*       */       {
/*  9195 */         bool = true;
/*       */       }
/*       */     } 
/*       */     
/*  9199 */     if (this.bS)
/*       */     {
/*  9201 */       bool = ak.af;
/*       */     }
/*       */ 
/*       */     
/*  9205 */     return a(k, (ColorFilter)porterDuffColorFilter, bool);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float p(int paramInt) {
/*  9213 */     return 1.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean c(float paramFloat) {
/*  9223 */     l l = l.u();
/*  9224 */     l l1 = l.bw;
/*       */     
/*  9226 */     Paint paint = aK();
/*       */     
/*  9228 */     float f = cn();
/*       */ 
/*       */     
/*  9231 */     if (this.dP) {
/*       */       
/*  9233 */       PointF pointF = cG();
/*       */       
/*  9235 */       float f1 = this.dH + pointF.a - l.cd;
/*  9236 */       float f2 = this.dI + pointF.b - l.ce - this.dJ;
/*       */ 
/*       */ 
/*       */       
/*  9240 */       aM();
/*       */       
/*  9242 */       if (f != 1.0F) {
/*       */         
/*  9244 */         l1.j();
/*  9245 */         l1.a(f, f, f1, f2);
/*       */       } 
/*       */       
/*  9248 */       l1.a(this.D, f1, f2, f(false) - 90.0F, paint);
/*       */ 
/*       */       
/*  9251 */       if (f != 1.0F)
/*       */       {
/*  9253 */         l1.k();
/*       */       
/*       */       }
/*       */     
/*       */     }
/*       */     else {
/*       */       
/*  9260 */       PointF pointF = cG();
/*       */       
/*  9262 */       RectF rectF = cp();
/*  9263 */       rectF.a(pointF.a, pointF.b - this.dJ);
/*       */       
/*  9265 */       Rect rect = a_(false);
/*       */       
/*  9267 */       float f1 = rectF.d();
/*  9268 */       float f2 = rectF.e();
/*       */ 
/*       */       
/*  9271 */       l1.j();
/*       */ 
/*       */       
/*  9274 */       aM();
/*       */ 
/*       */       
/*  9277 */       if (f != 1.0F)
/*       */       {
/*  9279 */         l1.a(f, f, f1, f2);
/*       */       }
/*       */       
/*  9282 */       l1.a(f(false), f1, f2);
/*       */       
/*  9284 */       l1.a(this.D, rect, rectF, paint);
/*  9285 */       l1.k();
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9290 */     return true;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean F() {
/*  9534 */     return (this.dJ > 0.0F && this.bR >= 1.0F && !this.bU);
/*       */   }
/*       */ 
/*       */   
/*  9538 */   static final PointF aR = new PointF();
/*       */   
/*       */   public strictfp PointF aL() {
/*  9541 */     aR.a(G(), H());
/*  9542 */     return aR;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float G() {
/*  9547 */     return 0.0F;
/*       */   }
/*       */   
/*       */   public strictfp float H() {
/*  9551 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean aM() {
/*  9556 */     if (this.E != null && F()) {
/*       */       
/*  9558 */       l l = l.u();
/*       */ 
/*       */       
/*  9561 */       if (!l.cL)
/*       */       {
/*  9563 */         if (this.bO < 18.0F && this.dJ < 0.5D)
/*       */         {
/*       */           
/*  9566 */           return true;
/*       */         }
/*       */       }
/*  9569 */       if (!l.cM)
/*       */       {
/*  9571 */         if (this.bO < 28.0F && this.dJ < 5.0F)
/*       */         {
/*       */           
/*  9574 */           return true;
/*       */         }
/*       */       }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9589 */       PointF pointF = aL();
/*       */       
/*  9591 */       float f1 = this.dH + pointF.a - l.cd;
/*  9592 */       float f2 = this.dI + pointF.b - l.ce;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9610 */       float f3 = cn();
/*       */       
/*  9612 */       l l1 = l.bw;
/*       */       
/*  9614 */       if (f3 != 1.0F) {
/*       */         
/*  9616 */         l1.j();
/*  9617 */         l1.a(f3, f3, f1, f2);
/*       */       } 
/*       */ 
/*       */       
/*  9621 */       if (cq()) {
/*       */         
/*  9623 */         Rect rect = a_(true);
/*       */         
/*  9625 */         RectF rectF = dd;
/*       */         
/*  9627 */         rectF.a(f1 - this.dN, f2 - this.dO, f1 + this.dN, f2 + this.dO);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  9634 */         l1.j();
/*  9635 */         l1.a(f(true), f1, f2);
/*       */         
/*  9637 */         l1.a(this.E, rect, rectF, (Paint)au);
/*       */ 
/*       */         
/*  9640 */         l1.k();
/*       */ 
/*       */       
/*       */       }
/*       */       else {
/*       */ 
/*       */         
/*  9647 */         l1.a(this.E, f1, f2, f(true) - 90.0F, (Paint)au);
/*       */       } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9655 */       if (f3 != 1.0F)
/*       */       {
/*  9657 */         l1.k();
/*       */       }
/*       */ 
/*       */ 
/*       */       
/*  9662 */       return true;
/*       */     } 
/*       */     
/*  9665 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean j() {
/*  9672 */     l l = l.u();
/*       */ 
/*       */ 
/*       */     
/*  9676 */     return RectF.a(l.ct, co());
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean aN() {
/*  9690 */     i i1 = cV();
/*  9691 */     if (i1 != null)
/*       */     {
/*  9693 */       if (!i1.O)
/*       */       {
/*  9695 */         return false;
/*       */       }
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  9706 */     return I();
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean aO() {
/*  9711 */     return aN();
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean x() {
/*  9716 */     return true;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp int aP() {
/*  9721 */     return -1;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float l(af paramaf) {
/*  9727 */     if (aR() && paramaf != null)
/*       */     {
/*  9729 */       return m() + this.bO + paramaf.bO;
/*       */     }
/*       */ 
/*       */     
/*  9733 */     return m();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float m(af paramaf) {
/*  9741 */     if (aR() && paramaf != null)
/*       */     {
/*  9743 */       return aQ() + this.bO + paramaf.bO;
/*       */     }
/*       */ 
/*       */     
/*  9747 */     return aQ();
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float aQ() {
/*  9753 */     return m();
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int n(af paramaf) {
/*  9759 */     l l = l.u();
/*       */ 
/*       */     
/*  9762 */     int k = 0;
/*       */     
/*  9764 */     float f = m(paramaf);
/*  9765 */     if (f > 58.0F)
/*       */     {
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9771 */       k = (int)((f - 41.0F) / l.bt.k * 1.414F);
/*       */     }
/*       */ 
/*       */ 
/*       */     
/*  9776 */     return k;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean aR() {
/*  9784 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float q(int paramInt) {
/*  9792 */     return 0.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp ArrayList aS() {
/*  9812 */     ArrayList<t> arrayList = new ArrayList();
/*  9813 */     if (l()) {
/*       */       
/*  9815 */       int k = bg();
/*  9816 */       for (byte b = 0; b < k; b++) {
/*       */         
/*  9818 */         float f = q(b);
/*  9819 */         if (f != 0.0F) {
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*  9824 */           float f1 = b(b);
/*       */           
/*  9826 */           if (f1 == 9000.0F)
/*       */           {
/*  9828 */             f1 = 0.0F;
/*       */           }
/*       */ 
/*       */           
/*  9832 */           boolean bool = false;
/*       */           
/*  9834 */           for (t t : arrayList) {
/*       */             
/*  9836 */             if (t.a == f && (t.b == f1 || f1 == 0.0F || t.b == 0.0F)) {
/*       */               
/*  9838 */               t.d++;
/*       */               
/*  9840 */               if (t.b == 0.0F)
/*       */               {
/*  9842 */                 t.b = f1;
/*       */               }
/*       */               
/*  9845 */               bool = true;
/*       */               break;
/*       */             } 
/*       */           } 
/*  9849 */           if (!bool) {
/*       */ 
/*       */ 
/*       */             
/*  9853 */             t t = new t();
/*  9854 */             t.a = f;
/*  9855 */             t.b = f1;
/*  9856 */             t.c = e(b);
/*       */             
/*  9858 */             arrayList.add(t);
/*       */           } 
/*       */         } 
/*       */       } 
/*       */     } 
/*  9863 */     return arrayList;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean r(int paramInt) {
/*  9870 */     return true;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float e(int paramInt) {
/*  9876 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean s(int paramInt) {
/*  9881 */     return false;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float t(int paramInt) {
/*  9886 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float f(int paramInt) {
/*  9891 */     return 4.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean u(int paramInt) {
/*  9896 */     int k = v(paramInt);
/*  9897 */     if (k == -1)
/*       */     {
/*  9899 */       return (this.cn[paramInt]).g;
/*       */     }
/*       */ 
/*       */     
/*  9903 */     return (this.cn[k]).g;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int v(int paramInt) {
/*  9909 */     return -1;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float B() {
/*  9921 */     return -1.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float w(int paramInt) {
/*  9928 */     return -1.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float x(int paramInt) {
/*  9933 */     return 5.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float y(int paramInt) {
/*  9939 */     return w(paramInt);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean E() {
/*  9950 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean aT() {
/*  9961 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float aU() {
/*  9968 */     return 1.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float aV() {
/*  9973 */     return 1.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean aW() {
/*  9978 */     return (aX() > 0.95F);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float aX() {
/*  9983 */     return 0.6F;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float aY() {
/*  9989 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp b aZ() {
/*  9994 */     return b.a;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean ba() {
/*  9999 */     return true;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean bb() {
/* 10004 */     return true;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int bc() {
/* 10022 */     return 0;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float C() {
/* 10028 */     return 99.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float D() {
/* 10033 */     return 99.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean bd() {
/* 10038 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean be() {
/* 10044 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean b(int paramInt, float paramFloat) {
/* 10051 */     return true;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean bf() {
/* 10061 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int bg() {
/* 10072 */     return 1;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean bh() {
/* 10077 */     return true;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float g(int paramInt) {
/* 10082 */     return 0.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float z(int paramInt) {
/* 10092 */     return 99999.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float A(int paramInt) {
/* 10097 */     return -1.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float B(int paramInt) {
/* 10102 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float C(int paramInt) {
/* 10107 */     if (this.bN && aW())
/*       */     {
/* 10109 */       return this.bL + 180.0F;
/*       */     }
/*       */     
/* 10112 */     return this.bL;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp ag bi() {
/* 10118 */     int k = aP();
/* 10119 */     if (k == -1)
/*       */     {
/* 10121 */       return D(0);
/*       */     }
/*       */ 
/*       */     
/* 10125 */     return D(k);
/*       */   }
/*       */ 
/*       */   
/* 10129 */   protected static final ag aS = new ag();
/*       */   
/*       */   public strictfp ag D(int paramInt) {
/* 10132 */     aS.a(E(paramInt));
/* 10133 */     return aS;
/*       */   }
/*       */   
/* 10136 */   protected static final PointF aT = new PointF();
/*       */   
/*       */   public strictfp PointF E(int paramInt) {
/* 10139 */     ai ai = this.cn[paramInt];
/*       */     
/* 10141 */     float f1 = g(paramInt);
/* 10142 */     float f2 = E() ? this.bL : ai.a;
/*       */     
/* 10144 */     PointF pointF = F(paramInt);
/*       */     
/* 10146 */     float f3 = pointF.a + f.i(f2) * f1;
/* 10147 */     float f4 = pointF.b + f.h(f2) * f1;
/*       */     
/* 10149 */     aT.a(f3, f4);
/* 10150 */     return aT;
/*       */   }
/*       */   
/* 10153 */   protected static final PointF aU = new PointF();
/*       */   
/*       */   public strictfp PointF F(int paramInt) {
/* 10156 */     ai ai = this.cn[paramInt];
/*       */     
/* 10158 */     float f1 = this.dH;
/* 10159 */     float f2 = this.dI;
/*       */     
/* 10161 */     float f3 = G(paramInt);
/*       */     
/* 10163 */     if (ai.e != 0.0F && f3 != 0.0F) {
/*       */       
/* 10165 */       float f4 = H(paramInt);
/* 10166 */       float f5 = I(paramInt);
/*       */       
/* 10168 */       float f6 = 0.0F;
/* 10169 */       float f7 = b(paramInt) - ai.e;
/*       */ 
/*       */       
/* 10172 */       if (f7 < f4) {
/*       */         
/* 10174 */         f6 = f7 / f4 * f3;
/*       */       }
/* 10176 */       else if (f7 < f5 + f4) {
/*       */         
/* 10178 */         f6 = f3 - (f7 - f4) / f5 * f3;
/*       */       } 
/* 10180 */       if (f6 != 0.0F) {
/*       */         
/* 10182 */         f1 += f.i(ai.a) * f6;
/* 10183 */         f2 += f.h(ai.a) * f6;
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/* 10189 */     aU.a(f1, f2);
/* 10190 */     return aU;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float G(int paramInt) {
/* 10195 */     return 0.0F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float H(int paramInt) {
/* 10200 */     return 4.0F;
/*       */   }
/*       */   
/*       */   public strictfp float I(int paramInt) {
/* 10204 */     return 6.0F;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/* 10209 */   protected static final PointF aV = new PointF();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp PointF J(int paramInt) {
/* 10225 */     PointF pointF = aV;
/*       */     
/* 10227 */     pointF.a(0.0F, 0.0F);
/*       */     
/* 10229 */     ai ai = this.cn[paramInt];
/*       */     
/* 10231 */     pointF.a += ai.h;
/* 10232 */     pointF.b += ai.i;
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10237 */     return pointF;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp float K(int paramInt) {
/* 10243 */     return 0.6F;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void L(int paramInt) {
/* 10248 */     if (paramInt == -1) {
/*       */       
/* 10250 */       int k = bg();
/* 10251 */       for (byte b = 0; b < k; b++)
/*       */       {
/* 10253 */         L(b);
/*       */       }
/*       */       
/*       */       return;
/*       */     } 
/* 10258 */     ai ai = this.cn[paramInt];
/*       */     
/* 10260 */     ai.h = 0.0F;
/* 10261 */     ai.i = 0.0F;
/*       */     
/* 10263 */     if (this.I != null)
/*       */     {
/* 10265 */       if (K(paramInt) != 0.0F) {
/*       */         
/* 10267 */         float f = this.I.bO * K(paramInt);
/*       */         
/* 10269 */         ai.h += f.a((w)this, (int)-f, (int)f, 1 + paramInt);
/* 10270 */         ai.i += f.a((w)this, (int)-f, (int)f, 2 + paramInt);
/*       */       } 
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(u paramu) {
/* 10290 */     a(paramu, true);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void a(u paramu, boolean paramBoolean) {
/* 10295 */     l l = l.u();
/*       */     
/* 10297 */     if (paramu == u.h) {
/*       */       
/* 10299 */       l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*       */       
/* 10301 */       l.bz.a(this.dH, this.dI, this.dJ);
/*       */ 
/*       */       
/* 10304 */       l.bz.b(h.e);
/* 10305 */       e e1 = l.bz.c(this.dH, this.dI, this.dJ, -1127220);
/* 10306 */       if (e1 != null)
/*       */       {
/* 10308 */         e1.H = 0.2F;
/* 10309 */         e1.G = 2.0F;
/* 10310 */         e1.aq = 2;
/* 10311 */         e1.W = 45.0F;
/* 10312 */         e1.X = e1.W;
/*       */         
/* 10314 */         e1.V = 0.0F;
/*       */ 
/*       */ 
/*       */       
/*       */       }
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     }
/* 10324 */     else if (paramu == u.d || paramu == u.f || paramu == u.g) {
/*       */       
/* 10326 */       l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*       */       
/* 10328 */       l.bz.a(this.dH, this.dI, this.dJ);
/*       */     }
/* 10330 */     else if (paramu == u.a) {
/*       */       
/* 10332 */       float f = 1.0F + f.c(-0.07F, 0.07F);
/*       */       
/* 10334 */       l.bu.a(e.n, 0.4F, f, this.dH, this.dI);
/*       */       
/* 10336 */       l.bz.b(this.dH, this.dI, this.dJ);
/*       */ 
/*       */ 
/*       */     
/*       */     }
/* 10341 */     else if (paramu == u.e) {
/*       */       
/* 10343 */       float f = 1.0F + f.c(-0.07F, 0.07F);
/*       */       
/* 10345 */       l.bu.a(e.n, 0.8F, f, this.dH, this.dI);
/*       */       
/* 10347 */       l.bz.b(this.dH, this.dI, this.dJ);
/*       */ 
/*       */ 
/*       */       
/* 10351 */       l.bz.b(h.e);
/* 10352 */       e e1 = l.bz.c(this.dH, this.dI, this.dJ, -1127220);
/* 10353 */       if (e1 != null)
/*       */       {
/* 10355 */         e1.H = 0.2F;
/* 10356 */         e1.G = 2.0F;
/* 10357 */         e1.aq = 2;
/* 10358 */         e1.W = 45.0F;
/* 10359 */         e1.X = e1.W;
/*       */         
/* 10361 */         e1.V = 0.0F;
/*       */       }
/*       */     
/*       */     }
/*       */     else {
/*       */       
/* 10367 */       float f = 1.0F + f.c(-0.07F, 0.07F);
/*       */       
/* 10369 */       l.bu.a(e.n, 0.8F, f, this.dH, this.dI);
/*       */       
/* 10371 */       l.bz.b(this.dH, this.dI, this.dJ);
/*       */     } 
/*       */     
/* 10374 */     if (paramu != u.a) {
/*       */       
/* 10376 */       if (paramu != u.g) {
/*       */         
/* 10378 */         e e1 = l.bz.d(this.dH, this.dI, this.dJ, 0);
/* 10379 */         if (e1 != null)
/*       */         {
/* 10381 */           e1.F = 0.9F;
/*       */         }
/*       */       } 
/*       */       
/* 10385 */       if (paramBoolean) {
/*       */         
/* 10387 */         if (!bC())
/*       */         {
/* 10389 */           bj();
/*       */         }
/*       */         
/* 10392 */         if (paramu != u.g)
/*       */         {
/* 10394 */           if (!cu()) {
/*       */             
/* 10396 */             f.a(this.dH, this.dI);
/*       */             
/* 10398 */             f.b(this.dH, this.dI);
/*       */             
/* 10400 */             bl();
/*       */           } 
/*       */         }
/*       */       } 
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void bj() {
/* 10412 */     l l = l.u();
/*       */     
/* 10414 */     float f1 = 1.0F;
/* 10415 */     float f2 = 1.0F;
/*       */     
/* 10417 */     int k = bk();
/*       */     
/* 10419 */     if (k >= 10) {
/*       */       
/* 10421 */       f1 = 1.2F;
/* 10422 */       f2 = 1.4F;
/*       */     } 
/*       */     
/* 10425 */     if (k >= 20) {
/*       */       
/* 10427 */       f1 = 1.5F;
/* 10428 */       f2 = 1.7F;
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10438 */     if (this.dJ > -1.0F)
/*       */     {
/* 10440 */       for (byte b = 0; b < k; b++)
/*       */       {
/* 10442 */         l.bz.b(this.dH, this.dI, this.dJ, f1, f2);
/*       */       }
/*       */     }
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp int bk() {
/* 10449 */     if (cL())
/*       */     {
/* 10451 */       return 8;
/*       */     }
/*       */     
/* 10454 */     if (bw())
/*       */     {
/* 10456 */       return 7;
/*       */     }
/*       */     
/* 10459 */     return 4;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void bl() {
/* 10464 */     if (!cu())
/*       */     {
/* 10466 */       k.a(this.dH, this.dI);
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int s() {
/* 10474 */     return 15;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void c(boolean paramBoolean) {
/* 10481 */     l l = l.u();
/*       */     
/* 10483 */     if (this.cp != null || this.cq != null) {
/*       */       return;
/*       */     }
/*       */ 
/*       */     
/* 10488 */     int k = s();
/* 10489 */     if (k > 0)
/*       */     {
/* 10491 */       l.bt.a(this.dH, this.dI, k, this.bB, paramBoolean);
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void bm() {
/* 10506 */     l l = l.u();
/*       */     
/* 10508 */     RectF rectF = new RectF();
/* 10509 */     rectF.a(bP());
/*       */     
/* 10511 */     rectF.b *= l.bt.l;
/* 10512 */     rectF.d *= l.bt.l;
/*       */     
/* 10514 */     rectF.a *= l.bt.k;
/* 10515 */     rectF.c *= l.bt.k;
/*       */     
/* 10517 */     rectF.a(this.dH, this.dI);
/*       */ 
/*       */ 
/*       */     
/* 10521 */     rectF.a(-cH(), -cI());
/*       */ 
/*       */ 
/*       */     
/* 10525 */     float f = 10.0F;
/*       */     
/* 10527 */     rectF.b -= f;
/* 10528 */     rectF.d += f;
/*       */     
/* 10530 */     rectF.a -= f;
/* 10531 */     rectF.c += f;
/*       */ 
/*       */     
/* 10534 */     o o = af.bt();
/*       */     
/* 10536 */     for (af af1 : o) {
/*       */       
/* 10538 */       if (af1 instanceof af) {
/*       */         
/* 10540 */         af af2 = af1;
/* 10541 */         if (af2 != this && af2.a(rectF)) {
/*       */           
/* 10543 */           if (af2 instanceof r)
/*       */           {
/* 10545 */             if (af2.bz)
/*       */             {
/* 10547 */               af2.a();
/*       */             }
/*       */           }
/* 10550 */           if (af2 instanceof ae)
/*       */           {
/* 10552 */             ((ae)af2).f();
/*       */           }
/*       */         } 
/*       */       } 
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean bn() {
/* 10574 */     return (e(false) == null);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean d(boolean paramBoolean) {
/* 10579 */     return (e(paramBoolean) == null);
/*       */   }
/*       */   
/* 10582 */   static final Point aW = new Point();
/*       */   
/*       */   public strictfp String e(boolean paramBoolean) {
/* 10585 */     l l = l.u();
/*       */ 
/*       */ 
/*       */     
/* 10589 */     aj aj = r().q();
/* 10590 */     if (aj != null) {
/*       */       
/* 10592 */       String str = aj.a(this, this.dH, this.dI);
/* 10593 */       if (str != null)
/*       */       {
/*       */ 
/*       */         
/* 10597 */         return str;
/*       */       }
/*       */     } 
/*       */     
/* 10601 */     if (r().p()) {
/*       */       
/* 10603 */       l.bt.a(this.dH, this.dI);
/* 10604 */       g g1 = l.bt.e(l.bt.M, l.bt.N);
/* 10605 */       if (g1 == null || !g1.i)
/*       */       {
/*       */         
/* 10608 */         return "{2}";
/*       */       }
/*       */     } 
/*       */     
/* 10612 */     if (!paramBoolean)
/*       */     {
/* 10614 */       if (p((af)null))
/*       */       {
/*       */         
/* 10617 */         return "{0}";
/*       */       }
/*       */     }
/*       */     
/* 10621 */     if (!r().p()) {
/*       */ 
/*       */       
/* 10624 */       Rect rect = bP();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/* 10630 */       Point point = a(l.bt, aW);
/* 10631 */       int k = point.a;
/* 10632 */       int n = point.b;
/*       */       
/* 10634 */       al al = r();
/* 10635 */       ah ah = al.o();
/*       */       
/* 10637 */       for (int i1 = k + rect.a; i1 <= k + rect.c; i1++) {
/*       */         
/* 10639 */         for (int i2 = n + rect.b; i2 <= n + rect.d; i2++) {
/*       */           
/* 10641 */           String str = c.b(this, al, ah, i1, i2, false);
/*       */           
/* 10643 */           if (str != null)
/*       */           {
/*       */ 
/*       */             
/* 10647 */             return str;
/*       */           }
/*       */         } 
/*       */       } 
/*       */     } 
/*       */ 
/*       */     
/* 10654 */     return null;
/*       */   }
/*       */ 
/*       */   
/* 10658 */   static final Point aX = new Point();
/*       */ 
/*       */   
/*       */   public strictfp void M(int paramInt) {
/* 10662 */     l l = l.u();
/*       */     
/* 10664 */     if (!r().p()) {
/*       */ 
/*       */       
/* 10667 */       Rect rect = bP();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/* 10673 */       Point point = a(l.bt, aX);
/* 10674 */       int k = point.a;
/* 10675 */       int n = point.b;
/*       */ 
/*       */       
/* 10678 */       al al = r();
/*       */ 
/*       */       
/* 10681 */       int i1 = k + rect.a;
/* 10682 */       int i2 = n + rect.b;
/*       */ 
/*       */       
/* 10685 */       int i3 = k + rect.c;
/* 10686 */       int i4 = n + rect.d;
/*       */ 
/*       */ 
/*       */ 
/*       */       
/* 10691 */       if (paramInt != -2)
/*       */       {
/* 10693 */         l.bt.a(this, i1, i2, i3, i4, (int)l.cd, (int)l.ce, l.bw, true, paramInt);
/*       */       }
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean o(af paramaf) {
/* 10718 */     float f1 = f.a(this.dH, this.dI, paramaf.dH, paramaf.dI);
/*       */     
/* 10720 */     float f2 = 9.0F;
/*       */     
/* 10722 */     if (!paramaf.bw()) {
/*       */       
/* 10724 */       f2 = this.bO + paramaf.bO;
/* 10725 */       if (f2 < 11.0F)
/*       */       {
/* 10727 */         f2 = 11.0F;
/*       */       }
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/* 10733 */     if (f1 < f2 * f2)
/*       */     {
/* 10735 */       return true;
/*       */     }
/*       */     
/* 10738 */     return false;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean p(af paramaf) {
/* 10743 */     boolean bool = false;
/*       */ 
/*       */ 
/*       */     
/* 10747 */     if (!bw())
/*       */     {
/* 10749 */       bool = true;
/*       */     }
/*       */     
/* 10752 */     af[] arrayOfAf = af.bj.a(); byte b; int k;
/* 10753 */     for (b = 0, k = af.bj.size(); b < k; b++) {
/*       */       
/* 10755 */       af af1 = arrayOfAf[b];
/*       */       
/* 10757 */       if (af1 != this)
/*       */       {
/*       */         
/* 10760 */         if (bool || af1.bw())
/*       */         {
/* 10762 */           if (!af1.bz)
/*       */           {
/* 10764 */             if (o(af1))
/*       */             {
/* 10766 */               if (af1 != paramaf)
/*       */               {
/* 10768 */                 return true;
/*       */               }
/*       */             }
/*       */           }
/*       */         }
/*       */       }
/*       */     } 
/* 10775 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp r bo() {
/* 10783 */     for (af af1 : af.bj) {
/*       */       
/* 10785 */       if (af1 != this)
/*       */       {
/* 10787 */         if (af1 instanceof r) {
/*       */           
/* 10789 */           r r1 = (r)af1;
/*       */           
/* 10791 */           if (!r1.bz)
/*       */           {
/* 10793 */             if (r1.bB == this.bB)
/*       */             {
/* 10795 */               if (r1.r() == r())
/*       */               {
/* 10797 */                 if (r(r1))
/*       */                 {
/* 10799 */                   return r1;
/*       */                 }
/*       */               }
/*       */             }
/*       */           }
/*       */         } 
/*       */       }
/*       */     } 
/*       */     
/* 10808 */     return null;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a() {
/* 10814 */     if (this.cq != null)
/*       */     {
/* 10816 */       bs();
/*       */     }
/*       */     
/* 10819 */     ax();
/* 10820 */     aF();
/*       */     
/* 10822 */     super.a();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void bp() {
/* 10830 */     if (this.cq != null)
/*       */     {
/* 10832 */       bs();
/*       */     }
/*       */ 
/*       */     
/* 10836 */     a((r)null);
/* 10837 */     this.I = null;
/* 10838 */     ax();
/*       */     
/* 10840 */     aF();
/*       */     
/* 10842 */     super.bp();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void bq() {
/* 10850 */     super.bq();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int br() {
/* 10857 */     int k = 0;
/* 10858 */     k = k * 31 + super.br();
/* 10859 */     k = k * 31 + (int)(z() * 100.0F);
/* 10860 */     k = k * 31 + (int)(A() * 100.0F);
/* 10861 */     k = k * 31 + (int)(m() * 100.0F);
/* 10862 */     k = k * 31 + (int)b(0);
/* 10863 */     k = k * 31 + (int)(C() * 100.0F);
/* 10864 */     return k;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   strictfp PointF m(float paramFloat) {
/* 10871 */     PointF pointF = n(paramFloat);
/*       */     
/* 10873 */     dg.a(this.dH + pointF.a, this.dI + pointF.b);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10879 */     return dg;
/*       */   }
/*       */   
/* 10882 */   static final PointF aY = new PointF();
/*       */ 
/*       */   
/*       */   public strictfp PointF n(float paramFloat) {
/* 10886 */     float f1 = 0.0F;
/* 10887 */     float f2 = 0.0F;
/*       */ 
/*       */     
/* 10890 */     if (I() && this.b == 0.0F)
/*       */     {
/*       */       
/* 10893 */       if (bd()) {
/*       */         
/* 10895 */         f1 = this.bH * paramFloat;
/* 10896 */         f2 = this.bI * paramFloat;
/*       */ 
/*       */       
/*       */       }
/* 10900 */       else if (this.bK != 0.0F) {
/*       */         
/* 10902 */         float f3 = this.bL;
/*       */         
/* 10904 */         if (be())
/*       */         {
/* 10906 */           f3 = this.bM;
/*       */         }
/* 10908 */         float f4 = z() * this.bK * paramFloat;
/*       */         
/* 10910 */         f1 = f.i(f3) * f4;
/* 10911 */         f2 = f.h(f3) * f4;
/*       */       } 
/*       */     }
/*       */ 
/*       */ 
/*       */     
/* 10917 */     aY.a(f1, f2);
/* 10918 */     return aY;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean a(z paramz) {
/* 10944 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(s params) {}
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean a(s params, float paramFloat1, float paramFloat2) {
/* 10956 */     return true;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(af paramaf, float paramFloat, int paramInt) {
/* 10963 */     this.L = f.a(this.L, paramFloat);
/* 10964 */     if (this.L == 0.0F) {
/*       */       
/* 10966 */       this.L = 5.0F;
/*       */       
/* 10968 */       if (j()) {
/*       */         
/* 10970 */         ag ag1 = bi();
/*       */         
/* 10972 */         l l = l.u();
/*       */         
/* 10974 */         e e1 = l.bz.b(ag1.a, ag1.b, this.dJ + ag1.c, d.a, false, h.b);
/* 10975 */         if (e1 != null) {
/*       */           
/* 10977 */           float f1 = (float)(paramaf.dH + -8.0D + Math.random() * 16.0D);
/* 10978 */           float f2 = (float)(paramaf.dI + -8.0D + Math.random() * 16.0D);
/* 10979 */           float f3 = f.d(ag1.a, ag1.b, f1, f2);
/* 10980 */           e1.Q = f.i(f3) * f.c(2.0F, 4.0F);
/* 10981 */           e1.R = f.h(f3) * f.c(2.0F, 4.0F);
/* 10982 */           e1.ao = 6;
/* 10983 */           e1.W = 20.0F;
/* 10984 */           e1.X = e1.W;
/* 10985 */           e1.s = true;
/* 10986 */           e1.F = 0.8F;
/*       */ 
/*       */ 
/*       */ 
/*       */           
/* 10991 */           e1.H = 0.2F;
/* 10992 */           e1.G = 1.0F;
/*       */         } 
/*       */       } 
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void b(af paramaf, float paramFloat, int paramInt) {
/* 11005 */     this.L = f.a(this.L, paramFloat);
/* 11006 */     if (this.L == 0.0F) {
/*       */       
/* 11008 */       this.L = 5.0F;
/*       */ 
/*       */       
/* 11011 */       if (j()) {
/*       */         
/* 11013 */         PointF pointF = E(0);
/*       */ 
/*       */         
/* 11016 */         l l = l.u();
/*       */         
/* 11018 */         e e1 = l.bz.b(paramaf.dH, paramaf.dI, paramaf.dJ, d.a, false, h.b);
/* 11019 */         if (e1 != null) {
/*       */           
/* 11021 */           float f1 = (float)(pointF.a + -8.0D + Math.random() * 16.0D);
/* 11022 */           float f2 = (float)(pointF.b + -8.0D + Math.random() * 16.0D);
/* 11023 */           float f3 = f.d(paramaf.dH, paramaf.dI - paramaf.dJ, f1, f2);
/* 11024 */           e1.Q = f.i(f3) * f.c(2.0F, 4.0F);
/* 11025 */           e1.R = f.h(f3) * f.c(2.0F, 4.0F);
/* 11026 */           e1.ao = 5;
/* 11027 */           e1.W = 20.0F;
/* 11028 */           e1.X = e1.W;
/* 11029 */           e1.s = true;
/* 11030 */           e1.F = 0.8F;
/*       */ 
/*       */ 
/*       */ 
/*       */           
/* 11035 */           e1.H = 0.2F;
/* 11036 */           e1.G = 1.0F;
/*       */         } 
/*       */       } 
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11068 */   static final s aZ = new s();
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp s a(an paraman, al paramal, int paramInt, float paramFloat1, float paramFloat2) {
/* 11073 */     l l = l.u();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11094 */     s s1 = a(paramal, paramInt, false);
/*       */ 
/*       */ 
/*       */     
/* 11098 */     if (s1 == null) {
/*       */       
/* 11100 */       l.b("Unit '" + r().i() + "' can not build:" + paramal.i());
/* 11101 */       return aZ.a();
/*       */     } 
/*       */     
/* 11104 */     if (!paraman.n) {
/*       */ 
/*       */       
/* 11107 */       if (s1.h(this)) {
/*       */         
/* 11109 */         l.b("Builder '" + r().i() + "' tried to build a locked building:" + s1.K());
/* 11110 */         return aZ.a();
/*       */       } 
/*       */       
/* 11113 */       if (!s1.a(this)) {
/*       */         
/* 11115 */         l.b("Builder '" + r().i() + "' tried to build a unavailable building:" + s1.K());
/* 11116 */         return aZ.a();
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/* 11122 */     if (!paramal.k() && !s1.u())
/*       */     {
/* 11124 */       if (this.bB.s() >= this.bB.t()) {
/*       */ 
/*       */         
/* 11127 */         if (this.bB == l.bb)
/*       */         {
/* 11129 */           l.bA.a(l.bA.d.an);
/*       */         }
/*       */         
/* 11132 */         return aZ.a();
/*       */       } 
/*       */     }
/*       */ 
/*       */ 
/*       */     
/* 11138 */     af af1 = af.a(paramal);
/* 11139 */     if (af1 == null) {
/*       */       
/* 11141 */       String str = "{build is null}";
/* 11142 */       if (paraman.b != null)
/*       */       {
/* 11144 */         str = paraman.b.i();
/*       */       }
/* 11146 */       l.d("Build unit type missing: " + str);
/* 11147 */       return aZ.a();
/*       */     } 
/*       */ 
/*       */     
/* 11151 */     af af2 = c.g(paramal);
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11156 */     af2.bR = 0.0F;
/*       */ 
/*       */     
/* 11159 */     l.bt.b(paramFloat1 - af2.cH() + 1.0F, paramFloat2 - af2.cI() + 1.0F);
/*       */ 
/*       */ 
/*       */     
/* 11163 */     af2.dH = l.bt.M + af2.cH();
/* 11164 */     af2.dI = l.bt.N + af2.cI();
/*       */     
/* 11166 */     af2.d(this.bB);
/*       */     
/* 11168 */     af2.cx();
/*       */     
/* 11170 */     if (paramInt != 1 && af2 instanceof r)
/*       */     {
/* 11172 */       ((r)af2).a(paramInt);
/*       */     }
/*       */ 
/*       */     
/* 11176 */     af2.cy();
/*       */     
/* 11178 */     if (af2 instanceof r) {
/*       */       
/* 11180 */       r r1 = (r)af2;
/*       */ 
/*       */       
/* 11183 */       boolean bool = false;
/*       */       
/* 11185 */       r r2 = null;
/*       */       
/* 11187 */       if (aj()) {
/*       */         
/* 11189 */         r2 = this;
/*       */       }
/* 11191 */       else if (!this.by && !bw()) {
/*       */         
/* 11193 */         r2 = this;
/*       */       } 
/*       */       
/* 11196 */       if (r1.p(r2))
/*       */       {
/* 11198 */         bool = true;
/*       */       }
/*       */       
/* 11201 */       if (!bool)
/*       */       {
/* 11203 */         if (!r1.d(true))
/*       */         {
/* 11205 */           bool = true;
/*       */         }
/*       */       }
/*       */       
/* 11209 */       if (bool) {
/*       */         
/* 11211 */         af2.a();
/*       */         
/* 11213 */         s s3 = aZ.a();
/*       */         
/* 11215 */         r r3 = ((r)af2).bo();
/*       */         
/* 11217 */         s3.b = r3;
/* 11218 */         s3.d = s1;
/*       */         
/* 11220 */         if (r3 == null);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/* 11228 */         return s3;
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11236 */     g g1 = s1.y();
/*       */     
/* 11238 */     if (paraman.n)
/*       */     {
/*       */ 
/*       */ 
/*       */       
/* 11243 */       g1 = g.a;
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11259 */     if (!g1.a(this)) {
/*       */ 
/*       */ 
/*       */       
/* 11263 */       af2.a();
/* 11264 */       s s3 = aZ.a();
/*       */ 
/*       */       
/* 11267 */       this.H = l.bh;
/*       */       
/* 11269 */       if (this.M < 1000.0F) {
/*       */         
/* 11271 */         s3.c = true;
/*       */ 
/*       */ 
/*       */         
/* 11275 */         a a1 = a.a(this.bB, af2.dH, af2.dI);
/* 11276 */         if (a1 != null)
/*       */         {
/* 11278 */           a1.i = true;
/*       */         }
/*       */       } 
/*       */ 
/*       */ 
/*       */       
/* 11284 */       return s3;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/* 11289 */     j(af2);
/*       */ 
/*       */     
/* 11292 */     if (af2 instanceof r) {
/*       */       
/* 11294 */       r r1 = (r)af2;
/*       */       
/* 11296 */       r1.bm();
/*       */       
/* 11298 */       if (af2.bw())
/*       */       {
/* 11300 */         l.bC.a(r1);
/*       */       }
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11308 */     m.c(af2);
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11313 */     s s2 = aZ.a();
/*       */     
/* 11315 */     s2.a = af2;
/* 11316 */     s2.d = s1;
/*       */     
/* 11318 */     return s2;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean a(r paramr, i parami) {
/* 11329 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean b(r paramr) {
/* 11335 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void bs() {
/* 11341 */     if (this.cq == null) {
/*       */       return;
/*       */     }
/*       */ 
/*       */     
/* 11346 */     if (this.cq.bz);
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 11351 */     if (!this.cq.b(this)) {
/*       */       
/* 11353 */       l.b("Deattach failed, forcing deattach. Child:" + cl() + " Parent:" + this.cq.cl());
/* 11354 */       this.cq = null;
/*       */ 
/*       */       
/* 11357 */       this.cr = null;
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp i a(short paramShort) {
/* 11367 */     return null;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public static strictfp af a(r paramr, float paramFloat1, float paramFloat2, float paramFloat3, i parami) {
/* 11373 */     if (paramFloat3 <= 0.0F)
/*       */     {
/* 11375 */       return null;
/*       */     }
/*       */     
/* 11378 */     ba.f = true;
/* 11379 */     ba.g = false;
/* 11380 */     ba.e = null;
/* 11381 */     ba.d = paramFloat3 * paramFloat3;
/*       */     
/* 11383 */     ba.c = parami;
/*       */     
/* 11385 */     ba.a = paramFloat1;
/* 11386 */     ba.b = paramFloat2;
/*       */ 
/*       */     
/* 11389 */     l l = l.u();
/* 11390 */     l.bK.a(paramFloat1, paramFloat2, paramFloat3, paramr, 0.0F, ba);
/*       */ 
/*       */     
/* 11393 */     return ba.e;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 11400 */   public static final v ba = new v();
/*       */   public m bb;
/*       */   
/*       */   public abstract e d();
/*       */   
/*       */   public abstract e k();
/*       */   
/*       */   public abstract e d(int paramInt);
/*       */   
/*       */   public abstract boolean I();
/*       */   
/*       */   public abstract float m();
/*       */   
/*       */   public abstract float b(int paramInt);
/*       */   
/*       */   public abstract float A();
/*       */   
/*       */   public abstract float c(int paramInt);
/*       */   
/*       */   public abstract float z();
/*       */   
/*       */   public abstract void a(af paramaf, int paramInt);
/*       */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
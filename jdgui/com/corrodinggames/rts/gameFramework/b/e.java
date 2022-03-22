/*      */ package com.corrodinggames.rts.gameFramework.b;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.ColorFilter;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.game.units.custom.ad;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import com.corrodinggames.rts.gameFramework.w;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class e
/*      */ {
/*      */   private final c ax;
/*   26 */   public ad a = ad.defaultEffectTemplate; public w b; public boolean c; public boolean d; public boolean e; public boolean f; public int g; public static int h = 1; public static int i = 2;
/*      */   public static int j = 3;
/*      */   public static int k = 4;
/*      */   public static int l = 5;
/*      */   public static int m = 6;
/*      */   public static int n = 7;
/*      */   public boolean o;
/*      */   public boolean p;
/*      */   public boolean q;
/*      */   public h r;
/*      */   public boolean s;
/*      */   public boolean t;
/*      */   public float u;
/*      */   public boolean v;
/*      */   public boolean w;
/*      */   public float x;
/*      */   public int y;
/*      */   public int z;
/*      */   public float A;
/*      */   public short B;
/*      */   public LightingColorFilter C;
/*      */   public static LightingColorFilter D = null;
/*      */   public static int E = 0;
/*      */   public float F;
/*      */   public float G;
/*      */   public float H;
/*      */   public boolean I;
/*      */   public float J;
/*      */   public float K;
/*      */   public float L;
/*      */   public boolean M;
/*      */   public float N;
/*      */   public float O;
/*      */   
/*      */   protected e(c paramc) {
/*   61 */     this.e = true;
/*   62 */     this.f = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   80 */     this.r = h.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   87 */     this.x = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   93 */     this.A = -1.0F;
/*      */ 
/*      */ 
/*      */     
/*   97 */     this.C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  158 */     this.am = false;
/*      */ 
/*      */ 
/*      */     
/*  162 */     this.an = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  179 */     this.aq = 2;
/*      */     
/*  181 */     this.ar = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  191 */     this.as = (Paint)a();
/*      */     this.ax = paramc;
/*      */   }
/*      */   public float P; public float Q; public float R; public float S; public float T; public float U; public float V;
/*      */   public float W;
/*      */   public float X;
/*      */   public float Y;
/*      */   public float Z;
/*      */   public String aa;
/*      */   public Paint ab;
/*      */   public float ac;
/*      */   public float ad;
/*      */   public boolean ae;
/*      */   public int af;
/*      */   public int ag;
/*      */   public boolean ah;
/*      */   public boolean ai;
/*      */   public float aj;
/*  209 */   public static q[] aw = new q[128]; public float ak; public boolean al; public boolean am; public float an; static {
/*  210 */     for (byte b = 0; b < aw.length; b++) {
/*      */       
/*  212 */       aw[b] = a();
/*      */       
/*  214 */       float f = b / (aw.length - 1);
/*  215 */       aw[b].c((int)(f * 255.0F));
/*      */     } 
/*      */   }
/*      */   public int ao; public int ap; public short aq; public boolean ar; public Paint as; public float at; public int au; public boolean av;
/*      */   public static q a() {
/*      */     return y.b();
/*      */   }
/*      */   public q a(float paramFloat) {
/*  223 */     int i = (int)(paramFloat * (aw.length - 1));
/*  224 */     if (i < 0) i = 0; 
/*  225 */     if (i > aw.length - 1) i = aw.length - 1;
/*      */ 
/*      */     
/*  228 */     return aw[i];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/*  236 */     if (this.p) {
/*      */       
/*  238 */       this.p = false;
/*  239 */       this.ax.a--;
/*      */       
/*  241 */       c.h = true;
/*      */ 
/*      */       
/*  244 */       if (this.a.alsoEmitEffectsOnDeath != null)
/*      */       {
/*  246 */         if (this.B < 20) {
/*      */           
/*  248 */           float f1 = this.J;
/*  249 */           float f2 = this.K;
/*  250 */           float f3 = this.L;
/*  251 */           if (this.b != null) {
/*      */             
/*  253 */             f1 += this.b.dH;
/*  254 */             f2 += this.b.dI;
/*  255 */             f3 += this.b.dJ;
/*      */           } 
/*      */           
/*  258 */           this.a.alsoEmitEffectsOnDeath.a(f1, f2, f3, this.Y, this.b, 0, this.B);
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void c() {
/*  266 */     this.a = ad.defaultEffectTemplate;
/*      */     
/*  268 */     this.r = h.a;
/*      */     
/*  270 */     this.b = null;
/*  271 */     this.c = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  276 */     this.d = false;
/*      */     
/*  278 */     this.e = true;
/*  279 */     this.f = false;
/*      */     
/*  281 */     this.g = 0;
/*      */     
/*  283 */     this.o = false;
/*      */     
/*  285 */     this.q = false;
/*      */     
/*  287 */     this.J = 0.0F;
/*  288 */     this.K = 0.0F;
/*      */     
/*  290 */     this.M = false;
/*  291 */     this.N = 0.0F;
/*  292 */     this.O = 0.0F;
/*  293 */     this.P = 0.0F;
/*      */ 
/*      */     
/*  296 */     this.L = 0.0F;
/*      */     
/*  298 */     this.aq = 2;
/*      */     
/*  300 */     this.am = false;
/*  301 */     this.an = 0.0F;
/*      */ 
/*      */     
/*  304 */     this.ae = false;
/*      */     
/*  306 */     this.ak = 0.0F;
/*  307 */     this.aj = 0.0F;
/*  308 */     this.ag = 0;
/*      */     
/*  310 */     this.ah = false;
/*      */     
/*  312 */     this.ai = false;
/*      */     
/*  314 */     this.al = false;
/*      */ 
/*      */     
/*  317 */     this.ao = 0;
/*  318 */     this.ap = 0;
/*      */     
/*  320 */     this.V = 0.0F;
/*  321 */     this.W = 15.0F;
/*  322 */     this.X = this.W;
/*  323 */     this.s = false;
/*  324 */     this.t = false;
/*  325 */     this.u = 0.0F;
/*  326 */     this.G = 1.0F;
/*  327 */     this.H = 1.0F;
/*  328 */     this.I = false;
/*  329 */     this.v = false;
/*  330 */     this.w = false;
/*  331 */     this.x = 1.0F;
/*      */     
/*  333 */     this.F = 1.0F;
/*  334 */     this.Y = 0.0F;
/*  335 */     this.Z = 0.0F;
/*  336 */     this.Q = 0.0F;
/*  337 */     this.R = 0.0F;
/*  338 */     this.S = 0.0F;
/*      */     
/*  340 */     this.T = 0.0F;
/*  341 */     this.U = 0.0F;
/*      */     
/*  343 */     this.aa = null;
/*  344 */     this.ab = null;
/*  345 */     this.ac = 0.0F;
/*  346 */     this.ad = 0.0F;
/*      */     
/*  348 */     this.B = 0;
/*      */     
/*  350 */     this.y = -1;
/*  351 */     this.C = null;
/*      */ 
/*      */     
/*  354 */     this.z = -1;
/*  355 */     this.A = -1.0F;
/*      */ 
/*      */     
/*  358 */     this.as.a(null);
/*  359 */     this.av = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  364 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(e parame) {
/*  369 */     this.a = parame.a;
/*      */     
/*  371 */     this.r = parame.r;
/*      */     
/*  373 */     this.g = parame.g;
/*      */     
/*  375 */     this.b = parame.b;
/*      */     
/*  377 */     this.c = parame.c;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  382 */     this.d = parame.d;
/*      */     
/*  384 */     this.e = parame.e;
/*      */ 
/*      */     
/*  387 */     this.o = parame.o;
/*      */     
/*  389 */     this.q = parame.q;
/*      */     
/*  391 */     this.J = parame.J;
/*  392 */     this.K = parame.K;
/*      */     
/*  394 */     this.M = parame.M;
/*  395 */     this.N = parame.N;
/*  396 */     this.O = parame.O;
/*  397 */     this.P = parame.P;
/*      */ 
/*      */     
/*  400 */     this.L = parame.L;
/*      */     
/*  402 */     this.aq = parame.aq;
/*      */     
/*  404 */     this.am = parame.am;
/*      */     
/*  406 */     this.an = parame.an;
/*      */     
/*  408 */     this.ae = parame.ae;
/*      */     
/*  410 */     this.ak = parame.ak;
/*  411 */     this.aj = parame.aj;
/*  412 */     this.ag = parame.ag;
/*      */     
/*  414 */     this.ah = parame.ah;
/*      */     
/*  416 */     this.ai = parame.ai;
/*      */     
/*  418 */     this.al = parame.ah;
/*      */ 
/*      */     
/*  421 */     this.ao = parame.ao;
/*  422 */     this.ap = parame.ap;
/*      */     
/*  424 */     this.V = parame.V;
/*  425 */     this.W = parame.W;
/*  426 */     this.X = parame.X;
/*  427 */     this.s = parame.s;
/*      */     
/*  429 */     this.t = parame.t;
/*  430 */     this.u = parame.u;
/*      */     
/*  432 */     this.G = parame.G;
/*  433 */     this.H = parame.H;
/*      */     
/*  435 */     this.I = parame.I;
/*      */     
/*  437 */     this.v = parame.v;
/*  438 */     this.w = parame.w;
/*  439 */     this.x = parame.x;
/*      */     
/*  441 */     this.F = parame.F;
/*  442 */     this.Y = parame.Y;
/*  443 */     this.Z = parame.Z;
/*  444 */     this.Q = parame.Q;
/*  445 */     this.R = parame.R;
/*  446 */     this.S = parame.S;
/*      */     
/*  448 */     this.T = parame.T;
/*  449 */     this.U = parame.U;
/*      */     
/*  451 */     this.aa = parame.aa;
/*  452 */     this.ab = parame.ab;
/*  453 */     this.ac = parame.ac;
/*  454 */     this.ad = parame.ad;
/*      */     
/*  456 */     this.B = parame.B;
/*      */     
/*  458 */     this.y = parame.y;
/*      */ 
/*      */     
/*  461 */     this.z = parame.z;
/*  462 */     this.A = parame.A;
/*      */     
/*  464 */     this.C = parame.C;
/*  465 */     this.ar = parame.ar;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat) {
/*  472 */     this.V = f.a(this.V, paramFloat);
/*      */     
/*  474 */     if (this.V > 0.0F) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  480 */     this.W -= paramFloat;
/*      */ 
/*      */     
/*  483 */     if (this.b != null)
/*      */     {
/*  485 */       if (this.b.dC)
/*      */       {
/*  487 */         if (!this.a.liveAfterAttachedDies)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  493 */           this.W = -1.0F;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  499 */     if (this.W < 0.0F) {
/*      */       
/*  501 */       b();
/*      */       
/*      */       return;
/*      */     } 
/*  505 */     if (this.ae) {
/*      */       
/*  507 */       if (this.al) {
/*      */         
/*  509 */         this.ak -= this.aj * paramFloat;
/*      */       }
/*      */       else {
/*      */         
/*  513 */         this.ak += this.aj * paramFloat;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  518 */       if (this.ah) {
/*      */         
/*  520 */         if (!this.al)
/*      */         {
/*  522 */           if (this.ak >= (this.ag + 1))
/*      */           {
/*  524 */             this.al = true;
/*  525 */             this.ak = this.ag;
/*      */           
/*      */           }
/*      */         
/*      */         }
/*  530 */         else if (this.ak < this.af)
/*      */         {
/*  532 */           if (!this.ai) {
/*      */             
/*  534 */             b();
/*      */             
/*      */             return;
/*      */           } 
/*      */           
/*  539 */           this.al = false;
/*  540 */           this.ak = this.af;
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  548 */       else if (this.ak >= (this.ag + 1)) {
/*      */         
/*  550 */         if (!this.ai) {
/*      */           
/*  552 */           b();
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/*  557 */         this.ak = this.af;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  563 */       this.ao = (int)this.ak;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  568 */     if (this.v) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  573 */       this.S -= this.S * 0.002F * paramFloat;
/*      */ 
/*      */ 
/*      */       
/*  577 */       this.Q -= paramFloat * 0.0015F;
/*      */     } 
/*      */ 
/*      */     
/*  581 */     if (this.w)
/*      */     {
/*      */ 
/*      */ 
/*      */       
/*  586 */       if (this.L > 0.0F) {
/*      */         
/*  588 */         this.S -= 0.1F * this.x * paramFloat;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */ 
/*      */         
/*  597 */         if (this.S < 0.0F) {
/*      */           
/*  599 */           this.S = -this.S;
/*  600 */           this.S *= 0.5F;
/*      */           
/*  602 */           this.S = f.a(this.S, 1.3F);
/*      */         } 
/*      */ 
/*      */         
/*  606 */         if (this.L < 0.0F)
/*      */         {
/*  608 */           this.L = 0.0F;
/*      */         }
/*      */         
/*  611 */         if (this.S < 0.2D)
/*      */         {
/*  613 */           this.aq = 1;
/*      */         }
/*      */         
/*  616 */         this.Q = f.a(this.Q, 0.15F * paramFloat);
/*  617 */         this.R = f.a(this.R, 0.15F * paramFloat);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  625 */         this.Z = f.a(this.Z, 1.0F * paramFloat);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  630 */     this.J += this.Q * paramFloat;
/*  631 */     this.K += this.R * paramFloat;
/*      */     
/*  633 */     this.L += this.S * paramFloat;
/*      */     
/*  635 */     this.Y += this.Z * paramFloat;
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
/*      */   public void a(l paraml, boolean paramBoolean) {
/*      */     g g;
/*      */     PointF pointF;
/*      */     Paint paint;
/*  656 */     Rect rect = c.l;
/*  657 */     RectF rectF = c.k;
/*      */ 
/*      */     
/*  660 */     if (this.V > 0.0F) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  665 */     if (paramBoolean && this.L < 1.0F) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  671 */     if (this.a.imageStrip != null) {
/*      */       
/*  673 */       g = this.a.imageStrip;
/*      */     }
/*      */     else {
/*      */       
/*  677 */       g = c.n[this.ap];
/*      */     } 
/*  679 */     if (!g.k) {
/*      */       
/*  681 */       int i = this.ao;
/*  682 */       int j = 0;
/*      */       
/*  684 */       if (i >= g.h) {
/*      */         
/*  686 */         j += i / g.h;
/*  687 */         i %= g.h;
/*      */       } 
/*      */       
/*  690 */       int k = g.d + i * g.f;
/*  691 */       int m = g.e + j * g.g;
/*      */       
/*  693 */       rect.a(k, m, k + g.b, m + g.c);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  698 */       rect.a(0, 0, g.i
/*  699 */           .l(), g.i.k());
/*      */     } 
/*      */ 
/*      */     
/*  703 */     if (!paramBoolean) {
/*      */       
/*  705 */       pointF = f.d(this.J, this.K, this.L);
/*      */     }
/*      */     else {
/*      */       
/*  709 */       pointF = f.d(this.J, this.K, 0.0F);
/*      */     } 
/*      */     
/*  712 */     float f1 = 1.0F;
/*  713 */     if (this.H != 1.0F || this.G != 1.0F || this.I) {
/*      */       
/*  715 */       f1 = f.f(this.H, this.G, 1.0F - this.W / this.X);
/*      */       
/*  717 */       if (this.I && !this.o) {
/*      */         
/*  719 */         f1 *= 1.0F / paraml.cE;
/*      */         
/*  721 */         f1 *= paraml.bQ;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  726 */     rectF.a(pointF.a, pointF.b, pointF.a + rect.b(), pointF.b + rect.c());
/*  727 */     if (this.am)
/*      */     {
/*  729 */       rectF.a(-rectF.b() / 2.0F, -rectF.c() / 2.0F);
/*      */     }
/*      */     
/*  732 */     if (this.an != 0.0F)
/*      */     {
/*  734 */       rectF.a(0.0F, rectF.c() * this.an * f1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  739 */     if (this.b != null)
/*      */     {
/*  741 */       if (!paramBoolean) {
/*      */         
/*  743 */         if (!this.c)
/*      */         {
/*  745 */           rectF.a(this.b.dH, this.b.dI - this.b.dJ);
/*      */         }
/*      */         else
/*      */         {
/*  749 */           rectF.a(this.b.dH, this.b.dI);
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  754 */         rectF.a(this.b.dH, this.b.dI);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  759 */     if (!this.o || this.M)
/*      */     {
/*  761 */       if (!f.a(paraml.cu, rectF)) {
/*      */         return;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  770 */     if (!this.e && !this.o)
/*      */     {
/*  772 */       if (!this.f) {
/*      */         
/*  774 */         float f7 = rectF.d();
/*  775 */         float f8 = rectF.e();
/*      */         
/*  777 */         if (!paraml.bt.a(f7, f8, paraml.bb)) {
/*      */           return;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*  783 */         this.f = true;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  791 */     if (!this.o)
/*      */     {
/*  793 */       rectF.a(-paraml.cd, -paraml.ce);
/*      */     }
/*      */     
/*  796 */     if (this.T != 0.0F) {
/*      */ 
/*      */       
/*  799 */       float f = f.h((this.X - this.W) / this.U * 360.0F) * this.T;
/*      */       
/*  801 */       rectF.a(0.0F, f);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  808 */     float f2 = this.X - this.W;
/*      */ 
/*      */ 
/*      */     
/*  812 */     float f3 = 1.0F;
/*  813 */     float f4 = 1.0F;
/*  814 */     float f5 = 1.0F;
/*  815 */     float f6 = 1.0F;
/*  816 */     boolean bool1 = false;
/*      */ 
/*      */     
/*  819 */     if (this.y != -1) {
/*      */       
/*  821 */       f3 = Color.a(this.y) * 0.003921569F;
/*      */       
/*  823 */       int i = Color.b(this.y);
/*  824 */       int j = Color.c(this.y);
/*  825 */       int k = Color.d(this.y);
/*      */       
/*  827 */       if (i != 255 || j != 255 || k != 255) {
/*      */         
/*  829 */         bool1 = true;
/*  830 */         f4 = i * 0.003921569F;
/*  831 */         f5 = j * 0.003921569F;
/*  832 */         f6 = k * 0.003921569F;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  837 */     if (this.A >= 0.0F) {
/*      */       
/*  839 */       float f7 = Color.a(this.z) * 0.003921569F;
/*  840 */       float f8 = Color.b(this.z) * 0.003921569F;
/*  841 */       float f9 = Color.c(this.z) * 0.003921569F;
/*  842 */       float f10 = Color.d(this.z) * 0.003921569F;
/*      */       
/*  844 */       if (this.A <= f2) {
/*      */         
/*  846 */         f3 = f7;
/*      */         
/*  848 */         bool1 = true;
/*  849 */         f4 = f8;
/*  850 */         f5 = f9;
/*  851 */         f6 = f10;
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  857 */         float f11 = f2 / this.A;
/*  858 */         float f12 = 1.0F - f11;
/*      */         
/*  860 */         f3 = f3 * f12 + f7 * f11;
/*      */         
/*  862 */         bool1 = true;
/*  863 */         f4 = f4 * f12 + f8 * f11;
/*  864 */         f5 = f5 * f12 + f9 * f11;
/*  865 */         f6 = f6 * f12 + f10 * f11;
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
/*  879 */     if (this.s && f2 >= this.u) {
/*      */       
/*  881 */       f3 *= (this.W - this.u) / this.X * this.F;
/*      */     }
/*  883 */     else if (this.t && f2 < this.u) {
/*      */       
/*  885 */       f3 *= f2 / this.u * this.F;
/*      */     }
/*      */     else {
/*      */       
/*  889 */       f3 *= this.F;
/*      */     } 
/*      */     
/*  892 */     if (f3 > 1.0F) f3 = 1.0F; 
/*  893 */     if (f3 < 0.0F) f3 = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  899 */     boolean bool2 = false;
/*      */     
/*  901 */     l l1 = paraml.bw;
/*      */     
/*  903 */     if (this.Y != 0.0F) {
/*      */       
/*  905 */       if (!bool2) {
/*      */         
/*  907 */         bool2 = true;
/*  908 */         l1.j();
/*      */       } 
/*      */ 
/*      */       
/*  912 */       l1.a(this.Y + 90.0F, rectF.d(), rectF.e());
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  917 */     if (f1 != 1.0F) {
/*      */       
/*  919 */       if (!bool2) {
/*      */         
/*  921 */         bool2 = true;
/*  922 */         l1.j();
/*      */       } 
/*      */       
/*  925 */       l1.a(f1, f1, rectF.d(), rectF.e());
/*      */     } 
/*      */     
/*  928 */     if (paramBoolean) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  933 */       f3 /= 3.0F;
/*      */ 
/*      */       
/*  936 */       f3 = f.b(f3, 0.0F, 1.0F);
/*      */ 
/*      */ 
/*      */       
/*  940 */       f4 = 0.0F;
/*  941 */       f5 = 0.0F;
/*  942 */       f6 = 0.0F;
/*      */       
/*  944 */       bool1 = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  952 */     if (bool1 && l.aj() && !paramBoolean)
/*      */     {
/*      */       
/*  955 */       if (this.C == null) {
/*      */ 
/*      */         
/*  958 */         int i = f.b(255, (int)(f4 * 255.0F), (int)(f5 * 255.0F), (int)(f6 * 255.0F));
/*      */ 
/*      */         
/*  961 */         if (D != null && E == i) {
/*      */ 
/*      */           
/*  964 */           this.C = D;
/*      */         }
/*      */         else {
/*      */           
/*  968 */           D = new LightingColorFilter(i, 0);
/*  969 */           E = i;
/*      */ 
/*      */           
/*  972 */           this.C = D;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  981 */     LightingColorFilter lightingColorFilter = this.C;
/*      */ 
/*      */     
/*  984 */     if (lightingColorFilter != null) {
/*      */       
/*  986 */       if (!this.av) {
/*      */         
/*  988 */         this.as.a((ColorFilter)lightingColorFilter);
/*  989 */         this.av = true;
/*      */       } 
/*  991 */       bool1 = true;
/*      */ 
/*      */     
/*      */     }
/*  995 */     else if (this.av) {
/*      */       
/*  997 */       this.as.a(null);
/*  998 */       this.av = false;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1003 */     if (!bool1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1009 */       q q1 = a(f3);
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 1016 */       paint = this.as;
/*      */       
/* 1018 */       int i = f.b(255, (int)(f4 * 255.0F), (int)(f5 * 255.0F), (int)(f6 * 255.0F));
/*      */       
/* 1020 */       float f = this.at - f3;
/* 1021 */       if (f < -0.01F || f > 0.01F || this.au != i) {
/*      */         
/* 1023 */         this.at = f3;
/* 1024 */         this.au = i;
/*      */         
/* 1026 */         int j = f.b((int)(f3 * 255.0F), (int)(f4 * 255.0F), (int)(f5 * 255.0F), (int)(f6 * 255.0F));
/*      */         
/* 1028 */         this.as.b(j);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1079 */     if (this.aa != null) {
/*      */       
/* 1081 */       Paint paint1 = paint;
/*      */       
/* 1083 */       if (this.ab != null)
/*      */       {
/* 1085 */         paint1 = this.ab;
/*      */       }
/*      */       
/* 1088 */       float f7 = rectF.d() + this.ac;
/* 1089 */       float f8 = rectF.e() + this.ad;
/*      */       
/* 1091 */       l1.a(this.aa, f7, f8, paint1);
/*      */     } 
/*      */ 
/*      */     
/* 1095 */     if (this.M) {
/*      */       
/* 1097 */       pointF = f.d(this.N, this.O, this.P);
/*      */       
/* 1099 */       l1.a(rectF.a, rectF.b, pointF.a - paraml.cd, pointF.b - paraml.ce, this.ax.r);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1108 */     else if (paramBoolean) {
/*      */       
/* 1110 */       l1.a(g.j, rect, rectF, paint);
/*      */     }
/*      */     else {
/*      */       
/* 1114 */       l1.a(g.i, rect, rectF, paint);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1119 */     if (bool2)
/*      */     {
/* 1121 */       l1.k();
/*      */     }
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
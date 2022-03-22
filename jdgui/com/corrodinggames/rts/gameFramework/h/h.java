/*      */ package com.corrodinggames.rts.gameFramework.h;
/*      */ 
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Rect;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.b.e;
/*      */ import com.corrodinggames.rts.game.b.g;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class h
/*      */ {
/*      */   static final boolean a = false;
/*   39 */   static boolean b = !l.an;
/*      */ 
/*      */   
/*      */   static boolean c = false;
/*      */ 
/*      */   
/*      */   static boolean d = false;
/*      */ 
/*      */   
/*      */   static boolean e = false;
/*      */   
/*   50 */   static int f = 20;
/*      */   
/*      */   static boolean g = false;
/*      */   
/*   54 */   static ArrayList h = new ArrayList();
/*      */ 
/*      */   
/*      */   static boolean i = false;
/*      */ 
/*      */   
/*      */   public static final boolean j = false;
/*      */   
/*      */   public boolean k = true;
/*      */   
/*   64 */   k l = new k(this);
/*      */ 
/*      */ 
/*      */   
/*      */   boolean m = true;
/*      */ 
/*      */ 
/*      */   
/*      */   b n;
/*      */ 
/*      */ 
/*      */   
/*      */   int o;
/*      */ 
/*      */ 
/*      */   
/*      */   short p;
/*      */ 
/*      */ 
/*      */   
/*      */   short q;
/*      */ 
/*      */ 
/*      */   
/*   88 */   ArrayList r = new ArrayList();
/*   89 */   e[] s = new e[0];
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp e a(ah paramah) {
/*   94 */     for (e e1 : this.s) {
/*      */       
/*   96 */       if (e1.a == paramah)
/*      */       {
/*   98 */         return e1;
/*      */       }
/*      */     } 
/*  101 */     return null;
/*      */   }
/*      */   
/*  104 */   public Paint t = new Paint(); public e u; public e v; public e w; public e x; public e y; public e z; public e A;
/*      */   public e B;
/*      */   
/*      */   public strictfp boolean a(ah paramah, int paramInt1, int paramInt2) {
/*  108 */     e e1 = a(paramah);
/*  109 */     return a(e1, paramInt1, paramInt2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean b(ah paramah, int paramInt1, int paramInt2) {
/*  114 */     e e1 = a(paramah);
/*  115 */     return a(e1, paramInt1, paramInt2, true);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(e parame, int paramInt1, int paramInt2) {
/*  121 */     return a(parame, paramInt1, paramInt2, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean a(e parame, int paramInt1, int paramInt2, boolean paramBoolean) {
/*  126 */     if (!this.n.c(paramInt1, paramInt2))
/*      */     {
/*  128 */       return true;
/*      */     }
/*      */     
/*  131 */     if (parame.a == ah.d)
/*      */     {
/*  133 */       return false;
/*      */     }
/*      */     
/*  136 */     int i = paramInt1 * this.q + paramInt2;
/*      */     
/*  138 */     if (!paramBoolean && parame.e[i] == -1)
/*      */     {
/*  140 */       return true;
/*      */     }
/*      */     
/*  143 */     if (parame.d[i] == -1 || parame.f[i] == -1)
/*      */     {
/*  145 */       return true;
/*      */     }
/*      */     
/*  148 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp int b(e parame, int paramInt1, int paramInt2) {
/*  154 */     if (!this.n.c(paramInt1, paramInt2))
/*      */     {
/*  156 */       return -1;
/*      */     }
/*  158 */     if (parame.a == ah.d)
/*      */     {
/*  160 */       return 0;
/*      */     }
/*      */     
/*  163 */     int i = paramInt1 * this.q + paramInt2;
/*      */     
/*  165 */     if (parame.d[i] == -1 || parame.e[i] == -1 || parame.f[i] == -1)
/*      */     {
/*  167 */       return -1;
/*      */     }
/*  169 */     return parame.d[i] + parame.e[i] + parame.f[i] * 10;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp int c(e parame, int paramInt1, int paramInt2) {
/*  175 */     if (!this.n.c(paramInt1, paramInt2))
/*      */     {
/*  177 */       return -1;
/*      */     }
/*  179 */     if (parame.a == ah.d)
/*      */     {
/*  181 */       return 4;
/*      */     }
/*      */     
/*  184 */     if (parame.j == null)
/*      */     {
/*  186 */       return -1;
/*      */     }
/*      */ 
/*      */     
/*  190 */     int i = paramInt1 * this.q + paramInt2;
/*      */     
/*  192 */     return parame.j[i];
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(int paramInt1, int paramInt2) {
/*  198 */     if (!this.n.c(paramInt1, paramInt2))
/*      */     {
/*  200 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  205 */     int i = paramInt1 * this.q + paramInt2;
/*      */     
/*  207 */     if (this.A.d[i] != -1)
/*      */     {
/*  209 */       return false;
/*      */     }
/*      */     
/*  212 */     if (this.x.d[i] == -1)
/*      */     {
/*  214 */       return false;
/*      */     }
/*      */     
/*  217 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean b(int paramInt1, int paramInt2) {
/*  223 */     if (!this.n.c(paramInt1, paramInt2))
/*      */     {
/*  225 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  230 */     int i = paramInt1 * this.q + paramInt2;
/*      */     
/*  232 */     if (this.z.d[i] != -1)
/*      */     {
/*  234 */       return false;
/*      */     }
/*      */     
/*  237 */     if (this.B.d[i] == -1)
/*      */     {
/*  239 */       return false;
/*      */     }
/*      */     
/*  242 */     return true;
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
/*      */   public synchronized strictfp void a(b paramb, boolean paramBoolean) {
/*  260 */     d();
/*      */     
/*  262 */     l.d("PathEngine: Setting up map costs");
/*      */     
/*  264 */     boolean bool = false;
/*      */     
/*  266 */     if (paramBoolean)
/*      */     {
/*  268 */       if (this.n != null)
/*      */       {
/*  270 */         if (this.n == paramb && this.p == paramb.r.n && this.q == paramb.r.o)
/*      */         {
/*      */           
/*  273 */           if (this.o == e.a(paramb)) {
/*      */             
/*  275 */             l.d("PathEngine: Keeping existing map costs");
/*  276 */             bool = true;
/*      */           }
/*      */           else {
/*      */             
/*  280 */             l.d("PathEngine: Error: Map checksum does not match!!!");
/*      */           } 
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  289 */     if (bool);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  304 */     this.n = paramb;
/*  305 */     this.o = e.a(paramb);
/*      */     
/*  307 */     this.p = (short)paramb.r.n;
/*  308 */     this.q = (short)paramb.r.o;
/*      */     
/*  310 */     this.r.clear();
/*  311 */     this.s = new e[0];
/*      */     
/*  313 */     this.u = new e(this, ah.a, this.p, this.q);
/*  314 */     this.v = new e(this, ah.b, this.p, this.q);
/*  315 */     this.v.b();
/*      */     
/*  317 */     this.v.a((r)null);
/*      */ 
/*      */     
/*  320 */     this.w = new e(this, ah.c, this.p, this.q);
/*  321 */     this.x = new e(this, ah.e, this.p, this.q);
/*  322 */     this.x.b();
/*  323 */     this.x.a((r)null);
/*  324 */     this.y = new e(this, ah.d, this.p, this.q);
/*  325 */     this.z = new e(this, ah.f, this.p, this.q);
/*  326 */     this.z.b();
/*  327 */     this.z.a((r)null);
/*      */     
/*  329 */     this.A = new e(this, ah.g, this.p, this.q);
/*  330 */     this.A.b();
/*  331 */     this.A.a((r)null);
/*      */     
/*  333 */     this.B = new e(this, ah.h, this.p, this.q);
/*  334 */     this.B.b();
/*  335 */     this.B.a((r)null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  343 */     for (k k1 : this.E)
/*      */     {
/*  345 */       k1.a(paramb);
/*      */     }
/*  347 */     this.l.a(paramb);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  362 */     l.d("PathEngine: Ready");
/*      */   }
/*      */ 
/*      */   
/*  366 */   Paint C = new Paint();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a() {
/*  373 */     l l = l.u();
/*      */     
/*  375 */     e e1 = this.v;
/*      */ 
/*      */ 
/*      */     
/*  379 */     Rect rect = new Rect();
/*      */     
/*  381 */     float f1 = l.cd;
/*  382 */     float f2 = l.ce;
/*  383 */     float f3 = l.ch;
/*  384 */     float f4 = l.ci;
/*      */ 
/*      */     
/*  387 */     e e2 = l.bt.r;
/*      */ 
/*      */     
/*  390 */     int i = (int)(f1 * this.n.o - 1.0F);
/*  391 */     if (i < 0) i = 0; 
/*  392 */     int j = (int)(f2 * this.n.p - 1.0F);
/*  393 */     if (j < 0) j = 0; 
/*  394 */     int m = (int)((f1 + f3) * this.n.o + 1.0F);
/*  395 */     if (m > this.p - 1) m = this.p - 1; 
/*  396 */     int n = (int)((f2 + f4) * this.n.p + 1.0F);
/*  397 */     if (n > this.q - 1) n = this.q - 1;
/*      */ 
/*      */     
/*  400 */     for (int i1 = i; i1 < m + 1; i1++) {
/*      */       
/*  402 */       for (int i2 = j; i2 < n + 1; i2++) {
/*      */ 
/*      */ 
/*      */         
/*  406 */         g g = e2.a(i1, i2);
/*      */         
/*  408 */         if (g != null) {
/*      */ 
/*      */           
/*  411 */           int i3 = i1 * this.n.k;
/*  412 */           int i4 = i2 * this.n.l;
/*  413 */           rect.a(i3, i4, i3 + this.n.k, i4 + this.n.l);
/*  414 */           rect.a((int)-f1, (int)-f2);
/*      */           
/*  416 */           boolean bool = rect.b((int)(l.bA.s / l.cE), (int)(l.bA.t / l.cE));
/*      */ 
/*      */ 
/*      */           
/*  420 */           if (e)
/*      */           {
/*  422 */             if (!bool) {
/*      */               continue;
/*      */             }
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  433 */           int i5 = e1.d[i1 * this.q + i2];
/*  434 */           int i6 = e1.e[i1 * this.q + i2];
/*  435 */           int i7 = e1.f[i1 * this.q + i2];
/*      */           
/*  437 */           if (i5 == -1) {
/*      */             
/*  439 */             i5 = 255;
/*      */           }
/*      */           else {
/*      */             
/*  443 */             i5 *= 2;
/*      */           } 
/*  445 */           if (i6 == -1) {
/*      */             
/*  447 */             i6 = 255;
/*      */           }
/*      */           else {
/*      */             
/*  451 */             i6 *= 2;
/*      */           } 
/*      */           
/*  454 */           if (i7 == -1) {
/*      */             
/*  456 */             i7 = 255;
/*      */           
/*      */           }
/*      */           else {
/*      */             
/*  461 */             if (i7 != 0)
/*      */             {
/*  463 */               i7 += '\036';
/*      */             }
/*      */             
/*  466 */             i7 *= 2;
/*      */           } 
/*  468 */           this.C.a(128, i5, i6, i7);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  492 */           l.bw.b(rect, this.C);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  520 */           if (bool)
/*      */           {
/*  522 */             if (e1.f != null)
/*      */             {
/*  524 */               l.bw.a("o:" + e1.f[i1 * this.q + i2], rect.d(), rect.e(), l.cW);
/*      */             }
/*      */           }
/*      */         } 
/*      */         continue;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(r paramr) {
/*  585 */     if (paramr != null)
/*      */     {
/*  587 */       m.b(paramr);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  592 */     for (e e1 : this.s)
/*      */     {
/*  594 */       e1.e();
/*      */     }
/*      */     
/*  597 */     this.v.a(paramr);
/*      */ 
/*      */ 
/*      */     
/*  601 */     this.z.a(paramr);
/*  602 */     this.A.a(paramr);
/*  603 */     this.B.a(paramr);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b() {
/*  613 */     for (e e1 : this.s)
/*      */     {
/*  615 */       e1.f();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  623 */   Object D = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   ArrayList E;
/*      */ 
/*      */ 
/*      */   
/*  632 */   LinkedList F = new LinkedList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   LinkedList G;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   Object H;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c() {
/*  688 */     for (g g : this.F)
/*      */     {
/*  690 */       g.s = true;
/*      */     }
/*  692 */     this.F.clear();
/*      */     
/*  694 */     h();
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void d() {
/*  699 */     for (g g : this.F)
/*      */     {
/*  701 */       a(g);
/*      */     }
/*  703 */     this.F.clear();
/*      */     
/*  705 */     h();
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
/*      */   public strictfp void a(e parame, boolean paramBoolean) {
/*  723 */     l l = l.u();
/*      */ 
/*      */     
/*  726 */     if (!paramBoolean) {
/*      */       
/*  728 */       if (parame.k + 50 < l.bg) {
/*      */ 
/*      */         
/*  731 */         parame.k = l.bg - 40;
/*      */ 
/*      */         
/*  734 */         parame.f();
/*      */       } 
/*      */ 
/*      */       
/*  738 */       parame.a(paramBoolean);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  743 */       if (parame.k + 30 < l.bg) {
/*      */ 
/*      */         
/*  746 */         parame.k = l.bg;
/*  747 */         parame.f();
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  752 */       parame.a(paramBoolean);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp g a(boolean paramBoolean) {
/*  761 */     return new g(this, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(g paramg, boolean paramBoolean) {
/*  768 */     a(paramg, paramBoolean, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(g paramg, boolean paramBoolean1, boolean paramBoolean2) {
/*  773 */     if (!this.m) {
/*      */       
/*  775 */       l.b("PathEngine", "Cannot start new path, not running");
/*      */       
/*      */       return;
/*      */     } 
/*  779 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  793 */     e e1 = a(paramg.k);
/*      */     
/*  795 */     a(e1, paramBoolean1);
/*      */ 
/*      */ 
/*      */     
/*  799 */     paramg.a();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  818 */     paramg.p = 300.0F;
/*      */ 
/*      */     
/*  821 */     int i = f.c(paramg.d - paramg.h);
/*  822 */     int j = f.c(paramg.e - paramg.i);
/*      */     
/*  824 */     if (i < 15 && j < 15) {
/*      */       
/*  826 */       paramg.p = 12.0F;
/*      */     }
/*  828 */     else if (i < 50 && j < 50) {
/*      */       
/*  830 */       paramg.p = 16.0F;
/*      */     }
/*  832 */     else if (i < 200 && j < 200) {
/*      */       
/*  834 */       paramg.p = 24.0F;
/*      */     }
/*  836 */     else if (i < 400 && j < 400) {
/*      */       
/*  838 */       paramg.p = 50.0F;
/*      */     }
/*  840 */     else if (i < 1000 && j < 1000) {
/*      */       
/*  842 */       paramg.p = 100.0F;
/*      */     }
/*  844 */     else if (i < 2000 && j < 2000) {
/*      */       
/*  846 */       paramg.p = 200.0F;
/*      */     } 
/*      */     
/*  849 */     if (!l.bF.z && !l.bJ.g())
/*      */     {
/*  851 */       if (i < 1000 && j < 1000) {
/*      */         
/*  853 */         paramg.p = 180.0F;
/*      */       }
/*      */       else {
/*      */         
/*  857 */         paramg.p = 360.0F;
/*      */       } 
/*      */     }
/*      */     
/*  861 */     if (paramg.n) {
/*      */       
/*  863 */       paramg.p *= 2.0F;
/*  864 */       paramg.p += 50.0F;
/*      */     } 
/*      */     
/*  867 */     paramg.o = paramg.p;
/*      */ 
/*      */ 
/*      */     
/*  871 */     if (!this.k || paramBoolean2) {
/*      */       
/*  873 */       this.l.a(paramg);
/*  874 */       this.l.b();
/*      */       
/*  876 */       this.F.add(paramg);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  881 */       b(paramg);
/*      */       
/*  883 */       this.F.add(paramg);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat) {
/*  892 */     i();
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(float paramFloat) {
/*  897 */     i();
/*      */     
/*  899 */     d(paramFloat);
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
/*      */   public strictfp void c(float paramFloat) {
/*  939 */     if (g)
/*      */     {
/*      */ 
/*      */       
/*  943 */       for (g g : h) {
/*      */         
/*  945 */         g.f();
/*  946 */         g.e();
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  954 */     if (d)
/*      */     {
/*  956 */       a();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean e() {
/*  966 */     Iterator<g> iterator = this.F.iterator();
/*  967 */     while (iterator.hasNext()) {
/*      */       
/*  969 */       g g = iterator.next();
/*  970 */       if (g.p <= 0.0F)
/*      */       {
/*  972 */         if (!g.d())
/*      */         {
/*  974 */           return true;
/*      */         }
/*      */       }
/*      */     } 
/*  978 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp String f() {
/*  983 */     Iterator<g> iterator = this.F.iterator();
/*      */     
/*  985 */     String str1 = null;
/*  986 */     byte b1 = 0;
/*      */     
/*  988 */     while (iterator.hasNext()) {
/*      */       
/*  990 */       g g = iterator.next();
/*  991 */       if (g.p <= 0.0F)
/*      */       {
/*  993 */         if (!g.d()) {
/*      */           
/*  995 */           if (str1 == null) {
/*      */             
/*  997 */             float f = f.b(g.d, g.e, g.h, g.i);
/*  998 */             str1 = "[distance:" + f + ", allowedDelay:" + g.o + " lowPriority:" + g.n + "]";
/*      */           } 
/* 1000 */           b1++;
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1005 */     String str2 = "(total:" + b1 + ") ";
/* 1006 */     if (str1 != null)
/*      */     {
/* 1008 */       str2 = str2 + str1;
/*      */     }
/*      */     
/* 1011 */     return str2;
/*      */   }
/*      */ 
/*      */   
/*      */   private strictfp void d(float paramFloat) {
/* 1016 */     Iterator<g> iterator = this.F.iterator();
/* 1017 */     while (iterator.hasNext()) {
/*      */       
/* 1019 */       g g = iterator.next();
/*      */       
/* 1021 */       if (g.p <= 0.0F) {
/*      */         
/* 1023 */         g.p = 0.0F;
/* 1024 */         g.q = true;
/*      */ 
/*      */         
/* 1027 */         if (g) {
/*      */           
/* 1029 */           h.add(g);
/* 1030 */           if (h.size() > 10)
/*      */           {
/* 1032 */             h.remove(0);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1038 */         if (!g.d()) {
/*      */ 
/*      */ 
/*      */           
/* 1042 */           if (l.u().ao())
/*      */           {
/* 1044 */             l.b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
/*      */           }
/*      */ 
/*      */           
/* 1048 */           a(g);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1053 */         if (g.d())
/*      */         {
/*      */ 
/*      */           
/* 1057 */           iterator.remove();
/*      */         }
/*      */         
/*      */         continue;
/*      */       } 
/*      */       
/* 1063 */       g.p -= paramFloat;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp h() {
/* 1071 */     this.G = new LinkedList();
/* 1072 */     this.H = new Object(); this.E = new ArrayList(); this.E.add(new k(this)); int i = f.c(); if (i > 1) {
/*      */       l.b("PathEngine", "We have " + i + " cores, creating extra solvers"); this.E.add(new k(this));
/*      */     } else {
/*      */       l.b("PathEngine", "We only have one core, using single solver");
/*      */     }  for (k k1 : this.E)
/* 1077 */       k1.c();  } private strictfp g g() { g g = null;
/*      */     
/* 1079 */     for (g g1 : this.G) {
/*      */       
/* 1081 */       if (g == null || g.p > g1.p)
/*      */       {
/* 1083 */         g = g1;
/*      */       }
/*      */     } 
/*      */     
/* 1087 */     if (g == null)
/*      */     {
/* 1089 */       throw new RuntimeException("Failed to find any paths");
/*      */     }
/*      */     
/* 1092 */     if (!this.G.remove(g))
/*      */     {
/* 1094 */       throw new RuntimeException("Failed remove found path");
/*      */     }
/*      */     
/* 1097 */     return g; }
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp void b(g paramg) {
/* 1102 */     synchronized (this.H) {
/*      */       
/* 1104 */       this.G.add(paramg);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp void h() {
/* 1111 */     synchronized (this.H) {
/*      */       
/* 1113 */       this.G.clear();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private strictfp void i() {
/* 1119 */     LinkedList linkedList = this.G;
/*      */ 
/*      */     
/* 1122 */     if (linkedList.size() > 0)
/*      */     {
/* 1124 */       synchronized (this.H) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1129 */         while (linkedList.size() > 0) {
/*      */           
/* 1131 */           k k1 = j();
/* 1132 */           if (k1 != null) {
/*      */ 
/*      */             
/* 1135 */             g g = g();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1141 */             if (!g.r)
/*      */             {
/* 1143 */               a(k1, g);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp k j() {
/* 1161 */     for (k k1 : this.E) {
/*      */       
/* 1163 */       if (k1.s)
/*      */       {
/* 1165 */         return k1;
/*      */       }
/*      */     } 
/* 1168 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(g paramg) {
/* 1176 */     if (!paramg.r)
/*      */     {
/*      */       while (true) {
/*      */         
/* 1180 */         synchronized (this.D) {
/*      */           
/* 1182 */           k k1 = j();
/* 1183 */           if (k1 != null) {
/*      */             
/* 1185 */             a(k1, paramg);
/*      */             
/*      */             break;
/*      */           } 
/*      */           try {
/* 1190 */             this.D.wait(2000L);
/*      */           }
/* 1192 */           catch (InterruptedException interruptedException) {}
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/* 1197 */     boolean bool = false;
/* 1198 */     long l = l.N();
/*      */ 
/*      */     
/*      */     while (true) {
/* 1202 */       synchronized (this.D) {
/*      */         
/* 1204 */         if (paramg.d()) {
/*      */           break;
/*      */         }
/*      */         
/* 1208 */         bool = true;
/*      */         
/* 1210 */         i();
/*      */ 
/*      */         
/*      */         try {
/* 1214 */           this.D.wait(2000L);
/*      */         }
/* 1216 */         catch (InterruptedException interruptedException) {}
/*      */       } 
/*      */     } 
/*      */     
/* 1220 */     if (bool)
/*      */     {
/* 1222 */       if (b)
/*      */       {
/* 1224 */         l.b("PathEngine", "We were blocked path(" + paramg.a + ") for:" + (l.N() - l));
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private strictfp void a(k paramk, g paramg) {
/* 1233 */     synchronized (paramg) {
/*      */       
/* 1235 */       if (!paramg.r) {
/*      */ 
/*      */         
/* 1238 */         paramk.a(paramg);
/* 1239 */         paramk.a();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
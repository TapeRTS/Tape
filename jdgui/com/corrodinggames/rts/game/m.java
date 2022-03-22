/*      */ package com.corrodinggames.rts.game;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.Paint;
/*      */ import com.corrodinggames.rts.game.a.a;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.h;
/*      */ import com.corrodinggames.rts.game.units.custom.i;
/*      */ import com.corrodinggames.rts.game.units.custom.j;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.bi;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.bk;
/*      */ import com.corrodinggames.rts.gameFramework.e;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.f;
/*      */ import com.corrodinggames.rts.gameFramework.j.n;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class m
/*      */   extends bi
/*      */   implements Comparable
/*      */ {
/*      */   public strictfp int a(m paramm) {
/*   53 */     int j = this.R - paramm.R;
/*   54 */     if (j != 0) return j;
/*      */ 
/*      */     
/*   57 */     int k = this.i - paramm.i;
/*   58 */     if (k != 0) return k;
/*      */     
/*   60 */     if (this.q != null && paramm.q != null)
/*      */     {
/*   62 */       return this.q.compareTo(paramm.q);
/*      */     }
/*   64 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b(ap paramap) {
/*   71 */     paramap.c(this.i);
/*   72 */     paramap.a(this.m);
/*   73 */     paramap.a(this.o);
/*   74 */     paramap.b(this.q);
/*   75 */     paramap.a(this.J);
/*      */     
/*   77 */     if (paramap.g() > 26) {
/*      */       
/*   79 */       paramap.a(w());
/*      */       
/*   81 */       paramap.d("lastPingTimeReceivedAt");
/*   82 */       paramap.a(this.M);
/*      */     } 
/*      */     
/*   85 */     if (paramap.g() >= 55) {
/*      */       
/*   87 */       paramap.a(this.r);
/*   88 */       paramap.a(this.s);
/*      */     } 
/*      */ 
/*      */     
/*   92 */     if (paramap.g() >= 91) {
/*      */       
/*   94 */       paramap.a(this.R);
/*   95 */       paramap.c(0);
/*      */     } 
/*      */     
/*   98 */     if (paramap.g() >= 97) {
/*      */       
/*  100 */       paramap.a(this.y);
/*  101 */       paramap.a(this.z);
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
/*  113 */     if (paramap.g() >= 125) {
/*      */       
/*  115 */       paramap.a(this.u);
/*  116 */       paramap.a(this.ac);
/*  117 */       paramap.a(this.ad);
/*      */     } 
/*      */ 
/*      */     
/*  121 */     if (paramap.g() >= 149) {
/*      */       
/*  123 */       paramap.b(this.E);
/*  124 */       paramap.a(this.F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(ap paramap) {
/*  135 */     paramap.c(0);
/*  136 */     paramap.a(w());
/*      */     
/*  138 */     paramap.a(this.y);
/*  139 */     paramap.a(this.z);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk) {
/*  144 */     paramk.d();
/*  145 */     this.L = paramk.f();
/*  146 */     this.M = System.currentTimeMillis();
/*      */     
/*  148 */     this.y = paramk.e();
/*  149 */     this.z = paramk.e();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b(k paramk) {
/*  156 */     a(paramk, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk, boolean paramBoolean) {
/*  161 */     if (!paramBoolean) {
/*      */       
/*  163 */       i(paramk.d());
/*  164 */       this.m = paramk.f();
/*  165 */       this.n = 0;
/*      */       
/*  167 */       this.o = paramk.f();
/*  168 */       this.q = paramk.j();
/*  169 */       this.J = paramk.e();
/*      */     }
/*      */     else {
/*      */       
/*  173 */       paramk.d();
/*  174 */       paramk.f();
/*  175 */       paramk.f();
/*  176 */       paramk.j();
/*  177 */       paramk.e();
/*      */     } 
/*      */     
/*  180 */     if (paramk.b() >= 14) {
/*      */       
/*  182 */       this.L = paramk.f();
/*      */       
/*  184 */       paramk.i();
/*  185 */       this.M = System.currentTimeMillis();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  190 */     if (paramk.b() >= 34 && paramk.c() >= 55) {
/*      */ 
/*      */       
/*  193 */       boolean bool = paramk.e();
/*  194 */       int j = paramk.f();
/*  195 */       if (!paramBoolean)
/*      */       {
/*  197 */         this.r = bool;
/*  198 */         this.s = j;
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  204 */       l l = l.u();
/*  205 */       if (l.bF.z)
/*      */       {
/*  207 */         ad.f("AI was skipping in networked game, steam version:" + paramk.c());
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  214 */     if (paramk.b() >= 50 && paramk.c() >= 91) {
/*      */       
/*  216 */       this.R = paramk.f();
/*  217 */       paramk.d();
/*      */     } 
/*      */ 
/*      */     
/*  221 */     if (paramk.b() >= 52 && paramk.c() >= 97) {
/*      */       
/*  223 */       this.y = paramk.e();
/*  224 */       this.z = paramk.e();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  234 */     if (paramk.b() >= 70 && paramk.c() >= 125) {
/*      */ 
/*      */       
/*  237 */       boolean bool1 = paramk.e();
/*  238 */       boolean bool2 = paramk.e();
/*  239 */       int j = paramk.f();
/*      */       
/*  241 */       if (!paramBoolean) {
/*      */         
/*  243 */         this.u = bool1;
/*  244 */         this.ac = bool2;
/*  245 */         this.ad = j;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  250 */     if (paramk.b() >= 90 && paramk.c() >= 149) {
/*      */       
/*  252 */       String str = paramk.j();
/*  253 */       int j = paramk.f();
/*      */       
/*  255 */       if (!paramBoolean) {
/*      */         
/*  257 */         this.E = str;
/*  258 */         this.F = j;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(ap paramap) {
/*  268 */     paramap.d("Writing team: " + this.q);
/*      */     
/*  270 */     b(paramap);
/*      */ 
/*      */ 
/*      */     
/*  274 */     if (paramap.g() >= 44) {
/*      */       
/*  276 */       paramap.c(4);
/*      */       
/*  278 */       paramap.a(this.w);
/*      */ 
/*      */       
/*  281 */       paramap.a(this.v);
/*      */ 
/*      */       
/*  284 */       boolean bool = true;
/*  285 */       paramap.a(bool);
/*  286 */       if (bool)
/*      */       {
/*  288 */         d(paramap);
/*      */       }
/*      */ 
/*      */       
/*  292 */       this.aa.a(paramap);
/*      */ 
/*      */       
/*  295 */       h.a(this.Z, paramap);
/*      */ 
/*      */       
/*  298 */       paramap.a(this.t);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(k paramk) {
/*  308 */     b(paramk);
/*      */ 
/*      */     
/*  311 */     if (paramk.b() >= 26) {
/*      */       
/*  313 */       byte b = paramk.d();
/*  314 */       this.w = paramk.e();
/*      */       
/*  316 */       if (b >= 1)
/*      */       {
/*  318 */         this.v = paramk.e();
/*      */       }
/*      */       
/*  321 */       boolean bool = paramk.e();
/*  322 */       if (bool)
/*      */       {
/*  324 */         d(paramk);
/*      */       }
/*      */       
/*  327 */       if (b >= 2)
/*      */       {
/*  329 */         this.aa.a(paramk);
/*      */       }
/*      */       
/*  332 */       if (b >= 3)
/*      */       {
/*  334 */         a(h.a(paramk));
/*      */       }
/*      */       
/*  337 */       if (b >= 4)
/*      */       {
/*  339 */         this.t = paramk.e();
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
/*      */   public strictfp void d(ap paramap) {
/*  351 */     l l = l.u();
/*      */     
/*  353 */     paramap.d("-- Saving fog --");
/*      */ 
/*      */     
/*  356 */     paramap.a((this.C != null));
/*  357 */     if (this.C != null) {
/*      */       
/*  359 */       paramap.a(this.A);
/*  360 */       paramap.a(this.B);
/*  361 */       for (byte b = 0; b < this.A; b++) {
/*      */         
/*  363 */         for (byte b1 = 0; b1 < this.B; b1++)
/*      */         {
/*  365 */           paramap.c(this.C[b][b1]);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  370 */     paramap.d("--End fog--");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void d(k paramk) {
/*  376 */     l l = l.u();
/*      */ 
/*      */     
/*  379 */     boolean bool = paramk.e();
/*      */     
/*  381 */     if (bool) {
/*      */       
/*  383 */       this.A = paramk.f();
/*  384 */       this.B = paramk.f();
/*      */       
/*  386 */       boolean bool1 = true;
/*      */       
/*  388 */       int j = this.A;
/*  389 */       int n = this.B;
/*      */       
/*  391 */       if (l.bt != null) {
/*      */         
/*  393 */         j = l.bt.y;
/*  394 */         n = l.bt.z;
/*      */         
/*  396 */         if (this.A != j || this.B != n)
/*      */         {
/*      */           
/*  399 */           l.b("Map size does not match fog size: " + this.A + "!=" + j + "|" + this.B + "!=" + n);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  404 */       if (bool1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  411 */         this.C = new byte[j][n];
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  417 */         this.C = (byte[][])null;
/*      */       } 
/*      */ 
/*      */       
/*  421 */       for (byte b = 0; b < this.A; b++) {
/*      */         
/*  423 */         for (byte b1 = 0; b1 < this.B; b1++)
/*      */         {
/*      */           
/*  426 */           if (bool1)
/*      */           {
/*  428 */             this.C[b][b1] = paramk.d();
/*      */           }
/*      */           else
/*      */           {
/*  432 */             paramk.d();
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       } 
/*      */     } else {
/*      */       
/*  440 */       this.C = (byte[][])null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a() {
/*  450 */     if (this.C != null)
/*      */     {
/*  452 */       for (byte b = 0; b < this.A; b++) {
/*      */         
/*  454 */         for (byte b1 = 0; b1 < this.B; b1++)
/*      */         {
/*  456 */           this.C[b][b1] = 0;
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*  461 */     l l = l.u();
/*      */     
/*  463 */     if (l.bb == this) {
/*      */       
/*  465 */       l.bE.O = true;
/*      */       
/*  467 */       if (l.bt != null) {
/*      */         
/*  469 */         l.bt.h();
/*      */         
/*  471 */         l.bt.d();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean b() {
/*  480 */     return (this.o == -3);
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
/*      */   public static strictfp ArrayList a(boolean paramBoolean) {
/*  493 */     ArrayList<m> arrayList = new ArrayList();
/*      */ 
/*      */     
/*  496 */     for (byte b = 0; b < d; b++) {
/*      */       
/*  498 */       m m1 = ab[b];
/*  499 */       if (m1 != null)
/*      */       {
/*  501 */         if (paramBoolean || m1.b())
/*      */         {
/*  503 */           arrayList.add(m1);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  508 */     Collections.sort(arrayList);
/*      */     
/*  510 */     return arrayList;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp ArrayList c() {
/*  515 */     return b(false);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp ArrayList b(boolean paramBoolean) {
/*  520 */     ArrayList<m> arrayList = new ArrayList();
/*      */     
/*  522 */     for (byte b = 0; b < d; b++) {
/*      */       
/*  524 */       m m1 = ab[b];
/*  525 */       if (m1 != null)
/*      */       {
/*  527 */         if (paramBoolean || !m1.b())
/*      */         {
/*  529 */           arrayList.add(m1);
/*      */         }
/*      */       }
/*      */     } 
/*  533 */     return arrayList;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp ArrayList d() {
/*  539 */     ArrayList<Integer> arrayList = new ArrayList();
/*      */     
/*  541 */     for (byte b = 0; b < a; b++) {
/*      */       
/*  543 */       m m1 = ab[b];
/*  544 */       if (m1 != null)
/*      */       {
/*  546 */         if (!m1.b())
/*      */         {
/*  548 */           arrayList.add(Integer.valueOf(m1.o));
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  553 */     return arrayList;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int a(int paramInt, boolean paramBoolean) {
/*  558 */     byte b1 = 0;
/*      */     
/*  560 */     for (byte b2 = 0; b2 < a; b2++) {
/*      */       
/*  562 */       m m1 = ab[b2];
/*  563 */       if (m1 != null)
/*      */       {
/*      */         
/*  566 */         if (m1.o == paramInt)
/*      */         {
/*  568 */           if (!m1.b())
/*      */           {
/*      */ 
/*      */ 
/*      */             
/*  573 */             if (!paramBoolean || !m1.r)
/*      */             {
/*      */ 
/*      */ 
/*      */               
/*  578 */               b1++; } 
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*  583 */     return b1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int e() {
/*  588 */     byte b1 = 0;
/*  589 */     for (byte b2 = 0; b2 < a; b2++) {
/*      */       
/*  591 */       m m1 = ab[b2];
/*  592 */       if (m1 != null)
/*      */       {
/*  594 */         if (!m1.b())
/*      */         {
/*  596 */           if (!m1.v && !m1.w)
/*      */           {
/*  598 */             b1++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*  603 */     return b1;
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
/*  631 */   public static int a = 10;
/*      */   
/*  633 */   public static int b = 0;
/*      */   
/*  635 */   public static int c = 100;
/*      */   
/*  637 */   public static int d = a + b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  655 */   public static final m e = new e(-1, false, "<blank>");
/*      */ 
/*      */   
/*  658 */   public static final m f = new d(-2);
/*  659 */   public static final m g = new d(-1);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  664 */   private static m[] ab = new m[d];
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  669 */   public static m h = new s(-99);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void b(int paramInt, boolean paramBoolean) {
/*  675 */     if (paramInt < 10) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  680 */     if (paramInt == a) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  685 */     if (paramInt > c)
/*      */     {
/*  687 */       throw new IOException("setMaxTeamId: " + paramInt + " is over limit of:" + c);
/*      */     }
/*      */     
/*  690 */     if (!paramBoolean && paramInt <= a) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  698 */     int j = paramInt + b;
/*      */     
/*  700 */     m[] arrayOfM = new m[j];
/*      */     
/*  702 */     for (byte b = 0; b < ab.length; b++) {
/*      */       
/*  704 */       m m1 = ab[b];
/*  705 */       if (b < arrayOfM.length)
/*      */       {
/*  707 */         arrayOfM[b] = m1;
/*      */       }
/*      */     } 
/*      */     
/*  711 */     ab = arrayOfM;
/*  712 */     a = paramInt;
/*  713 */     d = j;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  719 */   public int i = -1;
/*      */   
/*  721 */   public final String j = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
/*      */   
/*      */   public boolean k;
/*      */   
/*      */   public boolean l;
/*      */   
/*  727 */   public int m = 4000;
/*  728 */   public int n = 0;
/*      */   
/*      */   public int o;
/*      */ 
/*      */   
/*      */   public static strictfp String a(int paramInt) {
/*  734 */     if (paramInt == 0) return "A"; 
/*  735 */     if (paramInt == 1) return "B"; 
/*  736 */     if (paramInt == 2) return "C"; 
/*  737 */     if (paramInt == 3) return "D"; 
/*  738 */     if (paramInt == 4) return "E"; 
/*  739 */     if (paramInt == 5) return "F"; 
/*  740 */     if (paramInt == 6) return "G"; 
/*  741 */     if (paramInt == 7) return "H"; 
/*  742 */     if (paramInt == 8) return "I"; 
/*  743 */     if (paramInt == 9) return "J"; 
/*  744 */     if (paramInt == 10) return "K";
/*      */     
/*  746 */     if (paramInt == -3) return "S";
/*      */     
/*  748 */     return "" + paramInt;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp String f() {
/*  753 */     return a(this.o);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean p = false;
/*      */ 
/*      */   
/*      */   public String q;
/*      */ 
/*      */   
/*      */   public boolean r;
/*      */ 
/*      */   
/*      */   public int s;
/*      */   
/*      */   public boolean t;
/*      */   
/*      */   private boolean ac;
/*      */   
/*  773 */   private int ad = -9999;
/*      */   
/*      */   public boolean u;
/*      */   
/*  777 */   private int ae = -9999;
/*      */   
/*      */   public boolean v;
/*      */   
/*      */   public boolean w;
/*      */   
/*      */   public boolean x;
/*      */   
/*      */   public boolean y;
/*      */   public boolean z;
/*      */   public int A;
/*      */   public int B;
/*      */   public byte[][] C;
/*      */   public String D;
/*      */   public String E;
/*      */   public int F;
/*      */   public int G;
/*      */   
/*      */   public strictfp void g() {
/*  796 */     this.u = false;
/*  797 */     this.ac = false;
/*  798 */     this.ad = -9999;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean h() {
/*  804 */     return this.u;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean i() {
/*  810 */     return (this.ad >= 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void j() {
/*  815 */     l l = l.u();
/*      */     
/*  817 */     this.ad = l.bh;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean k() {
/*  823 */     l l = l.u();
/*      */ 
/*      */     
/*  826 */     if (this.v || this.w)
/*      */     {
/*  828 */       if (!l.bF.aH.k)
/*      */       {
/*      */ 
/*      */         
/*  832 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  836 */     if (this.r)
/*      */     {
/*  838 */       return false;
/*      */     }
/*  840 */     if (x())
/*      */     {
/*  842 */       return false;
/*      */     }
/*  844 */     if (this.Q)
/*      */     {
/*  846 */       return false;
/*      */     }
/*      */     
/*  849 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int b(int paramInt) {
/*  854 */     byte b1 = 0;
/*      */     
/*  856 */     for (byte b2 = 0; b2 < a; b2++) {
/*      */       
/*  858 */       m m1 = ab[b2];
/*  859 */       if (m1 != null)
/*      */       {
/*  861 */         if (m1.o == paramInt)
/*      */         {
/*  863 */           if (m1.i() && m1.k())
/*      */           {
/*  865 */             b1++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*  870 */     return b1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int c(int paramInt) {
/*  875 */     byte b1 = 0;
/*      */     
/*  877 */     for (byte b2 = 0; b2 < a; b2++) {
/*      */       
/*  879 */       m m1 = ab[b2];
/*  880 */       if (m1 != null)
/*      */       {
/*  882 */         if (m1.o == paramInt)
/*      */         {
/*  884 */           if (m1.k())
/*      */           {
/*  886 */             b1++;
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*  891 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void l() {
/*  898 */     for (byte b = 0; b < a; b++) {
/*      */       
/*  900 */       m m1 = ab[b];
/*  901 */       if (m1 != null)
/*      */       {
/*  903 */         m1.ad = -9999;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void d(int paramInt) {
/*  910 */     l l = l.u();
/*      */     
/*  912 */     if (!l.bF.A) {
/*      */       return;
/*      */     }
/*      */     
/*  916 */     if (l.bJ.h()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  922 */     for (byte b = 0; b < a; b++) {
/*      */       
/*  924 */       m m1 = ab[b];
/*  925 */       if (m1 != null)
/*      */       {
/*  927 */         if (m1.o == paramInt)
/*      */         {
/*  929 */           if (!m1.ac) {
/*      */             
/*  931 */             m1.ac = true;
/*      */             
/*  933 */             e e = l.bN.b();
/*  934 */             e.i = m1;
/*  935 */             e.r = true;
/*  936 */             e.u = 100;
/*  937 */             l.bF.a(e);
/*      */           } 
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void e(int paramInt) {
/*  947 */     int j = -9999;
/*      */     
/*  949 */     for (byte b = 0; b < a; b++) {
/*      */       
/*  951 */       m m1 = ab[b];
/*  952 */       if (m1 != null)
/*      */       {
/*  954 */         if (m1.o == paramInt)
/*      */         {
/*  956 */           if (m1.i() && m1.k())
/*      */           {
/*  958 */             if (m1.ad > j)
/*      */             {
/*  960 */               j = m1.ad;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*  966 */     if (j >= 0)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  972 */       if (y.a(j, 120000))
/*      */       {
/*  974 */         for (m m1 : ab) {
/*      */           
/*  976 */           if (m1 != null)
/*      */           {
/*  978 */             if (m1.o == paramInt)
/*      */             {
/*      */               
/*  981 */               m1.ad = -9999;
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
/*      */   public strictfp boolean b(m paramm) {
/*  994 */     if (m())
/*      */     {
/*  996 */       if (paramm != null && d(paramm))
/*      */       {
/*  998 */         return true;
/*      */       }
/*      */     }
/* 1001 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean m() {
/* 1006 */     if (this.y || this.z)
/*      */     {
/*      */ 
/*      */       
/* 1010 */       return true;
/*      */     }
/*      */     
/* 1013 */     return false;
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
/*      */   public strictfp boolean n() {
/* 1029 */     l l = l.u();
/*      */     
/* 1031 */     if (l.bb == this)
/*      */     {
/* 1033 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1038 */     return false;
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
/*      */   public strictfp void c(boolean paramBoolean) {
/* 1053 */     if (paramBoolean) {
/*      */       
/* 1055 */       this.F = 1;
/*      */     }
/*      */     else {
/*      */       
/* 1059 */       this.F = 0;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean o() {
/* 1066 */     return (this.F == 1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean H = true;
/*      */   
/* 1073 */   public r I = new r();
/*      */   
/*      */   public boolean J;
/*      */   
/*      */   public byte K;
/*      */   
/* 1079 */   public int L = -1;
/* 1080 */   public long M = -1L;
/*      */   
/* 1082 */   public long N = -1L;
/* 1083 */   public int O = -1;
/*      */   
/*      */   public boolean P;
/*      */   public boolean Q;
/* 1087 */   public int R = 0;
/*      */   
/*      */   int S;
/*      */   
/*      */   public final strictfp int a(boolean paramBoolean1, boolean paramBoolean2) {
/* 1092 */     int j = this.I.c;
/* 1093 */     if (paramBoolean1)
/*      */     {
/* 1095 */       j += this.I.e;
/*      */     }
/* 1097 */     if (paramBoolean2)
/*      */     {
/* 1099 */       j += this.I.d;
/*      */     }
/* 1101 */     return j;
/*      */   }
/*      */ 
/*      */   
/*      */   public final strictfp int p() {
/* 1106 */     return this.I.c + this.I.e + this.I.d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp int a(h paramh, boolean paramBoolean1, boolean paramBoolean2) {
/* 1113 */     Object[] arrayOfObject = this.I.i.a(); byte b; int j;
/* 1114 */     for (b = 0, j = this.I.i.a; b < j; b++) {
/*      */       
/* 1116 */       o o = (o)arrayOfObject[b];
/* 1117 */       if (o.a == paramh) {
/*      */         
/* 1119 */         int k = o.b;
/* 1120 */         if (paramBoolean1)
/*      */         {
/* 1122 */           k += o.c;
/*      */         }
/* 1124 */         if (paramBoolean2)
/*      */         {
/* 1126 */           k += o.d;
/*      */         }
/* 1128 */         return k;
/*      */       } 
/*      */     } 
/* 1131 */     return 0;
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
/*      */   public strictfp boolean q() {
/* 1166 */     boolean bool = false;
/*      */ 
/*      */     
/* 1169 */     r r1 = e(false);
/*      */     
/* 1171 */     if (this.I.b != r1.b) {
/*      */       
/* 1173 */       l.b("unitCountExcludingBuildingsIncludingQueued: " + this.I.b + "!=" + r1.b + " (team:" + this.i + " fails: " + this.S + ")");
/* 1174 */       this.S++;
/* 1175 */       bool = true;
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
/* 1209 */     if (this.I.a != r1.a) {
/*      */       
/* 1211 */       l.b("unitsMax: " + this.I.a + "!=" + r1.a + " (team:" + this.i + " fails: " + this.S + ")");
/* 1212 */       this.S++;
/* 1213 */       bool = true;
/*      */     } 
/*      */     
/* 1216 */     if (this.I.f != r1.f) {
/*      */       
/* 1218 */       l.b("incomeRate: " + this.I.f + "!=" + r1.f + " (team:" + this.i + " fails: " + this.S + ")");
/* 1219 */       this.S++;
/* 1220 */       bool = true;
/*      */     } 
/*      */     
/* 1223 */     if (this.I.e != r1.e) {
/*      */       
/* 1225 */       l.b("incompleteUnitCountOfAllTypes: " + this.I.e + "!=" + r1.e + " (team:" + this.i + " fails: " + this.S + ")");
/* 1226 */       this.S++;
/* 1227 */       bool = true;
/*      */     } 
/*      */     
/* 1230 */     if (this.I.d != r1.d) {
/*      */       
/* 1232 */       l.b("queuedCountOfAllTypes: " + this.I.d + "!=" + r1.d + " (team:" + this.i + " fails: " + this.S + ")");
/* 1233 */       this.S++;
/* 1234 */       bool = true;
/*      */     } 
/*      */     
/* 1237 */     if (this.I.c != r1.c) {
/*      */       
/* 1239 */       l.b("unitCountOfAllTypesOnlyCompleted: " + this.I.c + "!=" + r1.c + " (team:" + this.i + " fails: " + this.S + ")");
/* 1240 */       this.S++;
/* 1241 */       bool = true;
/*      */     } 
/*      */     
/* 1244 */     if (!this.I.g.c(r1.g)) {
/*      */       
/* 1246 */       l.b("customIncomeRate: " + this.I.g + "!=" + r1.g + " (team:" + this.i + " fails: " + this.S + ")");
/*      */       
/* 1248 */       l.b("currentCaches:" + this.I.g.a(false, true, 30, true, true));
/* 1249 */       l.b("targetUnitCache:" + r1.g.a(false, true, 30, true, true));
/*      */       
/* 1251 */       this.S++;
/* 1252 */       bool = true;
/*      */     } 
/*      */     
/* 1255 */     return bool;
/*      */   }
/*      */ 
/*      */   
/*      */   private strictfp r e(boolean paramBoolean) {
/* 1260 */     l l = l.u();
/*      */ 
/*      */     
/* 1263 */     r r1 = new r();
/*      */     
/* 1265 */     r1.a = l.bk;
/*      */     
/* 1267 */     af[] arrayOfAf = af.bj.a(); byte b; int j;
/* 1268 */     for (b = 0, j = af.bj.size(); b < j; b++) {
/*      */       
/* 1270 */       af af = arrayOfAf[b];
/* 1271 */       if (af.bB == this) {
/*      */         
/* 1273 */         r1.a(af);
/*      */         
/* 1275 */         if (paramBoolean)
/*      */         {
/* 1277 */           af.bC = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1283 */     if (r1.a > l.bl)
/*      */     {
/* 1285 */       r1.a = l.bl;
/*      */     }
/*      */     
/* 1288 */     return r1;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void d(boolean paramBoolean) {
/* 1293 */     if (!paramBoolean && !this.H) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1298 */     this.I = e(true);
/*      */     
/* 1300 */     this.H = false;
/*      */     
/* 1302 */     if (this.G < this.I.b)
/*      */     {
/* 1304 */       this.G = this.I.b;
/*      */     }
/*      */     
/* 1307 */     if (!this.l)
/*      */     {
/* 1309 */       if (this.I.h)
/*      */       {
/* 1311 */         this.l = true;
/*      */       }
/*      */     }
/*      */     
/* 1315 */     if (!this.k)
/*      */     {
/* 1317 */       if (p() > 0)
/*      */       {
/* 1319 */         this.k = true;
/*      */       }
/*      */     }
/*      */     
/* 1323 */     N();
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp int r() {
/* 1328 */     int j = this.I.f;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1339 */     j = (int)(j * z());
/*      */     
/* 1341 */     return j;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int a(a parama) {
/* 1347 */     int j = (int)this.I.g.a(parama);
/*      */     
/* 1349 */     l l = l.u();
/*      */     
/* 1351 */     boolean bool = false;
/*      */ 
/*      */ 
/*      */     
/* 1355 */     if (parama == a.l)
/*      */     {
/* 1357 */       bool = true;
/*      */     }
/*      */ 
/*      */     
/* 1361 */     if (bool)
/*      */     {
/*      */       
/* 1364 */       j = (int)(j * z());
/*      */     }
/*      */     
/* 1367 */     return j;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp int s() {
/* 1372 */     return this.I.b;
/*      */   }
/*      */   
/*      */   public strictfp int t() {
/* 1376 */     return this.I.a;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String u() {
/* 1382 */     int j = w();
/*      */     
/* 1384 */     if (j == -99)
/*      */     {
/* 1386 */       return "";
/*      */     }
/*      */     
/* 1389 */     if (this.r)
/*      */     {
/* 1391 */       return "";
/*      */     }
/*      */     
/* 1394 */     if (j == -2)
/*      */     {
/* 1396 */       return "(disconnected)";
/*      */     }
/*      */     
/* 1399 */     if (j == -1)
/*      */     {
/* 1401 */       return "(disconnected)";
/*      */     }
/*      */     
/* 1404 */     return "(" + j + ")";
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp String v() {
/* 1409 */     int j = w();
/*      */     
/* 1411 */     if (j == -99)
/*      */     {
/* 1413 */       return "HOST";
/*      */     }
/*      */     
/* 1416 */     if (this.r)
/*      */     {
/* 1418 */       return "-";
/*      */     }
/*      */     
/* 1421 */     if (j == -1)
/*      */     {
/* 1423 */       return "N/A";
/*      */     }
/*      */     
/* 1426 */     if (j == -2)
/*      */     {
/* 1428 */       return "-";
/*      */     }
/*      */     
/* 1431 */     if (o())
/*      */     {
/* 1433 */       return j + " (HOST)";
/*      */     }
/*      */     
/* 1436 */     return "" + j;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int w() {
/* 1446 */     if (this.M == -1L)
/*      */     {
/* 1448 */       return -2;
/*      */     }
/*      */     
/* 1451 */     if (this.M < System.currentTimeMillis() - 5000L)
/*      */     {
/* 1453 */       return -1;
/*      */     }
/*      */     
/* 1456 */     return this.L;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp boolean x() {
/* 1461 */     if (this.M != -1L && this.M < System.currentTimeMillis() - 15000L)
/*      */     {
/* 1463 */       return true;
/*      */     }
/* 1465 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1470 */   public Paint T = (Paint)new q();
/* 1471 */   public Paint U = (Paint)new q();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp int y() {
/* 1489 */     if (this.t)
/*      */     {
/* 1491 */       return this.s;
/*      */     }
/*      */     
/* 1494 */     l l = l.u();
/* 1495 */     if (l.bF.z || l.bJ.g())
/*      */     {
/* 1497 */       if (!l.bF.D)
/*      */       {
/* 1499 */         return this.s;
/*      */       }
/*      */     }
/* 1502 */     return (l.u()).by.aiDifficulty;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp float z() {
/* 1510 */     l l = l.u();
/*      */ 
/*      */     
/* 1513 */     if (l.H())
/*      */     {
/* 1515 */       return l.bF.aH.h;
/*      */     }
/* 1517 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp float A() {
/* 1523 */     if (!this.r)
/*      */     {
/* 1525 */       return 1.0F;
/*      */     }
/*      */     
/* 1528 */     int j = y();
/*      */ 
/*      */     
/* 1531 */     float f = 1.0F;
/*      */     
/* 1533 */     if (j > 0) {
/*      */       
/* 1535 */       f += j * 0.4F;
/*      */     }
/*      */     else {
/*      */       
/* 1539 */       f += j * 0.3F;
/*      */     } 
/* 1541 */     if (j == 3)
/*      */     {
/* 1543 */       f += 1.5F;
/*      */     }
/*      */     
/* 1546 */     if (f < 0.1F) f = 0.1F;
/*      */     
/* 1548 */     return f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp void f(int paramInt) {
/* 1557 */     if (!this.r) {
/*      */       
/* 1559 */       g(paramInt);
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1568 */     float f = A();
/*      */     
/* 1570 */     g((int)(f * paramInt));
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
/*      */   public final strictfp void g(int paramInt) {
/* 1582 */     paramInt = (int)(paramInt * z());
/*      */     
/* 1584 */     h(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp void h(int paramInt) {
/* 1591 */     this.m += paramInt;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1600 */     if (this.m > 999999999)
/*      */     {
/* 1602 */       this.m = 999999999;
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
/*      */   public static strictfp void B() {
/*      */     try {
/* 1625 */       b(10, true);
/*      */     }
/* 1627 */     catch (IOException iOException) {
/*      */       
/* 1629 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */     
/* 1632 */     for (byte b = 0; b < ab.length; b++)
/*      */     {
/* 1634 */       ab[b] = null;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp e a(String paramString) {
/* 1643 */     if (paramString == null || paramString.equals("")) {
/*      */       
/* 1645 */       l.b("findExistingPlayer: No clientId id");
/* 1646 */       return null;
/*      */     } 
/*      */     
/* 1649 */     for (byte b = 0; b < ab.length; b++) {
/*      */       
/* 1651 */       m m1 = ab[b];
/* 1652 */       if (m1 != null)
/*      */       {
/* 1654 */         if (paramString.equals(m1.D)) {
/*      */           
/* 1656 */           if (m1 instanceof e)
/*      */           {
/* 1658 */             return (e)m1;
/*      */           }
/*      */ 
/*      */           
/* 1662 */           l.b("Player:" + b + " with matching clientId is not an instanceof player");
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1667 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp e b(String paramString) {
/* 1673 */     if (paramString == null || paramString.equals("")) {
/*      */       
/* 1675 */       l.b("No id");
/* 1676 */       return null;
/*      */     } 
/*      */     
/* 1679 */     for (byte b = 0; b < ab.length; b++) {
/*      */       
/* 1681 */       m m1 = ab[b];
/* 1682 */       if (m1 != null)
/*      */       {
/* 1684 */         if (paramString.equals(m1.E)) {
/*      */           
/* 1686 */           if (m1 instanceof e)
/*      */           {
/* 1688 */             return (e)m1;
/*      */           }
/*      */ 
/*      */           
/* 1692 */           l.b("Player:" + b + " with matching clientId is not an instanceof player");
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1697 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int C() {
/* 1702 */     for (byte b = 0; b < a; b++) {
/*      */       
/* 1704 */       if (ab[b] == null)
/*      */       {
/* 1706 */         return b;
/*      */       }
/*      */     } 
/* 1709 */     return -1;
/*      */   }
/*      */   
/*      */   public static strictfp int D() {
/*      */     int j;
/* 1714 */     for (j = a; j < d; j++) {
/*      */       
/* 1716 */       if (ab[j] == null)
/*      */       {
/* 1718 */         return j;
/*      */       }
/*      */     } 
/*      */     
/* 1722 */     for (j = a - 1; j >= 0; j--) {
/*      */       
/* 1724 */       if (ab[j] == null)
/*      */       {
/* 1726 */         return j;
/*      */       }
/*      */     } 
/*      */     
/* 1730 */     return -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void E() {
/* 1735 */     for (byte b = 0; b < ab.length; b++) {
/*      */       
/* 1737 */       if (ab[b] == this)
/*      */       {
/* 1739 */         ab[b] = null;
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
/*      */   public strictfp m(int paramInt) {
/* 1755 */     this(paramInt, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp m(int paramInt, boolean paramBoolean) {
/* 1760 */     this();
/* 1761 */     c(paramInt, paramBoolean);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void i(int paramInt) {
/* 1766 */     c(paramInt, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void c(int paramInt, boolean paramBoolean) {
/* 1771 */     if (this.i != paramInt) {
/*      */       
/* 1773 */       if (paramBoolean)
/*      */       {
/* 1775 */         E();
/*      */       }
/*      */       
/* 1778 */       this.i = paramInt;
/* 1779 */       this.o = paramInt;
/*      */       
/* 1781 */       if (paramBoolean)
/*      */       {
/* 1783 */         if (paramInt != -3) {
/*      */           
/* 1785 */           m m1 = ab[paramInt];
/* 1786 */           if (m1 != null)
/*      */           {
/* 1788 */             m1.c("Being replaced");
/*      */           }
/*      */ 
/*      */           
/* 1792 */           ab[paramInt] = this;
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1800 */       int j = F();
/*      */       
/* 1802 */       this.T.b(j);
/*      */       
/* 1804 */       int k = Color.a(Color.a(j), 
/* 1805 */           (int)(Color.b(j) * 0.5F), 
/* 1806 */           (int)(Color.c(j) * 0.5F), 
/* 1807 */           (int)(Color.d(j) * 0.5F));
/*      */       
/* 1809 */       this.U.b(k);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean j(int paramInt) {
/* 1819 */     if (this.m >= paramInt || paramInt == 0)
/*      */     {
/* 1821 */       return true;
/*      */     }
/* 1823 */     return false;
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
/*      */   public strictfp boolean k(int paramInt) {
/* 1880 */     if (this.m + this.n >= paramInt || paramInt == 0)
/*      */     {
/* 1882 */       return true;
/*      */     }
/* 1884 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp boolean c(m paramm) {
/* 1893 */     if (paramm == g || this == g)
/*      */     {
/* 1895 */       return false;
/*      */     }
/*      */     
/* 1898 */     return (this.o != paramm.o);
/*      */   }
/*      */ 
/*      */   
/*      */   public final strictfp boolean d(m paramm) {
/* 1903 */     if (paramm == g && this == g)
/*      */     {
/* 1905 */       return true;
/*      */     }
/* 1907 */     if (paramm == g || this == g)
/*      */     {
/* 1909 */       return false;
/*      */     }
/*      */     
/* 1912 */     return (this.o == paramm.o);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp int F() {
/* 1917 */     return m(this.i);
/*      */   }
/*      */ 
/*      */   
/* 1921 */   static int[] V = new int[10];
/* 1922 */   static String[] W = new String[10];
/*      */ 
/*      */   
/*      */   int X;
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void G() {
/* 1930 */     l l = l.u();
/*      */ 
/*      */     
/*      */     try {
/* 1934 */       d(l.by.teamColors);
/*      */     }
/* 1936 */     catch (IllegalArgumentException illegalArgumentException) {
/*      */       
/* 1938 */       l.a("initColors: Failed to read setting: '" + l.by.teamColors + "': " + illegalArgumentException.getMessage(), illegalArgumentException);
/* 1939 */       d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
/*      */     } 
/*      */ 
/*      */     
/*      */     try {
/* 1944 */       e(l.by.teamColorsNames);
/*      */     }
/* 1946 */     catch (IllegalArgumentException illegalArgumentException) {
/*      */       
/* 1948 */       l.a("initColors: Failed to read setting: '" + l.by.teamColorsNames + "': " + illegalArgumentException.getMessage(), illegalArgumentException);
/* 1949 */       e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static strictfp void d(String paramString) {
/* 1955 */     String[] arrayOfString = paramString.split(",");
/* 1956 */     if (arrayOfString.length != 10)
/*      */     {
/* 1958 */       throw new IllegalArgumentException("Expected 10 hex colors");
/*      */     }
/* 1960 */     for (byte b = 0; b < 10; b++) {
/*      */       
/* 1962 */       String str = arrayOfString[b];
/* 1963 */       V[b] = Color.a(str);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static strictfp void e(String paramString) {
/* 1969 */     String[] arrayOfString = paramString.split(",");
/* 1970 */     if (arrayOfString.length != 10)
/*      */     {
/* 1972 */       throw new IllegalArgumentException("Expected 10 team color names");
/*      */     }
/* 1974 */     for (byte b = 0; b < 10; b++)
/*      */     {
/* 1976 */       W[b] = arrayOfString[b];
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp int H() {
/* 1983 */     if (this.o == -3)
/*      */     {
/* 1985 */       return m(-3);
/*      */     }
/*      */     
/* 1988 */     return l(this.i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp int l(int paramInt) {
/* 1993 */     if (paramInt >= a)
/*      */     {
/* 1995 */       return m(-3);
/*      */     }
/*      */     
/* 1998 */     return m(paramInt % 2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int m(int paramInt) {
/* 2004 */     if (paramInt >= 0 && paramInt < 10)
/*      */     {
/* 2006 */       return V[paramInt];
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2069 */     if (paramInt == -3)
/*      */     {
/* 2071 */       return Color.a(185, 90, 90, 90);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 2076 */     return -7829368;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String I() {
/* 2082 */     if (this.i == -1)
/*      */     {
/* 2084 */       return "GRAY";
/*      */     }
/* 2086 */     if (this.i == -2)
/*      */     {
/* 2088 */       return "GRAY";
/*      */     }
/*      */     
/* 2091 */     int j = M();
/*      */ 
/*      */     
/* 2094 */     if (j >= 0 && j < 10)
/*      */     {
/* 2096 */       return W[j];
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
/*      */     
/* 2147 */     return "GRAY";
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
/*      */   public static strictfp e[] a(e parame) {
/* 2174 */     return a(parame, n.a, false);
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
/*      */   public static strictfp e[] a(e parame, n paramn, boolean paramBoolean) {
/* 2192 */     if (!paramBoolean)
/*      */     {
/* 2194 */       return b(parame, paramn);
/*      */     }
/*      */ 
/*      */     
/* 2198 */     return a(parame, paramn);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp e[] a(e parame, n paramn) {
/* 2208 */     e[] arrayOfE = new e[10];
/*      */     
/* 2210 */     if ((l.aF && !l.aG) || paramn == n.e) {
/*      */       
/* 2212 */       for (byte b1 = 0; b1 < arrayOfE.length; b1++)
/*      */       {
/* 2214 */         arrayOfE[b1] = parame;
/*      */       }
/* 2216 */       return arrayOfE;
/*      */     } 
/*      */     
/* 2219 */     if (parame.a != null)
/*      */     {
/*      */       
/* 2222 */       return parame.a;
/*      */     }
/*      */     
/* 2225 */     bj bj = (l.u()).bL;
/*      */     
/* 2227 */     bj.a(bk.D);
/*      */     
/* 2229 */     for (byte b = 0; b < arrayOfE.length; b++) {
/*      */       
/* 2231 */       int j = m(b);
/*      */       
/* 2233 */       if (b == 0) {
/*      */         
/* 2235 */         arrayOfE[b] = parame;
/*      */       }
/*      */       else {
/*      */         
/* 2239 */         arrayOfE[b] = (e)new f(parame, j, paramn, b);
/*      */       } 
/*      */     } 
/* 2242 */     bj.b(bk.D);
/*      */ 
/*      */ 
/*      */     
/* 2246 */     parame.a = arrayOfE;
/*      */     
/* 2248 */     return arrayOfE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp e[] b(e parame, n paramn) {
/* 2256 */     e[] arrayOfE = new e[10];
/*      */     
/* 2258 */     if ((l.aF && !l.aG) || paramn == n.e) {
/*      */       
/* 2260 */       for (byte b1 = 0; b1 < arrayOfE.length; b1++)
/*      */       {
/* 2262 */         arrayOfE[b1] = parame;
/*      */       }
/* 2264 */       return arrayOfE;
/*      */     } 
/*      */     
/* 2267 */     if (parame.a != null)
/*      */     {
/*      */       
/* 2270 */       return parame.a;
/*      */     }
/*      */ 
/*      */     
/* 2274 */     bj bj = (l.u()).bL;
/*      */     
/* 2276 */     bj.a(bk.D);
/*      */ 
/*      */ 
/*      */     
/* 2280 */     int[] arrayOfInt1 = new int[10];
/*      */     
/* 2282 */     int[] arrayOfInt2 = new int[10];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     byte b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2294 */     for (b = 0; b < arrayOfInt1.length; b++) {
/*      */       
/* 2296 */       arrayOfInt1[b] = m(b);
/* 2297 */       arrayOfInt2[b] = b;
/*      */     } 
/* 2299 */     for (b = 0; b < arrayOfE.length; b++) {
/*      */ 
/*      */       
/* 2302 */       if (b != 0) {
/*      */         
/* 2304 */         arrayOfE[b] = parame.g();
/* 2305 */         arrayOfE[b].i();
/*      */       } 
/*      */     } 
/*      */     
/* 2309 */     parame.i();
/*      */     
/* 2311 */     if (paramn == n.b) {
/*      */       
/* 2313 */       b(parame, arrayOfE, arrayOfInt1);
/*      */     }
/* 2315 */     else if (paramn == n.d) {
/*      */       
/* 2317 */       a(parame, arrayOfE, arrayOfInt1, arrayOfInt2);
/*      */     }
/*      */     else {
/*      */       
/* 2321 */       a(parame, arrayOfE, arrayOfInt1);
/*      */     } 
/*      */     
/* 2324 */     for (b = 0; b < arrayOfE.length; b++) {
/*      */       
/* 2326 */       if (arrayOfE[b] != null) {
/*      */         
/* 2328 */         arrayOfE[b].o();
/*      */         
/* 2330 */         arrayOfE[b].r();
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 2335 */     parame.q();
/*      */     
/* 2337 */     arrayOfE[0] = parame;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2342 */     bj.b(bk.D);
/*      */ 
/*      */     
/* 2345 */     parame.a = arrayOfE;
/*      */     
/* 2347 */     return arrayOfE;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void a(e parame, e[] paramArrayOfe, int[] paramArrayOfint) {
/* 2352 */     int j = parame.l();
/* 2353 */     int k = parame.k();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2359 */     int[] arrayOfInt1 = new int[paramArrayOfint.length];
/* 2360 */     int[] arrayOfInt2 = new int[paramArrayOfint.length];
/* 2361 */     int[] arrayOfInt3 = new int[paramArrayOfint.length];
/* 2362 */     for (byte b1 = 0; b1 < paramArrayOfint.length; b1++) {
/*      */       
/* 2364 */       arrayOfInt1[b1] = Color.b(paramArrayOfint[b1]);
/* 2365 */       arrayOfInt2[b1] = Color.c(paramArrayOfint[b1]);
/* 2366 */       arrayOfInt3[b1] = Color.d(paramArrayOfint[b1]);
/*      */     } 
/*      */     
/* 2369 */     float f = 0.003921569F;
/*      */     
/* 2371 */     for (byte b2 = 0; b2 < k; b2++) {
/*      */       
/* 2373 */       for (byte b = 0; b < j; b++) {
/*      */         
/* 2375 */         int n = parame.a(b, b2);
/*      */         
/* 2377 */         int i1 = n.a(n);
/*      */         
/* 2379 */         if (i1 == 0) {
/*      */ 
/*      */           
/* 2382 */           if (n != 0)
/*      */           {
/* 2384 */             for (byte b3 = 0; b3 < paramArrayOfe.length; b3++)
/*      */             {
/* 2386 */               if (paramArrayOfe[b3] != null)
/*      */               {
/*      */                 
/* 2389 */                 paramArrayOfe[b3].a(b, b2, 0);
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*      */         } else {
/*      */           
/* 2396 */           int i2 = n.c(n);
/* 2397 */           if (i2 > 0) {
/*      */             
/* 2399 */             int i3 = n.b(n);
/* 2400 */             int i4 = n.d(n);
/*      */             
/* 2402 */             if (i3 == i4)
/*      */             {
/* 2404 */               if (i3 == 0) {
/*      */                 
/* 2406 */                 int i5 = i2;
/*      */ 
/*      */ 
/*      */                 
/* 2410 */                 for (byte b3 = 0; b3 < paramArrayOfe.length; b3++)
/*      */                 {
/* 2412 */                   if (paramArrayOfe[b3] != null)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/* 2418 */                     int i6 = arrayOfInt1[b3] * i5 >> 8;
/* 2419 */                     int i7 = arrayOfInt2[b3] * i5 >> 8;
/* 2420 */                     int i8 = arrayOfInt3[b3] * i5 >> 8;
/*      */ 
/*      */                     
/* 2423 */                     paramArrayOfe[b3].a(b, b2, Color.a(i1, i6, i7, i8));
/*      */                   }
/*      */                 
/*      */                 }
/*      */               
/*      */               }
/* 2429 */               else if (i2 != i3) {
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 2434 */                 int i5 = i3;
/*      */                 
/* 2436 */                 float f1 = i5 * 0.003921569F;
/* 2437 */                 float f2 = i2 * 0.003921569F - f1;
/*      */ 
/*      */ 
/*      */                 
/* 2441 */                 for (byte b3 = 0; b3 < paramArrayOfe.length; b3++) {
/*      */                   
/* 2443 */                   if (paramArrayOfe[b3] != null) {
/*      */                     
/* 2445 */                     int i6 = (int)(i5 + arrayOfInt1[b3] * f2);
/* 2446 */                     int i7 = (int)(i5 + arrayOfInt2[b3] * f2);
/* 2447 */                     int i8 = (int)(i5 + arrayOfInt3[b3] * f2);
/*      */                     
/* 2449 */                     i6 = f.b(i6, 0, 255);
/* 2450 */                     i7 = f.b(i7, 0, 255);
/* 2451 */                     i8 = f.b(i8, 0, 255);
/*      */ 
/*      */                     
/* 2454 */                     paramArrayOfe[b3].a(b, b2, Color.a(i1, i6, i7, i8));
/*      */                   } 
/*      */                 } 
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(e parame, e[] paramArrayOfe, int[] paramArrayOfint1, int[] paramArrayOfint2) {
/* 2474 */     int j = parame.l();
/* 2475 */     int k = parame.k();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2481 */     int[] arrayOfInt1 = new int[paramArrayOfint1.length];
/* 2482 */     int[] arrayOfInt2 = new int[paramArrayOfint1.length];
/* 2483 */     int[] arrayOfInt3 = new int[paramArrayOfint1.length]; byte b;
/* 2484 */     for (b = 0; b < paramArrayOfint1.length; b++) {
/*      */       
/* 2486 */       arrayOfInt1[b] = Color.b(paramArrayOfint1[b]);
/* 2487 */       arrayOfInt2[b] = Color.c(paramArrayOfint1[b]);
/* 2488 */       arrayOfInt3[b] = Color.d(paramArrayOfint1[b]);
/*      */     } 
/*      */     
/* 2491 */     for (b = 0; b < k; b++) {
/*      */       
/* 2493 */       for (byte b1 = 0; b1 < j; b1++) {
/*      */         
/* 2495 */         int n = parame.a(b1, b);
/*      */         
/* 2497 */         int i1 = Color.a(n);
/*      */         
/* 2499 */         if (i1 == 0) {
/*      */           
/* 2501 */           if (Color.b(n) > 0 || Color.c(n) > 0 || Color.d(n) > 0)
/*      */           {
/* 2503 */             for (byte b2 = 0; b2 < paramArrayOfe.length; b2++)
/*      */             {
/* 2505 */               if (paramArrayOfe[b2] != null)
/*      */               {
/* 2507 */                 paramArrayOfe[b2].a(b1, b, Color.a(0, 0, 0, 0));
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*      */         } else {
/*      */           
/* 2514 */           int i2 = Color.c(n);
/*      */ 
/*      */           
/* 2517 */           int i3 = Color.b(n);
/* 2518 */           int i4 = Color.d(n);
/*      */ 
/*      */ 
/*      */           
/* 2522 */           float f1 = f.c(f.c(i3, i2), i4);
/*      */           
/* 2524 */           float f2 = f.c(i3 - i2);
/* 2525 */           f2 = f.f(f2, f.c(i2 - i4));
/* 2526 */           f2 = f.f(f2, f.c(i4 - i3));
/*      */ 
/*      */           
/* 2529 */           if (f2 > 15.0F)
/*      */           {
/*      */             
/* 2532 */             for (byte b2 = 0; b2 < paramArrayOfe.length; b2++) {
/*      */ 
/*      */               
/* 2535 */               if (paramArrayOfe[b2] != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 2546 */                 float f = f2 / 255.0F;
/*      */                 
/* 2548 */                 int i5 = (int)(f1 + arrayOfInt1[b2] * f);
/* 2549 */                 int i6 = (int)(f1 + arrayOfInt2[b2] * f);
/* 2550 */                 int i7 = (int)(f1 + arrayOfInt3[b2] * f);
/*      */                 
/* 2552 */                 i5 = f.b(i5, 0, 255);
/* 2553 */                 i6 = f.b(i6, 0, 255);
/* 2554 */                 i7 = f.b(i7, 0, 255);
/*      */ 
/*      */                 
/* 2557 */                 paramArrayOfe[b2].a(b1, b, Color.a(i1, i5, i6, i7));
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void b(e parame, e[] paramArrayOfe, int[] paramArrayOfint) {
/* 2575 */     int j = parame.l();
/* 2576 */     int k = parame.k();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2582 */     int[] arrayOfInt1 = new int[paramArrayOfint.length];
/* 2583 */     int[] arrayOfInt2 = new int[paramArrayOfint.length];
/* 2584 */     int[] arrayOfInt3 = new int[paramArrayOfint.length]; byte b;
/* 2585 */     for (b = 0; b < paramArrayOfint.length; b++) {
/*      */       
/* 2587 */       arrayOfInt1[b] = Color.b(paramArrayOfint[b]);
/* 2588 */       arrayOfInt2[b] = Color.c(paramArrayOfint[b]);
/* 2589 */       arrayOfInt3[b] = Color.d(paramArrayOfint[b]);
/*      */     } 
/*      */     
/* 2592 */     for (b = 0; b < j; b++) {
/*      */       
/* 2594 */       for (byte b1 = 0; b1 < k; b1++) {
/*      */         
/* 2596 */         int n = parame.a(b, b1);
/*      */         
/* 2598 */         int i1 = Color.a(n);
/* 2599 */         if (i1 > 0) {
/*      */           
/* 2601 */           int i2 = Color.b(n);
/* 2602 */           int i3 = Color.c(n);
/* 2603 */           int i4 = Color.d(n);
/*      */           
/* 2605 */           float f = 0.15F;
/*      */           
/* 2607 */           for (byte b2 = 0; b2 < paramArrayOfe.length; b2++) {
/*      */             
/* 2609 */             int i5 = (int)(i2 + arrayOfInt1[b2] * f);
/* 2610 */             int i6 = (int)(i3 + arrayOfInt2[b2] * f);
/* 2611 */             int i7 = (int)(i4 + arrayOfInt3[b2] * f);
/*      */             
/* 2613 */             i5 = f.b(i5, 0, 255);
/* 2614 */             i6 = f.b(i6, 0, 255);
/* 2615 */             i7 = f.b(i7, 0, 255);
/*      */             
/* 2617 */             if (paramArrayOfe[b2] != null)
/*      */             {
/* 2619 */               paramArrayOfe[b2].a(b, b1, Color.a(i1, i5, i6, i7));
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp m n(int paramInt) {
/* 2697 */     if (paramInt == -1)
/*      */     {
/* 2699 */       return g;
/*      */     }
/* 2701 */     if (paramInt == -2)
/*      */     {
/* 2703 */       return f;
/*      */     }
/*      */     
/* 2706 */     if (paramInt >= d) {
/*      */       
/* 2708 */       l.f("team index too high: " + paramInt);
/* 2709 */       return null;
/*      */     } 
/*      */     
/* 2712 */     if (paramInt < 0) {
/*      */       
/* 2714 */       l.f("team index too low: " + paramInt);
/* 2715 */       return null;
/*      */     } 
/*      */     
/* 2718 */     return ab[paramInt];
/*      */   }
/*      */   
/*      */   public strictfp m() {
/* 2722 */     this.X = -2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3199 */     this.Z = h.d;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3268 */     this.aa = new d(); this.r = this instanceof a;
/*      */   }
/*      */   public strictfp void b(float paramFloat) { l l = l.u(); if (this.X > 0) { this.X--; return; }  if (this.X == -2) { this.X = this.i; } else { this.X = 10; }  if (!this.w && !l.bJ.h()) { boolean bool1 = false; boolean bool2 = false; boolean bool3 = false; boolean bool = l.bF.aH.k; af[] arrayOfAf = af.bj.a(); byte b; int j; for (b = 0, j = af.bj.size(); b < j; b++) { af af = arrayOfAf[b]; if (af.bB == this) { if (!af.cC()) { bool1 = true; if (!this.v) if (af.bx() || af.ai()) { bool2 = true; break; }   }  } else if (bool && af.bB != null && af.bB.d(this)) { if (!af.cC()) bool3 = true;  }  }  if (!bool1) if (!bool3) { this.w = true; a(); for (af af : af.bj) { if (af.bB == this && !af.o_()) af.bY = -1.0F;  }  l.bF.g(this); }   if (!bool2 && !this.v && !this.w) { this.v = true; l.bF.f(this); }  }  }
/*      */   public strictfp void a(r paramr) {}
/* 3272 */   public static strictfp void b(r paramr) { for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) m1.a(paramr);  }  } public static strictfp void a(af paramaf) { if (paramaf.bB != null && paramaf.bC && paramaf.bq) { m m1 = paramaf.bB; paramaf.bC = false; m1.I.b(paramaf); paramaf.cR(); }  } public static strictfp void b(af paramaf) { a(paramaf); } public static strictfp void c(af paramaf) { if (paramaf.bB != null && !paramaf.bC && paramaf.bq && !paramaf.bz) { paramaf.bC = true; m m1 = paramaf.bB; m1.I.a(paramaf); paramaf.cQ(); if (!m1.l) if (m1.I.h) m1.l = true;   if (!m1.k) m1.k = true;  m1.N(); }  } public static strictfp void J() { for (m m1 : c()) m1.H = true;  } public static strictfp void K() { l l = l.u(); if (l.F()) { l.d("Skipping updateAllCachesFromChangedMetadata due to desync risk"); return; }  for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) m1.H = true;  }  } static int Y = -99; i Z; public strictfp d P() { return this.aa; }
/*      */   d aa;
/*      */   public static strictfp void c(float paramFloat) { l l = l.u(); g.a(paramFloat); for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) { m1.a(paramFloat); m1.b(paramFloat); if (!m1.ac) { int j = b(m1.o); if (j > 0) { int k = c(m1.o); if (j >= k) { d(m1.o); l(); } else { e(m1.o); }  }  }  if (m1.u) { if (m1.ae < 0) m1.ae = l.bh;  if (!m1.w) { byte b1 = 0; for (af af : af.bj) { if (af.bB == m1 && !af.o_()) { boolean bool = false; byte b2 = 1; if (y.a(m1.ae, 16000)) { bool = true; b2 = 50; } else if (y.a(m1.ae, 6000)) { bool = (f.a(af, 0, 100) > 90) ? true : false; b2 = 20; } else if (y.a(m1.ae, 2000)) { bool = (f.a(af, 0, 100) > 98) ? true : false; b2 = 2; }  if (af instanceof com.corrodinggames.rts.game.units.d.d) bool = true;  if (bool) { af.bY = -1.0F; b1++; if (b1 > b2) break;  }  }  }  }  }  }  }  if (l.I() && l.by.aiDifficulty != Y) { l.bF.ah(); Y = l.by.aiDifficulty; }  }
/*      */   public static strictfp void d(float paramFloat) { g.d(false); for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) m1.d(false);  }  }
/*      */   public static strictfp void L() { g.d(false); for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) if (!m1.b() && !m1.w && !m1.v && !m1.u) { l l = l.u(); l.bF.e(m1); }   }  }
/* 3277 */   public static strictfp void e(float paramFloat) { for (byte b = 0; b < a; b++) { m m1 = ab[b]; if (m1 != null) if (m1 instanceof a) { a a = (a)m1; a.f(paramFloat); }   }  } public strictfp int M() { if (this.i == -1) return 5;  if (this.i == -2) return 5;  int j = this.i; if (j >= 10) j %= 10;  if (a > 10) { m m1 = (l.u()).bF.x; if (m1 != null && m1 != this && m1.M() == j) if (j != 5) { j = 5; } else { j = 4; }   }  return j; } public strictfp void N() {} public strictfp void a(i parami) { this.Z = parami; } public strictfp i O() { return this.Z; } public strictfp void b(i parami) { i i1 = O(); if (i1 == null || i1.b() == 0) { a(parami); return; }  if (h.b(i1, parami)) return;  j j = new j(i1); if (j.a(parami)) { a(j.a()); return; }  } public strictfp void c(i parami) { i i1 = O(); if (i1 == null || i1.b() == 0) return;  if (!h.a(parami, i1)) return;  j j = new j(i1); if (j.b(parami)) { a(j.a()); return; }  } public strictfp double b(a parama) { return this.aa.a(parama); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(p paramp, m paramm) {
/* 3294 */     if (paramp == p.a)
/*      */     {
/* 3296 */       return (paramm == this);
/*      */     }
/* 3298 */     if (paramp == p.f)
/*      */     {
/* 3300 */       return true;
/*      */     }
/* 3302 */     if (paramp == p.b)
/*      */     {
/* 3304 */       return d(paramm);
/*      */     }
/* 3306 */     if (paramp == p.c)
/*      */     {
/* 3308 */       return (paramm != this && d(paramm));
/*      */     }
/* 3310 */     if (paramp == p.d)
/*      */     {
/* 3312 */       return c(paramm);
/*      */     }
/* 3314 */     if (paramp == p.e)
/*      */     {
/* 3316 */       return (paramm == g);
/*      */     }
/*      */ 
/*      */     
/* 3320 */     throw new RuntimeException("Unsupported type: " + paramp);
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
/*      */   public strictfp void d(af paramaf) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void Q() {
/* 3341 */     l.d("debugUnitCountByType for team:" + this.i);
/*      */     
/* 3343 */     com.corrodinggames.rts.gameFramework.utility.m m1 = new com.corrodinggames.rts.gameFramework.utility.m();
/*      */     
/* 3345 */     af[] arrayOfAf = af.bj.a(); int j, k;
/* 3346 */     for (j = 0, k = af.bj.size(); j < k; j++) {
/*      */       
/* 3348 */       af af = arrayOfAf[j];
/*      */       
/* 3350 */       if (af.bB == this && !af.bz) {
/*      */ 
/*      */         
/* 3353 */         al al = af.db;
/* 3354 */         boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3370 */         for (q q : m1) {
/*      */           
/* 3372 */           if (q.a == al) {
/*      */             
/* 3374 */             q.b++;
/* 3375 */             bool = true;
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/* 3380 */         if (!bool) {
/*      */           
/* 3382 */           q q = new q();
/* 3383 */           q.a = al;
/* 3384 */           q.b = 1;
/* 3385 */           m1.add(q);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 3391 */     l.d("--- Units ---");
/*      */     
/* 3393 */     j = 0;
/* 3394 */     for (q q : m1) {
/*      */       
/* 3396 */       if (!q.a.k()) {
/*      */         
/* 3398 */         l.d(q.a.i() + " - count:" + q.b);
/* 3399 */         j += q.b;
/*      */       } 
/*      */     } 
/* 3402 */     l.d("total:" + j);
/*      */ 
/*      */     
/* 3405 */     l.d("--- Buildings/Ignored in count ---");
/* 3406 */     k = 0;
/* 3407 */     for (q q : m1) {
/*      */       
/* 3409 */       if (q.a.k()) {
/*      */         
/* 3411 */         l.d(q.a.i() + " - count:" + q.b);
/* 3412 */         k += q.b;
/*      */       } 
/*      */     } 
/* 3415 */     l.d("total:" + k);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(String paramString) {
/* 3424 */     l.d("Team(id: " + this.i + ", name:" + this.q + "):" + paramString);
/*      */   }
/*      */   
/*      */   public abstract void a(float paramFloat);
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
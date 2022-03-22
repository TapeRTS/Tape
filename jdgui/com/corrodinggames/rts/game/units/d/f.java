/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.b.g;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class f
/*     */   extends h
/*     */ {
/*     */   float a;
/*  44 */   int b = 1;
/*     */ 
/*     */   
/*  47 */   float c = 0.0F;
/*  48 */   int d = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  55 */     paramap.a(this.a);
/*     */     
/*  57 */     paramap.a((this.b > 1));
/*     */     
/*  59 */     paramap.a(this.b);
/*     */     
/*  61 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  68 */     this.a = paramk.g();
/*     */     
/*  70 */     int i = 1;
/*     */     
/*  72 */     boolean bool = paramk.e();
/*  73 */     if (bool)
/*     */     {
/*  75 */       i = 2;
/*     */     }
/*     */     
/*  78 */     if (paramk.b() >= 31)
/*     */     {
/*  80 */       i = paramk.f();
/*     */     }
/*     */     
/*  83 */     if (i != 1)
/*     */     {
/*  85 */       a(i);
/*     */     }
/*     */     
/*  88 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  94 */     return ak.a;
/*     */   }
/*     */ 
/*     */   
/*  98 */   static e[] e = new e[10];
/*     */ 
/*     */   
/* 101 */   static e[] f = new e[10];
/* 102 */   static e[] g = new e[10];
/*     */ 
/*     */ 
/*     */   
/* 106 */   static e h = null;
/*     */ 
/*     */   
/* 109 */   static e i = null;
/*     */   
/*     */   Rect j;
/*     */   Rect k;
/*     */   
/*     */   public strictfp boolean bn() {
/* 115 */     l l = l.u();
/*     */     
/* 117 */     l.bt.a(this.dH, this.dI);
/*     */     
/* 119 */     g g = l.bt.e(l.bt.M, l.bt.N);
/*     */     
/* 121 */     if (g == null || !g.i)
/*     */     {
/* 123 */       return false;
/*     */     }
/*     */     
/* 126 */     return super.bn();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/* 132 */     l l = l.u();
/*     */     
/* 134 */     e e1 = l.bw.a(R.drawable.extractor);
/* 135 */     e e2 = l.bw.a(R.drawable.extractor_t2);
/* 136 */     e e3 = l.bw.a(R.drawable.extractor_t3);
/*     */     
/* 138 */     i = l.bw.a(R.drawable.extractor_dead);
/*     */     
/* 140 */     e = m.a(e1);
/* 141 */     f = m.a(e2);
/* 142 */     g = m.a(e3);
/*     */     
/* 144 */     e1.m();
/* 145 */     e2.m();
/* 146 */     e3.m();
/*     */     
/* 148 */     h = l.bw.a(R.drawable.extractor_back);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/* 159 */     l l = l.u();
/* 160 */     l.bz.a(this.dH, this.dI, this.dJ);
/*     */     
/* 162 */     this.D = i;
/*     */     
/* 164 */     this.m = null;
/*     */     
/* 166 */     R(0);
/*     */     
/* 168 */     this.by = false;
/*     */     
/* 170 */     l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*     */ 
/*     */ 
/*     */     
/* 174 */     com.corrodinggames.rts.gameFramework.b.f f1 = com.corrodinggames.rts.gameFramework.b.f.a(this.dH, this.dI);
/* 175 */     f1.j = -6684775;
/*     */ 
/*     */     
/* 178 */     com.corrodinggames.rts.gameFramework.b.f f2 = com.corrodinggames.rts.gameFramework.b.f.b(this.dH, this.dI);
/* 179 */     f2.a = 500.0F;
/* 180 */     f2.j = -6684775;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     l.bz.b(h.e);
/* 187 */     e e1 = l.bz.c(this.dH, this.dI, this.dJ, -1127220);
/* 188 */     if (e1 != null) {
/*     */       
/* 190 */       e1.H = 0.15F;
/* 191 */       e1.G = 1.0F;
/* 192 */       e1.aq = 2;
/* 193 */       e1.W = 35.0F;
/* 194 */       e1.X = e1.W;
/*     */       
/* 196 */       e1.V = 0.0F;
/*     */       
/* 198 */       e1.y = -13378253;
/*     */     } 
/*     */     
/* 201 */     bj();
/*     */ 
/*     */     
/* 204 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bk() {
/* 210 */     return 16;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void Q() {
/* 217 */     super.Q();
/*     */     
/* 219 */     if (this.bz) {
/*     */       
/* 221 */       this.m = null;
/*     */     }
/*     */     else {
/*     */       
/* 225 */       this.m = h;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cY() {
/* 232 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 238 */     if (this.bz)
/*     */     {
/* 240 */       return i;
/*     */     }
/*     */     
/* 243 */     if (this.bB == null)
/*     */     {
/* 245 */       return e[e.length - 1];
/*     */     }
/*     */     
/* 248 */     if (this.b == 3)
/*     */     {
/* 250 */       return g[this.bB.M()];
/*     */     }
/* 252 */     if (this.b == 2)
/*     */     {
/* 254 */       return f[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 258 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 267 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp f(boolean paramBoolean)
/*     */   {
/* 275 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     this.j = new Rect();
/* 367 */     this.k = new Rect();
/*     */     this.D = e[9];
/*     */     S(37);
/*     */     T(56);
/*     */     this.bO = 18.0F;
/*     */     this.bP = this.bO;
/*     */     this.bZ = 800.0F;
/*     */     this.bY = this.bZ;
/*     */     this.n.a(0, -1, 0, 0);
/*     */     this.o.a(this.n);
/* 377 */     Q(); } public strictfp boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*     */     super.a(paramFloat);
/*     */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/*     */     this.c = com.corrodinggames.rts.gameFramework.f.a(this.c, paramFloat * this.b);
/*     */     if (this.c == 0.0F) {
/*     */       this.c = 17.0F;
/*     */       this.d++;
/*     */       if (this.d > 7)
/*     */         this.d = 0; 
/*     */       if (this.d <= 3) {
/*     */         this.s = this.d;
/*     */       } else {
/*     */         this.s = 7 - this.d;
/*     */       } 
/*     */     } 
/*     */     this.a += paramFloat;
/*     */     if (this.a > 39.9F) {
/*     */       this.a -= 40.0F;
/*     */       this.bB.f((int)ci());
/*     */     } 
/*     */   }
/*     */   
/*     */   public strictfp boolean l() {
/* 405 */     return false; }
/*     */   public strictfp float ci() { if (this.b == 3)
/*     */       return 18.0F; 
/*     */     if (this.b == 2)
/*     */       return 12.0F; 
/*     */     return 8.0F; } public strictfp void a(af paramaf, int paramInt) {
/* 411 */     throw new RuntimeException("Unit cannot shoot");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 417 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 423 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 429 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 441 */     if (parami.h.equals(t.J())) {
/*     */       
/* 443 */       a(2);
/* 444 */       U();
/*     */     } 
/* 446 */     if (parami.h.equals(u.J())) {
/*     */       
/* 448 */       a(3);
/* 449 */       U();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 458 */     if (this.b == 1)
/*     */     {
/* 460 */       return t.J();
/*     */     }
/* 462 */     if (this.b == 2)
/*     */     {
/* 464 */       return u.J();
/*     */     }
/*     */     
/* 467 */     return s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int T() {
/* 474 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 489 */     m.b((af)this);
/*     */     
/* 491 */     if (this.b > paramInt) {
/*     */ 
/*     */       
/* 494 */       this.b = 1;
/* 495 */       this.bZ = 800.0F;
/* 496 */       if (this.bY > this.bZ)
/*     */       {
/* 498 */         this.bY = this.bZ;
/*     */       }
/*     */     } 
/*     */     
/* 502 */     if (this.b < 2 && paramInt >= 2) {
/*     */       
/* 504 */       this.bZ += 200.0F;
/* 505 */       this.bY += 200.0F;
/*     */     } 
/*     */     
/* 508 */     if (this.b < 3 && paramInt >= 3) {
/*     */       
/* 510 */       this.bZ += 1000.0F;
/* 511 */       this.bY += 1000.0F;
/*     */     } 
/*     */     
/* 514 */     this.b = paramInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 523 */     m.c((af)this);
/*     */ 
/*     */     
/* 526 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 535 */   public static int l = 0;
/*     */ 
/*     */   
/* 538 */   static s t = (s)new f$1(102);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 598 */   static s u = (s)new f$2(103);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 675 */   static ArrayList v = new ArrayList(); static {
/* 676 */     v.add(t);
/*     */   }
/* 678 */   static ArrayList w = new ArrayList(); static {
/* 679 */     w.add(u);
/*     */   }
/* 681 */   static ArrayList x = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 687 */     if (this.b == 1)
/*     */     {
/* 689 */       return v;
/*     */     }
/* 691 */     if (this.b == 2)
/*     */     {
/* 693 */       return w;
/*     */     }
/*     */ 
/*     */     
/* 697 */     return x;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.b.g;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ab
/*     */   extends o
/*     */ {
/*  28 */   static e[] a = new e[2];
/*     */ 
/*     */   
/*     */   e b;
/*     */ 
/*     */   
/*     */   int c;
/*     */ 
/*     */   
/*  37 */   int d = 0;
/*     */ 
/*     */   
/*     */   float e;
/*     */ 
/*     */   
/*     */   float f;
/*     */   
/*  45 */   int g = 0;
/*  46 */   int h = 0;
/*     */ 
/*     */   
/*     */   float i;
/*     */ 
/*     */   
/*     */   float j;
/*     */ 
/*     */   
/*     */   boolean k = false;
/*     */ 
/*     */   
/*     */   float l;
/*     */   
/*     */   float m;
/*     */   
/*     */   float n;
/*     */   
/*     */   float o;
/*     */   
/*     */   float p;
/*     */   
/*     */   float q;
/*     */   
/*     */   boolean r;
/*     */ 
/*     */   
/*     */   public static void b() {
/*  74 */     l l = l.u();
/*     */     
/*  76 */     a[0] = l.bw.a(R.drawable.fire);
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
/*     */   public void a(ap paramap) {
/*  88 */     paramap.a(this.c);
/*  89 */     paramap.a(this.d);
/*  90 */     paramap.a(this.e);
/*     */ 
/*     */ 
/*     */     
/*  94 */     paramap.c(0);
/*     */     
/*  96 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/* 101 */     this.c = paramk.f();
/* 102 */     this.d = paramk.f();
/* 103 */     this.e = paramk.g();
/*     */ 
/*     */ 
/*     */     
/* 107 */     paramk.d();
/*     */     
/* 109 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e c() {
/* 117 */     return this.b;
/*     */   }
/*     */   
/*     */   public void c_() {
/*     */     this.by = false;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*     */     this.c = paramInt;
/*     */     if (this.c == 0) {
/*     */       S(20);
/*     */       T(20);
/*     */       this.g = 0;
/*     */       this.h = 0;
/*     */       this.b = a[0];
/*     */     } else {
/*     */       throw new RuntimeException("Fire type:" + this.c + " is not supported");
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 138 */     return false;
/*     */   } public void d() { this.k = true; this.i = f.a((w)this, -5, 5, 1); this.j = f.a((w)this, -5, 5, 2); this.e = f.a((w)this, 1, 10, 3); this.d = f.a((w)this, 0, 2, 4); this.f = f.a((w)this, 7, 13, 5); l l = l.u(); b b = l.bt; l.bt.a(this.dH, this.dI); int i = l.bt.M; int j = l.bt.N; if (!b.c(i, j)) {
/*     */       this.l = 0.0F; this.m = 0.0F; this.n = 2.0F; return;
/*     */     }  g g = l.bt.r.a(i, j); boolean bool = false; if (g.e || g.h || g.k || g.f)
/*     */       bool = true;  if (bool) {
/*     */       this.l = 0.0F; this.m = 0.0F; this.n = 2.0F; return;
/*     */     }  this.l = 5.0E-4F; this.m = 1.0F; this.n = 0.3F;
/* 145 */     this.o += f.a((w)this, 0, 10, 10) / 1000.0F; } public ab(boolean paramBoolean) { super(paramBoolean);
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
/* 559 */     this.u = new Rect(); a(0); this.bO = 20.0F; this.bP = this.bO + 1.0F; this.bZ = 100.0F; this.bY = this.bZ; this.bL = -90.0F; this.by = false; this.o = 0.05F; this.p = 120.0F; R(3); }
/*     */   public void a(float paramFloat) { super.a(paramFloat); if (!this.k)
/*     */       d();  if (this.o < this.m) { this.o += this.l * paramFloat; if (this.o > this.m)
/*     */         this.o = this.m;  }
/*     */      if (this.o > this.n) { this.q = (float)(this.q + 0.01D * paramFloat); if ((!this.r && this.q > 1.0F) || this.q > 8.0F) { this.q = f.a((w)this, 0, 10, 10) / 1000.0F; f(); }
/*     */        }
/*     */      this.e += paramFloat; if (this.e > 10.0F) { this.e = 0.0F; this.d++; if (this.d > 3)
/*     */         this.d = 0;  }
/*     */      if (this.o < 0.0F)
/* 568 */       bq();  } public boolean c(float paramFloat) { e e1 = c();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 573 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 577 */     cW.a(cp());
/*     */     
/* 579 */     cW.a(0.0F, (int)-this.dJ);
/*     */     
/* 581 */     cW.a(this.i, this.j);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 590 */     cX.a(a_(false));
/*     */     
/* 592 */     l.bw.j();
/*     */     
/* 594 */     float f1 = cW.d();
/* 595 */     float f2 = cW.e();
/*     */ 
/*     */     
/* 598 */     l.bw.a(f(false), f1, f2);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 603 */     l.bw.a(this.o * 2.7F, this.o * 2.7F, f1, f2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 610 */     l.bw.a(e1, cX, cW, null);
/*     */ 
/*     */     
/* 613 */     l.bw.k();
/*     */ 
/*     */ 
/*     */     
/* 617 */     return true; }
/*     */   public void f() { this.r = true; b(-1, -1); b(0, -1); b(1, -1); b(-1, 0); b(1, 0); b(-1, 1); b(0, 1); b(1, 1); }
/*     */   public void b(int paramInt1, int paramInt2) { l l = l.u(); float f1 = (int)(this.dH + (paramInt1 * l.bt.k)); float f2 = (int)(this.dI + (paramInt2 * l.bt.l)); ab ab1 = a(f1, f2); if (ab1 == null) {
/*     */       ab ab2 = new ab(false); ab2.dH = f1; ab2.dI = f2; ab2.a(this.bB); l.bK.a(ab2); m.c(ab2);
/*     */       this.r = false;
/*     */     }  }
/*     */   static Point s = new Point();
/*     */   public static ac t = new ac(); Rect u; public static ab a(float paramFloat1, float paramFloat2) { l l = l.u();
/*     */     t.a(paramFloat1, paramFloat2);
/*     */     l.bK.a(paramFloat1, paramFloat2, 30.0F, null, 1.0F, t);
/*     */     return t.c; } public Rect a_(boolean paramBoolean) { int i = this.g;
/*     */     int j = this.h;
/*     */     i += this.d * this.dL;
/*     */     de.a(i, j, i + this.dL, j + this.dM);
/* 631 */     return de; } public ah h() { return ah.a; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 637 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean P() {
/* 643 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ai() {
/* 649 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ah() {
/* 655 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 662 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b_() {
/* 668 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ak m() {
/* 674 */     return ak.S;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 684 */     super.n();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a_() {
/* 695 */     return -1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 703 */     return false;
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
/*     */   public boolean O() {
/* 718 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(af paramaf, float paramFloat, f paramf) {
/* 728 */     this.o -= paramFloat / 100.0F;
/*     */     
/* 730 */     paramFloat = 0.0F;
/*     */     
/* 732 */     return super.a(paramaf, paramFloat, paramf);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
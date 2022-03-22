/*     */ package com.corrodinggames.rts.game.units.b;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.ad;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.e.i;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
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
/*     */ public class d
/*     */   extends b
/*     */   implements ad
/*     */ {
/*  40 */   static e a = null;
/*     */   
/*  42 */   static e b = null;
/*     */   
/*  44 */   static e c = null;
/*     */ 
/*     */ 
/*     */   
/*  48 */   static e[] d = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   float e = 0.0F;
/*     */ 
/*     */   
/*     */   float f;
/*     */ 
/*     */   
/*     */   boolean g;
/*     */   
/*  61 */   m o = new m();
/*     */ 
/*     */   
/*     */   Rect p;
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  68 */     paramap.a(this.e);
/*  69 */     paramap.a(this.f);
/*  70 */     paramap.a(this.g);
/*     */     
/*  72 */     paramap.a(this.o.size());
/*  73 */     for (af af : this.o)
/*     */     {
/*  75 */       paramap.a(af);
/*     */     }
/*     */ 
/*     */     
/*  79 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  89 */     this.e = paramk.g();
/*  90 */     this.f = paramk.g();
/*  91 */     this.g = paramk.e();
/*     */ 
/*     */     
/*  94 */     this.o.clear();
/*     */     
/*  96 */     int i = paramk.f();
/*  97 */     for (byte b1 = 0; b1 < i; b1++) {
/*     */       
/*  99 */       af af = paramk.n();
/* 100 */       if (af != null)
/*     */       {
/* 102 */         this.o.add(af);
/*     */       }
/*     */     } 
/*     */     
/* 106 */     super.a(paramk);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bK() {
/* 124 */     return i.a(this.o);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bL() {
/* 130 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/* 140 */     return ak.z;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/* 145 */     l l = l.u();
/*     */     
/* 147 */     b = l.bw.a(R.drawable.dropship);
/*     */     
/* 149 */     c = l.bw.a(R.drawable.dropship_shadow);
/*     */     
/* 151 */     a = l.bw.a(R.drawable.dropship_dead);
/*     */ 
/*     */ 
/*     */     
/* 155 */     d = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 164 */     if (this.bz)
/*     */     {
/* 166 */       return a;
/*     */     }
/* 168 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 175 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 181 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 187 */     l l = l.u();
/* 188 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 190 */     this.D = a;
/* 191 */     R(0);
/*     */     
/* 193 */     this.by = false;
/*     */     
/* 195 */     h(true);
/*     */ 
/*     */ 
/*     */     
/* 199 */     return true;
/*     */   }
/*     */   public strictfp boolean I() { return true; }
/*     */   public strictfp boolean i() { return (this.dJ >= 4.0F); }
/*     */   public strictfp boolean cd() { return true; }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz) return;  boolean bool1 = cu(); if (this.g) if (!bool1 && !this.cm && this.dJ < 4.0F) { this.f = f.a(this.f, paramFloat); if (this.f == 0.0F) { this.f = 30.0F; if (this.o.size() == 0) { this.g = false; } else { boolean bool = (this.o.size() % 2 == 0) ? true : false; float f1 = this.dH + f.i(this.bL) * -9.0F; float f2 = this.dI + f.h(this.bL) * -9.0F; f1 += f.i(this.bL + 90.0F) * (bool ? -7 : 7); f1 += f.h(this.bL + 90.0F) * (bool ? -7 : 7); af af = (af)this.o.remove(this.o.size() - 1); if (!y.a(af, f1, f2)) f1 += 10.0F;  if (!y.a(af, f1, f2)) f1 -= 20.0F;  if (!y.a(af, f1, f2)) { f1 -= 10.0F; f2 += 10.0F; }  if (!y.a(af, f1, f2)) f2 -= 20.0F;  if (!y.a(af, f1, f2)) { this.o.add(af); } else { af.cp = null; af.dH = f1; af.dI = f2; af.bD += 0.1F; af.bL = this.bL + 180.0F; af.bw = (af)this; af.bx = 45.0F; if (af instanceof r) { r r = (r)af; r.ax(); r.d(this.dH + f.i(this.bL) * -66.0F, this.dI + f.h(this.bL) * -66.0F); }  if (this.o.size() == 0)
/*     */                 this.g = false;  }  }  }  }   this.e += 2.0F * paramFloat; if (this.e > 360.0F)
/*     */       this.e -= 360.0F;  boolean bool2 = i(); if (bG())
/* 207 */       if (ao() && !bool1) { this.dJ = f.a(this.dJ, 2.0F, 0.4F * paramFloat); } else { this.dJ = f.a(this.dJ, 35.0F + f.h(this.e) * 1.5F, 0.35F * paramFloat); }   if (bool2 != i()) { this.ao = true; if (i()) { R(5); } else { R(2); }  }  } public strictfp PointF E(int paramInt) { float f1 = g(paramInt); float f2 = this.bL; float f3 = this.dH + f.i(f2) * f1; float f4 = this.dI + f.h(f2) * f1; aT.a(f3, f4); return aT; } public strictfp d(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 513 */     this.p = new Rect();
/*     */     S(45);
/*     */     T(47);
/*     */     this.bO = 20.0F;
/*     */     this.bP = this.bO + 0.0F;
/*     */     this.bZ = 500.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b;
/*     */     this.E = c;
/*     */     this.dJ = 0.0F; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/*     */     PointF pointF = E(paramInt);
/*     */     f f = f.a((af)this, pointF.a, pointF.b, this.dJ, paramInt);
/*     */     f.ar = Color.a(255, 150, 230, 40);
/*     */     f.U = 35.0F;
/*     */     f.l = paramaf;
/*     */     f.h = 80.0F;
/*     */     f.t = 4.0F;
/*     */     f.x = 2.0F;
/*     */     l l = l.u();
/*     */     l.bz.a(pointF.a, pointF.b, this.dJ, -1127220);
/*     */     l.bz.a(pointF.a, pointF.b, this.dJ, (this.cn[paramInt]).a);
/*     */     l.bu.a(e.t, 0.3F, this.dH, this.dI);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float C() {
/* 548 */     return 0.03F; } public strictfp float m() { return 140.0F; }
/*     */   public strictfp float b(int paramInt) { return 40.0F; }
/*     */   public strictfp float z() { return 2.3F; }
/*     */   public strictfp float A() { return 1.4F; }
/*     */   public strictfp float c(int paramInt) { return 99.0F; }
/*     */   public strictfp boolean E() { return false; }
/* 554 */   public strictfp float D() { return 0.05F; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 562 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 570 */     return 15.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 579 */     h(true);
/*     */     
/* 581 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void h(boolean paramBoolean) {
/* 587 */     for (af af : this.o) {
/*     */       
/* 589 */       af.cp = null;
/* 590 */       af.dH = this.dH + f.i(this.bL) * -9.0F;
/* 591 */       af.dI = this.dI + f.h(this.bL) * -9.0F;
/*     */       
/* 593 */       if (paramBoolean)
/*     */       {
/* 595 */         af.bY = -1.0F;
/*     */       }
/*     */     } 
/*     */     
/* 599 */     this.o.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean m_() {
/* 608 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void L() {
/* 614 */     this.g = true;
/* 615 */     this.f = 30.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void cY() {
/* 622 */     this.g = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/* 628 */     return 16000.0F;
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
/*     */   public strictfp boolean d(af paramaf, boolean paramBoolean) {
/* 642 */     if (this.g)
/*     */     {
/* 644 */       return false;
/*     */     }
/*     */     
/* 647 */     if (!i.a(this.o, 4, paramaf))
/*     */     {
/* 649 */       return false;
/*     */     }
/* 651 */     if (paramaf == this)
/*     */     {
/* 653 */       return false;
/*     */     }
/*     */     
/* 656 */     if (this.bB != paramaf.bB && !paramBoolean)
/*     */     {
/* 658 */       return false;
/*     */     }
/*     */     
/* 661 */     return y.a(paramaf, true, true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e(af paramaf, boolean paramBoolean) {
/* 667 */     if (!d(paramaf, paramBoolean))
/*     */     {
/* 669 */       return false;
/*     */     }
/* 671 */     y(paramaf);
/* 672 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void y(af paramaf) {
/* 679 */     paramaf.cp = (af)this;
/* 680 */     this.o.add(paramaf);
/*     */ 
/*     */     
/* 683 */     l l = l.u();
/* 684 */     l.bA.l(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(af paramaf) {
/* 691 */     if (paramaf.cp == this) {
/*     */       
/* 693 */       this.o.remove(paramaf);
/* 694 */       paramaf.cp = null;
/*     */     }
/*     */     else {
/*     */       
/* 698 */       l.f("Unit is not being transported");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {
/* 707 */     if (params == q)
/*     */     {
/* 709 */       L();
/*     */     }
/*     */ 
/*     */     
/* 713 */     if (params == r)
/*     */     {
/* 715 */       cY();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int f() {
/* 723 */     return this.o.size();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cc() {
/* 729 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c ca() {
/* 736 */     return q.J();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 741 */   public static final s q = (s)new d$1(109);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 778 */   public static final s r = (s)new d$2(110);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 812 */   static ArrayList s = new ArrayList(); static {
/* 813 */     s.add(q);
/* 814 */     s.add(r);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 825 */     return s;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean n_() {
/* 844 */     return !cu();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean u() {
/* 850 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
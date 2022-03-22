/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ 
/*     */ 
/*     */ public class n
/*     */   extends h
/*     */ {
/*  40 */   static e[] a = new e[10];
/*  41 */   static e[] b = new e[10];
/*     */   
/*  43 */   static e c = null;
/*     */ 
/*     */ 
/*     */   
/*     */   boolean d;
/*     */ 
/*     */ 
/*     */   
/*     */   boolean e;
/*     */ 
/*     */   
/*     */   float f;
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  59 */     paramap.a(this.d);
/*     */     
/*  61 */     paramap.a(this.cf);
/*     */     
/*  63 */     paramap.a(this.e);
/*     */     
/*  65 */     paramap.a(this.f);
/*     */ 
/*     */     
/*  68 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  75 */     this.d = paramk.e();
/*     */ 
/*     */     
/*  78 */     this.cf = paramk.g();
/*     */     
/*  80 */     this.e = paramk.e();
/*     */     
/*  82 */     if (paramk.b() >= 38)
/*     */     {
/*  84 */       this.f = paramk.g();
/*     */     }
/*     */ 
/*     */     
/*  88 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*  92 */   static e g = null;
/*  93 */   static e[] h = new e[10];
/*     */   
/*     */   PointF i;
/*     */   Rect j;
/*     */   
/*     */   public e v() {
/*  99 */     if (this.bB.i == -1)
/*     */     {
/* 101 */       return null;
/*     */     }
/* 103 */     return h[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b() {
/* 109 */     l l = l.u();
/*     */     
/* 111 */     c = l.bw.a(R.drawable.laser_defence_dead);
/*     */ 
/*     */     
/* 114 */     e e1 = l.bw.a(R.drawable.laser_defence);
/* 115 */     e e2 = l.bw.a(R.drawable.laser_defence_t2);
/*     */     
/* 117 */     a = m.a(e1);
/* 118 */     b = m.a(e2);
/*     */     
/* 120 */     e1.m();
/* 121 */     e1 = null;
/* 122 */     e2.m();
/* 123 */     e2 = null;
/*     */     
/* 125 */     g = l.bw.a(R.drawable.unit_icon_building_turrent);
/*     */     
/* 127 */     h = m.a(g);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 136 */     l l = l.u();
/* 137 */     l.bz.a(this.dH, this.dI, this.dJ);
/*     */     
/* 139 */     this.D = c;
/* 140 */     R(0);
/*     */     
/* 142 */     this.by = false;
/*     */     
/* 144 */     l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*     */     
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e d() {
/* 154 */     if (this.bz)
/*     */     {
/* 156 */       return c;
/*     */     }
/*     */     
/* 159 */     if (this.bB == null)
/*     */     {
/* 161 */       return a[a.length - 1];
/*     */     }
/*     */     
/* 164 */     if (!this.d)
/*     */     {
/* 166 */       return a[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 170 */     return b[this.bB.M()];
/*     */   } public void a(float paramFloat) { super.a(paramFloat); if (!bG() || this.bz)
/*     */       return;  l l = l.u(); float f = 4.0E-4F * paramFloat; if (this.d)
/*     */       f += 2.0E-4F * paramFloat;  this.cf = f.a(this.cf, 1.0F, f); if (this.cf >= 1.0F)
/*     */       this.e = false;  this.f -= paramFloat; this.i.a(E(0)); if (this.cf > 0.0F && !this.e) { float f1; if (!this.d) { f1 = 0.11F; } else { f1 = 0.05F; }  if (a(this, this.i.a, this.i.b, this.dJ, m(), f1))
/*     */         this.f = 3.0F;  if (this.cf < 0.0F) { this.cf = 0.0F; this.e = true; }  }
/*     */      if (this.e) { this.s = 1; }
/*     */     else { this.s = 0; }
/* 178 */      } public e k() { return null; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public n(boolean paramBoolean) {
/* 184 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     this.i = new PointF();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 453 */     this.j = new Rect(); a(a[0], 2); this.cf = 1.0F; this.bO = 19.0F; this.bP = this.bO; this.bZ = 500.0F; this.bY = this.bZ; this.D = a[a.length - 1]; this.n.a(0, 0, 1, 1); this.o.a(0, 0, 1, 1);
/*     */   }
/*     */   public static boolean a(r paramr, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) { l l = l.u(); float f = paramFloat4 * paramFloat4; Object[] arrayOfObject = f.a.a(); byte b; int i; for (b = 0, i = f.a.a; b < i; b++) { f f1 = (f)arrayOfObject[b]; if (!f1.A && !f1.C && (f1.J > 7.0F || (f1.J > 2.0F && f1.t > 8.0F)) && !f1.aS) { float f2 = (f1.dH - paramFloat1) * (f1.dH - paramFloat1) + (f1.dI - paramFloat2) * (f1.dI - paramFloat2); if (f2 < f && f1.dJ >= -1.0F) { boolean bool = false; if (f1.l != null) if (paramr.bB.d(f1.l.bB))
/*     */               bool = true;   if (!bool && f1.j != null)
/*     */             if (paramr.bB.c(f1.j.bB))
/* 458 */               bool = true;   if (bool) { e e1 = l.bz.a(paramFloat1, paramFloat2, paramFloat3, f1.dH, f1.dI, f1.dJ); if (e1 != null) { e1.W = 10.0F; e1.X = e1.W; }  e e2 = l.bz.b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c); if (e2 != null) { e2.Q = 0.0F; e2.R = 0.0F; e2.ao = 4; e2.W = 39.0F; e2.X = e2.W; e2.s = true; e2.F = 1.3F; e2.H = 1.1F; e2.G = 0.7F; }  f1.H -= 1.01F; if (f1.H <= 0.0F) { f1.d(); e2 = l.bz.b(f1.dH, f1.dI, f1.dJ, d.a, false, h.c); if (e2 != null) { e2.Q = 0.0F; e2.R = 0.0F; e2.ao = 4; e2.W = 23.0F; e2.X = e2.W; e2.s = true; e2.F = 0.9F; e2.H = 0.5F; e2.G = 0.2F; }  float f3 = 1.0F + f.c(-0.07F, 0.07F); l.bu.a(e.E, 0.2F, f3, f1.dH, f1.dI); }  paramr.cf -= paramFloat5; return true; }  }  }  }  return false; } public PointF E(int paramInt) { aT.a(this.dH, this.dI - 13.0F); return aT; } public boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */    public void a(af paramaf, int paramInt) {} public float m() {
/*     */     if (!this.d)
/*     */       return 160.0F; 
/*     */     return 210.0F;
/*     */   } public float c(int paramInt) {
/*     */     return 4.0F;
/*     */   } public boolean b(int paramInt, float paramFloat) {
/*     */     return false;
/*     */   } public ak c() {
/* 468 */     return ak.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 475 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float g(int paramInt) {
/* 482 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float bI() {
/* 489 */     if (this.cf != 1.0F)
/*     */     {
/* 491 */       return this.cf;
/*     */     }
/*     */     
/* 494 */     return super.bI();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bJ() {
/* 500 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float aY() {
/* 506 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(i parami) {
/* 513 */     if (parami.h.equals(k.J())) {
/*     */       
/* 515 */       a(2);
/* 516 */       U();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public c bX() {
/* 524 */     if (!this.d)
/*     */     {
/* 526 */       return k.J();
/*     */     }
/* 528 */     return s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int T() {
/* 535 */     if (this.d)
/*     */     {
/* 537 */       return 2;
/*     */     }
/* 539 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/* 545 */     if (paramInt == 1) {
/*     */       
/* 547 */       this.d = false;
/*     */     }
/* 549 */     else if (paramInt == 2) {
/*     */       
/* 551 */       if (!this.d) {
/*     */         
/* 553 */         this.d = true;
/*     */         
/* 555 */         this.bZ += 900.0F;
/* 556 */         this.bY += 900.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 560 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 567 */   static s k = (s)new n$1(102);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 644 */   static ArrayList l = new ArrayList(); static {
/* 645 */     l.add(k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList M() {
/* 651 */     return l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e(float paramFloat) {
/* 660 */     super.e(paramFloat);
/* 661 */     float f = m();
/* 662 */     y.a((af)this, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float cH() {
/* 670 */     return (l.u()).bt.k;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float cI() {
/* 676 */     return (l.u()).bt.l;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float cJ() {
/* 682 */     return super.cJ() - 8.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
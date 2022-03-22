/*     */ package com.corrodinggames.rts.game.units.b;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */   extends b
/*     */ {
/*  29 */   static e a = null;
/*     */   
/*  31 */   static e b = null;
/*     */   
/*  33 */   static e c = null;
/*     */   
/*  35 */   static e d = null;
/*     */   
/*  37 */   static e e = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  42 */   static e[] f = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean g = false;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float o;
/*     */ 
/*     */ 
/*     */   
/*  56 */   float p = 0.0F;
/*     */   
/*     */   float q;
/*     */   
/*     */   Rect r;
/*     */   
/*     */   Rect s;
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  65 */     paramap.a(this.p);
/*  66 */     paramap.a(this.o);
/*     */ 
/*     */     
/*  69 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  77 */     if (paramk.b() >= 9) {
/*     */ 
/*     */       
/*  80 */       this.p = paramk.g();
/*  81 */       this.o = paramk.g();
/*     */       
/*  83 */       if (paramk.b() == 8)
/*     */       {
/*  85 */         this.g = paramk.e();
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/*  91 */       this.o = 0.5F;
/*     */     } 
/*     */     
/*  94 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/* 102 */     return ak.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/* 107 */     l l = l.u();
/*     */     
/* 109 */     b = l.bw.a(R.drawable.helicopter);
/*     */     
/* 111 */     c = l.bw.a(R.drawable.helicopter_blades);
/*     */ 
/*     */     
/* 114 */     d = l.bw.a(R.drawable.helicopter_shadow);
/*     */     
/* 116 */     e = l.bw.a(R.drawable.helicopter_shadow_blades);
/*     */ 
/*     */     
/* 119 */     a = l.bw.a(R.drawable.helicopter_dead);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     f = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 133 */     if (this.bz)
/*     */     {
/* 135 */       return a;
/*     */     }
/* 137 */     return f[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 144 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 151 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 158 */     l l = l.u();
/* 159 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 161 */     this.D = a;
/* 162 */     R(0);
/*     */     
/* 164 */     this.by = false;
/*     */     
/* 166 */     return true;
/*     */   }
/*     */   public strictfp void n() { super.n(); this.dJ = 20.0F; this.o = 0.5F; }
/*     */   public strictfp boolean I() { return true; }
/*     */   public strictfp boolean i() { return true; }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.bz)
/*     */       return;  this.o = com.corrodinggames.rts.gameFramework.f.a(this.o, 0.5F, 0.003F * paramFloat); this.q += 70.0F * this.o * paramFloat; if (this.q >= 360.0F) { this.q -= 360.0F; this.q += com.corrodinggames.rts.gameFramework.f.a((af)this, 0, 4); }  if (this.o > 0.4F) { this.p += 2.0F * paramFloat; if (this.p > 360.0F)
/*     */         this.p -= 360.0F;  this.dJ = com.corrodinggames.rts.gameFramework.f.a(this.dJ, 20.0F + com.corrodinggames.rts.gameFramework.f.h(this.p) * 1.5F, 0.1F * paramFloat); }  }
/* 174 */   public strictfp void a(af paramaf, int paramInt) { PointF pointF1 = E(paramInt); com.corrodinggames.rts.game.f f1 = com.corrodinggames.rts.game.f.a((af)this, pointF1.a, pointF1.b, this.dJ, paramInt); PointF pointF2 = J(paramInt); f1.K = pointF2.a; f1.L = pointF2.b; f1.U = 17.0F; f1.l = paramaf; f1.h = 30.0F; f1.t = 8.0F; f1.S = false; f1.ar = Color.a(255, 180, 180, 0); f1.A = true; f1.aR = false; l l = l.u(); float f2 = 1.0F + com.corrodinggames.rts.gameFramework.f.c(-0.08F, 0.08F); l.bu.a(e.r, 0.2F, f2, pointF1.a, pointF1.b); l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a); l.bz.a(pointF1.a, pointF1.b, this.dJ, -1118720); } public strictfp float m() { return 130.0F; } public strictfp f(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     this.r = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 421 */     this.s = new Rect(); S(26); T(46); this.bO = 13.0F; this.bP = this.bO + 2.0F; this.bZ = 150.0F; this.bY = this.bZ; this.D = b; this.E = d;
/*     */     this.dJ = 0.0F;
/*     */     this.o = 0.14F;
/*     */     this.q = 0.0F;
/*     */     R(5); }
/* 426 */   public strictfp float b(int paramInt) { return 60.0F; } public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 428 */       return false;
/*     */     }
/*     */     
/* 431 */     if (!this.bz) {
/*     */       
/* 433 */       Paint paint = aK();
/*     */       
/* 435 */       l l = l.u();
/*     */       
/* 437 */       this.s.a(0, 0, c.l(), c.k());
/*     */       
/* 439 */       float f1 = this.q;
/*     */       
/* 441 */       if (this.bS);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 446 */       l.bw.a(c, this.s, this.dH - 
/* 447 */           (l.u()).cd, this.dI - 
/* 448 */           (l.u()).ce - this.dJ, f1, paint);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 453 */     return true; } public strictfp float z() { if (this.dJ < 15.0F)
/*     */       return 0.0F;  return 2.2F; }
/*     */   public strictfp float aX() { return 0.1F; }
/*     */   public strictfp float A() { return 6.0F; }
/*     */   public strictfp float B() { return 0.4F; }
/*     */   public strictfp boolean bd() { return true; }
/*     */   public strictfp boolean be() { return true; }
/*     */   public strictfp float c(int paramInt) { return 16.0F; }
/*     */   public strictfp Rect a_(boolean paramBoolean) { return super.a_(paramBoolean); }
/* 462 */   public strictfp float C() { return 0.07F; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 468 */     return 0.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 476 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 482 */     return 7.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
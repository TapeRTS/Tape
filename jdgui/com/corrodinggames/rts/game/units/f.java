/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.gameFramework.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.n;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class f
/*     */   extends q
/*     */ {
/*  30 */   public float a = 2000.0F;
/*  31 */   public float b = 0.0F;
/*     */   
/*  33 */   public float c = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   public float d = 2000.0F;
/*     */   
/*     */   public float e;
/*     */   
/*     */   public float f;
/*     */   public boolean g = true;
/*  45 */   public float h = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   static Paint k = new Paint(); static Paint l; static {
/*  67 */     k.a(10.0F);
/*  68 */     k.b(Color.a(100, 160, 0, 0));
/*  69 */     k.a(Paint.Style.b);
/*  70 */   } static Paint m = new Paint(); static Paint n; static Paint o; static {
/*  71 */     m.a(k);
/*  72 */     m.b(Color.a(180, 160, 0, 0));
/*     */ 
/*     */     
/*  75 */     l = new Paint();
/*  76 */     l.a(2.0F);
/*  77 */     l.b(Color.a(100, 160, 0, 0));
/*  78 */     l.a(Paint.Style.b);
/*  79 */     n = new Paint();
/*  80 */     n.a(l);
/*  81 */     n.b(Color.a(180, 160, 0, 0));
/*     */ 
/*     */     
/*  84 */     o = new Paint();
/*  85 */     o.a(2.0F);
/*  86 */     o.b(Color.a(50, 255, 255, 255));
/*  87 */     o.a(Paint.Style.b);
/*     */ 
/*     */     
/*  90 */     p = new Paint(o);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 531 */     r = new PointF();
/*     */   }
/*     */   static Paint p; boolean q; static final PointF r;
/*     */   public strictfp PointF a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 535 */     if (paramFloat3 > this.d) paramFloat3 = this.d;
/*     */ 
/*     */     
/* 538 */     float f1 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, paramFloat1, paramFloat2);
/*     */     
/* 540 */     float f2 = this.d - paramFloat3;
/*     */     
/* 542 */     float f3 = this.dH + com.corrodinggames.rts.gameFramework.f.i(f1) * f2;
/* 543 */     float f4 = this.dI + com.corrodinggames.rts.gameFramework.f.h(f1) * f2;
/*     */     
/* 545 */     r.a = f3;
/* 546 */     r.b = f4;
/*     */     
/* 548 */     return r;
/*     */   }
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*     */     paramap.c(0);
/*     */     paramap.a(this.a);
/*     */     paramap.a(this.b);
/*     */     paramap.a(this.c);
/*     */     paramap.a(this.d);
/*     */     paramap.a(this.e);
/*     */     paramap.a(this.f);
/*     */     paramap.a(this.g);
/*     */     paramap.a(this.h);
/*     */     super.a(paramap);
/*     */   }
/*     */   
/*     */   public strictfp void a(k paramk) {
/*     */     paramk.d();
/*     */     this.a = paramk.g();
/*     */     this.b = paramk.g();
/*     */     this.c = paramk.g();
/*     */     this.d = paramk.g();
/*     */     this.e = paramk.g();
/*     */     this.f = paramk.g();
/*     */     this.g = paramk.e();
/*     */     this.h = paramk.g();
/*     */     super.a(paramk);
/*     */     if (!this.bz)
/*     */       (l.u()).bE.a(this); 
/*     */   }
/*     */   
/*     */   public strictfp ak b() {
/*     */     if (this.q)
/*     */       return ak.X; 
/*     */     return ak.W;
/*     */   }
/*     */   
/*     */   public static strictfp void c() {
/*     */     l l = l.u();
/*     */   }
/*     */   
/*     */   public strictfp f(boolean paramBoolean) {
/*     */     super(paramBoolean);
/*     */   }
/*     */   
/*     */   public strictfp f f() {
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof f && !af.bz && af != this) {
/*     */         f f1 = (f)af;
/*     */         if (f1.q == this.q)
/*     */           return f1; 
/*     */       } 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*     */     super.a(paramFloat);
/*     */     if (this.bz)
/*     */       return; 
/*     */     if (this.g) {
/*     */       this.g = false;
/*     */       f f1 = f();
/*     */       if (f1 != null) {
/*     */         f1.e = this.dH;
/*     */         f1.f = this.dI;
/*     */         f1.d = this.d;
/*     */         bU();
/*     */       } else {
/*     */         this.e = this.dH;
/*     */         this.f = this.dI;
/*     */         if (!this.q)
/*     */           l.d("DamagingBorder created " + this.e + "," + this.f + " size:" + this.d); 
/*     */         (l.u()).bE.a(this);
/*     */       } 
/*     */     } 
/*     */     if (this.q) {
/*     */       this.a = this.d;
/*     */       this.dH = this.e;
/*     */       this.dI = this.f;
/*     */     } else if (this.a > this.d) {
/*     */       this.b += 2.5E-4F * paramFloat;
/*     */       this.a -= this.b;
/*     */       this.i = true;
/*     */       float f1 = com.corrodinggames.rts.gameFramework.f.b(this.dH, this.dI, this.e, this.f);
/*     */       float f2 = com.corrodinggames.rts.gameFramework.f.d(this.dH, this.dI, this.e, this.f);
/*     */       if (f1 > 1.0F) {
/*     */         float f3 = this.b;
/*     */         if (f3 > f1 * paramFloat)
/*     */           f3 = f1 * paramFloat; 
/*     */         this.dH += f3 * com.corrodinggames.rts.gameFramework.f.i(f2) * paramFloat;
/*     */         this.dI += f3 * com.corrodinggames.rts.gameFramework.f.h(f2) * paramFloat;
/*     */       } 
/*     */     } else {
/*     */       this.i = false;
/*     */       this.dH = (float)(this.dH + (this.e - this.dH) * 0.003D * paramFloat);
/*     */       this.dI = (float)(this.dI + (this.f - this.dI) * 0.003D * paramFloat);
/*     */     } 
/*     */     if (this.a < this.d) {
/*     */       this.a = this.d;
/*     */       this.b = 0.0F;
/*     */     } 
/*     */     if (this.d < 0.0F) {
/*     */       bU();
/*     */       return;
/*     */     } 
/*     */     this.c -= paramFloat;
/*     */     if (!this.bz && this.c <= 0.0F && !this.q) {
/*     */       this.c = 2.0F;
/*     */       float f1 = this.a * com.corrodinggames.rts.gameFramework.f.i(45.0F);
/*     */       float f2 = this.dH - f1;
/*     */       float f3 = this.dH + f1;
/*     */       float f4 = this.dI - f1;
/*     */       float f5 = this.dI + f1;
/*     */       float f6 = this.a * this.a;
/*     */       for (af af : af.bt()) {
/*     */         if (af.dH > f2 && af.dH < f3 && af.dI > f4 && af.dI < f5)
/*     */           continue; 
/*     */         float f7 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, af.dH, af.dI);
/*     */         if (f7 < f6)
/*     */           continue; 
/*     */         if (af.bz || af.bB == m.g)
/*     */           continue; 
/*     */         if (af.o_())
/*     */           continue; 
/*     */         float f8 = 0.5F + af.bY * 0.002F + af.bZ * 0.001F;
/*     */         f8 *= this.h;
/*     */         af.a(this, f8, (com.corrodinggames.rts.game.f)null);
/*     */       } 
/*     */     } 
/*     */     if (!this.q) {
/*     */       l l = l.u();
/*     */       this.j += paramFloat;
/*     */       if (this.j > 3.0F) {
/*     */         this.j = 0.0F;
/*     */         int i = l.cb + com.corrodinggames.rts.gameFramework.f.a(0, (int)l.ch);
/*     */         int j = l.cc + com.corrodinggames.rts.gameFramework.f.a(0, (int)l.ci);
/*     */         float f1 = com.corrodinggames.rts.gameFramework.f.a(this.dH, this.dI, i, j);
/*     */         if (f1 > (this.a + 30.0F) * (this.a + 30.0F)) {
/*     */           l.bt.a(i, j);
/*     */           int k = l.bt.M;
/*     */           int m = l.bt.N;
/*     */           l.bt.a(k, m);
/*     */           e e = l.bz.b((l.bt.M + 10), (l.bt.N - 10 + 10), 0.0F, d.a, true, h.a);
/*     */           if (e != null) {
/*     */             e.ap = 19;
/*     */             e.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0F, 180.0F);
/*     */             e.s = true;
/*     */             e.aq = 1;
/*     */             e.F = 0.7F;
/*     */             e.W = 30.0F;
/*     */             e.X = e.W;
/*     */             e.H = 0.2F;
/*     */             e.G = 1.2F;
/*     */             e.y = Color.a(255, 173, 12, 12);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public strictfp int s() {
/*     */     return 0;
/*     */   }
/*     */   
/*     */   public strictfp boolean t() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public strictfp boolean o_() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public strictfp boolean a(l paraml) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {
/*     */     l l = l.u();
/*     */     float f1 = this.dH - l.cd;
/*     */     float f2 = this.dI - l.ce;
/*     */     Paint paint = this.i ? m : k;
/*     */     if (this.q)
/*     */       paint = o; 
/*     */     float f3 = this.a;
/*     */     if (this.g) {
/*     */       f f4 = f();
/*     */       if (f4 != null)
/*     */         f3 = f4.d - 300.0F; 
/*     */     } 
/*     */     l.bw.a(f1, f2, f3, paint);
/*     */   }
/*     */   
/*     */   public strictfp boolean a(int paramInt1, int paramInt2) {
/*     */     l l = l.u();
/*     */     l.bw.h();
/*     */     l.bw.a(l.bE.w);
/*     */     float f1 = l.bE.b(this.a);
/*     */     Paint paint = this.i ? n : l;
/*     */     if (this.q)
/*     */       paint = p; 
/*     */     n.a(l.bw, paramInt1, paramInt2, f1, paint);
/*     */     l.bw.i();
/*     */     return true;
/*     */   }
/*     */   
/*     */   public strictfp void a(int paramInt) {
/*     */     this.a = (paramInt * 100);
/*     */     this.d = (paramInt * 100);
/*     */   }
/*     */   
/*     */   public strictfp boolean a(float paramFloat1, float paramFloat2) {
/*     */     float f1 = this.d * this.d;
/*     */     float f2 = com.corrodinggames.rts.gameFramework.f.a(this.e, this.f, paramFloat1, paramFloat2);
/*     */     return (f2 >= f1);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
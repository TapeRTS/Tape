/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.l;
/*     */ import com.corrodinggames.rts.game.units.a.o;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.f;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends h
/*     */ {
/*  34 */   static e a = null;
/*  35 */   static e[] b = new e[10];
/*     */ 
/*     */   
/*  38 */   static e c = null;
/*     */   
/*  40 */   static e d = null;
/*     */   
/*     */   float e;
/*     */   
/*     */   public float f;
/*     */   
/*     */   public float g;
/*     */   
/*     */   public int h;
/*     */   
/*     */   public float i;
/*     */   
/*     */   public float j;
/*     */   
/*     */   float k;
/*     */   int l;
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  58 */     paramap.a(this.e);
/*     */     
/*  60 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  67 */     this.e = paramk.g();
/*     */     
/*  69 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  74 */     l l = l.u();
/*     */     
/*  76 */     a = l.bw.a(R.drawable.base);
/*     */     
/*  78 */     c = l.bw.a(R.drawable.base_dead);
/*     */     
/*  80 */     d = l.bw.a(R.drawable.base_back);
/*     */ 
/*     */     
/*  83 */     b = m.a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/*  90 */     return ak.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/*  99 */     l l = l.u();
/*     */ 
/*     */     
/* 102 */     this.D = c;
/*     */     
/* 104 */     this.m = null;
/*     */     
/* 106 */     R(0);
/*     */     
/* 108 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     a(u.d);
/*     */ 
/*     */ 
/*     */     
/* 117 */     float f1 = this.dH;
/* 118 */     float f2 = this.dI;
/* 119 */     float f3 = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     l.bz.b(h.e);
/*     */ 
/*     */     
/* 127 */     e e1 = l.bz.a(f1, f2, this.dJ, Color.a(255, 255, 255, 255));
/* 128 */     if (e1 != null) {
/*     */       
/* 130 */       e1.H = 8.0F;
/* 131 */       e1.G = 5.0F;
/* 132 */       e1.F = 0.9F;
/* 133 */       e1.W = 20.0F;
/* 134 */       e1.X = e1.W;
/*     */       
/* 136 */       e1.s = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     l.bz.b(h.e);
/* 144 */     e1 = l.bz.c(f1, f2, f3, -1127220);
/* 145 */     if (e1 != null) {
/*     */       
/* 147 */       e1.H = 0.2F;
/* 148 */       e1.G = 2.0F;
/* 149 */       e1.aq = 2;
/* 150 */       e1.W = 45.0F;
/* 151 */       e1.X = e1.W;
/*     */       
/* 153 */       e1.V = 0.0F;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 168 */     float f4 = 40.0F;
/* 169 */     float f5 = 70.0F;
/* 170 */     l.bz.a(this.dH, this.dI, this.dJ, f4, f5);
/*     */ 
/*     */     
/* 173 */     f.a(this.dH, this.dI);
/*     */     
/* 175 */     (f.b(this.dH, this.dI)).a = 800.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void Q() {
/* 197 */     super.Q();
/*     */     
/* 199 */     if (this.bz) {
/*     */       
/* 201 */       this.m = null;
/*     */     }
/*     */     else {
/*     */       
/* 205 */       this.m = d;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 212 */     if (this.bz)
/*     */     {
/* 214 */       return c;
/*     */     }
/* 216 */     return b[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 223 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp d(boolean paramBoolean) {
/* 229 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     this.k = 20.0F;
/* 256 */     this.l = 0; this.D = a; this.m = d; S(53); T(68); this.bO = 30.0F;
/*     */     this.bP = this.bO;
/*     */     this.bZ = 4000.0F;
/*     */     this.bY = this.bZ;
/*     */     R(3);
/*     */     this.n.a(-1, -1, 1, 1);
/* 262 */     this.o.a(-1, -1, 1, 2); } public strictfp RectF cp() { RectF rectF = super.cp();
/*     */     
/* 264 */     rectF.a(6.0F, 0.0F);
/*     */     
/* 266 */     return rectF; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 272 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     super.a(paramFloat);
/*     */ 
/*     */     
/* 287 */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/* 290 */     this.k = f.a(this.k, paramFloat);
/*     */     
/* 292 */     if (this.k == 0.0F) {
/*     */       
/* 294 */       this.k = 5.0F;
/* 295 */       this.l++;
/*     */       
/* 297 */       if (this.l > 6) {
/*     */         
/* 299 */         this.l = 0;
/* 300 */         this.k = 70.0F;
/*     */       } 
/* 302 */       if (this.l <= 3) {
/*     */         
/* 304 */         this.s = this.l;
/*     */       }
/*     */       else {
/*     */         
/* 308 */         this.s = 6 - this.l;
/*     */       } 
/*     */     } 
/*     */     
/* 312 */     this.f += paramFloat;
/* 313 */     this.h++;
/* 314 */     this.i += 10.0F;
/*     */     
/* 316 */     if (this.j > paramFloat)
/*     */     {
/* 318 */       this.j = paramFloat;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 332 */     this.g += paramFloat;
/*     */     
/* 334 */     this.e += paramFloat;
/* 335 */     if (this.e > 39.9F) {
/*     */       
/* 337 */       this.e -= 40.0F;
/* 338 */       this.bB.f((int)ci());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float ci() {
/* 346 */     return 18.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float q(int paramInt) {
/* 354 */     return 70.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 362 */     f f = f.a((af)this, this.dH, this.dI);
/*     */     
/* 364 */     PointF pointF = J(paramInt);
/*     */     
/* 366 */     f.K = pointF.a;
/* 367 */     f.L = pointF.b;
/*     */     
/* 369 */     f.ar = Color.a(255, 230, 230, 50);
/*     */     
/* 371 */     f.U = q(paramInt);
/* 372 */     f.l = paramaf;
/*     */     
/* 374 */     f.h = 180.0F;
/*     */     
/* 376 */     f.t = 2.0F;
/* 377 */     f.r = 5.0F;
/*     */     
/* 379 */     f.aH = true;
/* 380 */     f.aM = true;
/* 381 */     f.aQ = true;
/*     */     
/* 383 */     f.aG = true;
/*     */     
/* 385 */     l l = l.u();
/*     */ 
/*     */     
/* 388 */     l.bz.a((w)f, -1118720);
/*     */ 
/*     */     
/* 391 */     l.bu.a(e.l, 0.8F, this.dH, this.dI);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 399 */     return 280.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 405 */     return 70.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 411 */     return 999.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean b(int paramInt, float paramFloat) {
/* 417 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 422 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(ArrayList<o> paramArrayList, int paramInt) {
/* 448 */     paramArrayList.add(new o());
/* 449 */     paramArrayList.add(new l((al)ak.h, Integer.valueOf(1)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 455 */     return c().a(T());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(af paramaf, float paramFloat, f paramf) {
/* 465 */     if (paramFloat > 2500.0F)
/*     */     {
/* 467 */       paramFloat = 2500.0F;
/*     */     }
/* 469 */     return super.a(paramaf, paramFloat, paramf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bx() {
/* 477 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 486 */     super.e(paramFloat);
/* 487 */     float f = m();
/* 488 */     y.a((af)this, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int s() {
/* 496 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bk() {
/* 503 */     return 35;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
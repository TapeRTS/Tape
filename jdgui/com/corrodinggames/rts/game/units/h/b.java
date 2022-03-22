/*     */ package com.corrodinggames.rts.game.units.h;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.m;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.a.v;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.d;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ public class b
/*     */   extends f
/*     */   implements d
/*     */ {
/*  30 */   static e a = null;
/*  31 */   static e b = null;
/*  32 */   static e c = null;
/*  33 */   static e d = null;
/*     */   
/*  35 */   static e[] e = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  41 */     if (this.bB.i == -1)
/*     */     {
/*  43 */       return null;
/*     */     }
/*  45 */     return com.corrodinggames.rts.game.units.e.b.h[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak p_() {
/*  51 */     return ak.L;
/*     */   }
/*     */ 
/*     */   
/*  55 */   PointF[] f = new PointF[6];
/*  56 */   PointF[] g = new PointF[this.f.length];
/*     */   
/*     */   Rect h;
/*     */   
/*     */   public strictfp PointF[] b() {
/*  61 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF[] c() {
/*  67 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/*  74 */     return 6000.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void K() {
/*  80 */     l l = l.u();
/*     */     
/*  82 */     b = l.bw.a(R.drawable.builder_ship);
/*  83 */     a = l.bw.a(R.drawable.builder_ship_dead);
/*  84 */     c = l.bw.a(R.drawable.builder_ship_turret);
/*     */ 
/*     */     
/*  87 */     e = m.a(b);
/*     */     
/*  89 */     d = a(b, b.l(), b.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  98 */     if (this.bz)
/*     */     {
/* 100 */       return a;
/*     */     }
/* 102 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 108 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 115 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/* 120 */     return ((l.u()).by.renderExtraShadows && this.dJ > -2.0F);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/* 124 */     return 3.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/* 128 */     return 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 135 */     l l = l.u();
/* 136 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 138 */     this.D = a;
/* 139 */     R(0);
/*     */     
/* 141 */     this.by = false;
/*     */     
/* 143 */     return true;
/*     */   }
/*     */   public strictfp float m() {
/*     */     return 240.0F;
/*     */   } public strictfp float z() {
/*     */     return 0.8F;
/*     */   }
/*     */   public strictfp float A() {
/*     */     return 1.9F;
/*     */   }
/* 153 */   public strictfp b(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     this.h = new Rect(); b(b); this.bO = 13.0F; this.bP = this.bO;
/*     */     this.bZ = 500.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b;
/*     */     for (byte b1 = 0; b1 < this.f.length; b1++) {
/*     */       this.f[b1] = new PointF();
/*     */       this.g[b1] = new PointF();
/*     */     }  }
/* 240 */   public strictfp float B() { return 0.12F; } public strictfp void a(float paramFloat) { super.a(paramFloat);
/*     */     
/* 242 */     if (!this.bz)
/*     */     {
/* 244 */       com.corrodinggames.rts.game.units.e.b.a(paramFloat, this); }  } public strictfp float c(int paramInt) { return 3.5F; } public strictfp float w(int paramInt) { return 0.25F; } public strictfp float C() {
/*     */     return 0.03F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.1F;
/*     */   }
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {
/* 251 */     super.a(paramFloat, paramBoolean);
/* 252 */     if (!this.bz)
/*     */     {
/* 254 */       com.corrodinggames.rts.game.units.e.b.b(paramFloat, this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 262 */     if (!super.c(paramFloat))
/*     */     {
/* 264 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 268 */     l l = l.u();
/*     */ 
/*     */     
/* 271 */     y.a((r)this);
/*     */     
/* 273 */     if (!this.bz) {
/*     */       
/* 275 */       float f1 = (this.cn[0]).f / e(0);
/* 276 */       if (f1 != 0.0F) {
/*     */         
/* 278 */         PointF pointF = E(0);
/* 279 */         l.bw.h();
/* 280 */         l.bw.b(pointF.a - l.cd, pointF.b - l.ce - this.dJ);
/* 281 */         l.bw.a(f1, f1);
/* 282 */         if (W()) {
/*     */           
/* 284 */           l.bw.a(com.corrodinggames.rts.game.units.e.b.f, 0.0F, 0.0F, null);
/*     */         }
/*     */         else {
/*     */           
/* 288 */           l.bw.a(com.corrodinggames.rts.game.units.e.b.e, 0.0F, 0.0F, null);
/*     */         } 
/* 290 */         l.bw.i();
/*     */       } 
/*     */     } 
/*     */     
/* 294 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 301 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 308 */     return 11.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bg() {
/* 317 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF F(int paramInt) {
/* 325 */     float f1 = 8.0F;
/*     */     
/* 327 */     float f2 = this.dH + f.i(this.bL) * f1;
/* 328 */     float f3 = this.dI + f.h(this.bL) * f1;
/*     */     
/* 330 */     aU.a(f2, f3);
/* 331 */     return aU;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 338 */     return (120 - paramInt * 28);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 346 */     return 30.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float f(int paramInt) {
/* 351 */     return 1.3F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(af paramaf) {
/* 358 */     if (paramaf.q())
/*     */     {
/* 360 */       return false;
/*     */     }
/*     */     
/* 363 */     if (paramaf.bw())
/*     */     {
/* 365 */       return true;
/*     */     }
/* 367 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */   
/* 376 */   static s i = (s)new m(false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(ArrayList<s> paramArrayList, int paramInt) {
/* 413 */     paramArrayList.add(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 429 */     paramArrayList.add(new v((al)ak.a, 1, Integer.valueOf(1)));
/* 430 */     paramArrayList.add(new v((al)ak.f, 1, Integer.valueOf(2)));
/* 431 */     paramArrayList.add(new v((al)ak.g, 1, Integer.valueOf(3)));
/* 432 */     paramArrayList.add(new v((al)ak.b, 1, Integer.valueOf(4)));
/* 433 */     paramArrayList.add(new v((al)ak.c, 1, Integer.valueOf(5)));
/*     */     
/* 435 */     paramArrayList.add(new v((al)ak.d, 1, Integer.valueOf(6)));
/*     */     
/* 437 */     paramArrayList.add(new v((al)ak.J, 1, Integer.valueOf(7)));
/*     */     
/* 439 */     paramArrayList.add(new v((al)ak.y, 1, Integer.valueOf(8)));
/* 440 */     paramArrayList.add(new v((al)ak.B, 1, Integer.valueOf(9)));
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
/* 451 */     return p_().a(T());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int y() {
/* 464 */     return 145;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean w(af paramaf) {
/* 471 */     return true;
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
/*     */   public strictfp float f(al paramal) {
/* 492 */     int i = y();
/*     */     
/* 494 */     int j = paramal.a((af)this);
/*     */     
/* 496 */     if (j == 0 && paramal.p())
/*     */     {
/* 498 */       j = 110;
/*     */     }
/*     */     
/* 501 */     i += j;
/*     */     
/* 503 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int s(af paramaf) {
/* 509 */     return (int)f(paramaf.r());
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp int t(af paramaf) {
/* 514 */     return (int)f(paramaf.r());
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
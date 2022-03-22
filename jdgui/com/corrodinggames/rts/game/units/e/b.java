/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
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
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ag;
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
/*     */ public class b
/*     */   extends j
/*     */   implements d
/*     */ {
/*  35 */   static e a = null;
/*     */   
/*  37 */   public static e b = null;
/*  38 */   static e c = null;
/*     */   
/*  40 */   public static e[] d = new e[10];
/*     */   
/*  42 */   public static e e = null;
/*  43 */   public static e f = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak f() {
/*  48 */     return ak.h;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  53 */   static e g = null;
/*  54 */   public static e[] h = new e[10];
/*     */ 
/*     */   
/*  57 */   PointF[] i = new PointF[6];
/*  58 */   PointF[] j = new PointF[this.i.length]; static Paint k;
/*     */   static Paint l;
/*     */   static Paint m;
/*     */   
/*     */   public strictfp PointF[] b() {
/*  63 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF[] c() {
/*  69 */     return this.j;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  99 */     if (this.bB.i == -1)
/*     */     {
/* 101 */       return null;
/*     */     }
/* 103 */     return h[this.bB.M()];
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void K() {
/* 108 */     l l = l.u();
/*     */     
/* 110 */     a = l.bw.a(R.drawable.builder);
/*     */     
/* 112 */     b = l.bw.a(R.drawable.builder_dead);
/*     */     
/* 114 */     c = a(a, a.l(), a.k());
/*     */     
/* 116 */     d = m.a(a);
/*     */     
/* 118 */     e = l.bw.a(R.drawable.builder_charge);
/* 119 */     f = l.bw.a(R.drawable.builder_decharge);
/*     */ 
/*     */     
/* 122 */     g = l.bw.a(R.drawable.unit_icon_builder);
/*     */     
/* 124 */     h = m.a(g);
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
/*     */   public strictfp boolean a(af paramaf) {
/* 136 */     if (paramaf.q())
/*     */     {
/* 138 */       return false;
/*     */     }
/*     */     
/* 141 */     if (paramaf.bw())
/*     */     {
/* 143 */       return true;
/*     */     }
/* 145 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 152 */     if (this.bz)
/*     */     {
/* 154 */       return b;
/*     */     }
/* 156 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 163 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 170 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 177 */     l l = l.u();
/*     */ 
/*     */     
/* 180 */     this.D = b;
/* 181 */     R(0);
/*     */     
/* 183 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     a(u.b);
/*     */ 
/*     */     
/* 195 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp b(boolean paramBoolean) {
/* 202 */     super(paramBoolean); k = new Paint(); k.a(40, 0, 255, 0); k.a(true); k.a(2.0F); k.a(Paint.Cap.b); l = new Paint(); l.a(k); l.a(55, 255, 60, 60); m = new Paint();
/*     */     m.a(60, 255, 255, 255);
/* 204 */     S(20);
/*     */     
/* 206 */     T(20);
/*     */     
/* 208 */     this.bO = 10.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     this.bP = this.bO + 2.0F;
/*     */ 
/*     */ 
/*     */     
/* 217 */     this.bZ = 170.0F;
/* 218 */     this.bY = this.bZ;
/*     */     
/* 220 */     this.D = a;
/*     */     
/* 222 */     for (byte b1 = 0; b1 < this.i.length; b1++) {
/*     */       
/* 224 */       this.i[b1] = new PointF();
/* 225 */       this.j[b1] = new PointF();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(float paramFloat, d paramd) {
/* 234 */     r r = (r)paramd;
/*     */     
/* 236 */     PointF[] arrayOfPointF1 = paramd.b();
/* 237 */     PointF[] arrayOfPointF2 = paramd.c();
/*     */     
/* 239 */     af af = r.V();
/*     */     
/* 241 */     r.aC = (af != null);
/*     */     
/* 243 */     if (af != null) {
/*     */       
/* 245 */       for (byte b1 = 0; b1 < arrayOfPointF1.length; b1++)
/*     */       {
/* 247 */         PointF pointF1 = arrayOfPointF1[b1];
/* 248 */         PointF pointF2 = arrayOfPointF2[b1];
/*     */         
/* 250 */         pointF1.a = f.a(pointF1.a, pointF2.a, 0.1F * paramFloat);
/* 251 */         pointF1.b = f.a(pointF1.b, pointF2.b, 0.1F * paramFloat);
/*     */         
/* 253 */         pointF1.a += (pointF2.a - pointF1.a) * 0.04F * paramFloat;
/* 254 */         pointF1.b += (pointF2.b - pointF1.b) * 0.04F * paramFloat;
/*     */         
/* 256 */         float f = af.bO * 0.75F;
/*     */         
/* 258 */         if (f.c(pointF1.a - pointF2.a) < 1.0F)
/*     */         {
/* 260 */           pointF2.a = f.d(-f, f);
/*     */         }
/*     */         
/* 263 */         if (f.c(pointF1.b - pointF2.b) < 1.0F)
/*     */         {
/* 265 */           pointF2.b = f.d(-f, f);
/*     */         
/*     */         }
/*     */       }
/*     */     
/*     */     }
/* 271 */     else if ((arrayOfPointF1[0]).a != 0.0F || (arrayOfPointF1[0]).b != 0.0F) {
/*     */ 
/*     */       
/* 274 */       for (byte b1 = 0; b1 < arrayOfPointF1.length; b1++) {
/*     */         
/* 276 */         PointF pointF1 = arrayOfPointF1[b1];
/* 277 */         PointF pointF2 = arrayOfPointF2[b1];
/* 278 */         pointF1.a = 0.0F;
/* 279 */         pointF1.b = 0.0F;
/* 280 */         pointF2.a = 0.0F;
/* 281 */         pointF2.b = 0.0F;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b(float paramFloat, d paramd) {
/* 289 */     r r = (r)paramd;
/*     */     
/* 291 */     af af = r.V();
/* 292 */     if (af != null) {
/*     */       
/* 294 */       boolean bool = r.W();
/*     */       
/* 296 */       l l = l.u();
/*     */       
/* 298 */       PointF[] arrayOfPointF = paramd.b();
/*     */       
/* 300 */       Paint paint = k;
/* 301 */       if (bool)
/*     */       {
/* 303 */         paint = l;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 308 */       ag ag = r.bi();
/*     */       
/* 310 */       for (byte b1 = 0; b1 < arrayOfPointF.length; b1++) {
/*     */         
/* 312 */         PointF pointF = arrayOfPointF[b1];
/*     */ 
/*     */ 
/*     */         
/* 316 */         float f1 = af.dH + pointF.a - l.cd;
/* 317 */         float f2 = af.dI - af.dJ + pointF.b - l.ce;
/*     */ 
/*     */         
/* 320 */         l.bw.a(ag.a + pointF.a * 0.15F - l.cd, ag.b - ag.c + pointF.b * 0.15F - l.ce - r.dJ, f1, f2, paint);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 326 */         l.bw.j();
/* 327 */         l.bw.b(f1, f2);
/* 328 */         l.bw.a(0.5F, 0.5F);
/*     */         
/* 330 */         if (bool) {
/*     */           
/* 332 */           l.bw.a(f, 0.0F, 0.0F, m);
/*     */         }
/*     */         else {
/*     */           
/* 336 */           l.bw.a(e, 0.0F, 0.0F, m);
/*     */         } 
/*     */         
/* 339 */         l.bw.k();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 352 */     super.a(paramFloat);
/*     */     
/* 354 */     if (!this.bz)
/*     */     {
/* 356 */       a(paramFloat, this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {
/* 363 */     super.a(paramFloat, paramBoolean);
/* 364 */     if (!this.bz)
/*     */     {
/* 366 */       b(paramFloat, this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 374 */     return 30.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float f(int paramInt) {
/* 379 */     return 1.3F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 388 */     if (!super.c(paramFloat))
/*     */     {
/* 390 */       return false;
/*     */     }
/*     */     
/* 393 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 397 */     if (!this.bz) {
/*     */       
/* 399 */       float f = (this.cn[0]).f / e(0);
/* 400 */       if (f != 0.0F) {
/*     */         
/* 402 */         ag ag = bi();
/* 403 */         l.bw.h();
/* 404 */         l.bw.b(ag.a - l.cd, ag.b - ag.c - l.ce);
/* 405 */         l.bw.a(f, f);
/* 406 */         if (W()) {
/*     */           
/* 408 */           l.bw.a(f, 0.0F, 0.0F, null);
/*     */         }
/*     */         else {
/*     */           
/* 412 */           l.bw.a(e, 0.0F, 0.0F, null);
/*     */         } 
/*     */ 
/*     */         
/* 416 */         l.bw.i();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 421 */     return true;
/*     */   }
/*     */ 
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
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 437 */     return 30.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 443 */     return 100.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float z() {
/* 451 */     if (cu())
/*     */     {
/* 453 */       return 0.6F;
/*     */     }
/*     */     
/* 456 */     return 0.8F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float A() {
/* 463 */     if (cu())
/*     */     {
/* 465 */       return 1.7F;
/*     */     }
/*     */     
/* 468 */     return 3.8F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 474 */     return 0.35F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 480 */     return 99.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 486 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float C() {
/* 493 */     return 0.04F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 499 */     return 0.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 511 */   static s n = (s)new m(false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 541 */     paramArrayList.add(n);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 569 */     paramArrayList.add(new v((al)ak.a, 1, Integer.valueOf(1)));
/* 570 */     paramArrayList.add(new v((al)ak.f, 1, Integer.valueOf(2)));
/* 571 */     paramArrayList.add(new v((al)ak.g, 1, Integer.valueOf(3)));
/* 572 */     paramArrayList.add(new v((al)ak.b, 1, Integer.valueOf(4)));
/* 573 */     paramArrayList.add(new v((al)ak.c, 1, Integer.valueOf(5)));
/* 574 */     paramArrayList.add(new v((al)ak.d, 1, Integer.valueOf(6)));
/* 575 */     paramArrayList.add(new v((al)ak.y, 1, Integer.valueOf(7)));
/* 576 */     paramArrayList.add(new v((al)ak.B, 1, Integer.valueOf(8)));
/* 577 */     paramArrayList.add(new v((al)ak.J, 1, Integer.valueOf(9)));
/*     */     
/* 579 */     paramArrayList.add(new v((al)ak.G, 1, Integer.valueOf(10)));
/*     */ 
/*     */     
/* 582 */     paramArrayList.add(new v((al)ak.C, 1, Integer.valueOf(14)));
/* 583 */     paramArrayList.add(new v((al)ak.D, 1, Integer.valueOf(15)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 590 */     return f().a(T());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean E() {
/* 638 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 644 */     return 10.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/* 651 */     return ((l.u()).by.renderExtraShadows && !this.bz);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/* 655 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/* 659 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean w(af paramaf) {
/* 665 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
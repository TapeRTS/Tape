/*     */ package com.corrodinggames.rts.game.units.b;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.e.l;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
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
/*     */ public class c
/*     */   extends b
/*     */ {
/*  38 */   static e a = null;
/*  39 */   static e b = null;
/*  40 */   static e c = null;
/*  41 */   static e d = null;
/*  42 */   static e[] e = new e[10];
/*     */   
/*  44 */   static e[] f = new e[10];
/*  45 */   static e[] g = new e[10];
/*     */   
/*  47 */   static e o = null;
/*  48 */   static e p = null;
/*     */ 
/*     */   
/*     */   float q;
/*     */   
/*     */   boolean r = true;
/*     */   
/*     */   boolean s = true;
/*     */   
/*  57 */   float t = 0.0F;
/*     */   
/*  59 */   float u = 0.0F;
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  63 */     paramap.a(this.r);
/*     */     
/*  65 */     paramap.a(this.t);
/*     */     
/*  67 */     paramap.a(this.u);
/*     */     
/*  69 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  75 */     this.r = paramk.e();
/*  76 */     this.s = !P();
/*     */     
/*  78 */     if (paramk.b() >= 21)
/*     */     {
/*  80 */       this.t = paramk.g();
/*     */     }
/*  82 */     if (paramk.b() >= 22)
/*     */     {
/*  84 */       this.u = paramk.g();
/*     */     }
/*     */     
/*  87 */     L();
/*     */     
/*  89 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean P() {
/*  96 */     return (this.dJ < -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean b() {
/* 101 */     if (!this.r || this.dJ < 0.0F)
/*     */     {
/* 103 */       return true;
/*     */     }
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ah h() {
/* 112 */     if (this.bT)
/*     */     {
/* 114 */       return ah.d;
/*     */     }
/*     */     
/* 117 */     if (b())
/*     */     {
/* 119 */       return ah.e;
/*     */     }
/*     */ 
/*     */     
/* 123 */     return ah.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/* 132 */     return ak.M;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void f() {
/* 137 */     l l = l.u();
/*     */     
/* 139 */     b = l.bw.a(R.drawable.amphibious_jet);
/* 140 */     c = l.bw.a(R.drawable.amphibious_jet_shadow);
/* 141 */     a = l.bw.a(R.drawable.amphibious_jet_dead);
/*     */     
/* 143 */     e = m.a(b);
/*     */     
/* 145 */     e e1 = l.bw.a(R.drawable.amphibious_jet_p1);
/* 146 */     e e2 = l.bw.a(R.drawable.amphibious_jet_p2);
/*     */ 
/*     */     
/* 149 */     f = m.a(e1);
/* 150 */     g = m.a(e2);
/*     */     
/* 152 */     o = a(e1);
/* 153 */     p = a(e2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean aM() {
/* 162 */     if (super.aM()) {
/*     */       
/* 164 */       h(true);
/* 165 */       return true;
/*     */     } 
/* 167 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 173 */     if (!super.c(paramFloat))
/*     */     {
/* 175 */       return false;
/*     */     }
/* 177 */     if (this.bz)
/*     */     {
/* 179 */       return true;
/*     */     }
/* 181 */     h(false);
/*     */ 
/*     */     
/* 184 */     if (!this.bz)
/*     */     {
/* 186 */       for (byte b1 = 0; b1 < bg(); b1++) {
/*     */         
/* 188 */         if (b1 != cY()) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 193 */           float f = (this.cn[b1]).f / e(b1);
/*     */ 
/*     */           
/* 196 */           if (f != 0.0F) {
/*     */             
/* 198 */             l l = l.u();
/*     */             
/* 200 */             PointF pointF = E(b1);
/*     */             
/* 202 */             l.bw.h();
/* 203 */             l.bw.b(pointF.a - l.cd, pointF.b - l.ce - this.dJ);
/* 204 */             l.bw.a(f * 0.7F, f * 0.7F);
/* 205 */             l.bw.a(l.e, 0.0F, 0.0F, null);
/* 206 */             l.bw.i();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 213 */     return true;
/*     */   }
/*     */ 
/*     */   
/* 217 */   protected Paint v = (Paint)new q();
/*     */ 
/*     */   
/*     */   public strictfp void h(boolean paramBoolean) {
/*     */     Paint paint;
/* 222 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 226 */     if (!paramBoolean) {
/*     */       
/* 228 */       paint = aK();
/*     */     }
/*     */     else {
/*     */       
/* 232 */       this.v.a(50, 255, 255, 255);
/* 233 */       paint = this.v;
/*     */     } 
/*     */ 
/*     */     
/* 237 */     for (byte b1 = 0; b1 <= 1; b1++) {
/*     */       e e1;
/* 239 */       PointF pointF = a(b1, paramBoolean);
/*     */       
/* 241 */       float f1 = pointF.a - l.cd;
/* 242 */       float f2 = pointF.b - l.ce;
/* 243 */       float f3 = f(false) - 90.0F;
/*     */       
/* 245 */       if (!paramBoolean)
/*     */       {
/* 247 */         f2 -= this.dJ;
/*     */       }
/*     */       
/* 250 */       if (b1 == 0) {
/*     */         
/* 252 */         if (paramBoolean) {
/* 253 */           e1 = p;
/*     */         } else {
/*     */           
/* 256 */           e1 = g[this.bB.M()];
/*     */         } 
/* 258 */         f3 += 0.0F;
/*     */       }
/*     */       else {
/*     */         
/* 262 */         if (paramBoolean) {
/* 263 */           e1 = o;
/*     */         } else {
/*     */           
/* 266 */           e1 = f[this.bB.M()];
/*     */         } 
/* 268 */         f3 -= 0.0F;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 283 */       l.bw.a(e1, f1, f2, f3, paint);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int bg() {
/* 292 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF F(int paramInt) {
/* 298 */     if (paramInt == cY())
/*     */     {
/* 300 */       return super.F(paramInt);
/*     */     }
/*     */     
/* 303 */     float f1 = f(false) - 90.0F;
/*     */     
/* 305 */     PointF pointF = a(paramInt, false);
/* 306 */     float f2 = pointF.a;
/* 307 */     float f3 = pointF.b;
/*     */     
/* 309 */     f2 += f.i(f1) * 5.0F;
/* 310 */     f3 += f.h(f1) * 5.0F;
/*     */     
/* 312 */     aU.a(f2, f3);
/* 313 */     return aU;
/*     */   }
/*     */ 
/*     */   
/* 317 */   PointF w = new PointF(); Rect x;
/*     */   
/*     */   public strictfp PointF a(int paramInt, boolean paramBoolean) {
/* 320 */     float f1 = f(false) - 90.0F;
/*     */     
/* 322 */     if (paramInt == cY())
/*     */     {
/* 324 */       throw new RuntimeException("index==2 is for base");
/*     */     }
/*     */ 
/*     */     
/* 328 */     float f2 = this.dH;
/* 329 */     float f3 = this.dI;
/*     */ 
/*     */ 
/*     */     
/* 333 */     float f4 = this.u * 4.0F;
/* 334 */     f4 = f.b(f4, 0.0F, 1.0F);
/*     */ 
/*     */     
/* 337 */     float f5 = this.u * 2.0F - 1.0F;
/* 338 */     f5 = f.b(f5, 0.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     f2 += f.i(f1) * (7.0F - 5.0F * f4);
/* 345 */     f3 += f.h(f1) * (7.0F - 5.0F * f4);
/*     */ 
/*     */     
/* 348 */     float f6 = (-90 + 180 * paramInt);
/*     */ 
/*     */ 
/*     */     
/* 352 */     f2 += f.i(f1 + f6) * (12.0F - 5.0F * f5);
/* 353 */     f3 += f.h(f1 + f6) * (12.0F - 5.0F * f5);
/*     */     
/* 355 */     this.w.a(f2, f3);
/* 356 */     return this.w;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 365 */     if (this.bz)
/*     */     {
/* 367 */       return a;
/*     */     }
/* 369 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 375 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 381 */     return d;
/*     */   }
/*     */   public strictfp boolean i() { return !b(); }
/*     */   public strictfp void L() { if (!this.s) { R(1); } else { R(5); }  } public strictfp void a(float paramFloat) { float f; super.a(paramFloat); if (!bG() || this.bz) return;  l l = l.u(); this.q += 2.0F * paramFloat; if (this.q > 360.0F)
/*     */       this.q -= 360.0F;  if (this.r) { f = 20.0F + f.h(this.q) * 1.5F; } else { f = -8.0F; }  if (this.r && !P()) { this.u = f.a(this.u, 0.0F, 0.018F * paramFloat); } else { this.u = f.a(this.u, 1.0F, 0.018F * paramFloat); }  if (f.c(this.dJ - f) > 3.0F) { float f1 = 0.6F; if (P())
/*     */         f1 /= 6.0F;  this.t = f.b(this.t, f1); this.t = f.a(this.t, f1, 0.006F * paramFloat); } else { this.t = f.a(this.t, 0.07F, 0.006F * paramFloat); }  this.dJ = f.a(this.dJ, f, this.t * paramFloat); boolean bool = false; if (this.s && P())
/* 387 */       if (!ct()) { this.r = true; } else { this.s = false; L(); bool = true; }   if (!this.s && !P()) { this.s = true; L(); bool = true; }  if (bool) { l.bz.a(this.dH, this.dI, 0.0F, 0, 0.0F, 0.0F); for (short s1 = -180; s1 < 180; s1 += 45) { float f1 = this.bL + s1; float f2 = (float)(this.dH + Math.cos(Math.toRadians(f1)) * -5.0D); float f3 = (float)(this.dI + Math.sin(Math.toRadians(f1)) * -5.0D); e e1 = l.bz.b(f2, f3, 0.0F, f1); if (e1 != null) { e1.aq = 2; e1.t = true; e1.u = 7.0F; }  }  }  } public strictfp boolean e() { l l = l.u();
/* 388 */     l.bz.b(this.dH, this.dI, this.dJ);
/* 389 */     this.D = a;
/* 390 */     R(0);
/* 391 */     this.by = false;
/*     */     
/* 393 */     return true; }
/*     */    public strictfp float q(int paramInt) {
/*     */     if (paramInt == cY())
/*     */       return 0.0F; 
/*     */     return 45.0F;
/*     */   }
/*     */   public strictfp c(boolean paramBoolean) {
/* 400 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 699 */     this.x = new Rect(); b(b); this.bO = 12.0F; this.bP = this.bO + 1.0F; this.bZ = 530.0F; this.bY = this.bZ;
/*     */     this.D = b;
/*     */     this.E = c;
/*     */     this.dJ = 0.0F;
/*     */     R(5); } public strictfp void a(af paramaf, int paramInt) { if (paramInt == cY())
/*     */       return; 
/*     */     PointF pointF = E(paramInt);
/*     */     f f = f.a((af)this, pointF.a, pointF.b, this.dJ, paramInt);
/*     */     f.ar = Color.a(255, 247, 212, 129);
/*     */     f.U = q(paramInt);
/*     */     f.l = paramaf;
/*     */     f.h = 10.0F;
/*     */     f.t = 4.0F;
/*     */     f.x = 2.0F;
/*     */     f.aQ = false;
/*     */     f.A = true;
/*     */     f.M = true;
/*     */     f.ai = 0.5F;
/*     */     f.ak = 1.0F;
/*     */     f.al = 0.1F;
/*     */     l l = l.u();
/*     */     l.bz.a(pointF.a, pointF.b, this.dJ, -1118482);
/*     */     l.bu.a(e.w, 0.2F, this.dH, this.dI); }
/*     */   public strictfp float m() { if (b())
/*     */       return 100.0F; 
/*     */     return 170.0F; }
/*     */   public strictfp float b(int paramInt) { return 110.0F; }
/*     */   public strictfp float e(int paramInt) { return (25 + paramInt * 10); }
/* 727 */   public strictfp float C() { return 0.03F; } public strictfp float f(int paramInt) { return 0.2F; } public strictfp float z() { if (!P()) return 1.4F;  return 0.4F; } public strictfp float A() { if (!P()) return 3.8F;  return 1.5F; }
/*     */   public strictfp float B() { return 0.3F; }
/*     */   public strictfp float c(int paramInt) { return 4.0F; }
/*     */   public strictfp float w(int paramInt) { return 0.35F; }
/*     */   public strictfp float y(int paramInt) { return 0.38F; }
/*     */   public strictfp boolean E() { return false; }
/* 733 */   public strictfp float D() { return 0.1F; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 741 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bd() {
/* 748 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean be() {
/* 755 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void i(float paramFloat) {
/* 761 */     if (!X()) {
/*     */       
/* 763 */       super.i(paramFloat);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 768 */     this.bL += paramFloat;
/* 769 */     if (this.bL > 180.0F) this.bL -= 360.0F; 
/* 770 */     if (this.bL < -180.0F) this.bL += 360.0F;
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int cY() {
/* 778 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float f(boolean paramBoolean) {
/* 785 */     return (this.cn[cY()]).a + 90.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean af() {
/* 794 */     if (!P())
/*     */     {
/* 796 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 800 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ac() {
/* 806 */     if (!P())
/*     */     {
/* 808 */       return false;
/*     */     }
/*     */     
/* 811 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 817 */     if (!P())
/*     */     {
/* 819 */       return true;
/*     */     }
/*     */     
/* 822 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ae() {
/* 828 */     if (!P())
/*     */     {
/* 830 */       return true;
/*     */     }
/*     */     
/* 833 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(s params, boolean paramBoolean) {
/* 842 */     if (params == y)
/*     */     {
/* 844 */       this.r = true;
/*     */     }
/* 846 */     if (params == z)
/*     */     {
/* 848 */       this.r = false;
/*     */     }
/*     */   }
/*     */   
/* 852 */   public static final s y = (s)new c$1(151);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 874 */   public static final s z = (s)new c$2(152);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 902 */   static ArrayList A = new ArrayList(); static {
/* 903 */     A.add(y);
/* 904 */     A.add(z);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 910 */     return A;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 918 */     super.e(paramFloat);
/* 919 */     float f = m();
/* 920 */     y.a((af)this, f);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
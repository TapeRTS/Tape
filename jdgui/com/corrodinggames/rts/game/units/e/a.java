/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends j
/*     */ {
/*  26 */   static e a = null;
/*  27 */   static e b = null;
/*  28 */   static e c = null;
/*     */ 
/*     */   
/*  31 */   static e[] d = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  37 */     return ak.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  42 */     l l = l.u();
/*     */     
/*  44 */     a = l.bw.a(R.drawable.artillery2);
/*     */     
/*  46 */     b = l.bw.a(R.drawable.artillery1_dead);
/*     */     
/*  48 */     d = m.a(a);
/*     */     
/*  50 */     c = a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  58 */     if (this.bz)
/*     */     {
/*  60 */       return b;
/*     */     }
/*  62 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  69 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  75 */     return ((l.u()).by.renderExtraShadows && !this.bz);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float G() {
/*  80 */     return 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float H() {
/*  85 */     return 3.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  91 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/*  98 */     l l = l.u();
/*     */ 
/*     */     
/* 101 */     this.D = b;
/* 102 */     R(0);
/*     */     
/* 104 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     a(u.c);
/*     */ 
/*     */     
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp a(boolean paramBoolean) {
/* 119 */     super(paramBoolean);
/*     */     
/* 121 */     S(28);
/*     */     
/* 123 */     T(50);
/*     */     
/* 125 */     this.bO = 18.0F;
/* 126 */     this.bP = this.bO;
/*     */     
/* 128 */     this.bZ = 140.0F;
/* 129 */     this.bY = this.bZ;
/*     */     
/* 131 */     this.D = a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 140 */     super.a(paramFloat);
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
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 152 */     PointF pointF1 = E(paramInt);
/*     */ 
/*     */     
/* 155 */     f f = f.a((af)this, pointF1.a, pointF1.b);
/*     */ 
/*     */     
/* 158 */     PointF pointF2 = J(paramInt);
/*     */     
/* 160 */     f.K = pointF2.a;
/* 161 */     f.L = pointF2.b;
/*     */     
/* 163 */     f.h = 150.0F;
/* 164 */     f.t = 4.0F;
/* 165 */     f.aQ = true;
/* 166 */     f.ar = Color.a(255, 190, 190, 80);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     f.R = 2;
/* 172 */     f.P = 1;
/*     */ 
/*     */     
/* 175 */     f.x = 0.9F;
/*     */     
/* 177 */     PointF pointF3 = paramaf.a(pointF1.a, pointF1.b, f.t, f.h, m());
/* 178 */     f.aC = true;
/* 179 */     f.m = true;
/* 180 */     f.n = pointF3.a;
/* 181 */     f.o = pointF3.b;
/*     */     
/* 183 */     f.Y = 80.0F;
/* 184 */     f.Z = 45.0F;
/* 185 */     f.aa = true;
/*     */     
/* 187 */     l l = l.u();
/*     */ 
/*     */     
/* 190 */     l.bu.a(e.q, 0.3F, pointF1.a, pointF1.b);
/*     */ 
/*     */ 
/*     */     
/* 194 */     l.bz.a(pointF1.a, pointF1.b, this.dJ, (this.cn[paramInt]).a);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     e e1 = l.bz.a(pointF1.a, pointF1.b, this.dJ, -1118482);
/*     */     
/* 201 */     if (e1 != null) {
/*     */       
/* 203 */       e1.W = 15.0F;
/* 204 */       e1.X = e1.W;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float bI() {
/* 226 */     if ((this.cn[0]).e > 0.0F)
/*     */     {
/* 228 */       return 1.0F - (this.cn[0]).e / b(0);
/*     */     }
/*     */     
/* 231 */     return super.bI();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 238 */     return 290.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 244 */     return 240.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float z() {
/* 252 */     return 0.9F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float A() {
/* 258 */     return 1.7F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 264 */     return 0.05F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 270 */     return 99.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 276 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 283 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean E() {
/* 289 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 295 */     return 20.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float C() {
/* 303 */     return 0.05F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 309 */     return 0.12F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 316 */     super.e(paramFloat);
/* 317 */     float f = m();
/* 318 */     y.a((af)this, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float bB() {
/* 323 */     return 14000.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
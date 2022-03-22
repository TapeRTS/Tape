/*     */ package com.corrodinggames.rts.game.units.d.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.d.i;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends b
/*     */ {
/*  27 */   static e a = null;
/*  28 */   static e b = null;
/*     */   
/*  30 */   static e c = null;
/*  31 */   static e[] d = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  37 */     if (this.bB.i == -1)
/*     */     {
/*  39 */       return null;
/*     */     }
/*  41 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  48 */     l l = l.u();
/*     */     
/*  50 */     a = l.bw.a(R.drawable.anti_air_top);
/*  51 */     b = l.bw.a(R.drawable.anti_air_top_l2);
/*     */     
/*  53 */     c = l.bw.a(R.drawable.unit_icon_building_air_turrent);
/*     */     
/*  55 */     d = m.a(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp a(boolean paramBoolean) {
/*  64 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.bZ = 800.0F;
/*  70 */     this.bY = this.bZ;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/*  81 */     if (!this.j)
/*     */     {
/*  83 */       return 250.0F;
/*     */     }
/*     */ 
/*     */     
/*  87 */     return 320.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/*  94 */     if (!this.j)
/*     */     {
/*  96 */       return 80.0F;
/*     */     }
/*     */ 
/*     */     
/* 100 */     return 70.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 109 */     if (!this.j)
/*     */     {
/* 111 */       return super.e(paramInt);
/*     */     }
/*     */     
/* 114 */     if (paramInt == 2)
/*     */     {
/* 116 */       return 25.0F;
/*     */     }
/* 118 */     return super.e(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF E(int paramInt) {
/* 124 */     if (!this.j || paramInt == 0)
/*     */     {
/* 126 */       return super.E(paramInt);
/*     */     }
/*     */     
/* 129 */     float f1 = E() ? this.bL : (this.cn[paramInt]).a;
/* 130 */     PointF pointF = F(paramInt);
/*     */     
/* 132 */     f1 += (paramInt == 1) ? -30.0F : 30.0F;
/*     */     
/* 134 */     float f2 = pointF.a + f.i(f1) * 10.0F;
/* 135 */     float f3 = pointF.b + f.h(f1) * 10.0F;
/*     */     
/* 137 */     aT.a(f2, f3);
/* 138 */     return aT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {
/* 145 */     PointF pointF1 = E(paramInt);
/*     */     
/* 147 */     f f = f.a((af)this, pointF1.a, pointF1.b);
/*     */     
/* 149 */     PointF pointF2 = J(paramInt);
/*     */     
/* 151 */     f.K = pointF2.a;
/* 152 */     f.L = pointF2.b;
/*     */     
/* 154 */     f.t = 0.3F;
/* 155 */     f.r = 6.0F;
/*     */     
/* 157 */     if (!this.j) {
/*     */       
/* 159 */       f.ar = Color.a(255, 230, 230, 50);
/* 160 */       f.U = 60.0F;
/* 161 */       f.h = 220.0F;
/*     */     }
/*     */     else {
/*     */       
/* 165 */       f.ar = Color.a(255, 230, 50, 50);
/* 166 */       f.U = 60.0F;
/* 167 */       f.h = 250.0F;
/*     */       
/* 169 */       f.t = 0.5F;
/* 170 */       f.r = 7.0F;
/*     */     } 
/*     */     
/* 173 */     f.P = 4;
/* 174 */     f.x = 1.0F;
/*     */ 
/*     */ 
/*     */     
/* 178 */     f.l = paramaf;
/* 179 */     f.aH = false;
/* 180 */     f.aI = 0.0F;
/* 181 */     f.aJ = 0.0F;
/*     */     
/* 183 */     f.aM = true;
/* 184 */     f.aQ = true;
/*     */     
/* 186 */     f.aG = true;
/*     */     
/* 188 */     l l = l.u();
/*     */     
/* 190 */     float f1 = 1.0F + f.c(-0.07F, 0.07F);
/*     */     
/* 192 */     l.bu.a(e.l, 0.3F, f1, pointF1.a, pointF1.b);
/*     */     
/* 194 */     l.bz.a((w)f, -1118720);
/*     */ 
/*     */     
/* 197 */     l.bz.a(pointF1.a, pointF1.b, this.dJ, -1127220);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/* 204 */     if (this.j)
/*     */     {
/* 206 */       return ak.T;
/*     */     }
/*     */     
/* 209 */     return ak.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 216 */     if (!this.j)
/*     */     {
/* 218 */       return a;
/*     */     }
/*     */ 
/*     */     
/* 222 */     return b;
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
/*     */   public strictfp boolean ad() {
/* 249 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ae() {
/* 256 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void r(float paramFloat) {
/* 264 */     boolean bool = false;
/* 265 */     if (this.cn[bool].a())
/*     */     {
/* 267 */       (this.cn[bool]).a += c(bool) * paramFloat * 0.1F;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 275 */     return 9.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 281 */     return 6.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 286 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean u(int paramInt) {
/* 292 */     if (!this.j)
/*     */     {
/* 294 */       return super.u(paramInt);
/*     */     }
/*     */     
/* 297 */     if (paramInt == 0)
/*     */     {
/* 299 */       return false;
/*     */     }
/* 301 */     return super.u(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int v(int paramInt) {
/* 307 */     if (!this.j)
/*     */     {
/* 309 */       return -1;
/*     */     }
/*     */     
/* 312 */     if (paramInt == 1)
/*     */     {
/* 314 */       return 0;
/*     */     }
/* 316 */     if (paramInt == 2)
/*     */     {
/* 318 */       return 0;
/*     */     }
/*     */     
/* 321 */     return -1;
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
/*     */   public strictfp int bg() {
/* 334 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean r(int paramInt) {
/* 340 */     if (!this.j)
/*     */     {
/* 342 */       if (paramInt > 1)
/*     */       {
/* 344 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 348 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 356 */     if (parami.h.equals(e.J())) {
/*     */       
/* 358 */       a(2);
/* 359 */       U();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 366 */     if (!this.j)
/*     */     {
/* 368 */       return e.J();
/*     */     }
/* 370 */     return s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ArrayList paramArrayList) {
/* 376 */     paramArrayList.clear();
/*     */   }
/*     */ 
/*     */   
/* 380 */   public static s e = (s)new a$1(102);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 455 */     if (paramInt == 1) {
/*     */       
/* 457 */       this.j = false;
/*     */     }
/* 459 */     else if (paramInt == 2) {
/*     */ 
/*     */       
/* 462 */       if (!this.j) {
/*     */         
/* 464 */         this.j = true;
/*     */         
/* 466 */         this.bZ += 600.0F;
/* 467 */         this.bY += 600.0F;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 477 */   static ArrayList f = new ArrayList(); static {
/* 478 */     f.add(e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 485 */     return f;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
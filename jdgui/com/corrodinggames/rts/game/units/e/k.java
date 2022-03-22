/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class k
/*     */   extends j
/*     */ {
/*  25 */   static e a = null;
/*     */   
/*  27 */   static e b = null;
/*  28 */   static e c = null;
/*     */   
/*  30 */   static e d = null;
/*     */   
/*  32 */   static e[] e = new e[10];
/*  33 */   static e f = null;
/*     */   
/*     */   Rect g;
/*     */   
/*     */   public strictfp ak b() {
/*  38 */     return ak.r;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  43 */     l l = l.u();
/*     */     
/*  45 */     b = l.bw.a(R.drawable.laser_tank_base);
/*     */     
/*  47 */     a = l.bw.a(R.drawable.laser_tank_dead);
/*     */     
/*  49 */     c = l.bw.a(R.drawable.laser_tank_turrent);
/*     */     
/*  51 */     d = l.bw.a(R.drawable.laser_tank_charge);
/*     */     
/*  53 */     e = m.a(b);
/*     */     
/*  55 */     f = a(b, b.l(), b.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  63 */     if (this.bz)
/*     */     {
/*  65 */       return a;
/*     */     }
/*  67 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  74 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  80 */     return ((l.u()).by.renderExtraShadows && !this.bz);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  84 */     return 2.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  88 */     return 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  94 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 100 */     l l = l.u();
/*     */ 
/*     */     
/* 103 */     this.D = a;
/* 104 */     R(0);
/*     */     
/* 106 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     a(u.b);
/*     */ 
/*     */     
/* 117 */     return true;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); }
/*     */   public strictfp float q(int paramInt) { return 450.0F; }
/*     */   public strictfp void a(af paramaf, int paramInt) { PointF pointF = E(paramInt); f f = f.a((af)this, pointF.a, pointF.b); f.U = q(paramInt); f.l = paramaf; f.h = 8.0F; f.B = true; f.A = true; f.aQ = true; f.ar = Color.a(80, 255, 0, 0); l l = l.u(); l.bz.a(pointF.a, pointF.b, this.dJ, -1127220); l.bz.a(pointF.a, pointF.b, this.dJ, (this.cn[paramInt]).a); l.bu.a(e.x, 0.3F, pointF.a, pointF.b); }
/*     */   public strictfp float bI() { if ((this.cn[0]).e > 0.0F)
/*     */       return 1.0F - (this.cn[0]).e / b(0);  if ((this.cn[0]).f != 0.0F)
/*     */       return (this.cn[0]).f / e(0); 
/* 125 */     return super.bI(); } public strictfp boolean bJ() { return ((this.cn[0]).e > 0.0F); } public strictfp k(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     this.g = new Rect(); a(b, 1); this.bO = 14.0F;
/*     */     this.bP = this.bO + 2.0F;
/*     */     this.bZ = 300.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; }
/* 260 */   public strictfp float m() { return 190.0F; } public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 262 */       return false;
/*     */     }
/*     */     
/* 265 */     l l = l.u();
/*     */     
/* 267 */     y.a((r)this);
/*     */     
/* 269 */     if (!this.bz) {
/*     */       
/* 271 */       float f = (this.cn[0]).f / e(0);
/* 272 */       if (f != 0.0F) {
/*     */         
/* 274 */         PointF pointF = E(0);
/*     */         
/* 276 */         l.bw.h();
/*     */         
/* 278 */         l.bw.b(pointF.a - l.cd, pointF.b - l.ce);
/* 279 */         l.bw.a(f, f);
/* 280 */         l.bw.a(d, 0.0F, 0.0F, null);
/*     */         
/* 282 */         l.bw.i();
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 303 */     return true; } public strictfp float b(int paramInt) { return 450.0F; }
/*     */   public strictfp float e(int paramInt) { return 80.0F; }
/*     */   public strictfp float z() { return 0.7F; }
/*     */   public strictfp float A() { return 1.5F; }
/*     */   public strictfp float B() { return 0.1F; }
/*     */   public strictfp float c(int paramInt) { return 3.0F; }
/*     */   public strictfp float C() {
/* 310 */     return 0.07F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 316 */     return 0.12F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 323 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 330 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 336 */     return 19.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
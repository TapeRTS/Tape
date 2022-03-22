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
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ 
/*     */ public class l
/*     */   extends j
/*     */ {
/*  21 */   static e a = null;
/*  22 */   static e b = null;
/*  23 */   static e[] c = new e[10];
/*     */   
/*  25 */   static e d = null;
/*     */ 
/*     */   
/*  28 */   public static e e = null;
/*     */ 
/*     */   
/*     */   int f;
/*     */   
/*     */   float g;
/*     */   
/*     */   Rect h;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  39 */     return ak.E;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  44 */     com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*     */     
/*  46 */     e e1 = l1.bw.a(R.drawable.mammoth_tank);
/*     */     
/*  48 */     c = m.a(e1);
/*     */     
/*  50 */     a = l1.bw.a(R.drawable.mammoth_tank_dead);
/*  51 */     b = l1.bw.a(R.drawable.mammoth_tank_turret);
/*     */     
/*  53 */     e = l1.bw.a(R.drawable.lighting_charge);
/*     */     
/*  55 */     d = a(e1, e1.l() / 2, e1.k());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  62 */     if (this.bz)
/*     */     {
/*  64 */       return a;
/*     */     }
/*  66 */     return c[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  72 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  78 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/*  83 */     return ((com.corrodinggames.rts.gameFramework.l.u()).by.renderExtraShadows && this.dJ > -2.0F && !this.bz);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/*  87 */     return 3.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/*  91 */     return 3.0F;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (this.cm) { this.g += paramFloat; if (this.g > 3.0F) {
/*     */         this.g = 0.0F; this.f = 1 - this.f;
/*     */       }  }
/*     */      }
/*  97 */   public strictfp float bB() { return 14000.0F; } public strictfp void a(af paramaf, int paramInt) { PointF pointF = E(paramInt); f f = f.a((af)this, pointF.a, pointF.b); f.ar = Color.a(255, 247, 212, 129); f.U = 260.0F; f.l = paramaf; f.h = 20.0F; f.t = 4.0F; f.x = 2.0F; f.aQ = true; f.A = true; f.M = true; f.ai = 0.5F; f.ak = 1.0F; f.al = 0.0F; com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u(); l1.bz.a(pointF.a, pointF.b, this.dJ, -1118482); l1.bu.a(e.w, 0.2F, this.dH, this.dI); } public strictfp boolean e() { com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*     */     
/*  99 */     this.D = a;
/* 100 */     R(0);
/* 101 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     a(u.e);
/*     */ 
/*     */     
/* 109 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp l(boolean paramBoolean) {
/* 116 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     this.h = new Rect(); a(c[7], 2); this.bO = 21.0F; this.bP = this.bO + 1.0F; this.bZ = 2900.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = c[7]; } public strictfp float m() { return 210.0F; }
/*     */   public strictfp float b(int paramInt) { return 140.0F; }
/*     */   public strictfp float z() { return 0.5F; }
/* 296 */   public strictfp Rect a_(boolean paramBoolean) { if (this.bz && !paramBoolean)
/*     */     {
/* 298 */       return super.a_(paramBoolean);
/*     */     }
/* 300 */     return a(paramBoolean, this.f); } public strictfp float aX() {
/*     */     return 1.0F;
/*     */   } public strictfp float A() {
/*     */     return 1.0F;
/*     */   } public strictfp float B() {
/*     */     return 0.5F;
/*     */   }
/* 307 */   public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 309 */       return false;
/*     */     }
/*     */     
/* 312 */     y.a((r)this);
/*     */ 
/*     */     
/* 315 */     float f = (this.cn[0]).f / e(0);
/*     */     
/* 317 */     y.a((r)this, e, f, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 328 */     return true; } public strictfp float w(int paramInt) { return 0.08F; } public strictfp float c(int paramInt) { return 2.5F; } public strictfp float C() {
/*     */     return 0.04F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.08F;
/*     */   }
/*     */   public strictfp boolean l() {
/* 335 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 342 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 348 */     return 22.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 355 */     return 60.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
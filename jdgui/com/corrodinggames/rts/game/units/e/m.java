/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ 
/*     */ public class m
/*     */   extends j {
/*  19 */   static e a = null;
/*     */   
/*  21 */   static e b = null;
/*  22 */   static e c = null;
/*     */ 
/*     */   
/*  25 */   static e[] d = new e[10];
/*     */   
/*     */   Rect e;
/*     */ 
/*     */   
/*     */   public strictfp ak b() {
/*  31 */     return ak.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void c() {
/*  36 */     l l = l.u();
/*     */     
/*  38 */     b = l.bw.a(R.drawable.mega_tank);
/*  39 */     a = l.bw.a(R.drawable.mega_tank_dead);
/*  40 */     c = l.bw.a(R.drawable.mega_tank_turret);
/*     */     
/*  42 */     d = com.corrodinggames.rts.game.m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  49 */     if (this.bz)
/*     */     {
/*  51 */       return a;
/*     */     }
/*  53 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/*  60 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/*  67 */     return c;
/*     */   }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); }
/*     */   public strictfp float bB() { return 7000.0F; } public strictfp void a(af paramaf, int paramInt) { if (!paramaf.i()) { PointF pointF = E(paramInt); f f = f.a((af)this, pointF.a, pointF.b); f.ar = Color.a(255, 150, 230, 40); f.U = 50.0F; f.l = paramaf; f.h = 60.0F; f.t = 3.0F; f.x = 2.0F; f.aQ = true; l l = l.u(); l.bz.a(pointF.a, pointF.b, this.dJ, -1127220); l.bz.a(pointF.a, pointF.b, this.dJ, (this.cn[paramInt]).a); l.bu.a(e.t, 0.3F, this.dH, this.dI); }
/*     */     else
/*     */     { f f = f.a((af)this, this.dH, this.dI); f.ar = Color.a(255, 230, 230, 50); f.U = 40.0F; f.l = paramaf; f.h = 190.0F; f.t = 4.0F; f.aH = true; f.aI = 10.0F; f.aJ = 15.0F; f.aM = true; f.aQ = true; l l = l.u(); l.bu.a(e.l, 0.2F, this.dH, this.dI); }
/*  73 */      } public strictfp boolean e() { l l = l.u();
/*  74 */     l.bz.b(this.dH, this.dI, this.dJ);
/*  75 */     this.D = a;
/*  76 */     R(0);
/*  77 */     this.by = false;
/*  78 */     l.bu.a(e.n, 0.8F, this.dH, this.dI);
/*  79 */     bl();
/*  80 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp m(boolean paramBoolean) {
/*  87 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     this.e = new Rect(); S(20); T(25);
/*     */     this.bO = 12.0F;
/*     */     this.bP = this.bO + 1.0F;
/*     */     this.bZ = 550.0F;
/*     */     this.bY = this.bZ;
/*     */     this.D = b; } public strictfp float m() { return 140.0F; }
/*     */   public strictfp float b(int paramInt) { return 70.0F; }
/* 207 */   public strictfp boolean c(float paramFloat) { if (!super.c(paramFloat))
/*     */     {
/* 209 */       return false;
/*     */     }
/*     */     
/* 212 */     y.a((r)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     return true; } public strictfp float z() { return 0.8F; } public strictfp float A() { return 1.2F; } public strictfp float c(int paramInt) { return 2.0F; }
/*     */   public strictfp float C() {
/*     */     return 0.05F;
/*     */   }
/*     */   public strictfp float D() {
/*     */     return 0.1F;
/*     */   }
/*     */   public strictfp boolean l() {
/* 235 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean ad() {
/* 242 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 248 */     return 12.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
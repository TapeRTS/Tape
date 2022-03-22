/*     */ package com.corrodinggames.rts.game.units.c;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.k;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.e.j;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends j
/*     */ {
/*  29 */   static e a = null;
/*     */   
/*  31 */   static e b = null;
/*  32 */   static e c = null;
/*     */ 
/*     */   
/*  35 */   static e[] d = new e[10]; int e;
/*     */   float f;
/*     */   Rect g;
/*     */   Rect h;
/*     */   
/*     */   public ak b() {
/*  41 */     return ak.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void c() {
/*  46 */     l l = l.u();
/*     */     
/*  48 */     b = l.bw.a(R.drawable.ladybug);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     d = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e d() {
/*  63 */     if (this.bz)
/*     */     {
/*  65 */       return a;
/*     */     }
/*  67 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e k() {
/*  74 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e d(int paramInt) {
/*  80 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/*  87 */     l l = l.u();
/*     */     
/*  89 */     e e1 = l.bz.b(this.dH, this.dI, this.dJ, d.i, false, h.c);
/*  90 */     if (e1 != null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     l.bu.a(e.z, 0.8F, this.dH, this.dI);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     k.a((r)this, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     return false;
/*     */   }
/*     */   public Rect a_(boolean paramBoolean) { int i = this.e * this.dL; byte b = 0; this.g.a(i, b, i + this.dL, b + this.dM); return this.g; }
/*     */   public boolean bD() { return true; }
/*     */   public boolean bC() { return true; } public void a(float paramFloat) { super.a(paramFloat); if (this.cm)
/*     */       if (this.e == 0) { this.e = 1; } else { this.e = 0; }
/*     */         if (this.f != 0.0F) { this.f = f.a(this.f, paramFloat); this.e = 2; }
/* 122 */      } public a(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     this.e = 0;
/*     */ 
/*     */     
/* 146 */     this.f = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     this.g = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     this.h = new Rect(); S(17); T(26); this.bO = 5.0F; this.bP = this.bO + 3.0F; this.bZ = 130.0F; this.bY = this.bZ;
/*     */     this.D = b;
/*     */     this.G = com.corrodinggames.rts.game.units.a.a; }
/*     */   public void a(af paramaf, int paramInt) { f.a((af)this, paramaf, 14.0F, null, false);
/*     */     this.f = 4.0F;
/*     */     PointF pointF = E(paramInt);
/*     */     l l = l.u();
/* 293 */     l.bu.a(e.A, 0.3F, pointF.a, pointF.b); } public boolean c(float paramFloat) { return super.c(paramFloat); } public float m() {
/*     */     return 43.0F;
/*     */   } public float b(int paramInt) {
/*     */     return 17.0F;
/*     */   } public float z() {
/*     */     return 1.7F;
/*     */   } public float A() {
/*     */     return 5.5F;
/*     */   } public float c(int paramInt) {
/*     */     return 99.0F;
/*     */   } public float C() {
/* 304 */     return 0.07F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float D() {
/* 310 */     return 0.12F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 317 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ad() {
/* 323 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float g(int paramInt) {
/* 329 */     return 7.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean E() {
/* 337 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\c\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
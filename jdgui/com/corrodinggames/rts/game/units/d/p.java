/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.m;
/*     */ import com.corrodinggames.rts.game.units.a.n;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.an;
/*     */ import com.corrodinggames.rts.game.units.d;
/*     */ import com.corrodinggames.rts.game.units.e.b;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class p
/*     */   extends c
/*     */   implements d
/*     */ {
/*     */   public strictfp void a(ap paramap) {
/*  46 */     super.a(paramap);
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
/*     */   public strictfp void a(k paramk) {
/*  59 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak L() {
/*  65 */     return ak.B;
/*     */   }
/*     */ 
/*     */   
/*  69 */   static e a = null;
/*  70 */   static e[] b = new e[10];
/*     */ 
/*     */   
/*  73 */   static e c = null;
/*     */ 
/*     */   
/*     */   float d;
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void da() {
/*  81 */     l l = l.u();
/*     */     
/*  83 */     a = l.bw.a(R.drawable.repair_bay);
/*  84 */     c = l.bw.a(R.drawable.repair_bay_dead);
/*     */     
/*  86 */     b = m.a(a);
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
/*     */   public strictfp boolean K() {
/* 101 */     this.D = c;
/* 102 */     R(0);
/*     */     
/* 104 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     a(u.c);
/*     */ 
/*     */     
/* 112 */     return true;
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
/*     */   public strictfp e d() {
/* 124 */     if (this.bz)
/*     */     {
/* 126 */       return c;
/*     */     }
/*     */     
/* 129 */     if (this.bB == null)
/*     */     {
/* 131 */       return b[b.length - 1];
/*     */     }
/*     */     
/* 134 */     return b[this.bB.M()];
/*     */   } public strictfp void a(int paramInt) {} public strictfp int y() { return 230; } public strictfp float c(af paramaf) {
/*     */     return 0.2F;
/*     */   } public strictfp boolean a(af paramaf) {
/*     */     if (paramaf.q())
/*     */       return false; 
/*     */     return true;
/*     */   } public static q e = new q(true); Rect f; Rect g;
/* 142 */   public strictfp e k() { return null; } public static strictfp an a(r paramr, float paramFloat1, float paramFloat2, boolean paramBoolean) { l l = l.u(); e.a(paramr.y() + paramFloat2, paramBoolean); l.bK.a(paramr.dH, paramr.dI, paramr.y() + paramFloat2, paramr, paramFloat1, e); af af = e.e; if (af != null) {
/*     */       an an = paramr.am(); an.b(af); if (an != null) {
/*     */         an.k = paramFloat2; an.m = true; return an;
/*     */       } 
/*     */     }  return null; }
/*     */   public strictfp void a(float paramFloat) { super.a(paramFloat); if (!bG() || this.bz)
/*     */       return;  this.d += paramFloat;
/*     */     if (ao())
/*     */       if (this.d > 40.0F) {
/*     */         this.d = 0.0F;
/*     */         a(this, paramFloat, 0.0F, false);
/*     */       }  
/*     */     if (!this.bz)
/*     */       b.a(paramFloat, this);  }
/* 156 */   public strictfp p(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 452 */     this.f = new Rect();
/* 453 */     this.g = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 545 */     this.i = new PointF[6];
/* 546 */     this.j = new PointF[this.i.length]; this.D = a; b(a); this.bO = 30.0F; this.bP = this.bO; this.bZ = 1000.0F; this.bY = this.bZ; this.n.a(-1, -1, 1, 1); this.o.a(-1, -1, 1, 1); for (byte b = 0; b < this.i.length; b++) {
/*     */       this.i[b] = new PointF(); this.j[b] = new PointF();
/*     */     }  } public strictfp boolean c(float paramFloat) { return super.c(paramFloat); }
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) { super.a(paramFloat, paramBoolean); if (!this.bz)
/*     */       b.b(paramFloat, this);  }
/* 551 */   public strictfp PointF[] b() { return this.i; }
/*     */   
/*     */   public strictfp boolean l() {
/*     */     return false;
/*     */   } public strictfp void a(af paramaf, int paramInt) {
/*     */     throw new RuntimeException("Unit cannot shoot");
/* 557 */   } public strictfp PointF[] c() { return this.j; }
/*     */   public strictfp float b(int paramInt) { return 0.0F; }
/*     */   public strictfp float c(int paramInt) { return 0.0F; }
/*     */   public strictfp PointF E(int paramInt) { PointF pointF = F(paramInt); float f1 = pointF.a + 0.0F; float f2 = pointF.b - 33.0F; aT.a(f1, f2);
/*     */     return aT; }
/*     */   static ArrayList h = new ArrayList();
/*     */   PointF[] i; PointF[] j; static { h.add(new m(true));
/* 564 */     h.add(new n()); } public strictfp ArrayList M() { return h; } public strictfp float m() { return y(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {
/* 570 */     super.e(paramFloat);
/* 571 */     float f = y();
/* 572 */     y.a((af)this, f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean w(af paramaf) {
/* 580 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
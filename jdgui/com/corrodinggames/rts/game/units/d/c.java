/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuffColorFilter;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.b.g;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.aj;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.b.a;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class c
/*     */   extends r
/*     */ {
/*     */   e m;
/*     */   
/*     */   public strictfp boolean cY() {
/*  44 */     return false;
/*     */   }
/*     */ 
/*     */   
/*  48 */   public Rect n = new Rect();
/*  49 */   public Rect o = new Rect();
/*     */   
/*  51 */   public static e p = null;
/*  52 */   public static e[] q = new e[10];
/*     */   
/*  54 */   int r = 1;
/*     */   int s;
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  58 */     paramap.a(this.r);
/*  59 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  64 */     if (paramk.b() >= 15) {
/*     */       
/*  66 */       int i = paramk.f();
/*  67 */       Q(i);
/*     */     } 
/*     */     
/*  70 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(al paramal, float paramFloat1, float paramFloat2, m paramm) {
/*  79 */     l l = l.u();
/*     */     
/*  81 */     r r1 = (r)af.a(paramal);
/*     */     
/*  83 */     l.bt.b(paramFloat1, paramFloat2);
/*     */ 
/*     */ 
/*     */     
/*  87 */     r1.dH = l.bt.M + r1.cH();
/*  88 */     r1.dI = l.bt.N + r1.cH();
/*     */     
/*  90 */     r1.a(paramm);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     return r1.bn();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void Q(int paramInt) {
/* 105 */     this.r = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 114 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/* 121 */     if (this.bB.i == -1)
/*     */     {
/* 123 */       return null;
/*     */     }
/* 125 */     return q[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void cZ() {
/* 131 */     l l = l.u();
/*     */     
/* 133 */     p = l.bw.a(R.drawable.unit_icon_building);
/*     */     
/* 135 */     q = m.a(p);
/*     */   }
/*     */   public strictfp void c_() { this.by = false; }
/*     */   public strictfp boolean K() { a(u.d); return false; }
/*     */   public strictfp boolean e() { l l = l.u(); l.bC.a(this); if (this.bR < 1.0F) { a(u.a); return false; }  this.s = 0; return K(); }
/*     */   public strictfp Rect bP() { return this.o; }
/*     */   public strictfp Rect bO() { return this.n; }
/*     */   public static strictfp boolean a(r paramr, al paramal, ah paramah, int paramInt1, int paramInt2, int paramInt3) { l l = l.u(); b b = l.bt; if (!b.c(paramInt1, paramInt2)) return false;  boolean bool = false; if (b.A && l.bb.C != null) { if (!b.C && l.bb.C[paramInt1][paramInt2] == 10) return false;  bool = (l.bb.C[paramInt1][paramInt2] >= 5) ? true : false; }  if (a(paramr, paramal, paramah, paramInt1, paramInt2, bool)) { if (paramal.p()) { g g = b.e(paramInt1, paramInt2); if (g != null)
/*     */           if (g.i)
/*     */             return true;   return false; }  if (a.a(l.bb, paramInt1, paramInt2, paramInt3))
/* 145 */         return false;  return true; }  return false; } public static strictfp boolean a(r paramr, al paramal, ah paramah, int paramInt1, int paramInt2, boolean paramBoolean) { return (b(paramr, paramal, paramah, paramInt1, paramInt2, paramBoolean) == null); } public strictfp c(boolean paramBoolean) { super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 644 */     this.s = 0; this.bL = -90.0F; this.by = false; }
/*     */   public static strictfp String b(r paramr, al paramal, ah paramah, int paramInt1, int paramInt2, boolean paramBoolean) { l l = l.u(); if (!l.bt.c(paramInt1, paramInt2)) return "{0}";  aj aj = paramal.q(); if (aj != null) { String str = aj.a(paramr, paramInt1, paramInt2); if (str != null) return str;  }  if (paramal == ak.d || paramah == ah.e) { if (!l.bC.a(l.bC.x, paramInt1, paramInt2)) return null;  return "{3}"; }  g g = l.bt.e(paramInt1, paramInt2); if (g != null) if (g.i) { if (paramal.p()) return null;  return "{0}"; }   if (paramah == ah.d) return null;  if (paramah == ah.f) { if (!l.bC.a(l.bC.z, paramInt1, paramInt2)) return null;  return "{0}"; }  if (paramah == ah.g) { if (!l.bC.a(l.bC.A, paramInt1, paramInt2))
/*     */         return null;  return "{0}"; }  if (paramah == ah.h) { if (!l.bC.a(l.bC.B, paramInt1, paramInt2))
/*     */         return null;  return "{0}"; }  if (l.bC.a(l.bC.w, paramInt1, paramInt2, paramBoolean))
/*     */       return "{0}";  return null; }
/*     */   public static strictfp af b(int paramInt1, int paramInt2) { l l = l.u(); l.bt.a(paramInt1, paramInt2); float f1 = (l.bt.M + l.bt.m); float f2 = (l.bt.N + l.bt.n); for (af af : l.bK.b(f1, f2, 0.0F)) { if (af.bw())
/*     */         if (!af.bz)
/*     */           if (af.c(f1, f2, 0.0F))
/* 652 */             return af;    }  return null; } public strictfp boolean c(float paramFloat) { l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 659 */     int i = this.s * this.dL;
/* 660 */     byte b = 0;
/*     */ 
/*     */ 
/*     */     
/* 664 */     RectF rectF = cp();
/*     */ 
/*     */     
/* 667 */     cX.a(i, b, i + this.dL, b + this.dM);
/* 668 */     l.bw.a(this.D, cX, rectF, f());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 673 */     return true; } public strictfp void a(int paramInt) {} public static strictfp af g(al paramal) { if (paramal == null)
/*     */       throw new RuntimeException("type is null");  return paramal.a(); }
/*     */   public strictfp boolean I() { return false; }
/*     */   public strictfp ah h() { return ah.a; }
/*     */   public strictfp boolean i() { return false; }
/*     */   public strictfp boolean P() { return false; }
/*     */   public strictfp float z() { return 0.0F; }
/*     */   public strictfp float A() { return 0.0F; }
/*     */   public strictfp boolean x() { return false; }
/*     */   public strictfp Paint f() { int i; l l = l.u(); PorterDuffColorFilter porterDuffColorFilter = null; if (this.bR < 1.0F) { i = Color.a((int)(40.0F + this.bR * 200.0F), 140, 255, 140); porterDuffColorFilter = aK; } else { i = Color.a(255, 255, 255, 255); }  if (this.bT) { if (this.bW) { i = Color.a(200, 20, 255, 20); porterDuffColorFilter = aL; }  if (this.bX) { i = Color.a(200, 255, 20, 20); porterDuffColorFilter = aM; }  if (this.bU) { i = Color.a(70, 70, 70, 245); porterDuffColorFilter = aN; if (this.bX) { i = Color.a(70, 255, 20, 20); porterDuffColorFilter = aM; }  }  if (this.bV)
/*     */         i = Color.a(150, 100, 100, 100);  }  boolean bool = l.by.renderAntiAlias; if (!cS()) { bool = false; if (l.cE < 1.0F)
/*     */         bool = true;  }  if (this.bS)
/*     */       bool = ak.af;  return a(i, (ColorFilter)porterDuffColorFilter, bool); }
/* 686 */   public strictfp void d(float paramFloat) { super.d(paramFloat);
/*     */     
/* 688 */     if (this.m == null) {
/*     */       return;
/*     */     }
/*     */     
/* 692 */     l l = l.u();
/*     */ 
/*     */ 
/*     */     
/* 696 */     if (cY()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 704 */       l.bw.b(this.m, this.dH - (int)(this.m.o + 0.1F) - l.cd, this.dI - (int)(this.m.p + 0.1F) - l.ce, 
/*     */ 
/*     */           
/* 707 */           f());
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 713 */       byte b1 = 0;
/* 714 */       byte b2 = 0;
/*     */ 
/*     */ 
/*     */       
/* 718 */       RectF rectF = cp();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 724 */       cX.a(b1, b2, b1 + this.dL, b2 + this.dM);
/* 725 */       l.bw.a(this.m, cX, rectF, f());
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bw() {
/* 740 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
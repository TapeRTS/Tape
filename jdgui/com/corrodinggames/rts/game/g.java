/*     */ package com.corrodinggames.rts.game;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.am;
/*     */ import com.corrodinggames.rts.game.units.custom.an;
/*     */ import com.corrodinggames.rts.game.units.custom.au;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.x;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */ {
/*  24 */   public static final g a = new g();
/*     */ 
/*     */   
/*     */   public int b;
/*     */ 
/*     */   
/*     */   public int c;
/*     */ 
/*     */   
/*     */   public boolean d;
/*     */ 
/*     */   
/*     */   public boolean e;
/*     */ 
/*     */   
/*     */   public boolean f;
/*     */ 
/*     */   
/*     */   public boolean g;
/*     */ 
/*     */   
/*     */   public boolean h;
/*     */   
/*  47 */   public int i = 35;
/*     */   
/*  49 */   public float j = -1.0F;
/*     */ 
/*     */   
/*     */   public boolean k = false;
/*     */ 
/*     */   
/*     */   public boolean l = false;
/*     */ 
/*     */   
/*     */   public boolean m = false;
/*     */ 
/*     */   
/*     */   public boolean n = false;
/*     */   
/*  63 */   public float o = 1.0F;
/*     */   
/*     */   public boolean p = false;
/*     */   
/*     */   public boolean q = false;
/*     */   
/*     */   public boolean r = false;
/*     */   
/*     */   public boolean s = false;
/*     */   
/*     */   public boolean t = false;
/*     */   
/*     */   public float u;
/*     */   public float v;
/*  77 */   public float w = 5.0F;
/*  78 */   public short x = -1;
/*     */   
/*     */   public short y;
/*  81 */   public short z = -1;
/*     */ 
/*     */   
/*     */   public boolean A;
/*     */ 
/*     */   
/*     */   public e B;
/*     */   
/*     */   public e C;
/*     */   
/*     */   public float D;
/*     */   
/*     */   public float E;
/*     */   
/*     */   public float F;
/*     */   
/*     */   public float G;
/*     */   
/*     */   public boolean H = false;
/*     */   
/*     */   public boolean I = false;
/*     */   
/* 103 */   public float J = -1.0F;
/*     */ 
/*     */   
/*     */   public boolean K = false;
/*     */ 
/*     */   
/*     */   public boolean L = false;
/*     */ 
/*     */   
/*     */   public boolean M = false;
/*     */   
/* 114 */   public float N = -1.0F;
/*     */ 
/*     */   
/* 117 */   public float O = -1.0F;
/*     */ 
/*     */   
/*     */   public float P;
/*     */ 
/*     */   
/*     */   public float Q;
/*     */ 
/*     */   
/*     */   public float R;
/*     */ 
/*     */   
/*     */   public boolean S;
/*     */ 
/*     */   
/*     */   public boolean T = false;
/*     */ 
/*     */   
/*     */   public boolean U = false;
/*     */ 
/*     */   
/*     */   public boolean V = false;
/*     */   
/*     */   public boolean W = false;
/*     */   
/*     */   public e X;
/*     */   
/*     */   public e Y;
/*     */   
/*     */   public boolean Z;
/*     */   
/*     */   public e aa;
/*     */   
/*     */   public boolean ab;
/*     */   
/*     */   public float ac;
/*     */   
/*     */   public boolean ad = false;
/*     */   
/*     */   public boolean ae = false;
/*     */   
/* 158 */   public float af = 3.0F;
/*     */   
/*     */   public x ag;
/*     */   
/*     */   public x ah;
/*     */   
/*     */   public an ai;
/*     */   
/*     */   public an aj;
/*     */   
/*     */   public an ak;
/*     */   
/*     */   public float al;
/* 171 */   public float am = 5.0F;
/*     */   
/* 173 */   public int an = -1;
/* 174 */   public float ao = 0.5F;
/*     */   
/*     */   public boolean ap;
/*     */   
/*     */   public boolean aq = false;
/* 179 */   public float ar = -1.0F;
/* 180 */   public float as = -1.0F;
/* 181 */   public float at = -1.0F;
/* 182 */   public float au = 0.1F;
/*     */   
/*     */   public boolean av = false;
/*     */   
/* 186 */   public float aw = 120.0F;
/* 187 */   public float ax = 15.0F;
/*     */   
/*     */   public boolean ay;
/*     */   
/* 191 */   public float az = 5.0F;
/* 192 */   public float aA = 120.0F;
/* 193 */   public float aB = 15.0F;
/*     */ 
/*     */   
/*     */   public i aC;
/*     */   
/* 198 */   public int aD = Color.a(255, 255, 255, 255);
/* 199 */   public float aE = 1.0F;
/*     */   
/* 201 */   public float aF = 0.0F;
/* 202 */   public float aG = 1.0F;
/*     */   
/*     */   public boolean aH;
/*     */   
/*     */   public boolean aI = true;
/*     */   
/*     */   public float aJ;
/*     */   
/*     */   public float aK;
/*     */   
/*     */   public float aL;
/*     */   public boolean aM;
/*     */   public float aN;
/*     */   public float aO;
/* 216 */   public float aP = 1.0F;
/*     */   
/* 218 */   public float aQ = 1.0F;
/* 219 */   public float aR = 1.0F;
/*     */   
/* 221 */   public float aS = 1.0F;
/*     */ 
/*     */   
/*     */   public float aT;
/*     */   
/* 226 */   public float aU = -1.0F;
/*     */ 
/*     */   
/*     */   public x aV;
/*     */ 
/*     */   
/*     */   public x aW;
/*     */ 
/*     */   
/*     */   public au aX;
/*     */ 
/*     */   
/*     */   public int aY;
/*     */   
/*     */   public boolean aZ;
/*     */   
/*     */   public boolean ba;
/*     */   
/*     */   public i bb;
/*     */   
/* 246 */   public m bc = null;
/* 247 */   public m bd = null;
/*     */   
/* 249 */   public m be = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public x a(af paramaf) {
/* 289 */     m m1 = this.be;
/*     */     
/* 291 */     if (m1 != null && m1.a > 0)
/*     */     {
/* 293 */       for (h h : m1) {
/*     */         
/* 295 */         if (!h.a(paramaf)) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/* 300 */         if (h.g != null)
/*     */         {
/* 302 */           return h.g;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 307 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(af paramaf, float paramFloat, boolean paramBoolean) {
/*     */     m m1;
/* 313 */     if (!paramBoolean) {
/*     */       
/* 315 */       m1 = this.bc;
/*     */     }
/*     */     else {
/*     */       
/* 319 */       m1 = this.bd;
/*     */     } 
/*     */     
/* 322 */     if (m1 != null && m1.a > 0)
/*     */     {
/* 324 */       for (h h : m1) {
/*     */         float f;
/* 326 */         if (!h.a(paramaf)) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 332 */         if (!paramBoolean) {
/*     */           
/* 334 */           if (h.e != null)
/*     */           {
/* 336 */             h.e.f(paramaf);
/*     */           }
/*     */           
/* 339 */           f = h.c;
/*     */         }
/*     */         else {
/*     */           
/* 343 */           if (h.f != null)
/*     */           {
/* 345 */             h.f.f(paramaf);
/*     */           }
/*     */           
/* 348 */           f = h.d;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 353 */         paramFloat *= f;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 358 */     return paramFloat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(g paramg, ap paramap) {
/* 464 */     if (paramg == a) {
/*     */       
/* 466 */       paramap.c(0);
/*     */       return;
/*     */     } 
/* 469 */     if (paramg instanceof am) {
/*     */       
/* 471 */       paramap.c(1);
/* 472 */       am.a((am)paramg, paramap);
/*     */       
/*     */       return;
/*     */     } 
/* 476 */     l.f("writeOutLink: Unhandled projectile type");
/*     */     
/* 478 */     paramap.c(0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static g a(k paramk) {
/* 484 */     byte b = paramk.d();
/* 485 */     if (b == 0)
/*     */     {
/* 487 */       return a;
/*     */     }
/* 489 */     if (b == 1) {
/*     */       
/* 491 */       g g1 = am.b(paramk);
/* 492 */       if (g1 == null)
/*     */       {
/* 494 */         return a;
/*     */       }
/* 496 */       return g1;
/*     */     } 
/*     */     
/* 499 */     throw new IOException("Unknown projectile type:" + b);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
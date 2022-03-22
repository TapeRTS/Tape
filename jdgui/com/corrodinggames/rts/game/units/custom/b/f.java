/*     */ package com.corrodinggames.rts.game.units.custom.b;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.custom.as;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.d.n;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ 
/*     */ 
/*     */ public class f
/*     */   extends a
/*     */ {
/*  16 */   public static final a a = new f();
/*     */ 
/*     */   
/*  19 */   static final PointF b = new PointF();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(k paramk, float paramFloat) {
/*  25 */     l l = paramk.v;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     int i = paramk.bg();
/*  32 */     for (byte b = 0; b < i; b++) {
/*     */       
/*  34 */       as as = l.fE[b];
/*     */       
/*  36 */       if (as.ai != null)
/*     */       {
/*     */         
/*  39 */         if (paramk.cf > 0.0F && !paramk.t) {
/*     */           
/*  41 */           float f1 = as.ai.floatValue();
/*     */ 
/*     */           
/*  44 */           b.a(paramk.E(b));
/*  45 */           float f2 = paramk.m();
/*  46 */           if (as.aa < 99999.0F)
/*     */           {
/*  48 */             f2 = as.aa;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*  53 */           if (n.a((r)paramk, b.a, b.b, paramk.dJ, f2, f1));
/*     */ 
/*     */ 
/*     */           
/*  57 */           if (paramk.cf < 0.0F) {
/*     */             
/*  59 */             paramk.cf = 0.0F;
/*  60 */             paramk.t = true;
/*     */           } 
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*  66 */       if (as.aj != null)
/*     */       {
/*  68 */         a(paramk, as);
/*     */       }
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
/*     */   public static strictfp void a(k paramk, as paramas) {
/*  82 */     if (!paramk.a(paramas)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  88 */     float f1 = paramas.ak;
/*     */ 
/*     */     
/*  91 */     float f2 = paramas.al;
/*     */     
/*  93 */     float f3 = paramas.am;
/*     */     
/*  95 */     com.corrodinggames.rts.game.f f4 = null;
/*     */     
/*  97 */     i i = paramas.aj;
/*     */ 
/*     */     
/* 100 */     Object[] arrayOfObject = com.corrodinggames.rts.game.f.a.a(); byte b; int j;
/* 101 */     for (b = 0, j = com.corrodinggames.rts.game.f.a.a; b < j; b++) {
/*     */       
/* 103 */       com.corrodinggames.rts.game.f f5 = (com.corrodinggames.rts.game.f)arrayOfObject[b];
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 108 */       if (f5.aE != null && f5.dJ > f3)
/*     */       {
/*     */         
/* 111 */         if (h.a(f5.aE, i)) {
/*     */ 
/*     */ 
/*     */           
/* 115 */           float f6 = com.corrodinggames.rts.gameFramework.f.a(paramk.dH, paramk.dI, f5.dH, f5.dI);
/*     */           
/* 117 */           if (f6 < f2 * f2) {
/*     */ 
/*     */             
/* 120 */             float f7 = com.corrodinggames.rts.gameFramework.f.a(paramk.dH, paramk.dI, f5.n, f5.o);
/*     */             
/* 122 */             if (f7 < f1 * f1 || f1 < 0.0F)
/*     */             {
/* 124 */               if (f5.j == null || (!f5.j.bB.d(paramk.bB) && f5.j.bB != paramk.bB))
/*     */               {
/*     */ 
/*     */                 
/* 128 */                 if (!a(f5))
/*     */                 {
/* 130 */                   f4 = f5;
/*     */                 }
/*     */               }
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 140 */     if (f4 != null) {
/*     */ 
/*     */       
/* 143 */       paramk.b(paramas);
/*     */       
/* 145 */       com.corrodinggames.rts.game.f f5 = paramk.a(null, f4.dH, f4.dI, paramas.e, null, 0);
/*     */       
/* 147 */       f5.aC = true;
/* 148 */       f5.q = f4;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp boolean a(com.corrodinggames.rts.game.f paramf) {
/* 158 */     Object[] arrayOfObject = com.corrodinggames.rts.game.f.a.a(); byte b; int i;
/* 159 */     for (b = 0, i = com.corrodinggames.rts.game.f.a.a; b < i; b++) {
/*     */       
/* 161 */       com.corrodinggames.rts.game.f f1 = (com.corrodinggames.rts.game.f)arrayOfObject[b];
/*     */       
/* 163 */       if (f1 != paramf && f1.q == paramf)
/*     */       {
/* 165 */         return true;
/*     */       }
/*     */     } 
/* 168 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
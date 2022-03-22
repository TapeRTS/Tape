/*     */ package com.corrodinggames.rts.game.units.custom.b;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends a
/*     */ {
/*     */   LogicBoolean a;
/*     */   float b;
/*     */   float c;
/*     */   int d;
/*     */   
/*     */   public static strictfp void a(l paraml, ab paramab) {
/*  21 */     String str = "movement_random";
/*     */     
/*  23 */     if (paramab.g(str)) {
/*     */       
/*  25 */       g g1 = new g();
/*  26 */       g1.a(paraml, paramab, str, str);
/*     */       
/*  28 */       if (!LogicBoolean.isStaticFalse(g1.a))
/*     */       {
/*  30 */         paraml.a(g1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml, ab paramab, String paramString1, String paramString2) {
/*  39 */     this.a = paramab.a(paraml, paramString1, "enabled");
/*     */     
/*  41 */     this.b = paramab.h(paramString1, "speed");
/*     */     
/*  43 */     this.c = paramab.a(paramString1, "maxSpeed", Float.valueOf(5.0F)).floatValue();
/*     */ 
/*     */     
/*  46 */     this.d = paramab.b(paramString1, "awayFromEdge", Integer.valueOf(75)).intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(k paramk, float paramFloat) {
/*  55 */     if (!this.a.read(paramk)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  61 */     l l = l.u();
/*     */     
/*  63 */     if (paramk.bd()) {
/*     */ 
/*     */       
/*  66 */       if (f.c(paramk.bH) < this.c)
/*     */       {
/*  68 */         paramk.bH += f.b((af)paramk, -this.b, this.b, 1);
/*     */       }
/*     */       
/*  71 */       if (f.c(paramk.bI) < this.c)
/*     */       {
/*  73 */         paramk.bI += f.b((af)paramk, -this.b, this.b, 2);
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/*  79 */       if (f.c(paramk.bK) < this.c)
/*     */       {
/*  81 */         paramk.bK += f.b((af)paramk, -this.b, this.b, 1);
/*     */       }
/*     */       
/*  84 */       paramk.bL += f.b((af)paramk, -1.0F, 1.0F, 2);
/*     */     } 
/*     */ 
/*     */     
/*  88 */     if (this.d > 0) {
/*     */       
/*  90 */       if (paramk.dI > l.bt.g() - this.d)
/*     */       {
/*  92 */         paramk.bI -= f.b((af)paramk, 0.0F, this.b * 0.25F, 10);
/*     */       }
/*  94 */       if (paramk.dI < this.d)
/*     */       {
/*  96 */         paramk.bI += f.b((af)paramk, 0.0F, this.b * 0.25F, 11);
/*     */       }
/*  98 */       if (paramk.dH > l.bt.f() - this.d)
/*     */       {
/* 100 */         paramk.bH -= f.b((af)paramk, 0.0F, this.b * 0.25F, 12);
/*     */       }
/* 102 */       if (paramk.dH < this.d)
/*     */       {
/* 104 */         paramk.bH += f.b((af)paramk, 0.0F, this.b * 0.25F, 13);
/*     */       }
/*     */     } 
/*     */     
/* 108 */     paramk.ao = true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
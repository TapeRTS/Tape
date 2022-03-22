/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.gameFramework.d.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class l
/*     */   extends w
/*     */ {
/*     */   al a;
/*     */   
/*     */   public strictfp l(al paramal, Integer paramInteger) {
/*  22 */     super("u_" + paramal.v());
/*     */ 
/*     */     
/*  25 */     al al1 = com.corrodinggames.rts.game.units.custom.l.c(paramal);
/*  26 */     if (al1 != null) {
/*     */       
/*  28 */       paramal = al1;
/*     */       
/*  30 */       a("u_" + paramal.v());
/*     */     } 
/*     */ 
/*     */     
/*  34 */     if (paramInteger != null)
/*     */     {
/*  36 */       this.f = paramInteger.intValue();
/*     */     }
/*     */     
/*  39 */     this.a = paramal;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a() {
/*  50 */     String str = this.a.f();
/*     */     
/*  52 */     boolean bool1 = false;
/*  53 */     boolean bool2 = true;
/*     */     
/*  55 */     str = str + "\n\n" + a.a(af.c(this.a), false, bool1, bool2);
/*     */ 
/*     */ 
/*     */     
/*  59 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String b() {
/*  65 */     return this.a.e();
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
/*     */   public strictfp int c() {
/*  80 */     return y().a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp g y() {
/*  86 */     g g = this.g.a();
/*  87 */     if (g != null)
/*     */     {
/*  89 */       return g;
/*     */     }
/*     */     
/*  92 */     return this.a.u();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp al i() {
/*  99 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float t() {
/* 105 */     return this.a.C();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp t f() {
/* 111 */     return t.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean k_() {
/* 117 */     return !this.a.B();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean h(af paramaf) {
/* 123 */     if (i().w())
/*     */     {
/* 125 */       return true;
/*     */     }
/* 127 */     return super.h(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean g() {
/* 133 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
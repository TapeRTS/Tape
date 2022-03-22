/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.d.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class p
/*     */   extends s
/*     */ {
/*     */   public p(String paramString) {
/*  28 */     super("c__cut_" + paramString);
/*  29 */     this.f = 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  35 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  40 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al i() {
/*  46 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/*  52 */     return u.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public t f() {
/*  57 */     return t.g;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public r t() {
/*  68 */     r r = null;
/*     */     
/*  70 */     for (w w : w.dK) {
/*     */       
/*  72 */       if (w instanceof r) {
/*     */         
/*  74 */         r r1 = (r)w;
/*  75 */         if (r1.ci)
/*     */         {
/*  77 */           r = r1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     return r;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean H() {
/*  88 */     l l = l.u();
/*     */     
/*  90 */     r r = t();
/*     */     
/*  92 */     if (r != null) {
/*     */       
/*  94 */       if (r instanceof com.corrodinggames.rts.game.units.h)
/*     */       {
/*  96 */         return true;
/*     */       }
/*     */ 
/*     */       
/* 100 */       return (l.bb == r.bB);
/*     */     } 
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String d() {
/* 108 */     return b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 114 */     return a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 120 */     if (!H())
/*     */     {
/* 122 */       return true;
/*     */     }
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean D() {
/* 133 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float j() {
/* 143 */     if (!f.bx)
/*     */     {
/* 145 */       return 1.0F;
/*     */     }
/* 147 */     return 1.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
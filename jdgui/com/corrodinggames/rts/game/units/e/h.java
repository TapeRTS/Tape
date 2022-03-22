/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.gameFramework.b.d;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ public abstract class h
/*     */   extends j
/*     */ {
/*     */   float l;
/*     */   
/*     */   public strictfp h(boolean paramBoolean) {
/*  25 */     super(paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  31 */   public static e m = null;
/*  32 */   public static e[] n = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  38 */     if (this.bB.i == -1)
/*     */     {
/*  40 */       return null;
/*     */     }
/*     */     
/*  43 */     if (cL())
/*     */     {
/*  45 */       return j.dp[this.bB.M()];
/*     */     }
/*     */     
/*  48 */     return n[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void K() {
/*  54 */     l l = l.u();
/*     */     
/*  56 */     m = l.bw.a(R.drawable.unit_icon_hover);
/*     */     
/*  58 */     n = m.a(m);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ah h() {
/*  67 */     return ah.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*  75 */     super.a(paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 111 */     if (cu()) {
/*     */ 
/*     */       
/* 114 */       if (this.bK > 0.0F)
/*     */       {
/* 116 */         this.l += paramFloat;
/*     */       }
/* 118 */       if (this.l > 10.0F) {
/*     */         
/* 120 */         this.l = 0.0F;
/* 121 */         if (j()) {
/*     */           
/* 123 */           l l = l.u();
/* 124 */           float f1 = this.dH + f.i(this.bL) * 4.0F;
/* 125 */           float f2 = this.dI + f.h(this.bL) * 4.0F;
/*     */           
/* 127 */           e e1 = l.bz.b(f1, f2, 0.0F, d.a, false, com.corrodinggames.rts.gameFramework.b.h.b);
/*     */           
/* 129 */           if (e1 != null) {
/*     */             
/* 131 */             e1.ap = 0;
/* 132 */             e1.ao = 13;
/* 133 */             e1.aq = 1;
/*     */             
/* 135 */             e1.s = true;
/* 136 */             e1.F = 0.8F;
/*     */             
/* 138 */             e1.X = 80.0F;
/* 139 */             e1.W = 80.0F;
/*     */             
/* 141 */             e1.Q = -f.i(this.bL) * 0.1F;
/* 142 */             e1.R = -f.h(this.bL) * 0.1F;
/*     */             
/* 144 */             e1.Y = f.c(-180.0F, 180.0F);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
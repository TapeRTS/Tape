/*     */ package com.corrodinggames.rts.game.units.e;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.p;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ public abstract class j
/*     */   extends p
/*     */ {
/*     */   float dl;
/*     */   
/*     */   public strictfp j(boolean paramBoolean) {
/*  18 */     super(paramBoolean);
/*     */   }
/*     */   
/*  21 */   public static e dm = null;
/*  22 */   public static e dn = null;
/*     */ 
/*     */   
/*  25 */   public static e[] do = new e[10];
/*     */   
/*  27 */   public static e[] dp = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  33 */     if (this.bB.i == -1)
/*     */     {
/*  35 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  39 */     if (cL())
/*     */     {
/*  41 */       return dp[this.bB.M()];
/*     */     }
/*     */     
/*  44 */     return do[this.bB.M()];
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void cZ() {
/*  49 */     l l = l.u();
/*     */     
/*  51 */     dm = l.bw.a(R.drawable.unit_icon_land);
/*     */     
/*  53 */     if (dm == null)
/*     */     {
/*  55 */       throw new RuntimeException("IMAGE_ICON is null");
/*     */     }
/*     */     
/*  58 */     do = m.a(dm);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     dn = l.bw.a(R.drawable.unit_icon_land_exp);
/*     */     
/*  65 */     if (dn == null)
/*     */     {
/*  67 */       throw new RuntimeException("IMAGE_ICON_EXP is null");
/*     */     }
/*     */     
/*  70 */     dp = m.a(dn);
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
/*     */   public strictfp void a(float paramFloat) {
/*  83 */     super.a(paramFloat);
/*     */     
/*  85 */     if (this.bz) {
/*     */       
/*  87 */       float f = 0.0F;
/*     */       
/*  89 */       if (cu())
/*     */       {
/*  91 */         f = -10.0F;
/*     */       }
/*     */       
/*  94 */       if (this.dJ > f) {
/*     */         
/*  96 */         if (this.dJ > 0.0F && this.dl < 0.4F)
/*     */         {
/*  98 */           this.dl = 0.4F;
/*     */         }
/*     */         
/* 101 */         this.dl += 0.002F * paramFloat;
/* 102 */         this.dJ -= this.dl * paramFloat;
/*     */         
/* 104 */         if (this.dJ <= f)
/*     */         {
/* 106 */           this.dJ = f;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 112 */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/* 115 */     if (!(this instanceof h)) {
/*     */       
/* 117 */       float f = 0.0F;
/*     */       
/* 119 */       if (this.dJ < f) {
/*     */         
/* 121 */         this.dJ += 0.2F * paramFloat;
/* 122 */         if (this.dJ >= f)
/*     */         {
/* 124 */           this.dJ = f;
/*     */         }
/*     */       } 
/*     */       
/* 128 */       if (this.dJ > 0.0F) {
/*     */         
/* 130 */         this.dl += 0.03F * paramFloat;
/*     */         
/* 132 */         if (this.dJ < 0.0F)
/*     */         {
/* 134 */           this.dl = f.b(this.dl, 0.2F);
/*     */         }
/*     */         
/* 137 */         this.dJ -= this.dl * paramFloat;
/*     */         
/* 139 */         if (this.dJ <= 0.0F) {
/*     */           
/* 141 */           if (this.dJ < 0.0F)
/*     */           {
/* 143 */             this.dJ = 0.0F;
/*     */           }
/* 145 */           this.dl = 0.0F;
/*     */         } 
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
/*     */   public strictfp ah h() {
/* 158 */     return ah.b;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
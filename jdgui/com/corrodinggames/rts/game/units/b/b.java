/*     */ package com.corrodinggames.rts.game.units.b;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.p;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ public abstract class b extends p {
/*     */   float h;
/*     */   boolean i;
/*     */   float j;
/*     */   Boolean k;
/*     */   Boolean l;
/*     */   
/*     */   public strictfp b(boolean paramBoolean) {
/*  22 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  27 */     this.i = false;
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
/*     */   public strictfp void a(ap paramap) {
/*  39 */     paramap.a(this.h);
/*  40 */     paramap.a(this.i);
/*     */     
/*  42 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  50 */     this.h = paramk.g();
/*  51 */     this.i = paramk.e();
/*     */ 
/*     */     
/*  54 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*  58 */   public static e m = null;
/*  59 */   public static e[] n = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  65 */     if (this.bB.i == -1)
/*     */     {
/*  67 */       return null;
/*     */     }
/*  69 */     return n[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void K() {
/*  75 */     l l = l.u();
/*     */     
/*  77 */     m = l.bw.a(R.drawable.unit_icon_air);
/*     */ 
/*     */     
/*  80 */     n = m.a(m);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ah h() {
/*  89 */     return ah.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/*  98 */     super.a(paramFloat);
/*     */ 
/*     */ 
/*     */     
/* 102 */     if (this.bz) {
/*     */       
/* 104 */       if (this.dJ > 0.0F) {
/*     */         
/* 106 */         this.h += 0.06F * paramFloat;
/* 107 */         this.dJ -= this.h * paramFloat;
/*     */       }
/*     */       else {
/*     */         
/* 111 */         if (this.k == null)
/*     */         {
/* 113 */           this.k = Boolean.valueOf(cu());
/*     */         }
/* 115 */         if (this.l == null)
/*     */         {
/* 117 */           this.l = Boolean.valueOf(ct());
/*     */         }
/*     */         
/* 120 */         if (!this.i) {
/*     */ 
/*     */           
/* 123 */           this.i = true;
/*     */ 
/*     */           
/* 126 */           if (this.k.booleanValue()) {
/*     */             
/* 128 */             a(u.a);
/*     */             
/* 130 */             if (this.l.booleanValue())
/*     */             {
/* 132 */               (l.u()).bz.a(this.dH, this.dI, 0.0F, 0, 0.0F, 0.0F, this.bL);
/*     */             
/*     */             }
/*     */           }
/*     */           else {
/*     */             
/* 138 */             a(u.b);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 150 */           this.h = 0.0F;
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 155 */         else if (this.k.booleanValue()) {
/*     */           
/* 157 */           if (this.dJ > -10.0F) {
/*     */             
/* 159 */             this.h += 8.0E-4F * paramFloat;
/* 160 */             this.dJ -= this.h * paramFloat;
/*     */ 
/*     */             
/* 163 */             if (this.l.booleanValue()) {
/*     */               
/* 165 */               this.j += paramFloat;
/* 166 */               if (this.j > 30.0F)
/*     */               {
/* 168 */                 this.j = 0.0F;
/* 169 */                 if (j())
/*     */                 {
/* 171 */                   l l = l.u();
/* 172 */                   e e1 = l.bz.b(this.dH, this.dI, this.dJ, this.bL);
/* 173 */                   if (e1 != null)
/*     */                   {
/* 175 */                     e1.Q = 0.0F;
/* 176 */                     e1.R = -0.1F;
/*     */                   }
/*     */                 
/*     */                 }
/*     */               
/*     */               }
/*     */             
/*     */             } 
/*     */           } 
/*     */         } else {
/*     */           
/* 187 */           this.dJ = 0.0F;
/*     */         } 
/*     */       } 
/*     */       return;
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
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 205 */     l l = l.u();
/*     */     
/* 207 */     if (this.dJ > -1.0F)
/*     */     {
/* 209 */       for (byte b1 = 0; b1 < 3; b1++)
/*     */       {
/* 211 */         l.bz.e(this.dH, this.dI, this.dJ);
/*     */       }
/*     */     }
/*     */     
/* 215 */     return super.e();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\b\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
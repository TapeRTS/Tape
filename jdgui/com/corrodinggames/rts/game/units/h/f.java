/*     */ package com.corrodinggames.rts.game.units.h;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.p;
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
/*     */ public abstract class f
/*     */   extends p
/*     */ {
/*     */   float m;
/*     */   float n;
/*     */   boolean o = false;
/*     */   
/*     */   public strictfp f(boolean paramBoolean) {
/*  28 */     super(paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  35 */     paramap.a(this.n);
/*  36 */     paramap.a(this.o);
/*     */     
/*  38 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  45 */     this.n = paramk.g();
/*  46 */     this.o = paramk.e();
/*     */     
/*  48 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*  52 */   public static e p = null;
/*  53 */   public static e[] q = new e[10];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/*  59 */     if (this.bB.i == -1)
/*     */     {
/*  61 */       return null;
/*     */     }
/*  63 */     return q[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void L() {
/*  69 */     l l = l.u();
/*     */     
/*  71 */     p = l.bw.a(R.drawable.unit_icon_water);
/*     */     
/*  73 */     q = m.a(p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ah h() {
/*  81 */     return ah.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean cf() {
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f() {
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 100 */     super.a(paramFloat);
/*     */ 
/*     */     
/* 103 */     if (this.bz) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 108 */       if (this.dJ > -10.0F) {
/*     */         
/* 110 */         this.n += 0.002F * paramFloat;
/* 111 */         this.dJ -= this.n * paramFloat;
/*     */       }
/*     */       else {
/*     */         
/* 115 */         this.dJ = -10.0F;
/*     */         
/* 117 */         if (!this.o)
/*     */         {
/* 119 */           this.o = true;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 131 */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/* 134 */     if (f()) {
/*     */ 
/*     */       
/* 137 */       if (this.bK != 0.0F)
/*     */       {
/* 139 */         this.m += paramFloat;
/*     */       }
/* 141 */       if (this.m > 10.0F) {
/*     */         
/* 143 */         this.m = 0.0F;
/* 144 */         if (j()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 155 */           l l = l.u();
/*     */ 
/*     */           
/* 158 */           float f1 = this.bL + 180.0F;
/* 159 */           if (this.bK < 0.0F)
/*     */           {
/* 161 */             f1 += 180.0F;
/*     */           }
/*     */           
/* 164 */           float f2 = this.bO - 6.0F;
/* 165 */           if (f2 < 4.0F)
/*     */           {
/* 167 */             f2 = 4.0F;
/*     */           }
/*     */           
/* 170 */           float f3 = this.dH + com.corrodinggames.rts.gameFramework.f.i(f1) * f2;
/* 171 */           float f4 = this.dI + com.corrodinggames.rts.gameFramework.f.h(f1) * f2;
/* 172 */           l.bz.b(f3, f4, 0.0F, f1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\h\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
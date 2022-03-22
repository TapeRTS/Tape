/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bg
/*     */ {
/*     */   public strictfp void a(ap paramap) {
/*  90 */     paramap.e("stats");
/*  91 */     paramap.c(0);
/*     */ 
/*     */     
/*  94 */     int i = m.a;
/*     */     
/*  96 */     paramap.a(i);
/*  97 */     for (byte b = 0; b < i; b++)
/*     */     {
/*  99 */       this.b[b].a(paramap);
/*     */     }
/*     */     
/* 102 */     paramap.a("stats");
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk, boolean paramBoolean) {
/* 107 */     paramk.b("stats");
/* 108 */     byte b = paramk.d();
/*     */ 
/*     */ 
/*     */     
/* 112 */     int i = paramk.f();
/*     */     
/* 114 */     this.b = new bh[m.c];
/* 115 */     for (byte b1 = 0; b1 < i; b1++) {
/*     */       
/* 117 */       this.b[b1] = new bh(this);
/* 118 */       this.b[b1].a(paramk);
/*     */     } 
/*     */ 
/*     */     
/* 122 */     paramk.d("stats");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   bh a = new bh(this);
/*     */   
/* 130 */   bh[] b = new bh[m.c];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 136 */     this.a = new bh(this);
/*     */     
/* 138 */     this.b = new bh[m.c];
/*     */     
/* 140 */     for (byte b = 0; b < this.b.length; b++)
/*     */     {
/* 142 */       this.b[b] = new bh(this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp bh a(af paramaf) {
/* 151 */     return a(paramaf.bB);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp bh a(m paramm) {
/* 156 */     int i = paramm.i;
/* 157 */     if (i < 0 || i >= this.b.length)
/*     */     {
/* 159 */       return this.a;
/*     */     }
/*     */     
/* 162 */     bh bh1 = this.b[i];
/* 163 */     if (bh1 == null)
/*     */     {
/* 165 */       return this.a;
/*     */     }
/* 167 */     return bh1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf1, af paramaf2, float paramFloat) {
/* 175 */     if (paramaf1 != null) {
/*     */ 
/*     */ 
/*     */       
/* 179 */       boolean bool = paramaf2.bz;
/*     */ 
/*     */       
/* 182 */       bh bh1 = a(paramaf1);
/* 183 */       bh bh2 = a(paramaf2);
/*     */       
/* 185 */       if (bool)
/*     */       {
/*     */         
/* 188 */         if (paramaf2.bw()) {
/*     */           
/* 190 */           bh1.d++;
/* 191 */           bh2.g++;
/*     */         }
/* 193 */         else if (paramaf2.cL()) {
/*     */           
/* 195 */           bh1.e++;
/* 196 */           bh2.h++;
/*     */         }
/*     */         else {
/*     */           
/* 200 */           bh1.c++;
/* 201 */           bh2.f++;
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     l l = l.u();
/*     */ 
/*     */     
/* 214 */     if (paramaf2.bB == l.bb)
/*     */     {
/*     */       
/* 217 */       l.a(paramaf2, paramFloat);
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.f.i;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ public class q
/*     */   extends i
/*     */ {
/*     */   public float a;
/*     */   public boolean b;
/*     */   public boolean c;
/*     */   m d;
/*     */   af e;
/*     */   float f;
/*     */   float g;
/*     */   boolean h;
/*     */   
/*     */   strictfp q(boolean paramBoolean) {
/* 226 */     this.b = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int excludeTeam(r paramr) {
/* 232 */     return -2;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp m onlyEnemiesOfTeam(r paramr) {
/* 237 */     return null;
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
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {
/* 260 */     this.a = paramFloat * paramFloat;
/* 261 */     this.h = paramBoolean;
/* 262 */     this.c = true;
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
/*     */   public strictfp void setup(r paramr, float paramFloat) {
/* 275 */     this.e = null;
/* 276 */     this.f = -1.0F;
/* 277 */     this.g = -1.0F;
/*     */     
/* 279 */     this.d = paramr.bB;
/*     */     
/* 281 */     if (!this.c)
/*     */     {
/* 283 */       throw new RuntimeException("AutoRepairCallback not ready");
/*     */     }
/* 285 */     this.c = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void callback(r paramr, float paramFloat, af paramaf) {
/* 292 */     if (paramr == paramaf) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 297 */     if ((paramaf.bY < paramaf.bZ || paramaf.bR < 1.0F) && !paramaf.bz && paramaf.cp == null)
/*     */     {
/* 299 */       if (this.d.d(paramaf.bB) && paramr.a(paramaf)) {
/*     */ 
/*     */ 
/*     */         
/* 303 */         float f = f.a(paramr.dH, paramr.dI, paramaf.dH, paramaf.dI);
/* 304 */         if (f < this.a) {
/*     */           
/* 306 */           boolean bool = false;
/* 307 */           if (!this.h) {
/*     */             
/* 309 */             if (this.f == -1.0F || this.f > paramaf.bY)
/*     */             {
/* 311 */               bool = true;
/*     */             
/*     */             }
/*     */           
/*     */           }
/* 316 */           else if (this.g == -1.0F || this.g > f) {
/*     */             
/* 318 */             bool = true;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 323 */           if (bool)
/*     */           {
/*     */             
/* 326 */             if (paramaf.g() == 0.0F) {
/*     */ 
/*     */               
/* 329 */               this.f = paramaf.bY;
/* 330 */               this.g = f;
/*     */               
/* 332 */               this.e = paramaf;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
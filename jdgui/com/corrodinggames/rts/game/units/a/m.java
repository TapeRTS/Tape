/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.d.f;
/*     */ import com.corrodinggames.rts.gameFramework.e.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class m
/*     */   extends s
/*     */ {
/*     */   boolean a;
/*     */   
/*     */   public m(boolean paramBoolean) {
/*  18 */     super("c_2");
/*     */     
/*  20 */     this.a = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  27 */     if (!this.a)
/*     */     {
/*  29 */       return a.a("gui.actions.reclaimBuildingTarget.description", new Object[0]);
/*     */     }
/*     */     
/*  32 */     return a.a("gui.actions.reclaimTarget.description", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b() {
/*  37 */     if (!this.a)
/*     */     {
/*  39 */       return a.a("gui.actions.reclaimBuildingTarget", new Object[0]);
/*     */     }
/*     */     
/*  42 */     return a.a("gui.actions.reclaimTarget", new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  47 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  52 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ak t() {
/*  58 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/*  64 */     return u.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/*  70 */     return b() + "\n" + a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public t f() {
/*  76 */     return t.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  83 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean p(af paramaf) {
/*  95 */     if (paramaf == null)
/*     */     {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     if (!this.a)
/*     */     {
/* 102 */       return paramaf.bw();
/*     */     }
/*     */     
/* 105 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float j() {
/* 116 */     if (!f.bx)
/*     */     {
/* 118 */       return 0.6F;
/*     */     }
/* 120 */     return 1.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.corrodinggames.rts.game.units.custom;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.w;
/*    */ 
/*    */ class b extends a {
/*    */   public x e;
/*    */   public float f;
/*    */   
/*    */   public b(float paramFloat1, float paramFloat2) {
/* 10 */     super(paramFloat1, paramFloat2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float g;
/*    */ 
/*    */   
/*    */   public boolean h;
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(l paraml, String paramString1, String paramString2) {
/*    */     try {
/* 25 */       if (paramString1.equalsIgnoreCase("x")) {
/*    */         
/* 27 */         this.f = Float.parseFloat(paramString2);
/*    */         return;
/*    */       } 
/* 30 */       if (paramString1.equalsIgnoreCase("y")) {
/*    */         
/* 32 */         this.g = Float.parseFloat(paramString2);
/*    */         
/*    */         return;
/*    */       } 
/* 36 */     } catch (NumberFormatException numberFormatException) {
/*    */       
/* 38 */       throw new at("Failed to parse float:" + paramString2);
/*    */     } 
/*    */     
/* 41 */     if (paramString1.equalsIgnoreCase("name")) {
/*    */       
/* 43 */       this.e = paraml.a(paramString2, (x)null);
/*    */       
/*    */       return;
/*    */     } 
/* 47 */     throw new at("Unknown event key:" + paramString1 + " on animation");
/*    */   }
/*    */ 
/*    */   
/*    */   public void finalize() {
/* 52 */     this.h = true;
/*    */     
/* 54 */     if (this.e == null)
/*    */     {
/* 56 */       throw new at("Animation effect missing key 'name'");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(k paramk) {
/* 64 */     if (this.e != null) {
/*    */       
/* 66 */       float f1 = paramk.dH;
/* 67 */       float f2 = paramk.dI;
/*    */       
/* 69 */       f1 += this.f;
/* 70 */       f2 += this.g;
/*    */       
/* 72 */       this.e.a(f1, f2, paramk.dJ, paramk.bL, (w)paramk);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
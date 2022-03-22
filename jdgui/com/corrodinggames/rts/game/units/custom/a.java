/*    */ package com.corrodinggames.rts.game.units.custom;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class a
/*    */   implements Comparable
/*    */ {
/*    */   public float a;
/*    */   public float b;
/*    */   public float c;
/*    */   public float d;
/*    */   
/*    */   public a(float paramFloat1, float paramFloat2) {
/* 22 */     this.a = paramFloat1;
/* 23 */     this.b = paramFloat2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(a parama) {
/* 31 */     if (this.a == parama.a)
/*    */     {
/* 33 */       return 0;
/*    */     }
/* 35 */     return (this.a > parama.a) ? 1 : -1;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.corrodinggames.rts.game.units.a;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.d.i;
/*    */ import com.corrodinggames.rts.game.units.d.k;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class w
/*    */   extends s
/*    */ {
/*    */   public w(int paramInt) {
/* 15 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public w(String paramString) {
/* 19 */     super(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int b(af paramaf, boolean paramBoolean) {
/* 26 */     if (!(paramaf instanceof k))
/*    */     {
/* 28 */       return 99;
/*    */     }
/*    */     
/* 31 */     return ((k)paramaf).a(J(), paramBoolean);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public float q(af paramaf) {
/* 37 */     if (!(paramaf instanceof k))
/*    */     {
/* 39 */       return -1.0F;
/*    */     }
/*    */     
/* 42 */     k k = (k)paramaf;
/*    */     
/* 44 */     i i = k.dc();
/*    */     
/* 46 */     if (i == null)
/*    */     {
/* 48 */       return -1.0F;
/*    */     }
/*    */     
/* 51 */     if (!d(i.h))
/*    */     {
/* 53 */       return -1.0F;
/*    */     }
/*    */     
/* 56 */     if (i.k < 0.0F)
/*    */     {
/* 58 */       return 0.0F;
/*    */     }
/*    */     
/* 61 */     return i.k;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float t() {
/* 69 */     return 0.01F;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean q() {
/* 75 */     return true;
/*    */   }
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
/*    */ 
/*    */   
/*    */   public u e() {
/* 91 */     return u.c;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
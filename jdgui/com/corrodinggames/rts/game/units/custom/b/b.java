/*    */ package com.corrodinggames.rts.game.units.custom.b;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ import com.corrodinggames.rts.game.units.d.p;
/*    */ import com.corrodinggames.rts.game.units.r;
/*    */ 
/*    */ 
/*    */ public class b
/*    */   extends a
/*    */ {
/* 11 */   public static final a a = new b();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void b(k paramk, float paramFloat) {
/* 19 */     paramk.s += paramFloat;
/*    */     
/* 21 */     if (paramk.s > 40.0F)
/*    */     {
/* 23 */       if (paramk.ao()) {
/*    */ 
/*    */         
/* 26 */         paramk.s = 0.0F;
/*    */         
/* 28 */         p.a((r)paramk, paramFloat, 0.0F, false);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
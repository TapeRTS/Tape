/*    */ package com.corrodinggames.rts.game.units.g;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.r;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ import com.corrodinggames.rts.gameFramework.utility.m;
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
/*    */ public final class b
/*    */ {
/*    */   public static void a(r paramr, float paramFloat) {
/* 19 */     m m = paramr.bb;
/*    */     
/* 21 */     if (m == null) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/* 26 */     l l = l.u();
/* 27 */     int i = l.bh;
/*    */     
/* 29 */     Object[] arrayOfObject = m.a();
/* 30 */     for (int j = m.a - 1; j >= 0; j--) {
/*    */       
/* 32 */       a a = (a)arrayOfObject[j];
/*    */       
/* 34 */       if (a.a <= i) {
/*    */         
/* 36 */         m.remove(j);
/*    */       }
/*    */       else {
/*    */         
/* 40 */         a.a(paramr, paramFloat);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(r paramr, a parama) {
/* 49 */     if (paramr.bb == null)
/*    */     {
/* 51 */       paramr.bb = new m();
/*    */     }
/*    */     
/* 54 */     if (paramr.bb.size() > 1000) {
/*    */       
/* 56 */       paramr.a("status effect limit reached");
/*    */       
/*    */       return;
/*    */     } 
/* 60 */     paramr.bb.add(parama);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\g\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
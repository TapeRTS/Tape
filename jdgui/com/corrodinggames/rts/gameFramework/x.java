/*    */ package com.corrodinggames.rts.gameFramework;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class x
/*    */   implements Comparator
/*    */ {
/*    */   public strictfp int a(w paramw1, w paramw2) {
/* 38 */     if (paramw1.dF > paramw2.dF) return 1; 
/* 39 */     if (paramw1.dF < paramw2.dF) return -1;
/*    */     
/* 41 */     if (paramw1.dG > paramw2.dG) return 1; 
/* 42 */     if (paramw1.dG < paramw2.dG) return -1;
/*    */ 
/*    */ 
/*    */     
/* 46 */     if (paramw1.dI > paramw2.dI) return 1; 
/* 47 */     if (paramw1.dI < paramw2.dI) return -1;
/*    */     
/* 49 */     return 0;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
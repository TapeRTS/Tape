/*    */ package com.corrodinggames.rts.gameFramework;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.g.ap;
/*    */ import com.corrodinggames.rts.gameFramework.g.k;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class az
/*    */   extends w
/*    */ {
/* 14 */   public int dQ = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected strictfp az(boolean paramBoolean) {
/* 21 */     super(paramBoolean);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(ap paramap) {
/* 28 */     paramap.d("xy is:");
/*    */ 
/*    */     
/* 31 */     paramap.a(this.dH);
/* 32 */     paramap.a(this.dI);
/*    */     
/* 34 */     paramap.a(this.dJ);
/*    */     
/* 36 */     paramap.a(this.dQ);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     super.a(paramap);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(k paramk) {
/* 47 */     this.dH = paramk.g();
/* 48 */     this.dI = paramk.g();
/*    */     
/* 50 */     this.dJ = paramk.g();
/*    */     
/* 52 */     this.dQ = paramk.f();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     super.a(paramk);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
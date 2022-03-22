/*    */ package com.corrodinggames.rts.gameFramework;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.j.e;
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
/*    */ public abstract class ay
/*    */   extends az
/*    */ {
/*    */   public int dL;
/*    */   public int dM;
/*    */   public int dN;
/*    */   public int dO;
/*    */   public boolean dP;
/*    */   
/*    */   public strictfp void b(e parame) {
/* 26 */     S(parame.k);
/* 27 */     T(parame.l);
/* 28 */     this.dP = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public strictfp void a(e parame, int paramInt) {
/* 33 */     S(parame.k / paramInt);
/* 34 */     T(parame.l);
/* 35 */     this.dP = false;
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
/*    */   public strictfp void S(int paramInt) {
/* 47 */     this.dL = paramInt;
/* 48 */     this.dN = paramInt / 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public strictfp void T(int paramInt) {
/* 53 */     this.dM = paramInt;
/* 54 */     this.dO = paramInt / 2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected strictfp ay(boolean paramBoolean) {
/* 63 */     super(paramBoolean);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a() {
/* 72 */     super.a();
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
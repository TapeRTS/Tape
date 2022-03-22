/*    */ package com.corrodinggames.rts.game.units.custom;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class at
/*    */   extends Exception
/*    */ {
/*    */   public String a;
/*    */   public String b;
/*    */   public String c;
/*    */   
/*    */   public at(String paramString1, String paramString2) {
/* 14 */     super(paramString1);
/* 15 */     this.a = paramString2;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public at(String paramString) {
/* 21 */     super(paramString);
/*    */   }
/*    */ 
/*    */   
/*    */   public at(String paramString1, String paramString2, String paramString3) {
/* 26 */     super(paramString1);
/* 27 */     this.b = paramString2;
/* 28 */     this.c = paramString3;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
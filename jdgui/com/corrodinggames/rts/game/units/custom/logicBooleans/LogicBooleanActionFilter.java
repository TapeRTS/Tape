/*    */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.a.b;
/*    */ import com.corrodinggames.rts.game.units.a.s;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ 
/*    */ public class LogicBooleanActionFilter
/*    */   extends b
/*    */ {
/*    */   LogicBoolean logicBoolean;
/*    */   k target;
/*    */   
/*    */   public LogicBooleanActionFilter(LogicBoolean paramLogicBoolean, k paramk) {
/* 15 */     this.logicBoolean = paramLogicBoolean;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isAvailable(s params, af paramaf) {
/* 36 */     return this.logicBoolean.read(this.target);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\LogicBooleanActionFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
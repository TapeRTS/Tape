/*    */ package com.corrodinggames.rts.game.units.custom.logicBooleans;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
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
/*    */ public class LogicBooleanLoader$ParameterMapping$FieldOrMethod
/*    */ {
/*    */   Field field;
/*    */   Method method;
/*    */   Class type;
/*    */   
/*    */   public LogicBooleanLoader$ParameterMapping$FieldOrMethod(Field paramField) {
/* 41 */     this.field = paramField;
/* 42 */     this.type = paramField.getType();
/*    */   }
/*    */ 
/*    */   
/*    */   public LogicBooleanLoader$ParameterMapping$FieldOrMethod(Method paramMethod) {
/* 47 */     this.method = paramMethod;
/* 48 */     this.type = paramMethod.getParameterTypes()[0];
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\logicBooleans\LogicBooleanLoader$ParameterMapping$FieldOrMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
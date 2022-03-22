/*    */ package com.corrodinggames.rts.game.units.custom.b;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.custom.h;
/*    */ import com.corrodinggames.rts.game.units.custom.i;
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ import com.corrodinggames.rts.game.units.custom.l;
/*    */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*    */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class e
/*    */   extends a
/*    */ {
/*    */   LogicBoolean a;
/*    */   float b;
/*    */   float c;
/*    */   i d;
/*    */   boolean e;
/*    */   
/*    */   public static strictfp void a(l paraml, ab paramab) {
/* 25 */     String str = "movement_repelFromUnits";
/*    */     
/* 27 */     if (paramab.g(str)) {
/*    */       
/* 29 */       e e1 = new e();
/* 30 */       e1.a(paraml, paramab, str, str);
/*    */       
/* 32 */       if (!LogicBoolean.isStaticFalse(e1.a))
/*    */       {
/* 34 */         paraml.a(e1);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(l paraml, ab paramab, String paramString1, String paramString2) {
/* 43 */     this.a = paramab.a(paraml, paramString1, "enabled");
/*    */     
/* 45 */     this.b = paramab.h(paramString1, "speed");
/*    */     
/* 47 */     this.c = paramab.a(paramString1, "maxSpeed", Float.valueOf(5.0F)).floatValue();
/*    */     
/* 49 */     this.d = h.a(paramab.b(paramString1, "otherUnitHasTag", null), null);
/*    */     
/* 51 */     this.e = paramab.a(paramString1, "onlySameTeam", Boolean.valueOf(false)).booleanValue();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void b(k paramk, float paramFloat) {
/* 61 */     if (!this.a.read(paramk))
/*    */       return; 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
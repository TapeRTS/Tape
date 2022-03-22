/*    */ package com.corrodinggames.rts.game.a;
/*    */ 
/*    */ import com.corrodinggames.rts.game.units.an;
/*    */ import com.corrodinggames.rts.game.units.ao;
/*    */ import com.corrodinggames.rts.game.units.r;
/*    */ import java.util.AbstractList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class f
/*    */ {
/*    */   static boolean a(r paramr) {
/* 16 */     boolean bool = false;
/*    */     
/* 18 */     if (paramr.ao())
/*    */     {
/* 20 */       bool = true;
/*    */     }
/*    */     
/* 23 */     if (!bool) {
/*    */       
/* 25 */       an an = paramr.ap();
/* 26 */       if (an != null && an.d() == ao.g)
/*    */       {
/* 28 */         bool = true;
/*    */       }
/*    */     } 
/*    */     
/* 32 */     return bool;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static boolean b(r paramr) {
/* 39 */     boolean bool = false;
/*    */     
/* 41 */     if (paramr.ao())
/*    */     {
/* 43 */       bool = true;
/*    */     }
/*    */     
/* 46 */     return bool;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Object a(AbstractList paramAbstractList) {
/* 54 */     int i = paramAbstractList.size();
/* 55 */     if (i == 0)
/*    */     {
/* 57 */       return null;
/*    */     }
/* 59 */     return paramAbstractList.get(com.corrodinggames.rts.gameFramework.f.a(0, i - 1));
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
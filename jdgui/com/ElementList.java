/*    */ package com;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class ElementList
/*    */ {
/*  7 */   ArrayList elements = new ArrayList();
/*    */ 
/*    */   
/*    */   public Element getFirst() {
/* 11 */     if (this.elements.size() > 0)
/*    */     {
/* 13 */       return this.elements.get(0);
/*    */     }
/* 15 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\ElementList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
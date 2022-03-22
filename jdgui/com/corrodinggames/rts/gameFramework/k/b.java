/*    */ package com.corrodinggames.rts.gameFramework.k;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */ {
/* 54 */   m a = new m();
/*    */ 
/*    */ 
/*    */   
/*    */   boolean b;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(a parama) {
/* 64 */     this.a.add(parama);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 69 */     return (this.a.a > 0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 75 */     boolean bool1 = false;
/* 76 */     boolean bool2 = true;
/*    */     
/* 78 */     for (a a : this.a) {
/*    */       
/* 80 */       if (a.j) {
/*    */         
/* 82 */         bool1 = true;
/*    */         
/*    */         continue;
/*    */       } 
/* 86 */       bool2 = false;
/*    */     } 
/*    */ 
/*    */     
/* 90 */     if (this.b)
/*    */     {
/* 92 */       if (!bool2)
/*    */       {
/* 94 */         bool1 = false;
/*    */       }
/*    */     }
/*    */     
/* 98 */     return bool1;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
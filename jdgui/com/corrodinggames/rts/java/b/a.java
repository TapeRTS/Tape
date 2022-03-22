/*    */ package com.corrodinggames.rts.java.b;
/*    */ 
/*    */ import com.corrodinggames.librocket.a;
/*    */ import com.corrodinggames.rts.java.Main;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends a
/*    */ {
/*    */   public Main e;
/*    */   
/*    */   public static synchronized a o() {
/* 17 */     if (a != null)
/*    */     {
/* 19 */       throw new RuntimeException("CommonGuiEngine already exists");
/*    */     }
/* 21 */     a a1 = new a();
/* 22 */     a = a1;
/* 23 */     return a1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void f() {
/* 29 */     this.e.i();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void g() {
/* 35 */     this.e.u = true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int h() {
/* 41 */     return this.e.j.e();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void d(boolean paramBoolean) {
/* 47 */     this.e.a(paramBoolean);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\b\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
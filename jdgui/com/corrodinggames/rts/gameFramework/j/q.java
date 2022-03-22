/*    */ package com.corrodinggames.rts.gameFramework.j;
/*    */ 
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Typeface;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class q
/*    */   extends Paint
/*    */ {
/* 15 */   public static final q r = new q(); static {
/* 16 */     r.b(-1);
/* 17 */     r.n();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   boolean s = false;
/*    */ 
/*    */ 
/*    */   
/*    */   public void n() {
/* 27 */     this.s = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(float paramFloat) {
/* 32 */     super.b(paramFloat);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(float paramFloat) {
/* 38 */     if (this.s) {
/*    */       
/* 40 */       l.b("UniquePaint changed when locked down:");
/* 41 */       l.b("from:" + k() + " to: " + paramFloat);
/*    */       
/* 43 */       l.M();
/*    */     } 
/* 45 */     super.b(paramFloat);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Typeface a(Typeface paramTypeface) {
/* 52 */     if (this.s) {
/*    */       
/* 54 */       l.b("UniquePaint changed when locked down:");
/* 55 */       l.M();
/*    */     } 
/* 57 */     return super.a(paramTypeface);
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
/*    */   public static void b(Paint paramPaint) {
/* 74 */     ((q)paramPaint).n();
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
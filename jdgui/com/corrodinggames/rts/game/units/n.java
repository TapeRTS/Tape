/*    */ package com.corrodinggames.rts.game.units;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.g.ap;
/*    */ import com.corrodinggames.rts.gameFramework.g.k;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class n
/*    */   extends q
/*    */ {
/* 15 */   public int a = 14;
/* 16 */   public float b = 60.0F;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(ap paramap) {
/* 22 */     paramap.c(0);
/*    */     
/* 24 */     paramap.a(this.a);
/* 25 */     paramap.a(this.b);
/*    */     
/* 27 */     super.a(paramap);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(k paramk) {
/* 33 */     paramk.d();
/*    */     
/* 35 */     this.a = paramk.f();
/* 36 */     this.b = paramk.g();
/*    */     
/* 38 */     super.a(paramk);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp ak b() {
/* 45 */     return ak.R;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static strictfp void c() {
/* 51 */     l l = l.u();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp n(boolean paramBoolean) {
/* 58 */     super(paramBoolean);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(float paramFloat) {
/* 66 */     super.a(paramFloat);
/*    */     
/* 68 */     this.b -= paramFloat;
/*    */     
/* 70 */     if (this.b < 0.0F)
/*    */     {
/* 72 */       bU();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp int s() {
/* 80 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp boolean t() {
/* 87 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp boolean o_() {
/* 93 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
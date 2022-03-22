/*    */ package com.corrodinggames.rts.game.units.d;
/*    */ 
/*    */ import com.corrodinggames.rts.R;
/*    */ import com.corrodinggames.rts.game.m;
/*    */ import com.corrodinggames.rts.game.units.ak;
/*    */ import com.corrodinggames.rts.game.units.al;
/*    */ import com.corrodinggames.rts.gameFramework.j.e;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class t
/*    */   extends h
/*    */ {
/* 18 */   static e a = null;
/* 19 */   static e[] b = new e[10];
/* 20 */   static e c = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static strictfp void b() {
/* 26 */     l l = l.u();
/*    */     
/* 28 */     a = l.bw.a(R.drawable.wall_v);
/* 29 */     c = l.bw.a(R.drawable.wall_v);
/*    */ 
/*    */     
/* 32 */     b = m.a(a);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp e d() {
/* 40 */     if (this.bz)
/*    */     {
/* 42 */       return c;
/*    */     }
/*    */     
/* 45 */     if (this.bB == null)
/*    */     {
/* 47 */       return b[b.length - 1];
/*    */     }
/*    */     
/* 50 */     return b[this.bB.M()];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp e k() {
/* 57 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp void a(int paramInt) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp t(boolean paramBoolean) {
/* 68 */     super(paramBoolean);
/*    */ 
/*    */     
/* 71 */     b(a);
/*    */ 
/*    */     
/* 74 */     this.bO = 15.0F;
/* 75 */     this.bP = this.bO;
/*    */     
/* 77 */     this.bZ = 700.0F;
/* 78 */     this.bY = this.bZ;
/*    */     
/* 80 */     this.D = a;
/*    */ 
/*    */     
/* 83 */     this.n.a(0, 0, 1, 0);
/* 84 */     this.o.a(0, 0, 1, 0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public strictfp ak c() {
/* 91 */     return ak.I;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
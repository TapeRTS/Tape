/*    */ package com.corrodinggames.rts.game.units.f;
/*    */ 
/*    */ import com.corrodinggames.rts.game.m;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ 
/*    */ public class a
/*    */ {
/*  8 */   public final b a = new b();
/*  9 */   public final b[] b = new b[m.c];
/*    */   
/* 11 */   public final b c = new b();
/* 12 */   public final b d = new b();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   float e;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public a() {
/* 25 */     for (byte b1 = 0; b1 < this.b.length; b1++)
/*    */     {
/* 27 */       this.b[b1] = new b();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(af paramaf) {
/* 34 */     this.a.a.a(paramaf);
/*    */     
/* 36 */     if (paramaf.cP >= 0) {
/*    */       
/* 38 */       (this.b[paramaf.cP]).a.a(paramaf);
/*    */     }
/* 40 */     else if (paramaf.cP == -1) {
/*    */       
/* 42 */       this.d.a.a(paramaf);
/*    */     }
/* 44 */     else if (paramaf.cP == -2) {
/*    */       
/* 46 */       this.c.a.a(paramaf);
/*    */     } 
/*    */     
/* 49 */     if (paramaf.bO > this.e)
/*    */     {
/* 51 */       this.e = paramaf.bO;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(af paramaf) {
/* 58 */     this.a.a.remove(paramaf);
/*    */     
/* 60 */     if (paramaf.cP >= 0) {
/*    */       
/* 62 */       (this.b[paramaf.cP]).a.remove(paramaf);
/*    */     }
/* 64 */     else if (paramaf.cP == -1) {
/*    */       
/* 66 */       this.d.a.remove(paramaf);
/*    */     }
/* 68 */     else if (paramaf.cP == -2) {
/*    */       
/* 70 */       this.c.a.remove(paramaf);
/*    */     } 
/*    */     
/* 73 */     if (this.a.a.b == 0)
/*    */     {
/* 75 */       this.e = 0.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
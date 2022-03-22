/*    */ package com.corrodinggames.rts.game.units.custom.a.a;
/*    */ 
/*    */ import android.graphics.PointF;
/*    */ import com.corrodinggames.rts.game.units.a.s;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.custom.a.a;
/*    */ import com.corrodinggames.rts.game.units.custom.a.c;
/*    */ import com.corrodinggames.rts.game.units.custom.au;
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ import com.corrodinggames.rts.game.units.custom.l;
/*    */ import com.corrodinggames.rts.gameFramework.utility.ab;
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
/*    */ public class i
/*    */   extends a
/*    */ {
/*    */   public au a;
/*    */   public au b;
/*    */   
/*    */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/* 31 */     au au1 = au.a(paraml, paramab, paramString1, paramString2 + "produceUnits");
/* 32 */     if (!au1.b()) {
/*    */       
/* 34 */       i i1 = new i();
/* 35 */       i1.a = au1;
/* 36 */       paramc.W.add(i1);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 41 */     au au2 = au.a(paraml, paramab, paramString1, paramString2 + "spawnUnits");
/* 42 */     if (!au2.b()) {
/*    */       
/* 44 */       i i1 = new i();
/* 45 */       i1.b = au2;
/* 46 */       paramc.W.add(i1);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 56 */     if (this.a != null) {
/*    */       
/* 58 */       m m = new m();
/*    */       
/* 60 */       this.a.a(m, paramk.bB, (af)paramk, false);
/*    */       
/* 62 */       for (af af1 : m) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 67 */         paramk.A(af1);
/*    */         
/* 69 */         paramk.B(af1);
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 74 */     if (this.b != null)
/*    */     {
/*    */       
/* 77 */       this.b.a(paramk.dH, paramk.dI, paramk.dJ, paramk.bL, paramk.bB, false, (af)paramk);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 82 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
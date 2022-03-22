/*    */ package com.corrodinggames.rts.game.units.custom.a.a;
/*    */ 
/*    */ import android.graphics.PointF;
/*    */ import com.corrodinggames.rts.game.units.a.s;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.custom.a.a;
/*    */ import com.corrodinggames.rts.game.units.custom.a.c;
/*    */ import com.corrodinggames.rts.game.units.custom.at;
/*    */ import com.corrodinggames.rts.game.units.custom.d.a;
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ import com.corrodinggames.rts.game.units.custom.l;
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class g
/*    */   extends a
/*    */ {
/*    */   a a;
/*    */   a b;
/*    */   double c;
/*    */   double d;
/*    */   float e;
/*    */   
/*    */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/* 29 */     a a1 = paramab.a(paraml, paramString1, "convertResource_from", null, true);
/* 30 */     a a2 = paramab.a(paraml, paramString1, "convertResource_to", null, true);
/*    */     
/* 32 */     if (a1 != null || a2 != null)
/*    */     {
/* 34 */       if (a1 == null || a2 == null)
/*    */       {
/* 36 */         throw new at("[" + paramString1 + "] Both convertResource_from and convertResource_to are required together");
/*    */       }
/*    */     }
/*    */     
/* 40 */     if (a1 != null && a2 != null) {
/*    */       
/* 42 */       g g1 = new g();
/*    */       
/* 44 */       g1.a = a1;
/* 45 */       g1.b = a2;
/*    */       
/* 47 */       g1.c = paramab.a(paramString1, "convertResource_minAmount", 0.0D);
/* 48 */       g1.d = paramab.i(paramString1, "convertResource_maxAmount");
/*    */       
/* 50 */       if (g1.c < 0.0D)
/*    */       {
/* 52 */         throw new at("[" + paramString1 + "] convertResource_minAmount cannot be < 0");
/*    */       }
/*    */       
/* 55 */       if (g1.d < 0.0D)
/*    */       {
/* 57 */         throw new at("[" + paramString1 + "] convertResource_maxAmount cannot be < 0");
/*    */       }
/*    */       
/* 60 */       if (g1.d < g1.c)
/*    */       {
/* 62 */         throw new at("[" + paramString1 + "] convertResource_maxAmount cannot be < convertResource_minAmount");
/*    */       }
/*    */       
/* 65 */       g1.e = paramab.a(paramString1, "convertResource_multiplyAmountBy", Float.valueOf(1.0F)).floatValue();
/*    */       
/* 67 */       paramc.W.add(g1);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 77 */     double d = this.a.a((af)paramk);
/*    */     
/* 79 */     if (d > this.c) {
/*    */       
/* 81 */       double d1 = f.a(d, this.d);
/*    */       
/* 83 */       this.a.b((af)paramk, -d1);
/*    */       
/* 85 */       d1 *= this.e;
/*    */       
/* 87 */       this.b.b((af)paramk, d1);
/*    */     } 
/*    */ 
/*    */     
/* 91 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
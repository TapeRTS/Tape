/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends a
/*     */ {
/*     */   com.corrodinggames.rts.game.units.custom.d.a a;
/*  32 */   double b = Double.MIN_VALUE;
/*     */   com.corrodinggames.rts.game.units.custom.d.a c;
/*  34 */   float d = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  67 */     com.corrodinggames.rts.game.units.custom.d.a a1 = paramab.a(paraml, paramString1, paramString2 + "resourceAmount", null, true);
/*     */     
/*  69 */     if (a1 != null) {
/*     */       
/*  71 */       a a2 = new a();
/*  72 */       a2.a = a1;
/*  73 */       a2.b = paramab.a(paramString1, paramString2 + "resourceAmount_setValue", Double.MIN_VALUE);
/*  74 */       a2.c = paramab.a(paraml, paramString1, paramString2 + "resourceAmount_addOtherResource", null, true);
/*  75 */       a2.d = paramab.a(paramString1, paramString2 + "resourceAmount_multiplyBy", Float.valueOf(1.0F)).floatValue();
/*     */       
/*  77 */       paramc.W.add(a2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 108 */     if (this.a != null) {
/*     */       double d;
/*     */       
/* 111 */       if (this.b != Double.MIN_VALUE) {
/*     */         
/* 113 */         d = this.b;
/*     */       }
/*     */       else {
/*     */         
/* 117 */         d = this.a.a((af)paramk);
/*     */       } 
/*     */       
/* 120 */       if (this.c != null)
/*     */       {
/* 122 */         d += this.c.a((af)paramk);
/*     */       }
/*     */       
/* 125 */       d *= this.d;
/*     */       
/* 127 */       this.a.a((af)paramk, d);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
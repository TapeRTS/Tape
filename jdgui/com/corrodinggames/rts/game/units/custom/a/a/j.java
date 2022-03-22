/*    */ package com.corrodinggames.rts.game.units.custom.a.a;
/*    */ 
/*    */ import android.graphics.PointF;
/*    */ import com.corrodinggames.rts.game.units.a.s;
/*    */ import com.corrodinggames.rts.game.units.af;
/*    */ import com.corrodinggames.rts.game.units.custom.a.a;
/*    */ import com.corrodinggames.rts.game.units.custom.a.c;
/*    */ import com.corrodinggames.rts.game.units.custom.i;
/*    */ import com.corrodinggames.rts.game.units.custom.k;
/*    */ import com.corrodinggames.rts.game.units.custom.l;
/*    */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class j
/*    */   extends a
/*    */ {
/*    */   boolean a;
/*    */   i b;
/*    */   i c;
/*    */   i d;
/*    */   i e;
/*    */   
/*    */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/* 31 */     boolean bool = paramab.a(paramString1, paramString2 + "resetToDefaultTags", Boolean.valueOf(false)).booleanValue();
/*    */     
/* 33 */     i i1 = paramab.a(paraml, paramString1, paramString2 + "temporarilyAddTags", null);
/* 34 */     i i2 = paramab.a(paraml, paramString1, paramString2 + "temporarilyRemoveTags", null);
/*    */     
/* 36 */     if (bool || i1 != null || i2 != null) {
/*    */       
/* 38 */       j j1 = new j();
/* 39 */       j1.a = bool;
/*    */       
/* 41 */       j1.b = i1;
/* 42 */       j1.c = i2;
/*    */       
/* 44 */       paramc.W.add(j1);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 49 */     i i3 = paramab.a(paraml, paramString1, paramString2 + "addGlobalTeamTags", null);
/* 50 */     i i4 = paramab.a(paraml, paramString1, paramString2 + "removeGlobalTeamTags", null);
/*    */     
/* 52 */     if (i3 != null || i4 != null) {
/*    */       
/* 54 */       j j1 = new j();
/*    */       
/* 56 */       j1.d = i3;
/* 57 */       j1.e = i4;
/*    */       
/* 59 */       paramc.W.add(j1);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 71 */     if (this.a)
/*    */     {
/* 73 */       paramk.k(false);
/*    */     }
/*    */     
/* 76 */     if (this.c != null)
/*    */     {
/* 78 */       paramk.b(this.c);
/*    */     }
/*    */     
/* 81 */     if (this.b != null)
/*    */     {
/* 83 */       paramk.a(this.b);
/*    */     }
/*    */     
/* 86 */     if (this.d != null)
/*    */     {
/* 88 */       paramk.bB.b(this.d);
/*    */     }
/*    */     
/* 91 */     if (this.e != null)
/*    */     {
/* 93 */       paramk.bB.c(this.e);
/*    */     }
/*    */     
/* 96 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
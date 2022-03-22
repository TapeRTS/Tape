/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.au;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ public class m
/*     */   extends a
/*     */ {
/*     */   public au a;
/*     */   public int b;
/*     */   public i c;
/*     */   public boolean d;
/*     */   public boolean e;
/*  33 */   public int f = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  38 */     au au1 = au.a(paraml, paramab, paramString1, paramString2 + "addUnitsIntoTransport");
/*     */     
/*  40 */     int j = paramab.b(paramString1, paramString2 + "deleteNumUnitsFromTransport", Integer.valueOf(0)).intValue();
/*     */     
/*  42 */     i i1 = h.a(paramab.b(paramString1, "deleteNumUnitsFromTransport_onlyWithTags", null), null);
/*     */     
/*  44 */     boolean bool1 = paramab.a(paramString1, paramString2 + "startUnloadingTransport", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/*  47 */     boolean bool2 = paramab.a(paramString1, paramString2 + "forceUnloadTransportNow", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  49 */     int k = paramab.b(paramString1, paramString2 + "forceUnloadTransportNow_onlyOnSlot", Integer.valueOf(-1)).intValue();
/*     */     
/*  51 */     if (k != -1 && !bool2)
/*     */     {
/*  53 */       throw new at("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
/*     */     }
/*     */ 
/*     */     
/*  57 */     if (!au1.b() || j > 0 || bool1 || bool2) {
/*     */ 
/*     */       
/*  60 */       m m1 = new m();
/*  61 */       if (!au1.b())
/*     */       {
/*  63 */         m1.a = au1;
/*     */       }
/*     */       
/*  66 */       if (j > 0) {
/*     */         
/*  68 */         m1.b = j;
/*  69 */         m1.c = i1;
/*     */       } 
/*     */       
/*  72 */       m1.d = bool1;
/*  73 */       m1.e = bool2;
/*     */ 
/*     */ 
/*     */       
/*  77 */       m1.f = k;
/*     */       
/*  79 */       paramc.W.add(m1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/*  90 */     if (this.b != 0)
/*     */     {
/*  92 */       for (byte b = 0; b < this.b; b++) {
/*     */         
/*  94 */         if (paramk.x.size() > 0)
/*     */         {
/*     */           
/*  97 */           for (int j = paramk.x.size() - 1; j >= 0; j--) {
/*     */             
/*  99 */             af af1 = (af)paramk.x.get(j);
/*     */             
/* 101 */             if (af1 == null) {
/*     */               
/* 103 */               l.b("deleteNumUnitsFromTransport unit==null");
/*     */ 
/*     */             
/*     */             }
/* 107 */             else if (this.c == null || h.a(this.c, af1.cM())) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 112 */               paramk.x.remove(j);
/*     */               
/* 114 */               paramk.z(af1);
/*     */               
/* 116 */               if (af1 != null)
/*     */               {
/* 118 */                 af1.bU();
/*     */               }
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 128 */     if (this.a != null) {
/*     */       
/* 130 */       com.corrodinggames.rts.gameFramework.utility.m m1 = new com.corrodinggames.rts.gameFramework.utility.m();
/*     */       
/* 132 */       this.a.a(m1, paramk.bB, (af)paramk, false);
/*     */       
/* 134 */       for (af af1 : m1) {
/*     */ 
/*     */ 
/*     */         
/* 138 */         af1.dH = paramk.dH;
/* 139 */         af1.dI = paramk.dI;
/* 140 */         af1.dJ = paramk.dJ;
/*     */ 
/*     */         
/* 143 */         paramk.y(af1);
/*     */       } 
/*     */     } 
/*     */     
/* 147 */     if (this.d)
/*     */     {
/* 149 */       paramk.L();
/*     */     }
/*     */     
/* 152 */     if (this.e)
/*     */     {
/*     */       
/* 155 */       for (int j = paramk.x.size() - 1; j >= 0; j--) {
/*     */         
/* 157 */         if (this.f == -1 || this.f == j) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 163 */           boolean bool = (paramk.x.size() % 2 == 0) ? true : false;
/* 164 */           paramk.a((af)paramk.x.get(j), true, bool);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 170 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
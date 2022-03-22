/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.f;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.o;
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
/*     */ public class d
/*     */   extends a
/*     */ {
/*     */   boolean a;
/*     */   boolean b;
/*     */   o c;
/*     */   o d;
/*     */   boolean e;
/*  31 */   int f = Integer.MIN_VALUE;
/*  32 */   int g = Integer.MIN_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  38 */     boolean bool1 = paramab.a(paramString1, paramString2 + "finishPlayingLastAnimation", Boolean.valueOf(false)).booleanValue();
/*  39 */     boolean bool2 = paramab.a(paramString1, paramString2 + "stopLastAnimation", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/*  42 */     o o1 = paraml.a(paramab.b(paramString1, paramString2 + "playAnimation", null), null);
/*     */     
/*  44 */     o o2 = paraml.a(paramab.b(paramString1, paramString2 + "playAnimationIfNotPlaying", null), null);
/*     */     
/*  46 */     if (o1 != null && o2 != null)
/*     */     {
/*  48 */       throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
/*     */     }
/*     */     
/*  51 */     if (bool2 && bool1)
/*     */     {
/*  53 */       throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
/*     */     }
/*     */ 
/*     */     
/*  57 */     if (o1 != null || o2 != null || bool1 || bool2) {
/*     */       
/*  59 */       d d1 = new d();
/*  60 */       d1.a = bool1;
/*  61 */       d1.b = bool2;
/*  62 */       d1.c = o1;
/*  63 */       d1.d = o2;
/*  64 */       d1.e = paramab.a(paramString1, paramString2 + "playAnimation_lowPriority", Boolean.valueOf(false)).booleanValue();
/*  65 */       paramc.W.add(d1);
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
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/*  88 */     if (this.a)
/*     */     {
/*  90 */       paramk.b.b();
/*     */     }
/*     */     
/*  93 */     if (this.b)
/*     */     {
/*  95 */       paramk.b.a();
/*     */     }
/*     */     
/*  98 */     if (this.c != null) {
/*     */ 
/*     */       
/* 101 */       byte b = 15;
/* 102 */       if (this.e)
/*     */       {
/* 104 */         b = 4;
/*     */       }
/*     */       
/* 107 */       paramk.b.a(this.c.b(), b, true);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 112 */     if (this.d != null) {
/*     */ 
/*     */       
/* 115 */       byte b = 15;
/* 116 */       if (this.e)
/*     */       {
/* 118 */         b = 4;
/*     */       }
/*     */       
/* 121 */       f f = this.d.b();
/*     */       
/* 123 */       if (!paramk.b.a(f))
/*     */       {
/* 125 */         paramk.b.a(this.d.b(), b, true);
/*     */       }
/*     */     } 
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
/* 143 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
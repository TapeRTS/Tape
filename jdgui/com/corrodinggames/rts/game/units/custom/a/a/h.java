/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.s;
/*     */ import com.corrodinggames.rts.game.units.g.c;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ag;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   extends a
/*     */ {
/*     */   boolean a;
/*     */   boolean b;
/*     */   boolean c;
/*  28 */   int d = Integer.MIN_VALUE;
/*     */ 
/*     */   
/*     */   boolean e;
/*     */ 
/*     */   
/*     */   float f;
/*     */ 
/*     */   
/*     */   float g;
/*     */ 
/*     */   
/*     */   s h;
/*     */ 
/*     */   
/*  43 */   float i = -1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   ag j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  55 */     boolean bool1 = paramab.a(paramString1, paramString2 + "deleteSelf", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  57 */     if (bool1) {
/*     */       
/*  59 */       h h1 = new h();
/*  60 */       h1.a = bool1;
/*     */ 
/*     */       
/*  63 */       paramc.W.add(h1);
/*     */     } 
/*     */ 
/*     */     
/*  67 */     boolean bool2 = paramab.a(paramString1, paramString2 + "switchToNeutralTeam", Boolean.valueOf(false)).booleanValue();
/*  68 */     boolean bool3 = paramab.a(paramString1, paramString2 + "switchToAggressiveTeam", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  70 */     if (bool2 || bool3) {
/*     */       
/*  72 */       h h1 = new h();
/*  73 */       h1.b = bool2;
/*  74 */       h1.c = bool3;
/*  75 */       paramc.W.add(h1);
/*     */     } 
/*     */ 
/*     */     
/*  79 */     int i = paramab.b(paramString1, paramString2 + "setBodyRotation", Integer.valueOf(-2147483648)).intValue();
/*  80 */     if (i != Integer.MIN_VALUE) {
/*     */       
/*  82 */       h h1 = new h();
/*  83 */       h1.d = i;
/*  84 */       paramc.W.add(h1);
/*     */     } 
/*     */     
/*  87 */     float f1 = paramab.a(paramString1, paramString2 + "setBuilt", Float.valueOf(-1.0F)).floatValue();
/*  88 */     if (f1 > 1.0F)
/*     */     {
/*  90 */       throw new at("[" + paramString1 + "] setBuilt cannot be greater than 1");
/*     */     }
/*     */     
/*  93 */     boolean bool4 = paramab.a(paramString1, paramString2 + "clearAllActionCooldowns", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     float f2 = paramab.c(paramString1, paramString2 + "addAllActionCooldownsTime", Float.valueOf(0.0F)).floatValue();
/*  99 */     if (f2 == 0.0F)
/*     */     {
/* 101 */       f2 = paramab.c(paramString1, paramString2 + "addAllActionCooldownsFor", Float.valueOf(0.0F)).floatValue();
/*     */     }
/*     */ 
/*     */     
/* 105 */     float f3 = paramab.c(paramString1, paramString2 + "addActionCooldownTime", Float.valueOf(0.0F)).floatValue();
/* 106 */     if (f3 == 0.0F)
/*     */     {
/* 108 */       f3 = paramab.c(paramString1, paramString2 + "addActionCooldownFor", Float.valueOf(0.0F)).floatValue();
/*     */     }
/*     */     
/* 111 */     s s1 = paramab.a(paraml, paramString1, paramString2 + "addActionCooldownApplyToActions", null);
/*     */     
/* 113 */     ag ag1 = paramab.a(paramString1, paramString2 + "offsetSelfAbsolute", null);
/*     */     
/* 115 */     if (s1 != null && f3 <= 0.0F)
/*     */     {
/* 117 */       throw new at("[" + paramString1 + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     if (f3 > 0.0F || f2 > 0.0F || bool4 || f1 >= 0.0F || ag1 != null) {
/*     */ 
/*     */ 
/*     */       
/* 131 */       h h1 = new h();
/* 132 */       h1.e = bool4;
/*     */ 
/*     */       
/* 135 */       h1.f = f2;
/*     */       
/* 137 */       h1.g = f3;
/* 138 */       h1.h = s1;
/*     */       
/* 140 */       h1.i = f1;
/*     */ 
/*     */       
/* 143 */       h1.j = ag1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 149 */       paramc.W.add(h1);
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
/*     */   public boolean a(k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 161 */     if (this.a) {
/*     */       
/* 163 */       paramk.bU();
/*     */       
/* 165 */       if (paramk.bw()) {
/*     */         
/* 167 */         l l = l.u();
/* 168 */         l.bC.a((r)paramk);
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
/* 180 */     if (this.b)
/*     */     {
/* 182 */       paramk.c(m.g);
/*     */     }
/*     */     
/* 185 */     if (this.c)
/*     */     {
/* 187 */       paramk.c(m.f);
/*     */     }
/*     */     
/* 190 */     if (this.d != Integer.MIN_VALUE)
/*     */     {
/*     */       
/* 193 */       paramk.h(this.d);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 198 */     if (this.e)
/*     */     {
/* 200 */       c.c((af)paramk, s.h);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     if (this.f > 0.0F)
/*     */     {
/* 210 */       c.a((r)paramk, s.h, (int)this.f);
/*     */     }
/*     */     
/* 213 */     if (this.g > 0.0F)
/*     */     {
/* 215 */       if (this.h == null) {
/*     */         
/* 217 */         c.a((r)paramk, params.J(), (int)this.g);
/*     */       }
/*     */       else {
/*     */         
/* 221 */         for (s s1 : this.h.a())
/*     */         {
/* 223 */           c.a((r)paramk, s1.J(), (int)this.g);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 228 */     if (this.i >= 0.0F)
/*     */     {
/*     */       
/* 231 */       paramk.q(this.i);
/*     */     }
/*     */     
/* 234 */     if (this.j != null) {
/*     */       
/* 236 */       paramk.b(paramk.dH + this.j.a, paramk.dI + this.j.b);
/*     */       
/* 238 */       paramk.dJ += this.j.c;
/*     */       
/* 240 */       paramk.cm = true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
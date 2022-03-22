/*     */ package com.corrodinggames.rts.game.units.custom.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.ac;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   public String a;
/*     */   public a b;
/*     */   public float c;
/*     */   public Integer d;
/*     */   public boolean e;
/*     */   ag f;
/*     */   ag g;
/*     */   public boolean h;
/*     */   public boolean i;
/*     */   public boolean j;
/*     */   public boolean k;
/*     */   public int l;
/*     */   public String m;
/*     */   public a n;
/*     */   
/*     */   public strictfp b(boolean paramBoolean) {
/*  48 */     this.e = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml, ab paramab, String paramString1, String paramString2) {
/*  56 */     this.a = paramString2;
/*     */ 
/*     */     
/*  59 */     this.f = ac.a(paramab, paramString1, "displayName", null);
/*     */ 
/*     */     
/*  62 */     this.g = ac.a(paramab, paramString1, "displayNameShort", null);
/*     */     
/*  64 */     if (this.g == null)
/*     */     {
/*  66 */       this.g = this.f;
/*     */     }
/*     */     
/*  69 */     this.h = paramab.a(paramString1, "hidden", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     this.c = paramab.a(paramString1, "priority", Float.valueOf(0.0F)).floatValue();
/*     */     
/*  76 */     this.d = paramab.a(paramString1, "displayColor", null);
/*     */ 
/*     */     
/*  79 */     this.i = paramab.a(paramString1, "displayWithRounding", Boolean.valueOf(true)).booleanValue();
/*     */     
/*  81 */     this.j = paramab.a(paramString1, "displayRoundedDown", Boolean.valueOf(false)).booleanValue();
/*  82 */     this.k = paramab.a(paramString1, "displayWhenZero", Boolean.valueOf(false)).booleanValue();
/*  83 */     this.l = paramab.b(paramString1, "displayPos", Integer.valueOf(0)).intValue();
/*     */ 
/*     */     
/*  86 */     String str = this.e ? "g_" : "l_";
/*  87 */     str = str + this.a;
/*  88 */     this.b = a.a(str, false, this.e);
/*     */     
/*  90 */     if (this.b.h)
/*     */     {
/*     */       
/*  93 */       throw new RuntimeException("Cannot define resource with a built-in name: " + str);
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
/* 106 */     if (!this.e) {
/*     */       
/* 108 */       String str1 = paramab.b(paramString1, "equivalentGlobalResourceForAI", null);
/* 109 */       this.m = str1;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml) {
/* 116 */     if (this.m != null) {
/*     */       
/* 118 */       this.n = paraml.i(this.m);
/*     */       
/* 120 */       if (this.n == null)
/*     */       {
/* 122 */         throw new at("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.m);
/*     */       }
/*     */       
/* 125 */       if (!this.n.g)
/*     */       {
/* 127 */         throw new at("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.m);
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\d\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.p;
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
/*     */ public final class al
/*     */ {
/*     */   String a;
/*     */   h b;
/*     */   i c;
/*     */   p d;
/*     */   float e;
/*     */   float f;
/*     */   float g;
/*     */   float h;
/*     */   boolean i;
/*     */   boolean j;
/*     */   int k;
/*     */   int l;
/*     */   boolean m;
/*     */   boolean n;
/*     */   ag o;
/*     */   boolean p;
/*     */   
/*     */   public boolean a() {
/*  78 */     return (this.n || this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(l paraml, ab paramab, String paramString) {
/*  83 */     this.b = paramab.a(paramString, "anyRuleInGroup", null);
/*     */     
/*  85 */     this.c = paramab.a(paraml, paramString, "searchTags", null);
/*     */     
/*  87 */     this.d = (p)paramab.a(paramString, "searchTeam", (Enum)p.a, p.class);
/*     */     
/*  89 */     this.e = paramab.h(paramString, "searchDistance");
/*  90 */     this.f = this.e * this.e;
/*     */ 
/*     */     
/*  93 */     this.g = paramab.a(paramString, "searchOffsetX", Float.valueOf(0.0F)).floatValue();
/*  94 */     this.h = paramab.a(paramString, "searchOffsetY", Float.valueOf(0.0F)).floatValue();
/*     */     
/*  96 */     this.i = paramab.a(paramString, "excludeIncompleteBuildings", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  98 */     this.j = paramab.a(paramString, "excludeNonBuildings", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 100 */     this.k = paramab.b(paramString, "minCount", Integer.valueOf(-2147483648)).intValue();
/* 101 */     this.l = paramab.b(paramString, "maxCount", Integer.valueOf(2147483647)).intValue();
/*     */     
/* 103 */     this.p = paramab.a(paramString, "checkEachTile", Boolean.valueOf(true)).booleanValue();
/*     */     
/* 105 */     this.m = paramab.a(paramString, "aiSuggestionOnly", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 107 */     this.n = paramab.a(paramString, "blocksPlacement", Boolean.valueOf(!this.m)).booleanValue();
/*     */     
/* 109 */     if (this.m)
/*     */     {
/* 111 */       if (this.n)
/*     */       {
/* 113 */         throw new at("[" + paramString + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
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
/* 126 */     this.o = ac.a(paramab, paramString, "cannotPlaceMessage", (String)null);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
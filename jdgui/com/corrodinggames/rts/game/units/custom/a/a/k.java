/*     */ package com.corrodinggames.rts.game.units.custom.a.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.p;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.a.a;
/*     */ import com.corrodinggames.rts.game.units.custom.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.custom.s;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
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
/*     */ public class k
/*     */   extends a
/*     */ {
/*     */   public g a;
/*     */   public boolean b;
/*     */   public boolean c;
/*  43 */   public float d = -1.0F;
/*     */   
/*     */   public p e;
/*     */   
/*     */   public i f;
/*     */   
/*     */   public boolean g = true;
/*     */   
/*     */   public g h;
/*  52 */   public int i = 1;
/*     */ 
/*     */   
/*     */   public s j;
/*     */ 
/*     */   
/*     */   public s k;
/*     */ 
/*     */   
/*     */   public boolean l;
/*     */   
/*     */   public boolean m;
/*     */   
/*     */   public boolean n = false;
/*     */ 
/*     */   
/*     */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, c paramc, String paramString3, boolean paramBoolean) {
/*  69 */     boolean bool1 = paramab.a(paramString1, paramString2 + "takeResources_includeUnitsInTransport", Boolean.valueOf(false)).booleanValue();
/*     */     
/*  71 */     boolean bool2 = paramab.a(paramString1, paramString2 + "takeResources_includeParent", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/*  74 */     float f = paramab.a(paramString1, paramString2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0F)).floatValue();
/*     */     
/*  76 */     g g1 = g.a(paraml, paramab, paramString1, paramString2 + "takeResources", true);
/*     */ 
/*     */     
/*  79 */     if (!bool1 && !bool2 && f < 0.0F) {
/*     */       
/*  81 */       if (g1 != null && !g1.b())
/*     */       {
/*  83 */         throw new at("[" + paramString1 + "]takeResources requires an include (eg: takeResources_includeUnitsInTransport, takeResources_includeUnitsWithinRange)");
/*     */       }
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  90 */     k k1 = new k();
/*  91 */     paramc.W.add(k1);
/*     */ 
/*     */     
/*  94 */     k1.b = bool1;
/*  95 */     k1.d = f;
/*  96 */     k1.c = bool2;
/*     */ 
/*     */     
/*  99 */     k1.a = g1;
/*     */ 
/*     */     
/* 102 */     k1.n = paramab.a(paramString1, paramString2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(k1.n)).booleanValue();
/*     */ 
/*     */     
/* 105 */     k1.e = (p)paramab.a(paramString1, "takeResources_includeUnitsWithinRange_team", (Enum)p.a, p.class);
/*     */     
/* 107 */     k1.f = paramab.a(paraml, paramString1, paramString2 + "takeResources_excludeUnitsWithoutTags", null);
/*     */ 
/*     */ 
/*     */     
/* 111 */     if (k1.n)
/*     */     {
/* 113 */       k1.g = false;
/*     */     }
/*     */     
/* 116 */     k1.g = paramab.a(paramString1, paramString2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(k1.g)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     k1.i = paramab.b(paramString1, paramString2 + "takeResources_maxUnits", Integer.valueOf(k1.i)).intValue();
/*     */     
/* 127 */     k1.j = paramab.a(paraml, paramString1, paramString2 + "takeResources_triggerActionIfAnyCollected", null);
/*     */     
/* 129 */     k1.k = paramab.a(paraml, paramString1, paramString2 + "takeResources_triggerActionIfNoneCollected", null);
/*     */     
/* 131 */     k1.l = paramab.a(paramString1, paramString2 + "takeResources_discardCollected", Boolean.valueOf(k1.l)).booleanValue();
/* 132 */     k1.m = paramab.a(paramString1, paramString2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(k1.m)).booleanValue();
/*     */     
/* 134 */     k1.h = g.a(paraml, paramab, paramString1, paramString2 + "takeResources_excludeUnitsWithTheseResources", true);
/* 135 */     if (k1.h != null && k1.h.b())
/*     */     {
/* 137 */       k1.h = null;
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
/* 154 */     if (k1.n) {
/*     */ 
/*     */       
/* 157 */       if (k1.a.d())
/*     */       {
/* 159 */         throw new at("[" + paramString1 + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 164 */       if (k1.g)
/*     */       {
/* 166 */         throw new at("[" + paramString1 + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
/*     */       }
/*     */       
/* 169 */       if (k1.m)
/*     */       {
/* 171 */         throw new at("[" + paramString1 + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
/*     */       }
/*     */       
/* 174 */       if (k1.l)
/*     */       {
/* 176 */         throw new at("[" + paramString1 + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
/*     */       }
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
/* 191 */   public static final m o = new m();
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(com.corrodinggames.rts.game.units.custom.k paramk, s params, PointF paramPointF, af paramaf, int paramInt) {
/* 196 */     o.clear();
/*     */ 
/*     */ 
/*     */     
/* 200 */     if (this.b)
/*     */     {
/* 202 */       for (af af1 : paramk.x) {
/*     */         
/* 204 */         if (af1 != null && !af1.bz)
/*     */         {
/* 206 */           o.add(af1);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 211 */     if (this.c)
/*     */     {
/* 213 */       if (paramk.cq != null) {
/*     */         
/* 215 */         o.add(paramk.cq);
/*     */       }
/* 217 */       else if (paramk.cp != null) {
/*     */         
/* 219 */         o.add(paramk.cq);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 224 */     if (this.d > 0.0F) {
/*     */       
/* 226 */       p.b = this.d * this.d;
/* 227 */       p.a = this.f;
/* 228 */       p.c = true;
/*     */ 
/*     */ 
/*     */       
/* 232 */       p.d = this.e;
/*     */       
/* 234 */       p.e = o;
/*     */       
/* 236 */       l l1 = l.u();
/* 237 */       l1.bK.a(paramk.dH, paramk.dI, this.d, (r)paramk, 0.0F, p);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     if (this.f != null)
/*     */     {
/* 245 */       for (int j = o.size() - 1; j >= 0; j--) {
/*     */         
/* 247 */         af af1 = (af)o.get(j);
/* 248 */         if (!h.a(this.f, af1.cM()))
/*     */         {
/* 250 */           o.remove(j);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 255 */     if (this.g)
/*     */     {
/* 257 */       for (int j = o.size() - 1; j >= 0; j--) {
/*     */         
/* 259 */         af af1 = (af)o.get(j);
/* 260 */         if (!this.a.b(af1, false))
/*     */         {
/* 262 */           o.remove(j);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 268 */     if (this.h != null)
/*     */     {
/* 270 */       for (int j = o.size() - 1; j >= 0; j--) {
/*     */         
/* 272 */         af af1 = (af)o.get(j);
/* 273 */         if (this.h.b(af1, false))
/*     */         {
/* 275 */           o.remove(j);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 280 */     boolean bool1 = false;
/* 281 */     boolean bool2 = false;
/*     */     
/* 283 */     byte b1 = 0;
/* 284 */     for (byte b2 = 0; b2 < o.size(); b2++) {
/*     */       
/* 286 */       af af1 = (af)o.get(b2);
/*     */ 
/*     */       
/* 289 */       if (this.n) {
/*     */         
/* 291 */         boolean bool = this.a.a(af1, (af)paramk);
/*     */         
/* 293 */         if (!bool)
/*     */         {
/*     */           continue;
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 300 */         if (!this.m)
/*     */         {
/* 302 */           this.a.c(af1, false);
/*     */         }
/*     */         
/* 305 */         if (!this.l)
/*     */         {
/* 307 */           this.a.f((af)paramk);
/*     */         }
/*     */       } 
/*     */       
/* 311 */       bool1 = true;
/*     */       
/* 313 */       b1++;
/*     */       
/* 315 */       if (b1 >= this.i) {
/*     */         
/* 317 */         bool2 = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */       continue;
/*     */     } 
/* 323 */     if (bool1) {
/*     */       
/* 325 */       if (this.j != null)
/*     */       {
/* 327 */         this.j.a(paramk, paramPointF, paramaf, paramInt + 1);
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 335 */     else if (this.k != null) {
/*     */       
/* 337 */       this.k.a(paramk, paramPointF, paramaf, paramInt + 1);
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
/* 349 */     o.clear();
/* 350 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 357 */   public static final l p = new l();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\a\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
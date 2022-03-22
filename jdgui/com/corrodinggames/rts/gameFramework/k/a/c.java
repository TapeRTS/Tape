/*     */ package com.corrodinggames.rts.gameFramework.k.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.b.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.k.a;
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
/*     */ public class c
/*     */   extends a
/*     */ {
/*     */   Integer a;
/*     */   Integer b;
/*     */   m c;
/*     */   al d;
/*     */   boolean e;
/*     */   boolean f;
/*     */   boolean g;
/*     */   boolean h;
/*     */   boolean i;
/*     */   boolean j;
/*     */   int k;
/*     */   boolean l;
/*     */   boolean m;
/*     */   h n;
/*     */   boolean o;
/*     */   
/*     */   public static c b(a parama) {
/*  45 */     c c1 = new c();
/*     */     
/*  47 */     c1.a = parama.d("maxUnits");
/*     */     
/*  49 */     boolean bool = true;
/*  50 */     if (c1.a != null)
/*     */     {
/*  52 */       bool = false;
/*     */     }
/*  54 */     c1.b = Integer.valueOf(parama.a("minUnits", bool));
/*     */     
/*  56 */     c1.c = parama.a();
/*     */ 
/*     */     
/*  59 */     al al1 = null;
/*  60 */     String str1 = parama.b("unitType");
/*  61 */     if (str1 != null) {
/*     */       
/*  63 */       al1 = ak.a(str1);
/*  64 */       if (al1 == null)
/*     */       {
/*  66 */         parama.g("Cound not find unitType:" + str1);
/*     */       }
/*     */     } 
/*  69 */     c1.d = al1;
/*     */     
/*  71 */     c1.e = parama.a("onlybuildings", "onlyBuildings", false);
/*     */     
/*  73 */     c1.g = parama.a("onlyMainBuildings", false);
/*     */     
/*  75 */     c1.h = parama.a("onlyOnResourcePool", false);
/*     */     
/*  77 */     c1.f = parama.a("onlyidle", "onlyIdle", false);
/*     */     
/*  79 */     c1.k = parama.a("onlyTechLevel", -1);
/*     */     
/*  81 */     c1.j = parama.a("onlyBuilders", false);
/*     */     
/*  83 */     c1.i = parama.a("onlyEmptyQueue", false);
/*     */     
/*  85 */     c1.l = parama.a("onlyAttack", false);
/*     */     
/*  87 */     c1.m = parama.a("onlyAttackAir", false);
/*     */     
/*  89 */     String str2 = parama.b("onlyWithTag");
/*  90 */     if (str2 != null && !str2.equals("")) {
/*     */       
/*     */       try {
/*     */         
/*  94 */         c1.n = h.b(str2);
/*     */       }
/*  96 */       catch (at at) {
/*     */         
/*  98 */         throw new f(at.getMessage());
/*     */       } 
/*     */     }
/*     */     
/* 102 */     c1.o = parama.a("includeIncomplete", false);
/*     */ 
/*     */     
/* 105 */     return c1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(a parama) {
/* 112 */     return c(parama);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(a parama) {
/* 118 */     byte b1 = 0;
/*     */     
/* 120 */     af[] arrayOfAf = af.bj.a(); byte b2; int i;
/* 121 */     for (b2 = 0, i = af.bj.size(); b2 < i; b2++) {
/*     */       
/* 123 */       af af = arrayOfAf[b2];
/* 124 */       if ((this.c == null || af.bB == this.c) && af instanceof r && af.cp == null)
/*     */       {
/* 126 */         if (parama.a(af))
/*     */         {
/* 128 */           if (this.d == null || af.r() == this.d) {
/*     */             
/* 130 */             r r = (r)af;
/*     */             
/* 132 */             if (!this.o)
/*     */             {
/* 134 */               if (!af.bG()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */ 
/*     */             
/* 141 */             if (this.l)
/*     */             {
/* 143 */               if (!af.l()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 149 */             if (this.m)
/*     */             {
/* 151 */               if (!af.l() || !r.ad()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 157 */             if (this.e)
/*     */             {
/* 159 */               if (!af.bw()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 165 */             if (this.g)
/*     */             {
/* 167 */               if (!af.bw() || !af.bx()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */             
/* 172 */             if (this.h)
/*     */             {
/* 174 */               if (!af.r().p()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 180 */             if (this.j)
/*     */             {
/* 182 */               if (!af.ai()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 188 */             if (this.f)
/*     */             {
/* 190 */               if (!r.ao()) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 196 */             if (this.i)
/*     */             {
/* 198 */               if (r.cW() > 0) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */ 
/*     */             
/* 205 */             if (this.k != -1)
/*     */             {
/* 207 */               if (af.T() != this.k) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 213 */             if (this.n != null)
/*     */             {
/* 215 */               if (!h.a(this.n, af.cM())) {
/*     */                 continue;
/*     */               }
/*     */             }
/*     */ 
/*     */             
/* 221 */             b1++;
/*     */           } 
/*     */         }
/*     */       }
/*     */       
/*     */       continue;
/*     */     } 
/* 228 */     if (b1 >= this.b.intValue())
/*     */     {
/* 230 */       if (this.a == null || b1 <= this.a.intValue())
/*     */       {
/* 232 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 236 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\a\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
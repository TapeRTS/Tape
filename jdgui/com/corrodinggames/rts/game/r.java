/*     */ package com.corrodinggames.rts.game;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.d.d;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.i;
/*     */ import com.corrodinggames.rts.game.units.d.i;
/*     */ import com.corrodinggames.rts.game.units.d.k;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class r
/*     */ {
/*  16 */   public int a = 5;
/*     */ 
/*     */   
/*     */   public int b;
/*     */ 
/*     */   
/*     */   public int c;
/*     */ 
/*     */   
/*     */   public int d;
/*     */ 
/*     */   
/*     */   public int e;
/*     */ 
/*     */   
/*     */   public int f;
/*     */   
/*  33 */   public d g = new d();
/*     */ 
/*     */   
/*     */   public boolean h;
/*     */   
/*  38 */   public m i = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf) {
/*  44 */     if (paramaf.bR < 1.0F) {
/*     */       
/*  46 */       this.e++;
/*     */     }
/*     */     else {
/*     */       
/*  50 */       this.c++;
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
/*  62 */     al al = paramaf.r();
/*     */ 
/*     */     
/*  65 */     if (!al.k())
/*     */     {
/*  67 */       this.b++;
/*     */     }
/*     */ 
/*     */     
/*  71 */     if (!this.h && !paramaf.o_())
/*     */     {
/*  73 */       if (paramaf.r().y())
/*     */       {
/*  75 */         this.h = true;
/*     */       }
/*     */     }
/*     */     
/*  79 */     if (paramaf instanceof k) {
/*     */       
/*  81 */       k k = (k)paramaf;
/*     */       
/*  83 */       int i = k.h(false);
/*     */       
/*  85 */       this.b += i;
/*     */       
/*  87 */       this.d += i;
/*     */       
/*  89 */       if (i != 0)
/*     */       {
/*  91 */         a(k);
/*     */       }
/*     */     } 
/*     */     
/*  95 */     c(paramaf);
/*     */     
/*  97 */     float f = paramaf.ci();
/*  98 */     if (f != 0.0F)
/*     */     {
/* 100 */       if (paramaf.bR >= 1.0F)
/*     */       {
/* 102 */         this.f = (int)(this.f + f);
/*     */       }
/*     */     }
/*     */     
/* 106 */     d d1 = paramaf.ck();
/* 107 */     if (!d1.b())
/*     */     {
/* 109 */       if (paramaf.bR >= 1.0F)
/*     */       {
/* 111 */         this.g.a(d1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(af paramaf) {
/* 122 */     if (paramaf.bR < 1.0F) {
/*     */       
/* 124 */       this.e--;
/*     */     }
/*     */     else {
/*     */       
/* 128 */       this.c--;
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
/* 140 */     al al = paramaf.r();
/*     */ 
/*     */     
/* 143 */     if (!al.k())
/*     */     {
/* 145 */       this.b--;
/*     */     }
/*     */     
/* 148 */     if (paramaf instanceof k) {
/*     */       
/* 150 */       k k = (k)paramaf;
/*     */       
/* 152 */       int i = k.h(false);
/*     */       
/* 154 */       this.b -= i;
/*     */ 
/*     */       
/* 157 */       this.d -= i;
/*     */ 
/*     */       
/* 160 */       if (i != 0)
/*     */       {
/* 162 */         b(k);
/*     */       }
/*     */     } 
/*     */     
/* 166 */     d(paramaf);
/*     */     
/* 168 */     float f = paramaf.ci();
/* 169 */     if (f != 0.0F)
/*     */     {
/* 171 */       if (paramaf.bR >= 1.0F)
/*     */       {
/* 173 */         this.f = (int)(this.f - f);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 178 */     d d1 = paramaf.ck();
/* 179 */     if (!d1.b())
/*     */     {
/* 181 */       if (paramaf.bR >= 1.0F)
/*     */       {
/* 183 */         this.g.b(d1);
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
/*     */   private final void c(af paramaf) {
/* 209 */     i i = paramaf.cM();
/* 210 */     if (i != null)
/*     */     {
/* 212 */       for (h h : i.a) {
/*     */         
/* 214 */         o o = a(h);
/* 215 */         if (paramaf.bR < 1.0F) {
/*     */           
/* 217 */           o.c++;
/*     */         }
/*     */         else {
/*     */           
/* 221 */           o.b++;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void d(af paramaf) {
/* 230 */     i i = paramaf.cM();
/* 231 */     if (i != null)
/*     */     {
/* 233 */       for (h h : i.a) {
/*     */         
/* 235 */         o o = a(h);
/* 236 */         if (paramaf.bR < 1.0F) {
/*     */           
/* 238 */           o.c--;
/*     */         }
/*     */         else {
/*     */           
/* 242 */           o.b--;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private final void a(k paramk) {
/* 250 */     m m1 = paramk.dd();
/*     */     
/* 252 */     if (m1.a != 0)
/*     */     {
/* 254 */       for (i i : m1) {
/*     */         
/* 256 */         if (i.d) {
/*     */ 
/*     */           
/* 259 */           al al = i.e;
/* 260 */           if (al != null) {
/*     */             
/* 262 */             i i1 = al.x();
/* 263 */             if (i1 != null)
/*     */             {
/* 265 */               for (h h : i1.a) {
/*     */                 
/* 267 */                 o o = a(h);
/* 268 */                 o.d += i.a;
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void b(k paramk) {
/* 281 */     m m1 = paramk.dd();
/*     */     
/* 283 */     if (m1.a != 0)
/*     */     {
/* 285 */       for (i i : m1) {
/*     */         
/* 287 */         if (i.d) {
/*     */ 
/*     */           
/* 290 */           al al = i.e;
/* 291 */           if (al != null) {
/*     */             
/* 293 */             i i1 = al.x();
/* 294 */             if (i1 != null)
/*     */             {
/* 296 */               for (h h : i1.a) {
/*     */                 
/* 298 */                 o o = a(h);
/* 299 */                 o.d -= i.a;
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final o a(h paramh) {
/* 314 */     Object[] arrayOfObject = this.i.a(); byte b; int i;
/* 315 */     for (b = 0, i = this.i.a; b < i; b++) {
/*     */       
/* 317 */       o o1 = (o)arrayOfObject[b];
/*     */       
/* 319 */       if (o1.a == paramh)
/*     */       {
/* 321 */         return o1;
/*     */       }
/* 323 */       if (o1.a == null) {
/*     */         
/* 325 */         o1.a = paramh;
/* 326 */         return o1;
/*     */       } 
/*     */     } 
/*     */     
/* 330 */     o o = new o();
/* 331 */     o.a = paramh;
/* 332 */     this.i.add(o);
/* 333 */     return o;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
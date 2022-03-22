/*     */ package com.corrodinggames.rts.game.units.g;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */ public class c
/*     */   extends a
/*     */ {
/*     */   int b;
/*     */   
/*     */   public c() {}
/*     */   
/*     */   public c(int paramInt, com.corrodinggames.rts.game.units.a.c paramc) {
/*  27 */     super(paramInt);
/*  28 */     this.c = paramc;
/*     */     
/*  30 */     l l = l.u();
/*  31 */     int i = l.bh;
/*     */     
/*  33 */     this.b = i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   com.corrodinggames.rts.game.units.a.c c = com.corrodinggames.rts.game.units.a.c.a;
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
/*     */   public boolean a(com.corrodinggames.rts.game.units.a.c paramc) {
/*  56 */     if (this.c == com.corrodinggames.rts.game.units.a.c.a)
/*     */     {
/*  58 */       return true;
/*     */     }
/*  60 */     return (this.c == paramc);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float b() {
/*  66 */     int i = this.a - this.b;
/*  67 */     if (i <= 0)
/*     */     {
/*  69 */       return 1.0F;
/*     */     }
/*     */     
/*  72 */     l l = l.u();
/*  73 */     int j = l.bh;
/*     */     
/*  75 */     int k = this.a - j;
/*     */     
/*  77 */     return k / i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(r paramr, com.corrodinggames.rts.game.units.a.c paramc, int paramInt) {
/*  83 */     l l = l.u();
/*     */     
/*  85 */     int i = l.bh + paramInt;
/*     */ 
/*     */     
/*  88 */     c c1 = new c(i, paramc);
/*  89 */     b.a(paramr, c1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(af paramaf, com.corrodinggames.rts.game.units.a.c paramc) {
/*  98 */     if (!(paramaf instanceof r))
/*     */     {
/* 100 */       return 0;
/*     */     }
/* 102 */     r r = (r)paramaf;
/*     */     
/* 104 */     m m = r.bb;
/* 105 */     if (m == null)
/*     */     {
/* 107 */       return 0;
/*     */     }
/*     */     
/* 110 */     c c1 = b(paramaf, paramc);
/* 111 */     if (c1 == null)
/*     */     {
/* 113 */       return 0;
/*     */     }
/*     */     
/* 116 */     return c1.c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 123 */     l l = l.u();
/* 124 */     int i = l.bh;
/* 125 */     return this.a - i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static c b(af paramaf, com.corrodinggames.rts.game.units.a.c paramc) {
/* 131 */     if (!(paramaf instanceof r))
/*     */     {
/* 133 */       return null;
/*     */     }
/* 135 */     r r = (r)paramaf;
/*     */     
/* 137 */     m m = r.bb;
/* 138 */     if (m == null)
/*     */     {
/* 140 */       return null;
/*     */     }
/*     */     
/* 143 */     l l = l.u();
/*     */     
/* 145 */     int i = l.bh;
/* 146 */     c c1 = null;
/*     */     
/* 148 */     Object[] arrayOfObject = m.a();
/* 149 */     for (int j = m.a - 1; j >= 0; j--) {
/*     */       
/* 151 */       a a1 = (a)arrayOfObject[j];
/*     */       
/* 153 */       if (a1 instanceof c) {
/*     */         
/* 155 */         c c2 = (c)a1;
/*     */         
/* 157 */         if (c2.a(paramc))
/*     */         {
/* 159 */           if (c2.a > i) {
/*     */             
/* 161 */             i = c2.a;
/* 162 */             c1 = c2;
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 168 */     if (c1 == null)
/*     */     {
/* 170 */       return null;
/*     */     }
/*     */     
/* 173 */     return c1;
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
/*     */ 
/*     */   
/*     */   public static void c(af paramaf, com.corrodinggames.rts.game.units.a.c paramc) {
/* 205 */     if (!(paramaf instanceof r)) {
/*     */       return;
/*     */     }
/*     */     
/* 209 */     r r = (r)paramaf;
/*     */     
/* 211 */     m m = r.bb;
/* 212 */     if (m == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 217 */     l l = l.u();
/* 218 */     int i = l.bh;
/*     */     
/* 220 */     Object[] arrayOfObject = m.a();
/* 221 */     for (int j = m.a - 1; j >= 0; j--) {
/*     */       
/* 223 */       a a1 = (a)arrayOfObject[j];
/*     */       
/* 225 */       if (a1 instanceof c) {
/*     */         
/* 227 */         c c1 = (c)a1;
/*     */         
/* 229 */         if (paramc == com.corrodinggames.rts.game.units.a.c.a || c1.a(paramc))
/*     */         {
/* 231 */           c1.a = i - 1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\g\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
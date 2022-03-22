/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ public final class c
/*     */ {
/*     */   d a;
/*     */   int b;
/*     */   String c;
/*     */   float d;
/*     */   public a[] e;
/*  40 */   private m f = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b a() {
/*  46 */     b b = null;
/*  47 */     if (this.f.size() > 0) {
/*     */       
/*  49 */       b = (b)this.f.get(this.f.size() - 1);
/*  50 */       if (b.h)
/*     */       {
/*  52 */         b = null;
/*     */       }
/*     */     } 
/*  55 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*     */     byte b;
/*  62 */     if (paramBoolean) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  67 */     if (paramFloat2 <= paramFloat1) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  72 */     a[] arrayOfA = this.e;
/*  73 */     int i = arrayOfA.length;
/*     */ 
/*     */ 
/*     */     
/*  77 */     if (paramFloat1 <= (arrayOfA[0]).a) {
/*     */       
/*  79 */       b = -1;
/*     */     }
/*     */     else {
/*     */       
/*  83 */       b = 0;
/*     */       
/*  85 */       while (paramFloat1 > (arrayOfA[b]).a) {
/*     */         
/*  87 */         b++;
/*  88 */         if (b >= i) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  95 */     int j = b;
/*  96 */     if (j < 0)
/*     */     {
/*  98 */       j = 0;
/*     */     }
/*     */     
/* 101 */     while (paramFloat2 > (arrayOfA[j]).a) {
/*     */       
/* 103 */       j++;
/* 104 */       if (j >= i) {
/*     */         
/* 106 */         j = i - 1;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     if (j <= b) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 117 */     for (int n = b + 1; n <= j; n++)
/*     */     {
/* 119 */       ((b)arrayOfA[n]).a(paramk);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 126 */     if (this.a == d.i) {
/*     */       
/* 128 */       b b = a();
/* 129 */       if (b != null)
/*     */       {
/* 131 */         b.finalize();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(l paraml, float paramFloat, String paramString1, String paramString2) {
/*     */     float f;
/* 138 */     if (this.a == d.i) {
/*     */       
/* 140 */       b b = a();
/*     */       
/* 142 */       if (b == null) {
/*     */         
/* 144 */         b = new b(paramFloat, 0.0F);
/* 145 */         this.f.add(b);
/*     */       } 
/* 147 */       b.a(paraml, paramString1, paramString2);
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 155 */       f = Float.parseFloat(paramString2);
/*     */     }
/* 157 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 159 */       throw new at("Failed to parse float:" + paramString2);
/*     */     } 
/* 161 */     a(paramFloat, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 166 */     if (this.a == d.i)
/*     */     {
/* 168 */       throw new at("Adding key frame value to event set");
/*     */     }
/*     */     
/* 171 */     if (this.f.size() == 0 && paramFloat1 > 0.0F && paramFloat2 != 0.0F) {
/*     */       
/* 173 */       a a2 = new a(0.0F, 0.0F);
/* 174 */       this.f.add(a2);
/*     */     } 
/*     */     
/* 177 */     a a1 = new a(paramFloat1, paramFloat2);
/* 178 */     this.f.add(a1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 184 */     for (a a1 : this.f)
/*     */     {
/* 186 */       a1.a *= paramFloat;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/* 196 */     Collections.sort((List<Comparable>)this.f);
/*     */     
/* 198 */     a a1 = null;
/* 199 */     for (a a2 : this.f) {
/*     */       
/* 201 */       if (a1 != null) {
/*     */         
/* 203 */         a2.c = 1.0F / (a2.a - a1.a);
/* 204 */         a2.d = a2.b - a1.b;
/*     */       } 
/* 206 */       a1 = a2;
/*     */ 
/*     */       
/* 209 */       this.d = a2.a;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 214 */     this.e = (a[])this.f.toArray((Object[])new a[0]);
/* 215 */     this.f = null;
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
/*     */   public float b(float paramFloat) {
/* 231 */     a[] arrayOfA = this.e;
/* 232 */     int i = arrayOfA.length;
/*     */     
/* 234 */     if (i == 1 || paramFloat <= (arrayOfA[0]).a)
/*     */     {
/* 236 */       return (arrayOfA[0]).b;
/*     */     }
/*     */     
/* 239 */     if (paramFloat >= this.d)
/*     */     {
/* 241 */       return (arrayOfA[i - 1]).b;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 246 */     byte b = 1;
/* 247 */     while (paramFloat > (arrayOfA[b]).a) {
/*     */       
/* 249 */       b++;
/* 250 */       if (b >= i)
/*     */       {
/*     */         
/* 253 */         return (arrayOfA[i - 1]).b;
/*     */       }
/*     */     } 
/*     */     
/* 257 */     a a1 = arrayOfA[b - 1];
/* 258 */     a a2 = arrayOfA[b];
/*     */     
/* 260 */     float f = (paramFloat - a1.a) * a2.c;
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
/* 275 */     return a1.b + a2.d * f;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
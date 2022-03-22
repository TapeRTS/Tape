/*     */ package com.corrodinggames.rts.game.units.custom.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a.b;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a.c;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a.d;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a.e;
/*     */ import com.corrodinggames.rts.game.units.custom.d.a.f;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
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
/*     */ public class a
/*     */ {
/*     */   protected String a;
/*     */   protected ag b;
/*     */   protected ag c;
/*     */   Integer d;
/*     */   public boolean e;
/*     */   boolean f;
/*     */   protected boolean g;
/*     */   protected boolean h;
/*     */   a i;
/*     */   
/*     */   public strictfp boolean a() {
/*  44 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp boolean b() {
/*  49 */     return this.h;
/*     */   }
/*     */   
/*     */   public strictfp boolean c() {
/*  53 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void d() {
/*  58 */     for (a a1 : j)
/*     */     {
/*  60 */       a1.e();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/*  66 */     if (this.h) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  72 */     b b = null;
/*     */     
/*  74 */     for (l l : l.d) {
/*     */       
/*  76 */       b b1 = l.a(this);
/*     */       
/*  78 */       if (b1 != null)
/*     */       {
/*     */         
/*  81 */         if (b == null || b.c < b1.c)
/*     */         {
/*  83 */           b = b1;
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  90 */     if (b != null) {
/*     */       
/*  92 */       this.b = b.f;
/*  93 */       this.c = b.g;
/*     */       
/*  95 */       this.d = b.d;
/*     */       
/*  97 */       this.e = b.j;
/*     */ 
/*     */       
/* 100 */       this.f = b.h;
/*     */       
/* 102 */       this.i = b.n;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp Integer f() {
/* 112 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String g() {
/* 117 */     if (this.b == null)
/*     */     {
/* 119 */       return this.a;
/*     */     }
/* 121 */     return this.b.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String h() {
/* 126 */     if (this.c != null)
/*     */     {
/* 128 */       return this.c.b();
/*     */     }
/* 130 */     return g();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 135 */   static ArrayList j = new ArrayList();
/*     */   
/* 137 */   public static ArrayList k = new ArrayList();
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
/* 148 */   public static final a l = a((a)new c());
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 153 */   public static final a m = a((a)new d());
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 158 */   public static final a n = a((a)new b());
/*     */   
/*     */   public static final a o;
/*     */   
/* 162 */   public static final a p = a((a)new f());
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 167 */     o = a((a)new e());
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
/*     */   public static strictfp a a(String paramString) {
/* 181 */     paramString = paramString.toLowerCase(Locale.ENGLISH);
/*     */     
/* 183 */     for (a a1 : k) {
/*     */       
/* 185 */       if (a1.a.equalsIgnoreCase(paramString))
/*     */       {
/* 187 */         return a1;
/*     */       }
/*     */     } 
/* 190 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp a a(a parama) {
/* 196 */     for (a a2 : j) {
/*     */       
/* 198 */       if (a2.a.equals(parama.a))
/*     */       {
/* 200 */         throw new RuntimeException("Built in resource already exists:" + parama.a);
/*     */       }
/*     */     } 
/* 203 */     a a1 = parama;
/* 204 */     j.add(a1);
/* 205 */     k.add(a1);
/*     */     
/* 207 */     return a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp a a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/* 212 */     for (a a2 : j) {
/*     */       
/* 214 */       if (a2.a.equals(paramString))
/*     */       {
/*     */ 
/*     */         
/* 218 */         return a2;
/*     */       }
/*     */     } 
/* 221 */     a a1 = new a();
/* 222 */     a1.a = paramString;
/* 223 */     a1.h = paramBoolean1;
/* 224 */     a1.g = paramBoolean2;
/*     */     
/* 226 */     j.add(a1);
/*     */     
/* 228 */     return a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp a b(String paramString) {
/* 233 */     for (a a1 : j) {
/*     */       
/* 235 */       if (a1.a.equals(paramString))
/*     */       {
/* 237 */         return a1;
/*     */       }
/*     */     } 
/*     */     
/* 241 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String a(double paramDouble, boolean paramBoolean) {
/* 246 */     String str = h() + ": ";
/*     */     
/* 248 */     if (this == l)
/*     */     {
/* 250 */       str = "$";
/*     */     }
/*     */     
/* 253 */     if (paramBoolean) {
/*     */       
/* 255 */       if (paramDouble > 0.0D)
/*     */       {
/* 257 */         return "+" + str + f.a(paramDouble, 1);
/*     */       }
/*     */ 
/*     */       
/* 261 */       return "-" + str + f.a(-paramDouble, 1);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 266 */     if (paramDouble > 0.0D)
/*     */     {
/* 268 */       return str + f.a(paramDouble, 1);
/*     */     }
/*     */ 
/*     */     
/* 272 */     return str + f.a(paramDouble, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String toString() {
/* 281 */     return "resource(" + this.a + ")";
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp double a(af paramaf) {
/* 286 */     if (this.g)
/*     */     {
/* 288 */       return paramaf.bB.b(this);
/*     */     }
/*     */ 
/*     */     
/* 292 */     return paramaf.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, double paramDouble) {
/* 298 */     if (this.g) {
/*     */       
/* 300 */       paramaf.bB.P().a(this, paramDouble);
/*     */     }
/*     */     else {
/*     */       
/* 304 */       paramaf.cN().a(this, paramDouble);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(af paramaf, double paramDouble) {
/* 310 */     if (this.g) {
/*     */       
/* 312 */       paramaf.bB.P().b(this, paramDouble);
/*     */     }
/*     */     else {
/*     */       
/* 316 */       paramaf.cN().b(this, paramDouble);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\d\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
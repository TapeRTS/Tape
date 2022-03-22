/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.d.d;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
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
/*     */ public class w
/*     */ {
/*  25 */   static m a = new m();
/*     */   
/*  27 */   static final t b = new t();
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
/*     */   public static x a(long paramLong) {
/*  54 */     Object[] arrayOfObject = a.a();
/*  55 */     for (int i = a.a - 1; i >= 0; i--) {
/*     */       
/*  57 */       x x = (x)arrayOfObject[i];
/*  58 */       if (x.a == paramLong)
/*     */       {
/*  60 */         return x;
/*     */       }
/*     */     } 
/*  63 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static x a(af paramaf) {
/*  68 */     long l = paramaf.dA;
/*  69 */     x x = a(l);
/*     */     
/*  71 */     if (x == null) {
/*     */       
/*  73 */       x = new x();
/*  74 */       x.a = paramaf.dA;
/*  75 */       x.b = paramaf.cg;
/*  76 */       x.c = paramaf.ch;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  82 */       x.d = (l.u()).bF.R;
/*     */ 
/*     */ 
/*     */       
/*  86 */       a.add(x);
/*     */     } 
/*  88 */     return x;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(af paramaf, g paramg) {
/*  93 */     if (!(l.u()).bF.z) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  98 */     x x = a(paramaf);
/*     */     
/* 100 */     x.b += paramg.f;
/* 101 */     x.c = paramg.c(x.c);
/*     */     
/* 103 */     if (!paramg.k.b())
/*     */     {
/* 105 */       x.e = d.b(x.e, paramg.k);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void b(af paramaf, g paramg) {
/* 111 */     if (!(l.u()).bF.z) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 116 */     x x = a(paramaf);
/*     */     
/* 118 */     x.b -= paramg.f;
/* 119 */     x.c = paramg.c(x.c);
/*     */     
/* 121 */     if (!paramg.k.b())
/*     */     {
/* 123 */       x.e = d.a(x.e, paramg.k);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 128 */     if (a.a > 0)
/*     */     {
/* 130 */       l.d("LagHiding: fake refund of: " + paramg.a(false, true, 5, true) + " setFlags: " + paramg.g);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c(af paramaf, g paramg) {
/* 141 */     x x = a(paramaf.dA);
/*     */     
/* 143 */     if (x != null) {
/*     */       
/* 145 */       b.bB = paramaf.bB;
/* 146 */       b.cg = x.b;
/* 147 */       b.ch = x.c;
/* 148 */       b.a(x.e);
/*     */       
/* 150 */       return paramg.b((af)b, false);
/*     */     } 
/*     */ 
/*     */     
/* 154 */     return paramg.b(paramaf, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(LogicBoolean paramLogicBoolean, k paramk) {
/* 160 */     x x = a(paramk.dA);
/*     */     
/* 162 */     if (x != null) {
/*     */       
/* 164 */       int i = paramk.cg;
/* 165 */       int j = paramk.ch;
/*     */ 
/*     */       
/* 168 */       paramk.cg = x.b;
/* 169 */       paramk.ch = x.c;
/*     */ 
/*     */       
/* 172 */       boolean bool = paramLogicBoolean.read(paramk);
/*     */       
/* 174 */       paramk.cg = i;
/* 175 */       paramk.ch = j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 184 */       return bool;
/*     */     } 
/*     */     
/* 187 */     return paramLogicBoolean.read(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a() {
/* 195 */     if (a.a > 0)
/*     */     {
/* 197 */       l.d("LagHiding: clearing: " + a.a);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 202 */     a.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(r paramr, s params) {
/* 210 */     if (a.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     int i = (l.u()).bF.R;
/*     */     
/* 220 */     for (int j = a.size() - 1; j >= 0; j--) {
/*     */       
/* 222 */       x x = (x)a.get(j);
/*     */       
/* 224 */       if (x.a == paramr.dA) {
/*     */         
/* 226 */         a.remove(j);
/*     */         
/*     */         break;
/*     */       } 
/* 230 */       if (x.d < i + 80) {
/*     */         
/* 232 */         a.remove(j);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.custom.e;
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
/*     */ final class b$1
/*     */ {
/*  68 */   int a = -1; int b;
/*     */   b$1(String paramString) {}
/*     */   void a() {
/*  71 */     this.b = (++this.a < this.c.length()) ? this.c.charAt(this.a) : -1;
/*     */   }
/*     */   
/*     */   boolean a(int paramInt) {
/*  75 */     for (; this.b == 32; a());
/*  76 */     if (this.b == paramInt) {
/*  77 */       a();
/*  78 */       return true;
/*     */     } 
/*  80 */     return false;
/*     */   }
/*     */   
/*     */   double b() {
/*  84 */     a();
/*  85 */     double d = c();
/*  86 */     if (this.a < this.c.length()) throw new RuntimeException("Unexpected: " + (char)this.b); 
/*  87 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   double c() {
/*  97 */     double d = d();
/*     */     while (true) {
/*  99 */       for (; a(43); d += d());
/* 100 */       if (a(45)) { d -= d(); continue; }
/* 101 */        return d;
/*     */     } 
/*     */   }
/*     */   
/*     */   double d() {
/* 106 */     double d = e();
/*     */     while (true) {
/* 108 */       for (; a(42); d *= e());
/* 109 */       if (a(47)) { d /= e(); continue; }
/* 110 */        return d;
/*     */     } 
/*     */   }
/*     */   double e() {
/*     */     double d;
/* 115 */     if (a(43)) return e(); 
/* 116 */     if (a(45)) return -e();
/*     */ 
/*     */     
/* 119 */     int i = this.a;
/* 120 */     if (a(40))
/* 121 */     { d = c();
/* 122 */       a(41); }
/* 123 */     else { if ((this.b >= 48 && this.b <= 57) || this.b == 46)
/* 124 */         while (true) { if ((this.b >= 48 && this.b <= 57) || this.b == 46) { a(); continue; }
/* 125 */            d = Double.parseDouble(this.c.substring(i, this.a));
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
/* 140 */           if (a(94)) d = Math.pow(d, e());
/*     */           
/* 142 */           return d; }   if (this.b >= 97 && this.b <= 122) { for (; this.b >= 97 && this.b <= 122; a()); String str = this.c.substring(i, this.a); d = e(); if (str.equals("sqrt")) { d = Math.sqrt(d); } else if (str.equals("sin")) { d = Math.sin(Math.toRadians(d)); } else if (str.equals("cos")) { d = Math.cos(Math.toRadians(d)); } else if (str.equals("tan")) { d = Math.tan(Math.toRadians(d)); } else if (str.equals("int")) { d = (int)d; } else { throw new RuntimeException("Unknown function: " + str); }  } else { throw new RuntimeException("Unexpected: " + (char)this.b); }  }  if (a(94)) d = Math.pow(d, e());  return d;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\e\b$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
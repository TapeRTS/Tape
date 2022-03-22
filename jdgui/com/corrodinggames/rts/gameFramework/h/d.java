/*     */ package com.corrodinggames.rts.gameFramework.h;
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
/*     */ public final class d
/*     */   extends f
/*     */ {
/*     */   boolean a;
/*     */   int b;
/*  22 */   final a c = new a(100);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  29 */   final a d = new a(900);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(j paramj) {
/*  39 */     int i = paramj.c;
/*     */     
/*  41 */     if (i <= this.b) {
/*     */       
/*  43 */       if (i == this.b) {
/*     */         
/*  45 */         this.c.b(paramj);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  58 */       c();
/*  59 */       this.b = i;
/*  60 */       this.c.a(paramj);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     this.d.b(paramj);
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
/*     */   public strictfp j a() {
/*  93 */     long l = -1L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  99 */       if (this.c.b > 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 105 */         return this.c.b();
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 110 */       if (this.d.b == 0) {
/*     */         
/* 112 */         this.b = Integer.MAX_VALUE;
/* 113 */         return null;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       d();
/*     */       
/* 125 */       return this.c.b();
/*     */     } finally {}
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
/*     */   public strictfp void b() {
/* 139 */     a((i)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 145 */     if (parami != null) {
/*     */       
/* 147 */       j[] arrayOfJ1 = this.c.a();
/* 148 */       for (int j = this.c.b - 1; j >= 0; j--) {
/*     */         
/* 150 */         j j1 = arrayOfJ1[j];
/* 151 */         parami.a(j1);
/*     */       } 
/*     */ 
/*     */       
/* 155 */       j[] arrayOfJ2 = this.d.a();
/* 156 */       for (int k = this.d.b - 1; k >= 0; k--) {
/*     */         
/* 158 */         j j1 = arrayOfJ2[k];
/* 159 */         parami.a(j1);
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
/* 171 */     this.c.clear();
/* 172 */     this.d.clear();
/*     */ 
/*     */     
/* 175 */     this.b = Integer.MAX_VALUE;
/* 176 */     this.a = true;
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
/*     */   private strictfp void c() {
/* 188 */     j[] arrayOfJ = this.c.a(); byte b; int i;
/* 189 */     for (b = 0, i = this.c.b; b < i; b++) {
/*     */       
/* 191 */       j j = arrayOfJ[b];
/* 192 */       this.d.a(j);
/*     */     } 
/*     */     
/* 195 */     this.c.clear();
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
/*     */   private strictfp void d() {
/* 210 */     long l = -1L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     int i = Integer.MAX_VALUE;
/*     */     
/* 217 */     a a1 = this.d;
/*     */     
/* 219 */     j[] arrayOfJ = a1.a(); int j;
/* 220 */     for (j = a1.b - 1; j >= 0; j--) {
/*     */       
/* 222 */       j j1 = arrayOfJ[j];
/* 223 */       int k = j1.c;
/*     */       
/* 225 */       if (k < i)
/*     */       {
/* 227 */         i = k;
/*     */       }
/*     */     } 
/*     */     
/* 231 */     for (j = a1.b - 1; j >= 0; j--) {
/*     */       
/* 233 */       j j1 = arrayOfJ[j];
/* 234 */       if (j1.c == i) {
/*     */         
/* 236 */         this.c.a(j1);
/*     */ 
/*     */         
/* 239 */         int k = a1.b - 1;
/* 240 */         arrayOfJ[j] = arrayOfJ[k];
/* 241 */         arrayOfJ[k] = null;
/* 242 */         a1.b = k;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 247 */     this.b = i;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
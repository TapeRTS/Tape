/*     */ package com.corrodinggames.rts.b.a;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.h.c;
/*     */ import com.corrodinggames.rts.gameFramework.h.d;
/*     */ import com.corrodinggames.rts.gameFramework.h.f;
/*     */ import com.corrodinggames.rts.gameFramework.h.j;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends h
/*     */ {
/*     */   public j a(int paramInt) {
/*  19 */     j j = new j();
/*  20 */     j.a((short)paramInt, (short)0);
/*  21 */     j.a(0, 0, 0);
/*  22 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  28 */     l.d("== Testing FastNodeQueue ==");
/*  29 */     c c = new c();
/*  30 */     a((f)c);
/*     */     
/*  32 */     l.d("== Testing FastNodeQueue2 ==");
/*  33 */     d d = new d();
/*  34 */     a((f)d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(f paramf) {
/*  43 */     j j1 = a(1);
/*  44 */     j j2 = a(2);
/*  45 */     j j3 = a(3);
/*  46 */     j j4 = a(4);
/*     */     
/*  48 */     l.d("sequential");
/*     */     
/*  50 */     paramf.b();
/*     */     
/*  52 */     paramf.a(j1);
/*  53 */     paramf.a(j2);
/*  54 */     paramf.a(j3);
/*  55 */     paramf.a(j4);
/*     */     
/*  57 */     i.a(paramf.a(), j1);
/*  58 */     i.a(paramf.a(), j2);
/*  59 */     i.a(paramf.a(), j3);
/*  60 */     i.a(paramf.a(), j4);
/*     */     
/*  62 */     l.d("reverse sequence");
/*     */     
/*  64 */     paramf.b();
/*     */     
/*  66 */     paramf.a(j4);
/*  67 */     paramf.a(j3);
/*  68 */     paramf.a(j2);
/*  69 */     paramf.a(j1);
/*     */     
/*  71 */     i.a(paramf.a(), j1);
/*  72 */     i.a(paramf.a(), j2);
/*  73 */     i.a(paramf.a(), j3);
/*  74 */     i.a(paramf.a(), j4);
/*     */ 
/*     */ 
/*     */     
/*  78 */     l.d("sequential with noise");
/*     */     
/*  80 */     paramf.b();
/*     */     
/*  82 */     paramf.a(j1);
/*     */     byte b;
/*  84 */     for (b = 0; b < 'Ϩ'; b++)
/*     */     {
/*  86 */       paramf.a(a(100 + b));
/*     */     }
/*     */     
/*  89 */     i.a(paramf.a(), j1);
/*     */     
/*  91 */     paramf.a(j2);
/*  92 */     paramf.a(j3);
/*     */     
/*  94 */     for (b = 0; b < 'Ϩ'; b++)
/*     */     {
/*  96 */       paramf.a(a(100 + b));
/*     */     }
/*     */     
/*  99 */     i.a(paramf.a(), j2);
/*     */ 
/*     */     
/* 102 */     paramf.a(j4);
/*     */     
/* 104 */     i.a(paramf.a(), j3);
/* 105 */     i.a(paramf.a(), j4);
/*     */ 
/*     */     
/* 108 */     l.d("reverse sequence with noise");
/*     */     
/* 110 */     paramf.b();
/*     */     
/* 112 */     paramf.a(j4);
/* 113 */     paramf.a(j3);
/*     */     
/* 115 */     for (b = 0; b < 'Ϩ'; b++)
/*     */     {
/* 117 */       paramf.a(a(100 + b));
/*     */     }
/*     */     
/* 120 */     paramf.a(j2);
/*     */     
/* 122 */     for (b = 0; b < 'Ϩ'; b++)
/*     */     {
/* 124 */       paramf.a(a(100 + b));
/*     */     }
/*     */     
/* 127 */     paramf.a(j1);
/*     */     
/* 129 */     i.a(paramf.a(), j1);
/* 130 */     i.a(paramf.a(), j2);
/* 131 */     i.a(paramf.a(), j3);
/* 132 */     i.a(paramf.a(), j4);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
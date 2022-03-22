/*     */ package com.corrodinggames.rts.b.a;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
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
/*     */   extends h
/*     */ {
/*     */   public void a() {
/*  22 */     l.d("Running unit tests - maths (v3)");
/*     */     
/*  24 */     f.i(100.0F, 100.0F);
/*  25 */     f.i(0.0F, 100.0F);
/*  26 */     f.i(100.0F, 0.0F);
/*  27 */     f.i(0.0F, -100.0F);
/*  28 */     f.i(-100.0F, 0.0F);
/*     */     
/*  30 */     f.i(0.0F, 0.0F);
/*     */     
/*  32 */     l.d("fast_atan2 - NaN");
/*     */     
/*  34 */     f.i(Float.NaN, 0.0F);
/*  35 */     f.i(0.0F, Float.NaN);
/*  36 */     f.i(Float.NaN, Float.NaN);
/*     */     
/*  38 */     l.d("fast_atan2 - Max");
/*     */     
/*  40 */     f.i(Float.MAX_VALUE, 0.0F);
/*  41 */     f.i(Float.MIN_VALUE, 0.0F);
/*     */     
/*  43 */     f.i(0.0F, Float.MAX_VALUE);
/*  44 */     f.i(0.0F, Float.MIN_VALUE);
/*     */ 
/*     */     
/*  47 */     l.d("fast_atan2 - NaN+Max");
/*  48 */     f.i(Float.MAX_VALUE, Float.NaN);
/*  49 */     f.i(Float.MIN_VALUE, Float.MAX_VALUE);
/*     */     
/*  51 */     f.i(Float.MAX_VALUE, Float.MIN_VALUE);
/*     */ 
/*     */     
/*  54 */     f.i(900000.0F, 900000.0F);
/*     */ 
/*     */     
/*  57 */     f.i(3.4028236E33F, 3.4028236E33F);
/*     */     
/*  59 */     f.i(3.4028236E34F, 3.4028236E34F);
/*     */     
/*  61 */     f.i(3.4028234E35F, 3.4028234E35F);
/*     */     
/*  63 */     f.i(3.4028236E36F, 3.4028236E36F);
/*     */     
/*  65 */     f.i(3.4028235E37F, 3.4028235E37F);
/*     */     
/*  67 */     f.i(Float.MAX_VALUE, Float.MAX_VALUE);
/*     */     
/*  69 */     l.d("fast_atan2 - max,max");
/*     */     
/*  71 */     f.i(Float.MAX_VALUE, Float.MAX_VALUE);
/*     */     
/*  73 */     f.i(Float.MIN_VALUE, Float.MIN_VALUE);
/*     */ 
/*     */     
/*  76 */     l.d("cos/sin");
/*     */     
/*  78 */     i.a(f.i(0.0F), 1.0F);
/*  79 */     i.a(f.i(360.0F), 1.0F);
/*  80 */     i.a(f.i(10800.0F), 1.0F);
/*     */     
/*  82 */     i.a(f.i(45.0F), 0.70710677F);
/*     */     
/*  84 */     i.a(f.i(90.0F), 0.0F);
/*  85 */     i.a(f.i(450.0F), 0.0F);
/*  86 */     i.a(f.i(10890.0F), 0.0F);
/*     */ 
/*     */     
/*  89 */     i.a(f.h(0.0F), 0.0F);
/*  90 */     i.a(f.h(90.0F), 1.0F);
/*     */     
/*  92 */     f.i(-999999.0F);
/*  93 */     f.i(999999.0F);
/*     */     
/*  95 */     f.i(Float.MAX_VALUE);
/*  96 */     f.i(Float.MIN_VALUE);
/*     */     
/*  98 */     f.h(Float.MAX_VALUE);
/*  99 */     f.h(Float.MIN_VALUE);
/*     */ 
/*     */ 
/*     */     
/* 103 */     l.d("Testing squareroot");
/*     */     
/* 105 */     for (byte b = 0; b < 'ϭ'; b++)
/*     */     {
/* 107 */       i.a(f.a(b), f.d(f.a(b)));
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.gameFramework.d.d;
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
/*     */ public final class n
/*     */ {
/*     */   public static void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint) {
/*  20 */     l l = l.u();
/*     */     
/*  22 */     String[] arrayOfString = f.b(paramString, '\n');
/*     */ 
/*     */ 
/*     */     
/*  26 */     float f1 = d.b(paramPaint);
/*     */     
/*  28 */     float f2 = (arrayOfString.length - 1) * f1;
/*     */     
/*  30 */     byte b = 0;
/*  31 */     for (String str : arrayOfString) {
/*     */       
/*  33 */       Paint paint = paramPaint;
/*     */ 
/*     */       
/*  36 */       float f3 = paramFloat1;
/*     */ 
/*     */       
/*  39 */       float f4 = paramFloat2 - f2 / 2.0F + b * f1 + f1 / 2.0F;
/*     */       
/*  41 */       l.bw.a(str, f3, f4, paint);
/*  42 */       b++;
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
/*  81 */   static int a = -1;
/*     */   
/*     */   static float b;
/*     */   static float c;
/*     */   static float d;
/*  86 */   public static final Rect e = new Rect();
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/*  91 */     if (l.aj()) {
/*     */       
/*  93 */       l l1 = l.u();
/*  94 */       a(paraml, paramFloat1, paramFloat2, paramFloat3, 40, paramPaint, l1.cx);
/*     */     }
/*     */     else {
/*     */       
/*  98 */       paraml.a(paramFloat1, paramFloat2, paramFloat3, paramPaint);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(l paraml, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, Paint paramPaint, Rect paramRect) {
/* 109 */     if (a != paramInt) {
/*     */       
/* 111 */       a = paramInt;
/* 112 */       b = 6.283185F / paramInt;
/* 113 */       c = f.i(b);
/* 114 */       d = f.h(b);
/*     */     } 
/* 116 */     float f1 = c;
/* 117 */     float f2 = d;
/*     */ 
/*     */     
/* 120 */     int i = (int)(b * paramFloat3 * 0.5F);
/*     */     
/* 122 */     int j = i + 50;
/* 123 */     paramRect.a -= j;
/* 124 */     paramRect.b -= j;
/*     */     
/* 126 */     paramRect.c += j;
/* 127 */     paramRect.d += j;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     float f3 = paramFloat3;
/* 133 */     float f4 = 0.0F;
/*     */     
/* 135 */     paramInt++;
/*     */     
/* 137 */     float f5 = 0.0F;
/* 138 */     float f6 = 0.0F;
/*     */     
/* 140 */     float f7 = 0.0F;
/* 141 */     float f8 = 0.0F;
/* 142 */     boolean bool = true;
/*     */     
/* 144 */     for (byte b = 0; b < paramInt; b++) {
/*     */ 
/*     */       
/* 147 */       float f10 = f3 + paramFloat1;
/* 148 */       float f11 = f4 + paramFloat2;
/*     */       
/* 150 */       if (bool) {
/*     */         
/* 152 */         bool = false;
/*     */         
/* 154 */         f5 = f10;
/* 155 */         f6 = f11;
/*     */ 
/*     */       
/*     */       }
/* 159 */       else if (e.b((int)f10, (int)f11) || e.b((int)f7, (int)f8)) {
/*     */ 
/*     */         
/* 162 */         paraml.a(f10, f11, f7, f8, paramPaint);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 167 */       f7 = f10;
/* 168 */       f8 = f11;
/*     */ 
/*     */       
/* 171 */       float f9 = f3;
/* 172 */       f3 = f1 * f3 - f2 * f4;
/* 173 */       f4 = f2 * f9 + f1 * f4;
/*     */     } 
/*     */     
/* 176 */     if (e.b((int)f5, (int)f6) || e.b((int)f7, (int)f8))
/*     */     {
/* 178 */       paraml.a(f5, f6, f7, f8, paramPaint);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int a(int paramInt) {
/* 188 */     return paramInt >>> 24;
/*     */   }
/*     */   
/*     */   public static final int b(int paramInt) {
/* 192 */     return paramInt >> 16 & 0xFF;
/*     */   }
/*     */   
/*     */   public static final int c(int paramInt) {
/* 196 */     return paramInt >> 8 & 0xFF;
/*     */   }
/*     */   
/*     */   public static final int d(int paramInt) {
/* 200 */     return paramInt & 0xFF;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
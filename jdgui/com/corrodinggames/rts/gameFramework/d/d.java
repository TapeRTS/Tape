/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */ {
/*  17 */   static Rect a = new Rect();
/*     */   
/*     */   public static int a(Paint paramPaint) {
/*  20 */     String str = "abcABC123!|";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  25 */     return (l.u()).bw.a(str, paramPaint) + 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int b(Paint paramPaint) {
/*  30 */     String str = "abcABC123!|";
/*     */     
/*  32 */     int i = (l.u()).bw.a(str, paramPaint);
/*     */     
/*  34 */     if (l.aI)
/*     */     {
/*  36 */       return i + 2;
/*     */     }
/*  38 */     return i;
/*     */   }
/*     */   
/*  41 */   static ArrayList b = new ArrayList();
/*     */ 
/*     */   
/*     */   public static ArrayList a(String paramString, Rect paramRect, Paint paramPaint1, Paint paramPaint2, boolean paramBoolean) {
/*  45 */     b.clear();
/*     */     
/*  47 */     String str = "";
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     while (j < paramString.length()) {
/*     */       
/*  53 */       int k = paramPaint2.a(paramString, j, paramString.length(), true, (paramRect.b() - 5), null);
/*  54 */       if (k == 0) {
/*     */         break;
/*     */       }
/*  57 */       int m = paramString.indexOf("\n", j + 1);
/*  58 */       if (m != -1 && m < j + k) {
/*     */         
/*  60 */         k = m - j;
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*  65 */       else if (j + k < paramString.length()) {
/*     */         
/*  67 */         String str2 = paramString.substring(j, j + k);
/*  68 */         int n = str2.lastIndexOf(" ");
/*  69 */         if (n != -1 && n != 0)
/*     */         {
/*  71 */           k = n;
/*     */         }
/*     */       } 
/*     */       
/*  75 */       String str1 = paramString.substring(j, j + k);
/*  76 */       str1 = str1.replaceAll("(\\n)", "");
/*     */       
/*  78 */       if (str1.length() > str.length()) {
/*     */         
/*  80 */         str = str1;
/*  81 */         i = b.size();
/*     */       } 
/*     */       
/*  84 */       b.add(str1);
/*     */ 
/*     */ 
/*     */       
/*  88 */       j += k;
/*     */     } 
/*     */     
/*  91 */     paramRect.d = paramRect.b + b.size() * a(paramPaint2);
/*     */     
/*  93 */     if (paramBoolean) {
/*     */       
/*  95 */       float f1 = paramRect.d();
/*     */       
/*  97 */       Paint paint = paramPaint2;
/*  98 */       if (i == 0)
/*     */       {
/* 100 */         paint = paramPaint1;
/*     */       }
/*     */       
/* 103 */       float f2 = (l.u()).bw.b(str, paint);
/*     */       
/* 105 */       if (f2 < paramRect.b()) {
/*     */         
/* 107 */         paramRect.a = (int)(f1 - f2 / 2.0F);
/* 108 */         paramRect.c = (int)(f1 + f2 / 2.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     return b;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
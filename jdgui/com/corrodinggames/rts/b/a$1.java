/*     */ package com.corrodinggames.rts.b;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
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
/*     */ final class a$1
/*     */   implements Runnable
/*     */ {
/*     */   public strictfp void run() {
/*  71 */     for (String str : a.d) {
/*     */       
/*  73 */       l.d("Running debug script:" + str);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*  79 */         FileReader fileReader = new FileReader(str);
/*  80 */         BufferedReader bufferedReader = new BufferedReader(fileReader);
/*     */ 
/*     */         
/*     */         while (true) {
/*  84 */           String str1 = bufferedReader.readLine();
/*  85 */           if (str1 == null)
/*  86 */             break;  str1 = str1.trim();
/*  87 */           if (str1.equals("") || 
/*  88 */             str1.startsWith("#"))
/*     */             continue; 
/*  90 */           l.d("Running: " + str1);
/*     */           
/*  92 */           String str2 = a.b("script " + str1);
/*     */ 
/*     */           
/*  95 */           l.d("got: " + str2.trim());
/*     */         } 
/*     */ 
/*     */         
/*  99 */         bufferedReader.close();
/* 100 */         fileReader.close();
/*     */       }
/* 102 */       catch (IOException iOException) {
/*     */         
/* 104 */         throw new RuntimeException(iOException);
/*     */       } 
/*     */ 
/*     */       
/* 108 */       l.d("End of:" + str);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
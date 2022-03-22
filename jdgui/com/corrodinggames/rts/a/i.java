/*     */ package com.corrodinggames.rts.a;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Comparator;
/*     */ import java.util.Date;
/*     */ import java.util.Locale;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ class i
/*     */   implements Comparator
/*     */ {
/* 121 */   Pattern a = Pattern.compile(".*\\((.*)\\).*");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(String paramString1, String paramString2) {
/* 127 */     Date date1 = a(paramString1);
/* 128 */     Date date2 = a(paramString2);
/*     */     
/* 130 */     if (date1 == null && date2 == null)
/*     */     {
/* 132 */       return paramString1.compareTo(paramString2);
/*     */     }
/*     */     
/* 135 */     if (date1 != null && date2 != null)
/*     */     {
/* 137 */       return date2.compareTo(date1);
/*     */     }
/*     */     
/* 140 */     if (date1 == null && date2 != null)
/*     */     {
/* 142 */       return -1;
/*     */     }
/*     */     
/* 145 */     if (date1 != null && date2 == null)
/*     */     {
/* 147 */       return 1;
/*     */     }
/*     */     
/* 150 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date a(String paramString) {
/* 156 */     Matcher matcher = this.a.matcher(paramString);
/* 157 */     if (matcher.matches()) {
/*     */       
/* 159 */       String str = matcher.group(1);
/*     */ 
/*     */       
/*     */       try {
/* 163 */         return (new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH)).parse(str);
/*     */       }
/* 165 */       catch (ParseException parseException) {
/*     */ 
/*     */         
/*     */         try {
/*     */           
/* 170 */           return (new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH)).parse(str);
/*     */         }
/* 172 */         catch (ParseException parseException1) {
/*     */ 
/*     */           
/*     */           try {
/*     */             
/* 177 */             return (new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH)).parse(str);
/*     */           }
/* 179 */           catch (ParseException parseException2) {
/*     */ 
/*     */ 
/*     */             
/*     */             try { 
/*     */               
/* 185 */               return (new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH)).parse(str); }
/*     */             
/* 187 */             catch (ParseException parseException3)
/*     */             
/*     */             { 
/*     */               
/*     */               try { 
/*     */ 
/*     */ 
/*     */                 
/* 195 */                 return (new SimpleDateFormat("d MMM. yyyy HH.mm.ss", Locale.ENGLISH)).parse(str); }
/*     */               
/* 197 */               catch (ParseException parseException4)
/*     */               
/*     */               { 
/*     */                 
/* 201 */                 l.d("Failed to parse date:" + str); }  } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 205 */     }  return null;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\a\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
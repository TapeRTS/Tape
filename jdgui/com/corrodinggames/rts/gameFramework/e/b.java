/*     */ package com.corrodinggames.rts.gameFramework.e;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.MissingResourceException;
/*     */ import java.util.ResourceBundle;
/*     */ import java.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   extends ResourceBundle
/*     */ {
/*     */   ResourceBundle a;
/*     */   ResourceBundle b;
/*     */   
/*     */   public strictfp b(ResourceBundle paramResourceBundle1, ResourceBundle paramResourceBundle2) {
/*  73 */     this.a = paramResourceBundle1;
/*  74 */     this.b = paramResourceBundle2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp Enumeration getKeys() {
/*  80 */     l.d("MultipleResourceBundle: Slow get keys");
/*     */     
/*  82 */     Vector<String> vector = new Vector();
/*     */     
/*  84 */     vector.addAll(Collections.list(this.a.getKeys()));
/*     */     
/*  86 */     if (this.b != null)
/*     */     {
/*  88 */       for (String str : Collections.<String>list(this.b.getKeys())) {
/*     */         
/*  90 */         if (!vector.contains(str))
/*     */         {
/*  92 */           vector.add(str);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  99 */     return vector.elements();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected strictfp Object handleGetObject(String paramString) {
/*     */     Object object;
/*     */     try {
/* 108 */       object = this.a.getObject(paramString);
/*     */     }
/* 110 */     catch (MissingResourceException missingResourceException) {
/*     */       
/* 112 */       object = null;
/*     */     } 
/*     */ 
/*     */     
/* 116 */     if (object == null && 
/* 117 */       this.b != null) {
/*     */       
/*     */       try {
/* 120 */         object = this.b.getObject(paramString);
/*     */       }
/* 122 */       catch (MissingResourceException missingResourceException) {
/*     */         
/* 124 */         object = null;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 130 */     return object;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\e\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
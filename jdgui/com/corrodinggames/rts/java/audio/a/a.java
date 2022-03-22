/*    */ package com.corrodinggames.rts.java.audio.a;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   protected InputStream a;
/*    */   protected File b;
/*    */   protected String c;
/*    */   
/*    */   public a(String paramString) {
/* 18 */     this.b = new File(paramString);
/* 19 */     this.c = this.b.getName();
/*    */   }
/*    */ 
/*    */   
/*    */   public a(InputStream paramInputStream, String paramString) {
/* 24 */     this.a = paramInputStream;
/* 25 */     this.c = paramString;
/*    */     
/* 27 */     if (this.a == null)
/*    */     {
/* 29 */       throw new RuntimeException("inputStream==null");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InputStream a() {
/* 38 */     if (this.a != null)
/*    */     {
/* 40 */       return this.a;
/*    */     }
/*    */ 
/*    */     
/*    */     try {
/* 45 */       return new FileInputStream(this.b);
/*    */     }
/* 47 */     catch (FileNotFoundException fileNotFoundException) {
/*    */       
/* 49 */       throw new RuntimeException(fileNotFoundException);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 55 */     String str = this.c;
/* 56 */     int i = str.lastIndexOf('.');
/* 57 */     if (i == -1) return ""; 
/* 58 */     return str.substring(i + 1);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
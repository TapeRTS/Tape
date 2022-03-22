/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aq
/*     */ {
/*  19 */   ArrayList a = new ArrayList();
/*     */ 
/*     */   
/*     */   int b;
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/*  26 */     for (ar ar : this.a)
/*     */     {
/*  28 */       ar.b = paramFloat;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  34 */     return a(0.0F, 0.0F, 1.0F, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  39 */     return a(paramFloat1, paramFloat2, paramFloat3, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean) {
/*  44 */     if (this.a.size() == 0)
/*     */     {
/*  46 */       return false;
/*     */     }
/*     */     
/*  49 */     if (this.b >= this.a.size())
/*     */     {
/*  51 */       this.b = 0;
/*     */     }
/*     */     
/*  54 */     ar ar = this.a.get(this.b);
/*     */ 
/*     */     
/*  57 */     l l = l.u();
/*     */     
/*  59 */     if (paramBoolean) {
/*     */       
/*  61 */       l.bu.c(ar.a, ar.b);
/*     */     }
/*     */     else {
/*     */       
/*  65 */       l.bu.a(ar.a, ar.b, paramFloat1, paramFloat2);
/*     */     } 
/*     */     
/*  68 */     this.b++;
/*     */     
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static aq a(l paraml, String paramString) {
/*  75 */     return a(paraml, paramString, (aq)null);
/*     */   }
/*     */   
/*     */   public static aq a(l paraml, String paramString, aq paramaq) {
/*  79 */     if (paramString == null || paramString.equals(""))
/*     */     {
/*  81 */       if (paramaq != null)
/*     */       {
/*  83 */         return paramaq;
/*     */       }
/*     */     }
/*     */     
/*  87 */     return new aq(paraml, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aq() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aq(l paraml, String paramString) {
/* 100 */     if (paramString == null || paramString.equals("") || paramString.equalsIgnoreCase("NONE")) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 105 */     String str = paraml.x;
/*     */ 
/*     */     
/* 108 */     String[] arrayOfString = paramString.split(",");
/*     */     
/* 110 */     for (String str1 : arrayOfString) {
/*     */       
/* 112 */       ar ar = new ar(this);
/*     */       
/* 114 */       str1 = str1.trim();
/*     */       
/* 116 */       String str2 = "";
/* 117 */       if (str1.startsWith("ROOT:")) {
/*     */         
/* 119 */         str1 = str1.substring("ROOT:".length());
/* 120 */         str2 = str2 + "ROOT:";
/*     */       } 
/*     */       
/* 123 */       if (str1.startsWith("SHARED:")) {
/*     */         
/* 125 */         str1 = str1.substring("SHARED:".length());
/* 126 */         str2 = str2 + "SHARED:";
/*     */       } 
/*     */ 
/*     */       
/* 130 */       String[] arrayOfString1 = str1.split(":");
/*     */       
/* 132 */       String str3 = null;
/* 133 */       String str4 = arrayOfString1[0].trim();
/*     */       
/* 135 */       if (arrayOfString1.length != 1)
/*     */       {
/*     */         
/* 138 */         if (arrayOfString1.length == 2) {
/*     */           
/* 140 */           str3 = arrayOfString1[1].trim();
/*     */         }
/*     */         else {
/*     */           
/* 144 */           throw new RuntimeException("Unknown sound format:" + str1);
/*     */         } 
/*     */       }
/* 147 */       if (str3 != null) {
/*     */         
/*     */         try {
/*     */           
/* 151 */           ar.b = Float.parseFloat(str3);
/*     */         }
/* 153 */         catch (NumberFormatException numberFormatException) {
/*     */           
/* 155 */           throw new RuntimeException("Failed to parse volume float: '" + str3 + "' of sound: '" + str1 + "'");
/*     */         } 
/*     */       }
/*     */       
/* 159 */       str4 = str2 + str4;
/*     */ 
/*     */       
/* 162 */       ar.a = ac.a(str, str4, paraml);
/*     */       
/* 164 */       if (ar.a != null)
/*     */       {
/*     */ 
/*     */         
/* 168 */         this.a.add(ar);
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
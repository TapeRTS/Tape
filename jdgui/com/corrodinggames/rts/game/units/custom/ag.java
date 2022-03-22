/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.e.a;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ag
/*     */ {
/*  14 */   public static final ag a = a(""); public ah[] b; public String c;
/*     */   public int d;
/*     */   public String e;
/*     */   
/*     */   public static ag a(String paramString) {
/*  19 */     ag ag1 = new ag();
/*     */     
/*  21 */     ArrayList<ah> arrayList = new ArrayList();
/*     */     
/*  23 */     ah ah1 = new ah();
/*  24 */     ah1.a = null;
/*  25 */     ah1.b = paramString;
/*  26 */     arrayList.add(ah1);
/*     */     
/*  28 */     ag1.b = arrayList.<ah>toArray(new ah[0]);
/*     */     
/*  30 */     ag1.b();
/*     */     
/*  32 */     return ag1;
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
/*     */   public ag()
/*     */   {
/* 109 */     this.d = -1; } public ag(ah[] paramArrayOfah) { this.d = -1;
/*     */     this.b = paramArrayOfah; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 116 */     if (this.d == a.c)
/*     */     {
/* 118 */       return this.c;
/*     */     }
/*     */     
/* 121 */     if (this.e != null) {
/*     */       
/* 123 */       this.d = a.c;
/*     */       
/* 125 */       this.c = a.a(this.e, new Object[0]);
/* 126 */       return this.c;
/*     */     } 
/*     */ 
/*     */     
/* 130 */     String str = a.c();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     for (ah ah1 : this.b) {
/*     */       
/* 140 */       if (str.equals(ah1.a)) {
/*     */ 
/*     */         
/* 143 */         this.d = a.c;
/*     */         
/* 145 */         this.c = ah1.b;
/* 146 */         return this.c;
/*     */       } 
/*     */     } 
/*     */     
/* 150 */     for (ah ah1 : this.b) {
/*     */       
/* 152 */       if (ah1.a == null) {
/*     */ 
/*     */         
/* 155 */         this.d = a.c;
/*     */         
/* 157 */         this.c = ah1.b;
/* 158 */         return this.c;
/*     */       } 
/*     */     } 
/*     */     
/* 162 */     return "<NO DEFAULT TEXT FOUND>";
/*     */   }
/*     */   
/*     */   public boolean a() {
/*     */     if (this.b != null)
/*     */       for (ah ah1 : this.b) {
/*     */         if (ah1.b != null && !"".equals(ah1.b))
/*     */           return false; 
/*     */       }  
/*     */     return true;
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*     */     if (this.b != null) {
/*     */       for (ah ah1 : this.b)
/*     */         ah1.a(paramString1, paramString2); 
/*     */     } else {
/*     */       l.b("LocaleString: replaceAll with null strings");
/*     */     } 
/*     */     this.d = -1;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
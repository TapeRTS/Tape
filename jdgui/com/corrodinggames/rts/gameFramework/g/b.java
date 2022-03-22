/*    */ package com.corrodinggames.rts.gameFramework.g;
/*    */ 
/*    */ import com.corrodinggames.rts.game.m;
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */ {
/*    */   int a;
/*    */   String b;
/*    */   String c;
/*    */   c d;
/*    */   long e;
/*    */   
/*    */   b(a parama, int paramInt, String paramString1, String paramString2, c paramc) {
/* 27 */     this.a = paramInt;
/* 28 */     this.b = paramString1;
/* 29 */     this.c = paramString2;
/* 30 */     this.d = paramc;
/* 31 */     this.e = System.nanoTime();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String a() {
/*    */     String str;
/* 38 */     if (this.b != null) {
/*    */       
/* 40 */       str = this.b + ": " + this.c;
/*    */     }
/*    */     else {
/*    */       
/* 44 */       str = this.c;
/*    */     } 
/* 46 */     return str;
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 51 */     String str = "";
/* 52 */     if (this.b != null) {
/*    */       
/* 54 */       int i = -1;
/*    */       
/* 56 */       if (this.a != -1)
/*    */       {
/* 58 */         i = m.m(this.a);
/*    */       }
/*    */       
/* 61 */       str = "<strong> <font color='" + f.f(i) + "'>" + this.f.a(this.b) + ": </font></strong>";
/*    */     } 
/*    */     
/* 64 */     String[] arrayOfString = this.c.split("\n");
/* 65 */     boolean bool = true;
/*    */     
/* 67 */     for (String str1 : arrayOfString) {
/*    */       
/* 69 */       if (!str1.trim().equals("")) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 74 */         if (bool) {
/*    */           
/* 76 */           bool = false;
/*    */         }
/*    */         else {
/*    */           
/* 80 */           str = str + "<br/>";
/*    */         } 
/* 82 */         str = str + this.f.a(str1);
/*    */       } 
/*    */     } 
/* 85 */     return str;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
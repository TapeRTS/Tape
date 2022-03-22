/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   public String a(String paramString) {
/*  97 */     return f.i(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 103 */   private ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt, String paramString1, String paramString2, c paramc) {
/* 108 */     paramString2 = paramString2.trim();
/*     */     
/* 110 */     b b = new b(this, paramInt, paramString1, paramString2, paramc);
/*     */     
/* 112 */     this.a.add(b);
/*     */     
/* 114 */     if (this.a.size() > 45)
/*     */     {
/* 116 */       this.a.poll();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(c paramc, int paramInt) {
/* 124 */     byte b = 0;
/* 125 */     for (b b1 : this.a) {
/*     */       
/* 127 */       if (b1.d == paramc)
/*     */       {
/* 129 */         if (f.a(b1.e, System.nanoTime()) < paramInt) {
/*     */ 
/*     */           
/* 132 */           if (b1.c.startsWith("-i ") || b1.c.startsWith("-qc ")) {
/*     */             continue;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/* 138 */           b++;
/*     */           
/* 140 */           if (b1.c != null) {
/*     */ 
/*     */             
/* 143 */             if (f.a(b1.c, '\n') >= 3)
/*     */             {
/* 145 */               b += 2;
/*     */             }
/* 147 */             if (f.a(b1.c, '\n') >= 6)
/*     */             {
/* 149 */               b += 2;
/*     */             }
/* 151 */             if (f.a(b1.c, '\n') >= 9)
/*     */             {
/* 153 */               b += 2;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 162 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 167 */     String str = "";
/*     */     
/* 169 */     for (b b : this.a)
/*     */     {
/* 171 */       str = str + b.a() + "\n";
/*     */     }
/* 173 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ConcurrentLinkedQueue b() {
/* 180 */     return this.a;
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
/*     */   public void c() {
/* 219 */     this.a.clear();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class au
/*     */ {
/*     */   public BufferedOutputStream a;
/*     */   public String b;
/*     */   public ByteArrayOutputStream c;
/*     */   public PrintStream d;
/*     */   public boolean e;
/*     */   
/*     */   public strictfp void a() {
/* 107 */     this.d.flush();
/*     */     
/* 109 */     if (this.a != null)
/*     */     {
/* 111 */       this.a.flush();
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
/*     */   public strictfp void b() {
/* 125 */     if (!this.e) {
/*     */       
/* 127 */       this.d.close();
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 133 */       l.f("TODO: Cannot yet close wrapped stream");
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
/*     */   public strictfp au(boolean paramBoolean) {
/*     */     ByteArrayOutputStream byteArrayOutputStream;
/* 162 */     this.e = false;
/*     */     
/* 164 */     this.c = new ByteArrayOutputStream();
/*     */     
/* 166 */     if (paramBoolean) {
/*     */ 
/*     */       
/* 169 */       this.a = new BufferedOutputStream(this.c);
/*     */       
/* 171 */       BufferedOutputStream bufferedOutputStream = this.a;
/*     */     }
/*     */     else {
/*     */       
/* 175 */       byteArrayOutputStream = this.c;
/*     */     } 
/*     */     
/* 178 */     this.d = new PrintStream(byteArrayOutputStream);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
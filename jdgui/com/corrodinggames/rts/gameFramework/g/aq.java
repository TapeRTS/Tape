/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.util.zip.GZIPOutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public GZIPOutputStream a;
/*     */   public BufferedOutputStream b;
/*     */   public String c;
/*     */   public ByteArrayOutputStream d;
/*     */   public DataOutputStream e;
/*     */   public boolean f;
/*     */   
/*     */   public strictfp void a() {
/* 108 */     this.e.flush();
/*     */     
/* 110 */     if (this.b != null)
/*     */     {
/* 112 */       this.b.flush();
/*     */     }
/*     */     
/* 115 */     if (this.a != null)
/*     */     {
/* 117 */       this.a.finish();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b() {
/* 126 */     if (!this.f) {
/*     */       
/* 128 */       this.e.close();
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 134 */       l.f("TODO: Cannot yet close wrapped stream");
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
/*     */   public strictfp aq(boolean paramBoolean) {
/*     */     ByteArrayOutputStream byteArrayOutputStream;
/* 163 */     this.f = false;
/*     */     
/* 165 */     this.d = new ByteArrayOutputStream();
/*     */     
/* 167 */     if (paramBoolean) {
/*     */       
/* 169 */       this.a = new GZIPOutputStream(this.d);
/* 170 */       this.b = new BufferedOutputStream(this.a);
/*     */       
/* 172 */       BufferedOutputStream bufferedOutputStream = this.b;
/*     */     }
/*     */     else {
/*     */       
/* 176 */       byteArrayOutputStream = this.d;
/*     */     } 
/*     */     
/* 179 */     this.e = new DataOutputStream(byteArrayOutputStream);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
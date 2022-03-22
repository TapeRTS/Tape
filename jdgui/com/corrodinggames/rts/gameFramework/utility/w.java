/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class w
/*     */   extends OutputStream
/*     */ {
/*     */   public byte[] a;
/*     */   protected int b;
/*     */   
/*     */   public w() {
/*  50 */     this.a = new byte[32];
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
/*     */   public w(int paramInt) {
/*  65 */     if (paramInt >= 0) {
/*  66 */       this.a = new byte[paramInt];
/*     */     } else {
/*  68 */       throw new IllegalArgumentException("size < 0");
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
/*     */   public void close() {
/*  85 */     super.close();
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(int paramInt) {
/*  90 */     if (this.b + paramInt <= this.a.length) {
/*     */       return;
/*     */     }
/*     */     
/*  94 */     byte[] arrayOfByte = new byte[(this.b + paramInt) * 2];
/*  95 */     System.arraycopy(this.a, 0, arrayOfByte, 0, this.b);
/*  96 */     this.a = arrayOfByte;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void a() {
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/* 114 */     return this.b;
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
/*     */   public String toString() {
/* 140 */     return new String(this.a, 0, this.b);
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
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3) {
/* 185 */     if ((paramInt2 | paramInt3) < 0 || paramInt2 > paramInt1 || paramInt1 - paramInt2 < paramInt3) {
/* 186 */       throw new ArrayIndexOutOfBoundsException();
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
/*     */   public synchronized void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 209 */     a(paramArrayOfbyte.length, paramInt1, paramInt2);
/* 210 */     if (paramInt2 == 0) {
/*     */       return;
/*     */     }
/* 213 */     a(paramInt2);
/* 214 */     System.arraycopy(paramArrayOfbyte, paramInt1, this.a, this.b, paramInt2);
/* 215 */     this.b += paramInt2;
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
/*     */   public synchronized void write(int paramInt) {
/* 227 */     if (this.b == this.a.length) {
/* 228 */       a(1);
/*     */     }
/* 230 */     this.a[this.b++] = (byte)paramInt;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
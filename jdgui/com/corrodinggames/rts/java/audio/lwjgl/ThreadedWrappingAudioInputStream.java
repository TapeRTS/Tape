/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PipedInputStream;
/*     */ import java.io.PipedOutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ThreadedWrappingAudioInputStream
/*     */   extends InputStream
/*     */ {
/*     */   InputStream source;
/*     */   PipedInputStream bufferInputStream;
/*     */   PipedOutputStream bufferOutputStream;
/*  19 */   byte[] transferBuffer = new byte[1024];
/*     */   
/*     */   boolean isClosed = false;
/*     */   
/*     */   boolean sourceEnded = false;
/*  24 */   final int bufferSize = 60000;
/*     */   
/*     */   int totalBytesRead;
/*     */   
/*     */   public ThreadedWrappingAudioInputStream(InputStream paramInputStream) {
/*  29 */     this.source = paramInputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  35 */       this.bufferOutputStream = new PipedOutputStream();
/*  36 */       this.bufferInputStream = new PipedInputStream(this.bufferOutputStream, 60000);
/*     */     
/*     */     }
/*  39 */     catch (IOException iOException) {
/*  40 */       throw new RuntimeException(iOException);
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
/*     */   public void backgroundFillBuffer() {
/*  52 */     l.d("at backgroundFillBuffer with: " + this.bufferInputStream.available());
/*     */ 
/*     */     
/*  55 */     if (this.sourceEnded) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     char c = '';
/*     */     
/*  64 */     while (!this.isClosed) {
/*     */ 
/*     */ 
/*     */       
/*  68 */       int i = c - this.bufferInputStream.available();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  76 */       if (i < this.transferBuffer.length) {
/*     */         return;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       int j = this.source.read(this.transferBuffer);
/*  84 */       if (j == -1) {
/*     */         
/*  86 */         this.sourceEnded = true;
/*  87 */         this.bufferOutputStream.close();
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */ 
/*     */       
/*  94 */       this.totalBytesRead += j;
/*  95 */       this.bufferOutputStream.write(this.transferBuffer, 0, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() {
/*     */     try {
/* 104 */       if (this.bufferInputStream.available() == 0 && !this.sourceEnded)
/*     */       {
/* 106 */         l.d("Exhausted stream");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 111 */       return this.bufferInputStream.read();
/*     */     }
/* 113 */     catch (IOException iOException) {
/*     */       
/* 115 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*     */     try {
/* 125 */       if (this.bufferInputStream.available() == 0 && !this.sourceEnded)
/*     */       {
/* 127 */         l.d("Exhausted stream");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 132 */       return this.bufferInputStream.read(paramArrayOfbyte, paramInt1, paramInt2);
/*     */     }
/* 134 */     catch (IOException iOException) {
/*     */       
/* 136 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte) {
/* 142 */     return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 149 */     this.isClosed = true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\ThreadedWrappingAudioInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
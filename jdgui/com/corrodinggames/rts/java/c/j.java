/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.concurrent.LinkedBlockingDeque;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */   extends InputStream
/*     */ {
/*  41 */   LinkedBlockingDeque a = new LinkedBlockingDeque();
/*     */ 
/*     */   
/*     */   boolean b = true;
/*     */ 
/*     */   
/*     */   public j(i parami) {}
/*     */ 
/*     */   
/*     */   public void a(byte[] paramArrayOfbyte) {
/*  51 */     ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
/*     */     
/*  53 */     this.a.add(byteBuffer);
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
/*  72 */   byte[] c = new byte[1];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() {
/*     */     int k;
/*     */     do {
/*  81 */       k = read(this.c, 0, 1);
/*  82 */     } while (k <= 0);
/*     */     
/*  84 */     return this.c[0] & 0xFF;
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
/*     */   public int read(byte[] paramArrayOfbyte) {
/*  97 */     return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 103 */     if (this.d.b)
/*     */     {
/* 105 */       throw new IOException("closed");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     int k = 0;
/*     */     
/* 153 */     int m = paramInt2;
/* 154 */     int n = paramInt1;
/*     */     while (true) {
/*     */       ByteBuffer byteBuffer;
/*     */       int i1;
/* 158 */       if (this.d.b)
/*     */       {
/* 160 */         throw new IOException("Closed");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 166 */         byteBuffer = this.a.take();
/*     */       }
/* 168 */       catch (InterruptedException interruptedException) {
/*     */         
/* 170 */         interruptedException.printStackTrace();
/* 171 */         return k;
/*     */       } 
/* 173 */       if (byteBuffer == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 178 */       if (this.b) {
/*     */         
/* 180 */         this.b = false;
/* 181 */         l.d("First packet from:" + this.d.e);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 187 */       if (byteBuffer.remaining() <= m) {
/*     */         
/* 189 */         i1 = byteBuffer.remaining();
/* 190 */         byteBuffer.get(paramArrayOfbyte, n, i1);
/*     */       }
/*     */       else {
/*     */         
/* 194 */         i1 = m;
/*     */         
/* 196 */         byteBuffer.get(paramArrayOfbyte, n, m);
/*     */         
/* 198 */         this.a.addFirst(byteBuffer);
/*     */       } 
/*     */       
/* 201 */       k += i1;
/* 202 */       m -= i1;
/* 203 */       n += i1;
/*     */       
/* 205 */       if (m < 0)
/*     */       {
/* 207 */         throw new IOException("bytesNeeded<0:" + m);
/*     */       }
/*     */       
/* 210 */       if (m == 0)
/*     */         break; 
/* 212 */     }  return k;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
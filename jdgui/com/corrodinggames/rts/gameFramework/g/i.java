/*     */ package com.corrodinggames.rts.gameFramework.g;
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
/*     */ public class i
/*     */   extends InputStream
/*     */ {
/*  33 */   LinkedBlockingDeque a = new LinkedBlockingDeque();
/*     */ 
/*     */   
/*     */   boolean b = true;
/*     */ 
/*     */   
/*     */   public i(h paramh) {}
/*     */ 
/*     */   
/*     */   public void a(byte[] paramArrayOfbyte) {
/*  43 */     ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
/*     */     
/*  45 */     this.a.add(byteBuffer);
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
/*  64 */   byte[] c = new byte[1];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() {
/*     */     int j;
/*     */     do {
/*  73 */       j = read(this.c, 0, 1);
/*  74 */     } while (j <= 0);
/*     */     
/*  76 */     return this.c[0] & 0xFF;
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
/*  89 */     return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  95 */     if (this.d.c)
/*     */     {
/*  97 */       throw new IOException("closed");
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
/* 143 */     int j = 0;
/*     */     
/* 145 */     int k = paramInt2;
/* 146 */     int m = paramInt1;
/*     */     while (true) {
/*     */       ByteBuffer byteBuffer;
/*     */       int n;
/* 150 */       if (this.d.c)
/*     */       {
/* 152 */         throw new IOException("Closed");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 158 */         byteBuffer = this.a.take();
/*     */       }
/* 160 */       catch (InterruptedException interruptedException) {
/*     */         
/* 162 */         interruptedException.printStackTrace();
/* 163 */         return j;
/*     */       } 
/* 165 */       if (byteBuffer == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 170 */       if (this.b) {
/*     */         
/* 172 */         this.b = false;
/* 173 */         l.d("First packet from forwarded:" + this.d.b);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 178 */       if (byteBuffer.remaining() <= k) {
/*     */         
/* 180 */         n = byteBuffer.remaining();
/* 181 */         byteBuffer.get(paramArrayOfbyte, m, n);
/*     */       }
/*     */       else {
/*     */         
/* 185 */         n = k;
/*     */         
/* 187 */         byteBuffer.get(paramArrayOfbyte, m, k);
/*     */         
/* 189 */         this.a.addFirst(byteBuffer);
/*     */       } 
/*     */       
/* 192 */       j += n;
/* 193 */       k -= n;
/* 194 */       m += n;
/*     */       
/* 196 */       if (k < 0)
/*     */       {
/* 198 */         throw new IOException("bytesNeeded<0:" + k);
/*     */       }
/*     */       
/* 201 */       if (k == 0)
/*     */         break; 
/* 203 */     }  return j;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package a.a;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class q
/*     */   extends OutputStream
/*     */ {
/*     */   protected h a;
/*     */   protected byte[] b;
/*     */   protected int c;
/*     */   
/*     */   public q(h paramh) {
/*  55 */     if (paramh == null) {
/*  56 */       throw new NullPointerException("sock");
/*     */     }
/*     */     
/*  59 */     this.a = paramh;
/*  60 */     this.b = new byte[this.a.getSendBufferSize()];
/*  61 */     this.c = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void write(int paramInt) {
/*  67 */     if (this.c >= this.b.length) {
/*  68 */       flush();
/*     */     }
/*     */     
/*  71 */     this.b[this.c++] = (byte)(paramInt & 0xFF);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void write(byte[] paramArrayOfbyte) {
/*  77 */     write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  83 */     if (paramArrayOfbyte == null) {
/*  84 */       throw new NullPointerException();
/*     */     }
/*     */     
/*  87 */     if (paramInt1 < 0 || paramInt2 < 0 || paramInt1 + paramInt2 > paramArrayOfbyte.length) {
/*  88 */       throw new IndexOutOfBoundsException();
/*     */     }
/*     */ 
/*     */     
/*  92 */     int i = 0;
/*     */     
/*  94 */     while (i < paramInt2) {
/*  95 */       int j = Math.min(this.b.length, paramInt2 - i);
/*  96 */       if (j > this.b.length - this.c) {
/*  97 */         flush();
/*     */       }
/*  99 */       System.arraycopy(paramArrayOfbyte, paramInt1 + i, this.b, this.c, j);
/* 100 */       this.c += j;
/* 101 */       i += j;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void flush() {
/* 108 */     if (this.c > 0) {
/* 109 */       this.a.a(this.b, 0, this.c);
/* 110 */       this.c = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void close() {
/* 117 */     flush();
/* 118 */     this.a.shutdownOutput();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
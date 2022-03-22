/*     */ package a.a;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class o
/*     */   extends InputStream
/*     */ {
/*     */   protected h a;
/*     */   protected byte[] b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   
/*     */   public o(h paramh) {
/*  55 */     if (paramh == null) {
/*  56 */       throw new NullPointerException("sock");
/*     */     }
/*     */     
/*  59 */     this.a = paramh;
/*  60 */     this.b = new byte[this.a.getReceiveBufferSize()];
/*  61 */     this.c = this.d = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int read() {
/*  67 */     if (a() < 0) {
/*  68 */       return -1;
/*     */     }
/*     */     
/*  71 */     return this.b[this.c++] & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int read(byte[] paramArrayOfbyte) {
/*  77 */     return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  83 */     if (paramArrayOfbyte == null) {
/*  84 */       throw new NullPointerException();
/*     */     }
/*     */     
/*  87 */     if (paramInt1 < 0 || paramInt2 < 0 || paramInt1 + paramInt2 > paramArrayOfbyte.length) {
/*  88 */       throw new IndexOutOfBoundsException();
/*     */     }
/*     */     
/*  91 */     if (a() < 0) {
/*  92 */       return -1;
/*     */     }
/*     */     
/*  95 */     int i = Math.min(available(), paramInt2);
/*  96 */     System.arraycopy(this.b, this.c, paramArrayOfbyte, paramInt1, i);
/*  97 */     this.c += i;
/*     */     
/*  99 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized int available() {
/* 104 */     return this.d - this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean markSupported() {
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 115 */     this.a.shutdownInput();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int a() {
/* 121 */     if (available() == 0) {
/* 122 */       this.d = this.a.b(this.b, 0, this.b.length);
/* 123 */       this.c = 0;
/*     */     } 
/*     */     
/* 126 */     return this.d;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
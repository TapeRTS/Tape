/*     */ package a.a;
/*     */ 
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class r
/*     */ {
/*  60 */   public static final r a = new r();
/*     */   
/*     */   private int b;
/*     */   
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*     */   
/*     */   public r() {
/*     */     try {
/*  77 */       a(32, 32, 300, 70, 0, 3, 3, 3, 2000, 600, 300);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  89 */     catch (IOException iOException) {
/*     */       
/*  91 */       throw new RuntimeException("IOException on ReliableSocketProfile default:" + iOException);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public r(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11) {
/* 124 */     a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
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
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11) {
/* 149 */     a("maxSendQueueSize", paramInt1, 1, 255);
/* 150 */     a("maxRecvQueueSize", paramInt2, 1, 255);
/* 151 */     a("maxSegmentSize", paramInt3, 22, 6535);
/* 152 */     a("maxOutstandingSegs", paramInt4, 1, 255);
/* 153 */     a("maxRetrans", paramInt5, 0, 255);
/* 154 */     a("maxCumulativeAcks", paramInt6, 0, 255);
/* 155 */     a("maxOutOfSequence", paramInt7, 0, 255);
/* 156 */     a("maxAutoReset", paramInt8, 0, 255);
/* 157 */     a("nullSegmentTimeout", paramInt9, 0, 65535);
/* 158 */     a("retransmissionTimeout", paramInt10, 100, 65535);
/* 159 */     a("cumulativeAckTimeout", paramInt11, 100, 65535);
/*     */     
/* 161 */     this.b = paramInt1;
/* 162 */     this.c = paramInt2;
/* 163 */     this.d = paramInt3;
/* 164 */     this.e = paramInt4;
/* 165 */     this.f = paramInt5;
/* 166 */     this.g = paramInt6;
/* 167 */     this.h = paramInt7;
/* 168 */     this.i = paramInt8;
/* 169 */     this.j = paramInt9;
/* 170 */     this.k = paramInt10;
/* 171 */     this.l = paramInt11;
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
/*     */   public int a() {
/* 196 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/* 204 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 212 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 220 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int e() {
/* 228 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int f() {
/* 236 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int g() {
/* 244 */     return this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int h() {
/* 252 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int i() {
/* 260 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 265 */     StringBuilder stringBuilder = new StringBuilder();
/* 266 */     stringBuilder.append("[");
/* 267 */     stringBuilder.append(this.b).append(", ");
/* 268 */     stringBuilder.append(this.c).append(", ");
/* 269 */     stringBuilder.append(this.d).append(", ");
/* 270 */     stringBuilder.append(this.e).append(", ");
/* 271 */     stringBuilder.append(this.f).append(", ");
/* 272 */     stringBuilder.append(this.g).append(", ");
/* 273 */     stringBuilder.append(this.h).append(", ");
/* 274 */     stringBuilder.append(this.i).append(", ");
/* 275 */     stringBuilder.append(this.j).append(", ");
/* 276 */     stringBuilder.append(this.k).append(", ");
/* 277 */     stringBuilder.append(this.l);
/* 278 */     stringBuilder.append("]");
/* 279 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 287 */     if (paramInt1 < paramInt2 || paramInt1 > paramInt3)
/* 288 */       throw new IOException(paramString + " out of range"); 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
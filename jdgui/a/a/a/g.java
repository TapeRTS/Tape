/*     */ package a.a.a;
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
/*     */ 
/*     */ public class g
/*     */   extends h
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   
/*     */   protected g() {}
/*     */   
/*     */   public g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
/*  77 */     a(-128, paramInt1, 22);
/*     */     
/*  79 */     this.a = 1;
/*  80 */     this.b = paramInt2;
/*  81 */     this.c = 1;
/*  82 */     this.d = paramInt3;
/*  83 */     this.e = paramInt4;
/*  84 */     this.f = paramInt5;
/*  85 */     this.g = paramInt6;
/*  86 */     this.h = paramInt7;
/*  87 */     this.i = paramInt8;
/*  88 */     this.j = paramInt9;
/*  89 */     this.k = paramInt10;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  94 */     return "SYN";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 104 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int e() {
/* 114 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 119 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 124 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 129 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 134 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j() {
/* 139 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 144 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/* 149 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] d() {
/* 154 */     byte[] arrayOfByte = super.d();
/* 155 */     arrayOfByte[4] = (byte)(this.a << 4 & 0xFF);
/* 156 */     arrayOfByte[5] = (byte)(this.b & 0xFF);
/* 157 */     arrayOfByte[6] = (byte)(this.c & 0xFF);
/* 158 */     arrayOfByte[7] = 0;
/* 159 */     arrayOfByte[8] = (byte)(this.d >>> 8 & 0xFF);
/* 160 */     arrayOfByte[9] = (byte)(this.d >>> 0 & 0xFF);
/* 161 */     arrayOfByte[10] = (byte)(this.e >>> 8 & 0xFF);
/* 162 */     arrayOfByte[11] = (byte)(this.e >>> 0 & 0xFF);
/* 163 */     arrayOfByte[12] = (byte)(this.f >>> 8 & 0xFF);
/* 164 */     arrayOfByte[13] = (byte)(this.f >>> 0 & 0xFF);
/* 165 */     arrayOfByte[14] = (byte)(this.g >>> 8 & 0xFF);
/* 166 */     arrayOfByte[15] = (byte)(this.g >>> 0 & 0xFF);
/* 167 */     arrayOfByte[16] = (byte)(this.h & 0xFF);
/* 168 */     arrayOfByte[17] = (byte)(this.i & 0xFF);
/* 169 */     arrayOfByte[18] = (byte)(this.j & 0xFF);
/* 170 */     arrayOfByte[19] = (byte)(this.k & 0xFF);
/*     */     
/* 172 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 177 */     super.a(paramArrayOfbyte, paramInt1, paramInt2);
/*     */     
/* 179 */     if (paramInt2 < 22) {
/* 180 */       throw new IOException("Invalid SYN segment");
/*     */     }
/*     */     
/* 183 */     this.a = (paramArrayOfbyte[paramInt1 + 4] & 0xFF) >>> 4;
/* 184 */     if (this.a != 1) {
/* 185 */       throw new IOException("Invalid RUDP version:" + this.a);
/*     */     }
/*     */     
/* 188 */     this.b = paramArrayOfbyte[paramInt1 + 5] & 0xFF;
/* 189 */     this.c = paramArrayOfbyte[paramInt1 + 6] & 0xFF;
/*     */     
/* 191 */     this.d = (paramArrayOfbyte[paramInt1 + 8] & 0xFF) << 8 | (paramArrayOfbyte[paramInt1 + 9] & 0xFF) << 0;
/* 192 */     this.e = (paramArrayOfbyte[paramInt1 + 10] & 0xFF) << 8 | (paramArrayOfbyte[paramInt1 + 11] & 0xFF) << 0;
/* 193 */     this.f = (paramArrayOfbyte[paramInt1 + 12] & 0xFF) << 8 | (paramArrayOfbyte[paramInt1 + 13] & 0xFF) << 0;
/* 194 */     this.g = (paramArrayOfbyte[paramInt1 + 14] & 0xFF) << 8 | (paramArrayOfbyte[paramInt1 + 15] & 0xFF) << 0;
/* 195 */     this.h = paramArrayOfbyte[paramInt1 + 16] & 0xFF;
/* 196 */     this.i = paramArrayOfbyte[paramInt1 + 17] & 0xFF;
/* 197 */     this.j = paramArrayOfbyte[paramInt1 + 18] & 0xFF;
/* 198 */     this.k = paramArrayOfbyte[paramInt1 + 19] & 0xFF;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
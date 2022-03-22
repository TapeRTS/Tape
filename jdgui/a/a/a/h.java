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
/*     */ public abstract class h
/*     */ {
/*  51 */   private int e = 0;
/*  52 */   private int d = -1;
/*     */   
/*     */   private int c;
/*     */   
/*     */   private int b;
/*     */   
/*     */   private int a;
/*     */ 
/*     */   
/*     */   public abstract String a();
/*     */   
/*     */   public int m() {
/*  64 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  69 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/*  74 */     this.a |= 0x40;
/*  75 */     this.d = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public int n() {
/*  80 */     if ((this.a & 0x40) == 64) {
/*  81 */       return this.d;
/*     */     }
/*     */     
/*  84 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int o() {
/*  89 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int paramInt) {
/*  94 */     this.e = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] d() {
/*  99 */     byte[] arrayOfByte = new byte[b()];
/*     */     
/* 101 */     arrayOfByte[0] = (byte)(this.a & 0xFF);
/* 102 */     arrayOfByte[1] = (byte)(this.b & 0xFF);
/* 103 */     arrayOfByte[2] = (byte)(this.c & 0xFF);
/* 104 */     arrayOfByte[3] = (byte)(this.d & 0xFF);
/*     */     
/* 106 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 111 */     return a() + " [ SEQ = " + 
/*     */       
/* 113 */       m() + ", ACK = " + (
/* 114 */       (n() >= 0) ? ("" + n()) : "N/A") + ", LEN = " + 
/* 115 */       b() + " ]";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static h b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*     */     b b;
/* 126 */     g g = null;
/*     */     
/* 128 */     if (paramInt2 < 6) {
/* 129 */       throw new IOException("Invalid segment:" + paramInt2);
/*     */     }
/*     */     
/* 132 */     byte b1 = paramArrayOfbyte[paramInt1];
/* 133 */     if ((b1 & Byte.MIN_VALUE) != 0) {
/* 134 */       g = new g();
/*     */     }
/* 136 */     else if ((b1 & 0x8) != 0) {
/* 137 */       e e = new e();
/*     */     }
/* 139 */     else if ((b1 & 0x20) != 0) {
/* 140 */       c c = new c();
/*     */     }
/* 142 */     else if ((b1 & 0x10) != 0) {
/* 143 */       f f = new f();
/*     */     }
/* 145 */     else if ((b1 & 0x2) != 0) {
/* 146 */       d d = new d();
/*     */     }
/* 148 */     else if ((b1 & 0x40) != 0) {
/* 149 */       if (paramInt2 == 6) {
/* 150 */         a a = new a();
/*     */       } else {
/*     */         
/* 153 */         b = new b();
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     if (b == null) {
/* 158 */       throw new IOException("Invalid segment");
/*     */     }
/*     */     
/* 161 */     b.a(paramArrayOfbyte, paramInt1, paramInt2);
/* 162 */     return b;
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
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/* 182 */     this.a = paramInt1;
/* 183 */     this.c = paramInt2;
/* 184 */     this.b = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 189 */     this.a = paramArrayOfbyte[paramInt1] & 0xFF;
/* 190 */     this.b = paramArrayOfbyte[paramInt1 + 1] & 0xFF;
/* 191 */     this.c = paramArrayOfbyte[paramInt1 + 2] & 0xFF;
/* 192 */     this.d = paramArrayOfbyte[paramInt1 + 3] & 0xFF;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\a\a\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
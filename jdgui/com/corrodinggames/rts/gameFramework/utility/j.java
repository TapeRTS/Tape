/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.AssetFileDescriptor;
/*     */ import android.content.res.AssetManager;
/*     */ import com.corrodinggames.rts.a.c;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.File;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.FileInputStream;
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
/*     */ public class j
/*     */   extends InputStream
/*     */ {
/*     */   InputStream a;
/*     */   String b;
/*     */   String c;
/*     */   
/*     */   public boolean a() {
/*  42 */     if (this.a instanceof FileInputStream)
/*     */     {
/*  44 */       return true;
/*     */     }
/*     */     
/*  47 */     if (!l.al())
/*     */     {
/*  49 */       if (this.c != null)
/*     */       {
/*  51 */         return true;
/*     */       }
/*     */     }
/*     */     
/*  55 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FileDescriptor b() {
/*  61 */     if (this.a instanceof FileInputStream) {
/*     */       
/*  63 */       FileInputStream fileInputStream = (FileInputStream)this.a;
/*     */       
/*  65 */       return fileInputStream.getFD();
/*     */     } 
/*     */     
/*  68 */     if (!l.al())
/*     */     {
/*  70 */       if (this.c != null) {
/*     */         
/*  72 */         Context context = c.a();
/*  73 */         AssetManager assetManager = context.d();
/*     */         
/*  75 */         AssetFileDescriptor assetFileDescriptor = assetManager.b(this.c);
/*     */         
/*  77 */         return assetFileDescriptor.getFileDescriptor();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*  82 */     throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private j() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j(InputStream paramInputStream, String paramString1, String paramString2) {
/*  99 */     this.a = paramInputStream;
/* 100 */     this.b = paramString1;
/* 101 */     this.c = paramString2;
/*     */   }
/*     */ 
/*     */   
/*     */   public j(FileInputStream paramFileInputStream, String paramString) {
/* 106 */     this.a = paramFileInputStream;
/* 107 */     this.b = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public j(InputStream paramInputStream, String paramString) {
/* 113 */     this.a = paramInputStream;
/* 114 */     this.b = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long c() {
/* 124 */     if (!l.al())
/*     */     {
/* 126 */       return -1L;
/*     */     }
/* 128 */     if (this.b == null)
/*     */     {
/* 130 */       return -2L;
/*     */     }
/*     */     
/* 133 */     File file = new File(this.b);
/* 134 */     return file.lastModified();
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/* 139 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int available() {
/* 145 */     return this.a.available();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 151 */     this.a.close();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 157 */     return this.a.equals(paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 163 */     return this.a.hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void mark(int paramInt) {
/* 169 */     this.a.mark(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean markSupported() {
/* 175 */     return this.a.markSupported();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read() {
/* 181 */     return this.a.read();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 188 */     return this.a.read(paramArrayOfbyte, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte) {
/* 194 */     return this.a.read(paramArrayOfbyte);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset() {
/* 200 */     this.a.reset();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long skip(long paramLong) {
/* 206 */     return this.a.skip(paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 212 */     return this.a.toString();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.java.audio.a;
/*     */ 
/*     */ import java.io.Closeable;
/*     */ import java.io.InputStream;
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
/*     */ public final class s
/*     */ {
/*  31 */   public static final byte[] a = new byte[0];
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(InputStream paramInputStream, OutputStream paramOutputStream) {
/*  36 */     a(paramInputStream, paramOutputStream, new byte[4096]);
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
/*     */   public static void a(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfbyte) {
/*     */     int i;
/*  49 */     while ((i = paramInputStream.read(paramArrayOfbyte)) != -1) {
/*  50 */       paramOutputStream.write(paramArrayOfbyte, 0, i);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] a(InputStream paramInputStream, int paramInt) {
/*  91 */     t t = new t(Math.max(0, paramInt));
/*  92 */     a(paramInputStream, t);
/*  93 */     return t.toByteArray();
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
/*     */   public static void a(Closeable paramCloseable) {
/* 123 */     if (paramCloseable != null)
/*     */       try {
/* 125 */         paramCloseable.close();
/* 126 */       } catch (Throwable throwable) {} 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\a\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
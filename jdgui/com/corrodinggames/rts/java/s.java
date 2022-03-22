/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import org.newdawn.slick.Image;
/*     */ import org.newdawn.slick.opengl.ImageData;
/*     */ import org.newdawn.slick.opengl.Texture;
/*     */ import org.newdawn.slick.util.MiscUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class s
/*     */   implements ImageData
/*     */ {
/*     */   int a;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private byte[] g;
/*     */   
/*     */   public s(r paramr, Image paramImage) {
/*  59 */     Texture texture = paramImage.getTexture();
/*  60 */     this.g = texture.getTextureData();
/*     */ 
/*     */     
/*  63 */     this.a = texture.hasAlpha() ? 32 : 24;
/*  64 */     this.c = texture.getImageWidth();
/*  65 */     this.d = texture.getImageHeight();
/*  66 */     this.e = texture.getTextureWidth();
/*  67 */     this.f = texture.getTextureHeight();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getDepth() {
/*  72 */     return this.a;
/*     */   }
/*     */   
/*     */   public int getWidth() {
/*  76 */     return this.c;
/*     */   }
/*     */   
/*     */   public int getHeight() {
/*  80 */     return this.d;
/*     */   }
/*     */   
/*     */   public int getTexWidth() {
/*  84 */     return this.e;
/*     */   }
/*     */   
/*     */   public int getTexHeight() {
/*  88 */     return this.f;
/*     */   }
/*     */   
/*     */   public ByteBuffer getImageBufferData() {
/*  92 */     ByteBuffer byteBuffer = MiscUtils.createByteBuffer(this.g.length);
/*  93 */     byteBuffer.put(this.g);
/*  94 */     byteBuffer.flip();
/*  95 */     return byteBuffer;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] a() {
/* 100 */     return this.g;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
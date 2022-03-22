/*    */ package com.corrodinggames.rts.java.a;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import org.newdawn.slick.opengl.ImageData;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements ImageData
/*    */ {
/*    */   ImageData a;
/*    */   ByteBuffer b;
/*    */   
/*    */   public a(ImageData paramImageData, ByteBuffer paramByteBuffer) {
/* 16 */     this.a = paramImageData;
/* 17 */     this.b = paramByteBuffer;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDepth() {
/* 23 */     return this.a.getDepth();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getHeight() {
/* 29 */     return this.a.getHeight();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ByteBuffer getImageBufferData() {
/* 35 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getTexHeight() {
/* 41 */     return this.a.getTexHeight();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getTexWidth() {
/* 47 */     return this.a.getTexWidth();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getWidth() {
/* 53 */     return this.a.getWidth();
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
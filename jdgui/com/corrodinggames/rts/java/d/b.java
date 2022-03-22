/*     */ package com.corrodinggames.rts.java.d;
/*     */ 
/*     */ import com.corrodinggames.librocket.c;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.u;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import com.corrodinggames.rts.java.e;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import org.newdawn.slick.Image;
/*     */ import org.newdawn.slick.ImageBuffer;
/*     */ import org.newdawn.slick.SlickException;
/*     */ import org.newdawn.slick.opengl.ImageData;
/*     */ import org.newdawn.slick.opengl.PNGImageData;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends c
/*     */ {
/*     */   Image h;
/*     */   boolean i;
/*     */   ImageBuffer j;
/*     */   
/*     */   public b(a parama) {
/* 465 */     super(parama);
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
/*     */   public boolean a() {
/*     */     FileInputStream fileInputStream;
/* 479 */     if (ae.c(this.a)) {
/*     */       
/* 481 */       j j = ae.b(this.a, true);
/*     */       
/* 483 */       if (j == null) {
/*     */         
/* 485 */         l.f("Failed to open zipped file: " + this.a);
/* 486 */         return false;
/*     */       } 
/*     */     } else {
/*     */ 
/*     */       
/*     */       try {
/*     */ 
/*     */         
/* 494 */         fileInputStream = new FileInputStream(this.a);
/*     */       }
/* 496 */       catch (IOException iOException) {
/*     */         
/* 498 */         iOException.printStackTrace();
/* 499 */         return false;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 506 */       BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
/* 507 */       PNGImageData pNGImageData = new PNGImageData();
/* 508 */       pNGImageData.loadImage(bufferedInputStream);
/* 509 */       bufferedInputStream.close();
/*     */       
/* 511 */       this.h = new Image((ImageData)pNGImageData);
/*     */     }
/* 513 */     catch (OutOfMemoryError outOfMemoryError) {
/*     */       
/* 515 */       l.a(u.g, outOfMemoryError);
/* 516 */       this.h = e.k.z();
/* 517 */       this.i = true;
/*     */     
/*     */     }
/* 520 */     catch (IOException iOException) {
/*     */ 
/*     */ 
/*     */       
/* 524 */       l.a("Exception loading image: " + this.a, iOException);
/* 525 */       this.h = e.l.z();
/* 526 */       this.i = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 532 */     this.width = this.h.getWidth();
/* 533 */     this.height = this.h.getHeight();
/*     */ 
/*     */ 
/*     */     
/* 537 */     if (this.c)
/*     */     {
/* 539 */       if (this.width > 500 || this.height > 500) {
/*     */         
/* 541 */         l.d("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
/*     */         
/* 543 */         this.h = e.m.z();
/* 544 */         this.i = true;
/*     */         
/* 546 */         this.width = this.h.getWidth();
/* 547 */         this.height = this.h.getHeight();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 553 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void remove() {
/* 559 */     if (this.h != null && !this.i) {
/*     */       
/*     */       try {
/*     */         
/* 563 */         this.h.destroy();
/*     */       }
/* 565 */       catch (SlickException slickException) {
/*     */         
/* 567 */         slickException.printStackTrace();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 572 */     this.a = null;
/* 573 */     this.j = null;
/* 574 */     this.h = null;
/* 575 */     this.i = false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\d\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
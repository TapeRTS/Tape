/*     */ package com.corrodinggames.rts.java.d;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.LibRocket;
/*     */ import com.corrodinggames.librocket.b;
/*     */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.u;
/*     */ import org.newdawn.slick.Color;
/*     */ import org.newdawn.slick.Graphics;
/*     */ import org.newdawn.slick.Image;
/*     */ import org.newdawn.slick.ImageBuffer;
/*     */ import org.newdawn.slick.opengl.ImageData;
/*     */ import org.newdawn.slick.opengl.Texture;
/*     */ import org.newdawn.slick.opengl.TextureImpl;
/*     */ import org.newdawn.slick.opengl.renderer.Renderer;
/*     */ import org.newdawn.slick.opengl.renderer.SGL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends b
/*     */ {
/*  68 */   private static SGL j = Renderer.get();
/*     */ 
/*     */   
/*     */   Graphics i;
/*     */ 
/*     */   
/*     */   public void a() {
/*  75 */     throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Graphics paramGraphics) {
/*  80 */     this.i = paramGraphics;
/*     */     
/*  82 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean GenerateTexture(int paramInt, byte[] paramArrayOfbyte) {
/*     */     try {
/*  94 */       b b1 = (b)findTextureHolder(paramInt);
/*     */ 
/*     */ 
/*     */       
/*  98 */       ImageBuffer imageBuffer = new ImageBuffer(b1.width, b1.height);
/*     */       
/* 100 */       byte[] arrayOfByte = imageBuffer.getRGBA();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       for (byte b2 = 0; b2 < paramArrayOfbyte.length; b2++)
/*     */       {
/* 108 */         arrayOfByte[b2] = paramArrayOfbyte[b2];
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 115 */       b1.h = new Image((ImageData)imageBuffer);
/* 116 */       if (b1.h == null)
/*     */       {
/* 118 */         throw new RuntimeException("slickTextureHolder.image==null");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 128 */     catch (OutOfMemoryError outOfMemoryError) {
/*     */       
/* 130 */       l.a(u.g, outOfMemoryError);
/*     */       
/* 132 */       return false;
/*     */     }
/* 134 */     catch (Throwable throwable) {
/*     */ 
/*     */       
/* 137 */       ScriptEngine.throwDelayedException("GenerateTexture Failed", throwable);
/* 138 */       return true;
/*     */     } 
/*     */     
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void RenderGeometryPossiblyCompiled(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt, float paramFloat1, float paramFloat2, LibRocket.CompiledGeometry paramCompiledGeometry) {
/*     */     try {
/* 151 */       if (this.debug) {
/*     */         
/* 153 */         System.out.println("SlickLibRocket:RenderGeometry(" + paramArrayOffloat1.length + "," + paramInt + ")");
/* 154 */         System.out.println("indices.length=" + paramArrayOfint2.length + "");
/*     */       } 
/*     */ 
/*     */       
/* 158 */       b b1 = null;
/* 159 */       if (paramInt != 0)
/*     */       {
/* 161 */         b1 = (b)findTextureHolder(paramInt);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 166 */       RectF rectF1 = null;
/* 167 */       if (paramCompiledGeometry != null)
/*     */       {
/* 169 */         rectF1 = (RectF)paramCompiledGeometry.bbox;
/*     */       }
/*     */       
/* 172 */       if (rectF1 == null) {
/*     */         
/* 174 */         rectF1 = new RectF();
/* 175 */         for (byte b3 = 0; b3 < paramArrayOfint2.length; b3 += 3) {
/*     */           
/* 177 */           int i = paramArrayOfint2[b3];
/*     */           
/* 179 */           for (byte b4 = 0; b4 <= 2; b4++) {
/*     */             
/* 181 */             i = paramArrayOfint2[b3 + b4];
/*     */             
/* 183 */             float f4 = paramArrayOffloat1[i * 2 + 0];
/* 184 */             float f5 = paramArrayOffloat1[i * 2 + 1];
/*     */             
/* 186 */             if (rectF1.a()) {
/*     */               
/* 188 */               rectF1.a(f4, f5, f4 + 1.0F, f5 + 1.0F);
/*     */             }
/*     */             else {
/*     */               
/* 192 */               rectF1.c(f4, f5);
/*     */             } 
/*     */           } 
/*     */         } 
/* 196 */         rectF1.g();
/*     */         
/* 198 */         if (paramCompiledGeometry != null)
/*     */         {
/* 200 */           paramCompiledGeometry.bbox = rectF1;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 205 */       RectF rectF2 = new RectF(rectF1);
/*     */       
/* 207 */       rectF2.a(paramFloat1, paramFloat2);
/*     */       
/* 209 */       if (this.g)
/*     */       {
/*     */         
/* 212 */         if (!f.a(rectF2, this.f)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 220 */           boolean bool2 = true;
/*     */           
/* 222 */           if (b1 != null)
/*     */           {
/* 224 */             if (b1.h == null && b1.b && b1.f == null)
/*     */             {
/* 226 */               bool2 = false;
/*     */             }
/*     */           }
/*     */ 
/*     */           
/* 231 */           if (bool2) {
/*     */             return;
/*     */           }
/*     */         } 
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 241 */       if (b1 != null)
/*     */       {
/* 243 */         if (b1.j != null) {
/*     */           
/* 245 */           System.out.println("Loading image for: " + b1.index);
/*     */ 
/*     */           
/* 248 */           b1.h = new Image((ImageData)b1.j);
/* 249 */           if (b1.h == null)
/*     */           {
/* 251 */             throw new RuntimeException("slickTextureHolder.image==null");
/*     */           }
/*     */           
/* 254 */           b1.j = null;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 259 */       this.i.pushTransform();
/*     */ 
/*     */       
/* 262 */       this.i.setDrawMode(Graphics.MODE_NORMAL);
/*     */       
/* 264 */       this.i.translate(paramFloat1, paramFloat2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 280 */       float f1 = 1.0F;
/* 281 */       float f2 = 1.0F;
/*     */       
/* 283 */       boolean bool = false;
/* 284 */       float f3 = 1.0F;
/*     */ 
/*     */       
/* 287 */       boolean bool1 = false;
/*     */ 
/*     */       
/* 290 */       Texture texture = null;
/* 291 */       if (b1 != null) {
/*     */         
/* 293 */         bool = b1.d;
/* 294 */         f3 = b1.e;
/*     */ 
/*     */         
/* 297 */         texture = TextureImpl.getLastBind();
/*     */         
/* 299 */         if (b1.h == null && b1.b)
/*     */         {
/* 301 */           if (b1.f != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 308 */             float f = (l.u()).bj / 1000.0F / 10.0F * 360.0F % 360.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 314 */             this.i.translate(-paramFloat1, -paramFloat2);
/*     */ 
/*     */ 
/*     */             
/* 318 */             Rect rect = new Rect(this.e.a, this.e.b, this.e.c, this.e.d);
/*     */             
/* 320 */             (l.u()).bw.a(rect);
/*     */ 
/*     */ 
/*     */             
/* 324 */             m m = m.n(0);
/*     */             
/* 326 */             if (m == null)
/*     */             {
/* 328 */               m = m.g;
/*     */             }
/*     */             
/* 331 */             ak.a(b1.f, rectF2.d(), rectF2.e(), f, 3.0F, m, rectF2
/* 332 */                 .c() * 0.6F, rectF2.c(), false, false, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 339 */             f3 = 0.0F;
/*     */ 
/*     */           
/*     */           }
/* 343 */           else if (this.d < 1) {
/*     */ 
/*     */ 
/*     */             
/* 347 */             b1.a();
/*     */ 
/*     */             
/* 350 */             this.d++;
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/* 355 */         if (b1.h != null) {
/*     */           
/* 357 */           b1.h.getTexture().bind();
/* 358 */           f1 = b1.h.getTextureWidth();
/* 359 */           f2 = b1.h.getTextureHeight();
/* 360 */           bool1 = true;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 366 */         else if (b1.b) {
/*     */           
/* 368 */           f3 = 0.1F;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 375 */       if (!bool1)
/*     */       {
/*     */         
/* 378 */         TextureImpl.bindNone();
/*     */       }
/*     */ 
/*     */       
/* 382 */       Color color = new Color(1.0F, 1.0F, 1.0F, f3);
/* 383 */       this.i.setColor(color);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 388 */       j.glBegin(4);
/*     */       
/* 390 */       for (byte b2 = 0; b2 < paramArrayOfint2.length; b2 += 3) {
/*     */ 
/*     */ 
/*     */         
/* 394 */         int i = paramArrayOfint2[b2];
/*     */         
/* 396 */         if (!bool) {
/*     */ 
/*     */           
/* 399 */           int j = paramArrayOfint1[i];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 405 */           color.r = (j >> 24 & 0xFF) / 255.0F;
/* 406 */           color.g = (j >> 16 & 0xFF) / 255.0F;
/* 407 */           color.b = (j >> 8 & 0xFF) / 255.0F;
/* 408 */           color.a = (j & 0xFF) / 255.0F;
/*     */           
/* 410 */           color.a *= f3;
/*     */ 
/*     */ 
/*     */           
/* 414 */           color.bind();
/*     */         } 
/*     */ 
/*     */         
/* 418 */         for (byte b3 = 0; b3 <= 2; b3++) {
/*     */           
/* 420 */           i = paramArrayOfint2[b2 + b3];
/*     */           
/* 422 */           j.glTexCoord2f(paramArrayOffloat2[i * 2 + 0] * f1, paramArrayOffloat2[i * 2 + 1] * f2);
/* 423 */           j.glVertex2f(paramArrayOffloat1[i * 2 + 0], paramArrayOffloat1[i * 2 + 1]);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 428 */       j.glEnd();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 441 */       this.i.popTransform();
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 446 */     catch (Throwable throwable) {
/*     */ 
/*     */       
/* 449 */       ScriptEngine.throwDelayedException("UI Render Failed", throwable);
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
/*     */   public LibRocket.TextureHolder getFromTextureHolderFactory() {
/* 461 */     return (LibRocket.TextureHolder)new b(this);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void EnableScissorRegion(boolean paramBoolean) {
/* 589 */     if (paramBoolean) {
/*     */       
/* 591 */       this.i.setWorldClip(this.e.a, this.e.b, this.e.b(), this.e.c());
/* 592 */       this.g = true;
/*     */     }
/*     */     else {
/*     */       
/* 596 */       this.i.clearWorldClip();
/* 597 */       this.g = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\d\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
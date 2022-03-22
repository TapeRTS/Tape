/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.j;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.ArrayList;
/*     */ import org.newdawn.slick.Image;
/*     */ import org.newdawn.slick.ImageBuffer;
/*     */ import org.newdawn.slick.SlickException;
/*     */ import org.newdawn.slick.opengl.ImageData;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends e
/*     */ {
/*     */   public static ArrayList s;
/*     */   private Image r;
/*     */   ImageData t;
/*     */   ByteBuffer u;
/*     */   int v;
/*     */   String w;
/*     */   
/*     */   public Image z() {
/*  42 */     return this.r;
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
/*     */   private void a(ImageData paramImageData) {
/* 118 */     this.t = paramImageData;
/*     */     
/* 120 */     if (this.t instanceof ImageBuffer) {
/*     */       
/* 122 */       this.u = ByteBuffer.wrap(((ImageBuffer)paramImageData).getRGBA());
/*     */     }
/*     */     else {
/*     */       
/* 126 */       this.u = paramImageData.getImageBufferData();
/*     */     } 
/*     */     
/* 129 */     this.v = paramImageData.getDepth() / 8;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     if (this.v == 4) {
/*     */       
/* 136 */       int i = paramImageData.getTexHeight();
/* 137 */       int j = paramImageData.getTexWidth();
/*     */       
/* 139 */       int k = paramImageData.getHeight();
/* 140 */       int m = paramImageData.getWidth();
/*     */       
/* 142 */       for (byte b = 0; b < k; b++) {
/*     */         
/* 144 */         for (byte b1 = 0; b1 < m; b1++) {
/*     */ 
/*     */           
/* 147 */           int n = b1 * 4 + b * j * 4;
/*     */ 
/*     */           
/*     */           try {
/* 151 */             if (this.u.get(n + 3) == 0)
/*     */             {
/* 153 */               this.u.put(n + 0, (byte)0);
/* 154 */               this.u.put(n + 1, (byte)0);
/* 155 */               this.u.put(n + 2, (byte)0);
/*     */             }
/*     */           
/* 158 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */             
/* 160 */             throw new IndexOutOfBoundsException("offset:" + n + " x:" + b1 + " y:" + b + " height:" + k + " width:" + m + " texHeight:" + i + " texWidth:" + j);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 167 */     if (z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean x = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 181 */   int y = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 189 */     return this.w;
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
/*     */   public void A() {
/* 210 */     if (this.t == null && this.r != null) {
/*     */       
/* 212 */       l.b("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 217 */     if (this.r != null) {
/*     */       
/*     */       try {
/*     */         
/* 221 */         this.r.destroy();
/*     */       }
/* 223 */       catch (SlickException slickException) {
/*     */         
/* 225 */         throw new RuntimeException(slickException);
/*     */       } 
/*     */     }
/*     */     
/* 229 */     Image image = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     if (image == null)
/*     */     {
/* 256 */       image = new Image(this.t);
/*     */     }
/*     */     
/* 259 */     this.r = image;
/*     */     
/* 261 */     B();
/*     */     
/* 263 */     this.k = this.r.getWidth();
/* 264 */     this.l = this.r.getHeight();
/* 265 */     f();
/*     */     
/* 267 */     u();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Image paramImage, String paramString) {
/* 278 */     if (this.r != null)
/*     */     {
/* 280 */       l.f("this.slickImage!=null");
/*     */     }
/*     */     
/* 283 */     this.r = paramImage;
/*     */     
/* 285 */     B();
/*     */     
/* 287 */     this.k = this.r.getWidth();
/* 288 */     this.l = this.r.getHeight();
/* 289 */     f();
/*     */ 
/*     */     
/* 292 */     this.w = paramString;
/*     */     
/* 294 */     if (this.w != null) {
/*     */       
/* 296 */       File file = new File(this.w);
/* 297 */       if (!file.exists())
/*     */       {
/* 299 */         throw new RuntimeException(this.w + " does not exist");
/*     */       }
/*     */       
/* 302 */       this.D = b(true);
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
/*     */   public void a(ImageData paramImageData, String paramString, boolean paramBoolean) {
/* 334 */     a(paramImageData);
/*     */ 
/*     */     
/* 337 */     if (!paramBoolean)
/*     */     {
/* 339 */       A();
/*     */     }
/*     */     
/* 342 */     this.w = paramString;
/*     */     
/* 344 */     if (this.w != null && !this.w.contains(".rwmod")) {
/*     */       
/* 346 */       File file = new File(this.w);
/* 347 */       if (!file.exists())
/*     */       {
/* 349 */         throw new RuntimeException(this.w + " does not exist");
/*     */       }
/*     */       
/* 352 */       this.D = b(true);
/*     */     } 
/*     */     
/* 355 */     f();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static ByteBuffer a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) {
/* 361 */     paramByteBuffer1.rewind();
/* 362 */     paramByteBuffer2.put(paramByteBuffer1);
/* 363 */     paramByteBuffer1.rewind();
/* 364 */     paramByteBuffer2.flip();
/* 365 */     return paramByteBuffer2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 371 */     r r1 = new r();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 381 */     ImageBuffer imageBuffer = new ImageBuffer(paramInt1, paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 388 */     String str = null;
/*     */     
/* 390 */     r1.a((ImageData)imageBuffer, str, true);
/*     */ 
/*     */     
/* 393 */     if (paramBoolean) {
/*     */       
/* 395 */       boolean bool = true;
/*     */       
/* 397 */       if (bool && this.v == 4) {
/*     */ 
/*     */         
/* 400 */         E();
/*     */         
/* 402 */         ByteBuffer byteBuffer = this.t.getImageBufferData();
/*     */ 
/*     */         
/* 405 */         a(byteBuffer, r1.u);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 417 */         E();
/*     */ 
/*     */ 
/*     */         
/* 421 */         for (byte b = 0; b < paramInt2; b++) {
/*     */           
/* 423 */           for (byte b1 = 0; b1 < paramInt1; b1++)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 429 */             r1.a(b1, b, a(b1, b));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 438 */     r1.k = paramInt1;
/* 439 */     r1.l = paramInt2;
/* 440 */     r1.f();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 445 */     r1.x = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 463 */     return r1;
/*     */   } static boolean z = true; boolean A; boolean B; boolean C; long D; public void h() { if (!this.A) {
/*     */       i();
/*     */     } else if (z && this.u == null) {
/*     */       i();
/*     */     }  } public void w() { E(); } public void x() {}
/*     */   public void i() { this.A = true; if (this.B) {
/*     */       D(); throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
/*     */     }  E(); }
/*     */   public void E() { if (z)
/*     */       if (this.u == null)
/*     */         G();   }
/* 475 */   public r() { this.A = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 780 */     this.C = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 843 */     this.D = -1L; if (s == null)
/*     */       s = new ArrayList();  s.add(this); }
/*     */   public void p() { F(); }
/* 846 */   public void F() { if (z) { this.t = null; this.u = null; }  } static int E = 1000;
/*     */   public void G() { if (this.r == null)
/*     */       throw new RuntimeException("Cannot buffer pixels, we have no slickImage");  long l = bj.a(); s s = new s(this, this.r); this.t = s; this.u = ByteBuffer.wrap(s.a()); double d = bj.a(l); l.d("Recreating image data from texture: " + a() + " (" + bj.a(d) + ")"); }
/*     */   public boolean j() { if (this.t == null) { if (z)
/*     */         if (this.r != null)
/*     */           return true;   return false; }  return true; }
/*     */   public int a(int paramInt1, int paramInt2) { try { return e.a(this.t, this.u, paramInt1, paramInt2, this.v); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { String str = "getPixel out of bounds"; str = str + " (x:" + paramInt1 + " y:" + paramInt2 + " perPixel:" + this.v + " TexWidth:" + this.t.getTexWidth() + " TexHeight:" + this.t.getTexHeight() + " imageByteBuffer:" + this.u.limit() + " width:" + this.k + " height:" + this.l + ")"; throw new RuntimeException(str, indexOutOfBoundsException); }  }
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) { try { e.a(this.t, this.u, paramInt1, paramInt2, Color.b(paramInt3), Color.c(paramInt3), Color.d(paramInt3), Color.a(paramInt3), this.v); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { String str = "setPixel out of bounds"; str = str + " (x:" + paramInt1 + " y:" + paramInt2 + " perPixel:" + this.v + " TexWidth:" + this.t.getTexWidth() + " TexHeight:" + this.t.getTexHeight() + " imageByteBuffer:" + this.u.limit() + " width:" + this.k + " height:" + this.l + ")"; throw new RuntimeException(str, indexOutOfBoundsException); }  }
/* 854 */   public void o() { if (this.A) { this.A = false; } else { return; }  A(); } public void q() {} protected void d() { B(); } public void r() { this.B = true; this.t = null; this.u = null; }
/*     */   public void m() { this.C = true; }
/*     */   public void n() { this.t = null; this.u = null; if (s != null) s.remove(this);  if (this.r != null) { try { this.r.destroy(); } catch (SlickException slickException) { slickException.printStackTrace(); }  this.r = null; }  }
/*     */   protected void finalize() { if (this.C) n();  if (this.r != null)
/*     */       l.b("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");  }
/*     */   public e g() { return a(this.k, this.l, true); }
/* 860 */   public void B() { if (this.r == null) {
/*     */       
/* 862 */       l.b("slickImage==null");
/* 863 */       l.M();
/*     */     } 
/* 865 */     if (!this.j) {
/*     */       
/* 867 */       this.y = 2;
/*     */       
/* 869 */       this.r.setFilter(2);
/*     */     }
/*     */     else {
/*     */       
/* 873 */       this.y = 1;
/*     */       
/* 875 */       this.r.setFilter(1);
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void C() {
/* 884 */     if (this.x) {
/*     */       
/* 886 */       l.d("reloadImage: skipping cloned image:" + this.w);
/*     */       
/*     */       return;
/*     */     } 
/* 890 */     if (this.w == null) {
/*     */       
/* 892 */       l.d("reloadImage: filepath is null, skipping");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*     */     try {
/* 899 */       l.d("reloadImage: reloading:" + this.w);
/*     */       
/* 901 */       if (this.r != null) {
/*     */         
/* 903 */         this.r.destroy();
/*     */       }
/*     */       else {
/*     */         
/* 907 */         l.d("slickImage==null cannot free");
/*     */       } 
/*     */       
/* 910 */       E++;
/*     */ 
/*     */       
/* 913 */       FileInputStream fileInputStream = new FileInputStream(this.w);
/*     */ 
/*     */       
/*     */       try {
/* 917 */         this.r = new Image(fileInputStream, "reload_" + E, false);
/*     */       }
/* 919 */       catch (NullPointerException nullPointerException) {
/*     */         
/* 921 */         throw new IOException("Failed to reload", nullPointerException);
/*     */       } 
/*     */       
/* 924 */       u();
/*     */       
/* 926 */       B();
/*     */       
/* 928 */       this.k = this.r.getWidth();
/* 929 */       this.l = this.r.getHeight();
/* 930 */       f();
/*     */       
/* 932 */       fileInputStream.close();
/*     */     
/*     */     }
/* 935 */     catch (SlickException slickException) {
/*     */       
/* 937 */       l.d("reloadImage: failed");
/* 938 */       slickException.printStackTrace();
/*     */     }
/* 940 */     catch (IOException iOException) {
/*     */       
/* 942 */       l.d("reloadImage: failed");
/* 943 */       iOException.printStackTrace();
/*     */     } 
/*     */     
/* 946 */     l l = l.u();
/*     */     
/* 948 */     if (l != null && l.bt != null)
/*     */     {
/* 950 */       l.bt.d();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long b(boolean paramBoolean) {
/* 957 */     if (this.w == null)
/*     */     {
/* 959 */       return -2L;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 966 */     return j.a(this.w, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void s() {
/* 972 */     long l = b(false);
/* 973 */     if (this.D == -1L) {
/*     */ 
/*     */ 
/*     */       
/* 977 */       this.D = l;
/*     */     }
/* 979 */     else if (this.D != l) {
/*     */       
/* 981 */       l.d("reloadImage: '" + this.w + "' reloading current now:" + l);
/* 982 */       C();
/* 983 */       this.D = l;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void D() {
/* 990 */     l.d("SlickBitmapOrTexture: " + this.d);
/* 991 */     l.d(" className:" + getClass().getSimpleName());
/* 992 */     l.d(" filepath:" + this.w);
/* 993 */     l.d(" slickImage:" + ((this.r != null) ? 1 : 0));
/* 994 */     l.d(" cloned:" + this.x);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
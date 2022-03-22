/*      */ package com.corrodinggames.rts.java;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.Color;
/*      */ import android.graphics.ColorFilter;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PorterDuff;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.graphics.Typeface;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.j.a;
/*      */ import com.corrodinggames.rts.gameFramework.j.h;
/*      */ import com.corrodinggames.rts.gameFramework.j.i;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.u;
/*      */ import com.corrodinggames.rts.gameFramework.utility.j;
/*      */ import com.corrodinggames.rts.java.a.a;
/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.FontFormatException;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.ByteOrder;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Stack;
/*      */ import org.lwjgl.BufferUtils;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GL14;
/*      */ import org.newdawn.slick.Color;
/*      */ import org.newdawn.slick.Font;
/*      */ import org.newdawn.slick.Graphics;
/*      */ import org.newdawn.slick.Image;
/*      */ import org.newdawn.slick.ImageBuffer;
/*      */ import org.newdawn.slick.SlickException;
/*      */ import org.newdawn.slick.UnicodeFont;
/*      */ import org.newdawn.slick.font.GlyphPage;
/*      */ import org.newdawn.slick.font.effects.ColorEffect;
/*      */ import org.newdawn.slick.imageout.ImageIOWriter;
/*      */ import org.newdawn.slick.opengl.ImageData;
/*      */ import org.newdawn.slick.opengl.ImageIOImageData;
/*      */ import org.newdawn.slick.opengl.PNGImageData;
/*      */ import org.newdawn.slick.opengl.TextureImpl;
/*      */ import org.newdawn.slick.opengl.renderer.LineStripRenderer;
/*      */ import org.newdawn.slick.opengl.renderer.Renderer;
/*      */ import org.newdawn.slick.opengl.renderer.SGL;
/*      */ import org.newdawn.slick.util.FastTrig;
/*      */ import org.newdawn.slick.util.ResourceLoader;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class e
/*      */   implements l
/*      */ {
/*      */   public boolean a;
/*   79 */   public static final Color b = new Color(0, 0, 0, 255);
/*      */ 
/*      */ 
/*      */   
/*   83 */   public static final Color c = new Color(0, 0, 0, 255);
/*   84 */   public static final Color d = new Color(0, 0, 0, 255);
/*      */ 
/*      */   
/*      */   public Graphics e;
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e f;
/*      */   
/*   91 */   public static Graphics g = null;
/*      */ 
/*      */   
/*   94 */   private static SGL L = Renderer.get();
/*      */   
/*   96 */   final Rect h = new Rect();
/*   97 */   final Rect i = new Rect();
/*   98 */   final RectF j = new RectF();
/*      */   public static a k;
/*      */   public static a l;
/*      */   public static a m;
/*      */   
/*      */   public static void p() {
/*  104 */     L = Renderer.get();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color q() {
/*  112 */     return b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public l a(com.corrodinggames.rts.gameFramework.j.e parame) {
/*  119 */     e e1 = new e();
/*  120 */     r r1 = b(parame);
/*      */ 
/*      */     
/*      */     try {
/*  124 */       e1.e = r1.z().getGraphics();
/*  125 */       e1.f = parame;
/*      */     }
/*  127 */     catch (SlickException slickException) {
/*      */       
/*  129 */       throw new RuntimeException(slickException);
/*      */     } 
/*      */     
/*  132 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a() {
/*  168 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Context paramContext) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/*  193 */     k = new a((r)a(R.drawable.error_outmem));
/*      */     
/*  195 */     l = new a((r)a(R.drawable.error_general));
/*      */     
/*  197 */     m = new a((r)a(R.drawable.error_toolargethumb));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public h c() {
/*  209 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(h paramh) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(a parama) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  236 */   ArrayList n = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean a(String paramString) {
/*  316 */     for (byte b = 0; b < paramString.length(); b++) {
/*      */       
/*  318 */       int i = paramString.codePointAt(b);
/*  319 */       if (i > 255)
/*      */       {
/*  321 */         return true;
/*      */       }
/*      */     } 
/*  324 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   Font a(f paramf, String paramString, boolean paramBoolean) {
/*  333 */     f f1 = a(paramf, paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  338 */     if (f1.a(paramString))
/*      */     {
/*  340 */       return f1.d;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  347 */     UnicodeFont unicodeFont = (UnicodeFont)f1.d;
/*      */     
/*  349 */     int i = 0;
/*  350 */     for (GlyphPage glyphPage1 : unicodeFont.getGlyphPages()) {
/*      */       
/*  352 */       GlyphPage glyphPage2 = glyphPage1;
/*  353 */       i += glyphPage2.getGlyphs().size();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int j;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  371 */     for (j = 0; j < paramString.length(); j++) {
/*  372 */       char c = paramString.charAt(j);
/*      */       
/*  374 */       boolean bool = false;
/*      */       
/*  376 */       if (!bool);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  382 */     j = unicodeFont.getGlyphPages().size();
/*      */     
/*  384 */     unicodeFont.addGlyphs(paramString);
/*      */     
/*      */     try {
/*  387 */       unicodeFont.loadGlyphs();
/*  388 */     } catch (SlickException slickException) {
/*  389 */       throw new RuntimeException(slickException);
/*      */     } 
/*      */ 
/*      */     
/*  393 */     int k = 0;
/*  394 */     for (GlyphPage glyphPage1 : unicodeFont.getGlyphPages()) {
/*      */       
/*  396 */       GlyphPage glyphPage2 = glyphPage1;
/*  397 */       k += glyphPage2.getGlyphs().size();
/*      */     } 
/*      */     
/*  400 */     int m = unicodeFont.getGlyphPages().size();
/*  401 */     if (i != k)
/*      */     {
/*  403 */       l.d("new glypth, " + k + " " + f1.toString() + " for text:" + paramString);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  411 */     f1.b(paramString);
/*      */ 
/*      */     
/*  414 */     return f1.d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   f a(f paramf, boolean paramBoolean) {
/*      */     Font font;
/*  426 */     for (f f1 : this.n) {
/*      */       
/*  428 */       if (f1.a == paramf.a && f1.b == paramf.b && f1.c == paramf.c)
/*      */       {
/*  430 */         return f1;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  435 */     paramf = paramf.a();
/*      */     
/*  437 */     l.d("New font:" + paramf.a + " bold:" + paramf.b);
/*      */     
/*  439 */     if (paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  459 */     String str = "font/Roboto-Regular.ttf";
/*      */     
/*  461 */     if (paramf.b)
/*      */     {
/*      */ 
/*      */       
/*  465 */       str = "font/Roboto-Bold.ttf";
/*      */     }
/*      */     
/*  468 */     if (paramf.c)
/*      */     {
/*  470 */       str = "font/DroidSansFallback.ttf";
/*      */     }
/*      */ 
/*      */     
/*  474 */     boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  482 */       InputStream inputStream = ResourceLoader.getResourceAsStream(str);
/*  483 */       font = Font.createFont(0, inputStream);
/*  484 */       font = font.deriveFont(paramf.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  503 */     catch (IOException iOException) {
/*      */       
/*  505 */       throw new RuntimeException(iOException);
/*      */     }
/*  507 */     catch (FontFormatException fontFormatException) {
/*      */       
/*  509 */       throw new RuntimeException(fontFormatException);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  515 */     UnicodeFont unicodeFont = new UnicodeFont(font);
/*  516 */     unicodeFont.addAsciiGlyphs();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  523 */     Color color = new Color(255, 255, 255);
/*  524 */     unicodeFont.getEffects().add(new ColorEffect(color));
/*      */     
/*      */     try {
/*  527 */       unicodeFont.loadGlyphs();
/*      */     }
/*  529 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/*  531 */       l.a(u.a, outOfMemoryError);
/*      */     
/*      */     }
/*  534 */     catch (SlickException slickException) {
/*      */       
/*  536 */       throw new RuntimeException(slickException);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  541 */     l.d("loadGlyphs");
/*      */ 
/*      */     
/*  544 */     paramf.d = (Font)unicodeFont;
/*      */     
/*  546 */     this.n.add(paramf);
/*      */     
/*  548 */     return paramf;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Paint paramPaint, String paramString) {
/*  555 */     a(paramPaint, true, paramString, (r)null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(Paint paramPaint) {
/*  560 */     a(paramPaint, false, (String)null, (r)null);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(Paint paramPaint, r paramr) {
/*  565 */     a(paramPaint, false, (String)null, paramr);
/*      */   }
/*      */   
/*  568 */   int o = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  593 */   Paint p = null;
/*  594 */   r q = null;
/*      */ 
/*      */   
/*      */   boolean r;
/*      */ 
/*      */   
/*  600 */   final Paint s = new Paint();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Paint paramPaint, boolean paramBoolean, String paramString, r paramr) {
/*      */     boolean bool;
/*  634 */     boolean bool1 = false;
/*      */     
/*  636 */     if (g != this.e) {
/*      */ 
/*      */       
/*  639 */       t();
/*      */       
/*  641 */       this.a = true;
/*  642 */       u = -1.0F;
/*      */       
/*  644 */       Color.setRebindRequired();
/*      */       
/*  646 */       this.p = this.s;
/*      */       
/*  648 */       bool1 = true;
/*      */     } 
/*  650 */     g = this.e;
/*      */ 
/*      */     
/*  653 */     if (paramPaint == null || paramPaint instanceof com.corrodinggames.rts.gameFramework.j.q)
/*      */     {
/*  655 */       if (this.p == paramPaint && this.q == paramr)
/*      */       {
/*      */         
/*  658 */         if (!paramBoolean) {
/*      */           return;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  669 */     this.p = paramPaint;
/*  670 */     this.q = paramr;
/*      */ 
/*      */     
/*  673 */     boolean bool2 = (paramr == null && !paramBoolean) ? true : false;
/*      */ 
/*      */     
/*  676 */     if (this.o != Graphics.MODE_NORMAL) {
/*      */       
/*  678 */       this.o = Graphics.MODE_NORMAL;
/*  679 */       this.e.setDrawMode(this.o);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  689 */     if (bool1)
/*      */     {
/*  691 */       if (this.f != null) {
/*      */         
/*  693 */         L.glEnable(3042);
/*  694 */         L.glColorMask(true, true, true, true);
/*      */         
/*  696 */         GL14.glBlendFuncSeparate(770, 771, 770, 1);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  714 */     if (paramPaint == null) {
/*      */ 
/*      */ 
/*      */       
/*  718 */       bool = false;
/*      */       
/*  720 */       a(Color.white);
/*      */       
/*  722 */       if (bool2) a(1.0F);
/*      */       
/*  724 */       if (paramBoolean)
/*      */       {
/*  726 */         this.e.resetFont();
/*      */       
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  733 */       bool = paramPaint.c();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  762 */     if (paramr != null) {
/*      */       
/*  764 */       boolean bool3 = (paramr.y == 1);
/*      */       
/*  766 */       if (bool3 != bool) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  775 */         boolean bool4 = bool ? true : true;
/*  776 */         paramr.z().setFilter(bool4);
/*  777 */         paramr.y = bool4;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  783 */     if (paramPaint != null) {
/*      */ 
/*      */       
/*  786 */       boolean bool3 = true;
/*      */ 
/*      */       
/*  789 */       ColorFilter colorFilter = paramPaint.h();
/*  790 */       if (colorFilter != null)
/*      */       {
/*  792 */         if (colorFilter instanceof LightingColorFilter) {
/*      */           
/*  794 */           LightingColorFilter lightingColorFilter = (LightingColorFilter)colorFilter;
/*      */           
/*  796 */           if (lightingColorFilter.a != 0 && lightingColorFilter.a != -1) {
/*      */             
/*  798 */             int i = lightingColorFilter.a;
/*      */ 
/*      */             
/*  801 */             c.r = Color.b(i) * 0.003921569F;
/*  802 */             c.g = Color.c(i) * 0.003921569F;
/*  803 */             c.b = Color.d(i) * 0.003921569F;
/*  804 */             c.a = Color.a(i) * 0.003921569F;
/*      */ 
/*      */ 
/*      */             
/*  808 */             a(paramPaint.e(), d);
/*      */             
/*  810 */             c.r *= d.r;
/*  811 */             c.g *= d.g;
/*  812 */             c.b *= d.b;
/*  813 */             c.a *= d.a;
/*      */ 
/*      */             
/*  816 */             a(c);
/*      */ 
/*      */             
/*  819 */             this.o = Graphics.MODE_ADD;
/*  820 */             this.e.setDrawMode(this.o);
/*      */             
/*  822 */             L.glEnable(3042);
/*  823 */             L.glColorMask(true, true, true, true);
/*  824 */             L.glBlendFunc(770, 1);
/*      */             
/*  826 */             bool3 = false;
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*  832 */       if (bool3)
/*      */       {
/*      */         
/*  835 */         e(paramPaint.e());
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  843 */       if (bool2)
/*      */       {
/*  845 */         if (paramPaint.g() != 0.0F) {
/*      */           
/*  847 */           a(paramPaint.g());
/*      */         }
/*      */         else {
/*      */           
/*  851 */           a(1.0F);
/*      */         } 
/*      */       }
/*      */       
/*  855 */       if (paramBoolean) {
/*      */         
/*  857 */         Font font = a(paramPaint, paramString, true);
/*  858 */         this.e.setFont(font);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  878 */   public static final Color t = new Color(0, 0, 0, 255);
/*      */ 
/*      */   
/*      */   private void e(int paramInt) {
/*  882 */     a(paramInt, t);
/*  883 */     a(t);
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(Color paramColor) {
/*  888 */     Color color = b;
/*      */     
/*  890 */     if (this.a) {
/*      */       
/*  892 */       this.a = false;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  897 */     else if (color.r == paramColor.r && color.g == paramColor.g && color.b == paramColor.b && color.a == paramColor.a) {
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  906 */     color.a = paramColor.a;
/*  907 */     color.r = paramColor.r;
/*  908 */     color.g = paramColor.g;
/*  909 */     color.b = paramColor.b;
/*  910 */     this.e.setColor(color);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  916 */   static float u = -1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/*  922 */     if (u != paramFloat) {
/*      */       
/*  924 */       u = paramFloat;
/*  925 */       this.e.setLineWidth(paramFloat);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  935 */   f v = new f(this);
/*      */ 
/*      */   
/*      */   public Font a(Paint paramPaint, String paramString, boolean paramBoolean) {
/*  939 */     f f1 = this.v;
/*  940 */     f1.a = (int)paramPaint.k();
/*      */     
/*  942 */     if (s())
/*      */     {
/*  944 */       f1.a = (int)(f1.a * this.C);
/*      */     }
/*      */     
/*  947 */     Typeface typeface = paramPaint.i();
/*      */     
/*  949 */     f1.b = false;
/*  950 */     if (typeface != null)
/*      */     {
/*  952 */       f1.b = typeface.a();
/*      */     }
/*  954 */     f1.c = false;
/*      */     
/*  956 */     boolean bool = a(paramString);
/*  957 */     if (bool)
/*      */     {
/*  959 */       f1.c = true;
/*      */     }
/*      */     
/*  962 */     return a(f1, paramString, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(ImageData paramImageData, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
/*  971 */     int i = (paramInt1 + paramInt2 * paramImageData.getTexWidth()) * paramInt7;
/*      */ 
/*      */     
/*  974 */     if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
/*      */       
/*  976 */       paramByteBuffer.put(i, (byte)paramInt5);
/*  977 */       paramByteBuffer.put(i + 1, (byte)paramInt4);
/*  978 */       paramByteBuffer.put(i + 2, (byte)paramInt3);
/*  979 */       paramByteBuffer.put(i + 3, (byte)paramInt6);
/*      */     }
/*      */     else {
/*      */       
/*  983 */       paramByteBuffer.put(i, (byte)paramInt3);
/*  984 */       paramByteBuffer.put(i + 1, (byte)paramInt4);
/*  985 */       paramByteBuffer.put(i + 2, (byte)paramInt5);
/*  986 */       paramByteBuffer.put(i + 3, (byte)paramInt6);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*  991 */   byte[] w = new byte[4];
/*      */ 
/*      */ 
/*      */   
/*      */   public static int a(ImageData paramImageData, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
/*  996 */     int j, k, m, n, i = (paramInt1 + paramInt2 * paramImageData.getTexWidth()) * paramInt3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1006 */     if (paramInt3 == 4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1055 */     if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
/*      */ 
/*      */       
/* 1058 */       m = paramByteBuffer.get(i) & 0xFF;
/* 1059 */       k = paramByteBuffer.get(i + 1) & 0xFF;
/* 1060 */       j = paramByteBuffer.get(i + 2) & 0xFF;
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1065 */       j = paramByteBuffer.get(i) & 0xFF;
/* 1066 */       k = paramByteBuffer.get(i + 1) & 0xFF;
/* 1067 */       m = paramByteBuffer.get(i + 2) & 0xFF;
/*      */     } 
/*      */ 
/*      */     
/* 1071 */     if (paramInt3 < 4) {
/*      */       
/* 1073 */       n = 255;
/*      */     }
/*      */     else {
/*      */       
/* 1077 */       n = paramByteBuffer.get(i + 3) & 0xFF;
/*      */     } 
/*      */     
/* 1080 */     return a(n, j, k, m);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1097 */     return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Color a(int paramInt, Color paramColor) {
/* 1121 */     paramColor.r = (paramInt >> 16 & 0xFF) * 0.003921569F;
/* 1122 */     paramColor.g = (paramInt >> 8 & 0xFF) * 0.003921569F;
/* 1123 */     paramColor.b = (paramInt & 0xFF) * 0.003921569F;
/* 1124 */     paramColor.a = (paramInt >>> 24) * 0.003921569F;
/* 1125 */     return paramColor;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e a(int paramInt) {
/* 1153 */     return a(paramInt, true);
/*      */   }
/*      */ 
/*      */   
/* 1157 */   static ArrayList x = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*      */   public void d() {
/* 1162 */     r();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void r() {
/* 1167 */     if (x.size() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1172 */     for (r r1 : x)
/*      */     {
/* 1174 */       r1.F();
/*      */     }
/*      */     
/* 1177 */     x.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(r paramr) {
/* 1183 */     x.add(paramr);
/*      */     
/* 1185 */     if (x.size() > 15)
/*      */     {
/* 1187 */       r();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static r b(int paramInt, boolean paramBoolean) {
/* 1195 */     String str = f.e(paramInt);
/*      */ 
/*      */     
/*      */     try {
/* 1199 */       FileInputStream fileInputStream = new FileInputStream(str);
/*      */ 
/*      */       
/* 1202 */       ImageData imageData = a(fileInputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1211 */       fileInputStream.close();
/*      */       
/* 1213 */       return a(imageData, str);
/*      */ 
/*      */     
/*      */     }
/* 1217 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/* 1219 */       l.a(u.a, outOfMemoryError);
/*      */       
/* 1221 */       if (k == null)
/*      */       {
/* 1223 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/* 1225 */       return k;
/*      */     }
/* 1227 */     catch (IOException iOException) {
/*      */       
/* 1229 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e a(int paramInt, boolean paramBoolean) {
/* 1237 */     return b(paramInt, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1242 */   int y = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ImageData a(InputStream paramInputStream) {
/*      */     a a1;
/* 1278 */     BufferedInputStream bufferedInputStream = new BufferedInputStream(paramInputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*      */       try {
/* 1287 */         bufferedInputStream.mark(2147483647);
/*      */         
/* 1289 */         PNGImageData pNGImageData2 = new PNGImageData();
/* 1290 */         pNGImageData2.loadImage(bufferedInputStream);
/* 1291 */         PNGImageData pNGImageData1 = pNGImageData2;
/*      */       }
/* 1293 */       catch (IOException iOException) {
/*      */         
/* 1295 */         bufferedInputStream.reset();
/*      */         
/* 1297 */         l.d("PNG load failed: " + iOException.getMessage());
/*      */         
/* 1299 */         l.d("Attempting load with ImageIO..");
/*      */         
/* 1301 */         ImageIOImageData imageIOImageData = new ImageIOImageData();
/* 1302 */         ByteBuffer byteBuffer = imageIOImageData.loadImage(bufferedInputStream, false, null);
/*      */ 
/*      */         
/* 1305 */         a1 = new a((ImageData)imageIOImageData, byteBuffer);
/*      */       }
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/* 1311 */       bufferedInputStream.close();
/*      */     } 
/*      */ 
/*      */     
/* 1315 */     return (ImageData)a1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e a(InputStream paramInputStream, boolean paramBoolean) {
/*      */     try {
/* 1324 */       String str = null;
/* 1325 */       if (paramInputStream instanceof j) {
/*      */         
/* 1327 */         str = ((j)paramInputStream).d();
/*      */       }
/*      */       else {
/*      */         
/* 1331 */         l.b("loadImage InputStream is not AssetInputStream");
/* 1332 */         l.M();
/*      */       } 
/*      */       
/* 1335 */       this.y++;
/*      */       
/* 1337 */       ImageData imageData = a(paramInputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1350 */       return a(imageData, str);
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1355 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/* 1357 */       l.a(u.a, outOfMemoryError);
/*      */       
/* 1359 */       if (k == null)
/*      */       {
/* 1361 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/* 1363 */       return k;
/*      */     }
/* 1365 */     catch (IOException iOException) {
/*      */       
/* 1367 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static r a(ImageData paramImageData, String paramString) {
/* 1384 */     r r1 = new r();
/*      */ 
/*      */     
/* 1387 */     r1.a(paramImageData, paramString, false);
/*      */     
/* 1389 */     a(r1);
/*      */     
/* 1391 */     return r1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 1409 */     r r1 = new r();
/*      */ 
/*      */     
/*      */     try {
/* 1413 */       r1.a(new Image(paramInt1, paramInt2), (String)null);
/*      */       
/* 1415 */       a(r1);
/*      */     }
/* 1417 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/* 1419 */       l.a(u.b, outOfMemoryError);
/*      */       
/* 1421 */       if (k == null)
/*      */       {
/* 1423 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/* 1425 */       return k;
/*      */     }
/* 1427 */     catch (SlickException slickException) {
/*      */       
/* 1429 */       throw new RuntimeException(slickException);
/*      */     } 
/*      */     
/* 1432 */     return r1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e b(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 1442 */     return a((ImageData)new ImageBuffer(paramInt1, paramInt2), (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/* 1464 */     this.e.pushTransform();
/*      */     
/* 1466 */     this.e.rotate(paramFloat1, paramFloat2, paramFloat3 + 90.0F);
/*      */ 
/*      */ 
/*      */     
/* 1470 */     r r1 = b(parame);
/*      */     
/* 1472 */     a(paramPaint, r1);
/*      */     
/* 1474 */     this.e.drawImage(r1.z(), paramFloat1 - r1.m, paramFloat2 - r1.n, q());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1479 */     this.e.popTransform();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect, float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/* 1490 */     this.e.pushTransform();
/*      */     
/* 1492 */     this.e.rotate(paramFloat1, paramFloat2, paramFloat3);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1497 */     r r1 = b(parame);
/*      */     
/* 1499 */     a(paramPaint, r1);
/*      */     
/* 1501 */     this.e.drawImage(r1.z(), paramFloat1 - r1.m, paramFloat2 - r1.n, paramRect.a, paramRect.b, paramRect.c, paramRect.d, q());
/*      */ 
/*      */     
/* 1504 */     this.e.popTransform();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 1509 */   RectF z = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/* 1515 */     this.z.a(paramRect2);
/* 1516 */     a(parame, paramRect1, this.z, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/* 1523 */     this.z.a(paramRect2);
/* 1524 */     a(parame, paramRect1, this.z, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Rect paramRect, Paint paramPaint) {
/* 1534 */     this.z.a(paramRect);
/* 1535 */     a(this.z, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final r b(com.corrodinggames.rts.gameFramework.j.e parame) {
/* 1555 */     return (r)parame.c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect, RectF paramRectF, Paint paramPaint) {
/* 1567 */     r r1 = b(parame);
/*      */ 
/*      */     
/* 1570 */     a(paramPaint, r1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1576 */     Image image = r1.z();
/*      */     
/* 1578 */     if (image == null) {
/*      */ 
/*      */       
/* 1581 */       r1.D();
/*      */       
/* 1583 */       throw new RuntimeException("getSlickImage==null");
/*      */     } 
/*      */     
/* 1586 */     this.e.drawImage(image, paramRectF.a, paramRectF.b, paramRectF.c, paramRectF.d, paramRect.a, paramRect.b, paramRect.c, paramRect.d, q());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1607 */     b(parame, paramFloat1 - parame.o, paramFloat2 - parame.p, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, float paramFloat1, float paramFloat2, Paint paramPaint, float paramFloat3, float paramFloat4) {
/* 1616 */     this.e.pushTransform();
/*      */     
/* 1618 */     this.e.translate(paramFloat1, paramFloat2);
/*      */     
/* 1620 */     this.e.scale(paramFloat4, paramFloat4);
/* 1621 */     this.e.rotate(paramFloat1, paramFloat2, paramFloat3);
/*      */ 
/*      */ 
/*      */     
/* 1625 */     r r1 = b(parame);
/*      */ 
/*      */     
/* 1628 */     a(paramPaint, r1);
/*      */     
/* 1630 */     this.e.drawImage(r1.z(), 0.0F, 0.0F, q());
/*      */ 
/*      */     
/* 1633 */     this.e.popTransform();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(com.corrodinggames.rts.gameFramework.j.e parame, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1646 */     r r1 = b(parame);
/*      */     
/* 1648 */     a(paramPaint, r1);
/*      */     
/* 1650 */     this.e.drawImage(r1.z(), paramFloat1, paramFloat2, q());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect, Paint paramPaint) {
/* 1659 */     a(parame, paramRect, paramPaint, 0, 0, 0, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, Rect paramRect, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1669 */     if (parame.l() == 0 || parame.k() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1674 */     if (paramInt1 != 0) {
/*      */       
/* 1676 */       paramInt1 %= parame.l();
/* 1677 */       if (paramInt1 < 0)
/*      */       {
/* 1679 */         paramInt1 += parame.l();
/*      */       }
/*      */     } 
/*      */     
/* 1683 */     if (paramInt2 != 0) {
/*      */       
/* 1685 */       paramInt2 %= parame.k();
/* 1686 */       if (paramInt2 < 0)
/*      */       {
/* 1688 */         paramInt2 += parame.k();
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1693 */     int i = paramRect.a - paramInt1;
/* 1694 */     int j = paramRect.b - paramInt2;
/*      */     
/* 1696 */     int k = parame.l();
/* 1697 */     int m = parame.k();
/*      */     
/* 1699 */     while (i < paramRect.c) {
/*      */       
/* 1701 */       while (j < paramRect.d) {
/*      */ 
/*      */         
/* 1704 */         int n = paramRect.c - i;
/* 1705 */         if (n > k)
/*      */         {
/* 1707 */           n = k;
/*      */         }
/*      */         
/* 1710 */         int i1 = paramRect.d - j;
/* 1711 */         if (i1 > m)
/*      */         {
/* 1713 */           i1 = m;
/*      */         }
/*      */         
/* 1716 */         if (i1 <= 0) {
/*      */           continue;
/*      */         }
/*      */         
/* 1720 */         if (n <= 0) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 1725 */         this.h.a(0, 0, n, i1);
/* 1726 */         this.i.a(i, j, i + n, j + i1);
/*      */         
/* 1728 */         int i2 = this.i.a - paramRect.a;
/* 1729 */         if (i2 < 0) {
/*      */           
/* 1731 */           this.h.a -= i2;
/* 1732 */           this.i.a -= i2;
/*      */         } 
/*      */         
/* 1735 */         int i3 = this.i.b - paramRect.b;
/* 1736 */         if (i3 < 0) {
/*      */           
/* 1738 */           this.h.b -= i3;
/* 1739 */           this.i.b -= i3;
/*      */         } 
/*      */         
/* 1742 */         a(parame, this.h, this.i, paramPaint);
/*      */         
/* 1744 */         j += m - paramInt4;
/*      */       } 
/* 1746 */       i += k - paramInt3;
/* 1747 */       j = paramRect.b - paramInt2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, RectF paramRectF, Paint paramPaint, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/* 1755 */     float f1 = parame.l();
/* 1756 */     float f2 = parame.k();
/*      */     
/* 1758 */     if (f1 == 0.0F || f2 == 0.0F) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1763 */     if (paramFloat1 != 0.0F) {
/*      */       
/* 1765 */       paramFloat1 %= f1;
/* 1766 */       if (paramFloat1 < 0.0F)
/*      */       {
/* 1768 */         paramFloat1 += f1;
/*      */       }
/*      */     } 
/*      */     
/* 1772 */     if (paramFloat2 != 0.0F) {
/*      */       
/* 1774 */       paramFloat2 %= f2;
/* 1775 */       if (paramFloat2 < 0.0F)
/*      */       {
/* 1777 */         paramFloat2 += f2;
/*      */       }
/*      */     } 
/*      */     
/* 1781 */     float f3 = paramRectF.a - paramFloat1;
/* 1782 */     float f4 = paramRectF.b - paramFloat2;
/*      */     
/* 1784 */     while (f3 < paramRectF.c) {
/*      */       
/* 1786 */       while (f4 < paramRectF.d) {
/*      */ 
/*      */         
/* 1789 */         float f5 = paramRectF.c - f3;
/* 1790 */         if (f5 > f1)
/*      */         {
/* 1792 */           f5 = f1;
/*      */         }
/*      */         
/* 1795 */         float f6 = paramRectF.d - f4;
/* 1796 */         if (f6 > f2)
/*      */         {
/* 1798 */           f6 = f2;
/*      */         }
/*      */         
/* 1801 */         if (f6 <= 0.0F) {
/*      */           continue;
/*      */         }
/*      */         
/* 1805 */         if (f5 <= 0.0F) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 1810 */         this.h.a(0, 0, (int)f5, (int)f6);
/* 1811 */         this.j.a(f3, f4, f3 + f5, f4 + f6);
/*      */         
/* 1813 */         float f7 = this.j.a - paramRectF.a;
/* 1814 */         if (f7 < 0.0F) {
/*      */           
/* 1816 */           this.h.a = (int)(this.h.a - f7);
/* 1817 */           this.j.a -= f7;
/*      */         } 
/*      */         
/* 1820 */         float f8 = this.j.b - paramRectF.b;
/* 1821 */         if (f8 < 0.0F) {
/*      */           
/* 1823 */           this.h.b = (int)(this.h.b - f8);
/* 1824 */           this.j.b -= f8;
/*      */         } 
/*      */ 
/*      */         
/* 1828 */         a(parame, this.h, this.j, paramPaint);
/*      */         
/* 1830 */         f4 += f2 - paramInt2;
/*      */       } 
/* 1832 */       f3 += f1 - paramInt1;
/* 1833 */       f4 = paramRectF.b - paramFloat2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int paramInt) {
/* 1852 */     this.p = null;
/*      */     
/* 1854 */     this.e.setBackground(a(paramInt, d));
/* 1855 */     this.e.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void l() {
/* 1869 */     this.p = null;
/*      */ 
/*      */     
/* 1872 */     this.e.clearAlphaMap();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int paramInt, PorterDuff.Mode paramMode) {
/* 1882 */     this.p = null;
/*      */     
/* 1884 */     if (paramMode != PorterDuff.Mode.CLEAR) {
/*      */       
/* 1886 */       b(paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1896 */     b(paramInt);
/*      */ 
/*      */     
/* 1899 */     this.e.clearAlphaMap();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1919 */   static RectF A = new RectF();
/*      */   
/* 1921 */   static RectF B = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint1, Paint paramPaint2, float paramFloat3) {
/* 1930 */     float f1 = b(paramString, paramPaint1);
/*      */     
/* 1932 */     A.a(paramFloat1, paramFloat2, paramFloat1 + f1, paramFloat2 + 
/* 1933 */         a(paramString, paramPaint1));
/*      */     
/* 1935 */     f.a(A, paramFloat3);
/*      */     
/* 1937 */     B.a(A);
/*      */     
/* 1939 */     if (paramPaint1.j() == Paint.Align.b)
/*      */     {
/* 1941 */       A.a(-(f1 / 2.0F), 0.0F);
/*      */     }
/*      */     
/* 1944 */     a(A, paramPaint2);
/*      */     
/* 1946 */     a(paramString, B.a + paramFloat3, B.d - paramFloat3, paramPaint1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean s() {
/* 1954 */     if (!(l.u()).by.resizeFontWithUIScale)
/*      */     {
/* 1956 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1960 */     if (this.C == 1.0F)
/*      */     {
/* 1962 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1966 */     if (this.C < 1.0F)
/*      */     {
/* 1968 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1973 */     return true;
/*      */   }
/*      */   
/* 1976 */   public float C = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1984 */     if (s()) {
/*      */       
/* 1986 */       j();
/*      */       
/* 1988 */       float f1 = 1.0F / this.C;
/*      */       
/* 1990 */       a(f1, f1);
/* 1991 */       paramFloat1 *= this.C;
/* 1992 */       paramFloat2 *= this.C;
/*      */     } 
/*      */ 
/*      */     
/* 1996 */     a(paramPaint, paramString);
/*      */     
/* 1998 */     int i = 0;
/* 1999 */     if (paramPaint.j() == Paint.Align.b) {
/*      */       
/* 2001 */       int i1 = this.e.getFont().getWidth(paramString);
/* 2002 */       i -= i1 / 2;
/*      */     }
/* 2004 */     else if (paramPaint.j() == Paint.Align.c) {
/*      */       
/* 2006 */       int i1 = this.e.getFont().getWidth(paramString);
/* 2007 */       i -= i1;
/*      */     } 
/*      */ 
/*      */     
/* 2011 */     int j = 0;
/*      */ 
/*      */     
/* 2014 */     int k = this.e.getFont().getLineHeight();
/*      */ 
/*      */ 
/*      */     
/* 2018 */     j -= k;
/*      */     
/* 2020 */     int m = (int)(paramFloat1 + i);
/* 2021 */     int n = (int)(paramFloat2 + j);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2026 */     this.e.drawString(paramString, m, n);
/*      */     
/* 2028 */     if (s())
/*      */     {
/* 2030 */       k();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(Rect paramRect, Paint paramPaint) {
/* 2048 */     this.z.a(paramRect);
/* 2049 */     a(this.z, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(RectF paramRectF, Paint paramPaint) {
/* 2055 */     b(paramPaint);
/*      */ 
/*      */ 
/*      */     
/* 2059 */     if (paramPaint.d() == Paint.Style.a || paramPaint.d() == Paint.Style.c) {
/*      */ 
/*      */       
/* 2062 */       TextureImpl.bindNone();
/* 2063 */       L.glBegin(7);
/* 2064 */       L.glVertex2f(paramRectF.a, paramRectF.b);
/* 2065 */       L.glVertex2f(paramRectF.c, paramRectF.b);
/* 2066 */       L.glVertex2f(paramRectF.c, paramRectF.d);
/* 2067 */       L.glVertex2f(paramRectF.a, paramRectF.d);
/* 2068 */       L.glEnd();
/*      */     }
/*      */     else {
/*      */       
/* 2072 */       this.e.drawRect(paramRectF.a, paramRectF.b, paramRectF.b(), paramRectF.c());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/* 2081 */     d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g() {
/* 2091 */     this.p = null;
/*      */     
/* 2093 */     this.D.h();
/* 2094 */     this.E.clear();
/*      */     
/* 2096 */     this.a = true;
/*      */     
/* 2098 */     u = -1.0F;
/*      */ 
/*      */ 
/*      */     
/* 2102 */     this.r = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(Rect paramRect, Paint paramPaint) {
/* 2110 */     this.i.a(paramRect.a, paramRect.b, paramRect.a + paramRect.c, paramRect.b + paramRect.d);
/* 2111 */     b(this.i, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/* 2116 */   Rect D = new Rect();
/* 2117 */   Stack E = new Stack();
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Rect paramRect) {
/* 2122 */     if (paramRect == null) {
/*      */       
/* 2124 */       this.D.h();
/*      */     }
/*      */     else {
/*      */       
/* 2128 */       this.D.a(paramRect);
/*      */     } 
/* 2130 */     t();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(RectF paramRectF) {
/* 2136 */     if (paramRectF == null) {
/*      */       
/* 2138 */       this.D.h();
/*      */     }
/*      */     else {
/*      */       
/* 2142 */       this.D.a((int)paramRectF.a, (int)paramRectF.b, (int)paramRectF.c, (int)paramRectF.d);
/*      */     } 
/* 2144 */     t();
/*      */   }
/*      */ 
/*      */   
/*      */   public void t() {
/* 2149 */     if (!this.D.a()) {
/*      */       
/* 2151 */       this.e.setWorldClip(this.D.a, this.D.b, this.D.b(), this.D.c());
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 2158 */       this.e.clearWorldClip();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/* 2170 */     b(paramPaint);
/*      */     
/* 2172 */     if (paramPaint.d() == Paint.Style.b) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2179 */       byte b = 40;
/* 2180 */       if (paramFloat3 > 100.0F)
/*      */       {
/* 2182 */         b = 60;
/*      */       }
/*      */       
/* 2185 */       a(paramFloat1, paramFloat2, paramFloat3, b);
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 2191 */       this.e.fillOval(paramFloat1 - paramFloat3, paramFloat2 - paramFloat3, paramFloat3 * 2.0F, paramFloat3 * 2.0F);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2199 */   FloatBuffer F = BufferUtils.createFloatBuffer(3);
/* 2200 */   float[] G = new float[0];
/*      */ 
/*      */   
/*      */   public FloatBuffer c(int paramInt) {
/* 2204 */     if (this.F.capacity() < paramInt)
/*      */     {
/* 2206 */       this.F = BufferUtils.createFloatBuffer(paramInt);
/*      */     }
/* 2208 */     return this.F;
/*      */   }
/*      */ 
/*      */   
/*      */   public FloatBuffer a(float[] paramArrayOffloat, int paramInt) {
/* 2213 */     FloatBuffer floatBuffer = c(paramInt);
/* 2214 */     floatBuffer.clear();
/* 2215 */     floatBuffer.put(paramArrayOffloat, 0, paramInt);
/* 2216 */     floatBuffer.flip();
/* 2217 */     return floatBuffer;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float[] d(int paramInt) {
/* 2223 */     if (this.G.length < paramInt)
/*      */     {
/* 2225 */       this.G = new float[paramInt];
/*      */     }
/* 2227 */     return this.G;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float[] paramArrayOffloat, int paramInt1, int paramInt2, Paint paramPaint) {
/* 2233 */     if (paramInt2 == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 2239 */     boolean bool = true;
/*      */     
/* 2241 */     if (Main.b)
/*      */     {
/* 2243 */       bool = false;
/*      */     }
/*      */ 
/*      */     
/* 2247 */     float f1 = paramPaint.g();
/*      */     
/* 2249 */     float f2 = 1.0F;
/* 2250 */     float f3 = 0.0F;
/*      */     
/* 2252 */     if (f1 > 1.0F) {
/*      */ 
/*      */       
/* 2255 */       f2 += (f1 - 1.0F) * 0.5F;
/* 2256 */       f3 += (f1 - 1.0F) * 0.5F;
/*      */     } 
/*      */     
/* 2259 */     if (bool) {
/*      */       
/* 2261 */       float[] arrayOfFloat = d(paramInt2 * 4);
/*      */       
/* 2263 */       int i = paramInt2 * 4;
/* 2264 */       byte b1 = 0;
/*      */       
/* 2266 */       for (byte b2 = 0; b2 < i; b2 += 8) {
/*      */         
/* 2268 */         float f4 = paramArrayOffloat[b1];
/* 2269 */         float f5 = paramArrayOffloat[b1 + 1];
/*      */         
/* 2271 */         float f6 = f4 - f3;
/* 2272 */         float f7 = f4 + f2;
/* 2273 */         float f8 = f5 - f3;
/* 2274 */         float f9 = f5 + f2;
/*      */         
/* 2276 */         arrayOfFloat[b2 + 0] = f6;
/* 2277 */         arrayOfFloat[b2 + 1] = f8;
/*      */         
/* 2279 */         arrayOfFloat[b2 + 2] = f7;
/* 2280 */         arrayOfFloat[b2 + 3] = f8;
/*      */         
/* 2282 */         arrayOfFloat[b2 + 4] = f7;
/* 2283 */         arrayOfFloat[b2 + 5] = f9;
/*      */         
/* 2285 */         arrayOfFloat[b2 + 6] = f6;
/* 2286 */         arrayOfFloat[b2 + 7] = f9;
/*      */ 
/*      */         
/* 2289 */         b1 += 2;
/*      */       } 
/*      */       
/* 2292 */       b(arrayOfFloat, 0, paramInt2 * 4, paramPaint);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 2297 */       b(paramPaint);
/* 2298 */       TextureImpl.bindNone();
/*      */ 
/*      */       
/* 2301 */       L.glBegin(7);
/*      */       
/* 2303 */       int i = paramInt1 + paramInt2;
/*      */       
/* 2305 */       for (int j = paramInt1; j < i; j += 2) {
/*      */         
/* 2307 */         float f4 = paramArrayOffloat[j];
/* 2308 */         float f5 = paramArrayOffloat[j + 1];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2318 */         float f6 = f4 - f3;
/* 2319 */         float f7 = f4 + f2;
/* 2320 */         float f8 = f5 - f3;
/* 2321 */         float f9 = f5 + f2;
/*      */ 
/*      */         
/* 2324 */         L.glVertex2f(f6, f8);
/* 2325 */         L.glVertex2f(f7, f8);
/* 2326 */         L.glVertex2f(f7, f9);
/* 2327 */         L.glVertex2f(f6, f9);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2334 */       L.glEnd();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float[] paramArrayOffloat, int paramInt1, int paramInt2, Paint paramPaint) {
/* 2343 */     boolean bool = Main.a;
/*      */     
/* 2345 */     if (bool)
/*      */     {
/* 2347 */       GL11.glDisableClientState(32886);
/*      */     }
/*      */     
/* 2350 */     b(paramPaint);
/* 2351 */     TextureImpl.bindNone();
/*      */ 
/*      */ 
/*      */     
/* 2355 */     GL11.glEnableClientState(32884);
/*      */     
/* 2357 */     FloatBuffer floatBuffer = a(paramArrayOffloat, paramInt2);
/*      */     
/* 2359 */     GL11.glVertexPointer(2, 0, floatBuffer);
/*      */     
/* 2361 */     GL11.glDrawArrays(7, paramInt1, paramInt2 / 2);
/*      */ 
/*      */     
/* 2364 */     if (bool)
/*      */     {
/* 2366 */       GL11.glEnableClientState(32886);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2375 */   int H = -1;
/*      */   
/*      */   float I;
/*      */   float J;
/*      */   float K;
/* 2380 */   private static LineStripRenderer M = Renderer.getLineStripRenderer();
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/* 2384 */     Graphics.setCurrent(this.e);
/*      */ 
/*      */     
/* 2387 */     TextureImpl.bindNone();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2397 */     if (this.H != paramInt) {
/*      */       
/* 2399 */       this.H = paramInt;
/* 2400 */       this.I = 6.283185F / paramInt;
/* 2401 */       this.J = (float)FastTrig.cos(this.I);
/* 2402 */       this.K = (float)FastTrig.sin(this.I);
/*      */     } 
/* 2404 */     float f1 = this.J;
/* 2405 */     float f2 = this.K;
/*      */ 
/*      */ 
/*      */     
/* 2409 */     float f3 = paramFloat3;
/* 2410 */     float f4 = 0.0F;
/*      */ 
/*      */     
/* 2413 */     M.start();
/*      */     
/* 2415 */     paramInt++;
/*      */     
/* 2417 */     for (byte b = 0; b < paramInt; b++) {
/*      */ 
/*      */       
/* 2420 */       M.vertex(f3 + paramFloat1, f4 + paramFloat2);
/*      */ 
/*      */ 
/*      */       
/* 2424 */       float f5 = f3;
/* 2425 */       f3 = f1 * f3 - f2 * f4;
/* 2426 */       f4 = f2 * f5 + f1 * f4;
/*      */     } 
/*      */ 
/*      */     
/* 2430 */     M.end();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 2500 */     this.e.pushTransform();
/*      */     
/* 2502 */     this.E.push(new Rect(this.D));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/* 2510 */     this.e.popTransform();
/*      */     
/* 2512 */     this.D = this.E.pop();
/* 2513 */     t();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j() {
/* 2520 */     this.e.pushTransform();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void k() {
/* 2526 */     this.e.popTransform();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 2532 */     this.e.rotate(paramFloat2, paramFloat3, paramFloat1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2) {
/* 2538 */     this.e.scale(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 2547 */     this.e.translate(paramFloat3, paramFloat4);
/* 2548 */     this.e.scale(paramFloat1, paramFloat2);
/* 2549 */     this.e.translate(-paramFloat3, -paramFloat4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat1, float paramFloat2) {
/* 2559 */     this.e.translate(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(i parami) {
/* 2571 */     parami.a(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Paint paramPaint) {
/* 2578 */     b(paramPaint);
/*      */     
/* 2580 */     this.e.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Paint paramPaint) {
/* 2586 */     a(paramPaint, "", false);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void m() {
/* 2592 */     this.p = null;
/*      */     
/* 2594 */     this.e.flush();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void n() {
/* 2602 */     if (this.e != null)
/*      */     {
/* 2604 */       this.e.destroy();
/*      */     }
/* 2606 */     this.e = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(String paramString, Paint paramPaint) {
/* 2613 */     a(paramPaint, paramString);
/*      */     
/* 2615 */     int i = this.e.getFont().getLineHeight();
/*      */     
/* 2617 */     if (s())
/*      */     {
/* 2619 */       i = (int)(i / this.C);
/*      */     }
/*      */     
/* 2622 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(String paramString, Paint paramPaint) {
/* 2628 */     a(paramPaint, paramString);
/*      */     
/* 2630 */     int i = this.e.getFont().getWidth(paramString);
/*      */     
/* 2632 */     if (s())
/*      */     {
/* 2634 */       i = (int)(i / this.C);
/*      */     }
/*      */ 
/*      */     
/* 2638 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public com.corrodinggames.rts.gameFramework.j.e o() {
/* 2646 */     return k;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(com.corrodinggames.rts.gameFramework.j.e parame, File paramFile) {
/* 2657 */     r r1 = b(parame);
/*      */     
/* 2659 */     ImageIOWriter imageIOWriter = new ImageIOWriter();
/*      */     
/* 2661 */     boolean bool = true;
/*      */     
/* 2663 */     String str = "png";
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 2668 */       FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
/*      */       
/* 2670 */       imageIOWriter.saveImage(r1.z(), str, fileOutputStream, bool);
/*      */       
/* 2672 */       fileOutputStream.close();
/*      */     
/*      */     }
/* 2675 */     catch (IOException iOException) {
/*      */       
/* 2677 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
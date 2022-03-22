/*      */ package com.corrodinggames.rts.gameFramework.j;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.Bitmap;
/*      */ import android.graphics.BitmapFactory;
/*      */ import android.graphics.Canvas;
/*      */ import android.graphics.Matrix;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PorterDuff;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.os.Build;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.u;
/*      */ import java.io.File;
/*      */ import java.io.InputStream;
/*      */ import java.nio.IntBuffer;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class k
/*      */   implements l
/*      */ {
/*      */   private Context q;
/*      */   private h r;
/*      */   private a s;
/*      */   public Bitmap a;
/*   44 */   final Rect b = new Rect();
/*   45 */   final Rect c = new Rect();
/*      */   
/*   47 */   final RectF d = new RectF();
/*      */   
/*   49 */   final RectF e = new RectF();
/*      */   
/*   51 */   final Matrix f = new Matrix();
/*      */   
/*   53 */   final RectF g = new RectF();
/*      */   
/*      */   e h;
/*      */   
/*      */   public l a(e parame) {
/*   58 */     k k1 = new k();
/*   59 */     k1.a(this.q);
/*   60 */     Canvas canvas = new Canvas();
/*   61 */     Bitmap bitmap = parame.b();
/*   62 */     canvas.a(bitmap);
/*   63 */     k1.r = new g(canvas);
/*   64 */     k1.a = bitmap;
/*      */     
/*   66 */     return k1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int[] i;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Bitmap j;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a() {
/*   88 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Context paramContext) {
/*   98 */     this.q = paramContext;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b() {
/*  109 */     this.h = new p(a(R.drawable.error_outmem));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public h c() {
/*  120 */     return this.r;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(h paramh) {
/*  130 */     this.r = paramh;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(a parama) {
/*  139 */     this.s = parama;
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
/*      */   public e a(int paramInt) {
/*  158 */     return a(paramInt, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(int paramInt, boolean paramBoolean) {
/*  167 */     BitmapFactory.Options options = null;
/*      */     
/*  169 */     options = new BitmapFactory.Options();
/*      */     
/*  171 */     if (paramBoolean) {
/*      */       
/*  173 */       options.inPreferredConfig = Bitmap.Config.d;
/*      */     }
/*      */     else {
/*      */       
/*  177 */       options.inPreferredConfig = Bitmap.Config.b;
/*      */     } 
/*      */     
/*  180 */     options.inScaled = false;
/*      */     
/*  182 */     Bitmap bitmap = BitmapFactory.decodeResource(this.q.e(), paramInt, options);
/*  183 */     if (bitmap == null)
/*      */     {
/*  185 */       throw new RuntimeException("Could not load image with resId:" + paramInt);
/*      */     }
/*      */     
/*  188 */     return a(bitmap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(InputStream paramInputStream, boolean paramBoolean) {
/*      */     Bitmap bitmap;
/*  199 */     if (paramInputStream == null)
/*      */     {
/*  201 */       throw new RuntimeException("loadImage: steam is null");
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
/*  213 */     BitmapFactory.Options options = new BitmapFactory.Options();
/*      */     
/*  215 */     if (paramBoolean) {
/*      */       
/*  217 */       options.inPreferredConfig = Bitmap.Config.d;
/*      */     }
/*      */     else {
/*      */       
/*  221 */       options.inPreferredConfig = Bitmap.Config.b;
/*      */     } 
/*      */ 
/*      */     
/*  225 */     options.inScaled = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  240 */       bitmap = BitmapFactory.decodeStream(paramInputStream, null, options);
/*      */     }
/*  242 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/*  244 */       l.a(u.a, outOfMemoryError);
/*  245 */       if (this.h == null)
/*      */       {
/*  247 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/*  249 */       return this.h;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  254 */     if (bitmap == null) {
/*      */ 
/*      */       
/*  257 */       l.f("Could not load image from steam");
/*      */       
/*  259 */       return null;
/*      */     } 
/*      */     
/*  262 */     Log.d("RustedWarfare", "load a:" + paramBoolean + " as " + bitmap.d());
/*      */ 
/*      */     
/*  265 */     return a(bitmap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(Bitmap paramBitmap) {
/*  276 */     e e1 = new e();
/*      */     
/*  278 */     e1.a(paramBitmap);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  289 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(int paramInt1, int paramInt2, boolean paramBoolean) {
/*  296 */     return b(paramInt1, paramInt2, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(int paramInt1, int paramInt2, boolean paramBoolean) {
/*      */     Bitmap.Config config;
/*      */     Bitmap bitmap;
/*  304 */     if (paramBoolean) {
/*      */       
/*  306 */       config = Bitmap.Config.d;
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  311 */       config = Bitmap.Config.d;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  319 */       bitmap = Bitmap.a(paramInt1, paramInt2, config);
/*      */ 
/*      */ 
/*      */       
/*  323 */       if (!paramBoolean && config == Bitmap.Config.d)
/*      */       {
/*  325 */         if (Build.VERSION.SDK_INT >= 12)
/*      */         {
/*  327 */           bitmap.a(false);
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  340 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/*  342 */       l.a(u.b, outOfMemoryError);
/*  343 */       if (this.h == null)
/*      */       {
/*  345 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/*  347 */       return this.h;
/*      */     } 
/*      */     
/*  350 */     if (bitmap == null) {
/*      */       
/*  352 */       OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
/*      */       
/*  354 */       l.a(u.b, outOfMemoryError);
/*      */       
/*  356 */       if (this.h == null)
/*      */       {
/*  358 */         throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
/*      */       }
/*  360 */       return this.h;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  366 */     return a(bitmap);
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
/*      */   public void d() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/*  393 */     h h1 = this.r;
/*      */     
/*  395 */     h1.b();
/*      */     
/*  397 */     h1.a(paramFloat3 + 90.0F, paramFloat1, paramFloat2);
/*      */     
/*  399 */     b(parame, paramFloat1 - parame.o, paramFloat2 - parame.p, paramPaint);
/*      */     
/*  401 */     h1.a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, Rect paramRect, float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/*  412 */     h h1 = this.r;
/*      */     
/*  414 */     h1.b();
/*      */     
/*  416 */     int i = paramRect.b() >> 1;
/*  417 */     int j = paramRect.c() >> 1;
/*      */     
/*  419 */     this.e.a(paramFloat1 - i, paramFloat2 - j, paramFloat1 + i, paramFloat2 + j);
/*      */     
/*  421 */     h1.a(paramFloat3 + 90.0F, paramFloat1, paramFloat2);
/*  422 */     a(parame, paramRect, this.e, paramPaint);
/*      */ 
/*      */     
/*  425 */     h1.a();
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
/*      */   public void a(e parame, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/*  442 */     Bitmap bitmap = parame.b();
/*      */     
/*  444 */     if (bitmap != null) {
/*      */       
/*  446 */       this.r.a(bitmap, paramRect1, paramRect2, paramPaint);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  451 */     throw new RuntimeException("bitmap was not drawn");
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
/*  465 */   static IntBuffer k = IntBuffer.allocate(0);
/*  466 */   static IntBuffer l = IntBuffer.allocate(0);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean m = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(e parame, Rect paramRect1, Rect paramRect2, Paint paramPaint) {
/*  629 */     if (!this.m) {
/*      */       
/*  631 */       a(parame, paramRect1, paramRect2, paramPaint);
/*      */       
/*      */       return;
/*      */     } 
/*  635 */     Bitmap bitmap = parame.b();
/*      */     
/*  637 */     boolean bool = parame.e();
/*      */     
/*  639 */     if (paramPaint.f() < 255)
/*      */     {
/*  641 */       bool = true;
/*      */     }
/*      */     
/*  644 */     int i = this.a.b();
/*  645 */     int j = this.a.c();
/*      */     
/*  647 */     int m = bitmap.b();
/*  648 */     int n = bitmap.c();
/*      */     
/*  650 */     parame.h();
/*  651 */     int[] arrayOfInt1 = parame.f;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  678 */     if (j != this.a)
/*      */     {
/*  680 */       a(false);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  689 */     int[] arrayOfInt2 = i;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  699 */     int i1 = paramRect2.b;
/*  700 */     int i2 = paramRect2.d;
/*  701 */     int i3 = paramRect2.a;
/*  702 */     int i4 = paramRect2.c;
/*      */     
/*  704 */     int i5 = paramRect1.b;
/*  705 */     int i6 = paramRect1.d;
/*  706 */     int i7 = paramRect1.a;
/*  707 */     int i8 = paramRect1.c;
/*      */     
/*  709 */     float f1 = 1.0F;
/*  710 */     float f2 = 1.0F;
/*      */ 
/*      */     
/*  713 */     int i9 = i8 - i7;
/*  714 */     int i10 = i6 - i5;
/*      */     
/*  716 */     int i11 = i4 - i3;
/*  717 */     int i12 = i2 - i1;
/*      */     
/*  719 */     if (i12 != 0)
/*      */     {
/*  721 */       f1 = i10 / i12;
/*      */     }
/*  723 */     if (i11 != 0)
/*      */     {
/*  725 */       f2 = i9 / i11;
/*      */     }
/*      */ 
/*      */     
/*  729 */     if (i1 < 0) {
/*      */       
/*  731 */       i5 = (int)(i5 + -i1 * f1);
/*  732 */       i1 = 0;
/*      */     } 
/*  734 */     if (i2 > j - 1)
/*      */     {
/*  736 */       i2 = j - 1;
/*      */     }
/*      */     
/*  739 */     if (i1 > i2) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  745 */     if (i3 < 0) {
/*      */       
/*  747 */       i7 = (int)(i7 + -i3 * f2);
/*  748 */       i3 = 0;
/*      */     } 
/*  750 */     if (i4 > i - 1)
/*      */     {
/*  752 */       i4 = i - 1;
/*      */     }
/*      */     
/*  755 */     if (i3 > i4) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  760 */     i9 = i1 * i;
/*  761 */     i10 = i5 * m;
/*      */     
/*  763 */     i11 = i2 * i;
/*      */     
/*  765 */     float f3 = 0.0F;
/*      */     
/*  767 */     int i13 = i3;
/*  768 */     int i14 = i7;
/*  769 */     int i15 = i4;
/*      */     
/*  771 */     if (!bool) {
/*      */       
/*  773 */       float f = f2;
/*      */       
/*  775 */       while (i9 < i11)
/*      */       {
/*      */         
/*  778 */         int i16 = i9 + i13;
/*      */         
/*  780 */         int i17 = i10 + (int)f3 * m;
/*      */         
/*  782 */         int i18 = i17 + i14;
/*  783 */         float f4 = 0.0F;
/*      */         
/*  785 */         int i19 = i9 + i15;
/*      */ 
/*      */ 
/*      */         
/*  789 */         int i20 = i19 - 4;
/*      */ 
/*      */         
/*  792 */         while (i16 < i20) {
/*      */ 
/*      */ 
/*      */           
/*  796 */           int i21 = i18 + (int)f4;
/*  797 */           arrayOfInt2[i16] = arrayOfInt1[i21];
/*  798 */           f4 += f2;
/*  799 */           i16++;
/*      */           
/*  801 */           i21 = i18 + (int)f4;
/*  802 */           arrayOfInt2[i16] = arrayOfInt1[i21];
/*  803 */           f4 += f2;
/*  804 */           i16++;
/*      */           
/*  806 */           i21 = i18 + (int)f4;
/*  807 */           arrayOfInt2[i16] = arrayOfInt1[i21];
/*  808 */           f4 += f2;
/*  809 */           i16++;
/*      */           
/*  811 */           i21 = i18 + (int)f4;
/*  812 */           arrayOfInt2[i16] = arrayOfInt1[i21];
/*  813 */           f4 += f2;
/*  814 */           i16++;
/*      */         } 
/*      */ 
/*      */         
/*  818 */         while (i16 < i19) {
/*      */           
/*  820 */           int i21 = i18 + (int)f4;
/*      */           
/*  822 */           arrayOfInt2[i16] = arrayOfInt1[i21];
/*      */           
/*  824 */           i16++;
/*  825 */           f4 += f2;
/*      */         } 
/*      */         
/*  828 */         i9 += i;
/*      */         
/*  830 */         f3 += f1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  849 */       int i16 = paramPaint.e();
/*  850 */       int i17 = i16 >>> 24;
/*  851 */       int i18 = -16777216;
/*      */       
/*  853 */       while (i9 < i11) {
/*      */         
/*  855 */         int i19 = i9 + i13;
/*  856 */         int i20 = i10 + (int)f3 * m;
/*  857 */         int i21 = i20 + i14;
/*  858 */         float f = 0.0F;
/*  859 */         int i22 = i9 + i15;
/*      */         
/*  861 */         int i23 = -1;
/*  862 */         int i24 = 0;
/*  863 */         int i25 = 0;
/*      */         
/*  865 */         int i26 = 0;
/*  866 */         int i27 = 0;
/*      */         
/*  868 */         while (i19 < i22) {
/*      */           
/*  870 */           int i28 = i21 + (int)f;
/*      */           
/*  872 */           if (i28 != i23) {
/*      */             
/*  874 */             i24 = arrayOfInt1[i28];
/*  875 */             i25 = (i24 >>> 24) * i17 >> 8;
/*  876 */             i26 = i24 & 0xFF00FF;
/*  877 */             i27 = i24 & 0xFF00;
/*      */             
/*  879 */             if (i25 == 0) {
/*      */               
/*  881 */               i19++;
/*  882 */               f += f2;
/*      */               
/*      */               continue;
/*      */             } 
/*  886 */             i23 = i28;
/*      */           } 
/*      */           
/*  889 */           int i29 = arrayOfInt2[i19];
/*      */           
/*  891 */           int i30 = i29 & 0xFF00FF;
/*  892 */           int i31 = i29 & 0xFF00;
/*  893 */           i30 += (i26 - i30) * i25 >> 8;
/*  894 */           i31 += (i27 - i31) * i25 >> 8;
/*      */           
/*  896 */           int i32 = 0xFF000000 | i30 & 0xFF00FF | i31 & 0xFF00;
/*  897 */           arrayOfInt2[i19] = i32;
/*      */           
/*  899 */           i19++;
/*  900 */           f += f2;
/*      */         } 
/*      */         
/*  903 */         i9 += i;
/*  904 */         f3 += f1;
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
/*      */   public void a(Rect paramRect, Paint paramPaint) {
/*  919 */     if (!this.m) {
/*      */       
/*  921 */       b(paramRect, paramPaint);
/*      */       
/*      */       return;
/*      */     } 
/*  925 */     if (j != this.a)
/*      */     {
/*  927 */       a(false);
/*      */     }
/*      */     
/*  930 */     int i = this.a.b();
/*  931 */     int j = this.a.c();
/*      */     
/*  933 */     int[] arrayOfInt = i;
/*      */     
/*  935 */     int m = paramRect.b;
/*  936 */     int n = paramRect.d;
/*  937 */     int i1 = paramRect.a;
/*  938 */     int i2 = paramRect.c;
/*      */ 
/*      */     
/*  941 */     if (m < 0)
/*      */     {
/*  943 */       m = 0;
/*      */     }
/*  945 */     if (n > j - 1)
/*      */     {
/*  947 */       n = j - 1;
/*      */     }
/*      */     
/*  950 */     if (m > n) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  955 */     if (i1 < 0)
/*      */     {
/*  957 */       i1 = 0;
/*      */     }
/*  959 */     if (i2 > i - 1)
/*      */     {
/*  961 */       i2 = i - 1;
/*      */     }
/*      */     
/*  964 */     if (i1 > i2) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  969 */     int i3 = m * i;
/*  970 */     int i4 = n * i;
/*      */     
/*  972 */     int i5 = i1;
/*  973 */     int i6 = i2;
/*      */     
/*  975 */     int i7 = paramPaint.e();
/*  976 */     int i8 = i7 >>> 24;
/*      */     
/*  978 */     float f = 0.003921569F;
/*      */     
/*  980 */     boolean bool = (i8 < 255) ? true : false;
/*      */     
/*  982 */     if (!bool) {
/*      */       
/*  984 */       while (i3 < i4)
/*      */       {
/*  986 */         int i9 = i3 + i5;
/*  987 */         int i10 = i3 + i6;
/*      */         
/*  989 */         while (i9 < i10) {
/*      */           
/*  991 */           arrayOfInt[i9] = i7;
/*  992 */           i9++;
/*      */         } 
/*  994 */         i3 += i;
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1000 */       int i9 = i7 >> 16 & 0xFF;
/* 1001 */       int i10 = i7 >> 8 & 0xFF;
/* 1002 */       int i11 = i7 & 0xFF;
/*      */       
/* 1004 */       float f1 = i8 * 0.003921569F;
/* 1005 */       i9 = (int)(i9 * f1);
/* 1006 */       i10 = (int)(i10 * f1);
/* 1007 */       i11 = (int)(i11 * f1);
/*      */       
/* 1009 */       int i12 = 255 - i8;
/*      */       
/* 1011 */       int i13 = -16777216;
/*      */       
/* 1013 */       int i14 = 0xFF000000 | i9 << 16 | i10 << 8 | i11;
/*      */ 
/*      */ 
/*      */       
/* 1017 */       while (i3 < i4) {
/*      */         
/* 1019 */         int i15 = i3 + i5;
/* 1020 */         int i16 = i3 + i6;
/*      */         
/* 1022 */         while (i15 < i16) {
/*      */           
/* 1024 */           int i17 = arrayOfInt[i15];
/*      */           
/* 1026 */           int i18 = i17 & 0xFF00FF;
/* 1027 */           int i19 = i17 & 0xFF00;
/*      */           
/* 1029 */           i18 = i18 * i12 >> 8;
/* 1030 */           i19 = i19 * i12 >> 8;
/*      */           
/* 1032 */           int i20 = (i18 & 0xFF00FF | i19 & 0xFF00) + i14;
/*      */           
/* 1034 */           arrayOfInt[i15] = i20;
/*      */           
/* 1036 */           i15++;
/*      */         } 
/*      */         
/* 1039 */         i3 += i;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {
/* 1048 */     this.m = true;
/*      */     
/* 1050 */     if (j == this.a) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1057 */     int i = this.a.b();
/* 1058 */     int j = this.a.c();
/*      */     
/* 1060 */     int m = i * j;
/* 1061 */     if (i == null || i.length < m)
/*      */     {
/* 1063 */       i = new int[m];
/*      */     }
/*      */     
/* 1066 */     if (!paramBoolean)
/*      */     {
/* 1068 */       this.a.a(i, 0, i, 0, 0, i, j);
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
/* 1095 */     j = this.a;
/*      */   }
/*      */ 
/*      */   
/*      */   public void e() {
/* 1100 */     this.m = false;
/*      */     
/* 1102 */     if (j == this.a) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1115 */       int i = this.a.b();
/* 1116 */       int j = this.a.c();
/*      */       
/* 1118 */       this.a.b(i, 0, i, 0, 0, i, j);
/*      */ 
/*      */ 
/*      */       
/* 1122 */       j = null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, Rect paramRect, RectF paramRectF, Paint paramPaint) {
/* 1167 */     Bitmap bitmap = parame.b();
/*      */     
/* 1169 */     if (bitmap != null) {
/*      */ 
/*      */       
/* 1172 */       this.r.a(bitmap, paramRect, paramRectF, paramPaint);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1177 */     throw new RuntimeException("bitmap was not drawn");
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
/*      */   public void a(e parame, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1195 */     b(parame, paramFloat1 - parame.o, paramFloat2 - parame.p, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, float paramFloat1, float paramFloat2, Paint paramPaint, float paramFloat3, float paramFloat4) {
/* 1206 */     Matrix matrix = this.f;
/*      */     
/* 1208 */     matrix.a();
/*      */     
/* 1210 */     matrix.b(paramFloat4, paramFloat4);
/*      */     
/* 1212 */     if (paramFloat3 != 0.0F)
/*      */     {
/* 1214 */       matrix.a(paramFloat3 + 90.0F, parame.o, parame.p);
/*      */     }
/* 1216 */     matrix.a(paramFloat1, paramFloat2);
/*      */ 
/*      */     
/* 1219 */     this.r.a(parame.b(), matrix, paramPaint);
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
/*      */   public void b(e parame, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1254 */     Bitmap bitmap = parame.b();
/*      */     
/* 1256 */     if (bitmap != null) {
/*      */       
/* 1258 */       this.r.a(bitmap, paramFloat1, paramFloat2, paramPaint);
/*      */       
/*      */       return;
/*      */     } 
/* 1262 */     throw new RuntimeException("bitmap was not drawn");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, Rect paramRect, Paint paramPaint) {
/* 1271 */     a(parame, paramRect, paramPaint, 0, 0, 0, 0);
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
/*      */   public void a(e parame, Rect paramRect, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1283 */     if (parame.l() == 0 || parame.k() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1289 */     if (paramInt1 != 0) {
/*      */       
/* 1291 */       paramInt1 %= parame.l();
/* 1292 */       if (paramInt1 < 0)
/*      */       {
/* 1294 */         paramInt1 += parame.l();
/*      */       }
/*      */     } 
/*      */     
/* 1298 */     if (paramInt2 != 0) {
/*      */       
/* 1300 */       paramInt2 %= parame.k();
/* 1301 */       if (paramInt2 < 0)
/*      */       {
/* 1303 */         paramInt2 += parame.k();
/*      */       }
/*      */     } 
/*      */     
/* 1307 */     int i = paramRect.a - paramInt1;
/* 1308 */     int j = paramRect.b - paramInt2;
/*      */     
/* 1310 */     int m = parame.l();
/* 1311 */     int n = parame.k();
/*      */     
/* 1313 */     while (i < paramRect.c) {
/*      */       
/* 1315 */       while (j < paramRect.d) {
/*      */ 
/*      */         
/* 1318 */         int i1 = paramRect.c - i;
/* 1319 */         if (i1 > m)
/*      */         {
/* 1321 */           i1 = m;
/*      */         }
/*      */         
/* 1324 */         int i2 = paramRect.d - j;
/* 1325 */         if (i2 > n)
/*      */         {
/* 1327 */           i2 = n;
/*      */         }
/*      */         
/* 1330 */         if (i2 <= 0) {
/*      */           continue;
/*      */         }
/*      */         
/* 1334 */         if (i1 <= 0) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 1339 */         this.b.a(0, 0, i1, i2);
/* 1340 */         this.c.a(i, j, i + i1, j + i2);
/*      */ 
/*      */         
/* 1343 */         int i3 = this.c.a - paramRect.a;
/* 1344 */         if (i3 < 0) {
/*      */           
/* 1346 */           this.b.a -= i3;
/* 1347 */           this.c.a -= i3;
/*      */         } 
/*      */         
/* 1350 */         int i4 = this.c.b - paramRect.b;
/* 1351 */         if (i4 < 0) {
/*      */           
/* 1353 */           this.b.b -= i4;
/* 1354 */           this.c.b -= i4;
/*      */         } 
/*      */         
/* 1357 */         a(parame, this.b, this.c, paramPaint);
/*      */         
/* 1359 */         j += n - paramInt4;
/*      */       } 
/* 1361 */       i += m - paramInt3;
/* 1362 */       j = paramRect.b - paramInt2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, RectF paramRectF, Paint paramPaint, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/* 1373 */     if (parame.l() == 0 || parame.k() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1378 */     if (paramFloat1 != 0.0F) {
/*      */       
/* 1380 */       paramFloat1 %= parame.l();
/* 1381 */       if (paramFloat1 < 0.0F)
/*      */       {
/* 1383 */         paramFloat1 += parame.l();
/*      */       }
/*      */     } 
/*      */     
/* 1387 */     if (paramFloat2 != 0.0F) {
/*      */       
/* 1389 */       paramFloat2 %= parame.k();
/* 1390 */       if (paramFloat2 < 0.0F)
/*      */       {
/* 1392 */         paramFloat2 += parame.k();
/*      */       }
/*      */     } 
/*      */     
/* 1396 */     float f1 = paramRectF.a - paramFloat1;
/* 1397 */     float f2 = paramRectF.b - paramFloat2;
/*      */     
/* 1399 */     int i = parame.l();
/* 1400 */     int j = parame.k();
/*      */     
/* 1402 */     while (f1 < paramRectF.c) {
/*      */       
/* 1404 */       while (f2 < paramRectF.d) {
/*      */ 
/*      */         
/* 1407 */         float f3 = paramRectF.c - f1;
/* 1408 */         if (f3 > i)
/*      */         {
/* 1410 */           f3 = i;
/*      */         }
/*      */         
/* 1413 */         float f4 = paramRectF.d - f2;
/* 1414 */         if (f4 > j)
/*      */         {
/* 1416 */           f4 = j;
/*      */         }
/*      */         
/* 1419 */         if (f4 <= 0.0F) {
/*      */           continue;
/*      */         }
/*      */         
/* 1423 */         if (f3 <= 0.0F) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */         
/* 1428 */         this.b.a(0, 0, (int)f3, (int)f4);
/* 1429 */         this.d.a(f1, f2, f1 + f3, f2 + f4);
/*      */         
/* 1431 */         float f5 = this.d.a - paramRectF.a;
/* 1432 */         if (f5 < 0.0F) {
/*      */           
/* 1434 */           this.b.a = (int)(this.b.a - f5);
/* 1435 */           this.d.a -= f5;
/*      */         } 
/*      */         
/* 1438 */         float f6 = this.d.b - paramRectF.b;
/* 1439 */         if (f6 < 0.0F) {
/*      */           
/* 1441 */           this.b.b = (int)(this.b.b - f6);
/* 1442 */           this.d.b -= f6;
/*      */         } 
/*      */         
/* 1445 */         a(parame, this.b, this.d, paramPaint);
/*      */         
/* 1447 */         f2 += (j - paramInt2);
/*      */       } 
/* 1449 */       f1 += (i - paramInt1);
/* 1450 */       f2 = paramRectF.b - paramFloat2;
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
/* 1469 */     this.r.a(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int paramInt, PorterDuff.Mode paramMode) {
/* 1478 */     this.r.a(paramInt, paramMode);
/*      */   }
/*      */ 
/*      */   
/* 1482 */   static final RectF n = new RectF();
/* 1483 */   static final RectF o = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint1, Paint paramPaint2, float paramFloat3) {
/* 1492 */     float f = paramPaint1.a(paramString);
/*      */     
/* 1494 */     o.a(paramFloat1, paramFloat2, paramFloat1 + f, paramFloat2 + 
/* 1495 */         a(paramString, paramPaint1));
/*      */ 
/*      */     
/* 1498 */     n.a(o);
/*      */     
/* 1500 */     if (paramPaint1.j() == Paint.Align.b)
/*      */     {
/* 1502 */       n.a(-(f / 2.0F), 0.0F);
/*      */     }
/*      */ 
/*      */     
/* 1506 */     f.a(n, paramFloat3);
/*      */     
/* 1508 */     this.r.a(n, paramPaint2);
/*      */     
/* 1510 */     a(paramString, o.a + paramFloat3 / 2.0F, o.d - paramFloat3 / 2.0F, paramPaint1);
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
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 1524 */     this.r.a(paramString, paramFloat1, paramFloat2, paramPaint);
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
/*      */   public void b(Rect paramRect, Paint paramPaint) {
/* 1551 */     this.r.a(paramRect, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(RectF paramRectF, Paint paramPaint) {
/* 1561 */     this.r.a(paramRectF, paramPaint);
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
/*      */   public void f() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void g() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(Rect paramRect, Paint paramPaint) {
/* 1598 */     this.c.a(paramRect.a, paramRect.b, paramRect.a + paramRect.c, paramRect.b + paramRect.d);
/* 1599 */     c().a(this.c, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Rect paramRect) {
/* 1610 */     c().a(paramRect);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(RectF paramRectF) {
/* 1616 */     c().a(paramRectF);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, Paint paramPaint) {
/* 1622 */     c().a(paramFloat1, paramFloat2, paramFloat3, paramPaint);
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
/*      */   public void a(float[] paramArrayOffloat, int paramInt1, int paramInt2, Paint paramPaint) {
/* 1639 */     c().a(paramArrayOffloat, paramInt1, paramInt2, paramPaint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void h() {
/* 1646 */     c().b();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/* 1652 */     c().a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void j() {
/* 1659 */     c().b();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void k() {
/* 1665 */     c().a();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1671 */     c().a(paramFloat1, paramFloat2, paramFloat3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2) {
/* 1677 */     c().a(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 1683 */     c().a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat1, float paramFloat2) {
/* 1690 */     c().b(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Paint paramPaint) {
/* 1697 */     c().a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramPaint);
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
/*      */   public void a(i parami) {
/* 1711 */     c().a(parami);
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
/*      */   public void l() {
/* 1744 */     a(0, PorterDuff.Mode.CLEAR);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Paint paramPaint) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void m() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void n() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1779 */   static Rect p = new Rect();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(String paramString, Paint paramPaint) {
/* 1787 */     return (int)paramPaint.k();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(String paramString, Paint paramPaint) {
/* 1794 */     paramPaint.a(paramString, 0, paramString.length(), p);
/*      */     
/* 1796 */     return p.b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e o() {
/* 1803 */     return this.h;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(e parame, File paramFile) {
/* 1810 */     throw new RuntimeException("writeImageToFile not yet supported");
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
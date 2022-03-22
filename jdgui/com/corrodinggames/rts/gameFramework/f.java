/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.PrintWriter;
/*      */ import java.io.StringWriter;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.lang.reflect.Field;
/*      */ import java.math.BigInteger;
/*      */ import java.nio.charset.Charset;
/*      */ import java.security.MessageDigest;
/*      */ import java.security.NoSuchAlgorithmException;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class f
/*      */ {
/*   51 */   static final Random a = new Random();
/*      */ 
/*      */   
/*   54 */   static final Random b = new Random();
/*      */ 
/*      */   
/*   57 */   public static final PointF c = new PointF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp void a() {
/*   64 */     b.setSeed(0L);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int a(af paramaf, int paramInt1, int paramInt2) {
/*   72 */     return a((w)paramaf, paramInt1, paramInt2, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(af paramaf, float paramFloat1, float paramFloat2, int paramInt) {
/*   78 */     if (paramaf == null)
/*      */     {
/*   80 */       return a((int)(paramFloat1 * 1000.0F), (int)(paramFloat2 * 1000.0F), paramInt) * 0.001F;
/*      */     }
/*      */ 
/*      */     
/*   84 */     return a((w)paramaf, (int)(paramFloat1 * 1000.0F), (int)(paramFloat2 * 1000.0F), paramInt) * 0.001F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float b(af paramaf, float paramFloat1, float paramFloat2, int paramInt) {
/*   90 */     return a((w)paramaf, (int)(paramFloat1 * 1000.0F), (int)(paramFloat2 * 1000.0F), paramInt) * 0.001F;
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
/*      */   public static final strictfp int a(w paramw, int paramInt1, int paramInt2, int paramInt3) {
/*  103 */     l l = l.u();
/*      */     
/*  105 */     if (paramInt1 >= paramInt2) {
/*      */       
/*  107 */       if (paramInt1 > paramInt2)
/*      */       {
/*  109 */         l.b("min>max");
/*      */       }
/*  111 */       return paramInt1;
/*      */     } 
/*      */     
/*  114 */     int i = l.bg + 1;
/*      */ 
/*      */     
/*  117 */     int j = 0;
/*  118 */     j = (int)(j + paramw.dA * 1313L);
/*  119 */     j = (int)(j + paramw.dH * 13.0F);
/*  120 */     j = (int)(j + paramw.dI * 13.0F);
/*      */     
/*  122 */     j = (int)(j + paramw.dH * 130.0F);
/*  123 */     j = (int)(j + paramw.dI * 130.0F);
/*      */     
/*  125 */     if (paramw instanceof af) {
/*      */       
/*  127 */       int k = ((af)paramw).bi;
/*  128 */       j += k * 13131;
/*  129 */       j += k * i;
/*      */     } 
/*      */     
/*  132 */     j += paramInt3 * 133 * paramInt2;
/*  133 */     j = (int)(j + paramInt3 * paramw.dA + paramInt3);
/*  134 */     j += paramInt3 * i * 1313;
/*      */     
/*  136 */     j += i * 13 + i % 10;
/*      */     
/*  138 */     j %= paramInt2 - paramInt1;
/*      */     
/*  140 */     if (j < 0)
/*      */     {
/*  142 */       j = -j;
/*      */     }
/*      */     
/*  145 */     j += paramInt1;
/*      */     
/*  147 */     return j;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(float paramFloat1, float paramFloat2, int paramInt) {
/*  154 */     return a((int)(paramFloat1 * 100.0F), (int)(paramFloat2 * 100.0F), paramInt) / 100.0F;
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
/*      */   public static final strictfp int a(int paramInt1, int paramInt2, int paramInt3) {
/*  166 */     l l = l.u();
/*      */     
/*  168 */     if (paramInt1 >= paramInt2) {
/*      */       
/*  170 */       if (paramInt1 > paramInt2)
/*      */       {
/*  172 */         l.b("min>max");
/*      */       }
/*  174 */       return paramInt1;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  179 */     int i = 0;
/*      */     
/*  181 */     i += paramInt3 * 133 * paramInt2;
/*  182 */     i += paramInt3 * 13;
/*      */     
/*  184 */     i += paramInt3 * l.bg * 1313;
/*      */     
/*  186 */     i += l.bg * 13 + l.bg % 10;
/*      */     
/*  188 */     i %= paramInt2 - paramInt1;
/*      */     
/*  190 */     if (i < 0)
/*      */     {
/*  192 */       i = -i;
/*      */     }
/*      */     
/*  195 */     i += paramInt1;
/*      */ 
/*      */     
/*  198 */     if (i < paramInt1 || i > paramInt2)
/*      */     {
/*  200 */       l.b("notRandInt number not in range: " + i + " min:" + paramInt1 + " max:" + paramInt2);
/*      */     }
/*      */ 
/*      */     
/*  204 */     return i;
/*      */   }
/*      */   
/*      */   public static strictfp String a(String paramString) {
/*  208 */     Calendar calendar = Calendar.getInstance();
/*  209 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(paramString);
/*  210 */     return simpleDateFormat.format(calendar.getTime());
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp void a(InputStream paramInputStream, OutputStream paramOutputStream) {
/*  215 */     byte[] arrayOfByte = new byte[1024];
/*      */     
/*      */     int i;
/*  218 */     while ((i = paramInputStream.read(arrayOfByte)) != -1) {
/*  219 */       paramOutputStream.write(arrayOfByte, 0, i);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp String a(InputStream paramInputStream) {
/*  225 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*  226 */     byte[] arrayOfByte = new byte[1024];
/*      */     try {
/*      */       int i;
/*  229 */       while ((i = paramInputStream.read(arrayOfByte)) != -1) {
/*  230 */         byteArrayOutputStream.write(arrayOfByte, 0, i);
/*      */       }
/*  232 */       byteArrayOutputStream.close();
/*  233 */       paramInputStream.close();
/*  234 */     } catch (IOException iOException) {
/*  235 */       iOException.printStackTrace();
/*      */     } 
/*  237 */     return byteArrayOutputStream.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(float paramFloat) {
/*  244 */     return (float)StrictMath.sqrt(paramFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  251 */   private static final byte[] j = new byte[1001];
/*      */   
/*      */   static {
/*      */     byte b;
/*  255 */     for (b = 0; b < j.length; b++)
/*      */     {
/*  257 */       j[b] = (byte)StrictMath.round(a(b));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int a(int paramInt) {
/*  266 */     if (paramInt > 1000 || paramInt < 0)
/*      */     {
/*  268 */       return StrictMath.round(a(paramInt));
/*      */     }
/*  270 */     return j[paramInt];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(float paramFloat1, float paramFloat2) {
/*  279 */     if (paramFloat1 > paramFloat2)
/*  280 */       return paramFloat1 - paramFloat2; 
/*  281 */     if (paramFloat1 < -paramFloat2)
/*  282 */       return paramFloat1 + paramFloat2; 
/*  283 */     return 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  289 */     if (paramFloat1 > paramFloat2 + paramFloat3)
/*  290 */       return paramFloat1 - paramFloat3; 
/*  291 */     if (paramFloat1 < paramFloat2 - paramFloat3)
/*  292 */       return paramFloat1 + paramFloat3; 
/*  293 */     return paramFloat2;
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
/*      */   public static final strictfp float b(float paramFloat1, float paramFloat2) {
/*  328 */     if (paramFloat1 > paramFloat2)
/*  329 */       return paramFloat2; 
/*  330 */     if (paramFloat1 < -paramFloat2)
/*  331 */       return -paramFloat2; 
/*  332 */     return paramFloat1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp float b(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  337 */     if (paramFloat1 > paramFloat3)
/*  338 */       return paramFloat3; 
/*  339 */     if (paramFloat1 < paramFloat2)
/*  340 */       return paramFloat2; 
/*  341 */     return paramFloat1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int b(int paramInt1, int paramInt2, int paramInt3) {
/*  347 */     if (paramInt1 > paramInt3)
/*  348 */       return paramInt3; 
/*  349 */     if (paramInt1 < paramInt2)
/*  350 */       return paramInt2; 
/*  351 */     return paramInt1;
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
/*      */   public static final strictfp void a(float paramFloat1, float paramFloat2, float paramFloat3, PointF paramPointF) {
/*  371 */     float f1 = h(paramFloat3);
/*  372 */     float f2 = i(paramFloat3);
/*      */ 
/*      */     
/*  375 */     paramPointF.a -= paramFloat1;
/*  376 */     paramPointF.b -= paramFloat2;
/*      */ 
/*      */     
/*  379 */     float f3 = paramPointF.a * f2 - paramPointF.b * f1;
/*  380 */     float f4 = paramPointF.a * f1 + paramPointF.b * f2;
/*      */ 
/*      */     
/*  383 */     paramPointF.a = f3 + paramFloat1;
/*  384 */     paramPointF.b = f4 + paramFloat2;
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
/*      */   public static final strictfp float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  398 */     return (paramFloat1 - paramFloat3) * (paramFloat1 - paramFloat3) + (paramFloat2 - paramFloat4) * (paramFloat2 - paramFloat4);
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
/*      */   public static final strictfp float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  412 */     return (float)StrictMath.sqrt(((paramFloat1 - paramFloat3) * (paramFloat1 - paramFloat3) + (paramFloat2 - paramFloat4) * (paramFloat2 - paramFloat4)));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  418 */     return a((int)((paramFloat1 - paramFloat3) * (paramFloat1 - paramFloat3) + (paramFloat2 - paramFloat4) * (paramFloat2 - paramFloat4)));
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
/*      */   public static final strictfp int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  433 */     int i = paramInt1 - paramInt3;
/*  434 */     int j = paramInt2 - paramInt4;
/*  435 */     if (i < 0) i = -i; 
/*  436 */     if (j < 0) j = -j;
/*      */     
/*  438 */     if (i > j) return i; 
/*  439 */     return j;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float a(float paramFloat, boolean paramBoolean) {
/*  447 */     if (paramBoolean) {
/*      */       
/*  449 */       while (paramFloat > 360.0F || paramFloat < 0.0F) {
/*      */         
/*  451 */         if (paramFloat > 360.0F) paramFloat -= 360.0F; 
/*  452 */         if (paramFloat < 0.0F) paramFloat += 360.0F;
/*      */       
/*      */       } 
/*      */     } else {
/*      */       
/*  457 */       while (paramFloat > 180.0F || paramFloat < -180.0F) {
/*      */         
/*  459 */         if (paramFloat > 180.0F) paramFloat -= 360.0F; 
/*  460 */         if (paramFloat < -180.0F) paramFloat += 360.0F; 
/*      */       } 
/*      */     } 
/*  463 */     return paramFloat;
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
/*      */   public static final strictfp float c(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  483 */     paramFloat1 %= 360.0F;
/*  484 */     paramFloat2 %= 360.0F;
/*  485 */     float f1 = paramFloat2 - paramFloat1;
/*  486 */     if (f1 > 180.0F) f1 -= 360.0F; 
/*  487 */     if (f1 < -180.0F) f1 += 360.0F;
/*      */     
/*  489 */     if (f1 > paramFloat3) return paramFloat3; 
/*  490 */     if (f1 < -paramFloat3) return -paramFloat3; 
/*  491 */     return f1;
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
/*      */   public static final strictfp float d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  518 */     return b(i(paramFloat4 - paramFloat2, paramFloat3 - paramFloat1));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean a(PointF paramPointF1, PointF paramPointF2, PointF paramPointF3, PointF paramPointF4) {
/*  527 */     float f1 = (paramPointF4.b - paramPointF3.b) * (paramPointF2.a - paramPointF1.a) - (paramPointF4.a - paramPointF3.a) * (paramPointF2.b - paramPointF1.b);
/*  528 */     float f2 = (paramPointF4.a - paramPointF3.a) * (paramPointF1.b - paramPointF3.b) - (paramPointF4.b - paramPointF3.b) * (paramPointF1.a - paramPointF3.a);
/*      */     
/*  530 */     float f3 = (paramPointF2.a - paramPointF1.a) * (paramPointF1.b - paramPointF3.b) - (paramPointF2.b - paramPointF1.b) * (paramPointF1.a - paramPointF3.a);
/*      */     
/*  532 */     if (f1 == 0.0F) {
/*      */       
/*  534 */       if (f2 == 0.0F && f3 == 0.0F)
/*      */       {
/*  536 */         return false;
/*      */       }
/*  538 */       return false;
/*      */     } 
/*  540 */     float f4 = f2 / f1;
/*  541 */     float f5 = f3 / f1;
/*      */     
/*  543 */     return (f4 >= 0.0F && f4 <= 1.0F && f5 >= 0.0F && f5 <= 1.0F);
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
/*  561 */   static final PointF d = new PointF();
/*  562 */   static final PointF e = new PointF();
/*  563 */   static final PointF f = new PointF();
/*  564 */   static final PointF g = new PointF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float c(float paramFloat1, float paramFloat2) {
/*  682 */     return a.nextFloat() * (paramFloat2 - paramFloat1) + paramFloat1;
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
/*      */   public static final strictfp float d(float paramFloat1, float paramFloat2) {
/*  741 */     return a.nextFloat() * (paramFloat2 - paramFloat1) + paramFloat1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int b(int paramInt) {
/*  747 */     if (paramInt == 0)
/*      */     {
/*  749 */       return 0;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  754 */     return a.nextInt(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int a(int paramInt1, int paramInt2) {
/*      */     int i;
/*  762 */     if (paramInt2 == paramInt1) {
/*      */       
/*  764 */       i = 0;
/*      */     }
/*      */     else {
/*      */       
/*  768 */       i = a.nextInt(paramInt2 - paramInt1 + 1);
/*      */     } 
/*  770 */     return paramInt1 + i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp void a(Rect paramRect) {
/*  777 */     if (paramRect.c < paramRect.a) {
/*      */       
/*  779 */       int i = paramRect.c;
/*  780 */       paramRect.c = paramRect.a;
/*  781 */       paramRect.a = i;
/*      */     } 
/*      */     
/*  784 */     if (paramRect.d < paramRect.b) {
/*      */       
/*  786 */       int i = paramRect.d;
/*  787 */       paramRect.d = paramRect.b;
/*  788 */       paramRect.b = i;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp void a(RectF paramRectF) {
/*  794 */     if (paramRectF.c < paramRectF.a) {
/*      */       
/*  796 */       float f1 = paramRectF.c;
/*  797 */       paramRectF.c = paramRectF.a;
/*  798 */       paramRectF.a = f1;
/*      */     } 
/*      */     
/*  801 */     if (paramRectF.d < paramRectF.b) {
/*      */       
/*  803 */       float f1 = paramRectF.d;
/*  804 */       paramRectF.d = paramRectF.b;
/*  805 */       paramRectF.b = f1;
/*      */     } 
/*      */   }
/*      */   
/*  809 */   static final PointF h = new PointF();
/*      */   
/*      */   public static final strictfp PointF d(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  812 */     h.a(paramFloat1, paramFloat2 - paramFloat3);
/*  813 */     return h;
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
/*      */   public static final strictfp float b(float paramFloat) {
/*  826 */     return paramFloat * 57.29578F;
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
/*      */   public static final strictfp float e(float paramFloat1, float paramFloat2) {
/*  842 */     return (float)StrictMath.pow(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp double a(double paramDouble) {
/*  847 */     return (paramDouble < 0.0D) ? -paramDouble : paramDouble;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp float c(float paramFloat) {
/*  852 */     return (paramFloat < 0.0F) ? -paramFloat : paramFloat;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp int c(int paramInt) {
/*  857 */     return (paramInt < 0) ? -paramInt : paramInt;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp int b(int paramInt1, int paramInt2) {
/*  862 */     return (paramInt1 > paramInt2) ? paramInt1 : paramInt2;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp int c(int paramInt1, int paramInt2) {
/*  867 */     return (paramInt1 < paramInt2) ? paramInt1 : paramInt2;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp float f(float paramFloat1, float paramFloat2) {
/*  872 */     return (paramFloat1 > paramFloat2) ? paramFloat1 : paramFloat2;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp float g(float paramFloat1, float paramFloat2) {
/*  877 */     return (paramFloat1 < paramFloat2) ? paramFloat1 : paramFloat2;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean h(float paramFloat1, float paramFloat2) {
/*  883 */     return (c(paramFloat1 - paramFloat2) < 0.05F);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp double a(double paramDouble1, double paramDouble2) {
/*  888 */     return (paramDouble1 < paramDouble2) ? paramDouble1 : paramDouble2;
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
/*      */   public static strictfp boolean e(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  902 */     if (c(c(paramFloat1) - c(paramFloat2)) < paramFloat3)
/*      */     {
/*  904 */       return true;
/*      */     }
/*      */     
/*  907 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp float d(float paramFloat) {
/*  913 */     return (int)(paramFloat + 0.5F);
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
/*      */   public static final strictfp int e(float paramFloat) {
/*  925 */     if (paramFloat > 0.0F) return (int)paramFloat; 
/*  926 */     if (paramFloat < 0.0F) return (int)paramFloat - 1; 
/*  927 */     return 0;
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
/*      */   public static strictfp void a(RectF paramRectF, float paramFloat) {
/*  958 */     paramRectF.a -= paramFloat;
/*  959 */     paramRectF.b -= paramFloat;
/*  960 */     paramRectF.c += paramFloat;
/*  961 */     paramRectF.d += paramFloat;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void a(Rect paramRect, float paramFloat) {
/*  966 */     paramRect.a = (int)(paramRect.a - paramFloat);
/*  967 */     paramRect.b = (int)(paramRect.b - paramFloat);
/*  968 */     paramRect.c = (int)(paramRect.c + paramFloat);
/*  969 */     paramRect.d = (int)(paramRect.d + paramFloat);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void b(Rect paramRect, float paramFloat) {
/*  974 */     paramRect.a = (int)(paramRect.a - paramFloat);
/*  975 */     paramRect.b = (int)(paramRect.b - paramFloat);
/*  976 */     paramRect.c = (int)(paramRect.c + paramFloat * 2.0F);
/*  977 */     paramRect.d = (int)(paramRect.d + paramFloat * 2.0F);
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
/*  989 */   private static final char[] k = new char[36];
/*      */   static {
/*  991 */     for (b = 0; b < 10; b++)
/*  992 */       k[b] = (char)(48 + b); 
/*  993 */     for (b = 10; b < 36; b++) {
/*  994 */       k[b] = (char)(97 + b - 10);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String d(int paramInt) {
/* 1000 */     StringBuilder stringBuilder = new StringBuilder();
/* 1001 */     for (byte b = 0; b < paramInt; b++) {
/* 1002 */       char c = k[a.nextInt(k.length)];
/* 1003 */       stringBuilder.append(c);
/*      */     } 
/* 1005 */     return stringBuilder.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String b() {
/* 1010 */     return UUID.randomUUID().toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(boolean paramBoolean) {
/* 1015 */     return paramBoolean ? "true" : "false";
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
/*      */   public static strictfp String b(double paramDouble) {
/* 1031 */     if (paramDouble == (int)paramDouble)
/*      */     {
/* 1033 */       return "" + (int)paramDouble;
/*      */     }
/* 1035 */     return "" + paramDouble;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String f(float paramFloat) {
/* 1040 */     return a(paramFloat, 2);
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
/*      */   public static strictfp String c(double paramDouble) {
/* 1057 */     if (paramDouble == (int)paramDouble)
/*      */     {
/* 1059 */       return "" + (int)paramDouble;
/*      */     }
/*      */     
/* 1062 */     return String.format("%.2f", new Object[] { Double.valueOf(paramDouble) });
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(float paramFloat, int paramInt) {
/* 1067 */     if (paramFloat == (int)paramFloat)
/*      */     {
/* 1069 */       return "" + (int)paramFloat;
/*      */     }
/*      */     
/* 1072 */     return String.format("%." + paramInt + "f", new Object[] { Float.valueOf(paramFloat) });
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(double paramDouble, int paramInt) {
/* 1077 */     if (paramDouble == (int)paramDouble)
/*      */     {
/* 1079 */       return "" + (int)paramDouble;
/*      */     }
/*      */     
/* 1082 */     return String.format("%." + paramInt + "f", new Object[] { Double.valueOf(paramDouble) });
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String g(float paramFloat) {
/* 1087 */     if (paramFloat == (int)paramFloat)
/*      */     {
/* 1089 */       return "" + (int)paramFloat + "s";
/*      */     }
/*      */     
/* 1092 */     return String.format("%.1fs", new Object[] { Float.valueOf(paramFloat) });
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(String paramString, int paramInt) {
/* 1097 */     if (paramString == null) return null;
/*      */     
/* 1099 */     if (paramString.length() < paramInt)
/*      */     {
/* 1101 */       return paramString;
/*      */     }
/*      */     
/* 1104 */     return paramString.substring(0, Math.min(paramString.length(), paramInt));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String b(String paramString, int paramInt) {
/* 1110 */     if (paramString == null) return null;
/*      */     
/* 1112 */     if (paramString.length() < paramInt)
/*      */     {
/* 1114 */       return paramString;
/*      */     }
/* 1116 */     paramInt -= 3;
/* 1117 */     if (paramInt < 1)
/*      */     {
/* 1119 */       paramInt = 1;
/*      */     }
/*      */     
/* 1122 */     return paramString.substring(0, Math.min(paramString.length(), paramInt)) + "...";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String b(String paramString) {
/*      */     byte[] arrayOfByte;
/*      */     try {
/* 1130 */       arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8"));
/*      */     }
/* 1132 */     catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/* 1133 */       throw new RuntimeException("MD5 should be supported", noSuchAlgorithmException);
/*      */     }
/* 1135 */     catch (UnsupportedEncodingException unsupportedEncodingException) {
/* 1136 */       throw new RuntimeException("UTF-8 should be supported", unsupportedEncodingException);
/*      */     } 
/* 1138 */     StringBuilder stringBuilder = new StringBuilder(arrayOfByte.length * 2);
/* 1139 */     for (byte b : arrayOfByte) {
/* 1140 */       int i = b & 0xFF;
/* 1141 */       if (i < 16) stringBuilder.append('0'); 
/* 1142 */       stringBuilder.append(Integer.toHexString(i));
/*      */     } 
/* 1144 */     return stringBuilder.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String c(String paramString) {
/* 1151 */     String str = a(f(paramString));
/* 1152 */     str = a(str, 14);
/* 1153 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String d(String paramString) {
/* 1158 */     String str = a(f(paramString));
/* 1159 */     str = a(str, 4);
/* 1160 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String c(String paramString, int paramInt) {
/* 1165 */     String str = a(f(paramString));
/* 1166 */     for (byte b = 0; b < paramInt; b++)
/*      */     {
/* 1168 */       str = a(f(str));
/*      */     }
/* 1170 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String e(String paramString) {
/* 1175 */     return a(f(paramString));
/*      */   }
/*      */   
/*      */   static strictfp byte[] f(String paramString) {
/* 1179 */     MessageDigest messageDigest = null;
/*      */     try {
/* 1181 */       messageDigest = MessageDigest.getInstance("SHA-256");
/*      */     }
/* 1183 */     catch (NoSuchAlgorithmException noSuchAlgorithmException) {
/*      */       
/* 1185 */       throw new RuntimeException(noSuchAlgorithmException);
/*      */     } 
/* 1187 */     messageDigest.reset();
/* 1188 */     return messageDigest.digest(paramString.getBytes());
/*      */   }
/*      */   
/*      */   static strictfp String a(byte[] paramArrayOfbyte) {
/* 1192 */     return String.format("%0" + (paramArrayOfbyte.length * 2) + "X", new Object[] { new BigInteger(1, paramArrayOfbyte) });
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
/*      */   public static strictfp int c() {
/* 1217 */     int i = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1235 */       File file = new File("/sys/devices/system/cpu/");
/*      */       
/* 1237 */       if (file.exists()) {
/*      */ 
/*      */         
/* 1240 */         File[] arrayOfFile = file.listFiles(new f$a());
/*      */         
/* 1242 */         i = arrayOfFile.length;
/*      */       } 
/* 1244 */     } catch (Exception exception) {
/*      */       
/* 1246 */       exception.printStackTrace();
/* 1247 */       i = 1;
/*      */     } 
/*      */ 
/*      */     
/* 1251 */     if (i == 1) {
/*      */       
/* 1253 */       int j = Runtime.getRuntime().availableProcessors();
/* 1254 */       if (j > 1)
/*      */       {
/* 1256 */         i = j;
/*      */       }
/*      */     } 
/*      */     
/* 1260 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
/* 1269 */     System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, 0, paramArrayOfbyte1.length);
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
/*      */   public static strictfp float f(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1296 */     return paramFloat1 + (paramFloat2 - paramFloat1) * paramFloat3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int a(int paramInt1, int paramInt2, float paramFloat) {
/* 1306 */     int i = Color.a(paramInt1);
/* 1307 */     int j = Color.b(paramInt1);
/* 1308 */     int k = Color.c(paramInt1);
/* 1309 */     int m = Color.d(paramInt1);
/*      */     
/* 1311 */     int n = Color.a(paramInt2);
/* 1312 */     int i1 = Color.b(paramInt2);
/* 1313 */     int i2 = Color.c(paramInt2);
/* 1314 */     int i3 = Color.d(paramInt2);
/*      */ 
/*      */ 
/*      */     
/* 1318 */     return Color.a(
/* 1319 */         (int)f(i, n, paramFloat), 
/* 1320 */         (int)f(j, i1, paramFloat), 
/* 1321 */         (int)f(k, i2, paramFloat), 
/* 1322 */         (int)f(m, i3, paramFloat));
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
/*      */   public static strictfp String d(String paramString, int paramInt) {
/* 1339 */     String str = "";
/* 1340 */     for (byte b = 0; b <= paramInt; b++)
/*      */     {
/* 1342 */       str = str + paramString;
/*      */     }
/* 1344 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String e(String paramString, int paramInt) {
/* 1350 */     for (int i = paramString.length(); i < paramInt; i++)
/*      */     {
/* 1352 */       paramString = paramString + " ";
/*      */     }
/* 1354 */     return paramString;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp String a(String paramString1, int paramInt, String paramString2) {
/* 1359 */     for (int i = paramString1.length(); i < paramInt; i++)
/*      */     {
/* 1361 */       paramString1 = paramString2 + paramString1;
/*      */     }
/* 1363 */     return paramString1;
/*      */   }
/*      */   
/*      */   public static strictfp String f(String paramString, int paramInt) {
/* 1367 */     return String.format("%1$-" + paramInt + "s", new Object[] { paramString });
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
/*      */   public static strictfp String a(Class paramClass, int paramInt) {
/*      */     try {
/* 1385 */       for (Field field : paramClass.getFields())
/*      */       {
/* 1387 */         int i = field.getInt(null);
/* 1388 */         if (i == paramInt)
/*      */         {
/* 1390 */           return field.getName();
/*      */         }
/*      */       }
/*      */     
/* 1394 */     } catch (IllegalArgumentException illegalArgumentException) {
/*      */       
/* 1396 */       throw new RuntimeException(illegalArgumentException);
/*      */     }
/* 1398 */     catch (IllegalAccessException illegalAccessException) {
/*      */       
/* 1400 */       throw new RuntimeException(illegalAccessException);
/*      */     } 
/* 1402 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String e(int paramInt) {
/* 1409 */     String str = a(R.drawable.class, paramInt);
/* 1410 */     if (str != null)
/*      */     {
/* 1412 */       return a.a("res/drawable", str);
/*      */     }
/*      */     
/* 1415 */     str = a(R.raw.class, paramInt);
/* 1416 */     if (str != null)
/*      */     {
/* 1418 */       return a.a("res/raw", str);
/*      */     }
/*      */     
/* 1421 */     return null;
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
/*      */   public static final strictfp String f(int paramInt) {
/* 1447 */     return String.format("#%06X", new Object[] { Integer.valueOf(0xFFFFFF & paramInt) });
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
/*      */   public static final strictfp String g(String paramString) {
/* 1459 */     if (paramString == null)
/*      */     {
/* 1461 */       return null;
/*      */     }
/* 1463 */     File file = new File(paramString);
/* 1464 */     String str = file.getName();
/* 1465 */     str = str.replaceFirst("[.][^.]+$", "");
/* 1466 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp String h(String paramString) {
/* 1472 */     if (paramString.contains("\\"))
/*      */     {
/* 1474 */       paramString = paramString.replace('\\', '/');
/*      */     }
/*      */     
/* 1477 */     File file = new File(paramString);
/*      */     
/* 1479 */     return file.getParent();
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
/*      */   public static final strictfp boolean a(Rect paramRect, RectF paramRectF) {
/* 1491 */     return (paramRect.a < paramRectF.c && paramRectF.a < paramRect.c && paramRect.b < paramRectF.d && paramRectF.b < paramRect.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean a(RectF paramRectF1, RectF paramRectF2) {
/* 1501 */     return (paramRectF1.a < paramRectF2.c && paramRectF2.a < paramRectF1.c && paramRectF1.b < paramRectF2.d && paramRectF2.b < paramRectF1.d);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1600 */     return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
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
/*      */   public static final strictfp long a(long paramLong1, long paramLong2) {
/* 1620 */     return (paramLong2 - paramLong1) / 1000000L;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp int a(String paramString, char paramChar) {
/* 1626 */     byte b1 = 0;
/* 1627 */     for (byte b2 = 0; b2 < paramString.length(); b2++) {
/*      */       
/* 1629 */       if (paramString.charAt(b2) == paramChar)
/*      */       {
/* 1631 */         b1++;
/*      */       }
/*      */     } 
/* 1634 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp String i(String paramString) {
/* 1644 */     paramString = paramString.replace("&", "&amp;");
/* 1645 */     paramString = paramString.replace("<", "&lt;");
/* 1646 */     paramString = paramString.replace(">", "&gt;");
/*      */     
/* 1648 */     paramString = paramString.replace("${", "$ {");
/*      */     
/* 1650 */     return paramString;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String a(File paramFile) {
/*      */     try {
/* 1662 */       FileInputStream fileInputStream = new FileInputStream(paramFile);
/*      */ 
/*      */       
/*      */       try {
/* 1666 */         byte[] arrayOfByte = new byte[(int)paramFile.length()];
/* 1667 */         int i = arrayOfByte.length;
/* 1668 */         int j = 0;
/*      */         
/* 1670 */         while (j < i) {
/* 1671 */           int k = fileInputStream.read(arrayOfByte, j, i - j);
/* 1672 */           if (k == -1) {
/*      */             break;
/*      */           }
/* 1675 */           j += k;
/*      */         } 
/*      */ 
/*      */         
/* 1679 */         return new String(arrayOfByte, Charset.forName("UTF-8"));
/*      */       }
/*      */       finally {
/*      */         
/* 1683 */         fileInputStream.close();
/*      */       }
/*      */     
/* 1686 */     } catch (FileNotFoundException fileNotFoundException) {
/*      */       
/* 1688 */       throw new RuntimeException(fileNotFoundException);
/*      */     }
/* 1690 */     catch (IOException iOException) {
/*      */       
/* 1692 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp String a(Exception paramException) {
/* 1699 */     StringWriter stringWriter = new StringWriter();
/* 1700 */     PrintWriter printWriter = new PrintWriter(stringWriter);
/* 1701 */     paramException.printStackTrace(printWriter);
/* 1702 */     return stringWriter.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp String b(Exception paramException) {
/* 1707 */     return a(paramException, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp String a(Exception paramException, boolean paramBoolean) {
/* 1718 */     String str1 = paramException.getMessage();
/* 1719 */     if (str1 == null) {
/*      */       
/* 1721 */       str1 = paramException.getClass().getName();
/*      */     }
/*      */     else {
/*      */       
/* 1725 */       boolean bool = false;
/* 1726 */       if (paramException instanceof NumberFormatException)
/*      */       {
/* 1728 */         bool = true;
/*      */       }
/* 1730 */       if (paramException instanceof ArrayIndexOutOfBoundsException)
/*      */       {
/* 1732 */         bool = true;
/*      */       }
/*      */       
/* 1735 */       if (bool || paramBoolean)
/*      */       {
/* 1737 */         str1 = paramException.getClass().getName() + " - " + str1;
/*      */       }
/*      */     } 
/*      */     
/* 1741 */     Throwable throwable = paramException;
/*      */ 
/*      */     
/* 1744 */     while (throwable != null) {
/*      */ 
/*      */ 
/*      */       
/* 1748 */       Throwable throwable1 = throwable.getCause();
/* 1749 */       if (throwable1 != null && throwable1 != paramException && throwable1 != throwable) {
/*      */         
/* 1751 */         throwable = throwable1;
/*      */         continue;
/*      */       } 
/*      */       break;
/*      */     } 
/* 1756 */     String str2 = null;
/* 1757 */     if (throwable != null && throwable != paramException) {
/*      */       
/* 1759 */       str2 = throwable.getMessage();
/* 1760 */       if (str2 == null)
/*      */       {
/* 1762 */         str2 = throwable.getClass().getName();
/*      */       }
/*      */ 
/*      */       
/* 1766 */       boolean bool = true;
/*      */       
/* 1768 */       if (str2.equals(str1))
/*      */       {
/* 1770 */         bool = false;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1777 */       if (str1 != null && str1.contains(str2))
/*      */       {
/* 1779 */         bool = false;
/*      */       }
/*      */ 
/*      */       
/* 1783 */       if (bool)
/*      */       {
/* 1785 */         str1 = str1 + " caused by (" + str2 + ")";
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1790 */     return str1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String j(String paramString) {
/* 1800 */     if (paramString.endsWith("\n"))
/*      */     {
/* 1802 */       return paramString.substring(0, paramString.length() - 1);
/*      */     }
/* 1804 */     return paramString;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String a(String paramString1, String paramString2) {
/* 1810 */     if (paramString1.endsWith(paramString2))
/*      */     {
/* 1812 */       return paramString1.substring(0, paramString1.length() - paramString2.length());
/*      */     }
/* 1814 */     return paramString1;
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
/*      */   public static strictfp String k(String paramString) {
/* 1858 */     File file = new File(paramString);
/*      */     
/* 1860 */     return file.getName();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String b(String paramString1, String paramString2) {
/* 1867 */     if (paramString2.startsWith("/") || paramString2.startsWith("\\"))
/*      */     {
/* 1869 */       paramString2 = paramString2.substring(1);
/*      */     }
/*      */     
/* 1872 */     if (paramString1.endsWith("/"))
/*      */     {
/* 1874 */       return paramString1 + paramString2;
/*      */     }
/* 1876 */     if (paramString1.endsWith("\\"))
/*      */     {
/* 1878 */       paramString1 = paramString1.substring(0, paramString1.length() - 1);
/*      */     }
/* 1880 */     return paramString1 + "/" + paramString2;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String a(CharSequence paramCharSequence, Iterable paramIterable) {
/* 1886 */     StringBuilder stringBuilder = new StringBuilder();
/*      */     
/* 1888 */     boolean bool = true;
/* 1889 */     for (String str : paramIterable) {
/*      */       
/* 1891 */       if (bool) {
/*      */         
/* 1893 */         bool = false;
/*      */       }
/*      */       else {
/*      */         
/* 1897 */         stringBuilder.append(paramCharSequence);
/*      */       } 
/* 1899 */       stringBuilder.append(str);
/*      */     } 
/*      */     
/* 1902 */     return stringBuilder.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp Integer l(String paramString) {
/*      */     try {
/* 1910 */       return Integer.valueOf(paramString);
/*      */     }
/* 1912 */     catch (NumberFormatException numberFormatException) {
/*      */       
/* 1914 */       l.d(numberFormatException.toString());
/*      */       
/* 1916 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean m(String paramString) {
/* 1927 */     int i = paramString.length();
/* 1928 */     for (int j = 0; j < i; ) {
/* 1929 */       int k = paramString.codePointAt(j);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1934 */       if (k > 128)
/*      */       {
/* 1936 */         return true;
/*      */       }
/*      */ 
/*      */       
/* 1940 */       j += Character.charCount(k);
/*      */     } 
/* 1942 */     return false;
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
/*      */   public static strictfp String a(long paramLong) {
/*      */     String str;
/* 1956 */     int[] arrayOfInt = b(paramLong);
/*      */     
/* 1958 */     if (arrayOfInt[0] == 0) {
/*      */ 
/*      */ 
/*      */       
/* 1962 */       str = a("" + arrayOfInt[1], 2, "0") + ":" + a("" + arrayOfInt[2], 2, "0");
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 1968 */       str = a("" + arrayOfInt[0], 2, "0") + ":" + a("" + arrayOfInt[1], 2, "0") + ":" + a("" + arrayOfInt[2], 2, "0");
/*      */     } 
/* 1970 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int[] b(long paramLong) {
/* 1977 */     int i = (int)paramLong / 3600;
/* 1978 */     int j = (int)paramLong - i * 3600;
/* 1979 */     int k = j / 60;
/* 1980 */     j -= k * 60;
/* 1981 */     int m = j;
/*      */     
/* 1983 */     return new int[] { i, k, m };
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
/* 1999 */   private static final float[] l = new float[1025];
/* 2000 */   private static final float[] m = new float[1025];
/* 2001 */   private static final float[] n = new float[1025];
/* 2002 */   private static final float[] o = new float[1025];
/* 2003 */   private static final float[] p = new float[1025];
/* 2004 */   private static final float[] q = new float[1025];
/* 2005 */   private static final float[] r = new float[1025];
/* 2006 */   private static final float[] s = new float[1025];
/*      */ 
/*      */   
/*      */   static {
/* 2010 */     for (b = 0; b <= 'Ѐ'; b++) {
/*      */       
/* 2012 */       float f1 = b / 1024.0F;
/* 2013 */       l[b] = (float)(StrictMath.atan(f1) * 3.1415927410125732D / Math.PI);
/* 2014 */       m[b] = 1.5707964F - l[b];
/* 2015 */       n[b] = -l[b];
/* 2016 */       o[b] = l[b] - 1.5707964F;
/* 2017 */       p[b] = 3.1415927F - l[b];
/* 2018 */       q[b] = l[b] + 1.5707964F;
/* 2019 */       r[b] = l[b] - 3.1415927F;
/* 2020 */       s[b] = -1.5707964F - l[b];
/*      */     } 
/*      */   }
/*      */   
/* 2024 */   static int i = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float i(float paramFloat1, float paramFloat2) {
/*      */     try {
/* 2033 */       if (paramFloat2 >= 0.0F) {
/*      */         
/* 2035 */         if (paramFloat1 >= 0.0F) {
/*      */           
/* 2037 */           if (paramFloat2 >= paramFloat1) {
/* 2038 */             return l[(int)((1024.0F * paramFloat1 / paramFloat2) + 0.5D)];
/*      */           }
/* 2040 */           return m[(int)((1024.0F * paramFloat2 / paramFloat1) + 0.5D)];
/*      */         } 
/*      */ 
/*      */         
/* 2044 */         if (paramFloat2 >= -paramFloat1) {
/* 2045 */           return n[(int)((-1024.0F * paramFloat1 / paramFloat2) + 0.5D)];
/*      */         }
/* 2047 */         return o[(int)((-1024.0F * paramFloat2 / paramFloat1) + 0.5D)];
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2052 */       if (paramFloat1 >= 0.0F) {
/*      */         
/* 2054 */         if (-paramFloat2 >= paramFloat1) {
/* 2055 */           return p[(int)((-1024.0F * paramFloat1 / paramFloat2) + 0.5D)];
/*      */         }
/* 2057 */         return q[(int)((-1024.0F * paramFloat2 / paramFloat1) + 0.5D)];
/*      */       } 
/*      */ 
/*      */       
/* 2061 */       if (paramFloat2 <= paramFloat1) {
/* 2062 */         return r[(int)((1024.0F * paramFloat1 / paramFloat2) + 0.5D)];
/*      */       }
/* 2064 */       return s[(int)((1024.0F * paramFloat2 / paramFloat1) + 0.5D)];
/*      */ 
/*      */     
/*      */     }
/* 2068 */     catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
/*      */ 
/*      */       
/* 2071 */       if (i < 100) {
/*      */         
/* 2073 */         l.d("atan2 slow fallback for y:" + paramFloat1 + " x:" + paramFloat2);
/* 2074 */         i++;
/*      */       } 
/*      */       
/* 2077 */       return (float)StrictMath.atan2(paramFloat1, paramFloat2);
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
/* 2095 */   private static final float[] t = new float[4096];
/* 2096 */   private static final float[] u = new float[4096];
/*      */ 
/*      */   
/*      */   static {
/* 2100 */     for (b = 0; b < 'က'; b++) {
/*      */       
/* 2102 */       t[b] = (float)StrictMath.sin(((b + 0.5F) / 4096.0F * 6.2831855F));
/* 2103 */       u[b] = (float)StrictMath.cos(((b + 0.5F) / 4096.0F * 6.2831855F));
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
/*      */   public static final strictfp float h(float paramFloat) {
/* 2129 */     return t[(int)(paramFloat * 11.377778F) & 0xFFF];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp float i(float paramFloat) {
/* 2140 */     return u[(int)(paramFloat * 11.377778F) & 0xFFF];
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
/*      */   public static strictfp String n(String paramString) {
/* 2158 */     if (paramString.contains("&")) {
/*      */       
/* 2160 */       paramString = paramString.replace("&lt;", "<");
/* 2161 */       paramString = paramString.replace("&gt;", ">");
/*      */       
/* 2163 */       paramString = paramString.replace("&apos;", "'");
/* 2164 */       paramString = paramString.replace("&quot;", "\"");
/*      */       
/* 2166 */       paramString = paramString.replace("&amp;", "&");
/*      */     } 
/*      */     
/* 2169 */     return paramString;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String o(String paramString) {
/* 2175 */     boolean bool = false;
/*      */ 
/*      */     
/* 2178 */     StringBuilder stringBuilder = new StringBuilder();
/* 2179 */     for (char c : paramString.toCharArray()) {
/*      */       
/* 2181 */       boolean bool1 = bool;
/* 2182 */       bool = false;
/*      */       
/* 2184 */       if (!bool1)
/*      */       {
/* 2186 */         if (c == '\\') {
/*      */           
/* 2188 */           bool = true;
/*      */           
/*      */           continue;
/*      */         } 
/*      */       }
/* 2193 */       stringBuilder.append(c);
/*      */       continue;
/*      */     } 
/* 2196 */     return stringBuilder.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp String a(String paramString1, String paramString2, String paramString3) {
/* 2202 */     if (!c(paramString1, paramString2))
/*      */     {
/* 2204 */       return paramString1;
/*      */     }
/* 2206 */     return paramString1.replace(paramString2, paramString3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean c(String paramString1, String paramString2) {
/* 2212 */     return (paramString1.indexOf(paramString2) > -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String[] b(String paramString, char paramChar) {
/* 2222 */     if (paramString.length() == 0)
/*      */     {
/* 2224 */       return new String[] { "" };
/*      */     }
/*      */ 
/*      */     
/* 2228 */     int i = 0;
/* 2229 */     int j = 0;
/*      */     int k;
/* 2231 */     while ((k = paramString.indexOf(paramChar, j)) != -1) {
/*      */       
/* 2233 */       i++;
/* 2234 */       j = k + 1;
/*      */     } 
/*      */     
/* 2237 */     if (i == 0)
/*      */     {
/* 2239 */       return new String[] { paramString };
/*      */     }
/*      */     
/* 2242 */     int m = paramString.length();
/* 2243 */     if (j == m) {
/*      */ 
/*      */       
/* 2246 */       if (i == m)
/*      */       {
/* 2248 */         return new String[0];
/*      */       }
/*      */       
/*      */       do {
/* 2252 */         j--;
/* 2253 */       } while (paramString.charAt(j - 1) == paramChar);
/*      */       
/* 2255 */       i -= paramString.length() - j;
/* 2256 */       m = j;
/*      */     } 
/*      */ 
/*      */     
/* 2260 */     String[] arrayOfString = new String[i + 1];
/* 2261 */     j = 0;
/* 2262 */     for (int n = 0; n != i; n++) {
/* 2263 */       k = paramString.indexOf(paramChar, j);
/* 2264 */       arrayOfString[n] = paramString.substring(j, k);
/* 2265 */       j = k + 1;
/*      */     } 
/*      */     
/* 2268 */     arrayOfString[i] = paramString.substring(j, m);
/* 2269 */     return arrayOfString;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String[] c(String paramString, char paramChar) {
/* 2276 */     ArrayList<String> arrayList = new ArrayList();
/*      */     
/* 2278 */     boolean bool1 = false;
/* 2279 */     boolean bool2 = false;
/* 2280 */     boolean bool3 = false;
/*      */     
/* 2282 */     StringBuilder stringBuilder = new StringBuilder();
/* 2283 */     for (char c : paramString.toCharArray()) {
/*      */       
/* 2285 */       boolean bool = bool1;
/* 2286 */       bool1 = false;
/*      */       
/* 2288 */       if (!bool) {
/*      */         
/* 2290 */         if (c == '\\')
/*      */         {
/* 2292 */           bool1 = true;
/*      */         }
/*      */         
/* 2295 */         if (!bool3 && c == '\'')
/*      */         {
/* 2297 */           bool2 = !bool2 ? true : false;
/*      */         }
/*      */         
/* 2300 */         if (!bool2 && c == '"')
/*      */         {
/* 2302 */           bool3 = !bool3 ? true : false;
/*      */         }
/*      */       } 
/*      */       
/* 2306 */       if (c == paramChar && !bool2 && !bool3)
/*      */       {
/* 2308 */         if (!bool2) {
/*      */           
/* 2310 */           arrayList.add(stringBuilder.toString());
/* 2311 */           stringBuilder.setLength(0);
/*      */           
/*      */           continue;
/*      */         } 
/*      */       }
/* 2316 */       stringBuilder.append(c);
/*      */       continue;
/*      */     } 
/* 2319 */     if (stringBuilder.length() != 0) {
/*      */       
/* 2321 */       arrayList.add(stringBuilder.toString());
/* 2322 */       stringBuilder.setLength(0);
/*      */     } 
/*      */     
/* 2325 */     return arrayList.<String>toArray(new String[0]);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int p(String paramString) {
/* 2331 */     byte b1 = 0;
/*      */ 
/*      */ 
/*      */     
/* 2335 */     for (byte b2 = 0; b2 < paramString.length(); b2++) {
/*      */       
/* 2337 */       char c = paramString.charAt(b2);
/*      */       
/* 2339 */       if (c == '(') {
/*      */         
/* 2341 */         b1++;
/*      */       }
/* 2343 */       else if (c == ')') {
/*      */         
/* 2345 */         b1--;
/*      */       } 
/*      */     } 
/*      */     
/* 2349 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int g(String paramString, int paramInt) {
/* 2355 */     char c = paramString.charAt(paramInt);
/* 2356 */     if (c != '(') {
/*      */       
/* 2358 */       l.b("getBracketEnd: Did not start on a bracket");
/* 2359 */       return -1;
/*      */     } 
/*      */     
/* 2362 */     if (paramInt + 1 >= paramString.length())
/*      */     {
/* 2364 */       return -1;
/*      */     }
/*      */     
/* 2367 */     byte b = 1;
/*      */     
/* 2369 */     for (int i = paramInt + 1; i < paramString.length(); i++) {
/*      */       
/* 2371 */       char c1 = paramString.charAt(i);
/*      */       
/* 2373 */       if (c1 == '(') {
/*      */         
/* 2375 */         b++;
/*      */       }
/* 2377 */       else if (c1 == ')') {
/*      */         
/* 2379 */         b--;
/*      */       } 
/*      */       
/* 2382 */       if (b == 0)
/*      */       {
/* 2384 */         return i;
/*      */       }
/*      */     } 
/*      */     
/* 2388 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp ArrayList a(String paramString1, String paramString2, boolean paramBoolean) {
/* 2394 */     byte b = 0;
/*      */ 
/*      */ 
/*      */     
/* 2398 */     StringBuffer stringBuffer = new StringBuffer();
/* 2399 */     ArrayList<String> arrayList = new ArrayList();
/*      */     
/* 2401 */     char c = paramString2.charAt(0);
/* 2402 */     int i = paramString2.length();
/*      */ 
/*      */ 
/*      */     
/* 2406 */     for (int j = 0; j < paramString1.length(); j++) {
/*      */       
/* 2408 */       char c1 = paramString1.charAt(j);
/*      */       
/* 2410 */       if (c1 == '(') {
/*      */         
/* 2412 */         b++;
/*      */       }
/* 2414 */       else if (c1 == ')') {
/*      */         
/* 2416 */         b--;
/*      */       } 
/*      */       
/* 2419 */       if (b == 0) {
/*      */         
/* 2421 */         boolean bool = false;
/* 2422 */         if (c == c1)
/*      */         {
/* 2424 */           if (i == 1 || paramString1.indexOf(paramString2, j) == j)
/*      */           {
/* 2426 */             bool = true;
/*      */           }
/*      */         }
/*      */         
/* 2430 */         if (bool)
/*      */         {
/* 2432 */           if (!paramBoolean || (!h(paramString1, j - 1) && !h(paramString1, j + paramString2.length()))) {
/*      */ 
/*      */             
/* 2435 */             arrayList.add(stringBuffer.toString());
/* 2436 */             stringBuffer = new StringBuffer();
/*      */             
/* 2438 */             j += paramString2.length() - 1;
/*      */ 
/*      */             
/*      */             continue;
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 2447 */       stringBuffer.append(c1);
/*      */       continue;
/*      */     } 
/* 2450 */     arrayList.add(stringBuffer.toString());
/* 2451 */     stringBuffer = new StringBuffer();
/*      */     
/* 2453 */     return arrayList;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean h(String paramString, int paramInt) {
/* 2459 */     if (paramInt < 0 || paramInt >= paramString.length())
/*      */     {
/* 2461 */       return false;
/*      */     }
/* 2463 */     char c = paramString.charAt(paramInt);
/*      */     
/* 2465 */     return (Character.isLetter(c) || Character.isDigit(c));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean q(String paramString) {
/* 2471 */     for (byte b = 0; b < paramString.length(); b++) {
/*      */       
/* 2473 */       char c = paramString.charAt(b);
/*      */       
/* 2475 */       if (!Character.isDigit(c) && c != '.')
/*      */       {
/* 2477 */         if (c != '-' || b != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */           
/* 2482 */           return false; } 
/*      */       }
/*      */     } 
/* 2485 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean j(float paramFloat1, float paramFloat2) {
/* 2491 */     return (c(paramFloat1 - paramFloat2) < 1.0E-7F);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean b(double paramDouble1, double paramDouble2) {
/* 2497 */     return (a(paramDouble1 - paramDouble2) < 1.0000000116860974E-7D);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp boolean d(String paramString1, String paramString2) {
/* 2502 */     if (paramString1 == null) return (paramString2 == null);
/*      */     
/* 2504 */     return paramString1.equals(paramString2);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final strictfp boolean a(Integer paramInteger1, Integer paramInteger2) {
/* 2510 */     if (paramInteger1 == null) return (paramInteger2 == null);
/*      */     
/* 2512 */     return paramInteger1.equals(paramInteger2);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
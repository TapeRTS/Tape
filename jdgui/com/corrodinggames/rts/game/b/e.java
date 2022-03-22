/*      */ package com.corrodinggames.rts.game.b;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.ColorFilter;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.util.HashMap;
/*      */ import java.util.Locale;
/*      */ import java.util.Properties;
/*      */ import java.util.zip.GZIPInputStream;
/*      */ import java.util.zip.InflaterInputStream;
/*      */ import org.w3c.dom.Element;
/*      */ import org.w3c.dom.Node;
/*      */ import org.w3c.dom.NodeList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class e
/*      */ {
/*   43 */   private static byte[] x = new byte[256];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static {
/*      */     byte b1;
/*   66 */     for (b1 = 0; b1 < 'Ā'; b1++)
/*   67 */       x[b1] = -1; 
/*   68 */     for (b1 = 65; b1 <= 90; b1++)
/*   69 */       x[b1] = (byte)(b1 - 65); 
/*   70 */     for (b1 = 97; b1 <= 122; b1++)
/*   71 */       x[b1] = (byte)(26 + b1 - 97); 
/*   72 */     for (b1 = 48; b1 <= 57; b1++)
/*   73 */       x[b1] = (byte)(52 + b1 - 48); 
/*   74 */     x[43] = 62;
/*   75 */     x[47] = 63;
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
/*      */   public final g a(int paramInt1, int paramInt2) {
/*  133 */     if (this.q == null)
/*      */     {
/*  135 */       this.q = new short[this.n * this.o];
/*      */     }
/*      */     
/*  138 */     return this.i.a(this.q[paramInt1 * this.o + paramInt2]);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public short[] a() {
/*  144 */     if (this.q == null)
/*      */     {
/*      */       
/*  147 */       this.q = new short[this.n * this.o];
/*      */     }
/*      */     
/*  150 */     return this.q;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, g paramg) {
/*  155 */     if (this.q == null)
/*      */     {
/*      */       
/*  158 */       this.q = new short[this.n * this.o];
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  163 */     paramg = this.i.a(paramg, paramInt1, paramInt2);
/*      */ 
/*      */     
/*  166 */     if (paramg.i) {
/*      */       
/*  168 */       boolean bool = false;
/*  169 */       for (Point point : this.i.w) {
/*      */         
/*  171 */         if (point.a == paramInt1 && point.b == paramInt2) {
/*      */           
/*  173 */           l.d("resPools point:" + paramInt1 + ", " + paramInt2 + " already exists");
/*  174 */           bool = true;
/*      */         } 
/*      */       } 
/*  177 */       if (!bool)
/*      */       {
/*  179 */         this.i.w.add(new Point(paramInt1, paramInt2));
/*      */       }
/*      */     } 
/*      */     
/*  183 */     if (paramg.d == -1)
/*      */     {
/*  185 */       paramg.d = this.i.a(paramg);
/*      */     }
/*      */ 
/*      */     
/*  189 */     this.q[paramInt1 * this.o + paramInt2] = paramg.d;
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
/*  206 */   static q a = new q(); static {
/*  207 */     a.b(-16777216);
/*  208 */     a.a(Paint.Style.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  215 */   static q[] b = new q[11];
/*      */   static {
/*  217 */     for (b1 = 0; b1 <= 10; b1++) {
/*      */       
/*  219 */       b[b1] = new q();
/*  220 */       b[b1].b(-16777216);
/*  221 */       b[b1].a(Paint.Style.a);
/*  222 */       b[b1].c(b1 * 25);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  230 */   static q c = new q(); static {
/*  231 */     c.b(-16777216);
/*  232 */     c.a(Paint.Style.a);
/*      */   }
/*      */   
/*  235 */   static q d = new q();
/*      */   
/*      */   static {
/*  238 */     d.a(false);
/*  239 */     d.d(false);
/*  240 */     d.b(false);
/*      */   }
/*      */ 
/*      */   
/*  244 */   static q e = new q(); static {
/*  245 */     e.a(true);
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
/*  256 */   static q f = new q();
/*      */ 
/*      */ 
/*      */   
/*      */   static {
/*  261 */     f.a(false);
/*  262 */     f.d(false);
/*  263 */     f.b(false);
/*      */   }
/*      */   
/*  266 */   static q g = new q(); static {
/*  267 */     g.a(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  273 */   static q[] h = new q[11]; public b i;
/*      */   static {
/*  275 */     for (b1 = 0; b1 <= 10; b1++) {
/*      */       
/*  277 */       q q1 = new q();
/*  278 */       q1.a((ColorFilter)new LightingColorFilter(Color.a(255 - b1 * 25, 255 - b1 * 25, 255 - b1 * 25), 0));
/*      */       
/*  280 */       h[b1] = q1;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int j;
/*      */   
/*      */   public String k;
/*      */   
/*      */   public String l;
/*      */   
/*      */   public boolean m;
/*      */   
/*      */   public int n;
/*      */   
/*      */   public int o;
/*      */   
/*      */   public Properties p;
/*      */   
/*      */   public short[] q;
/*      */   public boolean r;
/*      */   public boolean s;
/*  302 */   final Rect t = new Rect();
/*  303 */   final Rect u = new Rect();
/*  304 */   final RectF v = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean w;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(l paraml, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*      */     q q4;
/*      */     h h;
/*  327 */     l l1 = l.u();
/*      */     
/*  329 */     b b1 = this.i;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  356 */     int i = (int)(paramFloat3 * b1.o);
/*  357 */     if (i < 0) i = 0; 
/*  358 */     int j = (int)(paramFloat4 * b1.p);
/*  359 */     if (j < 0) j = 0; 
/*  360 */     int k = (int)((paramFloat3 + paramFloat5) * b1.o);
/*  361 */     if (k > this.n - 1) k = this.n - 1; 
/*  362 */     int m = (int)((paramFloat4 + paramFloat6) * b1.p);
/*  363 */     if (m > this.o - 1) m = this.o - 1;
/*      */ 
/*      */     
/*  366 */     byte[][] arrayOfByte1 = l1.bb.C;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  373 */     float f1 = paramFloat1 * paramFloat7;
/*  374 */     float f2 = paramFloat2 * paramFloat8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  384 */     float f3 = b1.k * paramFloat7;
/*  385 */     float f4 = b1.l * paramFloat8;
/*      */ 
/*      */ 
/*      */     
/*  389 */     boolean bool1 = true;
/*      */ 
/*      */ 
/*      */     
/*  393 */     byte b2 = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  400 */     if (!paramBoolean2)
/*      */     {
/*  402 */       b2 = 10;
/*      */     }
/*      */ 
/*      */     
/*  406 */     boolean bool2 = b1.C;
/*  407 */     if (bool2)
/*      */     {
/*  409 */       b2 = 15;
/*      */     }
/*      */ 
/*      */     
/*  413 */     if (paramBoolean1 && arrayOfByte1 == null)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  419 */       paramBoolean1 = false;
/*      */     }
/*      */     
/*  422 */     q q1 = b[5];
/*  423 */     q q2 = a;
/*      */     
/*  425 */     q q3 = c;
/*  426 */     q3.c(255);
/*      */     
/*  428 */     if (bool2) {
/*      */       
/*  430 */       q2 = b[7];
/*      */       
/*  432 */       float f = 1.0F - (1.0F - q1.f() / 255.0F) * (1.0F - q2.f() / 255.0F);
/*      */       
/*  434 */       q3.c((int)(f * 255.0F));
/*      */     } 
/*      */     
/*  437 */     boolean bool3 = false;
/*      */ 
/*      */ 
/*      */     
/*  441 */     if (l.al())
/*      */     {
/*  443 */       if (paramFloat7 < 1.0F && paramFloat8 < 1.0F)
/*      */       {
/*  445 */         bool3 = true;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  450 */     if (paramBoolean3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  469 */     if (!this.r) {
/*      */       
/*  471 */       q4 = f;
/*      */ 
/*      */       
/*  474 */       if (bool3)
/*      */       {
/*  476 */         q4 = g;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/*  481 */       q4 = d;
/*      */       
/*  483 */       if (bool3)
/*      */       {
/*  485 */         q4 = e;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  492 */     q q5 = q4;
/*      */ 
/*      */     
/*  495 */     float f5 = 0.0F;
/*  496 */     float f6 = 0.0F;
/*  497 */     boolean bool4 = false;
/*      */     
/*  499 */     if (!l.al()) {
/*      */       
/*  501 */       bool4 = true;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  506 */     else if (!paramBoolean3) {
/*      */       
/*  508 */       if (paramFloat7 < 1.0F || paramFloat8 < 1.0F)
/*      */       {
/*  510 */         f5 = 0.5F * paramFloat7;
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
/*  523 */     else if (paramFloat7 < 1.0F || paramFloat8 < 1.0F) {
/*      */     
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
/*  537 */     if (paramFloat7 < 0.5F) {
/*      */       
/*  539 */       h = b.j;
/*      */     }
/*      */     else {
/*      */       
/*  543 */       h = b.i;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  549 */     short[] arrayOfShort = a();
/*  550 */     g[] arrayOfG = b1.x;
/*      */ 
/*      */     
/*  553 */     RectF rectF = this.v;
/*  554 */     Rect rect1 = this.u;
/*  555 */     int n = this.o;
/*  556 */     boolean bool5 = this.r;
/*  557 */     Rect rect2 = this.t;
/*  558 */     byte[][] arrayOfByte2 = b1.H;
/*  559 */     byte[][] arrayOfByte3 = b1.I;
/*  560 */     com.corrodinggames.rts.gameFramework.j.e e1 = b.F;
/*      */     
/*  562 */     for (int i1 = i; i1 < k + 1; i1++) {
/*      */       
/*  564 */       for (int i2 = j; i2 < m + 1; i2++) {
/*      */ 
/*      */ 
/*      */         
/*  568 */         short s = arrayOfShort[i1 * n + i2];
/*  569 */         g g = arrayOfG[s];
/*      */         
/*  571 */         if (g != null) {
/*      */           
/*  573 */           byte b3 = 0;
/*  574 */           if (paramBoolean1)
/*      */           {
/*  576 */             b3 = arrayOfByte1[i1][i2];
/*      */           }
/*      */           
/*  579 */           if (b3 != b2) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  586 */             float f7 = i1 * f3 + f6;
/*  587 */             float f8 = i2 * f4 + f6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  634 */             float f9 = (i1 + 1) * f3 + f5;
/*  635 */             float f10 = (i2 + 1) * f4 + f5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  644 */             rectF.a(f7 - f1, f8 - f2, f9 - f1, f10 - f2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  651 */             if (bool3 && !paramBoolean3) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  656 */               rectF.b = (int)rectF.b;
/*  657 */               rectF.a = (int)rectF.a;
/*      */             } 
/*      */             
/*  660 */             if (!paramBoolean3) {
/*      */ 
/*      */               
/*  663 */               j j1 = g.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  676 */               if (!bool4) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  688 */                 if (g.c >= 0)
/*      */                 {
/*  690 */                   Rect rect = h.b(g.c);
/*      */                   
/*  692 */                   com.corrodinggames.rts.gameFramework.j.e e2 = h.a(g.c);
/*      */                   
/*  694 */                   paraml.a(e2, rect, rectF, (Paint)q5);
/*      */                 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */                   
/*  700 */                   g.a(paraml, rectF, paramFloat7, (Paint)q5);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*      */               else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  727 */                 rect1.a((int)(f7 - f1), (int)(f8 - f2), (int)(f9 - f1), (int)(f10 - f2));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  733 */                 if (g.c >= 0) {
/*      */                   
/*  735 */                   Rect rect = h.b(g.c);
/*  736 */                   com.corrodinggames.rts.gameFramework.j.e e2 = h.a(g.c);
/*      */ 
/*      */ 
/*      */                   
/*  740 */                   paraml.b(e2, rect, rect1, (Paint)q5);
/*      */ 
/*      */ 
/*      */                 
/*      */                 }
/*      */                 else {
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  750 */                   Rect rect = j1.b(g.b);
/*      */ 
/*      */                   
/*  753 */                   paraml.a(j1.a, rect, rect1, (Paint)q5);
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  764 */             if (paramBoolean1 && bool5 && paramBoolean2)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  789 */               if (b3 != 0 || arrayOfByte3[i1][i2] != 0 || arrayOfByte2[i1][i2] != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  803 */                 if (b3 >= 5) {
/*      */                   q q6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  810 */                   if (paramBoolean3)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/*  817 */                     if (b3 == 10 || arrayOfByte2[i1][i2] == 0) {
/*      */ 
/*      */                       
/*  820 */                       int i3 = i2 + 1;
/*      */ 
/*      */ 
/*      */                       
/*  824 */                       while (i3 < m) {
/*      */                         
/*  826 */                         byte b4 = arrayOfByte1[i1][i3];
/*  827 */                         if (b3 == b4)
/*      */                         {
/*  829 */                           if (b3 == 10 || arrayOfByte2[i1][i3] == 0)
/*      */                           {
/*      */ 
/*      */                             
/*  833 */                             i3++;
/*      */                           }
/*      */                         }
/*      */                       } 
/*      */ 
/*      */ 
/*      */                       
/*  840 */                       i3--;
/*      */ 
/*      */ 
/*      */                       
/*  844 */                       if (i3 > i2) {
/*      */                         
/*  846 */                         rectF.d += (i3 - i2) * f4;
/*      */                         
/*  848 */                         i2 = i3;
/*      */                       } 
/*      */                     } 
/*      */                   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  857 */                   if (b3 == 10) {
/*      */                     
/*  859 */                     q6 = q3;
/*      */                   }
/*      */                   else {
/*      */                     
/*  863 */                     q6 = q1;
/*      */                   } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  876 */                   rect1.a = (int)rectF.a;
/*  877 */                   rect1.c = (int)rectF.c;
/*  878 */                   rect1.b = (int)rectF.b;
/*  879 */                   rect1.d = (int)rectF.d;
/*      */                   
/*  881 */                   paraml.a(rect1, (Paint)q6);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 }
/*      */                 else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  894 */                   byte b4 = arrayOfByte3[i1][i2];
/*      */                   
/*  896 */                   if (b4 == Byte.MAX_VALUE) {
/*      */                     
/*  898 */                     b4 = b1.a(i1, i2, arrayOfByte1, (byte)5);
/*  899 */                     arrayOfByte3[i1][i2] = b4;
/*      */                   } 
/*      */                   
/*  902 */                   if (b4 != 0) {
/*      */ 
/*      */ 
/*      */                     
/*  906 */                     int i3 = b4 + 128;
/*      */ 
/*      */                     
/*  909 */                     com.corrodinggames.rts.gameFramework.j.e e2 = e1;
/*      */                     
/*  911 */                     if (e2 != null) {
/*      */ 
/*      */                       
/*  914 */                       b.a(i3, rect2);
/*      */ 
/*      */ 
/*      */ 
/*      */                       
/*  919 */                       rect1.a((int)(f7 - f1), (int)(f8 - f2), (int)(f9 - f1), (int)(f10 - f2));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       
/*  925 */                       paraml.b(e2, rect2, rect1, (Paint)q1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/*      */                     }
/*  941 */                     else if (!b1.h[b4 + 128]) {
/*      */                       
/*  943 */                       l.d("SmoothFog, missing: " + b4);
/*  944 */                       b1.h[b4 + 128] = true;
/*      */                     } 
/*      */                   } 
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  955 */                 if (b3 != 10) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  977 */                   byte b4 = arrayOfByte2[i1][i2];
/*      */                   
/*  979 */                   if (b4 == Byte.MAX_VALUE) {
/*      */                     
/*  981 */                     b4 = b1.a(i1, i2, arrayOfByte1, (byte)10);
/*  982 */                     arrayOfByte2[i1][i2] = b4;
/*      */                   } 
/*      */                   
/*  985 */                   if (b4 != 0) {
/*      */                     
/*  987 */                     int i3 = b4 + 128;
/*      */ 
/*      */                     
/*  990 */                     com.corrodinggames.rts.gameFramework.j.e e2 = e1;
/*      */                     
/*  992 */                     if (e2 != null) {
/*      */ 
/*      */                       
/*  995 */                       b.a(i3, rect2);
/*      */ 
/*      */ 
/*      */                       
/*  999 */                       rect1.a((int)(f7 - f1), (int)(f8 - f2), (int)(f9 - f1), (int)(f10 - f2));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       
/* 1005 */                       paraml.b(e2, rect2, rect1, (Paint)q2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/*      */                     }
/* 1016 */                     else if (!b1.h[b4 + 128]) {
/*      */                       
/* 1018 */                       l.d("SmoothFog, missing: " + b4);
/* 1019 */                       b1.h[b4 + 128] = true;
/*      */                     } 
/*      */                   } 
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1062 */     this.q = null;
/* 1063 */     this.p = null;
/* 1064 */     this.i = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   e(b paramb, Element paramElement) {
/* 1073 */     this.i = paramb;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1078 */     this.k = paramElement.getAttribute("name");
/*      */     
/* 1080 */     Log.d("RustedWarfare", "MapLayer create: " + this.k);
/*      */     
/* 1082 */     if (this.k != null)
/*      */     {
/* 1084 */       this.l = this.k.toLowerCase(Locale.ENGLISH);
/*      */     }
/*      */     
/* 1087 */     this.m = this.l.contains("items");
/*      */ 
/*      */     
/* 1090 */     this.r = this.l.equalsIgnoreCase("ground");
/*      */     
/* 1092 */     if (this.m || this.r)
/*      */     {
/* 1094 */       this.s = true;
/*      */     }
/* 1096 */     if (this.k != null && this.k.equalsIgnoreCase("grounddetails"))
/*      */     {
/* 1098 */       this.s = true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1103 */     this.n = Short.parseShort(paramElement.getAttribute("width"));
/* 1104 */     this.o = Short.parseShort(paramElement.getAttribute("height"));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1109 */     Element element1 = (Element)paramElement.getElementsByTagName("properties").item(0);
/* 1110 */     if (element1 != null) {
/* 1111 */       NodeList nodeList = element1.getElementsByTagName("property");
/* 1112 */       if (nodeList != null) {
/* 1113 */         this.p = new Properties();
/* 1114 */         for (byte b1 = 0; b1 < nodeList.getLength(); b1++) {
/* 1115 */           Element element = (Element)nodeList.item(b1);
/*      */           
/* 1117 */           String str3 = element.getAttribute("name");
/* 1118 */           String str4 = element.getAttribute("value");
/* 1119 */           this.p.setProperty(str3, str4);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1124 */     Element element2 = (Element)paramElement.getElementsByTagName("data").item(0);
/* 1125 */     String str1 = element2.getAttribute("encoding");
/* 1126 */     String str2 = element2.getAttribute("compression");
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1131 */       Node node = element2.getFirstChild();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1136 */       String str = node.getNodeValue();
/*      */       
/* 1138 */       InputStream inputStream = a(str, str1, str2);
/* 1139 */       BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
/*      */       
/* 1141 */       a(bufferedInputStream);
/*      */       
/* 1143 */       if (bufferedInputStream != null)
/*      */       {
/* 1145 */         bufferedInputStream.close();
/*      */       }
/* 1147 */       if (inputStream != null)
/*      */       {
/* 1149 */         inputStream.close();
/*      */       }
/*      */     }
/* 1152 */     catch (IOException iOException) {
/*      */       
/* 1154 */       throw new f("Unable to decompress base64 block", iOException);
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
/*      */   void a(InputStream paramInputStream) {
/* 1170 */     b b1 = this.i;
/*      */ 
/*      */     
/* 1173 */     g g = null;
/* 1174 */     int i = -1;
/*      */     
/* 1176 */     boolean bool = this.s;
/*      */     
/* 1178 */     HashMap<Object, Object> hashMap = new HashMap<>();
/*      */     short s;
/* 1180 */     for (s = 0; s < this.o; s = (short)(s + 1)) {
/*      */       short s1;
/* 1182 */       for (s1 = 0; s1 < this.n; s1 = (short)(s1 + 1)) {
/*      */ 
/*      */         
/* 1185 */         int j = 0;
/*      */         
/* 1187 */         j |= paramInputStream.read();
/* 1188 */         j |= paramInputStream.read() << 8;
/* 1189 */         j |= paramInputStream.read() << 16;
/* 1190 */         j |= paramInputStream.read() << 24;
/*      */ 
/*      */         
/* 1193 */         boolean bool1 = ((j & Integer.MIN_VALUE) != 0) ? true : false;
/* 1194 */         boolean bool2 = ((j & 0x40000000) != 0) ? true : false;
/* 1195 */         boolean bool3 = ((j & 0x20000000) != 0) ? true : false;
/*      */ 
/*      */         
/* 1198 */         j &= 0x1FFFFFFF;
/*      */ 
/*      */ 
/*      */         
/* 1202 */         if (bool1 || bool2 || bool3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1208 */         if (j != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1214 */           if (i == j && g != null) {
/*      */ 
/*      */ 
/*      */             
/* 1218 */             a(s1, s, g);
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 1223 */             g g1 = (g)hashMap.get(Integer.valueOf(j));
/* 1224 */             if (g1 != null) {
/*      */               
/* 1226 */               g = g1;
/* 1227 */               i = j;
/*      */               
/* 1229 */               a(s1, s, g);
/*      */             
/*      */             }
/*      */             else {
/*      */ 
/*      */               
/* 1235 */               j j1 = b1.a(j);
/* 1236 */               if (j1 != null) {
/*      */ 
/*      */                 
/* 1239 */                 g = g.a(b1, this, j1, j - j1.k, s1, s, bool);
/* 1240 */                 if (g != null) {
/*      */ 
/*      */ 
/*      */                   
/* 1244 */                   a(s1, s, g);
/*      */                   
/* 1246 */                   hashMap.put(Integer.valueOf(j), g);
/*      */                 } 
/* 1248 */                 i = j;
/*      */               
/*      */               }
/*      */               else {
/*      */                 
/* 1253 */                 throw new f("Unable to decode base64 block, could not find tileId: " + j);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         }
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static InputStream a(String paramString1, String paramString2, String paramString3) {
/*      */     byte[] arrayOfByte;
/*      */     InflaterInputStream inflaterInputStream;
/* 1284 */     if (paramString2.equals("base64")) {
/*      */       
/* 1286 */       char[] arrayOfChar = paramString1.toCharArray();
/* 1287 */       arrayOfByte = a(arrayOfChar);
/*      */     }
/*      */     else {
/*      */       
/* 1291 */       throw new f("Unsupport tiled map encoding: " + paramString2 + "," + paramString3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1297 */     if ("gzip".equals(paramString3)) {
/*      */       
/*      */       try
/*      */       {
/*      */ 
/*      */         
/* 1303 */         GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(arrayOfByte));
/*      */         
/* 1305 */         inflaterInputStream = gZIPInputStream;
/*      */       
/*      */       }
/* 1308 */       catch (IOException iOException)
/*      */       {
/* 1310 */         throw new f("Unable to decode block in map", iOException);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */ 
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
/* 1343 */     else if ("".equals(paramString3)) {
/*      */       
/* 1345 */       ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
/*      */     }
/* 1347 */     else if ("zlib".equals(paramString3)) {
/*      */ 
/*      */ 
/*      */       
/* 1351 */       InflaterInputStream inflaterInputStream1 = new InflaterInputStream(new ByteArrayInputStream(arrayOfByte));
/*      */ 
/*      */       
/* 1354 */       inflaterInputStream = inflaterInputStream1;
/*      */     }
/*      */     else {
/*      */       
/* 1358 */       throw new f("Unsupport tiled map compression: " + paramString2 + "," + paramString3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
/*      */     } 
/*      */ 
/*      */     
/* 1362 */     return inflaterInputStream;
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
/*      */   public static byte[] a(char[] paramArrayOfchar) {
/* 1375 */     int i = paramArrayOfchar.length;
/* 1376 */     byte[] arrayOfByte1 = x;
/*      */     int j;
/* 1378 */     for (j = 0; j < paramArrayOfchar.length; j++) {
/* 1379 */       if (paramArrayOfchar[j] > 'ÿ' || arrayOfByte1[paramArrayOfchar[j]] < 0) {
/* 1380 */         i--;
/*      */       }
/*      */     } 
/*      */     
/* 1384 */     j = i / 4 * 3;
/* 1385 */     if (i % 4 == 3)
/* 1386 */       j += 2; 
/* 1387 */     if (i % 4 == 2) {
/* 1388 */       j++;
/*      */     }
/* 1390 */     byte[] arrayOfByte2 = new byte[j];
/*      */     
/* 1392 */     byte b1 = 0;
/* 1393 */     int k = 0;
/* 1394 */     byte b2 = 0;
/*      */     
/* 1396 */     for (byte b3 = 0; b3 < paramArrayOfchar.length; b3++) {
/* 1397 */       byte b4 = (paramArrayOfchar[b3] > 'ÿ') ? -1 : arrayOfByte1[paramArrayOfchar[b3]];
/*      */       
/* 1399 */       if (b4) {
/* 1400 */         k <<= 6;
/* 1401 */         b1 += true;
/* 1402 */         k |= b4;
/* 1403 */         if (b1 >= 8) {
/* 1404 */           b1 -= 8;
/* 1405 */           arrayOfByte2[b2++] = (byte)(k >> b1 & 0xFF);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1410 */     if (b2 != arrayOfByte2.length) {
/* 1411 */       throw new RuntimeException("Data length appears to be wrong (wrote " + b2 + " should be " + arrayOfByte2.length + ")");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1416 */     return arrayOfByte2;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
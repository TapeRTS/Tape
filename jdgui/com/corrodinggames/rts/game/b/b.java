/*      */ package com.corrodinggames.rts.game.b;
/*      */ 
/*      */ import android.content.res.AssetFileDescriptor;
/*      */ import android.content.res.AssetManager;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Point;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.PorterDuff;
/*      */ import android.graphics.PorterDuffXfermode;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import android.graphics.Xfermode;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.game.k;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.ae;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.custom.b.i;
/*      */ import com.corrodinggames.rts.game.units.d.c;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.k.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*      */ import com.corrodinggames.rts.gameFramework.utility.j;
/*      */ import com.corrodinggames.rts.gameFramework.utility.o;
/*      */ import com.corrodinggames.rts.gameFramework.w;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Properties;
/*      */ import javax.xml.parsers.DocumentBuilder;
/*      */ import javax.xml.parsers.DocumentBuilderFactory;
/*      */ import javax.xml.parsers.ParserConfigurationException;
/*      */ import javax.xml.transform.Transformer;
/*      */ import javax.xml.transform.TransformerException;
/*      */ import javax.xml.transform.TransformerFactory;
/*      */ import javax.xml.transform.dom.DOMSource;
/*      */ import javax.xml.transform.stream.StreamResult;
/*      */ import org.w3c.dom.Document;
/*      */ import org.w3c.dom.Element;
/*      */ import org.w3c.dom.NodeList;
/*      */ import org.xml.sax.SAXException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class b
/*      */ {
/*      */   static final boolean a = false;
/*      */   static final boolean b = false;
/*      */   static final boolean c = false;
/*  100 */   static Paint d = new Paint();
/*  101 */   static Paint e = new Paint();
/*  102 */   static Paint f = new Paint();
/*  103 */   static Paint g = new Paint();
/*      */   
/*  105 */   boolean[] h = new boolean[256];
/*      */   
/*      */   public static h i;
/*      */   
/*      */   public static h j;
/*      */   
/*      */   public int k;
/*      */   
/*      */   public int l;
/*      */   
/*      */   public int m;
/*      */   public int n;
/*      */   public float o;
/*      */   public float p;
/*      */   
/*      */   public static strictfp void a() {
/*  121 */     l l1 = l.u();
/*      */ 
/*      */     
/*  124 */     d.a(150, 255, 255, 255);
/*  125 */     d.a(Paint.Style.b);
/*  126 */     d.a(1.0F);
/*  127 */     l1.a(d, 16.0F);
/*      */     
/*  129 */     e.a(150, 255, 0, 0);
/*  130 */     e.a(Paint.Style.b);
/*  131 */     e.a(1.0F);
/*      */ 
/*      */     
/*  134 */     f.a(150, 0, 255, 0);
/*  135 */     f.a(Paint.Style.b);
/*  136 */     f.a(1.0F);
/*      */     
/*  138 */     g.a(150, 255, 0, 0);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  145 */     long l2 = bj.a();
/*      */     
/*  147 */     e e1 = l1.bw.a(R.drawable.fog_smooth);
/*      */     
/*  149 */     byte b1 = 20;
/*  150 */     byte b2 = 20;
/*      */     
/*  152 */     byte b3 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  158 */     F = l1.bw.b((b1 + 2) * 16 + 1, (b2 + 2) * 16 + 1, true);
/*  159 */     F.i = true;
/*      */     
/*  161 */     G = l1.bw.a(F);
/*      */ 
/*      */ 
/*      */     
/*  165 */     e e2 = l1.bw.b(b1 + b3, b2 + b3, true);
/*  166 */     l l3 = l1.bw.a(e2);
/*      */ 
/*      */     
/*  169 */     byte b4 = 1;
/*  170 */     byte b5 = 2;
/*  171 */     byte b6 = 4;
/*  172 */     byte b7 = 8;
/*      */ 
/*      */     
/*  175 */     byte b8 = 16;
/*  176 */     byte b9 = 32;
/*  177 */     byte b10 = 64;
/*  178 */     byte b11 = -128;
/*      */ 
/*      */ 
/*      */     
/*  182 */     a(b(b4), 2, 5, true, e2, l3, e1);
/*  183 */     a(b(b5), 0, 5, true, e2, l3, e1);
/*  184 */     a(b(b6), 0, 3, true, e2, l3, e1);
/*  185 */     a(b(b7), 2, 3, true, e2, l3, e1);
/*      */ 
/*      */     
/*  188 */     a(a(b8, new int[] { b4, b5 }), 1, 0, true, e2, l3, e1);
/*  189 */     a(a(b9, new int[] { b5, b6 }), 2, 1, true, e2, l3, e1);
/*  190 */     a(a(b10, new int[] { b7, b6 }), 1, 2, true, e2, l3, e1);
/*  191 */     a(a(b11, new int[] { b4, b7 }), 0, 1, true, e2, l3, e1);
/*      */ 
/*      */     
/*  194 */     a(a(b8 + b9, new int[] { b5, b4, b6 }), 2, 0, true, e2, l3, e1);
/*  195 */     a(a(b9 + b10, new int[] { b6, b7, b5 }), 2, 2, true, e2, l3, e1);
/*  196 */     a(a(b10 + b11, new int[] { b7, b6, b4 }), 0, 2, true, e2, l3, e1);
/*  197 */     a(a(b11 + b8, new int[] { b4, b7, b5 }), 0, 0, true, e2, l3, e1);
/*      */ 
/*      */     
/*  200 */     a(b(b4 + b5), a(new int[] { 2, 5, 0, 5 }, ), true, e2, l3, e1);
/*  201 */     a(b(b5 + b6), a(new int[] { 0, 5, 0, 3 }, ), true, e2, l3, e1);
/*  202 */     a(b(b6 + b7), a(new int[] { 0, 3, 2, 3 }, ), true, e2, l3, e1);
/*  203 */     a(b(b7 + b4), a(new int[] { 2, 3, 2, 5 }, ), true, e2, l3, e1);
/*      */ 
/*      */     
/*  206 */     a(a(b8 + b9 + b10, new int[] { b4, b5, b6, b7 }), a(new int[] { 2, 0, 2, 2 }, ), true, e2, l3, e1);
/*  207 */     a(a(b9 + b10 + b11, new int[] { b4, b5, b6, b7 }), a(new int[] { 2, 2, 0, 2 }, ), true, e2, l3, e1);
/*  208 */     a(a(b10 + b11 + b8, new int[] { b4, b5, b6, b7 }), a(new int[] { 0, 2, 0, 0 }, ), true, e2, l3, e1);
/*  209 */     a(a(b11 + b8 + b9, new int[] { b4, b5, b6, b7 }), a(new int[] { 0, 0, 2, 0 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  218 */     a(b(b8 + b10), a(new int[] { 1, 0, 1, 2 }, ), true, e2, l3, e1);
/*  219 */     a(b(b11 + b9), a(new int[] { 0, 1, 2, 1 }, ), true, e2, l3, e1);
/*      */ 
/*      */     
/*  222 */     a(b(b4 + b6), a(new int[] { 2, 5, 0, 3 }, ), true, e2, l3, e1);
/*  223 */     a(b(b5 + b7), a(new int[] { 0, 5, 2, 3 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  228 */     a(a(b8 + b6, new int[] { b5, b4 }), a(new int[] { 1, 0, 0, 3 }, ), true, e2, l3, e1);
/*  229 */     a(a(b10 + b5, new int[] { b6, b7 }), a(new int[] { 1, 2, 0, 5 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  234 */     a(a(b11 + b5, new int[] { b4, b7 }), a(new int[] { 0, 1, 0, 5 }, ), true, e2, l3, e1);
/*  235 */     a(a(b9 + b4, new int[] { b5, b6 }), a(new int[] { 2, 1, 2, 5 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */     
/*  239 */     a(a(b8 + b7, new int[] { b5, b4 }), a(new int[] { 1, 0, 2, 3 }, ), true, e2, l3, e1);
/*  240 */     a(a(b10 + b4, new int[] { b6, b7 }), a(new int[] { 1, 2, 2, 5 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  246 */     a(a(b11 + b6, new int[] { b4, b7 }), a(new int[] { 0, 1, 0, 3 }, ), true, e2, l3, e1);
/*  247 */     a(a(b9 + b7, new int[] { b5, b6 }), a(new int[] { 2, 1, 2, 3 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */     
/*  251 */     a(a(b8 + b6 + b7, new int[] { b5, b4 }), a(new int[] { 1, 0, 0, 3, 2, 3 }, ), true, e2, l3, e1);
/*  252 */     a(a(b10 + b5 + b4, new int[] { b6, b7 }), a(new int[] { 1, 2, 0, 5, 2, 5 }, ), true, e2, l3, e1);
/*  253 */     a(a(b11 + b5 + b6, new int[] { b4, b7 }), a(new int[] { 0, 1, 2, 5, 2, 3 }, ), true, e2, l3, e1);
/*  254 */     a(a(b9 + b4 + b7, new int[] { b5, b6 }), a(new int[] { 2, 1, 0, 5, 0, 3 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  260 */     a(b(-1), a(new int[] { 1, 4 }, ), true, e2, l3, e1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  281 */     G.m();
/*      */     
/*  283 */     G.n();
/*  284 */     G = null;
/*      */     
/*  286 */     l3.n();
/*  287 */     l3 = null;
/*      */ 
/*      */     
/*  290 */     bj.a("smoothFog load took:", l2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  305 */     D = l1.by.softFogFading;
/*      */ 
/*      */     
/*  308 */     if (l.aj());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  316 */     i = new h(1.0F, false);
/*  317 */     i.a();
/*      */     
/*  319 */     j = new h(0.5F, false);
/*  320 */     j.a();
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
/*      */   private static strictfp int[] b(int paramInt) {
/*  352 */     return new int[] { paramInt };
/*      */   }
/*      */ 
/*      */   
/*      */   private static strictfp int[] a(int paramInt, int... paramVarArgs) {
/*  357 */     ArrayList<Integer> arrayList = new ArrayList();
/*  358 */     arrayList.add(Integer.valueOf(paramInt));
/*      */     
/*  360 */     if (paramVarArgs.length == 1) {
/*      */       
/*  362 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0]));
/*      */     }
/*  364 */     else if (paramVarArgs.length == 2) {
/*      */       
/*  366 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0]));
/*  367 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1]));
/*  368 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1]));
/*      */     }
/*  370 */     else if (paramVarArgs.length == 3) {
/*      */       
/*  372 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0]));
/*  373 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1]));
/*  374 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[2]));
/*      */       
/*  376 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1]));
/*  377 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[2]));
/*      */       
/*  379 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1] + paramVarArgs[2]));
/*      */       
/*  381 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1] + paramVarArgs[2]));
/*      */     }
/*  383 */     else if (paramVarArgs.length == 4) {
/*      */ 
/*      */ 
/*      */       
/*  387 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0]));
/*  388 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1]));
/*  389 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[2]));
/*  390 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[3]));
/*      */       
/*  392 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1] + paramVarArgs[2] + paramVarArgs[3]));
/*  393 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1] + paramVarArgs[2]));
/*  394 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1] + paramVarArgs[3]));
/*  395 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1] + paramVarArgs[2] + paramVarArgs[3]));
/*      */       
/*  397 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[1]));
/*  398 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[2]));
/*  399 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[0] + paramVarArgs[3]));
/*      */       
/*  401 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1] + paramVarArgs[2]));
/*  402 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[1] + paramVarArgs[3]));
/*      */       
/*  404 */       arrayList.add(Integer.valueOf(paramInt + paramVarArgs[2] + paramVarArgs[3]));
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  409 */       throw new RuntimeException("unhandled:" + paramVarArgs.length);
/*      */     } 
/*      */     
/*  412 */     int[] arrayOfInt = new int[arrayList.size()];
/*  413 */     for (byte b1 = 0; b1 < arrayList.size(); b1++) {
/*  414 */       if (arrayList.get(b1) != null) {
/*  415 */         arrayOfInt[b1] = ((Integer)arrayList.get(b1)).intValue();
/*      */       }
/*      */     } 
/*  418 */     return arrayOfInt;
/*      */   }
/*      */ 
/*      */   
/*      */   private static strictfp int[] a(int... paramVarArgs) {
/*  423 */     return paramVarArgs;
/*      */   }
/*      */ 
/*      */   
/*      */   private static strictfp void a(int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean, e parame1, l paraml, e parame2) {
/*  428 */     a(paramArrayOfint, a(new int[] { paramInt1, paramInt2 }, ), paramBoolean, parame1, paraml, parame2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static strictfp void a(int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean, e parame1, l paraml, e parame2) {
/*  436 */     if (paramBoolean)
/*      */     {
/*      */       
/*  439 */       paraml.l();
/*      */     }
/*      */     
/*  442 */     Rect rect1 = new Rect();
/*  443 */     Rect rect2 = new Rect();
/*      */     
/*  445 */     Rect rect3 = new Rect();
/*  446 */     Rect rect4 = new Rect();
/*      */     
/*  448 */     byte b1 = 20;
/*  449 */     byte b2 = 20;
/*      */     
/*  451 */     rect1.a(0, 0, b1, b2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  479 */     l l1 = paraml;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     byte b3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  501 */     for (b3 = 0; b3 < paramArrayOfint2.length; b3 += 2) {
/*      */       
/*  503 */       int j = paramArrayOfint2[b3 + 0] * 20;
/*  504 */       int k = paramArrayOfint2[b3 + 1] * 20;
/*  505 */       rect2.a(j, k, j + b1, k + b2);
/*      */ 
/*      */ 
/*      */       
/*  509 */       l1.a(parame2, rect2, rect1, null);
/*      */ 
/*      */ 
/*      */       
/*  513 */       rect4.a(rect2.c - 1, rect2.b, rect2.c, rect2.d);
/*  514 */       rect3.a(rect1.c, rect1.b, rect1.c + 1, rect1.d);
/*  515 */       l1.a(parame2, rect4, rect3, null);
/*      */       
/*  517 */       rect4.a(rect2.a, rect2.d - 1, rect2.c, rect2.d);
/*  518 */       rect3.a(rect1.a, rect1.d, rect1.c, rect1.d + 1);
/*  519 */       l1.a(parame2, rect4, rect3, null);
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
/*  530 */     l1.m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  537 */     for (b3 = 0; b3 < paramArrayOfint1.length; b3++) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  550 */       int j = paramArrayOfint1[b3] + 128;
/*      */       
/*  552 */       a(j, parame1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(int paramInt, e parame) {
/*  560 */     Rect rect1 = new Rect();
/*  561 */     Rect rect2 = new Rect();
/*      */     
/*  563 */     rect2.a(0, 0, 20, 20);
/*      */     
/*  565 */     a(paramInt, rect1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  573 */     h.a(G, parame, rect2, rect1, (Paint)null);
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
/*      */   public static strictfp void a(int paramInt, Rect paramRect) {
/*  639 */     byte b1 = 20;
/*  640 */     byte b2 = 20;
/*      */     
/*  642 */     int j = paramInt % 16;
/*  643 */     int k = (int)(paramInt * 0.0625F);
/*      */     
/*  645 */     int m = j * (b1 + 2) + 1;
/*  646 */     int n = k * (b2 + 2) + 1;
/*      */     
/*  648 */     paramRect.a = m;
/*  649 */     paramRect.b = n;
/*  650 */     paramRect.c = m + b1;
/*  651 */     paramRect.d = n + b2;
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
/*  675 */   public ArrayList q = new ArrayList();
/*      */   
/*  677 */   public e r = null;
/*  678 */   public e s = null;
/*      */   
/*      */   public e t;
/*      */   
/*  682 */   public e u = null;
/*      */   
/*  684 */   public ArrayList v = new ArrayList();
/*      */   
/*  686 */   public ArrayList w = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*  690 */   private int ak = 1;
/*  691 */   public g[] x = new g[0]; public int y;
/*      */   public int z;
/*      */   
/*      */   public final strictfp short a(g paramg) {
/*  695 */     if (this.ak >= this.x.length) {
/*      */       
/*  697 */       g[] arrayOfG = new g[f.c(this.x.length + 100, 32767)];
/*  698 */       System.arraycopy(this.x, 0, arrayOfG, 0, this.x.length);
/*  699 */       this.x = arrayOfG;
/*      */     } 
/*      */     
/*  702 */     int j = this.ak;
/*  703 */     this.ak++;
/*      */     
/*  705 */     this.x[j] = paramg;
/*  706 */     return (short)j;
/*      */   }
/*      */ 
/*      */   
/*      */   public final strictfp g a(short paramShort) {
/*  711 */     return this.x[paramShort];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp g a(g paramg, int paramInt1, int paramInt2) {
/*  720 */     if (paramg.m != null) {
/*      */ 
/*      */ 
/*      */       
/*  724 */       int j = (paramInt1 * 13 + paramInt2 * 1313) % (paramg.m.length + 1);
/*  725 */       j--;
/*      */ 
/*      */ 
/*      */       
/*  729 */       if (j >= 0)
/*      */       {
/*  731 */         return paramg.m[j];
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  738 */     return paramg;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean A = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean B = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean C = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean D = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean E = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public static e F;
/*      */ 
/*      */ 
/*      */   
/*      */   public static l G;
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[][] H;
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[][] I;
/*      */ 
/*      */ 
/*      */   
/*  783 */   Rect J = new Rect();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(float paramFloat1, float paramFloat2, m paramm) {
/*  827 */     if (this.A) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  835 */       int j = (int)(paramFloat1 * this.o);
/*  836 */       int k = (int)(paramFloat2 * this.p);
/*      */       
/*  838 */       if (paramm.C != null)
/*      */       {
/*  840 */         if (c(j, k) && paramm.C[j][k] >= 5)
/*      */         {
/*  842 */           return false;
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  847 */     return true;
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
/*  860 */   protected ArrayList K = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public i L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int M;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int N;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  880 */   public PointF O = new PointF(); public boolean P; public boolean Q; public int R;
/*      */   public int S;
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2) {
/*  884 */     this.M = (int)(paramFloat1 * this.o);
/*  885 */     this.N = (int)(paramFloat2 * this.p);
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
/*      */   public strictfp void a(int paramInt1, int paramInt2) {
/*  897 */     this.M = paramInt1 * this.k;
/*  898 */     this.N = paramInt2 * this.l;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(int paramInt1, int paramInt2) {
/*  903 */     this.M = paramInt1 * this.k + this.m;
/*  904 */     this.N = paramInt2 * this.l + this.n;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp PointF a(Point paramPoint) {
/*  909 */     this.O.a((paramPoint.a * this.k), (paramPoint.b * this.l));
/*  910 */     return this.O;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(float paramFloat1, float paramFloat2) {
/*  915 */     a(paramFloat1, paramFloat2);
/*  916 */     a(this.M, this.N);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float a(float paramFloat) {
/*  922 */     if (paramFloat < 0.0F) paramFloat = 0.0F; 
/*  923 */     if (paramFloat > f()) paramFloat = f(); 
/*  924 */     return paramFloat;
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp float b(float paramFloat) {
/*  929 */     if (paramFloat < 0.0F) paramFloat = 0.0F; 
/*  930 */     if (paramFloat > g()) paramFloat = g(); 
/*  931 */     return paramFloat;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final strictfp boolean c(int paramInt1, int paramInt2) {
/*  937 */     return (paramInt1 >= 0 && paramInt1 < this.y && paramInt2 >= 0 && paramInt2 < this.z);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp g c(float paramFloat1, float paramFloat2) {
/*  942 */     int j = (int)(paramFloat1 * this.o);
/*  943 */     int k = (int)(paramFloat2 * this.p);
/*      */     
/*  945 */     if (j < 0 || j >= this.y || k < 0 || k >= this.z)
/*      */     {
/*  947 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  953 */     return this.r.a(j, k);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp g d(int paramInt1, int paramInt2) {
/*  958 */     if (!c(paramInt1, paramInt2)) return null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  964 */     return this.r.a(paramInt1, paramInt2);
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp g e(int paramInt1, int paramInt2) {
/*  969 */     if (!c(paramInt1, paramInt2)) return null;
/*      */     
/*  971 */     if (this.u == null)
/*      */     {
/*  973 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  979 */     return this.u.a(paramInt1, paramInt2);
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
/*  991 */   float T = 0.0F;
/*      */ 
/*      */   
/*      */   Paint U;
/*      */   
/*      */   Paint V;
/*      */   
/*      */   Paint W;
/*      */   
/*      */   Paint X;
/*      */   
/*      */   Paint Y;
/*      */   
/*      */   Paint Z;
/*      */   
/*      */   float aa;
/*      */   
/*      */   float ab;
/*      */   
/*      */   int ac;
/*      */ 
/*      */   
/*      */   strictfp void a(RectF paramRectF) {
/* 1014 */     if (l.v()) {
/*      */       
/* 1016 */       paramRectF.a *= (this.k / 20);
/* 1017 */       paramRectF.c *= (this.k / 20);
/*      */       
/* 1019 */       paramRectF.b *= (this.l / 20);
/* 1020 */       paramRectF.d *= (this.l / 20);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(String paramString, ap paramap) {
/* 1092 */     InputStream inputStream = b(paramString);
/* 1093 */     if (inputStream == null)
/*      */     {
/* 1095 */       throw new IOException("writeMapStream: Could not find map:" + paramString);
/*      */     }
/*      */     
/* 1098 */     int j = (int)a(paramString);
/*      */     
/* 1100 */     l.d("Sending map stream of size: " + j);
/*      */     
/* 1102 */     paramap.a(inputStream, j);
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
/*      */   public static strictfp long a(String paramString) {
/* 1116 */     String str1 = "" + paramString;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1145 */     String str2 = a.c(str1);
/*      */ 
/*      */     
/* 1148 */     if (ae.c(str2) && !str2.endsWith(".rwmod")) {
/*      */       
/* 1150 */       long l1 = ae.a(str2, false);
/*      */       
/* 1152 */       if (l1 == -1L);
/*      */ 
/*      */ 
/*      */       
/* 1156 */       return l1;
/*      */     } 
/*      */ 
/*      */     
/* 1160 */     if (a.b(str1)) {
/*      */ 
/*      */       
/* 1163 */       AssetManager assetManager = (l.u()).ah.d();
/*      */       
/*      */       try {
/* 1166 */         AssetFileDescriptor assetFileDescriptor = assetManager.b(str2);
/* 1167 */         return assetFileDescriptor.getLength();
/*      */       }
/* 1169 */       catch (IOException iOException) {
/*      */         
/* 1171 */         throw new RuntimeException(iOException);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1177 */     File file = new File(str2);
/* 1178 */     return file.length();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp InputStream b(String paramString) {
/* 1186 */     InputStream inputStream = d(paramString);
/* 1187 */     if (inputStream == null) {
/*      */       
/* 1189 */       InputStream inputStream1 = d(paramString.replace(".tmx", "") + "_moved");
/* 1190 */       if (inputStream1 != null) {
/*      */         
/* 1192 */         String str = f.a(inputStream1);
/* 1193 */         str = str.trim();
/* 1194 */         l.d("Found moved map at:" + str);
/* 1195 */         inputStream = d(str);
/*      */       } 
/*      */     } 
/*      */     
/* 1199 */     return inputStream;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String c(String paramString) {
/* 1205 */     if (paramString == null) return null;
/*      */ 
/*      */     
/* 1208 */     return a.c(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp InputStream d(String paramString) {
/* 1217 */     String str = c("" + paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1241 */     l.d("Mapfile: " + str);
/*      */ 
/*      */     
/* 1244 */     return (InputStream)a.h(str);
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
/*      */   public strictfp void a(Document paramDocument, OutputStream paramOutputStream) {
/* 1332 */     TransformerFactory transformerFactory = TransformerFactory.newInstance();
/* 1333 */     Transformer transformer = transformerFactory.newTransformer();
/*      */     
/* 1335 */     transformer.setOutputProperty("indent", "yes");
/* 1336 */     DOMSource dOMSource = new DOMSource(paramDocument);
/*      */ 
/*      */     
/* 1339 */     StreamResult streamResult = new StreamResult(paramOutputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1344 */     transformer.transform(dOMSource, streamResult);
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
/*      */   public strictfp void a(InputStream paramInputStream, OutputStream paramOutputStream) {
/* 1389 */     DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
/* 1390 */     documentBuilderFactory.setValidating(false);
/* 1391 */     DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
/* 1392 */     documentBuilder.setEntityResolver(new b$1(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1399 */     Document document = documentBuilder.parse(paramInputStream);
/* 1400 */     Element element1 = document.getDocumentElement();
/*      */     
/* 1402 */     String str = element1.getAttribute("orientation");
/* 1403 */     if (!str.equals("orthogonal")) {
/* 1404 */       throw new f("Only orthogonal maps are supported, found: " + str);
/*      */     }
/*      */     
/* 1407 */     NodeList nodeList1 = element1.getElementsByTagName("SOMETHING");
/* 1408 */     for (byte b1 = 0; b1 < nodeList1.getLength(); b1++)
/*      */     {
/* 1410 */       Element element = (Element)nodeList1.item(b1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1420 */     NodeList nodeList2 = element1.getElementsByTagName("layer");
/* 1421 */     for (byte b2 = 0; b2 < nodeList2.getLength(); b2++) {
/*      */       
/* 1423 */       Element element = (Element)nodeList2.item(b2);
/*      */       
/* 1425 */       String str1 = element.getAttribute("name");
/* 1426 */       if ("units".equalsIgnoreCase(str1))
/*      */       {
/* 1428 */         element.getParentNode().removeChild(element);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1433 */     NodeList nodeList3 = element1.getElementsByTagName("objectgroup");
/* 1434 */     for (byte b3 = 0; b3 < nodeList3.getLength(); b3++) {
/*      */       
/* 1436 */       Element element = (Element)nodeList3.item(b3);
/*      */       
/* 1438 */       String str1 = element.getAttribute("name");
/* 1439 */       if ("UnitObjects".equalsIgnoreCase(str1))
/*      */       {
/* 1441 */         element.getParentNode().removeChild(element);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1449 */     Element element2 = document.createElement("objectgroup");
/* 1450 */     element2.setAttribute("name", "UnitObjects");
/*      */ 
/*      */     
/* 1453 */     o o = af.bt();
/*      */ 
/*      */     
/* 1456 */     for (af af1 : o) {
/*      */       float f;
/* 1458 */       if (!(af1 instanceof af)) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/* 1463 */       if (af1 instanceof ae)
/*      */       {
/* 1465 */         if (((ae)af1).br) {
/*      */           continue;
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1473 */       af af2 = af1;
/*      */       
/* 1475 */       if (af2.bz || af2.o_()) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/* 1480 */       i i1 = af2.cV();
/* 1481 */       if (af2.cq != null && i1 != null) {
/*      */         
/* 1483 */         if (!i1.D);
/*      */ 
/*      */ 
/*      */         
/*      */         continue;
/*      */       } 
/*      */ 
/*      */       
/* 1491 */       Element element3 = document.createElement("object");
/*      */ 
/*      */       
/* 1494 */       int j = 20;
/*      */       
/* 1496 */       if (j < af2.bO)
/*      */       {
/* 1498 */         j = (int)af2.bO;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1503 */       element3.setAttribute("name", af2.r().i() + " (t:" + af2.bB.i + ")");
/*      */       
/* 1505 */       element3.setAttribute("x", "" + (af2.dH - (j / 2)));
/* 1506 */       element3.setAttribute("y", "" + (af2.dI - (j / 2)));
/*      */       
/* 1508 */       element3.setAttribute("width", "" + j);
/* 1509 */       element3.setAttribute("height", "" + j);
/*      */ 
/*      */ 
/*      */       
/* 1513 */       if (af2.bw()) {
/*      */         
/* 1515 */         f = af2.bL;
/*      */       }
/*      */       else {
/*      */         
/* 1519 */         f = af2.bL + 90.0F;
/*      */       } 
/*      */       
/* 1522 */       element3.setAttribute("rotation", "" + f);
/*      */ 
/*      */       
/* 1525 */       Integer integer = a(af2.r());
/* 1526 */       if (integer != null)
/*      */       {
/* 1528 */         element3.setAttribute("gid", "" + integer);
/*      */       }
/*      */ 
/*      */       
/* 1532 */       Element element4 = document.createElement("properties");
/*      */ 
/*      */ 
/*      */       
/* 1536 */       Element element5 = document.createElement("property");
/* 1537 */       element5.setAttribute("name", "unit");
/* 1538 */       element5.setAttribute("value", af2.r().i());
/* 1539 */       element4.appendChild(element5);
/*      */       
/* 1541 */       element5 = document.createElement("property");
/* 1542 */       element5.setAttribute("name", "team");
/* 1543 */       element5.setAttribute("value", "" + af2.bB.i);
/* 1544 */       element4.appendChild(element5);
/*      */       
/* 1546 */       element3.appendChild(element4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1552 */       element2.appendChild(element3);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1559 */     element1.appendChild(element2);
/*      */ 
/*      */     
/* 1562 */     a(document, paramOutputStream);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean a(String paramString1, String paramString2) {
/* 1569 */     l l1 = l.u();
/*      */ 
/*      */     
/*      */     try {
/* 1573 */       b(paramString1, paramString2);
/*      */       
/* 1575 */       l1.bA.e.a(null, "Map exported.");
/*      */       
/* 1577 */       return true;
/*      */     }
/* 1579 */     catch (f f) {
/*      */       
/* 1581 */       l1.c("Error exporting map", "Failed to export map. error: " + f.getMessage());
/* 1582 */       return false;
/*      */     }
/* 1584 */     catch (IOException iOException) {
/*      */       
/* 1586 */       iOException.printStackTrace();
/* 1587 */       l1.c("Error exporting map", "Failed to export map. IO error: " + iOException.getMessage());
/* 1588 */       return false;
/*      */     }
/* 1590 */     catch (NoClassDefFoundError noClassDefFoundError) {
/*      */       
/* 1592 */       noClassDefFoundError.printStackTrace();
/* 1593 */       l1.c("Error exporting map", "Failed to export map. Class not found: " + noClassDefFoundError.getMessage());
/* 1594 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public strictfp void b(String paramString1, String paramString2) {
/*      */     FileOutputStream fileOutputStream;
/* 1601 */     l.d(" --- Saving map:" + paramString1 + " to: " + paramString2);
/*      */ 
/*      */     
/* 1604 */     InputStream inputStream = b(paramString1);
/*      */ 
/*      */ 
/*      */     
/* 1608 */     if (inputStream == null)
/*      */     {
/* 1610 */       throw new IOException("Could not find orginal map: " + paramString1);
/*      */     }
/*      */     
/* 1613 */     BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
/*      */ 
/*      */ 
/*      */     
/* 1617 */     paramString2 = a.c(paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1623 */     File file = (new File(paramString2)).getParentFile();
/* 1624 */     file.mkdirs();
/* 1625 */     if (!file.isDirectory())
/*      */     {
/* 1627 */       l.b("Save Map: Could not create parent directory");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1633 */       fileOutputStream = new FileOutputStream(paramString2);
/*      */     }
/* 1635 */     catch (FileNotFoundException fileNotFoundException) {
/*      */       
/* 1637 */       throw new IOException("Failed to open save target:" + paramString2);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1646 */       a(bufferedInputStream, fileOutputStream);
/*      */     }
/* 1648 */     catch (ParserConfigurationException parserConfigurationException) {
/*      */       
/* 1650 */       throw new IOException(parserConfigurationException);
/*      */     }
/* 1652 */     catch (SAXException sAXException) {
/*      */       
/* 1654 */       throw new IOException(sAXException);
/*      */     }
/* 1656 */     catch (IOException iOException) {
/*      */       
/* 1658 */       throw new IOException(iOException);
/*      */     }
/* 1660 */     catch (TransformerException transformerException) {
/*      */       
/* 1662 */       throw new IOException(transformerException);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1668 */       fileOutputStream.close();
/*      */ 
/*      */       
/* 1671 */       bufferedInputStream.close();
/* 1672 */       inputStream.close();
/*      */     }
/* 1674 */     catch (IOException iOException) {
/*      */ 
/*      */       
/* 1677 */       iOException.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(String paramString, boolean paramBoolean) {
/* 1687 */     l.d(" --- Loading map ---");
/*      */ 
/*      */     
/* 1690 */     InputStream inputStream = b(paramString);
/*      */     
/* 1692 */     if (inputStream == null) {
/*      */       
/* 1694 */       String str = c(paramString);
/*      */ 
/*      */ 
/*      */       
/* 1698 */       throw new f("Could not find map: " + str);
/*      */     } 
/*      */ 
/*      */     
/* 1702 */     BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
/*      */     
/* 1704 */     a(bufferedInputStream, paramBoolean);
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1709 */       bufferedInputStream.close();
/* 1710 */       inputStream.close();
/*      */     }
/* 1712 */     catch (IOException iOException) {
/*      */       
/* 1714 */       iOException.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(InputStream paramInputStream, boolean paramBoolean) {
/* 1722 */     this.w.clear();
/*      */ 
/*      */ 
/*      */     
/* 1726 */     i.b();
/*      */ 
/*      */ 
/*      */     
/* 1730 */     j.b();
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
/* 1741 */       l.d("---- Loading map data ----");
/*      */       
/* 1743 */       DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
/* 1744 */       documentBuilderFactory.setValidating(false);
/* 1745 */       DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
/* 1746 */       documentBuilder.setEntityResolver(new b$2(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1753 */       Document document = documentBuilder.parse(paramInputStream);
/* 1754 */       Element element1 = document.getDocumentElement();
/*      */       
/* 1756 */       String str = element1.getAttribute("orientation");
/* 1757 */       if (!str.equals("orthogonal")) {
/* 1758 */         throw new f("Only orthogonal maps are supported, found: " + str);
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1766 */       int j = Integer.parseInt(element1.getAttribute("width"));
/* 1767 */       int k = Integer.parseInt(element1.getAttribute("height"));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1773 */       this.y = j;
/* 1774 */       this.z = k;
/*      */       
/* 1776 */       l.d("Map size: " + this.y + ", " + this.z);
/*      */ 
/*      */       
/* 1779 */       this.aj = 150.0F;
/*      */ 
/*      */ 
/*      */       
/* 1783 */       if (this.A) {
/*      */         
/* 1785 */         l.d("Setting up team fog..");
/*      */         
/* 1787 */         for (byte b3 = 0; b3 < m.a; b3++)
/*      */         {
/* 1789 */           m m = m.n(b3);
/* 1790 */           if (m != null)
/*      */           {
/*      */             
/* 1793 */             m.A = this.y;
/* 1794 */             m.B = this.z;
/*      */             
/* 1796 */             m.C = new byte[this.y][this.z];
/*      */ 
/*      */             
/* 1799 */             for (byte b4 = 0; b4 < this.y; b4++)
/*      */             {
/* 1801 */               for (byte b5 = 0; b5 < this.z; b5++)
/*      */               {
/* 1803 */                 m.C[b4][b5] = 10;
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1813 */         l.d("No team fog on this map..");
/*      */         
/* 1815 */         for (byte b3 = 0; b3 < m.a; b3++) {
/*      */           
/* 1817 */           m m = m.n(b3);
/* 1818 */           if (m != null)
/*      */           {
/* 1820 */             m.C = (byte[][])null;
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1832 */       Element element2 = (Element)element1.getElementsByTagName("properties").item(0);
/* 1833 */       if (element2 != null) {
/* 1834 */         NodeList nodeList = element2.getElementsByTagName("property");
/* 1835 */         if (nodeList != null) {
/* 1836 */           Properties properties = new Properties();
/* 1837 */           for (byte b3 = 0; b3 < nodeList.getLength(); b3++) {
/* 1838 */             Element element = (Element)nodeList.item(b3);
/*      */             
/* 1840 */             String str3 = element.getAttribute("name");
/* 1841 */             String str4 = element.getAttribute("value");
/* 1842 */             properties.setProperty(str3, str4);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1849 */       j j1 = null;
/*      */       
/* 1851 */       NodeList nodeList1 = element1.getElementsByTagName("tileset"); short s;
/* 1852 */       for (s = 0; s < nodeList1.getLength(); s = (short)(s + 1)) {
/* 1853 */         Element element = (Element)nodeList1.item(s);
/*      */         
/* 1855 */         j j2 = new j(this, element);
/* 1856 */         j2.m = s;
/*      */         
/* 1858 */         if (j1 != null) {
/* 1859 */           j1.c(j2.k - 1);
/*      */         }
/* 1861 */         j1 = j2;
/*      */         
/* 1863 */         this.q.add(j2);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1868 */       NodeList nodeList2 = element1.getElementsByTagName("layer"); byte b1;
/* 1869 */       for (b1 = 0; b1 < nodeList2.getLength(); b1++) {
/* 1870 */         Element element = (Element)nodeList2.item(b1);
/*      */         
/* 1872 */         String str3 = element.getAttribute("name");
/* 1873 */         if (!"set".equalsIgnoreCase(str3))
/*      */         {
/*      */ 
/*      */           
/* 1877 */           if (!"set-disabled".equalsIgnoreCase(str3)) {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1882 */             e e1 = new e(this, element);
/* 1883 */             e1.j = b1;
/*      */             
/* 1885 */             this.v.add(e1);
/*      */           } 
/*      */         }
/*      */       } 
/* 1889 */       for (e e1 : this.v) {
/*      */         
/* 1891 */         if (e1.r)
/*      */         {
/* 1893 */           this.r = e1;
/*      */         }
/*      */ 
/*      */         
/* 1897 */         if (e1.k.equalsIgnoreCase("grounddetails"))
/*      */         {
/* 1899 */           this.s = e1;
/*      */         }
/*      */         
/* 1902 */         if (e1.k.equalsIgnoreCase("Items") || e1.k.equalsIgnoreCase("Objects"))
/*      */         {
/* 1904 */           this.u = e1;
/*      */         }
/*      */         
/* 1907 */         if (e1.k.equalsIgnoreCase("PathingOverride"))
/*      */         {
/* 1909 */           this.t = e1;
/*      */         }
/*      */       } 
/*      */       
/* 1913 */       if (this.r == null)
/*      */       {
/* 1915 */         throw new f("'Ground' layer was not found in map, this layer is required");
/*      */       }
/*      */       
/* 1918 */       if (!l.v() && !l.w())
/*      */       {
/*      */         
/* 1921 */         for (b1 = 0; b1 < this.y; b1++) {
/*      */           
/* 1923 */           for (byte b3 = 0; b3 < this.z; b3++) {
/*      */ 
/*      */             
/* 1926 */             if (this.r.a(b1, b3) == null)
/*      */             {
/* 1928 */               throw new f("An empty tile on the Ground layer at " + b1 + "," + b3 + " all tiles must be filled");
/*      */             }
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 1935 */       if (this.u == null)
/*      */       {
/* 1937 */         throw new f("'Items' layer was not found in map, this layer is required");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1946 */       NodeList nodeList3 = element1.getElementsByTagName("objectgroup");
/*      */       byte b2;
/* 1948 */       for (b2 = 0; b2 < nodeList3.getLength(); b2++) {
/* 1949 */         Element element = (Element)nodeList3.item(b2);
/* 1950 */         i i1 = new i(element, this);
/* 1951 */         i1.a = b2;
/*      */         
/* 1953 */         this.K.add(i1);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1958 */       j.a();
/* 1959 */       for (j j2 : this.q) {
/*      */         
/* 1961 */         if (j2.p)
/*      */         {
/* 1963 */           j2.c();
/*      */         }
/*      */       } 
/* 1966 */       j.b();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1971 */       for (b2 = 0; b2 <= 1; b2++) {
/*      */         
/* 1973 */         for (e e1 : this.v) {
/*      */           
/* 1975 */           boolean bool3 = (e1 == this.r) ? true : false;
/* 1976 */           boolean bool4 = (b2 == 0) ? true : false;
/*      */           
/* 1978 */           if (bool3 != bool4) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1983 */           e1.w = false;
/*      */           
/* 1985 */           if (e1.s)
/*      */           {
/* 1987 */             for (byte b3 = 0; b3 < this.y; b3++) {
/*      */               
/* 1989 */               for (byte b4 = 0; b4 < this.z; b4++) {
/*      */                 
/* 1991 */                 g g1 = e1.a(b3, b4);
/* 1992 */                 if (g1 != null && g1.c == -2) {
/*      */                   
/* 1994 */                   g1.c = i.a(g1.a, g1.b);
/*      */                   
/* 1996 */                   if (g1.c >= 0) {
/*      */                     
/* 1998 */                     int m = j.a(g1.a, g1.b);
/* 1999 */                     if (m != g1.c)
/*      */                     {
/* 2001 */                       throw new RuntimeException("Meta index mismatch: " + m + " vs " + g1.c);
/*      */                     }
/*      */                   } 
/*      */                   
/* 2005 */                   if (g1.c < 0)
/*      */                   {
/* 2007 */                     e1.w = true;
/*      */                   }
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 2017 */       i.c();
/* 2018 */       j.c();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2056 */       this.L = e("triggers");
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 2061 */     catch (IOException iOException) {
/*      */ 
/*      */       
/* 2064 */       throw new f("Failed to parse map", iOException);
/*      */     }
/* 2066 */     catch (ParserConfigurationException parserConfigurationException) {
/*      */ 
/*      */       
/* 2069 */       throw new RuntimeException("Failed to parse map", parserConfigurationException);
/*      */     }
/* 2071 */     catch (SAXException sAXException) {
/*      */ 
/*      */       
/* 2074 */       l.d(" --- SAXException: Failed to parse map - " + sAXException.getMessage() + " ---");
/*      */ 
/*      */       
/*      */       try {
/* 2078 */         l.d("available:" + paramInputStream.available());
/*      */         
/* 2080 */         paramInputStream.reset();
/*      */         
/* 2082 */         l.d("after reset:" + paramInputStream.available());
/*      */       }
/* 2084 */       catch (IOException iOException) {
/*      */         
/* 2086 */         l.d("-- error writing debug info --");
/* 2087 */         iOException.printStackTrace();
/*      */       } 
/*      */ 
/*      */       
/* 2091 */       throw new f("Failed to parse map - " + sAXException.getMessage(), sAXException);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2096 */     a a = null;
/*      */     
/* 2098 */     if (this.L != null)
/*      */     {
/* 2100 */       a = this.L.a("map_info");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 2105 */     boolean bool1 = false;
/*      */ 
/*      */     
/* 2108 */     boolean bool2 = false;
/*      */ 
/*      */ 
/*      */     
/* 2112 */     l l1 = l.u();
/*      */ 
/*      */     
/* 2115 */     l1.bM = null;
/*      */     
/* 2117 */     String str1 = null;
/* 2118 */     String str2 = null;
/*      */     
/* 2120 */     if (a != null) {
/*      */       
/* 2122 */       String str = a.b("type");
/*      */       
/* 2124 */       str2 = a.b("fog");
/*      */       
/* 2126 */       if ("mission".equalsIgnoreCase(str) || "survival"
/* 2127 */         .equalsIgnoreCase(str) || "challenge"
/* 2128 */         .equalsIgnoreCase(str) || "skirmish"
/* 2129 */         .equalsIgnoreCase(str))
/*      */       {
/* 2131 */         str1 = str;
/*      */       }
/*      */       else
/*      */       {
/* 2135 */         l.b("Unknown map type:" + str);
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2140 */       l.b("Map type not found on mapInfo");
/*      */     } 
/*      */ 
/*      */     
/* 2144 */     if (str1 == null) {
/*      */       
/* 2146 */       l.b("Defaulting to skirmish map type");
/* 2147 */       str1 = "skirmish";
/*      */     }
/*      */     else {
/*      */       
/* 2151 */       l.b("Map type: " + str1);
/*      */     } 
/*      */ 
/*      */     
/* 2155 */     l1.bM = new f();
/* 2156 */     l1.bM.a(paramBoolean);
/*      */ 
/*      */     
/* 2159 */     if (str2 != null && !"".equals(str2)) {
/*      */       
/* 2161 */       if (!str2.equalsIgnoreCase("none"))
/*      */       {
/* 2163 */         bool1 = true;
/*      */         
/* 2165 */         if (str2.equalsIgnoreCase("los"))
/*      */         {
/* 2167 */           bool2 = true;
/*      */         }
/* 2169 */         else if (!str2.equalsIgnoreCase("map"))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2175 */           l.d("Unknown map fog type: " + str2);
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/* 2186 */     else if (l.al() && !l1.G()) {
/*      */       
/* 2188 */       bool1 = true;
/*      */       
/* 2190 */       if (str1 != null)
/*      */       {
/* 2192 */         if (str1.equalsIgnoreCase("skirmish"))
/*      */         {
/* 2194 */           bool2 = true;
/*      */         }
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
/* 2206 */     if (!bool1)
/*      */     {
/*      */ 
/*      */       
/* 2210 */       this.A = false;
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
/* 2224 */     if (bool1)
/*      */     {
/* 2226 */       if (bool2)
/*      */       {
/* 2228 */         this.B = true;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2235 */     this.P = true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp b() {
/* 2378 */     this.ab = 1.0F;
/* 2379 */     this.ac = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4617 */     this.ae = new Paint();
/* 4618 */     this.af = new Rect();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4717 */     this.ag = new Rect(); this.k = 20; this.l = 20; if (l.v()) {
/*      */       this.k = 60; this.l = 60;
/*      */     }  this.m = this.k / 2; this.n = this.l / 2; this.o = 1.0F / this.k; this.p = 1.0F / this.l; this.U = (Paint)new q(); this.U.a(100, 255, 0, 0); this.U.b(16.0F); this.V = (Paint)new q(); this.V.a(Paint.Style.b); this.V.a(1.0F); this.V.a(255, 0, 225, 0); this.W = (Paint)new q(); this.W.a(Paint.Style.b); this.W.a(1.0F); this.W.a(100, 0, 185, 0); this.X = (Paint)new q(); this.X.a(Paint.Style.b); this.X.a(1.0F); this.X.a(255, 175, 0, 0); this.Y = (Paint)new q(); this.Y.a(155, 175, 0, 0);
/*      */     this.Z = (Paint)new q();
/* 4721 */     this.Z.a((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR)); } public static c ad = new c(); Paint ae; Rect af; Rect ag; long ah; public strictfp void c(float paramFloat) { ad.a(paramFloat); }
/*      */   float ai;
/*      */   float aj;
/*      */   public strictfp void b() {} public strictfp void a(k paramk) { if (l.aF && !l.aG)
/*      */       return;  ad.a(paramk); } public strictfp void a(r paramr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, l paraml, boolean paramBoolean, int paramInt7) { l l1 = l.u(); b b1 = l1.bt; al al = l1.bA.W.i(); ah ah = al.o(); for (int j = paramInt1; j <= paramInt3; j++) { for (int k = paramInt2; k <= paramInt4; k++) { boolean bool = c.a(paramr, al, ah, j, k, paramInt7); int m = j * b1.k - paramInt5; int n = k * b1.l - paramInt6; this.af.a(m, n, m + b1.k - 1, n + b1.l - 1); if (paramBoolean) { if (bool) { paraml.b(this.af, b1.W); } else { paraml.b(this.af, b1.Y); paraml.b(this.af, b1.X); }  } else if (bool) { paraml.b(this.af, b1.V); } else { paraml.b(this.af, b1.X); }  }  }
/* 4726 */      } public static strictfp void c() { ad.d(); } public strictfp void d() { ad.c(); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void d(float paramFloat) {
/* 4745 */     c(paramFloat);
/*      */ 
/*      */ 
/*      */     
/* 4749 */     if (this.Q) {
/*      */       
/* 4751 */       Rect rect1 = new Rect();
/* 4752 */       Rect rect2 = new Rect();
/*      */       
/* 4754 */       int j = this.R * this.k;
/* 4755 */       int k = this.S * this.l;
/* 4756 */       rect2.a(j, k, j + this.k, k + this.l);
/* 4757 */       rect2.a(-(l.u()).cb, -(l.u()).cc);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void e(float paramFloat) {
/* 4767 */     l l1 = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4772 */     f(paramFloat);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void e() {
/* 4898 */     for (j j : this.q)
/*      */     {
/* 4900 */       j.d();
/*      */     }
/* 4902 */     this.q.clear();
/*      */ 
/*      */     
/* 4905 */     for (e e1 : this.v)
/*      */     {
/* 4907 */       e1.b();
/*      */     }
/* 4909 */     this.v.clear();
/*      */ 
/*      */     
/* 4912 */     this.K.clear();
/*      */     
/* 4914 */     this.L = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4929 */     ad.c();
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
/*      */   public strictfp j a(int paramInt) {
/* 4945 */     for (byte b1 = 0; b1 < this.q.size(); b1++) {
/* 4946 */       j j = this.q.get(b1);
/*      */       
/* 4948 */       if (j.d(paramInt)) {
/* 4949 */         return j;
/*      */       }
/*      */     } 
/*      */     
/* 4953 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp Integer a(al paramal) {
/* 4959 */     String str = paramal.i();
/*      */     
/* 4961 */     Integer integer = c("unit", str);
/*      */     
/* 4963 */     if (integer == null)
/*      */     {
/* 4965 */       integer = c("customUnit", str);
/*      */     }
/*      */ 
/*      */     
/* 4969 */     return integer;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp Integer c(String paramString1, String paramString2) {
/* 4977 */     for (byte b1 = 0; b1 < this.q.size(); b1++) {
/*      */       
/* 4979 */       j j = this.q.get(b1);
/* 4980 */       Integer integer = j.b(paramString1, paramString2);
/*      */       
/* 4982 */       if (integer != null)
/*      */       {
/* 4984 */         return integer;
/*      */       }
/*      */     } 
/*      */     
/* 4988 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp i e(String paramString) {
/* 4996 */     for (i i1 : this.K) {
/*      */       
/* 4998 */       if (paramString.equalsIgnoreCase(i1.b))
/*      */       {
/* 5000 */         return i1;
/*      */       }
/*      */     } 
/* 5003 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp float f() {
/* 5011 */     return (this.r.n * this.k);
/*      */   }
/*      */   
/*      */   public strictfp float g() {
/* 5015 */     return (this.r.o * this.l);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(float paramFloat1, float paramFloat2, int paramInt, m paramm, boolean paramBoolean) {
/* 5023 */     l l1 = l.u();
/*      */     
/* 5025 */     if (this.A) {
/*      */ 
/*      */       
/* 5028 */       long l2 = 0L;
/* 5029 */       if (a)
/*      */       {
/* 5031 */         l2 = bj.a();
/*      */       }
/*      */       
/* 5034 */       boolean bool = true;
/* 5035 */       boolean bool1 = paramm.u;
/*      */       
/* 5037 */       if (!l1.ao()) {
/*      */         
/* 5039 */         f f = l1.bM;
/* 5040 */         if (f != null && !f.a() && !f.b())
/*      */         {
/* 5042 */           bool = false;
/*      */         }
/*      */       } 
/*      */       
/* 5046 */       if (!bool) {
/*      */         
/* 5048 */         b(paramFloat1, paramFloat2, paramInt, paramm, paramBoolean);
/*      */       }
/*      */       else {
/*      */         
/* 5052 */         for (byte b1 = 0; b1 < m.a; b1++) {
/*      */           
/* 5054 */           m m1 = m.n(b1);
/* 5055 */           if (m1 != null)
/*      */           {
/* 5057 */             if (m1 == paramm || (!m1.r && (m1.d(paramm) || bool1)))
/*      */             {
/* 5059 */               b(paramFloat1, paramFloat2, paramInt, m1, paramBoolean);
/*      */             }
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 5066 */       if (a)
/*      */       {
/* 5068 */         this.ah += bj.a() - l2;
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
/*      */   public strictfp byte a(int paramInt1, int paramInt2, byte[][] paramArrayOfbyte, byte paramByte) {
/* 5091 */     byte b1 = 0;
/*      */     
/* 5093 */     int j = this.y;
/* 5094 */     int k = this.z;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5111 */     if (paramInt1 >= 1) {
/*      */ 
/*      */       
/* 5114 */       if (paramArrayOfbyte[paramInt1 - 1][paramInt2] >= paramByte) b1 = (byte)(b1 - 128);
/*      */ 
/*      */       
/* 5117 */       if (paramInt2 >= 1)
/*      */       {
/*      */         
/* 5120 */         if (paramArrayOfbyte[paramInt1 - 1][paramInt2 - 1] >= paramByte) b1 = (byte)(b1 + 1); 
/*      */       }
/* 5122 */       if (paramInt2 < k - 1)
/*      */       {
/*      */         
/* 5125 */         if (paramArrayOfbyte[paramInt1 - 1][paramInt2 + 1] >= paramByte) b1 = (byte)(b1 + 8); 
/*      */       }
/*      */     } 
/* 5128 */     if (paramInt2 >= 1) {
/*      */ 
/*      */       
/* 5131 */       if (paramArrayOfbyte[paramInt1][paramInt2 - 1] >= paramByte) b1 = (byte)(b1 + 16);
/*      */       
/* 5133 */       if (paramInt1 < j - 1)
/*      */       {
/*      */         
/* 5136 */         if (paramArrayOfbyte[paramInt1 + 1][paramInt2 - 1] >= paramByte) b1 = (byte)(b1 + 2);
/*      */       
/*      */       }
/*      */     } 
/* 5140 */     if (paramInt1 < j - 1)
/*      */     {
/*      */       
/* 5143 */       if (paramArrayOfbyte[paramInt1 + 1][paramInt2] >= paramByte) b1 = (byte)(b1 + 32);
/*      */     
/*      */     }
/* 5146 */     if (paramInt2 < k - 1) {
/*      */ 
/*      */       
/* 5149 */       if (paramArrayOfbyte[paramInt1][paramInt2 + 1] >= paramByte) b1 = (byte)(b1 + 64);
/*      */       
/* 5151 */       if (paramInt1 < j - 1)
/*      */       {
/*      */         
/* 5154 */         if (paramArrayOfbyte[paramInt1 + 1][paramInt2 + 1] >= paramByte) b1 = (byte)(b1 + 4);
/*      */       
/*      */       }
/*      */     } 
/* 5158 */     if (b1 == Byte.MAX_VALUE)
/*      */     {
/* 5160 */       b1 = -1;
/*      */     }
/*      */     
/* 5163 */     return b1;
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
/*      */   public strictfp void h() {
/* 5205 */     i();
/*      */     
/* 5207 */     for (byte b1 = 0; b1 < this.y; b1++) {
/*      */       
/* 5209 */       for (byte b2 = 0; b2 < this.z; b2++) {
/*      */         
/* 5211 */         this.H[b1][b2] = 0;
/* 5212 */         this.I[b1][b2] = 0;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void f(int paramInt1, int paramInt2) {
/* 5222 */     this.H[paramInt1][paramInt2] = 0;
/* 5223 */     this.I[paramInt1][paramInt2] = 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void g(int paramInt1, int paramInt2) {
/* 5229 */     int j = paramInt1 - 1;
/* 5230 */     int k = paramInt2 - 1;
/* 5231 */     if (j < 0) j = 0; 
/* 5232 */     if (k < 0) k = 0;
/*      */     
/* 5234 */     int m = paramInt1 + 1;
/* 5235 */     int n = paramInt2 + 1;
/* 5236 */     if (m > this.y - 1) m = this.y - 1; 
/* 5237 */     if (n > this.z - 1) n = this.z - 1;
/*      */     
/* 5239 */     for (int i1 = j; i1 <= m; i1++) {
/*      */       
/* 5241 */       for (int i2 = k; i2 <= n; i2++) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5246 */         if (this.H[i1][i2] != 0)
/*      */         {
/* 5248 */           this.H[i1][i2] = Byte.MAX_VALUE;
/*      */         }
/*      */         
/* 5251 */         if (this.I[i1][i2] != 0)
/*      */         {
/*      */           
/* 5254 */           this.I[i1][i2] = Byte.MAX_VALUE;
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
/*      */   public strictfp void i() {
/* 5291 */     boolean bool = false;
/* 5292 */     if (this.H == null) {
/*      */       
/* 5294 */       bool = true;
/*      */ 
/*      */     
/*      */     }
/* 5298 */     else if (this.H.length != this.y || (this.H[0]).length != this.z) {
/*      */       
/* 5300 */       l.d("smoothFog_cache: Size mismatch");
/* 5301 */       bool = true;
/*      */     } 
/*      */ 
/*      */     
/* 5305 */     if (bool) {
/*      */       
/* 5307 */       l.d("Building smoothFog_cache");
/*      */       
/* 5309 */       this.H = new byte[this.y][this.z];
/* 5310 */       this.I = new byte[this.y][this.z];
/*      */       
/* 5312 */       for (byte b1 = 0; b1 < this.y; b1++) {
/*      */         
/* 5314 */         for (byte b2 = 0; b2 < this.z; b2++) {
/*      */           
/* 5316 */           this.H[b1][b2] = Byte.MAX_VALUE;
/*      */           
/* 5318 */           this.I[b1][b2] = Byte.MAX_VALUE;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b(float paramFloat1, float paramFloat2, int paramInt, m paramm, boolean paramBoolean) {
/* 5328 */     l l1 = l.u();
/*      */     
/* 5330 */     if (this.A && paramm.C != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5335 */       i();
/*      */ 
/*      */       
/* 5338 */       int j = paramInt;
/*      */ 
/*      */       
/* 5341 */       float f1 = ((j - 5) * (j - 5));
/*      */ 
/*      */ 
/*      */       
/* 5345 */       float f2 = ((j - 3) * (j - 3));
/* 5346 */       float f3 = (j * j);
/*      */       
/* 5348 */       float f4 = 1.0F / (f3 - f2) * 10.0F;
/*      */ 
/*      */       
/* 5351 */       b b1 = this;
/*      */       
/* 5353 */       b1.a(paramFloat1, paramFloat2);
/* 5354 */       int k = b1.M;
/* 5355 */       int n = b1.N;
/*      */       
/* 5357 */       float f5 = paramFloat1 * b1.o;
/* 5358 */       float f6 = paramFloat2 * b1.p;
/*      */       
/* 5360 */       byte[][] arrayOfByte = paramm.C;
/*      */ 
/*      */       
/* 5363 */       int i1 = j - 1;
/*      */       
/* 5365 */       int i2 = k - i1;
/* 5366 */       int i3 = n - i1;
/* 5367 */       if (i2 < 0) i2 = 0; 
/* 5368 */       if (i3 < 0) i3 = 0;
/*      */       
/* 5370 */       int i4 = k + i1;
/* 5371 */       int i5 = n + i1;
/* 5372 */       if (i4 > this.y - 1) i4 = this.y - 1; 
/* 5373 */       if (i5 > this.z - 1) i5 = this.z - 1;
/*      */ 
/*      */       
/* 5376 */       c c1 = ad;
/* 5377 */       boolean bool = false;
/*      */       
/* 5379 */       boolean bool1 = paramm.n();
/*      */ 
/*      */       
/* 5382 */       for (int i6 = i2; i6 <= i4; i6++) {
/*      */         
/* 5384 */         for (int i7 = i3; i7 <= i5; i7++) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 5394 */           byte b2 = arrayOfByte[i6][i7];
/*      */ 
/*      */           
/* 5397 */           if (b2 != 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 5402 */             float f = f.a(f5, f6, i6, i7);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 5412 */             if (f <= f2) {
/*      */               
/* 5414 */               if (b2 > 0) {
/*      */                 
/* 5416 */                 arrayOfByte[i6][i7] = 0;
/*      */ 
/*      */                 
/* 5419 */                 if (bool1)
/*      */                 {
/* 5421 */                   c1.a(i6, i7, true);
/* 5422 */                   bool = true;
/*      */ 
/*      */ 
/*      */                   
/* 5426 */                   if (f <= f1 && paramBoolean)
/*      */                   {
/*      */                     
/* 5429 */                     f(i6, i7);
/*      */                   }
/*      */                   else
/*      */                   {
/* 5433 */                     g(i6, i7);
/*      */                   }
/*      */                 
/*      */                 }
/*      */               
/*      */               } 
/* 5439 */             } else if (f <= f3) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 5449 */               byte b3 = (byte)(int)((f - f2) * f4);
/*      */               
/* 5451 */               if (b2 > b3) {
/*      */                 
/* 5453 */                 arrayOfByte[i6][i7] = b3;
/*      */ 
/*      */                 
/* 5456 */                 if (bool1) {
/*      */                   
/* 5458 */                   c1.a(i6, i7, true);
/* 5459 */                   bool = true;
/*      */ 
/*      */ 
/*      */                   
/* 5463 */                   g(i6, i7);
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5476 */       if (bool)
/*      */       {
/* 5478 */         l1.bE.O = true;
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
/*      */   public strictfp void f(float paramFloat) {
/* 5492 */     l l1 = l.u();
/*      */ 
/*      */ 
/*      */     
/* 5496 */     if (a) {
/*      */       
/* 5498 */       this.ai += paramFloat;
/* 5499 */       if (this.ai > 60.0F) {
/*      */ 
/*      */ 
/*      */         
/* 5503 */         this.ai = 0.0F;
/* 5504 */         if (this.ah > 0L) {
/*      */           
/* 5506 */           l.d("seeThoughFogOfWarTimes: " + bj.b(this.ah));
/* 5507 */           this.ah = 0L;
/*      */         } 
/* 5509 */         if (this.ah < 0L) {
/*      */           
/* 5511 */           l.d("seeThoughFogOfWarTimes negative: " + bj.b(this.ah));
/* 5512 */           this.ah = 0L;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 5518 */     if (this.A && this.B) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5523 */       i();
/*      */ 
/*      */ 
/*      */       
/* 5527 */       this.aj += paramFloat;
/*      */ 
/*      */       
/* 5530 */       if (this.aj > 260.0F) {
/*      */         
/* 5532 */         this.aj = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5540 */         w[] arrayOfW = af.dK.a();
/* 5541 */         int j = w.dK.size();
/*      */         
/* 5543 */         boolean bool = false;
/*      */         byte b1;
/* 5545 */         for (b1 = 0; b1 < m.a; b1++) {
/*      */           
/* 5547 */           m m = m.n(b1);
/* 5548 */           if (m != null && !m.w) {
/*      */ 
/*      */             
/* 5551 */             bool = true;
/*      */             byte b2;
/* 5553 */             for (b2 = 0; b2 < j; b2++) {
/*      */               
/* 5555 */               w w = arrayOfW[b2];
/* 5556 */               if (w instanceof r) {
/*      */                 
/* 5558 */                 r r = (r)w;
/* 5559 */                 if (r.bw())
/*      */                 {
/* 5561 */                   r.e(m);
/*      */                 }
/*      */               } 
/*      */             } 
/*      */             
/* 5566 */             if (m.C == null)
/*      */             {
/* 5568 */               l.b("fogOfWar_map==null for:" + b1);
/*      */             }
/* 5570 */             b2 = 0;
/* 5571 */             boolean bool1 = m.n();
/* 5572 */             byte[][] arrayOfByte1 = m.C;
/* 5573 */             byte[][] arrayOfByte2 = this.I;
/*      */             
/* 5575 */             for (byte b3 = 0; b3 < this.y; b3++) {
/*      */               
/* 5577 */               for (byte b4 = 0; b4 < this.z; b4++) {
/*      */                 
/* 5579 */                 if (arrayOfByte1[b3][b4] < 5) {
/*      */                   
/* 5581 */                   arrayOfByte1[b3][b4] = 5;
/*      */                   
/* 5583 */                   if (bool1) {
/*      */                     
/* 5585 */                     ad.a(b3, b4, true);
/* 5586 */                     b2 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                     
/* 5591 */                     arrayOfByte2[b3][b4] = Byte.MAX_VALUE;
/*      */                   } 
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 5599 */             if (b2 != 0)
/*      */             {
/* 5601 */               l1.bE.O = true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5615 */         for (b1 = 0; b1 < j; b1++) {
/*      */           
/* 5617 */           w w = arrayOfW[b1];
/* 5618 */           if (w instanceof r) {
/*      */             
/* 5620 */             r r = (r)w;
/* 5621 */             if (!r.bz)
/*      */             {
/* 5623 */               r.c(false);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 5630 */         if (bool)
/*      */         {
/*      */           
/* 5633 */           for (b1 = 0; b1 < j; b1++) {
/*      */             
/* 5635 */             w w = arrayOfW[b1];
/* 5636 */             if (w instanceof r) {
/*      */               
/* 5638 */               r r = (r)w;
/* 5639 */               if (r.bw())
/*      */               {
/* 5641 */                 r.cF();
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
/*      */   public strictfp void a(ap paramap) {
/* 5667 */     paramap.a(false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk) {
/* 5677 */     boolean bool = paramk.e();
/* 5678 */     if (bool) {
/*      */       
/* 5680 */       int j = paramk.f();
/* 5681 */       int m = paramk.f();
/*      */       
/* 5683 */       for (byte b1 = 0; b1 < j; b1++) {
/*      */         
/* 5685 */         for (byte b2 = 0; b2 < m; b2++)
/*      */         {
/* 5687 */           paramk.d();
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
/*      */   private strictfp InputStream a(String paramString1, String paramString2, int paramInt) {
/* 5704 */     String[] arrayOfString = paramString2.split("/");
/* 5705 */     if (arrayOfString.length >= paramInt) {
/*      */       
/* 5707 */       String str = "";
/* 5708 */       boolean bool = true;
/* 5709 */       for (int j = arrayOfString.length - paramInt; j < arrayOfString.length; j++) {
/*      */         
/* 5711 */         if (!bool)
/*      */         {
/* 5713 */           str = str + "/";
/*      */         }
/* 5715 */         bool = false;
/* 5716 */         str = str + arrayOfString[j];
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5723 */       return (InputStream)a.g(paramString1 + str);
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
/* 5734 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp InputStream d(String paramString1, String paramString2) {
/*      */     InputStream inputStream;
/* 5743 */     j j = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5748 */     j = a.g(paramString1 + paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5757 */     if (j == null)
/*      */     {
/* 5759 */       inputStream = a(paramString1, paramString2, 3);
/*      */     }
/* 5761 */     if (inputStream == null)
/*      */     {
/* 5763 */       inputStream = a(paramString1, paramString2, 2);
/*      */     }
/* 5765 */     if (inputStream == null)
/*      */     {
/* 5767 */       inputStream = a(paramString1, paramString2, 1);
/*      */     }
/*      */     
/* 5770 */     if (inputStream == null)
/*      */     {
/* 5772 */       throw new IOException("File could not be found:" + paramString1 + paramString2);
/*      */     }
/*      */     
/* 5775 */     return inputStream;
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
/*      */   public strictfp boolean a(m paramm, int paramInt1, int paramInt2) {
/* 5789 */     b b1 = this;
/*      */     
/* 5791 */     if (!this.C)
/*      */     {
/* 5793 */       if (b1.A && paramm.C != null)
/*      */       {
/* 5795 */         if (b1.c(paramInt1, paramInt2) && paramm.C[paramInt1][paramInt2] == 10)
/*      */         {
/* 5797 */           return false;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 5802 */     return true;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
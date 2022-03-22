/*      */ package com.corrodinggames.rts.gameFramework.utility;
/*      */ 
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.PointF;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.b.g;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.custom.b.i;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.h.e;
/*      */ import com.corrodinggames.rts.gameFramework.h.h;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.j.l;
/*      */ import com.corrodinggames.rts.gameFramework.j.q;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class y
/*      */ {
/*   36 */   static Paint a = new Paint();
/*   37 */   static RectF b = new RectF();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   70 */   static ArrayList c = new ArrayList();
/*      */ 
/*      */   
/*      */   static {
/*   74 */     a.a(205, 255, 0, 0);
/*   75 */     a.a(Paint.Style.b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, float paramFloat) {
/*   83 */     a(paramaf, paramFloat, false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, float paramFloat, boolean paramBoolean) {
/*   88 */     a(paramaf, paramFloat, paramBoolean, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(af paramaf) {
/*   93 */     l l = l.u();
/*      */     
/*   95 */     if (paramaf.ci && l.bA.p() == 1 && !l.bA.d.e)
/*      */     {
/*   97 */       return true;
/*      */     }
/*   99 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
/*  105 */     l l = l.u();
/*      */     
/*  107 */     if (a(paramaf) || paramBoolean1) {
/*      */       
/*  109 */       float f1 = paramaf.dH - l.cd;
/*  110 */       float f2 = paramaf.dI - l.ce;
/*  111 */       Paint paint = af.cI;
/*  112 */       if (paramBoolean2)
/*      */       {
/*  114 */         paint = af.cJ;
/*      */       }
/*      */       
/*  117 */       l.bw.a(f1, f2, paramFloat, paint);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, float paramFloat, int paramInt1, int paramInt2, boolean paramBoolean) {
/*  124 */     l l = l.u();
/*      */     
/*  126 */     if ((paramaf.ci && l.bA.p() < 10) || paramBoolean) {
/*      */       
/*  128 */       float f1 = paramaf.dH - l.cd;
/*  129 */       float f2 = paramaf.dI - l.ce;
/*  130 */       Paint paint = af.cM;
/*      */       
/*  132 */       paint.b(paramInt1);
/*  133 */       paint.a(paramInt2);
/*      */ 
/*      */       
/*  136 */       l.bw.a(f1, f2, paramFloat, paint);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void b(af paramaf, float paramFloat, boolean paramBoolean) {
/*  145 */     a(paramaf, paramFloat, paramBoolean, af.cK);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, float paramFloat, boolean paramBoolean, Paint paramPaint) {
/*  151 */     l l = l.u();
/*      */     
/*  153 */     if (a(paramaf) || paramBoolean) {
/*      */       
/*  155 */       float f1 = paramaf.dH - l.cd;
/*  156 */       float f2 = paramaf.dI - l.ce;
/*  157 */       l.bw.a(f1, f2, paramFloat, paramPaint);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*  162 */   static final Rect d = new Rect();
/*  163 */   static final RectF e = new RectF();
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(e parame, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3) {
/*  168 */     l l = l.u();
/*      */     
/*  170 */     int i = 0;
/*  171 */     byte b = 0;
/*  172 */     i += paramInt3 * paramInt1;
/*  173 */     d.a(i, b, i + paramInt1, b + paramInt2);
/*      */     
/*  175 */     float f1 = paramFloat5 * 0.5F;
/*      */     
/*  177 */     paramFloat2 -= paramFloat3;
/*      */     
/*  179 */     float f2 = paramInt1 * f1;
/*  180 */     float f3 = paramInt2 * f1;
/*      */     
/*  182 */     e.a(paramFloat1 - f2, paramFloat2 - f3, paramFloat1 + f2, paramFloat2 + f3);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  188 */     l l1 = l.bw;
/*      */     
/*  190 */     l1.j();
/*  191 */     l1.a(paramFloat4 + 90.0F, paramFloat1, paramFloat2);
/*  192 */     if (paramFloat5 != 1.0F)
/*      */     {
/*  194 */       l1.a(paramFloat5, paramFloat5, paramFloat1, paramFloat2);
/*      */     }
/*  196 */     l1.a(parame, d, e, paramPaint);
/*  197 */     l1.k();
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
/*      */   public static strictfp boolean a(af paramaf, boolean paramBoolean1, boolean paramBoolean2) {
/*  211 */     if (paramaf.cc() && paramBoolean2)
/*      */     {
/*  213 */       return false;
/*      */     }
/*      */     
/*  216 */     if (paramBoolean1)
/*      */     {
/*  218 */       if (paramaf instanceof com.corrodinggames.rts.game.units.b.b || paramaf instanceof com.corrodinggames.rts.game.units.h.f)
/*      */       {
/*  220 */         return false;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  230 */     if (paramaf.bw())
/*      */     {
/*  232 */       return false;
/*      */     }
/*      */     
/*  235 */     if (paramBoolean1)
/*      */     {
/*  237 */       if (paramaf.cf() || paramaf.cd())
/*      */       {
/*  239 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  243 */     if (paramaf.O())
/*      */     {
/*  245 */       return false;
/*      */     }
/*  247 */     if (paramaf.cp != null || paramaf.cq != null)
/*      */     {
/*  249 */       return false;
/*      */     }
/*  251 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp Paint a() {
/*  257 */     q q = new q();
/*      */     
/*  259 */     l l = l.u();
/*      */     
/*  261 */     if (l.by.renderAntiAlias) {
/*      */       
/*  263 */       q.a(true);
/*  264 */       q.d(true);
/*  265 */       q.b(true);
/*      */     }
/*      */     else {
/*      */       
/*  269 */       q.a(false);
/*  270 */       q.d(false);
/*  271 */       q.b(false);
/*      */     } 
/*      */     
/*  274 */     return (Paint)q;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp q b() {
/*  280 */     q q = new q();
/*  281 */     q.a(false);
/*  282 */     q.d(false);
/*  283 */     q.b(false);
/*  284 */     return q;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(r paramr) {
/*  290 */     if (!paramr.bz) {
/*      */       
/*  292 */       int i = paramr.bg();
/*  293 */       for (byte b = 0; b < i; b++)
/*      */       {
/*  295 */         a(paramr, b);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(r paramr, e parame, float paramFloat, int paramInt) {
/*  305 */     if (!paramr.bz)
/*      */     {
/*      */       
/*  308 */       if (paramFloat != 0.0F) {
/*      */ 
/*      */         
/*  311 */         l l = l.u();
/*      */         
/*  313 */         ag ag = paramr.D(paramInt);
/*      */         
/*  315 */         l.bw.j();
/*      */         
/*  317 */         l.bw.b(ag.a - l.cd, ag.b - ag.c - paramr.dJ - l.ce);
/*  318 */         l.bw.a(paramFloat, paramFloat);
/*  319 */         l.bw.a(parame, 0.0F, 0.0F, null);
/*      */         
/*  321 */         l.bw.k();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(r paramr, int paramInt) {
/*  330 */     e e = paramr.d(paramInt);
/*      */     
/*  332 */     if (e == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  339 */     float f1 = paramr.p(paramInt);
/*      */ 
/*      */ 
/*      */     
/*  343 */     Paint paint = paramr.aK();
/*      */     
/*  345 */     l l = l.u();
/*      */     
/*  347 */     PointF pointF = paramr.F(paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  355 */     float f2 = pointF.a - (l.u()).cd;
/*  356 */     float f3 = pointF.b - (l.u()).ce - paramr.dJ;
/*      */     
/*  358 */     l l1 = l.bw;
/*      */     
/*  360 */     l1.j();
/*      */     
/*  362 */     if (f1 != 1.0F)
/*      */     {
/*  364 */       l1.a(f1, f1, f2, f3);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  373 */     l1.a((paramr.cn[paramInt]).a + 90.0F, f2, f3);
/*      */     
/*  375 */     l1.b(e, f2 - e.o - paramr
/*  376 */         .h(paramInt), f3 - e.p - paramr
/*  377 */         .i(paramInt), paint);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  382 */     l1.k();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(af paramaf, float paramFloat1, float paramFloat2) {
/*  391 */     return !a(paramFloat1, paramFloat2, paramaf.h());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(float paramFloat1, float paramFloat2, ah paramah) {
/*  397 */     h h = (l.u()).bC;
/*  398 */     b b = (l.u()).bt;
/*      */     
/*  400 */     b.a(paramFloat1, paramFloat2);
/*  401 */     int i = b.M;
/*  402 */     int j = b.N;
/*      */     
/*  404 */     return h.a(paramah, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp short b(float paramFloat1, float paramFloat2, ah paramah) {
/*  409 */     h h = (l.u()).bC;
/*  410 */     b b = (l.u()).bt;
/*      */ 
/*      */ 
/*      */     
/*  414 */     e e = h.a(paramah);
/*      */     
/*  416 */     if (e.g == null)
/*      */     {
/*  418 */       return -3;
/*      */     }
/*  420 */     b.a(paramFloat1, paramFloat2);
/*  421 */     int i = b.M;
/*  422 */     int j = b.N;
/*  423 */     if (!b.c(i, j))
/*      */     {
/*  425 */       return -2;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  430 */     return e.g[i * e.c + j];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp int c(float paramFloat1, float paramFloat2, ah paramah) {
/*  438 */     short s = b(paramFloat1, paramFloat2, paramah);
/*      */     
/*  440 */     if (s == -3 || s == -2 || s == -1 || s == 0)
/*      */     {
/*  442 */       return 0;
/*      */     }
/*      */     
/*  445 */     h h = (l.u()).bC;
/*  446 */     e e = h.a(paramah);
/*      */     
/*  448 */     Integer integer = (Integer)e.h.get(Short.valueOf(s));
/*      */     
/*  450 */     if (integer == null) {
/*      */ 
/*      */       
/*  453 */       l.b("Could not find groupSize for:" + s + " at X:" + paramFloat1 + " y:" + paramFloat2);
/*  454 */       return 0;
/*      */     } 
/*  456 */     return integer.intValue();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(float paramFloat1, float paramFloat2) {
/*  462 */     l l = l.u();
/*  463 */     b b = l.bt;
/*      */     
/*  465 */     if (b == null) {
/*      */       
/*  467 */       l.d("isOverClift called without map loaded");
/*  468 */       return false;
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
/*  483 */     int i = (int)(paramFloat1 * b.o);
/*  484 */     int j = (int)(paramFloat2 * b.p);
/*      */     
/*  486 */     return l.bC.b(i, j);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean b(float paramFloat1, float paramFloat2) {
/*  492 */     l l = l.u();
/*  493 */     b b = l.bt;
/*      */     
/*  495 */     if (b == null) {
/*      */       
/*  497 */       l.d("isOverWater called without map loaded");
/*  498 */       return false;
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
/*  510 */     int i = (int)(paramFloat1 * b.o);
/*  511 */     int j = (int)(paramFloat2 * b.p);
/*      */     
/*  513 */     return l.bC.a(i, j);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean c(float paramFloat1, float paramFloat2) {
/*  519 */     l l = l.u();
/*  520 */     b b = l.bt;
/*      */ 
/*      */     
/*  523 */     if (b == null) {
/*      */       
/*  525 */       l.d("isOverLiquid called without map loaded");
/*  526 */       return false;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  531 */     g g = b.c(paramFloat1, paramFloat2);
/*  532 */     if (g == null)
/*      */     {
/*  534 */       return false;
/*      */     }
/*  536 */     if (g.e || g.g)
/*      */     {
/*  538 */       return true;
/*      */     }
/*      */ 
/*      */     
/*  542 */     int i = (int)(paramFloat1 * b.o);
/*  543 */     int j = (int)(paramFloat2 * b.p);
/*      */     
/*  545 */     return l.bC.a(i, j);
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
/*  595 */   static Paint f = new Paint();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  615 */   static z[] g = new z[30];
/*      */   
/*      */   static boolean h = false;
/*      */   
/*      */   public static final strictfp Paint a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.Style paramStyle) {
/*  620 */     return a(f.b(paramInt1, paramInt2, paramInt3, paramInt4), paramStyle);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final strictfp Paint a(int paramInt, Paint.Style paramStyle) {
/*  625 */     for (byte b = 0; b < g.length; b++) {
/*      */       
/*  627 */       if (g[b] == null) {
/*      */         
/*  629 */         z z2 = new z(paramInt, paramStyle);
/*  630 */         g[b] = z2;
/*  631 */         return (Paint)z2.c;
/*      */       } 
/*      */ 
/*      */       
/*  635 */       z z1 = g[b];
/*  636 */       if (z1.a == paramInt && z1.b == paramStyle)
/*      */       {
/*  638 */         return (Paint)z1.c;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  643 */     if (!h) {
/*      */       
/*  645 */       h = true;
/*  646 */       l.b("----- getCachingPaint --- Paint fallback was needed!!");
/*      */     } 
/*      */     
/*  649 */     f.b(paramInt);
/*  650 */     f.a(paramStyle);
/*      */     
/*  652 */     return f;
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
/*      */   public static strictfp void a(float paramFloat) {
/*  766 */     if (c.size() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  772 */     for (Iterator<aa> iterator = c.iterator(); iterator.hasNext(); ) {
/*      */       
/*  774 */       aa aa = iterator.next();
/*      */ 
/*      */       
/*  777 */       if (aa.e <= 0.0F) {
/*      */         
/*  779 */         iterator.remove();
/*      */         
/*      */         continue;
/*      */       } 
/*  783 */       aa.e -= paramFloat;
/*      */ 
/*      */       
/*  786 */       if (paramFloat == 0.0F && aa.e < 1.0F)
/*      */       {
/*  788 */         aa.e = -1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void b(float paramFloat) {
/*  797 */     if (c.size() == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  802 */     l l = l.u();
/*      */ 
/*      */     
/*  805 */     for (aa aa : c) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  810 */       float f1 = aa.b.a;
/*  811 */       float f2 = aa.b.b;
/*  812 */       float f3 = aa.b.c;
/*  813 */       float f4 = aa.b.d;
/*      */       
/*  815 */       if (aa.d) {
/*      */         
/*  817 */         f1 -= (l.u()).cd;
/*  818 */         f2 -= (l.u()).ce;
/*  819 */         f3 -= (l.u()).cd;
/*  820 */         f4 -= (l.u()).ce;
/*      */       } 
/*      */ 
/*      */       
/*  824 */       if (aa.c) {
/*      */ 
/*      */ 
/*      */         
/*  828 */         l.bw.a(f1, f2, f3, f4, aa.a);
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  835 */         if (aa.d);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  841 */         l.bw.a(aa.b, aa.a);
/*      */       } 
/*      */       
/*  844 */       if (aa.f != null) {
/*      */         
/*  846 */         l.bw.h();
/*      */         
/*  848 */         l.L();
/*      */         
/*  850 */         float f5 = f3;
/*  851 */         float f6 = f4;
/*      */         
/*  853 */         if (aa.d) {
/*      */           
/*  855 */           f5 *= l.cE;
/*  856 */           f6 *= l.cE;
/*      */         } 
/*      */         
/*  859 */         l.bw.a(aa.f, f5, f6, aa.a);
/*      */         
/*  861 */         l.bw.i();
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
/*      */   public static final strictfp boolean a(int paramInt1, int paramInt2) {
/*  877 */     int i = (l.u()).bh;
/*      */     
/*  879 */     if (paramInt1 + paramInt2 < i)
/*      */     {
/*  881 */       return true;
/*      */     }
/*      */     
/*  884 */     if (i < paramInt1 - 1000)
/*      */     {
/*  886 */       return true;
/*      */     }
/*      */     
/*  889 */     return false;
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
/*      */   public static final strictfp boolean b(int paramInt1, int paramInt2) {
/*  901 */     int i = (l.u()).bh;
/*      */     
/*  903 */     if (paramInt1 < 0)
/*      */     {
/*  905 */       return false;
/*      */     }
/*      */     
/*  908 */     if (paramInt1 + paramInt2 >= i && paramInt1 <= i)
/*      */     {
/*  910 */       return true;
/*      */     }
/*      */     
/*  913 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, ah paramah) {
/*  919 */     if (paramah == ah.d || paramah == ah.a)
/*      */     {
/*  921 */       return true;
/*      */     }
/*      */     
/*  924 */     short s1 = b(paramFloat1, paramFloat2, paramah);
/*  925 */     short s2 = b(paramFloat3, paramFloat4, paramah);
/*      */     
/*  927 */     if (s1 == -3 || s2 == -3) {
/*      */       
/*  929 */       String str = "null";
/*  930 */       if (paramah != null)
/*      */       {
/*  932 */         str = paramah.name();
/*      */       }
/*  934 */       l.f("pathPossible: no isolatedGroups found! (" + str + ")");
/*      */     } 
/*      */     
/*  937 */     if (s1 == -1 || s2 == -1)
/*      */     {
/*  939 */       return false;
/*      */     }
/*      */     
/*  942 */     if (s1 == -2)
/*      */     {
/*  944 */       return false;
/*      */     }
/*  946 */     if (s2 == -2)
/*      */     {
/*  948 */       return false;
/*      */     }
/*      */     
/*  951 */     if (s1 == s2)
/*      */     {
/*  953 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  958 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp boolean b(af paramaf, float paramFloat1, float paramFloat2) {
/*  963 */     return a(paramaf.dH, paramaf.dI, paramFloat1, paramFloat2, paramaf.h());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(m paramm, PointF paramPointF) {
/*  973 */     l l = l.u();
/*      */     
/*  975 */     for (byte b = 0; b <= 2; b++) {
/*      */       
/*  977 */       for (af af : af.bt()) {
/*      */         
/*  979 */         if (af instanceof af) {
/*      */           
/*  981 */           af af1 = af;
/*      */           
/*  983 */           if (!af1.bz && af1.bB == paramm) {
/*      */ 
/*      */             
/*  986 */             if (b == 0 && af1.bt) {
/*      */               
/*  988 */               paramPointF.a(af1.dH, af1.dI);
/*      */               return;
/*      */             } 
/*  991 */             if (b == 1 && af1.bu) {
/*      */               
/*  993 */               paramPointF.a(af1.dH, af1.dI);
/*      */               return;
/*      */             } 
/*  996 */             if (b == 2) {
/*      */               
/*  998 */               paramPointF.a(af1.dH, af1.dI);
/*      */               
/*      */               return;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1007 */     paramPointF.a(l.bt.f() / 2.0F, l.bt.g() / 2.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(af paramaf, r paramr) {
/* 1015 */     paramaf.cp = null;
/*      */     
/* 1017 */     i i = null;
/* 1018 */     if (paramaf instanceof r) {
/*      */       
/* 1020 */       r r1 = (r)paramaf;
/* 1021 */       if (r1.cq == paramr) {
/*      */         
/* 1023 */         i = r1.cV();
/*      */         
/* 1025 */         if (i == null)
/*      */         {
/* 1027 */           l.d("Unload, attachment data is null");
/*      */         }
/*      */         
/* 1030 */         r1.bs();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
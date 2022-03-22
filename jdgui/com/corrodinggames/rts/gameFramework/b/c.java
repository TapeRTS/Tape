/*      */ package com.corrodinggames.rts.gameFramework.b;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.Color;
/*      */ import android.graphics.LightingColorFilter;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.RectF;
/*      */ import com.corrodinggames.rts.R;
/*      */ import com.corrodinggames.rts.game.b.g;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.w;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class c
/*      */ {
/*   21 */   public int a = 0;
/*      */   
/*   23 */   public int b = 80;
/*   24 */   public int c = 100;
/*   25 */   public int d = 110;
/*   26 */   public int e = 120;
/*      */   
/*   28 */   public static e[] f = new e[0];
/*      */   
/*   30 */   public static int g = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean h;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int i;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int j;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   50 */   public static final RectF k = new RectF();
/*   51 */   public static final Rect l = new Rect();
/*   52 */   public static final Paint m = new Paint();
/*      */   
/*      */   public static g[] n;
/*      */ 
/*      */   
/*      */   public e a(h paramh) {
/*   58 */     l l = l.u();
/*      */     
/*   60 */     int i = 0;
/*      */     
/*   62 */     int j = l.b();
/*      */     
/*   64 */     if (j < 13) {
/*      */       
/*   66 */       i = -this.j;
/*      */     }
/*   68 */     else if (j < 28) {
/*      */       
/*   70 */       i = -this.i;
/*      */     } 
/*      */     
/*   73 */     int k = this.a;
/*      */     
/*   75 */     if (paramh == h.a && k > this.b + i)
/*      */     {
/*   77 */       return null;
/*      */     }
/*   79 */     if (paramh == h.b && k > this.c + i)
/*      */     {
/*   81 */       return null;
/*      */     }
/*   83 */     if (paramh == h.c && k > this.d + i)
/*      */     {
/*   85 */       return null;
/*      */     }
/*   87 */     if (paramh == h.d && k > this.e + i)
/*      */     {
/*   89 */       return null;
/*      */     }
/*      */     
/*   92 */     e e1 = null;
/*      */ 
/*      */     
/*   95 */     e1 = a(true, (h)null);
/*      */     
/*   97 */     if (e1 == null)
/*      */     {
/*   99 */       if (paramh == h.e || paramh == h.d)
/*      */       {
/*      */ 
/*      */         
/*  103 */         e1 = a(false, h.c);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  108 */     if (e1 != null) {
/*      */       
/*  110 */       if (!e1.p) {
/*      */ 
/*      */         
/*  113 */         e1.p = true;
/*  114 */         this.a++;
/*      */       } 
/*      */       
/*  117 */       return e1;
/*      */     } 
/*  119 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private e a(boolean paramBoolean, h paramh) {
/*  125 */     e[] arrayOfE = f;
/*  126 */     int i = arrayOfE.length;
/*      */ 
/*      */     
/*  129 */     if (paramBoolean && paramh == null) {
/*      */       
/*  131 */       for (byte b1 = 0; b1 < i; b1++) {
/*      */         
/*  133 */         e e1 = arrayOfE[b1];
/*  134 */         if (!e1.p) {
/*      */           
/*  136 */           if (g == b1)
/*      */           {
/*  138 */             g++;
/*      */           }
/*      */           
/*  141 */           return e1;
/*      */         } 
/*      */       } 
/*  144 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  149 */     for (byte b = 0; b < i; b++) {
/*      */       
/*  151 */       e e1 = arrayOfE[b];
/*  152 */       if (!paramBoolean || !e1.p)
/*      */       {
/*      */ 
/*      */         
/*  156 */         if (paramh == null || e1.r.a(paramh))
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*  161 */           return e1; }  } 
/*      */     } 
/*  163 */     return null;
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
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  176 */     a(paramFloat1, paramFloat2, paramFloat3, 0.0F, 20.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/*  181 */     for (byte b = 0; b < 7; b++) {
/*      */       
/*  183 */       e e1 = b(paramFloat1 + f.c(-20.0F, 20.0F), paramFloat2 + f.c(-20.0F, 20.0F), paramFloat3);
/*      */       
/*  185 */       if (e1 != null) {
/*      */         
/*  187 */         e1.V = paramFloat4 + f.c(0.0F, paramFloat5);
/*      */         
/*  189 */         e1.aj = f.c(0.3F, 0.6F);
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
/*      */   public float a(float paramFloat1, float paramFloat2) {
/*  202 */     return f.c(paramFloat1, paramFloat2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  209 */     a();
/*      */     
/*  211 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*      */     
/*  213 */     if (e1 != null) {
/*      */       
/*  215 */       e1.ap = 1;
/*  216 */       e1.ae = true;
/*  217 */       e1.ak = 0.0F;
/*  218 */       e1.aj = 0.5F;
/*  219 */       e1.ag = 12;
/*      */       
/*  221 */       e1.ao = 0;
/*  222 */       e1.W = 35.0F;
/*  223 */       e1.X = e1.W - 10.0F;
/*  224 */       e1.s = true;
/*  225 */       e1.F = 0.7F;
/*      */ 
/*      */       
/*  228 */       e1.Y = a(-180.0F, 180.0F);
/*      */ 
/*      */       
/*  231 */       float f = a(0.8F, 1.0F);
/*  232 */       e1.H = f;
/*  233 */       e1.G = f;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  238 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public e c(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  243 */     a();
/*      */     
/*  245 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*      */     
/*  247 */     if (e1 != null) {
/*      */ 
/*      */ 
/*      */       
/*  251 */       e1.ap = 13;
/*  252 */       e1.ae = true;
/*  253 */       e1.ak = 3.0F;
/*  254 */       e1.aj = 0.5F;
/*  255 */       e1.ag = 7;
/*      */       
/*  257 */       e1.ao = 0;
/*  258 */       e1.W = 35.0F;
/*  259 */       e1.X = e1.W - 10.0F;
/*  260 */       e1.s = true;
/*  261 */       e1.F = 1.0F;
/*      */ 
/*      */       
/*  264 */       e1.H = 0.5F;
/*  265 */       e1.G = 0.5F;
/*      */     } 
/*      */     
/*  268 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  274 */     l l = l.u();
/*      */     
/*  276 */     if (!l.bt.a(paramFloat1, paramFloat2, l.bb) && !l.bt.a(paramFloat4, paramFloat5, l.bb))
/*      */     {
/*  278 */       return null;
/*      */     }
/*      */     
/*  281 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, true, h.c);
/*      */ 
/*      */ 
/*      */     
/*  285 */     if (e1 != null) {
/*      */       
/*  287 */       e1.am = false;
/*      */       
/*  289 */       e1.W = 5.0F;
/*  290 */       e1.X = e1.W;
/*  291 */       e1.s = true;
/*  292 */       e1.F = 1.0F;
/*      */       
/*  294 */       e1.M = true;
/*  295 */       e1.N = paramFloat4;
/*  296 */       e1.O = paramFloat5;
/*  297 */       e1.P = paramFloat6;
/*      */     } 
/*      */     
/*  300 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  307 */     return a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
/*  312 */     return a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt, 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
/*  317 */     return a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2) {
/*  323 */     a();
/*      */     
/*  325 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*      */     
/*  327 */     if (e1 != null) {
/*      */       
/*  329 */       e1.g = e.j;
/*      */       
/*  331 */       e1.ae = true;
/*      */       
/*  333 */       if (paramInt2 == 1) {
/*      */         
/*  335 */         e1.ap = 3;
/*  336 */         e1.ak = 1.0F;
/*  337 */         e1.aj = 0.4F;
/*  338 */         e1.ag = 4;
/*      */       }
/*      */       else {
/*      */         
/*  342 */         e1.ap = 3;
/*  343 */         e1.ak = 0.0F;
/*  344 */         e1.aj = 0.5F;
/*  345 */         e1.ag = 3;
/*      */       } 
/*      */       
/*  348 */       e1.Y = paramFloat4;
/*      */       
/*  350 */       e1.ao = 0;
/*  351 */       e1.W = 20.0F;
/*  352 */       e1.X = e1.W;
/*  353 */       e1.s = false;
/*      */ 
/*      */       
/*  356 */       if (paramInt1 != 0)
/*      */       {
/*  358 */         e1.C = new LightingColorFilter(paramInt1, 0);
/*      */       }
/*      */     } 
/*  361 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
/*  370 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.a);
/*      */     
/*  372 */     if (e1 != null) {
/*      */       
/*  374 */       e1.ap = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  381 */       e1.g = e.i;
/*      */ 
/*      */       
/*  384 */       e1.ao = f.a(0, 2);
/*      */       
/*  386 */       e1.Y = paramFloat4;
/*      */       
/*  388 */       e1.am = true;
/*      */       
/*  390 */       e1.Q = f.i(paramFloat4) * 0.15F;
/*  391 */       e1.R = f.h(paramFloat4) * 0.15F;
/*      */ 
/*      */       
/*  394 */       e1.W = 30.0F;
/*  395 */       e1.X = e1.W;
/*  396 */       e1.s = true;
/*      */       
/*  398 */       e1.aq = 1;
/*      */ 
/*      */       
/*  401 */       e1.H = 0.8F;
/*      */       
/*  403 */       e1.G = 2.3F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  409 */       if (paramInt != 0)
/*      */       {
/*  411 */         e1.C = new LightingColorFilter(paramInt, 0);
/*      */       }
/*      */     } 
/*      */     
/*  415 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void a(e parame, w paramw) {
/*  420 */     if (parame == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  425 */     parame.b = paramw;
/*      */     
/*  427 */     parame.J -= paramw.dH;
/*  428 */     parame.K -= paramw.dI;
/*      */     
/*  430 */     parame.L -= paramw.dJ;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(w paramw, int paramInt) {
/*  436 */     return a(paramw, paramInt, 0.5F);
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
/*      */   public e a(w paramw, int paramInt, float paramFloat) {
/*  460 */     b();
/*      */     
/*  462 */     e e1 = b(paramw.dH, paramw.dI, paramw.dJ, paramInt);
/*  463 */     if (e1 != null) {
/*      */       
/*  465 */       e1.J = 0.0F;
/*  466 */       e1.K = 0.0F;
/*  467 */       e1.L = 0.0F;
/*      */       
/*  469 */       e1.W = 400.0F;
/*  470 */       e1.X = e1.W;
/*      */       
/*  472 */       e1.F = 0.3F;
/*      */       
/*  474 */       e1.H = paramFloat;
/*      */       
/*  476 */       e1.b = paramw;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  481 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*  486 */     if (this.o == null && !this.q)
/*      */     {
/*  488 */       a();
/*      */     }
/*      */     
/*  491 */     return b(paramFloat1, paramFloat2, paramFloat3, paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*  498 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, true, h.b);
/*  499 */     if (e1 != null) {
/*      */       
/*  501 */       e1.e = false;
/*      */       
/*  503 */       e1.g = e.h;
/*      */       
/*  505 */       e1.ap = 2;
/*  506 */       e1.W = 10.0F;
/*  507 */       e1.X = e1.W;
/*      */       
/*  509 */       e1.s = true;
/*      */       
/*  511 */       e1.F = 0.5F;
/*      */       
/*  513 */       e1.aq = 2;
/*      */       
/*  515 */       e1.d = true;
/*      */ 
/*      */       
/*  518 */       if (paramInt != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  529 */         e1.C = new LightingColorFilter(paramInt, 0);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  535 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  543 */     a();
/*      */     
/*  545 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.b);
/*      */     
/*  547 */     if (e1 != null) {
/*      */ 
/*      */       
/*  550 */       e1.g = e.l;
/*      */ 
/*      */       
/*  553 */       e1.ap = 0;
/*  554 */       e1.ao = 13;
/*  555 */       e1.aq = 1;
/*      */       
/*  557 */       e1.s = true;
/*  558 */       e1.F = 0.8F;
/*      */       
/*  560 */       e1.X = 80.0F;
/*  561 */       e1.W = e1.X;
/*      */       
/*  563 */       e1.Y = f.c(-180.0F, 180.0F);
/*      */ 
/*      */       
/*  566 */       e1.H = f.c(0.6F, 0.8F);
/*  567 */       e1.G = 1.5F;
/*      */ 
/*      */       
/*  570 */       e1.Q = f.i(paramFloat4) * 0.13F * f.c(1.0F, 1.5F) + f.c(-0.01F, 0.01F);
/*  571 */       e1.R = f.h(paramFloat4) * 0.13F * f.c(1.0F, 1.5F) + f.c(-0.01F, 0.01F);
/*      */     } 
/*  573 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, float paramFloat5) {
/*  580 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*  581 */     if (e1 != null) {
/*      */       
/*  583 */       e1.g = e.l;
/*      */ 
/*      */       
/*  586 */       e1.ap = 6;
/*  587 */       e1.W = 120.0F;
/*  588 */       e1.X = e1.W;
/*  589 */       e1.s = true;
/*  590 */       e1.H = 0.2F;
/*  591 */       e1.G = 0.9F;
/*  592 */       e1.aq = 1;
/*  593 */       e1.F = 0.5F;
/*      */       
/*  595 */       e1.Q = paramFloat4;
/*  596 */       e1.R = paramFloat5;
/*      */       
/*  598 */       if (paramInt != 0)
/*      */       {
/*  600 */         paramInt = Color.a(255, 0, 0, 200);
/*      */       }
/*      */       
/*  603 */       if (paramInt != 0)
/*      */       {
/*  605 */         e1.C = new LightingColorFilter(paramInt, 0);
/*      */       }
/*      */     } 
/*      */     
/*  609 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  615 */     a(paramFloat1, paramFloat2, 0.0F, 0, 0.0F, 0.0F);
/*  616 */     for (short s = -180; s < 180; s += 45) {
/*      */       
/*  618 */       float f1 = paramFloat6 + s;
/*  619 */       float f2 = paramFloat1 + f.i(f1) * -5.0F;
/*  620 */       float f3 = paramFloat2 + f.h(f1) * -5.0F;
/*      */       
/*  622 */       e e1 = b(f2, f3, 0.0F, f1);
/*  623 */       if (e1 != null) {
/*      */         
/*  625 */         e1.aq = 2;
/*  626 */         e1.t = true;
/*  627 */         e1.u = 7.0F;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e c(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*  635 */     e e1 = d(paramFloat1, paramFloat2, paramFloat3, paramInt);
/*  636 */     if (e1 != null)
/*      */     {
/*  638 */       e1.ap = 11;
/*      */     }
/*      */ 
/*      */     
/*  642 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e d(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/*  648 */     a();
/*      */     
/*  650 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*  651 */     if (e1 != null) {
/*      */       
/*  653 */       e1.ap = 6;
/*  654 */       e1.W = 30.0F;
/*  655 */       e1.X = e1.W;
/*  656 */       e1.s = true;
/*  657 */       e1.H = 0.2F;
/*  658 */       e1.G = 1.3F;
/*  659 */       e1.aq = 1;
/*      */ 
/*      */ 
/*      */       
/*  663 */       if (paramInt != 0)
/*      */       {
/*  665 */         e1.C = new LightingColorFilter(paramInt, 0);
/*      */       }
/*      */     } 
/*      */     
/*  669 */     return e1;
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
/*      */   public e d(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  700 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, 0.3F, 0.7F);
/*  701 */     if (e1 != null) {
/*      */       
/*  703 */       e1.ap = 14;
/*      */       
/*  705 */       e1.ao = f.a(0, 5);
/*      */       
/*  707 */       e1.x = 0.5F;
/*      */     } 
/*  709 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*      */   public e e(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  714 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, 1.0F, 1.0F);
/*  715 */     if (e1 != null);
/*      */ 
/*      */     
/*  718 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/*  724 */     b();
/*      */     
/*  726 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.c);
/*  727 */     if (e1 != null) {
/*      */       
/*  729 */       e1.g = e.m;
/*      */       
/*  731 */       e1.ap = 12;
/*      */       
/*  733 */       e1.ao = f.a(0, 7);
/*      */       
/*  735 */       e1.W = f.c(400.0F, 800.0F);
/*  736 */       e1.X = e1.W - 150.0F;
/*  737 */       e1.s = true;
/*      */       
/*  739 */       float f1 = f.c(0.6F, 1.0F);
/*      */       
/*  741 */       e1.H = f1;
/*  742 */       e1.G = f1;
/*  743 */       e1.aq = 2;
/*      */       
/*  745 */       e1.w = true;
/*  746 */       e1.ar = true;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  751 */       float f2 = f.c(-180.0F, 180.0F);
/*  752 */       float f3 = f.c(0.4F, 1.2F) * paramFloat4;
/*      */       
/*  754 */       e1.Q = f.i(f2) * f3;
/*  755 */       e1.R = f.h(f2) * f3;
/*      */       
/*  757 */       e1.S = f.c(0.6F, 2.7F) * paramFloat5;
/*      */       
/*  759 */       e1.Y = f.c(-180.0F, 180.0F);
/*      */ 
/*      */       
/*  762 */       e1.L++;
/*      */     } 
/*      */     
/*  765 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e f(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  771 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, d.a, false, h.b);
/*  772 */     if (e1 != null) {
/*      */       
/*  774 */       e1.ap = 8;
/*  775 */       e1.W = 480.0F;
/*  776 */       e1.X = e1.W;
/*  777 */       e1.s = false;
/*  778 */       e1.aq = 1;
/*      */       
/*  780 */       e1.ae = true;
/*  781 */       e1.ak = 0.0F;
/*      */       
/*  783 */       e1.H = 0.5F;
/*  784 */       e1.H = 1.0F;
/*      */       
/*  786 */       int i = f.a(0, 100);
/*      */       
/*  788 */       if (i > 80) {
/*      */ 
/*      */         
/*  791 */         e1.aj = f.c(0.1F, 0.15F);
/*  792 */         e1.ag = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  807 */       else if (i > 60) {
/*      */ 
/*      */         
/*  810 */         e1.aj = f.c(0.06F, 0.16F);
/*  811 */         e1.ah = true;
/*  812 */         e1.ag = 6;
/*      */         
/*  814 */         e1.s = true;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  819 */         e1.aj = f.c(0.06F, 0.16F);
/*  820 */         e1.ah = true;
/*  821 */         e1.ag = 3;
/*  822 */         e1.s = true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  832 */     return e1;
/*      */   }
/*      */ 
/*      */   
/*  836 */   h o = null;
/*      */   
/*      */   boolean p = false;
/*      */   boolean q = false;
/*      */   
/*      */   public void b(h paramh) {
/*  842 */     this.o = paramh;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a() {
/*  847 */     this.p = true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b() {
/*  852 */     this.q = true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, d paramd, boolean paramBoolean, h paramh) {
/*  858 */     e e1 = b(paramFloat1, paramFloat2, paramFloat3, paramd, paramBoolean, paramh);
/*  859 */     if (e1 != null)
/*      */     {
/*  861 */       e1.q = true;
/*      */     }
/*      */     
/*  864 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public e b(float paramFloat1, float paramFloat2, float paramFloat3, d paramd, boolean paramBoolean, h paramh) {
/*  871 */     l l = l.u();
/*      */ 
/*      */     
/*  874 */     if (this.o != null) {
/*      */       
/*  876 */       paramh = this.o;
/*  877 */       this.o = null;
/*      */     } 
/*      */     
/*  880 */     boolean bool = this.q;
/*  881 */     this.q = false;
/*      */     
/*  883 */     if (this.p) {
/*      */       
/*  885 */       this.p = false;
/*  886 */       if (!l.cw.b(paramFloat1, paramFloat2))
/*      */       {
/*  888 */         return null;
/*      */       }
/*      */     } 
/*      */     
/*  892 */     if (!paramBoolean)
/*      */     {
/*  894 */       if (l.bt != null && !l.bt.a(paramFloat1, paramFloat2, l.bb))
/*      */       {
/*  896 */         return null;
/*      */       }
/*      */     }
/*      */     
/*  900 */     if (l.cv.b(paramFloat1, paramFloat2)) {
/*      */       
/*  902 */       if (paramh == h.a)
/*      */       {
/*  904 */         paramh = h.b;
/*      */       }
/*  906 */       else if (paramh == h.b)
/*      */       {
/*  908 */         paramh = h.c;
/*      */       }
/*  910 */       else if (paramh == h.c)
/*      */       {
/*  912 */         paramh = h.d;
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  917 */     else if (bool || !l.cw.b(paramFloat1, paramFloat2)) {
/*      */     
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  923 */     e e1 = a(paramh);
/*      */     
/*  925 */     if (e1 == null)
/*      */     {
/*  927 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  931 */     e1.c();
/*      */ 
/*      */     
/*  934 */     e1.r = paramh;
/*      */ 
/*      */     
/*  937 */     e1.ap = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  942 */     e1.am = true;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  947 */     e1.J = paramFloat1;
/*  948 */     e1.K = paramFloat2;
/*  949 */     e1.L = paramFloat3;
/*      */     
/*  951 */     e1.F = 1.0F;
/*      */     
/*  953 */     if (paramd == d.d || paramd == d.e || paramd == d.f) {
/*      */ 
/*      */ 
/*      */       
/*  957 */       e1.ao = 7;
/*  958 */       e1.W = 12.0F;
/*  959 */       e1.s = true;
/*  960 */       e1.R = -0.3F;
/*  961 */       e1.F = 0.7F;
/*      */ 
/*      */ 
/*      */       
/*  965 */       if (paramd == d.f) {
/*      */         
/*  967 */         e1.ao = 3;
/*  968 */         e1.R = -0.7F;
/*  969 */         e1.W = 24.0F;
/*  970 */         e1.F = 0.7F;
/*      */       } 
/*      */       
/*  973 */       if (paramd == d.e) {
/*      */         
/*  975 */         e1.ao = 4;
/*  976 */         e1.W = 15.0F;
/*  977 */         e1.F = 0.4F;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  984 */     if (paramd == d.c) {
/*      */       
/*  986 */       e1.ao = 1;
/*  987 */       e1.W = 25.0F;
/*  988 */       e1.s = true;
/*      */     } 
/*      */ 
/*      */     
/*  992 */     if (paramd == d.g) {
/*      */       
/*  994 */       e1.ao = 5;
/*  995 */       e1.W = 42.0F;
/*  996 */       e1.s = true;
/*  997 */       e1.R = 0.1F;
/*  998 */       e1.F = 2.0F;
/*      */     } 
/*      */     
/* 1001 */     if (paramd == d.h) {
/*      */       
/* 1003 */       e1.ao = 6;
/* 1004 */       e1.W = 39.0F;
/* 1005 */       e1.s = true;
/* 1006 */       e1.R = 0.1F;
/* 1007 */       e1.F = 2.0F;
/*      */     } 
/*      */     
/* 1010 */     if (paramd == d.i) {
/*      */       
/* 1012 */       e1.ao = 14;
/* 1013 */       e1.W = 39.0F;
/* 1014 */       e1.s = true;
/* 1015 */       e1.R = 0.1F;
/*      */       
/* 1017 */       e1.F = 0.7F;
/*      */     } 
/*      */     
/* 1020 */     e1.X = e1.W;
/*      */ 
/*      */ 
/*      */     
/* 1024 */     return e1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1030 */   public final Paint r = new Paint();
/*      */ 
/*      */   
/*      */   public void a(Context paramContext) {
/*      */     char c1;
/* 1035 */     l l = l.u();
/*      */ 
/*      */     
/* 1038 */     this.r.a(130, 200, 0, 0);
/* 1039 */     this.r.a(true);
/* 1040 */     this.r.a(2.0F);
/* 1041 */     this.r.a(Paint.Cap.b);
/*      */     
/* 1043 */     if (l.aG)
/*      */     {
/* 1045 */       this.r.a(3.0F);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1050 */     n = new g[20];
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1055 */     g g1 = new g();
/*      */     
/* 1057 */     g1.b = 25;
/* 1058 */     g1.c = 25;
/* 1059 */     g1.d = 1;
/* 1060 */     g1.e = 1;
/* 1061 */     g1.f = 26;
/* 1062 */     g1.g = 26;
/*      */     
/* 1064 */     g1.i = l.bw.a(R.drawable.effects, true);
/* 1065 */     g1.a = "effects";
/*      */     
/* 1067 */     g1.a();
/*      */     
/* 1069 */     n[0] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1073 */     g1 = new g();
/* 1074 */     g1.b = 39;
/* 1075 */     g1.c = 40;
/* 1076 */     g1.d = 1;
/* 1077 */     g1.e = 1;
/* 1078 */     g1.f = 40;
/* 1079 */     g1.g = 41;
/* 1080 */     g1.i = l.bw.a(R.drawable.explode_big, true);
/* 1081 */     g1.a = "explode_big";
/*      */     
/* 1083 */     n[1] = g1;
/*      */ 
/*      */     
/* 1086 */     g1 = new g();
/* 1087 */     g1.k = true;
/* 1088 */     g1.i = l.bw.a(R.drawable.light_50, true);
/* 1089 */     g1.a = "light_50";
/*      */     
/* 1091 */     n[2] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1095 */     g1 = new g();
/* 1096 */     g1.b = 20;
/* 1097 */     g1.c = 25;
/* 1098 */     g1.d = 0;
/* 1099 */     g1.e = 0;
/* 1100 */     g1.f = 20;
/* 1101 */     g1.g = 25;
/* 1102 */     g1.i = l.bw.a(R.drawable.flame, true);
/* 1103 */     g1.a = "flame";
/*      */     
/* 1105 */     n[3] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1109 */     g1 = new g();
/* 1110 */     g1.b = 20;
/* 1111 */     g1.c = 25;
/* 1112 */     g1.d = 0;
/* 1113 */     g1.e = 0;
/* 1114 */     g1.f = g1.b;
/* 1115 */     g1.g = g1.c;
/* 1116 */     g1.i = l.bw.a(R.drawable.dust, true);
/* 1117 */     g1.a = "dust";
/*      */     
/* 1119 */     n[4] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1134 */     g1 = new g();
/* 1135 */     g1.b = 50;
/* 1136 */     g1.c = 40;
/* 1137 */     g1.d = 0;
/* 1138 */     g1.e = 0;
/* 1139 */     g1.f = g1.b;
/* 1140 */     g1.g = g1.c;
/* 1141 */     g1.i = l.bw.a(R.drawable.smoke_black, true);
/* 1142 */     g1.a = "smoke_black";
/*      */     
/* 1144 */     g1.a();
/* 1145 */     n[5] = g1;
/*      */ 
/*      */     
/* 1148 */     g1 = new g();
/* 1149 */     g1.b = 50;
/* 1150 */     g1.c = 50;
/* 1151 */     g1.d = 0;
/* 1152 */     g1.e = 0;
/* 1153 */     g1.f = g1.b;
/* 1154 */     g1.g = g1.c;
/* 1155 */     g1.i = l.bw.a(R.drawable.shockwave, true);
/* 1156 */     g1.a = "shockwave";
/*      */     
/* 1158 */     n[6] = g1;
/*      */ 
/*      */     
/* 1161 */     g1 = new g();
/* 1162 */     g1.b = 20;
/* 1163 */     g1.c = 20;
/* 1164 */     g1.d = 0;
/* 1165 */     g1.e = 0;
/* 1166 */     g1.f = g1.b;
/* 1167 */     g1.g = g1.c;
/* 1168 */     g1.i = l.bw.a(R.drawable.fire, true);
/* 1169 */     g1.a = "fire";
/*      */     
/* 1171 */     n[7] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1175 */     g1 = new g();
/* 1176 */     g1.b = 20;
/* 1177 */     g1.c = 30;
/* 1178 */     g1.f = g1.b + 2;
/* 1179 */     g1.g = g1.c;
/* 1180 */     g1.i = l.bw.a(R.drawable.lava_bubble, true);
/* 1181 */     g1.a = "lava_bubble";
/*      */     
/* 1183 */     n[8] = g1;
/*      */ 
/*      */     
/* 1186 */     g1 = new g();
/*      */     
/* 1188 */     g1.b = 28;
/* 1189 */     g1.c = 28;
/* 1190 */     g1.d = 0;
/* 1191 */     g1.e = 0;
/* 1192 */     g1.f = g1.b + 1;
/* 1193 */     g1.g = g1.c + 1;
/*      */     
/* 1195 */     g1.i = l.bw.a(R.drawable.effects2, true);
/* 1196 */     g1.a = "effects2";
/*      */ 
/*      */ 
/*      */     
/* 1200 */     n[9] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1214 */     g1 = new g();
/*      */     
/* 1216 */     g1.b = 20;
/* 1217 */     g1.c = 25;
/* 1218 */     g1.d = 0;
/* 1219 */     g1.e = 0;
/* 1220 */     g1.f = 20;
/* 1221 */     g1.g = 25;
/* 1222 */     g1.i = l.bw.a(R.drawable.plasma_shot, true);
/* 1223 */     g1.a = "plasma_shot";
/*      */     
/* 1225 */     n[10] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1231 */     g1 = new g();
/* 1232 */     g1.b = 104;
/* 1233 */     g1.c = 104;
/* 1234 */     g1.d = 0;
/* 1235 */     g1.e = 0;
/* 1236 */     g1.f = g1.b;
/* 1237 */     g1.g = g1.c;
/* 1238 */     g1.i = l.bw.a(R.drawable.shockwave_large, true);
/* 1239 */     g1.a = "shockwave_large";
/*      */     
/* 1241 */     n[11] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1246 */     g1 = new g();
/* 1247 */     g1.b = 20;
/* 1248 */     g1.c = 20;
/* 1249 */     g1.d = 0;
/* 1250 */     g1.e = 0;
/* 1251 */     g1.f = g1.b;
/* 1252 */     g1.g = g1.c;
/* 1253 */     g1.i = l.bw.a(R.drawable.explode_bits, true);
/* 1254 */     g1.a = "explode_bits";
/*      */ 
/*      */     
/* 1257 */     g1.a();
/*      */     
/* 1259 */     n[12] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1263 */     g1 = new g();
/* 1264 */     g1.b = 39;
/* 1265 */     g1.c = 40;
/* 1266 */     g1.d = 1;
/* 1267 */     g1.e = 1;
/* 1268 */     g1.f = 40;
/* 1269 */     g1.g = 41;
/* 1270 */     g1.i = l.bw.a(R.drawable.explode_big2, true);
/* 1271 */     g1.a = "explode_big2";
/*      */ 
/*      */     
/* 1274 */     n[13] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1279 */     g1 = new g();
/* 1280 */     g1.b = 20;
/* 1281 */     g1.c = 20;
/* 1282 */     g1.d = 0;
/* 1283 */     g1.e = 0;
/* 1284 */     g1.f = g1.b;
/* 1285 */     g1.g = g1.c;
/* 1286 */     g1.i = l.bw.a(R.drawable.explode_bits_bug, true);
/* 1287 */     g1.a = "explode_bits_bug";
/* 1288 */     g1.a();
/* 1289 */     n[14] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1297 */     g1 = new g();
/* 1298 */     g1.b = 20;
/* 1299 */     g1.c = 20;
/* 1300 */     g1.d = 0;
/* 1301 */     g1.e = 0;
/* 1302 */     g1.f = g1.b;
/* 1303 */     g1.g = g1.c;
/* 1304 */     g1.i = l.bw.a(R.drawable.projectiles, true);
/* 1305 */     g1.a = "projectiles";
/* 1306 */     g1.a();
/* 1307 */     n[15] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1311 */     g1 = new g();
/* 1312 */     g1.b = 20;
/* 1313 */     g1.c = 20;
/* 1314 */     g1.d = 0;
/* 1315 */     g1.e = 0;
/* 1316 */     g1.f = g1.b;
/* 1317 */     g1.g = g1.c;
/* 1318 */     g1.i = l.bw.a(R.drawable.projectiles2, true);
/* 1319 */     g1.a = "projectiles2";
/* 1320 */     g1.a();
/* 1321 */     n[16] = g1;
/*      */ 
/*      */ 
/*      */     
/* 1325 */     g1 = new g();
/*      */     
/* 1327 */     g1.b = 30;
/* 1328 */     g1.c = 30;
/* 1329 */     g1.d = 0;
/* 1330 */     g1.e = 0;
/* 1331 */     g1.f = g1.b + 1;
/* 1332 */     g1.g = g1.c + 1;
/*      */     
/* 1334 */     g1.i = l.bw.a(R.drawable.effects3, true);
/* 1335 */     g1.a = "effects3";
/*      */ 
/*      */ 
/*      */     
/* 1339 */     n[17] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1344 */     g1 = new g();
/* 1345 */     g1.b = 50;
/* 1346 */     g1.c = 40;
/* 1347 */     g1.d = 0;
/* 1348 */     g1.e = 0;
/* 1349 */     g1.f = g1.b;
/* 1350 */     g1.g = g1.c;
/* 1351 */     g1.i = l.bw.a(R.drawable.smoke_white, true);
/* 1352 */     g1.a = "smoke_white";
/*      */     
/* 1354 */     g1.a();
/* 1355 */     n[18] = g1;
/*      */ 
/*      */     
/* 1358 */     g1 = new g();
/* 1359 */     g1.b = 56;
/* 1360 */     g1.c = 56;
/* 1361 */     g1.d = 0;
/* 1362 */     g1.e = 0;
/* 1363 */     g1.f = g1.b;
/* 1364 */     g1.g = g1.c;
/* 1365 */     g1.i = l.bw.a(R.drawable.shockwave2, true);
/* 1366 */     g1.a = "shockwave2";
/*      */     
/* 1368 */     g1.a();
/* 1369 */     n[19] = g1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1374 */     if (l.al()) {
/*      */       
/* 1376 */       c1 = 'Ǵ';
/*      */       
/* 1378 */       this.i = 90;
/* 1379 */       this.j = 210;
/*      */     }
/*      */     else {
/*      */       
/* 1383 */       c1 = 'Ģ';
/*      */       
/* 1385 */       this.i = 90;
/* 1386 */       this.j = 170;
/*      */     } 
/*      */ 
/*      */     
/* 1390 */     f = new e[c1];
/*      */     
/* 1392 */     this.b = c1 - 60;
/* 1393 */     this.c = c1 - 30;
/* 1394 */     this.d = c1 - 20;
/* 1395 */     this.e = c1 - 10;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1400 */     for (byte b = 0; b < f.length; b++)
/*      */     {
/* 1402 */       f[b] = new e(this);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(String paramString) {
/* 1410 */     for (byte b = 0; b < n.length; b++) {
/*      */       
/* 1412 */       if (n[b] != null) {
/*      */         
/* 1414 */         if ((n[b]).a != null && (n[b]).a.equalsIgnoreCase(paramString))
/*      */         {
/* 1416 */           return b;
/*      */         }
/* 1418 */         if (("" + b).equals(paramString))
/*      */         {
/* 1420 */           return b;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1425 */     return -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1431 */   float s = 0.0F;
/*      */ 
/*      */   
/*      */   public void a(float paramFloat) {
/* 1435 */     l l = l.u();
/*      */     
/* 1437 */     e[] arrayOfE = f;
/*      */     int i;
/* 1439 */     for (i = 0; i < g; i++) {
/*      */       
/* 1441 */       e e1 = arrayOfE[i];
/* 1442 */       if (e1.p)
/*      */       {
/* 1444 */         if (!e1.q)
/*      */         {
/* 1446 */           e1.b(paramFloat);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 1451 */     if (h)
/*      */     {
/* 1453 */       while (g > 0) {
/*      */         
/* 1455 */         e e1 = arrayOfE[g - 1];
/* 1456 */         if (!e1.p)
/*      */         {
/* 1458 */           g--;
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1467 */     this.s += paramFloat;
/*      */     
/* 1469 */     if (this.s > 10.0F) {
/*      */       
/* 1471 */       this.s = 0.0F;
/*      */       
/* 1473 */       i = l.cb + f.a(0, (int)l.ch);
/* 1474 */       int j = l.cc + f.a(0, (int)l.ci);
/*      */       
/* 1476 */       l.bt.a(i, j);
/* 1477 */       int k = l.bt.M;
/* 1478 */       int m = l.bt.N;
/*      */       
/* 1480 */       g g1 = l.bt.d(k, m);
/*      */       
/* 1482 */       if (g1 != null && g1.g && !g1.h) {
/*      */         
/* 1484 */         l.bt.a(k, m);
/*      */         
/* 1486 */         f((l.bt.M + 10), (l.bt.N - 10 + 10), 0.0F);
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
/*      */   public void a(float paramFloat, int paramInt) {
/* 1498 */     l l = l.u();
/*      */     
/* 1500 */     e[] arrayOfE = f;
/*      */ 
/*      */     
/* 1503 */     if (paramInt == 1)
/*      */     {
/* 1505 */       for (byte b1 = 0; b1 < g; b1++) {
/*      */         
/* 1507 */         e e1 = arrayOfE[b1];
/* 1508 */         if (e1.p) {
/*      */           
/* 1510 */           if (e1.q)
/*      */           {
/* 1512 */             e1.b(paramFloat);
/*      */           }
/*      */ 
/*      */           
/* 1516 */           if (!e1.o && e1.ar)
/*      */           {
/* 1518 */             e1.a(l, true);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/* 1524 */     for (byte b = 0; b < g; b++) {
/*      */       
/* 1526 */       e e1 = arrayOfE[b];
/* 1527 */       if (e1.p)
/*      */       {
/*      */         
/* 1530 */         if (!e1.o && e1.aq == paramInt)
/*      */         {
/* 1532 */           e1.a(l, false);
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float paramFloat) {
/* 1541 */     l l = l.u();
/*      */     
/* 1543 */     e[] arrayOfE = f;
/*      */     
/* 1545 */     for (byte b = 0; b < g; b++) {
/*      */       
/* 1547 */       e e1 = arrayOfE[b];
/* 1548 */       if (e1.p && e1.o)
/*      */       {
/* 1550 */         e1.a(l, false);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {
/* 1559 */     if (paramBoolean) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1566 */     for (byte b = 0; b < f.length; b++) {
/*      */       
/* 1568 */       e e1 = f[b];
/*      */       
/* 1570 */       if (e1.p) {
/*      */         
/* 1572 */         e1.p = false;
/* 1573 */         this.a--;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1578 */     if (this.a != 0)
/*      */     {
/* 1580 */       l.a("EffectEngine::removeAll: effectListActiveSize == " + this.a);
/*      */     }
/*      */     
/* 1583 */     g = 0;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
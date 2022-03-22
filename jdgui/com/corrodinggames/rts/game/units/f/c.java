/*     */ package com.corrodinggames.rts.game.units.f;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.u;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class c
/*     */ {
/*     */   int a;
/*     */   int b;
/*     */   float c;
/*     */   float d;
/*  34 */   public a[][] e = (a[][])null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 203 */   d f = new d();
/* 204 */   g g = new g();
/*     */   
/* 206 */   h h = new h();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   final u i;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   final f j;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   final Rect k;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   final int l = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, r paramr, float paramFloat4, i parami) {
/* 233 */     float f1 = paramFloat1 - paramFloat3;
/* 234 */     float f2 = paramFloat2 - paramFloat3;
/* 235 */     float f3 = paramFloat1 + paramFloat3;
/* 236 */     float f4 = paramFloat2 + paramFloat3;
/*     */     
/* 238 */     this.g.a(f1, f2, f3, f4);
/* 239 */     a(this.g.a, this.g, paramr, paramFloat4, parami);
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
/*     */   public final f a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     u u1 = this.i;
/*     */     u1.clear();
/*     */     a(paramFloat1, paramFloat2, paramFloat3, u1);
/*     */     this.j.a(u1);
/*     */     return this.j;
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
/*     */   public final void a(float paramFloat1, float paramFloat2, float paramFloat3, u paramu) {
/*     */     a[][] arrayOfA = this.e;
/*     */     float f1 = paramFloat1 - paramFloat3;
/*     */     float f2 = paramFloat1 + paramFloat3;
/*     */     float f3 = paramFloat2 - paramFloat3;
/*     */     float f4 = paramFloat2 + paramFloat3;
/*     */     Rect rect = this.k;
/*     */     rect.a = a(f1);
/*     */     rect.c = a(f2);
/*     */     rect.b = b(f3);
/*     */     rect.d = b(f4);
/*     */     for (int i = rect.a; i <= rect.c; i++) {
/*     */       for (int j = rect.b; j <= rect.d; j++) {
/*     */         u u1 = (arrayOfA[i][j]).a.a;
/*     */         af[] arrayOfAf = u1.a();
/*     */         byte b;
/*     */         int k;
/*     */         for (b = 0, k = u1.b; b < k; b++) {
/*     */           af af = arrayOfAf[b];
/*     */           float f5 = af.dH;
/*     */           float f6 = af.dI;
/*     */           if (f1 <= f5 && f5 <= f2 && f3 <= f6 && f6 <= f4) {
/*     */             paramu.a(af);
/*     */           }
/*     */         } 
/*     */       } 
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
/*     */   public c() {
/* 348 */     this.i = new u();
/* 349 */     this.j = new f();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 499 */     this.k = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 825 */     this.l = 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(b paramb) {
/* 830 */     this.e = new a[32][32];
/*     */ 
/*     */     
/* 833 */     for (byte b1 = 0; b1 < 32; b1++) {
/*     */       
/* 835 */       for (byte b2 = 0; b2 < 32; b2++)
/*     */       {
/* 837 */         this.e[b1][b2] = new a();
/*     */       }
/*     */     } 
/*     */     
/* 841 */     this.a = paramb.y * paramb.k / 32;
/* 842 */     this.b = paramb.z * paramb.l / 32;
/*     */     
/* 844 */     this.c = 1.0F / this.a;
/* 845 */     this.d = 1.0F / this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 852 */     this.e = (a[][])null;
/*     */   }
/*     */   
/*     */   public final f b(float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     u u1 = this.i;
/*     */     u1.clear();
/*     */     b(paramFloat1, paramFloat2, paramFloat3, u1);
/*     */     this.j.a(u1);
/*     */     return this.j;
/*     */   }
/*     */   
/*     */   public final void b(float paramFloat1, float paramFloat2, float paramFloat3, u paramu) {
/*     */     a[][] arrayOfA = this.e;
/*     */     float f1 = paramFloat1 - paramFloat3;
/*     */     float f2 = paramFloat1 + paramFloat3;
/*     */     float f3 = paramFloat2 - paramFloat3;
/*     */     float f4 = paramFloat2 + paramFloat3;
/*     */     float f5 = 50.0F;
/*     */     int i = a(f1 - 50.0F);
/*     */     int j = a(f2 + 50.0F);
/*     */     int k = b(f3 - 50.0F);
/*     */     int m = b(f4 + 50.0F);
/*     */     for (int n = i; n <= j; n++) {
/*     */       for (int i1 = k; i1 <= m; i1++) {
/*     */         u u1 = (arrayOfA[n][i1]).a.a;
/*     */         af[] arrayOfAf = u1.a();
/*     */         byte b;
/*     */         int i2;
/*     */         for (b = 0, i2 = u1.b; b < i2; b++) {
/*     */           af af = arrayOfAf[b];
/*     */           float f6 = af.dH;
/*     */           float f7 = af.dI;
/*     */           float f8 = af.bO;
/*     */           if (f1 - f8 <= f6 && f6 <= f2 + f8 && f3 - f8 <= f7 && f7 <= f4 + f8)
/*     */             paramu.b(af); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(RectF paramRectF, e parame, r paramr, float paramFloat, i parami) {
/*     */     a[][] arrayOfA = this.e;
/*     */     Rect rect = this.k;
/*     */     rect.a = a(paramRectF.a);
/*     */     rect.c = a(paramRectF.c);
/*     */     rect.b = b(paramRectF.b);
/*     */     rect.d = b(paramRectF.d);
/*     */     m m1 = null;
/*     */     int j = parami.excludeTeam(paramr);
/*     */     if (j != -2)
/*     */       m1 = m.n(j); 
/*     */     m m2 = parami.onlyEnemiesOfTeam(paramr);
/*     */     m m3 = parami.onlyTeam(paramr);
/*     */     parami.setup(paramr, paramFloat);
/*     */     if (m2 == null && m3 == null) {
/*     */       for (int k = rect.a; k <= rect.c; k++) {
/*     */         for (int m = rect.b; m <= rect.d; m++) {
/*     */           u u1 = (arrayOfA[k][m]).a.a;
/*     */           af[] arrayOfAf = u1.a();
/*     */           byte b;
/*     */           int n;
/*     */           for (b = 0, n = u1.b; b < n; b++) {
/*     */             af af = arrayOfAf[b];
/*     */             if (m1 == null || af.bB != m1)
/*     */               if (parame.a(af))
/*     */                 parami.callback(paramr, paramFloat, af);  
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else if (m3 != null) {
/*     */       int k = m3.i;
/*     */       if (k == -1) {
/*     */         for (int m = rect.a; m <= rect.c; m++) {
/*     */           for (int n = rect.b; n <= rect.d; n++) {
/*     */             u u1 = (arrayOfA[m][n]).d.a;
/*     */             if (u1.b > 0) {
/*     */               af[] arrayOfAf = u1.a();
/*     */               byte b;
/*     */               int i1;
/*     */               for (b = 0, i1 = u1.b; b < i1; b++) {
/*     */                 af af = arrayOfAf[b];
/*     */                 if (parame.a(af))
/*     */                   parami.callback(paramr, paramFloat, af); 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } else if (k == -2) {
/*     */         for (int m = rect.a; m <= rect.c; m++) {
/*     */           for (int n = rect.b; n <= rect.d; n++) {
/*     */             u u1 = (arrayOfA[m][n]).c.a;
/*     */             if (u1.b > 0) {
/*     */               af[] arrayOfAf = u1.a();
/*     */               byte b;
/*     */               int i1;
/*     */               for (b = 0, i1 = u1.b; b < i1; b++) {
/*     */                 af af = arrayOfAf[b];
/*     */                 if (parame.a(af))
/*     */                   parami.callback(paramr, paramFloat, af); 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         for (int m = rect.a; m <= rect.c; m++) {
/*     */           for (int n = rect.b; n <= rect.d; n++) {
/*     */             u u1 = ((arrayOfA[m][n]).b[k]).a;
/*     */             if (u1.b > 0) {
/*     */               af[] arrayOfAf = u1.a();
/*     */               byte b;
/*     */               int i1;
/*     */               for (b = 0, i1 = u1.b; b < i1; b++) {
/*     */                 af af = arrayOfAf[b];
/*     */                 if (parame.a(af))
/*     */                   parami.callback(paramr, paramFloat, af); 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       if (m2 != m.f)
/*     */         for (int k = rect.a; k <= rect.c; k++) {
/*     */           for (int m = rect.b; m <= rect.d; m++) {
/*     */             u u1 = (arrayOfA[k][m]).c.a;
/*     */             if (u1.b > 0) {
/*     */               af[] arrayOfAf = u1.a();
/*     */               byte b1;
/*     */               int n;
/*     */               for (b1 = 0, n = u1.b; b1 < n; b1++) {
/*     */                 af af = arrayOfAf[b1];
/*     */                 if (parame.a(af))
/*     */                   parami.callback(paramr, paramFloat, af); 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }  
/*     */       for (byte b = 0; b < m.a; b++) {
/*     */         m m = m.n(b);
/*     */         if (m != null && m2 != m)
/*     */           if (m2.c(m))
/*     */             for (int k = rect.a; k <= rect.c; k++) {
/*     */               for (int n = rect.b; n <= rect.d; n++) {
/*     */                 u u1 = ((arrayOfA[k][n]).b[b]).a;
/*     */                 if (u1.b > 0) {
/*     */                   af[] arrayOfAf = u1.a();
/*     */                   byte b1;
/*     */                   int i1;
/*     */                   for (b1 = 0, i1 = u1.b; b1 < i1; b1++) {
/*     */                     af af = arrayOfAf[b1];
/*     */                     if (parame.a(af))
/*     */                       parami.callback(paramr, paramFloat, af); 
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             }   
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final int a(float paramFloat) {
/*     */     int i = (int)(paramFloat * this.c);
/*     */     if (i < 0)
/*     */       i = 0; 
/*     */     if (i >= 32)
/*     */       i = 31; 
/*     */     return i;
/*     */   }
/*     */   
/*     */   public final int b(float paramFloat) {
/*     */     int i = (int)(paramFloat * this.d);
/*     */     if (i < 0)
/*     */       i = 0; 
/*     */     if (i >= 32)
/*     */       i = 31; 
/*     */     return i;
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     float f1 = this.c;
/*     */     float f2 = this.d;
/*     */     af[] arrayOfAf = af.bj.a();
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = af.bj.size(); b < i; b++) {
/*     */       af af = arrayOfAf[b];
/*     */       if (af.bz || (int)(af.dH * f1) != af.cN || (int)(af.dI * f2) != af.cO || af.bB == null || af.cP != af.bB.i)
/*     */         a(af); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(af paramaf) {
/*     */     if (this.e == null) {
/*     */       if ((l.u()).bg != 0)
/*     */         l.b("updateUnitGeoIndex: areaList not active"); 
/*     */       paramaf.cN = -1;
/*     */       paramaf.cO = -1;
/*     */       return;
/*     */     } 
/*     */     if (paramaf.bz) {
/*     */       if (paramaf.cN != -1 && paramaf.cO != -1) {
/*     */         this.e[paramaf.cN][paramaf.cO].b(paramaf);
/*     */         paramaf.cN = -1;
/*     */         paramaf.cO = -1;
/*     */       } 
/*     */       return;
/*     */     } 
/*     */     int i = a(paramaf.dH);
/*     */     int j = b(paramaf.dI);
/*     */     int k = -2;
/*     */     if (paramaf.bB != null)
/*     */       k = paramaf.bB.i; 
/*     */     if (paramaf.cN == i && paramaf.cO == j && paramaf.cP == k)
/*     */       return; 
/*     */     if (paramaf.cN != -1 && paramaf.cO != -1)
/*     */       this.e[paramaf.cN][paramaf.cO].b(paramaf); 
/*     */     paramaf.cN = i;
/*     */     paramaf.cO = j;
/*     */     paramaf.cP = k;
/*     */     this.e[paramaf.cN][paramaf.cO].a(paramaf);
/*     */   }
/*     */   
/*     */   public void c(float paramFloat) {}
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\f\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
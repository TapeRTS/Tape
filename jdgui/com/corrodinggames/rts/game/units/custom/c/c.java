/*     */ package com.corrodinggames.rts.game.units.custom.c;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.g.m;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */ {
/*  35 */   static final Rect a = new Rect();
/*  36 */   static final RectF b = new RectF();
/*     */   
/*  38 */   static final Paint c = new Paint();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 281 */   m d = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml) {
/* 338 */     Object[] arrayOfObject = this.d.a();
/* 339 */     for (int i = this.d.a - 1; i >= 0; i--) {
/*     */       
/* 341 */       e e = (e)arrayOfObject[i];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 349 */       a a = paraml.a(e.a.g);
/*     */       
/* 351 */       if (a != null) {
/*     */         
/* 353 */         e.a = a;
/*     */ 
/*     */         
/* 356 */         while (e.b.size() > e.a.d)
/*     */         {
/* 358 */           e.b.remove(e.b.size() - 1);
/*     */         
/*     */         }
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 365 */         this.d.remove(i);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e a(a parama, boolean paramBoolean) {
/* 376 */     int i = this.d.a;
/* 377 */     Object[] arrayOfObject = this.d.a();
/* 378 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 380 */       e e = (e)arrayOfObject[b];
/* 381 */       if (e.a == parama)
/*     */       {
/* 383 */         return e;
/*     */       }
/*     */     } 
/*     */     
/* 387 */     if (paramBoolean) {
/*     */       
/* 389 */       e e = new e(parama);
/* 390 */       this.d.add(e);
/* 391 */       return e;
/*     */     } 
/*     */     
/* 394 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int a(a parama) {
/* 401 */     e e = a(parama, false);
/* 402 */     if (e == null)
/*     */     {
/* 404 */       return 0;
/*     */     }
/* 406 */     return e.b.a;
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
/* 432 */   static Paint e = new Paint(); static {
/* 433 */     e.a(255, 0, 0, 200);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat, af paramaf) {
/* 438 */     l l = l.u();
/*     */ 
/*     */     
/* 441 */     int i = this.d.a;
/*     */     
/* 443 */     if (i == 0) {
/*     */       return;
/*     */     }
/* 446 */     Object[] arrayOfObject = this.d.a();
/* 447 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 449 */       e e = (e)arrayOfObject[b];
/*     */       
/* 451 */       a a = e.a;
/*     */       
/* 453 */       int j = e.b.a;
/*     */       
/* 455 */       Object[] arrayOfObject1 = e.b.a();
/* 456 */       for (int k = j - 1; k >= 0; k--) {
/*     */         
/* 458 */         d d = (d)arrayOfObject1[k];
/*     */         
/* 460 */         if (d.c) {
/*     */ 
/*     */           
/* 463 */           af af1 = d.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 469 */           if (a.e != null) {
/*     */             Paint paint;
/* 471 */             e e1 = a.e;
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 476 */             float f1 = paramaf.dH - (l.u()).cd;
/* 477 */             float f2 = paramaf.dI - (l.u()).ce - paramaf.dJ - 10.0F;
/*     */ 
/*     */             
/* 480 */             float f3 = e1.p;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 489 */             float f4 = f.d(paramaf.dH, paramaf.dI - paramaf.dJ, af1.dH, af1.dI - af1.dJ);
/* 490 */             float f5 = f.a(paramaf.dH, paramaf.dI - paramaf.dJ, af1.dH, af1.dI - af1.dJ);
/*     */ 
/*     */             
/* 493 */             if (f5 < ((e1.l - 2) * (e1.l - 2)))
/*     */             {
/* 495 */               f3 = f.a((int)f5);
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 501 */             l.bw.j();
/* 502 */             l.bw.a(f4 + 90.0F, f1, f2);
/*     */ 
/*     */ 
/*     */             
/* 506 */             a.a(0, (int)(e1.l - f3), e1.k, e1.l);
/*     */             
/* 508 */             b.a(f1 - e1.m, f2 - f3, f1 + e1.m, f2);
/*     */ 
/*     */             
/* 511 */             q q = q.r;
/*     */             
/* 513 */             if (d.d != 0.0F) {
/*     */               
/* 515 */               paint = c;
/*     */               
/* 517 */               int n = (int)Math.abs(d.d * 5.0F);
/*     */               
/* 519 */               if (n > 250)
/*     */               {
/* 521 */                 n = 250;
/*     */               }
/*     */               
/* 524 */               paint.a(255, 255, 255 - n, 255 - n);
/*     */             } 
/*     */ 
/*     */             
/* 528 */             l.bw.a(e1, a, b, paint);
/*     */ 
/*     */ 
/*     */             
/* 532 */             l.bw.k();
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 539 */           if (a.f != null)
/*     */           {
/*     */             
/* 542 */             l.bw.a(paramaf.dH - l.cd, paramaf.dI - l.ce - paramaf.dJ, af1.dH - l.cd, af1.dI - l.ce - af1.dJ, a.f);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 602 */   public static f f = new f();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 826 */     if (this.d.a == 0) {
/*     */       
/* 828 */       paramap.c(-1);
/*     */       
/*     */       return;
/*     */     } 
/* 832 */     paramap.c(0);
/*     */     
/* 834 */     short s = (short)this.d.size();
/*     */     
/* 836 */     paramap.a(s);
/* 837 */     Object[] arrayOfObject = this.d.a();
/* 838 */     for (byte b = 0; b < s; b++) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 845 */       e e = (e)arrayOfObject[b];
/*     */ 
/*     */       
/* 848 */       paramap.a(e.a.g);
/*     */       
/* 850 */       paramap.a((short)e.b.size());
/*     */       
/* 852 */       for (d d : e.b) {
/*     */         
/* 854 */         paramap.a(d.a);
/* 855 */         paramap.a(d.b);
/* 856 */         paramap.a(d.c);
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
/*     */   public strictfp void a(af paramaf, k paramk) {
/* 869 */     byte b = paramk.d();
/* 870 */     if (b == -1) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 875 */     short s = paramk.t();
/*     */     
/* 877 */     this.d.clear();
/* 878 */     for (byte b1 = 0; b1 < s; b1++) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 883 */       h h = paramk.l();
/*     */       
/* 885 */       a a = null;
/* 886 */       if (paramaf instanceof k)
/*     */       {
/* 888 */         a = ((k)paramaf).v.a(h);
/*     */       }
/*     */       
/* 891 */       e e = null;
/*     */       
/* 893 */       if (a != null) {
/*     */         
/* 895 */         e = new e(a);
/* 896 */         this.d.add(e);
/*     */       } 
/*     */       
/* 899 */       short s1 = paramk.t();
/*     */       
/* 901 */       for (byte b2 = 0; b2 < s1; b2++) {
/*     */         
/* 903 */         d d = new d();
/*     */         
/* 905 */         d.a = paramk.a(m.a);
/* 906 */         d.b = paramk.e();
/* 907 */         d.c = paramk.e();
/*     */         
/* 909 */         if (d.a != null && e != null)
/*     */         {
/* 911 */           e.b.add(d);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\c\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
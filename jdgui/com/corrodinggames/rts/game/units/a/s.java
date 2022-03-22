/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.g.c;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.ad;
/*     */ import com.corrodinggames.rts.gameFramework.d.a;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class s
/*     */   implements Comparable
/*     */ {
/*  37 */   public float f = -999.0F;
/*     */ 
/*     */   
/*  40 */   public a g = a.a;
/*     */ 
/*     */ 
/*     */   
/*     */   public float j_() {
/*  45 */     if (this instanceof o)
/*     */     {
/*  47 */       return -100.0F;
/*     */     }
/*     */     
/*  50 */     if (this.f != -999.0F)
/*     */     {
/*  52 */       return this.f;
/*     */     }
/*     */     
/*  55 */     al al = i();
/*  56 */     if (al != null && g())
/*     */     {
/*  58 */       return al.g();
/*     */     }
/*     */     
/*  61 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(s params) {
/*  68 */     if (params == null)
/*     */     {
/*  70 */       return 0;
/*     */     }
/*  72 */     float f = j_() - params.j_();
/*     */ 
/*     */     
/*  75 */     if (f < 0.0F) return -1; 
/*  76 */     if (f > 0.0F) return 1; 
/*  77 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  83 */     if (this == paramObject)
/*     */     {
/*  85 */       return true;
/*     */     }
/*  87 */     if (paramObject == null || paramObject.getClass() != getClass())
/*     */     {
/*  89 */       return false;
/*     */     }
/*  91 */     s s1 = (s)paramObject;
/*     */     
/*  93 */     if (!this.a.equals(s1.a))
/*     */     {
/*  95 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  99 */     return true;
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
/* 116 */   public static final c h = c.a;
/*     */   private c a;
/*     */   private g b;
/*     */   
/*     */   public static final boolean b(c paramc) {
/* 121 */     if (paramc == null || paramc == h)
/*     */     {
/* 123 */       return true;
/*     */     }
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final boolean c(c paramc) {
/* 130 */     return !b(paramc);
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
/*     */   public static boolean a(s params1, s params2) {
/* 158 */     return (params1 == params2);
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
/*     */   public final boolean d(c paramc) {
/* 190 */     return (this.a == paramc);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public s(int paramInt) {
/* 196 */     a(String.valueOf(paramInt));
/*     */   }
/*     */ 
/*     */   
/*     */   public s(String paramString) {
/* 201 */     a(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public s(c paramc) {
/* 207 */     e(paramc);
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
/*     */   public final void a(String paramString) {
/* 235 */     this.a = c.a(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void e(c paramc) {
/* 240 */     this.a = paramc;
/*     */   }
/*     */ 
/*     */   
/*     */   public final c J() {
/* 245 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public c w() {
/* 250 */     return J();
/*     */   }
/*     */ 
/*     */   
/*     */   public final String K() {
/* 255 */     if (this.a == null)
/*     */     {
/* 257 */       return "<null index>";
/*     */     }
/* 259 */     return this.a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String e(af paramaf) {
/* 268 */     return b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String f(af paramaf) {
/* 273 */     return a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g y() {
/* 283 */     g g1 = this.g.a();
/* 284 */     if (g1 != null)
/*     */     {
/* 286 */       return g1;
/*     */     }
/*     */     
/* 289 */     int i = c();
/* 290 */     if (i == 0)
/*     */     {
/* 292 */       return g.a;
/*     */     }
/*     */     
/* 295 */     if (this.b == null || this.b.a() != i)
/*     */     {
/* 297 */       this.b = g.a(i);
/*     */     }
/* 299 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k_() {
/* 309 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(af paramaf) {
/* 314 */     return this.g.a(paramaf);
/*     */   }
/*     */ 
/*     */   
/*     */   public String k(af paramaf) {
/* 319 */     return this.g.b(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf1, af paramaf2) {
/* 325 */     this.g.a(paramaf1, paramaf2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(af paramaf, boolean paramBoolean) {
/* 332 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l(af paramaf) {
/* 337 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m(af paramaf) {
/* 342 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, boolean paramBoolean) {
/* 348 */     if (h(paramaf))
/*     */     {
/* 350 */       return false;
/*     */     }
/*     */     
/* 353 */     if (c.a(paramaf, J()) > 0)
/*     */     {
/* 355 */       return false;
/*     */     }
/*     */     
/* 358 */     if (paramBoolean)
/*     */     {
/*     */       
/* 361 */       return y().e(paramaf, L());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 366 */     return y().b(paramaf, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean s(af paramaf) {
/* 372 */     return a(paramaf);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 377 */     return this.g.a(paramaf, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, m paramm) {
/* 382 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 388 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 393 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean z() {
/* 398 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean A() {
/* 404 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean x() {
/* 414 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public al v() {
/* 421 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public al B() {
/* 426 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean C() {
/* 431 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int p() {
/* 438 */     return 1;
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
/*     */   public boolean n(af paramaf) {
/* 485 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o(af paramaf) {
/* 490 */     return false;
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
/*     */   public String d() {
/* 514 */     String str = null;
/*     */ 
/*     */     
/* 517 */     l l = l.u();
/*     */     
/* 519 */     int i = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 534 */     af[] arrayOfAf = l.bA.bF.a();
/* 535 */     int j = l.bA.bF.size();
/*     */ 
/*     */     
/* 538 */     for (byte b = 0; b < j; b++) {
/*     */       
/* 540 */       af af = arrayOfAf[b];
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 545 */       if (af instanceof r) {
/*     */         
/* 547 */         r r = (r)af;
/*     */         
/* 549 */         if (str == null)
/*     */         {
/* 551 */           str = e((af)r);
/*     */         }
/*     */         
/* 554 */         int k = b((af)r, true);
/* 555 */         if (k != -1 && k != 0)
/*     */         {
/* 557 */           i += k;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 563 */     if (str == null)
/*     */     {
/* 565 */       str = b();
/*     */     }
/*     */     
/* 568 */     if (i != -1 && i != 0)
/*     */     {
/* 570 */       str = str + " (" + i + ")";
/*     */     }
/*     */     
/* 573 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 582 */     String str1 = e(paramaf);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 592 */     t t = f();
/*     */     
/* 594 */     g g1 = y();
/* 595 */     if (!g1.b() && t != t.i) {
/*     */ 
/*     */       
/* 598 */       boolean bool = true;
/*     */       
/* 600 */       str1 = str1 + " (" + g1.a(false, true, 5, bool) + ")";
/*     */     } 
/*     */ 
/*     */     
/* 604 */     String str2 = a.a(this, false);
/* 605 */     if (str2 != null && !"".equals(str2))
/*     */     {
/* 607 */       str1 = str1 + "\n" + str2;
/*     */     }
/*     */     
/* 610 */     String str3 = f(paramaf);
/* 611 */     if (str3 != null && !"".equals(str3)) {
/*     */       
/* 613 */       str1 = str1 + "\n";
/* 614 */       str1 = str1 + str3;
/*     */     } 
/*     */     
/* 617 */     str1 = str1.trim();
/*     */     
/* 619 */     return str1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(af paramaf, boolean paramBoolean) {
/* 624 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(af paramaf) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public e r() {
/* 635 */     if (f() == t.c)
/*     */     {
/* 637 */       return (l.u()).bA.bd;
/*     */     }
/*     */     
/* 640 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public e i(af paramaf) {
/* 645 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int G() {
/* 650 */     return Color.a(100, 255, 255, 255);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect s() {
/* 656 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public af j(af paramaf) {
/* 661 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t(af paramaf) {
/* 666 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(af paramaf) {
/* 671 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 676 */     return this.g.c(paramaf);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 681 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean p(af paramaf) {
/* 688 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean D() {
/* 694 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(af paramaf) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public float j() {
/* 705 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 710 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean E() {
/* 716 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean F() {
/* 721 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u() {
/* 726 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float q(af paramaf) {
/* 732 */     return -1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList r(af paramaf) {
/* 739 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ad I() {
/* 746 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 752 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean L() {
/* 757 */     return false;
/*     */   }
/*     */   
/*     */   public void a(r paramr) {}
/*     */   
/*     */   public abstract String b();
/*     */   
/*     */   public abstract String a();
/*     */   
/*     */   public abstract int c();
/*     */   
/*     */   public abstract int b(af paramaf, boolean paramBoolean);
/*     */   
/*     */   public abstract al i();
/*     */   
/*     */   public abstract boolean g();
/*     */   
/*     */   public abstract u e();
/*     */   
/*     */   public abstract t f();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
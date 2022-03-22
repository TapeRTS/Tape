/*     */ package com.corrodinggames.rts.gameFramework.k;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import com.corrodinggames.rts.game.b.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.ad;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.custom.ag;
/*     */ import com.corrodinggames.rts.game.units.custom.au;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.k.a.a;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   public String a;
/*     */   public String b;
/*     */   public String c;
/*  38 */   public b d = new b();
/*  39 */   public b e = new b();
/*     */ 
/*     */ 
/*     */   
/*  43 */   public m f = new m();
/*     */   
/*     */   public e g;
/*     */   
/*     */   public void a(a parama) {
/*  48 */     this.f.add(parama);
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
/*     */   public boolean h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 120 */   public int n = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 125 */   public int o = Integer.MAX_VALUE;
/*     */   
/*     */   public int p;
/* 128 */   public int q = -1;
/*     */   
/* 130 */   public int r = -1;
/*     */   
/* 132 */   public int s = -1;
/*     */ 
/*     */   
/*     */   public com.corrodinggames.rts.game.b.a t;
/*     */ 
/*     */   
/*     */   public boolean u = false;
/*     */ 
/*     */   
/*     */   public au v;
/*     */ 
/*     */   
/*     */   public float w;
/*     */ 
/*     */   
/*     */   public float x;
/*     */ 
/*     */   
/*     */   public m y;
/*     */ 
/*     */   
/*     */   public ag z;
/*     */ 
/*     */   
/*     */   public Paint A;
/*     */ 
/*     */   
/*     */   public boolean B;
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 164 */     this.t.b(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String b(String paramString) {
/* 170 */     return this.t.b(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(String paramString1, String paramString2) {
/* 175 */     return this.t.a(paramString1, paramString2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(String paramString) {
/* 180 */     return (this.t.b(paramString) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(String paramString, int paramInt) {
/* 185 */     String str = a(paramString, (String)null);
/* 186 */     if (str == null)
/*     */     {
/* 188 */       return paramInt;
/*     */     }
/*     */     
/*     */     try {
/* 192 */       return Integer.parseInt(str);
/*     */     }
/* 194 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 196 */       throw f(paramString + ": Unexpected integer value:'" + str + "'");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(String paramString, int paramInt) {
/*     */     double d2;
/* 204 */     String str1 = b(paramString);
/* 205 */     String str2 = str1;
/*     */     
/* 207 */     if (str1 == null)
/*     */     {
/* 209 */       return paramInt;
/*     */     }
/*     */     
/* 212 */     double d1 = 1.0D;
/*     */     
/* 214 */     if (str1.endsWith("ms")) {
/*     */       
/* 216 */       str1 = str1.substring(0, str1.length() - 2);
/* 217 */       d1 = 1.0D;
/*     */     }
/* 219 */     else if (str1.endsWith("s")) {
/*     */       
/* 221 */       str1 = str1.substring(0, str1.length() - 1);
/* 222 */       d1 = 1000.0D;
/*     */     }
/*     */     else {
/*     */       
/* 226 */       d1 = 1.0D;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 232 */       d2 = Double.parseDouble(str1);
/*     */     }
/* 234 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 236 */       numberFormatException.printStackTrace();
/* 237 */       throw f(paramString + ": Unexpected time:'" + str2 + "'");
/*     */     } 
/*     */     
/* 240 */     return (int)(d2 * d1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(String paramString, float paramFloat) {
/* 246 */     String str = a(paramString, (String)null);
/* 247 */     if (str == null)
/*     */     {
/* 249 */       return paramFloat;
/*     */     }
/*     */     
/*     */     try {
/* 253 */       return Float.parseFloat(str);
/*     */     }
/* 255 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 257 */       throw f(paramString + ": Unexpected float value:'" + str + "'");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer d(String paramString) {
/* 263 */     String str = a(paramString, (String)null);
/* 264 */     if (str == null)
/*     */     {
/* 266 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 271 */       return Integer.valueOf(Integer.parseInt(str));
/*     */     }
/* 273 */     catch (NumberFormatException numberFormatException) {
/*     */       
/* 275 */       throw f(paramString + ": Unexpected integer value:'" + str + "'");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean e(String paramString) {
/* 283 */     String str = a(paramString, (String)null);
/* 284 */     if (str == null)
/*     */     {
/* 286 */       return null;
/*     */     }
/*     */     
/* 289 */     if (str.equalsIgnoreCase("true"))
/*     */     {
/* 291 */       return Boolean.valueOf(true);
/*     */     }
/* 293 */     if (str.equalsIgnoreCase("false"))
/*     */     {
/* 295 */       return Boolean.valueOf(false);
/*     */     }
/* 297 */     throw f(paramString + ": Unexpected boolean value:'" + str + "'");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(String paramString1, String paramString2, boolean paramBoolean) {
/* 304 */     Boolean bool = e(paramString1);
/* 305 */     if (bool != null)
/*     */     {
/* 307 */       return bool.booleanValue();
/*     */     }
/* 309 */     bool = e(paramString2);
/* 310 */     if (bool != null)
/*     */     {
/* 312 */       return bool.booleanValue();
/*     */     }
/*     */     
/* 315 */     return paramBoolean;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String paramString, boolean paramBoolean) {
/* 320 */     String str = a(paramString, (String)null);
/* 321 */     if (str == null)
/*     */     {
/* 323 */       return paramBoolean;
/*     */     }
/*     */     
/* 326 */     if (str.equalsIgnoreCase("true"))
/*     */     {
/* 328 */       return true;
/*     */     }
/* 330 */     if (str.equalsIgnoreCase("false"))
/*     */     {
/* 332 */       return false;
/*     */     }
/* 334 */     throw f(paramString + ": Unexpected boolean value:'" + str + "'");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(String paramString, int paramInt) {
/* 340 */     String str = b(paramString);
/*     */     
/* 342 */     if (str == null)
/*     */     {
/* 344 */       return paramInt;
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 349 */       return Color.a(str);
/*     */     }
/* 351 */     catch (IllegalArgumentException illegalArgumentException) {
/*     */       
/* 353 */       throw f(paramString + ": Unknown color:" + str);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ag a(String paramString, ag paramag) {
/* 359 */     return this.t.a(paramString, paramag);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 449 */     return this.t.a(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public f f(String paramString) {
/* 455 */     return a(paramString, (Exception)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public f a(String paramString, Exception paramException) {
/* 460 */     paramString = "MapTrigger-Error (" + this.a + " id:" + this.b + "): " + paramString;
/*     */     
/* 462 */     ad.f(paramString);
/*     */     
/* 464 */     if (paramException == null)
/*     */     {
/* 466 */       return new f(paramString);
/*     */     }
/* 468 */     return new f(paramString, paramException);
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(String paramString) {
/* 473 */     ad.f("MapTrigger-Error (" + this.a + " id:" + this.b + "): " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public void h(String paramString) {
/* 478 */     l.d("MapTrigger-Debug (" + this.b + "): " + paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public m a() {
/* 484 */     return this.y;
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
/*     */   public int b() {
/* 511 */     return (int)this.t.j.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 516 */     return (int)this.t.j.e();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 522 */     m m1 = a();
/*     */     
/* 524 */     if (m1 != null)
/*     */     {
/* 526 */       if (paramaf.bB != m1)
/*     */       {
/* 528 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 532 */     boolean bool = c("onlyIfEmpty");
/* 533 */     if (bool && paramaf.cc() && paramaf instanceof ad) {
/*     */       
/* 535 */       ad ad = (ad)paramaf;
/* 536 */       if (ad.f() > 0)
/*     */       {
/* 538 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 542 */     return true;
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
/*     */   public boolean d() {
/*     */     boolean bool3;
/* 556 */     l l = l.u();
/*     */ 
/*     */     
/* 559 */     int i = l.bh;
/*     */     
/* 561 */     boolean bool1 = true;
/* 562 */     boolean bool2 = false;
/*     */ 
/*     */     
/* 565 */     if (!this.m)
/*     */     {
/*     */       
/* 568 */       if (this.r != -1)
/*     */       {
/*     */ 
/*     */         
/* 572 */         if (this.r <= i) {
/*     */           
/* 574 */           bool2 = true;
/*     */           
/* 576 */           this.m = true;
/*     */         }
/*     */         else {
/*     */           
/* 580 */           bool1 = false;
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 586 */     if (this.d.a())
/*     */     {
/* 588 */       if (this.d.b()) {
/*     */         
/* 590 */         bool2 = true;
/*     */       }
/*     */       else {
/*     */         
/* 594 */         bool1 = false;
/*     */       } 
/*     */     }
/*     */     
/* 598 */     if (this.f.a > 0)
/*     */     {
/* 600 */       for (a a1 : this.f) {
/*     */         
/* 602 */         if (a1.a(this)) {
/*     */           
/* 604 */           bool2 = true;
/*     */           
/*     */           continue;
/*     */         } 
/* 608 */         bool1 = false;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 617 */     if (this.h) {
/*     */       
/* 619 */       bool3 = (bool2 && bool1) ? true : false;
/*     */     }
/*     */     else {
/*     */       
/* 623 */       bool3 = bool2;
/*     */       
/* 625 */       if (bool1)
/*     */       {
/* 627 */         bool3 = true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 632 */     if (bool3) {
/*     */       
/* 634 */       if (this.n == -1)
/*     */       {
/* 636 */         this.n = i;
/*     */       }
/*     */       
/* 639 */       if (this.s <= 0)
/*     */       {
/* 641 */         return true;
/*     */       }
/*     */       
/* 644 */       if (i >= this.n + this.s)
/*     */       {
/* 646 */         return true;
/*     */       }
/*     */ 
/*     */       
/* 650 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 657 */     this.n = -1;
/*     */     
/* 659 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\k\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
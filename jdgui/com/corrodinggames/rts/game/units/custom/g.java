/*      */ package com.corrodinggames.rts.game.units.custom;
/*      */ 
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.gameFramework.d.w;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class g
/*      */   implements Comparable
/*      */ {
/*   18 */   private static final d l = (new d()).a();
/*      */ 
/*      */   
/*   21 */   public static final g a = a(0);
/*      */   
/*      */   public int b;
/*      */   
/*      */   public float c;
/*      */   
/*      */   public float d;
/*      */   
/*      */   public float e;
/*      */   
/*      */   public int f;
/*      */   public int g;
/*      */   public int h;
/*      */   public int i;
/*      */   public int j;
/*   36 */   public d k = l;
/*      */ 
/*      */ 
/*      */   
/*      */   public int a() {
/*   41 */     return this.b;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(g paramg1, g paramg2) {
/*   47 */     g g1 = new g();
/*      */     
/*   49 */     paramg1.b += paramg2.b;
/*   50 */     paramg1.c += paramg2.c;
/*   51 */     paramg1.d += paramg2.d;
/*   52 */     paramg1.e += paramg2.e;
/*   53 */     paramg1.f += paramg2.f;
/*      */ 
/*      */ 
/*      */     
/*   57 */     if (!paramg1.k.b() || !paramg2.k.b())
/*      */     {
/*   59 */       g1.k = d.a(paramg1.k, paramg2.k);
/*      */     }
/*      */     
/*   62 */     return g1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(g paramg, float paramFloat) {
/*   68 */     g g1 = new g();
/*      */     
/*   70 */     g1.b = (int)(paramg.b * paramFloat);
/*   71 */     paramg.c *= paramFloat;
/*   72 */     paramg.d *= paramFloat;
/*   73 */     paramg.e *= paramFloat;
/*   74 */     g1.f = (int)(paramg.f * paramFloat);
/*      */ 
/*      */     
/*   77 */     if (!paramg.k.b())
/*      */     {
/*   79 */       g1.k = d.b(paramg.k, paramFloat);
/*      */     }
/*   81 */     return g1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(int paramInt) {
/*   87 */     g g1 = new g();
/*   88 */     g1.b = paramInt;
/*      */     
/*   90 */     return g1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(l paraml, ab paramab, String paramString1, String paramString2, boolean paramBoolean) {
/*   97 */     String str = paramab.b(paramString1, paramString2, null);
/*      */     
/*   99 */     if (str == null && !paramBoolean)
/*      */     {
/*  101 */       throw new RuntimeException("Could not find " + paramString2 + " in configuration file under:" + paramString1);
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  106 */       return a(paraml, str);
/*      */     
/*      */     }
/*  109 */     catch (at at) {
/*      */       
/*  111 */       throw new at("Error on key:" + paramString2 + " section:" + paramString1 + " - " + at.getMessage());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(l paraml, ab paramab, String paramString1, String paramString2, g paramg) {
/*  118 */     String str = paramab.b(paramString1, paramString2, null);
/*  119 */     if (str == null)
/*      */     {
/*  121 */       return paramg;
/*      */     }
/*      */     
/*      */     try {
/*  125 */       return a(paraml, str);
/*      */     
/*      */     }
/*  128 */     catch (at at) {
/*      */       
/*  130 */       throw new at("Error on key:" + paramString2 + " section:" + paramString1 + " - " + at.getMessage());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static void b(int paramInt) {
/*  136 */     if (paramInt < 0 || paramInt > 31)
/*      */     {
/*  138 */       throw new at("Flag id must be between 0-31 (is:" + paramInt + ")");
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
/*      */   public static int a(int paramInt, String paramString) {
/*  159 */     if (paramString.contains("-")) {
/*      */       
/*  161 */       String[] arrayOfString = f.b(paramString, '-');
/*      */       
/*  163 */       if (arrayOfString.length != 2)
/*      */       {
/*  165 */         throw new at("Unexpected flag id: " + paramString);
/*      */       }
/*  167 */       int j = Integer.parseInt(arrayOfString[0]);
/*  168 */       int k = Integer.parseInt(arrayOfString[1]);
/*      */       
/*  170 */       b(j);
/*  171 */       b(k);
/*      */       
/*  173 */       if (k < j)
/*      */       {
/*  175 */         throw new at("end<start in flag id: " + paramString);
/*      */       }
/*      */       
/*  178 */       for (int m = j; m <= k; m++)
/*      */       {
/*  180 */         paramInt |= 1 << m;
/*      */       }
/*      */       
/*  183 */       return paramInt;
/*      */     } 
/*      */ 
/*      */     
/*  187 */     int i = Integer.parseInt(paramString);
/*  188 */     b(i);
/*  189 */     paramInt |= 1 << i;
/*      */     
/*  191 */     return paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(l paraml, String paramString) {
/*  200 */     if (paramString == null)
/*      */     {
/*      */       
/*  203 */       return a;
/*      */     }
/*      */ 
/*      */     
/*  207 */     g g1 = new g();
/*      */     
/*  209 */     for (String str : paramString.split(",|\\|")) {
/*      */       
/*  211 */       str = str.trim();
/*  212 */       if (!str.equals("")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  219 */         String str1, str2, arrayOfString[] = str.split("=|:");
/*      */         
/*  221 */         if (arrayOfString.length == 1) {
/*      */           
/*  223 */           str1 = "credits";
/*  224 */           str2 = arrayOfString[0];
/*      */         }
/*  226 */         else if (arrayOfString.length == 2) {
/*      */           
/*  228 */           str1 = arrayOfString[0].trim();
/*  229 */           str2 = arrayOfString[1].trim();
/*      */         }
/*      */         else {
/*      */           
/*  233 */           throw new at("Unknown price format:" + paramString);
/*      */         } 
/*      */         
/*  236 */         boolean bool = false;
/*      */ 
/*      */ 
/*      */         
/*      */         try {
/*  241 */           if (str1.equals("credits"))
/*      */           {
/*  243 */             bool = true;
/*  244 */             int i = Integer.parseInt(str2);
/*  245 */             g1.b = i;
/*      */           }
/*  247 */           else if (str1.equals("energy"))
/*      */           {
/*  249 */             float f = Float.parseFloat(str2);
/*  250 */             g1.c = f;
/*      */           }
/*  252 */           else if (str1.equals("hp"))
/*      */           {
/*  254 */             float f = Float.parseFloat(str2);
/*  255 */             g1.d = f;
/*      */           }
/*  257 */           else if (str1.equals("shield"))
/*      */           {
/*  259 */             float f = Float.parseFloat(str2);
/*  260 */             g1.e = f;
/*      */           }
/*  262 */           else if (str1.equals("ammo"))
/*      */           {
/*  264 */             bool = true;
/*  265 */             int i = Integer.parseInt(str2);
/*  266 */             g1.f = i;
/*      */           }
/*  268 */           else if (str1.equals("hasFlag"))
/*      */           {
/*  270 */             bool = true;
/*      */             
/*  272 */             g1.i = a(g1.i, str2);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*  278 */           else if (str1.equals("hasMissingFlag"))
/*      */           {
/*  280 */             bool = true;
/*      */             
/*  282 */             g1.j = a(g1.j, str2);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*  288 */           else if (str1.equals("setFlag"))
/*      */           {
/*  290 */             bool = true;
/*      */             
/*  292 */             g1.g = a(g1.g, str2);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*  298 */           else if (str1.equals("unsetFlag"))
/*      */           {
/*  300 */             bool = true;
/*      */             
/*  302 */             g1.h = a(g1.h, str2);
/*      */ 
/*      */           
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */             
/*  310 */             a a = paraml.i(str1);
/*  311 */             if (a != null)
/*      */             {
/*  313 */               float f = Float.parseFloat(str2);
/*      */               
/*  315 */               if (g1.k == l)
/*      */               {
/*  317 */                 g1.k = new d();
/*      */               }
/*  319 */               g1.k.a(a, f);
/*      */             
/*      */             }
/*      */             else
/*      */             {
/*  324 */               throw new at("Unknown price type:" + str1);
/*      */             }
/*      */           
/*      */           }
/*      */         
/*  329 */         } catch (NumberFormatException numberFormatException) {
/*      */           
/*  331 */           numberFormatException.printStackTrace();
/*      */           
/*  333 */           String str3 = "Bad price number:" + str2 + " in " + paramString;
/*  334 */           if (bool)
/*      */           {
/*  336 */             str3 = str3 + " (Hint: A whole number was expected)";
/*      */           }
/*      */           
/*  339 */           throw new at(str3);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  344 */     if (g1.k != l)
/*      */     {
/*  346 */       g1.k.a();
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  351 */     if (!g1.c())
/*      */     {
/*  353 */       return a;
/*      */     }
/*      */     
/*  356 */     return g1;
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(af paramaf, boolean paramBoolean) {
/*  361 */     int i = 9999;
/*      */     
/*  363 */     if (!paramBoolean)
/*      */     {
/*  365 */       if (this.b > 0) {
/*      */         
/*  367 */         int j = paramaf.bB.m / this.b;
/*      */         
/*  369 */         i = f.c(i, j);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  375 */     if (this.c > 0.0F) {
/*      */       
/*  377 */       int j = (int)(paramaf.cf / this.c);
/*  378 */       i = f.c(i, j);
/*      */     } 
/*  380 */     if (this.d > 0.0F) {
/*      */ 
/*      */       
/*  383 */       int j = (int)(paramaf.bY / this.d);
/*  384 */       i = f.c(i, j);
/*      */     } 
/*      */     
/*  387 */     if (this.e > 0.0F) {
/*      */ 
/*      */       
/*  390 */       int j = (int)(paramaf.cb / this.e);
/*  391 */       i = f.c(i, j);
/*      */     } 
/*      */ 
/*      */     
/*  395 */     if (this.f > 0) {
/*      */ 
/*      */       
/*  398 */       int j = paramaf.cg / this.f;
/*  399 */       i = f.c(i, j);
/*      */     } 
/*      */ 
/*      */     
/*  403 */     if (!this.k.b()) {
/*      */       
/*  405 */       int j = d.a(this.k, paramaf);
/*  406 */       i = f.c(i, j);
/*      */     } 
/*      */     
/*  409 */     if (!d(paramaf))
/*      */     {
/*  411 */       i = 0;
/*      */     }
/*      */     
/*  414 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(af paramaf) {
/*  423 */     if (b(paramaf, false)) {
/*      */       
/*  425 */       c(paramaf, false);
/*  426 */       return true;
/*      */     } 
/*  428 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(af paramaf, boolean paramBoolean) {
/*  435 */     if (!paramBoolean)
/*      */     {
/*  437 */       if (this.b > 0)
/*      */       {
/*  439 */         if (!paramaf.bB.j(this.b))
/*      */         {
/*  441 */           return false;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  447 */     if (this.c > 0.0F)
/*      */     {
/*  449 */       if (paramaf.cf < this.c)
/*      */       {
/*  451 */         return false;
/*      */       }
/*      */     }
/*  454 */     if (this.d > 0.0F)
/*      */     {
/*  456 */       if (paramaf.bY < this.d)
/*      */       {
/*  458 */         return false;
/*      */       }
/*      */     }
/*  461 */     if (this.e > 0.0F)
/*      */     {
/*  463 */       if (paramaf.cb < this.e)
/*      */       {
/*  465 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  469 */     if (this.f > 0)
/*      */     {
/*  471 */       if (paramaf.cg < this.f)
/*      */       {
/*  473 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  477 */     if (!d(paramaf))
/*      */     {
/*  479 */       return false;
/*      */     }
/*      */     
/*  482 */     if (!this.k.b())
/*      */     {
/*  484 */       if (!d.b(this.k, paramaf))
/*      */       {
/*  486 */         return false;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  491 */     return true;
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
/*      */   public boolean a(af paramaf1, af paramaf2) {
/*  514 */     boolean bool = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  519 */     if (!this.k.b())
/*      */     {
/*  521 */       if (d.a(this.k, paramaf1, paramaf2))
/*      */       {
/*  523 */         bool = true;
/*      */       }
/*      */     }
/*      */     
/*  527 */     return bool;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(af paramaf) {
/*  535 */     if (paramaf.cf < 0.0F)
/*      */     {
/*  537 */       paramaf.cf = 0.0F;
/*      */     }
/*  539 */     if (paramaf.cf > paramaf.aY())
/*      */     {
/*  541 */       paramaf.cf = paramaf.aY();
/*      */     }
/*      */     
/*  544 */     if (paramaf.cb < 0.0F)
/*      */     {
/*  546 */       paramaf.cb = 0.0F;
/*      */     }
/*  548 */     if (paramaf.cb > paramaf.ce)
/*      */     {
/*  550 */       paramaf.cb = paramaf.ce;
/*      */     }
/*      */     
/*  553 */     if (paramaf.bY > paramaf.bZ)
/*      */     {
/*  555 */       paramaf.bY = paramaf.bZ;
/*      */     }
/*      */     
/*  558 */     if (paramaf.cg < 0)
/*      */     {
/*  560 */       paramaf.cg = 0;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(af paramaf) {
/*  567 */     if (this.h != 0)
/*      */     {
/*  569 */       paramaf.ch &= this.h ^ 0xFFFFFFFF;
/*      */     }
/*  571 */     if (this.g != 0)
/*      */     {
/*  573 */       paramaf.ch |= this.g;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int c(int paramInt) {
/*  579 */     if (this.h != 0)
/*      */     {
/*  581 */       paramInt &= this.h ^ 0xFFFFFFFF;
/*      */     }
/*  583 */     if (this.g != 0)
/*      */     {
/*  585 */       paramInt |= this.g;
/*      */     }
/*      */     
/*  588 */     return paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(af paramaf) {
/*  595 */     if (this.i != 0)
/*      */     {
/*  597 */       if (!a(paramaf.ch, this.i))
/*      */       {
/*  599 */         return false;
/*      */       }
/*      */     }
/*  602 */     if (this.j != 0)
/*      */     {
/*  604 */       if (b(paramaf.ch, this.j))
/*      */       {
/*  606 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  610 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean a(int paramInt1, int paramInt2) {
/*  618 */     return ((paramInt2 & paramInt1) == paramInt2);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean b(int paramInt1, int paramInt2) {
/*  623 */     return ((paramInt2 & paramInt1) != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(af paramaf, boolean paramBoolean) {
/*  631 */     if (!paramBoolean)
/*      */     {
/*  633 */       paramaf.bB.m -= this.b;
/*      */     }
/*      */ 
/*      */     
/*  637 */     paramaf.cf -= this.c;
/*  638 */     paramaf.bY -= this.d;
/*  639 */     paramaf.cb -= this.e;
/*  640 */     paramaf.cg -= this.f;
/*      */     
/*  642 */     c(paramaf);
/*      */     
/*  644 */     if (!this.k.b())
/*      */     {
/*  646 */       d.c(this.k, paramaf);
/*      */     }
/*      */ 
/*      */     
/*  650 */     b(paramaf);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(af paramaf) {
/*  661 */     if (this.b > 0) {
/*      */       
/*  663 */       paramaf.bB.f(this.b);
/*      */     }
/*      */     else {
/*      */       
/*  667 */       paramaf.bB.m += this.b;
/*      */     } 
/*      */     
/*  670 */     paramaf.cf += this.c;
/*      */     
/*  672 */     paramaf.bY += this.d;
/*      */     
/*  674 */     paramaf.cb += this.e;
/*      */     
/*  676 */     paramaf.cg += this.f;
/*      */     
/*  678 */     c(paramaf);
/*      */     
/*  680 */     if (!this.k.b())
/*      */     {
/*  682 */       d.d(this.k, paramaf);
/*      */     }
/*      */     
/*  685 */     b(paramaf);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f(af paramaf) {
/*  692 */     paramaf.bB.m += this.b;
/*      */ 
/*      */     
/*  695 */     paramaf.cf += this.c;
/*      */     
/*  697 */     paramaf.bY += this.d;
/*      */     
/*  699 */     paramaf.cb += this.e;
/*      */     
/*  701 */     paramaf.cg += this.f;
/*      */     
/*  703 */     c(paramaf);
/*      */     
/*  705 */     if (!this.k.b())
/*      */     {
/*  707 */       d.d(this.k, paramaf);
/*      */     }
/*      */     
/*  710 */     b(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(af paramaf, float paramFloat, boolean paramBoolean) {
/*  715 */     if (paramBoolean)
/*      */     {
/*  717 */       paramaf.bB.m = (int)(paramaf.bB.m + this.b * paramFloat);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  722 */     paramaf.cf += this.c * paramFloat;
/*      */     
/*  724 */     paramaf.bY += this.d * paramFloat;
/*      */     
/*  726 */     paramaf.cb += this.e * paramFloat;
/*      */     
/*  728 */     paramaf.cg = (int)(paramaf.cg + this.f * paramFloat);
/*      */     
/*  730 */     c(paramaf);
/*      */     
/*  732 */     if (!this.k.b())
/*      */     {
/*  734 */       d.a(this.k, paramaf, paramFloat);
/*      */     }
/*      */     
/*  737 */     b(paramaf);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/*  742 */     if (this == a)
/*      */     {
/*  744 */       return true;
/*      */     }
/*      */     
/*  747 */     if (this.b != 0 || this.c != 0.0F || this.d != 0.0F || this.e != 0.0F || this.f != 0)
/*      */     {
/*  749 */       return false;
/*      */     }
/*      */     
/*  752 */     if (!this.k.b())
/*      */     {
/*  754 */       return false;
/*      */     }
/*      */     
/*  757 */     return true;
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
/*      */   public boolean c() {
/*  770 */     if (this == a)
/*      */     {
/*  772 */       return false;
/*      */     }
/*      */     
/*  775 */     if (this.b != 0 || this.c != 0.0F || this.d != 0.0F || this.e != 0.0F || this.f != 0)
/*      */     {
/*  777 */       return true;
/*      */     }
/*      */     
/*  780 */     if (this.g != 0 || this.h != 0 || this.i != 0 || this.j != 0)
/*      */     {
/*  782 */       return true;
/*      */     }
/*      */     
/*  785 */     if (!this.k.b())
/*      */     {
/*  787 */       return true;
/*      */     }
/*      */     
/*  790 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d() {
/*  797 */     if (this == a)
/*      */     {
/*  799 */       return false;
/*      */     }
/*  801 */     if (this.b != 0 || this.c != 0.0F || this.d != 0.0F || this.e != 0.0F || this.f != 0)
/*      */     {
/*  803 */       return true;
/*      */     }
/*  805 */     if (this.g != 0 || this.h != 0)
/*      */     {
/*  807 */       return true;
/*      */     }
/*  809 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String a(boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3) {
/*  817 */     return b(paramBoolean1, paramBoolean2, paramInt, paramBoolean3);
/*      */   }
/*      */ 
/*      */   
/*      */   private String b(boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3) {
/*  822 */     String str2, str1 = "";
/*      */ 
/*      */     
/*  825 */     if (paramBoolean1) {
/*      */       
/*  827 */       str2 = "\n";
/*      */     }
/*      */     else {
/*      */       
/*  831 */       str2 = " | ";
/*      */     } 
/*  833 */     byte b = 0;
/*      */ 
/*      */     
/*  836 */     if (this.b > 0 && b < paramInt) {
/*      */       
/*  838 */       str1 = str1 + "$" + this.b + str2;
/*  839 */       b++;
/*      */     } 
/*      */     
/*  842 */     if (paramBoolean2) {
/*      */       
/*  844 */       if (this.c > 0.0F && b < paramInt) {
/*      */         
/*  846 */         str1 = str1 + "" + f.f(this.c) + " energy" + str2;
/*  847 */         b++;
/*      */       } 
/*  849 */       if (this.d > 0.0F && b < paramInt) {
/*      */         
/*  851 */         str1 = str1 + "" + f.f(this.d) + " hp" + str2;
/*  852 */         b++;
/*      */       } 
/*  854 */       if (this.e > 0.0F && b < paramInt) {
/*      */         
/*  856 */         str1 = str1 + "" + f.f(this.e) + " shield" + str2;
/*  857 */         b++;
/*      */       } 
/*      */       
/*  860 */       if (this.f > 0 && b < paramInt) {
/*      */         
/*  862 */         str1 = str1 + "" + f.f(this.f) + " ammo" + str2;
/*  863 */         b++;
/*      */       } 
/*      */     } 
/*      */     
/*  867 */     if (!this.k.b())
/*      */     {
/*  869 */       str1 = str1 + this.k.a(paramBoolean1, paramBoolean2, paramInt - b, paramBoolean3, false);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  874 */     str1 = f.a(str1, str2);
/*      */     
/*  876 */     return str1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public g g(af paramaf) {
/*  882 */     g g1 = new g();
/*      */     
/*  884 */     if (this.b > 0)
/*      */     {
/*  886 */       if (paramaf.bB.m < this.b)
/*      */       {
/*  888 */         this.b -= paramaf.bB.m;
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  894 */     if (!this.k.b())
/*      */     {
/*  896 */       g1.k = this.k.a(paramaf);
/*      */     }
/*      */     
/*  899 */     return g1;
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
/*      */   public int a(g paramg) {
/*  974 */     return this.b - paramg.b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ap paramap) {
/*  983 */     boolean bool1 = false;
/*  984 */     boolean bool2 = false;
/*      */     
/*  986 */     if (this.c != 0.0F || this.d != 0.0F || this.e != 0.0F || this.f != 0)
/*      */     {
/*  988 */       bool1 = true;
/*      */     }
/*  990 */     if (this.g != 0 || this.h != 0 || this.i != 0 || this.j != 0)
/*      */     {
/*  992 */       bool1 = true;
/*      */     }
/*  994 */     if (!this.k.b())
/*      */     {
/*  996 */       bool2 = true;
/*      */     }
/*      */     
/*  999 */     byte b = 0;
/* 1000 */     if (bool1)
/*      */     {
/* 1002 */       b = (byte)(b | 0x1);
/*      */     }
/* 1004 */     if (bool2)
/*      */     {
/* 1006 */       b = (byte)(b | 0x2);
/*      */     }
/* 1008 */     paramap.c(b);
/*      */     
/* 1010 */     paramap.a(this.b);
/*      */     
/* 1012 */     if (bool1) {
/*      */       
/* 1014 */       paramap.a(this.c);
/* 1015 */       paramap.a(this.d);
/* 1016 */       paramap.a(this.e);
/* 1017 */       paramap.a(this.f);
/* 1018 */       paramap.a(this.g);
/* 1019 */       paramap.a(this.h);
/* 1020 */       paramap.a(this.i);
/* 1021 */       paramap.a(this.j);
/*      */     } 
/* 1023 */     if (bool2)
/*      */     {
/* 1025 */       this.k.a(paramap);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(k paramk) {
/* 1033 */     g g1 = new g();
/*      */     
/* 1035 */     byte b = paramk.d();
/*      */     
/* 1037 */     boolean bool1 = a(b, 1);
/* 1038 */     boolean bool2 = a(b, 2);
/*      */     
/* 1040 */     g1.b = paramk.f();
/*      */     
/* 1042 */     if (bool1) {
/*      */       
/* 1044 */       g1.c = paramk.g();
/* 1045 */       g1.d = paramk.g();
/* 1046 */       g1.e = paramk.g();
/* 1047 */       g1.f = paramk.f();
/* 1048 */       g1.g = paramk.f();
/* 1049 */       g1.h = paramk.f();
/* 1050 */       g1.i = paramk.f();
/* 1051 */       g1.j = paramk.f();
/*      */     } 
/*      */     
/* 1054 */     if (bool2) {
/*      */       
/* 1056 */       g1.k = new d();
/* 1057 */       g1.k.a(paramk);
/*      */     } 
/*      */     
/* 1060 */     return g1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(af paramaf, boolean paramBoolean) {
/* 1071 */     if (e(paramaf, paramBoolean)) {
/*      */       
/* 1073 */       f(paramaf, paramBoolean);
/* 1074 */       return true;
/*      */     } 
/* 1076 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean e(af paramaf, boolean paramBoolean) {
/* 1082 */     if (this.b > 0)
/*      */     {
/* 1084 */       if (!paramaf.bB.k(this.b))
/*      */       {
/* 1086 */         return false;
/*      */       }
/*      */     }
/*      */     
/* 1090 */     if (paramBoolean)
/*      */     {
/* 1092 */       return w.c(paramaf, this);
/*      */     }
/*      */     
/* 1095 */     return b(paramaf, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(af paramaf, boolean paramBoolean) {
/* 1100 */     paramaf.bB.n -= this.b;
/*      */ 
/*      */     
/* 1103 */     if (paramBoolean)
/*      */     {
/* 1105 */       w.a(paramaf, this);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void g(af paramaf, boolean paramBoolean) {
/* 1112 */     paramaf.bB.n += this.b;
/*      */     
/* 1114 */     if (paramBoolean)
/*      */     {
/* 1116 */       w.b(paramaf, this);
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
/*      */   public boolean b(g paramg) {
/* 1154 */     if (this.b > 0 && paramg.b > 0)
/*      */     {
/* 1156 */       return true;
/*      */     }
/* 1158 */     if (this.d > 0.0F && paramg.d > 0.0F)
/*      */     {
/* 1160 */       return true;
/*      */     }
/* 1162 */     if (this.e > 0.0F && paramg.e > 0.0F)
/*      */     {
/* 1164 */       return true;
/*      */     }
/* 1166 */     if (this.f > 0 && paramg.f > 0)
/*      */     {
/* 1168 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 1172 */     if (!this.k.b() && !paramg.k.b())
/*      */     {
/* 1174 */       if (this.k.d(paramg.k))
/*      */       {
/* 1176 */         return true;
/*      */       }
/*      */     }
/*      */     
/* 1180 */     return false;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
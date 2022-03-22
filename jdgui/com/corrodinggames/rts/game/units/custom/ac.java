/*      */ package com.corrodinggames.rts.game.units.custom;
/*      */ 
/*      */ import android.graphics.Color;
/*      */ import android.graphics.Rect;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.n;
/*      */ import com.corrodinggames.rts.game.units.a.l;
/*      */ import com.corrodinggames.rts.game.units.a.m;
/*      */ import com.corrodinggames.rts.game.units.a.n;
/*      */ import com.corrodinggames.rts.game.units.a.o;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.a.t;
/*      */ import com.corrodinggames.rts.game.units.a.u;
/*      */ import com.corrodinggames.rts.game.units.a.v;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.b;
/*      */ import com.corrodinggames.rts.game.units.b.b;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.a;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.b;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.d;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.e;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.f;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.g;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.h;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.i;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.j;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.k;
/*      */ import com.corrodinggames.rts.game.units.custom.a.a.m;
/*      */ import com.corrodinggames.rts.game.units.custom.a.b;
/*      */ import com.corrodinggames.rts.game.units.custom.a.c;
/*      */ import com.corrodinggames.rts.game.units.custom.a.e;
/*      */ import com.corrodinggames.rts.game.units.custom.a.f;
/*      */ import com.corrodinggames.rts.game.units.custom.b.b;
/*      */ import com.corrodinggames.rts.game.units.custom.b.c;
/*      */ import com.corrodinggames.rts.game.units.custom.b.e;
/*      */ import com.corrodinggames.rts.game.units.custom.b.g;
/*      */ import com.corrodinggames.rts.game.units.custom.b.h;
/*      */ import com.corrodinggames.rts.game.units.custom.d.a;
/*      */ import com.corrodinggames.rts.game.units.custom.d.b;
/*      */ import com.corrodinggames.rts.game.units.custom.d.c;
/*      */ import com.corrodinggames.rts.game.units.custom.d.d;
/*      */ import com.corrodinggames.rts.game.units.custom.e.a;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
/*      */ import com.corrodinggames.rts.game.units.d.c;
/*      */ import com.corrodinggames.rts.game.units.e.b;
/*      */ import com.corrodinggames.rts.game.units.e.c;
/*      */ import com.corrodinggames.rts.game.units.e.h;
/*      */ import com.corrodinggames.rts.game.units.e.j;
/*      */ import com.corrodinggames.rts.game.units.h.f;
/*      */ import com.corrodinggames.rts.game.units.u;
/*      */ import com.corrodinggames.rts.gameFramework.a.i;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.f.b;
/*      */ import com.corrodinggames.rts.gameFramework.j.e;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ import com.corrodinggames.rts.gameFramework.utility.j;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Locale;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ac
/*      */ {
/*      */   static int a;
/*      */   static int b;
/*      */   static b c;
/*      */   static boolean d;
/*  147 */   public static HashMap e = new HashMap<>();
/*      */ 
/*      */   
/*  150 */   public static HashMap f = new HashMap<>();
/*      */ 
/*      */   
/*      */   static int g;
/*      */ 
/*      */   
/*      */   static int h;
/*      */ 
/*      */   
/*      */   static boolean i;
/*      */   
/*      */   static int j;
/*      */ 
/*      */   
/*      */   public static void a(int paramInt) {
/*  165 */     if (c != null)
/*      */     {
/*  167 */       c.r += paramInt;
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
/*  180 */   public static m k = new m();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(e parame) {
/*  243 */     if (parame != null)
/*      */     {
/*  245 */       if (!parame.q) {
/*      */         
/*  247 */         parame.q = true;
/*      */         
/*  249 */         a(parame.t());
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
/*      */   public static void a(e[] paramArrayOfe) {
/*  273 */     if (paramArrayOfe != null) {
/*      */       
/*  275 */       e e1 = null;
/*  276 */       for (e e2 : paramArrayOfe) {
/*      */         
/*  278 */         if (e2 != e1)
/*      */         {
/*  280 */           a(e2);
/*      */         }
/*      */         
/*  283 */         if (e1 == null)
/*      */         {
/*  285 */           e1 = e2;
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(i parami) {
/*  295 */     if (!parami.f) {
/*      */       
/*  297 */       parami.f = true;
/*      */       
/*  299 */       if (c != null)
/*      */       {
/*  301 */         c.s += parami.a();
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
/*      */   public static void b() {
/*  318 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  323 */     ArrayList arrayList1 = new ArrayList(l.c);
/*      */     
/*  325 */     ArrayList arrayList2 = new ArrayList(l.d);
/*      */ 
/*      */     
/*  328 */     m m1 = new m();
/*      */     
/*  330 */     boolean bool1 = false;
/*      */ 
/*      */ 
/*      */     
/*  334 */     boolean bool2 = false;
/*      */ 
/*      */ 
/*      */     
/*  338 */     for (l l1 : arrayList1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  363 */       boolean bool = false;
/*      */ 
/*      */       
/*  366 */       for (y y : l1.j) {
/*      */         
/*  368 */         long l2 = y.a(false);
/*  369 */         if (l2 != y.a) {
/*      */           
/*  371 */           bool = true;
/*  372 */           y.a = l2;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  380 */       if (bool) {
/*      */         
/*  382 */         if (!bool2)
/*      */         {
/*  384 */           l.d("Detected unit changes");
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  390 */         l l2 = a(l1);
/*      */         
/*  392 */         if (l2 == null) {
/*      */           
/*  394 */           l.d("Failed to apply changes to unit type: " + l1.E);
/*      */ 
/*      */ 
/*      */           
/*  398 */           bool1 = true;
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  403 */         l.d("Changes applied to unit type: " + l1.E);
/*      */         
/*  405 */         bool2 = true;
/*      */         
/*  407 */         m1.add(l2);
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
/*      */     
/*  419 */     if (bool2)
/*      */     {
/*  421 */       if (!c(false))
/*      */       {
/*  423 */         bool1 = true;
/*      */       }
/*      */     }
/*      */     
/*  427 */     if (bool2 && !bool1) {
/*      */       
/*  429 */       l.e = null;
/*      */       
/*  431 */       d();
/*      */       
/*  433 */       n = null;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  438 */       m.K();
/*      */       
/*  440 */       if (!bool1)
/*      */       {
/*  442 */         for (l l1 : m1) {
/*      */           
/*  444 */           if (l1.gd.size() > 0) {
/*      */             
/*  446 */             l.a(l1.gd.size() + " Warning(s) loading: " + l1.b() + " \n" + (String)l1.gd.get(0), 1);
/*  447 */             l1.gd.clear();
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/*  456 */     if (bool1) {
/*      */       
/*  458 */       l.d("Failed to load some units, keeping old config");
/*      */       
/*  460 */       synchronized (l.c) {
/*      */ 
/*      */         
/*  463 */         l.c.clear();
/*  464 */         l.c.addAll(arrayList1);
/*      */       } 
/*      */       
/*  467 */       l.d = arrayList2;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void c() {
/*  478 */     if (l.e != null) {
/*      */       
/*  480 */       l.d("applyPendingNetworkUnits: Applying new network units from server (" + l.e.size() + " units)");
/*      */       
/*  482 */       l.d = l.e;
/*  483 */       l.e = null;
/*      */       
/*  485 */       d();
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  490 */       l.d("applyPendingNetworkUnits: no server units list found");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static ArrayList a(boolean paramBoolean) {
/*  497 */     ArrayList<l> arrayList = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  504 */     synchronized (l.c) {
/*      */       
/*  506 */       for (l l : l.c) {
/*      */         
/*  508 */         if (l.B != null)
/*      */         {
/*  510 */           if (!l.B.k() || !paramBoolean) {
/*      */             continue;
/*      */           }
/*      */         }
/*      */ 
/*      */         
/*  516 */         arrayList.add(l);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  538 */     return arrayList;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, boolean paramBoolean) {
/*      */     ab ab1;
/*  545 */     j j = a(paramString1);
/*  546 */     if (j == null) {
/*      */       
/*  548 */       if (paramBoolean) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*  553 */       throw new at("[" + paramString2 + "] Could not find conf target:" + paramString1);
/*      */     } 
/*      */     
/*  556 */     BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)j);
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  561 */       ab1 = new ab(bufferedInputStream, paramString1);
/*      */     }
/*  563 */     catch (IOException iOException) {
/*      */       
/*  565 */       iOException.printStackTrace();
/*  566 */       throw new at("copyFrom conf failed", "IOException: " + iOException.getMessage());
/*      */     } 
/*      */ 
/*      */     
/*  570 */     paraml.m(j.d());
/*      */     
/*  572 */     paramab.a(ab1);
/*      */     
/*  574 */     a(paraml, paramab, ab1, paramString1, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(l paraml, ab paramab1, ab paramab2, String paramString, int paramInt) {
/*  582 */     if (paramInt > 10)
/*      */     {
/*  584 */       throw new at("copyFrom can only be 10 levels deep, maybe you have a loop?");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  591 */     String str = paramab2.b("core", "copyFrom", null);
/*      */     
/*  593 */     if (str != null) {
/*      */       
/*  595 */       String[] arrayOfString = str.split(",");
/*      */       
/*  597 */       Collections.reverse(Arrays.asList((Object[])arrayOfString));
/*      */       
/*  599 */       for (String str1 : arrayOfString) {
/*      */         
/*  601 */         str1 = str1.trim();
/*      */         
/*  603 */         if (!str1.equals("")) {
/*      */           String str2; ab ab1;
/*  605 */           if (str1.contains(".."))
/*      */           {
/*  607 */             throw new at("'..' not supported in copyFrom");
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  614 */           if (str1.startsWith("ROOT:")) {
/*      */             String str3;
/*  616 */             str1 = str1.substring("ROOT:".length());
/*      */ 
/*      */             
/*  619 */             if (paraml.B == null) {
/*      */               
/*  621 */               str3 = "units/common.ini";
/*      */             }
/*      */             else {
/*      */               
/*  625 */               str3 = paraml.B.f + "/common.ini";
/*      */             } 
/*      */ 
/*      */             
/*  629 */             str2 = a(f.h(str3), str1);
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/*  636 */             str2 = a(f.h(paramString), str1);
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  645 */           j j = a(str2);
/*  646 */           if (j == null) {
/*      */ 
/*      */             
/*  649 */             String str3 = "Could not find copyFrom target:" + str2;
/*      */             
/*  651 */             if (paramInt != 0)
/*      */             {
/*  653 */               str3 = str3 + " (while loading: " + paramString + ")";
/*      */             }
/*      */             
/*  656 */             throw new at(str3);
/*      */           } 
/*      */ 
/*      */           
/*  660 */           BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)j);
/*      */ 
/*      */ 
/*      */           
/*      */           try {
/*  665 */             ab1 = new ab(bufferedInputStream, str2);
/*      */           }
/*  667 */           catch (IOException iOException) {
/*      */             
/*  669 */             iOException.printStackTrace();
/*  670 */             throw new at("copyFrom conf failed", "IOException: " + iOException.getMessage());
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  676 */           paraml.m(j.d());
/*      */           
/*  678 */           paramab1.a(ab1);
/*      */ 
/*      */           
/*  681 */           a(paraml, paramab1, ab1, str2, paramInt + 1);
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
/*      */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, int paramInt) {
/*  693 */     if (paramInt > 10)
/*      */     {
/*  695 */       throw new at("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
/*      */     }
/*      */     
/*  698 */     String str = paramab.b(paramString2, "@copyFromSection", null);
/*      */     
/*  700 */     if (str == null || str.equals("")) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  706 */     String[] arrayOfString = str.split(",");
/*      */     
/*  708 */     Collections.reverse(Arrays.asList((Object[])arrayOfString));
/*      */     
/*  710 */     for (String str1 : arrayOfString) {
/*      */       
/*  712 */       str1 = str1.trim();
/*      */       
/*  714 */       if (!str1.equals("")) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  719 */         m m1 = paramab.j(str1, "");
/*  720 */         if (m1.size() == 0)
/*      */         {
/*  722 */           throw new at("[" + paramString2 + "]@copyFromSection: Could not find keys in target section: " + str1);
/*      */         }
/*      */ 
/*      */         
/*  726 */         for (String str2 : m1) {
/*      */           
/*  728 */           String str3 = paramab.b(str1, str2);
/*  729 */           if (str3 != null)
/*      */           {
/*  731 */             paramab.d(paramString1, str2, str3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  737 */         a(paraml, paramab, paramString1, str1, paramInt + 1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ag a(ab paramab, String paramString1, String paramString2, String paramString3) {
/*  746 */     return paramab.c(paramString1, paramString2, paramString3);
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
/*      */   public static l a(l paraml) {
/*  828 */     String str1 = paraml.x;
/*  829 */     l l1 = l.u();
/*      */ 
/*      */     
/*  832 */     l l2 = null;
/*      */ 
/*      */     
/*  835 */     String str2 = null;
/*  836 */     if (paraml.B != null)
/*      */     {
/*  838 */       str2 = paraml.B.z;
/*      */     }
/*      */     
/*  841 */     n = null;
/*      */ 
/*      */     
/*      */     try {
/*  845 */       l2 = a(str1, paraml.B, paraml.C, paraml.D);
/*      */     }
/*  847 */     catch (RuntimeException runtimeException) {
/*      */       
/*  849 */       runtimeException.printStackTrace();
/*      */       
/*  851 */       if (n == null) {
/*      */         
/*  853 */         String str = "Error loading unit:" + str1 + "\n" + runtimeException.getMessage();
/*  854 */         l1.a(str, 1);
/*      */       } 
/*      */     } 
/*      */     
/*  858 */     if (l2 == null)
/*      */     {
/*      */ 
/*      */ 
/*      */       
/*  863 */       if (paraml.B != null)
/*      */       {
/*  865 */         paraml.B.z = str2;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  870 */     if (l2 != null) {
/*      */       
/*  872 */       synchronized (l.c) {
/*      */         
/*  874 */         l.c.remove(paraml);
/*      */       } 
/*      */       
/*  877 */       a(paraml, l2);
/*      */       
/*  879 */       if (l.d.remove(paraml)) {
/*      */         
/*  881 */         l.d.add(l2);
/*      */       }
/*      */       else {
/*      */         
/*  885 */         l.d("Changed unit was not enabled (original not found in customUnitTypes)");
/*      */       } 
/*      */ 
/*      */       
/*  889 */       m.K();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  894 */     return l2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(al paramal, l paraml) {
/*  901 */     for (af af : af.bt()) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  907 */       if (af instanceof k) {
/*      */         
/*  909 */         k k = (k)af;
/*      */         
/*  911 */         if (k.v == paramal) {
/*      */ 
/*      */ 
/*      */           
/*  915 */           m.b((af)k);
/*      */ 
/*      */           
/*  918 */           k.a(paraml, false);
/*      */           
/*  920 */           k.Q();
/*      */           
/*  922 */           if (k.cO() != null)
/*      */           {
/*  924 */             k.cO().a(paraml);
/*      */           }
/*      */           
/*  927 */           m.c((af)k);
/*      */         } 
/*      */ 
/*      */         
/*  931 */         if (k.w == paramal)
/*      */         {
/*  933 */           k.w = paraml;
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String b(boolean paramBoolean) {
/*  943 */     ArrayList arrayList = a(paramBoolean);
/*      */     
/*  945 */     l.e = null;
/*  946 */     l.d = arrayList;
/*      */     
/*  948 */     n = null;
/*      */ 
/*      */     
/*  951 */     d();
/*      */ 
/*      */     
/*  954 */     return n;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean c(boolean paramBoolean) {
/*  961 */     ArrayList arrayList2, arrayList1 = l.d;
/*      */ 
/*      */ 
/*      */     
/*  965 */     if (paramBoolean) {
/*      */       
/*  967 */       arrayList2 = a(true);
/*      */     }
/*      */     else {
/*      */       
/*  971 */       arrayList2 = l.d;
/*      */     } 
/*      */     
/*  974 */     boolean bool = true;
/*      */ 
/*      */     
/*  977 */     n = null;
/*      */     
/*  979 */     l.d = arrayList2;
/*  980 */     e();
/*      */     
/*  982 */     if (n != null)
/*      */     {
/*  984 */       bool = false;
/*      */     }
/*      */     
/*  987 */     l.d = arrayList1;
/*  988 */     e();
/*      */ 
/*      */     
/*  991 */     return bool;
/*      */   }
/*      */ 
/*      */   
/*  995 */   static final Object l = new Object();
/*      */ 
/*      */   
/*      */   public static void d() {
/*  999 */     synchronized (l) {
/*      */       
/* 1001 */       j();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static void j() {
/* 1007 */     l l = null;
/*      */     
/* 1009 */     ArrayList<ak> arrayList = new ArrayList();
/*      */     
/* 1011 */     l l1 = l.u();
/*      */     
/* 1013 */     if (l1.ai())
/*      */     {
/* 1015 */       for (ak ak : ak.values())
/*      */       {
/* 1017 */         arrayList.add(ak);
/*      */       }
/*      */     }
/*      */     
/* 1021 */     for (l l2 : l.d) {
/*      */       
/* 1023 */       arrayList.add(l2);
/*      */ 
/*      */       
/* 1026 */       if (l2.E.equals("missing") && l2.B == null)
/*      */       {
/* 1028 */         l = l2;
/*      */       }
/*      */     } 
/*      */     
/* 1032 */     ak.ad = arrayList;
/*      */ 
/*      */ 
/*      */     
/* 1036 */     af.bz();
/*      */ 
/*      */ 
/*      */     
/* 1040 */     e();
/*      */ 
/*      */     
/* 1043 */     a.d();
/*      */ 
/*      */     
/* 1046 */     if (l == null) {
/*      */ 
/*      */ 
/*      */       
/* 1050 */       l.d("missingPlaceHolder is not an active unit, searching for new target");
/*      */       
/* 1052 */       for (l l2 : l.d) {
/*      */         
/* 1054 */         if (l2.E.equals("missing")) {
/*      */           
/* 1056 */           l.d("Found a missing placeholder");
/* 1057 */           l = l2;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1062 */     l.b = l;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static j a(String paramString) {
/* 1071 */     String str = "" + paramString;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1078 */     return a.h(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(ArrayList<Comparable> paramArrayList) {
/* 1087 */     Collections.sort(paramArrayList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(al paramal) {
/* 1095 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1100 */       paramal.h();
/*      */ 
/*      */ 
/*      */       
/* 1104 */       if (paramal instanceof l) {
/*      */         
/* 1106 */         l l1 = (l)paramal;
/*      */ 
/*      */         
/* 1109 */         if (l1.fw != null) {
/*      */           
/* 1111 */           al al1 = ak.a(l1.fw);
/* 1112 */           if (al1 == null)
/*      */           {
/* 1114 */             throw new at("Could not find [ai]upgradedFrom target:" + l1.fw);
/*      */           }
/*      */           
/* 1117 */           l1.b(al1);
/*      */         } 
/*      */ 
/*      */         
/* 1121 */         for (t t : l1.o)
/*      */         {
/* 1123 */           t.a();
/*      */         }
/*      */         
/* 1126 */         if (l1.ew)
/*      */         {
/*      */           
/* 1129 */           l.g.add(l1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1138 */       for (l l1 : l.d) {
/*      */ 
/*      */ 
/*      */         
/* 1142 */         if (paramal instanceof l) {
/*      */           
/* 1144 */           l l2 = (l)paramal;
/*      */ 
/*      */ 
/*      */           
/* 1148 */           if (l1.fw != null && l1.fw.equalsIgnoreCase(l2.i()))
/*      */           {
/*      */ 
/*      */ 
/*      */             
/* 1153 */             l2.b(l1);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1160 */         for (p p : l1.fQ) {
/*      */           
/* 1162 */           if (p.a.equalsIgnoreCase(paramal.i())) {
/*      */             
/* 1164 */             p.e = true;
/*      */ 
/*      */ 
/*      */             
/* 1168 */             int i = l1.bX;
/*      */             
/* 1170 */             boolean bool = false;
/*      */             
/* 1172 */             for (int j = i; j <= 3; j++) {
/*      */               l l2;
/* 1174 */               ArrayList<l> arrayList = paramal.a(j);
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1179 */               if (l1.aw || p.c) {
/*      */                 
/* 1181 */                 v v = new v(l1);
/*      */               }
/*      */               else {
/*      */                 
/* 1185 */                 l2 = new l(l1, null);
/*      */               } 
/*      */               
/* 1188 */               if (p.b != -999.0F)
/*      */               {
/* 1190 */                 ((s)l2).f = p.b;
/*      */               }
/*      */               
/* 1193 */               if (p.f != null)
/*      */               {
/* 1195 */                 if (paramal instanceof l) {
/*      */                   
/* 1197 */                   ((s)l2).g = b.a(p);
/*      */ 
/*      */                 
/*      */                 }
/* 1201 */                 else if (!bool) {
/*      */                   
/* 1203 */                   bool = true;
/* 1204 */                   l1.o("builtFrom isLocked currently cannot be used when targeting old-style unit:" + paramal.i());
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1213 */               boolean bool1 = false;
/* 1214 */               for (s s : arrayList) {
/*      */                 
/* 1216 */                 if (l2.equals(s))
/*      */                 {
/* 1218 */                   bool1 = true;
/*      */                 }
/*      */               } 
/*      */               
/* 1222 */               if (!bool1)
/*      */               {
/* 1224 */                 arrayList.add(l2);
/*      */               }
/*      */               
/* 1227 */               a(arrayList);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1236 */       if (paramal instanceof l) {
/*      */         
/* 1238 */         l l1 = (l)paramal;
/*      */ 
/*      */ 
/*      */         
/* 1242 */         for (c c : l1.fR) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1248 */           if (c.j != null && c.j.equalsIgnoreCase("setRally")) {
/*      */ 
/*      */             
/* 1251 */             for (byte b3 = 1; b3 <= 3; b3++) {
/*      */               
/* 1253 */               ArrayList<o> arrayList = paramal.a(b3);
/*      */ 
/*      */               
/* 1256 */               o o = new o();
/* 1257 */               if (c.n != -999.0F)
/*      */               {
/* 1259 */                 ((s)o).f = c.n;
/*      */               }
/*      */               
/* 1262 */               arrayList.add(o);
/*      */ 
/*      */               
/* 1265 */               l1.cN = true;
/*      */               
/* 1267 */               a(arrayList);
/*      */             } 
/*      */             
/*      */             continue;
/*      */           } 
/*      */           
/* 1273 */           if (c.j != null && c.j.equalsIgnoreCase("reclaim")) {
/*      */ 
/*      */             
/* 1276 */             for (byte b3 = 1; b3 <= 3; b3++) {
/*      */               
/* 1278 */               ArrayList<m> arrayList = paramal.a(b3);
/*      */               
/* 1280 */               m m1 = new m(true);
/*      */               
/* 1282 */               if (c.n != -999.0F)
/*      */               {
/* 1284 */                 ((s)m1).f = c.n;
/*      */               }
/*      */               
/* 1287 */               arrayList.add(m1);
/*      */               
/* 1289 */               a(arrayList);
/*      */             } 
/*      */             
/*      */             continue;
/*      */           } 
/*      */           
/* 1295 */           if (c.j != null && c.j.equalsIgnoreCase("repair")) {
/*      */ 
/*      */             
/* 1298 */             for (byte b3 = 1; b3 <= 3; b3++) {
/*      */               
/* 1300 */               ArrayList<n> arrayList = paramal.a(b3);
/*      */ 
/*      */               
/* 1303 */               n n = new n();
/*      */               
/* 1305 */               if (c.n != -999.0F)
/*      */               {
/* 1307 */                 ((s)n).f = c.n;
/*      */               }
/*      */               
/* 1310 */               arrayList.add(n);
/*      */ 
/*      */               
/* 1313 */               a(arrayList);
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/*      */             continue;
/*      */           } 
/*      */ 
/*      */           
/* 1322 */           al al1 = null;
/*      */ 
/*      */           
/* 1325 */           if (c.j != null) {
/*      */             
/* 1327 */             al1 = ak.a(c.j);
/*      */             
/* 1329 */             if (al1 == null)
/*      */             {
/*      */ 
/*      */               
/* 1333 */               throw new at("Could not find canBuild target:" + c.j);
/*      */ 
/*      */             
/*      */             }
/*      */           
/*      */           }
/* 1339 */           else if (c.aC != e.b) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1345 */             throw new at("'Target' required for action:" + c.a());
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1359 */           byte b1 = 1;
/*      */           
/* 1361 */           for (byte b2 = b1; b2 <= 3; b2++) {
/*      */             f f;
/* 1363 */             ArrayList<f> arrayList = paramal.a(b2);
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1368 */             if (c.aC == e.a) {
/*      */               
/* 1370 */               if (al1.j() || c.aA)
/*      */               {
/*      */                 
/* 1373 */                 v v = new v(al1, c.az, null);
/* 1374 */                 ((s)v).g = b.a(c);
/*      */               
/*      */               }
/*      */               else
/*      */               {
/* 1379 */                 l l2 = new l(al1, null);
/* 1380 */                 ((s)l2).g = b.a(c);
/*      */               
/*      */               }
/*      */             
/*      */             }
/* 1385 */             else if (c.aC == e.b) {
/*      */               
/* 1387 */               f = new f(c, l.a(al1));
/*      */             
/*      */             }
/*      */             else {
/*      */               
/* 1392 */               throw new at("Could not find actionType:" + c.aC);
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 1397 */             if (c.n != -999.0F)
/*      */             {
/* 1399 */               ((s)f).f = c.n;
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1405 */             boolean bool = false;
/* 1406 */             for (s s : arrayList) {
/*      */               
/* 1408 */               if (f.equals(s))
/*      */               {
/* 1410 */                 bool = true;
/*      */               }
/*      */             } 
/*      */             
/* 1414 */             if (!bool)
/*      */             {
/* 1416 */               arrayList.add(f);
/*      */             }
/*      */ 
/*      */             
/* 1420 */             a(arrayList);
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
/*      */       
/* 1433 */       if (paramal instanceof l)
/*      */       {
/* 1435 */         l l1 = (l)paramal;
/*      */         
/* 1437 */         l1.fj = false;
/*      */         
/* 1439 */         for (byte b1 = 1; b1 <= 3; b1++) {
/*      */           
/* 1441 */           ArrayList arrayList = paramal.a(b1);
/* 1442 */           for (s s : arrayList) {
/*      */             
/* 1444 */             if (s instanceof f) {
/*      */               continue;
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1452 */             if (s.i() != null)
/*      */             {
/* 1454 */               l1.fj = true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1461 */         for (t t : l1.o)
/*      */         {
/* 1463 */           t.b();
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1474 */     catch (at at) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1479 */       a(paramal.i(), at, paramal);
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 1484 */     catch (RuntimeException runtimeException) {
/*      */ 
/*      */ 
/*      */       
/* 1488 */       a(paramal.i(), runtimeException, paramal);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void e() {
/* 1496 */     synchronized (l) {
/*      */       
/* 1498 */       k();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static void k() {
/* 1504 */     l.g.clear();
/*      */     
/* 1506 */     l.f.clear();
/*      */ 
/*      */     
/* 1509 */     for (l l : l.d) {
/*      */       
/* 1511 */       for (p p : l.fQ)
/*      */       {
/* 1513 */         p.e = false;
/*      */       }
/*      */       
/* 1516 */       l.fz.clear();
/*      */     } 
/*      */ 
/*      */     
/* 1520 */     for (l l : l.d) {
/*      */ 
/*      */       
/*      */       try {
/* 1524 */         if (l.I != null) {
/*      */           
/* 1526 */           String[] arrayOfString = l.I.split(",");
/*      */           
/* 1528 */           for (String str : arrayOfString)
/*      */           {
/* 1530 */             str = str.trim();
/*      */             
/* 1532 */             boolean bool = false;
/*      */ 
/*      */             
/* 1535 */             al al = ak.a(str, bool);
/*      */             
/* 1537 */             if (al == null)
/*      */             {
/* 1539 */               throw new at("Could not find overrideAndReplace target:" + str);
/*      */             }
/*      */             
/* 1542 */             if (al instanceof l)
/*      */             {
/* 1544 */               l.d("Replacing:" + al.i() + " with " + l.i());
/*      */             }
/*      */             
/* 1547 */             l.f.put(al, l);
/*      */           }
/*      */         
/*      */         } 
/* 1551 */       } catch (at at) {
/*      */         
/* 1553 */         a(l.i(), at, l);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1561 */     for (ak ak : ak.values())
/*      */     {
/* 1563 */       a((al)ak);
/*      */     }
/* 1565 */     for (l l : l.d)
/*      */     {
/* 1567 */       a(l);
/*      */     }
/*      */ 
/*      */     
/* 1571 */     for (l l : l.d) {
/*      */       
/* 1573 */       for (p p : l.fQ) {
/*      */         
/* 1575 */         if (!p.e) {
/*      */           
/* 1577 */           String str = p.d + " failed to find target:" + p.a;
/*      */           
/* 1579 */           l.o(str);
/*      */           
/* 1581 */           if (l.J >= 1) {
/*      */             
/* 1583 */             l.d("Converting warning to error (meta.strictLevel=" + l.J + ")");
/* 1584 */             l.n(str);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1590 */       if (l.fZ != null && l.fZ.size() > 0)
/*      */       {
/* 1592 */         for (s s : l.fZ) {
/*      */ 
/*      */           
/*      */           try {
/*      */             
/* 1597 */             s.b(l);
/*      */           }
/* 1599 */           catch (at at) {
/*      */             
/* 1601 */             a(l.i(), at, l);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1608 */     for (l l : l.d)
/*      */     {
/* 1610 */       l.r();
/*      */     }
/*      */     
/* 1613 */     Collections.sort(l.g, new q());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static l a(String paramString1, b paramb, String paramString2, String paramString3) {
/*      */     try {
/* 1622 */       j j = a(paramString1);
/*      */       
/* 1624 */       if (j == null)
/*      */       {
/* 1626 */         throw new RuntimeException("Failed to open unit config file:" + paramString1);
/*      */       }
/*      */       
/* 1629 */       BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)j);
/*      */       
/* 1631 */       a++;
/* 1632 */       if (paramb != null)
/*      */       {
/* 1634 */         b++;
/*      */       }
/*      */       
/* 1637 */       l l = l.u();
/*      */       
/* 1639 */       String str = "core units";
/* 1640 */       if (paramb != null)
/*      */       {
/* 1642 */         str = paramb.a();
/*      */       }
/* 1644 */       l.g("Loading units - " + a + " (" + str + ")");
/*      */ 
/*      */       
/* 1647 */       l l1 = a(paramString1, bufferedInputStream, j.c(), paramb, j, paramString2, paramString3);
/*      */ 
/*      */       
/*      */       try {
/* 1651 */         bufferedInputStream.close();
/* 1652 */         j.close();
/*      */       
/*      */       }
/* 1655 */       catch (IOException iOException) {
/*      */         
/* 1657 */         iOException.printStackTrace();
/*      */       } 
/*      */ 
/*      */       
/* 1661 */       return l1;
/*      */     
/*      */     }
/* 1664 */     catch (RuntimeException runtimeException) {
/*      */       
/* 1666 */       a(paramString1, runtimeException, paramb);
/* 1667 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void f() {
/* 1676 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 1680 */     ArrayList arrayList = l.bH.i();
/*      */     
/* 1682 */     h = 0;
/* 1683 */     g = 0;
/* 1684 */     j = 0;
/* 1685 */     i = false;
/*      */     
/* 1687 */     long l1 = bj.a();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1692 */     for (e e : e.values()) {
/*      */       
/* 1694 */       e.q = false;
/* 1695 */       if (e.a != null)
/*      */       {
/* 1697 */         for (e e1 : e.a)
/*      */         {
/* 1699 */           e1.q = false;
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 1704 */     for (i i : f.values())
/*      */     {
/* 1706 */       i.f = false;
/*      */     }
/*      */ 
/*      */     
/* 1710 */     byte[] arrayOfByte = null;
/* 1711 */     ByteBuffer[] arrayOfByteBuffer = null;
/*      */ 
/*      */     
/*      */     try {
/* 1715 */       arrayOfByte = new byte[8000000];
/*      */       
/* 1717 */       arrayOfByte[0] = l.dF;
/* 1718 */       l.dG = arrayOfByte[1];
/*      */ 
/*      */       
/* 1721 */       arrayOfByteBuffer = new ByteBuffer[2];
/* 1722 */       arrayOfByteBuffer[0] = ByteBuffer.allocateDirect(5000000);
/*      */       
/* 1724 */       if (!l.aj())
/*      */       {
/* 1726 */         arrayOfByteBuffer[1] = ByteBuffer.allocateDirect(5000000);
/*      */       
/*      */       }
/*      */     }
/* 1730 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/* 1732 */       System.gc();
/* 1733 */       l.d("Failed to reserve memory pre-mod load");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1739 */     synchronized (l.c) {
/*      */       
/* 1741 */       l.c.clear();
/*      */     } 
/* 1743 */     l.d.clear();
/* 1744 */     l.e = null;
/* 1745 */     l.f.clear();
/* 1746 */     l.bH.l();
/* 1747 */     a = 0;
/* 1748 */     b = 0;
/*      */     
/* 1750 */     a("units", 1, false, (b)null, "units", (String)null);
/*      */ 
/*      */     
/* 1753 */     if (!l.aB && !l.am) {
/*      */       
/* 1755 */       a(g(), true, (b)null);
/* 1756 */       a(h(), true, (b)null);
/*      */ 
/*      */       
/* 1759 */       String str = i();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1765 */       if (!a.d(str))
/*      */       {
/* 1767 */         l.d("Modded Custom '" + str + "' directory not found");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1776 */       for (b b1 : arrayList) {
/*      */         
/* 1778 */         if (!b1.j && b1.f != null) {
/*      */ 
/*      */           
/* 1781 */           String str1 = b1.h();
/*      */ 
/*      */           
/* 1784 */           l.d("Loading mod at:" + str1);
/* 1785 */           a(str1, 2, true, b1, str1, (String)null);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1790 */       for (b b1 : arrayList) {
/*      */         
/* 1792 */         if (b1.j && b1.f != null) {
/*      */ 
/*      */           
/* 1795 */           String str1 = b1.g();
/*      */ 
/*      */           
/* 1798 */           l.d("Loading workshop mod at:" + str1);
/* 1799 */           a(str1, 2, true, b1, str1, (String)null);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1809 */     b(true);
/*      */ 
/*      */     
/* 1812 */     l.d("Done loading custom units. image cacheHits:" + h + " image cacheMisses:" + g + " (in: " + bj.a(l1) + "ms)");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1830 */     l.d("========= Mods data loaded ===========");
/*      */     
/* 1832 */     l.d("Number of mods:" + arrayList.size());
/* 1833 */     for (b b1 : arrayList)
/*      */     {
/* 1835 */       b1.r();
/*      */     }
/*      */     
/* 1838 */     l.d("================================");
/*      */ 
/*      */     
/* 1841 */     if (arrayOfByteBuffer != null) {
/*      */       
/* 1843 */       arrayOfByteBuffer[0] = null;
/* 1844 */       arrayOfByteBuffer[1] = null;
/*      */       
/* 1846 */       arrayOfByteBuffer = null;
/*      */     } 
/*      */     
/* 1849 */     if (arrayOfByte != null) {
/*      */       
/* 1851 */       arrayOfByte[1] = l.dF;
/* 1852 */       l.dG = arrayOfByte[1];
/* 1853 */       arrayOfByte = null;
/*      */       
/* 1855 */       System.gc();
/* 1856 */       System.gc();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1866 */   static b m = null;
/*      */ 
/*      */   
/*      */   public static void a(String paramString, boolean paramBoolean, b paramb) {
/* 1870 */     a(paramString, 1, paramBoolean, paramb, (String)null, (String)null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(String paramString1, int paramInt, boolean paramBoolean, b paramb, String paramString2, String paramString3) {
/* 1877 */     boolean bool = (paramBoolean && paramInt == 1) ? true : false;
/*      */ 
/*      */     
/* 1880 */     l l = l.u();
/*      */     
/* 1882 */     if (paramb != null) {
/*      */       
/* 1884 */       if (paramb.c && !l.by.loadDisabledModData) {
/*      */         
/* 1886 */         paramb.n = true;
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/* 1891 */       paramb.n = false;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1899 */     a.a();
/*      */     
/* 1901 */     String[] arrayOfString = a.e(paramString1);
/*      */     
/* 1903 */     if (arrayOfString == null) {
/*      */       
/* 1905 */       String str = a.a();
/*      */       
/* 1907 */       l.b("readAllCustomUnitConfigs: ERROR");
/* 1908 */       l.b("readAllCustomUnitConfigs: Failed to load:" + paramString1);
/* 1909 */       if (paramb != null)
/*      */       {
/* 1911 */         if (!paramb.o) {
/*      */           
/* 1913 */           if (str == null)
/*      */           {
/* 1915 */             paramb.z = "Failed to list directory, check file permissions";
/*      */           }
/*      */           else
/*      */           {
/* 1919 */             paramb.z = "Failed to list directory: " + str;
/*      */           }
/*      */         
/*      */         } else {
/*      */           
/* 1924 */           paramb.A = "Failed to list subdirectory: '" + paramString1 + "' check file permissions";
/*      */         } 
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1931 */     if (paramb != null)
/*      */     {
/* 1933 */       paramb.o = true;
/*      */     }
/*      */     
/* 1936 */     if (!bool)
/*      */     {
/* 1938 */       for (String str : arrayOfString) {
/*      */         
/* 1940 */         if (str.equalsIgnoreCase("all-units.template"))
/*      */         {
/* 1942 */           paramString3 = paramString1;
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 1948 */     for (String str : arrayOfString) {
/*      */ 
/*      */       
/* 1951 */       if (!str.equals("custom_units_here.txt") && !str.equals("mods_here_will_be_enabled_by_default.txt")) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1956 */         boolean bool1 = false;
/*      */         
/* 1958 */         b b1 = paramb;
/*      */         
/* 1960 */         if (paramBoolean && paramInt == 1 && b1 == null) {
/*      */           
/* 1962 */           b1 = l.bH.b(str);
/*      */           
/* 1964 */           if (b1 == null) {
/*      */             
/* 1966 */             l.b("readAllCustomUnitConfigs: Could not find linked mod:" + str);
/*      */             
/* 1968 */             b1 = l.bH.a;
/*      */           } 
/*      */           
/* 1971 */           bool1 = true;
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1976 */         if (str.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !bool) {
/*      */           
/* 1978 */           String str1 = paramString1 + "/" + str;
/*      */           
/* 1980 */           if (m != b1 && b1 != null) {
/*      */             
/* 1982 */             m = b1;
/*      */             
/* 1984 */             a();
/*      */             
/* 1986 */             l.d("Loading units from mod: " + b1.a);
/*      */           } 
/*      */ 
/*      */           
/* 1990 */           if (str.equalsIgnoreCase("desktop.ini"))
/*      */           {
/* 1992 */             l.d("Skipping possible system file: " + str1);
/*      */           
/*      */           }
/*      */           else
/*      */           {
/* 1997 */             a(str1, b1, paramString2, paramString3);
/*      */           }
/*      */         
/*      */         }
/* 2001 */         else if (str.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
/*      */           
/* 2003 */           String str1 = paramString1 + "/" + str;
/* 2004 */           l.d("Found map: " + str1);
/*      */ 
/*      */           
/* 2007 */           if (b1 != null && b1.m)
/*      */           {
/* 2009 */             l.bH.a(str1, b1);
/*      */           }
/*      */           else
/*      */           {
/* 2013 */             l.d("Skipping map due to mod settings");
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*      */         else {
/*      */ 
/*      */           
/* 2022 */           String str1 = paramString1 + "/" + str;
/* 2023 */           if (paramInt < 10) {
/*      */ 
/*      */             
/* 2026 */             if (a.d(str1))
/*      */             {
/*      */               
/* 2029 */               String str2 = paramString2;
/* 2030 */               if (str2 == null)
/*      */               {
/* 2032 */                 str2 = str1;
/*      */               }
/*      */               
/* 2035 */               long l1 = -1L;
/* 2036 */               if (bool1) {
/*      */                 
/* 2038 */                 l1 = bj.a();
/* 2039 */                 l.d("============");
/* 2040 */                 l.d(">>> Mod '" + b1.c() + "'" + (b1.k() ? "" : " (disabled)"));
/*      */               } 
/*      */               
/* 2043 */               a(str1, paramInt + 1, paramBoolean, b1, str2, paramString3);
/*      */ 
/*      */               
/* 2046 */               if (bool1 && b1 != null && b1.k())
/*      */               {
/* 2048 */                 double d = bj.a(l1);
/*      */                 
/* 2050 */                 l.d("Mod '" + b1.c() + "' load took:" + bj.a(d));
/*      */               
/*      */               }
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/* 2062 */             l.d("Too many levels:" + str1);
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
/*      */   public static l a(String paramString1, InputStream paramInputStream, long paramLong, b paramb, j paramj, String paramString2, String paramString3) {
/* 2075 */     l l = l.u();
/*      */     
/*      */     try {
/*      */       ab ab;
/*      */       
/*      */       boolean bool6;
/* 2081 */       l.bw.d();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/* 2087 */         ab = new ab(paramInputStream, paramString1);
/*      */       }
/* 2089 */       catch (IOException iOException) {
/*      */         
/* 2091 */         throw new RuntimeException(iOException);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2097 */       String str1 = "core";
/* 2098 */       String str2 = "graphics";
/* 2099 */       String str3 = "attack";
/* 2100 */       String str4 = "movement";
/* 2101 */       String str5 = "ai";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2106 */       l l1 = new l();
/*      */ 
/*      */       
/* 2109 */       if (ab.a(str1, "dont_load", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 2111 */         return null;
/*      */       }
/*      */ 
/*      */       
/* 2115 */       l1.x = paramString1;
/* 2116 */       l1.y = paramj.d();
/*      */ 
/*      */       
/* 2119 */       l1.B = paramb;
/* 2120 */       l1.C = paramString2;
/* 2121 */       l1.D = paramString3;
/*      */ 
/*      */       
/* 2124 */       c = paramb;
/* 2125 */       d = false;
/*      */ 
/*      */       
/* 2128 */       if (l1.B != null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2142 */       a(l1, ab, ab, paramString1, 0);
/*      */       
/* 2144 */       if (l1.D != null)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 2149 */         a(l1, ab, l1.D + "/" + "all-units.template", "AUTO units.template", true);
/*      */       }
/*      */       
/* 2152 */       l1.J = ab.b(str1, "strictLevel", Integer.valueOf(0)).intValue();
/* 2153 */       if (l1.J < 0)
/*      */       {
/* 2155 */         throw new at("[core]strictLevel cannot be < 0");
/*      */       }
/* 2157 */       if (l1.J > 1)
/*      */       {
/* 2159 */         throw new at("[core]strictLevel cannot yet be > 1");
/*      */       }
/*      */       
/* 2162 */       l1.gc = ab.a(str1, "logIfCreditResourceUsed", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 2165 */       ab.a(str1, "dont_load");
/*      */ 
/*      */       
/* 2168 */       String str6 = ab.b(str1, "class", "CustomUnitMetadata");
/*      */ 
/*      */       
/* 2171 */       m m1 = ab.c("@copyFrom_skipThisSection");
/* 2172 */       for (String str : m1)
/*      */       {
/* 2174 */         ab.a(str, "@copyFrom_skipThisSection");
/*      */       }
/*      */       
/* 2177 */       m m2 = ab.c("@copyFromSection");
/* 2178 */       for (String str : m2)
/*      */       {
/* 2180 */         a(l1, ab, str, str, 0);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 2185 */       a.a(l1, ab);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2190 */       l1.E = ab.e(str1, "name");
/*      */       
/* 2192 */       l1.A = ab.b();
/*      */ 
/*      */       
/* 2195 */       if (l1.E.equals("self"))
/*      */       {
/* 2197 */         throw new at("Unit name: " + l1.E + " is reserved");
/*      */       }
/* 2199 */       if (l1.E.startsWith("self."))
/*      */       {
/* 2201 */         throw new at("Unit name cannot start with self.");
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
/* 2215 */       String str7 = ab.b(str1, "altNames", null);
/* 2216 */       if (str7 != null)
/*      */       {
/* 2218 */         if (!str7.equalsIgnoreCase("NONE"))
/*      */         {
/*      */           
/* 2221 */           for (String str : str7.split(",")) {
/*      */             
/* 2223 */             str = str.trim();
/* 2224 */             l1.F.add(str);
/*      */           } 
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 2230 */       l1.G = h.a(ab.b(str1, "tags", null));
/*      */ 
/*      */       
/* 2233 */       if (l1.J >= 1 && l1.G != null)
/*      */       {
/* 2235 */         for (h h : l1.G.a) {
/*      */           
/* 2237 */           if (h.a.contains(" "))
/*      */           {
/* 2239 */             throw new at("(strictLevel 1) [core]tags: space in tag: '" + h.a + "'");
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/* 2244 */       l1.I = ab.b(str1, "overrideAndReplace", null);
/*      */       
/* 2246 */       if (l1.I != null)
/*      */       {
/* 2248 */         if (l1.I.equalsIgnoreCase("NONE"))
/*      */         {
/* 2250 */           l1.I = null;
/*      */         }
/*      */       }
/*      */       
/* 2254 */       l1.K = (z)ab.a(str1, "onNewMapSpawn", null, z.class);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2264 */       l1.av = ab.a(str1, "globalScale", Float.valueOf(1.0F)).floatValue();
/*      */ 
/*      */       
/* 2267 */       l1.m(l1.y);
/*      */       
/* 2269 */       if (l1.E.equals("missing"))
/*      */       {
/* 2271 */         if (paramb == null) {
/*      */           
/* 2273 */           l.d("Setting missingPlaceHolder");
/* 2274 */           l.b = l1;
/*      */         }
/*      */         else {
/*      */           
/* 2278 */           l.d("Not setting missingPlaceHolder, as we are in a mod");
/*      */         } 
/*      */       }
/*      */       
/* 2282 */       l1.at = ab.b(str1, "displayLocaleKey", null);
/*      */ 
/*      */       
/* 2285 */       l1.ar = a(ab, str1, "displayText", (String)null);
/*      */ 
/*      */       
/* 2288 */       l1.as = a(ab, str1, "displayDescription", (String)null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2299 */       l1.es = ab.a(str1, "isBio", Boolean.valueOf(false)).booleanValue();
/* 2300 */       l1.et = ab.a(str1, "isBug", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2305 */       l1.ew = ab.a(str1, "isPickableStartingUnit", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 2307 */       l1.ex = ab.a(str1, "startFallingWhenStartingUnit", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 2309 */       l1.cg = ab.a(str1, "stayNeutral", Boolean.valueOf(false)).booleanValue();
/* 2310 */       l1.ch = ab.a(str1, "createNeutral", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 2312 */       if (ab.a(str1, "createOnNeutralTeam", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 2314 */         l1.ch = true;
/*      */       }
/*      */ 
/*      */       
/* 2318 */       l1.ci = ab.a(str1, "whileNeutralTransportAnyTeam", Boolean.valueOf(false)).booleanValue();
/* 2319 */       l1.cj = ab.a(str1, "whileNeutralConvertToTransportedTeam", Boolean.valueOf(false)).booleanValue();
/* 2320 */       l1.ck = ab.a(str1, "convertToNeutralIfNotTransporting", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 2322 */       if (l1.ck)
/*      */       {
/* 2324 */         l1.cg = true;
/*      */       }
/*      */ 
/*      */       
/* 2328 */       l1.cl = ab.a(str1, "createOnAggressiveTeam", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 2332 */       l1.au = ab.a(str1, "showInEditor", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2339 */       l1.L = ab.b(str2, "total_frames", Integer.valueOf(1)).intValue();
/*      */       
/* 2341 */       if (l1.L < 1)
/*      */       {
/* 2343 */         throw new at("TOTAL_FRAMES cannot be: " + l1.L + " (must be 1 or more)");
/*      */       }
/*      */       
/* 2346 */       l1.N = ab.b(str2, "frame_width", Integer.valueOf(-1)).intValue();
/* 2347 */       l1.O = ab.b(str2, "frame_height", Integer.valueOf(-1)).intValue();
/*      */       
/* 2349 */       l1.P = ab.b(str2, "default_frame", Integer.valueOf(0)).intValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2355 */       l1.Y = ab.b(str2, "image_offsetX", Integer.valueOf(0)).intValue();
/* 2356 */       l1.Z = ab.b(str2, "image_offsetY", Integer.valueOf(0)).intValue();
/*      */ 
/*      */       
/* 2359 */       l1.U = n.a;
/*      */       
/* 2361 */       if (ab.a(str2, "teamColorsUseHue", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 2363 */         l1.U = n.b;
/*      */       }
/*      */       
/* 2366 */       String str8 = ab.b(str2, "teamColoringMode", null);
/* 2367 */       if (str8 != null) {
/*      */ 
/*      */         
/* 2370 */         if (ab.a(str2, "teamColorsUseHue", null) != null)
/*      */         {
/* 2372 */           throw new at("Cannot use teamColoringMode and teamColorsUseHue at the same time");
/*      */         }
/*      */         
/* 2375 */         if (str8.equalsIgnoreCase("pureGreen")) {
/*      */           
/* 2377 */           l1.U = n.a;
/*      */         }
/* 2379 */         else if (str8.equalsIgnoreCase("hueAdd")) {
/*      */           
/* 2381 */           l1.U = n.b;
/*      */         }
/* 2383 */         else if (str8.equalsIgnoreCase("hueShift")) {
/*      */           
/* 2385 */           l1.U = n.d;
/*      */         }
/* 2387 */         else if (str8.equalsIgnoreCase("disabled")) {
/*      */           
/* 2389 */           l1.U = n.e;
/*      */         }
/*      */         else {
/*      */           
/* 2393 */           throw new at("Unknown teamColoringMode:" + str8);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2399 */       l1.T = ab.a(str2, "imageSmoothing", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 2402 */       l1.S = ab.a(str2, "imageSmoothingWhenZoomedIn", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 2406 */       l1.Q = ab.a(l1, str2, "isVisible", null);
/*      */       
/* 2408 */       if (l1.Q == LogicBoolean.trueBoolean)
/*      */       {
/* 2410 */         l1.Q = null;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 2415 */       l1.R = ab.a(str2, "isVisibleToEnemies", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2420 */       String str9 = ab.e(str2, "image");
/* 2421 */       l1.V = l1.a(paramString1, str9, l1.T, str2, "image");
/*      */ 
/*      */       
/* 2424 */       if (l1.V == null)
/*      */       {
/* 2426 */         throw new at("Main unit image must be set on custom unit");
/*      */       }
/*      */       
/* 2429 */       l1.W = l1.V.l() / l1.L;
/* 2430 */       l1.X = l1.V.k();
/*      */ 
/*      */       
/* 2433 */       if (l1.N > 0)
/*      */       {
/* 2435 */         l1.W = l1.N;
/*      */       }
/* 2437 */       if (l1.O > 0) {
/*      */         
/* 2439 */         l1.X = l1.O;
/*      */ 
/*      */         
/* 2442 */         if (l1.X < l1.V.k()) {
/*      */           
/* 2444 */           l1.M = l1.V.l() / l1.W;
/*      */           
/* 2446 */           if (l1.M < 1)
/*      */           {
/* 2448 */             l1.M = 1;
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
/*      */ 
/*      */       
/* 2462 */       l1.aa = l1.a(ab, str2, "image_back");
/*      */ 
/*      */       
/* 2465 */       l1.ab = ab.a(str2, "image_back_always_use_full_image", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 2469 */       l1.ac = l1.a(ab, str2, "image_wreak");
/*      */ 
/*      */ 
/*      */       
/* 2473 */       l1.ad = l1.a(ab, str2, "image_turret");
/*      */ 
/*      */       
/* 2476 */       l1.ah = j.do;
/*      */       
/* 2478 */       String str10 = ab.b(str2, "image_shadow", "NONE");
/* 2479 */       if (str10.equalsIgnoreCase("AUTO")) {
/*      */ 
/*      */         
/* 2482 */         String str = "[autoShadow:" + l1.W + "," + l1.X + "]" + l1.V.b + "-" + l1.V.c;
/*      */ 
/*      */         
/* 2485 */         e e = b(str);
/* 2486 */         if (e != null)
/*      */         {
/* 2488 */           l1.ae = e;
/*      */         }
/*      */         else
/*      */         {
/* 2492 */           l1.ae = af.a(l1.V, l1.W, l1.X);
/* 2493 */           a(l1.ae);
/*      */           
/* 2495 */           if (l1.ae != null)
/*      */           {
/* 2497 */             a(str, l1.ae);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 2513 */       else if (str10.equalsIgnoreCase("AUTO_ANIMATED")) {
/*      */ 
/*      */         
/* 2516 */         String str = "[autoShadowAnimated:" + l1.W + "," + l1.X + "]" + l1.V.b + "-" + l1.V.c;
/*      */ 
/*      */         
/* 2519 */         e e = b(str);
/* 2520 */         if (e != null) {
/*      */           
/* 2522 */           l1.ae = e;
/*      */         }
/*      */         else {
/*      */           
/* 2526 */           l1.ae = af.a(l1.V, l1.V.l(), l1.V.k());
/* 2527 */           a(l1.ae);
/*      */           
/* 2529 */           if (l1.ae != null)
/*      */           {
/* 2531 */             a(str, l1.ae);
/*      */           }
/*      */         } 
/*      */         
/* 2535 */         l1.af = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2549 */         l1.ae = l1.a(paramString1, str10, l1.T, str2, "image_shadow");
/*      */       } 
/*      */       
/* 2552 */       if (ab.a(str2, "image_shadow_frames", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 2554 */         l1.af = true;
/*      */       }
/*      */ 
/*      */       
/* 2558 */       l1.ag = l1.a(l1.V, l1.U);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2563 */       l1.p = ab.a(str2, "teamColorsOnTurret", Boolean.valueOf(false)).booleanValue();
/* 2564 */       if (l1.p)
/*      */       {
/* 2566 */         if (l1.ad != null)
/*      */         {
/* 2568 */           l1.ai = l1.a(l1.ad, l1.U);
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 2573 */       float f1 = ab.a(str2, "scaleImagesTo", Float.valueOf(-1.0F)).floatValue();
/*      */       
/* 2575 */       if (f1 > 0.0F) {
/*      */         
/* 2577 */         f1 *= l1.av;
/*      */         
/* 2579 */         l1.bw = f1 / l1.W;
/*      */       } 
/*      */       
/* 2582 */       float f2 = ab.a(str2, "imageScale", Float.valueOf(1.0F)).floatValue();
/* 2583 */       if (f2 != 1.0F)
/*      */       {
/* 2585 */         l1.bw *= f2;
/*      */       }
/*      */ 
/*      */       
/* 2589 */       float f3 = ab.a(str2, "scaleTurretImagesTo", Float.valueOf(-1.0F)).floatValue();
/*      */       
/* 2591 */       if (f3 > 0.0F) {
/*      */         
/* 2593 */         f3 *= l1.av;
/*      */         
/* 2595 */         if (l1.ad == null)
/*      */         {
/* 2597 */           throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
/*      */         }
/*      */         
/* 2600 */         l1.bx = f3 / l1.ad.k;
/*      */       } 
/* 2602 */       float f4 = ab.a(str2, "turretImageScale", Float.valueOf(1.0F)).floatValue();
/* 2603 */       if (f4 != 1.0F)
/*      */       {
/* 2605 */         l1.bx *= f4;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2613 */       l1.aj = c.e;
/*      */       
/* 2615 */       e e1 = l1.a(ab, str2, "image_shield");
/* 2616 */       if (e1 != null) {
/*      */         
/* 2618 */         l1.aj = e1;
/* 2619 */         l1.ak = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2624 */       l1.al = l1.a(ab, str2, "icon_build", false);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2630 */       float f5 = l1.V.l() * l1.bw;
/* 2631 */       float f6 = l1.V.k() * l1.bw;
/*      */       
/* 2633 */       if (f5 / 2.0F > 90.0F || f6 / 2.0F > 90.0F) {
/*      */ 
/*      */         
/* 2636 */         l1.w = new Rect();
/*      */         
/* 2638 */         l1.w.a = (int)(-f5 / 2.0F);
/* 2639 */         l1.w.c = (int)(f5 / 2.0F);
/*      */         
/* 2641 */         l1.w.b = (int)(-f6 / 2.0F);
/* 2642 */         l1.w.d = (int)(f6 / 2.0F);
/*      */         
/* 2644 */         l1.v = true;
/*      */       } 
/*      */ 
/*      */       
/* 2648 */       for (String str25 : ab.l("resource_", "global_resource_")) {
/*      */         boolean bool11;
/*      */ 
/*      */         
/* 2652 */         if (str25.startsWith("resource_")) {
/*      */           
/* 2654 */           str26 = str25.substring("resource_".length());
/* 2655 */           bool11 = false;
/*      */         }
/*      */         else {
/*      */           
/* 2659 */           str26 = str25.substring("global_resource_".length());
/* 2660 */           bool11 = true;
/*      */         } 
/*      */         
/* 2663 */         String str26 = str26.trim();
/*      */         
/* 2665 */         if (str26.contains(" "))
/*      */         {
/* 2667 */           throw new RuntimeException("[" + str25 + "] resource codename cannot contain a space");
/*      */         }
/*      */         
/* 2670 */         if (str26.contains("=") || str26.contains("|") || str26.contains(":") || str26
/* 2671 */           .contains(",") || str26.contains("(") || str26.contains(")") || str26
/* 2672 */           .contains("<") || str26.contains(">") || str26.contains("$"))
/*      */         {
/* 2674 */           throw new RuntimeException("[" + str25 + "] resource codename cannot contain the symbols: =|:,()<>$");
/*      */         }
/*      */         
/* 2677 */         b b5 = new b(bool11);
/* 2678 */         b5.a(l1, ab, str25, str26);
/*      */         
/* 2680 */         if (l1.i(b5.a) != null)
/*      */         {
/* 2682 */           throw new RuntimeException("[" + str25 + "] resource with name:" + b5.a + " already exists in this file");
/*      */         }
/* 2684 */         l1.i.add(b5);
/*      */       } 
/*      */       
/* 2687 */       for (b b5 : l1.i)
/*      */       {
/* 2689 */         b5.a(l1);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2756 */       if (l.k()) {
/*      */         
/* 2758 */         g.a(l1, ab);
/*      */         
/* 2760 */         e.a(l1, ab);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2766 */       h.a(l1, ab);
/*      */ 
/*      */ 
/*      */       
/* 2770 */       l1.bP = ab.b(str1, "autoTriggerCooldownTime", Float.valueOf(60.0F)).floatValue();
/*      */       
/* 2772 */       if (l1.bP < 0.0F)
/*      */       {
/* 2774 */         throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
/*      */       }
/*      */       
/* 2777 */       if (l1.bP > 120.0F)
/*      */       {
/* 2779 */         throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
/*      */       }
/*      */       
/* 2782 */       if (!ab.a(str1, "autoTriggerCooldownTime_allowDangerousHighCPU", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 2784 */         if (l1.bP < 5.0F)
/*      */         {
/* 2786 */           throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 2791 */       l1.bQ = ab.f(str1, "mass");
/*      */       
/* 2793 */       l1.bR = ab.a(str1, "availableInDemo", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 2795 */       l1.bS = ab.a(str1, "isLocked", Boolean.valueOf(false)).booleanValue();
/* 2796 */       l1.bT = ab.a(str1, "isLockedIfGameModeNoNuke", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2801 */       l1.bU = g.a(l1, ab, str1, "price", false);
/*      */ 
/*      */ 
/*      */       
/* 2805 */       l1.bV = g.a(l1, ab, str1, "reclaimPrice", (g)null);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2810 */       l1.bW = ab.d(str1, "buildSpeed", Float.valueOf(1.0F)).floatValue();
/* 2811 */       l1.bX = ab.b(str1, "techLevel", Integer.valueOf(1)).intValue();
/*      */ 
/*      */       
/* 2814 */       if (l1.bX > 3)
/*      */       {
/* 2816 */         throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
/*      */       }
/*      */       
/* 2819 */       if (l1.bX < 1)
/*      */       {
/* 2821 */         throw new RuntimeException("techLevel cannot be less than 1, it is:" + l1.bX);
/*      */       }
/*      */       
/* 2824 */       l1.bY = ab.a(str1, "experimental", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2830 */       l1.ce = g.a(l1, ab, str1, "borrowResourcesWhileAlive", true);
/*      */ 
/*      */       
/* 2833 */       l1.bZ = g.a(l1, ab, str1, "generation_resources", true);
/*      */ 
/*      */       
/* 2836 */       int i = ab.b(str1, "generation_credits", Integer.valueOf(0)).intValue();
/* 2837 */       if (i != 0)
/*      */       {
/* 2839 */         l1.bZ = g.a(l1.bZ, g.a(i));
/*      */       }
/*      */       
/* 2842 */       l1.cc = ab.b(str1, "generation_delay", Integer.valueOf(40)).intValue();
/*      */       
/* 2844 */       if (l1.cc == 0)
/*      */       {
/* 2846 */         l1.cc = 1;
/*      */       }
/* 2848 */       if (l1.cc < 0)
/*      */       {
/* 2850 */         throw new RuntimeException("[" + str1 + "]generation_delay cannot be < 0");
/*      */       }
/*      */       
/* 2853 */       l1.cd = 40.0F / l1.cc;
/*      */       
/* 2855 */       if (!l1.bZ.b()) {
/*      */         
/* 2857 */         l1.ca = new d();
/* 2858 */         l1.ca.a(l1.bZ);
/* 2859 */         l1.ca.a(l1.cd);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2864 */       if (!l1.ca.b())
/*      */       {
/* 2866 */         for (c c : l1.ca.b) {
/*      */           
/* 2868 */           if (!c.a.b() && c.a.c()) {
/*      */             
/* 2870 */             if (l1.cb == d.a)
/*      */             {
/* 2872 */               l1.cb = new d();
/*      */             }
/* 2874 */             l1.cb.b(c.a, c.b);
/*      */           } 
/*      */         } 
/*      */       }
/*      */       
/* 2879 */       l1.cf = ab.a(l1, str1, "generation_active", (LogicBoolean)LogicBoolean.trueBoolean);
/*      */ 
/*      */       
/* 2882 */       l1.a(l1.bZ);
/*      */ 
/*      */ 
/*      */       
/* 2886 */       l1.cm = ab.a(str1, "resourceRate", Float.valueOf(0.0F)).floatValue();
/*      */       
/* 2888 */       l1.cn = ab.b(str1, "resourceMaxConcurrentReclaimingThis", Integer.valueOf(2147483647)).intValue();
/*      */       
/* 2890 */       l1.co = ab.a(l1, str1, "similarResourcesHaveTag", null);
/*      */       
/* 2892 */       l1.da = aq.a(l1, ab.b(str1, "soundOnAttackOrder", null));
/* 2893 */       l1.db = aq.a(l1, ab.b(str1, "soundOnMoveOrder", null));
/* 2894 */       l1.dc = aq.a(l1, ab.b(str1, "soundOnNewSelection", null));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2900 */       String str11 = ab.b(str2, "drawLayer", null);
/* 2901 */       if (str11 != null)
/*      */       {
/* 2903 */         if (str11.equals("experimentals")) {
/*      */           
/* 2905 */           l1.cp = 4;
/*      */         }
/* 2907 */         else if (str11.equals("underwater")) {
/*      */           
/* 2909 */           l1.cp = 1;
/*      */         }
/* 2911 */         else if (str11.equals("bottom")) {
/*      */           
/* 2913 */           l1.cp = 1;
/*      */         }
/* 2915 */         else if (str11.equals("ground")) {
/*      */           
/* 2917 */           l1.cp = 2;
/*      */         }
/* 2919 */         else if (str11.equals("ground2")) {
/*      */           
/* 2921 */           l1.cp = 3;
/*      */         }
/* 2923 */         else if (str11.equals("air")) {
/*      */           
/* 2925 */           l1.cp = 5;
/*      */         }
/* 2927 */         else if (str11.equals("top")) {
/*      */           
/* 2929 */           l1.cp = 10;
/*      */         }
/* 2931 */         else if (str11.equals("wreaks")) {
/*      */           
/* 2933 */           l1.cp = 0;
/*      */         }
/*      */         else {
/*      */           
/* 2937 */           throw new RuntimeException("unknown drawLayer:" + str11);
/*      */         } 
/*      */       }
/*      */       
/* 2941 */       l1.cq = ab.a(str2, "shadowOffsetX", Float.valueOf(0.0F)).floatValue();
/* 2942 */       l1.cr = ab.a(str2, "shadowOffsetY", Float.valueOf(0.0F)).floatValue();
/*      */ 
/*      */       
/* 2945 */       l1.dn = ab.a(str2, "rotate_with_direction", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 2947 */       l1.do = ab.a(str2, "lock_body_rotation_with_main_turret", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 2949 */       l1.dp = ab.a(str2, "lock_shadow_rotation_with_main_turret", Boolean.valueOf(l1.do)).booleanValue();
/*      */       
/* 2951 */       l1.dq = ab.a(str2, "lock_leg_rotation_with_main_turret", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2956 */       l1.ds = ab.a(str2, "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0F)).floatValue();
/*      */ 
/*      */       
/* 2959 */       l1.dt = m.a(l1, ab, str2, "animation_", false);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2966 */       for (String str25 : ab.e("effect_")) {
/*      */         
/* 2968 */         String str26 = str25.substring("effect_".length());
/*      */         
/* 2970 */         ad ad = new ad(str26);
/*      */         
/* 2972 */         ad.a(l1, ab, str25);
/*      */         
/* 2974 */         l1.fN.add(ad);
/*      */       } 
/* 2976 */       for (ad ad : l1.fN) {
/*      */         
/* 2978 */         if (ad.alsoEmitEffects != null)
/*      */         {
/* 2980 */           ad.alsoEmitEffects.c();
/*      */         }
/*      */         
/* 2983 */         if (ad.alsoEmitEffectsOnDeath != null)
/*      */         {
/* 2985 */           ad.alsoEmitEffectsOnDeath.c();
/*      */         }
/*      */         
/* 2988 */         if (ad.ifSpawnFailsEmitEffects != null)
/*      */         {
/* 2990 */           ad.ifSpawnFailsEmitEffects.c();
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2998 */       l1.by = ab.a(str2, "splastEffect", Boolean.valueOf(false)).booleanValue();
/* 2999 */       l1.bB = ab.a(str2, "dustEffect", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3001 */       l1.bz = ab.a(str2, "splastEffectReverse", Boolean.valueOf(true)).booleanValue();
/* 3002 */       l1.bC = ab.a(str2, "dustEffectReverse", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 3004 */       l1.bA = (l1.bB || l1.by);
/*      */       
/* 3006 */       String str12 = ab.b(str2, "movementEffect", null);
/* 3007 */       if (str12 != null) {
/*      */         
/* 3009 */         l1.bD = l1.a(str12, (x)null);
/*      */         
/* 3011 */         if (l1.bD != null && l1.bD.a())
/*      */         {
/* 3013 */           l1.bA = true;
/*      */         }
/*      */       } 
/* 3016 */       String str13 = ab.b(str2, "movementEffectReverse", null);
/* 3017 */       if (str13 != null) {
/*      */         
/* 3019 */         l1.bE = l1.a(str13, (x)null);
/*      */         
/* 3021 */         if (l1.bE != null && l1.bE.a())
/*      */         {
/* 3023 */           l1.bA = true;
/*      */         }
/*      */       } 
/* 3026 */       l1.bG = ab.a(str2, "movementEffectRate", Float.valueOf(11.0F)).floatValue();
/*      */       
/* 3028 */       l1.bF = ab.a(str2, "movementEffectReverseFlipEffects", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3033 */       l1.bI = ab.a(str2, "repairEffectRate", Float.valueOf(5.0F)).floatValue();
/*      */       
/* 3035 */       String str14 = ab.b(str2, "repairEffect", null);
/* 3036 */       if (str14 != null) {
/*      */         
/* 3038 */         l1.bJ = l1.a(str14, (x)null);
/*      */         
/* 3040 */         if (l1.bJ != null && l1.bJ.b())
/*      */         {
/* 3042 */           l1.bH = true;
/*      */         }
/*      */       } 
/*      */       
/* 3046 */       String str15 = ab.b(str2, "repairEffectAtTarget", null);
/* 3047 */       if (str15 != null) {
/*      */         
/* 3049 */         l1.bK = l1.a(str15, (x)null);
/*      */         
/* 3051 */         if (l1.bK != null && l1.bK.b())
/*      */         {
/* 3053 */           l1.bH = true;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3060 */       l1.bM = ab.a(str2, "reclaimEffectRate", Float.valueOf(5.0F)).floatValue();
/*      */       
/* 3062 */       String str16 = ab.b(str2, "reclaimEffect", null);
/* 3063 */       if (str16 != null) {
/*      */         
/* 3065 */         l1.bN = l1.a(str16, (x)null);
/*      */         
/* 3067 */         if (l1.bN != null && l1.bN.b())
/*      */         {
/* 3069 */           l1.bL = true;
/*      */         }
/*      */       } 
/*      */       
/* 3073 */       String str17 = ab.b(str2, "reclaimEffectAtTarget", null);
/* 3074 */       if (str17 != null) {
/*      */         
/* 3076 */         l1.bO = l1.a(str17, (x)null);
/*      */         
/* 3078 */         if (l1.bO != null && l1.bO.b())
/*      */         {
/* 3080 */           l1.bL = true;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3086 */       l1.de.a(l1, ab, str2, "animation_" + l1.de.a + "_");
/* 3087 */       l1.df.a(l1, ab, str2, "animation_" + l1.df.a + "_");
/* 3088 */       l1.dg.a(l1, ab, str2, "animation_" + l1.dg.a + "_");
/*      */ 
/*      */       
/* 3091 */       for (String str25 : ab.e("animation_")) {
/*      */         
/* 3093 */         String str26 = str25.substring("animation_".length());
/*      */         
/* 3095 */         f f = new f(str26);
/*      */         
/* 3097 */         f.a(l1, ab, str25, "");
/*      */         
/* 3099 */         l1.dd.add(f);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3108 */       l1.de = l1.a(n.a, l1.de, true);
/* 3109 */       l1.df = l1.a(n.c, l1.df, true);
/* 3110 */       l1.dg = l1.a(n.b, l1.dg, true);
/*      */ 
/*      */       
/* 3113 */       l1.di = l1.a(n.e);
/*      */ 
/*      */       
/* 3116 */       l1.dj = l1.a(n.f);
/*      */ 
/*      */       
/* 3119 */       if (l1.di != null && l1.dj != null)
/*      */       {
/* 3121 */         throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
/*      */       }
/*      */       
/* 3124 */       l1.dh = l1.a(n.d);
/*      */ 
/*      */       
/* 3127 */       l1.dk = l1.a(n.g);
/*      */       
/* 3129 */       if (l1.dk != null)
/*      */       {
/* 3131 */         l1.aU = true;
/*      */       }
/*      */       
/* 3134 */       l1.dl = l1.a(n.h);
/* 3135 */       l1.dm = l1.a(n.i);
/*      */ 
/*      */       
/* 3138 */       l1.cs = ab.f(str1, "maxHp");
/*      */       
/* 3140 */       l1.ct = ab.b(str1, "maxShield", Integer.valueOf(0)).intValue();
/*      */       
/* 3142 */       l1.cu = ab.a(str1, "startShieldAtZero", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3145 */       l1.cx = ab.a(str1, "shieldRegen", Float.valueOf(0.25F)).floatValue();
/*      */       
/* 3147 */       l1.cF = ab.a(str1, "shieldDisplayOnlyDeflection", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3149 */       l1.cG = ab.a(str1, "shieldDeflectionDisplayRate", Float.valueOf(4.0F)).floatValue();
/*      */       
/* 3151 */       l1.cv = ab.a(str1, "armour", Float.valueOf(0.0F)).floatValue();
/* 3152 */       l1.cw = ab.a(str1, "armourMinDamageToKeep", Float.valueOf(1.0F)).floatValue();
/*      */       
/* 3154 */       l1.cy = ab.a(str1, "energyMax", Float.valueOf(0.0F)).floatValue();
/*      */       
/* 3156 */       l1.cz = ab.a(str1, "startEnergyAtZero", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3159 */       l1.cA = ab.a(str1, "energyRegen", Float.valueOf(0.0F)).floatValue();
/*      */       
/* 3161 */       l1.cD = ab.a(str1, "energyStartingPercentage", Float.valueOf(1.0F)).floatValue();
/*      */       
/* 3163 */       l1.cC = ab.a(str1, "energyNeedsToRechargeToFull", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3166 */       l1.cB = ab.a(str1, "energyRegenWhenRecharging", Float.valueOf(l1.cA)).floatValue();
/*      */ 
/*      */       
/* 3169 */       l1.cE = a(ab, str1, "energyDisplayName", (String)null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3175 */       l1.cH = ab.f(str1, "radius");
/* 3176 */       l1.cO = ab.b(str1, "displayRadius", Integer.valueOf(l1.cH)).intValue();
/*      */ 
/*      */       
/* 3179 */       float f7 = l1.cH;
/*      */       
/* 3181 */       if (f7 < 6.0F)
/*      */       {
/* 3183 */         f7 = 6.0F;
/*      */       }
/*      */       
/* 3186 */       l1.cP = ab.a(str1, "uiTargetRadius", Float.valueOf(f7)).floatValue();
/*      */ 
/*      */       
/* 3189 */       l1.cQ = ab.b(str1, "shieldRenderRadius", Integer.valueOf(l1.cH)).intValue();
/*      */       
/* 3191 */       l1.cR = ab.b(str1, "buildingSelectionOffset", Integer.valueOf(0)).intValue();
/*      */ 
/*      */ 
/*      */       
/* 3195 */       l1.cI = ab.a(str1, "footprint", l1.cI);
/* 3196 */       l1.cJ = ab.a(str1, "constructionFootprint", l1.cJ);
/*      */ 
/*      */       
/* 3199 */       l1.cK.a(l1.cI);
/* 3200 */       l1.cK = ab.a(str1, "displayFootprint", l1.cK);
/*      */ 
/*      */ 
/*      */       
/* 3204 */       l1.cL = ab.a(str1, "buildingToFootprintOffsetX", Float.valueOf(10.0F)).floatValue();
/* 3205 */       l1.cM = ab.a(str1, "buildingToFootprintOffsetY", Float.valueOf(10.0F)).floatValue();
/*      */ 
/*      */ 
/*      */       
/* 3209 */       l1.cH = (int)(l1.cH * l1.av);
/* 3210 */       l1.cO = (int)(l1.cO * l1.av);
/*      */ 
/*      */       
/* 3213 */       l1.cS = ab.b(str1, "fogOfWarSightRange", Integer.valueOf(15)).intValue();
/* 3214 */       l1.cT = ab.b(str1, "fogOfWarSightRangeWhileNotBuilt", Integer.valueOf(l1.cS)).intValue();
/*      */ 
/*      */ 
/*      */       
/* 3218 */       l1.cU = ab.a(str1, "exit_x", Float.valueOf(0.0F)).floatValue();
/* 3219 */       l1.cV = ab.a(str1, "exit_y", Float.valueOf(9.0F)).floatValue();
/*      */ 
/*      */       
/* 3222 */       l1.cW = ab.a(str1, "exit_dirOffset", null);
/* 3223 */       l1.cX = ab.a(str1, "exit_heightOffset", Float.valueOf(0.0F)).floatValue();
/* 3224 */       l1.cY = ab.a(str1, "exitHeightIgnoreParent", Boolean.valueOf(false)).booleanValue();
/* 3225 */       l1.cZ = ab.a(str1, "exit_moveAwayAmount", Float.valueOf(70.0F));
/*      */ 
/*      */       
/* 3228 */       l1.eq = ab.b(str1, "softCollisionOnAll", Integer.valueOf(0)).intValue();
/*      */       
/* 3230 */       l1.er = ab.a(str1, "disableAllUnitCollisions", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3232 */       if (l1.er)
/*      */       {
/* 3234 */         l1.cI.a(0, 0, -1, -1);
/*      */       }
/*      */ 
/*      */       
/* 3238 */       l1.ey = ab.a(str1, "hideScorchMark", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3241 */       l1.ez = ab.a(str2, "disableLowHpFire", Boolean.valueOf(l1.es)).booleanValue();
/* 3242 */       l1.eA = ab.a(str2, "disableLowHpSmoke", Boolean.valueOf(l1.es)).booleanValue();
/*      */       
/* 3244 */       l1.aw = ab.a(str1, "isBuilding", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3246 */       l1.ax = ab.a(str1, "ignoreInUnitCapCalculation", Boolean.valueOf(l1.aw)).booleanValue();
/*      */       
/* 3248 */       l1.ay = ab.a(str1, "placeOnlyOnResPool", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3250 */       l1.az = ab.a(str1, "isUnrepairableUnit", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3259 */       l1.aA = ab.a(str1, "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0F)).floatValue();
/*      */       
/* 3261 */       l1.aB = ab.a(str1, "isUnselectable", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3263 */       l1.aC = ab.a(str1, "isUnselectableAsTarget", Boolean.valueOf(l1.aB)).booleanValue();
/*      */       
/* 3265 */       l1.fC = ab.a(l1, str1, "showActionsWithMixedSelectionIfOtherUnitsHaveTag", null);
/*      */ 
/*      */ 
/*      */       
/* 3269 */       l1.aD = ab.a(str1, "canNotBeDirectlyAttacked", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3272 */       l1.aE = ab.a(str1, "canNotBeDamaged", Boolean.valueOf(l1.aD)).booleanValue();
/*      */ 
/*      */       
/* 3275 */       l1.aF = ab.a(str1, "showOnMinimap", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 3279 */       l1.aG = ab.a(str1, "showOnMinimapToEnemies", Boolean.valueOf(l1.R)).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 3283 */       l1.aH = ab.a(l1, str1, "canOnlyBeAttackedByUnitsWithTags", null);
/*      */       
/* 3285 */       if (l1.aD)
/*      */       {
/* 3287 */         if (l1.aH != null)
/*      */         {
/* 3289 */           throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
/*      */         }
/*      */       }
/*      */       
/* 3293 */       l1.aI = ab.a(str1, "canNotBeGivenOrdersByPlayer", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3295 */       l1.aJ = ab.a(str1, "canRepairBuildings", Boolean.valueOf(false)).booleanValue();
/* 3296 */       l1.aK = ab.a(str1, "canRepairUnits", Boolean.valueOf(false)).booleanValue();
/* 3297 */       l1.aL = ab.a(str1, "autoRepair", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3299 */       if (l1.aL)
/*      */       {
/* 3301 */         l1.a(b.a);
/*      */       }
/*      */ 
/*      */       
/* 3305 */       l1.aM = ab.b(str1, "nanoRange", Integer.valueOf(-1)).intValue();
/* 3306 */       if (l1.aM != -1)
/*      */       {
/* 3308 */         l1.aM = (int)(l1.aM * l1.av);
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3314 */       l1.aO = ab.a(str1, "nanoRangeForRepairIsMelee", Boolean.valueOf(false)).booleanValue();
/* 3315 */       if (l1.aO)
/*      */       {
/* 3317 */         l1.aN = 5;
/*      */       }
/*      */       
/* 3320 */       int k = ab.b(str1, "nanoRangeForRepair", Integer.valueOf(-1)).intValue();
/* 3321 */       if (k != -1) {
/*      */         
/* 3323 */         l1.aN = k;
/* 3324 */         l1.aN = (int)(l1.aN * l1.av);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3329 */       l1.aQ = ab.a(str1, "nanoRangeForReclaimIsMelee", Boolean.valueOf(false)).booleanValue();
/* 3330 */       if (l1.aQ)
/*      */       {
/* 3332 */         l1.aP = 5;
/*      */       }
/*      */       
/* 3335 */       int n = ab.b(str1, "nanoRangeForReclaim", Integer.valueOf(-1)).intValue();
/* 3336 */       if (n != -1) {
/*      */         
/* 3338 */         l1.aP = n;
/* 3339 */         l1.aP = (int)(l1.aP * l1.av);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3345 */       l1.aR = ab.a(str1, "nanoRepairSpeed", Float.valueOf(0.2F)).floatValue();
/* 3346 */       l1.aS = ab.a(str1, "nanoBuildSpeed", Float.valueOf(1.0F)).floatValue();
/*      */       
/* 3348 */       l1.aT = ab.a(str1, "nanoFactorySpeed", Float.valueOf(1.0F)).floatValue();
/*      */       
/* 3350 */       l1.aV = ab.a(str1, "selfRegenRate", Float.valueOf(0.0F)).floatValue();
/*      */ 
/*      */       
/* 3353 */       l1.aW = ab.d(str1, "selfBuildRate", Float.valueOf(0.0F)).floatValue();
/*      */ 
/*      */       
/* 3356 */       l1.aX = ab.a(str1, "dieOnConstruct", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3358 */       l1.aZ = ab.a(str1, "dieOnZeroEnergy", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3360 */       byte b1 = 4;
/* 3361 */       if (l1.bQ > 30000)
/*      */       {
/* 3363 */         b1 = 8;
/*      */       }
/* 3365 */       if (l1.aw)
/*      */       {
/* 3367 */         b1 = 7;
/*      */       }
/*      */ 
/*      */       
/* 3371 */       l1.bf = ab.b(str1, "numBitsOnDeath", Integer.valueOf(b1)).intValue();
/*      */       
/* 3373 */       l1.bc = ab.a(str1, "nukeOnDeath", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3375 */       l1.bd = ab.a(str1, "nukeOnDeathRange", Float.valueOf(250.0F)).floatValue();
/*      */       
/* 3377 */       l1.be = ab.a(str1, "nukeOnDeathDamage", Float.valueOf(5400.0F)).floatValue();
/*      */       
/* 3379 */       l1.bg = ab.a(str1, "nukeOnDeathDisableWhenNoNuke", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3381 */       l1.bb = ab.b(str1, "fireOnDeath", Integer.valueOf(0)).intValue();
/*      */       
/* 3383 */       l1.bi = (u)ab.a(str1, "explodeTypeOnDeath", null, u.class);
/*      */       
/* 3385 */       l1.bj = ab.a(str1, "explodeOnDeath", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 3387 */       l1.bh = ab.a(str1, "disableDeathOnZeroHp", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3389 */       boolean bool = ab.a(str1, "explodeOnDeathGroundCollosion", Boolean.valueOf(true)).booleanValue();
/* 3390 */       bool = ab.a(str1, "explodeOnDeathGroundCollision", Boolean.valueOf(bool)).booleanValue();
/* 3391 */       l1.bk = bool;
/*      */ 
/*      */       
/* 3394 */       l1.bn = l1.a(ab.b(str1, "effectOnDeath", null), (x)null);
/*      */ 
/*      */       
/* 3397 */       l1.bm = l1.a(ab.b(str1, "effectOnDeathIfUnbuilt", null), (x)null);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3402 */       l1.bo = aq.a(l1, ab.b(str1, "soundOnDeath", null));
/*      */ 
/*      */ 
/*      */       
/* 3406 */       String str18 = ab.b(str1, "effectOnDeathGroundCollosion", null);
/* 3407 */       str18 = ab.b(str1, "effectOnDeathGroundCollision", str18);
/* 3408 */       l1.bl = l1.a(str18, (x)null);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3413 */       l1.br = au.a(l1, ab, str1, "unitsSpawnedOnDeath");
/*      */ 
/*      */       
/* 3416 */       l1.bs = ab.a(str1, "unitsSpawnedOnDeath_setToTeamOfLastAttacker", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3418 */       l1.eZ = ab.a(str1, "canReclaimResources", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3420 */       l1.fa = ab.a(l1, str1, "canReclaimResourcesOnlyWithTags", null);
/*      */       
/* 3422 */       l1.fb = ab.b(str1, "canReclaimResourcesNextSearchRange", Integer.valueOf(500)).intValue();
/*      */ 
/*      */ 
/*      */       
/* 3426 */       l1.fc = ab.a(l1, str1, "canReclaimUnitsOnlyWithTags", null);
/* 3427 */       l1.fd = ab.a(l1, str1, "canRepairUnitsOnlyWithTags", null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3433 */       if (l1.fc != null)
/*      */       {
/* 3435 */         if (!l1.aK && !l1.aJ)
/*      */         {
/* 3437 */           throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
/*      */         }
/*      */       }
/*      */       
/* 3441 */       if (l1.fd != null)
/*      */       {
/* 3443 */         if (!l1.aK && !l1.aJ)
/*      */         {
/* 3445 */           throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 3450 */       l1.eB = ab.b(str1, "maxTransportingUnits", Integer.valueOf(0)).intValue();
/* 3451 */       if (l1.eB < 0)
/*      */       {
/* 3453 */         throw new RuntimeException("maxTransportingUnits cannot be < 0");
/*      */       }
/*      */       
/* 3456 */       l1.eC = ab.b(str1, "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0F)).floatValue();
/*      */       
/* 3458 */       l1.eE = h.a(ab.b(str1, "transportUnitsRequireTag", null));
/*      */ 
/*      */       
/* 3461 */       String str19 = ab.b(str1, "transportUnitsRequireMovementType", null);
/*      */       
/* 3463 */       if (str19 != null)
/*      */       {
/* 3465 */         for (String str : str19.split(",")) {
/*      */           
/* 3467 */           str = str.trim();
/*      */           
/* 3469 */           l1.eF.add(ah.a(str, "transportUnitsRequireMovementType"));
/*      */         } 
/*      */       }
/*      */       
/* 3473 */       l1.eD = ab.a(str1, "transportUnitsEachUnitAlwaysUsesSingleSlot", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3475 */       l1.eG = ab.a(str1, "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf((l1.eF.size() == 0))).booleanValue();
/*      */ 
/*      */       
/* 3478 */       l1.eH = ab.a(str1, "transportUnitsBlockOtherTransports", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 3480 */       l1.eJ = ab.a(l1, str1, "transportUnitsKeepBuiltUnits", (LogicBoolean)LogicBoolean.falseBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3486 */       l1.eK = ab.a(l1, str1, "transportUnitsKillOnDeath", (LogicBoolean)LogicBoolean.trueBoolean);
/*      */       
/* 3488 */       l1.eL = ab.a(l1, str1, "transportUnitsKeepWaypoints", (LogicBoolean)LogicBoolean.falseBoolean);
/*      */ 
/*      */       
/* 3491 */       l1.eN = ab.a(str1, "transportUnitsHealBy", Float.valueOf(0.0F)).floatValue();
/*      */ 
/*      */ 
/*      */       
/* 3495 */       l1.eR = ab.a(l1, str1, "transportUnitsCanUnloadUnits", null);
/*      */       
/* 3497 */       if (l1.eR != null) {
/*      */ 
/*      */         
/* 3500 */         l1.eS = l1.eR;
/*      */       }
/*      */       else {
/*      */         
/* 3504 */         l1.eR = l.eP;
/* 3505 */         l1.eS = l.eQ;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3510 */       l1.eI = ab.a(str1, "transportUnitsAddUnloadOption", Boolean.valueOf((l1.eR != LogicBoolean.falseBoolean))).booleanValue();
/*      */ 
/*      */ 
/*      */       
/* 3514 */       l1.eM = ab.a(str1, "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(l1.eM)).booleanValue();
/*      */ 
/*      */       
/* 3517 */       l1.eO = ab.b(str1, "transportSlotsNeeded", Integer.valueOf(1)).intValue();
/*      */       
/*      */       byte b2;
/* 3520 */       for (b2 = -1; b2 <= 29; b2++) {
/*      */         
/* 3522 */         String str25 = "builtFrom_" + b2 + "_";
/*      */         
/* 3524 */         if (b2 == -1)
/*      */         {
/* 3526 */           str25 = "builtFrom_";
/*      */         }
/*      */         
/* 3529 */         String str26 = str25 + "name";
/*      */         
/* 3531 */         String str27 = ab.b(str1, str26, null);
/* 3532 */         if (str27 != null) {
/*      */ 
/*      */           
/* 3535 */           String[] arrayOfString = str27.split(",");
/* 3536 */           for (String str : arrayOfString) {
/*      */             
/* 3538 */             str = str.trim();
/*      */             
/* 3540 */             if (!str.equals("")) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 3545 */               p p = new p();
/* 3546 */               p.a = str;
/* 3547 */               p.b = ab.a(str1, str25 + "pos", Float.valueOf(999.0F)).floatValue();
/* 3548 */               p.c = ab.a(str1, str25 + "forceNano", Boolean.valueOf(false)).booleanValue();
/* 3549 */               p.d = "[" + str1 + "]" + str26;
/*      */ 
/*      */ 
/*      */               
/* 3553 */               p.f = ab.a(l1, str1, str25 + "isLocked", null);
/* 3554 */               p.g = a(ab, str1, str25 + "isLockedMessage", (String)null);
/* 3555 */               if (p.f == LogicBoolean.falseBoolean)
/*      */               {
/* 3557 */                 p.f = null;
/*      */               }
/*      */ 
/*      */               
/* 3561 */               if (!"NONE".equalsIgnoreCase(str))
/*      */               {
/* 3563 */                 l1.fQ.add(p);
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
/* 3574 */       for (b2 = 0; b2 <= 50; b2++) {
/*      */         
/* 3576 */         String str = ab.b(str1, "canBuild_" + b2 + "_name", null);
/* 3577 */         if (str != null) {
/*      */           
/* 3579 */           String str25 = "canBuild_" + b2 + "_";
/*      */           
/* 3581 */           b(l1, ab, str1, str25, false);
/*      */         } 
/*      */       } 
/*      */       
/* 3585 */       for (String str : ab.e("canBuild_"))
/*      */       {
/*      */         
/* 3588 */         b(l1, ab, str, "", true);
/*      */       }
/*      */ 
/*      */       
/* 3592 */       l1.eU = aj.a(l1, ab);
/*      */ 
/*      */       
/* 3595 */       String str20 = ab.e(str4, "movementType");
/*      */       
/* 3597 */       l1.eV = ah.a(str20, "movementType");
/*      */       
/* 3599 */       if (!l1.aw) {
/*      */         
/* 3601 */         l1.eW = l1.eV;
/*      */       }
/*      */       else {
/*      */         
/* 3605 */         l1.eW = ah.a;
/*      */       } 
/*      */       
/* 3608 */       Boolean bool1 = ab.a(str5, "useAsBuilder", null);
/*      */ 
/*      */       
/* 3611 */       l1.fh = ab.a(str5, "useAsAttacker", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */       
/* 3614 */       Boolean bool2 = ab.a(str1, "isBuilder", null);
/* 3615 */       if (bool2 == null) {
/*      */         
/* 3617 */         if (bool1 == null)
/*      */         {
/* 3619 */           bool2 = Boolean.valueOf(false);
/*      */         }
/*      */         else
/*      */         {
/* 3623 */           bool2 = bool1;
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 3628 */       else if (bool1 == null) {
/*      */         
/* 3630 */         bool1 = bool2;
/*      */       } 
/*      */ 
/*      */       
/* 3634 */       if (bool1 == null)
/*      */       {
/* 3636 */         bool1 = Boolean.valueOf(false);
/*      */       }
/*      */ 
/*      */       
/* 3640 */       l1.fe = bool2.booleanValue();
/* 3641 */       l1.ff = bool1.booleanValue();
/*      */       
/* 3643 */       if (!l1.fe)
/*      */       {
/* 3645 */         if (l1.ff == true)
/*      */         {
/* 3647 */           throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + l1.ff + " [core]isBuilder:" + l1.fe);
/*      */         }
/*      */       }
/*      */ 
/*      */       
/* 3652 */       if (l1.eZ)
/*      */       {
/* 3654 */         l1.fg = true;
/*      */       }
/*      */       
/* 3657 */       Boolean bool3 = ab.a(str5, "useAsHarvester", null);
/*      */       
/* 3659 */       if (bool3 != null)
/*      */       {
/* 3661 */         l1.fg = bool3.booleanValue();
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3668 */       Boolean bool4 = ab.a(str5, "useAsTransport", null);
/* 3669 */       if (bool4 == null) {
/*      */         
/* 3671 */         bool4 = Boolean.valueOf((l1.eB > 0 && !l1.ff && !l1.aw));
/*      */         
/* 3673 */         if (!l1.eI)
/*      */         {
/* 3675 */           bool4 = Boolean.valueOf(false);
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
/*      */ 
/*      */       
/* 3688 */       l1.fi = bool4.booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3693 */       if (l1.aw) {
/*      */         
/* 3695 */         l1.ah = c.q;
/*      */       }
/* 3697 */       else if (l1.eV == ah.d) {
/*      */         
/* 3699 */         l1.ah = b.n;
/*      */       }
/* 3701 */       else if (l1.eV == ah.e) {
/*      */         
/* 3703 */         l1.ah = f.q;
/*      */       }
/* 3705 */       else if (l1.eV == ah.f) {
/*      */         
/* 3707 */         if (l1.bY)
/*      */         {
/* 3709 */           l1.ah = j.dp;
/*      */         }
/* 3711 */         else if (l1.l())
/*      */         {
/* 3713 */           l1.ah = b.h;
/*      */         }
/*      */         else
/*      */         {
/* 3717 */           l1.ah = h.n;
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 3722 */       else if (l1.bY) {
/*      */         
/* 3724 */         l1.ah = j.dp;
/*      */       }
/* 3726 */       else if (l1.l()) {
/*      */         
/* 3728 */         l1.ah = b.h;
/*      */       }
/*      */       else {
/*      */         
/* 3732 */         l1.ah = j.do;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3739 */       e e2 = l1.a(ab, str2, "icon_zoomed_out", false);
/*      */ 
/*      */       
/* 3742 */       if (e2 != null)
/*      */       {
/* 3744 */         l1.ah = l1.a(e2, l1.U);
/*      */       }
/*      */       
/* 3747 */       if (ab.a(str2, "icon_zoomed_out_neverShow", Boolean.valueOf(false)).booleanValue())
/*      */       {
/* 3749 */         l1.ah = null;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 3754 */       l1.q = ab.a(str2, "showHealthBar", Boolean.valueOf(true)).booleanValue();
/* 3755 */       l1.r = ab.a(str2, "showEnergyBar", Boolean.valueOf(true)).booleanValue();
/* 3756 */       l1.s = ab.a(str2, "showTransportBar", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 3758 */       l1.t = ab.a(str2, "showShieldBar", Boolean.valueOf(true)).booleanValue();
/* 3759 */       l1.u = ab.a(str2, "showQueueBar", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3764 */       l1.eX = ab.a(str4, "slowDeathFall", Boolean.valueOf(false)).booleanValue();
/* 3765 */       l1.eY = ab.a(str4, "slowDeathFallSmoke", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 3767 */       l1.dz = ab.a(str4, "moveSpeed", Float.valueOf(1.0F)).floatValue() * l1.av;
/* 3768 */       l1.dA = ab.a(str4, "moveAccelerationSpeed", Float.valueOf(1.0F)).floatValue() * l1.av;
/* 3769 */       l1.dB = ab.a(str4, "moveDecelerationSpeed", Float.valueOf(1.0F)).floatValue() * l1.av;
/*      */ 
/*      */       
/* 3772 */       Boolean bool5 = ab.a(str4, "ignoreMoveOrders", null);
/*      */       
/* 3774 */       if (l1.aw)
/*      */       {
/* 3776 */         l1.dC = true;
/*      */       }
/*      */       
/* 3779 */       if (bool5 != null)
/*      */       {
/* 3781 */         if (bool5.booleanValue()) {
/*      */           
/* 3783 */           l1.dC = true;
/*      */           
/* 3785 */           if (l1.dz > 0.0F)
/*      */           {
/* 3787 */             throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
/*      */           
/*      */           }
/*      */         
/*      */         }
/* 3792 */         else if (l1.aw) {
/*      */           
/* 3794 */           throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3803 */       l1.dY = ab.a(str4, "moveYAxisScaling", Float.valueOf(1.0F)).floatValue();
/*      */       
/* 3805 */       if (l1.dY <= 0.0F)
/*      */       {
/* 3807 */         throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
/*      */       }
/*      */       
/* 3810 */       l1.dZ = 1.0F / l1.dY;
/*      */ 
/*      */       
/* 3813 */       l1.ea = ab.a(str4, "reverseSpeedPercentage", Float.valueOf(0.6F)).floatValue();
/*      */ 
/*      */       
/* 3816 */       String str21 = ab.b(str4, "landOnGround", "false");
/* 3817 */       if (str21.equalsIgnoreCase("false")) {
/*      */         
/* 3819 */         l1.dD = false;
/*      */       }
/* 3821 */       else if (str21.equalsIgnoreCase("onlyIdle")) {
/*      */         
/* 3823 */         l1.dD = true;
/* 3824 */         l1.dE = true;
/*      */       }
/* 3826 */       else if (str21.equalsIgnoreCase("true")) {
/*      */         
/* 3828 */         l1.dD = true;
/*      */       }
/*      */       else {
/*      */         
/* 3832 */         throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + str21);
/*      */       } 
/*      */       
/* 3835 */       float f8 = 0.0F;
/* 3836 */       float f9 = 0.0F;
/*      */       
/* 3838 */       if (l1.eV == ah.d) {
/*      */         
/* 3840 */         f8 = 35.0F;
/* 3841 */         f9 = 1.5F;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 3846 */       l1.dF = ab.a(str4, "startingHeightOffset", Float.valueOf(0.0F)).floatValue();
/*      */       
/* 3848 */       l1.dG = ab.a(str4, "targetHeight", Float.valueOf(f8)).floatValue();
/* 3849 */       l1.dH = ab.a(str4, "targetHeightDrift", Float.valueOf(f9)).floatValue();
/*      */ 
/*      */       
/* 3852 */       if (l1.dG > 80.0F)
/*      */       {
/* 3854 */         l1.v = true;
/*      */       }
/*      */       
/* 3857 */       l1.dI = ab.a(str4, "heightChangeRate", Float.valueOf(l1.dI)).floatValue();
/* 3858 */       l1.dJ = ab.a(str4, "fallingAcceleration", Float.valueOf(l1.dJ)).floatValue();
/*      */       
/* 3860 */       l1.dK = ab.a(str4, "fallingAccelerationDead", Float.valueOf(l1.dK)).floatValue();
/*      */       
/* 3862 */       l1.dL = ab.a(str4, "maxTurnSpeed", Float.valueOf(1.0F)).floatValue();
/* 3863 */       l1.ed = ab.a(str4, "turnAcceleration", Float.valueOf(1.0F)).floatValue();
/*      */ 
/*      */       
/* 3866 */       l1.dM = ab.a(str4, "moveSlidingMode", Boolean.valueOf(false)).booleanValue();
/* 3867 */       l1.dN = ab.a(str4, "moveIgnoringBody", Boolean.valueOf(false)).booleanValue();
/* 3868 */       l1.dO = ab.b(str4, "moveSlidingDir", Integer.valueOf(-1)).intValue();
/*      */       
/* 3870 */       l1.dX = ab.a(str4, "joinsGroupFormations", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */       
/* 3873 */       l1.dP = ab.a(str3, "turretSize", Float.valueOf(1.0F)).floatValue() * l1.av;
/* 3874 */       l1.dQ = ab.a(str3, "turretTurnSpeed", Float.valueOf(8.0F)).floatValue();
/*      */       
/* 3876 */       l1.dx = ab.a(str3, "turretRotateWithBody", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */       
/* 3879 */       String str22 = ab.b(str3, "attackMovement", "normal");
/*      */       
/* 3881 */       l1.dR = b.a;
/* 3882 */       if (str22.equalsIgnoreCase("normal"))
/*      */       {
/* 3884 */         l1.dR = b.a;
/*      */       }
/* 3886 */       if (str22.equalsIgnoreCase("strafing"))
/*      */       {
/* 3888 */         l1.dR = b.b;
/*      */       }
/* 3890 */       if (str22.equalsIgnoreCase("bomber"))
/*      */       {
/* 3892 */         l1.dR = b.d;
/*      */       }
/*      */ 
/*      */       
/* 3896 */       l1.dU = ab.a(str3, "disablePassiveTargeting", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3899 */       l1.dV = ab.a(str3, "stopTargetingAfterFiring", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3901 */       l1.dW = ab.a(str3, "turretMultiTargeting", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 3903 */       l1.dS = ab.a(str3, "attackMovementSpeed", Float.valueOf(1.0F)).floatValue();
/* 3904 */       l1.dT = ab.a(str3, "attackMovementSpread", Float.valueOf(1.0F)).floatValue();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3909 */       Float float_1 = ab.a(str3, "maxAttackRange", null);
/*      */ 
/*      */       
/* 3912 */       if (float_1 != null) {
/*      */         
/* 3914 */         bool6 = true;
/* 3915 */         l1.du = float_1.floatValue() * l1.av;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 3920 */         bool6 = false;
/* 3921 */         l1.du = 100.0F * l1.av;
/*      */       } 
/*      */       
/* 3924 */       l1.eo = ab.a(str3, "aimOffsetSpread", Float.valueOf(0.6F)).floatValue();
/*      */ 
/*      */       
/* 3927 */       l1.dy = ab.b(str3, "shootDelay", Float.valueOf(50.0F)).floatValue();
/*      */       
/* 3929 */       l1.dw = ab.a(str3, "showRangeUIGuide", null);
/*      */       
/* 3931 */       l1.eu = ab.a(str3, "isMelee", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 3934 */       l1.ev = 0.0F;
/*      */       
/* 3936 */       Float float_2 = ab.a(str3, "meleeEngangementDistance", null);
/*      */       
/* 3938 */       if (l1.eu) {
/*      */         
/* 3940 */         l1.ev = 250.0F;
/* 3941 */         if (float_2 != null)
/*      */         {
/* 3943 */           l1.ev = float_2.floatValue();
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 3948 */       else if (float_2 != null) {
/*      */         
/* 3950 */         throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
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
/* 3962 */       for (String str25 : ab.e("projectile_")) {
/*      */         
/* 3964 */         String str26 = str25.substring("projectile_".length());
/*      */         
/* 3966 */         if (l1.d(str26) != null)
/*      */         {
/* 3968 */           throw new RuntimeException("Two projectiles found with the same name:" + str26);
/*      */         }
/*      */         
/* 3971 */         am am = new am();
/* 3972 */         am.bf = str26;
/* 3973 */         am.bh = l1;
/*      */         
/* 3975 */         am.a(am, l1, ab, str25);
/*      */       } 
/*      */       
/* 3978 */       int i1 = l1.fH.size();
/* 3979 */       if (i1 < 1)
/*      */       {
/* 3981 */         i1 = 1;
/*      */       }
/*      */       
/* 3984 */       l1.fF = new am[i1];
/*      */       byte b3;
/* 3986 */       for (b3 = 0; b3 < l1.fH.size(); b3++) {
/*      */         
/* 3988 */         am am = l1.fH.get(b3);
/* 3989 */         am.bg = b3;
/* 3990 */         l1.fF[b3] = am;
/*      */       } 
/*      */ 
/*      */       
/* 3994 */       for (b3 = 0; b3 < l1.fF.length; b3++) {
/*      */         
/* 3996 */         am am = l1.fF[b3];
/* 3997 */         if (am != null) {
/*      */           
/* 3999 */           am.w *= l1.av;
/* 4000 */           am.at *= l1.av;
/* 4001 */           am.aE *= l1.av;
/*      */         } 
/*      */       } 
/*      */       
/* 4005 */       if (l1.fF[0] == null) {
/*      */         
/* 4007 */         am am = new am();
/* 4008 */         am.bg = 0;
/* 4009 */         am.bf = "1";
/* 4010 */         am.b = 10;
/*      */         
/* 4012 */         l1.fH.add(am);
/* 4013 */         l1.fF[0] = am;
/*      */       } 
/*      */ 
/*      */       
/* 4017 */       ArrayList<as> arrayList = l1.fG;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4022 */       for (String str25 : ab.e("turret_")) {
/*      */         
/* 4024 */         String str26 = str25.substring("turret_".length());
/*      */         
/* 4026 */         if (l1.c(str26) != null)
/*      */         {
/* 4028 */           throw new RuntimeException("Two turrets found with the same name:" + str26);
/*      */         }
/*      */         
/* 4031 */         as as = new as();
/* 4032 */         as.a = str26;
/* 4033 */         as.b = str25;
/*      */         
/* 4035 */         arrayList.add(as);
/*      */       } 
/*      */       
/* 4038 */       for (as as : arrayList)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 4047 */         as.a(as, l1, ab, as.b);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4081 */       if (arrayList.size() == 0) {
/*      */         
/* 4083 */         as as = new as();
/* 4084 */         as.f = 0.0F;
/* 4085 */         as.g = 0.0F;
/* 4086 */         as.a = "1";
/*      */         
/* 4088 */         as.l = l1.dy;
/*      */ 
/*      */         
/* 4091 */         arrayList.add(as);
/*      */       } 
/*      */       
/*      */       int i2;
/* 4095 */       for (i2 = arrayList.size() - 1; i2 >= 0; i2--) {
/*      */         
/* 4097 */         if (arrayList.get(i2) != null)
/*      */         {
/* 4099 */           ((as)arrayList.get(i2)).e = i2;
/*      */         }
/*      */       } 
/*      */       
/* 4103 */       for (i2 = arrayList.size() - 1; i2 >= 0; i2--) {
/*      */         
/* 4105 */         if (arrayList.get(i2) != null) {
/*      */           
/* 4107 */           as as = arrayList.get(i2);
/*      */           
/* 4109 */           if (as.x != null) {
/*      */             
/* 4111 */             as.v = as.x.e;
/*      */ 
/*      */             
/* 4114 */             if (as.x.x != null)
/*      */             {
/* 4116 */               throw new RuntimeException(as.a + ": Turret can not be attached to turret that is also attached to a turret");
/*      */             }
/*      */           } 
/*      */ 
/*      */           
/* 4121 */           if (as.y != null)
/*      */           {
/* 4123 */             as.w = as.y.e;
/*      */           }
/*      */           
/* 4126 */           if (as.V < 0.0F)
/*      */           {
/* 4128 */             as.V = as.U;
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 4134 */       if (arrayList.size() > 31)
/*      */       {
/* 4136 */         throw new RuntimeException("Turret max count per unit is: 31");
/*      */       }
/*      */ 
/*      */       
/* 4140 */       l1.fE = arrayList.<as>toArray(new as[0]);
/*      */ 
/*      */       
/* 4143 */       l1.dv = l1.du;
/*      */ 
/*      */       
/* 4146 */       float f10 = -1.0F;
/*      */       
/* 4148 */       boolean bool7 = true;
/* 4149 */       boolean bool8 = false;
/*      */       
/* 4151 */       for (as as : arrayList) {
/*      */ 
/*      */         
/* 4154 */         as.W *= l1.av;
/*      */         
/* 4156 */         as.f *= l1.av;
/* 4157 */         as.g *= l1.av;
/*      */ 
/*      */ 
/*      */         
/* 4161 */         as.X *= l1.av;
/*      */ 
/*      */         
/* 4164 */         as.Y *= l1.av;
/*      */         
/* 4166 */         boolean bool11 = false;
/*      */ 
/*      */         
/* 4169 */         if (as.A)
/*      */         {
/* 4171 */           if (as.aa >= 99999.0F) {
/*      */             
/* 4173 */             bool7 = false;
/*      */           }
/*      */           else {
/*      */             
/* 4177 */             bool8 = true;
/*      */             
/* 4179 */             if (l1.dv > as.aa)
/*      */             {
/* 4181 */               l1.dv = as.aa;
/*      */             }
/*      */             
/* 4184 */             if (f10 < as.aa)
/*      */             {
/* 4186 */               f10 = as.aa;
/*      */             }
/*      */ 
/*      */             
/* 4190 */             if (f.c(as.aa - l1.du) > 5.0F) {
/*      */               
/* 4192 */               boolean bool12 = false;
/*      */               
/* 4194 */               for (w w : l1.n) {
/*      */                 
/* 4196 */                 if (f.c(as.aa - w.a) < 5.0F)
/*      */                 {
/* 4198 */                   bool12 = true;
/*      */                 }
/*      */               } 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 4205 */               if (!bool12)
/*      */               {
/* 4207 */                 bool11 = true;
/*      */               }
/*      */             } 
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 4215 */         if (as.ab != null)
/*      */         {
/* 4217 */           bool11 = as.ab.booleanValue();
/*      */         }
/*      */ 
/*      */         
/* 4221 */         if (bool11) {
/*      */           
/* 4223 */           w w = new w();
/* 4224 */           w.a = as.aa;
/*      */           
/* 4226 */           l1.n.add(w);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4233 */       if (bool8)
/*      */       {
/* 4235 */         if (bool7)
/*      */         {
/* 4237 */           if (!bool6) {
/*      */             
/* 4239 */             l1.du = f10;
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 4244 */           else if (f10 < l1.du) {
/*      */             
/* 4246 */             throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
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
/* 4258 */       String str23 = ab.b(str3, "setMainTurretAs", null);
/*      */       
/* 4260 */       if (str23 != null) {
/*      */         
/* 4262 */         l1.dr = l1.c(str23);
/*      */         
/* 4264 */         if (l1.dr == null)
/*      */         {
/* 4266 */           throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + str23);
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/* 4271 */         l1.dr = l1.c("1");
/*      */         
/* 4273 */         if (l1.dr == null)
/*      */         {
/* 4275 */           l1.dr = l1.fE[0];
/*      */         }
/*      */       } 
/*      */       
/* 4279 */       if (ab.k(str1, "action_"))
/*      */       {
/* 4281 */         for (byte b5 = 0; b5 <= 50; b5++)
/*      */         {
/* 4283 */           a(l1, ab, str1, "action_" + b5 + "_", "" + b5, false, false);
/*      */         }
/*      */       }
/*      */       
/* 4287 */       for (String str25 : ab.e("action_")) {
/*      */         
/* 4289 */         String str26 = str25.substring("action_".length());
/*      */         
/* 4291 */         if (l1.e(str26) != null)
/*      */         {
/* 4293 */           throw new RuntimeException("Two actions found with the same name:" + str26);
/*      */         }
/*      */         
/* 4296 */         a(l1, ab, str25, "", str26, true, false);
/*      */       } 
/*      */ 
/*      */       
/* 4300 */       for (String str25 : ab.e("hiddenAction_")) {
/*      */         
/* 4302 */         String str26 = str25.substring("hiddenAction_".length());
/*      */         
/* 4304 */         if (l1.e(str26) != null)
/*      */         {
/* 4306 */           throw new RuntimeException("Two actions found with the same name:" + str26);
/*      */         }
/*      */         
/* 4309 */         a(l1, ab, str25, "", str26, true, true);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4315 */       ArrayList arrayList1 = new ArrayList();
/* 4316 */       ArrayList arrayList2 = new ArrayList();
/*      */ 
/*      */ 
/*      */       
/* 4320 */       for (byte b4 = 0; b4 <= 1; b4++) {
/*      */         
/* 4322 */         boolean bool11 = (b4 == 0) ? true : false;
/* 4323 */         ArrayList<af> arrayList4 = bool11 ? arrayList1 : arrayList2;
/*      */         
/* 4325 */         for (byte b5 = 1; b5 < 21; b5++) {
/*      */ 
/*      */           
/* 4328 */           String str = bool11 ? ("leg_" + b5) : ("arm_" + b5);
/*      */           
/* 4330 */           if (ab.g(str)) {
/*      */             
/* 4332 */             af af = new af();
/*      */             
/* 4334 */             af.a(af, l1, ab, str, bool11, arrayList4);
/*      */             
/* 4336 */             arrayList4.add(af);
/*      */           }
/*      */           else {
/*      */             
/* 4340 */             arrayList4.add(null);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 4346 */       ArrayList<af> arrayList3 = new ArrayList();
/* 4347 */       for (af af : arrayList1) {
/*      */         
/* 4349 */         if (af != null)
/*      */         {
/* 4351 */           arrayList3.add(af);
/*      */         }
/*      */       } 
/* 4354 */       for (af af : arrayList2) {
/*      */         
/* 4356 */         if (af != null)
/*      */         {
/* 4358 */           arrayList3.add(af);
/*      */         }
/*      */       } 
/*      */       
/* 4362 */       for (int i3 = arrayList3.size() - 1; i3 >= 0; i3--) {
/*      */         
/* 4364 */         af af = arrayList3.get(i3);
/* 4365 */         af.a = i3;
/*      */       } 
/*      */ 
/*      */       
/* 4369 */       l1.am = arrayList3.<af>toArray(new af[0]);
/*      */ 
/*      */       
/* 4372 */       if (l1.am.length > 0)
/*      */       {
/* 4374 */         l1.a(c.a);
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4380 */       for (f f : l1.dd)
/*      */       {
/* 4382 */         f.a(l1);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 4387 */       b(l1);
/*      */       
/* 4389 */       String str24 = ab.b(str1, "fireTurretXAtSelfOnDeath", null);
/*      */       
/* 4391 */       if (str24 != null && !"NONE".equalsIgnoreCase(str24)) {
/*      */         
/* 4393 */         as as = l1.c(str24);
/*      */         
/* 4395 */         if (as == null)
/*      */         {
/* 4397 */           throw new RuntimeException("Cannot find turret:" + str24 + " for [" + str1 + "]fireTurretXAtSelfOnDeath");
/*      */         }
/*      */         
/* 4400 */         l1.bq = as.e;
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
/* 4411 */       l1.aY = ab.a(str3, "dieOnAttack", Boolean.valueOf(false)).booleanValue();
/* 4412 */       l1.ba = ab.a(str3, "removeOnAttack", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 4415 */       l1.ee = ab.d(str3, "canAttack");
/*      */       
/* 4417 */       if (l1.ee) {
/*      */         
/* 4419 */         l1.ef = ab.a(l1, str3, "canAttackFlyingUnits");
/* 4420 */         l1.eg = ab.a(l1, str3, "canAttackLandUnits");
/* 4421 */         l1.eh = ab.a(l1, str3, "canAttackUnderwaterUnits");
/*      */       }
/*      */       else {
/*      */         
/* 4425 */         l1.ef = ab.a(l1, str3, "canAttackFlyingUnits", (LogicBoolean)LogicBoolean.falseBoolean);
/* 4426 */         l1.eg = ab.a(l1, str3, "canAttackLandUnits", (LogicBoolean)LogicBoolean.falseBoolean);
/* 4427 */         l1.eh = ab.a(l1, str3, "canAttackUnderwaterUnits", (LogicBoolean)LogicBoolean.falseBoolean);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4434 */       l1.ei = ab.a(l1, str3, "canAttackNotTouchingWaterUnits", null);
/* 4435 */       if (LogicBoolean.isStaticTrue(l1.ei))
/*      */       {
/* 4437 */         l1.ei = null;
/*      */       }
/*      */       
/* 4440 */       l1.ek = ab.a(l1, str3, "canOnlyAttackUnitsWithTags", null);
/* 4441 */       l1.el = ab.a(l1, str3, "canOnlyAttackUnitsWithoutTags", null);
/*      */       
/* 4443 */       if (l1.ek != null || l1.el != null)
/*      */       {
/* 4445 */         l1.ej = true;
/*      */       }
/*      */       
/* 4448 */       boolean bool9 = false;
/* 4449 */       boolean bool10 = false;
/* 4450 */       for (as as : arrayList) {
/*      */ 
/*      */         
/* 4453 */         if (as.N != null)
/*      */         {
/* 4455 */           if (as.N.a(l1.ek))
/*      */           {
/* 4457 */             as.N = null;
/*      */           }
/*      */         }
/*      */         
/* 4461 */         if (as.O != null)
/*      */         {
/* 4463 */           if (as.O.a(l1.el))
/*      */           {
/* 4465 */             as.O = null;
/*      */           }
/*      */         }
/*      */         
/* 4469 */         if (as.A) {
/*      */           
/* 4471 */           if (as.N != null || as.O != null) {
/*      */             
/* 4473 */             bool9 = true;
/*      */             
/*      */             continue;
/*      */           } 
/* 4477 */           bool10 = true;
/*      */         } 
/*      */       } 
/*      */       
/* 4481 */       if (bool9 && !bool10) {
/*      */         
/* 4483 */         l1.em = true;
/* 4484 */         l1.ej = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 4489 */       l1.en = ab.a(str3, "isFixedFiring", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4498 */       l1.fA = ab.a(str5, "lowPriorityTargetForOtherUnits", Boolean.valueOf(false)).booleanValue();
/* 4499 */       l1.fB = ab.a(str5, "notPassivelyTargetedByOtherUnits", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4508 */       if (l1.ee && l1.fB)
/*      */       {
/* 4510 */         throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
/*      */       }
/*      */       
/* 4513 */       l1.fk = ab.a(str5, "disableUse", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 4515 */       l1.fn = ab.a(str5, "buildPriority", Float.valueOf(0.05F)).floatValue();
/*      */       
/* 4517 */       l1.fo = ab.b(str5, "recommendedInEachBaseNum", Integer.valueOf(0)).intValue();
/* 4518 */       l1.fp = ab.a(str5, "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5F)).floatValue();
/*      */ 
/*      */ 
/*      */       
/* 4522 */       l1.fm = ab.b(str5, "maxEachBase", Integer.valueOf(f.b(2, l1.fo))).intValue();
/* 4523 */       l1.fl = ab.b(str5, "maxGlobal", Integer.valueOf(-1)).intValue();
/*      */       
/* 4525 */       if (l1.fm < l1.fo)
/*      */       {
/* 4527 */         throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
/*      */       }
/*      */ 
/*      */       
/* 4531 */       if (!l1.aw) {
/*      */         
/* 4533 */         if (ab.m(str5, "recommendedInEachBaseNum"))
/*      */         {
/* 4535 */           throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
/*      */         }
/* 4537 */         if (ab.m(str5, "recommendedInEachBasePriorityIfUnmet"))
/*      */         {
/* 4539 */           throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4546 */       l1.fs = ab.b(str5, "whenUsingAsHarvester_recommendedInEachBase", Integer.valueOf(-1)).intValue();
/* 4547 */       l1.ft = ab.b(str5, "whenUsingAsHarvester_recommendedGlobal", Integer.valueOf(-1)).intValue();
/* 4548 */       l1.fu = ab.a(str5, "whenUsingAsHarvester_includeOtherHarvesterCounts", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 4551 */       l1.fv = ab.a(l1, str5, "onlyUseAsHarvester_ifBaseHasUnitTagged", null);
/*      */ 
/*      */       
/* 4554 */       l1.fq = ab.a(str5, "nonInBaseExtraPriority", Float.valueOf(0.04F)).floatValue();
/* 4555 */       l1.fq = ab.a(str5, "noneInBaseExtraPriority", Float.valueOf(l1.fq)).floatValue();
/*      */ 
/*      */       
/* 4558 */       l1.fr = ab.a(str5, "nonGlobalExtraPriority", Float.valueOf(0.0F)).floatValue();
/* 4559 */       l1.fr = ab.a(str5, "noneGlobalExtraPriority", Float.valueOf(l1.fr)).floatValue();
/*      */       
/* 4561 */       l1.fw = ab.b(str5, "upgradedFrom", null);
/*      */ 
/*      */ 
/*      */       
/* 4565 */       Float float_3 = ab.a(str5, "ai_upgradePriority", null);
/* 4566 */       if (float_3 != null)
/*      */       {
/* 4568 */         if (float_3.floatValue() != -1.0F)
/*      */         {
/*      */ 
/*      */           
/* 4572 */           if (float_3.floatValue() >= 0.0F && float_3.floatValue() <= 1.0F) {
/*      */             
/* 4574 */             l1.fy = float_3.floatValue() * 100.0F;
/*      */           }
/*      */           else {
/*      */             
/* 4578 */             throw new RuntimeException("[ai]ai_upgradePriority: " + l1.fy + " must be between 0-1 or -1 for default");
/*      */           } 
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 4585 */       if (l1.ee)
/*      */       {
/*      */         
/* 4588 */         for (byte b5 = 0; b5 < l1.fE.length; b5++) {
/*      */           
/* 4590 */           as as = l1.fE[b5];
/* 4591 */           if (as.A && as.an == null) {
/*      */ 
/*      */             
/* 4594 */             if (as.l > 140.0F)
/*      */             {
/*      */               
/* 4597 */               if (l1.eb == -1 || (l1.fE[l1.eb]).l < as.l)
/*      */               {
/* 4599 */                 l1.eb = b5;
/*      */               }
/*      */             }
/*      */             
/* 4603 */             if (as.m > 80.0F)
/*      */             {
/* 4605 */               l1.ec = b5;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4615 */       if (l1.cp == -2)
/*      */       {
/*      */         
/* 4618 */         if (l1.eV == ah.d) {
/*      */           
/* 4620 */           l1.cp = 5;
/*      */         }
/* 4622 */         else if (l1.j()) {
/*      */ 
/*      */           
/* 4625 */           if (l1.aa != null)
/*      */           {
/* 4627 */             l1.cp = 3;
/*      */           }
/*      */           else
/*      */           {
/* 4631 */             l1.cp = 2;
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/* 4637 */         else if (l1.dG < -2.0F) {
/*      */           
/* 4639 */           l1.cp = 1;
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 4644 */         else if (l1.eB > 0) {
/*      */           
/* 4646 */           l1.cp = 3;
/*      */         }
/*      */         else {
/*      */           
/* 4650 */           l1.cp = 2;
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
/* 4661 */       if (l1.fK.size() > 0)
/*      */       {
/* 4663 */         l1.fL = (r[])l1.fK.toArray((Object[])new r[0]);
/*      */       }
/*      */ 
/*      */       
/* 4667 */       if (l1.fZ != null && l1.fZ.size() > 0)
/*      */       {
/* 4669 */         for (s s : l1.fZ)
/*      */         {
/* 4671 */           s.a(l1);
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 4677 */       ab.a();
/*      */       
/* 4679 */       for (com.corrodinggames.rts.gameFramework.utility.ac ac1 : ab.d) {
/*      */         
/* 4681 */         if (ac1.a() != null)
/*      */         {
/* 4683 */           if (ac1.a().startsWith("hiddenAction_") || ac1.a().startsWith("canBuild_"))
/*      */           {
/* 4685 */             throw new RuntimeException("Error [" + ac1.a() + "]" + ac1.b() + " has been repeated");
/*      */           }
/*      */         }
/*      */         
/* 4689 */         String str = "Repeated key " + ac1;
/*      */         
/* 4691 */         l1.o(str);
/*      */         
/* 4693 */         if (l1.J >= 1) {
/*      */           
/* 4695 */           l.d("Converting warning to error (meta.strictLevel=" + l1.J + ")");
/* 4696 */           throw new at(str);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 4701 */       for (String str25 : ab.e) {
/*      */         
/* 4703 */         String str26 = "Skipping line, unexpected format: '" + str25 + "'";
/*      */         
/* 4705 */         l1.o(str26);
/*      */         
/* 4707 */         if (l1.J >= 1) {
/*      */           
/* 4709 */           l.d("Converting warning to error (meta.strictLevel=" + l1.J + ")");
/* 4710 */           throw new at(str26);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 4715 */       if (paramb != null)
/*      */       {
/* 4717 */         paramb.p++;
/*      */       }
/*      */       
/* 4720 */       synchronized (l.c) {
/*      */         
/* 4722 */         l.c.add(l1);
/*      */       } 
/*      */       
/* 4725 */       return l1;
/*      */     
/*      */     }
/* 4728 */     catch (RuntimeException runtimeException) {
/*      */       
/* 4730 */       a(paramString1, runtimeException, paramb);
/* 4731 */       return null;
/*      */     }
/* 4733 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/* 4735 */       j++;
/* 4736 */       a(paramString1, new RuntimeException(outOfMemoryError), paramb);
/* 4737 */       return null;
/*      */     }
/* 4739 */     catch (at at) {
/*      */       
/* 4741 */       a(paramString1, at, paramb);
/* 4742 */       return null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 4749 */   static String n = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(String paramString, Exception paramException, al paramal) {
/* 4756 */     b b1 = null;
/* 4757 */     if (paramal instanceof l) {
/*      */       
/* 4759 */       l l = (l)paramal;
/* 4760 */       b1 = l.B;
/*      */     } 
/* 4762 */     a(paramString, paramException, b1);
/*      */   }
/*      */   
/*      */   public static void a(String paramString, Exception paramException, b paramb) {
/*      */     String str2;
/* 4767 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/* 4771 */     l.b("Error while loading unit:" + paramString);
/*      */     
/* 4773 */     paramException.printStackTrace();
/*      */     
/* 4775 */     if (paramString == null)
/*      */     {
/* 4777 */       paramString = "<null>";
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 4782 */     if (paramException instanceof at) {
/*      */       
/* 4784 */       str1 = paramException.getMessage();
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/* 4790 */       str1 = f.b(paramException);
/*      */     } 
/*      */     
/* 4793 */     String str1 = str1.replace(paramString + ": ", "");
/* 4794 */     str1 = str1.replace(paramString, "");
/*      */ 
/*      */     
/* 4797 */     if (paramb != null) {
/*      */       
/* 4799 */       str2 = paramb.f;
/*      */       
/* 4801 */       l.d("baseUnitPath:" + str2);
/* 4802 */       l.d("customUnit:" + paramString);
/*      */ 
/*      */       
/* 4805 */       if (paramString.startsWith(str2)) {
/*      */         
/* 4807 */         paramString = paramString.substring(str2.length());
/*      */         
/* 4809 */         if (paramString.startsWith("/"))
/*      */         {
/* 4811 */           paramString = paramString.substring(1);
/*      */         }
/*      */         
/* 4814 */         if (paramString.startsWith("\\"))
/*      */         {
/* 4816 */           paramString = paramString.substring(1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 4821 */       paramString = paramString + " (in mod " + paramb.a() + ")";
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 4826 */     if (paramb != null) {
/*      */       
/* 4828 */       str2 = "Error loading unit: " + paramString + ": \n" + str1;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 4833 */     else if (str1.contains("Error loading core unit")) {
/*      */       
/* 4835 */       str2 = str1;
/*      */     }
/*      */     else {
/*      */       
/* 4839 */       str2 = "Error loading core unit: " + paramString + ": \n" + str1 + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4848 */     if (paramException instanceof at) {
/*      */       
/* 4850 */       at at = (at)paramException;
/* 4851 */       if (at.b != null || at.c != null)
/*      */       {
/* 4853 */         str2 = str2 + " (section:" + at.b + ", key:" + at.c + ")";
/*      */       }
/*      */     } 
/*      */     
/* 4857 */     boolean bool = false;
/* 4858 */     if (paramb != null)
/*      */     {
/* 4860 */       bool = paramb.c;
/*      */     }
/*      */     
/* 4863 */     if (!bool);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4872 */     if (n != null)
/*      */     {
/* 4874 */       n = str2;
/*      */     }
/*      */     
/* 4877 */     if (paramb != null) {
/*      */ 
/*      */ 
/*      */       
/* 4881 */       paramb.a(str2);
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */         
/* 4888 */         Thread.sleep(2L);
/*      */       }
/* 4890 */       catch (InterruptedException interruptedException) {}
/*      */ 
/*      */       
/* 4893 */       throw new RuntimeException(str2, paramException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void b(l paraml, ab paramab, String paramString1, String paramString2, boolean paramBoolean) {
/* 4903 */     String str = paramab.b(paramString1, paramString2 + "name", null);
/*      */     
/* 4905 */     if (str == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 4910 */     String[] arrayOfString = str.split(",");
/* 4911 */     for (String str1 : arrayOfString) {
/*      */       
/* 4913 */       str1 = str1.trim();
/*      */       
/* 4915 */       c c = new c();
/* 4916 */       c.j = str1;
/*      */       
/* 4918 */       c.m = paramab.a(paramString1, paramString2 + "extraLagHidingInUI", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 4920 */       c.n = paramab.a(paramString1, paramString2 + "pos", Float.valueOf(999.0F)).floatValue();
/* 4921 */       c.az = paramab.b(paramString1, paramString2 + "tech", Integer.valueOf(1)).intValue();
/* 4922 */       c.aA = paramab.a(paramString1, paramString2 + "forceNano", Boolean.valueOf(false)).booleanValue();
/* 4923 */       c.aB = paramab.b(paramString1, paramString2 + "type", null);
/*      */       
/* 4925 */       c.o = g.a(paraml, paramab, paramString1, paramString2 + "price", (g)null);
/*      */ 
/*      */       
/* 4928 */       c.av = paramab.a(paraml, paramString1, paramString2 + "isGuiBlinking", null);
/*      */       
/* 4930 */       c.r = paramab.a(paraml, paramString1, paramString2 + "isVisible", null);
/*      */ 
/*      */       
/* 4933 */       c.u = paramab.a(paraml, paramString1, paramString2 + "isLocked", null);
/* 4934 */       c.v = a(paramab, paramString1, paramString2 + "isLockedMessage", (String)null);
/* 4935 */       if (c.u == LogicBoolean.falseBoolean)
/*      */       {
/* 4937 */         c.u = null;
/*      */       }
/*      */       
/* 4940 */       c.w = paramab.a(paraml, paramString1, paramString2 + "isLockedAlt", null);
/* 4941 */       c.x = a(paramab, paramString1, paramString2 + "isLockedAltMessage", (String)null);
/* 4942 */       if (c.w == LogicBoolean.falseBoolean)
/*      */       {
/* 4944 */         c.w = null;
/*      */       }
/*      */       
/* 4947 */       c.y = paramab.a(paraml, paramString1, paramString2 + "isLockedAlt2", null);
/* 4948 */       c.z = a(paramab, paramString1, paramString2 + "isLockedAlt2Message", (String)null);
/* 4949 */       if (c.y == LogicBoolean.falseBoolean)
/*      */       {
/* 4951 */         c.y = null;
/*      */       }
/*      */       
/* 4954 */       g g = g.a(paraml, paramab, paramString1, paramString2 + "addResources", true);
/* 4955 */       if (g != null && g.c())
/*      */       {
/* 4957 */         c.Y = g;
/*      */       }
/*      */       
/* 4960 */       c.aC = e.a;
/*      */       
/* 4962 */       if (!"NONE".equalsIgnoreCase(str1))
/*      */       {
/* 4964 */         paraml.fR.add(c);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(l paraml, ab paramab, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2) {
/* 4974 */     c c = new c();
/*      */ 
/*      */     
/* 4977 */     String str1 = paramab.b(paramString1, paramString2 + "convertTo", null);
/*      */     
/* 4979 */     String str2 = paramab.b(paramString1, paramString2 + "whenBuilding_temporarilyConvertTo", null);
/*      */ 
/*      */     
/* 4982 */     Float float_ = paramab.a(paramString1, paramString2 + "addEnergy", null);
/*      */     
/* 4984 */     g g1 = g.a(paraml, paramab, paramString1, paramString2 + "addResources", true);
/* 4985 */     paraml.a(g1);
/*      */     
/* 4987 */     g g2 = g.a(paraml, paramab, paramString1, paramString2 + "addResourcesScaledByAIHandicaps", true);
/* 4988 */     paraml.a(g2);
/*      */ 
/*      */     
/* 4991 */     String str3 = paramab.b(paramString1, paramString2 + "fireTurretXAtGround", null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4999 */     LogicBoolean logicBoolean1 = paramab.a(paraml, paramString1, paramString2 + "alsoTriggerOrQueueActionConditional", null);
/*      */     
/* 5001 */     String str4 = paramab.b(paramString1, paramString2 + "alsoTriggerAction", null);
/* 5002 */     String str5 = paramab.b(paramString1, paramString2 + "alsoQueueAction", null);
/* 5003 */     String str6 = paramab.b(paramString1, paramString2 + "spawnEffects", null);
/* 5004 */     String str7 = paramab.b(paramString1, paramString2 + "spawnEffectsOnQueue", null);
/*      */     
/* 5006 */     String str8 = paramab.b(paramString1, paramString2 + "playSoundAtUnit", null);
/* 5007 */     String str9 = paramab.b(paramString1, paramString2 + "playSoundGlobally", null);
/* 5008 */     String str10 = paramab.b(paramString1, paramString2 + "playSoundToPlayer", null);
/* 5009 */     String str11 = paramab.b(paramString1, paramString2 + "playSoundToPlayerOnQueue", null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5016 */     m.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */ 
/*      */ 
/*      */     
/* 5020 */     e.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */ 
/*      */     
/* 5023 */     a.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5025 */     i.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5027 */     b.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5029 */     d.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5031 */     j.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5033 */     g.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5035 */     k.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5037 */     f.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */     
/* 5039 */     h.a(paraml, paramab, paramString1, paramString2, c, paramString3, paramBoolean1);
/*      */ 
/*      */     
/* 5042 */     LogicBoolean logicBoolean2 = paramab.a(paraml, paramString1, paramString2 + "resetCustomTimer", null);
/*      */ 
/*      */     
/* 5045 */     boolean bool = false;
/*      */     
/* 5047 */     if (paramBoolean1) {
/*      */       
/* 5049 */       bool = true;
/*      */     }
/*      */     else {
/*      */       
/* 5053 */       if (str1 != null || str2 != null || float_ != null || str3 != null)
/*      */       {
/* 5055 */         bool = true;
/*      */       }
/*      */       
/* 5058 */       if (g1.c() || g2.c())
/*      */       {
/* 5060 */         bool = true;
/*      */       }
/*      */       
/* 5063 */       if (str4 != null || str5 != null || str6 != null)
/*      */       {
/* 5065 */         bool = true;
/*      */       }
/*      */       
/* 5068 */       if (str8 != null || str9 != null || str10 != null || str11 != null)
/*      */       {
/* 5070 */         bool = true;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 5075 */       if (c.W.size() > 0)
/*      */       {
/* 5077 */         bool = true;
/*      */       }
/*      */     } 
/*      */     
/* 5081 */     if (bool) {
/*      */ 
/*      */       
/* 5084 */       if ("NONE".equalsIgnoreCase(str1))
/*      */       {
/* 5086 */         str1 = null;
/*      */       }
/*      */       
/* 5089 */       if ("NONE".equalsIgnoreCase(str2))
/*      */       {
/* 5091 */         str2 = null;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5097 */       if (str3 != null && str3.equalsIgnoreCase("NONE"))
/*      */       {
/* 5099 */         str3 = null;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5106 */       c.a = paraml.fR.size();
/*      */       
/* 5108 */       c.b = paramString3;
/*      */       
/* 5110 */       c.m = paramab.a(paramString1, paramString2 + "extraLagHidingInUI", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 5112 */       c.n = paramab.a(paramString1, paramString2 + "pos", Float.valueOf(999.0F)).floatValue();
/*      */ 
/*      */ 
/*      */       
/* 5116 */       c.o = g.a(paraml, paramab, paramString1, paramString2 + "price", true);
/*      */ 
/*      */       
/* 5119 */       paraml.a(c.o);
/*      */ 
/*      */       
/* 5122 */       c.F = paramab.a(paramString1, paramString2 + "highPriorityQueue", Boolean.valueOf(false)).booleanValue();
/* 5123 */       c.G = paramab.a(paramString1, paramString2 + "onlyOneUnitAtATime", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */       
/* 5126 */       c.H = paramab.a(paramString1, paramString2 + "canPlayerCancel", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */       
/* 5129 */       c.J = paramab.a(paramString1, paramString2 + "alwaysSinglePress", Boolean.valueOf(false)).booleanValue();
/*      */       
/* 5131 */       c.I = paramab.a(paramString1, paramString2 + "allowMultipleInQueue", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 5133 */       if (!c.H && !c.I && c.J)
/*      */       {
/* 5135 */         c.K = true;
/*      */       }
/*      */       
/* 5138 */       if (!c.H) {
/*      */         
/* 5140 */         c.i = u.a;
/*      */       }
/*      */       else {
/*      */         
/* 5144 */         c.i = u.c;
/*      */       } 
/*      */ 
/*      */       
/* 5148 */       c.p = paramab.a(paraml, paramString1, paramString2 + "requireConditional", null);
/*      */ 
/*      */       
/* 5151 */       c.q = paramab.a(paraml, paramString1, paramString2 + "isActive", null);
/*      */ 
/*      */ 
/*      */       
/* 5155 */       c.r = paramab.a(paraml, paramString1, paramString2 + "isVisible", null);
/*      */ 
/*      */       
/* 5158 */       c.t = paramab.a(paramString1, paramString2 + "isAlsoViewableByEnemies", Boolean.valueOf(false)).booleanValue();
/* 5159 */       c.s = paramab.a(paramString1, paramString2 + "isAlsoViewableByAllies", Boolean.valueOf(c.t)).booleanValue();
/*      */ 
/*      */       
/* 5162 */       if (paramBoolean2) {
/*      */         
/* 5164 */         if (c.r != null && !LogicBoolean.isStaticFalse(c.r))
/*      */         {
/* 5166 */           throw new RuntimeException("[" + paramString1 + "]isVisible doesn't make sense to use in hidden actions");
/*      */         }
/*      */         
/* 5169 */         c.r = (LogicBoolean)LogicBoolean.falseBoolean;
/*      */       } 
/*      */ 
/*      */       
/* 5173 */       c.u = paramab.a(paraml, paramString1, paramString2 + "isLocked", null);
/* 5174 */       c.v = a(paramab, paramString1, paramString2 + "isLockedMessage", (String)null);
/* 5175 */       if (c.u == LogicBoolean.falseBoolean)
/*      */       {
/* 5177 */         c.u = null;
/*      */       }
/*      */       
/* 5180 */       c.w = paramab.a(paraml, paramString1, paramString2 + "isLockedAlt", null);
/* 5181 */       c.x = a(paramab, paramString1, paramString2 + "isLockedAltMessage", (String)null);
/* 5182 */       if (c.w == LogicBoolean.falseBoolean)
/*      */       {
/* 5184 */         c.w = null;
/*      */       }
/*      */       
/* 5187 */       c.y = paramab.a(paraml, paramString1, paramString2 + "isLockedAlt2", null);
/* 5188 */       c.z = a(paramab, paramString1, paramString2 + "isLockedAlt2Message", (String)null);
/* 5189 */       if (c.y == LogicBoolean.falseBoolean)
/*      */       {
/* 5191 */         c.y = null;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5199 */       c.A = LogicBoolean.create(paraml, paramab.b(paramString1, paramString2 + "ai_isHighPriority", null), null);
/*      */       
/* 5201 */       if (c.A == LogicBoolean.falseBoolean)
/*      */       {
/* 5203 */         c.A = null;
/*      */       }
/*      */       
/* 5206 */       if (c.A != null)
/*      */       {
/* 5208 */         paraml.fx = true;
/*      */       }
/*      */       
/* 5211 */       c.B = paramab.a(paraml, paramString1, paramString2 + "ai_isDisabled", (LogicBoolean)LogicBoolean.falseBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5217 */       c.E = paraml.a(paramab.b(paramString1, paramString2 + "guiBuildUnit", null), paramString2 + "guiBuildUnit", paramString1);
/*      */       
/* 5219 */       if (c.E != null) {
/*      */         
/* 5221 */         c.i = u.b;
/*      */         
/* 5223 */         if (str1 != null)
/*      */         {
/* 5225 */           throw new RuntimeException("[" + paramString1 + "]guiBuildUnit and convertTo cannot currently be used the same action");
/*      */         }
/*      */       } 
/*      */       
/* 5229 */       c.D = paraml.a(paramab.b(paramString1, paramString2 + "ai_considerSameAsBuilding", null), paramString2 + "ai_considerSameAsBuilding", paramString1);
/*      */ 
/*      */       
/* 5232 */       c.av = paramab.a(paraml, paramString1, paramString2 + "isGuiBlinking", null);
/*      */       
/* 5234 */       c.ao = a(paraml.x, paramab.b(paramString1, paramString2 + "iconImage", "NONE"), paraml.T, paraml, paramString1, paramString2 + "iconImage");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5241 */       c.ar = paramab.a(paraml, paramString1, paramString2 + "iconExtraIsVisible", null);
/*      */       
/* 5243 */       if (c.ar == LogicBoolean.trueBoolean)
/*      */       {
/* 5245 */         c.ar = null;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 5250 */       c.ap = paraml.a(paramab, paramString1, paramString2 + "iconExtraImage");
/*      */ 
/*      */       
/* 5253 */       c.aq = paramab.a(paramString1, paramString2 + "iconExtraColor", Integer.valueOf(Color.a(100, 255, 255, 255))).intValue();
/*      */ 
/*      */ 
/*      */       
/* 5257 */       c.as = UnitReference.parseUnitTypeOrReferenceFromConf(paraml, paramab, paramString1, paramString2 + "unitShownInUI", null);
/*      */ 
/*      */       
/* 5260 */       if (c.as != null && c.ao != null)
/*      */       {
/* 5262 */         throw new RuntimeException("[" + paramString1 + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
/*      */       }
/*      */       
/* 5265 */       c.at = paramab.a(paramString1, paramString2 + "unitShownInUIWithHpBar", Boolean.valueOf(true)).booleanValue();
/*      */       
/* 5267 */       c.au = paramab.a(paramString1, paramString2 + "unitShownInUIWithProgressBar", Boolean.valueOf(true)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5275 */       c.aw = (t)paramab.a(paramString1, paramString2 + "displayType", (Enum)c.aw, t.class);
/*      */       
/* 5277 */       c.ay = paramab.a(paramString1, paramString2 + "displayRemainingStockpile", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5293 */       c.c = a(paramab, paramString1, paramString2 + "text", "");
/*      */ 
/*      */       
/* 5296 */       c.d = UnitReference.parseUnitTypeOrReferenceFromConf(paraml, paramab, paramString1, paramString2 + "textAddUnitName", null);
/*      */ 
/*      */       
/* 5299 */       c.g = a(paramab, paramString1, paramString2 + "textPostFix", (String)null);
/*      */ 
/*      */       
/* 5302 */       c.e = UnitReference.parseUnitTypeOrReferenceFromConf(paraml, paramab, paramString1, paramString2 + "descriptionAddFromUnit", null);
/*      */ 
/*      */       
/* 5305 */       c.f = UnitReference.parseUnitTypeOrReferenceFromConf(paraml, paramab, paramString1, paramString2 + "descriptionAddUnitStats", null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5327 */       c.h = a(paramab, paramString1, paramString2 + "description", "");
/*      */ 
/*      */ 
/*      */       
/* 5331 */       c.M = paramab.d(paramString1, paramString2 + "buildSpeed", Float.valueOf(c.M)).floatValue();
/*      */       
/* 5333 */       if (c.M == 0.0F)
/*      */       {
/* 5335 */         c.M = 50.0F;
/*      */       }
/*      */ 
/*      */       
/* 5339 */       c.N = paramab.a(paramString1, paramString2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c.N)).booleanValue();
/*      */ 
/*      */       
/* 5342 */       boolean bool1 = false;
/*      */ 
/*      */ 
/*      */       
/* 5346 */       c.O = paramab.a(paramString1, paramString2 + "whenBuilding_cannotMove", Boolean.valueOf(c.O)).booleanValue();
/* 5347 */       c.P = paraml.a(paramab.b(paramString1, paramString2 + "whenBuilding_playAnimation", null), c.P);
/* 5348 */       c.Q = paramab.a(paramString1, paramString2 + "whenBuilding_rotateTo", c.Q);
/* 5349 */       c.R = paramab.a(paramString1, paramString2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c.R)).booleanValue();
/* 5350 */       c.S = paramab.a(paramString1, paramString2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c.S)).booleanValue();
/*      */       
/* 5352 */       c.T = paramab.a(paramString1, paramString2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c.T)).booleanValue();
/*      */ 
/*      */       
/* 5355 */       String str12 = paramab.b(paramString1, paramString2 + "whenBuilding_rotateTo_rotateTurretX", null);
/*      */       
/* 5357 */       if (str12 != null) {
/*      */         
/* 5359 */         c.U = paraml.c(str12);
/*      */         
/* 5361 */         if (c.U == null)
/*      */         {
/* 5363 */           throw new RuntimeException("Cannot find turret:" + str12 + " for [" + paramString1 + "]" + paramString2 + "whenBuilding_rotateTo_rotateTurretX");
/*      */         }
/*      */         
/* 5366 */         if (c.R)
/*      */         {
/* 5368 */           throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + paramString1 + "]" + paramString2 + "whenBuilding_rotateTo_rotateTurretX");
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5374 */       if (c.T && c.Q == null)
/*      */       {
/* 5376 */         c.Q = Float.valueOf(0.0F);
/*      */       }
/*      */ 
/*      */       
/* 5380 */       c.V = paramab.a(paraml, paramString1, paramString2 + "whenBuilding_triggerAction", null);
/*      */ 
/*      */       
/* 5383 */       c.L = paramab.a(paramString1, paramString2 + "convertTo_keepCurrentTags", Boolean.valueOf(c.L)).booleanValue();
/*      */ 
/*      */       
/* 5386 */       if (str2 != null && !"NONE".equalsIgnoreCase(str2)) {
/*      */         
/* 5388 */         c.k = paraml.a(str2, paramString2 + "whenBuilding_temporarilyConvertTo", paramString1);
/* 5389 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/* 5393 */       if (c.O || c.P != null || c.Q != null || c.k != null || c.V != null)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 5399 */         paraml.aU = true;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 5404 */       c.aC = e.b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5412 */       if (str1 != null && !"NONE".equalsIgnoreCase(str1)) {
/*      */ 
/*      */         
/* 5415 */         c.C = paraml.a(str1, paramString2 + "convertTo", paramString1);
/*      */ 
/*      */         
/* 5418 */         c.j = str1;
/* 5419 */         c.I = false;
/*      */         
/* 5421 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5426 */       if (float_ != null) {
/*      */         
/* 5428 */         c.X = float_;
/* 5429 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5434 */       if (g1 != null && g1.c()) {
/*      */         
/* 5436 */         c.Y = g1;
/* 5437 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/* 5441 */       if (g2 != null && g2.c()) {
/*      */         
/* 5443 */         c.Z = g2;
/* 5444 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/* 5448 */       c.ab = paramab.a(paramString1, paramString2 + "fireTurretXAtGround_withOffset", null);
/*      */ 
/*      */       
/* 5451 */       c.ad = paramab.b(paramString1, paramString2 + "fireTurretXAtGround_count", Integer.valueOf(1)).intValue();
/*      */ 
/*      */       
/* 5454 */       String str13 = paramab.b(paramString1, paramString2 + "fireTurretXAtGround_withProjectile", null);
/* 5455 */       if (str13 != null) {
/*      */ 
/*      */         
/* 5458 */         c.ac = paraml.d(str13);
/*      */         
/* 5460 */         if (c.ac == null)
/*      */         {
/* 5462 */           throw new RuntimeException("Cannot find projectile:" + str13 + " for [" + paramString1 + "]" + paramString2 + "fireTurretXAtGround_withProjectile");
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 5468 */       String str14 = paramab.b(paramString1, paramString2 + "fireTurretXAtGround_onlyOverPassableTileOf", null);
/*      */       
/* 5470 */       if (str14 != null)
/*      */       {
/* 5472 */         c.ae = ah.a(str14, paramString2 + "fireTurretXAtGround_overPassableTileOf");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5478 */       if (str3 != null) {
/*      */ 
/*      */ 
/*      */         
/* 5482 */         as as = paraml.c(str3);
/*      */         
/* 5484 */         if (as == null)
/*      */         {
/* 5486 */           throw new RuntimeException("Cannot find turret:" + str3 + " for [" + paramString1 + "]" + paramString2 + "fireTurretXAtGround");
/*      */         }
/*      */         
/* 5489 */         c.aa = Integer.valueOf(as.e);
/*      */ 
/*      */         
/* 5492 */         if (c.ab == null) {
/*      */           
/* 5494 */           c.i = u.g;
/*      */ 
/*      */           
/* 5497 */           if (c.E != null)
/*      */           {
/* 5499 */             throw new RuntimeException("[" + paramString1 + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/* 5504 */         bool1 = true;
/*      */       } 
/*      */       
/* 5507 */       c.af = logicBoolean1;
/*      */       
/* 5509 */       if (str4 != null && !"NONE".equalsIgnoreCase(str4)) {
/*      */ 
/*      */ 
/*      */         
/* 5513 */         c.ag = paraml.c(str4, "alsoTriggerAction", paramString1);
/*      */         
/* 5515 */         bool1 = true;
/*      */       } 
/*      */       
/* 5518 */       if (str5 != null && !"NONE".equalsIgnoreCase(str5)) {
/*      */ 
/*      */ 
/*      */         
/* 5522 */         c.ah = paraml.c(str5, "alsoQueueAction", paramString1);
/*      */ 
/*      */         
/* 5525 */         bool1 = true;
/*      */       } 
/*      */       
/* 5528 */       if (str6 != null) {
/*      */         
/* 5530 */         c.ai = paraml.a(str6, (x)null);
/* 5531 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/* 5535 */       if (str7 != null) {
/*      */         
/* 5537 */         c.aj = paraml.a(str7, (x)null);
/* 5538 */         bool1 = true;
/*      */       } 
/*      */       
/* 5541 */       if (str8 != null) {
/*      */         
/* 5543 */         c.ak = aq.a(paraml, str8);
/* 5544 */         bool1 = true;
/*      */       } 
/* 5546 */       if (str9 != null) {
/*      */         
/* 5548 */         c.al = aq.a(paraml, str9);
/* 5549 */         bool1 = true;
/*      */       } 
/* 5551 */       if (str10 != null) {
/*      */         
/* 5553 */         c.am = aq.a(paraml, str10);
/* 5554 */         bool1 = true;
/*      */       } 
/* 5556 */       if (str11 != null) {
/*      */         
/* 5558 */         c.an = aq.a(paraml, str11);
/* 5559 */         bool1 = true;
/*      */       } 
/*      */       
/* 5562 */       if (logicBoolean2 != null) {
/*      */         
/* 5564 */         c.ax = logicBoolean2;
/* 5565 */         bool1 = true;
/*      */       } 
/*      */ 
/*      */       
/* 5569 */       if (c.W.size() > 0)
/*      */       {
/* 5571 */         bool1 = true;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5593 */       ab ab1 = (ab)paramab.a(paramString1, paramString2 + "autoTriggerOnEvent", null, ab.class);
/*      */       
/* 5595 */       LogicBoolean logicBoolean = paramab.a(paraml, paramString1, paramString2 + "autoTrigger", null);
/*      */       
/* 5597 */       c.l = bool1;
/*      */ 
/*      */       
/* 5600 */       if (bool1 || c.r != null) {
/*      */ 
/*      */ 
/*      */         
/* 5604 */         if (logicBoolean != null && bool1) {
/*      */           
/* 5606 */           r r = new r();
/* 5607 */           r.a = logicBoolean;
/*      */ 
/*      */ 
/*      */           
/* 5611 */           r.b = new f(c, paraml.a(c.j, "[" + paramString1 + "]" + paramString2, paramString1));
/*      */           
/* 5613 */           paraml.fK.add(r);
/*      */         } 
/*      */ 
/*      */         
/* 5617 */         if (ab1 != null && bool1) {
/*      */           
/* 5619 */           aa aa = new aa();
/* 5620 */           aa.a = ab1;
/* 5621 */           aa.b = new f(c, paraml.a(c.j, "[" + paramString1 + "]" + paramString2, paramString1));
/* 5622 */           aa.c = paraml;
/* 5623 */           paraml.ga.add(aa);
/*      */         } 
/*      */ 
/*      */         
/* 5627 */         if (c.j != null && c.o != null && c.o.b > 0)
/*      */         {
/* 5629 */           paraml.fS = true;
/*      */         }
/*      */ 
/*      */         
/* 5633 */         paraml.fR.add(c);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static e a(String paramString1, String paramString2, boolean paramBoolean, l paraml, String paramString3, String paramString4) {
/*      */     try {
/* 5722 */       return a(paramString1, paramString2, paramBoolean, paraml);
/*      */     }
/* 5724 */     catch (RuntimeException runtimeException) {
/*      */       
/* 5726 */       throw new RuntimeException("[" + paramString3 + "]" + paramString4 + ": " + runtimeException.getMessage(), runtimeException);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static e a(String paramString1, String paramString2, boolean paramBoolean, l paraml) {
/*      */     e e2;
/* 5732 */     if (paramString2 == null)
/*      */     {
/* 5734 */       return null;
/*      */     }
/*      */     
/* 5737 */     if (paramString2.equalsIgnoreCase("NONE"))
/*      */     {
/* 5739 */       return null;
/*      */     }
/*      */     
/* 5742 */     if (paramString2.equals(""))
/*      */     {
/* 5744 */       return null;
/*      */     }
/*      */     
/* 5747 */     boolean bool = false;
/*      */ 
/*      */     
/* 5750 */     if (paramString2.startsWith("SHADOW:")) {
/*      */       
/* 5752 */       paramString2 = paramString2.substring("SHADOW:".length());
/* 5753 */       bool = true;
/*      */     } 
/*      */     
/* 5756 */     if (paramString2.startsWith("SHARED:")) {
/*      */       
/* 5758 */       paramString2 = paramString2.substring("SHARED:".length());
/*      */ 
/*      */ 
/*      */       
/* 5762 */       paramString1 = "units/shared/common.ini";
/*      */     } 
/*      */     
/* 5765 */     if (paramString2.startsWith("CORE:")) {
/*      */       
/* 5767 */       paramString2 = paramString2.substring("CORE:".length());
/* 5768 */       paramString1 = "units/common.ini";
/*      */     } 
/*      */     
/* 5771 */     if (paramString2.startsWith("ROOT:")) {
/*      */       
/* 5773 */       paramString2 = paramString2.substring("ROOT:".length());
/*      */       
/* 5775 */       if (paraml.B == null) {
/*      */         
/* 5777 */         paramString1 = "units/common.ini";
/*      */       }
/*      */       else {
/*      */         
/* 5781 */         paramString1 = paraml.B.f + "/common.ini";
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 5787 */     if (paramString2.startsWith("SHADOW:")) {
/*      */       
/* 5789 */       paramString2 = paramString2.substring("SHADOW:".length());
/* 5790 */       bool = true;
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
/* 5801 */     l l1 = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5807 */     String str1 = f.h(paramString1) + "/";
/*      */ 
/*      */ 
/*      */     
/* 5811 */     String str2 = "[" + paramBoolean + "," + bool + "]" + str1 + paramString2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5817 */     e e1 = b(str2);
/* 5818 */     if (e1 != null)
/*      */     {
/* 5820 */       return e1;
/*      */     }
/*      */     
/* 5823 */     j j = b(str1, paramString2, paraml);
/*      */ 
/*      */ 
/*      */     
/* 5827 */     int i = 0;
/* 5828 */     if (c != null)
/*      */     {
/* 5830 */       i = c.t;
/*      */     }
/*      */     
/* 5833 */     if (i > 5) {
/*      */       
/* 5835 */       l.d("Fast failing to oom image for this mod");
/* 5836 */       e2 = l1.bw.o();
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */         
/* 5843 */         e2 = l1.bw.a((InputStream)j, true);
/*      */       }
/* 5845 */       catch (RuntimeException runtimeException) {
/*      */         
/* 5847 */         l.d("imageStream:" + j);
/* 5848 */         throw new RuntimeException("Error decode image from: " + a.c(str1 + paramString2), runtimeException);
/*      */       } 
/*      */       
/* 5851 */       if (e2.y()) {
/*      */         
/* 5853 */         l.d("oomErrors:" + j);
/* 5854 */         j++;
/*      */         
/* 5856 */         if (c != null)
/*      */         {
/* 5858 */           c.t++;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*      */     try {
/* 5865 */       j.close();
/*      */     }
/* 5867 */     catch (Exception exception) {
/*      */       
/* 5869 */       exception.printStackTrace();
/*      */     } 
/*      */     
/* 5872 */     if (e2 == null)
/*      */     {
/* 5874 */       throw new RuntimeException("Failed to decode image: " + a.c(str1 + paramString2));
/*      */     }
/*      */     
/* 5877 */     e2.a(paramBoolean);
/*      */     
/* 5879 */     if (bool) {
/*      */       
/* 5881 */       e e = e2;
/* 5882 */       e2 = af.a(e, e2.k, e2.l);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5889 */     a(e2);
/*      */     
/* 5891 */     a(str2, e2);
/*      */ 
/*      */     
/* 5894 */     return e2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(String paramString, e parame) {
/* 5903 */     e.put(paramString, parame);
/*      */   }
/*      */ 
/*      */   
/*      */   public static e b(String paramString) {
/* 5908 */     e e = (e)e.get(paramString);
/* 5909 */     if (e != null) {
/*      */ 
/*      */       
/* 5912 */       h++;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 5917 */       a(e);
/*      */ 
/*      */       
/* 5920 */       e.s();
/*      */       
/* 5922 */       return e;
/*      */     } 
/*      */     
/* 5925 */     if (i)
/*      */     {
/* 5927 */       l.d("loadImageInConf: cache miss: " + paramString);
/*      */     }
/* 5929 */     g++;
/*      */     
/* 5931 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static i a(String paramString1, String paramString2, l paraml) {
/* 5942 */     if (paramString2 == null)
/*      */     {
/* 5944 */       return null;
/*      */     }
/*      */     
/* 5947 */     if (paramString2.equalsIgnoreCase("NONE"))
/*      */     {
/* 5949 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 5953 */     l l1 = l.u();
/*      */ 
/*      */     
/* 5956 */     if (!paramString2.contains("."))
/*      */     {
/* 5958 */       return l1.bu.a(paramString2);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 5963 */     if (paramString2.startsWith("ROOT:")) {
/*      */       
/* 5965 */       paramString2 = paramString2.substring("ROOT:".length());
/*      */       
/* 5967 */       if (paraml.B == null) {
/*      */         
/* 5969 */         paramString1 = "units/common.ini";
/*      */       }
/*      */       else {
/*      */         
/* 5973 */         paramString1 = paraml.B.f + "/common.ini";
/*      */       } 
/*      */     } 
/*      */     
/* 5977 */     if (paramString2.startsWith("CORE:")) {
/*      */       
/* 5979 */       paramString2 = paramString2.substring("CORE:".length());
/* 5980 */       paramString1 = "units/common.ini";
/*      */     } 
/*      */     
/* 5983 */     if (paramString2.startsWith("SHARED:")) {
/*      */       
/* 5985 */       paramString2 = paramString2.substring("SHARED:".length());
/*      */       
/* 5987 */       paramString1 = "units/shared/common.ini";
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 5992 */     boolean bool = false;
/*      */     
/* 5994 */     String str1 = f.h(paramString1) + "/";
/*      */     
/* 5996 */     String str2 = str1 + paramString2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6006 */     i i1 = (i)f.get(str2);
/* 6007 */     if (i1 != null) {
/*      */       
/* 6009 */       a(i1);
/*      */       
/* 6011 */       return i1;
/*      */     } 
/*      */ 
/*      */     
/* 6015 */     if (!paramString2.toLowerCase(Locale.ROOT).endsWith(".ogg") && 
/* 6016 */       !paramString2.toLowerCase(Locale.ROOT).endsWith(".wav"))
/*      */     {
/* 6018 */       throw new RuntimeException("Failed to open sound: " + str1 + "" + paramString2 + " only the ogg & wav sound formats are supported.");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6024 */     j j = b(str1, paramString2, paraml);
/*      */ 
/*      */     
/* 6027 */     i i2 = l1.bu.a(paramString2, j, bool);
/*      */ 
/*      */     
/*      */     try {
/* 6031 */       j.close();
/*      */     }
/* 6033 */     catch (Exception exception) {
/*      */       
/* 6035 */       exception.printStackTrace();
/*      */     } 
/*      */     
/* 6038 */     if (i2 == null) {
/*      */ 
/*      */       
/* 6041 */       boolean bool1 = paramString2.toLowerCase(Locale.ROOT).endsWith(".ogg");
/*      */       
/* 6043 */       String str = "Sound file found but failed to load: " + str2;
/*      */       
/* 6045 */       if (bool1)
/*      */       {
/* 6047 */         str = str + " - Check if this file is truly a ogg";
/*      */       }
/*      */       
/* 6050 */       throw new RuntimeException(str);
/*      */     } 
/*      */ 
/*      */     
/* 6054 */     a(i2);
/*      */ 
/*      */     
/* 6057 */     f.put(str2, i2);
/*      */     
/* 6059 */     return i2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean a(String paramString1, String paramString2, String paramString3, b paramb) {
/* 6066 */     if (paramString2 == null)
/*      */     {
/* 6068 */       return true;
/*      */     }
/*      */     
/* 6071 */     if (!paramString2.contains(".."))
/*      */     {
/* 6073 */       return true;
/*      */     }
/*      */     
/* 6076 */     if (l.aj())
/*      */     {
/* 6078 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 6082 */     File file = new File(a.c(paramString3));
/* 6083 */     String str1 = file.getCanonicalPath();
/*      */ 
/*      */ 
/*      */     
/* 6087 */     String str2 = (new File(a.c("units"))).getCanonicalPath();
/* 6088 */     if (str1.startsWith(str2))
/*      */     {
/*      */       
/* 6091 */       return true;
/*      */     }
/*      */ 
/*      */     
/* 6095 */     String str3 = paramb.i();
/* 6096 */     boolean bool = str1.startsWith(str3);
/*      */     
/* 6098 */     if (!bool)
/*      */     {
/* 6100 */       l.b("File: '" + str1 + "' is not within mod: '" + str3 + "'");
/*      */     }
/*      */ 
/*      */     
/* 6104 */     return bool;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String a(String paramString1, String paramString2) {
/* 6111 */     if (!paramString1.endsWith("/"))
/*      */     {
/* 6113 */       paramString1 = paramString1 + "/";
/*      */     }
/*      */     
/* 6116 */     while (paramString2.startsWith("/") || paramString2.startsWith("\\"))
/*      */     {
/* 6118 */       paramString2 = paramString2.substring(1);
/*      */     }
/*      */     
/* 6121 */     return paramString1 + paramString2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static j b(String paramString1, String paramString2, l paraml) {
/* 6128 */     String str = a(paramString1, paramString2);
/*      */     
/* 6130 */     b b1 = null;
/* 6131 */     if (paraml != null) {
/*      */       
/* 6133 */       b1 = paraml.B;
/*      */     }
/*      */     else {
/*      */       
/* 6137 */       l.f("findAssetSteam meta==null");
/*      */     } 
/*      */ 
/*      */     
/*      */     try {
/* 6142 */       if (b1 != null)
/*      */       {
/* 6144 */         if (!a(paramString1, paramString2, str, b1))
/*      */         {
/* 6146 */           throw new RuntimeException("File is outside mod: " + str);
/*      */         }
/*      */       }
/*      */     }
/* 6150 */     catch (IOException iOException) {
/*      */       
/* 6152 */       throw new RuntimeException(iOException);
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
/* 6163 */     j j = a.h(str);
/*      */     
/* 6165 */     if (j == null) {
/*      */       
/* 6167 */       l.d("Orginal path: " + str);
/*      */       
/* 6169 */       throw new RuntimeException("IO Error: Failed to open: " + a.c(str));
/*      */     } 
/*      */ 
/*      */     
/* 6173 */     return j;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void b(l paraml) {
/* 6359 */     af[] arrayOfAf = paraml.am;
/*      */ 
/*      */ 
/*      */     
/* 6363 */     for (byte b1 = 0; b1 < arrayOfAf.length; b1++) {
/*      */       
/* 6365 */       af af1 = arrayOfAf[b1];
/*      */       
/* 6367 */       float f1 = -1.0F;
/* 6368 */       af af2 = null;
/*      */       
/* 6370 */       float f2 = 1.0F;
/*      */       
/* 6372 */       if (af1.l)
/*      */       {
/* 6374 */         f2 = 0.1F;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 6379 */       for (byte b2 = 0; b2 < arrayOfAf.length; b2++) {
/*      */         
/* 6381 */         af af = arrayOfAf[b2];
/* 6382 */         if (af1 != af && !af.i) {
/*      */           
/* 6384 */           float f = f.a(af1.d * f2, af1.e, af.d * f2, af.e);
/* 6385 */           if (af2 == null || f < f1) {
/*      */             
/* 6387 */             f1 = f;
/* 6388 */             af2 = af;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 6398 */       f1 = f.a(f1) + 2.0F;
/* 6399 */       f1 *= f1;
/*      */       
/* 6401 */       ArrayList<Integer> arrayList = new ArrayList(); byte b3;
/* 6402 */       for (b3 = 0; b3 < arrayOfAf.length; b3++) {
/*      */         
/* 6404 */         af af = arrayOfAf[b3];
/* 6405 */         if (af1 != af && !af.i) {
/*      */           
/* 6407 */           float f = f.a(af1.d * f2, af1.e, af.d * f2, af.e);
/*      */           
/* 6409 */           if (f <= f1)
/*      */           {
/* 6411 */             arrayList.add(Integer.valueOf(af.a));
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 6419 */       af1.O = new int[arrayList.size()];
/* 6420 */       for (b3 = 0; b3 < arrayList.size(); b3++)
/*      */       {
/* 6422 */         af1.O[b3] = ((Integer)arrayList.get(b3)).intValue();
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
/*      */   public static String g() {
/* 6438 */     return "builtin_mods";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String h() {
/* 6444 */     return "builtin_mods_enabled";
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
/*      */   public static String i() {
/*      */     String str;
/* 6471 */     if (l.aF) {
/*      */       
/* 6473 */       str = "/SD/mods/units";
/*      */     }
/*      */     else {
/*      */       
/* 6477 */       str = "/SD/rustedWarfare/units";
/*      */     } 
/*      */ 
/*      */     
/* 6481 */     return str;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
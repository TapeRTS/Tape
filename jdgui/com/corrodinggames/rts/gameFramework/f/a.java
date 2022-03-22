/*      */ package com.corrodinggames.rts.gameFramework.f;
/*      */ 
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.custom.ac;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.util.ArrayList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class a
/*      */ {
/*  572 */   public b a = new b();
/*      */   
/*  574 */   Object b = new Object();
/*  575 */   ArrayList c = new ArrayList();
/*      */ 
/*      */ 
/*      */   
/*      */   ArrayList d;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  585 */     i();
/*      */     
/*  587 */     d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b() {
/*  595 */     byte b1 = 0;
/*  596 */     for (b b2 : this.c) {
/*      */       
/*  598 */       if (!b2.c && !b2.o)
/*      */       {
/*  600 */         b1++;
/*      */       }
/*      */     } 
/*  603 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  609 */     l l = l.u();
/*      */     
/*  611 */     String str = "";
/*  612 */     for (b b1 : this.c) {
/*      */ 
/*      */ 
/*      */       
/*  616 */       String str1 = b1.a;
/*  617 */       str1 = str1.replace(",", " ");
/*  618 */       str1 = str1.replace("|", " ");
/*  619 */       if (str1.length() > 15)
/*      */       {
/*  621 */         str1 = str1.substring(12) + "...";
/*      */       }
/*      */ 
/*      */       
/*  625 */       if (str.length() != 0)
/*      */       {
/*  627 */         str = str + ",";
/*      */       }
/*      */       
/*  630 */       String str2 = b1.c ? "disabled" : "enabled";
/*      */       
/*  632 */       str = str + str1 + "|" + b1.b + "|" + str2;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  637 */     l.by.modSettings = str;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void d() {
/*  643 */     l.d("Loading mod selection");
/*  644 */     l l = l.u();
/*      */     
/*  646 */     String str = l.by.modSettings;
/*      */     
/*  648 */     String[] arrayOfString1 = str.split(",");
/*      */     
/*  650 */     String[] arrayOfString2 = arrayOfString1; int i = arrayOfString2.length; byte b1 = 0; while (true) { if (b1 < i) { String str1 = arrayOfString2[b1];
/*      */         
/*  652 */         String[] arrayOfString = str1.split("\\|");
/*      */         
/*  654 */         if (arrayOfString.length != 3) {
/*      */           
/*  656 */           l.d("loadSelection: wrong count (" + arrayOfString.length + "):" + str1);
/*      */         } else {
/*      */           boolean bool;
/*  659 */           String str2 = arrayOfString[0];
/*  660 */           String str3 = arrayOfString[1];
/*  661 */           String str4 = arrayOfString[2];
/*      */ 
/*      */           
/*  664 */           if (str4.equals("enabled")) {
/*      */             
/*  666 */             bool = false;
/*      */           }
/*  668 */           else if (str4.equals("disabled")) {
/*      */             
/*  670 */             bool = true;
/*      */           }
/*      */           else {
/*      */             
/*  674 */             l.d("loadSelection: Unknown option:" + str1);
/*      */             
/*      */             b1++;
/*      */           } 
/*  678 */           b b2 = a(str3);
/*  679 */           if (b2 == null) {
/*      */             
/*  681 */             l.d("loadSelection: Did not find mod in settings:" + str2);
/*      */           }
/*      */           else {
/*      */             
/*  685 */             b2.c = bool;
/*      */           } 
/*      */         }  }
/*      */       else
/*      */       { break; }
/*      */       
/*      */       b1++; }
/*      */   
/*      */   } public b a(String paramString) {
/*  694 */     for (b b1 : this.c) {
/*      */       
/*  696 */       if (b1.b.equals(paramString))
/*      */       {
/*  698 */         return b1;
/*      */       }
/*      */     } 
/*      */     
/*  702 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e() {
/*  709 */     for (b b1 : this.c)
/*      */     {
/*  711 */       b1.c = true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int f() {
/*  717 */     return this.c.size();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public b b(String paramString) {
/*  723 */     for (b b1 : this.c) {
/*      */       
/*  725 */       if (b1.a.equals(paramString))
/*      */       {
/*  727 */         return b1;
/*      */       }
/*      */     } 
/*      */     
/*  731 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public b c(String paramString) {
/*  738 */     for (b b1 : this.c) {
/*      */       
/*  740 */       if (b1.a().equals(paramString))
/*      */       {
/*  742 */         return b1;
/*      */       }
/*      */     } 
/*      */     
/*  746 */     return null;
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
/*      */   public b a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*  773 */     b b1 = a(paramString3);
/*  774 */     if (b1 == null) {
/*      */ 
/*      */ 
/*      */       
/*  778 */       b1 = new b();
/*  779 */       b1.a = paramString1;
/*  780 */       b1.b = paramString3;
/*      */       
/*  782 */       b1.f = paramString2;
/*  783 */       b1.l();
/*      */       
/*  785 */       b1.c = !paramBoolean1;
/*      */     } 
/*      */     
/*  788 */     b1.e = true;
/*      */     
/*  790 */     b1.j = paramBoolean2;
/*  791 */     b1.k = paramBoolean3;
/*      */     
/*  793 */     b1.p();
/*      */     
/*  795 */     synchronized (this.b) {
/*      */       
/*  797 */       if (!this.c.contains(b1)) {
/*      */ 
/*      */         
/*  800 */         ArrayList<b> arrayList = new ArrayList();
/*  801 */         arrayList.addAll(this.c);
/*  802 */         arrayList.add(b1);
/*  803 */         this.c = arrayList;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  808 */     return b1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/*  814 */     l.d("loading mod custom units at:" + paramString);
/*      */     
/*  816 */     String[] arrayOfString = com.corrodinggames.rts.gameFramework.c.a.e(paramString);
/*      */     
/*  818 */     if (arrayOfString == null) {
/*      */       
/*  820 */       l.b("getAllModList: ERROR");
/*  821 */       l.b("getAllModList: Failed to load:" + paramString);
/*      */       
/*      */       return;
/*      */     } 
/*  825 */     for (String str1 : arrayOfString) {
/*      */       
/*  827 */       String str2 = paramString + "/" + str1;
/*  828 */       if (!com.corrodinggames.rts.gameFramework.c.a.d(str2))
/*      */       {
/*  830 */         if (!str1.endsWith(".ini")) {
/*      */           continue;
/*      */         }
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  837 */       String str3 = f.e(str1);
/*      */       
/*  839 */       boolean bool = false;
/*      */       
/*  841 */       a(str1, str2, str3, paramBoolean1, bool, paramBoolean2);
/*      */       continue;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public ArrayList g() {
/*  848 */     ArrayList arrayList = new ArrayList();
/*      */     
/*  850 */     for (b b1 : this.c) {
/*      */       
/*  852 */       if (b1.k())
/*      */       {
/*      */ 
/*      */         
/*  856 */         arrayList.addAll(b1.o());
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  861 */     return arrayList;
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
/*      */   public ArrayList h() {
/*  885 */     ArrayList<b> arrayList = new ArrayList();
/*      */     
/*  887 */     for (b b1 : this.c) {
/*      */       
/*  889 */       if (b1.k())
/*      */       {
/*  891 */         arrayList.add(b1);
/*      */       }
/*      */     } 
/*      */     
/*  895 */     return arrayList;
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
/*      */   public ArrayList i() {
/*  919 */     com.corrodinggames.rts.gameFramework.l.a a1 = com.corrodinggames.rts.gameFramework.l.a.a();
/*  920 */     if (a1 != null) {
/*      */       
/*  922 */       a1.k();
/*      */     }
/*      */     else {
/*      */       
/*  926 */       l.d("getAllModList: SteamEngine==null");
/*      */     } 
/*      */     
/*  929 */     for (b b1 : this.c)
/*      */     {
/*  931 */       b1.e = false;
/*      */     }
/*      */     
/*  934 */     String str1 = ac.i();
/*      */     
/*  936 */     if (!com.corrodinggames.rts.gameFramework.c.a.d(str1)) {
/*      */       
/*  938 */       l.d("Modded Custom '" + str1 + "' directory not found");
/*      */     }
/*      */     else {
/*      */       
/*  942 */       boolean bool = false;
/*  943 */       a(str1, true, bool);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  949 */     String str2 = ac.g();
/*      */     
/*  951 */     if (!com.corrodinggames.rts.gameFramework.c.a.d(str2)) {
/*      */       
/*  953 */       l.d("Modded Custom '" + str2 + "' directory not found");
/*      */     }
/*      */     else {
/*      */       
/*  957 */       boolean bool = true;
/*  958 */       a(str2, false, bool);
/*      */     } 
/*      */ 
/*      */     
/*  962 */     String str3 = ac.h();
/*      */     
/*  964 */     if (!com.corrodinggames.rts.gameFramework.c.a.d(str3)) {
/*      */       
/*  966 */       l.d("Modded Custom '" + str3 + "' directory not found");
/*      */     }
/*      */     else {
/*      */       
/*  970 */       boolean bool = true;
/*  971 */       a(str3, true, bool);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  977 */     l.d("========= Mods ===========");
/*      */     
/*  979 */     l.d("Number of mods:" + this.c.size());
/*  980 */     for (b b1 : this.c)
/*      */     {
/*  982 */       l.d("Mod: '" + b1.a());
/*      */     }
/*      */     
/*  985 */     l.d("================================");
/*      */     
/*  987 */     l l = l.u();
/*      */     
/*  989 */     if (l.by.lastModCount == -1) {
/*      */       
/*  991 */       l.d("Disabling all new mods for first load");
/*      */ 
/*      */       
/*  994 */       for (b b1 : this.c)
/*      */       {
/*  996 */         b1.c = true;
/*      */       }
/*      */       
/*  999 */       c();
/*      */     } 
/*      */     
/* 1002 */     l.by.lastModCount = this.c.size();
/*      */     
/* 1004 */     return this.c;
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
/*      */   public void j() {
/* 1016 */     l l = l.u();
/*      */     
/* 1018 */     l.c();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1026 */     a(false);
/*      */ 
/*      */ 
/*      */     
/* 1030 */     l.q();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean paramBoolean) {
/* 1038 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1043 */     for (b b1 : this.c) {
/*      */       
/* 1045 */       b1.z = null;
/* 1046 */       b1.A = null;
/*      */       
/* 1048 */       b1.n = false;
/* 1049 */       b1.o = false;
/*      */       
/* 1051 */       b1.p = 0;
/* 1052 */       b1.q = 0;
/* 1053 */       b1.r = 0;
/* 1054 */       b1.s = 0;
/*      */       
/* 1056 */       b1.t = 0;
/*      */     } 
/*      */ 
/*      */     
/* 1060 */     i();
/*      */     
/* 1062 */     ArrayList arrayList = new ArrayList(l.d);
/*      */ 
/*      */     
/* 1065 */     ac.f();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1080 */     if (paramBoolean) {
/*      */ 
/*      */       
/* 1083 */       byte b1 = 0;
/* 1084 */       for (l l1 : arrayList) {
/*      */         
/* 1086 */         if (l1.B != null)
/*      */         {
/* 1088 */           if (!l1.B.c && l1.B.z != null)
/*      */           {
/* 1090 */             if (l.a(l1) == null) {
/*      */               
/* 1092 */               l.d("Was missing: " + l1.E);
/* 1093 */               l.d.add(l1);
/* 1094 */               b1++;
/*      */             } 
/*      */           }
/*      */         }
/*      */       } 
/* 1099 */       if (b1 > 0)
/*      */       {
/* 1101 */         ac.d();
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1107 */     l.A();
/*      */     
/* 1109 */     m.K();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void k() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public a() {
/* 1129 */     this.d = new ArrayList();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String[] a(String[] paramArrayOfString, String paramString) {
/* 1140 */     l.d("addExtraMapsForPath: " + paramString);
/*      */     
/* 1142 */     ArrayList<String> arrayList = new ArrayList();
/*      */ 
/*      */     
/* 1145 */     if (paramArrayOfString != null)
/*      */     {
/* 1147 */       for (String str : paramArrayOfString)
/*      */       {
/* 1149 */         arrayList.add(str);
/*      */       }
/*      */     }
/*      */     
/* 1153 */     if (l.aj())
/*      */     {
/* 1155 */       if ("/SD/rusted_warfare_maps".equals(paramString)) {
/*      */         
/* 1157 */         String[] arrayOfString = com.corrodinggames.rts.gameFramework.c.a.a("/SD/rustedWarfare/maps", true);
/*      */         
/* 1159 */         if (arrayOfString != null)
/*      */         {
/* 1161 */           for (String str : arrayOfString)
/*      */           {
/* 1163 */             arrayList.add("NEW_PATH|maps2/" + str);
/*      */           }
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 1170 */     for (c c : d(paramString))
/*      */     {
/* 1172 */       arrayList.add("MOD|" + c.c.b + "/" + c.b);
/*      */     }
/*      */     
/* 1175 */     if (paramArrayOfString == null && arrayList.size() == 0)
/*      */     {
/* 1177 */       return null;
/*      */     }
/*      */     
/* 1180 */     return arrayList.<String>toArray(new String[0]);
/*      */   }
/*      */ 
/*      */   
/*      */   public ArrayList d(String paramString) {
/* 1185 */     ArrayList<c> arrayList = new ArrayList();
/*      */     
/* 1187 */     for (c c : this.d) {
/*      */ 
/*      */ 
/*      */       
/* 1191 */       boolean bool = false;
/*      */       
/* 1193 */       if (paramString.startsWith("mod/"))
/*      */       {
/* 1195 */         if (paramString.startsWith("mod/" + c.c.b))
/*      */         {
/* 1197 */           bool = true;
/*      */         }
/*      */       }
/*      */       
/* 1201 */       if (!c.c.c)
/*      */       {
/* 1203 */         if (paramString.startsWith("/SD/rusted_warfare_maps"))
/*      */         {
/* 1205 */           bool = true;
/*      */         }
/*      */       }
/*      */       
/* 1209 */       if (bool) {
/*      */         
/* 1211 */         l.d("Adding extra map:" + c.a);
/*      */ 
/*      */         
/* 1214 */         arrayList.add(c);
/*      */       } 
/*      */     } 
/*      */     
/* 1218 */     return arrayList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void l() {
/* 1223 */     this.d.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, b paramb) {
/* 1231 */     c c = new c(this);
/* 1232 */     c.a = paramString;
/* 1233 */     c.c = paramb;
/*      */     
/* 1235 */     if (paramb.f == null) {
/*      */       
/* 1237 */       l.a("Skipping:" + paramString + " as mod sourceFolder is null");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1243 */     String str1 = paramString;
/*      */     
/* 1245 */     String str2 = paramb.f;
/* 1246 */     if (str1.startsWith(str2)) {
/*      */       
/* 1248 */       str1 = str1.substring(str2.length());
/*      */     }
/*      */     else {
/*      */       
/* 1252 */       l.a("Mod path:" + paramb.f + " not in map path:" + str1);
/*      */     } 
/*      */ 
/*      */     
/* 1256 */     c.b = str1;
/*      */ 
/*      */     
/* 1259 */     paramb.l = true;
/*      */ 
/*      */     
/* 1262 */     paramb.q++;
/*      */     
/* 1264 */     this.d.add(c);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\f\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
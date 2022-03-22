/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.gameFramework.d.f;
/*      */ import com.corrodinggames.rts.gameFramework.f.b;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class am
/*      */ {
/*   34 */   public static aq a = new an();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float a() {
/*  606 */     l l = l.u();
/*      */     
/*  608 */     return l.by.musicVolume * l.by.masterVolume;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/*  613 */     if (l.an())
/*      */     {
/*  615 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  619 */     if (this.u)
/*      */     {
/*  621 */       return false;
/*      */     }
/*      */     
/*  624 */     return (a() > 0.01F);
/*      */   }
/*      */   
/*  627 */   Object b = new Object();
/*      */ 
/*      */   
/*  630 */   Object c = new Object();
/*  631 */   volatile float d = 1.0F;
/*      */   
/*      */   au e;
/*      */   
/*      */   volatile boolean f = false;
/*      */   
/*      */   volatile boolean g = true;
/*      */   
/*  639 */   float h = 0.0F;
/*  640 */   int i = 0;
/*      */ 
/*      */   
/*      */   boolean j = false;
/*      */ 
/*      */   
/*      */   as k;
/*      */ 
/*      */   
/*      */   boolean l;
/*      */ 
/*      */   
/*      */   String m;
/*      */ 
/*      */   
/*      */   boolean n;
/*      */ 
/*      */   
/*      */   boolean o;
/*      */ 
/*      */   
/*      */   float p;
/*      */   
/*      */   float q;
/*      */   
/*      */   float r;
/*      */   
/*      */   public boolean s;
/*      */   
/*      */   public String t;
/*      */   
/*      */   public boolean u;
/*      */   
/*      */   String v;
/*      */   
/*      */   Context w;
/*      */   
/*      */   boolean x;
/*      */   
/*      */   boolean y;
/*      */   
/*      */   int z;
/*      */   
/*      */   as A;
/*      */   
/*      */   boolean B;
/*      */   
/*      */   boolean C;
/*      */   
/*      */   float D;
/*      */   
/*      */   boolean E = false;
/*      */   
/*      */   boolean F = false;
/*      */   
/*      */   float G;
/*      */ 
/*      */   
/*      */   public void a(Context paramContext) {
/*  699 */     this.w = paramContext;
/*      */     
/*  701 */     if (l.an()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  707 */     a.a(this);
/*      */ 
/*      */     
/*  710 */     this.k = a.a();
/*      */     
/*  712 */     this.A = a.a();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  718 */     at.c();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  729 */     if (a.d()) {
/*      */ 
/*      */       
/*  732 */       this.e = new au(this);
/*  733 */       this.e.start();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void c() {
/*  742 */     if (!l.al()) {
/*      */       
/*  744 */       this.l = false;
/*  745 */       this.m = null;
/*      */       
/*  747 */       this.x = true;
/*      */ 
/*      */       
/*  750 */       this.B = false;
/*      */     } 
/*      */ 
/*      */     
/*  754 */     this.y = true;
/*      */     
/*  756 */     this.u = false;
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
/*  845 */   ArrayList H = new ArrayList();
/*      */ 
/*      */   
/*  848 */   static HashMap I = new HashMap<>();
/*      */   
/*  850 */   static int J = 0;
/*      */   boolean K;
/*      */   
/*      */   static ar a(String paramString, boolean paramBoolean) {
/*  854 */     ar ar2, ar1 = (ar)I.get(paramString);
/*  855 */     if (ar1 != null)
/*      */     {
/*  857 */       return ar1;
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
/*      */     try {
/*  869 */       ar2 = a.a(paramString);
/*      */     
/*      */     }
/*  872 */     catch (ArithmeticException arithmeticException) {
/*      */       
/*  874 */       J++;
/*      */       
/*  876 */       l.a("Error loading:" + paramString, arithmeticException);
/*      */       
/*  878 */       if (J > 2 && J <= 4)
/*      */       {
/*  880 */         l.u().h("Failed to load music track:" + paramString + ". Music track skipped.");
/*      */       }
/*      */       
/*  883 */       if (!paramBoolean)
/*      */       {
/*  885 */         throw new RuntimeException(arithmeticException);
/*      */       }
/*  887 */       return null;
/*      */     
/*      */     }
/*  890 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */       
/*  892 */       J++;
/*      */ 
/*      */       
/*  895 */       l.a("OutOfMemoryError loading:" + paramString, outOfMemoryError);
/*      */       
/*  897 */       l.ap();
/*      */       
/*  899 */       System.gc();
/*      */       
/*  901 */       l.ap();
/*      */       
/*  903 */       if (J < 3)
/*      */       {
/*  905 */         l.u().h("Ran out of memory loading music track:" + paramString + ". Music track skipped.");
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  910 */       if (!paramBoolean)
/*      */       {
/*  912 */         throw new RuntimeException(outOfMemoryError);
/*      */       }
/*  914 */       return null;
/*      */     
/*      */     }
/*  917 */     catch (Exception exception) {
/*      */       
/*  919 */       J++;
/*      */       
/*  921 */       l.a("Exception loading:" + paramString, exception);
/*      */       
/*  923 */       if (J > 2 && J <= 4)
/*      */       {
/*  925 */         l.u().h("Unknown error loading music track:" + paramString + ". Music track skipped.");
/*      */       }
/*      */       
/*  928 */       if (!paramBoolean)
/*      */       {
/*  930 */         throw new RuntimeException(exception);
/*      */       }
/*  932 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  939 */     if (paramBoolean)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  949 */       I.put(paramString, ar2);
/*      */     }
/*      */     
/*  952 */     return ar2;
/*      */   }
/*      */   boolean L;
/*      */   
/*      */   public ArrayList d() {
/*  957 */     ArrayList<String> arrayList = new ArrayList();
/*      */     
/*  959 */     for (String str : at.a.b())
/*      */     {
/*  961 */       arrayList.add(str);
/*      */     }
/*  963 */     for (String str : at.b.b())
/*      */     {
/*  965 */       arrayList.add(str);
/*      */     }
/*  967 */     for (String str : at.a.b())
/*      */     {
/*  969 */       arrayList.add(str);
/*      */     }
/*  971 */     return arrayList;
/*      */   }
/*      */ 
/*      */   
/*      */   public String a(at paramat) {
/*  976 */     return a(paramat, paramat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String a(at paramat1, at paramat2) {
/*      */     at at1;
/*  985 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  990 */     if (f.b((paramat1.b()).length + (paramat2.b()).length) < (paramat1.b()).length) {
/*      */       
/*  992 */       at1 = paramat1;
/*      */     }
/*      */     else {
/*      */       
/*  996 */       at1 = paramat2;
/*      */     } 
/*      */     
/*  999 */     String[] arrayOfString = at1.b();
/*      */     
/* 1001 */     return at1.a(arrayOfString[f.b(arrayOfString.length)]);
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
/* 1055 */   long M = -1L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void e() {
/* 1086 */     this.s = true;
/* 1087 */     this.u = false;
/* 1088 */     this.t = null;
/*      */   }
/*      */ 
/*      */   
/*      */   public synchronized void a(String paramString) {
/* 1093 */     this.s = true;
/* 1094 */     this.u = false;
/* 1095 */     this.t = paramString;
/*      */   }
/*      */ 
/*      */   
/*      */   public synchronized void a(float paramFloat) {
/* 1100 */     if (l.an()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1106 */     if (!a.d()) {
/*      */       
/* 1108 */       if (!this.K)
/*      */       {
/* 1110 */         b(paramFloat);
/*      */       }
/*      */       
/* 1113 */       this.g = true;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1120 */     this.M = l.N();
/*      */     
/* 1122 */     l l = l.u();
/* 1123 */     if (l.bB.H.a())
/*      */     {
/* 1125 */       e();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1131 */     if (this.v != null) {
/*      */ 
/*      */       
/* 1134 */       ad.a(null, this.v);
/*      */       
/* 1136 */       this.v = null;
/*      */     } 
/*      */     
/* 1139 */     if (this.p != a()) {
/*      */       
/* 1141 */       this.p = a();
/* 1142 */       this.o = true;
/*      */     } 
/*      */ 
/*      */     
/* 1146 */     synchronized (this.c) {
/*      */       
/* 1148 */       this.d = paramFloat;
/*      */ 
/*      */       
/* 1151 */       if (this.K) {
/*      */         
/* 1153 */         if (!this.L) {
/*      */           
/* 1155 */           this.L = true;
/* 1156 */           l.m("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
/*      */         } 
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/* 1163 */       if (!this.g) {
/*      */         
/* 1165 */         this.h += paramFloat;
/* 1166 */         this.i++;
/* 1167 */         if (this.h > 320.0F && this.i > 80 && !this.j)
/*      */         {
/* 1169 */           this.j = true;
/* 1170 */           l.m("Lockup detected in music subsystem");
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/* 1175 */         this.h = 0.0F;
/* 1176 */         this.i = 0;
/*      */       } 
/*      */ 
/*      */       
/* 1180 */       this.g = false;
/*      */       
/* 1182 */       this.f = true;
/* 1183 */       this.c.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String b(String paramString) {
/* 1190 */     paramString = f.k(paramString);
/* 1191 */     paramString = f.g(paramString);
/*      */     
/* 1193 */     paramString = paramString.replace("[noloop]", "");
/* 1194 */     paramString = paramString.replace("_", " ");
/*      */     
/* 1196 */     return paramString;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(float paramFloat) {
/*      */     try {
/* 1208 */       c(paramFloat);
/*      */       
/* 1210 */       return true;
/*      */     }
/* 1212 */     catch (Exception exception) {
/*      */       
/* 1214 */       l.a("Music system crashed", exception);
/* 1215 */       this.K = true;
/*      */       
/* 1217 */       l.d("Stopping music");
/*      */       
/*      */       try {
/* 1220 */         g();
/*      */       }
/* 1222 */       catch (Exception exception1) {
/*      */         
/* 1224 */         l.a("crash stopping music", exception1);
/*      */       } 
/*      */       
/* 1227 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(float paramFloat) {
/* 1234 */     if (l.an()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1239 */     a.a(paramFloat);
/*      */ 
/*      */     
/* 1242 */     if (!b()) {
/*      */       
/* 1244 */       if (this.l && this.k.c()) {
/*      */ 
/*      */         
/* 1247 */         g();
/*      */         
/* 1249 */         this.l = false;
/* 1250 */         this.B = false;
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
/*      */       return;
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
/* 1276 */     boolean bool = false;
/*      */     
/* 1278 */     if (!this.l)
/*      */     {
/* 1280 */       bool = true;
/*      */     }
/*      */     
/* 1283 */     if (this.n) {
/*      */       
/* 1285 */       if (!this.C)
/*      */       {
/* 1287 */         this.q += paramFloat;
/*      */       }
/*      */       
/* 1290 */       if (this.q > 600.0F)
/*      */       {
/* 1292 */         this.r += paramFloat;
/*      */         
/* 1294 */         if (this.r > 100.0F)
/*      */         {
/* 1296 */           this.r = 0.0F;
/*      */           
/* 1298 */           if (!this.l || !this.k.c())
/*      */           {
/*      */ 
/*      */ 
/*      */             
/* 1303 */             bool = true;
/* 1304 */             this.q = 0.0F;
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1313 */       this.q += paramFloat;
/*      */ 
/*      */       
/* 1316 */       if (this.q > 3600.0F) {
/*      */         
/* 1318 */         l.d("Next music track, timer:" + this.q);
/*      */         
/* 1320 */         bool = true;
/* 1321 */         this.q = 0.0F;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1328 */     if (this.y) {
/*      */       
/* 1330 */       b b = f.x();
/* 1331 */       if (b != null)
/*      */       {
/* 1333 */         if (b.v)
/*      */         {
/* 1335 */           bool = true;
/*      */         }
/*      */       }
/*      */       
/* 1339 */       this.y = false;
/*      */     } 
/*      */     
/* 1342 */     if (bool || this.s) {
/*      */       
/* 1344 */       boolean bool1 = this.s;
/* 1345 */       String str1 = this.t;
/*      */       
/* 1347 */       if (this.s) {
/*      */         
/* 1349 */         l.d("Next music track requested");
/*      */         
/* 1351 */         this.s = false;
/* 1352 */         this.q = 0.0F;
/* 1353 */         this.t = null;
/*      */       } 
/*      */ 
/*      */       
/* 1357 */       String str2 = null;
/* 1358 */       boolean bool2 = false;
/* 1359 */       b b1 = null;
/*      */ 
/*      */       
/* 1362 */       if (str1 != null) {
/*      */         
/* 1364 */         ArrayList arrayList = (l.u()).bH.g();
/*      */         
/* 1366 */         arrayList.addAll(d());
/*      */ 
/*      */ 
/*      */         
/* 1370 */         String str = str1;
/* 1371 */         if (str1.endsWith(".ogg") || str1.endsWith(".wav"))
/*      */         {
/* 1373 */           str1 = b(str1);
/*      */         }
/*      */         
/* 1376 */         for (String str3 : arrayList) {
/*      */           
/* 1378 */           String str4 = b(str3);
/* 1379 */           if (str4.equalsIgnoreCase(str)) {
/*      */             
/* 1381 */             bool2 = true;
/* 1382 */             str2 = str3;
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/* 1387 */         if (str2 == null)
/*      */         {
/* 1389 */           l.d("Failed to find requested music: " + str);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1398 */       b b2 = f.x();
/* 1399 */       if (str2 == null && b2 != null && b2.x < 10)
/*      */       {
/* 1401 */         if (b2.v) {
/*      */           
/* 1403 */           ArrayList<String> arrayList = b2.o();
/*      */           
/* 1405 */           if (arrayList.size() > 0) {
/*      */             
/* 1407 */             bool2 = true;
/* 1408 */             b1 = b2;
/*      */             
/* 1410 */             str2 = arrayList.get(f.a(0, arrayList.size() - 1));
/*      */             
/* 1412 */             if (bool1 || this.H.contains(str2))
/*      */             {
/* 1414 */               for (byte b = 0; b < 30;) {
/*      */                 
/* 1416 */                 if (str2.equals(this.m) || this.H.contains(str2)) {
/*      */                   
/* 1418 */                   str2 = arrayList.get(f.a(0, arrayList.size() - 1));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 1425 */                   if (b > 20)
/*      */                   {
/* 1427 */                     this.H.clear();
/*      */                   }
/*      */                   b++;
/*      */                 } 
/*      */               } 
/*      */             }
/* 1433 */             l.d("Playing music from mod:" + b2.a() + " - '" + str2 + "'");
/*      */           } 
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1440 */       if (str2 == null) {
/*      */         
/* 1442 */         if (this.x) {
/*      */           
/* 1444 */           str2 = a(at.a);
/*      */         }
/*      */         else {
/*      */           
/* 1448 */           str2 = a(at.b, at.a);
/*      */         } 
/*      */         
/* 1451 */         if (bool1 || this.H.contains(str2))
/*      */         {
/* 1453 */           for (byte b = 0; b < 30;) {
/*      */             
/* 1455 */             if (str2.equals(this.m) || this.H.contains(str2)) {
/*      */               
/* 1457 */               str2 = a(at.b, at.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1464 */               if (b > 20)
/*      */               {
/* 1466 */                 this.H.clear();
/*      */               }
/*      */               
/*      */               b++;
/*      */             } 
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 1475 */       if (!str2.equals(this.m)) {
/*      */         ar ar;
/* 1477 */         this.m = str2;
/* 1478 */         this.x = false;
/*      */         
/* 1480 */         this.q = 0.0F;
/*      */         
/* 1482 */         this.n = (bool2 || str2.contains("[noloop]"));
/*      */ 
/*      */         
/* 1485 */         this.H.add(str2);
/* 1486 */         if (this.H.size() > 4)
/*      */         {
/* 1488 */           this.H.remove(0);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1493 */         if (bool1)
/*      */         {
/* 1495 */           this.v = "Now playing: " + b(str2);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1501 */         as as1 = this.k;
/* 1502 */         this.k = this.A;
/* 1503 */         this.A = as1;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         try {
/* 1509 */           ar = a(str2, false);
/*      */ 
/*      */         
/*      */         }
/* 1513 */         catch (RuntimeException runtimeException) {
/*      */           
/* 1515 */           runtimeException.printStackTrace();
/*      */           
/* 1517 */           if (this.z < 3) {
/*      */             
/* 1519 */             this.v = "Failed to open music track: " + str2;
/* 1520 */             this.z++;
/*      */           } 
/*      */           
/* 1523 */           b1.x++;
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */         
/* 1529 */         this.k.a(ar);
/*      */         
/* 1531 */         this.k.a(!this.n);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1536 */         this.E = false;
/* 1537 */         if (!bool1 && this.B)
/*      */         {
/* 1539 */           this.E = true;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1544 */         if (this.l)
/*      */         {
/* 1546 */           this.B = true;
/*      */         }
/* 1548 */         this.C = true;
/* 1549 */         this.F = false;
/*      */ 
/*      */         
/* 1552 */         this.D = 1.0F;
/*      */ 
/*      */         
/* 1555 */         this.l = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1632 */       else if (bool1) {
/*      */         
/* 1634 */         l.d("Same music found");
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1642 */     if (this.C || this.o) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1647 */       boolean bool1 = a.c();
/*      */ 
/*      */       
/* 1650 */       if (!bool1) {
/*      */         
/* 1652 */         this.D -= paramFloat * 0.006F;
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 1657 */       else if (this.E) {
/*      */         
/* 1659 */         this.D -= paramFloat * 0.003F;
/*      */       }
/*      */       else {
/*      */         
/* 1663 */         this.D -= paramFloat * 0.008F;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1672 */       if (!bool1) {
/*      */         
/* 1674 */         f1 = this.D * a();
/* 1675 */         f2 = (1.0F - this.D) * a();
/*      */       }
/*      */       else {
/*      */         
/* 1679 */         f1 = (this.D * 2.0F - 1.0F) * a();
/* 1680 */         f2 = (1.0F - this.D * 2.0F) * a();
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1687 */       float f1 = f.b(f1, 0.0F, 1.0F);
/* 1688 */       float f2 = f.b(f2, 0.0F, 1.0F);
/*      */       
/* 1690 */       if (this.C) {
/*      */         
/* 1692 */         if (this.D <= 0.0F)
/*      */         {
/* 1694 */           this.C = false;
/*      */           
/* 1696 */           this.E = false;
/*      */           
/* 1698 */           if (this.B && !this.F) {
/*      */             
/* 1700 */             this.F = true;
/* 1701 */             this.A.d();
/*      */           } 
/* 1703 */           if (this.l)
/*      */           {
/*      */ 
/*      */ 
/*      */             
/* 1708 */             this.k.a(a(), a());
/*      */           
/*      */           }
/*      */         
/*      */         }
/*      */         else
/*      */         {
/* 1715 */           this.G += paramFloat;
/*      */           
/* 1717 */           if (this.G > 10.0F)
/*      */           {
/* 1719 */             this.G = 0.0F;
/*      */             
/* 1721 */             if (this.B && !this.F) {
/*      */               
/* 1723 */               this.A.a(f1, f1);
/*      */ 
/*      */               
/* 1726 */               if (f1 < 0.02F) {
/*      */                 
/* 1728 */                 this.F = true;
/* 1729 */                 this.A.d();
/*      */               } 
/*      */             } 
/*      */             
/* 1733 */             if (this.l)
/*      */             {
/*      */ 
/*      */ 
/*      */               
/* 1738 */               this.k.a(f2, f2);
/*      */             
/*      */             }
/*      */           }
/*      */         
/*      */         }
/*      */       
/*      */       }
/* 1746 */       else if (this.l) {
/*      */         
/* 1748 */         this.k.a(f2, f2);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1758 */     this.o = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void f() {
/* 1767 */     Log.a("RustedWarfare", "Music:pause()");
/*      */     
/* 1769 */     am$1 am$1 = new am$1(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1789 */     am$1.start();
/*      */   }
/*      */ 
/*      */   
/*      */   public void g() {
/* 1794 */     if (this.l)
/*      */     {
/* 1796 */       this.k.a();
/*      */     }
/* 1798 */     if (this.B)
/*      */     {
/* 1800 */       this.A.a();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void h() {
/* 1806 */     am$2 am$2 = new am$2(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1831 */     am$2.start();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void i() {
/* 1837 */     a.b();
/*      */ 
/*      */     
/* 1840 */     if (this.B) {
/*      */       
/* 1842 */       this.A.d();
/* 1843 */       this.A.e();
/*      */     } 
/* 1845 */     if (this.k != null) {
/*      */       
/* 1847 */       this.k.d();
/* 1848 */       this.k.e();
/*      */     } 
/*      */     
/* 1851 */     this.k = null;
/* 1852 */     this.m = null;
/* 1853 */     this.l = false;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*       */ package com.corrodinggames.rts.gameFramework.g;
/*       */ 
/*       */ import a.a.h;
/*       */ import android.app.Notification;
/*       */ import android.app.NotificationManager;
/*       */ import android.app.PendingIntent;
/*       */ import android.content.Intent;
/*       */ import android.net.DhcpInfo;
/*       */ import android.net.wifi.WifiManager;
/*       */ import android.os.Build;
/*       */ import android.util.Log;
/*       */ import com.corrodinggames.rts.R;
/*       */ import com.corrodinggames.rts.a.a;
/*       */ import com.corrodinggames.rts.a.c;
/*       */ import com.corrodinggames.rts.a.g;
/*       */ import com.corrodinggames.rts.a.l;
/*       */ import com.corrodinggames.rts.a.n;
/*       */ import com.corrodinggames.rts.game.a.a;
/*       */ import com.corrodinggames.rts.game.b.b;
/*       */ import com.corrodinggames.rts.game.e;
/*       */ import com.corrodinggames.rts.game.m;
/*       */ import com.corrodinggames.rts.game.units.an;
/*       */ import com.corrodinggames.rts.game.units.custom.ac;
/*       */ import com.corrodinggames.rts.game.units.custom.ai;
/*       */ import com.corrodinggames.rts.game.units.custom.l;
/*       */ import com.corrodinggames.rts.game.units.d.d;
/*       */ import com.corrodinggames.rts.game.units.r;
/*       */ import com.corrodinggames.rts.gameFramework.bj;
/*       */ import com.corrodinggames.rts.gameFramework.d.a.e;
/*       */ import com.corrodinggames.rts.gameFramework.e;
/*       */ import com.corrodinggames.rts.gameFramework.e.a;
/*       */ import com.corrodinggames.rts.gameFramework.f;
/*       */ import com.corrodinggames.rts.gameFramework.f.b;
/*       */ import com.corrodinggames.rts.gameFramework.l;
/*       */ import com.corrodinggames.rts.gameFramework.l.a;
/*       */ import com.corrodinggames.rts.gameFramework.w;
/*       */ import java.io.File;
/*       */ import java.io.FileOutputStream;
/*       */ import java.io.IOException;
/*       */ import java.lang.reflect.Constructor;
/*       */ import java.lang.reflect.Method;
/*       */ import java.net.InetAddress;
/*       */ import java.net.InetSocketAddress;
/*       */ import java.net.NetworkInterface;
/*       */ import java.net.Socket;
/*       */ import java.net.SocketException;
/*       */ import java.net.UnknownHostException;
/*       */ import java.util.ArrayList;
/*       */ import java.util.Collections;
/*       */ import java.util.Enumeration;
/*       */ import java.util.Iterator;
/*       */ import java.util.Locale;
/*       */ import java.util.Timer;
/*       */ import java.util.UUID;
/*       */ import java.util.concurrent.ConcurrentLinkedQueue;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ public final class ad
/*       */ {
/*       */   public static final boolean a = false;
/*       */   public static boolean b = true;
/*   144 */   public ac c = new ac();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public int d;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   ArrayList e;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean f;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   234 */   public int g = 25;
/*       */   
/*       */   public boolean h;
/*       */   
/*       */   public float i;
/*       */   
/*       */   public float j;
/*       */   
/*       */   public boolean k = false;
/*       */   
/*       */   public int l;
/*       */   
/*       */   public String m;
/*       */   
/*       */   public boolean n;
/*       */   
/*       */   public boolean o;
/*       */   
/*       */   public boolean p;
/*       */   
/*       */   public boolean q;
/*       */   
/*   256 */   public int r = 5005;
/*       */   
/*       */   public String s;
/*       */   
/*       */   public boolean t = false;
/*   261 */   public long u = 1L;
/*       */   
/*       */   public boolean v = false;
/*       */   
/*       */   public String w;
/*       */   
/*       */   private boolean bG;
/*       */   
/*       */   public m x;
/*       */   
/*       */   public boolean y;
/*       */   
/*       */   private boolean bH = false;
/*       */   
/*       */   public volatile boolean z = false;
/*       */   
/*       */   public boolean A;
/*       */   
/*       */   public boolean B;
/*       */   
/*       */   public String C;
/*       */   
/*       */   public boolean D = false;
/*       */   
/*       */   public boolean E;
/*       */   
/*       */   public boolean F;
/*   288 */   public int G = 0;
/*       */ 
/*       */   
/*   291 */   private volatile float bI = 1.0F;
/*       */   
/*   293 */   public volatile float H = 1.0F; public Float I;
/*       */   public String J;
/*       */   public boolean K;
/*       */   public int L;
/*       */   public int M;
/*       */   public int N;
/*       */   public int O;
/*       */   public String P;
/*       */   
/*       */   public strictfp String a(String paramString) {
/*   303 */     paramString = paramString.trim();
/*   304 */     paramString = paramString.replace(" ", "_");
/*       */     
/*   306 */     this.w = paramString;
/*       */ 
/*       */     
/*   309 */     l l = l.u();
/*   310 */     if (this.w != null && !this.w.equals(l.by.lastNetworkPlayerName)) {
/*       */       
/*   312 */       l.by.lastNetworkPlayerName = this.w;
/*   313 */       l.by.save();
/*       */     } 
/*       */ 
/*       */     
/*   317 */     return paramString;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(float paramFloat, String paramString) {
/*   325 */     if (paramFloat < 0.1D) {
/*       */ 
/*       */ 
/*       */       
/*   329 */       a("setCurrentStepRate:" + paramFloat + " is too small, source:" + paramString, true);
/*       */ 
/*       */       
/*       */       return;
/*       */     } 
/*       */     
/*   335 */     this.bI = paramFloat;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp float a() {
/*   340 */     return this.bI;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   356 */   public int Q = -1;
/*       */   
/*   358 */   public int R = 0;
/*       */   
/*       */   public boolean S;
/*       */   
/*       */   public float T;
/*       */   
/*       */   boolean U;
/*       */   
/*       */   public float V;
/*       */   
/*       */   public float W;
/*       */   
/*       */   public boolean X;
/*       */   
/*       */   public float Y;
/*       */   public boolean Z;
/*       */   public boolean aa;
/*   375 */   public int ab = -1;
/*       */   
/*   377 */   public int ac = 300;
/*       */   
/*       */   public boolean ad;
/*       */   
/*       */   public boolean ae;
/*       */   
/*       */   public boolean af;
/*       */   
/*       */   public long ag;
/*       */   
/*   387 */   public ArrayList ah = new ArrayList();
/*       */ 
/*       */   
/*       */   public strictfp void b() {
/*   391 */     for (aj aj1 : this.ah)
/*       */     {
/*   393 */       aj1.b = 0L;
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   424 */   public aj ai = new aj(this, "Unit Pos");
/*   425 */   public aj aj = new aj(this, "Unit Dir", false);
/*       */   
/*   427 */   public aj ak = new aj(this, "Unit Hp");
/*   428 */   public aj al = new aj(this, "Unit Id");
/*   429 */   public aj am = new aj(this, "Waypoints");
/*   430 */   public aj an = new aj(this, "Waypoints Pos");
/*   431 */   public aj ao = new aj(this, "Team Credits");
/*   432 */   public aj ap = new aj(this, "UnitPaths");
/*       */   
/*   434 */   public aj aq = new aj(this, "Unit Count");
/*       */ 
/*       */   
/*   437 */   public aj ar = new aj(this, "Team Info", false);
/*       */   
/*   439 */   public aj as = new aj(this, "Team 1 Credits", false);
/*   440 */   public aj at = new aj(this, "Team 2 Credits", false);
/*   441 */   public aj au = new aj(this, "Team 3 Credits", false);
/*       */ 
/*       */   
/*   444 */   public aj av = new aj(this, "Command center2", false);
/*   445 */   public aj aw = new aj(this, "Command center3", false);
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean ax;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean ay = true;
/*       */ 
/*       */   
/*       */   public int az;
/*       */ 
/*       */   
/*       */   public int aA;
/*       */ 
/*       */   
/*       */   public static boolean aB;
/*       */ 
/*       */   
/*   465 */   float aC = 0.0F;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   long aD;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean aE;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*   481 */   public int aF = 5;
/*   482 */   public int aG = 5;
/*       */ 
/*       */   
/*   485 */   public ah aH = new ah();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(ap paramap) {
/*   632 */     l l = l.u();
/*       */     
/*   634 */     paramap.c(0);
/*       */     
/*   636 */     this.aH.a(paramap);
/*       */     
/*   638 */     paramap.a(l.bk);
/*   639 */     paramap.a(l.bl);
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(k paramk) {
/*   645 */     l l = l.u();
/*       */     
/*   647 */     paramk.d();
/*       */     
/*   649 */     this.aH.a(paramk);
/*       */     
/*   651 */     l.bk = paramk.f();
/*   652 */     l.bl = paramk.f();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp ah c() {
/*       */     ah ah1;
/*   665 */     if (this.A) {
/*       */       
/*   667 */       ah1 = this.aH;
/*       */     }
/*   669 */     else if (this.F) {
/*       */       
/*   671 */       ah1 = this.aH.c();
/*       */     
/*       */     }
/*       */     else {
/*       */ 
/*       */       
/*   677 */       ah1 = null;
/*   678 */       l.b("getChangeableSetup", "Clicked but not server or proxy controller");
/*       */     } 
/*       */     
/*   681 */     return ah1;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void d() {
/*   687 */     if (this.D)
/*       */     {
/*       */       
/*   690 */       (l.u()).by.aiDifficulty = this.aH.f;
/*       */     }
/*       */     
/*   693 */     if (this.bf) {
/*       */       
/*   695 */       l.f("updateAIDifficulty with gameHasBeenStarted=true");
/*       */     }
/*       */     else {
/*       */       
/*   699 */       for (byte b = 0; b < m.a; b++) {
/*       */         
/*   701 */         m m1 = m.n(b);
/*   702 */         if (m1 != null)
/*       */         {
/*   704 */           if (m1.r)
/*       */           {
/*   706 */             m1.s = this.aH.f;
/*       */           }
/*       */         }
/*       */       } 
/*       */     } 
/*       */ 
/*       */     
/*   713 */     ah();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(ah paramah) {
/*   723 */     if (this.A) {
/*       */ 
/*       */       
/*   726 */       d();
/*       */       
/*   728 */       H();
/*       */       
/*   730 */       E();
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*   735 */       l.k();
/*       */     
/*       */     }
/*   738 */     else if (this.F) {
/*       */       
/*   740 */       b(paramah);
/*       */     }
/*       */     else {
/*       */       
/*   744 */       l.d("applyChangedSetup but not server or proxy controller");
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   private strictfp void b(ah paramah) {
/*   751 */     l l = l.u();
/*       */     
/*   753 */     l.d("applyProxyControl");
/*       */ 
/*       */     
/*   756 */     ah ah1 = this.aH;
/*       */ 
/*       */ 
/*       */     
/*   760 */     if (!ah1.b.equals(paramah.b)) {
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*   766 */       String str = g.d(paramah.b);
/*   767 */       l.bF.i("-map '" + str + "'");
/*       */     } 
/*       */     
/*   770 */     if (ah1.e != paramah.e) {
/*       */       
/*   772 */       String str = !paramah.e ? "true" : "false";
/*   773 */       l.bF.i("-revealedmap " + str);
/*       */     } 
/*       */     
/*   776 */     if (ah1.d != paramah.d) {
/*       */       
/*   778 */       String str = l.bF.a(paramah.d);
/*   779 */       l.bF.i("-fog " + str);
/*       */     } 
/*       */     
/*   782 */     if (ah1.c != paramah.c) {
/*       */       
/*   784 */       int i = l.bF.e(paramah.c);
/*   785 */       l.bF.i("-credits " + i);
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*   794 */     if (!f.j(ah1.h, paramah.h))
/*       */     {
/*   796 */       l.bF.i("-income " + f.a(paramah.h, 1));
/*       */     }
/*       */     
/*   799 */     if (ah1.i != paramah.i) {
/*       */       
/*   801 */       String str = !paramah.i ? "true" : "false";
/*   802 */       l.bF.i("-nukes " + str);
/*       */     } 
/*       */     
/*   805 */     if (ah1.f != paramah.f)
/*       */     {
/*   807 */       l.bF.i("-ai " + paramah.f);
/*       */     }
/*       */     
/*   810 */     if (ah1.g != paramah.g)
/*       */     {
/*   812 */       l.bF.i("-startingunits " + paramah.g);
/*       */     }
/*       */ 
/*       */     
/*   816 */     if (ah1.k != paramah.k) {
/*       */       
/*   818 */       String str = paramah.k ? "true" : "false";
/*   819 */       l.bF.i("-sharedControl " + str);
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp String e() {
/*   832 */     if (this.aH.d == 0)
/*       */     {
/*   834 */       return "No fog";
/*       */     }
/*   836 */     if (this.aH.d == 1)
/*       */     {
/*   838 */       return "Basic fog";
/*       */     }
/*   840 */     if (this.aH.d == 2)
/*       */     {
/*   842 */       return "Line of Sight";
/*       */     }
/*   844 */     return "Unknown";
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp String a(int paramInt) {
/*   849 */     if (paramInt == 0)
/*       */     {
/*   851 */       return "off";
/*       */     }
/*   853 */     if (paramInt == 1)
/*       */     {
/*   855 */       return "basic";
/*       */     }
/*   857 */     if (paramInt == 2)
/*       */     {
/*   859 */       return "los";
/*       */     }
/*   861 */     return "Unknown";
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp String b(int paramInt) {
/*   877 */     return c(paramInt);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp String c(int paramInt) {
/*   882 */     if (paramInt == -2)
/*       */     {
/*   884 */       return "Very Easy";
/*       */     }
/*   886 */     if (paramInt == -1)
/*       */     {
/*   888 */       return "Easy";
/*       */     }
/*   890 */     if (paramInt == 0)
/*       */     {
/*   892 */       return "Medium";
/*       */     }
/*   894 */     if (paramInt == 1)
/*       */     {
/*   896 */       return "Hard";
/*       */     }
/*   898 */     if (paramInt == 2)
/*       */     {
/*   900 */       return "Very Hard";
/*       */     }
/*   902 */     if (paramInt == 3)
/*       */     {
/*   904 */       return "Impossible";
/*       */     }
/*   906 */     return "Unknown";
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp String f() {
/*   927 */     return d(this.aH.g);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp ArrayList g() {
/*   932 */     ArrayList<Integer> arrayList = new ArrayList();
/*   933 */     for (byte b = 1; b <= 4; b++)
/*       */     {
/*   935 */       arrayList.add(Integer.valueOf(b));
/*       */     }
/*       */ 
/*       */ 
/*       */     
/*   940 */     arrayList.addAll(l.s());
/*       */     
/*   942 */     return arrayList;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp String d(int paramInt) {
/*   947 */     if (paramInt == 1)
/*       */     {
/*   949 */       return "Normal (1 builder)";
/*       */     }
/*   951 */     if (paramInt == 2)
/*       */     {
/*   953 */       return "Small Army";
/*       */     }
/*   955 */     if (paramInt == 3)
/*       */     {
/*   957 */       return "3 Engineers";
/*       */     }
/*   959 */     if (paramInt == 4)
/*       */     {
/*   961 */       return "3 Engineers (No Command Center)";
/*       */     }
/*   963 */     if (paramInt == 5)
/*       */     {
/*   965 */       return "Experimental Spider";
/*       */     }
/*   967 */     if (paramInt == 9)
/*       */     {
/*   969 */       return "Custom";
/*       */     }
/*       */     
/*   972 */     l l = l.b(paramInt);
/*   973 */     if (l != null)
/*       */     {
/*   975 */       return l.e();
/*       */     }
/*       */     
/*   978 */     return "Unknown";
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp String h() {
/*   983 */     if (this.aH.c == 0)
/*       */     {
/*   985 */       return "Default ($" + i() + ")";
/*       */     }
/*   987 */     return "$" + i();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public final strictfp int i() {
/*  1002 */     return e(this.aH.c);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp int e(int paramInt) {
/*  1020 */     if (paramInt == 0)
/*       */     {
/*  1022 */       return 4000;
/*       */     }
/*  1024 */     if (paramInt == 1)
/*       */     {
/*  1026 */       return 0;
/*       */     }
/*  1028 */     if (paramInt == 2)
/*       */     {
/*  1030 */       return 1000;
/*       */     }
/*  1032 */     if (paramInt == 3)
/*       */     {
/*  1034 */       return 2000;
/*       */     }
/*  1036 */     if (paramInt == 4)
/*       */     {
/*  1038 */       return 5000;
/*       */     }
/*  1040 */     if (paramInt == 5)
/*       */     {
/*  1042 */       return 10000;
/*       */     }
/*  1044 */     if (paramInt == 6)
/*       */     {
/*  1046 */       return 50000;
/*       */     }
/*  1048 */     if (paramInt == 7)
/*       */     {
/*  1050 */       return 100000;
/*       */     }
/*  1052 */     if (paramInt == 8)
/*       */     {
/*  1054 */       return 200000;
/*       */     }
/*       */     
/*  1057 */     return 999;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*  1063 */   public String aI = null;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public k aJ;
/*       */ 
/*       */ 
/*       */   
/*       */   public k aK;
/*       */ 
/*       */ 
/*       */   
/*  1076 */   public a aL = new a();
/*       */   
/*       */   Thread aM;
/*       */   
/*       */   am aN;
/*       */   
/*       */   Thread aO;
/*       */   
/*       */   am aP;
/*       */   
/*       */   Timer aQ;
/*       */   
/*       */   as aR;
/*       */   
/*       */   Thread aS;
/*       */   af aT;
/*       */   c aU;
/*  1093 */   public ConcurrentLinkedQueue aV = new ConcurrentLinkedQueue();
/*       */   
/*  1095 */   ConcurrentLinkedQueue aW = new ConcurrentLinkedQueue();
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   boolean aX;
/*       */ 
/*       */ 
/*       */   
/*  1104 */   volatile int aY = 1;
/*  1105 */   Object aZ = new Object();
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   String ba;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   String bb;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public String bc;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public Boolean bd;
/*       */ 
/*       */ 
/*       */   
/*       */   public Boolean be;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bf;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bg = false;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bh;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bi;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bj;
/*       */ 
/*       */ 
/*       */   
/*       */   public boolean bk;
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean j() {
/*  1159 */     return this.bf;
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean k() {
/*  1165 */     return this.c.e();
/*       */   }
/*       */ 
/*       */   
/*       */   public synchronized strictfp void a(boolean paramBoolean, String paramString, Boolean paramBoolean1) {
/*  1170 */     this.be = Boolean.valueOf(paramBoolean);
/*       */ 
/*       */     
/*  1173 */     this.bc = paramString;
/*  1174 */     this.bd = paramBoolean1;
/*       */ 
/*       */     
/*  1177 */     l.k();
/*       */   }
/*       */   
/*  1180 */   public String bl = null;
/*  1181 */   public ConcurrentLinkedQueue bm = new ConcurrentLinkedQueue(); public e bn; public e bo; public final Object bp; public boolean bq; float br; float bs; int bt; int bu; boolean bv; boolean bw; public Socket bx; public String by; public boolean bz;
/*       */   boolean bA;
/*       */   boolean bB;
/*       */   final Object bC;
/*       */   Timer bD;
/*       */   
/*       */   strictfp void a(g paramg) {
/*  1188 */     for (g g1 : this.bm) {
/*       */       
/*  1190 */       if (g1.a && g1.c.equals(paramg.c) && g1.g == paramg.g)
/*       */       {
/*       */         
/*  1193 */         g1.n = l();
/*       */       }
/*       */     } 
/*  1196 */     paramg.n = l();
/*  1197 */     this.bm.add(paramg);
/*       */ 
/*       */     
/*  1200 */     n.j();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp long l() {
/*  1208 */     return System.currentTimeMillis();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void m() {
/*  1275 */     a(false);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void n() {
/*  1280 */     a(true);
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void o() {
/*  1286 */     this.bH = false;
/*       */     
/*  1288 */     this.bG = false;
/*  1289 */     this.x = null;
/*       */     
/*  1291 */     this.o = false;
/*       */ 
/*       */     
/*  1294 */     this.R = 0;
/*  1295 */     this.G = 0;
/*  1296 */     this.u = 1L;
/*       */     
/*  1298 */     a(1.0F, "new");
/*       */     
/*  1300 */     this.T = 10.0F;
/*       */     
/*  1302 */     this.K = false;
/*       */     
/*  1304 */     this.N = 10;
/*  1305 */     this.O = 0;
/*       */ 
/*       */     
/*  1308 */     this.S = false;
/*  1309 */     this.U = false;
/*       */     
/*  1311 */     this.af = false;
/*  1312 */     this.ae = false;
/*       */     
/*  1314 */     this.V = 0.0F;
/*  1315 */     this.W = 0.0F;
/*       */     
/*  1317 */     this.X = false;
/*  1318 */     this.Z = false;
/*       */     
/*  1320 */     this.bf = false;
/*       */     
/*  1322 */     this.bg = false;
/*       */     
/*  1324 */     this.bh = false;
/*       */ 
/*       */     
/*  1327 */     this.bi = false;
/*  1328 */     this.bj = false;
/*       */     
/*  1330 */     this.bk = false;
/*       */     
/*  1332 */     this.aa = false;
/*       */     
/*  1334 */     this.ab = -1;
/*  1335 */     this.ag = 0L;
/*       */     
/*  1337 */     this.bv = false;
/*       */     
/*  1339 */     b();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  1349 */     this.ax = false;
/*       */     
/*  1351 */     this.ay = true;
/*  1352 */     this.az = 0;
/*  1353 */     this.aA = 0;
/*       */     
/*  1355 */     this.aC = 0.0F;
/*       */ 
/*       */     
/*  1358 */     this.br = 0.0F;
/*  1359 */     this.bs = 0.0F;
/*  1360 */     this.bt = 0;
/*  1361 */     this.bu = -1000;
/*       */ 
/*       */     
/*  1364 */     ao.i = 55;
/*  1365 */     ao.j = 66;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(boolean paramBoolean) {
/*  1372 */     this.z = false;
/*  1373 */     this.A = false;
/*       */     
/*  1375 */     this.e = null;
/*       */     
/*  1377 */     this.D = false;
/*       */     
/*  1379 */     this.B = false;
/*  1380 */     this.C = null;
/*       */     
/*  1382 */     this.v = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  1390 */     this.F = false;
/*  1391 */     this.E = false;
/*       */     
/*  1393 */     this.aE = false;
/*       */     
/*  1395 */     this.y = false;
/*       */     
/*  1397 */     o();
/*       */     
/*  1399 */     this.P = null;
/*       */ 
/*       */ 
/*       */     
/*  1403 */     this.l = 0;
/*       */     
/*  1405 */     this.h = false;
/*  1406 */     this.i = 0.0F;
/*  1407 */     this.j = 0.0F;
/*       */     
/*  1409 */     this.bB = false;
/*       */ 
/*       */     
/*  1412 */     this.aK = null;
/*       */ 
/*       */ 
/*       */     
/*  1416 */     this.aG = (l.u()).by.teamUnitCapHostedGame;
/*       */     
/*  1418 */     if (this.aG < 1)
/*       */     {
/*  1420 */       this.aG = 1;
/*       */     }
/*       */     
/*  1423 */     this.aF = this.aG;
/*       */     
/*  1425 */     this.aH.g = 1;
/*  1426 */     this.aH.h = 1.0F;
/*  1427 */     this.aH.i = false;
/*  1428 */     this.aH.j = false;
/*       */     
/*  1430 */     this.aH.k = false;
/*       */     
/*  1432 */     this.aH.c = 0;
/*       */     
/*  1434 */     this.aH.l = false;
/*  1435 */     this.aH.m = false;
/*       */     
/*  1437 */     this.aH.n = true;
/*       */     
/*  1439 */     this.aH.o = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  1445 */     this.aL.c();
/*       */     
/*  1447 */     (l.u()).bA.g();
/*       */ 
/*       */     
/*  1450 */     if ("<CHAT ONLY>".equals(this.aH.b)) {
/*       */ 
/*       */ 
/*       */       
/*  1454 */       l.d("Chat only map selection - restarting");
/*  1455 */       this.aH.a();
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  1460 */     if (!paramBoolean)
/*       */     {
/*  1462 */       m.B();
/*       */     }
/*       */     
/*  1465 */     String str = ac.b(this.n);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void p() {}
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public synchronized strictfp void b(String paramString) {
/*  1484 */     l l = l.u();
/*       */     
/*  1486 */     l.d("Disconnect: " + paramString);
/*       */     
/*  1488 */     if (this.A) {
/*       */       
/*  1490 */       ai();
/*       */       
/*  1492 */       n.d();
/*       */       
/*  1494 */       if (this.aN != null) {
/*       */         
/*  1496 */         this.aN.b();
/*       */         
/*       */         try {
/*  1499 */           if (this.aM != null)
/*       */           {
/*  1501 */             this.aM.join();
/*       */           
/*       */           }
/*       */         }
/*  1505 */         catch (InterruptedException interruptedException) {}
/*       */         
/*  1507 */         this.aN = null;
/*  1508 */         this.aM = null;
/*       */       } 
/*       */       
/*  1511 */       if (this.aP != null) {
/*       */         
/*  1513 */         this.aP.b();
/*       */         
/*       */         try {
/*  1516 */           if (this.aO != null)
/*       */           {
/*  1518 */             this.aO.join();
/*       */           
/*       */           }
/*       */         }
/*  1522 */         catch (InterruptedException interruptedException) {}
/*       */         
/*  1524 */         this.aP = null;
/*  1525 */         this.aO = null;
/*       */       } 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  1531 */       if (this.aQ != null) {
/*       */         
/*  1533 */         this.aQ.cancel();
/*  1534 */         this.aQ = null;
/*  1535 */         this.aR = null;
/*       */       } 
/*       */ 
/*       */ 
/*       */       
/*  1540 */       if (this.aT != null) {
/*       */         
/*  1542 */         this.aT.b();
/*  1543 */         this.aT = null;
/*  1544 */         this.aS = null;
/*       */       } 
/*       */     } 
/*       */ 
/*       */     
/*  1549 */     n(paramString);
/*       */     
/*  1551 */     a.a().j();
/*       */     
/*  1553 */     synchronized (this.bp)
/*       */     
/*  1555 */     { this.z = false;
/*  1556 */       this.A = false;
/*       */       
/*  1558 */       this.e = null;
/*       */ 
/*       */       
/*       */       try {
/*  1562 */         wait(50L);
/*       */       }
/*  1564 */       catch (InterruptedException interruptedException) {
/*       */         
/*  1566 */         interruptedException.printStackTrace();
/*       */       } 
/*       */       
/*  1569 */       this.bf = false;
/*       */ 
/*       */       
/*  1572 */       l.bJ.d();
/*       */       
/*  1574 */       l.c();
/*       */       
/*  1576 */       ad();
/*       */       
/*  1578 */       this.bq = false;
/*  1579 */       this.bp.notifyAll(); } 
/*       */   }
/*       */   public strictfp void q() { synchronized (this.bp) { if (!this.z) return;  this.bq = true; try { this.bp.wait(); } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }  }  }
/*       */   public strictfp void a(c paramc) { this.aV.remove(paramc); }
/*       */   private synchronized strictfp void ap() { Iterator<c> iterator = this.aV.iterator(); while (iterator.hasNext()) { c c1 = iterator.next(); if (c1.a) iterator.remove();  }  }
/*       */   strictfp void a(byte[] paramArrayOfbyte, c paramc) { if (!l.an()) { Log.d("RustedWarfare", "Ignoring incoming resync tagged as debug only"); } else { if (paramc.s) { Log.d("RustedWarfare", "Ignoring desync client save, as past desync was already saved"); return; }  paramc.s = true; Log.d("RustedWarfare", "Saving client save for debugging"); String str1 = "desyncs/"; String str2 = "desync_" + f.a("d MMM yyyy HH.mm.ss") + "_" + paramc.c; File file = new File(str1 + str2); file.getParentFile().mkdirs(); try { FileOutputStream fileOutputStream = new FileOutputStream(file); fileOutputStream.write(paramArrayOfbyte); fileOutputStream.close(); } catch (IOException iOException) { iOException.printStackTrace(); }  }  }
/*       */   public strictfp void r() { if (this.bv) return;  l.d("Adding quick resync command"); l l = l.u(); e e1 = l.bN.b(); e1.i = m.g; e1.r = true; e1.u = 200; l.bF.a(e1); this.bv = true; }
/*       */   public strictfp void s() { l l = l.u(); ap ap = new ap(); l.bI.a(ap); try { ap.a(); } catch (IOException iOException) { iOException.printStackTrace(); }  byte[] arrayOfByte = ap.d(); ap.h(); if (this.A) for (c c1 : this.aV) { if (c1.u) { c1.u = false; c1.t = false; a(c1, arrayOfByte, this.k, false); }  }   l.d("Loading quick resync save data (bytes:" + arrayOfByte.length + ")"); k k1 = new k(arrayOfByte); l.a("Game resync (quick)...", true); int i = l.bg; int j = l.bh; l.bI.a(k1, true, true, true); l.bg = i; l.bh = j; this.R = l.bg + 1; this.aa = false; this.ab = this.R + 1; this.ag = 0L; for (c c1 : this.aV) c1.t = false;  this.bv = false; this.br = 0.0F; this.bs = 0.0F; if (this.bt < 1) this.bt++;  this.bu = l.bg; }
/*       */   private synchronized strictfp void c(float paramFloat) { l l = l.u(); boolean bool1 = false; boolean bool2 = false; boolean bool3 = false; this.br += paramFloat; for (c c1 : this.aV) { if (c1.u) bool1 = true;  if (c1.t) if (c1.v < 4 || this.br > 3600.0F) bool3 = true;   }  if (bool3) { this.bs += paramFloat; if (this.bt == 0) { if (this.bs > 60.0F) bool2 = true;  } else if (this.bt == 1) { if (this.bs > 420.0F) bool2 = true;  } else if (this.bt == 2) { if (this.bs > 3600.0F) bool2 = true;  } else if (this.bt == 3) { if (this.bs > 14400.0F) bool2 = true;  }  }  if (aB && bool2) { l.d("disableDesyncFixing==true, running quick resync instead"); bool2 = false; bool1 = true; }  if (!bool2 && bool1) if (b) { r(); } else { bool2 = true; }   if (bool2) { String str = ""; for (c c1 : this.aV) { if (c1.u || c1.t) { if (!str.equals("")) str = str + ", ";  str = str + c1.e(); }  }  h("Resyncing game for " + str + "..."); aq(); a(this.k, false, true); }  }
/*       */   private strictfp void aq() { l l = l.u(); this.br = 0.0F; this.bs = 0.0F; this.bt++; this.bu = l.bg; for (c c1 : this.aV) { c1.u = false; c1.t = false; }  }
/*       */   private strictfp void n(String paramString) { for (c c1 : this.aV) c1.a(paramString);  this.aV.clear(); this.aW.clear(); this.aY = 1; this.aX = false; }
/*       */   public strictfp long t() { boolean bool = false; if (bool) { l.d("New id set:" + this.u + '\001'); l.M(); }  return this.u++; }
/*       */   public strictfp long u() { return this.u; }
/*       */   public strictfp void a(long paramLong) { this.u = paramLong; }
/*       */   public strictfp boolean a(boolean paramBoolean, int paramInt) { for (c c1 : this.aV) { if (c1.n && c1.g() && !c1.q) if (!c1.A) { if (paramBoolean) h("Still waiting on: " + c1.e());  return false; }   }  return true; }
/*       */   public strictfp int v() { ArrayList<e> arrayList = new ArrayList(); byte b = 0; for (c c1 : this.aV) { if (c1.n && c1.g() && !c1.q) { e e1 = c1.w; if (e1 != null) { if (arrayList.contains(e1)) continue;  arrayList.add(e1); }  b++; }  }  return b; }
/*       */   public strictfp int w() { byte b = 0; for (c c1 : this.aV) { if (c1.n && !c1.q) b++;  }  return b; }
/*       */   public strictfp int x() { int i = 0; i += v(); if (!l.an()) i++;  return i; }
/*       */   public strictfp void c(String paramString) { Log.b("RustedWarfare", "network:" + paramString); }
/*       */   public static strictfp void d(String paramString) { l.d("network debug: " + paramString); }
/*       */   public strictfp void e(String paramString) { Log.d("RustedWarfare", "reportProblem:" + paramString); if (this.bf) { a((c)null, -1, (String)null, paramString); } else { a((c)null, -1, (String)null, paramString); }  }
/*       */   public static strictfp void f(String paramString) { a(paramString, false); }
/*       */   public static strictfp void g(String paramString) { a(paramString, true); }
/*       */   public static strictfp void a(String paramString, boolean paramBoolean) { l l = l.u(); ad ad1 = l.bF; String str = "desync:" + paramString; l.b(str); l.M(); ad1.az++; if (ad1.ay) { String str1; if (ad1.az > 2 || aB) paramBoolean = true;  if (ad1.az > 10) { str1 = "<suppressing desync errors>"; ad1.ay = false; paramBoolean = true; } else { str1 = str; }  if (paramBoolean) str1 = "-i " + str1;  ad1.k(str1); }  }
/*       */   public static strictfp void a(String paramString1, String paramString2) { l l = l.u(); String str = paramString2; l.bJ.a(-1, paramString1, str, l.bg); if (l.bA != null && l.bA.e != null) { l.bA.e.a(paramString1, str); } else { l.f("interfaceEngine/messageInterface==null"); }  }
/*       */   public strictfp void y() {}
/*       */   public strictfp void a(e parame) { l l = l.u(); parame.c = this.R; parame.g(); l.bN.b.add(parame); }
/*       */   public strictfp void z() { l l = l.u(); this.ab = l.bg; this.ag = 0L; b(); for (w w : w.dK) { if (w instanceof r) { r r = (r)w; this.ag = (long)((float)this.ag + r.dH * 1000.0F); this.ag = (long)((float)this.ag + r.dI * 1000.0F); this.ag = (long)((float)this.ag + r.bY * 1.0F); this.ag += r.dA; this.ai.b += Float.floatToRawIntBits(r.dH); this.ai.b += Float.floatToRawIntBits(r.dI); this.aj.b += Float.floatToRawIntBits(r.bL); this.ak.b = (long)((float)this.ak.b + r.bY); this.al.b += r.dA; if (w instanceof d) { d d = (d)r; this.av.b = (long)((float)this.av.b + d.f * 2.0F); this.aw.b += d.h; }  an an = r.ap(); if (an != null) { this.am.b += an.j(); this.an.b = (long)((float)this.an.b + an.g() * 1000.0F); }  this.ap.b += r.aI(); }  }  for (byte b = 0; b < m.a; b++) { m m1 = m.n(b); if (m1 != null) { this.ao.b += m1.m; if (b == 0) this.as.b += m1.m;  if (b == 1) this.at.b += m1.m;  if (b == 2) this.au.b += m1.m;  this.aq.b += m1.s(); this.ar.b += (b + m1.s * 100 + m1.o * 1000 + (m1.r ? b : 0) * 10000); }  }  this.ax = false; }
/*       */   public strictfp void A() { for (c c1 : this.aV) { if (c1.n) if (c1.b() == -2 || c1.b() > 500 || c1.b() < 0);  }  }
/*       */   public strictfp void B() { l l = l.u(); String str = ""; ArrayList arrayList = m.a(true); for (m m1 : arrayList) { if (m1 != null) { String str1 = "unnamed"; if (m1.q != null) str1 = m1.q;  String str2 = " " + m1.u(); String str3 = "•"; str = str + str3 + m1.I().toLowerCase() + " [Team " + m1.f() + "] - " + str1 + str2 + "\n"; }  }  l.d("showPlayerListPopup(): Showing playlist messagebox."); l.c("Players", str); }
/*       */   public strictfp void a(float paramFloat) { l l = l.u(); this.aC += paramFloat; if (this.aC > 60.0F) { A(); this.aC = 0.0F; }  if (this.bf) if (!this.bg) { this.bg = true; ArrayList arrayList = m.d(); byte b = 0; int i = 0; for (Integer integer : arrayList) { int j = m.a(integer.intValue(), false); if (j > i) i = j;  b++; }  if (b > 2 && i <= 1) this.bh = true;  }   if (!this.A) if (!this.bH) { V(); this.bH = true; }   if (this.A) { if (!this.U) if (a(false, 0)) { this.T = f.a(this.T, paramFloat); if (this.T == 0.0F) { this.U = true; a("", "<All players ready>"); this.c.a(); }  } else { this.V += paramFloat; this.W += paramFloat; float f = 900.0F; if (this.V > f) { this.U = true; a("", "Starting game without all players ready!"); } else if (this.W > 180.0F) { this.W = 0.0F; a(true, (int)((f - this.V) / 60.0F)); }  }   if (this.U) { boolean bool = false; if (this.ae) bool = true;  if (this.af) bool = true;  if ((((l.bg >= this.R - this.O) ? 1 : 0) & (!bool ? 1 : 0)) != 0) { int i = this.R + this.N; this.L++; boolean bool1 = false; for (byte b = 0; b < m.a; b++) { m m1 = m.n(b); if (m1 != null) if (m1.K != 0) if (!m1.x()) if (m1.K < 40) bool1 = true;     }  if (l.b() != 0) if (l.b() < 40 && !l.an()) bool1 = true;   if (bool1) this.M++;  if (this.L > 8) { float f = 1.0F; if (this.M > 4) f = 2.0F;  if (this.I != null) f = this.I.floatValue();  if (f != a()) { l.d("Changing step rate to " + f); e e1 = l.bN.b(); e1.i = m.g; e1.r = true; e1.s = f; a(e1); }  this.L = 0; this.M = 0; }  ap ap = new ap(); try { ap.a(i); byte b1 = 0; for (e e1 : l.bN.b) { if (e1.c == this.R) b1++;  }  ap.a(b1); for (e e1 : l.bN.b) { if (e1.c == this.R) e1.a(ap);  }  } catch (IOException iOException) { throw new RuntimeException(iOException); }  ar ar = ap.b(10); ar.e = true; d(ar); this.R = i; }  }  }  if (!l.bN.d.isEmpty()) { Iterator<e> iterator = l.bN.d.iterator(); while (iterator.hasNext()) { e e1 = iterator.next(); boolean bool = false; if (bool) { l.bN.c.add(e1); iterator.remove(); continue; }  if (!e1.x) e1.b();  if (e1.a()) { l.bN.c.add(e1); iterator.remove(); }  }  }  if (!this.A) { if (!l.bN.c.isEmpty()) { for (e e1 : l.bN.c) { if (e1.e()) continue;  e1.j(); ap ap = new ap(); try { e1.a(ap); } catch (IOException iOException) { throw new RuntimeException(iOException); }  d(ap.b(20)); }  l.bN.c.clear(); }  } else if (!l.bN.c.isEmpty()) { for (e e1 : l.bN.c) { if (e1.e()) continue;  if (!e1.l()) { f("Skipped command issued from server"); continue; }  e1.j(); a(e1); }  l.bN.c.clear(); }  while (!this.aW.isEmpty()) { ar ar = this.aW.remove(); try { a(ar); } catch (IOException iOException) { String str = "None"; c c1 = ar.a; if (c1 != null) { str = c1.f(); String str1 = iOException.getMessage(); if (str1 == null) str1 = "IO error";  c1.a(str1); f("IO error on processGamePacket for " + c1.e()); }  l.a("Error on processGamePacket ip:" + str, iOException); }  }  if (this.A) if (!this.z) { l.d("Skipping server updates, not networked"); } else { ap(); if (!this.ad) c(paramFloat);  }   if (!this.A) if (this.z) { boolean bool = false; for (c c1 : this.aV) { if (c1.n && !c1.a) bool = true;  }  if (this.bk && j()) { l.bA.a("Game ended by server."); l.k(); } else if (!bool && j()) { l.bA.a("Server Disconnected."); l.k(); }  if (bool) if (this.S) if (!this.A) { c c1 = O(); if (c1 != null) if (c1.P > 20000) { String str = "Receiving network data: " + c1.Q + "/" + c1.P; l.d(str); l.bA.c(str); }   }    }   if (this.z) if (this.af) l.bA.a("Game paused.", 100);   if (l.bg < this.R) this.S = false;  if (this.bq) b("queDisconnect");  }
/*       */   public strictfp void b(float paramFloat) { l l = l.u(); if (this.z) if (this.ab + this.ac < l.bg || this.ab == -1) { z(); l.bJ.c(); }   if (this.z || l.bJ.h()) if (this.K) { this.K = false; s(); }   if (!this.z) return;  if (this.A) if (!this.ax && this.ab + this.ac / 2 < l.bg && this.ab != -1) try { ap ap = new ap(); ap.a(this.ab); ap.a(this.ag); ap.a(this.ah.size()); for (aj aj1 : this.ah) ap.a(aj1.b);  ar ar = ap.b(30); h(ar); if (this.f) l.d("Sent checksum to client [" + this.ab + "]");  this.ax = true; } catch (IOException iOException) { throw new RuntimeException(iOException); }    }
/*       */   public strictfp boolean C() { l l = l.u(); if (l.bC.e()) { if (!this.bw) l.d("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + l.bC.f());  this.bw = true; return true; }  if (this.bw) l.d("shouldGameBePaused: isGoingToBlockThisFrame()==false");  this.bw = false; return false; }
/*       */   public strictfp void a(float paramFloat, boolean paramBoolean) { l l = l.u(); if (l.bg >= this.R) { if (l.bg > this.R) throw new RuntimeException("game frame:" + l.bg + " is greater then nest step:" + this.R);  this.S = true; }  if (paramBoolean) if (C()) this.S = true;   }
/*  1613 */   public strictfp void a(ar paramar) { k k1; c c1; int i; k k2; int j; float f1; long l1; float f2; c c2; l l = l.u(); if (b(paramar)) { c("filtered packet (type:" + paramar.b + ")"); return; }  switch (paramar.b) { case 10: if (this.A) { c("we are a server! we don't follow orders"); } else if (paramar.a.r) { c("ignoring command"); } else { k k3 = new k(paramar); int n = k3.f(); int i1 = k3.f(); for (byte b = 0; b < i1; b++) { e e1 = l.bN.b(); e1.c = this.R; e1.a(k3); a(e1); }  if (n < this.R) { String str = "New nextBlockingFrame:" + n + " is smaller than current step:" + this.R; f(str); }  this.R = n; }  return;case 20: if (!this.A) { c("we are not a server! skipping"); } else { k k3 = new k(paramar); c c3 = paramar.a; if (!c3.a()) { e e1 = c3.w; if (e1 == null) { c("Player is null for message ADDCLIENTCOMMAND, skipping"); } else { e e2 = l.bN.b(); e2.a(k3); e2.p = (m)e1; if (e2.r) { c("Got system action from client, ignoring (" + c3.c + ")"); e2.r = false; }  if (e2.c() == null) { f("Invalid command from '" + e1.q + "', no team found"); } else if (!e2.l()) { f("Ignored command from '" + e1.q + "', check failed"); } else { a(e2); }  }  }  }  return;case 35: k1 = new k(paramar); k1.d(); i = k1.f(); j = k1.f(); f1 = k1.g(); f2 = k1.g(); if (!this.A) if (f1 < 0.1D) a("resync packet with setCurrentStepRate:" + f1 + " is too small", true);   c2 = paramar.a; if (c2.r) { c("ignoring resync command"); } else { boolean bool1 = k1.e(); boolean bool2 = k1.e(); if (bool2) { if (!this.A) { c("we are not a server, but got a debug game save! skipping"); } else { byte[] arrayOfByte = k1.c("gameSave"); a(arrayOfByte, c2); }  } else { l.d("Reloading from network save"); if (bool1 && !this.A) a(false, true, false);  byte[] arrayOfByte = k1.c("gameSave"); l.d("Save size: " + arrayOfByte.length); if (this.k) a(arrayOfByte, c2);  l.bJ.a(arrayOfByte, l.bg, i, j, f1, f2); k k3 = new k(arrayOfByte); l.a("Resyncing game from server...", true); l.bI.a(k3, true, true, true); l.R(); l.bg = i; l.bh = j; this.R = i + 1; this.aa = false; this.ab = this.R + 1; this.ag = 0L; if (f1 < 0.1D) a("resync setCurrentStepRate:" + f1 + " is too small", true);  a(f1, "rsync"); this.H = f2; }  }  return;case 30: c1 = paramar.a; k2 = new k(paramar); j = k2.f(); l1 = k2.i(); if (this.aa) { c("PACKET_SYNCCHECKSUM: skipping frame:" + j + ", we were told to wait for resync"); } else { ap ap = new ap(); ap.c(0); ap.a(j); ap.a(this.ab); if (this.ab != j || this.ag == 0L) { ap.a(false); Log.d("RustedWarfare", "got remoteSyncFrame for:" + j + " needed:" + this.ab + " lastSyncCheckSum:" + this.ag); } else { ap.a(true); Log.d("RustedWarfare", "Running checksum"); ap.a(l1); ap.a(this.ag); boolean bool = false; if (l1 != this.ag) { f("Checksum doesn't match. Got:" + l1 + " expected:" + this.ag); bool = true; for (m m1 : m.c()) m1.q();  } else { this.aA++; }  int n = k2.f(); if (n != this.ah.size()) Log.d("RustedWarfare", "checkSumSize!=syncCheckList.size()");  ap.e("checkList"); ap.a(n); ap.a(this.ah.size()); for (aj aj1 : this.ah) { long l2 = k2.i(); ap.a(l2); ap.a(aj1.b); if (l2 != aj1.b && aj1.c) { f("[" + j + "] check(" + aj1.a + "): " + l2 + "!=" + aj1.b); bool = true; }  }  ap.a("checkList"); ap.a(bool); }  if (!this.A) { ar ar1 = ap.b(31); a(c1, ar1); }  }  return;case 31: if (!this.A) { c("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS"); } else { c1 = paramar.a; k2 = new k(paramar); k2.d(); j = k2.f(); int n = k2.f(); boolean bool = k2.e(); if (bool) { long l2 = k2.i(); long l3 = k2.i(); k2.b("checkList"); k2.f(); int i1 = k2.f(); if (i1 != this.ah.size()) Log.d("RustedWarfare", "checkSumSize!=syncCheckList.size()");  for (aj aj1 : this.ah) { long l4 = k2.i(); long l5 = k2.i(); if (l4 != l5) l.b(aj1.a + " Checksum [" + j + "]. server:" + l4 + " client:" + l5);  }  k2.d("checkList"); boolean bool1 = k2.e(); if (this.bu >= j) { c("Not marking desync, already resynced before frame: " + this.bu + "<=" + j); } else { if (!c1.t) c1.v++;  c1.t = bool1; if (!bool1) { if (this.f) l.d("checksum: client checksum match [" + j + "]");  } else { l.d("client:" + c1.e() + " desync [" + j + "]"); if (this.ad && !this.ae) { f("pauseOnDesync is active, pausing"); this.ae = true; }  }  }  } else if (this.f) { l.d("checksum for:" + c1.e() + " frameMatch==false client:" + n + " server:[" + j + "]"); }  }  return; }  c("we did not handle packet:" + paramar.b); } public synchronized strictfp boolean b(ar paramar) { if (this.A) { c c1 = paramar.a; if (c1 == null) return false;  if (!c1.n) if (paramar.b != 105 && paramar.b != 110 && paramar.b != 111 && paramar.b != 108 && paramar.b != 160) return true;   }  return false; } public synchronized strictfp void c(ar paramar) { k k3; c c2; k k2; c c1; k k1; c c4; k k5; String str1; long l1; k k4; c c3; String str3; int i; long l2; String str2; int j; boolean bool; String str4; k k6; int n; ap ap1; int i2; ArrayList<String> arrayList; int i1; byte b; String str5; ar ar1; float f; ap ap2; l l = l.u(); if (b(paramar)) { c("filtered packet (type:" + paramar.b + ")"); return; }  switch (paramar.b) { case 105: c("got PACKET_GET_SERVER_INFO"); if (!this.A) c("we are not a server! skipping"); case 106: if (this.A) { c("we are a server! we don't follow orders"); } else { k k7 = new k(paramar); c c5 = paramar.a; k7.k(); k7.f(); this.aH.a = (ai)k7.b(ai.class); this.aH.b = k7.k(); this.aH.c = k7.f(); this.aH.d = k7.f(); this.aH.e = k7.e(); this.aH.f = k7.f(); byte b1 = k7.d(); this.E = k7.e(); this.F = k7.e(); this.aE = true; if (b1 >= 1) { this.aF = k7.f(); this.aG = k7.f(); }  if (b1 >= 2) { this.aH.g = k7.f(); this.aH.h = k7.g(); this.aH.i = k7.e(); this.aH.j = k7.e(); }  if (b1 >= 3) { boolean bool1 = k7.e(); if (bool1) try { l.a(k7); this.v = true; } catch (ai ai) { b("Missing unit:" + ai.getMessage() + " d:" + ai.a); b("Server sync mismatch", ai.getMessage()); if (!l.al()) l.h(ai.getMessage());  l.d("Server sync mismatch", ai.getMessage()); }   }  if (b1 >= 4) this.aH.k = k7.e();  if (b1 >= 5) this.aH.l = k7.e();  if (b1 >= 6) this.aH.m = k7.e();  if (b1 >= 7) { this.aH.n = k7.e(); this.aH.o = k7.e(); }  l.k(); } case 115: if (this.A) { c("we are a server! we don't follow orders"); } else { k k7 = new k(paramar); k7.b(paramar.a.B); c c5 = paramar.a; int i3 = k7.f(); e e1 = null; int i4 = 8; boolean bool1 = false; if (k7.c() >= 90) { boolean bool2 = false; if (k7.c() >= 141) { bool2 = true; bool1 = k7.e(); }  i4 = k7.f(); m.b(i4, false); k7.a("teams", bool2); if (i4 > m.a) throw new IOException("Cannot load:" + i4 + " teams");  } else if (this.bf) { f("Warning old team system used in started game, stream version:" + k7.c()); }  byte b1; for (b1 = 0; b1 < i4; b1++) { e e2; m m1 = m.n(b1); boolean bool2 = k7.e(); if (!bool2) { if (m1 != null) { if (this.bf) f("Warning team:" + b1 + " removed while game is running");  m1.E(); }  } else { int i5 = k7.f(); if (m1 == null) { if (this.bf) f("Warning team:" + b1 + " added while game is running");  if (!this.A) if (m1 instanceof a) f("Warning we are a client with an AI team");   e2 = new e(b1); }  if (bool1) { e2.a(k7); } else { e2.a(k7, this.bf); }  }  if (e2 != null) if (((m)e2).i == i3) e1 = e2;   }  if (k7.c() >= 90) k7.d("teams");  this.x = (m)e1; this.aH.d = k7.f(); this.aH.c = k7.f(); this.aH.e = k7.e(); this.aH.f = k7.f(); b1 = k7.d(); this.aF = k7.f(); this.aG = k7.f(); if (b1 >= 2) { this.aH.g = k7.f(); this.aH.h = k7.g(); this.aH.i = k7.e(); this.aH.j = k7.e(); }  if (b1 >= 3) { boolean bool2 = k7.e(); if (bool2) try { l.a(k7); this.v = true; } catch (ai ai) { b("Missing unit:" + ai.getMessage() + " d:" + ai.a); b("Connection Failed", ai.getMessage()); if (!l.al()) l.h(ai.getMessage());  l.d("Connection Failed", ai.getMessage()); }   }  if (b1 >= 4) this.aH.k = k7.e();  if (b1 >= 5) this.af = k7.e();  l.k(); } case 116: if (this.A) { c("we are a server! we don't follow orders"); } else { k k7 = new k(paramar); c c5 = paramar.a; int i3 = k7.f(); boolean bool1 = k7.e(); if (bool1 && !this.bk) this.bk = bool1;  } case 160: k3 = new k(paramar); c4 = paramar.a; str3 = k3.k(); j = k3.f(); n = k3.f(); i2 = 1; if (j >= 1) i2 = k3.f();  if (c4.i) l.d("steam: request info packet");  if (j >= 2) k3.j();  if (j >= 3) k3.k();  f(c4);case 161: if (this.A) { c("we are a server! we don't PREREGISTER_INFO"); } else { k3 = new k(paramar); c4 = paramar.a; if (c4.i) l.d("steam: got info packet");  str3 = k3.k(); j = k3.f(); n = k3.f(); i2 = k3.f(); String str = k3.k(); this.P = k3.k(); c4.B = n; if (j >= 1) this.Q = k3.f();  if (this.bB) c("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");  g(c4); } case 163: if (this.A) { c("we are already a server"); } else { k3 = new k(paramar); k3.d(); int i3 = k3.f(); int i4 = k3.f(); String str = k3.j(); c("Relay version: " + i3); } case 170: c("Got 'become server' packet"); if (this.A) { c("we are already a server"); } else { c c5 = paramar.a; k k7 = new k(paramar); byte b1 = k7.d(); boolean bool1 = k7.e(); boolean bool2 = k7.e(); String str6 = k7.j(); boolean bool3 = k7.e(); boolean bool4 = k7.e(); String str7 = k7.j(); boolean bool5 = false; if (b1 >= 1) bool5 = k7.e();  c("Multicast:" + bool5); c5.p = bool5; if (bool1) c5.o = true;  if (bool2) c5.q = true;  this.B = true; this.C = str7; l.bF.m = null; l.bF.n = bool3; l.bF.p = bool4; c(false); if (l.bF.p); if (str6 != null) l.by.networkServerId = str6;  if (l.bg > 60) this.U = true;  if (!this.v && !this.bf) { l.d("enableAllCustomUnitsPossible mods:" + this.n); ac.b(this.n); this.v = true; }  } case 172: c2 = paramar.a; if (!c2.o) { c("forwarding not allowed on this connection"); } else { c("got FORWARD_CLIENT_ADD"); k k7 = new k(paramar); k7.d(); int i3 = k7.f(); String str6 = k7.k(); String str7 = k7.j(); if (a(c2, i3) != null) { c("Not adding client:" + i3 + " already exists"); } else { c c5 = a(c2, i3, str6); if (c5 != null && str7 != null) { e e1 = m.b(str6); if (e1 == null) { c("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + str6); for (m m1 : m.c()) { if (m1 != null) c("option: " + m1.q + " - " + m1.E);  }  } else { ((m)e1).D = str7; }  }  }  } case 173: c2 = paramar.a; if (!c2.o) { c("forwarding not allowed on this connection"); } else { c("got FORWARD_CLIENT_REMOVE"); k k7 = new k(paramar); k7.d(); int i3 = k7.f(); c c5 = a(c2, i3); if (c5 != null) h(c5);  } case 174: c2 = paramar.a; if (!c2.o) { c("forwarding not allowed on this connection"); } else { k k7 = new k(paramar); int i3 = k7.f(); byte[] arrayOfByte = k7.r(); c c5 = a(c2, i3); if (c5 == null) { c("PACKET_FORWARD_CLIENT_FROM failed, cannot find client"); } else if (!(c5.d instanceof h)) { c("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type"); } else { h h = (h)c5.d; h.d.a(arrayOfByte); }  } case 175: c("got PACKET_FORWARD_CLIENT_TO");case 176: c("got PACKET_FORWARD_CLIENT_TO_REPEATED");case 178: c("got PACKET_RECONNECT_TO"); c2 = paramar.a; if (this.A) if (!c2.o) c("we are a server, ");   k5 = new k(paramar); k5.d(); i = k5.f(); bool = k5.e(); n = k5.f(); arrayList = new ArrayList(); for (b = 0; b < n; b++) { String str = k5.k(); arrayList.add(str); }  a(arrayList, bool);case 110: c("got REGISTER_CONNECTION"); if (!this.A) { c("we are not a server! skipping"); } else { k k7 = new k(paramar); c c5 = paramar.a; String str6 = k7.k(); int i3 = k7.f(); n = k7.f(); int i4 = k7.f(); String str7 = k7.k(); String str8 = k7.j(); String str9 = null; c5.B = n; if (i3 >= 1) c5.I = k7.k();  if (i3 >= 2) str9 = k7.k();  int i5 = -1; if (i3 >= 3) i5 = k7.f();  String str10 = "MISSING"; if (i3 >= 4) str10 = k7.k();  if (str7.length() > 20) { a(c5, "Your username is too long"); c5.a("kicked"); } else { str7 = m(str7); if (str7.length() < 2) { a(c5, "Your username is too short"); c5.a("kicked"); } else { e e1 = null; if (str9 != null) { e1 = m.a(str9); if (e1 != null) c("Existing player: " + e1.i + " - " + e1.q);  }  String str = this.c.a(c5, str7, n, i4, c5.I, e1); if (str != null) { a(c5, str); c5.a("kicked"); } else if (n < this.d && !this.t) { a(c5, "Game is out of date, please update"); c5.a("kicked"); } else if (n > this.d && !this.t) { a(c5, "Your client is newer then the server"); c5.a("kicked"); } else if (!this.t && i5 != l.s()) { l.d("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i5 + " game.getAllUnitsChecksum():" + l.s()); a(c5, "Your units are different to the server's units. Game can not be synchronized"); c5.a("kicked"); } else { if (!this.t) { String str11 = f(c5.J); if (!str11.equals(str10)) { l.d("New Player kicked: Integrity Check Failed: expectedResponse=" + str11 + " clientResponse=" + str10); a(c5, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized. (Are you running a mod?)"); c5.a("kicked"); }  }  if (!this.bf) if (this.aH.o) { a(c5, "Room is locked. New players cannot join this server."); c5.a("kicked"); }   if (this.bf && e1 == null && !this.q) { a(c5, "A game has already been started on this server"); c5.a("kicked"); } else { if (this.m != null && e1 == null) { String str11 = f.e(this.m); if (!str11.equals(str8)) { if (str8 == null) { l.b("processSystemPacket", "Player tried to join but needs a password"); } else { l.b("processSystemPacket", "Player tried to join but had an incorrect password"); }  c(c5); }  }  if (c5.w == null) { synchronized (this.bC) { int i6; if (e1 == null) { i6 = m.C(); } else { i6 = e1.i; }  if (i6 == -1) if (!this.t) { a(c5, "No free slots on server"); c5.a("no free slots"); }   String str11 = this.c.a(c5, str7); if (str11 != null) { a(c5, str11); c5.a("kicked"); } else { String str12 = null; if (e1 != null) { c5.w = e1; String str13 = ""; if (this.bf) if (e1.b()) { str13 = " (Spectator)"; } else { str13 = " (Team " + e1.f() + ")"; }   h("'" + c5.w.q + "' reconnected. " + str13); c5.u = true; str12 = e1.q; e1.E = c5.m; } else { if (this.t && i6 == -1) { c5.w = new e(-3); } else { c5.w = new e(i6); c5.w.o = i6 % 2; }  if (this.bf && this.q) c5.u = true;  }  if (e1 == null && str7 != null) { ArrayList arrayList1 = ao(); for (byte b1 = 0; b1 < 10; b1++) { boolean bool1 = false; String str13 = str7; if (b1 > 0) str13 = str13 + "(" + b1 + ")";  for (m m1 : arrayList1) { if (str13.equalsIgnoreCase(m1.q)) bool1 = true;  }  if (!bool1) { str7 = str13; break; }  }  }  c5.w.q = str7; c5.w.D = str9; c5.w.E = c5.m; c5.B = n; l.b("processSystemPacket", "New player: " + str7 + ", networkVersion:" + c5.B + " existing:" + ((e1 != null) ? 1 : 0)); c5.n = true; if (e1 == null) this.c.a((m)c5.w);  l.k(); d(c5); b(c5); this.c.c(c5, str7, str12); if (e1 != null || this.q) if (this.bf) { boolean bool1 = true; a(c5, bool1); }   }  }  } else { l.b("processSystemPacket", "This connection already has a player"); }  }  }  }  }  } case 113: if (this.A) { c("we are a server! skipping: " + paramar.b); } else { a(bE); } case 117: c2 = paramar.a; if (this.A && !c2.o) { c("we are a server! skipping: " + paramar.b); } else { k5 = new k(paramar); k5.d(); i = k5.f(); String str = k5.k(); ae ae1 = new ae(); ae1.d = true; ae1.c = i; ae1.b = str; a(ae1); } case 118: return;case 140: if (!this.A) { c("we are not a server! skipping"); } else { c2 = paramar.a; k5 = new k(paramar); e e1 = c2.w; if (e1 == null) if (c2.o) { c("Allowing message from non player on forwarding connection"); e1 = this.bo; } else { c("player is null for message, skipping"); }   String str = k5.k(); k5.d(); if (str.length() > 250) str = str.substring(0, 250);  if (str.contains("\n")) str = str.replace("\n", "?");  str = o(str); if (this.c.a(c2, e1.q, str)) if (this.aL.a(c2, 60000) > this.g) { if (f.a(c2.g, System.nanoTime()) > 60000L) { c2.g = System.nanoTime(); h("Anti-spam: Too many messages from '" + c2.e() + "'"); }  if (this.f) l.d("extraDebug:" + str);  } else { a(c2, (m)e1, e1.q, str); this.c.b(c2, e1.q, str); b(c2, (m)e1, e1.q, str); }   } case 141: if (this.A) { c2 = paramar.a; if (!c2.o) c("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");  }  k2 = new k(paramar); str1 = k2.k(); i = k2.d(); str4 = k2.j(); k2.f(); n = -1; if (i >= 3) n = k2.f();  a((c)null, n, str4, str1);case 122: if (this.A) { c("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM"); } else { as(); } case 120: if (this.A) { c("error, we are a server but got: PACKET_START_GAME"); } else { k2 = new k(paramar); k2.d(); this.aH.a = (ai)k2.b(ai.class); if (this.aH.a == ai.c) { this.aJ = k2.s(); } else if (this.aH.a == ai.b) { this.aK = k2.s(); }  this.aI = k2.k(); ar(); } case 150: if (this.A) { c("error, we are a server but got: PACKET_SEND_KICK"); } else { k2 = new k(paramar); str1 = k2.k(); str1 = a.c(str1); c("we got kicked, reason:" + str1); b("I was kicked"); b("Kicked", "Kicked: " + str1); l.d("Kicked", "Kicked: " + str1); l.h("Kicked: " + str1); } case 151: c1 = paramar.a; if (this.A) if (!c1.o) c("error, we are a server but got: 151");   l1 = bj.a(); k6 = new k(paramar); n = k6.f(); i1 = k6.f(); if (k6.e()) ao.i = k6.f();  if (k6.e()) ao.j = k6.f();  str5 = ""; if (i1 == 0) str5 = "" + ao.i;  if (i1 == 1) str5 = "" + ao.j;  if (i1 == 2) str5 = f(ao.i);  if (i1 == 3) str5 = f.c(ao.i + "|" + ao.j);  if (i1 == 4) str5 = f.c(ao.i + "|" + ao.j);  if (i1 == 5 || i1 == 6) { String str6 = k6.k(); String str7 = k6.k(); int i3 = k6.f(); if (i1 == 6) str7 = str7 + ao.i;  if (i3 > 10000000) { str5 = "max"; } else { str5 = "-1"; for (byte b1 = 0; b1 <= i3; b1++) { if (f.c(str7 + b1).equals(str6)) { str5 = "" + b1; break; }  }  }  }  if (i1 == 7) { String str = k6.k(); int i3 = k6.f(); if (i3 > 10000) { str5 = "max"; } else { str5 = ""; for (byte b1 = 0; b1 < i3; b1++) str5 = str5 + str;  }  }  f = bj.a(l1); ap2 = new ap(); ap2.a(n); ap2.a(i1); ap2.c(str5); ap2.a(f); a(c1, ap2.b(152));case 112: if (!this.A) { c("we are not a server! skipping"); } else { c1 = paramar.a; k k7 = new k(paramar); c1.z = k7.e(); c1.A = k7.e(); } case 108: c1 = paramar.a; k4 = new k(paramar); l2 = k4.i(); k4.d(); ap1 = new ap(); ap1.a(l2); ap1.c(1); i1 = l.b(); if (i1 > 130) i1 = 130;  ap1.c(i1); ar1 = ap1.b(109); a(c1, ar1);case 109: if (!this.A) { c("we are not a server! skipping"); } else { long l3 = System.currentTimeMillis(); c c5 = paramar.a; k6 = new k(paramar); long l4 = k6.i(); byte b1 = k6.d(); byte b2 = 0; if (b1 >= 1) b2 = k6.d();  int i3 = (int)(l3 - l4); c5.x = i3; c5.y = l3; if (c5.w != null) { c5.w.L = i3; c5.w.M = l3; c5.w.K = b2; }  if (c5.o) if (this.A && this.B && this.x != null) { this.x.L = i3; this.x.M = l3; }   if (!this.bf) l.k();  } case 111: k1 = new k(paramar); c3 = paramar.a; str2 = null; try { str2 = k1.k(); } catch (IOException iOException) { l.a("Error reading disconnect reason", iOException); }  c("Got a disconnect packet:" + str2); if (c3 != null) c3.a(false, false);  if (!this.A); }  c("we did not handle packet:" + paramar.b); } private strictfp String o(String paramString) { paramString = paramString.replace("\000", "."); boolean bool = false; for (char c1 : paramString.toCharArray()) { if (Character.isISOControl(c1)) { bool = true; break; }  }  if (bool) { StringBuilder stringBuilder = new StringBuilder(); for (char c1 : paramString.toCharArray()) { if (!Character.isISOControl(c1)) stringBuilder.append(c1);  }  paramString = stringBuilder.toString(); }  return paramString; } public strictfp void D() { b((String)null, (String)null); } public strictfp void b(String paramString1, String paramString2) { l.a(paramString1, paramString2); this.c.d(); } public synchronized strictfp void E() { for (c c1 : this.aV) { if (c1.n) b(c1);  }  } public synchronized strictfp void b(c paramc) { if (!this.A) { c("sendServerInfo: we are not a server!"); return; }  ap ap = new ap(); try { ap.c("com.corrodinggames.rts"); ap.a(this.d); ap.a(this.aH.a); if (this.t) { ap.c("<CHAT ONLY>"); } else { ap.c((this.aH.b == null) ? "<NULL>" : this.aH.b); }  ap.a(this.aH.c); ap.a(this.aH.d); ap.a(this.aH.e); ap.a(this.aH.f); ap.c(7); ap.a(this.c.a(paramc)); boolean bool = this.c.b(paramc); ap.a(bool); ap.a(this.aF); ap.a(this.aG); ap.a(this.aH.g); ap.a(this.aH.h); ap.a(this.aH.i); ap.a(this.aH.j); if (this.t) { ap.a(false); } else { ap.a(true); l.a(ap); }  ap.a(this.aH.k); ap.a(this.aH.l); ap.a(this.aH.m); ap.a(this.aH.n); ap.a(this.aH.o); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(106)); } public synchronized strictfp void a(c paramc, String paramString) { if (!this.A) { c("sendKick: we are not a server!"); return; }  c("kicking client reason:" + paramString); ap ap = new ap(); try { ap.c(paramString); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(150)); } public synchronized strictfp void c(c paramc) { if (!this.A) { c("sendIncorrectPassword: we are not a server!"); return; }  c("sendIncorrectPassword"); ap ap = new ap(); try { ap.a(0); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(113)); } public strictfp ad() { this.bp = new Object();
/*  1614 */     this.bq = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  1705 */     this.bv = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  3035 */     this.bw = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  6701 */     this.bx = null;
/*  6702 */     this.by = null;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  7308 */     this.bA = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  7457 */     this.bB = false;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  8861 */     this.bC = new Object(); l l = l.u(); this.d = l.c(true); this.ba = f.d(40); this.aU = new c(this, null); this.aU.n = true; this.bn = new e(-3, false); this.bn.q = "SPECTATOR"; this.bo = new e(-1, false); this.bo.q = "ADMIN"; }
/*       */   public strictfp void F() { if (this.A) for (byte b = 0; b < m.d; b++) { m m1 = m.n(b); if (m1 != null) if (this.t) { m1.R = 0; } else if (m1.b()) { m1.R = 100; } else { m1.R = m1.o; }   }   }
/*       */   public strictfp void G() { if (this.A) { long l = System.currentTimeMillis(); int i = (l.u()).bh; if (this.x != null && !this.B) { this.x.L = -99; this.x.M = l; }  F(); for (byte b = 0; b < m.a; b++) { m m1 = m.n(b); if (m1 != null) { boolean bool = (this.x == m1) ? true : false; m1.c(bool); if (!this.bf); if (this.bf && !this.D) if (!m1.r) { boolean bool1 = false; if (m1.x()) bool1 = true;  long l1 = 60000L; if (m1.O > 180000) l1 = 160000L;  boolean bool2 = false; if (this.U) { if (m1.N == -1L) { m1.N = l; m1.O = i; }  if ((this.ae || this.af) && !m1.Q) { m1.N = l; m1.O = i; }  if (m1.N + l1 < l) bool2 = true;  }  if (m1.Q != bool2) m1.Q = bool2;  if (bool2) { bool1 = true; if (!m1.P) { boolean bool3 = (m1.w || m1.v || m1.z || m1.b()) ? true : false; if (!bool3) m1.P = true;  }  }  if (m1.z != bool1) { if (bool1) if (!m1.w && !m1.v && !m1.y && !m1.b()) { String str = "-t [Sharing control due to disconnect]"; if (bool2) str = "-t [Sharing control due to afk]";  l.d(m1.q + " - " + str); int j = m.a(m1.o, true); if (j > 1) a((c)null, m1, m1.q, str);  }   m1.z = bool1; }  }   }  }  }  }
/*       */   public strictfp void H() { if (this.aD == 0L) this.aD = System.currentTimeMillis();  }
/*  8865 */   public strictfp void I() { this.aD = 0L; d((c)null); } public strictfp void d(c paramc) { if (!this.A) { c("sendUpdatePlayer: we are not a server!"); return; }  G(); for (c c1 : this.aV) { if (c1.n) { ap ap = new ap(c1.B); try { ap.a(c1.c()); int i = m.a; boolean bool = false; if (ap.g() >= 90) { boolean bool1 = false; if (ap.g() >= 141) { bool1 = true; if (this.bf && c1.L) bool = true;  ap.a(bool); }  ap.a(i); ap.a("teams", bool1); } else { i = 8; if (!this.t) c("sendUpdatePlayer: warning saving with lower team count");  }  for (byte b = 0; b < i; b++) { m m1 = m.n(b); ap.a((m1 != null)); if (m1 != null) { boolean bool1 = false; if (m1 instanceof a) bool1 = true;  ap.a(bool1); if (bool) { m1.c(ap); } else { m1.b(ap); }  }  }  if (ap.g() >= 90) ap.a("teams");  ap.a(this.aH.d); ap.a(this.aH.c); ap.a(this.aH.e); ap.a(this.aH.f); ap.c(5); ap.a(this.aF); ap.a(this.aG); ap.a(this.aH.g); ap.a(this.aH.h); ap.a(this.aH.i); ap.a(this.aH.j); ap.a(false); ap.a(this.aH.k); ap.a(this.af); } catch (IOException iOException) { throw new RuntimeException(iOException); }  short s = -1; if (paramc == c1) if (c1.B <= 26) s = 1000;   c1.L = true; a(c1, ap.a(115, s)); }  }  } public synchronized strictfp boolean J() { if (K()) { this.o = true; this.aH.d = 0; return true; }  return false; } public synchronized strictfp boolean K() { if (this.z) b("Started singleplayer");  l l = l.u(); n(); this.z = true; this.A = true; this.D = true; this.aH.a = l.ae(); this.aH.b = l.ad(); S(); this.x = l.bb; l.k(); this.l = l.by.networkPort; c("singleplayer server started"); return true; } public synchronized strictfp boolean b(boolean paramBoolean) { if (this.z) throw new RuntimeException("networking already started");  m(); this.z = true; this.A = true; S(); l l = l.u(); c(paramBoolean); l.k(); this.l = l.by.networkPort; a.a().i(); this.aN = new am(this); try { this.aN.a(false); } catch (IOException iOException) { iOException.printStackTrace(); l.a("Could not open tcp port:" + this.l + ", check this port is not in use or change the port in the game settings", 1); b("Could not open tcp port"); return false; }  this.aM = new Thread(this.aN); this.aM.setDaemon(true); this.aM.start(); boolean bool = true; if (bool) { this.aP = new am(this); try { this.aP.a(true); } catch (IOException iOException) { iOException.printStackTrace(); l.a("Could not open udp port:" + this.l + ", check this port is not in use or change the port in the game settings", 1); b("Could not open udp port"); return false; }  this.aO = new Thread(this.aP); this.aO.start(); }  ad(); if (this.p) n.b();  this.be = null; n.a(); c("server started"); return true; } public strictfp void c(boolean paramBoolean) { this.A = true; l l = l.u(); if (this.x == null) { int i; e e1 = null; if (!paramBoolean) { i = m.C(); if (i == -1) throw new RuntimeException("playerId is -1 for server player");  } else { e1 = this.bo; i = this.bo.i; }  if (e1 == null) { e1 = new e(i); e1.q = this.w; l.bb = (m)e1; }  this.x = (m)e1; }  if (this.aR == null) { l.d("pingerTask starting"); this.aR = new as(this); this.aQ = new Timer(); this.aQ.schedule(this.aR, 100L, 100L); } else { l.d("pingerTask already active"); }  l.k(); } public strictfp boolean L() { l l = l.u(); return l.by.udpInMultiplayer; } public strictfp al a(String paramString, boolean paramBoolean, Runnable paramRunnable) { al al1 = new al(paramString, paramBoolean, paramRunnable); al1.b(); return al1; } public static strictfp Socket b(String paramString, boolean paramBoolean) { h h; InetSocketAddress inetSocketAddress; l l = l.u(); l.d("Connect to server: " + paramString + " (force tcp:" + paramBoolean + ")"); boolean bool = false; String str1 = paramString.trim(); if (str1.startsWith("get|")) { String str3; int j; boolean bool1; String[] arrayOfString1 = str1.split("\\|"); try { String str = arrayOfString1[0]; str3 = arrayOfString1[1]; j = Integer.parseInt(arrayOfString1[2]); bool1 = Boolean.parseBoolean(arrayOfString1[3]); int n = Integer.parseInt(arrayOfString1[4]); } catch (NumberFormatException numberFormatException) { numberFormatException.printStackTrace(); String str = "Bad server connect string"; throw new IOException(str); }  if (bool1) { l.bF.m = null; Object object1 = new Object(); ad$1 ad$1 = new ad$1(object1); l.d("Asking for password.."); synchronized (object1) { a(ad$1); try { object1.wait(); } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }  }  if (l.bF.m == null) { l.b("No password entered"); throw new ag(); }  l.d("Password has been entered"); }  String str4 = null; if (bool1) { str4 = l.bF.m; if (str4 == null) throw new IOException("This server requires a password but no password was provided");  }  Object object = new Object(); ad$2 ad$2 = new ad$2(object); synchronized (object) { n.a(ad$2, str3, j, str4); try { object.wait(15000L); } catch (InterruptedException interruptedException) {} }  if (ad$2.b != null) throw new IOException(ad$2.b);  if (ad$2.a == null) throw new IOException("Failed to get game server info.");  return b(ad$2.a, paramBoolean); }  if (str1.toLowerCase(Locale.ENGLISH).endsWith(".relay")) str1 = str1 + ".corrodinggames.com";  if (str1.startsWith("[TCP]")) { str1 = str1.substring("[TCP]".length()); paramBoolean = true; }  if (str1.length() > 4 && !str1.contains(":") && !str1.contains(".") && !str1.equals("localhost") && !str1.contains("/") && !str1.contains("\\")) { String str3 = ".relay.corrodinggames.com"; String str4 = "" + str1.charAt(0); String str5 = str4 + str3 + "/" + str1; l.d("Converting connect string to: " + str5); str1 = str5; }  l.bF.J = null; if (str1.contains("/") || str1.contains("\\")) { int j = str1.indexOf("/"); int n = str1.indexOf("\\"); if (j == -1) j = str1.length();  if (n == -1) n = str1.length();  int i1 = f.c(j, n); String str = str1.substring(i1 + 1); str = str.trim(); if (!str.equals("")) l.bF.J = str;  str1 = str1.substring(0, i1); }  String str2 = str1; int i = 5123; String[] arrayOfString = str1.split(":"); if (arrayOfString.length > 1) { str2 = null; for (byte b = 0; b < arrayOfString.length - 1; b++) { if (str2 == null) { str2 = ""; } else { str2 = str2 + ":"; }  str2 = str2 + arrayOfString[b]; }  String str = arrayOfString[arrayOfString.length - 1]; try { i = Integer.parseInt(str); } catch (NumberFormatException numberFormatException) { String str3 = "Bad port number:" + str; numberFormatException.printStackTrace(); throw new IOException(str3); }  }  if (!paramBoolean) if (l.bF.L()) bool = true;   char c1 = '᭘'; l.d(""); l.d("==============================="); l.d("Connect to: " + str1); if (!bool) { Socket socket = new Socket(); l.d("connecting to Server.. (tcp)"); } else { h = new h(); l.d("connecting to Server.. (udp)"); c1 = 'ᎈ'; }  h.setTcpNoDelay(true); try { inetSocketAddress = new InetSocketAddress(InetAddress.getByName(str2), i); } catch (IllegalArgumentException illegalArgumentException) { String str = "Incorrect server format"; l.b("IllegalArgumentException.." + str); illegalArgumentException.printStackTrace(); throw new IOException(str, illegalArgumentException); }  try { h.connect(inetSocketAddress, c1); } catch (UnknownHostException unknownHostException) { String str = "Failed to connect to host"; if (bool) str = str + " (udp)";  l.d("UnknownHostException.." + str); unknownHostException.printStackTrace(); throw new IOException(str, unknownHostException); } catch (IOException iOException) { String str = "Failed to connect to host"; if (bool) str = str + " (udp)";  str = str + " - " + iOException.getMessage(); l.d("IOException.." + str); iOException.printStackTrace(); throw new IOException(str, iOException); }  return (Socket)h; } public strictfp void M() { l l = l.u(); e e1 = e.a(a.a("menus.ingame.multiplayerReconnect.message", new Object[0]), false); e1.a(a.a("menus.ingame.resume", new Object[0]), new ad$3(this, e1)); e1.a(a.a("menus.ingame.reconnect", new Object[0]), new ad$4(this, e1)); e1.a(a.a("menus.ingame.disconnect", new Object[0]), new ad$5(this, e1, l)); l.bA.a(e1); this.bz = true; } public synchronized strictfp boolean N() { Socket socket = this.bx; if (socket == null) { l.d("reconnectToServer: lastConnectedTo==null"); return false; }  l.d("reconnectToServer attempted"); if (this.z) { l.d("reconnectToServer: disconnecting"); b("reconnecting"); }  if (socket.getInetAddress() == null) { l.d("reconnectToServer: lastConnectedTo.getInetAddress()==null"); return false; }  String str1 = socket.getInetAddress().getHostAddress(); int i = socket.getPort(); String str2 = str1 + ":" + i; l.d("reconnectToServer: connecting to: " + str2); try { boolean bool = false; Socket socket1 = b(str2, bool); return a(socket1); } catch (IOException iOException) { iOException.printStackTrace(); return false; } catch (ag ag) { ag.printStackTrace(); return false; }  } public strictfp void a(m paramm, int paramInt) { synchronized (this.bC)
/*       */     
/*  8867 */     { c(paramm, paramInt); }  } public synchronized strictfp boolean a(Socket paramSocket) { if (this.z) b("starting new");  if (paramSocket == null) throw new RuntimeException("connectedSocket==null");  m(); l l = l.u(); this.l = paramSocket.getPort(); this.z = true; this.A = false; c("connected to Server.."); c c1 = new c(this, paramSocket); c1.n = true; c1.d(); this.aV.add(c1); e(c1); ad(); this.bx = paramSocket; return true; } public strictfp c a(m paramm) { for (c c1 : this.aV) { if (c1.w == paramm) return c1;  }  return null; } public strictfp c b(m paramm) { for (c c1 : this.aV) { if (!c1.a && c1.w == paramm) return c1;  }  return null; } public strictfp c O() { if (this.A) return null;  for (c c1 : this.aV) { if (!c1.a) return c1;  }  return null; } public strictfp void d(ar paramar) { if (!this.z) { l.d("Skipping sendPacketToAll, not networked"); return; }  i(paramar); } private strictfp void i(ar paramar) { for (c c1 : this.aV) { if (c1.n && !c1.a && !c1.q) c1.a(paramar);  }  } public strictfp void e(ar paramar) { if (!this.z) { l.d("Skipping sendPacketToAllIncludingRelay, not networked"); return; }  for (c c1 : this.aV) { if (c1.n && !c1.a) c1.a(paramar);  }  } public strictfp void f(ar paramar) { if (!this.z) { l.d("Skipping sendPacketToServer, not networked"); return; }  if (this.A) throw new RuntimeException("We are a server");  d(paramar); } public strictfp void g(ar paramar) { if (!this.z) { l.d("Skipping sendPacketToClients, not networked"); return; }  if (!this.A) throw new RuntimeException("We are not a server");  e(paramar); } public strictfp void h(ar paramar) { if (!this.z) { l.d("Skipping sendPacketToClients, not networked"); return; }  if (!this.A) throw new RuntimeException("We are not a server");  d(paramar); } public strictfp void a(c paramc, ar paramar) { if (!this.z) { l.d("Skipping sendPacketOnConnection, not networked"); return; }  paramc.a(paramar); } public strictfp void P() { if (this.A) c("registerConnection: We are a server");  for (c c1 : this.aV) g(c1);  } public strictfp void Q() { l l = l.u(); l.by.networkClientId = null; if (this.P == null) { l.d("generateNewClientId: serverUUID==null"); this.P = "x"; }  R(); l.by.save(); } public strictfp String R() { l l = l.u(); boolean bool = false; if (l.by.networkClientId == null) bool = true;  if (!this.bA) { this.bA = true; if (l.al()) { String str1 = ab(); if (!str1.equals(l.by.networkClientIdMachineKey)) { if (l.by.networkClientIdMachineKey != null) l.d("Machine appears to have changed: " + l.by.networkClientIdMachineKey + " vs " + str1);  l.by.networkClientIdMachineKey = str1; bool = true; }  }  }  if (bool) { l.d("new networkClientId needed"); l.by.networkClientId = UUID.randomUUID().toString(); l.by.save(); }  String str = l.by.networkClientId; if (this.P == null) throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");  return f.e(str + this.P); } public strictfp void S() { l l = l.u(); l.by.networkServerId = UUID.randomUUID().toString(); l.by.save(); } public strictfp String T() { l l = l.u(); if (l.by.networkServerId == null) S();  return l.by.networkServerId; } public strictfp String U() { l l = l.u(); if (this.A) return l.by.networkServerId;  return this.P; } public strictfp void e(c paramc) { ap ap = new ap(); try { byte b1 = 3; byte b2 = 1; if (l.al()) b2 = 2;  if (l.aJ) b2 = 3;  ap.c("com.corrodinggames.rts"); ap.a(b1); ap.a(this.d); ap.a(b2); ap.b(this.J); ap.c(this.w); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(160)); } public strictfp void f(c paramc) { ap ap = new ap(); try { l l = l.u(); ap.c("com.corrodinggames.rts"); ap.a(1); ap.a(this.d); ap.a(l.c(true)); ap.c(l.h()); ap.c(T()); ap.a(paramc.J); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(161)); } public strictfp void g(c paramc) { l.d("sendRegisterConnection..."); ap ap = new ap(); try { ap.c("com.corrodinggames.rts"); ap.a(4); ap.a(this.d); l l = l.u(); ap.a(l.c(true)); ap.c(this.w); String str = null; if (this.m != null) str = f.e(this.m);  ap.b(str); ap.c(l.h()); ap.c(R()); ap.a(l.s()); ap.c(f(this.Q)); } catch (IOException iOException) { throw new RuntimeException(iOException); }  a(paramc, ap.b(110)); this.bB = true; } public strictfp String f(int paramInt) { String str = ""; str = str + "c:" + paramInt; str = str + "m:" + (paramInt * 87 + 24); str = str + "0:" + (e(0) * 11 * paramInt); str = str + "1:" + (e(1) * 12 + paramInt); str = str + "2:" + (e(2) * 13 * paramInt); str = str + "3:" + (e(3) * 14 + paramInt); str = str + "4:" + (e(4) * 15 * paramInt); str = str + "5:" + (e(5) * 16 + paramInt); str = str + "6:" + (e(6) * 17 * paramInt); str = str + "t1:" + (m.h.m * 11 * paramInt); int i = 5 * paramInt; if (i() != e(this.aH.c)) i = 7 * paramInt;  str = str + "d:" + i; return str; } public strictfp void V() { if (this.A) throw new RuntimeException("We are a server");  l l = l.u(); ap ap = new ap(); try { ap.a(this.bG); ap.a(l.ba); } catch (IOException iOException) { throw new RuntimeException(iOException); }  f(ap.b(112)); } public strictfp void h(String paramString) { if (!this.A) { c("cannot send sendSystemMessage:" + paramString + ", we are not a server"); return; }  if (!this.z || this.D) { c("cannot send sendSystemMessage:" + paramString + ", not networked"); return; }  l.d("sendSystemMessage:" + paramString); a((c)null, (m)null, (String)null, paramString); } public strictfp void i(String paramString) { k("-qc " + paramString); } public strictfp void j(String paramString) { boolean bool = true; String str = null; if (paramString != null) { String str1 = paramString.trim(); if ((str1.startsWith("-") || str1.startsWith(".") || str1.startsWith("_")) && str1.length() >= 2) { String str2 = str1.substring(1).trim(); int i = str2.indexOf(" "); if (i == -1) i = str2.length();  str = str2.substring(0, i).toLowerCase(Locale.ENGLISH); }  }  if ("share".equals(str)) bool = false;  if ("t".equals(str)) bool = false;  if (bool) paramString = "-t " + paramString;  k(paramString); } public strictfp void k(String paramString) { if (!this.z) { l.d("sendChatMessage: not networked:" + paramString); a((c)null, -1, (String)null, paramString); return; }  if (this.A) { a((c)null, this.x, this.w, paramString); b(null, this.x, this.w, paramString); return; }  try { ap ap = new ap(); ap.c(paramString); ap.c(0); f(ap.b(140)); } catch (IOException iOException) { throw new RuntimeException(iOException); }  } public strictfp void a(c paramc, m paramm, String paramString1, String paramString2) { a(paramc, paramm, paramString1, paramString2, null); } public strictfp void a(c paramc1, m paramm, String paramString1, String paramString2, c paramc2) { try { boolean bool1 = false; boolean bool2 = false; String str = l(paramString2); if ("t".equalsIgnoreCase(str)) if (paramm != null) { bool1 = true; paramString2 = paramString2.substring("-t".length()); paramString2 = "[TEAM] " + paramString2; } else { l.b("toOnlyTeams failed team==null"); }   if (paramm != null && "surrender".equalsIgnoreCase(str)) { bool1 = true; paramString2 = "[TEAM] " + paramString2; }  if (paramm != null && "i".equalsIgnoreCase(str)) { bool2 = true; paramString2 = paramString2.substring("-i".length()); paramString2 = "[INFO] " + paramString2; }  if (paramm != null && "qc".equalsIgnoreCase(str)) { bool2 = true; paramString2 = paramString2.substring("-qc".length()); paramString2 = "[COMMAND] " + paramString2; }  if (!bool2 && paramm != null) if (paramm != this.bn && paramm != this.bo) if (!this.c.a(paramc1, paramm, paramString2, bool1)) bool2 = true;    ap ap = new ap(); ap.c(paramString2); ap.c(3); ap.b(paramString1); ap.a(paramc1); int i = -1; if (paramm != null) i = paramm.i;  ap.a(i); ar ar = ap.b(141); if (bool1) { for (c c1 : this.aV) { if (c1.n && !c1.a) { e e1 = c1.w; if (e1 != null) if (e1.d(paramm)) c1.a(ar);   }  }  m m1 = this.x; if (m1 != null) if (m1.d(paramm)) a(paramc1, i, paramString1, paramString2);   } else if (bool2) { l.b("info message:" + c(paramString1, paramString2)); } else { if (paramc2 != null) { a(paramc2, ar); } else { g(ar); }  a(paramc1, i, paramString1, paramString2); }  } catch (IOException iOException) { throw new RuntimeException(iOException); }  } public static strictfp String l(String paramString) { if (paramString == null) return null;  String str = paramString.trim(); if ((str.startsWith("-") || str.startsWith(".") || str.startsWith("_")) && str.length() >= 2) { String str1 = str.substring(1).trim(); int i = str1.indexOf(" "); if (i == -1) i = str1.length();  return str1.substring(0, i).toLowerCase(Locale.ENGLISH); }  return null; } public static strictfp String c(String paramString1, String paramString2) { if (paramString1 != null) return paramString1 + ": " + paramString2;  return paramString2; } private strictfp void a(c paramc, int paramInt, String paramString1, String paramString2) { if (!this.z && paramString2.startsWith("-i ")) return;  if (!this.z && paramString2.startsWith("-qc ")) return;  paramString2 = a.c(paramString2); if (paramString1 != null) d("New Message", paramString1 + ": " + paramString2);  c c1 = null; if (this.A) c1 = paramc;  this.aL.a(paramInt, paramString1, paramString2, c1); this.c.a(paramInt, paramString1, paramString2, paramc); boolean bool = false; if (this.bf) bool = true;  if (!this.z) bool = true;  if (bool) { a(paramString1, paramString2); } else { String str = c(paramString1, paramString2); if (!l.aF) l.c(str);  }  } public strictfp void a(c paramc, byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) { l l = l.u(); try { ap ap = new ap(); ap.c(0); ap.a(l.bg); ap.a(l.bh); ap.a(a()); ap.a(1.0F); ap.a(paramBoolean1); ap.a(paramBoolean2); ap.e("gameSave"); ap.b(paramArrayOfbyte); ap.a("gameSave"); ar ar = ap.b(35); a(paramc, ar); } catch (IOException iOException) { throw new RuntimeException(iOException); }  } public strictfp void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { l l = l.u(); try { ap ap = new ap(); ap.c(0); ap.a(l.bg); ap.a(l.bh); ap.a(a()); ap.a(1.0F); ap.a(paramBoolean1); ap.a(paramBoolean2); ap.e("gameSave"); l.bI.a(ap); ap.a("gameSave"); if (paramBoolean1); ar ar = ap.b(35); d(ar); if (paramBoolean3) { if (!this.A) throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");  ar.a = this.aU; a(ar); }  } catch (IOException iOException) { throw new RuntimeException(iOException); }  } public strictfp boolean W() { I(); E(); return a((c)null, false); } public strictfp boolean a(c paramc, boolean paramBoolean) { if (!this.A) throw new RuntimeException("We are not a server");  l l = l.u(); ap ap = new ap(); try { ap.c(0); ap.a(this.aH.a); if (this.aH.a == ai.c) { l.bI.a(this.aH.b, ap); ap.c("SAVE:" + this.aH.b); } else if (this.aH.a == ai.b) { try { b.a(this.aI, ap); } catch (IOException iOException) { iOException.printStackTrace(); l.c("Map error starting game", "Map error: " + iOException.getMessage()); return false; }  ap.c("STEAM:" + this.aI); } else { ap.c(this.aI); }  ap.a(paramBoolean); } catch (IOException iOException) { throw new RuntimeException(iOException); }  ar ar = ap.b(120); if (paramc == null) { g(ar); } else { a(paramc, ar); }  if (!this.bf) ar();  return true; } public strictfp void X() { this.bi = true; l.d("onStartGameFailed"); if (this.A) { this.bf = false; h("Map load failed."); } else { b("Map load failed"); }  } private strictfp void ar() { this.bf = true; this.bi = false; this.bj = false; l.d("Starting new network game (" + U() + ")"); if (this.p && this.A) n.c();  if (!l.aF) l.l();  this.c.b(); } private strictfp void as() { o(); if (this.p && this.A) n.c();  if (!l.aF); } public strictfp String Y() { ArrayList<String> arrayList = aa(); if (arrayList == null || arrayList.size() == 0) return null;  return arrayList.get(0); } public strictfp String Z() { ArrayList arrayList = aa(); if (arrayList == null || arrayList.size() == 0) return null;  String str = ""; boolean bool = true; for (String str1 : arrayList) { if (bool) { bool = false; } else { str = str + ", "; }  str = str + str1; }  return str; } public strictfp ArrayList aa() { long l = bj.a(); try { ArrayList arrayList = d(true); if (arrayList != null && arrayList.size() > 0) return arrayList;  return d(false); } finally { double d = bj.a(l); if (d > 2.0D) l.b("getLocalIpAddressList was slow, taking:" + bj.a(d));  }  } public strictfp String ab() { String str = null; try { for (Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces(); enumeration.hasMoreElements(); ) { NetworkInterface networkInterface = enumeration.nextElement(); byte[] arrayOfByte = networkInterface.getHardwareAddress(); if (arrayOfByte != null) { String str1 = new String(arrayOfByte); str1 = str1.trim(); if (str1.length() > 2) { str = str1; break; }  }  }  } catch (Exception exception) { exception.printStackTrace(); }  if (str != null) return f.c(str);  return "[blank]"; } public strictfp ArrayList d(boolean paramBoolean) { ArrayList<String> arrayList = new ArrayList(); try { for (Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces(); enumeration.hasMoreElements(); ) { NetworkInterface networkInterface = enumeration.nextElement(); for (Enumeration<InetAddress> enumeration1 = networkInterface.getInetAddresses(); enumeration1.hasMoreElements(); ) { InetAddress inetAddress = enumeration1.nextElement(); if (!inetAddress.isLoopbackAddress()) { String str = inetAddress.getHostAddress().toString(); if (!str.contains("%")) { if (!paramBoolean) { arrayList.add(str); continue; }  if (str.contains(".")) arrayList.add(str);  }  }  }  }  } catch (SocketException socketException) { Log.d("RustedWarfare", socketException.toString()); }  return arrayList; } strictfp InetAddress ac() { try { l l = l.u(); WifiManager wifiManager = (WifiManager)l.ah.b("wifi"); DhcpInfo dhcpInfo = wifiManager.getDhcpInfo(); int i = dhcpInfo.ipAddress & dhcpInfo.netmask | dhcpInfo.netmask ^ 0xFFFFFFFF; byte[] arrayOfByte = new byte[4]; for (byte b = 0; b < 4; b++) arrayOfByte[b] = (byte)(i >> b * 8 & 0xFF);  return InetAddress.getByAddress(arrayOfByte); } catch (UnknownHostException unknownHostException) { unknownHostException.printStackTrace(); return null; }  } public strictfp void d(String paramString1, String paramString2) { if (l.aF) return;  l l = l.u(); if (this.D || l.bJ.h()) return;  if (l.j()) { g(2); return; }  NotificationManager notificationManager = (NotificationManager)l.ah.b("notification"); Intent intent = new Intent(l.ah, a.class); PendingIntent pendingIntent = PendingIntent.getActivity(l.ah, 0, intent, 2); if (Build.VERSION.SDK_INT >= 11) { Notification.Builder builder = new Notification.Builder(l.ah); builder.setContentTitle("Rusted Warfare Multiplayer"); builder.setContentText(paramString1 + ": " + paramString2); builder.setSmallIcon(R.drawable.icon); builder.setContentIntent(pendingIntent); builder.setOngoing(false); builder.setAutoCancel(true); a(notificationManager); a(builder, "multiplayerChatId"); Notification notification = builder.getNotification(); notificationManager.notify(2, notification); }  } public strictfp void ad() { l l = l.u(); if (this.z && l != null && l.F()) { at(); } else { g(1); }  } private strictfp void a(Notification.Builder paramBuilder, String paramString) { if (Build.VERSION.SDK_INT >= 26) try { Method method = paramBuilder.getClass().getDeclaredMethod("setChannelId", new Class[] { String.class }); method.invoke(paramBuilder, new Object[] { paramString }); } catch (Exception exception) { l.a("setChannelId failed", exception); }   } private strictfp void a(NotificationManager paramNotificationManager) { a(paramNotificationManager, "multiplayerChatId", "Multiplayer Chat"); a(paramNotificationManager, "multiplayerStatusId", "Multiplayer Status"); } private strictfp void a(NotificationManager paramNotificationManager, String paramString1, String paramString2) { if (Build.VERSION.SDK_INT >= 26) { byte b = 3; try { Class<?> clazz = Class.forName("android.app.NotificationChannel"); Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[] { String.class, CharSequence.class, int.class }); Object object = constructor.newInstance(new Object[] { paramString1, paramString2, Integer.valueOf(b) }); Method method = paramNotificationManager.getClass().getDeclaredMethod("createNotificationChannel", new Class[] { clazz }); method.invoke(paramNotificationManager, new Object[] { object }); } catch (Exception exception) { l.a("Creating notification channel failed", exception); }  }  } private strictfp void at() { if (l.aF) return;  l l = l.u(); Intent intent = new Intent(l.ah, a.class); PendingIntent pendingIntent = PendingIntent.getActivity(l.ah, 0, intent, 2); NotificationManager notificationManager = (NotificationManager)l.ah.b("notification"); if (Build.VERSION.SDK_INT >= 11) { if (Build.VERSION.SDK_INT >= 26); Notification.Builder builder = new Notification.Builder(l.ah); builder.setContentTitle("Rusted Warfare Multiplayer"); builder.setContentText("A multiplayer game is in progress"); builder.setSmallIcon(R.drawable.icon); builder.setContentIntent(pendingIntent); builder.setOngoing(true); a(notificationManager); a(builder, "multiplayerStatusId"); if (Build.VERSION.SDK_INT >= 16) builder.build();  Notification notification = builder.getNotification(); notificationManager.notify(1, notification); }  } private strictfp void g(int paramInt) { if (l.aF) return;  l l = l.u(); NotificationManager notificationManager = (NotificationManager)l.ah.b("notification"); notificationManager.cancel(paramInt); } public strictfp int ae() { byte b1 = 0; for (byte b2 = 0; b2 < m.a; b2++) { m m1 = m.n(b2); if (m1 != null) if (!m1.r) b1++;   }  return b1; }
/*       */   public strictfp int af() { byte b1 = 0; for (byte b2 = 0; b2 < m.a; b2++) { m m1 = m.n(b2); if (m1 != null) b1++;  }  return b1; }
/*       */   public strictfp void c(m paramm) { if (this.A) { d(paramm); } else if (this.F) { i("-kick " + (paramm.i + 1)); } else { l.b("kickTeamAndAttachedPlayer: but not server or proxy controller"); }  }
/*       */   public strictfp void d(m paramm) { if (paramm instanceof a) { paramm.E(); } else { if (this.x == paramm) { l.b("kickTeamAndAttachedPlayer", "Cannot kick self"); return; }  c c1 = a(paramm); if (c1 == null) { f("Kick player: cannot find connection for team"); } else { a(c1, "Kicked by host"); c1.a("Kicked by host"); }  paramm.E(); }  H(); l.k(); }
/*       */   public strictfp void ag() { l l = l.u(); if (!this.A) { l.b("addAIToGame", "We are not a server"); return; }  int i = m.C(); if (i == -1) l.a("No free slots for AI", 1);  a a1 = new a(i); a1.q = "AI"; a1.o = i % 2; a1.s = this.aH.f; ah(); l.bF.c.a((m)a1); l.bF.d((c)null); l.k(); }
/*       */   public strictfp boolean ah() { if (!this.A && this.z) { l.b("updateNamesOfAI", "We are not a server"); return false; }  boolean bool = false; for (byte b = 0; b < m.a; b++) { m m1 = m.n(b); if (m1 != null) if (m1.r) { String str = "AI - " + b(m1.y()); if (!str.equals(m1.q)) { m1.q = str; bool = true; }  }   }  return bool; }
/*  8873 */   private strictfp void c(m paramm, int paramInt) { if (paramm.i != paramInt) {
/*       */ 
/*       */ 
/*       */       
/*  8877 */       int i = paramm.i;
/*  8878 */       int j = paramm.o;
/*       */       
/*  8880 */       boolean bool = false;
/*       */       
/*  8882 */       if (paramInt == -3) {
/*       */         
/*  8884 */         bool = true;
/*       */         
/*  8886 */         paramInt = m.D();
/*  8887 */         if (paramInt == -1) {
/*       */           
/*  8889 */           d("No free spectator slots");
/*       */           
/*       */           return;
/*       */         } 
/*       */       } 
/*  8894 */       m m1 = m.n(paramInt);
/*  8895 */       paramm.i(paramInt);
/*       */       
/*  8897 */       paramm.o = j;
/*       */       
/*  8899 */       if (bool)
/*       */       {
/*  8901 */         paramm.o = -3;
/*       */       }
/*       */       
/*  8904 */       if (m1 != null) {
/*       */         
/*  8906 */         int n = m1.o;
/*       */         
/*  8908 */         m1.i(i);
/*       */         
/*  8910 */         if (n == -3) {
/*       */           
/*  8912 */           m1.o = -3;
/*       */         }
/*       */         else {
/*       */           
/*  8916 */           m1.o = j;
/*       */         } 
/*       */       } 
/*       */ 
/*       */       
/*  8921 */       F();
/*  8922 */       H();
/*       */     }  }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(ak paramak) {
/*  8942 */     synchronized (this.bC) {
/*       */       
/*  8944 */       b(paramak);
/*       */     } 
/*       */   }
/*       */ 
/*       */   
/*       */   private synchronized strictfp void b(ak paramak) {
/*  8950 */     l l = l.u();
/*       */     
/*  8952 */     if (!l.bF.A) {
/*       */       
/*  8954 */       l.d("Not server");
/*       */       
/*       */       return;
/*       */     } 
/*       */     
/*  8959 */     if (paramak == ak.a) {
/*       */ 
/*       */       
/*  8962 */       ArrayList<m> arrayList = new ArrayList(); int i;
/*  8963 */       for (i = 0; i < m.a; i++) {
/*       */         
/*  8965 */         m m1 = m.n(i);
/*  8966 */         if (m1 != null)
/*       */         {
/*  8968 */           arrayList.add(m1);
/*       */         }
/*       */       } 
/*       */       
/*  8972 */       Collections.shuffle(arrayList);
/*       */       
/*  8974 */       i = arrayList.size() / 2;
/*       */       
/*  8976 */       if (arrayList.size() % 2 != 0)
/*       */       {
/*  8978 */         i += f.a(0, 1);
/*       */       }
/*       */       
/*  8981 */       if (i >= arrayList.size())
/*       */       {
/*  8983 */         i = arrayList.size();
/*       */       }
/*       */       
/*  8986 */       int j = 0;
/*       */       
/*  8988 */       boolean bool = false; int n;
/*  8989 */       for (n = j; n < i; n++) {
/*       */         
/*  8991 */         ((m)arrayList.get(n)).i(bool);
/*  8992 */         bool += true;
/*  8993 */         ((m)arrayList.get(n)).o = 0;
/*       */       } 
/*       */       
/*  8996 */       j += i;
/*       */ 
/*       */ 
/*       */       
/*  9000 */       bool = true;
/*  9001 */       for (n = j; n < arrayList.size(); n++)
/*       */       {
/*  9003 */         ((m)arrayList.get(n)).i(bool);
/*  9004 */         bool += true;
/*  9005 */         ((m)arrayList.get(n)).o = 1;
/*       */       
/*       */       }
/*       */     
/*       */     }
/*  9010 */     else if (paramak == ak.b) {
/*       */ 
/*       */ 
/*       */       
/*  9014 */       ArrayList<m> arrayList = new ArrayList(); int i;
/*  9015 */       for (i = 0; i < m.a; i++) {
/*       */         
/*  9017 */         m m1 = m.n(i);
/*  9018 */         if (m1 != null)
/*       */         {
/*  9020 */           arrayList.add(m1);
/*       */         }
/*       */       } 
/*       */       
/*  9024 */       Collections.shuffle(arrayList);
/*       */       
/*  9026 */       i = arrayList.size() / 3;
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9035 */       if (i >= arrayList.size())
/*       */       {
/*  9037 */         i = arrayList.size();
/*       */       }
/*       */       
/*  9040 */       int j = 0;
/*       */       
/*  9042 */       byte b = 0; int n;
/*  9043 */       for (n = j; n < i; n++) {
/*       */         
/*  9045 */         m m1 = arrayList.get(n);
/*       */         
/*  9047 */         m1.i(b);
/*  9048 */         m1.o = 0;
/*       */         
/*  9050 */         b += true;
/*       */         
/*  9052 */         arrayList.set(n, null);
/*       */       } 
/*       */ 
/*       */       
/*  9056 */       j += i;
/*       */ 
/*       */ 
/*       */       
/*  9060 */       n = j + arrayList.size() / 3;
/*       */       
/*  9062 */       if (n >= arrayList.size())
/*       */       {
/*  9064 */         n = arrayList.size();
/*       */       }
/*  9066 */       if (j >= arrayList.size())
/*       */       {
/*  9068 */         j = arrayList.size();
/*       */       }
/*       */       
/*  9071 */       b = 1; int i1;
/*  9072 */       for (i1 = j; i1 < n; i1++) {
/*       */         
/*  9074 */         m m1 = arrayList.get(i1);
/*       */         
/*  9076 */         m1.i(b);
/*  9077 */         m1.o = 1;
/*       */         
/*  9079 */         b += true;
/*       */         
/*  9081 */         arrayList.set(i1, null);
/*       */       } 
/*       */       
/*  9084 */       j += i;
/*       */       
/*  9086 */       if (j >= arrayList.size())
/*       */       {
/*  9088 */         j = arrayList.size();
/*       */       }
/*       */       
/*  9091 */       b = 2;
/*  9092 */       for (i1 = j; i1 < arrayList.size(); i1++) {
/*       */         
/*  9094 */         m m1 = arrayList.get(i1);
/*       */         
/*  9096 */         if (b >= m.a) {
/*       */           
/*  9098 */           m1.i(b);
/*  9099 */           m1.o = 2;
/*       */           
/*  9101 */           b += 3;
/*       */           
/*  9103 */           arrayList.set(i1, null);
/*       */         } 
/*       */       } 
/*       */ 
/*       */ 
/*       */       
/*  9109 */       for (i1 = 0; i1 < arrayList.size(); i1++)
/*       */       {
/*  9111 */         m m1 = arrayList.get(i1);
/*  9112 */         if (m1 != null)
/*       */         {
/*       */           
/*  9115 */           for (byte b1 = 0; b1 < m.a; b1++)
/*       */           {
/*  9117 */             if (m.n(b1) == null)
/*       */             {
/*       */               
/*  9120 */               m1.i(b1);
/*  9121 */               m1.o = 2;
/*  9122 */               arrayList.set(i1, null);
/*       */             
/*       */             }
/*       */ 
/*       */           
/*       */           }
/*       */         
/*       */         }
/*       */       }
/*       */     
/*       */     }
/*  9133 */     else if (paramak == ak.c) {
/*       */       
/*  9135 */       ArrayList<m> arrayList = new ArrayList(); byte b1;
/*  9136 */       for (b1 = 0; b1 < m.a; b1++) {
/*       */         
/*  9138 */         m m1 = m.n(b1);
/*  9139 */         if (m1 != null)
/*       */         {
/*  9141 */           arrayList.add(m1);
/*       */         }
/*       */       } 
/*       */       
/*  9145 */       Collections.shuffle(arrayList);
/*       */       
/*  9147 */       b1 = 0;
/*  9148 */       for (byte b2 = 0; b2 < arrayList.size(); b2++)
/*       */       {
/*  9150 */         ((m)arrayList.get(b2)).i(b1);
/*       */         
/*  9152 */         ((m)arrayList.get(b2)).o = b1;
/*       */         
/*  9154 */         b1++;
/*       */       
/*       */       }
/*       */     
/*       */     }
/*  9159 */     else if (paramak == ak.d) {
/*       */       
/*  9161 */       ArrayList<m> arrayList = new ArrayList(); byte b1;
/*  9162 */       for (b1 = 0; b1 < m.a; b1++) {
/*       */         
/*  9164 */         m m1 = m.n(b1);
/*  9165 */         if (m1 != null)
/*       */         {
/*  9167 */           arrayList.add(m1);
/*       */         }
/*       */       } 
/*       */       
/*  9171 */       Collections.shuffle(arrayList);
/*       */       
/*  9173 */       b1 = 0;
/*  9174 */       for (byte b2 = 0; b2 < arrayList.size(); b2++)
/*       */       {
/*  9176 */         int i = m.D();
/*  9177 */         if (i != -1)
/*       */         {
/*  9179 */           ((m)arrayList.get(b2)).i(i);
/*       */         }
/*       */         
/*  9182 */         ((m)arrayList.get(b2)).o = -3;
/*       */         
/*  9184 */         b1++;
/*       */       
/*       */       }
/*       */     
/*       */     }
/*       */     else {
/*       */       
/*  9191 */       throw new RuntimeException("overrideTeamLayout: unhandled layout: " + paramak);
/*       */     } 
/*       */     
/*  9194 */     F();
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(m paramm, int paramInt, Integer paramInteger) {
/*  9203 */     String str = "";
/*  9204 */     if (paramInteger != null)
/*       */     {
/*  9206 */       str = " " + paramInteger;
/*       */     }
/*       */     
/*  9209 */     if (!this.F && this.x == paramm) {
/*       */       
/*  9211 */       i("-self_move " + (paramInt + 1) + str);
/*       */       
/*       */       return;
/*       */     } 
/*  9215 */     i("-move " + (paramm.i + 1) + " " + (paramInt + 1) + str);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void b(m paramm, int paramInt) {
/*  9220 */     if (paramInt != -1)
/*       */     {
/*  9222 */       paramInt++;
/*       */     }
/*       */     
/*  9225 */     if (!this.F && this.x == paramm) {
/*       */       
/*  9227 */       i("-self_team " + paramInt);
/*       */       
/*       */       return;
/*       */     } 
/*  9231 */     i("-team " + (paramm.i + 1) + " " + paramInt);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void e(m paramm) {
/*  9238 */     if (!paramm.x) {
/*       */       
/*  9240 */       paramm.x = true;
/*       */       
/*  9242 */       String str1 = paramm.q;
/*  9243 */       if (str1 == null)
/*       */       {
/*  9245 */         str1 = "Player - " + (paramm.i + 1) + "";
/*       */       }
/*       */       
/*  9248 */       String str2 = str1 + " is victorious!";
/*       */       
/*  9250 */       h(str2);
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void f(m paramm) {
/*  9257 */     l l = l.u();
/*       */     
/*  9259 */     boolean bool = false;
/*       */     
/*  9261 */     String str1 = paramm.q;
/*  9262 */     if (str1 == null)
/*       */     {
/*  9264 */       str1 = "Player - " + (paramm.i + 1) + "";
/*       */     }
/*       */     
/*  9267 */     String str2 = str1 + " was defeated";
/*       */     
/*  9269 */     if (!this.bh) {
/*       */       
/*  9271 */       str2 = str2 + " (Team: " + paramm.f() + ")";
/*       */     }
/*       */     else {
/*       */       
/*  9275 */       int i = m.e();
/*  9276 */       str2 = str2 + " (" + i + " players remaining)";
/*       */       
/*  9278 */       if (i == 1)
/*       */       {
/*  9280 */         bool = true;
/*       */       }
/*       */     } 
/*       */     
/*  9284 */     if (!l.G())
/*       */     {
/*  9286 */       if (l.bg < 60) {
/*       */         
/*  9288 */         l.d("Not showing defeated message: " + str2);
/*  9289 */         str2 = null;
/*       */       } 
/*       */     }
/*       */     
/*  9293 */     if (paramm.u)
/*       */     {
/*  9295 */       str2 = null;
/*       */     }
/*       */     
/*  9298 */     if (str2 != null)
/*       */     {
/*  9300 */       h(str2);
/*       */     }
/*       */     
/*  9303 */     if (bool)
/*       */     {
/*  9305 */       m.L();
/*       */     }
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void g(m paramm) {
/*       */     String str2;
/*  9312 */     l l = l.u();
/*       */ 
/*       */     
/*  9315 */     String str1 = paramm.q;
/*  9316 */     if (str1 == null)
/*       */     {
/*  9318 */       str1 = "Player - " + (paramm.i + 1) + "";
/*       */     }
/*       */     
/*  9321 */     boolean bool = false;
/*       */ 
/*       */ 
/*       */     
/*  9325 */     if (l.bg < 10) {
/*       */       
/*  9327 */       str2 = str1 + " had no starting units";
/*       */     }
/*       */     else {
/*       */       
/*  9331 */       str2 = str1 + " has been wiped out";
/*       */     } 
/*       */     
/*  9334 */     if (!this.bh) {
/*       */       
/*  9336 */       str2 = str2 + " (Team: " + paramm.f() + ")";
/*       */     }
/*       */     else {
/*       */       
/*  9340 */       int i = m.e();
/*  9341 */       str2 = str2 + " (" + i + " players remaining)";
/*       */       
/*  9343 */       if (i == 1)
/*       */       {
/*  9345 */         bool = true;
/*       */       }
/*       */     } 
/*       */     
/*  9349 */     if (!l.G())
/*       */     {
/*  9351 */       if (l.bg < 60) {
/*       */         
/*  9353 */         l.d("Not showing defeated message: " + str2);
/*  9354 */         str2 = null;
/*       */       } 
/*       */     }
/*       */     
/*  9358 */     if (paramm.u)
/*       */     {
/*  9360 */       str2 = null;
/*       */     }
/*       */     
/*  9363 */     if (paramm.b())
/*       */     {
/*  9365 */       str2 = null;
/*       */     }
/*       */     
/*  9368 */     if (str2 != null)
/*       */     {
/*  9370 */       h(str2);
/*       */     }
/*       */     
/*  9373 */     if (bool)
/*       */     {
/*  9375 */       m.L();
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public synchronized strictfp void ai() {
/*  9390 */     if (this.bD != null) {
/*       */       
/*  9392 */       this.bD.cancel();
/*  9393 */       this.bD = null;
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public synchronized strictfp void aj() {
/*  9400 */     if (this.p && this.A)
/*       */     {
/*  9402 */       if (this.bD == null) {
/*       */         
/*  9404 */         this.bD = new Timer();
/*  9405 */         ad$6 ad$6 = new ad$6(this);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  9413 */         this.bD.schedule(ad$6, 60000L, 60000L);
/*       */       } 
/*       */     }
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp String ak() {
/*  9454 */     l l = l.u();
/*       */     
/*  9456 */     String str = "";
/*       */     
/*  9458 */     if (l.bF.A && !l.bF.D) {
/*       */       
/*  9460 */       String str1 = l.bF.Z();
/*       */       
/*  9462 */       if (this.B) {
/*       */ 
/*       */         
/*  9465 */         if (this.C != null)
/*       */         {
/*  9467 */           String str2 = this.C;
/*       */           
/*  9469 */           str = str + str2;
/*       */         }
/*       */       
/*       */       }
/*  9473 */       else if (str1 != null) {
/*       */         
/*  9475 */         String str2 = "Local IP address: " + str1 + " port: " + l.bF.l;
/*       */ 
/*       */ 
/*       */         
/*  9479 */         if (l.bF.be != null) {
/*       */           
/*  9481 */           if (!l.bF.be.booleanValue())
/*       */           {
/*  9483 */             str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
/*       */ 
/*       */           
/*       */           }
/*  9487 */           else if (l.bF.bc != null)
/*       */           {
/*       */ 
/*       */             
/*  9491 */             if (l.bF.bd != null)
/*       */             {
/*  9493 */               str2 = str2 + "\nYour public address is " + (l.bF.bd.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
/*       */ 
/*       */ 
/*       */ 
/*       */             
/*       */             }
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*       */           }
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*       */         }
/*       */         else {
/*       */ 
/*       */ 
/*       */ 
/*       */           
/*  9514 */           str2 = str2 + "\nRetrieving your public IP...";
/*       */         } 
/*       */         
/*  9517 */         str = str + str2;
/*       */       
/*       */       }
/*       */       else {
/*       */         
/*  9522 */         str = str + "You do not have a network connection";
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9528 */     if (l.I())
/*       */     {
/*  9530 */       if (this.o) {
/*       */         
/*  9532 */         str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
/*       */       }
/*       */       else {
/*       */         
/*  9536 */         str = str + "Local skirmish";
/*       */       } 
/*       */     }
/*       */     
/*  9540 */     boolean bool = true;
/*       */     
/*  9542 */     if (l.aj() && l.bF.A)
/*       */     {
/*  9544 */       bool = false;
/*       */     }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  9553 */     if (str.length() != 0) {
/*       */       
/*  9555 */       str = str + "\n";
/*       */       
/*  9557 */       if (l.al())
/*       */       {
/*  9559 */         str = str + "\n";
/*       */       }
/*       */     } 
/*       */     
/*  9563 */     if (l.bF.aE || l.bF.A) {
/*       */       
/*  9565 */       if (bool) {
/*       */         
/*  9567 */         if (l.bF.aH.a != null)
/*       */         {
/*  9569 */           str = str + "Game Mode: " + l.bF.aH.a.a();
/*       */         }
/*  9571 */         if (l.bF.aH.b != null)
/*       */         {
/*  9573 */           str = str + "\nMap: " + g.d(l.bF.aH.b);
/*       */         }
/*       */       } 
/*       */       
/*  9577 */       str = str + "\nStarting Credits: " + l.bF.h();
/*       */ 
/*       */       
/*  9580 */       str = str + "\nFog: " + l.bF.e();
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*  9588 */       if (l.bF.aH.g != 1)
/*       */       {
/*  9590 */         str = str + "\nStarting Units: " + l.bF.f();
/*       */       }
/*       */ 
/*       */       
/*  9594 */       if (l.bF.aH.h != 1.0F)
/*       */       {
/*  9596 */         str = str + "\n" + f.a(l.bF.aH.h, 1) + "X income";
/*       */       }
/*  9598 */       if (l.bF.aH.i)
/*       */       {
/*  9600 */         str = str + "\nNo nukes";
/*       */       }
/*       */       
/*  9603 */       if (l.bF.aH.k)
/*       */       {
/*  9605 */         str = str + "\nShared control: On";
/*       */       }
/*       */ 
/*       */       
/*  9609 */       if (this.A) {
/*       */         
/*  9611 */         if (l.bF.m != null)
/*       */         {
/*  9613 */           str = str + "\nPassword Protection: On";
/*       */         }
/*       */         
/*  9616 */         if (!l.bF.p && !l.bF.D)
/*       */         {
/*  9618 */           str = str + "\nServer Visibility: Hidden";
/*       */         }
/*       */         
/*  9621 */         if (l.bF.n && !l.bF.D) {
/*       */           
/*  9623 */           ArrayList arrayList = l.bH.h();
/*       */           
/*  9625 */           str = str + "\n-- Required Mods: --\n";
/*       */           
/*  9627 */           byte b = 0;
/*  9628 */           for (b b1 : arrayList) {
/*       */             
/*  9630 */             if (b > 2 && b < arrayList.size() - 1) {
/*       */               
/*  9632 */               str = str + "" + (arrayList.size() - b) + " more mods...";
/*       */               break;
/*       */             } 
/*  9635 */             b++;
/*       */             
/*  9637 */             String str1 = b1.b();
/*       */             
/*  9639 */             str1.replace("\"", "'");
/*  9640 */             str1.replace(";", ".");
/*       */             
/*  9642 */             str = str + " mod: \"" + str1 + "\"\n";
/*       */           } 
/*       */         } 
/*       */       } 
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*  9656 */     return str;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp String al() {
/*  9663 */     if (!this.n)
/*       */     {
/*  9665 */       return null;
/*       */     }
/*       */     
/*  9668 */     l l = l.u();
/*       */     
/*  9670 */     ArrayList arrayList = l.bH.h();
/*       */     
/*  9672 */     String str = "";
/*       */     
/*  9674 */     byte b = 0;
/*  9675 */     for (b b1 : arrayList) {
/*       */       
/*  9677 */       if (b)
/*       */       {
/*  9679 */         str = str + "; ";
/*       */       }
/*  9681 */       if (b > 1 && b < arrayList.size() - 1) {
/*       */         
/*  9683 */         str = str + "" + (arrayList.size() - b) + " more...";
/*       */         break;
/*       */       } 
/*  9686 */       b++;
/*       */       
/*  9688 */       String str1 = b1.b();
/*       */ 
/*       */       
/*  9691 */       str1.replace(";", ".");
/*       */       
/*  9693 */       str = str + str1;
/*       */     } 
/*       */     
/*  9696 */     return str;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp String am() {
/*  9701 */     l l = l.u();
/*       */     
/*  9703 */     if (l.bF.aH.b == null)
/*       */     {
/*  9705 */       return null;
/*       */     }
/*       */     
/*  9708 */     if (l.bF.aH.a == null)
/*       */     {
/*  9710 */       return null;
/*       */     }
/*       */ 
/*       */     
/*  9714 */     if (l.bF.aH.a == ai.a)
/*       */     {
/*  9716 */       return "maps/skirmish/" + l.bF.aH.b;
/*       */     }
/*  9718 */     if (l.bF.aH.a == ai.b)
/*       */     {
/*  9720 */       return "/SD/rusted_warfare_maps/" + l.bF.aH.b;
/*       */     }
/*       */ 
/*       */     
/*  9724 */     l.d("getNetworkMapPath: unhandled type:" + l.bF.aH.a);
/*       */ 
/*       */     
/*  9727 */     return null;
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp boolean an() {
/*  9732 */     return (this.A || this.F);
/*       */   }
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(String paramString, c paramc) {
/*  9738 */     l.d("sendCommandError: " + paramString);
/*       */     
/*  9740 */     if (paramc == null) {
/*       */       
/*  9742 */       a((c)null, -1, (String)null, paramString);
/*       */     
/*       */     }
/*       */     else {
/*       */ 
/*       */       
/*  9748 */       a(null, null, null, paramString, paramc);
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp boolean b(c paramc, m paramm, String paramString1, String paramString2) {
/*  9760 */     String str1 = null;
/*  9761 */     String str2 = "";
/*  9762 */     String[] arrayOfString = new String[0];
/*       */     
/*  9764 */     String str3 = paramString2.trim();
/*       */     
/*  9766 */     boolean bool = false;
/*       */     
/*  9768 */     if (str3.startsWith("-qc ")) {
/*       */       
/*  9770 */       str3 = str3.substring("-qc ".length());
/*  9771 */       str3 = str3.trim();
/*       */       
/*  9773 */       bool = true;
/*       */     } 
/*       */     
/*  9776 */     if ((str3.startsWith("-") || str3.startsWith(".") || str3.startsWith("_")) && str3.length() >= 2) {
/*       */       
/*  9778 */       String str = str3.substring(1).trim();
/*  9779 */       int i = str.indexOf(" ");
/*  9780 */       if (i == -1)
/*       */       {
/*  9782 */         i = str.length();
/*       */       }
/*  9784 */       str1 = str.substring(0, i).toLowerCase(Locale.ENGLISH);
/*       */       
/*  9786 */       if (i != -1 && str.length() >= i + 1) {
/*       */         
/*  9788 */         str2 = str.substring(i + 1).trim();
/*  9789 */         arrayOfString = str2.split(" ");
/*       */       } 
/*       */     } 
/*       */     
/*  9793 */     if (str1 == null)
/*       */     {
/*  9795 */       return false;
/*       */     }
/*       */     
/*  9798 */     if (bool)
/*       */     {
/*  9800 */       if (!"self_move".equals(str1) && !"self_team".equals(str1))
/*       */       {
/*       */         
/*  9803 */         return false;
/*       */       }
/*       */     }
/*       */ 
/*       */ 
/*       */     
/*  9809 */     if ("pause".equals(str1) || "unpause".equals(str1)) {
/*       */       
/*  9811 */       if (paramm == null) {
/*       */         
/*  9813 */         a("[Could not find player]", paramc);
/*  9814 */         return true;
/*       */       } 
/*       */       
/*  9817 */       if ((!this.A || paramm != this.x) && !this.c.b(paramc)) {
/*       */         
/*  9819 */         a("[Only the host can change pause state]", paramc);
/*  9820 */         return true;
/*       */       } 
/*       */       
/*  9823 */       if (!this.bf) {
/*       */         
/*  9825 */         a("[Game not yet started]", paramc);
/*  9826 */         return true;
/*       */       } 
/*       */       
/*  9829 */       boolean bool1 = !this.af ? true : false;
/*  9830 */       if ("unpause".equals(str1))
/*       */       {
/*  9832 */         bool1 = false;
/*       */       }
/*       */       
/*  9835 */       e(bool1);
/*       */       
/*  9837 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9842 */     if ("teamlock".equals(str1)) {
/*       */       
/*  9844 */       if (paramm == null) {
/*       */         
/*  9846 */         a("[Could not find player]", paramc);
/*  9847 */         return true;
/*       */       } 
/*       */       
/*  9850 */       if ((!this.A || paramm != this.x) && !this.c.b(paramc)) {
/*       */         
/*  9852 */         a("[Only the host can change teamlock]", paramc);
/*  9853 */         return true;
/*       */       } 
/*       */       
/*  9856 */       if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
/*       */ 
/*       */         
/*  9859 */         this.aH.l = true;
/*  9860 */         a("[teams are locked]", paramc);
/*       */         
/*  9862 */         return true;
/*       */       } 
/*  9864 */       if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
/*       */ 
/*       */         
/*  9867 */         this.aH.l = false;
/*  9868 */         a("[teams are unlocked]", paramc);
/*       */         
/*  9870 */         return true;
/*       */       } 
/*       */ 
/*       */       
/*  9874 */       a("[Expected true or false]", paramc);
/*  9875 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9880 */     if ("roomlock".equals(str1)) {
/*       */       
/*  9882 */       if (paramm == null) {
/*       */         
/*  9884 */         a("[Could not find player]", paramc);
/*  9885 */         return true;
/*       */       } 
/*  9887 */       if (!this.A || paramm != this.x) {
/*       */         
/*  9889 */         a("[Only the host can change roomlock]", paramc);
/*  9890 */         return true;
/*       */       } 
/*       */       
/*  9893 */       if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
/*       */         
/*  9895 */         this.aH.o = true;
/*       */         
/*  9897 */         a("[room is locked]", paramc);
/*  9898 */         return true;
/*       */       } 
/*  9900 */       if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
/*       */         
/*  9902 */         this.aH.o = false;
/*  9903 */         a("[room is unlocked]", paramc);
/*  9904 */         return true;
/*       */       } 
/*       */ 
/*       */       
/*  9908 */       a("[Expected true or false]", paramc);
/*  9909 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9914 */     if ("share".equals(str1)) {
/*       */ 
/*       */       
/*  9917 */       if (paramm == null) {
/*       */         
/*  9919 */         a("[Could not find player]", paramc);
/*  9920 */         return true;
/*       */       } 
/*       */ 
/*       */       
/*  9924 */       if (!this.aH.k) {
/*       */         
/*  9926 */         a("[Shared control is not enabled in this game]", paramc);
/*  9927 */         return true;
/*       */       } 
/*       */       
/*  9930 */       if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  9935 */         if (!paramm.y) {
/*       */           
/*  9937 */           paramm.y = true;
/*  9938 */           h("[shared control now on for " + paramString1 + "]");
/*       */         
/*       */         }
/*       */         else {
/*       */ 
/*       */           
/*  9944 */           h("[shared control already on for " + paramString1 + "]");
/*       */         } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  9953 */         return true;
/*       */       } 
/*  9955 */       if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
/*       */ 
/*       */ 
/*       */ 
/*       */         
/*  9960 */         if (paramm.y) {
/*       */           
/*  9962 */           paramm.y = false;
/*       */           
/*  9964 */           h("[shared control now off for " + paramString1 + "]");
/*       */         }
/*       */         else {
/*       */           
/*  9968 */           h("[shared control already off for " + paramString1 + "]");
/*       */         } 
/*       */         
/*  9971 */         return true;
/*       */       } 
/*       */ 
/*       */       
/*  9975 */       a("[Expected true or false]", paramc);
/*  9976 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/*  9981 */     if ("self_move".equals(str1)) {
/*       */       int i;
/*       */       
/*  9984 */       if (paramm == null) {
/*       */         
/*  9986 */         a("[Cannot Move - Player not found]", paramc);
/*  9987 */         return true;
/*       */       } 
/*       */ 
/*       */       
/*  9991 */       if (this.bf) {
/*       */         
/*  9993 */         a("[Cannot Move '" + paramm.q + "' - Game has been started]", paramc);
/*  9994 */         return true;
/*       */       } 
/*       */       
/*  9997 */       if (k()) {
/*       */         
/*  9999 */         a("[Cannot Move '" + paramm.q + "' - Game is starting]", paramc);
/* 10000 */         return true;
/*       */       } 
/*       */       
/* 10003 */       if (this.aH.l) {
/*       */         
/* 10005 */         a("[Cannot Move '" + paramm.q + "' - Teams locked]", paramc);
/* 10006 */         return true;
/*       */       } 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/* 10012 */       if (arrayOfString.length > 0) {
/*       */         
/*       */         try
/*       */         {
/* 10016 */           i = Integer.valueOf(arrayOfString[0]).intValue();
/*       */         }
/* 10018 */         catch (NumberFormatException numberFormatException)
/*       */         {
/* 10020 */           a("[Cannot Move '" + paramm.q + "' - team '" + arrayOfString[0] + "' is not a number]", paramc);
/* 10021 */           return true;
/*       */         }
/*       */       
/*       */       } else {
/*       */         
/* 10026 */         a("[Cannot Move '" + paramm.q + "' - No target]", paramc);
/* 10027 */         return true;
/*       */       } 
/*       */       
/* 10030 */       Integer integer = null;
/* 10031 */       if (arrayOfString.length > 1) {
/*       */ 
/*       */         
/*       */         try {
/* 10035 */           integer = Integer.valueOf(arrayOfString[1]);
/*       */         }
/* 10037 */         catch (NumberFormatException numberFormatException) {
/*       */           
/* 10039 */           a("[Cannot Move '" + paramm.q + "' - ally group '" + arrayOfString[1] + "' is not a number]", paramc);
/* 10040 */           return true;
/*       */         } 
/*       */         
/* 10043 */         if (integer.intValue() != -1)
/*       */         {
/* 10045 */           if (integer.intValue() < 1 || integer.intValue() > 99) {
/*       */             
/* 10047 */             a("[Cannot Move Team - Ally group - Out of range]", paramc);
/* 10048 */             return true;
/*       */           } 
/*       */         }
/*       */       } 
/*       */ 
/*       */       
/* 10054 */       boolean bool1 = false;
/* 10055 */       if (i - 1 == -3) {
/*       */         
/* 10057 */         if (!this.aH.n) {
/*       */           
/* 10059 */           a("[Spectators are disabled on this server]", paramc);
/* 10060 */           return true;
/*       */         } 
/*       */         
/* 10063 */         synchronized (this.bC) {
/*       */           
/* 10065 */           i = m.D();
/* 10066 */           if (i != -1)
/*       */           {
/*       */             
/* 10069 */             a(paramm, -3);
/*       */           }
/*       */         } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */         
/* 10079 */         bool1 = true;
/*       */       } 
/*       */ 
/*       */       
/* 10083 */       int j = paramm.o;
/*       */       
/* 10085 */       boolean bool2 = (j == -3) ? true : false;
/*       */       
/* 10087 */       if (!bool1) {
/*       */ 
/*       */         
/* 10090 */         if (i < 1 || i > m.a) {
/*       */           
/* 10092 */           a("[Cannot Move '" + paramm.q + "' - target slotId must between 1-" + m.a + "]", paramc);
/* 10093 */           return true;
/*       */         } 
/*       */         
/* 10096 */         synchronized (this.bC) {
/*       */           
/* 10098 */           if (this.x != paramm) {
/*       */             
/* 10100 */             m m1 = m.n(i - 1);
/* 10101 */             if (m1 != null && !m1.r && !m1.b()) {
/*       */               
/* 10103 */               a("[Cannot move '" + paramm.q + "' to slot: " + i + " - Player: " + m1.q + " is in that slot.]", paramc);
/* 10104 */               return true;
/*       */             } 
/*       */           } 
/*       */           
/* 10108 */           a(paramm, i - 1);
/*       */         } 
/*       */       } 
/*       */ 
/*       */       
/* 10113 */       paramm.o = j;
/*       */       
/* 10115 */       if (integer != null)
/*       */       {
/* 10117 */         if (integer.intValue() == -1) {
/*       */           
/* 10119 */           paramm.o = paramm.i % 2;
/*       */         }
/*       */         else {
/*       */           
/* 10123 */           paramm.o = integer.intValue();
/*       */         } 
/*       */       }
/*       */       
/* 10127 */       if (this.aH.m)
/*       */       {
/* 10129 */         paramm.o = paramm.i % 2;
/*       */       }
/*       */       
/* 10132 */       if (bool1)
/*       */       {
/* 10134 */         paramm.o = -3;
/*       */       }
/*       */       
/* 10137 */       if (bool1) {
/*       */         
/* 10139 */         if (!bool2)
/*       */         {
/* 10141 */           h("Player '" + paramm.q + "' is now a spectator");
/*       */         }
/*       */       }
/*       */       else {
/*       */         
/* 10146 */         h("Player '" + paramm.q + "' moved themselves to: " + i);
/*       */       } 
/*       */       
/* 10149 */       H();
/* 10150 */       l.k();
/*       */       
/* 10152 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */     
/* 10157 */     if ("self_team".equals(str1)) {
/*       */       int i, j;
/* 10159 */       if (paramm == null) {
/*       */         
/* 10161 */         a("[Cannot Set Team - Player not found]", paramc);
/* 10162 */         return true;
/*       */       } 
/*       */       
/* 10165 */       if (this.bf) {
/*       */         
/* 10167 */         a("[" + paramm.q + ": Cannot Set Team - Game has been started]", paramc);
/* 10168 */         return true;
/*       */       } 
/*       */       
/* 10171 */       if (k()) {
/*       */         
/* 10173 */         a("[" + paramm.q + ": Cannot Set Team - Game is starting]", paramc);
/* 10174 */         return true;
/*       */       } 
/*       */       
/* 10177 */       if (this.aH.l) {
/*       */         
/* 10179 */         a("[" + paramm.q + ": Cannot Set Team - Teams locked]", paramc);
/* 10180 */         return true;
/*       */       } 
/*       */       
/* 10183 */       if (this.aH.m)
/*       */       {
/*       */         
/* 10186 */         return true;
/*       */       }
/*       */ 
/*       */ 
/*       */ 
/*       */       
/*       */       try {
/* 10193 */         i = Integer.valueOf(str2).intValue();
/*       */       }
/* 10195 */       catch (NumberFormatException numberFormatException) {
/*       */         
/* 10197 */         k("'" + str2 + "' is not a number");
/* 10198 */         return true;
/*       */       } 
/*       */ 
/*       */ 
/*       */       
/* 10203 */       if (i == -1) {
/*       */         
/* 10205 */         j = paramm.i % 2;
/*       */       } else {
/* 10207 */         if (i < 1 || i > 99) {
/*       */           
/* 10209 */           a("[Cannot Set Team - Out of range]", paramc);
/* 10210 */           return true;
/*       */         } 
/*       */ 
/*       */         
/* 10214 */         j = i - 1;
/*       */       } 
/*       */       
/* 10217 */       if (paramm.o != j) {
/*       */         
/* 10219 */         paramm.o = j;
/* 10220 */         a("Player '" + paramm.q + "' team changed to: " + i, paramc);
/*       */       } 
/*       */       
/* 10223 */       H();
/* 10224 */       l.k();
/*       */       
/* 10226 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10236 */     if ("surrender".equals(str1)) {
/*       */       
/* 10238 */       if (!this.bf) {
/*       */         
/* 10240 */         a("[Cannot Surrender - Game has not started]", paramc);
/* 10241 */         return true;
/*       */       } 
/*       */       
/* 10244 */       if (paramm == null) {
/*       */         
/* 10246 */         a("[Could not find player]", paramc);
/* 10247 */         return true;
/*       */       } 
/*       */ 
/*       */ 
/*       */ 
/*       */       
/* 10253 */       if (!paramm.i()) {
/*       */         
/* 10255 */         l.d(paramString1 + ": Is voting to surrender");
/*       */ 
/*       */         
/* 10258 */         paramm.j();
/*       */         
/* 10260 */         String str4 = m.b(paramm.o) + "/" + m.c(paramm.o);
/* 10261 */         String str5 = "-t [Votes to surrender " + str4 + "]";
/*       */         
/* 10263 */         a(paramc, paramm, paramString1, str5);
/*       */       
/*       */       }
/*       */       else {
/*       */         
/* 10268 */         l.d(paramString1 + ": Is already voting to surrender but updating timestamp");
/*       */         
/* 10270 */         paramm.j();
/*       */       } 
/*       */ 
/*       */ 
/*       */       
/* 10275 */       return true;
/*       */     } 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10283 */     return false;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/* 10368 */   public static ae bE = new ae();
/*       */   
/*       */   al bF;
/*       */   
/*       */   public static strictfp void a(ae paramae) {
/* 10373 */     l l = l.u();
/*       */     
/* 10375 */     if (l.bF != null)
/*       */     {
/* 10377 */       l.bF.c.a(paramae);
/*       */     }
/* 10379 */     if (l.aF) {
/*       */       return;
/*       */     }
/*       */ 
/*       */     
/* 10384 */     ad$7 ad$7 = new ad$7(paramae);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10393 */     c.a(ad$7);
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp ArrayList ao() {
/* 10405 */     synchronized (this.bC) {
/*       */       
/* 10407 */       return m.c();
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void e(boolean paramBoolean) {
/* 10501 */     this.af = paramBoolean;
/*       */     
/* 10503 */     if (this.af) {
/*       */       
/* 10505 */       h("Game Paused");
/*       */     }
/*       */     else {
/*       */       
/* 10509 */       h("Game unpaused");
/*       */     } 
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void h(c paramc) {
/* 10541 */     paramc.a(false, false);
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp void i(c paramc) {
/* 10546 */     for (c c1 : this.aV) {
/*       */       
/* 10548 */       if (c1.j == paramc)
/*       */       {
/* 10550 */         h(c1);
/*       */       }
/*       */     } 
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp c a(c paramc, int paramInt, String paramString) {
/* 10557 */     l l = l.u();
/*       */     
/* 10559 */     h h = new h(paramc, paramInt);
/*       */     
/* 10561 */     c c1 = new c(this, h);
/* 10562 */     c1.k = paramInt;
/* 10563 */     c1.j = paramc;
/* 10564 */     c1.m = paramString;
/*       */ 
/*       */ 
/*       */ 
/*       */     
/*       */     try {
/* 10570 */       c1.d();
/*       */       
/* 10572 */       l.bF.aV.add(c1);
/*       */       
/* 10574 */       l.bF.I();
/*       */       
/* 10576 */       return c1;
/*       */     }
/* 10578 */     catch (IOException iOException) {
/*       */ 
/*       */       
/* 10581 */       iOException.printStackTrace();
/*       */       
/* 10583 */       c1.a("crash");
/*       */ 
/*       */       
/* 10586 */       return null;
/*       */     } 
/*       */   }
/*       */ 
/*       */   
/*       */   public strictfp c a(c paramc, int paramInt) {
/* 10592 */     for (c c1 : this.aV) {
/*       */       
/* 10594 */       if (c1.k == paramInt && c1.j == paramc)
/*       */       {
/* 10596 */         return c1;
/*       */       }
/*       */     } 
/* 10599 */     return null;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public static strictfp String m(String paramString) {
/* 10606 */     paramString = paramString.trim();
/*       */     
/* 10608 */     paramString = paramString.replace("\n", ".");
/* 10609 */     paramString = paramString.replace("\r", ".");
/* 10610 */     paramString = paramString.replace("\t", ".");
/* 10611 */     paramString = paramString.replace("\000", ".");
/*       */     
/* 10613 */     paramString = paramString.replace(" ", "_");
/*       */ 
/*       */     
/* 10616 */     while (paramString.startsWith(".") || paramString
/* 10617 */       .startsWith("-") || paramString
/* 10618 */       .startsWith(" "))
/*       */     {
/* 10620 */       paramString = paramString.substring(1);
/*       */     }
/*       */ 
/*       */     
/* 10624 */     StringBuilder stringBuilder = new StringBuilder();
/* 10625 */     for (char c1 : paramString.toCharArray()) {
/*       */       
/* 10627 */       if (!Character.isISOControl(c1))
/*       */       {
/* 10629 */         stringBuilder.append(c1);
/*       */       }
/*       */     } 
/* 10632 */     paramString = stringBuilder.toString();
/*       */     
/* 10634 */     return paramString;
/*       */   }
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */   
/*       */   public strictfp void a(ArrayList<String> paramArrayList, boolean paramBoolean) {
/* 10642 */     if (this.bF != null) {
/*       */       
/* 10644 */       l.d("startJoinServerInternalThread: Already joining");
/*       */       
/*       */       return;
/*       */     } 
/* 10648 */     if (paramArrayList.size() == 0) {
/*       */       
/* 10650 */       l.d("startJoinServerInternalThread: no servers");
/*       */       
/*       */       return;
/*       */     } 
/* 10654 */     String str = paramArrayList.get(0);
/* 10655 */     boolean bool = false;
/*       */     
/* 10657 */     ad$8 ad$8 = new ad$8(this, paramBoolean);
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */ 
/*       */     
/* 10703 */     this.bF = a(str, bool, ad$8);
/*       */   }
/*       */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
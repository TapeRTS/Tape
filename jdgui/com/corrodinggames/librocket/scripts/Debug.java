/*     */ package com.corrodinggames.librocket.scripts;
/*     */ 
/*     */ import com.corrodinggames.rts.b.a.b;
/*     */ import com.corrodinggames.rts.b.a.i;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.b.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.d.k;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.e;
/*     */ import com.corrodinggames.rts.gameFramework.g.ah;
/*     */ import com.corrodinggames.rts.gameFramework.g.ai;
/*     */ import com.corrodinggames.rts.gameFramework.g.am;
/*     */ import com.corrodinggames.rts.gameFramework.g.c;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.h.c;
/*     */ import com.corrodinggames.rts.gameFramework.h.g;
/*     */ import com.corrodinggames.rts.gameFramework.h.i;
/*     */ import com.corrodinggames.rts.gameFramework.h.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import com.corrodinggames.rts.gameFramework.y;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Debug
/*     */   extends ScriptContext
/*     */ {
/*     */   Root root;
/*     */   ConcurrentLinkedQueue backgroundClientConnections;
/*     */   Thread backgroundConnectionThread;
/*     */   Runnable backgroundConnectionRunnable;
/*     */   boolean forceNonThreaded;
/*     */   
/*     */   public void setLocalPlayerName(String paramString) {
/*     */     l l = l.u();
/*     */     l.bF.a(paramString);
/*     */   }
/*     */   
/*     */   public void setDdosProtection(boolean paramBoolean) {
/*     */     am.b = paramBoolean;
/*     */   }
/*     */   
/*     */   public void lookAt(float paramFloat1, float paramFloat2) {
/*     */     l l = l.u();
/*     */     l.b(paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   public void createManyUnits(String paramString, float paramFloat1, float paramFloat2, int paramInt1, boolean paramBoolean, int paramInt2) {
/*     */     byte b1 = 0;
/*     */     boolean bool = false;
/*     */     for (byte b2 = 0; b2 < paramInt2; b2++) {
/*     */       b1 += true;
/*     */       if (b1 > 'Ɛ') {
/*     */         b1 = 0;
/*     */         bool += true;
/*     */       } 
/*     */       createUnit(paramString, paramFloat1 + b1, paramFloat2 + bool, paramInt1, (b2 == 0) ? paramBoolean : false);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Long createUnit(String paramString, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean) {
/*     */     l l = l.u();
/*     */     al al = ak.a(paramString);
/*     */     if (al == null) {
/*     */       this.root.logWarn("Could not find type:" + paramString);
/*     */       return null;
/*     */     } 
/*     */     af af = al.a();
/*     */     af.dH = paramFloat1;
/*     */     af.dI = paramFloat2;
/*     */     try {
/*     */       af.P(paramInt);
/*     */     } catch (f f) {
/*     */       throw new RuntimeException(f);
/*     */     } 
/*     */     m.c(af);
/*     */     af.cm = true;
/*     */     if (paramBoolean)
/*     */       l.b(paramFloat1, paramFloat2); 
/*     */     return Long.valueOf(af.dA);
/*     */   }
/*     */   
/*     */   public int getMaxCustomUnitTypeId() {
/*     */     return l.d.size();
/*     */   }
/*     */   
/*     */   public Long createCustomUnitFromTypeId(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, boolean paramBoolean) {
/*     */     l l = l.u();
/*     */     l l1 = l.d.get(paramInt1);
/*     */     af af = l1.a();
/*     */     af.dH = paramFloat1;
/*     */     af.dI = paramFloat2;
/*     */     try {
/*     */       af.P(paramInt2);
/*     */     } catch (f f) {
/*     */       throw new RuntimeException(f);
/*     */     } 
/*     */     m.c(af);
/*     */     af.cm = true;
/*     */     if (paramBoolean)
/*     */       l.b(paramFloat1, paramFloat2); 
/*     */     return Long.valueOf(af.dA);
/*     */   }
/*     */   
/*     */   public void selectNextUnit() {
/*     */     l l = l.u();
/*     */     af af = null;
/*     */     boolean bool = false;
/*     */     for (af af1 : af.bt()) {
/*     */       if (af1 instanceof af) {
/*     */         af af2 = af1;
/*     */         if (af2 instanceof com.corrodinggames.rts.game.units.ae)
/*     */           continue; 
/*     */         if (af2.t())
/*     */           continue; 
/*     */         if (af == null)
/*     */           af = af2; 
/*     */         if (bool) {
/*     */           af = af2;
/*     */           break;
/*     */         } 
/*     */         bool = af2.ci;
/*     */       } 
/*     */     } 
/*     */     l.bA.w();
/*     */     if (af != null)
/*     */       l.bA.j(af); 
/*     */   }
/*     */   
/*     */   public void removeAllUnits() {
/*     */     for (w w : w.dp())
/*     */       w.a(); 
/*     */   }
/*     */   
/*     */   public void killAllUnits() {
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof af) {
/*     */         af af1 = af;
/*     */         af1.bY = -1.0F;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean backgroundCurrentClientConnection() {
/*     */     l l = l.u();
/*     */     if (!l.bF.z) {
/*     */       l.d("Not networked");
/*     */       return false;
/*     */     } 
/*     */     if (l.bF.A)
/*     */       throw new RuntimeException("server=true"); 
/*     */     if (this.backgroundConnectionThread == null) {
/*     */       this.backgroundConnectionThread = new Thread(this.backgroundConnectionRunnable);
/*     */       this.backgroundConnectionThread.start();
/*     */     } 
/*     */     if (this.backgroundClientConnections == null)
/*     */       this.backgroundClientConnections = new ConcurrentLinkedQueue(); 
/*     */     for (c c : l.bF.aV) {
/*     */       c.r = true;
/*     */       this.backgroundClientConnections.add(c);
/*     */       l.bF.aV.remove(c);
/*     */     } 
/*     */     l.bF.b("backgrounded");
/*     */     l.bF.z = true;
/*     */     return true;
/*     */   }
/*     */   
/*     */   public boolean setTeamCredits(int paramInt1, int paramInt2) {
/*     */     m m = m.n(paramInt1);
/*     */     if (m == null) {
/*     */       this.root.logWarn("Could not find team:" + paramInt1);
/*     */       return false;
/*     */     } 
/*     */     m.m = paramInt2;
/*     */     return true;
/*     */   }
/*     */   
/*     */   public boolean setTeamAllyGroup(int paramInt1, int paramInt2) {
/*     */     m m = m.n(paramInt1);
/*     */     if (m == null) {
/*     */       this.root.logWarn("Could not find team:" + paramInt1);
/*     */       return false;
/*     */     } 
/*     */     m.o = paramInt2;
/*     */     return true;
/*     */   }
/*     */   
/*     */   public void giveUpgradeToAllUnits() {
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof r) {
/*     */         r r = (r)af;
/*     */         c c = r.bX();
/*     */         s s = r.a(c);
/*     */         if (s != null)
/*     */           r.a(s, false); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void giveAllActionsToAllUnits() {
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof r) {
/*     */         r r = (r)af;
/*     */         for (s s : r.M())
/*     */           r.a(s, false); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void completeAllUnitsQueues() {
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof k) {
/*     */         k k = (k)af;
/*     */         k.df();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean moveAllUnitsOnTeam(int paramInt, float paramFloat1, float paramFloat2) {
/*     */     m m = m.n(paramInt);
/*     */     if (m == null) {
/*     */       this.root.logWarn("Could not find team:" + paramInt);
/*     */       return false;
/*     */     } 
/*     */     l l = l.u();
/*     */     e e = l.bN.b(m);
/*     */     for (af af : af.bt()) {
/*     */       if (af instanceof r) {
/*     */         r r = (r)af;
/*     */         if (r.bB == m)
/*     */           e.a(r); 
/*     */       } 
/*     */     } 
/*     */     e.a(paramFloat1, paramFloat2);
/*     */     return true;
/*     */   }
/*     */   
/*     */   Debug(Root paramRoot) {
/* 260 */     this.backgroundConnectionRunnable = new Debug$1(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 750 */     this.forceNonThreaded = true; this.root = paramRoot;
/*     */   }
/*     */   public void showMessage(String paramString) { l l = l.u(); if (paramString == null || paramString.trim().equals("")) return;  paramString = paramString.replace("\\n", "\n"); l.bF.k(paramString); }
/*     */   public String unicodeTest1() { return "start ¥123 ؜ end"; }
/* 754 */   public void setZoom(float paramFloat) { l l = l.u(); l.cC = paramFloat; } public boolean isNetworkGameActive() { l l = l.u(); return l.G(); } public int getLocalPlayerId() { l l = l.u(); return l.bF.x.i; } public int numberOfHumanPlayers() { l l = l.u(); return l.bF.ae(); } public int numberOfPlayersPlusAI() { l l = l.u(); return l.bF.af(); } public boolean enableFastSync() { l l = l.u(); l.bF.ac = 30; return true; } public boolean enablePauseOnDesync() { l l = l.u(); l.bF.ad = true; return true; } public boolean networkPause() { l l = l.u(); l.bF.ad = true; l.bF.ae = true; return true; } public boolean plainTextDebugSave(boolean paramBoolean) { l l = l.u(); y.b = paramBoolean; return true; } public void setPathSpeedConf(boolean paramBoolean) { this.forceNonThreaded = paramBoolean; }
/*     */   public boolean checkDesync(int paramInt) { l l = l.u(); if (l.bF.az != 0) throw new RuntimeException("numberOfDesyncErrors==" + l.bF.az);  if (l.bF.aA < paramInt) throw new RuntimeException("game.network.numberOfDesyncPasses:" + l.bF.aA + "<" + paramInt);  this.root.logDebug("numberOfDesyncPasses:" + l.bF.aA); return true; }
/*     */   public int getNumberOfDesyncErrors() { l l = l.u(); return l.bF.az; }
/*     */   public int getNumberOfDesyncPasses() { l l = l.u(); return l.bF.aA; }
/*     */   public boolean setMultiplayerMap(int paramInt, String paramString) { l l = l.u(); ah ah = l.bF.aH; ah.a = ai.values()[paramInt]; ah.b = paramString; return true; }
/* 759 */   public boolean setMultiplayerSave(String paramString) { l l = l.u(); ah ah = l.bF.aH; ah.a = ai.c; ah.b = paramString; return true; } public float getPathSpeed(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { l l = l.u();
/* 760 */     b b = l.bt;
/*     */     
/* 762 */     ArrayList<g> arrayList = new ArrayList();
/*     */ 
/*     */     
/* 765 */     b.a(paramFloat3, paramFloat4);
/* 766 */     int i = b.M;
/* 767 */     int j = b.N;
/*     */ 
/*     */     
/* 770 */     long l1 = bj.a();
/*     */     
/* 772 */     c.a = 0;
/* 773 */     c.b = 0;
/* 774 */     c.c = 0;
/*     */     
/* 776 */     c.d = 0;
/* 777 */     c.e = 0;
/* 778 */     c.f = 0;
/* 779 */     c.g = 0;
/*     */     
/* 781 */     c.h = 0.0D;
/* 782 */     c.i = 0.0D;
/*     */     
/* 784 */     i.c = 0;
/*     */ 
/*     */ 
/*     */     
/* 788 */     c.u = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 793 */     for (byte b1 = 0; b1 < paramInt; b1++) {
/*     */       
/* 795 */       g g = l.bC.a(false);
/*     */       
/* 797 */       b.a(paramFloat1, paramFloat2);
/* 798 */       g.a(ah.b, (short)b.M, (short)b.N, null, false);
/*     */       
/* 800 */       b.a(paramFloat3, paramFloat4);
/* 801 */       g.a((short)b.M, (short)b.N, (short)0);
/*     */       
/* 803 */       g.l = true;
/* 804 */       g.m = 0;
/* 805 */       g.n = false;
/*     */ 
/*     */ 
/*     */       
/* 809 */       l.bC.a(g, false, this.forceNonThreaded);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 817 */       arrayList.add(g);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 825 */     if (!this.forceNonThreaded)
/*     */     {
/* 827 */       return -1.0F;
/*     */     }
/*     */ 
/*     */     
/* 831 */     float f = bj.a(l1);
/*     */     
/* 833 */     byte b2 = -1;
/*     */     
/* 835 */     for (g g : arrayList) {
/*     */       
/* 837 */       LinkedList<l> linkedList = g.c();
/*     */       
/* 839 */       byte b3 = 0;
/*     */       
/* 841 */       for (l l3 : linkedList)
/*     */       {
/* 843 */         b3++;
/*     */       }
/*     */       
/* 846 */       if (b2 != -1)
/*     */       {
/* 848 */         if (b2 != b3) {
/*     */           
/* 850 */           String str = "pathDistance inconsistency detected:" + b2 + "!=" + b3;
/* 851 */           l.b(str);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 856 */       l l2 = linkedList.getLast();
/*     */       
/* 858 */       if (l2.a != i || l2.b != j) {
/*     */         
/* 860 */         String str = "path did not react goal, got to:" + l2.a + "," + l2.b + " (vs " + i + ", " + j + ")";
/* 861 */         l.b(str);
/*     */       } 
/*     */ 
/*     */       
/* 865 */       b2 = b3;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 872 */     l.b("hotBufferWatermark:" + c.a + ", nodesAdded:" + c.d + ", mainQueueWatermark:" + c.b + ", backlogWatermark:" + c.c + ", scannedA:" + c.e + ", scannedB:" + c.f + ", scannedC:" + c.g + ", time:" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 879 */         bj.a(c.i) + "/" + bj.a(c.h) + ", dirtyPeak:" + c.u + ", dis:" + b2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 886 */     if (i.c != 0)
/*     */     {
/* 888 */       l.b("newNodesCreated:" + i.c);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 895 */     return f; } public void generateNewClientId() { l l = l.u(); l.bF.Q(); }
/*     */   public void disableFog() { l l = l.u(); }
/*     */   public void overrideDeltaSpeed(float paramFloat) { l l = l.u(); l.bd = paramFloat; }
/*     */   public void setGameSetting(String paramString1, String paramString2) { l l = l.u(); l.by.setValueDynamic(paramString1, paramString2); }
/*     */   public void setNetworkaiDifficulty(int paramInt) { l l = l.u(); ah ah = l.bF.c(); ah.f = paramInt; l.bF.a(ah); }
/*     */   public void setNetworkStartingUnits(int paramInt) { l l = l.u(); ah ah = l.bF.c(); ah.g = paramInt; l.bF.a(ah); }
/* 901 */   public void muteSounds() { l l = l.u();
/*     */     
/* 903 */     l.bu.b = true;
/*     */     
/* 905 */     l.bv.f(); }
/*     */ 
/*     */   
/*     */   public void startRandomUnitDesyncTest() {
/*     */     l l = l.u();
/*     */     e e = l.bN.b();
/*     */     e.i = m.g;
/*     */     e.r = true;
/*     */     e.u = 1;
/*     */     l.bF.a(e);
/*     */   }
/*     */   
/*     */   public void startRandomUnitStressTest() {
/*     */     l l = l.u();
/*     */     e e = l.bN.b();
/*     */     e.i = m.g;
/*     */     e.r = true;
/*     */     e.u = 2;
/*     */     l.bF.a(e);
/*     */   }
/*     */   
/*     */   public void runAllUnitTests() {
/*     */     this.root.logWarn("Running unit tests..");
/*     */     i i = new i();
/*     */     i.a();
/*     */   }
/*     */   
/*     */   public void runAllLeakTests() {
/*     */     this.root.logWarn("Running leak tests..");
/*     */     b b = new b();
/*     */     b.a();
/*     */   }
/*     */   
/*     */   public boolean loadSaveFromSystemPath(String paramString) {
/*     */     l l = l.u();
/*     */     try {
/*     */       File file = new File(paramString);
/*     */       FileInputStream fileInputStream = new FileInputStream(file);
/*     */       BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
/*     */       DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
/*     */       k k = new k(dataInputStream);
/*     */       try {
/*     */         return l.bI.a(k, false, false, false);
/*     */       } finally {
/*     */         dataInputStream.close();
/*     */         bufferedInputStream.close();
/*     */         fileInputStream.close();
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw new RuntimeException(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void checkTeamCaches() {
/*     */     for (m m : m.c()) {
/*     */       if (m.q())
/*     */         throw new RuntimeException("Team cache difference on team:" + m.i); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void pong() {}
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\Debug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
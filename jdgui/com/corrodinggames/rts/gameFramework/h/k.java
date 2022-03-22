/*      */ package com.corrodinggames.rts.gameFramework.h;
/*      */ 
/*      */ import android.graphics.Paint;
/*      */ import android.os.Debug;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.util.LinkedList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class k
/*      */   implements Runnable
/*      */ {
/*      */   private final h B;
/*      */   boolean a = true;
/*      */   public byte[] b;
/*      */   public byte[] c;
/*      */   public byte[] d;
/*      */   public short[] e;
/*      */   public byte[] f;
/*      */   private g C;
/*      */   int g;
/*      */   int h;
/*   49 */   int i = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   58 */   int j = 0;
/*   59 */   int k = 0;
/*      */ 
/*      */   
/*      */   int[][] l;
/*      */ 
/*      */   
/*      */   byte[][] m;
/*      */ 
/*      */   
/*      */   e n;
/*      */ 
/*      */   
/*   71 */   final i o = new i();
/*      */ 
/*      */   
/*   74 */   final i p = new i();
/*      */ 
/*      */   
/*   77 */   final l q = new l();
/*   78 */   final l r = new l();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   volatile boolean s = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(g paramg) {
/*   91 */     if (!this.s)
/*      */     {
/*   93 */       throw new RuntimeException("setupNewPath: last path not yet finished");
/*      */     }
/*   95 */     this.s = false;
/*      */ 
/*      */     
/*   98 */     a(paramg.k, paramg);
/*      */     
/*  100 */     paramg.r = true;
/*      */     
/*  102 */     this.C = paramg;
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
/*      */   public strictfp void a() {
/*  136 */     if (this.v == null)
/*      */     {
/*  138 */       throw new RuntimeException("thread==null");
/*      */     }
/*      */     
/*  141 */     synchronized (this.w) {
/*      */       
/*  143 */       this.w.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void run() {
/*  151 */     l.ag();
/*      */     
/*  153 */     while (this.a) {
/*      */ 
/*      */       
/*  156 */       synchronized (this.w) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  161 */         if (this.C == null) {
/*      */           
/*      */           try {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  172 */             this.w.wait();
/*      */           }
/*  174 */           catch (InterruptedException interruptedException) {
/*      */             
/*  176 */             interruptedException.printStackTrace();
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  182 */       if (this.C != null)
/*      */       {
/*  184 */         b();
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
/*      */   public strictfp void b() {
/*  197 */     LinkedList linkedList = e();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  216 */     synchronized (this.B.D) {
/*      */       
/*  218 */       this.C.b();
/*  219 */       this.b = null;
/*  220 */       this.c = null;
/*  221 */       this.d = null;
/*  222 */       this.e = null;
/*  223 */       this.f = null;
/*      */ 
/*      */       
/*  226 */       this.C.a(linkedList);
/*      */       
/*  228 */       this.C = null;
/*      */       
/*  230 */       this.s = true;
/*      */       
/*  232 */       this.B.D.notifyAll();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  239 */   static int t = 0;
/*      */   
/*      */   int u;
/*      */   Thread v;
/*      */   Object w;
/*      */   long x;
/*      */   long y;
/*      */   Object z;
/*      */   Paint A;
/*      */   
/*      */   strictfp k(h paramh) {
/*  250 */     this.w = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1599 */     this.z = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1639 */     this.A = new Paint();
/*      */     this.B = paramh;
/*      */     this.u = t++;
/*      */   }
/*      */   
/*      */   public synchronized strictfp void c() {
/*      */     if (this.v != null)
/*      */       throw new RuntimeException("thread!=null"); 
/*      */     this.v = new Thread(this);
/*      */     this.v.setName("PathSolver-" + this.u);
/*      */     this.v.setPriority(10);
/*      */     this.v.setDaemon(true);
/*      */     this.v.start();
/*      */   }
/*      */   
/*      */   public strictfp void a(b paramb) {
/*      */     this.g = paramb.r.n;
/*      */     this.h = paramb.r.o;
/*      */     this.l = new int[2][this.g * this.h];
/*      */     this.m = new byte[2][this.g * this.h];
/*      */     d();
/*      */   }
/*      */   
/*      */   public strictfp void d() {
/*      */     int j = this.g * this.h * 42 + 1;
/*      */     this.i += j;
/*      */     boolean bool = false;
/*      */     if (this.i > Integer.MAX_VALUE - j || this.i < 0 || bool) {
/*      */       this.i = 5;
/*      */       for (byte b = 0; b < 2; b++) {
/*      */         for (byte b1 = 0; b1 < this.g; b1++) {
/*      */           for (byte b2 = 0; b2 < this.h; b2++)
/*      */             this.l[b][b1 * this.h + b2] = -1; 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public final strictfp int a(int paramInt1, int paramInt2) {
/*      */     if (this.b[paramInt1 * this.h + paramInt2] == -1 || this.c[paramInt1 * this.h + paramInt2] == -1 || this.d[paramInt1 * this.h + paramInt2] == -1)
/*      */       return -1; 
/*      */     return this.b[paramInt1 * this.h + paramInt2] + this.c[paramInt1 * this.h + paramInt2] + this.d[paramInt1 * this.h + paramInt2] * 10;
/*      */   }
/*      */   
/*      */   public strictfp void a(ah paramah, g paramg) {
/*      */     if (paramah == null)
/*      */       throw new RuntimeException("MovementType is null"); 
/*      */     e e1 = this.B.a(paramah);
/*      */     if (e1 == null)
/*      */       throw new RuntimeException("Could not get costs for:" + paramah.toString()); 
/*      */     this.n = e1;
/*      */     this.b = paramg.t;
/*      */     this.c = paramg.u;
/*      */     this.d = paramg.v;
/*      */     this.e = paramg.w;
/*      */     this.f = paramg.x;
/*      */     if (this.b == null)
/*      */       throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null"); 
/*      */     if (this.c == null)
/*      */       throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null"); 
/*      */     if (this.d == null)
/*      */       throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null"); 
/*      */   }
/*      */   
/*      */   public strictfp void a(ah paramah, short paramShort1, short paramShort2, Float paramFloat) {
/*      */     if (h.a)
/*      */       Log.d("RustedWarfare", "path start is:" + paramShort1 + "," + paramShort2); 
/*      */     l l1 = new l(paramShort1, paramShort2);
/*      */     l1.a(this, (byte)0, this.i);
/*      */     if (paramFloat == null) {
/*      */       l1.a(this, (byte)0, (byte)0);
/*      */       l1.b(this, (byte)0, true);
/*      */     } else {
/*      */       l1.a(this, (byte)0, paramFloat.floatValue());
/*      */       l1.b(this, (byte)0, true);
/*      */     } 
/*      */     l1.a(this, (byte)0, false);
/*      */   }
/*      */   
/*      */   public strictfp void a(short paramShort1, short paramShort2, short paramShort3) {
/*      */     if (h.a)
/*      */       Log.d("RustedWarfare", "path end is:" + paramShort1 + "," + paramShort2 + " size:" + paramShort3); 
/*      */     l l1 = new l(paramShort1, paramShort2);
/*      */     l1.a(this, (byte)1, (byte)0);
/*      */     l1.b(this, (byte)1, true);
/*      */     l1.a(this, (byte)1, this.i);
/*      */     l1.a(this, (byte)1, false);
/*      */   }
/*      */   
/*      */   static strictfp int b(int paramInt1, int paramInt2) {
/*      */     if (paramInt1 == paramInt2)
/*      */       return 0; 
/*      */     int j = paramInt1 - paramInt2;
/*      */     if (j < 0)
/*      */       j = -j; 
/*      */     if (j > 4)
/*      */       j = 8 - j; 
/*      */     if (j == 1)
/*      */       return 4; 
/*      */     if (j == 2)
/*      */       return 21; 
/*      */     return 25;
/*      */   }
/*      */   
/*      */   static strictfp int c(int paramInt1, int paramInt2) {
/*      */     if (paramInt1 == paramInt2)
/*      */       return 0; 
/*      */     int j = Math.abs(paramInt1 - paramInt2);
/*      */     if (j > 4)
/*      */       j = 8 - j; 
/*      */     if (j == 1)
/*      */       return 4; 
/*      */     if (j == 2)
/*      */       return 21; 
/*      */     if (j == 3)
/*      */       return 4; 
/*      */     if (j == 4)
/*      */       return 0; 
/*      */     if (j == 5)
/*      */       return 0; 
/*      */     return 25;
/*      */   }
/*      */   
/*      */   public strictfp LinkedList e() {
/*      */     if (h.i)
/*      */       if (!(l.u()).bq)
/*      */         Debug.startMethodTracing("pathTrace", 110000000);  
/*      */     byte b1 = this.C.l ? 7 : 1;
/*      */     int j = this.C.m;
/*      */     if (h.a)
/*      */       Log.d("RustedWarfare", "starting path for:" + this.n.a.toString()); 
/*      */     l l1 = this.r;
/*      */     l l2 = this.q;
/*      */     int m = this.h;
/*      */     int n = this.g;
/*      */     this.x = l.N();
/*      */     short s1 = this.C.d;
/*      */     short s2 = this.C.e;
/*      */     boolean bool = this.C.g;
/*      */     d();
/*      */     a(this.C.k, this.C.d, this.C.e, this.C.f);
/*      */     short s3 = this.C.h;
/*      */     short s4 = this.C.i;
/*      */     short s5 = this.C.j;
/*      */     LinkedList<l> linkedList = new LinkedList();
/*      */     if (s1 == s3 && s2 == s4) {
/*      */       if (h.a)
/*      */         Log.d("RustedWarfare", "no point pathing when start=end"); 
/*      */       linkedList.clear();
/*      */       linkedList.add(new l(s3, s4));
/*      */       return linkedList;
/*      */     } 
/*      */     if (this.n.a.equals(ah.a)) {
/*      */       if (h.a)
/*      */         Log.d("RustedWarfare", "no point pathing for none"); 
/*      */       linkedList.clear();
/*      */       return linkedList;
/*      */     } 
/*      */     byte b2 = 0;
/*      */     short s6 = s3;
/*      */     short s7 = s4;
/*      */     short s8 = s5;
/*      */     if (this.e != null) {
/*      */       short[] arrayOfShort = this.e;
/*      */       short s = arrayOfShort[s1 * m + s2];
/*      */       boolean bool2 = true;
/*      */       if (s == -1) {
/*      */         bool2 = false;
/*      */       } else {
/*      */         short s14;
/*      */         for (s14 = (short)(s3 - s5); s14 <= s3 + s5; s14 = (short)(s14 + 1)) {
/*      */           short s15;
/*      */           for (s15 = (short)(s4 - s5); s15 <= s4 + s5; s15 = (short)(s15 + 1)) {
/*      */             if (s14 >= 0 && s14 < n && s15 >= 0 && s15 < m)
/*      */               if (s == arrayOfShort[s14 * m + s15])
/*      */                 bool2 = false;  
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       if (bool2) {
/*      */         if (h.a)
/*      */           Log.d("RustedWarfare", "end is blocked on isolated groups"); 
/*      */         short s14 = s6;
/*      */         short s15 = s7;
/*      */         float f = -1.0F;
/*      */         short s16;
/*      */         for (s16 = (short)(s3 - 25); s16 <= s3 + 25; s16 = (short)(s16 + 1)) {
/*      */           short s17;
/*      */           for (s17 = (short)(s4 - 25); s17 <= s4 + 25; s17 = (short)(s17 + 1)) {
/*      */             if (s16 >= 0 && s16 < n && s17 >= 0 && s17 < m)
/*      */               if (s == arrayOfShort[s16 * m + s17] || arrayOfShort[s16 * m + s17] == 0) {
/*      */                 float f1 = f.a(s16, s17, s3, s4);
/*      */                 if (f == -1.0F || f1 < f) {
/*      */                   f = f1;
/*      */                   s14 = s16;
/*      */                   s15 = s17;
/*      */                   s8 = 0;
/*      */                 } 
/*      */               }  
/*      */           } 
/*      */         } 
/*      */         if (f == -1.0F)
/*      */           for (s16 = 0; s16 < n; s16 = (short)(s16 + 1)) {
/*      */             short s17;
/*      */             for (s17 = 0; s17 < m; s17 = (short)(s17 + 1)) {
/*      */               if (s == arrayOfShort[s16 * m + s17] || arrayOfShort[s16 * m + s17] == 0) {
/*      */                 float f1 = f.a(s16, s17, s3, s4);
/*      */                 if (f == -1.0F || f1 < f) {
/*      */                   f = f1;
/*      */                   s14 = s16;
/*      */                   s15 = s17;
/*      */                   s8 = 0;
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           }  
/*      */         s6 = s14;
/*      */         s7 = s15;
/*      */         if (h.a) {
/*      */           long l4 = System.currentTimeMillis() - this.x;
/*      */           Log.d("RustedWarfare", "fakeNode search was:" + l4);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     boolean bool1 = true;
/*      */     short s9;
/*      */     label328: for (s9 = (short)(s6 - s8); s9 <= s6 + s8; s9 = (short)(s9 + 1)) {
/*      */       short s;
/*      */       for (s = (short)(s7 - s8); s <= s7 + s8; s = (short)(s + 1)) {
/*      */         if (s9 >= 0 && s9 < n && s >= 0 && s < m)
/*      */           if (a(s9, s) != -1) {
/*      */             bool1 = false;
/*      */             break label328;
/*      */           }  
/*      */       } 
/*      */     } 
/*      */     if (bool1) {
/*      */       s9 = s6;
/*      */       short s = s7;
/*      */       float f = -1.0F;
/*      */       if (h.a)
/*      */         Log.d("RustedWarfare", "end is blocked on non isolated groups"); 
/*      */       short s14;
/*      */       for (s14 = (short)(s6 - 9); s14 <= s6 + 9; s14 = (short)(s14 + 1)) {
/*      */         short s15;
/*      */         for (s15 = (short)(s7 - 9); s15 <= s7 + 9; s15 = (short)(s15 + 1)) {
/*      */           if (s14 >= 0 && s14 < n && s15 >= 0 && s15 < m)
/*      */             if (a(s14, s15) != -1) {
/*      */               float f1 = f.a(s14, s15, s6, s7);
/*      */               if (f == -1.0F || f1 < f) {
/*      */                 f = f1;
/*      */                 s9 = s14;
/*      */                 s = s15;
/*      */                 s8 = 0;
/*      */               } 
/*      */             }  
/*      */         } 
/*      */       } 
/*      */       if (f == -1.0F)
/*      */         for (s14 = 0; s14 < n; s14 = (short)(s14 + 1)) {
/*      */           short s15;
/*      */           for (s15 = 0; s15 < m; s15 = (short)(s15 + 1)) {
/*      */             if (a(s14, s15) != -1) {
/*      */               float f1 = f.a(s14, s15, s6, s7);
/*      */               if (f == -1.0F || f1 < f) {
/*      */                 f = f1;
/*      */                 s9 = s14;
/*      */                 s = s15;
/*      */                 s8 = 0;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         }  
/*      */       s6 = s9;
/*      */       s7 = s;
/*      */       if (h.a) {
/*      */         long l4 = System.currentTimeMillis() - this.x;
/*      */         Log.d("RustedWarfare", "fakeNode search was:" + l4);
/*      */       } 
/*      */     } 
/*      */     if (h.a)
/*      */       if (s6 != s3 || s7 != s4)
/*      */         Log.d("RustedWarfare", "Moved end to fakeEndX:" + s6 + " fakeEndY:" + s7);  
/*      */     this.o.a(s6, s7);
/*      */     this.o.a(0, s1, s2);
/*      */     this.p.a(s1, s2);
/*      */     a(s6, s7, s8);
/*      */     this.p.a(0, s6, s7);
/*      */     bool1 = false;
/*      */     s9 = 0;
/*      */     short s10 = -1;
/*      */     short s11 = -1;
/*      */     short s12 = -1;
/*      */     short s13 = -1;
/*      */     char c = 'Ɛ';
/*      */     byte b3 = 0;
/*      */     while (!bool1) {
/*      */       i i1;
/*      */       b3++;
/*      */       if (this.C.s) {
/*      */         linkedList.clear();
/*      */         return linkedList;
/*      */       } 
/*      */       b2++;
/*      */       if (c > '\000') {
/*      */         c--;
/*      */       } else {
/*      */         s9 = (s9 == 0) ? 1 : 0;
/*      */       } 
/*      */       byte b = 0;
/*      */       if (s9 != 0)
/*      */         b = 1; 
/*      */       if (s9 == 0) {
/*      */         i1 = this.o;
/*      */       } else {
/*      */         i1 = this.p;
/*      */       } 
/*      */       j j1 = i1.c();
/*      */       if (j1 == null) {
/*      */         if (s9 != 0)
/*      */           continue; 
/*      */         if (h.a)
/*      */           Log.d("RustedWarfare", "listNode==null for normal side ending path"); 
/*      */         break;
/*      */       } 
/*      */       l l4 = l2.a(j1);
/*      */       int i2 = l4.a(this, b);
/*      */       byte b4 = l4.c(this, b);
/*      */       boolean bool2 = l4.d(this, b);
/*      */       boolean bool3 = false;
/*      */       if (s9 == 0) {
/*      */         if (l4.a == s6 && l4.b == s7) {
/*      */           if (h.a)
/*      */             Log.d("RustedWarfare", "Over goal: fakeEnd"); 
/*      */           bool3 = true;
/*      */         } 
/*      */         if (f.c(l4.a - s3) <= s5)
/*      */           if (f.c(l4.b - s4) <= s5) {
/*      */             if (h.a)
/*      */               Log.d("RustedWarfare", "Over goal: real end"); 
/*      */             bool3 = true;
/*      */           }  
/*      */       } 
/*      */       boolean bool4 = l4.b(this, (byte)(1 - b));
/*      */       if (bool4 || bool3) {
/*      */         l1.a(l4);
/*      */         if (!bool4) {
/*      */           if (h.a)
/*      */             Log.d("RustedWarfare", "Not closedOnOtherSide"); 
/*      */           s10 = l2.a;
/*      */           s11 = l2.b;
/*      */           bool1 = true;
/*      */           break;
/*      */         } 
/*      */         l l5 = l1.f(this, b);
/*      */         if (l5 == null) {
/*      */           Log.d("RustedWarfare", "findPath: otherConnection==null");
/*      */           Log.d("RustedWarfare", "currentNode:" + l2.a + "," + l2.b);
/*      */           Log.d("RustedWarfare", "currentNode cost normal:" + l2.a(this, (byte)0));
/*      */           Log.d("RustedWarfare", "currentNode cost opposite:" + l2.a(this, (byte)1));
/*      */           linkedList.clear();
/*      */           return linkedList;
/*      */         } 
/*      */         if (s9 == 0) {
/*      */           if (h.a)
/*      */             Log.d("RustedWarfare", "closing path runFromOppositeSide=false"); 
/*      */           s12 = l2.a;
/*      */           s13 = l2.b;
/*      */           s10 = l5.a;
/*      */           s11 = l5.b;
/*      */         } else {
/*      */           if (h.a)
/*      */             Log.d("RustedWarfare", "closing path runFromOppositeSide=true"); 
/*      */           s12 = l5.a;
/*      */           s13 = l5.b;
/*      */           s10 = l2.a;
/*      */           s11 = l2.b;
/*      */         } 
/*      */         bool1 = true;
/*      */         break;
/*      */       } 
/*      */       l4.a(this, b, true);
/*      */       byte b5 = 0;
/*      */       byte b6 = 7;
/*      */       if (bool2) {
/*      */         b5 = 0;
/*      */         b6 = 7;
/*      */       } else {
/*      */         byte b8 = 2;
/*      */         if (this.f != null)
/*      */           if (this.f[l4.a * m + l4.b] > 1)
/*      */             b8 = 1;  
/*      */         b5 = (byte)(b4 - b8);
/*      */         b6 = (byte)(b4 + b8);
/*      */       } 
/*      */       byte b7;
/*      */       for (b7 = b5; b7 <= b6; b7 = (byte)(b7 + 1)) {
/*      */         int i5;
/*      */         l1.a(l4);
/*      */         byte b8 = b7;
/*      */         if (b8 > 7)
/*      */           b8 = (byte)(b8 - 8); 
/*      */         if (b8 < 0)
/*      */           b8 = (byte)(b8 + 8); 
/*      */         if (b8 == 0)
/*      */           l1.a = (short)(l1.a + 1); 
/*      */         if (b8 == 1) {
/*      */           l1.a = (short)(l1.a + 1);
/*      */           l1.b = (short)(l1.b + 1);
/*      */         } 
/*      */         if (b8 == 2)
/*      */           l1.b = (short)(l1.b + 1); 
/*      */         if (b8 == 3) {
/*      */           l1.b = (short)(l1.b + 1);
/*      */           l1.a = (short)(l1.a - 1);
/*      */         } 
/*      */         if (b8 == 4)
/*      */           l1.a = (short)(l1.a - 1); 
/*      */         if (b8 == 5) {
/*      */           l1.a = (short)(l1.a - 1);
/*      */           l1.b = (short)(l1.b - 1);
/*      */         } 
/*      */         if (b8 == 6)
/*      */           l1.b = (short)(l1.b - 1); 
/*      */         if (b8 == 7) {
/*      */           l1.b = (short)(l1.b - 1);
/*      */           l1.a = (short)(l1.a + 1);
/*      */         } 
/*      */         if (l1.a < 0 || l1.a >= n || l1.b < 0 || l1.b >= m)
/*      */           continue; 
/*      */         int i3 = l1.a(this);
/*      */         if (i3 == -1)
/*      */           continue; 
/*      */         int i4 = l1.a(this, b);
/*      */         if (l1.b(this, b))
/*      */           continue; 
/*      */         if (l1.a != l4.a && l1.b != l4.b) {
/*      */           if (a(l1.a, l4.b) == -1 || a(l4.a, l1.b) == -1)
/*      */             continue; 
/*      */           i5 = i2 + 14 + i3 + 1;
/*      */         } else {
/*      */           i5 = i2 + 10 + i3 + 1;
/*      */         } 
/*      */         if (b4 != b8)
/*      */           if (!bool2) {
/*      */             i5 += b(b4, b8);
/*      */           } else if (s9 == 0) {
/*      */             if (bool) {
/*      */               i5 += c(b4, b8);
/*      */             } else {
/*      */               i5 += b(b4, b8);
/*      */             } 
/*      */           }  
/*      */         if (this.f != null)
/*      */           i5 += (4 - this.f[l1.a * m + l1.b]) * b1; 
/*      */         if (j > 0)
/*      */           if (this.f != null) {
/*      */             byte b9 = this.f[l1.a * m + l1.b];
/*      */             if (b9 <= j)
/*      */               i5 += 100; 
/*      */           }  
/*      */         if (i4 < this.i || i5 < i4) {
/*      */           l1.a(this, b, b8);
/*      */           l1.a(this, b, false);
/*      */           l1.a(this, b, i5);
/*      */           i1.a(i5 - this.i, l1.a, l1.b);
/*      */         } 
/*      */         continue;
/*      */       } 
/*      */     } 
/*      */     if (h.a) {
/*      */       Log.d("RustedWarfare", "grid path finshed in :" + b3 + " ticks");
/*      */       long l4 = System.currentTimeMillis() - this.x;
/*      */       Log.d("RustedWarfare", "grid path done in:" + l4);
/*      */     } 
/*      */     long l3 = System.currentTimeMillis();
/*      */     if (!bool1) {
/*      */       if (h.a)
/*      */         Log.d("RustedWarfare", "could not find end node"); 
/*      */       long l4 = System.currentTimeMillis();
/*      */       float f = -1.0F;
/*      */       l l5 = new l();
/*      */       short s;
/*      */       for (s = 0; s < n; s = (short)(s + 1)) {
/*      */         short s14;
/*      */         for (s14 = 0; s14 < m; s14 = (short)(s14 + 1)) {
/*      */           l5.a(s, s14);
/*      */           if (l5.e(this, (byte)0)) {
/*      */             float f1 = f.a(s, s14, s3, s4);
/*      */             if (f == -1.0F || f1 < f) {
/*      */               f = f1;
/*      */               s10 = s;
/*      */               s11 = s14;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       if (h.a) {
/*      */         long l6 = System.currentTimeMillis() - l4;
/*      */         Log.d("RustedWarfare", "got closest node in:" + l6);
/*      */       } 
/*      */     } 
/*      */     linkedList.clear();
/*      */     if (s10 != -1 && s11 != -1) {
/*      */       LinkedList linkedList1 = a((byte)0, s10, s11);
/*      */       linkedList.addAll(a(linkedList1));
/*      */     } 
/*      */     if (s12 != -1 && s13 != -1) {
/*      */       LinkedList<? extends l> linkedList1 = a((byte)1, s12, s13);
/*      */       linkedList.addAll(linkedList1);
/*      */     } 
/*      */     if (linkedList.size() > 1)
/*      */       linkedList.remove(0); 
/*      */     this.y = l.N();
/*      */     if (h.a) {
/*      */       long l4 = this.y - this.x;
/*      */       Log.d("RustedWarfare", "path(" + this.C.a + ") finished in:" + l4);
/*      */     } 
/*      */     if (h.i)
/*      */       if (!(l.u()).bq) {
/*      */         Debug.stopMethodTracing();
/*      */         h.i = false;
/*      */       }  
/*      */     return linkedList;
/*      */   }
/*      */   
/*      */   public strictfp LinkedList a(byte paramByte, short paramShort1, short paramShort2) {
/*      */     LinkedList<l> linkedList = new LinkedList();
/*      */     l l1 = new l(paramShort1, paramShort2);
/*      */     linkedList.add(l1);
/*      */     while (true) {
/*      */       l l2 = l1.f(this, paramByte);
/*      */       if (l2 == null)
/*      */         break; 
/*      */       linkedList.add(l2);
/*      */       l1 = l2;
/*      */     } 
/*      */     return linkedList;
/*      */   }
/*      */   
/*      */   public strictfp LinkedList a(LinkedList paramLinkedList) {
/*      */     LinkedList<l> linkedList = new LinkedList();
/*      */     for (l l1 : paramLinkedList)
/*      */       linkedList.addFirst(l1); 
/*      */     return linkedList;
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
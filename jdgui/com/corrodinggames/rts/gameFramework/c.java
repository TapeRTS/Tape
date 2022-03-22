/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   static final boolean a = false;
/*  43 */   public ArrayList b = new ArrayList();
/*     */   
/*  45 */   public ArrayList c = new ArrayList();
/*     */ 
/*     */   
/*  48 */   public ArrayList d = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/*  59 */     this.b.clear();
/*  60 */     this.c.clear();
/*  61 */     this.d.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp e b() {
/*  66 */     e e = new e(this);
/*     */     
/*  68 */     if (a) {
/*     */       
/*  70 */       l.d("Tracing source");
/*  71 */       e.b = l.a(new Exception("Test"));
/*     */     } 
/*     */     
/*  74 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp e a(m paramm) {
/*  79 */     return b(paramm);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp e b(m paramm) {
/*  84 */     if (paramm == null)
/*     */     {
/*  86 */       throw new RuntimeException("team==null");
/*     */     }
/*     */     
/*  89 */     l l = l.u();
/*     */     
/*  91 */     e e = new e(this);
/*  92 */     e.i = paramm;
/*  93 */     e.d = l.bh;
/*     */     
/*  95 */     if (a) {
/*     */       
/*  97 */       l.d("Tracing source");
/*  98 */       e.b = l.a(new Exception("Test"));
/*     */     } 
/*     */ 
/*     */     
/* 102 */     if (!l.bF.z) {
/*     */       
/* 104 */       if (!e.l())
/*     */       {
/* 106 */         l.b("Command failed prepareAndCheckOnServer()");
/*     */       }
/* 108 */       this.b.add(e);
/*     */     }
/*     */     else {
/*     */       
/* 112 */       this.d.add(e);
/*     */     } 
/*     */ 
/*     */     
/* 116 */     return e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c() {
/* 123 */     l l = l.u();
/*     */     
/* 125 */     if (!l.bF.z) {
/*     */       
/* 127 */       d();
/*     */     }
/*     */     else {
/*     */       
/* 131 */       e();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d() {
/* 138 */     l l = l.u();
/* 139 */     int i = l.bg;
/*     */     
/* 141 */     for (e e : this.b) {
/*     */       
/* 143 */       l.bJ.a(e, i);
/* 144 */       e.k();
/*     */     } 
/* 146 */     this.b.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 152 */     l l = l.u();
/*     */     
/* 154 */     int i = l.bg;
/*     */ 
/*     */     
/* 157 */     Iterator<e> iterator = this.b.iterator();
/* 158 */     while (iterator.hasNext()) {
/*     */       
/* 160 */       e e = iterator.next();
/* 161 */       if (e.c == i) {
/*     */         
/* 163 */         l.bJ.a(e, i);
/* 164 */         e.k();
/* 165 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
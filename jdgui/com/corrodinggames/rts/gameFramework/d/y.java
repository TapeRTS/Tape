/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Typeface;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
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
/*     */ public class y
/*     */ {
/*     */   private l a;
/*     */   private Paint b;
/*  26 */   private ArrayList c = new ArrayList();
/*     */ 
/*     */   
/*     */   public strictfp y(l paraml) {
/*  30 */     this.a = paraml;
/*     */     
/*  32 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/*  37 */     this.b = new Paint();
/*  38 */     this.b.a(255, 255, 255, 255);
/*  39 */     this.b.a(true);
/*  40 */     this.b.c(true);
/*     */     
/*  42 */     this.b.a(Typeface.a(Typeface.c, 1));
/*     */     
/*  44 */     this.a.a(this.b, 14.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void b() {
/*  49 */     this.c.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void a(af paramaf) {
/*  54 */     aa aa = new aa(paramaf.dH, paramaf.dI, paramaf.r());
/*  55 */     aa.c = l.N();
/*  56 */     a(aa);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void b(af paramaf) {
/*  61 */     ac ac = new ac(paramaf.dH, paramaf.dI, paramaf.r());
/*  62 */     ac.c = l.N();
/*  63 */     a(ac);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void c(af paramaf) {
/*  68 */     ab ab = new ab(paramaf.dH, paramaf.dI, paramaf.bw());
/*  69 */     ab.c = l.N();
/*  70 */     a(ab);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void a(String paramString) {
/*  75 */     z z = new z(paramString);
/*  76 */     z.c = l.N();
/*  77 */     a(z);
/*     */   }
/*     */ 
/*     */   
/*     */   private strictfp void a(ad paramad) {
/*  82 */     boolean bool = false;
/*  83 */     for (ad ad1 : this.c) {
/*     */       
/*  85 */       if (ad1.a(paramad)) {
/*     */         
/*  87 */         ad1.b(paramad);
/*  88 */         bool = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  93 */     if (bool) {
/*     */       
/*  95 */       Collections.sort(this.c);
/*     */     }
/*     */     else {
/*     */       
/*  99 */       this.c.add(0, paramad);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized strictfp void a(float paramFloat) {
/* 105 */     c();
/*     */     
/* 107 */     l l1 = l.u();
/*     */     
/* 109 */     if (l1.by.showWarLogOnScreen) {
/*     */ 
/*     */       
/* 112 */       int i = (int)(l1.bT - 130.0F * l1.bQ);
/* 113 */       byte b = 20;
/* 114 */       int j = (int)(20.0F * l1.bQ);
/*     */       
/* 116 */       for (ad ad : this.c) {
/*     */         
/* 118 */         String str = ad.a();
/* 119 */         if (ad.c + 5000L < System.currentTimeMillis()) {
/*     */           break;
/*     */         }
/*     */ 
/*     */         
/* 124 */         if (ad.g) {
/*     */           
/* 126 */           this.b.a(255, 160, 160, 160);
/*     */         }
/*     */         else {
/*     */           
/* 130 */           this.b.a(255, 255, 255, 255);
/*     */         } 
/* 132 */         l1.bw.a(str, b, i, this.b);
/*     */         
/* 134 */         i -= j;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized strictfp void c() {
/* 143 */     Iterator<ad> iterator = this.c.iterator();
/* 144 */     while (iterator.hasNext()) {
/*     */       
/* 146 */       ad ad = iterator.next();
/*     */       
/* 148 */       if (ad.c + 20000L < System.currentTimeMillis())
/*     */       {
/* 150 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized strictfp void d() {
/* 158 */     if (this.c.isEmpty()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 163 */     for (ad ad : this.c) {
/*     */       
/* 165 */       if (!ad.g) {
/*     */         
/* 167 */         ad.g = true;
/* 168 */         this.a.b(ad.d, ad.e);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
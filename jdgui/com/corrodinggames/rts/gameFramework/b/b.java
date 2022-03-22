/*     */ package com.corrodinggames.rts.gameFramework.b;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   public boolean a() {
/*  19 */     l l = l.u();
/*     */     
/*  21 */     return l.by.renderClouds;
/*     */   }
/*     */ 
/*     */   
/*     */   boolean a = false;
/*  26 */   e b = null;
/*     */   
/*  28 */   Paint c = (Paint)new q();
/*  29 */   RectF d = new RectF();
/*     */ 
/*     */   
/*  32 */   float e = 0.0F;
/*  33 */   float f = 0.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  38 */     l l = l.u();
/*     */     
/*  40 */     this.b = l.bw.a(R.drawable.noise, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     this.a = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/*  53 */     if (!a()) {
/*     */       return;
/*     */     }
/*     */     
/*  57 */     if (!this.a)
/*     */     {
/*  59 */       b();
/*     */     }
/*     */ 
/*     */     
/*  63 */     this.e += 0.2F * paramFloat;
/*  64 */     this.f += 0.07F * paramFloat;
/*     */     
/*  66 */     this.e %= this.b.l();
/*  67 */     this.f %= this.b.k();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float paramFloat) {
/*  75 */     if (!a()) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     if (!this.a)
/*     */     {
/*  81 */       b();
/*     */     }
/*     */     
/*  84 */     l l = l.u();
/*     */ 
/*     */     
/*  87 */     l.bw.h();
/*     */ 
/*     */     
/*  90 */     float f1 = 3.0F;
/*     */ 
/*     */     
/*  93 */     l.bw.a(f1, f1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     float f2 = (int)f.f(-l.cd / f1, 0.0F);
/* 100 */     float f3 = (int)f.f(-l.ce / f1, 0.0F);
/*     */     
/* 102 */     this.d.a(f2, f3, ((int)(l.ch / f1) + 1), ((int)(l.ci / f1) + 1));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     this.c.b(-16777216);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     this.c.c(40);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     float f4 = l.cd / f1 + f2;
/* 120 */     float f5 = l.ce / f1 + f3;
/*     */     
/* 122 */     f4 += this.e;
/* 123 */     f5 += this.f;
/*     */ 
/*     */ 
/*     */     
/* 127 */     l.bw.a(this.b, this.d, this.c, f4, f5, 0, 0);
/*     */     
/* 129 */     l.bw.i();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
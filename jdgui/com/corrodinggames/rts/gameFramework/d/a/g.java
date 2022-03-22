/*     */ package com.corrodinggames.rts.gameFramework.d.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */ {
/*     */   public static final g a;
/*     */   public static final g b;
/*     */   public static final g c;
/*     */   public static final g d;
/*     */   public static final g e;
/*  24 */   Paint f = (Paint)new q();
/*     */   
/*     */   e g;
/*  27 */   Paint h = (Paint)new q();
/*     */ 
/*     */ 
/*     */   
/*     */   public g a() {
/*  32 */     g g1 = new g();
/*     */     
/*  34 */     g1.g = this.g;
/*     */     
/*  36 */     if (this.f != null) {
/*     */       
/*  38 */       g1.f = new Paint(g1.f);
/*     */     }
/*     */     else {
/*     */       
/*  42 */       g1.f = null;
/*     */     } 
/*  44 */     if (this.h != null) {
/*     */       
/*  46 */       g1.h = new Paint(g1.h);
/*     */     }
/*     */     else {
/*     */       
/*  50 */       g1.h = null;
/*     */     } 
/*     */     
/*  53 */     return g1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  60 */     g g1 = a = new g();
/*  61 */     g1.f.b(Color.a(140, 100, 100, 100));
/*  62 */     g1.h.b(-16777216);
/*  63 */     g1.h.a(Paint.Style.b);
/*     */ 
/*     */     
/*  66 */     g1 = b = new g();
/*  67 */     g1.f.b(Color.a(180, 100, 100, 190));
/*  68 */     g1.h.b(-16777216);
/*  69 */     g1.h.a(Paint.Style.b);
/*     */ 
/*     */     
/*  72 */     g1 = c = new g();
/*  73 */     g1.f = null;
/*  74 */     g1.h = null;
/*     */ 
/*     */     
/*  77 */     g1 = d = new g();
/*  78 */     g1.f = null;
/*  79 */     g1.h.b(-65536);
/*  80 */     g1.h.c(127);
/*  81 */     g1.h.a(Paint.Style.b);
/*     */ 
/*     */     
/*  84 */     g1 = e = new g();
/*  85 */     g1.f.c(255);
/*  86 */     g1.g = (l.u()).bA.be;
/*     */     
/*  88 */     g1.h.b(-7829368);
/*  89 */     g1.h.c(255);
/*  90 */     g1.h.a(Paint.Style.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(l paraml, RectF paramRectF) {
/*  97 */     a(paraml, paramRectF, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(l paraml, RectF paramRectF, String paramString) {
/* 102 */     l l1 = l.u();
/*     */ 
/*     */     
/* 105 */     if (this.g != null) {
/*     */ 
/*     */       
/* 108 */       l1.bw.a(this.g, paramRectF, this.f, 0.0F, 0.0F, 0, 0);
/*     */     }
/* 110 */     else if (this.f != null) {
/*     */       
/* 112 */       paraml.a(paramRectF, this.f);
/*     */     } 
/*     */     
/* 115 */     if (this.h != null)
/*     */     {
/* 117 */       paraml.a(paramRectF, this.h);
/*     */     }
/*     */     
/* 120 */     if (paramString != null);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
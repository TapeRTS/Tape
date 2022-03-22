/*     */ package com.corrodinggames.rts.gameFramework.d.a;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.gameFramework.d.d;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.j.q;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   extends j
/*     */ {
/*     */   String a;
/*  21 */   Paint b = (Paint)new q();
/*  22 */   g c = g.c;
/*     */ 
/*     */   
/*     */   ArrayList d;
/*     */ 
/*     */   
/*     */   public h() {
/*  29 */     this.b.a(Paint.Align.b);
/*  30 */     this.b.b(-16777216);
/*  31 */     a(18.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/*  36 */     l l = l.u();
/*  37 */     l.a(this.b, paramFloat);
/*     */     
/*  39 */     e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/*  44 */     this.b.b(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  51 */     return super.a() + " (text:" + this.a + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/*  57 */     super.a(paramFloat1, paramFloat2);
/*     */     
/*  59 */     l l = d();
/*     */     
/*  61 */     RectF rectF = a(new RectF(), paramFloat1, paramFloat2);
/*     */     
/*  63 */     this.c.a(l, rectF);
/*     */     
/*  65 */     if (this.a == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  70 */     if (this.d == null) {
/*     */       
/*  72 */       l.a(this.a, rectF.d(), rectF.d - this.l, this.b);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/*  77 */       byte b = 0;
/*  78 */       for (String str : this.d) {
/*     */ 
/*     */ 
/*     */         
/*  82 */         Paint paint = this.b;
/*     */         
/*  84 */         int i = d.a(paint);
/*     */ 
/*     */         
/*  87 */         l.a(str, rectF.d(), rectF.b + this.k + i + (b * i), paint);
/*  88 */         b++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/*  97 */     this.a = paramString;
/*     */     
/*  99 */     e();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect c() {
/* 106 */     RectF rectF = a(new RectF(), 0.0F, 0.0F);
/*     */     
/* 108 */     Rect rect = new Rect();
/*     */ 
/*     */     
/* 111 */     rect.d = (int)rectF.d;
/* 112 */     rect.b = (int)rectF.b;
/* 113 */     rect.a = (int)rectF.a;
/* 114 */     rect.c = (int)rectF.c;
/*     */     
/* 116 */     rect.c = 10000;
/*     */     
/* 118 */     return rect;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 124 */     super.b();
/*     */     
/* 126 */     l l = d();
/*     */     
/* 128 */     Rect rect = c();
/*     */     
/* 130 */     this.d = new ArrayList(d.a(this.a, rect, this.b, this.b, true));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     this.i = rect.b();
/* 136 */     this.j = rect.c();
/*     */     
/* 138 */     this.i += this.m + this.n;
/* 139 */     this.j += this.k + this.l;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
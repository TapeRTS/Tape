/*     */ package com.corrodinggames.rts.gameFramework.d.a;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import com.corrodinggames.rts.gameFramework.e.a;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends l
/*     */ {
/*     */   f a;
/*     */   
/*     */   public static e a(String paramString, boolean paramBoolean) {
/*  18 */     e e1 = new e();
/*     */     
/*  20 */     e1.b = g.e;
/*     */     
/*  22 */     e1.i = 200.0F;
/*  23 */     e1.j = 200.0F;
/*     */     
/*  25 */     h h = new h();
/*  26 */     h.a(paramString);
/*  27 */     h.e(5.0F);
/*  28 */     h.f(5.0F);
/*  29 */     h.a(-1);
/*     */     
/*  31 */     e1.a(h);
/*     */     
/*  33 */     e1.a = new f(k.c);
/*  34 */     e1.a(e1.a);
/*     */     
/*  36 */     if (paramBoolean) {
/*     */       
/*  38 */       b b = e1.b(a.a("menus.common.cancel", new Object[0]));
/*  39 */       b.a(new e$1(e1));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     return e1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public b a(String paramString) {
/*  56 */     b b = new b();
/*  57 */     b.a(paramString);
/*  58 */     b.e(5.0F);
/*  59 */     b.f(5.0F);
/*  60 */     b.a(Color.a(255, 30, 240, 30));
/*     */     
/*  62 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b b(String paramString) {
/*  79 */     return a(paramString, (i)null);
/*     */   }
/*     */   
/*     */   public b a(String paramString, i parami) {
/*  83 */     b b = a(paramString);
/*  84 */     b.a(parami);
/*  85 */     this.a.a(b);
/*  86 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void q_() {
/*  91 */     if (!this.s) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  96 */     b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 104 */     super.b();
/*     */     
/* 106 */     l l1 = d();
/*     */     
/* 108 */     this.i = this.z;
/* 109 */     this.j = this.y;
/*     */     
/* 111 */     this.i += this.m + this.n;
/* 112 */     this.j += this.k + this.l;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.n;
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.u;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class f
/*     */   extends e
/*     */ {
/*     */   boolean r = false;
/*     */   private e w;
/*     */   private e x;
/*     */   int s;
/*     */   int t;
/*     */   n u;
/*     */   public static float v;
/*     */   
/*     */   public f(e parame, int paramInt1, n paramn, int paramInt2) {
/*  29 */     this.w = parame;
/*  30 */     this.s = paramInt1;
/*  31 */     this.u = paramn;
/*  32 */     this.t = paramInt2;
/*     */ 
/*     */     
/*  35 */     this.w.a(this);
/*     */ 
/*     */     
/*  38 */     this.g = null;
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
/*     */   public void b(boolean paramBoolean) {
/*     */     try {
/*  51 */       if (paramBoolean)
/*     */       {
/*  53 */         l.d("Loading in lazy loaded bitmap:" + this.w.a() + " team:" + this.t);
/*     */       }
/*     */       
/*  56 */       long l1 = bj.a();
/*     */ 
/*     */ 
/*     */       
/*  60 */       this.w.h();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  65 */       this.x = this.w.g();
/*     */       
/*  67 */       this.x.i();
/*     */ 
/*     */ 
/*     */       
/*  71 */       e[] arrayOfE = new e[1];
/*  72 */       arrayOfE[0] = this.x;
/*     */       
/*  74 */       int[] arrayOfInt1 = new int[1];
/*  75 */       arrayOfInt1[0] = this.s;
/*     */       
/*  77 */       int[] arrayOfInt2 = new int[1];
/*  78 */       arrayOfInt2[0] = this.t;
/*     */       
/*  80 */       long l2 = bj.a();
/*     */       
/*  82 */       if (this.u == n.b) {
/*     */         
/*  84 */         m.b(this.w, arrayOfE, arrayOfInt1);
/*     */       }
/*  86 */       else if (this.u == n.d) {
/*     */         
/*  88 */         m.a(this.w, arrayOfE, arrayOfInt1, arrayOfInt2);
/*     */       }
/*     */       else {
/*     */         
/*  92 */         m.a(this.w, arrayOfE, arrayOfInt1);
/*     */       } 
/*     */       
/*  95 */       double d1 = bj.a(l2);
/*     */ 
/*     */       
/*  98 */       this.x.o();
/*     */ 
/*     */       
/* 101 */       this.x.r();
/*     */ 
/*     */       
/* 104 */       this.w.p();
/*     */       
/* 106 */       this.w = null;
/*     */       
/* 108 */       double d2 = bj.a(l1);
/* 109 */       if (d2 > 1.0D)
/*     */       {
/* 111 */         l.d(((this.u == n.a) ? "Standard " : "Hue ") + "Colouring took:" + bj.a(d2) + " (" + bj.a(d1) + ")");
/*     */       }
/*     */ 
/*     */       
/* 115 */       v = (float)(v + d2);
/*     */ 
/*     */     
/*     */     }
/* 119 */     catch (OutOfMemoryError outOfMemoryError) {
/*     */       
/* 121 */       l.d("Colouring failed with OOM");
/*     */       
/* 123 */       l.a(u.c, outOfMemoryError);
/*     */       
/* 125 */       this.x = (l.u()).bw.o();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Bitmap b() {
/* 135 */     if (!this.r) {
/*     */       
/* 137 */       b(true);
/* 138 */       this.r = true;
/*     */     } 
/* 140 */     return this.x.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e c() {
/* 147 */     if (!this.r) {
/*     */       
/* 149 */       if (v > 60.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 154 */       b(true);
/* 155 */       this.r = true;
/*     */     } 
/*     */     
/* 158 */     if (this.x == null)
/*     */     {
/* 160 */       throw new RuntimeException("coloredBitmap==null");
/*     */     }
/*     */     
/* 163 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void v() {
/* 169 */     if (!this.r) {
/*     */       
/* 171 */       b(false);
/* 172 */       this.r = true;
/*     */     } 
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
/*     */   public int t() {
/* 190 */     if (!this.r)
/*     */     {
/* 192 */       return 0;
/*     */     }
/*     */     
/* 195 */     return super.t();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
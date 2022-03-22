/*    */ package com.corrodinggames.rts.gameFramework.b;
/*    */ 
/*    */ import android.graphics.Color;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.RectF;
/*    */ import com.corrodinggames.rts.gameFramework.j.e;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class g
/*    */ {
/*    */   public String a;
/* 15 */   public int b = 25;
/* 16 */   public int c = 25;
/*    */   
/* 18 */   public int d = 1;
/* 19 */   public int e = 1;
/*    */   
/* 21 */   public int f = 26;
/* 22 */   public int g = 26;
/*    */   
/* 24 */   public int h = Integer.MAX_VALUE;
/*    */   
/* 26 */   public e i = null;
/* 27 */   public e j = null;
/*    */   
/*    */   public boolean k = false;
/*    */ 
/*    */   
/*    */   public void a() {
/* 33 */     this.j = this.i.g();
/* 34 */     this.j.i();
/*    */     
/* 36 */     for (byte b = 0; b < this.j.l(); b++) {
/*    */       
/* 38 */       for (byte b1 = 0; b1 < this.j.k(); b1++) {
/*    */         
/* 40 */         int i = this.j.a(b, b1);
/* 41 */         this.j.a(b, b1, Color.a(Color.a(i), 0, 0, 0));
/*    */       } 
/*    */     } 
/* 44 */     this.j.o();
/*    */     
/* 46 */     this.j.r();
/*    */   }
/*    */ 
/*    */   
/* 50 */   static final Rect l = new Rect();
/* 51 */   static final RectF m = new RectF();
/*    */ 
/*    */   
/*    */   public void a(int paramInt, float paramFloat1, float paramFloat2, Paint paramPaint) {
/* 55 */     Rect rect = l;
/* 56 */     RectF rectF = m;
/* 57 */     boolean bool = true;
/*    */     
/* 59 */     l l = l.u();
/*    */     
/* 61 */     int i = paramInt;
/* 62 */     int j = 0;
/*    */     
/* 64 */     if (i >= this.h) {
/*    */       
/* 66 */       j += i / this.h;
/* 67 */       i %= this.h;
/*    */     } 
/*    */     
/* 70 */     int k = this.d + i * this.f;
/* 71 */     int m = this.e + j * this.g;
/*    */     
/* 73 */     l.a(k, m, k + this.b, m + this.c);
/*    */ 
/*    */     
/* 76 */     rectF.a(paramFloat1, paramFloat2, paramFloat1 + rect.b(), paramFloat2 + rect.c());
/* 77 */     if (bool)
/*    */     {
/* 79 */       rectF.a(-rectF.b() / 2.0F, -rectF.c() / 2.0F);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 85 */     l.bw.a(this.i, rect, rectF, paramPaint);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
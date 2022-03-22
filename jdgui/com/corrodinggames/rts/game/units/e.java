/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Color;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PorterDuff;
/*     */ import android.graphics.PorterDuffColorFilter;
/*     */ import android.graphics.RectF;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.units.d.c;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends c
/*     */ {
/*  18 */   static com.corrodinggames.rts.gameFramework.j.e a = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float b;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ak b() {
/*  29 */     return ak.H;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void c() {
/*  34 */     l l = l.u();
/*     */     
/*  36 */     a = l.bw.a(R.drawable.crystal);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public com.corrodinggames.rts.gameFramework.j.e d() {
/*  43 */     return a;
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
/*     */   public boolean e() {
/*  56 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e(boolean paramBoolean) {
/*  68 */     super(paramBoolean);
/*     */     
/*  70 */     this.D = a;
/*     */     
/*  72 */     b(a);
/*     */     
/*  74 */     this.bO = 11.0F;
/*  75 */     this.bP = this.bO + 1.0F;
/*     */     
/*  77 */     this.bZ = 600.0F;
/*  78 */     this.bY = this.bZ;
/*     */     
/*  80 */     R(1);
/*     */ 
/*     */ 
/*     */     
/*  84 */     this.n.a(0, -1, 0, 0);
/*  85 */     this.o.a(this.n);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   static PorterDuffColorFilter c = new PorterDuffColorFilter(Color.a(200, 200, 200), PorterDuff.Mode.MULTIPLY);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Paint f() {
/*  97 */     return super.f();
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
/*     */   public void a(float paramFloat) {
/* 112 */     super.a(paramFloat);
/*     */     
/* 114 */     this.b += 0.01F * paramFloat;
/* 115 */     if (this.b > 1.0F) {
/*     */       
/* 117 */       this.b--;
/* 118 */       if (this.b > 1.0F)
/*     */       {
/* 120 */         this.b = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float g() {
/* 130 */     return 0.02F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ah h() {
/* 136 */     return ah.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 142 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 148 */     l l = l.u();
/*     */     
/* 150 */     cW.a(co());
/*     */     
/* 152 */     return RectF.a(l.ct, cW);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public com.corrodinggames.rts.gameFramework.j.e k() {
/* 162 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 168 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float m() {
/* 174 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float b(int paramInt) {
/* 180 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(int paramInt) {
/* 186 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf, int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void n() {
/* 199 */     super.n();
/*     */     
/* 201 */     this.b = (this.dI * 5.0F + this.dH * 3.0F) % 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 210 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean p() {
/* 216 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 222 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
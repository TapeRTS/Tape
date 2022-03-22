/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.g.ad;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.utility.o;
/*     */ import com.corrodinggames.rts.gameFramework.utility.s;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class w
/*     */   extends bi
/*     */ {
/*     */   public long dA;
/*  55 */   public static x dB = new x();
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
/*     */   public boolean dC = false;
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
/*     */   public boolean dD = false;
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
/*     */   public boolean dE;
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
/* 100 */   public int dF = 2;
/*     */   
/* 102 */   public int dG = 0;
/*     */ 
/*     */   
/*     */   public float dH;
/*     */   
/*     */   public float dI;
/*     */   
/* 109 */   public float dJ = 0.0F;
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void R(int paramInt) {
/* 114 */     this.dF = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 123 */     paramap.a(this.dC);
/* 124 */     paramap.a(this.dD);
/*     */     
/* 126 */     paramap.a(this.dF);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 132 */     this.dC = paramk.e();
/* 133 */     this.dD = paramk.e();
/*     */     
/* 135 */     this.dF = paramk.f();
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
/* 151 */   private static final o a = new o();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 157 */   public static final s dK = new s("fastGameObjectList");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp w() {
/* 163 */     this(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp w(boolean paramBoolean) {
/* 168 */     if (!paramBoolean) {
/*     */       
/* 170 */       l l = l.u();
/* 171 */       if (this.dA != 0L)
/*     */       {
/* 173 */         throw new RuntimeException("ID for GameObject is already set at:" + this.dA);
/*     */       }
/* 175 */       this.dA = l.bF.t();
/*     */ 
/*     */       
/* 178 */       a.a(this);
/*     */ 
/*     */       
/* 181 */       dK.a(this);
/*     */     }
/*     */     else {
/*     */       
/* 185 */       this.dA = 0L;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(float paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void a(float paramFloat, boolean paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void d(float paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void e(float paramFloat);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void o(float paramFloat) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean c(float paramFloat);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean f(float paramFloat);
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(l paraml) {
/* 225 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/* 236 */     a.b(this);
/*     */ 
/*     */ 
/*     */     
/* 240 */     dK.remove(this);
/*     */     
/* 242 */     this.dC = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp w a(long paramLong, Class paramClass, boolean paramBoolean) {
/* 251 */     if (paramLong == -1L)
/*     */     {
/* 253 */       return null;
/*     */     }
/*     */     
/* 256 */     w[] arrayOfW = dK.a(); byte b; int i;
/* 257 */     for (b = 0, i = dK.size(); b < i; b++) {
/*     */       
/* 259 */       w w1 = arrayOfW[b];
/*     */       
/* 261 */       if (w1.dA == paramLong) {
/*     */         
/* 263 */         if (paramClass.isInstance(w1))
/*     */         {
/* 265 */           return w1;
/*     */         }
/*     */ 
/*     */         
/* 269 */         String str1 = w1.getClass().getName();
/* 270 */         String str2 = paramClass.getName();
/*     */         
/* 272 */         str1 = str1.replace("com.corrodinggames.rts.", "");
/* 273 */         str2 = str2.replace("com.corrodinggames.rts.", "");
/*     */         
/* 275 */         ad.f("object id:" + paramLong + " was found, but with type " + str1 + " instead of " + str2);
/*     */       } 
/*     */     } 
/*     */     
/* 279 */     if (!paramBoolean)
/*     */     {
/* 281 */       ad.f("getFromId:" + paramLong + " was not found");
/*     */     }
/*     */     
/* 284 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp af a(long paramLong, boolean paramBoolean) {
/* 289 */     return (af)a(paramLong, af.class, paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp r b(long paramLong, boolean paramBoolean) {
/* 294 */     return (r)a(paramLong, r.class, paramBoolean);
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
/*     */   public static strictfp o dp() {
/* 309 */     a.a();
/* 310 */     return a;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void dq() {
/* 333 */     a.a();
/*     */ 
/*     */     
/* 336 */     af.bu();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
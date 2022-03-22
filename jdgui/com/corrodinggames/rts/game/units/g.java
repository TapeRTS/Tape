/*     */ package com.corrodinggames.rts.game.units;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.b.f;
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.e.b;
/*     */ import com.corrodinggames.rts.game.units.e.j;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
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
/*     */ public class g
/*     */   extends j
/*     */   implements d
/*     */ {
/*     */   public boolean a;
/*     */   
/*     */   public strictfp ak f() {
/*  54 */     return ak.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   PointF[] b = new PointF[6];
/*  61 */   PointF[] c = new PointF[this.b.length]; static Paint d; static Paint e; static Paint f; int g; float h;
/*     */   float i;
/*     */   int j;
/*     */   
/*     */   public strictfp PointF[] b() {
/*  66 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp PointF[] c() {
/*  72 */     return this.c;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e v() {
/* 102 */     if (this.bB.i == -1)
/*     */     {
/* 104 */       return null;
/*     */     }
/* 106 */     return do[this.bB.M()];
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
/*     */   public strictfp boolean a(af paramaf) {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 128 */     if (this.bz)
/*     */     {
/* 130 */       return b.b;
/*     */     }
/* 132 */     return b.d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 139 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d(int paramInt) {
/* 146 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 153 */     l l = l.u();
/* 154 */     l.bz.b(this.dH, this.dI, this.dJ);
/*     */     
/* 156 */     this.D = b.b;
/* 157 */     R(0);
/*     */     
/* 159 */     this.by = false;
/*     */ 
/*     */     
/* 162 */     l.bu.a(e.n, 0.8F, this.dH, this.dI);
/*     */     
/* 164 */     bl();
/*     */     
/* 166 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp g(boolean paramBoolean) {
/* 173 */     super(paramBoolean); d = new Paint(); d.a(40, 0, 255, 0); d.a(true); d.a(2.0F); d.a(Paint.Cap.b); e = new Paint(); e.a(d); e.a(55, 255, 60, 60); f = new Paint();
/*     */     f.a(60, 255, 255, 255);
/* 175 */     S(20);
/*     */     
/* 177 */     T(20);
/*     */     
/* 179 */     this.bO = 10.0F;
/*     */ 
/*     */ 
/*     */     
/* 183 */     this.dH = -1000.0F;
/* 184 */     this.dI = -1000.0F;
/*     */ 
/*     */     
/* 187 */     this.bP = this.bO;
/*     */ 
/*     */ 
/*     */     
/* 191 */     this.bZ = 170000.0F;
/* 192 */     this.bY = this.bZ;
/*     */     
/* 194 */     this.D = b.b;
/*     */     
/* 196 */     for (byte b = 0; b < this.b.length; b++) {
/*     */       
/* 198 */       this.b[b] = new PointF();
/* 199 */       this.c[b] = new PointF();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(float paramFloat, d paramd) {
/* 208 */     r r = (r)paramd;
/*     */     
/* 210 */     PointF[] arrayOfPointF1 = paramd.b();
/* 211 */     PointF[] arrayOfPointF2 = paramd.c();
/*     */     
/* 213 */     af af = r.V();
/*     */     
/* 215 */     r.aC = (af != null);
/*     */     
/* 217 */     if (af != null) {
/*     */       
/* 219 */       for (byte b = 0; b < arrayOfPointF1.length; b++)
/*     */       {
/* 221 */         PointF pointF1 = arrayOfPointF1[b];
/* 222 */         PointF pointF2 = arrayOfPointF2[b];
/*     */         
/* 224 */         pointF1.a = f.a(pointF1.a, pointF2.a, 0.1F * paramFloat);
/* 225 */         pointF1.b = f.a(pointF1.b, pointF2.b, 0.1F * paramFloat);
/*     */         
/* 227 */         pointF1.a += (pointF2.a - pointF1.a) * 0.04F * paramFloat;
/* 228 */         pointF1.b += (pointF2.b - pointF1.b) * 0.04F * paramFloat;
/*     */         
/* 230 */         float f = af.bO * 0.75F;
/*     */         
/* 232 */         if (f.c(pointF1.a - pointF2.a) < 1.0F)
/*     */         {
/* 234 */           pointF2.a = f.d(-f, f);
/*     */         }
/*     */         
/* 237 */         if (f.c(pointF1.b - pointF2.b) < 1.0F)
/*     */         {
/* 239 */           pointF2.b = f.d(-f, f);
/*     */         
/*     */         }
/*     */       }
/*     */     
/*     */     }
/* 245 */     else if ((arrayOfPointF1[0]).a != 0.0F || (arrayOfPointF1[0]).b != 0.0F) {
/*     */ 
/*     */       
/* 248 */       for (byte b = 0; b < arrayOfPointF1.length; b++) {
/*     */         
/* 250 */         PointF pointF1 = arrayOfPointF1[b];
/* 251 */         PointF pointF2 = arrayOfPointF2[b];
/* 252 */         pointF1.a = 0.0F;
/* 253 */         pointF1.b = 0.0F;
/* 254 */         pointF2.a = 0.0F;
/* 255 */         pointF2.b = 0.0F;
/*     */       } 
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
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 277 */     super.a(paramFloat);
/*     */     
/* 279 */     if (!this.bz)
/*     */     {
/* 281 */       a(paramFloat, this);
/*     */     }
/*     */     
/* 284 */     this.bY = this.bZ;
/*     */ 
/*     */     
/* 287 */     this.g++;
/* 288 */     this.h += paramFloat;
/*     */     
/* 290 */     this.i += paramFloat;
/*     */     
/* 292 */     l l = l.u();
/*     */ 
/*     */     
/* 295 */     if (this.a) {
/*     */       
/* 297 */       l.d("Stress test active");
/* 298 */       for (byte b = 0; b < 'ᝰ'; b++)
/*     */       {
/* 300 */         w();
/*     */       }
/*     */       
/* 303 */       bU();
/*     */       
/*     */       return;
/*     */     } 
/* 307 */     if (this.i > 3.0F) {
/*     */       
/* 309 */       this.i = 0.0F;
/*     */       
/* 311 */       w();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void w() {
/* 318 */     l l = l.u();
/*     */     
/* 320 */     this.j++;
/*     */     
/* 322 */     int i = ak.ad.size();
/*     */ 
/*     */ 
/*     */     
/* 326 */     int k = f.a((w)this, 0, i - 1, 1 + this.j);
/*     */ 
/*     */     
/* 329 */     al al = ak.ad.get(k);
/* 330 */     boolean bool = true;
/* 331 */     if (l.b == al)
/*     */     {
/* 333 */       bool = false;
/*     */     }
/*     */     
/* 336 */     if (al == ak.S)
/*     */     {
/* 338 */       bool = false;
/*     */     }
/*     */     
/* 341 */     if (bool) {
/*     */       
/* 343 */       af af = al.a();
/*     */ 
/*     */       
/* 346 */       af.dH = f.a((w)this, 200, (int)l.bt.f() - 200, 2 + this.g + this.j);
/* 347 */       af.dI = f.a((w)this, 200, (int)l.bt.g() - 200, 3 + this.g + this.j + this.j * 9);
/*     */ 
/*     */       
/*     */       try {
/* 351 */         af.P(f.a((w)this, 0, 3, 4 + this.g + this.j + this.j * 9));
/*     */       }
/* 353 */       catch (f f) {
/*     */         
/* 355 */         throw new RuntimeException(f);
/*     */       } 
/*     */       
/* 358 */       m.c(af);
/*     */       
/* 360 */       if (af.o_())
/*     */       {
/* 362 */         af.a();
/*     */       }
/*     */       
/* 365 */       if (af.bC())
/*     */       {
/* 367 */         af.a();
/*     */       }
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
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {
/* 381 */     if (!this.bz);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float e(int paramInt) {
/* 391 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp float f(int paramInt) {
/* 396 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 405 */     if (!super.c(paramFloat))
/*     */     {
/* 407 */       return false;
/*     */     }
/*     */     
/* 410 */     l l = l.u();
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
/* 437 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf, int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean x() {
/* 453 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int y() {
/* 459 */     return 850000;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(af paramaf) {
/* 465 */     return 1.0E7F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(af paramaf) {
/* 471 */     return 1.0E7F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float m() {
/* 477 */     return 30.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float b(int paramInt) {
/* 483 */     return 100.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float z() {
/* 491 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float A() {
/* 498 */     if (cu())
/*     */     {
/* 500 */       return 4.7F;
/*     */     }
/*     */     
/* 503 */     return 4.8F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float B() {
/* 509 */     return 0.35F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float c(int paramInt) {
/* 515 */     return 99.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean l() {
/* 521 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float C() {
/* 528 */     return 0.04F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float D() {
/* 534 */     return 0.1F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean E() {
/* 543 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g(int paramInt) {
/* 549 */     return 10.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean F() {
/* 556 */     return ((l.u()).by.renderExtraShadows && !this.bz);
/*     */   }
/*     */   
/*     */   public strictfp float G() {
/* 560 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public strictfp float H() {
/* 564 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean o_() {
/* 571 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean I() {
/* 577 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean d(af paramaf) {
/* 583 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean J() {
/* 589 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float a(af paramaf, float paramFloat, f paramf) {
/* 595 */     paramFloat = 0.0F;
/*     */     
/* 597 */     return super.a(paramaf, paramFloat, paramf);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
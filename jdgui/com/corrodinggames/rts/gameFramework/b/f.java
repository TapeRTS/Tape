/*     */ package com.corrodinggames.rts.gameFramework.b;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
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
/*     */ public class f
/*     */   extends w
/*     */ {
/*     */   public float a;
/*     */   public boolean b = true;
/*     */   float c;
/*     */   float d;
/*     */   float e;
/*     */   float f;
/*     */   float g;
/*     */   float h;
/*     */   e i;
/*  42 */   public int j = 0;
/*     */ 
/*     */ 
/*     */   
/*  46 */   public int k = 0;
/*  47 */   public int l = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float m;
/*     */ 
/*     */ 
/*     */   
/*     */   float n;
/*     */ 
/*     */ 
/*     */   
/*     */   float o;
/*     */ 
/*     */ 
/*     */   
/*     */   float p;
/*     */ 
/*     */ 
/*     */   
/*     */   float q;
/*     */ 
/*     */ 
/*     */   
/*     */   float r;
/*     */ 
/*     */ 
/*     */   
/*     */   h s;
/*     */ 
/*     */ 
/*     */   
/*     */   public float t;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u = false;
/*     */ 
/*     */ 
/*     */   
/*     */   static e v;
/*     */ 
/*     */ 
/*     */   
/*     */   static e w;
/*     */ 
/*     */ 
/*     */   
/*     */   private final c x;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/* 102 */     c c1 = (l.u()).bz;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     e e1 = new e(c1);
/* 109 */     a(e1, false);
/*     */     
/* 111 */     e1.ap = 18;
/* 112 */     e1.u = 15.0F;
/*     */     
/* 114 */     v = e1;
/*     */ 
/*     */     
/* 117 */     e1 = new e(c1);
/* 118 */     b(e1, false);
/* 119 */     w = e1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/* 129 */     paramap.a(this.dH);
/* 130 */     paramap.a(this.dI);
/*     */     
/* 132 */     paramap.a(this.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 147 */     this.dH = paramk.g();
/* 148 */     this.dI = paramk.g();
/*     */     
/* 150 */     this.a = paramk.g();
/*     */ 
/*     */     
/* 153 */     this.b = false;
/*     */ 
/*     */     
/* 156 */     super.a(paramk);
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
/*     */   public strictfp f(c paramc) {
/* 168 */     this.x = paramc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(e parame, boolean paramBoolean) {
/* 178 */     parame.c();
/* 179 */     parame.ap = 5;
/* 180 */     if (paramBoolean) {
/*     */       
/* 182 */       parame.ao = com.corrodinggames.rts.gameFramework.f.a(0, 1);
/*     */     }
/*     */     else {
/*     */       
/* 186 */       parame.ao = 0;
/*     */     } 
/* 188 */     parame.Y = 0.0F;
/* 189 */     parame.am = true;
/* 190 */     parame.Q = 0.1F;
/* 191 */     parame.S = 0.5F;
/* 192 */     parame.v = true;
/* 193 */     parame.W = 300.0F;
/* 194 */     parame.X = parame.W;
/* 195 */     parame.s = true;
/* 196 */     parame.t = true;
/* 197 */     parame.u = 40.0F;
/* 198 */     parame.ar = false;
/* 199 */     parame.aq = 2;
/* 200 */     parame.H = 0.4F;
/* 201 */     parame.G = 1.5F;
/*     */ 
/*     */ 
/*     */     
/* 205 */     parame.g = e.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b(e parame, boolean paramBoolean) {
/* 213 */     parame.c();
/* 214 */     parame.ap = 7;
/* 215 */     if (paramBoolean) {
/*     */       
/* 217 */       parame.ao = com.corrodinggames.rts.gameFramework.f.a(0, 3);
/*     */     }
/*     */     else {
/*     */       
/* 221 */       parame.ao = 0;
/*     */     } 
/* 223 */     parame.Y = 0.0F;
/* 224 */     parame.am = true;
/* 225 */     parame.Q = 0.0F;
/* 226 */     parame.S = 0.2F;
/* 227 */     parame.v = true;
/* 228 */     parame.W = 50.0F;
/* 229 */     parame.X = parame.W;
/* 230 */     parame.s = true;
/* 231 */     parame.t = true;
/* 232 */     parame.u = 10.0F;
/* 233 */     parame.ar = false;
/* 234 */     parame.aq = 2;
/*     */     
/* 236 */     parame.g = e.n;
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
/*     */   public static strictfp f a(float paramFloat1, float paramFloat2) {
/* 248 */     f f1 = a(paramFloat1, paramFloat2, v);
/* 249 */     f1.a = 280.0F;
/* 250 */     f1.f = 10.0F;
/* 251 */     f1.c = 10.0F;
/* 252 */     f1.m = 0.03F;
/* 253 */     f1.n = 0.03F;
/* 254 */     f1.p = 6.0F;
/* 255 */     f1.q = 6.0F;
/* 256 */     f1.s = h.a;
/*     */ 
/*     */     
/* 259 */     f1.r = 180.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 266 */     f1.j = -16777216;
/*     */ 
/*     */     
/* 269 */     return f1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp f b(float paramFloat1, float paramFloat2) {
/* 280 */     f f1 = a(paramFloat1, paramFloat2, w);
/* 281 */     f1.a = 330.0F;
/* 282 */     f1.f = 10.0F;
/* 283 */     f1.c = 10.0F;
/* 284 */     f1.m = 0.1F;
/* 285 */     f1.n = 0.03F;
/* 286 */     f1.p = 4.0F;
/* 287 */     f1.q = 4.0F;
/* 288 */     f1.s = h.a;
/*     */ 
/*     */     
/* 291 */     return f1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp f a(float paramFloat1, float paramFloat2, e parame) {
/* 330 */     c c1 = (l.u()).bz;
/* 331 */     f f1 = new f(c1);
/* 332 */     f1.dH = paramFloat1;
/* 333 */     f1.dI = paramFloat2;
/* 334 */     f1.a = 100.0F;
/* 335 */     f1.f = 10.0F;
/* 336 */     f1.i = parame;
/*     */     
/* 338 */     if (parame == null) {
/*     */       
/* 340 */       f1.i = new e(c1);
/* 341 */       l.b("Error: Emitter create srcEffect==null");
/*     */     } 
/*     */     
/* 344 */     return f1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c() {
/* 351 */     l l = l.u();
/*     */     
/* 353 */     return l.cw.b(this.dH, this.dI);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 362 */     this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, paramFloat);
/* 363 */     if (this.t > 0.0F) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 368 */     if (this.b) {
/*     */       
/* 370 */       this.c += paramFloat;
/*     */       
/* 372 */       boolean bool = false;
/*     */ 
/*     */       
/* 375 */       if (this.c > this.f) {
/*     */         
/* 377 */         this.d += paramFloat;
/* 378 */         if (this.d > this.g) {
/*     */           
/* 380 */           this.d = 0.0F;
/*     */           
/* 382 */           this.e++;
/* 383 */           if (this.e > this.h) {
/*     */             
/* 385 */             this.c = 0.0F;
/* 386 */             this.e = 0.0F;
/*     */           } 
/*     */ 
/*     */           
/* 390 */           if (this.u || c()) {
/*     */             
/* 392 */             e e1 = this.x.b(this.dH, this.dI, 0.0F, d.a, false, this.s);
/* 393 */             if (e1 != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 399 */               e1.a(this.i);
/*     */               
/* 401 */               e1.Q += com.corrodinggames.rts.gameFramework.f.c(-this.m, this.m);
/* 402 */               e1.R += com.corrodinggames.rts.gameFramework.f.c(-this.n, this.n);
/* 403 */               e1.S += com.corrodinggames.rts.gameFramework.f.c(-this.o, this.o);
/*     */               
/* 405 */               e1.Y = com.corrodinggames.rts.gameFramework.f.c(-this.r, this.r);
/*     */               
/* 407 */               e1.J = this.dH;
/* 408 */               e1.K = this.dI;
/*     */               
/* 410 */               e1.J += com.corrodinggames.rts.gameFramework.f.c(-this.p, this.p);
/* 411 */               e1.K += com.corrodinggames.rts.gameFramework.f.c(-this.q, this.q);
/*     */ 
/*     */               
/* 414 */               if (this.j != 0)
/*     */               {
/* 416 */                 e1.y = this.j;
/*     */               }
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 422 */               if (this.l >= 0) {
/*     */                 
/* 424 */                 e1.z = this.k;
/* 425 */                 e1.A = this.l;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 438 */     this.a -= paramFloat;
/* 439 */     if (this.a < 0.0F)
/*     */     {
/* 441 */       a();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(l paraml) {
/* 451 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean c(float paramFloat) {
/* 457 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(float paramFloat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat, boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d(float paramFloat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f(float paramFloat) {
/* 484 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\b\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
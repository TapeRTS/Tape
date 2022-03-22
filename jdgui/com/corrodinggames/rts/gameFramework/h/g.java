/*     */ package com.corrodinggames.rts.gameFramework.h;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */ {
/*     */   private h y;
/*     */   protected int a;
/*     */   protected static int b;
/*     */   protected int c;
/*     */   protected short d;
/*     */   protected short e;
/*     */   
/*     */   public strictfp g(h paramh, boolean paramBoolean) {
/*  26 */     this.y = paramh;
/*     */     
/*  28 */     if (paramBoolean)
/*     */     {
/*  30 */       this.a = b++;
/*     */     }
/*     */     
/*  33 */     l l = l.u();
/*  34 */     this.c = l.bg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Float f;
/*     */ 
/*     */   
/*     */   protected boolean g;
/*     */ 
/*     */   
/*     */   protected short h;
/*     */ 
/*     */   
/*     */   protected short i;
/*     */ 
/*     */   
/*     */   protected short j;
/*     */ 
/*     */   
/*     */   protected ah k;
/*     */ 
/*     */   
/*     */   public boolean l;
/*     */ 
/*     */   
/*     */   public int m;
/*     */ 
/*     */   
/*     */   public boolean n;
/*     */ 
/*     */   
/*     */   public float o;
/*     */ 
/*     */   
/*     */   public float p;
/*     */   
/*     */   public boolean q;
/*     */   
/*     */   protected boolean r;
/*     */   
/*     */   protected boolean s;
/*     */   
/*     */   private LinkedList z;
/*     */   
/*     */   public byte[] t;
/*     */   
/*     */   public byte[] u;
/*     */   
/*     */   public byte[] v;
/*     */   
/*     */   public short[] w;
/*     */   
/*     */   public byte[] x;
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  91 */     if (this.z == null) {
/*     */       
/*  93 */       paramap.a(false);
/*     */     }
/*     */     else {
/*     */       
/*  97 */       paramap.a(true);
/*     */ 
/*     */       
/* 100 */       paramap.a("p", true);
/*     */       
/* 102 */       paramap.a(this.z.size());
/*     */       
/* 104 */       if (this.z.size() != 0) {
/*     */         
/* 106 */         l l = this.z.get(0);
/* 107 */         paramap.a(l.a);
/* 108 */         paramap.a(l.b);
/*     */         
/* 110 */         for (byte b = 1; b < this.z.size(); b++) {
/*     */           int k;
/* 112 */           l l1 = this.z.get(b);
/*     */           
/* 114 */           int i = l1.a - l.a;
/* 115 */           int j = l1.b - l.b;
/*     */           
/* 117 */           boolean bool = (f.c(i) > 1 || f.c(j) > 1) ? true : false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 123 */           if (bool) {
/*     */             
/* 125 */             l.d("writeOutCompressedPath: out of range:" + i + "," + j);
/*     */             
/* 127 */             k = 128;
/*     */           }
/*     */           else {
/*     */             
/* 131 */             k = i + 1 + (j + 1 << 2);
/*     */           } 
/*     */           
/* 134 */           paramap.c(k);
/*     */           
/* 136 */           if (bool) {
/*     */             
/* 138 */             paramap.a(l1.a);
/* 139 */             paramap.a(l1.b);
/*     */           } 
/*     */ 
/*     */           
/* 143 */           l = l1;
/*     */         } 
/*     */       } 
/*     */       
/* 147 */       paramap.a("p");
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
/*     */   public strictfp void a(k paramk) {
/* 159 */     boolean bool = paramk.e();
/*     */     
/* 161 */     if (!bool) {
/*     */       
/* 163 */       this.z = null;
/*     */     }
/*     */     else {
/*     */       
/* 167 */       paramk.a("p", true);
/*     */ 
/*     */       
/* 170 */       int i = paramk.f();
/*     */       
/* 172 */       if (i > 160000 || i < 0) {
/*     */         
/* 174 */         l.d("readInCompressedPath: Path too big at:" + i);
/* 175 */         i = -1;
/*     */       } 
/*     */       
/* 178 */       if (i != -1) {
/*     */ 
/*     */         
/* 181 */         this.q = true;
/*     */         
/* 183 */         if (this.z == null)
/*     */         {
/* 185 */           this.z = new LinkedList();
/*     */         }
/* 187 */         this.z.clear();
/*     */       } 
/*     */ 
/*     */       
/* 191 */       if (i > 0) {
/*     */         
/* 193 */         short s1 = paramk.t();
/* 194 */         short s2 = paramk.t();
/*     */         
/* 196 */         this.z.add(new l(s1, s2));
/*     */         
/* 198 */         for (byte b = 1; b < i; b++) {
/*     */ 
/*     */ 
/*     */           
/* 202 */           byte b1 = paramk.d();
/*     */           
/* 204 */           byte b2 = 3;
/* 205 */           byte b3 = 12;
/*     */           
/* 207 */           if (b1 < 128) {
/*     */             
/* 209 */             int j = (b1 & b2) - 1;
/* 210 */             int m = ((b1 & b3) >> 2) - 1;
/*     */             
/* 212 */             boolean bool1 = (f.c(j) > 1 || f.c(m) > 1) ? true : false;
/* 213 */             if (bool1)
/*     */             {
/* 215 */               l.d("readInCompressedPath: out of range but shouldn't be:" + j + "," + m + " for: " + b1);
/*     */             }
/*     */ 
/*     */             
/* 219 */             s1 = (short)(s1 + j);
/* 220 */             s2 = (short)(s2 + m);
/*     */ 
/*     */             
/* 223 */             this.z.add(new l(s1, s2));
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/* 229 */             l.d("readInCompressedPath: out of range unpack:" + s1 + "," + s2);
/*     */             
/* 231 */             s1 = paramk.t();
/* 232 */             s2 = paramk.t();
/*     */             
/* 234 */             this.z.add(new l(s1, s2));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 246 */       paramk.d("p");
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
/*     */   public strictfp void a() {
/* 265 */     e e = this.y.a(this.k);
/* 266 */     if (e == null)
/*     */     {
/* 268 */       throw new RuntimeException("Could not get costs for:" + this.k.toString());
/*     */     }
/*     */ 
/*     */     
/* 272 */     this.t = e.d;
/* 273 */     this.u = e.e;
/* 274 */     this.v = e.f;
/* 275 */     this.w = e.g;
/* 276 */     this.x = e.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b() {
/* 286 */     this.t = null;
/* 287 */     this.u = null;
/* 288 */     this.v = null;
/* 289 */     this.w = null;
/* 290 */     this.x = null;
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
/*     */   public strictfp void a(ah paramah, short paramShort1, short paramShort2, Float paramFloat, boolean paramBoolean) {
/* 304 */     if (paramah == null)
/*     */     {
/* 306 */       throw new RuntimeException("MovementType is null");
/*     */     }
/* 308 */     this.k = paramah;
/*     */     
/* 310 */     this.d = paramShort1;
/* 311 */     this.e = paramShort2;
/* 312 */     this.f = paramFloat;
/* 313 */     this.g = paramBoolean;
/*     */     
/* 315 */     if (this.d < 0) this.d = 0; 
/* 316 */     if (this.e < 0) this.e = 0; 
/* 317 */     if (this.d > this.y.p - 1) this.d = (short)(this.y.p - 1); 
/* 318 */     if (this.e > this.y.q - 1) this.e = (short)(this.y.q - 1); 
/* 319 */     if (this.y.a(paramah) == null)
/*     */     {
/* 321 */       throw new RuntimeException("Could not get costs for:" + paramah.toString());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(short paramShort1, short paramShort2, short paramShort3) {
/* 327 */     if (paramShort1 < 0) paramShort1 = 0; 
/* 328 */     if (paramShort2 < 0) paramShort2 = 0; 
/* 329 */     if (paramShort1 > this.y.p - 1) paramShort1 = (short)(this.y.p - 1); 
/* 330 */     if (paramShort2 > this.y.q - 1) paramShort2 = (short)(this.y.q - 1); 
/* 331 */     this.h = paramShort1;
/* 332 */     this.i = paramShort2;
/* 333 */     this.j = paramShort3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp LinkedList c() {
/* 340 */     l l = l.u();
/*     */     
/* 342 */     if (l.bF.z || l.bJ.g()) {
/*     */ 
/*     */       
/* 345 */       if (this.q)
/*     */       {
/* 347 */         return this.z;
/*     */       }
/*     */ 
/*     */       
/* 351 */       return null;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     return this.z;
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
/*     */   protected strictfp boolean d() {
/* 371 */     return (this.z != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected strictfp void a(LinkedList paramLinkedList) {
/* 377 */     this.z = paramLinkedList;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 383 */     l l = l.u();
/* 384 */     b b = l.bt;
/*     */     
/* 386 */     Paint paint = new Paint();
/*     */     
/* 388 */     paint.a(2.0F);
/*     */     
/* 390 */     paint.a(100, 0, 100, 0);
/*     */     
/* 392 */     l.bw.a((this.h * b.k + b.m - (l.u()).cb), (this.i * b.l + b.n - 
/* 393 */         (l.u()).cc), (this.j * b.k), paint);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 398 */     paint.a(225, 0, 0, 255);
/*     */     
/* 400 */     l.bw.a((this.d * b.k + b.m - (l.u()).cb), (this.e * b.l + b.n - 
/* 401 */         (l.u()).cc), (this.h * b.k + b.m - 
/* 402 */         (l.u()).cb), (this.i * b.l + b.n - 
/* 403 */         (l.u()).cc), paint);
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
/*     */   public strictfp void f() {
/* 417 */     if (this.z != null) {
/*     */       
/* 419 */       l l = l.u();
/* 420 */       b b = l.bt;
/*     */       
/* 422 */       if (this.z.size() >= 1)
/*     */       {
/* 424 */         for (byte b1 = 1; b1 < this.z.size(); b1++) {
/*     */           
/* 426 */           l l1 = this.z.get(b1);
/* 427 */           l l2 = this.z.get(b1 - 1);
/*     */ 
/*     */ 
/*     */           
/* 431 */           Paint paint = new Paint();
/* 432 */           paint.a(255, 0, 255, 0);
/* 433 */           paint.a(2.0F);
/*     */           
/* 435 */           int i = l1.a * b.k + b.m - (l.u()).cb;
/* 436 */           int j = l1.b * b.l + b.n - (l.u()).cc;
/*     */           
/* 438 */           int k = l2.a * b.k + b.m - (l.u()).cb;
/* 439 */           int m = l2.b * b.l + b.n - (l.u()).cc;
/*     */           
/* 441 */           l.bw.a(i, j, k, m, paint);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
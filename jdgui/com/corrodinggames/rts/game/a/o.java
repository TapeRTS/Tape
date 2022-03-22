/*     */ package com.corrodinggames.rts.game.a;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ah;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.d.c;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.bi;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
/*     */ import java.util.ArrayList;
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
/*     */ public abstract class o
/*     */   extends bi
/*     */ {
/*     */   public int Q;
/*     */   protected final a R;
/*     */   public float S;
/*     */   public float T;
/*     */   public float U;
/*     */   public boolean V;
/*     */   
/*     */   public void a(ap paramap) {
/*  39 */     paramap.a(this.S);
/*  40 */     paramap.a(this.T);
/*  41 */     paramap.a(this.U);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  48 */     this.S = paramk.g();
/*  49 */     this.T = paramk.g();
/*  50 */     this.U = paramk.g();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public o(a parama) {
/*  58 */     this.Q = ++parama.ar;
/*     */     
/*  60 */     this.R = parama;
/*  61 */     this.R.aU.add(this);
/*  62 */     this.R.aV.add(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public o(a parama, float paramFloat1, float paramFloat2) {
/*  67 */     this(parama);
/*     */     
/*  69 */     this.S = paramFloat1;
/*  70 */     this.T = paramFloat2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/*  76 */     this.R.aU.remove(this);
/*  77 */     this.R.aV.remove(this);
/*     */     
/*  79 */     this.V = true;
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
/*     */   public boolean c(float paramFloat1, float paramFloat2) {
/*  91 */     float f1 = f.a(this.S, this.T, paramFloat1, paramFloat2);
/*  92 */     float f2 = this.U;
/*     */     
/*  94 */     if (f1 < f2 * f2)
/*     */     {
/*  96 */       return true;
/*     */     }
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 105 */     float f1 = f.a(this.S, this.T, paramaf.dH, paramaf.dI);
/* 106 */     float f2 = this.U + paramaf.bO;
/*     */     
/* 108 */     if (f1 < f2 * f2)
/*     */     {
/* 110 */       return true;
/*     */     }
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, float paramFloat) {
/* 118 */     float f1 = f.a(this.S, this.T, paramaf.dH, paramaf.dI);
/* 119 */     float f2 = this.U + paramaf.bO + paramFloat;
/*     */     
/* 121 */     if (f1 < f2 * f2)
/*     */     {
/* 123 */       return true;
/*     */     }
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(af paramaf) {
/* 132 */     return f.a(this.S, this.T, paramaf.dH, paramaf.dI);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(i parami) {
/* 137 */     return f.a(this.S, this.T, parami.S, parami.T);
/*     */   }
/*     */ 
/*     */   
/*     */   public float d(float paramFloat1, float paramFloat2) {
/* 142 */     return f.a(this.S, this.T, paramFloat1, paramFloat2);
/*     */   }
/*     */ 
/*     */   
/*     */   public PointF w() {
/* 147 */     PointF pointF = new PointF();
/*     */     
/* 149 */     float f1 = (float)(Math.random() * 360.0D);
/*     */     
/* 151 */     float f2 = (float)(Math.random() * this.U);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     pointF.a(this.S + f.i(f1) * f2, this.T + 
/* 157 */         f.h(f1) * f2);
/*     */     
/* 159 */     return pointF;
/*     */   }
/*     */ 
/*     */   
/* 163 */   static final ArrayList W = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   public PointF e(al paramal) {
/* 168 */     l l = l.u();
/*     */     
/* 170 */     PointF pointF = new PointF();
/*     */ 
/*     */     
/* 173 */     float f = this.U;
/*     */     
/* 175 */     ah ah = ah.b;
/*     */ 
/*     */     
/* 178 */     af af = null;
/*     */ 
/*     */ 
/*     */     
/* 182 */     if (paramal == ak.d) {
/*     */       
/* 184 */       f = 600.0F;
/* 185 */       ah = ah.e;
/*     */     } 
/*     */ 
/*     */     
/* 189 */     for (byte b = 0; b < 15; b++) {
/*     */ 
/*     */ 
/*     */       
/* 193 */       ak ak = null;
/*     */       
/* 195 */       boolean bool1 = false;
/* 196 */       boolean bool2 = false;
/*     */       
/* 198 */       if (this instanceof i) {
/*     */         
/* 200 */         i i = (i)this;
/*     */ 
/*     */         
/* 203 */         if (b < 6)
/*     */         {
/* 205 */           if (paramal == ak.J)
/*     */           {
/* 207 */             ak = ak.J;
/*     */           }
/*     */         }
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
/* 225 */         if (ak != null) {
/*     */ 
/*     */           
/* 228 */           r r = null;
/* 229 */           if (af == null)
/*     */           {
/* 231 */             af = af.c(paramal);
/*     */           }
/* 233 */           if (af instanceof r)
/*     */           {
/* 235 */             r = (r)af;
/*     */           }
/*     */           
/* 238 */           int j = i.c((al)ak);
/*     */           
/* 240 */           if (r != null && j > 1) {
/*     */             
/* 242 */             byte b1 = -1;
/* 243 */             int k = f.a(0, j - 1);
/*     */             
/* 245 */             af[] arrayOfAf = af.bj.a(); byte b2; int m;
/* 246 */             for (b2 = 0, m = af.bj.size(); b2 < m; b2++) {
/*     */               
/* 248 */               af af1 = arrayOfAf[b2];
/*     */               
/* 250 */               if (af1.bB == this.R && i.a(af1) && af1.bG() && this.R.i(af1))
/*     */               {
/*     */                 
/* 253 */                 if (af1.r() == ak) {
/*     */                   
/* 255 */                   b1++;
/* 256 */                   if (b1 == k) {
/*     */ 
/*     */                     
/* 259 */                     float f1 = af1.dH;
/* 260 */                     float f2 = af1.dI;
/*     */                     
/* 262 */                     boolean bool3 = (f.a(0, 1) == 0) ? true : false;
/*     */                     
/* 264 */                     float f3 = f1;
/* 265 */                     float f4 = f2;
/* 266 */                     if (bool3) {
/*     */                       
/* 268 */                       f4 += f.c(-150.0F, 150.0F);
/*     */                     }
/*     */                     else {
/*     */                       
/* 272 */                       f3 += f.c(-150.0F, 150.0F);
/*     */                     } 
/*     */                     
/* 275 */                     boolean bool4 = false;
/*     */                     
/* 277 */                     W.clear();
/*     */                     
/* 279 */                     af af2 = null;
/*     */                     
/* 281 */                     l.bA.a(r, f1, f2, f3, f4, bool4, W, af2);
/*     */                     
/* 283 */                     if (W.size() > 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       
/* 290 */                       PointF pointF1 = W.get(0);
/*     */                       
/* 292 */                       pointF.a(pointF1.a, pointF1.b);
/*     */                       
/* 294 */                       bool1 = true;
/*     */ 
/*     */ 
/*     */                     
/*     */                     }
/*     */                     else {
/*     */ 
/*     */ 
/*     */                       
/* 303 */                       bool2 = true;
/*     */                     } 
/*     */                   } 
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 318 */       if (!bool2) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 323 */         if (!bool1) {
/*     */           
/* 325 */           float f1 = (float)(Math.random() * 360.0D);
/* 326 */           float f2 = (float)(Math.random() * f);
/*     */ 
/*     */           
/* 329 */           pointF.a(this.S + f.i(f1) * f2, this.T + 
/* 330 */               f.h(f1) * f2);
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 338 */         l.bt.a(pointF.a, pointF.b);
/* 339 */         int i = l.bt.M;
/* 340 */         int j = l.bt.N;
/* 341 */         if (l.bt.c(i, j)) {
/*     */           
/* 343 */           int k = y.c(i, j, ah);
/*     */ 
/*     */           
/* 346 */           if (k > 5 || k == 0)
/*     */           {
/*     */ 
/*     */             
/* 350 */             if (c.a(paramal, pointF.a, pointF.b, this.R))
/*     */             {
/*     */ 
/*     */               
/* 354 */               return pointF;
/*     */             }
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 360 */         if (paramal == ak.d)
/*     */         {
/* 362 */           f += 100.0F;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 367 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\a\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends h
/*     */ {
/*  29 */   static e a = null;
/*  30 */   static e b = null;
/*  31 */   static e c = null;
/*     */ 
/*     */   
/*  34 */   static e[] d = new e[10];
/*  35 */   static e[] e = new e[10];
/*  36 */   static e[] f = new e[10];
/*     */   
/*  38 */   static e g = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   float i = 0.0F;
/*  53 */   int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  60 */     paramap.a(this.h);
/*     */ 
/*     */     
/*  63 */     paramap.a((this.r == 2));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  75 */     this.h = paramk.g();
/*     */ 
/*     */     
/*  78 */     boolean bool = paramk.e();
/*     */ 
/*     */ 
/*     */     
/*  82 */     if (paramk.b() < 51)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  90 */       if (bool)
/*     */       {
/*  92 */         a(2);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*  97 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void Q(int paramInt) {
/* 103 */     a(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ak b() {
/* 112 */     return ak.J;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void c() {
/* 117 */     l l = l.u();
/*     */     
/* 119 */     a = l.bw.a(R.drawable.power);
/* 120 */     b = l.bw.a(R.drawable.power_t2);
/* 121 */     c = l.bw.a(R.drawable.power_t3);
/*     */     
/* 123 */     d = m.a(a);
/* 124 */     e = m.a(b);
/* 125 */     f = m.a(c);
/*     */     
/* 127 */     g = l.bw.a(R.drawable.power_dead);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 138 */     l l = l.u();
/* 139 */     l.bz.a(this.dH, this.dI, this.dJ);
/*     */     
/* 141 */     this.D = g;
/* 142 */     R(0);
/*     */     
/* 144 */     this.by = false;
/*     */     
/* 146 */     l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     l.bz.b(h.e);
/* 152 */     e e1 = l.bz.c(this.dH, this.dI, this.dJ, -1127220);
/* 153 */     if (e1 != null) {
/*     */       
/* 155 */       e1.H = 0.15F;
/* 156 */       e1.G = 1.0F;
/* 157 */       e1.aq = 2;
/* 158 */       e1.W = 35.0F;
/* 159 */       e1.X = e1.W;
/*     */       
/* 161 */       e1.V = 0.0F;
/*     */       
/* 163 */       e1.y = -14492382;
/*     */     } 
/*     */     
/* 166 */     bj();
/*     */ 
/*     */     
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e d() {
/* 179 */     if (this.bz)
/*     */     {
/* 181 */       return g;
/*     */     }
/*     */     
/* 184 */     if (this.bB == null)
/*     */     {
/* 186 */       return d[d.length - 1];
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
/*     */ 
/*     */ 
/*     */     
/* 200 */     if (this.r == 1)
/*     */     {
/* 202 */       return d[this.bB.M()];
/*     */     }
/* 204 */     if (this.r == 2)
/*     */     {
/* 206 */       return e[this.bB.M()];
/*     */     }
/* 208 */     if (this.r == 3)
/*     */     {
/* 210 */       return f[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 214 */     l.d("Unknown tech level:" + this.r);
/* 215 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e k() {
/* 223 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g(boolean paramBoolean) {
/* 231 */     super(paramBoolean);
/*     */     
/* 233 */     this.D = a;
/*     */     
/* 235 */     a(this.D, 3);
/*     */ 
/*     */ 
/*     */     
/* 239 */     this.bO = 25.0F;
/* 240 */     this.bP = this.bO;
/*     */     
/* 242 */     this.bZ = 800.0F;
/* 243 */     this.bY = this.bZ;
/*     */ 
/*     */ 
/*     */     
/* 247 */     this.n.a(-1, -1, 1, 1);
/* 248 */     this.o.a(this.n);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 257 */     super.a(paramFloat);
/*     */     
/* 259 */     if (!bG() || this.bz)
/*     */       return; 
/* 261 */     this.i = f.a(this.i, paramFloat);
/*     */     
/* 263 */     if (this.i == 0.0F) {
/*     */       
/* 265 */       this.i = 17.0F;
/* 266 */       this.j++;
/*     */       
/* 268 */       if (this.j > 5)
/*     */       {
/* 270 */         this.j = 0;
/*     */       }
/*     */       
/* 273 */       if (this.j <= 2) {
/*     */         
/* 275 */         this.s = this.j;
/*     */       }
/*     */       else {
/*     */         
/* 279 */         this.s = 5 - this.j;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 285 */     this.h += paramFloat;
/* 286 */     if (this.h > 39.9F) {
/*     */       
/* 288 */       this.h -= 40.0F;
/*     */       
/* 290 */       this.bB.f((int)ci());
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
/*     */   public float ci() {
/* 309 */     if (this.r == 1)
/*     */     {
/* 311 */       return 2.0F;
/*     */     }
/* 313 */     if (this.r == 2)
/*     */     {
/* 315 */       return 7.0F;
/*     */     }
/*     */ 
/*     */     
/* 319 */     return 14.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(i parami) {
/* 327 */     if (parami.h.equals(k.J())) {
/*     */       
/* 329 */       a(2);
/* 330 */       U();
/*     */     } 
/*     */     
/* 333 */     if (parami.h.equals(l.J())) {
/*     */       
/* 335 */       a(3);
/* 336 */       U();
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
/*     */   public c bX() {
/* 351 */     if (this.r == 1)
/*     */     {
/* 353 */       return k.J();
/*     */     }
/* 355 */     if (this.r == 2)
/*     */     {
/* 357 */       return l.J();
/*     */     }
/*     */     
/* 360 */     return s.h;
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
/*     */   public int T() {
/* 374 */     return this.r;
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
/*     */   public void a(int paramInt) {
/* 403 */     m.b((af)this);
/*     */     
/* 405 */     if (this.r > paramInt) {
/*     */ 
/*     */       
/* 408 */       this.r = 1;
/* 409 */       this.bZ = 800.0F;
/* 410 */       if (this.bY > this.bZ)
/*     */       {
/* 412 */         this.bY = this.bZ;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 418 */     if (this.r < 2 && paramInt >= 2) {
/*     */       
/* 420 */       this.bZ += 500.0F;
/* 421 */       this.bY += 500.0F;
/*     */     } 
/*     */     
/* 424 */     if (this.r < 3 && paramInt >= 3) {
/*     */       
/* 426 */       this.bZ += 1300.0F;
/* 427 */       this.bY += 1300.0F;
/*     */     } 
/*     */     
/* 430 */     this.r = paramInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 438 */     m.c((af)this);
/*     */     
/* 440 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 448 */   static s k = (s)new g$1(102);
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
/* 521 */   static s l = (s)new g$2(103);
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
/* 598 */   static ArrayList t = new ArrayList(); static {
/* 599 */     t.add(k);
/* 600 */     t.add(l);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList M() {
/* 606 */     return t;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float cJ() {
/* 613 */     return super.cJ() - 8.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int bk() {
/* 619 */     return 12;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.o;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
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
/*     */ public class l
/*     */   extends h
/*     */ {
/*  28 */   static e a = null;
/*  29 */   static e b = null;
/*  30 */   static e c = null;
/*  31 */   static e[] d = new e[10];
/*  32 */   static e[] e = new e[10];
/*  33 */   static e f = null;
/*     */ 
/*     */   
/*     */   boolean g;
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  40 */     paramap.a(this.g);
/*  41 */     paramap.c(0);
/*  42 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  48 */     boolean bool = paramk.e();
/*  49 */     if (bool)
/*     */     {
/*  51 */       a(2);
/*     */     }
/*     */     
/*  54 */     paramk.d();
/*  55 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  63 */     com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*  64 */     a = l1.bw.a(R.drawable.land_factory_front);
/*  65 */     b = l1.bw.a(R.drawable.land_factory_front_t2);
/*  66 */     c = l1.bw.a(R.drawable.land_factory_back);
/*  67 */     f = l1.bw.a(R.drawable.land_factory_dead);
/*     */     
/*  69 */     d = m.a(a);
/*     */     
/*  71 */     e = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/*  79 */     return ak.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/*  85 */     com.corrodinggames.rts.gameFramework.l l1 = com.corrodinggames.rts.gameFramework.l.u();
/*  86 */     l1.bz.a(this.dH, this.dI, this.dJ);
/*  87 */     this.m = null;
/*  88 */     this.D = f;
/*  89 */     R(0);
/*  90 */     this.by = false;
/*  91 */     l1.bu.a(e.o, 0.8F, this.dH, this.dI);
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void Q() {
/*  98 */     super.Q();
/*     */     
/* 100 */     if (this.bz) {
/*     */       
/* 102 */       this.m = null;
/*     */     }
/*     */     else {
/*     */       
/* 106 */       this.m = c;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/* 115 */     if (this.bz)
/*     */     {
/* 117 */       return f;
/*     */     }
/*     */     
/* 120 */     if (this.bB == null)
/*     */     {
/* 122 */       return d[d.length - 1];
/*     */     }
/*     */     
/* 125 */     if (!this.g)
/*     */     {
/* 127 */       return d[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 131 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp l(boolean paramBoolean) {
/* 143 */     super(paramBoolean);
/*     */     
/* 145 */     this.D = a;
/* 146 */     this.m = c;
/*     */     
/* 148 */     b(this.D);
/*     */     
/* 150 */     this.bO = 30.0F;
/* 151 */     this.bP = this.bO;
/*     */     
/* 153 */     this.bZ = 1200.0F;
/* 154 */     this.bY = this.bZ;
/*     */     
/* 156 */     R(3);
/*     */     
/* 158 */     this.n.a(-1, -1, 1, 1);
/* 159 */     this.o.a(-1, -1, 1, 3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 165 */     if (h.d(parami.h)) {
/*     */       
/* 167 */       a(2);
/* 168 */       U();
/*     */     }
/*     */     else {
/*     */       
/* 172 */       super.a(parami);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 179 */     if (paramInt == 1) {
/*     */       
/* 181 */       this.g = false;
/*     */     }
/* 183 */     else if (paramInt == 2) {
/*     */       
/* 185 */       if (!this.g)
/*     */       {
/* 187 */         this.g = true;
/*     */       }
/*     */     } 
/*     */     
/* 191 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 198 */     if (!this.g)
/*     */     {
/* 200 */       return h.J();
/*     */     }
/* 202 */     return s.h;
/*     */   }
/*     */   
/* 205 */   static s h = (s)new l$1(110);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void a(ArrayList<o> paramArrayList, int paramInt) {
/* 287 */     paramArrayList.add(new o());
/* 288 */     if (paramInt == 1)
/*     */     {
/* 290 */       paramArrayList.add(h);
/*     */     }
/*     */     
/* 293 */     paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.h, Integer.valueOf(1)));
/* 294 */     paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.i, Integer.valueOf(2)));
/* 295 */     paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.j, Integer.valueOf(3)));
/* 296 */     paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.k, Integer.valueOf(4)));
/*     */     
/* 298 */     if (paramInt >= 2) {
/*     */       
/* 300 */       paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.s, Integer.valueOf(5)));
/* 301 */       paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.w, Integer.valueOf(6)));
/* 302 */       paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.x, Integer.valueOf(7)));
/* 303 */       paramArrayList.add(new com.corrodinggames.rts.game.units.a.l((al)ak.r, Integer.valueOf(8)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 311 */     return c().a(T());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int T() {
/* 317 */     if (this.g)
/*     */     {
/* 319 */       return 2;
/*     */     }
/*     */     
/* 322 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp j da() {
/* 331 */     return new m(this);
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
/*     */   public strictfp boolean bx() {
/* 352 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float cJ() {
/* 359 */     return super.cJ() - 8.0F;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
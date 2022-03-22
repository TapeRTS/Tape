/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.a.l;
/*     */ import com.corrodinggames.rts.game.units.a.o;
/*     */ import com.corrodinggames.rts.game.units.a.s;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.u;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends h
/*     */ {
/*  24 */   static com.corrodinggames.rts.gameFramework.j.e a = null;
/*     */   
/*  26 */   static com.corrodinggames.rts.gameFramework.j.e b = null;
/*  27 */   static com.corrodinggames.rts.gameFramework.j.e[] c = new com.corrodinggames.rts.gameFramework.j.e[10];
/*  28 */   static com.corrodinggames.rts.gameFramework.j.e[] d = new com.corrodinggames.rts.gameFramework.j.e[10];
/*  29 */   static com.corrodinggames.rts.gameFramework.j.e e = null;
/*     */ 
/*     */   
/*     */   boolean f;
/*     */ 
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  36 */     paramap.a(this.f);
/*  37 */     paramap.c(0);
/*  38 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  44 */     boolean bool = paramk.e();
/*  45 */     if (bool)
/*     */     {
/*  47 */       L();
/*     */     }
/*  49 */     paramk.d();
/*  50 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  55 */     l l = l.u();
/*  56 */     a = l.bw.a(R.drawable.experimental_unit_factory_front);
/*     */     
/*  58 */     b = l.bw.a(R.drawable.experimental_unit_factory_base);
/*  59 */     e = l.bw.a(R.drawable.experimental_unit_factory_dead);
/*     */     
/*  61 */     c = m.a(a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/*  69 */     return ak.G;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/*  75 */     l l = l.u();
/*     */     
/*  77 */     this.m = null;
/*  78 */     this.D = e;
/*  79 */     R(0);
/*  80 */     this.by = false;
/*     */ 
/*     */     
/*  83 */     a(u.h);
/*     */     
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e d() {
/*  98 */     if (this.bz)
/*     */     {
/* 100 */       return e;
/*     */     }
/*     */     
/* 103 */     if (this.bB == null)
/*     */     {
/* 105 */       return c[c.length - 1];
/*     */     }
/*     */     
/* 108 */     if (!this.f)
/*     */     {
/* 110 */       return c[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 114 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void Q() {
/* 122 */     super.Q();
/*     */     
/* 124 */     if (this.bz) {
/*     */       
/* 126 */       this.m = null;
/*     */     }
/*     */     else {
/*     */       
/* 130 */       this.m = b;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp com.corrodinggames.rts.gameFramework.j.e k() {
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp e(boolean paramBoolean) {
/* 143 */     super(paramBoolean);
/*     */     
/* 145 */     this.D = a;
/* 146 */     this.m = b;
/*     */     
/* 148 */     b(this.D);
/*     */     
/* 150 */     this.bO = 55.0F;
/* 151 */     this.bP = this.bO;
/*     */     
/* 153 */     this.bZ = 3200.0F;
/* 154 */     this.bY = this.bZ;
/*     */     
/* 156 */     R(4);
/*     */     
/* 158 */     this.n.a(-2, -2, 2, 2);
/* 159 */     this.o.a(-2, -2, 2, 4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 166 */     if (parami.h.equals(g.J())) {
/*     */       
/* 168 */       L();
/*     */     }
/*     */     else {
/*     */       
/* 172 */       super.a(parami);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void L() {
/* 178 */     if (!this.f) {
/*     */       
/* 180 */       this.f = true;
/* 181 */       Q();
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
/*     */   public strictfp c bX() {
/* 196 */     return s.h;
/*     */   }
/*     */   
/* 199 */   static s g = (s)new e$1(110);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 260 */     paramArrayList.add(new o());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     paramArrayList.add(new l((al)ak.F, Integer.valueOf(2)));
/*     */     
/* 267 */     paramArrayList.add(new l((al)ak.O, Integer.valueOf(3)));
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
/*     */   public strictfp ArrayList M() {
/* 291 */     return c().a(T());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bx() {
/* 299 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.game.units.d;
/*     */ 
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.c;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.a.e;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class s
/*     */   extends h
/*     */ {
/*  29 */   static e a = null;
/*  30 */   static e b = null;
/*     */ 
/*     */   
/*  33 */   static e[] c = new e[10];
/*  34 */   static e[] d = new e[10];
/*     */   
/*  36 */   static e e = null;
/*     */ 
/*     */ 
/*     */   
/*  40 */   int f = 1;
/*     */   
/*  42 */   float g = 0.0F;
/*  43 */   int h = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ap paramap) {
/*  49 */     paramap.a(this.f);
/*     */     
/*  51 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(k paramk) {
/*  58 */     int i = paramk.f();
/*  59 */     a(i);
/*     */     
/*  61 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ak b() {
/*  69 */     return ak.N;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void c() {
/*  74 */     l l = l.u();
/*     */     
/*  76 */     a = l.bw.a(R.drawable.supply_depot);
/*  77 */     b = l.bw.a(R.drawable.supply_depot_t2);
/*     */     
/*  79 */     c = m.a(a);
/*  80 */     d = m.a(b);
/*     */     
/*  82 */     e = l.bw.a(R.drawable.supply_depot_dead);
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
/*  93 */     l l = l.u();
/*  94 */     l.bz.a(this.dH, this.dI, this.dJ);
/*     */     
/*  96 */     this.D = e;
/*  97 */     R(0);
/*     */     
/*  99 */     this.by = false;
/*     */     
/* 101 */     l.bu.a(e.o, 0.8F, this.dH, this.dI);
/*     */     
/* 103 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e d() {
/* 113 */     if (this.bz)
/*     */     {
/* 115 */       return e;
/*     */     }
/*     */     
/* 118 */     if (this.bB == null)
/*     */     {
/* 120 */       return c[c.length - 1];
/*     */     }
/*     */     
/* 123 */     if (this.f == 1)
/*     */     {
/* 125 */       return c[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 129 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e k() {
/* 138 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public s(boolean paramBoolean) {
/* 145 */     super(paramBoolean);
/*     */     
/* 147 */     this.D = a;
/*     */     
/* 149 */     a(this.D, 1);
/*     */ 
/*     */ 
/*     */     
/* 153 */     this.bO = 20.0F;
/* 154 */     this.bP = this.bO;
/*     */     
/* 156 */     this.bZ = 800.0F;
/* 157 */     this.bY = this.bZ;
/*     */ 
/*     */ 
/*     */     
/* 161 */     this.n.a(-1, -1, 0, 0);
/* 162 */     this.o.a(this.n);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 171 */     super.a(paramFloat);
/*     */     
/* 173 */     if (!bG() || this.bz) {
/*     */       return;
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
/*     */   public void a(i parami) {
/* 186 */     if (parami.h.equals(j.J())) {
/*     */       
/* 188 */       L();
/* 189 */       U();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/* 196 */     this.f = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void L() {
/* 201 */     if (this.f == 1) {
/*     */       
/* 203 */       this.f = 2;
/* 204 */       Q();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public c bX() {
/* 214 */     if (this.f == 1)
/*     */     {
/* 216 */       return j.J();
/*     */     }
/* 218 */     return com.corrodinggames.rts.game.units.a.s.h;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 223 */   public static int i = 0;
/*     */   
/* 225 */   static com.corrodinggames.rts.game.units.a.s j = (com.corrodinggames.rts.game.units.a.s)new s$1(102);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 288 */   static ArrayList k = new ArrayList(); static {
/* 289 */     k.add(j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList M() {
/* 295 */     return k;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
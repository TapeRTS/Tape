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
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class r
/*     */   extends h
/*     */ {
/*  22 */   static e a = null;
/*  23 */   static e b = null;
/*     */   
/*  25 */   static e c = null;
/*     */   
/*  27 */   static e[] d = new e[10];
/*  28 */   static e[] e = new e[10];
/*     */   
/*  30 */   static e f = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  40 */     l l = l.u();
/*     */ 
/*     */     
/*  43 */     a = l.bw.a(R.drawable.sea_factory);
/*  44 */     b = l.bw.a(R.drawable.sea_factory_t2);
/*     */ 
/*     */ 
/*     */     
/*  48 */     f = l.bw.a(R.drawable.sea_factory_dead);
/*     */ 
/*     */     
/*  51 */     d = m.a(a);
/*  52 */     e = m.a(b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/*  59 */     return ak.d;
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
/*     */   public strictfp boolean K() {
/*  71 */     this.m = null;
/*  72 */     this.D = f;
/*     */ 
/*     */     
/*  75 */     R(0);
/*     */     
/*  77 */     this.by = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     a(u.d);
/*     */ 
/*     */     
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  92 */     if (this.bz)
/*     */     {
/*  94 */       return f;
/*     */     }
/*     */     
/*  97 */     if (this.bB == null)
/*     */     {
/*  99 */       return d[d.length - 1];
/*     */     }
/*     */     
/* 102 */     if (this.r == 1)
/*     */     {
/* 104 */       return d[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 108 */     return e[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 116 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp r(boolean paramBoolean) {
/* 123 */     super(paramBoolean);
/*     */     
/* 125 */     this.D = a;
/*     */     
/* 127 */     b(a);
/*     */     
/* 129 */     this.bO = 45.0F;
/* 130 */     this.bP = this.bO;
/*     */     
/* 132 */     this.bZ = 1000.0F;
/* 133 */     this.bY = this.bZ;
/*     */     
/* 135 */     R(2);
/*     */ 
/*     */     
/* 138 */     this.n.a(-1, -1, 1, 2);
/* 139 */     this.o.a(-2, -1, 2, 4);
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
/*     */   public strictfp void a(i parami) {
/* 156 */     if (parami.h.equals(g.J())) {
/*     */       
/* 158 */       a(2);
/* 159 */       U();
/*     */     }
/*     */     else {
/*     */       
/* 163 */       super.a(parami);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp int db() {
/* 169 */     return -20;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int T() {
/* 175 */     return this.r;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 181 */     if (paramInt == 1) {
/*     */       
/* 183 */       this.r = 1;
/*     */     }
/* 185 */     else if (paramInt == 2) {
/*     */       
/* 187 */       if (this.r == 1)
/*     */       {
/* 189 */         this.r = 2;
/*     */       }
/*     */     } 
/*     */     
/* 193 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 199 */     if (this.r == 1)
/*     */     {
/* 201 */       return g.J();
/*     */     }
/* 203 */     return s.h;
/*     */   }
/*     */   
/* 206 */   static s g = (s)new r$1(110);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 283 */     paramArrayList.add(new o());
/*     */     
/* 285 */     paramArrayList.add(g);
/*     */     
/* 287 */     paramArrayList.add(new l((al)ak.L, Integer.valueOf(1)));
/*     */     
/* 289 */     paramArrayList.add(new l((al)ak.p, Integer.valueOf(2)));
/* 290 */     paramArrayList.add(new l((al)ak.o, Integer.valueOf(3)));
/* 291 */     paramArrayList.add(new l((al)ak.s, Integer.valueOf(4)));
/* 292 */     paramArrayList.add(new l((al)ak.u, Integer.valueOf(5)));
/* 293 */     paramArrayList.add(new l((al)ak.K, Integer.valueOf(6)));
/*     */     
/* 295 */     if (paramInt > 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 306 */     return c().a(T());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean bx() {
/* 312 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*     */ public class a
/*     */   extends h
/*     */ {
/*  28 */   static e a = null;
/*  29 */   static e b = null;
/*     */   
/*  31 */   static e[] c = new e[10];
/*  32 */   static e[] d = new e[10];
/*     */   
/*  34 */   static e e = null;
/*     */   
/*  36 */   int f = 1;
/*     */   float g;
/*     */   
/*     */   public strictfp void a(ap paramap) {
/*  40 */     paramap.a(this.f);
/*  41 */     super.a(paramap);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/*  46 */     if (paramk.b() >= 17) {
/*     */       
/*  48 */       int i = paramk.f();
/*  49 */       a(i);
/*     */     } 
/*  51 */     super.a(paramk);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp void b() {
/*  58 */     l l = l.u();
/*  59 */     a = l.bw.a(R.drawable.air_factory);
/*  60 */     b = l.bw.a(R.drawable.air_factory_t2);
/*  61 */     e = l.bw.a(R.drawable.air_factory_dead);
/*  62 */     c = m.a(a);
/*  63 */     d = m.a(b);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp ak c() {
/*  68 */     return ak.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean K() {
/*  75 */     this.D = e;
/*  76 */     R(0);
/*  77 */     this.by = false;
/*     */     
/*  79 */     a(u.d);
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e d() {
/*  86 */     if (this.bz)
/*     */     {
/*  88 */       return e;
/*     */     }
/*     */     
/*  91 */     if (this.bB == null)
/*     */     {
/*  93 */       return c[c.length - 1];
/*     */     }
/*     */     
/*  96 */     if (this.f == 1)
/*     */     {
/*  98 */       return c[this.bB.M()];
/*     */     }
/*     */ 
/*     */     
/* 102 */     return d[this.bB.M()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp e k() {
/* 111 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp a(boolean paramBoolean) {
/* 116 */     super(paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     this.g = 0.0F; this.D = a; S(40); T(61); this.bO = 30.0F;
/*     */     this.bP = this.bO;
/*     */     this.bZ = 1000.0F;
/*     */     this.bY = this.bZ;
/*     */     this.n.a(-1, -1, 1, 1);
/* 142 */     this.o.a(-1, -1, 1, 2); } public strictfp void a(float paramFloat) { super.a(paramFloat);
/*     */     
/* 144 */     if (!bG() || this.bz) {
/*     */       return;
/*     */     }
/* 147 */     this.g = f.a(this.g, paramFloat);
/*     */     
/* 149 */     if (this.g == 0.0F) {
/*     */       
/* 151 */       this.g = 27.0F;
/*     */       
/* 153 */       this.s++;
/*     */       
/* 155 */       if (this.s > 4)
/*     */       {
/* 157 */         this.s = 0;
/*     */       }
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(i parami) {
/* 167 */     if (parami.h.equals(h.J())) {
/*     */       
/* 169 */       a(2);
/* 170 */       U();
/*     */     }
/*     */     else {
/*     */       
/* 174 */       super.a(parami);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int T() {
/* 181 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 187 */     if (paramInt == 1) {
/*     */       
/* 189 */       this.f = 1;
/*     */     }
/* 191 */     else if (paramInt == 2) {
/*     */       
/* 193 */       if (this.f == 1)
/*     */       {
/* 195 */         this.f = 2;
/*     */       }
/*     */     } 
/*     */     
/* 199 */     Q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp c bX() {
/* 205 */     if (this.f == 1)
/*     */     {
/* 207 */       return h.J();
/*     */     }
/* 209 */     return s.h;
/*     */   }
/*     */   
/* 212 */   static s h = (s)new a$1(110);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 276 */     paramArrayList.add(new o());
/*     */     
/* 278 */     if (paramInt == 1)
/*     */     {
/* 280 */       paramArrayList.add(h);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 285 */     if (paramInt > 1) {
/*     */       
/* 287 */       paramArrayList.add(new l((al)ak.z, Integer.valueOf(3)));
/* 288 */       paramArrayList.add(new l((al)ak.n, Integer.valueOf(4)));
/* 289 */       paramArrayList.add(new l((al)ak.M, Integer.valueOf(5)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ArrayList M() {
/* 298 */     return c().a(T());
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
/*     */   public strictfp boolean bx() {
/* 317 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\d\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
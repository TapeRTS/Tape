/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.d.a;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class v
/*     */   extends s
/*     */ {
/*     */   al a;
/*  19 */   int b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  26 */     if (this == paramObject)
/*     */     {
/*  28 */       return true;
/*     */     }
/*  30 */     if (paramObject == null || paramObject.getClass() != getClass())
/*     */     {
/*  32 */       return false;
/*     */     }
/*  34 */     v v1 = (v)paramObject;
/*     */     
/*  36 */     if (this.b != v1.b)
/*     */     {
/*  38 */       return false;
/*     */     }
/*     */     
/*  41 */     if (this.a != v1.a)
/*     */     {
/*  43 */       return false;
/*     */     }
/*     */     
/*  46 */     return super.equals(paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public v(al paramal) {
/*  52 */     this(paramal, 1, (Integer)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public v(al paramal, int paramInt, Integer paramInteger) {
/*  57 */     super("b_" + paramal.v());
/*     */ 
/*     */     
/*  60 */     al al1 = l.c(paramal);
/*  61 */     if (al1 != null) {
/*     */       
/*  63 */       paramal = al1;
/*     */       
/*  65 */       a("b_" + paramal.v());
/*     */     } 
/*     */ 
/*     */     
/*  69 */     if (paramInt != 1)
/*     */     {
/*  71 */       a(J() + "_" + paramInt);
/*     */     }
/*     */     
/*  74 */     this.a = paramal;
/*  75 */     this.b = paramInt;
/*     */     
/*  77 */     if (paramInteger != null)
/*     */     {
/*  79 */       this.f = paramInteger.intValue();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public al i() {
/* 118 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al v() {
/* 124 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int p() {
/* 131 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 137 */     String str = i().f();
/*     */ 
/*     */     
/* 140 */     boolean bool1 = false;
/* 141 */     boolean bool2 = true;
/*     */     
/* 143 */     af af = af.c(i());
/* 144 */     if (this.b != 1)
/*     */     {
/* 146 */       if (af instanceof r)
/*     */       {
/* 148 */         ((r)af).a(this.b);
/*     */       }
/*     */     }
/*     */     
/* 152 */     str = str + "\n\n" + a.a(af, false, bool1, bool2);
/*     */ 
/*     */     
/* 155 */     if (this.b != 1)
/*     */     {
/* 157 */       if (af instanceof r)
/*     */       {
/* 159 */         ((r)af).a(1);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 164 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 170 */     al al1 = i();
/*     */     
/* 172 */     String str = i().e();
/*     */     
/* 174 */     if (!(al1 instanceof l)) {
/*     */       
/* 176 */       if (p() == 2)
/*     */       {
/* 178 */         str = str + " T-2";
/*     */       }
/* 180 */       if (p() == 3)
/*     */       {
/* 182 */         str = str + " T-3";
/*     */       }
/*     */     } 
/* 185 */     return str;
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
/*     */   public int c() {
/* 199 */     return y().a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public g y() {
/* 205 */     g g = this.g.a();
/* 206 */     if (g != null)
/*     */     {
/* 208 */       return g;
/*     */     }
/*     */     
/* 211 */     return i().d(p());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/* 217 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/* 223 */     return u.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public t f() {
/* 229 */     return t.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k_() {
/* 235 */     return !i().B();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h(af paramaf) {
/* 241 */     l l = l.u();
/*     */     
/* 243 */     if (i() == ak.D || i() == ak.C)
/*     */     {
/* 245 */       if (l.H() && l.bF.aH.i)
/*     */       {
/* 247 */         return true;
/*     */       }
/*     */     }
/* 250 */     if (i().w())
/*     */     {
/* 252 */       return true;
/*     */     }
/*     */     
/* 255 */     return super.h(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 262 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 269 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean A() {
/* 275 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float q(af paramaf) {
/* 283 */     if (!(paramaf instanceof r))
/*     */     {
/* 285 */       return -1.0F;
/*     */     }
/*     */     
/* 288 */     r r = (r)paramaf;
/*     */     
/* 290 */     af af1 = r.V();
/* 291 */     if (af1 != null && af1.bR < 1.0F)
/*     */     {
/* 293 */       if (af1.r() == i())
/*     */       {
/* 295 */         return af1.bR;
/*     */       }
/*     */     }
/* 298 */     return -1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean s(af paramaf) {
/* 306 */     return this.g.a(paramaf, true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 312 */     return this.g.a(paramaf, false);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
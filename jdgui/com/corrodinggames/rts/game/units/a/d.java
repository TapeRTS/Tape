/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends s
/*     */ {
/*     */   int a;
/*     */   a b;
/*     */   
/*     */   public d() {
/*  40 */     super("c_7");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  51 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  56 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ak l() {
/*  64 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/*  70 */     return u.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public t f() {
/*  75 */     return t.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  87 */     return "Attack Mode";
/*     */   }
/*     */ 
/*     */   
/*     */   public String b() {
/*  92 */     a a1 = m();
/*     */     
/*  94 */     if (a1 != null)
/*     */     {
/*  96 */       return a1.name();
/*     */     }
/*     */     
/*  99 */     return "NA";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 105 */     return a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(af paramaf) {
/* 114 */     l l = l.u();
/*     */     
/* 116 */     a a1 = n();
/*     */     
/* 118 */     a a2 = a(a1);
/*     */ 
/*     */     
/* 121 */     m m = null;
/* 122 */     m = paramaf.bB;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     e e = l.bN.b(m);
/*     */ 
/*     */     
/* 130 */     for (af af1 : af.bj) {
/*     */       
/* 132 */       if (af1 instanceof r) {
/*     */         
/* 134 */         r r = (r)af1;
/* 135 */         if (r.ci)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 143 */           e.a(r);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 148 */     e.a(a2);
/*     */ 
/*     */     
/* 151 */     this.a = l.bA.S;
/* 152 */     this.b = a2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a a(a parama) {
/* 159 */     if (parama == a.b)
/*     */     {
/* 161 */       return a.e;
/*     */     }
/* 163 */     if (parama == a.b)
/*     */     {
/* 165 */       return a.f;
/*     */     }
/*     */     
/* 168 */     return a.b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public a m() {
/* 174 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     a a1 = n();
/*     */     
/* 188 */     this.a = l.bA.S;
/* 189 */     this.b = a1;
/*     */ 
/*     */     
/* 192 */     return a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public a n() {
/* 197 */     l l = l.u();
/*     */     
/* 199 */     if (this.a == l.bA.S)
/*     */     {
/* 201 */       if (this.b != null)
/*     */       {
/* 203 */         return this.b;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 208 */     a a1 = null;
/* 209 */     boolean bool1 = false;
/* 210 */     boolean bool2 = false;
/*     */     
/* 212 */     for (af af : af.bj) {
/*     */       
/* 214 */       if (af instanceof r) {
/*     */         
/* 216 */         r r = (r)af;
/* 217 */         if (r.ci) {
/*     */           
/* 219 */           if (a1 == null || a1 == r.G) {
/*     */             
/* 221 */             a1 = r.G;
/*     */             
/*     */             continue;
/*     */           } 
/* 225 */           a1 = a.g;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 234 */     return a1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 244 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String d() {
/* 250 */     return b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 257 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
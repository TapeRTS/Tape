/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ public class z extends s { al a; ArrayList b; int c;
/*     */   boolean d;
/*     */   r e;
/*     */   int i;
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public int c() {
/*     */     return 0;
/*     */   }
/*     */   
/*     */   public al i() {
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   public u e() {
/*     */     return u.i;
/*     */   }
/*     */   
/*     */   public t f() {
/*     */     if (l.aj() && !f.bw)
/*     */       return t.h; 
/*     */     return t.g;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*     */     return false;
/*     */   }
/*     */   
/*  33 */   public z(al paramal) { super("s_" + paramal.v());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     this.b = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     this.c = 0;
/*     */     
/* 279 */     this.e = null; this.f = -9999.0F; this.a = paramal; }
/*     */   public boolean c(af paramaf, boolean paramBoolean) { l l = l.u(); if (!paramBoolean) { if (l.bA.p() == 1)
/*     */         return false;  for (af af1 : af.bj) { if (af1.ci)
/*     */           if (af1.r() != this.a)
/*     */             l.bA.l(af1);   }  } else { for (af af1 : af.bj) { if (af1.ci)
/*     */           if (af1.r() == this.a)
/* 285 */             l.bA.l(af1);   }  }  return true; } public void t() { l l = l.u();
/*     */     
/* 287 */     if (this.i == l.bA.S) {
/*     */       return;
/*     */     }
/*     */     
/* 291 */     this.i = l.bA.S;
/*     */     
/* 293 */     this.c = 0;
/* 294 */     this.d = false;
/* 295 */     this.e = null;
/*     */     
/* 297 */     af[] arrayOfAf = l.bA.bF.a(); byte b; int i;
/* 298 */     for (b = 0, i = l.bA.bF.size(); b < i; b++) {
/*     */       
/* 300 */       af af = arrayOfAf[b];
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 305 */       if (af instanceof r) {
/*     */         
/* 307 */         r r1 = (r)af;
/* 308 */         if (r1.ci)
/*     */         {
/* 310 */           if (r1.r() == this.a) {
/*     */             
/* 312 */             this.c++;
/*     */             
/* 314 */             if (this.e == null)
/*     */             {
/* 316 */               this.e = r1;
/*     */             
/*     */             }
/*     */           }
/*     */           else {
/*     */             
/* 322 */             this.d = true;
/*     */           }  } 
/*     */       } 
/*     */     }  } public String d() { String str = "UnitInfo"; l l = l.u(); if (this.e instanceof com.corrodinggames.rts.game.units.h)
/*     */       return "Editor";  str = "" + this.a.e() + " x" + this.c; return str; }
/*     */   public String b() { return "UnitInfo"; }
/*     */   public String c(af paramaf) { return a(); }
/*     */   public boolean o() { return true; }
/*     */   public boolean q() { return true; }
/*     */   public boolean z() { return true; }
/*     */   public String a() { String str = "";
/*     */     if (this.e instanceof com.corrodinggames.rts.game.units.h)
/*     */       return "Editor"; 
/*     */     if (this.d)
/*     */       str = "(Left click to exclusively select / Right click to unselect)\n"; 
/*     */     return this.a.e() + "\n" + str + this.a.f(); }
/* 338 */   public float j_() { return this.f - this.c; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean D() {
/* 344 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 350 */     return true;
/*     */   } }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
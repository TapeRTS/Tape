/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   extends s
/*     */ {
/*     */   s a;
/*  16 */   b b = b.emptyActionFilter;
/*     */ 
/*     */   
/*     */   boolean c;
/*     */ 
/*     */ 
/*     */   
/*     */   public float j_() {
/*  24 */     return this.a.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(s params) {
/*  30 */     return this.a.a(params);
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
/*     */   public String b() {
/*  42 */     return this.a.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String e(af paramaf) {
/*  48 */     return this.a.e(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  54 */     return this.a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String f(af paramaf) {
/*  63 */     return this.a.f(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/*  70 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  77 */     return this.a.b(paramaf, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k_() {
/*  83 */     return this.a.k_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, boolean paramBoolean) {
/*  90 */     if (this.c)
/*     */     {
/*  92 */       return this.a.a(paramaf, paramBoolean);
/*     */     }
/*     */     
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int p() {
/* 102 */     return this.a.p();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(af paramaf) {
/* 108 */     this.a.g(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 114 */     if (paramObject instanceof h)
/*     */     {
/* 116 */       return this.a.equals(((h)paramObject).a);
/*     */     }
/*     */     
/* 119 */     return false;
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
/*     */   public boolean h(af paramaf) {
/* 133 */     return this.a.h(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 139 */     if (!this.b.isAvailable(this, paramaf))
/*     */     {
/* 141 */       return false;
/*     */     }
/* 143 */     return this.a.a(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 149 */     return this.a.q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 155 */     return this.a.h();
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
/*     */   public al i() {
/* 168 */     return this.a.i();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 174 */     return this.a.g();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/* 180 */     return this.a.e();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public t f() {
/* 186 */     return this.a.f();
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
/*     */   public String d() {
/* 198 */     return this.a.d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 204 */     String str = this.a.c(paramaf);
/*     */ 
/*     */     
/* 207 */     al al = this.a.i();
/* 208 */     if (al != null && al instanceof l) {
/*     */       
/* 210 */       l l = (l)al;
/*     */       
/* 212 */       if (l.B != null) {
/*     */         
/* 214 */         String str1 = l.B.a();
/*     */         
/* 216 */         str1 = f.a(str1, 30);
/*     */         
/* 218 */         str = str + "\n(mod: " + str1 + ")";
/*     */       } 
/*     */     } 
/*     */     
/* 222 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e r() {
/* 228 */     return this.a.r();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e i(af paramaf) {
/* 234 */     return this.a.i(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect s() {
/* 240 */     return this.a.s();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public af j(af paramaf) {
/* 246 */     return this.a.j(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 252 */     return this.a.hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 258 */     return this.a.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public h(s params, b paramb) {
/* 263 */     this(params, paramb, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public h(s params, b paramb, boolean paramBoolean) {
/* 268 */     super(params.J());
/*     */     
/* 270 */     this.a = params;
/* 271 */     this.b = paramb;
/*     */     
/* 273 */     e(this.a.J());
/* 274 */     this.f = this.a.f;
/*     */     
/* 276 */     this.c = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public s t() {
/* 285 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u() {
/* 291 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 298 */     if (!this.b.isAvailable(this, null))
/*     */     {
/* 300 */       return false;
/*     */     }
/*     */     
/* 303 */     if (this.c)
/*     */     {
/* 305 */       return this.a.o();
/*     */     }
/*     */     
/* 308 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public al v() {
/* 315 */     return this.a.v();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(af paramaf, boolean paramBoolean) {
/* 322 */     return this.a.c(paramaf, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 328 */     return this.a.b(paramaf);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
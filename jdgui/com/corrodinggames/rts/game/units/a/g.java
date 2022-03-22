/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.u;
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
/*     */ public class g
/*     */   extends s
/*     */ {
/*     */   public s a;
/*     */   public r b;
/*  26 */   public b c = b.emptyActionFilter;
/*     */   
/*     */   static u d;
/*     */   
/*  30 */   static final u e = new u();
/*     */ 
/*     */   
/*     */   private void H() {
/*  34 */     l l = l.u();
/*     */     
/*  36 */     if (d != null)
/*     */     {
/*  38 */       throw new RuntimeException("savedSelectedUnitsCache!=null");
/*     */     }
/*     */     
/*  41 */     d = l.bA.bF;
/*     */     
/*  43 */     e.clear();
/*  44 */     e.a((af)this.b);
/*  45 */     l.bA.bF = e;
/*     */   }
/*     */ 
/*     */   
/*     */   private void M() {
/*  50 */     l l = l.u();
/*     */     
/*  52 */     if (d == null)
/*     */     {
/*  54 */       throw new RuntimeException("savedSelectedUnitsCache==null");
/*     */     }
/*     */     
/*  57 */     l.bA.bF = d;
/*  58 */     d = null;
/*  59 */     e.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float j_() {
/*  66 */     return super.j_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(s params) {
/*  73 */     return super.a(params);
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
/*     */   public String b() {
/*  86 */     return this.a.b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String e(af paramaf) {
/*  92 */     return this.a.e((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  98 */     return this.a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String f(af paramaf) {
/* 105 */     return this.a.f((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 111 */     return this.a.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/* 117 */     return this.a.b((af)this.b, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k_() {
/* 123 */     return this.a.k_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, boolean paramBoolean) {
/* 130 */     return this.a.a((af)this.b, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int p() {
/* 136 */     return this.a.p();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(af paramaf) {
/* 142 */     this.a.g((af)this.b);
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
/*     */   public boolean equals(Object paramObject) {
/* 157 */     return super.equals(paramObject);
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
/* 171 */     return this.a.h((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 178 */     return this.a.q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 184 */     return this.a.h();
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
/* 197 */     return this.a.i();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 203 */     return this.a.g();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/* 209 */     return this.a.e();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public t f() {
/* 215 */     return this.a.f();
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
/*     */   public String d() {
/* 228 */     H();
/* 229 */     String str = this.a.d();
/* 230 */     M();
/*     */     
/* 232 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 238 */     H();
/* 239 */     String str = this.a.c(paramaf);
/* 240 */     M();
/*     */     
/* 242 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e r() {
/* 248 */     return this.a.r();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e i(af paramaf) {
/* 254 */     return this.a.i(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect s() {
/* 260 */     return this.a.s();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public af j(af paramaf) {
/* 266 */     return this.a.j(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 272 */     return this.a.hashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 278 */     return this.a.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public g(s params, r paramr, c paramc) {
/* 284 */     super(paramc);
/* 285 */     this.a = params;
/* 286 */     this.b = paramr;
/*     */     
/* 288 */     this.f = this.a.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public s t() {
/* 297 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u() {
/* 303 */     return this.a.u();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 310 */     return this.a.o();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public al v() {
/* 317 */     return this.a.v();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public c w() {
/* 324 */     return this.a.J();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(af paramaf1, af paramaf2) {
/* 330 */     super.a(paramaf1, paramaf2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, m paramm) {
/* 336 */     return this.a.a((af)this.b, paramm);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean x() {
/* 342 */     return this.a.x();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 348 */     return this.a.b((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public com.corrodinggames.rts.game.units.custom.g y() {
/* 354 */     return this.a.y();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String k(af paramaf) {
/* 360 */     return this.a.k((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(af paramaf, boolean paramBoolean) {
/* 366 */     return this.a.d((af)this.b, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l(af paramaf) {
/* 372 */     return this.a.l((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m(af paramaf) {
/* 378 */     return this.a.m((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean z() {
/* 384 */     return this.a.z();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean A() {
/* 390 */     return this.a.A();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al B() {
/* 396 */     return this.a.B();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean C() {
/* 402 */     return this.a.C();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean n(af paramaf) {
/* 408 */     return this.a.n((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o(af paramaf) {
/* 414 */     return this.a.o((af)this.b);
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
/*     */   public boolean c(af paramaf, boolean paramBoolean) {
/* 426 */     return this.a.c((af)this.b, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean p(af paramaf) {
/* 432 */     return this.a.p((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean D() {
/* 438 */     return this.a.D();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(af paramaf) {
/* 444 */     this.a.d((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float j() {
/* 450 */     return this.a.j();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int k() {
/* 456 */     return this.a.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean E() {
/* 462 */     return this.a.E();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean F() {
/* 468 */     return this.a.F();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float q(af paramaf) {
/* 474 */     return this.a.q((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList r(af paramaf) {
/* 480 */     return this.a.r((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean s(af paramaf) {
/* 488 */     if (!this.c.isAvailable(this, paramaf))
/*     */     {
/* 490 */       return false;
/*     */     }
/* 492 */     return this.a.s((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 498 */     if (!this.c.isAvailable(this, paramaf))
/*     */     {
/* 500 */       return false;
/*     */     }
/* 502 */     return this.a.a((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int G() {
/* 509 */     return this.a.G();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean t(af paramaf) {
/* 515 */     return this.a.t((af)this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u(af paramaf) {
/* 521 */     return this.a.u((af)this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(g paramg) {
/* 526 */     return (this.a == paramg.a && this.b == paramg.b && 
/*     */       
/* 528 */       J() == paramg.J() && this.c == paramg.c);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
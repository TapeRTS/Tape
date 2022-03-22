/*     */ package com.corrodinggames.rts.game.units.custom.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.a.t;
/*     */ import com.corrodinggames.rts.game.units.a.u;
/*     */ import com.corrodinggames.rts.game.units.a.w;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.g;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.t;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.d.a;
/*     */ import com.corrodinggames.rts.gameFramework.d.w;
/*     */ import com.corrodinggames.rts.gameFramework.j.e;
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
/*     */ public class f
/*     */   extends w
/*     */ {
/*     */   public c a;
/*     */   public t b;
/*  32 */   public d c = d.b;
/*     */ 
/*     */ 
/*     */   
/*     */   public f(c paramc, t paramt) {
/*  37 */     super(null);
/*     */     
/*  39 */     String str = "";
/*  40 */     if (paramc.j != null)
/*     */     {
/*  42 */       str = str + paramc.j;
/*     */     }
/*  44 */     str = str + "_" + paramc.a;
/*  45 */     a(str);
/*     */     
/*  47 */     this.a = paramc;
/*  48 */     this.b = paramt;
/*     */     
/*  50 */     if (paramc.E != null)
/*     */     {
/*  52 */       this.b = paramc.E;
/*     */     }
/*     */     
/*  55 */     this.c = paramc.aD;
/*     */     
/*  57 */     if (this.c == d.a) {
/*     */       
/*  59 */       boolean bool1 = false;
/*  60 */       boolean bool2 = false;
/*     */       
/*  62 */       if (paramc.aa != null && paramc.ab == null)
/*     */       {
/*  64 */         bool2 = true;
/*     */       }
/*     */       
/*  67 */       if (paramc.o.c()) {
/*     */         
/*  69 */         bool1 = true;
/*  70 */         this.c = d.c;
/*     */       } 
/*     */       
/*  73 */       if (bool1 && !bool2) {
/*     */         
/*  75 */         this.c = d.c;
/*     */       }
/*     */       else {
/*     */         
/*  79 */         this.c = d.d;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  85 */     if (paramc.D != null)
/*     */     {
/*  87 */       this.c = d.e;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean C() {
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(af paramaf, boolean paramBoolean) {
/* 107 */     return this.a.H;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean l(af paramaf) {
/* 114 */     return this.a.J;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m(af paramaf) {
/* 120 */     return this.a.K;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 127 */     return super.q();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, boolean paramBoolean) {
/* 133 */     k k = (k)paramaf;
/*     */     
/* 135 */     if (!this.a.I)
/*     */     {
/* 137 */       if (k.a(J(), paramBoolean) > 0)
/*     */       {
/* 139 */         return false;
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     if (this.a.q != null)
/*     */     {
/*     */       
/* 167 */       if (paramBoolean && L()) {
/*     */         
/* 169 */         if (!w.a(this.a.q, k))
/*     */         {
/* 171 */           return false;
/*     */         
/*     */         }
/*     */       
/*     */       }
/* 176 */       else if (!this.a.q.read(k)) {
/*     */         
/* 178 */         return false;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     return super.a(paramaf, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h(af paramaf) {
/* 210 */     if (a(paramaf, -1))
/*     */     {
/* 212 */       return true;
/*     */     }
/* 214 */     return super.h(paramaf);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, int paramInt) {
/* 219 */     if (this.a.u != null && (paramInt == -1 || paramInt == 1)) {
/*     */       
/* 221 */       if (!(paramaf instanceof k)) {
/*     */         
/* 223 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 224 */         return false;
/*     */       } 
/*     */       
/* 227 */       if (this.a.u.read((k)paramaf))
/*     */       {
/* 229 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 233 */     if (this.a.w != null && (paramInt == -1 || paramInt == 2)) {
/*     */       
/* 235 */       if (!(paramaf instanceof k)) {
/*     */         
/* 237 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 238 */         return false;
/*     */       } 
/*     */       
/* 241 */       if (this.a.w.read((k)paramaf))
/*     */       {
/* 243 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 247 */     if (this.a.y != null && (paramInt == -1 || paramInt == 3)) {
/*     */       
/* 249 */       if (!(paramaf instanceof k)) {
/*     */         
/* 251 */         l.m("CustomActionConfig lockedInGame:" + paramaf.r().i() + " is not a custom unit");
/* 252 */         return false;
/*     */       } 
/*     */       
/* 255 */       if (this.a.y.read((k)paramaf))
/*     */       {
/* 257 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 261 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String k(af paramaf) {
/* 268 */     if (a(paramaf, 1))
/*     */     {
/* 270 */       if (this.a.v != null)
/*     */       {
/* 272 */         return this.a.v.b();
/*     */       }
/*     */     }
/* 275 */     if (a(paramaf, 2))
/*     */     {
/* 277 */       if (this.a.x != null)
/*     */       {
/* 279 */         return this.a.x.b();
/*     */       }
/*     */     }
/*     */     
/* 283 */     if (a(paramaf, 3))
/*     */     {
/* 285 */       if (this.a.z != null)
/*     */       {
/* 287 */         return this.a.z.b();
/*     */       }
/*     */     }
/*     */     
/* 291 */     return super.k(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean s(af paramaf) {
/* 297 */     k k = (k)paramaf;
/*     */     
/* 299 */     if (this.a.r != null) {
/*     */       
/* 301 */       if (L())
/*     */       {
/* 303 */         return w.a(this.a.r, k);
/*     */       }
/*     */ 
/*     */       
/* 307 */       return this.a.r.read(k);
/*     */     } 
/*     */ 
/*     */     
/* 311 */     return super.a(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf) {
/* 317 */     k k = (k)paramaf;
/*     */     
/* 319 */     if (this.a.r != null)
/*     */     {
/* 321 */       return this.a.r.read(k);
/*     */     }
/*     */     
/* 324 */     return super.a(paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(af paramaf, m paramm) {
/* 330 */     if (!this.a.s && !this.a.t)
/*     */     {
/*     */       
/* 333 */       return false;
/*     */     }
/*     */     
/* 336 */     if (paramaf.bB.d(paramm))
/*     */     {
/* 338 */       return this.a.s;
/*     */     }
/* 340 */     return this.a.t;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b(af paramaf, boolean paramBoolean) {
/* 348 */     if (this.a.ay)
/*     */     {
/* 350 */       return this.a.o.a(paramaf, true);
/*     */     }
/*     */     
/* 353 */     return super.b(paramaf, paramBoolean);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 453 */     return super.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 463 */     String str = null;
/* 464 */     if (this.a.c != null)
/*     */     {
/* 466 */       str = this.a.c.b();
/*     */     }
/* 468 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String e(af paramaf) {
/* 474 */     String str = null;
/* 475 */     if (this.a.c != null)
/*     */     {
/* 477 */       str = this.a.c.b();
/*     */     }
/* 479 */     if (this.a.d != null) {
/*     */       
/* 481 */       al al = this.a.d.getTypeOrNull(paramaf);
/* 482 */       if (al != null) {
/*     */         
/* 484 */         if (str == null) {
/*     */           
/* 486 */           str = "";
/*     */         }
/* 488 */         else if (!str.equals("")) {
/*     */           
/* 490 */           str = str + " ";
/*     */         } 
/* 492 */         str = str + al.e();
/*     */       } 
/*     */     } 
/* 495 */     if (this.a.g != null) {
/*     */       
/* 497 */       if (str == null) {
/*     */         
/* 499 */         str = "";
/*     */       }
/* 501 */       else if (!str.equals("")) {
/*     */         
/* 503 */         str = str + " ";
/*     */       } 
/* 505 */       str = str + this.a.g.b();
/*     */     } 
/* 507 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 513 */     String str = null;
/* 514 */     if (this.a.h != null)
/*     */     {
/* 516 */       str = this.a.h.b();
/*     */     }
/* 518 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String f(af paramaf) {
/* 524 */     String str = null;
/*     */     
/* 526 */     if (this.a.h != null)
/*     */     {
/* 528 */       str = this.a.h.b();
/*     */     }
/*     */     
/* 531 */     if (this.a.e != null) {
/*     */       
/* 533 */       al al = this.a.e.getTypeOrNull(paramaf);
/* 534 */       if (al != null) {
/*     */         
/* 536 */         if (str == null) {
/*     */           
/* 538 */           str = "";
/*     */         }
/* 540 */         else if (!str.equals("")) {
/*     */           
/* 542 */           str = str + " ";
/*     */         } 
/* 544 */         str = str + al.f();
/*     */       } 
/*     */     } 
/*     */     
/* 548 */     if (this.a.f != null) {
/*     */ 
/*     */       
/* 551 */       af af1 = this.a.f.getUnitReferenceOrNull(paramaf);
/* 552 */       if (af1 != null) {
/*     */         
/* 554 */         if (str == null) {
/*     */           
/* 556 */           str = "";
/*     */         }
/* 558 */         else if (!str.equals("")) {
/*     */           
/* 560 */           str = str + "\n\n";
/*     */         } 
/*     */ 
/*     */         
/* 564 */         boolean bool = false;
/*     */         
/* 566 */         String str1 = a.a(af1, false, false, bool);
/*     */         
/* 568 */         str = str + str1;
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 573 */         af af2 = this.a.f.getUnitOrSharedUnit(paramaf);
/* 574 */         if (af2 != null) {
/*     */           
/* 576 */           if (str == null) {
/*     */             
/* 578 */             str = "";
/*     */           }
/* 580 */           else if (!str.equals("")) {
/*     */             
/* 582 */             str = str + "\n\n";
/*     */           } 
/*     */           
/* 585 */           boolean bool = true;
/*     */           
/* 587 */           String str1 = a.a(af2, false, false, bool);
/*     */           
/* 589 */           str = str + str1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 596 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 603 */     return this.a.O;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float t() {
/* 610 */     if (this.a.M >= 1.0F)
/*     */     {
/* 612 */       return 1000.0F;
/*     */     }
/* 614 */     return this.a.M;
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
/*     */   public u e() {
/* 629 */     return this.a.i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public g y() {
/* 635 */     return this.a.o;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 641 */     return this.a.o.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al i() {
/* 647 */     if (this.b == null)
/*     */     {
/* 649 */       return null;
/*     */     }
/* 651 */     return this.b.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al v() {
/* 657 */     if (this.a.E != null)
/*     */     {
/* 659 */       return this.a.E.c();
/*     */     }
/* 661 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public al B() {
/* 667 */     if (this.a.D != null)
/*     */     {
/* 669 */       return this.a.D.c();
/*     */     }
/* 671 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean x() {
/* 677 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 683 */     if (this.a.E != null)
/*     */     {
/* 685 */       return true;
/*     */     }
/*     */     
/* 688 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public t f() {
/* 694 */     return this.a.aw;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean n(af paramaf) {
/* 701 */     return this.a.B.read((k)paramaf);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o(af paramaf) {
/* 708 */     if (this.a.A == null)
/*     */     {
/* 710 */       return false;
/*     */     }
/*     */     
/* 713 */     if (!(paramaf instanceof k)) {
/*     */       
/* 715 */       l.b("ai_isHighPriority non customUnit:" + paramaf.r().i());
/* 716 */       return false;
/*     */     } 
/*     */     
/* 719 */     return this.a.A.read((k)paramaf);
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
/*     */   public boolean E() {
/* 739 */     return this.a.F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean F() {
/* 749 */     return this.a.G;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e r() {
/* 755 */     return this.a.ao;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public e i(af paramaf) {
/* 761 */     if (this.a.ar != null && paramaf instanceof k)
/*     */     {
/*     */       
/* 764 */       if (!w.a(this.a.ar, (k)paramaf))
/*     */       {
/* 766 */         return null;
/*     */       }
/*     */     }
/* 769 */     return this.a.ap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int G() {
/* 775 */     return this.a.aq;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public af j(af paramaf) {
/* 781 */     if (this.a.as != null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 795 */       return this.a.as.getUnitOrSharedUnit(paramaf);
/*     */     }
/*     */ 
/*     */     
/* 799 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t(af paramaf) {
/* 804 */     return this.a.at;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u(af paramaf) {
/* 809 */     return this.a.au;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(af paramaf) {
/* 815 */     if (this.a.av != null)
/*     */     {
/*     */       
/* 818 */       return w.a(this.a.av, (k)paramaf);
/*     */     }
/* 820 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean L() {
/* 827 */     return this.a.m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(r paramr) {
/* 834 */     if (this.a.Y != null)
/*     */     {
/* 836 */       w.b((af)paramr, this.a.Y);
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\a\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
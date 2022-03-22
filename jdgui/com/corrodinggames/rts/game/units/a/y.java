/*     */ package com.corrodinggames.rts.game.units.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.d.a;
/*     */ import com.corrodinggames.rts.gameFramework.g.ap;
/*     */ import com.corrodinggames.rts.gameFramework.g.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class y
/*     */   extends s
/*     */ {
/*     */   public boolean a;
/*     */   
/*     */   public y(boolean paramBoolean) {
/*  32 */     super("c_5");
/*  33 */     this.f = -9990.0F;
/*     */     
/*  35 */     this.a = paramBoolean;
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
/*     */   public int b(af paramaf, boolean paramBoolean) {
/*  49 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/*  54 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public al i() {
/*  62 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public u e() {
/*  68 */     return u.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public t f() {
/*  73 */     return t.g;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  79 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public r t() {
/*  87 */     l l = l.u();
/*     */     
/*  89 */     af[] arrayOfAf = l.bA.bF.a(); byte b; int i;
/*  90 */     for (b = 0, i = l.bA.bF.size(); b < i; b++) {
/*     */       
/*  92 */       af af = arrayOfAf[b];
/*     */ 
/*     */ 
/*     */       
/*  96 */       if (af instanceof r) {
/*     */         
/*  98 */         r r = (r)af;
/*  99 */         if (r.ci)
/*     */         {
/*     */           
/* 102 */           return r;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 107 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean H() {
/* 113 */     l l = l.u();
/*     */     
/* 115 */     r r = t();
/*     */     
/* 117 */     if (r != null) {
/*     */       
/* 119 */       if (r instanceof com.corrodinggames.rts.game.units.h)
/*     */       {
/* 121 */         return true;
/*     */       }
/*     */ 
/*     */       
/* 125 */       return (l.bb == r.bB);
/*     */     } 
/* 127 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String d() {
/* 133 */     String str = "UnitInfo";
/*     */     
/* 135 */     l l = l.u();
/*     */     
/* 137 */     r r = t();
/*     */     
/* 139 */     if (r != null) {
/*     */ 
/*     */       
/* 142 */       if (r instanceof com.corrodinggames.rts.game.units.h)
/*     */       {
/* 144 */         return "Editor";
/*     */       }
/*     */       
/* 147 */       if (!this.a) {
/*     */         
/* 149 */         str = l.bA.d.a((af)r, false);
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 154 */         m m = r.bB;
/*     */         
/* 156 */         str = l.bA.d.a(m);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 162 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 171 */     return "UnitInfo";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(af paramaf) {
/* 177 */     return a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 185 */     if (this.a) {
/*     */ 
/*     */ 
/*     */       
/* 189 */       if (!H())
/*     */       {
/* 191 */         return true;
/*     */       }
/* 193 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 198 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 207 */     if (this.a)
/*     */     {
/* 209 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 213 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean z() {
/* 220 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 226 */     if (this.a)
/*     */     {
/* 228 */       return "";
/*     */     }
/*     */ 
/*     */     
/* 232 */     r r = t();
/*     */     
/* 234 */     if (r != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 239 */       boolean bool1 = false;
/*     */       
/* 241 */       String str = a.a((af)r, true, true, bool1);
/*     */       
/* 243 */       boolean bool2 = false;
/* 244 */       if (bool2) {
/*     */         
/* 246 */         f f = new f();
/*     */ 
/*     */         
/*     */         try {
/* 250 */           r.a((ap)f);
/* 251 */         } catch (IOException iOException) {
/*     */ 
/*     */           
/* 254 */           iOException.printStackTrace();
/*     */         } 
/*     */         
/* 257 */         str = str + "\n" + f.a;
/*     */       } 
/*     */ 
/*     */       
/* 261 */       return str;
/*     */     } 
/* 263 */     return "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean D() {
/* 272 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\a\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
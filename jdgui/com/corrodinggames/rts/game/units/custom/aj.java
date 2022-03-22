/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.b.b;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class aj
/*     */ {
/*  40 */   m a = new m();
/*  41 */   m b = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   boolean d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static aj a(l paraml, ab paramab) {
/* 135 */     aj aj1 = new aj();
/* 136 */     aj1.b(paraml, paramab);
/*     */     
/* 138 */     if (aj1.b.size() == 0)
/*     */     {
/* 140 */       return null;
/*     */     }
/*     */     
/* 143 */     for (h h : aj1.a) {
/*     */       
/* 145 */       if (h != null) {
/*     */         
/* 147 */         byte b = 0;
/* 148 */         al al = null;
/*     */         
/* 150 */         for (al al1 : aj1.b) {
/*     */           
/* 152 */           if (al1.b == h) {
/*     */             
/* 154 */             b++;
/* 155 */             al = al1;
/*     */           } 
/*     */         } 
/*     */         
/* 159 */         if (b == 1)
/*     */         {
/* 161 */           paraml.o("[placementRule_" + al.a + "]anyRuleInGroup: No other rule with this same group name found");
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 168 */     return aj1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(l paraml, ab paramab) {
/* 174 */     for (String str1 : paramab.e("placementRule_")) {
/*     */       
/* 176 */       String str2 = str1.substring("placementRule_".length());
/*     */       
/* 178 */       al al = new al();
/* 179 */       al.a = str2;
/*     */       
/* 181 */       al.a(paraml, paramab, str1);
/*     */       
/* 183 */       if (!al.a()) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 188 */       if (!this.a.contains(al.b))
/*     */       {
/* 190 */         this.a.add(al.b);
/*     */       }
/*     */       
/* 193 */       if (al.n)
/*     */       {
/* 195 */         if (!al.p) {
/*     */           
/* 197 */           this.c = true;
/*     */         }
/*     */         else {
/*     */           
/* 201 */           this.d = true;
/*     */         } 
/*     */       }
/*     */       
/* 205 */       this.b.add(al);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a(r paramr, float paramFloat1, float paramFloat2) {
/* 215 */     if (!this.c)
/*     */     {
/* 217 */       return null;
/*     */     }
/*     */     
/* 220 */     return b(paramr, paramFloat1, paramFloat2);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(r paramr, int paramInt1, int paramInt2) {
/* 225 */     if (!this.d)
/*     */     {
/* 227 */       return null;
/*     */     }
/*     */     
/* 230 */     b b = (l.u()).bt;
/* 231 */     b.b(paramInt1, paramInt2);
/* 232 */     return b(paramr, b.M, b.N);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(r paramr, float paramFloat1, float paramFloat2) {
/* 237 */     for (h h : this.a) {
/*     */       
/* 239 */       boolean bool3, bool1 = false;
/* 240 */       boolean bool2 = false;
/*     */       
/* 242 */       al al = null;
/*     */       
/* 244 */       for (al al1 : this.b) {
/*     */         
/* 246 */         if (al1.b == h)
/*     */         {
/* 248 */           if (al1.n) {
/*     */             
/* 250 */             boolean bool = a(paramr, al1, paramFloat1, paramFloat2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 257 */             if (!bool) {
/*     */               
/* 259 */               if (al == null)
/*     */               {
/* 261 */                 al = al1;
/*     */               }
/* 263 */               bool2 = true;
/*     */               
/*     */               continue;
/*     */             } 
/* 267 */             bool1 = true;
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 275 */       if (h == null) {
/*     */         
/* 277 */         bool3 = !bool2 ? true : false;
/*     */       }
/*     */       else {
/*     */         
/* 281 */         bool3 = bool1;
/*     */       } 
/*     */       
/* 284 */       if (!bool3 && al != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 291 */         if (al.o != null)
/*     */         {
/* 293 */           return al.o.b();
/*     */         }
/* 295 */         return "{0}";
/*     */       } 
/*     */     } 
/*     */     
/* 299 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean a(r paramr, al paramal, float paramFloat1, float paramFloat2) {
/* 305 */     e.a = paramFloat1 + paramal.g;
/* 306 */     e.b = paramFloat2 + paramal.h;
/*     */     
/* 308 */     e.c = paramal;
/* 309 */     e.d = 0;
/*     */ 
/*     */ 
/*     */     
/* 313 */     l l = l.u();
/* 314 */     l.bK.a(e.a, e.b, paramal.e, paramr, 0.0F, e);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 323 */     if (e.d >= paramal.k && e.d <= paramal.l)
/*     */     {
/*     */       
/* 326 */       return true;
/*     */     }
/*     */     
/* 329 */     return false;
/*     */   }
/*     */ 
/*     */   
/* 333 */   public static final ak e = new ak();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
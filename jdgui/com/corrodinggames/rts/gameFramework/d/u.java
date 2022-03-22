/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class u
/*     */ {
/*  17 */   static u a = new u$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  33 */   static u b = new u$2();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   static u c = new u$3();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   static u d = new u$4();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   static u e = new u$5();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   static u f = new u$6();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean a(r paramr);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(ArrayList<r> paramArrayList, u paramu1, u paramu2) {
/* 100 */     l l = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     if (l.bA.p() != 1)
/*     */     {
/* 107 */       paramArrayList.clear();
/*     */     }
/*     */     
/* 110 */     r r1 = l.bA.r();
/*     */     
/* 112 */     if (r1 != null)
/*     */     {
/* 114 */       if (paramu1.a(r1) || (paramu2 != null && paramu2.a(r1))) {
/*     */         
/* 116 */         if (!paramArrayList.contains(r1))
/*     */         {
/* 118 */           paramArrayList.add(r1);
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 123 */         paramArrayList.clear();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 128 */     r r2 = a(paramArrayList, paramu1);
/*     */     
/* 130 */     if (r2 == null && paramu2 != null)
/*     */     {
/* 132 */       r2 = a(paramArrayList, paramu2);
/*     */     }
/*     */     
/* 135 */     if (r2 == null) {
/*     */       
/* 137 */       paramArrayList.clear();
/* 138 */       if (r1 != null)
/*     */       {
/* 140 */         paramArrayList.add(r1);
/*     */       }
/* 142 */       r2 = a(paramArrayList, paramu1);
/*     */       
/* 144 */       if (r2 == null && paramu2 != null)
/*     */       {
/* 146 */         r2 = a(paramArrayList, paramu2);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 151 */     if (r2 != null) {
/*     */       
/* 153 */       l.bA.w();
/* 154 */       l.bA.j((af)r2);
/* 155 */       l.b(r2.dH, r2.dI);
/*     */       
/* 157 */       paramArrayList.add(r2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static r a(ArrayList paramArrayList, u paramu) {
/* 165 */     l l = l.u();
/*     */     
/* 167 */     r r = null;
/* 168 */     float f = -1.0F;
/*     */     
/* 170 */     for (af af : af.bj) {
/*     */       
/* 172 */       if (af instanceof r) {
/*     */         
/* 174 */         r r1 = (r)af;
/* 175 */         if (l.bA.m((af)r1))
/*     */         {
/* 177 */           if (paramu.a(r1))
/*     */           {
/* 179 */             if (!paramArrayList.contains(r1)) {
/*     */               
/* 181 */               float f1 = f.a(l.cf + l.cp, l.cg + l.cq, r1.dH, r1.dI);
/*     */               
/* 183 */               if (r == null || f1 < f) {
/*     */                 
/* 185 */                 f = f1;
/* 186 */                 r = r1;
/*     */               } 
/*     */             } 
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 195 */     return r;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
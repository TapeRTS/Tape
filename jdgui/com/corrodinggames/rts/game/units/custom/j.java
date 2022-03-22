/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class j
/*     */ {
/* 145 */   public m a = new m();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public j(i parami) {
/* 156 */     if (parami == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 161 */     for (h h : parami.a)
/*     */     {
/* 163 */       this.a.add(h);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(i parami) {
/* 170 */     if (parami == null)
/*     */     {
/* 172 */       return false;
/*     */     }
/*     */     
/* 175 */     boolean bool = false;
/* 176 */     for (h h : parami.a) {
/*     */       
/* 178 */       if (a(h))
/*     */       {
/* 180 */         bool = true;
/*     */       }
/*     */     } 
/*     */     
/* 184 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(h paramh) {
/* 189 */     if (!this.a.contains(paramh)) {
/*     */       
/* 191 */       this.a.add(paramh);
/* 192 */       return true;
/*     */     } 
/* 194 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(i parami) {
/* 199 */     if (parami == null)
/*     */     {
/* 201 */       return false;
/*     */     }
/*     */     
/* 204 */     boolean bool = false;
/* 205 */     for (h h : parami.a) {
/*     */       
/* 207 */       if (this.a.remove(h))
/*     */       {
/* 209 */         bool = true;
/*     */       }
/*     */     } 
/*     */     
/* 213 */     return bool;
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
/*     */   public i a() {
/* 255 */     if (this.a.size() == 0)
/*     */     {
/* 257 */       return h.d;
/*     */     }
/*     */ 
/*     */     
/* 261 */     return new i((h[])this.a.toArray((Object[])h.c));
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
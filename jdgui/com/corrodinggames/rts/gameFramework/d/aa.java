/*     */ package com.corrodinggames.rts.gameFramework.d;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.gameFramework.e.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class aa
/*     */   extends ad
/*     */ {
/*     */   al a;
/*     */   int b;
/*     */   
/*     */   public strictfp aa(float paramFloat1, float paramFloat2, al paramal) {
/* 225 */     super(paramFloat1, paramFloat2);
/* 226 */     this.a = paramal;
/* 227 */     this.b = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(ad paramad) {
/* 233 */     if (super.a(paramad))
/*     */     {
/* 235 */       if (paramad instanceof aa) {
/*     */         
/* 237 */         aa aa1 = (aa)paramad;
/* 238 */         return (aa1.a == this.a);
/*     */       } 
/*     */     }
/* 241 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(ad paramad) {
/* 247 */     this.c = paramad.c;
/* 248 */     this.b++;
/* 249 */     this.f = null;
/* 250 */     this.g = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a() {
/* 256 */     if (this.f == null) {
/*     */       
/* 258 */       String str = "gui.log.unitCreated";
/* 259 */       if (this.a.j())
/*     */       {
/* 261 */         str = "gui.log.buildingConstructed";
/*     */       }
/* 263 */       this.f = String.format(a.a(str, new Object[0]), new Object[] { this.a.e(), Integer.valueOf(this.b) });
/*     */     } 
/* 265 */     return this.f;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
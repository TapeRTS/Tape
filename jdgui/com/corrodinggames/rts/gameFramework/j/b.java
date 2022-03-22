/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import javax.microedition.khronos.opengles.GL10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   d a;
/*     */   e b;
/*     */   float c;
/*     */   float d;
/*     */   Rect e;
/*     */   RectF f;
/*     */   
/*     */   void a(GL10 paramGL10) {
/*     */     o o;
/* 185 */     if (this.g.i != this.b.e.intValue()) {
/*     */       
/* 187 */       paramGL10.glBindTexture(3553, this.b.e.intValue());
/* 188 */       this.g.i = this.b.e.intValue();
/*     */     } 
/*     */ 
/*     */     
/* 192 */     paramGL10.glPushMatrix();
/* 193 */     paramGL10.glLoadIdentity();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     if (this.a == d.b) {
/*     */       
/* 201 */       paramGL10.glTranslatef(this.f.a, this.g.c - this.f.b - this.e
/*     */           
/* 203 */           .c(), 0.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 208 */       o = this.g.h;
/*     */       
/* 210 */       float f1 = this.e.a / this.b.l();
/* 211 */       float f2 = this.e.c / this.b.l();
/*     */       
/* 213 */       float f3 = this.e.b / this.b.k();
/* 214 */       float f4 = this.e.d / this.b.k();
/*     */ 
/*     */       
/* 217 */       if (this.g.j == this.e.c() && this.g.k == this.e.b())
/*     */       {
/*     */ 
/*     */         
/* 221 */         o.a(0, 0, f1, f4);
/* 222 */         o.a(1, 0, f2, f4);
/* 223 */         o.a(0, 1, f1, f3);
/* 224 */         o.a(1, 1, f2, f3);
/*     */       }
/*     */       else
/*     */       {
/* 228 */         this.g.j = this.e.c();
/* 229 */         this.g.k = this.e.b();
/*     */         
/* 231 */         o.a(0, 0, 0.0F, 0.0F, 0.0F, f1, f4, null);
/* 232 */         o.a(1, 0, this.e.b(), 0.0F, 0.0F, f2, f4, null);
/* 233 */         o.a(0, 1, 0.0F, this.e.c(), 0.0F, f1, f3, null);
/* 234 */         o.a(1, 1, this.e.b(), this.e.c(), 0.0F, f2, f3, null);
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 243 */       paramGL10.glTranslatef(this.c, this.g.c - this.d - this.b
/*     */           
/* 245 */           .k(), 0.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 251 */       throw new RuntimeException("Not supported");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 256 */     o.b(paramGL10, true, false);
/*     */     
/* 258 */     paramGL10.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
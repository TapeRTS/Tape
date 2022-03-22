/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.ar;
/*     */ import com.corrodinggames.rts.gameFramework.as;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.java.audio.Music;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class m
/*     */   extends as
/*     */ {
/*     */   l a;
/*     */   k b;
/*     */   Music c;
/*     */   boolean d = false;
/*     */   boolean e = false;
/*     */   boolean f = false;
/*     */   
/*     */   public m(k paramk) {
/* 113 */     this.b = paramk;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ar paramar) {
/* 122 */     this.a = (l)paramar;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 130 */     synchronized (this.b.f()) {
/*     */       
/* 132 */       this.d = true;
/* 133 */       this.e = paramBoolean;
/*     */       
/* 135 */       this.f = false;
/*     */       
/* 137 */       l.d("Queued:" + this.a.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       if (this.c != null) {
/*     */         
/* 146 */         l.d("startPlaying: Stopping old music");
/*     */         
/* 148 */         this.c.stop();
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 159 */       this.c = this.a.c;
/*     */     } 
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
/*     */   public void f() {
/* 176 */     if (this.f) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 181 */     synchronized (this.b.f()) {
/*     */       
/* 183 */       if (this.c != null) {
/*     */         
/* 185 */         l.d("Now playing:" + this.a.b);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 190 */         if (this.e) {
/*     */ 
/*     */           
/* 193 */           this.c.setVolume(this.c.getVolume());
/* 194 */           this.c.setLooping(true);
/* 195 */           this.c.play();
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 201 */           this.c.setVolume(this.c.getVolume());
/* 202 */           this.c.play();
/*     */         } 
/*     */ 
/*     */         
/* 206 */         this.f = true;
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 212 */         l.d("realPlay: playingMusic==null");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 220 */     synchronized (this.b.f()) {
/*     */       
/* 222 */       if (this.c != null)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 227 */         this.c.pause();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 235 */     synchronized (this.b.f()) {
/*     */       
/* 237 */       if (this.c != null)
/*     */       {
/* 239 */         if (!this.c.isPlaying())
/*     */         {
/*     */ 
/*     */           
/* 243 */           this.c.play();
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 253 */     synchronized (this.b.f()) {
/*     */       
/* 255 */       if (this.c != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 260 */         this.c.stop();
/*     */ 
/*     */         
/* 263 */         this.f = false;
/* 264 */         this.d = false;
/*     */         
/* 266 */         this.c = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/* 277 */     synchronized (this.b.f()) {
/*     */ 
/*     */ 
/*     */       
/* 281 */       if (this.c != null)
/*     */       {
/* 283 */         this.c.stop();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 293 */     synchronized (this.b.f()) {
/*     */       
/* 295 */       if (this.f && this.c != null)
/*     */       {
/* 297 */         return this.c.isPlaying();
/*     */       }
/*     */ 
/*     */       
/* 301 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 310 */     synchronized (this.b.f()) {
/*     */       
/* 312 */       if (this.c != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 317 */         if (paramFloat > 0.05F && !this.f && this.d)
/*     */         {
/* 319 */           f();
/*     */         }
/*     */ 
/*     */         
/* 323 */         this.c.setVolume(paramFloat);
/*     */       }
/*     */       else {
/*     */         
/* 327 */         l.d("setVolume: playingMusic==null");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
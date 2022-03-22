/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.am;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.newdawn.slick.AppGameContainer;
/*     */ import org.newdawn.slick.Game;
/*     */ import org.newdawn.slick.GameContainer;
/*     */ import org.newdawn.slick.Graphics;
/*     */ import org.newdawn.slick.Music;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends AppGameContainer
/*     */ {
/*     */   boolean a = false;
/*  44 */   Object b = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   c c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public b(Game paramGame, int paramInt1, int paramInt2, boolean paramBoolean) {
/*  74 */     super(paramGame, paramInt1, paramInt2, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Graphics a() {
/*  85 */     Graphics graphics = getGraphics();
/*     */ 
/*     */ 
/*     */     
/*  89 */     this.input.poll(this.width, this.height);
/*     */     
/*  91 */     Music.poll(1);
/*  92 */     if (am.a != null)
/*     */     {
/*  94 */       am.a.a(1);
/*     */     }
/*     */ 
/*     */     
/*  98 */     GL.glClear(16640);
/*     */     
/* 100 */     GL.glLoadIdentity();
/*     */     
/* 102 */     graphics.resetTransform();
/* 103 */     graphics.resetFont();
/* 104 */     graphics.resetLineWidth();
/* 105 */     graphics.setAntiAlias(false);
/*     */     
/* 107 */     return graphics;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Graphics paramGraphics) {
/* 113 */     paramGraphics.resetTransform();
/*     */     
/* 115 */     GL.flush();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     Display.update();
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
/*     */   protected void gameLoop() {
/* 139 */     int i = getDelta();
/* 140 */     if (!Display.isVisible() && this.updateOnlyOnVisible) { 
/* 141 */       try { Thread.sleep(100L); } catch (Exception exception) {}
/*     */        }
/*     */     
/*     */     else
/*     */     
/* 146 */     { updateAndRender(i); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     updateFPS();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     Display.update(false);
/*     */     
/* 167 */     if (!this.a) {
/*     */       
/* 169 */       Display.processMessages();
/*     */ 
/*     */     
/*     */     }
/* 173 */     else if (this.c == null) {
/*     */       
/* 175 */       this.c = new c(this);
/* 176 */       this.c.start();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     if (Display.isCloseRequested() && 
/* 183 */       this.game.closeRequested()) {
/* 184 */       this.running = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void updateAndRender(int paramInt) {
/* 194 */     if (this.smoothDeltas && 
/* 195 */       getFPS() != 0) {
/* 196 */       paramInt = 1000 / getFPS();
/*     */     }
/*     */ 
/*     */     
/* 200 */     this.input.poll(this.width, this.height);
/*     */     
/* 202 */     Music.poll(paramInt);
/*     */     
/* 204 */     if (am.a != null)
/*     */     {
/* 206 */       am.a.a(paramInt);
/*     */     }
/*     */     
/* 209 */     if (!this.paused) {
/* 210 */       this.storedDelta += paramInt;
/*     */       
/* 212 */       if (this.storedDelta >= this.minimumLogicInterval)
/*     */       {
/* 214 */         if (this.maximumLogicInterval != 0L) {
/* 215 */           long l = this.storedDelta / this.maximumLogicInterval; int i;
/* 216 */           for (i = 0; i < l; i++) {
/* 217 */             this.game.update((GameContainer)this, (int)this.maximumLogicInterval);
/*     */           }
/*     */           
/* 220 */           i = (int)(this.storedDelta % this.maximumLogicInterval);
/* 221 */           if (i > this.minimumLogicInterval) {
/* 222 */             this.game.update((GameContainer)this, (int)(i % this.maximumLogicInterval));
/* 223 */             this.storedDelta = 0L;
/*     */           } else {
/* 225 */             this.storedDelta = i;
/*     */           } 
/*     */         } else {
/* 228 */           this.game.update((GameContainer)this, (int)this.storedDelta);
/* 229 */           this.storedDelta = 0L;
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 238 */       this.game.update((GameContainer)this, 0);
/*     */     } 
/*     */     
/* 241 */     if (hasFocus() || getAlwaysRender()) {
/* 242 */       if (this.clearEachFrame) {
/* 243 */         GL.glClear(16640);
/*     */       }
/*     */       
/* 246 */       GL.glLoadIdentity();
/*     */       
/* 248 */       Graphics graphics = getGraphics();
/*     */       
/* 250 */       graphics.resetTransform();
/* 251 */       graphics.resetFont();
/* 252 */       graphics.resetLineWidth();
/* 253 */       graphics.setAntiAlias(false);
/*     */       
/* 255 */       this.game.render((GameContainer)this, graphics);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 260 */       graphics.resetTransform();
/*     */ 
/*     */       
/* 263 */       if (isShowingFPS())
/*     */       {
/* 265 */         getDefaultFont().drawString(10.0F, 10.0F, "FPS: " + this.recordedFPS);
/*     */       }
/*     */       
/* 268 */       GL.flush();
/*     */     } 
/*     */     
/* 271 */     if (this.targetFPS != -1) {
/* 272 */       Display.sync(this.targetFPS);
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
/*     */   public void destroy() {
/*     */     try {
/* 285 */       Display.destroy();
/*     */ 
/*     */     
/*     */     }
/* 289 */     catch (Exception exception) {
/*     */       
/* 291 */       l.a("Error on Display.destroy in destroy", exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
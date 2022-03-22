/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import android.graphics.BitmapFactory;
/*     */ import android.opengl.GLSurfaceView;
/*     */ import android.util.Log;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import javax.microedition.khronos.egl.EGLConfig;
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
/*     */ public class a
/*     */   implements GLSurfaceView.Renderer
/*     */ {
/*  28 */   private static BitmapFactory.Options q = new BitmapFactory.Options();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   GL10 b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   c[] g;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   o h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int i;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int n;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String o;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   long p;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDrawFrame(GL10 paramGL10) {
/* 279 */     if (this.e == -1) {
/*     */       
/* 281 */       Log.d("RustedWarfare", "---- render: no buffer is ready!");
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 289 */     long l = System.currentTimeMillis();
/*     */     
/* 291 */     int i = (int)(l - this.p);
/*     */     
/* 293 */     this.p = l;
/*     */ 
/*     */ 
/*     */     
/* 297 */     this.l += i;
/* 298 */     this.m++;
/* 299 */     if (this.m == 10) {
/* 300 */       this.n = 10000 / this.l;
/* 301 */       this.l = 0;
/* 302 */       this.m = 0;
/*     */       
/* 304 */       this.o = this.n + "fps";
/*     */       
/* 306 */       Log.d("RustedWarfare", "render:" + this.o + ", this renders has " + (this.g[this.e]).b + " draws");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     this.f = this.e;
/*     */ 
/*     */ 
/*     */     
/* 317 */     paramGL10.glClear(16640);
/*     */     
/* 319 */     paramGL10.glMatrixMode(5888);
/*     */     
/* 321 */     o.a(paramGL10, true, false);
/*     */ 
/*     */     
/* 324 */     c c1 = this.g[this.f];
/*     */     
/* 326 */     this.i = -1;
/* 327 */     this.j = -1;
/* 328 */     this.k = -1;
/*     */     
/* 330 */     for (byte b = 0; b < c1.b; b++) {
/*     */       
/* 332 */       b b1 = c1.a[b];
/* 333 */       b1.a(paramGL10);
/*     */     } 
/*     */     
/* 336 */     o.a(paramGL10);
/*     */ 
/*     */ 
/*     */     
/* 340 */     this.f = -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2) {
/* 350 */     Log.d("RustedWarfare", "2d gl onSurfaceChanged:" + paramInt1 + "," + paramInt2);
/*     */     
/* 352 */     this.b = paramGL10;
/*     */ 
/*     */     
/* 355 */     this.c = paramInt2;
/* 356 */     this.d = paramInt1;
/*     */     
/* 358 */     paramGL10.glViewport(0, 0, paramInt1, paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     paramGL10.glMatrixMode(5889);
/* 366 */     paramGL10.glLoadIdentity();
/* 367 */     paramGL10.glOrthof(0.0F, paramInt1, 0.0F, paramInt2, 0.0F, 1.0F);
/*     */ 
/*     */     
/* 370 */     paramGL10.glShadeModel(7424);
/* 371 */     paramGL10.glEnable(3042);
/* 372 */     paramGL10.glBlendFunc(770, 771);
/* 373 */     paramGL10.glColor4x(65536, 65536, 65536, 65536);
/* 374 */     paramGL10.glEnable(3553);
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
/*     */   public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig) {
/* 387 */     Log.d("RustedWarfare", "2d gl onSurfaceCreated");
/*     */     
/* 389 */     this.b = paramGL10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     paramGL10.glHint(3152, 4353);
/*     */     
/* 397 */     paramGL10.glClearColor(0.3F, 0.3F, 0.5F, 1.0F);
/* 398 */     paramGL10.glShadeModel(7424);
/* 399 */     paramGL10.glDisable(2929);
/* 400 */     paramGL10.glEnable(3553);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     paramGL10.glDisable(3024);
/* 408 */     paramGL10.glDisable(2896);
/*     */     
/* 410 */     paramGL10.glClear(16640);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     l l = l.u();
/*     */     
/* 417 */     if (l != null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 477 */     this.a = true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
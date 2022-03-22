/*     */ package com.corrodinggames.rts.gameFramework.j;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.CharBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import javax.microedition.khronos.opengles.GL10;
/*     */ import javax.microedition.khronos.opengles.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class o
/*     */ {
/*     */   private FloatBuffer b;
/*     */   private FloatBuffer c;
/*     */   private FloatBuffer d;
/*     */   private IntBuffer e;
/*     */   private IntBuffer f;
/*     */   private IntBuffer g;
/*     */   private CharBuffer h;
/*     */   private Buffer i;
/*     */   private Buffer j;
/*     */   private Buffer k;
/*     */   private int l;
/*     */   private int m;
/*     */   private int n;
/*     */   private int o;
/*     */   private boolean p;
/*     */   private int q;
/*     */   private int r;
/*     */   private int s;
/*     */   private int t;
/*     */   
/*     */   void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
/* 159 */     if (paramInt1 < 0 || paramInt1 >= this.m) {
/* 160 */       throw new IllegalArgumentException("i");
/*     */     }
/* 162 */     if (paramInt2 < 0 || paramInt2 >= this.n) {
/* 163 */       throw new IllegalArgumentException("j");
/*     */     }
/*     */     
/* 166 */     int i = this.m * paramInt2 + paramInt1;
/* 167 */     int j = i * 2;
/*     */     
/* 169 */     if (this.l == 5126) {
/*     */       
/* 171 */       this.c.put(j, paramFloat1);
/* 172 */       this.c.put(j + 1, paramFloat2);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 177 */       this.f.put(j, (int)(paramFloat1 * 65536.0F));
/* 178 */       this.f.put(j + 1, (int)(paramFloat2 * 65536.0F));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float[] paramArrayOffloat) {
/* 184 */     if (paramInt1 < 0 || paramInt1 >= this.m) {
/* 185 */       throw new IllegalArgumentException("i");
/*     */     }
/* 187 */     if (paramInt2 < 0 || paramInt2 >= this.n) {
/* 188 */       throw new IllegalArgumentException("j");
/*     */     }
/*     */     
/* 191 */     int i = this.m * paramInt2 + paramInt1;
/*     */     
/* 193 */     int j = i * 3;
/* 194 */     int k = i * 2;
/* 195 */     int m = i * 4;
/*     */     
/* 197 */     if (this.l == 5126) {
/* 198 */       this.b.put(j, paramFloat1);
/* 199 */       this.b.put(j + 1, paramFloat2);
/* 200 */       this.b.put(j + 2, paramFloat3);
/*     */       
/* 202 */       this.c.put(k, paramFloat4);
/* 203 */       this.c.put(k + 1, paramFloat5);
/*     */       
/* 205 */       if (paramArrayOffloat != null) {
/* 206 */         this.d.put(m, paramArrayOffloat[0]);
/* 207 */         this.d.put(m + 1, paramArrayOffloat[1]);
/* 208 */         this.d.put(m + 2, paramArrayOffloat[2]);
/* 209 */         this.d.put(m + 3, paramArrayOffloat[3]);
/*     */       } 
/*     */     } else {
/* 212 */       this.e.put(j, (int)(paramFloat1 * 65536.0F));
/* 213 */       this.e.put(j + 1, (int)(paramFloat2 * 65536.0F));
/* 214 */       this.e.put(j + 2, (int)(paramFloat3 * 65536.0F));
/*     */       
/* 216 */       this.f.put(k, (int)(paramFloat4 * 65536.0F));
/* 217 */       this.f.put(k + 1, (int)(paramFloat5 * 65536.0F));
/*     */       
/* 219 */       if (paramArrayOffloat != null) {
/* 220 */         this.g.put(m, (int)(paramArrayOffloat[0] * 65536.0F));
/* 221 */         this.g.put(m + 1, (int)(paramArrayOffloat[1] * 65536.0F));
/* 222 */         this.g.put(m + 2, (int)(paramArrayOffloat[2] * 65536.0F));
/* 223 */         this.g.put(m + 3, (int)(paramArrayOffloat[3] * 65536.0F));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(GL10 paramGL10, boolean paramBoolean1, boolean paramBoolean2) {
/* 229 */     paramGL10.glEnableClientState(32884);
/*     */     
/* 231 */     if (paramBoolean1) {
/* 232 */       paramGL10.glEnableClientState(32888);
/* 233 */       paramGL10.glEnable(3553);
/*     */     } else {
/* 235 */       paramGL10.glDisableClientState(32888);
/* 236 */       paramGL10.glDisable(3553);
/*     */     } 
/*     */     
/* 239 */     if (paramBoolean2) {
/* 240 */       paramGL10.glEnableClientState(32886);
/*     */     } else {
/* 242 */       paramGL10.glDisableClientState(32886);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(GL10 paramGL10, boolean paramBoolean1, boolean paramBoolean2) {
/* 248 */     if (!this.p) {
/* 249 */       paramGL10.glVertexPointer(3, this.l, 0, this.i);
/*     */       
/* 251 */       if (paramBoolean1) {
/* 252 */         paramGL10.glTexCoordPointer(2, this.l, 0, this.j);
/*     */       }
/*     */       
/* 255 */       if (paramBoolean2) {
/* 256 */         paramGL10.glColorPointer(4, this.l, 0, this.k);
/*     */       }
/*     */       
/* 259 */       paramGL10.glDrawElements(4, this.o, 5123, this.h);
/*     */     } else {
/*     */       
/* 262 */       GL11 gL11 = (GL11)paramGL10;
/*     */       
/* 264 */       gL11.glBindBuffer(34962, this.q);
/* 265 */       gL11.glVertexPointer(3, this.l, 0, 0);
/*     */       
/* 267 */       if (paramBoolean1) {
/* 268 */         gL11.glBindBuffer(34962, this.s);
/* 269 */         gL11.glTexCoordPointer(2, this.l, 0, 0);
/*     */       } 
/*     */       
/* 272 */       if (paramBoolean2) {
/* 273 */         gL11.glBindBuffer(34962, this.t);
/* 274 */         gL11.glColorPointer(4, this.l, 0, 0);
/*     */       } 
/*     */       
/* 277 */       gL11.glBindBuffer(34963, this.r);
/* 278 */       gL11.glDrawElements(4, this.o, 5123, 0);
/*     */ 
/*     */       
/* 281 */       gL11.glBindBuffer(34962, 0);
/* 282 */       gL11.glBindBuffer(34963, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(GL10 paramGL10) {
/* 289 */     paramGL10.glDisableClientState(32884);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\j\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
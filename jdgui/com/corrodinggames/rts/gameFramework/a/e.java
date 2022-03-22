/*     */ package com.corrodinggames.rts.gameFramework.a;
/*     */ 
/*     */ import android.content.Context;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.u;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */ {
/*  29 */   ArrayList a = new ArrayList();
/*     */ 
/*     */   
/*     */   public boolean b;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(i parami, float paramFloat) {
/*  37 */     if (this.a.contains(parami))
/*     */     {
/*  39 */       return false;
/*     */     }
/*  41 */     this.a.add(parami);
/*     */     
/*  43 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  50 */   public static h c = new a();
/*     */ 
/*     */   
/*     */   public static i d;
/*     */ 
/*     */   
/*     */   public static i e;
/*     */ 
/*     */   
/*     */   public static i f;
/*     */ 
/*     */   
/*     */   public static i g;
/*     */ 
/*     */   
/*     */   public static i h;
/*     */ 
/*     */   
/*     */   public static i i;
/*     */ 
/*     */   
/*     */   public static i j;
/*     */ 
/*     */   
/*     */   public static i k;
/*     */ 
/*     */   
/*     */   public static i l;
/*     */ 
/*     */   
/*     */   public static i m;
/*     */ 
/*     */   
/*     */   public static i n;
/*     */ 
/*     */   
/*     */   public static i o;
/*     */ 
/*     */   
/*     */   public static i p;
/*     */   
/*     */   public static i q;
/*     */   
/*     */   public static i r;
/*     */   
/*     */   public static i s;
/*     */   
/*     */   public static i t;
/*     */   
/*     */   public static i u;
/*     */   
/*     */   public static i v;
/*     */   
/*     */   public static i w;
/*     */   
/*     */   public static i x;
/*     */   
/*     */   public static i y;
/*     */   
/*     */   public static i z;
/*     */   
/*     */   public static i A;
/*     */   
/*     */   public static i B;
/*     */   
/*     */   public static i C;
/*     */   
/*     */   public static i D;
/*     */   
/*     */   public static i E;
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 123 */     l l = l.u();
/*     */     
/* 125 */     return a(l.by.masterVolume * l.by.gameVolume);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(float paramFloat) {
/* 130 */     l l = l.u();
/*     */     
/* 132 */     if (paramFloat < 0.01F)
/*     */     {
/* 134 */       return false;
/*     */     }
/*     */     
/* 137 */     if (this.b)
/*     */     {
/* 139 */       return false;
/*     */     }
/*     */     
/* 142 */     return l.by.enableSounds;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Context paramContext) {
/* 156 */     c.a(paramContext);
/*     */ 
/*     */     
/* 159 */     d = c.a(R.raw.attack);
/* 160 */     e = c.a(R.raw.move);
/* 161 */     f = c.a(R.raw.click);
/*     */     
/* 163 */     g = c.a(R.raw.click_add);
/* 164 */     h = c.a(R.raw.click_remove);
/*     */ 
/*     */     
/* 167 */     i = c.a(R.raw.warning);
/* 168 */     j = c.a(R.raw.message);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     l = c.a(R.raw.missile_fire);
/* 174 */     m = c.a(R.raw.missile_hit);
/* 175 */     n = c.a(R.raw.unit_explode);
/*     */     
/* 177 */     o = c.a(R.raw.buiding_explode);
/*     */     
/* 179 */     p = c.a(R.raw.tank_firing);
/* 180 */     q = c.a(R.raw.cannon_firing);
/*     */     
/* 182 */     r = c.a(R.raw.gun_fire);
/*     */     
/* 184 */     w = c.a(R.raw.lighting_burst);
/*     */     
/* 186 */     x = c.a(R.raw.plasma_fire);
/*     */     
/* 188 */     y = c.a(R.raw.plasma_fire2);
/*     */     
/* 190 */     s = c.a(R.raw.firing3);
/* 191 */     t = c.a(R.raw.firing4);
/*     */ 
/*     */     
/* 194 */     u = c.a(R.raw.large_gun_fire1);
/* 195 */     v = c.a(R.raw.large_gun_fire2);
/*     */ 
/*     */     
/* 198 */     z = c.a(R.raw.bug_die);
/* 199 */     A = c.a(R.raw.bug_attack);
/*     */     
/* 201 */     k = c.a(R.raw.interface_error);
/*     */     
/* 203 */     B = c.a(R.raw.nuke_explode);
/*     */ 
/*     */     
/* 206 */     C = c.a(R.raw.nuke_launch);
/*     */ 
/*     */ 
/*     */     
/* 210 */     D = c.a(R.raw.laser_deflect);
/*     */     
/* 212 */     E = c.a(R.raw.laser_deflect2);
/*     */     
/* 214 */     c.a();
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
/*     */   public i a(String paramString) {
/* 226 */     i i1 = (i)c.g.get(paramString);
/*     */     
/* 228 */     if (i1 == null)
/*     */     {
/* 230 */       throw new RuntimeException("Could not find sound:" + paramString);
/*     */     }
/*     */     
/* 233 */     return i1;
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
/*     */   public void b(i parami, float paramFloat) {
/* 245 */     l l = l.u();
/* 246 */     paramFloat *= l.by.masterVolume * l.by.interfaceVolume;
/*     */     
/* 248 */     if (!a(paramFloat))
/*     */       return; 
/* 250 */     if (paramFloat < 0.01D) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 255 */     if (!a(parami, paramFloat)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 260 */     parami.a(paramFloat, paramFloat, 1, 0, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(i parami, float paramFloat) {
/* 265 */     l l = l.u();
/* 266 */     paramFloat *= l.by.masterVolume * l.by.gameVolume;
/*     */     
/* 268 */     if (!a(paramFloat))
/*     */       return; 
/* 270 */     if (!a(parami, paramFloat)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 275 */     parami.a(paramFloat, paramFloat, 1, 0, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(i parami, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 280 */     a(parami, paramFloat1, 1.0F, paramFloat2, paramFloat3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(i parami, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 285 */     if (!a()) {
/*     */       return;
/*     */     }
/* 288 */     l l = l.u();
/*     */ 
/*     */     
/* 291 */     if (l.al)
/*     */     {
/* 293 */       paramFloat1 /= 20.0F;
/*     */     }
/*     */     
/* 296 */     if (l.bJ.h())
/*     */     {
/* 298 */       if (l.bc > 1.5D)
/*     */       {
/* 300 */         paramFloat1 /= l.bc;
/*     */       }
/*     */     }
/*     */     
/* 304 */     int j = (int)(l.cd + l.cp);
/* 305 */     int k = (int)(l.ce + l.cq);
/*     */     
/* 307 */     float f1 = f.a(j, k, paramFloat3, paramFloat4);
/*     */     
/* 309 */     float f2 = l.cp * 1.72F;
/*     */ 
/*     */     
/* 312 */     if (l.cE < 0.5D) {
/*     */ 
/*     */       
/* 315 */       paramFloat1 *= 4.0F;
/*     */ 
/*     */       
/* 318 */       paramFloat1 *= l.cE * l.cE;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 326 */     if (paramFloat1 <= 1.0F)
/*     */     {
/* 328 */       if (!parami.e)
/*     */       {
/* 330 */         if (f1 > f2 * f2) {
/*     */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 337 */     float f3 = (float)Math.sqrt(f1);
/*     */     
/* 339 */     float f4 = 1.0F;
/*     */     
/* 341 */     if (f3 > l.cp)
/*     */     {
/* 343 */       f4 = 1.0F - (f3 - l.cp) / l.cp;
/*     */     }
/*     */     
/* 346 */     float f5 = f4 * paramFloat1;
/*     */     
/* 348 */     if (f5 <= 0.05D)
/*     */     {
/* 350 */       if (!parami.e) {
/*     */         return;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 356 */     if (f5 > 1.0F)
/*     */     {
/* 358 */       f5 = 1.0F;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 363 */     f5 *= l.by.masterVolume * l.by.gameVolume;
/*     */ 
/*     */     
/* 366 */     if (!a(parami, f5)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 371 */     parami.a(f5, f5, 1, 0, paramFloat2);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public i a(String paramString, j paramj, boolean paramBoolean) {
/*     */     try {
/* 418 */       return c.a(paramString, paramj, paramBoolean);
/*     */     }
/* 420 */     catch (OutOfMemoryError outOfMemoryError) {
/*     */       
/* 422 */       l.a(u.f, outOfMemoryError);
/* 423 */       return f.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float paramFloat) {
/* 432 */     this.a.clear();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\a\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
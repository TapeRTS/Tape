/*     */ package com.corrodinggames.rts.game.b;
/*     */ 
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.RectF;
/*     */ import android.util.Log;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.k;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.h.d;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.j.l;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.util.Properties;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class g
/*     */ {
/*     */   public j a;
/*     */   public int b;
/*  33 */   public int c = -2;
/*     */ 
/*     */   
/*  36 */   public short d = -1;
/*     */ 
/*     */   
/*     */   public boolean e;
/*     */ 
/*     */   
/*     */   public boolean f;
/*     */ 
/*     */   
/*     */   public boolean g;
/*     */ 
/*     */   
/*     */   public boolean h;
/*     */ 
/*     */   
/*     */   public boolean i;
/*     */ 
/*     */   
/*     */   public byte j;
/*     */   
/*     */   public boolean k;
/*     */   
/*     */   public boolean l;
/*     */   
/*     */   public g[] m;
/*     */ 
/*     */   
/*     */   public strictfp g a() {
/*  64 */     g g1 = new g();
/*     */ 
/*     */ 
/*     */     
/*  68 */     g1.a = this.a;
/*     */     
/*  70 */     g1.b = this.b;
/*     */     
/*  72 */     g1.e = this.e;
/*  73 */     g1.f = this.f;
/*  74 */     g1.g = this.g;
/*     */     
/*  76 */     g1.h = this.h;
/*  77 */     g1.i = this.i;
/*     */     
/*  79 */     g1.j = this.j;
/*  80 */     g1.k = this.k;
/*     */     
/*  82 */     g1.l = this.l;
/*     */     
/*  84 */     return g1;
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
/*     */   public static strictfp void a(String paramString) {
/* 120 */     l.b(paramString);
/* 121 */     l.u().a("Missing unit data while loading map: " + paramString, 1);
/*     */     
/*     */     try {
/* 124 */       Thread.sleep(2L);
/*     */     }
/* 126 */     catch (InterruptedException interruptedException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static strictfp g a(b paramb, e parame, j paramj, int paramInt, short paramShort1, short paramShort2, boolean paramBoolean) {
/* 137 */     Properties properties = paramj.a(paramj.k + paramInt);
/* 138 */     if (properties != null) {
/*     */       
/* 140 */       String str1 = properties.getProperty("showFog");
/* 141 */       if (str1 != null) {
/*     */         
/* 143 */         int k = Integer.parseInt(str1);
/* 144 */         l l = l.u();
/* 145 */         paramb.a(paramShort1, paramShort2);
/* 146 */         float f1 = (paramb.M + paramb.m);
/* 147 */         float f2 = (paramb.N + paramb.n);
/* 148 */         l.bt.a(f1, f2, k, l.bb, false);
/* 149 */         return null;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 155 */       String str2 = properties.getProperty("unit");
/* 156 */       String str3 = properties.getProperty("customUnit");
/*     */       
/* 158 */       if (str2 != null || str3 != null) {
/*     */         d d;
/*     */ 
/*     */ 
/*     */         
/* 163 */         String str = properties.getProperty("team");
/* 164 */         m m = null;
/* 165 */         if ("none".equalsIgnoreCase(str)) {
/*     */           
/* 167 */           m = m.n(-1);
/*     */         } else {
/* 169 */           if (str == null) {
/*     */             
/* 171 */             l.b("map", "warning: unit has no team property:" + str2 + " at: " + paramShort1 + "," + paramShort2);
/* 172 */             return null;
/*     */           } 
/*     */ 
/*     */           
/* 176 */           m = m.n(Integer.valueOf(str).intValue());
/* 177 */           if (m == null) {
/*     */             
/* 179 */             l.b("map", "skipping unit without player:" + str2 + " at: " + paramShort1 + "," + paramShort2);
/* 180 */             return null;
/*     */           } 
/*     */           
/* 183 */           if (m.b()) {
/*     */             
/* 185 */             l.b("map", "Unit team is marked as spectator:" + str2 + " (skipping unit)");
/* 186 */             return null;
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 192 */         k k = null;
/* 193 */         if (str3 != null) {
/*     */ 
/*     */           
/* 196 */           l l = l.l(str3);
/* 197 */           if (l == null) {
/*     */             
/* 199 */             String str4 = "Could not find custom unit of:" + str3 + " at x:" + paramShort1 + ", y:" + paramShort2;
/*     */ 
/*     */ 
/*     */             
/* 203 */             a(str4);
/*     */             
/* 205 */             throw new f(str4);
/*     */           } 
/*     */           
/* 208 */           al al = l.c((al)l);
/* 209 */           if (al != null)
/*     */           {
/* 211 */             if (al instanceof l) {
/*     */               
/* 213 */               l = (l)al;
/*     */             }
/*     */             else {
/*     */               
/* 217 */               l.b("replacement not a custom unit:" + al.i());
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/* 222 */           k = l.a(false, l);
/* 223 */           if (k == null) {
/*     */             
/* 225 */             String str4 = "Metadata unit is null for:" + str3;
/*     */             
/* 227 */             a(str4);
/*     */             
/* 229 */             throw new f(str4);
/*     */           } 
/*     */         } else {
/*     */           af af;
/*     */ 
/*     */           
/* 235 */           al al = ak.a(str2);
/* 236 */           if (al != null)
/*     */           {
/* 238 */             af = al.a();
/*     */           }
/* 240 */           if (af == null)
/*     */           {
/* 242 */             if ("scoutShip".equalsIgnoreCase(str2))
/*     */             {
/* 244 */               d = new d(false);
/*     */             }
/*     */           }
/* 247 */           if (d == null) {
/*     */             
/* 249 */             String str4 = "Could not find unit:" + str2 + " at: " + paramShort1 + "," + paramShort2;
/*     */             
/* 251 */             a(str4);
/*     */             
/* 253 */             throw new f(str4);
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 259 */         paramb.a(paramShort1, paramShort2);
/*     */ 
/*     */ 
/*     */         
/* 263 */         ((af)d).dH = paramb.M + d.cH();
/* 264 */         ((af)d).dI = paramb.N + d.cI();
/*     */         
/* 266 */         if (m != null) {
/*     */           
/* 268 */           d.a(m);
/*     */         }
/*     */         else {
/*     */           
/* 272 */           throw new f("team has not been set for:" + str2);
/*     */         } 
/*     */         
/* 275 */         if (properties.getProperty("type") != null)
/*     */         {
/* 277 */           d.a_(properties.getProperty("type"));
/*     */         }
/*     */         
/* 280 */         if (properties.getProperty("randomRotate") != null)
/*     */         {
/* 282 */           ((af)d).bL = f.a((af)d, -180, 180);
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 288 */         ((af)d).bt = ("builder".equalsIgnoreCase(str2) || "builder".equalsIgnoreCase(str3));
/* 289 */         ((af)d).bu = ("commandCenter".equalsIgnoreCase(str2) || "commandCenter".equalsIgnoreCase(str3));
/*     */ 
/*     */         
/* 292 */         ((af)d).br = true;
/* 293 */         d.n();
/*     */         
/* 295 */         m.c((af)d);
/*     */ 
/*     */         
/* 298 */         w.dq();
/*     */         
/* 300 */         return null;
/*     */       } 
/*     */       
/* 303 */       if (parame != null && parame.l.equals("units")) {
/*     */         
/* 305 */         Log.d("RustedWarfare", "non unit on units layer at:" + paramShort1 + "," + paramShort2);
/* 306 */         return null;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     g g1 = new g();
/*     */ 
/*     */     
/* 317 */     g1.a = paramj;
/*     */     
/* 319 */     paramj.o = true;
/*     */     
/* 321 */     if (parame != null && !parame.r)
/*     */     {
/* 323 */       paramj.q = true;
/*     */     }
/*     */     
/* 326 */     if (paramBoolean)
/*     */     {
/* 328 */       paramj.p = true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 333 */     g1.b = paramInt;
/*     */ 
/*     */ 
/*     */     
/* 337 */     if (properties != null) {
/*     */ 
/*     */ 
/*     */       
/* 341 */       if (properties.getProperty("water") != null)
/*     */       {
/* 343 */         g1.e = true;
/*     */       }
/*     */       
/* 346 */       if (properties.getProperty("water-bridge") != null)
/*     */       {
/* 348 */         g1.f = true;
/*     */       }
/*     */       
/* 351 */       if (properties.getProperty("lava") != null || properties.getProperty("lava-cliff") != null) {
/*     */         
/* 353 */         g1.g = true;
/*     */         
/* 355 */         if (properties.getProperty("lava-cliff") != null)
/*     */         {
/* 357 */           g1.h = true;
/*     */         }
/*     */       } 
/*     */       
/* 361 */       if (properties.getProperty("cliff-soft") != null)
/*     */       {
/* 363 */         g1.h = true;
/*     */       }
/*     */       
/* 366 */       if (properties.getProperty("cliff") != null)
/*     */       {
/* 368 */         g1.h = true;
/*     */       }
/*     */ 
/*     */       
/* 372 */       if (properties.getProperty("large-cliff") != null)
/*     */       {
/* 374 */         g1.k = true;
/*     */       }
/*     */ 
/*     */       
/* 378 */       if (properties.getProperty("trees") != null)
/*     */       {
/* 380 */         g1.k = true;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 386 */       if (properties.getProperty("res_pool") != null)
/*     */       {
/* 388 */         g1.i = true;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 396 */       if (properties.getProperty("tree") != null);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 401 */       if (properties.getProperty("small-rock") != null)
/*     */       {
/* 403 */         g1.j = 40;
/*     */       }
/*     */       
/* 406 */       if (properties.getProperty("large-rock") != null)
/*     */       {
/* 408 */         g1.j = -1;
/*     */       }
/*     */       
/* 411 */       if (properties.getProperty("block-land") != null)
/*     */       {
/* 413 */         g1.j = -1;
/*     */       }
/*     */       
/* 416 */       if (properties.getProperty("block-buildings") != null)
/*     */       {
/* 418 */         g1.l = true;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     int i = 0;
/*     */     
/* 473 */     if (g1.a != null) {
/*     */       
/* 475 */       String str = g1.a.b;
/* 476 */       if (str != null) {
/*     */         
/* 478 */         if (g1.b == 0 && str.equals("shallowwater.png"))
/*     */         {
/* 480 */           i = 5;
/*     */         }
/*     */         
/* 483 */         if (g1.b == 0 && str.equals("deepwater.png"))
/*     */         {
/* 485 */           i = 2;
/*     */         }
/*     */         
/* 488 */         if (g1.b == 0 && str.equals("water.png"))
/*     */         {
/* 490 */           i = 2;
/*     */         }
/*     */         
/* 493 */         if (g1.b == 0 && str.equals("longgrass.png"))
/*     */         {
/* 495 */           i = 3;
/*     */         }
/*     */         
/* 498 */         if (g1.b == 0 && str.equals("mountain.png"))
/*     */         {
/* 500 */           i = 3;
/*     */         }
/*     */         
/* 503 */         if (g1.b != 0 || str.equals("lava.png"));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 515 */         if (g1.b == 0 && str.equals("snow.png"))
/*     */         {
/* 517 */           i = 2;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 522 */     if (properties != null && properties.getProperty("randomTileBy") != null) {
/*     */       
/*     */       try {
/*     */         
/* 526 */         i = Integer.parseInt(properties.getProperty("randomTileBy"));
/*     */       }
/* 528 */       catch (NumberFormatException numberFormatException) {
/*     */         
/* 530 */         throw new f("(x:" + paramShort1 + "y:" + paramShort2 + ") - randomTileBy: Unexpected integer value:'" + properties.getProperty("randomTileBy") + "'");
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 539 */     if (i > 0) {
/*     */       
/* 541 */       g[] arrayOfG = new g[i];
/*     */       
/* 543 */       for (byte b1 = 0; b1 < i; b1++) {
/*     */         
/* 545 */         arrayOfG[b1] = g1.a();
/* 546 */         (arrayOfG[b1]).b += b1 + 1;
/*     */       } 
/*     */       
/* 549 */       g1.m = arrayOfG;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 554 */     return g1;
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
/* 567 */   static final Rect n = new Rect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(l paraml, RectF paramRectF, float paramFloat, Paint paramPaint) {
/* 574 */     j j1 = this.a;
/* 575 */     Rect rect = j1.b(this.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 590 */     paraml.a(j1.a, rect, paramRectF, paramPaint);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\game\b\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
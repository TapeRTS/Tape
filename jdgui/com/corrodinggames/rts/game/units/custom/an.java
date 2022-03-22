/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.f;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class an
/*     */ {
/*     */   m a;
/*     */   
/*     */   public static an a(l paraml, ab paramab, String paramString1, String paramString2, an paraman) {
/* 106 */     String str = paramab.b(paramString1, paramString2, null);
/* 107 */     if (str == null)
/*     */     {
/* 109 */       return paraman;
/*     */     }
/* 111 */     return a(paraml, str, paramString1, paramString2, false);
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
/*     */   public static an a(l paraml, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/* 124 */     if (paraml == null)
/*     */     {
/* 126 */       throw new RuntimeException("meta==null");
/*     */     }
/* 128 */     return b(paraml, paramString1, paramString2, paramString3, paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public static an b(l paraml, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/* 133 */     an an1 = new an();
/*     */ 
/*     */     
/* 136 */     if (paramString1 == null || "".equals(paramString1) || "NONE".equalsIgnoreCase(paramString1))
/*     */     {
/* 138 */       return an1;
/*     */     }
/*     */     
/* 141 */     if (paraml == null)
/*     */     {
/* 143 */       throw new at("meta required");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 148 */     ArrayList arrayList = f.a(paramString1, ",", false);
/*     */     
/* 150 */     for (String str : arrayList) {
/*     */       
/* 152 */       str = str.trim();
/* 153 */       if (!"".equals(str)) {
/*     */         
/* 155 */         String str1 = str;
/* 156 */         String str2 = null;
/*     */         
/* 158 */         if (str.contains("(") && str.contains(")")) {
/*     */           
/* 160 */           String[] arrayOfString1 = str.split("\\(");
/*     */           
/* 162 */           if (arrayOfString1.length != 2)
/*     */           {
/* 164 */             throw new at("[" + paramString2 + "]" + paramString3 + " UnitList: Unexpected format for '" + str1 + "' of " + paramString1);
/*     */           }
/* 166 */           str = arrayOfString1[0];
/*     */           
/* 168 */           str2 = arrayOfString1[1].trim();
/*     */         } 
/*     */         
/* 171 */         String[] arrayOfString = str.split("\\*");
/*     */         
/* 173 */         str = arrayOfString[0];
/* 174 */         int i = 1;
/*     */         
/* 176 */         if (arrayOfString.length >= 2)
/*     */         {
/* 178 */           i = Integer.parseInt(arrayOfString[1]);
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 197 */         v v = paraml.b(str, paramString3, paramString2);
/*     */ 
/*     */         
/* 200 */         ap ap = new ap(v);
/*     */         
/* 202 */         if (an1.a == null)
/*     */         {
/* 204 */           an1.a = new m();
/*     */         }
/*     */         
/* 207 */         ap.b = i;
/*     */ 
/*     */         
/* 210 */         if (str2 != null) {
/*     */           
/* 212 */           if (str2.endsWith(")")) {
/*     */             
/* 214 */             str2 = str2.substring(0, str2.length() - 1);
/*     */           }
/*     */           else {
/*     */             
/* 218 */             throw new at("[" + paramString2 + "]" + paramString3 + " UnitList: Expected ')' in '" + str1 + "' of " + paramString1);
/*     */           } 
/*     */           
/* 221 */           String[] arrayOfString1 = str2.split("\\,");
/*     */ 
/*     */ 
/*     */           
/* 225 */           for (String str3 : arrayOfString1) {
/*     */             
/* 227 */             if (!str3.trim().equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 232 */               String[] arrayOfString2 = str3.split("\\=");
/* 233 */               if (arrayOfString2.length != 2)
/*     */               {
/* 235 */                 throw new RuntimeException("[" + paramString2 + "]" + paramString3 + " UnitList: Unexpected key format for '" + str1 + "' of " + paramString1);
/*     */               }
/* 237 */               String str4 = arrayOfString2[0].trim();
/* 238 */               String str5 = arrayOfString2[1].trim();
/*     */               
/* 240 */               if (str4.equalsIgnoreCase("spawnChance")) {
/*     */                 
/* 242 */                 ap.c = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 244 */               else if (str4.equalsIgnoreCase("maxSpawnLimit")) {
/*     */                 
/* 246 */                 ap.d = ab.i(paramString2, paramString3, str5);
/*     */               }
/* 248 */               else if (str4.equalsIgnoreCase("recursionLimit")) {
/*     */                 
/* 250 */                 ap.n = ab.i(paramString2, paramString3, str5);
/*     */               }
/* 252 */               else if (str4.equalsIgnoreCase("offsetX") || str4.equalsIgnoreCase("xOffsetAbsolute")) {
/*     */                 
/* 254 */                 ap.e = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 256 */               else if (str4.equalsIgnoreCase("offsetY") || str4.equalsIgnoreCase("yOffsetAbsolute")) {
/*     */                 
/* 258 */                 ap.f = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 260 */               else if (str4.equalsIgnoreCase("xOffsetRelative")) {
/*     */                 
/* 262 */                 ap.i = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 264 */               else if (str4.equalsIgnoreCase("yOffsetRelative")) {
/*     */                 
/* 266 */                 ap.j = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 268 */               else if (str4.equalsIgnoreCase("offsetRandomXY")) {
/*     */                 
/* 270 */                 float f = ab.h(paramString2, paramString3, str5);
/* 271 */                 ap.k = f;
/* 272 */                 ap.l = f;
/*     */               }
/* 274 */               else if (str4.equalsIgnoreCase("offsetRandomX")) {
/*     */                 
/* 276 */                 ap.k = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 278 */               else if (str4.equalsIgnoreCase("offsetRandomY")) {
/*     */                 
/* 280 */                 ap.l = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 282 */               else if (str4.equalsIgnoreCase("offsetHeight")) {
/*     */                 
/* 284 */                 ap.g = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 286 */               else if (str4.equalsIgnoreCase("offsetRandomDir")) {
/*     */                 
/* 288 */                 ap.m = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 290 */               else if (str4.equalsIgnoreCase("offsetDir")) {
/*     */                 
/* 292 */                 ap.h = ab.h(paramString2, paramString3, str5);
/*     */               }
/*     */               else {
/*     */                 
/* 296 */                 throw new at("[" + paramString2 + "]" + paramString3 + " ProjectileList: Unknown parameter '" + str4 + "' for '" + str1 + "' of " + paramString1);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 304 */         an1.a.add(ap);
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
/* 321 */     if (paramBoolean) {
/*     */       
/* 323 */       int i = an1.a();
/* 324 */       if (i > 1)
/*     */       {
/* 326 */         throw new at("[" + paramString2 + "]" + paramString3 + " Too many units: " + i + ", only single unit is allowed here");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 332 */     return an1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 338 */     if (this.a == null || this.a.size() == 0)
/*     */     {
/* 340 */       return 0;
/*     */     }
/* 342 */     int i = 0;
/* 343 */     for (ap ap : this.a)
/*     */     {
/* 345 */       i += ap.b;
/*     */     }
/* 347 */     return i;
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
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, af paramaf1, m paramm, boolean paramBoolean, int paramInt, f paramf, af paramaf2) {
/* 373 */     if (this.a == null || this.a.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 379 */     byte b1 = 0;
/* 380 */     byte b2 = 0;
/*     */ 
/*     */     
/* 383 */     if (paramaf1 == null) {
/*     */       
/* 385 */       l.d("projectile spawn At: Skipping, source unit required");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 390 */     for (ap ap : this.a) {
/*     */ 
/*     */       
/* 393 */       am am = ap.a.f();
/* 394 */       if (am == null) {
/*     */         
/* 396 */         l.d("projectile spawn At: Skipping, projectileType==null");
/*     */         
/*     */         continue;
/*     */       } 
/* 400 */       for (byte b = 0; b < ap.b; b++) {
/*     */ 
/*     */         
/* 403 */         b2++;
/*     */ 
/*     */ 
/*     */         
/* 407 */         if (ap.c < 1.0F) {
/*     */ 
/*     */ 
/*     */           
/* 411 */           float f1 = f.a(paramaf1, 0.0F, 1.0F, b2);
/*     */           
/* 413 */           if (f1 > ap.c) {
/*     */             continue;
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 420 */         if (b1 < ap.d)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/* 425 */           if (paramInt <= ap.n) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 432 */             float f1 = paramFloat1 + ap.e;
/* 433 */             float f2 = paramFloat2 + ap.f;
/* 434 */             float f3 = paramFloat3 + ap.g;
/* 435 */             float f4 = paramFloat4 + ap.h;
/*     */             
/* 437 */             if (ap.m != 0.0F)
/*     */             {
/* 439 */               f4 += f.a(paramaf1, -ap.m, ap.m, b2 * 4 + 3);
/*     */             }
/*     */             
/* 442 */             if (ap.k != 0.0F)
/*     */             {
/* 444 */               f1 += f.a(paramaf1, -ap.k, ap.k, b2 * 2 + 1);
/*     */             }
/* 446 */             if (ap.l != 0.0F)
/*     */             {
/* 448 */               f2 += f.a(paramaf1, -ap.l, ap.l, b2 * 3 + 2);
/*     */             }
/*     */ 
/*     */             
/* 452 */             if (ap.i != 0.0F || ap.j != 0.0F) {
/*     */               
/* 454 */               float f6 = f.i(paramFloat4);
/* 455 */               float f7 = f.h(paramFloat4);
/*     */               
/* 457 */               float f8 = ap.i;
/* 458 */               float f9 = ap.j;
/*     */               
/* 460 */               f1 += f6 * f9 - f7 * f8;
/* 461 */               f2 += f7 * f9 + f6 * f8;
/*     */             } 
/*     */ 
/*     */             
/* 465 */             byte b3 = -1;
/*     */ 
/*     */             
/* 468 */             f f5 = k.a(paramaf1, b3, am, f1, f2, f3, f4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 477 */             f5.aD = paramInt;
/*     */             
/* 479 */             if (paramf != null && paramaf1 != null)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 490 */               am.a(paramaf1, f5, paramf.l, paramf.n, paramf.o, -1.0F);
/*     */             }
/*     */ 
/*     */             
/* 494 */             a(f5, ap, paramaf1, paramf, paramaf2);
/*     */ 
/*     */             
/* 497 */             b1++;
/*     */             
/* 499 */             if (paramm != null)
/*     */             {
/* 501 */               paramm.add(f5);
/*     */             }
/*     */           } 
/*     */         }
/*     */         continue;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(f paramf1, ap paramap, af paramaf1, f paramf2, af paramaf2) {
/* 514 */     l l = l.u();
/*     */ 
/*     */     
/* 517 */     b.a = paramf1;
/* 518 */     b.b = paramap;
/* 519 */     b.c = paramaf1;
/* 520 */     b.d = paramf2;
/* 521 */     b.e = paramaf2;
/*     */     
/* 523 */     float f1 = paramf1.dH;
/* 524 */     float f2 = paramf1.dI;
/* 525 */     float f3 = 100.0F;
/*     */     
/* 527 */     l.bK.a(f1, f2, f3, null, 0.0F, b);
/*     */   }
/*     */ 
/*     */   
/* 531 */   public static final ao b = new ao();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
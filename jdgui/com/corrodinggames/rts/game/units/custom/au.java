/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.g.k;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.utility.y;
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
/*     */ public class au
/*     */ {
/*     */   m a;
/*     */   
/*     */   public static au a(String paramString1, String paramString2, String paramString3) {
/*  88 */     return b(null, paramString1, paramString2, paramString3, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static au a(l paraml, ab paramab, String paramString1, String paramString2) {
/*  93 */     String str = paramab.b(paramString1, paramString2, null);
/*  94 */     return a(paraml, str, paramString1, paramString2, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static au b(l paraml, ab paramab, String paramString1, String paramString2) {
/*  99 */     String str = paramab.b(paramString1, paramString2, null);
/* 100 */     return a(paraml, str, paramString1, paramString2, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static au a(l paraml, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/* 105 */     if (paraml == null)
/*     */     {
/* 107 */       throw new RuntimeException("meta==null");
/*     */     }
/* 109 */     return b(paraml, paramString1, paramString2, paramString3, paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public static au b(l paraml, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/* 114 */     au au1 = new au();
/*     */ 
/*     */     
/* 117 */     if (paramString1 == null || "".equals(paramString1) || "NONE".equalsIgnoreCase(paramString1))
/*     */     {
/* 119 */       return au1;
/*     */     }
/*     */ 
/*     */     
/* 123 */     ArrayList arrayList = f.a(paramString1, ",", false);
/*     */     
/* 125 */     for (String str : arrayList) {
/*     */       
/* 127 */       str = str.trim();
/* 128 */       if (!"".equals(str)) {
/*     */         
/* 130 */         String str1 = str;
/* 131 */         String str2 = null;
/*     */         
/* 133 */         if (str.contains("(") && str.contains(")")) {
/*     */           
/* 135 */           String[] arrayOfString1 = str.split("\\(");
/*     */           
/* 137 */           if (arrayOfString1.length != 2)
/*     */           {
/* 139 */             throw new at("[" + paramString2 + "]" + paramString3 + " UnitList: Unexpected format for '" + str1 + "' of " + paramString1);
/*     */           }
/* 141 */           str = arrayOfString1[0];
/*     */           
/* 143 */           str2 = arrayOfString1[1].trim();
/*     */         } 
/*     */         
/* 146 */         String[] arrayOfString = str.split("\\*");
/*     */         
/* 148 */         str = arrayOfString[0];
/* 149 */         int i = 1;
/*     */         
/* 151 */         if (arrayOfString.length >= 2)
/*     */         {
/* 153 */           i = Integer.parseInt(arrayOfString[1]);
/*     */         }
/*     */         
/* 156 */         t t = new t();
/* 157 */         t.a = paramString3;
/* 158 */         t.b = paramString2;
/* 159 */         t.c = str;
/*     */         
/* 161 */         if (paraml != null) {
/*     */           
/* 163 */           paraml.o.add(t);
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 168 */           t.a();
/*     */         } 
/*     */         
/* 171 */         av av = new av(t);
/*     */         
/* 173 */         if (au1.a == null)
/*     */         {
/* 175 */           au1.a = new m();
/*     */         }
/*     */         
/* 178 */         av.b = i;
/*     */ 
/*     */         
/* 181 */         if (str2 != null) {
/*     */           
/* 183 */           if (str2.endsWith(")")) {
/*     */             
/* 185 */             str2 = str2.substring(0, str2.length() - 1);
/*     */           }
/*     */           else {
/*     */             
/* 189 */             throw new at("[" + paramString2 + "]" + paramString3 + " UnitList: Expected ')' in '" + str1 + "' of " + paramString1);
/*     */           } 
/*     */           
/* 192 */           String[] arrayOfString1 = str2.split("\\,");
/*     */ 
/*     */ 
/*     */           
/* 196 */           for (String str3 : arrayOfString1) {
/*     */             
/* 198 */             if (!str3.trim().equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 203 */               String[] arrayOfString2 = str3.split("\\=");
/* 204 */               if (arrayOfString2.length != 2)
/*     */               {
/* 206 */                 throw new RuntimeException("[" + paramString2 + "]" + paramString3 + " UnitList: Unexpected key format for '" + str1 + "' of " + paramString1);
/*     */               }
/* 208 */               String str4 = arrayOfString2[0].trim();
/* 209 */               String str5 = arrayOfString2[1].trim();
/*     */               
/* 211 */               if (str4.equalsIgnoreCase("neutralTeam")) {
/*     */                 
/* 213 */                 av.c = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 215 */               else if (str4.equalsIgnoreCase("setToTeamOfLastAttacker")) {
/*     */                 
/* 217 */                 av.d = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 219 */               else if (str4.equalsIgnoreCase("spawnChance")) {
/*     */                 
/* 221 */                 av.e = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 223 */               else if (str4.equalsIgnoreCase("maxSpawnLimit")) {
/*     */                 
/* 225 */                 av.f = ab.i(paramString2, paramString3, str5);
/*     */               }
/* 227 */               else if (str4.equalsIgnoreCase("techLevel")) {
/*     */                 
/* 229 */                 av.j = ab.i(paramString2, paramString3, str5);
/*     */               }
/* 231 */               else if (str4.equalsIgnoreCase("gridAlign")) {
/*     */                 
/* 233 */                 av.g = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 235 */               else if (str4.equalsIgnoreCase("skipIfOverlapping")) {
/*     */                 
/* 237 */                 av.h = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 239 */               else if (str4.equalsIgnoreCase("falling")) {
/*     */                 
/* 241 */                 av.i = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 243 */               else if (str4.equalsIgnoreCase("transportedUnitsToTransfer")) {
/*     */                 
/* 245 */                 av.t = (short)ab.i(paramString2, paramString3, str5);
/*     */               }
/* 247 */               else if (str4.equalsIgnoreCase("alwayStartDirAtZero")) {
/*     */                 
/* 249 */                 av.k = ab.g(paramString2, paramString3, str5);
/*     */               }
/* 251 */               else if (str4.equalsIgnoreCase("offsetX")) {
/*     */                 
/* 253 */                 av.l = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 255 */               else if (str4.equalsIgnoreCase("offsetY")) {
/*     */                 
/* 257 */                 av.m = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 259 */               else if (str4.equalsIgnoreCase("offsetRandomXY")) {
/*     */                 
/* 261 */                 float f = ab.h(paramString2, paramString3, str5);
/* 262 */                 av.p = f;
/* 263 */                 av.q = f;
/*     */               }
/* 265 */               else if (str4.equalsIgnoreCase("offsetRandomX")) {
/*     */                 
/* 267 */                 av.p = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 269 */               else if (str4.equalsIgnoreCase("offsetRandomY")) {
/*     */                 
/* 271 */                 av.q = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 273 */               else if (str4.equalsIgnoreCase("offsetHeight")) {
/*     */                 
/* 275 */                 av.n = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 277 */               else if (str4.equalsIgnoreCase("offsetRandomDir")) {
/*     */                 
/* 279 */                 av.r = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 281 */               else if (str4.equalsIgnoreCase("offsetDir")) {
/*     */                 
/* 283 */                 av.o = ab.h(paramString2, paramString3, str5);
/*     */               }
/* 285 */               else if (str4.equalsIgnoreCase("addResources")) {
/*     */                 
/* 287 */                 if (paraml == null)
/*     */                 {
/* 289 */                   throw new at("[" + paramString2 + "]" + paramString3 + " addResources not supported from here");
/*     */                 }
/*     */ 
/*     */                 
/*     */                 try {
/* 294 */                   av.s = g.a(paraml, str5);
/*     */                 }
/* 296 */                 catch (at at) {
/*     */                   
/* 298 */                   at.printStackTrace();
/* 299 */                   throw new at("[" + paramString2 + "]" + paramString3 + " addResources:" + at.getMessage());
/*     */                 }
/*     */               
/*     */               } else {
/*     */                 
/* 304 */                 throw new at("[" + paramString2 + "]" + paramString3 + " UnitList: Unknown parameter '" + str4 + "' for '" + str1 + "' of " + paramString1);
/*     */               } 
/*     */             } 
/*     */           } 
/* 308 */           if (av.d && av.c)
/*     */           {
/* 310 */             throw new at("[" + paramString2 + "]" + paramString3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + paramString1);
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 317 */         au1.a.add(av);
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
/* 334 */     if (paramBoolean) {
/*     */       
/* 336 */       int i = au1.a();
/* 337 */       if (i > 1)
/*     */       {
/* 339 */         throw new at("[" + paramString2 + "]" + paramString3 + " Too many units: " + i + ", only single unit is allowed here");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 345 */     return au1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 351 */     if (this.a == null || this.a.size() == 0)
/*     */     {
/* 353 */       return 0;
/*     */     }
/* 355 */     int i = 0;
/* 356 */     for (av av : this.a)
/*     */     {
/* 358 */       i += av.b;
/*     */     }
/* 360 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 365 */     if (this.a == null || this.a.size() == 0)
/*     */     {
/* 367 */       return true;
/*     */     }
/*     */     
/* 370 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(m paramm, m paramm1, af paramaf, boolean paramBoolean) {
/* 376 */     a(0.0F, 0.0F, 0.0F, 0.0F, paramm1, false, paramaf, paramm, paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, m paramm, boolean paramBoolean, af paramaf) {
/* 381 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramm, paramBoolean, paramaf, null, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, m paramm, boolean paramBoolean1, af paramaf, m paramm1, boolean paramBoolean2) {
/* 386 */     if (this.a == null || this.a.size() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 391 */     boolean bool = false;
/*     */     
/* 393 */     if (!paramBoolean2) {
/*     */       
/* 395 */       if (paramm.s() > paramm.t() + 300)
/*     */       {
/* 397 */         bool = true;
/*     */ 
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 403 */     else if (paramm.a(true, false) > paramm.t() + 20000) {
/*     */       
/* 405 */       bool = true;
/*     */     } 
/*     */ 
/*     */     
/* 409 */     if (bool) {
/*     */       
/* 411 */       String str = "";
/* 412 */       if (paramaf != null)
/*     */       {
/* 414 */         str = str + "source:" + paramaf.cl();
/*     */       }
/*     */       
/* 417 */       l.b("spawnUnitsAt: Skipping, too many units already on team:" + paramm.i + " count:" + paramm.s() + " " + str);
/*     */       
/* 419 */       if ((l.u()).aV)
/*     */       {
/* 421 */         paramm.Q();
/*     */       }
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 428 */     if (paramm.p() > paramm.t() + 25000) {
/*     */       
/* 430 */       String str = "";
/* 431 */       if (paramaf != null)
/*     */       {
/* 433 */         str = str + "source:" + paramaf.cl();
/*     */       }
/* 435 */       l.b("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + paramm.i + " total count:" + paramm.p() + " " + str);
/*     */       
/* 437 */       if ((l.u()).aV)
/*     */       {
/* 439 */         paramm.Q();
/*     */       }
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 446 */     l l = l.u();
/*     */ 
/*     */     
/* 449 */     byte b1 = 0;
/* 450 */     byte b2 = 0;
/*     */ 
/*     */     
/* 453 */     for (av av : this.a) {
/*     */ 
/*     */       
/* 456 */       al al = av.a.c();
/* 457 */       if (al != null)
/*     */       {
/* 459 */         for (byte b = 0; b < av.b; b++) {
/*     */ 
/*     */           
/* 462 */           b2++;
/*     */ 
/*     */           
/* 465 */           m m1 = paramm;
/*     */           
/* 467 */           if (av.e < 1.0F) {
/*     */ 
/*     */ 
/*     */             
/* 471 */             float f1 = f.a(paramaf, 0.0F, 1.0F, b2);
/*     */             
/* 473 */             if (f1 > av.e) {
/*     */               continue;
/*     */             }
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 481 */           if (av.d) {
/*     */             
/* 483 */             if (paramaf == null) {
/*     */               continue;
/*     */             }
/*     */             
/* 487 */             if (paramaf.be == null) {
/*     */               continue;
/*     */             }
/*     */ 
/*     */             
/* 492 */             m1 = paramaf.be.bB;
/*     */             
/* 494 */             if (m1 == null)
/*     */             {
/* 496 */               throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
/*     */             }
/*     */           } 
/*     */           
/* 500 */           if (b1 >= av.f) {
/*     */             continue;
/*     */           }
/*     */ 
/*     */           
/* 505 */           af af1 = al.a();
/*     */           
/* 507 */           if (av.c)
/*     */           {
/* 509 */             m1 = m.g;
/*     */           }
/*     */           
/* 512 */           if (m1 == null)
/*     */           {
/* 514 */             throw new RuntimeException("Team==null");
/*     */           }
/*     */           
/* 517 */           af1.d(m1);
/*     */           
/* 519 */           af1.cx();
/*     */ 
/*     */           
/* 522 */           af1.dH = paramFloat1;
/* 523 */           af1.dI = paramFloat2;
/*     */           
/* 525 */           if (av.g) {
/*     */             
/* 527 */             l.bt.b(af1.dH, af1.dI);
/* 528 */             af1.dH = l.bt.M;
/* 529 */             af1.dI = l.bt.N;
/*     */             
/* 531 */             af1.dH += af1.cH();
/* 532 */             af1.dI += af1.cI();
/*     */           } 
/*     */ 
/*     */           
/* 536 */           af1.dJ = paramFloat3;
/*     */ 
/*     */           
/* 539 */           if (!af1.bw() && !av.k)
/*     */           {
/* 541 */             af1.bL = paramFloat4;
/*     */           }
/*     */ 
/*     */           
/* 545 */           af1.dH += av.l;
/* 546 */           af1.dI += av.m;
/* 547 */           af1.dJ += av.n;
/*     */           
/* 549 */           if (av.j != -1)
/*     */           {
/* 551 */             if (af1 instanceof r)
/*     */             {
/* 553 */               ((r)af1).a(av.j);
/*     */             }
/*     */           }
/*     */           
/* 557 */           float f = av.o;
/*     */           
/* 559 */           if (av.r != 0.0F)
/*     */           {
/* 561 */             f += f.a(paramaf, -av.r, av.r, b2 * 4 + 3);
/*     */           }
/*     */           
/* 564 */           if (f != 0.0F)
/*     */           {
/* 566 */             if (af1 instanceof r) {
/*     */               
/* 568 */               ((r)af1).i(f);
/*     */             }
/*     */             else {
/*     */               
/* 572 */               af1.bL += f;
/*     */             } 
/*     */           }
/*     */           
/* 576 */           af1.dH += b;
/*     */           
/* 578 */           if (av.p != 0.0F)
/*     */           {
/* 580 */             af1.dH += f.a(paramaf, -av.p, av.p, b2 * 2 + 1);
/*     */           }
/* 582 */           if (av.q != 0.0F)
/*     */           {
/* 584 */             af1.dI += f.a(paramaf, -av.q, av.q, b2 * 3 + 2);
/*     */           }
/*     */ 
/*     */           
/* 588 */           b1++;
/*     */ 
/*     */           
/* 591 */           if (av.h)
/*     */           {
/* 593 */             if (af1 instanceof r)
/*     */             {
/* 595 */               if (!((r)af1).bn()) {
/*     */                 
/* 597 */                 af1.bU();
/*     */                 
/*     */                 continue;
/*     */               } 
/*     */             }
/*     */           }
/* 603 */           if (av.i)
/*     */           {
/* 605 */             if (af1 instanceof r)
/*     */             {
/* 607 */               af1.cK();
/*     */             }
/*     */           }
/*     */ 
/*     */           
/* 612 */           if (av.s != null)
/*     */           {
/*     */             
/* 615 */             av.s.f(af1);
/*     */           }
/*     */ 
/*     */           
/* 619 */           if (av.t > 0)
/*     */           {
/*     */             
/* 622 */             if (paramaf != null && paramaf instanceof k) {
/*     */               
/* 624 */               k k = (k)paramaf;
/*     */ 
/*     */               
/* 627 */               short s = av.t;
/*     */               
/* 629 */               if (k.x != null)
/*     */               {
/*     */ 
/*     */ 
/*     */                 
/* 634 */                 while (s > 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 639 */                   int i = -1;
/* 640 */                   for (int j = k.x.size() - 1; j >= 0; j--) {
/*     */                     
/* 642 */                     af af3 = (af)k.x.get(j);
/*     */                     
/* 644 */                     if (af1.c(af3, true)) {
/*     */                       
/* 646 */                       i = j;
/*     */                       
/*     */                       break;
/*     */                     } 
/*     */                   } 
/*     */                   
/* 652 */                   if (i == -1) {
/*     */                     break;
/*     */                   }
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 659 */                   af af2 = (af)k.x.remove(i);
/*     */ 
/*     */                   
/* 662 */                   y.a(af2, (r)k);
/*     */                   
/* 664 */                   k.z(af2);
/*     */                   
/* 666 */                   af2.dH = af1.dH;
/* 667 */                   af2.dI = af1.dI;
/* 668 */                   af2.bL = af1.bL;
/* 669 */                   if (af2 instanceof r) {
/*     */                     
/* 671 */                     r r = (r)af2;
/* 672 */                     r.ax();
/*     */                   } 
/*     */                   
/* 675 */                   if (!af1.e(af2, true)) {
/*     */                     
/* 677 */                     l.b("transportedUnitsToTransfer failed for: " + af2.cl() + " to: " + af1.cl());
/* 678 */                     af2.bU();
/*     */                   } 
/*     */                   
/* 681 */                   s--;
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/* 688 */           m.c(af1);
/*     */           
/* 690 */           if (af1.bw() && af1 instanceof r)
/*     */           {
/*     */             
/* 693 */             l.bC.a((r)af1);
/*     */           }
/*     */ 
/*     */           
/* 697 */           if (paramBoolean1 && !af1.o_())
/*     */           {
/*     */             
/* 700 */             (l.u()).bA.k(af1);
/*     */           }
/*     */           
/* 703 */           if (paramm1 != null)
/*     */           {
/* 705 */             paramm1.add(af1);
/*     */           }
/*     */           continue;
/*     */         } 
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static au a(k paramk, boolean paramBoolean) {
/* 771 */     int i = paramk.f();
/*     */     
/* 773 */     if (paramBoolean && i == 0)
/*     */     {
/* 775 */       return null;
/*     */     }
/*     */     
/* 778 */     au au1 = new au();
/*     */     
/* 780 */     for (byte b = 0; b < i; b++) {
/*     */ 
/*     */       
/* 783 */       av av = new av(null);
/*     */ 
/*     */       
/* 786 */       al al = paramk.p();
/*     */ 
/*     */       
/* 789 */       if (al != null) {
/*     */         
/* 791 */         if (au1.a == null)
/*     */         {
/* 793 */           au1.a = new m();
/*     */         }
/* 795 */         av.a = l.a(al);
/*     */       } 
/*     */ 
/*     */       
/* 799 */       if (paramk.b() >= 75) {
/*     */         
/* 801 */         boolean bool = paramk.e();
/*     */         
/* 803 */         if (bool) {
/*     */           
/* 805 */           av.b = paramk.f();
/* 806 */           av.c = paramk.e();
/* 807 */           av.d = paramk.e();
/*     */           
/* 809 */           if (paramk.b() >= 76)
/*     */           {
/* 811 */             av.e = paramk.g();
/*     */           }
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 819 */       if (al != null)
/*     */       {
/*     */         
/* 822 */         au1.a.add(av);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 830 */     return au1;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
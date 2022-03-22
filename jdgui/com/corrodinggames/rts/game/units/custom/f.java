/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class f
/*     */ {
/*     */   public String a;
/*     */   public int b;
/*     */   public int c;
/*     */   public float d;
/*     */   public float e;
/*     */   public float f;
/*     */   public boolean g;
/*     */   public float h;
/*     */   public float i;
/*     */   public m j;
/*     */   public m k;
/*     */   public boolean l;
/*     */   public float m;
/*     */   public boolean n;
/*     */   public ArrayList o;
/*     */   public float p;
/*     */   
/*     */   public f(String paramString) {
/*  71 */     this.k = new m();
/*     */     
/*  73 */     this.l = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     this.o = new ArrayList();
/*     */     this.a = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(n paramn) {
/*  89 */     for (n n1 : this.o) {
/*     */       
/*  91 */       if (n1 == paramn)
/*     */       {
/*  93 */         return true;
/*     */       }
/*     */     } 
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 107 */     return this.n;
/*     */   } public void a(l paraml) { for (c c : this.k) { if (c.a == d.c || c.a == d.d || c.a == d.f || c.a == d.e || c.a == d.j) { boolean bool = false; for (af af : paraml.am) { if (c.c.equals(af.b)) { c.b = af.a; bool = true; break; }  }
/*     */          if (!bool)
/*     */           throw new at("Cannot find leg:" + c.c + " for animation:" + this.a);  }
/*     */        if (c.b < 0)
/*     */         throw new at("Cannot find target for:" + c.c + " for animation:" + this.a);  }
/* 113 */      } public void a(l paraml, ab paramab, String paramString1, String paramString2) { boolean bool = false;
/* 114 */     String str1 = null;
/*     */ 
/*     */     
/* 117 */     String str2 = paramab.b(paramString1, paramString2 + "onActions", null);
/*     */     
/* 119 */     if (str2 != null)
/*     */     {
/* 121 */       for (String str : str2.split(",")) {
/*     */         
/* 123 */         str = str.trim();
/*     */         
/* 125 */         if (!str.equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 130 */           n n = n.a(str);
/* 131 */           if (n == null)
/*     */           {
/* 133 */             throw new at("Unknown action type: " + str + " on animation:" + this.a);
/*     */           }
/*     */ 
/*     */           
/* 137 */           f f3 = paraml.a(n);
/* 138 */           if (f3 != null)
/*     */           {
/* 140 */             throw new at("Cannot add action: " + str + " to:" + this.a + " it already exists on:" + f3.a);
/*     */           }
/*     */ 
/*     */           
/* 144 */           this.o.add(n);
/*     */         } 
/*     */       } 
/*     */     }
/* 148 */     this.p = paramab.a(paramString1, paramString2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0F)).floatValue();
/*     */ 
/*     */     
/* 151 */     this.b = paramab.b(paramString1, paramString2 + "start", Integer.valueOf(0)).intValue();
/* 152 */     this.c = paramab.b(paramString1, paramString2 + "end", Integer.valueOf(-1)).intValue();
/*     */     
/* 154 */     if (this.c != -1 && this.c < this.b)
/*     */     {
/* 156 */       throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.a);
/*     */     }
/*     */ 
/*     */     
/* 160 */     this.j = m.a(paraml, paramab, paramString1, "", true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 166 */     this.h = paramab.d(paramString1, paramString2 + "blendIn", Float.valueOf(-1.0F)).floatValue();
/* 167 */     this.i = paramab.d(paramString1, paramString2 + "blendOut", Float.valueOf(-1.0F)).floatValue();
/*     */ 
/*     */ 
/*     */     
/* 171 */     this.d = paramab.a(paramString1, paramString2 + "scale_start", Float.valueOf(1.0F)).floatValue();
/* 172 */     this.e = paramab.a(paramString1, paramString2 + "scale_end", Float.valueOf(1.0F)).floatValue();
/*     */     
/* 174 */     Float float_ = paramab.a(paramString1, paramString2 + "speed", null);
/* 175 */     if (float_ != null) {
/*     */       
/* 177 */       this.f = float_.floatValue();
/* 178 */       bool = true;
/* 179 */       str1 = "speed";
/*     */     }
/*     */     else {
/*     */       
/* 183 */       this.f = 40.0F;
/*     */     } 
/*     */     
/* 186 */     this.g = paramab.a(paramString1, paramString2 + "pingPong", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     float f1 = 1.0F * this.f;
/*     */     
/* 198 */     float f2 = paramab.a(paramString1, paramString2 + "KeyframeTimeScale", Float.valueOf(1.0F)).floatValue();
/*     */ 
/*     */     
/* 201 */     if (this.c != -1) {
/*     */       
/* 203 */       bool = true;
/* 204 */       str1 = "animationEnd";
/*     */       
/* 206 */       c c = new c();
/* 207 */       c.a = d.a;
/* 208 */       this.k.add(c);
/*     */ 
/*     */ 
/*     */       
/* 212 */       int i = this.c - this.b + 1;
/*     */       
/* 214 */       f1 *= i;
/*     */       
/* 216 */       c.a(0.0F, this.b);
/* 217 */       c.a(f1, this.c + 0.99F);
/*     */     } 
/*     */ 
/*     */     
/* 221 */     if (this.d != 1.0F || this.e != 1.0F) {
/*     */       
/* 223 */       bool = true;
/* 224 */       str1 = "animationScaleX";
/*     */       
/* 226 */       c c = new c();
/* 227 */       c.a = d.b;
/* 228 */       this.k.add(c);
/*     */ 
/*     */ 
/*     */       
/* 232 */       c.a(0.0F, this.d);
/* 233 */       c.a(f1, this.e);
/*     */     } 
/*     */     
/* 236 */     if (bool)
/*     */     {
/* 238 */       this.m = f1;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 243 */     String str3 = paramString2 + "leg";
/* 244 */     String str4 = paramString2 + "arm";
/*     */     
/* 246 */     m m1 = paramab.f(paramString1, str3, str4);
/*     */     
/* 248 */     m1.addAll((Collection)paramab.j(paramString1, paramString2 + "turret"));
/*     */     
/* 250 */     m1.addAll((Collection)paramab.j(paramString1, paramString2 + "body"));
/*     */     
/* 252 */     m1.addAll((Collection)paramab.j(paramString1, paramString2 + "effect"));
/*     */ 
/*     */     
/* 255 */     for (String str : m1) {
/*     */       
/* 257 */       boolean bool1 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 270 */       if (!bool1) {
/*     */ 
/*     */ 
/*     */         
/* 274 */         if (bool)
/*     */         {
/* 276 */           throw new at("Cannot mix new (" + str + ") and old style (" + str1 + ") animations on:" + this.a);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 281 */         a(paraml, paramab, paramString1, paramString2, str);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 286 */     m m2 = new m();
/*     */ 
/*     */     
/* 289 */     this.l = false;
/*     */     
/* 291 */     for (c c : this.k) {
/*     */       
/* 293 */       c.a(f2);
/*     */       
/* 295 */       c.c();
/*     */       
/* 297 */       if (this.m < c.d)
/*     */       {
/* 299 */         this.m = c.d;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 304 */       if (c.e.length > 0) {
/*     */         
/* 306 */         this.n = true;
/*     */ 
/*     */         
/* 309 */         if (c.a != d.a && c.a != d.b)
/*     */         {
/*     */           
/* 312 */           this.l = true;
/*     */         }
/*     */         
/* 315 */         m2.add(c);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 320 */     this.k = m2; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public c a(String paramString1, String paramString2) {
/*     */     d d;
/*     */     boolean bool;
/* 339 */     Object object = null;
/*     */ 
/*     */     
/* 342 */     if (paramString2.startsWith("leg") || paramString2.startsWith("arm")) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 347 */       bool = true;
/*     */ 
/*     */       
/* 350 */       if (paramString1.equalsIgnoreCase("x"))
/*     */       {
/* 352 */         d = d.c;
/*     */       }
/* 354 */       else if (paramString1.equalsIgnoreCase("y"))
/*     */       {
/* 356 */         d = d.d;
/*     */       }
/* 358 */       else if (paramString1.equalsIgnoreCase("dir"))
/*     */       {
/* 360 */         d = d.e;
/*     */       }
/* 362 */       else if (paramString1.equalsIgnoreCase("height"))
/*     */       {
/* 364 */         d = d.f;
/*     */       }
/* 366 */       else if (paramString1.equalsIgnoreCase("alpha"))
/*     */       {
/* 368 */         d = d.j;
/*     */       }
/*     */       else
/*     */       {
/* 372 */         throw new at("Unknown leg/arm animation type:" + paramString1 + " on animation:" + this.a);
/*     */       }
/*     */     
/*     */     }
/* 376 */     else if (paramString2.startsWith("turret")) {
/*     */       
/* 378 */       bool = Integer.parseInt(paramString2.substring("turret".length()));
/* 379 */       bool--;
/*     */ 
/*     */       
/* 382 */       if (paramString1.equalsIgnoreCase("x"))
/*     */       {
/* 384 */         d = d.g;
/*     */       }
/* 386 */       else if (paramString1.equalsIgnoreCase("y"))
/*     */       {
/* 388 */         d = d.h;
/*     */       }
/*     */       else
/*     */       {
/* 392 */         throw new at("Unknown turret animation type:" + paramString1 + " on animation:" + this.a);
/*     */       }
/*     */     
/*     */     }
/* 396 */     else if (paramString2.startsWith("body")) {
/*     */ 
/*     */ 
/*     */       
/* 400 */       bool = false;
/*     */       
/* 402 */       if (paramString1.equalsIgnoreCase("scale"))
/*     */       {
/* 404 */         d = d.b;
/*     */       }
/* 406 */       else if (paramString1.equalsIgnoreCase("frame"))
/*     */       {
/* 408 */         d = d.a;
/*     */       }
/*     */       else
/*     */       {
/* 412 */         throw new at("Unknown body animation type:" + paramString1 + " on animation:" + this.a);
/*     */       }
/*     */     
/*     */     }
/* 416 */     else if (paramString2.startsWith("effect")) {
/*     */ 
/*     */       
/* 419 */       bool = false;
/* 420 */       d = d.i;
/*     */ 
/*     */       
/* 423 */       paramString2 = "event";
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 428 */       throw new at("Unknown animation target:" + paramString2 + " on animation:" + this.a);
/*     */     } 
/*     */ 
/*     */     
/* 432 */     for (c c1 : this.k) {
/*     */       
/* 434 */       if (c1.a == d && paramString2
/*     */         
/* 436 */         .equals(c1.c))
/*     */       {
/* 438 */         return c1;
/*     */       }
/*     */     } 
/*     */     
/* 442 */     c c = new c();
/*     */     
/* 444 */     c.a = d;
/* 445 */     c.b = bool;
/* 446 */     c.c = paramString2;
/*     */ 
/*     */     
/* 449 */     this.k.add(c);
/*     */     
/* 451 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(l paraml, ab paramab, String paramString1, String paramString2, String paramString3) {
/*     */     float f1;
/* 458 */     String str1 = paramString3.substring(paramString2.length());
/*     */     
/* 460 */     String str2 = str1.split("_")[0];
/*     */     
/* 462 */     String str3 = paramString2 + str2 + "_";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 472 */     String str4 = paramString3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 478 */     String str5 = str4.substring(str3.length());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 484 */       f1 = ab.a(str5, false, paramString1, str4);
/*     */     }
/* 486 */     catch (NumberFormatException numberFormatException) {
/*     */ 
/*     */       
/* 489 */       throw new at("Failed to read time:" + str5 + " in key:" + str4 + " section:" + paramString1 + " expected a float with optional 's' or 'ms' postfix");
/*     */     } 
/*     */     
/* 492 */     String str6 = paramab.e(paramString1, str4);
/*     */ 
/*     */ 
/*     */     
/* 496 */     if (str6.startsWith("{") && str6.endsWith("}")) {
/*     */       
/* 498 */       str6 = str6.substring(1, str6.length() - 1);
/*     */     }
/*     */     else {
/*     */       
/* 502 */       throw new at("Unknown format:" + str6, paramString1, str4);
/*     */     } 
/*     */ 
/*     */     
/* 506 */     String[] arrayOfString = str6.split(",");
/*     */     
/* 508 */     c c = null;
/*     */     
/* 510 */     for (String str7 : arrayOfString) {
/*     */       
/* 512 */       String[] arrayOfString1 = str7.split(":");
/* 513 */       if (arrayOfString1.length != 2)
/*     */       {
/* 515 */         throw new at("Unknown format on part:" + str7 + " of: " + str6, paramString1, str4);
/*     */       }
/*     */       
/* 518 */       String str8 = arrayOfString1[0].trim();
/* 519 */       String str9 = arrayOfString1[1].trim();
/*     */ 
/*     */       
/* 522 */       c c1 = a(str8, str2);
/*     */       
/* 524 */       if (c != c1) {
/*     */         
/* 526 */         if (c != null)
/*     */         {
/* 528 */           c.b();
/*     */         }
/* 530 */         c = c1;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 536 */         c1.a(paraml, f1, str8, str9);
/*     */       }
/* 538 */       catch (at at) {
/*     */         
/* 540 */         throw new at(at.a + " (as part of key:" + str4 + " section:" + paramString1 + ")");
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 547 */     if (c != null)
/*     */     {
/* 549 */       c.b();
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
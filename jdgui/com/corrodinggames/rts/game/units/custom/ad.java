/*     */ package com.corrodinggames.rts.game.units.custom;
/*     */ import android.graphics.Color;
/*     */ import com.corrodinggames.rts.gameFramework.b.e;
/*     */ import com.corrodinggames.rts.gameFramework.b.f;
/*     */ import com.corrodinggames.rts.gameFramework.b.h;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ 
/*     */ public class ad {
/*     */   public String name;
/*     */   public g imageStrip;
/*     */   public boolean createWhenOffscreen;
/*     */   public boolean createWhenZoomedOut;
/*     */   public boolean createWhenOverLiquid;
/*     */   public boolean createWhenOverLand;
/*     */   public float spawnChance;
/*     */   x ifSpawnFailsEmitEffects;
/*     */   public float life;
/*     */   public float lifeRandom;
/*     */   public boolean showInFog;
/*     */   public float xOffsetRelative;
/*     */   public float yOffsetRelative;
/*     */   public float hOffset;
/*     */   public boolean alwayStartDirAtZero;
/*     */   public float dirOffset;
/*     */   public float xOffsetRelativeRandom;
/*     */   public float yOffsetRelativeRandom;
/*  30 */   public static final ad defaultEffectTemplate = new ad("default");
/*     */   
/*     */   public float hOffsetRandom;
/*     */   public float dirOffsetRandom;
/*     */   public float xOffsetAbsolute;
/*     */   public float yOffsetAbsolute;
/*     */   public float xOffsetAbsoluteRandom;
/*     */   public float yOffsetAbsoluteRandom;
/*     */   public float xSpeedRelative;
/*     */   public float ySpeedRelative;
/*     */   public float hSpeed;
/*     */   public float dirSpeed;
/*     */   public float xSpeedRelativeRandom;
/*     */   public float ySpeedRelativeRandom;
/*     */   public float hSpeedRandom;
/*     */   public float dirSpeedRandom;
/*     */   public float xSpeedAbsolute;
/*     */   public float ySpeedAbsolute;
/*     */   public float xSpeedAbsoluteRandom;
/*  49 */   private ae builtInEffect = null; public float ySpeedAbsoluteRandom; public h priority; public float scaleTo; public float scaleFrom; public float alpha; public int color; public LightingColorFilter cachedLightingColorFilter; public float teamColorRatio; public boolean shadow; public short drawLayer; public float fadeInTime; public boolean fadeOut;
/*     */   public float delayedStartTimer;
/*     */   public float delayedStartTimerRandom;
/*     */   public int frameIndex;
/*     */   public int frameIndexRandom;
/*     */   public int stripIndex;
/*     */   public boolean attachedToUnit;
/*     */   public boolean liveAfterAttachedDies;
/*     */   public boolean atmospheric;
/*     */   public boolean physics;
/*     */   public float physicsGravity;
/*     */   public int animateFrameStart;
/*     */   public int animateFrameEnd;
/*     */   public int animateFrameStartRandomAdd;
/*     */   public boolean animateFramePingPong;
/*     */   public boolean animateFrameLooping;
/*     */   public float animateFrameSpeed;
/*     */   public float animateFrameSpeedRandom;
/*     */   public x alsoEmitEffects;
/*     */   public x alsoEmitEffectsOnDeath;
/*     */   public aq alsoPlaySound;
/*     */   public static ArrayList fields;
/*     */   
/*     */   public ad(ae paramae) {
/*  73 */     this.spawnChance = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     this.life = 200.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     this.priority = h.c;
/*     */     
/* 126 */     this.scaleTo = 1.0F;
/* 127 */     this.scaleFrom = 1.0F;
/*     */     
/* 129 */     this.alpha = 1.0F;
/*     */ 
/*     */     
/* 132 */     this.color = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     this.teamColorRatio = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     this.drawLayer = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     this.physicsGravity = 1.0F; this.builtInEffect = paramae; } ad(String paramString) { this.spawnChance = 1.0F; this.life = 200.0F; this.priority = h.c; this.scaleTo = 1.0F; this.scaleFrom = 1.0F; this.alpha = 1.0F; this.color = -1; this.teamColorRatio = 0.0F; this.drawLayer = 2; this.physicsGravity = 1.0F;
/*     */     this.name = paramString; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public e a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, w paramw, int paramInt, short paramShort) {
/* 229 */     l l = l.u();
/*     */ 
/*     */     
/* 232 */     if (this.spawnChance < 1.0F)
/*     */     {
/* 234 */       if (f.c(0.0F, 1.0F) > this.spawnChance) {
/*     */ 
/*     */         
/* 237 */         if (paramInt < 5)
/*     */         {
/* 239 */           if (this.ifSpawnFailsEmitEffects != null)
/*     */           {
/* 241 */             this.ifSpawnFailsEmitEffects.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramw, paramInt + 1, paramShort);
/*     */           }
/*     */         }
/*     */ 
/*     */         
/* 246 */         return null;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 251 */     float f1 = paramFloat1;
/* 252 */     float f2 = paramFloat2;
/* 253 */     float f3 = paramFloat3;
/*     */     
/* 255 */     if (this.builtInEffect != null) {
/*     */       e e1;
/*     */ 
/*     */ 
/*     */       
/* 260 */       if (this.builtInEffect == ae.a) {
/*     */         
/* 262 */         e1 = l.bz.a(f1, f2, f3, paramFloat4);
/*     */       }
/* 264 */       else if (this.builtInEffect == ae.b) {
/*     */         
/* 266 */         e1 = l.bz.b(f1, f2, f3, paramFloat4, 0);
/* 267 */         if (e1 != null)
/*     */         {
/* 269 */           e1.H = 0.75F;
/* 270 */           e1.G = 0.75F;
/*     */         }
/*     */       
/* 273 */       } else if (this.builtInEffect == ae.c) {
/*     */         
/* 275 */         e1 = l.bz.b(f1, f2, f3, paramFloat4, 0);
/*     */       }
/* 277 */       else if (this.builtInEffect == ae.d) {
/*     */         
/* 279 */         e1 = l.bz.c(f1, f2, f3, paramFloat4, 0);
/*     */       }
/* 281 */       else if (this.builtInEffect == ae.e) {
/*     */         
/* 283 */         e1 = l.bz.d(f1, f2, f3, 0);
/*     */       }
/* 285 */       else if (this.builtInEffect == ae.f) {
/*     */         
/* 287 */         l.bz.a(f1, f2, f3);
/* 288 */         e1 = null;
/*     */       }
/* 290 */       else if (this.builtInEffect == ae.g) {
/*     */         
/* 292 */         e1 = l.bz.b(f1, f2, f3);
/*     */       }
/* 294 */       else if (this.builtInEffect == ae.h) {
/*     */         
/* 296 */         f f4 = f.a(f1, f2);
/* 297 */         f4.j = -6684775;
/*     */ 
/*     */         
/* 300 */         f f5 = f.b(f1, f2);
/* 301 */         f5.a = 500.0F;
/* 302 */         f5.j = -6684775;
/*     */ 
/*     */ 
/*     */         
/* 306 */         l.bz.b(h.e);
/* 307 */         e e2 = l.bz.c(f1, f2, f3, -1127220);
/* 308 */         if (e2 != null) {
/*     */           
/* 310 */           e2.H = 0.15F;
/* 311 */           e2.G = 1.0F;
/* 312 */           e2.aq = 2;
/* 313 */           e2.W = 35.0F;
/* 314 */           e2.X = e2.W;
/*     */           
/* 316 */           e2.V = 0.0F;
/*     */           
/* 318 */           e2.y = -13378253;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 326 */         e1 = null;
/*     */       } else {
/*     */         
/* 329 */         if (this.builtInEffect == ae.i)
/*     */         {
/* 331 */           return null;
/*     */         }
/*     */ 
/*     */         
/* 335 */         throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
/*     */       } 
/* 337 */       if (e1 == null)
/*     */       {
/* 339 */         return null;
/*     */       }
/*     */       
/* 342 */       e1.aq = 2;
/*     */ 
/*     */       
/* 345 */       if (paramw != null)
/*     */       {
/* 347 */         c.a(e1, paramw);
/*     */       }
/*     */       
/* 350 */       return e1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 355 */     if (!this.createWhenZoomedOut)
/*     */     {
/* 357 */       if (!l.cJ)
/*     */       {
/* 359 */         return null;
/*     */       }
/*     */     }
/*     */     
/* 363 */     if (!this.createWhenOverLiquid)
/*     */     {
/* 365 */       if (y.c(f1, f2))
/*     */       {
/* 367 */         return null;
/*     */       }
/*     */     }
/*     */     
/* 371 */     if (!this.createWhenOverLand)
/*     */     {
/* 373 */       if (!y.c(f1, f2))
/*     */       {
/* 375 */         return null;
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 381 */     if (this.createWhenOffscreen) {
/*     */       
/* 383 */       l.bz.b();
/*     */     }
/*     */     else {
/*     */       
/* 387 */       l.bz.a();
/*     */     } 
/* 389 */     boolean bool = this.showInFog;
/*     */ 
/*     */ 
/*     */     
/* 393 */     boolean bool1 = false;
/*     */     
/* 395 */     if (!bool)
/*     */     {
/* 397 */       if (this.attachedToUnit) {
/*     */         
/* 399 */         bool1 = true;
/* 400 */         bool = true;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 406 */     e e = l.bz.b(f1, f2, f3, d.a, bool, this.priority);
/*     */ 
/*     */ 
/*     */     
/* 410 */     if (e == null)
/*     */     {
/* 412 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 418 */     e.a = this;
/*     */     
/* 420 */     e.B = (short)(paramShort + 1);
/*     */     
/* 422 */     if (bool1 && !this.showInFog)
/*     */     {
/* 424 */       e.e = false;
/*     */     }
/*     */     
/* 427 */     e.W = this.life;
/* 428 */     e.W += a(this.lifeRandom);
/*     */     
/* 430 */     e.X = e.W;
/*     */ 
/*     */ 
/*     */     
/* 434 */     e.ap = this.stripIndex;
/*     */     
/* 436 */     if (this.imageStrip != null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 448 */     e.ao = this.frameIndex;
/*     */     
/* 450 */     if (this.frameIndexRandom != 0) {
/*     */       
/* 452 */       e.ao += f.a(-this.frameIndexRandom, this.frameIndexRandom);
/*     */       
/* 454 */       if (e.ao < 0)
/*     */       {
/* 456 */         e.ao = 0;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 462 */     if (this.alwayStartDirAtZero) {
/*     */       
/* 464 */       e.Y = 0.0F;
/*     */     }
/*     */     else {
/*     */       
/* 468 */       e.Y = paramFloat4;
/*     */     } 
/*     */     
/* 471 */     e.Y += this.dirOffset;
/*     */ 
/*     */     
/* 474 */     e.Y += a(this.dirOffsetRandom);
/*     */ 
/*     */     
/* 477 */     if (this.xOffsetAbsoluteRandom != 0.0F || this.yOffsetAbsoluteRandom != 0.0F || this.xOffsetAbsolute != 0.0F || this.yOffsetAbsolute != 0.0F) {
/*     */       
/* 479 */       float f4 = this.xOffsetAbsolute + a(this.xOffsetAbsoluteRandom);
/* 480 */       float f5 = this.yOffsetAbsolute + a(this.yOffsetAbsoluteRandom);
/* 481 */       e.J += f4;
/* 482 */       e.K += f5;
/*     */     } 
/*     */ 
/*     */     
/* 486 */     if (this.xOffsetRelativeRandom != 0.0F || this.yOffsetRelativeRandom != 0.0F || this.xOffsetRelative != 0.0F || this.yOffsetRelative != 0.0F) {
/*     */       
/* 488 */       float f4 = f.i(paramFloat4);
/* 489 */       float f5 = f.h(paramFloat4);
/*     */       
/* 491 */       float f6 = this.xOffsetRelative + a(this.xOffsetRelativeRandom);
/* 492 */       float f7 = this.yOffsetRelative + a(this.yOffsetRelativeRandom);
/* 493 */       e.J += f4 * f7 - f5 * f6;
/* 494 */       e.K += f5 * f7 + f4 * f6;
/*     */     } 
/*     */ 
/*     */     
/* 498 */     e.L += this.hOffset + a(-this.hOffsetRandom, this.hOffsetRandom);
/*     */ 
/*     */ 
/*     */     
/* 502 */     e.am = true;
/*     */ 
/*     */     
/* 505 */     e.s = true;
/*     */     
/* 507 */     e.aq = this.drawLayer;
/*     */ 
/*     */     
/* 510 */     e.H = this.scaleFrom;
/* 511 */     e.G = this.scaleTo;
/*     */ 
/*     */     
/* 514 */     e.F = this.alpha;
/*     */     
/* 516 */     e.y = this.color;
/* 517 */     e.C = this.cachedLightingColorFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 522 */     if (this.teamColorRatio != 0.0F && paramw != null) {
/*     */       
/* 524 */       m m = null;
/* 525 */       if (paramw instanceof af)
/*     */       {
/* 527 */         m = ((af)paramw).bB;
/*     */       }
/* 529 */       if (paramw instanceof f) {
/*     */         
/* 531 */         af af = ((f)paramw).j;
/* 532 */         if (af != null)
/*     */         {
/* 534 */           m = af.bB;
/*     */         }
/*     */       } 
/*     */       
/* 538 */       if (m != null) {
/*     */ 
/*     */         
/* 541 */         float f = 1.0F - this.teamColorRatio;
/*     */         
/* 543 */         int i = Color.a(e.y);
/* 544 */         int j = (int)(Color.b(e.y) * f);
/* 545 */         int k = (int)(Color.c(e.y) * f);
/* 546 */         int n = (int)(Color.d(e.y) * f);
/*     */         
/* 548 */         int i1 = m.F();
/*     */         
/* 550 */         j = (int)(j + Color.b(i1) * this.teamColorRatio);
/* 551 */         k = (int)(k + Color.c(i1) * this.teamColorRatio);
/* 552 */         n = (int)(n + Color.d(i1) * this.teamColorRatio);
/*     */         
/* 554 */         j = f.b(j, 0, 255);
/* 555 */         k = f.b(k, 0, 255);
/* 556 */         n = f.b(n, 0, 255);
/*     */         
/* 558 */         e.y = Color.a(i, j, k, n);
/*     */         
/* 560 */         if (l.aj())
/*     */         {
/*     */           
/* 563 */           e.C = new LightingColorFilter(e.y, 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 572 */     if (this.fadeInTime != 0.0F) {
/*     */       
/* 574 */       e.t = true;
/* 575 */       e.u = this.fadeInTime;
/*     */     } 
/*     */     
/* 578 */     e.ar = this.shadow;
/*     */     
/* 580 */     e.s = this.fadeOut;
/*     */     
/* 582 */     e.V = this.delayedStartTimer;
/*     */     
/* 584 */     e.V += a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
/*     */     
/* 586 */     e.v = this.atmospheric;
/* 587 */     e.w = this.physics;
/* 588 */     e.x = this.physicsGravity;
/* 589 */     e.r = this.priority;
/*     */ 
/*     */     
/* 592 */     e.Q = this.xSpeedAbsolute + a(this.xSpeedAbsoluteRandom);
/* 593 */     e.R = this.ySpeedAbsolute + a(this.ySpeedAbsoluteRandom);
/*     */     
/* 595 */     if (this.xSpeedRelative != 0.0F || this.ySpeedRelative != 0.0F || this.xSpeedRelativeRandom != 0.0F || this.ySpeedRelativeRandom != 0.0F) {
/*     */       
/* 597 */       float f4 = f.i(paramFloat4);
/* 598 */       float f5 = f.h(paramFloat4);
/*     */       
/* 600 */       float f6 = this.xSpeedRelative + a(this.xSpeedRelativeRandom);
/* 601 */       float f7 = this.ySpeedRelative + a(this.ySpeedRelativeRandom);
/* 602 */       e.Q += f4 * f7 - f5 * f6;
/* 603 */       e.R += f5 * f7 + f4 * f6;
/*     */     } 
/*     */ 
/*     */     
/* 607 */     e.S = this.hSpeed + a(this.hSpeedRandom);
/*     */     
/* 609 */     e.Z = this.dirSpeed + a(this.dirSpeedRandom);
/*     */ 
/*     */     
/* 612 */     if (this.animateFrameStart != this.animateFrameEnd)
/*     */     {
/* 614 */       e.ae = true;
/*     */     }
/* 616 */     e.af = this.animateFrameStart;
/*     */     
/* 618 */     if (this.animateFrameStartRandomAdd != 0)
/*     */     {
/* 620 */       e.af += f.a(0, this.animateFrameStartRandomAdd);
/*     */     }
/*     */     
/* 623 */     e.ag = this.animateFrameEnd;
/*     */     
/* 625 */     e.ak = this.animateFrameStart;
/*     */     
/* 627 */     e.ah = this.animateFramePingPong;
/*     */     
/* 629 */     e.ai = this.animateFrameLooping;
/*     */     
/* 631 */     e.aj = this.animateFrameSpeed;
/*     */     
/* 633 */     e.aj += a(this.animateFrameSpeedRandom);
/*     */     
/* 635 */     if (paramw != null)
/*     */     {
/* 637 */       if (this.attachedToUnit)
/*     */       {
/* 639 */         c.a(e, paramw);
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 645 */     if (this.alsoPlaySound != null)
/*     */     {
/* 647 */       this.alsoPlaySound.a(paramFloat1, paramFloat2, 1.0F);
/*     */     }
/*     */     
/* 650 */     if (paramInt < 5)
/*     */     {
/* 652 */       if (this.alsoEmitEffects != null)
/*     */       {
/* 654 */         this.alsoEmitEffects.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramw, paramInt + 1, (short)0);
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
/* 671 */     return e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float a(float paramFloat) {
/* 677 */     if (paramFloat == 0.0F)
/*     */     {
/* 679 */       return 0.0F;
/*     */     }
/* 681 */     return f.c(-paramFloat, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public final float a(float paramFloat1, float paramFloat2) {
/* 686 */     if (paramFloat1 == paramFloat2)
/*     */     {
/* 688 */       return paramFloat1;
/*     */     }
/* 690 */     return f.c(paramFloat1, paramFloat2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(l paraml, ab paramab, String paramString) {
/* 696 */     l l1 = l.u();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 701 */     this.createWhenOffscreen = paramab.a(paramString, "createWhenOffscreen", Boolean.valueOf(false)).booleanValue();
/* 702 */     this.createWhenZoomedOut = paramab.a(paramString, "createWhenZoomedOut", Boolean.valueOf(true)).booleanValue();
/*     */ 
/*     */     
/* 705 */     this.createWhenOverLiquid = paramab.a(paramString, "createWhenOverLiquid", Boolean.valueOf(true)).booleanValue();
/* 706 */     this.createWhenOverLand = paramab.a(paramString, "createWhenOverLand", Boolean.valueOf(true)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 712 */     if (!this.createWhenOverLiquid && !this.createWhenOverLand)
/*     */     {
/* 714 */       throw new RuntimeException(paramString + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
/*     */     }
/*     */ 
/*     */     
/* 718 */     this.spawnChance = paramab.a(paramString, "spawnChance", Float.valueOf(1.0F)).floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 724 */     this.life = paramab.a(paramString, "life", Float.valueOf(200.0F)).floatValue();
/*     */     
/* 726 */     this.lifeRandom = paramab.a(paramString, "lifeRandom", Float.valueOf(0.0F)).floatValue();
/*     */ 
/*     */     
/* 729 */     this.showInFog = paramab.a(paramString, "showInFog", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 731 */     this.xOffsetRelative = paramab.a(paramString, "xOffsetRelative", Float.valueOf(0.0F)).floatValue();
/* 732 */     this.yOffsetRelative = paramab.a(paramString, "yOffsetRelative", Float.valueOf(0.0F)).floatValue();
/* 733 */     this.hOffset = paramab.a(paramString, "hOffset", Float.valueOf(0.0F)).floatValue();
/*     */     
/* 735 */     this.alwayStartDirAtZero = paramab.a(paramString, "alwayStartDirAtZero", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 737 */     this.dirOffset = paramab.a(paramString, "dirOffset", Float.valueOf(0.0F)).floatValue();
/* 738 */     this.xOffsetRelativeRandom = paramab.a(paramString, "xOffsetRelativeRandom", Float.valueOf(0.0F)).floatValue();
/* 739 */     this.yOffsetRelativeRandom = paramab.a(paramString, "yOffsetRelativeRandom", Float.valueOf(0.0F)).floatValue();
/* 740 */     this.hOffsetRandom = paramab.a(paramString, "hOffsetRandom", Float.valueOf(0.0F)).floatValue();
/* 741 */     this.dirOffsetRandom = paramab.a(paramString, "dirOffsetRandom", Float.valueOf(0.0F)).floatValue();
/* 742 */     this.xOffsetAbsolute = paramab.a(paramString, "xOffsetAbsolute", Float.valueOf(0.0F)).floatValue();
/* 743 */     this.yOffsetAbsolute = paramab.a(paramString, "yOffsetAbsolute", Float.valueOf(0.0F)).floatValue();
/* 744 */     this.xOffsetAbsoluteRandom = paramab.a(paramString, "xOffsetAbsoluteRandom", Float.valueOf(0.0F)).floatValue();
/* 745 */     this.yOffsetAbsoluteRandom = paramab.a(paramString, "yOffsetAbsoluteRandom", Float.valueOf(0.0F)).floatValue();
/* 746 */     this.xSpeedRelative = paramab.a(paramString, "xSpeedRelative", Float.valueOf(0.0F)).floatValue();
/* 747 */     this.ySpeedRelative = paramab.a(paramString, "ySpeedRelative", Float.valueOf(0.0F)).floatValue();
/* 748 */     this.hSpeed = paramab.a(paramString, "hSpeed", Float.valueOf(0.0F)).floatValue();
/* 749 */     this.dirSpeed = paramab.a(paramString, "dirSpeed", Float.valueOf(0.0F)).floatValue();
/* 750 */     this.xSpeedRelativeRandom = paramab.a(paramString, "xSpeedRelativeRandom", Float.valueOf(0.0F)).floatValue();
/* 751 */     this.ySpeedRelativeRandom = paramab.a(paramString, "ySpeedRelativeRandom", Float.valueOf(0.0F)).floatValue();
/* 752 */     this.hSpeedRandom = paramab.a(paramString, "hSpeedRandom", Float.valueOf(0.0F)).floatValue();
/* 753 */     this.dirSpeedRandom = paramab.a(paramString, "dirSpeedRandom", Float.valueOf(0.0F)).floatValue();
/* 754 */     this.xSpeedAbsolute = paramab.a(paramString, "xSpeedAbsolute", Float.valueOf(0.0F)).floatValue();
/* 755 */     this.ySpeedAbsolute = paramab.a(paramString, "ySpeedAbsolute", Float.valueOf(0.0F)).floatValue();
/* 756 */     this.xSpeedAbsoluteRandom = paramab.a(paramString, "xSpeedAbsoluteRandom", Float.valueOf(0.0F)).floatValue();
/* 757 */     this.ySpeedAbsoluteRandom = paramab.a(paramString, "ySpeedAbsoluteRandom", Float.valueOf(0.0F)).floatValue();
/* 758 */     this.scaleTo = paramab.a(paramString, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
/* 759 */     this.scaleFrom = paramab.a(paramString, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
/* 760 */     this.alpha = paramab.a(paramString, "alpha", Float.valueOf(this.alpha)).floatValue();
/* 761 */     this.color = paramab.a(paramString, "color", Integer.valueOf(this.color)).intValue();
/*     */ 
/*     */     
/* 764 */     if (l.aj())
/*     */     {
/* 766 */       if (this.color != 0 && this.color != -1)
/*     */       {
/* 768 */         this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
/*     */       }
/*     */     }
/*     */     
/* 772 */     this.teamColorRatio = paramab.a(paramString, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
/* 773 */     if (this.teamColorRatio < 0.0F || this.teamColorRatio > 1.0F)
/*     */     {
/* 775 */       throw new RuntimeException(paramString + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 780 */     this.shadow = paramab.a(paramString, "shadow", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/* 783 */     this.drawLayer = 2;
/* 784 */     if (paramab.a(paramString, "drawUnderUnits", Boolean.valueOf(false)).booleanValue())
/*     */     {
/* 786 */       this.drawLayer = 1;
/*     */     }
/*     */     
/* 789 */     this.fadeInTime = paramab.a(paramString, "fadeInTime", Float.valueOf(0.0F)).floatValue();
/* 790 */     this.fadeOut = paramab.a(paramString, "fadeOut", Boolean.valueOf(true)).booleanValue();
/* 791 */     this.delayedStartTimer = paramab.a(paramString, "delayedStartTimer", Float.valueOf(0.0F)).floatValue();
/* 792 */     this.delayedStartTimerRandom = paramab.a(paramString, "delayedStartTimerRandom", Float.valueOf(0.0F)).floatValue();
/*     */ 
/*     */     
/* 795 */     this.frameIndex = paramab.b(paramString, "frameIndex", Integer.valueOf(0)).intValue();
/*     */     
/* 797 */     this.frameIndexRandom = paramab.b(paramString, "frameIndexRandom", Integer.valueOf(0)).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 802 */     String str1 = paramab.b(paramString, "stripIndex", "0");
/*     */     
/* 804 */     this.stripIndex = l1.bz.a(str1);
/* 805 */     if (this.stripIndex == -1)
/*     */     {
/* 807 */       throw new RuntimeException("Failed to find stripIndex with name:" + str1);
/*     */     }
/*     */ 
/*     */     
/* 811 */     this.attachedToUnit = paramab.a(paramString, "attachedToUnit", Boolean.valueOf(true)).booleanValue();
/*     */     
/* 813 */     this.liveAfterAttachedDies = paramab.a(paramString, "liveAfterAttachedDies", Boolean.valueOf(true)).booleanValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 820 */     this.atmospheric = paramab.a(paramString, "atmospheric", Boolean.valueOf(false)).booleanValue();
/* 821 */     this.physics = paramab.a(paramString, "physics", Boolean.valueOf(false)).booleanValue();
/* 822 */     this.physicsGravity = paramab.a(paramString, "physicsGravity", Float.valueOf(1.0F)).floatValue();
/*     */     
/* 824 */     String str2 = paramab.b(paramString, "priority", null);
/* 825 */     if (str2 != null) {
/*     */       
/*     */       try {
/*     */         
/* 829 */         this.priority = h.valueOf(str2);
/*     */       }
/* 831 */       catch (IllegalArgumentException illegalArgumentException) {
/*     */         
/* 833 */         throw new RuntimeException("Unknown priority:" + str2);
/*     */       } 
/*     */     }
/*     */     
/* 837 */     int i = paramab.b(paramString, "total_frames", Integer.valueOf(1)).intValue();
/* 838 */     if (i < 1)
/*     */     {
/* 840 */       throw new at("TOTAL_FRAMES cannot be: " + i + " (must be 1 or more)");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 846 */     e e = paraml.a(paramab, paramString, "image");
/*     */     
/* 848 */     if (e != null) {
/*     */ 
/*     */       
/* 851 */       this.imageStrip = new g();
/*     */       
/* 853 */       this.imageStrip.i = e;
/*     */       
/* 855 */       this.imageStrip.b = this.imageStrip.i.l() / i;
/* 856 */       this.imageStrip.c = this.imageStrip.i.k();
/*     */ 
/*     */       
/* 859 */       this.imageStrip.b = paramab.b(paramString, "frame_width", Integer.valueOf(this.imageStrip.b)).intValue();
/* 860 */       this.imageStrip.c = paramab.b(paramString, "frame_height", Integer.valueOf(this.imageStrip.c)).intValue();
/*     */       
/* 862 */       if (i == 1 && this.imageStrip.b >= this.imageStrip.i.l()) {
/*     */         
/* 864 */         this.imageStrip.k = true;
/*     */ 
/*     */       
/*     */       }
/* 868 */       else if (this.imageStrip.c < this.imageStrip.i.k()) {
/*     */         
/* 870 */         this.imageStrip.h = this.imageStrip.i.l() / this.imageStrip.b;
/* 871 */         if (this.imageStrip.h < 1)
/*     */         {
/* 873 */           this.imageStrip.h = 1;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 878 */       this.imageStrip.d = 0;
/* 879 */       this.imageStrip.e = 0;
/*     */       
/* 881 */       this.imageStrip.f = this.imageStrip.b;
/* 882 */       this.imageStrip.g = this.imageStrip.c;
/*     */ 
/*     */       
/* 885 */       String str = paramab.b(paramString, "imageShadow", null);
/*     */       
/* 887 */       if (str != null) {
/*     */         
/* 889 */         this.imageStrip.j = ac.a(paraml.x, str, paraml.T, paraml, paramString, "imageShadow");
/*     */         
/* 891 */         this.shadow = true;
/*     */       } 
/*     */       
/* 894 */       if (this.shadow && this.imageStrip.j == null)
/*     */       {
/* 896 */         throw new at("imageShadow is required if image and shadow:true is used");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 905 */     this.animateFrameStart = paramab.b(paramString, "animateFrameStart", Integer.valueOf(0)).intValue();
/*     */     
/* 907 */     this.animateFrameStartRandomAdd = paramab.b(paramString, "animateFrameStartRandomAdd", Integer.valueOf(0)).intValue();
/*     */ 
/*     */     
/* 910 */     this.animateFrameEnd = paramab.b(paramString, "animateFrameEnd", Integer.valueOf(0)).intValue();
/*     */     
/* 912 */     this.animateFramePingPong = paramab.a(paramString, "animateFramePingPong", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 914 */     this.animateFrameLooping = paramab.a(paramString, "animateFrameLooping", Boolean.valueOf(false)).booleanValue();
/*     */     
/* 916 */     this.animateFrameSpeed = paramab.b(paramString, "animateFrameSpeed", Float.valueOf(0.5F)).floatValue();
/*     */     
/* 918 */     this.animateFrameSpeedRandom = paramab.b(paramString, "animateFrameSpeedRandom", Float.valueOf(0.0F)).floatValue();
/*     */     
/* 920 */     if (e != null)
/*     */     {
/* 922 */       if (this.imageStrip.b >= this.imageStrip.i.l() || i != 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 928 */         if (this.animateFrameEnd > i)
/*     */         {
/* 930 */           throw new at("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + i + " (when using custom image)");
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 935 */     this.alsoEmitEffects = paraml.a(paramab.b(paramString, "alsoEmitEffects", null));
/*     */ 
/*     */     
/* 938 */     this.alsoEmitEffectsOnDeath = paraml.a(paramab.b(paramString, "alsoEmitEffectsOnDeath", null));
/*     */ 
/*     */     
/* 941 */     this.ifSpawnFailsEmitEffects = paraml.a(paramab.b(paramString, "ifSpawnFailsEmitEffects", null));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 947 */     this.alsoPlaySound = aq.a(paraml, paramab.b(paramString, "alsoPlaySound", null), (aq)null);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
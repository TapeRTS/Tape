/*     */ package com.corrodinggames.rts.gameFramework.h;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class l
/*     */ {
/*     */   public short a;
/*     */   public short b;
/*     */   
/*     */   public strictfp l() {}
/*     */   
/*     */   public strictfp l(short paramShort1, short paramShort2) {
/* 390 */     a(paramShort1, paramShort2);
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp l a(short paramShort1, short paramShort2) {
/* 395 */     this.a = paramShort1;
/* 396 */     this.b = paramShort2;
/* 397 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp l a(l paraml) {
/* 402 */     this.a = paraml.a;
/* 403 */     this.b = paraml.b;
/* 404 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp l a(j paramj) {
/* 409 */     this.a = paramj.a;
/* 410 */     this.b = paramj.b;
/* 411 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp int a(k paramk) {
/* 416 */     short s1 = this.a;
/* 417 */     short s2 = this.b;
/*     */     
/* 419 */     if (paramk.b[s1 * paramk.h + s2] == -1 || paramk.c[s1 * paramk.h + s2] == -1 || paramk.d[s1 * paramk.h + s2] == -1)
/*     */     {
/* 421 */       return -1;
/*     */     }
/*     */     
/* 424 */     return paramk.b[s1 * paramk.h + s2] + paramk.c[s1 * paramk.h + s2] + paramk.d[s1 * paramk.h + s2] * 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp int a(k paramk, byte paramByte) {
/* 429 */     return paramk.l[paramByte][this.a * paramk.h + this.b];
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp void a(k paramk, byte paramByte, int paramInt) {
/* 434 */     paramk.l[paramByte][this.a * paramk.h + this.b] = paramInt;
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
/*     */   public final strictfp void a(k paramk, byte paramByte, boolean paramBoolean) {
/* 463 */     if (paramBoolean) {
/* 464 */       paramk.m[paramByte][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte][this.a * paramk.h + this.b] | 0x10);
/*     */     } else {
/* 466 */       paramk.m[paramByte][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte][this.a * paramk.h + this.b] & 0xFFFFFFEF);
/*     */     } 
/*     */   }
/*     */   public final strictfp boolean b(k paramk, byte paramByte) {
/* 470 */     if (paramk.l[paramByte][this.a * paramk.h + this.b] < paramk.i)
/*     */     {
/* 472 */       return false;
/*     */     }
/* 474 */     return ((paramk.m[paramByte][this.a * paramk.h + this.b] & 0x10) != 0);
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
/*     */   public final strictfp byte c(k paramk, byte paramByte) {
/* 495 */     return (byte)(paramk.m[paramByte][this.a * paramk.h + this.b] & 0x7);
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp boolean d(k paramk, byte paramByte) {
/* 500 */     return ((paramk.m[paramByte][this.a * paramk.h + this.b] & 0x8) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public final strictfp void b(k paramk, byte paramByte, boolean paramBoolean) {
/* 505 */     if (paramBoolean) {
/* 506 */       paramk.m[paramByte][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte][this.a * paramk.h + this.b] | 0x8);
/*     */     } else {
/* 508 */       paramk.m[paramByte][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte][this.a * paramk.h + this.b] & 0xFFFFFFF7);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final strictfp void a(k paramk, byte paramByte1, byte paramByte2) {
/* 513 */     paramk.m[paramByte1][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte1][this.a * paramk.h + this.b] & 0xFFFFFFF0);
/* 514 */     paramk.m[paramByte1][this.a * paramk.h + this.b] = (byte)(paramk.m[paramByte1][this.a * paramk.h + this.b] | paramByte2 & 0xF);
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
/*     */   public final strictfp void a(k paramk, byte paramByte, float paramFloat) {
/* 536 */     int i = (int)(paramFloat / 360.0F * 8.0F + 0.5F);
/*     */     
/* 538 */     if (i < 0) i += 8; 
/* 539 */     if (i > 7) i -= 8;
/*     */ 
/*     */     
/* 542 */     if (i < 0) i += 8; 
/* 543 */     if (i > 7) i -= 8;
/*     */     
/* 545 */     if (i < 0 || i > 7) {
/*     */       
/* 547 */       com.corrodinggames.rts.gameFramework.l.d("setCurrentDirectionFromAngle: dir:" + i + " direction:" + paramFloat);
/* 548 */       i = 0;
/*     */     } 
/*     */     
/* 551 */     a(paramk, paramByte, (byte)i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp boolean e(k paramk, byte paramByte) {
/* 558 */     if (paramk.l[paramByte][this.a * paramk.h + this.b] >= paramk.i)
/*     */     {
/* 560 */       return true;
/*     */     }
/* 562 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp l f(k paramk, byte paramByte) {
/* 568 */     l l1 = new l();
/*     */     
/* 570 */     if (a(paramk, paramByte, l1))
/*     */     {
/* 572 */       return l1;
/*     */     }
/*     */ 
/*     */     
/* 576 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final strictfp boolean a(k paramk, byte paramByte, l paraml) {
/* 582 */     if (!e(paramk, paramByte)) {
/*     */       
/* 584 */       paraml.a((short)-1, (short)-1);
/* 585 */       return false;
/*     */     } 
/*     */     
/* 588 */     byte b = c(paramk, paramByte);
/*     */     
/* 590 */     if (d(paramk, paramByte)) {
/*     */       
/* 592 */       paraml.a((short)-1, (short)-1);
/* 593 */       return false;
/*     */     } 
/*     */     
/* 596 */     byte b1 = 0;
/* 597 */     byte b2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 607 */     if (b == 0) b1++; 
/* 608 */     if (b == 1) { b1++; b2++; }
/* 609 */      if (b == 2) b2++; 
/* 610 */     if (b == 3) { b2++; b1--; }
/* 611 */      if (b == 4) b1--; 
/* 612 */     if (b == 5) { b1--; b2--; }
/* 613 */      if (b == 6) b2--; 
/* 614 */     if (b == 7) { b2--; b1++; }
/*     */ 
/*     */     
/* 617 */     short s1 = (short)(this.a - b1);
/* 618 */     short s2 = (short)(this.b - b2);
/*     */     
/* 620 */     paraml.a(s1, s2);
/* 621 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
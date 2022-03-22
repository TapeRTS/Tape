/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.LinkedList;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ap
/*     */ {
/*     */   ByteArrayOutputStream b;
/*     */   DataOutputStream c;
/*     */   private DataOutputStream a;
/*  43 */   private LinkedList e = new LinkedList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a() {
/*  87 */     ListIterator<aq> listIterator = this.e.listIterator(this.e.size());
/*     */ 
/*     */     
/*  90 */     while (listIterator.hasPrevious()) {
/*  91 */       aq aq = listIterator.previous();
/*  92 */       aq.a();
/*     */     } 
/*     */     
/*  95 */     this.c.flush();
/*     */     
/*  97 */     if (this.b != null)
/*     */     {
/*  99 */       this.b.flush();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp void b() {
/* 197 */     this.a = this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp ap(int paramInt) {
/* 202 */     this();
/* 203 */     this.d = paramInt;
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
/*     */   public strictfp ar b(int paramInt) {
/* 222 */     return a(paramInt, -1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ar a(int paramInt1, int paramInt2) {
/*     */     try {
/* 230 */       a();
/*     */     }
/* 232 */     catch (IOException iOException) {
/*     */       
/* 234 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 237 */     ar ar = new ar(paramInt1);
/* 238 */     ar.c = this.b.toByteArray();
/* 239 */     ar.d = paramInt2;
/* 240 */     return ar;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String c() {
/*     */     try {
/* 247 */       a();
/*     */     }
/* 249 */     catch (IOException iOException) {
/*     */       
/* 251 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 254 */     return this.b.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp byte[] d() {
/*     */     try {
/* 263 */       a();
/*     */     }
/* 265 */     catch (IOException iOException) {
/*     */       
/* 267 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 270 */     return this.b.toByteArray();
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
/*     */   public strictfp void c(int paramInt) {
/* 284 */     this.a.writeByte(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(boolean paramBoolean) {
/* 290 */     this.a.writeBoolean(paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 296 */     this.a.writeInt(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 302 */     this.a.writeFloat(paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(double paramDouble) {
/* 308 */     this.a.writeDouble(paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(long paramLong) {
/* 314 */     this.a.writeLong(paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(String paramString) {
/* 321 */     a((paramString != null));
/*     */     
/* 323 */     if (paramString != null)
/*     */     {
/* 325 */       c(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c(String paramString) {
/* 334 */     this.a.writeUTF(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(h paramh) {
/* 341 */     if (paramh == null)
/*     */     {
/* 343 */       this.a.writeUTF("");
/*     */     }
/*     */     
/* 346 */     this.a.writeUTF(paramh.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(w paramw) {
/* 351 */     if (paramw == null) {
/*     */       
/* 353 */       this.a.writeLong(-1L);
/*     */     }
/*     */     else {
/*     */       
/* 357 */       this.a.writeLong(paramw.dA);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(w paramw) {
/* 364 */     if (paramw != null)
/*     */     {
/* 366 */       if (!paramw.dC) {
/*     */         
/* 368 */         this.a.writeLong(paramw.dA);
/*     */         return;
/*     */       } 
/*     */     }
/* 372 */     this.a.writeLong(-1L);
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
/*     */   public strictfp void a(m paramm) {
/* 407 */     if (paramm == null) {
/*     */       
/* 409 */       a(0);
/*     */       
/*     */       return;
/*     */     } 
/* 413 */     a(paramm.size());
/*     */     
/* 415 */     for (w w1 : paramm) {
/*     */       
/* 417 */       w w2 = w1;
/* 418 */       b(w2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(af paramaf) {
/* 425 */     if (paramaf != null)
/*     */     {
/* 427 */       if (!paramaf.dC && !paramaf.bz) {
/*     */         
/* 429 */         a((w)paramaf);
/*     */         return;
/*     */       } 
/*     */     }
/* 433 */     a((w)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf) {
/* 438 */     if (paramaf != null)
/*     */     {
/* 440 */       if (!paramaf.dC) {
/*     */         
/* 442 */         a((w)paramaf);
/*     */         return;
/*     */       } 
/*     */     }
/* 446 */     a((w)null);
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
/*     */   public strictfp void a(r paramr) {
/* 459 */     if (paramr != null)
/*     */     {
/* 461 */       if (!paramr.dC) {
/*     */         
/* 463 */         a((w)paramr);
/*     */         return;
/*     */       } 
/*     */     }
/* 467 */     a((w)null);
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
/*     */   public strictfp void a(PointF paramPointF) {
/* 480 */     a((paramPointF != null));
/* 481 */     if (paramPointF != null) {
/*     */       
/* 483 */       a(paramPointF.a);
/* 484 */       a(paramPointF.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(Enum paramEnum) {
/* 491 */     if (paramEnum == null) {
/*     */       
/* 493 */       this.a.writeInt(-1);
/*     */     }
/*     */     else {
/*     */       
/* 497 */       this.a.writeInt(paramEnum.ordinal());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(al paramal) {
/* 505 */     if (paramal == null) {
/*     */       
/* 507 */       this.a.writeInt(-1);
/*     */     }
/* 509 */     else if (paramal instanceof l) {
/*     */       
/* 511 */       this.a.writeInt(-2);
/* 512 */       c(((l)paramal).E);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 517 */       this.a.writeInt(((ak)paramal).ordinal());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(c paramc) {
/* 525 */     if (paramc == null) {
/*     */       
/* 527 */       this.a.writeInt(0);
/*     */     }
/*     */     else {
/*     */       
/* 531 */       this.a.writeInt(paramc.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(m paramm) {
/* 538 */     this.a.writeByte(paramm.i);
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
/*     */   public strictfp void a(File paramFile) {
/* 552 */     FileInputStream fileInputStream = new FileInputStream(paramFile);
/*     */     
/*     */     try {
/* 555 */       a(fileInputStream, (int)paramFile.length());
/*     */     
/*     */     }
/*     */     finally {
/*     */       
/* 560 */       fileInputStream.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(k paramk) {
/* 568 */     InputStream inputStream = paramk.u();
/*     */     
/*     */     try {
/* 571 */       inputStream.reset();
/*     */     }
/* 573 */     catch (IOException iOException) {
/*     */       
/* 575 */       iOException.printStackTrace();
/*     */     } 
/*     */     
/* 578 */     a(inputStream, inputStream.available());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(InputStream paramInputStream, int paramInt) {
/* 585 */     int i = 0;
/*     */     
/* 587 */     a(paramInt);
/*     */ 
/*     */     
/* 590 */     byte[] arrayOfByte = new byte[16384];
/*     */     int j;
/* 592 */     while ((j = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length)) != -1) {
/*     */ 
/*     */       
/* 595 */       if (i + j > paramInt) {
/*     */ 
/*     */         
/* 598 */         int k = paramInt - i;
/* 599 */         if (k < 0) {
/*     */           
/* 601 */           ad.f("writeStream: bytesTillFull is " + k);
/*     */           
/*     */           return;
/*     */         } 
/* 605 */         this.a.write(arrayOfByte, 0, k);
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 610 */       this.a.write(arrayOfByte, 0, j);
/*     */       
/* 612 */       i += j;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ByteArrayOutputStream paramByteArrayOutputStream) {
/* 620 */     a(paramByteArrayOutputStream.size());
/* 621 */     paramByteArrayOutputStream.writeTo(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(byte[] paramArrayOfbyte) {
/* 626 */     a(paramArrayOfbyte.length);
/* 627 */     this.a.write(paramArrayOfbyte);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(byte[] paramArrayOfbyte) {
/* 632 */     this.a.write(paramArrayOfbyte);
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
/*     */   public strictfp void a(short paramShort) {
/* 652 */     this.a.writeShort(paramShort);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 659 */     a((short)12345);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d(String paramString) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f() {
/* 669 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void e(String paramString) {
/* 674 */     a(paramString, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString, boolean paramBoolean) {
/* 679 */     aq aq = new aq(paramBoolean);
/* 680 */     aq.c = paramString;
/* 681 */     this.e.add(aq);
/*     */     
/* 683 */     this.a = ((aq)this.e.getLast()).e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString) {
/* 689 */     aq aq = this.e.removeLast();
/* 690 */     if (!aq.c.equals(paramString))
/*     */     {
/* 692 */       l.b("OutputNetStream:endBlock", "Name does not match: expected" + paramString + " , got:" + aq.c);
/*     */     }
/*     */     
/* 695 */     aq.a();
/*     */     
/* 697 */     if (this.e.isEmpty()) {
/*     */       
/* 699 */       this.a = this.c;
/*     */     }
/*     */     else {
/*     */       
/* 703 */       this.a = ((aq)this.e.getLast()).e;
/*     */     } 
/*     */ 
/*     */     
/* 707 */     this.a.writeUTF(aq.c);
/*     */     
/* 709 */     a(aq.d);
/*     */ 
/*     */     
/*     */     try {
/* 713 */       aq.b();
/*     */     }
/* 715 */     catch (Exception exception) {
/*     */       
/* 717 */       if (exception instanceof java.util.zip.DataFormatException) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 722 */         if (!l.aJ)
/*     */         {
/* 724 */           l.b("DataFormatException error calling streamBlock.close() (this is expected on android 4.4)");
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */ 
/*     */         
/* 735 */         l.b("Error calling streamBlock.close() to clean up memory");
/*     */         
/* 737 */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp ap() {
/* 744 */     this.d = 999999; this.b = new ByteArrayOutputStream(); this.c = new DataOutputStream(this.b); b(); } public strictfp ap(DataOutputStream paramDataOutputStream) { this.d = 999999;
/*     */     this.c = paramDataOutputStream;
/*     */     b(); }
/*     */    public strictfp int g() {
/* 748 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void h() {
/* 753 */     this.c = null;
/* 754 */     this.a = null;
/*     */ 
/*     */     
/*     */     try {
/* 758 */       if (this.b != null)
/*     */       {
/* 760 */         this.b.close();
/*     */       }
/*     */     }
/* 763 */     catch (IOException iOException) {
/*     */       
/* 765 */       iOException.printStackTrace();
/*     */     } 
/* 767 */     this.b = null;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
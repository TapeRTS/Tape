/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.ak;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
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
/*     */ public class at
/*     */   extends ap
/*     */ {
/*     */   ByteArrayOutputStream a;
/*     */   PrintStream e;
/*     */   private PrintStream f;
/*  42 */   private LinkedList g = new LinkedList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  86 */     ListIterator<au> listIterator = this.g.listIterator(this.g.size());
/*     */ 
/*     */     
/*  89 */     while (listIterator.hasPrevious()) {
/*  90 */       au au = listIterator.previous();
/*  91 */       au.a();
/*     */     } 
/*     */     
/*  94 */     this.e.flush();
/*     */     
/*  96 */     if (this.a != null)
/*     */     {
/*  98 */       this.a.flush();
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
/* 196 */     this.f = this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp at() {
/* 207 */     this.a = new ByteArrayOutputStream();
/* 208 */     this.e = new PrintStream(this.a);
/* 209 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp at(PrintStream paramPrintStream) {
/* 214 */     this.e = paramPrintStream;
/* 215 */     b();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ar b(int paramInt) {
/* 221 */     return a(paramInt, -1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp ar a(int paramInt1, int paramInt2) {
/*     */     try {
/* 229 */       a();
/*     */     }
/* 231 */     catch (IOException iOException) {
/*     */       
/* 233 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 236 */     ar ar = new ar(paramInt1);
/* 237 */     ar.c = this.a.toByteArray();
/* 238 */     ar.d = paramInt2;
/* 239 */     return ar;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String c() {
/*     */     try {
/* 246 */       a();
/*     */     }
/* 248 */     catch (IOException iOException) {
/*     */       
/* 250 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 253 */     return this.a.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp byte[] d() {
/*     */     try {
/* 262 */       a();
/*     */     }
/* 264 */     catch (IOException iOException) {
/*     */       
/* 266 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 269 */     return this.a.toByteArray();
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
/* 283 */     this.f.println(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(boolean paramBoolean) {
/* 290 */     this.f.println(paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/* 296 */     this.f.println("#int:");
/* 297 */     this.f.println(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(float paramFloat) {
/* 303 */     this.f.println("#writeFloat");
/*     */     
/* 305 */     this.f.println(paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(long paramLong) {
/* 311 */     this.f.println("#writeLong");
/*     */     
/* 313 */     this.f.println(paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(String paramString) {
/* 320 */     a((paramString != null));
/*     */     
/* 322 */     if (paramString != null)
/*     */     {
/* 324 */       c(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void c(String paramString) {
/* 332 */     this.f.println(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(w paramw) {
/* 338 */     this.f.println("#writeGameObject:");
/* 339 */     if (paramw == null) {
/*     */       
/* 341 */       this.f.println(-1);
/*     */     }
/*     */     else {
/*     */       
/* 345 */       this.f.println(paramw.dA);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(w paramw) {
/* 352 */     this.f.println("#writeExistingGameObject:");
/* 353 */     if (paramw != null)
/*     */     {
/* 355 */       if (!paramw.dC) {
/*     */         
/* 357 */         this.f.println(paramw.dA);
/*     */         return;
/*     */       } 
/*     */     }
/* 361 */     this.f.println(-1);
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
/*     */   public strictfp void b(af paramaf) {
/* 401 */     if (paramaf != null)
/*     */     {
/* 403 */       if (!paramaf.dC && !paramaf.bz) {
/*     */         
/* 405 */         a((w)paramaf);
/*     */         return;
/*     */       } 
/*     */     }
/* 409 */     a((w)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(af paramaf) {
/* 415 */     if (paramaf != null)
/*     */     {
/* 417 */       if (!paramaf.dC) {
/*     */         
/* 419 */         a((w)paramaf);
/*     */         return;
/*     */       } 
/*     */     }
/* 423 */     a((w)null);
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
/*     */   public strictfp void a(r paramr) {
/* 437 */     if (paramr != null)
/*     */     {
/* 439 */       if (!paramr.dC) {
/*     */         
/* 441 */         a((w)paramr);
/*     */         return;
/*     */       } 
/*     */     }
/* 445 */     a((w)null);
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
/* 458 */     this.f.println("#PointF:");
/* 459 */     a((paramPointF != null));
/* 460 */     if (paramPointF != null) {
/*     */       
/* 462 */       a(paramPointF.a);
/* 463 */       a(paramPointF.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(Enum paramEnum) {
/* 471 */     if (paramEnum == null) {
/*     */       
/* 473 */       this.f.println("#Enum: null");
/*     */       
/* 475 */       this.f.println(-1);
/*     */     }
/*     */     else {
/*     */       
/* 479 */       this.f.println("#Enum:" + paramEnum.getClass().getSimpleName() + " : " + paramEnum.toString());
/*     */       
/* 481 */       this.f.println(paramEnum.ordinal());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(al paramal) {
/* 489 */     this.f.println("#unitType:");
/* 490 */     if (paramal == null) {
/*     */       
/* 492 */       this.f.println(-1);
/*     */     }
/* 494 */     else if (paramal instanceof l) {
/*     */       
/* 496 */       this.f.println(-2);
/* 497 */       c(((l)paramal).E);
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 502 */       this.f.println(((ak)paramal).ordinal());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(c paramc) {
/* 511 */     if (paramc == null) {
/*     */       
/* 513 */       this.f.println(0);
/*     */     }
/*     */     else {
/*     */       
/* 517 */       this.f.println(paramc.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(m paramm) {
/* 524 */     this.f.println("#team:");
/* 525 */     this.f.println(paramm.i);
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
/*     */   public strictfp void a(File paramFile) {
/* 543 */     FileInputStream fileInputStream = new FileInputStream(paramFile);
/*     */     
/*     */     try {
/* 546 */       a(fileInputStream, (int)paramFile.length());
/*     */     
/*     */     }
/*     */     finally {
/*     */       
/* 551 */       fileInputStream.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(InputStream paramInputStream, int paramInt) {
/* 558 */     int i = 0;
/*     */     
/* 560 */     a(paramInt);
/*     */ 
/*     */     
/* 563 */     byte[] arrayOfByte = new byte[16384];
/*     */     int j;
/* 565 */     while ((j = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length)) != -1) {
/*     */ 
/*     */       
/* 568 */       if (i + j > paramInt) {
/*     */ 
/*     */         
/* 571 */         int k = paramInt - i;
/* 572 */         if (k < 0) {
/*     */           
/* 574 */           ad.f("writeStream: bytesTillFull is " + k);
/*     */           
/*     */           return;
/*     */         } 
/* 578 */         this.f.write(arrayOfByte, 0, k);
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 583 */       this.f.write(arrayOfByte, 0, j);
/*     */       
/* 585 */       i += j;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(ByteArrayOutputStream paramByteArrayOutputStream) {
/* 593 */     a(paramByteArrayOutputStream.size());
/* 594 */     paramByteArrayOutputStream.writeTo(this.f);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(byte[] paramArrayOfbyte) {
/* 600 */     a(paramArrayOfbyte.length);
/* 601 */     this.f.write(paramArrayOfbyte);
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
/*     */   public strictfp void a(short paramShort) {
/* 617 */     this.f.println("#writeShort");
/*     */     
/* 619 */     this.f.println(paramShort);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e() {
/* 625 */     this.f.println("#writeMark:");
/* 626 */     a((short)12345);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void d(String paramString) {
/* 632 */     this.f.println("#writeIfDebugOnly: " + paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean f() {
/* 638 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void e(String paramString) {
/* 644 */     a(paramString, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString, boolean paramBoolean) {
/* 650 */     au au = new au(paramBoolean);
/* 651 */     au.b = paramString;
/* 652 */     this.g.add(au);
/*     */     
/* 654 */     this.f = ((au)this.g.getLast()).d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString) {
/* 660 */     au au = this.g.removeLast();
/* 661 */     if (!au.b.equals(paramString))
/*     */     {
/* 663 */       l.b("OutputNetStream:endBlock", "Name does not match: expected" + paramString + " , got:" + au.b);
/*     */     }
/*     */     
/* 666 */     au.a();
/*     */     
/* 668 */     if (this.g.isEmpty()) {
/*     */       
/* 670 */       this.f = this.e;
/*     */     }
/*     */     else {
/*     */       
/* 674 */       this.f = ((au)this.g.getLast()).d;
/*     */     } 
/*     */     
/* 677 */     String str1 = "";
/* 678 */     String str2 = "";
/*     */     
/* 680 */     for (byte b = 0; b < this.g.size(); b++) {
/*     */       
/* 682 */       str1 = str1 + ">";
/* 683 */       str2 = str2 + "<";
/*     */     } 
/*     */     
/* 686 */     this.f.println(str1 + ">>>> Start of block: " + au.b);
/*     */     
/* 688 */     a(au.c);
/*     */     
/* 690 */     this.f.println(str2 + "<<<< End of block: " + au.b);
/*     */     
/* 692 */     au.b();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
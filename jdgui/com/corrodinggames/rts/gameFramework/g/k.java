/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import android.graphics.PointF;
/*     */ import com.corrodinggames.rts.game.m;
/*     */ import com.corrodinggames.rts.game.units.af;
/*     */ import com.corrodinggames.rts.game.units.al;
/*     */ import com.corrodinggames.rts.game.units.custom.h;
/*     */ import com.corrodinggames.rts.game.units.r;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.m;
/*     */ import com.corrodinggames.rts.gameFramework.w;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class k
/*     */ {
/*     */   ByteArrayInputStream a;
/*     */   private DataInputStream d;
/*     */   private DataInputStream e;
/*  43 */   private LinkedList f = new LinkedList();
/*     */ 
/*     */   
/*  46 */   int b = 999999;
/*  47 */   int c = 999999;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   strictfp void a() {
/*  53 */     this.e = this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp k(ar paramar) {
/*  59 */     this.a = new ByteArrayInputStream(paramar.c);
/*  60 */     this.d = new DataInputStream(this.a);
/*     */     
/*  62 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp k(DataInputStream paramDataInputStream) {
/*  67 */     this.d = paramDataInputStream;
/*     */     
/*  69 */     a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp k(String paramString) {
/*  75 */     this.a = new ByteArrayInputStream(paramString.getBytes());
/*  76 */     this.d = new DataInputStream(this.a);
/*     */     
/*  78 */     a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp k(byte[] paramArrayOfbyte) {
/*  84 */     this.a = new ByteArrayInputStream(paramArrayOfbyte);
/*  85 */     this.d = new DataInputStream(this.a);
/*     */     
/*  87 */     a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(int paramInt) {
/*  93 */     this.b = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp int b() {
/*  98 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void b(int paramInt) {
/* 103 */     this.c = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp int c() {
/* 108 */     return this.c;
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
/*     */   public strictfp byte d() {
/* 153 */     return this.e.readByte();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean e() {
/* 159 */     return this.e.readBoolean();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp int f() {
/* 165 */     return this.e.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp float g() {
/* 171 */     return this.e.readFloat();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp double h() {
/* 177 */     return this.e.readDouble();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp long i() {
/* 184 */     return this.e.readLong();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String j() {
/* 191 */     if (!e())
/*     */     {
/* 193 */       return null;
/*     */     }
/* 195 */     return k();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String k() {
/* 203 */     return this.e.readUTF();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp h l() {
/* 211 */     String str = this.e.readUTF();
/* 212 */     if (str.equals(""))
/*     */     {
/* 214 */       return null;
/*     */     }
/*     */     
/* 217 */     return h.c(str);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp long m() {
/* 223 */     return this.e.readLong();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp w a(Class paramClass) {
/* 231 */     long l = this.e.readLong();
/*     */     
/* 233 */     return w.a(l, paramClass, false);
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
/*     */   public strictfp void a(m paramm, Class paramClass) {
/* 267 */     int i = f();
/* 268 */     for (byte b = 0; b < i; b++) {
/*     */       
/* 270 */       w w = a(paramClass);
/* 271 */       if (w != null)
/*     */       {
/* 273 */         paramm.add(w);
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
/*     */   public strictfp af n() {
/* 288 */     return a(m.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp af a(m paramm) {
/* 293 */     long l = this.e.readLong();
/* 294 */     boolean bool = (paramm == m.a) ? true : false;
/* 295 */     return w.a(l, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp r o() {
/* 304 */     long l = this.e.readLong();
/* 305 */     return w.b(l, false);
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
/*     */   public strictfp Enum b(Class<Object> paramClass) {
/* 321 */     int i = this.e.readInt();
/*     */     
/* 323 */     if (i == -1)
/*     */     {
/* 325 */       return null;
/*     */     }
/*     */     
/* 328 */     Object[] arrayOfObject = paramClass.getEnumConstants();
/*     */     
/* 330 */     if (i < 0 || i >= arrayOfObject.length) {
/*     */       
/* 332 */       ad.f("readEnum:" + i + " is out of range for " + paramClass.toString());
/* 333 */       return null;
/*     */     } 
/*     */     
/* 336 */     return (Enum)arrayOfObject[i];
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
/*     */   public strictfp al p() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield e : Ljava/io/DataInputStream;
/*     */     //   4: invokevirtual readInt : ()I
/*     */     //   7: istore_1
/*     */     //   8: iload_1
/*     */     //   9: iconst_m1
/*     */     //   10: if_icmpne -> 15
/*     */     //   13: aconst_null
/*     */     //   14: areturn
/*     */     //   15: iload_1
/*     */     //   16: bipush #-2
/*     */     //   18: if_icmpne -> 115
/*     */     //   21: aload_0
/*     */     //   22: invokevirtual k : ()Ljava/lang/String;
/*     */     //   25: astore_2
/*     */     //   26: aload_2
/*     */     //   27: invokestatic l : (Ljava/lang/String;)Lcom/corrodinggames/rts/game/units/custom/l;
/*     */     //   30: astore_3
/*     */     //   31: aload_3
/*     */     //   32: ifnonnull -> 57
/*     */     //   35: new java/lang/StringBuilder
/*     */     //   38: dup
/*     */     //   39: invokespecial <init> : ()V
/*     */     //   42: ldc 'readUnitType: Could not find customUnitMetadata:'
/*     */     //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   47: aload_2
/*     */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   51: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   54: invokestatic f : (Ljava/lang/String;)V
/*     */     //   57: aload_3
/*     */     //   58: invokestatic c : (Lcom/corrodinggames/rts/game/units/al;)Lcom/corrodinggames/rts/game/units/al;
/*     */     //   61: astore #4
/*     */     //   63: aload #4
/*     */     //   65: ifnull -> 113
/*     */     //   68: aload #4
/*     */     //   70: instanceof com/corrodinggames/rts/game/units/custom/l
/*     */     //   73: ifeq -> 85
/*     */     //   76: aload #4
/*     */     //   78: checkcast com/corrodinggames/rts/game/units/custom/l
/*     */     //   81: astore_3
/*     */     //   82: goto -> 113
/*     */     //   85: new java/lang/StringBuilder
/*     */     //   88: dup
/*     */     //   89: invokespecial <init> : ()V
/*     */     //   92: ldc 'replacement not a custom unit:'
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   97: aload #4
/*     */     //   99: invokeinterface i : ()Ljava/lang/String;
/*     */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   107: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   110: invokestatic b : (Ljava/lang/String;)V
/*     */     //   113: aload_3
/*     */     //   114: areturn
/*     */     //   115: ldc com/corrodinggames/rts/game/units/ak
/*     */     //   117: invokevirtual getEnumConstants : ()[Ljava/lang/Object;
/*     */     //   120: astore_2
/*     */     //   121: iload_1
/*     */     //   122: iflt -> 131
/*     */     //   125: iload_1
/*     */     //   126: aload_2
/*     */     //   127: arraylength
/*     */     //   128: if_icmplt -> 160
/*     */     //   131: new java/lang/StringBuilder
/*     */     //   134: dup
/*     */     //   135: invokespecial <init> : ()V
/*     */     //   138: ldc 'readUnitType:'
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: iload_1
/*     */     //   144: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   147: ldc ' is out of range for UnitType'
/*     */     //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   152: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   155: invokestatic f : (Ljava/lang/String;)V
/*     */     //   158: aconst_null
/*     */     //   159: areturn
/*     */     //   160: aload_2
/*     */     //   161: iload_1
/*     */     //   162: aaload
/*     */     //   163: checkcast com/corrodinggames/rts/game/units/ak
/*     */     //   166: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #341	-> 0
/*     */     //   #343	-> 8
/*     */     //   #345	-> 13
/*     */     //   #349	-> 15
/*     */     //   #351	-> 21
/*     */     //   #353	-> 26
/*     */     //   #354	-> 31
/*     */     //   #356	-> 35
/*     */     //   #360	-> 57
/*     */     //   #361	-> 63
/*     */     //   #363	-> 68
/*     */     //   #365	-> 76
/*     */     //   #369	-> 85
/*     */     //   #373	-> 113
/*     */     //   #376	-> 115
/*     */     //   #378	-> 121
/*     */     //   #380	-> 131
/*     */     //   #381	-> 158
/*     */     //   #384	-> 160
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
/*     */   public strictfp m q() {
/* 408 */     byte b = this.e.readByte();
/* 409 */     return m.n(b);
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
/*     */   public strictfp byte[] r() {
/* 450 */     int i = 0;
/* 451 */     int j = f();
/* 452 */     byte[] arrayOfByte = new byte[j];
/*     */     
/* 454 */     while (i < j) {
/*     */       
/* 456 */       int m = this.e.read(arrayOfByte, i, j - i);
/* 457 */       if (m == -1) {
/*     */         break;
/*     */       }
/*     */       
/* 461 */       i += m;
/*     */     } 
/*     */     
/* 464 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp k s() {
/* 470 */     byte[] arrayOfByte = r();
/*     */     
/* 472 */     return new k(arrayOfByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp short t() {
/* 480 */     return this.e.readShort();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString) {
/* 486 */     short s = t();
/*     */     
/* 488 */     if (s != 12345)
/*     */     {
/* 490 */       ad.f("Mark wasn't read for:" + paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp InputStream u() {
/* 499 */     return this.e;
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
/*     */   public strictfp void b(String paramString) {
/* 571 */     a(paramString, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp String v() {
/* 576 */     return a(false, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString, boolean paramBoolean) {
/* 581 */     a(paramString, paramBoolean, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/* 586 */     if (this.b < 11) {
/*     */       
/* 588 */       l.d("Skipping start block:" + paramString);
/*     */       
/*     */       return;
/*     */     } 
/* 592 */     String str = a(paramBoolean1, paramBoolean2);
/* 593 */     if (!str.equals(paramString))
/*     */     {
/* 595 */       l.b("InputNetStream:endBlock", "Name does not match: expected:" + paramString + " , got:" + str);
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
/*     */   public strictfp byte[] c(String paramString) {
/* 618 */     String str = this.e.readUTF();
/*     */ 
/*     */     
/* 621 */     if (!str.equals(paramString))
/*     */     {
/* 623 */       l.b("getBlockRaw", "Name does not match: expected:" + paramString + " , got:" + str);
/*     */     }
/*     */     
/* 626 */     return r();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a(boolean paramBoolean1, boolean paramBoolean2) {
/* 636 */     if (this.b < 11) {
/*     */       
/* 638 */       l.d("Skipping start block: startBlockAndGetName()");
/* 639 */       return "<skipped>";
/*     */     } 
/* 641 */     String str = this.e.readUTF();
/*     */     
/* 643 */     byte[] arrayOfByte = r();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 653 */     l l = new l(arrayOfByte, paramBoolean1, paramBoolean2);
/* 654 */     l.a = str;
/* 655 */     this.f.add(l);
/* 656 */     this.e = ((l)this.f.getLast()).c;
/*     */     
/* 658 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public strictfp void d(String paramString) {
/* 663 */     if (this.b < 11) {
/*     */       
/* 665 */       l.d("Skipping end block:" + paramString);
/*     */       return;
/*     */     } 
/* 668 */     l l = this.f.removeLast();
/* 669 */     if (!l.a.equals(paramString))
/*     */     {
/* 671 */       l.b("InputNetStream:endBlock", "Name does not match: expected" + paramString + " ," + l.a);
/*     */     }
/* 673 */     if (this.f.isEmpty()) {
/*     */       
/* 675 */       this.e = this.d;
/*     */     }
/*     */     else {
/*     */       
/* 679 */       this.e = ((l)this.f.getLast()).c;
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
/*     */   public strictfp PointF w() {
/* 691 */     if (!e())
/*     */     {
/* 693 */       return null;
/*     */     }
/* 695 */     PointF pointF = new PointF();
/* 696 */     pointF.a = g();
/* 697 */     pointF.b = g();
/* 698 */     return pointF;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
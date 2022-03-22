/*     */ package com.corrodinggames.rts.b.a;
/*     */ 
/*     */ import com.corrodinggames.rts.game.units.custom.at;
/*     */ import com.corrodinggames.rts.game.units.custom.e.b;
/*     */ import com.corrodinggames.rts.game.units.custom.l;
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Random;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends h
/*     */ {
/*  26 */   int a = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*     */     ab ab;
/*  33 */     l.d("separator regex test");
/*  34 */     "first".split(Pattern.quote(File.separator));
/*  35 */     i.a("first\\second".split(Pattern.quote("\\"))[0], "first");
/*  36 */     i.a("first/second".split(Pattern.quote("/"))[0], "first");
/*     */ 
/*     */     
/*  39 */     l.d("Test for dis sq ranges");
/*     */     
/*  41 */     int i = 850000;
/*  42 */     int j = 8500000;
/*     */     
/*  44 */     i.a((50 < i * i));
/*  45 */     i.a((50.0F < (i * i)));
/*     */     
/*  47 */     i.a((50 < j * j));
/*  48 */     i.a((50.0F < (j * j)));
/*     */ 
/*     */     
/*  51 */     Random random = new Random();
/*  52 */     float[] arrayOfFloat = new float[10000];
/*     */ 
/*     */     
/*  55 */     for (byte b = 1; b < 5; b++) {
/*     */       
/*  57 */       int k = 0;
/*     */       
/*  59 */       for (byte b2 = 0; b2 < arrayOfFloat.length; b2++)
/*     */       {
/*  61 */         arrayOfFloat[b2] = random.nextFloat() * 50.0F;
/*     */       }
/*     */       
/*  64 */       long l1 = bj.a();
/*     */       byte b3;
/*  66 */       for (b3 = 0; b3 < 'Ϩ'; b3++) {
/*     */         
/*  68 */         for (byte b4 = 0; b4 < arrayOfFloat.length; b4++)
/*     */         {
/*  70 */           k += f.a((int)arrayOfFloat[b4]);
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/*  75 */       l.d("sum:" + k);
/*  76 */       l.d("fastSquareRootInt took:" + bj.a(bj.a(l1)));
/*     */ 
/*     */ 
/*     */       
/*  80 */       for (b3 = 0; b3 < arrayOfFloat.length; b3++)
/*     */       {
/*  82 */         arrayOfFloat[b3] = random.nextFloat() * 50.0F;
/*     */       }
/*     */       
/*  85 */       l1 = bj.a();
/*     */       
/*  87 */       k = 0;
/*  88 */       for (b3 = 0; b3 < 'Ϩ'; b3++) {
/*     */         
/*  90 */         for (byte b4 = 0; b4 < arrayOfFloat.length; b4++)
/*     */         {
/*  92 */           k = (int)(k + f.a((int)arrayOfFloat[b4]));
/*     */         }
/*     */       } 
/*     */       
/*  96 */       l.d("sum:" + k);
/*  97 */       l.d("squareRoot took:" + bj.a(bj.a(l1)));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     l.d("CommonUtils.fastSplit");
/*     */ 
/*     */     
/* 110 */     String[] arrayOfString = f.b("testA|testB", '|');
/* 111 */     i.a(arrayOfString.length, 2);
/* 112 */     i.a(arrayOfString[0], "testA");
/* 113 */     i.a(arrayOfString[1], "testB");
/*     */ 
/*     */     
/* 116 */     arrayOfString = f.b("test|", '|');
/* 117 */     i.a(arrayOfString.length, ("test|".split("\\|")).length);
/* 118 */     i.a(arrayOfString[0], "test");
/*     */     
/* 120 */     arrayOfString = f.b("|test", '|');
/* 121 */     i.a(arrayOfString.length, 2);
/* 122 */     i.a(arrayOfString[0], "");
/* 123 */     i.a(arrayOfString[1], "test");
/*     */     
/* 125 */     arrayOfString = f.b("|", '|');
/* 126 */     i.a(arrayOfString.length, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     l.d("VariableReplacement");
/*     */     
/* 135 */     b b1 = new b();
/*     */     
/* 137 */     b1.b.a("a", "5");
/* 138 */     b1.b.a("b", "10");
/* 139 */     b1.b.a("abc_foo", "7");
/*     */ 
/*     */     
/* 142 */     l l = l.b;
/*     */ 
/*     */     
/*     */     try {
/* 146 */       ab = new ab("assets/" + l.x);
/*     */     }
/* 148 */     catch (IOException iOException) {
/*     */       
/* 150 */       throw new RuntimeException(iOException);
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
/*     */     try {
/* 162 */       String str = b1.a(l, ab, "core", "123");
/* 163 */       i.a(str, "123");
/*     */       
/* 165 */       str = b1.a(l, ab, "core", "1+1");
/* 166 */       i.a(str, "2");
/*     */       
/* 168 */       str = b1.a(l, ab, "core", "(1+1)*2");
/* 169 */       i.a(str, "4");
/*     */       
/* 171 */       str = b1.a(l, ab, "core", "a+b");
/* 172 */       i.a(str, "15");
/*     */       
/* 174 */       str = b1.a(l, ab, "core", "a+a+abc_foo");
/* 175 */       i.a(str, "17");
/*     */       
/* 177 */       str = b1.a(l, ab, "core", "(2+2)*(2+2)");
/* 178 */       i.a(str, "16");
/*     */       
/* 180 */       str = b1.a(l, ab, "core", "10/5");
/* 181 */       i.a(str, "2");
/*     */       
/* 183 */       str = b1.a(l, ab, "core", "10-5");
/* 184 */       i.a(str, "5");
/*     */       
/* 186 */       str = b1.a(l, ab, "core", "cos(60)");
/* 187 */       i.b(str, "0.5");
/*     */       
/* 189 */       str = b1.a(l, ab, "core", "sin(b+20+(2-2)+(5*0))");
/* 190 */       i.b(str, "0.5");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 195 */     catch (at at) {
/*     */       
/* 197 */       throw new RuntimeException(at);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 203 */     l.d("PassthroughZipReader");
/*     */     
/* 205 */     i.a(ae.g("/first/second/zip.rwmod/test1/test2"), "test1/test2");
/* 206 */     i.a(ae.g("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\b\a\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
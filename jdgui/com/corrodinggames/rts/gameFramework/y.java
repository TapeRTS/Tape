/*      */ package com.corrodinggames.rts.gameFramework;
/*      */ 
/*      */ import com.corrodinggames.rts.game.a.a;
/*      */ import com.corrodinggames.rts.game.c;
/*      */ import com.corrodinggames.rts.game.e;
/*      */ import com.corrodinggames.rts.game.f;
/*      */ import com.corrodinggames.rts.game.k;
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ak;
/*      */ import com.corrodinggames.rts.game.units.al;
/*      */ import com.corrodinggames.rts.game.units.custom.ac;
/*      */ import com.corrodinggames.rts.game.units.custom.ai;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.h;
/*      */ import com.corrodinggames.rts.gameFramework.b.f;
/*      */ import com.corrodinggames.rts.gameFramework.c.a;
/*      */ import com.corrodinggames.rts.gameFramework.g.ad;
/*      */ import com.corrodinggames.rts.gameFramework.g.ap;
/*      */ import com.corrodinggames.rts.gameFramework.g.at;
/*      */ import com.corrodinggames.rts.gameFramework.g.k;
/*      */ import com.corrodinggames.rts.gameFramework.k.f;
/*      */ import com.corrodinggames.rts.gameFramework.utility.o;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.BufferedOutputStream;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.PrintStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class y
/*      */ {
/*   47 */   String a = "saves/";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean b = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final boolean c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp File a(String paramString, boolean paramBoolean) {
/*  233 */     return a(paramString, this.a, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp String a(String paramString1, String paramString2) {
/*  247 */     String str = null;
/*  248 */     if (l.aF) {
/*      */       
/*  250 */       str = a.b() + paramString2 + paramString1;
/*      */     }
/*      */     else {
/*      */       
/*  254 */       str = a.b() + paramString2 + paramString1;
/*      */     } 
/*      */ 
/*      */     
/*  258 */     return str;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp File a(String paramString1, String paramString2, boolean paramBoolean) {
/*  266 */     String str = a(paramString1, paramString2);
/*      */     
/*  268 */     File file = new File(str);
/*  269 */     if (paramBoolean) {
/*      */       
/*  271 */       File file1 = file.getParentFile();
/*      */       
/*  273 */       file1.mkdirs();
/*      */       
/*  275 */       if (!file1.isDirectory())
/*      */       {
/*  277 */         l.b("getRWFile: Could not create parent directory");
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  289 */     return file;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(String paramString) {
/*  342 */     l l = l.u();
/*      */ 
/*      */ 
/*      */     
/*  346 */     String str = "SD card";
/*      */     
/*  348 */     File file = null;
/*      */ 
/*      */     
/*      */     try {
/*  352 */       file = a(paramString + ".tmp", true);
/*  353 */       if (file.exists())
/*      */       {
/*  355 */         file = a(paramString + ".tmp2", true);
/*      */       }
/*      */       
/*  358 */       File file1 = a(paramString, true);
/*      */       
/*  360 */       str = file1.getAbsolutePath();
/*      */ 
/*      */       
/*  363 */       l.d("Saving game to: " + str);
/*      */ 
/*      */       
/*  366 */       FileOutputStream fileOutputStream = new FileOutputStream(file);
/*  367 */       BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
/*      */       
/*  369 */       if (!b) {
/*      */         
/*  371 */         DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
/*  372 */         ap ap = new ap(dataOutputStream);
/*      */ 
/*      */         
/*      */         try {
/*  376 */           a(ap);
/*      */         }
/*      */         finally {
/*      */           
/*  380 */           dataOutputStream.close();
/*  381 */           bufferedOutputStream.close();
/*  382 */           fileOutputStream.close();
/*      */         
/*      */         }
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  389 */         PrintStream printStream = new PrintStream(bufferedOutputStream);
/*  390 */         at at = new at(printStream);
/*      */ 
/*      */         
/*      */         try {
/*  394 */           a((ap)at);
/*      */         }
/*      */         finally {
/*      */           
/*  398 */           printStream.close();
/*  399 */           bufferedOutputStream.close();
/*  400 */           fileOutputStream.close();
/*      */         } 
/*      */         
/*  403 */         l.m("DEBUG plain text save created");
/*      */       } 
/*      */ 
/*      */       
/*  407 */       l.d("Finished writing save, renaming to final filename");
/*  408 */       file.renameTo(file1);
/*      */ 
/*      */     
/*      */     }
/*  412 */     catch (Exception exception) {
/*      */ 
/*      */       
/*  415 */       exception.printStackTrace();
/*      */       
/*  417 */       String str1 = f.b(exception);
/*      */       
/*  419 */       String str2 = "Error saving game to " + str + ", please check permissions, disk space, etc. (" + str1 + ")";
/*  420 */       l.a(str2, 1);
/*      */       
/*  422 */       if (file != null && file.exists())
/*      */       {
/*  424 */         l.d("saveGame: Removing temp save file after crash");
/*  425 */         file.delete();
/*      */       }
/*      */     
/*      */     }
/*  429 */     catch (OutOfMemoryError outOfMemoryError) {
/*      */ 
/*      */       
/*  432 */       outOfMemoryError.printStackTrace();
/*  433 */       String str1 = "Error. Run out of memory error while saving game to " + str + ".";
/*  434 */       l.a(str1, 1);
/*      */       
/*  436 */       if (file != null && file.exists()) {
/*      */         
/*  438 */         l.d("saveGame: Removing temp save file after crash");
/*  439 */         file.delete();
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  445 */     l.bA.e.a(null, "Game saved");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(ap paramap) {
/*  454 */     l l = l.u();
/*      */ 
/*      */     
/*  457 */     long l1 = System.currentTimeMillis();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  465 */     l.b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - l1));
/*      */ 
/*      */     
/*  468 */     long l2 = System.currentTimeMillis();
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  473 */       paramap.c("rustedWarfareSave");
/*      */       
/*  475 */       int i = l.c(true);
/*      */       
/*  477 */       paramap.a(i);
/*      */       
/*  479 */       paramap.a(90);
/*      */       
/*  481 */       paramap.a(l.am);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  486 */       paramap.a("saveCompression", true);
/*      */ 
/*      */ 
/*      */       
/*  490 */       paramap.e("customUnitsBlock");
/*      */       
/*  492 */       l.a(paramap);
/*      */       
/*  494 */       paramap.a("customUnitsBlock");
/*      */ 
/*      */ 
/*      */       
/*  498 */       paramap.e("gameSetup");
/*  499 */       paramap.a(l.bF.z);
/*      */       
/*  501 */       if (l.bF.z)
/*      */       {
/*  503 */         l.bF.a(paramap);
/*      */       }
/*      */       
/*  506 */       paramap.a("gameSetup");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  512 */       paramap.c(l.cS);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  517 */       boolean bool = (l.cT != null) ? true : false;
/*      */       
/*  519 */       paramap.a(bool);
/*      */       
/*  521 */       if (bool) {
/*      */         
/*  523 */         l.d("Writing remote map steam into save");
/*  524 */         paramap.a(l.cT);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  532 */       paramap.a(l.bh);
/*      */       
/*  534 */       paramap.a(l.cf + l.cp);
/*  535 */       paramap.a(l.cg + l.cq);
/*      */       
/*  537 */       paramap.a(l.cC);
/*      */ 
/*      */ 
/*      */       
/*  541 */       paramap.a(l.bD.a);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  546 */       paramap.a(0);
/*      */ 
/*      */ 
/*      */       
/*  550 */       paramap.e();
/*      */ 
/*      */ 
/*      */       
/*  554 */       l.bt.a(paramap);
/*      */ 
/*      */ 
/*      */       
/*  558 */       paramap.a(l.be);
/*      */       
/*  560 */       paramap.a(l.bt.A);
/*  561 */       paramap.a(l.bt.B);
/*  562 */       paramap.a(l.bt.C);
/*      */ 
/*      */       
/*  565 */       paramap.a((l.bM != null));
/*  566 */       if (l.bM != null)
/*      */       {
/*  568 */         l.bM.a(paramap);
/*      */       }
/*      */ 
/*      */       
/*  572 */       paramap.e();
/*      */ 
/*      */       
/*  575 */       int j = -1;
/*  576 */       if (l.bb != null)
/*      */       {
/*  578 */         j = l.bb.i;
/*      */       }
/*  580 */       paramap.a(j);
/*      */ 
/*      */       
/*  583 */       paramap.a(m.a);
/*      */       byte b;
/*  585 */       for (b = 0; b < m.a; b++) {
/*      */         
/*  587 */         m m = m.n(b);
/*      */         
/*  589 */         paramap.a(m instanceof a);
/*      */         
/*  591 */         paramap.a(m instanceof c);
/*      */         
/*  593 */         paramap.a((m != null));
/*      */         
/*  595 */         if (m != null)
/*      */         {
/*  597 */           m.b(paramap);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  603 */       if (!l.bA.b)
/*      */       {
/*  605 */         l.bA.h();
/*      */       }
/*      */       
/*  608 */       paramap.d("Section: unit shells");
/*      */       
/*  610 */       paramap.a(w.dK.size());
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  615 */       for (w w : w.dK) {
/*      */         
/*  617 */         if (w == null)
/*      */         {
/*  619 */           throw new RuntimeException("Found null in fastGameObjectList");
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  628 */         if (w instanceof af) {
/*      */           
/*  630 */           af af = (af)w;
/*      */           
/*  632 */           if (af.r() instanceof ak)
/*      */           {
/*  634 */             paramap.c(1);
/*  635 */             paramap.a((Enum)af.r());
/*      */           }
/*  637 */           else if (af.r() instanceof l)
/*      */           {
/*  639 */             paramap.c(3);
/*  640 */             paramap.c(((l)af.r()).E);
/*      */           }
/*      */           else
/*      */           {
/*  644 */             throw new IOException("Unhandled getUnitType on save:" + af.r().getClass().toString());
/*      */           }
/*      */         
/*      */         } else {
/*      */           
/*  649 */           paramap.c(2);
/*      */           
/*  651 */           if (w instanceof k) {
/*      */             
/*  653 */             paramap.c(1);
/*      */           }
/*  655 */           else if (w instanceof f) {
/*      */             
/*  657 */             paramap.c(2);
/*      */           }
/*  659 */           else if (w instanceof f) {
/*      */             
/*  661 */             paramap.c(3);
/*      */           }
/*      */           else {
/*      */             
/*  665 */             String str = null;
/*  666 */             if (w.getClass() != null)
/*      */             {
/*  668 */               str = w.getClass().toString();
/*      */             }
/*  670 */             throw new IOException("Unhandled class on save: " + str);
/*      */           } 
/*      */         } 
/*      */         
/*  674 */         paramap.a(w.dA);
/*      */       } 
/*      */       
/*  677 */       paramap.d("Section: CurrentUnitId");
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  682 */       paramap.a(l.bF.u());
/*      */ 
/*      */ 
/*      */       
/*  686 */       l.bD.a(paramap);
/*      */ 
/*      */ 
/*      */       
/*  690 */       l.bA.a(paramap);
/*      */ 
/*      */       
/*  693 */       l.bG.a(paramap);
/*      */ 
/*      */       
/*  696 */       for (b = 0; b < m.a; b++) {
/*      */         
/*  698 */         m m = m.n(b);
/*      */         
/*  700 */         if (m != null)
/*      */         {
/*  702 */           m.a(paramap);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  708 */       paramap.e();
/*      */       
/*  710 */       for (w w : w.dK) {
/*      */ 
/*      */         
/*  713 */         if (paramap.f()) {
/*      */           
/*  715 */           String str = w.getClass().getSimpleName();
/*  716 */           if (w instanceof af)
/*      */           {
/*  718 */             str = ((af)w).r().i();
/*      */           }
/*  720 */           paramap.d("Saving unit:" + str + " (id" + w.dA + ")");
/*      */         } 
/*      */ 
/*      */         
/*  724 */         w.a(paramap);
/*      */         
/*  726 */         paramap.e();
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  732 */       paramap.a("saveCompression");
/*      */ 
/*      */       
/*  735 */       paramap.e();
/*  736 */       paramap.c("<SAVE END>");
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  741 */     catch (Exception exception) {
/*      */ 
/*      */       
/*  744 */       exception.printStackTrace();
/*  745 */       l.a("Error saving game to SD card, please email the logs.", 1);
/*      */     } 
/*      */ 
/*      */     
/*  749 */     l.b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - l2));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp String b(String paramString) {
/*  756 */     if (paramString == null)
/*      */     {
/*  758 */       return null;
/*      */     }
/*      */     
/*  761 */     if (paramString.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx")) return "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx"; 
/*  762 */     if (paramString.equals("maps/normal/l030;mission_3__-__Crossfire.tmx")) return "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx";
/*      */     
/*  764 */     return paramString;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp y() {
/*  771 */     if (!l.an); this.c = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp boolean b(String paramString, boolean paramBoolean) {
/*  778 */     l l = l.u();
/*      */ 
/*      */     
/*      */     try {
/*  782 */       File file = a(paramString, false);
/*      */       
/*  784 */       if (file.isDirectory()) {
/*      */         
/*  786 */         l.a("Could not load, is a directory", 1);
/*  787 */         return false;
/*      */       } 
/*      */       
/*  790 */       FileInputStream fileInputStream = new FileInputStream(file);
/*      */       
/*  792 */       BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
/*      */       
/*  794 */       DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
/*      */       
/*  796 */       k k = new k(dataInputStream);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/*  803 */         return a(k, paramBoolean, false, false);
/*      */       
/*      */       }
/*      */       finally {
/*      */         
/*  808 */         dataInputStream.close();
/*  809 */         bufferedInputStream.close();
/*      */         
/*  811 */         fileInputStream.close();
/*      */       }
/*      */     
/*      */     }
/*  815 */     catch (Exception exception) {
/*      */       
/*  817 */       throw new RuntimeException(exception);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(String paramString, ap paramap) {
/*      */     try {
/*  826 */       File file = a(paramString, false);
/*      */       
/*  828 */       paramap.a(file);
/*      */     
/*      */     }
/*  831 */     catch (IOException iOException) {
/*      */       
/*  833 */       throw new RuntimeException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized strictfp boolean a(k paramk, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*  842 */     l l = l.u();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  848 */       bj bj = l.bL;
/*      */       
/*  850 */       if (this.c)
/*      */       {
/*  852 */         bj.a(bk.y);
/*      */       }
/*      */ 
/*      */       
/*  856 */       ArrayList<Long> arrayList = null;
/*  857 */       if (paramBoolean3) {
/*      */         
/*  859 */         arrayList = new ArrayList();
/*      */         
/*  861 */         for (af af : l.bA.bF)
/*      */         {
/*  863 */           arrayList.add(Long.valueOf(af.dA));
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  870 */       String str = paramk.k();
/*      */       
/*  872 */       if (!str.equals("rustedWarfareSave")) {
/*      */ 
/*      */ 
/*      */         
/*  876 */         l.b("Map Load: Header is not correct:" + str.substring(0, Math.min(str.length(), 50)));
/*      */         
/*  878 */         String str1 = "Failed to load save. (Could not find correct header)";
/*      */         
/*  880 */         if (str.equals("rustedWarfareReplay"))
/*      */         {
/*  882 */           str1 = "Failed to load save. (This file appears to be a replay file, not a save file)";
/*      */         }
/*      */         
/*  885 */         l.b(str1);
/*      */         
/*  887 */         l.a(str1, 1);
/*  888 */         return false;
/*      */       } 
/*      */ 
/*      */       
/*  892 */       paramk.f();
/*      */       
/*  894 */       int i = paramk.f();
/*      */ 
/*      */ 
/*      */       
/*  898 */       l.b("gameSaver", "Loading save from version: " + i);
/*      */ 
/*      */       
/*  901 */       paramk.a(i);
/*      */       
/*  903 */       if (i > 90) {
/*      */         
/*  905 */         l.a("Cannot load: This save was made with a newer game", 1);
/*  906 */         return false;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  911 */       if (i >= 5)
/*      */       {
/*  913 */         paramk.e();
/*      */       }
/*      */ 
/*      */       
/*  917 */       if (i >= 23) {
/*      */ 
/*      */         
/*  920 */         bj.a(bk.B);
/*      */         
/*  922 */         paramk.a("saveCompression", true);
/*      */         
/*  924 */         bj.b(bk.B);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  929 */       if (i >= 54) {
/*      */         
/*  931 */         paramk.b("customUnitsBlock");
/*  932 */         if (l.bJ.h() && !paramBoolean3) {
/*      */           
/*  934 */           l.d("Loading mods from replay");
/*      */ 
/*      */           
/*      */           try {
/*  938 */             l.a(paramk);
/*  939 */             ac.c();
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*  944 */           catch (ai ai) {
/*      */ 
/*      */             
/*  947 */             l.d("Replay load: Missing unit:" + ai.getMessage() + " d:" + ai.a);
/*      */ 
/*      */             
/*  950 */             l.h(ai.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
/*      */             
/*  952 */             ac.b(true);
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  960 */         paramk.d("customUnitsBlock");
/*      */       } 
/*      */       
/*  963 */       Integer integer1 = null;
/*  964 */       Integer integer2 = null;
/*      */ 
/*      */       
/*  967 */       if (l.bJ.h() && paramBoolean3) {
/*      */         
/*  969 */         integer1 = Integer.valueOf(l.bk);
/*  970 */         integer2 = Integer.valueOf(l.bl);
/*      */       } 
/*      */       
/*  973 */       if (i >= 56) {
/*      */         
/*  975 */         paramk.b("gameSetup");
/*  976 */         boolean bool1 = paramk.e();
/*      */         
/*  978 */         if (l.bJ.h() && !paramBoolean3)
/*      */         {
/*  980 */           if (bool1) {
/*      */             
/*  982 */             l.bJ.M = true;
/*      */             
/*  984 */             l.bF.a(paramk);
/*      */             
/*  986 */             integer1 = Integer.valueOf(l.bk);
/*  987 */             integer2 = Integer.valueOf(l.bl);
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/*  992 */         paramk.d("gameSetup");
/*      */       } 
/*      */       
/*  995 */       l.cT = null;
/*      */       
/*  997 */       l.cS = b(paramk.k());
/*      */       
/*  999 */       boolean bool = false;
/*      */       
/* 1001 */       if (i >= 72) {
/*      */ 
/*      */         
/* 1004 */         bool = paramk.e();
/*      */         
/* 1006 */         if (bool) {
/*      */           
/* 1008 */           l.d("Reading remote map stream");
/* 1009 */           l.cT = paramk.s();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1020 */       if (l.bF.z && !l.bF.A && paramBoolean3)
/*      */       {
/* 1022 */         if (l.bF.aK != null && !bool) {
/*      */           
/* 1024 */           l.cS = "";
/* 1025 */           l.cT = l.bF.aK;
/*      */         } 
/*      */       }
/*      */       
/* 1029 */       bj.a(bk.z);
/*      */       
/* 1031 */       if (paramBoolean3) {
/*      */         
/* 1033 */         l.a(true, true, s.c);
/*      */ 
/*      */         
/* 1036 */         if (l.aj())
/*      */         {
/*      */ 
/*      */           
/* 1040 */           l.dc = true;
/*      */         
/*      */         }
/*      */       }
/*      */       else {
/*      */         
/* 1046 */         l.a(true, s.c);
/*      */       } 
/*      */       
/* 1049 */       if (!l.bt.P) {
/*      */         
/* 1051 */         l.d("Not loading save because map failed to load");
/*      */         
/* 1053 */         return false;
/*      */       } 
/*      */       
/* 1056 */       if (integer1 != null)
/*      */       {
/* 1058 */         l.bk = integer1.intValue();
/*      */       }
/* 1060 */       if (integer2 != null)
/*      */       {
/* 1062 */         integer2 = Integer.valueOf(l.bl);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1067 */       synchronized (l)
/*      */       {
/*      */ 
/*      */         
/* 1071 */         bj.b(bk.z);
/*      */ 
/*      */ 
/*      */         
/* 1075 */         l.bh = paramk.f();
/*      */         
/* 1077 */         float f1 = paramk.g();
/* 1078 */         float f2 = paramk.g();
/* 1079 */         float f3 = paramk.g();
/*      */         
/* 1081 */         if (!paramBoolean3) {
/*      */           
/* 1083 */           l.b(f1, f2);
/* 1084 */           l.cC = f3;
/*      */         } 
/*      */ 
/*      */         
/* 1088 */         if (i >= 18)
/*      */         {
/*      */           
/* 1091 */           l.bD.a = paramk.f();
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1097 */         paramk.f();
/*      */ 
/*      */         
/* 1100 */         if (i >= 19)
/*      */         {
/* 1102 */           paramk.a("end of setup");
/*      */         }
/*      */ 
/*      */         
/* 1106 */         l.bt.a(paramk);
/*      */         
/* 1108 */         if (i >= 86) {
/*      */           
/* 1110 */           boolean bool4 = paramk.e();
/*      */ 
/*      */ 
/*      */           
/* 1114 */           boolean bool5 = paramk.e();
/* 1115 */           boolean bool6 = paramk.e();
/* 1116 */           boolean bool7 = paramk.e();
/*      */           
/* 1118 */           if (!paramBoolean1 && !bool4) {
/*      */             
/* 1120 */             l.bt.A = bool5;
/* 1121 */             l.bt.B = bool6;
/* 1122 */             l.bt.C = bool7;
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 1127 */         boolean bool1 = paramk.e();
/* 1128 */         if (bool1) {
/*      */           
/* 1130 */           if (l.bM == null) {
/*      */             
/* 1132 */             l.b("gameSaver", "making new mission engine on load, this shouldn't happen");
/* 1133 */             l.bM = new f();
/* 1134 */             l.bM.a(false);
/*      */           } 
/* 1136 */           l.bM.a(paramk);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1141 */         if (i >= 19)
/*      */         {
/* 1143 */           paramk.a("start of teams");
/*      */         }
/*      */         
/* 1146 */         l.b("gameSaver", "loading teams");
/*      */ 
/*      */         
/* 1149 */         m[] arrayOfM = new m[m.c];
/*      */ 
/*      */         
/* 1152 */         int j = -1;
/* 1153 */         if (i >= 36)
/*      */         {
/* 1155 */           j = paramk.f();
/*      */         }
/*      */         
/* 1158 */         int m = 8;
/* 1159 */         if (i >= 49) {
/*      */           
/* 1161 */           m = paramk.f();
/*      */ 
/*      */ 
/*      */           
/* 1165 */           m.b(m, false);
/*      */           
/* 1167 */           for (byte b = 0; b < m.a; b++) {
/*      */             
/* 1169 */             if (b >= m)
/*      */             {
/* 1171 */               if (!paramBoolean1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1180 */                 m m1 = m.n(b);
/* 1181 */                 if (m1 != null)
/*      */                 {
/* 1183 */                   m1.E();
/*      */                 }
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */         
/*      */         byte b1;
/* 1191 */         for (b1 = 0; b1 < m; b1++) {
/*      */           
/* 1193 */           m m1 = m.n(b1);
/*      */           
/* 1195 */           boolean bool4 = paramk.e();
/*      */           
/* 1197 */           boolean bool5 = false;
/* 1198 */           if (i >= 7)
/*      */           {
/* 1200 */             bool5 = paramk.e();
/*      */           }
/*      */ 
/*      */           
/* 1204 */           boolean bool6 = paramk.e();
/*      */           
/* 1206 */           if (bool6) {
/*      */             a a;
/*      */             
/*      */             e e;
/*      */             
/* 1211 */             if (bool4) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1230 */               if (m1 == null || !(m1 instanceof a))
/*      */               {
/* 1232 */                 if (paramBoolean1 && !paramBoolean3 && m1 != null) {
/*      */                   
/* 1234 */                   l.b("Would replace team:" + b1 + " with AI, writing to dummy AI");
/*      */                   
/* 1236 */                   a = new a(b1, false);
/*      */                   
/* 1238 */                   arrayOfM[b1] = (m)a;
/*      */                 }
/*      */                 else {
/*      */                   
/* 1242 */                   if (paramBoolean3)
/*      */                   {
/* 1244 */                     l.b("Adding new AI " + b1 + " on resync");
/*      */                   }
/*      */ 
/*      */                   
/* 1248 */                   a = new a(b1);
/*      */                 } 
/*      */               }
/*      */             } else {
/*      */               c c;
/*      */               
/* 1254 */               if (bool5) {
/*      */                 
/* 1256 */                 if (a == null || !(a instanceof c))
/*      */                 {
/* 1258 */                   if (paramBoolean1)
/*      */                   {
/* 1260 */                     l.b("Replacing team:" + b1 + " with NetworkedPlayer");
/*      */                   }
/* 1262 */                   c = new c(b1);
/*      */ 
/*      */                 
/*      */                 }
/*      */ 
/*      */               
/*      */               }
/* 1269 */               else if (c == null || !(c instanceof e)) {
/*      */                 
/* 1271 */                 if (paramBoolean1) {
/*      */                   
/* 1273 */                   l.b("Replacing team:" + b1 + " with Player");
/* 1274 */                   if (c != null)
/*      */                   {
/* 1276 */                     c.c("Existing");
/*      */                   }
/*      */                 } 
/*      */                 
/* 1280 */                 e = new e(b1);
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1290 */             if (i >= 2) {
/*      */               
/* 1292 */               e.b(paramk);
/*      */             
/*      */             }
/*      */             else {
/*      */               
/* 1297 */               e.c(paramk);
/*      */             } 
/*      */ 
/*      */             
/* 1301 */             if (!paramBoolean3)
/*      */             {
/* 1303 */               e.g();
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 1313 */           else if (paramBoolean1 && !l.bJ.h()) {
/*      */             
/* 1315 */             l.b("GameSaver: Would normally remove team:" + b1 + "");
/*      */             
/* 1317 */             arrayOfM[b1] = m.e;
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 1322 */             m m2 = m.n(b1);
/* 1323 */             if (m2 != null)
/*      */             {
/* 1325 */               m2.E();
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1338 */         b1 = 0;
/*      */ 
/*      */ 
/*      */         
/* 1342 */         l.bF.ah();
/*      */ 
/*      */         
/* 1345 */         if (l.bJ.h()) {
/*      */           
/* 1347 */           l.bb = m.g;
/*      */         }
/* 1349 */         else if (l.bF.z) {
/*      */ 
/*      */           
/* 1352 */           if (l.bF.x != null)
/*      */           {
/*      */             
/* 1355 */             int i1 = l.bF.x.i;
/*      */             
/* 1357 */             if (i1 != -3)
/*      */             {
/* 1359 */               m m1 = m.n(i1);
/*      */               
/* 1361 */               if (m1 == null)
/*      */               {
/* 1363 */                 throw new RuntimeException("GameSaver: Cannot relink player team: " + i1);
/*      */               }
/*      */ 
/*      */               
/* 1367 */               l.bb = m1;
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1379 */         else if (j != -1 && j != -3) {
/*      */           
/* 1381 */           l.bb = m.n(j);
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1386 */           for (byte b = 0; b < m.a; b++) {
/*      */             
/* 1388 */             if (m.n(b) instanceof e)
/*      */             {
/* 1390 */               l.bb = m.n(b);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1402 */         o o1 = w.dp();
/* 1403 */         for (w w : o1)
/*      */         {
/* 1405 */           w.a();
/*      */         }
/*      */ 
/*      */         
/* 1409 */         boolean bool2 = false;
/*      */         
/* 1411 */         int n = paramk.f();
/*      */         byte b2;
/* 1413 */         for (b2 = 0; b2 < n; b2++) {
/*      */           f f;
/* 1415 */           h h = null;
/*      */           
/* 1417 */           byte b = paramk.d();
/*      */           
/* 1419 */           if (b == 1) {
/*      */             
/* 1421 */             ak ak = (ak)paramk.b(ak.class);
/*      */             
/* 1423 */             if (ak == ak.Y)
/*      */             {
/*      */               
/* 1426 */               if (l.bJ.h() || l.be) {
/*      */                 
/* 1428 */                 l.d("Creating DebugEditorBuilder for replay");
/* 1429 */                 h = new h(false);
/*      */ 
/*      */                 
/* 1432 */                 h h1 = l.bA.i();
/* 1433 */                 if (h1 == null || h1.dC)
/*      */                 {
/* 1435 */                   l.d("Relinking editor");
/* 1436 */                   l.bA.a(h);
/*      */                 }
/*      */               
/*      */               } else {
/*      */                 
/* 1441 */                 l.d("Creating DebugEditorBuilder for load");
/* 1442 */                 h = new h(false);
/*      */                 
/* 1444 */                 b1 = 1;
/*      */               }
/*      */             
/*      */             }
/*      */             else
/*      */             {
/* 1450 */               af af = ak.a();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 1464 */           else if (b == 3) {
/*      */ 
/*      */             
/* 1467 */             String str1 = paramk.k();
/*      */             
/* 1469 */             l l1 = l.l(str1);
/*      */             
/* 1471 */             if (l1 == null) {
/*      */               
/* 1473 */               String str2 = "Could not find custom unit:" + str1;
/* 1474 */               l.d(str2);
/*      */               
/* 1476 */               if (!bool2) {
/*      */                 
/* 1478 */                 bool2 = true;
/* 1479 */                 ad.f(str2);
/*      */               } 
/*      */               
/* 1482 */               l1 = l.b;
/*      */               
/* 1484 */               if (l1 == null)
/*      */               {
/* 1486 */                 throw new RuntimeException("Could not find custom unit:" + str1 + " and missingPlaceHolder is null");
/*      */               }
/*      */             } 
/*      */ 
/*      */             
/* 1491 */             al al = l.c((al)l1);
/* 1492 */             if (al != null)
/*      */             {
/* 1494 */               if (al instanceof l) {
/*      */                 
/* 1496 */                 l1 = (l)al;
/*      */               }
/*      */               else {
/*      */                 
/* 1500 */                 l.b("replacement not a custom unit:" + al.i());
/*      */               } 
/*      */             }
/*      */             
/* 1504 */             af af = l1.a();
/*      */ 
/*      */           
/*      */           }
/* 1508 */           else if (b == 2) {
/*      */             
/* 1510 */             byte b5 = paramk.d();
/*      */             
/* 1512 */             if (b5 == 1)
/*      */             {
/* 1514 */               k k1 = new k();
/*      */             }
/* 1516 */             else if (b5 == 2)
/*      */             {
/* 1518 */               f f4 = new f(false);
/*      */             }
/* 1520 */             else if (b5 == 3)
/*      */             {
/* 1522 */               f = new f(l.bz);
/*      */             }
/*      */             else
/*      */             {
/* 1526 */               throw new IOException("Unhandled gameType on load:" + b5);
/*      */             }
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 1532 */             throw new IOException("Unhandled basic type on load:" + b);
/*      */           } 
/*      */           
/* 1535 */           ((w)f).dA = paramk.i();
/*      */           
/* 1537 */           w.dq();
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1543 */         if (i >= 3) {
/*      */ 
/*      */           
/* 1546 */           l.bF.a(paramk.i());
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1551 */           l.bF.a(100000L);
/*      */         } 
/*      */         
/* 1554 */         if (i >= 24)
/*      */         {
/*      */           
/* 1557 */           l.bD.a(paramk);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1562 */         if (i >= 4)
/*      */         {
/*      */           
/* 1565 */           l.bA.a(paramk, paramBoolean3);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1570 */         if (i >= 57)
/*      */         {
/*      */           
/* 1573 */           l.bG.a(paramk, paramBoolean3);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1578 */         if (i >= 7) {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1583 */           for (b2 = 0; b2 < m; b2++)
/*      */           {
/* 1585 */             m m1 = m.n(b2);
/*      */             
/* 1587 */             if (arrayOfM[b2] != null) {
/*      */               
/* 1589 */               m1 = arrayOfM[b2];
/*      */               
/* 1591 */               if (m1 == m.e)
/*      */               {
/* 1593 */                 m1 = null;
/*      */               }
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/* 1599 */             if (m1 != null)
/*      */             {
/* 1601 */               m1.c(paramk);
/*      */             
/*      */             }
/*      */           }
/*      */         
/*      */         }
/* 1607 */         else if (i >= 2) {
/*      */         
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1615 */         if (i >= 10)
/*      */         {
/* 1617 */           paramk.a("Pre-unit data");
/*      */         }
/*      */         
/* 1620 */         bj.a(bk.A);
/*      */ 
/*      */ 
/*      */         
/* 1624 */         o o2 = w.dp();
/*      */         
/* 1626 */         l.b("gameSaver", "Loading unit data for " + o2.size() + " objects.");
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1631 */         for (w w : o2) {
/*      */           
/* 1633 */           w.a(paramk);
/*      */           
/* 1635 */           if (i >= 10)
/*      */           {
/* 1637 */             paramk.a("post unit: " + w.getClass().toString() + " with id:" + w.dA);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1651 */         l.b("gameSaver", "Loading unit data done.");
/*      */         
/* 1653 */         bj.b(bk.A);
/*      */ 
/*      */ 
/*      */         
/* 1657 */         if (b1 != 0) {
/*      */           
/* 1659 */           o o = w.dp();
/*      */           
/* 1661 */           for (w w : o) {
/*      */             
/* 1663 */             if (w instanceof af) {
/*      */               
/* 1665 */               af af = (af)w;
/*      */               
/* 1667 */               if (!l.bJ.h() && !l.be)
/*      */               {
/* 1669 */                 if (af.r() == ak.Y)
/*      */                 {
/* 1671 */                   af.bU();
/*      */                 }
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1681 */         if (i >= 23)
/*      */         {
/* 1683 */           paramk.d("saveCompression");
/*      */         }
/*      */ 
/*      */         
/* 1687 */         if (i >= 19) {
/*      */           
/* 1689 */           paramk.a("End of Save");
/* 1690 */           paramk.k();
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1728 */         l.b("gameSaver", "Checking for ID overlaps");
/*      */         
/* 1730 */         byte b3 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1750 */         boolean bool3 = true;
/*      */         
/* 1752 */         if (bool3) {
/*      */           
/* 1754 */           w[] arrayOfW = w.dK.a();
/* 1755 */           int i1 = w.dK.size();
/*      */           
/* 1757 */           for (byte b = 0; b < i1; b++) {
/*      */             
/* 1759 */             w w = arrayOfW[b];
/* 1760 */             for (int i2 = b + 1; i2 < i1; i2++) {
/*      */               
/* 1762 */               w w1 = arrayOfW[i2];
/*      */               
/* 1764 */               if (w != w1)
/*      */               {
/* 1766 */                 if (w.dA == w1.dA) {
/*      */                   
/* 1768 */                   b3++;
/* 1769 */                   w1.dA = l.bF.t();
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1778 */         l.b("gameSaver", "clearing out dead units.");
/*      */ 
/*      */         
/* 1781 */         l.d("Unit.fastLiveUnitList before:" + af.bj.size());
/*      */ 
/*      */         
/* 1784 */         Iterator<af> iterator = af.bj.iterator();
/* 1785 */         while (iterator.hasNext()) {
/*      */           
/* 1787 */           af af = iterator.next();
/* 1788 */           if (af.bz)
/*      */           {
/* 1790 */             iterator.remove();
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1796 */         l.d("Unit.fastLiveUnitList after:" + af.bj.size());
/*      */         
/* 1798 */         if (b3 > 0)
/*      */         {
/* 1800 */           if (i <= 2) {
/*      */             
/* 1802 */             l.a("Warning: " + b3 + " errors were found in this save, this is due to a bug in the old version", 1);
/*      */           }
/*      */           else {
/*      */             
/* 1806 */             l.a("Warning: " + b3 + " errors were found in this save", 1);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1814 */         l.b("gameSaver", "Fixing map cost.");
/*      */         
/* 1816 */         l.bC.a(null);
/*      */         
/* 1818 */         l.bC.b();
/*      */ 
/*      */         
/* 1821 */         l.b("gameSaver", "Fixing map cost done.");
/*      */ 
/*      */         
/* 1824 */         m.J();
/*      */         
/*      */         byte b4;
/* 1827 */         for (b4 = 0; b4 < m.a; b4++) {
/*      */           
/* 1829 */           m m1 = m.n(b4);
/* 1830 */           if (m1 != null)
/*      */           {
/* 1832 */             m1.d(false);
/*      */           }
/*      */         } 
/*      */         
/* 1836 */         l.b("gameSaver", "Rebuilt unit caches");
/*      */         
/* 1838 */         m.J();
/*      */ 
/*      */         
/* 1841 */         for (b4 = 0; b4 < m.a; b4++) {
/*      */           
/* 1843 */           m m1 = m.n(b4);
/* 1844 */           if (m1 != null)
/*      */           {
/* 1846 */             if (m1 instanceof a) {
/*      */               
/* 1848 */               a a = (a)m1;
/* 1849 */               a.af();
/*      */             } 
/*      */           }
/*      */         } 
/*      */         
/* 1854 */         if (arrayList != null) {
/*      */           
/* 1856 */           l.bA.w();
/*      */           
/* 1858 */           for (Iterator<Long> iterator1 = arrayList.iterator(); iterator1.hasNext(); ) { long l1 = ((Long)iterator1.next()).longValue();
/*      */             
/* 1860 */             af af = w.a(l1, true);
/* 1861 */             if (af != null)
/*      */             {
/* 1863 */               l.bA.k(af);
/*      */             } }
/*      */         
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1875 */         l.d("--- Save file load complete ---");
/* 1876 */         l.d("GameObject.fastGameObjectList:" + w.dK.size());
/* 1877 */         l.d("Unit.fastLiveUnitList:" + af.bj.size());
/*      */ 
/*      */         
/* 1880 */         if (!paramBoolean3)
/*      */         {
/*      */           
/* 1883 */           l.bJ.a(paramBoolean3);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1890 */         if (this.c)
/*      */         {
/* 1892 */           bj.b(bk.y);
/*      */           
/* 1894 */           bj.a(true, true);
/*      */         
/*      */         }
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1901 */     catch (Exception exception) {
/*      */       
/* 1903 */       throw new RuntimeException(exception);
/*      */     } 
/*      */ 
/*      */     
/* 1907 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(String paramString) {
/* 1950 */     if (paramString.contains("\\") || paramString.contains("/")) {
/*      */       
/* 1952 */       l.d("Cannot get save with path: " + paramString);
/*      */       
/*      */       return;
/*      */     } 
/* 1956 */     File file1 = a(paramString, true);
/* 1957 */     file1.delete();
/*      */ 
/*      */ 
/*      */     
/* 1961 */     File file2 = a(paramString + ".map", true);
/* 1962 */     file2.delete();
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
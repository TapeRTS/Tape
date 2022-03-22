/*     */ package com.corrodinggames.rts.gameFramework.f;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.c.a;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintWriter;
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
/*     */ public class b
/*     */ {
/*     */   public String a;
/*     */   public String b;
/*     */   public boolean c;
/*     */   public long d;
/*     */   boolean e;
/*     */   public String f;
/*     */   public boolean g;
/*     */   public String h;
/*     */   public String i;
/*     */   public boolean j;
/*     */   public boolean k;
/*     */   public boolean l = false;
/*     */   public boolean m = true;
/*     */   public boolean n;
/*     */   public boolean o;
/*     */   public int p;
/*     */   public int q;
/*     */   public int r;
/*     */   public int s;
/*     */   public int t;
/*     */   public String u;
/*     */   public boolean v;
/*     */   public boolean w;
/*     */   public int x;
/*  72 */   ArrayList y = new ArrayList();
/*     */   
/*     */   public String z;
/*     */   public String A;
/*     */   
/*     */   public String a() {
/*  78 */     if (this.h != null)
/*     */     {
/*  80 */       return this.h;
/*     */     }
/*  82 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String b() {
/*  87 */     String str = a();
/*  88 */     return f.a(str, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public String c() {
/*  93 */     String str = a();
/*  94 */     return f.a(str, 40);
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/*  99 */     return e();
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 104 */     String str = "";
/* 105 */     if (this.i != null)
/*     */     {
/* 107 */       str = str + this.i;
/*     */     }
/*     */     
/* 110 */     str = str + "\n (RAM:" + q() + ")";
/*     */     
/* 112 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 117 */     if (this.j)
/*     */     {
/* 119 */       return this.f;
/*     */     }
/*     */     
/* 122 */     return a.c(this.f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String g() {
/* 129 */     File file = new File(f());
/* 130 */     return file.getAbsolutePath();
/*     */   }
/*     */ 
/*     */   
/*     */   public String h() {
/* 135 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String i() {
/* 143 */     File file = new File(f());
/*     */     
/* 145 */     return file.getCanonicalPath();
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
/*     */   public String j() {
/* 157 */     String str = this.A;
/*     */     
/* 159 */     if (!this.n || str != null)
/*     */     {
/*     */       
/* 162 */       if (!this.o && str == null) {
/*     */         
/* 164 */         if (str == null)
/*     */         {
/* 166 */           str = "";
/*     */         }
/*     */         
/* 169 */         str = str + "Not yet loaded, refresh needed";
/*     */       } 
/*     */     }
/* 172 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 177 */     return (!this.c && this.z == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String paramString) {
/* 182 */     if (this.z == null) {
/*     */       
/* 184 */       if (!this.c) {
/*     */         
/* 186 */         l l = l.u();
/*     */         
/* 188 */         l.h(paramString);
/*     */       } 
/*     */       
/* 191 */       this.z = paramString;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(String paramString) {
/* 198 */     if (this.A == null)
/*     */     {
/* 200 */       this.A = paramString;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a(String paramString, int paramInt) {
/* 207 */     if (paramInt > 4)
/*     */     {
/* 209 */       return null;
/*     */     }
/*     */     
/* 212 */     String[] arrayOfString = a.e(paramString);
/*     */     
/* 214 */     if (arrayOfString == null)
/*     */     {
/* 216 */       return null;
/*     */     }
/*     */     
/* 219 */     for (String str : arrayOfString) {
/*     */       
/* 221 */       if (str.equalsIgnoreCase("mod-info.txt"))
/*     */       {
/* 223 */         return paramString + "/mod-info.txt";
/*     */       }
/*     */     } 
/*     */     
/* 227 */     if (arrayOfString.length > 5)
/*     */     {
/* 229 */       return null;
/*     */     }
/*     */     
/* 232 */     for (String str1 : arrayOfString) {
/*     */       
/* 234 */       String str2 = paramString + "/" + str1;
/* 235 */       if (a.d(str2)) {
/*     */         
/* 237 */         String str = a(str2, paramInt + 1);
/* 238 */         if (str != null)
/*     */         {
/* 240 */           return str;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 245 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void l() {
/* 252 */     String str = this.f + "/mod-info.txt";
/*     */ 
/*     */     
/* 255 */     if (!a.f(str)) {
/*     */ 
/*     */ 
/*     */       
/* 259 */       String str1 = this.f;
/*     */       
/* 261 */       if (str1 == null) {
/*     */         
/* 263 */         l.d("setSourceFolder: sourceFolder==null");
/*     */         
/*     */         return;
/*     */       } 
/* 267 */       String[] arrayOfString = a.e(str1);
/*     */       
/* 269 */       if (arrayOfString != null)
/*     */       {
/* 271 */         if (arrayOfString.length == 1) {
/*     */           
/* 273 */           String str2 = arrayOfString[0];
/*     */           
/* 275 */           String str3 = str1 + "/" + str2;
/* 276 */           String str4 = str3 + "/mod-info.txt";
/*     */           
/* 278 */           if (a.d(str3))
/*     */           {
/* 280 */             if (a.f(str4)) {
/*     */               
/* 282 */               l.d("Changing mod sourceFolder to:" + str3);
/* 283 */               this.f = str3;
/*     */             }  } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public ab m() {
/*     */     j j;
/*     */     ab ab;
/* 293 */     if (this.f == null) {
/*     */       
/* 295 */       l.d("No source yet for mod: " + this.a);
/* 296 */       return null;
/*     */     } 
/*     */     
/* 299 */     String str = this.f + "/mod-info.txt";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 307 */       j = a.h(str);
/*     */     }
/* 309 */     catch (Exception exception) {
/*     */       
/* 311 */       l.d("Error loading mod info for: " + this.a + " at " + str);
/* 312 */       exception.printStackTrace();
/*     */       
/* 314 */       b("Error loading mod-info.txt: " + exception.getMessage());
/* 315 */       return null;
/*     */     } 
/*     */     
/* 318 */     if (j == null) {
/*     */       
/* 320 */       String str1 = a(this.f, 1);
/*     */       
/* 322 */       if (str1 != null)
/*     */       {
/* 324 */         a("No mod info at " + a.c(str) + " but found one nested at: " + a.c(str1) + " (Hint: This mod might have been extracted with an extra folder)");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 330 */     if (j == null) {
/*     */       
/* 332 */       l.d("No mod info for: " + this.a + " at " + str);
/* 333 */       return null;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 339 */       ab = new ab((InputStream)j, str);
/*     */     }
/* 341 */     catch (IOException iOException) {
/*     */ 
/*     */       
/* 344 */       l.d("Error loading mod info for: " + this.a + " at " + str);
/* 345 */       iOException.printStackTrace();
/*     */       
/* 347 */       b("Error loading mod-info.txt: " + iOException.getMessage());
/* 348 */       return null;
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
/* 362 */     return ab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String n() {
/* 369 */     String str = c("thumbnail");
/* 370 */     if (str != null) {
/*     */       
/* 372 */       str = g() + "/" + str;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 377 */       return str;
/*     */     } 
/* 379 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList o() {
/* 389 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c(String paramString) {
/* 398 */     String str = "mod";
/*     */     
/* 400 */     ab ab = m();
/*     */     
/* 402 */     if (ab == null)
/*     */     {
/* 404 */       return null;
/*     */     }
/*     */     
/* 407 */     return ab.b(str, paramString, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void p() {
/* 412 */     ab ab = m();
/*     */     
/* 414 */     if (ab == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 420 */     String str1 = "mod";
/* 421 */     String str2 = "music";
/*     */     
/* 423 */     this.h = ab.b(str1, "title", null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 428 */     this.i = ab.b(str1, "description", null);
/*     */     
/* 430 */     if (this.i != null && this.i.contains("\\n"))
/*     */     {
/* 432 */       this.i = this.i.replace("\\n", "\n");
/*     */     }
/*     */     
/* 435 */     this.u = ab.b(str2, "sourceFolder", null);
/*     */ 
/*     */     
/* 438 */     this.v = ab.a(str2, "whenUsingUnitsFromThisMod_playExclusively", Boolean.valueOf(false)).booleanValue();
/* 439 */     this.w = ab.a(str2, "addToNormalPlaylist", Boolean.valueOf(false)).booleanValue();
/*     */ 
/*     */     
/* 442 */     if (this.u != null) {
/*     */       
/* 444 */       l.d("Loading music for: " + a());
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 449 */       String str = f.b(this.f, this.u);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 454 */       String[] arrayOfString = a.e(str);
/*     */       
/* 456 */       if (arrayOfString == null) {
/*     */         
/* 458 */         b("Could not read target music folder: " + a.c(str));
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 463 */         ArrayList<String> arrayList = new ArrayList();
/*     */         
/* 465 */         for (String str4 : arrayOfString) {
/*     */           
/* 467 */           if (str4.toLowerCase().endsWith(".ogg")) {
/*     */             
/* 469 */             String str5 = f.b(str, str4);
/*     */             
/* 471 */             if (!this.y.contains(str5))
/*     */             {
/* 473 */               l.d("Found music track: " + str4);
/*     */             }
/*     */             
/* 476 */             arrayList.add(str5);
/*     */           } 
/*     */         } 
/*     */         
/* 480 */         this.y = arrayList;
/*     */         
/* 482 */         if (this.y.size() == 0)
/*     */         {
/* 484 */           b("Could not find any .ogg files in music folder: " + a.c(str));
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 493 */     this.g = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 500 */     String str3 = s();
/* 501 */     File file = new File(str3);
/*     */     
/* 503 */     if (file.exists() && !file.isDirectory()) {
/*     */       ab ab1;
/*     */ 
/*     */       
/*     */       try {
/* 508 */         ab1 = new ab(str3);
/*     */       }
/* 510 */       catch (IOException iOException) {
/*     */         
/* 512 */         throw new RuntimeException(iOException);
/*     */       } 
/* 514 */       String str = "steam";
/*     */       
/* 516 */       this.d = ab1.a(str, "id", 0L);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String s() {
/* 524 */     return f() + "/steam.dat";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(long paramLong) {
/* 529 */     this.d = paramLong;
/* 530 */     String str = s();
/*     */     
/*     */     try {
/* 533 */       PrintWriter printWriter = new PrintWriter(str);
/*     */       
/* 535 */       printWriter.println("[steam]");
/* 536 */       printWriter.println("id: " + paramLong);
/* 537 */       printWriter.close();
/* 538 */     } catch (FileNotFoundException fileNotFoundException) {
/*     */       
/* 540 */       fileNotFoundException.printStackTrace();
/*     */       
/* 542 */       l.u().h("IO error: Failed to save workshop id for mod at: " + str);
/* 543 */       return false;
/*     */     } 
/*     */     
/* 546 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String q() {
/* 553 */     String str = "";
/*     */     
/* 555 */     str = str + String.format("%.2f", new Object[] { Float.valueOf((float)((this.r + this.s) / 1000.0D / 1000.0D)) }) + " mb" + (this.n ? " - disabled" : "");
/*     */     
/* 557 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void r() {
/* 563 */     l.d("Mod: '" + a() + "' - Memory use:" + q() + " " + (k() ? "" : " (disabled)"));
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\f\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.AssetManager;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class i
/*     */ {
/*     */   private ArrayList c;
/*     */   public Context a;
/*     */   boolean b;
/*     */   
/*     */   public i(Context paramContext) {
/* 123 */     this.b = true;
/*     */     this.a = paramContext;
/*     */     a();
/*     */   } public ArrayList c() {
/* 127 */     if (this.c != null) {
/*     */       
/* 129 */       if (this.b) {
/*     */         
/* 131 */         l.d("assetIndex: getFile was not blocked on load");
/* 132 */         this.b = false;
/*     */       } 
/* 134 */       return this.c;
/*     */     } 
/* 136 */     long l = l.N();
/* 137 */     b();
/* 138 */     if (this.b) {
/*     */ 
/*     */       
/* 141 */       l.d("assetIndex: getFile is BLOCKED on load");
/* 142 */       this.b = false;
/*     */     } 
/* 144 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*     */     i$1 i$1 = new i$1(this);
/*     */     i$1.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*     */     synchronized (this) {
/*     */       if (this.c != null) {
/*     */         return;
/*     */       }
/*     */       AssetManager assetManager = this.a.d();
/*     */       ArrayList arrayList = new ArrayList();
/*     */       try {
/*     */         l.d("------- createIndex -------");
/*     */         arrayList.addAll(a(assetManager, "", 1));
/*     */       } catch (IOException iOException) {
/*     */         throw new RuntimeException(iOException);
/*     */       } 
/*     */       this.c = arrayList;
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
/*     */   public ArrayList a(AssetManager paramAssetManager, String paramString, int paramInt) {
/*     */     ArrayList<String> arrayList = new ArrayList();
/*     */     String[] arrayOfString = paramAssetManager.c(paramString);
/*     */     if (paramString.length() > 0) {
/*     */       paramString = paramString + "/";
/*     */     }
/*     */     if (paramInt > 140) {
/*     */       throw new RuntimeException("dirLevel>140 for: " + paramString);
/*     */     }
/*     */     l.d("c:" + paramString);
/*     */     for (String str1 : arrayOfString) {
/*     */       String str2 = paramString + str1;
/*     */       boolean bool = false;
/*     */       if (!str1.contains(".")) {
/*     */         bool = true;
/*     */       }
/*     */       if (!str1.equals(".") && !str1.equals("..")) {
/*     */         if (!str1.equals("")) {
/*     */           arrayList.add(str2);
/*     */           if (bool) {
/*     */             arrayList.addAll(a(paramAssetManager, str2, paramInt + 1));
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     return arrayList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(String paramString) {
/* 225 */     if (paramString.endsWith(File.separator)) {
/* 226 */       paramString = paramString.substring(0, paramString.length() - 1);
/*     */     }
/* 228 */     paramString = paramString.replace("//", "/");
/*     */     
/* 230 */     for (String str : c()) {
/* 231 */       if (str.equals(paramString)) {
/* 232 */         return true;
/*     */       }
/*     */     } 
/* 235 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] b(String paramString) {
/* 241 */     ArrayList<String> arrayList = new ArrayList();
/*     */     
/* 243 */     String str = paramString;
/* 244 */     if (str.endsWith(File.separator)) {
/* 245 */       str = str.substring(0, str.length() - 1);
/*     */     }
/*     */ 
/*     */     
/* 249 */     int j = 0;
/* 250 */     for (String str1 : c()) {
/* 251 */       if (str1.startsWith(str)) {
/*     */         
/* 253 */         String str2 = str1.substring(str.length());
/*     */         
/* 255 */         if (str2.length() != 0)
/*     */         {
/* 257 */           if (str2.charAt(0) == File.separatorChar && 
/* 258 */             str2.indexOf(File.separator, 1) == -1) {
/* 259 */             j++;
/*     */             
/* 261 */             String str3 = str1.substring((str + "/").length());
/*     */             
/* 263 */             arrayList.add(str3);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 272 */     return arrayList.<String>toArray(new String[0]);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
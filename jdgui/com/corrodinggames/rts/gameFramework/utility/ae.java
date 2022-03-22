/*     */ package com.corrodinggames.rts.gameFramework.utility;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.c.a;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ae
/*     */ {
/*     */   public static void a(String paramString) {
/*  44 */     l.d("Zip: " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean b(String paramString) {
/*  49 */     if (paramString.endsWith(".rwmod") || paramString.endsWith(".rwmod/") || paramString.endsWith(".rwmod\\"))
/*     */     {
/*  51 */       return true;
/*     */     }
/*     */     
/*  54 */     af af = c(paramString, true);
/*  55 */     if (af == null)
/*     */     {
/*     */ 
/*     */       
/*  59 */       return false;
/*     */     }
/*  61 */     return af.c(g(paramString));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c(String paramString) {
/*  72 */     if (paramString.contains(".rwmod/") || paramString.contains(".rwmod\\") || paramString.endsWith(".rwmod"))
/*     */     {
/*  74 */       return true;
/*     */     }
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean d(String paramString) {
/*  81 */     if (paramString.endsWith(".rwmod") || paramString.endsWith(".rwmod/") || paramString.endsWith(".rwmod\\"))
/*     */     {
/*  83 */       return true;
/*     */     }
/*     */     
/*  86 */     af af = c(paramString, true);
/*  87 */     if (af == null)
/*     */     {
/*     */ 
/*     */       
/*  91 */       return false;
/*     */     }
/*  93 */     return af.d(g(paramString));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] e(String paramString) {
/*  99 */     af af = c(paramString, true);
/* 100 */     if (af == null)
/*     */     {
/* 102 */       return null;
/*     */     }
/* 104 */     return af.e(g(paramString));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long a(String paramString, boolean paramBoolean) {
/* 110 */     af af = c(paramString, paramBoolean);
/* 111 */     if (af == null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 117 */       return -1L;
/*     */     }
/*     */     
/* 120 */     String str = g(paramString);
/* 121 */     return af.h(str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static j b(String paramString, boolean paramBoolean) {
/* 128 */     af af = c(paramString, paramBoolean);
/* 129 */     if (af == null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 136 */       return null;
/*     */     }
/* 138 */     String str = g(paramString);
/*     */     
/* 140 */     return af.i(str);
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
/*     */   public static String f(String paramString) {
/* 152 */     int i = paramString.indexOf(".rwmod/");
/* 153 */     int j = paramString.indexOf(".rwmod\\");
/* 154 */     if (j != -1)
/*     */     {
/* 156 */       if (j < i || i == -1)
/*     */       {
/* 158 */         i = j;
/*     */       }
/*     */     }
/* 161 */     if (i == -1)
/*     */     {
/* 163 */       if (paramString.endsWith(".rwmod"))
/*     */       {
/* 165 */         i = paramString.length() - ".rwmod".length();
/*     */       }
/*     */     }
/* 168 */     if (i == -1)
/*     */     {
/* 170 */       throw new RuntimeException("Could not find .rwmod in path: " + paramString);
/*     */     }
/*     */     
/* 173 */     return paramString.substring(0, i + ".rwmod".length());
/*     */   }
/*     */ 
/*     */   
/*     */   public static af c(String paramString, boolean paramBoolean) {
/* 178 */     String str = f(paramString);
/*     */     
/* 180 */     synchronized (a) {
/*     */       
/* 182 */       af af = (af)a.get(str);
/*     */       
/* 184 */       if (af == null) {
/*     */         String str1;
/*     */ 
/*     */ 
/*     */         
/* 189 */         if (paramBoolean) {
/*     */           
/* 191 */           str1 = str;
/*     */         }
/*     */         else {
/*     */           
/* 195 */           str1 = a.c(str);
/*     */         } 
/*     */ 
/*     */         
/*     */         try {
/* 200 */           af = new af(str, str1);
/*     */         }
/* 202 */         catch (IOException iOException) {
/*     */           
/* 204 */           a("Failed to open source zip: '" + str1 + "'");
/*     */           
/* 206 */           iOException.printStackTrace();
/*     */           
/* 208 */           a.a("Failed to open zip, " + iOException.getMessage());
/*     */           
/* 210 */           return null;
/*     */         }
/* 212 */         catch (IllegalArgumentException illegalArgumentException) {
/*     */           
/* 214 */           a("Failed to open source zip: '" + str1 + "'");
/* 215 */           illegalArgumentException.printStackTrace();
/*     */           
/* 217 */           a.a("Failed to open zip, " + illegalArgumentException.getMessage());
/*     */           
/* 219 */           return null;
/*     */         } 
/*     */         
/* 222 */         a.put(str, af);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 227 */       return af;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String g(String paramString) {
/* 234 */     String str1 = f(paramString);
/*     */ 
/*     */     
/* 237 */     String str2 = paramString.substring(str1.length());
/* 238 */     if (str2.startsWith("/") || str2.startsWith("\\"))
/*     */     {
/* 240 */       str2 = str2.substring(1);
/*     */     }
/*     */ 
/*     */     
/* 244 */     if (str2.startsWith("/") || str2.startsWith("\\"))
/*     */     {
/* 246 */       str2 = str2.substring(1);
/*     */     }
/*     */     
/* 249 */     if (str2.contains("\\"))
/*     */     {
/* 251 */       str2 = str2.replace("\\", "/");
/*     */     }
/*     */     
/* 254 */     if (str2.contains("..")) {
/*     */ 
/*     */ 
/*     */       
/* 258 */       String[] arrayOfString = f.b(str2, '/');
/* 259 */       ArrayList<String> arrayList = new ArrayList(arrayOfString.length);
/*     */       
/* 261 */       byte b = 0;
/*     */       
/* 263 */       for (int i = arrayOfString.length - 1; i >= 0; i--) {
/*     */         
/* 265 */         if (arrayOfString[i].equals("..")) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 270 */           b++;
/*     */ 
/*     */         
/*     */         }
/* 274 */         else if (b > 0) {
/*     */           
/* 276 */           b--;
/*     */         }
/*     */         else {
/*     */           
/* 280 */           arrayList.add(0, arrayOfString[i]);
/*     */         } 
/*     */       } 
/* 283 */       if (b != 0)
/*     */       {
/* 285 */         a("getPathInZip: Backtracking attempt out of zip: " + str2);
/*     */       }
/*     */       
/* 288 */       str2 = f.a("/", arrayList);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 293 */     return str2;
/*     */   }
/*     */   
/* 296 */   static HashMap a = new HashMap<>();
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramewor\\utility\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
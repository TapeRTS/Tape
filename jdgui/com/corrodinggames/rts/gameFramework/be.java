/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Environment;
/*     */ import android.util.Log;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class be
/*     */ {
/*     */   public boolean a = false;
/*  25 */   String b = "rtsSave";
/*     */   
/*  27 */   String c = "rtsSave.bak";
/*     */ 
/*     */   
/*     */   public boolean d = false;
/*     */ 
/*     */   
/*     */   public strictfp void a(Context paramContext) {
/*  34 */     if (l.aF) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  39 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/*     */       FileOutputStream fileOutputStream;
/*     */       
/*  46 */       if (paramContext == null)
/*     */       {
/*  48 */         throw new IOException("context==null");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*  57 */         fileOutputStream = paramContext.b(this.b, 0);
/*     */       }
/*  59 */       catch (NullPointerException nullPointerException) {
/*     */         
/*  61 */         throw new IOException("openFileOutput NullPointerException", nullPointerException);
/*     */       } 
/*     */       
/*  64 */       DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
/*  65 */       a(dataOutputStream);
/*     */       
/*  67 */       dataOutputStream.close();
/*  68 */       fileOutputStream.close();
/*     */     }
/*  70 */     catch (FileNotFoundException fileNotFoundException) {
/*  71 */       Log.b("RustedWarfare", "file save error:", fileNotFoundException);
/*     */     }
/*  73 */     catch (IOException iOException) {
/*  74 */       Log.b("RustedWarfare", "file save error:", iOException);
/*     */     } 
/*     */ 
/*     */     
/*  78 */     if (this.d) {
/*     */       
/*     */       try {
/*     */         
/*  82 */         File file = new File(Environment.getExternalStorageDirectory() + "/" + this.c);
/*     */         
/*  84 */         FileOutputStream fileOutputStream = new FileOutputStream(file);
/*     */         
/*  86 */         DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
/*  87 */         a(dataOutputStream);
/*     */         
/*  89 */         dataOutputStream.close();
/*  90 */         fileOutputStream.close();
/*     */       }
/*  92 */       catch (IOException iOException) {
/*     */         
/*  94 */         Log.b("RustedWarfare", "file read error:", iOException);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(DataOutputStream paramDataOutputStream) {
/* 102 */     if (l.aF)
/*     */     {
/* 104 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 110 */       paramDataOutputStream.writeInt(1);
/* 111 */       paramDataOutputStream.writeInt(0);
/*     */ 
/*     */       
/* 114 */       paramDataOutputStream.writeInt(this.f.size());
/*     */       
/* 116 */       for (bf bf : this.f.values()) {
/*     */         
/* 118 */         paramDataOutputStream.writeInt(0);
/*     */         
/* 120 */         paramDataOutputStream.writeInt(bf.a);
/* 121 */         paramDataOutputStream.writeUTF(bf.b);
/* 122 */         paramDataOutputStream.writeInt(bf.c);
/* 123 */         paramDataOutputStream.writeBoolean(bf.d);
/* 124 */         paramDataOutputStream.writeBoolean(bf.e);
/* 125 */         paramDataOutputStream.writeBoolean(bf.f);
/* 126 */         paramDataOutputStream.writeLong(bf.g);
/* 127 */         paramDataOutputStream.writeInt(bf.h);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 132 */       paramDataOutputStream.flush();
/*     */       
/* 134 */       return true;
/*     */     
/*     */     }
/* 137 */     catch (IOException iOException) {
/*     */       
/* 139 */       Log.b("RustedWarfare", "file save error:", iOException);
/*     */       
/* 141 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp void b(Context paramContext) {
/* 150 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 156 */     boolean bool = false;
/*     */     
/* 158 */     Log.d("RustedWarfare", "Trying to load from internal memory");
/*     */     
/*     */     try {
/* 161 */       FileInputStream fileInputStream = paramContext.a(this.b);
/* 162 */       DataInputStream dataInputStream = new DataInputStream(fileInputStream);
/* 163 */       bool = a(dataInputStream);
/* 164 */       if (bool)
/*     */       {
/* 166 */         Log.d("RustedWarfare", "loaded from internal memory");
/*     */       }
/*     */       
/* 169 */       fileInputStream.close();
/*     */ 
/*     */     
/*     */     }
/* 173 */     catch (IOException iOException) {
/*     */       
/* 175 */       Log.b("RustedWarfare", "file read error:", iOException);
/*     */     } 
/*     */     
/* 178 */     if (this.d)
/*     */     {
/* 180 */       if (!bool) {
/*     */         
/* 182 */         Log.d("RustedWarfare", "Trying to load from SD");
/*     */ 
/*     */         
/*     */         try {
/* 186 */           File file = new File(Environment.getExternalStorageDirectory() + "/" + this.c);
/*     */           
/* 188 */           FileInputStream fileInputStream = new FileInputStream(file);
/*     */           
/* 190 */           DataInputStream dataInputStream = new DataInputStream(fileInputStream);
/* 191 */           bool = a(dataInputStream);
/* 192 */           if (bool)
/*     */           {
/* 194 */             Log.d("RustedWarfare", "loaded from SD");
/*     */           }
/*     */           
/* 197 */           dataInputStream.close();
/* 198 */           fileInputStream.close();
/*     */         }
/* 200 */         catch (IOException iOException) {
/*     */           
/* 202 */           Log.b("RustedWarfare", "file read error:", iOException);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp boolean a(DataInputStream paramDataInputStream) {
/*     */     try {
/* 215 */       int i = paramDataInputStream.readInt();
/*     */       
/* 217 */       if (i > 1) {
/*     */         
/* 219 */         Log.d("RustedWarfare", "Warning file is at version:" + i);
/* 220 */         return false;
/*     */       } 
/* 222 */       paramDataInputStream.readInt();
/*     */ 
/*     */       
/* 225 */       int j = paramDataInputStream.readInt();
/* 226 */       this.f.clear();
/* 227 */       for (byte b = 0; b < j; b++) {
/*     */         
/* 229 */         bf bf = new bf(this);
/* 230 */         paramDataInputStream.readInt();
/* 231 */         bf.a = paramDataInputStream.readInt();
/*     */         
/* 233 */         String str = paramDataInputStream.readUTF();
/*     */         
/* 235 */         if (str.equals("maps/challenge/l030;Level 5.tmx")) {
/*     */           
/* 237 */           Log.d("RustedWarfare", "converting:" + str);
/* 238 */           str = "maps/challenge/l090;Level 7.tmx";
/*     */         } 
/*     */ 
/*     */         
/* 242 */         bf.b = str;
/* 243 */         bf.c = paramDataInputStream.readInt();
/* 244 */         bf.d = paramDataInputStream.readBoolean();
/* 245 */         bf.e = paramDataInputStream.readBoolean();
/* 246 */         bf.f = paramDataInputStream.readBoolean();
/* 247 */         bf.g = paramDataInputStream.readLong();
/* 248 */         bf.h = paramDataInputStream.readInt();
/*     */ 
/*     */ 
/*     */         
/* 252 */         this.f.put(a(bf.b), bf);
/*     */       } 
/*     */ 
/*     */       
/* 256 */       return true;
/*     */     }
/* 258 */     catch (IOException iOException) {
/*     */       
/* 260 */       Log.b("RustedWarfare", "file read error:", iOException);
/*     */ 
/*     */       
/* 263 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 273 */   static be e = null;
/*     */   
/*     */   public static strictfp be c(Context paramContext) {
/* 276 */     if (e == null) {
/*     */       
/* 278 */       e = new be(paramContext);
/*     */ 
/*     */       
/* 281 */       if (!l.aF)
/*     */       {
/* 283 */         e.b(paramContext);
/*     */       }
/*     */     } 
/*     */     
/* 287 */     return e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   HashMap f;
/*     */ 
/*     */ 
/*     */   
/*     */   private strictfp be(Context paramContext) {
/* 298 */     this.f = new HashMap<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp String a(String paramString) {
/* 305 */     Integer integer = l.k(paramString);
/*     */     
/* 307 */     if (integer != null)
/*     */     {
/* 309 */       return l.i(paramString) + "/l" + integer;
/*     */     }
/*     */ 
/*     */     
/* 313 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public strictfp bf b(String paramString) {
/* 323 */     String str = a(paramString);
/*     */     
/* 325 */     bf bf = (bf)this.f.get(str);
/*     */     
/* 327 */     Log.d("RustedWarfare", "StateEngine: get(" + paramString + ")=" + bf + "  (key=" + str + ")");
/*     */     
/* 329 */     if (bf == null) {
/*     */       
/* 331 */       bf = new bf(this);
/* 332 */       bf.a = 1;
/* 333 */       bf.b = paramString;
/* 334 */       this.f.put(str, bf);
/*     */     } 
/*     */     
/* 337 */     return bf;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
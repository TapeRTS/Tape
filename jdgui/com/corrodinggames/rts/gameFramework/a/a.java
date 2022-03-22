/*     */ package com.corrodinggames.rts.gameFramework.a;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.media.SoundPool;
/*     */ import com.corrodinggames.rts.R;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ad;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.io.File;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.concurrent.LinkedBlockingQueue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends h
/*     */ {
/*  28 */   LinkedBlockingQueue a = new LinkedBlockingQueue();
/*     */   
/*  30 */   final int b = 15;
/*  31 */   ad c = new ad(15);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   d d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Context e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   SoundPool f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a() {
/* 135 */     for (byte b = 0; b < 15; b++)
/*     */     {
/* 137 */       this.c.a(new c());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Context paramContext) {
/* 148 */     if (this.e != null) {
/*     */       
/* 150 */       l.d("AndroidSoundFactory:setContext context already set");
/*     */       
/*     */       return;
/*     */     } 
/* 154 */     this.e = paramContext;
/* 155 */     this.f = new SoundPool(16, 3, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 162 */     if (this.d != null)
/*     */     {
/* 164 */       throw new RuntimeException("soundThread!=null");
/*     */     }
/*     */     
/* 167 */     this.d = new d(this);
/* 168 */     this.d.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public i a(int paramInt) {
/* 178 */     String str = f.a(R.raw.class, paramInt);
/*     */     
/* 180 */     b b = new b(this, str, this);
/* 181 */     b.a = this;
/* 182 */     b.b = this.f.load(this.e, paramInt, 1);
/*     */ 
/*     */     
/* 185 */     return b;
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
/*     */   public i a(String paramString, j paramj, boolean paramBoolean) {
/*     */     int i;
/* 212 */     a a1 = this;
/* 213 */     if (!paramBoolean)
/*     */     {
/* 215 */       a1 = null;
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
/* 229 */     if (!paramj.a()) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/* 234 */         File file = File.createTempFile("audio", "ogg");
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 240 */           FileOutputStream fileOutputStream = new FileOutputStream(file);
/*     */ 
/*     */           
/* 243 */           f.a((InputStream)paramj, fileOutputStream);
/*     */           
/* 245 */           fileOutputStream.close();
/*     */ 
/*     */           
/* 248 */           FileInputStream fileInputStream = new FileInputStream(file);
/*     */ 
/*     */ 
/*     */           
/*     */           try {
/* 253 */             FileDescriptor fileDescriptor = fileInputStream.getFD();
/* 254 */             long l1 = 0L;
/* 255 */             long l2 = fileInputStream.available();
/*     */ 
/*     */             
/* 258 */             i = this.f.load(fileDescriptor, l1, l2, 1);
/*     */           
/*     */           }
/*     */           finally {
/*     */             
/* 263 */             fileInputStream.close();
/*     */           }
/*     */         
/*     */         }
/*     */         finally {
/*     */           
/* 269 */           file.delete();
/*     */         }
/*     */       
/*     */       }
/* 273 */       catch (IOException iOException) {
/*     */         
/* 275 */         iOException.printStackTrace();
/* 276 */         return null;
/*     */       } 
/*     */     } else {
/*     */       FileDescriptor fileDescriptor;
/*     */ 
/*     */       
/*     */       long l1, l2;
/*     */       
/*     */       try {
/* 285 */         fileDescriptor = paramj.b();
/* 286 */         l1 = 0L;
/* 287 */         l2 = paramj.available();
/*     */       }
/* 289 */       catch (IOException iOException) {
/*     */         
/* 291 */         iOException.printStackTrace();
/* 292 */         return null;
/*     */       } 
/*     */       
/* 295 */       i = this.f.load(fileDescriptor, l1, l2, 1);
/*     */     } 
/*     */ 
/*     */     
/* 299 */     b b = new b(this, paramString, a1);
/* 300 */     b.a = this;
/*     */ 
/*     */     
/* 303 */     b.b = i;
/*     */     
/* 305 */     return b;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\a\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
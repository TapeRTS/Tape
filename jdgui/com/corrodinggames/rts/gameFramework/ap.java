/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import android.content.res.AssetFileDescriptor;
/*     */ import android.media.MediaPlayer;
/*     */ import com.corrodinggames.rts.gameFramework.c.a;
/*     */ import com.corrodinggames.rts.gameFramework.utility.ae;
/*     */ import com.corrodinggames.rts.gameFramework.utility.j;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends as
/*     */ {
/*     */   MediaPlayer a;
/*     */   ao b;
/*     */   an c;
/*     */   
/*     */   public ap(an paraman) {
/* 173 */     this.c = paraman;
/*     */     
/* 175 */     MediaPlayer mediaPlayer = null;
/*     */     
/* 177 */     if (paraman.b.size() == 0)
/*     */     {
/* 179 */       throw new RuntimeException("Music player pool empty");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     mediaPlayer = paraman.b.remove(0);
/* 189 */     paraman.c.add(this);
/*     */ 
/*     */     
/* 192 */     this.a = mediaPlayer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ar paramar) {
/* 200 */     this.b = (ao)paramar;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*     */     try {
/* 212 */       MediaPlayer mediaPlayer = this.a;
/*     */       
/* 214 */       mediaPlayer.reset();
/*     */       
/* 216 */       AssetFileDescriptor assetFileDescriptor = null;
/*     */       
/* 218 */       if (this.b.b.startsWith("music")) {
/*     */ 
/*     */         
/*     */         try {
/*     */ 
/*     */           
/* 224 */           assetFileDescriptor = this.c.e.w.d().b(this.b.b);
/*     */         }
/* 226 */         catch (IOException iOException) {
/*     */           
/* 228 */           throw new RuntimeException(iOException);
/*     */         } 
/*     */ 
/*     */         
/* 232 */         mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 238 */         String str = a.c(this.b.b);
/*     */ 
/*     */         
/* 241 */         if (!ae.c(str)) {
/*     */           
/* 243 */           mediaPlayer.setDataSource(str);
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 248 */           j j = a.h(str);
/*     */           
/* 250 */           File file = File.createTempFile("music", "ogg");
/*     */           
/* 252 */           l.d("Temp file needed for this music from zipped mod file");
/*     */ 
/*     */           
/*     */           try {
/* 256 */             FileOutputStream fileOutputStream = new FileOutputStream(file);
/*     */ 
/*     */             
/* 259 */             f.a((InputStream)j, fileOutputStream);
/*     */             
/* 261 */             fileOutputStream.close();
/*     */             
/* 263 */             FileInputStream fileInputStream = new FileInputStream(file);
/*     */ 
/*     */             
/*     */             try {
/* 267 */               mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
/*     */             }
/*     */             finally {
/*     */               
/* 271 */               fileInputStream.close();
/*     */             }
/*     */           
/*     */           }
/*     */           finally {
/*     */             
/* 277 */             file.delete();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 295 */       if (paramBoolean)
/*     */       {
/* 297 */         mediaPlayer.setLooping(true);
/*     */       }
/*     */       
/* 300 */       mediaPlayer.setVolume(0.0F, 0.0F);
/*     */       
/* 302 */       mediaPlayer.setOnInfoListener(new ap$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 312 */       mediaPlayer.setOnPreparedListener(new ap$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 321 */       mediaPlayer.prepareAsync();
/*     */ 
/*     */       
/* 324 */       if (assetFileDescriptor != null)
/*     */       {
/* 326 */         assetFileDescriptor.close();
/*     */       
/*     */       }
/*     */     }
/* 330 */     catch (Exception exception) {
/*     */       
/* 332 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 342 */     this.a.pause();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 348 */     this.a.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 355 */     return this.a.isPlaying();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 362 */     if (this.a != null)
/*     */     {
/* 364 */       this.a.stop();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/* 372 */     if (this.a != null)
/*     */     {
/* 374 */       this.a.stop();
/*     */     }
/* 376 */     this.a = null;
/*     */     
/* 378 */     this.c.c.remove(this);
/* 379 */     this.c.b.add(this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 388 */     this.a.setVolume(paramFloat, paramFloat);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
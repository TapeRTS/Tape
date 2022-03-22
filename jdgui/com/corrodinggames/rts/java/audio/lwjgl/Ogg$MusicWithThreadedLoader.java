/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.bj;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.java.audio.a.a;
/*     */ import com.corrodinggames.rts.java.audio.a.s;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ogg$MusicWithThreadedLoader
/*     */   extends OpenALMusic
/*     */ {
/*     */   private OggInputStream input;
/*     */   private OggInputStream previousInput;
/*     */   ThreadedWrappingAudioInputStream backgroundInput;
/*     */   
/*     */   public Ogg$MusicWithThreadedLoader(OpenALAudio paramOpenALAudio, a parama) {
/*  98 */     super(paramOpenALAudio, parama);
/*  99 */     if (paramOpenALAudio.noDevice)
/* 100 */       return;  this.input = new OggInputStream(parama.a());
/* 101 */     setup(this.input.getChannels(), this.input.getSampleRate());
/*     */ 
/*     */     
/* 104 */     this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
/*     */   }
/*     */ 
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte) {
/* 109 */     if (this.input == null) {
/* 110 */       this.input = new OggInputStream(this.file.a(), this.previousInput);
/* 111 */       setup(this.input.getChannels(), this.input.getSampleRate());
/* 112 */       this.previousInput = null;
/*     */       
/* 114 */       this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 119 */     long l = bj.a();
/*     */     
/* 121 */     int i = this.backgroundInput.read(paramArrayOfbyte);
/*     */ 
/*     */     
/* 124 */     double d = bj.a(l);
/* 125 */     if (d > 0.5D)
/*     */     {
/* 127 */       l.d("ogg read took:" + bj.a(d));
/*     */     }
/*     */     
/* 130 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void backgroundUpdate() {
/*     */     try {
/* 138 */       if (this.input != null && this.backgroundInput != null)
/*     */       {
/* 140 */         this.backgroundInput.backgroundFillBuffer();
/*     */       }
/*     */     }
/* 143 */     catch (IOException iOException) {
/*     */       
/* 145 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/* 151 */     s.a(this.input);
/* 152 */     this.previousInput = null;
/* 153 */     this.input = null;
/*     */     
/* 155 */     this.backgroundInput.close();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void loop() {
/* 160 */     s.a(this.input);
/* 161 */     this.previousInput = this.input;
/* 162 */     this.input = null;
/*     */     
/* 164 */     this.backgroundInput.close();
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\Ogg$MusicWithThreadedLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.corrodinggames.rts.java.audio.lwjgl;
/*    */ 
/*    */ import com.corrodinggames.rts.java.audio.a.a;
/*    */ import com.corrodinggames.rts.java.audio.a.c;
/*    */ import com.corrodinggames.rts.java.audio.a.s;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Wav$Music
/*    */   extends OpenALMusic
/*    */ {
/*    */   private Wav$WavInputStream input;
/*    */   
/*    */   public Wav$Music(OpenALAudio paramOpenALAudio, a parama) {
/* 32 */     super(paramOpenALAudio, parama);
/* 33 */     this.input = new Wav$WavInputStream(parama);
/* 34 */     if (paramOpenALAudio.noDevice)
/* 35 */       return;  setup(this.input.channels, this.input.sampleRate);
/*    */   }
/*    */   
/*    */   public int read(byte[] paramArrayOfbyte) {
/* 39 */     if (this.input == null) {
/* 40 */       this.input = new Wav$WavInputStream(this.file);
/* 41 */       setup(this.input.channels, this.input.sampleRate);
/*    */     } 
/*    */     try {
/* 44 */       return this.input.read(paramArrayOfbyte);
/* 45 */     } catch (IOException iOException) {
/* 46 */       throw new c("Error reading WAV file: " + this.file, iOException);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void reset() {
/* 51 */     s.a(this.input);
/* 52 */     this.input = null;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\Wav$Music.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
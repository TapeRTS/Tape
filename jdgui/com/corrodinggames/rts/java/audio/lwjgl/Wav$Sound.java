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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Wav$Sound
/*    */   extends OpenALSound
/*    */ {
/*    */   public Wav$Sound(OpenALAudio paramOpenALAudio, a parama) {
/* 58 */     super(paramOpenALAudio);
/* 59 */     if (paramOpenALAudio.noDevice)
/*    */       return; 
/* 61 */     Wav$WavInputStream wav$WavInputStream = null;
/*    */     try {
/* 63 */       wav$WavInputStream = new Wav$WavInputStream(parama);
/* 64 */       setup(s.a(wav$WavInputStream, wav$WavInputStream.dataRemaining), wav$WavInputStream.channels, wav$WavInputStream.sampleRate);
/* 65 */     } catch (IOException iOException) {
/* 66 */       throw new c("Error reading WAV file: " + parama, iOException);
/*    */     } finally {
/* 68 */       s.a(wav$WavInputStream);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\Wav$Sound.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
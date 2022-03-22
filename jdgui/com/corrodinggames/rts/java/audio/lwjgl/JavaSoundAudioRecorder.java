/*    */ package com.corrodinggames.rts.java.audio.lwjgl;
/*    */ 
/*    */ import com.corrodinggames.rts.java.audio.AudioRecorder;
/*    */ import com.corrodinggames.rts.java.audio.a.c;
/*    */ import javax.sound.sampled.AudioFormat;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.TargetDataLine;
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
/*    */ public class JavaSoundAudioRecorder
/*    */   implements AudioRecorder
/*    */ {
/*    */   private TargetDataLine line;
/* 30 */   private byte[] buffer = new byte[4096];
/*    */   
/*    */   public JavaSoundAudioRecorder(int paramInt, boolean paramBoolean) {
/*    */     try {
/* 34 */       AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, paramInt, 16, paramBoolean ? 1 : 2, paramBoolean ? 2 : 4, paramInt, false);
/*    */       
/* 36 */       this.line = AudioSystem.getTargetDataLine(audioFormat);
/* 37 */       this.line.open(audioFormat, this.buffer.length);
/* 38 */       this.line.start();
/* 39 */     } catch (Exception exception) {
/* 40 */       throw new c("Error creating JavaSoundAudioRecorder.", exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void read(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
/* 45 */     if (this.buffer.length < paramInt2 * 2) this.buffer = new byte[paramInt2 * 2];
/*    */     
/* 47 */     int i = paramInt2 * 2;
/* 48 */     int j = 0;
/* 49 */     while (j != i) {
/* 50 */       j += this.line.read(this.buffer, j, i - j);
/*    */     }
/* 52 */     for (byte b1 = 0, b2 = 0; b1 < paramInt2 * 2; b1 += 2, b2++)
/* 53 */       paramArrayOfshort[paramInt1 + b2] = (short)(this.buffer[b1 + 1] << 8 | this.buffer[b1] & 0xFF); 
/*    */   }
/*    */   
/*    */   public void dispose() {
/* 57 */     this.line.close();
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\JavaSoundAudioRecorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
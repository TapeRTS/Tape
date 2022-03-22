/*    */ package com.corrodinggames.rts.java.audio.lwjgl;
/*    */ 
/*    */ import com.corrodinggames.rts.java.audio.a.a;
/*    */ import com.corrodinggames.rts.java.audio.a.s;
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
/*    */ public class Ogg$Music
/*    */   extends OpenALMusic
/*    */ {
/*    */   private OggInputStream input;
/*    */   private OggInputStream previousInput;
/*    */   
/*    */   public Ogg$Music(OpenALAudio paramOpenALAudio, a parama) {
/* 35 */     super(paramOpenALAudio, parama);
/* 36 */     if (paramOpenALAudio.noDevice)
/* 37 */       return;  this.input = new OggInputStream(parama.a());
/* 38 */     setup(this.input.getChannels(), this.input.getSampleRate());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(byte[] paramArrayOfbyte) {
/* 45 */     if (this.input == null) {
/* 46 */       this.input = new OggInputStream(this.file.a(), this.previousInput);
/* 47 */       setup(this.input.getChannels(), this.input.getSampleRate());
/* 48 */       this.previousInput = null;
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 56 */     return this.input.read(paramArrayOfbyte);
/*    */   }
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
/*    */   public void reset() {
/* 71 */     s.a(this.input);
/* 72 */     this.previousInput = null;
/* 73 */     this.input = null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void loop() {
/* 79 */     s.a(this.input);
/* 80 */     this.previousInput = this.input;
/* 81 */     this.input = null;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\Ogg$Music.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
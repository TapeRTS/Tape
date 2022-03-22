/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.java.audio.Sound;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import org.lwjgl.openal.AL10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OpenALSound
/*     */   implements Sound
/*     */ {
/*  28 */   private int bufferID = -1;
/*     */   
/*     */   private final OpenALAudio audio;
/*     */   private float duration;
/*     */   private int bytesUsed;
/*     */   
/*     */   public OpenALSound(OpenALAudio paramOpenALAudio) {
/*  35 */     this.audio = paramOpenALAudio;
/*     */   }
/*     */   
/*     */   void setup(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  39 */     int i = paramArrayOfbyte.length - paramArrayOfbyte.length % ((paramInt1 > 1) ? 4 : 2);
/*  40 */     int j = i / 2 * paramInt1;
/*  41 */     this.duration = j / paramInt2;
/*     */     
/*  43 */     ByteBuffer byteBuffer = ByteBuffer.allocateDirect(i);
/*  44 */     byteBuffer.order(ByteOrder.nativeOrder());
/*  45 */     byteBuffer.put(paramArrayOfbyte, 0, i);
/*  46 */     byteBuffer.flip();
/*     */     
/*  48 */     this.bytesUsed = i;
/*     */     
/*  50 */     if (this.bufferID == -1) {
/*  51 */       this.bufferID = AL10.alGenBuffers();
/*  52 */       AL10.alBufferData(this.bufferID, (paramInt1 > 1) ? 4355 : 4353, byteBuffer.asShortBuffer(), paramInt2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBytesUsed() {
/*  59 */     return this.bytesUsed;
/*     */   }
/*     */   
/*     */   public long play() {
/*  63 */     return play(1.0F);
/*     */   }
/*     */   
/*     */   public long play(float paramFloat) {
/*  67 */     if (this.audio.noDevice) return 0L; 
/*  68 */     int i = this.audio.obtainSource(false);
/*  69 */     if (i == -1)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/*  74 */       return -1L;
/*     */     }
/*  76 */     this.audio.retain(this, false);
/*     */     
/*  78 */     if (i == -1) return -1L; 
/*  79 */     long l = this.audio.getSoundId(i);
/*  80 */     AL10.alSourcei(i, 4105, this.bufferID);
/*  81 */     AL10.alSourcei(i, 4103, 0);
/*  82 */     AL10.alSourcef(i, 4106, paramFloat);
/*  83 */     AL10.alSourcePlay(i);
/*  84 */     return l;
/*     */   }
/*     */   
/*     */   public long loop() {
/*  88 */     return loop(1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public long loop(float paramFloat) {
/*  93 */     if (this.audio.noDevice) return 0L; 
/*  94 */     int i = this.audio.obtainSource(false);
/*  95 */     if (i == -1) return -1L; 
/*  96 */     long l = this.audio.getSoundId(i);
/*  97 */     AL10.alSourcei(i, 4105, this.bufferID);
/*  98 */     AL10.alSourcei(i, 4103, 1);
/*  99 */     AL10.alSourcef(i, 4106, paramFloat);
/* 100 */     AL10.alSourcePlay(i);
/* 101 */     return l;
/*     */   }
/*     */   
/*     */   public void stop() {
/* 105 */     if (this.audio.noDevice)
/* 106 */       return;  this.audio.stopSourcesWithBuffer(this.bufferID);
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 110 */     if (this.audio.noDevice)
/* 111 */       return;  if (this.bufferID == -1)
/* 112 */       return;  this.audio.freeBuffer(this.bufferID);
/* 113 */     AL10.alDeleteBuffers(this.bufferID);
/* 114 */     this.bufferID = -1;
/* 115 */     this.audio.forget(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stop(long paramLong) {
/* 120 */     if (this.audio.noDevice)
/* 121 */       return;  this.audio.stopSound(paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public void pause() {
/* 126 */     if (this.audio.noDevice)
/* 127 */       return;  this.audio.pauseSourcesWithBuffer(this.bufferID);
/*     */   }
/*     */ 
/*     */   
/*     */   public void pause(long paramLong) {
/* 132 */     if (this.audio.noDevice)
/* 133 */       return;  this.audio.pauseSound(paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public void resume() {
/* 138 */     if (this.audio.noDevice)
/* 139 */       return;  this.audio.resumeSourcesWithBuffer(this.bufferID);
/*     */   }
/*     */ 
/*     */   
/*     */   public void resume(long paramLong) {
/* 144 */     if (this.audio.noDevice)
/* 145 */       return;  this.audio.resumeSound(paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPitch(long paramLong, float paramFloat) {
/* 150 */     if (this.audio.noDevice)
/* 151 */       return;  this.audio.setSoundPitch(paramLong, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVolume(long paramLong, float paramFloat) {
/* 156 */     if (this.audio.noDevice)
/* 157 */       return;  this.audio.setSoundGain(paramLong, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLooping(long paramLong, boolean paramBoolean) {
/* 162 */     if (this.audio.noDevice)
/* 163 */       return;  this.audio.setSoundLooping(paramLong, paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPan(long paramLong, float paramFloat1, float paramFloat2) {
/* 168 */     if (this.audio.noDevice)
/* 169 */       return;  this.audio.setSoundPan(paramLong, paramFloat1, paramFloat2);
/*     */   }
/*     */ 
/*     */   
/*     */   public long play(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 174 */     long l = play();
/* 175 */     setPitch(l, paramFloat2);
/* 176 */     setPan(l, paramFloat3, paramFloat1);
/* 177 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public long loop(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 182 */     long l = loop();
/* 183 */     setPitch(l, paramFloat2);
/* 184 */     setPan(l, paramFloat3, paramFloat1);
/* 185 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public float duration() {
/* 190 */     return this.duration;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\OpenALSound.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
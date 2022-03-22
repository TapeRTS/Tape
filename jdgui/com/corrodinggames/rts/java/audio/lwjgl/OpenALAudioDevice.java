/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.java.audio.AudioDevice;
/*     */ import com.corrodinggames.rts.java.audio.a.c;
/*     */ import com.corrodinggames.rts.java.audio.a.m;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OpenALAudioDevice
/*     */   implements AudioDevice
/*     */ {
/*     */   private static final int bytesPerSample = 2;
/*     */   private final OpenALAudio audio;
/*     */   private final int channels;
/*     */   private IntBuffer buffers;
/*  38 */   private int sourceID = -1; private int format;
/*     */   private int sampleRate;
/*     */   private boolean isPlaying;
/*  41 */   private float volume = 1.0F; private float renderedSeconds;
/*     */   private float secondsPerBuffer;
/*     */   private byte[] bytes;
/*     */   private final int bufferSize;
/*     */   private final int bufferCount;
/*     */   private final ByteBuffer tempBuffer;
/*     */   
/*     */   public OpenALAudioDevice(OpenALAudio paramOpenALAudio, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
/*  49 */     this.audio = paramOpenALAudio;
/*  50 */     this.channels = paramBoolean ? 1 : 2;
/*  51 */     this.bufferSize = paramInt2;
/*  52 */     this.bufferCount = paramInt3;
/*  53 */     this.format = (this.channels > 1) ? 4355 : 4353;
/*  54 */     this.sampleRate = paramInt1;
/*  55 */     this.secondsPerBuffer = paramInt2 / 2.0F / this.channels / paramInt1;
/*  56 */     this.tempBuffer = BufferUtils.createByteBuffer(paramInt2);
/*     */   }
/*     */   
/*     */   public void writeSamples(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
/*  60 */     if (this.bytes == null || this.bytes.length < paramInt2 * 2) this.bytes = new byte[paramInt2 * 2]; 
/*  61 */     int i = Math.min(paramInt1 + paramInt2, paramArrayOfshort.length); int j; byte b;
/*  62 */     for (j = paramInt1, b = 0; j < i; j++) {
/*  63 */       short s = paramArrayOfshort[j];
/*  64 */       this.bytes[b++] = (byte)(s & 0xFF);
/*  65 */       this.bytes[b++] = (byte)(s >> 8 & 0xFF);
/*     */     } 
/*  67 */     writeSamples(this.bytes, 0, paramInt2 * 2);
/*     */   }
/*     */   
/*     */   public void writeSamples(float[] paramArrayOffloat, int paramInt1, int paramInt2) {
/*  71 */     if (this.bytes == null || this.bytes.length < paramInt2 * 2) this.bytes = new byte[paramInt2 * 2]; 
/*  72 */     int i = Math.min(paramInt1 + paramInt2, paramArrayOffloat.length); int j; byte b;
/*  73 */     for (j = paramInt1, b = 0; j < i; j++) {
/*  74 */       float f = paramArrayOffloat[j];
/*  75 */       f = m.a(f, -1.0F, 1.0F);
/*  76 */       int k = (int)(f * 32767.0F);
/*  77 */       this.bytes[b++] = (byte)(k & 0xFF);
/*  78 */       this.bytes[b++] = (byte)(k >> 8 & 0xFF);
/*     */     } 
/*  80 */     writeSamples(this.bytes, 0, paramInt2 * 2);
/*     */   }
/*     */   
/*     */   public void writeSamples(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  84 */     if (paramInt2 < 0) throw new IllegalArgumentException("length cannot be < 0.");
/*     */     
/*  86 */     if (this.sourceID == -1) {
/*  87 */       this.sourceID = this.audio.obtainSource(true);
/*  88 */       if (this.sourceID == -1)
/*  89 */         return;  if (this.buffers == null) {
/*  90 */         this.buffers = BufferUtils.createIntBuffer(this.bufferCount);
/*  91 */         AL10.alGenBuffers(this.buffers);
/*  92 */         if (AL10.alGetError() != 0) throw new c("Unabe to allocate audio buffers."); 
/*     */       } 
/*  94 */       AL10.alSourcei(this.sourceID, 4103, 0);
/*  95 */       AL10.alSourcef(this.sourceID, 4106, this.volume);
/*     */       
/*  97 */       byte b1 = 0; byte b2;
/*  98 */       for (b2 = 0; b2 < this.bufferCount; b2++) {
/*  99 */         int i = this.buffers.get(b2);
/* 100 */         int j = Math.min(this.bufferSize, paramInt2);
/* 101 */         this.tempBuffer.clear();
/* 102 */         this.tempBuffer.put(paramArrayOfbyte, paramInt1, j).flip();
/* 103 */         AL10.alBufferData(i, this.format, this.tempBuffer, this.sampleRate);
/* 104 */         AL10.alSourceQueueBuffers(this.sourceID, i);
/* 105 */         paramInt2 -= j;
/* 106 */         paramInt1 += j;
/* 107 */         b1++;
/*     */       } 
/*     */       
/* 110 */       this.tempBuffer.clear().flip();
/* 111 */       for (b2 = b1; b2 < this.bufferCount; b2++) {
/* 112 */         int i = this.buffers.get(b2);
/* 113 */         AL10.alBufferData(i, this.format, this.tempBuffer, this.sampleRate);
/* 114 */         AL10.alSourceQueueBuffers(this.sourceID, i);
/*     */       } 
/* 116 */       AL10.alSourcePlay(this.sourceID);
/* 117 */       this.isPlaying = true;
/*     */     } 
/*     */     
/* 120 */     while (paramInt2 > 0) {
/* 121 */       int i = fillBuffer(paramArrayOfbyte, paramInt1, paramInt2);
/* 122 */       paramInt2 -= i;
/* 123 */       paramInt1 += i;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private int fillBuffer(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 129 */     int i = Math.min(this.bufferSize, paramInt2);
/*     */ 
/*     */     
/*     */     while (true) {
/* 133 */       int j = AL10.alGetSourcei(this.sourceID, 4118);
/* 134 */       if (j-- > 0) {
/* 135 */         int k = AL10.alSourceUnqueueBuffers(this.sourceID);
/* 136 */         if (k != 40963) {
/* 137 */           this.renderedSeconds += this.secondsPerBuffer;
/*     */           
/* 139 */           this.tempBuffer.clear();
/* 140 */           this.tempBuffer.put(paramArrayOfbyte, paramInt1, i).flip();
/* 141 */           AL10.alBufferData(k, this.format, this.tempBuffer, this.sampleRate);
/*     */           
/* 143 */           AL10.alSourceQueueBuffers(this.sourceID, k);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       try {
/* 148 */         Thread.sleep((long)(1000.0F * this.secondsPerBuffer));
/* 149 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 154 */     if (!this.isPlaying || AL10.alGetSourcei(this.sourceID, 4112) != 4114) {
/* 155 */       AL10.alSourcePlay(this.sourceID);
/* 156 */       this.isPlaying = true;
/*     */     } 
/*     */     
/* 159 */     return i;
/*     */   }
/*     */   
/*     */   public void stop() {
/* 163 */     if (this.sourceID == -1)
/* 164 */       return;  this.audio.freeSource(this.sourceID);
/* 165 */     this.sourceID = -1;
/* 166 */     this.renderedSeconds = 0.0F;
/* 167 */     this.isPlaying = false;
/*     */   }
/*     */   
/*     */   public boolean isPlaying() {
/* 171 */     if (this.sourceID == -1) return false; 
/* 172 */     return this.isPlaying;
/*     */   }
/*     */   
/*     */   public void setVolume(float paramFloat) {
/* 176 */     this.volume = paramFloat;
/* 177 */     if (this.sourceID != -1) AL10.alSourcef(this.sourceID, 4106, paramFloat); 
/*     */   }
/*     */   
/*     */   public float getPosition() {
/* 181 */     if (this.sourceID == -1) return 0.0F; 
/* 182 */     return this.renderedSeconds + AL10.alGetSourcef(this.sourceID, 4132);
/*     */   }
/*     */   
/*     */   public void setPosition(float paramFloat) {
/* 186 */     this.renderedSeconds = paramFloat;
/*     */   }
/*     */   
/*     */   public int getChannels() {
/* 190 */     return (this.format == 4355) ? 2 : 1;
/*     */   }
/*     */   
/*     */   public int getRate() {
/* 194 */     return this.sampleRate;
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 198 */     if (this.buffers == null)
/* 199 */       return;  if (this.sourceID != -1) {
/* 200 */       this.audio.freeSource(this.sourceID);
/* 201 */       this.sourceID = -1;
/*     */     } 
/* 203 */     AL10.alDeleteBuffers(this.buffers);
/* 204 */     this.buffers = null;
/*     */   }
/*     */   
/*     */   public boolean isMono() {
/* 208 */     return (this.channels == 1);
/*     */   }
/*     */   
/*     */   public int getLatency() {
/* 212 */     return (int)(this.secondsPerBuffer * this.bufferCount * 1000.0F);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\OpenALAudioDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
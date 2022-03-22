/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.java.audio.Music;
/*     */ import com.corrodinggames.rts.java.audio.a.a;
/*     */ import com.corrodinggames.rts.java.audio.a.b;
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
/*     */ 
/*     */ public abstract class OpenALMusic
/*     */   implements Music
/*     */ {
/*     */   private static final int bufferSize = 40960;
/*     */   private static final int bufferCount = 3;
/*     */   private static final int bytesPerSample = 2;
/*  40 */   private static final byte[] tempBytes = new byte[40960];
/*  41 */   private static final ByteBuffer tempBuffer = BufferUtils.createByteBuffer(40960);
/*     */   
/*  43 */   private b renderedSecondsQueue = new b(3);
/*     */   
/*     */   private final OpenALAudio audio;
/*     */   private IntBuffer buffers;
/*  47 */   private int sourceID = -1;
/*     */   private int format;
/*     */   private int sampleRate;
/*  50 */   private float volume = 1.0F; private boolean isLooping; private boolean isPlaying;
/*  51 */   private float pan = 0.0F;
/*     */   private float renderedSeconds;
/*     */   private float maxSecondsPerBuffer;
/*     */   protected final a file;
/*  55 */   protected int bufferOverhead = 0;
/*     */   
/*     */   private Music.OnCompletionListener onCompletionListener;
/*     */   
/*     */   public OpenALMusic(OpenALAudio paramOpenALAudio, a parama) {
/*  60 */     this.audio = paramOpenALAudio;
/*  61 */     this.file = parama;
/*  62 */     this.onCompletionListener = null;
/*     */   }
/*     */   
/*     */   protected void setup(int paramInt1, int paramInt2) {
/*  66 */     this.format = (paramInt1 > 1) ? 4355 : 4353;
/*  67 */     this.sampleRate = paramInt2;
/*  68 */     this.maxSecondsPerBuffer = (40960 - this.bufferOverhead) / (2 * paramInt1 * paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void playWhenReady() {
/*  75 */     if (this.audio.noDevice) {
/*     */       return;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void play() {
/*  83 */     if (this.audio.noDevice)
/*  84 */       return;  if (this.sourceID == -1) {
/*  85 */       this.sourceID = this.audio.obtainSource(true);
/*  86 */       if (this.sourceID == -1)
/*     */         return; 
/*  88 */       this.audio.music.add(this);
/*     */       
/*  90 */       if (this.buffers == null) {
/*  91 */         this.buffers = BufferUtils.createIntBuffer(3);
/*  92 */         AL10.alGenBuffers(this.buffers);
/*  93 */         int i = AL10.alGetError();
/*  94 */         if (i != 0)
/*  95 */           throw new c("Unable to allocate audio buffers. AL Error: " + i); 
/*     */       } 
/*  97 */       AL10.alSourcei(this.sourceID, 4103, 0);
/*  98 */       setPan(this.pan, this.volume);
/*     */       
/* 100 */       boolean bool = false;
/* 101 */       for (byte b1 = 0; b1 < 3; b1++) {
/* 102 */         int i = this.buffers.get(b1);
/* 103 */         if (!fill(i))
/* 104 */           break;  bool = true;
/* 105 */         AL10.alSourceQueueBuffers(this.sourceID, i);
/*     */       } 
/* 107 */       if (!bool && this.onCompletionListener != null) this.onCompletionListener.onCompletion(this);
/*     */       
/* 109 */       if (AL10.alGetError() != 0) {
/* 110 */         stop();
/*     */         return;
/*     */       } 
/*     */     } 
/* 114 */     if (!this.isPlaying) {
/* 115 */       AL10.alSourcePlay(this.sourceID);
/* 116 */       this.isPlaying = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void stop() {
/* 121 */     if (this.audio.noDevice)
/* 122 */       return;  if (this.sourceID == -1)
/* 123 */       return;  this.audio.music.remove(this);
/* 124 */     reset();
/* 125 */     this.audio.freeSource(this.sourceID);
/* 126 */     this.sourceID = -1;
/* 127 */     this.renderedSeconds = 0.0F;
/* 128 */     this.renderedSecondsQueue.c();
/* 129 */     this.isPlaying = false;
/*     */   }
/*     */   
/*     */   public void pause() {
/* 133 */     if (this.audio.noDevice)
/* 134 */       return;  if (this.sourceID != -1) AL10.alSourcePause(this.sourceID); 
/* 135 */     this.isPlaying = false;
/*     */   }
/*     */   
/*     */   public boolean isPlaying() {
/* 139 */     if (this.audio.noDevice) return false; 
/* 140 */     if (this.sourceID == -1) return false; 
/* 141 */     return this.isPlaying;
/*     */   }
/*     */   
/*     */   public void setLooping(boolean paramBoolean) {
/* 145 */     this.isLooping = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean isLooping() {
/* 149 */     return this.isLooping;
/*     */   }
/*     */   
/*     */   public void setVolume(float paramFloat) {
/* 153 */     this.volume = paramFloat;
/* 154 */     if (this.audio.noDevice)
/* 155 */       return;  if (this.sourceID != -1) AL10.alSourcef(this.sourceID, 4106, paramFloat); 
/*     */   }
/*     */   
/*     */   public float getVolume() {
/* 159 */     return this.volume;
/*     */   }
/*     */   
/*     */   public void setPan(float paramFloat1, float paramFloat2) {
/* 163 */     this.volume = paramFloat2;
/* 164 */     this.pan = paramFloat1;
/* 165 */     if (this.audio.noDevice)
/* 166 */       return;  if (this.sourceID == -1)
/* 167 */       return;  AL10.alSource3f(this.sourceID, 4100, m.b((paramFloat1 - 1.0F) * 3.1415927F / 2.0F), 0.0F, 
/* 168 */         m.a((paramFloat1 + 1.0F) * 3.1415927F / 2.0F));
/* 169 */     AL10.alSourcef(this.sourceID, 4106, paramFloat2);
/*     */   }
/*     */   
/*     */   public void setPosition(float paramFloat) {
/* 173 */     if (this.audio.noDevice)
/* 174 */       return;  if (this.sourceID == -1)
/* 175 */       return;  boolean bool = this.isPlaying;
/* 176 */     this.isPlaying = false;
/* 177 */     AL10.alSourceStop(this.sourceID);
/* 178 */     AL10.alSourceUnqueueBuffers(this.sourceID, this.buffers);
/* 179 */     while (this.renderedSecondsQueue.b > 0) {
/* 180 */       this.renderedSeconds = this.renderedSecondsQueue.a();
/*     */     }
/* 182 */     if (paramFloat <= this.renderedSeconds) {
/* 183 */       reset();
/* 184 */       this.renderedSeconds = 0.0F;
/*     */     } 
/* 186 */     while (this.renderedSeconds < paramFloat - this.maxSecondsPerBuffer && 
/* 187 */       read(tempBytes) > 0) {
/* 188 */       this.renderedSeconds += this.maxSecondsPerBuffer;
/*     */     }
/* 190 */     this.renderedSecondsQueue.a(this.renderedSeconds);
/* 191 */     boolean bool1 = false;
/* 192 */     for (byte b1 = 0; b1 < 3; b1++) {
/* 193 */       int i = this.buffers.get(b1);
/* 194 */       if (!fill(i))
/* 195 */         break;  bool1 = true;
/* 196 */       AL10.alSourceQueueBuffers(this.sourceID, i);
/*     */     } 
/* 198 */     this.renderedSecondsQueue.a();
/* 199 */     if (!bool1) {
/* 200 */       stop();
/* 201 */       if (this.onCompletionListener != null) this.onCompletionListener.onCompletion(this); 
/*     */     } 
/* 203 */     AL10.alSourcef(this.sourceID, 4132, paramFloat - this.renderedSeconds);
/* 204 */     if (bool) {
/* 205 */       AL10.alSourcePlay(this.sourceID);
/* 206 */       this.isPlaying = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public float getPosition() {
/* 211 */     if (this.audio.noDevice) return 0.0F; 
/* 212 */     if (this.sourceID == -1) return 0.0F; 
/* 213 */     return this.renderedSeconds + AL10.alGetSourcef(this.sourceID, 4132);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int read(byte[] paramArrayOfbyte);
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void loop() {
/* 228 */     reset();
/*     */   }
/*     */   
/*     */   public int getChannels() {
/* 232 */     return (this.format == 4355) ? 2 : 1;
/*     */   }
/*     */   
/*     */   public int getRate() {
/* 236 */     return this.sampleRate;
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
/*     */   public void backgroundUpdate() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update() {
/* 269 */     if (this.audio.noDevice)
/* 270 */       return;  if (this.sourceID == -1)
/*     */       return; 
/* 272 */     boolean bool = false;
/* 273 */     int i = AL10.alGetSourcei(this.sourceID, 4118);
/* 274 */     while (i-- > 0) {
/* 275 */       int j = AL10.alSourceUnqueueBuffers(this.sourceID);
/* 276 */       if (j == 40963)
/* 277 */         break;  this.renderedSeconds = this.renderedSecondsQueue.a();
/* 278 */       if (bool)
/* 279 */         continue;  if (fill(j)) {
/* 280 */         AL10.alSourceQueueBuffers(this.sourceID, j); continue;
/*     */       } 
/* 282 */       bool = true;
/*     */     } 
/* 284 */     if (bool && AL10.alGetSourcei(this.sourceID, 4117) == 0) {
/* 285 */       stop();
/* 286 */       if (this.onCompletionListener != null) this.onCompletionListener.onCompletion(this);
/*     */     
/*     */     } 
/*     */     
/* 290 */     if (this.isPlaying && AL10.alGetSourcei(this.sourceID, 4112) != 4114) AL10.alSourcePlay(this.sourceID); 
/*     */   }
/*     */   
/*     */   private boolean fill(int paramInt) {
/* 294 */     tempBuffer.clear();
/* 295 */     int i = read(tempBytes);
/* 296 */     if (i <= 0)
/* 297 */       if (this.isLooping) {
/* 298 */         loop();
/* 299 */         i = read(tempBytes);
/* 300 */         if (i <= 0) return false; 
/* 301 */         if (this.renderedSecondsQueue.b > 0) {
/* 302 */           this.renderedSecondsQueue.a(0, 0.0F);
/*     */         }
/*     */       } else {
/* 305 */         return false;
/*     */       }  
/* 307 */     float f1 = (this.renderedSecondsQueue.b > 0) ? this.renderedSecondsQueue.b() : 0.0F;
/* 308 */     float f2 = this.maxSecondsPerBuffer * i / 40960.0F;
/* 309 */     this.renderedSecondsQueue.b(0, f1 + f2);
/*     */     
/* 311 */     tempBuffer.put(tempBytes, 0, i).flip();
/* 312 */     AL10.alBufferData(paramInt, this.format, tempBuffer, this.sampleRate);
/* 313 */     return true;
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 317 */     stop();
/* 318 */     if (this.audio.noDevice)
/* 319 */       return;  if (this.buffers == null)
/* 320 */       return;  AL10.alDeleteBuffers(this.buffers);
/* 321 */     this.buffers = null;
/* 322 */     this.onCompletionListener = null;
/*     */   }
/*     */   
/*     */   public void setOnCompletionListener(Music.OnCompletionListener paramOnCompletionListener) {
/* 326 */     this.onCompletionListener = paramOnCompletionListener;
/*     */   }
/*     */   
/*     */   public int getSourceId() {
/* 330 */     return this.sourceID;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\OpenALMusic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.java.audio.Audio;
/*     */ import com.corrodinggames.rts.java.audio.AudioDevice;
/*     */ import com.corrodinggames.rts.java.audio.AudioRecorder;
/*     */ import com.corrodinggames.rts.java.audio.Music;
/*     */ import com.corrodinggames.rts.java.audio.Sound;
/*     */ import com.corrodinggames.rts.java.audio.a.a;
/*     */ import com.corrodinggames.rts.java.audio.a.c;
/*     */ import com.corrodinggames.rts.java.audio.a.d;
/*     */ import com.corrodinggames.rts.java.audio.a.e;
/*     */ import com.corrodinggames.rts.java.audio.a.i;
/*     */ import com.corrodinggames.rts.java.audio.a.m;
/*     */ import com.corrodinggames.rts.java.audio.a.o;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.openal.AL;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import org.lwjgl.openal.OpenALException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OpenALAudio
/*     */   implements Audio
/*     */ {
/*     */   private final int deviceBufferSize;
/*     */   private final int deviceBufferCount;
/*     */   private d idleSources;
/*     */   private d allSources;
/*     */   private i soundIdToSource;
/*     */   private e sourceToSoundId;
/*  49 */   private long nextSoundId = 0L;
/*  50 */   private o extensionToSoundClass = new o();
/*     */   
/*  52 */   private o extensionToMusicClass = new o();
/*     */   
/*     */   private OpenALSound[] recentSounds;
/*  55 */   private int mostRecetSound = -1;
/*     */   
/*  57 */   ArrayList music = new ArrayList();
/*     */   
/*     */   boolean noDevice = false;
/*     */ 
/*     */   
/*     */   public OpenALAudio() {
/*  63 */     this(16, 9, 512);
/*     */   }
/*     */   
/*     */   public OpenALAudio(int paramInt1, int paramInt2, int paramInt3) {
/*  67 */     this.deviceBufferSize = paramInt3;
/*  68 */     this.deviceBufferCount = paramInt2;
/*     */     
/*  70 */     registerSound("ogg", Ogg$Sound.class);
/*  71 */     registerMusic("ogg", Ogg$Music.class);
/*  72 */     registerSound("wav", Wav$Sound.class);
/*  73 */     registerMusic("wav", Wav$Music.class);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  78 */       AL.create();
/*  79 */     } catch (LWJGLException lWJGLException) {
/*  80 */       this.noDevice = true;
/*  81 */       lWJGLException.printStackTrace();
/*     */       
/*     */       return;
/*  84 */     } catch (OpenALException openALException) {
/*  85 */       this.noDevice = true;
/*  86 */       openALException.printStackTrace();
/*     */       
/*     */       return;
/*  89 */     } catch (NullPointerException nullPointerException) {
/*     */       
/*  91 */       this.noDevice = true;
/*  92 */       nullPointerException.printStackTrace();
/*     */       
/*     */       return;
/*     */     } 
/*  96 */     this.allSources = new d(false, paramInt1);
/*  97 */     for (byte b = 0; b < paramInt1; b++) {
/*  98 */       int j = AL10.alGenSources();
/*  99 */       if (AL10.alGetError() != 0)
/* 100 */         break;  this.allSources.a(j);
/*     */     } 
/* 102 */     this.idleSources = new d(this.allSources);
/* 103 */     this.soundIdToSource = new i();
/* 104 */     this.sourceToSoundId = new e();
/*     */ 
/*     */     
/* 107 */     FloatBuffer floatBuffer1 = (FloatBuffer)BufferUtils.createFloatBuffer(6).put(new float[] { 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F }).flip();
/* 108 */     AL10.alListener(4111, floatBuffer1);
/* 109 */     FloatBuffer floatBuffer2 = (FloatBuffer)BufferUtils.createFloatBuffer(3).put(new float[] { 0.0F, 0.0F, 0.0F }).flip();
/* 110 */     AL10.alListener(4102, floatBuffer2);
/* 111 */     FloatBuffer floatBuffer3 = (FloatBuffer)BufferUtils.createFloatBuffer(3).put(new float[] { 0.0F, 0.0F, 0.0F }).flip();
/* 112 */     AL10.alListener(4100, floatBuffer3);
/*     */     
/* 114 */     this.recentSounds = new OpenALSound[paramInt1];
/*     */   }
/*     */   
/*     */   public void registerSound(String paramString, Class paramClass) {
/* 118 */     if (paramString == null) throw new IllegalArgumentException("extension cannot be null."); 
/* 119 */     if (paramClass == null) throw new IllegalArgumentException("soundClass cannot be null."); 
/* 120 */     this.extensionToSoundClass.a(paramString, paramClass);
/*     */   }
/*     */   
/*     */   public void registerMusic(String paramString, Class paramClass) {
/* 124 */     if (paramString == null) throw new IllegalArgumentException("extension cannot be null."); 
/* 125 */     if (paramClass == null) throw new IllegalArgumentException("musicClass cannot be null."); 
/* 126 */     this.extensionToMusicClass.a(paramString, paramClass);
/*     */   }
/*     */   
/*     */   public OpenALSound newSound(a parama) {
/* 130 */     if (parama == null) throw new IllegalArgumentException("file cannot be null."); 
/* 131 */     Class<OpenALSound> clazz = (Class)this.extensionToSoundClass.a(parama.b().toLowerCase(Locale.ROOT));
/* 132 */     if (clazz == null) throw new c("Unknown file extension for sound: " + parama); 
/*     */     try {
/* 134 */       return clazz.getConstructor(new Class[] { OpenALAudio.class, a.class }).newInstance(new Object[] { this, parama });
/* 135 */     } catch (Exception exception) {
/* 136 */       throw new c("Error creating sound " + clazz.getName() + " for file: " + parama, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public OpenALMusic newMusic(a parama) {
/* 141 */     if (parama == null) throw new IllegalArgumentException("file cannot be null."); 
/* 142 */     Class<OpenALMusic> clazz = (Class)this.extensionToMusicClass.a(parama.b().toLowerCase(Locale.ROOT));
/* 143 */     if (clazz == null) throw new c("Unknown file extension for music: " + parama); 
/*     */     try {
/* 145 */       return clazz.getConstructor(new Class[] { OpenALAudio.class, a.class }).newInstance(new Object[] { this, parama });
/* 146 */     } catch (Exception exception) {
/* 147 */       throw new c("Error creating music " + clazz.getName() + " for file: " + parama, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   int obtainSource(boolean paramBoolean) {
/* 152 */     if (this.noDevice) return 0;  byte b; int j;
/* 153 */     for (b = 0, j = this.idleSources.b; b < j; b++) {
/* 154 */       int k = this.idleSources.b(b);
/* 155 */       int m = AL10.alGetSourcei(k, 4112);
/* 156 */       if (m != 4114 && m != 4115) {
/* 157 */         if (paramBoolean) {
/* 158 */           this.idleSources.c(b);
/*     */         } else {
/* 160 */           if (this.sourceToSoundId.e(k)) {
/* 161 */             long l1 = ((Long)this.sourceToSoundId.a(k)).longValue();
/* 162 */             this.sourceToSoundId.b(k);
/* 163 */             this.soundIdToSource.b(l1);
/*     */           } 
/*     */           
/* 166 */           long l = this.nextSoundId++;
/* 167 */           this.sourceToSoundId.a(k, Long.valueOf(l));
/* 168 */           this.soundIdToSource.a(l, Integer.valueOf(k));
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 173 */         AL10.alSourceStop(k);
/* 174 */         AL10.alSourcei(k, 4105, 0);
/* 175 */         AL10.alSourcef(k, 4106, 1.0F);
/* 176 */         AL10.alSourcef(k, 4099, 1.0F);
/* 177 */         AL10.alSource3f(k, 4100, 0.0F, 0.0F, 1.0F);
/* 178 */         return k;
/*     */       } 
/*     */     } 
/* 181 */     return -1;
/*     */   }
/*     */   
/*     */   void freeSource(int paramInt) {
/* 185 */     if (this.noDevice)
/* 186 */       return;  AL10.alSourceStop(paramInt);
/* 187 */     AL10.alSourcei(paramInt, 4105, 0);
/* 188 */     if (this.sourceToSoundId.e(paramInt)) {
/* 189 */       long l = ((Long)this.sourceToSoundId.b(paramInt)).longValue();
/* 190 */       this.soundIdToSource.b(l);
/*     */     } 
/* 192 */     this.idleSources.a(paramInt);
/*     */   }
/*     */   
/*     */   void freeBuffer(int paramInt) {
/* 196 */     if (this.noDevice)
/* 197 */       return;  byte b; int j; for (b = 0, j = this.idleSources.b; b < j; b++) {
/* 198 */       int k = this.idleSources.b(b);
/* 199 */       if (AL10.alGetSourcei(k, 4105) == paramInt) {
/* 200 */         if (this.sourceToSoundId.e(k)) {
/* 201 */           long l = ((Long)this.sourceToSoundId.b(k)).longValue();
/* 202 */           this.soundIdToSource.b(l);
/*     */         } 
/* 204 */         AL10.alSourceStop(k);
/* 205 */         AL10.alSourcei(k, 4105, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   void stopSourcesWithBuffer(int paramInt) {
/* 211 */     if (this.noDevice)
/* 212 */       return;  byte b; int j; for (b = 0, j = this.idleSources.b; b < j; b++) {
/* 213 */       int k = this.idleSources.b(b);
/* 214 */       if (AL10.alGetSourcei(k, 4105) == paramInt) {
/* 215 */         if (this.sourceToSoundId.e(k)) {
/* 216 */           long l = ((Long)this.sourceToSoundId.b(k)).longValue();
/* 217 */           this.soundIdToSource.b(l);
/*     */         } 
/* 219 */         AL10.alSourceStop(k);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   void pauseSourcesWithBuffer(int paramInt) {
/* 225 */     if (this.noDevice)
/* 226 */       return;  byte b; int j; for (b = 0, j = this.idleSources.b; b < j; b++) {
/* 227 */       int k = this.idleSources.b(b);
/* 228 */       if (AL10.alGetSourcei(k, 4105) == paramInt)
/* 229 */         AL10.alSourcePause(k); 
/*     */     } 
/*     */   }
/*     */   
/*     */   void resumeSourcesWithBuffer(int paramInt) {
/* 234 */     if (this.noDevice)
/* 235 */       return;  byte b; int j; for (b = 0, j = this.idleSources.b; b < j; b++) {
/* 236 */       int k = this.idleSources.b(b);
/* 237 */       if (AL10.alGetSourcei(k, 4105) == paramInt && 
/* 238 */         AL10.alGetSourcei(k, 4112) == 4115) {
/* 239 */         AL10.alSourcePlay(k);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void backgroundUpdate() {
/* 245 */     if (this.noDevice) {
/*     */       return;
/*     */     }
/*     */     
/* 249 */     for (byte b = 0; b < this.music.size(); b++) {
/* 250 */       ((OpenALMusic)this.music.get(b)).backgroundUpdate();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean hasDevice() {
/* 255 */     return this.noDevice;
/*     */   }
/*     */ 
/*     */   
/*     */   public void update() {
/* 260 */     if (this.noDevice)
/* 261 */       return;  for (byte b = 0; b < this.music.size(); b++)
/* 262 */       ((OpenALMusic)this.music.get(b)).update(); 
/*     */   }
/*     */   
/*     */   public long getSoundId(int paramInt) {
/* 266 */     if (!this.sourceToSoundId.e(paramInt)) return -1L; 
/* 267 */     return ((Long)this.sourceToSoundId.a(paramInt)).longValue();
/*     */   }
/*     */   
/*     */   public void stopSound(long paramLong) {
/* 271 */     if (!this.soundIdToSource.d(paramLong))
/* 272 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 273 */     AL10.alSourceStop(j);
/*     */   }
/*     */   
/*     */   public void pauseSound(long paramLong) {
/* 277 */     if (!this.soundIdToSource.d(paramLong))
/* 278 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 279 */     AL10.alSourcePause(j);
/*     */   }
/*     */   
/*     */   public void resumeSound(long paramLong) {
/* 283 */     if (!this.soundIdToSource.d(paramLong))
/* 284 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 285 */     if (AL10.alGetSourcei(j, 4112) == 4115)
/* 286 */       AL10.alSourcePlay(j); 
/*     */   }
/*     */   
/*     */   public void setSoundGain(long paramLong, float paramFloat) {
/* 290 */     if (!this.soundIdToSource.d(paramLong))
/* 291 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 292 */     AL10.alSourcef(j, 4106, paramFloat);
/*     */   }
/*     */   
/*     */   public void setSoundLooping(long paramLong, boolean paramBoolean) {
/* 296 */     if (!this.soundIdToSource.d(paramLong))
/* 297 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 298 */     AL10.alSourcei(j, 4103, paramBoolean ? 1 : 0);
/*     */   }
/*     */   
/*     */   public void setSoundPitch(long paramLong, float paramFloat) {
/* 302 */     if (!this.soundIdToSource.d(paramLong))
/* 303 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/* 304 */     AL10.alSourcef(j, 4099, paramFloat);
/*     */   }
/*     */   
/*     */   public void setSoundPan(long paramLong, float paramFloat1, float paramFloat2) {
/* 308 */     if (!this.soundIdToSource.d(paramLong))
/* 309 */       return;  int j = ((Integer)this.soundIdToSource.a(paramLong)).intValue();
/*     */     
/* 311 */     AL10.alSource3f(j, 4100, m.b((paramFloat1 - 1.0F) * 3.1415927F / 2.0F), 0.0F, 
/* 312 */         m.a((paramFloat1 + 1.0F) * 3.1415927F / 2.0F));
/* 313 */     AL10.alSourcef(j, 4106, paramFloat2);
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 317 */     if (this.noDevice)
/* 318 */       return;  byte b; int j; for (b = 0, j = this.allSources.b; b < j; b++) {
/* 319 */       int k = this.allSources.b(b);
/* 320 */       int m = AL10.alGetSourcei(k, 4112);
/* 321 */       if (m != 4116) AL10.alSourceStop(k); 
/* 322 */       AL10.alDeleteSources(k);
/*     */     } 
/*     */     
/* 325 */     this.sourceToSoundId.a();
/* 326 */     this.soundIdToSource.a();
/*     */     
/* 328 */     AL.destroy();
/* 329 */     while (AL.isCreated()) {
/*     */       try {
/* 331 */         Thread.sleep(10L);
/* 332 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public AudioDevice newAudioDevice(int paramInt, boolean paramBoolean) {
/* 338 */     if (this.noDevice) return new OpenALAudio$1(this, paramBoolean);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     return new OpenALAudioDevice(this, paramInt, paramBoolean, this.deviceBufferSize, this.deviceBufferCount);
/*     */   }
/*     */   
/*     */   public AudioRecorder newAudioRecorder(int paramInt, boolean paramBoolean) {
/* 369 */     if (this.noDevice) return new OpenALAudio$2(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 378 */     return new JavaSoundAudioRecorder(paramInt, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void retain(OpenALSound paramOpenALSound, boolean paramBoolean) {
/* 385 */     this.mostRecetSound++;
/* 386 */     this.mostRecetSound %= this.recentSounds.length;
/*     */     
/* 388 */     if (paramBoolean)
/*     */     {
/* 390 */       if (this.recentSounds[this.mostRecetSound] != null) this.recentSounds[this.mostRecetSound].stop();
/*     */     
/*     */     }
/* 393 */     this.recentSounds[this.mostRecetSound] = paramOpenALSound;
/*     */   }
/*     */ 
/*     */   
/*     */   public void forget(OpenALSound paramOpenALSound) {
/* 398 */     for (byte b = 0; b < this.recentSounds.length; b++) {
/* 399 */       if (this.recentSounds[b] == paramOpenALSound) this.recentSounds[b] = null; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\OpenALAudio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.java.audio.a.a;
/*     */ import com.corrodinggames.rts.java.audio.a.c;
/*     */ import com.corrodinggames.rts.java.audio.a.s;
/*     */ import java.io.EOFException;
/*     */ import java.io.FilterInputStream;
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
/*     */ public class Wav$WavInputStream
/*     */   extends FilterInputStream
/*     */ {
/*     */   public int channels;
/*     */   public int sampleRate;
/*     */   public int dataRemaining;
/*     */   
/*     */   public Wav$WavInputStream(a parama) {
/*  79 */     super(parama.a());
/*     */     try {
/*  81 */       if (read() != 82 || read() != 73 || read() != 70 || read() != 70) {
/*  82 */         throw new c("RIFF header not found: " + parama);
/*     */       }
/*  84 */       skipFully(4);
/*     */       
/*  86 */       if (read() != 87 || read() != 65 || read() != 86 || read() != 69) {
/*  87 */         throw new c("Invalid wave file header: " + parama);
/*     */       }
/*  89 */       int i = seekToChunk('f', 'm', 't', ' ');
/*     */ 
/*     */ 
/*     */       
/*  93 */       int j = read() & 0xFF | (read() & 0xFF) << 8;
/*  94 */       if (j != 1) {
/*     */         
/*  96 */         switch (j)
/*     */         { case 2:
/*  98 */             str = "ADPCM";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 115 */             throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");case 3: str = "IEEE float"; throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");case 6: str = "8-bit ITU-T G.711 A-law"; throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");case 7: str = "8-bit ITU-T G.711 u-law"; throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");case 65534: str = "Extensible"; throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")"); }  String str = "Unknown"; throw new c("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");
/*     */       } 
/*     */       
/* 118 */       this.channels = read() & 0xFF | (read() & 0xFF) << 8;
/* 119 */       if (this.channels != 1 && this.channels != 2) throw new c("WAV files must have 1 or 2 channels: " + this.channels);
/*     */       
/* 121 */       this.sampleRate = read() & 0xFF | (read() & 0xFF) << 8 | (read() & 0xFF) << 16 | (read() & 0xFF) << 24;
/*     */       
/* 123 */       skipFully(6);
/*     */       
/* 125 */       int k = read() & 0xFF | (read() & 0xFF) << 8;
/* 126 */       if (k != 16) throw new c("WAV files must have 16 bits per sample: " + k);
/*     */       
/* 128 */       skipFully(i - 16);
/*     */       
/* 130 */       this.dataRemaining = seekToChunk('d', 'a', 't', 'a');
/* 131 */     } catch (Throwable throwable) {
/* 132 */       s.a(this);
/* 133 */       throw new c("Error reading WAV file: " + parama, throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int seekToChunk(char paramChar1, char paramChar2, char paramChar3, char paramChar4) {
/*     */     while (true) {
/* 139 */       int i = (read() == paramChar1) ? 1 : 0;
/* 140 */       i &= (read() == paramChar2) ? 1 : 0;
/* 141 */       i &= (read() == paramChar3) ? 1 : 0;
/* 142 */       i &= (read() == paramChar4) ? 1 : 0;
/* 143 */       int j = read() & 0xFF | (read() & 0xFF) << 8 | (read() & 0xFF) << 16 | (read() & 0xFF) << 24;
/* 144 */       if (j == -1) throw new IOException("Chunk not found: " + paramChar1 + paramChar2 + paramChar3 + paramChar4); 
/* 145 */       if (i != 0) return j; 
/* 146 */       skipFully(j);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void skipFully(int paramInt) {
/* 151 */     while (paramInt > 0) {
/* 152 */       long l = this.in.skip(paramInt);
/* 153 */       if (l <= 0L) throw new EOFException("Unable to skip."); 
/* 154 */       paramInt = (int)(paramInt - l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte) {
/* 159 */     if (this.dataRemaining == 0) return -1; 
/* 160 */     int i = Math.min(super.read(paramArrayOfbyte), this.dataRemaining);
/* 161 */     if (i == -1) return -1; 
/* 162 */     this.dataRemaining -= i;
/* 163 */     return i;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\Wav$WavInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
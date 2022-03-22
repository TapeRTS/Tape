/*     */ package com.corrodinggames.rts.java.audio.lwjgl;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import com.corrodinggames.rts.java.audio.a.c;
/*     */ import com.corrodinggames.rts.java.audio.a.s;
/*     */ import com.jcraft.jogg.Packet;
/*     */ import com.jcraft.jogg.Page;
/*     */ import com.jcraft.jogg.StreamState;
/*     */ import com.jcraft.jogg.SyncState;
/*     */ import com.jcraft.jorbis.Block;
/*     */ import com.jcraft.jorbis.Comment;
/*     */ import com.jcraft.jorbis.DspState;
/*     */ import com.jcraft.jorbis.Info;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteOrder;
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
/*     */ public class OggInputStream
/*     */   extends InputStream
/*     */ {
/*     */   private static final int BUFFER_SIZE = 512;
/*  51 */   private int convsize = 2048;
/*     */   
/*     */   private byte[] convbuffer;
/*     */   
/*     */   private InputStream input;
/*     */   
/*  57 */   private Info oggInfo = new Info();
/*     */ 
/*     */   
/*     */   private boolean endOfStream;
/*     */   
/*  62 */   private SyncState syncState = new SyncState();
/*     */   
/*  64 */   private StreamState streamState = new StreamState();
/*     */   
/*  66 */   private Page page = new Page();
/*     */   
/*  68 */   private Packet packet = new Packet();
/*     */ 
/*     */   
/*  71 */   private Comment comment = new Comment();
/*     */   
/*  73 */   private DspState dspState = new DspState();
/*     */   
/*  75 */   private Block vorbisBlock = new Block(this.dspState);
/*     */ 
/*     */   
/*     */   byte[] buffer;
/*     */   
/*  80 */   int bytes = 0;
/*     */   
/*  82 */   boolean bigEndian = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
/*     */ 
/*     */   
/*     */   boolean endOfBitStream = true;
/*     */ 
/*     */   
/*     */   boolean inited = false;
/*     */   
/*     */   private int readIndex;
/*     */   
/*     */   private byte[] outBuffer;
/*     */   
/*     */   private int outIndex;
/*     */   
/*     */   private int total;
/*     */ 
/*     */   
/*     */   public OggInputStream(InputStream paramInputStream) {
/* 100 */     this(paramInputStream, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OggInputStream(InputStream paramInputStream, OggInputStream paramOggInputStream) {
/* 110 */     if (paramOggInputStream == null) {
/* 111 */       this.convbuffer = new byte[this.convsize];
/* 112 */       this.outBuffer = new byte[2048000];
/*     */     } else {
/* 114 */       this.convbuffer = paramOggInputStream.convbuffer;
/* 115 */       this.outBuffer = paramOggInputStream.outBuffer;
/*     */     } 
/*     */     
/* 118 */     this.input = paramInputStream;
/*     */     try {
/* 120 */       this.total = paramInputStream.available();
/* 121 */     } catch (IOException iOException) {
/* 122 */       throw new c(iOException);
/*     */     } 
/*     */     
/* 125 */     init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLength() {
/* 132 */     return this.total;
/*     */   }
/*     */   
/*     */   public int getChannels() {
/* 136 */     return this.oggInfo.channels;
/*     */   }
/*     */   
/*     */   public int getSampleRate() {
/* 140 */     return this.oggInfo.rate;
/*     */   }
/*     */ 
/*     */   
/*     */   private void init() {
/* 145 */     initVorbis();
/* 146 */     readPCM();
/*     */   }
/*     */ 
/*     */   
/*     */   public int available() {
/* 151 */     return this.endOfStream ? 0 : 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private void initVorbis() {
/* 156 */     this.syncState.init();
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
/*     */   private boolean getPageAndPacket() {
/* 169 */     int i = this.syncState.buffer(512);
/* 170 */     if (i == -1) return false;
/*     */     
/* 172 */     this.buffer = this.syncState.data;
/* 173 */     if (this.buffer == null) {
/* 174 */       this.endOfStream = true;
/* 175 */       return false;
/*     */     } 
/*     */     
/*     */     try {
/* 179 */       this.bytes = this.input.read(this.buffer, i, 512);
/* 180 */     } catch (Exception exception) {
/* 181 */       throw new c("Failure reading Vorbis.", exception);
/*     */     } 
/* 183 */     this.syncState.wrote(this.bytes);
/*     */ 
/*     */     
/* 186 */     if (this.syncState.pageout(this.page) != 1) {
/*     */       
/* 188 */       if (this.bytes < 512) return false;
/*     */ 
/*     */       
/* 191 */       throw new c("Input does not appear to be an Ogg bitstream.");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 196 */     this.streamState.init(this.page.serialno());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     this.oggInfo.init();
/* 207 */     this.comment.init();
/* 208 */     if (this.streamState.pagein(this.page) < 0)
/*     */     {
/* 210 */       throw new c("Error reading first page of Ogg bitstream.");
/*     */     }
/*     */     
/* 213 */     if (this.streamState.packetout(this.packet) != 1)
/*     */     {
/* 215 */       throw new c("Error reading initial header packet.");
/*     */     }
/*     */     
/* 218 */     if (this.oggInfo.synthesis_headerin(this.comment, this.packet) < 0)
/*     */     {
/* 220 */       throw new c("Ogg bitstream does not contain Vorbis audio data.");
/*     */     }
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
/* 233 */     byte b = 0;
/* 234 */     while (b < 2) {
/* 235 */       while (b < 2) {
/* 236 */         int j = this.syncState.pageout(this.page);
/* 237 */         if (j == 0) {
/*     */           break;
/*     */         }
/*     */         
/* 241 */         if (j == 1) {
/* 242 */           this.streamState.pagein(this.page);
/*     */ 
/*     */           
/* 245 */           while (b < 2) {
/* 246 */             j = this.streamState.packetout(this.packet);
/* 247 */             if (j == 0)
/* 248 */               break;  if (j == -1)
/*     */             {
/*     */               
/* 251 */               throw new c("Corrupt secondary header.");
/*     */             }
/*     */             
/* 254 */             this.oggInfo.synthesis_headerin(this.comment, this.packet);
/* 255 */             b++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 260 */       i = this.syncState.buffer(512);
/* 261 */       if (i == -1) return false; 
/* 262 */       this.buffer = this.syncState.data;
/*     */       try {
/* 264 */         this.bytes = this.input.read(this.buffer, i, 512);
/* 265 */       } catch (Exception exception) {
/* 266 */         throw new c("Failed to read Vorbis.", exception);
/*     */       } 
/* 268 */       if (this.bytes == 0 && b < 2) {
/* 269 */         throw new c("End of file before finding all Vorbis headers.");
/*     */       }
/* 271 */       this.syncState.wrote(this.bytes);
/*     */     } 
/*     */     
/* 274 */     this.convsize = 512 / this.oggInfo.channels;
/*     */ 
/*     */ 
/*     */     
/* 278 */     this.dspState.synthesis_init(this.oggInfo);
/* 279 */     this.vorbisBlock.init(this.dspState);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 285 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readPCM() {
/* 290 */     boolean bool = false;
/*     */     
/*     */     while (true) {
/* 293 */       if (this.endOfBitStream) {
/* 294 */         if (!getPageAndPacket()) {
/*     */           break;
/*     */         }
/* 297 */         this.endOfBitStream = false;
/*     */       } 
/*     */       
/* 300 */       if (!this.inited) {
/* 301 */         this.inited = true;
/*     */         
/*     */         return;
/*     */       } 
/* 305 */       float[][][] arrayOfFloat = new float[1][][];
/* 306 */       int[] arrayOfInt = new int[this.oggInfo.channels];
/*     */       
/* 308 */       while (!this.endOfBitStream) {
/* 309 */         while (!this.endOfBitStream) {
/* 310 */           int i = this.syncState.pageout(this.page);
/*     */           
/* 312 */           if (i == 0) {
/*     */             break;
/*     */           }
/*     */           
/* 316 */           if (i == -1) {
/*     */ 
/*     */             
/* 319 */             l.b("gdx-audio", "Error reading OGG: Corrupt or missing data in bitstream."); continue;
/*     */           } 
/* 321 */           this.streamState.pagein(this.page);
/*     */           
/*     */           while (true) {
/* 324 */             i = this.streamState.packetout(this.packet);
/*     */             
/* 326 */             if (i == 0)
/* 327 */               break;  if (i == -1) {
/*     */               continue;
/*     */             }
/*     */ 
/*     */             
/* 332 */             if (this.vorbisBlock.synthesis(this.packet) == 0) {
/* 333 */               this.dspState.synthesis_blockin(this.vorbisBlock);
/*     */             }
/*     */ 
/*     */ 
/*     */             
/*     */             int j;
/*     */ 
/*     */             
/* 341 */             while ((j = this.dspState.synthesis_pcmout(arrayOfFloat, arrayOfInt)) > 0) {
/* 342 */               float[][] arrayOfFloat1 = arrayOfFloat[0];
/*     */               
/* 344 */               int k = (j < this.convsize) ? j : this.convsize;
/*     */               
/*     */               int m;
/*     */               
/* 348 */               for (m = 0; m < this.oggInfo.channels; m++) {
/* 349 */                 int n = m * 2;
/*     */                 
/* 351 */                 int i1 = arrayOfInt[m];
/* 352 */                 for (byte b = 0; b < k; b++) {
/* 353 */                   int i2 = (int)(arrayOfFloat1[m][i1 + b] * 32767.0D);
/*     */                   
/* 355 */                   if (i2 > 32767) {
/* 356 */                     i2 = 32767;
/*     */                   }
/* 358 */                   if (i2 < -32768) {
/* 359 */                     i2 = -32768;
/*     */                   }
/* 361 */                   if (i2 < 0) i2 |= 0x8000;
/*     */                   
/* 363 */                   if (this.bigEndian) {
/* 364 */                     this.convbuffer[n] = (byte)(i2 >>> 8);
/* 365 */                     this.convbuffer[n + 1] = (byte)i2;
/*     */                   } else {
/* 367 */                     this.convbuffer[n] = (byte)i2;
/* 368 */                     this.convbuffer[n + 1] = (byte)(i2 >>> 8);
/*     */                   } 
/* 370 */                   n += 2 * this.oggInfo.channels;
/*     */                 } 
/*     */               } 
/*     */               
/* 374 */               m = 2 * this.oggInfo.channels * k;
/* 375 */               if (this.outIndex + m > this.outBuffer.length) {
/* 376 */                 throw new c("Ogg block too big to be buffered: " + m + ", " + (this.outBuffer.length - this.outIndex));
/*     */               }
/*     */               
/* 379 */               System.arraycopy(this.convbuffer, 0, this.outBuffer, this.outIndex, m);
/* 380 */               this.outIndex += m;
/*     */ 
/*     */               
/* 383 */               bool = true;
/* 384 */               this.dspState.synthesis_read(k);
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 390 */           if (this.page.eos() != 0) {
/* 391 */             this.endOfBitStream = true;
/*     */           }
/*     */           
/* 394 */           if (!this.endOfBitStream && bool) {
/*     */             return;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 400 */         if (!this.endOfBitStream) {
/* 401 */           this.bytes = 0;
/* 402 */           int i = this.syncState.buffer(512);
/* 403 */           if (i >= 0) {
/* 404 */             this.buffer = this.syncState.data;
/*     */             try {
/* 406 */               this.bytes = this.input.read(this.buffer, i, 512);
/* 407 */             } catch (Exception exception) {
/* 408 */               throw new c("Error during Vorbis decoding.", exception);
/*     */             } 
/*     */           } else {
/* 411 */             this.bytes = 0;
/*     */           } 
/* 413 */           this.syncState.wrote(this.bytes);
/* 414 */           if (this.bytes == 0) {
/* 415 */             this.endOfBitStream = true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 422 */       this.streamState.clear();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 427 */       this.vorbisBlock.clear();
/* 428 */       this.dspState.clear();
/* 429 */       this.oggInfo.clear();
/*     */     } 
/*     */ 
/*     */     
/* 433 */     this.syncState.clear();
/* 434 */     this.endOfStream = true;
/*     */   }
/*     */   
/*     */   public int read() {
/* 438 */     if (this.readIndex >= this.outIndex) {
/* 439 */       this.outIndex = 0;
/* 440 */       readPCM();
/* 441 */       this.readIndex = 0;
/* 442 */       if (this.outIndex == 0) return -1;
/*     */     
/*     */     } 
/* 445 */     int i = this.outBuffer[this.readIndex];
/* 446 */     if (i < 0) i = 256 + i; 
/* 447 */     this.readIndex++;
/*     */     
/* 449 */     return i;
/*     */   }
/*     */   
/*     */   public boolean atEnd() {
/* 453 */     return (this.endOfStream && this.readIndex >= this.outIndex);
/*     */   }
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 457 */     for (byte b = 0; b < paramInt2; b++) {
/* 458 */       int i = read();
/* 459 */       if (i >= 0) {
/* 460 */         paramArrayOfbyte[b] = (byte)i;
/*     */       } else {
/* 462 */         if (b == 0) return -1; 
/* 463 */         return b;
/*     */       } 
/*     */     } 
/* 466 */     return paramInt2;
/*     */   }
/*     */   
/*     */   public int read(byte[] paramArrayOfbyte) {
/* 470 */     return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */   
/*     */   public void close() {
/* 474 */     s.a(this.input);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\lwjgl\OggInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
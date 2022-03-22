/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamException;
/*     */ import com.codedisaster.steamworks.SteamNetworking;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.ByteBuffer;
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
/*     */ public class k
/*     */   extends OutputStream
/*     */ {
/*     */   boolean a = true;
/*     */   
/*     */   public k(i parami) {}
/*     */   
/*     */   public void write(int paramInt) {
/* 229 */     l.f("SteamSocketOutputStream: Slow write: " + paramInt);
/* 230 */     byte[] arrayOfByte = new byte[1];
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     arrayOfByte[0] = (byte)paramInt;
/*     */ 
/*     */ 
/*     */     
/* 239 */     write(arrayOfByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 248 */     if (this.b.b) {
/*     */       
/* 250 */       l.d("cannot write steam socket closed");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 256 */     if (paramInt2 > 307200) {
/*     */ 
/*     */       
/* 259 */       l.d("Steam spliting large packet to:" + this.b.e + " len:" + paramInt2);
/*     */       
/* 261 */       int j = paramInt2;
/*     */ 
/*     */       
/*     */       do {
/* 265 */         int m = j;
/* 266 */         if (m > 256000)
/*     */         {
/* 268 */           m = 256000;
/*     */         }
/*     */         
/* 271 */         write(paramArrayOfbyte, paramInt1, m);
/*     */         
/* 273 */         paramInt1 += m;
/* 274 */         j -= m;
/*     */       }
/* 276 */       while (j > 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     ByteBuffer byteBuffer = ByteBuffer.allocateDirect(paramInt2);
/*     */ 
/*     */     
/* 291 */     byteBuffer.put(paramArrayOfbyte, paramInt1, paramInt2);
/* 292 */     byteBuffer.flip();
/*     */     
/* 294 */     synchronized (this.b.a) {
/*     */ 
/*     */       
/*     */       try {
/*     */ 
/*     */ 
/*     */         
/* 301 */         if (this.a) {
/*     */           
/* 303 */           this.a = false;
/* 304 */           l.d("First packet to:" + this.b.e);
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 310 */         boolean bool = this.b.a.h.sendP2PPacket(this.b.e, byteBuffer, SteamNetworking.P2PSend.Reliable, 0);
/*     */         
/* 312 */         if (!bool)
/*     */         {
/* 314 */           l.d("steam sendP2PPacket failed (size: " + paramInt2 + " to:" + this.b.e + ")");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 333 */       catch (SteamException steamException) {
/*     */         
/* 335 */         throw new IOException(steamException);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void write(byte[] paramArrayOfbyte) {
/* 343 */     write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
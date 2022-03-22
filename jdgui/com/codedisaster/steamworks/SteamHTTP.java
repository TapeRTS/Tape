/*     */ package com.codedisaster.steamworks;
/*     */ 
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
/*     */ public class SteamHTTP
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamHTTP(SteamHTTPCallback paramSteamHTTPCallback, SteamHTTP$API paramSteamHTTP$API) {
/*  91 */     super((paramSteamHTTP$API == SteamHTTP$API.Client) ? SteamAPI.getSteamHTTPPointer() : 
/*  92 */         SteamGameServerAPI.getSteamGameServerHTTPPointer(), 
/*  93 */         createCallback(new SteamHTTPCallbackAdapter(paramSteamHTTPCallback), (paramSteamHTTP$API == SteamHTTP$API.Client)));
/*     */   }
/*     */   
/*     */   public SteamHTTPRequestHandle createHTTPRequest(SteamHTTP$HTTPMethod paramSteamHTTP$HTTPMethod, String paramString) {
/*  97 */     return new SteamHTTPRequestHandle(createHTTPRequest(this.pointer, paramSteamHTTP$HTTPMethod.ordinal(), paramString));
/*     */   }
/*     */   
/*     */   public boolean setHTTPRequestContextValue(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, long paramLong) {
/* 101 */     return setHTTPRequestContextValue(this.pointer, paramSteamHTTPRequestHandle.handle, paramLong);
/*     */   }
/*     */   
/*     */   public boolean setHTTPRequestNetworkActivityTimeout(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, int paramInt) {
/* 105 */     return setHTTPRequestNetworkActivityTimeout(this.pointer, paramSteamHTTPRequestHandle.handle, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setHTTPRequestHeaderValue(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, String paramString1, String paramString2) {
/* 111 */     return setHTTPRequestHeaderValue(this.pointer, paramSteamHTTPRequestHandle.handle, paramString1, paramString2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setHTTPRequestGetOrPostParameter(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, String paramString1, String paramString2) {
/* 117 */     return setHTTPRequestGetOrPostParameter(this.pointer, paramSteamHTTPRequestHandle.handle, paramString1, paramString2);
/*     */   }
/*     */   
/*     */   public SteamAPICall sendHTTPRequest(SteamHTTPRequestHandle paramSteamHTTPRequestHandle) {
/* 121 */     return new SteamAPICall(sendHTTPRequest(this.pointer, this.callback, paramSteamHTTPRequestHandle.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall sendHTTPRequestAndStreamResponse(SteamHTTPRequestHandle paramSteamHTTPRequestHandle) {
/* 125 */     return new SteamAPICall(sendHTTPRequestAndStreamResponse(this.pointer, paramSteamHTTPRequestHandle.handle));
/*     */   }
/*     */   
/*     */   public int getHTTPResponseHeaderSize(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, String paramString) {
/* 129 */     return getHTTPResponseHeaderSize(this.pointer, paramSteamHTTPRequestHandle.handle, paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getHTTPResponseHeaderValue(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, String paramString, ByteBuffer paramByteBuffer) {
/* 134 */     if (!paramByteBuffer.isDirect()) {
/* 135 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 138 */     int i = paramByteBuffer.position();
/* 139 */     int j = paramByteBuffer.limit() - i;
/*     */     
/* 141 */     return getHTTPResponseHeaderValue(this.pointer, paramSteamHTTPRequestHandle.handle, paramString, paramByteBuffer, i, j);
/*     */   }
/*     */   
/*     */   public int getHTTPResponseBodySize(SteamHTTPRequestHandle paramSteamHTTPRequestHandle) {
/* 145 */     return getHTTPResponseBodySize(this.pointer, paramSteamHTTPRequestHandle.handle);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getHTTPResponseBodyData(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, ByteBuffer paramByteBuffer) {
/* 150 */     if (!paramByteBuffer.isDirect()) {
/* 151 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 154 */     int i = paramByteBuffer.position();
/* 155 */     int j = paramByteBuffer.limit() - i;
/*     */     
/* 157 */     return getHTTPResponseBodyData(this.pointer, paramSteamHTTPRequestHandle.handle, paramByteBuffer, i, j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getHTTPStreamingResponseBodyData(SteamHTTPRequestHandle paramSteamHTTPRequestHandle, int paramInt, ByteBuffer paramByteBuffer) {
/* 163 */     if (!paramByteBuffer.isDirect()) {
/* 164 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 167 */     int i = paramByteBuffer.position();
/* 168 */     int j = paramByteBuffer.limit() - i;
/*     */     
/* 170 */     return getHTTPStreamingResponseBodyData(this.pointer, paramSteamHTTPRequestHandle.handle, paramInt, paramByteBuffer, i, j);
/*     */   }
/*     */   
/*     */   public boolean releaseHTTPRequest(SteamHTTPRequestHandle paramSteamHTTPRequestHandle) {
/* 174 */     return releaseHTTPRequest(this.pointer, paramSteamHTTPRequestHandle.handle);
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamHTTPCallbackAdapter paramSteamHTTPCallbackAdapter, boolean paramBoolean);
/*     */   
/*     */   private static native long createHTTPRequest(long paramLong, int paramInt, String paramString);
/*     */   
/*     */   private static native boolean setHTTPRequestContextValue(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean setHTTPRequestNetworkActivityTimeout(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean setHTTPRequestHeaderValue(long paramLong1, long paramLong2, String paramString1, String paramString2);
/*     */   
/*     */   private static native boolean setHTTPRequestGetOrPostParameter(long paramLong1, long paramLong2, String paramString1, String paramString2);
/*     */   
/*     */   private static native long sendHTTPRequest(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native long sendHTTPRequestAndStreamResponse(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getHTTPResponseHeaderSize(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean getHTTPResponseHeaderValue(long paramLong1, long paramLong2, String paramString, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int getHTTPResponseBodySize(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean getHTTPResponseBodyData(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native boolean getHTTPStreamingResponseBodyData(long paramLong1, long paramLong2, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native boolean releaseHTTPRequest(long paramLong1, long paramLong2);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamHTTP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
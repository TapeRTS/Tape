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
/*     */ public class SteamNetworking
/*     */   extends SteamInterface
/*     */ {
/*  80 */   private final int[] tmpIntResult = new int[1];
/*  81 */   private final long[] tmpLongResult = new long[1];
/*     */   
/*     */   public SteamNetworking(SteamNetworkingCallback paramSteamNetworkingCallback, SteamNetworking$API paramSteamNetworking$API) {
/*  84 */     super((paramSteamNetworking$API == SteamNetworking$API.Client) ? SteamAPI.getSteamNetworkingPointer() : 
/*  85 */         SteamGameServerAPI.getSteamGameServerNetworkingPointer(), 
/*  86 */         createCallback(new SteamNetworkingCallbackAdapter(paramSteamNetworkingCallback), (paramSteamNetworking$API == SteamNetworking$API.Client)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sendP2PPacket(SteamID paramSteamID, ByteBuffer paramByteBuffer, SteamNetworking$P2PSend paramSteamNetworking$P2PSend, int paramInt) {
/*  97 */     int i = paramByteBuffer.position();
/*  98 */     int j = paramByteBuffer.limit() - i;
/*  99 */     return sendP2PPacket(paramSteamID, paramByteBuffer, i, j, paramSteamNetworking$P2PSend, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sendP2PPacket(SteamID paramSteamID, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, SteamNetworking$P2PSend paramSteamNetworking$P2PSend, int paramInt3) {
/* 110 */     if (!paramByteBuffer.isDirect()) {
/* 111 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 114 */     if (paramByteBuffer.capacity() < paramInt1 + paramInt2) {
/* 115 */       throw new SteamException("Buffer capacity exceeded!");
/*     */     }
/*     */     
/* 118 */     return sendP2PPacket(this.pointer, paramSteamID.handle, paramByteBuffer, paramInt1, paramInt2, paramSteamNetworking$P2PSend.ordinal(), paramInt3);
/*     */   }
/*     */   
/*     */   public int isP2PPacketAvailable(int paramInt) {
/* 122 */     if (isP2PPacketAvailable(this.pointer, this.tmpIntResult, paramInt)) {
/* 123 */       return this.tmpIntResult[0];
/*     */     }
/* 125 */     return 0;
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
/*     */   public int readP2PPacket(SteamID paramSteamID, ByteBuffer paramByteBuffer, int paramInt) {
/* 138 */     int i = paramByteBuffer.position();
/* 139 */     int j = paramByteBuffer.limit() - i;
/* 140 */     return readP2PPacket(paramSteamID, paramByteBuffer, i, j, paramInt);
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
/*     */   public int readP2PPacket(SteamID paramSteamID, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
/* 155 */     if (!paramByteBuffer.isDirect()) {
/* 156 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 159 */     if (paramByteBuffer.capacity() < paramInt1 + paramInt2) {
/* 160 */       throw new SteamException("Buffer capacity exceeded!");
/*     */     }
/*     */     
/* 163 */     if (readP2PPacket(this.pointer, paramByteBuffer, paramInt1, paramInt2, this.tmpIntResult, this.tmpLongResult, paramInt3)) {
/* 164 */       paramByteBuffer.position(paramInt1);
/* 165 */       paramByteBuffer.limit(paramInt1 + this.tmpIntResult[0]);
/* 166 */       paramSteamID.handle = this.tmpLongResult[0];
/* 167 */       return this.tmpIntResult[0];
/*     */     } 
/*     */     
/* 170 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean acceptP2PSessionWithUser(SteamID paramSteamID) {
/* 174 */     return acceptP2PSessionWithUser(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean closeP2PSessionWithUser(SteamID paramSteamID) {
/* 178 */     return closeP2PSessionWithUser(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean closeP2PChannelWithUser(SteamID paramSteamID, int paramInt) {
/* 182 */     return closeP2PChannelWithUser(this.pointer, paramSteamID.handle, paramInt);
/*     */   }
/*     */   
/*     */   public boolean getP2PSessionState(SteamID paramSteamID, SteamNetworking$P2PSessionState paramSteamNetworking$P2PSessionState) {
/* 186 */     return getP2PSessionState(this.pointer, paramSteamID.handle, paramSteamNetworking$P2PSessionState);
/*     */   }
/*     */   
/*     */   public boolean allowP2PPacketRelay(boolean paramBoolean) {
/* 190 */     return allowP2PPacketRelay(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamNetworkingCallbackAdapter paramSteamNetworkingCallbackAdapter, boolean paramBoolean);
/*     */   
/*     */   private static native boolean sendP2PPacket(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   private static native boolean isP2PPacketAvailable(long paramLong, int[] paramArrayOfint, int paramInt);
/*     */   
/*     */   private static native boolean readP2PPacket(long paramLong, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int[] paramArrayOfint, long[] paramArrayOflong, int paramInt3);
/*     */   
/*     */   private static native boolean acceptP2PSessionWithUser(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean closeP2PSessionWithUser(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean closeP2PChannelWithUser(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean getP2PSessionState(long paramLong1, long paramLong2, SteamNetworking$P2PSessionState paramSteamNetworking$P2PSessionState);
/*     */   
/*     */   private static native boolean allowP2PPacketRelay(long paramLong, boolean paramBoolean);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamNetworking.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
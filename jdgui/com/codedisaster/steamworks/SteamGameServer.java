/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamGameServer
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamGameServer(SteamGameServerCallback paramSteamGameServerCallback) {
/*  37 */     super(SteamGameServerAPI.getSteamGameServerPointer(), 
/*  38 */         createCallback(new SteamGameServerCallbackAdapter(paramSteamGameServerCallback)));
/*     */   }
/*     */   
/*     */   public void setProduct(String paramString) {
/*  42 */     setProduct(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setGameDescription(String paramString) {
/*  46 */     setGameDescription(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setModDir(String paramString) {
/*  50 */     setModDir(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setDedicatedServer(boolean paramBoolean) {
/*  54 */     setDedicatedServer(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   public void logOn(String paramString) {
/*  58 */     logOn(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void logOnAnonymous() {
/*  62 */     logOnAnonymous(this.pointer);
/*     */   }
/*     */   
/*     */   public void logOff() {
/*  66 */     logOff(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean isLoggedOn() {
/*  70 */     return isLoggedOn(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean isSecure() {
/*  74 */     return isSecure(this.pointer);
/*     */   }
/*     */   
/*     */   public SteamID getSteamID() {
/*  78 */     return new SteamID(getSteamID(this.pointer));
/*     */   }
/*     */   
/*     */   public boolean wasRestartRequested() {
/*  82 */     return wasRestartRequested(this.pointer);
/*     */   }
/*     */   
/*     */   public void setMaxPlayerCount(int paramInt) {
/*  86 */     setMaxPlayerCount(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public void setBotPlayerCount(int paramInt) {
/*  90 */     setBotPlayerCount(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public void setServerName(String paramString) {
/*  94 */     setServerName(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setMapName(String paramString) {
/*  98 */     setMapName(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setPasswordProtected(boolean paramBoolean) {
/* 102 */     setPasswordProtected(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   public void setSpectatorPort(short paramShort) {
/* 106 */     setSpectatorPort(this.pointer, paramShort);
/*     */   }
/*     */   
/*     */   public void setSpectatorServerName(String paramString) {
/* 110 */     setSpectatorServerName(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void clearAllKeyValues() {
/* 114 */     clearAllKeyValues(this.pointer);
/*     */   }
/*     */   
/*     */   public void setKeyValue(String paramString1, String paramString2) {
/* 118 */     setKeyValue(this.pointer, paramString1, paramString2);
/*     */   }
/*     */   
/*     */   public void setGameTags(String paramString) {
/* 122 */     setGameTags(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setGameData(String paramString) {
/* 126 */     setGameData(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void setRegion(String paramString) {
/* 130 */     setRegion(this.pointer, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SteamID sendUserConnectAndAuthenticate(int paramInt1, Buffer paramBuffer, int paramInt2, SteamID paramSteamID) {
/* 138 */     long[] arrayOfLong = new long[1];
/* 139 */     if (sendUserConnectAndAuthenticate(this.pointer, paramInt1, paramBuffer, paramInt2, arrayOfLong)) {
/* 140 */       return new SteamID(arrayOfLong[0]);
/*     */     }
/* 142 */     return null;
/*     */   }
/*     */   
/*     */   public SteamID createUnauthenticatedUserConnection() {
/* 146 */     return new SteamID(createUnauthenticatedUserConnection(this.pointer));
/*     */   }
/*     */   
/*     */   public void sendUserDisconnect(SteamID paramSteamID) {
/* 150 */     sendUserDisconnect(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean updateUserData(SteamID paramSteamID, String paramString, int paramInt) {
/* 154 */     return updateUserData(this.pointer, paramSteamID.handle, paramString, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public SteamAuthTicket getAuthSessionTicket(Buffer paramBuffer, int[] paramArrayOfint) {
/* 159 */     if (!paramBuffer.isDirect()) {
/* 160 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 163 */     int i = getAuthSessionTicket(this.pointer, paramBuffer, paramBuffer.capacity(), paramArrayOfint);
/*     */     
/* 165 */     if (i != 0L) {
/* 166 */       paramBuffer.limit(paramArrayOfint[0]);
/*     */     }
/*     */     
/* 169 */     return new SteamAuthTicket(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public SteamAuth$BeginAuthSessionResult beginAuthSession(Buffer paramBuffer, SteamID paramSteamID) {
/* 174 */     if (!paramBuffer.isDirect()) {
/* 175 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 178 */     int i = beginAuthSession(this.pointer, paramBuffer, paramBuffer.limit(), paramSteamID.handle);
/* 179 */     return SteamAuth$BeginAuthSessionResult.byOrdinal(i);
/*     */   }
/*     */   
/*     */   public void endAuthSession(SteamID paramSteamID) {
/* 183 */     endAuthSession(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public void cancelAuthTicket(SteamAuthTicket paramSteamAuthTicket) {
/* 187 */     cancelAuthTicket(this.pointer, (int)paramSteamAuthTicket.handle);
/*     */   }
/*     */   
/*     */   public SteamAuth$UserHasLicenseForAppResult userHasLicenseForApp(SteamID paramSteamID, int paramInt) {
/* 191 */     return SteamAuth$UserHasLicenseForAppResult.byOrdinal(userHasLicenseForApp(this.pointer, paramSteamID.handle, paramInt));
/*     */   }
/*     */   
/*     */   public boolean requestUserGroupStatus(SteamID paramSteamID1, SteamID paramSteamID2) {
/* 195 */     return requestUserGroupStatus(this.pointer, paramSteamID1.handle, paramSteamID2.handle);
/*     */   }
/*     */   
/*     */   public int getPublicIP() {
/* 199 */     return getPublicIP(this.pointer);
/*     */   }
/*     */   
/*     */   public boolean handleIncomingPacket(Buffer paramBuffer, int paramInt, short paramShort) {
/* 203 */     return handleIncomingPacket(this.pointer, paramBuffer, paramBuffer.limit(), paramInt, paramShort);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getNextOutgoingPacket(Buffer paramBuffer, int[] paramArrayOfint, short[] paramArrayOfshort) {
/* 208 */     return getNextOutgoingPacket(this.pointer, paramBuffer, paramBuffer.capacity(), paramArrayOfint, paramArrayOfshort);
/*     */   }
/*     */   
/*     */   public void enableHeartbeats(boolean paramBoolean) {
/* 212 */     enableHeartbeats(this.pointer, paramBoolean);
/*     */   }
/*     */   
/*     */   public void setHeartbeatInterval(int paramInt) {
/* 216 */     setHeartbeatInterval(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public void forceHeartbeat() {
/* 220 */     forceHeartbeat(this.pointer);
/*     */   }
/*     */   
/*     */   public SteamAPICall associateWithClan(SteamID paramSteamID) {
/* 224 */     return new SteamAPICall(associateWithClan(this.pointer, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   public SteamAPICall computeNewPlayerCompatibility(SteamID paramSteamID) {
/* 228 */     return new SteamAPICall(computeNewPlayerCompatibility(this.pointer, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamGameServerCallbackAdapter paramSteamGameServerCallbackAdapter);
/*     */   
/*     */   private static native void setProduct(long paramLong, String paramString);
/*     */   
/*     */   private static native void setGameDescription(long paramLong, String paramString);
/*     */   
/*     */   private static native void setModDir(long paramLong, String paramString);
/*     */   
/*     */   private static native void setDedicatedServer(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void logOn(long paramLong, String paramString);
/*     */   
/*     */   private static native void logOnAnonymous(long paramLong);
/*     */   
/*     */   private static native void logOff(long paramLong);
/*     */   
/*     */   private static native boolean isLoggedOn(long paramLong);
/*     */   
/*     */   private static native boolean isSecure(long paramLong);
/*     */   
/*     */   private static native long getSteamID(long paramLong);
/*     */   
/*     */   private static native boolean wasRestartRequested(long paramLong);
/*     */   
/*     */   private static native void setMaxPlayerCount(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setBotPlayerCount(long paramLong, int paramInt);
/*     */   
/*     */   private static native void setServerName(long paramLong, String paramString);
/*     */   
/*     */   private static native void setMapName(long paramLong, String paramString);
/*     */   
/*     */   private static native void setPasswordProtected(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void setSpectatorPort(long paramLong, short paramShort);
/*     */   
/*     */   private static native void setSpectatorServerName(long paramLong, String paramString);
/*     */   
/*     */   private static native void clearAllKeyValues(long paramLong);
/*     */   
/*     */   private static native void setKeyValue(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native void setGameTags(long paramLong, String paramString);
/*     */   
/*     */   private static native void setGameData(long paramLong, String paramString);
/*     */   
/*     */   private static native void setRegion(long paramLong, String paramString);
/*     */   
/*     */   private static native boolean sendUserConnectAndAuthenticate(long paramLong, int paramInt1, Buffer paramBuffer, int paramInt2, long[] paramArrayOflong);
/*     */   
/*     */   private static native long createUnauthenticatedUserConnection(long paramLong);
/*     */   
/*     */   private static native void sendUserDisconnect(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean updateUserData(long paramLong1, long paramLong2, String paramString, int paramInt);
/*     */   
/*     */   private static native int getAuthSessionTicket(long paramLong, Buffer paramBuffer, int paramInt, int[] paramArrayOfint);
/*     */   
/*     */   private static native int beginAuthSession(long paramLong1, Buffer paramBuffer, int paramInt, long paramLong2);
/*     */   
/*     */   private static native void endAuthSession(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void cancelAuthTicket(long paramLong, int paramInt);
/*     */   
/*     */   private static native int userHasLicenseForApp(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean requestUserGroupStatus(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native int getPublicIP(long paramLong);
/*     */   
/*     */   private static native boolean handleIncomingPacket(long paramLong, Buffer paramBuffer, int paramInt1, int paramInt2, short paramShort);
/*     */   
/*     */   private static native int getNextOutgoingPacket(long paramLong, Buffer paramBuffer, int paramInt, int[] paramArrayOfint, short[] paramArrayOfshort);
/*     */   
/*     */   private static native void enableHeartbeats(long paramLong, boolean paramBoolean);
/*     */   
/*     */   private static native void setHeartbeatInterval(long paramLong, int paramInt);
/*     */   
/*     */   private static native void forceHeartbeat(long paramLong);
/*     */   
/*     */   private static native long associateWithClan(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long computeNewPlayerCompatibility(long paramLong1, long paramLong2);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamGameServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
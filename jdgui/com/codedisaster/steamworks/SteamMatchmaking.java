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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamMatchmaking
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamMatchmaking(SteamMatchmakingCallback paramSteamMatchmakingCallback) {
/* 132 */     super(SteamAPI.getSteamMatchmakingPointer(), createCallback(new SteamMatchmakingCallbackAdapter(paramSteamMatchmakingCallback)));
/*     */   }
/*     */   
/*     */   public SteamAPICall requestLobbyList() {
/* 136 */     return new SteamAPICall(requestLobbyList(this.pointer, this.callback));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addRequestLobbyListStringFilter(String paramString1, String paramString2, SteamMatchmaking$LobbyComparison paramSteamMatchmaking$LobbyComparison) {
/* 142 */     addRequestLobbyListStringFilter(this.pointer, paramString1, paramString2, SteamMatchmaking$LobbyComparison.access$000(paramSteamMatchmaking$LobbyComparison));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addRequestLobbyListNumericalFilter(String paramString, int paramInt, SteamMatchmaking$LobbyComparison paramSteamMatchmaking$LobbyComparison) {
/* 148 */     addRequestLobbyListNumericalFilter(this.pointer, paramString, paramInt, SteamMatchmaking$LobbyComparison.access$000(paramSteamMatchmaking$LobbyComparison));
/*     */   }
/*     */   
/*     */   public void addRequestLobbyListNearValueFilter(String paramString, int paramInt) {
/* 152 */     addRequestLobbyListNearValueFilter(this.pointer, paramString, paramInt);
/*     */   }
/*     */   
/*     */   public void addRequestLobbyListFilterSlotsAvailable(int paramInt) {
/* 156 */     addRequestLobbyListFilterSlotsAvailable(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public void addRequestLobbyListDistanceFilter(SteamMatchmaking$LobbyDistanceFilter paramSteamMatchmaking$LobbyDistanceFilter) {
/* 160 */     addRequestLobbyListDistanceFilter(this.pointer, paramSteamMatchmaking$LobbyDistanceFilter.ordinal());
/*     */   }
/*     */   
/*     */   public void addRequestLobbyListResultCountFilter(int paramInt) {
/* 164 */     addRequestLobbyListResultCountFilter(this.pointer, paramInt);
/*     */   }
/*     */   
/*     */   public void addRequestLobbyListCompatibleMembersFilter(SteamID paramSteamID) {
/* 168 */     addRequestLobbyListCompatibleMembersFilter(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public SteamID getLobbyByIndex(int paramInt) {
/* 172 */     return new SteamID(getLobbyByIndex(this.pointer, paramInt));
/*     */   }
/*     */   
/*     */   public SteamAPICall createLobby(SteamMatchmaking$LobbyType paramSteamMatchmaking$LobbyType, int paramInt) {
/* 176 */     return new SteamAPICall(createLobby(this.pointer, this.callback, paramSteamMatchmaking$LobbyType.ordinal(), paramInt));
/*     */   }
/*     */   
/*     */   public SteamAPICall joinLobby(SteamID paramSteamID) {
/* 180 */     return new SteamAPICall(joinLobby(this.pointer, this.callback, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   public void leaveLobby(SteamID paramSteamID) {
/* 184 */     leaveLobby(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean inviteUserToLobby(SteamID paramSteamID1, SteamID paramSteamID2) {
/* 188 */     return inviteUserToLobby(this.pointer, paramSteamID1.handle, paramSteamID2.handle);
/*     */   }
/*     */   
/*     */   public int getNumLobbyMembers(SteamID paramSteamID) {
/* 192 */     return getNumLobbyMembers(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public SteamID getLobbyMemberByIndex(SteamID paramSteamID, int paramInt) {
/* 196 */     return new SteamID(getLobbyMemberByIndex(this.pointer, paramSteamID.handle, paramInt));
/*     */   }
/*     */   
/*     */   public String getLobbyData(SteamID paramSteamID, String paramString) {
/* 200 */     return getLobbyData(this.pointer, paramSteamID.handle, paramString);
/*     */   }
/*     */   
/*     */   public boolean setLobbyData(SteamID paramSteamID, String paramString1, String paramString2) {
/* 204 */     return setLobbyData(this.pointer, paramSteamID.handle, paramString1, paramString2);
/*     */   }
/*     */   
/*     */   public boolean setLobbyData(SteamID paramSteamID, SteamMatchMakingKeyValuePair paramSteamMatchMakingKeyValuePair) {
/* 208 */     return setLobbyData(this.pointer, paramSteamID.handle, paramSteamMatchMakingKeyValuePair.getKey(), paramSteamMatchMakingKeyValuePair.getValue());
/*     */   }
/*     */   
/*     */   public int getLobbyDataCount(SteamID paramSteamID) {
/* 212 */     return getLobbyDataCount(this.pointer, paramSteamID.handle);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean getLobbyDataByIndex(SteamID paramSteamID, int paramInt, SteamMatchMakingKeyValuePair paramSteamMatchMakingKeyValuePair) {
/* 217 */     return getLobbyDataByIndex(this.pointer, paramSteamID.handle, paramInt, paramSteamMatchMakingKeyValuePair);
/*     */   }
/*     */   
/*     */   public boolean deleteLobbyData(SteamID paramSteamID, String paramString) {
/* 221 */     return deleteLobbyData(this.pointer, paramSteamID.handle, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sendLobbyChatMsg(SteamID paramSteamID, ByteBuffer paramByteBuffer) {
/* 230 */     int i = paramByteBuffer.position();
/* 231 */     int j = paramByteBuffer.limit() - i;
/* 232 */     return sendLobbyChatMsg(paramSteamID, paramByteBuffer, i, j);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sendLobbyChatMsg(SteamID paramSteamID, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
/* 242 */     if (!paramByteBuffer.isDirect()) {
/* 243 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 246 */     if (paramByteBuffer.capacity() < paramInt1 + paramInt2) {
/* 247 */       throw new SteamException("Buffer capacity exceeded!");
/*     */     }
/*     */     
/* 250 */     return sendLobbyChatMsg(this.pointer, paramSteamID.handle, paramByteBuffer, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean sendLobbyChatMsg(SteamID paramSteamID, String paramString) {
/* 254 */     return sendLobbyChatMsg(this.pointer, paramSteamID.handle, paramString);
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
/*     */   public int getLobbyChatEntry(SteamID paramSteamID, int paramInt, SteamMatchmaking$ChatEntry paramSteamMatchmaking$ChatEntry, ByteBuffer paramByteBuffer) {
/* 267 */     int i = paramByteBuffer.position();
/* 268 */     int j = paramByteBuffer.limit() - i;
/*     */     
/* 270 */     return getLobbyChatEntry(paramSteamID, paramInt, paramSteamMatchmaking$ChatEntry, paramByteBuffer, i, j);
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
/*     */   public int getLobbyChatEntry(SteamID paramSteamID, int paramInt1, SteamMatchmaking$ChatEntry paramSteamMatchmaking$ChatEntry, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3) {
/* 283 */     if (!paramByteBuffer.isDirect()) {
/* 284 */       throw new SteamException("Direct buffer required!");
/*     */     }
/*     */     
/* 287 */     if (paramByteBuffer.capacity() < paramInt2 + paramInt3) {
/* 288 */       throw new SteamException("Buffer capacity exceeded!");
/*     */     }
/*     */     
/* 291 */     int i = getLobbyChatEntry(this.pointer, paramSteamID.handle, paramInt1, paramSteamMatchmaking$ChatEntry, paramByteBuffer, paramInt2, paramInt3);
/*     */     
/* 293 */     if (i >= 0) {
/* 294 */       paramByteBuffer.position(paramInt2);
/* 295 */       paramByteBuffer.limit(paramInt2 + i);
/*     */     } 
/*     */     
/* 298 */     return i;
/*     */   }
/*     */   
/*     */   public boolean requestLobbyData(SteamID paramSteamID) {
/* 302 */     return requestLobbyData(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean setLobbyMemberLimit(SteamID paramSteamID, int paramInt) {
/* 306 */     return setLobbyMemberLimit(this.pointer, paramSteamID.handle, paramInt);
/*     */   }
/*     */   
/*     */   public boolean getLobbyMemberLimit(SteamID paramSteamID) {
/* 310 */     return getLobbyMemberLimit(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean setLobbyType(SteamID paramSteamID, SteamMatchmaking$LobbyType paramSteamMatchmaking$LobbyType) {
/* 314 */     return setLobbyType(this.pointer, paramSteamID.handle, paramSteamMatchmaking$LobbyType.ordinal());
/*     */   }
/*     */   
/*     */   public boolean setLobbyJoinable(SteamID paramSteamID, boolean paramBoolean) {
/* 318 */     return setLobbyJoinable(this.pointer, paramSteamID.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public SteamID getLobbyOwner(SteamID paramSteamID) {
/* 322 */     return new SteamID(getLobbyOwner(this.pointer, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   public boolean setLobbyOwner(SteamID paramSteamID1, SteamID paramSteamID2) {
/* 326 */     return setLobbyOwner(this.pointer, paramSteamID1.handle, paramSteamID2.handle);
/*     */   }
/*     */   
/*     */   public boolean setLinkedLobby(SteamID paramSteamID1, SteamID paramSteamID2) {
/* 330 */     return setLinkedLobby(this.pointer, paramSteamID1.handle, paramSteamID2.handle);
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamMatchmakingCallbackAdapter paramSteamMatchmakingCallbackAdapter);
/*     */   
/*     */   private static native long requestLobbyList(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native void addRequestLobbyListStringFilter(long paramLong, String paramString1, String paramString2, int paramInt);
/*     */   
/*     */   private static native void addRequestLobbyListNumericalFilter(long paramLong, String paramString, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void addRequestLobbyListNearValueFilter(long paramLong, String paramString, int paramInt);
/*     */   
/*     */   private static native void addRequestLobbyListFilterSlotsAvailable(long paramLong, int paramInt);
/*     */   
/*     */   private static native void addRequestLobbyListDistanceFilter(long paramLong, int paramInt);
/*     */   
/*     */   private static native void addRequestLobbyListResultCountFilter(long paramLong, int paramInt);
/*     */   
/*     */   private static native void addRequestLobbyListCompatibleMembersFilter(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getLobbyByIndex(long paramLong, int paramInt);
/*     */   
/*     */   private static native long createLobby(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native long joinLobby(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native void leaveLobby(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean inviteUserToLobby(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native int getNumLobbyMembers(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native long getLobbyMemberByIndex(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native String getLobbyData(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean setLobbyData(long paramLong1, long paramLong2, String paramString1, String paramString2);
/*     */   
/*     */   private static native int getLobbyDataCount(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean getLobbyDataByIndex(long paramLong1, long paramLong2, int paramInt, SteamMatchMakingKeyValuePair paramSteamMatchMakingKeyValuePair);
/*     */   
/*     */   private static native boolean deleteLobbyData(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native boolean sendLobbyChatMsg(long paramLong1, long paramLong2, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native boolean sendLobbyChatMsg(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native int getLobbyChatEntry(long paramLong1, long paramLong2, int paramInt1, SteamMatchmaking$ChatEntry paramSteamMatchmaking$ChatEntry, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3);
/*     */   
/*     */   private static native boolean requestLobbyData(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean setLobbyMemberLimit(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean getLobbyMemberLimit(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean setLobbyType(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native boolean setLobbyJoinable(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native long getLobbyOwner(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean setLobbyOwner(long paramLong1, long paramLong2, long paramLong3);
/*     */   
/*     */   private static native boolean setLinkedLobby(long paramLong1, long paramLong2, long paramLong3);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamMatchmaking.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
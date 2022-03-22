/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SteamFriends
/*     */   extends SteamInterface
/*     */ {
/*     */   public SteamFriends(SteamFriendsCallback paramSteamFriendsCallback) {
/* 146 */     super(SteamAPI.getSteamFriendsPointer(), createCallback(new SteamFriendsCallbackAdapter(paramSteamFriendsCallback)));
/*     */   }
/*     */   
/*     */   public String getPersonaName() {
/* 150 */     return getPersonaName(this.pointer);
/*     */   }
/*     */   
/*     */   public SteamAPICall setPersonaName(String paramString) {
/* 154 */     return new SteamAPICall(setPersonaName(this.pointer, this.callback, paramString));
/*     */   }
/*     */   
/*     */   public SteamFriends$PersonaState getPersonaState() {
/* 158 */     return SteamFriends$PersonaState.byOrdinal(getPersonaState(this.pointer));
/*     */   }
/*     */   
/*     */   public int getFriendCount(SteamFriends$FriendFlags paramSteamFriends$FriendFlags) {
/* 162 */     return getFriendCount(this.pointer, SteamFriends$FriendFlags.access$000(paramSteamFriends$FriendFlags));
/*     */   }
/*     */   
/*     */   public int getFriendCount(Collection paramCollection) {
/* 166 */     return getFriendCount(this.pointer, SteamFriends$FriendFlags.asBits(paramCollection));
/*     */   }
/*     */   
/*     */   public SteamID getFriendByIndex(int paramInt, SteamFriends$FriendFlags paramSteamFriends$FriendFlags) {
/* 170 */     return new SteamID(getFriendByIndex(this.pointer, paramInt, SteamFriends$FriendFlags.access$000(paramSteamFriends$FriendFlags)));
/*     */   }
/*     */   
/*     */   public SteamID getFriendByIndex(int paramInt, Collection paramCollection) {
/* 174 */     return new SteamID(getFriendByIndex(this.pointer, paramInt, SteamFriends$FriendFlags.asBits(paramCollection)));
/*     */   }
/*     */   
/*     */   public SteamFriends$FriendRelationship getFriendRelationship(SteamID paramSteamID) {
/* 178 */     return SteamFriends$FriendRelationship.byOrdinal(getFriendRelationship(this.pointer, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   public SteamFriends$PersonaState getFriendPersonaState(SteamID paramSteamID) {
/* 182 */     return SteamFriends$PersonaState.byOrdinal(getFriendPersonaState(this.pointer, paramSteamID.handle));
/*     */   }
/*     */   
/*     */   public String getFriendPersonaName(SteamID paramSteamID) {
/* 186 */     return getFriendPersonaName(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public int getSmallFriendAvatar(SteamID paramSteamID) {
/* 190 */     return getSmallFriendAvatar(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public int getMediumFriendAvatar(SteamID paramSteamID) {
/* 194 */     return getMediumFriendAvatar(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public int getLargeFriendAvatar(SteamID paramSteamID) {
/* 198 */     return getLargeFriendAvatar(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean requestUserInformation(SteamID paramSteamID, boolean paramBoolean) {
/* 202 */     return requestUserInformation(this.pointer, paramSteamID.handle, paramBoolean);
/*     */   }
/*     */   
/*     */   public void activateGameOverlay(SteamFriends$OverlayDialog paramSteamFriends$OverlayDialog) {
/* 206 */     activateGameOverlay(this.pointer, SteamFriends$OverlayDialog.access$100(paramSteamFriends$OverlayDialog));
/*     */   }
/*     */   
/*     */   public void activateGameOverlayToUser(SteamFriends$OverlayToUserDialog paramSteamFriends$OverlayToUserDialog, SteamID paramSteamID) {
/* 210 */     activateGameOverlayToUser(this.pointer, SteamFriends$OverlayToUserDialog.access$200(paramSteamFriends$OverlayToUserDialog), paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public void activateGameOverlayToWebPage(String paramString) {
/* 214 */     activateGameOverlayToWebPage(this.pointer, paramString);
/*     */   }
/*     */   
/*     */   public void activateGameOverlayToStore(int paramInt, SteamFriends$OverlayToStoreFlag paramSteamFriends$OverlayToStoreFlag) {
/* 218 */     activateGameOverlayToStore(this.pointer, paramInt, paramSteamFriends$OverlayToStoreFlag.ordinal());
/*     */   }
/*     */   
/*     */   public void activateGameOverlayInviteDialog(SteamID paramSteamID) {
/* 222 */     activateGameOverlayInviteDialog(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean setRichPresence(String paramString1, String paramString2) {
/* 226 */     return setRichPresence(this.pointer, paramString1, (paramString2 != null) ? paramString2 : "");
/*     */   }
/*     */   
/*     */   public void clearRichPresence() {
/* 230 */     clearRichPresence(this.pointer);
/*     */   }
/*     */   
/*     */   public String getFriendRichPresence(SteamID paramSteamID, String paramString) {
/* 234 */     return getFriendRichPresence(this.pointer, paramSteamID.handle, paramString);
/*     */   }
/*     */   
/*     */   public int getFriendRichPresenceKeyCount(SteamID paramSteamID) {
/* 238 */     return getFriendRichPresenceKeyCount(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public String getFriendRichPresenceKeyByIndex(SteamID paramSteamID, int paramInt) {
/* 242 */     return getFriendRichPresenceKeyByIndex(this.pointer, paramSteamID.handle, paramInt);
/*     */   }
/*     */   
/*     */   public void requestFriendRichPresence(SteamID paramSteamID) {
/* 246 */     requestFriendRichPresence(this.pointer, paramSteamID.handle);
/*     */   }
/*     */   
/*     */   public boolean inviteUserToGame(SteamID paramSteamID, String paramString) {
/* 250 */     return inviteUserToGame(this.pointer, paramSteamID.handle, paramString);
/*     */   }
/*     */   
/*     */   private static native long createCallback(SteamFriendsCallbackAdapter paramSteamFriendsCallbackAdapter);
/*     */   
/*     */   private static native String getPersonaName(long paramLong);
/*     */   
/*     */   private static native long setPersonaName(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native int getPersonaState(long paramLong);
/*     */   
/*     */   private static native int getFriendCount(long paramLong, int paramInt);
/*     */   
/*     */   private static native long getFriendByIndex(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native int getFriendRelationship(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getFriendPersonaState(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native String getFriendPersonaName(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getSmallFriendAvatar(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getMediumFriendAvatar(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native int getLargeFriendAvatar(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean requestUserInformation(long paramLong1, long paramLong2, boolean paramBoolean);
/*     */   
/*     */   private static native void activateGameOverlay(long paramLong, String paramString);
/*     */   
/*     */   private static native void activateGameOverlayToUser(long paramLong1, String paramString, long paramLong2);
/*     */   
/*     */   private static native void activateGameOverlayToWebPage(long paramLong, String paramString);
/*     */   
/*     */   private static native void activateGameOverlayToStore(long paramLong, int paramInt1, int paramInt2);
/*     */   
/*     */   private static native void activateGameOverlayInviteDialog(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean setRichPresence(long paramLong, String paramString1, String paramString2);
/*     */   
/*     */   private static native void clearRichPresence(long paramLong);
/*     */   
/*     */   private static native String getFriendRichPresence(long paramLong1, long paramLong2, String paramString);
/*     */   
/*     */   private static native int getFriendRichPresenceKeyCount(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native String getFriendRichPresenceKeyByIndex(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   private static native void requestFriendRichPresence(long paramLong1, long paramLong2);
/*     */   
/*     */   private static native boolean inviteUserToGame(long paramLong1, long paramLong2, String paramString);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamFriends.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
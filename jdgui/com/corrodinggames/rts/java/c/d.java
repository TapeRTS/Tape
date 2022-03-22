/*    */ package com.corrodinggames.rts.java.c;
/*    */ 
/*    */ import com.codedisaster.steamworks.SteamFriends;
/*    */ import com.codedisaster.steamworks.SteamFriendsCallback;
/*    */ import com.codedisaster.steamworks.SteamID;
/*    */ import com.codedisaster.steamworks.SteamResult;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ 
/*    */ public class d
/*    */   implements SteamFriendsCallback
/*    */ {
/*    */   b a;
/*    */   
/*    */   public d(b paramb) {
/* 15 */     this.a = paramb;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onSetPersonaNameResponse(boolean paramBoolean1, boolean paramBoolean2, SteamResult paramSteamResult) {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onPersonaStateChange(SteamID paramSteamID, SteamFriends.PersonaChange paramPersonaChange) {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onGameOverlayActivated(boolean paramBoolean) {
/* 33 */     l.d("onGameOverlayActivated");
/*    */   }
/*    */   
/*    */   public void onGameLobbyJoinRequested(SteamID paramSteamID1, SteamID paramSteamID2) {}
/*    */   
/*    */   public void onAvatarImageLoaded(SteamID paramSteamID, int paramInt1, int paramInt2, int paramInt3) {}
/*    */   
/*    */   public void onFriendRichPresenceUpdate(SteamID paramSteamID, int paramInt) {}
/*    */   
/*    */   public void onGameRichPresenceJoinRequested(SteamID paramSteamID, String paramString) {}
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
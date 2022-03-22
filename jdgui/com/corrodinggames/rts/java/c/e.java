/*     */ package com.corrodinggames.rts.java.c;
/*     */ 
/*     */ import com.codedisaster.steamworks.SteamID;
/*     */ import com.codedisaster.steamworks.SteamMatchmaking;
/*     */ import com.codedisaster.steamworks.SteamMatchmakingCallback;
/*     */ import com.codedisaster.steamworks.SteamResult;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   implements SteamMatchmakingCallback
/*     */ {
/*     */   b a;
/*     */   
/*     */   public e(b paramb) {
/*  17 */     this.a = paramb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onFavoritesListChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6) {
/*  24 */     l.d("onFavoritesListChanged");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyInvite(SteamID paramSteamID1, SteamID paramSteamID2, long paramLong) {
/*  30 */     l.d("onLobbyInvite");
/*     */ 
/*     */     
/*  33 */     a a = new a(this.a, paramSteamID1, paramSteamID2, paramLong);
/*  34 */     a.a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyEnter(SteamID paramSteamID, int paramInt, boolean paramBoolean, SteamMatchmaking.ChatRoomEnterResponse paramChatRoomEnterResponse) {
/*  42 */     l.d("onLobbyEnter");
/*     */ 
/*     */     
/*  45 */     if (paramBoolean)
/*     */     {
/*  47 */       l.d("onLobbyEnter blocked: " + paramChatRoomEnterResponse);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     this.a.c(paramSteamID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyDataUpdate(SteamID paramSteamID1, SteamID paramSteamID2, boolean paramBoolean) {
/*  63 */     l.d("onLobbyDataUpdate success: " + paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyChatUpdate(SteamID paramSteamID1, SteamID paramSteamID2, SteamID paramSteamID3, SteamMatchmaking.ChatMemberStateChange paramChatMemberStateChange) {
/*  72 */     l.d("onLobbyChatUpdate steamIDUserChanged: " + paramSteamID2 + " stateChange:" + paramChatMemberStateChange);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyChatMessage(SteamID paramSteamID1, SteamID paramSteamID2, SteamMatchmaking.ChatEntryType paramChatEntryType, int paramInt) {
/*  79 */     l.d("onLobbyChatMessage");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyGameCreated(SteamID paramSteamID1, SteamID paramSteamID2, int paramInt, short paramShort) {
/*  87 */     l.d("onLobbyGameCreated");
/*  88 */     this.a.a(paramSteamID1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyMatchList(int paramInt) {
/*  94 */     l.d("onLobbyMatchList");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyKicked(SteamID paramSteamID1, SteamID paramSteamID2, boolean paramBoolean) {
/* 100 */     l.d("onLobbyKicked");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onLobbyCreated(SteamResult paramSteamResult, SteamID paramSteamID) {
/* 106 */     l.d("onLobbyCreated");
/* 107 */     this.a.a(paramSteamID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onFavoritesListAccountsUpdated(SteamResult paramSteamResult) {
/* 114 */     l.d("onFavoritesListAccountsUpdated");
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\c\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamMatchmakingCallback;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.java.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/e.class */
public class C0895e implements SteamMatchmakingCallback {

    /* renamed from: a */
    C0891b f5995a;

    public C0895e(C0891b bVar) {
        this.f5995a = bVar;
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListChanged(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        AbstractC0789l.m670d("onFavoritesListChanged");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyInvite(SteamID steamID, SteamID steamID2, long j) {
        AbstractC0789l.m670d("onLobbyInvite");
        new RunnableC0889a(this.f5995a, steamID, steamID2, j).m257a();
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyEnter(SteamID steamID, int i, boolean z, SteamMatchmaking.ChatRoomEnterResponse chatRoomEnterResponse) {
        AbstractC0789l.m670d("onLobbyEnter");
        if (z) {
            AbstractC0789l.m670d("onLobbyEnter blocked: " + chatRoomEnterResponse);
        }
        this.f5995a.m246c(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyDataUpdate(SteamID steamID, SteamID steamID2, boolean z) {
        AbstractC0789l.m670d("onLobbyDataUpdate success: " + z);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatUpdate(SteamID steamID, SteamID steamID2, SteamID steamID3, SteamMatchmaking.ChatMemberStateChange chatMemberStateChange) {
        AbstractC0789l.m670d("onLobbyChatUpdate steamIDUserChanged: " + steamID2 + " stateChange:" + chatMemberStateChange);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatMessage(SteamID steamID, SteamID steamID2, SteamMatchmaking.ChatEntryType chatEntryType, int i) {
        AbstractC0789l.m670d("onLobbyChatMessage");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyGameCreated(SteamID steamID, SteamID steamID2, int i, short s) {
        AbstractC0789l.m670d("onLobbyGameCreated");
        this.f5995a.m255a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyMatchList(int i) {
        AbstractC0789l.m670d("onLobbyMatchList");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyKicked(SteamID steamID, SteamID steamID2, boolean z) {
        AbstractC0789l.m670d("onLobbyKicked");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyCreated(SteamResult steamResult, SteamID steamID) {
        AbstractC0789l.m670d("onLobbyCreated");
        this.f5995a.m255a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListAccountsUpdated(SteamResult steamResult) {
        AbstractC0789l.m670d("onFavoritesListAccountsUpdated");
    }
}

package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamMatchmakingCallback;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/e.class */
public class C1161e implements SteamMatchmakingCallback {

    /* renamed from: a */
    C1157b f7108a;

    public C1161e(C1157b c1157b) {
        this.f7108a = c1157b;
    }

    public void onFavoritesListChanged(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        GameEngine.PrintLog("onFavoritesListChanged");
    }

    public void onLobbyInvite(SteamID steamID, SteamID steamID2, long j) {
        GameEngine.PrintLog("onLobbyInvite");
        new RunnableC1155a(this.f7108a, steamID, steamID2, j).m294a();
    }

    public void onLobbyEnter(SteamID steamID, int i, boolean z, SteamMatchmaking.ChatRoomEnterResponse chatRoomEnterResponse) {
        GameEngine.PrintLog("onLobbyEnter");
        if (z) {
            GameEngine.PrintLog("onLobbyEnter blocked: " + chatRoomEnterResponse);
        }
        this.f7108a.m283c(steamID);
    }

    public void onLobbyDataUpdate(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.PrintLog("onLobbyDataUpdate success: " + z);
    }

    public void onLobbyChatUpdate(SteamID steamID, SteamID steamID2, SteamID steamID3, SteamMatchmaking.ChatMemberStateChange chatMemberStateChange) {
        GameEngine.PrintLog("onLobbyChatUpdate steamIDUserChanged: " + steamID2 + " stateChange:" + chatMemberStateChange);
    }

    public void onLobbyChatMessage(SteamID steamID, SteamID steamID2, SteamMatchmaking.ChatEntryType chatEntryType, int i) {
        GameEngine.PrintLog("onLobbyChatMessage");
    }

    public void onLobbyGameCreated(SteamID steamID, SteamID steamID2, int i, short s) {
        GameEngine.PrintLog("onLobbyGameCreated");
        this.f7108a.m292a(steamID);
    }

    public void onLobbyMatchList(int i) {
        GameEngine.PrintLog("onLobbyMatchList");
    }

    public void onLobbyKicked(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.PrintLog("onLobbyKicked");
    }

    public void onLobbyCreated(SteamResult steamResult, SteamID steamID) {
        GameEngine.PrintLog("onLobbyCreated");
        this.f7108a.m292a(steamID);
    }

    public void onFavoritesListAccountsUpdated(SteamResult steamResult) {
        GameEngine.PrintLog("onFavoritesListAccountsUpdated");
    }
}

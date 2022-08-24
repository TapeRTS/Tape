package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamFriendsCallback;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/d.class */
public class C1160d implements SteamFriendsCallback {

    /* renamed from: a */
    C1157b f7107a;

    public C1160d(C1157b c1157b) {
        this.f7107a = c1157b;
    }

    public void onSetPersonaNameResponse(boolean z, boolean z2, SteamResult steamResult) {
    }

    public void onPersonaStateChange(SteamID steamID, SteamFriends.PersonaChange personaChange) {
    }

    public void onGameOverlayActivated(boolean z) {
        GameEngine.PrintLog("onGameOverlayActivated");
    }

    public void onGameLobbyJoinRequested(SteamID steamID, SteamID steamID2) {
    }

    public void onAvatarImageLoaded(SteamID steamID, int i, int i2, int i3) {
    }

    public void onFriendRichPresenceUpdate(SteamID steamID, int i) {
    }

    public void onGameRichPresenceJoinRequested(SteamID steamID, String str) {
    }
}

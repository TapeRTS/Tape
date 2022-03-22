package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamFriendsCallback;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.java.c.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/d.class */
public class C0894d implements SteamFriendsCallback {

    /* renamed from: a */
    C0891b f5994a;

    public C0894d(C0891b bVar) {
        this.f5994a = bVar;
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onSetPersonaNameResponse(boolean z, boolean z2, SteamResult steamResult) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onPersonaStateChange(SteamID steamID, SteamFriends.PersonaChange personaChange) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameOverlayActivated(boolean z) {
        AbstractC0789l.m670d("onGameOverlayActivated");
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameLobbyJoinRequested(SteamID steamID, SteamID steamID2) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onAvatarImageLoaded(SteamID steamID, int i, int i2, int i3) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onFriendRichPresenceUpdate(SteamID steamID, int i) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameRichPresenceJoinRequested(SteamID steamID, String str) {
    }
}

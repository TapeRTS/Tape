package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamNetworkingCallback;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.java.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/f.class */
public class C0896f implements SteamNetworkingCallback {

    /* renamed from: a */
    C0891b f5996a;

    public C0896f(C0891b bVar) {
        this.f5996a = bVar;
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionConnectFail(SteamID steamID, SteamNetworking.P2PSessionError p2PSessionError) {
        AbstractC0789l.m670d("onP2PSessionConnectFail:" + p2PSessionError);
        C0899i iVar = (C0899i) this.f5996a.f5986l.get(steamID);
        if (iVar != null && !iVar.isClosed()) {
            AbstractC0789l.m670d("onP2PSessionConnectFail: closing active socket");
            try {
                iVar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionRequest(SteamID steamID) {
        AbstractC0789l.m670d("onP2PSessionRequest:" + steamID);
        this.f5996a.f5982h.acceptP2PSessionWithUser(steamID);
    }
}

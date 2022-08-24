package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/i.class */
public class C1165i {

    /* renamed from: a */
    SteamPublishedFileID f7125a;

    /* renamed from: b */
    Runnable f7126b;

    /* renamed from: a */
    public void m257a(SteamResult steamResult) {
        GameEngine.m1139b("PendingDownload onFinish for: " + this.f7125a);
        if (this.f7126b != null) {
            this.f7126b.run();
        }
    }
}

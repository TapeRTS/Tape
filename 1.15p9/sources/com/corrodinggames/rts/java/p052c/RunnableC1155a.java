package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a.class */
public class RunnableC1155a implements Runnable {

    /* renamed from: a */
    C1157b f7082a;

    /* renamed from: b */
    String f7083b;

    /* renamed from: c */
    SteamID f7084c;

    /* renamed from: d */
    SteamID f7085d;

    /* renamed from: e */
    long f7086e;

    /* renamed from: f */
    Thread f7087f;

    public RunnableC1155a(C1157b c1157b, SteamID steamID, SteamID steamID2, long j) {
        this.f7082a = c1157b;
        this.f7084c = steamID;
        this.f7085d = steamID2;
        this.f7086e = j;
        this.f7083b = c1157b.f7090c.getFriendPersonaName(steamID);
    }

    /* renamed from: a */
    public void m294a() {
        if (this.f7087f != null) {
            throw new RuntimeException("already started");
        }
        ScriptEngine.getInstance().addRunnableToQueue(new RunnableC11561());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.java.c.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a$1.class */
    public class RunnableC11561 implements Runnable {
        RunnableC11561() {
        }

        public void run() {
            ScriptEngine.getInstance().getRoot().showPopupWithButtons("Invite", "'" + RunnableC1155a.this.f7083b + "' has invited you to join a game", true, new C0051e("Join", RunnableC1155a.this), null);
        }
    }

    public void run() {
        GameEngine.PrintLog("Join clicked");
        ScriptEngine.getInstance().getRoot().closePopup();
        GameEngine.m1228A();
        this.f7082a.f7091d.joinLobby(this.f7085d);
    }
}

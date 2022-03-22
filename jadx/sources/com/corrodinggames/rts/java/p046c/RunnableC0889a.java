package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.java.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a.class */
public class RunnableC0889a implements Runnable {

    /* renamed from: a */
    C0891b f5969a;

    /* renamed from: b */
    String f5970b;

    /* renamed from: c */
    SteamID f5971c;

    /* renamed from: d */
    SteamID f5972d;

    /* renamed from: e */
    long f5973e;

    /* renamed from: f */
    Thread f5974f;

    public RunnableC0889a(C0891b bVar, SteamID steamID, SteamID steamID2, long j) {
        this.f5969a = bVar;
        this.f5971c = steamID;
        this.f5972d = steamID2;
        this.f5973e = j;
        this.f5970b = bVar.f5977c.getFriendPersonaName(steamID);
    }

    /* renamed from: a */
    public void m257a() {
        if (this.f5974f != null) {
            throw new RuntimeException("already started");
        }
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().getRoot().showPopupWithButtons("Invite", "'" + RunnableC0889a.this.f5970b + "' has invited you to join a game", true, new C0051e("Join", RunnableC0889a.this), null);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l.m670d("Join clicked");
        ScriptEngine.getInstance().getRoot().closePopup();
        AbstractC0789l.m638u();
        this.f5969a.f5978d.joinLobby(this.f5972d);
    }
}

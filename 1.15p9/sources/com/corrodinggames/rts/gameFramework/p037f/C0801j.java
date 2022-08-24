package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/j.class */
public class C0801j {

    /* renamed from: a */
    String f5268a;

    /* renamed from: b */
    String f5269b;

    /* renamed from: c */
    long f5270c;

    /* renamed from: d */
    String f5271d;

    /* renamed from: e */
    public int f5272e = -1;

    /* renamed from: f */
    public int f5273f = -1;

    /* renamed from: a */
    public int m1949a() {
        return (int) (System.currentTimeMillis() - this.f5270c);
    }

    /* renamed from: b */
    public boolean m1948b() {
        if (GameEngine.getInstance().m1208a() || this.f5270c + 14000 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}

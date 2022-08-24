package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ae.class */
public class C0841ae {

    /* renamed from: b */
    public String f5635b;

    /* renamed from: c */
    public int f5636c;

    /* renamed from: d */
    public boolean f5637d;

    /* renamed from: e */
    public String f5638e;

    /* renamed from: f */
    public String f5639f;

    /* renamed from: g */
    public String f5640g;

    /* renamed from: a */
    public void m1605a(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5637d) {
            try {
                C0859ar c0859ar = new C0859ar();
                c0859ar.m1554c(1);
                c0859ar.mo1487a(this.f5636c);
                c0859ar.m1553c(str);
                gameEngine.networkEngine.m1671d(c0859ar.m1560b(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (gameEngine.networkEngine.f5485C) {
            GameEngine.m1193a("Cannot enter a password when we are a server");
        } else {
            gameEngine.networkEngine.f5475n = str;
            gameEngine.networkEngine.m1779X();
        }
    }

    /* renamed from: a */
    public void m1606a() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.m1690b("exited password");
        gameEngine.networkEngine.m1792K();
    }
}

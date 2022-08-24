package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/i.class */
public class C0800i {

    /* renamed from: a */
    C0797f f5263a;

    /* renamed from: b */
    GameEngine f5264b;

    /* renamed from: c */
    Paint f5265c;

    /* renamed from: d */
    boolean f5266d;

    /* renamed from: e */
    ArrayList f5267e = new ArrayList();

    public C0800i(GameEngine gameEngine, C0797f c0797f) {
        this.f5263a = c0797f;
        this.f5264b = gameEngine;
        m1954a();
    }

    /* renamed from: a */
    public void m1954a() {
        this.f5265c = new Paint();
        this.f5265c.m7267a(255, 255, 255, 255);
        this.f5265c.m7248a(true);
        this.f5265c.m7235c(true);
        this.f5265c.m7258a(Typeface.m7174a(Typeface.f246c, 1));
        this.f5264b.m1197a(this.f5265c, 16.0f);
    }

    /* renamed from: b */
    public synchronized void m1951b() {
        this.f5266d = false;
        this.f5267e.clear();
    }

    /* renamed from: c */
    public synchronized void m1950c() {
        Iterator it = this.f5267e.iterator();
        while (it.hasNext()) {
            C0801j c0801j = (C0801j) it.next();
            if (this.f5267e.size() > 15) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C0801j m1952a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0801j c0801j = new C0801j();
        c0801j.f5268a = str;
        c0801j.f5269b = str2;
        c0801j.f5270c = System.currentTimeMillis();
        c0801j.f5271d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str != null && !str.equals(VariableScope.nullOrMissingString) && !gameEngine.f6109bQ.showPlayerChatInGame) {
            if (!this.f5266d) {
                this.f5266d = true;
                m1952a(null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
            }
            return c0801j;
        }
        m1950c();
        this.f5267e.add(c0801j);
        return c0801j;
    }

    /* renamed from: a */
    public synchronized void m1953a(float f) {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        m1950c();
        int i = 95;
        int i2 = (int) (20.0f * gameEngine.f6126ci);
        boolean m1208a = gameEngine.m1208a();
        for (int size = this.f5267e.size() - 1; size >= 0; size--) {
            C0801j c0801j = (C0801j) this.f5267e.get(size);
            if (c0801j.m1948b()) {
                if (c0801j.f5268a == null || c0801j.f5268a.equals(VariableScope.nullOrMissingString)) {
                    str = c0801j.f5269b;
                } else {
                    str = c0801j.f5268a + ": " + c0801j.f5269b;
                }
                if (m1208a) {
                    str = c0801j.f5271d + ": " + str;
                }
                if (c0801j.f5272e > 0) {
                    int m1949a = c0801j.m1949a() / c0801j.f5272e;
                    if (m1949a < 0) {
                        m1949a = 0;
                    }
                    if (m1949a < str.length()) {
                        str = str.substring(0, m1949a);
                    }
                }
                this.f5265c.m7242b(c0801j.f5273f);
                gameEngine.graphics.mo903a(str, 20, i, this.f5265c);
                i += i2;
            }
        }
    }
}

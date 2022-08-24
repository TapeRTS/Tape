package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.Team;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c.class */
public class C0736c {

    /* renamed from: a */
    static final boolean f4615a = false;

    /* renamed from: b */
    public ArrayList f4616b = new ArrayList();

    /* renamed from: c */
    public ArrayList f4617c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4618d = new ArrayList();

    /* renamed from: e */
    static int f4619e;

    /* renamed from: a */
    public static void m2593a(String str) {
        f4619e++;
        if (f4619e == 5) {
            GameEngine.PrintLog("(Rate Limiting...)");
        }
        if (f4619e >= 5) {
            return;
        }
        GameEngine.PrintLog(str);
    }

    /* renamed from: a */
    public void m2595a() {
        this.f4616b.clear();
        this.f4617c.clear();
        this.f4618d.clear();
    }

    /* renamed from: b */
    public C0749e m2592b() {
        C0749e c0749e = new C0749e(this);
        if (f4615a) {
            GameEngine.PrintLog("Tracing source");
            c0749e.f4833b = GameEngine.m1186a(new Exception("Test"));
        }
        return c0749e;
    }

    /* renamed from: a */
    public C0749e m2594a(Team team) {
        return m2591b(team);
    }

    /* renamed from: b */
    public C0749e m2591b(Team team) {
        if (team == null) {
            throw new RuntimeException("team==null");
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e c0749e = new C0749e(this);
        c0749e.f4836i = team;
        c0749e.f4835d = gameEngine.f6096by;
        if (f4615a) {
            GameEngine.PrintLog("Tracing source");
            c0749e.f4833b = GameEngine.m1186a(new Exception("Test"));
        }
        if (!gameEngine.networkEngine.f5564B) {
            if (!c0749e.m2470l()) {
                GameEngine.m1145b("Command failed prepareAndCheckOnServer()");
            }
            this.f4616b.add(c0749e);
        } else {
            this.f4618d.add(c0749e);
        }
        return c0749e;
    }

    /* renamed from: c */
    public void m2590c() {
        GameEngine gameEngine = GameEngine.getInstance();
        f4619e = 0;
        if (!gameEngine.networkEngine.f5564B) {
            m2589d();
        } else {
            m2588e();
        }
    }

    /* renamed from: d */
    public void m2589d() {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = gameEngine.f6233bx;
        Iterator it = this.f4616b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            gameEngine.f6120cb.m2652a(c0749e, i);
            c0749e.m2471k();
        }
        this.f4616b.clear();
    }

    /* renamed from: e */
    public void m2588e() {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = gameEngine.f6233bx;
        Iterator it = this.f4616b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            if (c0749e.f4834c == i) {
                gameEngine.f6120cb.m2652a(c0749e, i);
                c0749e.m2471k();
                it.remove();
            }
        }
    }
}

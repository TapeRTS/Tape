package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1057n;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* renamed from: com.corrodinggames.rts.java.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
public class C1177i extends AbstractC1057n {

    /* renamed from: a */
    Main f7217a;

    public C1177i(Main main) {
        this.f7217a = main;
    }

    /* renamed from: a */
    public void mo793a(String str, int i) {
        GameEngine.PrintLog("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new RunnableC11781(str));
    }

    /* renamed from: com.corrodinggames.rts.java.i$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/i$1.class */
    class RunnableC11781 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f7218a;

        RunnableC11781(String str) {
            this.f7218a = str;
        }

        public void run() {
            GameEngine.PrintLog("slick post-alert:" + this.f7218a);
            C1177i.this.f7217a.f6975p.m7049b(VariableScope.nullOrMissingString, this.f7218a);
        }
    }

    /* renamed from: a */
    public void mo792a(String str, String str2) {
        GameEngine.PrintLog("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new RunnableC11792(str2, str));
    }

    /* renamed from: com.corrodinggames.rts.java.i$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/i$2.class */
    class RunnableC11792 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f7220a;

        /* renamed from: b */
        final /* synthetic */ String f7221b;

        RunnableC11792(String str, String str2) {
            this.f7220a = str;
            this.f7221b = str2;
        }

        public void run() {
            GameEngine.PrintLog("slick messageBox:" + this.f7220a);
            C1177i.this.f7217a.f6975p.m7049b(this.f7221b, this.f7220a);
        }
    }

    /* renamed from: a */
    public void mo791a(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if ((gameEngine == null || !gameEngine.f6091bj) && this.f7217a.f6970j != null) {
            this.f7217a.f6970j.m39a(str, z);
        }
    }

    /* renamed from: d */
    public void mo787d() {
        GameEngine.PrintLog("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    /* renamed from: a */
    public void mo790a(Throwable th) {
        m112a(th, true);
    }

    /* renamed from: a */
    public void m112a(Throwable th, boolean z) {
        try {
            GameEngine.PrintLog("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = GameEngine.m1143b(th) + "\nCheck logs for more details";
            GameEngine.PrintLog("Error message: " + str);
            if (RunnableC0069a.m7033a()) {
                GameEngine.PrintLog("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            if (th != null && (th instanceof OutOfMemoryError) && !C0191i.f1217b) {
                str = str + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameEngine.PrintLog("onGameCrash: end");
        } catch (Throwable th2) {
            GameEngine.PrintLog("exception showing message");
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean mo789b() {
        if (!GameEngine.getInstance().m1227H() && !this.f7217a.f6975p.m7053b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo788c() {
        return RunnableC0069a.m7033a();
    }
}

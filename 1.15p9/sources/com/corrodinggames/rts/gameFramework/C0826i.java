package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import java.lang.Thread;

/* renamed from: com.corrodinggames.rts.gameFramework.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i.class */
public class C0826i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f5463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0826i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5463a = uncaughtExceptionHandler;
    }

    public synchronized void uncaughtException(Thread thread, Throwable th) {
        GameEngine gameEngine = null;
        try {
            GameEngine.f6214dP = null;
            GameEngine.f6215dQ = null;
            GameEngine.f6172dO = null;
            System.gc();
            try {
                GameEngine.PrintLog("uncaughtException start");
                gameEngine = GameEngine.m1228A();
                if (gameEngine != null && (th instanceof OutOfMemoryError)) {
                    GameEngine.PrintLog("Freeing memory");
                    try {
                        C0173b.f829al = null;
                        if (gameEngine.f6104bL != null) {
                            gameEngine.f6104bL = null;
                        }
                        if (gameEngine.f6106bN != null) {
                            gameEngine.f6106bN.m2915i();
                            gameEngine.f6106bN = null;
                        }
                        System.gc();
                        GameEngine.PrintLog("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        GameEngine.PrintLog("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                GameEngine.m1182a("gameEngine:uncaughtExceptionHandler", th);
                String m1180a = GameEngine.m1180a(th);
                boolean z = false;
                boolean z2 = false;
                if (gameEngine != null) {
                    SettingsEngine settingsEngine = gameEngine.f6109bQ;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        GameEngine.PrintLog("CustomExceptionHandler: no settings");
                    }
                } else {
                    GameEngine.PrintLog("CustomExceptionHandler: no game");
                }
                if (GameEngine.f6213dN) {
                    GameEngine.PrintLog("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                GameEngine.f6213dN = true;
                if (z) {
                    try {
                        GameEngine.PrintLog("Starting errorReport");
                        C0879n.m1422a("uncaughtException", m1180a);
                        GameEngine.PrintLog("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!z2 && gameEngine != null && gameEngine.f6273dG != null) {
                    gameEngine.f6273dG.mo784a(th);
                }
                GameEngine.m1119e("fatal", m1180a);
            } catch (Exception e2) {
                GameEngine.PrintLog("exception sending crash");
                e2.printStackTrace();
            }
            if (gameEngine != null) {
                if (gameEngine.f6273dG != null && gameEngine.f6273dG.m788a()) {
                    GameEngine.PrintLog("gameCrashesDontExit=true");
                    if (1 != 0) {
                        return;
                    }
                    GameEngine.PrintLog("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                    return;
                } else if (gameEngine.networkEngine != null && gameEngine.networkEngine.f5564B) {
                    GameEngine.PrintLog("Sending disconnect");
                    gameEngine.networkEngine.m1672c("Game crash");
                }
            }
            if (!GameEngine.f6078az) {
                if (this.f5463a != null) {
                    GameEngine.PrintLog("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.f5463a.uncaughtException(thread, th);
                    GameEngine.PrintLog("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    GameEngine.PrintLog("CustomExceptionHandler: defaultUEH==null");
                    System.exit(2);
                }
            }
            GameEngine.f6076av = th;
            if (1 != 0) {
                return;
            }
            GameEngine.PrintLog("Crash was not handled, exiting");
            Runtime.getRuntime().halt(1);
        } catch (Throwable th3) {
            try {
                GameEngine.PrintLog("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 != 0) {
                    return;
                }
                GameEngine.PrintLog("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            } catch (Throwable th4) {
                if (0 == 0) {
                    GameEngine.PrintLog("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}

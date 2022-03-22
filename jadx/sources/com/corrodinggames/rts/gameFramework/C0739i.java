package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.gameFramework.p036g.C0710n;
import java.lang.Thread;

/* renamed from: com.corrodinggames.rts.gameFramework.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i.class */
public class C0739i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f5200a;

    C0739i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5200a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public synchronized void uncaughtException(Thread thread, Throwable th) {
        AbstractC0789l lVar = null;
        try {
            AbstractC0789l.f5624dx = null;
            AbstractC0789l.f5623dw = null;
            System.gc();
            try {
                AbstractC0789l.m670d("uncaughtException start");
                lVar = AbstractC0789l.m638u();
                if (lVar != null && (th instanceof OutOfMemoryError)) {
                    AbstractC0789l.m670d("Freeing memory");
                    try {
                        C0148b.f781ad = null;
                        if (lVar.f5511bt != null) {
                            lVar.f5511bt = null;
                        }
                        if (lVar.f5513bv != null) {
                            lVar.f5513bv.m2045i();
                            lVar.f5513bv = null;
                        }
                        System.gc();
                        AbstractC0789l.m670d("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        AbstractC0789l.m670d("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                AbstractC0789l.m714a("gameEngine:uncaughtExceptionHandler", th);
                String a = AbstractC0789l.m712a(th);
                boolean z = false;
                boolean z2 = false;
                if (lVar != null) {
                    SettingsEngine settingsEngine = lVar.f5516by;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        AbstractC0789l.m670d("CustomExceptionHandler: no settings");
                    }
                } else {
                    AbstractC0789l.m670d("CustomExceptionHandler: no game");
                }
                if (AbstractC0789l.f5622dv) {
                    AbstractC0789l.m670d("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                AbstractC0789l.f5622dv = true;
                if (z) {
                    try {
                        AbstractC0789l.m670d("Starting errorReport");
                        C0710n.m1038a("uncaughtException", a);
                        AbstractC0789l.m670d("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!(z2 || lVar == null || lVar.f5612do == null)) {
                    lVar.f5612do.mo103a(th);
                }
                AbstractC0789l.m665e("fatal", a);
            } catch (Exception e2) {
                AbstractC0789l.m670d("exception sending crash");
                e2.printStackTrace();
            }
            if (lVar == null || lVar.f5612do == null || !lVar.f5612do.m628a()) {
                if (!AbstractC0789l.f5459at) {
                    if (this.f5200a != null) {
                        AbstractC0789l.m670d("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                        this.f5200a.uncaughtException(thread, th);
                        AbstractC0789l.m670d("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                    } else {
                        AbstractC0789l.m670d("CustomExceptionHandler: defaultUEH==null");
                        System.exit(2);
                    }
                }
                AbstractC0789l.f5456aq = th;
                if (1 == 0) {
                    AbstractC0789l.m670d("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                    return;
                }
                return;
            }
            AbstractC0789l.m670d("gameCrashesDontExit=true");
            if (1 == 0) {
                AbstractC0789l.m670d("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        } catch (Throwable th3) {
            try {
                AbstractC0789l.m670d("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 == 0) {
                    AbstractC0789l.m670d("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
            } catch (Throwable th4) {
                if (0 == 0) {
                    AbstractC0789l.m670d("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}

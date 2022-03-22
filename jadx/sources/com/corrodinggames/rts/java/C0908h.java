package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0798n;
import com.corrodinggames.rts.p009b.RunnableC0103a;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* renamed from: com.corrodinggames.rts.java.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/h.class */
public class C0908h extends AbstractC0798n {

    /* renamed from: a */
    Main f6072a;

    public C0908h(Main main) {
        this.f6072a = main;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0798n
    /* renamed from: a */
    public void mo106a(final String str, int i) {
        AbstractC0789l.m670d("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.h.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0789l.m670d("slick post-alert:" + str);
                C0908h.this.f6072a.f5867p.m3978b("", str);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0798n
    /* renamed from: a */
    public void mo105a(final String str, final String str2) {
        AbstractC0789l.m670d("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.h.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0789l.m670d("slick messageBox:" + str2);
                C0908h.this.f6072a.f5867p.m3978b(str, str2);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0798n
    /* renamed from: a */
    public void mo104a(String str, boolean z) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if ((u == null || !u.f5485aT) && this.f6072a.f5861j != null) {
            this.f6072a.f5861j.m32a(str, z);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0798n
    /* renamed from: a */
    public void mo103a(Throwable th) {
        m102a(th, true);
    }

    /* renamed from: a */
    public void m102a(Throwable th, boolean z) {
        try {
            AbstractC0789l.m670d("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = AbstractC0789l.m680b(th) + "\nCheck logs for more details";
            AbstractC0789l.m670d("Error message: " + str);
            if (RunnableC0103a.m3905a()) {
                AbstractC0789l.m670d("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AbstractC0789l.m670d("onGameCrash: end");
        } catch (Throwable th2) {
            AbstractC0789l.m670d("exception showing message");
            th2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0798n
    /* renamed from: b */
    public boolean mo101b() {
        if (AbstractC0789l.m638u().m759B() || this.f6072a.f5867p.m3981b()) {
            return false;
        }
        return true;
    }
}

package com.corrodinggames.librocket;

import android.app.Activity;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0674ae;
import com.corrodinggames.rts.gameFramework.utility.C0833k;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.AbstractC0068d;
import com.corrodinggames.rts.p008a.ActivityC0087g;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.librocket.a */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/a.class */
public abstract class AbstractC0043a {

    /* renamed from: a */
    protected static AbstractC0043a f340a;

    /* renamed from: b */
    public AbstractC0048b f341b;

    /* renamed from: c */
    public AbstractC0068d f342c;

    /* renamed from: d */
    boolean f343d = true;

    /* renamed from: f */
    public abstract void mo261f();

    /* renamed from: g */
    public abstract void mo260g();

    /* renamed from: h */
    public abstract int mo259h();

    /* renamed from: d */
    public abstract void mo262d(boolean z);

    /* renamed from: a */
    public static AbstractC0043a m4269a() {
        return f340a;
    }

    /* renamed from: a */
    public void m4267a(AbstractC0048b bVar, AbstractC0068d dVar) {
        this.f341b = bVar;
        this.f342c = dVar;
    }

    /* renamed from: b */
    public void m4263b() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u != null) {
            u.mo740a((Activity) null, this.f342c, true);
        } else {
            AbstractC0789l.m683d("showMainMenu: game is null");
        }
        this.f341b.setDocument("mainMenu.rml");
    }

    /* renamed from: c */
    public void m4260c() {
    }

    /* renamed from: d */
    public void m4258d() {
        this.f341b.setDocument("settings.rml");
    }

    /* renamed from: a */
    public synchronized void m4264a(boolean z) {
        this.f343d = z;
        m4257e();
    }

    /* renamed from: e */
    public synchronized void m4257e() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u == null) {
            AbstractC0789l.m695b("Main::resumeGame(): game==null");
            return;
        }
        u.f5472bm = true;
        u.mo740a((Activity) null, this.f342c, this.f343d);
    }

    /* renamed from: b */
    public synchronized void m4261b(boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!z) {
            AbstractC0789l.m683d("endGame: queDisconnectAndWait");
            u.f5486bF.m1231q();
            return;
        }
        AbstractC0789l.m683d("endGame: network disconnect");
        u.f5486bF.m1293b("shutdownServer");
    }

    /* renamed from: a */
    public synchronized void m4265a(String str) {
        m4261b(true);
        AbstractC0789l.m651u();
        this.f343d = false;
        ActivityC0087g.m4196a(str, false, 8, 0, true, false);
        m4257e();
    }

    /* renamed from: c */
    public void m4259c(boolean z) {
        this.f343d = z;
    }

    /* renamed from: i */
    public boolean m4256i() {
        if (this.f341b == null || this.f341b.m4240b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m4268a(int i, char c) {
        int b = SlickToAndroidKeycodes.m619b(i);
        if (m4256i()) {
            Integer c2 = SlickToAndroidKeycodes.m617c(i);
            Object b2 = this.f341b.m4238b("event_onkeydown");
            if (b2 != null) {
                ScriptEngine.getInstance().addScriptToQueue(b2 + "(" + b + ");");
                if (this.f341b.m4236c() != null) {
                    return;
                }
            }
            if (c > 255) {
                ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0043a.this.f341b.f362c.getRoot().event_unicodeEntered();
                    }
                });
            }
            if (i == 30 && mo259h() == 1) {
                this.f341b.processKeyDown(93, 0);
                this.f341b.processKeyUp(93, 0);
                this.f341b.processKeyDown(91, 2);
                this.f341b.processKeyUp(91, 2);
            } else if (i == 46 && mo259h() == 1) {
                this.f341b.processKeyDown(14, 1);
            } else if (i == 47 && mo259h() == 1) {
                this.f341b.processKeyDown(33, 1);
            } else {
                if (c2 != null) {
                    this.f341b.processKeyDown(c2.intValue(), mo259h());
                } else if (c != 0) {
                    if (!Character.isISOControl(c)) {
                        this.f341b.processTextInputChar(c);
                    } else if (c == '\b') {
                        AbstractC0789l.m683d("backspace char pressed");
                        this.f341b.processKeyDown(69, 0);
                        this.f341b.processKeyUp(69, 0);
                    } else {
                        AbstractC0789l.m683d("keyPressed skipping isISOControl:" + i + " c:" + ((int) c) + " c_print:" + c);
                    }
                }
                if (i == 28 || i == 156) {
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                } else if (c == '\r') {
                    AbstractC0789l.m683d("keyPressed: new line entered");
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                }
                if (i == 1) {
                    ScriptEngine.getInstance().addScriptToQueue("onEscape();");
                }
            }
        } else {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u != null) {
                u.m697b(b, true);
                if (i == 1) {
                }
            }
        }
    }

    /* renamed from: j */
    public LinkedList m4255j() {
        return null;
    }

    /* renamed from: b */
    public boolean m4262b(String str) {
        try {
            if (!Desktop.isDesktopSupported() || !Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                String lowerCase = System.getProperty("os.name").toLowerCase();
                String[] strArr = null;
                if (lowerCase.contains("win")) {
                    strArr = new String[]{"rundll32", "url.dll,FileProtocolHandler", str};
                }
                if (lowerCase.contains("mac")) {
                    strArr = new String[]{"open", str};
                }
                if (lowerCase.contains("nix") || lowerCase.contains("nux")) {
                    strArr = new String[]{"xdg-open", str};
                }
                if (strArr != null) {
                    try {
                        Runtime.getRuntime().exec(strArr);
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            }
            try {
                AbstractC0789l.m683d("Opening link from desktop api");
                Desktop.getDesktop().browse(new URI(str));
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (URISyntaxException e3) {
                e3.printStackTrace();
            }
        } catch (RuntimeException e4) {
            e4.printStackTrace();
            return false;
        }
        e4.printStackTrace();
        return false;
    }

    /* renamed from: k */
    public void m4254k() {
    }

    /* renamed from: l */
    public void m4253l() {
    }

    /* renamed from: m */
    public void m4252m() {
    }

    /* renamed from: n */
    public void m4251n() {
        ScriptEngine instance;
        if (!AbstractC0789l.m651u().f5486bF.isGameStart_Hcat && (instance = ScriptEngine.getInstance()) != null) {
            instance.addScriptToQueue("mp.closeBattleroomIfOpen()");
        }
    }

    /* renamed from: a */
    public void m4266a(C0674ae aeVar) {
        AbstractC0789l.m651u();
        ScriptEngine instance = ScriptEngine.getInstance();
        if (instance != null) {
            instance.addRunnableToQueue(new RunnableC00452(instance, aeVar));
        }
    }

    /* renamed from: com.corrodinggames.librocket.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2.class */
    class RunnableC00452 implements Runnable {

        /* renamed from: a */
        final C0833k f345a = new C0833k(false);

        /* renamed from: b */
        final /* synthetic */ ScriptEngine f346b;

        /* renamed from: c */
        final /* synthetic */ C0674ae f347c;

        RunnableC00452(ScriptEngine scriptEngine, C0674ae aeVar) {
            this.f346b = scriptEngine;
            this.f347c = aeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            final Root root = this.f346b.getRoot();
            C0051e eVar = new C0051e("Join", new Runnable() { // from class: com.corrodinggames.librocket.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableC00452.this.f345a.f5771a) {
                        AbstractC0789l.m695b("AskPasswordCallBack already called");
                        return;
                    }
                    RunnableC00452.this.f345a.f5771a = true;
                    String popupText = root.getPopupText();
                    root.closeAlertOnly();
                    RunnableC00452.this.f347c.mo1219a(popupText);
                }
            });
            eVar.f381c = true;
            Runnable runnable = new Runnable() { // from class: com.corrodinggames.librocket.a.2.2
                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableC00452.this.f345a.f5771a) {
                        AbstractC0789l.m695b("AskPasswordCallBack already called");
                        return;
                    }
                    RunnableC00452.this.f345a.f5771a = true;
                    root.closeAlertOnly();
                    RunnableC00452.this.f347c.mo1220a();
                }
            };
            C0051e eVar2 = new C0051e("Close", runnable);
            String str = "Password Required";
            String str2 = "This server requires a password to join";
            if (this.f347c.f4801b != null) {
                str = "Server Question";
                str2 = C0652a.m1573c(this.f347c.f4801b);
            }
            C0050d dVar = new C0050d();
            dVar.f371b = str;
            dVar.f372c = str2;
            dVar.f373d = "";
            dVar.f374e = eVar2;
            dVar.f375f = eVar;
            dVar.f377h = false;
            dVar.f378i = runnable;
            AbstractC0043a.this.f341b.m4247a(dVar);
        }
    }
}

package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.p003os.Looper;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.C0166i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0798n;
import com.corrodinggames.rts.gameFramework.C0537ac;
import com.corrodinggames.rts.gameFramework.C0547am;
import com.corrodinggames.rts.gameFramework.C0563av;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p029a.C0531f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0663ac;
import com.corrodinggames.rts.gameFramework.p036g.C0674ae;
import com.corrodinggames.rts.gameFramework.p036g.C0698c;
import com.corrodinggames.rts.gameFramework.p036g.C0710n;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import com.corrodinggames.rts.gameFramework.utility.C0815ah;
import com.corrodinggames.rts.gameFramework.utility.C0834l;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.p045b.C0887a;
import com.corrodinggames.rts.java.p046c.C0891b;
import com.corrodinggames.rts.java.p047d.C0903a;
import com.corrodinggames.rts.p008a.ActivityC0092l;
import com.corrodinggames.rts.p009b.RunnableC0103a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Input;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.VBORenderer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/Main.class */
public class Main extends C0663ac {

    /* renamed from: a */
    public static boolean f5852a = false;

    /* renamed from: b */
    public static boolean f5853b = true;

    /* renamed from: c */
    public static String f5854c = "Rusted Warfare";

    /* renamed from: d */
    public C0902d f5855d;

    /* renamed from: h */
    public Hcat_Multiplaye f5856h;

    /* renamed from: i */
    C0887a f5857i;

    /* renamed from: j */
    public C0922t f5858j;

    /* renamed from: k */
    C0886b f5859k;

    /* renamed from: l */
    String[] f5860l;

    /* renamed from: m */
    static Main f5861m;

    /* renamed from: n */
    int f5862n;

    /* renamed from: p */
    C0903a f5863p;

    /* renamed from: r */
    Thread f5864r;

    /* renamed from: u */
    public boolean f5865u;

    /* renamed from: v */
    public int f5866v;

    /* renamed from: e */
    public String f5867e = "#28";

    /* renamed from: f */
    C0815ah f5868f = new C0815ah();

    /* renamed from: g */
    boolean f5869g = true;

    /* renamed from: o */
    long f5870o = System.nanoTime();

    /* renamed from: q */
    AbstractC0798n f5871q = new C0908h(this);

    /* renamed from: s */
    boolean f5872s = true;

    /* renamed from: t */
    Object f5873t = new Object();

    public static void main(String[] strArr) {
        f5861m = new Main();
        f5861m.m368a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.f5861m.m360f();
            }
        };
    }

    /* renamed from: a */
    public static void m370a(String str) {
        AbstractC0789l.m683d(str);
    }

    /* renamed from: f */
    public void m360f() {
        C0834l lVar = new C0834l(new InputStreamReader(System.in));
        while (this.f5869g) {
            try {
                String a = lVar.m495a();
                if (a == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m371a((C0698c) null, "ADMIN", a, true);
                }
            } catch (IOException e2) {
                if (this.f5862n < 3) {
                    AbstractC0789l.m683d("Error while reading stdin: " + e2.toString());
                    this.f5862n++;
                    if (this.f5862n == 3) {
                        AbstractC0789l.m683d("Too many stdin errors, ignoring");
                    }
                }
                try {
                    Thread.sleep(700L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: g */
    public void m359g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0789l.m715ag();
                Looper.m4333a();
                semaphore.release(1);
                Looper.m4330c();
            }
        });
        thread.setDaemon(true);
        thread.start();
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void m368a(String[] strArr) {
        this.f5860l = strArr;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        Integer num = null;
        Integer num2 = null;
        AbstractC0789l.m683d("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    m370a("connect lobby:" + lowerCase);
                    AbstractC0789l.f5554aC = lowerCase;
                    str = null;
                } else if (str.equals("-width")) {
                    num = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else if (str.equals("-height")) {
                    num2 = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else {
                    m370a("Unknown two_part_arg: " + str);
                    str = null;
                }
            } else if (lowerCase.equals("-debug")) {
                i++;
                if (i >= strArr.length) {
                    m370a("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = strArr[i];
                RunnableC0103a.m4160a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= strArr.length) {
                    m370a("-debugscript requires parameters");
                    System.exit(1);
                }
                RunnableC0103a.m4159a(strArr[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= strArr.length) {
                    m370a("-log requires parameters");
                    System.exit(1);
                }
                String str4 = strArr[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    AbstractC0789l.m683d("File logging started");
                } catch (FileNotFoundException e) {
                    AbstractC0789l.m732a("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (lowerCase.equals("-lang")) {
                i++;
                if (i >= strArr.length) {
                    m370a("-lang requires parameters");
                    System.exit(1);
                }
                C0652a.f4580d = strArr[i];
            } else if (lowerCase.equals("-logcolor")) {
                AbstractC0789l.f5551ar = true;
            } else if (lowerCase.equals("-nodisplay")) {
                z = true;
            } else if (lowerCase.equals("-nopreferipv4")) {
                z4 = true;
            } else if (lowerCase.equals("-noresources")) {
                AbstractC0789l.f5454av = true;
            } else if (lowerCase.equals("-nosound")) {
                z2 = true;
            } else if (lowerCase.equals("-nomusic")) {
                z3 = true;
            } else if (lowerCase.equals("-disable_vbos")) {
                z7 = true;
            } else if (lowerCase.equals("-force_vbos")) {
                z8 = true;
            } else if (lowerCase.equals("-allowsoftwarerender")) {
                z5 = true;
            } else if (lowerCase.equals("-fullscreen")) {
                z6 = true;
            } else if (lowerCase.equals("-nobackground")) {
                AbstractC0789l.f5451as = true;
            } else if (lowerCase.equals("-nomods")) {
                AbstractC0789l.f5458aB = true;
            } else if (lowerCase.equals("-printunits")) {
                AbstractC0789l.f5455aw = true;
            } else if (lowerCase.equals("-outputunitimages")) {
                AbstractC0789l.f5456ax = true;
            } else if (lowerCase.equals("-oldreplays")) {
                AbstractC0789l.f5457ay = true;
            } else if (lowerCase.equals("-disabletextureread")) {
                C0920r.f6112z = false;
            } else if (lowerCase.equals("-sandbox")) {
                AbstractC0789l.f5553aA = true;
            } else if (lowerCase.equals("-steam")) {
                AbstractC0789l.f5552az = true;
            } else if (lowerCase.equals("-width") || lowerCase.equals("-height")) {
                str = lowerCase;
            } else if (lowerCase.startsWith("+")) {
                if (lowerCase.equals("+connect_lobby")) {
                    str = lowerCase;
                } else {
                    m370a("Unknown steam option: " + lowerCase);
                }
            } else if (lowerCase.trim().length() != 0) {
                m370a("Unknown option: " + lowerCase);
                str2 = "Unknown option: " + lowerCase;
            }
            i++;
        }
        AbstractC0789l.m683d("Game arguments:");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            m370a("arg: " + strArr[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (AbstractC0789l.f5552az) {
                m370a("Unknown options but running anyway due to being in steam");
            } else {
                m370a("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        AbstractC0789l.f5556aF = true;
        AbstractC0789l.m715ag();
        String property = System.getProperty("os.name");
        AbstractC0789l.m683d("OS name: " + property);
        AbstractC0789l.m683d("OS version: " + System.getProperty("os.version"));
        AbstractC0789l.m683d("LWJGL version: " + Sys.getVersion());
        AbstractC0789l.m683d("Build Number: " + this.f5867e);
        AbstractC0789l.m683d("Game Version: 1.14");
        AbstractC0789l.m683d("Game Code: 151");
        C0166i.f1150b = Sys.is64Bit();
        AbstractC0789l.m683d("Is 64bit: " + C0166i.f1150b);
        AbstractC0789l.m683d("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        AbstractC0789l.m683d("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        AbstractC0789l.m683d("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            C0166i.f1151c = true;
        }
        if (z4) {
            AbstractC0789l.m683d("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (AbstractC0789l.f5552az) {
            C0796a.f5642a = new C0891b();
            AbstractC0789l.m683d("Early steam init");
            C0796a.m645a().mo641b();
            AbstractC0789l.m683d("Early steam init done.");
        } else {
            AbstractC0789l.m683d("steam not requested");
        }
        m359g();
        String str5 = f5854c;
        if (z) {
            str5 = "";
        }
        Input.disableControllers();
        if (f5852a) {
            Renderer.setRenderer(2);
        }
        if (!z8 && C0166i.f1151c) {
            AbstractC0789l.m683d("Disabling vbo on mac (without force option)");
            z7 = true;
        }
        if (z7) {
            AbstractC0789l.m683d("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                AbstractC0789l.m683d("Failed to disable VBOs, wrong class");
            }
        }
        C0905e.m119p();
        this.f5858j = new C0922t(str5);
        this.f5858j.f6127b = this;
        this.f5858j.f6149i = z;
        this.f5858j.f6150j = z2;
        this.f5858j.f6151k = z3;
        DisplayMode displayMode = Display.getDisplayMode();
        float height = displayMode.getHeight();
        float width = displayMode.getWidth();
        AbstractC0789l.m683d("screenHeight:" + height);
        AbstractC0789l.m683d("screenWidth:" + width);
        int i3 = 1000;
        int i4 = 733;
        if (height > 800.0f) {
            i3 = 1000;
            i4 = 800;
        }
        if (height > 900.0f) {
            i3 = 1600;
            i4 = 900;
        }
        if (z) {
            i3 = 10;
            i4 = 10;
        }
        if (num != null) {
            AbstractC0789l.m683d("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            AbstractC0789l.m683d("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (z5) {
            AbstractC0789l.m683d("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.f5858j.f6152l = false;
        try {
            if (this.f5858j.f6152l) {
                this.f5858j.m36a(i3 * 2, i4 * 2);
                this.f5859k = new C0886b(new ScalableGame(this.f5858j, i3, i4), i3, i4, z6);
            } else {
                this.f5859k = new C0886b(this.f5858j, i3, i4, z6);
            }
            this.f5858j.f6128c = this.f5859k;
            Display.setResizable(true);
            this.f5864r = new Thread(new RunnableC0911i(this));
            this.f5864r.setDaemon(false);
            this.f5864r.start();
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        }
    }

    /* renamed from: b */
    public void m364b(String str) {
        this.f5871q.mo104a(str, true);
    }

    /* renamed from: h */
    public synchronized void m358h() {
        m364b("displayModes");
        m364b("starting controllers");
        this.f5870o = System.nanoTime();
        AbstractC0789l.f5556aF = true;
        AbstractC0789l.f5562aL = true;
        if (!AbstractC0789l.f5454av) {
            AbstractC0789l.f5558aH = true;
            AbstractC0789l.f5557aG = true;
            AbstractC0789l.f5460aQ = C0905e.class;
        }
        if (this.f5858j == null || this.f5858j.f6150j) {
            AbstractC0789l.m695b("Disabling sound with NullSoundFactory");
            C0530e.f3565c = new C0531f();
            C0547am.f3713a = new C0563av();
        } else {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            AbstractC0789l.m683d("openALAudio hasDevice:" + openALAudio.hasDevice());
            C0530e.f3565c = new C0916n(openALAudio);
            if (this.f5858j.f6151k) {
                AbstractC0789l.m683d("Music disabled");
                C0547am.f3713a = new C0563av();
            } else {
                C0547am.f3713a = new C0913k(openALAudio);
            }
        }
        C0710n.f5019b = new C0912j();
        C0537ac.f3609b = new C0924u();
        long a = C0586bj.m1962a();
        m364b("loading libRocket");
        AbstractC0789l.m683d("start libRocket setup");
        this.f5855d = new C0902d();
        this.f5857i = C0887a.m258o();
        this.f5857i.f5967e = this;
        this.f5863p = new C0903a();
        this.f5857i.m4267a(this.f5863p, this.f5855d);
        this.f5863p.debug = false;
        this.f5863p.setup();
        m364b("libRocket - fonts");
        this.f5863p.loadFont("font/Delicious-Roman.otf");
        this.f5863p.loadFont("font/Delicious-Italic.otf");
        this.f5863p.loadFont("font/Delicious-Bold.otf");
        this.f5863p.loadFont("font/Delicious-BoldItalic.otf");
        this.f5863p.loadFont("font/Roboto-Regular.ttf");
        this.f5863p.loadFont("font/Roboto-Bold.ttf");
        AbstractC0789l.m683d("NotoSansCJKsc start");
        this.f5863p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.f5863p.loadFont("font/DroidSansFallback.ttf", "fallback");
        AbstractC0789l.m683d("NotoSansCJKsc end");
        this.f5857i.m4260c();
        AbstractC0789l.m683d("end libRocket setup");
        m364b("GuiEngine");
        C0586bj.m1957a("libRocket setup took:", a);
        AbstractC0789l.f5568dg = this.f5867e;
        ServerContext serverContext = new ServerContext();
        m364b("GameEngine");
        AbstractC0789l.f5497bR = new Point(this.f5858j.f6126a.getWidth(), this.f5858j.f6126a.getHeight());
        AbstractC0789l a2 = AbstractC0789l.m738a(serverContext, this.f5871q);
        m364b("GameEngine ready");
        AbstractC0789l.m683d("version: " + a2.mo656n() + " " + a2.mo686c(false) + ":" + this.f5867e);
        this.f5857i.m4263b();
        RunnableC0103a.m4158b();
        this.f5856h = a2.f5486bF;
        a2.f5479by.showZoomButton = false;
        a2.f5479by.showUnitGroups = false;
        this.f5858j.m33a(this.f5855d);
        this.f5858j.m36a(1000, 800);
        long nanoTime = System.nanoTime();
        AbstractC0789l.m683d("-----------------------------");
        AbstractC0789l.m683d("----- Game init finished in:" + ((nanoTime - this.f5870o) / 1000000.0d) + " ms");
        a2.f5486bF.f4726c = this;
        a2.f5486bF.f4660w = "unset";
        if (!AbstractC0789l.f5451as) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: b */
    public void mo367b() {
        this.f5868f.m526a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0789l u = AbstractC0789l.m651u();
                AbstractC0789l.m683d("got startGameEvent..");
                ActivityC0092l.m4172n();
                if (!u.f5474bt.f743P) {
                    AbstractC0789l.m683d("Not starting multiplayer game because map failed to load");
                    u.f5486bF.m1368X();
                    return;
                }
                u.f5486bF.f4714bj = true;
                u.f5589bq = false;
                u.f5449al = false;
                Main.this.f5857i.m4259c(false);
                AbstractC0043a.m4269a().m4257e();
                Main.this.f5863p.getActiveDocument();
                if (Main.this.f5863p.f362c != null) {
                    Main.this.f5863p.f362c.getRoot().resumeNonMenu();
                    return;
                }
                AbstractC0789l.m683d("startGameEvent: scriptEngine==null");
                AbstractC0789l.m761M();
            }
        });
    }

    /* renamed from: a */
    public void m376a(float f) {
        this.f5868f.m527a();
    }

    /* renamed from: a */
    public void m369a(boolean z) {
        this.f5869g = false;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!z) {
            u.f5486bF.m1231q();
        } else {
            u.f5486bF.m1293b("shutdownServer");
        }
        try {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    Main() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: a */
    public synchronized boolean mo372a(C0698c cVar, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: b */
    public synchronized void mo365b(C0698c cVar, String str, String str2) {
        m371a(cVar, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: c */
    public void mo363c() {
        ScriptEngine instance;
        if (!AbstractC0789l.m651u().f5486bF.isGameStart_Hcat && (instance = ScriptEngine.getInstance()) != null) {
            instance.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: a */
    public synchronized void mo375a(final int i, final String str, final String str2, final C0698c cVar) {
        if (this.f5863p == null || this.f5863p.f362c == null) {
            AbstractC0789l.m761M();
        } else {
            this.f5863p.f362c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.f5863p.f362c.getRoot().receiveChatMessage(i, str, str2, cVar);
                }
            });
        }
    }

    /* renamed from: a */
    public synchronized void m371a(C0698c cVar, String str, String str2, boolean z) {
        if (!z) {
            m370a(str + ": " + str2);
        }
        if (!this.f5872s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: a */
    public String mo373a(C0698c cVar, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: c */
    public synchronized void mo362c(C0698c cVar, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: b */
    public synchronized void mo366b(C0698c cVar, String str) {
    }

    /* renamed from: i */
    public void m357i() {
        AbstractC0789l.m651u();
        this.f5858j.m20g();
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: d */
    public void mo361d() {
        AbstractC0043a.m4269a().m4251n();
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0663ac
    /* renamed from: a */
    public void mo374a(C0674ae aeVar) {
        AbstractC0043a.m4269a().m4266a(aeVar);
    }
}

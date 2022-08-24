package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.p003os.Looper;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1057n;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0664av;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0632f;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0830ac;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p041i.Connection;
import com.corrodinggames.rts.gameFramework.p044l.C1026x;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1081aj;
import com.corrodinggames.rts.gameFramework.utility.C1100l;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.p051b.C1153a;
import com.corrodinggames.rts.java.p052c.C1157b;
import com.corrodinggames.rts.java.p053d.C1171a;
import com.corrodinggames.rts.p008a.RunnableC0069a;
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
public class Main extends C0830ac {

    /* renamed from: a */
    public static boolean f6964a = false;

    /* renamed from: b */
    public static boolean f6965b = true;

    /* renamed from: c */
    public static String WindowsTitleName = "Rusted Warfare";

    /* renamed from: d */
    public C1170d f6967d;

    /* renamed from: h */
    public C0831ad f6968h;

    /* renamed from: i */
    C1153a f6969i;

    /* renamed from: j */
    public C1191u f6970j;

    /* renamed from: k */
    C1152b f6971k;

    /* renamed from: l */
    String[] f6972l;

    /* renamed from: m */
    static Main f6973m;

    /* renamed from: n */
    int f6974n;

    /* renamed from: p */
    C1171a f6975p;

    /* renamed from: r */
    Thread f6976r;

    /* renamed from: u */
    public boolean f6977u;

    /* renamed from: v */
    public int f6978v;

    /* renamed from: e */
    public String buildNumber = "#28";

    /* renamed from: f */
    C1081aj f6980f = new C1081aj();

    /* renamed from: g */
    boolean f6981g = true;

    /* renamed from: o */
    long startInitTime = System.nanoTime();

    /* renamed from: q */
    AbstractC1057n f6983q = new C1177i(this);

    /* renamed from: s */
    boolean f6984s = true;

    /* renamed from: t */
    Object f6985t = new Object();

    public static void main(String[] strArr) {
        f6973m = new Main();
        f6973m.m431a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.f6973m.m423f();
            }
        };
    }

    /* renamed from: a */
    public static void printLog(String str) {
        GameEngine.PrintLog(str);
    }

    /* renamed from: f */
    public void m423f() {
        C1100l c1100l = new C1100l(new InputStreamReader(System.in));
        while (this.f6981g) {
            try {
                String m564a = c1100l.m564a();
                if (m564a == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m434a((Connection) null, "ADMIN", m564a, true);
                }
            } catch (IOException e2) {
                if (this.f6974n < 3) {
                    GameEngine.PrintLog("Error while reading stdin: " + e2.toString());
                    this.f6974n++;
                    if (this.f6974n == 3) {
                        GameEngine.PrintLog("Too many stdin errors, ignoring");
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
    public void m422g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m1162ap();
                Looper.m7139a();
                semaphore.release(1);
                Looper.m7136c();
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
    public synchronized void m431a(String[] strArr) {
        float f;
        float f2;
        this.f6972l = strArr;
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
        GameEngine.PrintLog("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    printLog("connect lobby:" + lowerCase);
                    GameEngine.f6099aK = lowerCase;
                    str = null;
                } else if (str.equals("-width")) {
                    num = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else if (str.equals("-height")) {
                    num2 = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else {
                    printLog("Unknown two_part_arg: " + str);
                    str = null;
                }
            } else if (lowerCase.equals("-debug")) {
                i++;
                if (i >= strArr.length) {
                    printLog("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = strArr[i];
                RunnableC0069a.m7024a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= strArr.length) {
                    printLog("-debugscript requires parameters");
                    System.exit(1);
                }
                RunnableC0069a.m7023a(strArr[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= strArr.length) {
                    printLog("-log requires parameters");
                    System.exit(1);
                }
                String str4 = strArr[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    GameEngine.PrintLog("File logging started");
                } catch (FileNotFoundException e) {
                    GameEngine.m1193a("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (!lowerCase.equals("-nologfile")) {
                if (lowerCase.equals("-lang")) {
                    i++;
                    if (i >= strArr.length) {
                        printLog("-lang requires parameters");
                        System.exit(1);
                    }
                    C0820a.f5394d = strArr[i];
                } else if (lowerCase.equals("-logcolor")) {
                    GameEngine.f6086ax = true;
                } else if (lowerCase.equals("-nodisplay")) {
                    z = true;
                } else if (lowerCase.equals("-canvasgl")) {
                    GameEngine.f6092aD = true;
                } else if (lowerCase.equals("-replay_debug")) {
                    GameEngine.f6085aw = true;
                } else if (lowerCase.equals("-nopreferipv4")) {
                    z4 = true;
                } else if (lowerCase.equals("-noresources")) {
                    GameEngine.f6090aB = true;
                } else if (lowerCase.equals("-nosound")) {
                    z2 = true;
                } else if (lowerCase.equals("-nomusic")) {
                    z3 = true;
                } else if (lowerCase.equals("-safemode")) {
                    GameEngine.f6103aO = true;
                } else if (lowerCase.equals("-extrasafemode")) {
                    GameEngine.f6104aP = true;
                } else if (lowerCase.equals("-disable_vbos")) {
                    z7 = true;
                } else if (lowerCase.equals("-disable_atlas")) {
                    GameEngine.f6091aC = true;
                } else if (lowerCase.equals("-force_vbos")) {
                    z8 = true;
                } else if (lowerCase.equals("-allowsoftwarerender")) {
                    z5 = true;
                } else if (lowerCase.equals("-fullscreen")) {
                    z6 = true;
                } else if (lowerCase.equals("-nobackground")) {
                    GameEngine.noBackground = true;
                } else if (lowerCase.equals("-nomods")) {
                    GameEngine.f6098aJ = true;
                } else if (lowerCase.equals("-printunits")) {
                    GameEngine.f6093aE = true;
                } else if (lowerCase.equals("-outputunitimages")) {
                    GameEngine.f6094aF = true;
                } else if (lowerCase.equals("-oldreplays")) {
                    GameEngine.f6095aG = true;
                } else if (lowerCase.equals("-teamshaders")) {
                    GameEngine.f6102aN = true;
                } else if (lowerCase.equals("-noteamshaders")) {
                    GameEngine.f6102aN = false;
                } else if (lowerCase.equals("-devdebug")) {
                    i++;
                    if (i >= strArr.length) {
                        printLog("-debugscript requires parameters");
                        System.exit(1);
                    }
                    GameEngine.f6105aQ = strArr[i];
                } else if (lowerCase.equals("-postprocessing")) {
                    GameEngine.f6101aM = true;
                } else if (lowerCase.equals("-nopostprocessing")) {
                    GameEngine.f6101aM = false;
                } else if (lowerCase.equals("-disabletextureread")) {
                    C1189s.f7257F = false;
                } else if (lowerCase.equals("-sandbox")) {
                    GameEngine.f6097aI = true;
                } else if (lowerCase.equals("-steam")) {
                    GameEngine.f6096aH = true;
                } else if (lowerCase.equals("-width") || lowerCase.equals("-height")) {
                    str = lowerCase;
                } else if (lowerCase.startsWith("+")) {
                    if (lowerCase.equals("+connect_lobby")) {
                        str = lowerCase;
                    } else {
                        printLog("Unknown steam option: " + lowerCase);
                    }
                } else if (lowerCase.trim().length() != 0) {
                    printLog("Unknown option: " + lowerCase);
                    str2 = "Unknown option: " + lowerCase;
                }
            }
            i++;
        }
        GameEngine.PrintLog("Game arguments:");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            printLog("arg: " + strArr[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (GameEngine.f6096aH) {
                printLog("Unknown options but running anyway due to being in steam");
            } else {
                printLog("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        GameEngine.f6109aU = true;
        GameEngine.m1162ap();
        String property = System.getProperty("os.name");
        GameEngine.PrintLog("OS name: " + property);
        GameEngine.PrintLog("OS version: " + System.getProperty("os.version"));
        GameEngine.PrintLog("LWJGL version: " + Sys.getVersion());
        GameEngine.PrintLog("Build Number: " + this.buildNumber);
        GameEngine.PrintLog("Game Version: 1.15p9");
        GameEngine.PrintLog("Game Code: 172");
        C0191i.f1217b = Sys.is64Bit();
        GameEngine.PrintLog("Is 64bit: " + C0191i.f1217b);
        GameEngine.PrintLog("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        GameEngine.PrintLog("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        GameEngine.PrintLog("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            C0191i.f1218c = true;
        }
        if (z4) {
            GameEngine.PrintLog("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (GameEngine.f6096aH) {
            C1058a.f6727a = new C1157b();
            GameEngine.PrintLog("Early steam init");
            C1058a.m786a().m782b();
            GameEngine.PrintLog("Early steam init done.");
        } else {
            GameEngine.PrintLog("steam not requested");
        }
        m422g();
        String str5 = WindowsTitleName;
        if (z) {
            str5 = VariableScope.nullOrMissingString;
        }
        Input.disableControllers();
        if (f6964a) {
            Renderer.setRenderer(2);
        }
        if (!z8 && C0191i.f1218c) {
            GameEngine.PrintLog("Disabling vbo on mac (without force option)");
            z7 = true;
        }
        if (z7) {
            GameEngine.PrintLog("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                GameEngine.PrintLog("Failed to disable VBOs, wrong class");
            }
        }
        C1173e.m159c();
        this.f6970j = new C1191u(str5);
        this.f6970j.f7272b = this;
        this.f6970j.f7279i = z;
        this.f6970j.f7280j = z2;
        this.f6970j.f7281k = z3;
        if (z) {
            GameEngine.m1193a("Skipping display mode call");
            f = 800.0f;
            f2 = 600.0f;
        } else {
            try {
                DisplayMode displayMode = Display.getDisplayMode();
                f = displayMode.getHeight();
                f2 = displayMode.getWidth();
            } catch (Exception e2) {
                GameEngine.m1193a("Failed to get display mode, defaulting to min size");
                e2.printStackTrace();
                f = 800.0f;
                f2 = 600.0f;
            }
        }
        GameEngine.PrintLog("screenHeight:" + f);
        GameEngine.PrintLog("screenWidth:" + f2);
        int i3 = 1000;
        int i4 = 733;
        if (f > 800.0f) {
            i3 = 1000;
            i4 = 800;
        }
        if (f > 900.0f) {
            i3 = 1600;
            i4 = 900;
        }
        if (z) {
            i3 = 10;
            i4 = 10;
        }
        if (num != null) {
            GameEngine.PrintLog("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            GameEngine.PrintLog("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (z5) {
            GameEngine.PrintLog("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.f6970j.f7282l = false;
        boolean z9 = z6;
        try {
            if (this.f6970j.f7282l) {
                this.f6970j.m44a(i3 * 2, i4 * 2);
                this.f6971k = new C1152b(new ScalableGame(this.f6970j, i3, i4), i3, i4, z9);
            } else {
                this.f6971k = new C1152b(this.f6970j, i3, i4, z9);
            }
            this.f6970j.f7273c = this.f6971k;
            Display.setResizable(true);
            this.f6976r = new Thread(new RunnableC1180j(this));
            this.f6976r.setDaemon(false);
            this.f6976r.start();
        } catch (SlickException e3) {
            throw new RuntimeException((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void m427b(String str) {
        this.f6983q.mo791a(str, true);
    }

    /* renamed from: h */
    public synchronized void m421h() {
        m427b("displayModes");
        m427b("starting controllers");
        this.startInitTime = System.nanoTime();
        GameEngine.f6109aU = true;
        GameEngine.f6116bb = true;
        if (!GameEngine.f6090aB) {
            if (GameEngine.f6092aD) {
                GameEngine.f6112aX = true;
                GameEngine.f6111aW = true;
                GameEngine.f6121bg = C1026x.class;
            } else {
                GameEngine.f6112aX = true;
                GameEngine.f6111aW = true;
                GameEngine.f6121bg = C1173e.class;
            }
        }
        if (this.f6970j != null && !this.f6970j.f7280j) {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            GameEngine.PrintLog("openALAudio hasDevice:" + openALAudio.hasDevice());
            AudioEngine.f4032c = new C1185o(openALAudio);
            if (this.f6970j.f7281k) {
                GameEngine.PrintLog("Music disabled");
                C0648am.f4183a = new C0664av();
            } else {
                C0648am.f4183a = new C1182l(openALAudio);
            }
        } else {
            GameEngine.m1145b("Disabling sound with NullSoundFactory");
            AudioEngine.f4032c = new C0632f();
            C0648am.f4183a = new C0664av();
        }
        C0879n.f5870d = new C1181k();
        C0638ac.f4078b = new C1193v();
        long m2612a = C0727bl.m2612a();
        m427b("loading libRocket");
        GameEngine.PrintLog("start libRocket setup");
        this.f6967d = new C1170d();
        this.f6969i = C1153a.m301o();
        this.f6969i.f7079e = this;
        this.f6975p = new C1171a();
        this.f6969i.m7073a(this.f6975p, this.f6967d);
        this.f6975p.debug = false;
        this.f6975p.setup();
        m427b("libRocket - fonts");
        this.f6975p.loadFont("font/Delicious-Roman.otf");
        this.f6975p.loadFont("font/Delicious-Italic.otf");
        this.f6975p.loadFont("font/Delicious-Bold.otf");
        this.f6975p.loadFont("font/Delicious-BoldItalic.otf");
        this.f6975p.loadFont("font/Roboto-Regular.ttf");
        this.f6975p.loadFont("font/Roboto-Bold.ttf");
        GameEngine.PrintLog("NotoSansCJKsc start");
        this.f6975p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.f6975p.loadFont("font/DroidSansFallback.ttf", "fallback");
        GameEngine.PrintLog("NotoSansCJKsc end");
        this.f6969i.m7066c();
        GameEngine.PrintLog("end libRocket setup");
        m427b("GuiEngine");
        C0727bl.m2607a("libRocket setup took:", m2612a);
        GameEngine.f6243dy = this.buildNumber;
        ServerContext serverContext = new ServerContext();
        m427b("GameEngine");
        GameEngine.f6176cj = new Point(this.f6970j.f7271a.getWidth(), this.f6970j.f7271a.getHeight());
        GameEngine m1199a = GameEngine.m1199a(serverContext, this.f6983q);
        m427b("GameEngine ready");
        GameEngine.PrintLog("version: " + m1199a.m1099t() + " " + m1199a.m1135c(false) + ":" + this.buildNumber);
        this.f6969i.m7069b();
        RunnableC0069a.m7022b();
        this.f6968h = m1199a.networkEngine;
        m1199a.f6157bQ.showZoomButton = false;
        m1199a.f6157bQ.showUnitGroups = false;
        this.f6970j.m41a(this.f6967d);
        this.f6970j.m44a(1000, 800);
        long nanoTime = System.nanoTime();
        GameEngine.PrintLog("-----------------------------");
        GameEngine.PrintLog("----- Game init finished in:" + ((nanoTime - this.startInitTime) / 1000000.0d) + " ms");
        m1199a.networkEngine.f5556d = this;
        m1199a.networkEngine.f5481y = "unset";
        if (!GameEngine.noBackground) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public void mo430b() {
        this.f6980f.m595a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                GameEngine gameEngine = GameEngine.getInstance();
                GameEngine.PrintLog("got startGameEvent..");
                ActivityC0122n.m6899r();
                if (!gameEngine.f6152bL.f802W) {
                    GameEngine.PrintLog("Not starting multiplayer game because map failed to load");
                    gameEngine.networkEngine.m1723af();
                    return;
                }
                gameEngine.networkEngine.f5537bt = true;
                gameEngine.f6148bH = false;
                gameEngine.f6079aq = false;
                Main.this.f6969i.m7065c(false);
                AbstractC0043a.m7075a().m7063e();
                Main.this.f6975p.getActiveDocument();
                if (Main.this.f6975p.f365c != null) {
                    Main.this.f6975p.f365c.getRoot().resumeNonMenu();
                    return;
                }
                GameEngine.PrintLog("startGameEvent: scriptEngine==null");
                GameEngine.m1216S();
            }
        });
    }

    /* renamed from: a */
    public void m439a(float f) {
        this.f6980f.m596a();
    }

    /* renamed from: a */
    public void m432a(boolean z) {
        this.f6981g = false;
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            gameEngine.networkEngine.m1617u();
        } else {
            gameEngine.networkEngine.m1690b("shutdownServer");
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

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public synchronized boolean mo435a(Connection connection, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public synchronized void mo428b(Connection connection, String str, String str2) {
        m434a(connection, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: c */
    public void mo426c() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getInstance().networkEngine.f5533bm && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public synchronized void mo438a(final int i, final String str, final String str2, final Connection connection) {
        if (this.f6975p != null && this.f6975p.f365c != null) {
            this.f6975p.f365c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.f6975p.f365c.getRoot().receiveChatMessage(i, str, str2, connection);
                }
            });
        } else {
            GameEngine.m1216S();
        }
    }

    /* renamed from: a */
    public synchronized void m434a(Connection connection, String str, String str2, boolean z) {
        if (!z) {
            printLog(str + ": " + str2);
        }
        if (this.f6984s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public String mo436a(Connection connection, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: c */
    public synchronized void mo425c(Connection connection, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public synchronized void mo429b(Connection connection, String str) {
    }

    /* renamed from: i */
    public void m420i() {
        GameEngine.getInstance();
        this.f6970j.m26g();
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: d */
    public void mo424d() {
        AbstractC0043a.m7075a().m7057n();
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public void mo437a(C0841ae c0841ae) {
        AbstractC0043a.m7075a().m7072a(c0841ae);
    }
}

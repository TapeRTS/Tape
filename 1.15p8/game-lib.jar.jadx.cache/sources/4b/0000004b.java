package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.os.Looper;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity;
import com.corrodinggames.rts.game.System_Hcat;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0896n;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameAudio.C0599f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.InputController;
import com.corrodinggames.rts.gameFramework.MusicController;
import com.corrodinggames.rts.gameFramework.draw.C0850p;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.musicFactory;
import com.corrodinggames.rts.gameFramework.network.C0750ac;
import com.corrodinggames.rts.gameFramework.network.C0761ae;
import com.corrodinggames.rts.gameFramework.network.C0797n;
import com.corrodinggames.rts.gameFramework.network.Connection;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.C0919aj;
import com.corrodinggames.rts.gameFramework.utility.C0938l;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.p047b.C0991a;
import com.corrodinggames.rts.java.p048c.C0995b;
import com.corrodinggames.rts.java.p049d.C1007a;
import com.corrodinggames.rts.p007a.RunnableC0068a;
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
public class Main extends C0750ac {

    /* renamed from: a */
    public static boolean f6381a = false;

    /* renamed from: b */
    public static boolean f6382b = true;

    /* renamed from: c */
    public static String WindowsTitleName = "Rusted Warfare";

    /* renamed from: d */
    public C1006d f6385d;

    /* renamed from: h */
    public NetworkEngine f6386h;

    /* renamed from: i */
    C0991a f6387i;

    /* renamed from: j */
    public C1027u curGame;

    /* renamed from: k */
    GameWindowDisplay f6389k;

    /* renamed from: l */
    String[] argsArr;

    /* renamed from: m */
    static Main f6384m;

    /* renamed from: n */
    int f6391n;

    /* renamed from: p */
    C1007a f6392p;

    /* renamed from: r */
    Thread f6393r;

    /* renamed from: u */
    public boolean f6394u;

    /* renamed from: v */
    public int f6395v;

    /* renamed from: e */
    public String buildNumber = "#28";

    /* renamed from: f */
    C0919aj f6397f = new C0919aj();

    /* renamed from: g */
    boolean f6398g = true;

    /* renamed from: o */
    long startInitTime = System.nanoTime();

    /* renamed from: q */
    AbstractC0896n f6400q = new C1013i(this);

    /* renamed from: s */
    boolean f6401s = true;

    /* renamed from: t */
    Object f6402t = new Object();

    public static void main(String[] strArr) {
        f6384m = new Main();
        f6384m.m393a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.f6384m.m385f();
            }
        };
    }

    /* renamed from: a */
    public static void printLog(String str) {
        GameEngine.PrintLOG(str);
    }

    /* renamed from: f */
    public void m385f() {
        C0938l c0938l = new C0938l(new InputStreamReader(System.in));
        while (this.f6398g) {
            try {
                String m525a = c0938l.m525a();
                if (m525a == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m396a((Connection) null, "ADMIN", m525a, true);
                }
            } catch (IOException e2) {
                if (this.f6391n < 3) {
                    GameEngine.PrintLOG("Error while reading stdin: " + e2.toString());
                    this.f6391n++;
                    if (this.f6391n == 3) {
                        GameEngine.PrintLOG("Too many stdin errors, ignoring");
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
    public void m384g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m865am();
                Looper.m4604a();
                semaphore.release(1);
                Looper.m4601c();
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
    public synchronized void m393a(String[] fullScreen) {
        float f;
        float f2;
        this.argsArr = fullScreen;
        boolean allowSoftwareRender = false;
        boolean noPreferIPV4 = false;
        boolean noMusic = false;
        boolean noSound = false;
        boolean noDisplay = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Integer num = null;
        Integer num2 = null;
        GameEngine.PrintLOG("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < fullScreen.length) {
            String lowerCase = fullScreen[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    printLog("connect lobby:" + lowerCase);
                    GameEngine.f5907aM = lowerCase;
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
                if (i >= fullScreen.length) {
                    printLog("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = fullScreen[i];
                RunnableC0068a.m4491a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= fullScreen.length) {
                    printLog("-debugscript requires parameters");
                    System.exit(1);
                }
                RunnableC0068a.m4490a(fullScreen[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= fullScreen.length) {
                    printLog("-log requires parameters");
                    System.exit(1);
                }
                String str4 = fullScreen[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    GameEngine.PrintLOG("File logging started");
                } catch (FileNotFoundException e) {
                    GameEngine.PrintLOG_err("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (!lowerCase.equals("-nologfile")) {
                if (lowerCase.equals("-lang")) {
                    i++;
                    if (i >= fullScreen.length) {
                        printLog("-lang requires parameters");
                        System.exit(1);
                    }
                    LangLocale.f4968d = fullScreen[i];
                } else if (lowerCase.equals("-logcolor")) {
                    GameEngine.f5904az = true;
                } else if (lowerCase.equals("-nodisplay")) {
                    allowSoftwareRender = true;
                } else if (lowerCase.equals("-canvasgl")) { // opengl的平面的绘制器
                    GameEngine.CanvasGL = true;
                } else if (lowerCase.equals("-replay_debug")) {
                    GameEngine.Replay_Debug = true;
                } else if (lowerCase.equals("-nopreferipv4")) {
                    noSound = true;
                } else if (lowerCase.equals("-noresources")) {
                    GameEngine.noResources = true;
                } else if (lowerCase.equals("-nosound")) {
                    noPreferIPV4 = true;
                } else if (lowerCase.equals("-nomusic")) {
                    noMusic = true;
                } else if (lowerCase.equals("-disable_vbos")) {
                    z2 = true;
                } else if (lowerCase.equals("-disable_atlas")) {
                    GameEngine.disable_atlas = true;
                } else if (lowerCase.equals("-force_vbos")) {
                    z3 = true;
                } else if (lowerCase.equals("-allowsoftwarerender")) {
                    noDisplay = true;
                } else if (lowerCase.equals("-fullscreen")) {
                    z = true;
                } else if (lowerCase.equals("-nobackground")) {
                    GameEngine.noBackground = true;
                } else if (lowerCase.equals("-nomods")) {
                    GameEngine.noMods = true;
                } else if (lowerCase.equals("-printunits")) {
                    GameEngine.printUnits = true;
                } else if (lowerCase.equals("-outputunitimages")) {
                    GameEngine.outputUnitImages = true;
                } else if (lowerCase.equals("-oldreplays")) {
                    GameEngine.oldReplays = true;
                } else if (lowerCase.equals("-teamshaders")) {
                    GameEngine.teamShaders = true;
                } else if (lowerCase.equals("-noteamshaders")) {
                    GameEngine.teamShaders = false;
                } else if (lowerCase.equals("-devdebug")) {
                    i++;
                    if (i >= fullScreen.length) {
                        printLog("-debugscript requires parameters");
                        System.exit(1);
                    }
                    GameEngine.f5911aQ = fullScreen[i];
                } else if (lowerCase.equals("-postprocessing")) {
                    GameEngine.postprocessing = true;
                } else if (lowerCase.equals("-nopostprocessing")) {
                    GameEngine.postprocessing = false;
                } else if (lowerCase.equals("-disabletextureread")) {
                    C1025s.disabletextureread = false;
                } else if (lowerCase.equals("-sandbox")) {
                    GameEngine.sandbox = true;
                } else if (lowerCase.equals("-steam")) {
                    GameEngine.steam = true;
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
        GameEngine.PrintLOG("Game arguments:");
        for (int i2 = 0; i2 < fullScreen.length; i2++) {
            printLog("arg: " + fullScreen[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (GameEngine.steam) {
                printLog("Unknown options but running anyway due to being in steam");
            } else {
                printLog("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        GameEngine.isDedicatedServer = true;
        GameEngine.m865am();
        String property = System.getProperty("os.name");
        GameEngine.PrintLOG("OS name: " + property);
        GameEngine.PrintLOG("OS version: " + System.getProperty("os.version"));
        GameEngine.PrintLOG("LWJGL version: " + Sys.getVersion());
        GameEngine.PrintLOG("Build Number: " + this.buildNumber);
        GameEngine.PrintLOG("Game Version: 1.15p8");
        GameEngine.PrintLOG("Game Code: 170");
        System_Hcat.is64Bit = Sys.is64Bit();
        GameEngine.PrintLOG("Is 64bit: " + System_Hcat.is64Bit);
        GameEngine.PrintLOG("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        GameEngine.PrintLOG("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        GameEngine.PrintLOG("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            System_Hcat.isMacOS = true;
        }
        if (noSound) {
            GameEngine.PrintLOG("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (GameEngine.steam) {
            SteamEngine.f6144a = new C0995b();
            GameEngine.PrintLOG("Early steam init");
            SteamEngine.m718a().mo276b();
            GameEngine.PrintLOG("Early steam init done.");
        } else {
            GameEngine.PrintLOG("steam not requested");
        }
        m384g();
        String str5 = WindowsTitleName;
        if (allowSoftwareRender) {
            str5 = VariableScope.nullOrMissingString;
        }
        Input.disableControllers();
        if (f6381a) {
            Renderer.setRenderer(2);
        }
        if (!z3 && System_Hcat.isMacOS) {
            GameEngine.PrintLOG("Disabling vbo on mac (without force option)");
            z2 = true;
        }
        if (z2) {
            GameEngine.PrintLOG("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                GameEngine.PrintLOG("Failed to disable VBOs, wrong class");
            }
        }
        C1009e.m127r();
        this.curGame = new C1027u(str5);
        this.curGame.main = this;
        this.curGame.noDisplay = allowSoftwareRender;
        this.curGame.noSound = noPreferIPV4;
        this.curGame.noMusic = noMusic;
        if (allowSoftwareRender) {
            GameEngine.PrintLOG_err("Skipping display mode call");
            f = 800.0f;
            f2 = 600.0f;
        } else {
            try {
                DisplayMode displayMode = Display.getDisplayMode();
                f = displayMode.getHeight();
                f2 = displayMode.getWidth();
            } catch (Exception e2) {
                GameEngine.PrintLOG_err("Failed to get display mode, defaulting to min size");
                e2.printStackTrace();
                f = 800.0f;
                f2 = 600.0f;
            }
        }
        GameEngine.PrintLOG("screenHeight:" + f);
        GameEngine.PrintLOG("screenWidth:" + f2);
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
        if (allowSoftwareRender) {
            i3 = 10;
            i4 = 10;
        }
        if (num != null) {
            GameEngine.PrintLOG("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            GameEngine.PrintLOG("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (noDisplay) {
            GameEngine.PrintLOG("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.curGame.f6700l = false;
        boolean z4 = z;
        try {
            if (this.curGame.f6700l) {
                this.curGame.m38a(i3 * 2, i4 * 2);
                this.f6389k = new GameWindowDisplay(new ScalableGame(this.curGame, i3, i4), i3, i4, z4);
            } else {
                this.f6389k = new GameWindowDisplay(this.curGame, i3, i4, z4);
            }
            this.curGame.f6684c = this.f6389k;
            Display.setResizable(true);
            this.f6393r = new Thread(new RunnableC1016j(this));
            this.f6393r.setDaemon(false);
            this.f6393r.start();
        } catch (SlickException e3) {
            throw new RuntimeException((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void ShowStartupScrollingText(String str) {
        this.f6400q.mo107a(str, true);
    }

    /* renamed from: h */
    public synchronized void m383h() {
        ShowStartupScrollingText("displayModes");
        ShowStartupScrollingText("starting controllers");
        this.startInitTime = System.nanoTime();
        GameEngine.isDedicatedServer = true;
        GameEngine.f5920bb = true;
        if (!GameEngine.noResources) {
            if (GameEngine.CanvasGL) {
                GameEngine.isJava = true;
                GameEngine.isPC_Device = true;
                GameEngine.f5806bg = C0850p.class;
            } else {
                GameEngine.isJava = true;
                GameEngine.isPC_Device = true;
                GameEngine.f5806bg = C1009e.class;
            }
        }
        if (this.curGame != null && !this.curGame.noSound) {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            GameEngine.PrintLOG("openALAudio hasDevice:" + openALAudio.hasDevice());
            AudioEngine.f3857c = new C1021o(openALAudio);
            if (this.curGame.noMusic) {
                GameEngine.PrintLOG("Music disabled");
                MusicController.f4003a = new musicFactory();
            } else {
                MusicController.f4003a = new C1018l(openALAudio);
            }
        } else {
            GameEngine.log("Disabling sound with NullSoundFactory");
            AudioEngine.f3857c = new C0599f();
            MusicController.f4003a = new musicFactory();
        }
        C0797n.f5424d = new C1017k();
        InputController.f3899b = new C1029v();
        long tookTime = C0651bl.getTookTime();
        ShowStartupScrollingText("loading libRocket");
        GameEngine.PrintLOG("start libRocket setup");
        this.f6385d = new C1006d();
        this.f6387i = C0991a.m283o();
        this.f6387i.f6496e = this;
        this.f6392p = new C1007a();
        this.f6387i.m4538a(this.f6392p, this.f6385d);
        this.f6392p.debug = false;
        this.f6392p.setup();
        ShowStartupScrollingText("libRocket - fonts");
        this.f6392p.loadFont("font/Delicious-Roman.otf");
        this.f6392p.loadFont("font/Delicious-Italic.otf");
        this.f6392p.loadFont("font/Delicious-Bold.otf");
        this.f6392p.loadFont("font/Delicious-BoldItalic.otf");
        this.f6392p.loadFont("font/Roboto-Regular.ttf");
        this.f6392p.loadFont("font/Roboto-Bold.ttf");
        GameEngine.PrintLOG("NotoSansCJKsc start");
        this.f6392p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.f6392p.loadFont("font/DroidSansFallback.ttf", "fallback");
        GameEngine.PrintLOG("NotoSansCJKsc end");
        this.f6387i.m4531c();
        GameEngine.PrintLOG("end libRocket setup");
        ShowStartupScrollingText("GuiEngine");
        C0651bl.m2274a("libRocket setup took:", tookTime);
        GameEngine.BuildVersionRELEASE = this.buildNumber;
        ServerContext serverContext = new ServerContext();
        ShowStartupScrollingText("GameEngine");
        GameEngine.f5808cj = new Point(this.curGame.f6682a.getWidth(), this.curGame.f6682a.getHeight());
        GameEngine m894a = GameEngine.m894a(serverContext, this.f6400q);
        ShowStartupScrollingText("GameEngine ready");
        GameEngine.PrintLOG("version: " + m894a.curBuildVersion() + " " + m894a.gameVersionInternal(false) + ":" + this.buildNumber);
        this.f6387i.showMainMenu();
        RunnableC0068a.m4489b();
        this.f6386h = m894a.networkEngine;
        m894a.curSettings.showZoomButton = false;
        m894a.curSettings.showUnitGroups = false;
        this.curGame.m35a(this.f6385d);
        this.curGame.m38a(1000, 800);
        long nanoTime = System.nanoTime();
        GameEngine.PrintLOG("-----------------------------");
        GameEngine.PrintLOG("----- Game init finished in:" + ((nanoTime - this.startInitTime) / 1000000.0d) + " ms");
        m894a.networkEngine.f5117d = this;
        m894a.networkEngine.f5110y = "unset";
        if (!GameEngine.noBackground) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: b */
    public void mo392b() {
        this.f6397f.m556a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                GameEngine gameEngine = GameEngine.getInstance();
                GameEngine.PrintLOG("got startGameEvent..");
                MultiplayerBattleroomActivity.m4393p();
                if (!gameEngine.map.f776S) {
                    GameEngine.PrintLOG("Not starting multiplayer game because map failed to load");
                    gameEngine.networkEngine.m1457ab();
                    return;
                }
                gameEngine.networkEngine.f5093bp = true;
                gameEngine.f5951bH = false;
                gameEngine.f5818as = false;
                Main.this.f6387i.m4530c(false);
                com.corrodinggames.librocket.Main.m4540a().resumeGame();
                Main.this.f6392p.getActiveDocument();
                if (Main.this.f6392p.f362c != null) {
                    Main.this.f6392p.f362c.getRoot().resumeNonMenu();
                    return;
                }
                GameEngine.PrintLOG("startGameEvent: scriptEngine==null");
                GameEngine.m914P();
            }
        });
    }

    /* renamed from: a */
    public void m401a(float f) {
        this.f6397f.m557a();
    }

    /* renamed from: a */
    public void m394a(boolean z) {
        this.f6398g = false;
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            gameEngine.networkEngine.m1357r();
        } else {
            gameEngine.networkEngine.disconnect("shutdownServer");
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

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: a */
    public synchronized boolean mo397a(Connection connection, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: b */
    public synchronized void mo390b(Connection connection, String str, String str2) {
        m396a(connection, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: c */
    public void mo388c() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getInstance().networkEngine.gameHasStarted && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: a */
    public synchronized void mo400a(final int i, final String str, final String str2, final Connection connection) {
        if (this.f6392p != null && this.f6392p.f362c != null) {
            this.f6392p.f362c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.f6392p.f362c.getRoot().receiveChatMessage(i, str, str2, connection);
                }
            });
        } else {
            GameEngine.m914P();
        }
    }

    /* renamed from: a */
    public synchronized void m396a(Connection connection, String str, String str2, boolean z) {
        if (!z) {
            printLog(str + ": " + str2);
        }
        if (this.f6401s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: a */
    public String mo398a(Connection connection, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: c */
    public synchronized void mo387c(Connection connection, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: b */
    public synchronized void mo391b(Connection connection, String str) {
    }

    /* renamed from: i */
    public void m382i() {
        GameEngine.getInstance();
        this.curGame.m20g();
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: d */
    public void mo386d() {
        com.corrodinggames.librocket.Main.m4540a().m4522n();
    }

    @Override // com.corrodinggames.rts.gameFramework.network.C0750ac
    /* renamed from: a */
    public void mo399a(C0761ae c0761ae) {
        com.corrodinggames.librocket.Main.m4540a().m4537a(c0761ae);
    }
}